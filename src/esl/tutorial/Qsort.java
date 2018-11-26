package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier; 
public class Qsort {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal nums = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal _v14 = $qualArg;
        
        {ESLVal n = _v14;
        
        return ESLVal.list(ESLVal.list(random.apply(new ESLVal(2000))));
      }
      }
    }
  }).map($zero.to(new ESLVal(2000))).flatten().flatten();
  private static ESLVal qmain = new ESLVal(new Function(new ESLVal("qmain"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qmain")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v13 = $m;
            
            switch(_v13.termName) {
            case "Sorted": {ESLVal $12 = _v13.termRef(0);
              ESLVal $11 = _v13.termRef(1);
              
              switch($11.termName) {
              case "Final": {
                {ESLVal _v19 = $12;
                
                {print.apply(_v19);
              return stopAll.apply();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v13)));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v13)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v12 = $m;
            
            switch(_v12.termName) {
            case "Sorted": {ESLVal $10 = _v12.termRef(0);
              ESLVal $9 = _v12.termRef(1);
              
              switch($9.termName) {
              case "Left": {
                {ESLVal l = $10;
                
                {left = l;
              return check.apply();}
              }
              }
            case "Right": {
                {ESLVal l = $10;
                
                {right = l;
              return check.apply();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v12)));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v12)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v11 = $m;
            
            switch(_v11.termName) {
            case "Sorted": {ESLVal $8 = _v11.termRef(0);
              ESLVal $7 = _v11.termRef(1);
              
              {ESLVal _v18 = $8;
              
              {ESLVal d = $7;
              
              return error(new ESLVal("error!"));
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v11)));
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
                {ESLVal _v8 = l;
                  
                  if(_v8.isCons())
                  {ESLVal $5 = _v8.head();
                    ESLVal $6 = _v8.tail();
                    
                    {ESLVal x = $5;
                    
                    {ESLVal _v17 = $6;
                    
                    {newActor(qsorter,new ESLVal(new Actor()),getSelf(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v10 = $qualArg;
                        
                        {ESLVal n = _v10;
                        
                        return ESLVal.list((n.less(x).boolVal) ? (ESLVal.list(n)) : ($nil));
                      }
                      }
                    }
                  }).map(_v17).flatten().flatten(),new ESLVal("Left",new ESLVal[]{}));
                  newActor(qsorter,new ESLVal(new Actor()),getSelf(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v9 = $qualArg;
                        
                        {ESLVal n = _v9;
                        
                        return ESLVal.list((n.gre(x).boolVal) ? (ESLVal.list(n)) : ($nil));
                      }
                      }
                    }
                  }).map(_v17).flatten().flatten(),new ESLVal("Right",new ESLVal[]{}));
                  become(qwaiter,getSelf(),parent,x,dir);
                  return $null;}
                  }
                  }
                  }
                else if(_v8.isNil())
                  return Lib.send(parent,"Sorted",l,dir);
                else return error(new ESLVal("case error at Pos(1384,2193)").add(ESLVal.list(_v8)));
                }
              }).get();
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v7)));
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
  {ESLVal _v4 = l;
        
        if(_v4.isCons())
        {ESLVal $3 = _v4.head();
          ESLVal $4 = _v4.tail();
          
          {ESLVal x = $3;
          
          {ESLVal _v16 = $4;
          
          return qsort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v5 = $qualArg;
                
                {ESLVal n = _v5;
                
                return ESLVal.list((n.less(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v16).flatten().flatten()).add(ESLVal.list(x).add(qsort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v6 = $qualArg;
                
                {ESLVal n = _v6;
                
                return ESLVal.list((n.gre(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v16).flatten().flatten())));
        }
        }
        }
      else if(_v4.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(2448,2593)").add(ESLVal.list(_v4)));
      }
    }
  });
  private static ESLVal psort = new ESLVal(new Function(new ESLVal("psort"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v1 = l;
        
        if(_v1.isCons())
        {ESLVal $1 = _v1.head();
          ESLVal $2 = _v1.tail();
          
          {ESLVal x = $1;
          
          {ESLVal _v15 = $2;
          
          {ESLVal[] $p = plet(new Supplier[]{() -> psort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v3 = $qualArg;
                
                {ESLVal n = _v3;
                
                return ESLVal.list((n.less(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v15).flatten().flatten()),() -> psort.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2 = $qualArg;
                
                {ESLVal n = _v2;
                
                return ESLVal.list((n.gre(x).boolVal) ? (ESLVal.list(n)) : ($nil));
              }
              }
            }
          }).map(_v15).flatten().flatten())});
          ESLVal left= $p[0];
          ESLVal right= $p[1];
          
          return left.add(ESLVal.list(x).add(right));
        }
        }
        }
        }
      else if(_v1.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(2651,2857)").add(ESLVal.list(_v1)));
      }
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}