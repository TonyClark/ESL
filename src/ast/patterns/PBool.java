package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.refs.Ref;
import ast.tests.If;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "value" })

public class PBool extends Pattern {

  public boolean value;

  public PBool() {
  }

  public String toString() {
    return "PBool(" + value + ")";
  }

  public void vars(HashSet<String> vars) {
  }

  public void bound(Vector<String> vars) {
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (value)
      code.add(new instrs.patterns.isTrue(getLine(), ref), locals, dynamics);
    else code.add(new instrs.patterns.IsFalse(getLine(), ref), locals, dynamics);
  }

}
