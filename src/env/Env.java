package env;

import java.io.Serializable;
import java.util.Vector;

public abstract class Env<Key,Value> implements Serializable {
	
	public abstract Value lookup(Key key);
	
	public abstract Value lookupEq(Key key);
	
	public abstract Value lookupEq(Key key,Value unbound);
	
	public  Env<Key,Value> bind(Key key,Value value) {
		return new Bind<Key,Value>(key,value,this);
	}
	
	public abstract void set(Key key,Value value);
	
	public abstract boolean binds(Key key);
	
	public abstract boolean bindsEq(Key key);
	
	public Vector<Key> dom() {
		Vector<Key> dom = new Vector<Key>();
		dom0(dom);
		return dom;
	}

	protected abstract void dom0(Vector<Key> vector);
	
	public Vector<Value> ran() {
		Vector<Value> ran = new Vector<Value>();
		ran0(ran);
		return ran;
	}

	protected abstract void ran0(Vector<Value> vector);
	
	public abstract Env<Key, Value> sub(Env<Key, Value> env);
	
	public Env<Key,Value> add(Env<Key,Value> env) {
		Env<Key,Value> e = this;
		for(Key k : env.dom()) {
			e = e.bind(k, env.lookup(k));
		}
		return e;
	}

	public Env<Key, Value> bind(Key[] args, Value[] values) {
		Env<Key,Value> env = this;
		for(int i = 0; i < Math.min(args.length,values.length); i++)
			env = env.bind(args[i],values[i]);
		return env;
	}

}
