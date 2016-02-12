package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.Skip;
import instrs.SkipFalse;
import list.List;

@BoaConstructor(fields = { "test", "conseq", "alt" })

public class If extends AST {

  public AST test;
  public AST conseq;
  public AST alt;

  public If() {
  }

  public If(AST test, AST conseq, AST alt) {
    super();
    this.test = test;
    this.conseq = conseq;
    this.alt = alt;
  }

  public String toString() {
    return "If(" + test + "," + conseq + "," + alt + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    test.compile(locals, dynamics, code);
    int length = code.size();
    SkipFalse jmp1 = new SkipFalse(0);
    code.add(jmp1);
    conseq.compile(locals, dynamics, code);
    Skip jmp2 = new Skip(0);
    code.add(jmp2);
    jmp1.setCount(code.size() - length);
    length = code.size()-1;
    alt.compile(locals, dynamics, code);
    jmp2.setCount(code.size() - length);
  }

  public void FV(HashSet<String> vars) {
    test.FV(vars);
    alt.FV(vars);
    conseq.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    test.DV(vars);
    alt.DV(vars);
    conseq.DV(vars);
  }

  public int maxLocals() {
    return Math.max(test.maxLocals(),Math.max(conseq.maxLocals(), alt.maxLocals()));
  }

}
