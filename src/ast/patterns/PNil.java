package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.data.Apply;
import ast.tests.If;
import ast.tests.IsNil;
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
