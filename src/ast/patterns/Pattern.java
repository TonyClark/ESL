package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.AST;
import ast.TreeNode;
import ast.binding.declarations.DeclaringLocation;
import ast.data.BinExp;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.Typed;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;
import values.Located;

public abstract class Pattern implements Located, Typed, TreeNode {

  public static AST consExp(AST head, AST tail) {
    return new BinExp(head.getLineStart(), head.getLineEnd(), head, ":", tail);
  }

  private static void types(int i, Type[] types, Pattern[] patterns, Env<String, Type> env, BiConsumer<Env<String, Type>, Type[]> cont) {
    if (i == patterns.length)
      cont.accept(env, types);
    else patterns[i].type(env, (newEnv, type) ->
    {
      types[i] = type;
      types(i + 1, types, patterns, newEnv, cont);
    });
  }

  public static void types(Pattern[] patterns, Env<String, Type> env, BiConsumer<Env<String, Type>, Type[]> cont) {
    types(0, new Type[patterns.length], patterns, env, cont);
  }

  private int  lineStart = -1;
  private int  lineEnd   = -1;
  private Type type;

  public Pattern() {
  }

  public Pattern(int lineStart, int lineEnd) {
    setLineStart(lineStart);
    setLineEnd(lineEnd);
  }

  public abstract Env<String, Type> bind(Env<String, Type> env, Type type);

  public boolean binds(String name) {
    HashSet<String> vars = new HashSet<String>();
    vars(vars);
    return vars.contains(name);
  }

  public abstract void bound(Vector<String> vars);

  public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code);

  public String getLabel() {
    return getClass().getSimpleName() + " :: " + getType();
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public Type getType() {
    return type;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public abstract void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont);

  public abstract void vars(HashSet<String> vars);

  public abstract Type getDeclaredType();

  public abstract void processDeclarations(Env<String, Type> env);

  public abstract DeclaringLocation[] getContainedDecs();

  public abstract String pprint();

}
