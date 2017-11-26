package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import ast.binding.Var;
import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.StartCall;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "op", "args" })

public class ApplyType extends AST {

  public AST    op;
  public Type[] args;

  public ApplyType() {
  }

  public ApplyType(AST op, Type... args) {
    this.op = op;
    this.args = args;
  }

  public String toString() {
    return "ApplyType(" + op + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    op.compile(locals, dynamics, code, isLast);
  }

  public void FV(HashSet<String> vars) {
    op.FV(vars);
  }

  public int maxLocals() {
    return op.maxLocals();
  }

  public void DV(HashSet<String> vars) {
    op.DV(vars);
  }

  public AST subst(AST ast, String name) {
    return new ApplyType(op.subst(ast, name), args);
  }

  public void setPath(String path) {
    op.setPath(path);
    for (AST arg : args)
      arg.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type t = op.type(env);
    if (t instanceof ast.types.Forall) {
      ast.types.Forall forall = (ast.types.Forall) t;
      if (forall.getNames().length == args.length) {
        setType(forall.subst(args));
        return getType();
      } else throw new TypeError(getLineStart(), getLineEnd(), " generic type " + forall + " suplied with incorrect arguments " + Arrays.toString(args));
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a generic type: " + t);
  }

  public String getLabel() {
    return "applytype :: " + getType();
  }

}
