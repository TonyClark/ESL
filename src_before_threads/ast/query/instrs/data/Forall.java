package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class Forall extends Instr {

  static List<Object> nil = new list.Nil<Object>();

  int                 list;
  int                 offset;

  public Forall(int list, int offset) {
    super();
    this.list = list;
    this.offset = offset;
  }

  public void perform(Machine machine) {
    machine.setLocal(list, nil);
    machine.forall(offset);
  }

  public String toString() {
    return "Forall(" + list + "," + offset + ")";
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

}
