package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Example {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            switch(_v1.termName) {
            case "Timw": {ESLVal $1 = _v1.termRef(0);
              
              {ESLVal n = $1;
              
              return $null;
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(new ESLVal(10000)).boolVal)
            stopAll.apply();
            else
              {ESLVal _v2 = $t;
                
                if(_v2.mod(new ESLVal(100)).eql($zero).boolVal)
                {print.apply(new ESLVal("time = ").add(_v2));
                wait.apply(new ESLVal(10));}
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