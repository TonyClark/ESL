package env;

import java.util.Vector;

public class Concat<Key, Value> extends Env<Key, Value> {

	private Env<Key, Value>	left;
	private Env<Key, Value>	right;

	public Concat(env.Env<Key, Value> left, env.Env<Key, Value> right) {
		super();
		this.left = left;
		this.right = right;
	}

	public Env<Key, Value> getLeft() {
		return left;
	}

	public void setLeft(Env<Key, Value> left) {
		this.left = left;
	}

	public Env<Key, Value> getRight() {
		return right;
	}

	public void setRight(Env<Key, Value> right) {
		this.right = right;
	}

	public boolean binds(Key key) {
		return left.binds(key) || right.binds(key);
	}

	public boolean bindsEq(Key key) {
		return left == key || right.bindsEq(key);
	}

	public Value lookup(Key key) {
		if (left.binds(key))
			return left.lookup(key);
		else return right.lookup(key);
	}

	public Value lookupEq(Key key) {
		if (left.bindsEq(key))
			return left.lookupEq(key);
		else return right.lookupEq(key);
	}

	public Value lookupEq(Key key, Value unbound) {
		Value v = left.lookupEq(key, unbound);
		if (v == unbound)
			return v;
		else return right.lookupEq(key, unbound);
	}

	public void set(Key key, Value value) {
		if (left.binds(key))
			left.set(key, value);
		else right.set(key, value);
	}

	protected void dom0(Vector<Key> vector) {
		left.dom0(vector);
		right.dom0(vector);
	}

	protected void ran0(Vector<Value> vector) {
		left.ran0(vector);
		right.ran0(vector);
	}

	public Env<Key, Value> sub(Env<Key, Value> env) {
		if (this == env)
			return new Empty<Key, Value>();
		else return new Concat<Key, Value>(left.sub(env), right.sub(env));
	}

	public String toString() {
		return "Concat(" + left + "," + right + ")";
	}

}
