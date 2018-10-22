package esl.lib;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

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

	public static ESLVal										wait				= new ESLVal(new Function(new ESLVal("wait"), null) {

																												public ESLVal apply(ESLVal... args) {
																													try {
																														synchronized (Thread.currentThread()) {
																															Thread.currentThread().wait(args[0].intVal);
																														}
																													} catch (InterruptedException e) {
																														e.printStackTrace();
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

	public static ESLVal										reject			= new ESLVal(new Function(new ESLVal("reject"), null) {

																												public ESLVal apply(ESLVal... args) {
																													Function pred = args[0].funVal;
																													ESLVal l = args[1];
																													switch (l.state) {
																													case CONS:
																														if (pred.apply(l.headVal).boolVal)
																															return reject.apply(args[0],l.tailVal);
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

	protected static int length() {
		Actor a = actor;
		int length = 0;
		do {
			length++;
			a = a.getNext();
		} while (a != actor);
		return length;
	}

	public static <T> T lock(Function action, Object... objects) {
		// Lock each of the locks for the objects. If any of them fail then
		// release the lock and try again.
		T value = null;
		lock(objects);
		// System.err.println("Locked " + Thread.currentThread() + " " +
		// Arrays.toString(getLocks(objects)));
		value = (T) action.apply();
		unlock(objects);
		// System.err.println("Unlocked " + Thread.currentThread() + " " +
		// Arrays.toString(getLocks(objects)));
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

	public static ESLVal now() {
		return new ESLVal(getTime());
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
