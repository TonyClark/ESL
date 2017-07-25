package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.control.Goto;
import ast.query.instrs.control.PopTry;
import ast.query.instrs.control.PushTry;
import ast.query.value.Name;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "goals", "handlers" })
public class Try extends BodyElement {

  public BodyElement[] goals;
  public Catch[]       handlers;

  public Try() {
  }

  public Try(int lineStart, int lineEnd, BodyElement[] goals, Catch[] handlers) {
    super(lineStart, lineEnd);
    this.goals = goals;
    this.handlers = handlers;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newGoals = new BodyElement[goals.length];
    Catch[] newHandlers = new Catch[handlers.length];
    for (int i = 0; i < goals.length; i++) {
      newGoals[i] = goals[i].subst(type, typeName);
    }
    for (int i = 0; i < handlers.length; i++) {
      newHandlers[i] = handlers[i].subst(type, typeName);
    }
    return new Try(getLineStart(), getLineEnd(), newGoals, newHandlers);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement goal : goals)
      goal.getContainedDecs(decs);
    for (Catch h : handlers)
      h.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    String thrownValue = "thrownValue" + Math.random();
    vars.add(thrownValue);
    PushTry pushTry = new PushTry(vars.indexOf(thrownValue) + arity, 0, 0);
    code.add(pushTry);
    for (int i = 0; i < goals.length; i++) {
      goals[i].compile(code, arity, vars, isLast && (i == goals.length - 1));
    }
    code.add(new PopTry());
    Goto go = new Goto(0);
    code.add(go);
    pushTry.setHandlerOffset(code.size());
    Name name = new Name(thrownValue);
    BodyElement[] handle = new BodyElement[] { new Throw(name) };
    for (int i = handlers.length - 1; i >= 0; i--)
      handle = new BodyElement[] { new If(getLineStart(), getLineEnd(), new BodyElement[] { new Relation(name, Key.getKey("="), handlers[i].getValue()) }, handlers[i].getBody(), handle) };
    for (BodyElement e : handle)
      e.compile(code, arity, vars, isLast);
    go.setOffset(code.size());
    pushTry.setEndOfTryOffset(code.size());
  }

  public void vars(HashSet<String> vars) {
    vars(goals, vars);
    for (Catch handler : handlers)
      handler.vars(vars);
  }

}
