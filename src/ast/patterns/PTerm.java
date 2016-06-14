package ast.patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.binding.Var;
import ast.data.Apply;
import ast.data.Fun;
import ast.data.TermRef;
import ast.refs.Ref;
import ast.tests.BArm;
import ast.tests.If;
import ast.tests.IsTerm;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name", "patterns" })

public class PTerm extends Pattern {

  public String    name;
  public Pattern[] patterns;

  public PTerm() {
  }

  public String getName() {
    return name;
  }

  public Pattern[] getPatterns() {
    return patterns;
  }

  public String toString() {
    return "PTerm(" + name + "," + Arrays.toString(patterns) + ")";
  }

  public void vars(HashSet<String> vars) {
    for (Pattern p : patterns)
      p.vars(vars);
  }

  public void bound(Vector<String> vars) {
    for (Pattern p : patterns)
      p.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isTerm(getLine(), ref, Key.getKey(name), patterns.length), locals, dynamics);
    for (int i = 0; i < patterns.length; i++)
      patterns[i].compile(locals, dynamics, new ast.refs.TermRef(ref, i), code);
  }

}
