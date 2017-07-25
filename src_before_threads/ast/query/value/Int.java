package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.unify.UInt;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "value" })
public class Int extends Value {

  public int value;

  public Int() {
  }

  public Int(int value) {
    super();
    this.value = value;
  }

  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public Object recons(Env<String, Var> venv) {
    return value;
  }

  public boolean equals(Object other) {
    if (other instanceof Int) {
      Int i = (Int) other;
      return i.value == value;
    } else return false;
  }

  public String toString() {
    return Integer.toString(value);
  }

  public int getValue() {
    return value;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new UInt(value));
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Int(value));
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Int(value));
  }

  public void vars(HashSet<String> vars) {
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (Type.equals(type, ast.types.Int.INT, env)) {
      setType(type);
      return env;
    } else throw new TypeError(getLineStart(), getLineEnd(), value + "::Int but expected " + type);
  }

  public boolean isConstant() {
    return true;
  }

  public boolean isExp() {
    return false;
  }

}
