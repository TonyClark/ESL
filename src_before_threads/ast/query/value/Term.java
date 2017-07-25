package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.unify.UConst;
import ast.query.instrs.unify.UTerm;
import ast.types.Cnstr;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "name", "values" })
public class Term extends Value {

  public static final Key  plus  = Key.getKey("+");
  public static final Key  minus = Key.getKey("-");
  public static final Key  mult  = Key.getKey("*");
  public static final Key  div   = Key.getKey("/");
  public static final Term NULL  = new Term(Key.getKey("Null"));

  public Key               name;
  public Value[]           values;

  public Term() {
  }

  public Term(Key name, Value... values) {
    super();
    this.name = name;
    this.values = values;
  }

  public void setName(Key name) {
    this.name = name;
  }

  public void setValues(Value[] values) {
    this.values = values;
  }

  public boolean equals(Object other) {
    if (other instanceof Term) {
      Term term = (Term) other;
      if (name == term.getName() && getArity() == term.getArity()) {
        for (int i = 0; i < getArity(); i++) {
          if (!values[i].equals(term.getValues()[i])) return false;
        }
        return true;
      } else return false;
    } else return false;
  }

  public Object recons(Env<String, Var> venv) {
    Object[] newValues = new Object[values.length];
    for (int i = 0; i < values.length; i++)
      newValues[i] = values[i].recons(venv);
    return new runtime.data.Term(name, (Object[]) newValues);
  }

  public Key getName() {
    return name;
  }

  public Value[] getValues() {
    return values;
  }

  public int getArity() {
    return values.length;
  }

  public String toString() {
    String s = name.getString();
    if (values.length == 0)
      return s;
    else {
      s = s + "(";
      for (int i = 0; i < values.length; i++) {
        s = s + values[i];
        if (i + 1 < values.length) s = s + ",";
      }
      return s + ")";
    }
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (Value v : values)
      v.getContainedDecs(decs);
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    if (isConstant())
      code.add(new UConst(recons(null)));
    else {
      code.add(new UTerm(name, values.length));
      for (int i = 0; i < values.length; i++) {
        values[i].compileHead(code, arity, vars);
      }
    }
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    for (int i = 0; i < values.length; i++) {
      values[i].compile(code, arity, vars);
    }
    code.add(new ast.query.instrs.data.Term(name, values.length));
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    if (name.getString().equals("+"))
      compilePlus(code, arity, vars);
    else if (name.getString().equals("-"))
      compileSub(code, arity, vars);
    else if (name.getString().equals("/"))
      compileDiv(code, arity, vars);
    else if (name.getString().equals("*"))
      compileMul(code, arity, vars);
    else throw new Error("cannot compile expression " + this);
  }

  public boolean isExp() {
    return name.equals("+") || name.equals("-") || name.equals("*") || name.equals("/");
  }

  private void compilePlus(Vector<Instr> code, int arity, Vector<String> vars) {
    values[0].compileExp(code, arity, vars);
    values[1].compileExp(code, arity, vars);
    code.add(new ast.query.instrs.ops.Add());
  }

  private void compileDiv(Vector<Instr> code, int arity, Vector<String> vars) {
    values[0].compileExp(code, arity, vars);
    values[1].compileExp(code, arity, vars);
    code.add(new ast.query.instrs.ops.Div());
  }

  private void compileMul(Vector<Instr> code, int arity, Vector<String> vars) {
    values[0].compileExp(code, arity, vars);
    values[1].compileExp(code, arity, vars);
    code.add(new ast.query.instrs.ops.Mul());
  }

  private void compileSub(Vector<Instr> code, int arity, Vector<String> vars) {
    values[0].compileExp(code, arity, vars);
    values[1].compileExp(code, arity, vars);
    code.add(new ast.query.instrs.ops.Sub());
  }

  public void vars(HashSet<String> vars) {
    for (Value value : values)
      value.vars(vars);
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (env.binds(name.getString())) {
      // This is constructor...
      Type cnstrType = env.lookup(name.getString());
      cnstrType = Type.eval(cnstrType, env);
      if (cnstrType instanceof Cnstr) {
        // We are OK...
        Cnstr cnstr = (Cnstr) cnstrType;
        ast.types.Term term1 = cnstr.getType();
        if (Type.equals(cnstr.getUnion(), type, env)) {
          // Good to go...
          for (int i = 0; i < term1.getArity(); i++) {
            env = values[i].type(env, term1.getTypes()[i]);
          }
          return env;
        } else throw new TypeError(getLineStart(), getLineEnd(), "types do not match: " + term1 + " " + type);
      } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a constructor: " + name);
    } else {
      if (type instanceof ast.types.Term) {
        ast.types.Term term = (ast.types.Term) type;
        if (term.getName().equals(name.getString()) && term.getArity() == values.length) {
          for (int i = 0; i < term.getArity(); i++) {
            env = values[i].type(env, term.getTypes()[i]);
          }
          return env;
        } else throw new TypeError(getLineStart(), getLineEnd(), "terms do not match " + type);
      } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a term type " + type);
    }
  }

  public boolean isConstant() {
    for (int i = 0; i < values.length; i++)
      if (!values[i].isConstant()) return false;
    return true;
  }

}
