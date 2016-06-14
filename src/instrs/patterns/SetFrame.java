package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class SetFrame extends Instr {

  Ref ref;
  int index;

  public SetFrame(int line, Ref ref, int index) {
    super(line);
    this.ref = ref;
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.setFrameVar(index, ref.ref(actor));
  }

  public String toString() {
    return pprint("SETFRAME",index,ref);
  }

}
