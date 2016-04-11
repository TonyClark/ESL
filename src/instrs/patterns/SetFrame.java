package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class SetFrame extends Instr {

  Ref ref;
  int index;

  public SetFrame(Ref ref, int index) {
    this.ref = ref;
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.setFrameVar(index, ref.ref(actor));
  }

  public String toString() {
    return "SetFrame(" + ref + "," + index + ")";
  }

}
