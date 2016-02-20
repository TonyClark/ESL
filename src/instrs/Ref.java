package instrs;

import actors.Actor;

public class Ref extends Instr {

  public String name;

  public Ref(String name) {
    super();
    this.name = name;
  }

  public void perform(Actor actor) {
    actors.Record record = (actors.Record) actor.popStack();
    if (record.hasField(name))
      actor.pushStack(record.getField(name).getValue());
    else throw new java.lang.Error("record " + record + " does not have field " + name);
  }

  public String toString() {
    return "Ref(" + name + ")";
  }

}
