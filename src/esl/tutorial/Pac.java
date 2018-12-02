package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Util.*;
import java.util.function.Supplier;
public class Pac {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal locX = new ESLVal(new Function(new ESLVal("locX"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v1 = l;
        
        switch(_v1.termName) {
        case "Loc": {ESLVal $2 = _v1.termRef(0);
          ESLVal $1 = _v1.termRef(1);
          
          {ESLVal x = $2;
          
          {ESLVal y = $1;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(509,534)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
  private static ESLVal locY = new ESLVal(new Function(new ESLVal("locY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v2 = l;
        
        switch(_v2.termName) {
        case "Loc": {ESLVal $4 = _v2.termRef(0);
          ESLVal $3 = _v2.termRef(1);
          
          {ESLVal x = $4;
          
          {ESLVal y = $3;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(555,580)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  private static ESLVal player = new ESLVal(new Function(new ESLVal("player"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] _v72 = new ESLVal[]{$args[0]};
  ESLVal[] _v73 = new ESLVal[]{$args[1]};
  ESLVal _v74 = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("player")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v72[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v73[0];
              }
            });
          ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v72[0] = v;
                return $null;}
              }
            });
          ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v73[0] = v;
                return $null;}
              }
            });
          ESLVal moveTo = new ESLVal(new Function(new ESLVal("moveTo"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v1 = $args[0];
            ESLVal v2 = $args[1];
            {_v72[0] = v1;
                {_v73[0] = v2;
                return $null;}}
              }
            });
          ESLVal getMaze = new ESLVal(new Function(new ESLVal("getMaze"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v74;
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return error(new ESLVal("abstract operation move"));
              }
            });
          ESLVal canMove = new ESLVal(new Function(new ESLVal("canMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v77 = $args[0];
            ESLVal _v78 = $args[1];
            return _v74.ref("legalPos").apply(_v77,_v78).or(_v74.ref("atHome").apply(_v77,_v78));
              }
            });
          ESLVal deltas = ESLVal.list(new ESLVal(-1),$zero,$one);
          ESLVal deltaOK = new ESLVal(new Function(new ESLVal("deltaOK"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal dx = $args[0];
            ESLVal dy = $args[1];
            return dx.eql($zero).and(dy.eql($zero)).not();
              }
            });
          ESLVal initPlans = new ESLVal(new Function(new ESLVal("initPlans"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply())));
              }
            });
          ESLVal getBestPlan = new ESLVal(new Function(new ESLVal("getBestPlan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal better = $args[0];
            ESLVal plans = $args[1];
            return select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun28"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal p1 = $args[0];
                  return exists.apply(new ESLVal(new Function(new ESLVal("fun29"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p2 = $args[0];
                        return p1.neql(p2).and(better.apply(p2,p1));
                          }
                        }),plans).not();
                    }
                  }));
              }
            });
          ESLVal plan = new ESLVal(new Function(new ESLVal("plan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal maxLength = $args[0];
            ESLVal better = $args[1];
            ESLVal goal = $args[2];
            ESLVal pred = $args[3];
            ESLVal moves = $args[4];
            ESLVal plans = $args[5];
            if(plans.eql(ESLVal.list()).boolVal)
                  return $null;
                  else
                    if(maxLength.less($zero).boolVal)
                      return getBestPlan.apply(better,plans);
                      else
                        {ESLVal p = goal.apply(plans);
                          
                          if(p.eql($null).boolVal)
                          return plan.apply(maxLength.sub($one),better,goal,pred,moves,new java.util.function.Function<ESLVal,ESLVal>() {
                              public ESLVal apply(ESLVal $l0) {
                                ESLVal $a = $nil;
                                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                                while(!$l0.isNil()) { 
                                  ESLVal p = $l0.head();
                                  $l0 = $l0.tail();
                                  if(pred.apply(p).boolVal) {$v.add(p);
                            }
                                }
                                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                                return $a;
                              }}.apply(addMoves.apply(plans,moves)));
                          else
                            return p;
                        }
              }
            });
          ESLVal hasMove = new ESLVal(new Function(new ESLVal("hasMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            return new ESLVal(new Function(new ESLVal("fun30"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal p = $args[0];
                  return member.apply(m,p);
                    }
                  });
              }
            });
          ESLVal addMoves = new ESLVal(new Function(new ESLVal("addMoves"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal plans = $args[0];
            ESLVal moves = $args[1];
            return new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal p = $l0.head();
                        $l0 = $l0.tail();
                        ESLVal $l1 = moves.apply(p);
                  while(!$l1.isNil()) {
                    ESLVal m = $l1.head();
                    $l1 = $l1.tail();
                    if(exists.apply(hasMove.apply(m),plans).not().boolVal) {$v.add(p.cons(m));
                    }
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(plans);
              }
            });
          ESLVal moves = cache.apply(head,new ESLVal(new Function(new ESLVal("fun31"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v3 = head.apply(p);
                  
                  switch(_v3.termName) {
                  case "Loc": {ESLVal $6 = _v3.termRef(0);
                    ESLVal $5 = _v3.termRef(1);
                    
                    {ESLVal _v75 = $6;
                    
                    {ESLVal _v76 = $5;
                    
                    return new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal dx = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = deltas;
                    while(!$l1.isNil()) {
                      ESLVal dy = $l1.head();
                      $l1 = $l1.tail();
                      if(getSelf().ref("deltaOK").apply(dx,dy).boolVal) {if(canMove.apply(_v75.add(dx),_v76.add(dy)).boolVal) {$v.add(new ESLVal("Loc",_v75.add(dx),_v76.add(dy)));
                      }
                      }
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(deltas);
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(3924,4082)").add(ESLVal.list(_v3)));
                }
                }
              }
            }));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Start": {
              return error(new ESLVal("abstract message Start"));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "setX": return setX;
              case "setY": return setY;
              case "moveTo": return moveTo;
              case "getMaze": return getMaze;
              case "move": return move;
              case "canMove": return canMove;
              case "moves": return moves;
              case "plan": return plan;
              case "deltaOK": return deltaOK;
              case "initPlans": return initPlans;
              case "deltas": return deltas;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal cellWidth = new ESLVal(20);
  private static ESLVal cellHeight = new ESLVal(20);
  private static ESLVal maxWidth = new ESLVal(29);
  private static ESLVal maxHeight = new ESLVal(27);
  private static ESLVal delay = new ESLVal(100);
  private static ESLVal cellEmpty = $zero;
  private static ESLVal legalCell = new ESLVal(2);
  private static ESLVal homeCell = new ESLVal(3);
  private static ESLVal hWall = new ESLVal(4);
  private static ESLVal vWall = new ESLVal(5);
  private static ESLVal topLeftCorner = new ESLVal(6);
  private static ESLVal topRightCorner = new ESLVal(7);
  private static ESLVal bottomLeftCorner = new ESLVal(8);
  private static ESLVal bottomRightCorner = new ESLVal(9);
  private static ESLVal timeLimit = new ESLVal(70000);
  private static ESLVal imin = new ESLVal(new Function(new ESLVal("imin"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  if(x.less(y).boolVal)
        return x;
        else
          return y;
    }
  });
  private static ESLVal imax = new ESLVal(new Function(new ESLVal("imax"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  if(x.gre(y).boolVal)
        return x;
        else
          return y;
    }
  });
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal greater = $args[1];
  return select1.apply(l,$null,new ESLVal(new Function(new ESLVal("fun32"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal greatest = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun33"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal x = $args[0];
              return greater.apply(x,greatest);
                }
              }),l).not();
          }
        }));
    }
  });
  private static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v5 = l;
        
        if(_v5.isCons())
        {ESLVal $7 = _v5.head();
          ESLVal $8 = _v5.tail();
          
          {ESLVal n = $7;
          
          {ESLVal _v71 = $8;
          
          return n.add(sum.apply(_v71));
        }
        }
        }
      else if(_v5.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5738,5786)").add(ESLVal.list(_v5)));
      }
    }
  });
  private static ESLVal distance = new ESLVal(new Function(new ESLVal("distance"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x1 = $args[0];
  ESLVal y1 = $args[1];
  ESLVal x2 = $args[2];
  ESLVal y2 = $args[3];
  {ESLVal dx = x1.sub(x2);
        ESLVal dy = y1.sub(y2);
        
        return isqrt.apply(dx.mul(dx).add(dy.mul(dy)));
      }
    }
  });
  private static ESLVal initArray = new ESLVal(new Function(new ESLVal("initArray"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal a = newArray(length.apply(l).intVal);
        
        {{
        ESLVal _v6 = $zero.to(length.apply(l));
        while(_v6.isCons()) {
          ESLVal y = _v6.headVal;
          {ESLVal b = newArray(length.apply(nth.apply(l,y)).intVal);
            
            {a.array[y.intVal] = b;
          {
            ESLVal _v7 = $zero.to(length.apply(nth.apply(l,y)));
            while(_v7.isCons()) {
              ESLVal x = _v7.headVal;
              a.array[y.intVal].array[x.intVal] = nth.apply(nth.apply(l,y),x);
              _v7 = _v7.tailVal;}
          }}
          }
          _v6 = _v6.tailVal;}
      }
      return a;}
      }
    }
  });
  private static ESLVal forallArray = new ESLVal(new Function(new ESLVal("forallArray"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal a = $args[1];
  ESLVal size = $args[2];
  {ESLVal[] b = new ESLVal[]{$true};
        
        {{
        ESLVal _v8 = $zero.to(size);
        while(_v8.isCons()) {
          ESLVal i = _v8.headVal;
          if(p.apply(a.array[i.intVal]).not().boolVal)
            b[0] = $false;
            else
              {}
          _v8 = _v8.tailVal;}
      }
      return b[0];}
      }
    }
  });
  private static ESLVal ghost = new ESLVal(new Function(new ESLVal("ghost"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal homeX = $args[2];
  ESLVal homeY = $args[3];
  ESLVal gType = $args[4];
  ESLVal m = $args[5];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),player,x,y,m),true,getSelf(),new ESLVal("ghost")) {
          ESLVal ghostType = gType;
          ESLVal state = new ESLVal("Chase",new ESLVal[]{});
          ESLVal changeMode = new ESLVal(15);
          ESLVal modeCount = changeMode;
          ESLVal switchMode = new ESLVal(new Function(new ESLVal("switchMode"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {state = s;
                {modeCount = changeMode;
                return $null;}}
              }
            });
          ESLVal deltaOK = new ESLVal(new Function(new ESLVal("deltaOK"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal dx = $args[0];
            ESLVal dy = $args[1];
            return refSuper("deltaOK").apply(dx,dy).and(dx.eql($zero).or(dy.eql($zero)));
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                { LetRec letrec = new LetRec() {
                  ESLVal planDistance = new ESLVal(new Function(new ESLVal("planDistance"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v63 = $args[0];
                    ESLVal _v64 = $args[1];
                    ESLVal _v65 = $args[2];
                    {ESLVal _v9 = head.apply(_v63);
                          
                          switch(_v9.termName) {
                          case "Loc": {ESLVal $10 = _v9.termRef(0);
                            ESLVal $9 = _v9.termRef(1);
                            
                            {ESLVal x0 = $10;
                            
                            {ESLVal y0 = $9;
                            
                            return distance.apply(_v64,_v65,x0,y0);
                          }
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(7856,7912)").add(ESLVal.list(_v9)));
                        }
                        }
                      }
                    });
                  ESLVal pred = new ESLVal(new Function(new ESLVal("pred"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal p = $args[0];
                    return $true;
                      }
                    });
                  ESLVal better = new ESLVal(new Function(new ESLVal("better"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    return new ESLVal(new Function(new ESLVal("fun34"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal p1 = $args[0];
                          ESLVal p2 = $args[1];
                          return planDistance.apply(p1,goalX,goalY).less(planDistance.apply(p2,goalX,goalY));
                            }
                          });
                      }
                    });
                  ESLVal at = new ESLVal(new Function(new ESLVal("at"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    return new ESLVal(new Function(new ESLVal("fun35"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal plans = $args[0];
                          return select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun36"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal p = $args[0];
                                return head.apply(p).eql(new ESLVal("Loc",goalX,goalY));
                                  }
                                }));
                            }
                          });
                      }
                    });
                  ESLVal getMove = new ESLVal(new Function(new ESLVal("getMove"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    {ESLVal _v10 = getSelf().ref("plan").apply(new ESLVal(8),better.apply(goalX,goalY),at.apply(goalX,goalY),pred,getSelf().ref("moves"),getSelf().ref("initPlans").apply());
                          
                          if(_v10.isCons())
                          {ESLVal $11 = _v10.head();
                            ESLVal $12 = _v10.tail();
                            
                            if($12.isCons())
                            {ESLVal $13 = $12.head();
                              ESLVal $14 = $12.tail();
                              
                              {ESLVal p = _v10;
                              
                              if(p.eql($null).boolVal)
                              return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                              else
                                {ESLVal _v59 = _v10;
                                  
                                  return last.apply(butlast.apply(_v59));
                                }
                            }
                            }
                          else if($12.isNil())
                            {ESLVal l = $11;
                              
                              return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            }
                          else {ESLVal p = _v10;
                              
                              if(p.eql($null).boolVal)
                              return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                              else
                                {ESLVal _v60 = _v10;
                                  
                                  return last.apply(butlast.apply(_v60));
                                }
                            }
                          }
                        else if(_v10.isNil())
                          {ESLVal p = _v10;
                            
                            if(p.eql($null).boolVal)
                            return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            else
                              {ESLVal _v61 = _v10;
                                
                                return last.apply(butlast.apply(_v61));
                              }
                          }
                        else {ESLVal p = _v10;
                            
                            if(p.eql($null).boolVal)
                            return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            else
                              {ESLVal _v62 = _v10;
                                
                                return last.apply(butlast.apply(_v62));
                              }
                          }
                        }
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "planDistance": return planDistance;
                      
                      case "pred": return pred;
                      
                      case "better": return better;
                      
                      case "at": return at;
                      
                      case "getMove": return getMove;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal planDistance = letrec.get("planDistance");
                
                ESLVal pred = letrec.get("pred");
                
                ESLVal better = letrec.get("better");
                
                ESLVal at = letrec.get("at");
                
                ESLVal getMove = letrec.get("getMove");
                
                  {ESLVal _v11 = state;
                  
                  switch(_v11.termName) {
                  case "Scatter": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v13 = getMove.apply(homeX,homeY);
                      
                      switch(_v13.termName) {
                      case "Loc": {ESLVal $18 = _v13.termRef(0);
                        ESLVal $17 = _v13.termRef(1);
                        
                        {ESLVal _v68 = $18;
                        
                        {ESLVal _v69 = $17;
                        
                        {getSelf().ref("moveTo").apply(_v68,_v69);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(8848,9011)").add(ESLVal.list(_v13)));
                    }
                    }
                    else
                      return switchMode.apply(new ESLVal("Chase",new ESLVal[]{}));
                  }
                case "Chase": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v12 = getMove.apply(m.ref("getPacman").apply().ref("getX").apply(),m.ref("getPacman").apply().ref("getY").apply());
                      
                      switch(_v12.termName) {
                      case "Loc": {ESLVal $16 = _v12.termRef(0);
                        ESLVal $15 = _v12.termRef(1);
                        
                        {ESLVal _v66 = $16;
                        
                        {ESLVal _v67 = $15;
                        
                        {getSelf().ref("moveTo").apply(_v66,_v67);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(9146,9338)").add(ESLVal.list(_v12)));
                    }
                    }
                    else
                      return switchMode.apply(new ESLVal("Scatter",new ESLVal[]{}));
                  }
                  default: return error(new ESLVal("case error at Pos(8727,9384)").add(ESLVal.list(_v11)));
                }
                }}
                
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v14 = $m;
            
            switch(_v14.termName) {
            case "Start": {
              return Lib.send(m,"RegisterGhost",getSelf());
            }
            default: {ESLVal _v70 = _v14;
              
              {sendSuper(_v70);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "ghostType": return ghostType;
              case "move": return move;
              case "deltaOK": return deltaOK;
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal ghost1 = new ESLVal(new Function(new ESLVal("ghost1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,$one,$one,$zero,m),true,getSelf(),new ESLVal("ghost1")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v15 = $m;
            
            {ESLVal _v58 = _v15;
            
            {sendSuper(_v58);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal ghost2 = new ESLVal(new Function(new ESLVal("ghost2"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,$one,maxHeight.sub(new ESLVal(2)),$one,m),true,getSelf(),new ESLVal("ghost2")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v16 = $m;
            
            {ESLVal _v57 = _v16;
            
            {sendSuper(_v57);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal ghost3 = new ESLVal(new Function(new ESLVal("ghost3"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,maxWidth.sub(new ESLVal(2)),$one,new ESLVal(2),m),true,getSelf(),new ESLVal("ghost3")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v17 = $m;
            
            {ESLVal _v56 = _v17;
            
            {sendSuper(_v56);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal ghost4 = new ESLVal(new Function(new ESLVal("ghost4"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,maxWidth.sub(new ESLVal(2)),maxHeight.sub(new ESLVal(2)),new ESLVal(3),m),true,getSelf(),new ESLVal("ghost4")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v18 = $m;
            
            {ESLVal _v55 = _v18;
            
            {sendSuper(_v55);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal pacman = new ESLVal(new Function(new ESLVal("pacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),player,x,y,m),true,getSelf(),new ESLVal("pacman")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v19 = $m;
            
            switch(_v19.termName) {
            case "Start": {
              return Lib.send(m,"RegisterPacman",getSelf());
            }
            default: {ESLVal _v54 = _v19;
              
              {sendSuper(_v54);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal playerPacman = new ESLVal(new Function(new ESLVal("playerPacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),pacman,x,y,m),true,getSelf(),new ESLVal("playerPacman")) {
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal mouseX = gui.ref("mouseX");
                  ESLVal mouseY = gui.ref("mouseY");
                  
                  {ESLVal dx = mouseX.sub(getSelf().ref("getX").apply());
                  ESLVal dy = mouseY.sub(getSelf().ref("getY").apply());
                  
                  {ESLVal mx = ((Supplier<ESLVal>)() -> { 
                      if(dx.gre($zero).boolVal)
                        return $one;
                        else
                          if(dx.less($zero).boolVal)
                            return new ESLVal(-1);
                            else
                              return $zero;
                    }).get();
                  ESLVal my = ((Supplier<ESLVal>)() -> { 
                      if(dy.gre($zero).boolVal)
                        return $one;
                        else
                          if(dy.less($zero).boolVal)
                            return new ESLVal(-1);
                            else
                              return $zero;
                    }).get();
                  
                  {if(mx.neql($zero).and(m.ref("legalPos").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply())).boolVal)
                  getSelf().ref("setX").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth));
                  else
                    if(my.neql($zero).and(m.ref("legalPos").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply().add(my))).boolVal)
                      getSelf().ref("setY").apply(getSelf().ref("getY").apply().add(my));
                      else
                        if(m.ref("legalPos").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply().add(my)).boolVal)
                          getSelf().ref("moveTo").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply().add(my));
                          else
                            if(getSelf().ref("getX").apply().add(mx).eql($zero).and(m.ref("legalPos").apply($zero,getSelf().ref("getY").apply())).boolVal)
                              getSelf().ref("setX").apply(maxWidth.sub($one));
                              else
                                {}
                Lib.send(gui,"Player",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                m.ref("eat").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                return wait.apply(delay);}
                }
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v20 = $m;
            
            {ESLVal _v53 = _v20;
            
            {sendSuper(_v53);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "move": return move;
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal autoPacman = new ESLVal(new Function(new ESLVal("autoPacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),pacman,x,y,m),true,getSelf(),new ESLVal("autoPacman")) {
          ESLVal plan = ESLVal.list();
          ESLVal fleeing = $false;
          ESLVal moves = new ESLVal(new Function(new ESLVal("moves"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            return new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal p = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Loc",((Supplier<ESLVal>)() -> { 
                    if(locX.apply(p).eql($zero).boolVal)
                      return maxWidth.sub($one);
                      else
                        return locX.apply(p);
                  }).get(),locY.apply(p)));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(refSuper("moves").apply(p));
              }
            });
          ESLVal ghostDistance = new ESLVal(new Function(new ESLVal("ghostDistance"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal l = $args[0];
            return min.apply(new ESLVal(1000.0),new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal g = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(distance.apply(locX.apply(l),locY.apply(l),g.ref("getX").apply(),g.ref("getY").apply()));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(m.ref("getGhosts").apply()));
              }
            });
          ESLVal dangerous = new ESLVal(new Function(new ESLVal("dangerous"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal dangerZones = $args[0];
            return new ESLVal(new Function(new ESLVal("fun37"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal p = $args[0];
                  {ESLVal canReach = take.apply(dangerZones,length.apply(p).add($one));
                        
                        return exists.apply(new ESLVal(new Function(new ESLVal("fun38"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal zone = $args[0];
                        return member.apply(head.apply(p),zone);
                          }
                        }),canReach).not();
                      }
                    }
                  });
              }
            });
          ESLVal min = new ESLVal(new Function(new ESLVal("min"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v47 = $args[0];
            ESLVal _v48 = $args[1];
            {ESLVal _v21 = _v48;
                  
                  if(_v21.isCons())
                  {ESLVal $19 = _v21.head();
                    ESLVal $20 = _v21.tail();
                    
                    {ESLVal f = $19;
                    
                    {ESLVal _v49 = $20;
                    
                    if(f.less(_v47).boolVal)
                    return min.apply(f,_v49);
                    else
                      {ESLVal _v50 = $19;
                        
                        {ESLVal _v51 = $20;
                        
                        return min.apply(_v47,_v51);
                      }
                      }
                  }
                  }
                  }
                else if(_v21.isNil())
                  return _v47;
                else return error(new ESLVal("case error at Pos(12370,12461)").add(ESLVal.list(_v21)));
                }
              }
            });
          ESLVal nextMove = new ESLVal(new Function(new ESLVal("nextMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v22 = p;
                  
                  return $ndCase.apply(_v22,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $22 = $args[0];
                  ESLVal $23 = $args[1];
                  ESLVal $24 = $args[2];
                  ESLVal $21 = $args[3];
                  {ESLVal p1 = $22;
                        
                        {ESLVal l = $23;
                        
                        {ESLVal p2 = $24;
                        
                        if(length.apply(p2).eql($one).boolVal)
                        return l;
                        else
                          return $21.apply();
                      }
                      }
                      }
                    }
                  }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return error(new ESLVal("case error at Pos(12494,12560)").add(ESLVal.list(_v22)));
                    }
                  }));
                }
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal d = ghostDistance.apply(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()));
                  
                  if(d.less(new ESLVal(5.0)).and(fleeing.not()).boolVal)
                  {flee.apply(new ESLVal(7));
                  fleeing = $true;
                  return doPlan.apply();}
                  else
                    if(d.gre(new ESLVal(5.0)).and(fleeing).boolVal)
                      {eat.apply(new ESLVal(9));
                      fleeing = $false;
                      return doPlan.apply();}
                      else
                        return doPlan.apply();
                }
              }
            });
          ESLVal ghostMoves = cache.apply(id,new ESLVal(new Function(new ESLVal("fun39"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal l = $args[0];
            {ESLVal _v23 = l;
                  
                  switch(_v23.termName) {
                  case "Loc": {ESLVal $26 = _v23.termRef(0);
                    ESLVal $25 = _v23.termRef(1);
                    
                    {ESLVal _v45 = $26;
                    
                    {ESLVal _v46 = $25;
                    
                    return new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal dx = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = refSuper("deltas");
                    while(!$l1.isNil()) {
                      ESLVal dy = $l1.head();
                      $l1 = $l1.tail();
                      if(dx.eql($zero).or(dy.eql($zero)).boolVal) {if(dx.eql($zero).and(dy.eql($zero)).not().boolVal) {if(getSelf().ref("canMove").apply(_v45.add(dx),_v46.add(dy)).boolVal) {$v.add(new ESLVal("Loc",_v45.add(dx),_v46.add(dy)));
                      }
                      }
                      }
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(refSuper("deltas"));
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(12983,13209)").add(ESLVal.list(_v23)));
                }
                }
              }
            }));
          ESLVal getDangerZones = new ESLVal(new Function(new ESLVal("getDangerZones"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal moves = $args[0];
            { LetRec letrec = new LetRec() {
                  ESLVal ghostLocs = new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal g = $l0.head();
                          $l0 = $l0.tail();
                          $v.add(new ESLVal("Loc",g.ref("getX").apply(),g.ref("getY").apply()));
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(m.ref("getGhosts").apply());
                  ESLVal zones = new ESLVal(new Function(new ESLVal("zones"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v42 = $args[0];
                    ESLVal _v43 = $args[1];
                    ESLVal _v44 = $args[2];
                    if(_v43.greql(_v44).boolVal)
                          return ESLVal.list();
                          else
                            {ESLVal z = new java.util.function.Function<ESLVal,ESLVal>() {
                                  public ESLVal apply(ESLVal $l0) {
                                    ESLVal $a = $nil;
                                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                                    while(!$l0.isNil()) { 
                                      ESLVal l = $l0.head();
                                      $l0 = $l0.tail();
                                      ESLVal $l1 = ghostMoves.apply(l);
                                while(!$l1.isNil()) {
                                  ESLVal m = $l1.head();
                                  $l1 = $l1.tail();
                                  $v.add(m);
                                }
                                    }
                                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                                    return $a;
                                  }}.apply(_v42);
                              
                              return zones.apply(z,_v43.add($one),_v44).cons(z);
                            }
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "ghostLocs": return ghostLocs;
                      
                      case "zones": return zones;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal ghostLocs = letrec.get("ghostLocs");
                
                ESLVal zones = letrec.get("zones");
                
                  return zones.apply(ghostLocs,$zero,moves);}
                
              }
            });
          ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            { LetRec letrec = new LetRec() {
                  ESLVal foodCount = new ESLVal(new Function(new ESLVal("foodCount"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal plan = $args[0];
                    return sum.apply(new java.util.function.Function<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal l = $l0.head();
                                $l0 = $l0.tail();
                                $v.add(food.array[locY.apply(l).intVal].array[locX.apply(l).intVal]);
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(plan));
                      }
                    });
                  ESLVal moreFood = new ESLVal(new Function(new ESLVal("moreFood"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal plan1 = $args[0];
                    ESLVal plan2 = $args[1];
                    return foodCount.apply(plan1).gre(foodCount.apply(plan2));
                      }
                    });
                  ESLVal mostFood = new ESLVal(new Function(new ESLVal("mostFood"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal plans = $args[0];
                    if(length.apply(head.apply(plans)).less(n).boolVal)
                          return $null;
                          else
                            return max.apply(plans,moreFood);
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "foodCount": return foodCount;
                      
                      case "moreFood": return moreFood;
                      
                      case "mostFood": return mostFood;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal foodCount = letrec.get("foodCount");
                
                ESLVal moreFood = letrec.get("moreFood");
                
                ESLVal mostFood = letrec.get("mostFood");
                
                  {ESLVal _v24 = getSelf().ref("plan").apply(n,moreFood,mostFood,dangerous.apply(getDangerZones.apply(n.add($one))),moves,getSelf().ref("initPlans").apply());
                  
                  if(_v24.isCons())
                  {ESLVal $27 = _v24.head();
                    ESLVal $28 = _v24.tail();
                    
                    if($28.isCons())
                    {ESLVal $29 = $28.head();
                      ESLVal $30 = $28.tail();
                      
                      {ESLVal p = _v24;
                      
                      if(p.eql($null).boolVal)
                      {plan = ESLVal.list();
                      return $null;}
                      else
                        {ESLVal _v38 = _v24;
                          
                          {plan = butlast.apply(_v38);
                        return $null;}
                        }
                    }
                    }
                  else if($28.isNil())
                    {ESLVal l = $27;
                      
                      {plan = ESLVal.list();
                    return $null;}
                    }
                  else {ESLVal p = _v24;
                      
                      if(p.eql($null).boolVal)
                      {plan = ESLVal.list();
                      return $null;}
                      else
                        {ESLVal _v39 = _v24;
                          
                          {plan = butlast.apply(_v39);
                        return $null;}
                        }
                    }
                  }
                else if(_v24.isNil())
                  {ESLVal p = _v24;
                    
                    if(p.eql($null).boolVal)
                    {plan = ESLVal.list();
                    return $null;}
                    else
                      {ESLVal _v40 = _v24;
                        
                        {plan = butlast.apply(_v40);
                      return $null;}
                      }
                  }
                else {ESLVal p = _v24;
                    
                    if(p.eql($null).boolVal)
                    {plan = ESLVal.list();
                    return $null;}
                    else
                      {ESLVal _v41 = _v24;
                        
                        {plan = butlast.apply(_v41);
                      return $null;}
                      }
                  }
                }}
                
              }
            });
          ESLVal flee = new ESLVal(new Function(new ESLVal("flee"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            { LetRec letrec = new LetRec() {
                  ESLVal ok = new ESLVal(new Function(new ESLVal("ok"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal p1 = $args[0];
                    ESLVal p2 = $args[1];
                    return $true;
                      }
                    });
                  ESLVal anything = new ESLVal(new Function(new ESLVal("anything"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal plans = $args[0];
                    if(length.apply(head.apply(plans)).less(n).boolVal)
                          return $null;
                          else
                            return head.apply(plans);
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "ok": return ok;
                      
                      case "anything": return anything;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal ok = letrec.get("ok");
                
                ESLVal anything = letrec.get("anything");
                
                  {ESLVal _v25 = getSelf().ref("plan").apply(n,ok,anything,dangerous.apply(getDangerZones.apply(n.add($one))),moves,getSelf().ref("initPlans").apply());
                  
                  if(_v25.isCons())
                  {ESLVal $31 = _v25.head();
                    ESLVal $32 = _v25.tail();
                    
                    if($32.isCons())
                    {ESLVal $33 = $32.head();
                      ESLVal $34 = $32.tail();
                      
                      {ESLVal p = _v25;
                      
                      if(p.eql($null).boolVal)
                      {plan = ESLVal.list();
                      return $null;}
                      else
                        {ESLVal _v34 = _v25;
                          
                          {plan = butlast.apply(_v34);
                        return $null;}
                        }
                    }
                    }
                  else if($32.isNil())
                    {ESLVal l = $31;
                      
                      {plan = ESLVal.list();
                    return $null;}
                    }
                  else {ESLVal p = _v25;
                      
                      if(p.eql($null).boolVal)
                      {plan = ESLVal.list();
                      return $null;}
                      else
                        {ESLVal _v35 = _v25;
                          
                          {plan = butlast.apply(_v35);
                        return $null;}
                        }
                    }
                  }
                else if(_v25.isNil())
                  {ESLVal p = _v25;
                    
                    if(p.eql($null).boolVal)
                    {plan = ESLVal.list();
                    return $null;}
                    else
                      {ESLVal _v36 = _v25;
                        
                        {plan = butlast.apply(_v36);
                      return $null;}
                      }
                  }
                else {ESLVal p = _v25;
                    
                    if(p.eql($null).boolVal)
                    {plan = ESLVal.list();
                    return $null;}
                    else
                      {ESLVal _v37 = _v25;
                        
                        {plan = butlast.apply(_v37);
                      return $null;}
                      }
                  }
                }}
                
              }
            });
          ESLVal doPlan = new ESLVal(new Function(new ESLVal("doPlan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(plan.eql(ESLVal.list()).boolVal)
                  return replan.apply();
                  else
                    {ESLVal _v26 = plan;
                      
                      return $ndCase.apply(_v26,ESLVal.list(new ESLVal("$selectRight",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal $36 = $args[0];
                      ESLVal $37 = $args[1];
                      ESLVal $35 = $args[2];
                      {ESLVal p1 = $36;
                            
                            {ESLVal l = $37;
                            
                            {plan = p1;
                          {ESLVal _v27 = l;
                            
                            switch(_v27.termName) {
                            case "Loc": {ESLVal $39 = _v27.termRef(0);
                              ESLVal $38 = _v27.termRef(1);
                              
                              {ESLVal _v32 = $39;
                              
                              {ESLVal _v33 = $38;
                              
                              {getSelf().ref("moveTo").apply(_v32,_v33);
                            Lib.send(gui,"Player",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            m.ref("eat").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            return wait.apply(delay);}
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(15076,15359)").add(ESLVal.list(_v27)));
                          }
                          }}
                          }
                          }
                        }
                      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          return error(new ESLVal("case error at Pos(15009,15377)").add(ESLVal.list(_v26)));
                        }
                      }));
                    }
              }
            });
          ESLVal replan = new ESLVal(new Function(new ESLVal("replan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(fleeing.boolVal)
                  return flee.apply(new ESLVal(7));
                  else
                    return eat.apply(new ESLVal(9));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v28 = $m;
            
            {ESLVal _v52 = _v28;
            
            {sendSuper(_v52);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "move": return move;
              default: return refSuper(name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal maze = new ESLVal(new Function(new ESLVal("maze"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("maze")) {
          ESLVal ghosts = ESLVal.list();
          ESLVal pacman = $null;
          ESLVal players = $nil;
          ESLVal eaten = new ESLVal(new Function(new ESLVal("eaten"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return exists.apply(isEatingPacman,ghosts);
              }
            });
          ESLVal is0 = new ESLVal(new Function(new ESLVal("is0"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return n.eql($zero);
              }
            });
          ESLVal allEaten = new ESLVal(new Function(new ESLVal("allEaten"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return forallArray.apply(new ESLVal(new Function(new ESLVal("fun40"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal row = $args[0];
                  return forallArray.apply(is0,row,maxWidth);
                    }
                  }),food,maxHeight);
              }
            });
          ESLVal isEatingPacman = new ESLVal(new Function(new ESLVal("isEatingPacman"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            return g.ref("getX").apply().eql(pacman.ref("getX").apply()).and(g.ref("getY").apply().eql(pacman.ref("getY").apply()));
              }
            });
          ESLVal getPacman = new ESLVal(new Function(new ESLVal("getPacman"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return pacman;
              }
            });
          ESLVal getGhosts = new ESLVal(new Function(new ESLVal("getGhosts"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return ghosts;
              }
            });
          ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            if(food.array[y.intVal].array[x.intVal].eql($one).boolVal)
                  return food.array[y.intVal].array[x.intVal] = $zero;
                  else
                    return $null;
              }
            });
          ESLVal repaint = new ESLVal(new Function(new ESLVal("repaint"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return Lib.send(gui,"State",new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal g = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Point",g,g.ref("ghostType"),g.ref("getX").apply(),g.ref("getY").apply()));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(ghosts),food);
              }
            });
          ESLVal isWall = new ESLVal(new Function(new ESLVal("isWall"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return tiles.array[y.intVal].array[x.intVal].gre(legalCell);
              }
            });
          ESLVal atHome = new ESLVal(new Function(new ESLVal("atHome"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            if(x.gre($zero.sub($one)).and(x.less(maxWidth).and(y.gre($zero.sub($one)).and(y.less(maxHeight)))).boolVal)
                  return tiles.array[y.intVal].array[x.intVal].eql(homeCell);
                  else
                    return $false;
              }
            });
          ESLVal legalPos = new ESLVal(new Function(new ESLVal("legalPos"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            if(x.gre($zero.sub($one)).and(x.less(maxWidth).and(y.gre($zero.sub($one)).and(y.less(maxHeight)))).boolVal)
                  return isWall.apply(x,y).not();
                  else
                    return $false;
              }
            });
          ESLVal playerLoses = new ESLVal(new Function(new ESLVal("playerLoses"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("You are eaten!"));
                return stopAll.apply();}
              }
            });
          ESLVal playerWins = new ESLVal(new Function(new ESLVal("playerWins"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("You win!"));
                return stopAll.apply();}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v29 = $m;
            
            switch(_v29.termName) {
            case "RegisterGhost": {ESLVal $41 = _v29.termRef(0);
              
              {ESLVal g = $41;
              
              {players = players.cons(g);
            {ghosts = ghosts.cons(g);
            return $null;}}
            }
            }
          case "RegisterPacman": {ESLVal $40 = _v29.termRef(0);
              
              {ESLVal p = $40;
              
              {players = players.cons(p).cons(p);
            {pacman = p;
            return $null;}}
            }
            }
          case "Move": {
              if(players.neql(ESLVal.list()).and(pacman.neql($null)).boolVal)
              if(allEaten.apply().boolVal)
                return playerWins.apply();
                else
                  if(eaten.apply().boolVal)
                    return playerLoses.apply();
                    else
                      {head.apply(players).ref("move").apply();
                      players = tail.apply(players).add(ESLVal.list(head.apply(players)));
                      repaint.apply();
                      return Lib.send(getSelf(),"Move");}
              else
                return Lib.send(getSelf(),"Move");
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v29)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "isWall": return isWall;
              case "atHome": return atHome;
              case "getPacman": return getPacman;
              case "getGhosts": return getGhosts;
              case "legalPos": return legalPos;
              case "eat": return eat;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal tiles = initArray.apply(ESLVal.list(ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,new ESLVal(5),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),$zero,$zero,$zero,$zero,new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(9),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9)),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9))));
  private static ESLVal food = initArray.apply(ESLVal.list(ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero)));
  private static ESLVal gui = newJavaActor("esl.pacman.Pacman",tiles);
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v30 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v30)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(timeLimit).boolVal)
            stopAll.apply();
            else
              {ESLVal _v31 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {edb.ref("display").apply(new ESLVal("Pacman"),gui);
                {ESLVal m = newActor(maze,new ESLVal(new Actor()));
                  
                  {ESLVal p = newActor(autoPacman,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(21),m);
                  ESLVal g1 = newActor(ghost1,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g2 = newActor(ghost2,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g3 = newActor(ghost3,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g4 = newActor(ghost4,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  
                  {Lib.send(p,"Start");
                Lib.send(g1,"Start");
                Lib.send(g2,"Start");
                Lib.send(g3,"Start");
                Lib.send(g4,"Start");
                return Lib.send(m,"Move");}
                }
                }}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}