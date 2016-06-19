package ast.control;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Null;
import instrs.data.Pop;
import list.List;

@BoaConstructor(fields = { "exps" })

public class Block extends AST {

  // A block is just a sequence of expressions. They are performed in sequence and the block
  // returns the value of the last expression. If there are no expressions in a block then the
  // block returns null. An empty block is a useful no-op...

  public AST[] exps = new AST[] {};

  public Block() {
  }

  public Block(AST... exps) {
    this.exps = exps;
  }

  public String toString() {
    return "Block(" + Arrays.toString(exps) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (exps.length == 0)
      code.add(new Null(getLine()), locals, dynamics);
    else {
      for (AST exp : exps) {
        if (exp != exps[exps.length - 1]) {
          exp.compile(locals, dynamics, code, false);
          code.add(new Pop(getLine()), locals, dynamics);
        } else exp.compile(locals, dynamics, code, isLast);
      }
    }
  }

  public void FV(HashSet<String> vars) {
    for (AST e : exps)
      e.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (AST e : exps)
      e.DV(vars);
  }

  public int maxLocals() {
    return maxLocals(exps);
  }

  public AST subst(AST ast, String name) {
    return new Block(subst(exps, ast, name));
  }

  public void setPath(String path) {
    for (AST exp : exps)
      exp.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = ast.types.Null.NULL;
    for (AST exp : exps)
      type = exp.type(env);
    return type;
  }

}
