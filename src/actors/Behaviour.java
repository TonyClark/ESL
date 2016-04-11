package actors;

import list.List;

public class Behaviour {

  // Behaviour may be anonymous in which case this is the empty string...

  String        name;

  // Behaviours export names that are available via the dynamics...

  Key[]         exports;

  // A behaviour acts link a closure. It closes in the dynamic chain...

  List<Dynamic> dynamics;

  // The index to jump to when an actor is created...

  int           initIndex;

  // A behaviour handles messages via a code box...

  CodeBox       code;

  public Behaviour(String name, Key[] exports, List<Dynamic> dynamics, int initIndex, CodeBox codebox) {
    this.name = name;
    this.exports = exports;
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

  public Key[] getExports() {
    return exports;
  }

  public boolean hasExport(Key name) {
    for (Key n : exports)
      if (n != null && n == name) return true;
    return false;
  }

  public Object ref(Key name) {
    return getDynamic(exportIndex(name));
  }

  private Object getDynamic(int i) {
    return dynamics.nth(i).getValue();
  }

  private int exportIndex(Key name) {
    for (int i = 0; i < exports.length; i++)
      if (name == exports[i]) return i;
    return -1;
  }

}
