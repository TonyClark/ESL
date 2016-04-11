package ast.refs;

import actors.Actor;

public class Head extends Ref {

  Ref ref;

  public Head(Ref ref) {
    super();
    this.ref = ref;
  }

  public Object ref(Actor a) {
    list.Cons<Object> cons = (list.Cons<Object>) ref.ref(a);
    return cons.getHead();
  }

  public String toString() {
    return "Head(" + ref + ")";
  }

}
