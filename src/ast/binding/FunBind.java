package ast.binding;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import ast.AST;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.lists.List;
import ast.modules.Module;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.If;
import ast.types.Forall;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import env.Empty;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "args", "declaredType", "body", "guard" })

public class FunBind extends Binding implements DecContainer {

  public Pattern[] args;
  public AST       guard;
  public AST       body;

  public FunBind() {
  }

  public FunBind(int lineStart, int lineEnd, String path, String name, Pattern[] args, Type declaredType, AST body, AST guard) {
    super(lineStart, lineEnd, path, name, declaredType, null);
    this.args = args;
    this.guard = guard;
    this.body = body;
  }

  public Binding desugar() {

    // This should be called after type checking. No type checking can occur
    // as part of desugaring since we do not have access to the type environment
    // at this point.

    if (isSimple())
      return desugarSimple();
    else return desugarPattern();
  }

  private Binding desugarPattern() {
    Dec[] s = new Dec[args.length];
    AST[] vs = new AST[args.length];
    Pattern[] ws = new Pattern[args.length];
    for (int i = 0; i < args.length; i++) {
      s[i] = new Dec(getLineStart(), getLineEnd(), path, "$" + i, getArgType(i));
      vs[i] = new Var(getLineStart(), getLineEnd(), "$" + i, null);
      ws[i] = new PWild();
    }
    BArm a1 = new BArm(args, guard, body);
    BArm a2 = new BArm(ws, Bool.TRUE, new ast.control.Error(getLineStart(), getLineEnd(), new BinExp(getLineStart(), getLineEnd(), new Str("ran out of case arms in " + name), "+", new List(getLineStart(), getLineEnd(), vs))));
    // return new Binding(getLineStart(), getLineEnd(), path, name, getFunctionType(), new Fun(getLineStart(), getLineEnd(), path, name, s, getDeclaredType(), new Case(new Dec[]
    // {}, vs, new BArm[] { a1, a2 })));
    // Do we need the error? Currently it does not type check due to the wild var pattern and the error...
    return new Binding(getLineStart(), getLineEnd(), path, name, getType(), new Fun(getLineStart(), getLineEnd(), path, new Str(name), s, getDeclaredType(), new Case(new Dec[] {}, vs, new BArm[] { a1 })));
  }

  private Binding desugarSimple() {
    return new Binding(getLineStart(), getLineEnd(), path, name, getType(), new Fun(getLineStart(), getLineEnd(), path, new Str(name), simpleArgs(), getDeclaredType(), new If(getLineStart(), getLineEnd(), guard, body, new ast.control.Error(getLineStart(), getLineEnd(), new Str("guard failed for " + name)))));
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : args)
      p.vars(bound);
    body.FV(vars);
    guard.FV(vars);
    vars.removeAll(bound);
  }

  public Pattern[] getArgs() {
    return args;
  }

  private Type getArgType(int i) {
    return args[i].getType();
    // Env<String, Type> env = new Empty<String, Type>();
    // Type[] type = new Type[] { null };
    // args[i].type(env, (newEnv, t) -> type[0] = t);
    // return type[0];
  }

  public AST getBody() {
    return body;
  }

  /*
   * 
   * public Type getFunctionType() { Type[] result = new Type[] { null }; Env<String, Type> env = new Empty<String, Type>(); Pattern.types(args, env, (newEnv, types) -> { Type t =
   * getType(); result[0] = new ast.types.Fun(getLineStart(), getLineEnd(), types, t); }); return result[0]; }
   */

  public AST getGuard() {
    return guard;
  }

  public String getLabel() {
    return name + " :: " + getType();
  }

  public AST getValue() {
    return desugar().getValue();
  }

  private boolean isSimple() {
    for (Pattern p : args)
      if (!(p instanceof PVar)) return false;
    return true;
  }

  public void setArgs(Pattern[] args) {
    this.args = args;
  }

  public void setBody(AST body) {
    this.body = body;
  }

  public void setGuard(AST guard) {
    this.guard = guard;
  }

  public void setPath(String path) {
    this.path = path;
    guard.setPath(path);
    body.setPath(path);
  }

  public void setValue(AST value) {
    throw new Error("cannot set the value of a function binding.");
  }

  private Dec[] simpleArgs() {
    Dec[] s = new Dec[args.length];
    for (int i = 0; i < args.length; i++) {
      PVar var = (PVar) args[i];
      s[i] = new Dec(getLineStart(), getLineEnd(), path, var.getName(), var.getDeclaredType());
    }
    return s;
  }

  public Binding subst(AST ast, String name) {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : args)
      p.vars(bound);
    if (bound.contains(name))
      return this;
    else return new FunBind(getLineStart(), getLineEnd(), path, this.name, args, getDeclaredType(), body.subst(ast, name), guard.subst(ast, name));
  }

  public Binding substExportedValues(Collection<Module> values) {
    return new FunBind(getLineStart(), getLineEnd(), path, name, args, getDeclaredType(), body.substExportedValues(values), guard.substExportedValues(values));
  }

  public String toString() {
    return "FunBind(" + getName() + "," + Arrays.toString(args) + "," + declaredType + "," + body + "," + guard + ")";
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[] {};
    for (Pattern p : args)
      decs = AST.concatenate(decs, p.getContainedDecs());
    return decs;
  }

  public Type type(Env<String, Type> env) {
    Type declaredType = getDeclaredType();
    Pattern.types(args, env, (env1, types) ->
    {
      if (guard.type(env1) instanceof ast.types.Bool) {
        Type actualType = new ast.types.Fun(getLineStart(), getLineEnd(), types, body.type(env1));
        if (declaredType instanceof Forall) {
          Forall forall = (Forall) declaredType;
          actualType = new Forall(getLineStart(), getLineEnd(), forall.getNames(), actualType);
        }
        if (Type.equals(actualType, declaredType, env1)) {
          setType(declaredType);
        } else throw new TypeMatchError(getLineStart(), getLineEnd(), actualType, declaredType);
      } else throw new TypeError(guard.getLineStart(), guard.getLineEnd(), "expecting a boolean guard.");
    });
    return getType();
  }

}
