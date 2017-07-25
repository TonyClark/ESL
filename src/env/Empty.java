package env;

import java.util.Vector;

public class Empty<Key, Value> extends Env<Key, Value> {

	public Env<Key, Value> bind(Key key, Value value) {
		return new Bind<Key, Value>(key, value, this);
	}

	public Value lookup(Key key) {
		throw new Error("Cannot find " + key);
	}

	public boolean binds(Key key) {
		return false;
	}

	public Value lookupEq(Key key) {
		throw new Error("Cannot find " + key);
	}

	public Value lookupEq(Key key, Value unbound) {
		return unbound;
	}

	public boolean bindsEq(Key key) {
		return false;
	}

	public void set(Key key, Value value) {
	}

	protected void dom0(Vector<Key> vector) {
	}

	protected void ran0(Vector<Value> vector) {
	}

	public Env<Key, Value> sub(Env<Key, Value> env) {
		return this;
	}

	public String toString() {
		return "{}";
	}

}
