package esl;

import runtime.data.Term;
import static esl.Library.*;
import list.*;

public class Collisions {
  public interface Fail<T> {
    public T fail();
  }

  interface Fun2<T, T0, T1> {
    T apply(T0 x0, T1 x1);
  }

  interface Fun4<T, T0, T1, T2, T3> {
    T apply(T0 x0, T1 x1, T2 x2, T3 x3);
  }

  private static Fun2<Integer, Integer, Integer> min =
      new Fun2<Integer, Integer, Integer>() {
        public Integer apply(Integer x, Integer y) {
          if ((x) < (y)) {
            return x;
          } else {
            return y;
          }
        }
      };
  private static Fun2<Integer, Integer, Integer> max =
      new Fun2<Integer, Integer, Integer>() {
        public Integer apply(Integer x, Integer y) {
          if ((x) > (y)) {
            return x;
          } else {
            return y;
          }
        }
      };
  private static Fun2<Actor, Integer, Actor> ball =
      new Fun2<Actor, Integer, Actor>() {
        public Actor apply(Integer id, Actor simulator) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Integer> x =
                        new Cell<Integer>(
                            random.apply(((int) ((Actor) simulator.get("gui")).get("width"))));
                    Cell<Integer> y =
                        new Cell<Integer>(
                            random.apply(((int) ((Actor) simulator.get("gui")).get("height"))));
                    Cell<Integer> dx = new Cell<Integer>((random.apply(2)) - (1));
                    Cell<Integer> dy = new Cell<Integer>((random.apply(2)) - (1));
                    Fun1<Object, Integer> checkDeltas =
                        new Fun1<Object, Integer>() {
                          public Object apply(Integer n) {
                            if ((dx.getValue() == 0) && (dy.getValue() == 0)) {
                              dx.setValue(((random.apply(2)) - (1)) * (n));
                              dy.setValue(((random.apply(2)) - (1)) * (n));
                              return checkDeltas.apply(n + 1);
                            } else {
                              return null;
                            }
                          }
                        };
                    Fun0<Object> hitWalls =
                        new Fun0<Object>() {
                          public Object apply() {
                            if ((x.getValue()
                                    + dx.getValue()
                                    + ((int) ((Actor) simulator.get("gui")).get("ballSize")))
                                > (((int) ((Actor) simulator.get("gui")).get("width")))) {
                              dx.setValue((0) - (dx.getValue()));
                            } else {
                              if ((x.getValue() + dx.getValue()) < (0)) {
                                dx.setValue((0) - (dx.getValue()));
                              } else {
                                if ((y.getValue()
                                        + dy.getValue()
                                        + ((int) ((Actor) simulator.get("gui")).get("ballSize")))
                                    > (((int) ((Actor) simulator.get("gui")).get("height")))) {
                                  dy.setValue((0) - (dy.getValue()));
                                } else {
                                  if ((y.getValue() + dy.getValue()) < (0)) {
                                    dy.setValue((0) - (dy.getValue()));
                                  } else {
                                    {
                                    }
                                  }
                                }
                              }
                            }
                            return null;
                          }
                        };
                    Fun4<Boolean, Integer, Integer, Integer, Integer> overlaps =
                        new Fun4<Boolean, Integer, Integer, Integer, Integer>() {
                          public Boolean apply(Integer x1, Integer y1, Integer x2, Integer y2) {
                            return ((((x1) > (x2))
                                        && ((x1)
                                            < (x2
                                                + ((int)
                                                    ((Actor) simulator.get("gui"))
                                                        .get("ballSize")))))
                                    && (((y1) > (y2))
                                        && ((y1)
                                            < (y2
                                                + ((int)
                                                    ((Actor) simulator.get("gui"))
                                                        .get("ballSize"))))))
                                || ((((x2) > (x1))
                                        && ((x2)
                                            < (x1
                                                + ((int)
                                                    ((Actor) simulator.get("gui"))
                                                        .get("ballSize")))))
                                    && (((y2) > (y1))
                                        && ((y2)
                                            < (y1
                                                + ((int)
                                                    ((Actor) simulator.get("gui"))
                                                        .get("ballSize"))))));
                          }
                        };
                    Fun0<Object> hitBalls =
                        new Fun0<Object>() {
                          public Object apply() {
                            return new java.util.function.Supplier<Object>() {
                              public Object get() {
                                List<Actor> l_ = ((list.List<Actor>) simulator.get("balls"));
                                while (!l_.isNil()) {
                                  Actor b = l_.getHead();
                                  l_ = l_.getTail();
                                  if ((b) != (self)) {
                                    if (overlaps.apply(
                                        ((int) b.get("x")),
                                        ((int) b.get("y")),
                                        x.getValue(),
                                        y.getValue())) {
                                      dx.setValue((0) - (dx.getValue()));
                                      dy.setValue((0) - (dy.getValue()));
                                    } else {
                                      {
                                      }
                                    }
                                  } else {
                                    {
                                    }
                                  }
                                }
                                return null;
                              }
                            }.get();
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("x")) return x.getValue();
                      if (name.equals("y")) return y.getValue();
                      if (name.equals("dx")) return dx.getValue();
                      if (name.equals("dy")) return dy.getValue();
                      if (name.equals("checkDeltas")) return checkDeltas;
                      if (name.equals("hitWalls")) return hitWalls;
                      if (name.equals("overlaps")) return overlaps;
                      if (name.equals("hitBalls")) return hitBalls;
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return checkDeltas.apply(2);
                    }

                    public void processTime(Actor self, int n) {
                      if (true) {
                        hitWalls.apply();
                        hitBalls.apply();
                        x.setValue(
                            max.apply(
                                0,
                                min.apply(
                                    x.getValue() + dx.getValue(),
                                    ((int) ((Actor) simulator.get("gui")).get("width")))));
                        y.setValue(
                            max.apply(
                                0,
                                min.apply(
                                    y.getValue() + dy.getValue(),
                                    ((int) ((Actor) simulator.get("gui")).get("height")))));
                        ((Actor) simulator.get("gui"))
                            .send(new Term("Draw", id, x.getValue(), y.getValue()));
                      } else {
                        {
                        }
                      }
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
                  })
              .start();
        }
      };
  private static Fun0<Actor> simulator =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Actor> gui = new Cell<Actor>(null);
                    Cell<list.List<Actor>> balls = new Cell<list.List<Actor>>(new list.Nil());

                    public Object get(String name) {
                      if (name.equals("gui")) return gui.getValue();
                      if (name.equals("balls")) return balls.getValue();
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int n) {}

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "SetGUI", 1))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        Actor g = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            return gui.setValue(g);
                                          }
                                        }.apply(fail);
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "Start", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return balls.setValue(
                                                    esl.Library.flatten(
                                                        esl.Library.map(
                                                            new Fun1<list.List<Actor>, Integer>() {
                                                              public list.List<Actor> apply(
                                                                  Integer mapElement) {
                                                                return new Fun1<
                                                                    list.List<Actor>, Integer>() {
                                                                  public list.List<Actor> apply(
                                                                      Integer var0) {
                                                                    return new Fail<
                                                                        list.List<Actor>>() {
                                                                      public list.List<Actor>
                                                                          fail() {
                                                                        return new Fun1<
                                                                            list.List<Actor>,
                                                                            Fail<
                                                                                list.List<
                                                                                    Actor>>>() {
                                                                          public list.List<Actor>
                                                                              apply(
                                                                                  Fail<
                                                                                          list.List<
                                                                                              Actor>>
                                                                                      fail) {
                                                                            int i = var0;
                                                                            return new Fun1<
                                                                                list.List<Actor>,
                                                                                Fail<
                                                                                    list.List<
                                                                                        Actor>>>() {
                                                                              public list.List<
                                                                                      Actor>
                                                                                  apply(
                                                                                      Fail<
                                                                                              list
                                                                                                      .List<
                                                                                                  Actor>>
                                                                                          fail) {
                                                                                return new list
                                                                                        .Nil()
                                                                                    .cons(
                                                                                        ball.apply(
                                                                                            i,
                                                                                            self));
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(
                                                                            new Fail<
                                                                                list.List<
                                                                                    Actor>>() {
                                                                              public list.List<
                                                                                      Actor>
                                                                                  fail() {
                                                                                return new Fun1<
                                                                                    list.List<
                                                                                        Actor>,
                                                                                    Fail<
                                                                                        list.List<
                                                                                            Actor>>>() {
                                                                                  public list.List<
                                                                                          Actor>
                                                                                      apply(
                                                                                          Fail<
                                                                                                  list
                                                                                                          .List<
                                                                                                      Actor>>
                                                                                              fail) {
                                                                                    int else_ =
                                                                                        var0;
                                                                                    return new Fun1<
                                                                                        list.List<
                                                                                            Actor>,
                                                                                        Fail<
                                                                                            list
                                                                                                    .List<
                                                                                                Actor>>>() {
                                                                                      public list
                                                                                                  .List<
                                                                                              Actor>
                                                                                          apply(
                                                                                              Fail<
                                                                                                      list
                                                                                                              .List<
                                                                                                          Actor>>
                                                                                                  fail) {
                                                                                        return new list
                                                                                            .Nil();
                                                                                      }
                                                                                    }.apply(fail);
                                                                                  }
                                                                                }.apply(
                                                                                    new Fail<
                                                                                        list.List<
                                                                                            Actor>>() {
                                                                                      public list
                                                                                                  .List<
                                                                                              Actor>
                                                                                          fail() {
                                                                                        throw new Error(
                                                                                            " case failed.");
                                                                                      }
                                                                                    });
                                                                              }
                                                                            });
                                                                      }
                                                                    }.fail();
                                                                  }
                                                                }.apply(mapElement);
                                                              }
                                                            },
                                                            esl.Library.to(
                                                                0,
                                                                (((int) gui.getValue().get("size")))
                                                                    - (1)))));
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Stop", 0))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return new java.util.function.Supplier<
                                                            Object>() {
                                                          public Object get() {
                                                            List<Actor> l_ = balls.getValue();
                                                            while (!l_.isNil()) {
                                                              Actor ball = l_.getHead();
                                                              l_ = l_.getTail();
                                                              kill.apply(ball);
                                                            }
                                                            return null;
                                                          }
                                                        }.get();
                                                      }
                                                    }.apply(fail);
                                                  else return fail.fail();
                                                }
                                              }.apply(
                                                  new Fail<Object>() {
                                                    public Object fail() {
                                                      return new Fun1<Object, Fail<Object>>() {
                                                        public Object apply(Fail<Object> fail) {
                                                          if (isTerm(var0, "Close", 0))
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                return stopAll.apply();
                                                              }
                                                            }.apply(fail);
                                                          else return fail.fail();
                                                        }
                                                      }.apply(
                                                          new Fail<Object>() {
                                                            public Object fail() {
                                                              throw new Error(" case failed.");
                                                            }
                                                          });
                                                    }
                                                  });
                                            }
                                          });
                                    }
                                  });
                            }
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  public static Fun0<Actor> main =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    public Object get(String name) {
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return javaNew("esl.CollisionFrame", simulator.apply());
                    }

                    public void processTime(Actor self, int n) {}

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
                  })
              .start();
        }
      };

  public static void main(String[] args) {
    new Collisions().main.apply();
  }
}

