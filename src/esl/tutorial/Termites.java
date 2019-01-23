package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Termites {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal size = new ESLVal(350);
  private static ESLVal limit = new ESLVal(120000);
  private static ESLVal numOfTermites = new ESLVal(10000);
  private static ESLVal twig = new ESLVal("black");
  private static ESLVal background = new ESLVal("white");
  private static ESLVal grid = newJavaActor("esl.grid.Grid",size,size,new ESLVal(2));
  private static ESLVal world = new ESLVal(new Function(new ESLVal("world"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("world")) {
          ESLVal foundSingleton(ESLVal x,ESLVal y) {
    
    return locations.array[x.intVal].array[y.intVal].eql(twig).and(twigCount(x,y).less(new ESLVal(5)));
  }
  ESLVal foundSingleton = new ESLVal(new Function(new ESLVal("foundSingleton"),null) { public ESLVal apply(ESLVal... args) { return foundSingleton(args[0],args[1]); }});
  ESLVal foundPile(ESLVal x,ESLVal y) {
    
    return locations.array[x.intVal].array[y.intVal].eql(twig).and(twigCount(x,y).gre(new ESLVal(4)));
  }
  ESLVal foundPile = new ESLVal(new Function(new ESLVal("foundPile"),null) { public ESLVal apply(ESLVal... args) { return foundPile(args[0],args[1]); }});
  ESLVal isTwig(ESLVal x,ESLVal y) {
    
    if(isLegal(x,y).boolVal)
      return locations.array[x.intVal].array[y.intVal].eql(twig);
      else
        return $false;
  }
  ESLVal isTwig = new ESLVal(new Function(new ESLVal("isTwig"),null) { public ESLVal apply(ESLVal... args) { return isTwig(args[0],args[1]); }});
  ESLVal twigCount(ESLVal x,ESLVal y) {
    
    return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.sub($one),y.sub($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x,y.sub($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.add($one),y.sub($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.sub($one),y).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.add($one),y).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.sub($one),y.add($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x,y.add($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get().add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(isTwig(x.add($one),y.add($one)).boolVal)
          return $one;
          else
            return $zero;
      }}.get())))))));
  }
  ESLVal twigCount = new ESLVal(new Function(new ESLVal("twigCount"),null) { public ESLVal apply(ESLVal... args) { return twigCount(args[0],args[1]); }});
ESLVal locations = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal a = newArray(size.intVal);
                
                {{
                ESLVal _v462 = $zero.to(size);
                while(_v462.isCons()) {
                  ESLVal x = _v462.headVal;
                  {a.array[x.intVal] = newArray(size.intVal);
                  {
                    ESLVal _v463 = $zero.to(size);
                    while(_v463.isCons()) {
                      ESLVal y = _v463.headVal;
                      {a.array[x.intVal].array[y.intVal] = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                        if(random.apply(new ESLVal(100)).less(new ESLVal(30)).boolVal)
                          return twig;
                          else
                            return background;
                      }}.get();
                      Lib.send(grid,"SetColour",x,y,a.array[x.intVal].array[y.intVal]);}
                      _v463 = _v463.tailVal;}
                  }}
                  _v462 = _v462.tailVal;}
              }
              edb.ref("display").apply(new ESLVal("Termites"),grid);
              edb.ref("button").apply(new ESLVal("Termites"),new ESLVal("stop"),new ESLVal("icons/stop.png"),new ESLVal("stop application"),new ESLVal(new Function(new ESLVal("fun79"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return stopAll.apply();
                }
              }));
              return a;}
              }
            }}.get();
          ESLVal termites = new SerializableFunction<ESLVal,ESLVal>() {
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v464 = $m;
            
            switch(_v464.termName) {
            case "TryPickup": {ESLVal $603 = _v464.termRef(0);
              ESLVal $602 = _v464.termRef(1);
              ESLVal $601 = _v464.termRef(2);
              
              {ESLVal x = $603;
              
              {ESLVal y = $602;
              
              {ESLVal t = $601;
              
              if(foundSingleton(x,y).boolVal)
              {locations.array[x.intVal].array[y.intVal] = background;
              Lib.send(grid,"SetColour",x,y,background);
              return Lib.send(t,"Drop");}
              else
                return Lib.send(t,"Search");
            }
            }
            }
            }
          case "FindPile": {ESLVal $600 = _v464.termRef(0);
              ESLVal $599 = _v464.termRef(1);
              ESLVal $598 = _v464.termRef(2);
              
              {ESLVal x = $600;
              
              {ESLVal y = $599;
              
              {ESLVal t = $598;
              
              if(foundPile(x,y).boolVal)
              return Lib.send(t,"FindSpace");
              else
                return Lib.send(t,"Drop");
            }
            }
            }
            }
          case "TryDrop": {ESLVal $597 = _v464.termRef(0);
              ESLVal $596 = _v464.termRef(1);
              ESLVal $595 = _v464.termRef(2);
              
              {ESLVal x = $597;
              
              {ESLVal y = $596;
              
              {ESLVal t = $595;
              
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v464)));
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
      ESLVal _v468 = $args[0];
  ESLVal _v469 = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("termite")) {
          ESLVal randomDir() {
    
    {dx = random.apply(new ESLVal(3)).sub($one);
    {dy = random.apply(new ESLVal(3)).sub($one);
    return $null;}}
  }
  ESLVal randomDir = new ESLVal(new Function(new ESLVal("randomDir"),null) { public ESLVal apply(ESLVal... args) { return randomDir(); }});
  ESLVal move() {
    
    {x = x.add(dx);
    y = y.add(dy);
    if(x.less($zero).boolVal)
      {dx = $one;
      x = $zero;
      return move();}
      else
        if(x.gre(size.sub($one)).boolVal)
          {dx = $zero.sub($one);
          x = size.sub($one);
          return move();}
          else
            if(y.less($zero).boolVal)
              {dy = $one;
              y = $zero;
              return move();}
              else
                if(y.gre(size.sub($one)).boolVal)
                  {dy = $zero.sub($one);
                  y = size.sub($one);
                  return move();}
                  else
                    return Lib.send(grid,"TermiteAt",_v468,x,y);}
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});
  ESLVal moveRandom() {
    
    {randomDir();
    return move();}
  }
  ESLVal moveRandom = new ESLVal(new Function(new ESLVal("moveRandom"),null) { public ESLVal apply(ESLVal... args) { return moveRandom(); }});
ESLVal x = random.apply(size);
          ESLVal y = random.apply(size);
          ESLVal dx = random.apply(new ESLVal(3)).sub($one);
          ESLVal dy = random.apply(new ESLVal(3)).sub($one);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v465 = $m;
            
            switch(_v465.termName) {
            case "Search": {
              {moveRandom();
            return Lib.send(_v469,"TryPickup",x,y,getSelf());}
            }
          case "Drop": {
              {moveRandom();
            return Lib.send(_v469,"FindPile",x,y,getSelf());}
            }
          case "FindSpace": {
              {moveRandom();
            return Lib.send(_v469,"TryDrop",x,y,getSelf());}
            }
          case "GetAway": {ESLVal $604 = _v465.termRef(0);
              
              switch($604.intVal) {
              case 0: return Lib.send(getSelf(),"Search");
              default: {ESLVal n = $604;
                
                {move();
              return Lib.send(getSelf(),"GetAway",n.sub($one));}
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v465)));
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
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v466 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v466)));
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
              {ESLVal _v467 = $t;
                
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
private static ESLVal isLegal(ESLVal x,ESLVal y) {
    
    return x.eql($zero).or(x.gre($zero).and(x.less(size))).and(y.eql($zero).or(y.gre($zero).and(y.less(size))));
  }
  private static ESLVal isLegal = new ESLVal(new Function(new ESLVal("isLegal"),null) { public ESLVal apply(ESLVal... args) { return isLegal(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}