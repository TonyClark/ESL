package ast.refs;

import actors.Actor;

public class Tail extends Ref {

  Ref ref;

  public Tail(Ref ref) {
    super();
    this.ref = ref;
  }

  public Object ref(Actor a) {
    list.Cons<Object> cons = (list.Cons<Object>) ref.ref(a);
    return cons.getTail();
  }

  public String toString() {
    return "Tail(" + ref + ")";
  }

}
