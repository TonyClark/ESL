package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.AST;
import ast.binding.declarations.DeclaringLocation;
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
import runtime.functions.CodeBox;

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
    Try choice = new Try(getLineStart(), 0, false);
    code.add(choice, locals, dynamics);
    alt1.compile(locals, dynamics, ref, code);
    Skip skip1 = new Skip(getLineStart(), 0);
    code.add(skip1, locals, dynamics);
    int l2 = code.getCode().size();
    alt2.compile(locals, dynamics, ref, code);
    Skip skip2 = new Skip(getLineStart(), 0);
    code.add(skip2, locals, dynamics);
    int l3 = code.getCode().size();
    code.add(new instrs.patterns.Fail(getLineStart()), locals, dynamics);
    int l4 = code.getCode().size();
    choice.setOffset((l2 - l1) - 1);
    skip1.setCount((l4 - l2) + 1);
    skip2.setCount((l4 - l3) + 1);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = alt1.bind(env, type);
    return alt2.bind(env, type);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {

    // Perhaps this should build a union type?

    alt1.type(env, (env1, t1) ->
    {
      alt2.type(env1, (env2, t2) ->
      {
        if (!Type.equals(t1, t2, env1))
          throw new TypePatternError(this, "incompatible types " + t1 + " " + t2);
        else {
          if (Type.equals(t1, t2, env1)) {
            setType(t1);
            cont.accept(env, t1);
          } else cont.accept(env, t2);
        }
      });
    });
  }

  public Type getDeclaredType() {
    return alt1.getDeclaredType();
  }

  public void processDeclarations(Env<String, Type> env) {
    alt1.processDeclarations(env);
    alt2.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    return AST.concatenate(alt1.getContainedDecs(), alt2.getContainedDecs());
  }

  public String pprint() {
    return alt1.pprint() + "|" + alt2.pprint();
  }

}
