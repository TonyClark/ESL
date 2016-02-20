package ast.patterns;

import java.util.HashSet;

import ast.AST;

public abstract class Pattern {

  public abstract void vars(HashSet<String> vars);

  public abstract AST desugar(AST value, AST success, AST fail);

  public boolean binds(String name) {
    HashSet<String> vars = new HashSet<String>();
    vars(vars);
    return vars.contains(name);
  }

}
