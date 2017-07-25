package runtime.data;

import java.io.Serializable;
import java.util.Collections;
import java.util.Vector;

import list.List;

public class Set implements Serializable {

  public Vector<Object> elements = new Vector<Object>();

  public Set() {
  }

  public Set(Vector<Object> elements) {
    super();
    this.elements = elements;
  }

  public void add(Object element) {
    if (!elements.contains(element)) elements.add(element);
  }

  public String toString() {
    Collections.shuffle(elements);
    return "Set(" + elements + ")";
  }

  public Set cons(Object v) {
    if (elements.contains(v))
      return this;
    else {
      Set b = new Set();
      for (Object e : elements)
        b.add(e);
      b.add(v);
      return b;
    }
  }

  public Object union(Set other) {
    Set b = new Set();
    for (Object e : elements)
      b.add(e);
    for (Object e : other.elements)
      b.add(e);
    return b;
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }

  public Set remove(Object object) {
    Vector<Object> newElements = (Vector<Object>) elements.clone();
    newElements.remove(object);
    return new Set(newElements);
  }

  public int size() {
    return elements.size();
  }

  public void shuffle() {
    Collections.shuffle(elements);
  }

  public Set take(int els) {
    Vector<Object> newElements = new Vector<Object>();
    for (int i = 0; i < els; i++) {
      newElements.add(elements.get(i));
    }
    return new Set(newElements);
  }

  public Set drop(int els) {
    Vector<Object> newElements = new Vector<Object>();
    for (int i = els; i < elements.size(); i++)
      newElements.add(elements.get(i));
    return new Set(newElements);
  }

}
