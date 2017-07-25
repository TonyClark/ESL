package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.unify.UNil;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Nil extends Value {

  public final static Nil NIL = new Nil();

  public Nil() {
  }

  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public Object recons(Env<String, Var> venv) {
    return new list.Nil<>();
  }

  public boolean equals(Object other) {
    return other instanceof Nil;
  }

  public String toString() {
    return "[]";
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new UNil());
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Nil());
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Nil());
  }

  public void vars(HashSet<String> vars) {
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.List) {
      return env;
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a list, but got " + type);
  }

  public boolean isConstant() {
    return true;
  }

  public boolean isExp() {
    return false;
  }

}
