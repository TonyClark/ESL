package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Strings {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal pathSeparator = new ESLVal(47);
  public static ESLVal javaString = new ESLVal(new Function(new ESLVal("javaString"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal l = $args[0];
          {ESLVal _v6 = l;
                
                if(_v6.isCons())
                {ESLVal $11 = _v6.head();
                  ESLVal $12 = _v6.tail();
                  
                  switch($11.intVal) {
                  case 34: {ESLVal _v15 = $12;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(34)).add(f.apply(_v15));
                  }
                case 10: {ESLVal _v14 = $12;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(110)).add(f.apply(_v14));
                  }
                  default: {ESLVal c = $11;
                    
                    {ESLVal _v16 = $12;
                    
                    return f.apply(_v16).cons(c);
                  }
                  }
                }
                }
              else if(_v6.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(251,429)"));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "f": return f;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal f = letrec.get("f");
      
        return f.apply(s.ref("explode")).ref("implode");
      
    }
  });
  public static ESLVal replaceChar = new ESLVal(new Function(new ESLVal("replaceChar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  ESLVal change = $args[1];
  ESLVal insert = $args[2];
  LetRec letrec = new LetRec() {
        ESLVal replace = new ESLVal(new Function(new ESLVal("replace"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          {ESLVal _v5 = chars;
                
                if(_v5.isCons())
                {ESLVal $9 = _v5.head();
                  ESLVal $10 = _v5.tail();
                  
                  {ESLVal c = $9;
                  
                  {ESLVal _v11 = $10;
                  
                  if(c.eql(change).boolVal)
                  return insert.ref("explode").add(replace.apply(_v11));
                  else
                    {ESLVal _v12 = $9;
                      
                      {ESLVal _v13 = $10;
                      
                      return replace.apply(_v13).cons(_v12);
                    }
                    }
                }
                }
                }
              else if(_v5.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(560,738)"));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "replace": return replace;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal replace = letrec.get("replace");
      
        return replace.apply(s.ref("explode")).ref("implode");
      
    }
  });
  public static ESLVal splitBy = new ESLVal(new Function(new ESLVal("splitBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal s = $args[1];
  LetRec letrec = new LetRec() {
        ESLVal isNotChar = new ESLVal(new Function(new ESLVal("isNotChar"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal i = $args[0];
          return c.neql(i);
            }
          });
        ESLVal maybeDropOne = new ESLVal(new Function(new ESLVal("maybeDropOne"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal l = $args[0];
          {ESLVal _v4 = l;
                
                if(_v4.isCons())
                {ESLVal $7 = _v4.head();
                  ESLVal $8 = _v4.tail();
                  
                  {ESLVal h = $7;
                  
                  {ESLVal t = $8;
                  
                  return t;
                }
                }
                }
              else if(_v4.isNil())
                return l;
              else return error(new ESLVal("case error at Pos(890,936)"));
              }
            }
          });
        ESLVal splitter = new ESLVal(new Function(new ESLVal("splitter"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          {ESLVal _v3 = chars;
                
                if(_v3.isCons())
                {ESLVal $5 = _v3.head();
                  ESLVal $6 = _v3.tail();
                  
                  {ESLVal _v9 = _v3;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v9))).cons(takeWhile.apply(isNotChar,_v9).ref("implode"));
                }
                }
              else if(_v3.isNil())
                return $nil;
              else {ESLVal _v10 = _v3;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v10))).cons(takeWhile.apply(isNotChar,_v10).ref("implode"));
                }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "isNotChar": return isNotChar;
            
            case "maybeDropOne": return maybeDropOne;
            
            case "splitter": return splitter;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal isNotChar = letrec.get("isNotChar");
      
      ESLVal maybeDropOne = letrec.get("maybeDropOne");
      
      ESLVal splitter = letrec.get("splitter");
      
        return splitter.apply(s.ref("explode"));
      
    }
  });
  public static ESLVal joinBy = new ESLVal(new Function(new ESLVal("joinBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal ss = $args[1];
  {ESLVal _v2 = ss;
        
        if(_v2.isCons())
        {ESLVal $1 = _v2.head();
          ESLVal $2 = _v2.tail();
          
          if($2.isCons())
          {ESLVal $3 = $2.head();
            ESLVal $4 = $2.tail();
            
            {ESLVal s = $1;
            
            {ESLVal _v7 = $2;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v7)));
          }
          }
          }
        else if($2.isNil())
          {ESLVal s = $1;
            
            return s;
          }
        else {ESLVal s = $1;
            
            {ESLVal _v8 = $2;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v8)));
          }
          }
        }
      else if(_v2.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(1223,1330)"));
      }
    }
  });
  private static ESLVal isLower = new ESLVal(new Function(new ESLVal("isLower"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  return c.eql(new ESLVal(97)).or(c.gre(new ESLVal(97))).and(c.eql(new ESLVal(122)).or(c.less(new ESLVal(122))));
    }
  });
  private static ESLVal upcase = new ESLVal(new Function(new ESLVal("upcase"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  if(isLower.apply(c).boolVal)
        return c.sub(new ESLVal(97)).add(new ESLVal(65));
        else
          return c;
    }
  });
  private static ESLVal upcaseInitial = new ESLVal(new Function(new ESLVal("upcaseInitial"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  return ESLVal.list(upcase.apply(head.apply(s.ref("explode")))).add(tail.apply(s.ref("explode"))).ref("implode");
    }
  });
  public static ESLVal toPath = new ESLVal(new Function(new ESLVal("toPath"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  return splitBy.apply(pathSeparator,p);
    }
  });
  public static ESLVal pathToJavaPackage = new ESLVal(new Function(new ESLVal("pathToJavaPackage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal names = butlast.apply(p);
        
        return joinBy.apply(new ESLVal(46),names);
      }
    }
  });
  public static ESLVal pathToJavaClassName = new ESLVal(new Function(new ESLVal("pathToJavaClassName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal name = head.apply(splitBy.apply(new ESLVal(46),last.apply(p)));
        
        return upcaseInitial.apply(name);
      }
    }
  });
  private static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {print.apply(new ESLVal("\"spam\" plap\nplop"));
            print.apply(replaceChar.apply(new ESLVal("start\"plap\"end"),new ESLVal(34),new ESLVal("\"")));
            stopAll.apply();}
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
public static void main(String[] args) {
  }
}