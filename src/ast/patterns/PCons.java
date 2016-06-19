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

@BoaConstructor(fields = { "head", "tail" })

public class PCons extends Pattern {

  public Pattern head;
  public Pattern tail;

  public PCons() {
  }

  public PCons(Pattern head, Pattern tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PCons(" + head + "," + tail + ")";
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
    code.add(new instrs.patterns.isCons(getLine(), ref), locals, dynamics);
    head.compile(locals, dynamics, new ast.refs.Head(ref), code);
    tail.compile(locals, dynamics, new ast.refs.Tail(ref), code);
  }

  public Type type(Env<String, Type> env) {
    Type tailType = tail.type(env);
    if (tailType instanceof ast.types.List) {
      ast.types.List listType = (ast.types.List) tailType;
      Type headType = head.type(env);
      if (listType.getType().equals(headType))
        return listType;
      else throw new TypePatternError(this, "expecting head to match tail type " + headType);
    } else throw new TypePatternError(this, "expecting a list type " + tailType);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = head.bind(env, type);
    if (env != null)
      return tail.bind(env, type);
    else return null;
  }

}
