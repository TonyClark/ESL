package ast.query.instrs.call;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import runtime.data.Key;

public class StartCall extends Instr {

  public void perform(Machine machine) {
    machine.startCall();
  }

  public String toString() {
    return "StartCall()";
  }
}
