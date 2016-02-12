package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import instrs.Null;
import instrs.PopDynamic;
import instrs.SetDynamic;
import instrs.SetFrame;
import list.List;

@BoaConstructor(fields = { "bindings", "exp" })

public class Letrec extends AST {

  public Binding[] bindings;
  public AST       exp;

  public Letrec() {
  }

  public Letrec(Binding[] bindings, AST exp) {
    this.bindings = bindings;
    this.exp = exp;
  }

  public String toString() {
    return "Letrec(" + Arrays.toString(bindings) + "," + exp + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // Compile letrec x = e1; y = e2 in e to the following:
    // if isDynamic(x)
    // then
    // locals := Dynamic(x,0,map incDynamics locals);
    // code.add(NewDynamic(null))
    // else
    // locals := FrameVar(x,nextFrameIndex(locals),locals)
    // code.add(InitLoc(getIndex(x,locals))
    // Same for y
    // compile(e1);
    // if isDynamic(x)
    // then code.add(SetDynamic(dynamicIndex(x,locals)))
    // else code.add(SetLocal(frameIndex(x,locals))
    // same for y

    for (Binding b : bindings) {
      if (isDynamic(b.name)) {
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
        code.add(new Null());
        code.add(new NewDynamic());
      } else {
        locals = locals.cons(new FrameVar(b.name, locals.length()));
      }
    }
    for (Binding b : bindings) {
      b.value.compile(locals, dynamics, code);
      if (isDynamic(b.name))
        code.add(new SetDynamic(lookup(b.name, dynamics).getIndex()));
      else code.add(new SetFrame(lookup(b.name, locals).getIndex()));
    }
    exp.compile(locals, dynamics, code);
    // Remove the dynamics...
    for (Binding b : bindings) {
      if (isDynamic(b.name)) {
        code.add(new PopDynamic());
      }
    }
  }

  private int localIndex(String name, List<Local> locals) {
    if (locals.isNil())
      throw new java.lang.Error("cannot find local named " + name);
    else if (locals.getHead().getName().equals(name))
      return locals.getHead().getIndex();
    else return localIndex(name, locals.getTail());
  }

  private boolean isDynamic(String name) {
    // A name is dynamic in the binding values if it is captured by
    // a closure...
    for (Binding b : bindings) {
      HashSet<String> fv = new HashSet<String>();
      b.value.FV(fv);
      if (fv.contains(name)) return true;
    }
    return false;
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
    exp.FV(free);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public void DV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : bindings)
      bound.add(b.name);
    for (Binding b : bindings) {
      HashSet<String> dv = new HashSet<String>();
      b.value.DV(dv);
      dv.removeAll(bound);
      vars.addAll(dv);
    }
    exp.DV(vars);
  }

  public int maxLocals() {
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    int maxLocals = exp.maxLocals() + bindings.length;
    for (Binding b : bindings)
      maxLocals = Math.max(maxLocals, b.value.maxLocals());
    return maxLocals;
  }

}
