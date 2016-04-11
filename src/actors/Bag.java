package actors;

import java.util.Collections;
import java.util.Vector;

import list.List;

public class Bag {

  Vector<Object> elements = new Vector<Object>();

  public Bag() {
  }

  public Bag(Vector<Object> elements) {
    super();
    this.elements = elements;
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

  public boolean isEmpty() {
    return elements.isEmpty();
  }

  public Bag remove(Object object) {
    Vector<Object> newElements = (Vector<Object>) elements.clone();
    newElements.remove(object);
    return new Bag(newElements);
  }

  public int size() {
    return elements.size();
  }

  public void shuffle() {
    Collections.shuffle(elements);
  }

  public Bag take(int els) {
    Vector<Object> newElements = new Vector<Object>();
    for (int i = 0; i < els; i++) {
      newElements.add(elements.get(i));
    }
    return new Bag(newElements);
  }

  public Bag drop(int els) {
    Vector<Object> newElements = new Vector<Object>();
    for (int i = els; i < elements.size(); i++)
      newElements.add(elements.get(i));
    return new Bag(newElements);
  }

}
