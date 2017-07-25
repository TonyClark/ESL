package ast.types;

import ast.binding.Dec;
import ast.patterns.Pattern;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "domain", "range" })
public class Fun extends Type {

  public static Type[] ptypes(Pattern[] patterns) {
    Type[] types = new Type[patterns.length];
    for (int i = 0; i < patterns.length; i++)
      types[i] = patterns[i].getDeclaredType();
    return types;
  }
  
  public static Type[] types(Dec[] decs) {
    Type[] types = new Type[decs.length];
    for (int i = 0; i < decs.length; i++)
      types[i] = decs[i].getDeclaredType();
    return types;
  }

  public Type[] domain;
  public Type   range;

  public Fun() {
  }

  public Fun(int lineStart, int lineEnd, Type[] domain, Type range) {
    super(lineStart, lineEnd);
    this.domain = domain;
    this.range = range;
  }

  public Type[] getDomain() {
    return domain;
  }

  public Type getRange() {
    return range;
  }

  public void setDomain(Type[] domain) {
    this.domain = domain;
  }

  public void setRange(Type range) {
    this.range = range;
  }

  public Type substType(Type type, String name) {
    return new Fun(getLineStart(), getLineEnd(), Type.substTypes(domain, type, name), range.substType(type, name));
  }

  public String toString() {
    return "(" + separateWith(domain, ",") + ") -> " + range;
  }

  public void check(Env<String, Type> env) {
    for(Type type : domain) type.check(env);
    range.check(env);
  }

}
