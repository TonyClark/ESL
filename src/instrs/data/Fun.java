package instrs.data;

import java.io.PrintStream;
import java.util.Hashtable;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.functions.CodeBox;

public class Fun extends Instr {

  static int counter = 0;

  int        arity;
  CodeBox    code;

  public Fun(int line, int arity, CodeBox codeBox) {
    super(line);
    this.arity = arity;
    this.code = codeBox;
  }

  public String toString() {
    return pprint("FUN");
  }

  public void perform(Actor actor) {
    String name = (String) actor.popStack();
    actor.pushStack(new runtime.functions.Closure(name, arity, actor.getDynamics(), code, actor.getSelf()));
  }

  public void pprint(int address, PrintStream out) {
    out.printf("%5d Fun(%s)%n", address, arity);
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    code.collect("lambda" + (counter++), boxes);
  }
}
