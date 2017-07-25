package ast.query.value;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.types.Type;
import ast.types.Typed;
import env.Env;
import values.Located;

public abstract class Value implements Serializable, Located, Typed {

  private int  lineStart = -1;
  private int  lineEnd   = -1;
  private Type type;

  public abstract void compile(Vector<Instr> code, int arity, Vector<String> vars);

  public abstract void compileExp(Vector<Instr> code, int arity, Vector<String> vars);

  public abstract void compileHead(Vector<Instr> code, int arity, Vector<String> vars);

  public abstract void getContainedDecs(Hashtable<String, DeclaringLocation> decs);

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public Type getType() {
    return type;
  }

  public abstract boolean isConstant();

  public abstract boolean isExp();

  public abstract Object recons(Env<String, Var> venv);

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public abstract Env<String, Type> type(Env<String, Type> env, Type type);

  public abstract void vars(HashSet<String> vars);

}
