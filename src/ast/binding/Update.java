package ast.binding;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.data.BinExp;
import ast.data.Int;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "name", "value" })

public class Update extends AST {

  public String name;
  public AST    value;

  public Update() {
  }

  public Update(String name, AST value) {
    super();
    this.name = name;
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    if (isSub1())
      compileSub1(locals, dynamics, code);
    else {
      value.compile(locals, dynamics, code,false);
      if (lookup(name, locals) != null)
        lookup(name, locals).update(code);
      else if (lookup(name, dynamics) != null)
        lookup(name, dynamics).update(code);
      else throw new java.lang.Error("cannot update " + name + " in " + locals + " and " + dynamics);
    }
  }

  private void compileSub1(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    if (lookup(name, locals) != null)
      lookup(name, locals).sub1(code);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).sub1(code);
    else throw new java.lang.Error("cannot subtract 1 from " + name + " in " + locals + " and " + dynamics);
  }

  private boolean isSub1() {
    if (value instanceof BinExp) {
      BinExp b = (BinExp) value;
      if (b.op.equals("-")) {
        if (b.left instanceof Var) {
          Var v = (Var) b.left;
          if (v.name.equals(name)) {
            if (b.right instanceof Int) {
              Int i = (Int) b.right;
              return i.value == 1;
            } else return false;
          } else return false;
        } else return false;
      } else return false;
    } else return false;
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public int maxLocals() {
    return value.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Update(this.name, value.subst(ast, name));
  }

  public String toString() {
    return "Update(" + name + "," + value + ")";
  }

}
