package actors;

import java.util.Vector;

public class History {

  Vector<Snapshot> snapshots = new Vector<Snapshot>();

  public void add(int time, Object value) {
    snapshots.add(new Snapshot(time, value));
  }

  public String toString() {
    return snapshots.toString();
  }

}
