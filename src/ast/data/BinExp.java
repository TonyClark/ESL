package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.tests.If;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.ops.Add;
import instrs.ops.Add1;
import instrs.ops.And;
import instrs.ops.Cons;
import instrs.ops.Div;
import instrs.ops.Eql;
import instrs.ops.Gre;
import instrs.ops.Less;
import instrs.ops.Mod;
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

  public BinExp(int lineStart, int lineEnd, AST left, String op, AST right) {
    super(lineStart, lineEnd);
    this.left = left;
    this.op = op;
    this.right = right;
  }

  public String toString() {
    return "BinExp(" + left + "," + op + "," + right + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (isEql0())
      compileEql0(locals, dynamics, code);
    else if (isEqlBool())
      compileEqlBool(locals, dynamics, code);
    else if (isAdd1())
      compileAdd1(locals, dynamics, code);
    else if (isNotNil())
      compileNotNil(locals, dynamics, code);
    else if (op.equals("andalso"))
      new If(getLineStart(), getLineEnd(), left, right, new Bool(false)).compile(locals, dynamics, code, isLast);
    else if (op.equals("orelse"))
      new If(getLineStart(), getLineEnd(), left, new Bool(true), right).compile(locals, dynamics, code, isLast);
    else {
      left.compile(locals, dynamics, code, false);
      right.compile(locals, dynamics, code, false);
      switch (op) {
        case "+":
          code.add(new Add(getLineStart()), locals, dynamics);
          break;
        case "-":
          code.add(new Sub(getLineStart()), locals, dynamics);
          break;
        case "*":
          code.add(new Mul(getLineStart()), locals, dynamics);
          break;
        case "/":
          code.add(new Div(getLineStart()), locals, dynamics);
          break;
        case "=":
          code.add(new Eql(getLineStart()), locals, dynamics);
          break;
        case ">":
          code.add(new Gre(getLineStart()), locals, dynamics);
          break;
        case "<":
          code.add(new Less(getLineStart()), locals, dynamics);
          break;
        case ":":
          code.add(new Cons(getLineStart()), locals, dynamics);
          break;
        case "<>":
          code.add(new NEql(getLineStart()), locals, dynamics);
          break;
        case "and":
          code.add(new And(getLineStart()), locals, dynamics);
          break;
        case "or":
          code.add(new Or(getLineStart()), locals, dynamics);
          break;
        case "..":
          code.add(new To(getLineStart()), locals, dynamics);
          break;
        case "%":
          code.add(new Mod(getLineStart()), locals, dynamics);
          break;
        default:
          throw new java.lang.Error("unknown operator " + op);
      }
    }
  }

  private void compileAdd1(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    if (left instanceof Int && ((Int) left).value == 1) {
      right.compile(locals, dynamics, code, false);
      code.add(new Add1(getLineStart()), locals, dynamics);
    } else {
      left.compile(locals, dynamics, code, false);
      code.add(new Add1(getLineStart()), locals, dynamics);
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

  private void compileNotNil(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    left.compile(locals, dynamics, code, false);
    code.add(new NotNil(getLineStart()), locals, dynamics);
  }

  private void compileEql0(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    left.compile(locals, dynamics, code, false);
    code.add(new Is0(getLineStart()), locals, dynamics);
  }

  private void compileEqlBool(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    left.compile(locals, dynamics, code, false);
    Bool b = (Bool) right;
    code.add(new IsBool(getLineStart(), b.value), locals, dynamics);
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
    return new BinExp(getLineStart(), getLineEnd(), left.subst(ast, name), op, right.subst(ast, name));
  }

  public void setPath(String path) {
    left.setPath(path);
    right.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    setType(type0(env));
    return getType();
  }

  public Type type0(Env<String, Type> env) {
    Type t1 = left.type(env);
    Type t2 = right.type(env);
    if (op.equals("+")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Int.INT;
      else if (t1 instanceof ast.types.Str || t2 instanceof ast.types.Str)
        return ast.types.Str.STR;
      else if (t1 instanceof ast.types.List && t2 instanceof ast.types.List) {
        ast.types.List l1 = (ast.types.List) t1;
        ast.types.List l2 = (ast.types.List) t2;
        if (Type.equals(l1.getType(), l2.getType(), env))
          return t1;
        else throw new TypeError(getLineStart(), getLineEnd(), "+ expects two lists with the same element types: " + t1 + " and " + t2);
      } else if (t1 instanceof ast.types.Bag && t2 instanceof ast.types.Bag) {
        ast.types.Bag b1 = (ast.types.Bag) t1;
        ast.types.Bag b2 = (ast.types.Bag) t2;
        if (Type.equals(b1.getType(), b2.getType(), env))
          return t1;
        else throw new TypeError(getLineStart(), getLineEnd(), "+ expects two lists with the same element types: " + t1 + " and " + t2);
      } else throw new TypeError(getLineStart(), getLineEnd(), "+ expects numbers, bags, sets or lists: " + t1 + " and " + t2);
    } else if (op.equals("-")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Int.INT;
      else throw new TypeError(getLineStart(), getLineEnd(), "- expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("*")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Int.INT;
      else throw new TypeError(getLineStart(), getLineEnd(), "* expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("/")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Int.INT;
      else throw new TypeError(getLineStart(), getLineEnd(), "/ expects two integers: " + t1 + " and " + t2);
    } else if (op.equals(">")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Bool.BOOL;
      else throw new TypeError(getLineStart(), getLineEnd(), "> expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("<")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Bool.BOOL;
      else throw new TypeError(getLineStart(), getLineEnd(), "> expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("="))
      return ast.types.Bool.BOOL;
    else if (op.equals("and") || op.equals("andalso")) {
      if (t1 instanceof ast.types.Bool && t2 instanceof ast.types.Bool)
        return ast.types.Bool.BOOL;
      else throw new TypeError(getLineStart(), getLineEnd(), "and expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("or") || op.equals("orelse")) {
      if (t1 instanceof ast.types.Bool && t2 instanceof ast.types.Bool)
        return ast.types.Bool.BOOL;
      else throw new TypeError(getLineStart(), getLineEnd(), "or expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("<>")) {
      return ast.types.Bool.BOOL;
    } else if (op.equals("%")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return ast.types.Int.INT;
      else throw new TypeError(getLineStart(), getLineEnd(), "% expects two integers: " + t1 + " and " + t2);
    } else if (op.equals("..")) {
      if (t1 instanceof ast.types.Int && t2 instanceof ast.types.Int)
        return new ast.types.List(getLineStart(), getLineEnd(), ast.types.Int.INT);
      else throw new TypeError(getLineStart(), getLineEnd(), ".. expects two integers: " + t1 + " and " + t2);
    } else if (op.equals(":")) {
      if (t2 instanceof ast.types.List) {
        ast.types.List l = (ast.types.List) t2;
        if (Type.equals(t1, l.getType(), env))
          return t2;
        else throw new TypeError(getLineStart(), getLineEnd(), ": incompatible element type: " + t1 + " and " + t2);
      } else throw new TypeError(getLineStart(), getLineEnd(), ": expects a list: " + t2);
    } else throw new TypeError(getLineStart(), getLineEnd(), "unknown operator " + op);
  }

  public String getLabel() {
    return op + " :: -> " + getType();
  }

}
