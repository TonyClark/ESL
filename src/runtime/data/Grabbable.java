package runtime.data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import runtime.actors.Actor;

public class Grabbable {

	Lock lock = new ReentrantLock();

	public void grab(Actor actor) {
		lock.lock();
	}

	public void release() {
		lock.unlock();
	}

	public Lock getLock() {
		return lock;
	}

}
