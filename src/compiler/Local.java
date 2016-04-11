package compiler;

import java.util.Vector;

import ast.refs.Ref;
import instrs.Instr;

public abstract class Local {

  String name;
  int    index;

  public Local(String name, int index) {
    super();
    this.name = name;
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public int getIndex() {
    return index;
  }

  public abstract void compile(Vector<Instr> code);

  public abstract void update(Vector<Instr> code);

  public abstract void sub1(Vector<Instr> code);

  public abstract void apply(int arity, Vector<Instr> code, boolean isLast);

  public abstract void isCons(Vector<Instr> code);

  public abstract void isTerm(String name, int arity, Vector<Instr> code);

  public abstract void bind(Ref ref, Vector<Instr> code);

}
