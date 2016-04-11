package ast.refs;

import actors.Actor;
import actors.Term;

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
    return "TermRef(" + ref + "," + index + ")";
  }

}
