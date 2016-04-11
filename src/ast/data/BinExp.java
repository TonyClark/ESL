package ast.data;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.tests.If;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.ops.Add;
import instrs.ops.Add1;
import instrs.ops.And;
import instrs.ops.Cons;
import instrs.ops.Div;
import instrs.ops.Eql;
import instrs.ops.Gre;
import instrs.ops.Less;
import instrs.ops.Mul;
import instrs.ops.NEql;
import instrs.ops.Or;
import instrs.ops.Sub;
import instrs.ops.To;
import instrs.tests.Is0;
import instrs.tests.IsBool;
import instrs.tests.NotNil;
import list.List;

@BoaConstructor(fields = { "left", "op", "right" })

public class BinExp extends AST {

  // Compilation of binary expressions. Generally push the values of the args on the stack
  // and then perform a machine instruction defined by the operator...

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

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    if (isEql0())
      compileEql0(locals, dynamics, code);
    else if (isEqlBool())
      compileEqlBool(locals, dynamics, code);
    else if (isAdd1())
      compileAdd1(locals, dynamics, code);
    else if (isNotNil())
      compileNotNil(locals, dynamics, code);
    else if (op.equals("andalso"))
      new If(left, right, new Bool(false)).compile(locals, dynamics, code, isLast);
    else if (op.equals("orelse"))
      new If(left, new Bool(true), right).compile(locals, dynamics, code, isLast);
    else {
      left.compile(locals, dynamics, code, false);
      right.compile(locals, dynamics, code, false);
      switch (op) {
        case "+":
          code.add(new Add());
          break;
        case "-":
          code.add(new Sub());
          break;
        case "*":
          code.add(new Mul());
          break;
        case "/":
          code.add(new Div());
          break;
        case "=":
          code.add(new Eql());
          break;
        case ">":
          code.add(new Gre());
          break;
        case "<":
          code.add(new Less());
          break;
        case ":":
          code.add(new Cons());
          break;
        case "<>":
          code.add(new NEql());
          break;
        case "and":
          code.add(new And());
          break;
        case "or":
          code.add(new Or());
          break;
        case "..":
          code.add(new To());
          break;
        default:
          throw new java.lang.Error("unknown operator " + op);
      }
    }
  }

  private void compileAdd1(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (left instanceof Int && ((Int) left).value == 1) {
      right.compile(locals, dynamics, code, false);
      code.add(new Add1());
    } else {
      left.compile(locals, dynamics, code, false);
      code.add(new Add1());
    }
  }

  private boolean isAdd1() {
    if (op.equals("+")) {
      if (left instanceof Int) {
        Int i = (Int) left;
        return i.value == 1;
      } else if (right instanceof Int) {
        Int i = (Int) right;
        return i.value == 1;
      } else return false;
    } else return false;
  }

  private void compileNotNil(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    left.compile(locals, dynamics, code, false);
    code.add(new NotNil());
  }

  private void compileEql0(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    left.compile(locals, dynamics, code, false);
    code.add(new Is0());
  }

  private void compileEqlBool(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    left.compile(locals, dynamics, code, false);
    Bool b = (Bool) right;
    code.add(new IsBool(b.value));
  }

  private boolean isEql0() {
    if (op.equals("=") && right instanceof Int) {
      Int i = (Int) right;
      return i.value == 0;
    } else return false;
  }

  private boolean isEqlBool() {
    if (op.equals("=") && right instanceof Bool)
      return true;
    else return false;
  }

  private boolean isNotNil() {
    if (op.equals("<>") && right instanceof ast.lists.List) {
      ast.lists.List l = (ast.lists.List) right;
      return l.elements.length == 0;
    } else return false;
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

  public AST subst(AST ast, String name) {
    return new BinExp(left.subst(ast, name), op, right.subst(ast, name));
  }

}
