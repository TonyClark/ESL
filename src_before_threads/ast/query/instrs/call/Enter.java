package ast.query.instrs.call;

import java.util.Vector;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.rules.Clause;
import runtime.data.Key;

public class Enter extends Instr {

  Key name;
  int arity;

  public Enter(Key name, int arity) {
    this.name = name;
    this.arity = arity;
  }

  public void perform(Machine machine) {
    machine.enter(name, arity);
  }

  public String toString() {
    return "Enter(" + name + "," + arity + ")";
  }

}
