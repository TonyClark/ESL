package instrs.jumps;

import actors.Actor;
import instrs.Instr;

public class Goto extends Instr {

  int address;

  public Goto(int line, int address) {
    super(line);
    this.address = address;
  }

  public int getAddress() {
    return address;
  }

  public void setAddress(int address) {
    this.address = address;
  }

  public void perform(Actor actor) {
    actor.setCodePtr(address);
  }

  public String toString() {
    return pprint("GOTO",address);
  }

}
