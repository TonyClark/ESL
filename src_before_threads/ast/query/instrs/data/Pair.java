package ast.query.instrs.data;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.Cons;
import list.Maybe;

public class Pair extends Instr {

  public void perform(Machine machine) {
    Object tail = machine.popCallStack();
    Object head = machine.popCallStack();
    machine.pushCallStack(new Cons<Object>(head, new Maybe<Object>(tail)));
  }

  public String toString() {
    return "Pair()";
  }

}
