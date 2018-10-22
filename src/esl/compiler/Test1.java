package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Test1 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal x = new ESLVal("Branch",new ESLVal("Leaf",new ESLVal(100)),new ESLVal("Leaf",new ESLVal(300)));
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v7 = $args[0];
  ESLVal _v6 = $args[1];
  return _v7;
    }
  });
  private static ESLVal test = new ESLVal(new Function(new ESLVal("test"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v4 = $args[0];
  {ESLVal _v3 = _v4;
        
        switch(_v3.termName) {
        case "Branch": {ESLVal $3 = _v3.termRef(0);
          ESLVal $2 = _v3.termRef(1);
          
          {ESLVal a = $3;
          
          {ESLVal b = $2;
          
          return test.apply(a).add(test.apply(b));
        }
        }
        }
      case "Leaf": {ESLVal $1 = _v3.termRef(0);
          
          {ESLVal _v5 = $1;
          
          return _v5;
        }
        }
        default: return error(new ESLVal("case error at Pos(163,228)"));
      }
      }
    }
  });
  private static ESLVal mkTree = new ESLVal(new Function(new ESLVal("mkTree"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  {ESLVal _v2 = n;
        
        switch(_v2.intVal) {
        case 0: return new ESLVal("Leaf",$one);
        default: {ESLVal m = _v2;
          
          return new ESLVal("Branch",mkTree.apply(m.sub($one)),mkTree.apply(m.sub($one)));
        }
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
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
            return ((Supplier<ESLVal>)() -> { 
                {print.apply(test.apply(mkTree.apply(new ESLVal(20))));
                return stopAll.apply();}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}