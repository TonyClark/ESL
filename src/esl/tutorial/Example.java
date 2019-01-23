package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Example {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v115 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v115)));
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
              {ESLVal _v116 = $t;
                
                if(_v116.mod(new ESLVal(100)).eql($zero).boolVal)
                {print.apply(new ESLVal("time = ").add(_v116));
                wait.apply(new ESLVal(10));}
                else
                  {ESLVal _v117 = $t;
                    
                    if($true.boolVal)
                    {}
                    else
                      {}
                  }
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