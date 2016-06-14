package instrs.ops;

import java.util.Arrays;

import actors.Actor;
import actors.JavaActor;
import actors.Key;
import actors.Record;
import instrs.Instr;

public class Ref extends Instr {

  public Key name;

  public Ref(int line,Key name) {
    super(line);
    this.name = name;
  }

  public void perform(Actor actor) {
    Object namespace = actor.popStack();
    if (namespace instanceof actors.Record)
      performRecordRef(actor, (actors.Record) namespace);
    else if (namespace instanceof Actor)
      performActorRef(actor, (Actor) namespace);
    else if (namespace instanceof JavaActor) {
      performJavaRef(actor, (JavaActor) namespace);
    } else throw new java.lang.Error(namespace + " is not a namespace.");

  }

  private void performJavaRef(Actor actor, JavaActor namespace) {
    if (namespace.hasExport(name))
      actor.pushStack(namespace.ref(name));
    else throw new java.lang.Error("actor " + namespace + " does not have field " + name + " in " + Arrays.toString(namespace.getExports()));

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
    return pprint("REF",name.getString());
  }

}
