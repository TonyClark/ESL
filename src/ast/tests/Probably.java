package ast.tests;

import java.util.HashSet;

import ast.binding.Dec;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.ApplyType;
import ast.data.Fun;
import ast.data.Str;
import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "exp", "type", "body", "alt" })

public class Probably extends AST {

  public AST  exp;
  public Type type;
  public AST  body;
  public AST  alt;

  public Probably() {
  }

  public Probably(int lineStart, int lineEnd, AST exp, Type type, AST body, AST alt) {
    super(lineStart, lineEnd);
    this.exp = exp;
    this.type = type;
    this.body = body;
    this.alt = alt;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    desugar().compile(locals, dynamics, code, isLast);
  }

  private AST desugar() {
    int s = getLineStart();
    int e = getLineEnd();
    return new Apply(s,e,"",new Apply(s,e,"",new ApplyType(new Var(s,e,"probably",null,null),new Type[] {type}),new AST[] {exp,new Fun(s,e,"",Str.strAt0(Fun.newName()),new Dec[] {},new ast.types.Fun(s,e,new Type[] {},type),body,false),new Fun(s,e,"",Str.strAt0(Fun.newName()),new Dec[] {},new ast.types.Fun(s,e,new Type[] {},type),alt,false)}));
  }

  public void DV(HashSet<String> vars) {
    desugar().DV(vars);
  }

  public void FV(HashSet<String> vars) {
    desugar().FV(vars);
  }

  public String getLabel() {
    return "probably :: " + getType();
  }

  public int maxLocals() {
    return desugar().maxLocals();
  }

  public void setPath(String path) {
    
  }

  public AST subst(AST ast, String name) {
    return new Probably(getLineStart(), getLineEnd(), exp.subst(ast, name), type,body.subst(ast, name), alt.subst(ast, name));
  }

  public String toString() {
    return "Probably(" + exp + "," + type + "," + body + "," + alt + ")";
  }

  public Type type(Env<String, Type> env) {
    return desugar().type(env);
  }

}
