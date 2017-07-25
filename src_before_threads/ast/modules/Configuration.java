package ast.modules;

import java.util.HashSet;

import ast.binding.Dec;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "binds" })
public class Configuration implements Located {

  public String       name;
  public ConfigBind[] binds;
  int                 start = -1;
  int                 end   = -1;

  public Configuration() {
  }

  public String getName() {
    return name;
  }

  public ConfigBind[] getBinds() {
    return binds;
  }

  public void type(Env<String, Type> env) {
    for (ConfigBind b : binds)
      b.type(env);
  }

  public void check(Parameters parameters) {
    // Perform basic checks...
    HashSet<String> declared = new HashSet<String>();
    HashSet<String> defined = new HashSet<String>();

    for (ConfigBind b : binds)
      defined.add(b.getName());
    for (Dec dec : parameters.getDecs())
      declared.add(dec.getName());
    if (!defined.equals(declared)) throw new TypeError(getLineStart(), getLineEnd(), "declared parameters must match defined parameters");

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

}
