package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Predator {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal map = $args[0];
  ESLVal op = $args[1];
  ESLVal empty = $args[2];
  ESLVal list = $args[3];
  {ESLVal _v1 = list;
        
        if(_v1.isCons())
        {ESLVal $1 = _v1.head();
          ESLVal $2 = _v1.tail();
          
          {ESLVal h = $1;
          
          {ESLVal t = $2;
          
          return op.apply(map.apply(h),foldr.apply(map,op,empty,t));
        }
        }
        }
      else if(_v1.isNil())
        return empty;
      else return error(new ESLVal("case error at Pos(792,882)").add(ESLVal.list(_v1)));
      }
    }
  });
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
          }
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
                  return new ESLVal(-1);
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
            return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return ((Supplier<ESLVal>)() -> { 
                    if(legalPreyPos.apply(x[0].add(dx),y[0].add(dy)).boolVal)
                      {x[0] = x[0].add(dx);
                      y[0] = y[0].add(dy);
                      print.apply(new ESLVal("prey moved to ").add(x[0].add(new ESLVal(" ").add(y[0]))));
                      {messages = messages.add(ESLVal.list(new ESLVal("MovePrey",x[0],y[0])));
                      return $null;}}
                      else
                        return $null;
                  }).get();
                    }},messages);
              }
            });
          ESLVal predatorWins = new ESLVal(new Function(new ESLVal("predatorWins"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("predator wins!"));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }
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
  private static ESLVal size = new ESLVal(60);
  private static ESLVal width = new ESLVal(10);
  private static ESLVal height = new ESLVal(10);
  private static ESLVal numOfPredators = new ESLVal(3);
  private static ESLVal numOfRocks = random.apply(new ESLVal(30)).add(new ESLVal(5));
  private static ESLVal points = ((Supplier<ESLVal>)() -> { 
    { LetRec letrec = new LetRec() {
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
    
      return generate.apply(ESLVal.list(),numOfPredators.add($one.add(numOfRocks)));}
    
  }).get();
  private static ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v4 = p;
        
        switch(_v4.termName) {
        case "Point": {ESLVal $4 = _v4.termRef(0);
          ESLVal $3 = _v4.termRef(1);
          
          {ESLVal x = $4;
          
          {ESLVal y = $3;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5586,5613)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v5 = p;
        
        switch(_v5.termName) {
        case "Point": {ESLVal $6 = _v5.termRef(0);
          ESLVal $5 = _v5.termRef(1);
          
          {ESLVal x = $6;
          
          {ESLVal y = $5;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5638,5665)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal limit = new ESLVal(10000);
  private static ESLVal turn = $zero;
  private static ESLVal rocks = drop.apply(points,numOfPredators.add($one));
  private static ESLVal predators = new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal p = $l0.head();
        $l0 = $l0.tail();
        $v.add(newActor(predator,new ESLVal(new Actor()),p,pointX.apply(nth.apply(points,p)),pointY.apply(nth.apply(points,p))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(numOfPredators));
  private static ESLVal thePrey = newActor(prey,new ESLVal(new Actor()),pointX.apply(nth.apply(points,numOfPredators)),pointY.apply(nth.apply(points,numOfPredators)));
  private static ESLVal onBoard = new ESLVal(new Function(new ESLVal("onBoard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return x.greql($zero).and(x.less(width).and(y.greql($zero).and(y.less(height))));
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
  return onRock.apply(x,y).not().and(onBoard.apply(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun57"),getSelf()) {
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
  return onRock.apply(x,y).not().and(onBoard.apply(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun58"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        return p.ref("at").apply(x,y);
          }
        }),predators).not().and(thePrey.ref("at").apply(x,y).not())));
    }
  });
  private static ESLVal mapMessage = new ESLVal(new Function(new ESLVal("mapMessage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v6 = m;
        
        switch(_v6.termName) {
        case "MovePredator": {ESLVal $11 = _v6.termRef(0);
          ESLVal $10 = _v6.termRef(1);
          ESLVal $9 = _v6.termRef(2);
          
          {ESLVal i = $11;
          
          {ESLVal x0 = $10;
          
          {ESLVal y0 = $9;
          
          return new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal y = $l0.head();
                $l0 = $l0.tail();
                $v.add(new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal x = $l0.head();
                $l0 = $l0.tail();
                $v.add(((Supplier<ESLVal>)() -> { 
            if(x.eql(x0).and(y.eql(y0)).boolVal)
              return new ESLVal("PredLoc",new ESLVal[]{});
              else
                if(onRock.apply(x,y).boolVal)
                  return new ESLVal("Rock",new ESLVal[]{});
                  else
                    return new ESLVal("EmptyLoc",new ESLVal[]{});
          }).get());
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(width)));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(height));
        }
        }
        }
        }
      case "MovePrey": {ESLVal $8 = _v6.termRef(0);
          ESLVal $7 = _v6.termRef(1);
          
          {ESLVal x0 = $8;
          
          {ESLVal y0 = $7;
          
          return new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal y = $l0.head();
                $l0 = $l0.tail();
                $v.add(new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal x = $l0.head();
                $l0 = $l0.tail();
                $v.add(((Supplier<ESLVal>)() -> { 
            if(x.eql(x0).and(y.eql(y0)).boolVal)
              return new ESLVal("PreyLoc",new ESLVal[]{});
              else
                if(onRock.apply(x,y).boolVal)
                  return new ESLVal("Rock",new ESLVal[]{});
                  else
                    return new ESLVal("EmptyLoc",new ESLVal[]{});
          }).get());
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(width)));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(height));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6516,6829)").add(ESLVal.list(_v6)));
      }
      }
    }
  });
  private static ESLVal mergeLocations = new ESLVal(new Function(new ESLVal("mergeLocations"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l1 = $args[0];
  ESLVal l2 = $args[1];
  {ESLVal _v7 = l1;
        ESLVal _v8 = l2;
        
        switch(_v7.termName) {
        case "EmptyLoc": {
          switch(_v8.termName) {
          case "EmptyLoc": {
            return new ESLVal("EmptyLoc",new ESLVal[]{});
          }
          default: {ESLVal _v50 = _v8;
            
            return _v50;
          }
        }
        }
      case "PredLoc": {
          switch(_v8.termName) {
          case "PredLoc": {
            return new ESLVal("PredLoc",new ESLVal[]{});
          }
          default: switch(_v8.termName) {
            case "EmptyLoc": {
              {ESLVal _v49 = _v7;
              
              return _v49;
            }
            }
            default: return error(new ESLVal("case error at Pos(6889,7097)").add(ESLVal.list(_v7,_v8)));
          }
        }
        }
      case "PreyLoc": {
          switch(_v8.termName) {
          case "PreyLoc": {
            return new ESLVal("PreyLoc",new ESLVal[]{});
          }
          default: switch(_v8.termName) {
            case "EmptyLoc": {
              {ESLVal _v48 = _v7;
              
              return _v48;
            }
            }
            default: return error(new ESLVal("case error at Pos(6889,7097)").add(ESLVal.list(_v7,_v8)));
          }
        }
        }
      case "Rock": {
          switch(_v8.termName) {
          case "Rock": {
            return new ESLVal("Rock",new ESLVal[]{});
          }
          default: switch(_v8.termName) {
            case "EmptyLoc": {
              {ESLVal _v47 = _v7;
              
              return _v47;
            }
            }
            default: return error(new ESLVal("case error at Pos(6889,7097)").add(ESLVal.list(_v7,_v8)));
          }
        }
        }
        default: switch(_v8.termName) {
          case "EmptyLoc": {
            {ESLVal _v51 = _v7;
            
            return _v51;
          }
          }
          default: return error(new ESLVal("case error at Pos(6889,7097)").add(ESLVal.list(_v7,_v8)));
        }
      }
      }
    }
  });
  private static ESLVal mergeBoards = new ESLVal(new Function(new ESLVal("mergeBoards"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b1 = $args[0];
  ESLVal b2 = $args[1];
  return new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal y = $l0.head();
              $l0 = $l0.tail();
              $v.add(new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal x = $l0.head();
              $l0 = $l0.tail();
              $v.add(mergeLocations.apply(nth.apply(nth.apply(b1,y),x),nth.apply(nth.apply(b2,y),x)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(width)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(height));
    }
  });
  private static ESLVal mergeDisplays = new ESLVal(new Function(new ESLVal("mergeDisplays"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v9 = d1;
        ESLVal _v10 = d2;
        
        switch(_v9.termName) {
        case "Tree": {ESLVal $14 = _v9.termRef(0);
          ESLVal $13 = _v9.termRef(1);
          ESLVal $12 = _v9.termRef(2);
          
          switch(_v10.termName) {
          case "Tree": {ESLVal $17 = _v10.termRef(0);
            ESLVal $16 = _v10.termRef(1);
            ESLVal $15 = _v10.termRef(2);
            
            {ESLVal w1 = $14;
            
            {ESLVal h1 = $13;
            
            {ESLVal t1 = $12;
            
            {ESLVal w2 = $17;
            
            {ESLVal h2 = $16;
            
            {ESLVal t2 = $15;
            
            return new ESLVal("Tree",w1,h1,mergeTrees.apply(t1,t2));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(7367,7497)").add(ESLVal.list(_v9,_v10)));
        }
        }
        default: return error(new ESLVal("case error at Pos(7367,7497)").add(ESLVal.list(_v9,_v10)));
      }
      }
    }
  });
  private static ESLVal getBoard = new ESLVal(new Function(new ESLVal("getBoard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ms = $args[0];
  return foldr.apply(mapMessage,mergeBoards,ESLVal.list(),ms);
    }
  });
  private static ESLVal hist = new ESLVal(new Function(new ESLVal("hist"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal h = $args[1];
  {ESLVal _v11 = h;
        
        if(_v11.isCons())
        {ESLVal $18 = _v11.head();
          ESLVal $19 = _v11.tail();
          
          {ESLVal _v45 = _v11;
          
          {ESLVal m = last.apply(_v45);
          ESLVal hh = butlast.apply(_v45);
          
          return hist.apply(id,hh).add(ESLVal.list(combine.apply(id,ESLVal.list(),hh,m)));
        }
        }
        }
      else if(_v11.isNil())
        return ESLVal.list();
      else {ESLVal _v46 = _v11;
          
          {ESLVal m = last.apply(_v46);
          ESLVal hh = butlast.apply(_v46);
          
          return hist.apply(id,hh).add(ESLVal.list(combine.apply(id,ESLVal.list(),hh,m)));
        }
        }
      }
    }
  });
  private static ESLVal combine = new ESLVal(new Function(new ESLVal("combine"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal ids = $args[1];
  ESLVal h = $args[2];
  ESLVal m = $args[3];
  {ESLVal _v12 = h;
        
        if(_v12.isCons())
        {ESLVal $20 = _v12.head();
          ESLVal $21 = _v12.tail();
          
          {ESLVal _v43 = _v12;
          
          {ESLVal mm = last.apply(_v43);
          ESLVal hh = butlast.apply(_v43);
          
          if(member.apply(id.apply(m),ids).boolVal)
          return combine.apply(id,ids,hh,mm);
          else
            return combine.apply(id,ids.add(ESLVal.list(id.apply(m))),hh,mm).add(ESLVal.list(m));
        }
        }
        }
      else if(_v12.isNil())
        if(member.apply(id.apply(m),ids).boolVal)
          return ESLVal.list();
          else
            return ESLVal.list(m);
      else {ESLVal _v44 = _v12;
          
          {ESLVal mm = last.apply(_v44);
          ESLVal hh = butlast.apply(_v44);
          
          if(member.apply(id.apply(m),ids).boolVal)
          return combine.apply(id,ids,hh,mm);
          else
            return combine.apply(id,ids.add(ESLVal.list(id.apply(m))),hh,mm).add(ESLVal.list(m));
        }
        }
      }
    }
  });
  private static ESLVal emptyBoard = new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal y = $l0.head();
        $l0 = $l0.tail();
        $v.add(new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal x = $l0.head();
        $l0 = $l0.tail();
        $v.add(((Supplier<ESLVal>)() -> { 
    if(onRock.apply(x,y).boolVal)
      return new ESLVal("Rock",new ESLVal[]{});
      else
        return new ESLVal("EmptyLoc",new ESLVal[]{});
  }).get());
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(width)));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(height));
  private static ESLVal messageId = new ESLVal(new Function(new ESLVal("messageId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v13 = m;
        
        switch(_v13.termName) {
        case "MovePredator": {ESLVal $24 = _v13.termRef(0);
          ESLVal $23 = _v13.termRef(1);
          ESLVal $22 = _v13.termRef(2);
          
          {ESLVal id = $24;
          
          {ESLVal x = $23;
          
          {ESLVal y = $22;
          
          return id;
        }
        }
        }
        }
        default: {ESLVal _v42 = _v13;
          
          return new ESLVal(-1);
        }
      }
      }
    }
  });
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ms = $args[0];
  {ESLVal h = hist.apply(messageId,ms);
        
        return map.apply(new ESLVal(new Function(new ESLVal("fun59"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v41 = $args[0];
        return foldr.apply(mapMessage,mergeBoards,emptyBoard,_v41);
          }
        }),h).cons(emptyBoard);
      }
    }
  });
  private static ESLVal space = new ESLVal("TreeNode",new ESLVal("Rectangle",$zero,$zero,size,size,new ESLVal("")));
  private static ESLVal rockIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/rock.png")));
  private static ESLVal predIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/wolf.jpg")));
  private static ESLVal preyIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/sheep.jpg")));
  private static ESLVal mergeTrees = new ESLVal(new Function(new ESLVal("mergeTrees"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v14 = d1;
        ESLVal _v15 = d2;
        
        switch(_v14.termName) {
        case "VBox": {ESLVal $44 = _v14.termRef(0);
          ESLVal $43 = _v14.termRef(1);
          
          switch(_v15.termName) {
          case "VBox": {ESLVal $46 = _v15.termRef(0);
            ESLVal $45 = _v15.termRef(1);
            
            {ESLVal p1 = $44;
            
            {ESLVal l1 = $43;
            
            {ESLVal p2 = $46;
            
            {ESLVal l2 = $45;
            
            return new ESLVal("VBox",p1,new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal i = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(mergeTrees.apply(nth.apply(l1,i),nth.apply(l2,i)));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(length.apply(l1))));
          }
          }
          }
          }
          }
          default: switch(_v15.termName) {
            case "Padding": {ESLVal $31 = _v15.termRef(0);
              
              {ESLVal t = _v14;
              
              {ESLVal p2 = $31;
              
              return t;
            }
            }
            }
          case "TreeNode": {ESLVal $25 = _v15.termRef(0);
              
              switch($25.termName) {
              case "Rectangle": {ESLVal $30 = $25.termRef(0);
                ESLVal $29 = $25.termRef(1);
                ESLVal $28 = $25.termRef(2);
                ESLVal $27 = $25.termRef(3);
                ESLVal $26 = $25.termRef(4);
                
                {ESLVal _v31 = _v14;
                
                {ESLVal w = $30;
                
                {ESLVal h = $29;
                
                {ESLVal s1 = $28;
                
                {ESLVal s2 = $27;
                
                {ESLVal p = $26;
                
                return _v31;
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal _v32 = _v14;
                
                {ESLVal _v33 = _v15;
                
                return _v32;
              }
              }
            }
            }
            default: {ESLVal _v34 = _v14;
              
              {ESLVal _v35 = _v15;
              
              return _v34;
            }
            }
          }
        }
        }
      case "HBox": {ESLVal $40 = _v14.termRef(0);
          ESLVal $39 = _v14.termRef(1);
          
          switch(_v15.termName) {
          case "HBox": {ESLVal $42 = _v15.termRef(0);
            ESLVal $41 = _v15.termRef(1);
            
            {ESLVal p1 = $40;
            
            {ESLVal l1 = $39;
            
            {ESLVal p2 = $42;
            
            {ESLVal l2 = $41;
            
            return new ESLVal("HBox",p1,new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal i = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(mergeTrees.apply(nth.apply(l1,i),nth.apply(l2,i)));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(length.apply(l1))));
          }
          }
          }
          }
          }
          default: switch(_v15.termName) {
            case "Padding": {ESLVal $31 = _v15.termRef(0);
              
              {ESLVal t = _v14;
              
              {ESLVal p2 = $31;
              
              return t;
            }
            }
            }
          case "TreeNode": {ESLVal $25 = _v15.termRef(0);
              
              switch($25.termName) {
              case "Rectangle": {ESLVal $30 = $25.termRef(0);
                ESLVal $29 = $25.termRef(1);
                ESLVal $28 = $25.termRef(2);
                ESLVal $27 = $25.termRef(3);
                ESLVal $26 = $25.termRef(4);
                
                {ESLVal _v26 = _v14;
                
                {ESLVal w = $30;
                
                {ESLVal h = $29;
                
                {ESLVal s1 = $28;
                
                {ESLVal s2 = $27;
                
                {ESLVal p = $26;
                
                return _v26;
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal _v27 = _v14;
                
                {ESLVal _v28 = _v15;
                
                return _v27;
              }
              }
            }
            }
            default: {ESLVal _v29 = _v14;
              
              {ESLVal _v30 = _v15;
              
              return _v29;
            }
            }
          }
        }
        }
      case "Padding": {ESLVal $38 = _v14.termRef(0);
          
          {ESLVal p1 = $38;
          
          {ESLVal t = _v15;
          
          return t;
        }
        }
        }
      case "TreeNode": {ESLVal $32 = _v14.termRef(0);
          
          switch($32.termName) {
          case "Rectangle": {ESLVal $37 = $32.termRef(0);
            ESLVal $36 = $32.termRef(1);
            ESLVal $35 = $32.termRef(2);
            ESLVal $34 = $32.termRef(3);
            ESLVal $33 = $32.termRef(4);
            
            {ESLVal w = $37;
            
            {ESLVal h = $36;
            
            {ESLVal s1 = $35;
            
            {ESLVal s2 = $34;
            
            {ESLVal p = $33;
            
            {ESLVal _v20 = _v15;
            
            return _v20;
          }
          }
          }
          }
          }
          }
          }
          default: switch(_v15.termName) {
            case "Padding": {ESLVal $31 = _v15.termRef(0);
              
              {ESLVal t = _v14;
              
              {ESLVal p2 = $31;
              
              return t;
            }
            }
            }
          case "TreeNode": {ESLVal $25 = _v15.termRef(0);
              
              switch($25.termName) {
              case "Rectangle": {ESLVal $30 = $25.termRef(0);
                ESLVal $29 = $25.termRef(1);
                ESLVal $28 = $25.termRef(2);
                ESLVal $27 = $25.termRef(3);
                ESLVal $26 = $25.termRef(4);
                
                {ESLVal _v21 = _v14;
                
                {ESLVal w = $30;
                
                {ESLVal h = $29;
                
                {ESLVal s1 = $28;
                
                {ESLVal s2 = $27;
                
                {ESLVal p = $26;
                
                return _v21;
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal _v22 = _v14;
                
                {ESLVal _v23 = _v15;
                
                return _v22;
              }
              }
            }
            }
            default: {ESLVal _v24 = _v14;
              
              {ESLVal _v25 = _v15;
              
              return _v24;
            }
            }
          }
        }
        }
        default: switch(_v15.termName) {
          case "Padding": {ESLVal $31 = _v15.termRef(0);
            
            {ESLVal t = _v14;
            
            {ESLVal p2 = $31;
            
            return t;
          }
          }
          }
        case "TreeNode": {ESLVal $25 = _v15.termRef(0);
            
            switch($25.termName) {
            case "Rectangle": {ESLVal $30 = $25.termRef(0);
              ESLVal $29 = $25.termRef(1);
              ESLVal $28 = $25.termRef(2);
              ESLVal $27 = $25.termRef(3);
              ESLVal $26 = $25.termRef(4);
              
              {ESLVal _v36 = _v14;
              
              {ESLVal w = $30;
              
              {ESLVal h = $29;
              
              {ESLVal s1 = $28;
              
              {ESLVal s2 = $27;
              
              {ESLVal p = $26;
              
              return _v36;
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal _v37 = _v14;
              
              {ESLVal _v38 = _v15;
              
              return _v37;
            }
            }
          }
          }
          default: {ESLVal _v39 = _v14;
            
            {ESLVal _v40 = _v15;
            
            return _v39;
          }
          }
        }
      }
      }
    }
  });
  private static ESLVal mapBoard = new ESLVal(new Function(new ESLVal("mapBoard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal mapRow = new ESLVal(new Function(new ESLVal("mapRow"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal row = $args[0];
          return new ESLVal("HBox",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal l = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(((Supplier<ESLVal>)() -> { 
                  {ESLVal _v16 = l;
                    
                    switch(_v16.termName) {
                    case "PredLoc": {
                      return predIcon;
                    }
                  case "PreyLoc": {
                      return preyIcon;
                    }
                  case "EmptyLoc": {
                      return space;
                    }
                  case "Rock": {
                      return rockIcon;
                    }
                    default: return error(new ESLVal("case error at Pos(9547,9635)").add(ESLVal.list(_v16)));
                  }
                  }
                }).get());
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(row));
            }
          });
        
        return new ESLVal("Tree",width.mul(size),height.mul(size),new ESLVal("VBox",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal y = $l0.head();
              $l0 = $l0.tail();
              $v.add(mapRow.apply(nth.apply(b,y)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(height))));
      }
    }
  });
  private static ESLVal omega = new ESLVal(new Function(new ESLVal("omega"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal events = $args[0];
  ESLVal id = $args[1];
  ESLVal e = $args[2];
  ESLVal oplus = $args[3];
  ESLVal epsilon = $args[4];
  {ESLVal states = hist.apply(id,events);
        
        {ESLVal semantics = map.apply(new ESLVal(new Function(new ESLVal("fun60"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ms = $args[0];
          return foldr.apply(e,oplus,epsilon,ms);
            }
          }),states);
        
        return semantics;
      }
      }
    }
  });
  private static ESLVal mapBoth = new ESLVal(new Function(new ESLVal("mapBoth"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  return mapBoard.apply(mapMessage.apply(m));
    }
  });
  private static ESLVal movePredatorIntoPosition = new ESLVal(new Function(new ESLVal("movePredatorIntoPosition"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  return new ESLVal("MovePredator",p.ref("getId").apply(),p.ref("getX").apply(),p.ref("getY").apply());
    }
  });
  private static ESLVal movePreyIntoPosition = new ESLVal("MovePrey",thePrey.ref("getX").apply(),thePrey.ref("getY").apply());
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v18 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v18)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(stop.not().and(n.less(limit)).boolVal)
            {{
              ESLVal _v17 = predators;
              while(_v17.isCons()) {
                ESLVal p = _v17.headVal;
                Lib.send(p,"Move");
                _v17 = _v17.tailVal;}
            }
            Lib.send(thePrey,"Move");}
            else
              {ESLVal _v19 = $t;
                
                if($true.boolVal)
                {ESLVal film = omega.apply(messages,messageId,mapBoth,mergeDisplays,mapBoard.apply(emptyBoard));
                  
                  {print.apply(new ESLVal("create filmstrip..."));
                Lib.send(edb,"Filmstrip",new ESLVal("predator"),film);
                stopAll.apply();}
                }
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {messages = ESLVal.list(movePreyIntoPosition).add(map.apply(movePredatorIntoPosition,predators));
                return $null;}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}