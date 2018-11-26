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
          {ESLVal _v833 = l;
                
                if(_v833.isCons())
                {ESLVal $1386 = _v833.head();
                  ESLVal $1387 = _v833.tail();
                  
                  switch($1386.intVal) {
                  case 34: {ESLVal _v842 = $1387;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(34)).add(f.apply(_v842));
                  }
                case 10: {ESLVal _v841 = $1387;
                    
                    return ESLVal.list(new ESLVal(92),new ESLVal(110)).add(f.apply(_v841));
                  }
                  default: {ESLVal c = $1386;
                    
                    {ESLVal _v843 = $1387;
                    
                    return f.apply(_v843).cons(c);
                  }
                  }
                }
                }
              else if(_v833.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(251,429)").add(ESLVal.list(_v833)));
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
          {ESLVal _v832 = chars;
                
                if(_v832.isCons())
                {ESLVal $1384 = _v832.head();
                  ESLVal $1385 = _v832.tail();
                  
                  {ESLVal c = $1384;
                  
                  {ESLVal _v838 = $1385;
                  
                  if(c.eql(change).boolVal)
                  return insert.ref("explode").add(replace.apply(_v838));
                  else
                    {ESLVal _v839 = $1384;
                      
                      {ESLVal _v840 = $1385;
                      
                      return replace.apply(_v840).cons(_v839);
                    }
                    }
                }
                }
                }
              else if(_v832.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(560,738)").add(ESLVal.list(_v832)));
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
          {ESLVal _v831 = l;
                
                if(_v831.isCons())
                {ESLVal $1382 = _v831.head();
                  ESLVal $1383 = _v831.tail();
                  
                  {ESLVal h = $1382;
                  
                  {ESLVal t = $1383;
                  
                  return t;
                }
                }
                }
              else if(_v831.isNil())
                return l;
              else return error(new ESLVal("case error at Pos(890,936)").add(ESLVal.list(_v831)));
              }
            }
          });
        ESLVal splitter = new ESLVal(new Function(new ESLVal("splitter"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal chars = $args[0];
          {ESLVal _v830 = chars;
                
                if(_v830.isCons())
                {ESLVal $1380 = _v830.head();
                  ESLVal $1381 = _v830.tail();
                  
                  {ESLVal _v836 = _v830;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v836))).cons(takeWhile.apply(isNotChar,_v836).ref("implode"));
                }
                }
              else if(_v830.isNil())
                return $nil;
              else {ESLVal _v837 = _v830;
                  
                  return splitter.apply(maybeDropOne.apply(dropWhile.apply(isNotChar,_v837))).cons(takeWhile.apply(isNotChar,_v837).ref("implode"));
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
  {ESLVal _v829 = ss;
        
        if(_v829.isCons())
        {ESLVal $1376 = _v829.head();
          ESLVal $1377 = _v829.tail();
          
          if($1377.isCons())
          {ESLVal $1378 = $1377.head();
            ESLVal $1379 = $1377.tail();
            
            {ESLVal s = $1376;
            
            {ESLVal _v834 = $1377;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v834)));
          }
          }
          }
        else if($1377.isNil())
          {ESLVal s = $1376;
            
            return s;
          }
        else {ESLVal s = $1376;
            
            {ESLVal _v835 = $1377;
            
            return s.add(ESLVal.list(c).ref("implode").add(joinBy.apply(c,_v835)));
          }
          }
        }
      else if(_v829.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(1223,1330)").add(ESLVal.list(_v829)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v828 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v828)));
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