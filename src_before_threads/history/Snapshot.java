package history;

import java.io.Serializable;

import runtime.ESL;

public class Snapshot implements Serializable {

  String label;
  int    time;

  public Snapshot(String label, int time) {
    super();
    this.label = label;
    this.time = time;
  }

  public String getLabel() {
    return label;
  }

  public int getTime() {
    return time;
  }

  public void save(String path, History history) {
    History snapshot = history.getSnapshot(ESL.getTime());
    snapshot.serialize(path + "/" + label + ".hst");
  }
}
