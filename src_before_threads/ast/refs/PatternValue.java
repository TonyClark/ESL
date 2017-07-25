package ast.refs;

import runtime.actors.Actor;

public class PatternValue extends Ref {

	int index;

	public PatternValue(int index) {
		super();
		this.index = index;
	}

	public Object ref(Actor a) {
		return a.getFrameVar(index);
	}

	public String toString() {
		return "[" + index + "]";
	}

}
