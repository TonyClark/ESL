package ast.types;

import java.util.Arrays;

import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "types", "result" })

public class HandlerType implements Located {

  public Type[] types;
  public Type   result;
  int           lineStart = -1;
  int           lineEnd = -1;

  public HandlerType() {
  }

  public HandlerType(int lineStart, int lineEnd, Type[] types, Type result) {
    super();
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
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

  public int getLineStart() {
    return lineStart;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public boolean canHandle(Type[] valueTypes) {
    if (valueTypes.length == types.length) {
      for (int i = 0; i < types.length; i++) {
        if (!types[i].equals(valueTypes[i])) return false;
      }
      return true;
    }
    return false;
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

  public String toString() {
    return Type.separateWith(types, ",") + " when Bool -> " + result;
  }

  public HandlerType substType(Type type, String name) {
    return new HandlerType(lineStart, lineEnd, Type.substTypes(types, type, name), result.substType(type, name));
  }

  public boolean bind(HandlerType valueHandler) {
    if (types.length == valueHandler.getTypes().length) {
      for (int i = 0; i < types.length; i++) {
        if (!types[i].equals(valueHandler.getTypes()[i])) return false;
      }
      return result.equals(valueHandler.getResult());
    } else return false;
  }

}
