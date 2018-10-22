package esl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JPanel;

import ast.general.AST;
import ast.modules.Module;
import edb.tool.EDB;
import list.Cons;
import list.List;
import list.Nil;
import runtime.ESL;
import runtime.data.Key;
import runtime.data.Term;

public class Library {

	public static class Actor {

		Behaviour behaviour;

		public Actor(Behaviour behaviour) {
			this.behaviour = behaviour;
			behaviour.setSelf(this);
		}

		public Actor become(Actor actor) {
			this.behaviour = actor.getBehaviour();
			actor.getBehaviour().setSelf(this);
			return this;
		}

		public Object get(String name) {
			return behaviour.get(name);
		}

		public Behaviour getBehaviour() {
			return behaviour;
		}

		public Actor send(Term message) {
			return behaviour.send(this, message);
		}

		public Actor start() {
			return behaviour.start(this);
		}

		public void stop() {
			behaviour.stop();
		}

		public void tick() {
			behaviour.tick(this);
		}
	}

	public static interface Behaviour {

		public Object get(String name);

		public Actor send(Actor self, Term message);

		public void setSelf(Actor self);

		public Actor start(Actor self);

		public void stop();

		public void tick(Actor self);

	}

	public static abstract class BehaviourAdapter implements Behaviour {

		private static void register(Actor actor) {
			synchronized (actors) {
				actors.add(actor);
			}
		}

		private ArrayDeque<Term> queue = new ArrayDeque<Term>();

		private boolean active = true;

		private boolean busy = false;

		private boolean handlesTime = true;

		public BehaviourAdapter(boolean handlesTime) {
			this.handlesTime = handlesTime;
		}

		public abstract Object get(String name);

		private Runnable getMessage(Actor self) {
			synchronized (queue) {
				if (busy)
					return null;
				else {
					if (queue.isEmpty()) {
						if (handlesTime) {
							busy = true;
							return () -> {
								if (active)
									processTime(self, getTime());
								busy = false;
							};
						} else
							return null;
					} else {
						Term message = queue.remove();
						busy = true;
						return () -> {
							if (active)
								processMessage(self, message);
							busy = false;
						};
					}
				}
			}
		}

		public abstract Object init();

		public abstract void processMessage(Actor self, Term message);

		public abstract void processTime(Actor self, int time);

		public Actor send(Actor self, Term message) {
			synchronized (queue) {
				if (!busy && queue.isEmpty()) {
					busy = true;
					threadPool.execute(() -> {
						if (active)
							processMessage(self, message);
						busy = false;
					});
				} else
					queue.add(message);
				return self;
			}
		}

		public Actor start(Actor self) {
			busy = true;
			threadPool.execute(() -> {
				init();
				register(self);
				busy = false;
			});
			return self;
		}

		public void stop() {
			active = false;
		}

		public void tick(Actor self) {
			Runnable r = getMessage(self);
			if (r != null)
				threadPool.execute(r);
		}
	}

	public static class Cell<T> {
		T value;

		public Cell(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public Cell<T> setValue(T value) {
			this.value = value;
			return this;
		}
	}

	public static interface Fun0<T> {
		T apply();
	}

	public interface Fun1<T, T0> {
		T apply(T0 x0);
	}

	private static final int DELAY = 100;

	private static Vector<Actor> actors = new Vector<Actor>();

	private final static int THREADS = 500;

	private static Executor threadPool = Executors.newFixedThreadPool(THREADS);

	private static boolean timerActive = true;

	private static long time0 = System.currentTimeMillis();

	private static Hashtable<Object, ReentrantLock> locks = new Hashtable<Object, ReentrantLock>();

	static {
		startTimer();
	}

	public static Fun0<Object> stopAll = new Fun0<Object>() {
		public Object apply() {
			stopAll();
			return null;
		}
	};

	public static Fun1<Object, Object> print = new Fun1<Object, Object>() {
		public Object apply(Object value) {
			System.out.println(value);
			return null;
		}
	};

	public static Fun1<Integer, Integer> random = new Fun1<Integer, Integer>() {
		public Integer apply(Integer i) {
			return (int) (Math.random() * i);
		}
	};

	public static Fun1<Actor, Actor> kill = new Fun1<Actor, Actor>() {
		public Actor apply(Actor a) {
			a.stop();
			return a;
		}
	};

	public static Fun1<Integer, Double> round = new Fun1<Integer, Double>() {
		public Integer apply(Double a) {
			return (Integer) ((int) Math.round(a));
		}
	};

	public static Fun1<Double, Integer> intToFloat = new Fun1<Double, Integer>() {
		public Double apply(Integer a) {
			return (double) a;
		}
	};

	public static Fun1<Integer, Integer> wait = new Fun1<Integer, Integer>() {
		public Integer apply(Integer delay) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return delay;
		}
	};

	public static <T> List<T> append(List<T> l1, List<T> l2) {
		return l1.append(l2);
	}

	public static <T> T builtin(String name) {
		if (name.equals("round"))
			return (T) round;
		else if (name.equals("intToFloat"))
			return (T) intToFloat;
		else
			throw new Error("unknown builtin: " + name);
	}

	public static Term circlePos(int x, int y, int radius, int angle) {
		int posX = (int) (x + radius * Math.cos(Math.toRadians(angle)));
		int posY = (int) (y + radius * Math.sin(Math.toRadians(angle)));
		return new Term(Key.getKey("Point"), posX, posY);
	}

	public static <T> T consHead(List<T> l) {
		return l.getHead();
	}

	public static <T> List<T> consTail(List<T> l) {
		return l.getTail();
	}

	public static boolean eql(Object o1, Object o2) {
		if (o1 == null)
			return o2 == null;
		else if (o2 == null)
			return o1 == null;
		else
			return o1.equals(o2);
	}

	public static <T> List<T> flatten(List<List<T>> lists) {
		return lists.flatten(lists);
	}

	public static <T> Object forList(List<T> list, Fun1<Object, T> fun) {
		if (!list.isNil()) {
			fun.apply(list.getHead());
			return forList(list.getTail(), fun);
		} else
			return list;
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

	private static int getTime() {
		return (int) (System.currentTimeMillis() - time0);
	}

	public static boolean isCons(Object o) {
		return o instanceof Cons;
	}

	public static boolean isNil(Object o) {
		return o instanceof Nil;
	}

	public static boolean isTerm(Object o, String name, int arity) {
		if (o instanceof Term) {
			Term term = (Term) o;
			return term.getName().getString().equals(name) && term.getValues().length == arity;
		} else
			return false;
	}

	public static Actor javaNew(String name, Object... args) {
		try {
			Class<?> class_ = Class.forName(name);
			Constructor<?> cnstr = null;
			for (Constructor<?> c : class_.getConstructors()) {
				if (c.getParameterTypes().length == args.length) {
					cnstr = c;
				}
			}
			if (cnstr != null) {
				Behaviour actor = (Behaviour) cnstr.newInstance(args);
				if (actor instanceof JPanel && ESL.getEDB() != null)
					((EDB) ESL.getEDB()).newActor((JPanel) actor);
				return new Actor(actor);
			} else
				throw new Error("cannot find constructor for " + name + "(" + args.length + ")");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException |

				InvocationTargetException e) {
			e.printStackTrace();
			throw new Error(e.toString());
		}
	}

	public static <T> T lock(Fun0<T> action, Object... objects) {
		// Lock each of the locks for the objects. If any of them fail then
		// release the lock and try again.
		T value = null;
		lock(objects);
		// System.err.println("Locked " + Thread.currentThread() + " " +
		// Arrays.toString(getLocks(objects)));
		value = action.apply();
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

	public static <M, N> List<M> map(Fun1<M, N> fun, List<N> list) {
		if (list.isNil())
			return new Nil();
		else
			return map(fun, list.getTail()).cons(fun.apply(list.getHead()));
	}
	
	public static int now() {
		return getTime();
	}

	public static Term parse(String path) {
		Module module = Module.parseModule(path, parser.ESL.readFile(path));
		return (Term)AST.asESLValue(module);
	}

	public static boolean probably(int percent) {
		return (Math.random() * 100) <= percent;
	}

	public static Object sendEDB(Term term) {
		String name = term.getName().getString();
		Object[] values = term.getValues();
		EDB edb = (EDB) ESL.getEDB();
		if (name.equals("Filmstrip")) {
			String label = (String) values[0];
			List<?> snapshots = (List<?>) values[1];
			edb.sendFilmstrip(label, snapshots);
		} else if (name.equals("Show")) {
			String label = (String) values[0];
			Term html = (Term) values[1];
			edb.sendShow(label, html);
		} else
			throw new Error("unknown message for edb: " + name);
		return null;
	}

	private static void startTimer() {
		new Thread(new Runnable() {
			public void run() {
				while (timerActive) {
					synchronized (actors) {
						try {
							actors.wait(0, DELAY);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						for (Actor actor : actors) {
							actor.tick();
						}
					}
				}
			}
		}).start();
	}

	public static void stopAll() {
		timerActive = false;
		synchronized (actors) {
			for (Actor actor : actors) {
				actor.stop();
			}
		}
	}

	public static <T> T termRef(Term term, int index) {
		return (T) term.getValues()[index];
	}

	public static <T> T throwError(Object value) {
		throw new Error(value.toString());
	}

	public static List<Integer> to(int low, int high) {
		if (low >= high)
			return new Nil<Integer>();
		else
			return to(low + 1, high).cons(low);
	}

	private static void unlock(Object[] objects) {
		for (int i = objects.length - 1; i >= 0; i--) {
			Object o = objects[i];
			ReentrantLock lock = getLock(o);
			lock.unlock();
		}
	}

}
