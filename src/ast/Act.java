package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Return;
import instrs.StartCall;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "arms" })

public class Act extends AST {

  public String name;
  public BArm[] arms;

  public Act() {
  }

  public String toString() {
    return "Act(" + name + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // Compilation of a behaviour produces a closure-like value that captures the current
    // dynamics and waits to be transformed into an actor via 'new'.

    Vector<Instr> bodyCode = new Vector<Instr>();
    HashSet<String> dv = new HashSet<String>();
    desugar().DV(dv);
    // Message will be local 0 in the stack frame...
    bodyCode.add(new instrs.FrameVar(0));
    new Fun("", new String[] {}, new ast.Error(new Str("ran out of case arms"))).compile(locals, dynamics, bodyCode);
    desugar().compile(locals, dynamics, bodyCode);
    bodyCode.add(new instrs.Apply(2));
    bodyCode.add(new Return());
    code.add(new instrs.Behaviour(name, new CodeBox(1, bodyCode)));
  }

  public AST desugar() {
    // The body of a behaviour is a function that expects to be supplied with the
    // message value and a failure continuation...
    return desugarArms(0);
  }

  private AST desugarArms(int i) {
    if (i + 1 == arms.length)
      return arms[i].desugar();
    else return combineOr(arms[i].desugar(), desugarArms(i + 1));
  }

  private AST combineOr(AST left, AST right) {
    return new Fun("", new String[] { "$v", "$fail" }, new Apply(left, new Var("$v"), new Fun("", new String[] {}, new Apply(right, new Var("$v"), new Var("$fail")))));
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public int maxLocals() {
    return 0;
  }

  public void DV(HashSet<String> vars) {
    // Which free vars will need to be dynamic?
    FV(vars);
  }

}
