package instrs.data;

import actors.Actor;
import instrs.Instr;

public class Record extends Instr {

  int length;

  public Record(int line, int length) {
    super(line);
    this.length = length;
  }

  public void perform(Actor actor) {
    actors.Field[] fields = new actors.Field[length];
    for (int i = 0; i < length; i++)
      fields[i] = (actors.Field) actor.popStack();
    actor.pushStack(new actors.Record(fields));
  }

  public String toString() {
   return pprint("RECORD",length);
  }

}
