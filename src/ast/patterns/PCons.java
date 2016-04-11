package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.lists.Head;
import ast.lists.Tail;
import ast.refs.Ref;
import ast.tests.If;
import ast.tests.IsCons;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "head", "tail" })

public class PCons extends Pattern {

  public Pattern head;
  public Pattern tail;

  public PCons() {
  }

  public PCons(Pattern head, Pattern tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PCons(" + head + "," + tail + ")";
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public void bound(Vector<String> vars) {
    head.bound(vars);
    tail.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, Vector<Instr> code) {
    code.add(new instrs.patterns.isCons(ref));
    head.compile(locals, dynamics, new ast.refs.Head(ref), code);
    tail.compile(locals, dynamics, new ast.refs.Tail(ref), code);
  }

}
