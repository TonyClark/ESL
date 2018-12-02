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
  { LetRec letrec = new LetRec() {
        ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal l = $args[0];
          {ESLVal _v795 = l;
                
                if(_v795.isCons())
                {ESLVal $1376 = _v795.head();
                  ESLVal $1377 = _v795.tail();
                  
                  switch($1376.intVal) {
                  case 34: {ESLVal _v809 = $1377;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(34)).add(f.apply(_v809));
                  }
                case 10: {ESLVal _v808 = $1377;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(110)).add(f.apply(_v808));
                  }
                  default: {ESLVal c = $1376;
                    
                    {ESLVal _v810 = $1377;
                    
                    return f.apply(_v810).cons(c);
                  }
                  }
                }
                }
              else if(_v795.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(251,429)").add(ESLVal.list(_v795)));
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
      
        return f.apply(s.ref("explode")).ref("implode");}
      
    }
  });
  public static ESLVal replaceChar = new ESLVal(new Function(new ESLVal("replaceChar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  ESLVal change = $args[1];
  ESLVal insert = $args[2];
  { LetRec letrec = new LetRec() {
        ESLVal replace = new ESLVal(new Function(new ESLVal("replace"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          {ESLVal _v796 = chars;
                
                if(_v796.isCons())
                {ESLVal $1378 = _v796.head();
                  ESLVal $1379 = _v796.tail();
                  
                  {ESLVal c = $1378;
                  
                  {ESLVal _v805 = $1379;
                  
                  if(c.eql(change).boolVal)
                  return insert.ref("explode").add(replace.apply(_v805));
                  else
                    {ESLVal _v806 = $1378;
                      
                      {ESLVal _v807 = $1379;
                      
                      return replace.apply(_v807).cons(_v806);
                    }
                    }
                }
                }
                }
              else if(_v796.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(560,738)").add(ESLVal.list(_v796)));
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
      
        return replace.apply(s.ref("explode")).ref("implode");}
      
    }
  });
  public static ESLVal splitBy = new ESLVal(new Function(new ESLVal("splitBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal s = $args[1];
  { LetRec letrec = new LetRec() {
        ESLVal isNotChar = new ESLVal(new Function(new ESLVal("isNotChar"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal i = $args[0];
          return c.neql(i);
            }
          });
        ESLVal maybeDropOne = new ESLVal(new Function(new ESLVal("maybeDropOne"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal l = $args[0];
          {ESLVal _v797 = l;
                
                if(_v797.isCons())
                {ESLVal $1380 = _v797.head();
                  ESLVal $1381 = _v797.tail();
                  
                  {ESLVal h = $1380;
                  
                  {ESLVal t = $1381;
                  
                  return t;
                }
                }
                }
              else if(_v797.isNil())
                return l;
              else return error(new ESLVal("case error at Pos(890,936)").add(ESLVal.list(_v797)));
              }
            }
          });
        ESLVal splitter = new ESLVal(new Function(new ESLVal("splitter"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          {ESLVal _v798 = chars;
                
                if(_v798.isCons())
                {ESLVal $1382 = _v798.head();
                  ESLVal $1383 = _v798.tail();
                  
                  {ESLVal _v803 = _v798;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v803))).cons(takeWhile.apply(isNotChar,_v803).ref("implode"));
                }
                }
              else if(_v798.isNil())
                return $nil;
              else {ESLVal _v804 = _v798;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v804))).cons(takeWhile.apply(isNotChar,_v804).ref("implode"));
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
      
        return splitter.apply(s.ref("explode"));}
      
    }
  });
  public static ESLVal joinBy = new ESLVal(new Function(new ESLVal("joinBy"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal ss = $args[1];
  {ESLVal _v799 = ss;
        
        if(_v799.isCons())
        {ESLVal $1384 = _v799.head();
          ESLVal $1385 = _v799.tail();
          
          if($1385.isCons())
          {ESLVal $1386 = $1385.head();
            ESLVal $1387 = $1385.tail();
            
            {ESLVal s = $1384;
            
            {ESLVal _v801 = $1385;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v801)));
          }
          }
          }
        else if($1385.isNil())
          {ESLVal s = $1384;
            
            return s;
          }
        else {ESLVal s = $1384;
            
            {ESLVal _v802 = $1385;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v802)));
          }
          }
        }
      else if(_v799.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(1223,1330)").add(ESLVal.list(_v799)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v800 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v800)));
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