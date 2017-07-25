package compiler.extensions;

import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.types.TaggedFun;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.apply.StartCall;
import instrs.control.Nop;
import instrs.data.False;
import instrs.data.Pop;
import instrs.data.True;
import instrs.jumps.Goto;
import instrs.jumps.Skip;
import instrs.jumps.SkipFalse;
import instrs.jumps.SkipTrue;
import instrs.ops.Head;
import instrs.ops.Tail;
import instrs.vars.SetFrame;
import list.List;
import runtime.functions.CodeBox;

public class Exists extends ApplyOp {

  public Exists(int lineStart, int lineEnd, AST... args) {
    super(lineStart, lineEnd, args);
  }

  public int maxLocals() {
    return 2;
  }

  public void compile(AST operator, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // ... compile predicate...
    // SETFRAME n
    // POP
    // ... compile list ...
    // SETFRAME n+1
    // POP
    // L1: LOCAL n+1
    // ISNIL
    // SKIPT L2
    // STARTCALL
    // LOCAL n+1
    // HEAD
    // LOCAL n
    // APPLY
    // SKIPT L3
    // LOCAL n+1
    // TAIL
    // SETLOCAL n+1
    // JUMP L1
    // L2: FALSE
    // JUMP L4
    // L3: TRUE
    // JUMP L4
    // L4: NOOP

    String predLabel = "existsPred" + Math.random();
    String listLabel = "existsList" + Math.random();
    AST pred = args[0];
    AST list = args[1];
    SkipTrue skipTrue1 = new SkipTrue(getLineStart(), 0);
    SkipTrue skipTrue2 = new SkipTrue(getLineStart(), 0);
    locals = locals.cons(new FrameVar(predLabel, locals.length()));
    locals = locals.cons(new FrameVar(listLabel, locals.length()));
    pred.compile(locals, dynamics, code, isLast);
    code.add(new SetFrame(getLineStart(), locals.length() - 2), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    list.compile(locals, dynamics, code, isLast);
    code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    int start = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new instrs.tests.IsNil(getLineStart()), locals, dynamics);
    int startTrue = code.getCode().size();
    code.add(skipTrue1, locals, dynamics);

    // Compile the application of the predicate recursively since we may be able to optimize it.

    if (pred.getType() instanceof TaggedFun) {
      TaggedFun fun = (TaggedFun) pred.getType();
      Apply nested = new Apply(getLineStart(), getLineEnd(), fun.getFunLabel(), new Var(-1, -1, predLabel, null), new ast.lists.Head(new Var(-1, -1, listLabel, null)));
      nested.compile(locals, dynamics, code, isLast);
    } else {
      // Compile a standard application at this point...
      code.add(new StartCall(getLineStart()), locals, dynamics);
      code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
      code.add(new Head(getLineStart()), locals, dynamics);
      code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 2), locals, dynamics);
      code.add(new instrs.apply.Apply(getLineStart(), 1), locals, dynamics);
    }

    int startFalse = code.getCode().size();
    code.add(skipTrue2, locals, dynamics);
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Tail(getLineStart()), locals, dynamics);
    code.add(new instrs.vars.SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    code.add(new Goto(getLineStart(), start), locals, dynamics);
    skipTrue1.setCount(code.getCode().size() - startTrue);
    code.add(new False(getLineStart()), locals, dynamics);
    code.add(new Skip(getLineStart(), 3), locals, dynamics);
    skipTrue2.setCount(code.getCode().size() - startFalse);
    code.add(new True(getLineStart()), locals, dynamics);
    code.add(new Nop(getLineStart()), locals, dynamics);
  }
}
