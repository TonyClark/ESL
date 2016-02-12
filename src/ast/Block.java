package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.Pop;
import list.List;

@BoaConstructor(fields = { "exps" })

public class Block extends AST {

  public AST[] exps;

  public Block() {
  }

  public String toString() {
    return "Block(" + Arrays.toString(exps) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    for (AST exp : exps) {
      exp.compile(locals, dynamics, code);
      if (exp != exps[exps.length - 1]) code.add(new Pop());
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
