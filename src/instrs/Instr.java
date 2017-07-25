package instrs;

import java.io.PrintStream;
import java.util.Hashtable;

import runtime.actors.Actor;
import runtime.functions.CodeBox;
import values.Located;

public abstract class Instr implements Located {

  public static final int APPLY           = 0;
  public static final int APPLYDYNAMICVAR = 1;
  public static final int APPLYFRAMEVAR   = 2;
  public static final int APPLYFUN        = 3;
  public static final int DYNAMIC         = 4;
  public static final int FALSE           = 5;
  public static final int FRAMEVAR        = 6;
  public static final int GOTO            = 7;
  public static final int HEAD            = 8;
  public static final int INT             = 9;
  public static final int ISNIL           = 10;
  public static final int NEQL            = 11;
  public static final int NULL            = 12;
  public static final int POP             = 13;
  public static final int POPFRAME        = 14;
  public static final int REF             = 15;
  public static final int RETURN          = 16;
  public static final int SELF            = 17;
  public static final int SETFRAME        = 18;
  public static final int SKIP            = 19;
  public static final int SKIPTRUE        = 20;
  public static final int SKIPFALSE       = 21;
  public static final int SHOW            = 22;
  public static final int STARTCALL       = 23;
  public static final int TAIL            = 24;
  public static final int TERM            = 25;
  public static final int TRUE            = 26;

  public int              code            = -1;
  int                     line;

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

  public int getLineStart() {
    return line;
  }

  public void setLineStart(int line) {
    this.line = line;
  }

  public int getLineEnd() {
    return line;
  }

  public void setLineEnd(int line) {
    this.line = line;
  }

}
