package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Search {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal size = new ESLVal(1000);
  private static ESLVal numOfSearchers = new ESLVal(1000);
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            switch(_v6.termName) {
            case "Found": {
              {print.apply(new ESLVal("Found in ").add(count.add(new ESLVal(" steps"))));
            return stopAll.apply();}
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
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
                {{
                  ESLVal _v2 = $zero.to(size);
                  while(_v2.isCons()) {
                    ESLVal x = _v2.headVal;
                    {board.array[x.intVal] = newArray(size.intVal);
                    {
                      ESLVal _v3 = $zero.to(size);
                      while(_v3.isCons()) {
                        ESLVal y = _v3.headVal;
                        board.array[x.intVal].array[y.intVal] = new ESLVal("");
                        _v3 = _v3.tailVal;}
                    }}
                    _v2 = _v2.tailVal;}
                }
                board.array[random.apply(size).intVal].array[random.apply(size).intVal] = new ESLVal("*");
                {ESLVal control = newActor(controller,new ESLVal(new Actor()));
                  
                  {{
                  ESLVal _v1 = $zero.to(numOfSearchers);
                  while(_v1.isCons()) {
                    ESLVal i = _v1.headVal;
                    newActor(searcher,new ESLVal(new Actor()),control);
                    _v1 = _v1.tailVal;}
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