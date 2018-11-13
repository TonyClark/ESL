package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Sets.*;
import java.util.function.Supplier;
public class Test2 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal mkPoint = new ESLVal(new Function(new ESLVal("mkPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return newRecord(new ESLVal[]{new ESLVal("x"),new ESLVal("y")},x,y);
    }
  });
  private static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v7 = s;
        
        return $ndCase.apply(_v7,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $59 = $args[0];
        ESLVal $60 = $args[1];
        ESLVal $58 = $args[2];
        return $ndCase.apply($59,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $62 = $args[0];
              ESLVal $63 = $args[1];
              ESLVal $61 = $args[2];
              return $ndCase.apply($60,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $65 = $args[0];
                    ESLVal $66 = $args[1];
                    ESLVal $64 = $args[2];
                    return $ndCase.apply($65,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $68 = $args[0];
                          ESLVal $69 = $args[1];
                          ESLVal $67 = $args[2];
                          {ESLVal x = $62;
                                
                                {ESLVal rest1 = $63;
                                
                                {ESLVal y = $68;
                                
                                {ESLVal rest2 = $69;
                                
                                {ESLVal rest3 = $66;
                                
                                if(x.add(y).eql(new ESLVal(100)).boolVal)
                                return ESLVal.list(x,y);
                                else
                                  return $67.apply();
                              }
                              }
                              }
                              }
                              }
                            }
                          }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return $64.apply();
                            }
                          }));
                      }
                    }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return $61.apply();
                      }
                    }));
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $58.apply();
                }
              }));
          }
        })),new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $41 = $args[0];
        ESLVal $42 = $args[1];
        ESLVal $40 = $args[2];
        return $ndCase.apply($41,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $44 = $args[0];
              ESLVal $45 = $args[1];
              ESLVal $43 = $args[2];
              return $ndCase.apply($45,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $47 = $args[0];
                    ESLVal $48 = $args[1];
                    ESLVal $46 = $args[2];
                    return $ndCase.apply($42,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $50 = $args[0];
                          ESLVal $51 = $args[1];
                          ESLVal $49 = $args[2];
                          return $ndCase.apply($50,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal $53 = $args[0];
                                ESLVal $54 = $args[1];
                                ESLVal $52 = $args[2];
                                return $ndCase.apply($54,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          ESLVal $56 = $args[0];
                                      ESLVal $57 = $args[1];
                                      ESLVal $55 = $args[2];
                                      {ESLVal x = $44;
                                            
                                            {ESLVal x2 = $47;
                                            
                                            {ESLVal rest1 = $48;
                                            
                                            {ESLVal y = $53;
                                            
                                            {ESLVal y2 = $56;
                                            
                                            {ESLVal rest2 = $57;
                                            
                                            {ESLVal rest3 = $51;
                                            
                                            if(x.add(y).eql(new ESLVal(20)).and(x2.eql(y2)).boolVal)
                                            return ESLVal.list(x,y,x2,y2);
                                            else
                                              return $55.apply();
                                          }
                                          }
                                          }
                                          }
                                          }
                                          }
                                          }
                                        }
                                      }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          return $52.apply();
                                        }
                                      }));
                                  }
                                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    return $49.apply();
                                  }
                                }));
                            }
                          }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return $46.apply();
                            }
                          }));
                      }
                    }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return $43.apply();
                      }
                    }));
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $40.apply();
                }
              }));
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(204,401)").add(ESLVal.list(_v7)));
          }
        }));
      }
    }
  });
  private static ESLVal member = new ESLVal(new Function(new ESLVal("member"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v6 = l;
        
        return $ndCase.apply(_v6,ESLVal.list(new ESLVal("$selectLeft",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $38 = $args[0];
        ESLVal $39 = $args[1];
        ESLVal $37 = $args[2];
        {ESLVal y = $38;
              
              {ESLVal _v19 = $39;
              
              if(x.eql(y).boolVal)
              return $true;
              else
                return $37.apply();
            }
            }
          }
        })),new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $34 = $args[0];
        ESLVal $35 = $args[1];
        ESLVal $36 = $args[2];
        ESLVal $33 = $args[3];
        {ESLVal l1 = $34;
              
              {ESLVal y = $35;
              
              {ESLVal l2 = $36;
              
              if(x.eql(y).boolVal)
              return $true;
              else
                return $33.apply();
            }
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v18 = _v6;
              
              return $false;
            }
          }
        }));
      }
    }
  });
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v13 = $args[0];
  {ESLVal _v5 = _v13;
        
        switch(_v5.termName) {
        case "Branch": {ESLVal $18 = _v5.termRef(0);
          ESLVal $17 = _v5.termRef(1);
          
          switch($18.termName) {
          case "Branch": {ESLVal $20 = $18.termRef(0);
            ESLVal $19 = $18.termRef(1);
            
            switch($20.termName) {
            case "Leaf": {ESLVal $21 = $20.termRef(0);
              
              return $ndCase.apply($21,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $23 = $args[0];
              ESLVal $24 = $args[1];
              ESLVal $22 = $args[2];
              switch($19.termName) {
                    case "Leaf": {ESLVal $25 = $19.termRef(0);
                      
                      return $ndCase.apply($25,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal $27 = $args[0];
                      ESLVal $28 = $args[1];
                      ESLVal $26 = $args[2];
                      switch($17.termName) {
                            case "Leaf": {ESLVal $29 = $17.termRef(0);
                              
                              return $ndCase.apply($29,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  ESLVal $31 = $args[0];
                              ESLVal $32 = $args[1];
                              ESLVal $30 = $args[2];
                              {ESLVal x1 = $23;
                                    
                                    {ESLVal s1 = $24;
                                    
                                    {ESLVal x2 = $27;
                                    
                                    {ESLVal s2 = $28;
                                    
                                    {ESLVal x3 = $31;
                                    
                                    {ESLVal s3 = $32;
                                    
                                    if(x1.eql(x2).and(x2.eql(x3)).boolVal)
                                    return x1;
                                    else
                                      return $30.apply();
                                  }
                                  }
                                  }
                                  }
                                  }
                                  }
                                }
                              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  return $26.apply();
                                }
                              }));
                            }
                            default: return $26.apply();
                          }
                        }
                      }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          return $22.apply();
                        }
                      }));
                    }
                    default: return $22.apply();
                  }
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v14 = _v5;
                    
                    return $zero;
                  }
                }
              }));
            }
            default: {ESLVal _v15 = _v5;
              
              return $zero;
            }
          }
          }
          default: {ESLVal _v16 = _v5;
            
            return $zero;
          }
        }
        }
        default: {ESLVal _v17 = _v5;
          
          return $zero;
        }
      }
      }
    }
  });
  private static ESLVal duplicate = new ESLVal(new Function(new ESLVal("duplicate"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s1 = $args[0];
  ESLVal s2 = $args[1];
  ESLVal notFound = $args[2];
  {ESLVal _v4 = s1;
        ESLVal _v3 = s2;
        
        return $ndCase.apply(_v4,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $12 = $args[0];
        ESLVal $13 = $args[1];
        ESLVal $11 = $args[2];
        return $ndCase.apply(_v3,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $15 = $args[0];
              ESLVal $16 = $args[1];
              ESLVal $14 = $args[2];
              {ESLVal x = $12;
                    
                    {ESLVal p = $13;
                    
                    {ESLVal y = $15;
                    
                    {ESLVal q = $16;
                    
                    if(x.eql(y).boolVal)
                    return x;
                    else
                      return $14.apply();
                  }
                  }
                  }
                  }
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $11.apply();
                }
              }));
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v11 = _v4;
              
              {ESLVal _v12 = _v3;
              
              return notFound;
            }
            }
          }
        }));
      }
    }
  });
  private static ESLVal listMem = new ESLVal(new Function(new ESLVal("listMem"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v2 = l;
        
        return $ndCase.apply(_v2,ESLVal.list(new ESLVal("$selectLeft",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $9 = $args[0];
        ESLVal $10 = $args[1];
        ESLVal $8 = $args[2];
        {ESLVal x = $9;
              
              {ESLVal _v10 = $10;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $8.apply();
            }
            }
          }
        })),new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $5 = $args[0];
        ESLVal $6 = $args[1];
        ESLVal $7 = $args[2];
        ESLVal $4 = $args[3];
        {ESLVal l1 = $5;
              
              {ESLVal x = $6;
              
              {ESLVal l2 = $7;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $4.apply();
            }
            }
            }
          }
        })),new ESLVal("$selectRight",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $2 = $args[0];
        ESLVal $3 = $args[1];
        ESLVal $1 = $args[2];
        {ESLVal _v9 = $2;
              
              {ESLVal x = $3;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $1.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v8 = _v2;
              
              return $false;
            }
          }
        }));
      }
    }
  });
  private static ESLVal t = newTable();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
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
            return ((Supplier<ESLVal>)() -> { 
                {t.ref("put").apply(new ESLVal("one"),$one);
                t.ref("put").apply(new ESLVal("two"),new ESLVal(2));
                t.ref("put").apply(new ESLVal("one"),new ESLVal(3));
                print.apply(member.apply(new ESLVal(10000),$zero.to(new ESLVal(10000))));
                return stopAll.apply();}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}