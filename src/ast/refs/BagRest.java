package ast.refs;

import actors.Actor;

public class BagRest extends Ref {

  int id;

  public BagRest(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.bagRest(id);
  }

  public String toString() {
    return "BagRest(" + id + ")";
  }

}
