package esl.lib;

public class DummyActor extends Actor {

	public DummyActor() {
		setBehaviour(new DummyBehaviour());
		setNext(this);
		setPrevious(this);
	}

	public String toString() {
		return "<dummy actor " + getId() + ">";
	}

	// public Actor unlink() {
	// return this;
	// }
}
