package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Obs {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal observed = new ESLVal(new Function(new ESLVal("observed"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("observed")) {
          ESLVal count = $zero;
          ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return count;
              }
            });
          ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            return new ESLVal("Exactly",new ESLVal("X",new ESLVal[]{}));
              }
            });
          ESLVal $observers = ESLVal.list();
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return $null;}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal $s1 = observeState.apply();
            
            {((Supplier<ESLVal>)() -> { 
            {ESLVal _v1 = $m;
              
              switch(_v1.termName) {
              case "M": {
                {count = count.add($one);
              return $null;}
              }
            case "N": {
                {count = count.add(new ESLVal(10));
              return $null;}
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
            }
            }
          }).get();
          {ESLVal $s2 = observeState.apply();
            
            {{
            ESLVal _v2 = $observers;
            while(_v2.isCons()) {
              ESLVal $o = _v2.headVal;
              ((Supplier<ESLVal>)() -> { 
                {ESLVal _v3 = observeMessage.apply($m);
                  
                  switch(_v3.termName) {
                  case "Exactly": {ESLVal $1 = _v3.termRef(0);
                    
                    {ESLVal $x = $1;
                    
                    return Lib.send($o,"Observe",getSelf(),now(),$s1,$x,$s2);
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
                }
                }
              }).get();
              _v2 = _v2.tailVal;}
          }
          return $null;}
          }}
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "observeState": return observeState;
              case "observeMessage": return observeMessage;
              case "addObserver": return addObserver;
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
  private static ESLVal o1 = newActor(observed,new ESLVal(new Actor()));
  private static ESLVal observer = new ESLVal(new Function(new ESLVal("observer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("observer")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Observe": {ESLVal $6 = _v4.termRef(0);
              ESLVal $5 = _v4.termRef(1);
              ESLVal $4 = _v4.termRef(2);
              ESLVal $3 = _v4.termRef(3);
              ESLVal $2 = _v4.termRef(4);
              
              {ESLVal o = $6;
              
              {ESLVal n = $5;
              
              {ESLVal s1 = $4;
              
              {ESLVal m = $3;
              
              {ESLVal s2 = $2;
              
              {print.apply(new ESLVal("YOU OBSERVED ").add(n.add(new ESLVal(" ").add(s1.add(new ESLVal(" ").add(m.add(new ESLVal(" ").add(s2))))))));
            Lib.send(o,"N");
            return Lib.send(getSelf(),"K");}
            }
            }
            }
            }
            }
            }
          case "K": {
              return print.apply(new ESLVal("got K"));
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
            return $null;
          }
        });
    }
  });
  private static ESLVal setObserver = new ESLVal(new Function(new ESLVal("setObserver"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v8 = $args[0];
  ESLVal _v9 = $args[1];
  return _v8.ref("addObserver").apply(_v9);
    }
  });
  private static ESLVal o2 = ((Supplier<ESLVal>)() -> { 
    {ESLVal _v7 = newActor(observer,new ESLVal(new Actor()));
      
      {setObserver.apply(o1,_v7);
    return _v7;}
    }
  }).get();
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
            
            if(n.gre(new ESLVal(1000)).boolVal)
            stopAll.apply();
            else
              {ESLVal _v6 = $t;
                
                if($true.boolVal)
                Lib.send(o1,"M");
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