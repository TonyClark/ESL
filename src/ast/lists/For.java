package ast.lists;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.control.Block;
import ast.data.Apply;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.jumps.Goto;
import instrs.jumps.SkipTrue;
import instrs.tests.isNil;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
import instrs.vars.SetFrame;
import list.List;

@BoaConstructor(fields = { "pattern", "list", "body" })

public class For extends AST {

  static int     forCount = 0;

  String         path;
  public Pattern pattern;
  public AST     list;
  public AST     body;

  public For() {
  }

  public For(int lineStart, int lineEnd, String path, Pattern pattern, AST list, AST body) {
    super(lineStart, lineEnd);
    this.pattern = pattern;
    this.list = list;
    this.body = body;
  }

  public String toString() {
    return "For(" + pattern + "," + list + "," + body + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (pattern instanceof PVar)
      compileSimple(locals, dynamics, code);
    else desugar().compile(locals, dynamics, code, isLast);
  }

  public AST desugar() {
    BArm arm3 = new BArm(new Pattern[] { new PNil() }, Bool.TRUE, new Block());
    BArm arm2 = new BArm(new Pattern[] { new PCons(new PWild(), new PVar("$t", new ast.types.Void())) }, Bool.TRUE, new Apply(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), "$f", null), new Var(getLineStart(), getLineEnd(), "$t", null)));
    BArm arm1 = new BArm(new Pattern[] { new PCons(pattern, new PVar("$t", new ast.types.Void())) }, Bool.TRUE, new Block(getLineStart(), getLineEnd(), body, new Apply(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), "$f", null), new Var(getLineStart(), getLineEnd(), "$t", null))));
    Case caseExp = new Case(new Dec[] {}, new AST[] { new Var(getLineStart(), getLineEnd(), "l", null) }, new BArm[] { arm1, arm2, arm3 });
    Fun fun = new Fun(getLineStart(), getLineEnd(), path, forName(), new Dec[] { new Dec(getLineStart(), getLineEnd(), path, "l", ast.types.Void.VOID) }, ast.types.Void.VOID, caseExp);
    return new Letrec(getLineStart(), getLineEnd(), new Binding[] { new Binding(getLineStart(), getLineEnd(), path, "$f", new ast.types.Void(), fun) }, new Apply(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), "$f", null), list));
  }

  private AST forName() {
    return new Str("for" + (forCount++));
  }

  private void compileSimple(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    PVar pvar = (PVar) pattern;
    HashSet<String> DV = new HashSet<String>();
    DV(DV);
    boolean isdynamic = DV.contains(pvar.name);
    if (isdynamic)
      compileSimpleDynamic(locals, dynamics, code);
    else compileSimpleLocal(locals, dynamics, code);
  }

  private void compileSimpleDynamic(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    // [| list |]
    // SETFRAME n
    // POP
    // NULL
    // NEWDYNAMIC
    // LOOP: FRAMEVAR n
    // ISNIL
    // SKIPTRUE END
    // FRAMEVAR n
    // HEAD
    // SETDYNAMIC 0
    // FRAMEVAR n
    // TAIL
    // SETFRAME n
    // POP
    // [| body |]
    // POP
    // GOTO LOOP
    // END: POPDYNAMIC
    // NULL

    PVar pvar = (PVar) pattern;
    list.compile(locals, dynamics, code, false);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Null(getLineStart()), locals, dynamics);
    code.add(new NewDynamic(getLineStart()), locals, dynamics);
    dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(pvar.name, 0));
    int loop = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new isNil(getLineStart()), locals, dynamics);
    SkipTrue skiptrue = new SkipTrue(getLineStart(), 0);
    code.add(skiptrue, locals, dynamics);
    int addr = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new instrs.ops.Head(getLineStart()), locals, dynamics);
    code.add(new SetDynamic(getLineStart(), 0), locals, dynamics);
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new instrs.ops.Tail(getLineStart()), locals, dynamics);
    code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    body.compile(locals, dynamics, code, false);
    code.add(new Pop(getLineStart()), locals, dynamics);
    code.add(new Goto(getLineStart(), loop), locals, dynamics);
    code.add(new PopDynamic(getLineStart()), locals, dynamics);
    dynamics = dynamics.getTail();
    skiptrue.setCount(code.getCode().size() - addr);
    code.add(new Null(getLineStart()), locals, dynamics);
  }

  public void compileSimpleLocal(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {

    // [| list |]
    // SETFRAME n
    // POP
    // LOOP: FRAMEVAR n
    // ISNIL
    // SKPTRUE END
    // FRAMEVAR n
    // HEAD
    // SETFRAME n + 1
    // POP
    // FRAMEVAR n
    // TAIL
    // SETFRAME n
    // POP
    // [| body |]
    // POP
    // GOTO LOOP
    // END: NULL

    PVar pvar = (PVar) pattern;
    list.compile(locals, dynamics, code, false);
    locals = locals.cons(new FrameVar("$l", locals.length()));
    locals = locals.cons(new FrameVar(pvar.name, locals.length()));
    code.add(new SetFrame(getLineStart(), locals.length() - 2), locals, dynamics);
    int loop = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 2), locals, dynamics);
    code.add(new isNil(getLineStart()), locals, dynamics);
    SkipTrue skiptrue = new SkipTrue(getLineStart(), 0);
    code.add(skiptrue, locals, dynamics);
    int addr = code.getCode().size();
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 2), locals, dynamics);
    code.add(new instrs.ops.Head(getLineStart()), locals, dynamics);
    code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    code.add(new instrs.vars.FrameVar(getLineStart(), locals.length() - 2), locals, dynamics);
    code.add(new instrs.ops.Tail(getLineStart()), locals, dynamics);
    code.add(new SetFrame(getLineStart(), locals.length() - 2), locals, dynamics);
    code.add(new Pop(getLineStart()), locals, dynamics);
    body.compile(locals, dynamics, code, false);
    code.add(new Pop(getLineStart()), locals, dynamics);
    code.add(new Goto(getLineStart(), loop), locals, dynamics);
    code.add(new Null(getLineStart()), locals, dynamics);
    skiptrue.setCount(code.getCode().size() - addr);

  }

  public void FV(HashSet<String> vars) {
    if (pattern instanceof PVar) {
      PVar pvar = (PVar) pattern;
      HashSet<String> FV = new HashSet<String>();
      body.FV(FV);
      FV.remove(pvar.name);
      vars.addAll(FV);
      list.FV(vars);
    } else desugar().FV(vars);
  }

  public void DV(HashSet<String> vars) {
    if (pattern instanceof PVar) {
      body.DV(vars);
      list.DV(vars);
    } else desugar().FV(vars);
  }

  public int maxLocals() {
    if (pattern instanceof PVar) {
      return Math.max(list.maxLocals(), body.maxLocals() + 2);
    } else return desugar().maxLocals();
  }

  public AST subst(AST ast, String name) {
    if (pattern instanceof PVar) {
      PVar pvar = (PVar) pattern;
      if (name.equals(pvar.name))
        return this;
      else return new For(getLineStart(), getLineEnd(), path, pattern, list.subst(ast, name), body.subst(ast, name));
    } else return desugar().subst(ast, name);
  }

  public void setPath(String path) {
    this.path = path;
    list.setPath(path);
    body.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type t = list.type(env);
    if (t instanceof ast.types.List) {
      ast.types.List listType = (ast.types.List) t;
      pattern.type(env, (newEnv, pType) ->
      {
        if (Type.equals(pType, listType.getType(), env)) {
          body.type(newEnv);
        } else throw new TypeMatchError(pattern.getLineStart(), pattern.getLineEnd(), listType.getType(), pType);
      });
    } else throw new TypeError(list.getLineStart(), list.getLineEnd(), "expecting a list " + t);
    setType(ast.types.Void.VOID);
    return getType();
  }

  public String getLabel() {
    return "for :: " + getType();
  }

}
