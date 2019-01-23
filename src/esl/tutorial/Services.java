package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Services {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal facilitator = new ESLVal(new Function(new ESLVal("facilitator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("facilitator")) {
          ESLVal rowCustomers(ESLVal n) {
    
    return take(drop(customers,n.mul(root)),root);
  }
  ESLVal rowCustomers = new ESLVal(new Function(new ESLVal("rowCustomers"),null) { public ESLVal apply(ESLVal... args) { return rowCustomers(args[0]); }});
  ESLVal row(ESLVal n) {
    
    return new ESLVal("Row",$nil,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal c = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Data",$nil,c.ref("picture").apply()));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(rowCustomers(n)));
  }
  ESLVal row = new ESLVal(new Function(new ESLVal("row"),null) { public ESLVal apply(ESLVal... args) { return row(args[0]); }});
  ESLVal table() {
    
    return new ESLVal("Table",$nil,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal n = $l0.head();
            $l0 = $l0.tail();
            $v.add(row(n));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($zero.to(root)));
  }
  ESLVal table = new ESLVal(new Function(new ESLVal("table"),null) { public ESLVal apply(ESLVal... args) { return table(); }});
  ESLVal chooseCustomer() {
    
    return nth.apply(pending,random.apply(length.apply(pending)));
  }
  ESLVal chooseCustomer = new ESLVal(new Function(new ESLVal("chooseCustomer"),null) { public ESLVal apply(ESLVal... args) { return chooseCustomer(); }});
ESLVal pending = $nil;
          ESLVal count = $zero;
          ESLVal root = round.apply(isqrt.apply(noOfCustomers));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v338 = $m;
            
            switch(_v338.termName) {
            case "PairUp": {ESLVal $365 = _v338.termRef(0);
              
              {ESLVal c = $365;
              
              if(pending.eql($nil).boolVal)
              {pending = pending.cons(c);
              return $null;}
              else
                {ESLVal c1 = $365;
                  
                  {ESLVal c2 = chooseCustomer();
                  
                  {Lib.send(c1,"Inc");
                Lib.send(c2,"Dec");
                pending = remove.apply(c2,pending);
                count = count.add($one);
                if(count.mod(new ESLVal(20).mul(noOfCustomers)).eql($zero).boolVal)
                  return Lib.send(edb,"Show",new ESLVal("Services"),table());
                  else
                    return $null;}
                }
                }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v338)));
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
  private static ESLVal customer = new ESLVal(new Function(new ESLVal("customer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal money = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("customer")) {
          ESLVal picture() {
    
    return new ESLVal("Picture",new ESLVal(60),new ESLVal(60),ESLVal.list(new ESLVal("Circle",new ESLVal(30),new ESLVal(30),round.apply(wealth.mul(new ESLVal(20.0)).div(new ESLVal(1.0).mul(totalMoney)).mul(new ESLVal(30.0))),new ESLVal(""))));
  }
  ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),null) { public ESLVal apply(ESLVal... args) { return picture(); }});
ESLVal wealth = money;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v339 = $m;
            
            switch(_v339.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v339)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
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
          ESLVal picture() {
    
    return new ESLVal("Picture",new ESLVal(60),new ESLVal(60),$nil);
  }
  ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),null) { public ESLVal apply(ESLVal... args) { return picture(); }});

          public ESLVal handle(ESLVal $m) {{ESLVal _v340 = $m;
            
            switch(_v340.termName) {
            case "Inc": {
              return $null;
            }
          case "Dec": {
              return $null;
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v340)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
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
  private static ESLVal initialFunds = new ESLVal(100);
  private static ESLVal totalMoney = noOfCustomers.mul(initialFunds);
  private static ESLVal customers = new SerializableFunction<ESLVal,ESLVal>() {
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
  private static ESLVal theFacilitator = newActor(facilitator,new ESLVal(new Actor()));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v341 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v341)));
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
              {ESLVal _v342 = $t;
                
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