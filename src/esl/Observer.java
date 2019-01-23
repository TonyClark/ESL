package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Observer {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal observed = new ESLVal(new Function(new ESLVal("observed"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("observed")) {
          ESLVal count = $zero;
          ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("ExternallyObservedState",count);
              }
            });
          ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            {ESLVal _v1 = m;
                  
                  switch(_v1.termName) {
                  case "Message1": {
                    return new ESLVal("Something",new ESLVal("ExternallyObservedMessage",new ESLVal("message1")));
                  }
                case "Message2": {
                    return new ESLVal("Nothing",new ESLVal[]{});
                  }
                  default: return error(new ESLVal("case error at Pos(5693,5822)").add(ESLVal.list(_v1)));
                }
                }
              }
            });
          ESLVal $observers = ESLVal.list();
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return Lib.send(o,"Start",getSelf(),now(),observeState.apply());}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{((Supplier<ESLVal>)() -> { 
            {ESLVal _v2 = $m;
              
              switch(_v2.termName) {
              case "Message1": {
                {count = count.add($one);
              return $null;}
              }
            case "Message2": {
                {count = count.add(new ESLVal(10));
              return $null;}
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
            }
            }
          }).get();
          {ESLVal $s = observeState.apply();
            
            {{
            ESLVal _v3 = $observers;
            while(_v3.isCons()) {
              ESLVal $o = _v3.headVal;
              ((Supplier<ESLVal>)() -> { 
                {ESLVal _v4 = observeMessage.apply($m);
                  
                  switch(_v4.termName) {
                  case "Something": {ESLVal $1 = _v4.termRef(0);
                    
                    {ESLVal $x = $1;
                    
                    return Lib.send($o,"Transition",getSelf(),now(),$x,$s);
                  }
                  }
                case "Nothing": {
                    return $null;
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
                }
                }
              }).get();
              _v3 = _v3.tailVal;}
          }
          return $null;}
          }}}
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
  private static ESLVal observer = new ESLVal(new Function(new ESLVal("observer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("observer")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v5 = $m;
            
            switch(_v5.termName) {
            case "Start": {ESLVal $8 = _v5.termRef(0);
              ESLVal $7 = _v5.termRef(1);
              ESLVal $6 = _v5.termRef(2);
              
              {ESLVal o = $8;
              
              {ESLVal n = $7;
              
              {ESLVal s = $6;
              
              return print.apply(new ESLVal("Start 1 ").add(s));
            }
            }
            }
            }
          case "Transition": {ESLVal $5 = _v5.termRef(0);
              ESLVal $4 = _v5.termRef(1);
              ESLVal $3 = _v5.termRef(2);
              ESLVal $2 = _v5.termRef(3);
              
              {ESLVal o = $5;
              
              {ESLVal n = $4;
              
              {ESLVal m = $3;
              
              {ESLVal s = $2;
              
              {print.apply(new ESLVal("YOU OBSERVED 1 ").add(n.add(new ESLVal(" ").add(m.add(new ESLVal(" ").add(s))))));
            Lib.send(o,"Message1");
            Lib.send(o,"Message2");
            return Lib.send(getSelf(),"K");}
            }
            }
            }
            }
            }
          case "K": {
              return print.apply(new ESLVal("got K"));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
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
  private static ESLVal selfObserver = new ESLVal(new Function(new ESLVal("selfObserver"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("selfObserver")) {
          ESLVal count = $zero;
          ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("ExternallyObservedState",count);
              }
            });
          ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            {ESLVal _v6 = m;
                  
                  switch(_v6.termName) {
                  case "Me": {
                    return new ESLVal("Something",new ESLVal("ExternallyObservedMessage",new ESLVal("").add(m)));
                  }
                  default: {ESLVal _v14 = _v6;
                    
                    return new ESLVal("Nothing",new ESLVal[]{});
                  }
                }
                }
              }
            });
          ESLVal $observers = ESLVal.list();
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return Lib.send(o,"Start",getSelf(),now(),observeState.apply());}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{((Supplier<ESLVal>)() -> { 
            {ESLVal _v7 = $m;
              
              switch(_v7.termName) {
              case "Transition": {ESLVal $15 = _v7.termRef(0);
                ESLVal $14 = _v7.termRef(1);
                ESLVal $13 = _v7.termRef(2);
                ESLVal $12 = _v7.termRef(3);
                
                {ESLVal o = $15;
                
                {ESLVal n = $14;
                
                {ESLVal m = $13;
                
                {ESLVal s = $12;
                
                return print.apply(new ESLVal("YOU SELF OBSERVED ").add(n.add(new ESLVal(" ").add(m.add(new ESLVal(" ").add(s))))));
              }
              }
              }
              }
              }
            case "Start": {ESLVal $11 = _v7.termRef(0);
                ESLVal $10 = _v7.termRef(1);
                ESLVal $9 = _v7.termRef(2);
                
                {ESLVal o = $11;
                
                {ESLVal n = $10;
                
                {ESLVal s = $9;
                
                return print.apply(new ESLVal("SELF START ").add(s));
              }
              }
              }
              }
            case "Me": {
                {count = count.sub($one);
              return $null;}
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v7)));
            }
            }
          }).get();
          {ESLVal $s = observeState.apply();
            
            {{
            ESLVal _v8 = $observers;
            while(_v8.isCons()) {
              ESLVal $o = _v8.headVal;
              ((Supplier<ESLVal>)() -> { 
                {ESLVal _v9 = observeMessage.apply($m);
                  
                  switch(_v9.termName) {
                  case "Something": {ESLVal $16 = _v9.termRef(0);
                    
                    {ESLVal $x = $16;
                    
                    return Lib.send($o,"Transition",getSelf(),now(),$x,$s);
                  }
                  }
                case "Nothing": {
                    return $null;
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v9)));
                }
                }
              }).get();
              _v8 = _v8.tailVal;}
          }
          return $null;}
          }}}
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
  private static ESLVal setObserver = new ESLVal(new Function(new ESLVal("setObserver"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v12 = $args[0];
  ESLVal _v13 = $args[1];
  return _v12.ref("addObserver").apply(_v13);
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          ESLVal o1 = newActor(observed,new ESLVal(new Actor()));
          ESLVal o2 = newActor(observer,new ESLVal(new Actor()));
          ESLVal o3 = newActor(selfObserver,new ESLVal(new Actor()));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v10 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v10)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(new ESLVal(2000)).boolVal)
            stopAll.apply();
            else
              {ESLVal _v11 = $t;
                
                if($true.boolVal)
                {print.apply(new ESLVal("time = ").add(_v11));
                Lib.send(o1,"Message1");
                Lib.send(o3,"Me");}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {setObserver.apply(o1,o2);
                return o3.ref("addObserver").apply(o3);}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}