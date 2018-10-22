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
                    if(cs.isCons())
                          {ESLVal $19 = cs.head();
                            ESLVal $20 = cs.tail();
                            
                            switch($19.termName) {
                            case "C": {ESLVal $21 = $19.termRef(0);
                              ESLVal $22 = $19.termRef(1);
                              ESLVal $23 = $19.termRef(2);
                              ESLVal $24 = $19.termRef(3);
                              ESLVal $25 = $19.termRef(4);
                              
                              {ESLVal c = $21;
                              
                              {ESLVal s = $22;
                              
                              {ESLVal ss = $23;
                              
                              {ESLVal sales = $24;
                              
                              {ESLVal walkouts = $25;
                              
                              {ESLVal rest = $20;
                              
                              return ESLVal.list(row.apply(ESLVal.list(bdata.apply(new ESLVal("HTML",new ESLVal("Customer-").add(c)))).add(states.apply(s,ss).add(ESLVal.list(tdata.apply(new ESLVal("HTML",new ESLVal("Sales = ").add(sales))),tdata.apply(new ESLVal("HTML",new ESLVal("Walkouts = ").add(walkouts)))))))).add(rows.apply(rest));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(4082,4446)"));
                          }
                          }
                        else if(cs.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(4082,4446)"));
                      }
                    });
                  ESLVal states = new ESLVal(new Function(new ESLVal("states"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal current = $args[0];
                    ESLVal allStates = $args[1];
                    if(allStates.isCons())
                          {ESLVal $26 = allStates.head();
                            ESLVal $27 = allStates.tail();
                            
                            {ESLVal state = $26;
                            
                            {ESLVal ss = $27;
                            
                            if(state.eql(current).boolVal)
                            return ESLVal.list(rdata.apply(new ESLVal("HTML",state.add(new ESLVal(""))))).add(states.apply(current,ss));
                            else
                              {ESLVal _v17 = $26;
                                
                                {ESLVal _v18 = $27;
                                
                                return ESLVal.list(tdata.apply(new ESLVal("HTML",_v17.add(new ESLVal(""))))).add(states.apply(current,_v18));
                              }
                              }
                          }
                          }
                          }
                        else if(allStates.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(4529,4791)"));
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
            if(cs.isCons())
                  {ESLVal $28 = cs.head();
                    ESLVal $29 = cs.tail();
                    
                    switch($28.termName) {
                    case "C": {ESLVal $30 = $28.termRef(0);
                      ESLVal $31 = $28.termRef(1);
                      ESLVal $32 = $28.termRef(2);
                      ESLVal $33 = $28.termRef(3);
                      ESLVal $34 = $28.termRef(4);
                      
                      {ESLVal c1 = $30;
                      
                      {ESLVal s1 = $31;
                      
                      {ESLVal ss = $32;
                      
                      {ESLVal sales = $33;
                      
                      {ESLVal walkouts = $34;
                      
                      {ESLVal rest = $29;
                      
                      if(c1.eql(c).boolVal)
                      return rest.cons(new ESLVal("C",c,s,ss,sales,walkouts));
                      else
                        {ESLVal _v19 = $28;
                          
                          {ESLVal _v20 = $29;
                          
                          return changeState.apply(c,s,_v20).cons(_v19);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $28;
                      
                      {ESLVal rest = $29;
                      
                      return changeState.apply(c,s,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(cs.isNil())
                  return cs;
                else return error(new ESLVal("case error at Pos(5212,5457)"));
              }
            });
          ESLVal getSales = new ESLVal(new Function(new ESLVal("getSales"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            if(cs.isCons())
                  {ESLVal $35 = cs.head();
                    ESLVal $36 = cs.tail();
                    
                    switch($35.termName) {
                    case "C": {ESLVal $37 = $35.termRef(0);
                      ESLVal $38 = $35.termRef(1);
                      ESLVal $39 = $35.termRef(2);
                      ESLVal $40 = $35.termRef(3);
                      ESLVal $41 = $35.termRef(4);
                      
                      {ESLVal c1 = $37;
                      
                      {ESLVal s1 = $38;
                      
                      {ESLVal ss = $39;
                      
                      {ESLVal sales = $40;
                      
                      {ESLVal walkouts = $41;
                      
                      {ESLVal rest = $36;
                      
                      return sales.add(getSales.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5503,5644)"));
                  }
                  }
                else if(cs.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5503,5644)"));
              }
            });
          ESLVal getWalkouts = new ESLVal(new Function(new ESLVal("getWalkouts"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            if(cs.isCons())
                  {ESLVal $42 = cs.head();
                    ESLVal $43 = cs.tail();
                    
                    switch($42.termName) {
                    case "C": {ESLVal $44 = $42.termRef(0);
                      ESLVal $45 = $42.termRef(1);
                      ESLVal $46 = $42.termRef(2);
                      ESLVal $47 = $42.termRef(3);
                      ESLVal $48 = $42.termRef(4);
                      
                      {ESLVal c1 = $44;
                      
                      {ESLVal s1 = $45;
                      
                      {ESLVal ss = $46;
                      
                      {ESLVal sales = $47;
                      
                      {ESLVal walkouts = $48;
                      
                      {ESLVal rest = $43;
                      
                      return walkouts.add(getWalkouts.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5693,5840)"));
                  }
                  }
                else if(cs.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5693,5840)"));
              }
            });
          ESLVal getEvents = new ESLVal(new Function(new ESLVal("getEvents"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            if(cs.isCons())
                  {ESLVal $49 = cs.head();
                    ESLVal $50 = cs.tail();
                    
                    switch($49.termName) {
                    case "C": {ESLVal $51 = $49.termRef(0);
                      ESLVal $52 = $49.termRef(1);
                      ESLVal $53 = $49.termRef(2);
                      ESLVal $54 = $49.termRef(3);
                      ESLVal $55 = $49.termRef(4);
                      
                      {ESLVal c1 = $51;
                      
                      {ESLVal s1 = $52;
                      
                      {ESLVal ss = $53;
                      
                      {ESLVal sales = $54;
                      
                      {ESLVal walkouts = $55;
                      
                      {ESLVal rest = $50;
                      
                      return walkouts.add(sales.add(getEvents.apply(rest)));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(5887,6040)"));
                  }
                  }
                else if(cs.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(5887,6040)"));
              }
            });
          ESLVal sale = new ESLVal(new Function(new ESLVal("sale"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal customer = $args[0];
            ESLVal customers = $args[1];
            if(customers.isCons())
                  {ESLVal $56 = customers.head();
                    ESLVal $57 = customers.tail();
                    
                    switch($56.termName) {
                    case "C": {ESLVal $58 = $56.termRef(0);
                      ESLVal $59 = $56.termRef(1);
                      ESLVal $60 = $56.termRef(2);
                      ESLVal $61 = $56.termRef(3);
                      ESLVal $62 = $56.termRef(4);
                      
                      {ESLVal c1 = $58;
                      
                      {ESLVal s1 = $59;
                      
                      {ESLVal ss = $60;
                      
                      {ESLVal sales = $61;
                      
                      {ESLVal walkouts = $62;
                      
                      {ESLVal rest = $57;
                      
                      if(c1.eql(customer).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales.add($one),walkouts));
                      else
                        {ESLVal _v21 = $56;
                          
                          {ESLVal _v22 = $57;
                          
                          return sale.apply(customer,_v22).cons(_v21);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $56;
                      
                      {ESLVal rest = $57;
                      
                      return sale.apply(customer,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(customers.isNil())
                  return customers;
                else return error(new ESLVal("case error at Pos(6117,6386)"));
              }
            });
          ESLVal timeout = new ESLVal(new Function(new ESLVal("timeout"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal customer = $args[0];
            ESLVal customers = $args[1];
            if(customers.isCons())
                  {ESLVal $63 = customers.head();
                    ESLVal $64 = customers.tail();
                    
                    switch($63.termName) {
                    case "C": {ESLVal $65 = $63.termRef(0);
                      ESLVal $66 = $63.termRef(1);
                      ESLVal $67 = $63.termRef(2);
                      ESLVal $68 = $63.termRef(3);
                      ESLVal $69 = $63.termRef(4);
                      
                      {ESLVal c1 = $65;
                      
                      {ESLVal s1 = $66;
                      
                      {ESLVal ss = $67;
                      
                      {ESLVal sales = $68;
                      
                      {ESLVal walkouts = $69;
                      
                      {ESLVal rest = $64;
                      
                      if(c1.eql(customer).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales,walkouts.add($one)));
                      else
                        {ESLVal _v23 = $63;
                          
                          {ESLVal _v24 = $64;
                          
                          return timeout.apply(customer,_v24).cons(_v23);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $63;
                      
                      {ESLVal rest = $64;
                      
                      return timeout.apply(customer,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(customers.isNil())
                  return customers;
                else return error(new ESLVal("case error at Pos(6466,6737)"));
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "ChangeState": {ESLVal $70 = $m.termRef(0);
              ESLVal $71 = $m.termRef(1);
              
              {ESLVal c = $70;
              
              {ESLVal s = $71;
              
              {customers = changeState.apply(c,s,customers);
            {ESLVal events = getEvents.apply(customers);
              
              {ESLVal sales = getSales.apply(customers);
              ESLVal walkouts = getWalkouts.apply(customers);
              
              {if(events.eql($zero).boolVal)
              events = $one;
              else
                {}
            return Lib.send(edb,"Show",new ESLVal("customers"),new ESLVal("Table",ESLVal.list(),ESLVal.list(new ESLVal("Row",ESLVal.list(),ESLVal.list(new ESLVal("Data",ESLVal.list(),asTable.apply()))))));}
            }
            }}
            }
            }
            }
          case "Sale": {ESLVal $72 = $m.termRef(0);
              
              {ESLVal c = $72;
              
              {customers = sale.apply(c,customers);
            return $null;}
            }
            }
          case "TimeOut": {ESLVal $73 = $m.termRef(0);
              
              {ESLVal c = $73;
              
              {customers = timeout.apply(c,customers);
            return $null;}
            }
            }
          case "RegisterCustomer": {ESLVal $74 = $m.termRef(0);
              ESLVal $75 = $m.termRef(1);
              ESLVal $76 = $m.termRef(2);
              
              {ESLVal c = $74;
              
              {ESLVal state = $75;
              
              {ESLVal states = $76;
              
              {customers = customers.add(ESLVal.list(new ESLVal("C",c,state,states,$zero,$zero)));
            return Lib.send(edb,"Show",new ESLVal("customers"),asTable.apply());}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
            if(h.isCons())
                  {ESLVal $77 = h.head();
                    ESLVal $78 = h.tail();
                    
                    switch($77.termName) {
                    case "WaitingToHelp": {ESLVal $79 = $77.termRef(0);
                      ESLVal $80 = $77.termRef(1);
                      
                      {ESLVal a = $79;
                      
                      {ESLVal n = $80;
                      
                      {ESLVal _v25 = $78;
                      
                      return $true;
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $77;
                      
                      {ESLVal _v26 = $78;
                      
                      return assistantWaitingToHelp.apply(_v26);
                    }
                    }
                  }
                  }
                else if(h.isNil())
                  return $false;
                else return error(new ESLVal("case error at Pos(8789,8942)"));
              }
            });
          ESLVal startHelp = new ESLVal(new Function(new ESLVal("startHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal n = $args[1];
            ESLVal h = $args[2];
            if(h.isCons())
                  {ESLVal $81 = h.head();
                    ESLVal $82 = h.tail();
                    
                    switch($81.termName) {
                    case "WaitingToHelp": {ESLVal $83 = $81.termRef(0);
                      ESLVal $84 = $81.termRef(1);
                      
                      {ESLVal a = $83;
                      
                      {ESLVal m = $84;
                      
                      {ESLVal _v27 = $82;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v27).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $81;
                      
                      {ESLVal _v28 = $82;
                      
                      return startHelp.apply(c,n,_v28).cons(x);
                    }
                    }
                  }
                  }
                else if(h.isNil())
                  return ESLVal.list(new ESLVal("WaitingForHelp",c,n.sub($one)));
                else return error(new ESLVal("case error at Pos(8999,9328)"));
              }
            });
          ESLVal tryToHelp = new ESLVal(new Function(new ESLVal("tryToHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal a = $args[0];
            ESLVal n = $args[1];
            ESLVal h = $args[2];
            if(h.isCons())
                  {ESLVal $85 = h.head();
                    ESLVal $86 = h.tail();
                    
                    switch($85.termName) {
                    case "WaitingForHelp": {ESLVal $87 = $85.termRef(0);
                      ESLVal $88 = $85.termRef(1);
                      
                      {ESLVal c = $87;
                      
                      {ESLVal m = $88;
                      
                      {ESLVal _v29 = $86;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v29).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $85;
                      
                      {ESLVal _v30 = $86;
                      
                      return tryToHelp.apply(a,n,_v30).cons(x);
                    }
                    }
                  }
                  }
                else if(h.isNil())
                  return ESLVal.list(new ESLVal("WaitingToHelp",a,n.sub($one)));
                else return error(new ESLVal("case error at Pos(9386,9714)"));
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            if(s.isCons())
                  {ESLVal $89 = s.head();
                    ESLVal $90 = s.tail();
                    
                    switch($89.termName) {
                    case "Helping": {ESLVal $91 = $89.termRef(0);
                      ESLVal $92 = $89.termRef(1);
                      ESLVal $93 = $89.termRef(2);
                      
                      switch($93.intVal) {
                      case 0: {ESLVal a = $91;
                        
                        {ESLVal c = $92;
                        
                        {ESLVal _v31 = $90;
                        
                        {Lib.send(a,"CompletedHelp");
                      Lib.send(c,"Helped");
                      return process.apply(_v31);}
                      }
                      }
                      }
                      default: {ESLVal a = $91;
                        
                        {ESLVal c = $92;
                        
                        {ESLVal n = $93;
                        
                        {ESLVal _v32 = $90;
                        
                        return process.apply(_v32).cons(new ESLVal("Helping",a,c,n.sub($one)));
                      }
                      }
                      }
                      }
                    }
                    }
                  case "WaitingForHelp": {ESLVal $94 = $89.termRef(0);
                      ESLVal $95 = $89.termRef(1);
                      
                      switch($95.intVal) {
                      case 0: {ESLVal c = $94;
                        
                        {ESLVal _v33 = $90;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v33);}
                      }
                      }
                      default: {ESLVal c = $94;
                        
                        {ESLVal n = $95;
                        
                        {ESLVal _v34 = $90;
                        
                        return startHelp.apply(c,n,_v34);
                      }
                      }
                      }
                    }
                    }
                  case "WaitingToHelp": {ESLVal $96 = $89.termRef(0);
                      ESLVal $97 = $89.termRef(1);
                      
                      switch($97.intVal) {
                      case 0: {ESLVal a = $96;
                        
                        {ESLVal _v35 = $90;
                        
                        {Lib.send(a,"CompletedHelp");
                      return process.apply(_v35);}
                      }
                      }
                      default: {ESLVal a = $96;
                        
                        {ESLVal n = $97;
                        
                        {ESLVal _v36 = $90;
                        
                        return tryToHelp.apply(a,n,_v36);
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(9750,10500)"));
                  }
                  }
                else if(s.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(9750,10500)"));
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "NeedsHelp": {ESLVal $98 = $m.termRef(0);
              
              {ESLVal c = $98;
              
              if(assistantWaitingToHelp.apply(state).boolVal)
              {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
              return $null;}
              else
                {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
                {{
                  ESLVal _v9 = assistants;
                  while(_v9.isCons()) {
                    if(_v9.isCons())
                      {ESLVal $100 = _v9.head();
                        ESLVal $101 = _v9.tail();
                        
                        {ESLVal a = $100;
                        
                        {ESLVal _v10 = $101;
                        
                        {_v9 = _v10;
                      Lib.send(a,"CustomerNeedsHelp");}
                      }
                      }
                      }
                    else if(_v9.isNil())
                      error(new ESLVal("case error at Pos(10691,10748)"));
                    else error(new ESLVal("case error at Pos(10691,10748)"));
                    }
                }
                return $null;}}
            }
            }
          case "Available": {ESLVal $99 = $m.termRef(0);
              
              {ESLVal a = $99;
              
              {state = state.cons(new ESLVal("WaitingToHelp",a,maxWaitTime));
            return $null;}
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
            if(s.isCons())
                  {ESLVal $102 = s.head();
                    ESLVal $103 = s.tail();
                    
                    switch($102.termName) {
                    case "TillQueue": {ESLVal $104 = $102.termRef(0);
                      ESLVal $105 = $102.termRef(1);
                      ESLVal $106 = $102.termRef(2);
                      
                      {ESLVal c = $104;
                      
                      {ESLVal till = $105;
                      
                      {ESLVal n = $106;
                      
                      {ESLVal _v37 = $103;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $102;
                      
                      {ESLVal _v38 = $103;
                      
                      return findBusyTill.apply(_v38);
                    }
                    }
                  }
                  }
                else if(s.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(11145,11295)"));
              }
            });
          ESLVal findServicedTill = new ESLVal(new Function(new ESLVal("findServicedTill"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            if(s.isCons())
                  {ESLVal $107 = s.head();
                    ESLVal $108 = s.tail();
                    
                    switch($107.termName) {
                    case "TillReady": {ESLVal $109 = $107.termRef(0);
                      ESLVal $110 = $107.termRef(1);
                      ESLVal $111 = $107.termRef(2);
                      
                      {ESLVal a = $109;
                      
                      {ESLVal till = $110;
                      
                      {ESLVal n = $111;
                      
                      {ESLVal _v39 = $108;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $107;
                      
                      {ESLVal _v40 = $108;
                      
                      return findServicedTill.apply(_v40);
                    }
                    }
                  }
                  }
                else if(s.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(11339,11494)"));
              }
            });
          ESLVal startServe = new ESLVal(new Function(new ESLVal("startServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            if(h.isCons())
                  {ESLVal $112 = h.head();
                    ESLVal $113 = h.tail();
                    
                    switch($112.termName) {
                    case "TillReady": {ESLVal $114 = $112.termRef(0);
                      ESLVal $115 = $112.termRef(1);
                      ESLVal $116 = $112.termRef(2);
                      
                      {ESLVal a = $114;
                      
                      {ESLVal atill = $115;
                      
                      {ESLVal m = $116;
                      
                      {ESLVal _v41 = $113;
                      
                      if(atill.eql(till).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v41).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $112;
                          
                          {ESLVal _v42 = $113;
                          
                          return startServe.apply(c,till,n,_v42).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $112;
                      
                      {ESLVal _v43 = $113;
                      
                      return startServe.apply(c,till,n,_v43).cons(x);
                    }
                    }
                  }
                  }
                else if(h.isNil())
                  return ESLVal.list(new ESLVal("TillQueue",c,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(11564,11955)"));
              }
            });
          ESLVal tryToServe = new ESLVal(new Function(new ESLVal("tryToServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal a = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            if(h.isCons())
                  {ESLVal $117 = h.head();
                    ESLVal $118 = h.tail();
                    
                    switch($117.termName) {
                    case "TillQueue": {ESLVal $119 = $117.termRef(0);
                      ESLVal $120 = $117.termRef(1);
                      ESLVal $121 = $117.termRef(2);
                      
                      {ESLVal c = $119;
                      
                      {ESLVal atill = $120;
                      
                      {ESLVal m = $121;
                      
                      {ESLVal _v44 = $118;
                      
                      if(till.eql(atill).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v44).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $117;
                          
                          {ESLVal _v45 = $118;
                          
                          return tryToServe.apply(a,till,n,_v45).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $117;
                      
                      {ESLVal _v46 = $118;
                      
                      return tryToServe.apply(a,till,n,_v46).cons(x);
                    }
                    }
                  }
                  }
                else if(h.isNil())
                  return ESLVal.list(new ESLVal("TillReady",a,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(12026,12397)"));
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            if(s.isCons())
                  {ESLVal $122 = s.head();
                    ESLVal $123 = s.tail();
                    
                    switch($122.termName) {
                    case "TillService": {ESLVal $124 = $122.termRef(0);
                      ESLVal $125 = $122.termRef(1);
                      ESLVal $126 = $122.termRef(2);
                      ESLVal $127 = $122.termRef(3);
                      
                      switch($127.intVal) {
                      case 0: {ESLVal a = $124;
                        
                        {ESLVal c = $125;
                        
                        {ESLVal till = $126;
                        
                        {ESLVal _v47 = $123;
                        
                        {Lib.send(display,"Sale",c.ref("getId").apply());
                      Lib.send(c,"Leave");
                      Lib.send(getSelf(),"Serve",a);
                      return process.apply(_v47);}
                      }
                      }
                      }
                      }
                      default: {ESLVal a = $124;
                        
                        {ESLVal c = $125;
                        
                        {ESLVal till = $126;
                        
                        {ESLVal n = $127;
                        
                        {ESLVal _v48 = $123;
                        
                        return process.apply(_v48).cons(new ESLVal("TillService",a,c,till,n.sub($one)));
                      }
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillQueue": {ESLVal $128 = $122.termRef(0);
                      ESLVal $129 = $122.termRef(1);
                      ESLVal $130 = $122.termRef(2);
                      
                      switch($130.intVal) {
                      case 0: {ESLVal c = $128;
                        
                        {ESLVal till = $129;
                        
                        {ESLVal _v49 = $123;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v49);}
                      }
                      }
                      }
                      default: {ESLVal c = $128;
                        
                        {ESLVal till = $129;
                        
                        {ESLVal n = $130;
                        
                        {ESLVal _v50 = $123;
                        
                        return startServe.apply(c,till,n,_v50);
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillReady": {ESLVal $131 = $122.termRef(0);
                      ESLVal $132 = $122.termRef(1);
                      ESLVal $133 = $122.termRef(2);
                      
                      switch($133.intVal) {
                      case 0: {ESLVal a = $131;
                        
                        {ESLVal till = $132;
                        
                        {ESLVal _v51 = $123;
                        
                        {Lib.send(a,"CompletedTill");
                      return process.apply(_v51);}
                      }
                      }
                      }
                      default: {ESLVal a = $131;
                        
                        {ESLVal till = $132;
                        
                        {ESLVal n = $133;
                        
                        {ESLVal _v52 = $123;
                        
                        return tryToServe.apply(a,till,n,_v52);
                      }
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(12436,13364)"));
                  }
                  }
                else if(s.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(12436,13364)"));
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Queue": {ESLVal $134 = $m.termRef(0);
              
              {ESLVal c = $134;
              
              {ESLVal till = findServicedTill.apply(state);
              
              if(till.less($zero).boolVal)
              {state = state.cons(new ESLVal("TillQueue",c,random.apply(numOfTills),maxWaitTime));
              {{
                ESLVal _v11 = assistants;
                while(_v11.isCons()) {
                  if(_v11.isCons())
                    {ESLVal $136 = _v11.head();
                      ESLVal $137 = _v11.tail();
                      
                      {ESLVal a = $136;
                      
                      {ESLVal _v12 = $137;
                      
                      {_v11 = _v12;
                    Lib.send(a,"CustomerAtTill");}
                    }
                    }
                    }
                  else if(_v11.isNil())
                    error(new ESLVal("case error at Pos(13546,13600)"));
                  else error(new ESLVal("case error at Pos(13546,13600)"));
                  }
              }
              return $null;}}
              else
                {state = state.cons(new ESLVal("TillQueue",c,till,maxWaitTime));
                return $null;}
            }
            }
            }
          case "Serve": {ESLVal $135 = $m.termRef(0);
              
              {ESLVal a = $135;
              
              {ESLVal till = findBusyTill.apply(state);
              
              if(till.less($zero).boolVal)
              return Lib.send(a,"CompletedTill");
              else
                {state = state.cons(new ESLVal("TillReady",a,till,maxIdleTime));
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
              {ESLVal _v53 = $t;
                
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
                  {ESLVal _v54 = $t;
                    
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
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
              {ESLVal _v55 = $t;
                
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
                  ESLVal _v13 = $zero.to(numOfCustomers);
                  while(_v13.isCons()) {
                    if(_v13.isCons())
                      {ESLVal $138 = _v13.head();
                        ESLVal $139 = _v13.tail();
                        
                        {ESLVal n = $138;
                        
                        {ESLVal _v14 = $139;
                        
                        {_v13 = _v14;
                      {customers = customers.cons(newActor(customer,new ESLVal(new Actor()),n));
                      Lib.send(display,"RegisterCustomer",n,new ESLVal("NotInShop"),ESLVal.list(new ESLVal("NotInShop"),new ESLVal("Queueing"),new ESLVal("Browsing"),new ESLVal("SeekingHelp"),new ESLVal("GettingHelp"),new ESLVal("Buying")));}}
                      }
                      }
                      }
                    else if(_v13.isNil())
                      error(new ESLVal("case error at Pos(15461,15675)"));
                    else error(new ESLVal("case error at Pos(15461,15675)"));
                    }
                }
                {{
                  ESLVal _v15 = $zero.to(numOfAssistants);
                  while(_v15.isCons()) {
                    if(_v15.isCons())
                      {ESLVal $140 = _v15.head();
                        ESLVal $141 = _v15.tail();
                        
                        {ESLVal n = $140;
                        
                        {ESLVal _v16 = $141;
                        
                        {_v15 = _v16;
                      assistants = assistants.cons(newActor(assistant,new ESLVal(new Actor())));}
                      }
                      }
                      }
                    else if(_v15.isNil())
                      error(new ESLVal("case error at Pos(15680,15771)"));
                    else error(new ESLVal("case error at Pos(15680,15771)"));
                    }
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