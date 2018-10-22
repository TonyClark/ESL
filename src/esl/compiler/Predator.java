package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Predator {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal board = ESLVal.list();
  private static ESLVal messages = ESLVal.list();
  private static ESLVal abs = new ESLVal(new Function(new ESLVal("abs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  if(n.less($zero).boolVal)
        return $zero.sub(n);
        else
          return n;
    }
  });
  private static ESLVal stop = $false;
  private static ESLVal predator = new ESLVal(new Function(new ESLVal("predator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal[] x = new ESLVal[]{$args[1]};
  ESLVal[] y = new ESLVal[]{$args[2]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("predator")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return x[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return y[0];
              }
            });
          ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return id;
              }
            });
          ESLVal at = new ESLVal(new Function(new ESLVal("at"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal px = $args[0];
            ESLVal py = $args[1];
            return px.eql(x[0]).and(py.eql(y[0]));
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal dx = $args[0];
            ESLVal dy = $args[1];
            if(legalPredatorPos.apply(x[0].add(dx),y[0].add(dy)).boolVal)
                  {x[0] = x[0].add(dx);
                  y[0] = y[0].add(dy);
                  {messages = messages.add(ESLVal.list(new ESLVal("MovePredator",id,x[0],y[0])));
                  return $null;}}
                  else
                    return $null;
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Move": {
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return ((Supplier<ESLVal>)() -> { 
                if(turn.eql(id).boolVal)
                  {turn = turn.add($one).mod(numOfPredators.add($one));
                  {ESLVal dx = ((Supplier<ESLVal>)() -> { 
                        if(thePrey.ref("getX").apply().gre(x[0]).boolVal)
                          return $one;
                          else
                            if(thePrey.ref("getX").apply().less(x[0]).boolVal)
                              return $zero.sub($one);
                              else
                                return $zero;
                      }).get();
                    ESLVal dy = ((Supplier<ESLVal>)() -> { 
                        if(thePrey.ref("getY").apply().gre(y[0]).boolVal)
                          return $one;
                          else
                            if(thePrey.ref("getY").apply().less(y[0]).boolVal)
                              return $zero.sub($one);
                              else
                                return $zero;
                      }).get();
                    
                    if(dy.neql($zero).and(legalPredatorPos.apply(x[0],y[0].add(dy))).boolVal)
                    return move.apply($zero,dy);
                    else
                      if(dx.neql($zero).and(legalPredatorPos.apply(x[0].add(dx),y[0])).boolVal)
                        return move.apply(dx,$zero);
                        else
                          return probably(new ESLVal(50),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                return move.apply($zero,$one.sub(random.apply(new ESLVal(3))));
                              }
                            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                return move.apply($one.sub(random.apply(new ESLVal(3))),$zero);
                              }
                            }));
                  }}
                  else
                    return $null;
              }).get();
                }},messages);
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "at": return at;
              case "getId": return getId;
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
  private static ESLVal prey = new ESLVal(new Function(new ESLVal("prey"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] x = new ESLVal[]{$args[0]};
  ESLVal[] y = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("prey")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return x[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return y[0];
              }
            });
          ESLVal at = new ESLVal(new Function(new ESLVal("at"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal px = $args[0];
            ESLVal py = $args[1];
            return px.eql(x[0]).and(py.eql(y[0]));
              }
            });
          ESLVal dir = new ESLVal(new Function(new ESLVal("dir"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            if(n.less($zero).boolVal)
                  return $zero.sub($one);
                  else
                    return $one;
              }
            });
          ESLVal dirX = $one.sub(random.apply(new ESLVal(3)));
          ESLVal dirY = $one.sub(random.apply(new ESLVal(3)));
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal dx = $args[0];
            ESLVal dy = $args[1];
            if(legalPreyPos.apply(x[0].add(dx),y[0].add(dy)).boolVal)
                  {x[0] = x[0].add(dx);
                  y[0] = y[0].add(dy);
                  {messages = messages.add(ESLVal.list(new ESLVal("MovePrey",x[0],y[0])));
                  return $null;}}
                  else
                    return $null;
              }
            });
          ESLVal predatorWins = new ESLVal(new Function(new ESLVal("predatorWins"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("Predator Wins"));
                {stop = $true;
                return $null;}}
              }
            });
          ESLVal cannotMove = new ESLVal(new Function(new ESLVal("cannotMove"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return legalPreyPos.apply(x[0].sub($one),y[0].sub($one)).not().and(legalPreyPos.apply(x[0].sub($one),y[0]).not().and(legalPreyPos.apply(x[0].add($one),y[0]).not().and(legalPreyPos.apply(x[0],y[0].sub($one)).not().and(legalPreyPos.apply(x[0],y[0].add($one)).not().and(legalPreyPos.apply(x[0].add($one),y[0].add($one)).not())))));
              }
            });
          ESLVal changeDir = new ESLVal(new Function(new ESLVal("changeDir"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(legalPreyPos.apply(x[0].sub($one),y[0].sub($one)).boolVal)
                  {dirX = $zero.sub($one);
                  {dirY = $zero.sub($one);
                  return $null;}}
                  else
                    if(legalPreyPos.apply(x[0].sub($one),y[0]).boolVal)
                      {dirX = $zero.sub($one);
                      {dirY = $zero;
                      return $null;}}
                      else
                        if(legalPreyPos.apply(x[0],y[0].sub($one)).boolVal)
                          {dirX = $zero;
                          {dirY = $zero.sub($one);
                          return $null;}}
                          else
                            if(legalPreyPos.apply(x[0].add($one),y[0]).boolVal)
                              {dirX = $one;
                              {dirY = $zero;
                              return $null;}}
                              else
                                if(legalPreyPos.apply(x[0],y[0].add($one)).boolVal)
                                  {dirX = $zero;
                                  {dirY = $one;
                                  return $null;}}
                                  else
                                    if(legalPreyPos.apply(x[0].add($one),y[0].add($one)).boolVal)
                                      {dirX = $one;
                                      {dirY = $one;
                                      return $null;}}
                                      else
                                        return $null;
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Move": {
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return ((Supplier<ESLVal>)() -> { 
                if(turn.eql(numOfPredators).boolVal)
                  {turn = turn.add($one).mod(numOfPredators.add($one));
                  if(cannotMove.apply().boolVal)
                    return predatorWins.apply();
                    else
                      if(legalPreyPos.apply(x[0].add(dirX),y[0].add(dirY)).boolVal)
                        return move.apply(dirX,dirY);
                        else
                          return changeDir.apply();}
                  else
                    return $null;
              }).get();
                }},messages);
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "at": return at;
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
  private static ESLVal size = new ESLVal(10);
  private static ESLVal width = new ESLVal(100);
  private static ESLVal height = new ESLVal(100);
  private static ESLVal numOfPredators = new ESLVal(200);
  private static ESLVal numOfRocks = random.apply(new ESLVal(100)).add(new ESLVal(100));
  private static ESLVal points = ((Supplier<ESLVal>)() -> { 
    LetRec letrec = new LetRec() {
      ESLVal generate = new ESLVal(new Function(new ESLVal("generate"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal ps = $args[0];
        ESLVal n = $args[1];
        if(n.eql($zero).boolVal)
              return ESLVal.list();
              else
                {ESLVal x = random.apply(width);
                  ESLVal y = random.apply(height);
                  
                  if(member.apply(new ESLVal("Point",x,y),ps).boolVal)
                  return generate.apply(ps,n);
                  else
                    return generate.apply(ps.cons(new ESLVal("Point",x,y)),n.sub($one)).cons(new ESLVal("Point",x,y));
                }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "generate": return generate;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal generate = letrec.get("generate");
    
      return generate.apply(ESLVal.list(),numOfPredators.add($one.add(numOfRocks)));
    
  }).get();
  private static ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  switch(p.termName) {
        case "Point": {ESLVal $1 = p.termRef(0);
          ESLVal $2 = p.termRef(1);
          
          {ESLVal x = $1;
          
          {ESLVal y = $2;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5369,5406)"));
      }
    }
  });
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  switch(p.termName) {
        case "Point": {ESLVal $3 = p.termRef(0);
          ESLVal $4 = p.termRef(1);
          
          {ESLVal x = $3;
          
          {ESLVal y = $4;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5431,5468)"));
      }
    }
  });
  private static ESLVal limit = new ESLVal(10000);
  private static ESLVal turn = $zero;
  private static ESLVal rocks = drop.apply(points,numOfPredators.add($one));
  private static ESLVal predators = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal p = $qualArg;
        
        return ESLVal.list(ESLVal.list(newActor(predator,new ESLVal(new Actor()),p,pointX.apply(nth.apply(points,p)),pointY.apply(nth.apply(points,p)))));
      }
    }
  }).map($zero.to(numOfPredators)).flatten().flatten();
  private static ESLVal thePrey = newActor(prey,new ESLVal(new Actor()),pointX.apply(nth.apply(points,numOfPredators)),pointY.apply(nth.apply(points,numOfPredators)));
  private static ESLVal onBoard = new ESLVal(new Function(new ESLVal("onBoard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return x.gre($zero.sub($one)).and(x.less(width.add($one)).and(y.gre($zero.sub($one)).and(y.less(height.add($one)))));
    }
  });
  private static ESLVal onRock = new ESLVal(new Function(new ESLVal("onRock"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return member.apply(new ESLVal("Point",x,y),rocks);
    }
  });
  private static ESLVal legalPreyPos = new ESLVal(new Function(new ESLVal("legalPreyPos"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return onRock.apply(x,y).not().and(onBoard.apply(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun468"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        return p.ref("at").apply(x,y);
          }
        }),predators).not()));
    }
  });
  private static ESLVal legalPredatorPos = new ESLVal(new Function(new ESLVal("legalPredatorPos"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return onRock.apply(x,y).not().and(onBoard.apply(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun469"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        return p.ref("at").apply(x,y);
          }
        }),predators).not().and(thePrey.ref("at").apply(x,y).not())));
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(stop.not().and(n.less(limit)).boolVal)
            {{
              ESLVal _v1 = predators;
              while(_v1.isCons()) {
                if(_v1.isCons())
                  {ESLVal $5 = _v1.head();
                    ESLVal $6 = _v1.tail();
                    
                    {ESLVal p = $5;
                    
                    {ESLVal _v2 = $6;
                    
                    {_v1 = _v2;
                  Lib.send(p,"Move");}
                  }
                  }
                  }
                else if(_v1.isNil())
                  error(new ESLVal("case error at Pos(6374,6430)"));
                else error(new ESLVal("case error at Pos(6374,6430)"));
                }
            }
            Lib.send(thePrey,"Move");
            wait.apply($one);}
            else
              {ESLVal _v3 = $t;
                
                if($true.boolVal)
                {print.apply(new ESLVal("Messages: ").add(length.apply(messages).add(new ESLVal(" ").add(messages))));
                stopAll.apply();}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}