package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Sets {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal power = new ESLVal(new Function(new ESLVal("power"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal mkPower = new ESLVal(new Function(new ESLVal("mkPower"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v15 = $args[0];
          ESLVal _v14 = $args[1];
          {ESLVal _v6 = _v14;
                
                return $ndCase.apply(_v6,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $22 = $args[0];
                ESLVal $23 = $args[1];
                ESLVal $21 = $args[2];
                {ESLVal p = $22;
                      
                      {ESLVal _v16 = $23;
                      
                      return mkPower.apply(add.apply(p,_v15).add(_v15),_v16);
                    }
                    }
                  }
                })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $20 = $args[0];
                return _v15;
                  }
                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return error(new ESLVal("case error at Pos(163,260)").add(ESLVal.list(_v6)));
                  }
                }));
              }
            }
          });
        ESLVal add = new ESLVal(new Function(new ESLVal("add"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          ESLVal sets = $args[1];
          {ESLVal _v5 = sets;
                
                return $ndCase.apply(_v5,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $18 = $args[0];
                ESLVal $19 = $args[1];
                ESLVal $17 = $args[2];
                {ESLVal p = $18;
                      
                      {ESLVal _v13 = $19;
                      
                      return ESLVal.set(ESLVal.set(e).add(p)).add(add.apply(e,_v13));
                    }
                    }
                  }
                })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $16 = $args[0];
                return ESLVal.set();
                  }
                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return error(new ESLVal("case error at Pos(314,417)").add(ESLVal.list(_v5)));
                  }
                }));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "mkPower": return mkPower;
            
            case "add": return add;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal mkPower = letrec.get("mkPower");
      
      ESLVal add = letrec.get("add");
      
        return mkPower.apply(ESLVal.set(ESLVal.set()),s);
      
    }
  });
  public static ESLVal setContains = new ESLVal(new Function(new ESLVal("setContains"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  ESLVal x = $args[1];
  {ESLVal _v4 = s;
        
        return $ndCase.apply(_v4,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $14 = $args[0];
        ESLVal $15 = $args[1];
        ESLVal $13 = $args[2];
        {ESLVal y = $14;
              
              {ESLVal _v12 = $15;
              
              if(x.eql(y).boolVal)
              return $true;
              else
                return $13.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v11 = _v4;
              
              return $false;
            }
          }
        }));
      }
    }
  });
  public static ESLVal setToList = new ESLVal(new Function(new ESLVal("setToList"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v3 = s;
        
        return $ndCase.apply(_v3,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $11 = $args[0];
        ESLVal $12 = $args[1];
        ESLVal $10 = $args[2];
        {ESLVal x = $11;
              
              {ESLVal _v10 = $12;
              
              return setToList.apply(_v10).cons(x);
            }
            }
          }
        })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $9 = $args[0];
        return ESLVal.list();
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(606,677)").add(ESLVal.list(_v3)));
          }
        }));
      }
    }
  });
  public static ESLVal setSize = new ESLVal(new Function(new ESLVal("setSize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v2 = s;
        
        return $ndCase.apply(_v2,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $7 = $args[0];
        ESLVal $8 = $args[1];
        ESLVal $6 = $args[2];
        {ESLVal x = $7;
              
              {ESLVal _v9 = $8;
              
              return $one.add(setSize.apply(_v9));
            }
            }
          }
        })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $5 = $args[0];
        return $zero;
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(710,776)").add(ESLVal.list(_v2)));
          }
        }));
      }
    }
  });
  public static ESLVal subset = new ESLVal(new Function(new ESLVal("subset"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s1 = $args[0];
  ESLVal s2 = $args[1];
  {ESLVal _v1 = s1;
        
        return $ndCase.apply(_v1,ESLVal.list(new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $4 = $args[0];
        return $true;
          }
        })),new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $2 = $args[0];
        ESLVal $3 = $args[1];
        ESLVal $1 = $args[2];
        {ESLVal x = $2;
              
              {ESLVal _v8 = $3;
              
              if(setContains.apply(s2,x).boolVal)
              return subset.apply(_v8,s2);
              else
                return $1.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v7 = _v1;
              
              return $false;
            }
          }
        }));
      }
    }
  });
public static void main(String[] args) {
  }
}