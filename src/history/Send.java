package history;

import ast.query.value.Value;

public class Send extends Event {

	int		source;
	int		target;
	Object	value;

	public Send(int source, int target, Object value, int time) {
		super(time);
		this.source = source;
		this.target = target;
		this.value = value;
	}

	public int getSource() {
		return source;
	}

	public int getTarget() {
		return target;
	}

	public Object getValue() {
		return value;
	}
	
	public String toString() {
		return "Send(" + source + "," + target + "," + value + "," + getTime() + ")";
	}

  public String pprint() {
    return target + " <- " + value;
  }

}
