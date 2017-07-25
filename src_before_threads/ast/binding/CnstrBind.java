package ast.binding;

import ast.types.Apply;
import ast.types.Cnstr;
import ast.types.Rec;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeFun;
import ast.types.Unfold;
import ast.types.Union;
import ast.types.UnionRef;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "declaredType", "value" })

public class CnstrBind extends TypeBind {

  public CnstrBind() {
  }

  public String toString() {
    return "CnstrBind(" + getName() + "," + value + ")";
  }

  public boolean isGeneric() {
    return getDeclaredType() instanceof TypeFun;
  }

  public Env<String, Type> bind(Env<String, Type> env) {
   return env.bind(getName(), getDeclaredType());
  }

}
