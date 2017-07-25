package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.locals.Local;
import ast.query.instrs.locals.NewVar;
import ast.query.instrs.unify.Unify;
import ast.query.value.Name;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "exp" })
public class Is extends BodyElement implements DeclaringLocation {

  public String name;
  public Value  exp;

  public Is() {
  }

  public BodyElement subst(Type type, String typeName) {
    return this;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    if (!decs.containsKey(name)) decs.put(name, this);
    exp.getContainedDecs(decs);
  }

  public String getName() {
    return name;
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    if (vars.contains(name)) {
      code.add(new Local(arity + vars.indexOf(name)));
    } else {
      vars.add(name);
      code.add(new NewVar(arity + vars.indexOf(name)));
    }
    exp.compileExp(code, arity, vars);
    code.add(new Unify());
  }

  public void vars(HashSet<String> vars) {
    exp.vars(vars);
  }

}
