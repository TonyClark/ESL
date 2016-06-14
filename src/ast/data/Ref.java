package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "namespace", "name" })
public class Ref extends AST {

  public AST namespace;
  public Key name;

  public Ref() {
  }

  public Ref(AST namespace, Key name) {
    super();
    this.namespace = namespace;
    this.name = name;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    namespace.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Ref(getLine(),name), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    namespace.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    namespace.DV(vars);
  }

  public int maxLocals() {
    return namespace.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Ref(namespace.subst(ast, name), this.name);
  }

  public String toString() {
    return "Ref(" + namespace + "," + name + ")";
  }

  public void setPath(String path) {
    namespace.setPath(path);
  }

}
