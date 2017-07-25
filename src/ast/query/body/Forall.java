package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.data.Reverse;
import ast.query.instrs.locals.ConsLoc;
import ast.query.instrs.locals.Local;
import ast.query.instrs.unify.Unify;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "body", "value", "results" })

public class Forall extends BodyElement {

  public BodyElement[] body;
  public Value         value;
  public Value         results;

  public Forall() {
  }

  public Forall(int lineStart, int lineEnd, BodyElement[] body, Value value, Value results) {
    super(lineStart, lineEnd);
    this.body = body;
    this.value = value;
    this.results = results;
  }

  public Value getValue() {
    return value;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newBody = new BodyElement[body.length];
    for (int i = 0; i < body.length; i++) {
      newBody[i] = body[i].subst(type, typeName);
    }
    return new Forall(getLineStart(), getLineEnd(), newBody, value, results);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement e : body)
      e.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    String list = "forallList" + Math.random();
    vars.add(list);
    ast.query.instrs.data.Forall forall = new ast.query.instrs.data.Forall(vars.indexOf(list) + arity, 0);
    code.add(forall);
    for (BodyElement e : body)
      e.compile(code, arity, vars,false);
    value.compile(code, arity, vars);
    code.add(new ConsLoc(vars.indexOf(list) + arity));
    code.add(new ast.query.instrs.control.Fail());
    forall.setOffset(code.size());
    results.compile(code, arity, vars);
    code.add(new Local(vars.indexOf(list) + arity));
    code.add(new Reverse());
    code.add(new Unify());
  }

  public void vars(HashSet<String> vars) {
    vars(body, vars);
    value.vars(vars);
    results.vars(vars);
  }

}
