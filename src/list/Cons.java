package list;

import java.util.function.Function;

public class Cons<Element> extends List<Element> {

  Element       head;
  List<Element> tail;

  public Cons() {
  }

  public Cons(Element head, List<Element> tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public Element getHead() {
    return head;
  }

  public void setHead(Element head) {
    this.head = head;
  }

  public List<Element> getTail() {
    return tail;
  }

  public void setTail(List<Element> tail) {
    this.tail = tail;
  }

  public boolean isNil() {
    return false;
  }

  public int length() {
    return tail.length() + 1;
  }

  public List<Element[]> split(List<Element> prefix) {
    return tail.split(prefix.append(head)).cons((Element[]) new Object[] { prefix, this });
  }

  public List<Element> append(Element object) {
    return tail.append(object).cons(head);
  }

  public <T> List<T> map(Function<Element, T> f) {
    return new Cons<T>(f.apply(head), tail.map(f));
  }

  public boolean isRealList() {
    if(tail instanceof List) {
      List<Element> t = (List<Element>) tail;
      return t.isRealList();
    } else return false;
  }

}
