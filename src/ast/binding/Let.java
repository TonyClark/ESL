package ast.binding;

import java.util.Arrays;
import java.util.HashSet;

import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetFrame;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "bindings", "exp" })

public class Let extends AST implements DecContainer {

  public Binding[] bindings;
  public AST       exp;

  public Let() {
  }

  public Let(int lineStart, int lineEnd, Binding[] bindings, AST exp) {
    super(lineStart, lineEnd);
    this.bindings = bindings;
    this.exp = exp;
  }

  public String toString() {
    return "Let(" + Arrays.toString(bindings) + "," + exp + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    bindings = Binding.mergeBindings(bindings);

    HashSet<String> DV = new HashSet<String>();
    exp.DV(DV);

    for (Binding b : Binding.valueBindings(bindings)) {
      if (DV.contains(b.name)) {
        b.getValue().compile(locals, dynamics, code, false);
        code.add(new NewDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
      } else {
        b.getValue().compile(locals, dynamics, code, false);
        locals = locals.cons(new FrameVar(b.name, locals.length()));
        code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
        code.add(new Pop(getLineStart()), locals, dynamics);
      }
    }
    exp.compile(locals, dynamics, code, isLast);
    // Remove the dynamics...
    for (Binding b : Binding.valueBindings(bindings)) {
      if (DV.contains(b.name)) {
        code.add(new PopDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.getTail();
      }
    }
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    HashSet<String> bound = new HashSet<String>();
    exp.FV(free);
    for (Binding b : Binding.valueBindings(bindings)) {
      b.FV(vars);
      bound.add(b.name);
    }
    free.removeAll(bound);
    vars.addAll(free);
  }

  public void DV(HashSet<String> vars) {
    for (Binding b : Binding.valueBindings(bindings))
      b.DV(vars);
    HashSet<String> dv = new HashSet<String>();
    exp.DV(dv);
    for (Binding b : Binding.valueBindings(bindings))
      dv.remove(b.name);
    vars.addAll(dv);
  }

  public int maxLocals() {
    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...
    int maxLocals = exp.maxLocals() + Binding.valueBindings(bindings).length;
    int valueLocals = 0;
    for (Binding b : Binding.valueBindings(bindings)) {
      valueLocals = Math.max(valueLocals, b.getValue().maxLocals());
    }
    return maxLocals + valueLocals;
  }

  public AST subst(AST ast, String name) {
    return new Let(getLineStart(), getLineEnd(), substBindings(ast, name), binds(name) ? exp : exp.subst(ast, name));
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
      bs[i] = bindings[i].subst(ast, name);
    return bs;
  }

  public void setPath(String path) {
    for (Binding b : bindings)
      b.setPath(path);
    exp.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    setType(exp.type(Binding.typeBindingsPar(bindings, env)));
    return getType();
  }

  public String getLabel() {
    return "let :: " + getType();
  }

  public DeclaringLocation[] getContainedDecs() {
    return bindings;
  }

}
