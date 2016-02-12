package ast;

import java.util.HashSet;

public abstract class Pattern {

  public abstract void vars(HashSet<String> vars);

  public abstract AST desugar(AST value, AST success, AST fail);

}
