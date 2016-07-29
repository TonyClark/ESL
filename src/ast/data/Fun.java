package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Dec;
import ast.types.Forall;
import ast.types.Type;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.ApplyFun;
import instrs.apply.Return;
import instrs.vars.NewDynamic;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "args", "declaredType", "body" })

public class Fun extends AST {

  static int funCount = 0;

  public static String newName() {
    return "fun" + (funCount++);
  }

  public String path;
  public String name;
  public Dec[]  args;
  public Type   declaredType;

  public AST    body;

  public Fun() {
  }

  public Fun(int lineStart, int lineEnd, String path, String name, Dec[] args, Type declaredType, AST body) {
    super(lineStart, lineEnd);
    this.path = path;
    this.name = name;
    this.args = args;
    this.declaredType = declaredType;
    this.body = body;
  }

  private int argIndex(String arg) {
    for (int i = 0; i < args.length; i++)
      if (args[i].getName().equals(arg)) return i;
    throw new java.lang.Error("cannot find arg " + arg);
  }

  private boolean binds(String name) {
    for (Dec arg : args) {
      if (arg.getName().equals(name)) return true;
    }
    return false;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    int frame = body.maxLocals() + args.length;
    CodeBox bodyCode = new CodeBox(path, frame);
    compileBody(locals, dynamics, bodyCode, isLast);
    code.add(new instrs.data.Fun(getLineStart(), name, args.length, bodyCode), locals, dynamics);
  }

  public void compileApply(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // Called when the function is created in order to immediately apply...

    int frame = body.maxLocals() + args.length;
    CodeBox bodyCode = new CodeBox(path, frame);
    compileBody(locals, dynamics, bodyCode, isLast);
    code.add(new ApplyFun(getLineStart(), name, args.length, bodyCode), locals, dynamics);
  }

  public void compileBody(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox bodyCode, boolean isLast) {

    // A function compiles by capturing the current dynamic variable environment.
    // Although the arguments are passed on the stack and therefore becomes part
    // of the current stack frame, those formal arguments that are references as
    // dynamics must be transferred immediately on entering the function...

    HashSet<String> dv = new HashSet<String>();
    body.DV(dv);
    locals = new Nil<FrameVar>();
    int index = 0;
    for (Dec arg : args) {
      if (dv.contains(arg.getName())) {
        bodyCode.add(new instrs.vars.FrameVar(getLineStart(), argIndex(arg.getName())), locals, dynamics);
        bodyCode.add(new NewDynamic(getLineStart()), locals, dynamics);
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(arg.getName(), 0));
      } else locals = locals.cons(new FrameVar(arg.getName(), index));
      index++;
    }
    body.compile(locals, dynamics, bodyCode, true);
    bodyCode.add(new Return(getLineStart()), locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    body.FV(free);
    for (Dec arg : args)
      free.remove(arg.getName());
    vars.addAll(free);
  }

  public Type getDeclaredType() {
    return declaredType;
  }

  public String getLabel() {
    return "fun :: " + getType().toString();
  }

  public int maxLocals() {
    return 0;
  }

  public void setPath(String path) {
    this.path = path;
    body.setPath(path);
  }

  public AST subst(AST ast, String name) {
    if (binds(name))
      return this;
    else return new Fun(getLineStart(), getLineEnd(), path, this.name, args, declaredType, body.subst(ast, name));
  }

  public String toString() {
    return "Fun(" + getLineStart() + "," + name + "," + Arrays.toString(args) + "," + body + ")";
  }

  public Type type(Env<String, Type> env) {
    Type[] domain = new Type[args.length];
    for (int i = 0; i < args.length; i++) {
      Type argType = args[i].getDeclaredType();
      env = env.bind(args[i].getName(), argType);
      domain[i] = argType;
    }
    Type dType = declaredType;
    Type bType = new ast.types.Fun(declaredType.getLineStart(), declaredType.getLineEnd(), domain, body.type(env));
    if (Type.equals(dType, bType, env)) {
      setType(bType);
      return getType();
    } else {
      throw new TypeMatchError(getLineStart(), getLineEnd(), bType, dType);
    }
  }
}
