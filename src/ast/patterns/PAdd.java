package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.refs.Ref;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "left", "right" })

public class PAdd extends Pattern {

  static int     addId = 0;

  public Pattern left;
  public Pattern right;

  public PAdd() {
  }

  public PAdd(Pattern left, Pattern right) {
    super();
    this.left = left;
    this.right = right;
  }

  public void vars(HashSet<String> vars) {
    left.vars(vars);
    right.vars(vars);
  }

  public void bound(Vector<String> vars) {
    left.bound(vars);
    right.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int id = addId++;
    code.add(new instrs.patterns.TryAdd(getLine(), id, ref), locals, dynamics);
    left.compile(locals, dynamics, new ast.refs.Left(id), code);
    right.compile(locals, dynamics, new ast.refs.Right(id), code);
  }

}
