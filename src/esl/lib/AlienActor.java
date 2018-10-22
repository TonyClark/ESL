package esl.lib;

public interface AlienActor  {
	
	public ESLVal alienRef(String name);

	public void alienSend(ESLVal message);

	public void stop();

}
