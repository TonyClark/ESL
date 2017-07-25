package ast.binding;

import ast.AST;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "declaredType", "value" })

public class TypeBind extends Binding {

  public TypeBind() {
  }

  public TypeBind(int start, int end, String path, String name, Type type, AST value) {
    super(start, end, path, name, type, value);
  }

  public String toString() {
    return "TypeBind(" + getName() + "," + value + ")";
  }

  public Env<String, Type> bind(Env<String, Type> env) {
    String name = getName();
    Type dType = getDeclaredType();
    env = env.bind(name, dType);
    return env;
  }

  public void setLineStart(int i) {
    super.setLineStart(i);
  }

  public void check(Env<String, Type> env) {
    // Throws a type error if there is something wrong with the declared type...
    getDeclaredType().check(env);
  }

  public TypeBind substBind(Type type, String name) {
    Type t = getDeclaredType().substType(type, name);
    return new TypeBind(getLineStart(), getLineEnd(), getPath(), getName(), t, t);
  }

}
