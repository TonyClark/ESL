package ast.refs;

import runtime.actors.Actor;

public class SetRest extends Ref {

  int id;

  public SetRest(int id) {
    super();
    this.id = id;
  }

  public Object ref(Actor a) {
    return a.setRest(id);
  }

  public String toString() {
    return id + ".rest()";
  }

}
