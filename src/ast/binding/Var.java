package ast.binding;

import java.util.HashSet;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "name" })
public class Var extends AST implements ReferencingLocation {

  public String     name;
  DeclaringLocation declaringLocation;

  public Var() {
  }

  public Var(int lineStart, int lineEnd, String name, Type type, DeclaringLocation declaringLocation) {
    super(lineStart, lineEnd);
    this.name = name;
    this.declaringLocation = declaringLocation;
    setType(type);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (lookup(name, locals) != null)
      lookup(name, locals).compile(getLineStart(), code, locals, dynamics);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).compile(getLineStart(), code, locals, dynamics);
    else throw new java.lang.Error("cannot find declaration for variable " + name);
  }

  public void DV(HashSet<String> vars) {
  }

  public void FV(HashSet<String> vars) {
    vars.add(name);
  }

  public String getLabel() {
    return "var " + name + " :: " + getType();
  }

  public String getName() {
    return name;
  }

  public int maxLocals() {
    return 0;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPath(String path) {
  }

  public AST subst(AST ast, String name) {
    if (this.name.equals(name))
      return ast;
    else return this;
  }

  public String toString() {
    return "Var(" + getLineStart() + "," + name + ")";
  }

  public Type type(Env<String, Type> env) {
    if (env.binds(name)) {
      setType(Type.eval(env.lookup(name), env));
      return getType();
    } else throw new TypeError(getLineStart(), getLineEnd(), "unbound variable " + name);
  }

  public DeclaringLocation getDeclaringLocation() {
    return declaringLocation;
  }

  public void setDeclaringLocation(DeclaringLocation declaringLocation) {
    this.declaringLocation = declaringLocation;
  }

}
