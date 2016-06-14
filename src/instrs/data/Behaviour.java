package instrs.data;

import java.util.Arrays;
import java.util.Hashtable;

import actors.Actor;
import actors.CodeBox;
import actors.Key;
import instrs.Instr;

public class Behaviour extends Instr {

  String  name;
  Key[]   exports;
  int     initIndex;
  CodeBox code;

  public Behaviour(int line,  String name, Key[] exports, int initIndex, CodeBox code) {
    super(line);
    this.name = name;
    this.exports = exports;
    this.initIndex = initIndex;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Behaviour(name, exports, actor.getDynamics(), initIndex, code));
  }

  public String toString() {
   return pprint("BEHAVIOUR",name);
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    code.collect("behaviour-" + name, boxes);
  }

}
