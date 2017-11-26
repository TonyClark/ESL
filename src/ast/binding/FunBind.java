package ast.binding;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.general.AST;
import ast.lists.List;
import ast.modules.Module;
import ast.patterns.PTerm;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.If;
import ast.types.Forall;
import ast.types.TaggedFun;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "args", "declaredType", "body", "guard" })

public class FunBind extends Binding implements DecContainer {

  private static final int MAX_TERM_ACCESSOR_OFFSET = 5;

  public Pattern[]         args;
  public AST               guard;
  public AST               body;

  private boolean          traced                   = false;

  public FunBind() {
  }

  public FunBind(int lineStart, int lineEnd, String path, String name, Pattern[] args, Type declaredType, AST body, AST guard, boolean traced) {
    super(lineStart, lineEnd, path, name, declaredType, null);
    this.args = args;
    this.guard = guard;
    this.body = body;
    this.traced = traced;
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
      vs[i] = new Var(getLineStart(), getLineEnd(), "$" + i, getArgType(i), null);
      ws[i] = new PWild();
    }
    BArm a1 = new BArm(args, guard, body, false);
    BArm a2 = new BArm(ws, Bool.TRUE, new ast.control.Error(getLineStart(), getLineEnd(), new BinExp(getLineStart(), getLineEnd(), new Str("ran out of case arms in " + name), "+", new List(getLineStart(), getLineEnd(), vs))), false);
    // return new Binding(getLineStart(), getLineEnd(), path, name,
    // getFunctionType(), new Fun(getLineStart(), getLineEnd(), path, name, s,
    // getDeclaredType(), new Case(new Dec[]
    // {}, vs, new BArm[] { a1, a2 })));
    // Do we need the error? Currently it does not type check due to the wild
    // var pattern and the error...
    return new Binding(getLineStart(), getLineEnd(), path, name, getType(), new Fun(getLineStart(), getLineEnd(), path, new Str(name), s, getDeclaredType(), new Case(getLineStart(), getLineEnd(), new Dec[] {}, vs, new BArm[] { a1 }), traced));
  }

  private Binding desugarSimple() {
    return new Binding(getLineStart(), getLineEnd(), path, name, getType(), new Fun(getLineStart(), getLineEnd(), path, new Str(name), simpleArgs(), getDeclaredType(), new If(getLineStart(), getLineEnd(), guard, body, new ast.control.Error(getLineStart(), getLineEnd(), new Str("guard failed for " + name))), traced));
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

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[] {};
    for (Pattern p : args)
      decs = AST.concatenate(decs, p.getContainedDecs());
    return decs;
  }

  public AST getGuard() {
    return guard;
  }

  public String getLabel() {
    return name + " :: " + getType();
  }

  private int getTermAccessorOffset() {
    Var var = (Var) body;
    PTerm term = (PTerm) args[0];
    for (int i = 0; i < term.getPatterns().length; i++) {
      PVar pvar = (PVar) term.getPatterns()[i];
      if (pvar.getName().equals(var.getName())) return i;
    }
    throw new Error("cannot find term accessor offset for " + this);
  }

  public AST getValue() {
    return desugar().getValue();
  }

  private boolean guardIsTrue() {
    if (guard instanceof Bool) {
      Bool b = (Bool) guard;
      return b.value;
    } else return false;
  }

  private boolean isSimple() {
    for (Pattern p : args)
      if (!(p instanceof PVar)) return false;
    return true;
  }

  private boolean isTermAccessor() {
    if (args.length == 1 && body instanceof Var && guardIsTrue()) {
      Var bodyVar = (Var) body;
      Pattern p = args[0];
      if (p instanceof PTerm) {
        PTerm t = (PTerm) p;
        boolean accessField = false;
        for (Pattern arg : t.getPatterns()) {
          if (!(arg instanceof PVar))
            return false;
          else {
            PVar var = (PVar) arg;
            if (var.getName().equals(bodyVar.getName())) accessField = true;
          }
        }
        return accessField;
      } else return false;
    } else return false;
  }

  public boolean isTraced() {
    return traced;
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

  public void setTraced(boolean traced) {
    this.traced = traced;
  }

  public void setValue(AST value) {
    throw new Error("cannot set the value of a function binding.");
  }

  private Dec[] simpleArgs() {
    Dec[] s = new Dec[args.length];
    for (int i = 0; i < args.length; i++) {
      PVar var = (PVar) args[i];
      s[i] = new Dec(getLineStart(), getLineEnd(), path, var.getName(), var.getDeclaredType());
      s[i].setType(var.getType());
    }
    return s;
  }

  public Binding subst(AST ast, String name) {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : args)
      p.vars(bound);
    if (bound.contains(name))
      return this;
    else return new FunBind(getLineStart(), getLineEnd(), path, this.name, args, getDeclaredType(), body.subst(ast, name), guard.subst(ast, name), traced);
  }

  public Binding substExportedValues(Collection<Module> values) {
    return new FunBind(getLineStart(), getLineEnd(), path, name, args, getDeclaredType(), body.substExportedValues(values), guard.substExportedValues(values), traced);
  }

  private Type termAccessorType(Env<String, Type> env, Type[] types) {
    // The function binding is a term accessor. This can be compiled efficiently when the
    // function is applied. Encode this in the type of the binding...
    int offset = getTermAccessorOffset();
    if (offset < MAX_TERM_ACCESSOR_OFFSET && getDeclaredType() instanceof ast.types.Fun) {
      ast.types.Fun type = (ast.types.Fun) getDeclaredType();
      return new TaggedFun(type.getLineStart(), type.getLineEnd(), "compiler.extensions.Accessor" + offset, type.getDomain(), type.getRange());
    } else return new ast.types.Fun(getLineStart(), getLineEnd(), types, body.type(env));
  }

  public String toString() {
    return "FunBind(" + getName() + "," + Arrays.toString(args) + "," + declaredType + "," + body + "," + guard + ")";
  }

  public Type type(Env<String, Type> env) {
    Type declaredType = getDeclaredType();
    Pattern.types(args, env, (env1, types) ->
    {
      if (guard.type(env1) instanceof ast.types.Bool) {
        Type actualType = null;
        if (isTermAccessor()) {
          actualType = termAccessorType(env1, types);
        } else actualType = new ast.types.Fun(declaredType.getLineStart(), declaredType.getLineEnd(), types, body.type(env1));
        if (declaredType instanceof Forall) {
          Forall forall = (Forall) declaredType;
          actualType = new Forall(declaredType.getLineStart(), declaredType.getLineEnd(), forall.getNames(), actualType);
        }
        if (Type.equals(actualType, declaredType, env1)) {
          // setType(declaredType);
          setType(actualType);
          setDeclaredType(actualType);
        } else throw new TypeMatchError(getLineStart(), getLineEnd(), actualType, declaredType);
      } else throw new TypeError(guard.getLineStart(), guard.getLineEnd(), "expecting a boolean guard.");
    });
    return getType();
  }

}
