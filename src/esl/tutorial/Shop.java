package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Shop {
  public static ESLVal getSelf() { return $null; }
  // static ESLVal edb = null;
  private static ESLVal row = new ESLVal(new Function(new ESLVal("row"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  return new ESLVal("Row",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("border: 1px solid black;"))),ds);
    }
  });
  private static ESLVal tdata = new ESLVal(new Function(new ESLVal("tdata"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;"))),d);
    }
  });
  private static ESLVal rdata = new ESLVal(new Function(new ESLVal("rdata"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;background-color:red;"))),d);
    }
  });
  private static ESLVal bdata = new ESLVal(new Function(new ESLVal("bdata"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  return new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size: 5px;border: 1px solid black;background-color:lightblue;"))),d);
    }
  });
  private static ESLVal displayB = new ESLVal(new Function(new ESLVal("displayB"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("displayB")) {
          ESLVal customers = ESLVal.list();
          ESLVal asTable = new ESLVal(new Function(new ESLVal("asTable"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                LetRec letrec = new LetRec() {
                  ESLVal rows = new ESLVal(new Function(new ESLVal("rows"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal cs = $args[0];
                    {ESLVal _v26 = cs;
                          
                          if(_v26.isCons())
                          {ESLVal $102 = _v26.head();
                            ESLVal $103 = _v26.tail();
                            
                            switch($102.termName) {
                            case "C": {ESLVal $108 = $102.termRef(0);
                              ESLVal $107 = $102.termRef(1);
                              ESLVal $106 = $102.termRef(2);
                              ESLVal $105 = $102.termRef(3);
                              ESLVal $104 = $102.termRef(4);
                              
                              {ESLVal c = $108;
                              
                              {ESLVal s = $107;
                              
                              {ESLVal ss = $106;
                              
                              {ESLVal sales = $105;
                              
                              {ESLVal walkouts = $104;
                              
                              {ESLVal rest = $103;
                              
                              return ESLVal.list(row.apply(ESLVal.list(bdata.apply(new ESLVal("HTML",new ESLVal("Customer-").add(c)))).add(states.apply(s,ss).add(ESLVal.list(tdata.apply(new ESLVal("HTML",new ESLVal("Sales = ").add(sales))),tdata.apply(new ESLVal("HTML",new ESLVal("Walkouts = ").add(walkouts)))))))).add(rows.apply(rest));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(4081,4445)").add(ESLVal.list(_v26)));
                          }
                          }
                        else if(_v26.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(4081,4445)").add(ESLVal.list(_v26)));
                        }
                      }
                    });
                  ESLVal states = new ESLVal(new Function(new ESLVal("states"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal current = $args[0];
                    ESLVal allStates = $args[1];
                    {ESLVal _v25 = allStates;
                          
                          if(_v25.isCons())
                          {ESLVal $100 = _v25.head();
                            ESLVal $101 = _v25.tail();
                            
                            {ESLVal state = $100;
                            
                            {ESLVal ss = $101;
                            
                            if(state.eql(current).boolVal)
                            return ESLVal.list(rdata.apply(new ESLVal("HTML",state.add(new ESLVal(""))))).add(states.apply(current,ss));
                            else
                              {ESLVal _v69 = $100;
                                
                                {ESLVal _v70 = $101;
                                
                                return ESLVal.list(tdata.apply(new ESLVal("HTML",_v69.add(new ESLVal(""))))).add(states.apply(current,_v70));
                              }
                              }
                          }
                          }
                          }
                        else if(_v25.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(4528,4790)").add(ESLVal.list(_v25)));
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
                
                  return new ESLVal("Table",$nil,ESLVal.list(row.apply(ESLVal.list(tdata.apply(new ESLVal("Table",$nil,rows.apply(take.apply(customers,length.apply(customers).div(new ESLVal(2)))))),tdata.apply(new ESLVal("Table",$nil,rows.apply(drop.apply(customers,length.apply(customers).div(new ESLVal(2))))))))).add(ESLVal.list(row.apply(ESLVal.list(tdata.apply(new ESLVal("HTML",new ESLVal("time = ").add(now()))),tdata.apply(new ESLVal("HTML",new ESLVal("time = ").add(now()))))))));
                
              }
            });
          ESLVal changeState = new ESLVal(new Function(new ESLVal("changeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal s = $args[1];
            ESLVal cs = $args[2];
            {ESLVal _v24 = cs;
                  
                  if(_v24.isCons())
                  {ESLVal $93 = _v24.head();
                    ESLVal $94 = _v24.tail();
                    
                    switch($93.termName) {
                    case "C": {ESLVal $99 = $93.termRef(0);
                      ESLVal $98 = $93.termRef(1);
                      ESLVal $97 = $93.termRef(2);
                      ESLVal $96 = $93.termRef(3);
                      ESLVal $95 = $93.termRef(4);
                      
                      {ESLVal c1 = $99;
                      
                      {ESLVal s1 = $98;
                      
                      {ESLVal ss = $97;
                      
                      {ESLVal sales = $96;
                      
                      {ESLVal walkouts = $95;
                      
                      {ESLVal rest = $94;
                      
                      if(c1.eql(c).boolVal)
                      return rest.cons(new ESLVal("C",c,s,ss,sales,walkouts));
                      else
                        {ESLVal _v67 = $93;
                          
                          {ESLVal _v68 = $94;
                          
                          return changeState.apply(c,s,_v68).cons(_v67);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $93;
                      
                      {ESLVal rest = $94;
                      
                      return changeState.apply(c,s,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v24.isNil())
                  return cs;
                else return error(new ESLVal("case error at Pos(5211,5456)").add(ESLVal.list(_v24)));
                }
              }
            });
          ESLVal getSales = new ESLVal(new Function(new ESLVal("getSales"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v23 = cs;
                  
                  if(_v23.isCons())
                  {ESLVal $86 = _v23.head();
                    ESLVal $87 = _v23.tail();
                    
                    switch($86.termName) {
                    case "C": {ESLVal $92 = $86.termRef(0);
                      ESLVal $91 = $86.termRef(1);
                      ESLVal $90 = $86.termRef(2);
                      ESLVal $89 = $86.termRef(3);
                      ESLVal $88 = $86.termRef(4);
                      
                      {ESLVal c1 = $92;
                      
                      {ESLVal s1 = $91;
                      
                      {ESLVal ss = $90;
                      
                      {ESLVal sales = $89;
                      
                      {ESLVal walkouts = $88;
                      
                      {ESLVal rest = $87;
                      
                      return sales.add(getSales.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5502,5643)").add(ESLVal.list(_v23)));
                  }
                  }
                else if(_v23.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5502,5643)").add(ESLVal.list(_v23)));
                }
              }
            });
          ESLVal getWalkouts = new ESLVal(new Function(new ESLVal("getWalkouts"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v22 = cs;
                  
                  if(_v22.isCons())
                  {ESLVal $79 = _v22.head();
                    ESLVal $80 = _v22.tail();
                    
                    switch($79.termName) {
                    case "C": {ESLVal $85 = $79.termRef(0);
                      ESLVal $84 = $79.termRef(1);
                      ESLVal $83 = $79.termRef(2);
                      ESLVal $82 = $79.termRef(3);
                      ESLVal $81 = $79.termRef(4);
                      
                      {ESLVal c1 = $85;
                      
                      {ESLVal s1 = $84;
                      
                      {ESLVal ss = $83;
                      
                      {ESLVal sales = $82;
                      
                      {ESLVal walkouts = $81;
                      
                      {ESLVal rest = $80;
                      
                      return walkouts.add(getWalkouts.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5692,5839)").add(ESLVal.list(_v22)));
                  }
                  }
                else if(_v22.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5692,5839)").add(ESLVal.list(_v22)));
                }
              }
            });
          ESLVal getEvents = new ESLVal(new Function(new ESLVal("getEvents"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v21 = cs;
                  
                  if(_v21.isCons())
                  {ESLVal $72 = _v21.head();
                    ESLVal $73 = _v21.tail();
                    
                    switch($72.termName) {
                    case "C": {ESLVal $78 = $72.termRef(0);
                      ESLVal $77 = $72.termRef(1);
                      ESLVal $76 = $72.termRef(2);
                      ESLVal $75 = $72.termRef(3);
                      ESLVal $74 = $72.termRef(4);
                      
                      {ESLVal c1 = $78;
                      
                      {ESLVal s1 = $77;
                      
                      {ESLVal ss = $76;
                      
                      {ESLVal sales = $75;
                      
                      {ESLVal walkouts = $74;
                      
                      {ESLVal rest = $73;
                      
                      return walkouts.add(sales.add(getEvents.apply(rest)));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5886,6039)").add(ESLVal.list(_v21)));
                  }
                  }
                else if(_v21.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5886,6039)").add(ESLVal.list(_v21)));
                }
              }
            });
          ESLVal sale = new ESLVal(new Function(new ESLVal("sale"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v64 = $args[0];
            ESLVal _v63 = $args[1];
            {ESLVal _v20 = _v63;
                  
                  if(_v20.isCons())
                  {ESLVal $65 = _v20.head();
                    ESLVal $66 = _v20.tail();
                    
                    switch($65.termName) {
                    case "C": {ESLVal $71 = $65.termRef(0);
                      ESLVal $70 = $65.termRef(1);
                      ESLVal $69 = $65.termRef(2);
                      ESLVal $68 = $65.termRef(3);
                      ESLVal $67 = $65.termRef(4);
                      
                      {ESLVal c1 = $71;
                      
                      {ESLVal s1 = $70;
                      
                      {ESLVal ss = $69;
                      
                      {ESLVal sales = $68;
                      
                      {ESLVal walkouts = $67;
                      
                      {ESLVal rest = $66;
                      
                      if(c1.eql(_v64).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales.add($one),walkouts));
                      else
                        {ESLVal _v65 = $65;
                          
                          {ESLVal _v66 = $66;
                          
                          return sale.apply(_v64,_v66).cons(_v65);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $65;
                      
                      {ESLVal rest = $66;
                      
                      return sale.apply(_v64,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v20.isNil())
                  return _v63;
                else return error(new ESLVal("case error at Pos(6116,6385)").add(ESLVal.list(_v20)));
                }
              }
            });
          ESLVal timeout = new ESLVal(new Function(new ESLVal("timeout"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v60 = $args[0];
            ESLVal _v59 = $args[1];
            {ESLVal _v19 = _v59;
                  
                  if(_v19.isCons())
                  {ESLVal $58 = _v19.head();
                    ESLVal $59 = _v19.tail();
                    
                    switch($58.termName) {
                    case "C": {ESLVal $64 = $58.termRef(0);
                      ESLVal $63 = $58.termRef(1);
                      ESLVal $62 = $58.termRef(2);
                      ESLVal $61 = $58.termRef(3);
                      ESLVal $60 = $58.termRef(4);
                      
                      {ESLVal c1 = $64;
                      
                      {ESLVal s1 = $63;
                      
                      {ESLVal ss = $62;
                      
                      {ESLVal sales = $61;
                      
                      {ESLVal walkouts = $60;
                      
                      {ESLVal rest = $59;
                      
                      if(c1.eql(_v60).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales,walkouts.add($one)));
                      else
                        {ESLVal _v61 = $58;
                          
                          {ESLVal _v62 = $59;
                          
                          return timeout.apply(_v60,_v62).cons(_v61);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $58;
                      
                      {ESLVal rest = $59;
                      
                      return timeout.apply(_v60,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v19.isNil())
                  return _v59;
                else return error(new ESLVal("case error at Pos(6465,6736)").add(ESLVal.list(_v19)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v27 = $m;
            
            switch(_v27.termName) {
            case "ChangeState": {ESLVal $115 = _v27.termRef(0);
              ESLVal $114 = _v27.termRef(1);
              
              {ESLVal c = $115;
              
              {ESLVal s = $114;
              
              {customers = changeState.apply(c,s,customers);
            {ESLVal[] events = new ESLVal[]{getEvents.apply(customers)};
              
              {ESLVal sales = getSales.apply(customers);
              ESLVal walkouts = getWalkouts.apply(customers);
              
              {if(events[0].eql($zero).boolVal)
              events[0] = $one;
              else
                {}
            return Lib.send(edb,"Show",new ESLVal("customers"),new ESLVal("Table",ESLVal.list(),ESLVal.list(new ESLVal("Row",ESLVal.list(),ESLVal.list(new ESLVal("Data",ESLVal.list(),asTable.apply()))))));}
            }
            }}
            }
            }
            }
          case "Sale": {ESLVal $113 = _v27.termRef(0);
              
              {ESLVal c = $113;
              
              {customers = sale.apply(c,customers);
            return $null;}
            }
            }
          case "TimeOut": {ESLVal $112 = _v27.termRef(0);
              
              {ESLVal c = $112;
              
              {customers = timeout.apply(c,customers);
            return $null;}
            }
            }
          case "RegisterCustomer": {ESLVal $111 = _v27.termRef(0);
              ESLVal $110 = _v27.termRef(1);
              ESLVal $109 = _v27.termRef(2);
              
              {ESLVal c = $111;
              
              {ESLVal state = $110;
              
              {ESLVal states = $109;
              
              {customers = customers.add(ESLVal.list(new ESLVal("C",c,state,states,$zero,$zero)));
            return Lib.send(edb,"Show",new ESLVal("customers"),asTable.apply());}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v27)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v18 = $m;
            
            switch(_v18.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v18)));
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
          ESLVal state = $nil;
          ESLVal maxHelpTime = new ESLVal(50);
          ESLVal maxWaitTime = new ESLVal(30);
          ESLVal assistantWaitingToHelp = new ESLVal(new Function(new ESLVal("assistantWaitingToHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal h = $args[0];
            {ESLVal _v15 = h;
                  
                  if(_v15.isCons())
                  {ESLVal $52 = _v15.head();
                    ESLVal $53 = _v15.tail();
                    
                    switch($52.termName) {
                    case "WaitingToHelp": {ESLVal $55 = $52.termRef(0);
                      ESLVal $54 = $52.termRef(1);
                      
                      {ESLVal a = $55;
                      
                      {ESLVal n = $54;
                      
                      {ESLVal _v57 = $53;
                      
                      return $true;
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $52;
                      
                      {ESLVal _v58 = $53;
                      
                      return assistantWaitingToHelp.apply(_v58);
                    }
                    }
                  }
                  }
                else if(_v15.isNil())
                  return $false;
                else return error(new ESLVal("case error at Pos(8788,8941)").add(ESLVal.list(_v15)));
                }
              }
            });
          ESLVal startHelp = new ESLVal(new Function(new ESLVal("startHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal n = $args[1];
            ESLVal h = $args[2];
            {ESLVal _v14 = h;
                  
                  if(_v14.isCons())
                  {ESLVal $48 = _v14.head();
                    ESLVal $49 = _v14.tail();
                    
                    switch($48.termName) {
                    case "WaitingToHelp": {ESLVal $51 = $48.termRef(0);
                      ESLVal $50 = $48.termRef(1);
                      
                      {ESLVal a = $51;
                      
                      {ESLVal m = $50;
                      
                      {ESLVal _v55 = $49;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v55).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $48;
                      
                      {ESLVal _v56 = $49;
                      
                      return startHelp.apply(c,n,_v56).cons(x);
                    }
                    }
                  }
                  }
                else if(_v14.isNil())
                  return ESLVal.list(new ESLVal("WaitingForHelp",c,n.sub($one)));
                else return error(new ESLVal("case error at Pos(8998,9327)").add(ESLVal.list(_v14)));
                }
              }
            });
          ESLVal tryToHelp = new ESLVal(new Function(new ESLVal("tryToHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal a = $args[0];
            ESLVal n = $args[1];
            ESLVal h = $args[2];
            {ESLVal _v13 = h;
                  
                  if(_v13.isCons())
                  {ESLVal $44 = _v13.head();
                    ESLVal $45 = _v13.tail();
                    
                    switch($44.termName) {
                    case "WaitingForHelp": {ESLVal $47 = $44.termRef(0);
                      ESLVal $46 = $44.termRef(1);
                      
                      {ESLVal c = $47;
                      
                      {ESLVal m = $46;
                      
                      {ESLVal _v53 = $45;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v53).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $44;
                      
                      {ESLVal _v54 = $45;
                      
                      return tryToHelp.apply(a,n,_v54).cons(x);
                    }
                    }
                  }
                  }
                else if(_v13.isNil())
                  return ESLVal.list(new ESLVal("WaitingToHelp",a,n.sub($one)));
                else return error(new ESLVal("case error at Pos(9385,9713)").add(ESLVal.list(_v13)));
                }
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v12 = s;
                  
                  if(_v12.isCons())
                  {ESLVal $35 = _v12.head();
                    ESLVal $36 = _v12.tail();
                    
                    switch($35.termName) {
                    case "Helping": {ESLVal $43 = $35.termRef(0);
                      ESLVal $42 = $35.termRef(1);
                      ESLVal $41 = $35.termRef(2);
                      
                      switch($41.intVal) {
                      case 0: {ESLVal a = $43;
                        
                        {ESLVal c = $42;
                        
                        {ESLVal _v51 = $36;
                        
                        {Lib.send(a,"CompletedHelp");
                      Lib.send(c,"Helped");
                      return process.apply(_v51);}
                      }
                      }
                      }
                      default: {ESLVal a = $43;
                        
                        {ESLVal c = $42;
                        
                        {ESLVal n = $41;
                        
                        {ESLVal _v52 = $36;
                        
                        return process.apply(_v52).cons(new ESLVal("Helping",a,c,n.sub($one)));
                      }
                      }
                      }
                      }
                    }
                    }
                  case "WaitingForHelp": {ESLVal $40 = $35.termRef(0);
                      ESLVal $39 = $35.termRef(1);
                      
                      switch($39.intVal) {
                      case 0: {ESLVal c = $40;
                        
                        {ESLVal _v49 = $36;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v49);}
                      }
                      }
                      default: {ESLVal c = $40;
                        
                        {ESLVal n = $39;
                        
                        {ESLVal _v50 = $36;
                        
                        return startHelp.apply(c,n,_v50);
                      }
                      }
                      }
                    }
                    }
                  case "WaitingToHelp": {ESLVal $38 = $35.termRef(0);
                      ESLVal $37 = $35.termRef(1);
                      
                      switch($37.intVal) {
                      case 0: {ESLVal a = $38;
                        
                        {ESLVal _v47 = $36;
                        
                        {Lib.send(a,"CompletedHelp");
                      return process.apply(_v47);}
                      }
                      }
                      default: {ESLVal a = $38;
                        
                        {ESLVal n = $37;
                        
                        {ESLVal _v48 = $36;
                        
                        return tryToHelp.apply(a,n,_v48);
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(9749,10499)").add(ESLVal.list(_v12)));
                  }
                  }
                else if(_v12.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(9749,10499)").add(ESLVal.list(_v12)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v16 = $m;
            
            switch(_v16.termName) {
            case "NeedsHelp": {ESLVal $57 = _v16.termRef(0);
              
              {ESLVal c = $57;
              
              if(assistantWaitingToHelp.apply(state).boolVal)
              {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
              return $null;}
              else
                {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
                {{
                  ESLVal _v17 = assistants;
                  while(_v17.isCons()) {
                    ESLVal a = _v17.headVal;
                    Lib.send(a,"CustomerNeedsHelp");
                    _v17 = _v17.tailVal;}
                }
                return $null;}}
            }
            }
          case "Available": {ESLVal $56 = _v16.termRef(0);
              
              {ESLVal a = $56;
              
              {state = state.cons(new ESLVal("WaitingToHelp",a,maxWaitTime));
            return $null;}
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v16)));
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
            state = process.apply(state);
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
          ESLVal state = $nil;
          ESLVal maxServeTime = new ESLVal(2);
          ESLVal maxWaitTime = new ESLVal(100);
          ESLVal maxIdleTime = new ESLVal(200);
          ESLVal findBusyTill = new ESLVal(new Function(new ESLVal("findBusyTill"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v9 = s;
                  
                  if(_v9.isCons())
                  {ESLVal $28 = _v9.head();
                    ESLVal $29 = _v9.tail();
                    
                    switch($28.termName) {
                    case "TillQueue": {ESLVal $32 = $28.termRef(0);
                      ESLVal $31 = $28.termRef(1);
                      ESLVal $30 = $28.termRef(2);
                      
                      {ESLVal c = $32;
                      
                      {ESLVal till = $31;
                      
                      {ESLVal n = $30;
                      
                      {ESLVal _v45 = $29;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $28;
                      
                      {ESLVal _v46 = $29;
                      
                      return findBusyTill.apply(_v46);
                    }
                    }
                  }
                  }
                else if(_v9.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(11144,11294)").add(ESLVal.list(_v9)));
                }
              }
            });
          ESLVal findServicedTill = new ESLVal(new Function(new ESLVal("findServicedTill"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v8 = s;
                  
                  if(_v8.isCons())
                  {ESLVal $23 = _v8.head();
                    ESLVal $24 = _v8.tail();
                    
                    switch($23.termName) {
                    case "TillReady": {ESLVal $27 = $23.termRef(0);
                      ESLVal $26 = $23.termRef(1);
                      ESLVal $25 = $23.termRef(2);
                      
                      {ESLVal a = $27;
                      
                      {ESLVal till = $26;
                      
                      {ESLVal n = $25;
                      
                      {ESLVal _v43 = $24;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $23;
                      
                      {ESLVal _v44 = $24;
                      
                      return findServicedTill.apply(_v44);
                    }
                    }
                  }
                  }
                else if(_v8.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(11338,11493)").add(ESLVal.list(_v8)));
                }
              }
            });
          ESLVal startServe = new ESLVal(new Function(new ESLVal("startServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            {ESLVal _v7 = h;
                  
                  if(_v7.isCons())
                  {ESLVal $18 = _v7.head();
                    ESLVal $19 = _v7.tail();
                    
                    switch($18.termName) {
                    case "TillReady": {ESLVal $22 = $18.termRef(0);
                      ESLVal $21 = $18.termRef(1);
                      ESLVal $20 = $18.termRef(2);
                      
                      {ESLVal a = $22;
                      
                      {ESLVal atill = $21;
                      
                      {ESLVal m = $20;
                      
                      {ESLVal _v40 = $19;
                      
                      if(atill.eql(till).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v40).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $18;
                          
                          {ESLVal _v41 = $19;
                          
                          return startServe.apply(c,till,n,_v41).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $18;
                      
                      {ESLVal _v42 = $19;
                      
                      return startServe.apply(c,till,n,_v42).cons(x);
                    }
                    }
                  }
                  }
                else if(_v7.isNil())
                  return ESLVal.list(new ESLVal("TillQueue",c,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(11563,11954)").add(ESLVal.list(_v7)));
                }
              }
            });
          ESLVal tryToServe = new ESLVal(new Function(new ESLVal("tryToServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal a = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            {ESLVal _v6 = h;
                  
                  if(_v6.isCons())
                  {ESLVal $13 = _v6.head();
                    ESLVal $14 = _v6.tail();
                    
                    switch($13.termName) {
                    case "TillQueue": {ESLVal $17 = $13.termRef(0);
                      ESLVal $16 = $13.termRef(1);
                      ESLVal $15 = $13.termRef(2);
                      
                      {ESLVal c = $17;
                      
                      {ESLVal atill = $16;
                      
                      {ESLVal m = $15;
                      
                      {ESLVal _v37 = $14;
                      
                      if(till.eql(atill).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v37).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $13;
                          
                          {ESLVal _v38 = $14;
                          
                          return tryToServe.apply(a,till,n,_v38).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $13;
                      
                      {ESLVal _v39 = $14;
                      
                      return tryToServe.apply(a,till,n,_v39).cons(x);
                    }
                    }
                  }
                  }
                else if(_v6.isNil())
                  return ESLVal.list(new ESLVal("TillReady",a,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(12025,12396)").add(ESLVal.list(_v6)));
                }
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v5 = s;
                  
                  if(_v5.isCons())
                  {ESLVal $1 = _v5.head();
                    ESLVal $2 = _v5.tail();
                    
                    switch($1.termName) {
                    case "TillService": {ESLVal $12 = $1.termRef(0);
                      ESLVal $11 = $1.termRef(1);
                      ESLVal $10 = $1.termRef(2);
                      ESLVal $9 = $1.termRef(3);
                      
                      switch($9.intVal) {
                      case 0: {ESLVal a = $12;
                        
                        {ESLVal c = $11;
                        
                        {ESLVal till = $10;
                        
                        {ESLVal _v35 = $2;
                        
                        {Lib.send(display,"Sale",c.ref("getId").apply());
                      Lib.send(c,"Leave");
                      Lib.send(getSelf(),"Serve",a);
                      return process.apply(_v35);}
                      }
                      }
                      }
                      }
                      default: {ESLVal a = $12;
                        
                        {ESLVal c = $11;
                        
                        {ESLVal till = $10;
                        
                        {ESLVal n = $9;
                        
                        {ESLVal _v36 = $2;
                        
                        return process.apply(_v36).cons(new ESLVal("TillService",a,c,till,n.sub($one)));
                      }
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillQueue": {ESLVal $8 = $1.termRef(0);
                      ESLVal $7 = $1.termRef(1);
                      ESLVal $6 = $1.termRef(2);
                      
                      switch($6.intVal) {
                      case 0: {ESLVal c = $8;
                        
                        {ESLVal till = $7;
                        
                        {ESLVal _v33 = $2;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v33);}
                      }
                      }
                      }
                      default: {ESLVal c = $8;
                        
                        {ESLVal till = $7;
                        
                        {ESLVal n = $6;
                        
                        {ESLVal _v34 = $2;
                        
                        return startServe.apply(c,till,n,_v34);
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillReady": {ESLVal $5 = $1.termRef(0);
                      ESLVal $4 = $1.termRef(1);
                      ESLVal $3 = $1.termRef(2);
                      
                      switch($3.intVal) {
                      case 0: {ESLVal a = $5;
                        
                        {ESLVal till = $4;
                        
                        {ESLVal _v31 = $2;
                        
                        {Lib.send(a,"CompletedTill");
                      return process.apply(_v31);}
                      }
                      }
                      }
                      default: {ESLVal a = $5;
                        
                        {ESLVal till = $4;
                        
                        {ESLVal n = $3;
                        
                        {ESLVal _v32 = $2;
                        
                        return tryToServe.apply(a,till,n,_v32);
                      }
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(12435,13363)").add(ESLVal.list(_v5)));
                  }
                  }
                else if(_v5.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(12435,13363)").add(ESLVal.list(_v5)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v10 = $m;
            
            switch(_v10.termName) {
            case "Queue": {ESLVal $34 = _v10.termRef(0);
              
              {ESLVal c = $34;
              
              {ESLVal till = findServicedTill.apply(state);
              
              if(till.less($zero).boolVal)
              {state = state.cons(new ESLVal("TillQueue",c,random.apply(numOfTills),maxWaitTime));
              {{
                ESLVal _v11 = assistants;
                while(_v11.isCons()) {
                  ESLVal a = _v11.headVal;
                  Lib.send(a,"CustomerAtTill");
                  _v11 = _v11.tailVal;}
              }
              return $null;}}
              else
                {state = state.cons(new ESLVal("TillQueue",c,till,maxWaitTime));
                return $null;}
            }
            }
            }
          case "Serve": {ESLVal $33 = _v10.termRef(0);
              
              {ESLVal a = $33;
              
              {ESLVal till = findBusyTill.apply(state);
              
              if(till.less($zero).boolVal)
              return Lib.send(a,"CompletedTill");
              else
                {state = state.cons(new ESLVal("TillReady",a,till,maxIdleTime));
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v10)));
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
            state = process.apply(state);
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
  private static ESLVal customers = ESLVal.list();
  private static ESLVal assistants = ESLVal.list();
  private static ESLVal hMonitor = newActor(helpMonitor,new ESLVal(new Actor()));
  private static ESLVal tMonitor = newActor(tillMonitor,new ESLVal(new Actor()));
  private static ESLVal customer = new ESLVal(new Function(new ESLVal("customer"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("customer")) {
          ESLVal state = new ESLVal("NotInShop",new ESLVal[]{});
          ESLVal probOfEnteringShop = new ESLVal(30);
          ESLVal probOfBuying = new ESLVal(80);
          ESLVal probOfSeekingHelp = new ESLVal(20);
          ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return id;
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
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
              {ESLVal _v29 = $t;
                
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
                  {ESLVal _v30 = $t;
                    
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
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
              {ESLVal _v28 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {{
                  ESLVal _v2 = $zero.to(numOfCustomers);
                  while(_v2.isCons()) {
                    ESLVal n = _v2.headVal;
                    {customers = customers.cons(newActor(customer,new ESLVal(new Actor()),n));
                    Lib.send(display,"RegisterCustomer",n,new ESLVal("NotInShop"),ESLVal.list(new ESLVal("NotInShop"),new ESLVal("Queueing"),new ESLVal("Browsing"),new ESLVal("SeekingHelp"),new ESLVal("GettingHelp"),new ESLVal("Buying")));}
                    _v2 = _v2.tailVal;}
                }
                {{
                  ESLVal _v1 = $zero.to(numOfAssistants);
                  while(_v1.isCons()) {
                    ESLVal n = _v1.headVal;
                    assistants = assistants.cons(newActor(assistant,new ESLVal(new Actor())));
                    _v1 = _v1.tailVal;}
                }
                return $null;}}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}