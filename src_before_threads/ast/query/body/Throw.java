package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "value" })
public class Throw extends BodyElement {

  public Value value;

  public Throw() {
  }

  public Throw(Value value) {
    this.value = value;
  }

  public Value getValue() {
    return value;
  }

  public BodyElement subst(Type type, String typeName) {
    return this;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    value.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast) {
    value.compile(code, length, vars);
    code.add(new ast.query.instrs.control.Throw());
  }

  public void vars(HashSet<String> vars) {
    value.vars(vars);
  }

}
