package ast.monitors.rules;

import java.util.HashSet;
import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.Pop;
import ast.monitors.code.VarTable;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "exp" })
public class PExp extends Pattern {

  public AST exp;

  public PExp() {
  }

  public PExp(AST exp) {
    super();
    this.exp = exp;
  }

  public void compile(Vector<Code> code) {
    throw new Error("cannot compile a PExp: must be translated to a const via expansion: " + exp);
  }

  public void addVarPaths(VarTable table) {
  }

  public Type type(Env<String, Type> env) {
    setType(exp.type(env));
    return getType();
  }

  public Type type() {
    return getType();
  }

  public AST asTerm() {
    return new ast.data.Term(0, 0, "$Const", null, new AST[] { exp });
  }

  public void addDecs(Vector<Dec> decs) {

  }

  public String toString() {
    return "PExp(" + exp + ")";
  }
}
