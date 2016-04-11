package instrs;

import java.io.PrintStream;
import java.util.Hashtable;

import actors.Actor;
import actors.CodeBox;

public abstract class Instr {

  public abstract void perform(Actor actor);

  public void pprint(int address, PrintStream out) {
    out.printf("%5d %s%n", address, this);
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    // Add all the code boxes against their names into the table...
  }

}
