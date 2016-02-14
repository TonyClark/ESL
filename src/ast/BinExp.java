package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Add;
import instrs.Cons;
import instrs.Eql;
import instrs.Instr;
import instrs.Sub;
import list.List;

@BoaConstructor(fields = { "left", "op", "right" })

public class BinExp extends AST {

  public AST    left;
  public String op;
  public AST    right;

  public BinExp() {
  }

  public BinExp(AST left, String op, AST right) {
    super();
    this.left = left;
    this.op = op;
    this.right = right;
  }

  public String toString() {
    return "BinExp(" + left + "," + op + "," + right + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    left.compile(locals, dynamics, code);
    right.compile(locals, dynamics, code);
    switch (op) {
      case "+":
        code.add(new Add());
        break;
      case "-":
        code.add(new Sub());
        break;
      case "=":
        code.add(new Eql());
        break;
      case ":":
        code.add(new Cons());
        break;
      default:
        throw new java.lang.Error("unknown operator " + op);
    }
  }

  public void FV(HashSet<String> vars) {
    left.FV(vars);
    right.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    left.DV(vars);
    right.DV(vars);
  }

  public int maxLocals() {
    return Math.max(left.maxLocals(), right.maxLocals());
  }

}
