package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Search {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal size = new ESLVal(1000);
  private static ESLVal numOfSearchers = new ESLVal(1000);
  private static ESLVal board = newArray(size.intVal);
  private static ESLVal controller = new ESLVal(new Function(new ESLVal("controller"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("controller")) {
          
ESLVal count = $zero;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v322 = $m;
            
            switch(_v322.termName) {
            case "Found": {
              {print.apply(new ESLVal("Found in ").add(count.add(new ESLVal(" steps"))));
            return stopAll.apply();}
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v322)));
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
          ESLVal delta(ESLVal n) {
    
    return n.add(max(random.apply(new ESLVal(3)).sub($one),$zero)).mod(size);
  }
  ESLVal delta = new ESLVal(new Function(new ESLVal("delta"),null) { public ESLVal apply(ESLVal... args) { return delta(args[0]); }});
ESLVal x = random.apply(size);
          ESLVal y = random.apply(size);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v323 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v323)));
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
                {x = delta(x);
                y = delta(y);}
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
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v327 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v327)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {{
                  ESLVal _v325 = $zero.to(size);
                  while(_v325.isCons()) {
                    ESLVal x = _v325.headVal;
                    {board.array[x.intVal] = newArray(size.intVal);
                    {
                      ESLVal _v326 = $zero.to(size);
                      while(_v326.isCons()) {
                        ESLVal y = _v326.headVal;
                        board.array[x.intVal].array[y.intVal] = new ESLVal("");
                        _v326 = _v326.tailVal;}
                    }}
                    _v325 = _v325.tailVal;}
                }
                board.array[random.apply(size).intVal].array[random.apply(size).intVal] = new ESLVal("*");
                {ESLVal control = newActor(controller,new ESLVal(new Actor()));
                  
                  {{
                  ESLVal _v324 = $zero.to(numOfSearchers);
                  while(_v324.isCons()) {
                    ESLVal i = _v324.headVal;
                    newActor(searcher,new ESLVal(new Actor()),control);
                    _v324 = _v324.tailVal;}
                }
                return $null;}
                }}
              }}.get();
          }
        });
    }
  });
private static ESLVal max(ESLVal a,ESLVal b) {
    
    if(a.gre(b).boolVal)
      return a;
      else
        return b;
  }
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),null) { public ESLVal apply(ESLVal... args) { return max(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}