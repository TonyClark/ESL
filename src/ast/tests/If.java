package ast.tests;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.data.Bool;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.jumps.Skip;
import instrs.jumps.SkipFalse;
import list.List;

@BoaConstructor(fields = { "test", "conseq", "alt" })

public class If extends AST {

  public AST test;
  public AST conseq;
  public AST alt;

  public If() {
  }

  public If(AST test, AST conseq, AST alt) {
    super();
    this.test = test;
    this.conseq = conseq;
    this.alt = alt;
  }

  public String toString() {
    return "If(" + test + "," + conseq + "," + alt + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (test instanceof Bool) {
      Bool b = (Bool) test;
      if (b.value)
        conseq.compile(locals, dynamics, code, isLast);
      else alt.compile(locals, dynamics, code, isLast);
    } else {
      test.compile(locals, dynamics, code, false);
      int length = code.getCode().size();
      SkipFalse jmp1 = new SkipFalse(getLine(), 0);
      code.add(jmp1, locals, dynamics);
      conseq.compile(locals, dynamics, code, isLast);
      Skip jmp2 = new Skip(getLine(), 0);
      code.add(jmp2, locals, dynamics);
      jmp1.setCount(code.getCode().size() - length);
      length = code.getCode().size() - 1;
      alt.compile(locals, dynamics, code, isLast);
      jmp2.setCount(code.getCode().size() - length);
    }
  }

  public void FV(HashSet<String> vars) {
    test.FV(vars);
    alt.FV(vars);
    conseq.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    test.DV(vars);
    alt.DV(vars);
    conseq.DV(vars);
  }

  public int maxLocals() {
    return Math.max(test.maxLocals(), Math.max(conseq.maxLocals(), alt.maxLocals()));
  }

  public AST subst(AST ast, String name) {
    return new If(test.subst(ast, name), conseq.subst(ast, name), alt.subst(ast, name));
  }

  public void setPath(String path) {
    test.setPath(path);
    conseq.setPath(path);
    alt.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type testType = test.type(env);
    if (testType instanceof ast.types.Bool) {
      Type conseqType = conseq.type(env);
      Type altType = alt.type(env);
      if (conseqType.equals(altType))
        return altType;
      else throw new TypeMatchError(this, conseqType, altType);
    } else throw new TypeError(this, "expecting Bool, but found " + testType);
  }

}
