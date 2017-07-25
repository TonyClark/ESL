package runtime.messages;

import java.util.Arrays;

import runtime.data.Key;
import runtime.data.Term;

public class MessageRecord {

  String        name;
  int           arity;
  MessageRecord next;
  Object[]      values;

  public MessageRecord(String name, int arity, MessageRecord next) {
    super();
    this.name = name;
    this.arity = arity;
    this.next = next;
    this.values = new Object[arity];
  }

  public MessageRecord(String name, Object[] values) {
    this.name = name;
    this.arity = values.length;
    this.values = values;
  }

  public Object[] getValues() {
    return values;
  }

  public String getName() {
    return name;
  }

  public void setArity(int arity) {
    this.arity = arity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getArity() {
    return arity;
  }

  public MessageRecord getNext() {
    return next;
  }

  public void setNext(MessageRecord next) {
    this.next = next;
  }

  public Term getTerm() {
    return new Term(Key.getKey(name), values.clone());
  }
  
  public String toString() {
    return name + "(" + Arrays.toString(values) + ")";
  }

}
