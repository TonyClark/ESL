package compiler;

import java.util.Vector;

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

}
