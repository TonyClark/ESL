package ast.types;

import java.util.Arrays;

import env.Env;
import exp.BoaConstructor;

public class Cnstr extends Type {

  Term  type;
  Union union;

  public Cnstr(int lineStart, int lineEnd, Term type, Union union) {
    super(lineStart, lineEnd);
    this.type = type;
    this.union = union;
  }

  public Term getType() {
    return type;
  }

  public void setType(Term type) {
    this.type = type;
  }

  public Union getUnion() {
    return union;
  }

  public void setUnion(Union union) {
    this.union = union;
  }

  public String toString() {
    return type.toString();
  }

  public Type substType(Type t, String name) {
    return new Cnstr(getLineStart(), getLineEnd(), (Term) type.substType(t, name), (Union) union.substType(t, name));
  }

  public Type[] getTypes() {
    return type.getTypes();
  }

}
