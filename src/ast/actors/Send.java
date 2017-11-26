package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import ast.data.Term;
import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;
import values.Located;

@BoaConstructor(fields = { "target", "arg" })

public class Send extends AST {

  public AST target;
  public AST arg;

  public Send() {
  }

  public Send(int lineStart, int lineEnd, AST target, AST arg) {
    super(lineStart, lineEnd);
    this.target = target;
    this.arg = arg;
  }

  public String toString() {
    return "Send(" + target + "," + arg + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (arg instanceof Term)
      compileTerm(locals, dynamics, code, isLast);
    else compileData(locals, dynamics, code, isLast);
  }

  private void compileData(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    arg.compile(locals, dynamics, code, false);
    target.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Send(getLineStart()), locals, dynamics);
  }

  private void compileTerm(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    Term term = (Term) arg;
    String name = term.getName();
    AST[] args = term.values;
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    target.compile(locals, dynamics, code, false);
    code.add(new instrs.data.NamedSend(getLineStart(), name, args.length), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    target.FV(vars);
    arg.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    target.DV(vars);
    arg.DV(vars);
  }

  public int maxLocals() {
    return Math.max(target.maxLocals(), arg.maxLocals());
  }

  public AST subst(AST ast, String name) {
    return new Send(getLineStart(), getLineEnd(), target.subst(ast, name), arg.subst(ast, name));
  }

  public void setPath(String path) {
    arg.setPath(path);
    target.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = target.type(env).deref(env);
    if (type instanceof ast.types.Act) {
      ast.types.Act act = (ast.types.Act) type;
      Type[] types = new Type[1];
      types[0] = arg.type(env);
      if (act.canSend(types, env)) {
        setType(ast.types.Void.VOID);
        return getType();
      } else throw new TypeError(getLineStart(), getLineEnd(), "cannot find a handler with the supplied types: " + Arrays.toString(types) + " in " + act);
    } else throw new TypeError(getLineStart(), getLineEnd(), "expecting an actor type but found " + type);
  }

  public String getLabel() {
    return "send :: " + getType();
  }

}
