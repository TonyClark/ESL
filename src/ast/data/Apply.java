package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.StartCall;
import list.List;

@BoaConstructor(fields = { "op", "args" })

public class Apply extends AST {

  public AST   op;
  public AST[] args;

  public Apply() {
  }

  public Apply(int lineStart, int lineEnd, AST op, AST... args) {
    super(lineStart, lineEnd);
    this.op = op;
    this.args = args;
  }

  public String toString() {
    return "Apply(" + op + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (isApplyLocal(locals))
      compileApplyLocal(locals, dynamics, code, isLast);
    else if (isApplyDynamic(dynamics))
      compileApplyDynamic(locals, dynamics, code, isLast);
    else if (isApplyFun())
      compileApplyFun(locals, dynamics, code, isLast);
    else {
      code.add(new StartCall(getLineStart()), locals, dynamics);
      for (AST arg : args)
        arg.compile(locals, dynamics, code, false);
      op.compile(locals, dynamics, code, false);
      code.add(new instrs.apply.Apply(getLineStart(), args.length), locals, dynamics);
    }
  }

  private void compileApplyFun(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLineStart()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Fun fun = (Fun) op;
    fun.compileApply(locals, dynamics, code, isLast);
  }

  private boolean isApplyFun() {
    return op instanceof Fun;
  }

  private void compileApplyLocal(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLineStart()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Var v = (Var) op;
    lookup(v.name, locals).apply(args.length, getLineStart(), code, locals, dynamics, isLast);
  }

  private void compileApplyDynamic(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLineStart()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Var v = (Var) op;
    lookup(v.name, dynamics).apply(args.length, getLineStart(), code, locals, dynamics, isLast);
  }

  private boolean isApplyDynamic(List<DynamicVar> dynamics) {
    if (op instanceof Var) {
      Var v = (Var) op;
      if (lookup(v.name, dynamics) != null)
        return true;
      else return false;
    } else return false;
  }

  private boolean isApplyLocal(List<FrameVar> locals) {
    if (op instanceof Var) {
      Var v = (Var) op;
      if (lookup(v.name, locals) != null)
        return true;
      else return false;
    } else return false;
  }

  public void FV(HashSet<String> vars) {
    op.FV(vars);
    for (AST arg : args)
      arg.FV(vars);
  }

  public int maxLocals() {
    return Math.max(op.maxLocals(), maxLocals(args));
  }

  public void DV(HashSet<String> vars) {
    op.DV(vars);
    for (AST arg : args)
      arg.DV(vars);
  }

  public AST subst(AST ast, String name) {
    return new Apply(getLineStart(), getLineEnd(), op.subst(ast, name), subst(args, ast, name));
  }

  public void setPath(String path) {
    op.setPath(path);
    for (AST arg : args)
      arg.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type t = op.type(env);
    ast.types.Fun funType = Type.expect(op.getLineStart(), op.getLineEnd(), ast.types.Fun.class, this, t);
    checkArgTypes(funType, env);
    setType(funType.getRange());
    return getType();
  }

  private void checkArgTypes(ast.types.Fun funType, Env<String, Type> env) {
    if (funType.getDomain().length == args.length) {
      for (int i = 0; i < funType.getDomain().length; i++) {
        Type suppliedType = args[i].type(env);
        Type expectedType = funType.getDomain()[i];
        if (!Type.equals(expectedType, suppliedType, env)) { throw new TypeMatchError(getLineStart(), getLineEnd(), suppliedType, Type.eval(expectedType, env)); }
      }
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting " + funType.getDomain().length + " type args but supplied with " + args.length);
  }

  public String getLabel() {
    return "apply :: " + getType();
  }

}
