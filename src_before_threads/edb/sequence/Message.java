package edb.sequence;

import java.util.Arrays;

public class Message extends TimedEvent {

  int      source;
  int      target;
  String[] labels;

  public Message(int time, int source, int target, String[] labels) {
    super(time);
    this.source = source;
    this.target = target;
    this.labels = labels;
  }

  public int getSource() {
    return source;
  }

  public int getTarget() {
    return target;
  }

  public String[] getLabels() {
    return labels;
  }

  public boolean involves(int id) {
    return source == id || target == id;
  }

  public String toString() {
    return "Message(" + getTime() + "," + source + "," + target + "," + Arrays.toString(labels) + ")";
  }

  public Message merge(Message other) {
    String[] mergedLabels = new String[labels.length + other.labels.length];
    for (int i = 0; i < labels.length; i++)
      mergedLabels[i] = labels[i];
    for (int i = 0; i < other.labels.length; i++)
      mergedLabels[i + labels.length] = other.labels[i];
    return new Message(getTime(), source, target, mergedLabels);
  }

}
