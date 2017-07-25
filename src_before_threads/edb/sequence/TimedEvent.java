package edb.sequence;

public abstract class TimedEvent {
  
  int time;
  
  public TimedEvent(int time) {
    this.time = time;
  }

  public int getTime() {
    return time;
  }

}
