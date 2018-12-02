package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Supply {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal colours = ESLVal.list(new ESLVal("Red",new ESLVal[]{}),new ESLVal("Green",new ESLVal[]{}),new ESLVal("Red",new ESLVal[]{}),new ESLVal("Blue",new ESLVal[]{}),new ESLVal("Blue",new ESLVal[]{}));
  private static ESLVal jobCurrentTime = new ESLVal(new Function(new ESLVal("jobCurrentTime"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v22 = j;
        
        switch(_v22.termName) {
        case "Job": {ESLVal $114 = _v22.termRef(0);
          ESLVal $113 = _v22.termRef(1);
          ESLVal $112 = _v22.termRef(2);
          ESLVal $111 = _v22.termRef(3);
          ESLVal $110 = _v22.termRef(4);
          
          {ESLVal id = $114;
          
          {ESLVal current = $113;
          
          {ESLVal shortest = $112;
          
          {ESLVal actual = $111;
          
          {ESLVal pending = $110;
          
          return current;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(769,831)").add(ESLVal.list(_v22)));
      }
      }
    }
  });
  private static ESLVal setJobCurrent = new ESLVal(new Function(new ESLVal("setJobCurrent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  ESLVal current = $args[1];
  {ESLVal _v21 = j;
        
        switch(_v21.termName) {
        case "Job": {ESLVal $109 = _v21.termRef(0);
          ESLVal $108 = _v21.termRef(1);
          ESLVal $107 = _v21.termRef(2);
          ESLVal $106 = _v21.termRef(3);
          ESLVal $105 = _v21.termRef(4);
          
          {ESLVal id = $109;
          
          {ESLVal n = $108;
          
          {ESLVal shortest = $107;
          
          {ESLVal actual = $106;
          
          {ESLVal pending = $105;
          
          return new ESLVal("Job",id,current,shortest,actual,pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(885,979)").add(ESLVal.list(_v21)));
      }
      }
    }
  });
  private static ESLVal setJobShortest = new ESLVal(new Function(new ESLVal("setJobShortest"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  ESLVal shortest = $args[1];
  {ESLVal _v20 = j;
        
        switch(_v20.termName) {
        case "Job": {ESLVal $104 = _v20.termRef(0);
          ESLVal $103 = _v20.termRef(1);
          ESLVal $102 = _v20.termRef(2);
          ESLVal $101 = _v20.termRef(3);
          ESLVal $100 = _v20.termRef(4);
          
          {ESLVal id = $104;
          
          {ESLVal n = $103;
          
          {ESLVal t = $102;
          
          {ESLVal actual = $101;
          
          {ESLVal pending = $100;
          
          return new ESLVal("Job",id,n,shortest.add(t),actual,pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1034,1124)").add(ESLVal.list(_v20)));
      }
      }
    }
  });
  private static ESLVal addJobColours = new ESLVal(new Function(new ESLVal("addJobColours"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v19 = j;
        
        switch(_v19.termName) {
        case "Job": {ESLVal $99 = _v19.termRef(0);
          ESLVal $98 = _v19.termRef(1);
          ESLVal $97 = _v19.termRef(2);
          ESLVal $96 = _v19.termRef(3);
          ESLVal $95 = _v19.termRef(4);
          
          {ESLVal id = $99;
          
          {ESLVal n = $98;
          
          {ESLVal shortest = $97;
          
          {ESLVal actual = $96;
          
          {ESLVal pending = $95;
          
          return new ESLVal("Job",id,n,shortest,actual,pending.cons(colours));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1179,1275)").add(ESLVal.list(_v19)));
      }
      }
    }
  });
  private static ESLVal jobWaits = new ESLVal(new Function(new ESLVal("jobWaits"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v18 = j;
        
        switch(_v18.termName) {
        case "Job": {ESLVal $94 = _v18.termRef(0);
          ESLVal $93 = _v18.termRef(1);
          ESLVal $92 = _v18.termRef(2);
          ESLVal $91 = _v18.termRef(3);
          ESLVal $90 = _v18.termRef(4);
          
          {ESLVal id = $94;
          
          {ESLVal n = $93;
          
          {ESLVal shortest = $92;
          
          {ESLVal actual = $91;
          
          {ESLVal pending = $90;
          
          return new ESLVal("Job",id,n,shortest,actual.add($one),pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1330,1420)").add(ESLVal.list(_v18)));
      }
      }
    }
  });
  private static ESLVal jobId = new ESLVal(new Function(new ESLVal("jobId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v17 = j;
        
        switch(_v17.termName) {
        case "Job": {ESLVal $89 = _v17.termRef(0);
          ESLVal $88 = _v17.termRef(1);
          ESLVal $87 = _v17.termRef(2);
          ESLVal $86 = _v17.termRef(3);
          ESLVal $85 = _v17.termRef(4);
          
          {ESLVal id = $89;
          
          {ESLVal n = $88;
          
          {ESLVal shortest = $87;
          
          {ESLVal actual = $86;
          
          {ESLVal pending = $85;
          
          return id;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1475,1532)").add(ESLVal.list(_v17)));
      }
      }
    }
  });
  private static ESLVal jobDelay = new ESLVal(new Function(new ESLVal("jobDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v16 = j;
        
        switch(_v16.termName) {
        case "Job": {ESLVal $84 = _v16.termRef(0);
          ESLVal $83 = _v16.termRef(1);
          ESLVal $82 = _v16.termRef(2);
          ESLVal $81 = _v16.termRef(3);
          ESLVal $80 = _v16.termRef(4);
          
          {ESLVal id = $84;
          
          {ESLVal n = $83;
          
          {ESLVal shortest = $82;
          
          {ESLVal actual = $81;
          
          {ESLVal pending = $80;
          
          return actual.sub(shortest);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1587,1657)").add(ESLVal.list(_v16)));
      }
      }
    }
  });
  private static ESLVal monitor = new ESLVal(new Function(new ESLVal("monitor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal nodes = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("monitor")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v14 = $m;
            
            switch(_v14.termName) {
            case "Handles": {ESLVal $79 = _v14.termRef(0);
              ESLVal $78 = _v14.termRef(1);
              
              {ESLVal c = $79;
              
              {ESLVal n = $78;
              
              if(isMonitoring.boolVal)
              {{
                ESLVal _v15 = nodes;
                while(_v15.isCons()) {
                  ESLVal node = _v15.headVal;
                  Lib.send(node,"SetProxy",c,n);
                  _v15 = _v15.tailVal;}
              }
              return $null;}
              else
                return $null;
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v14)));
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
  private static ESLVal counter = $zero;
  private static ESLVal newId = new ESLVal(new Function(new ESLVal("newId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return lock(new Function(new ESLVal("grab"),getSelf()) {
          public ESLVal apply(ESLVal ...args) { 
            return ((Supplier<ESLVal>)() -> { 
          {counter = counter.add($one);
          return counter;}
        }).get();
          }},counter);
    }
  });
  private static ESLVal leaf = new ESLVal(new Function(new ESLVal("leaf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal colour = $args[1];
  ESLVal parent = $args[2];
  ESLVal pTime = $args[3];
  ESLVal qLength = $args[4];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("leaf")) {
          ESLVal queue = ESLVal.list();
          ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return colour;
              }
            });
          ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return id;
              }
            });
          ESLVal proxies = newTable();
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal jobs = $args[0];
            {ESLVal _v12 = jobs;
                  
                  if(_v12.isCons())
                  {ESLVal $56 = _v12.head();
                    ESLVal $57 = _v12.tail();
                    
                    switch($56.termName) {
                    case "Job": {ESLVal $62 = $56.termRef(0);
                      ESLVal $61 = $56.termRef(1);
                      ESLVal $60 = $56.termRef(2);
                      ESLVal $59 = $56.termRef(3);
                      ESLVal $58 = $56.termRef(4);
                      
                      {ESLVal _v42 = $62;
                      
                      {ESLVal current = $61;
                      
                      {ESLVal shortest = $60;
                      
                      {ESLVal actual = $59;
                      
                      {ESLVal pending = $58;
                      
                      {ESLVal _v43 = $57;
                      
                      return process.apply(_v43).cons(new ESLVal("Job",_v42,current.sub($one),shortest,actual.add($one),pending));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v12)));
                  }
                  }
                else if(_v12.isNil())
                  return ESLVal.list();
                else return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v12)));
                }
              }
            });
          ESLVal isFinished = new ESLVal(new Function(new ESLVal("isFinished"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal j = $args[0];
            return jobCurrentTime.apply(j).lesseql($zero);
              }
            });
          ESLVal isIncomplete = new ESLVal(new Function(new ESLVal("isIncomplete"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal j = $args[0];
            return isFinished.apply(j).not();
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v13 = $m;
            
            switch(_v13.termName) {
            case "Flush": {
              return proxies.ref("clear").apply();
            }
          case "Process": {ESLVal $68 = _v13.termRef(0);
              
              switch($68.termName) {
              case "Job": {ESLVal $73 = $68.termRef(0);
                ESLVal $72 = $68.termRef(1);
                ESLVal $71 = $68.termRef(2);
                ESLVal $70 = $68.termRef(3);
                ESLVal $69 = $68.termRef(4);
                
                if($69.isCons())
                {ESLVal $74 = $69.head();
                  ESLVal $75 = $69.tail();
                  
                  if($74.isCons())
                  {ESLVal $76 = $74.head();
                    ESLVal $77 = $74.tail();
                    
                    {ESLVal _v44 = $73;
                    
                    {ESLVal current = $72;
                    
                    {ESLVal shortest = $71;
                    
                    {ESLVal actual = $70;
                    
                    {ESLVal c = $76;
                    
                    {ESLVal cs = $77;
                    
                    {ESLVal pending = $75;
                    
                    if(c.eql(colour).boolVal)
                    {queue = queue.add(ESLVal.list(new ESLVal("Job",_v44,pTime,shortest.add(pTime),actual,pending.cons(cs))));
                    return $null;}
                    else
                      {ESLVal _v45 = $73;
                        
                        {ESLVal _v46 = $72;
                        
                        {ESLVal _v47 = $71;
                        
                        {ESLVal _v48 = $70;
                        
                        {ESLVal _v49 = $76;
                        
                        {ESLVal _v50 = $77;
                        
                        {ESLVal _v51 = $75;
                        
                        if(proxies.ref("hasKey").apply(_v49).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v49),"Process",new ESLVal("Job",_v45,_v46,_v47,_v48,_v51.cons(_v50.cons(_v49))));
                        else
                          {ESLVal j = $68;
                            
                            return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
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
                  }
                  }
                  }
                  }
                else if($74.isNil())
                  {ESLVal j = $68;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                else {ESLVal j = $68;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                }
              else if($69.isNil())
                {ESLVal j = $68;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              else {ESLVal j = $68;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              }
              default: {ESLVal j = $68;
                
                return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
              }
            }
            }
          case "ChildCompleted": {ESLVal $67 = _v13.termRef(0);
              ESLVal $66 = _v13.termRef(1);
              ESLVal $65 = _v13.termRef(2);
              
              {ESLVal c = $67;
              
              {ESLVal n = $66;
              
              {ESLVal j = $65;
              
              return $null;
            }
            }
            }
            }
          case "SetProxy": {ESLVal $64 = _v13.termRef(0);
              ESLVal $63 = _v13.termRef(1);
              
              {ESLVal c = $64;
              
              {ESLVal n = $63;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v13)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getColour": return getColour;
              case "getId": return getId;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {ESLVal processed = process.apply(take.apply(queue,qLength));
              ESLVal unprocessed = drop.apply(queue,qLength);
              
              {ESLVal completed = select.apply(isFinished,processed);
              ESLVal incomplete = select.apply(isIncomplete,processed);
              
              {queue = incomplete.add(new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal j = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(jobWaits.apply(j));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(unprocessed));
            {
              ESLVal _v11 = completed;
              while(_v11.isCons()) {
                ESLVal j = _v11.headVal;
                Lib.send(parent,"ChildCompleted",colour,getSelf(),j);
                _v11 = _v11.tailVal;}
            }}
            }
            }
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
  private static ESLVal container = new ESLVal(new Function(new ESLVal("container"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal depth = $args[1];
  ESLVal colour = $args[2];
  ESLVal parent = $args[3];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("container")) {
          ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return colour;
              }
            });
          ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return id;
              }
            });
          ESLVal proxies = newTable();
          ESLVal children = ESLVal.list();
          ESLVal m = $null;
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal j = $args[0];
            {ESLVal _v8 = j;
                  
                  switch(_v8.termName) {
                  case "Job": {ESLVal $35 = _v8.termRef(0);
                    ESLVal $34 = _v8.termRef(1);
                    ESLVal $33 = _v8.termRef(2);
                    ESLVal $32 = _v8.termRef(3);
                    ESLVal $31 = _v8.termRef(4);
                    
                    if($31.isCons())
                    {ESLVal $36 = $31.head();
                      ESLVal $37 = $31.tail();
                      
                      if($36.isCons())
                      {ESLVal $38 = $36.head();
                        ESLVal $39 = $36.tail();
                        
                        {ESLVal _v33 = $35;
                        
                        {ESLVal n = $34;
                        
                        {ESLVal t0 = $33;
                        
                        {ESLVal t1 = $32;
                        
                        {ESLVal c = $38;
                        
                        {ESLVal cs = $39;
                        
                        {ESLVal pending = $37;
                        
                        return Lib.send(nth.apply(children,random.apply(length.apply(children))),"Process",j);
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                    else if($36.isNil())
                      {ESLVal jid = $35;
                        
                        {ESLVal n = $34;
                        
                        {ESLVal shortest = $33;
                        
                        {ESLVal actual = $32;
                        
                        {ESLVal pending = $37;
                        
                        return Lib.send(parent,"ChildCompleted",colour,getSelf(),new ESLVal("Job",jid,n,shortest,actual,pending));
                      }
                      }
                      }
                      }
                      }
                    else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v8)));
                    }
                  else if($31.isNil())
                    return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v8)));
                  else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v8)));
                  }
                  default: return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v8)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v9 = $m;
            
            switch(_v9.termName) {
            case "Flush": {
              {proxies.ref("clear").apply();
            {{
              ESLVal _v10 = children;
              while(_v10.isCons()) {
                ESLVal n = _v10.headVal;
                Lib.send(n,"Flush");
                _v10 = _v10.tailVal;}
            }
            return $null;}}
            }
          case "SetProxy": {ESLVal $55 = _v9.termRef(0);
              ESLVal $54 = _v9.termRef(1);
              
              {ESLVal c = $55;
              
              {ESLVal n = $54;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
          case "ChildCompleted": {ESLVal $53 = _v9.termRef(0);
              ESLVal $52 = _v9.termRef(1);
              ESLVal $51 = _v9.termRef(2);
              
              {ESLVal c = $53;
              
              {ESLVal n = $52;
              
              {ESLVal j = $51;
              
              {Lib.send(m,"Handles",c,n);
            return process.apply(j);}
            }
            }
            }
            }
          case "ProcessFailed": {ESLVal $50 = _v9.termRef(0);
              
              {ESLVal j = $50;
              
              return process.apply(j);
            }
            }
          case "Process": {ESLVal $40 = _v9.termRef(0);
              
              switch($40.termName) {
              case "Job": {ESLVal $45 = $40.termRef(0);
                ESLVal $44 = $40.termRef(1);
                ESLVal $43 = $40.termRef(2);
                ESLVal $42 = $40.termRef(3);
                ESLVal $41 = $40.termRef(4);
                
                if($41.isCons())
                {ESLVal $46 = $41.head();
                  ESLVal $47 = $41.tail();
                  
                  if($46.isCons())
                  {ESLVal $48 = $46.head();
                    ESLVal $49 = $46.tail();
                    
                    {ESLVal _v34 = $45;
                    
                    {ESLVal current = $44;
                    
                    {ESLVal shortest = $43;
                    
                    {ESLVal actual = $42;
                    
                    {ESLVal c = $48;
                    
                    {ESLVal cs = $49;
                    
                    {ESLVal pending = $47;
                    
                    if(c.eql(colour).boolVal)
                    return process.apply(new ESLVal("Job",_v34,current,shortest,actual,pending.cons(cs).cons(colours)));
                    else
                      {ESLVal _v35 = $45;
                        
                        {ESLVal _v36 = $44;
                        
                        {ESLVal _v37 = $43;
                        
                        {ESLVal _v38 = $42;
                        
                        {ESLVal _v39 = $48;
                        
                        {ESLVal _v40 = $49;
                        
                        {ESLVal _v41 = $47;
                        
                        if(proxies.ref("hasKey").apply(_v39).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v39),"Process",new ESLVal("Job",_v35,_v36,_v37,_v38,_v41.cons(_v40.cons(_v39))));
                        else
                          {ESLVal j = $40;
                            
                            return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
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
                  }
                  }
                  }
                  }
                else if($46.isNil())
                  {ESLVal j = $40;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                else {ESLVal j = $40;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                }
              else if($41.isNil())
                {ESLVal j = $40;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              else {ESLVal j = $40;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              }
              default: {ESLVal j = $40;
                
                return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v9)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getColour": return getColour;
              case "getId": return getId;
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
                if(depth.eql($zero).boolVal)
                  {children = new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal c = $l0.head();
                        $l0 = $l0.tail();
                        ESLVal $l1 = ESLVal.list(new ESLVal(10));
                  while(!$l1.isNil()) {
                    ESLVal processing = $l1.head();
                    $l1 = $l1.tail();
                    ESLVal $l2 = ESLVal.list(new ESLVal(5));
                    while(!$l2.isNil()) {
                      ESLVal queue = $l2.head();
                      $l2 = $l2.tail();
                      $v.add(newActor(leaf,new ESLVal(new Actor()),newId.apply(),c,getSelf(),processing,queue));
                    }
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(colours);
                  {m = newActor(monitor,new ESLVal(new Actor()),children);
                  return $null;}}
                  else
                    {children = new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal c = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = $zero.to(maxChildren.apply());
                    while(!$l1.isNil()) {
                      ESLVal numOfChildren = $l1.head();
                      $l1 = $l1.tail();
                      $v.add(newActor(container,new ESLVal(new Actor()),newId.apply(),depth.sub($one),c,getSelf()));
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(colours);
                    {m = newActor(monitor,new ESLVal(new Actor()),children);
                    return $null;}}
              }).get();
          }
        });
    }
  });
  private static ESLVal maxChildren = new ESLVal(new Function(new ESLVal("maxChildren"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(3);
    }
  });
  private static ESLVal isMonitoring = $false;
  private static ESLVal minDelay = new ESLVal(new Function(new ESLVal("minDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal jobs = $args[0];
  ESLVal min = $args[1];
  {ESLVal _v7 = jobs;
        
        if(_v7.isCons())
        {ESLVal $24 = _v7.head();
          ESLVal $25 = _v7.tail();
          
          switch($24.termName) {
          case "Job": {ESLVal $30 = $24.termRef(0);
            ESLVal $29 = $24.termRef(1);
            ESLVal $28 = $24.termRef(2);
            ESLVal $27 = $24.termRef(3);
            ESLVal $26 = $24.termRef(4);
            
            {ESLVal id = $30;
            
            {ESLVal t = $29;
            
            {ESLVal possible = $28;
            
            {ESLVal actual = $27;
            
            {ESLVal cs = $26;
            
            {ESLVal _v30 = $25;
            
            if(actual.sub(possible).less(min).boolVal)
            return minDelay.apply(_v30,actual.sub(possible));
            else
              {ESLVal j = $24;
                
                {ESLVal _v31 = $25;
                
                return minDelay.apply(_v31,min);
              }
              }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $24;
            
            {ESLVal _v32 = $25;
            
            return minDelay.apply(_v32,min);
          }
          }
        }
        }
      else if(_v7.isNil())
        return min;
      else return error(new ESLVal("case error at Pos(5488,5656)").add(ESLVal.list(_v7)));
      }
    }
  });
  private static ESLVal maxDelay = new ESLVal(new Function(new ESLVal("maxDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal jobs = $args[0];
  ESLVal max = $args[1];
  {ESLVal _v6 = jobs;
        
        if(_v6.isCons())
        {ESLVal $17 = _v6.head();
          ESLVal $18 = _v6.tail();
          
          switch($17.termName) {
          case "Job": {ESLVal $23 = $17.termRef(0);
            ESLVal $22 = $17.termRef(1);
            ESLVal $21 = $17.termRef(2);
            ESLVal $20 = $17.termRef(3);
            ESLVal $19 = $17.termRef(4);
            
            {ESLVal id = $23;
            
            {ESLVal t = $22;
            
            {ESLVal possible = $21;
            
            {ESLVal actual = $20;
            
            {ESLVal cs = $19;
            
            {ESLVal _v27 = $18;
            
            if(actual.sub(possible).gre(max).boolVal)
            return maxDelay.apply(_v27,actual.sub(possible));
            else
              {ESLVal j = $17;
                
                {ESLVal _v28 = $18;
                
                return maxDelay.apply(_v28,max);
              }
              }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $17;
            
            {ESLVal _v29 = $18;
            
            return maxDelay.apply(_v29,max);
          }
          }
        }
        }
      else if(_v6.isNil())
        return max;
      else return error(new ESLVal("case error at Pos(5697,5865)").add(ESLVal.list(_v6)));
      }
    }
  });
  private static ESLVal delayedBy = new ESLVal(new Function(new ESLVal("delayedBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal jobs = $args[0];
  ESLVal delay = $args[1];
  {ESLVal _v5 = jobs;
        
        if(_v5.isCons())
        {ESLVal $10 = _v5.head();
          ESLVal $11 = _v5.tail();
          
          switch($10.termName) {
          case "Job": {ESLVal $16 = $10.termRef(0);
            ESLVal $15 = $10.termRef(1);
            ESLVal $14 = $10.termRef(2);
            ESLVal $13 = $10.termRef(3);
            ESLVal $12 = $10.termRef(4);
            
            {ESLVal id = $16;
            
            {ESLVal t = $15;
            
            {ESLVal possible = $14;
            
            {ESLVal actual = $13;
            
            {ESLVal cs = $12;
            
            {ESLVal _v24 = $11;
            
            if(actual.sub(possible).greql(delay).boolVal)
            return $one.add(delayedBy.apply(_v24,delay));
            else
              {ESLVal j = $10;
                
                {ESLVal _v25 = $11;
                
                return delayedBy.apply(_v25,delay);
              }
              }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal j = $10;
            
            {ESLVal _v26 = $11;
            
            return delayedBy.apply(_v26,delay);
          }
          }
        }
        }
      else if(_v5.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5909,6076)").add(ESLVal.list(_v5)));
      }
    }
  });
  private static ESLVal root = new ESLVal(new Function(new ESLVal("root"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal depth = $args[0];
  ESLVal limit = $args[1];
  ESLVal nodes = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("root")) {
          ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("Red",new ESLVal[]{});
              }
            });
          ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return $zero;
              }
            });
          ESLVal child = newActor(container,new ESLVal(new Actor()),newId.apply(),depth,new ESLVal("Red",new ESLVal[]{}),getSelf());
          ESLVal jobs = $zero;
          ESLVal runs = new ESLVal(4);
          ESLVal completed = ESLVal.list(ESLVal.list());
          ESLVal counter = $zero;
          ESLVal pending = ((Supplier<ESLVal>)() -> { 
              {ESLVal table = newTable();
                
                {{
                ESLVal _v3 = $zero.to(limit);
                while(_v3.isCons()) {
                  ESLVal i = _v3.headVal;
                  {table.ref("put").apply(i,new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal j = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Job",newId.apply(),$zero,$zero,$zero,ESLVal.list(ESLVal.list(new ESLVal("Red",new ESLVal[]{})))));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($zero.to(random.apply(nodes).add($one))));
                  jobs = jobs.add(length.apply(table.ref("get").apply(i)));}
                  _v3 = _v3.tailVal;}
              }
              return table;}
              }
            }).get();
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "ChildCompleted": {ESLVal $9 = _v4.termRef(0);
              ESLVal $8 = _v4.termRef(1);
              ESLVal $7 = _v4.termRef(2);
              
              {ESLVal c = $9;
              
              {ESLVal n = $8;
              
              {ESLVal j = $7;
              
              {completed = tail.apply(completed).cons(head.apply(completed).cons(j));
            print.apply(length.apply(head.apply(completed)).add(new ESLVal(" of ").add(jobs)));
            if(length.apply(head.apply(completed)).eql(jobs).boolVal)
              {print.apply(new ESLVal("completed ").add(jobs.add(new ESLVal(" jobs"))));
              {ESLVal graph = new ESLVal(new Function(new ESLVal("graph"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal completed = $args[0];
                  return new ESLVal("LineGraph",ESLVal.list(),new ESLVal("Processing ").add(jobs.add(new ESLVal(" jobs over ").add(runs.add(new ESLVal(" runs in ").add(now().div(new ESLVal(1000)).add(new ESLVal(" seconds"))))))),new ESLVal("Delay/10"),new ESLVal("Number of Jobs Delayed by at Least/10"),new ESLVal(1200),new ESLVal(500),new java.util.function.Function<ESLVal,ESLVal>() {
                          public ESLVal apply(ESLVal $l0) {
                            ESLVal $a = $nil;
                            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                            while(!$l0.isNil()) { 
                              ESLVal run = $l0.head();
                              $l0 = $l0.tail();
                              ESLVal $l1 = ESLVal.list(nth.apply(completed,run));
                        while(!$l1.isNil()) {
                          ESLVal jobs = $l1.head();
                          $l1 = $l1.tail();
                          $v.add(new ESLVal("GLine",ESLVal.list(),new ESLVal("Run-").add(run.add(((Supplier<ESLVal>)() -> { 
                            if(run.less(runs.div(new ESLVal(2))).boolVal)
                              return new ESLVal("(monitored)");
                              else
                                return new ESLVal("");
                          }).get())),new java.util.function.Function<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal delay = $l0.head();
                                $l0 = $l0.tail();
                                if(delay.neql($zero).boolVal) {if(delayedBy.apply(jobs,delay).neql($zero).boolVal) {$v.add(new ESLVal("LPoint",ESLVal.list(),delay.div(new ESLVal(10)),delayedBy.apply(jobs,delay).div(new ESLVal(10))));
                          }
                          }
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(minDelay.apply(jobs,new ESLVal(9999)).to(maxDelay.apply(jobs,$zero).add($one)))));
                        }
                            }
                            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                            return $a;
                          }}.apply($zero.to(runs)));
                    }
                  });
                
                if(length.apply(completed).eql(runs).boolVal)
                {Lib.send(edb,"Show",new ESLVal("Supply Chain Results"),graph.apply(completed));
                return stopAll.apply();}
                else
                  {if(length.apply(completed).greql(runs.div(new ESLVal(2))).boolVal)
                    isMonitoring = $true;
                    else
                      {}
                  completed = completed.cons(ESLVal.list());
                  Lib.send(child,"Flush");
                  {counter = $zero;
                  return $null;}}
              }}
              else
                return $null;}
            }
            }
            }
            }
          case "Flush": {
              return Lib.send(child,"Flush");
            }
          case "SetProxy": {ESLVal $6 = _v4.termRef(0);
              ESLVal $5 = _v4.termRef(1);
              
              {ESLVal c = $6;
              
              {ESLVal n = $5;
              
              return $null;
            }
            }
            }
          case "ProcessFailed": {ESLVal $4 = _v4.termRef(0);
              
              {ESLVal j = $4;
              
              return Lib.send(child,"Process",j);
            }
            }
          case "Process": {ESLVal $3 = _v4.termRef(0);
              
              {ESLVal j = $3;
              
              return Lib.send(child,"Process",j);
            }
            }
          case "Deprioritize": {ESLVal $2 = _v4.termRef(0);
              
              {ESLVal id = $2;
              
              return $null;
            }
            }
          case "Prioritize": {ESLVal $1 = _v4.termRef(0);
              
              {ESLVal id = $1;
              
              return $null;
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getColour": return getColour;
              case "getId": return getId;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(counter.less(limit).boolVal)
            {{
              ESLVal _v2 = pending.ref("get").apply(counter);
              while(_v2.isCons()) {
                ESLVal j = _v2.headVal;
                Lib.send(getSelf(),"Process",j);
                _v2 = _v2.tailVal;}
            }
            counter = counter.add($one);}
            else
              {ESLVal _v23 = $t;
                
                if($true.boolVal)
                {}
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
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          ESLVal rootNode = newActor(root,new ESLVal(new Actor()),new ESLVal(2),new ESLVal(200),new ESLVal(25));
          
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
            return $null;
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}