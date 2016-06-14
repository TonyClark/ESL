package actors;

public interface TimeListener {

  public static TimeListener NOOP = new TimeListener() {
    public void timeChanged(int time) {
    }
  };

  public void timeChanged(int time);

}
