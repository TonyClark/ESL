package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class PWild extends Pattern {

  public void vars(HashSet<String> vars) {

  }

  public AST desugar(AST value, AST success, AST fail) {
    return success;
  }
}
