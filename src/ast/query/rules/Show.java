package ast.query.rules;

import java.util.Collections;
import java.util.HashSet;

import ast.AST;
import ast.query.body.BodyElement;
import ast.query.body.Call;
import ast.query.value.Name;
import ast.query.value.Value;
import ast.types.Forall;
import ast.types.Rules;
import ast.types.Term;
import ast.types.Tuple;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Empty;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Pop;
import instrs.jumps.Goto;
import instrs.query.QRecons;
import instrs.query.QShow;
import instrs.query.data.NewLogicalVar;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetFrame;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "calls", "boundVars", "rules", "knowledge", "guard", "body", "timeout", "timeoutExp", "alt" })
public class Show extends AST {

  public Call[]   calls;
  public String[] boundVars;
  public AST      rules;
  public AST      knowledge;
  public AST      guard;
  public AST      body;
  public AST      alt;
  public AST      timeout;
  public AST      timeoutExp;
  String          path;

  public Show() {
  }

  public Show(int start, int end, Call[] calls, String[] boundVars, AST rules, AST knowledge, AST guard, AST body, AST timeout, AST timeoutExp, AST alt, String path) {
    super(start, end);
    this.calls = calls;
    this.boundVars = boundVars;
    this.rules = rules;
    this.knowledge = knowledge;
    this.guard = guard;
    this.body = body;
    this.alt = alt;
    this.timeout = timeout;
    this.timeoutExp = timeoutExp;
    this.path = path;
  }

  public String getLabel() {
    return "show";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // The variables in the body elements are allocated as logical variables
    // and then a clause containing the body of the 'show' is called on
    // the actor's query machine by supplying the variables as arguments.

    HashSet<String> DV = new HashSet<String>();
    HashSet<String> V = boundVars();
    body.DV(DV);

    // Bind the logical vars only if they are genuinely unbound - otherwise use the value...
    for (String var : V) {
      if (!isBoundVar(var)) {
        code.add(new NewLogicalVar(getLineStart()), locals, dynamics);
        if (DV.contains(var)) {
          code.add(new NewDynamic(getLineStart()), locals, dynamics);
          dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(var, 0));
        } else {
          locals = locals.cons(new FrameVar(var, locals.length()));
          code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
          code.add(new Pop(getLineStart()), locals, dynamics);
        }
      }
    }

    String[] args = V.toArray(new String[0]);
    Clause clause = getClause(args);
    for (int i = args.length - 1; i >= 0; i--) {
      String var = args[i];
      if (lookup(var, locals) != null)
        lookup(var, locals).compile(getLineStart(), code, locals, dynamics);
      else if (lookup(var, dynamics) != null) lookup(var, dynamics).compile(getLineStart(), code, locals, dynamics);
    }

    rules.compile(locals, dynamics, code, isLast);
    knowledge.compile(locals, dynamics, code, isLast);
    timeout.compile(locals, dynamics, code, isLast);

    QShow qInit = new QShow(getLineStart(), clause, 0, 0);
    code.add(qInit, locals, dynamics);

    // If we get to this point in the code, we have succeeded and the variables are bound
    // to values. These must be reconstructed...

    for (String var : V) {
      if (lookup(var, locals) != null)
        lookup(var, locals).compile(getLineStart(), code, locals, dynamics);
      else if (lookup(var, dynamics) != null) lookup(var, dynamics).compile(getLineStart(), code, locals, dynamics);
      code.add(new QRecons(getLineStart()), locals, dynamics);
      if (lookup(var, locals) != null)
        lookup(var, locals).update(getLineStart(), code, locals, dynamics);
      else if (lookup(var, dynamics) != null) lookup(var, dynamics).update(getLineStart(), code, locals, dynamics);
    }

    body.compile(locals, dynamics, code, isLast);

    // Remove the dynamics so that these are no longer available outside this contour...

    for (String var : V) {
      if (DV.contains(var)) {
        code.add(new PopDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.getTail();
      }
    }

    Goto g1 = new Goto(getLineStart(), 0);
    code.add(g1, locals, dynamics);

    qInit.setTimeoutAddress(code.getCode().size());

    timeoutExp.compile(locals, dynamics, code, isLast);
    Goto g2 = new Goto(getLineStart(), 0);
    code.add(g2, locals, dynamics);

    qInit.setAltAddress(code.getCode().size());

    alt.compile(locals, dynamics, code, isLast);
    g1.setAddress(code.getCode().size());
    g2.setAddress(code.getCode().size());

  }

  private boolean isBoundVar(String var) {
    for (String n : boundVars)
      if (n.equals(var)) return true;
    return false;
  }

  private Clause getClause(String[] vars) {
    // Create a clause corresponding to the show body elements with arguments for each of
    // the variables...
    Name[] args = new Name[vars.length];
    for (int i = 0; i < vars.length; i++)
      args[i] = new Name(vars[i]);
    Rule rule = new Rule(0, 0, false, Key.getKey("$-show"), new String[0], args, calls);
    return rule.getClause(false, false);
  }

  private HashSet<String> boundVars() {
    HashSet<String> V = new HashSet<String>();
    for (BodyElement e : calls) {
      e.vars(V);
    }
    return V;
  }

  public void DV(HashSet<String> vars) {
    HashSet<String> DV = new HashSet<String>();
    rules.DV(vars);
    knowledge.DV(vars);
    guard.DV(vars);
    body.DV(DV);
    alt.DV(DV);
    timeout.DV(DV);
    timeoutExp.DV(DV);
    vars.addAll(DV);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> BV = new HashSet<String>();
    HashSet<String> FV = new HashSet<String>();
    BodyElement.vars(calls, BV);
    for (String v : boundVars) {
      BV.remove(v);
      FV.add(v);
    }
    rules.FV(vars);
    knowledge.FV(vars);
    guard.FV(FV);
    body.FV(FV);
    alt.FV(FV);
    timeout.FV(FV);
    timeoutExp.FV(FV);
    FV.removeAll(BV);
    vars.addAll(FV);
  }

  public int maxLocals() {
    int maxLocals = 0;
    HashSet<String> FV = new HashSet<String>();
    BodyElement.vars(calls, FV);
    maxLocals = Math.max(rules.maxLocals(), maxLocals);
    maxLocals = Math.max(knowledge.maxLocals(), maxLocals);
    maxLocals = Math.max(guard.maxLocals(), maxLocals);
    maxLocals = Math.max(timeout.maxLocals(), maxLocals);
    maxLocals = Math.max(timeoutExp.maxLocals(), maxLocals);
    return maxLocals + Math.max(body.maxLocals(), alt.maxLocals()) + FV.size();
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AST subst(AST ast, String name) {
    return new Show(getLineStart(), getLineEnd(), calls, boundVars, rules.subst(ast, name), knowledge.subst(ast, name), guard.subst(ast, name), body.subst(ast, name), timeout.subst(ast, name), timeoutExp.subst(ast, name), alt.subst(ast, name), path);
  }

  public Type type(Env<String, Type> env) {
    Rules ruleType = (Rules) Type.eval(rules.type(env), env);
    HashSet<String> V = boundVars();
    Env<String, Type> localEnv = new Empty<String, Type>();
    for (String var : env.dom()) {
      if (!V.contains(var)) localEnv = localEnv.bind(var, env.lookup(var));
    }
    for (Call call : calls) {
      // Need to check that the call is correctly typed and extend the environment with
      // type bindings for the variables in the call...
      localEnv = type(call, ruleType, localEnv);
    }
    Type type = body.type(localEnv);
    setType(type);
    return type;
  }

  private Env<String, Type> type(Call call, Rules rules, Env<String, Type> env) {
    Type type = rules.getType(call.getName(), call.getArity());
    if (type == null)
      throw new TypeError(call.getLineStart(), call.getLineEnd(), "cannot find definition for " + call.getName() + "/" + call.getArity());
    else if (type instanceof Forall)
      return type(call, (Forall) type, env);
    else if (type instanceof Tuple)
      return type(call, (Tuple) type, env);
    else throw new TypeError(call.getLineStart(), call.getLineEnd(), "unknown type for call " + type);
  }

  private Env<String, Type> type(Call call, Forall forall, Env<String, Type> env) {
    if (call.getGenerics().length == forall.getNames().length) {
      Type type = forall.apply(call.getGenerics());
      if (type instanceof Tuple)
        return type(call, (Tuple) type, env);
      else throw new TypeError(call.getLineStart(), call.getLineEnd(), "rule type should be a tuple " + type);
    } else throw new TypeError(call.getLineStart(), call.getLineEnd(), "incorrect number of generic arguments");
  }

  private Env<String, Type> type(Call call, Tuple type, Env<String, Type> env) {
    for (int i = 0; i < type.getArity(); i++) {
      Value arg = call.getArgs()[i];
      Type argType = type.getTypes()[i];
      env = arg.type(env, argType);
    }
    return env;
  }

}
