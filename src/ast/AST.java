package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.BehaviourIndex;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import instrs.Instr;
import list.List;

public abstract class AST {

  public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code);

  // Populate the supplied set with the names of the free variables...

  public abstract void FV(HashSet<String> vars);

  // Populate the supplied set with the names of the dynamic variables. A dynamic
  // variable is a free variable of a closure-like construct...

  public abstract void DV(HashSet<String> vars);

  public static void DV(AST[] asts, HashSet<String> vars) {
    for (AST ast : asts)
      ast.DV(vars);
  }

  // Return the maximum number of locals needed by the receiver...

  public abstract int maxLocals();

  public static int maxLocals(AST[] asts) {
    int maxLocals = 0;
    for (AST ast : asts)
      maxLocals = Math.max(maxLocals, ast.maxLocals());
    return maxLocals;
  }

  public static int maxLocals(BArm[] arms) {
    int maxLocals = 0;
    for (BArm arm : arms)
      maxLocals = Math.max(maxLocals, arm.maxLocals());
    return maxLocals;
  }

  public static <T extends Local> T lookup(String name, List<T> locals) {
    if (locals.isNil())
      return null;
    else if (locals.getHead().getName().equals(name))
      return locals.getHead();
    else return lookup(name, locals.getTail());
  }

}
