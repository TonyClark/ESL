package history;

public class Consume extends Event {

	int			id;
	Object	value;

	public Consume(int id, Object value, int time) {
		super(time);
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public Object getValue() {
		return value;
	}

  public String pprint() {
    return "consume " + value;
  }

}
