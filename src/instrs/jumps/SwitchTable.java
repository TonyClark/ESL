package instrs.jumps;

import java.util.Hashtable;

import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PTerm;
import ast.patterns.Pattern;
import ast.tests.BArm;
import instrs.Instr;
import list.Cons;
import list.Nil;
import runtime.actors.Actor;
import runtime.data.Key;
import runtime.data.Term;

public class SwitchTable extends Instr {

  public static final Key cons  = Key.getKey(":");
  public static final Key nil   = Key.getKey("[]");

  // Table contains mapping between a key and the code address that starts
  // the pattern matching code. The fail frame must be set up to fail to
  // the end of the case statement since the case-arms are guaranteed to be
  // disjoint. The error table contains offsets to the error handler.

  Hashtable<Key, Integer> table = new Hashtable<Key, Integer>();
  Hashtable<Key, Integer> error = new Hashtable<Key, Integer>();
  int                     varIndex;

  public SwitchTable(int line, int varIndex) {
    super(line);
    this.varIndex = varIndex;
  }

  public void perform(Actor actor) {
    Object o = actor.getFrameVar(varIndex);
    Key key = null;
    if (o instanceof Nil<?>)
      key = nil;
    else if (o instanceof Cons<?>)
      key = cons;
    else if (o instanceof Term) {
      Term term = (Term) o;
      key = term.getName();
    } else throw new Error("expecting a list or term: " + o);
    if (table.containsKey(key)) {
      actor.failReset();
      actor.setCodePtr(table.get(key));
      actor.tryOption(error.get(key));
    } else throw new Error("cannot find key for: " + o + " in " + table);
  }

  public String toString() {
    return pprint("SWITCHTABLE ", table, error);
  }

  public void processArm(BArm arm, int address) {
    Pattern pattern = arm.patterns[0];
    if (pattern instanceof PNil)
      table.put(nil, address);
    else if (pattern instanceof PCons)
      table.put(cons, address);
    else if (pattern instanceof PTerm) {
      PTerm term = (PTerm) pattern;
      table.put(Key.getKey(term.name), address);
    } else throw new Error("switch-table cannot process pattern: " + pattern);
  }

  public void processError(BArm arm, int address) {
    Pattern pattern = arm.patterns[0];
    if (pattern instanceof PNil)
      error.put(nil, address);
    else if (pattern instanceof PCons)
      error.put(cons, address);
    else if (pattern instanceof PTerm) {
      PTerm term = (PTerm) pattern;
      error.put(Key.getKey(term.name), address);
    } else throw new Error("error-table cannot process pattern: " + pattern);
  }

}
