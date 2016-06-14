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
import ast.tests.IsNull;
import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class PNull extends Pattern {

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isNull(getLine(),ref),locals, dynamics);
  }
}
