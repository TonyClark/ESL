package actors;

import list.List;

public class Behaviour {

  // The number of arguments to the behaviour...

  int           arity;

  // A behaviour acts link a closure. It closes in the dynamic chain...

  List<Dynamic> dynamics;

  // A behaviour handles messages via a code box...

  CodeBox       code;

  public Behaviour(int arity, List<Dynamic> dynamics, CodeBox codebox) {
    this.arity = arity;
    this.dynamics = dynamics;
    this.code = codebox;
  }

  public List<Dynamic> getDynamics() {
    return dynamics;
  }

  public CodeBox getCode() {
    return code;
  }

  public String toString() {
    return "Behaviour(" + dynamics + "," + code + ")";
  }

  public int getArity() {
    return arity;
  }

}
