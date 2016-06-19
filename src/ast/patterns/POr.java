package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.jumps.Skip;
import instrs.patterns.Try;
import list.List;

@BoaConstructor(fields = { "alt1", "alt2" })

public class POr extends Pattern {

  public Pattern alt1;
  public Pattern alt2;

  public POr() {
  }

  public POr(Pattern alt1, Pattern alt2) {
    super();
    this.alt1 = alt1;
    this.alt2 = alt2;
  }

  public String toString() {
    return "POr(" + alt1 + "," + alt2 + ")";
  }

  public void vars(HashSet<String> vars) {
    alt1.vars(vars);
    alt2.vars(vars);
  }

  public void bound(Vector<String> vars) {
    alt1.bound(vars);
    alt2.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int l1 = code.getCode().size();
    Try choice = new Try(getLine(), 0, false);
    code.add(choice, locals, dynamics);
    alt1.compile(locals, dynamics, ref, code);
    Skip skip1 = new Skip(getLine(), 0);
    code.add(skip1, locals, dynamics);
    int l2 = code.getCode().size();
    alt2.compile(locals, dynamics, ref, code);
    Skip skip2 = new Skip(getLine(), 0);
    code.add(skip2, locals, dynamics);
    int l3 = code.getCode().size();
    code.add(new instrs.patterns.Fail(getLine()), locals, dynamics);
    int l4 = code.getCode().size();
    choice.setOffset((l2 - l1) - 1);
    skip1.setCount((l4 - l2) + 1);
    skip2.setCount((l4 - l3) + 1);
  }

  public Type type(Env<String, Type> env) {
    Type t1 = alt1.type(env);
    Type t2 = alt2.type(env);
    if (t1.bind(t2) == null && t2.bind(t2) == null)
      throw new TypePatternError(this, "incompatible types " + t1 + " " + t2);
    else {
      if (t1.bind(t2) != null)
        return t1;
      else return t2;
    }

  }

  @Override
  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    // TODO Auto-generated method stub
    return null;
  }

}
