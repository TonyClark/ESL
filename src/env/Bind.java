package env;

import java.util.Vector;

public class Bind<Key, Value> extends Env<Key, Value> {

	private Key							key;
	private Value						value;
	private Env<Key, Value>	next;

	public Bind(Key key, Value value, Env<Key, Value> next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Env<Key, Value> getNext() {
		return next;
	}

	public void setNext(Env<Key, Value> next) {
		this.next = next;
	}

	public boolean binds(Key key) {
		return key.equals(this.key) || next.binds(key);
	}

	public boolean bindsEq(Key key) {
		return key == this.key || next.bindsEq(key);
	}

	public Value lookup(Key key) {
		if (key.equals(this.key))
			return value;
		else return next.lookup(key);
	}

	public Value lookupEq(Key key) {
		if (key == this.key)
			return value;
		else return next.lookupEq(key);
	}

	public Value lookupEq(Key key,Value unbound) {
		if (key == this.key)
			return value;
		else return next.lookupEq(key,unbound);
	}

	public void set(Key key, Value value) {
		if (key.equals(this.key))
			this.value = value;
		else next.set(key, value);
	}

	public String toString() {
		return "{" + printBindings(this) + "}";
	}

	public String printBindings(Env<Key, Value> e) {
		if (e instanceof Bind) {
			String s = "";
			Bind<Key, Value> bind = (Bind<Key, Value>) e;
			s = s + bind.getKey();
			s = s + "->";
			s = s + bind.getValue();
			if (!(bind.getNext() instanceof Empty)) {
				e = (Env<Key, Value>) bind.getNext();
				s = s + ",";
				return s + printBindings(e);
			} else return s;
		} else if (e instanceof Concat) {
			Concat c = (Concat) e;
			return printBindings(c.getLeft()) + printBindings(c.getRight());
		} else return "";
	}

	protected void dom0(Vector<Key> vector) {
		if (!vector.contains(key)) vector.addElement(key);
		next.dom0(vector);
	}

	protected void ran0(Vector<Value> vector) {
		if (!vector.contains(value)) vector.addElement(value);
		next.ran0(vector);
	}

	public Env<Key, Value> sub(Env<Key, Value> env) {
		if (this == env)
			return new Empty<Key, Value>();
		else if (next == env)
			return new Bind<Key, Value>(key, value, new Empty<Key, Value>());
		else return new Bind<Key, Value>(key, value, next.sub(env));
	}

}
