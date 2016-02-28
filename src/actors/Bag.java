package actors;

import java.util.Collections;
import java.util.Vector;

public class Bag {

  Vector<Object> elements = new Vector<Object>();

  public Bag() {
  }

  public void add(Object element) {
    elements.add(element);
  }

  public String toString() {
    Collections.shuffle(elements);
    return "Bag(" + elements + ")";
  }

  public Bag cons(Object v) {
    Bag b = new Bag();
    for (Object e : elements)
      b.add(e);
    b.add(v);
    return b;
  }

  public Object union(Bag other) {
    Bag b = new Bag();
    for (Object e : elements)
      b.add(e);
    for (Object e : other.elements)
      b.add(e);
    return b;
  }

}
