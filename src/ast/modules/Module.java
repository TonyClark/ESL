package ast.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Hashtable;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Record;
import exp.BoaConstructor;
import values.JavaObject;
import xpl.Interpreter;

@BoaConstructor(fields = { "name", "exports", "imports", "defs" })
public class Module {

  // A module is a file of definitions. It provides a reusable collection of named values.
  // A module exports a sub-set of the names it defines. A module imports a collection of
  // other modules. Dependencies between modules can be circular, so a global table of
  // modules is maintained...

  static Hashtable<String, Module> MODULES    = new Hashtable<String, Module>();

  String                           path;
  long                             createTime = System.currentTimeMillis();
  public String                    name;
  public String[]                  imports;
  public String[]                  exports;
  public Binding[]                 defs;
  public Hashtable<String, Module> imported   = new Hashtable<String, Module>();

  public void setPath(String path) {
    this.path = path;
    for (Binding b : defs)
      b.setPath(path);
  }

  public Module resolve() throws FileNotFoundException {
    // Recursively load the modules...
    for (String name : imports) {
      imported.put(name, importModule(name));
    }
    return this;
  }

  public static Module importModule(String path) throws FileNotFoundException {
    // Import the module and resolve it. If it is already loaded
    // then just return it...
    if (MODULES.containsKey(path) && !MODULES.get(path).isOutOfDate())
      return MODULES.get(path);
    else {
      // Create a shell so that it will not be recursively loaded...
      if (new File(path).exists()) {
        Module shell = new Module();
        MODULES.put(path, shell);
        JavaObject o = (JavaObject) Interpreter.readFile("esl/esl.xpl", "esl", path, "file", new exp.Str(path));
        Module module = (Module) o.getTarget();
        shell.name = module.name;
        shell.imports = module.imports;
        shell.exports = module.exports;
        shell.defs = module.defs;
        shell.setPath(path);
        return shell.resolve();
      } else throw new FileNotFoundException("cannot import " + path);
    }
  }

  private boolean isOutOfDate() {
    // Returns true when the file containing the source of the module has been
    // modified since the last loading...
    File file = new File(path);
    return file.lastModified() > createTime;
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
    return new Letrec(1, bindings, new Var(name));
  }

  private static Binding[] allBindings() {
    Binding[] bindings = new Binding[MODULES.keySet().size()];
    int i = 0;
    for (String name : MODULES.keySet()) {
      bindings[i++] = MODULES.get(name).asBinding();
    }
    return bindings;
  }

  private Binding asBinding() {
    return new Binding(path, name, new ast.types.Void(), new Letrec(1, getBindings(), getExportedRecord()));
  }

  private AST getExportedRecord() {
    Binding[] fields = new Binding[exports.length];
    for (int i = 0; i < fields.length; i++)
      fields[i] = new Binding(path, exports[i], new ast.types.Void(), new Var(exports[i]));
    return new Record(fields);
  }

  private Binding[] getBindings() {
    Binding[] bindings = new Binding[defs.length];
    for (int i = 0; i < defs.length; i++)
      bindings[i] = defs[i].substExportedValues(imported.values());
    return bindings;
  }

  public String toString() {
    return "Module(" + name + "," + Arrays.toString(exports) + "," + Arrays.toString(imports) + ")";
  }

  public static Hashtable<String, Module> getMODULES() {
    return MODULES;
  }

  public String getName() {
    return name;
  }

  public String[] getImports() {
    return imports;
  }

  public String[] getExports() {
    return exports;
  }

  public Binding[] getDefs() {
    return defs;
  }

  public Hashtable<String, Module> getImported() {
    return imported;
  }

}
