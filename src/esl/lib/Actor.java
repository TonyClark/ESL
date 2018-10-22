package esl.lib;

import runtime.data.Term;

public class Actor {

	private static int	idCount		= 0;

	Behaviour						behaviour;
	int									id				= idCount++;
	Actor								next;
	Actor								previous;
	boolean							isZombie	= false;
	
	public Actor() { }

	public ESLVal get(String name) {
		return behaviour.get(name);
	}

	public Behaviour getBehaviour() {
		return behaviour;
	}

	public int getId() {
		return id;
	}

	public Actor getNext() {
		return next;
	}

	public Actor getPrevious() {
		return previous;
	}

	public boolean isSingleton() {
		return getNext() == this && getPrevious() == this;
	}

	public boolean isZombie() {
		return isZombie;
	}

	public void linkNext(Actor a) {
		Actor tmp = next;
		a.setNext(tmp);
		a.setPrevious(this);
		next.setPrevious(a);
		setNext(a);
	}

	public void linkPrev(Actor a) {
		Actor tmp = previous;
		a.setPrevious(tmp);
		a.setNext(this);
		previous.setNext(a);
		setPrevious(a);
	}

	public void reactivate() {
		isZombie = false;
		Lib.register(this);
	}

	public Actor send(ESLVal message) {
		return behaviour.send(this, message);
	}

	public void setNext(Actor next) {
		this.next = next;
	}

	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}

	public void setPrevious(Actor previous) {
		this.previous = previous;
	}

	public void setZombie(boolean isZombie) {
		this.isZombie = isZombie;
	}

	public Actor start() {
		return behaviour.start(this);
	}

	public void stop() { 
		behaviour.stop();
	}

	public boolean tick() {
		return behaviour.tick(this);
	}

	public String toString() {
		Actor p = getPrevious();
		Actor n = getNext();
		String s1 = (p== null) ? "null" : p.id+"";
		String s2 = (n== null) ? "null" : n.id+"";
		return "<actor " + getId() + "::" + getBehaviour().getName() + " previous = " + s1 + " next = " + s2 + ">";
	}
	
	public Actor unlink() {
		getPrevious().setNext(getNext());
		getNext().setPrevious(getPrevious());
		Actor n = getNext();
		setNext(null);
		setPrevious(null);
		return n;
	}

}
