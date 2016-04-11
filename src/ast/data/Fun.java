package ast.data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.apply.ApplyFun;
import instrs.apply.Return;
import instrs.vars.NewDynamic;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "args", "body" })

public class Fun extends AST {

  static int      funCount = 0;

  public String   name;
  public String[] args;
  public AST      body;

  public Fun() {
  }

  public Fun(String name, String[] args, AST body) {
    this.name = name;
    this.args = args;
    this.body = body;
  }

  public static String newName() {
    return "fun" + (funCount++);
  }

  public String toString() {
    return "Fun(" + name + "," + Arrays.toString(args) + "," + body + ")";
  }

  public void compileBody(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> bodyCode, boolean isLast) {

    // A function compiles by capturing the current dynamic variable environment.
    // Although the arguments are passed on the stack and therefore becomes part
    // of the current stack frame, those formal arguments that are references as
    // dynamics must be transferred immediately on entering the function...

    HashSet<String> dv = new HashSet<String>();
    body.DV(dv);
    locals = new Nil<FrameVar>();
    int index = 0;
    for (String arg : args) {
      if (dv.contains(arg)) {
        bodyCode.add(new instrs.vars.FrameVar(argIndex(arg)));
        bodyCode.add(new NewDynamic());
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(arg, 0));
      } else locals = locals.cons(new FrameVar(arg, index));
      index++;
    }
    body.compile(locals, dynamics, bodyCode, true);
    bodyCode.add(new Return());
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {
    int frame = body.maxLocals() + args.length;
    Vector<Instr> bodyCode = new Vector<Instr>();
    compileBody(locals, dynamics, bodyCode, isLast);
    code.add(new instrs.data.Fun(name, args.length, new CodeBox(frame, bodyCode)));
  }

  public void compileApply(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {

    // Called when the function is created in order to immediately apply...

    int frame = body.maxLocals() + args.length;
    Vector<Instr> bodyCode = new Vector<Instr>();
    compileBody(locals, dynamics, bodyCode, isLast);
    code.add(new ApplyFun(name, args.length, new CodeBox(frame, bodyCode)));
  }

  private int argIndex(String arg) {
    for (int i = 0; i < args.length; i++)
      if (args[i].equals(arg)) return i;
    throw new java.lang.Error("cannot find arg " + arg);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    body.FV(free);
    for (String arg : args)
      free.remove(arg);
    vars.addAll(free);
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

  public int maxLocals() {
    return 0;
  }

  private boolean binds(String name) {
    for (String arg : args) {
      if (arg.equals(name)) return true;
    }
    return false;
  }

  public AST subst(AST ast, String name) {
    if (binds(name))
      return this;
    else return new Fun(this.name, args, body.subst(ast, name));
  }

}
