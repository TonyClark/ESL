package ast.actors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.data.Str;
import ast.tests.BArm;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Null;
import instrs.Pop;
import instrs.PopDynamic;
import instrs.PopFrame;
import instrs.Return;
import instrs.SetDynamic;
import instrs.SetFrame;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "exports", "bindings", "init", "arms" })

public class Act extends AST {

  public String    name;
  public String[]  exports;
  public Binding[] bindings;
  public AST       init;
  public BArm[]    arms;

  public Act() {
  }

  public Act(String name, String[] exports, Binding[] bindings, AST init, BArm[] arms) {
    super();
    this.name = name;
    this.exports = exports;
    this.bindings = bindings;
    this.init = init;
    this.arms = arms;
  }

  public String toString() {
    return "Act(" + name + "," + exports + "," + init + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // An act definition returns a behaviour. The bindings in the behaviour must be constructed
    // as recursive bindings *and* be dynamic variables so that '.' can find them. Therefore,
    // compile a behaviour as though it were constructed in the context of a letrec, but force
    // the bindings to be dynamic...

    for (Binding b : bindings) {
      dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
      code.add(new Null());
      code.add(new NewDynamic());
    }
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code);
      code.add(new SetDynamic(lookup(b.name, dynamics).getIndex()));
      code.add(new Pop());
    }
    orderExports(dynamics);
    compileBehaviour(locals, dynamics, code);
    // Remove the dynamics...
    for (Binding b : bindings) {
      code.add(new PopDynamic());
    }
  }

  public void compileBehaviour(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // Compilation of a behaviour produces a closure-like value that captures the current
    // dynamics and waits to be transformed into an actor via 'new'.

    Vector<Instr> bodyCode = new Vector<Instr>();
    HashSet<String> dv = new HashSet<String>();
    desugar().DV(dv);
    // Message will be local 0 in the stack frame...
    locals = new Nil<FrameVar>().cons(new FrameVar("$message", 0));
    bodyCode.add(new instrs.FrameVar(0));
    new Fun("", new String[] {}, new ast.control.Error(new Str("ran out of behaviour arms."))).compile(locals, dynamics, bodyCode);
    desugar().compile(locals, dynamics, bodyCode);
    bodyCode.add(new instrs.Apply(2));
    bodyCode.add(new Return());
    int initIndex = bodyCode.size();
    init.compile(locals, dynamics, bodyCode);
    bodyCode.add(new PopFrame());
    // Set the locals + 1 since the message is the first local...
    code.add(new instrs.Behaviour(name, exports, initIndex, new CodeBox(maxLocals() + 1, bodyCode)));
  }

  private void orderExports(List<DynamicVar> dynamics) {
    String[] newExports = new String[exports.length];
    for (String export : exports) {
      DynamicVar dynamic = lookup(export, dynamics);
      if (dynamic == null)
        throw new java.lang.Error("cannot find dyanamic " + export);
      else newExports[dynamic.getIndex()] = export;
    }
    exports = newExports;
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
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : bindings) {
      bound.add(b.name);
    }
    for (Binding b : bindings) {
      HashSet<String> free = new HashSet<String>();
      b.value.FV(free);
      free.removeAll(bound);
      vars.addAll(free);
    }
    HashSet<String> free = new HashSet<String>();
    desugar().FV(vars);
    init.FV(vars);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public int maxLocals() {
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    int maxLocals = init.maxLocals() + desugar().maxLocals() + bindings.length;
    int valueLocals = 0;
    for (Binding b : bindings)
      valueLocals = Math.max(valueLocals, b.value.maxLocals());
    return maxLocals + valueLocals;
  }

  public void DV(HashSet<String> vars) {
    // Which free vars will need to be dynamic?
    FV(vars);
    for (Binding b : bindings)
      vars.add(b.name);
  }

  public AST subst(AST ast, String name) {
    return new Act(this.name, exports, substBindings(ast, name), init.subst(ast, name), substArms(ast, name));
  }

  private BArm[] substArms(AST ast, String name) {
    BArm[] as = new BArm[arms.length];
    for (int i = 0; i < as.length; i++) {
      as[i] = arms[i].subst(ast, name);
    }
    return as;
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = new Binding(bindings[i].getName(), bindings[i].getValue().subst(ast, name));
    return bs;
  }

}
