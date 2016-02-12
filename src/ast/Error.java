package ast;

import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class Error extends AST {

  AST message;

  public Error(AST message) {
    this.message = message;
  }

  @Override
  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    // TODO Auto-generated method stub

  }

  @Override
  public void FV(HashSet<String> vars) {
    // TODO Auto-generated method stub

  }

  @Override
  public void DV(HashSet<String> vars) {
    // TODO Auto-generated method stub

  }

  @Override
  public int maxLocals() {
    // TODO Auto-generated method stub
    return 0;
  }

}
