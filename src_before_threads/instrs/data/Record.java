package instrs.data;

import instrs.Instr;
import runtime.actors.Actor;

public class Record extends Instr {

  int length;

  public Record(int line, int length) {
    super(line);
    this.length = length;
  }

  public void perform(Actor actor) {
    runtime.data.Field[] fields = new runtime.data.Field[length];
    for (int i = 0; i < length; i++)
      fields[i] = (runtime.data.Field) actor.popStack();
    actor.pushStack(new runtime.data.Record(fields));
  }

  public String toString() {
   return pprint("RECORD",length);
  }

}
