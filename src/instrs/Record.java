package instrs;

import actors.Actor;

public class Record extends Instr {

  int length;

  public Record(int length) {
    super();
    this.length = length;
  }

  public void perform(Actor actor) {
    actors.Field[] fields = new actors.Field[length];
    for (int i = 0; i < length; i++)
      fields[i] = (actors.Field) actor.popStack();
    actor.pushStack(new actors.Record(fields));
  }

  public String toString() {
    return "Record(" + length + ")";
  }

}
