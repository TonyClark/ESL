package ast.modules;

import java.util.HashSet;
import java.util.Vector;

import ast.binding.Binding;
import ast.binding.Dec;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "decs", "configs", "rules" })

public class Parameters {

  public Dec[]           decs;
  public Configuration[] configs;
  public Rule[]          rules;

  public void type(Env<String, Type> env, Binding[] typeBindings) {
    for (Binding b : typeBindings)
      env = env.bind(b.getName(), (Type) b.getValue());
    for (Dec dec : decs) {
      env = env.bind(dec.getName(), dec.getDeclaredType());
    }
    for (Configuration c : configs) {
      c.type(env);
    }
  }

  public Binding[] getDefs(String configName) {

    // Return the bindings defined by the named configuration. If there is
    // no configuration with the supplied name then return those of the first...

    if (configs.length == 0)
      return new Binding[0];
    else {
      Configuration c = getConfig(configName);
      Binding[] defs = new Binding[c.getBinds().length];
      for (int i = 0; i < defs.length; i++) {
        ConfigBind b = c.getBinds()[i];
        int start = b.getLineStart();
        int end = b.getLineEnd();
        Dec d = getDec(b.getName());
        if (d == null) throw new TypeError(start, end, "cannot find declaration for " + b.getName());
        String path = d.getPath();
        defs[i] = new Binding(start, end, path, b.getName(), d.getDeclaredType(), b.getValue());
      }
      return defs;
    }
  }

  private Configuration getConfig(String configName) {
    for (Configuration c : configs)
      if (c.getName().equals(configName)) return c;
    return configs[0];
  }

  private Dec getDec(String name) {
    for (Dec dec : decs) {
      if (dec.getName().equals(name)) return dec;
    }
    return null;
  }

  public void check() {
    // Perform some basic checks and throw a type error if appropriate.
    Vector<String> names = new Vector<String>();
    for (Configuration c : configs) {
      if (names.contains(c.getName())) throw new TypeError(c.getLineStart(), c.getLineEnd(), "duplicate name");
      names.add(c.getName());
      c.check(this);
    }
  }

  public Dec[] getDecs() {
    return decs;
  }

  public Configuration[] getConfigs() {
    return configs;
  }

  public Rule[] getRules() {
    return rules;
  }

  public boolean hasConfiguration(String name) {
    for (Configuration c : configs)
      if (c.getName().equals(name)) return true;
    return false;
  }

}
