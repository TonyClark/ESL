package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.binding.Binding;
import ast.binding.Let;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.refs.Ref;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name" })

public class PVar extends Pattern {

  public String name;

  public PVar() {
  }

  public PVar(String name) {
    this.name = name;
  }

  public String toString() {
    return "PVar(" + name + ")";
  }

  public void vars(HashSet<String> vars) {
    vars.add(name);
  }

  public void bound(Vector<String> vars) {
    vars.add(name);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    if (AST.lookup(name, locals) != null) {
      AST.lookup(name, locals).bind(ref, getLine(), code, locals, dynamics);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, getLine(), code, locals, dynamics);
    }
  }

}
