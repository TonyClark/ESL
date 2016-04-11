package ast.patterns;

import java.util.HashSet;
import java.util.Vector;

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
import instrs.Instr;
import list.List;

@BoaConstructor(fields = { "name", "pattern" })

public class PBind extends Pattern {

  public String  name;
  public Pattern pattern;

  public PBind() {
  }

  public PBind(String name, Pattern pattern) {
    super();
    this.name = name;
    this.pattern = pattern;
  }

  public String toString() {
    return "PBind(" + name + "," + pattern + ")";
  }

  public void vars(HashSet<String> vars) {
    pattern.vars(vars);
    vars.add(name);
  }

  public void bound(Vector<String> vars) {
    pattern.bound(vars);
    vars.add(name);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, Vector<Instr> code) {
    if (AST.lookup(name, locals) != null) {
      AST.lookup(name, locals).bind(ref, code);
    } else if (AST.lookup(name, dynamics) != null) {
      AST.lookup(name, dynamics).bind(ref, code);
    }
    pattern.compile(locals, dynamics, ref, code);
  }

}
