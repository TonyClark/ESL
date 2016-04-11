package ast.actors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import exp.BoaConstructor;
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "className", "args" })

public class NewJava extends AST {

  public String className;
  public AST[]  args;

  public NewJava() {
  }

  public NewJava(String className, AST[] args) {
    this.className = className;
    this.args = args;
  }

  public String toString() {
    return "NewJava(" + className + "," + Arrays.toString(args) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    code.add(new instrs.data.NewJava(className, args.length));
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
    return new NewJava(className, subst(args, ast, name));
  }

}
