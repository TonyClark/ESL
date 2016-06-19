package ast.types;

import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "types", "result" })

public class HandlerType implements Located {

  public Type[] types;
  public Type   result;
  int           line;

  public HandlerType() {
  }

  public HandlerType(Type[] types, Type result) {
    super();
    this.types = types;
    this.result = result;
  }

  public Type[] getTypes() {
    return types;
  }

  public void setTypes(Type[] types) {
    this.types = types;
  }

  public Type getResult() {
    return result;
  }

  public void setResult(Type result) {
    this.result = result;
  }

  public int getLine() {
    return line;
  }

  public void setLine(int linePos) {
    line = linePos;
  }

  public boolean canHandle(Type[] valueTypes) {
    if (valueTypes.length == types.length) {
      for (int i = 0; i < types.length; i++) {
        if (types[i].bind(valueTypes[i]) == null) return false;
      }
      return true;
    }
    return false;
  }

  public HandlerType eval(Env<String, Type> env) {
    Type[] ts = new Type[types.length];
    for (int i = 0; i < ts.length; i++)
      ts[i] = types[i].eval(env);
    return new HandlerType(ts, result.eval(env));
  }

  public boolean equals(Object other) {
    if (other instanceof HandlerType) {
      HandlerType ht = (HandlerType) other;
      if (types.length == ht.getTypes().length) {
        for (int i = 0; i < types.length; i++)
          if (!ht.getTypes()[i].equals(types[i])) return false;
        return result.equals(ht.getResult());
      }
      return false;
    }
    return super.equals(other);
  }

}
