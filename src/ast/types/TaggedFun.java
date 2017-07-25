package ast.types;

import exp.BoaConstructor;

@BoaConstructor(fields = { "domain", "funLabel", "range" })
public class TaggedFun extends Fun {

  // A Tagged fun includes a label that can be used for static analysis of the function type.

  public static String label(String[] strings) {
    // Join the strings with a '.' char...
    return String.join(".", strings);
  }

  public String funLabel;

  public TaggedFun() {
  }

  public TaggedFun(int lineStart, int lineEnd, String label, Type[] domain, Type range) {
    super(lineStart, lineEnd, domain, range);
    this.funLabel = label;
  }

  public Type substType(Type type, String name) {
    return new TaggedFun(getLineStart(), getLineEnd(), funLabel, Type.substTypes(domain, type, name), range.substType(type, name));
  }

  public String toString() {
    return "(" + separateWith(domain, ",") + ") [" + funLabel + "] -> " + range;
  }

  public String getFunLabel() {
    return funLabel;
  }

}
