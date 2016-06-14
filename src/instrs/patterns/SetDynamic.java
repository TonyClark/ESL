package instrs.patterns;

import actors.Actor;
import ast.refs.Ref;
import instrs.Instr;

public class SetDynamic extends Instr {

  Ref ref;
  int index;

  public SetDynamic(int line, Ref ref, int index) {
    super(line);
    this.ref = ref;
    this.index = index;
  }

  public void perform(Actor actor) {
    actor.setDynamic(index, ref.ref(actor));
  }

  public String toString() {
    return pprint("SETDYNAMIC",ref,index);
  }

}
