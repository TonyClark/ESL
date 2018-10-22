package compiler.extensions;

import ast.data.Ref;
import ast.general.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;
import runtime.functions.CodeBox;

public class KBAsList extends ApplyOp {

  public KBAsList(int lineStart, int lineEnd, AST... args) {
    super(lineStart, lineEnd, args);
  }

  public int maxLocals() {
    return 0;
  }

  public void compile(AST operator, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    Ref ref = (Ref) operator;
    // Compile the knowledge base, the fact and then the time...
    ref.getNamespace().compile(locals, dynamics, code, isLast);
    code.add(new instrs.kb.AsList(getLineStart()), locals, dynamics);
  }
}
