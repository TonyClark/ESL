package ast.data;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.binding.Binding;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "bindings" })

public class Record extends AST {

  public Binding[] bindings;

  public Record() {
  }

  public Record(Binding[] bindings) {
    super();
    this.bindings = bindings;
  }

  public String toString() {
    return "Record(" + Arrays.toString(bindings) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code);
      code.add(new instrs.Field(b.name));
    }
    code.add(new instrs.Record(bindings.length));
  }

  public void FV(HashSet<String> vars) {
    for (Binding b : bindings)
      b.value.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (Binding b : bindings)
      b.value.DV(vars);
  }

  public int maxLocals() {
    int maxLocals = 0;
    for (Binding b : bindings)
      maxLocals = Math.max(maxLocals, b.value.maxLocals());
    return maxLocals;
  }

  public AST subst(AST ast, String name) {
    return new Record(substBindings(ast, name));
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = new Binding(bindings[i].getName(), bindings[i].getValue().subst(ast, name));
    return bs;
  }

}
