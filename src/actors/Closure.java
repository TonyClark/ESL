package actors;

import list.List;

public class Closure implements Fun {

  int           arity;
  List<Dynamic> dynamics;
  CodeBox       code;

  public Closure(int arity, List<Dynamic> dynamics, CodeBox code) {
    super();
    this.arity = arity;
    this.dynamics = dynamics;
    this.code = code;
  }

  public String toString() {
    return "Clo(" + arity + "," + dynamics + "," + code + ")";
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

  public void apply(Actor actor, int arity) {
    if (arity == getArity())
      actor.closeFrame(getCode().getLocals() - getArity(), getCode(), getDynamics());
    else throw new Error("function expects " + getArity() + " but supplied with " + arity);
  }
}
