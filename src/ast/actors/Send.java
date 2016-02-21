package ast.actors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "target", "args", "time" })

public class Send extends AST {

  public AST   target;
  public AST[] args;
  public AST   time;

  public Send() {
  }

  public Send(AST target, AST[] args, AST time) {
    this.target = target;
    this.args = args;
    this.time = time;
  }

  public String toString() {
    return "Send(" + target + "," + Arrays.toString(args) + "," + time + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    for (AST arg : args)
      arg.compile(locals, dynamics, code);
    time.compile(locals, dynamics, code);
    target.compile(locals, dynamics, code);
    code.add(new instrs.Send(args.length));
  }

  public void FV(HashSet<String> vars) {
    target.FV(vars);
    time.FV(vars);
    for (AST a : args)
      a.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    target.DV(vars);
    time.DV(vars);
    DV(args, vars);
  }

  public int maxLocals() {
    return Math.max(time.maxLocals(),Math.max(target.maxLocals(), maxLocals(args)));
  }

  public AST subst(AST ast, String name) {
    return new Send(target.subst(ast, name), subst(args, ast, name), time.subst(ast, name));
  }

}
