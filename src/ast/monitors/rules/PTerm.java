package ast.monitors.rules;

import java.util.Arrays;
import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.lists.List;
import ast.monitors.code.Code;
import ast.monitors.code.Eql;
import ast.monitors.code.Pop;
import ast.monitors.code.Term;
import ast.monitors.code.VarTable;
import ast.monitors.code.paths.Path;
import ast.monitors.code.paths.RefTerm;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;
import runtime.network.Alpha;

@BoaConstructor(fields = { "name", "patterns" })
public class PTerm extends Pattern {

  public String    name;
  public Pattern[] patterns;

  public PTerm() {
  }

  public PTerm(String name, Pattern... patterns) {
    super();
    this.name = name;
    this.patterns = patterns;
  }

  public String getName() {
    return name;
  }

  public Pattern[] getPatterns() {
    return patterns;
  }

  public Alpha getAlpha(int index) {

    // Create an appropriate condition that deals with the type
    // of the terms, constants and repeated variables...

    if (isNot())
      return getNotAlpha(index);
    else {
      Vector<Code> code = new Vector<Code>();
      compile(code);
      return new Alpha(code, compileVarChecks());
    }
  }

  private Alpha getNotAlpha(int index) {
    PTerm term = (PTerm) patterns[0];
    return term.getAlpha(index);
  }

  private boolean isNot() {
    return name.equals("$NOT") && patterns.length == 1 && patterns[0] instanceof PTerm;
  }

  public void compile(Vector<Code> code) {
    code.add(new Term(Key.getKey(name), patterns.length));
    // Check each element...
    for (int i = 0; i < patterns.length; i++) {
      code.add(new RefTerm(i));
      patterns[i].compile(code);
    }
    code.addElement(new Pop());
  }

  private Vector<Eql> compileVarChecks() {
    VarTable[] tables = new VarTable[patterns.length];
    Vector<Eql> checks = new Vector<Eql>();
    for (int i = 0; i < patterns.length; i++) {
      tables[i] = new VarTable();
      patterns[i].addVarPaths(tables[i]);
      tables[i].add(i);
    }
    // Any names overlapping between patterns, then insert
    // an EQL instruction...
    for (int i = 0; i < tables.length; i++) {
      for (int j = 0; j < tables.length && i != j; j++) {
        for (String name : tables[i].keySet()) {
          if (tables[j].containsKey(name)) {
            for (Path p1 : tables[i].get(name)) {
              for (Path p2 : tables[j].get(name)) {
                checks.add(new Eql(p1, p2));
              }
            }
          }
        }
      }
    }
    return checks;
  }

  public void addVarPaths(VarTable table) {
    for (int i = 0; i < patterns.length; i++) {
      VarTable t = new VarTable();
      patterns[i].addVarPaths(t);
      table.add(i, t);
    }
  }

  public VarTable getVarPaths() {
    VarTable table = new VarTable();
    addVarPaths(table);
    return table;
  }

  public String toString() {
    return name + Arrays.toString(patterns);
  }

  public ast.types.Term type() {
    Type[] types = new Type[patterns.length];
    for (int i = 0; i < patterns.length; i++) {
      types[i] = patterns[i].type();
    }
    return new ast.types.Term(getLineStart(), getLineEnd(), name, types);
  }

  public Type type(Env<String, Type> env) {
    return type();
  }

  public AST asTerm() {
    AST[] args = new AST[patterns.length];
    for (int i = 0; i < patterns.length; i++)
      args[i] = patterns[i].asTerm();
    return new ast.data.Term(0, 0, "$Term", null, new AST[] { new ast.data.Str(name), new List(0, 0, args) });
  }

  public void addDecs(Vector<Dec> decs) {
    if (!isNot()) {
      for (Pattern p : patterns) {
        p.addDecs(decs);
      }
    }
  }

}
