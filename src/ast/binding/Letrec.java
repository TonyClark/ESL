package ast.binding;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
import instrs.vars.SetFrame;
import list.List;

@BoaConstructor(fields = { "bindings", "exp" })

public class Letrec extends AST implements DecContainer {

  public Binding[] bindings;
  public AST       exp;

  public Letrec() {
  }

  public Letrec(int lineStart, int lineEnd, Binding[] bindings, AST exp) {
    super(lineStart, lineEnd);
    this.bindings = bindings;
    this.exp = exp;
  }

  private boolean binds(String name) {
    for (Binding b : bindings) {
      if (b.getName().equals(name)) return true;
    }
    return false;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

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

    bindings = Binding.mergeBindings(bindings);

    for (Binding b : Binding.valueBindings(bindings)) {
      if (isDynamic(b.name)) {
        code.add(new Null(getLineStart()), locals, dynamics);
        code.add(new NewDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
      } else {
        locals = locals.cons(new FrameVar(b.name, locals.length()));
      }
    }
    for (Binding b : Binding.valueBindings(bindings)) {
      b.getValue().compile(locals, dynamics, code, false);
      if (isDynamic(b.name)) {
        code.add(new SetDynamic(getLineStart(), lookup(b.name, dynamics).getIndex()), locals, dynamics);
        code.add(new Pop(getLineStart()), locals, dynamics);
      } else {
        code.add(new SetFrame(getLineStart(), lookup(b.name, locals).getIndex()), locals, dynamics);
        code.add(new Pop(getLineStart()), locals, dynamics);
      }
    }
    exp.compile(locals, dynamics, code, isLast);
    // Remove the dynamics...
    for (Binding b : Binding.valueBindings(bindings)) {
      if (isDynamic(b.name)) {
        code.add(new PopDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.getTail();
      }
    }
  }

  public void DV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : Binding.valueBindings(bindings))
      bound.add(b.name);
    for (Binding b : Binding.valueBindings(bindings)) {
      HashSet<String> dv = new HashSet<String>();
      b.DV(dv);
      dv.removeAll(bound);
      vars.addAll(dv);
    }
    exp.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : Binding.valueBindings(bindings)) {
      bound.add(b.name);
    }
    for (Binding b : Binding.valueBindings(bindings)) {
      HashSet<String> free = new HashSet<String>();
      b.FV(free);
      free.removeAll(bound);
      vars.addAll(free);
    }
    HashSet<String> free = new HashSet<String>();
    exp.FV(free);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public String getLabel() {
    return "letrec :: " + getType();
  }

  private boolean isDynamic(String name) {
    // A name is dynamic in the binding values if it is captured by
    // a closure...
    for (Binding b : Binding.valueBindings(bindings)) {
      HashSet<String> fv = new HashSet<String>();
      b.value.DV(fv);
      if (fv.contains(name)) return true;
    }
    HashSet<String> fv = new HashSet<String>();
    exp.DV(fv);
    return fv.contains(name);
  }

  public int maxLocals() {
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    int maxLocals = exp.maxLocals() + Binding.valueBindings(bindings).length;
    int valueLocals = 0;
    for (Binding b : Binding.valueBindings(bindings))
      valueLocals = Math.max(valueLocals, b.getValue().maxLocals());
    return maxLocals + valueLocals;
  }

  public void setPath(String path) {
    for (Binding b : bindings)
      b.setPath(path);
    exp.setPath(path);
  }

  public AST subst(AST ast, String name) {
    AST letrec = new Letrec(getLineStart(), getLineEnd(), substBindings(ast, name), binds(name) ? exp : exp.subst(ast, name));
    return letrec;
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++) {
      bs[i] = binds(name) ? bindings[i] : bindings[i].subst(ast, name);
    }
    return bs;
  }

  public String toString() {
    return "Letrec(" + Arrays.toString(bindings) + "," + exp + ")";
  }

  public Type type(Env<String, Type> env) {
    setType(exp.type(Binding.typeBindingsRec(bindings, env)));
    return getType();
  }

  public DeclaringLocation[] getContainedDecs() {
    return bindings;
  }

}
