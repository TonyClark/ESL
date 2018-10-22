package esl.lib;

import java.util.ArrayDeque;

public class DummyBehaviour implements Behaviour {

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
		return null;
	}

	@Override
	public ArrayDeque<ESLVal> getQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setQueue(ArrayDeque<ESLVal> queue) {
		// TODO Auto-generated method stub
		
	}

}
