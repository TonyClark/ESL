package esl;

import static esl.Lib.*;

import java.util.function.Supplier;

public class Tmp {
  public static ESLVal a = new ESLVal(10).add(new ESLVal(1));
  private static ESLVal b = new ESLVal(true);
  private static ESLVal c = new ESLVal("plap");
  private static ESLVal d = new ESLVal(100.0);
  private static ESLVal e = ESLVal.nil;
  private static ESLVal f = ESLVal.list(new ESLVal("a"));
  private static ESLVal g =
      ESLVal.list(
          ESLVal.list(new ESLVal(1), new ESLVal(2), new ESLVal(3)),
          ESLVal.list(new ESLVal(4), new ESLVal(5), new ESLVal(6)));
  private static ESLVal h =
      new ESLVal("Succ", new ESLVal("Succ", new ESLVal("One", new ESLVal[] {})));
  private static ESLVal i = ESLVal.nul;
  private static ESLVal ii =
      ((Supplier<ESLVal>)
              () -> {
                i = new ESLVal("One", new ESLVal[] {});
                return i;
              })
          .get();
  private static ESLVal j =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("j");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              if (x.eql(new ESLVal(0)).boolVal) return new ESLVal(1);
              else return new ESLVal(2).mul(k.apply(x.sub(new ESLVal(1))));
            }
          });
  private static ESLVal k =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("k");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              if (x.eql(new ESLVal(0)).boolVal) return new ESLVal(1);
              else return new ESLVal(2).mul(j.apply(x.sub(new ESLVal(1))));
            }
          });
  private static ESLVal jval = j.apply(new ESLVal(10));
  private static ESLVal kval = k.apply(new ESLVal(5));
  private static ESLVal id =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("id");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              return x;
            }
          });
  private static ESLVal l1 = id.apply(new ESLVal(100)).add(new ESLVal(3));
  private static ESLVal l2 = id.apply(new ESLVal("plap")).add(new ESLVal("plop"));
  private static ESLVal mk2 =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("mk2");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              ESLVal y = $args[1];
              return ESLVal.list(x, y);
            }
          });
  private static ESLVal consumer =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("consumer");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return new ESLVal(100);
            }
          });
  private static ESLVal gconsumer =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("gconsumer");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return new ESLVal(101);
            }
          });
  private static ESLVal l3 =
      mk2.apply(
          ESLVal.list(new ESLVal(1), new ESLVal(2)), ESLVal.list(new ESLVal(3), new ESLVal(4)));
  private static ESLVal l4 =
      mk2.apply(
          new ESLVal(
              new Function() {
                public ESLVal getFunctionName() {
                  return new ESLVal("fun396");
                }

                public ESLVal apply(ESLVal[] $args) {
                  ESLVal x = $args[0];
                  return x.add(new ESLVal(1));
                }
              }),
          new ESLVal(
              new Function() {
                public ESLVal getFunctionName() {
                  return new ESLVal("fun397");
                }

                public ESLVal apply(ESLVal[] $args) {
                  ESLVal y = $args[0];
                  return y.sub(new ESLVal(1));
                }
              }));
  private static ESLVal l5 = mk2.apply(id, id);
  private static ESLVal l6 = consumer.apply(mk2.apply(new ESLVal(100), new ESLVal(200)));
  private static ESLVal l7 = gconsumer.apply(mk2.apply(new ESLVal(100), new ESLVal(200)));
  private static ESLVal l8 = gconsumer.apply(mk2.apply(new ESLVal(true), new ESLVal(false)));
  private static ESLVal l9 =
      mk2.apply(id.apply(new ESLVal(10)).add(id.apply(new ESLVal(20))), new ESLVal(30));
  private static ESLVal adjoin =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("adjoin");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              ESLVal l = $args[1];
              if (member.apply(x, l).boolVal) return l;
              else return l.cons(x);
            }
          });
  private static ESLVal select1 =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("select1");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              ESLVal d = $args[1];
              ESLVal p = $args[2];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $1 = l.head();
                          ESLVal $2 = l.tail();

                          {
                            ESLVal h = $1;

                            {
                              ESLVal t = $2;

                              if (p.apply(h).boolVal) return h;
                              else {
                                ESLVal _v1 = $1;

                                {
                                  ESLVal _v2 = $2;

                                  if (new ESLVal(true).boolVal) return select1.apply(_v2, d, p);
                                  else return error(new ESLVal("case error at Pos(1093,1191)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return d;
                          else return error(new ESLVal("case error at Pos(1093,1191)"));
                        else return error(new ESLVal("case error at Pos(1093,1191)"));
                      })
                  .get();
            }
          });
  private static ESLVal map =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("map");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal f = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $3 = l.head();
                          ESLVal $4 = l.tail();

                          {
                            ESLVal m = $3;

                            {
                              ESLVal ms = $4;

                              if (new ESLVal(true).boolVal)
                                return map.apply(f, ms).cons(f.apply(m));
                              else return error(new ESLVal("case error at Pos(1229,1319)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(1229,1319)"));
                        else return error(new ESLVal("case error at Pos(1229,1319)"));
                      })
                  .get();
            }
          });
  private static ESLVal remove =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("remove");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal v = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $5 = l.head();
                          ESLVal $6 = l.tail();

                          {
                            ESLVal h = $5;

                            {
                              ESLVal t = $6;

                              if (h.eql(v).boolVal) return remove.apply(v, t);
                              else {
                                ESLVal _v3 = $5;

                                {
                                  ESLVal _v4 = $6;

                                  if (new ESLVal(true).boolVal)
                                    return remove.apply(v, _v4).cons(_v3);
                                  else return error(new ESLVal("case error at Pos(1355,1491)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(1355,1491)"));
                        else return error(new ESLVal("case error at Pos(1355,1491)"));
                      })
                  .get();
            }
          });
  private static ESLVal remove1 =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("remove1");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal v = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $7 = l.head();
                          ESLVal $8 = l.tail();

                          {
                            ESLVal h = $7;

                            {
                              ESLVal t = $8;

                              if (h.eql(v).boolVal) return t;
                              else {
                                ESLVal _v5 = $7;

                                {
                                  ESLVal _v6 = $8;

                                  if (new ESLVal(true).boolVal)
                                    return remove1.apply(v, _v6).cons(_v5);
                                  else return error(new ESLVal("case error at Pos(1526,1650)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(1526,1650)"));
                        else return error(new ESLVal("case error at Pos(1526,1650)"));
                      })
                  .get();
            }
          });
  private static ESLVal length =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("length");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $9 = l.head();
                          ESLVal $10 = l.tail();

                          {
                            ESLVal h = $9;

                            {
                              ESLVal t = $10;

                              if (new ESLVal(true).boolVal)
                                return new ESLVal(1).add(length.apply(t));
                              else return error(new ESLVal("case error at Pos(1680,1759)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(0);
                          else return error(new ESLVal("case error at Pos(1680,1759)"));
                        else return error(new ESLVal("case error at Pos(1680,1759)"));
                      })
                  .get();
            }
          });
  private static ESLVal flatten =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("flatten");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal lists = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (lists.isCons()) {
                          ESLVal $11 = lists.head();
                          ESLVal $12 = lists.tail();

                          {
                            ESLVal h = $11;

                            {
                              ESLVal t = $12;

                              if (new ESLVal(true).boolVal) return h.add(flatten.apply(t));
                              else return error(new ESLVal("case error at Pos(1801,1893)"));
                            }
                          }
                        } else if (lists.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(1801,1893)"));
                        else return error(new ESLVal("case error at Pos(1801,1893)"));
                      })
                  .get();
            }
          });
  private static ESLVal count =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("count");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $13 = l.head();
                          ESLVal $14 = l.tail();

                          {
                            ESLVal h = $13;

                            {
                              ESLVal t = $14;

                              if (new ESLVal(true).boolVal)
                                if (h.eql(x).boolVal) return new ESLVal(1).add(count.apply(x, t));
                                else return count.apply(x, t);
                              else return error(new ESLVal("case error at Pos(1934,2047)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(0);
                          else return error(new ESLVal("case error at Pos(1934,2047)"));
                        else return error(new ESLVal("case error at Pos(1934,2047)"));
                      })
                  .get();
            }
          });
  private static ESLVal hasPrefix =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("hasPrefix");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal list = $args[0];
              ESLVal prefix = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (list.isCons()) {
                          ESLVal $17 = list.head();
                          ESLVal $18 = list.tail();

                          if (prefix.isCons()) {
                            ESLVal $19 = prefix.head();
                            ESLVal $20 = prefix.tail();

                            {
                              ESLVal x = $17;

                              {
                                ESLVal _v7 = $18;

                                {
                                  ESLVal y = $19;

                                  {
                                    ESLVal _v8 = $20;

                                    if (x.eql(y).boolVal) return hasPrefix.apply(_v7, _v8);
                                    else if (_v8.isCons()) {
                                      ESLVal $15 = _v8.head();
                                      ESLVal $16 = _v8.tail();

                                      {
                                        ESLVal l1 = _v7;

                                        {
                                          ESLVal l2 = _v8;

                                          if (new ESLVal(true).boolVal) return new ESLVal(false);
                                          else
                                            return error(
                                                new ESLVal("case error at Pos(2097,2266)"));
                                        }
                                      }
                                    } else if (_v8.isNil()) {
                                      ESLVal l1 = _v7;

                                      if (new ESLVal(true).boolVal) return new ESLVal(true);
                                      else {
                                        ESLVal _v9 = _v7;

                                        {
                                          ESLVal l2 = _v8;

                                          if (new ESLVal(true).boolVal) return new ESLVal(false);
                                          else
                                            return error(
                                                new ESLVal("case error at Pos(2097,2266)"));
                                        }
                                      }
                                    } else {
                                      ESLVal l1 = _v7;

                                      {
                                        ESLVal l2 = _v8;

                                        if (new ESLVal(true).boolVal) return new ESLVal(false);
                                        else
                                          return error(new ESLVal("case error at Pos(2097,2266)"));
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else if (prefix.isNil())
                            if (prefix.isCons()) {
                              ESLVal $15 = prefix.head();
                              ESLVal $16 = prefix.tail();

                              {
                                ESLVal l1 = list;

                                {
                                  ESLVal l2 = prefix;

                                  if (new ESLVal(true).boolVal) return new ESLVal(false);
                                  else return error(new ESLVal("case error at Pos(2097,2266)"));
                                }
                              }
                            } else if (prefix.isNil()) {
                              ESLVal l1 = list;

                              if (new ESLVal(true).boolVal) return new ESLVal(true);
                              else {
                                ESLVal _v10 = list;

                                {
                                  ESLVal l2 = prefix;

                                  if (new ESLVal(true).boolVal) return new ESLVal(false);
                                  else return error(new ESLVal("case error at Pos(2097,2266)"));
                                }
                              }
                            } else {
                              ESLVal l1 = list;

                              {
                                ESLVal l2 = prefix;

                                if (new ESLVal(true).boolVal) return new ESLVal(false);
                                else return error(new ESLVal("case error at Pos(2097,2266)"));
                              }
                            }
                          else if (prefix.isCons()) {
                            ESLVal $15 = prefix.head();
                            ESLVal $16 = prefix.tail();

                            {
                              ESLVal l1 = list;

                              {
                                ESLVal l2 = prefix;

                                if (new ESLVal(true).boolVal) return new ESLVal(false);
                                else return error(new ESLVal("case error at Pos(2097,2266)"));
                              }
                            }
                          } else if (prefix.isNil()) {
                            ESLVal l1 = list;

                            if (new ESLVal(true).boolVal) return new ESLVal(true);
                            else {
                              ESLVal _v11 = list;

                              {
                                ESLVal l2 = prefix;

                                if (new ESLVal(true).boolVal) return new ESLVal(false);
                                else return error(new ESLVal("case error at Pos(2097,2266)"));
                              }
                            }
                          } else {
                            ESLVal l1 = list;

                            {
                              ESLVal l2 = prefix;

                              if (new ESLVal(true).boolVal) return new ESLVal(false);
                              else return error(new ESLVal("case error at Pos(2097,2266)"));
                            }
                          }
                        } else if (list.isNil())
                          if (prefix.isCons()) {
                            ESLVal $15 = prefix.head();
                            ESLVal $16 = prefix.tail();

                            {
                              ESLVal l1 = list;

                              {
                                ESLVal l2 = prefix;

                                if (new ESLVal(true).boolVal) return new ESLVal(false);
                                else return error(new ESLVal("case error at Pos(2097,2266)"));
                              }
                            }
                          } else if (prefix.isNil()) {
                            ESLVal l1 = list;

                            if (new ESLVal(true).boolVal) return new ESLVal(true);
                            else {
                              ESLVal _v12 = list;

                              {
                                ESLVal l2 = prefix;

                                if (new ESLVal(true).boolVal) return new ESLVal(false);
                                else return error(new ESLVal("case error at Pos(2097,2266)"));
                              }
                            }
                          } else {
                            ESLVal l1 = list;

                            {
                              ESLVal l2 = prefix;

                              if (new ESLVal(true).boolVal) return new ESLVal(false);
                              else return error(new ESLVal("case error at Pos(2097,2266)"));
                            }
                          }
                        else if (prefix.isCons()) {
                          ESLVal $15 = prefix.head();
                          ESLVal $16 = prefix.tail();

                          {
                            ESLVal l1 = list;

                            {
                              ESLVal l2 = prefix;

                              if (new ESLVal(true).boolVal) return new ESLVal(false);
                              else return error(new ESLVal("case error at Pos(2097,2266)"));
                            }
                          }
                        } else if (prefix.isNil()) {
                          ESLVal l1 = list;

                          if (new ESLVal(true).boolVal) return new ESLVal(true);
                          else {
                            ESLVal _v13 = list;

                            {
                              ESLVal l2 = prefix;

                              if (new ESLVal(true).boolVal) return new ESLVal(false);
                              else return error(new ESLVal("case error at Pos(2097,2266)"));
                            }
                          }
                        } else {
                          ESLVal l1 = list;

                          {
                            ESLVal l2 = prefix;

                            if (new ESLVal(true).boolVal) return new ESLVal(false);
                            else return error(new ESLVal("case error at Pos(2097,2266)"));
                          }
                        }
                      })
                  .get();
            }
          });
  private static ESLVal nth =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("nth");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              ESLVal n = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $21 = l.head();
                          ESLVal $22 = l.tail();

                          {
                            ESLVal h = $21;

                            {
                              ESLVal t = $22;

                              if (new ESLVal(true).boolVal)
                                if (n.eql(new ESLVal(0)).boolVal) return h;
                                else return nth.apply(t, n.sub(new ESLVal(1)));
                              else return error(new ESLVal("case error at Pos(2299,2436)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal)
                            return error(new ESLVal("cannot take nth element."));
                          else return error(new ESLVal("case error at Pos(2299,2436)"));
                        else return error(new ESLVal("case error at Pos(2299,2436)"));
                      })
                  .get();
            }
          });
  private static ESLVal take =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("take");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              ESLVal n = $args[1];
              if (n.eql(new ESLVal(0)).boolVal) return ESLVal.nil;
              else
                return ((Supplier<ESLVal>)
                        () -> {
                          if (l.isCons()) {
                            ESLVal $23 = l.head();
                            ESLVal $24 = l.tail();

                            {
                              ESLVal h = $23;

                              {
                                ESLVal t = $24;

                                if (new ESLVal(true).boolVal)
                                  return take.apply(t, n.sub(new ESLVal(1))).cons(h);
                                else return error(new ESLVal("case error at Pos(2508,2636)"));
                              }
                            }
                          } else if (l.isNil())
                            if (new ESLVal(true).boolVal)
                              return error(new ESLVal("cannot take element ").add(n));
                            else return error(new ESLVal("case error at Pos(2508,2636)"));
                          else return error(new ESLVal("case error at Pos(2508,2636)"));
                        })
                    .get();
            }
          });
  private static ESLVal drop =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("drop");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              ESLVal n = $args[1];
              if (n.eql(new ESLVal(0)).boolVal) return l;
              else
                return ((Supplier<ESLVal>)
                        () -> {
                          if (l.isCons()) {
                            ESLVal $25 = l.head();
                            ESLVal $26 = l.tail();

                            {
                              ESLVal h = $25;

                              {
                                ESLVal t = $26;

                                if (new ESLVal(true).boolVal)
                                  return drop.apply(t, n.sub(new ESLVal(1)));
                                else return error(new ESLVal("case error at Pos(2704,2828)"));
                              }
                            }
                          } else if (l.isNil())
                            if (new ESLVal(true).boolVal)
                              return error(new ESLVal("cannot drop element ").add(n));
                            else return error(new ESLVal("case error at Pos(2704,2828)"));
                          else return error(new ESLVal("case error at Pos(2704,2828)"));
                        })
                    .get();
            }
          });
  private static ESLVal subst =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("subst");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal n = $args[0];
              ESLVal o = $args[1];
              ESLVal l = $args[2];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $27 = l.head();
                          ESLVal $28 = l.tail();

                          {
                            ESLVal h = $27;

                            {
                              ESLVal t = $28;

                              if (new ESLVal(true).boolVal)
                                if (h.eql(o).boolVal) return subst.apply(n, o, t).cons(n);
                                else return subst.apply(n, o, t).cons(h);
                              else return error(new ESLVal("case error at Pos(2870,2996)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(2870,2996)"));
                        else return error(new ESLVal("case error at Pos(2870,2996)"));
                      })
                  .get();
            }
          });
  private static ESLVal head =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("fun398");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $29 = l.head();
                          ESLVal $30 = l.tail();

                          {
                            ESLVal h = $29;

                            {
                              ESLVal t = $30;

                              if (new ESLVal(true).boolVal) return h;
                              else return error(new ESLVal("case error at Pos(3043,3144)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal)
                            return error(new ESLVal("cannot take the head of []"));
                          else return error(new ESLVal("case error at Pos(3043,3144)"));
                        else return error(new ESLVal("case error at Pos(3043,3144)"));
                      })
                  .get();
            }
          });
  private static ESLVal tail =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("fun399");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $31 = l.head();
                          ESLVal $32 = l.tail();

                          {
                            ESLVal h = $31;

                            {
                              ESLVal t = $32;

                              if (new ESLVal(true).boolVal) return t;
                              else return error(new ESLVal("case error at Pos(3195,3298)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal)
                            return error(new ESLVal("cannot take the tail of []"));
                          else return error(new ESLVal("case error at Pos(3195,3298)"));
                        else return error(new ESLVal("case error at Pos(3195,3298)"));
                      })
                  .get();
            }
          });
  private static ESLVal isNil =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("isNil");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $33 = l.head();
                          ESLVal $34 = l.tail();

                          return error(new ESLVal("case error at Pos(3329,3381)"));
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(true);
                          else return error(new ESLVal("case error at Pos(3329,3381)"));
                        else return error(new ESLVal("case error at Pos(3329,3381)"));
                      })
                  .get();
            }
          });
  private static ESLVal member =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("member");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal e = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $35 = l.head();
                          ESLVal $36 = l.tail();

                          {
                            ESLVal x = $35;

                            {
                              ESLVal xs = $36;

                              if (x.eql(e).boolVal) return new ESLVal(true);
                              else {
                                ESLVal _v14 = $35;

                                {
                                  ESLVal _v15 = $36;

                                  if (new ESLVal(true).boolVal) return member.apply(e, _v15);
                                  else return error(new ESLVal("case error at Pos(3418,3523)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(false);
                          else return error(new ESLVal("case error at Pos(3418,3523)"));
                        else return error(new ESLVal("case error at Pos(3418,3523)"));
                      })
                  .get();
            }
          });
  private static ESLVal reverse =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("reverse");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $37 = l.head();
                          ESLVal $38 = l.tail();

                          {
                            ESLVal x = $37;

                            {
                              ESLVal xs = $38;

                              if (new ESLVal(true).boolVal)
                                return reverse.apply(xs).add(ESLVal.list(x));
                              else return error(new ESLVal("case error at Pos(3555,3629)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(3555,3629)"));
                        else return error(new ESLVal("case error at Pos(3555,3629)"));
                      })
                  .get();
            }
          });
  private static ESLVal exists =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("fun400");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal pred = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $39 = l.head();
                          ESLVal $40 = l.tail();

                          {
                            ESLVal x = $39;

                            {
                              ESLVal xs = $40;

                              if (pred.apply(x).boolVal) return new ESLVal(true);
                              else {
                                ESLVal _v16 = $39;

                                {
                                  ESLVal _v17 = $40;

                                  if (new ESLVal(true).boolVal) return exists.apply(pred, _v17);
                                  else return error(new ESLVal("case error at Pos(3709,3820)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(false);
                          else return error(new ESLVal("case error at Pos(3709,3820)"));
                        else return error(new ESLVal("case error at Pos(3709,3820)"));
                      })
                  .get();
            }
          });
  private static ESLVal forall =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("fun401");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal pred = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $41 = l.head();
                          ESLVal $42 = l.tail();

                          {
                            ESLVal x = $41;

                            {
                              ESLVal xs = $42;

                              if (pred.apply(x).boolVal) return forall.apply(pred, xs);
                              else {
                                ESLVal _v18 = $41;

                                {
                                  ESLVal _v19 = $42;

                                  if (new ESLVal(true).boolVal) return new ESLVal(false);
                                  else return error(new ESLVal("case error at Pos(3900,4011)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(true);
                          else return error(new ESLVal("case error at Pos(3900,4011)"));
                        else return error(new ESLVal("case error at Pos(3900,4011)"));
                      })
                  .get();
            }
          });
  private static ESLVal replaceNth =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("replaceNth");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              ESLVal n = $args[1];
              ESLVal x = $args[2];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $43 = l.head();
                          ESLVal $44 = l.tail();

                          {
                            ESLVal h = $43;

                            {
                              ESLVal t = $44;

                              if (n.eql(new ESLVal(0)).boolVal) return t.cons(x);
                              else {
                                ESLVal _v20 = $43;

                                {
                                  ESLVal _v21 = $44;

                                  if (new ESLVal(true).boolVal)
                                    return replaceNth
                                        .apply(_v21, n.sub(new ESLVal(1)), x)
                                        .cons(_v20);
                                  else return error(new ESLVal("case error at Pos(4059,4202)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal)
                            return error(new ESLVal("cannot replace nth of []"));
                          else return error(new ESLVal("case error at Pos(4059,4202)"));
                        else return error(new ESLVal("case error at Pos(4059,4202)"));
                      })
                  .get();
            }
          });
  private static ESLVal indexOf =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("indexOf");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal t = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $45 = l.head();
                          ESLVal $46 = l.tail();

                          {
                            ESLVal h = $45;

                            {
                              ESLVal _v22 = $46;

                              if (h.eql(t).boolVal) return new ESLVal(0);
                              else {
                                ESLVal _v23 = $45;

                                {
                                  ESLVal _v24 = $46;

                                  if (new ESLVal(true).boolVal)
                                    return new ESLVal(1).add(indexOf.apply(t, _v24));
                                  else return error(new ESLVal("case error at Pos(4237,4338)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(0).sub(new ESLVal(1));
                          else return error(new ESLVal("case error at Pos(4237,4338)"));
                        else return error(new ESLVal("case error at Pos(4237,4338)"));
                      })
                  .get();
            }
          });
  private static ESLVal select =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("select");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal p = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $47 = l.head();
                          ESLVal $48 = l.tail();

                          {
                            ESLVal h = $47;

                            {
                              ESLVal t = $48;

                              if (p.apply(h).boolVal) return select.apply(p, t).cons(h);
                              else {
                                ESLVal _v25 = $47;

                                {
                                  ESLVal _v26 = $48;

                                  if (new ESLVal(true).boolVal) return select.apply(p, _v26);
                                  else return error(new ESLVal("case error at Pos(4382,4496)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(4382,4496)"));
                        else return error(new ESLVal("case error at Pos(4382,4496)"));
                      })
                  .get();
            }
          });
  private static ESLVal reject =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("reject");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal p = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $49 = l.head();
                          ESLVal $50 = l.tail();

                          {
                            ESLVal h = $49;

                            {
                              ESLVal t = $50;

                              if (p.apply(h).boolVal) return reject.apply(p, t);
                              else {
                                ESLVal _v27 = $49;

                                {
                                  ESLVal _v28 = $50;

                                  if (new ESLVal(true).boolVal)
                                    return reject.apply(p, _v28).cons(_v27);
                                  else return error(new ESLVal("case error at Pos(4540,4654)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(4540,4654)"));
                        else return error(new ESLVal("case error at Pos(4540,4654)"));
                      })
                  .get();
            }
          });
  private static ESLVal last =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("last");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $51 = l.head();
                          ESLVal $52 = l.tail();

                          if ($52.isCons()) {
                            ESLVal $53 = $52.head();
                            ESLVal $54 = $52.tail();

                            {
                              ESLVal h = $51;

                              {
                                ESLVal _v29 = $52;

                                if (new ESLVal(true).boolVal) return last.apply(_v29);
                                else return error(new ESLVal("case error at Pos(4681,4811)"));
                              }
                            }
                          } else if ($52.isNil()) {
                            ESLVal x = $51;

                            if (new ESLVal(true).boolVal) return x;
                            else {
                              ESLVal h = $51;

                              {
                                ESLVal _v30 = $52;

                                if (new ESLVal(true).boolVal) return last.apply(_v30);
                                else return error(new ESLVal("case error at Pos(4681,4811)"));
                              }
                            }
                          } else {
                            ESLVal h = $51;

                            {
                              ESLVal _v31 = $52;

                              if (new ESLVal(true).boolVal) return last.apply(_v31);
                              else return error(new ESLVal("case error at Pos(4681,4811)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal)
                            return error(new ESLVal("cannot find last element of emply list"));
                          else return error(new ESLVal("case error at Pos(4681,4811)"));
                        else return error(new ESLVal("case error at Pos(4681,4811)"));
                      })
                  .get();
            }
          });
  private static ESLVal butlast =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("butlast");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $55 = l.head();
                          ESLVal $56 = l.tail();

                          if ($56.isCons()) {
                            ESLVal $57 = $56.head();
                            ESLVal $58 = $56.tail();

                            {
                              ESLVal h = $55;

                              {
                                ESLVal _v32 = $56;

                                if (new ESLVal(true).boolVal) return butlast.apply(_v32).cons(h);
                                else return error(new ESLVal("case error at Pos(4843,4932)"));
                              }
                            }
                          } else if ($56.isNil()) {
                            ESLVal x = $55;

                            if (new ESLVal(true).boolVal) return ESLVal.nil;
                            else {
                              ESLVal h = $55;

                              {
                                ESLVal _v33 = $56;

                                if (new ESLVal(true).boolVal) return butlast.apply(_v33).cons(h);
                                else return error(new ESLVal("case error at Pos(4843,4932)"));
                              }
                            }
                          } else {
                            ESLVal h = $55;

                            {
                              ESLVal _v34 = $56;

                              if (new ESLVal(true).boolVal) return butlast.apply(_v34).cons(h);
                              else return error(new ESLVal("case error at Pos(4843,4932)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(4843,4932)"));
                        else return error(new ESLVal("case error at Pos(4843,4932)"));
                      })
                  .get();
            }
          });
  private static ESLVal occurrences =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("occurrences");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $59 = l.head();
                          ESLVal $60 = l.tail();

                          {
                            ESLVal h = $59;

                            {
                              ESLVal t = $60;

                              if (h.eql(x).boolVal)
                                return new ESLVal(1).add(occurrences.apply(x, t));
                              else {
                                ESLVal _v35 = $59;

                                {
                                  ESLVal _v36 = $60;

                                  if (new ESLVal(true).boolVal) return occurrences.apply(x, _v36);
                                  else return error(new ESLVal("case error at Pos(4971,5092)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return new ESLVal(0);
                          else return error(new ESLVal("case error at Pos(4971,5092)"));
                        else return error(new ESLVal("case error at Pos(4971,5092)"));
                      })
                  .get();
            }
          });
  private static ESLVal filter =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("filter");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal pred = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $61 = l.head();
                          ESLVal $62 = l.tail();

                          {
                            ESLVal h = $61;

                            {
                              ESLVal t = $62;

                              if (new ESLVal(true).boolVal)
                                if (pred.apply(h).boolVal) return filter.apply(pred, t).cons(h);
                                else return filter.apply(pred, t);
                              else return error(new ESLVal("case error at Pos(5140,5271)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(5140,5271)"));
                        else return error(new ESLVal("case error at Pos(5140,5271)"));
                      })
                  .get();
            }
          });
  private static ESLVal foldr =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("foldr");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal map = $args[0];
              ESLVal op = $args[1];
              ESLVal empty = $args[2];
              ESLVal list = $args[3];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (list.isCons()) {
                          ESLVal $63 = list.head();
                          ESLVal $64 = list.tail();

                          {
                            ESLVal h = $63;

                            {
                              ESLVal t = $64;

                              if (new ESLVal(true).boolVal)
                                return op.apply(map.apply(h), foldr.apply(map, op, empty, t));
                              else return error(new ESLVal("case error at Pos(5338,5431)"));
                            }
                          }
                        } else if (list.isNil())
                          if (new ESLVal(true).boolVal) return empty;
                          else return error(new ESLVal("case error at Pos(5338,5431)"));
                        else return error(new ESLVal("case error at Pos(5338,5431)"));
                      })
                  .get();
            }
          });
  private static ESLVal sum =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("sum");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal list = $args[0];
              return foldr.apply(
                  id,
                  new ESLVal(
                      new Function() {
                        public ESLVal getFunctionName() {
                          return new ESLVal("fun402");
                        }

                        public ESLVal apply(ESLVal[] $args) {
                          ESLVal x = $args[0];
                          ESLVal y = $args[1];
                          return x.add(y);
                        }
                      }),
                  new ESLVal(0),
                  list);
            }
          });
  private static ESLVal removeDups =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("removeDups");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal list = $args[0];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (list.isCons()) {
                          ESLVal $65 = list.head();
                          ESLVal $66 = list.tail();

                          {
                            ESLVal x = $65;

                            {
                              ESLVal l = $66;

                              if (new ESLVal(true).boolVal)
                                return removeDups.apply(remove.apply(x, l)).cons(x);
                              else return error(new ESLVal("case error at Pos(5554,5641)"));
                            }
                          }
                        } else if (list.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(5554,5641)"));
                        else return error(new ESLVal("case error at Pos(5554,5641)"));
                      })
                  .get();
            }
          });
  private static ESLVal prefixes =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("prefixes");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal l = $args[0];
              LetRec letrec =
                  new LetRec() {
                    ESLVal pre =
                        new ESLVal(
                            new Function() {
                              public ESLVal getFunctionName() {
                                return new ESLVal("pre");
                              }

                              public ESLVal apply(ESLVal[] $args) {
                                ESLVal prefixes = $args[0];
                                ESLVal rest = $args[1];
                                print.apply(rest);
                                if (rest.eql(ESLVal.nil).boolVal) return prefixes;
                                else
                                  return pre.apply(
                                      prefixes.add(
                                          ESLVal.list(
                                              last.apply(prefixes)
                                                  .add(ESLVal.list(head.apply(rest))))),
                                      tail.apply(rest));
                              }
                            });

                    public ESLVal get(String name) {
                      switch (name) {
                        case "pre":
                          return pre;

                        default:
                          throw new Error("cannot find letrec binding");
                      }
                    }
                  };
              ESLVal pre = letrec.get("pre");

              return pre.apply(ESLVal.list(ESLVal.nil), l);
            }
          });
  private static ESLVal takeWhile =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("takeWhile");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal p = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $67 = l.head();
                          ESLVal $68 = l.tail();

                          {
                            ESLVal t = $67;

                            {
                              ESLVal _v37 = $68;

                              if (p.apply(t).boolVal) return takeWhile.apply(p, _v37).cons(t);
                              else {
                                ESLVal _v38 = $67;

                                {
                                  ESLVal _v39 = $68;

                                  if (new ESLVal(true).boolVal) return ESLVal.nil;
                                  else return error(new ESLVal("case error at Pos(5929,6037)"));
                                }
                              }
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(5929,6037)"));
                        else return error(new ESLVal("case error at Pos(5929,6037)"));
                      })
                  .get();
            }
          });
  private static ESLVal dropWhile =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("dropWhile");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal p = $args[0];
              ESLVal l = $args[1];
              return ((Supplier<ESLVal>)
                      () -> {
                        if (l.isCons()) {
                          ESLVal $69 = l.head();
                          ESLVal $70 = l.tail();

                          {
                            ESLVal t = $69;

                            {
                              ESLVal _v40 = $70;

                              if (p.apply(t).boolVal) return dropWhile.apply(p, _v40);
                              else return error(new ESLVal("case error at Pos(6082,6179)"));
                            }
                          }
                        } else if (l.isNil())
                          if (new ESLVal(true).boolVal) return ESLVal.nil;
                          else return error(new ESLVal("case error at Pos(6082,6179)"));
                        else return error(new ESLVal("case error at Pos(6082,6179)"));
                      })
                  .get();
            }
          });
  private static ESLVal nums =
      new ESLVal(
              new Function() {
                public ESLVal getFunctionName() {
                  return new ESLVal("qual");
                }

                public ESLVal apply(ESLVal[] $args) {
                  ESLVal $qualArg = $args[0];
                  return ((Supplier<ESLVal>)
                          () -> {
                            {
                              ESLVal n = $qualArg;

                              if (new ESLVal(true).boolVal) return ESLVal.list(ESLVal.list(n));
                              else {
                                ESLVal mmm = $qualArg;

                                if (new ESLVal(true).boolVal) return ESLVal.list();
                                else return error(new ESLVal("case error at Pos(0,0)"));
                              }
                            }
                          })
                      .get();
                }
              })
          .map(new ESLVal(0).to(new ESLVal(10)))
          .flatten()
          .flatten();
  public static ESLVal main =
      new ESLVal(
          new Function() {
            public ESLVal getFunctionName() {
              return new ESLVal("main");
            }

            public ESLVal apply(ESLVal[] $args) {
              ESLVal x = $args[0];
              return new ESLVal(
                  new Behaviour(
                      new ESLVal(
                          new Function() {
                            public ESLVal getFunctionName() {
                              return new ESLVal("main");
                            }

                            public ESLVal apply(ESLVal[] $args) {
                              ESLVal $m = $args[0];
                              return ((Supplier<ESLVal>)
                                      () -> {
                                        switch ($m.termName) {
                                          case "Time":
                                            {
                                              ESLVal $71 = $m.termRef(0);

                                              {
                                                ESLVal n = $71;

                                                if (new ESLVal(true).boolVal)
                                                  return stopAll.apply();
                                                else
                                                  return error(
                                                      new ESLVal("case error at Pos(0,0)"));
                                              }
                                            }
                                          default:
                                            return error(new ESLVal("case error at Pos(0,0)"));
                                        }
                                      })
                                  .get();
                            }
                          })) {

                    public ESLVal init() {
                      return ESLVal.nul;
                    }
                  });
            }
          });

   public static void main(String[] args) {
    System.out.println("Hooray");
   }
}
