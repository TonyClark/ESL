package ast;

import java.util.Arrays;
import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "patterns" })

public class PTerm extends Pattern {

  public String    name;
  public Pattern[] patterns;

  public PTerm() {
  }

  public String toString() {
    return "PTerm(" + name + "," + Arrays.toString(patterns) + ")";
  }

  public void vars(HashSet<String> vars) {
    for (Pattern p : patterns)
      p.vars(vars);
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new IsTerm(value, name, patterns.length), desugarPatterns(0, value, success, fail), new Apply(fail));
  }

  private AST desugarPatterns(int i, AST value, AST success, AST fail) {
    if (i == patterns.length)
      return success;
    else {
      return patterns[i].desugar(new TermRef(value, i), desugarPatterns(i + 1, value, success, fail), fail);
    }
  }

}
