package ast.cmp;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import env.Env;
import values.Located;

public abstract class Qualifier implements Located {

  int lineStart = -1;
  int lineEnd = -1;

  public Qualifier() {
  }

  public Qualifier(int lineStart, int lineEnd) {
    setLineStart(lineStart);
    setLineEnd(lineEnd);
  }

  public int getLineStart() {
    return lineStart;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public abstract void FV(HashSet<String> vars);

  public abstract void vars(HashSet<String> vars);

  public abstract AST desugar(AST value);

  public abstract void setPath(String path);

  public abstract Env<String, Type> bind(Env<String, Type> env);

  public abstract Qualifier subst(AST ast, String name);

}
