package ast.types;

import ast.AST;
import values.Located;

public class TypeError extends Error implements Located {

  int lineStart;
  int lineEnd;

  public TypeError(int lineStart, int lineEnd, String message) {
    super(message);
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

}
