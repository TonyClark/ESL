package ast.refs;

import actors.Actor;

public class Left extends Ref {

  int id;

  public Left(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.left(id);
  }

  public String toString() {
    return "Left(" + id + ")";
  }
}
