package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Services {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal facilitator = new ESLVal(new Function(new ESLVal("facilitator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("facilitator")) {
          ESLVal pending = ESLVal.list();
          ESLVal count = $zero;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            switch(_v1.termName) {
            case "PairUp": {ESLVal $1 = _v1.termRef(0);
              
              {ESLVal c = $1;
              
              if(pending.eql(ESLVal.list()).boolVal)
              {pending = pending.cons(c);
              return $null;}
              else
                {ESLVal c1 = $1;
                  
                  {ESLVal c2 = nth.apply(pending,random.apply(length.apply(pending)));
                  
                  {Lib.send(c1,"Inc");
                Lib.send(c2,"Dec");
                pending = remove.apply(c2,pending);
                count = count.add($one);
                if(count.mod(new ESLVal(20).mul(noOfCustomers)).eql($zero).boolVal)
                  return Lib.send(edb,"Show",new ESLVal("Services"),new ESLVal("Table",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal n = $l0.head();
                          $l0 = $l0.tail();
                          $v.add(new ESLVal("Row",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal c = $l0.head();
                          $l0 = $l0.tail();
                          $v.add(new ESLVal("Data",ESLVal.list(),c.ref("picture").apply()));
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(take.apply(drop.apply(customers,n.mul(root)),root))));
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply($zero.to(root))));
                  else
                    return $null;}
                }
                }
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
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal theFacilitator = newActor(facilitator,new ESLVal(new Actor()));
  private static ESLVal customer = new ESLVal(new Function(new ESLVal("customer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal money = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("customer")) {
          ESLVal wealth = money;
          ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("Picture",new ESLVal(60),new ESLVal(60),ESLVal.list(new ESLVal("Circle",new ESLVal(30),new ESLVal(30),round.apply(wealth.mul(new ESLVal(20.0)).div(new ESLVal(1.0).mul(totalMoney)).mul(new ESLVal(30.0))),new ESLVal(""))));
              }
            });
          ESLVal pprint = new ESLVal(new Function(new ESLVal("pprint"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("Customer(").add(wealth.add(new ESLVal(")")));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "Inc": {
              {wealth = wealth.add(new ESLVal(3));
            return Lib.send(theFacilitator,"PairUp",getSelf());}
            }
          case "Dec": {
              if(wealth.gre(new ESLVal(3)).boolVal)
              {wealth = wealth.sub(new ESLVal(3));
              return Lib.send(theFacilitator,"PairUp",getSelf());}
              else
                return become(emptyCustomer,getSelf());
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "pprint": return pprint;
              case "picture": return picture;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return Lib.send(theFacilitator,"PairUp",getSelf());
          }
        });
    }
  });
  private static ESLVal emptyCustomer = new ESLVal(new Function(new ESLVal("emptyCustomer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("emptyCustomer")) {
          ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("Picture",new ESLVal(60),new ESLVal(60),ESLVal.list());
              }
            });
          ESLVal pprint = new ESLVal(new Function(new ESLVal("pprint"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("empty");
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
            case "Inc": {
              return $null;
            }
          case "Dec": {
              return $null;
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "pprint": return pprint;
              case "picture": return picture;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal limit = new ESLVal(20000);
  private static ESLVal noOfCustomers = new ESLVal(100);
  private static ESLVal root = round.apply(isqrt.apply(noOfCustomers));
  private static ESLVal initialFunds = new ESLVal(100);
  private static ESLVal totalMoney = noOfCustomers.mul(initialFunds);
  private static ESLVal customers = new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal i = $l0.head();
        $l0 = $l0.tail();
        $v.add(newActor(customer,new ESLVal(new Actor()),initialFunds));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(noOfCustomers));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(limit).boolVal)
            {}
            else
              {ESLVal _v5 = $t;
                
                if($true.boolVal)
                stopAll.apply();
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