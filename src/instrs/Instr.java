package instrs;

import java.io.PrintStream;
import java.util.Hashtable;

import actors.Actor;
import actors.CodeBox;
import values.Located;

public abstract class Instr implements Located {

  int line;

  public Instr(int line) {
    this.line = line;
  }

  public abstract void perform(Actor actor);

  public void pprint(int address, PrintStream out) {
    out.printf("%5d %s%n", address, this);
  }

  public String pprint(String name) {
    return String.format("%-10s", name);
  }

  public String pprint(String name, Object arg0) {
    return String.format("%-10s %-10s", name, arg0);
  }

  public String pprint(String name, Object arg0, Object arg1) {
    return String.format("%-10s %-5s %-10s", name, arg0, arg1);
  }

  public String pprint(String name, Object arg0, Object arg1, Object arg2) {
    return String.format("%-10s %-5s %-10s %-10s", name, arg0, arg1, arg2);
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    // Add all the code boxes against their names into the table...
  }

  public int getLine() {
    return line;
  }

  public void setLine(int line) {
    this.line = line;
  }

}
