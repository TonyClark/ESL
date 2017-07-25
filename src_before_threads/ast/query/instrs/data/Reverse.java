package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class Reverse extends Instr {

  public void perform(Machine machine) {
    List<Object> list = (List<Object>)machine.popCallStack();
    machine.pushCallStack(list.reverse());
  }

  public String toString() {
    return "Reverse()";
  }

}
