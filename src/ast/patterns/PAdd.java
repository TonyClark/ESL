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
import list.List;

@BoaConstructor(fields = { "left", "right" })

public class PAdd extends Pattern {

  static int     addId = 0;

  public Pattern left;
  public Pattern right;

  public PAdd() {
  }

  public PAdd(Pattern left, Pattern right) {
    super();
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
    code.add(new instrs.patterns.TryAdd(getLine(), id, ref), locals, dynamics);
    left.compile(locals, dynamics, new ast.refs.Left(id), code);
    right.compile(locals, dynamics, new ast.refs.Right(id), code);
  }

  public Type type(Env<String, Type> env) {
    Type t1 = left.type(env);
    Type t2 = right.type(env);
    if (t1 instanceof ast.types.List && t2 instanceof ast.types.List) {
      ast.types.List l1 = (ast.types.List) t1;
      ast.types.List l2 = (ast.types.List) t2;
      Type a1 = l1.bind(l2);
      Type a2 = l2.bind(l1);
      if (a1 != null)
        return a1;
      else if (a2 != null)
        return a2;
      else throw new TypePatternError(this, "incompatible types " + t1 + " and " + t2);
    } else throw new TypePatternError(this, "expecting lists " + t1 + " and " + t2);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = left.bind(env, type);
    if (env != null)
      return right.bind(env, type);
    else return null;
  }

}
