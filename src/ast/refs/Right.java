package ast.refs;

import runtime.actors.Actor;

public class Right extends Ref {

  int id;

  public Right(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.right(id);
  }

  public String toString() {
    return id + "right()";
  }

}
