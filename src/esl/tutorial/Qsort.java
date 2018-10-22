package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Qsort {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal nums = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal _v1 = $qualArg;
        
        {ESLVal n = _v1;
        
        return ESLVal.list(ESLVal.list(random.apply(new ESLVal(50))));
      }
      }
    }
  }).map($zero.to(new ESLVal(25))).flatten().flatten();
  private static ESLVal qmain = new ESLVal(new Function(new ESLVal("qmain"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qmain")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "Sorted": {ESLVal $1 = _v2.termRef(0);
              ESLVal $2 = _v2.termRef(1);
              
              switch($2.termName) {
              case "Final": {
                {ESLVal _v12 = $1;
                
                {print.apply(_v12);
              return stopAll.apply();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)"));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
            return newActor(qsorter,new ESLVal(new Actor()),getSelf(),l,new ESLVal("Final",new ESLVal[]{}));
          }
        });
    }
  });
  private static ESLVal qwaiter = new ESLVal(new Function(new ESLVal("qwaiter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal parent = $args[0];
  ESLVal n = $args[1];
  ESLVal dir = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qwaiter")) {
          ESLVal left = $null;
          ESLVal right = $null;
          ESLVal check = new ESLVal(new Function(new ESLVal("check"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(left.neql($null).and(right.neql($null)).boolVal)
                  return Lib.send(parent,"Sorted",left.add(ESLVal.list(n).add(right)),dir);
                  else
                    return $null;
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
            case "Sorted": {ESLVal $3 = _v3.termRef(0);
              ESLVal $4 = _v3.termRef(1);
              
              switch($4.termName) {
              case "Left": {
                {ESLVal l = $3;
                
                {left = l;
              return check.apply();}
              }
              }
            case "Right": {
                {ESLVal l = $3;
                
                {right = l;
              return check.apply();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)"));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
  private static ESLVal qsorter = new ESLVal(new Function(new ESLVal("qsorter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal parent = $args[0];
  ESLVal l = $args[1];
  ESLVal dir = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qsorter")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            switch(_v7.termName) {
            case "Sorted": {ESLVal $7 = _v7.termRef(0);
              ESLVal $8 = _v7.termRef(1);
              
              {ESLVal _v14 = $7;
              
              {ESLVal d = $8;
              
              return error(new ESLVal("error!"));
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
            return ((Supplier<ESLVal>)() -> { 
                {ESLVal _v4 = l;
                  
                  if(_v4.isCons())
                  {ESLVal $5 = _v4.head();
                    ESLVal $6 = _v4.tail();
                    
                    {ESLVal x = $5;
                    
                    {ESLVal _v13 = $6;
                    
                    {newActor(qsorter,new ESLVal(new Actor()),getSelf(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v5 = $qualArg;
                        
                        {ESLVal n = _v5;
                        
                        return ESLVal.list((n.less(x).boolVal) ? (ESLVal.list(n)) : ($nil));
                      }
                      }
                    }
                  }).map(_v13).flatten().flatten(),new ESLVal("Left",new ESLVal[]{}));
                  newActor(qsorter,new ESLVal(new Actor()),getSelf(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v6 = $qualArg;
                        
                        {ESLVal n = _v6;
                        
                        return ESLVal.list((n.gre(x).boolVal) ? (ESLVal.list(n)) : ($nil));
                      }
                      }
                    }
                  }).map(_v13).flatten().flatten(),new ESLVal("Right",new ESLVal[]{}));
                  become(qwaiter,getSelf(),parent,x,dir);
                  return $null;}
                  }
                  }
                  }
                else if(_v4.isNil())
                  return Lib.send(parent,"Sorted",l,dir);
                else return error(new ESLVal("case error at Pos(1380,2189)"));
                }
              }).get();
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v8 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
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
            return newActor(qmain,new ESLVal(new Actor()),nums);
          }
        });
    }
  });
  private static ESLVal qsort = new ESLVal(new Function(new ESLVal("qsort"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v9 = l;
        
        if(_v9.isCons())
        {ESLVal $9 = _v9.head();
          ESLVal $10 = _v9.tail();
          
          {ESLVal x = $9;
          
          {ESLVal _v15 = $10;
          
          return qsort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v10 = $qualArg;
                
                {ESLVal n = _v10;
                
                return ESLVal.list((n.less(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v15).flatten().flatten()).add(ESLVal.list(x).add(qsort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v11 = $qualArg;
                
                {ESLVal n = _v11;
                
                return ESLVal.list((n.gre(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v15).flatten().flatten())));
        }
        }
        }
      else if(_v9.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(2441,2586)"));
      }
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}