package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
public class Strings {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal pathSeparator = new ESLVal(47);
  private static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v1033 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1033)));
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
            print.apply(replaceChar(new ESLVal("start\"plap\"end"),new ESLVal(34),new ESLVal("\"")));
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
public static ESLVal javaString(ESLVal s) {
    
    { LetRec letrec = new LetRec() {
      ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal l = $args[0];
        {ESLVal _v1028 = l;
              
              if(_v1028.isCons())
              {ESLVal $1497 = _v1028.head();
                ESLVal $1498 = _v1028.tail();
                
                switch($1497.intVal) {
                case 34: {ESLVal _v1042 = $1498;
                  
                  return ESLVal.list(new ESLVal(92),new ESLVal(34)).add(f.apply(_v1042));
                }
              case 10: {ESLVal _v1041 = $1498;
                  
                  return ESLVal.list(new ESLVal(92),new ESLVal(110)).add(f.apply(_v1041));
                }
                default: {ESLVal c = $1497;
                  
                  {ESLVal _v1043 = $1498;
                  
                  return f.apply(_v1043).cons(c);
                }
                }
              }
              }
            else if(_v1028.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(251,429)").add(ESLVal.list(_v1028)));
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
  public static ESLVal javaString = new ESLVal(new Function(new ESLVal("javaString"),null) { public ESLVal apply(ESLVal... args) { return javaString(args[0]); }});
  public static ESLVal replaceChar(ESLVal s,ESLVal change,ESLVal insert) {
    
    { LetRec letrec = new LetRec() {
      ESLVal replace = new ESLVal(new Function(new ESLVal("replace"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal chars = $args[0];
        {ESLVal _v1029 = chars;
              
              if(_v1029.isCons())
              {ESLVal $1499 = _v1029.head();
                ESLVal $1500 = _v1029.tail();
                
                {ESLVal c = $1499;
                
                {ESLVal _v1038 = $1500;
                
                if(c.eql(change).boolVal)
                return insert.ref("explode").add(replace.apply(_v1038));
                else
                  {ESLVal _v1039 = $1499;
                    
                    {ESLVal _v1040 = $1500;
                    
                    return replace.apply(_v1040).cons(_v1039);
                  }
                  }
              }
              }
              }
            else if(_v1029.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(560,738)").add(ESLVal.list(_v1029)));
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
  public static ESLVal replaceChar = new ESLVal(new Function(new ESLVal("replaceChar"),null) { public ESLVal apply(ESLVal... args) { return replaceChar(args[0],args[1],args[2]); }});
  public static ESLVal splitBy(ESLVal c,ESLVal s) {
    
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
        {ESLVal _v1030 = l;
              
              if(_v1030.isCons())
              {ESLVal $1501 = _v1030.head();
                ESLVal $1502 = _v1030.tail();
                
                {ESLVal h = $1501;
                
                {ESLVal t = $1502;
                
                return t;
              }
              }
              }
            else if(_v1030.isNil())
              return l;
            else return error(new ESLVal("case error at Pos(890,936)").add(ESLVal.list(_v1030)));
            }
          }
        });
      ESLVal splitter = new ESLVal(new Function(new ESLVal("splitter"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal chars = $args[0];
        {ESLVal _v1031 = chars;
              
              if(_v1031.isCons())
              {ESLVal $1503 = _v1031.head();
                ESLVal $1504 = _v1031.tail();
                
                {ESLVal _v1036 = _v1031;
                
                return splitter.apply(maybeDropOne.apply(dropWhile(isNotChar,_v1036))).cons(takeWhile(isNotChar,_v1036).ref("implode"));
              }
              }
            else if(_v1031.isNil())
              return $nil;
            else {ESLVal _v1037 = _v1031;
                
                return splitter.apply(maybeDropOne.apply(dropWhile(isNotChar,_v1037))).cons(takeWhile(isNotChar,_v1037).ref("implode"));
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
  public static ESLVal splitBy = new ESLVal(new Function(new ESLVal("splitBy"),null) { public ESLVal apply(ESLVal... args) { return splitBy(args[0],args[1]); }});
  public static ESLVal joinBy(ESLVal c,ESLVal ss) {
    
    {ESLVal _v1032 = ss;
      
      if(_v1032.isCons())
      {ESLVal $1505 = _v1032.head();
        ESLVal $1506 = _v1032.tail();
        
        if($1506.isCons())
        {ESLVal $1507 = $1506.head();
          ESLVal $1508 = $1506.tail();
          
          {ESLVal s = $1505;
          
          {ESLVal _v1034 = $1506;
          
          return s.add(ESLVal.list(c).ref("implode").add(joinBy(c,_v1034)));
        }
        }
        }
      else if($1506.isNil())
        {ESLVal s = $1505;
          
          return s;
        }
      else {ESLVal s = $1505;
          
          {ESLVal _v1035 = $1506;
          
          return s.add(ESLVal.list(c).ref("implode").add(joinBy(c,_v1035)));
        }
        }
      }
    else if(_v1032.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(1223,1330)").add(ESLVal.list(_v1032)));
    }
  }
  public static ESLVal joinBy = new ESLVal(new Function(new ESLVal("joinBy"),null) { public ESLVal apply(ESLVal... args) { return joinBy(args[0],args[1]); }});
  private static ESLVal isLower(ESLVal c) {
    
    return c.eql(new ESLVal(97)).or(c.gre(new ESLVal(97))).and(c.eql(new ESLVal(122)).or(c.less(new ESLVal(122))));
  }
  private static ESLVal isLower = new ESLVal(new Function(new ESLVal("isLower"),null) { public ESLVal apply(ESLVal... args) { return isLower(args[0]); }});
  private static ESLVal upcase(ESLVal c) {
    
    if(isLower(c).boolVal)
      return c.sub(new ESLVal(97)).add(new ESLVal(65));
      else
        return c;
  }
  private static ESLVal upcase = new ESLVal(new Function(new ESLVal("upcase"),null) { public ESLVal apply(ESLVal... args) { return upcase(args[0]); }});
  private static ESLVal upcaseInitial(ESLVal s) {
    
    return ESLVal.list(upcase(head.apply(s.ref("explode")))).add(tail.apply(s.ref("explode"))).ref("implode");
  }
  private static ESLVal upcaseInitial = new ESLVal(new Function(new ESLVal("upcaseInitial"),null) { public ESLVal apply(ESLVal... args) { return upcaseInitial(args[0]); }});
  public static ESLVal toPath(ESLVal p) {
    
    return splitBy(pathSeparator,p);
  }
  public static ESLVal toPath = new ESLVal(new Function(new ESLVal("toPath"),null) { public ESLVal apply(ESLVal... args) { return toPath(args[0]); }});
  public static ESLVal pathToJavaPackage(ESLVal p) {
    
    {ESLVal names = butlast.apply(p);
      
      return joinBy(new ESLVal(46),names);
    }
  }
  public static ESLVal pathToJavaPackage = new ESLVal(new Function(new ESLVal("pathToJavaPackage"),null) { public ESLVal apply(ESLVal... args) { return pathToJavaPackage(args[0]); }});
  public static ESLVal pathToJavaClassName(ESLVal p) {
    
    {ESLVal name = head.apply(splitBy(new ESLVal(46),last.apply(p)));
      
      return upcaseInitial(name);
    }
  }
  public static ESLVal pathToJavaClassName = new ESLVal(new Function(new ESLVal("pathToJavaClassName"),null) { public ESLVal apply(ESLVal... args) { return pathToJavaClassName(args[0]); }});
public static void main(String[] args) {
  }
}