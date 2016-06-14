package actors;

public interface StopListener {

  public static StopListener NOOP = new StopListener() {
    public void stop() {
    }
  };

  public void stop();

}
