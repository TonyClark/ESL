package ast.types;

import java.util.Arrays;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "domain", "range" })
public class Fun extends Type {

  public Type[] domain;
  public Type   range;

  public Fun() {
  }

  public Fun(Type[] domain, Type range) {
    this.domain = domain;
    this.range = range;
  }

  public Type[] getDomain() {
    return domain;
  }

  public void setDomain(Type[] domain) {
    this.domain = domain;
  }

  public Type getRange() {
    return range;
  }

  public void setRange(Type range) {
    this.range = range;
  }

  public String toString() {
    String concat = Arrays.toString(domain);
    concat = concat.substring(1, concat.length() - 1);
    return "(" + concat + ") -> " + range;
  }

  public boolean equals(Object other) {
    if (other instanceof Fun) {
      Fun fun = (Fun) other;
      if (fun.getDomain().length == domain.length) {
        for (int i = 0; i < domain.length; i++)
          if (!domain[i].equals(fun.getDomain()[i])) return false;
      }
      return range.equals(fun.getRange());
    } else return super.equals(other);
  }

  public Fun eval(Env<String, Type> env) {
    Type[] ts = new Type[domain.length];
    for (int i = 0; i < ts.length; i++)
      ts[i] = domain[i].eval(env);
    return new Fun(ts, range.eval(env));
  }

}
