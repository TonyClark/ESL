package ast.control;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public class Error extends AST {

  AST message;

  public Error(AST message) {
    this.message = message;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    message.compile(locals, dynamics, code);
    code.add(new instrs.Error());
  }

  public void FV(HashSet<String> vars) {
    message.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    message.DV(vars);
  }

  public int maxLocals() {
    return message.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Error(message.subst(ast, name));
  }

}
