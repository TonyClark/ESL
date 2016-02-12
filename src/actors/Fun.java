package actors;

import list.List;

public class Fun {

  int           arity;
  List<Dynamic> dynamics;
  CodeBox       code;

  public Fun(int arity, List<Dynamic> dynamics, CodeBox code) {
    super();
    this.arity = arity;
    this.dynamics = dynamics;
    this.code = code;
  }

  public String toString() {
    return "Fun(" + arity + "," + dynamics + "," + code + ")";
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
}
