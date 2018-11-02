package esl.lib;

import java.util.ArrayDeque;

public abstract class BehaviourAdapter implements Behaviour {

	private static void register(Actor actor) {
		Lib.register(actor);
	}

	private ArrayDeque<ESLVal>	queue				= new ArrayDeque<ESLVal>();
	private ESLVal							parent			= null;
	private boolean							active			= true;
	private boolean							busy				= false;
	private boolean							handlesTime	= true;
	private ESLVal							name				= null;
	public ESLVal								self				= null;

	public BehaviourAdapter(ESLVal parent, boolean handlesTime, ESLVal self, ESLVal name) {
		this.parent = parent;
		this.handlesTime = handlesTime;
		this.self = self;
		this.name = name;
		parent.behaviour.setSelf(self);
	}

	public BehaviourAdapter(boolean handlesTime, ESLVal self, ESLVal name) {
		this(DummyBehaviour.DUMMY, handlesTime, self, name);
	}

	public abstract ESLVal get(String name);

	private Runnable getMessage(Actor self) {
		synchronized (queue) {
			if (busy)
				return null;
			else {
				if (queue.isEmpty()) {
					if (handlesTime) {
						busy = true;
						return () -> {
							if (active) processTime(self, Lib.getTime());
							busy = false;
						};
					} else
						return null;
				} else {
					ESLVal message = queue.remove();
					busy = true;
					return () -> {
						if (active) processMessage(self, message);
						busy = false;
					};
				}
			}
		}
	}

	public ESLVal getName() {
		return name;
	}

	public ArrayDeque<ESLVal> getQueue() {
		return queue;
	}

	public ESLVal getSelf() {
		return self;
	}
	
	public boolean hasParent() {
		return (parent != DummyBehaviour.DUMMY);
	}
	
	public ESLVal getParent() {
		return parent;
	}

	public abstract ESLVal init();

	public void processMessage(Actor self, ESLVal message) {
		handle(message);
	}

	public void processTime(Actor self, int time) {
		handleTime(new ESLVal(Lib.getTime()));
	}
	
	public void sendTimeSuper(ESLVal time) {
		if(parent != null) {
			parent.behaviour.handleTime(time);
		}
	}
	
	public void sendSuper(ESLVal message) {
		if(parent != null) {
			parent.behaviour.handle(message);
		}
	}
	
	public ESLVal refSuper(String name) {
		if(parent != null) {
			return parent.behaviour.get(name);
		} else throw new Error("super." + name + " is not defined");
	}

	public Actor send(Actor self, ESLVal message) {
		synchronized (queue) {
			if (!busy && queue.isEmpty()) {
				busy = true;
				Lib.threadPool.execute(() -> {
					if (active) processMessage(self, message);
					busy = false;
				});
			} else {
				queue.add(message);
				if (self.isZombie()) {
					self.reactivate();
				}
			}
			return self;
		}
	}

	public void setQueue(ArrayDeque<ESLVal> queue) {
		this.queue = queue;
	}

	public void setSelf(ESLVal actor) {
		this.self = actor;
		if(parent != null) {
			parent.behaviour.setSelf(actor);
		}
	}

	public Actor start(Actor self) {
		busy = true;
		Lib.threadPool.execute(() -> {
			init();
			register(self);
			busy = false;
		});
		return self;
	}

	public void stop() {
		active = false;
	}

	public boolean tick(Actor self) {
		Runnable r = getMessage(self);
		if (r != null && active) {
			Lib.threadPool.execute(r);
			return false;
		} else {
			synchronized (queue) {
				if (!handlesTime && queue.isEmpty()) {
					self.setZombie(true);
					return true;
				} else
					return false;
			}
		}
	}
}