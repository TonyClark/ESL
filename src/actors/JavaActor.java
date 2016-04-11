package actors;

public interface JavaActor {

  public boolean hasExport(Key name);

  public Object ref(Key name);

  public Key[] getExports();

  public void send(Object message, int time);

}
