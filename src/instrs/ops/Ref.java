package instrs.ops;

import java.util.Arrays;

import actors.Actor;
import actors.Record;
import instrs.Instr;

public class Ref extends Instr {

  public String name;

  public Ref(String name) {
    super();
    this.name = name;
  }

  public void perform(Actor actor) {
    Object namespace = actor.popStack();
    if (namespace instanceof actors.Record)
      performRecordRef(actor, (actors.Record) namespace);
    else if (namespace instanceof Actor)
      performActorRef(actor, (Actor) namespace);
    else throw new java.lang.Error(namespace + " is not a namespace.");

  }

  private void performActorRef(Actor actor, Actor namespace) {
    if (namespace.hasExport(name))
      actor.pushStack(namespace.ref(name));
    else throw new java.lang.Error("actor " + namespace + " does not have field " + name + " in " + Arrays.toString(namespace.getExports()));

  }

  private void performRecordRef(Actor actor, Record record) {
    if (record.hasField(name))
      actor.pushStack(record.getField(name).getValue());
    else throw new java.lang.Error("record " + record + " does not have field " + name);
  }

  public String toString() {
    return "Ref(" + name + ")";
  }

}
