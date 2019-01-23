package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Util {
  public static ESLVal getSelf() { return $null; }
  
public static ESLVal cache(ESLVal m,ESLVal f) {
    
    {ESLVal table = newTable();
      
      return new ESLVal(new Function(new ESLVal("fun74"),getSelf()) {
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
  public static ESLVal cache = new ESLVal(new Function(new ESLVal("cache"),null) { public ESLVal apply(ESLVal... args) { return cache(args[0],args[1]); }});
public static void main(String[] args) {
  }
}