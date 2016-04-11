package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.refs.Ref;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.jumps.Skip;
import instrs.patterns.Try;
import list.List;

@BoaConstructor(fields = { "alt1", "alt2" })

public class POr extends Pattern {

  public Pattern alt1;
  public Pattern alt2;

  public POr() {
  }

  public POr(Pattern alt1, Pattern alt2) {
    super();
    this.alt1 = alt1;
    this.alt2 = alt2;
  }

  public String toString() {
    return "POr(" + alt1 + "," + alt2 + ")";
  }

  public void vars(HashSet<String> vars) {
    alt1.vars(vars);
    alt2.vars(vars);
  }

  public void bound(Vector<String> vars) {
    alt1.bound(vars);
    alt2.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, Vector<Instr> code) {
    int l1 = code.size();
    Try choice = new Try(0, false);
    code.addElement(choice);
    alt1.compile(locals, dynamics, ref, code);
    Skip skip1 = new Skip(0);
    code.add(skip1);
    int l2 = code.size();
    alt2.compile(locals, dynamics, ref, code);
    Skip skip2 = new Skip(0);
    code.add(skip2);
    int l3 = code.size();
    code.add(new instrs.patterns.Fail());
    int l4 = code.size();
    choice.setOffset((l2 - l1) - 1);
    skip1.setCount((l4 - l2) + 1);
    skip2.setCount((l4 - l3) + 1);
  }

}
