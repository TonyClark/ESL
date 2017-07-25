package runtime.messages;

public class MessageQueue {

  static MessageRecord free  = null;

  MessageRecord        start = null;

  public MessageRecord addNewRecord(String name, int arity) {
    if (isEmpty())
      return initQueue(name, arity);
    else if (hasFreeRecord(arity)) {
      MessageRecord end = findEnd();
      MessageRecord r = getFreeRecord(name, arity);
      end.setNext(r);
      return r;
    } else {
      MessageRecord end = findEnd();
      MessageRecord r = new MessageRecord(name, arity, null);
      end.setNext(r);
      return r;
    }
  }

  public void addRecord(MessageRecord r) {
    if (isEmpty()) {
      start = r;
      r.setNext(null);
    } else {
      findEnd().setNext(r);
      r.setNext(null);
    }
  }

  private boolean hasFreeRecord(int arity) {
    if (free != null) {
      MessageRecord r = free;
      while (r != null) {
        if (r.getArity() >= arity) {
          return true;
        } else r = r.getNext();
      }
      return false;
    } else return false;
  }

  private MessageRecord getFreeRecord(String name, int arity) {
    MessageRecord r = free;
    MessageRecord prev = null;
    while (r != null) {
      if (r.getArity() >= arity) {
        if (prev == null)
          free = r.getNext();
        else prev.setNext(r.getNext());
        r.setArity(arity);
        r.setName(name);
        r.setNext(null);
        return r;
      } else {
        prev = r;
        r = r.getNext();
      }
    }
    return null;
  }

  private MessageRecord findEnd() {
    MessageRecord end = start;
    while (end.getNext() != null) 
      end = end.getNext();
    return end;
  }

  private MessageRecord initQueue(String name, int arity) {
    MessageRecord r = new MessageRecord(name, arity, null);
    start = r;
    return r;
  }

  public boolean isEmpty() {
    return start == null;
  }

  public MessageRecord removeRecord() {
    MessageRecord r = start;
    start = start.getNext();
    r.setNext(null);
    return r;
  }

  public int length() {
    if (start == null)
      return 0;
    else {
      int length = 0;
      MessageRecord end = start;
      while (end != null) {
        length++;
        end = end.getNext();
      }
      return length;
    }
  }

  public void freeMessage(MessageRecord r) {
    r.setNext(free);
    r.setArity(r.getValues().length);
    free = r;
  }

  public String toString() {
    String s = "MessageQueue(";
    MessageRecord r = start;
    while (r != null) {
      s = s + r;
      r = r.getNext();
      if (r != null) s = s + ",";
    }
    return s + ")";
  }

}
