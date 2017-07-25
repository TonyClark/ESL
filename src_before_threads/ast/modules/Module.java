package ast.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;

import ast.AST;
import ast.TreeNode;
import ast.actors.Act;
import ast.actors.Export;
import ast.actors.ExportedName;
import ast.actors.Import;
import ast.actors.Imports;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Fun;
import ast.data.Record;
import ast.spec.BRule;
import ast.spec.Spec;
import ast.spec.State;
import ast.spec.StateDef;
import ast.spec.VarDec;
import ast.types.MessageType;
import ast.types.Type;
import ast.types.TypeError;
import edb.type.TypeDiagram;
import env.Empty;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Term;
import values.JavaObject;
import values.Located;
import values.LocationContainer;
import xpl.Interpreter;

@BoaConstructor(fields = { "name", "exports", "imports", "params", "state", "defs" })

public class Module implements TreeNode, LocationContainer, DecContainer {

  // A module is a file of definitions. It provides a reusable collection of
  // named values. A module exports a sub-set of the names it defines. A module imports a
  // collection of other modules. Dependencies between modules can be circular, so a global
  // table of modules is maintained...

  static Hashtable<String, Module> MODULES = new Hashtable<String, Module>();

  private static Binding[] allBindings() {
    Binding[] bindings = new Binding[MODULES.keySet().size()];
    int i = 0;
    for (String name : MODULES.keySet()) {
      bindings[i++] = MODULES.get(name).asBinding();
    }
    return bindings;
  }

  public static Hashtable<String, Module> getMODULES() {
    return MODULES;
  }

  public static Module importModule(String path) throws FileNotFoundException {

    // Import the module and resolve it. If it is already loaded
    // then just return it...

    if (MODULES.containsKey(path) && !MODULES.get(path).isOutOfDate())
      return MODULES.get(path);
    else {
      // Create a shell so that it will not be recursively loaded...
      if (new File(path).exists()) {
        JavaObject o = (JavaObject) Interpreter.readFile("xpl/esl.xpl", "esl", path, "file", new exp.Str(path));
        Module module = (Module) o.getTarget();
        return processModule(path, module);
      } else throw new FileNotFoundException("cannot import " + path);
    }
  }

  public static Module processModule(String path, Module module) throws FileNotFoundException {

    // Sets a shell module in the table to short circuit recursive imports. The
    // shell is then populated and some basic processing is performed on the
    // module...

    Module shell = new Module();
    MODULES.put(path, shell);
    shell.name = module.name;
    shell.imports = module.imports;
    shell.exports = module.exports;
    shell.defs = module.defs;
    shell.params = module.params;
    shell.state = module.state;
    shell.configName = module.configName;
    shell.resolve();
    shell.setPath(path);
    shell.setDefs();
    return shell;
  }

  public static void reset() {
    MODULES.clear();
  }

  String                           path;
  long                             createTime = System.currentTimeMillis();

  public String                    name;
  public Imports                   imports;
  public Export                    exports;
  public Parameters                params;
  public State                     state;
  public Binding[]                 defs;
  String                           configName;

  public Hashtable<String, Module> imported   = new Hashtable<String, Module>();

  private String actBindingName(Binding b) {
    Fun fun = (Fun) b.getValue();
    Act act = (Act) fun.getBody();
    if (act.getName() instanceof ast.data.Str) {
      ast.data.Str name = (ast.data.Str) act.getName();
      return name.getValue();
    } else return "anon";
  }

  private String actBindingTypeName(Binding b) {
    Fun fun = (Fun) b.getValue();
    if (fun.getDeclaredType() instanceof ast.types.Fun) {
      ast.types.Fun funType = (ast.types.Fun) fun.getDeclaredType();
      return funType.getRange().toString();
    } else return "anon";
  }

  private String addStars(Type type, String name) {
    if (type instanceof ast.types.List) {
      ast.types.List list = (ast.types.List) type;
      name = "*" + name;
      return addStars(list.getType(), name);
    } else return name;
  }

  private Binding asBinding() {

    // Returns the module as a single binding whose name is the path and whose
    // value is a record containing all the exported values in the module...

    ast.types.Field[] fields = new ast.types.Field[exports.getNames().length - exportedTypeNames().length];
    Env<String, Type> env = new Empty<String, Type>();
    env = Binding.typeBindingsRec(typeBindings(), env);
    int fieldIndex = 0;
    for (int i = 0; i < exports.getNames().length; i++) {
      String name = exports.getNames()[i].getName();
      Binding binding = getBinding(name);
      if (!binding.isTypeBinding()) {
        if (binding == null) throw new Error("cannot find exported definition: " + name);
        Type type = binding.getDeclaredType();
        fields[fieldIndex++] = new ast.types.Field(binding.getLineStart(), binding.getLineEnd(), name, type);
      }
    }
    ast.types.Record recordType = new ast.types.Record(-1, -1, fields);
    return new Binding(-1, -1, path, name, recordType, new Letrec(1, 1, getBindings(), getExportedRecord()));
  }

  public void configure(String name) {

    // Allow the empty name which means that e use the default configuration
    // or else we don;t care because there are no parameters...

    if (name.equals(""))
      configName = "";
    else if (params.hasConfiguration(name))
      configName = name;
    else throw new Error("no configuration named: " + name);
  }

  private Type deStar(Type type) {
    if (type instanceof ast.types.List) {
      ast.types.List list = (ast.types.List) type;
      return deStar(list.getType());
    } else return type;
  }

  public AST desugar() {

    // Create a record for each of the modules in the system:
    // letrec
    // M1 = letrec
    // n1 = e1[Mj.n/n]; // for each name exported by each module imported by M1
    // ...
    // nk = ek[Mj.n/n]
    // in rec{n1=n1;...} // just the exported names.
    // ...
    // in M

    Binding[] bindings = allBindings();

    return new Letrec(1, 1, bindings, new Var(1, 1, name, null));
  }

  public String[] exportedTypeNames() {
    int exportedTypes = 0;
    for (String name : getExports().getStrings()) {
      if (namesTypeBinding(name)) exportedTypes++;
    }
    String[] names = new String[exportedTypes];
    exportedTypes = 0;
    for (String name : getExports().getStrings()) {
      if (namesTypeBinding(name)) names[exportedTypes++] = name;
    }
    return names;
  }

  private Binding getBinding(String name) {
    for (Binding b : getDefs())
      if (b.getName().equals(name)) return b;
    return null;
  }

  private Binding[] getBindings() {

    // Return the bindings for all the definitions that are scoped over the
    // module. This includes the value and type definitions. The exported types
    // are shared with the exporting modules...

    Binding[] typeBindings = getExportedTypeBindings(imported.values());
    Binding[] valueBindings = new Binding[getDefs().length];
    for (int i = 0; i < getDefs().length; i++)
      valueBindings[i] = getDefs()[i].substExportedValues(imported.values());
    return AST.concatenate(typeBindings, valueBindings);
  }

  public TreeNode[] getChildren() {
    return getDefs();
  }

  public DeclaringLocation[] getContainedDecs() {
    return getDefs();
  }

  public Binding[] getDefs() {

    // The definitions defined by a module are those listed in the body and those
    // defined by the parameters. Use the named configuration or the first if the
    // named is "" ...

    Binding[] paramDefs = params.getDefs(configName);
    Binding[] allDefs = new Binding[defs.length + paramDefs.length];

    for (int i = 0; i < paramDefs.length; i++)
      allDefs[i] = paramDefs[i];
    for (int i = paramDefs.length; i < defs.length + paramDefs.length; i++)
      allDefs[i] = defs[i - paramDefs.length];

    return allDefs;
  }

  private AST getExportedRecord() {

    // A module is represented as a record whose fields correspond to the
    // exported value bindings...

    Binding[] fields = new Binding[exports.getNames().length - exportedTypeNames().length];
    Env<String, Type> env = new Empty<String, Type>();
    env = Binding.typeBindingsRec(typeBindings(), env);
    int fieldIndex = 0;
    for (int i = 0; i < exports.getNames().length; i++) {
      String name = exports.getNames()[i].getName();
      Binding binding = getBinding(name);
      if (!binding.isTypeBinding()) {
        if (binding == null) throw new Error("cannot find exported definition: " + name);
        Type type = binding.getDeclaredType();
        fields[fieldIndex++] = new Binding(-1, -1, path, name, type, new Var(-1, -1, exports.getNames()[i].getName(), null));
      }
    }
    return new Record(-1, -1, fields);
  }

  private Binding[] getExportedTypeBindings(Collection<Module> modules) {
    int exportedTypes = 0;
    for (Module m : modules)
      exportedTypes += m.exportedTypeNames().length;
    Binding[] typeBindings = new Binding[exportedTypes];
    exportedTypes = 0;
    for (Module m : modules)
      for (Binding b : m.getDefs())
        if (Arrays.asList(m.exportedTypeNames()).contains(b.getName())) typeBindings[exportedTypes++] = b;
    return typeBindings;
  }

  public Export getExports() {
    return exports;
  }

  public Hashtable<String, Module> getImported() {
    return imported;
  }

  public String getLabel() {
    return "module " + name;
  }

  public Located getLocated(int charIndex) {
    Located located = AST.getLocated(exports, charIndex);
    if (located != null) return located;
    located = AST.getLocated(imports, charIndex);
    if (located != null) return located;
    for (Binding b : getDefs()) {
      located = AST.getLocated(b, charIndex);
      if (located != null) return located;
    }
    return null;
  }

  public String getName() {
    return name;
  }

  public Parameters getParams() {
    return params;
  }

  public String getPath() {
    return path;
  }

  public Term getTypeDiagram() {

    // Return a term representing a type diagram...

    TypeDiagram diagram = new TypeDiagram();
    populateDiagramTypes(diagram);
    populateDiagramBehaviours(diagram);
    populateDiagramLinks(diagram);
    populateDiagramUnions(diagram);
    populateModuleActor(diagram);
    return diagram.asTerm();
  }

  private boolean isActBinding(Binding b) {
    if (b.getValue() instanceof Fun) {
      Fun fun = (Fun) b.getValue();
      if (fun.getBody() instanceof Act) { return true; }
    }
    return false;
  }

  private boolean isOutOfDate() {

    // Returns true when the file containing the source of the module has been
    // modified since the last loading...

    File file = new File(path);
    return file.lastModified() > createTime;
  }

  public boolean namesTypeBinding(String name) {
    for (Binding b : getDefs()) {
      if (b.isTypeBinding() && b.getName().equals(name)) return true;
    }
    return false;
  }

  private void populateAssociationLinks(TypeDiagram diagram) {
    for (Binding b : getDefs()) {
      if (isActBinding(b)) {
        Fun fun = (Fun) b.getValue();
        Act act = (Act) fun.getBody();
        Spec spec = act.getSpec();
        State state = spec.getState();
        for (VarDec v : state.getVars()) {
          Type type = v.getType();
          Type baseType = deStar(type);
          String name = v.getName();
          if (baseType instanceof ast.types.Var && !act.isExported(name)) {
            ast.types.Var var = (ast.types.Var) baseType;
            if (diagram.isTypeName(var.getName())) {
              name = addStars(type, name);
              diagram.addAssociation(actBindingName(b), var.getName(), name);
            }
          }
        }
      }
    }
  }

  private void populateDiagramBehaviours(TypeDiagram diagram) {
    for (Binding b : getDefs()) {
      if (isActBinding(b)) {
        String name = actBindingName(b);
        diagram.addAct(name);
        populateDiagramTypeFields(b, diagram);
        populateDiagramTypeStates(b, diagram);
        populateDiagramMachine(b, diagram);
      }
    }
  }

  private void populateDiagramMachine(Binding b, TypeDiagram diagram) {
    String name = b.getName();
    Fun fun = (Fun) b.getValue();
    Act act = (Act) fun.getBody();
    Spec spec = act.getSpec();
    for (BRule rule : spec.getBehaviour()) {
      diagram.addRule(name, rule);
    }
  }

  private void populateDiagramLinks(TypeDiagram diagram) {
    populateTypeLinks(diagram);
    populateAssociationLinks(diagram);
  }

  private void populateDiagramTypeFields(Binding b, TypeDiagram diagram) {
    String name = b.getName();
    Fun fun = (Fun) b.getValue();
    Act act = (Act) fun.getBody();
    Spec spec = act.getSpec();
    State state = spec.getState();
    for (VarDec v : state.getVars()) {
      Type type = v.getType();
      Type baseType = deStar(type);
      Object value = baseType.defaultValue();
      if (value != null) diagram.addField(name, v.getName(), type, "" + value);
    }
  }

  private void populateDiagramTypes(TypeDiagram diagram) {
    for (Binding typeBinding : typeBindings()) {
      if (typeBinding.getValue() instanceof ast.types.Act) {
        ast.types.Act act = (ast.types.Act) typeBinding.getValue();
        String name = typeBinding.getName();
        diagram.addType(name);
        for (Dec dec : act.getDecs()) {
          Type type = dec.getDeclaredType();
          Type baseType = deStar(type);
          if (baseType.isSimpleType() || baseType instanceof ast.types.Fun) {
            diagram.addDeclaredField(name, dec.getName(), type);
          } else {
            String aName = dec.getName();
            aName = addStars(type, aName);
            diagram.addAssociation(name, baseType.toString(), aName);
          }
        }
        for (MessageType h : act.getHandlers()) {
          diagram.addDeclaredHandler(name, h.getTypes()[0]);
        }
      }
    }
  }

  private void populateDiagramTypeStates(Binding b, TypeDiagram diagram) {
    String name = b.getName();
    Fun fun = (Fun) b.getValue();
    Act act = (Act) fun.getBody();
    Spec spec = act.getSpec();
    State state = spec.getState();
    for (StateDef def : state.getStates()) {
      diagram.addState(name, def);
    }

  }

  private void populateDiagramUnions(TypeDiagram diagram) {
    for (Binding typeBinding : typeBindings()) {
      if (typeBinding.getValue() instanceof ast.types.Union) {
        ast.types.Union union = (ast.types.Union) typeBinding.getValue();
        String name = typeBinding.getName();
        diagram.addUnion(name, union.getTerms());
      }
    }
  }

  private void populateModuleActor(TypeDiagram diagram) {
    diagram.addAct(name);
    for (VarDec v : state.getVars()) {
      String n = v.getName();
      Type type = v.getType();
      Type basicType = deStar(type);
      if (basicType.isSimpleType() || (basicType instanceof ast.types.Fun)) {
        diagram.addField(name, n, type, type.defaultValue() + "");
      } else {
        if (basicType instanceof ast.types.Var) {
          ast.types.Var var = (ast.types.Var) basicType;
          diagram.addAssociation(name, var.getName(), addStars(type, n));
        }
      }
    }
  }

  private void populateTypeLinks(TypeDiagram diagram) {
    for (Binding b : getDefs()) {
      if (isActBinding(b)) {
        String sourceName = actBindingName(b);
        String targetName = actBindingTypeName(b);
        diagram.addType(sourceName, targetName);
      }
    }
  }

  public Binding ref(String name) {
    for (Binding b : getDefs())
      if (b.getName().equals(name)) return b;
    return null;
  }

  public Module resolve() throws FileNotFoundException {

    // Recursively load the modules...

    for (Import importedModule : imports.getImports()) {
      Module module = importModule(importedModule.getName());
      imported.put(importedModule.getName(), module);
      importedModule.setModule(module);
    }
    return this;
  }

  private void setDefs() {

    // Set value and type variables to point to their establishing
    // definitions...

    Env<String, DeclaringLocation> env = new Empty<String, DeclaringLocation>();
    for (Dec d : getDefs()) {
      env = env.bind(d.getName(), d);
    }
    AST.setDefs(exports, env);
    env = AST.addDecs(imports, env);
    for (Dec d : getDefs()) {
      AST.setDefs(d, env);
    }
  }

  public void setPath(String path) {
    this.path = path;
    for (Binding b : getDefs())
      b.setPath(path);
  }

  public String toString() {
    return "Module(" + name + "," + exports + "," + imports + ")";
  }

  public void type(Env<String, Type> env) throws FileNotFoundException {

    // Perform type checking on the module. The type environment for
    // checking the module is constructed from the exported values and
    // types from imported modules...

    Env<String, Type> e = env;
    resolve();
    for (ExportedName n : exports.getNames()) {
      if (getBinding(n.getName()) == null) throw new TypeError(exports.getLineStart(), exports.getLineEnd(), "cannot find binding for exported name: " + n.getName());
    }
    for (String name : imported.keySet()) {
      imported.get(name).type(e);
      for (String exported : imported.get(name).getExports().getStrings()) {
        Binding binding = imported.get(name).ref(exported);
        if (binding.isTypeBinding())
          env = env.bind(exported, binding.getDeclaredType());
        else env = env.bind(exported, binding.getType());
      }
    }
    params.check();
    params.type(env, typeBindings());
    Binding.typeBindingsRec(getDefs(), env);
  }

  public Binding[] typeBindings() {
    // Just return those bindings that define types...
    int tb = 0;
    for (Binding b : getDefs())
      if (b.isTypeBinding()) tb++;
    Binding[] typeBindings = new Binding[tb];
    int i = 0;
    for (Binding b : getDefs())
      if (b.isTypeBinding()) typeBindings[i++] = b;
    return typeBindings;
  }

  public Binding[] valueBindings() {
    // Just return those bindings that define values (e.g. not types)...
    int vb = 0;
    for (Binding b : getDefs())
      if (b.isValueBinding()) vb++;
    Binding[] valueBindings = new Binding[vb];
    int i = 0;
    for (Binding b : getDefs())
      if (b.isValueBinding()) valueBindings[i++] = b;
    return valueBindings;
  }

}
