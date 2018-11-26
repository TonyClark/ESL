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
              ESLVal _v36 = $args[0];
          ESLVal _v35 = $args[1];
          {ESLVal _v27 = _v35;
                
                return $ndCase.apply(_v27,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $87 = $args[0];
                ESLVal $88 = $args[1];
                ESLVal $86 = $args[2];
                {ESLVal p = $87;
                      
                      {ESLVal _v37 = $88;
                      
                      return mkPower.apply(add.apply(p,_v36).add(_v36),_v37);
                    }
                    }
                  }
                })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $85 = $args[0];
                return _v36;
                  }
                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return error(new ESLVal("case error at Pos(163,260)").add(ESLVal.list(_v27)));
                  }
                }));
              }
            }
          });
        ESLVal add = new ESLVal(new Function(new ESLVal("add"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          ESLVal sets = $args[1];
          {ESLVal _v26 = sets;
                
                return $ndCase.apply(_v26,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $83 = $args[0];
                ESLVal $84 = $args[1];
                ESLVal $82 = $args[2];
                {ESLVal p = $83;
                      
                      {ESLVal _v34 = $84;
                      
                      return ESLVal.set(ESLVal.set(e).add(p)).add(add.apply(e,_v34));
                    }
                    }
                  }
                })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $81 = $args[0];
                return ESLVal.set();
                  }
                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    return error(new ESLVal("case error at Pos(314,417)").add(ESLVal.list(_v26)));
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
  {ESLVal _v25 = s;
        
        return $ndCase.apply(_v25,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $79 = $args[0];
        ESLVal $80 = $args[1];
        ESLVal $78 = $args[2];
        {ESLVal y = $79;
              
              {ESLVal _v33 = $80;
              
              if(x.eql(y).boolVal)
              return $true;
              else
                return $78.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v32 = _v25;
              
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
  {ESLVal _v24 = s;
        
        return $ndCase.apply(_v24,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $76 = $args[0];
        ESLVal $77 = $args[1];
        ESLVal $75 = $args[2];
        {ESLVal x = $76;
              
              {ESLVal _v31 = $77;
              
              return setToList.apply(_v31).cons(x);
            }
            }
          }
        })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $74 = $args[0];
        return ESLVal.list();
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(606,677)").add(ESLVal.list(_v24)));
          }
        }));
      }
    }
  });
  public static ESLVal setSize = new ESLVal(new Function(new ESLVal("setSize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v23 = s;
        
        return $ndCase.apply(_v23,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $72 = $args[0];
        ESLVal $73 = $args[1];
        ESLVal $71 = $args[2];
        {ESLVal x = $72;
              
              {ESLVal _v30 = $73;
              
              return $one.add(setSize.apply(_v30));
            }
            }
          }
        })),new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $70 = $args[0];
        return $zero;
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(710,776)").add(ESLVal.list(_v23)));
          }
        }));
      }
    }
  });
  public static ESLVal subset = new ESLVal(new Function(new ESLVal("subset"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s1 = $args[0];
  ESLVal s2 = $args[1];
  {ESLVal _v22 = s1;
        
        return $ndCase.apply(_v22,ESLVal.list(new ESLVal("$empty",new ESLVal(new Function(new ESLVal("emptyset"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $69 = $args[0];
        return $true;
          }
        })),new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $67 = $args[0];
        ESLVal $68 = $args[1];
        ESLVal $66 = $args[2];
        {ESLVal x = $67;
              
              {ESLVal _v29 = $68;
              
              if(setContains.apply(s2,x).boolVal)
              return subset.apply(_v29,s2);
              else
                return $66.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v28 = _v22;
              
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