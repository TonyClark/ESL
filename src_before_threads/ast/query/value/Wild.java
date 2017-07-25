package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.data.ConsVar;
import ast.query.instrs.data.Pop;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = {})
public class Wild extends Value {

  public Wild() {
  }

  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public Value recons(Env<String, Var> venv) {
    return new Var();
  }

  public String toString() {
    return "_";
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new Pop());
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ConsVar());
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ConsVar());
  }

  public void vars(HashSet<String> vars) {
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    return env;
  }

  public boolean isConstant() {
    return false;
  }

  public boolean isExp() {
    return false;
  }

}
