package ast.query.instrs;

import ast.query.machine.Machine;

public abstract class Instr {

  public abstract void perform(Machine machine);

}
