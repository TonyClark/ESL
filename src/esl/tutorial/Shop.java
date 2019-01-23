package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Shop {
  public static ESLVal getSelf() { return $null; }
  // static ESLVal edb = null;
  private static ESLVal displayB = new ESLVal(new Function(new ESLVal("displayB"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("displayB")) {
          ESLVal asTable() {
    
    { LetRec letrec = new LetRec() {
      ESLVal rows = new ESLVal(new Function(new ESLVal("rows"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal cs = $args[0];
        {ESLVal _v343 = cs;
              
              if(_v343.isCons())
              {ESLVal $366 = _v343.head();
                ESLVal $367 = _v343.tail();
                
                switch($366.termName) {
                case "C": {ESLVal $372 = $366.termRef(0);
                  ESLVal $371 = $366.termRef(1);
                  ESLVal $370 = $366.termRef(2);
                  ESLVal $369 = $366.termRef(3);
                  ESLVal $368 = $366.termRef(4);
                  
                  {ESLVal c = $372;
                  
                  {ESLVal s = $371;
                  
                  {ESLVal ss = $370;
                  
                  {ESLVal sales = $369;
                  
                  {ESLVal walkouts = $368;
                  
                  {ESLVal rest = $367;
                  
                  return ESLVal.list(row(ESLVal.list(bdata(new ESLVal("HTML",new ESLVal("Customer-").add(c)))).add(states.apply(s,ss).add(ESLVal.list(tdata(new ESLVal("HTML",new ESLVal("Sales = ").add(sales))),tdata(new ESLVal("HTML",new ESLVal("Walkouts = ").add(walkouts)))))))).add(rows.apply(rest));
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(1697,2061)").add(ESLVal.list(_v343)));
              }
              }
            else if(_v343.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(1697,2061)").add(ESLVal.list(_v343)));
            }
          }
        });
      ESLVal states = new ESLVal(new Function(new ESLVal("states"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal current = $args[0];
        ESLVal allStates = $args[1];
        {ESLVal _v344 = allStates;
              
              if(_v344.isCons())
              {ESLVal $373 = _v344.head();
                ESLVal $374 = _v344.tail();
                
                {ESLVal state = $373;
                
                {ESLVal ss = $374;
                
                if(state.eql(current).boolVal)
                return ESLVal.list(rdata(new ESLVal("HTML",state.add(new ESLVal(""))))).add(states.apply(current,ss));
                else
                  {ESLVal _v401 = $373;
                    
                    {ESLVal _v402 = $374;
                    
                    return ESLVal.list(tdata(new ESLVal("HTML",_v401.add(new ESLVal(""))))).add(states.apply(current,_v402));
                  }
                  }
              }
              }
              }
            else if(_v344.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(2131,2334)").add(ESLVal.list(_v344)));
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "rows": return rows;
          
          case "states": return states;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal rows = letrec.get("rows");
    
    ESLVal states = letrec.get("states");
    
      return new ESLVal("Table",$nil,ESLVal.list(row(ESLVal.list(tdata(new ESLVal("Table",$nil,rows.apply(take(customers,length.apply(customers).div(new ESLVal(2)))))),tdata(new ESLVal("Table",$nil,rows.apply(drop(customers,length.apply(customers).div(new ESLVal(2))))))))).add(ESLVal.list(row(ESLVal.list(tdata(new ESLVal("HTML",new ESLVal("time = ").add(now()))),tdata(new ESLVal("HTML",new ESLVal("time = ").add(now()))))))));}
    
  }
  ESLVal asTable = new ESLVal(new Function(new ESLVal("asTable"),null) { public ESLVal apply(ESLVal... args) { return asTable(); }});
  ESLVal changeState(ESLVal c,ESLVal s,ESLVal cs) {
    
    {ESLVal _v345 = cs;
      
      if(_v345.isCons())
      {ESLVal $375 = _v345.head();
        ESLVal $376 = _v345.tail();
        
        switch($375.termName) {
        case "C": {ESLVal $381 = $375.termRef(0);
          ESLVal $380 = $375.termRef(1);
          ESLVal $379 = $375.termRef(2);
          ESLVal $378 = $375.termRef(3);
          ESLVal $377 = $375.termRef(4);
          
          {ESLVal c1 = $381;
          
          {ESLVal s1 = $380;
          
          {ESLVal ss = $379;
          
          {ESLVal sales = $378;
          
          {ESLVal walkouts = $377;
          
          {ESLVal rest = $376;
          
          if(c1.eql(c).boolVal)
          return rest.cons(new ESLVal("C",c,s,ss,sales,walkouts));
          else
            {ESLVal _v403 = $375;
              
              {ESLVal _v404 = $376;
              
              return changeState(c,s,_v404).cons(_v403);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal c1 = $375;
          
          {ESLVal rest = $376;
          
          return changeState(c,s,rest).cons(c1);
        }
        }
      }
      }
    else if(_v345.isNil())
      return cs;
    else return error(new ESLVal("case error at Pos(2755,3000)").add(ESLVal.list(_v345)));
    }
  }
  ESLVal changeState = new ESLVal(new Function(new ESLVal("changeState"),null) { public ESLVal apply(ESLVal... args) { return changeState(args[0],args[1],args[2]); }});
  ESLVal getSales(ESLVal cs) {
    
    {ESLVal _v346 = cs;
      
      if(_v346.isCons())
      {ESLVal $382 = _v346.head();
        ESLVal $383 = _v346.tail();
        
        switch($382.termName) {
        case "C": {ESLVal $388 = $382.termRef(0);
          ESLVal $387 = $382.termRef(1);
          ESLVal $386 = $382.termRef(2);
          ESLVal $385 = $382.termRef(3);
          ESLVal $384 = $382.termRef(4);
          
          {ESLVal c1 = $388;
          
          {ESLVal s1 = $387;
          
          {ESLVal ss = $386;
          
          {ESLVal sales = $385;
          
          {ESLVal walkouts = $384;
          
          {ESLVal rest = $383;
          
          return sales.add(getSales(rest));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3046,3187)").add(ESLVal.list(_v346)));
      }
      }
    else if(_v346.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(3046,3187)").add(ESLVal.list(_v346)));
    }
  }
  ESLVal getSales = new ESLVal(new Function(new ESLVal("getSales"),null) { public ESLVal apply(ESLVal... args) { return getSales(args[0]); }});
  ESLVal getWalkouts(ESLVal cs) {
    
    {ESLVal _v347 = cs;
      
      if(_v347.isCons())
      {ESLVal $389 = _v347.head();
        ESLVal $390 = _v347.tail();
        
        switch($389.termName) {
        case "C": {ESLVal $395 = $389.termRef(0);
          ESLVal $394 = $389.termRef(1);
          ESLVal $393 = $389.termRef(2);
          ESLVal $392 = $389.termRef(3);
          ESLVal $391 = $389.termRef(4);
          
          {ESLVal c1 = $395;
          
          {ESLVal s1 = $394;
          
          {ESLVal ss = $393;
          
          {ESLVal sales = $392;
          
          {ESLVal walkouts = $391;
          
          {ESLVal rest = $390;
          
          return walkouts.add(getWalkouts(rest));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3236,3383)").add(ESLVal.list(_v347)));
      }
      }
    else if(_v347.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(3236,3383)").add(ESLVal.list(_v347)));
    }
  }
  ESLVal getWalkouts = new ESLVal(new Function(new ESLVal("getWalkouts"),null) { public ESLVal apply(ESLVal... args) { return getWalkouts(args[0]); }});
  ESLVal getEvents(ESLVal cs) {
    
    {ESLVal _v348 = cs;
      
      if(_v348.isCons())
      {ESLVal $396 = _v348.head();
        ESLVal $397 = _v348.tail();
        
        switch($396.termName) {
        case "C": {ESLVal $402 = $396.termRef(0);
          ESLVal $401 = $396.termRef(1);
          ESLVal $400 = $396.termRef(2);
          ESLVal $399 = $396.termRef(3);
          ESLVal $398 = $396.termRef(4);
          
          {ESLVal c1 = $402;
          
          {ESLVal s1 = $401;
          
          {ESLVal ss = $400;
          
          {ESLVal sales = $399;
          
          {ESLVal walkouts = $398;
          
          {ESLVal rest = $397;
          
          return walkouts.add(sales.add(getEvents(rest)));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3430,3583)").add(ESLVal.list(_v348)));
      }
      }
    else if(_v348.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(3430,3583)").add(ESLVal.list(_v348)));
    }
  }
  ESLVal getEvents = new ESLVal(new Function(new ESLVal("getEvents"),null) { public ESLVal apply(ESLVal... args) { return getEvents(args[0]); }});
  ESLVal sale(ESLVal _v405,ESLVal _v406) {
    
    {ESLVal _v349 = _v406;
      
      if(_v349.isCons())
      {ESLVal $403 = _v349.head();
        ESLVal $404 = _v349.tail();
        
        switch($403.termName) {
        case "C": {ESLVal $409 = $403.termRef(0);
          ESLVal $408 = $403.termRef(1);
          ESLVal $407 = $403.termRef(2);
          ESLVal $406 = $403.termRef(3);
          ESLVal $405 = $403.termRef(4);
          
          {ESLVal c1 = $409;
          
          {ESLVal s1 = $408;
          
          {ESLVal ss = $407;
          
          {ESLVal sales = $406;
          
          {ESLVal walkouts = $405;
          
          {ESLVal rest = $404;
          
          if(c1.eql(_v405).boolVal)
          return rest.cons(new ESLVal("C",c1,s1,ss,sales.add($one),walkouts));
          else
            {ESLVal _v407 = $403;
              
              {ESLVal _v408 = $404;
              
              return sale(_v405,_v408).cons(_v407);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal c1 = $403;
          
          {ESLVal rest = $404;
          
          return sale(_v405,rest).cons(c1);
        }
        }
      }
      }
    else if(_v349.isNil())
      return _v406;
    else return error(new ESLVal("case error at Pos(3660,3929)").add(ESLVal.list(_v349)));
    }
  }
  ESLVal sale = new ESLVal(new Function(new ESLVal("sale"),null) { public ESLVal apply(ESLVal... args) { return sale(args[0],args[1]); }});
  ESLVal timeout(ESLVal _v409,ESLVal _v410) {
    
    {ESLVal _v350 = _v410;
      
      if(_v350.isCons())
      {ESLVal $410 = _v350.head();
        ESLVal $411 = _v350.tail();
        
        switch($410.termName) {
        case "C": {ESLVal $416 = $410.termRef(0);
          ESLVal $415 = $410.termRef(1);
          ESLVal $414 = $410.termRef(2);
          ESLVal $413 = $410.termRef(3);
          ESLVal $412 = $410.termRef(4);
          
          {ESLVal c1 = $416;
          
          {ESLVal s1 = $415;
          
          {ESLVal ss = $414;
          
          {ESLVal sales = $413;
          
          {ESLVal walkouts = $412;
          
          {ESLVal rest = $411;
          
          if(c1.eql(_v409).boolVal)
          return rest.cons(new ESLVal("C",c1,s1,ss,sales,walkouts.add($one)));
          else
            {ESLVal _v411 = $410;
              
              {ESLVal _v412 = $411;
              
              return timeout(_v409,_v412).cons(_v411);
            }
            }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal c1 = $410;
          
          {ESLVal rest = $411;
          
          return timeout(_v409,rest).cons(c1);
        }
        }
      }
      }
    else if(_v350.isNil())
      return _v410;
    else return error(new ESLVal("case error at Pos(4009,4280)").add(ESLVal.list(_v350)));
    }
  }
  ESLVal timeout = new ESLVal(new Function(new ESLVal("timeout"),null) { public ESLVal apply(ESLVal... args) { return timeout(args[0],args[1]); }});
ESLVal customers = $nil;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v351 = $m;
            
            switch(_v351.termName) {
            case "ChangeState": {ESLVal $423 = _v351.termRef(0);
              ESLVal $422 = _v351.termRef(1);
              
              {ESLVal c = $423;
              
              {ESLVal s = $422;
              
              {customers = changeState(c,s,customers);
            {ESLVal[] events = new ESLVal[]{getEvents(customers)};
              
              {ESLVal sales = getSales(customers);
              ESLVal walkouts = getWalkouts(customers);
              
              {if(events[0].eql($zero).boolVal)
              events[0] = $one;
              else
                {}
            return Lib.send(edb,"Show",new ESLVal("customers"),new ESLVal("Table",$nil,ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",$nil,asTable()))))));}
            }
            }}
            }
            }
            }
          case "Sale": {ESLVal $421 = _v351.termRef(0);
              
              {ESLVal c = $421;
              
              {customers = sale(c,customers);
            return $null;}
            }
            }
          case "TimeOut": {ESLVal $420 = _v351.termRef(0);
              
              {ESLVal c = $420;
              
              {customers = timeout(c,customers);
            return $null;}
            }
            }
          case "RegisterCustomer": {ESLVal $419 = _v351.termRef(0);
              ESLVal $418 = _v351.termRef(1);
              ESLVal $417 = _v351.termRef(2);
              
              {ESLVal c = $419;
              
              {ESLVal state = $418;
              
              {ESLVal states = $417;
              
              {customers = customers.add(ESLVal.list(new ESLVal("C",c,state,states,$zero,$zero)));
            return Lib.send(edb,"Show",new ESLVal("customers"),asTable());}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v351)));
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
  private static ESLVal display = newActor(displayB,new ESLVal(new Actor()));
  private static ESLVal assistant = new ESLVal(new Function(new ESLVal("assistant"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("assistant")) {
          
ESLVal state = new ESLVal("OnFloor",new ESLVal[]{});
          ESLVal hasNoticed = new ESLVal(75);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v352 = $m;
            
            switch(_v352.termName) {
            case "CompletedHelp": {
              {state = new ESLVal("OnFloor",new ESLVal[]{});
            return $null;}
            }
          case "CompletedTill": {
              {state = new ESLVal("OnFloor",new ESLVal[]{});
            return $null;}
            }
          case "CustomerNeedsHelp": {
              if(state.eql(new ESLVal("OnFloor",new ESLVal[]{})).boolVal)
              return probably(hasNoticed,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    {Lib.send(hMonitor,"Available",getSelf());
                    {state = new ESLVal("Busy",new ESLVal[]{});
                    return $null;}}
                  }
                }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return $null;
                  }
                }));
              else
                return $null;
            }
          case "CustomerAtTill": {
              if(state.eql(new ESLVal("OnFloor",new ESLVal[]{})).boolVal)
              return probably(hasNoticed,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    {Lib.send(tMonitor,"Serve",getSelf());
                    {state = new ESLVal("Busy",new ESLVal[]{});
                    return $null;}}
                  }
                }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return $null;
                  }
                }));
              else
                return $null;
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v352)));
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
  private static ESLVal helpMonitor = new ESLVal(new Function(new ESLVal("helpMonitor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("helpMonitor")) {
          ESLVal assistantWaitingToHelp(ESLVal h) {
    
    {ESLVal _v353 = h;
      
      if(_v353.isCons())
      {ESLVal $424 = _v353.head();
        ESLVal $425 = _v353.tail();
        
        switch($424.termName) {
        case "WaitingToHelp": {ESLVal $427 = $424.termRef(0);
          ESLVal $426 = $424.termRef(1);
          
          {ESLVal a = $427;
          
          {ESLVal n = $426;
          
          {ESLVal _v389 = $425;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal x = $424;
          
          {ESLVal _v390 = $425;
          
          return assistantWaitingToHelp(_v390);
        }
        }
      }
      }
    else if(_v353.isNil())
      return $false;
    else return error(new ESLVal("case error at Pos(6277,6430)").add(ESLVal.list(_v353)));
    }
  }
  ESLVal assistantWaitingToHelp = new ESLVal(new Function(new ESLVal("assistantWaitingToHelp"),null) { public ESLVal apply(ESLVal... args) { return assistantWaitingToHelp(args[0]); }});
  ESLVal startHelp(ESLVal c,ESLVal n,ESLVal h) {
    
    {ESLVal _v354 = h;
      
      if(_v354.isCons())
      {ESLVal $428 = _v354.head();
        ESLVal $429 = _v354.tail();
        
        switch($428.termName) {
        case "WaitingToHelp": {ESLVal $431 = $428.termRef(0);
          ESLVal $430 = $428.termRef(1);
          
          {ESLVal a = $431;
          
          {ESLVal m = $430;
          
          {ESLVal _v391 = $429;
          
          {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
        return process(_v391).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
        }
        }
        }
        }
        default: {ESLVal x = $428;
          
          {ESLVal _v392 = $429;
          
          return startHelp(c,n,_v392).cons(x);
        }
        }
      }
      }
    else if(_v354.isNil())
      return ESLVal.list(new ESLVal("WaitingForHelp",c,n.sub($one)));
    else return error(new ESLVal("case error at Pos(6487,6816)").add(ESLVal.list(_v354)));
    }
  }
  ESLVal startHelp = new ESLVal(new Function(new ESLVal("startHelp"),null) { public ESLVal apply(ESLVal... args) { return startHelp(args[0],args[1],args[2]); }});
  ESLVal tryToHelp(ESLVal a,ESLVal n,ESLVal h) {
    
    {ESLVal _v355 = h;
      
      if(_v355.isCons())
      {ESLVal $432 = _v355.head();
        ESLVal $433 = _v355.tail();
        
        switch($432.termName) {
        case "WaitingForHelp": {ESLVal $435 = $432.termRef(0);
          ESLVal $434 = $432.termRef(1);
          
          {ESLVal c = $435;
          
          {ESLVal m = $434;
          
          {ESLVal _v393 = $433;
          
          {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
        return process(_v393).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
        }
        }
        }
        }
        default: {ESLVal x = $432;
          
          {ESLVal _v394 = $433;
          
          return tryToHelp(a,n,_v394).cons(x);
        }
        }
      }
      }
    else if(_v355.isNil())
      return ESLVal.list(new ESLVal("WaitingToHelp",a,n.sub($one)));
    else return error(new ESLVal("case error at Pos(6874,7202)").add(ESLVal.list(_v355)));
    }
  }
  ESLVal tryToHelp = new ESLVal(new Function(new ESLVal("tryToHelp"),null) { public ESLVal apply(ESLVal... args) { return tryToHelp(args[0],args[1],args[2]); }});
  ESLVal process(ESLVal s) {
    
    {ESLVal _v356 = s;
      
      if(_v356.isCons())
      {ESLVal $436 = _v356.head();
        ESLVal $437 = _v356.tail();
        
        switch($436.termName) {
        case "Helping": {ESLVal $444 = $436.termRef(0);
          ESLVal $443 = $436.termRef(1);
          ESLVal $442 = $436.termRef(2);
          
          switch($442.intVal) {
          case 0: {ESLVal a = $444;
            
            {ESLVal c = $443;
            
            {ESLVal _v399 = $437;
            
            {Lib.send(a,"CompletedHelp");
          Lib.send(c,"Helped");
          return process(_v399);}
          }
          }
          }
          default: {ESLVal a = $444;
            
            {ESLVal c = $443;
            
            {ESLVal n = $442;
            
            {ESLVal _v400 = $437;
            
            return process(_v400).cons(new ESLVal("Helping",a,c,n.sub($one)));
          }
          }
          }
          }
        }
        }
      case "WaitingForHelp": {ESLVal $441 = $436.termRef(0);
          ESLVal $440 = $436.termRef(1);
          
          switch($440.intVal) {
          case 0: {ESLVal c = $441;
            
            {ESLVal _v397 = $437;
            
            {Lib.send(c,"TimeOut");
          return process(_v397);}
          }
          }
          default: {ESLVal c = $441;
            
            {ESLVal n = $440;
            
            {ESLVal _v398 = $437;
            
            return startHelp(c,n,_v398);
          }
          }
          }
        }
        }
      case "WaitingToHelp": {ESLVal $439 = $436.termRef(0);
          ESLVal $438 = $436.termRef(1);
          
          switch($438.intVal) {
          case 0: {ESLVal a = $439;
            
            {ESLVal _v395 = $437;
            
            {Lib.send(a,"CompletedHelp");
          return process(_v395);}
          }
          }
          default: {ESLVal a = $439;
            
            {ESLVal n = $438;
            
            {ESLVal _v396 = $437;
            
            return tryToHelp(a,n,_v396);
          }
          }
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(7238,7988)").add(ESLVal.list(_v356)));
      }
      }
    else if(_v356.isNil())
      return s;
    else return error(new ESLVal("case error at Pos(7238,7988)").add(ESLVal.list(_v356)));
    }
  }
  ESLVal process = new ESLVal(new Function(new ESLVal("process"),null) { public ESLVal apply(ESLVal... args) { return process(args[0]); }});
ESLVal state = $nil;
          ESLVal maxHelpTime = new ESLVal(50);
          ESLVal maxWaitTime = new ESLVal(30);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v357 = $m;
            
            switch(_v357.termName) {
            case "NeedsHelp": {ESLVal $446 = _v357.termRef(0);
              
              {ESLVal c = $446;
              
              if(assistantWaitingToHelp(state).boolVal)
              {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
              return $null;}
              else
                {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
                {{
                  ESLVal _v358 = assistants;
                  while(_v358.isCons()) {
                    ESLVal a = _v358.headVal;
                    Lib.send(a,"CustomerNeedsHelp");
                    _v358 = _v358.tailVal;}
                }
                return $null;}}
            }
            }
          case "Available": {ESLVal $445 = _v357.termRef(0);
              
              {ESLVal a = $445;
              
              {state = state.cons(new ESLVal("WaitingToHelp",a,maxWaitTime));
            return $null;}
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v357)));
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
            state = process(state);
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
  private static ESLVal tillMonitor = new ESLVal(new Function(new ESLVal("tillMonitor"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("tillMonitor")) {
          ESLVal findBusyTill(ESLVal s) {
    
    {ESLVal _v359 = s;
      
      if(_v359.isCons())
      {ESLVal $447 = _v359.head();
        ESLVal $448 = _v359.tail();
        
        switch($447.termName) {
        case "TillQueue": {ESLVal $451 = $447.termRef(0);
          ESLVal $450 = $447.termRef(1);
          ESLVal $449 = $447.termRef(2);
          
          {ESLVal c = $451;
          
          {ESLVal till = $450;
          
          {ESLVal n = $449;
          
          {ESLVal _v373 = $448;
          
          return till;
        }
        }
        }
        }
        }
        default: {ESLVal x = $447;
          
          {ESLVal _v374 = $448;
          
          return findBusyTill(_v374);
        }
        }
      }
      }
    else if(_v359.isNil())
      return $zero.sub($one);
    else return error(new ESLVal("case error at Pos(8633,8783)").add(ESLVal.list(_v359)));
    }
  }
  ESLVal findBusyTill = new ESLVal(new Function(new ESLVal("findBusyTill"),null) { public ESLVal apply(ESLVal... args) { return findBusyTill(args[0]); }});
  ESLVal findServicedTill(ESLVal s) {
    
    {ESLVal _v360 = s;
      
      if(_v360.isCons())
      {ESLVal $452 = _v360.head();
        ESLVal $453 = _v360.tail();
        
        switch($452.termName) {
        case "TillReady": {ESLVal $456 = $452.termRef(0);
          ESLVal $455 = $452.termRef(1);
          ESLVal $454 = $452.termRef(2);
          
          {ESLVal a = $456;
          
          {ESLVal till = $455;
          
          {ESLVal n = $454;
          
          {ESLVal _v375 = $453;
          
          return till;
        }
        }
        }
        }
        }
        default: {ESLVal x = $452;
          
          {ESLVal _v376 = $453;
          
          return findServicedTill(_v376);
        }
        }
      }
      }
    else if(_v360.isNil())
      return $zero.sub($one);
    else return error(new ESLVal("case error at Pos(8827,8982)").add(ESLVal.list(_v360)));
    }
  }
  ESLVal findServicedTill = new ESLVal(new Function(new ESLVal("findServicedTill"),null) { public ESLVal apply(ESLVal... args) { return findServicedTill(args[0]); }});
  ESLVal startServe(ESLVal c,ESLVal till,ESLVal n,ESLVal h) {
    
    {ESLVal _v361 = h;
      
      if(_v361.isCons())
      {ESLVal $457 = _v361.head();
        ESLVal $458 = _v361.tail();
        
        switch($457.termName) {
        case "TillReady": {ESLVal $461 = $457.termRef(0);
          ESLVal $460 = $457.termRef(1);
          ESLVal $459 = $457.termRef(2);
          
          {ESLVal a = $461;
          
          {ESLVal atill = $460;
          
          {ESLVal m = $459;
          
          {ESLVal _v377 = $458;
          
          if(atill.eql(till).boolVal)
          {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
          return process(_v377).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
          else
            {ESLVal x = $457;
              
              {ESLVal _v378 = $458;
              
              return startServe(c,till,n,_v378).cons(x);
            }
            }
        }
        }
        }
        }
        }
        default: {ESLVal x = $457;
          
          {ESLVal _v379 = $458;
          
          return startServe(c,till,n,_v379).cons(x);
        }
        }
      }
      }
    else if(_v361.isNil())
      return ESLVal.list(new ESLVal("TillQueue",c,till,n.sub($one)));
    else return error(new ESLVal("case error at Pos(9052,9443)").add(ESLVal.list(_v361)));
    }
  }
  ESLVal startServe = new ESLVal(new Function(new ESLVal("startServe"),null) { public ESLVal apply(ESLVal... args) { return startServe(args[0],args[1],args[2],args[3]); }});
  ESLVal tryToServe(ESLVal a,ESLVal till,ESLVal n,ESLVal h) {
    
    {ESLVal _v362 = h;
      
      if(_v362.isCons())
      {ESLVal $462 = _v362.head();
        ESLVal $463 = _v362.tail();
        
        switch($462.termName) {
        case "TillQueue": {ESLVal $466 = $462.termRef(0);
          ESLVal $465 = $462.termRef(1);
          ESLVal $464 = $462.termRef(2);
          
          {ESLVal c = $466;
          
          {ESLVal atill = $465;
          
          {ESLVal m = $464;
          
          {ESLVal _v380 = $463;
          
          if(till.eql(atill).boolVal)
          {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
          return process(_v380).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
          else
            {ESLVal x = $462;
              
              {ESLVal _v381 = $463;
              
              return tryToServe(a,till,n,_v381).cons(x);
            }
            }
        }
        }
        }
        }
        }
        default: {ESLVal x = $462;
          
          {ESLVal _v382 = $463;
          
          return tryToServe(a,till,n,_v382).cons(x);
        }
        }
      }
      }
    else if(_v362.isNil())
      return ESLVal.list(new ESLVal("TillReady",a,till,n.sub($one)));
    else return error(new ESLVal("case error at Pos(9514,9885)").add(ESLVal.list(_v362)));
    }
  }
  ESLVal tryToServe = new ESLVal(new Function(new ESLVal("tryToServe"),null) { public ESLVal apply(ESLVal... args) { return tryToServe(args[0],args[1],args[2],args[3]); }});
  ESLVal process(ESLVal s) {
    
    {ESLVal _v363 = s;
      
      if(_v363.isCons())
      {ESLVal $467 = _v363.head();
        ESLVal $468 = _v363.tail();
        
        switch($467.termName) {
        case "TillService": {ESLVal $478 = $467.termRef(0);
          ESLVal $477 = $467.termRef(1);
          ESLVal $476 = $467.termRef(2);
          ESLVal $475 = $467.termRef(3);
          
          switch($475.intVal) {
          case 0: {ESLVal a = $478;
            
            {ESLVal c = $477;
            
            {ESLVal till = $476;
            
            {ESLVal _v387 = $468;
            
            {Lib.send(display,"Sale",c.ref("getId").apply());
          Lib.send(c,"Leave");
          Lib.send(getSelf(),"Serve",a);
          return process(_v387);}
          }
          }
          }
          }
          default: {ESLVal a = $478;
            
            {ESLVal c = $477;
            
            {ESLVal till = $476;
            
            {ESLVal n = $475;
            
            {ESLVal _v388 = $468;
            
            return process(_v388).cons(new ESLVal("TillService",a,c,till,n.sub($one)));
          }
          }
          }
          }
          }
        }
        }
      case "TillQueue": {ESLVal $474 = $467.termRef(0);
          ESLVal $473 = $467.termRef(1);
          ESLVal $472 = $467.termRef(2);
          
          switch($472.intVal) {
          case 0: {ESLVal c = $474;
            
            {ESLVal till = $473;
            
            {ESLVal _v385 = $468;
            
            {Lib.send(c,"TimeOut");
          return process(_v385);}
          }
          }
          }
          default: {ESLVal c = $474;
            
            {ESLVal till = $473;
            
            {ESLVal n = $472;
            
            {ESLVal _v386 = $468;
            
            return startServe(c,till,n,_v386);
          }
          }
          }
          }
        }
        }
      case "TillReady": {ESLVal $471 = $467.termRef(0);
          ESLVal $470 = $467.termRef(1);
          ESLVal $469 = $467.termRef(2);
          
          switch($469.intVal) {
          case 0: {ESLVal a = $471;
            
            {ESLVal till = $470;
            
            {ESLVal _v383 = $468;
            
            {Lib.send(a,"CompletedTill");
          return process(_v383);}
          }
          }
          }
          default: {ESLVal a = $471;
            
            {ESLVal till = $470;
            
            {ESLVal n = $469;
            
            {ESLVal _v384 = $468;
            
            return tryToServe(a,till,n,_v384);
          }
          }
          }
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(9924,10852)").add(ESLVal.list(_v363)));
      }
      }
    else if(_v363.isNil())
      return s;
    else return error(new ESLVal("case error at Pos(9924,10852)").add(ESLVal.list(_v363)));
    }
  }
  ESLVal process = new ESLVal(new Function(new ESLVal("process"),null) { public ESLVal apply(ESLVal... args) { return process(args[0]); }});
ESLVal state = $nil;
          ESLVal maxServeTime = new ESLVal(2);
          ESLVal maxWaitTime = new ESLVal(100);
          ESLVal maxIdleTime = new ESLVal(200);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v364 = $m;
            
            switch(_v364.termName) {
            case "Queue": {ESLVal $480 = _v364.termRef(0);
              
              {ESLVal c = $480;
              
              {ESLVal till = findServicedTill(state);
              
              if(till.less($zero).boolVal)
              {state = state.cons(new ESLVal("TillQueue",c,random.apply(numOfTills),maxWaitTime));
              {{
                ESLVal _v365 = assistants;
                while(_v365.isCons()) {
                  ESLVal a = _v365.headVal;
                  Lib.send(a,"CustomerAtTill");
                  _v365 = _v365.tailVal;}
              }
              return $null;}}
              else
                {state = state.cons(new ESLVal("TillQueue",c,till,maxWaitTime));
                return $null;}
            }
            }
            }
          case "Serve": {ESLVal $479 = _v364.termRef(0);
              
              {ESLVal a = $479;
              
              {ESLVal till = findBusyTill(state);
              
              if(till.less($zero).boolVal)
              return Lib.send(a,"CompletedTill");
              else
                {state = state.cons(new ESLVal("TillReady",a,till,maxIdleTime));
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v364)));
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
            state = process(state);
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
  private static ESLVal numOfCustomers = new ESLVal(40);
  private static ESLVal numOfAssistants = new ESLVal(10);
  private static ESLVal numOfTills = new ESLVal(5);
  private static ESLVal numOfSteps = new ESLVal(10000);
  private static ESLVal customers = $nil;
  private static ESLVal assistants = $nil;
  private static ESLVal hMonitor = newActor(helpMonitor,new ESLVal(new Actor()));
  private static ESLVal tMonitor = newActor(tillMonitor,new ESLVal(new Actor()));
  private static ESLVal customer = new ESLVal(new Function(new ESLVal("customer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("customer")) {
          ESLVal getId() {
    
    return id;
  }
  ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),null) { public ESLVal apply(ESLVal... args) { return getId(); }});
ESLVal state = new ESLVal("NotInShop",new ESLVal[]{});
          ESLVal probOfEnteringShop = new ESLVal(30);
          ESLVal probOfBuying = new ESLVal(80);
          ESLVal probOfSeekingHelp = new ESLVal(20);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v366 = $m;
            
            switch(_v366.termName) {
            case "TimeOut": {
              {Lib.send(display,"TimeOut",id);
            Lib.send(display,"ChangeState",id,new ESLVal("NotInShop"));
            {state = new ESLVal("NotInShop",new ESLVal[]{});
            return $null;}}
            }
          case "Helped": {
              {Lib.send(display,"ChangeState",id,new ESLVal("Browsing"));
            {state = new ESLVal("Browsing",new ESLVal[]{});
            return $null;}}
            }
          case "Leave": {
              {Lib.send(display,"ChangeState",id,new ESLVal("NotInShop"));
            {state = new ESLVal("NotInShop",new ESLVal[]{});
            return $null;}}
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v366)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getId": return getId;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(state.eql(new ESLVal("NotInShop",new ESLVal[]{})).boolVal)
            probably(probOfEnteringShop,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {Lib.send(display,"ChangeState",id,new ESLVal("Browsing"));
                {state = new ESLVal("Browsing",new ESLVal[]{});
                return $null;}}
              }
            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return $null;
              }
            }));
            else
              {ESLVal _v371 = $t;
                
                if(state.eql(new ESLVal("Browsing",new ESLVal[]{})).boolVal)
                probably(probOfSeekingHelp,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    {Lib.send(display,"ChangeState",id,new ESLVal("SeekingHelp"));
                    state = new ESLVal("SeekingHelp",new ESLVal[]{});
                    return Lib.send(hMonitor,"NeedsHelp",getSelf());}
                  }
                }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return probably(probOfBuying,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          {Lib.send(display,"ChangeState",id,new ESLVal("Queueing"));
                          Lib.send(tMonitor,"Queue",getSelf());
                          {state = new ESLVal("Queuing",new ESLVal[]{});
                          return $null;}}
                        }
                      }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          return $null;
                        }
                      }));
                  }
                }));
                else
                  {ESLVal _v372 = $t;
                    
                    if($true.boolVal)
                    {}
                    else
                      {}
                  }
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
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v369 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v369)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(numOfSteps).boolVal)
            stopAll.apply();
            else
              {ESLVal _v370 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {{
                  ESLVal _v368 = $zero.to(numOfCustomers);
                  while(_v368.isCons()) {
                    ESLVal n = _v368.headVal;
                    {customers = customers.cons(newActor(customer,new ESLVal(new Actor()),n));
                    Lib.send(display,"RegisterCustomer",n,new ESLVal("NotInShop"),ESLVal.list(new ESLVal("NotInShop"),new ESLVal("Queueing"),new ESLVal("Browsing"),new ESLVal("SeekingHelp"),new ESLVal("GettingHelp"),new ESLVal("Buying")));}
                    _v368 = _v368.tailVal;}
                }
                {{
                  ESLVal _v367 = $zero.to(numOfAssistants);
                  while(_v367.isCons()) {
                    ESLVal n = _v367.headVal;
                    assistants = assistants.cons(newActor(assistant,new ESLVal(new Actor())));
                    _v367 = _v367.tailVal;}
                }
                return $null;}}
              }}.get();
          }
        });
    }
  });
private static ESLVal row(ESLVal ds) {
    
    return new ESLVal("Row",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("border: 1px solid black;"))),ds);
  }
  private static ESLVal row = new ESLVal(new Function(new ESLVal("row"),null) { public ESLVal apply(ESLVal... args) { return row(args[0]); }});
  private static ESLVal tdata(ESLVal d) {
    
    return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;"))),d);
  }
  private static ESLVal tdata = new ESLVal(new Function(new ESLVal("tdata"),null) { public ESLVal apply(ESLVal... args) { return tdata(args[0]); }});
  private static ESLVal rdata(ESLVal d) {
    
    return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;background-color:red;"))),d);
  }
  private static ESLVal rdata = new ESLVal(new Function(new ESLVal("rdata"),null) { public ESLVal apply(ESLVal... args) { return rdata(args[0]); }});
  private static ESLVal bdata(ESLVal d) {
    
    return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;background-color:lightblue;"))),d);
  }
  private static ESLVal bdata = new ESLVal(new Function(new ESLVal("bdata"),null) { public ESLVal apply(ESLVal... args) { return bdata(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}