package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "left", "right" })

public class PAdd extends Pattern {

  static int     addId = 0;

  public Pattern left;
  public Pattern right;

  public PAdd() {
  }

  public PAdd(int lineStart, int lineEnd, Pattern left, Pattern right) {
    super(lineStart, lineEnd);
    this.left = left;
    this.right = right;
  }

  public void vars(HashSet<String> vars) {
    left.vars(vars);
    right.vars(vars);
  }

  public void bound(Vector<String> vars) {
    left.bound(vars);
    right.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int id = addId++;
    code.add(new instrs.patterns.TryAdd(getLineStart(), id, ref), locals, dynamics);
    left.compile(locals, dynamics, new ast.refs.Left(id), code);
    right.compile(locals, dynamics, new ast.refs.Right(id), code);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = left.bind(env, type);
    if (env != null)
      return right.bind(env, type);
    else return null;
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    left.type(env, (env1, t1) ->
    {
      right.type(env1, (env2, t2) ->
      {
        if (t1 instanceof ast.types.List && t2 instanceof ast.types.List) {
          ast.types.List l1 = (ast.types.List) t1;
          ast.types.List l2 = (ast.types.List) t2;
          if (Type.equals(l1, l2, env)) {
            setType(l1);
            cont.accept(env, l1);
          } else throw new TypePatternError(this, "incompatible types " + t1 + " and " + t2);
        } else throw new TypePatternError(this, "expecting lists " + t1 + " and " + t2);
      });
    });
  }

  public Type getDeclaredType() {
    return left.getDeclaredType();
  }

  public void processDeclarations(Env<String, Type> env) {
    left.processDeclarations(env);
    right.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    return AST.concatenate(left.getContainedDecs(), right.getContainedDecs());
  }

  public String pprint() {
    return left.pprint() + "+" + right.pprint();
  }

}
