package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
import java.util.function.Predicate;

import ast.TreeNode;
import ast.binding.Update;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.data.BinExp;
import ast.general.AST;
import ast.patterns.PTerm;
import ast.patterns.Pattern;
import ast.types.HandlerType;
import ast.types.Type;
import ast.types.Var;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;
import values.Located;

@BoaConstructor(fields = { "patterns", "guard", "exp" })

public class BArm implements TreeNode, DecContainer, Located {

  public Pattern[]    patterns;
  public AST          guard;
  public AST          exp;
  private HandlerType type;
  private int         start  = -1;
  private int         end    = -1;
  private boolean     traced = false;

  public BArm() {
  }

  public BArm(Pattern[] patterns, AST guard, AST exp, boolean traced) {
    super();
    this.patterns = patterns;
    this.guard = guard;
    this.exp = exp;
    this.traced = traced;
  }

  public String[] args() {
    String[] args = new String[patterns.length + 1];
    for (int i = 0; i < patterns.length; i++)
      args[i] = "$arm-" + i;
    args[patterns.length] = "$fail";
    return args;
  }

  private boolean binds(String name) {
    for (Pattern p : patterns)
      if (p.binds(name)) return true;
    return false;
  }

  public void compile(int varIndex, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox instrs, boolean isLast) {

    // Compile each of the patterns...

    for (int i = 0; i < patterns.length; i++)
      patterns[i].compile(locals, dynamics, new ast.refs.PatternValue(i + varIndex), instrs);
    compileGuard(locals, dynamics, instrs);
    exp.compile(locals, dynamics, instrs, isLast);
  }

  private void compileGuard(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox instrs) {
    if (!isTrivialGuard()) {
      guard.compile(locals, dynamics, instrs, false);
      instrs.add(new instrs.patterns.FailFalse(guard.getLineStart()), locals, dynamics);
    }
  }

  public void DV(HashSet<String> vars) {

    // The dynamic vars in an arm are the dynamic vars in the guard and the
    // expression
    // with the bound vars of the patterns removed...

    Vector<String> BV = new Vector<String>();
    for (Pattern p : patterns)
      p.bound(BV);
    HashSet<String> DV = new HashSet<String>();
    guard.DV(DV);
    exp.DV(DV);
    for (String b : BV)
      DV.remove(b);
    vars.addAll(DV);

  }

  public void FV(HashSet<String> vars) {

    // Free variables in an arm are the free variables in the guard and the
    // expression
    // with the bound variables of the patterns removed...

    Vector<String> BV = new Vector<String>();
    for (Pattern p : patterns)
      p.bound(BV);
    HashSet<String> FV = new HashSet<String>();
    guard.FV(FV);
    exp.FV(FV);
    for (String b : BV)
      FV.remove(b);
    vars.addAll(FV);
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[] {};
    for (Pattern p : patterns)
      decs = AST.concatenate(decs, p.getContainedDecs());
    return decs;
  }

  public String getLabel() {
    return "arm :: " + type;
  }

  public int getLineEnd() {
    return end;
  }

  public int getLineStart() {
    return start;
  }

  public Pattern[] getPatterns() {
    return patterns;
  }

  public boolean hasStateGuard() {

    // This should really check that the guard checks the state is one of a
    // collection of legal values...

    Predicate<AST> pred = (exp) -> isGuardCheck(exp);
    return AST.find(pred, guard) != null;
  }

  private boolean isGuardCheck(AST exp) {
    if (exp instanceof BinExp) {
      BinExp b = (BinExp) exp;
      if (b.op.equals("=")) {
        return isStateVar(b.left) || isStateVar(b.right);
      } else return false;
    } else return false;
  }

  private boolean isStateUpdate(AST exp) {
    if (exp instanceof Update) {
      Update update = (Update) exp;
      return update.name.equals("state");
    } else return false;
  }

  private boolean isStateVar(AST exp) {
    if (exp instanceof ast.binding.Var) {
      ast.binding.Var var = (ast.binding.Var) exp;
      return var.getName().equals("state");
    } else return false;
  }

  private boolean isTimePattern() {
    if (patterns.length == 1) {
      if (patterns[0] instanceof PTerm) {
        PTerm p = (PTerm) patterns[0];
        return p.getName().equals("Time");
      }
      return false;
    }
    return false;
  }

  public boolean isTraced() {
    return traced;
  }

  private boolean isTrivialGuard() {
    if (guard instanceof ast.data.Bool) {
      ast.data.Bool b = (ast.data.Bool) guard;
      return b.value;
    } else return false;
  }

  public int maxLocals() {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : patterns)
      p.vars(bound);

    // Only those that are not allocated as dynamic will wind up as local...

    HashSet<String> dynamic = new HashSet<String>();
    exp.DV(dynamic);
    bound.removeAll(dynamic);
    return bound.size() + exp.maxLocals() + guard.maxLocals();

  }

  public void processDeclarations(Env<String, Type> env) {
    for (Pattern p : patterns)
      p.processDeclarations(env);
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setPath(String path) {
    guard.setPath(path);
    exp.setPath(path);
  }

  public boolean setsState() {

    // Return true when the action updates the state.

    Predicate<AST> pred = (exp) -> isStateUpdate(exp);
    return AST.find(pred, exp) != null;
  }

  public void setTraced(boolean traced) {
    this.traced = traced;
  }

  public BArm subst(AST ast, String name) {

    // NB does not subst into the expressions embedded in patterns.
    // It should do that...

    if (binds(name))
      return this;
    else return new BArm(patterns, guard.subst(ast, name), exp.subst(ast, name), traced);
  }

  public String toString() {
    return "BArm(" + Arrays.toString(patterns) + "," + guard + "," + exp + ")";
  }

  public HandlerType type(Env<String, Type> env) {
    HandlerType type = new HandlerType();
    Pattern.types(patterns, env, (newEnv, types) ->
    {
      Type.expect(exp.getLineStart(), exp.getLineEnd(), ast.types.Bool.class, exp, guard.type(newEnv));
      type.setTypes(types);
      type.setResult(exp.type(newEnv));
      this.type = type;
    });
    return type;
  }

}
