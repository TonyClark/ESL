package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Tables.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Supply {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal jobId = new ESLVal(new Function(new ESLVal("jobId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v14 = j;
        
        switch(_v14.termName) {
        case "Job": {ESLVal $55 = _v14.termRef(0);
          ESLVal $54 = _v14.termRef(1);
          ESLVal $53 = _v14.termRef(2);
          ESLVal $52 = _v14.termRef(3);
          
          {ESLVal id = $55;
          
          {ESLVal p = $54;
          
          {ESLVal minTime = $53;
          
          {ESLVal actualTime = $52;
          
          return id;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(660,712)").add(ESLVal.list(_v14)));
      }
      }
    }
  });
  private static ESLVal chain1 = new ESLVal("Seq",new ESLVal("Processor",new ESLVal("A"),new ESLVal(100),new ESLVal(5),$one),new ESLVal("Seq",new ESLVal("Or",new ESLVal("Processor",new ESLVal("B"),new ESLVal(100),new ESLVal(5),$one),new ESLVal("Processor",new ESLVal("C"),new ESLVal(50),new ESLVal(5),$one)),new ESLVal("Processor",new ESLVal("D"),new ESLVal(20),new ESLVal(5),$one)));
  private static ESLVal node = new ESLVal(new Function(new ESLVal("node"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal successor = $args[1];
  ESLVal processingTime = $args[2];
  ESLVal maxJobs = $args[3];
  ESLVal failureRate = $args[4];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("node")) {
          ESLVal queue = ESLVal.list();
          ESLVal waiting = ESLVal.list();
          ESLVal forwardCompletedJobs = new ESLVal(new Function(new ESLVal("forwardCompletedJobs"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal as = $args[0];
            {ESLVal _v12 = as;
                  
                  if(_v12.isCons())
                  {ESLVal $47 = _v12.head();
                    ESLVal $48 = _v12.tail();
                    
                    switch($47.termName) {
                    case "Active": {ESLVal $50 = $47.termRef(0);
                      ESLVal $49 = $47.termRef(1);
                      
                      switch($49.intVal) {
                      case 0: {ESLVal j = $50;
                        
                        {ESLVal _v23 = $48;
                        
                        {Lib.send(successor,"Process",j);
                      return forwardCompletedJobs.apply(_v23);}
                      }
                      }
                      default: {ESLVal a = $47;
                        
                        {ESLVal _v24 = $48;
                        
                        return forwardCompletedJobs.apply(_v24).cons(a);
                      }
                      }
                    }
                    }
                    default: {ESLVal a = $47;
                      
                      {ESLVal _v25 = $48;
                      
                      return forwardCompletedJobs.apply(_v25).cons(a);
                    }
                    }
                  }
                  }
                else if(_v12.isNil())
                  return ESLVal.list();
                else return error(new ESLVal("case error at Pos(1104,1278)").add(ESLVal.list(_v12)));
                }
              }
            });
          ESLVal addWait = new ESLVal(new Function(new ESLVal("addWait"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal j = $args[0];
            ESLVal jobs = $args[1];
            {ESLVal _v11 = jobs;
                  
                  if(_v11.isCons())
                  {ESLVal $41 = _v11.head();
                    ESLVal $42 = _v11.tail();
                    
                    switch($41.termName) {
                    case "Job": {ESLVal $46 = $41.termRef(0);
                      ESLVal $45 = $41.termRef(1);
                      ESLVal $44 = $41.termRef(2);
                      ESLVal $43 = $41.termRef(3);
                      
                      {ESLVal id = $46;
                      
                      {ESLVal p = $45;
                      
                      {ESLVal minTime = $44;
                      
                      {ESLVal actualTime = $43;
                      
                      {ESLVal _v20 = $42;
                      
                      if(id.eql(jobId.apply(j)).boolVal)
                      {process.apply(j,new ESLVal("End",new ESLVal[]{}));
                      return _v20;}
                      else
                        {ESLVal jj = $41;
                          
                          {ESLVal _v21 = $42;
                          
                          return addWait.apply(j,_v21).cons(jj);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal jj = $41;
                      
                      {ESLVal _v22 = $42;
                      
                      return addWait.apply(j,_v22).cons(jj);
                    }
                    }
                  }
                  }
                else if(_v11.isNil())
                  return ESLVal.list(j);
                else return error(new ESLVal("case error at Pos(1322,1503)").add(ESLVal.list(_v11)));
                }
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal j = $args[0];
            ESLVal rest = $args[1];
            {ESLVal _v10 = j;
                  
                  switch(_v10.termName) {
                  case "Job": {ESLVal $34 = _v10.termRef(0);
                    ESLVal $33 = _v10.termRef(1);
                    ESLVal $32 = _v10.termRef(2);
                    ESLVal $31 = _v10.termRef(3);
                    
                    switch($33.termName) {
                    case "Name": {ESLVal $40 = $33.termRef(0);
                      
                      {ESLVal id = $34;
                      
                      {ESLVal n = $40;
                      
                      {ESLVal m1 = $32;
                      
                      {ESLVal m2 = $31;
                      
                      if(n.eql(name).boolVal)
                      {queue = queue.cons(new ESLVal("Active",new ESLVal("Job",id,rest,m1.add(processingTime),m2),processingTime));
                      return $null;}
                      else
                        {ESLVal _v16 = $34;
                          
                          {ESLVal _v17 = $40;
                          
                          {ESLVal _v18 = $32;
                          
                          {ESLVal _v19 = $31;
                          
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
                  case "Then": {ESLVal $39 = $33.termRef(0);
                      ESLVal $38 = $33.termRef(1);
                      
                      {ESLVal id = $34;
                      
                      {ESLVal p1 = $39;
                      
                      {ESLVal p2 = $38;
                      
                      {ESLVal m = $32;
                      
                      {ESLVal n = $31;
                      
                      return process.apply(new ESLVal("Job",id,p1,m,n),new ESLVal("Then",p2,rest));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "And": {ESLVal $37 = $33.termRef(0);
                      ESLVal $36 = $33.termRef(1);
                      
                      {ESLVal id = $34;
                      
                      {ESLVal p1 = $37;
                      
                      {ESLVal p2 = $36;
                      
                      {ESLVal m = $32;
                      
                      {ESLVal n = $31;
                      
                      {Lib.send(getSelf(),"Process",new ESLVal("Job",id,new ESLVal("Then",p1,new ESLVal("Join",rest)),m,n));
                    return Lib.send(getSelf(),"Process",new ESLVal("Job",id,new ESLVal("Then",p2,new ESLVal("Join",rest)),m,n));}
                    }
                    }
                    }
                    }
                    }
                    }
                  case "Join": {ESLVal $35 = $33.termRef(0);
                      
                      {ESLVal id = $34;
                      
                      {ESLVal p = $35;
                      
                      {ESLVal m = $32;
                      
                      {ESLVal n = $31;
                      
                      {waiting = addWait.apply(new ESLVal("Job",id,p,m,n),waiting);
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(1545,2084)").add(ESLVal.list(_v10)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(1545,2084)").add(ESLVal.list(_v10)));
                }
                }
              }
            });
          ESLVal getMaxJobs = new ESLVal(new Function(new ESLVal("getMaxJobs"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal queue = $args[0];
            ESLVal max = $args[1];
            if(max.eql($zero).boolVal)
                  return ESLVal.list();
                  else
                    if(queue.eql(ESLVal.list()).boolVal)
                      return ESLVal.list();
                      else
                        return getMaxJobs.apply(tail.apply(queue),max.sub($one)).cons(head.apply(queue));
              }
            });
          ESLVal dropMaxJobs = new ESLVal(new Function(new ESLVal("dropMaxJobs"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal queue = $args[0];
            ESLVal max = $args[1];
            if(max.eql($zero).boolVal)
                  return queue;
                  else
                    if(queue.eql(ESLVal.list()).boolVal)
                      return ESLVal.list();
                      else
                        return dropMaxJobs.apply(tail.apply(queue),max.sub($one));
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v13 = $m;
            
            switch(_v13.termName) {
            case "Process": {ESLVal $51 = _v13.termRef(0);
              
              {ESLVal j = $51;
              
              return process.apply(j,new ESLVal("End",new ESLVal[]{}));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v13)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {queue = forwardCompletedJobs.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v7 = $qualArg;
                  
                  switch(_v7.termName) {
                  case "Active": {ESLVal $16 = _v7.termRef(0);
                    ESLVal $15 = _v7.termRef(1);
                    
                    switch($16.termName) {
                    case "Job": {ESLVal $20 = $16.termRef(0);
                      ESLVal $19 = $16.termRef(1);
                      ESLVal $18 = $16.termRef(2);
                      ESLVal $17 = $16.termRef(3);
                      
                      {ESLVal id = $20;
                      
                      {ESLVal path = $19;
                      
                      {ESLVal min = $18;
                      
                      {ESLVal process = $17;
                      
                      {ESLVal p = $15;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Active",new ESLVal("Job",id,path,min,process.add($one)),p.sub($one))));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v7;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                  default: {ESLVal _0 = _v7;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(getMaxJobs.apply(queue,maxJobs)).flatten().flatten().add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v8 = $qualArg;
                  
                  switch(_v8.termName) {
                  case "Active": {ESLVal $22 = _v8.termRef(0);
                    ESLVal $21 = _v8.termRef(1);
                    
                    switch($22.termName) {
                    case "Job": {ESLVal $26 = $22.termRef(0);
                      ESLVal $25 = $22.termRef(1);
                      ESLVal $24 = $22.termRef(2);
                      ESLVal $23 = $22.termRef(3);
                      
                      {ESLVal id = $26;
                      
                      {ESLVal path = $25;
                      
                      {ESLVal min = $24;
                      
                      {ESLVal process = $23;
                      
                      {ESLVal p = $21;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Active",new ESLVal("Job",id,path,min,process.add($one)),p)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v8;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                  default: {ESLVal _0 = _v8;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(dropMaxJobs.apply(queue,maxJobs)).flatten().flatten()));
            waiting = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v9 = $qualArg;
                  
                  switch(_v9.termName) {
                  case "Job": {ESLVal $30 = _v9.termRef(0);
                    ESLVal $29 = _v9.termRef(1);
                    ESLVal $28 = _v9.termRef(2);
                    ESLVal $27 = _v9.termRef(3);
                    
                    {ESLVal id = $30;
                    
                    {ESLVal path = $29;
                    
                    {ESLVal min = $28;
                    
                    {ESLVal process = $27;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("Job",id,path,min,process.add($one))));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v9;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(waiting).flatten().flatten();}
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
  private static ESLVal alt = new ESLVal(new Function(new ESLVal("alt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal left = $args[0];
  ESLVal right = $args[1];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("alt")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            switch(_v6.termName) {
            case "Process": {ESLVal $14 = _v6.termRef(0);
              
              {ESLVal j = $14;
              
              {Lib.send(left,"Process",j);
            return Lib.send(right,"Process",j);}
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
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
            return $null;
          }
        });
    }
  });
  private static ESLVal sink = new ESLVal(new Function(new ESLVal("sink"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal totalJobs = $args[0];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("sink")) {
          ESLVal jobs = ESLVal.list();
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Process": {ESLVal $13 = _v4.termRef(0);
              
              {ESLVal j = $13;
              
              {jobs = jobs.cons(j);
            if(length.apply(jobs).eql(totalJobs).boolVal)
              {print.apply(new ESLVal("done"));
              {
                ESLVal _v5 = jobs;
                while(_v5.isCons()) {
                  ESLVal job = _v5.headVal;
                  print.apply(job);
                  _v5 = _v5.tailVal;}
              }
              return stopAll.apply();}
              else
                return $null;}
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
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
            return $null;
          }
        });
    }
  });
  private static ESLVal createSupplyChain = new ESLVal(new Function(new ESLVal("createSupplyChain"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal successor = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v3 = c;
        
        switch(_v3.termName) {
        case "Seq": {ESLVal $12 = _v3.termRef(0);
          ESLVal $11 = _v3.termRef(1);
          
          {ESLVal c1 = $12;
          
          {ESLVal c2 = $11;
          
          return createSupplyChain.apply(c1,createSupplyChain.apply(c2,successor,env),env);
        }
        }
        }
      case "Or": {ESLVal $10 = _v3.termRef(0);
          ESLVal $9 = _v3.termRef(1);
          
          {ESLVal c1 = $10;
          
          {ESLVal c2 = $9;
          
          return newActor(alt,new ESLVal(new Actor()),createSupplyChain.apply(c1,successor,env),createSupplyChain.apply(c2,successor,env));
        }
        }
        }
      case "Processor": {ESLVal $8 = _v3.termRef(0);
          ESLVal $7 = _v3.termRef(1);
          ESLVal $6 = _v3.termRef(2);
          ESLVal $5 = _v3.termRef(3);
          
          {ESLVal n = $8;
          
          {ESLVal processingTime = $7;
          
          {ESLVal maxJobs = $6;
          
          {ESLVal failureRate = $5;
          
          return newActor(node,new ESLVal(new Actor()),n,successor,processingTime,maxJobs,failureRate);
        }
        }
        }
        }
        }
      case "Let": {ESLVal $4 = _v3.termRef(0);
          ESLVal $3 = _v3.termRef(1);
          ESLVal $2 = _v3.termRef(2);
          
          {ESLVal n = $4;
          
          {ESLVal c1 = $3;
          
          {ESLVal c2 = $2;
          
          {ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v15 = $args[0];
            return createSupplyChain.apply(c1,_v15,env);
              }
            });
          
          return createSupplyChain.apply(c2,successor,addEntry.apply(n,f,env));
        }
        }
        }
        }
        }
      case "Var": {ESLVal $1 = _v3.termRef(0);
          
          {ESLVal n = $1;
          
          return lookup.apply(n,env).apply(successor);
        }
        }
        default: return error(new ESLVal("case error at Pos(3384,3921)").add(ESLVal.list(_v3)));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
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
            return ((Supplier<ESLVal>)() -> { 
                {ESLVal n = createSupplyChain.apply(chain1,newActor(sink,new ESLVal(new Actor()),new ESLVal(1000)),emptyTable);
                  
                  {{
                  ESLVal _v1 = $zero.to(new ESLVal(1000));
                  while(_v1.isCons()) {
                    ESLVal i = _v1.headVal;
                    Lib.send(n,"Process",new ESLVal("Job",i,new ESLVal("Then",new ESLVal("Name",new ESLVal("A")),new ESLVal("Then",new ESLVal("And",new ESLVal("Name",new ESLVal("B")),new ESLVal("Name",new ESLVal("C"))),new ESLVal("Then",new ESLVal("Name",new ESLVal("D")),new ESLVal("End",new ESLVal[]{})))),$zero,$zero));
                    _v1 = _v1.tailVal;}
                }
                return $null;}
                }
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}