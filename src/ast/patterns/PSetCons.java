package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "head", "tail" })

public class PSetCons extends Pattern {

  static int     setId = 0;

  public Pattern head;
  public Pattern tail;

  public PSetCons() {
  }

  public PSetCons(Pattern head, Pattern tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PSetCons(" + head + "," + tail + ")";
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public void bound(Vector<String> vars) {
    head.bound(vars);
    tail.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int id = setId++;
    code.add(new instrs.patterns.TrySet(getLine(),id, ref), locals, dynamics);
    head.compile(locals, dynamics, new ast.refs.SetElement(id), code);
    tail.compile(locals, dynamics, new ast.refs.SetRest(id), code);
  }

  public Type type(Env<String, Type> env) {
    Type tailType = tail.type(env);
    if (tailType instanceof ast.types.Set) {
      ast.types.Set setType = (ast.types.Set) tailType;
      Type headType = head.type(env);
      if (setType.getType().equals(headType))
        return setType;
      else throw new TypePatternError(this, "expecting head to match tail type " + headType);
    } else throw new TypePatternError(this, "expecting a set type " + tailType);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = head.bind(env, type);
    if (env != null)
      return tail.bind(env, type);
    else return null;
  }

}
