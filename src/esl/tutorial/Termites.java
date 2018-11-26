package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Termites {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal size = new ESLVal(120);
  private static ESLVal limit = new ESLVal(40000);
  private static ESLVal numOfTermites = new ESLVal(600);
  private static ESLVal twig = new ESLVal("black");
  private static ESLVal background = new ESLVal("white");
  private static ESLVal grid = newJavaActor("esl.grid.Grid",size,size,new ESLVal(6));
  private static ESLVal isLegal = new ESLVal(new Function(new ESLVal("isLegal"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return x.eql($zero).or(x.gre($zero).and(x.less(size))).and(y.eql($zero).or(y.gre($zero).and(y.less(size))));
    }
  });
  private static ESLVal world = new ESLVal(new Function(new ESLVal("world"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("world")) {
          ESLVal locations = ((Supplier<ESLVal>)() -> { 
              {ESLVal a = newArray(size.intVal);
                
                {{
                ESLVal _v1 = $zero.to(size);
                while(_v1.isCons()) {
                  ESLVal x = _v1.headVal;
                  {a.array[x.intVal] = newArray(size.intVal);
                  {
                    ESLVal _v2 = $zero.to(size);
                    while(_v2.isCons()) {
                      ESLVal y = _v2.headVal;
                      {a.array[x.intVal].array[y.intVal] = ((Supplier<ESLVal>)() -> { 
                        if(random.apply(new ESLVal(100)).less(new ESLVal(30)).boolVal)
                          return twig;
                          else
                            return background;
                      }).get();
                      Lib.send(grid,"SetColour",x,y,a.array[x.intVal].array[y.intVal]);}
                      _v2 = _v2.tailVal;}
                  }}
                  _v1 = _v1.tailVal;}
              }
              edb.ref("display").apply(new ESLVal("Termites"),grid);
              edb.ref("button").apply(new ESLVal("Termites"),new ESLVal("stop"),new ESLVal("icons/stop.png"),new ESLVal("stop application"),new ESLVal(new Function(new ESLVal("fun168"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return stopAll.apply();
                }
              }));
              return a;}
              }
            }).get();
          ESLVal termites = new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newActor(termite,new ESLVal(new Actor()),n,getSelf()));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(numOfTermites));
          ESLVal foundSingleton = new ESLVal(new Function(new ESLVal("foundSingleton"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return locations.array[x.intVal].array[y.intVal].eql(twig).and(twigCount.apply(x,y).less(new ESLVal(5)));
              }
            });
          ESLVal foundPile = new ESLVal(new Function(new ESLVal("foundPile"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return locations.array[x.intVal].array[y.intVal].eql(twig).and(twigCount.apply(x,y).gre(new ESLVal(4)));
              }
            });
          ESLVal isTwig = new ESLVal(new Function(new ESLVal("isTwig"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            if(isLegal.apply(x,y).boolVal)
                  return locations.array[x.intVal].array[y.intVal].eql(twig);
                  else
                    return $false;
              }
            });
          ESLVal twigCount = new ESLVal(new Function(new ESLVal("twigCount"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return ((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.sub($one),y.sub($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x,y.sub($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.add($one),y.sub($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.sub($one),y).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.add($one),y).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.sub($one),y.add($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x,y.add($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(((Supplier<ESLVal>)() -> { 
                    if(isTwig.apply(x.add($one),y.add($one)).boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get())))))));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
            case "TryPickup": {ESLVal $9 = _v3.termRef(0);
              ESLVal $8 = _v3.termRef(1);
              ESLVal $7 = _v3.termRef(2);
              
              {ESLVal x = $9;
              
              {ESLVal y = $8;
              
              {ESLVal t = $7;
              
              if(foundSingleton.apply(x,y).boolVal)
              {locations.array[x.intVal].array[y.intVal] = background;
              Lib.send(grid,"SetColour",x,y,background);
              return Lib.send(t,"Drop");}
              else
                return Lib.send(t,"Search");
            }
            }
            }
            }
          case "FindPile": {ESLVal $6 = _v3.termRef(0);
              ESLVal $5 = _v3.termRef(1);
              ESLVal $4 = _v3.termRef(2);
              
              {ESLVal x = $6;
              
              {ESLVal y = $5;
              
              {ESLVal t = $4;
              
              if(foundPile.apply(x,y).boolVal)
              return Lib.send(t,"FindSpace");
              else
                return Lib.send(t,"Drop");
            }
            }
            }
            }
          case "TryDrop": {ESLVal $3 = _v3.termRef(0);
              ESLVal $2 = _v3.termRef(1);
              ESLVal $1 = _v3.termRef(2);
              
              {ESLVal x = $3;
              
              {ESLVal y = $2;
              
              {ESLVal t = $1;
              
              if(locations.array[x.intVal].array[y.intVal].eql(background).boolVal)
              {locations.array[x.intVal].array[y.intVal] = twig;
              Lib.send(grid,"SetColour",x,y,twig);
              return Lib.send(t,"GetAway",new ESLVal(20));}
              else
                return Lib.send(t,"FindSpace");
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
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
  private static ESLVal termite = new ESLVal(new Function(new ESLVal("termite"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v7 = $args[0];
  ESLVal _v8 = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("termite")) {
          ESLVal x = random.apply(size);
          ESLVal y = random.apply(size);
          ESLVal dx = random.apply(new ESLVal(3)).sub($one);
          ESLVal dy = random.apply(new ESLVal(3)).sub($one);
          ESLVal randomDir = new ESLVal(new Function(new ESLVal("randomDir"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {dx = random.apply(new ESLVal(3)).sub($one);
                {dy = random.apply(new ESLVal(3)).sub($one);
                return $null;}}
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {x = x.add(dx);
                y = y.add(dy);
                if(x.less($zero).boolVal)
                  {dx = $one;
                  x = $zero;
                  return move.apply();}
                  else
                    if(x.gre(size.sub($one)).boolVal)
                      {dx = $zero.sub($one);
                      x = size.sub($one);
                      return move.apply();}
                      else
                        if(y.less($zero).boolVal)
                          {dy = $one;
                          y = $zero;
                          return move.apply();}
                          else
                            if(y.gre(size.sub($one)).boolVal)
                              {dy = $zero.sub($one);
                              y = size.sub($one);
                              return move.apply();}
                              else
                                return Lib.send(grid,"TermiteAt",_v7,x,y);}
              }
            });
          ESLVal moveRandom = new ESLVal(new Function(new ESLVal("moveRandom"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {randomDir.apply();
                return move.apply();}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Search": {
              {moveRandom.apply();
            return Lib.send(_v8,"TryPickup",x,y,getSelf());}
            }
          case "Drop": {
              {moveRandom.apply();
            return Lib.send(_v8,"FindPile",x,y,getSelf());}
            }
          case "FindSpace": {
              {moveRandom.apply();
            return Lib.send(_v8,"TryDrop",x,y,getSelf());}
            }
          case "GetAway": {ESLVal $10 = _v4.termRef(0);
              
              switch($10.intVal) {
              case 0: return Lib.send(getSelf(),"Search");
              default: {ESLVal n = $10;
                
                {move.apply();
              return Lib.send(getSelf(),"GetAway",n.sub($one));}
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return Lib.send(getSelf(),"Search");
          }
        });
    }
  });
  private static ESLVal w = newActor(world,new ESLVal(new Actor()));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v5 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(limit).boolVal)
            stopAll.apply();
            else
              {ESLVal _v6 = $t;
                
                if($true.boolVal)
                {}
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