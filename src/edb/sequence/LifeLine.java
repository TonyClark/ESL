package edb.sequence;

public class LifeLine extends TimedEvent {

  int    id;
  int    death;
  String behaviour;

  public LifeLine(int id, int time, int death, String behaviour) {
    super(time);
    this.id = id;
    this.death = death;
    this.behaviour = behaviour;
  }

  public int getId() {
    return id;
  }

  public int getDeath() {
    return death;
  }

  public String getBehaviour() {
    return behaviour;
  }

  public String toString() {
    return "Lifeline(" + id + "," + getTime() + "," + death + "," + behaviour + ")";
  }

}
