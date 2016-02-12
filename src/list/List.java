package list;

import java.lang.reflect.Array;
import java.util.function.Function;

public abstract class List<Element> {

  public abstract boolean isNil();

  public abstract Element getHead();

  public abstract List<Element> getTail();

  public abstract int length();

  public Cons<Element> cons(Element head) {
    return new Cons<Element>(head, this);
  }

  public List<Element> append(List<Element> list) {
    if (isNil())
      return list;
    else return getTail().append(list).cons(getHead());
  }

  public List<Element> take(int elements) {
    if (elements == 0)
      return new Nil<Element>();
    else return getTail().take(elements - 1).cons(getHead());
  }

  public List<Element[]> split() {
    return split(new Nil<Element>());
  }

  public abstract List<Element[]> split(List<Element> prefix);

  public abstract List<Element> append(Element object);

  public List<Element> reverse() {
    List<Element> list = this;
    List<Element> newList = new Nil<Element>();
    while (!list.isNil()) {
      newList = newList.cons(list.getHead());
      list = list.getTail();
    }
    return newList;
  }

  public Element nth(int i) {
    if (i <= 0)
      return getHead();
    else return getTail().nth(i - 1);
  }

  public List<Element> update(int i, Element v) {
    if (i == 0)
      return getTail().cons(v);
    else return getTail().update(i - 1, v).cons(getHead());
  }

  public abstract <T> List<T> map(Function<Element, T> f);

  public static <T> List<T> flatten(List<List<T>> ls) {
    if (ls.isNil())
      return new Nil<T>();
    else return ls.getHead().append(flatten(ls.getTail()));
  }

  public String toString() {
    if (isRealList()) {
      String s = "[";
      for (int i = 0; i < length() - 1; i++)
        s = s + nth(i) + ",";
      if (isNil())
        return s + "]";
      else return s + last() + "]";
    }
    return super.toString();
  }

  public abstract boolean isRealList();

  public Element last() {
    return nth(length() - 1);
  }

  public Element[] asArray() {
    Element[] a = (Element[]) Array.newInstance(Object.class, length());
    List<Element> l = this;
    for (int i = 0; i < length(); i++)
      a[i] = nth(i);
    return a;
  }

}
