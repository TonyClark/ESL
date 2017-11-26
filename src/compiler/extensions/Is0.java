package compiler.extensions;

import ast.general.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;
import runtime.functions.CodeBox;

public class Is0 extends ApplyOp {

  public Is0(int lineStart, int lineEnd, AST... args) {
    super(lineStart, lineEnd, args);
  }

  public int maxLocals() {
    return 0;
  }

  public void compile(AST operator, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    args[0].compile(locals, dynamics, code, isLast);
    code.add(new instrs.tests.Is0(getLineStart()), locals, dynamics);
  }
}
