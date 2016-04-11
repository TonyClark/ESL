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

  public Behaviour(String name, Key[] exports, int initIndex, CodeBox code) {
    this.name = name;
    this.exports = exports;
    this.initIndex = initIndex;
    this.code = code;
  }

  public void perform(Actor actor) {
    actor.pushStack(new actors.Behaviour(name, exports, actor.getDynamics(), initIndex, code));
  }

  public String toString() {
    return "Behaviour(" + name + "," + Arrays.toString(exports) + "," + initIndex + ")";
  }

  public void collect(Hashtable<String, CodeBox> boxes) {
    code.collect("behaviour-" + name, boxes);
  }

}
