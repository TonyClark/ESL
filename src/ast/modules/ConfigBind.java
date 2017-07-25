package ast.modules;

import java.util.HashSet;

import ast.AST;
import ast.binding.Dec;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "value" })
public class ConfigBind implements Located {

  public String name;
  public AST    value;
  int           start = -1;
  int           end   = -1;

  public ConfigBind() {
  }

  public String getName() {
    return name;
  }

  public AST getValue() {
    return value;
  }

  public int getLineStart() {
    return start;
  }

  public int getLineEnd() {
    return end;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public void type(Env<String, Type> env) {
    if (env.binds(name)) {
      Type declaredType = Type.eval(env.lookup(name),env);
      Type valueType = value.type(env);
      if (!Type.equals(declaredType, valueType, env)) throw new TypeError(start, end, name + " declared to be type " + declaredType + " but initialised with value of type " + valueType);
    } else throw new TypeError(start, end, "undeclared parameter " + name);
  }

}
