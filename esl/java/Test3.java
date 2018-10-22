package esl;

import runtime.data.Term;
import static esl.Library.*;
import list.*;

public class Test3 {
	public interface Fail<T> {
		public T fail();
	}

	interface Fun2<T, T0, T1> {
		T apply(T0 x0, T1 x1);
	}

	private static Fun0<Actor> parent = new Fun0<Actor>() {
		public Actor apply() {
			return new Actor(new BehaviourAdapter(false) {
				Actor self;

				public void setSelf(Actor self) {
					this.self = self;
				}

				public Object get(String name) {
					throw new Error("no field named " + name);
				}

				public Object init() {
					return new java.util.function.Supplier<Object>() {
						public Object get() {
							List<Integer> l_ = esl.Library.to(0, 30);
							while (!l_.isNil()) {
								int n = l_.getHead();
								l_ = l_.getTail();
								child.apply(n, self);
							}
							return null;
						}
					}.get();
				}

				public void processTime(Actor self, int n) {
				}

				public void processMessage(Actor self, Term message) {
					new Fun1<Object, Term>() {
						public Object apply(Term var0) {
							return new Fail<Object>() {
								public Object fail() {
									return new Fun1<Object, Fail<Object>>() {
										public Object apply(Fail<Object> fail) {
											if (isTerm(var0, "X", 0))
												return new Fun1<Object, Fail<Object>>() {
													public Object apply(Fail<Object> fail) {
														return null;
													}
												}.apply(fail);
											else
												return fail.fail();
										}
									}.apply(new Fail<Object>() {
										public Object fail() {
											throw new Error(" case failed.");
										}
									});
								}
							}.fail();
						}
					}.apply(message);
				}
			}).start();
		}
	};
	private static Fun2<Actor, Integer, Actor> child = new Fun2<Actor, Integer, Actor>() {
		public Actor apply(Integer id, Actor p) {
			return new Actor(new BehaviourAdapter(false) {
				Actor self;

				public void setSelf(Actor self) {
					this.self = self;
				}

				Fun1<Integer, Integer> send = new Fun1<Integer, Integer>() {
					public Integer apply(Integer n) {
						if (n == 1000000) {
							print.apply(id + " " + n);
							return n;
						} else {
							p.send(new Term("X"));
							return send.apply(n + 1);
						}
					}
				};

				public Object get(String name) {
					if (name.equals("send"))
						return send;
					throw new Error("no field named " + name);
				}

				public Object init() {
					return send.apply(0);
				}

				public void processTime(Actor self, int n) {
				}

				public void processMessage(Actor self, Term message) {
					new Fun1<Object, Term>() {
						public Object apply(Term var0) {
							return new Fail<Object>() {
								public Object fail() {
									throw new Error(" case failed.");
								}
							}.fail();
						}
					}.apply(message);
				}
			}).start();
		}
	};
	private static Cell<Integer> count = new Cell<Integer>(0);
	private static Fun0<Actor> a = new Fun0<Actor>() {
		public Actor apply() {
			return new Actor(new BehaviourAdapter(false) {
				Actor self;

				public void setSelf(Actor self) {
					this.self = self;
				}

				public Object get(String name) {
					throw new Error("no field named " + name);
				}

				public Object init() {
					return count.setValue(count.getValue() + 1);
				}

				public void processTime(Actor self, int n) {
				}

				public void processMessage(Actor self, Term message) {
					new Fun1<Object, Term>() {
						public Object apply(Term var0) {
							return new Fail<Object>() {
								public Object fail() {
									throw new Error(" case failed.");
								}
							}.fail();
						}
					}.apply(message);
				}
			}).start();
		}
	};
	private static int limit = 1048576;
	public static Fun0<Actor> main = new Fun0<Actor>() {
		public Actor apply() {
			return new Actor(new BehaviourAdapter(false) {
				Actor self;

				public void setSelf(Actor self) {
					this.self = self;
				}

				Cell<Integer> t0 = new Cell<Integer>(0);
				Fun1<Integer, Integer> create = new Fun1<Integer, Integer>() {
					public Integer apply(Integer n) {
						if (n == limit) {
							return n;
						} else {
							a.apply();
							return create.apply(n + 1);
						}
					}
				};

				public Object get(String name) {
					if (name.equals("t0"))
						return t0.getValue();
					if (name.equals("create"))
						return create;
					throw new Error("no field named " + name);
				}

				public Object init() {
					t0.setValue(now());
					create.apply(0);
					print.apply((now()) - (t0.getValue()));
					print.apply(count.getValue());
					return parent.apply();
				}

				public void processTime(Actor self, int n) {
				}

				public void processMessage(Actor self, Term message) {
					new Fun1<Object, Term>() {
						public Object apply(Term var0) {
							return new Fail<Object>() {
								public Object fail() {
									throw new Error(" case failed.");
								}
							}.fail();
						}
					}.apply(message);
				}
			}).start();
		}
	};

	public static void main(String[] args) {
		new Test3().main.apply();
	}
}
