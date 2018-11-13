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
  {ESLVal _v50 = l;
        
        switch(_v50.termName) {
        case "Loc": {ESLVal $37 = _v50.termRef(0);
          ESLVal $36 = _v50.termRef(1);
          
          {ESLVal x = $37;
          
          {ESLVal y = $36;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(508,533)").add(ESLVal.list(_v50)));
      }
      }
    }
  });
  private static ESLVal locY = new ESLVal(new Function(new ESLVal("locY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v49 = l;
        
        switch(_v49.termName) {
        case "Loc": {ESLVal $35 = _v49.termRef(0);
          ESLVal $34 = _v49.termRef(1);
          
          {ESLVal x = $35;
          
          {ESLVal y = $34;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(554,579)").add(ESLVal.list(_v49)));
      }
      }
    }
  });
  private static ESLVal player = new ESLVal(new Function(new ESLVal("player"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] _v107 = new ESLVal[]{$args[0]};
  ESLVal[] _v106 = new ESLVal[]{$args[1]};
  ESLVal _v105 = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("player")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v107[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v106[0];
              }
            });
          ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v107[0] = v;
                return $null;}
              }
            });
          ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v = $args[0];
            {_v106[0] = v;
                return $null;}
              }
            });
          ESLVal moveTo = new ESLVal(new Function(new ESLVal("moveTo"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal v1 = $args[0];
            ESLVal v2 = $args[1];
            {_v107[0] = v1;
                {_v106[0] = v2;
                return $null;}}
              }
            });
          ESLVal getMaze = new ESLVal(new Function(new ESLVal("getMaze"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v105;
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return error(new ESLVal("abstract operation move"));
              }
            });
          ESLVal canMove = new ESLVal(new Function(new ESLVal("canMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v109 = $args[0];
            ESLVal _v108 = $args[1];
            return _v105.ref("legalPos").apply(_v109,_v108).or(_v105.ref("atHome").apply(_v109,_v108));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v48 = $m;
            
            switch(_v48.termName) {
            case "Start": {
              return error(new ESLVal("abstract message Start"));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v48)));
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
  return select1.apply(l,$null,new ESLVal(new Function(new ESLVal("fun30"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal greatest = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun31"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal x = $args[0];
              return greater.apply(x,greatest);
                }
              }),l).not();
          }
        }));
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
        ESLVal _v46 = $zero.to(length.apply(l));
        while(_v46.isCons()) {
          ESLVal y = _v46.headVal;
          {ESLVal b = newArray(length.apply(nth.apply(l,y)).intVal);
            
            {a.array[y.intVal] = b;
          {
            ESLVal _v47 = $zero.to(length.apply(nth.apply(l,y)));
            while(_v47.isCons()) {
              ESLVal x = _v47.headVal;
              a.array[y.intVal].array[x.intVal] = nth.apply(nth.apply(l,y),x);
              _v47 = _v47.tailVal;}
          }}
          }
          _v46 = _v46.tailVal;}
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
        ESLVal _v45 = $zero.to(size);
        while(_v45.isCons()) {
          ESLVal i = _v45.headVal;
          if(p.apply(a.array[i.intVal]).not().boolVal)
            b[0] = $false;
            else
              {}
          _v45 = _v45.tailVal;}
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
                    return select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun32"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal p1 = $args[0];
                          return forall.apply(new ESLVal(new Function(new ESLVal("fun33"),getSelf()) {
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
                        ESLVal _v99 = $args[0];
                    ESLVal _v98 = $args[1];
                    ESLVal _v97 = $args[2];
                    {ESLVal _v40 = head.apply(_v99);
                          
                          switch(_v40.termName) {
                          case "Loc": {ESLVal $29 = _v40.termRef(0);
                            ESLVal $28 = _v40.termRef(1);
                            
                            {ESLVal x0 = $29;
                            
                            {ESLVal y0 = $28;
                            
                            return distance.apply(_v98,_v97,x0,y0);
                          }
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(6435,6491)").add(ESLVal.list(_v40)));
                        }
                        }
                      }
                    });
                  ESLVal plan = new ESLVal(new Function(new ESLVal("plan"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal goalX = $args[0];
                    ESLVal goalY = $args[1];
                    ESLVal plans = $args[2];
                    if(length.apply(head.apply(plans)).gre(maxPlanLength).boolVal)
                          return selectMin.apply(new ESLVal(new Function(new ESLVal("fun34"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                ESLVal p1 = $args[0];
                            ESLVal p2 = $args[1];
                            return planDistance.apply(p1,goalX,goalY).lesseql(planDistance.apply(p2,goalX,goalY));
                              }
                            }),plans);
                          else
                            {ESLVal p = select1.apply(plans,$null,new ESLVal(new Function(new ESLVal("fun35"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal p = $args[0];
                                return head.apply(p).eql(new ESLVal("Loc",goalX,goalY));
                                  }
                                }));
                              
                              if(p.eql($null).boolVal)
                              return plan.apply(goalX,goalY,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal $qualArg = $args[0];
                                {ESLVal _v38 = $qualArg;
                                      
                                      {ESLVal _v93 = _v38;
                                      
                                      return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          ESLVal _v94 = $args[0];
                                      {ESLVal _v39 = _v94;
                                            
                                            {ESLVal _v95 = _v39;
                                            
                                            return ESLVal.list((exists.apply(new ESLVal(new Function(new ESLVal("fun36"),getSelf()) {
                                              public ESLVal apply(ESLVal... $args) {
                                                ESLVal _v96 = $args[0];
                                            return member.apply(_v95,_v96);
                                              }
                                            }),plans).not().boolVal) ? (ESLVal.list(_v93.cons(_v95))) : ($nil));
                                          }
                                          }
                                        }
                                      }).map(moves.apply(_v93)).flatten().flatten());
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
                    {ESLVal _v37 = plan.apply(goalX,goalY,ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()))));
                          
                          if(_v37.isCons())
                          {ESLVal $22 = _v37.head();
                            ESLVal $23 = _v37.tail();
                            
                            switch($22.termName) {
                            case "Loc": {ESLVal $25 = $22.termRef(0);
                              ESLVal $24 = $22.termRef(1);
                              
                              if($23.isCons())
                              {ESLVal $26 = $23.head();
                                ESLVal $27 = $23.tail();
                                
                                {ESLVal p = _v37;
                                
                                return last.apply(butlast.apply(p));
                              }
                              }
                            else if($23.isNil())
                              {ESLVal _v91 = $25;
                                
                                {ESLVal _v92 = $24;
                                
                                return new ESLVal("Loc",_v91,_v92);
                              }
                              }
                            else {ESLVal p = _v37;
                                
                                return last.apply(butlast.apply(p));
                              }
                            }
                            default: {ESLVal p = _v37;
                              
                              return last.apply(butlast.apply(p));
                            }
                          }
                          }
                        else if(_v37.isNil())
                          {ESLVal p = _v37;
                            
                            return last.apply(butlast.apply(p));
                          }
                        else {ESLVal p = _v37;
                            
                            return last.apply(butlast.apply(p));
                          }
                        }
                      }
                    });
                  ESLVal moves = cache.apply(head,new ESLVal(new Function(new ESLVal("fun37"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal p = $args[0];
                    {ESLVal _v34 = head.apply(p);
                          
                          switch(_v34.termName) {
                          case "Loc": {ESLVal $21 = _v34.termRef(0);
                            ESLVal $20 = _v34.termRef(1);
                            
                            {ESLVal _v88 = $21;
                            
                            {ESLVal _v89 = $20;
                            
                            return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                ESLVal $qualArg = $args[0];
                            {ESLVal _v35 = $qualArg;
                                  
                                  {ESLVal dx = _v35;
                                  
                                  return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                    public ESLVal apply(ESLVal... $args) {
                                      ESLVal _v90 = $args[0];
                                  {ESLVal _v36 = _v90;
                                        
                                        {ESLVal dy = _v36;
                                        
                                        return ESLVal.list((_v88.eql($zero).and(_v89.eql($zero)).not().boolVal) ? ((getSelf().ref("canMove").apply(_v88.add(dx),_v89.add(dy)).boolVal) ? (ESLVal.list(new ESLVal("Loc",_v88.add(dx),_v89.add(dy)))) : ($nil)) : ($nil));
                                      }
                                      }
                                    }
                                  }).map(ESLVal.list($zero.sub($one),$zero,$one)).flatten().flatten());
                                }
                                }
                              }
                            }).map(ESLVal.list($zero.sub($one),$zero,$one)).flatten().flatten();
                          }
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(7648,7826)").add(ESLVal.list(_v34)));
                        }
                        }
                      }
                    }));
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "selectMin": return selectMin;
                      
                      case "planDistance": return planDistance;
                      
                      case "plan": return plan;
                      
                      case "getMove": return getMove;
                      
                      case "moves": return moves;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal selectMin = letrec.get("selectMin");
                
                ESLVal planDistance = letrec.get("planDistance");
                
                ESLVal plan = letrec.get("plan");
                
                ESLVal getMove = letrec.get("getMove");
                
                ESLVal moves = letrec.get("moves");
                
                  {ESLVal _v41 = state;
                  
                  switch(_v41.termName) {
                  case "Scatter": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v43 = getMove.apply(homeX,homeY);
                      
                      switch(_v43.termName) {
                      case "Loc": {ESLVal $33 = _v43.termRef(0);
                        ESLVal $32 = _v43.termRef(1);
                        
                        {ESLVal _v102 = $33;
                        
                        {ESLVal _v103 = $32;
                        
                        {getSelf().ref("moveTo").apply(_v102,_v103);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(7965,8128)").add(ESLVal.list(_v43)));
                    }
                    }
                    else
                      {state = new ESLVal("Chase",new ESLVal[]{});
                      {modeCount = changeMode;
                      return $null;}}
                  }
                case "Chase": {
                    if(modeCount.gre($zero).boolVal)
                    {ESLVal _v42 = getMove.apply(m.ref("getPacman").apply().ref("getX").apply(),m.ref("getPacman").apply().ref("getY").apply());
                      
                      switch(_v42.termName) {
                      case "Loc": {ESLVal $31 = _v42.termRef(0);
                        ESLVal $30 = _v42.termRef(1);
                        
                        {ESLVal _v100 = $31;
                        
                        {ESLVal _v101 = $30;
                        
                        {getSelf().ref("moveTo").apply(_v100,_v101);
                      {modeCount = modeCount.sub($one);
                      return $null;}}
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(8367,8559)").add(ESLVal.list(_v42)));
                    }
                    }
                    else
                      {state = new ESLVal("Scatter",new ESLVal[]{});
                      {modeCount = changeMode;
                      return $null;}}
                  }
                  default: return error(new ESLVal("case error at Pos(7844,8709)").add(ESLVal.list(_v41)));
                }
                }
                
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v44 = $m;
            
            switch(_v44.termName) {
            case "Start": {
              return Lib.send(m,"RegisterGhost",getSelf());
            }
            default: {ESLVal _v104 = _v44;
              
              {sendSuper(_v104);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v33 = $m;
            
            {ESLVal _v87 = _v33;
            
            {sendSuper(_v87);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v32 = $m;
            
            {ESLVal _v86 = _v32;
            
            {sendSuper(_v86);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v31 = $m;
            
            {ESLVal _v85 = _v31;
            
            {sendSuper(_v85);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v30 = $m;
            
            {ESLVal _v84 = _v30;
            
            {sendSuper(_v84);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v29 = $m;
            
            switch(_v29.termName) {
            case "Start": {
              return Lib.send(m,"RegisterPacman",getSelf());
            }
            default: {ESLVal _v83 = _v29;
              
              {sendSuper(_v83);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v28 = $m;
            
            {ESLVal _v82 = _v28;
            
            {sendSuper(_v82);
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
          ESLVal setPlan = new ESLVal(new Function(new ESLVal("setPlan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {plan = p;
                return $null;}
              }
            });
          ESLVal moves = cache.apply(head,new ESLVal(new Function(new ESLVal("fun38"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v24 = head.apply(p);
                  
                  switch(_v24.termName) {
                  case "Loc": {ESLVal $19 = _v24.termRef(0);
                    ESLVal $18 = _v24.termRef(1);
                    
                    {ESLVal _v78 = $19;
                    
                    {ESLVal _v79 = $18;
                    
                    return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $qualArg = $args[0];
                    {ESLVal _v25 = $qualArg;
                          
                          {ESLVal dx = _v25;
                          
                          return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal _v80 = $args[0];
                          {ESLVal _v26 = _v80;
                                
                                {ESLVal dy = _v26;
                                
                                return ESLVal.list((dx.eql($zero).and(dy.eql($zero)).not().boolVal) ? ((getSelf().ref("canMove").apply(_v78.add(dx),_v79.add(dy)).boolVal) ? (ESLVal.list(new ESLVal("Loc",((Supplier<ESLVal>)() -> { 
                                  if(_v78.add(dx).eql($zero).boolVal)
                                    return maxWidth.sub($one);
                                    else
                                      return _v78.add(dx);
                                }).get(),_v79.add(dy)))) : ($nil)) : ($nil));
                              }
                              }
                            }
                          }).map(ESLVal.list($one,$zero,$zero.sub($one))).flatten().flatten());
                        }
                        }
                      }
                    }).map(ESLVal.list($one,$zero,$zero.sub($one))).flatten().flatten();
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(11330,11592)").add(ESLVal.list(_v24)));
                }
                }
              }
            }));
          ESLVal ghostDistance = new ESLVal(new Function(new ESLVal("ghostDistance"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal l = $args[0];
            return min.apply(new ESLVal(1000.0),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v23 = $qualArg;
                        
                        {ESLVal g = _v23;
                        
                        return ESLVal.list(ESLVal.list(distance.apply(locX.apply(l),locY.apply(l),g.ref("getX").apply(),g.ref("getY").apply())));
                      }
                      }
                    }
                  }).map(m.ref("getGhosts").apply()).flatten().flatten());
              }
            });
          ESLVal min = new ESLVal(new Function(new ESLVal("min"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v74 = $args[0];
            ESLVal _v73 = $args[1];
            {ESLVal _v22 = _v73;
                  
                  if(_v22.isCons())
                  {ESLVal $16 = _v22.head();
                    ESLVal $17 = _v22.tail();
                    
                    {ESLVal f = $16;
                    
                    {ESLVal _v75 = $17;
                    
                    if(f.less(_v74).boolVal)
                    return min.apply(f,_v75);
                    else
                      {ESLVal _v76 = $16;
                        
                        {ESLVal _v77 = $17;
                        
                        return min.apply(_v74,_v77);
                      }
                      }
                  }
                  }
                  }
                else if(_v22.isNil())
                  return _v74;
                else return error(new ESLVal("case error at Pos(11764,11855)").add(ESLVal.list(_v22)));
                }
              }
            });
          ESLVal nextMove = new ESLVal(new Function(new ESLVal("nextMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v21 = p;
                  
                  return $ndCase.apply(_v21,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $13 = $args[0];
                  ESLVal $14 = $args[1];
                  ESLVal $15 = $args[2];
                  ESLVal $12 = $args[3];
                  {ESLVal p1 = $13;
                        
                        {ESLVal l = $14;
                        
                        {ESLVal p2 = $15;
                        
                        if(length.apply(p2).eql($one).boolVal)
                        return l;
                        else
                          return $12.apply();
                      }
                      }
                      }
                    }
                  }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return error(new ESLVal("case error at Pos(11888,11954)").add(ESLVal.list(_v21)));
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
            {ESLVal _v18 = l;
                  
                  switch(_v18.termName) {
                  case "Loc": {ESLVal $11 = _v18.termRef(0);
                    ESLVal $10 = _v18.termRef(1);
                    
                    {ESLVal _v70 = $11;
                    
                    {ESLVal _v71 = $10;
                    
                    return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $qualArg = $args[0];
                    {ESLVal _v19 = $qualArg;
                          
                          {ESLVal dx = _v19;
                          
                          return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal _v72 = $args[0];
                          {ESLVal _v20 = _v72;
                                
                                {ESLVal dy = _v20;
                                
                                return ESLVal.list((dx.eql($zero).or(dy.eql($zero)).boolVal) ? ((dx.eql($zero).and(dy.eql($zero)).not().boolVal) ? ((getSelf().ref("canMove").apply(_v70.add(dx),_v71.add(dy)).boolVal) ? (ESLVal.list(new ESLVal("Loc",_v70.add(dx),_v71.add(dy)))) : ($nil)) : ($nil)) : ($nil));
                              }
                              }
                            }
                          }).map(ESLVal.list($one,$zero,$zero.sub($one))).flatten().flatten());
                        }
                        }
                      }
                    }).map(ESLVal.list($one,$zero,$zero.sub($one))).flatten().flatten();
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(12384,12568)").add(ESLVal.list(_v18)));
                }
                }
              }
            }));
          ESLVal getDangerZones = new ESLVal(new Function(new ESLVal("getDangerZones"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal moves = $args[0];
            LetRec letrec = new LetRec() {
                  ESLVal ghostLocs = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $qualArg = $args[0];
                    {ESLVal _v17 = $qualArg;
                          
                          {ESLVal g = _v17;
                          
                          return ESLVal.list(ESLVal.list(new ESLVal("Loc",g.ref("getX").apply(),g.ref("getY").apply())));
                        }
                        }
                      }
                    }).map(m.ref("getGhosts").apply()).flatten().flatten();
                  ESLVal zones = new ESLVal(new Function(new ESLVal("zones"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v67 = $args[0];
                    ESLVal _v66 = $args[1];
                    ESLVal _v65 = $args[2];
                    if(_v66.greql(_v65).boolVal)
                          return ESLVal.list();
                          else
                            {ESLVal z = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal $qualArg = $args[0];
                                {ESLVal _v15 = $qualArg;
                                      
                                      {ESLVal l = _v15;
                                      
                                      return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          ESLVal _v68 = $args[0];
                                      {ESLVal _v16 = _v68;
                                            
                                            {ESLVal _v69 = _v16;
                                            
                                            return ESLVal.list(ESLVal.list(_v69));
                                          }
                                          }
                                        }
                                      }).map(ghostMoves.apply(l)).flatten().flatten());
                                    }
                                    }
                                  }
                                }).map(_v67).flatten().flatten();
                              
                              return zones.apply(z,_v66.add($one),_v65).cons(z);
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
                
                  return zones.apply(ghostLocs,$zero,moves);
                
              }
            });
          ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            {ESLVal dangerZones = getDangerZones.apply(n.add($one));
                  
                  LetRec letrec = new LetRec() {
                  ESLVal eatPlans = new ESLVal(new Function(new ESLVal("eatPlans"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v61 = $args[0];
                    ESLVal _v60 = $args[1];
                    ESLVal _v59 = $args[2];
                    if(_v60.greql(_v59).boolVal)
                          return _v61;
                          else
                            return eatPlans.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  ESLVal $qualArg = $args[0];
                              {ESLVal _v11 = $qualArg;
                                    
                                    {ESLVal p = _v11;
                                    
                                    return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                      public ESLVal apply(ESLVal... $args) {
                                        ESLVal _v62 = $args[0];
                                    {ESLVal _v12 = _v62;
                                          
                                          {ESLVal l = _v12;
                                          
                                          return ESLVal.list((exists.apply(new ESLVal(new Function(new ESLVal("fun40"),getSelf()) {
                                            public ESLVal apply(ESLVal... $args) {
                                              ESLVal zone = $args[0];
                                          return member.apply(l,zone);
                                            }
                                          }),take.apply(dangerZones,_v60.add($one))).not().boolVal) ? ((exists.apply(new ESLVal(new Function(new ESLVal("fun41"),getSelf()) {
                                            public ESLVal apply(ESLVal... $args) {
                                              ESLVal _v63 = $args[0];
                                          return member.apply(l,_v63);
                                            }
                                          }),_v61).not().boolVal) ? (ESLVal.list(p.cons(l))) : ($nil)) : ($nil));
                                        }
                                        }
                                      }
                                    }).map(moves.apply(p)).flatten().flatten());
                                  }
                                  }
                                }
                              }).map(_v61).flatten().flatten(),_v60.add($one),_v59);
                      }
                    });
                  ESLVal foodCount = new ESLVal(new Function(new ESLVal("foodCount"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal plan = $args[0];
                    {ESLVal[] count = new ESLVal[]{$zero};
                          
                          {{
                          ESLVal _v10 = plan;
                          while(_v10.isCons()) {
                            ESLVal l = _v10.headVal;
                            count[0] = count[0].add(food.array[locY.apply(l).intVal].array[locX.apply(l).intVal]);
                            _v10 = _v10.tailVal;}
                        }
                        return count[0];}
                        }
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
                    return max.apply(plans,moreFood);
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "eatPlans": return eatPlans;
                      
                      case "foodCount": return foodCount;
                      
                      case "moreFood": return moreFood;
                      
                      case "mostFood": return mostFood;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal eatPlans = letrec.get("eatPlans");
                
                ESLVal foodCount = letrec.get("foodCount");
                
                ESLVal moreFood = letrec.get("moreFood");
                
                ESLVal mostFood = letrec.get("mostFood");
                
                  {ESLVal _v13 = mostFood.apply(eatPlans.apply(ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()))),$zero,n));
                  
                  {ESLVal p = _v13;
                  
                  if(p.eql($null).boolVal)
                  {print.apply(new ESLVal("Yikes - no plan!"));
                  return setPlan.apply(ESLVal.list());}
                  else
                    {ESLVal _v64 = _v13;
                      
                      {print.apply(new ESLVal("eat ").add(_v64.add(new ESLVal(" ghosts = ").add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $qualArg = $args[0];
                    {ESLVal _v14 = $qualArg;
                          
                          {ESLVal g = _v14;
                          
                          return ESLVal.list(ESLVal.list(new ESLVal("Loc",g.ref("getX").apply(),g.ref("getY").apply())));
                        }
                        }
                      }
                    }).map(m.ref("getGhosts").apply()).flatten().flatten()))));
                    return setPlan.apply(butlast.apply(_v64));}
                    }
                }
                }
                
                }
              }
            });
          ESLVal flee = new ESLVal(new Function(new ESLVal("flee"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            {ESLVal dangerZones = getDangerZones.apply(n.add($one));
                  
                  LetRec letrec = new LetRec() {
                  ESLVal fleePlans = new ESLVal(new Function(new ESLVal("fleePlans"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v56 = $args[0];
                    ESLVal _v55 = $args[1];
                    ESLVal _v54 = $args[2];
                    if(_v55.greql(_v54).boolVal)
                          return _v56;
                          else
                            return fleePlans.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  ESLVal $qualArg = $args[0];
                              {ESLVal _v6 = $qualArg;
                                    
                                    {ESLVal p = _v6;
                                    
                                    return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                      public ESLVal apply(ESLVal... $args) {
                                        ESLVal _v57 = $args[0];
                                    {ESLVal _v7 = _v57;
                                          
                                          {ESLVal l = _v7;
                                          
                                          return ESLVal.list((exists.apply(new ESLVal(new Function(new ESLVal("fun42"),getSelf()) {
                                            public ESLVal apply(ESLVal... $args) {
                                              ESLVal zone = $args[0];
                                          return member.apply(l,zone);
                                            }
                                          }),take.apply(dangerZones,_v55.add($one))).not().boolVal) ? ((exists.apply(new ESLVal(new Function(new ESLVal("fun43"),getSelf()) {
                                            public ESLVal apply(ESLVal... $args) {
                                              ESLVal _v58 = $args[0];
                                          return member.apply(l,_v58);
                                            }
                                          }),_v56).not().boolVal) ? (ESLVal.list(p.cons(l))) : ($nil)) : ($nil));
                                        }
                                        }
                                      }
                                    }).map(moves.apply(p)).flatten().flatten());
                                  }
                                  }
                                }
                              }).map(_v56).flatten().flatten(),_v55.add($one),_v54);
                      }
                    });
                  
                  public ESLVal get(String name) {
                    switch(name) {
                      case "fleePlans": return fleePlans;
                      
                      default: throw new Error("cannot find letrec binding");
                    }
                    }
                  };
                ESLVal fleePlans = letrec.get("fleePlans");
                
                  {ESLVal _v8 = fleePlans.apply(ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()))),$zero,n);
                  
                  if(_v8.isCons())
                  {ESLVal $8 = _v8.head();
                    ESLVal $9 = _v8.tail();
                    
                    {ESLVal p = $8;
                    
                    {ESLVal ps = $9;
                    
                    {print.apply(new ESLVal("flee ").add(p.add(new ESLVal(" ghosts = ").add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v9 = $qualArg;
                        
                        {ESLVal g = _v9;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Loc",g.ref("getX").apply(),g.ref("getY").apply())));
                      }
                      }
                    }
                  }).map(m.ref("getGhosts").apply()).flatten().flatten()))));
                  return setPlan.apply(butlast.apply(p));}
                  }
                  }
                  }
                else if(_v8.isNil())
                  {print.apply(new ESLVal("Yikes - no plan!"));
                  return setPlan.apply(ESLVal.list());}
                else return error(new ESLVal("case error at Pos(14951,15275)").add(ESLVal.list(_v8)));
                }
                
                }
              }
            });
          ESLVal doPlan = new ESLVal(new Function(new ESLVal("doPlan"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(plan.eql(ESLVal.list()).boolVal)
                  return replan.apply();
                  else
                    {ESLVal _v4 = plan;
                      
                      return $ndCase.apply(_v4,ESLVal.list(new ESLVal("$selectRight",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal $4 = $args[0];
                      ESLVal $5 = $args[1];
                      ESLVal $3 = $args[2];
                      {ESLVal p1 = $4;
                            
                            {ESLVal l = $5;
                            
                            {setPlan.apply(p1);
                          print.apply(new ESLVal("plan = ").add(plan));
                          {ESLVal _v5 = l;
                            
                            switch(_v5.termName) {
                            case "Loc": {ESLVal $7 = _v5.termRef(0);
                              ESLVal $6 = _v5.termRef(1);
                              
                              {ESLVal _v52 = $7;
                              
                              {ESLVal _v53 = $6;
                              
                              {getSelf().ref("moveTo").apply(_v52,_v53);
                            print.apply(new ESLVal("move ").add(l));
                            Lib.send(gui,"Player",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            m.ref("eat").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                            return wait.apply(delay);}
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(15468,15791)").add(ESLVal.list(_v5)));
                          }
                          }}
                          }
                          }
                        }
                      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          return error(new ESLVal("case error at Pos(15360,15809)").add(ESLVal.list(_v4)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v27 = $m;
            
            {ESLVal _v81 = _v27;
            
            {sendSuper(_v81);
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
                return forallArray.apply(new ESLVal(new Function(new ESLVal("fun44"),getSelf()) {
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
              {ESLVal _v51 = $t;
                
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