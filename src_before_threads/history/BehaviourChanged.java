package history;

public class BehaviourChanged extends Event {

	int			id;
	String	oldBehaviour;
	String	newBehaviour;

	public BehaviourChanged(int id, String oldBehaviour, String newBehaviour, int time) {
		super(time);
		this.id = id;
		this.oldBehaviour = oldBehaviour;
		this.newBehaviour = newBehaviour;
	}

	public int getId() {
		return id;
	}

	public String getOldBehaviour() {
		return oldBehaviour;
	}

	public String getNewBehaviour() {
		return newBehaviour;
	}

  public String pprint() {
    return "become " + newBehaviour;
  }

}
