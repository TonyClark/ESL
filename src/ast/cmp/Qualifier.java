package ast.cmp;

import java.util.HashSet;

import ast.AST;
import ast.types.Type;
import env.Env;

public abstract class Qualifier {

  public abstract void FV(HashSet<String> vars);

  public abstract void vars(HashSet<String> vars);

  public abstract AST desugar(AST value);

  public abstract void setPath(String path);

  public abstract Env<String, Type> bind(Env<String, Type> env);

}
