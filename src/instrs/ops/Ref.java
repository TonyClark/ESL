package instrs.ops;

import java.util.Arrays;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Record;

public class Ref extends Instr {

  {
    code = REF;
  }

  public Key[] names;

  public Ref(int line, Key[] names) {
    super(line);
    this.names = names;
  }

  public void perform(Actor actor) {
    performRefs(actor, actor.popStack(), 0);

  }

  protected void performRefs(Actor actor, Object value, int index) {
    if (index == names.length)
      actor.pushStack(value);
    else {
      if (value instanceof runtime.data.Record)
        performRecordRef(actor, (runtime.data.Record) value, index);
      else if (value instanceof Actor)
        performActorRef(actor, (Actor) value, index);
      else if (value instanceof JavaActor) {
        performJavaRef(actor, (JavaActor) value, index);
      } else throw new java.lang.Error(value + " is not a namespace for " + Arrays.toString(names));
    }
  }

  private void performJavaRef(Actor actor, JavaActor namespace, int index) {
    if (namespace.hasExport(names[index]))
      performRefs(actor, namespace.ref(names[index]), index + 1);
    else throw new java.lang.Error("actor " + namespace + " does not have field " + names[index] + " in " + Arrays.toString(namespace.getExports()));

  }

  private void performActorRef(Actor actor, Actor namespace, int index) {
    if (namespace.hasExport(names[index]))
      performRefs(actor, namespace.ref(names[index]), index + 1);
    else throw new java.lang.Error("actor " + namespace + " does not have field " + names[index] + " in " + Arrays.toString(namespace.getExports()));
  }

  private void performRecordRef(Actor actor, Record record, int index) {
    if (record.hasField(names[index]))
      performRefs(actor, record.getField(names[index]).getValue(), index + 1);
    else throw new java.lang.Error("record " + record + " does not have field " + names[index]);
  }

  public String toString() {
    return pprint("REF", Arrays.toString(names));
  }

}
