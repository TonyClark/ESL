package ast.actors;

import ast.AST;
import ast.data.Apply;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.StartCall;
import instrs.data.NewActor;
import instrs.data.SetActor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "op", "args" })
public class New extends Apply {

  public New() {
    super();
  }

  public New(int lineStart, int lineEnd, String opName, AST op, AST... args) {
    super(lineStart, lineEnd, opName, op, args);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new StartCall(getLineStart()), locals, dynamics);
    for (AST arg : args)
      arg.compile(locals, dynamics, code, false);
    op.compile(locals, dynamics, code, false);
    code.add(new NewActor(getLineStart()), locals, dynamics);
    code.add(new instrs.apply.Apply(getLineStart(), args.length), locals, dynamics);
    code.add(new SetActor(getLineStart()), locals, dynamics);
  }

  public AST subst(AST ast, String name) {
    return new New(getLineStart(), getLineEnd(), getOpName(), op.subst(ast, name), subst(args, ast, name));
  }

  public Type type(Env<String, Type> env) {
    super.type(env);
    ast.types.Fun behaviourType = (ast.types.Fun) getOp().getType();
    setType(behaviourType.getRange());
    return getType();
  }

  public String getLabel() {
    return "new :: " + getType();
  }

}
