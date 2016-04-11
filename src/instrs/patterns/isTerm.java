package instrs.patterns;

import actors.Actor;
import actors.Term;
import ast.refs.Ref;
import instrs.Instr;

public class isTerm extends Instr {

  Ref    ref;
  String name;
  int    arity;

  public isTerm(Ref ref, String name, int arity) {
    super();
    this.ref = ref;
    this.name = name;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    Object o = ref.ref(actor);
    if (o instanceof Term) {
      Term t = (Term) o;
      if (!t.getName().equals(name) || t.getValues().length != arity) actor.fail();
    } else actor.fail();
  }

  public String toString() {
    return "IsTerm(" + ref + "," + name + "," + arity + ")";
  }

}
