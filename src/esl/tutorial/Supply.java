package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Supply {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal colours = ESLVal.list(new ESLVal("Red",new ESLVal[]{}),new ESLVal("Green",new ESLVal[]{}),new ESLVal("Red",new ESLVal[]{}),new ESLVal("Blue",new ESLVal[]{}),new ESLVal("Blue",new ESLVal[]{}));
  private static ESLVal monitor = new ESLVal(new Function(new ESLVal("monitor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal nodes = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("monitor")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v11 = $m;
            
            switch(_v11.termName) {
            case "Handles": {ESLVal $58 = _v11.termRef(0);
              ESLVal $57 = _v11.termRef(1);
              
              {ESLVal c = $58;
              
              {ESLVal n = $57;
              
              if(isMonitoring.boolVal)
              {{
                ESLVal _v12 = nodes;
                while(_v12.isCons()) {
                  ESLVal node = _v12.headVal;
                  Lib.send(node,"SetProxy",c,n);
                  _v12 = _v12.tailVal;}
              }
              return $null;}
              else
                return $null;
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v11)));
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
  private static ESLVal leaf = new ESLVal(new Function(new ESLVal("leaf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal colour = $args[1];
  ESLVal parent = $args[2];
  ESLVal pTime = $args[3];
  ESLVal qLength = $args[4];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("leaf")) {
          ESLVal getColour() {
    
    return colour;
  }
  ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),null) { public ESLVal apply(ESLVal... args) { return getColour(); }});
  ESLVal getId() {
    
    return id;
  }
  ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),null) { public ESLVal apply(ESLVal... args) { return getId(); }});
  ESLVal process(ESLVal jobs) {
    
    {ESLVal _v14 = jobs;
      
      if(_v14.isCons())
      {ESLVal $59 = _v14.head();
        ESLVal $60 = _v14.tail();
        
        switch($59.termName) {
        case "Job": {ESLVal $65 = $59.termRef(0);
          ESLVal $64 = $59.termRef(1);
          ESLVal $63 = $59.termRef(2);
          ESLVal $62 = $59.termRef(3);
          ESLVal $61 = $59.termRef(4);
          
          {ESLVal _v32 = $65;
          
          {ESLVal current = $64;
          
          {ESLVal shortest = $63;
          
          {ESLVal actual = $62;
          
          {ESLVal pending = $61;
          
          {ESLVal _v33 = $60;
          
          return process(_v33).cons(new ESLVal("Job",_v32,current.sub($one),shortest,actual.add($one),pending));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v14)));
      }
      }
    else if(_v14.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2573,2719)").add(ESLVal.list(_v14)));
    }
  }
  ESLVal process = new ESLVal(new Function(new ESLVal("process"),null) { public ESLVal apply(ESLVal... args) { return process(args[0]); }});
  ESLVal isFinished(ESLVal j) {
    
    return jobCurrentTime(j).lesseql($zero);
  }
  ESLVal isFinished = new ESLVal(new Function(new ESLVal("isFinished"),null) { public ESLVal apply(ESLVal... args) { return isFinished(args[0]); }});
  ESLVal isIncomplete(ESLVal j) {
    
    return isFinished(j).not();
  }
  ESLVal isIncomplete = new ESLVal(new Function(new ESLVal("isIncomplete"),null) { public ESLVal apply(ESLVal... args) { return isIncomplete(args[0]); }});
ESLVal queue = $nil;
          ESLVal proxies = newTable();
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v15 = $m;
            
            switch(_v15.termName) {
            case "Flush": {
              return proxies.ref("clear").apply();
            }
          case "Process": {ESLVal $71 = _v15.termRef(0);
              
              switch($71.termName) {
              case "Job": {ESLVal $76 = $71.termRef(0);
                ESLVal $75 = $71.termRef(1);
                ESLVal $74 = $71.termRef(2);
                ESLVal $73 = $71.termRef(3);
                ESLVal $72 = $71.termRef(4);
                
                if($72.isCons())
                {ESLVal $77 = $72.head();
                  ESLVal $78 = $72.tail();
                  
                  if($77.isCons())
                  {ESLVal $79 = $77.head();
                    ESLVal $80 = $77.tail();
                    
                    {ESLVal jobId = $76;
                    
                    {ESLVal current = $75;
                    
                    {ESLVal shortest = $74;
                    
                    {ESLVal actual = $73;
                    
                    {ESLVal c = $79;
                    
                    {ESLVal cs = $80;
                    
                    {ESLVal pending = $78;
                    
                    if(c.eql(colour).boolVal)
                    {queue = queue.add(ESLVal.list(new ESLVal("Job",jobId,pTime,shortest.add(pTime),actual,pending.cons(cs))));
                    return $null;}
                    else
                      {ESLVal _v34 = $76;
                        
                        {ESLVal _v35 = $75;
                        
                        {ESLVal _v36 = $74;
                        
                        {ESLVal _v37 = $73;
                        
                        {ESLVal _v38 = $79;
                        
                        {ESLVal _v39 = $80;
                        
                        {ESLVal _v40 = $78;
                        
                        if(proxies.ref("hasKey").apply(_v38).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v38),"Process",new ESLVal("Job",_v34,_v35,_v36,_v37,_v40.cons(_v39.cons(_v38))));
                        else
                          {ESLVal j = $71;
                            
                            return Lib.send(parent,"ProcessFailed",jobWaits(j));
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
                else if($77.isNil())
                  {ESLVal j = $71;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits(j));
                  }
                else {ESLVal j = $71;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits(j));
                  }
                }
              else if($72.isNil())
                {ESLVal j = $71;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits(j));
                }
              else {ESLVal j = $71;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits(j));
                }
              }
              default: {ESLVal j = $71;
                
                return Lib.send(parent,"ProcessFailed",jobWaits(j));
              }
            }
            }
          case "ChildCompleted": {ESLVal $70 = _v15.termRef(0);
              ESLVal $69 = _v15.termRef(1);
              ESLVal $68 = _v15.termRef(2);
              
              {ESLVal c = $70;
              
              {ESLVal n = $69;
              
              {ESLVal j = $68;
              
              return $null;
            }
            }
            }
            }
          case "SetProxy": {ESLVal $67 = _v15.termRef(0);
              ESLVal $66 = _v15.termRef(1);
              
              {ESLVal c = $67;
              
              {ESLVal n = $66;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v15)));
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
            {ESLVal processed = process(take(queue,qLength));
              ESLVal unprocessed = drop(queue,qLength);
              
              {ESLVal completed = select(isFinished,processed);
              ESLVal incomplete = select(isIncomplete,processed);
              
              {queue = incomplete.add(new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal j = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(jobWaits(j));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(unprocessed));
            {
              ESLVal _v13 = completed;
              while(_v13.isCons()) {
                ESLVal j = _v13.headVal;
                Lib.send(parent,"ChildCompleted",colour,getSelf(),j);
                _v13 = _v13.tailVal;}
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
          ESLVal getColour() {
    
    return colour;
  }
  ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),null) { public ESLVal apply(ESLVal... args) { return getColour(); }});
  ESLVal getId() {
    
    return id;
  }
  ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),null) { public ESLVal apply(ESLVal... args) { return getId(); }});
  ESLVal process(ESLVal j) {
    
    {ESLVal _v16 = j;
      
      switch(_v16.termName) {
      case "Job": {ESLVal $85 = _v16.termRef(0);
        ESLVal $84 = _v16.termRef(1);
        ESLVal $83 = _v16.termRef(2);
        ESLVal $82 = _v16.termRef(3);
        ESLVal $81 = _v16.termRef(4);
        
        if($81.isCons())
        {ESLVal $86 = $81.head();
          ESLVal $87 = $81.tail();
          
          if($86.isCons())
          {ESLVal $88 = $86.head();
            ESLVal $89 = $86.tail();
            
            {ESLVal _v24 = $85;
            
            {ESLVal n = $84;
            
            {ESLVal t0 = $83;
            
            {ESLVal t1 = $82;
            
            {ESLVal c = $88;
            
            {ESLVal cs = $89;
            
            {ESLVal pending = $87;
            
            return Lib.send(nth.apply(children,random.apply(length.apply(children))),"Process",j);
          }
          }
          }
          }
          }
          }
          }
          }
        else if($86.isNil())
          {ESLVal jid = $85;
            
            {ESLVal n = $84;
            
            {ESLVal shortest = $83;
            
            {ESLVal actual = $82;
            
            {ESLVal pending = $87;
            
            return Lib.send(parent,"ChildCompleted",colour,getSelf(),new ESLVal("Job",jid,n,shortest,actual,pending));
          }
          }
          }
          }
          }
        else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v16)));
        }
      else if($81.isNil())
        return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v16)));
      else return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v16)));
      }
      default: return error(new ESLVal("case error at Pos(4082,4360)").add(ESLVal.list(_v16)));
    }
    }
  }
  ESLVal process = new ESLVal(new Function(new ESLVal("process"),null) { public ESLVal apply(ESLVal... args) { return process(args[0]); }});
ESLVal proxies = newTable();
          ESLVal children = $nil;
          ESLVal m = $null;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v17 = $m;
            
            switch(_v17.termName) {
            case "Flush": {
              {proxies.ref("clear").apply();
            {{
              ESLVal _v18 = children;
              while(_v18.isCons()) {
                ESLVal n = _v18.headVal;
                Lib.send(n,"Flush");
                _v18 = _v18.tailVal;}
            }
            return $null;}}
            }
          case "SetProxy": {ESLVal $105 = _v17.termRef(0);
              ESLVal $104 = _v17.termRef(1);
              
              {ESLVal c = $105;
              
              {ESLVal n = $104;
              
              return proxies.ref("put").apply(c,n);
            }
            }
            }
          case "ChildCompleted": {ESLVal $103 = _v17.termRef(0);
              ESLVal $102 = _v17.termRef(1);
              ESLVal $101 = _v17.termRef(2);
              
              {ESLVal c = $103;
              
              {ESLVal n = $102;
              
              {ESLVal j = $101;
              
              {Lib.send(m,"Handles",c,n);
            return process(j);}
            }
            }
            }
            }
          case "ProcessFailed": {ESLVal $100 = _v17.termRef(0);
              
              {ESLVal j = $100;
              
              return process(j);
            }
            }
          case "Process": {ESLVal $90 = _v17.termRef(0);
              
              switch($90.termName) {
              case "Job": {ESLVal $95 = $90.termRef(0);
                ESLVal $94 = $90.termRef(1);
                ESLVal $93 = $90.termRef(2);
                ESLVal $92 = $90.termRef(3);
                ESLVal $91 = $90.termRef(4);
                
                if($91.isCons())
                {ESLVal $96 = $91.head();
                  ESLVal $97 = $91.tail();
                  
                  if($96.isCons())
                  {ESLVal $98 = $96.head();
                    ESLVal $99 = $96.tail();
                    
                    {ESLVal jobId = $95;
                    
                    {ESLVal current = $94;
                    
                    {ESLVal shortest = $93;
                    
                    {ESLVal actual = $92;
                    
                    {ESLVal c = $98;
                    
                    {ESLVal cs = $99;
                    
                    {ESLVal pending = $97;
                    
                    if(c.eql(colour).boolVal)
                    return process(new ESLVal("Job",jobId,current,shortest,actual,pending.cons(cs).cons(colours)));
                    else
                      {ESLVal _v25 = $95;
                        
                        {ESLVal _v26 = $94;
                        
                        {ESLVal _v27 = $93;
                        
                        {ESLVal _v28 = $92;
                        
                        {ESLVal _v29 = $98;
                        
                        {ESLVal _v30 = $99;
                        
                        {ESLVal _v31 = $97;
                        
                        if(proxies.ref("hasKey").apply(_v29).boolVal)
                        return Lib.send(proxies.ref("get").apply(_v29),"Process",new ESLVal("Job",_v25,_v26,_v27,_v28,_v31.cons(_v30.cons(_v29))));
                        else
                          {ESLVal j = $90;
                            
                            return Lib.send(parent,"ProcessFailed",jobWaits(j));
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
                else if($96.isNil())
                  {ESLVal j = $90;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits(j));
                  }
                else {ESLVal j = $90;
                    
                    return Lib.send(parent,"ProcessFailed",jobWaits(j));
                  }
                }
              else if($91.isNil())
                {ESLVal j = $90;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits(j));
                }
              else {ESLVal j = $90;
                  
                  return Lib.send(parent,"ProcessFailed",jobWaits(j));
                }
              }
              default: {ESLVal j = $90;
                
                return Lib.send(parent,"ProcessFailed",jobWaits(j));
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v17)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                if(depth.eql($zero).boolVal)
                  {children = new SerializableFunction<ESLVal,ESLVal>() {
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
                      $v.add(newActor(leaf,new ESLVal(new Actor()),newId(),c,getSelf(),processing,queue));
                    }
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(colours);
                  {m = newActor(monitor,new ESLVal(new Actor()),children);
                  return $null;}}
                  else
                    {children = new SerializableFunction<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal c = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = $zero.to(maxChildren());
                    while(!$l1.isNil()) {
                      ESLVal numOfChildren = $l1.head();
                      $l1 = $l1.tail();
                      $v.add(newActor(container,new ESLVal(new Actor()),newId(),depth.sub($one),c,getSelf()));
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(colours);
                    {m = newActor(monitor,new ESLVal(new Actor()),children);
                    return $null;}}
              }}.get();
          }
        });
    }
  });
  private static ESLVal isMonitoring = $false;
  private static ESLVal root = new ESLVal(new Function(new ESLVal("root"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal depth = $args[0];
  ESLVal limit = $args[1];
  ESLVal nodes = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("root")) {
          ESLVal getColour() {
    
    return new ESLVal("Red",new ESLVal[]{});
  }
  ESLVal getColour = new ESLVal(new Function(new ESLVal("getColour"),null) { public ESLVal apply(ESLVal... args) { return getColour(); }});
  ESLVal getId() {
    
    return $zero;
  }
  ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),null) { public ESLVal apply(ESLVal... args) { return getId(); }});
ESLVal child = newActor(container,new ESLVal(new Actor()),newId(),depth,new ESLVal("Red",new ESLVal[]{}),getSelf());
          ESLVal jobs = $zero;
          ESLVal runs = new ESLVal(4);
          ESLVal completed = ESLVal.list($nil);
          ESLVal counter = $zero;
          ESLVal pending = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal table = newTable();
                
                {{
                ESLVal _v20 = $zero.to(limit);
                while(_v20.isCons()) {
                  ESLVal i = _v20.headVal;
                  {table.ref("put").apply(i,new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal j = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Job",newId(),$zero,$zero,$zero,ESLVal.list(ESLVal.list(new ESLVal("Red",new ESLVal[]{})))));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($zero.to(random.apply(nodes).add($one))));
                  jobs = jobs.add(length.apply(table.ref("get").apply(i)));}
                  _v20 = _v20.tailVal;}
              }
              return table;}
              }
            }}.get();
          
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
                  return new ESLVal("LineGraph",$nil,new ESLVal("Processing ").add(jobs.add(new ESLVal(" jobs over ").add(runs.add(new ESLVal(" runs in ").add(now().div(new ESLVal(1000)).add(new ESLVal(" seconds"))))))),new ESLVal("Delay/10"),new ESLVal("Number of Jobs Delayed by at Least/10"),new ESLVal(1200),new ESLVal(500),new SerializableFunction<ESLVal,ESLVal>() {
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
                          $v.add(new ESLVal("GLine",$nil,new ESLVal("Run-").add(run.add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                            if(run.less(runs.div(new ESLVal(2))).boolVal)
                              return new ESLVal("(monitored)");
                              else
                                return new ESLVal("");
                          }}.get())),new SerializableFunction<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal delay = $l0.head();
                                $l0 = $l0.tail();
                                if(delay.neql($zero).boolVal) {if(delayedBy(jobs,delay).neql($zero).boolVal) {$v.add(new ESLVal("LPoint",$nil,delay.div(new ESLVal(10)),delayedBy(jobs,delay).div(new ESLVal(10))));
                          }
                          }
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(minDelay(jobs,new ESLVal(9999)).to(maxDelay(jobs,$zero).add($one)))));
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
                  completed = completed.cons($nil);
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
private static ESLVal jobCurrentTime(ESLVal j) {
    
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
  private static ESLVal jobCurrentTime = new ESLVal(new Function(new ESLVal("jobCurrentTime"),null) { public ESLVal apply(ESLVal... args) { return jobCurrentTime(args[0]); }});
  private static ESLVal setJobCurrent(ESLVal j,ESLVal current) {
    
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
  private static ESLVal setJobCurrent = new ESLVal(new Function(new ESLVal("setJobCurrent"),null) { public ESLVal apply(ESLVal... args) { return setJobCurrent(args[0],args[1]); }});
  private static ESLVal setJobShortest(ESLVal j,ESLVal shortest) {
    
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
  private static ESLVal setJobShortest = new ESLVal(new Function(new ESLVal("setJobShortest"),null) { public ESLVal apply(ESLVal... args) { return setJobShortest(args[0],args[1]); }});
  private static ESLVal addJobColours(ESLVal j) {
    
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
  private static ESLVal addJobColours = new ESLVal(new Function(new ESLVal("addJobColours"),null) { public ESLVal apply(ESLVal... args) { return addJobColours(args[0]); }});
  private static ESLVal jobWaits(ESLVal j) {
    
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
  private static ESLVal jobWaits = new ESLVal(new Function(new ESLVal("jobWaits"),null) { public ESLVal apply(ESLVal... args) { return jobWaits(args[0]); }});
  private static ESLVal jobId(ESLVal j) {
    
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
  private static ESLVal jobId = new ESLVal(new Function(new ESLVal("jobId"),null) { public ESLVal apply(ESLVal... args) { return jobId(args[0]); }});
  private static ESLVal jobDelay(ESLVal j) {
    
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
  private static ESLVal jobDelay = new ESLVal(new Function(new ESLVal("jobDelay"),null) { public ESLVal apply(ESLVal... args) { return jobDelay(args[0]); }});
  private static ESLVal newId() {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        {counter = counter.add($one);
        return counter;}
      }}.get();
        }},counter);
  }
  private static ESLVal newId = new ESLVal(new Function(new ESLVal("newId"),null) { public ESLVal apply(ESLVal... args) { return newId(); }});
  private static ESLVal maxChildren() {
    
    return new ESLVal(3);
  }
  private static ESLVal maxChildren = new ESLVal(new Function(new ESLVal("maxChildren"),null) { public ESLVal apply(ESLVal... args) { return maxChildren(); }});
  private static ESLVal minDelay(ESLVal jobs,ESLVal min) {
    
    {ESLVal _v8 = jobs;
      
      if(_v8.isCons())
      {ESLVal $36 = _v8.head();
        ESLVal $37 = _v8.tail();
        
        switch($36.termName) {
        case "Job": {ESLVal $42 = $36.termRef(0);
          ESLVal $41 = $36.termRef(1);
          ESLVal $40 = $36.termRef(2);
          ESLVal $39 = $36.termRef(3);
          ESLVal $38 = $36.termRef(4);
          
          {ESLVal id = $42;
          
          {ESLVal t = $41;
          
          {ESLVal possible = $40;
          
          {ESLVal actual = $39;
          
          {ESLVal cs = $38;
          
          {ESLVal _v47 = $37;
          
          if(actual.sub(possible).less(min).boolVal)
          return minDelay(_v47,actual.sub(possible));
          else
            {ESLVal j = $36;
              
              {ESLVal _v48 = $37;
              
              return minDelay(_v48,min);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal j = $36;
          
          {ESLVal _v49 = $37;
          
          return minDelay(_v49,min);
        }
        }
      }
      }
    else if(_v8.isNil())
      return min;
    else return error(new ESLVal("case error at Pos(5488,5656)").add(ESLVal.list(_v8)));
    }
  }
  private static ESLVal minDelay = new ESLVal(new Function(new ESLVal("minDelay"),null) { public ESLVal apply(ESLVal... args) { return minDelay(args[0],args[1]); }});
  private static ESLVal maxDelay(ESLVal jobs,ESLVal max) {
    
    {ESLVal _v9 = jobs;
      
      if(_v9.isCons())
      {ESLVal $43 = _v9.head();
        ESLVal $44 = _v9.tail();
        
        switch($43.termName) {
        case "Job": {ESLVal $49 = $43.termRef(0);
          ESLVal $48 = $43.termRef(1);
          ESLVal $47 = $43.termRef(2);
          ESLVal $46 = $43.termRef(3);
          ESLVal $45 = $43.termRef(4);
          
          {ESLVal id = $49;
          
          {ESLVal t = $48;
          
          {ESLVal possible = $47;
          
          {ESLVal actual = $46;
          
          {ESLVal cs = $45;
          
          {ESLVal _v44 = $44;
          
          if(actual.sub(possible).gre(max).boolVal)
          return maxDelay(_v44,actual.sub(possible));
          else
            {ESLVal j = $43;
              
              {ESLVal _v45 = $44;
              
              return maxDelay(_v45,max);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal j = $43;
          
          {ESLVal _v46 = $44;
          
          return maxDelay(_v46,max);
        }
        }
      }
      }
    else if(_v9.isNil())
      return max;
    else return error(new ESLVal("case error at Pos(5697,5865)").add(ESLVal.list(_v9)));
    }
  }
  private static ESLVal maxDelay = new ESLVal(new Function(new ESLVal("maxDelay"),null) { public ESLVal apply(ESLVal... args) { return maxDelay(args[0],args[1]); }});
  private static ESLVal delayedBy(ESLVal jobs,ESLVal delay) {
    
    {ESLVal _v10 = jobs;
      
      if(_v10.isCons())
      {ESLVal $50 = _v10.head();
        ESLVal $51 = _v10.tail();
        
        switch($50.termName) {
        case "Job": {ESLVal $56 = $50.termRef(0);
          ESLVal $55 = $50.termRef(1);
          ESLVal $54 = $50.termRef(2);
          ESLVal $53 = $50.termRef(3);
          ESLVal $52 = $50.termRef(4);
          
          {ESLVal id = $56;
          
          {ESLVal t = $55;
          
          {ESLVal possible = $54;
          
          {ESLVal actual = $53;
          
          {ESLVal cs = $52;
          
          {ESLVal _v41 = $51;
          
          if(actual.sub(possible).greql(delay).boolVal)
          return $one.add(delayedBy(_v41,delay));
          else
            {ESLVal j = $50;
              
              {ESLVal _v42 = $51;
              
              return delayedBy(_v42,delay);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal j = $50;
          
          {ESLVal _v43 = $51;
          
          return delayedBy(_v43,delay);
        }
        }
      }
      }
    else if(_v10.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(5909,6076)").add(ESLVal.list(_v10)));
    }
  }
  private static ESLVal delayedBy = new ESLVal(new Function(new ESLVal("delayedBy"),null) { public ESLVal apply(ESLVal... args) { return delayedBy(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}
