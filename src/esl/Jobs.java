package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Jobs {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal processorBehaviour = new ESLVal(new Function(new ESLVal("processorBehaviour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal process = $args[0];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("processorBehaviour")) {
          ESLVal observeState() {
    
    if(broken.boolVal)
      return new ESLVal("Broken",new ESLVal[]{});
      else
        return new ESLVal("Queue",length.apply(pending));
  }
  ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),null) { public ESLVal apply(ESLVal... args) { return observeState(); }});
  ESLVal observeMessage(ESLVal m) {
    
    return message;
  }
  ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),null) { public ESLVal apply(ESLVal... args) { return observeMessage(args[0]); }});
  ESLVal jobCompleted() {
    
    if(pending.eql($nil).boolVal)
      {current = $null;
      return $null;}
      else
        {ESLVal next = head.apply(pending);
          
          {pending = tail.apply(pending);
        {ESLVal _v1 = next;
          
          switch(_v1.termName) {
          case "Job": {ESLVal $6 = _v1.termRef(0);
            ESLVal $5 = _v1.termRef(1);
            ESLVal $4 = _v1.termRef(2);
            ESLVal $3 = _v1.termRef(3);
            ESLVal $2 = _v1.termRef(4);
            ESLVal $1 = _v1.termRef(5);
            
            {ESLVal _v60 = $6;
            
            {ESLVal tc = $5;
            
            {ESLVal ts = $4;
            
            {ESLVal ta = $3;
            
            {ESLVal pc = $2;
            
            {ESLVal c = $1;
            
            {current = new ESLVal("Job",_v60,process,ts.add(process),ta,pc,c);
          return $null;}
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1278,1382)").add(ESLVal.list(_v1)));
        }
        }}
        }
  }
  ESLVal jobCompleted = new ESLVal(new Function(new ESLVal("jobCompleted"),null) { public ESLVal apply(ESLVal... args) { return jobCompleted(); }});
  ESLVal processCurrentJob() {
    
    if(current.neql($null).boolVal)
      {ESLVal _v2 = current;
        
        switch(_v2.termName) {
        case "Job": {ESLVal $12 = _v2.termRef(0);
          ESLVal $11 = _v2.termRef(1);
          ESLVal $10 = _v2.termRef(2);
          ESLVal $9 = _v2.termRef(3);
          ESLVal $8 = _v2.termRef(4);
          ESLVal $7 = _v2.termRef(5);
          
          switch($11.intVal) {
          case 0: {ESLVal _v61 = $12;
            
            {ESLVal ts = $10;
            
            {ESLVal ta = $9;
            
            {ESLVal pc = $8;
            
            {ESLVal c = $7;
            
            {Lib.send(c,"JobCompleted",current);
          return jobCompleted();}
          }
          }
          }
          }
          }
          default: {ESLVal _v62 = $12;
            
            {ESLVal tc = $11;
            
            {ESLVal ts = $10;
            
            {ESLVal ta = $9;
            
            {ESLVal pc = $8;
            
            {ESLVal c = $7;
            
            {current = new ESLVal("Job",_v62,tc.sub($one),ts,ta.add($one),pc,c);
          return $null;}
          }
          }
          }
          }
          }
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(1480,1684)").add(ESLVal.list(_v2)));
      }
      }
      else
        return $null;
  }
  ESLVal processCurrentJob = new ESLVal(new Function(new ESLVal("processCurrentJob"),null) { public ESLVal apply(ESLVal... args) { return processCurrentJob(); }});
  ESLVal processPendingJobs() {
    
    {pending = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
      public ESLVal apply(ESLVal... $args) {
        ESLVal $qualArg = $args[0];
    {ESLVal _v3 = $qualArg;
          
          switch(_v3.termName) {
          case "Job": {ESLVal $18 = _v3.termRef(0);
            ESLVal $17 = _v3.termRef(1);
            ESLVal $16 = _v3.termRef(2);
            ESLVal $15 = _v3.termRef(3);
            ESLVal $14 = _v3.termRef(4);
            ESLVal $13 = _v3.termRef(5);
            
            {ESLVal _v63 = $18;
            
            {ESLVal tc = $17;
            
            {ESLVal ts = $16;
            
            {ESLVal ta = $15;
            
            {ESLVal pc = $14;
            
            {ESLVal c = $13;
            
            return ESLVal.list(ESLVal.list(new ESLVal("Job",_v63,tc,ts,ta.add($one),pc,c)));
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _0 = _v3;
            
            return $nil;
          }
        }
        }
      }
    }).map(pending).flatten().flatten();
    return $null;}
  }
  ESLVal processPendingJobs = new ESLVal(new Function(new ESLVal("processPendingJobs"),null) { public ESLVal apply(ESLVal... args) { return processPendingJobs(); }});
  ESLVal reprocess(ESLVal j) {
    
    {ESLVal _v4 = j;
      
      switch(_v4.termName) {
      case "Job": {ESLVal $24 = _v4.termRef(0);
        ESLVal $23 = _v4.termRef(1);
        ESLVal $22 = _v4.termRef(2);
        ESLVal $21 = _v4.termRef(3);
        ESLVal $20 = _v4.termRef(4);
        ESLVal $19 = _v4.termRef(5);
        
        {ESLVal _v64 = $24;
        
        {ESLVal tc = $23;
        
        {ESLVal ts = $22;
        
        {ESLVal ta = $21;
        
        {ESLVal pc = $20;
        
        {ESLVal c = $19;
        
        return Lib.send(c,"Process",new ESLVal("Job",_v64,tc,ts,ta,pc.add($one),c));
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1855,1957)").add(ESLVal.list(_v4)));
    }
    }
  }
  ESLVal reprocess = new ESLVal(new Function(new ESLVal("reprocess"),null) { public ESLVal apply(ESLVal... args) { return reprocess(args[0]); }});
ESLVal current = $null;
          ESLVal pending = $nil;
          ESLVal message = new ESLVal("Something",$zero);
          ESLVal broken = $false;
          ESLVal $observers = $nil;
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return Lib.send(o,"Start",getSelf(),now(),observeState());}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal _v5 = $m;
              
              switch(_v5.termName) {
              case "Process": {ESLVal $25 = _v5.termRef(0);
                
                {ESLVal j = $25;
                
                if(broken.boolVal)
                return reprocess(j);
                else
                  {ESLVal _v65 = $25;
                    
                    if(current.eql($null).boolVal)
                    {pending = pending.add(ESLVal.list(_v65));
                    return jobCompleted();}
                    else
                      {ESLVal _v66 = $25;
                        
                        {pending = pending.add(ESLVal.list(_v66));
                      return $null;}
                      }
                  }
              }
              }
            case "Break": {
                {broken = $true;
              {
                ESLVal _v6 = pending;
                while(_v6.isCons()) {
                  ESLVal j = _v6.headVal;
                  reprocess(j);
                  _v6 = _v6.tailVal;}
              }
              pending = $nil;
              if(current.neql($null).boolVal)
                {reprocess(current);
                {current = $null;
                return $null;}}
                else
                  return $null;}
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
            }
            }
          }}.get();
          {ESLVal $s = observeState();
            
            {{
            ESLVal _v7 = $observers;
            while(_v7.isCons()) {
              ESLVal $o = _v7.headVal;
              new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {ESLVal _v8 = observeMessage($m);
                  
                  switch(_v8.termName) {
                  case "Something": {ESLVal $26 = _v8.termRef(0);
                    
                    {ESLVal $x = $26;
                    
                    return Lib.send($o,"Transition",getSelf(),now(),$x,$s);
                  }
                  }
                case "Nothing": {
                    return $null;
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v8)));
                }
                }
              }}.get();
              _v7 = _v7.tailVal;}
          }
          return $null;}
          }}}
          public ESLVal get(String name) {
            switch(name) {
              case "observeState": return observeState;
              case "observeMessage": return observeMessage;
              case "addObserver": return addObserver;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(broken.boolVal)
            {}
            else
              {ESLVal _v67 = $t;
                
                if($true.boolVal)
                {processPendingJobs();
                processCurrentJob();}
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
  private static ESLVal coordinatorBehaviour = new ESLVal(new Function(new ESLVal("coordinatorBehaviour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal adapting = $args[0];
  ESLVal[] processors = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("coordinatorBehaviour")) {
          ESLVal addProcessorState(ESLVal p,ESLVal delay,ESLVal states) {
    
    {ESLVal _v12 = states;
      
      if(_v12.isCons())
      {ESLVal $45 = _v12.head();
        ESLVal $46 = _v12.tail();
        
        switch($45.termName) {
        case "PState": {ESLVal $48 = $45.termRef(0);
          ESLVal $47 = $45.termRef(1);
          
          {ESLVal pp = $48;
          
          {ESLVal ss = $47;
          
          {ESLVal _v50 = $46;
          
          if(pp.eql(p).boolVal)
          return _v50.cons(new ESLVal("PState",p,delay));
          else
            {ESLVal ps = $45;
              
              {ESLVal _v51 = $46;
              
              return addProcessorState(p,delay,_v51).cons(ps);
            }
            }
        }
        }
        }
        }
        default: {ESLVal ps = $45;
          
          {ESLVal _v52 = $46;
          
          return addProcessorState(p,delay,_v52).cons(ps);
        }
        }
      }
      }
    else if(_v12.isNil())
      return ESLVal.list(new ESLVal("PState",p,delay));
    else return error(new ESLVal("case error at Pos(3181,3354)").add(ESLVal.list(_v12)));
    }
  }
  ESLVal addProcessorState = new ESLVal(new Function(new ESLVal("addProcessorState"),null) { public ESLVal apply(ESLVal... args) { return addProcessorState(args[0],args[1],args[2]); }});
  ESLVal shortestQueue(ESLVal states,ESLVal min,ESLVal p) {
    
    {ESLVal _v13 = states;
      
      if(_v13.isCons())
      {ESLVal $49 = _v13.head();
        ESLVal $50 = _v13.tail();
        
        switch($49.termName) {
        case "PState": {ESLVal $52 = $49.termRef(0);
          ESLVal $51 = $49.termRef(1);
          
          {ESLVal pp = $52;
          
          {ESLVal s = $51;
          
          {ESLVal _v53 = $50;
          
          if(s.less(min).boolVal)
          return shortestQueue(_v53,s,new ESLVal("PState",pp,s));
          else
            {ESLVal ps = $49;
              
              {ESLVal _v54 = $50;
              
              return shortestQueue(_v54,min,p);
            }
            }
        }
        }
        }
        }
        default: {ESLVal ps = $49;
          
          {ESLVal _v55 = $50;
          
          return shortestQueue(_v55,min,p);
        }
        }
      }
      }
    else if(_v13.isNil())
      return p;
    else return error(new ESLVal("case error at Pos(3423,3585)").add(ESLVal.list(_v13)));
    }
  }
  ESLVal shortestQueue = new ESLVal(new Function(new ESLVal("shortestQueue"),null) { public ESLVal apply(ESLVal... args) { return shortestQueue(args[0],args[1],args[2]); }});
  ESLVal cycleProcessor(ESLVal j) {
    
    {ESLVal p = head.apply(processors[0]);
      
      {Lib.send(p,"Process",reduceCycle.apply(j));
    {processors[0] = tail.apply(processors[0]).add(ESLVal.list(p));
    return $null;}}
    }
  }
  ESLVal cycleProcessor = new ESLVal(new Function(new ESLVal("cycleProcessor"),null) { public ESLVal apply(ESLVal... args) { return cycleProcessor(args[0]); }});
ESLVal states = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal p = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("PState",p,$zero));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(processors[0]);
          ESLVal reduceCycle = new ESLVal(new Function(new ESLVal("reduceCycle"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $0 = $args[0];
            {ESLVal _v9 = $0;
                  
                  switch(_v9.termName) {
                  case "Job": {ESLVal $32 = _v9.termRef(0);
                    ESLVal $31 = _v9.termRef(1);
                    ESLVal $30 = _v9.termRef(2);
                    ESLVal $29 = _v9.termRef(3);
                    ESLVal $28 = _v9.termRef(4);
                    ESLVal $27 = _v9.termRef(5);
                    
                    {ESLVal _v49 = $32;
                    
                    {ESLVal tc = $31;
                    
                    {ESLVal ts = $30;
                    
                    {ESLVal ta = $29;
                    
                    {ESLVal pc = $28;
                    
                    {ESLVal c = $27;
                    
                    return new ESLVal("Job",_v49,tc,ts,ta,pc.sub($one),c);
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(2849,2915)").add(ESLVal.list(_v9)));
                }
                }
              }
            });
          ESLVal increaseCycle = new ESLVal(new Function(new ESLVal("increaseCycle"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $0 = $args[0];
            {ESLVal _v10 = $0;
                  
                  switch(_v10.termName) {
                  case "Job": {ESLVal $38 = _v10.termRef(0);
                    ESLVal $37 = _v10.termRef(1);
                    ESLVal $36 = _v10.termRef(2);
                    ESLVal $35 = _v10.termRef(3);
                    ESLVal $34 = _v10.termRef(4);
                    ESLVal $33 = _v10.termRef(5);
                    
                    {ESLVal _v48 = $38;
                    
                    {ESLVal tc = $37;
                    
                    {ESLVal ts = $36;
                    
                    {ESLVal ta = $35;
                    
                    {ESLVal pc = $34;
                    
                    {ESLVal c = $33;
                    
                    return new ESLVal("Job",_v48,tc,ts,ta,pc.add($one),c);
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(2919,2987)").add(ESLVal.list(_v10)));
                }
                }
              }
            });
          ESLVal isFullyProcessed = new ESLVal(new Function(new ESLVal("isFullyProcessed"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $0 = $args[0];
            {ESLVal _v11 = $0;
                  
                  switch(_v11.termName) {
                  case "Job": {ESLVal $44 = _v11.termRef(0);
                    ESLVal $43 = _v11.termRef(1);
                    ESLVal $42 = _v11.termRef(2);
                    ESLVal $41 = _v11.termRef(3);
                    ESLVal $40 = _v11.termRef(4);
                    ESLVal $39 = _v11.termRef(5);
                    
                    switch($40.intVal) {
                    case 0: {ESLVal _v46 = $44;
                      
                      {ESLVal tc = $43;
                      
                      {ESLVal ts = $42;
                      
                      {ESLVal ta = $41;
                      
                      {ESLVal c = $39;
                      
                      return $true;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v47 = $44;
                      
                      {ESLVal tc = $43;
                      
                      {ESLVal ts = $42;
                      
                      {ESLVal ta = $41;
                      
                      {ESLVal pc = $40;
                      
                      {ESLVal c = $39;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                    }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(2991,3044)").add(ESLVal.list(_v11)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v15 = $m;
            
            switch(_v15.termName) {
            case "Process": {ESLVal $62 = _v15.termRef(0);
              
              {ESLVal j = $62;
              
              if(adapting.boolVal)
              {ESLVal state = shortestQueue(states,new ESLVal(9999999),$null);
                
                if(state.eql($null).boolVal)
                return cycleProcessor(j);
                else
                  {ESLVal _v18 = state;
                    
                    switch(_v18.termName) {
                    case "PState": {ESLVal $67 = _v18.termRef(0);
                      ESLVal $66 = _v18.termRef(1);
                      
                      {ESLVal p = $67;
                      
                      {ESLVal delay = $66;
                      
                      {Lib.send(p,"Process",reduceCycle.apply(j));
                    {states = addProcessorState(p,delay.add($one),states);
                    return $null;}}
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(4071,4248)").add(ESLVal.list(_v18)));
                  }
                  }
              }
              else
                return cycleProcessor(j);
            }
            }
          case "Reprocess": {ESLVal $61 = _v15.termRef(0);
              
              {ESLVal j = $61;
              
              {increaseCycle.apply(j);
            return Lib.send(getSelf(),"Process",j);}
            }
            }
          case "JobCompleted": {ESLVal $60 = _v15.termRef(0);
              
              {ESLVal j = $60;
              
              if(isFullyProcessed.apply(j).boolVal)
              return jobCompleted(j);
              else
                return Lib.send(getSelf(),"Process",j);
            }
            }
          case "Transition": {ESLVal $59 = _v15.termRef(0);
              ESLVal $58 = _v15.termRef(1);
              ESLVal $57 = _v15.termRef(2);
              ESLVal $56 = _v15.termRef(3);
              
              {ESLVal p = $59;
              
              {ESLVal time = $58;
              
              {ESLVal transition = $57;
              
              {ESLVal state = $56;
              
              if(adapting.boolVal)
              {ESLVal _v16 = state;
                
                switch(_v16.termName) {
                case "Queue": {ESLVal $63 = _v16.termRef(0);
                  
                  {ESLVal delay = $63;
                  
                  {states = addProcessorState(p,delay,states);
                return $null;}
                }
                }
              case "Broken": {
                  {states = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v17 = $qualArg;
                      
                      switch(_v17.termName) {
                      case "PState": {ESLVal $65 = _v17.termRef(0);
                        ESLVal $64 = _v17.termRef(1);
                        
                        {ESLVal pp = $65;
                        
                        {ESLVal qd = $64;
                        
                        return ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                          if(pp.neql(p).boolVal)
                            return ESLVal.list(new ESLVal("PState",pp,qd));
                            else
                              return $nil;
                        }}.get());
                      }
                      }
                      }
                      default: {ESLVal _0 = _v17;
                        
                        return $nil;
                      }
                    }
                    }
                  }
                }).map(states).flatten().flatten();
                return $null;}
                }
                default: return error(new ESLVal("case error at Pos(4581,4749)").add(ESLVal.list(_v16)));
              }
              }
              else
                {ESLVal _v56 = $59;
                  
                  {ESLVal _v57 = $58;
                  
                  {ESLVal _v58 = $57;
                  
                  {ESLVal _v59 = $56;
                  
                  return $null;
                }
                }
                }
                }
            }
            }
            }
            }
            }
          case "Start": {ESLVal $55 = _v15.termRef(0);
              ESLVal $54 = _v15.termRef(1);
              ESLVal $53 = _v15.termRef(2);
              
              {ESLVal p = $55;
              
              {ESLVal time = $54;
              
              {ESLVal state = $53;
              
              return $null;
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v15)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {{
                  ESLVal _v14 = processors[0];
                  while(_v14.isCons()) {
                    ESLVal p = _v14.headVal;
                    p.ref("addObserver").apply(getSelf());
                    _v14 = _v14.tailVal;}
                }
                return $null;}
              }}.get();
          }
        });
    }
  });
  private static ESLVal completedJobs = $nil;
  private static ESLVal minDelay = new ESLVal(new Function(new ESLVal("minDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  ESLVal $1 = $args[1];
  {ESLVal _v19 = $0;
        ESLVal _v20 = $1;
        
        if(_v19.isCons())
        {ESLVal $68 = _v19.head();
          ESLVal $69 = _v19.tail();
          
          switch($68.termName) {
          case "Job": {ESLVal $75 = $68.termRef(0);
            ESLVal $74 = $68.termRef(1);
            ESLVal $73 = $68.termRef(2);
            ESLVal $72 = $68.termRef(3);
            ESLVal $71 = $68.termRef(4);
            ESLVal $70 = $68.termRef(5);
            
            {ESLVal _v43 = $75;
            
            {ESLVal tc = $74;
            
            {ESLVal ts = $73;
            
            {ESLVal ta = $72;
            
            {ESLVal cs = $71;
            
            {ESLVal c = $70;
            
            {ESLVal jobs = $69;
            
            {ESLVal min = _v20;
            
            if(ta.sub(ts).less(min).boolVal)
            return minDelay.apply(jobs,ta.sub(ts));
            else
              {ESLVal j = $68;
                
                {ESLVal _v44 = $69;
                
                {ESLVal _v45 = _v20;
                
                return minDelay.apply(_v44,_v45);
              }
              }
              }
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $68;
            
            {ESLVal jobs = $69;
            
            {ESLVal min = _v20;
            
            return minDelay.apply(jobs,min);
          }
          }
          }
        }
        }
      else if(_v19.isNil())
        {ESLVal min = _v20;
          
          return min;
        }
      else return error(new ESLVal("case error at Pos(5170,5233)").add(ESLVal.list(_v19,_v20)));
      }
    }
  });
  private static ESLVal maxDelay = new ESLVal(new Function(new ESLVal("maxDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  ESLVal $1 = $args[1];
  {ESLVal _v21 = $0;
        ESLVal _v22 = $1;
        
        if(_v21.isCons())
        {ESLVal $76 = _v21.head();
          ESLVal $77 = _v21.tail();
          
          switch($76.termName) {
          case "Job": {ESLVal $83 = $76.termRef(0);
            ESLVal $82 = $76.termRef(1);
            ESLVal $81 = $76.termRef(2);
            ESLVal $80 = $76.termRef(3);
            ESLVal $79 = $76.termRef(4);
            ESLVal $78 = $76.termRef(5);
            
            {ESLVal _v40 = $83;
            
            {ESLVal tc = $82;
            
            {ESLVal ts = $81;
            
            {ESLVal ta = $80;
            
            {ESLVal cs = $79;
            
            {ESLVal c = $78;
            
            {ESLVal jobs = $77;
            
            {ESLVal max = _v22;
            
            if(ta.sub(ts).gre(max).boolVal)
            return maxDelay.apply(jobs,ta.sub(ts));
            else
              {ESLVal j = $76;
                
                {ESLVal _v41 = $77;
                
                {ESLVal _v42 = _v22;
                
                return maxDelay.apply(_v41,_v42);
              }
              }
              }
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $76;
            
            {ESLVal jobs = $77;
            
            {ESLVal max = _v22;
            
            return maxDelay.apply(jobs,max);
          }
          }
          }
        }
        }
      else if(_v21.isNil())
        {ESLVal max = _v22;
          
          return max;
        }
      else return error(new ESLVal("case error at Pos(5416,5479)").add(ESLVal.list(_v21,_v22)));
      }
    }
  });
  private static ESLVal delayedBy = new ESLVal(new Function(new ESLVal("delayedBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  ESLVal $1 = $args[1];
  {ESLVal _v23 = $0;
        ESLVal _v24 = $1;
        
        if(_v23.isCons())
        {ESLVal $84 = _v23.head();
          ESLVal $85 = _v23.tail();
          
          switch($84.termName) {
          case "Job": {ESLVal $91 = $84.termRef(0);
            ESLVal $90 = $84.termRef(1);
            ESLVal $89 = $84.termRef(2);
            ESLVal $88 = $84.termRef(3);
            ESLVal $87 = $84.termRef(4);
            ESLVal $86 = $84.termRef(5);
            
            {ESLVal _v37 = $91;
            
            {ESLVal tc = $90;
            
            {ESLVal ts = $89;
            
            {ESLVal ta = $88;
            
            {ESLVal cs = $87;
            
            {ESLVal c = $86;
            
            {ESLVal jobs = $85;
            
            {ESLVal delay = _v24;
            
            if(ta.sub(ts).greql(delay).boolVal)
            return $one.add(delayedBy.apply(jobs,delay));
            else
              {ESLVal j = $84;
                
                {ESLVal _v38 = $85;
                
                {ESLVal _v39 = _v24;
                
                return delayedBy.apply(_v38,_v39);
              }
              }
              }
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $84;
            
            {ESLVal jobs = $85;
            
            {ESLVal delay = _v24;
            
            return delayedBy.apply(jobs,delay);
          }
          }
          }
        }
        }
      else if(_v23.isNil())
        {ESLVal delay = _v24;
          
          return $zero;
        }
      else return error(new ESLVal("case error at Pos(5662,5726)").add(ESLVal.list(_v23,_v24)));
      }
    }
  });
  private static ESLVal id = $zero;
  private static ESLVal runBehaviour = new ESLVal(new Function(new ESLVal("runBehaviour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal noOfProcessors = $args[0];
  ESLVal noOfCoordinators = $args[1];
  ESLVal[] jobLimit = new ESLVal[]{$args[2]};
  ESLVal jobFrequency = $args[3];
  ESLVal jobsPerCycle = $args[4];
  ESLVal cycles = $args[5];
  ESLVal adapting = $args[6];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("runBehaviour")) {
          
ESLVal time = now();
          ESLVal processors = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newActor(processorBehaviour,new ESLVal(new Actor()),random.apply(new ESLVal(1500)).add(new ESLVal(200))));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(noOfProcessors));
          ESLVal coordinators = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newActor(coordinatorBehaviour,new ESLVal(new Actor()),adapting,processors));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(noOfCoordinators));
          ESLVal completed = $false;
          ESLVal broken = new ESLVal(10);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v30 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v30)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "completed": return completed;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(jobLimit[0]).and(now().sub(time).gre(jobFrequency)).boolVal)
            {time = now();
            {
              ESLVal _v25 = coordinators;
              while(_v25.isCons()) {
                ESLVal coordinator = _v25.headVal;
                {
                  ESLVal _v26 = $zero.to(jobsPerCycle);
                  while(_v26.isCons()) {
                    ESLVal x = _v26.headVal;
                    {Lib.send(coordinator,"Process",new ESLVal("Job",id,$zero,$zero,$zero,cycles,coordinator));
                    id = id.add($one);}
                    _v26 = _v26.tailVal;}
                }
                _v25 = _v25.tailVal;}
            }
            {
              ESLVal _v27 = processors;
              while(_v27.isCons()) {
                ESLVal processor = _v27.headVal;
                if(random.apply(new ESLVal(1000)).gre(new ESLVal(900)).and(broken.gre($zero)).boolVal)
                  {Lib.send(processor,"Break");
                  broken = broken.sub($one);}
                  else
                    {}
                _v27 = _v27.tailVal;}
            }}
            else
              {ESLVal _v35 = $t;
                
                if(completed.not().and(_v35.gre(jobLimit[0]).and(length.apply(head.apply(completedJobs)).eql(id))).boolVal)
                {completed = $true;
                id = $zero;
                {
                  ESLVal _v28 = processors;
                  while(_v28.isCons()) {
                    ESLVal p = _v28.headVal;
                    kill.apply(p);
                    _v28 = _v28.tailVal;}
                }
                {
                  ESLVal _v29 = coordinators;
                  while(_v29.isCons()) {
                    ESLVal p = _v29.headVal;
                    kill.apply(p);
                    _v29 = _v29.tailVal;}
                }
                kill.apply(getSelf());}
                else
                  {ESLVal _v36 = $t;
                    
                    if($true.boolVal)
                    {}
                    else
                      {}
                  }
              }
          }
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {completedJobs = completedJobs.cons($nil);
                {jobLimit[0] = now().add(jobLimit[0]);
                return $null;}}
              }}.get();
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          ESLVal next() {
    
    {print.apply(new ESLVal("runs left: ").add(length.apply(configs)));
    {ESLVal _v31 = head.apply(configs);
      
      switch(_v31.termName) {
      case "Config": {ESLVal $98 = _v31.termRef(0);
        ESLVal $97 = _v31.termRef(1);
        ESLVal $96 = _v31.termRef(2);
        ESLVal $95 = _v31.termRef(3);
        ESLVal $94 = _v31.termRef(4);
        ESLVal $93 = _v31.termRef(5);
        ESLVal $92 = _v31.termRef(6);
        
        {ESLVal noOfProcessors = $98;
        
        {ESLVal noOfCoordinators = $97;
        
        {ESLVal jobLimit = $96;
        
        {ESLVal jobFrequency = $95;
        
        {ESLVal jobsPerCycle = $94;
        
        {ESLVal cycles = $93;
        
        {ESLVal adapting = $92;
        
        {configs = tail.apply(configs);
      {run = newActor(runBehaviour,new ESLVal(new Actor()),noOfProcessors,noOfCoordinators,jobLimit,jobFrequency,jobsPerCycle,cycles,adapting);
      return $null;}}
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(7867,8185)").add(ESLVal.list(_v31)));
    }
    }}
  }
  ESLVal next = new ESLVal(new Function(new ESLVal("next"),null) { public ESLVal apply(ESLVal... args) { return next(); }});
ESLVal configs = ESLVal.list(new ESLVal("Config",new ESLVal(50),new ESLVal(5),new ESLVal(1000),new ESLVal(200),new ESLVal(50),new ESLVal(4),$false),new ESLVal("Config",new ESLVal(50),new ESLVal(5),new ESLVal(1000),new ESLVal(200),new ESLVal(70),new ESLVal(4),$false));
          ESLVal run = $null;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v32 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v32)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(run.ref("completed").and(configs.neql($nil)).boolVal)
            next();
            else
              {ESLVal _v33 = $t;
                
                if(run.ref("completed").boolVal)
                {ESLVal time = now().div(new ESLVal(1000));
                  
                  {ESLVal graph = new ESLVal(new Function(new ESLVal("graph"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal completed = $args[0];
                    return new ESLVal("LineGraph",$nil,new ESLVal("Processing ").add(sum(new SerializableFunction<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal js = $l0.head();
                                $l0 = $l0.tail();
                                $v.add(length.apply(js));
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(completedJobs)).add(new ESLVal(" jobs over ").add(length.apply(completedJobs).add(new ESLVal(" runs in ").add(time.add(new ESLVal(" seconds"))))))),new ESLVal("Delay/10000"),new ESLVal("Number of Jobs Delayed by at Least/1"),new ESLVal(1500),new ESLVal(500),new SerializableFunction<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal jobs = $l0.head();
                                $l0 = $l0.tail();
                                $v.add(new ESLVal("GLine",$nil,new ESLVal("Run-").add(indexOf(jobs,reverse(completedJobs)).add(new ESLVal("(").add(length.apply(jobs).add(new ESLVal(" jobs)"))))),new SerializableFunction<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal delay = $l0.head();
                                $l0 = $l0.tail();
                                if(delay.neql($zero).boolVal) {if(delayedBy.apply(jobs,delay).neql($zero).boolVal) {$v.add(new ESLVal("LPoint",$nil,delay.div(new ESLVal(10000)),delayedBy.apply(jobs,delay).div($one)));
                          }
                          }
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(minDelay.apply(jobs,new ESLVal(9999)).to(maxDelay.apply(jobs,$zero).add($one)))));
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(completed));
                      }
                    });
                  
                  {Lib.send(edb,"Show",new ESLVal("Supply Chain Results"),graph.apply(reverse(completedJobs)));
                print.apply(new ESLVal("Done."));
                stopAll.apply();}
                }
                }
                else
                  {ESLVal _v34 = $t;
                    
                    if($true.boolVal)
                    {}
                    else
                      {}
                  }
              }
          }
        }
        public ESLVal init() {
            return next();
          }
        });
    }
  });
private static ESLVal jobCompleted(ESLVal j) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {completedJobs = tail.apply(completedJobs).cons(head.apply(completedJobs).cons(j));
        return print.apply(new ESLVal("job completed ").add(id.sub(length.apply(head.apply(completedJobs))).add(new ESLVal(" jobs left."))));}
      }}.get();
        }},completedJobs);
  }
  private static ESLVal jobCompleted = new ESLVal(new Function(new ESLVal("jobCompleted"),null) { public ESLVal apply(ESLVal... args) { return jobCompleted(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}
