package list;

import java.util.function.Function;

public class Nil<Element> extends List<Element> {

  public boolean isNil() {
    return true;
  }

  public Element getHead() {
    throw new Error("cannot take head of nil.");
  }

  public List<Element> getTail() {
    throw new Error("cannot take tail of nil.");
  }

  public int length() {
    return 0;
  }

  public List<Element> append(Element object) {
    return cons(object);
  }

  public List<Element[]> split(List<Element> prefix) {
    return new Nil<Element[]>().cons((Element[]) new Object[] { prefix, this });
  }

  public boolean equals(Object other) {
    if (other instanceof Nil<?>)
      return true;
    else return super.equals(other);
  }

  public <T> List<T> map(Function<Element, T> f) {
    return new Nil<T>();
  }

  public boolean isRealList() {
    return true;
  }

}
