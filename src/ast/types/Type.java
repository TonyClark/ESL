package ast.types;

import java.util.HashSet;

import ast.general.AST;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public abstract class Type extends AST {

	private static boolean boundVar(Var v, Env<String, Type> env) {
		return env.binds(v.getName());
	}

	private static boolean equalArrays(Array a1, Type t2, Env<String, Type> env) {
		if (t2 instanceof Array) {
			Array a2 = (Array) t2;
			return equals(a1.type, a2.type, env);
		} else
			return false;
	}

	private static boolean equalMonitors(Monitor m1, Type t, Env<String, Type> env) {
		if (t instanceof Monitor) {
			Monitor m2 = (Monitor) t;
			return subMonitor(m1, m2, env) && subMonitor(m2, m1, env);
		} else
			return false;
	}

	public static boolean equals(Type t1, Type t2, Env<String, Type> env) {

		// The type equality relationship. Types may contain free type variables
		// or type function applications so they are evaluated to reduce them to
		// a normal form...

		if (t1 == t2) return true;

		if (sameApplication(t1, t2, env)) return true;

		t1 = eval(t1, env);
		t2 = eval(t2, env);

		//System.err.println("EQUALS: " + t1 + " " + t2 + " " + env);

		if (t1 instanceof Rec) return equalsRec((Rec) t1, t2, env);
		if (t2 instanceof Rec) return equalsRec((Rec) t2, t1, env);
		if (t1 instanceof Union) return equalsUnion((Union) t1, t2, env);
		if (t2 instanceof Union) return equalsUnion((Union) t2, t1, env);
		if (t1 instanceof Null) return true;
		if (t2 instanceof Null) return true;
		if (t1 instanceof Act) return equalsAct((Act) t1, t2, env);
		if (t1 instanceof Apply) return equalsApply((Apply) t1, t2, env);
		if (t1 instanceof Bag) return equalsBag((Bag) t1, t2, env);
		if (t1 instanceof Bool) return t2 instanceof Bool;
		if (t1 instanceof Float) return t2 instanceof Float;
		if (t1 instanceof Forall) return equalsForall((Forall) t1, t2, env);
		if (t1 instanceof Fun) return equalsFun((Fun) t1, t2, env);
		if (t1 instanceof Int) return t2 instanceof Int;
		if (t1 instanceof ast.types.List) return equalsList((ast.types.List) t1, t2, env);
		if (t1 instanceof Record) return equalsRecord((Record) t1, t2, env);
		if (t1 instanceof Set) return equalsSet((Set) t1, t2, env);
		if (t1 instanceof Str) return t2 instanceof Str;
		if (t1 instanceof Term) return equalsTerm((Term) t1, t2, env);
		if (t1 instanceof Var) return equalsVar((Var) t1, t2, env);
		if (t1 instanceof Void) return t2 instanceof Void;
		if (t1 instanceof Cnstr) return equalsCnstr((Cnstr) t1, t2, env);
		if (t1 instanceof KB) return equalsKB((KB) t1, t2, env);
		if (t1 instanceof Rules) return equalsRules((Rules) t1, t2, env);
		if (t1 instanceof Tuple) return equalTuples((Tuple) t1, t2, env);
		if (t1 instanceof Monitor) return equalMonitors((Monitor) t1, t2, env);
		if (t2 instanceof Monitor) return equalMonitors((Monitor) t2, t1, env);
		if (t1 instanceof Array) return equalArrays((Array) t1, t2, env);
		if (t2 instanceof Array) return equalArrays((Array) t2, t1, env);

		return false;
	}

	private static boolean equals(Type[] types1, Type[] types2, Env<String, Type> env) {
		if (types1.length == types2.length) {
			for (int i = 0; i < types1.length; i++)
				if (!equals(types1[i], types2[i], env)) return false;
			return true;
		} else
			return false;
	}

	public static boolean equalsAct(Act act, Type t, Env<String, Type> env) {
		if (t instanceof Act) {
			Act a = (Act) t;
			return act.containsAllHandlers(a, env) && a.containsAllHandlers(act, env) && act.containsAllDecs(a, env) && a.containsAllDecs(act, env);
		} else
			return false;
	}

	public static boolean equalsApply(Apply apply, Type t, Env<String, Type> env) {
		if (t instanceof Apply) {
			Apply a = (Apply) t;
			if (apply.getName().equals(a.getName())) {
				if (apply.getTypes().length == a.getTypes().length) {
					for (int i = 0; i < a.getTypes().length; i++) {
						if (!equals(apply.getTypes()[i], a.getTypes()[i], env)) return false;
					}
					return true;
				} else
					return false;
			} else
				return false;
		} else
			return false;
	}

	private static boolean equalsBag(Bag bag, Type t, Env<String, Type> env) {
		if (t instanceof Bag) {
			Bag b = (Bag) t;
			return equals(bag.getType(), b.getType(), env);
		} else
			return false;
	}

	private static boolean equalsCnstr(Cnstr cnstr, Type t, Env<String, Type> env) {
		if (t instanceof Cnstr) {
			Cnstr c = (Cnstr) t;
			if (cnstr.getType().getName().equals(c.getType().getName())) {
				return equals(cnstr.getType().getTypes(), c.getType().getTypes(), env);
			} else
				return false;
		} else if (t instanceof Union) {
			Union union = (Union) t;
			return equals(cnstr.getUnion(), union, env);
		} else
			return false;
	}

	public static boolean equalsForall(Forall forall, Type t, Env<String, Type> env) {

		// Catch the use of []::Forall(t) [t] compared to any type [a] for a concrete
		// type a. This means that it is not always necessary to use type application
		// to supply a type for the empty list...

		if (t instanceof ast.types.List && forall.getNames().length == 1) {
			ast.types.List list = (ast.types.List) t;
			return equals(t, forall.apply(new Type[] { list.getType() }), env);
		} else
			return equals(t, forall.getType(), env);
	}

	public static boolean equalsFun(Fun fun, Type t, Env<String, Type> env) {
		if (t instanceof Fun) {
			Fun f = (Fun) t;
			if (fun.getDomain().length == f.getDomain().length) {
				for (int i = 0; i < fun.getDomain().length; i++)
					if (!equals(fun.getDomain()[i], f.getDomain()[i], env)) return false;
			}
			return equals(fun.getRange(), f.getRange(), env);
		} else
			return false;
	}

	private static boolean equalsKB(KB t1, Type t2, Env<String, Type> env) {
		if (t1 instanceof KB) {
			KB k = (KB) t2;
			Type ut1 = t1.getType(env);
			Type ut2 = k.getType(env);
			if (ut1 != null && ut2 != null)
				return equals(ut1, ut2, env);
			// String u1 = t1.getUnion();
			// String u2 = k.getUnion();
			// if (env.binds(u1) && env.binds(u2))
			// return equals(env.lookup(u1), env.lookup(u2), env);
			else
				return false;
		} else
			return false;
	}

	public static boolean equalsList(ast.types.List list, Type t, Env<String, Type> env) {
		if (t instanceof Forall) {
			// Supports checking []...
			Forall forall = (Forall) t;
			return equals(forall.apply(new Type[] { list.getType() }), list, env);
		} else if (t instanceof ast.types.List) {
			ast.types.List l = (ast.types.List) t;
			return equals(list.getType(), l.getType(), env);
		} else
			return false;
	}

	private static boolean equalsRec(Rec rec, Type t, Env<String, Type> env) {
		if (t instanceof Rec) {
			Rec r = (Rec) t;
			if (r.getName().equals(rec.getName())) {
				return equals(r.getType(), rec.getType(), env);
			} else
				return false;
		} else {
			// We might need an implicit unfolding of the recursive type...
			return equals(rec.unfold(), t, env);
		}
	}

	public static boolean equalsRecord(Record record, Type t, Env<String, Type> env) {
		if (t instanceof Record) {
			Record r = (Record) t;
			if (record.getFields().length == r.getFields().length) {
				for (Field field : record.getFields()) {
					if (r.hasField(field.getName())) {
						return field.equals(r.getField(field.getName()), env);
					} else
						return false;
				}
				return true;
			} else
				return false;
		} else
			return false;
	}

	private static boolean equalsRules(Rules t1, Type t2, Env<String, Type> env) {
		if (t2 instanceof Rules) {
			Rules rules = (Rules) t2;
			return t1.containsAllTypes(rules, env) && rules.containsAllTypes(t1, env);
		} else
			return false;
	}

	public static boolean equalsSet(Set set, Type t, Env<String, Type> env) {
		if (t instanceof Set) {
			Set s = (Set) t;
			return equals(set.getType(), s.getType(), env);
		} else
			return false;
	}

	public static boolean equalsTerm(Term term, Type tt, Env<String, Type> env) {
		if (tt instanceof Term) {
			Term t = (Term) tt;
			if (term.getName().equals(t.getName())) {
				if (term.getTypes().length == t.getTypes().length) {
					for (int i = 0; i < term.getTypes().length; i++) {
						if (!equals(term.getTypes()[i], t.getTypes()[i], env)) return false;
					}
					return true;
				} else
					return false;
			} else
				return false;
		} else if (tt instanceof Union) {
			return equalsUnion((Union) tt, term, env);
		} else if (tt instanceof Cnstr) {
			Cnstr cnstr = (Cnstr) tt;
			return equals(term, cnstr.getType(), env);
		} else
			return false;
	}

	public static boolean equalsUnion(Union union, Type t, Env<String, Type> env) {
		if (t instanceof Union) {
			Union u = (Union) t;
			return u.includesAll(union, env) && union.includesAll(u, env);
		} else if (t instanceof Cnstr) {
			Cnstr cnstr = (Cnstr) t;
			return equals(union, cnstr.getUnion(), env);
		} else if (t instanceof Term) {
			Term term = (Term) t;
			for (Term uterm : union.getTerms()) {
				if (equals(term, uterm, env)) return true;
			}
			return false;
		} else
			return false;
	}

	public static boolean equalsVar(Var var, Type t, Env<String, Type> env) {
		if (t instanceof Var) {
			Var v = (Var) t;
			return var.getName().equals(v.getName());
		} else
			return false;
	}

	private static boolean equalTuples(Tuple t1, Type t2, Env<String, Type> env) {
		if (t2 instanceof Tuple) {
			Tuple tuple = (Tuple) t2;
			if (t1.getTypes().length == tuple.getTypes().length) {
				for (int i = 0; i < t1.getTypes().length; i++) {
					if (!equals(t1.getTypes()[i], tuple.getTypes()[i], env)) return false;
				}
				return true;
			} else
				return false;
		} else
			return false;
	}

	public static Type eval(Type t, Env<String, Type> env) {

		if (t instanceof Apply) return eval(expandApplication((Apply) t, env), env);
		if (t instanceof Var && boundVar((Var) t, env)) return eval(lookupVar((Var) t, env), env);
		if (t instanceof UnionRef) return eval(evalUnionRef((UnionRef) t, env), env);
		if (t instanceof Unfold) return eval(evalUnfold((Unfold) t, env), env);
		if (t instanceof Fun) return evalFun((Fun) t, env);
		if (t instanceof Union) return evalUnion((Union) t, env);
		if (t instanceof Term) return evalTerm((Term) t, env);

		return t;
	}

	private static Type evalFun(Fun t, Env<String, Type> env) {
		Type[] domain = t.domain;
		Type range = t.range;
		return new Fun(t.getLineStart(), t.getLineEnd(), evals(domain, env), eval(range, env));
	}

	public static Type[] evals(Type[] types, Env<String, Type> env) {
		Type[] ts = new Type[types.length];
		for (int i = 0; i < types.length; i++) {
			ts[i] = eval(types[i], env);
		}
		return ts;
	}

	private static Type evalTerm(Term t, Env<String, Type> env) {
		Type[] types = new Type[t.getTypes().length];
		for (int i = 0; i < types.length; i++) {
			types[i] = eval(t.getTypes()[i], env);
		}
		return new Term(t.getLineStart(), t.getLineEnd(), t.getName(), types);
	}

	private static Type evalUnfold(Unfold unfold, Env<String, Type> env) {
		Type type = eval(unfold.getType(), env);
		if (type instanceof Rec) {
			Rec rec = (Rec) type;
			return eval(rec.unfold(), env);
		} else
			throw new TypeError(unfold.getLineStart(), unfold.getLineEnd(), "expecting a recursive type: " + type);
	}

	private static Type evalUnion(Union t, Env<String, Type> env) {
		Term[] terms = new Term[t.getTerms().length];
		for (int i = 0; i < terms.length; i++) {
			terms[i] = (Term) eval(t.getTerms()[i], env);
		}
		return new Union(t.getLineStart(), t.getLineEnd(), terms);
	}

	private static Cnstr evalUnionRef(UnionRef ref, Env<String, Type> env) {
		Type type = eval(ref.getType(), env);
		if (type instanceof Union) {
			Union union = (Union) type;
			String name = ref.getName();
			if (union.hasCnstr(name)) {
				return union.getCnstr(name);
			} else
				throw new TypeError(ref.getLineStart(), ref.getLineEnd(), "cannot find constructor named " + name);
		} else
			throw new TypeError(ref.getLineStart(), ref.getLineEnd(), "expecting a type union: " + type);
	}

	private static Type expandApplication(Apply apply, Env<String, Type> env) {
		String name = apply.getName();
		Type[] args = apply.getTypes();
		if (env.binds(name)) {
			Type t = env.lookup(name);
			if (t instanceof TypeFun) {
				TypeFun fun = (TypeFun) t;
				return fun.apply(args);
			} else
				throw new TypeError(apply.getLineStart(), apply.getLineEnd(), "expecting a type function: " + t);
		} else
			throw new TypeError(apply.getLineStart(), apply.getLineEnd(), "unbound type variable " + name);
	}

	public static <T extends Type> T expect(int lineStart, int lineEnd, Class<? extends T> c, AST exp, Type t) {
		if (t == null) throw new TypeError(exp.getLineStart(), exp.getLineEnd(), "cannot calculate type: " + exp);
		if (c == Void.class) return (T) Void.VOID;
		if (c.isInstance(t)) return (T) t;
		throw new TypeError(lineStart, lineEnd, "expecting a value of type " + c.getSimpleName() + " but was supplied a value of type " + t);
	}

	private static Type lookupVar(Var v, Env<String, Type> env) {
		return env.lookup(v.getName());
	}

	private static boolean sameApplication(Type t1, Type t2, Env<String, Type> env) {
		if (t1 instanceof Apply && t2 instanceof Apply) {
			Apply a1 = (Apply) t1;
			Apply a2 = (Apply) t2;
			if (a1.getName().equals(a2.getName())) {
				if (a1.getTypes().length == a2.getTypes().length) {
					for (int i = 0; i < a1.getTypes().length; i++) {
						if (!equals(a1.getTypes()[i], a2.getTypes()[i], env)) return false;
					}
					return true;
				} else
					return false;
			} else
				return false;
		} else
			return false;
	}

	private static boolean subMonitor(Monitor m1, Monitor m2, Env<String, Type> env) {
		for (Term term : m1.getTerms(env)) {
			if (!m2.contains(term, env)) return false;
		}
		return true;
	}

	public static Type[] substTypes(Type[] types, Type type, String name) {
		Type[] ts = new Type[types.length];
		for (int i = 0; i < types.length; i++)
			ts[i] = types[i].substType(type, name);
		return ts;
	}

	public Type() {
	}

	public Type(int lineStart, int lineEnd) {
		super(lineStart, lineEnd);
	}

	public abstract void check(Env<String, Type> env);// Throws an error if there is something wrong with the type in the context of
	                                                  // the supplied environment...

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
	}

	public Object defaultValue() {
		if (this instanceof ast.types.Int)
			return 0;
		else if (this instanceof ast.types.Str)
			return "''";
		else if (this instanceof ast.types.Bool)
			return true;
		else if (this instanceof ast.types.Float)
			return 0.0;
		else if (this instanceof ast.types.List)
			return new list.Nil<Object>();
		else
			return null;
	}

	public Type deref(Env<String, Type> env) {
		if (this instanceof Apply) {
			Apply apply = (Apply) this;
			return apply.apply(env);
		} else if (this instanceof Var) {
			Var var = (Var) this;
			if (env.binds(var.getName()))
				return env.lookup(var.getName()).deref(env);
			else
				return var;
		} else
			return this;
	}

	public void DV(HashSet<String> vars) {
	}

	public abstract void FV(HashSet<String> vars);

	public String getLabel() {
		return getClass().getSimpleName();
	}

	public boolean isSimpleType() {
		return this instanceof Int || this instanceof Str || this instanceof Bool || this instanceof Float;
	}
	
	public boolean isListOfSimpleType() {
		if(this instanceof ast.types.List) {
			ast.types.List l = (ast.types.List)this;
			return l.type.isListOfSimpleType();
		} else return isSimpleType();
	}

	public int maxLocals() {
		return 0;
	}

	public <T extends Type> T restrictsTo(Class<? extends T> c) {

		// This is essentially an instance of check for the receiver.
		// However, we should take into account the possibility that
		// the receiver is a union type in which case the instance
		// of check restricts to one of the union operands...

		if (c.isInstance(this))
			return (T) this;
		else
			return null;
	}

	public void setPath(String path) {
	}

	public AST subst(AST ast, String name) {
		return this;
	}

	public abstract Type substType(Type type, String name);

	public Type type(Env<String, Type> env) {
		throw new TypeError(getLineStart(), getLineEnd(), "cannot type check a type: " + this);
	}
}
