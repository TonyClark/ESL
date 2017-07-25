package ast.query.instrs.call;

import java.util.Vector;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.rules.Clause;
import runtime.data.Key;

public class EnterDB extends Instr {

  Key name;
  int arity;

  public EnterDB(Key name, int arity) {
    this.name = name;
    this.arity = arity;
  }

  public void perform(Machine machine) {
    machine.enterDB(name, arity);
  }

  public String toString() {
    return "EnterDB(" + name + "," + arity + ")";
  }

}
