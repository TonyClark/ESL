package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Fact {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal actors = ESLVal.list();
  private static ESLVal messages = ESLVal.list();
  private static ESLVal addActor = new ESLVal(new Function(new ESLVal("addActor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal behaviour = $args[0];
  return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {ESLVal id = length.apply(actors);
            
            {actors = actors.add(ESLVal.list(new ESLVal("Actor",id,$zero,timeOut,behaviour)));
          return id;}
          }
        }).get();
          }},actors);
    }
  });
  private static ESLVal addGet = new ESLVal(new Function(new ESLVal("addGet"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal threadId = $args[0];
  ESLVal time = $args[1];
  ESLVal n = $args[2];
  ESLVal source = $args[3];
  ESLVal target = $args[4];
  ESLVal sourceCustomer = $args[5];
  ESLVal targetCustomer = $args[6];
  return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {messages = messages.add(ESLVal.list(new ESLVal("GetValue",n,threadId,time,source,target,sourceCustomer,targetCustomer)));
          return $null;}
        }).get();
          }},messages);
    }
  });
  private static ESLVal addReturn = new ESLVal(new Function(new ESLVal("addReturn"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal threadId = $args[0];
  ESLVal time = $args[1];
  ESLVal v = $args[2];
  ESLVal customer = $args[3];
  ESLVal proxy = $args[4];
  return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {messages = messages.add(ESLVal.list(new ESLVal("ReturnValue",v,threadId,time,customer,proxy)));
          return $null;}
        }).get();
          }},messages);
    }
  });
  private static ESLVal addZero = new ESLVal(new Function(new ESLVal("addZero"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal threadId = $args[0];
  ESLVal time = $args[1];
  ESLVal f = $args[2];
  ESLVal c = $args[3];
  return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {messages = messages.add(ESLVal.list(new ESLVal("Zero",threadId,time,f,c)));
          return $null;}
        }).get();
          }},messages);
    }
  });
  private static ESLVal addStart = new ESLVal(new Function(new ESLVal("addStart"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal threadId = $args[1];
  ESLVal c = $args[2];
  ESLVal f = $args[3];
  return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {messages = messages.add(ESLVal.list(new ESLVal("Start",n,threadId,c,f)));
          return $null;}
        }).get();
          }},messages);
    }
  });
  private static ESLVal timeOut = new ESLVal(1000);
  private static ESLVal fact = new ESLVal(new Function(new ESLVal("fact"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("fact")) {
          ESLVal id = $zero;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            switch(_v7.termName) {
            case "Get": {ESLVal $46 = _v7.termRef(0);
              ESLVal $45 = _v7.termRef(1);
              ESLVal $44 = _v7.termRef(2);
              ESLVal $43 = _v7.termRef(3);
              
              switch($46.intVal) {
              case 0: {ESLVal threadId = $45;
                
                {ESLVal time = $44;
                
                {ESLVal c = $43;
                
                {addZero.apply(threadId,time,getSelf(),c);
              return Lib.send(c,"Value",threadId,time.add($one),$one);}
              }
              }
              }
              default: {ESLVal n = $46;
                
                {ESLVal threadId = $45;
                
                {ESLVal time = $44;
                
                {ESLVal c = $43;
                
                {ESLVal cc = newActor(cust,new ESLVal(new Actor()),n,c);
                
                {addGet.apply(threadId,time,n.sub($one),getSelf(),getSelf(),c,cc);
              return Lib.send(getSelf(),"Get",n.sub($one),threadId,time.add($one),cc);}
              }
              }
              }
              }
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v7)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "id": return id;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {}
            else
              {}
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {id = addActor.apply(new ESLVal("fact"));
                return $null;}
              }).get();
          }
        });
    }
  });
  private static ESLVal cust = new ESLVal(new Function(new ESLVal("cust"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal c = $args[1];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("cust")) {
          ESLVal id = $zero;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            switch(_v6.termName) {
            case "Value": {ESLVal $42 = _v6.termRef(0);
              ESLVal $41 = _v6.termRef(1);
              ESLVal $40 = _v6.termRef(2);
              
              {ESLVal threadId = $42;
              
              {ESLVal time = $41;
              
              {ESLVal m = $40;
              
              {addReturn.apply(threadId,time,n.mul(m),getSelf(),c);
            setDeath.apply(id,time);
            return Lib.send(c,"Value",threadId,time.add($one),n.mul(m));}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "id": return id;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal t = $t;
            
            if($true.boolVal)
            {}
            else
              {}
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {id = addActor.apply(new ESLVal("cust"));
                return $null;}
              }).get();
          }
        });
    }
  });
  private static ESLVal translate = new ESLVal(new Function(new ESLVal("translate"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal msIn = $args[0];
  {ESLVal _v5 = msIn;
        
        if(_v5.isCons())
        {ESLVal $18 = _v5.head();
          ESLVal $19 = _v5.tail();
          
          switch($18.termName) {
          case "Start": {ESLVal $39 = $18.termRef(0);
            ESLVal $38 = $18.termRef(1);
            ESLVal $37 = $18.termRef(2);
            ESLVal $36 = $18.termRef(3);
            
            {ESLVal n = $39;
            
            {ESLVal threadId = $38;
            
            {ESLVal c = $37;
            
            {ESLVal f = $36;
            
            {ESLVal rest = $19;
            
            return translate.apply(rest).cons(new ESLVal("Message",$one,c.ref("id"),f.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Start(").add(n.add(new ESLVal(")")))))));
          }
          }
          }
          }
          }
          }
        case "GetValue": {ESLVal $35 = $18.termRef(0);
            ESLVal $34 = $18.termRef(1);
            ESLVal $33 = $18.termRef(2);
            ESLVal $32 = $18.termRef(3);
            ESLVal $31 = $18.termRef(4);
            ESLVal $30 = $18.termRef(5);
            ESLVal $29 = $18.termRef(6);
            
            {ESLVal n = $35;
            
            {ESLVal threadId = $34;
            
            {ESLVal time = $33;
            
            {ESLVal source = $32;
            
            {ESLVal target = $31;
            
            {ESLVal sourceCustomer = $30;
            
            {ESLVal targetCustomer = $29;
            
            {ESLVal rest = $19;
            
            return translate.apply(rest).cons(new ESLVal("Message",time,source.ref("id"),target.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Get(").add(n.add(new ESLVal(",").add(sourceCustomer.ref("id").add(new ESLVal(",").add(targetCustomer.ref("id").add(new ESLVal(")")))))))))));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "ReturnValue": {ESLVal $28 = $18.termRef(0);
            ESLVal $27 = $18.termRef(1);
            ESLVal $26 = $18.termRef(2);
            ESLVal $25 = $18.termRef(3);
            ESLVal $24 = $18.termRef(4);
            
            {ESLVal n = $28;
            
            {ESLVal threadId = $27;
            
            {ESLVal time = $26;
            
            {ESLVal source = $25;
            
            {ESLVal target = $24;
            
            {ESLVal rest = $19;
            
            return translate.apply(rest).cons(new ESLVal("Message",time,source.ref("id"),target.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Return(").add(n.add(new ESLVal(")")))))));
          }
          }
          }
          }
          }
          }
          }
        case "Zero": {ESLVal $23 = $18.termRef(0);
            ESLVal $22 = $18.termRef(1);
            ESLVal $21 = $18.termRef(2);
            ESLVal $20 = $18.termRef(3);
            
            {ESLVal threadId = $23;
            
            {ESLVal time = $22;
            
            {ESLVal f = $21;
            
            {ESLVal c = $20;
            
            {ESLVal rest = $19;
            
            return translate.apply(rest).cons(new ESLVal("Message",time,f.ref("id"),c.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]One")))));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(2253,2880)").add(ESLVal.list(_v5)));
        }
        }
      else if(_v5.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(2253,2880)").add(ESLVal.list(_v5)));
      }
    }
  });
  private static ESLVal getActor = new ESLVal(new Function(new ESLVal("getActor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal as = $args[1];
  {ESLVal _v4 = as;
        
        if(_v4.isCons())
        {ESLVal $12 = _v4.head();
          ESLVal $13 = _v4.tail();
          
          switch($12.termName) {
          case "Actor": {ESLVal $17 = $12.termRef(0);
            ESLVal $16 = $12.termRef(1);
            ESLVal $15 = $12.termRef(2);
            ESLVal $14 = $12.termRef(3);
            
            {ESLVal i = $17;
            
            {ESLVal time = $16;
            
            {ESLVal death = $15;
            
            {ESLVal b = $14;
            
            {ESLVal l = $13;
            
            if(i.eql(id).boolVal)
            return new ESLVal("Actor",i,time,death,b);
            else
              {ESLVal a = $12;
                
                {ESLVal _v8 = $13;
                
                return getActor.apply(id,_v8);
              }
              }
          }
          }
          }
          }
          }
          }
          default: {ESLVal a = $12;
            
            {ESLVal l = $13;
            
            return getActor.apply(id,l);
          }
          }
        }
        }
      else if(_v4.isNil())
        return error(new ESLVal("case error at Pos(2925,3031)").add(ESLVal.list(_v4)));
      else return error(new ESLVal("case error at Pos(2925,3031)").add(ESLVal.list(_v4)));
      }
    }
  });
  private static ESLVal changeDeath = new ESLVal(new Function(new ESLVal("changeDeath"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  ESLVal t = $args[1];
  {ESLVal _v3 = a;
        
        switch(_v3.termName) {
        case "Actor": {ESLVal $11 = _v3.termRef(0);
          ESLVal $10 = _v3.termRef(1);
          ESLVal $9 = _v3.termRef(2);
          ESLVal $8 = _v3.termRef(3);
          
          {ESLVal i = $11;
          
          {ESLVal birth = $10;
          
          {ESLVal death = $9;
          
          {ESLVal b = $8;
          
          return new ESLVal("Actor",i,birth,t,b);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3075,3138)").add(ESLVal.list(_v3)));
      }
      }
    }
  });
  private static ESLVal setDeath = new ESLVal(new Function(new ESLVal("setDeath"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal time = $args[1];
  {ESLVal oldActor = getActor.apply(id,actors);
        
        {ESLVal newActor = changeDeath.apply(oldActor,time);
        
        return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {actors = subst.apply(newActor,oldActor,actors);
          return $null;}
        }).get();
          }},actors);
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          ESLVal id = $zero;
          ESLVal counter = $zero;
          ESLVal count = $one;
          ESLVal f = newActor(fact,new ESLVal(new Actor()));
          ESLVal numberOfFacts = new ESLVal(2);
          ESLVal computeFact = new ESLVal(new Function(new ESLVal("computeFact"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            {addStart.apply(n,counter,getSelf(),f);
                counter = counter.add($one);
                return Lib.send(f,"Get",n,counter.sub($one),$one,getSelf());}
              }
            });
          ESLVal messageTime = new ESLVal(new Function(new ESLVal("messageTime"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            {ESLVal _v1 = m;
                  
                  switch(_v1.termName) {
                  case "Message": {ESLVal $4 = _v1.termRef(0);
                    ESLVal $3 = _v1.termRef(1);
                    ESLVal $2 = _v1.termRef(2);
                    ESLVal $1 = _v1.termRef(3);
                    
                    {ESLVal t = $4;
                    
                    {ESLVal s = $3;
                    
                    {ESLVal tt = $2;
                    
                    {ESLVal l = $1;
                    
                    return t;
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(3654,3689)").add(ESLVal.list(_v1)));
                }
                }
              }
            });
          ESLVal messageBefore = new ESLVal(new Function(new ESLVal("messageBefore"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal time = $args[0];
            return new ESLVal(new Function(new ESLVal("fun74"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  return messageTime.apply(m).less(time);
                    }
                  });
              }
            });
          ESLVal createFilmstrip = new ESLVal(new Function(new ESLVal("createFilmstrip"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal ms = $args[0];
            return new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal t = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Sequence",actors,select.apply(messageBefore.apply(t),ms)));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($one.to(numberOfFacts));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "Value": {ESLVal $7 = _v2.termRef(0);
              ESLVal $6 = _v2.termRef(1);
              ESLVal $5 = _v2.termRef(2);
              
              {ESLVal threadId = $7;
              
              {ESLVal time = $6;
              
              {ESLVal n = $5;
              
              {setDeath.apply(id,time);
            if(count.eql(numberOfFacts).boolVal)
              {Lib.send(edb,"Show",new ESLVal("Factorial"),new ESLVal("Sequence",actors,translate.apply(messages)));
              return stopAll.apply();}
              else
                {count = count.add($one);
                return $null;}}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "id": return id;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {id = addActor.apply(new ESLVal("Main"));
                computeFact.apply(new ESLVal(3));
                return computeFact.apply(new ESLVal(3));}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}