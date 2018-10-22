package esl;

import runtime.data.Term;
import static esl.Library.*;
import static esl.Lists.*;
import static esl.Lists.*;
import static esl.Displays.*;
import static esl.Displays.*;
import list.*;

public class Philosophers {
  public interface Fail<T> {
    public T fail();
  }

  interface Fun2<T, T0, T1> {
    T apply(T0 x0, T1 x1);
  }

  interface Fun3<T, T0, T1, T2> {
    T apply(T0 x0, T1 x1, T2 x2);
  }

  interface Fun4<T, T0, T1, T2, T3> {
    T apply(T0 x0, T1 x1, T2 x2, T3 x3);
  }

  interface Fun6<T, T0, T1, T2, T3, T4, T5> {
    T apply(T0 x0, T1 x1, T2 x2, T3 x3, T4 x4, T5 x5);
  }

  private static int timeLimit = 2000;
  private static boolean canDeadlock = true;
  private static int numberOfPhilosophers = 40;
  private static int eatTime = 50;
  private static int thinkTime = 50;
  private static int pictureWidth = 1000;
  private static int pictureHeight = 1000;
  private static int centreX = 500;
  private static int centreY = 250;
  private static int chopstickRadius = 100;
  private static int philosopherRadius = 200;
  private static int philosopherWidth = 40;
  private static int philosopherHeight = 40;
  private static Cell<list.List<Term>> history = new Cell<list.List<Term>>(new list.Nil());
  private static String eatingIcon =
      "http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png";
  private static String thinkingIcon =
      "http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png";
  private static String redLine =
      "stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);";
  private static String unfilled = "stroke:black; fill-opacity:0;";
  private static String filled = "";
  private static Fun1<Integer, Term> pointX =
      new Fun1<Integer, Term>() {
        public Integer apply(Term p) {
          return new Fun1<Integer, Term>() {
            public Integer apply(Term var0) {
              return new Fail<Integer>() {
                public Integer fail() {
                  return new Fun1<Integer, Fail<Integer>>() {
                    public Integer apply(Fail<Integer> fail) {
                      if (isTerm(var0, "Point", 2))
                        return new Fun1<Integer, Fail<Integer>>() {
                          public Integer apply(Fail<Integer> fail) {
                            int x = termRef(var0, 0);
                            return new Fun1<Integer, Fail<Integer>>() {
                              public Integer apply(Fail<Integer> fail) {
                                int y = termRef(var0, 1);
                                return new Fun1<Integer, Fail<Integer>>() {
                                  public Integer apply(Fail<Integer> fail) {
                                    return x;
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
                          throw new Error(" case failed.");
                        }
                      });
                }
              }.fail();
            }
          }.apply(p);
        }
      };
  private static Fun1<Integer, Term> pointY =
      new Fun1<Integer, Term>() {
        public Integer apply(Term p) {
          return new Fun1<Integer, Term>() {
            public Integer apply(Term var0) {
              return new Fail<Integer>() {
                public Integer fail() {
                  return new Fun1<Integer, Fail<Integer>>() {
                    public Integer apply(Fail<Integer> fail) {
                      if (isTerm(var0, "Point", 2))
                        return new Fun1<Integer, Fail<Integer>>() {
                          public Integer apply(Fail<Integer> fail) {
                            int x = termRef(var0, 0);
                            return new Fun1<Integer, Fail<Integer>>() {
                              public Integer apply(Fail<Integer> fail) {
                                int y = termRef(var0, 1);
                                return new Fun1<Integer, Fail<Integer>>() {
                                  public Integer apply(Fail<Integer> fail) {
                                    return y;
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
                          throw new Error(" case failed.");
                        }
                      });
                }
              }.fail();
            }
          }.apply(p);
        }
      };
  private static Fun1<list.List<Term>, list.List<Term>> toPictures =
      new Fun1<list.List<Term>, list.List<Term>>() {
        public list.List<Term> apply(list.List<Term> filmstrip) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isNil(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            return new list.Nil();
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<list.List<Term>>() {
                        public list.List<Term> fail() {
                          return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                            public list.List<Term> apply(Fail<list.List<Term>> fail) {
                              if (isCons(var0))
                                return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                  public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                    Term s = consHead(var0);
                                    return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                      public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                        list.List<Term> fs = consTail(var0);
                                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                            return toPictures.apply(fs).cons(toPicture.apply(s));
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
              }.fail();
            }
          }.apply(filmstrip);
        }
      };
  private static Fun1<Term, Term> toPicture =
      new Fun1<Term, Term>() {
        public Term apply(Term s) {
          return new Fun1<Term, Term>() {
            public Term apply(Term var0) {
              return new Fail<Term>() {
                public Term fail() {
                  return new Fun1<Term, Fail<Term>>() {
                    public Term apply(Fail<Term> fail) {
                      if (isTerm(var0, "Snapshot", 2))
                        return new Fun1<Term, Fail<Term>>() {
                          public Term apply(Fail<Term> fail) {
                            list.List<Term> holds = termRef(var0, 0);
                            return new Fun1<Term, Fail<Term>>() {
                              public Term apply(Fail<Term> fail) {
                                list.List<Actor> free = termRef(var0, 1);
                                return new Fun1<Term, Fail<Term>>() {
                                  public Term apply(Fail<Term> fail) {
                                    return new Term(
                                        "Picture",
                                        pictureWidth,
                                        pictureHeight,
                                        append(
                                            toCircles.apply(0, chopsticks, holds, free),
                                            toPhils.apply(0, holds)));
                                  }
                                }.apply(fail);
                              }
                            }.apply(fail);
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<Term>() {
                        public Term fail() {
                          throw new Error(" case failed.");
                        }
                      });
                }
              }.fail();
            }
          }.apply(s);
        }
      };
  private static Fun2<list.List<Term>, Integer, list.List<Term>> toPhils =
      new Fun2<list.List<Term>, Integer, list.List<Term>>() {
        public list.List<Term> apply(Integer i, list.List<Term> holds) {
          if (i == numberOfPhilosophers) {
            return new list.Nil();
          } else {
            return new Fun0<list.List<Term>>() {
              public list.List<Term> apply() {
                Actor left = chopsticks.nth(i);
                Actor right = chopsticks.nth((i + 1) % (numberOfPhilosophers));
                list.List<Actor> holding = getHolding.apply(i, holds);
                int angle = (360) / (numberOfPhilosophers);
                return new Fun0<list.List<Term>>() {
                  public list.List<Term> apply() {
                    Term leftPoint = circlePos(centreX, centreY, chopstickRadius, (angle) * (i));
                    Term rightPoint =
                        circlePos(centreX, centreY, chopstickRadius, (angle) * (i + 1));
                    boolean holdingLeft = member.apply(left, holding);
                    boolean holdingRight = member.apply(right, holding);
                    Term linePoint =
                        circlePos(
                            centreX,
                            centreY,
                            (philosopherRadius) - (50),
                            (angle) * (i) + (angle) / (2));
                    Term philPoint =
                        circlePos(
                            centreX,
                            centreY,
                            (philosopherRadius) - (30),
                            (angle) * (i) + (angle) / (2));
                    return append(
                        toPhil.apply(
                            philPoint, linePoint, leftPoint, rightPoint, holdingLeft, holdingRight),
                        toPhils.apply(i + 1, holds));
                  }
                }.apply();
              }
            }.apply();
          }
        }
      };
  private static Fun6<list.List<Term>, Term, Term, Term, Term, Boolean, Boolean> toPhil =
      new Fun6<list.List<Term>, Term, Term, Term, Term, Boolean, Boolean>() {
        public list.List<Term> apply(
            Term p, Term lStart, Term l, Term r, Boolean holdsLeft, Boolean holdsRight) {
          return new Fun0<list.List<Term>>() {
            public list.List<Term> apply() {
              list.List<Term> leftLine =
                  (holdsLeft)
                      ? new list.Nil()
                          .cons(
                              new Term(
                                  "Line",
                                  pointX.apply(lStart),
                                  pointY.apply(lStart),
                                  pointX.apply(l),
                                  pointY.apply(l),
                                  redLine))
                      : new list.Nil();
              list.List<Term> rightLine =
                  (holdsRight)
                      ? new list.Nil()
                          .cons(
                              new Term(
                                  "Line",
                                  pointX.apply(lStart),
                                  pointY.apply(lStart),
                                  pointX.apply(r),
                                  pointY.apply(r),
                                  redLine))
                      : new list.Nil();
              Term image =
                  new Term(
                      "Image",
                      (pointX.apply(p)) - ((philosopherWidth) / (2)),
                      (pointY.apply(p)) - ((philosopherHeight) / (2)),
                      philosopherWidth,
                      philosopherHeight,
                      ((holdsRight) && (holdsLeft)) ? eatingIcon : thinkingIcon);
              return append(new list.Nil().cons(image), append(leftLine, rightLine));
            }
          }.apply();
        }
      };
  private static Fun2<list.List<Actor>, Integer, list.List<Term>> getHolding =
      new Fun2<list.List<Actor>, Integer, list.List<Term>>() {
        public list.List<Actor> apply(Integer i, list.List<Term> holds) {
          return new Fun1<list.List<Actor>, list.List<Term>>() {
            public list.List<Actor> apply(list.List<Term> var0) {
              return new Fail<list.List<Actor>>() {
                public list.List<Actor> fail() {
                  return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                    public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                      if (isNil(var0))
                        return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                          public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                            return new list.Nil();
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<list.List<Actor>>() {
                        public list.List<Actor> fail() {
                          return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                            public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                              if (isCons(var0))
                                return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                  public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                    if (isTerm(consHead(var0), "Holds", 2))
                                      return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                        public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                          int i1 = termRef(consHead(var0), 0);
                                          return new Fun1<
                                              list.List<Actor>, Fail<list.List<Actor>>>() {
                                            public list.List<Actor> apply(
                                                Fail<list.List<Actor>> fail) {
                                              list.List<Actor> cs = termRef(consHead(var0), 1);
                                              return new Fun1<
                                                  list.List<Actor>, Fail<list.List<Actor>>>() {
                                                public list.List<Actor> apply(
                                                    Fail<list.List<Actor>> fail) {
                                                  list.List<Term> hs = consTail(var0);
                                                  return new Fun1<
                                                      list.List<Actor>, Fail<list.List<Actor>>>() {
                                                    public list.List<Actor> apply(
                                                        Fail<list.List<Actor>> fail) {
                                                      if (i1 == i) {
                                                        return cs;
                                                      } else return fail.fail();
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
                              new Fail<list.List<Actor>>() {
                                public list.List<Actor> fail() {
                                  return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                    public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                      if (isCons(var0))
                                        return new Fun1<
                                            list.List<Actor>, Fail<list.List<Actor>>>() {
                                          public list.List<Actor> apply(
                                              Fail<list.List<Actor>> fail) {
                                            Term h = consHead(var0);
                                            return new Fun1<
                                                list.List<Actor>, Fail<list.List<Actor>>>() {
                                              public list.List<Actor> apply(
                                                  Fail<list.List<Actor>> fail) {
                                                list.List<Term> hs = consTail(var0);
                                                return new Fun1<
                                                    list.List<Actor>, Fail<list.List<Actor>>>() {
                                                  public list.List<Actor> apply(
                                                      Fail<list.List<Actor>> fail) {
                                                    return getHolding.apply(i, hs);
                                                  }
                                                }.apply(fail);
                                              }
                                            }.apply(fail);
                                          }
                                        }.apply(fail);
                                      else return fail.fail();
                                    }
                                  }.apply(
                                      new Fail<list.List<Actor>>() {
                                        public list.List<Actor> fail() {
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
          }.apply(holds);
        }
      };
  private static Fun4<list.List<Term>, Integer, list.List<Actor>, list.List<Term>, list.List<Actor>>
      toCircles =
          new Fun4<
              list.List<Term>, Integer, list.List<Actor>, list.List<Term>, list.List<Actor>>() {
            public list.List<Term> apply(
                Integer i,
                list.List<Actor> chopsticks,
                list.List<Term> holds,
                list.List<Actor> free) {
              return new Fun1<list.List<Term>, list.List<Actor>>() {
                public list.List<Term> apply(list.List<Actor> var0) {
                  return new Fail<list.List<Term>>() {
                    public list.List<Term> fail() {
                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                          if (isNil(var0))
                            return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                              public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                return new list.Nil();
                              }
                            }.apply(fail);
                          else return fail.fail();
                        }
                      }.apply(
                          new Fail<list.List<Term>>() {
                            public list.List<Term> fail() {
                              return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                  if (isCons(var0))
                                    return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                      public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                        Actor c = consHead(var0);
                                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                            list.List<Actor> cs = consTail(var0);
                                            return new Fun1<
                                                list.List<Term>, Fail<list.List<Term>>>() {
                                              public list.List<Term> apply(
                                                  Fail<list.List<Term>> fail) {
                                                return toCircles
                                                    .apply(i + 1, cs, holds, free)
                                                    .cons(toCircle.apply(i, c, holds, free));
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
                  }.fail();
                }
              }.apply(chopsticks);
            }
          };
  private static Fun4<Term, Integer, Actor, list.List<Term>, list.List<Actor>> toCircle =
      new Fun4<Term, Integer, Actor, list.List<Term>, list.List<Actor>>() {
        public Term apply(Integer i, Actor c, list.List<Term> holds, list.List<Actor> free) {
          return new Fun1<Term, Term>() {
            public Term apply(Term var0) {
              return new Fail<Term>() {
                public Term fail() {
                  return new Fun1<Term, Fail<Term>>() {
                    public Term apply(Fail<Term> fail) {
                      if (isTerm(var0, "Point", 2))
                        return new Fun1<Term, Fail<Term>>() {
                          public Term apply(Fail<Term> fail) {
                            int x = termRef(var0, 0);
                            return new Fun1<Term, Fail<Term>>() {
                              public Term apply(Fail<Term> fail) {
                                int y = termRef(var0, 1);
                                return new Fun1<Term, Fail<Term>>() {
                                  public Term apply(Fail<Term> fail) {
                                    if (member.apply(c, free)) {
                                      return new Term("Circle", x, y, 10, unfilled);
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
                      new Fail<Term>() {
                        public Term fail() {
                          return new Fun1<Term, Fail<Term>>() {
                            public Term apply(Fail<Term> fail) {
                              if (isTerm(var0, "Point", 2))
                                return new Fun1<Term, Fail<Term>>() {
                                  public Term apply(Fail<Term> fail) {
                                    int x = termRef(var0, 0);
                                    return new Fun1<Term, Fail<Term>>() {
                                      public Term apply(Fail<Term> fail) {
                                        int y = termRef(var0, 1);
                                        return new Fun1<Term, Fail<Term>>() {
                                          public Term apply(Fail<Term> fail) {
                                            return new Term("Circle", x, y, 10, filled);
                                          }
                                        }.apply(fail);
                                      }
                                    }.apply(fail);
                                  }
                                }.apply(fail);
                              else return fail.fail();
                            }
                          }.apply(
                              new Fail<Term>() {
                                public Term fail() {
                                  throw new Error(" case failed.");
                                }
                              });
                        }
                      });
                }
              }.fail();
            }
          }.apply(
              circlePos(centreX, centreY, chopstickRadius, ((360) / (numberOfPhilosophers)) * (i)));
        }
      };
  private static Fun1<list.List<Term>, list.List<Term>> filmstrip =
      new Fun1<list.List<Term>, list.List<Term>>() {
        public list.List<Term> apply(list.List<Term> history) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isNil(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            return new list.Nil()
                                .cons(new Term("Snapshot", new list.Nil(), chopsticks));
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<list.List<Term>>() {
                        public list.List<Term> fail() {
                          return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                            public list.List<Term> apply(Fail<list.List<Term>> fail) {
                              if (isCons(var0))
                                return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                  public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                    if (isTerm(consHead(var0), "Grab", 2))
                                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                          int p = termRef(consHead(var0), 0);
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              Actor c = termRef(consHead(var0), 1);
                                              return new Fun1<
                                                  list.List<Term>, Fail<list.List<Term>>>() {
                                                public list.List<Term> apply(
                                                    Fail<list.List<Term>> fail) {
                                                  list.List<Term> h = consTail(var0);
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      return extendFilmstrip.apply(
                                                          p, c, filmstrip.apply(h));
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
                                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                      if (isCons(var0))
                                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                            if (isTerm(consHead(var0), "Release", 1))
                                              return new Fun1<
                                                  list.List<Term>, Fail<list.List<Term>>>() {
                                                public list.List<Term> apply(
                                                    Fail<list.List<Term>> fail) {
                                                  Actor c = termRef(consHead(var0), 0);
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      list.List<Term> h = consTail(var0);
                                                      return new Fun1<
                                                          list.List<Term>,
                                                          Fail<list.List<Term>>>() {
                                                        public list.List<Term> apply(
                                                            Fail<list.List<Term>> fail) {
                                                          return reduceFilmstrip.apply(
                                                              c, filmstrip.apply(h));
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
                      });
                }
              }.fail();
            }
          }.apply(history);
        }
      };
  private static Fun3<list.List<Term>, Integer, Actor, list.List<Term>> extendFilmstrip =
      new Fun3<list.List<Term>, Integer, Actor, list.List<Term>>() {
        public list.List<Term> apply(Integer p, Actor c, list.List<Term> fs) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isCons(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            if (isTerm(consHead(var0), "Snapshot", 2))
                              return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                  list.List<Term> holds = termRef(consHead(var0), 0);
                                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                      list.List<Actor> free = termRef(consHead(var0), 1);
                                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                          list.List<Term> fs = consTail(var0);
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              return fs.cons(new Term("Snapshot", holds, free))
                                                  .cons(
                                                      new Term(
                                                          "Snapshot",
                                                          extendHolds.apply(p, c, holds),
                                                          remove.apply(c, free)));
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
              }.fail();
            }
          }.apply(fs);
        }
      };
  private static Fun2<list.List<Term>, Actor, list.List<Term>> reduceFilmstrip =
      new Fun2<list.List<Term>, Actor, list.List<Term>>() {
        public list.List<Term> apply(Actor c, list.List<Term> fs) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isCons(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            if (isTerm(consHead(var0), "Snapshot", 2))
                              return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                  list.List<Term> holds = termRef(consHead(var0), 0);
                                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                      list.List<Actor> free = termRef(consHead(var0), 1);
                                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                          list.List<Term> fs = consTail(var0);
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              return fs.cons(new Term("Snapshot", holds, free))
                                                  .cons(
                                                      new Term(
                                                          "Snapshot",
                                                          reduceHolds.apply(c, holds),
                                                          free.cons(c)));
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
              }.fail();
            }
          }.apply(fs);
        }
      };
  private static Fun3<list.List<Term>, Integer, Actor, list.List<Term>> extendHolds =
      new Fun3<list.List<Term>, Integer, Actor, list.List<Term>>() {
        public list.List<Term> apply(Integer p, Actor c, list.List<Term> holds) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isNil(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            return new list.Nil()
                                .cons(new Term("Holds", p, new list.Nil().cons(c)));
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<list.List<Term>>() {
                        public list.List<Term> fail() {
                          return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                            public list.List<Term> apply(Fail<list.List<Term>> fail) {
                              if (isCons(var0))
                                return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                  public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                    if (isTerm(consHead(var0), "Holds", 2))
                                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                          int p1 = termRef(consHead(var0), 0);
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              list.List<Actor> cs = termRef(consHead(var0), 1);
                                              return new Fun1<
                                                  list.List<Term>, Fail<list.List<Term>>>() {
                                                public list.List<Term> apply(
                                                    Fail<list.List<Term>> fail) {
                                                  list.List<Term> hs = consTail(var0);
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      return (p == p1)
                                                          ? hs.cons(
                                                              new Term("Holds", p, cs.cons(c)))
                                                          : extendHolds
                                                              .apply(p, c, hs)
                                                              .cons(new Term("Holds", p1, cs));
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
          }.apply(holds);
        }
      };
  private static Fun2<list.List<Term>, Actor, list.List<Term>> reduceHolds =
      new Fun2<list.List<Term>, Actor, list.List<Term>>() {
        public list.List<Term> apply(Actor c, list.List<Term> holds) {
          return new Fun1<list.List<Term>, list.List<Term>>() {
            public list.List<Term> apply(list.List<Term> var0) {
              return new Fail<list.List<Term>>() {
                public list.List<Term> fail() {
                  return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                    public list.List<Term> apply(Fail<list.List<Term>> fail) {
                      if (isNil(var0))
                        return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                          public list.List<Term> apply(Fail<list.List<Term>> fail) {
                            return holds;
                          }
                        }.apply(fail);
                      else return fail.fail();
                    }
                  }.apply(
                      new Fail<list.List<Term>>() {
                        public list.List<Term> fail() {
                          return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                            public list.List<Term> apply(Fail<list.List<Term>> fail) {
                              if (isCons(var0))
                                return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                  public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                    if (isTerm(consHead(var0), "Holds", 2))
                                      return new Fun1<list.List<Term>, Fail<list.List<Term>>>() {
                                        public list.List<Term> apply(Fail<list.List<Term>> fail) {
                                          int p = termRef(consHead(var0), 0);
                                          return new Fun1<
                                              list.List<Term>, Fail<list.List<Term>>>() {
                                            public list.List<Term> apply(
                                                Fail<list.List<Term>> fail) {
                                              list.List<Actor> cs = termRef(consHead(var0), 1);
                                              return new Fun1<
                                                  list.List<Term>, Fail<list.List<Term>>>() {
                                                public list.List<Term> apply(
                                                    Fail<list.List<Term>> fail) {
                                                  list.List<Term> hs = consTail(var0);
                                                  return new Fun1<
                                                      list.List<Term>, Fail<list.List<Term>>>() {
                                                    public list.List<Term> apply(
                                                        Fail<list.List<Term>> fail) {
                                                      return (member.apply(c, cs))
                                                          ? hs.cons(
                                                              new Term(
                                                                  "Holds", p, remove.apply(c, cs)))
                                                          : reduceHolds
                                                              .apply(c, hs)
                                                              .cons(new Term("Holds", p, cs));
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
          }.apply(holds);
        }
      };
  private static Fun0<Object> eat =
      new Fun0<Object>() {
        public Object apply() {
          return wait.apply(eatTime);
        }
      };
  private static Fun0<Object> think =
      new Fun0<Object>() {
        public Object apply() {
          return wait.apply(thinkTime);
        }
      };
  private static Fun3<Actor, Integer, Actor, Actor> philosopher1 =
      new Fun3<Actor, Integer, Actor, Actor>() {
        public Actor apply(Integer i, Actor left, Actor right) {
          return new Actor(
                  new BehaviourAdapter(true) {
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
                                      if ((n) < (timeLimit)) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = think.apply();
                                            return lock(
                                                new Fun0<Object>() {
                                                  public Object apply() {
                                                    new Fun0<Object>() {
                                                      public Object apply() {
                                                        synchronized (history) {
                                                          return history.setValue(
                                                              history
                                                                  .getValue()
                                                                  .cons(new Term("Grab", i, right))
                                                                  .cons(new Term("Grab", i, left)));
                                                        }
                                                      }
                                                    }.apply();
                                                    eat.apply();
                                                    return new Fun0<Object>() {
                                                      public Object apply() {
                                                        synchronized (history) {
                                                          return history.setValue(
                                                              history
                                                                  .getValue()
                                                                  .cons(new Term("Release", right))
                                                                  .cons(new Term("Release", left)));
                                                        }
                                                      }
                                                    }.apply();
                                                  }
                                                },
                                                left,
                                                right);
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
  private static Fun3<Actor, Integer, Actor, Actor> philosopher2 =
      new Fun3<Actor, Integer, Actor, Actor>() {
        public Actor apply(Integer i, Actor left, Actor right) {
          return new Actor(
                  new BehaviourAdapter(true) {
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
                                      if ((n) < (timeLimit)) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore = think.apply();
                                            return new Fun0<Object>() {
                                              public Object apply() {
                                                Object ignore =
                                                    new Fun0<Object>() {
                                                      public Object apply() {
                                                        synchronized (left) {
                                                          new Fun0<Object>() {
                                                            public Object apply() {
                                                              synchronized (history) {
                                                                return history.setValue(
                                                                    history
                                                                        .getValue()
                                                                        .cons(
                                                                            new Term(
                                                                                "Grab", i, left)));
                                                              }
                                                            }
                                                          }.apply();
                                                          think.apply();
                                                          return new Fun0<Object>() {
                                                            public Object apply() {
                                                              synchronized (right) {
                                                                new Fun0<Object>() {
                                                                  public Object apply() {
                                                                    synchronized (history) {
                                                                      return history.setValue(
                                                                          history
                                                                              .getValue()
                                                                              .cons(
                                                                                  new Term(
                                                                                      "Grab", i,
                                                                                      right)));
                                                                    }
                                                                  }
                                                                }.apply();
                                                                return eat.apply();
                                                              }
                                                            }
                                                          }.apply();
                                                        }
                                                      }
                                                    }.apply();
                                                return history.setValue(
                                                    history
                                                        .getValue()
                                                        .cons(new Term("Release", right))
                                                        .cons(new Term("Release", left)));
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
  private static Fun0<Actor> chopstick =
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
  private static list.List<Actor> chopsticks =
      esl.Library.flatten(
          esl.Library.map(
              new Fun1<list.List<Actor>, Integer>() {
                public list.List<Actor> apply(Integer mapElement) {
                  return new Fun1<list.List<Actor>, Integer>() {
                    public list.List<Actor> apply(Integer var0) {
                      return new Fail<list.List<Actor>>() {
                        public list.List<Actor> fail() {
                          return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                            public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                              int i = var0;
                              return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                  return new list.Nil().cons(chopstick.apply());
                                }
                              }.apply(fail);
                            }
                          }.apply(
                              new Fail<list.List<Actor>>() {
                                public list.List<Actor> fail() {
                                  return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                    public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                      int else_ = var0;
                                      return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                        public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                          return new list.Nil();
                                        }
                                      }.apply(fail);
                                    }
                                  }.apply(
                                      new Fail<list.List<Actor>>() {
                                        public list.List<Actor> fail() {
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
              esl.Library.to(0, numberOfPhilosophers)));
  private static list.List<Actor> philosophers =
      (canDeadlock)
          ? esl.Library.flatten(
              esl.Library.map(
                  new Fun1<list.List<Actor>, Integer>() {
                    public list.List<Actor> apply(Integer mapElement) {
                      return new Fun1<list.List<Actor>, Integer>() {
                        public list.List<Actor> apply(Integer var0) {
                          return new Fail<list.List<Actor>>() {
                            public list.List<Actor> fail() {
                              return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                  int i = var0;
                                  return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                    public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                      return new list.Nil()
                                          .cons(
                                              philosopher2.apply(
                                                  i,
                                                  chopsticks.nth(i),
                                                  chopsticks.nth(
                                                      (i + 1) % (numberOfPhilosophers))));
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<list.List<Actor>>() {
                                    public list.List<Actor> fail() {
                                      return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                        public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                          int else_ = var0;
                                          return new Fun1<
                                              list.List<Actor>, Fail<list.List<Actor>>>() {
                                            public list.List<Actor> apply(
                                                Fail<list.List<Actor>> fail) {
                                              return new list.Nil();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<list.List<Actor>>() {
                                            public list.List<Actor> fail() {
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
                  esl.Library.to(0, numberOfPhilosophers)))
          : esl.Library.flatten(
              esl.Library.map(
                  new Fun1<list.List<Actor>, Integer>() {
                    public list.List<Actor> apply(Integer mapElement) {
                      return new Fun1<list.List<Actor>, Integer>() {
                        public list.List<Actor> apply(Integer var0) {
                          return new Fail<list.List<Actor>>() {
                            public list.List<Actor> fail() {
                              return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                  int i = var0;
                                  return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                    public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                      return new list.Nil()
                                          .cons(
                                              philosopher1.apply(
                                                  i,
                                                  chopsticks.nth(i),
                                                  chopsticks.nth(
                                                      (i + 1) % (numberOfPhilosophers))));
                                    }
                                  }.apply(fail);
                                }
                              }.apply(
                                  new Fail<list.List<Actor>>() {
                                    public list.List<Actor> fail() {
                                      return new Fun1<list.List<Actor>, Fail<list.List<Actor>>>() {
                                        public list.List<Actor> apply(Fail<list.List<Actor>> fail) {
                                          int else_ = var0;
                                          return new Fun1<
                                              list.List<Actor>, Fail<list.List<Actor>>>() {
                                            public list.List<Actor> apply(
                                                Fail<list.List<Actor>> fail) {
                                              return new list.Nil();
                                            }
                                          }.apply(fail);
                                        }
                                      }.apply(
                                          new Fail<list.List<Actor>>() {
                                            public list.List<Actor> fail() {
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
                  esl.Library.to(0, numberOfPhilosophers)));
  public static Fun0<Actor> main =
      new Fun0<Actor>() {
        public Actor apply() {
          return new Actor(
                  new BehaviourAdapter(true) {
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
                                      if ((n) > (timeLimit)) {
                                        return new Fun0<Object>() {
                                          public Object apply() {
                                            Object ignore =
                                                print.apply(reverse.apply(history.getValue()));
                                            return new Fun0<Object>() {
                                              public Object apply() {
                                                Object ignore =
                                                    sendEDB(
                                                        new Term(
                                                            "Filmstrip",
                                                            "Philosophers",
                                                            reverse.apply(
                                                                toPictures.apply(
                                                                    filmstrip.apply(
                                                                        history.getValue())))));
                                                return stopAll.apply();
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
    new Philosophers().main.apply();
  }
}

