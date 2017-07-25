package runtime.data;

import runtime.actors.Actor;

public class Dynamic extends Grabbable {

	Object	value;

	public Dynamic(Object value) {
		this.value = value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String toString() {
		return value == null ? "null" : value.toString();
	}

	public Object getValue() {
		return value;
	}
}
