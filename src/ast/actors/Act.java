package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.binding.Binding;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.HandlerType;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
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

  String           path;
  public String    name;
  public String[]  exports;
  public Binding[] bindings;
  public AST       init;
  public BArm[]    arms;

  public Act() {
  }

  public Act(int line, String path, String name, String[] exports, Binding[] bindings, AST init, BArm[] arms) {
    setLine(line);
    this.path = path;
    this.name = name;
    this.exports = exports;
    this.bindings = bindings;
    this.init = init;
    this.arms = arms;
  }

  public String toString() {
    return "Act(" + getLine() + "," + name + "," + Arrays.toString(exports) + "," + init + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // An act definition returns a behaviour. The bindings in the behaviour must be constructed
    // as recursive bindings *and* be dynamic variables so that '.' can find them. Therefore,
    // compile a behaviour as though it were constructed in the context of a letrec, but force
    // the bindings to be dynamic...

    bindings = Binding.mergeBindings(bindings);

    for (Binding b : bindings) {
      code.add(new Null(getLine()), locals, dynamics);
      code.add(new NewDynamic(getLine()), locals, dynamics);
      dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
    }
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code, false);
      code.add(new SetDynamic(b.value.getLine(), lookup(b.name, dynamics).getIndex()), locals, dynamics);
      code.add(new Pop(b.value.getLine()), locals, dynamics);
    }
    orderExports(dynamics);
    compileBehaviour(locals, dynamics, code);

    // Remove the dynamics...
    for (Binding b : bindings) {
      code.add(new PopDynamic(getLine()), locals, dynamics);
      dynamics = dynamics.getTail();
    }
  }

  public void compileBehaviour(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {

    // Compilation of a behaviour produces a closure-like value that captures the current
    // dynamics and waits to be transformed into an actor via 'new'.

    CodeBox bodyCode = new CodeBox(path, maxLocals() + 1);
    // Message will be local 0 in the stack frame...
    locals = new Nil<FrameVar>().cons(new FrameVar("$0", 0));
    bodyCode.add(new instrs.vars.FrameVar(getLine(), 0), locals, dynamics);
    Case handlers = new Case(new AST[] {}, arms);
    handlers.setLine(getFirstHandlerLine());
    bodyCode.add(new instrs.patterns.SetPatternValues(getLine(), 1), locals, dynamics);
    handlers.compileArms(locals, dynamics, bodyCode, true);
    bodyCode.add(new Return(getLine()), locals, dynamics);
    int initIndex = bodyCode.getCode().size();
    init.compile(locals, dynamics, bodyCode, false);
    bodyCode.add(new PopFrame(getLine()), locals, dynamics);
    // Set the locals + 1 since the message is the first local...
    code.add(new instrs.data.Behaviour(getLine(), name, toKeys(exports), initIndex, bodyCode), locals, dynamics);
  }

  private int getFirstHandlerLine() {
    if (arms.length == 0)
      return -1;
    else return arms[0].patterns[0].getLine();
  }

  private Key[] toKeys(String[] exports) {
    Key[] keys = new Key[exports.length];
    for (int i = 0; i < exports.length; i++)
      if (exports[i] != null) keys[i] = Key.getKey(exports[i]);
    return keys;
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
    for (BArm arm : arms)
      arm.FV(vars);
    init.FV(vars);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public int maxLocals() {

    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...

    int maxLocals = init.maxLocals() + bindings.length;
    for (BArm arm : arms)
      maxLocals += arm.maxLocals();
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
    return new Act(getLine(), path, this.name, exports, substBindings(ast, name), init.subst(ast, name), substArms(ast, name));
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

  public void setPath(String path) {
    this.path = path;
    for (Binding b : bindings)
      b.setPath(path);
    init.setPath(path);
    for (BArm b : arms)
      b.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    HandlerType[] handlers = new HandlerType[arms.length];
    for (int i = 0; i < arms.length; i++) {
      handlers[i] = arms[i].type(env);
    }
    return new ast.types.Act(handlers);
  }

}
