package runtime.data;

import java.util.Vector;

import list.List;
import list.Nil;

public class History {

  Vector<Snapshot> snapshots = new Vector<Snapshot>();

  public void add(int time, Object value) {
    snapshots.add(new Snapshot(time, value));
  }

  public String toString() {
    return snapshots.toString();
  }

  public List<Term> asTerm() {
    List<Term> terms = new Nil<Term>();
    for (Snapshot snapshot : snapshots) {
      terms = terms.cons(snapshot.asTerm());
    }
    return terms;
  }

}
