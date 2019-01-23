package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Test2 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  ESLVal $1 = $args[1];
  {ESLVal _v1 = $0;
        ESLVal _v2 = $1;
        
        switch(_v1.termName) {
        case "One": {
          switch(_v2.termName) {
          case "One": {
            return $one;
          }
        case "Two": {
            return new ESLVal(2);
          }
          default: return error(new ESLVal("case error at Pos(108,128)").add(ESLVal.list(_v1,_v2)));
        }
        }
      case "Two": {
          switch(_v2.termName) {
          case "One": {
            return new ESLVal(3);
          }
        case "Two": {
            return new ESLVal(4);
          }
          default: return error(new ESLVal("case error at Pos(108,128)").add(ESLVal.list(_v1,_v2)));
        }
        }
        default: return error(new ESLVal("case error at Pos(108,128)").add(ESLVal.list(_v1,_v2)));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
ESLVal g = new ESLVal(new Function(new ESLVal("g"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $0 = $args[0];
            ESLVal $1 = $args[1];
            {ESLVal _v3 = $0;
                  ESLVal _v4 = $1;
                  
                  {ESLVal x = _v3;
                  
                  {ESLVal y = _v4;
                  
                  if(x.eql(y).boolVal)
                  return $one;
                  else
                    {ESLVal _v6 = _v3;
                      
                      {ESLVal _v7 = _v4;
                      
                      if(_v6.neql(_v7).boolVal)
                      return new ESLVal(2);
                      else
                        return error(new ESLVal("case error at Pos(172,211)").add(ESLVal.list(_v3,_v4)));
                    }
                    }
                }
                }
                }
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
            {print.apply(new ESLVal("result f = ").add(new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal x = $l0.head();
                  $l0 = $l0.tail();
                  ESLVal $l1 = ESLVal.list(new ESLVal("One",new ESLVal[]{}),new ESLVal("Two",new ESLVal[]{}));
            while(!$l1.isNil()) {
              ESLVal y = $l1.head();
              $l1 = $l1.tail();
              $v.add(f.apply(x,y));
            }
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(ESLVal.list(new ESLVal("One",new ESLVal[]{}),new ESLVal("Two",new ESLVal[]{})))));
            print.apply(new ESLVal("result g = ").add(new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal x = $l0.head();
                  $l0 = $l0.tail();
                  ESLVal $l1 = ESLVal.list(new ESLVal("One",new ESLVal[]{}),new ESLVal("Two",new ESLVal[]{}));
            while(!$l1.isNil()) {
              ESLVal y = $l1.head();
              $l1 = $l1.tail();
              $v.add(g.apply(x,y));
            }
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(ESLVal.list(new ESLVal("One",new ESLVal[]{}),new ESLVal("Two",new ESLVal[]{})))));
            stopAll.apply();}
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

public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}
