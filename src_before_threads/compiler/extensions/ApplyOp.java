package compiler.extensions;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;
import runtime.functions.CodeBox;
import values.Located;

public abstract class ApplyOp implements Located {

  private int lineStart = -1;
  private int lineEnd   = -1;
  AST[]       args;

  public ApplyOp(int lineStart, int lineEnd, AST... args) {
    setLineStart(lineStart);
    setLineEnd(lineEnd);
    this.args = args;
  }

  abstract public void compile(AST operator, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast);

  abstract public int maxLocals();

  public int getLineStart() {
    return lineStart;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public void setLineEnd(int l) {
    lineEnd = l;
  }

  public void setLineStart(int l) {
    lineStart = l;
  }

}
