package instrs.data;

import java.util.Hashtable;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Key;
import runtime.functions.Closure;
import runtime.functions.CodeBox;

public class Behaviour extends Instr {

  static int counter = 0;

  Key[]      exports;
  int        initIndex;
  CodeBox    code;
  boolean    handlesTime;
  int        funHandlers;

  public Behaviour(int line, Key[] exports, int initIndex, CodeBox code, boolean handlesTime, int funHandlers) {
    super(line);
    this.exports = exports;
    this.initIndex = initIndex;
    this.code = code;
    this.handlesTime = handlesTime;
    this.funHandlers = funHandlers;
  }

  public void perform(Actor actor) {

    Hashtable<String, Closure> handlers = new Hashtable<String, Closure>();
    for (int i = 0; i < funHandlers; i++) {
      Closure closure = (Closure) actor.popStack();
      String name = closure.getName();
      handlers.put(name, closure);
    }
    String name = (String) actor.popStack();
    actor.pushStack(new runtime.actors.Behaviour(name, exports, actor.getDynamics(), initIndex, code, handlesTime, handlers, actor.getSelf()));
  }

  public String toString() {
    return pprint("BEHAVIOUR");
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    code.collect("behaviour" + (counter++), boxes);
  }

}
