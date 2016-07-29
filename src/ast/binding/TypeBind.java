package ast.binding;

import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "declaredType", "value" })

public class TypeBind extends Binding {

  public TypeBind() {
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

}
