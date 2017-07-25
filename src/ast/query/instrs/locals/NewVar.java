package ast.query.instrs.locals;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.value.Var;

public class NewVar extends Instr {

  int offset;

  public NewVar(int offset) {
    super();
    this.offset = offset;
  }

  public void perform(Machine machine) {
    Var var = new Var();
    machine.setLocal(offset, var);
    machine.pushCallStack(var);
  }

  public String toString() {
    return "NewVar(" + offset + ")";
  }

}
