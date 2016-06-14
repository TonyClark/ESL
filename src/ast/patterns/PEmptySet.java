package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.refs.Ref;
import ast.tests.If;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class PEmptySet extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new ast.tests.IsEmptyBag(value), success, new Apply(fail));
  }

  public String toString() {
    return "PEmptySet()";
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.IsEmptySet(getLine(), ref),locals, dynamics);
  }
}
