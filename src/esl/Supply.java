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
  {ESLVal _v1 = j;
        
        switch(_v1.termName) {
        case "Job": {ESLVal $5 = _v1.termRef(0);
          ESLVal $4 = _v1.termRef(1);
          ESLVal $3 = _v1.termRef(2);
          ESLVal $2 = _v1.termRef(3);
          ESLVal $1 = _v1.termRef(4);
          
          {ESLVal id = $5;
          
          {ESLVal current = $4;
          
          {ESLVal shortest = $3;
          
          {ESLVal actual = $2;
          
          {ESLVal pending = $1;
          
          return current;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(769,831)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
  private static ESLVal setJobCurrent = new ESLVal(new Function(new ESLVal("setJobCurrent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  ESLVal current = $args[1];
  {ESLVal _v2 = j;
        
        switch(_v2.termName) {
        case "Job": {ESLVal $10 = _v2.termRef(0);
          ESLVal $9 = _v2.termRef(1);
          ESLVal $8 = _v2.termRef(2);
          ESLVal $7 = _v2.termRef(3);
          ESLVal $6 = _v2.termRef(4);
          
          {ESLVal id = $10;
          
          {ESLVal n = $9;
          
          {ESLVal shortest = $8;
          
          {ESLVal actual = $7;
          
          {ESLVal pending = $6;
          
          return new ESLVal("Job",id,current,shortest,actual,pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(885,979)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  private static ESLVal setJobShortest = new ESLVal(new Function(new ESLVal("setJobShortest"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  ESLVal shortest = $args[1];
  {ESLVal _v3 = j;
        
        switch(_v3.termName) {
        case "Job": {ESLVal $15 = _v3.termRef(0);
          ESLVal $14 = _v3.termRef(1);
          ESLVal $13 = _v3.termRef(2);
          ESLVal $12 = _v3.termRef(3);
          ESLVal $11 = _v3.termRef(4);
          
          {ESLVal id = $15;
          
          {ESLVal n = $14;
          
          {ESLVal t = $13;
          
          {ESLVal actual = $12;
          
          {ESLVal pending = $11;
          
          return new ESLVal("Job",id,n,shortest.add(t),actual,pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1034,1124)").add(ESLVal.list(_v3)));
      }
      }
    }
  });
  private static ESLVal addJobColours = new ESLVal(new Function(new ESLVal("addJobColours"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v4 = j;
        
        switch(_v4.termName) {
        case "Job": {ESLVal $20 = _v4.termRef(0);
          ESLVal $19 = _v4.termRef(1);
          ESLVal $18 = _v4.termRef(2);
          ESLVal $17 = _v4.termRef(3);
          ESLVal $16 = _v4.termRef(4);
          
          {ESLVal id = $20;
          
          {ESLVal n = $19;
          
          {ESLVal shortest = $18;
          
          {ESLVal actual = $17;
          
          {ESLVal pending = $16;
          
          return new ESLVal("Job",id,n,shortest,actual,pending.cons(colours));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1179,1275)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal jobWaits = new ESLVal(new Function(new ESLVal("jobWaits"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v5 = j;
        
        switch(_v5.termName) {
        case "Job": {ESLVal $25 = _v5.termRef(0);
          ESLVal $24 = _v5.termRef(1);
          ESLVal $23 = _v5.termRef(2);
          ESLVal $22 = _v5.termRef(3);
          ESLVal $21 = _v5.termRef(4);
          
          {ESLVal id = $25;
          
          {ESLVal n = $24;
          
          {ESLVal shortest = $23;
          
          {ESLVal actual = $22;
          
          {ESLVal pending = $21;
          
          return new ESLVal("Job",id,n,shortest,actual.add($one),pending);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1330,1420)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal jobId = new ESLVal(new Function(new ESLVal("jobId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v6 = j;
        
        switch(_v6.termName) {
        case "Job": {ESLVal $30 = _v6.termRef(0);
          ESLVal $29 = _v6.termRef(1);
          ESLVal $28 = _v6.termRef(2);
          ESLVal $27 = _v6.termRef(3);
          ESLVal $26 = _v6.termRef(4);
          
          {ESLVal id = $30;
          
          {ESLVal n = $29;
          
          {ESLVal shortest = $28;
          
          {ESLVal actual = $27;
          
          {ESLVal pending = $26;
          
          return id;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1475,1532)").add(ESLVal.list(_v6)));
      }
      }
    }
  });
  private static ESLVal jobDelay = new ESLVal(new Function(new ESLVal("jobDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v7 = j;
        
        switch(_v7.termName) {
        case "Job": {ESLVal $35 = _v7.termRef(0);
          ESLVal $34 = _v7.termRef(1);
          ESLVal $33 = _v7.termRef(2);
          ESLVal $32 = _v7.termRef(3);
          ESLVal $31 = _v7.termRef(4);
          
          {ESLVal id = $35;
          
          {ESLVal n = $34;
          
          {ESLVal shortest = $33;
          
          {ESLVal actual = $32;
          
          {ESLVal pending = $31;
          
          return actual.sub(shortest);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1587,1657)").add(ESLVal.list(_v7)));
      }
      }
    }
  });
  private static ESLVal monitor = new ESLVal(new Function(new ESLVal("monitor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal nodes = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("monitor")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v8 = $m;
            
            switch(_v8.termName) {
            case "Handles": {ESLVal $37 = _v8.termRef(0);
              ESLVal $36 = _v8.termRef(1);
              
              {ESLVal c = $37;
              
              {ESLVal n = $36;
              
              if(isMonitoring.boolVal)
              {{
                ESLVal _v9 = nodes;
                while(_v9.isCons()) {
                  ESLVal node = _v9.headVal;
                  Lib.send(node,"SetProxy",c,n);
                  _v9 = _v9.tailVal;}
              }
              return $null;}
              else
                return $null;
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v8)));
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
            {ESLVal _v11 = jobs;
                  
                  if(_v11.isCons())
                  {ESLVal $38 = _v11.head();
                    ESLVal $39 = _v11.tail();
                    
                    switch($38.termName) {
                    case "Job": {ESLVal $44 = $38.termRef(0);
                      ESLVal $43 = $38.termRef(1);
                      ESLVal $42 = $38.termRef(2);
                      ESLVal $41 = $38.termRef(3);
                      ESLVal $40 = $38.termRef(4);
                      
                      {ESLVal _v42 = $44;
                      
                      {ESLVal current = $43;
                      
                      {ESLVal shortest = $42;
                      
                      {ESLVal actual = $41;
                      
                      {ESLVal pending = $40;
                      
                      {ESLVal _v43 = $39;
                      
                      return process.apply(_v43).cons(new ESLVal("Job",_v42,current.sub($one),shortest,actual.add($one),pending));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v11)));
                  }
                  }
                else if(_v11.isNil())
                  return ESLVal.list();
                else return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v11)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v12 = $m;
            
            switch(_v12.termName) {
            case "Flush": {
              return proxies.ref("clear").apply();
            }
          case "Process": {ESLVal $50 = _v12.termRef(0);
              
              switch($50.termName) {
              case "Job": {ESLVal $55 = $50.termRef(0);
                ESLVal $54 = $50.termRef(1);
                ESLVal $53 = $50.termRef(2);
                ESLVal $52 = $50.termRef(3);
                ESLVal $51 = $50.termRef(4);
                
                if($51.isCons())
                {ESLVal $56 = $51.head();
                  ESLVal $57 = $51.tail();
                  
                  if($56.isCons())
                  {ESLVal $58 = $56.head();
                    ESLVal $59 = $56.tail();
                    
                    {ESLVal _v44 = $55;
                    
                    {ESLVal current = $54;
                    
                    {ESLVal shortest = $53;
                    
                    {ESLVal actual = $52;
                    
                    {ESLVal c = $58;
                    
                    {ESLVal cs = $59;
                    
                    {ESLVal pending = $57;
                    
                    if(c.eql(colour).boolVal)
                    {queue = queue.add(ESLVal.list(new ESLVal("Job",_v44,pTime,shortest.add(pTime),actual,pending.cons(cs))));
                    return $null;}
                    else
                      {ESLVal _v45 = $55;
                        
                        {ESLVal _v46 = $54;
                        
                        {ESLVal _v47 = $53;
                        
                        {ESLVal _v48 = $52;
                        
                        {ESLVal _v49 = $58;
                        
                        {ESLVal _v50 = $59;
                        
                        {ESLVal _v51 = $57;
                        
                        if(proxies.ref("hasKey").apply(_v49).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v49),"Process",new ESLVal("Job",_v45,_v46,_v47,_v48,_v51.cons(_v50.cons(_v49))));
                        else
                          {ESLVal j = $50;
                            
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
                else if($56.isNil())
                  {ESLVal j = $50;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                else {ESLVal j = $50;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                }
              else if($51.isNil())
                {ESLVal j = $50;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              else {ESLVal j = $50;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              }
              default: {ESLVal j = $50;
                
                return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
              }
            }
            }
          case "ChildCompleted": {ESLVal $49 = _v12.termRef(0);
              ESLVal $48 = _v12.termRef(1);
              ESLVal $47 = _v12.termRef(2);
              
              {ESLVal c = $49;
              
              {ESLVal n = $48;
              
              {ESLVal j = $47;
              
              return $null;
            }
            }
            }
            }
          case "SetProxy": {ESLVal $46 = _v12.termRef(0);
              ESLVal $45 = _v12.termRef(1);
              
              {ESLVal c = $46;
              
              {ESLVal n = $45;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v12)));
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
              ESLVal _v10 = completed;
              while(_v10.isCons()) {
                ESLVal j = _v10.headVal;
                Lib.send(parent,"ChildCompleted",colour,getSelf(),j);
                _v10 = _v10.tailVal;}
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
            {ESLVal _v13 = j;
                  
                  switch(_v13.termName) {
                  case "Job": {ESLVal $64 = _v13.termRef(0);
                    ESLVal $63 = _v13.termRef(1);
                    ESLVal $62 = _v13.termRef(2);
                    ESLVal $61 = _v13.termRef(3);
                    ESLVal $60 = _v13.termRef(4);
                    
                    if($60.isCons())
                    {ESLVal $65 = $60.head();
                      ESLVal $66 = $60.tail();
                      
                      if($65.isCons())
                      {ESLVal $67 = $65.head();
                        ESLVal $68 = $65.tail();
                        
                        {ESLVal _v33 = $64;
                        
                        {ESLVal n = $63;
                        
                        {ESLVal t0 = $62;
                        
                        {ESLVal t1 = $61;
                        
                        {ESLVal c = $67;
                        
                        {ESLVal cs = $68;
                        
                        {ESLVal pending = $66;
                        
                        return Lib.send(nth.apply(children,random.apply(length.apply(children))),"Process",j);
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                    else if($65.isNil())
                      {ESLVal jid = $64;
                        
                        {ESLVal n = $63;
                        
                        {ESLVal shortest = $62;
                        
                        {ESLVal actual = $61;
                        
                        {ESLVal pending = $66;
                        
                        return Lib.send(parent,"ChildCompleted",colour,getSelf(),new ESLVal("Job",jid,n,shortest,actual,pending));
                      }
                      }
                      }
                      }
                      }
                    else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v13)));
                    }
                  else if($60.isNil())
                    return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v13)));
                  else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v13)));
                  }
                  default: return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v13)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v14 = $m;
            
            switch(_v14.termName) {
            case "Flush": {
              {proxies.ref("clear").apply();
            {{
              ESLVal _v15 = children;
              while(_v15.isCons()) {
                ESLVal n = _v15.headVal;
                Lib.send(n,"Flush");
                _v15 = _v15.tailVal;}
            }
            return $null;}}
            }
          case "SetProxy": {ESLVal $84 = _v14.termRef(0);
              ESLVal $83 = _v14.termRef(1);
              
              {ESLVal c = $84;
              
              {ESLVal n = $83;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
          case "ChildCompleted": {ESLVal $82 = _v14.termRef(0);
              ESLVal $81 = _v14.termRef(1);
              ESLVal $80 = _v14.termRef(2);
              
              {ESLVal c = $82;
              
              {ESLVal n = $81;
              
              {ESLVal j = $80;
              
              {Lib.send(m,"Handles",c,n);
            return process.apply(j);}
            }
            }
            }
            }
          case "ProcessFailed": {ESLVal $79 = _v14.termRef(0);
              
              {ESLVal j = $79;
              
              return process.apply(j);
            }
            }
          case "Process": {ESLVal $69 = _v14.termRef(0);
              
              switch($69.termName) {
              case "Job": {ESLVal $74 = $69.termRef(0);
                ESLVal $73 = $69.termRef(1);
                ESLVal $72 = $69.termRef(2);
                ESLVal $71 = $69.termRef(3);
                ESLVal $70 = $69.termRef(4);
                
                if($70.isCons())
                {ESLVal $75 = $70.head();
                  ESLVal $76 = $70.tail();
                  
                  if($75.isCons())
                  {ESLVal $77 = $75.head();
                    ESLVal $78 = $75.tail();
                    
                    {ESLVal _v34 = $74;
                    
                    {ESLVal current = $73;
                    
                    {ESLVal shortest = $72;
                    
                    {ESLVal actual = $71;
                    
                    {ESLVal c = $77;
                    
                    {ESLVal cs = $78;
                    
                    {ESLVal pending = $76;
                    
                    if(c.eql(colour).boolVal)
                    return process.apply(new ESLVal("Job",_v34,current,shortest,actual,pending.cons(cs).cons(colours)));
                    else
                      {ESLVal _v35 = $74;
                        
                        {ESLVal _v36 = $73;
                        
                        {ESLVal _v37 = $72;
                        
                        {ESLVal _v38 = $71;
                        
                        {ESLVal _v39 = $77;
                        
                        {ESLVal _v40 = $78;
                        
                        {ESLVal _v41 = $76;
                        
                        if(proxies.ref("hasKey").apply(_v39).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v39),"Process",new ESLVal("Job",_v35,_v36,_v37,_v38,_v41.cons(_v40.cons(_v39))));
                        else
                          {ESLVal j = $69;
                            
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
                else if($75.isNil())
                  {ESLVal j = $69;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                else {ESLVal j = $69;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                  }
                }
              else if($70.isNil())
                {ESLVal j = $69;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              else {ESLVal j = $69;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
                }
              }
              default: {ESLVal j = $69;
                
                return Lib.send(parent,"ProcessFailed",jobWaits.apply(j));
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v14)));
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
  {ESLVal _v16 = jobs;
        
        if(_v16.isCons())
        {ESLVal $85 = _v16.head();
          ESLVal $86 = _v16.tail();
          
          switch($85.termName) {
          case "Job": {ESLVal $91 = $85.termRef(0);
            ESLVal $90 = $85.termRef(1);
            ESLVal $89 = $85.termRef(2);
            ESLVal $88 = $85.termRef(3);
            ESLVal $87 = $85.termRef(4);
            
            {ESLVal id = $91;
            
            {ESLVal t = $90;
            
            {ESLVal possible = $89;
            
            {ESLVal actual = $88;
            
            {ESLVal cs = $87;
            
            {ESLVal _v30 = $86;
            
            if(actual.sub(possible).less(min).boolVal)
            return minDelay.apply(_v30,actual.sub(possible));
            else
              {ESLVal j = $85;
                
                {ESLVal _v31 = $86;
                
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
          default: {ESLVal j = $85;
            
            {ESLVal _v32 = $86;
            
            return minDelay.apply(_v32,min);
          }
          }
        }
        }
      else if(_v16.isNil())
        return min;
      else return error(new ESLVal("case error at Pos(5488,5656)").add(ESLVal.list(_v16)));
      }
    }
  });
  private static ESLVal maxDelay = new ESLVal(new Function(new ESLVal("maxDelay"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal jobs = $args[0];
  ESLVal max = $args[1];
  {ESLVal _v17 = jobs;
        
        if(_v17.isCons())
        {ESLVal $92 = _v17.head();
          ESLVal $93 = _v17.tail();
          
          switch($92.termName) {
          case "Job": {ESLVal $98 = $92.termRef(0);
            ESLVal $97 = $92.termRef(1);
            ESLVal $96 = $92.termRef(2);
            ESLVal $95 = $92.termRef(3);
            ESLVal $94 = $92.termRef(4);
            
            {ESLVal id = $98;
            
            {ESLVal t = $97;
            
            {ESLVal possible = $96;
            
            {ESLVal actual = $95;
            
            {ESLVal cs = $94;
            
            {ESLVal _v27 = $93;
            
            if(actual.sub(possible).gre(max).boolVal)
            return maxDelay.apply(_v27,actual.sub(possible));
            else
              {ESLVal j = $92;
                
                {ESLVal _v28 = $93;
                
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
          default: {ESLVal j = $92;
            
            {ESLVal _v29 = $93;
            
            return maxDelay.apply(_v29,max);
          }
          }
        }
        }
      else if(_v17.isNil())
        return max;
      else return error(new ESLVal("case error at Pos(5697,5865)").add(ESLVal.list(_v17)));
      }
    }
  });
  private static ESLVal delayedBy = new ESLVal(new Function(new ESLVal("delayedBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal jobs = $args[0];
  ESLVal delay = $args[1];
  {ESLVal _v18 = jobs;
        
        if(_v18.isCons())
        {ESLVal $99 = _v18.head();
          ESLVal $100 = _v18.tail();
          
          switch($99.termName) {
          case "Job": {ESLVal $105 = $99.termRef(0);
            ESLVal $104 = $99.termRef(1);
            ESLVal $103 = $99.termRef(2);
            ESLVal $102 = $99.termRef(3);
            ESLVal $101 = $99.termRef(4);
            
            {ESLVal id = $105;
            
            {ESLVal t = $104;
            
            {ESLVal possible = $103;
            
            {ESLVal actual = $102;
            
            {ESLVal cs = $101;
            
            {ESLVal _v24 = $100;
            
            if(actual.sub(possible).greql(delay).boolVal)
            return $one.add(delayedBy.apply(_v24,delay));
            else
              {ESLVal j = $99;
                
                {ESLVal _v25 = $100;
                
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
          default: {ESLVal j = $99;
            
            {ESLVal _v26 = $100;
            
            return delayedBy.apply(_v26,delay);
          }
          }
        }
        }
      else if(_v18.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5909,6076)").add(ESLVal.list(_v18)));
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
                ESLVal _v20 = $zero.to(limit);
                while(_v20.isCons()) {
                  ESLVal i = _v20.headVal;
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
                  _v20 = _v20.tailVal;}
              }
              return table;}
              }
            }).get();
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v21 = $m;
            
            switch(_v21.termName) {
            case "ChildCompleted": {ESLVal $114 = _v21.termRef(0);
              ESLVal $113 = _v21.termRef(1);
              ESLVal $112 = _v21.termRef(2);
              
              {ESLVal c = $114;
              
              {ESLVal n = $113;
              
              {ESLVal j = $112;
              
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
          case "SetProxy": {ESLVal $111 = _v21.termRef(0);
              ESLVal $110 = _v21.termRef(1);
              
              {ESLVal c = $111;
              
              {ESLVal n = $110;
              
              return $null;
            }
            }
            }
          case "ProcessFailed": {ESLVal $109 = _v21.termRef(0);
              
              {ESLVal j = $109;
              
              return Lib.send(child,"Process",j);
            }
            }
          case "Process": {ESLVal $108 = _v21.termRef(0);
              
              {ESLVal j = $108;
              
              return Lib.send(child,"Process",j);
            }
            }
          case "Deprioritize": {ESLVal $107 = _v21.termRef(0);
              
              {ESLVal id = $107;
              
              return $null;
            }
            }
          case "Prioritize": {ESLVal $106 = _v21.termRef(0);
              
              {ESLVal id = $106;
              
              return $null;
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v21)));
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
              ESLVal _v19 = pending.ref("get").apply(counter);
              while(_v19.isCons()) {
                ESLVal j = _v19.headVal;
                Lib.send(getSelf(),"Process",j);
                _v19 = _v19.tailVal;}
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v22 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v22)));
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
