package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "target", "args" })

public class Send extends AST {

  public AST   target;
  public AST[] args;

  public Send() {
  }

  public Send(AST target, AST... args) {
    this.target = target;
    this.args = args;
  }

  public String toString() {
    return "Send(" + target + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    target.compile(locals, dynamics, code);
    for (AST arg : args)
      arg.compile(locals, dynamics, code);
    code.add(new instrs.Send(args.length));
  }

  public void FV(HashSet<String> vars) {
    target.FV(vars);
    for (AST a : args)
      a.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    target.DV(vars);
    DV(args, vars);
  }

  public int maxLocals() {
    return Math.max(target.maxLocals(), maxLocals(args));
  }

}
