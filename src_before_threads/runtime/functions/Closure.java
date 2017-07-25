package runtime.functions;

import list.List;
import runtime.actors.Actor;
import runtime.data.Dynamic;

public class Closure implements Fun {

  String        name;
  int           arity;
  List<Dynamic> dynamics;
  CodeBox       code;
  Actor         self;

  public Closure(String name, int arity, List<Dynamic> dynamics, CodeBox code, Actor self) {
    super();
    this.name = name;
    this.arity = arity;
    this.dynamics = dynamics;
    this.code = code;
    this.self = self;
  }

  public String toString() {
    return name;
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
    if (arity == getArity()) {
      actor.closeFrame(code.locals - arity, code, dynamics, null);
      actor.setSelf(self);
    } else throw new Error("function " + name + " expects " + getArity() + " but supplied with " + arity);
  }

  public void apply(Actor actor, Actor self, int arity) {
    if (arity == getArity()) {
      actor.closeFrame(code.locals - arity, code, dynamics, null);
      actor.setSelf(self);
    } else throw new Error("function " + name + " expects " + getArity() + " but supplied with " + arity);
  }

  public Actor getSelf() {
    return self;
  }

  public void setSelf(Actor self) {
    this.self = self;
  }
}
