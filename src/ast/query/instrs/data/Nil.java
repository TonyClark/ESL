package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class Nil extends Instr {

  static List<Object> nil = new list.Nil<Object>();

  public void perform(Machine machine) {
    machine.pushCallStack(nil);
  }

  public String toString() {
    return "Nil()";
  }

}
