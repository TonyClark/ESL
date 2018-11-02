package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Util {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal cache = new ESLVal(new Function(new ESLVal("cache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal f = $args[1];
  {ESLVal table = newTable();
        
        return new ESLVal(new Function(new ESLVal("fun117"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        {ESLVal k = m.apply(a);
              
              if(table.ref("hasKey").apply(k).boolVal)
              return table.ref("get").apply(k);
              else
                {ESLVal v = f.apply(a);
                  
                  {table.ref("put").apply(k,v);
                return v;}
                }
            }
          }
        });
      }
    }
  });
public static void main(String[] args) {
  }
}