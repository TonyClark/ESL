package ast.refs;

import actors.Actor;

public class BagElement extends Ref {

  int id;

  public BagElement(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.bagElement(id);
  }

  public String toString() {
    return id + ".choose()";
  }

}
