package ast.binding;

import java.util.HashSet;

import actors.CodeBox;
import ast.AST;
import ast.data.BinExp;
import ast.data.Int;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "name", "value" })

public class Update extends AST {

  public String name;
  public AST    value;

  public Update() {
  }

  public Update(String name, AST value) {
    super();
    this.name = name;
    this.value = value;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    if (isSub1())
      compileSub1(locals, dynamics, code);
    else {
      value.compile(locals, dynamics, code, false);
      if (lookup(name, locals) != null)
        lookup(name, locals).update(getLine(), code, locals, dynamics);
      else if (lookup(name, dynamics) != null)
        lookup(name, dynamics).update(getLine(), code, locals, dynamics);
      else throw new java.lang.Error("cannot update " + name + " in " + locals + " and " + dynamics);
    }
  }

  private void compileSub1(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    if (lookup(name, locals) != null)
      lookup(name, locals).sub1(getLine(), code, locals, dynamics);
    else if (lookup(name, dynamics) != null)
      lookup(name, dynamics).sub1(getLine(), code, locals, dynamics);
    else throw new java.lang.Error("cannot subtract 1 from " + name + " in " + locals + " and " + dynamics);
  }

  private boolean isSub1() {
    if (value instanceof BinExp) {
      BinExp b = (BinExp) value;
      if (b.op.equals("-")) {
        if (b.left instanceof Var) {
          Var v = (Var) b.left;
          if (v.name.equals(name)) {
            if (b.right instanceof Int) {
              Int i = (Int) b.right;
              return i.value == 1;
            } else return false;
          } else return false;
        } else return false;
      } else return false;
    } else return false;
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public int maxLocals() {
    return value.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Update(this.name, value.subst(ast, name));
  }

  public String toString() {
    return "Update(" + name + "," + value + ")";
  }

  public void setPath(String path) {
    value.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type valueType = value.type(env);
    if (env.binds(name)) {
      Type varType = env.lookup(name);
      Type type = varType.bind(valueType);
      if (type != null)
        return type;
      else throw new TypeMatchError(this, valueType, varType);
    } throw new TypeError(this,"unbound variable " + name);
  }

}
