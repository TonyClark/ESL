package ast.actors;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "target", "args", "time" })

public class Send extends AST {

  public AST   target;
  public AST[] args;
  public AST   time;

  public Send() {
  }

  public Send(AST target, AST[] args, AST time) {
    this.target = target;
    this.args = args;
    this.time = time;
  }

  public String toString() {
    return "Send(" + target + "," + Arrays.toString(args) + "," + time + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    time.compile(locals, dynamics, code, false);
    target.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Send(getLine(), args.length), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    target.FV(vars);
    time.FV(vars);
    for (AST a : args)
      a.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    target.DV(vars);
    time.DV(vars);
    DV(args, vars);
  }

  public int maxLocals() {
    return Math.max(time.maxLocals(), Math.max(target.maxLocals(), maxLocals(args)));
  }

  public AST subst(AST ast, String name) {
    return new Send(target.subst(ast, name), subst(args, ast, name), time.subst(ast, name));
  }

  public void setPath(String path) {
    for (AST arg : args)
      arg.setPath(path);
    target.setPath(path);
    time.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = target.type(env);
    if (type instanceof ast.types.Act) {
      ast.types.Act act = (ast.types.Act) type;
      Type[] types = new Type[args.length];
      for (int i = 0; i < args.length; i++) {
        types[i] = args[i].type(env);
      }
      Type resultType = act.getType(types);
      if (resultType != null)
        return resultType;
      else throw new TypeError(this, "cannot sent a message of type " + Arrays.toString(types) + " to an actor of type " + act);
    } else throw new TypeError(this, "expecting an actor type but found " + type);
  }

}
