package history;

public class NewActor extends Event {

	int			id;
	String	behaviour;

	public NewActor(int id, String behaviour, int time) {
		super(time);
		this.id = id;
		this.behaviour = behaviour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public String toString() {
		return "NewActor(" + id + "," + behaviour + "," + time + ")";
	}

  public String pprint() {
    return "new " + behaviour;
  }

}
