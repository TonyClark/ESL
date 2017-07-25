package history;

import java.io.Serializable;

public abstract class Event implements Serializable {
	
	int time;

	public Event(int time) {
		super();
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

  public abstract String pprint();

}
