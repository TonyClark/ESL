package ast.query.value;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.types.Type;
import env.Env;

public class Var extends Value {

  static int                         counter = 0;

  private int                        id      = counter++;
  private Object                     value   = null;
  private HashMap<Machine, Object> values  = new HashMap<Machine, Object>();

  public Var() {
  }

  public Env<String, Var> allocateVariables(Env<String, Var> venv) {
    return venv;
  }

  public String toString() {
    return "Var(" + id + "," + values + ")";
  }

  public Object getValue(Machine machine) {

    // In anticipation of using indices into the machine and a separate value stack
    // for variables so that machines can be split to perform FORK.

    // return value;

    if (values.containsKey(machine))
      return values.get(machine);
    else if (machine.getParent() != null)
      return getValue(machine.getParent());
    else return null;
  }

  public void setValue(Machine machine, Object value) {

    // In anticipation of using indices into the machine and a separate value stack
    // for variables so that machines can be split to perform FORK.

    values.put(machine, value);
    // this.value = value;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    throw new Error("a variable cannot occur in a rule head.");
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    throw new Error("a variable cannot occur in a rule body.");
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    throw new Error("a variable cannot occur in a rule body.");
  }

  public void vars(HashSet<String> vars) {
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    return env;
  }

  public boolean isConstant() {
    return false;
  }

  public Object recons(Env<String, Var> venv) {
    return this;
  }

  public boolean isExp() {
    return false;
  }

}
