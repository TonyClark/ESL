package ast.refs;

import runtime.actors.Actor;
import runtime.data.Term;

public class TermRef extends Ref {

  Ref ref;
  int index;

  public TermRef(Ref ref, int index) {
    super();
    this.ref = ref;
    this.index = index;
  }

  public Object ref(Actor a) {
    Term term = (Term) ref.ref(a);
    return term.getValues()[index];
  }

  public String toString() {
    return ref + ".ref(" + index + ")";
  }

}
