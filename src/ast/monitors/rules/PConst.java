package ast.monitors.rules;

import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.Pop;
import ast.monitors.code.VarTable;
import ast.types.Type;
import env.Env;

public class PConst extends Pattern {

  Object value;

  public PConst(Object value) {
    super();
    this.value = value;
  }

  public void addDecs(Vector<Dec> decs) {

  }

  public void addVarPaths(VarTable table) {
  }

  public AST asTerm() {
    throw new Error("cannot turn " + value + " into a term.");
  }

  public void compile(Vector<Code> code) {
    code.add(new ast.monitors.code.Const(value));
    code.addElement(new Pop());
  }

  public Type type() {
    return null;
  }

  public Type type(Env<String, Type> env) {
    return null;
  }

}
