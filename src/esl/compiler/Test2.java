package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Test2 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal splitBy = new ESLVal(new Function(new ESLVal("splitBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal s = $args[1];
  LetRec letrec = new LetRec() {
        ESLVal splitter = new ESLVal(new Function(new ESLVal("splitter"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          if(chars.isCons())
                {ESLVal $1 = chars.head();
                  ESLVal $2 = chars.tail();
                  
                  return ESLVal.list(new ESLVal("XXXXX"));
                }
              else if(chars.isNil())
                return $nil;
              else return ESLVal.list(new ESLVal("XXXXX"));
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "splitter": return splitter;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal splitter = letrec.get("splitter");
      
        return splitter.apply(s.ref("explode"));
      
    }
  });
public static void main(String[] args) {
  }
}