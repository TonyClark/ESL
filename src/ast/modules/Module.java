package ast.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;

import ast.AST;
import ast.TreeNode;
import ast.actors.Export;
import ast.actors.Import;
import ast.actors.Imports;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Record;
import ast.types.Type;
import env.Empty;
import env.Env;
import exp.BoaConstructor;
import values.JavaObject;
import values.Located;
import xpl.Interpreter;

@BoaConstructor(fields = { "name", "exports", "imports", "defs" })

public class Module implements TreeNode {

  // A module is a file of definitions. It provides a reusable collection of named values.
  // A module exports a sub-set of the names it defines. A module imports a collection of
  // other modules. Dependencies between modules can be circular, so a global table of
  // modules is maintained...

  static Hashtable<String, Module> MODULES    = new Hashtable<String, Module>();

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
        JavaObject o = (JavaObject) Interpreter.readFile("esl/esl.xpl", "esl", path, "file", new exp.Str(path));
        Module module = (Module) o.getTarget();
        return processModule(path, module);
      } else throw new FileNotFoundException("cannot import " + path);
    }
  }
  public static Module processModule(String path, Module module) throws FileNotFoundException {

    // Sets a shell module in the table to short circuit recursive imports. The
    // shell is then populated and some basic processing is performed on the module...

    Module shell = new Module();
    MODULES.put(path, shell);
    shell.name = module.name;
    shell.imports = module.imports;
    shell.exports = module.exports;
    shell.defs = module.defs;
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
  
  public Binding[]                 defs;

  public Hashtable<String, Module> imported   = new Hashtable<String, Module>();

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
    ast.types.Record recordType = new ast.types.Record(0, 0, fields);
    return new Binding(0, 0, path, name, recordType, new Letrec(1, 1, getBindings(), getExportedRecord()));
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
    for (Binding b : defs)
      if (b.getName().equals(name)) return b;
    return null;
  }

  private Binding[] getBindings() {

    // Return the bindings for all the definitions that are scoped over the
    // module. This includes the value and type definitions. The exported types
    // are shared with the exporting modules...

    Binding[] typeBindings = getExportedTypeBindings(imported.values());
    Binding[] valueBindings = new Binding[defs.length];
    for (int i = 0; i < defs.length; i++)
      valueBindings[i] = defs[i].substExportedValues(imported.values());
    return AST.concatenate(typeBindings, valueBindings);
  }

  public TreeNode[] getChildren() {
    return defs;
  }

  public Binding[] getDefs() {
    return defs;
  }

  private AST getExportedRecord() {

    // A module is represented as a record whose fields correspond to the
    // exported value bindings...

    Binding[] fields = new Binding[exports.getNames().length - exportedTypeNames().length];
    Env<String, Type> env = new Empty<String, Type>();
    env = Binding.typeBindingsPar(typeBindings(), env);
    int fieldIndex = 0;
    for (int i = 0; i < exports.getNames().length; i++) {
      String name = exports.getNames()[i].getName();
      Binding binding = getBinding(name);
      if (!binding.isTypeBinding()) {
        if (binding == null) throw new Error("cannot find exported definition: " + name);
        Type type = binding.getDeclaredType();
        fields[fieldIndex++] = new Binding(0, 0, path, name, type, new Var(0, 0, exports.getNames()[i].getName(), null));
      }
    }
    return new Record(0, 0, fields);
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
    located = AST.getLocated(imports,charIndex);
    if(located != null) return located;
    for (Binding b : defs) {
      located = AST.getLocated(b, charIndex);
      if (located != null) return located;
    }
    return null;
  }

  public String getName() {
    return name;
  }

  public String getPath() {
    return path;
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

  public Binding ref(String name) {
    for (Binding b : defs)
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

    // Set value and type variables to point to their establishing definitions...
    
    Env<String, DeclaringLocation> env = new Empty<String, DeclaringLocation>();
    for (Dec d : defs) {
      env = env.bind(d.getName(), d);
    }
    AST.setDefs(exports, env);
    env = AST.addDecs(imports, env);
    for (Dec d : defs) {
      AST.setDefs(d, env);
    }
  }

  public void setPath(String path) {
    this.path = path;
    for (Binding b : defs)
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
    for (String name : imported.keySet()) {
      imported.get(name).type(e);
      for (String exported : imported.get(name).getExports().getStrings()) {
        Binding binding = imported.get(name).ref(exported);
        if (binding.isTypeBinding())
          env = env.bind(exported, binding.getDeclaredType());
        else env = env.bind(exported, binding.getType());
      }
    }
    Binding.typeBindingsRec(defs, env);
  }

  public Binding[] typeBindings() {
    // Just return those bindings that define types...
    int tb = 0;
    for (Binding b : defs)
      if (b.isTypeBinding()) tb++;
    Binding[] typeBindings = new Binding[tb];
    int i = 0;
    for (Binding b : defs)
      if (b.isTypeBinding()) typeBindings[i++] = b;
    return typeBindings;
  }

  public Binding[] valueBindings() {
    // Just return those bindings that define values (e.g. not types)...
    int vb = 0;
    for (Binding b : defs)
      if (b.isValueBinding()) vb++;
    Binding[] valueBindings = new Binding[vb];
    int i = 0;
    for (Binding b : defs)
      if (b.isValueBinding()) valueBindings[i++] = b;
    return valueBindings;
  }

}
