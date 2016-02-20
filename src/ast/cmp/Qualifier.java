package ast.cmp;

import java.util.HashSet;

import ast.AST;

public abstract class Qualifier {

  public abstract void FV(HashSet<String> vars);

  public abstract void vars(HashSet<String> vars);

  public abstract AST desugar(AST value);

}
