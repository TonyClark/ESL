package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Util.*;
import java.util.function.Supplier;
public class Pac {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal player = new ESLVal(new Function(new ESLVal("player"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] _v48 = new ESLVal[]{$args[0]};
  ESLVal[] _v47 = new ESLVal[]{$args[1]};
  ESLVal _v46 = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("player")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v48[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v47[0];
              }
            });
          ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v48[0] = v;
                return $null;}
              }
            });
          ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v47[0] = v;
                return $null;}
              }
            });
          ESLVal moveTo = new ESLVal(new Function(new ESLVal("moveTo"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v1 = $args[0];
            ESLVal v2 = $args[1];
            {_v48[0] = v1;
                {_v47[0] = v2;
                return $null;}}
              }
            });
          ESLVal getMaze = new ESLVal(new Function(new ESLVal("getMaze"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v46;
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return error(new ESLVal("abstract operation move"));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v21 = $m;
            
            switch(_v21.termName) {
            case "Start": {
              return error(new ESLVal("abstract message Start"));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v21)));
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
  private static ESLVal timeLimit = new ESLVal(50000);
  private static ESLVal initArray = new ESLVal(new Function(new ESLVal("initArray"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal a = newArray(length.apply(l).intVal);
        
        {{
        ESLVal _v19 = $zero.to(length.apply(l));
        while(_v19.isCons()) {
          ESLVal y = _v19.headVal;
          {ESLVal b = newArray(length.apply(nth.apply(l,y)).intVal);
            
            {a.array[y.intVal] = b;
          {
            ESLVal _v20 = $zero.to(length.apply(nth.apply(l,y)));
            while(_v20.isCons()) {
              ESLVal x = _v20.headVal;
              a.array[y.intVal].array[x.intVal] = nth.apply(nth.apply(l,y),x);
              _v20 = _v20.tailVal;}
          }}
          }
          _v19 = _v19.tailVal;}
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
        ESLVal _v18 = $zero.to(size);
        while(_v18.isCons()) {
          ESLVal i = _v18.headVal;
          if(p.apply(a.array[i.intVal]).not().boolVal)
            b[0] = $false;
            else
              {}
          _v18 = _v18.tailVal;}
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
          ESLVal maxPlanLength = new ESLVal(8);
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                LetRec letrec = new LetRec() {
                  ESLVal selectMin = new ESLVal(new Function(new ESLVal("selectMin"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal r = $args[0];
                    ESLVal plans = $args[1];
                    return select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun942"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal p1 = $args[0];
                          return forall.apply(new ESLVal(new Function(new ESLVal("fun943"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal p2 = $args[0];
                                if(p1.eql(p2).boolVal)
                                      return $true;
                                      else
                                        return r.apply(p1,p2);
                                  }
                                }),plans);
                            }
                          }));
                      }
                    });
                  ESLVal planDistance = new ESLVal(new Function(new ESLVal("planDistance"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v40 = $args[0];
                    ESLVal _v39 = $args[1];
                    ESLVal _v38 = $args[2];
                    {ESLVal _v13 = head.apply(_v40);
                          
                          switch(_v13.termName) {
                          case "Loc": {ESLVal $12 = _v13.termRef(0);
                            ESLVal $11 = _v13.termRef(1);
                            
                            {ESLVal x0 = $12;
                            
                            {ESLVal y0 = $11;
                            
                            return distance.apply(_v39,_v38,x0,y0);
                          }
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(5792,5848)").add(ESLVal.list(_v13)));
                        }
                        }
                      }
                    });
                  ESLVal canMove = new ESLVal(new Function(new ESLVal("canMove"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v37 = $args[0];
                    ESLVal _v36 = $args[1];
                    return m.ref("legalPos").apply(_v37,_v36).or(m.ref("atHome").apply(_v37,_v36));
                      }
                    });
                  ESLVal goalX = m.ref("getPacman").apply().ref("getX").apply();
                  ESLVal goalY = m.ref("getPacman").apply().ref("getY").apply();
                  ESLVal plan = new ESLVal(new Function(new ESLVal("plan"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    ESLVal plans = $args[2];
                    if(length.apply(head.apply(plans)).gre(maxPlanLength).boolVal)
                          return selectMin.apply(new ESLVal(new Function(new ESLVal("fun944"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                ESLVal p1 = $args[0];
                            ESLVal p2 = $args[1];
                            return planDistance.apply(p1,goalX,goalY).lesseql(planDistance.apply(p2,goalX,goalY));
                              }
                            }),plans);
                          else
                            {ESLVal p = select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun945"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal p = $args[0];
                                return head.apply(p).eql(new ESLVal("Loc",goalX,goalY));
                                  }
                                }));
                              
                              if(p.eql($null).boolVal)
                              return plan.apply(goalX,goalY,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal $qualArg = $args[0];
                                {ESLVal _v11 = $qualArg;
                                      
                                      {ESLVal _v32 = _v11;
                                      
                                      return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          ESLVal _v33 = $args[0];
                                      {ESLVal _v12 = _v33;
                                            
                                            {ESLVal _v34 = _v12;
                                            
                                            return ESLVal.list((exists.apply(new ESLVal(new Function(new ESLVal("fun946"),getSelf()) {
                                              public ESLVal apply(ESLVal... $args) {
                                                ESLVal _v35 = $args[0];
                                            return member.apply(_v34,_v35);
                                              }
                                            }),plans).not().boolVal) ? (ESLVal.list(_v32.cons(_v34))) : ($nil));
                                          }
                                          }
                                        }
                                      }).map(moves.apply(_v32)).flatten().flatten());
                                    }
                                    }
                                  }
                                }).map(plans).flatten().flatten());
                              else
                                return p;
                            }
                      }
                    });
                  ESLVal getMove = new ESLVal(new Function(new ESLVal("getMove"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    {ESLVal _v10 = plan.apply(goalX,goalY,ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()))));
                          
                          if(_v10.isCons())
                          {ESLVal $5 = _v10.head();
                            ESLVal $6 = _v10.tail();
                            
                            switch($5.termName) {
                            case "Loc": {ESLVal $8 = $5.termRef(0);
                              ESLVal $7 = $5.termRef(1);
                              
                              if($6.isCons())
                              {ESLVal $9 = $6.head();
                                ESLVal $10 = $6.tail();
                                
                                {ESLVal p = _v10;
                                
                                return last.apply(butlast.apply(p));
                              }
                              }
                            else if($6.isNil())
                              {ESLVal _v30 = $8;
                                
                                {ESLVal _v31 = $7;
                                
                                return new ESLVal("Loc",_v30,_v31);
                              }
                              }
                            else {ESLVal p = _v10;
                                
                                return last.apply(butlast.apply(p));
                              }
                            }
                            default: {ESLVal p = _v10;
                              
                              return last.apply(butlast.apply(p));
                            }
                          }
                          }
                        else if(_v10.isNil())
                          {ESLVal p = _v10;
                            
                            return last.apply(butlast.apply(p));
                          }
                        else {ESLVal p = _v10;
                            
                            return last.apply(butlast.apply(p));
                          }
                        }
                      }
                    });
                  ESLVal moves = cache.apply(head,new ESLVal(new Function(new ESLVal("fun947"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal p = $args[0];
                    {ESLVal _v9 = head.apply(p);
                          
                          switch(_v9.termName) {
                          case "Loc": {ESLVal $4 = _v9.termRef(0);
                            ESLVal $3 = _v9.termRef(1);
                            
                            {ESLVal _v28 = $4;
                            
                            {ESLVal _v29 = $3;
                            
                            return ((Supplier<ESLVal>)() -> { 
                              if(canMove.apply(_v28.add($one),_v29).boolVal)
                                return ESLVal.list(new ESLVal("Loc",_v28.add($one),_v29));
                                else
                                  return ESLVal.list();
                            }).get().add(((Supplier<ESLVal>)() -> { 
                              if(canMove.apply(_v28.sub($one),_v29).boolVal)
                                return ESLVal.list(new ESLVal("Loc",_v28.sub($one),_v29));
                                else
                                  return ESLVal.list();
                            }).get().add(((Supplier<ESLVal>)() -> { 
                              if(canMove.apply(_v28,_v29.add($one)).boolVal)
                                return ESLVal.list(new ESLVal("Loc",_v28,_v29.add($one)));
                                else
                                  return ESLVal.list();
                            }).get().add(((Supplier<ESLVal>)() -> { 
                              if(canMove.apply(_v28,_v29.sub($one)).boolVal)
                                return ESLVal.list(new ESLVal("Loc",_v28,_v29.sub($one)));
                                else
                                  return ESLVal.list();
                            }).get())));
                          }
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(6867,7171)").add(ESLVal.list(_v9)));
                        }
                        }
                      }
                    }));
                  ESLVal distance = new ESLVal(new Function(new ESLVal("distance"),getSelf()) {
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
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "selectMin": return selectMin;
                      
                      case "planDistance": return planDistance;
                      
                      case "canMove": return canMove;
                      
                      case "goalX": return goalX;
                      
                      case "goalY": return goalY;
                      
                      case "plan": return plan;
                      
                      case "getMove": return getMove;
                      
                      case "moves": return moves;
                      
                      case "distance": return distance;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal selectMin = letrec.get("selectMin");
                
                ESLVal planDistance = letrec.get("planDistance");
                
                ESLVal canMove = letrec.get("canMove");
                
                ESLVal goalX = letrec.get("goalX");
                
                ESLVal goalY = letrec.get("goalY");
                
                ESLVal plan = letrec.get("plan");
                
                ESLVal getMove = letrec.get("getMove");
                
                ESLVal moves = letrec.get("moves");
                
                ESLVal distance = letrec.get("distance");
                
                  {ESLVal _v14 = state;
                  
                  switch(_v14.termName) {
                  case "Scatter": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v16 = getMove.apply(homeX,homeY);
                      
                      switch(_v16.termName) {
                      case "Loc": {ESLVal $16 = _v16.termRef(0);
                        ESLVal $15 = _v16.termRef(1);
                        
                        {ESLVal _v43 = $16;
                        
                        {ESLVal _v44 = $15;
                        
                        {getSelf().ref("moveTo").apply(_v43,_v44);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(7401,7564)").add(ESLVal.list(_v16)));
                    }
                    }
                    else
                      {state = new ESLVal("Chase",new ESLVal[]{});
                      {modeCount = changeMode;
                      return $null;}}
                  }
                case "Chase": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v15 = getMove.apply(goalX,goalY);
                      
                      switch(_v15.termName) {
                      case "Loc": {ESLVal $14 = _v15.termRef(0);
                        ESLVal $13 = _v15.termRef(1);
                        
                        {ESLVal _v41 = $14;
                        
                        {ESLVal _v42 = $13;
                        
                        {getSelf().ref("moveTo").apply(_v41,_v42);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(7704,7866)").add(ESLVal.list(_v15)));
                    }
                    }
                    else
                      {state = new ESLVal("Scatter",new ESLVal[]{});
                      {modeCount = changeMode;
                      return $null;}}
                  }
                  default: return error(new ESLVal("case error at Pos(7339,7967)").add(ESLVal.list(_v14)));
                }
                }
                
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v17 = $m;
            
            switch(_v17.termName) {
            case "Start": {
              return Lib.send(m,"RegisterGhost",getSelf());
            }
            default: {ESLVal _v45 = _v17;
              
              {sendSuper(_v45);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "ghostType": return ghostType;
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
  private static ESLVal ghost1 = new ESLVal(new Function(new ESLVal("ghost1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,$one,$one,$zero,m),true,getSelf(),new ESLVal("ghost1")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v8 = $m;
            
            {ESLVal _v27 = _v8;
            
            {sendSuper(_v27);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            {ESLVal _v26 = _v7;
            
            {sendSuper(_v26);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            {ESLVal _v25 = _v6;
            
            {sendSuper(_v25);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v5 = $m;
            
            {ESLVal _v24 = _v5;
            
            {sendSuper(_v24);
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
                            return $zero.sub($one);
                            else
                              return $zero;
                    }).get();
                  ESLVal my = ((Supplier<ESLVal>)() -> { 
                      if(dy.gre($zero).boolVal)
                        return $one;
                        else
                          if(dy.less($zero).boolVal)
                            return $zero.sub($one);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Start": {
              return Lib.send(m,"RegisterPacman",getSelf());
            }
            default: {ESLVal _v23 = _v4;
              
              {sendSuper(_v23);
            return $null;}
            }
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
                return forallArray.apply(new ESLVal(new Function(new ESLVal("fun948"),getSelf()) {
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
                return Lib.send(gui,"State",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v2 = $qualArg;
                        
                        {ESLVal g = _v2;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Point",g,g.ref("ghostType"),g.ref("getX").apply(),g.ref("getY").apply())));
                      }
                      }
                    }
                  }).map(ghosts).flatten().flatten(),food);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
            case "RegisterGhost": {ESLVal $2 = _v3.termRef(0);
              
              {ESLVal g = $2;
              
              {players = players.cons(g);
            {ghosts = ghosts.cons(g);
            return $null;}}
            }
            }
          case "RegisterPacman": {ESLVal $1 = _v3.termRef(0);
              
              {ESLVal p = $1;
              
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "isWall": return isWall;
              case "atHome": return atHome;
              case "getPacman": return getPacman;
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
              {ESLVal _v22 = $t;
                
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
                  
                  {ESLVal p = newActor(pacman,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(21),m);
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