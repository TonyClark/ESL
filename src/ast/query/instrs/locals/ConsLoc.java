package ast.query.instrs.locals;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class ConsLoc extends Instr {

  int offset;

  public ConsLoc(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    List<Object> list = (List<Object>) machine.getLocal(offset);
    machine.setLocal(offset, list.cons(machine.recons(machine.popCallStack())));
  }

  public String toString() {
    return "ConsLoc(" + offset + ")";
  }

}
