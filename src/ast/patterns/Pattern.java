package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.data.BinExp;
import ast.data.Fun;
import ast.refs.Ref;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;

public abstract class Pattern {

  public abstract void vars(HashSet<String> vars);

  public abstract void bound(Vector<String> vars);

  public boolean binds(String name) {
    HashSet<String> vars = new HashSet<String>();
    vars(vars);
    return vars.contains(name);
  }

  public static AST consExp(AST head, AST tail) {
    return new BinExp(head, ":", tail);
  }

  public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, Vector<Instr> code);

}
