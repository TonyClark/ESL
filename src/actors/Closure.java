package actors;

import list.List;

public class Closure implements Fun {

  String        name;
  int           arity;
  List<Dynamic> dynamics;
  CodeBox       code;

  public Closure(String name, int arity, List<Dynamic> dynamics, CodeBox code) {
    super();
    this.name = name;
    this.arity = arity;
    this.dynamics = dynamics;
    this.code = code;
  }

  public String toString() {
    return "<" + name + "/" + arity + ">";
  }

  public int getArity() {
    return arity;
  }

  public List<Dynamic> getDynamics() {
    return dynamics;
  }

  public CodeBox getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public void apply(Actor actor, int arity) {
    if (arity == getArity())
      actor.closeFrame(getCode().getLocals() - getArity(), getCode(), getDynamics(), null);
    else throw new Error("function " + name + " expects " + getArity() + " but supplied with " + arity);
  }
}
