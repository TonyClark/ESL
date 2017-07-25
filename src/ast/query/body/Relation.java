package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.rel.Greater;
import ast.query.instrs.rel.Less;
import ast.query.instrs.rel.NQL;
import ast.query.instrs.unify.Unify;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "left", "op", "right" })
public class Relation extends BodyElement {

  public static final Key eql     = Key.getKey("=");
  public static final Key less    = Key.getKey("<");
  public static final Key greater = Key.getKey(">");
  public static final Key nql     = Key.getKey("<>");

  public Value            left;
  public Key              op;
  public Value            right;

  public Relation() {
  }

  public Relation(Value left, Key op, Value right) {
    this.left = left;
    this.op = op;
    this.right = right;
  }

  public String toString() {
    return left + " " + op.getString() + " " + right;
  }

  public BodyElement subst(Type type, String typeName) {
    return this;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    left.getContainedDecs(decs);
    right.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    if (op == eql)
      compileEql(code, arity, vars, isLast);
    else if (op == nql)
      compileNql(code, arity, vars, isLast);
    else if (op == greater)
      compileGreeater(code, arity, vars, isLast);
    else if (op == less)
      compileLess(code, arity, vars, isLast);
    else throw new Error("cannot compile relation " + op.getString());
  }

  private void compileGreeater(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    left.compile(code, arity, vars);
    right.compile(code, arity, vars);
    code.add(new Greater());
  }

  private void compileLess(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    left.compile(code, arity, vars);
    right.compile(code, arity, vars);
    code.add(new Less());
  }

  private void compileEql(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    left.compile(code, arity, vars);
    right.compile(code, arity, vars);
    code.add(new Unify());
  }

  private void compileNql(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    left.compile(code, arity, vars);
    right.compile(code, arity, vars);
    code.add(new NQL());
  }

  public void vars(HashSet<String> vars) {
    left.vars(vars);
    right.vars(vars);
  }

}
