package ast;

import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "pattern" })

public class PBind extends Pattern {

  public String  name;
  public Pattern pattern;

  public PBind() {
  }

  public PBind(String name, Pattern pattern) {
    super();
    this.name = name;
    this.pattern = pattern;
  }

  public String toString() {
    return "PBind(" + name + "," + pattern + ")";
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
    vars.add(name);
  }

  public AST desugar(AST value, AST success, AST fail) {
    return pattern.desugar(value, new Let(new Binding[] { new Binding(name, value) }, success), fail);
  }

}
