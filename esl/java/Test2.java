package esl;

import runtime.data.Term;
import static esl.Library.*;
import list.*;

public class Test2 {
  public interface Fail<T> {
    public T fail();
  }

  private static list.List<Term> o =
      esl.Library.flatten(
          esl.Library.flatten(
              esl.Library.map(
                  new Fun1<list.List<list.List<Term>>, Integer>() {
                    public list.List<list.List<Term>> apply(Integer mapElement) {
                      return new Fun1<list.List<list.List<Term>>, Integer>() {
                        public list.List<list.List<Term>> apply(Integer var0) {
                          return new Fail<list.List<list.List<Term>>>() {
                            public list.List<list.List<Term>> fail() {
                              return new Fun1<
                                  list.List<list.List<Term>>, Fail<list.List<list.List<Term>>>>() {
                                public list.List<list.List<Term>> apply(
                                    Fail<list.List<list.List<Term>>> fail) {
                                  int x = var0;
                                  return new Fun1<
                                      list.List<list.List<Term>>,
                                      Fail<list.List<list.List<Term>>>>() {
                                    public list.List<list.List<Term>> apply(
                                        Fail<list.List<list.List<Term>>> fail) {
                                      return new list.Nil()
                                          .cons(
                                              esl.Library.flatten(
                                                  esl.Library.map(
                                                      new Fun1<list.List<Term>, Integer>() {
                                                        public list.List<Term> apply(
                                                            Integer mapElement) {
                                                          return new Fun1<
                                                              list.List<Term>, Integer>() {
                                                            public list.List<Term> apply(
                                                                Integer var0) {
                                                              return new Fail<list.List<Term>>() {
                                                                public list.List<Term> fail() {
                                                                  return new Fun1<
                                                                      list.List<Term>,
                                                                      Fail<list.List<Term>>>() {
                                                                    public list.List<Term> apply(
                                                                        Fail<list.List<Term>>
                                                                            fail) {
                                                                      int y = var0;
                                                                      return new Fun1<
                                                                          list.List<Term>,
                                                                          Fail<list.List<Term>>>() {
                                                                        public list.List<Term>
                                                                            apply(
                                                                                Fail<
                                                                                        list.List<
                                                                                            Term>>
                                                                                    fail) {
                                                                          return new list.Nil()
                                                                              .cons(
                                                                                  new Term(
                                                                                      "Value",
                                                                                      x + y));
                                                                        }
                                                                      }.apply(fail);
                                                                    }
                                                                  }.apply(
                                                                      new Fail<list.List<Term>>() {
                                                                        public list.List<Term>
                                                                            fail() {
                                                                          return new Fun1<
                                                                              list.List<Term>,
                                                                              Fail<
                                                                                  list.List<
                                                                                      Term>>>() {
                                                                            public list.List<Term>
                                                                                apply(
                                                                                    Fail<
                                                                                            list
                                                                                                    .List<
                                                                                                Term>>
                                                                                        fail) {
                                                                              int else_ = var0;
                                                                              return new Fun1<
                                                                                  list.List<Term>,
                                                                                  Fail<
                                                                                      list.List<
                                                                                          Term>>>() {
                                                                                public list.List<
                                                                                        Term>
                                                                                    apply(
                                                                                        Fail<
                                                                                                list
                                                                                                        .List<
                                                                                                    Term>>
                                                                                            fail) {
                                                                                  return new list
                                                                                      .Nil();
                                                                                }
                                                                              }.apply(fail);
                                                                            }
                                                                          }.apply(
                                                                              new Fail<
                                                                                  list.List<
                                                                                      Term>>() {
                                                                                public list.List<
                                                                                        Term>
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
                                                      esl.Library.to(0, 600))));
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<list.List<list.List<Term>>>() {
                                    public list.List<list.List<Term>> fail() {
                                      return new Fun1<
                                          list.List<list.List<Term>>,
                                          Fail<list.List<list.List<Term>>>>() {
                                        public list.List<list.List<Term>> apply(
                                            Fail<list.List<list.List<Term>>> fail) {
                                          int else_ = var0;
                                          return new Fun1<
                                              list.List<list.List<Term>>,
                                              Fail<list.List<list.List<Term>>>>() {
                                            public list.List<list.List<Term>> apply(
                                                Fail<list.List<list.List<Term>>> fail) {
                                              return new list.Nil();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<list.List<list.List<Term>>>() {
                                            public list.List<list.List<Term>> fail() {
                                              throw new Error(" case failed.");
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
                  esl.Library.to(0, 600))));

  private static class length_ {
    public <T> int apply(list.List<T> l) {
      return new Fun1<Integer, list.List<T>>() {
        public Integer apply(list.List<T> var0) {
          return new Fail<Integer>() {
            public Integer fail() {
              return new Fun1<Integer, Fail<Integer>>() {
                public Integer apply(Fail<Integer> fail) {
                  if (isCons(var0))
                    return new Fun1<Integer, Fail<Integer>>() {
                      public Integer apply(Fail<Integer> fail) {
                        T h = consHead(var0);
                        return new Fun1<Integer, Fail<Integer>>() {
                          public Integer apply(Fail<Integer> fail) {
                            list.List<T> t = consTail(var0);
                            return new Fun1<Integer, Fail<Integer>>() {
                              public Integer apply(Fail<Integer> fail) {
                                return 1 + length.apply(t);
                              }
                            }.apply(fail);
                          }
                        }.apply(fail);
                      }
                    }.apply(fail);
                  else return fail.fail();
                }
              }.apply(
                  new Fail<Integer>() {
                    public Integer fail() {
                      return new Fun1<Integer, Fail<Integer>>() {
                        public Integer apply(Fail<Integer> fail) {
                          if (isNil(var0))
                            return new Fun1<Integer, Fail<Integer>>() {
                              public Integer apply(Fail<Integer> fail) {
                                return 0;
                              }
                            }.apply(fail);
                          else return fail.fail();
                        }
                      }.apply(
                          new Fail<Integer>() {
                            public Integer fail() {
                              throw new Error(" case failed.");
                            }
                          });
                    }
                  });
            }
          }.fail();
        }
      }.apply(l);
    }

    public <T> Fun1<Integer, list.List<T>> asFun1() {
      return new Fun1<Integer, list.List<T>>() {
        public Integer apply(list.List<T> var0) {
          return length_.this.apply(var0);
        }
      };
    }
  }

  private static length_ length = new length_();
  private static Cell<Integer> count = new Cell<Integer>(0);
  public static Fun0<Actor> main =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(true) {
                    public Object get(String name) {
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int t) {
                      if (true) {
                        new java.util.function.Supplier<Object>() {
                          public Object get() {
                            List<Integer> l_ = esl.Library.to(0, 100);
                            while (!l_.isNil()) {
                              int i = l_.getHead();
                              l_ = l_.getTail();
                              count.setValue(count.getValue() + 1);
                              length.apply(o);
                            }
                            return null;
                          }
                        }.get();
                        print.apply(
                            "done: "
                                + new Term("Value", 100)
                                + " "
                                + count.getValue()
                                + " "
                                + length.apply(o));
                        stopAll.apply();
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

  public static void main(String[] args) {
    new Test2().main.apply();
  }
}

