package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import actors.CodeBox;
import ast.AST;
import ast.binding.declarations.DeclaringLocation;
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
    code.add(new instrs.patterns.isCons(getLineStart(), ref), locals, dynamics);
    head.compile(locals, dynamics, new ast.refs.Head(ref), code);
    tail.compile(locals, dynamics, new ast.refs.Tail(ref), code);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.List) {
      ast.types.List listType = (ast.types.List) type;
      env = head.bind(env, listType.getType());
      if (env != null)
        return tail.bind(env, type);
      else return null;
    } else return null;
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    tail.type(env, (env1, tailType) ->
    {
      if (tailType.restrictsTo(ast.types.List.class) != null) {
        ast.types.List listType = (ast.types.List) tailType.restrictsTo(ast.types.List.class);
        head.type(env1, (env2, headType) ->
        {
          if (Type.equals(listType.getType(), headType, env)) {
            setType(tailType);
            cont.accept(env2, tailType);
          } else throw new TypePatternError(this, "expecting head to match tail type " + headType + " <> " + listType.getType());
        });
      } else throw new TypePatternError(this, "expecting a list type " + tailType);
    });
  }

  public Type getDeclaredType() {
    return tail.getDeclaredType();
  }

  public void processDeclarations(Env<String, Type> env) {
    head.processDeclarations(env);
    tail.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    return AST.concatenate(head.getContainedDecs(), tail.getContainedDecs());
  }

}
