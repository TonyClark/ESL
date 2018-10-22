package ast.monitors.rules;

import java.util.HashSet;
import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.VarTable;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;
import runtime.functions.CodeBox;

public abstract class Pattern extends AST {

  public abstract void compile(Vector<Code> code);

  public abstract void addVarPaths(VarTable table);

  public String getLabel() {
    return toString();
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) { 
  }

  public void DV(HashSet<String> vars) {
  }

  public void FV(HashSet<String> vars) {
  }

  public int maxLocals() {
    return 0;
  }

  public void setPath(String path) {
  }

  public AST subst(AST ast, String name) {
    return this;
  }

  public abstract Type type();

  public abstract AST asTerm();

  public abstract void addDecs(Vector<Dec> decs);
  
  public boolean hasDec(String name,Vector<Dec> decs) {
    for(Dec dec : decs) {
      if(dec.getName().equals(name))
        return true;
    }
    return false;
  }

}
