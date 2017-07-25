package ast.refs;

import runtime.actors.Actor;

public class SetElement extends Ref {

  int id;

  public SetElement(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.setElement(id);
  }

  public String toString() {
    return id + ".choose()";
  }

}
