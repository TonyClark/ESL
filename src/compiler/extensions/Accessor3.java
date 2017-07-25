package compiler.extensions;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.ops.TermRef;
import list.List;
import runtime.functions.CodeBox;

public class Accessor3 extends ApplyOp {

  public Accessor3(int lineStart, int lineEnd, AST... args) {
    super(lineStart, lineEnd, args);
  }

  public int maxLocals() {
    return 0;
  }

  public void compile(AST operator, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    args[0].compile(locals, dynamics, code, isLast);
    code.add(new TermRef(getLineStart(), 3), locals, dynamics);
  }
}
