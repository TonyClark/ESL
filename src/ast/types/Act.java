package ast.types;

import java.util.HashSet;

import ast.binding.Dec;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "decs", "handlers" })

public class Act extends Type {

	public Dec[]					decs;
	public MessageType[]	handlers;

	public Act() {
	}

	public Act(int lineStart, int lineEnd, Dec[] decs, MessageType[] handlers) {
		super(lineStart, lineEnd);
		this.decs = decs;
		this.handlers = handlers;
	}

	public MessageType[] getHandlers() {
		return handlers;
	}

	public Type getType(String name) {
		for (Dec d : decs) {
			if (d.getName().equals(name)) return d.getDeclaredType();
		}
		return null;
	}

	public boolean hasField(String name) {
		for (Dec d : decs) {
			if (d.getName().equals(name)) return true;
		}
		return false;
	}

	public void setHandlers(MessageType[] handlers) {
		this.handlers = handlers;
	}

	private Dec[] substDecs(Type type, String name) {
		Dec[] ds = new Dec[decs.length];
		for (int i = 0; i < decs.length; i++)
			ds[i] = decs[i].substType(type, name);
		return ds;
	}

	private MessageType[] substHandlers(Type type, String name) {
		MessageType[] ts = new MessageType[handlers.length];
		for (int i = 0; i < handlers.length; i++) {
			ts[i] = handlers[i].substType(type, name);
		}
		return ts;
	}

	public Type substType(Type type, String name) {
		return new Act(getLineStart(), getLineEnd(), substDecs(type, name), substHandlers(type, name));
	}

	public String toString() {
		String exports = decs.length == 0 ? "" : "export " + separateWith(decs, "; ") + "; ";
		String s = "Act { " + exports + separateWith(handlers, "; ") + " }";
		return s;
	}

	public boolean containsAllHandlers(Act a, Env<String, Type> env) {
		for (int i = 0; i < a.getHandlers().length; i++) {
			MessageType hi = a.getHandlers()[i];
			boolean found = false;
			for (int j = 0; j < handlers.length && !found; j++) {
				MessageType hj = handlers[j];
				if (hi.equals(hj, env)) found = true;
			}
			if (!found) return false;
		}
		return true;
	}

	public boolean containsAllDecs(Act a, Env<String, Type> env) {
		for (int i = 0; i < a.getDecs().length; i++) {
			Dec dec1 = a.getDecs()[i];
			boolean foundDec = false;
			for (int j = 0; j < decs.length; j++) {
				Dec dec2 = decs[j];
				if (dec1.getName().equals(dec2.getName())) {
					foundDec = true;
					if (!Type.equals(dec1.getDeclaredType(), dec2.getDeclaredType(), env)) return false;
				}
			}
			if (!foundDec) return false;
		}
		return true;
	}

	public boolean canSend(Type[] types, Env<String, Type> env) {
		// Assume singleton data....
		Type incoming = types[0];
		for (MessageType m : handlers) {
			Type receiving = m.getTypes()[0];
			if (Type.equals(incoming, receiving, env)) return true;
		}
		return false;
	}

	public void check(Env<String, Type> env) {
		for (MessageType handler : handlers)
			handler.check(env);
	}

	public String getName() {
		return null;
	}

	public Dec[] getDecs() {
		return decs;
	}

	public void FV(HashSet<String> vars) {
		for (Dec dec : decs)
			dec.FV(vars);
		for (MessageType handler : handlers)
			handler.FV(vars);
	}

	public boolean exports(String name) {
		for (Dec d : decs) {
			if (d.getName().equals(name)) return true;
		}
		return false;
	}

}
