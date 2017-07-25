package ast.query.value;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.locals.Local;
import ast.query.instrs.locals.NewVar;
import ast.query.instrs.locals.SetLocal;
import ast.query.instrs.unify.Unify;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })
public class Name extends Value implements DeclaringLocation, ReferencingLocation {

  public String     name;
  DeclaringLocation loc;

  public Name() {
  }

  public Name(String name) {
    super();
    this.name = name;
  }

  public Object recons(Env<String, Var> venv) {
    if (venv.binds(name)) {
      Var var = venv.lookup(name);
      return var.recons(venv);
    } else throw new Error("cannot find variable named " + name);
  }

  public String toString() {
    return name;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    if (!decs.containsKey(name)) decs.put(name, this);
  }

  public String getName() {
    return name;
  }

  public void setDeclaringLocation(DeclaringLocation loc) {
    this.loc = loc;
  }

  public DeclaringLocation getDeclaringLocation() {
    return loc;
  }

  public void compileHead(Vector<Instr> code, int arity, Vector<String> vars) {
    if (vars.contains(name)) {
      code.add(new Local(vars.indexOf(name) + arity));
      code.add(new Unify());
    } else {
      vars.add(name);
      code.add(new SetLocal(vars.indexOf(name) + arity));
    }
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars) {
    if (vars.contains(name)) {
      code.add(new Local(vars.indexOf(name) + arity));
    } else {
      vars.add(name);
      code.add(new NewVar(vars.indexOf(name) + arity));
    }
  }

  public void compileExp(Vector<Instr> code, int arity, Vector<String> vars) {
    if (vars.contains(name)) {
      code.add(new Local(vars.indexOf(name) + arity));
    } else {
      vars.add(name);
      code.add(new NewVar(vars.indexOf(name) + arity));
    }
  }

  public void vars(HashSet<String> vars) {
    vars.add(name);
  }

  public Env<String, Type> type(Env<String, Type> env, Type type) {
    if (env.binds(name)) {
      Type t = env.lookup(name);
      if (!Type.equals(t, type, env)) {
        throw new TypeError(getLineStart(), getLineEnd(), name + "::" + t + " but expecting " + type);
      } else return env;
    } else {
      setType(type);
      return env.bind(name, type);
    }
  }

  public boolean isConstant() {
    return false;
  }

  public boolean isExp() {
    return false;
  }

}
