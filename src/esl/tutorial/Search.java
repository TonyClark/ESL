package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Search {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal size = new ESLVal(1000);
  private static ESLVal numOfSearchers = new ESLVal(353);
  private static ESLVal board = newArray(size.intVal);
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  ESLVal b = $args[1];
  if(a.gre(b).boolVal)
        return a;
        else
          return b;
    }
  });
  private static ESLVal controller = new ESLVal(new Function(new ESLVal("controller"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("controller")) {
          ESLVal count = $zero;
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Found": {
              {print.apply(new ESLVal("Found in ").add(count.add(new ESLVal(" steps"))));
            return stopAll.apply();}
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            count = count.add($one);
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
  private static ESLVal searcher = new ESLVal(new Function(new ESLVal("searcher"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal control = $args[0];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("searcher")) {
          ESLVal x = random.apply(size);
          ESLVal y = random.apply(size);
          ESLVal delta = new ESLVal(new Function(new ESLVal("delta"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return n.add(max.apply(random.apply(new ESLVal(3)).sub($one),$zero)).mod(size);
              }
            });
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            if(board.array[x.intVal].array[y.intVal].eql(new ESLVal("*")).boolVal)
              Lib.send(control,"Found");
              else
                {x = delta.apply(x);
                y = delta.apply(y);}
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
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
                {{
                  ESLVal _v1 = $zero.to(size);
                  while(_v1.isCons()) {
                    if(_v1.isCons())
                      {ESLVal $1 = _v1.head();
                        ESLVal $2 = _v1.tail();
                        
                        {ESLVal x = $1;
                        
                        {ESLVal _v2 = $2;
                        
                        {_v1 = _v2;
                      {board.array[x.intVal] = newArray(size.intVal);
                      {
                        ESLVal _v3 = $zero.to(size);
                        while(_v3.isCons()) {
                          if(_v3.isCons())
                            {ESLVal $3 = _v3.head();
                              ESLVal $4 = _v3.tail();
                              
                              {ESLVal y = $3;
                              
                              {ESLVal _v4 = $4;
                              
                              {_v3 = _v4;
                            board.array[x.intVal].array[y.intVal] = new ESLVal("");}
                            }
                            }
                            }
                          else if(_v3.isNil())
                            error(new ESLVal("case error at Pos(1872,1986)"));
                          else error(new ESLVal("case error at Pos(1872,1986)"));
                          }
                      }}}
                      }
                      }
                      }
                    else if(_v1.isNil())
                      error(new ESLVal("case error at Pos(1704,2061)"));
                    else error(new ESLVal("case error at Pos(1704,2061)"));
                    }
                }
                board.array[random.apply(size).intVal].array[random.apply(size).intVal] = new ESLVal("*");
                {ESLVal control = newActor(controller,new ESLVal(new Actor()));
                  
                  {{
                  ESLVal _v5 = $zero.to(numOfSearchers);
                  while(_v5.isCons()) {
                    if(_v5.isCons())
                      {ESLVal $5 = _v5.head();
                        ESLVal $6 = _v5.tail();
                        
                        {ESLVal i = $5;
                        
                        {ESLVal _v6 = $6;
                        
                        {_v5 = _v6;
                      newActor(searcher,new ESLVal(new Actor()),control);}
                      }
                      }
                      }
                    else if(_v5.isNil())
                      error(new ESLVal("case error at Pos(2231,2288)"));
                    else error(new ESLVal("case error at Pos(2231,2288)"));
                    }
                }
                return $null;}
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