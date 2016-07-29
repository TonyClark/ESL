package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "className", "type", "args" })

public class NewJava extends AST {

  public String className;
  public Type   type;
  public AST[]  args;

  public NewJava() {
  }

  public NewJava(String className, Type type, AST[] args) {
    this.className = className;
    this.type = type;
    this.args = args;
  }

  public String toString() {
    return "NewJava(" + className + "," + type + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    code.add(new instrs.data.NewJava(getLineStart(), className, args.length), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    for (AST arg : args)
      arg.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (AST arg : args)
      arg.DV(vars);
  }

  public int maxLocals() {
    int maxLocals = 0;
    for (AST arg : args)
      maxLocals = Math.max(maxLocals, arg.maxLocals());
    return maxLocals;
  }

  public AST subst(AST ast, String name) {
    return new NewJava(className, type, subst(args, ast, name));
  }

  public void setPath(String path) {
    for (AST arg : args)
      arg.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    for(AST arg : args)
      arg.type(env);
    return type;
  }

  public String getLabel() {
    return "newjava :: " + getType();
  }

}
