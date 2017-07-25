package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.unify.UStr;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "value" })
public class Str extends Value {

  public String value;

  public Str() {
  }

  public Str(String value) {
    super();
    this.value = value;
  }

  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public Object recons(Env<String, Var> venv) {
    return value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

  public boolean equals(Object other) {
    if (other instanceof Str) {
      Str i = (Str) other;
      return i.value.equals(value);
    } else return false;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new UStr(value));
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Str(value));
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    code.add(new ast.query.instrs.data.Str(value));
  }

  public void vars(HashSet<String> vars) {
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (Type.equals(type, ast.types.Str.STR, env)) {
      setType(type);
      return env;
    } else throw new TypeError(getLineStart(), getLineEnd(), value + "::Str but expected " + type);
  }

  public boolean isConstant() {
    return true;
  }

  public boolean isExp() {
    return false;
  }

}
