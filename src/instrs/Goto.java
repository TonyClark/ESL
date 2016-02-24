package instrs;

import actors.Actor;

public class Goto extends Instr {

  int address;

  public Goto(int address) {
    super();
    this.address = address;
  }

  public void perform(Actor actor) {
    actor.setCodePtr(address);
  }

  public String toString() {
    return "Goto(" + address + ")";
  }

}
