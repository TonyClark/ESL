package ast.data;

import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "namespace", "name" })
public class Ref extends AST {

  public AST namespace;
  public Key name;

  public Ref() {
  }

  public Ref(int lineStart, int lineEnd, AST namespace, Key name) {
    super(lineStart, lineEnd);
    this.namespace = namespace;
    this.name = name;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    namespace.compile(locals, dynamics, code, false);
    code.add(new instrs.ops.Ref(getLineStart(), name), locals, dynamics);
  }

  public void FV(HashSet<String> vars) {
    namespace.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    namespace.DV(vars);
  }

  public int maxLocals() {
    return namespace.maxLocals();
  }

  public AST subst(AST ast, String name) {
    return new Ref(getLineStart(), getLineEnd(), namespace.subst(ast, name), this.name);
  }

  public String toString() {
    return "Ref(" + namespace + "," + name + ")";
  }

  public void setPath(String path) {
    namespace.setPath(path);
  }

  public Type type(Env<String, Type> env) {
    Type type = namespace.type(env).deref(env);
    if (type instanceof ast.types.Record) {
      ast.types.Record rt = (ast.types.Record) type;
      if (rt.hasField(name.getString())) {
        setType(rt.getField(name.getString()).getType());
        return getType();
      } else throw new TypeError(getLineStart(), getLineEnd(), "does not have a field named " + name.getString());
    }
    if (type instanceof ast.types.Act) {
      ast.types.Act act = (ast.types.Act) type;
      if (act.hasField(name.getString())) {
        setType(act.getType(name.getString()));
        return getType();
      } else throw new TypeError(getLineStart(), getLineEnd(), "does not have a field named " + name.getString());
    }
    throw new TypeError(getLineStart(), getLineEnd(), "expecting a behaviour type or a record: " + namespace + ":" + type);
  }

  public String getLabel() {
    return "ref " + name.getString() + " :: " + getType();
  }

}
