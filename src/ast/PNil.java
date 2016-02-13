package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class PNil extends Pattern {

  public void vars(HashSet<String> vars) {

  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new IsNil(value), success, new Apply(fail));
  }
}
