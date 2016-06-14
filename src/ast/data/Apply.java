package ast.data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.apply.StartCall;
import list.List;

@BoaConstructor(fields = { "op", "args" })

public class Apply extends AST {

  public AST   op;
  public AST[] args;

  public Apply() {
  }

  public Apply(AST op, AST... args) {
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
      code.add(new StartCall(getLine()), locals, dynamics);
      for (AST arg : args)
        arg.compile(locals, dynamics, code, false);
      op.compile(locals, dynamics, code, false);
      code.add(new instrs.apply.Apply(getLine(), args.length), locals, dynamics);
    }
  }

  private void compileApplyFun(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLine()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Fun fun = (Fun) op;
    fun.compileApply(locals, dynamics, code, isLast);
  }

  private boolean isApplyFun() {
    return op instanceof Fun;
  }

  private void compileApplyLocal(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLine()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Var v = (Var) op;
    lookup(v.name, locals).apply(args.length, getLine(), code, locals, dynamics, isLast);
  }

  private void compileApplyDynamic(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLine()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    Var v = (Var) op;
    lookup(v.name, dynamics).apply(args.length, getLine(), code, locals, dynamics, isLast);
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
    return new Apply(op.subst(ast, name), subst(args, ast, name));
  }

  public void setPath(String path) {
    op.setPath(path);
    for (AST arg : args)
      arg.setPath(path);
  }

}
