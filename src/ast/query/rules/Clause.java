package ast.query.rules;

import java.util.Vector;

import ast.query.instrs.Instr;

public class Clause {

  String        name;
  int           arity;
  int           vars;
  Vector<Instr> code;
  boolean       isSpied;

  public Clause(String name, int arity, int vars, Vector<Instr> code, boolean isSpied) {
    this.name = name;
    this.arity = arity;
    this.vars = vars;
    this.code = code;
    this.isSpied = isSpied;
  }

  public int getVars() {
    return vars;
  }

  public Vector<Instr> getCode() {
    return code;
  }

  public String toString() {
    return "Clause(" + name + "," + vars + ")";
  }

  public int getArity() {
    return arity;
  }

  public String getName() {
    return name;
  }

  public boolean isSpied() {
    return isSpied;
  }

}
