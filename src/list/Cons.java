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

  public List<Element> append(Element object) {
    return tail.append(object).cons(head);
  }

  public boolean equals(Object other) {
    if (other instanceof Cons<?>) {
      Cons<Element> cons = (Cons<Element>) other;
      boolean headEquals = true;
      boolean tailEquals = true;
      if (head == null) {
        if (cons.head != null) headEquals = false;
      }
      if (cons.head == null) {
        if (head != null) headEquals = false;
      }
      if (tail == null) {
        if (cons.tail != null) tailEquals = false;
      }
      if (cons.tail == null) {
        if (tail != null) tailEquals = false;
      }
      return headEquals && tailEquals && head.equals(cons.head) && tail.equals(((Cons) other).tail);
    } else return super.equals(other);
  }

  public Element getHead() {
    return head;
  }

  public List<Element> getTail() {
    return tail;
  }

  public Object getTailMaybe() {
    if (tail instanceof Maybe<?>) {
      Maybe<Element> maybe = (Maybe<Element>) tail;
      return ((Maybe) tail).getValue();
    } else return tail;
  }

  public boolean isNil() {
    return false;
  }

  public boolean isRealList() {
    if (tail instanceof List) {
      List<Element> t = (List<Element>) tail;
      return t.isRealList();
    } else return false;
  }

  public int lengthRec() {
    return tail.length() + 1;
  }

  public int length() {
    int length = 0;
    List<Element> l = this;
    while (!l.isNil()) {
      length++;
      l = l.getTail();
    }
    return length;
  }

  public <T> List<T> map(Function<Element, T> f) {
    return new Cons<T>(f.apply(head), tail.map(f));
  }

  public void setHead(Element head) {
    this.head = head;
  }

  public void setTail(List<Element> tail) {
    this.tail = tail;
  }

  public List<Element[]> split(List<Element> prefix) {
    return tail.split(prefix.append(head)).cons((Element[]) new Object[] { prefix, this });
  }

}
