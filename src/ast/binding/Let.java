package ast.binding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Pop;
import instrs.PopDynamic;
import instrs.SetFrame;
import list.List;

@BoaConstructor(fields = { "bindings", "exp" })

public class Let extends AST {

  public Binding[] bindings;
  public AST       exp;

  public Let() {
  }

  public Let(Binding[] bindings, AST exp) {
    this.bindings = bindings;
    this.exp = exp;
  }

  public String toString() {
    return "Let(" + Arrays.toString(bindings) + "," + exp + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {
    HashSet<String> DV = new HashSet<String>();
    exp.DV(DV);
    for (Binding b : bindings) {
      if (DV.contains(b.name)) {
        b.value.compile(locals, dynamics, code);
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
        code.add(new NewDynamic());
      } else {
        b.value.compile(locals, dynamics, code);
        locals = locals.cons(new FrameVar(b.name, locals.length()));
        code.add(new SetFrame(locals.length() - 1));
        code.add(new Pop());
      }
    }
    exp.compile(locals, dynamics, code);
    // Remove the dynamics...
    for (Binding b : bindings) {
      if (DV.contains(b.name)) {
        code.add(new PopDynamic());
      }
    }
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    HashSet<String> bound = new HashSet<String>();
    exp.FV(free);
    for (Binding b : bindings) {
      b.value.FV(vars);
      bound.add(b.name);
    }
    free.removeAll(bound);
    vars.addAll(free);
  }

  public void DV(HashSet<String> vars) {
    for (Binding b : bindings)
      b.value.DV(vars);
    HashSet<String> dv = new HashSet<String>();
    exp.DV(dv);
    for (Binding b : bindings)
      dv.remove(b.name);
    vars.addAll(dv);
  }

  public int maxLocals() {
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    int maxLocals = exp.maxLocals() + bindings.length;
    int valueLocals = 0;
    for (Binding b : bindings)
      valueLocals = Math.max(valueLocals, b.value.maxLocals());
    return maxLocals + valueLocals;
  }

  public AST subst(AST ast, String name) {
    return new Let(substBindings(ast, name), binds(name) ? exp : exp.subst(ast, name));
  }

  private boolean binds(String name) {
    for (Binding b : bindings) {
      if (b.getName().equals(name)) return true;
    }
    return false;
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = new Binding(bindings[i].getName(), bindings[i].getValue().subst(ast, name));
    return bs;
  }

}
