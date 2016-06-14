package instrs.patterns;

import actors.Actor;
import actors.Key;
import actors.Term;
import ast.refs.Ref;
import instrs.Instr;

public class isTerm extends Instr {

  Ref ref;
  Key name;
  int arity;

  public isTerm(int line, Ref ref, Key name, int arity) {
    super(line);
    this.ref = ref;
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Term) {
      Term t = (Term) o;
      if (t.getName() != name || t.getValues().length != arity) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return pprint("ISTERM",name.getString(),arity,ref);
  }

}
