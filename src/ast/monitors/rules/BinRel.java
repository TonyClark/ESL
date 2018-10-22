package ast.monitors.rules;

import ast.general.AST;
import ast.monitors.code.VarTable;
import runtime.network.Tree;

public class BinRel extends Condition {

  public enum Rel {
    EQ, LESS, GRE
  }

  Rel op;
  Exp left;
  Exp right;

  public BinRel(Rel op, Exp left, Exp right) {
    super();
    this.op = op;
    this.left = left;
    this.right = right;
  }

  public BinRel(String name, Exp left, Exp right) {
    super();
    if (name.equals("EQ")) op = Rel.EQ;
    if (name.equals("LESS")) op = Rel.LESS;
    if (name.equals("GRE")) op = Rel.GRE;
    this.left = left;
    this.right = right;
  }

  public AST asTerm() {
    return new ast.data.Term(0, 0, "$BinRel", null, new AST[] { new ast.data.Str(op.toString()), left.asTerm(), right.asTerm() });
  }

  public boolean satisfied(Tree tree, VarTable vars) {
    switch (op) {
      case EQ:
        return left.eval(tree, vars).equals(right.eval(tree, vars));
      case LESS:
        return less(left.eval(tree, vars), right.eval(tree, vars));
      case GRE:
        return gre(left.eval(tree, vars), right.eval(tree, vars));
      default:
        throw new Error("unknown op " + op);
    }
  }

  private boolean less(Object o1, Object o2) {
    if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      return i1 < i2;
    } else throw new Error("< expects ints: " + o1 + " " + o2);
  }

  private boolean gre(Object o1, Object o2) {
    if (o1 instanceof Integer && o2 instanceof Integer) {
      int i1 = (int) o1;
      int i2 = (int) o2;
      return i1 > i2;
    } else throw new Error("> expects ints: " + o1 + " " + o2);
  }

  public String toString() {
    return op + "(" + left + "," + right + ")";
  }
}
