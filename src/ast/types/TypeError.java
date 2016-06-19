package ast.types;

import ast.AST;

public class TypeError extends Error {

  AST exp;

  public TypeError(AST exp,String message) {
    super("TypeError in " + exp + "\n" + message);
    this.exp = exp;
  }

}
