package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.temporal.End;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class EndOfTime extends BodyElement {

  public EndOfTime() {
  }


  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public BodyElement subst(Type type, String typeName) {
    return this;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast) {
    code.add(new End());
  }

  public void vars(HashSet<String> vars) {
  }

}
