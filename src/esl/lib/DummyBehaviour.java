package esl.lib;

import java.util.ArrayDeque;

public class DummyBehaviour implements Behaviour {

	public static ESLVal DUMMY = new ESLVal(new DummyBehaviour());

	public ESLVal get(String name) {
		return null;
	}

	public Actor send(Actor self, ESLVal message) {
		return self;
	}

	public void setSelf(Actor self) {

	}

	public Actor start(Actor self) {
		return self;
	}

	public void stop() {

	}

	public boolean tick(Actor self) {
		return false;
	}

	public ESLVal getName() {
		return null;
	}

	public void handleTime(ESLVal time) {

	}

	public void setSelf(ESLVal actor) {
	}

	public ESLVal getSelf() {
		return null;
	}

	public ESLVal handle(ESLVal message) {
		throw new Error("Cannot handle message " + message);
	}

	public ArrayDeque<ESLVal> getQueue() {
		return null;
	}

	public void setQueue(ArrayDeque<ESLVal> queue) {
	}

	public ESLVal getParent() {
		return null;
	}

	public boolean hasParent() {
		return false;
	}

}
