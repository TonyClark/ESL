package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
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
                { LetRec letrec = new LetRec() {
                  ESLVal rows = new ESLVal(new Function(new ESLVal("rows"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal cs = $args[0];
                    {ESLVal _v1 = cs;
                          
                          if(_v1.isCons())
                          {ESLVal $1 = _v1.head();
                            ESLVal $2 = _v1.tail();
                            
                            switch($1.termName) {
                            case "C": {ESLVal $7 = $1.termRef(0);
                              ESLVal $6 = $1.termRef(1);
                              ESLVal $5 = $1.termRef(2);
                              ESLVal $4 = $1.termRef(3);
                              ESLVal $3 = $1.termRef(4);
                              
                              {ESLVal c = $7;
                              
                              {ESLVal s = $6;
                              
                              {ESLVal ss = $5;
                              
                              {ESLVal sales = $4;
                              
                              {ESLVal walkouts = $3;
                              
                              {ESLVal rest = $2;
                              
                              return ESLVal.list(row.apply(ESLVal.list(bdata.apply(new ESLVal("HTML",new ESLVal("Customer-").add(c)))).add(states.apply(s,ss).add(ESLVal.list(tdata.apply(new ESLVal("HTML",new ESLVal("Sales = ").add(sales))),tdata.apply(new ESLVal("HTML",new ESLVal("Walkouts = ").add(walkouts)))))))).add(rows.apply(rest));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(1694,2058)").add(ESLVal.list(_v1)));
                          }
                          }
                        else if(_v1.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(1694,2058)").add(ESLVal.list(_v1)));
                        }
                      }
                    });
                  ESLVal states = new ESLVal(new Function(new ESLVal("states"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal current = $args[0];
                    ESLVal allStates = $args[1];
                    {ESLVal _v2 = allStates;
                          
                          if(_v2.isCons())
                          {ESLVal $8 = _v2.head();
                            ESLVal $9 = _v2.tail();
                            
                            {ESLVal state = $8;
                            
                            {ESLVal ss = $9;
                            
                            if(state.eql(current).boolVal)
                            return ESLVal.list(rdata.apply(new ESLVal("HTML",state.add(new ESLVal(""))))).add(states.apply(current,ss));
                            else
                              {ESLVal _v69 = $8;
                                
                                {ESLVal _v70 = $9;
                                
                                return ESLVal.list(tdata.apply(new ESLVal("HTML",_v69.add(new ESLVal(""))))).add(states.apply(current,_v70));
                              }
                              }
                          }
                          }
                          }
                        else if(_v2.isNil())
                          return ESLVal.list();
                        else return error(new ESLVal("case error at Pos(2128,2331)").add(ESLVal.list(_v2)));
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
                
                  return new ESLVal("Table",$nil,ESLVal.list(row.apply(ESLVal.list(tdata.apply(new ESLVal("Table",$nil,rows.apply(take.apply(customers,length.apply(customers).div(new ESLVal(2)))))),tdata.apply(new ESLVal("Table",$nil,rows.apply(drop.apply(customers,length.apply(customers).div(new ESLVal(2))))))))).add(ESLVal.list(row.apply(ESLVal.list(tdata.apply(new ESLVal("HTML",new ESLVal("time = ").add(now()))),tdata.apply(new ESLVal("HTML",new ESLVal("time = ").add(now()))))))));}
                
              }
            });
          ESLVal changeState = new ESLVal(new Function(new ESLVal("changeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal s = $args[1];
            ESLVal cs = $args[2];
            {ESLVal _v3 = cs;
                  
                  if(_v3.isCons())
                  {ESLVal $10 = _v3.head();
                    ESLVal $11 = _v3.tail();
                    
                    switch($10.termName) {
                    case "C": {ESLVal $16 = $10.termRef(0);
                      ESLVal $15 = $10.termRef(1);
                      ESLVal $14 = $10.termRef(2);
                      ESLVal $13 = $10.termRef(3);
                      ESLVal $12 = $10.termRef(4);
                      
                      {ESLVal c1 = $16;
                      
                      {ESLVal s1 = $15;
                      
                      {ESLVal ss = $14;
                      
                      {ESLVal sales = $13;
                      
                      {ESLVal walkouts = $12;
                      
                      {ESLVal rest = $11;
                      
                      if(c1.eql(c).boolVal)
                      return rest.cons(new ESLVal("C",c,s,ss,sales,walkouts));
                      else
                        {ESLVal _v67 = $10;
                          
                          {ESLVal _v68 = $11;
                          
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
                    default: {ESLVal c1 = $10;
                      
                      {ESLVal rest = $11;
                      
                      return changeState.apply(c,s,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v3.isNil())
                  return cs;
                else return error(new ESLVal("case error at Pos(2752,2997)").add(ESLVal.list(_v3)));
                }
              }
            });
          ESLVal getSales = new ESLVal(new Function(new ESLVal("getSales"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v4 = cs;
                  
                  if(_v4.isCons())
                  {ESLVal $17 = _v4.head();
                    ESLVal $18 = _v4.tail();
                    
                    switch($17.termName) {
                    case "C": {ESLVal $23 = $17.termRef(0);
                      ESLVal $22 = $17.termRef(1);
                      ESLVal $21 = $17.termRef(2);
                      ESLVal $20 = $17.termRef(3);
                      ESLVal $19 = $17.termRef(4);
                      
                      {ESLVal c1 = $23;
                      
                      {ESLVal s1 = $22;
                      
                      {ESLVal ss = $21;
                      
                      {ESLVal sales = $20;
                      
                      {ESLVal walkouts = $19;
                      
                      {ESLVal rest = $18;
                      
                      return sales.add(getSales.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(3043,3184)").add(ESLVal.list(_v4)));
                  }
                  }
                else if(_v4.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(3043,3184)").add(ESLVal.list(_v4)));
                }
              }
            });
          ESLVal getWalkouts = new ESLVal(new Function(new ESLVal("getWalkouts"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v5 = cs;
                  
                  if(_v5.isCons())
                  {ESLVal $24 = _v5.head();
                    ESLVal $25 = _v5.tail();
                    
                    switch($24.termName) {
                    case "C": {ESLVal $30 = $24.termRef(0);
                      ESLVal $29 = $24.termRef(1);
                      ESLVal $28 = $24.termRef(2);
                      ESLVal $27 = $24.termRef(3);
                      ESLVal $26 = $24.termRef(4);
                      
                      {ESLVal c1 = $30;
                      
                      {ESLVal s1 = $29;
                      
                      {ESLVal ss = $28;
                      
                      {ESLVal sales = $27;
                      
                      {ESLVal walkouts = $26;
                      
                      {ESLVal rest = $25;
                      
                      return walkouts.add(getWalkouts.apply(rest));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(3233,3380)").add(ESLVal.list(_v5)));
                  }
                  }
                else if(_v5.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(3233,3380)").add(ESLVal.list(_v5)));
                }
              }
            });
          ESLVal getEvents = new ESLVal(new Function(new ESLVal("getEvents"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal cs = $args[0];
            {ESLVal _v6 = cs;
                  
                  if(_v6.isCons())
                  {ESLVal $31 = _v6.head();
                    ESLVal $32 = _v6.tail();
                    
                    switch($31.termName) {
                    case "C": {ESLVal $37 = $31.termRef(0);
                      ESLVal $36 = $31.termRef(1);
                      ESLVal $35 = $31.termRef(2);
                      ESLVal $34 = $31.termRef(3);
                      ESLVal $33 = $31.termRef(4);
                      
                      {ESLVal c1 = $37;
                      
                      {ESLVal s1 = $36;
                      
                      {ESLVal ss = $35;
                      
                      {ESLVal sales = $34;
                      
                      {ESLVal walkouts = $33;
                      
                      {ESLVal rest = $32;
                      
                      return walkouts.add(sales.add(getEvents.apply(rest)));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(3427,3580)").add(ESLVal.list(_v6)));
                  }
                  }
                else if(_v6.isNil())
                  return $zero;
                else return error(new ESLVal("case error at Pos(3427,3580)").add(ESLVal.list(_v6)));
                }
              }
            });
          ESLVal sale = new ESLVal(new Function(new ESLVal("sale"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v63 = $args[0];
            ESLVal _v64 = $args[1];
            {ESLVal _v7 = _v64;
                  
                  if(_v7.isCons())
                  {ESLVal $38 = _v7.head();
                    ESLVal $39 = _v7.tail();
                    
                    switch($38.termName) {
                    case "C": {ESLVal $44 = $38.termRef(0);
                      ESLVal $43 = $38.termRef(1);
                      ESLVal $42 = $38.termRef(2);
                      ESLVal $41 = $38.termRef(3);
                      ESLVal $40 = $38.termRef(4);
                      
                      {ESLVal c1 = $44;
                      
                      {ESLVal s1 = $43;
                      
                      {ESLVal ss = $42;
                      
                      {ESLVal sales = $41;
                      
                      {ESLVal walkouts = $40;
                      
                      {ESLVal rest = $39;
                      
                      if(c1.eql(_v63).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales.add($one),walkouts));
                      else
                        {ESLVal _v65 = $38;
                          
                          {ESLVal _v66 = $39;
                          
                          return sale.apply(_v63,_v66).cons(_v65);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $38;
                      
                      {ESLVal rest = $39;
                      
                      return sale.apply(_v63,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v7.isNil())
                  return _v64;
                else return error(new ESLVal("case error at Pos(3657,3926)").add(ESLVal.list(_v7)));
                }
              }
            });
          ESLVal timeout = new ESLVal(new Function(new ESLVal("timeout"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v59 = $args[0];
            ESLVal _v60 = $args[1];
            {ESLVal _v8 = _v60;
                  
                  if(_v8.isCons())
                  {ESLVal $45 = _v8.head();
                    ESLVal $46 = _v8.tail();
                    
                    switch($45.termName) {
                    case "C": {ESLVal $51 = $45.termRef(0);
                      ESLVal $50 = $45.termRef(1);
                      ESLVal $49 = $45.termRef(2);
                      ESLVal $48 = $45.termRef(3);
                      ESLVal $47 = $45.termRef(4);
                      
                      {ESLVal c1 = $51;
                      
                      {ESLVal s1 = $50;
                      
                      {ESLVal ss = $49;
                      
                      {ESLVal sales = $48;
                      
                      {ESLVal walkouts = $47;
                      
                      {ESLVal rest = $46;
                      
                      if(c1.eql(_v59).boolVal)
                      return rest.cons(new ESLVal("C",c1,s1,ss,sales,walkouts.add($one)));
                      else
                        {ESLVal _v61 = $45;
                          
                          {ESLVal _v62 = $46;
                          
                          return timeout.apply(_v59,_v62).cons(_v61);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal c1 = $45;
                      
                      {ESLVal rest = $46;
                      
                      return timeout.apply(_v59,rest).cons(c1);
                    }
                    }
                  }
                  }
                else if(_v8.isNil())
                  return _v60;
                else return error(new ESLVal("case error at Pos(4006,4277)").add(ESLVal.list(_v8)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v9 = $m;
            
            switch(_v9.termName) {
            case "ChangeState": {ESLVal $58 = _v9.termRef(0);
              ESLVal $57 = _v9.termRef(1);
              
              {ESLVal c = $58;
              
              {ESLVal s = $57;
              
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
          case "Sale": {ESLVal $56 = _v9.termRef(0);
              
              {ESLVal c = $56;
              
              {customers = sale.apply(c,customers);
            return $null;}
            }
            }
          case "TimeOut": {ESLVal $55 = _v9.termRef(0);
              
              {ESLVal c = $55;
              
              {customers = timeout.apply(c,customers);
            return $null;}
            }
            }
          case "RegisterCustomer": {ESLVal $54 = _v9.termRef(0);
              ESLVal $53 = _v9.termRef(1);
              ESLVal $52 = _v9.termRef(2);
              
              {ESLVal c = $54;
              
              {ESLVal state = $53;
              
              {ESLVal states = $52;
              
              {customers = customers.add(ESLVal.list(new ESLVal("C",c,state,states,$zero,$zero)));
            return Lib.send(edb,"Show",new ESLVal("customers"),asTable.apply());}
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v9)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v10 = $m;
            
            switch(_v10.termName) {
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
            {ESLVal _v11 = h;
                  
                  if(_v11.isCons())
                  {ESLVal $59 = _v11.head();
                    ESLVal $60 = _v11.tail();
                    
                    switch($59.termName) {
                    case "WaitingToHelp": {ESLVal $62 = $59.termRef(0);
                      ESLVal $61 = $59.termRef(1);
                      
                      {ESLVal a = $62;
                      
                      {ESLVal n = $61;
                      
                      {ESLVal _v57 = $60;
                      
                      return $true;
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $59;
                      
                      {ESLVal _v58 = $60;
                      
                      return assistantWaitingToHelp.apply(_v58);
                    }
                    }
                  }
                  }
                else if(_v11.isNil())
                  return $false;
                else return error(new ESLVal("case error at Pos(6274,6427)").add(ESLVal.list(_v11)));
                }
              }
            });
          ESLVal startHelp = new ESLVal(new Function(new ESLVal("startHelp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal n = $args[1];
            ESLVal h = $args[2];
            {ESLVal _v12 = h;
                  
                  if(_v12.isCons())
                  {ESLVal $63 = _v12.head();
                    ESLVal $64 = _v12.tail();
                    
                    switch($63.termName) {
                    case "WaitingToHelp": {ESLVal $66 = $63.termRef(0);
                      ESLVal $65 = $63.termRef(1);
                      
                      {ESLVal a = $66;
                      
                      {ESLVal m = $65;
                      
                      {ESLVal _v55 = $64;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v55).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $63;
                      
                      {ESLVal _v56 = $64;
                      
                      return startHelp.apply(c,n,_v56).cons(x);
                    }
                    }
                  }
                  }
                else if(_v12.isNil())
                  return ESLVal.list(new ESLVal("WaitingForHelp",c,n.sub($one)));
                else return error(new ESLVal("case error at Pos(6484,6813)").add(ESLVal.list(_v12)));
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
                  {ESLVal $67 = _v13.head();
                    ESLVal $68 = _v13.tail();
                    
                    switch($67.termName) {
                    case "WaitingForHelp": {ESLVal $70 = $67.termRef(0);
                      ESLVal $69 = $67.termRef(1);
                      
                      {ESLVal c = $70;
                      
                      {ESLVal m = $69;
                      
                      {ESLVal _v53 = $68;
                      
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("GettingHelp"));
                    return process.apply(_v53).cons(new ESLVal("Helping",a,c,random.apply(maxHelpTime)));}
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $67;
                      
                      {ESLVal _v54 = $68;
                      
                      return tryToHelp.apply(a,n,_v54).cons(x);
                    }
                    }
                  }
                  }
                else if(_v13.isNil())
                  return ESLVal.list(new ESLVal("WaitingToHelp",a,n.sub($one)));
                else return error(new ESLVal("case error at Pos(6871,7199)").add(ESLVal.list(_v13)));
                }
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v14 = s;
                  
                  if(_v14.isCons())
                  {ESLVal $71 = _v14.head();
                    ESLVal $72 = _v14.tail();
                    
                    switch($71.termName) {
                    case "Helping": {ESLVal $79 = $71.termRef(0);
                      ESLVal $78 = $71.termRef(1);
                      ESLVal $77 = $71.termRef(2);
                      
                      switch($77.intVal) {
                      case 0: {ESLVal a = $79;
                        
                        {ESLVal c = $78;
                        
                        {ESLVal _v51 = $72;
                        
                        {Lib.send(a,"CompletedHelp");
                      Lib.send(c,"Helped");
                      return process.apply(_v51);}
                      }
                      }
                      }
                      default: {ESLVal a = $79;
                        
                        {ESLVal c = $78;
                        
                        {ESLVal n = $77;
                        
                        {ESLVal _v52 = $72;
                        
                        return process.apply(_v52).cons(new ESLVal("Helping",a,c,n.sub($one)));
                      }
                      }
                      }
                      }
                    }
                    }
                  case "WaitingForHelp": {ESLVal $76 = $71.termRef(0);
                      ESLVal $75 = $71.termRef(1);
                      
                      switch($75.intVal) {
                      case 0: {ESLVal c = $76;
                        
                        {ESLVal _v49 = $72;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v49);}
                      }
                      }
                      default: {ESLVal c = $76;
                        
                        {ESLVal n = $75;
                        
                        {ESLVal _v50 = $72;
                        
                        return startHelp.apply(c,n,_v50);
                      }
                      }
                      }
                    }
                    }
                  case "WaitingToHelp": {ESLVal $74 = $71.termRef(0);
                      ESLVal $73 = $71.termRef(1);
                      
                      switch($73.intVal) {
                      case 0: {ESLVal a = $74;
                        
                        {ESLVal _v47 = $72;
                        
                        {Lib.send(a,"CompletedHelp");
                      return process.apply(_v47);}
                      }
                      }
                      default: {ESLVal a = $74;
                        
                        {ESLVal n = $73;
                        
                        {ESLVal _v48 = $72;
                        
                        return tryToHelp.apply(a,n,_v48);
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(7235,7985)").add(ESLVal.list(_v14)));
                  }
                  }
                else if(_v14.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(7235,7985)").add(ESLVal.list(_v14)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v15 = $m;
            
            switch(_v15.termName) {
            case "NeedsHelp": {ESLVal $81 = _v15.termRef(0);
              
              {ESLVal c = $81;
              
              if(assistantWaitingToHelp.apply(state).boolVal)
              {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
              return $null;}
              else
                {state = state.cons(new ESLVal("WaitingForHelp",c,maxWaitTime));
                {{
                  ESLVal _v16 = assistants;
                  while(_v16.isCons()) {
                    ESLVal a = _v16.headVal;
                    Lib.send(a,"CustomerNeedsHelp");
                    _v16 = _v16.tailVal;}
                }
                return $null;}}
            }
            }
          case "Available": {ESLVal $80 = _v15.termRef(0);
              
              {ESLVal a = $80;
              
              {state = state.cons(new ESLVal("WaitingToHelp",a,maxWaitTime));
            return $null;}
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
            {ESLVal _v17 = s;
                  
                  if(_v17.isCons())
                  {ESLVal $82 = _v17.head();
                    ESLVal $83 = _v17.tail();
                    
                    switch($82.termName) {
                    case "TillQueue": {ESLVal $86 = $82.termRef(0);
                      ESLVal $85 = $82.termRef(1);
                      ESLVal $84 = $82.termRef(2);
                      
                      {ESLVal c = $86;
                      
                      {ESLVal till = $85;
                      
                      {ESLVal n = $84;
                      
                      {ESLVal _v45 = $83;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $82;
                      
                      {ESLVal _v46 = $83;
                      
                      return findBusyTill.apply(_v46);
                    }
                    }
                  }
                  }
                else if(_v17.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(8630,8780)").add(ESLVal.list(_v17)));
                }
              }
            });
          ESLVal findServicedTill = new ESLVal(new Function(new ESLVal("findServicedTill"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v18 = s;
                  
                  if(_v18.isCons())
                  {ESLVal $87 = _v18.head();
                    ESLVal $88 = _v18.tail();
                    
                    switch($87.termName) {
                    case "TillReady": {ESLVal $91 = $87.termRef(0);
                      ESLVal $90 = $87.termRef(1);
                      ESLVal $89 = $87.termRef(2);
                      
                      {ESLVal a = $91;
                      
                      {ESLVal till = $90;
                      
                      {ESLVal n = $89;
                      
                      {ESLVal _v43 = $88;
                      
                      return till;
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $87;
                      
                      {ESLVal _v44 = $88;
                      
                      return findServicedTill.apply(_v44);
                    }
                    }
                  }
                  }
                else if(_v18.isNil())
                  return $zero.sub($one);
                else return error(new ESLVal("case error at Pos(8824,8979)").add(ESLVal.list(_v18)));
                }
              }
            });
          ESLVal startServe = new ESLVal(new Function(new ESLVal("startServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal c = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            {ESLVal _v19 = h;
                  
                  if(_v19.isCons())
                  {ESLVal $92 = _v19.head();
                    ESLVal $93 = _v19.tail();
                    
                    switch($92.termName) {
                    case "TillReady": {ESLVal $96 = $92.termRef(0);
                      ESLVal $95 = $92.termRef(1);
                      ESLVal $94 = $92.termRef(2);
                      
                      {ESLVal a = $96;
                      
                      {ESLVal atill = $95;
                      
                      {ESLVal m = $94;
                      
                      {ESLVal _v40 = $93;
                      
                      if(atill.eql(till).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v40).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $92;
                          
                          {ESLVal _v41 = $93;
                          
                          return startServe.apply(c,till,n,_v41).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $92;
                      
                      {ESLVal _v42 = $93;
                      
                      return startServe.apply(c,till,n,_v42).cons(x);
                    }
                    }
                  }
                  }
                else if(_v19.isNil())
                  return ESLVal.list(new ESLVal("TillQueue",c,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(9049,9440)").add(ESLVal.list(_v19)));
                }
              }
            });
          ESLVal tryToServe = new ESLVal(new Function(new ESLVal("tryToServe"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal a = $args[0];
            ESLVal till = $args[1];
            ESLVal n = $args[2];
            ESLVal h = $args[3];
            {ESLVal _v20 = h;
                  
                  if(_v20.isCons())
                  {ESLVal $97 = _v20.head();
                    ESLVal $98 = _v20.tail();
                    
                    switch($97.termName) {
                    case "TillQueue": {ESLVal $101 = $97.termRef(0);
                      ESLVal $100 = $97.termRef(1);
                      ESLVal $99 = $97.termRef(2);
                      
                      {ESLVal c = $101;
                      
                      {ESLVal atill = $100;
                      
                      {ESLVal m = $99;
                      
                      {ESLVal _v37 = $98;
                      
                      if(till.eql(atill).boolVal)
                      {Lib.send(display,"ChangeState",c.ref("getId").apply(),new ESLVal("Buying"));
                      return process.apply(_v37).cons(new ESLVal("TillService",a,c,till,random.apply(maxServeTime)));}
                      else
                        {ESLVal x = $97;
                          
                          {ESLVal _v38 = $98;
                          
                          return tryToServe.apply(a,till,n,_v38).cons(x);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal x = $97;
                      
                      {ESLVal _v39 = $98;
                      
                      return tryToServe.apply(a,till,n,_v39).cons(x);
                    }
                    }
                  }
                  }
                else if(_v20.isNil())
                  return ESLVal.list(new ESLVal("TillReady",a,till,n.sub($one)));
                else return error(new ESLVal("case error at Pos(9511,9882)").add(ESLVal.list(_v20)));
                }
              }
            });
          ESLVal process = new ESLVal(new Function(new ESLVal("process"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            {ESLVal _v21 = s;
                  
                  if(_v21.isCons())
                  {ESLVal $102 = _v21.head();
                    ESLVal $103 = _v21.tail();
                    
                    switch($102.termName) {
                    case "TillService": {ESLVal $113 = $102.termRef(0);
                      ESLVal $112 = $102.termRef(1);
                      ESLVal $111 = $102.termRef(2);
                      ESLVal $110 = $102.termRef(3);
                      
                      switch($110.intVal) {
                      case 0: {ESLVal a = $113;
                        
                        {ESLVal c = $112;
                        
                        {ESLVal till = $111;
                        
                        {ESLVal _v35 = $103;
                        
                        {Lib.send(display,"Sale",c.ref("getId").apply());
                      Lib.send(c,"Leave");
                      Lib.send(getSelf(),"Serve",a);
                      return process.apply(_v35);}
                      }
                      }
                      }
                      }
                      default: {ESLVal a = $113;
                        
                        {ESLVal c = $112;
                        
                        {ESLVal till = $111;
                        
                        {ESLVal n = $110;
                        
                        {ESLVal _v36 = $103;
                        
                        return process.apply(_v36).cons(new ESLVal("TillService",a,c,till,n.sub($one)));
                      }
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillQueue": {ESLVal $109 = $102.termRef(0);
                      ESLVal $108 = $102.termRef(1);
                      ESLVal $107 = $102.termRef(2);
                      
                      switch($107.intVal) {
                      case 0: {ESLVal c = $109;
                        
                        {ESLVal till = $108;
                        
                        {ESLVal _v33 = $103;
                        
                        {Lib.send(c,"TimeOut");
                      return process.apply(_v33);}
                      }
                      }
                      }
                      default: {ESLVal c = $109;
                        
                        {ESLVal till = $108;
                        
                        {ESLVal n = $107;
                        
                        {ESLVal _v34 = $103;
                        
                        return startServe.apply(c,till,n,_v34);
                      }
                      }
                      }
                      }
                    }
                    }
                  case "TillReady": {ESLVal $106 = $102.termRef(0);
                      ESLVal $105 = $102.termRef(1);
                      ESLVal $104 = $102.termRef(2);
                      
                      switch($104.intVal) {
                      case 0: {ESLVal a = $106;
                        
                        {ESLVal till = $105;
                        
                        {ESLVal _v31 = $103;
                        
                        {Lib.send(a,"CompletedTill");
                      return process.apply(_v31);}
                      }
                      }
                      }
                      default: {ESLVal a = $106;
                        
                        {ESLVal till = $105;
                        
                        {ESLVal n = $104;
                        
                        {ESLVal _v32 = $103;
                        
                        return tryToServe.apply(a,till,n,_v32);
                      }
                      }
                      }
                      }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(9921,10849)").add(ESLVal.list(_v21)));
                  }
                  }
                else if(_v21.isNil())
                  return s;
                else return error(new ESLVal("case error at Pos(9921,10849)").add(ESLVal.list(_v21)));
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v22 = $m;
            
            switch(_v22.termName) {
            case "Queue": {ESLVal $115 = _v22.termRef(0);
              
              {ESLVal c = $115;
              
              {ESLVal till = findServicedTill.apply(state);
              
              if(till.less($zero).boolVal)
              {state = state.cons(new ESLVal("TillQueue",c,random.apply(numOfTills),maxWaitTime));
              {{
                ESLVal _v23 = assistants;
                while(_v23.isCons()) {
                  ESLVal a = _v23.headVal;
                  Lib.send(a,"CustomerAtTill");
                  _v23 = _v23.tailVal;}
              }
              return $null;}}
              else
                {state = state.cons(new ESLVal("TillQueue",c,till,maxWaitTime));
                return $null;}
            }
            }
            }
          case "Serve": {ESLVal $114 = _v22.termRef(0);
              
              {ESLVal a = $114;
              
              {ESLVal till = findBusyTill.apply(state);
              
              if(till.less($zero).boolVal)
              return Lib.send(a,"CompletedTill");
              else
                {state = state.cons(new ESLVal("TillReady",a,till,maxIdleTime));
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v22)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v24 = $m;
            
            switch(_v24.termName) {
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v24)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v27 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v27)));
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
                  ESLVal _v26 = $zero.to(numOfCustomers);
                  while(_v26.isCons()) {
                    ESLVal n = _v26.headVal;
                    {customers = customers.cons(newActor(customer,new ESLVal(new Actor()),n));
                    Lib.send(display,"RegisterCustomer",n,new ESLVal("NotInShop"),ESLVal.list(new ESLVal("NotInShop"),new ESLVal("Queueing"),new ESLVal("Browsing"),new ESLVal("SeekingHelp"),new ESLVal("GettingHelp"),new ESLVal("Buying")));}
                    _v26 = _v26.tailVal;}
                }
                {{
                  ESLVal _v25 = $zero.to(numOfAssistants);
                  while(_v25.isCons()) {
                    ESLVal n = _v25.headVal;
                    assistants = assistants.cons(newActor(assistant,new ESLVal(new Actor())));
                    _v25 = _v25.tailVal;}
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