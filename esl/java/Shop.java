package esl;

import runtime.data.Term;
import static esl.Library.*;
import static esl.Displays.*;
import static esl.Displays.*;
import list.*;

public class Shop {
  public interface Fail<T> {
    public T fail();
  }

  interface Fun2<T, T0, T1> {
    T apply(T0 x0, T1 x1);
  }

  interface Fun3<T, T0, T1, T2> {
    T apply(T0 x0, T1 x1, T2 x2);
  }

  interface Fun5<T, T0, T1, T2, T3, T4> {
    T apply(T0 x0, T1 x1, T2 x2, T3 x3, T4 x4);
  }

  private static String historyLabel = "d";
  private static int numOfCustomers = 20;
  private static int numOfTills = 5;
  private static int numOfAssistants = 8;
  private static int numOfGangMembers = 0;
  private static int numOfSteps = 40000;
  private static int delay = 1;
  private static Cell<list.List<Actor>> customers = new Cell<list.List<Actor>>(new list.Nil());
  private static Fun1<Term, list.List<Term>> row =
      new Fun1<Term, list.List<Term>>() {
        public Term apply(list.List<Term> ds) {
          return new Term(
              "Row",
              new list.Nil().cons(new Term("Prop", "style", "border: 1px solid black;")),
              ds);
        }
      };
  private static Fun1<Term, Term> tdata =
      new Fun1<Term, TFerm>() {
        public Term apply(Term d) {
          return new Term(
              "Data",
              new list.Nil().cons(new Term("Prop", "style", "border: 1px solid black;")),
              d);
        }
      };
  private static Fun1<Term, Term> rdata =
      new Fun1<Term, Term>() {
        public Term apply(Term d) {
          return new Term(
              "Data",
              new list.Nil()
                  .cons(new Term("Prop", "style", "border: 1px solid black;background-color:red;")),
              d);
        }
      };
  private static Fun1<Term, Term> bdata =
      new Fun1<Term, Term>() {
        public Term apply(Term d) {
          return new Term(
              "Data",
              new list.Nil()
                  .cons(
                      new Term(
                          "Prop", "style", "border: 1px solid black;background-color:lightblue;")),
              d);
        }
      };
  private static Fun0<Actor> displayB =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<list.List<Term>> customers = new Cell<list.List<Term>>(new list.Nil());
                    Fun0<Term> asTable =
                        new Fun0<Term>() {
                          public Term apply() {
                            return new Fun0<Term>() {
                              public Term apply() {
                                Cell<Fun2<list.List<Term>, String, list.List<String>>> states =
                                    new Cell<Fun2<list.List<Term>, String, list.List<String>>>(
                                        null);
                                states.setValue(
                                    new Fun2<list.List<Term>, String, list.List<String>>() {
                                      public list.List<Term> apply(
                                          String current, list.List<String> allStates) {
                                        return new Fun1<list.List<Term>, list.List<String>>() {
                                          public list.List<Term> apply(list.List<String> var0) {
                                            return new Fail<list.List<Term>>() {
                                              public list.List<Term> fail() {
                                                return new Fun1<
                                                    list.List<Term>, Fail<list.List<Term>>>() {
                                                  public list.List<Term> apply(
                                                      Fail<list.List<Term>> fail) {
                                                    if (isNil(var0))
                                                      return new Fun1<
                                                          list.List<Term>,
                                                          Fail<list.List<Term>>>() {
                                                        public list.List<Term> apply(
                                                            Fail<list.List<Term>> fail) {
                                                          return new list.Nil();
                                                        }
                                                      }.apply(fail);
                                                    else return fail.fail();
                                                  }
                                                }.apply(
                                                    new Fail<list.List<Term>>() {
                                                      public list.List<Term> fail() {
                                                        return new Fun1<
                                                            list.List<Term>,
                                                            Fail<list.List<Term>>>() {
                                                          public list.List<Term> apply(
                                                              Fail<list.List<Term>> fail) {
                                                            if (isCons(var0))
                                                              return new Fun1<
                                                                  list.List<Term>,
                                                                  Fail<list.List<Term>>>() {
                                                                public list.List<Term> apply(
                                                                    Fail<list.List<Term>> fail) {
                                                                  String state = consHead(var0);
                                                                  return new Fun1<
                                                                      list.List<Term>,
                                                                      Fail<list.List<Term>>>() {
                                                                    public list.List<Term> apply(
                                                                        Fail<list.List<Term>>
                                                                            fail) {
                                                                      list.List<String> ss =
                                                                          consTail(var0);
                                                                      return new Fun1<
                                                                          list.List<Term>,
                                                                          Fail<list.List<Term>>>() {
                                                                        public list.List<Term>
                                                                            apply(
                                                                                Fail<
                                                                                        list.List<
                                                                                            Term>>
                                                                                    fail) {
                                                                          if (state == current) {
                                                                            return append(
                                                                                new list.Nil()
                                                                                    .cons(
                                                                                        rdata.apply(
                                                                                            new Term(
                                                                                                "HTML",
                                                                                                state
                                                                                                    + ""))),
                                                                                states
                                                                                    .getValue()
                                                                                    .apply(
                                                                                        current,
                                                                                        ss));
                                                                          } else return fail.fail();
                                                                        }
                                                                      }.apply(fail);
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(fail);
                                                            else return fail.fail();
                                                          }
                                                        }.apply(
                                                            new Fail<list.List<Term>>() {
                                                              public list.List<Term> fail() {
                                                                return new Fun1<
                                                                    list.List<Term>,
                                                                    Fail<list.List<Term>>>() {
                                                                  public list.List<Term> apply(
                                                                      Fail<list.List<Term>> fail) {
                                                                    if (isCons(var0))
                                                                      return new Fun1<
                                                                          list.List<Term>,
                                                                          Fail<list.List<Term>>>() {
                                                                        public list.List<Term>
                                                                            apply(
                                                                                Fail<
                                                                                        list.List<
                                                                                            Term>>
                                                                                    fail) {
                                                                          String state =
                                                                              consHead(var0);
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
                                                                              list.List<String> ss =
                                                                                  consTail(var0);
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
                                                                                  return append(
                                                                                      new list.Nil()
                                                                                          .cons(
                                                                                              tdata
                                                                                                  .apply(
                                                                                                      new Term(
                                                                                                          "HTML",
                                                                                                          state
                                                                                                              + ""))),
                                                                                      states
                                                                                          .getValue()
                                                                                          .apply(
                                                                                              current,
                                                                                              ss));
                                                                                }
                                                                              }.apply(fail);
                                                                            }
                                                                          }.apply(fail);
                                                                        }
                                                                      }.apply(fail);
                                                                    else return fail.fail();
                                                                  }
                                                                }.apply(
                                                                    new Fail<list.List<Term>>() {
                                                                      public list.List<Term>
                                                                          fail() {
                                                                        throw new Error(
                                                                            " case failed.");
                                                                      }
                                                                    });
                                                              }
                                                            });
                                                      }
                                                    });
                                              }
                                            }.fail();
                                          }
                                        }.apply(allStates);
                                      }
                                    });
                                Cell<Fun1<list.List<Term>, list.List<Term>>> rows =
                                    new Cell<Fun1<list.List<Term>, list.List<Term>>>(null);
                                rows.setValue(
                                    new Fun1<list.List<Term>, list.List<Term>>() {
                                      public list.List<Term> apply(list.List<Term> cs) {
                                        return new Fun1<list.List<Term>, list.List<Term>>() {
                                          public list.List<Term> apply(list.List<Term> var0) {
                                            return new Fail<list.List<Term>>() {
                                              public list.List<Term> fail() {
                                                return new Fun1<
                                                    list.List<Term>, Fail<list.List<Term>>>() {
                                                  public list.List<Term> apply(
                                                      Fail<list.List<Term>> fail) {
                                                    if (isNil(var0))
                                                      return new Fun1<
                                                          list.List<Term>,
                                                          Fail<list.List<Term>>>() {
                                                        public list.List<Term> apply(
                                                            Fail<list.List<Term>> fail) {
                                                          return new list.Nil();
                                                        }
                                                      }.apply(fail);
                                                    else return fail.fail();
                                                  }
                                                }.apply(
                                                    new Fail<list.List<Term>>() {
                                                      public list.List<Term> fail() {
                                                        return new Fun1<
                                                            list.List<Term>,
                                                            Fail<list.List<Term>>>() {
                                                          public list.List<Term> apply(
                                                              Fail<list.List<Term>> fail) {
                                                            if (isCons(var0))
                                                              return new Fun1<
                                                                  list.List<Term>,
                                                                  Fail<list.List<Term>>>() {
                                                                public list.List<Term> apply(
                                                                    Fail<list.List<Term>> fail) {
                                                                  if (isTerm(
                                                                      consHead(var0), "C", 5))
                                                                    return new Fun1<
                                                                        list.List<Term>,
                                                                        Fail<list.List<Term>>>() {
                                                                      public list.List<Term> apply(
                                                                          Fail<list.List<Term>>
                                                                              fail) {
                                                                        int c =
                                                                            termRef(
                                                                                consHead(var0), 0);
                                                                        return new Fun1<
                                                                            list.List<Term>,
                                                                            Fail<
                                                                                list.List<
                                                                                    Term>>>() {
                                                                          public list.List<Term>
                                                                              apply(
                                                                                  Fail<
                                                                                          list.List<
                                                                                              Term>>
                                                                                      fail) {
                                                                            String s =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    1);
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
                                                                                list.List<String>
                                                                                    ss =
                                                                                        termRef(
                                                                                            consHead(
                                                                                                var0),
                                                                                            2);
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
                                                                                    int sales =
                                                                                        termRef(
                                                                                            consHead(
                                                                                                var0),
                                                                                            3);
                                                                                    return new Fun1<
                                                                                        list.List<
                                                                                            Term>,
                                                                                        Fail<
                                                                                            list
                                                                                                    .List<
                                                                                                Term>>>() {
                                                                                      public list
                                                                                                  .List<
                                                                                              Term>
                                                                                          apply(
                                                                                              Fail<
                                                                                                      list
                                                                                                              .List<
                                                                                                          Term>>
                                                                                                  fail) {
                                                                                        int
                                                                                            walkouts =
                                                                                                termRef(
                                                                                                    consHead(
                                                                                                        var0),
                                                                                                    4);
                                                                                        return new Fun1<
                                                                                            list
                                                                                                    .List<
                                                                                                Term>,
                                                                                            Fail<
                                                                                                list
                                                                                                        .List<
                                                                                                    Term>>>() {
                                                                                          public
                                                                                          list.List<
                                                                                                  Term>
                                                                                              apply(
                                                                                                  Fail<
                                                                                                          list
                                                                                                                  .List<
                                                                                                              Term>>
                                                                                                      fail) {
                                                                                            list
                                                                                                        .List<
                                                                                                    Term>
                                                                                                rest =
                                                                                                    consTail(
                                                                                                        var0);
                                                                                            return new Fun1<
                                                                                                list
                                                                                                        .List<
                                                                                                    Term>,
                                                                                                Fail<
                                                                                                    list
                                                                                                            .List<
                                                                                                        Term>>>() {
                                                                                              public
                                                                                              list
                                                                                                          .List<
                                                                                                      Term>
                                                                                                  apply(
                                                                                                      Fail<
                                                                                                              list
                                                                                                                      .List<
                                                                                                                  Term>>
                                                                                                          fail) {
                                                                                                return append(
                                                                                                    new list
                                                                                                            .Nil()
                                                                                                        .cons(
                                                                                                            row
                                                                                                                .apply(
                                                                                                                    append(
                                                                                                                        new list
                                                                                                                                .Nil()
                                                                                                                            .cons(
                                                                                                                                bdata
                                                                                                                                    .apply(
                                                                                                                                        new Term(
                                                                                                                                            "HTML",
                                                                                                                                            "Customer-"
                                                                                                                                                + c))),
                                                                                                                        append(
                                                                                                                            states
                                                                                                                                .getValue()
                                                                                                                                .apply(
                                                                                                                                    s,
                                                                                                                                    ss),
                                                                                                                            new list
                                                                                                                                    .Nil()
                                                                                                                                .cons(
                                                                                                                                    tdata
                                                                                                                                        .apply(
                                                                                                                                            new Term(
                                                                                                                                                "HTML",
                                                                                                                                                "Walkouts = "
                                                                                                                                                    + walkouts)))
                                                                                                                                .cons(
                                                                                                                                    tdata
                                                                                                                                        .apply(
                                                                                                                                            new Term(
                                                                                                                                                "HTML",
                                                                                                                                                "Sales = "
                                                                                                                                                    + sales))))))),
                                                                                                    rows.getValue()
                                                                                                        .apply(
                                                                                                            rest));
                                                                                              }
                                                                                            }.apply(
                                                                                                fail);
                                                                                          }
                                                                                        }.apply(
                                                                                            fail);
                                                                                      }
                                                                                    }.apply(fail);
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  else return fail.fail();
                                                                }
                                                              }.apply(fail);
                                                            else return fail.fail();
                                                          }
                                                        }.apply(
                                                            new Fail<list.List<Term>>() {
                                                              public list.List<Term> fail() {
                                                                throw new Error(" case failed.");
                                                              }
                                                            });
                                                      }
                                                    });
                                              }
                                            }.fail();
                                          }
                                        }.apply(cs);
                                      }
                                    });
                                return new Term(
                                    "Table",
                                    new list.Nil(),
                                    append(
                                        new list.Nil()
                                            .cons(
                                                row.apply(
                                                    new list.Nil()
                                                        .cons(
                                                            tdata.apply(
                                                                new Term(
                                                                    "Table",
                                                                    new list.Nil(),
                                                                    rows.getValue()
                                                                        .apply(
                                                                            customers
                                                                                .getValue())))))),
                                        new list.Nil()
                                            .cons(
                                                row.apply(
                                                    new list.Nil()
                                                        .cons(
                                                            tdata.apply(
                                                                new Term(
                                                                    "HTML",
                                                                    "time = " + now())))))));
                              }
                            }.apply();
                          }
                        };
                    Fun3<list.List<Term>, Integer, String, list.List<Term>> changeState =
                        new Fun3<list.List<Term>, Integer, String, list.List<Term>>() {
                          public list.List<Term> apply(Integer c, String s, list.List<Term> cs) {
                            return new Fun1<list.List<Term>, list.List<Term>>() {
                              public list.List<Term> apply(list.List<Term> var0) {
                                return new Fail<list.List<Term>>() {
                                  public list.List<Term> fail() {
                                    return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                      public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                        if (isNil(var0))
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              return cs;
                                            }
                                          }.apply(fail);
                                        else return fail.fail();
                                      }
                                    }.apply(
                                        new Fail<list.List<Term>>() {
                                          public list.List<Term> fail() {
                                            return new Fun1<
                                                list.List<Term>, Fail<list.List<Term>>>() {
                                              public list.List<Term> apply(
                                                  Fail<list.List<Term>> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<
                                                            list.List<Term>,
                                                            Fail<list.List<Term>>>() {
                                                          public list.List<Term> apply(
                                                              Fail<list.List<Term>> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                list.List<Term>,
                                                                Fail<list.List<Term>>>() {
                                                              public list.List<Term> apply(
                                                                  Fail<list.List<Term>> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    list.List<Term>,
                                                                    Fail<list.List<Term>>>() {
                                                                  public list.List<Term> apply(
                                                                      Fail<list.List<Term>> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        list.List<Term>,
                                                                        Fail<list.List<Term>>>() {
                                                                      public list.List<Term> apply(
                                                                          Fail<list.List<Term>>
                                                                              fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            list.List<Term>,
                                                                            Fail<
                                                                                list.List<
                                                                                    Term>>>() {
                                                                          public list.List<Term>
                                                                              apply(
                                                                                  Fail<
                                                                                          list.List<
                                                                                              Term>>
                                                                                      fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
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
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
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
                                                                                    if (c1 == c) {
                                                                                      return rest
                                                                                          .cons(
                                                                                              new Term(
                                                                                                  "C",
                                                                                                  c,
                                                                                                  s,
                                                                                                  ss,
                                                                                                  sales,
                                                                                                  walkouts));
                                                                                    } else
                                                                                      return fail
                                                                                          .fail();
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
                                                    }
                                                  }.apply(fail);
                                                else return fail.fail();
                                              }
                                            }.apply(
                                                new Fail<list.List<Term>>() {
                                                  public list.List<Term> fail() {
                                                    return new Fun1<
                                                        list.List<Term>, Fail<list.List<Term>>>() {
                                                      public list.List<Term> apply(
                                                          Fail<list.List<Term>> fail) {
                                                        if (isCons(var0))
                                                          return new Fun1<
                                                              list.List<Term>,
                                                              Fail<list.List<Term>>>() {
                                                            public list.List<Term> apply(
                                                                Fail<list.List<Term>> fail) {
                                                              Term c1 = consHead(var0);
                                                              return new Fun1<
                                                                  list.List<Term>,
                                                                  Fail<list.List<Term>>>() {
                                                                public list.List<Term> apply(
                                                                    Fail<list.List<Term>> fail) {
                                                                  list.List<Term> rest =
                                                                      consTail(var0);
                                                                  return new Fun1<
                                                                      list.List<Term>,
                                                                      Fail<list.List<Term>>>() {
                                                                    public list.List<Term> apply(
                                                                        Fail<list.List<Term>>
                                                                            fail) {
                                                                      return changeState
                                                                          .apply(c, s, rest)
                                                                          .cons(c1);
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(fail);
                                                            }
                                                          }.apply(fail);
                                                        else return fail.fail();
                                                      }
                                                    }.apply(
                                                        new Fail<list.List<Term>>() {
                                                          public list.List<Term> fail() {
                                                            throw new Error(" case failed.");
                                                          }
                                                        });
                                                  }
                                                });
                                          }
                                        });
                                  }
                                }.fail();
                              }
                            }.apply(cs);
                          }
                        };
                    Fun1<Integer, list.List<Term>> getSales =
                        new Fun1<Integer, list.List<Term>>() {
                          public Integer apply(list.List<Term> cs) {
                            return new Fun1<Integer, list.List<Term>>() {
                              public Integer apply(list.List<Term> var0) {
                                return new Fail<Integer>() {
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
                                            return new Fun1<Integer, Fail<Integer>>() {
                                              public Integer apply(Fail<Integer> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<Integer, Fail<Integer>>() {
                                                    public Integer apply(Fail<Integer> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<Integer, Fail<Integer>>() {
                                                          public Integer apply(Fail<Integer> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                Integer, Fail<Integer>>() {
                                                              public Integer apply(
                                                                  Fail<Integer> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    Integer, Fail<Integer>>() {
                                                                  public Integer apply(
                                                                      Fail<Integer> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        Integer, Fail<Integer>>() {
                                                                      public Integer apply(
                                                                          Fail<Integer> fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            Integer,
                                                                            Fail<Integer>>() {
                                                                          public Integer apply(
                                                                              Fail<Integer> fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
                                                                            return new Fun1<
                                                                                Integer,
                                                                                Fail<Integer>>() {
                                                                              public Integer apply(
                                                                                  Fail<Integer>
                                                                                      fail) {
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
                                                                                return new Fun1<
                                                                                    Integer,
                                                                                    Fail<
                                                                                        Integer>>() {
                                                                                  public Integer
                                                                                      apply(
                                                                                          Fail<
                                                                                                  Integer>
                                                                                              fail) {
                                                                                    return sales
                                                                                        + getSales
                                                                                            .apply(
                                                                                                rest);
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
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
                            }.apply(cs);
                          }
                        };
                    Fun1<Integer, list.List<Term>> getWalkouts =
                        new Fun1<Integer, list.List<Term>>() {
                          public Integer apply(list.List<Term> cs) {
                            return new Fun1<Integer, list.List<Term>>() {
                              public Integer apply(list.List<Term> var0) {
                                return new Fail<Integer>() {
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
                                            return new Fun1<Integer, Fail<Integer>>() {
                                              public Integer apply(Fail<Integer> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<Integer, Fail<Integer>>() {
                                                    public Integer apply(Fail<Integer> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<Integer, Fail<Integer>>() {
                                                          public Integer apply(Fail<Integer> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                Integer, Fail<Integer>>() {
                                                              public Integer apply(
                                                                  Fail<Integer> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    Integer, Fail<Integer>>() {
                                                                  public Integer apply(
                                                                      Fail<Integer> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        Integer, Fail<Integer>>() {
                                                                      public Integer apply(
                                                                          Fail<Integer> fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            Integer,
                                                                            Fail<Integer>>() {
                                                                          public Integer apply(
                                                                              Fail<Integer> fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
                                                                            return new Fun1<
                                                                                Integer,
                                                                                Fail<Integer>>() {
                                                                              public Integer apply(
                                                                                  Fail<Integer>
                                                                                      fail) {
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
                                                                                return new Fun1<
                                                                                    Integer,
                                                                                    Fail<
                                                                                        Integer>>() {
                                                                                  public Integer
                                                                                      apply(
                                                                                          Fail<
                                                                                                  Integer>
                                                                                              fail) {
                                                                                    return walkouts
                                                                                        + getWalkouts
                                                                                            .apply(
                                                                                                rest);
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
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
                            }.apply(cs);
                          }
                        };
                    Fun1<Integer, list.List<Term>> getEvents =
                        new Fun1<Integer, list.List<Term>>() {
                          public Integer apply(list.List<Term> cs) {
                            return new Fun1<Integer, list.List<Term>>() {
                              public Integer apply(list.List<Term> var0) {
                                return new Fail<Integer>() {
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
                                            return new Fun1<Integer, Fail<Integer>>() {
                                              public Integer apply(Fail<Integer> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<Integer, Fail<Integer>>() {
                                                    public Integer apply(Fail<Integer> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<Integer, Fail<Integer>>() {
                                                          public Integer apply(Fail<Integer> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                Integer, Fail<Integer>>() {
                                                              public Integer apply(
                                                                  Fail<Integer> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    Integer, Fail<Integer>>() {
                                                                  public Integer apply(
                                                                      Fail<Integer> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        Integer, Fail<Integer>>() {
                                                                      public Integer apply(
                                                                          Fail<Integer> fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            Integer,
                                                                            Fail<Integer>>() {
                                                                          public Integer apply(
                                                                              Fail<Integer> fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
                                                                            return new Fun1<
                                                                                Integer,
                                                                                Fail<Integer>>() {
                                                                              public Integer apply(
                                                                                  Fail<Integer>
                                                                                      fail) {
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
                                                                                return new Fun1<
                                                                                    Integer,
                                                                                    Fail<
                                                                                        Integer>>() {
                                                                                  public Integer
                                                                                      apply(
                                                                                          Fail<
                                                                                                  Integer>
                                                                                              fail) {
                                                                                    return walkouts
                                                                                        + sales
                                                                                        + getEvents
                                                                                            .apply(
                                                                                                rest);
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
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
                            }.apply(cs);
                          }
                        };
                    Fun2<list.List<Term>, Integer, list.List<Term>> sale =
                        new Fun2<list.List<Term>, Integer, list.List<Term>>() {
                          public list.List<Term> apply(
                              Integer customer, list.List<Term> customers) {
                            return new Fun1<list.List<Term>, list.List<Term>>() {
                              public list.List<Term> apply(list.List<Term> var0) {
                                return new Fail<list.List<Term>>() {
                                  public list.List<Term> fail() {
                                    return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                      public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                        if (isNil(var0))
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              return customers;
                                            }
                                          }.apply(fail);
                                        else return fail.fail();
                                      }
                                    }.apply(
                                        new Fail<list.List<Term>>() {
                                          public list.List<Term> fail() {
                                            return new Fun1<
                                                list.List<Term>, Fail<list.List<Term>>>() {
                                              public list.List<Term> apply(
                                                  Fail<list.List<Term>> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<
                                                            list.List<Term>,
                                                            Fail<list.List<Term>>>() {
                                                          public list.List<Term> apply(
                                                              Fail<list.List<Term>> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                list.List<Term>,
                                                                Fail<list.List<Term>>>() {
                                                              public list.List<Term> apply(
                                                                  Fail<list.List<Term>> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    list.List<Term>,
                                                                    Fail<list.List<Term>>>() {
                                                                  public list.List<Term> apply(
                                                                      Fail<list.List<Term>> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        list.List<Term>,
                                                                        Fail<list.List<Term>>>() {
                                                                      public list.List<Term> apply(
                                                                          Fail<list.List<Term>>
                                                                              fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            list.List<Term>,
                                                                            Fail<
                                                                                list.List<
                                                                                    Term>>>() {
                                                                          public list.List<Term>
                                                                              apply(
                                                                                  Fail<
                                                                                          list.List<
                                                                                              Term>>
                                                                                      fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
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
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
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
                                                                                    if (c1
                                                                                        == customer) {
                                                                                      return rest
                                                                                          .cons(
                                                                                              new Term(
                                                                                                  "C",
                                                                                                  c1,
                                                                                                  s1,
                                                                                                  ss,
                                                                                                  sales
                                                                                                      + 1,
                                                                                                  walkouts));
                                                                                    } else
                                                                                      return fail
                                                                                          .fail();
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
                                                    }
                                                  }.apply(fail);
                                                else return fail.fail();
                                              }
                                            }.apply(
                                                new Fail<list.List<Term>>() {
                                                  public list.List<Term> fail() {
                                                    return new Fun1<
                                                        list.List<Term>, Fail<list.List<Term>>>() {
                                                      public list.List<Term> apply(
                                                          Fail<list.List<Term>> fail) {
                                                        if (isCons(var0))
                                                          return new Fun1<
                                                              list.List<Term>,
                                                              Fail<list.List<Term>>>() {
                                                            public list.List<Term> apply(
                                                                Fail<list.List<Term>> fail) {
                                                              Term c1 = consHead(var0);
                                                              return new Fun1<
                                                                  list.List<Term>,
                                                                  Fail<list.List<Term>>>() {
                                                                public list.List<Term> apply(
                                                                    Fail<list.List<Term>> fail) {
                                                                  list.List<Term> rest =
                                                                      consTail(var0);
                                                                  return new Fun1<
                                                                      list.List<Term>,
                                                                      Fail<list.List<Term>>>() {
                                                                    public list.List<Term> apply(
                                                                        Fail<list.List<Term>>
                                                                            fail) {
                                                                      return sale.apply(
                                                                              customer, rest)
                                                                          .cons(c1);
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(fail);
                                                            }
                                                          }.apply(fail);
                                                        else return fail.fail();
                                                      }
                                                    }.apply(
                                                        new Fail<list.List<Term>>() {
                                                          public list.List<Term> fail() {
                                                            throw new Error(" case failed.");
                                                          }
                                                        });
                                                  }
                                                });
                                          }
                                        });
                                  }
                                }.fail();
                              }
                            }.apply(customers);
                          }
                        };
                    Fun2<list.List<Term>, Integer, list.List<Term>> timeout =
                        new Fun2<list.List<Term>, Integer, list.List<Term>>() {
                          public list.List<Term> apply(
                              Integer customer, list.List<Term> customers) {
                            return new Fun1<list.List<Term>, list.List<Term>>() {
                              public list.List<Term> apply(list.List<Term> var0) {
                                return new Fail<list.List<Term>>() {
                                  public list.List<Term> fail() {
                                    return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                      public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                        if (isNil(var0))
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              return customers;
                                            }
                                          }.apply(fail);
                                        else return fail.fail();
                                      }
                                    }.apply(
                                        new Fail<list.List<Term>>() {
                                          public list.List<Term> fail() {
                                            return new Fun1<
                                                list.List<Term>, Fail<list.List<Term>>>() {
                                              public list.List<Term> apply(
                                                  Fail<list.List<Term>> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      if (isTerm(consHead(var0), "C", 5))
                                                        return new Fun1<
                                                            list.List<Term>,
                                                            Fail<list.List<Term>>>() {
                                                          public list.List<Term> apply(
                                                              Fail<list.List<Term>> fail) {
                                                            int c1 = termRef(consHead(var0), 0);
                                                            return new Fun1<
                                                                list.List<Term>,
                                                                Fail<list.List<Term>>>() {
                                                              public list.List<Term> apply(
                                                                  Fail<list.List<Term>> fail) {
                                                                String s1 =
                                                                    termRef(consHead(var0), 1);
                                                                return new Fun1<
                                                                    list.List<Term>,
                                                                    Fail<list.List<Term>>>() {
                                                                  public list.List<Term> apply(
                                                                      Fail<list.List<Term>> fail) {
                                                                    list.List<String> ss =
                                                                        termRef(consHead(var0), 2);
                                                                    return new Fun1<
                                                                        list.List<Term>,
                                                                        Fail<list.List<Term>>>() {
                                                                      public list.List<Term> apply(
                                                                          Fail<list.List<Term>>
                                                                              fail) {
                                                                        int sales =
                                                                            termRef(
                                                                                consHead(var0), 3);
                                                                        return new Fun1<
                                                                            list.List<Term>,
                                                                            Fail<
                                                                                list.List<
                                                                                    Term>>>() {
                                                                          public list.List<Term>
                                                                              apply(
                                                                                  Fail<
                                                                                          list.List<
                                                                                              Term>>
                                                                                      fail) {
                                                                            int walkouts =
                                                                                termRef(
                                                                                    consHead(var0),
                                                                                    4);
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
                                                                                list.List<Term>
                                                                                    rest =
                                                                                        consTail(
                                                                                            var0);
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
                                                                                    if (c1
                                                                                        == customer) {
                                                                                      return rest
                                                                                          .cons(
                                                                                              new Term(
                                                                                                  "C",
                                                                                                  c1,
                                                                                                  s1,
                                                                                                  ss,
                                                                                                  sales,
                                                                                                  walkouts
                                                                                                      + 1));
                                                                                    } else
                                                                                      return fail
                                                                                          .fail();
                                                                                  }
                                                                                }.apply(fail);
                                                                              }
                                                                            }.apply(fail);
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      else return fail.fail();
                                                    }
                                                  }.apply(fail);
                                                else return fail.fail();
                                              }
                                            }.apply(
                                                new Fail<list.List<Term>>() {
                                                  public list.List<Term> fail() {
                                                    return new Fun1<
                                                        list.List<Term>, Fail<list.List<Term>>>() {
                                                      public list.List<Term> apply(
                                                          Fail<list.List<Term>> fail) {
                                                        if (isCons(var0))
                                                          return new Fun1<
                                                              list.List<Term>,
                                                              Fail<list.List<Term>>>() {
                                                            public list.List<Term> apply(
                                                                Fail<list.List<Term>> fail) {
                                                              Term c1 = consHead(var0);
                                                              return new Fun1<
                                                                  list.List<Term>,
                                                                  Fail<list.List<Term>>>() {
                                                                public list.List<Term> apply(
                                                                    Fail<list.List<Term>> fail) {
                                                                  list.List<Term> rest =
                                                                      consTail(var0);
                                                                  return new Fun1<
                                                                      list.List<Term>,
                                                                      Fail<list.List<Term>>>() {
                                                                    public list.List<Term> apply(
                                                                        Fail<list.List<Term>>
                                                                            fail) {
                                                                      return timeout
                                                                          .apply(customer, rest)
                                                                          .cons(c1);
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(fail);
                                                            }
                                                          }.apply(fail);
                                                        else return fail.fail();
                                                      }
                                                    }.apply(
                                                        new Fail<list.List<Term>>() {
                                                          public list.List<Term> fail() {
                                                            throw new Error(" case failed.");
                                                          }
                                                        });
                                                  }
                                                });
                                          }
                                        });
                                  }
                                }.fail();
                              }
                            }.apply(customers);
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("customers")) return customers.getValue();
                      if (name.equals("asTable")) return asTable;
                      if (name.equals("changeState")) return changeState;
                      if (name.equals("getSales")) return getSales;
                      if (name.equals("getWalkouts")) return getWalkouts;
                      if (name.equals("getEvents")) return getEvents;
                      if (name.equals("sale")) return sale;
                      if (name.equals("timeout")) return timeout;
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
                                  if (isTerm(var0, "ChangeState", 2))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        int c = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            String s = termRef(var0, 1);
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore =
                                                        customers.setValue(
                                                            changeState.apply(
                                                                c, s, customers.getValue()));
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        Cell<Integer> events =
                                                            new Cell<Integer>(
                                                                getEvents.apply(
                                                                    customers.getValue()));
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            int sales =
                                                                getSales.apply(
                                                                    customers.getValue());
                                                            int walkouts =
                                                                getWalkouts.apply(
                                                                    customers.getValue());
                                                            if (events.getValue() == 0) {
                                                              events.setValue(1);
                                                            } else {
                                                              {
                                                              }
                                                            }
                                                            return sendEDB(
                                                                new Term(
                                                                    "Show",
                                                                    "customers",
                                                                    new Term(
                                                                        "Table",
                                                                        new list.Nil(),
                                                                        new list.Nil()
                                                                            .cons(
                                                                                new Term(
                                                                                    "Row",
                                                                                    new list.Nil(),
                                                                                    new list.Nil()
                                                                                        .cons(
                                                                                            new Term(
                                                                                                "Data",
                                                                                                new list
                                                                                                    .Nil(),
                                                                                                new Term(
                                                                                                    "Pie",
                                                                                                    new list
                                                                                                        .Nil(),
                                                                                                    "Satisfaction",
                                                                                                    500,
                                                                                                    300,
                                                                                                    new list
                                                                                                            .Nil()
                                                                                                        .cons(
                                                                                                            new Term(
                                                                                                                "Slice",
                                                                                                                new list
                                                                                                                    .Nil(),
                                                                                                                "unsatisfied",
                                                                                                                ((walkouts)
                                                                                                                        * (100))
                                                                                                                    / (events
                                                                                                                        .getValue())))
                                                                                                        .cons(
                                                                                                            new Term(
                                                                                                                "Slice",
                                                                                                                new list
                                                                                                                    .Nil(),
                                                                                                                "satisfied",
                                                                                                                ((sales)
                                                                                                                        * (100))
                                                                                                                    / (events
                                                                                                                        .getValue()))))))
                                                                                        .cons(
                                                                                            new Term(
                                                                                                "Data",
                                                                                                new list
                                                                                                    .Nil(),
                                                                                                new Term(
                                                                                                    "HTML",
                                                                                                    ""
                                                                                                        + now()))))))));
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply();
                                                  }
                                                }.apply();
                                              }
                                            }.apply(fail);
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
                                          if (isTerm(var0, "Sale", 1))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                int c = termRef(var0, 0);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    return customers.setValue(
                                                        sale.apply(c, customers.getValue()));
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
                                                  if (isTerm(var0, "TimeOut", 1))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        int c = termRef(var0, 0);
                                                        return new Fun1<Object, Fail<Object>>() {
                                                          public Object apply(Fail<Object> fail) {
                                                            return customers.setValue(
                                                                timeout.apply(
                                                                    c, customers.getValue()));
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
                                                          if (isTerm(var0, "RegisterCustomer", 3))
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                int c = termRef(var0, 0);
                                                                return new Fun1<
                                                                    Object, Fail<Object>>() {
                                                                  public Object apply(
                                                                      Fail<Object> fail) {
                                                                    String state = termRef(var0, 1);
                                                                    return new Fun1<
                                                                        Object, Fail<Object>>() {
                                                                      public Object apply(
                                                                          Fail<Object> fail) {
                                                                        list.List<String> states =
                                                                            termRef(var0, 2);
                                                                        return new Fun1<
                                                                            Object,
                                                                            Fail<Object>>() {
                                                                          public Object apply(
                                                                              Fail<Object> fail) {
                                                                            return customers
                                                                                .setValue(
                                                                                    append(
                                                                                        customers
                                                                                            .getValue(),
                                                                                        new list
                                                                                                .Nil()
                                                                                            .cons(
                                                                                                new Term(
                                                                                                    "C",
                                                                                                    c,
                                                                                                    state,
                                                                                                    states,
                                                                                                    0,
                                                                                                    0))));
                                                                          }
                                                                        }.apply(fail);
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
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
  private static Actor display = displayB.apply();
  private static Fun1<Actor, Actor> assistant =
      new Fun1<Actor, Actor>() {
        public Actor apply(Actor tills) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    int probOfSelling = 50;
                    int probOfAttendingCustomer = 50;
                    Cell<Term> state = new Cell<Term>(new Term("OnFloor"));
                    int adviceDuration = 100;
                    Cell<Integer> counter = new Cell<Integer>(0);
                    Cell<Actor> advising = new Cell<Actor>(null);
                    Fun1<Actor, list.List<Actor>> customerSeeksHelp =
                        new Fun1<Actor, list.List<Actor>>() {
                          public Actor apply(list.List<Actor> cs) {
                            return new Fun1<Actor, list.List<Actor>>() {
                              public Actor apply(list.List<Actor> var0) {
                                return new Fail<Actor>() {
                                  public Actor fail() {
                                    return new Fun1<Actor, Fail<Actor>>() {
                                      public Actor apply(Fail<Actor> fail) {
                                        if (isNil(var0))
                                          return new Fun1<Actor, Fail<Actor>>() {
                                            public Actor apply(Fail<Actor> fail) {
                                              return null;
                                            }
                                          }.apply(fail);
                                        else return fail.fail();
                                      }
                                    }.apply(
                                        new Fail<Actor>() {
                                          public Actor fail() {
                                            return new Fun1<Actor, Fail<Actor>>() {
                                              public Actor apply(Fail<Actor> fail) {
                                                if (isCons(var0))
                                                  return new Fun1<Actor, Fail<Actor>>() {
                                                    public Actor apply(Fail<Actor> fail) {
                                                      Actor c = consHead(var0);
                                                      return new Fun1<Actor, Fail<Actor>>() {
                                                        public Actor apply(Fail<Actor> fail) {
                                                          list.List<Actor> cc = consTail(var0);
                                                          return new Fun1<Actor, Fail<Actor>>() {
                                                            public Actor apply(Fail<Actor> fail) {
                                                              if (eql(
                                                                  ((Term) c.get("state")),
                                                                  new Term("SeekingHelp"))) {
                                                                return c;
                                                              } else return fail.fail();
                                                            }
                                                          }.apply(fail);
                                                        }
                                                      }.apply(fail);
                                                    }
                                                  }.apply(fail);
                                                else return fail.fail();
                                              }
                                            }.apply(
                                                new Fail<Actor>() {
                                                  public Actor fail() {
                                                    return new Fun1<Actor, Fail<Actor>>() {
                                                      public Actor apply(Fail<Actor> fail) {
                                                        if (isCons(var0))
                                                          return new Fun1<Actor, Fail<Actor>>() {
                                                            public Actor apply(Fail<Actor> fail) {
                                                              Actor c = consHead(var0);
                                                              return new Fun1<
                                                                  Actor, Fail<Actor>>() {
                                                                public Actor apply(
                                                                    Fail<Actor> fail) {
                                                                  list.List<Actor> cc =
                                                                      consTail(var0);
                                                                  return new Fun1<
                                                                      Actor, Fail<Actor>>() {
                                                                    public Actor apply(
                                                                        Fail<Actor> fail) {
                                                                      return customerSeeksHelp
                                                                          .apply(cc);
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(fail);
                                                            }
                                                          }.apply(fail);
                                                        else return fail.fail();
                                                      }
                                                    }.apply(
                                                        new Fail<Actor>() {
                                                          public Actor fail() {
                                                            throw new Error(" case failed.");
                                                          }
                                                        });
                                                  }
                                                });
                                          }
                                        });
                                  }
                                }.fail();
                              }
                            }.apply(cs);
                          }
                        };
                    Fun1<Object, Actor> help =
                        new Fun1<Object, Actor>() {
                          public Object apply(Actor c) {
                            return new Fun0<Object>() {
                              public Object apply() {
                                synchronized (c) {
                                  if (eql(((Term) c.get("state")), new Term("SeekingHelp"))) {
                                    ((Fun0<Object>) c.get("help")).apply();
                                    state.setValue(new Term("Helping"));
                                    advising.setValue(c);
                                    counter.setValue(0);
                                    return wait.apply(delay);
                                  } else {
                                    return null;
                                  }
                                }
                              }
                            }.apply();
                          }
                        };
                    Fun0<Object> goTill =
                        new Fun0<Object>() {
                          public Object apply() {
                            tills.send(new Term("Attend", self));
                            state.setValue(new Term("GoTill"));
                            return wait.apply(delay);
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("probOfSelling")) return probOfSelling;
                      if (name.equals("probOfAttendingCustomer")) return probOfAttendingCustomer;
                      if (name.equals("state")) return state.getValue();
                      if (name.equals("adviceDuration")) return adviceDuration;
                      if (name.equals("counter")) return counter.getValue();
                      if (name.equals("advising")) return advising.getValue();
                      if (name.equals("customerSeeksHelp")) return customerSeeksHelp;
                      if (name.equals("help")) return help;
                      if (name.equals("goTill")) return goTill;
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if ((eql(state.getValue(), new Term("OnFloor")))
                                          && ((customerSeeksHelp.apply(customers.getValue()))
                                              != (null))) {
                                        return (esl.Library.probably(probOfAttendingCustomer)
                                            ? (new Fun0<Object>() {
                                              public Object apply() {
                                                Actor c =
                                                    customerSeeksHelp.apply(customers.getValue());
                                                if ((c) != (null)) {
                                                  return help.apply(c);
                                                } else {
                                                  return goTill.apply();
                                                }
                                              }
                                            }.apply())
                                            : (goTill.apply()));
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              if (eql(state.getValue(), new Term("OnFloor"))) {
                                                return (esl.Library.probably(probOfSelling)
                                                    ? (goTill.apply())
                                                    : (null));
                                              } else return fail.fail();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  int n = var0;
                                                  return new Fun1<Object, Fail<Object>>() {
                                                    public Object apply(Fail<Object> fail) {
                                                      if ((eql(
                                                              state.getValue(),
                                                              new Term("Helping")))
                                                          && ((counter.getValue())
                                                              < (adviceDuration))) {
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                counter.setValue(
                                                                    counter.getValue() + 1);
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
                                                      } else return fail.fail();
                                                    }
                                                  }.apply(fail);
                                                }
                                              }.apply(
                                                  new Fail<Object>() {
                                                    public Object fail() {
                                                      return new Fun1<Object, Fail<Object>>() {
                                                        public Object apply(Fail<Object> fail) {
                                                          int n = var0;
                                                          return new Fun1<Object, Fail<Object>>() {
                                                            public Object apply(Fail<Object> fail) {
                                                              if ((eql(
                                                                      state.getValue(),
                                                                      new Term("Helping")))
                                                                  && (counter.getValue()
                                                                      == adviceDuration)) {
                                                                return new Fun0<Object>() {
                                                                  public Object apply() {
                                                                    Object ignore =
                                                                        state.setValue(
                                                                            new Term("OnFloor"));
                                                                    return new Fun0<Object>() {
                                                                      public Object apply() {
                                                                        Object ignore =
                                                                            advising
                                                                                .getValue()
                                                                                .send(
                                                                                    new Term(
                                                                                        "Helped"));
                                                                        return new Fun0<Object>() {
                                                                          public Object apply() {
                                                                            Object ignore =
                                                                                advising.setValue(
                                                                                    null);
                                                                            return wait.apply(
                                                                                delay);
                                                                          }
                                                                        }.apply();
                                                                      }
                                                                    }.apply();
                                                                  }
                                                                }.apply();
                                                              } else return fail.fail();
                                                            }
                                                          }.apply(fail);
                                                        }
                                                      }.apply(
                                                          new Fail<Object>() {
                                                            public Object fail() {
                                                              return new Fun1<
                                                                  Object, Fail<Object>>() {
                                                                public Object apply(
                                                                    Fail<Object> fail) {
                                                                  int n = var0;
                                                                  return new Fun1<
                                                                      Object, Fail<Object>>() {
                                                                    public Object apply(
                                                                        Fail<Object> fail) {
                                                                      return null;
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(
                                                                  new Fail<Object>() {
                                                                    public Object fail() {
                                                                      throw new Error(
                                                                          " case failed.");
                                                                    }
                                                                  });
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
                      }.apply(time_);
                    }

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "NoTillFound", 0))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = state.setValue(new Term("OnFloor"));
                                            return wait.apply(delay);
                                          }
                                        }.apply();
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "Attending", 1))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                int id = termRef(var0, 0);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            state.setValue(new Term("AtTill"));
                                                        return wait.apply(delay);
                                                      }
                                                    }.apply();
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
                                                  if (isTerm(var0, "ReturnToFloor", 0))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                state.setValue(new Term("OnFloor"));
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun2<Actor, Integer, Actor> customer =
      new Fun2<Actor, Integer, Actor>() {
        public Actor apply(Integer id, Actor tills) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Term> state = new Cell<Term>(new Term("NotInShop"));
                    int probOfEnteringShop = 30;
                    int probOfBuying = 20;
                    int probOfSeekingHelp = 30;
                    int salesTime = 50;
                    int waitLimit = 100;
                    Cell<Integer> counter = new Cell<Integer>(0);
                    Fun0<Object> help =
                        new Fun0<Object>() {
                          public Object apply() {
                            state.setValue(new Term("GettingHelp"));
                            wait.apply(delay);
                            return display.send(new Term("ChangeState", id, "GettingHelp"));
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("state")) return state.getValue();
                      if (name.equals("probOfEnteringShop")) return probOfEnteringShop;
                      if (name.equals("probOfBuying")) return probOfBuying;
                      if (name.equals("probOfSeekingHelp")) return probOfSeekingHelp;
                      if (name.equals("salesTime")) return salesTime;
                      if (name.equals("waitLimit")) return waitLimit;
                      if (name.equals("counter")) return counter.getValue();
                      if (name.equals("help")) return help;
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if (eql(state.getValue(), new Term("NotInShop"))) {
                                        return (esl.Library.probably(probOfEnteringShop)
                                            ? (new Fun0<Object>() {
                                              public Object apply() {
                                                Object ignore =
                                                    display.send(
                                                        new Term("ChangeState", id, "Browsing"));
                                                return new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore =
                                                        state.setValue(new Term("Browsing"));
                                                    return wait.apply(delay);
                                                  }
                                                }.apply();
                                              }
                                            }.apply())
                                            : (null));
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              if (eql(state.getValue(), new Term("Browsing"))) {
                                                return (esl.Library.probably(probOfSeekingHelp)
                                                    ? (new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            display.send(
                                                                new Term(
                                                                    "ChangeState",
                                                                    id,
                                                                    "SeekingHelp"));
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                state.setValue(
                                                                    new Term("SeekingHelp"));
                                                            return new Fun0<Object>() {
                                                              public Object apply() {
                                                                Object ignore = wait.apply(delay);
                                                                return counter.setValue(0);
                                                              }
                                                            }.apply();
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply())
                                                    : (null));
                                              } else return fail.fail();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  int n = var0;
                                                  return new Fun1<Object, Fail<Object>>() {
                                                    public Object apply(Fail<Object> fail) {
                                                      if ((eql(
                                                              state.getValue(),
                                                              new Term("SeekingHelp")))
                                                          && ((counter.getValue()) < (waitLimit))) {
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                counter.setValue(
                                                                    counter.getValue() + 1);
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
                                                      } else return fail.fail();
                                                    }
                                                  }.apply(fail);
                                                }
                                              }.apply(
                                                  new Fail<Object>() {
                                                    public Object fail() {
                                                      return new Fun1<Object, Fail<Object>>() {
                                                        public Object apply(Fail<Object> fail) {
                                                          int n = var0;
                                                          return new Fun1<Object, Fail<Object>>() {
                                                            public Object apply(Fail<Object> fail) {
                                                              if ((eql(
                                                                      state.getValue(),
                                                                      new Term("SeekingHelp")))
                                                                  && (counter.getValue()
                                                                      == waitLimit)) {
                                                                return new Fun0<Object>() {
                                                                  public Object apply() {
                                                                    Object ignore =
                                                                        display.send(
                                                                            new Term(
                                                                                "TimeOut", id));
                                                                    return new Fun0<Object>() {
                                                                      public Object apply() {
                                                                        Object ignore =
                                                                            display.send(
                                                                                new Term(
                                                                                    "ChangeState",
                                                                                    id,
                                                                                    "NotInShop"));
                                                                        return new Fun0<Object>() {
                                                                          public Object apply() {
                                                                            Object ignore =
                                                                                state.setValue(
                                                                                    new Term(
                                                                                        "NotInShop"));
                                                                            return wait.apply(
                                                                                delay);
                                                                          }
                                                                        }.apply();
                                                                      }
                                                                    }.apply();
                                                                  }
                                                                }.apply();
                                                              } else return fail.fail();
                                                            }
                                                          }.apply(fail);
                                                        }
                                                      }.apply(
                                                          new Fail<Object>() {
                                                            public Object fail() {
                                                              return new Fun1<
                                                                  Object, Fail<Object>>() {
                                                                public Object apply(
                                                                    Fail<Object> fail) {
                                                                  int n = var0;
                                                                  return new Fun1<
                                                                      Object, Fail<Object>>() {
                                                                    public Object apply(
                                                                        Fail<Object> fail) {
                                                                      if (eql(
                                                                          state.getValue(),
                                                                          new Term("Browsing"))) {
                                                                        return (esl.Library
                                                                                .probably(
                                                                                    probOfBuying)
                                                                            ? (new Fun0<Object>() {
                                                                              public Object
                                                                                  apply() {
                                                                                int till =
                                                                                    random.apply(
                                                                                        numOfTills);
                                                                                display.send(
                                                                                    new Term(
                                                                                        "ChangeState",
                                                                                        id,
                                                                                        "Queueing"));
                                                                                state.setValue(
                                                                                    new Term(
                                                                                        "Queuing"));
                                                                                tills.send(
                                                                                    new Term(
                                                                                        "Queue",
                                                                                        self, till,
                                                                                        now(),
                                                                                        salesTime,
                                                                                        waitLimit));
                                                                                return wait.apply(
                                                                                    delay);
                                                                              }
                                                                            }.apply())
                                                                            : (null));
                                                                      } else return fail.fail();
                                                                    }
                                                                  }.apply(fail);
                                                                }
                                                              }.apply(
                                                                  new Fail<Object>() {
                                                                    public Object fail() {
                                                                      return new Fun1<
                                                                          Object, Fail<Object>>() {
                                                                        public Object apply(
                                                                            Fail<Object> fail) {
                                                                          int n = var0;
                                                                          return new Fun1<
                                                                              Object,
                                                                              Fail<Object>>() {
                                                                            public Object apply(
                                                                                Fail<Object> fail) {
                                                                              return null;
                                                                            }
                                                                          }.apply(fail);
                                                                        }
                                                                      }.apply(
                                                                          new Fail<Object>() {
                                                                            public Object fail() {
                                                                              throw new Error(
                                                                                  " case failed.");
                                                                            }
                                                                          });
                                                                    }
                                                                  });
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
                      }.apply(time_);
                    }

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "SaleConcluded", 0))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = display.send(new Term("Sale", id));
                                            return new Fun0<Object>() {
                                              public Object apply() {
                                                Object ignore =
                                                    display.send(
                                                        new Term("ChangeState", id, "NotInShop"));
                                                return new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore =
                                                        state.setValue(new Term("NotInShop"));
                                                    return wait.apply(delay);
                                                  }
                                                }.apply();
                                              }
                                            }.apply();
                                          }
                                        }.apply();
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "SaleTimedOut", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore =
                                                        display.send(new Term("TimeOut", id));
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            display.send(
                                                                new Term(
                                                                    "ChangeState",
                                                                    id,
                                                                    "NotInShop"));
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                state.setValue(
                                                                    new Term("NotInShop"));
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply();
                                                  }
                                                }.apply();
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Helped", 0))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            int till = random.apply(numOfTills);
                                                            display.send(
                                                                new Term(
                                                                    "ChangeState", id, "Queueing"));
                                                            state.setValue(new Term("Queuing"));
                                                            tills.send(
                                                                new Term(
                                                                    "Queue", self, till, now(),
                                                                    salesTime, waitLimit));
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun1<Actor, Integer> leader =
      new Fun1<Actor, Integer>() {
        public Actor apply(Integer size) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Boolean> ready = new Cell<Boolean>(false);
                    Cell<Integer> counter = new Cell<Integer>(0);
                    Cell<Term> state = new Cell<Term>(new Term("NotInShop"));
                    int probOfRaid = 10;

                    public Object get(String name) {
                      if (name.equals("ready")) return ready.getValue();
                      if (name.equals("counter")) return counter.getValue();
                      if (name.equals("state")) return state.getValue();
                      if (name.equals("probOfRaid")) return probOfRaid;
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if (((!(ready.getValue()))) && (counter.getValue() == 0)) {
                                        return (esl.Library.probably(probOfRaid)
                                            ? (ready.setValue(true))
                                            : (null));
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              return null;
                                            }
                                          }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(time_);
                    }

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "OccupyingAssistant", 1))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        Actor c = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            return new Fun0<Object>() {
                                              public Object apply() {
                                                Object ignore =
                                                    counter.setValue(counter.getValue() + 1);
                                                return (counter.getValue() == size)
                                                    ? new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            state.setValue(new Term("NotInShop"));
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore = wait.apply(delay);
                                                            return ready.setValue(false);
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply()
                                                    : null;
                                              }
                                            }.apply();
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
                                          if (isTerm(var0, "Leave", 1))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                Actor c = termRef(var0, 0);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            counter.setValue(
                                                                (counter.getValue()) - (1));
                                                        return (counter.getValue() == 0)
                                                            ? new Fun0<Object>() {
                                                              public Object apply() {
                                                                Object ignore =
                                                                    state.setValue(
                                                                        new Term("NotInShop"));
                                                                return new Fun0<Object>() {
                                                                  public Object apply() {
                                                                    Object ignore =
                                                                        wait.apply(delay);
                                                                    return ready.setValue(false);
                                                                  }
                                                                }.apply();
                                                              }
                                                            }.apply()
                                                            : null;
                                                      }
                                                    }.apply();
                                                  }
                                                }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun1<Actor, Actor> gangMember =
      new Fun1<Actor, Actor>() {
        public Actor apply(Actor leader) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Term> state = new Cell<Term>(new Term("NotInShop"));
                    int waitLimit = 10;
                    Fun0<Object> help =
                        new Fun0<Object>() {
                          public Object apply() {
                            leader.send(new Term("OccupyingAssistant", self));
                            state.setValue(new Term("GettingHelp"));
                            return wait.apply(delay);
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("state")) return state.getValue();
                      if (name.equals("waitLimit")) return waitLimit;
                      if (name.equals("help")) return help;
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if ((eql(state.getValue(), new Term("NotInShop")))
                                          && (((boolean) leader.get("ready")))) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = state.setValue(new Term("SeekingHelp"));
                                            return wait.apply(delay);
                                          }
                                        }.apply();
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              return null;
                                            }
                                          }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(time_);
                    }

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "SaleConcluded", 0))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        return null;
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "SaleTimedOut", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return null;
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Helped", 0))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                leader.send(
                                                                    new Term("Leave", self));
                                                            return new Fun0<Object>() {
                                                              public Object apply() {
                                                                Object ignore =
                                                                    state.setValue(
                                                                        new Term("NotInShop"));
                                                                return wait.apply(delay);
                                                              }
                                                            }.apply();
                                                          }
                                                        }.apply();
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun0<Actor> noTransactions =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Fun0<Boolean> isEmpty =
                        new Fun0<Boolean>() {
                          public Boolean apply() {
                            return true;
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("isEmpty")) return isEmpty;
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
                                  if (isTerm(var0, "Queue", 4))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        Actor c = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            int tStart = termRef(var0, 1);
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                int tDelay = termRef(var0, 2);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    int tLim = termRef(var0, 3);
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return self.become(
                                                            aTransaction.apply(
                                                                c,
                                                                tStart,
                                                                tDelay,
                                                                tLim,
                                                                noTransactions.apply()));
                                                      }
                                                    }.apply(fail);
                                                  }
                                                }.apply(fail);
                                              }
                                            }.apply(fail);
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
                                          if (isTerm(var0, "Do", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return null;
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Wait", 0))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        return null;
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun5<Actor, Actor, Integer, Integer, Integer, Actor> aTransaction =
      new Fun5<Actor, Actor, Integer, Integer, Integer, Actor>() {
        public Actor apply(Actor c, Integer tStart, Integer tDelay_, Integer tLim_, Actor next) {
          Cell<Integer> tDelay = new Cell<Integer>(tDelay_);
          Cell<Integer> tLim = new Cell<Integer>(tLim_);
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Fun0<Boolean> isEmpty =
                        new Fun0<Boolean>() {
                          public Boolean apply() {
                            return false;
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("isEmpty")) return isEmpty;
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
                                  if (isTerm(var0, "Wait", 0))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        return new Fun0<Actor>() {
                                          public Actor apply() {
                                            Object ignore = next.send(new Term("Wait"));
                                            return new Fun0<Actor>() {
                                              public Actor apply() {
                                                Object ignore =
                                                    tLim.setValue((tLim.getValue()) - (1));
                                                return new Fun0<Actor>() {
                                                  public Actor apply() {
                                                    Object ignore = wait.apply(delay);
                                                    return (tLim.getValue() == 0)
                                                        ? new Fun0<Actor>() {
                                                          public Actor apply() {
                                                            Object ignore =
                                                                c.send(new Term("SaleTimedOut"));
                                                            return self.become(
                                                                transacted.apply(next));
                                                          }
                                                        }.apply()
                                                        : null;
                                                  }
                                                }.apply();
                                              }
                                            }.apply();
                                          }
                                        }.apply();
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "Do", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return new Fun0<Actor>() {
                                                  public Actor apply() {
                                                    Object ignore = next.send(new Term("Wait"));
                                                    return new Fun0<Actor>() {
                                                      public Actor apply() {
                                                        Object ignore =
                                                            tDelay.setValue(
                                                                (tDelay.getValue()) - (1));
                                                        return new Fun0<Actor>() {
                                                          public Actor apply() {
                                                            Object ignore = wait.apply(delay);
                                                            return (tDelay.getValue() == 0)
                                                                ? new Fun0<Actor>() {
                                                                  public Actor apply() {
                                                                    Object ignore =
                                                                        c.send(
                                                                            new Term(
                                                                                "SaleConcluded"));
                                                                    return self.become(
                                                                        transacted.apply(next));
                                                                  }
                                                                }.apply()
                                                                : null;
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply();
                                                  }
                                                }.apply();
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Queue", 4))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        Actor c = termRef(var0, 0);
                                                        return new Fun1<Object, Fail<Object>>() {
                                                          public Object apply(Fail<Object> fail) {
                                                            int tStart = termRef(var0, 1);
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                int tDelay = termRef(var0, 2);
                                                                return new Fun1<
                                                                    Object, Fail<Object>>() {
                                                                  public Object apply(
                                                                      Fail<Object> fail) {
                                                                    int tLim = termRef(var0, 3);
                                                                    return new Fun1<
                                                                        Object, Fail<Object>>() {
                                                                      public Object apply(
                                                                          Fail<Object> fail) {
                                                                        return next.send(
                                                                            new Term(
                                                                                "Queue", c, tStart,
                                                                                tDelay, tLim));
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun1<Actor, Actor> transacted =
      new Fun1<Actor, Actor>() {
        public Actor apply(Actor next) {
          return new Actor(
                  new BehaviourAdapter(false) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Fun0<Boolean> isEmpty =
                        new Fun0<Boolean>() {
                          public Boolean apply() {
                            return ((Fun0<Boolean>) next.get("isEmpty")).apply();
                          }
                        };

                    public Object get(String name) {
                      if (name.equals("isEmpty")) return isEmpty;
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
                                  if (isTerm(var0, "Do", 0))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        return next.send(new Term("Do"));
                                      }
                                    }.apply(fail);
                                  else return fail.fail();
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          if (isTerm(var0, "Wait", 0))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                return next.send(new Term("Wait"));
                                              }
                                            }.apply(fail);
                                          else return fail.fail();
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  if (isTerm(var0, "Queue", 4))
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        Actor c = termRef(var0, 0);
                                                        return new Fun1<Object, Fail<Object>>() {
                                                          public Object apply(Fail<Object> fail) {
                                                            int tStart = termRef(var0, 1);
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                int tDelay = termRef(var0, 2);
                                                                return new Fun1<
                                                                    Object, Fail<Object>>() {
                                                                  public Object apply(
                                                                      Fail<Object> fail) {
                                                                    int tLim = termRef(var0, 3);
                                                                    return new Fun1<
                                                                        Object, Fail<Object>>() {
                                                                      public Object apply(
                                                                          Fail<Object> fail) {
                                                                        return next.send(
                                                                            new Term(
                                                                                "Queue", c, tStart,
                                                                                tDelay, tLim));
                                                                      }
                                                                    }.apply(fail);
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun0<Actor> noTills =
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
                                  if (isTerm(var0, "Attend", 1))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        Actor a = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            return a.send(new Term("NoTillFound"));
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
                                          if (isTerm(var0, "Queue", 5))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                Actor c = termRef(var0, 0);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    int n = termRef(var0, 1);
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        int tStart = termRef(var0, 2);
                                                        return new Fun1<Object, Fail<Object>>() {
                                                          public Object apply(Fail<Object> fail) {
                                                            int tDelay = termRef(var0, 3);
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                int tLim = termRef(var0, 4);
                                                                return new Fun1<
                                                                    Object, Fail<Object>>() {
                                                                  public Object apply(
                                                                      Fail<Object> fail) {
                                                                    return null;
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      }
                                                    }.apply(fail);
                                                  }
                                                }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(message);
                    }
                  })
              .start();
        }
      };
  private static Fun2<Actor, Integer, Actor> aTill =
      new Fun2<Actor, Integer, Actor>() {
        public Actor apply(Integer id, Actor next) {
          return new Actor(
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Boolean> broken = new Cell<Boolean>(false);
                    Cell<Actor> assistant = new Cell<Actor>(null);
                    int probOfBreaking = 0;
                    Cell<Actor> transactions = new Cell<Actor>(noTransactions.apply());

                    public Object get(String name) {
                      if (name.equals("broken")) return broken.getValue();
                      if (name.equals("assistant")) return assistant.getValue();
                      if (name.equals("probOfBreaking")) return probOfBreaking;
                      if (name.equals("transactions")) return transactions.getValue();
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      return null;
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if (((!(broken.getValue())))
                                          && (((!(eql(assistant.getValue(), null))))
                                              && ((!(((Fun0<Boolean>)
                                                      transactions.getValue().get("isEmpty"))
                                                  .apply()))))) {
                                        return transactions.getValue().send(new Term("Do"));
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              if (((!(eql(assistant.getValue(), null))))
                                                  && (((Fun0<Boolean>)
                                                          transactions.getValue().get("isEmpty"))
                                                      .apply())) {
                                                return new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore =
                                                        transactions.setValue(
                                                            noTransactions.apply());
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        Object ignore =
                                                            assistant
                                                                .getValue()
                                                                .send(new Term("ReturnToFloor"));
                                                        return new Fun0<Object>() {
                                                          public Object apply() {
                                                            Object ignore =
                                                                assistant.setValue(null);
                                                            return wait.apply(delay);
                                                          }
                                                        }.apply();
                                                      }
                                                    }.apply();
                                                  }
                                                }.apply();
                                              } else return fail.fail();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<Object>() {
                                            public Object fail() {
                                              return new Fun1<Object, Fail<Object>>() {
                                                public Object apply(Fail<Object> fail) {
                                                  int n = var0;
                                                  return new Fun1<Object, Fail<Object>>() {
                                                    public Object apply(Fail<Object> fail) {
                                                      return new Fun0<Object>() {
                                                        public Object apply() {
                                                          Object ignore =
                                                              (esl.Library.probably(probOfBreaking)
                                                                  ? (broken.setValue(true))
                                                                  : (null));
                                                          return transactions
                                                              .getValue()
                                                              .send(new Term("Wait"));
                                                        }
                                                      }.apply();
                                                    }
                                                  }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(time_);
                    }

                    public void processMessage(Actor self, Term message) {
                      new Fun1<Object, Term>() {
                        public Object apply(Term var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  if (isTerm(var0, "Attend", 1))
                                    return new Fun1<Object, Fail<Object>>() {
                                      public Object apply(Fail<Object> fail) {
                                        Actor a = termRef(var0, 0);
                                        return new Fun1<Object, Fail<Object>>() {
                                          public Object apply(Fail<Object> fail) {
                                            return ((eql(assistant.getValue(), null))
                                                    && ((!(((Fun0<Boolean>)
                                                            transactions.getValue().get("isEmpty"))
                                                        .apply()))))
                                                ? new Fun0<Object>() {
                                                  public Object apply() {
                                                    Object ignore = assistant.setValue(a);
                                                    return a.send(new Term("Attending", id));
                                                  }
                                                }.apply()
                                                : next.send(new Term("Attend", a));
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
                                          if (isTerm(var0, "Queue", 5))
                                            return new Fun1<Object, Fail<Object>>() {
                                              public Object apply(Fail<Object> fail) {
                                                Actor c = termRef(var0, 0);
                                                return new Fun1<Object, Fail<Object>>() {
                                                  public Object apply(Fail<Object> fail) {
                                                    int till = termRef(var0, 1);
                                                    return new Fun1<Object, Fail<Object>>() {
                                                      public Object apply(Fail<Object> fail) {
                                                        int tStart = termRef(var0, 2);
                                                        return new Fun1<Object, Fail<Object>>() {
                                                          public Object apply(Fail<Object> fail) {
                                                            int tDelay = termRef(var0, 3);
                                                            return new Fun1<
                                                                Object, Fail<Object>>() {
                                                              public Object apply(
                                                                  Fail<Object> fail) {
                                                                int tLim = termRef(var0, 4);
                                                                return new Fun1<
                                                                    Object, Fail<Object>>() {
                                                                  public Object apply(
                                                                      Fail<Object> fail) {
                                                                    return (till == id)
                                                                        ? transactions
                                                                            .getValue()
                                                                            .send(
                                                                                new Term(
                                                                                    "Queue", c,
                                                                                    tStart, tDelay,
                                                                                    tLim))
                                                                        : next.send(
                                                                            new Term(
                                                                                "Queue", c, till,
                                                                                tStart, tDelay,
                                                                                tLim));
                                                                  }
                                                                }.apply(fail);
                                                              }
                                                            }.apply(fail);
                                                          }
                                                        }.apply(fail);
                                                      }
                                                    }.apply(fail);
                                                  }
                                                }.apply(fail);
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
                  new BehaviourAdapter(true) {
                    Actor self;

                    public void setSelf(Actor self) {
                      this.self = self;
                    }

                    Cell<Actor> tills = new Cell<Actor>(null);

                    public Object get(String name) {
                      if (name.equals("tills")) return tills.getValue();
                      throw new Error("no field named " + name);
                    }

                    public Object init() {
                      tills.setValue(noTills.apply());
                      new java.util.function.Supplier<Object>() {
                        public Object get() {
                          List<Integer> l_ = esl.Library.to(0, (numOfTills) - (1));
                          while (!l_.isNil()) {
                            int n = l_.getHead();
                            l_ = l_.getTail();
                            tills.setValue(aTill.apply(n, tills.getValue()));
                          }
                          return null;
                        }
                      }.get();
                      new java.util.function.Supplier<Object>() {
                        public Object get() {
                          List<Integer> l_ = esl.Library.to(0, (numOfCustomers) - (1));
                          while (!l_.isNil()) {
                            int n = l_.getHead();
                            l_ = l_.getTail();
                            customers.setValue(
                                customers.getValue().cons(customer.apply(n, tills.getValue())));
                            display.send(
                                new Term(
                                    "RegisterCustomer",
                                    n,
                                    "NotInShop",
                                    new list.Nil()
                                        .cons("GettingHelp")
                                        .cons("SeekingHelp")
                                        .cons("Browsing")
                                        .cons("Queueing")
                                        .cons("NotInShop")));
                          }
                          return null;
                        }
                      }.get();
                      new java.util.function.Supplier<Object>() {
                        public Object get() {
                          List<Integer> l_ = esl.Library.to(0, (numOfAssistants) - (1));
                          while (!l_.isNil()) {
                            int n = l_.getHead();
                            l_ = l_.getTail();
                            assistant.apply(tills.getValue());
                          }
                          return null;
                        }
                      }.get();
                      return new Fun0<Object>() {
                        public Object apply() {
                          Actor g = leader.apply(numOfGangMembers);
                          return new java.util.function.Supplier<Object>() {
                            public Object get() {
                              List<Integer> l_ = esl.Library.to(1, numOfGangMembers);
                              while (!l_.isNil()) {
                                int n = l_.getHead();
                                l_ = l_.getTail();
                                customers.setValue(customers.getValue().cons(gangMember.apply(g)));
                              }
                              return null;
                            }
                          }.get();
                        }
                      }.apply();
                    }

                    public void processTime(Actor self, int time_) {
                      new Fun1<Object, Integer>() {
                        public Object apply(Integer var0) {
                          return new Fail<Object>() {
                            public Object fail() {
                              return new Fun1<Object, Fail<Object>>() {
                                public Object apply(Fail<Object> fail) {
                                  int n = var0;
                                  return new Fun1<Object, Fail<Object>>() {
                                    public Object apply(Fail<Object> fail) {
                                      if ((n) > (numOfSteps)) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = print.apply("Shopped " + n);
                                            return stopAll.apply();
                                          }
                                        }.apply();
                                      } else return fail.fail();
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<Object>() {
                                    public Object fail() {
                                      return new Fun1<Object, Fail<Object>>() {
                                        public Object apply(Fail<Object> fail) {
                                          int n = var0;
                                          return new Fun1<Object, Fail<Object>>() {
                                            public Object apply(Fail<Object> fail) {
                                              return wait.apply(delay);
                                            }
                                          }.apply(fail);
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
                          }.fail();
                        }
                      }.apply(time_);
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
    new Shop().main.apply();
  }
}

