package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.refs.Ref;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "head", "tail" })

public class PBagCons extends Pattern {

  static int     bagId = 0;

  public Pattern head;
  public Pattern tail;

  public PBagCons() {
  }

  public PBagCons(Pattern head, Pattern tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PBagCons(" + head + "," + tail + ")";
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public void bound(Vector<String> vars) {
    head.bound(vars);
    tail.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int id = bagId++;
    code.add(new instrs.patterns.TryBag(getLine(), id, ref), locals, dynamics);
    head.compile(locals, dynamics, new ast.refs.BagElement(id), code);
    tail.compile(locals, dynamics, new ast.refs.BagRest(id), code);
  }

}
