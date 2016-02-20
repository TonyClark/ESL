package ast.control;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.Null;
import instrs.Pop;
import list.List;

@BoaConstructor(fields = { "exps" })

public class Block extends AST {

  // A block is just a sequence of expressions. They are performed in sequence and the block
  // returns the value of the last expression. If there are no expressions in a block then the
  // block returns null. An empty block is a useful no-op...

  public AST[] exps = new AST[] {};

  public Block() {
  }

  public Block(AST... exps) {
    this.exps = exps;
  }

  public String toString() {
    return "Block(" + Arrays.toString(exps) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (exps.length == 0)
      code.add(new Null());
    else {
      for (AST exp : exps) {
        exp.compile(locals, dynamics, code);
        if (exp != exps[exps.length - 1]) code.add(new Pop());
      }
    }
  }

  public void FV(HashSet<String> vars) {
    for (AST e : exps)
      e.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (AST e : exps)
      e.DV(vars);
  }

  public int maxLocals() {
    return maxLocals(exps);
  }

}
