package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import actors.CodeBox;
import ast.binding.declarations.DeclaringLocation;
import ast.refs.Ref;
import ast.types.Forall;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "pattern", "types" })
public class PApplyType extends Pattern {

  public Pattern pattern;
  public Type[]  types;

  public PApplyType() {
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    return pattern.bind(env, type);
  }

  public void bound(Vector<String> vars) {
    pattern.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    pattern.compile(locals, dynamics, ref, code);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    pattern.type(env, (env1, t) ->
    {
      if (t instanceof Forall) {
        Forall forall = (Forall) t;
        setType(forall.apply(types));
        cont.accept(env, getType());
      } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a generic type");
    });
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
  }

  public Type getDeclaredType() {
    Forall forall = (Forall) pattern.getDeclaredType();
    return forall.apply(types);
  }

  public void processDeclarations(Env<String, Type> env) {
    pattern.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    return pattern.getContainedDecs();
  }

}
