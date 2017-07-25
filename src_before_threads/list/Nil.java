package list;

import java.util.function.Function;

public class Nil<Element> extends List<Element> {

  public List<Element> append(Element object) {
    return cons(object);
  }

  public boolean equals(Object other) {
    if (other instanceof Nil<?>)
      return true;
    else return super.equals(other);
  }

  public Element getHead() {
    throw new Error("cannot take head of nil.");
  }

  public List<Element> getTail() {
    throw new Error("cannot take tail of nil.");
  }

  public Object getTailMaybe() {
    throw new Error("cannot take tail of nil.");
  }

  public boolean isNil() {
    return true;
  }

  public boolean isRealList() {
    return true;
  }

  public int length() {
    return 0;
  }

  public <T> List<T> map(Function<Element, T> f) {
    return new Nil<T>();
  }

  public List<Element[]> split(List<Element> prefix) {
    return new Nil<Element[]>().cons((Element[]) new Object[] { prefix, this });
  }

}
