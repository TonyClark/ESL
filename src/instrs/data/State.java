package instrs.data;

import static runtime.listeners.Listeners.getUpdateListener;

import instrs.Instr;
import runtime.ESL;
import runtime.actors.Actor;

public class State extends Instr {

  String name;
  int    self;

  public State(int line, String name, int self) {
    super(line);
    this.self = self;
    this.name = name;
  }

  public String toString() {
    return pprint("STATE", name, self);
  }

  public void perform(Actor actor) {
    if (self >= 0) {
      Object value = actor.peek();
      Actor a = actor.getSelf();
      for (int i = 0; i < self; i++) {
        a = a.getBehaviour().getSelf();
      }
      getUpdateListener().update(a, name, value, (int) ESL.getTime());
    }
  }

}
