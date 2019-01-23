package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Fact {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal actors = $nil;
  private static ESLVal messages = $nil;
  private static ESLVal timeOut = new ESLVal(1000);
  private static ESLVal fact = new ESLVal(new Function(new ESLVal("fact"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("fact")) {
          
ESLVal id = $zero;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v121 = $m;
            
            switch(_v121.termName) {
            case "Get": {ESLVal $187 = _v121.termRef(0);
              ESLVal $186 = _v121.termRef(1);
              ESLVal $185 = _v121.termRef(2);
              ESLVal $184 = _v121.termRef(3);
              
              switch($187.intVal) {
              case 0: {ESLVal threadId = $186;
                
                {ESLVal time = $185;
                
                {ESLVal c = $184;
                
                {addZero(threadId,time,getSelf(),c);
              return Lib.send(c,"Value",threadId,time.add($one),$one);}
              }
              }
              }
              default: {ESLVal n = $187;
                
                {ESLVal threadId = $186;
                
                {ESLVal time = $185;
                
                {ESLVal c = $184;
                
                {ESLVal cc = newActor(cust,new ESLVal(new Actor()),n,c);
                
                {addGet(threadId,time,n.sub($one),getSelf(),getSelf(),c,cc);
              return Lib.send(getSelf(),"Get",n.sub($one),threadId,time.add($one),cc);}
              }
              }
              }
              }
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v121)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {id = addActor(new ESLVal("fact"));
                return $null;}
              }}.get();
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v122 = $m;
            
            switch(_v122.termName) {
            case "Value": {ESLVal $190 = _v122.termRef(0);
              ESLVal $189 = _v122.termRef(1);
              ESLVal $188 = _v122.termRef(2);
              
              {ESLVal threadId = $190;
              
              {ESLVal time = $189;
              
              {ESLVal m = $188;
              
              {addReturn(threadId,time,n.mul(m),getSelf(),c);
            setDeath(id,time);
            return Lib.send(c,"Value",threadId,time.add($one),n.mul(m));}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v122)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {id = addActor(new ESLVal("cust"));
                return $null;}
              }}.get();
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          ESLVal computeFact(ESLVal n) {
    
    {addStart(n,counter,getSelf(),f);
    counter = counter.add($one);
    return Lib.send(f,"Get",n,counter.sub($one),$one,getSelf());}
  }
  ESLVal computeFact = new ESLVal(new Function(new ESLVal("computeFact"),null) { public ESLVal apply(ESLVal... args) { return computeFact(args[0]); }});
  ESLVal messageTime(ESLVal m) {
    
    {ESLVal _v123 = m;
      
      switch(_v123.termName) {
      case "Message": {ESLVal $194 = _v123.termRef(0);
        ESLVal $193 = _v123.termRef(1);
        ESLVal $192 = _v123.termRef(2);
        ESLVal $191 = _v123.termRef(3);
        
        {ESLVal t = $194;
        
        {ESLVal s = $193;
        
        {ESLVal tt = $192;
        
        {ESLVal l = $191;
        
        return t;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3656,3691)").add(ESLVal.list(_v123)));
    }
    }
  }
  ESLVal messageTime = new ESLVal(new Function(new ESLVal("messageTime"),null) { public ESLVal apply(ESLVal... args) { return messageTime(args[0]); }});
  ESLVal messageBefore(ESLVal time) {
    
    return new ESLVal(new Function(new ESLVal("fun60"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal m = $args[0];
      return messageTime(m).less(time);
        }
      });
  }
  ESLVal messageBefore = new ESLVal(new Function(new ESLVal("messageBefore"),null) { public ESLVal apply(ESLVal... args) { return messageBefore(args[0]); }});
  ESLVal createFilmstrip(ESLVal ms) {
    
    return new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal t = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Sequence",actors,select(messageBefore(t),ms)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($one.to(numberOfFacts));
  }
  ESLVal createFilmstrip = new ESLVal(new Function(new ESLVal("createFilmstrip"),null) { public ESLVal apply(ESLVal... args) { return createFilmstrip(args[0]); }});
ESLVal id = $zero;
          ESLVal counter = $zero;
          ESLVal count = $one;
          ESLVal f = newActor(fact,new ESLVal(new Actor()));
          ESLVal numberOfFacts = new ESLVal(20);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v125 = $m;
            
            switch(_v125.termName) {
            case "Value": {ESLVal $197 = _v125.termRef(0);
              ESLVal $196 = _v125.termRef(1);
              ESLVal $195 = _v125.termRef(2);
              
              {ESLVal threadId = $197;
              
              {ESLVal time = $196;
              
              {ESLVal n = $195;
              
              {setDeath(id,time);
            if(count.eql(numberOfFacts).boolVal)
              {Lib.send(edb,"Show",new ESLVal("Factorial"),new ESLVal("Sequence",actors,translate(messages)));
              return stopAll.apply();}
              else
                {count = count.add($one);
                return $null;}}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v125)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {id = addActor(new ESLVal("Main"));
                {{
                  ESLVal _v124 = $zero.to(new ESLVal(20));
                  while(_v124.isCons()) {
                    ESLVal i = _v124.headVal;
                    computeFact(i);
                    _v124 = _v124.tailVal;}
                }
                return $null;}}
              }}.get();
          }
        });
    }
  });
private static ESLVal addActor(ESLVal behaviour) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {ESLVal id = length.apply(actors);
          
          {actors = actors.add(ESLVal.list(new ESLVal("Actor",id,$zero,timeOut,behaviour)));
        return id;}
        }
      }}.get();
        }},actors);
  }
  private static ESLVal addActor = new ESLVal(new Function(new ESLVal("addActor"),null) { public ESLVal apply(ESLVal... args) { return addActor(args[0]); }});
  private static ESLVal addGet(ESLVal threadId,ESLVal time,ESLVal n,ESLVal source,ESLVal target,ESLVal sourceCustomer,ESLVal targetCustomer) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {messages = messages.add(ESLVal.list(new ESLVal("GetValue",n,threadId,time,source,target,sourceCustomer,targetCustomer)));
        return $null;}
      }}.get();
        }},messages);
  }
  private static ESLVal addGet = new ESLVal(new Function(new ESLVal("addGet"),null) { public ESLVal apply(ESLVal... args) { return addGet(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal addReturn(ESLVal threadId,ESLVal time,ESLVal v,ESLVal customer,ESLVal proxy) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {messages = messages.add(ESLVal.list(new ESLVal("ReturnValue",v,threadId,time,customer,proxy)));
        return $null;}
      }}.get();
        }},messages);
  }
  private static ESLVal addReturn = new ESLVal(new Function(new ESLVal("addReturn"),null) { public ESLVal apply(ESLVal... args) { return addReturn(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal addZero(ESLVal threadId,ESLVal time,ESLVal f,ESLVal c) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {messages = messages.add(ESLVal.list(new ESLVal("Zero",threadId,time,f,c)));
        return $null;}
      }}.get();
        }},messages);
  }
  private static ESLVal addZero = new ESLVal(new Function(new ESLVal("addZero"),null) { public ESLVal apply(ESLVal... args) { return addZero(args[0],args[1],args[2],args[3]); }});
  private static ESLVal addStart(ESLVal n,ESLVal threadId,ESLVal c,ESLVal f) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {messages = messages.add(ESLVal.list(new ESLVal("Start",n,threadId,c,f)));
        return $null;}
      }}.get();
        }},messages);
  }
  private static ESLVal addStart = new ESLVal(new Function(new ESLVal("addStart"),null) { public ESLVal apply(ESLVal... args) { return addStart(args[0],args[1],args[2],args[3]); }});
  private static ESLVal translate(ESLVal msIn) {
    
    {ESLVal _v118 = msIn;
      
      if(_v118.isCons())
      {ESLVal $152 = _v118.head();
        ESLVal $153 = _v118.tail();
        
        switch($152.termName) {
        case "Start": {ESLVal $173 = $152.termRef(0);
          ESLVal $172 = $152.termRef(1);
          ESLVal $171 = $152.termRef(2);
          ESLVal $170 = $152.termRef(3);
          
          {ESLVal n = $173;
          
          {ESLVal threadId = $172;
          
          {ESLVal c = $171;
          
          {ESLVal f = $170;
          
          {ESLVal rest = $153;
          
          return translate(rest).cons(new ESLVal("Message",$one,c.ref("id"),f.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Start(").add(n.add(new ESLVal(")")))))));
        }
        }
        }
        }
        }
        }
      case "GetValue": {ESLVal $169 = $152.termRef(0);
          ESLVal $168 = $152.termRef(1);
          ESLVal $167 = $152.termRef(2);
          ESLVal $166 = $152.termRef(3);
          ESLVal $165 = $152.termRef(4);
          ESLVal $164 = $152.termRef(5);
          ESLVal $163 = $152.termRef(6);
          
          {ESLVal n = $169;
          
          {ESLVal threadId = $168;
          
          {ESLVal time = $167;
          
          {ESLVal source = $166;
          
          {ESLVal target = $165;
          
          {ESLVal sourceCustomer = $164;
          
          {ESLVal targetCustomer = $163;
          
          {ESLVal rest = $153;
          
          return translate(rest).cons(new ESLVal("Message",time,source.ref("id"),target.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Get(").add(n.add(new ESLVal(",").add(sourceCustomer.ref("id").add(new ESLVal(",").add(targetCustomer.ref("id").add(new ESLVal(")")))))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "ReturnValue": {ESLVal $162 = $152.termRef(0);
          ESLVal $161 = $152.termRef(1);
          ESLVal $160 = $152.termRef(2);
          ESLVal $159 = $152.termRef(3);
          ESLVal $158 = $152.termRef(4);
          
          {ESLVal n = $162;
          
          {ESLVal threadId = $161;
          
          {ESLVal time = $160;
          
          {ESLVal source = $159;
          
          {ESLVal target = $158;
          
          {ESLVal rest = $153;
          
          return translate(rest).cons(new ESLVal("Message",time,source.ref("id"),target.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]Return(").add(n.add(new ESLVal(")")))))));
        }
        }
        }
        }
        }
        }
        }
      case "Zero": {ESLVal $157 = $152.termRef(0);
          ESLVal $156 = $152.termRef(1);
          ESLVal $155 = $152.termRef(2);
          ESLVal $154 = $152.termRef(3);
          
          {ESLVal threadId = $157;
          
          {ESLVal time = $156;
          
          {ESLVal f = $155;
          
          {ESLVal c = $154;
          
          {ESLVal rest = $153;
          
          return translate(rest).cons(new ESLVal("Message",time,f.ref("id"),c.ref("id"),new ESLVal("[").add(threadId.add(new ESLVal("]One")))));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2254,2881)").add(ESLVal.list(_v118)));
      }
      }
    else if(_v118.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2254,2881)").add(ESLVal.list(_v118)));
    }
  }
  private static ESLVal translate = new ESLVal(new Function(new ESLVal("translate"),null) { public ESLVal apply(ESLVal... args) { return translate(args[0]); }});
  private static ESLVal getActor(ESLVal id,ESLVal as) {
    
    {ESLVal _v119 = as;
      
      if(_v119.isCons())
      {ESLVal $174 = _v119.head();
        ESLVal $175 = _v119.tail();
        
        switch($174.termName) {
        case "Actor": {ESLVal $179 = $174.termRef(0);
          ESLVal $178 = $174.termRef(1);
          ESLVal $177 = $174.termRef(2);
          ESLVal $176 = $174.termRef(3);
          
          {ESLVal i = $179;
          
          {ESLVal time = $178;
          
          {ESLVal death = $177;
          
          {ESLVal b = $176;
          
          {ESLVal l = $175;
          
          if(i.eql(id).boolVal)
          return new ESLVal("Actor",i,time,death,b);
          else
            {ESLVal a = $174;
              
              {ESLVal _v126 = $175;
              
              return getActor(id,_v126);
            }
            }
        }
        }
        }
        }
        }
        }
        default: {ESLVal a = $174;
          
          {ESLVal l = $175;
          
          return getActor(id,l);
        }
        }
      }
      }
    else if(_v119.isNil())
      return error(new ESLVal("case error at Pos(2926,3032)").add(ESLVal.list(_v119)));
    else return error(new ESLVal("case error at Pos(2926,3032)").add(ESLVal.list(_v119)));
    }
  }
  private static ESLVal getActor = new ESLVal(new Function(new ESLVal("getActor"),null) { public ESLVal apply(ESLVal... args) { return getActor(args[0],args[1]); }});
  private static ESLVal changeDeath(ESLVal a,ESLVal t) {
    
    {ESLVal _v120 = a;
      
      switch(_v120.termName) {
      case "Actor": {ESLVal $183 = _v120.termRef(0);
        ESLVal $182 = _v120.termRef(1);
        ESLVal $181 = _v120.termRef(2);
        ESLVal $180 = _v120.termRef(3);
        
        {ESLVal i = $183;
        
        {ESLVal birth = $182;
        
        {ESLVal death = $181;
        
        {ESLVal b = $180;
        
        return new ESLVal("Actor",i,birth,t,b);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3076,3139)").add(ESLVal.list(_v120)));
    }
    }
  }
  private static ESLVal changeDeath = new ESLVal(new Function(new ESLVal("changeDeath"),null) { public ESLVal apply(ESLVal... args) { return changeDeath(args[0],args[1]); }});
  private static ESLVal setDeath(ESLVal id,ESLVal time) {
    
    {ESLVal oldActor = getActor(id,actors);
      
      {ESLVal newActor = changeDeath(oldActor,time);
      
      return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {actors = subst(newActor,oldActor,actors);
        return $null;}
      }}.get();
        }},actors);
    }
    }
  }
  private static ESLVal setDeath = new ESLVal(new Function(new ESLVal("setDeath"),null) { public ESLVal apply(ESLVal... args) { return setDeath(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}