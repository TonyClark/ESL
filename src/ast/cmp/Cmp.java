package ast.cmp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "exp", "qualifiers" })

public class Cmp extends AST {

  public AST         exp;
  public Qualifier[] qualifiers;

  public Cmp() {
  }

  public String toString() {
    return "Cmp(" + exp + "," + Arrays.toString(qualifiers) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> types, Vector<Instr> code) {
    desugar().compile(locals, types, code);
  }

  public AST desugar() {
    // A comprehension [e | p1 <- e1 ] produces: flatten(for p1 in e1 -> [e])
    // A comprehension [e | p1 <- e1, p2 <- e2] produces: flatten(for p1 in e1 -> flatten(for p2 in e2 -> e)
    // A comprehension [e | p1 <- e1, ?p] produces: flatten(for p1 in e1 -> flatten(if p then [[e]] else []))
    return desugar(0);
  }

  private AST desugar(int i) {
    if (i == qualifiers.length)
      return new ast.lists.List(exp);
    else if (i + 1 == qualifiers.length)
      return qualifiers[i].desugar(exp);
    else return new Apply(new Var("flatten"), qualifiers[i].desugar(desugar(i + 1)));
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    desugar().DV(vars);
  }

  public int maxLocals() {
    return desugar().maxLocals();
  }

}
