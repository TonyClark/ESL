package ast.cmp;

import java.util.HashSet;

import ast.AST;
import ast.lists.Map;
import ast.patterns.Pattern;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "pattern", "exp" })

public class BQual extends Qualifier {

  public Pattern pattern;
  public AST     exp;

  public BQual() {
  }

  public String toString() {
    return "BQual(" + pattern + "," + exp + ")";
  }

  public void FV(HashSet<String> vars) {
    exp.FV(vars);
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
  }

  public AST desugar(AST value) {
    return new Map("", pattern, exp, value);
  }

  public void setPath(String path) {
    exp.setPath(path);
  }

  public Env<String, Type> bind(Env<String, Type> env) {
    Type type = exp.type(env);
    if (type instanceof ast.types.List) {
      ast.types.List list = (ast.types.List) type;
      return pattern.bind(env, list.getType());
    } else throw new TypeError(exp, "expecting a list type " + type);
  }

}
