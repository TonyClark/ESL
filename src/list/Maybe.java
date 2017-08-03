package list;

import java.util.function.Function;

public class Maybe<Element> extends List<Element> {

  Object value;

  public Maybe(Object value) {
    this.value = value;
  }

  public Object getValue() {
    return value;
  }

  public boolean isNil() {
    if (value instanceof List<?>) {
      List<Element> l = (List<Element>) value;
      return l.isNil();
    } else return false;
  }

  public Element getHead() {
    if (value instanceof List<?>) {
      List<Element> l = (List<Element>) value;
      return l.getHead();
    } else throw new Error("Maybe.getHead");
  }

  public List<Element> getTail() {
    if (value instanceof List<?>) {
      List<Element> l = (List<Element>) value;
      return l.getTail();
    } else throw new Error("Maybe.getTail");
  }

  public int length() {
    if (value instanceof List<?>) {
      List<Element> l = (List<Element>) value;
      return l.length();
    } else throw new Error("Maybe.length");
  }

  public List<Element[]> split(List<Element> prefix) {
    throw new Error("Maybe.split");
  }

  public List<Element> append(Element object) {
    throw new Error("Maybe.append");
  }

  public <T> List<T> map(Function<Element, T> f) {
    throw new Error("Maybe.map");
  }

  public boolean isRealList() {
    if (value instanceof List<?>) {
      List<Element> l = (List<Element>) value;
      return l.isRealList();
    } else return false;
  }

  public Object getTailMaybe() {
    throw new Error("Maybe.getTailMaybe");
  }

}
