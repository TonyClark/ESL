package ast.java.types;

import java.io.PrintWriter;

public class Fun extends Type {

  Type[] domain;
  private Type   range;

  public Fun(Type[] domain, Type range) {
    super();
    this.domain = domain;
    this.setRange(range);
  }

  public String toString() {
    String s = "Fun" + domain.length + "<" + getRange().toArgString();
    for (int i = 0; i < domain.length; i++) {
      s = s + "," + domain[i].toArgString();
    }
    return s + ">";
  }

  public Type getRange() {
    return range;
  }

  public void setRange(Type range) {
    this.range = range;
  }

  public Type[] getDomain() {
    return domain;
  }

  public void setDomain(Type[] domain) {
    this.domain = domain;
  }

}
