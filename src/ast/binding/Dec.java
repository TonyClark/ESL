package ast.binding;

import ast.TreeNode;
import ast.binding.declarations.DeclaringLocation;
import ast.types.Type;
import ast.types.TypeFun;
import ast.types.Typed;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "declaredType" })

public class Dec implements DeclaringLocation, Typed, TreeNode {

  public static Type generic(String[] names, Type type) {
    if (names.length == 0)
      return type;
    else return new ast.types.Forall(type.getLineStart(), type.getLineEnd(), names, type);
  }

  public static Type funType(String[] args, Type type) {
    if (args.length == 0)
      return type;
    else return new TypeFun(type.getLineStart(), type.getLineEnd(), args, type);
  }

  public String path;
  public String name;
  public Type   declaredType;
  private int   lineStart = -1;
  private int   lineEnd = -1;
  private Type  type;

  public Dec() {
  }

  public Dec(int lineStart, int lineEnd, String path, String name, Type declaredType) {
    super();
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
    this.path = path;
    this.name = name;
    this.declaredType = declaredType;
  }

  public Dec eval(Env<String, Type> env) {
    return new Dec(getLineStart(), getLineEnd(), getPath(), getName(), getDeclaredType());
  }

  public Type getDeclaredType() {
    return declaredType;
  }

  public String getLabel() {
    return "dec " + name + " :: " + getType();
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public String getName() {
    return name;
  }

  public String getPath() {
    return path;
  }

  public Type getType() {
    return type;
  }

  public void setDeclaredType(Type declaredType) {
    this.declaredType = declaredType;
  }

  public void setLineEnd(int linePos) {
    lineEnd = linePos;
  }

  public void setLineStart(int linePos) {
    lineStart = linePos;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String toString() {
    return name + "::" + getDeclaredType();
  }

  public Dec substType(Type t, String n) {
    return new Dec(getLineStart(), getLineEnd(), getPath(), getName(), getDeclaredType().substType(t, n));
  }

}
