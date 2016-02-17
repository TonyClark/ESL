package actors;

import list.List;

public class Behaviour {

  String        name;

  // A behaviour acts link a closure. It closes in the dynamic chain...

  List<Dynamic> dynamics;

  // The index to jump to when an actor is created...

  int           initIndex;

  // A behaviour handles messages via a code box...

  CodeBox       code;

  public Behaviour(String name, List<Dynamic> dynamics, int initIndex, CodeBox codebox) {
    this.name = name;
    this.dynamics = dynamics;
    this.initIndex = initIndex;
    this.code = codebox;
  }

  public int getInitIndex() {
    return initIndex;
  }

  public List<Dynamic> getDynamics() {
    return dynamics;
  }

  public CodeBox getCode() {
    return code;
  }

  public String toString() {
    return "Behaviour(" + name + ")";
  }

  public String getName() {
    return name;
  }

  public CodeBox getTimeHandlingCode() {
    return code.getTimeHandlingCode();
  }

}
