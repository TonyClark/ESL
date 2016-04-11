package actors;

public interface JavaActor {

  public boolean hasExport(String name);

  public Object ref(String name);

  public String[] getExports();

  public void send(Object message, int time);

}
