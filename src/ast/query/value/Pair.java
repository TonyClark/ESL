package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.unify.UConst;
import ast.query.instrs.unify.UPair;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;
import list.Cons;
import list.Maybe;

@BoaConstructor(fields = { "head", "tail" })
public class Pair extends Value {

  public Value head;
  public Value tail;

  public Pair() {
  }

  public Pair(Value head, Value tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public Object recons(Env<String, Var> venv) {
    Object t = tail.recons(venv);
    if (t instanceof list.List<?>) {
      list.List<Object> l = (list.List<Object>) t;
      return new Cons<Object>(head.recons(venv), l);
    }
    return new Cons<Object>(head.recons(venv), new Maybe<Object>(t));
  }

  public Value getHead() {
    return head;
  }

  public Value getTail() {
    return tail;
  }

  public static Value list(Value[] values) {
    return cons(0, values);
  }

  private static Value cons(int i, Value[] values) {
    if (i == values.length)
      return Nil.NIL;
    else return new Pair(values[i], cons(i + 1, values));
  }

  public boolean isProperList() {
    if (tail instanceof Nil) return true;
    if (tail instanceof Pair) {
      Pair pair = (Pair) tail;
      return pair.isProperList();
    }
    return false;
  }

  public String toString() {
    Value v = tail;
    if (isProperList()) {
      String s = "[" + head;
      while (!(v instanceof Nil)) {
        Pair p = (Pair) v;
        s = s + "," + p.getHead();
        v = p.getTail();
      }
      return s + "]";
    } else return "[" + head + " | " + tail + "]";
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    head.getContainedDecs(decs);
    tail.getContainedDecs(decs);
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    if (isConstant())
      code.add(new UConst(recons(null)));
    else {
      code.add(new UPair());
      head.compileHead(code, arity, vars);
      tail.compileHead(code, arity, vars);
    }
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    head.compile(code, arity, vars);
    tail.compile(code, arity, vars);
    code.add(new ast.query.instrs.data.Pair());
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    head.compile(code, arity, vars);
    tail.compile(code, arity, vars);
    code.add(new ast.query.instrs.data.Pair());
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.List) {
      ast.types.List list = (ast.types.List) type;
      env = head.type(env, list.getType());
      return tail.type(env, type);
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a list type " + type);
  }

  public boolean isConstant() {
    return head.isConstant() && tail.isConstant();
  }

  public boolean isExp() {
    return head.isExp() || tail.isExp();
  }

}
