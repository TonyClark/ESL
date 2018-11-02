package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Test2 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal t = newTable();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
                {t.ref("put").apply(new ESLVal("one"),$one);
                t.ref("put").apply(new ESLVal("two"),new ESLVal(2));
                t.ref("put").apply(new ESLVal("one"),new ESLVal(3));
                print.apply(new ESLVal("keys ").add(t.ref("keys")));
                print.apply(new ESLVal("values ").add(t.ref("vals")));
                return print.apply(new ESLVal("table ").add(t));}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}