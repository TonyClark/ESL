package esl.lib;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

import ast.general.AST;
import ast.modules.Module;
import edb.frame.EDBFrame;
import runtime.data.Term;

public class Lib {

	static Actor														actor				= new DummyActor();
	static Object														lock				= new Object();
	final static int												THREADS			= 500;
	static ExecutorService									threadPool	= Executors.newFixedThreadPool(THREADS);
	static boolean													timerActive	= true;
	static long															time0				= System.currentTimeMillis();
	static Hashtable<Object, ReentrantLock>	locks				= new Hashtable<Object, ReentrantLock>();
	public static ESLVal										edb					= new ESLVal(EDBFrame.FRAME);
	public static ESLVal										$zero				= new ESLVal(0);
	public static ESLVal										$one				= new ESLVal(1);
	public static ESLVal										$true				= new ESLVal(true);
	public static ESLVal										$false			= new ESLVal(false);
	public static ESLVal										$null				= new Null();
	public static ESLVal										$nil				= new Nil();
	public static ESLVal										$emptyset		= new EmptySet();
	public static ESLVal										$emptybag		= new EmptyBag();

	public static ESLVal										wait				= new ESLVal(new Function(new ESLVal("wait"), null) {

																												public ESLVal apply(ESLVal... args) {
																													try {
																														synchronized (Thread.currentThread()) {
																															Thread.currentThread().wait(args[0].intVal);
																														}
																													} catch (InterruptedException e) {
																														// Might happen if the system stops during a wait.
																													}
																													return Lib.$null;
																												}
																											});

	public static ESLVal										replaceNth	= new ESLVal(new Function(new ESLVal("replaceNth"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal list = args[0];
																													int i = args[1].intVal;
																													ESLVal v = args[2];
																													while (i > 0 && list.state == ValState.CONS) {
																														i--;
																														list = list.tailVal;
																													}
																													if (list.state == ValState.CONS) {
																														list.headVal = v;
																														return args[0];
																													} else
																														throw new Error("replaceNth: ran out of list " + list);
																												}
																											});

	public static ESLVal										member			= new ESLVal(new Function(new ESLVal("member"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[1].member(args[0]);
																												}
																											});

	public static ESLVal										occurrences	= new ESLVal(new Function(new ESLVal("occurrences"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[1].ocurrences(args[0]);
																												}
																											});

	public static ESLVal										remove			= new ESLVal(new Function(new ESLVal("remove"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[1].remove(args[0]);
																												}
																											});

	public static ESLVal										removeAll		= new ESLVal(new Function(new ESLVal("removeAll"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal removables = args[0];
																													ESLVal l = args[1];
																													while (!removables.isNil()) {
																														ESLVal v = removables.headVal;
																														removables = removables.tailVal;
																														l = remove.apply(v, l);
																													}
																													return l;
																												}
																											});

	public static ESLVal										exists			= new ESLVal(new Function(new ESLVal("exists"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal p = args[0];
																													ESLVal l = args[1];
																													switch (l.state) {
																													case NIL:
																														return $false;
																													case CONS:
																														if (p.funVal.apply(l.headVal).boolVal)
																															return $true;
																														else
																															return exists.funVal.apply(p, l.tailVal);
																													default:
																														throw new Error("expecting a list: " + l);
																													}
																												}
																											});

	public static ESLVal										filter			= new ESLVal(new Function(new ESLVal("filter"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal p = args[0];
																													ESLVal lin = args[1];
																													ESLVal lout = $nil;
																													while (!lin.isNil()) {
																														ESLVal v = lin.headVal;
																														lin = lin.tailVal;
																														if (p.apply(v).boolVal) lout = lout.append(new ESLVal(v, $nil));
																													}
																													return lout;
																												}
																											});

	public static ESLVal										forall			= new ESLVal(new Function(new ESLVal("forall"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal p = args[0];
																													ESLVal l = args[1];
																													while (!l.isNil()) {
																														ESLVal v = l.headVal;
																														if (!p.apply(v).boolVal) return $false;
																														l = l.tailVal;
																													}
																													return $true;
																												}
																											});

	public static ESLVal										$ndCase			= new ESLVal(new Function(new ESLVal("$ndCase"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal set = args[0];
																													ESLVal arms = args[1];
																													ESLVal fail = args[2];
																													return ndCase(set, arms, fail);
																												}
																											});

	public static ESLVal										reject			= new ESLVal(new Function(new ESLVal("reject"), null) {

																												public ESLVal apply(ESLVal... args) {
																													Function pred = args[0].funVal;
																													ESLVal l = args[1];
																													switch (l.state) {
																													case CONS:
																														if (pred.apply(l.headVal).boolVal)
																															return reject.apply(args[0], l.tailVal);
																														else
																															return new ESLVal(l.headVal, reject.apply(args[0], l.tailVal));
																													case NIL:
																														return l;
																													default:
																														throw new Error("reject expects a list " + l);
																													}

																												}
																											});

	public static ESLVal										map					= new ESLVal(new Function(new ESLVal("map"), null) {

																												public ESLVal apply(ESLVal... args) {
																													Function pred = args[0].funVal;
																													ESLVal l = args[1];
																													switch (l.state) {
																													case CONS:
																														return new ESLVal(pred.apply(l.headVal), map.apply(args[0], l.tailVal));
																													case NIL:
																														return l;
																													default:
																														throw new Error("map expects a list " + l);
																													}

																												}
																											});

	public static ESLVal										nth					= new ESLVal(new Function(new ESLVal("nth"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal list = args[0];
																													int i = args[1].intVal;
																													while (i != 0 && list.state == ValState.CONS) {
																														i--;
																														list = list.tailVal;
																													}
																													if (list.state == ValState.CONS) {
																														return list.headVal;
																													} else
																														throw new Error("nth ran out of elements: " + list);
																												}
																											});

	public static ESLVal										take				= new ESLVal(new Function(new ESLVal("take"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal list = args[0];
																													int i = args[1].intVal;
																													return list.take(i);
																												}
																											});

	public static ESLVal										drop				= new ESLVal(new Function(new ESLVal("drop"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal list = args[0];
																													int i = args[1].intVal;
																													return list.drop(i);
																												}
																											});

	public static ESLVal										dropWhile		= new ESLVal(new Function(new ESLVal("dropWhile"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal pred = args[0];
																													ESLVal list = args[1];
																													if (list.isNil()) {
																														return list;
																													} else {
																														if (pred.apply(list.headVal).boolVal) {
																															return dropWhile.apply(pred, list.tailVal);
																														} else
																															return list;
																													}
																												}
																											});

	public static ESLVal										subst				= new ESLVal(new Function(new ESLVal("subst"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal new_ = args[0];
																													ESLVal old = args[1];
																													ESLVal list = args[2];
																													if (list.isNil()) {
																														return list;
																													} else {
																														if (list.headVal.equals(old))
																															return new ESLVal(new_, subst.apply(new_, old, list.tailVal));
																														else
																															return new ESLVal(list.headVal, subst.apply(new_, old, list.tailVal));
																													}
																												}
																											});

	public static ESLVal										takeWhile		= new ESLVal(new Function(new ESLVal("takeWhile"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal pred = args[0];
																													ESLVal list = args[1];
																													if (list.isNil()) {
																														return list;
																													} else {
																														if (pred.apply(list.headVal).boolVal) {
																															return new ESLVal(list.headVal, takeWhile.apply(pred, list.tailVal));
																														} else
																															return $nil;
																													}
																												}
																											});

	public static ESLVal										builtin			= new ESLVal(new Function(new ESLVal("builtin"), null) {

																												public ESLVal apply(ESLVal... args) {
																													switch (args[1].strVal) {
																													case "intToFloat":
																														return intToFloat;
																													case "round":
																														return round;
																													default:
																														throw new Error("unknown builtin: " + args[1]);
																													}
																												}
																											});

	public static ESLVal										removeDups	= new ESLVal(new Function(new ESLVal("removeDups"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal lin = args[0];
																													ESLVal lout = $nil;
																													while (!lin.isNil()) {
																														lout = lout.append(new ESLVal(lin.head(), $nil));
																														lin = remove.apply(lin.headVal, lin);
																													}
																													return lout;
																												}
																											});

	public static ESLVal										round				= new ESLVal(new Function(new ESLVal("round"), null) {

																												public ESLVal apply(ESLVal... args) {
																													switch (args[0].state) {
																													case INT:
																														return args[0];
																													case DOUBLE:
																														return new ESLVal((int) Math.round(args[0].doubleVal));
																													default:
																														throw new Error("unknown type for round: " + args[0]);
																													}
																												}
																											});

	public static ESLVal										isqrt				= new ESLVal(new Function(new ESLVal("isqrt"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return new ESLVal(Math.sqrt(args[0].intVal));
																												}
																											});

	public static ESLVal										parse				= new ESLVal(new Function(new ESLVal("parse"), null) {

																												public ESLVal apply(ESLVal... args) {
																													String path = args[0].strVal;
																													Module module = Module.parseModule(path, parser.ESL.readFile(path));
																													runtime.data.Term term = (runtime.data.Term) AST.asESLValue(module);
																													return asESLVal(term);
																												}
																											});

	public static ESLVal										intToFloat	= new ESLVal(new Function(new ESLVal("intToFloat"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return new ESLVal(1.0 * args[0].intVal);
																												}
																											});

	public static ESLVal										indexOf			= new ESLVal(new Function(new ESLVal("IndexOf"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal element = args[0];
																													ESLVal list = args[1];
																													int i = 0;
																													while (!list.isNil()) {
																														if (list.headVal.equals(element)) {
																															return new ESLVal(i);
																														} else {
																															i++;
																															list = list.tailVal;
																														}
																													}
																													throw new Error("cannot find index of " + element);
																												}
																											});

	public static ESLVal										length			= new ESLVal(new Function(new ESLVal("length"), null) {

																												public ESLVal apply(ESLVal... args) {
																													int i = 0;
																													ESLVal l = args[0];
																													while (l.state == ValState.CONS) {
																														i++;
																														l = l.tailVal;
																													}
																													return new ESLVal(i);
																												}
																											});

	public static ESLVal										last				= new ESLVal(new Function(new ESLVal("last"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal l = args[0];
																													while (l.state == ValState.CONS) {
																														ESLVal v = l.headVal;
																														l = l.tailVal;
																														if (l.state == ValState.NIL) return v;
																													}
																													throw new Error("cannot find last value.");
																												}
																											});

	public static ESLVal										butlast			= new ESLVal(new Function(new ESLVal("butlast"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal l = args[0];
																													if (l.isNil())
																														return l;
																													else if (l.tailVal.isNil())
																														return $nil;
																													else {
																														return new ESLVal(l.head(), butlast.apply(l.tailVal));
																													}
																												}
																											});

	public static ESLVal										select1			= new ESLVal(new Function(new ESLVal("select1"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal l = args[0];
																													ESLVal d = args[1];
																													ESLVal p = args[2];
																													while (l.state == ValState.CONS) {
																														if (p.apply(l.headVal).boolVal)
																															return l.headVal;
																														else {
																															l = l.tailVal;
																														}
																													}
																													return d;
																												}
																											});

	public static ESLVal										select			= new ESLVal(new Function(new ESLVal("select"), null) {

																												public ESLVal apply(ESLVal... args) {
																													ESLVal pred = args[0];
																													ESLVal lIn = args[1];
																													ESLVal lOut = $nil;
																													while (!lIn.isNil()) {
																														if (pred.apply(lIn.headVal).boolVal) lOut = lOut.append(new ESLVal(lIn.headVal, $nil));
																														lIn = lIn.tailVal;
																													}
																													return lOut;
																												}
																											});

	public static ESLVal										reverse			= new ESLVal(new Function(new ESLVal("reverse"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[0].reverse();
																												}
																											});

	public static ESLVal										flatten			= new ESLVal(new Function(new ESLVal("flatten"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[0].flatten();
																												}
																											});

	public static ESLVal										id					= new ESLVal(new Function(new ESLVal("id"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[0];
																												}
																											});

	public static ESLVal										head				= new ESLVal(new Function(new ESLVal("head"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[0].headVal;
																												}
																											});

	public static ESLVal										tail				= new ESLVal(new Function(new ESLVal("tail"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return args[0].tailVal;
																												}
																											});

	public static ESLVal										print				= new ESLVal(new Function(new ESLVal("print"), null) {

																												public ESLVal apply(ESLVal... args) {
																													System.out.println(args[0]);
																													return Lib.$null;
																												}
																											});

	public static ESLVal										stopAll			= new ESLVal(new Function(new ESLVal("stopAll"), null) {

																												public ESLVal apply(ESLVal... args) {
																													stopAll();
																													return Lib.$null;
																												}
																											});

	public static ESLVal										random			= new ESLVal(new Function(new ESLVal("random"), null) {

																												public ESLVal apply(ESLVal... args) {
																													return new ESLVal((int) (Math.random() * args[0].intVal));
																												}
																											});

	public static ESLVal										kill				= new ESLVal(new Function(new ESLVal("kill"), null) {

																												public ESLVal apply(ESLVal... args) {
																													switch (args[0].state) {
																													case ACTOR:
																														args[0].actor.stop();
																														break;
																													case JAVA_ACTOR:
																														args[0].javaActor.stop();
																														break;
																													default:
																														throw new Error("cannot stop " + args[0]);
																													}
																													return args[0];
																												}
																											});

	public static ESLVal asESLVal(Object o) {
		if (o == null) return $null;
		if (o instanceof Integer) return new ESLVal((int) o);
		if (o instanceof String) return new ESLVal((String) o);
		if (o instanceof Double) return new ESLVal((double) o);
		if (o instanceof Boolean) return new ESLVal((boolean) o);
		if (o instanceof list.Nil<?>) return $nil;
		if (o instanceof list.List<?>) {
			list.List<Object> l = (list.List<Object>) o;
			return new ESLVal(asESLVal(l.getHead()), asESLVal(l.getTail()));
		}
		if (o instanceof Term) {
			Term t = (Term) o;
			ESLVal[] vals = new ESLVal[t.getArity()];
			for (int i = 0; i < vals.length; i++) {
				vals[i] = asESLVal(t.getValues()[i]);
			}
			return new ESLVal(t.getName().getString(), vals);
		}
		throw new Error("asESLVal: " + o);
	}

	public static ESLVal at(Supplier<ESLVal> left, Supplier<ESLVal> right) {

		// Call both suppliers and wait. Return when the first supplier produces a
		// result. Ignore the second result...

		ESLVal[] result = new ESLVal[] { null };
		synchronized (left) {
			threadPool.execute(() -> {
				result[0] = left.get();
				synchronized (left) {
					left.notify();
				}
			});
			threadPool.execute(() -> {
				result[0] = right.get();
				synchronized (left) {
					left.notify();
				}
			});
			try {
				left.wait();
				return result[0];
			} catch (InterruptedException e) {
				return $null;
			}
		}
	}

	public static ESLVal[] plet(Supplier[] suppliers) {
		int[] count = new int[] { 0 };
		ESLVal[] results = new ESLVal[suppliers.length];
		for (int i = 0; i < suppliers.length;i++) {
			Supplier<ESLVal> s = (Supplier)suppliers[i];
			int[] index = new int[] {i};
			threadPool.execute(() -> {
				ESLVal v = s.get();
				synchronized (results) {
					results[index[0]] = v;
					count[0]++;
					if (count[0] == suppliers.length) results.notify();
				}
			});
		}
		synchronized(results) {
			try {
				results.wait();
			} catch (InterruptedException e) {
				throw new Error(e.toString());
			}
			return results;
		}
	}

	public static ESLVal become(ESLVal fun, ESLVal actor, ESLVal... args) {
		Behaviour oldBehaviour = actor.actor.getBehaviour();
		actor.actor.behaviour.stop();
		fun.funVal.setSelf(actor);
		Behaviour behaviour = fun.apply(args).behaviour;
		actor.actor.setBehaviour(behaviour);
		behaviour.setQueue(oldBehaviour.getQueue());
		return actor;
	}

	public static <T> T error(ESLVal v) {
		throw new ESLError(v);
	}

	private static ReentrantLock getLock(Object object) {
		synchronized (locks) {
			if (locks.containsKey(object))
				return locks.get(object);
			else {
				ReentrantLock lock = new ReentrantLock(false);
				locks.put(object, lock);
				return lock;
			}
		}
	}

	private static ReentrantLock[] getLocks(Object[] objects) {
		ReentrantLock[] locks = new ReentrantLock[objects.length];
		for (int i = 0; i < locks.length; i++) {
			locks[i] = getLock(objects[i]);
		}
		return locks;
	}

	public static ESLVal getParent(ESLVal self, ESLVal parentFun, ESLVal... args) {
		// The parent of a behaviour must set the self in the creation function
		// before the behaviour function is applied to the arguments...
		parentFun.funVal.setSelf(self);
		return parentFun.funVal.apply(args);
	}

	public static ESLVal getSelf() {
		return null;
	}

	static int getTime() {
		return (int) (System.currentTimeMillis() - time0);
	}

	public static boolean isList(ValState state) {
		switch (state) {
		case NIL:
		case CONS:
			return true;
		default:
			return false;
		}
	}

	public static boolean isSet(ValState state) {
		switch (state) {
		case EMPTYSET:
		case SETCONS:
			return true;
		default:
			return false;
		}
	}

	protected static int length() {
		Actor a = actor;
		int length = 0;
		do {
			length++;
			a = a.getNext();
		} while (a != actor);
		return length;
	}

	private static int length(ESLVal l) {
		switch (l.state) {
		case EMPTYSET:
		case NIL:
			return 0;
		case SETCONS:
		case CONS:
			return length(l.tailVal) + 1;
		default:
			throw new Error("length requires a list or set: " + l);
		}
	}

	public static <T> T lock(Function action, Object... objects) {
		// Lock each of the locks for the objects. If any of them fail then
		// release the lock and try again.
		T value = null;
		lock(objects);
		value = (T) action.apply();
		unlock(objects);
		return value;
	}

	private static void lock(Object[] objects) {
		while (!lockAll(objects, 0))
			;
	}

	private static boolean lockAll(Object[] objects, int i) {
		if (i == objects.length)
			return true;
		else {
			ReentrantLock lock = getLock(objects[i]);
			if (lock.tryLock()) {
				if (lockAll(objects, i + 1))
					return true;
				else {
					lock.unlock();
					return false;
				}
			} else
				return false;
		}
	}

	private static ESLVal ndAdd(ESLVal collection, ESLVal succ, ESLVal fail) {
		switch (collection.state) {
		case NIL:
		case CONS:
			return ndListAdd(collection, succ, fail);
		case EMPTYSET:
		case SETCONS:
			return ndSetAdd(collection, succ, fail);
		default:
			throw new Error("unknown nd value: " + collection);
		}
	}

	private static ESLVal ndAdd1(ESLVal pairs, ESLVal succ, ESLVal fail) {
		if (pairs.isNil())
			return fail.apply();
		else {
			ESLVal pair = pairs.head();
			ESLVal left = pair.nth(0);
			ESLVal right = pair.nth(1);
			return succ.apply(left, right, new ESLVal(new Function(new ESLVal("setAdd"), null) {
				public ESLVal apply(ESLVal... args) {
					return ndAdd1(pairs.tail(), succ, fail);
				}
			}));
		}
	}

	protected static ESLVal ndCase(ESLVal set, ESLVal arms, ESLVal fail) {
		if (arms.isNil())
			return fail.apply();
		else {
			return ndCaseArm(set, arms.head(), new ESLVal(new Function(new ESLVal("setCaseArm"), null) {
				public ESLVal apply(ESLVal... args) {
					return ndCase(set, arms.tail(), fail);
				}
			}));
		}
	}

	private static ESLVal ndCaseArm(ESLVal collection, ESLVal term, ESLVal fail) {
		switch (term.termName) {
		case "$empty":
			if (collection.isEmptySet() || collection.isNil())
				return term.termVals[0].apply(fail);
			else
				return fail.apply();
		case "$cons":
			return ndCons(collection, 0, term.termVals[0], fail);
		case "$selectLeft":
			return ndSelectLeft(collection, term.termVals[0], fail);
		case "$selectMid":
			return ndSelectMid(collection, 0, term.termVals[0], fail);
		case "$selectRight":
			return ndSelectRight(collection, term.termVals[0], fail);
		default:
			throw new Error("illegal case arm: " + term);
		}
	}

	private static ESLVal ndSelectMid(ESLVal list, int index, ESLVal succ, ESLVal fail) {
		if (length(list) == index) {
			return fail.apply();
		} else {
			ESLVal x = list.nth(index);
			ESLVal pre = list.take(index);
			ESLVal post = list.drop(index + 1);
			return succ.apply(pre, x, post, new ESLVal(new Function(new ESLVal("ndSelectMid"), null) {
				public ESLVal apply(ESLVal... args) {
					return ndSelectMid(list, index + 1, succ, fail);
				}
			}));
		}
	}

	private static ESLVal ndSelectLeft(ESLVal list, ESLVal succ, ESLVal fail) {
		if (list.isNil())
			return fail.apply();
		else {
			ESLVal x = list.head();
			ESLVal l = list.tail();
			return succ.apply(x, l, fail);
		}
	}

	private static ESLVal ndSelectRight(ESLVal list, ESLVal succ, ESLVal fail) {
		if (list.isNil())
			return fail.apply();
		else {
			ESLVal x = list.last();
			ESLVal l = list.butlast();
			return succ.apply(l, x, fail);
		}
	}

	private static ESLVal ndCons(ESLVal collection, int index, ESLVal succ, ESLVal fail) {
		if (index == Lib.length(collection))
			return fail.apply();
		else {
			ESLVal element = collection.nth(index);
			ESLVal rest = collection.remove(element);
			return succ.apply(element, rest, new ESLVal(new Function(new ESLVal("cons"), null) {
				public ESLVal apply(ESLVal... args) {
					return ndCons(collection, index + 1, succ, fail);
				}
			}));
		}
	}

	private static ESLVal ndListAdd(ESLVal list, ESLVal succ, ESLVal fail) {
		ESLVal power = powerList(list);
		ESLVal pairs = starList(power, power);
		return ndAdd1(pairs, succ, fail);
	}

	private static ESLVal ndSetAdd(ESLVal set, ESLVal succ, ESLVal fail) {
		ESLVal power = power(set);
		ESLVal pairs = star(power, power);
		return ndAdd1(pairs, succ, fail);
	}

	public static ESLVal newActor(ESLVal fun, ESLVal actor, ESLVal... args) {
		fun.funVal.setSelf(actor);
		ESLVal v = fun.apply(args);
		Behaviour b = v.behaviour;
		b.setSelf(actor);
		actor.actor.setBehaviour(b);
		actor.actor.start();
		return actor;
	}

	public static ESLVal newArray(int length) {
		ESLVal[] a = new ESLVal[length];
		for (int i = 0; i < length; i++) {
			a[i] = Lib.$null;
		}
		return new ESLVal(a);
	}

	public static ESLVal newJavaActor(String className, ESLVal... args) {
		try {
			Class<?> c = Class.forName(className);
			int arity = args.length;
			AlienActor javaActor = null;
			for (Constructor<?> cnstr : c.getConstructors()) {
				if (cnstr.getParameterCount() == arity) {
					javaActor = (AlienActor) cnstr.newInstance(args);
				}
			}
			return new ESLVal(javaActor);
		} catch (ClassNotFoundException e) {
			throw new Error("cannot find class named " + className);
		} catch (IllegalArgumentException e) {
			throw new Error("cannot instantiate class " + className);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ESLVal newRecord(ESLVal[] names, ESLVal... vals) {
		Record r = new Record();
		for (int i = 0; i < names.length; i++) {
			r.put(names[i].strVal, vals[i]);
		}
		return new ESLVal(r);
	}

	public static ESLVal newTable() {
		return new ESLVal(new Hashtable<ESLVal, ESLVal>());
	}

	public static ESLVal now() {
		return new ESLVal(getTime());
	}

	private static ESLVal power(ESLVal set) {
		ESLVal power = new ESLVal($emptyset, $emptyset);
		while (!set.isEmptySet()) {
			ESLVal v = set.head();
			set = set.tail();
			ESLVal S = $emptyset;
			ESLVal oldPower = power;
			while (!power.isEmptySet()) {
				S = new ESLVal(new ESLVal(v, power.head()), S);
				power = power.tail();
			}
			S = S.append(oldPower);
			power = S;
		}
		return power;
	}

	private static ESLVal powerList(ESLVal list) {
		ESLVal power = new ESLVal($nil, $nil);
		while (!list.isNil()) {
			ESLVal v = list.head();
			list = list.tail();
			ESLVal S = $nil;
			ESLVal oldPower = power;
			while (!power.isNil()) {
				S = new ESLVal(new ESLVal(v, power.head()), S);
				power = power.tail();
			}
			S = S.append(oldPower);
			power = S;
		}
		return power;
	}

	public static void printActors() {
		printActors(actor);
	}

	protected static void printActors(Actor a) {
		System.out.println("----- START --------");
		Actor start = a;
		do {
			System.out.println(a);
			a = a.getNext();
		} while (a != start);
		System.out.println("------ END --------");
	}

	public static ESLVal probably(ESLVal percent, ESLVal f1, ESLVal f2) {
		if (Math.random() * 100 < percent.intVal)
			return f1.apply();
		else
			return f2.apply();
	}

	public static void register(Actor a) {
		synchronized (lock) {
			actor.linkNext(a);
		}
	}

	public static void reset() {
		time0 = System.currentTimeMillis();
		actor = new DummyActor();
		locks.clear();
		lock = new Object();
		threadPool = Executors.newFixedThreadPool(THREADS);
		timerActive = true;
		startTimer();
	}

	public static ESLVal send(ESLVal actor, String message, ESLVal... args) {
		switch (actor.state) {
		case ACTOR:
			actor.actor.send(new ESLVal(message, args));
			break;
		case JAVA_ACTOR:
			// Lib.threadPool.execute(() -> {
			actor.javaActor.alienSend(new ESLVal(message, args));
			// });
			break;
		default:
			throw new Error("cannot send " + message + " to " + actor);
		}
		return actor;
	}

	private static ESLVal star(ESLVal S1, ESLVal S2) {
		ESLVal star = $nil;
		while (!S1.isEmptySet()) {
			ESLVal s1 = S1.head();
			ESLVal S3 = S2;
			while (!S3.isEmptySet()) {
				ESLVal s2 = S3.head();
				star = new ESLVal(new ESLVal(s1, new ESLVal(s2, $nil)), star);
				S3 = S3.tail();
			}
			S1 = S1.tail();
		}
		return star;
	}

	private static ESLVal starList(ESLVal S1, ESLVal S2) {
		ESLVal star = $nil;
		while (!S1.isNil()) {
			ESLVal s1 = S1.head();
			ESLVal S3 = S2;
			while (!S3.isNil()) {
				ESLVal s2 = S3.head();
				star = new ESLVal(new ESLVal(s1, new ESLVal(s2, $nil)), star);
				S3 = S3.tail();
			}
			S1 = S1.tail();
		}
		return star;
	}

	private static void startTimer() {
		new Thread(new Runnable() {
			public void run() {
				while (timerActive) {
					synchronized (lock) {
						boolean isZombie = actor.tick();
						if (isZombie) {
							actor = actor.unlink();
						} else
							actor = actor.getNext();
					}
				}
				System.out.println("MAIN LOOP STOPPED");
			}
		}).start();
	}

	public static void stopAll() {
		synchronized (lock) {
			timerActive = false;
			synchronized (lock) {
				while (!actor.isSingleton()) {
					actor.stop();
					actor = actor.unlink();
				}
			}
			actor.stop();
			threadPool.shutdownNow();
		}
	}

	private static void unlock(Object[] objects) {
		for (int i = objects.length - 1; i >= 0; i--) {
			Object o = objects[i];
			ReentrantLock lock = getLock(o);
			lock.unlock();
		}
	}

}
