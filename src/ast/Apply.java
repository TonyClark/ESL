package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.StartCall;
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

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    code.add(new StartCall());
    for (AST arg : args)
      arg.compile(locals, dynamics, code);
    op.compile(locals, dynamics, code);
    code.add(new instrs.Apply(args.length));
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

}
