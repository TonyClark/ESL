package esl.lib;

import java.io.File;
import java.util.Arrays;
import java.util.Hashtable;

import list.List;
import runtime.data.Key;
import runtime.data.Record;
import runtime.data.Term;

public class ESLVal {

	private static ESLVal eqls(ESLVal[] vs1, ESLVal[] vs2) {
		if (vs1.length == vs2.length) {
			for (int i = 0; i < vs1.length; i++) {
				if (!vs1[i].eql(vs2[i]).boolVal) return Lib.$false;
			}
			return Lib.$true;
		} else
			return Lib.$false;
	}

	public static ESLVal list(ESLVal... values) {
		ESLVal l = Lib.$nil;
		for (int i = values.length - 1; i >= 0; i--) {
			l = new ESLVal(values[i], l);
		}
		return l;
	}

	public static String listToString(ESLVal l) {
		String s = "[";
		while (!(l.isNil())) {
			s = s + l.head();
			l = l.tail();
			if (!(l.isNil())) s = s + ",";
		}
		return s + "]";
	}

	public ValState										state			= ValState.UNKNOWN;
	public int												intVal		= 0;
	public boolean										boolVal		= true;
	public String											strVal		= "";
	public double											doubleVal	= 0.0;
	public String											termName	= null;
	public ESLVal[]										termVals	= null;
	public Function										funVal		= null;
	public ESLVal											headVal		= null;
	public ESLVal											tailVal		= null;
	public Behaviour									behaviour	= null;
	public Actor											actor			= null;
	public AlienActor									javaActor	= null;
	public Record											record		= null;
	public ESLVal[]										array			= null;
	public Hashtable<ESLVal, ESLVal>	table			= null;

	public ESLVal() {
	}

	public ESLVal(Actor actor) {
		this.actor = actor;
		state = ValState.ACTOR;
	}

	public ESLVal(ESLVal[] array) {
		this.array = array;
		state = ValState.ARRAY;
	}

	public ESLVal(AlienActor actor) {
		javaActor = actor;
		state = ValState.JAVA_ACTOR;
	}

	public ESLVal(Behaviour b) {
		behaviour = b;
		state = ValState.BEHAVIOUR;
	}

	public ESLVal(boolean b) {
		boolVal = b;
		state = ValState.BOOL;
	}

	public ESLVal(double d) {
		doubleVal = d;
		state = ValState.DOUBLE;
	}

	public ESLVal(ESLVal head, ESLVal tail) {
		headVal = head;
		tailVal = tail;
		state = ValState.CONS;
	}

	public ESLVal(Function f) {
		funVal = f;
		state = ValState.FUN;
	}

	public ESLVal(Hashtable<ESLVal, ESLVal> t) {
		table = t;
		state = ValState.TABLE;
	}

	public ESLVal(int i) {
		intVal = i;
		state = ValState.INT;
	}

	public ESLVal(Record record) {
		this.record = record;
		state = ValState.RECORD;
	}

	public ESLVal(String s) {
		strVal = s;
		state = ValState.STR;
	}

	public ESLVal(String n, ESLVal... vals) {
		termName = n;
		termVals = vals;
		state = ValState.TERM;
	}

	public ESLVal add(ESLVal v) {
		if (state == ValState.INT && v.state == ValState.INT) return new ESLVal(intVal + v.intVal);
		if (state == ValState.DOUBLE && v.state == ValState.INT) return new ESLVal(doubleVal + v.intVal);
		if (state == ValState.DOUBLE && v.state == ValState.DOUBLE) return new ESLVal(doubleVal + v.doubleVal);
		if (state == ValState.INT && v.state == ValState.DOUBLE)
			return new ESLVal(intVal + v.doubleVal);
		else if (state == ValState.STR || v.state == ValState.STR)
			return new ESLVal(toString() + v.toString());
		else if (Lib.isList(state) && Lib.isList(v.state)) {
			return append(v);
		} else
			throw new Error("unknown args for +: " + this + " " + v);
	}

	public ESLVal and(ESLVal n) {
		return boolVal && n.boolVal ? Lib.$true : Lib.$false;
	}

	public ESLVal andalso(ESLVal n) {
		return and(n);
	}

	public ESLVal append(ESLVal l) {
		switch (state) {
		case NIL:
			return l;
		case CONS:
			return tailVal.append(l).cons(headVal);
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public ESLVal apply(ESLVal... args) {
		return funVal.apply(args);
	}

	private double asDouble() {
		switch (state) {
		case INT:
			return intVal + 0.0;
		case DOUBLE:
			return doubleVal;
		default:
			throw new Error("not a number: " + this);
		}
	}

	public Object asTerm() {
		switch (state) {
		case INT:
			return intVal;
		case STR:
			return strVal;
		case DOUBLE:
			return doubleVal;
		case BOOL:
			return boolVal;
		case NIL:
		case CONS:
			List<Object> l = new list.Nil<Object>();
			ESLVal v = this;
			while (!v.isNil()) {
				l = l.cons(v.headVal.asTerm());
				v = v.tailVal;
			}
			return l;
		case TERM:
			Object[] vals = new Object[termVals.length];
			for (int i = 0; i < termVals.length; i++) {
				vals[i] = termVals[i].asTerm();
			}
			return new Term(termName, vals);
		case NULL:
			return null;
		case FUN:
			return this;
		case ACTOR:
			return this;
		case BEHAVIOUR:
			return this;
		default:
			throw new Error("cannot turn " + this + " to a term");
		}
	}

	public ESLVal cons(ESLVal v) {
		switch (state) {
		case NIL:
		case CONS:
			return new ESLVal(v, this);
		default:
			throw new Error("type error: cannot cons " + v + " on value of type " + state);
		}
	}

	public ESLVal div(ESLVal v) {
		if (state == ValState.INT && v.state == ValState.INT)
			return new ESLVal(intVal / v.intVal);
		else if (state == ValState.DOUBLE && v.state == ValState.DOUBLE) return new ESLVal(doubleVal / v.doubleVal);
		throw new Error("cannot div " + this + " and " + v);
	}

	public boolean equals(Object other) {
		if (other instanceof ESLVal) {
			ESLVal v = (ESLVal) other;
			return this == v || eql(v).boolVal;
		} else
			return super.equals(other);
	}

	public ESLVal eql(ESLVal other) {
		if (this == other)
			return Lib.$true;
		else if (state == other.state) {
			switch (state) {
			case INT:
				return (intVal == other.intVal) ? Lib.$true : Lib.$false;
			case BOOL:
				return boolVal == other.boolVal ? Lib.$true : Lib.$false;
			case STR:
				return strVal.equals(other.strVal) ? Lib.$true : Lib.$false;
			case DOUBLE:
				return doubleVal == other.doubleVal ? Lib.$true : Lib.$false;
			case NIL:
				return other.state == ValState.NIL ? Lib.$true : Lib.$false;
			case CONS:
				return (headVal.eql(other.headVal).boolVal && tailVal.eql(other.tailVal).boolVal) ? Lib.$true : Lib.$false;
			case FUN:
				return funVal == other.funVal ? Lib.$true : Lib.$false;
			case TERM:
				if (termName.equals(other.termName))
					return eqls(termVals, other.termVals);
				else
					return Lib.$false;
			case NULL:
				return Lib.$true;
			case ARRAY:
				if (array.length == other.array.length) {
					for (int i = 0; i < array.length; i++) {
						if (!(array[i].eql(other.array[i]).boolVal)) return Lib.$false;
					}
					return Lib.$true;
				} else
					return Lib.$false;
			case TABLE:
				if (table.keySet().equals(other.table.keySet())) {
					for (ESLVal k : table.keySet()) {
						if (!table.get(k).equals(other.table.get(k))) return Lib.$false;
					}
					return Lib.$true;
				} else
					return Lib.$false;
			default:
				return Lib.$false;
			}
		} else
			return Lib.$false;
	}

	public ESLVal flatten() {
		switch (state) {
		case NIL:
			return this;
		case CONS:
			return headVal.append(tailVal.flatten());
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public ESLVal gre(ESLVal n) {
		return asDouble() > n.asDouble() ? Lib.$true : Lib.$false;
	}

	public ESLVal greql(ESLVal n) {
		return asDouble() >= n.asDouble() ? Lib.$true : Lib.$false;
	}

	public ESLVal head() {
		if (state == ValState.CONS) {
			return headVal;
		} else
			throw new Error("head: " + this);
	}

	public boolean isCons() {
		return state == ValState.CONS;
	}

	public boolean isNil() {
		return state == ValState.NIL;
	}

	public ESLVal less(ESLVal n) {
		return asDouble() < n.asDouble() ? Lib.$true : Lib.$false;
	}

	public ESLVal lesseql(ESLVal n) {
		return asDouble() <= n.asDouble() ? Lib.$true : Lib.$false;
	}

	public ESLVal map(ESLVal l) {
		switch (l.state) {
		case NIL:
			return l;
		case CONS:
			return map(l.tailVal).cons(funVal.apply(l.headVal));
		default:
			throw new Error("expecting a list " + l);
		}
	}

	public ESLVal member(ESLVal v) {
		switch (state) {
		case NIL:
			return Lib.$false;
		case CONS:
			if (headVal.equals(v))
				return Lib.$true;
			else
				return tailVal.member(v);
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public ESLVal mod(ESLVal n) {
		return new ESLVal(intVal % n.intVal);
	}

	public ESLVal mul(ESLVal v) {
		if (isInt() && v.isInt())
			return new ESLVal(intVal * v.intVal);
		else if (isInt() && v.isDouble())
			return new ESLVal(intVal * v.doubleVal);
		else if (isDouble() && v.isInt())
			return new ESLVal(doubleVal * v.intVal);
		else if (isDouble() && v.isDouble())
			return new ESLVal(doubleVal * v.doubleVal);
		else
			throw new Error("cannot perform * on " + this + " " + v);
	}

	private boolean isInt() {
		return state == ValState.INT;
	}

	private boolean isDouble() {
		return state == ValState.DOUBLE;
	}

	public ESLVal neql(ESLVal other) {
		if (eql(other).boolVal)
			return Lib.$false;
		else
			return Lib.$true;
	}

	public ESLVal not() {
		return boolVal ? Lib.$false : Lib.$true;
	}

	public ESLVal nth(int i) {
		switch (state) {
		case NIL:
			throw new Error("nth out of elements: " + i);
		case CONS:
			if (i == 0)
				return headVal;
			else
				return tailVal.nth(i - 1);
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public ESLVal ocurrences(ESLVal v) {
		switch (state) {
		case NIL:
			return new ESLVal(0);
		case CONS:
			if (headVal.equals(v))
				return tailVal.ocurrences(v).add(new ESLVal(1));
			else
				return tailVal.ocurrences(v);
		default:
			throw new Error("occurrences expects a list: " + this);
		}
	}

	public ESLVal or(ESLVal n) {
		return boolVal || n.boolVal ? Lib.$true : Lib.$false;
	}

	public ESLVal orelse(ESLVal n) {
		return or(n);
	}

	public ESLVal ref(String name) {
		switch (state) {
		case JAVA_ACTOR:
			return javaActor.alienRef(name);
		case ACTOR:
			return actor.get(name);
		case RECORD:
			return (ESLVal) record.getField(Key.getKey(name)).getValue();
		case STR:
			return refString(name);
		case CONS:
		case NIL:
			return refList(name);
		case TABLE:
			return refTable(name);
		default:
			throw new Error("REF not implemented " + this + "." + name);
		}
	}

	private ESLVal refTable(String name) {
		if (name.equals("hasKey")) { return new ESLVal(new Function(new ESLVal("hasKey"), this) {
			public ESLVal apply(ESLVal... args) {
				return table.containsKey(args[0]) ? Lib.$true : Lib.$false;
			}
		}); }
		if (name.equals("get")) { return new ESLVal(new Function(new ESLVal("get"), this) {
			public ESLVal apply(ESLVal... args) {
				return table.get(args[0]);
			}
		}); }
		if (name.equals("put")) { return new ESLVal(new Function(new ESLVal("put"), this) {
			public ESLVal apply(ESLVal... args) {
				table.put(args[0], args[1]);
				return ESLVal.this;
			}
		}); }
		if (name.equals("keys")) {
			ESLVal keys = Lib.$nil;
			for (ESLVal k : table.keySet()) {
				keys = new ESLVal(k, keys);
			}
			return keys;
		}
		if (name.equals("vals")) {
			ESLVal vals = Lib.$nil;
			for (ESLVal v : table.values()) {
				vals = new ESLVal(v, vals);
			}
			return vals;
		}
		throw new Error("unknown field for table " + name);
	}

	private ESLVal refList(String name) {
		switch (name) {
		case "implode":
			String s = "";
			ESLVal l = this;
			while (!l.isNil()) {
				s = s + (char) l.headVal.intVal;
				l = l.tailVal;
			}
			return new ESLVal(s);
		default:
			throw new Error("REF not implemented " + this + "." + name);
		}
	}

	private ESLVal refString(String name) {
		switch (name) {
		case "explode":
			return explode(strVal);
		case "writeDate":
			return writeDate(strVal);
		default:
			throw new Error("ref string " + name);
		}
	}

	private static ESLVal writeDate(String path) {
		return new ESLVal(new File(path).lastModified());
	}

	private static ESLVal explode(String s) {
		ESLVal l = Lib.$nil;
		for (int i = s.length() - 1; i >= 0; i--) {
			l = new ESLVal(new ESLVal(s.charAt(i)), l);
		}
		return l;
	}

	public ESLVal remove(ESLVal v) {
		switch (state) {
		case NIL:
			return this;
		case CONS:
			if (headVal.equals(v))
				return tailVal.remove(v);
			else
				return tailVal.remove(v).cons(headVal);
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public ESLVal replaceNth(ESLVal n, ESLVal v) {
		switch (state) {
		case CONS:
			if (n.intVal == 0)
				return tailVal.cons(v);
			else
				return tailVal.replaceNth(n.sub(new ESLVal(1)), v).cons(headVal);
		default:
			throw new Error("replaceNth expects a list: " + this);
		}
	}

	public ESLVal reverse() {
		switch (state) {
		case NIL:
			return this;
		case CONS:
			return tailVal.reverse().append(Lib.$nil.cons(headVal));
		default:
			throw new Error("expecting a list: " + this);
		}
	}

	public void send(ESLVal message) {
		switch (state) {
		case ACTOR:
			actor.send(message);
			break;
		case JAVA_ACTOR:
			javaActor.alienSend(message);
			break;
		default:
			throw new Error("unknown receiver for message: " + this + " <- " + message);
		}
	}

	public String separateWith(ESLVal[] vals, String sep) {
		String s = "";
		for (int i = 0; i < vals.length; i++) {
			s = s + vals[i].toString();
			if (i + 1 < vals.length) s = s + sep;
		}
		return s;
	}

	public ESLVal sub(ESLVal v) {
		if (isInt() && v.isInt())
			return new ESLVal(intVal - v.intVal);
		else if (isInt() && v.isDouble())
			return new ESLVal(intVal - v.doubleVal);
		else if (isDouble() && v.isInt())
			return new ESLVal(doubleVal - v.intVal);
		else if (isDouble() && v.isDouble())
			return new ESLVal(doubleVal - v.doubleVal);
		else
			throw new Error("cannot perform - on " + this + " " + v);
	}

	public ESLVal tail() {
		if (state == ValState.CONS) {
			return tailVal;
		} else
			throw new Error("tail: " + this);
	}

	public ESLVal termRef(int i) {
		return termVals[i];
	}

	public ESLVal to(ESLVal m) {
		if (intVal >= m.intVal)
			return Lib.$nil;
		else
			return new ESLVal(intVal + 1).to(m).cons(this);
	}

	public String toString() {
		switch (state) {
		case INT:
			return intVal + "";
		case STR:
			return strVal;
		case DOUBLE:
			return doubleVal + "";
		case BOOL:
			return boolVal + "";
		case NIL:
		case CONS:
			return listToString(this);
		case TERM:
			if (termVals.length == 0)
				return termName;
			else
				return termName + "(" + separateWith(termVals, ",") + ")";
		case NULL:
			return "null";
		case FUN:
			return "<fun " + funVal.getName() + ">";
		case ACTOR:
			return "<actor " + actor.getId() + "::" + actor.getBehaviour().getName() + ">";
		case BEHAVIOUR:
			return "<behaviour " + behaviour.getName() + ">";
		case ARRAY:
			return "Array" + Arrays.toString(array);
		case TABLE:
			return table.toString();
		}
		return "<?:" + state + ">";
	}

	public int hashCode() {
		switch (state) {
		case INT:
			return intVal;
		case STR:
			return strVal.hashCode();
		case DOUBLE:
			return Double.valueOf(doubleVal).hashCode();
		case BOOL:
			return boolVal ? 1 : 0;
		case NIL:
		case CONS:
			return headVal.hashCode();
		case TERM:
			return termName.hashCode();
		case NULL:
			return 0;
		case FUN:
			return funVal.hashCode();
		case ACTOR:
			return actor.hashCode();
		case BEHAVIOUR:
			return behaviour.hashCode();
		case ARRAY:
			return array.hashCode();
		case TABLE:
			return table.hashCode();
		}
		throw new Error("cannot caklculate hash code for : " + this);
	}

	public ESLVal take(int i) {
		if (i == 0)
			return Lib.$nil;
		else {
			return new ESLVal(headVal, tailVal.take(i - 1));
		}
	}

	public ESLVal drop(int i) {
		if (i == 0)
			return this;
		else {
			return tailVal.drop(i - 1);
		}
	}

	public static void main(String[] args) {
		Hashtable<ESLVal, ESLVal> t = new Hashtable<ESLVal, ESLVal>();
		t.put(new ESLVal("xxx"), Lib.$nil);
		t.put(new ESLVal("yyy"), Lib.$nil);
		t.put(new ESLVal("xxx"), Lib.$one);
		System.out.println(t);
	}

}