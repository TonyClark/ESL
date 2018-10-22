package ast.types;

import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "types" })

public class MessageType implements Located {

  public Type[] types;
  int           lineStart = -1;
  int           lineEnd   = -1;

  public MessageType() {
  }

  public MessageType(int lineStart, int lineEnd, Type[] types) {
    super();
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
    this.types = types;
  }

  public Type[] getTypes() {
    return types;
  }

  public void setTypes(Type[] types) {
    this.types = types;
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

  public boolean equals(MessageType ht, Env<String, Type> env) {
    if (types.length == ht.getTypes().length) {
      for (int i = 0; i < types.length; i++)
        if (!Type.equals(ht.getTypes()[i], types[i], env)) return false;
      return true;
    } else return false;
  }

  public String toString() {
    return Type.separateWith(types, ",");
  }

  public MessageType substType(Type type, String name) {
    return new MessageType(lineStart, lineEnd, Type.substTypes(types, type, name));
  }

  public boolean bind(MessageType valueHandler) {
    if (types.length == valueHandler.getTypes().length) {
      for (int i = 0; i < types.length; i++) {
        if (!types[i].equals(valueHandler.getTypes()[i])) return false;
      }
      return true;
    } else return false;
  }

  public void check(Env<String, Type> env) {
    for (Type type : types)
      type.check(env);
  }

  public void FV(HashSet<String> vars) {
    for (Type type : types)
      type.FV(vars);
  }


}
