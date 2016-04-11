package ast.actors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.tests.BArm;
import ast.tests.Case;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.apply.PopFrame;
import instrs.apply.Return;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
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

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {

    // An act definition returns a behaviour. The bindings in the behaviour must be constructed
    // as recursive bindings *and* be dynamic variables so that '.' can find them. Therefore,
    // compile a behaviour as though it were constructed in the context of a letrec, but force
    // the bindings to be dynamic...

    bindings = Binding.mergeBindings(bindings);

    for (Binding b : bindings) {
      dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
      code.add(new Null());
      code.add(new NewDynamic());
    }
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code, false);
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
    // Message will be local 0 in the stack frame...
    locals = new Nil<FrameVar>().cons(new FrameVar("$0", 0));
    bodyCode.add(new instrs.vars.FrameVar(0));
    Case handlers = new Case(new AST[] {}, arms);
    bodyCode.add(new instrs.patterns.SetPatternValues(1));
    handlers.compileArms(locals, dynamics, bodyCode, true);
    bodyCode.add(new Return());
    int initIndex = bodyCode.size();
    init.compile(locals, dynamics, bodyCode, false);
    bodyCode.add(new PopFrame());
    // Set the locals + 1 since the message is the first local...
    code.add(new instrs.data.Behaviour(name, exports, initIndex, new CodeBox(maxLocals() + 1, bodyCode)));
  }

  private void orderExports(List<DynamicVar> dynamics) {
    String[] newExports = new String[dynamics.length()];
    for (String export : exports) {
      if (export != null) {
        DynamicVar dynamic = lookup(export, dynamics);
        if (dynamic == null)
          throw new java.lang.Error("cannot find dyanamic " + export);
        else newExports[dynamic.getIndex()] = export;
      }
    }
    exports = newExports;
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : bindings) {
      bound.add(b.name);
    }
    for (Binding b : bindings) {
      HashSet<String> free = new HashSet<String>();
      b.FV(free);
      free.removeAll(bound);
      vars.addAll(free);
    }
    HashSet<String> free = new HashSet<String>();
    for(BArm arm : arms)
      arm.FV(vars);
    init.FV(vars);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public int maxLocals() {
    
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    
    int maxLocals = init.maxLocals() + bindings.length;
    for(BArm arm : arms)
      maxLocals+= arm.maxLocals();
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
      bs[i] = bindings[i].subst(ast, name);
    return bs;
  }

}
