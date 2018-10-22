package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.Tables.*;
import java.util.function.Supplier;
public class TypeCheck {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v160 = p;
        
        switch(_v160.termName) {
        case "PVar": {ESLVal $998 = _v160.termRef(0);
          ESLVal $997 = _v160.termRef(1);
          ESLVal $996 = _v160.termRef(2);
          
          {ESLVal l = $998;
          
          {ESLVal n = $997;
          
          {ESLVal t = $996;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $993 = _v160.termRef(0);
          ESLVal $992 = _v160.termRef(1);
          ESLVal $991 = _v160.termRef(2);
          ESLVal $990 = _v160.termRef(3);
          
          if($991.isCons())
          {ESLVal $994 = $991.head();
            ESLVal $995 = $991.tail();
            
            {ESLVal l = $993;
            
            {ESLVal n = $992;
            
            {ESLVal ts = $991;
            
            {ESLVal ps = $990;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
          }
        else if($991.isNil())
          {ESLVal l = $993;
            
            {ESLVal n = $992;
            
            {ESLVal ps = $990;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $993;
            
            {ESLVal n = $992;
            
            {ESLVal ts = $991;
            
            {ESLVal ps = $990;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $989 = _v160.termRef(0);
          ESLVal $988 = _v160.termRef(1);
          ESLVal $987 = _v160.termRef(2);
          
          {ESLVal l = $989;
          
          {ESLVal _v1294 = $988;
          
          {ESLVal ts = $987;
          
          return ppPattern.apply(_v1294).add(ppTypes.apply(ts,ESLVal.list()));
        }
        }
        }
        }
      case "PNil": {ESLVal $986 = _v160.termRef(0);
          
          {ESLVal l = $986;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $985 = _v160.termRef(0);
          ESLVal $984 = _v160.termRef(1);
          
          {ESLVal l = $985;
          
          {ESLVal n = $984;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $983 = _v160.termRef(0);
          ESLVal $982 = _v160.termRef(1);
          
          {ESLVal l = $983;
          
          {ESLVal b = $982;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $981 = _v160.termRef(0);
          ESLVal $980 = _v160.termRef(1);
          
          {ESLVal l = $981;
          
          {ESLVal s = $980;
          
          return s;
        }
        }
        }
      case "PCons": {ESLVal $979 = _v160.termRef(0);
          ESLVal $978 = _v160.termRef(1);
          ESLVal $977 = _v160.termRef(2);
          
          {ESLVal l = $979;
          
          {ESLVal h = $978;
          
          {ESLVal t = $977;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v1295 = _v160;
          
          return new ESLVal("<unknown: ").add(_v1295.add(new ESLVal(">")));
        }
      }
      }
    }
  });
  private static ESLVal ppPatterns = new ESLVal(new Function(new ESLVal("ppPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ps = $args[0];
  return map.apply(ppPattern,ps);
    }
  });
  private static ESLVal p0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal contentType = new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("RawText"),ESLVal.list(new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("ESLSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("JavaSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0)))));
  private static ESLVal editMessage = new ESLVal("MessageType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Edit"),ESLVal.list(contentType))));
  private static ESLVal env0 = ESLVal.list(new ESLVal("Map",new ESLVal("edb"),new ESLVal("ActType",p0,ESLVal.list(new ESLVal("Dec",p0,new ESLVal("button"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("VoidType",p0)),$null),new ESLVal("Dec",p0,new ESLVal("display"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VarType",p0,new ESLVal("T")))),$null)),ESLVal.list(editMessage))),new ESLVal("Map",new ESLVal("kill"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("print"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("parse"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))),new ESLVal("Map",new ESLVal("random"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("IntType",p0))),new ESLVal("Map",new ESLVal("wait"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("stopAll"),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("builtin"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("IntType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))));
  private static ESLVal cnstrEnv0 = ESLVal.list(new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))));
  private static ESLVal tenv0 = ESLVal.list(new ESLVal("Map",new ESLVal("EditType"),contentType),new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))),new ESLVal("Map",new ESLVal("Point"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Point"),ESLVal.list(new ESLVal("IntType",p0),new ESLVal("IntType",p0)))))));
  private static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v158 = env;
        while(_v158.isCons()) {
          ESLVal _v157 = _v158.headVal;
          {ESLVal _v156 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v159 = _v157;
                    
                    switch(_v159.termName) {
                    case "Map": {ESLVal $976 = _v159.termRef(0);
                      ESLVal $975 = _v159.termRef(1);
                      
                      {ESLVal n = $976;
                      
                      {ESLVal t = $975;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t,env).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v159;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v156.apply();
          }
          _v158 = _v158.tailVal;}
      }
      return s[0].add(new ESLVal("]"));}
      }
    }
  });
  private static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  ESLVal env = $args[1];
  return map.apply(ppType0.apply(env),ts);
    }
  });
  private static ESLVal getTypeName = new ESLVal(new Function(new ESLVal("getTypeName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t0 = $args[0];
  ESLVal env = $args[1];
  {ESLVal[] name = new ESLVal[]{$null};
        
        {{
        ESLVal _v154 = env;
        while(_v154.isCons()) {
          ESLVal _v153 = _v154.headVal;
          {ESLVal _v152 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v155 = _v153;
                    
                    switch(_v155.termName) {
                    case "Map": {ESLVal $974 = _v155.termRef(0);
                      ESLVal $973 = _v155.termRef(1);
                      
                      {ESLVal n = $974;
                      
                      {ESLVal t = $973;
                      
                      if(typeEqual.apply(t0,t).boolVal)
                      {name[0] = n;
                      return $null;}
                      else
                        return $null;
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v155;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v152.apply();
          }
          _v154 = _v154.tailVal;}
      }
      return name[0];}
      }
    }
  });
  private static ESLVal ppType0 = new ESLVal(new Function(new ESLVal("ppType0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  return new ESLVal(new Function(new ESLVal("fun354"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return ppType.apply(t,env);
          }
        });
    }
  });
  private static ESLVal ppHandlers = new ESLVal(new Function(new ESLVal("ppHandlers"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal handlers = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v151 = handlers;
        
        if(_v151.isCons())
        {ESLVal $967 = _v151.head();
          ESLVal $968 = _v151.tail();
          
          switch($967.termName) {
          case "MessageType": {ESLVal $970 = $967.termRef(0);
            ESLVal $969 = $967.termRef(1);
            
            if($969.isCons())
            {ESLVal $971 = $969.head();
              ESLVal $972 = $969.tail();
              
              {ESLVal l = $970;
              
              {ESLVal t = $971;
              
              {ESLVal ts = $972;
              
              {ESLVal hs = $968;
              
              return ppType.apply(t,env).add(new ESLVal("; ").add(ppHandlers.apply(hs,env)));
            }
            }
            }
            }
            }
          else if($969.isNil())
            return error(new ESLVal("case error at Pos(4902,5036)"));
          else return error(new ESLVal("case error at Pos(4902,5036)"));
          }
          default: return error(new ESLVal("case error at Pos(4902,5036)"));
        }
        }
      else if(_v151.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(4902,5036)"));
      }
    }
  });
  private static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal env = $args[1];
  if(getTypeName.apply(t,env).neql($null).boolVal)
        return getTypeName.apply(t,env);
        else
          {ESLVal _v150 = t;
            
            switch(_v150.termName) {
            case "ActType": {ESLVal $966 = _v150.termRef(0);
              ESLVal $965 = _v150.termRef(1);
              ESLVal $964 = _v150.termRef(2);
              
              {ESLVal l = $966;
              
              {ESLVal decs = $965;
              
              {ESLVal handlers = $964;
              
              return new ESLVal("Act{ ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")));
            }
            }
            }
            }
          case "ApplyType": {ESLVal $963 = _v150.termRef(0);
              ESLVal $962 = _v150.termRef(1);
              ESLVal $961 = _v150.termRef(2);
              
              {ESLVal l = $963;
              
              {ESLVal n = $962;
              
              {ESLVal args = $961;
              
              return n.add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ApplyTypeFun": {ESLVal $960 = _v150.termRef(0);
              ESLVal $959 = _v150.termRef(1);
              ESLVal $958 = _v150.termRef(2);
              
              {ESLVal l = $960;
              
              {ESLVal op = $959;
              
              {ESLVal args = $958;
              
              return ppType.apply(op,env).add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ArrayType": {ESLVal $957 = _v150.termRef(0);
              ESLVal $956 = _v150.termRef(1);
              
              {ESLVal l = $957;
              
              {ESLVal _v1293 = $956;
              
              return new ESLVal("Array[").add(ppType.apply(_v1293,env).add(new ESLVal("]")));
            }
            }
            }
          case "BoolType": {ESLVal $955 = _v150.termRef(0);
              
              {ESLVal l = $955;
              
              return new ESLVal("Bool");
            }
            }
          case "FloatType": {ESLVal $954 = _v150.termRef(0);
              
              {ESLVal l = $954;
              
              return new ESLVal("Float");
            }
            }
          case "FieldType": {ESLVal $953 = _v150.termRef(0);
              ESLVal $952 = _v150.termRef(1);
              ESLVal $951 = _v150.termRef(2);
              
              {ESLVal l = $953;
              
              {ESLVal n = $952;
              
              {ESLVal _v1292 = $951;
              
              return n.add(new ESLVal("::").add(ppType.apply(_v1292,env)));
            }
            }
            }
            }
          case "ForallType": {ESLVal $950 = _v150.termRef(0);
              ESLVal $949 = _v150.termRef(1);
              ESLVal $948 = _v150.termRef(2);
              
              {ESLVal l = $950;
              
              {ESLVal ns = $949;
              
              {ESLVal _v1291 = $948;
              
              return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v1291,env))));
            }
            }
            }
            }
          case "FunType": {ESLVal $947 = _v150.termRef(0);
              ESLVal $946 = _v150.termRef(1);
              ESLVal $945 = _v150.termRef(2);
              
              {ESLVal l = $947;
              
              {ESLVal d = $946;
              
              {ESLVal r = $945;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
          case "TaggedFunType": {ESLVal $944 = _v150.termRef(0);
              ESLVal $943 = _v150.termRef(1);
              ESLVal $942 = _v150.termRef(2);
              ESLVal $941 = _v150.termRef(3);
              
              {ESLVal l = $944;
              
              {ESLVal d = $943;
              
              {ESLVal p = $942;
              
              {ESLVal r = $941;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
            }
          case "IntType": {ESLVal $940 = _v150.termRef(0);
              
              {ESLVal l = $940;
              
              return new ESLVal("Int");
            }
            }
          case "ListType": {ESLVal $939 = _v150.termRef(0);
              ESLVal $938 = _v150.termRef(1);
              
              {ESLVal l = $939;
              
              {ESLVal _v1290 = $938;
              
              return new ESLVal("[").add(ppType.apply(_v1290,env).add(new ESLVal("]")));
            }
            }
            }
          case "NullType": {ESLVal $937 = _v150.termRef(0);
              
              {ESLVal l = $937;
              
              return new ESLVal("Null");
            }
            }
          case "RecType": {ESLVal $936 = _v150.termRef(0);
              ESLVal $935 = _v150.termRef(1);
              ESLVal $934 = _v150.termRef(2);
              
              {ESLVal l = $936;
              
              {ESLVal n = $935;
              
              {ESLVal _v1289 = $934;
              
              return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v1289,env))));
            }
            }
            }
            }
          case "RecordType": {ESLVal $933 = _v150.termRef(0);
              ESLVal $932 = _v150.termRef(1);
              
              {ESLVal l = $933;
              
              {ESLVal fs = $932;
              
              return new ESLVal("{").add(ppTypes.apply(fs,env).add(new ESLVal("}")));
            }
            }
            }
          case "StrType": {ESLVal $931 = _v150.termRef(0);
              
              {ESLVal l = $931;
              
              return new ESLVal("Str");
            }
            }
          case "TermType": {ESLVal $930 = _v150.termRef(0);
              ESLVal $929 = _v150.termRef(1);
              ESLVal $928 = _v150.termRef(2);
              
              {ESLVal l = $930;
              
              {ESLVal n = $929;
              
              {ESLVal ts = $928;
              
              return n.add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
            }
          case "TypeFun": {ESLVal $927 = _v150.termRef(0);
              ESLVal $926 = _v150.termRef(1);
              ESLVal $925 = _v150.termRef(2);
              
              {ESLVal l = $927;
              
              {ESLVal ns = $926;
              
              {ESLVal _v1288 = $925;
              
              return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v1288,env))));
            }
            }
            }
            }
          case "UnfoldType": {ESLVal $924 = _v150.termRef(0);
              ESLVal $923 = _v150.termRef(1);
              
              {ESLVal l = $924;
              
              {ESLVal _v1287 = $923;
              
              return new ESLVal("unfold ").add(ppType.apply(_v1287,env));
            }
            }
            }
          case "UnionType": {ESLVal $922 = _v150.termRef(0);
              ESLVal $921 = _v150.termRef(1);
              
              {ESLVal l = $922;
              
              {ESLVal ts = $921;
              
              return new ESLVal("union ").add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
          case "VarType": {ESLVal $920 = _v150.termRef(0);
              ESLVal $919 = _v150.termRef(1);
              
              {ESLVal l = $920;
              
              {ESLVal n = $919;
              
              return n;
            }
            }
            }
          case "VoidType": {ESLVal $918 = _v150.termRef(0);
              
              {ESLVal l = $918;
              
              return new ESLVal("Void");
            }
            }
          case "UnionRef": {ESLVal $917 = _v150.termRef(0);
              ESLVal $916 = _v150.termRef(1);
              ESLVal $915 = _v150.termRef(2);
              
              {ESLVal l = $917;
              
              {ESLVal _v1286 = $916;
              
              {ESLVal n = $915;
              
              return ppType.apply(_v1286,env).add(new ESLVal(".").add(n));
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $914 = _v150.termRef(0);
              
              {ESLVal f = $914;
              
              return f.add(new ESLVal(""));
            }
            }
            default: {ESLVal x = _v150;
              
              return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
            }
          }
          }
    }
  });
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v149 = defs;
        
        if(_v149.isCons())
        {ESLVal $904 = _v149.head();
          ESLVal $905 = _v149.tail();
          
          switch($904.termName) {
          case "TypeBind": {ESLVal $913 = $904.termRef(0);
            ESLVal $912 = $904.termRef(1);
            ESLVal $911 = $904.termRef(2);
            ESLVal $910 = $904.termRef(3);
            
            {ESLVal l = $913;
            
            {ESLVal n = $912;
            
            {ESLVal t = $911;
            
            {ESLVal e = $910;
            
            {ESLVal ds = $905;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $909 = $904.termRef(0);
            ESLVal $908 = $904.termRef(1);
            ESLVal $907 = $904.termRef(2);
            ESLVal $906 = $904.termRef(3);
            
            {ESLVal l = $909;
            
            {ESLVal n = $908;
            
            {ESLVal t = $907;
            
            {ESLVal e = $906;
            
            {ESLVal ds = $905;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $904;
            
            {ESLVal ds = $905;
            
            return typeEnv.apply(ds);
          }
          }
        }
        }
      else if(_v149.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6745,6988)"));
      }
    }
  });
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v148 = defs;
        
        if(_v148.isCons())
        {ESLVal $887 = _v148.head();
          ESLVal $888 = _v148.tail();
          
          switch($887.termName) {
          case "TypeBind": {ESLVal $896 = $887.termRef(0);
            ESLVal $895 = $887.termRef(1);
            ESLVal $894 = $887.termRef(2);
            ESLVal $893 = $887.termRef(3);
            
            switch($894.termName) {
            case "RecType": {ESLVal $901 = $894.termRef(0);
              ESLVal $900 = $894.termRef(1);
              ESLVal $899 = $894.termRef(2);
              
              switch($899.termName) {
              case "UnionType": {ESLVal $903 = $899.termRef(0);
                ESLVal $902 = $899.termRef(1);
                
                {ESLVal l = $896;
                
                {ESLVal n = $895;
                
                {ESLVal ll = $901;
                
                {ESLVal m = $900;
                
                {ESLVal lll = $903;
                
                {ESLVal ts = $902;
                
                {ESLVal e = $893;
                
                {ESLVal ds = $888;
                
                return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $896;
                
                {ESLVal n = $895;
                
                {ESLVal t = $894;
                
                {ESLVal e = $893;
                
                {ESLVal ds = $888;
                
                return cnstrEnv.apply(ds,env);
              }
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $898 = $894.termRef(0);
              ESLVal $897 = $894.termRef(1);
              
              {ESLVal l = $896;
              
              {ESLVal n = $895;
              
              {ESLVal lll = $898;
              
              {ESLVal ts = $897;
              
              {ESLVal e = $893;
              
              {ESLVal ds = $888;
              
              return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $896;
              
              {ESLVal n = $895;
              
              {ESLVal t = $894;
              
              {ESLVal e = $893;
              
              {ESLVal ds = $888;
              
              return cnstrEnv.apply(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "DataBind": {ESLVal $892 = $887.termRef(0);
            ESLVal $891 = $887.termRef(1);
            ESLVal $890 = $887.termRef(2);
            ESLVal $889 = $887.termRef(3);
            
            {ESLVal l = $892;
            
            {ESLVal n = $891;
            
            {ESLVal t = $890;
            
            {ESLVal e = $889;
            
            {ESLVal ds = $888;
            
            return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $887;
            
            {ESLVal ds = $888;
            
            return cnstrEnv.apply(ds,env);
          }
          }
        }
        }
      else if(_v148.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7120,7753)"));
      }
    }
  });
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal dataType = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v146 = t;
        
        switch(_v146.termName) {
        case "RecType": {ESLVal $883 = _v146.termRef(0);
          ESLVal $882 = _v146.termRef(1);
          ESLVal $881 = _v146.termRef(2);
          
          {ESLVal _v1283 = $883;
          
          {ESLVal n = $882;
          
          {ESLVal _v1284 = $881;
          
          return getConstructors.apply(_v1283,dataType,_v1284);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $880 = _v146.termRef(0);
          ESLVal $879 = _v146.termRef(1);
          ESLVal $878 = _v146.termRef(2);
          
          {ESLVal _v1281 = $880;
          
          {ESLVal ns = $879;
          
          {ESLVal _v1282 = $878;
          
          return getConstructors.apply(_v1281,dataType,_v1282);
        }
        }
        }
        }
      case "UnionType": {ESLVal $877 = _v146.termRef(0);
          ESLVal $876 = _v146.termRef(1);
          
          {ESLVal _v1278 = $877;
          
          {ESLVal ts = $876;
          
          return map.apply(new ESLVal(new Function(new ESLVal("fun355"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1279 = $args[0];
          {ESLVal _v147 = _v1279;
                
                switch(_v147.termName) {
                case "TermType": {ESLVal $886 = _v147.termRef(0);
                  ESLVal $885 = _v147.termRef(1);
                  ESLVal $884 = _v147.termRef(2);
                  
                  {ESLVal _v1280 = $886;
                  
                  {ESLVal n = $885;
                  
                  {ESLVal tts = $884;
                  
                  return new ESLVal("Map",n,dataType);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(8272,8338)"));
              }
              }
            }
          }),ts);
        }
        }
        }
        default: {ESLVal _v1285 = _v146;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType.apply(_v1285,ESLVal.list()))));
        }
      }
      }
    }
  });
  private static ESLVal zipTypeEnv = new ESLVal(new Function(new ESLVal("zipTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ns = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v145 = ns;
        ESLVal _v144 = ts;
        
        if(_v145.isCons())
        {ESLVal $870 = _v145.head();
          ESLVal $871 = _v145.tail();
          
          if(_v144.isCons())
          {ESLVal $872 = _v144.head();
            ESLVal $873 = _v144.tail();
            
            {ESLVal n = $870;
            
            {ESLVal _v1276 = $871;
            
            {ESLVal t = $872;
            
            {ESLVal _v1277 = $873;
            
            return zipTypeEnv.apply(_v1276,_v1277).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
        else if(_v144.isNil())
          return error(new ESLVal("case error at Pos(8481,8602)"));
        else return error(new ESLVal("case error at Pos(8481,8602)"));
        }
      else if(_v145.isNil())
        if(_v144.isCons())
          {ESLVal $874 = _v144.head();
            ESLVal $875 = _v144.tail();
            
            return error(new ESLVal("case error at Pos(8481,8602)"));
          }
        else if(_v144.isNil())
          return $nil;
        else return error(new ESLVal("case error at Pos(8481,8602)"));
      else return error(new ESLVal("case error at Pos(8481,8602)"));
      }
    }
  });
  private static ESLVal lookupType = new ESLVal(new Function(new ESLVal("lookupType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v143 = env;
        
        if(_v143.isCons())
        {ESLVal $866 = _v143.head();
          ESLVal $867 = _v143.tail();
          
          switch($866.termName) {
          case "Map": {ESLVal $869 = $866.termRef(0);
            ESLVal $868 = $866.termRef(1);
            
            {ESLVal n = $869;
            
            {ESLVal t = $868;
            
            {ESLVal e = $867;
            
            if(n.eql(name).boolVal)
            return t;
            else
              {ESLVal m = $866;
                
                {ESLVal _v1275 = $867;
                
                return lookupType.apply(name,_v1275);
              }
              }
          }
          }
          }
          }
          default: {ESLVal m = $866;
            
            {ESLVal e = $867;
            
            return lookupType.apply(name,e);
          }
          }
        }
        }
      else if(_v143.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(8648,8785)"));
      }
    }
  });
  private static ESLVal typeEnvDom = new ESLVal(new Function(new ESLVal("typeEnvDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v142 = e;
        
        if(_v142.isCons())
        {ESLVal $862 = _v142.head();
          ESLVal $863 = _v142.tail();
          
          switch($862.termName) {
          case "Map": {ESLVal $865 = $862.termRef(0);
            ESLVal $864 = $862.termRef(1);
            
            {ESLVal n = $865;
            
            {ESLVal t = $864;
            
            {ESLVal x = $863;
            
            return typeEnvDom.apply(x).cons(n);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8820,8909)"));
        }
        }
      else if(_v142.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(8820,8909)"));
      }
    }
  });
  private static ESLVal removeFromDom = new ESLVal(new Function(new ESLVal("removeFromDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v141 = e;
        
        if(_v141.isCons())
        {ESLVal $858 = _v141.head();
          ESLVal $859 = _v141.tail();
          
          switch($858.termName) {
          case "Map": {ESLVal $861 = $858.termRef(0);
            ESLVal $860 = $858.termRef(1);
            
            {ESLVal n = $861;
            
            {ESLVal t = $860;
            
            {ESLVal _v1271 = $859;
            
            if(member.apply(n,ns).boolVal)
            return removeFromDom.apply(_v1271,ns);
            else
              {ESLVal _v1272 = $861;
                
                {ESLVal _v1273 = $860;
                
                {ESLVal _v1274 = $859;
                
                return removeFromDom.apply(_v1274,ns).cons(new ESLVal("Map",_v1272,_v1273));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8956,9138)"));
        }
        }
      else if(_v141.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(8956,9138)"));
      }
    }
  });
  private static ESLVal restrictTypeEnv = new ESLVal(new Function(new ESLVal("restrictTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v140 = e;
        
        if(_v140.isCons())
        {ESLVal $854 = _v140.head();
          ESLVal $855 = _v140.tail();
          
          switch($854.termName) {
          case "Map": {ESLVal $857 = $854.termRef(0);
            ESLVal $856 = $854.termRef(1);
            
            {ESLVal n = $857;
            
            {ESLVal t = $856;
            
            {ESLVal _v1267 = $855;
            
            if(member.apply(n,ns).not().boolVal)
            return restrictTypeEnv.apply(_v1267,ns);
            else
              {ESLVal _v1268 = $857;
                
                {ESLVal _v1269 = $856;
                
                {ESLVal _v1270 = $855;
                
                return restrictTypeEnv.apply(_v1270,ns).cons(new ESLVal("Map",_v1268,_v1269));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9187,9378)"));
        }
        }
      else if(_v140.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(9187,9378)"));
      }
    }
  });
  private static ESLVal typeEnvRan = new ESLVal(new Function(new ESLVal("typeEnvRan"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v139 = e;
        
        if(_v139.isCons())
        {ESLVal $850 = _v139.head();
          ESLVal $851 = _v139.tail();
          
          switch($850.termName) {
          case "Map": {ESLVal $853 = $850.termRef(0);
            ESLVal $852 = $850.termRef(1);
            
            {ESLVal n = $853;
            
            {ESLVal t = $852;
            
            {ESLVal x = $851;
            
            return typeEnvRan.apply(x).cons(t);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9414,9505)"));
        }
        }
      else if(_v139.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(9414,9505)"));
      }
    }
  });
  private static ESLVal checkFreeTypes = new ESLVal(new Function(new ESLVal("checkFreeTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal dom = typeEnvDom.apply(e);
        ESLVal ran = typeEnvRan.apply(e);
        
        {ESLVal freeNames = removeAll.apply(dom,flatten.apply(map.apply(typeFV,ran)));
        
        if(freeNames.eql($nil).boolVal)
        return $null;
        else
          return error(new ESLVal("Unbound Types: ").add(freeNames));
      }
      }
    }
  });
  private static ESLVal checkSingletonTypes = new ESLVal(new Function(new ESLVal("checkSingletonTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v138 = e;
        
        if(_v138.isCons())
        {ESLVal $846 = _v138.head();
          ESLVal $847 = _v138.tail();
          
          switch($846.termName) {
          case "Map": {ESLVal $849 = $846.termRef(0);
            ESLVal $848 = $846.termRef(1);
            
            {ESLVal n = $849;
            
            {ESLVal t = $848;
            
            {ESLVal _v1266 = $847;
            
            if(member.apply(n,typeEnvDom.apply(_v1266)).boolVal)
            return error(new ESLVal("Duplicate type name: ").add(n));
            else
              return checkSingletonTypes.apply(_v1266);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10092,10294)"));
        }
        }
      else if(_v138.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10092,10294)"));
      }
    }
  });
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v137 = e;
        
        if(_v137.isCons())
        {ESLVal $842 = _v137.head();
          ESLVal $843 = _v137.tail();
          
          switch($842.termName) {
          case "Map": {ESLVal $845 = $842.termRef(0);
            ESLVal $844 = $842.termRef(1);
            
            {ESLVal n = $845;
            
            {ESLVal t = $844;
            
            {ESLVal _v1265 = $843;
            
            if(member.apply(n,typeEnvDom.apply(_v1265)).boolVal)
            return error(new ESLVal("Duplicate constructor name: ").add(n));
            else
              return checkSingletonConstructors.apply(_v1265);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10400,10615)"));
        }
        }
      else if(_v137.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10400,10615)"));
      }
    }
  });
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v136 = defs;
        
        if(_v136.isCons())
        {ESLVal $828 = _v136.head();
          ESLVal $829 = _v136.tail();
          
          switch($828.termName) {
          case "TypeBind": {ESLVal $841 = $828.termRef(0);
            ESLVal $840 = $828.termRef(1);
            ESLVal $839 = $828.termRef(2);
            ESLVal $838 = $828.termRef(3);
            
            {ESLVal l = $841;
            
            {ESLVal n = $840;
            
            {ESLVal t = $839;
            
            {ESLVal e = $838;
            
            {ESLVal ds = $829;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $837 = $828.termRef(0);
            ESLVal $836 = $828.termRef(1);
            ESLVal $835 = $828.termRef(2);
            ESLVal $834 = $828.termRef(3);
            
            {ESLVal l1 = $837;
            
            {ESLVal n = $836;
            
            {ESLVal t = $835;
            
            {ESLVal e = $834;
            
            {ESLVal ds = $829;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "CnstrBind": {ESLVal $833 = $828.termRef(0);
            ESLVal $832 = $828.termRef(1);
            ESLVal $831 = $828.termRef(2);
            ESLVal $830 = $828.termRef(3);
            
            {ESLVal l1 = $833;
            
            {ESLVal n = $832;
            
            {ESLVal t = $831;
            
            {ESLVal e = $830;
            
            {ESLVal ds = $829;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $828;
            
            {ESLVal ds = $829;
            
            return valueDefs.apply(ds).cons(b);
          }
          }
        }
        }
      else if(_v136.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(10656,10966)"));
      }
    }
  });
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1264 = $args[0];
  ESLVal _v1263 = $args[1];
  ESLVal _v1262 = $args[2];
  ESLVal _v1261 = $args[3];
  ESLVal _v1260 = $args[4];
  {ESLVal _v135 = _v1264;
        
        if(_v135.isCons())
        {ESLVal $814 = _v135.head();
          ESLVal $815 = _v135.tail();
          
          switch($814.termName) {
          case "FunBind": {ESLVal $827 = $814.termRef(0);
            ESLVal $826 = $814.termRef(1);
            ESLVal $825 = $814.termRef(2);
            ESLVal $824 = $814.termRef(3);
            ESLVal $823 = $814.termRef(4);
            ESLVal $822 = $814.termRef(5);
            ESLVal $821 = $814.termRef(6);
            
            {ESLVal l = $827;
            
            {ESLVal n = $826;
            
            {ESLVal ps = $825;
            
            {ESLVal t = $824;
            
            {ESLVal st = $823;
            
            {ESLVal b = $822;
            
            {ESLVal g = $821;
            
            {ESLVal ds = $815;
            
            return valueDefsToTEnv.apply(ds,_v1263,_v1262,_v1261,_v1260).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1260,t)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "Binding": {ESLVal $820 = $814.termRef(0);
            ESLVal $819 = $814.termRef(1);
            ESLVal $818 = $814.termRef(2);
            ESLVal $817 = $814.termRef(3);
            ESLVal $816 = $814.termRef(4);
            
            {ESLVal l = $820;
            
            {ESLVal n = $819;
            
            {ESLVal t = $818;
            
            {ESLVal st = $817;
            
            {ESLVal e = $816;
            
            {ESLVal ds = $815;
            
            return valueDefsToTEnv.apply(ds,_v1263,_v1262,_v1261,_v1260).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1260,t)));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(11073,11759)"));
        }
        }
      else if(_v135.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11073,11759)"));
      }
    }
  });
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  return typeCheckModuleInternal.apply(path,emptyTable,new ESLVal(new Function(new ESLVal("fun356"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1259 = $args[0];
        ESLVal _v1258 = $args[1];
        ESLVal _v1257 = $args[2];
        ESLVal _v1256 = $args[3];
        return $null;
          }
        }));
    }
  });
  private static ESLVal typeCheckModuleInternal = new ESLVal(new Function(new ESLVal("typeCheckModuleInternal"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  if(hasEntry.apply(path,cache).boolVal)
        {ESLVal _v134 = lookup.apply(path,cache);
          
          switch(_v134.termName) {
          case "Typed": {ESLVal $813 = _v134.termRef(0);
            ESLVal $812 = _v134.termRef(1);
            ESLVal $811 = _v134.termRef(2);
            ESLVal $810 = _v134.termRef(3);
            
            {ESLVal m = $813;
            
            {ESLVal vEnv = $812;
            
            {ESLVal cEnv = $811;
            
            {ESLVal tEnv = $810;
            
            return handler.apply(cache,vEnv,cEnv,tEnv);
          }
          }
          }
          }
          }
        case "Undefined": {
            return error(new ESLVal("recursive reference to ").add(path));
          }
          default: return error(new ESLVal("case error at Pos(12180,12414)"));
        }
        }
        else
          {ESLVal m = parse.apply(path);
            
            return typeCheckModuleCache.apply(m,addEntry.apply(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun357"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1255 = $args[0];
            ESLVal _v1254 = $args[1];
            ESLVal _v1253 = $args[2];
            ESLVal _v1252 = $args[3];
            return handler.apply(addEntry.apply(path,new ESLVal("Typed",m,_v1254,_v1253,_v1252),_v1255),_v1254,_v1253,_v1252);
              }
            }));
          }
    }
  });
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  return typeCheckModuleCache.apply(module,emptyTable,new ESLVal(new Function(new ESLVal("fun358"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1251 = $args[0];
        ESLVal _v1250 = $args[1];
        ESLVal _v1249 = $args[2];
        ESLVal _v1248 = $args[3];
        return $null;
          }
        }));
    }
  });
  private static ESLVal typeCheckModuleCache = new ESLVal(new Function(new ESLVal("typeCheckModuleCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  return typeCheckModule0.apply(module,cache,new ESLVal(new Function(new ESLVal("fun359"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1247 = $args[0];
        ESLVal _v1246 = $args[1];
        ESLVal _v1245 = $args[2];
        ESLVal _v1244 = $args[3];
        {ESLVal _v133 = module;
              
              switch(_v133.termName) {
              case "Module": {ESLVal $809 = _v133.termRef(0);
                ESLVal $808 = _v133.termRef(1);
                ESLVal $807 = _v133.termRef(2);
                ESLVal $806 = _v133.termRef(3);
                ESLVal $805 = _v133.termRef(4);
                ESLVal $804 = _v133.termRef(5);
                ESLVal $803 = _v133.termRef(6);
                
                {ESLVal path = $809;
                
                {ESLVal name = $808;
                
                {ESLVal exports = $807;
                
                {ESLVal imports = $806;
                
                {ESLVal x = $805;
                
                {ESLVal y = $804;
                
                {ESLVal defs = $803;
                
                return handler.apply(_v1247,restrictTypeEnv.apply(_v1246,exports),restrictTypeEnv.apply(_v1245,exports),restrictTypeEnv.apply(_v1244,exports));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(13156,13414)"));
            }
            }
          }
        }));
    }
  });
  private static ESLVal typeCheckModule0 = new ESLVal(new Function(new ESLVal("typeCheckModule0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  LetRec letrec = new LetRec() {
        ESLVal _v1224 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1233 = $args[0];
          ESLVal _v1232 = $args[1];
          ESLVal _v1231 = $args[2];
          {ESLVal _v132 = _v1233;
                
                if(_v132.isCons())
                {ESLVal $801 = _v132.head();
                  ESLVal $802 = _v132.tail();
                  
                  {ESLVal path = $801;
                  
                  {ESLVal _v1234 = $802;
                  
                  {ESLVal _v1235 = _v1234;
                  
                  return typeCheckModuleInternal.apply(path,_v1232,new ESLVal(new Function(new ESLVal("fun360"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1239 = $args[0];
                  ESLVal _v1238 = $args[1];
                  ESLVal _v1237 = $args[2];
                  ESLVal _v1236 = $args[3];
                  return _v1224.apply(_v1235,_v1239,new ESLVal(new Function(new ESLVal("fun361"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v1243 = $args[0];
                        ESLVal _v1242 = $args[1];
                        ESLVal _v1241 = $args[2];
                        ESLVal _v1240 = $args[3];
                        return _v1231.apply(_v1243,_v1242.add(_v1238),_v1241.add(_v1237),_v1240.add(_v1236));
                          }
                        }));
                    }
                  }));
                }
                }
                }
                }
              else if(_v132.isNil())
                return _v1231.apply(_v1232,$nil,$nil,$nil);
              else return error(new ESLVal("case error at Pos(13794,14351)"));
              }
            }
          });
        ESLVal _v1223 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              {ESLVal _v131 = module;
                
                switch(_v131.termName) {
                case "Module": {ESLVal $800 = _v131.termRef(0);
                  ESLVal $799 = _v131.termRef(1);
                  ESLVal $798 = _v131.termRef(2);
                  ESLVal $797 = _v131.termRef(3);
                  ESLVal $796 = _v131.termRef(4);
                  ESLVal $795 = _v131.termRef(5);
                  ESLVal $794 = _v131.termRef(6);
                  
                  {ESLVal path = $800;
                  
                  {ESLVal name = $799;
                  
                  {ESLVal exports = $798;
                  
                  {ESLVal imports = $797;
                  
                  {ESLVal x = $796;
                  
                  {ESLVal y = $795;
                  
                  {ESLVal defs = $794;
                  
                  return _v1224.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun362"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1228 = $args[0];
                  ESLVal _v1227 = $args[1];
                  ESLVal _v1226 = $args[2];
                  ESLVal _v1225 = $args[3];
                  {ESLVal e = typeEnv.apply(defs);
                        
                        {checkDupBindings.apply(defs);
                      checkFreeTypes.apply(e.add(_v1225.add(tenv0)));
                      checkSingletonTypes.apply(e);
                      {ESLVal _v1229 = recTypes.apply(e.add(_v1225.add(tenv0)));
                        
                        {ESLVal _v1230 = cnstrEnv.apply(defs,_v1229).add(_v1226.add(cnstrEnv0));
                        
                        {checkSingletonConstructors.apply(_v1230);
                      {ESLVal valueEnv = typeCheckValues.apply(valueDefs.apply(defs),new ESLVal("NullType",p0),_v1227,_v1229,_v1230);
                        
                        return handler.apply(_v1228,valueEnv,_v1230,_v1229);
                      }}
                      }
                      }}
                      }
                    }
                  }));
                }
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(14380,15870)"));
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "_v1224": return _v1224;
            
            case "_v1223": return _v1223;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal _v1224 = letrec.get("_v1224");
      
      ESLVal _v1223 = letrec.get("_v1223");
      
        return _v1223.apply();
      
    }
  });
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1222 = $args[0];
  ESLVal _v1221 = $args[1];
  ESLVal _v1220 = $args[2];
  ESLVal _v1219 = $args[3];
  ESLVal _v1218 = $args[4];
  {ESLVal valueEnv = valueDefsToTEnv.apply(_v1222,_v1221,$nil,_v1218,_v1219).add(_v1220.add(env0));
        
        {{
        ESLVal _v130 = _v1222;
        while(_v130.isCons()) {
          ESLVal def = _v130.headVal;
          typeCheckDef.apply(def,_v1221,valueEnv,valueEnv,_v1218,_v1219);
          _v130 = _v130.tailVal;}
      }
      return valueEnv;}
      }
    }
  });
  private static ESLVal genericize = new ESLVal(new Function(new ESLVal("genericize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal t = $args[1];
  if(length.apply(typeFV.apply(t)).eql($zero).boolVal)
        return t;
        else
          return new ESLVal("ForallType",l,typeFV.apply(t),t);
    }
  });
  private static ESLVal checkPatterns = new ESLVal(new Function(new ESLVal("checkPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal ps = $args[1];
  {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v128 = $qualArg;
                
                {ESLVal p = _v128;
                
                return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1217 = $args[0];
                {ESLVal _v129 = _v1217;
                      
                      {ESLVal n = _v129;
                      
                      return ESLVal.list(ESLVal.list(n));
                    }
                    }
                  }
                }).map(patternNames.apply(p)).flatten().flatten());
              }
              }
            }
          }).map(ps).flatten().flatten();
        
        if(removeDups.apply(names).neql(names).boolVal)
        return error(new ESLVal("TypeError",l,new ESLVal("duplicate pattern variables")));
        else
          return $null;
      }
    }
  });
  private static ESLVal typeCheckDef = new ESLVal(new Function(new ESLVal("typeCheckDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1206 = $args[0];
  ESLVal _v1205 = $args[1];
  ESLVal _v1204 = $args[2];
  ESLVal _v1203 = $args[3];
  ESLVal _v1202 = $args[4];
  ESLVal _v1201 = $args[5];
  {ESLVal _v124 = _v1206;
        
        switch(_v124.termName) {
        case "FunBind": {ESLVal $784 = _v124.termRef(0);
          ESLVal $783 = _v124.termRef(1);
          ESLVal $782 = _v124.termRef(2);
          ESLVal $781 = _v124.termRef(3);
          ESLVal $780 = _v124.termRef(4);
          ESLVal $779 = _v124.termRef(5);
          ESLVal $778 = _v124.termRef(6);
          
          {ESLVal l = $784;
          
          {ESLVal n = $783;
          
          {ESLVal ps = $782;
          
          {ESLVal t = $781;
          
          {ESLVal st = $780;
          
          {ESLVal b = $779;
          
          {ESLVal g = $778;
          
          {checkPatterns.apply(l,ps);
        {ESLVal argTypes = map.apply(new ESLVal(new Function(new ESLVal("fun363"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v126 = p;
                  
                  switch(_v126.termName) {
                  case "PVar": {ESLVal $790 = _v126.termRef(0);
                    ESLVal $789 = _v126.termRef(1);
                    ESLVal $788 = _v126.termRef(2);
                    
                    {ESLVal _v1211 = $790;
                    
                    {ESLVal _v1212 = $789;
                    
                    {ESLVal _v1213 = $788;
                    
                    return substTypeEnv.apply(_v1201,_v1213);
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(17046,17112)"));
                }
                }
              }
            }),ps);
          ESLVal argNames = map.apply(new ESLVal(new Function(new ESLVal("fun364"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v125 = p;
                  
                  switch(_v125.termName) {
                  case "PVar": {ESLVal $787 = _v125.termRef(0);
                    ESLVal $786 = _v125.termRef(1);
                    ESLVal $785 = _v125.termRef(2);
                    
                    {ESLVal _v1208 = $787;
                    
                    {ESLVal _v1209 = $786;
                    
                    {ESLVal _v1210 = $785;
                    
                    return _v1209;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(17194,17238)"));
                }
                }
              }
            }),ps);
          
          {ESLVal bodyType = guardedExpType.apply(l,g,b,_v1205,zipTypeEnv.apply(argNames,argTypes).add(_v1204),_v1202,_v1201);
          
          {ESLVal fType = ((Supplier<ESLVal>)() -> { 
              {ESLVal _v127 = t;
                
                switch(_v127.termName) {
                case "ForallType": {ESLVal $793 = _v127.termRef(0);
                  ESLVal $792 = _v127.termRef(1);
                  ESLVal $791 = _v127.termRef(2);
                  
                  {ESLVal _v1214 = $793;
                  
                  {ESLVal ns = $792;
                  
                  {ESLVal _v1215 = $791;
                  
                  return genericize.apply(_v1214,new ESLVal("FunType",_v1214,argTypes,bodyType));
                }
                }
                }
                }
                default: {ESLVal _v1216 = _v127;
                  
                  return new ESLVal("FunType",l,argTypes,bodyType);
                }
              }
              }
            }).get();
          ESLVal dType = substTypeEnv.apply(_v1201,t);
          
          if(typeEqual.apply(fType,dType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType.apply(fType,_v1201).add(new ESLVal(" does not match declaration ").add(ppType.apply(dType,_v1201))))))));
        }
        }
        }}
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $777 = _v124.termRef(0);
          ESLVal $776 = _v124.termRef(1);
          ESLVal $775 = _v124.termRef(2);
          ESLVal $774 = _v124.termRef(3);
          ESLVal $773 = _v124.termRef(4);
          
          {ESLVal l = $777;
          
          {ESLVal n = $776;
          
          {ESLVal dt = $775;
          
          {ESLVal st = $774;
          
          {ESLVal e = $773;
          
          {ESLVal valueType = expType.apply(e,_v1205,_v1204,_v1202,_v1201);
          
          {ESLVal valueFV = typeFV.apply(valueType);
          ESLVal declaredType = lookupType.apply(n,_v1203);
          
          {ESLVal _v1207 = ((Supplier<ESLVal>)() -> { 
              if(valueFV.eql($nil).boolVal)
                return valueType;
                else
                  return new ESLVal("ForallType",l,valueFV,valueType);
            }).get();
          
          if(typeEqual.apply(_v1207,declaredType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType.apply(_v1207,_v1201).add(new ESLVal(" does not match declared type = ").add(ppType.apply(declaredType,_v1201))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(16832,18762)"));
      }
      }
    }
  });
  private static ESLVal typeEqual = new ESLVal(new Function(new ESLVal("typeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  {ESLVal b = typeEqual1.apply(t1,t2);
        
        return b;
      }
    }
  });
  private static ESLVal typeEqual1 = new ESLVal(new Function(new ESLVal("typeEqual1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  if(t1.eql(t2).boolVal)
        return $true;
        else
          {ESLVal _v123 = t1;
            ESLVal _v122 = t2;
            
            switch(_v123.termName) {
            case "ArrayType": {ESLVal $770 = _v123.termRef(0);
              ESLVal $769 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "ArrayType": {ESLVal $772 = _v122.termRef(0);
                ESLVal $771 = _v122.termRef(1);
                
                {ESLVal l1 = $770;
                
                {ESLVal _v1181 = $769;
                
                {ESLVal l2 = $772;
                
                {ESLVal _v1182 = $771;
                
                return typeEqual.apply(_v1181,_v1182);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1189 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1189,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1188 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1187 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1187,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1185 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1186 = $661;
                  
                  return typeEqual.apply(_v1185,substType.apply(new ESLVal("RecType",l2,n2,_v1186),n2,_v1186));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1183 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1184 = $658;
                  
                  return typeEqual.apply(_v1183,_v1184);
                }
                }
                }
                }
                }
                default: {ESLVal _v1190 = _v123;
                  
                  {ESLVal _v1191 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ActType": {ESLVal $765 = _v123.termRef(0);
              ESLVal $764 = _v123.termRef(1);
              ESLVal $763 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "ActType": {ESLVal $768 = _v122.termRef(0);
                ESLVal $767 = _v122.termRef(1);
                ESLVal $766 = _v122.termRef(2);
                
                {ESLVal l1 = $765;
                
                {ESLVal exports1 = $764;
                
                {ESLVal handlers1 = $763;
                
                {ESLVal l2 = $768;
                
                {ESLVal exports2 = $767;
                
                {ESLVal handlers2 = $766;
                
                return actEqual.apply(exports1,exports1,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1178 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1178,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1177 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1176 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1176,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1174 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1175 = $661;
                  
                  return typeEqual.apply(_v1174,substType.apply(new ESLVal("RecType",l2,n2,_v1175),n2,_v1175));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1172 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1173 = $658;
                  
                  return typeEqual.apply(_v1172,_v1173);
                }
                }
                }
                }
                }
                default: {ESLVal _v1179 = _v123;
                  
                  {ESLVal _v1180 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ApplyTypeFun": {ESLVal $759 = _v123.termRef(0);
              ESLVal $758 = _v123.termRef(1);
              ESLVal $757 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "ApplyTypeFun": {ESLVal $762 = _v122.termRef(0);
                ESLVal $761 = _v122.termRef(1);
                ESLVal $760 = _v122.termRef(2);
                
                {ESLVal l1 = $759;
                
                {ESLVal op1 = $758;
                
                {ESLVal args1 = $757;
                
                {ESLVal l2 = $762;
                
                {ESLVal op2 = $761;
                
                {ESLVal args2 = $760;
                
                return typeEqual.apply(op1,op2).and(typesEqual.apply(args1,args2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $759;
                
                {ESLVal op = $758;
                
                {ESLVal args = $757;
                
                {ESLVal _v1171 = _v122;
                
                return typeEqual.apply(applyTypeFun.apply(l,forceType.apply(op),args),_v1171);
              }
              }
              }
              }
            }
            }
          case "BoolType": {ESLVal $755 = _v123.termRef(0);
              
              switch(_v122.termName) {
              case "BoolType": {ESLVal $756 = _v122.termRef(0);
                
                {ESLVal l1 = $755;
                
                {ESLVal l2 = $756;
                
                return $true;
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1168 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1168,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1167 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1166 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1166,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1164 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1165 = $661;
                  
                  return typeEqual.apply(_v1164,substType.apply(new ESLVal("RecType",l2,n2,_v1165),n2,_v1165));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1162 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1163 = $658;
                  
                  return typeEqual.apply(_v1162,_v1163);
                }
                }
                }
                }
                }
                default: {ESLVal _v1169 = _v123;
                  
                  {ESLVal _v1170 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "FloatType": {ESLVal $753 = _v123.termRef(0);
              
              switch(_v122.termName) {
              case "FloatType": {ESLVal $754 = _v122.termRef(0);
                
                {ESLVal l1 = $753;
                
                {ESLVal l2 = $754;
                
                return $true;
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1159 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1159,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1158 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1157 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1157,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1155 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1156 = $661;
                  
                  return typeEqual.apply(_v1155,substType.apply(new ESLVal("RecType",l2,n2,_v1156),n2,_v1156));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1153 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1154 = $658;
                  
                  return typeEqual.apply(_v1153,_v1154);
                }
                }
                }
                }
                }
                default: {ESLVal _v1160 = _v123;
                  
                  {ESLVal _v1161 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "IntType": {ESLVal $751 = _v123.termRef(0);
              
              switch(_v122.termName) {
              case "IntType": {ESLVal $752 = _v122.termRef(0);
                
                {ESLVal l1 = $751;
                
                {ESLVal l2 = $752;
                
                return $true;
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1150 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1150,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1149 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1148 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1148,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1146 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1147 = $661;
                  
                  return typeEqual.apply(_v1146,substType.apply(new ESLVal("RecType",l2,n2,_v1147),n2,_v1147));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1144 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1145 = $658;
                  
                  return typeEqual.apply(_v1144,_v1145);
                }
                }
                }
                }
                }
                default: {ESLVal _v1151 = _v123;
                  
                  {ESLVal _v1152 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ListType": {ESLVal $737 = _v123.termRef(0);
              ESLVal $736 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "ListType": {ESLVal $750 = _v122.termRef(0);
                ESLVal $749 = _v122.termRef(1);
                
                {ESLVal l1 = $737;
                
                {ESLVal _v1133 = $736;
                
                {ESLVal l2 = $750;
                
                {ESLVal _v1134 = $749;
                
                return typeEqual.apply(_v1133,_v1134);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $740 = _v122.termRef(0);
                ESLVal $739 = _v122.termRef(1);
                ESLVal $738 = _v122.termRef(2);
                
                if($739.isCons())
                {ESLVal $741 = $739.head();
                  ESLVal $742 = $739.tail();
                  
                  if($742.isCons())
                  {ESLVal $743 = $742.head();
                    ESLVal $744 = $742.tail();
                    
                    switch(_v122.termName) {
                    case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                      ESLVal $670 = _v122.termRef(1);
                      ESLVal $669 = _v122.termRef(2);
                      
                      {ESLVal _v1071 = _v123;
                      
                      {ESLVal l = $671;
                      
                      {ESLVal op = $670;
                      
                      {ESLVal args = $669;
                      
                      return typeEqual.apply(_v1071,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $668 = _v122.termRef(0);
                      
                      {ESLVal t = _v123;
                      
                      {ESLVal l1 = $668;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $667 = _v122.termRef(0);
                      ESLVal $666 = _v122.termRef(1);
                      ESLVal $665 = _v122.termRef(2);
                      
                      {ESLVal _v1070 = _v123;
                      
                      {ESLVal l2 = $667;
                      
                      {ESLVal n2 = $666;
                      
                      {ESLVal args2 = $665;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                      
                      {ESLVal _v1069 = _v123;
                      
                      {ESLVal f = $664;
                      
                      return typeEqual.apply(_v1069,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $663 = _v122.termRef(0);
                      ESLVal $662 = _v122.termRef(1);
                      ESLVal $661 = _v122.termRef(2);
                      
                      {ESLVal _v1067 = _v123;
                      
                      {ESLVal l2 = $663;
                      
                      {ESLVal n2 = $662;
                      
                      {ESLVal _v1068 = $661;
                      
                      return typeEqual.apply(_v1067,substType.apply(new ESLVal("RecType",l2,n2,_v1068),n2,_v1068));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $660 = _v122.termRef(0);
                      ESLVal $659 = _v122.termRef(1);
                      ESLVal $658 = _v122.termRef(2);
                      
                      {ESLVal _v1065 = _v123;
                      
                      {ESLVal l1 = $660;
                      
                      {ESLVal ns2 = $659;
                      
                      {ESLVal _v1066 = $658;
                      
                      return typeEqual.apply(_v1065,_v1066);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v1072 = _v123;
                      
                      {ESLVal _v1073 = _v122;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($742.isNil())
                  switch($738.termName) {
                    case "ListType": {ESLVal $746 = $738.termRef(0);
                      ESLVal $745 = $738.termRef(1);
                      
                      switch($745.termName) {
                      case "VarType": {ESLVal $748 = $745.termRef(0);
                        ESLVal $747 = $745.termRef(1);
                        
                        {ESLVal l1 = $737;
                        
                        {ESLVal _v1074 = $736;
                        
                        {ESLVal l2 = $740;
                        
                        {ESLVal v1 = $741;
                        
                        {ESLVal l3 = $746;
                        
                        {ESLVal l4 = $748;
                        
                        {ESLVal v2 = $747;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v122.termName) {
                            case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                              ESLVal $670 = _v122.termRef(1);
                              ESLVal $669 = _v122.termRef(2);
                              
                              {ESLVal _v1085 = _v123;
                              
                              {ESLVal l = $671;
                              
                              {ESLVal op = $670;
                              
                              {ESLVal args = $669;
                              
                              return typeEqual.apply(_v1085,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $668 = _v122.termRef(0);
                              
                              {ESLVal t = _v123;
                              
                              {ESLVal _v1084 = $668;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $667 = _v122.termRef(0);
                              ESLVal $666 = _v122.termRef(1);
                              ESLVal $665 = _v122.termRef(2);
                              
                              {ESLVal _v1082 = _v123;
                              
                              {ESLVal _v1083 = $667;
                              
                              {ESLVal n2 = $666;
                              
                              {ESLVal args2 = $665;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                              
                              {ESLVal _v1081 = _v123;
                              
                              {ESLVal f = $664;
                              
                              return typeEqual.apply(_v1081,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $663 = _v122.termRef(0);
                              ESLVal $662 = _v122.termRef(1);
                              ESLVal $661 = _v122.termRef(2);
                              
                              {ESLVal _v1078 = _v123;
                              
                              {ESLVal _v1079 = $663;
                              
                              {ESLVal n2 = $662;
                              
                              {ESLVal _v1080 = $661;
                              
                              return typeEqual.apply(_v1078,substType.apply(new ESLVal("RecType",_v1079,n2,_v1080),n2,_v1080));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $660 = _v122.termRef(0);
                              ESLVal $659 = _v122.termRef(1);
                              ESLVal $658 = _v122.termRef(2);
                              
                              {ESLVal _v1075 = _v123;
                              
                              {ESLVal _v1076 = $660;
                              
                              {ESLVal ns2 = $659;
                              
                              {ESLVal _v1077 = $658;
                              
                              return typeEqual.apply(_v1075,_v1077);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v1086 = _v123;
                              
                              {ESLVal _v1087 = _v122;
                              
                              return $false;
                            }
                            }
                          }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: switch(_v122.termName) {
                        case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                          ESLVal $670 = _v122.termRef(1);
                          ESLVal $669 = _v122.termRef(2);
                          
                          {ESLVal _v1094 = _v123;
                          
                          {ESLVal l = $671;
                          
                          {ESLVal op = $670;
                          
                          {ESLVal args = $669;
                          
                          return typeEqual.apply(_v1094,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $668 = _v122.termRef(0);
                          
                          {ESLVal t = _v123;
                          
                          {ESLVal l1 = $668;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $667 = _v122.termRef(0);
                          ESLVal $666 = _v122.termRef(1);
                          ESLVal $665 = _v122.termRef(2);
                          
                          {ESLVal _v1093 = _v123;
                          
                          {ESLVal l2 = $667;
                          
                          {ESLVal n2 = $666;
                          
                          {ESLVal args2 = $665;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                          
                          {ESLVal _v1092 = _v123;
                          
                          {ESLVal f = $664;
                          
                          return typeEqual.apply(_v1092,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $663 = _v122.termRef(0);
                          ESLVal $662 = _v122.termRef(1);
                          ESLVal $661 = _v122.termRef(2);
                          
                          {ESLVal _v1090 = _v123;
                          
                          {ESLVal l2 = $663;
                          
                          {ESLVal n2 = $662;
                          
                          {ESLVal _v1091 = $661;
                          
                          return typeEqual.apply(_v1090,substType.apply(new ESLVal("RecType",l2,n2,_v1091),n2,_v1091));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $660 = _v122.termRef(0);
                          ESLVal $659 = _v122.termRef(1);
                          ESLVal $658 = _v122.termRef(2);
                          
                          {ESLVal _v1088 = _v123;
                          
                          {ESLVal l1 = $660;
                          
                          {ESLVal ns2 = $659;
                          
                          {ESLVal _v1089 = $658;
                          
                          return typeEqual.apply(_v1088,_v1089);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v1095 = _v123;
                          
                          {ESLVal _v1096 = _v122;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v122.termName) {
                      case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                        ESLVal $670 = _v122.termRef(1);
                        ESLVal $669 = _v122.termRef(2);
                        
                        {ESLVal _v1103 = _v123;
                        
                        {ESLVal l = $671;
                        
                        {ESLVal op = $670;
                        
                        {ESLVal args = $669;
                        
                        return typeEqual.apply(_v1103,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $668 = _v122.termRef(0);
                        
                        {ESLVal t = _v123;
                        
                        {ESLVal l1 = $668;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $667 = _v122.termRef(0);
                        ESLVal $666 = _v122.termRef(1);
                        ESLVal $665 = _v122.termRef(2);
                        
                        {ESLVal _v1102 = _v123;
                        
                        {ESLVal l2 = $667;
                        
                        {ESLVal n2 = $666;
                        
                        {ESLVal args2 = $665;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                        
                        {ESLVal _v1101 = _v123;
                        
                        {ESLVal f = $664;
                        
                        return typeEqual.apply(_v1101,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $663 = _v122.termRef(0);
                        ESLVal $662 = _v122.termRef(1);
                        ESLVal $661 = _v122.termRef(2);
                        
                        {ESLVal _v1099 = _v123;
                        
                        {ESLVal l2 = $663;
                        
                        {ESLVal n2 = $662;
                        
                        {ESLVal _v1100 = $661;
                        
                        return typeEqual.apply(_v1099,substType.apply(new ESLVal("RecType",l2,n2,_v1100),n2,_v1100));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $660 = _v122.termRef(0);
                        ESLVal $659 = _v122.termRef(1);
                        ESLVal $658 = _v122.termRef(2);
                        
                        {ESLVal _v1097 = _v123;
                        
                        {ESLVal l1 = $660;
                        
                        {ESLVal ns2 = $659;
                        
                        {ESLVal _v1098 = $658;
                        
                        return typeEqual.apply(_v1097,_v1098);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v1104 = _v123;
                        
                        {ESLVal _v1105 = _v122;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v122.termName) {
                    case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                      ESLVal $670 = _v122.termRef(1);
                      ESLVal $669 = _v122.termRef(2);
                      
                      {ESLVal _v1112 = _v123;
                      
                      {ESLVal l = $671;
                      
                      {ESLVal op = $670;
                      
                      {ESLVal args = $669;
                      
                      return typeEqual.apply(_v1112,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $668 = _v122.termRef(0);
                      
                      {ESLVal t = _v123;
                      
                      {ESLVal l1 = $668;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $667 = _v122.termRef(0);
                      ESLVal $666 = _v122.termRef(1);
                      ESLVal $665 = _v122.termRef(2);
                      
                      {ESLVal _v1111 = _v123;
                      
                      {ESLVal l2 = $667;
                      
                      {ESLVal n2 = $666;
                      
                      {ESLVal args2 = $665;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                      
                      {ESLVal _v1110 = _v123;
                      
                      {ESLVal f = $664;
                      
                      return typeEqual.apply(_v1110,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $663 = _v122.termRef(0);
                      ESLVal $662 = _v122.termRef(1);
                      ESLVal $661 = _v122.termRef(2);
                      
                      {ESLVal _v1108 = _v123;
                      
                      {ESLVal l2 = $663;
                      
                      {ESLVal n2 = $662;
                      
                      {ESLVal _v1109 = $661;
                      
                      return typeEqual.apply(_v1108,substType.apply(new ESLVal("RecType",l2,n2,_v1109),n2,_v1109));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $660 = _v122.termRef(0);
                      ESLVal $659 = _v122.termRef(1);
                      ESLVal $658 = _v122.termRef(2);
                      
                      {ESLVal _v1106 = _v123;
                      
                      {ESLVal l1 = $660;
                      
                      {ESLVal ns2 = $659;
                      
                      {ESLVal _v1107 = $658;
                      
                      return typeEqual.apply(_v1106,_v1107);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v1113 = _v123;
                      
                      {ESLVal _v1114 = _v122;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($739.isNil())
                switch(_v122.termName) {
                  case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                    ESLVal $670 = _v122.termRef(1);
                    ESLVal $669 = _v122.termRef(2);
                    
                    {ESLVal _v1121 = _v123;
                    
                    {ESLVal l = $671;
                    
                    {ESLVal op = $670;
                    
                    {ESLVal args = $669;
                    
                    return typeEqual.apply(_v1121,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $668 = _v122.termRef(0);
                    
                    {ESLVal t = _v123;
                    
                    {ESLVal l1 = $668;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $667 = _v122.termRef(0);
                    ESLVal $666 = _v122.termRef(1);
                    ESLVal $665 = _v122.termRef(2);
                    
                    {ESLVal _v1120 = _v123;
                    
                    {ESLVal l2 = $667;
                    
                    {ESLVal n2 = $666;
                    
                    {ESLVal args2 = $665;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                    
                    {ESLVal _v1119 = _v123;
                    
                    {ESLVal f = $664;
                    
                    return typeEqual.apply(_v1119,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $663 = _v122.termRef(0);
                    ESLVal $662 = _v122.termRef(1);
                    ESLVal $661 = _v122.termRef(2);
                    
                    {ESLVal _v1117 = _v123;
                    
                    {ESLVal l2 = $663;
                    
                    {ESLVal n2 = $662;
                    
                    {ESLVal _v1118 = $661;
                    
                    return typeEqual.apply(_v1117,substType.apply(new ESLVal("RecType",l2,n2,_v1118),n2,_v1118));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $660 = _v122.termRef(0);
                    ESLVal $659 = _v122.termRef(1);
                    ESLVal $658 = _v122.termRef(2);
                    
                    {ESLVal _v1115 = _v123;
                    
                    {ESLVal l1 = $660;
                    
                    {ESLVal ns2 = $659;
                    
                    {ESLVal _v1116 = $658;
                    
                    return typeEqual.apply(_v1115,_v1116);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v1122 = _v123;
                    
                    {ESLVal _v1123 = _v122;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v122.termName) {
                  case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                    ESLVal $670 = _v122.termRef(1);
                    ESLVal $669 = _v122.termRef(2);
                    
                    {ESLVal _v1130 = _v123;
                    
                    {ESLVal l = $671;
                    
                    {ESLVal op = $670;
                    
                    {ESLVal args = $669;
                    
                    return typeEqual.apply(_v1130,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $668 = _v122.termRef(0);
                    
                    {ESLVal t = _v123;
                    
                    {ESLVal l1 = $668;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $667 = _v122.termRef(0);
                    ESLVal $666 = _v122.termRef(1);
                    ESLVal $665 = _v122.termRef(2);
                    
                    {ESLVal _v1129 = _v123;
                    
                    {ESLVal l2 = $667;
                    
                    {ESLVal n2 = $666;
                    
                    {ESLVal args2 = $665;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                    
                    {ESLVal _v1128 = _v123;
                    
                    {ESLVal f = $664;
                    
                    return typeEqual.apply(_v1128,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $663 = _v122.termRef(0);
                    ESLVal $662 = _v122.termRef(1);
                    ESLVal $661 = _v122.termRef(2);
                    
                    {ESLVal _v1126 = _v123;
                    
                    {ESLVal l2 = $663;
                    
                    {ESLVal n2 = $662;
                    
                    {ESLVal _v1127 = $661;
                    
                    return typeEqual.apply(_v1126,substType.apply(new ESLVal("RecType",l2,n2,_v1127),n2,_v1127));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $660 = _v122.termRef(0);
                    ESLVal $659 = _v122.termRef(1);
                    ESLVal $658 = _v122.termRef(2);
                    
                    {ESLVal _v1124 = _v123;
                    
                    {ESLVal l1 = $660;
                    
                    {ESLVal ns2 = $659;
                    
                    {ESLVal _v1125 = $658;
                    
                    return typeEqual.apply(_v1124,_v1125);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v1131 = _v123;
                    
                    {ESLVal _v1132 = _v122;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1141 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1141,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1140 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1139 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1139,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1137 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1138 = $661;
                  
                  return typeEqual.apply(_v1137,substType.apply(new ESLVal("RecType",l2,n2,_v1138),n2,_v1138));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1135 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1136 = $658;
                  
                  return typeEqual.apply(_v1135,_v1136);
                }
                }
                }
                }
                }
                default: {ESLVal _v1142 = _v123;
                  
                  {ESLVal _v1143 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $733 = _v123.termRef(0);
              ESLVal $732 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "BagType": {ESLVal $735 = _v122.termRef(0);
                ESLVal $734 = _v122.termRef(1);
                
                {ESLVal l1 = $733;
                
                {ESLVal _v1054 = $732;
                
                {ESLVal l2 = $735;
                
                {ESLVal _v1055 = $734;
                
                return typeEqual.apply(_v1054,_v1055);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1062 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1062,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1061 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1060 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1060,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1058 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1059 = $661;
                  
                  return typeEqual.apply(_v1058,substType.apply(new ESLVal("RecType",l2,n2,_v1059),n2,_v1059));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1056 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1057 = $658;
                  
                  return typeEqual.apply(_v1056,_v1057);
                }
                }
                }
                }
                }
                default: {ESLVal _v1063 = _v123;
                  
                  {ESLVal _v1064 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $729 = _v123.termRef(0);
              ESLVal $728 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "SetType": {ESLVal $731 = _v122.termRef(0);
                ESLVal $730 = _v122.termRef(1);
                
                {ESLVal l1 = $729;
                
                {ESLVal _v1043 = $728;
                
                {ESLVal l2 = $731;
                
                {ESLVal _v1044 = $730;
                
                return typeEqual.apply(_v1043,_v1044);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1051 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1051,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1050 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1049 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1049,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1047 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1048 = $661;
                  
                  return typeEqual.apply(_v1047,substType.apply(new ESLVal("RecType",l2,n2,_v1048),n2,_v1048));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1045 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1046 = $658;
                  
                  return typeEqual.apply(_v1045,_v1046);
                }
                }
                }
                }
                }
                default: {ESLVal _v1052 = _v123;
                  
                  {ESLVal _v1053 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "StrType": {ESLVal $726 = _v123.termRef(0);
              
              switch(_v122.termName) {
              case "StrType": {ESLVal $727 = _v122.termRef(0);
                
                {ESLVal l1 = $726;
                
                {ESLVal l2 = $727;
                
                return $true;
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1040 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1040,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1039 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1038 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1038,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1036 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1037 = $661;
                  
                  return typeEqual.apply(_v1036,substType.apply(new ESLVal("RecType",l2,n2,_v1037),n2,_v1037));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1034 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1035 = $658;
                  
                  return typeEqual.apply(_v1034,_v1035);
                }
                }
                }
                }
                }
                default: {ESLVal _v1041 = _v123;
                  
                  {ESLVal _v1042 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VoidType": {ESLVal $725 = _v123.termRef(0);
              
              {ESLVal l1 = $725;
              
              {ESLVal t = _v122;
              
              return $true;
            }
            }
            }
          case "FieldType": {ESLVal $721 = _v123.termRef(0);
              ESLVal $720 = _v123.termRef(1);
              ESLVal $719 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "FieldType": {ESLVal $724 = _v122.termRef(0);
                ESLVal $723 = _v122.termRef(1);
                ESLVal $722 = _v122.termRef(2);
                
                {ESLVal l1 = $721;
                
                {ESLVal n1 = $720;
                
                {ESLVal _v1023 = $719;
                
                {ESLVal l2 = $724;
                
                {ESLVal n2 = $723;
                
                {ESLVal _v1024 = $722;
                
                return n1.eql(n2).and(typeEqual.apply(_v1023,_v1024));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1031 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1031,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1030 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1029 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1029,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1027 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1028 = $661;
                  
                  return typeEqual.apply(_v1027,substType.apply(new ESLVal("RecType",l2,n2,_v1028),n2,_v1028));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1025 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1026 = $658;
                  
                  return typeEqual.apply(_v1025,_v1026);
                }
                }
                }
                }
                }
                default: {ESLVal _v1032 = _v123;
                  
                  {ESLVal _v1033 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $715 = _v123.termRef(0);
              ESLVal $714 = _v123.termRef(1);
              ESLVal $713 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "TermType": {ESLVal $718 = _v122.termRef(0);
                ESLVal $717 = _v122.termRef(1);
                ESLVal $716 = _v122.termRef(2);
                
                {ESLVal l1 = $715;
                
                {ESLVal n1 = $714;
                
                {ESLVal args1 = $713;
                
                {ESLVal l2 = $718;
                
                {ESLVal n2 = $717;
                
                {ESLVal args2 = $716;
                
                if(n1.eql(n2).boolVal)
                return typesEqual.apply(args1,args2);
                else
                  return $false;
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $715;
                
                {ESLVal n1 = $714;
                
                {ESLVal args1 = $713;
                
                {ESLVal _v1022 = _v122;
                
                return $false;
              }
              }
              }
              }
            }
            }
          case "FunType": {ESLVal $709 = _v123.termRef(0);
              ESLVal $708 = _v123.termRef(1);
              ESLVal $707 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "FunType": {ESLVal $712 = _v122.termRef(0);
                ESLVal $711 = _v122.termRef(1);
                ESLVal $710 = _v122.termRef(2);
                
                {ESLVal l1 = $709;
                
                {ESLVal d1 = $708;
                
                {ESLVal r1 = $707;
                
                {ESLVal l2 = $712;
                
                {ESLVal d2 = $711;
                
                {ESLVal r2 = $710;
                
                return typeEqual.apply(r1,r2).and(typesEqual.apply(d1,d2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1019 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1019,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1018 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1017 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1017,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1015 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1016 = $661;
                  
                  return typeEqual.apply(_v1015,substType.apply(new ESLVal("RecType",l2,n2,_v1016),n2,_v1016));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1013 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1014 = $658;
                  
                  return typeEqual.apply(_v1013,_v1014);
                }
                }
                }
                }
                }
                default: {ESLVal _v1020 = _v123;
                  
                  {ESLVal _v1021 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $706 = _v123.termRef(0);
              
              {ESLVal f = $706;
              
              {ESLVal _v1012 = _v122;
              
              return typeEqual.apply(f.apply(),_v1012);
            }
            }
            }
          case "RecordType": {ESLVal $703 = _v123.termRef(0);
              ESLVal $702 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "RecordType": {ESLVal $705 = _v122.termRef(0);
                ESLVal $704 = _v122.termRef(1);
                
                {ESLVal l1 = $703;
                
                {ESLVal fs1 = $702;
                
                {ESLVal l2 = $705;
                
                {ESLVal fs2 = $704;
                
                return recordTypeEqual.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v1009 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v1009,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v1008 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v1007 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v1007,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v1005 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v1006 = $661;
                  
                  return typeEqual.apply(_v1005,substType.apply(new ESLVal("RecType",l2,n2,_v1006),n2,_v1006));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v1003 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v1004 = $658;
                  
                  return typeEqual.apply(_v1003,_v1004);
                }
                }
                }
                }
                }
                default: {ESLVal _v1010 = _v123;
                  
                  {ESLVal _v1011 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $698 = _v123.termRef(0);
              ESLVal $697 = _v123.termRef(1);
              ESLVal $696 = _v123.termRef(2);
              
              switch(_v122.termName) {
              case "RecType": {ESLVal $701 = _v122.termRef(0);
                ESLVal $700 = _v122.termRef(1);
                ESLVal $699 = _v122.termRef(2);
                
                {ESLVal l1 = $698;
                
                {ESLVal n1 = $697;
                
                {ESLVal _v995 = $696;
                
                {ESLVal l2 = $701;
                
                {ESLVal n2 = $700;
                
                {ESLVal _v996 = $699;
                
                if(n1.eql(n2).boolVal)
                return typeEqual.apply(_v995,_v996);
                else
                  {ESLVal _v997 = $698;
                    
                    {ESLVal _v998 = $697;
                    
                    {ESLVal _v999 = $696;
                    
                    {ESLVal _v1000 = _v122;
                    
                    return typeEqual.apply(substType.apply(new ESLVal("RecType",_v997,_v998,_v999),_v998,_v999),_v1000);
                  }
                  }
                  }
                  }
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $698;
                
                {ESLVal n1 = $697;
                
                {ESLVal _v1001 = $696;
                
                {ESLVal _v1002 = _v122;
                
                return typeEqual.apply(substType.apply(new ESLVal("RecType",l1,n1,_v1001),n1,_v1001),_v1002);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $693 = _v123.termRef(0);
              ESLVal $692 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "UnionType": {ESLVal $695 = _v122.termRef(0);
                ESLVal $694 = _v122.termRef(1);
                
                {ESLVal l1 = $693;
                
                {ESLVal terms1 = $692;
                
                {ESLVal l2 = $695;
                
                {ESLVal terms2 = $694;
                
                return typeSetEqual.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v992 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v992,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v991 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v990 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v990,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v988 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v989 = $661;
                  
                  return typeEqual.apply(_v988,substType.apply(new ESLVal("RecType",l2,n2,_v989),n2,_v989));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v986 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v987 = $658;
                  
                  return typeEqual.apply(_v986,_v987);
                }
                }
                }
                }
                }
                default: {ESLVal _v993 = _v123;
                  
                  {ESLVal _v994 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $689 = _v123.termRef(0);
              ESLVal $688 = _v123.termRef(1);
              
              switch(_v122.termName) {
              case "VarType": {ESLVal $691 = _v122.termRef(0);
                ESLVal $690 = _v122.termRef(1);
                
                {ESLVal l1 = $689;
                
                {ESLVal n1 = $688;
                
                {ESLVal l2 = $691;
                
                {ESLVal n2 = $690;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v122.termName) {
                case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                  ESLVal $670 = _v122.termRef(1);
                  ESLVal $669 = _v122.termRef(2);
                  
                  {ESLVal _v983 = _v123;
                  
                  {ESLVal l = $671;
                  
                  {ESLVal op = $670;
                  
                  {ESLVal args = $669;
                  
                  return typeEqual.apply(_v983,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $668 = _v122.termRef(0);
                  
                  {ESLVal t = _v123;
                  
                  {ESLVal l1 = $668;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $667 = _v122.termRef(0);
                  ESLVal $666 = _v122.termRef(1);
                  ESLVal $665 = _v122.termRef(2);
                  
                  {ESLVal _v982 = _v123;
                  
                  {ESLVal l2 = $667;
                  
                  {ESLVal n2 = $666;
                  
                  {ESLVal args2 = $665;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                  
                  {ESLVal _v981 = _v123;
                  
                  {ESLVal f = $664;
                  
                  return typeEqual.apply(_v981,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $663 = _v122.termRef(0);
                  ESLVal $662 = _v122.termRef(1);
                  ESLVal $661 = _v122.termRef(2);
                  
                  {ESLVal _v979 = _v123;
                  
                  {ESLVal l2 = $663;
                  
                  {ESLVal n2 = $662;
                  
                  {ESLVal _v980 = $661;
                  
                  return typeEqual.apply(_v979,substType.apply(new ESLVal("RecType",l2,n2,_v980),n2,_v980));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $660 = _v122.termRef(0);
                  ESLVal $659 = _v122.termRef(1);
                  ESLVal $658 = _v122.termRef(2);
                  
                  {ESLVal _v977 = _v123;
                  
                  {ESLVal l1 = $660;
                  
                  {ESLVal ns2 = $659;
                  
                  {ESLVal _v978 = $658;
                  
                  return typeEqual.apply(_v977,_v978);
                }
                }
                }
                }
                }
                default: {ESLVal _v984 = _v123;
                  
                  {ESLVal _v985 = _v122;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $674 = _v123.termRef(0);
              ESLVal $673 = _v123.termRef(1);
              ESLVal $672 = _v123.termRef(2);
              
              if($673.isCons())
              {ESLVal $678 = $673.head();
                ESLVal $679 = $673.tail();
                
                if($679.isCons())
                {ESLVal $680 = $679.head();
                  ESLVal $681 = $679.tail();
                  
                  switch(_v122.termName) {
                  case "ForallType": {ESLVal $677 = _v122.termRef(0);
                    ESLVal $676 = _v122.termRef(1);
                    ESLVal $675 = _v122.termRef(2);
                    
                    {ESLVal l1 = $674;
                    
                    {ESLVal ns1 = $673;
                    
                    {ESLVal _v934 = $672;
                    
                    {ESLVal _v935 = $677;
                    
                    {ESLVal ns2 = $676;
                    
                    {ESLVal _v936 = $675;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v934,_v936));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $674;
                    
                    {ESLVal ns1 = $673;
                    
                    {ESLVal _v937 = $672;
                    
                    {ESLVal _v938 = _v122;
                    
                    return typeEqual.apply(_v937,_v938);
                  }
                  }
                  }
                  }
                }
                }
              else if($679.isNil())
                switch($672.termName) {
                  case "ListType": {ESLVal $683 = $672.termRef(0);
                    ESLVal $682 = $672.termRef(1);
                    
                    switch($682.termName) {
                    case "VarType": {ESLVal $685 = $682.termRef(0);
                      ESLVal $684 = $682.termRef(1);
                      
                      switch(_v122.termName) {
                      case "ListType": {ESLVal $687 = _v122.termRef(0);
                        ESLVal $686 = _v122.termRef(1);
                        
                        {ESLVal l2 = $674;
                        
                        {ESLVal v1 = $678;
                        
                        {ESLVal l3 = $683;
                        
                        {ESLVal l4 = $685;
                        
                        {ESLVal v2 = $684;
                        
                        {ESLVal l1 = $687;
                        
                        {ESLVal _v939 = $686;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v122.termName) {
                            case "ForallType": {ESLVal $677 = _v122.termRef(0);
                              ESLVal $676 = _v122.termRef(1);
                              ESLVal $675 = _v122.termRef(2);
                              
                              {ESLVal _v940 = $674;
                              
                              {ESLVal ns1 = $673;
                              
                              {ESLVal _v941 = $672;
                              
                              {ESLVal _v942 = $677;
                              
                              {ESLVal ns2 = $676;
                              
                              {ESLVal _v943 = $675;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v941,_v943));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v944 = $674;
                              
                              {ESLVal ns1 = $673;
                              
                              {ESLVal _v945 = $672;
                              
                              {ESLVal _v946 = _v122;
                              
                              return typeEqual.apply(_v945,_v946);
                            }
                            }
                            }
                            }
                          }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: switch(_v122.termName) {
                        case "ForallType": {ESLVal $677 = _v122.termRef(0);
                          ESLVal $676 = _v122.termRef(1);
                          ESLVal $675 = _v122.termRef(2);
                          
                          {ESLVal l1 = $674;
                          
                          {ESLVal ns1 = $673;
                          
                          {ESLVal _v947 = $672;
                          
                          {ESLVal _v948 = $677;
                          
                          {ESLVal ns2 = $676;
                          
                          {ESLVal _v949 = $675;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v947,_v949));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $674;
                          
                          {ESLVal ns1 = $673;
                          
                          {ESLVal _v950 = $672;
                          
                          {ESLVal _v951 = _v122;
                          
                          return typeEqual.apply(_v950,_v951);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v122.termName) {
                      case "ForallType": {ESLVal $677 = _v122.termRef(0);
                        ESLVal $676 = _v122.termRef(1);
                        ESLVal $675 = _v122.termRef(2);
                        
                        {ESLVal l1 = $674;
                        
                        {ESLVal ns1 = $673;
                        
                        {ESLVal _v952 = $672;
                        
                        {ESLVal _v953 = $677;
                        
                        {ESLVal ns2 = $676;
                        
                        {ESLVal _v954 = $675;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v952,_v954));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $674;
                        
                        {ESLVal ns1 = $673;
                        
                        {ESLVal _v955 = $672;
                        
                        {ESLVal _v956 = _v122;
                        
                        return typeEqual.apply(_v955,_v956);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v122.termName) {
                    case "ForallType": {ESLVal $677 = _v122.termRef(0);
                      ESLVal $676 = _v122.termRef(1);
                      ESLVal $675 = _v122.termRef(2);
                      
                      {ESLVal l1 = $674;
                      
                      {ESLVal ns1 = $673;
                      
                      {ESLVal _v957 = $672;
                      
                      {ESLVal _v958 = $677;
                      
                      {ESLVal ns2 = $676;
                      
                      {ESLVal _v959 = $675;
                      
                      return ns1.eql(ns2).and(typeEqual.apply(_v957,_v959));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $674;
                      
                      {ESLVal ns1 = $673;
                      
                      {ESLVal _v960 = $672;
                      
                      {ESLVal _v961 = _v122;
                      
                      return typeEqual.apply(_v960,_v961);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v122.termName) {
                  case "ForallType": {ESLVal $677 = _v122.termRef(0);
                    ESLVal $676 = _v122.termRef(1);
                    ESLVal $675 = _v122.termRef(2);
                    
                    {ESLVal l1 = $674;
                    
                    {ESLVal ns1 = $673;
                    
                    {ESLVal _v962 = $672;
                    
                    {ESLVal _v963 = $677;
                    
                    {ESLVal ns2 = $676;
                    
                    {ESLVal _v964 = $675;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v962,_v964));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $674;
                    
                    {ESLVal ns1 = $673;
                    
                    {ESLVal _v965 = $672;
                    
                    {ESLVal _v966 = _v122;
                    
                    return typeEqual.apply(_v965,_v966);
                  }
                  }
                  }
                  }
                }
              }
            else if($673.isNil())
              switch(_v122.termName) {
                case "ForallType": {ESLVal $677 = _v122.termRef(0);
                  ESLVal $676 = _v122.termRef(1);
                  ESLVal $675 = _v122.termRef(2);
                  
                  {ESLVal l1 = $674;
                  
                  {ESLVal ns1 = $673;
                  
                  {ESLVal _v967 = $672;
                  
                  {ESLVal _v968 = $677;
                  
                  {ESLVal ns2 = $676;
                  
                  {ESLVal _v969 = $675;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v967,_v969));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $674;
                  
                  {ESLVal ns1 = $673;
                  
                  {ESLVal _v970 = $672;
                  
                  {ESLVal _v971 = _v122;
                  
                  return typeEqual.apply(_v970,_v971);
                }
                }
                }
                }
              }
            else switch(_v122.termName) {
                case "ForallType": {ESLVal $677 = _v122.termRef(0);
                  ESLVal $676 = _v122.termRef(1);
                  ESLVal $675 = _v122.termRef(2);
                  
                  {ESLVal l1 = $674;
                  
                  {ESLVal ns1 = $673;
                  
                  {ESLVal _v972 = $672;
                  
                  {ESLVal _v973 = $677;
                  
                  {ESLVal ns2 = $676;
                  
                  {ESLVal _v974 = $675;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v972,_v974));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $674;
                  
                  {ESLVal ns1 = $673;
                  
                  {ESLVal _v975 = $672;
                  
                  {ESLVal _v976 = _v122;
                  
                  return typeEqual.apply(_v975,_v976);
                }
                }
                }
                }
              }
            }
            default: switch(_v122.termName) {
              case "ApplyTypeFun": {ESLVal $671 = _v122.termRef(0);
                ESLVal $670 = _v122.termRef(1);
                ESLVal $669 = _v122.termRef(2);
                
                {ESLVal _v1198 = _v123;
                
                {ESLVal l = $671;
                
                {ESLVal op = $670;
                
                {ESLVal args = $669;
                
                return typeEqual.apply(_v1198,applyTypeFun.apply(l,forceType.apply(op),args));
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $668 = _v122.termRef(0);
                
                {ESLVal t = _v123;
                
                {ESLVal l1 = $668;
                
                return $true;
              }
              }
              }
            case "TermType": {ESLVal $667 = _v122.termRef(0);
                ESLVal $666 = _v122.termRef(1);
                ESLVal $665 = _v122.termRef(2);
                
                {ESLVal _v1197 = _v123;
                
                {ESLVal l2 = $667;
                
                {ESLVal n2 = $666;
                
                {ESLVal args2 = $665;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $664 = _v122.termRef(0);
                
                {ESLVal _v1196 = _v123;
                
                {ESLVal f = $664;
                
                return typeEqual.apply(_v1196,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $663 = _v122.termRef(0);
                ESLVal $662 = _v122.termRef(1);
                ESLVal $661 = _v122.termRef(2);
                
                {ESLVal _v1194 = _v123;
                
                {ESLVal l2 = $663;
                
                {ESLVal n2 = $662;
                
                {ESLVal _v1195 = $661;
                
                return typeEqual.apply(_v1194,substType.apply(new ESLVal("RecType",l2,n2,_v1195),n2,_v1195));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $660 = _v122.termRef(0);
                ESLVal $659 = _v122.termRef(1);
                ESLVal $658 = _v122.termRef(2);
                
                {ESLVal _v1192 = _v123;
                
                {ESLVal l1 = $660;
                
                {ESLVal ns2 = $659;
                
                {ESLVal _v1193 = $658;
                
                return typeEqual.apply(_v1192,_v1193);
              }
              }
              }
              }
              }
              default: {ESLVal _v1199 = _v123;
                
                {ESLVal _v1200 = _v122;
                
                return $false;
              }
              }
            }
          }
          }
    }
  });
  private static ESLVal actEqual = new ESLVal(new Function(new ESLVal("actEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal exports1 = $args[0];
  ESLVal exports2 = $args[1];
  ESLVal handlers1 = $args[2];
  ESLVal handlers2 = $args[3];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun365"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun366"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports2);
          }
        }),exports1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun367"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun368"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun369"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun370"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers2);
          }
        }),handlers1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun371"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun372"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers1);
          }
        }),handlers2))));
    }
  });
  private static ESLVal equalDec = new ESLVal(new Function(new ESLVal("equalDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v121 = d1;
        ESLVal _v120 = d2;
        
        switch(_v121.termName) {
        case "Dec": {ESLVal $653 = _v121.termRef(0);
          ESLVal $652 = _v121.termRef(1);
          ESLVal $651 = _v121.termRef(2);
          ESLVal $650 = _v121.termRef(3);
          
          switch(_v120.termName) {
          case "Dec": {ESLVal $657 = _v120.termRef(0);
            ESLVal $656 = _v120.termRef(1);
            ESLVal $655 = _v120.termRef(2);
            ESLVal $654 = _v120.termRef(3);
            
            {ESLVal l1 = $653;
            
            {ESLVal n1 = $652;
            
            {ESLVal t1 = $651;
            
            {ESLVal st1 = $650;
            
            {ESLVal l2 = $657;
            
            {ESLVal n2 = $656;
            
            {ESLVal t2 = $655;
            
            {ESLVal st2 = $654;
            
            return n1.eql(n2).and(typeEqual.apply(t1,t2));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(22587,22718)"));
        }
        }
        default: return error(new ESLVal("case error at Pos(22587,22718)"));
      }
      }
    }
  });
  private static ESLVal equalMessage = new ESLVal(new Function(new ESLVal("equalMessage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v119 = m1;
        ESLVal _v118 = m2;
        
        switch(_v119.termName) {
        case "MessageType": {ESLVal $647 = _v119.termRef(0);
          ESLVal $646 = _v119.termRef(1);
          
          switch(_v118.termName) {
          case "MessageType": {ESLVal $649 = _v118.termRef(0);
            ESLVal $648 = _v118.termRef(1);
            
            {ESLVal l1 = $647;
            
            {ESLVal ts1 = $646;
            
            {ESLVal l2 = $649;
            
            {ESLVal ts2 = $648;
            
            return typesEqual.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(22764,22874)"));
        }
        }
        default: return error(new ESLVal("case error at Pos(22764,22874)"));
      }
      }
    }
  });
  private static ESLVal recordTypeEqual = new ESLVal(new Function(new ESLVal("recordTypeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun373"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun374"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return typeEqual.apply(t1,t2);
                }
              }),fields2);
          }
        }),fields1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun375"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun376"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return typeEqual.apply(t1,t2);
                }
              }),fields1);
          }
        }),fields2));
    }
  });
  private static ESLVal applyTypeFun = new ESLVal(new Function(new ESLVal("applyTypeFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal op = $args[1];
  ESLVal args = $args[2];
  {ESLVal _v117 = op;
        
        switch(_v117.termName) {
        case "RecType": {ESLVal $645 = _v117.termRef(0);
          ESLVal $644 = _v117.termRef(1);
          ESLVal $643 = _v117.termRef(2);
          
          {ESLVal lr = $645;
          
          {ESLVal n = $644;
          
          {ESLVal t = $643;
          
          return applyTypeFun.apply(l,unfoldType.apply(lr,n,t),args);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $642 = _v117.termRef(0);
          ESLVal $641 = _v117.termRef(1);
          ESLVal $640 = _v117.termRef(2);
          
          {ESLVal _v932 = $642;
          
          {ESLVal names = $641;
          
          {ESLVal t = $640;
          
          if(length.apply(args).eql(length.apply(names)).boolVal)
          return substTypeEnv.apply(zipTypeEnv.apply(names,args),t);
          else
            return error(new ESLVal("TypeError",_v932,new ESLVal("type fun expects ").add(length.apply(names).add(new ESLVal(" args, but supplied with ").add(length.apply(args))))));
        }
        }
        }
        }
        default: {ESLVal _v933 = _v117;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(_v933,ESLVal.list()))));
        }
      }
      }
    }
  });
  private static ESLVal unfoldType = new ESLVal(new Function(new ESLVal("unfoldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal t = $args[2];
  return substType.apply(new ESLVal("RecType",l,n,t),n,t);
    }
  });
  private static ESLVal forceType = new ESLVal(new Function(new ESLVal("forceType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v116 = t;
        
        switch(_v116.termName) {
        case "TypeClosure": {ESLVal $639 = _v116.termRef(0);
          
          {ESLVal f = $639;
          
          return forceType.apply(f.apply());
        }
        }
        default: {ESLVal _v931 = _v116;
          
          return _v931;
        }
      }
      }
    }
  });
  private static ESLVal typesEqual = new ESLVal(new Function(new ESLVal("typesEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v115 = ts1;
        ESLVal _v114 = ts2;
        
        if(_v115.isCons())
        {ESLVal $633 = _v115.head();
          ESLVal $634 = _v115.tail();
          
          if(_v114.isCons())
          {ESLVal $635 = _v114.head();
            ESLVal $636 = _v114.tail();
            
            {ESLVal t1 = $633;
            
            {ESLVal _v924 = $634;
            
            {ESLVal t2 = $635;
            
            {ESLVal _v925 = $636;
            
            return typeEqual.apply(t1,t2).and(typesEqual.apply(_v924,_v925));
          }
          }
          }
          }
          }
        else if(_v114.isNil())
          if(_v114.isCons())
            {ESLVal $631 = _v114.head();
              ESLVal $632 = _v114.tail();
              
              return error(new ESLVal("case error at Pos(23884,24094)"));
            }
          else if(_v114.isNil())
            {ESLVal _v926 = _v115;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(23884,24094)"));
        else if(_v114.isCons())
            {ESLVal $631 = _v114.head();
              ESLVal $632 = _v114.tail();
              
              return error(new ESLVal("case error at Pos(23884,24094)"));
            }
          else if(_v114.isNil())
            {ESLVal _v927 = _v115;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(23884,24094)"));
        }
      else if(_v115.isNil())
        if(_v114.isCons())
          {ESLVal $637 = _v114.head();
            ESLVal $638 = _v114.tail();
            
            {ESLVal _v928 = _v114;
            
            return $false;
          }
          }
        else if(_v114.isNil())
          return $true;
        else {ESLVal _v929 = _v114;
            
            return $false;
          }
      else if(_v114.isCons())
          {ESLVal $631 = _v114.head();
            ESLVal $632 = _v114.tail();
            
            return error(new ESLVal("case error at Pos(23884,24094)"));
          }
        else if(_v114.isNil())
          {ESLVal _v930 = _v115;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(23884,24094)"));
      }
    }
  });
  private static ESLVal typeSetEqual = new ESLVal(new Function(new ESLVal("typeSetEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal types1 = $args[0];
  ESLVal types2 = $args[1];
  return typeSubset.apply(types1,types2).and(typeSubset.apply(types2,types1));
    }
  });
  private static ESLVal typeSubset = new ESLVal(new Function(new ESLVal("typeSubset"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sub = $args[0];
  ESLVal sup = $args[1];
  {ESLVal _v113 = sub;
        
        if(_v113.isCons())
        {ESLVal $629 = _v113.head();
          ESLVal $630 = _v113.tail();
          
          {ESLVal t = $629;
          
          {ESLVal _v923 = $630;
          
          return typeMember.apply(t,sup).and(typeSubset.apply(_v923,sup));
        }
        }
        }
      else if(_v113.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(24254,24360)"));
      }
    }
  });
  private static ESLVal typeMember = new ESLVal(new Function(new ESLVal("typeMember"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v112 = types;
        
        if(_v112.isCons())
        {ESLVal $627 = _v112.head();
          ESLVal $628 = _v112.tail();
          
          {ESLVal tt = $627;
          
          {ESLVal _v920 = $628;
          
          if(typeEqual.apply(t,tt).boolVal)
          return $true;
          else
            {ESLVal _v921 = $627;
              
              {ESLVal _v922 = $628;
              
              return typeMember.apply(t,_v922);
            }
            }
        }
        }
        }
      else if(_v112.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(24406,24553)"));
      }
    }
  });
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v919 = $args[0];
  ESLVal _v918 = $args[1];
  ESLVal _v917 = $args[2];
  ESLVal _v916 = $args[3];
  ESLVal _v915 = $args[4];
  ESLVal _v914 = $args[5];
  ESLVal _v913 = $args[6];
  {ESLVal bt = expType.apply(_v918,_v916,_v915,_v914,_v913);
        
        if(isBoolType.apply(bt).boolVal)
        return expType.apply(_v917,_v916,_v915,_v914,_v913);
        else
          return error(new ESLVal("TypeError",_v919,new ESLVal("guarded expression requires a boolean value: ").add(ppType.apply(bt,_v913))));
      }
    }
  });
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v898 = $args[0];
  ESLVal _v897 = $args[1];
  ESLVal _v896 = $args[2];
  ESLVal _v895 = $args[3];
  ESLVal _v894 = $args[4];
  {ESLVal _v110 = _v898;
        
        switch(_v110.termName) {
        case "ActExp": {ESLVal $626 = _v110.termRef(0);
          ESLVal $625 = _v110.termRef(1);
          ESLVal $624 = _v110.termRef(2);
          ESLVal $623 = _v110.termRef(3);
          ESLVal $622 = _v110.termRef(4);
          ESLVal $621 = _v110.termRef(5);
          ESLVal $620 = _v110.termRef(6);
          ESLVal $619 = _v110.termRef(7);
          
          {ESLVal l = $626;
          
          {ESLVal n = $625;
          
          {ESLVal args = $624;
          
          {ESLVal exports = $623;
          
          {ESLVal spec = $622;
          
          {ESLVal bindings = $621;
          
          {ESLVal init = $620;
          
          {ESLVal arms = $619;
          
          return actType.apply(l,n,args,exports,bindings,init,arms,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Apply": {ESLVal $618 = _v110.termRef(0);
          ESLVal $617 = _v110.termRef(1);
          ESLVal $616 = _v110.termRef(2);
          
          {ESLVal l = $618;
          
          {ESLVal op = $617;
          
          {ESLVal args = $616;
          
          return applyType.apply(l,op,args,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $615 = _v110.termRef(0);
          ESLVal $614 = _v110.termRef(1);
          ESLVal $613 = _v110.termRef(2);
          
          {ESLVal l = $615;
          
          {ESLVal _v912 = $614;
          
          {ESLVal ts = $613;
          
          return applyTypeExp.apply(l,_v912,ts,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $612 = _v110.termRef(0);
          ESLVal $611 = _v110.termRef(1);
          ESLVal $610 = _v110.termRef(2);
          ESLVal $609 = _v110.termRef(3);
          
          {ESLVal l = $612;
          
          {ESLVal a = $611;
          
          {ESLVal i = $610;
          
          {ESLVal v = $609;
          
          return arrayUpdateType.apply(l,a,i,v,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $608 = _v110.termRef(0);
          ESLVal $607 = _v110.termRef(1);
          ESLVal $606 = _v110.termRef(2);
          
          {ESLVal l = $608;
          
          {ESLVal a = $607;
          
          {ESLVal i = $606;
          
          return arrayRefType.apply(l,a,i,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Become": {ESLVal $605 = _v110.termRef(0);
          ESLVal $604 = _v110.termRef(1);
          
          {ESLVal l = $605;
          
          {ESLVal _v911 = $604;
          
          return becomeType.apply(l,_v911,_v897,_v896,_v895,_v894);
        }
        }
        }
      case "BinExp": {ESLVal $603 = _v110.termRef(0);
          ESLVal $602 = _v110.termRef(1);
          ESLVal $601 = _v110.termRef(2);
          ESLVal $600 = _v110.termRef(3);
          
          {ESLVal l = $603;
          
          {ESLVal e1 = $602;
          
          {ESLVal op = $601;
          
          {ESLVal e2 = $600;
          
          return binExpType.apply(l,e1,op,e2,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "Block": {ESLVal $599 = _v110.termRef(0);
          ESLVal $598 = _v110.termRef(1);
          
          {ESLVal l = $599;
          
          {ESLVal es = $598;
          
          return blockType.apply(l,es,_v897,_v896,_v895,_v894);
        }
        }
        }
      case "BoolExp": {ESLVal $597 = _v110.termRef(0);
          ESLVal $596 = _v110.termRef(1);
          
          {ESLVal l = $597;
          
          {ESLVal b = $596;
          
          return new ESLVal("BoolType",l);
        }
        }
        }
      case "Case": {ESLVal $595 = _v110.termRef(0);
          ESLVal $594 = _v110.termRef(1);
          ESLVal $593 = _v110.termRef(2);
          ESLVal $592 = _v110.termRef(3);
          
          {ESLVal l = $595;
          
          {ESLVal decs = $594;
          
          {ESLVal es = $593;
          
          {ESLVal arms = $592;
          
          return caseType.apply(l,es,arms,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "Cmp": {ESLVal $591 = _v110.termRef(0);
          ESLVal $590 = _v110.termRef(1);
          ESLVal $589 = _v110.termRef(2);
          
          {ESLVal l = $591;
          
          {ESLVal _v910 = $590;
          
          {ESLVal qs = $589;
          
          return cmpType.apply(l,_v910,qs,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Grab": {ESLVal $588 = _v110.termRef(0);
          ESLVal $587 = _v110.termRef(1);
          ESLVal $586 = _v110.termRef(2);
          
          {ESLVal l = $588;
          
          {ESLVal refs = $587;
          
          {ESLVal _v909 = $586;
          
          return expType.apply(_v909,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "FloatExp": {ESLVal $585 = _v110.termRef(0);
          ESLVal $584 = _v110.termRef(1);
          
          {ESLVal l = $585;
          
          {ESLVal f = $584;
          
          return new ESLVal("FloatType",l);
        }
        }
        }
      case "Fold": {ESLVal $583 = _v110.termRef(0);
          ESLVal $582 = _v110.termRef(1);
          ESLVal $581 = _v110.termRef(2);
          
          {ESLVal l = $583;
          
          {ESLVal t = $582;
          
          {ESLVal _v908 = $581;
          
          return foldType.apply(l,t,_v908,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "For": {ESLVal $580 = _v110.termRef(0);
          ESLVal $579 = _v110.termRef(1);
          ESLVal $578 = _v110.termRef(2);
          ESLVal $577 = _v110.termRef(3);
          
          {ESLVal l = $580;
          
          {ESLVal p = $579;
          
          {ESLVal list = $578;
          
          {ESLVal _v907 = $577;
          
          return forType.apply(l,p,list,_v907,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $576 = _v110.termRef(0);
          ESLVal $575 = _v110.termRef(1);
          ESLVal $574 = _v110.termRef(2);
          ESLVal $573 = _v110.termRef(3);
          ESLVal $572 = _v110.termRef(4);
          
          {ESLVal l = $576;
          
          {ESLVal n = $575;
          
          {ESLVal args = $574;
          
          {ESLVal t = $573;
          
          {ESLVal _v906 = $572;
          
          return funType.apply(l,n,args,t,_v906,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $571 = _v110.termRef(0);
          ESLVal $570 = _v110.termRef(1);
          ESLVal $569 = _v110.termRef(2);
          ESLVal $568 = _v110.termRef(3);
          
          {ESLVal l = $571;
          
          {ESLVal e1 = $570;
          
          {ESLVal e2 = $569;
          
          {ESLVal e3 = $568;
          
          return ifType.apply(l,e1,e2,e3,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "IntExp": {ESLVal $567 = _v110.termRef(0);
          ESLVal $566 = _v110.termRef(1);
          
          {ESLVal l = $567;
          
          {ESLVal n = $566;
          
          return new ESLVal("IntType",l);
        }
        }
        }
      case "Let": {ESLVal $565 = _v110.termRef(0);
          ESLVal $564 = _v110.termRef(1);
          ESLVal $563 = _v110.termRef(2);
          
          {ESLVal l = $565;
          
          {ESLVal bs = $564;
          
          {ESLVal _v905 = $563;
          
          return letType.apply(l,bs,_v905,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Letrec": {ESLVal $562 = _v110.termRef(0);
          ESLVal $561 = _v110.termRef(1);
          ESLVal $560 = _v110.termRef(2);
          
          {ESLVal l = $562;
          
          {ESLVal bs = $561;
          
          {ESLVal _v904 = $560;
          
          return letrecType.apply(l,bs,_v904,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "List": {ESLVal $559 = _v110.termRef(0);
          ESLVal $558 = _v110.termRef(1);
          
          {ESLVal l = $559;
          
          {ESLVal es = $558;
          
          return listType.apply(l,es,_v897,_v896,_v895,_v894);
        }
        }
        }
      case "Now": {ESLVal $557 = _v110.termRef(0);
          
          {ESLVal l = $557;
          
          return new ESLVal("IntType",l);
        }
        }
      case "Probably": {ESLVal $556 = _v110.termRef(0);
          ESLVal $555 = _v110.termRef(1);
          ESLVal $554 = _v110.termRef(2);
          ESLVal $553 = _v110.termRef(3);
          ESLVal $552 = _v110.termRef(4);
          
          {ESLVal l = $556;
          
          {ESLVal p = $555;
          
          {ESLVal t = $554;
          
          {ESLVal e1 = $553;
          
          {ESLVal e2 = $552;
          
          return probablyType.apply(l,p,t,e1,e2,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
        }
      case "Record": {ESLVal $551 = _v110.termRef(0);
          ESLVal $550 = _v110.termRef(1);
          
          {ESLVal l = $551;
          
          {ESLVal fields = $550;
          
          return recordType.apply(l,fields,_v897,_v896,_v895,_v894);
        }
        }
        }
      case "Ref": {ESLVal $549 = _v110.termRef(0);
          ESLVal $548 = _v110.termRef(1);
          ESLVal $547 = _v110.termRef(2);
          
          {ESLVal l = $549;
          
          {ESLVal _v903 = $548;
          
          {ESLVal n = $547;
          
          return refType.apply(l,_v903,n,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Self": {ESLVal $546 = _v110.termRef(0);
          
          {ESLVal l = $546;
          
          return _v897;
        }
        }
      case "Send": {ESLVal $541 = _v110.termRef(0);
          ESLVal $540 = _v110.termRef(1);
          ESLVal $539 = _v110.termRef(2);
          
          switch($539.termName) {
          case "Term": {ESLVal $545 = $539.termRef(0);
            ESLVal $544 = $539.termRef(1);
            ESLVal $543 = $539.termRef(2);
            ESLVal $542 = $539.termRef(3);
            
            {ESLVal l = $541;
            
            {ESLVal target = $540;
            
            {ESLVal tl = $545;
            
            {ESLVal n = $544;
            
            {ESLVal ts = $543;
            
            {ESLVal args = $542;
            
            return sendType.apply(l,target,n,args,_v897,_v896,_v895,_v894);
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(25029,28427)"));
        }
        }
      case "StrExp": {ESLVal $538 = _v110.termRef(0);
          ESLVal $537 = _v110.termRef(1);
          
          {ESLVal l = $538;
          
          {ESLVal s = $537;
          
          return new ESLVal("StrType",l);
        }
        }
        }
      case "Term": {ESLVal $536 = _v110.termRef(0);
          ESLVal $535 = _v110.termRef(1);
          ESLVal $534 = _v110.termRef(2);
          ESLVal $533 = _v110.termRef(3);
          
          {ESLVal l = $536;
          
          {ESLVal n = $535;
          
          {ESLVal ts = $534;
          
          {ESLVal es = $533;
          
          return termType.apply(l,n,ts,es,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $532 = _v110.termRef(0);
          ESLVal $531 = _v110.termRef(1);
          ESLVal $530 = _v110.termRef(2);
          
          {ESLVal l = $532;
          
          {ESLVal t = $531;
          
          {ESLVal _v902 = $530;
          
          return throwType.apply(l,t,_v902,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Try": {ESLVal $529 = _v110.termRef(0);
          ESLVal $528 = _v110.termRef(1);
          ESLVal $527 = _v110.termRef(2);
          
          {ESLVal l = $529;
          
          {ESLVal _v901 = $528;
          
          {ESLVal arms = $527;
          
          return tryType.apply(l,_v901,arms,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "New": {ESLVal $526 = _v110.termRef(0);
          ESLVal $525 = _v110.termRef(1);
          ESLVal $524 = _v110.termRef(2);
          
          {ESLVal l = $526;
          
          {ESLVal b = $525;
          
          {ESLVal args = $524;
          
          return newType.apply(l,b,args,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "NewArray": {ESLVal $523 = _v110.termRef(0);
          ESLVal $522 = _v110.termRef(1);
          ESLVal $521 = _v110.termRef(2);
          
          {ESLVal l = $523;
          
          {ESLVal t = $522;
          
          {ESLVal i = $521;
          
          return newArrayType.apply(l,t,i,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "NewJava": {ESLVal $520 = _v110.termRef(0);
          ESLVal $519 = _v110.termRef(1);
          ESLVal $518 = _v110.termRef(2);
          ESLVal $517 = _v110.termRef(3);
          
          {ESLVal l = $520;
          
          {ESLVal path = $519;
          
          {ESLVal t = $518;
          
          {ESLVal args = $517;
          
          {{
          ESLVal _v111 = args;
          while(_v111.isCons()) {
            ESLVal a = _v111.headVal;
            expType.apply(a,_v897,_v896,_v895,_v894);
            _v111 = _v111.tailVal;}
        }
        return substTypeEnv.apply(_v894,t);}
        }
        }
        }
        }
        }
      case "Not": {ESLVal $516 = _v110.termRef(0);
          ESLVal $515 = _v110.termRef(1);
          
          {ESLVal l = $516;
          
          {ESLVal _v900 = $515;
          
          return notType.apply(l,_v900,_v897,_v896,_v895,_v894);
        }
        }
        }
      case "NullExp": {ESLVal $514 = _v110.termRef(0);
          
          {ESLVal l = $514;
          
          return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
        }
        }
      case "Update": {ESLVal $513 = _v110.termRef(0);
          ESLVal $512 = _v110.termRef(1);
          ESLVal $511 = _v110.termRef(2);
          
          {ESLVal l = $513;
          
          {ESLVal n = $512;
          
          {ESLVal _v899 = $511;
          
          return updateType.apply(l,n,_v899,_v897,_v896,_v895,_v894);
        }
        }
        }
        }
      case "Var": {ESLVal $510 = _v110.termRef(0);
          ESLVal $509 = _v110.termRef(1);
          
          {ESLVal l = $510;
          
          {ESLVal n = $509;
          
          return varType.apply(l,n,_v896);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(25029,28427)"));
      }
      }
    }
  });
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v893 = $args[0];
  ESLVal _v892 = $args[1];
  ESLVal _v891 = $args[2];
  ESLVal _v890 = $args[3];
  ESLVal _v889 = $args[4];
  ESLVal _v888 = $args[5];
  ESLVal _v887 = $args[6];
  {ESLVal valType = expType.apply(_v891,_v890,_v889,_v888,_v887);
        
        return substTypeEnv.apply(_v887,_v892);
      }
    }
  });
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v886 = $args[0];
  ESLVal _v885 = $args[1];
  ESLVal _v884 = $args[2];
  ESLVal _v883 = $args[3];
  ESLVal _v882 = $args[4];
  ESLVal _v881 = $args[5];
  ESLVal _v880 = $args[6];
  {ESLVal eType = expType.apply(_v884,_v883,_v882,_v881,_v880);
        
        if(typeEqual.apply(substTypeEnv.apply(_v880,_v885),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",_v886,new ESLVal("fold type ").add(ppType.apply(_v885,_v880).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v880))))));
      }
    }
  });
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v879 = $args[0];
  ESLVal _v878 = $args[1];
  ESLVal _v877 = $args[2];
  ESLVal _v876 = $args[3];
  ESLVal _v875 = $args[4];
  ESLVal _v874 = $args[5];
  ESLVal _v873 = $args[6];
  ESLVal _v872 = $args[7];
  {ESLVal aType = expType.apply(_v878,_v875,_v874,_v873,_v872);
        ESLVal iType = expType.apply(_v877,_v875,_v874,_v873,_v872);
        ESLVal vType = expType.apply(_v876,_v875,_v874,_v873,_v872);
        
        {ESLVal _v109 = aType;
        
        switch(_v109.termName) {
        case "ArrayType": {ESLVal $508 = _v109.termRef(0);
          ESLVal $507 = _v109.termRef(1);
          
          {ESLVal al = $508;
          
          {ESLVal t = $507;
          
          if(isIntType.apply(iType).boolVal)
          if(typeEqual.apply(vType,t).boolVal)
            return aType;
            else
              return error(new ESLVal("TypeError",_v879,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
          else
            return error(new ESLVal("TypeError",_v879,new ESLVal("array index should be an integer ").add(_v877)));
        }
        }
        }
        default: {ESLVal t = _v109;
          
          return error(new ESLVal("TypeError",_v879,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v871 = $args[0];
  ESLVal _v870 = $args[1];
  ESLVal _v869 = $args[2];
  ESLVal _v868 = $args[3];
  ESLVal _v867 = $args[4];
  ESLVal _v866 = $args[5];
  ESLVal _v865 = $args[6];
  {ESLVal aType = expType.apply(_v870,_v868,_v867,_v866,_v865);
        ESLVal iType = expType.apply(_v869,_v868,_v867,_v866,_v865);
        
        {ESLVal _v108 = aType;
        
        switch(_v108.termName) {
        case "ArrayType": {ESLVal $506 = _v108.termRef(0);
          ESLVal $505 = _v108.termRef(1);
          
          {ESLVal al = $506;
          
          {ESLVal t = $505;
          
          if(isIntType.apply(iType).boolVal)
          return t;
          else
            return error(new ESLVal("TypeError",_v871,new ESLVal("array index should be an integer ").add(_v869)));
        }
        }
        }
        default: {ESLVal t = _v108;
          
          return error(new ESLVal("TypeError",_v871,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v864 = $args[0];
  ESLVal _v863 = $args[1];
  ESLVal _v862 = $args[2];
  ESLVal _v861 = $args[3];
  ESLVal _v860 = $args[4];
  ESLVal _v859 = $args[5];
  ESLVal _v858 = $args[6];
  {ESLVal i = expType.apply(_v862,_v861,_v860,_v859,_v858);
        
        if(isIntType.apply(i).boolVal)
        return new ESLVal("ArrayType",_v864,substTypeEnv.apply(_v858,_v863));
        else
          return error(new ESLVal("TypeError",_v864,new ESLVal("expecting an integer type: ").add(i)));
      }
    }
  });
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v857 = $args[0];
  ESLVal _v856 = $args[1];
  ESLVal _v855 = $args[2];
  ESLVal _v854 = $args[3];
  ESLVal _v853 = $args[4];
  ESLVal _v852 = $args[5];
  {ESLVal bType = expType.apply(_v856,_v855,_v854,_v853,_v852);
        
        if(typeEqual.apply(bType,_v855).boolVal)
        return bType;
        else
          return error(new ESLVal("TypeError",_v857,new ESLVal("expecting become to match self type: ").add(ppType.apply(bType,_v852).add(new ESLVal(" ").add(ppType.apply(_v855,_v852))))));
      }
    }
  });
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v848 = $args[0];
  ESLVal _v847 = $args[1];
  ESLVal _v846 = $args[2];
  ESLVal _v845 = $args[3];
  ESLVal _v844 = $args[4];
  ESLVal _v843 = $args[5];
  ESLVal _v842 = $args[6];
  ESLVal _v841 = $args[7];
  ESLVal _v840 = $args[8];
  {ESLVal pt = expType.apply(_v847,_v843,_v842,_v841,_v840);
        
        if(isIntType.apply(pt).boolVal)
        {ESLVal _v851 = substTypeEnv.apply(_v840,_v846);
          ESLVal _v850 = expType.apply(_v845,_v843,_v842,_v841,_v840);
          ESLVal _v849 = expType.apply(_v844,_v843,_v842,_v841,_v840);
          
          if(typeEqual.apply(_v851,_v850).and(typeEqual.apply(_v851,_v849)).boolVal)
          return _v851;
          else
            return error(new ESLVal("TypeError",_v848,new ESLVal("expecting probably arm types to agree: ").add(ppType.apply(_v850,_v840).add(new ESLVal(" ").add(ppType.apply(_v851,_v840).add(new ESLVal(" ").add(ppType.apply(_v849,_v840))))))));
        }
        else
          return error(new ESLVal("TypeError",_v848,new ESLVal("expecting an integer: ").add(ppType.apply(pt,_v840))));
      }
    }
  });
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v839 = $args[0];
  ESLVal _v838 = $args[1];
  ESLVal _v837 = $args[2];
  ESLVal _v836 = $args[3];
  ESLVal _v835 = $args[4];
  ESLVal _v834 = $args[5];
  ESLVal _v833 = $args[6];
  return expType.apply(new ESLVal("Apply",_v839,_v838,_v837),_v836,_v835,_v834,_v833);
    }
  });
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v822 = $args[0];
  ESLVal _v821 = $args[1];
  ESLVal _v820 = $args[2];
  ESLVal _v819 = $args[3];
  ESLVal _v818 = $args[4];
  ESLVal _v817 = $args[5];
  ESLVal _v816 = $args[6];
  ESLVal _v815 = $args[7];
  {ESLVal _v105 = typeNF.apply(derefType.apply(expType.apply(_v821,_v818,_v817,_v816,_v815)),_v815);
        
        switch(_v105.termName) {
        case "ActType": {ESLVal $484 = _v105.termRef(0);
          ESLVal $483 = _v105.termRef(1);
          ESLVal $482 = _v105.termRef(2);
          
          {ESLVal al = $484;
          
          {ESLVal exports = $483;
          
          {ESLVal handlers = $482;
          
          LetRec letrec = new LetRec() {
          ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v823 = $args[0];
            {ESLVal _v106 = _v823;
                  
                  if(_v106.isCons())
                  {ESLVal $485 = _v106.head();
                    ESLVal $486 = _v106.tail();
                    
                    switch($485.termName) {
                    case "MessageType": {ESLVal $488 = $485.termRef(0);
                      ESLVal $487 = $485.termRef(1);
                      
                      if($487.isCons())
                      {ESLVal $489 = $487.head();
                        ESLVal $490 = $487.tail();
                        
                        switch($489.termName) {
                        case "TermType": {ESLVal $493 = $489.termRef(0);
                          ESLVal $492 = $489.termRef(1);
                          ESLVal $491 = $489.termRef(2);
                          
                          if($490.isCons())
                          {ESLVal $494 = $490.head();
                            ESLVal $495 = $490.tail();
                            
                            {ESLVal m = $485;
                            
                            {ESLVal _v824 = $486;
                            
                            return findHandler.apply(_v824);
                          }
                          }
                          }
                        else if($490.isNil())
                          {ESLVal ml = $488;
                            
                            {ESLVal tl = $493;
                            
                            {ESLVal m = $492;
                            
                            {ESLVal ts = $491;
                            
                            {ESLVal rest = $486;
                            
                            if(m.eql(_v820).boolVal)
                            return head.apply(_v823);
                            else
                              {ESLVal _v825 = $485;
                                
                                {ESLVal _v826 = $486;
                                
                                return findHandler.apply(_v826);
                              }
                              }
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal m = $485;
                            
                            {ESLVal _v827 = $486;
                            
                            return findHandler.apply(_v827);
                          }
                          }
                        }
                        default: {ESLVal m = $485;
                          
                          {ESLVal _v828 = $486;
                          
                          return findHandler.apply(_v828);
                        }
                        }
                      }
                      }
                    else if($487.isNil())
                      {ESLVal m = $485;
                        
                        {ESLVal _v829 = $486;
                        
                        return findHandler.apply(_v829);
                      }
                      }
                    else {ESLVal m = $485;
                        
                        {ESLVal _v830 = $486;
                        
                        return findHandler.apply(_v830);
                      }
                      }
                    }
                    default: {ESLVal m = $485;
                      
                      {ESLVal _v831 = $486;
                      
                      return findHandler.apply(_v831);
                    }
                    }
                  }
                  }
                else if(_v106.isNil())
                  return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820)));
                else return error(new ESLVal("case error at Pos(32032,32339)"));
                }
              }
            });
          
          public ESLVal get(String name) {
            switch(name) {
              case "findHandler": return findHandler;
              
              default: throw new Error("cannot find letrec binding");
            }
            }
          };
        ESLVal findHandler = letrec.get("findHandler");
        
          {ESLVal _v107 = findHandler.apply(handlers);
          
          switch(_v107.termName) {
          case "MessageType": {ESLVal $497 = _v107.termRef(0);
            ESLVal $496 = _v107.termRef(1);
            
            if($496.isCons())
            {ESLVal $498 = $496.head();
              ESLVal $499 = $496.tail();
              
              switch($498.termName) {
              case "TermType": {ESLVal $502 = $498.termRef(0);
                ESLVal $501 = $498.termRef(1);
                ESLVal $500 = $498.termRef(2);
                
                if($499.isCons())
                {ESLVal $503 = $499.head();
                  ESLVal $504 = $499.tail();
                  
                  {ESLVal m = _v107;
                  
                  return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
                }
                }
              else if($499.isNil())
                {ESLVal ml = $497;
                  
                  {ESLVal tl = $502;
                  
                  {ESLVal _v832 = $501;
                  
                  {ESLVal ts1 = $500;
                  
                  {ESLVal ts2 = expTypes.apply(_v819,_v818,_v817,_v816,_v815);
                  
                  if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                  if(typesEqual.apply(ts1,ts2).boolVal)
                    {expType.apply(_v821,_v818,_v817,_v816,_v815);
                    return new ESLVal("VoidType",_v822);}
                    else
                      return error(new ESLVal("TypeError",_v822,new ESLVal("message argument types ").add(ppTypes.apply(ts2,_v815).add(new ESLVal(" do not match expected types ").add(ppTypes.apply(ts1,_v815))))));
                  else
                    return error(new ESLVal("TypeError",_v822,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
                }
                }
                }
                }
                }
              else {ESLVal m = _v107;
                  
                  return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
                }
              }
              default: {ESLVal m = _v107;
                
                return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            }
          else if($496.isNil())
            {ESLVal m = _v107;
              
              return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
            }
          else {ESLVal m = _v107;
              
              return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          default: {ESLVal m = _v107;
            
            return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find message handler named ").add(_v820.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        }
        
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(31817,33167)"));
      }
      }
    }
  });
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v773 = $args[0];
  ESLVal _v772 = $args[1];
  ESLVal _v771 = $args[2];
  ESLVal _v770 = $args[3];
  ESLVal _v769 = $args[4];
  ESLVal _v768 = $args[5];
  ESLVal _v767 = $args[6];
  ESLVal _v766 = $args[7];
  ESLVal _v765 = $args[8];
  ESLVal _v764 = $args[9];
  ESLVal _v763 = $args[10];
  LetRec letrec = new LetRec() {
        ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v806 = $args[0];
          ESLVal _v805 = $args[1];
          {ESLVal _v104 = _v805;
                
                if(_v104.isCons())
                {ESLVal $468 = _v104.head();
                  ESLVal $469 = _v104.tail();
                  
                  switch($468.termName) {
                  case "Binding": {ESLVal $481 = $468.termRef(0);
                    ESLVal $480 = $468.termRef(1);
                    ESLVal $479 = $468.termRef(2);
                    ESLVal $478 = $468.termRef(3);
                    ESLVal $477 = $468.termRef(4);
                    
                    {ESLVal _v810 = $481;
                    
                    {ESLVal m = $480;
                    
                    {ESLVal t = $479;
                    
                    {ESLVal st = $478;
                    
                    {ESLVal e = $477;
                    
                    {ESLVal _v811 = $469;
                    
                    if(m.eql(_v806).boolVal)
                    return _v810;
                    else
                      {ESLVal b = $468;
                        
                        {ESLVal _v812 = $469;
                        
                        return findLoc.apply(_v806,_v812);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $476 = $468.termRef(0);
                    ESLVal $475 = $468.termRef(1);
                    ESLVal $474 = $468.termRef(2);
                    ESLVal $473 = $468.termRef(3);
                    ESLVal $472 = $468.termRef(4);
                    ESLVal $471 = $468.termRef(5);
                    ESLVal $470 = $468.termRef(6);
                    
                    {ESLVal _v807 = $476;
                    
                    {ESLVal m = $475;
                    
                    {ESLVal ps = $474;
                    
                    {ESLVal t = $473;
                    
                    {ESLVal st = $472;
                    
                    {ESLVal g = $471;
                    
                    {ESLVal e = $470;
                    
                    {ESLVal _v808 = $469;
                    
                    if(m.eql(_v806).boolVal)
                    return _v807;
                    else
                      {ESLVal b = $468;
                        
                        {ESLVal _v809 = $469;
                        
                        return findLoc.apply(_v806,_v809);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal b = $468;
                    
                    {ESLVal _v813 = $469;
                    
                    return findLoc.apply(_v806,_v813);
                  }
                  }
                }
                }
              else if(_v104.isNil())
                return p0;
              else return error(new ESLVal("case error at Pos(33665,33969)"));
              }
            }
          });
        ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v797 = $args[0];
          ESLVal _v796 = $args[1];
          {ESLVal _v103 = _v796;
                
                if(_v103.isCons())
                {ESLVal $454 = _v103.head();
                  ESLVal $455 = _v103.tail();
                  
                  switch($454.termName) {
                  case "Binding": {ESLVal $467 = $454.termRef(0);
                    ESLVal $466 = $454.termRef(1);
                    ESLVal $465 = $454.termRef(2);
                    ESLVal $464 = $454.termRef(3);
                    ESLVal $463 = $454.termRef(4);
                    
                    {ESLVal _v801 = $467;
                    
                    {ESLVal m = $466;
                    
                    {ESLVal t = $465;
                    
                    {ESLVal st = $464;
                    
                    {ESLVal e = $463;
                    
                    {ESLVal _v802 = $455;
                    
                    if(m.eql(_v797).boolVal)
                    return substTypeEnv.apply(_v763,t);
                    else
                      {ESLVal b = $454;
                        
                        {ESLVal _v803 = $455;
                        
                        return findType.apply(_v797,_v803);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $462 = $454.termRef(0);
                    ESLVal $461 = $454.termRef(1);
                    ESLVal $460 = $454.termRef(2);
                    ESLVal $459 = $454.termRef(3);
                    ESLVal $458 = $454.termRef(4);
                    ESLVal $457 = $454.termRef(5);
                    ESLVal $456 = $454.termRef(6);
                    
                    {ESLVal _v798 = $462;
                    
                    {ESLVal m = $461;
                    
                    {ESLVal ps = $460;
                    
                    {ESLVal t = $459;
                    
                    {ESLVal st = $458;
                    
                    {ESLVal g = $457;
                    
                    {ESLVal e = $456;
                    
                    {ESLVal _v799 = $455;
                    
                    if(m.eql(_v797).boolVal)
                    return substTypeEnv.apply(_v763,t);
                    else
                      {ESLVal b = $454;
                        
                        {ESLVal _v800 = $455;
                        
                        return findType.apply(_v797,_v800);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal b = $454;
                    
                    {ESLVal _v804 = $455;
                    
                    return findType.apply(_v797,_v804);
                  }
                  }
                }
                }
              else if(_v103.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(34023,34380)"));
              }
            }
          });
        ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v792 = $args[0];
          {ESLVal _v102 = _v792;
                
                if(_v102.isCons())
                {ESLVal $452 = _v102.head();
                  ESLVal $453 = _v102.tail();
                  
                  {ESLVal m = $452;
                  
                  {ESLVal _v793 = $453;
                  
                  {ESLVal _v795 = findType.apply(m,_v769);
                  ESLVal _v794 = findLoc.apply(m,_v769);
                  
                  if(_v795.eql($null).boolVal)
                  return error(new ESLVal("TypeError",_v794,new ESLVal("cannot find exported name ").add(m)));
                  else
                    return decs.apply(_v793).cons(new ESLVal("Dec",_v794,m,_v795,_v795));
                }
                }
                }
                }
              else if(_v102.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(34422,34753)"));
              }
            }
          });
        ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v789 = $args[0];
          {ESLVal _v101 = _v789;
                
                if(_v101.isCons())
                {ESLVal $446 = _v101.head();
                  ESLVal $447 = _v101.tail();
                  
                  switch($446.termName) {
                  case "BArm": {ESLVal $451 = $446.termRef(0);
                    ESLVal $450 = $446.termRef(1);
                    ESLVal $449 = $446.termRef(2);
                    ESLVal $448 = $446.termRef(3);
                    
                    {ESLVal _v790 = $451;
                    
                    {ESLVal ps = $450;
                    
                    {ESLVal g = $449;
                    
                    {ESLVal e = $448;
                    
                    {ESLVal _v791 = $447;
                    
                    return getMessageTypes.apply(_v791).cons(getMessageType.apply(ps));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(34804,34959)"));
                }
                }
              else if(_v101.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(34804,34959)"));
              }
            }
          });
        ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ps = $args[0];
          {ESLVal _v100 = ps;
                
                if(_v100.isCons())
                {ESLVal $438 = _v100.head();
                  ESLVal $439 = _v100.tail();
                  
                  switch($438.termName) {
                  case "PTerm": {ESLVal $443 = $438.termRef(0);
                    ESLVal $442 = $438.termRef(1);
                    ESLVal $441 = $438.termRef(2);
                    ESLVal $440 = $438.termRef(3);
                    
                    if($439.isCons())
                    {ESLVal $444 = $439.head();
                      ESLVal $445 = $439.tail();
                      
                      return error(new ESLVal("case error at Pos(35009,35280)"));
                    }
                  else if($439.isNil())
                    {ESLVal pl = $443;
                      
                      {ESLVal termName = $442;
                      
                      {ESLVal targs = $441;
                      
                      {ESLVal _v788 = $440;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun377"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v773,p,_v766,_v765,_v764,_v763);
                          }
                        }),_v788);
                      
                      return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(35009,35280)"));
                  }
                  default: return error(new ESLVal("case error at Pos(35009,35280)"));
                }
                }
              else if(_v100.isNil())
                return error(new ESLVal("case error at Pos(35009,35280)"));
              else return error(new ESLVal("case error at Pos(35009,35280)"));
              }
            }
          });
        ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v785 = $args[0];
          ESLVal _v784 = $args[1];
          ESLVal _v783 = $args[2];
          {ESLVal _v99 = _v785;
                
                if(_v99.isCons())
                {ESLVal $432 = _v99.head();
                  ESLVal $433 = _v99.tail();
                  
                  switch($432.termName) {
                  case "BArm": {ESLVal $437 = $432.termRef(0);
                    ESLVal $436 = $432.termRef(1);
                    ESLVal $435 = $432.termRef(2);
                    ESLVal $434 = $432.termRef(3);
                    
                    {ESLVal _v786 = $437;
                    
                    {ESLVal ps = $436;
                    
                    {ESLVal g = $435;
                    
                    {ESLVal e = $434;
                    
                    {ESLVal _v787 = $433;
                    
                    {typeCheckArm.apply(_v786,ps,g,e,_v784,_v783);
                  return typeCheckArms.apply(_v787,_v784,_v783);}
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(35356,35583)"));
                }
                }
              else if(_v99.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(35356,35583)"));
              }
            }
          });
        ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v779 = $args[0];
          ESLVal _v778 = $args[1];
          ESLVal _v777 = $args[2];
          ESLVal _v776 = $args[3];
          ESLVal _v775 = $args[4];
          ESLVal _v774 = $args[5];
          {ESLVal _v98 = _v778;
                
                if(_v98.isCons())
                {ESLVal $424 = _v98.head();
                  ESLVal $425 = _v98.tail();
                  
                  switch($424.termName) {
                  case "PTerm": {ESLVal $429 = $424.termRef(0);
                    ESLVal $428 = $424.termRef(1);
                    ESLVal $427 = $424.termRef(2);
                    ESLVal $426 = $424.termRef(3);
                    
                    if($425.isCons())
                    {ESLVal $430 = $425.head();
                      ESLVal $431 = $425.tail();
                      
                      return error(new ESLVal("case error at Pos(35682,36131)"));
                    }
                  else if($425.isNil())
                    {ESLVal pl = $429;
                      
                      {ESLVal termName = $428;
                      
                      {ESLVal targs = $427;
                      
                      {ESLVal _v780 = $426;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun378"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v779,p,_v775,_v774,_v764,_v763);
                          }
                        }),_v780);
                      
                      {patternTypes.apply(_v779,_v780,ts,_v775,_v774,_v764,_v763,new ESLVal(new Function(new ESLVal("fun379"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v782 = $args[0];
                    ESLVal _v781 = $args[1];
                    return expType.apply(_v776,_v775,_v781,_v764,_v763);
                      }
                    }));
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(35682,36131)"));
                  }
                  default: return error(new ESLVal("case error at Pos(35682,36131)"));
                }
                }
              else if(_v98.isNil())
                return error(new ESLVal("case error at Pos(35682,36131)"));
              else return error(new ESLVal("case error at Pos(35682,36131)"));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "findLoc": return findLoc;
            
            case "findType": return findType;
            
            case "decs": return decs;
            
            case "getMessageTypes": return getMessageTypes;
            
            case "getMessageType": return getMessageType;
            
            case "typeCheckArms": return typeCheckArms;
            
            case "typeCheckArm": return typeCheckArm;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal findLoc = letrec.get("findLoc");
      
      ESLVal findType = letrec.get("findType");
      
      ESLVal decs = letrec.get("decs");
      
      ESLVal getMessageTypes = letrec.get("getMessageTypes");
      
      ESLVal getMessageType = letrec.get("getMessageType");
      
      ESLVal typeCheckArms = letrec.get("typeCheckArms");
      
      ESLVal typeCheckArm = letrec.get("typeCheckArm");
      
        {ESLVal localEnv = parBind.apply(_v769,_v766,_v765,_v764,_v763);
        
        {ESLVal exportedDecs = decs.apply(_v770);
        
        {ESLVal messageTypes = getMessageTypes.apply(_v767);
        
        {ESLVal _v814 = new ESLVal("ActType",_v773,exportedDecs,messageTypes);
        
        {typeCheckValues.apply(valueDefs.apply(_v769),_v814,localEnv.add(_v765),_v763,_v764);
      expType.apply(_v768,_v814,localEnv.add(_v765),_v764,_v763);
      typeCheckArms.apply(_v767,_v814,localEnv.add(_v765));
      return _v814;}
      }
      }
      }
      }
      
    }
  });
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v755 = $args[0];
  ESLVal _v754 = $args[1];
  ESLVal _v753 = $args[2];
  ESLVal _v752 = $args[3];
  ESLVal _v751 = $args[4];
  ESLVal _v750 = $args[5];
  ESLVal _v749 = $args[6];
  {ESLVal _v96 = _v753;
        
        if(_v96.isCons())
        {ESLVal $415 = _v96.head();
          ESLVal $416 = _v96.tail();
          
          switch($415.termName) {
          case "BQual": {ESLVal $421 = $415.termRef(0);
            ESLVal $420 = $415.termRef(1);
            ESLVal $419 = $415.termRef(2);
            
            {ESLVal _v758 = $421;
            
            {ESLVal p = $420;
            
            {ESLVal list = $419;
            
            {ESLVal _v759 = $416;
            
            {ESLVal lType = expType.apply(list,_v752,_v751,_v750,_v749);
            
            {ESLVal _v97 = lType;
            
            switch(_v97.termName) {
            case "ListType": {ESLVal $423 = _v97.termRef(0);
              ESLVal $422 = _v97.termRef(1);
              
              {ESLVal ll = $423;
              
              {ESLVal t = $422;
              
              {ESLVal _v760 = _v759;
              
              return patternType.apply(_v758,p,substTypeEnv.apply(_v749,t),_v752,_v751,_v750,_v749,new ESLVal(new Function(new ESLVal("fun380"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v762 = $args[0];
              ESLVal _v761 = $args[1];
              return cmpType.apply(_v758,_v754,_v760,_v752,_v761,_v750,_v749);
                }
              }));
            }
            }
            }
            }
            default: {ESLVal t = _v97;
              
              return error(new ESLVal("TypeError",_v758,new ESLVal("qualifier binding expects a list: ").add(ppType.apply(t,_v749))));
            }
          }
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $418 = $415.termRef(0);
            ESLVal $417 = $415.termRef(1);
            
            {ESLVal _v756 = $418;
            
            {ESLVal b = $417;
            
            {ESLVal _v757 = $416;
            
            {ESLVal bType = expType.apply(b,_v752,_v751,_v750,_v749);
            
            if(isBoolType.apply(bType).boolVal)
            return cmpType.apply(_v756,_v754,_v757,_v752,_v751,_v750,_v749);
            else
              return error(new ESLVal("TypeError",_v756,new ESLVal("qualifier expects a boolean type: ").add(ppType.apply(bType,_v749))));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(36743,37729)"));
        }
        }
      else if(_v96.isNil())
        {ESLVal t = expType.apply(_v754,_v752,_v751,_v750,_v749);
          
          return new ESLVal("ListType",_v755,t);
        }
      else return error(new ESLVal("case error at Pos(36743,37729)"));
      }
    }
  });
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v748 = $args[0];
  ESLVal _v747 = $args[1];
  ESLVal _v746 = $args[2];
  ESLVal _v745 = $args[3];
  ESLVal _v744 = $args[4];
  ESLVal _v743 = $args[5];
  ESLVal _v742 = $args[6];
  {ESLVal t = lookupType.apply(_v747,_v744);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v748,new ESLVal("unbound variable ").add(_v747)));
        else
          {ESLVal valueType = expType.apply(_v746,_v745,_v744,_v743,_v742);
            
            if(typeEqual.apply(valueType,t).boolVal)
            return valueType;
            else
              return error(new ESLVal("TypeError",_v748,new ESLVal("type of variable ").add(_v747.add(new ESLVal("::").add(ppType.apply(t,_v742).add(new ESLVal(" does not agree with value type ").add(ppType.apply(valueType,_v742))))))));
          }
      }
    }
  });
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v741 = $args[0];
  ESLVal _v740 = $args[1];
  ESLVal _v739 = $args[2];
  ESLVal _v738 = $args[3];
  ESLVal _v737 = $args[4];
  ESLVal _v736 = $args[5];
  ESLVal _v735 = $args[6];
  {ESLVal env = parBind.apply(_v740,_v738,_v737,_v736,_v735);
        
        {{
        ESLVal _v95 = _v740;
        while(_v95.isCons()) {
          ESLVal b = _v95.headVal;
          typeCheckDef.apply(b,_v738,_v737,env.add(_v737),_v736,_v735);
          _v95 = _v95.tailVal;}
      }
      return expType.apply(_v739,_v738,env.add(_v737),_v736,_v735);}
      }
    }
  });
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v734 = $args[0];
  ESLVal _v733 = $args[1];
  ESLVal _v732 = $args[2];
  ESLVal _v731 = $args[3];
  ESLVal _v730 = $args[4];
  ESLVal _v729 = $args[5];
  ESLVal _v728 = $args[6];
  {ESLVal env = recBind.apply(_v733,_v731,_v730,_v729,_v728);
        
        {{
        ESLVal _v94 = _v733;
        while(_v94.isCons()) {
          ESLVal b = _v94.headVal;
          typeCheckDef.apply(b,_v731,env.add(_v730),env.add(_v730),_v729,_v728);
          _v94 = _v94.tailVal;}
      }
      return expType.apply(_v732,_v731,env.add(_v730),_v729,_v728);}
      }
    }
  });
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal bs = $args[0];
  {ESLVal _v92 = bs;
        
        if(_v92.isCons())
        {ESLVal $413 = _v92.head();
          ESLVal $414 = _v92.tail();
          
          {ESLVal b = $413;
          
          {ESLVal _v726 = $414;
          
          if(member.apply(bindingName.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v93 = $qualArg;
              
              {ESLVal _v727 = _v93;
              
              return ESLVal.list(ESLVal.list(bindingName.apply(_v727)));
            }
            }
          }
        }).map(_v726).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",bindingLoc.apply(b),new ESLVal("duplicate definitions for ").add(bindingName.apply(b))));
          else
            return checkDupBindings.apply(_v726);
        }
        }
        }
      else if(_v92.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(38977,39242)"));
      }
    }
  });
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v725 = $args[0];
  ESLVal _v724 = $args[1];
  ESLVal _v723 = $args[2];
  ESLVal _v722 = $args[3];
  ESLVal _v721 = $args[4];
  {checkDupBindings.apply(_v725);
      return valueDefsToTEnv.apply(valueDefs.apply(_v725),_v724,_v723,_v722,_v721);}
    }
  });
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v720 = $args[0];
  ESLVal _v719 = $args[1];
  ESLVal _v718 = $args[2];
  ESLVal _v717 = $args[3];
  ESLVal _v716 = $args[4];
  return valueDefsToTEnv.apply(valueDefs.apply(_v720),_v719,_v718,_v717,_v716);
    }
  });
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v715 = $args[0];
  ESLVal _v714 = $args[1];
  ESLVal _v713 = $args[2];
  ESLVal _v712 = $args[3];
  ESLVal _v711 = $args[4];
  ESLVal _v710 = $args[5];
  ESLVal _v709 = $args[6];
  {ESLVal ts1 = expTypes.apply(_v714,_v712,_v711,_v710,_v709);
        
        {ESLVal ts2 = armTypes.apply(_v713,ts1,_v712,_v711,_v710,_v709);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v715,new ESLVal("case arm types do not agree: ").add(ppTypes.apply(ts1,_v709).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v709))))));
      }
      }
    }
  });
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v708 = $args[0];
  ESLVal _v707 = $args[1];
  ESLVal _v706 = $args[2];
  ESLVal _v705 = $args[3];
  ESLVal _v704 = $args[4];
  ESLVal _v703 = $args[5];
  ESLVal _v702 = $args[6];
  {ESLVal ts1 = expTypes.apply(ESLVal.list(_v707),_v705,_v704,_v703,_v702);
        
        {ESLVal ts2 = armTypes.apply(_v706,ts1,_v705,_v704,_v703,_v702);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v708,new ESLVal("try arm types do not agree: ").add(ppTypes.apply(ts1,_v702).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v702))))));
      }
      }
    }
  });
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v700 = $args[0];
  ESLVal _v699 = $args[1];
  ESLVal _v698 = $args[2];
  ESLVal _v697 = $args[3];
  ESLVal _v696 = $args[4];
  ESLVal _v695 = $args[5];
  {ESLVal _v91 = _v700;
        
        if(_v91.isCons())
        {ESLVal $411 = _v91.head();
          ESLVal $412 = _v91.tail();
          
          {ESLVal a = $411;
          
          {ESLVal _v701 = $412;
          
          return armTypes.apply(_v701,_v699,_v698,_v697,_v696,_v695).cons(armType.apply(a,_v699,_v698,_v697,_v696,_v695));
        }
        }
        }
      else if(_v91.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(40607,40776)"));
      }
    }
  });
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v692 = $args[0];
  ESLVal _v691 = $args[1];
  ESLVal _v690 = $args[2];
  ESLVal _v689 = $args[3];
  ESLVal _v688 = $args[4];
  ESLVal _v687 = $args[5];
  {ESLVal _v90 = _v692;
        
        switch(_v90.termName) {
        case "BArm": {ESLVal $410 = _v90.termRef(0);
          ESLVal $409 = _v90.termRef(1);
          ESLVal $408 = _v90.termRef(2);
          ESLVal $407 = _v90.termRef(3);
          
          {ESLVal l = $410;
          
          {ESLVal ps = $409;
          
          {ESLVal guard = $408;
          
          {ESLVal exp = $407;
          
          {checkPatterns.apply(l,ps);
        if(length.apply(ps).eql(length.apply(_v691)).boolVal)
          return patternTypes.apply(l,ps,_v691,_v690,_v689,_v688,_v687,new ESLVal(new Function(new ESLVal("fun381"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v694 = $args[0];
            ESLVal _v693 = $args[1];
            return guardedExpType.apply(l,guard,exp,_v690,_v693,_v688,_v687);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(_v691))))));}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(40878,41339)"));
      }
      }
    }
  });
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v671 = $args[0];
  ESLVal _v670 = $args[1];
  ESLVal _v669 = $args[2];
  ESLVal _v668 = $args[3];
  ESLVal _v667 = $args[4];
  ESLVal _v666 = $args[5];
  ESLVal _v665 = $args[6];
  LetRec letrec = new LetRec() {
        ESLVal t = derefType.apply(expType.apply(_v670,_v668,_v667,_v666,_v665));
        ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal decs = $args[0];
          {ESLVal _v88 = decs;
                
                if(_v88.isCons())
                {ESLVal $393 = _v88.head();
                  ESLVal $394 = _v88.tail();
                  
                  switch($393.termName) {
                  case "Dec": {ESLVal $398 = $393.termRef(0);
                    ESLVal $397 = $393.termRef(1);
                    ESLVal $396 = $393.termRef(2);
                    ESLVal $395 = $393.termRef(3);
                    
                    {ESLVal _v677 = $398;
                    
                    {ESLVal m = $397;
                    
                    {ESLVal t = $396;
                    
                    {ESLVal st = $395;
                    
                    {ESLVal _v678 = $394;
                    
                    if(m.eql(_v669).boolVal)
                    return t;
                    else
                      {ESLVal d = $393;
                        
                        {ESLVal _v679 = $394;
                        
                        return findExport.apply(_v679);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal d = $393;
                    
                    {ESLVal _v680 = $394;
                    
                    return findExport.apply(_v680);
                  }
                  }
                }
                }
              else if(_v88.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(41567,41740)"));
              }
            }
          });
        ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal fs = $args[0];
          {ESLVal _v87 = fs;
                
                if(_v87.isCons())
                {ESLVal $388 = _v87.head();
                  ESLVal $389 = _v87.tail();
                  
                  switch($388.termName) {
                  case "FieldType": {ESLVal $392 = $388.termRef(0);
                    ESLVal $391 = $388.termRef(1);
                    ESLVal $390 = $388.termRef(2);
                    
                    {ESLVal _v672 = $392;
                    
                    {ESLVal m = $391;
                    
                    {ESLVal t = $390;
                    
                    {ESLVal _v673 = $389;
                    
                    if(m.eql(_v669).boolVal)
                    return t;
                    else
                      {ESLVal _v674 = $388;
                        
                        {ESLVal _v675 = $389;
                        
                        return findField.apply(_v675);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t = $388;
                    
                    {ESLVal _v676 = $389;
                    
                    return findField.apply(_v676);
                  }
                  }
                }
                }
              else if(_v87.isNil())
                return error(new ESLVal("TypeError",_v671,new ESLVal("cannot find field name ").add(_v669)));
              else return error(new ESLVal("case error at Pos(41781,41986)"));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "t": return t;
            
            case "findExport": return findExport;
            
            case "findField": return findField;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal t = letrec.get("t");
      
      ESLVal findExport = letrec.get("findExport");
      
      ESLVal findField = letrec.get("findField");
      
        {ESLVal _v89 = t;
        
        switch(_v89.termName) {
        case "StrType": {ESLVal $406 = _v89.termRef(0);
          
          {ESLVal sl = $406;
          
          if(_v669.eql(new ESLVal("explode")).boolVal)
          return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
          else
            {ESLVal _v684 = $406;
              
              if(_v669.eql(new ESLVal("writeDate")).boolVal)
              return new ESLVal("FloatType",_v684);
              else
                {ESLVal _v685 = _v89;
                  
                  return error(new ESLVal("TypeError",_v671,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v685,_v665))));
                }
            }
        }
        }
      case "ListType": {ESLVal $405 = _v89.termRef(0);
          ESLVal $404 = _v89.termRef(1);
          
          {ESLVal ll = $405;
          
          {ESLVal _v682 = $404;
          
          if(_v669.eql(new ESLVal("implode")).boolVal)
          return new ESLVal("StrType",ll);
          else
            {ESLVal _v683 = _v89;
              
              return error(new ESLVal("TypeError",_v671,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v683,_v665))));
            }
        }
        }
        }
      case "RecordType": {ESLVal $403 = _v89.termRef(0);
          ESLVal $402 = _v89.termRef(1);
          
          {ESLVal rl = $403;
          
          {ESLVal fs = $402;
          
          return findField.apply(fs);
        }
        }
        }
      case "ActType": {ESLVal $401 = _v89.termRef(0);
          ESLVal $400 = _v89.termRef(1);
          ESLVal $399 = _v89.termRef(2);
          
          {ESLVal al = $401;
          
          {ESLVal exports = $400;
          
          {ESLVal handlers = $399;
          
          {ESLVal _v681 = findExport.apply(exports);
          
          if(_v681.eql($null).boolVal)
          return error(new ESLVal("TypeError",_v671,new ESLVal("behaviour type does not export ").add(_v669)));
          else
            return substTypeEnv.apply(_v665,_v681);
        }
        }
        }
        }
        }
        default: {ESLVal _v686 = _v89;
          
          return error(new ESLVal("TypeError",_v671,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v686,_v665))));
        }
      }
      }
      
    }
  });
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v86 = t;
        
        switch(_v86.termName) {
        case "TypeClosure": {ESLVal $387 = _v86.termRef(0);
          
          {ESLVal f = $387;
          
          return derefType.apply(f.apply());
        }
        }
        default: {ESLVal _v664 = _v86;
          
          return _v664;
        }
      }
      }
    }
  });
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v658 = $args[0];
  ESLVal _v657 = $args[1];
  ESLVal _v656 = $args[2];
  ESLVal _v655 = $args[3];
  ESLVal _v654 = $args[4];
  ESLVal _v653 = $args[5];
  LetRec letrec = new LetRec() {
        ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v659 = $args[0];
          {ESLVal _v85 = _v659;
                
                if(_v85.isCons())
                {ESLVal $380 = _v85.head();
                  ESLVal $381 = _v85.tail();
                  
                  switch($380.termName) {
                  case "Binding": {ESLVal $386 = $380.termRef(0);
                    ESLVal $385 = $380.termRef(1);
                    ESLVal $384 = $380.termRef(2);
                    ESLVal $383 = $380.termRef(3);
                    ESLVal $382 = $380.termRef(4);
                    
                    {ESLVal _v660 = $386;
                    
                    {ESLVal n = $385;
                    
                    {ESLVal t = $384;
                    
                    {ESLVal st = $383;
                    
                    {ESLVal e = $382;
                    
                    {ESLVal _v661 = $381;
                    
                    return fieldTypes.apply(_v661).cons(new ESLVal("FieldType",_v660,n,expType.apply(e,_v656,_v655,_v654,_v653)));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v662 = _v85;
                    
                    return error(new ESLVal("TypeError",_v658,new ESLVal("unknown field representation: ").add(_v662)));
                  }
                }
                }
              else if(_v85.isNil())
                return $nil;
              else {ESLVal _v663 = _v85;
                  
                  return error(new ESLVal("TypeError",_v658,new ESLVal("unknown field representation: ").add(_v663)));
                }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "fieldTypes": return fieldTypes;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal fieldTypes = letrec.get("fieldTypes");
      
        return new ESLVal("RecordType",_v658,fieldTypes.apply(_v657));
      
    }
  });
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v648 = $args[0];
  ESLVal _v647 = $args[1];
  ESLVal _v646 = $args[2];
  ESLVal _v645 = $args[3];
  ESLVal _v644 = $args[4];
  ESLVal _v643 = $args[5];
  ESLVal _v642 = $args[6];
  ESLVal _v641 = $args[7];
  {ESLVal _v649 = expType.apply(_v646,_v644,_v643,_v642,_v641);
        
        {ESLVal _v84 = _v649;
        
        switch(_v84.termName) {
        case "ListType": {ESLVal $379 = _v84.termRef(0);
          ESLVal $378 = _v84.termRef(1);
          
          {ESLVal _v650 = $379;
          
          {ESLVal t = $378;
          
          return patternType.apply(_v650,_v647,t,_v644,_v643,_v642,_v641,new ESLVal(new Function(new ESLVal("fun382"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v652 = $args[0];
          ESLVal _v651 = $args[1];
          return expType.apply(_v645,_v644,_v651,_v642,_v641);
            }
          }));
        }
        }
        }
        default: {ESLVal t = _v84;
          
          return error(new ESLVal("TypeError",_v648,new ESLVal("for type expects a list: ").add(_v646)));
        }
      }
      }
      }
    }
  });
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v622 = $args[0];
  ESLVal _v621 = $args[1];
  ESLVal _v620 = $args[2];
  ESLVal _v619 = $args[3];
  ESLVal _v618 = $args[4];
  ESLVal _v617 = $args[5];
  ESLVal _v616 = $args[6];
  ESLVal _v615 = $args[7];
  {ESLVal _v83 = _v621;
        ESLVal _v82 = _v620;
        
        if(_v83.isCons())
        {ESLVal $372 = _v83.head();
          ESLVal $373 = _v83.tail();
          
          if(_v82.isCons())
          {ESLVal $374 = _v82.head();
            ESLVal $375 = _v82.tail();
            
            {ESLVal p = $372;
            
            {ESLVal _v623 = $373;
            
            {ESLVal t = $374;
            
            {ESLVal _v624 = $375;
            
            {ESLVal _v626 = _v623;
            ESLVal _v625 = _v624;
            
            return patternType.apply(_v622,p,t,_v619,_v618,_v617,_v616,new ESLVal(new Function(new ESLVal("fun383"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v628 = $args[0];
            ESLVal _v627 = $args[1];
            return patternTypes.apply(_v622,_v626,_v625,_v619,_v627,_v617,_v616,new ESLVal(new Function(new ESLVal("fun384"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v630 = $args[0];
                  ESLVal _v629 = $args[1];
                  return _v615.apply(_v630.cons(_v628),_v629);
                    }
                  }));
              }
            }));
          }
          }
          }
          }
          }
          }
        else if(_v82.isNil())
          {ESLVal _v631 = _v83;
            
            {ESLVal _v632 = _v82;
            
            return error(new ESLVal("TypeError",_v622,new ESLVal("somthing wrong with ").add(_v631.add(new ESLVal(" ").add(_v632)))));
          }
          }
        else {ESLVal _v633 = _v83;
            
            {ESLVal _v634 = _v82;
            
            return error(new ESLVal("TypeError",_v622,new ESLVal("somthing wrong with ").add(_v633.add(new ESLVal(" ").add(_v634)))));
          }
          }
        }
      else if(_v83.isNil())
        if(_v82.isCons())
          {ESLVal $376 = _v82.head();
            ESLVal $377 = _v82.tail();
            
            {ESLVal _v635 = _v83;
            
            {ESLVal _v636 = _v82;
            
            return error(new ESLVal("TypeError",_v622,new ESLVal("somthing wrong with ").add(_v635.add(new ESLVal(" ").add(_v636)))));
          }
          }
          }
        else if(_v82.isNil())
          return _v615.apply($nil,_v618);
        else {ESLVal _v637 = _v83;
            
            {ESLVal _v638 = _v82;
            
            return error(new ESLVal("TypeError",_v622,new ESLVal("somthing wrong with ").add(_v637.add(new ESLVal(" ").add(_v638)))));
          }
          }
      else {ESLVal _v639 = _v83;
          
          {ESLVal _v640 = _v82;
          
          return error(new ESLVal("TypeError",_v622,new ESLVal("somthing wrong with ").add(_v639.add(new ESLVal(" ").add(_v640)))));
        }
        }
      }
    }
  });
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v599 = $args[0];
  ESLVal _v598 = $args[1];
  ESLVal _v597 = $args[2];
  ESLVal _v596 = $args[3];
  ESLVal _v595 = $args[4];
  ESLVal _v594 = $args[5];
  {ESLVal _v81 = _v598;
        
        switch(_v81.termName) {
        case "PApplyType": {ESLVal $371 = _v81.termRef(0);
          ESLVal $370 = _v81.termRef(1);
          ESLVal $369 = _v81.termRef(2);
          
          {ESLVal _v612 = $371;
          
          {ESLVal _v613 = $370;
          
          {ESLVal args = $369;
          
          return error(new ESLVal("should this happen?"));
        }
        }
        }
        }
      case "PBool": {ESLVal $368 = _v81.termRef(0);
          ESLVal $367 = _v81.termRef(1);
          
          {ESLVal _v611 = $368;
          
          {ESLVal b = $367;
          
          return new ESLVal("BoolType",_v611);
        }
        }
        }
      case "PCons": {ESLVal $366 = _v81.termRef(0);
          ESLVal $365 = _v81.termRef(1);
          ESLVal $364 = _v81.termRef(2);
          
          {ESLVal _v610 = $366;
          
          {ESLVal hd = $365;
          
          {ESLVal tl = $364;
          
          return getPatternType.apply(_v610,tl,_v597,_v596,_v595,_v594);
        }
        }
        }
        }
      case "PBagCons": {ESLVal $363 = _v81.termRef(0);
          ESLVal $362 = _v81.termRef(1);
          ESLVal $361 = _v81.termRef(2);
          
          {ESLVal _v609 = $363;
          
          {ESLVal hd = $362;
          
          {ESLVal tl = $361;
          
          return getPatternType.apply(_v609,tl,_v597,_v596,_v595,_v594);
        }
        }
        }
        }
      case "PSetCons": {ESLVal $360 = _v81.termRef(0);
          ESLVal $359 = _v81.termRef(1);
          ESLVal $358 = _v81.termRef(2);
          
          {ESLVal _v608 = $360;
          
          {ESLVal hd = $359;
          
          {ESLVal tl = $358;
          
          return getPatternType.apply(_v608,tl,_v597,_v596,_v595,_v594);
        }
        }
        }
        }
      case "PNil": {ESLVal $357 = _v81.termRef(0);
          
          {ESLVal _v607 = $357;
          
          return new ESLVal("ForallType",_v607,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v607,new ESLVal("VarType",_v607,new ESLVal("T"))));
        }
        }
      case "PNull": {ESLVal $356 = _v81.termRef(0);
          
          {ESLVal _v606 = $356;
          
          return new ESLVal("ForallType",_v606,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v606,new ESLVal("T")));
        }
        }
      case "PEmptyBag": {ESLVal $355 = _v81.termRef(0);
          
          {ESLVal _v605 = $355;
          
          return new ESLVal("ForallType",_v605,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v605,new ESLVal("VarType",_v605,new ESLVal("T"))));
        }
        }
      case "PEmptySet": {ESLVal $354 = _v81.termRef(0);
          
          {ESLVal _v604 = $354;
          
          return new ESLVal("ForallType",_v604,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v604,new ESLVal("VarType",_v604,new ESLVal("T"))));
        }
        }
      case "PInt": {ESLVal $353 = _v81.termRef(0);
          ESLVal $352 = _v81.termRef(1);
          
          {ESLVal _v603 = $353;
          
          {ESLVal n = $352;
          
          return new ESLVal("IntType",_v603);
        }
        }
        }
      case "PVar": {ESLVal $351 = _v81.termRef(0);
          ESLVal $350 = _v81.termRef(1);
          ESLVal $349 = _v81.termRef(2);
          
          {ESLVal _v602 = $351;
          
          {ESLVal n = $350;
          
          {ESLVal pt = $349;
          
          return substTypeEnv.apply(_v594,pt);
        }
        }
        }
        }
      case "PStr": {ESLVal $348 = _v81.termRef(0);
          ESLVal $347 = _v81.termRef(1);
          
          {ESLVal _v601 = $348;
          
          {ESLVal s = $347;
          
          return new ESLVal("StrType",_v601);
        }
        }
        }
      case "PTerm": {ESLVal $346 = _v81.termRef(0);
          ESLVal $345 = _v81.termRef(1);
          ESLVal $344 = _v81.termRef(2);
          ESLVal $343 = _v81.termRef(3);
          
          {ESLVal _v600 = $346;
          
          {ESLVal n = $345;
          
          {ESLVal ts = $344;
          
          {ESLVal ps = $343;
          
          return lookupType.apply(n,_v595);
        }
        }
        }
        }
        }
        default: {ESLVal _v614 = _v81;
          
          return error(new ESLVal("TypeError",_v599,new ESLVal("unknown type of pattern: ").add(_v614)));
        }
      }
      }
    }
  });
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v572 = $args[0];
  ESLVal _v571 = $args[1];
  ESLVal _v570 = $args[2];
  ESLVal _v569 = $args[3];
  ESLVal _v568 = $args[4];
  ESLVal _v567 = $args[5];
  ESLVal _v566 = $args[6];
  ESLVal _v565 = $args[7];
  {ESLVal _v80 = _v571;
        
        switch(_v80.termName) {
        case "PApplyType": {ESLVal $342 = _v80.termRef(0);
          ESLVal $341 = _v80.termRef(1);
          ESLVal $340 = _v80.termRef(2);
          
          {ESLVal _v591 = $342;
          
          {ESLVal _v592 = $341;
          
          {ESLVal args = $340;
          
          return applyTypePatternType.apply(_v591,_v592,substTypesEnv.apply(_v566,args),_v570,_v569,_v568,_v567,_v566,_v565);
        }
        }
        }
        }
      case "PBool": {ESLVal $339 = _v80.termRef(0);
          ESLVal $338 = _v80.termRef(1);
          
          {ESLVal _v590 = $339;
          
          {ESLVal b = $338;
          
          if(isBoolType.apply(_v570).boolVal)
          return _v565.apply(new ESLVal("BoolType",_v590),_v568);
          else
            return error(new ESLVal("TypeError",_v590,new ESLVal("type mismatch: Bool and ").add(ppType.apply(_v570,_v566))));
        }
        }
        }
      case "PBagCons": {ESLVal $337 = _v80.termRef(0);
          ESLVal $336 = _v80.termRef(1);
          ESLVal $335 = _v80.termRef(2);
          
          {ESLVal _v587 = $337;
          
          {ESLVal hd = $336;
          
          {ESLVal tl = $335;
          
          return bagConsPatternType.apply(_v587,hd,tl,_v570,_v569,_v568,_v567,_v566,new ESLVal(new Function(new ESLVal("fun385"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v589 = $args[0];
          ESLVal _v588 = $args[1];
          return _v565.apply(new ESLVal("ListType",_v587,_v589),_v588);
            }
          }));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $334 = _v80.termRef(0);
          ESLVal $333 = _v80.termRef(1);
          ESLVal $332 = _v80.termRef(2);
          
          {ESLVal _v584 = $334;
          
          {ESLVal hd = $333;
          
          {ESLVal tl = $332;
          
          return setConsPatternType.apply(_v584,hd,tl,_v570,_v569,_v568,_v567,_v566,new ESLVal(new Function(new ESLVal("fun386"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v586 = $args[0];
          ESLVal _v585 = $args[1];
          return _v565.apply(new ESLVal("ListType",_v584,_v586),_v585);
            }
          }));
        }
        }
        }
        }
      case "PCons": {ESLVal $331 = _v80.termRef(0);
          ESLVal $330 = _v80.termRef(1);
          ESLVal $329 = _v80.termRef(2);
          
          {ESLVal _v581 = $331;
          
          {ESLVal hd = $330;
          
          {ESLVal tl = $329;
          
          return consPatternType.apply(_v581,hd,tl,_v570,_v569,_v568,_v567,_v566,new ESLVal(new Function(new ESLVal("fun387"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v583 = $args[0];
          ESLVal _v582 = $args[1];
          return _v565.apply(new ESLVal("ListType",_v581,_v583),_v582);
            }
          }));
        }
        }
        }
        }
      case "PNil": {ESLVal $328 = _v80.termRef(0);
          
          {ESLVal _v580 = $328;
          
          return nilType.apply(_v580,_v570,_v569,_v568,_v567,_v566,_v565);
        }
        }
      case "PNull": {ESLVal $327 = _v80.termRef(0);
          
          {ESLVal _v579 = $327;
          
          return _v565.apply(_v570,_v568);
        }
        }
      case "PEmptyBag": {ESLVal $326 = _v80.termRef(0);
          
          {ESLVal _v578 = $326;
          
          return emptyBagType.apply(_v578,_v570,_v569,_v568,_v567,_v566,_v565);
        }
        }
      case "PEmptySet": {ESLVal $325 = _v80.termRef(0);
          
          {ESLVal _v577 = $325;
          
          return emptySetType.apply(_v577,_v570,_v569,_v568,_v567,_v566,_v565);
        }
        }
      case "PInt": {ESLVal $324 = _v80.termRef(0);
          ESLVal $323 = _v80.termRef(1);
          
          {ESLVal _v576 = $324;
          
          {ESLVal n = $323;
          
          if(isIntType.apply(_v570).boolVal)
          return _v565.apply(new ESLVal("IntType",_v576),_v568);
          else
            return error(new ESLVal("TypeError",_v576,new ESLVal("type mismatch: Int and ").add(ppType.apply(_v570,_v566))));
        }
        }
        }
      case "PVar": {ESLVal $322 = _v80.termRef(0);
          ESLVal $321 = _v80.termRef(1);
          ESLVal $320 = _v80.termRef(2);
          
          {ESLVal _v575 = $322;
          
          {ESLVal n = $321;
          
          {ESLVal pt = $320;
          
          return _v565.apply(_v570,ESLVal.list(new ESLVal("Map",n,_v570)).add(_v568));
        }
        }
        }
        }
      case "PStr": {ESLVal $319 = _v80.termRef(0);
          ESLVal $318 = _v80.termRef(1);
          
          {ESLVal _v574 = $319;
          
          {ESLVal s = $318;
          
          if(isStrType.apply(_v570).boolVal)
          return _v565.apply(new ESLVal("StrType",_v574),_v568);
          else
            return error(new ESLVal("TypeError",_v574,new ESLVal("type mismatch: Str and ").add(ppType.apply(_v570,_v566))));
        }
        }
        }
      case "PTerm": {ESLVal $317 = _v80.termRef(0);
          ESLVal $316 = _v80.termRef(1);
          ESLVal $315 = _v80.termRef(2);
          ESLVal $314 = _v80.termRef(3);
          
          {ESLVal _v573 = $317;
          
          {ESLVal n = $316;
          
          {ESLVal ts = $315;
          
          {ESLVal ps = $314;
          
          return termPatternType.apply(_v573,n,substTypesEnv.apply(_v566,ts),ps,_v570,_v569,_v568,_v567,_v566,_v565);
        }
        }
        }
        }
        }
        default: {ESLVal _v593 = _v80;
          
          return error(new ESLVal("TypeError",_v572,new ESLVal("unknown type of pattern: ").add(_v593)));
        }
      }
      }
    }
  });
  private static ESLVal applyTypePatternType = new ESLVal(new Function(new ESLVal("applyTypePatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v560 = $args[0];
  ESLVal _v559 = $args[1];
  ESLVal _v558 = $args[2];
  ESLVal _v557 = $args[3];
  ESLVal _v556 = $args[4];
  ESLVal _v555 = $args[5];
  ESLVal _v554 = $args[6];
  ESLVal _v553 = $args[7];
  ESLVal _v552 = $args[8];
  return patternType.apply(_v560,_v559,_v557,_v556,_v555,_v554,_v553,new ESLVal(new Function(new ESLVal("fun388"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v562 = $args[0];
        ESLVal _v561 = $args[1];
        {ESLVal _v79 = typeNF.apply(_v562,_v553);
              
              switch(_v79.termName) {
              case "TypeFun": {ESLVal $313 = _v79.termRef(0);
                ESLVal $312 = _v79.termRef(1);
                ESLVal $311 = _v79.termRef(2);
                
                {ESLVal fl = $313;
                
                {ESLVal ns = $312;
                
                {ESLVal t = $311;
                
                if(length.apply(_v558).eql(length.apply(ns)).boolVal)
                {ESLVal _v564 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v558).add(_v553),t);
                  
                  if(typeEqual.apply(_v564,_v557).boolVal)
                  return _v552.apply(_v564,_v561);
                  else
                    return error(new ESLVal("TypeError",_v560,new ESLVal("value type ").add(ppType.apply(_v557,_v553).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v564,_v553).add(new ESLVal(" ").add(ppTypeEnv.apply(_v553))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v560,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v558))))));
              }
              }
              }
              }
            case "ForallType": {ESLVal $310 = _v79.termRef(0);
                ESLVal $309 = _v79.termRef(1);
                ESLVal $308 = _v79.termRef(2);
                
                {ESLVal fl = $310;
                
                {ESLVal ns = $309;
                
                {ESLVal t = $308;
                
                if(length.apply(_v558).eql(length.apply(ns)).boolVal)
                {ESLVal _v563 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v558).add(_v553),t);
                  
                  if(typeEqual.apply(_v563,_v557).boolVal)
                  return _v552.apply(_v563,_v561);
                  else
                    return error(new ESLVal("TypeError",_v560,new ESLVal("value type ").add(ppType.apply(_v557,_v553).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v563,_v553).add(new ESLVal(" ").add(ppTypeEnv.apply(_v553))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v560,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v558))))));
              }
              }
              }
              }
              default: {ESLVal t = _v79;
                
                return _v552.apply(t,_v561);
              }
            }
            }
          }
        }));
    }
  });
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v544 = $args[0];
  ESLVal _v543 = $args[1];
  ESLVal _v542 = $args[2];
  ESLVal _v541 = $args[3];
  ESLVal _v540 = $args[4];
  ESLVal _v539 = $args[5];
  ESLVal _v538 = $args[6];
  ESLVal _v537 = $args[7];
  ESLVal _v536 = $args[8];
  ESLVal _v535 = $args[9];
  {ESLVal _v545 = getTermPatternType.apply(_v544,_v543,_v542,_v539,_v538,_v537,_v536);
        
        if(typeEqual.apply(_v545,_v540).boolVal)
        {ESLVal _v77 = typeNF.apply(_v540,_v536);
          
          switch(_v77.termName) {
          case "UnionType": {ESLVal $302 = _v77.termRef(0);
            ESLVal $301 = _v77.termRef(1);
            
            {ESLVal ul = $302;
            
            {ESLVal cs = $301;
            
            LetRec letrec = new LetRec() {
            ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v546 = $args[0];
              {ESLVal _v78 = _v546;
                    
                    if(_v78.isCons())
                    {ESLVal $303 = _v78.head();
                      ESLVal $304 = _v78.tail();
                      
                      switch($303.termName) {
                      case "TermType": {ESLVal $307 = $303.termRef(0);
                        ESLVal $306 = $303.termRef(1);
                        ESLVal $305 = $303.termRef(2);
                        
                        {ESLVal tl = $307;
                        
                        {ESLVal m = $306;
                        
                        {ESLVal args = $305;
                        
                        {ESLVal _v547 = $304;
                        
                        if(m.eql(_v543).boolVal)
                        return args;
                        else
                          {ESLVal t = $303;
                            
                            {ESLVal _v548 = $304;
                            
                            return getCnstrArgs.apply(_v548);
                          }
                          }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t = $303;
                        
                        {ESLVal _v549 = $304;
                        
                        return getCnstrArgs.apply(_v549);
                      }
                      }
                    }
                    }
                  else if(_v78.isNil())
                    return error(new ESLVal("TypeError",_v544,new ESLVal("cannot find constructor for ").add(_v543)));
                  else return error(new ESLVal("case error at Pos(49560,49819)"));
                  }
                }
              });
            
            public ESLVal get(String name) {
              switch(name) {
                case "getCnstrArgs": return getCnstrArgs;
                
                default: throw new Error("cannot find letrec binding");
              }
              }
            };
          ESLVal getCnstrArgs = letrec.get("getCnstrArgs");
          
            {ESLVal argTypes = getCnstrArgs.apply(cs);
            
            if(length.apply(_v541).eql(length.apply(argTypes)).boolVal)
            return patternTypes.apply(_v544,_v541,argTypes,_v539,_v538,_v537,_v536,new ESLVal(new Function(new ESLVal("fun389"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v551 = $args[0];
              ESLVal _v550 = $args[1];
              return _v535.apply(typeNF.apply(_v540,_v536),_v550);
                }
              }));
            else
              return error(new ESLVal("TypeError",_v544,new ESLVal("arity mismatch.")));
          }
          
          }
          }
          }
          default: {ESLVal t = _v77;
            
            return error(new ESLVal("TypeError",_v544,new ESLVal("expecting a data type: ").add(_v540)));
          }
        }
        }
        else
          return error(new ESLVal("TypeError",_v544,new ESLVal("term pattern type ").add(ppType.apply(_v545,_v536).add(new ESLVal(" does not match supplied value type ").add(ppType.apply(_v540,_v536))))));
      }
    }
  });
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v529 = $args[0];
  ESLVal _v528 = $args[1];
  {ESLVal _v75 = substTypeEnv.apply(_v528,_v529);
        
        switch(_v75.termName) {
        case "ApplyTypeFun": {ESLVal $297 = _v75.termRef(0);
          ESLVal $296 = _v75.termRef(1);
          ESLVal $295 = _v75.termRef(2);
          
          {ESLVal l = $297;
          
          {ESLVal op = $296;
          
          {ESLVal args = $295;
          
          {ESLVal _v76 = typeNF.apply(op,_v528);
          
          switch(_v76.termName) {
          case "TypeFun": {ESLVal $300 = _v76.termRef(0);
            ESLVal $299 = _v76.termRef(1);
            ESLVal $298 = _v76.termRef(2);
            
            {ESLVal _v531 = $300;
            
            {ESLVal ns = $299;
            
            {ESLVal _v532 = $298;
            
            if(length.apply(args).eql(length.apply(ns)).boolVal)
            return typeNF.apply(substTypeEnv.apply(zipTypeEnv.apply(ns,args),_v532),_v528);
            else
              return error(new ESLVal("TypeError",_v531,new ESLVal("function arity error")));
          }
          }
          }
          }
          default: {ESLVal _v533 = _v76;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(typeNF.apply(op,_v528),_v528))));
          }
        }
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $294 = _v75.termRef(0);
          
          {ESLVal f = $294;
          
          return typeNF.apply(f.apply(),_v528);
        }
        }
      case "RecType": {ESLVal $293 = _v75.termRef(0);
          ESLVal $292 = _v75.termRef(1);
          ESLVal $291 = _v75.termRef(2);
          
          {ESLVal l = $293;
          
          {ESLVal n = $292;
          
          {ESLVal _v530 = $291;
          
          return typeNF.apply(substType.apply(new ESLVal("RecType",l,n,_v530),n,_v530),_v528);
        }
        }
        }
        }
        default: {ESLVal _v534 = _v75;
          
          return _v534;
        }
      }
      }
    }
  });
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v527 = $args[0];
  ESLVal _v526 = $args[1];
  ESLVal _v525 = $args[2];
  ESLVal _v524 = $args[3];
  ESLVal _v523 = $args[4];
  ESLVal _v522 = $args[5];
  ESLVal _v521 = $args[6];
  {ESLVal t = lookupType.apply(_v526,_v522);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v527,new ESLVal("unknown constructor ").add(_v526)));
        else
          if(length.apply(_v525).gre($zero).boolVal)
            return getGenericTermPatternType.apply(_v527,t,_v525,_v524,_v523,_v522,_v521);
            else
              return t;
      }
    }
  });
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v518 = $args[0];
  ESLVal _v517 = $args[1];
  ESLVal _v516 = $args[2];
  ESLVal _v515 = $args[3];
  ESLVal _v514 = $args[4];
  ESLVal _v513 = $args[5];
  ESLVal _v512 = $args[6];
  {ESLVal _v74 = _v517;
        
        switch(_v74.termName) {
        case "RecType": {ESLVal $290 = _v74.termRef(0);
          ESLVal $289 = _v74.termRef(1);
          ESLVal $288 = _v74.termRef(2);
          
          {ESLVal rl = $290;
          
          {ESLVal rn = $289;
          
          {ESLVal rt = $288;
          
          return getGenericTermPatternType.apply(_v518,substType.apply(new ESLVal("RecType",rl,rn,rt),rn,rt),_v516,_v515,_v514,_v513,_v512);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $287 = _v74.termRef(0);
          ESLVal $286 = _v74.termRef(1);
          ESLVal $285 = _v74.termRef(2);
          
          {ESLVal al = $287;
          
          {ESLVal ns = $286;
          
          {ESLVal _v519 = $285;
          
          if(length.apply(ns).eql(length.apply(_v516)).boolVal)
          {ESLVal e = zipTypeEnv.apply(ns,_v516);
            
            return substTypeEnv.apply(e.add(_v512),_v519);
          }
          else
            return error(new ESLVal("TypeError",_v518,new ESLVal("generic constructor mismatch")));
        }
        }
        }
        }
        default: {ESLVal _v520 = _v74;
          
          return error(new ESLVal("TypeError",_v518,new ESLVal("expecting a generic type: ").add(ppType.apply(_v520,_v512))));
        }
      }
      }
    }
  });
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v510 = $args[0];
  ESLVal _v509 = $args[1];
  ESLVal _v508 = $args[2];
  ESLVal _v507 = $args[3];
  ESLVal _v506 = $args[4];
  ESLVal _v505 = $args[5];
  ESLVal _v504 = $args[6];
  {ESLVal _v73 = _v509;
        
        switch(_v73.termName) {
        case "ListType": {ESLVal $284 = _v73.termRef(0);
          ESLVal $283 = _v73.termRef(1);
          
          {ESLVal ltl = $284;
          
          {ESLVal et = $283;
          
          return _v504.apply(new ESLVal("ForallType",_v510,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v510,new ESLVal("VarType",_v510,new ESLVal("T")))),_v507);
        }
        }
        }
        default: {ESLVal _v511 = _v73;
          
          return error(new ESLVal("TypeError",_v510,new ESLVal("expecting a list type: ").add(ppType.apply(_v511,_v505))));
        }
      }
      }
    }
  });
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v502 = $args[0];
  ESLVal _v501 = $args[1];
  ESLVal _v500 = $args[2];
  ESLVal _v499 = $args[3];
  ESLVal _v498 = $args[4];
  ESLVal _v497 = $args[5];
  ESLVal _v496 = $args[6];
  {ESLVal _v72 = _v501;
        
        switch(_v72.termName) {
        case "BagType": {ESLVal $282 = _v72.termRef(0);
          ESLVal $281 = _v72.termRef(1);
          
          {ESLVal ltl = $282;
          
          {ESLVal et = $281;
          
          return _v496.apply(new ESLVal("ForallType",_v502,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v502,new ESLVal("VarType",_v502,new ESLVal("T")))),_v499);
        }
        }
        }
        default: {ESLVal _v503 = _v72;
          
          return error(new ESLVal("TypeError",_v502,new ESLVal("expecting a bag type: ").add(ppType.apply(_v503,_v497))));
        }
      }
      }
    }
  });
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v494 = $args[0];
  ESLVal _v493 = $args[1];
  ESLVal _v492 = $args[2];
  ESLVal _v491 = $args[3];
  ESLVal _v490 = $args[4];
  ESLVal _v489 = $args[5];
  ESLVal _v488 = $args[6];
  {ESLVal _v71 = _v493;
        
        switch(_v71.termName) {
        case "SetType": {ESLVal $280 = _v71.termRef(0);
          ESLVal $279 = _v71.termRef(1);
          
          {ESLVal ltl = $280;
          
          {ESLVal et = $279;
          
          return _v488.apply(new ESLVal("ForallType",_v494,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v494,new ESLVal("VarType",_v494,new ESLVal("T")))),_v491);
        }
        }
        }
        default: {ESLVal _v495 = _v71;
          
          return error(new ESLVal("TypeError",_v494,new ESLVal("expecting a set type: ").add(ppType.apply(_v495,_v489))));
        }
      }
      }
    }
  });
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v482 = $args[0];
  ESLVal _v481 = $args[1];
  ESLVal _v480 = $args[2];
  ESLVal _v479 = $args[3];
  ESLVal _v478 = $args[4];
  ESLVal _v477 = $args[5];
  ESLVal _v476 = $args[6];
  ESLVal _v475 = $args[7];
  ESLVal _v474 = $args[8];
  {ESLVal _v70 = _v479;
        
        switch(_v70.termName) {
        case "ListType": {ESLVal $278 = _v70.termRef(0);
          ESLVal $277 = _v70.termRef(1);
          
          {ESLVal ltl = $278;
          
          {ESLVal et = $277;
          
          return patternType.apply(_v482,_v481,substTypeEnv.apply(_v475,et),_v478,_v477,_v476,_v475,new ESLVal(new Function(new ESLVal("fun390"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v484 = $args[0];
          ESLVal _v483 = $args[1];
          return patternType.apply(_v482,_v480,_v479,_v478,_v483,_v476,_v475,new ESLVal(new Function(new ESLVal("fun391"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v486 = $args[0];
                ESLVal _v485 = $args[1];
                return _v474.apply(_v484,_v485);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v487 = _v70;
          
          return error(new ESLVal("TypeError",_v482,new ESLVal("expecting a list type: ").add(ppType.apply(_v487,_v475))));
        }
      }
      }
    }
  });
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v468 = $args[0];
  ESLVal _v467 = $args[1];
  ESLVal _v466 = $args[2];
  ESLVal _v465 = $args[3];
  ESLVal _v464 = $args[4];
  ESLVal _v463 = $args[5];
  ESLVal _v462 = $args[6];
  ESLVal _v461 = $args[7];
  ESLVal _v460 = $args[8];
  {ESLVal _v69 = _v465;
        
        switch(_v69.termName) {
        case "BagType": {ESLVal $276 = _v69.termRef(0);
          ESLVal $275 = _v69.termRef(1);
          
          {ESLVal ltl = $276;
          
          {ESLVal et = $275;
          
          return patternType.apply(_v468,_v467,substTypeEnv.apply(_v461,et),_v464,_v463,_v462,_v461,new ESLVal(new Function(new ESLVal("fun392"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v470 = $args[0];
          ESLVal _v469 = $args[1];
          return patternType.apply(_v468,_v466,_v465,_v464,_v469,_v462,_v461,new ESLVal(new Function(new ESLVal("fun393"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v472 = $args[0];
                ESLVal _v471 = $args[1];
                return _v460.apply(_v470,_v471);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v473 = _v69;
          
          return error(new ESLVal("TypeError",_v468,new ESLVal("expecting a bag type: ").add(ppType.apply(_v473,_v461))));
        }
      }
      }
    }
  });
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v454 = $args[0];
  ESLVal _v453 = $args[1];
  ESLVal _v452 = $args[2];
  ESLVal _v451 = $args[3];
  ESLVal _v450 = $args[4];
  ESLVal _v449 = $args[5];
  ESLVal _v448 = $args[6];
  ESLVal _v447 = $args[7];
  ESLVal _v446 = $args[8];
  {ESLVal _v68 = _v451;
        
        switch(_v68.termName) {
        case "SetType": {ESLVal $274 = _v68.termRef(0);
          ESLVal $273 = _v68.termRef(1);
          
          {ESLVal ltl = $274;
          
          {ESLVal et = $273;
          
          return patternType.apply(_v454,_v453,substTypeEnv.apply(_v447,et),_v450,_v449,_v448,_v447,new ESLVal(new Function(new ESLVal("fun394"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v456 = $args[0];
          ESLVal _v455 = $args[1];
          return patternType.apply(_v454,_v452,_v451,_v450,_v455,_v448,_v447,new ESLVal(new Function(new ESLVal("fun395"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v458 = $args[0];
                ESLVal _v457 = $args[1];
                return _v446.apply(_v456,_v457);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v459 = _v68;
          
          return error(new ESLVal("TypeError",_v454,new ESLVal("expecting a set type: ").add(ppType.apply(_v459,_v447))));
        }
      }
      }
    }
  });
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v444 = $args[0];
  ESLVal _v443 = $args[1];
  ESLVal _v442 = $args[2];
  ESLVal _v441 = $args[3];
  ESLVal _v440 = $args[4];
  ESLVal _v439 = $args[5];
  ESLVal _v438 = $args[6];
  ESLVal _v437 = $args[7];
  {ESLVal _v67 = _v442;
        
        switch(_v67.strVal) {
        case "+": return plusExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "-": return subExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "*": return mulExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "/": return divExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case ":": return consExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "=": return eqlExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "<>": return neqlExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "and": return andExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "andalso": return andExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "or": return orExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "orelse": return orExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case ">": return compareExpType.apply(_v444,_v443,new ESLVal(">"),_v441,_v440,_v439,_v438,_v437);
      case ">=": return compareExpType.apply(_v444,_v443,new ESLVal(">="),_v441,_v440,_v439,_v438,_v437);
      case "<": return compareExpType.apply(_v444,_v443,new ESLVal("<"),_v441,_v440,_v439,_v438,_v437);
      case "<=": return compareExpType.apply(_v444,_v443,new ESLVal("<="),_v441,_v440,_v439,_v438,_v437);
      case "..": return dotDotExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
      case "%": return percentExpType.apply(_v444,_v443,_v441,_v440,_v439,_v438,_v437);
        default: {ESLVal _v445 = _v67;
          
          return error(new ESLVal("TypeError",_v444,new ESLVal("unknown operator: ").add(_v445)));
        }
      }
      }
    }
  });
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v436 = $args[0];
  ESLVal _v435 = $args[1];
  ESLVal _v434 = $args[2];
  ESLVal _v433 = $args[3];
  ESLVal _v432 = $args[4];
  ESLVal _v431 = $args[5];
  ESLVal _v430 = $args[6];
  {ESLVal t1 = expType.apply(_v435,_v433,_v432,_v431,_v430);
        ESLVal t2 = expType.apply(_v434,_v433,_v432,_v431,_v430);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v436,new ESLVal("and expects boolean arguments: ").add(ppType.apply(t1,_v430).add(new ESLVal(" ").add(ppType.apply(t2,_v430))))));
      }
    }
  });
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v429 = $args[0];
  ESLVal _v428 = $args[1];
  ESLVal _v427 = $args[2];
  ESLVal _v426 = $args[3];
  ESLVal _v425 = $args[4];
  ESLVal _v424 = $args[5];
  ESLVal _v423 = $args[6];
  {ESLVal t1 = expType.apply(_v428,_v426,_v425,_v424,_v423);
        ESLVal t2 = expType.apply(_v427,_v426,_v425,_v424,_v423);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("ListType",_v429,new ESLVal("IntType",_v429));
        else
          return error(new ESLVal("TypeError",_v429,new ESLVal(".. expects integer arguments: ").add(ppType.apply(t1,_v423).add(new ESLVal(" ").add(ppType.apply(t2,_v423))))));
      }
    }
  });
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v422 = $args[0];
  ESLVal _v421 = $args[1];
  ESLVal _v420 = $args[2];
  ESLVal _v419 = $args[3];
  ESLVal _v418 = $args[4];
  ESLVal _v417 = $args[5];
  ESLVal _v416 = $args[6];
  {ESLVal t1 = expType.apply(_v421,_v419,_v418,_v417,_v416);
        ESLVal t2 = expType.apply(_v420,_v419,_v418,_v417,_v416);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("IntType",_v422);
        else
          return error(new ESLVal("TypeError",_v422,new ESLVal("% expects integer arguments: ").add(ppType.apply(t1,_v416).add(new ESLVal(" ").add(ppType.apply(t2,_v416))))));
      }
    }
  });
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v415 = $args[0];
  ESLVal _v414 = $args[1];
  ESLVal _v413 = $args[2];
  ESLVal _v412 = $args[3];
  ESLVal _v411 = $args[4];
  ESLVal _v410 = $args[5];
  ESLVal _v409 = $args[6];
  ESLVal _v408 = $args[7];
  {ESLVal t1 = expType.apply(_v414,_v411,_v410,_v409,_v408);
        ESLVal t2 = expType.apply(_v412,_v411,_v410,_v409,_v408);
        
        if(isNumType.apply(t1).and(isNumType.apply(t2)).boolVal)
        return new ESLVal("BoolType",_v415);
        else
          return error(new ESLVal("TypeError",_v415,_v413.add(new ESLVal(" expects numeric arguments: ").add(ppType.apply(t1,_v408).add(new ESLVal(" ").add(ppType.apply(t2,_v408)))))));
      }
    }
  });
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v407 = $args[0];
  ESLVal _v406 = $args[1];
  ESLVal _v405 = $args[2];
  ESLVal _v404 = $args[3];
  ESLVal _v403 = $args[4];
  ESLVal _v402 = $args[5];
  ESLVal _v401 = $args[6];
  {ESLVal t1 = expType.apply(_v406,_v404,_v403,_v402,_v401);
        ESLVal t2 = expType.apply(_v405,_v404,_v403,_v402,_v401);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v407,new ESLVal("or expects boolean arguments: ").add(ppType.apply(t1,_v401).add(new ESLVal(" ").add(ppType.apply(t2,_v401))))));
      }
    }
  });
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v400 = $args[0];
  ESLVal _v399 = $args[1];
  ESLVal _v398 = $args[2];
  ESLVal _v397 = $args[3];
  ESLVal _v396 = $args[4];
  ESLVal _v395 = $args[5];
  ESLVal _v394 = $args[6];
  {ESLVal t1 = expType.apply(_v399,_v397,_v396,_v395,_v394);
        ESLVal t2 = expType.apply(_v398,_v397,_v396,_v395,_v394);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v400);
        else
          return error(new ESLVal("TypeError",_v400,new ESLVal("= expects types to agree: ").add(ppType.apply(t1,_v394).add(new ESLVal(" <> ").add(ppType.apply(t2,_v394))))));
      }
    }
  });
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v393 = $args[0];
  ESLVal _v392 = $args[1];
  ESLVal _v391 = $args[2];
  ESLVal _v390 = $args[3];
  ESLVal _v389 = $args[4];
  ESLVal _v388 = $args[5];
  ESLVal _v387 = $args[6];
  {ESLVal t1 = expType.apply(_v392,_v390,_v389,_v388,_v387);
        ESLVal t2 = expType.apply(_v391,_v390,_v389,_v388,_v387);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v393);
        else
          return error(new ESLVal("TypeError",_v393,new ESLVal("<> expects types to agree: ").add(ppType.apply(t1,_v387).add(new ESLVal(" <> ").add(ppType.apply(t2,_v387))))));
      }
    }
  });
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v385 = $args[0];
  ESLVal _v384 = $args[1];
  ESLVal _v383 = $args[2];
  ESLVal _v382 = $args[3];
  ESLVal _v381 = $args[4];
  ESLVal _v380 = $args[5];
  ESLVal _v379 = $args[6];
  {ESLVal t1 = typeNF.apply(expType.apply(_v384,_v382,_v381,_v380,_v379),_v379);
        ESLVal t2 = typeNF.apply(expType.apply(_v383,_v382,_v381,_v380,_v379),_v379);
        
        {ESLVal _v66 = t2;
        ESLVal _v65 = t1;
        
        switch(_v66.termName) {
        case "ListType": {ESLVal $272 = _v66.termRef(0);
          ESLVal $271 = _v66.termRef(1);
          
          {ESLVal _v386 = $272;
          
          {ESLVal elementType = $271;
          
          {ESLVal headType = _v65;
          
          if(typeEqual.apply(headType,elementType).boolVal)
          return t2;
          else
            return error(new ESLVal("TypeError",_v386,new ESLVal(": expects head type ").add(ppType.apply(headType,_v379).add(new ESLVal(" and element type ").add(ppType.apply(elementType,_v379).add(new ESLVal(" to agree")))))));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(59460,59743)"));
      }
      }
      }
    }
  });
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v372 = $args[0];
  ESLVal _v371 = $args[1];
  ESLVal _v370 = $args[2];
  ESLVal _v369 = $args[3];
  ESLVal _v368 = $args[4];
  ESLVal _v367 = $args[5];
  ESLVal _v366 = $args[6];
  {ESLVal t1 = expType.apply(_v371,_v369,_v368,_v367,_v366);
        ESLVal t2 = expType.apply(_v370,_v369,_v368,_v367,_v366);
        
        {ESLVal _v64 = t1;
        ESLVal _v63 = t2;
        
        switch(_v64.termName) {
        case "IntType": {ESLVal $269 = _v64.termRef(0);
          
          switch(_v63.termName) {
          case "IntType": {ESLVal $270 = _v63.termRef(0);
            
            {ESLVal l1 = $269;
            
            {ESLVal l2 = $270;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v375 = _v64;
            
            {ESLVal _v376 = _v63;
            
            return error(new ESLVal("TypeError",_v372,new ESLVal("incomptible types for /: ").add(ppType.apply(_v375,_v366).add(new ESLVal(" and ").add(ppType.apply(_v376,_v366))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $267 = _v64.termRef(0);
          
          switch(_v63.termName) {
          case "FloatType": {ESLVal $268 = _v63.termRef(0);
            
            {ESLVal l1 = $267;
            
            {ESLVal l2 = $268;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v373 = _v64;
            
            {ESLVal _v374 = _v63;
            
            return error(new ESLVal("TypeError",_v372,new ESLVal("incomptible types for /: ").add(ppType.apply(_v373,_v366).add(new ESLVal(" and ").add(ppType.apply(_v374,_v366))))));
          }
          }
        }
        }
        default: {ESLVal _v377 = _v64;
          
          {ESLVal _v378 = _v63;
          
          return error(new ESLVal("TypeError",_v372,new ESLVal("incomptible types for /: ").add(ppType.apply(_v377,_v366).add(new ESLVal(" and ").add(ppType.apply(_v378,_v366))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v359 = $args[0];
  ESLVal _v358 = $args[1];
  ESLVal _v357 = $args[2];
  ESLVal _v356 = $args[3];
  ESLVal _v355 = $args[4];
  ESLVal _v354 = $args[5];
  ESLVal _v353 = $args[6];
  {ESLVal t1 = expType.apply(_v358,_v356,_v355,_v354,_v353);
        ESLVal t2 = expType.apply(_v357,_v356,_v355,_v354,_v353);
        
        {ESLVal _v62 = t1;
        ESLVal _v61 = t2;
        
        switch(_v62.termName) {
        case "IntType": {ESLVal $264 = _v62.termRef(0);
          
          switch(_v61.termName) {
          case "IntType": {ESLVal $266 = _v61.termRef(0);
            
            {ESLVal l1 = $264;
            
            {ESLVal l2 = $266;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $265 = _v61.termRef(0);
            
            {ESLVal l1 = $264;
            
            {ESLVal l2 = $265;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v362 = _v62;
            
            {ESLVal _v363 = _v61;
            
            return error(new ESLVal("TypeError",_v359,new ESLVal("incomptible types for *: ").add(ppType.apply(_v362,_v353).add(new ESLVal(" and ").add(ppType.apply(_v363,_v353))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $261 = _v62.termRef(0);
          
          switch(_v61.termName) {
          case "FloatType": {ESLVal $263 = _v61.termRef(0);
            
            {ESLVal l1 = $261;
            
            {ESLVal l2 = $263;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $262 = _v61.termRef(0);
            
            {ESLVal l1 = $261;
            
            {ESLVal l2 = $262;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v360 = _v62;
            
            {ESLVal _v361 = _v61;
            
            return error(new ESLVal("TypeError",_v359,new ESLVal("incomptible types for *: ").add(ppType.apply(_v360,_v353).add(new ESLVal(" and ").add(ppType.apply(_v361,_v353))))));
          }
          }
        }
        }
        default: {ESLVal _v364 = _v62;
          
          {ESLVal _v365 = _v61;
          
          return error(new ESLVal("TypeError",_v359,new ESLVal("incomptible types for *: ").add(ppType.apply(_v364,_v353).add(new ESLVal(" and ").add(ppType.apply(_v365,_v353))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v346 = $args[0];
  ESLVal _v345 = $args[1];
  ESLVal _v344 = $args[2];
  ESLVal _v343 = $args[3];
  ESLVal _v342 = $args[4];
  ESLVal _v341 = $args[5];
  ESLVal _v340 = $args[6];
  {ESLVal t1 = expType.apply(_v345,_v343,_v342,_v341,_v340);
        ESLVal t2 = expType.apply(_v344,_v343,_v342,_v341,_v340);
        
        {ESLVal _v60 = t1;
        ESLVal _v59 = t2;
        
        switch(_v60.termName) {
        case "IntType": {ESLVal $258 = _v60.termRef(0);
          
          switch(_v59.termName) {
          case "IntType": {ESLVal $260 = _v59.termRef(0);
            
            {ESLVal l1 = $258;
            
            {ESLVal l2 = $260;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $259 = _v59.termRef(0);
            
            {ESLVal l1 = $258;
            
            {ESLVal l2 = $259;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v349 = _v60;
            
            {ESLVal _v350 = _v59;
            
            return error(new ESLVal("TypeError",_v346,new ESLVal("incomptible types for -: ").add(ppType.apply(_v349,_v340).add(new ESLVal(" and ").add(ppType.apply(_v350,_v340))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $255 = _v60.termRef(0);
          
          switch(_v59.termName) {
          case "FloatType": {ESLVal $257 = _v59.termRef(0);
            
            {ESLVal l1 = $255;
            
            {ESLVal l2 = $257;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $256 = _v59.termRef(0);
            
            {ESLVal l1 = $255;
            
            {ESLVal l2 = $256;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v347 = _v60;
            
            {ESLVal _v348 = _v59;
            
            return error(new ESLVal("TypeError",_v346,new ESLVal("incomptible types for -: ").add(ppType.apply(_v347,_v340).add(new ESLVal(" and ").add(ppType.apply(_v348,_v340))))));
          }
          }
        }
        }
        default: {ESLVal _v351 = _v60;
          
          {ESLVal _v352 = _v59;
          
          return error(new ESLVal("TypeError",_v346,new ESLVal("incomptible types for -: ").add(ppType.apply(_v351,_v340).add(new ESLVal(" and ").add(ppType.apply(_v352,_v340))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v315 = $args[0];
  ESLVal _v314 = $args[1];
  ESLVal _v313 = $args[2];
  ESLVal _v312 = $args[3];
  ESLVal _v311 = $args[4];
  ESLVal _v310 = $args[5];
  ESLVal _v309 = $args[6];
  {ESLVal t1 = expType.apply(_v314,_v312,_v311,_v310,_v309);
        ESLVal t2 = expType.apply(_v313,_v312,_v311,_v310,_v309);
        
        {ESLVal _v58 = t1;
        ESLVal _v57 = t2;
        
        switch(_v58.termName) {
        case "StrType": {ESLVal $254 = _v58.termRef(0);
          
          {ESLVal _v334 = $254;
          
          {ESLVal _v335 = _v57;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $252 = _v58.termRef(0);
          
          switch(_v57.termName) {
          case "IntType": {ESLVal $253 = _v57.termRef(0);
            
            {ESLVal l1 = $252;
            
            {ESLVal l2 = $253;
            
            return t1;
          }
          }
          }
          default: switch(_v57.termName) {
            case "StrType": {ESLVal $245 = _v57.termRef(0);
              
              {ESLVal _v330 = _v58;
              
              {ESLVal _v331 = $245;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v332 = _v58;
              
              {ESLVal _v333 = _v57;
              
              return error(new ESLVal("TypeError",_v315,new ESLVal("incomptible types for +: ").add(ppType.apply(_v332,_v309).add(new ESLVal(" and ").add(ppType.apply(_v333,_v309))))));
            }
            }
          }
        }
        }
      case "FloatType": {ESLVal $250 = _v58.termRef(0);
          
          switch(_v57.termName) {
          case "FloatType": {ESLVal $251 = _v57.termRef(0);
            
            {ESLVal l1 = $250;
            
            {ESLVal l2 = $251;
            
            return t1;
          }
          }
          }
          default: switch(_v57.termName) {
            case "StrType": {ESLVal $245 = _v57.termRef(0);
              
              {ESLVal _v326 = _v58;
              
              {ESLVal _v327 = $245;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v328 = _v58;
              
              {ESLVal _v329 = _v57;
              
              return error(new ESLVal("TypeError",_v315,new ESLVal("incomptible types for +: ").add(ppType.apply(_v328,_v309).add(new ESLVal(" and ").add(ppType.apply(_v329,_v309))))));
            }
            }
          }
        }
        }
      case "ListType": {ESLVal $247 = _v58.termRef(0);
          ESLVal $246 = _v58.termRef(1);
          
          switch(_v57.termName) {
          case "ListType": {ESLVal $249 = _v57.termRef(0);
            ESLVal $248 = _v57.termRef(1);
            
            {ESLVal l1 = $247;
            
            {ESLVal _v316 = $246;
            
            {ESLVal l2 = $249;
            
            {ESLVal _v317 = $248;
            
            if(typeEqual.apply(_v316,_v317).boolVal)
            return new ESLVal("ListType",l1,_v316);
            else
              switch(_v57.termName) {
                case "StrType": {ESLVal $245 = _v57.termRef(0);
                  
                  {ESLVal _v318 = _v58;
                  
                  {ESLVal _v319 = $245;
                  
                  return _v317;
                }
                }
                }
                default: {ESLVal _v320 = _v58;
                  
                  {ESLVal _v321 = _v57;
                  
                  return error(new ESLVal("TypeError",_v315,new ESLVal("incomptible types for +: ").add(ppType.apply(_v320,_v309).add(new ESLVal(" and ").add(ppType.apply(_v321,_v309))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v57.termName) {
            case "StrType": {ESLVal $245 = _v57.termRef(0);
              
              {ESLVal _v322 = _v58;
              
              {ESLVal _v323 = $245;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v324 = _v58;
              
              {ESLVal _v325 = _v57;
              
              return error(new ESLVal("TypeError",_v315,new ESLVal("incomptible types for +: ").add(ppType.apply(_v324,_v309).add(new ESLVal(" and ").add(ppType.apply(_v325,_v309))))));
            }
            }
          }
        }
        }
        default: switch(_v57.termName) {
          case "StrType": {ESLVal $245 = _v57.termRef(0);
            
            {ESLVal _v336 = _v58;
            
            {ESLVal _v337 = $245;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v338 = _v58;
            
            {ESLVal _v339 = _v57;
            
            return error(new ESLVal("TypeError",_v315,new ESLVal("incomptible types for +: ").add(ppType.apply(_v338,_v309).add(new ESLVal(" and ").add(ppType.apply(_v339,_v309))))));
          }
          }
        }
      }
      }
      }
    }
  });
  private static ESLVal applyTypeExp = new ESLVal(new Function(new ESLVal("applyTypeExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v304 = $args[0];
  ESLVal _v303 = $args[1];
  ESLVal _v302 = $args[2];
  ESLVal _v301 = $args[3];
  ESLVal _v300 = $args[4];
  ESLVal _v299 = $args[5];
  ESLVal _v298 = $args[6];
  {ESLVal _v306 = substTypesEnv.apply(_v298,_v302);
        ESLVal _v305 = expType.apply(_v303,_v301,_v300,_v299,_v298);
        
        {ESLVal _v56 = _v305;
        
        switch(_v56.termName) {
        case "ForallType": {ESLVal $244 = _v56.termRef(0);
          ESLVal $243 = _v56.termRef(1);
          ESLVal $242 = _v56.termRef(2);
          
          {ESLVal l1 = $244;
          
          {ESLVal ns = $243;
          
          {ESLVal _v307 = $242;
          
          if(length.apply(ns).eql(length.apply(_v306)).boolVal)
          {ESLVal env = zipTypeEnv.apply(ns,_v306);
            
            return substTypeEnv.apply(env.add(_v300),_v307);
          }
          else
            return error(new ESLVal("TypeError",_v304,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v306))))));
        }
        }
        }
        }
        default: {ESLVal _v308 = _v56;
          
          return error(new ESLVal("TypeError",_v304,new ESLVal("expecting a universal type: ").add(_v308)));
        }
      }
      }
      }
    }
  });
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v297 = $args[0];
  ESLVal _v296 = $args[1];
  ESLVal _v295 = $args[2];
  ESLVal _v294 = $args[3];
  ESLVal _v293 = $args[4];
  return map.apply(new ESLVal(new Function(new ESLVal("fun396"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expType.apply(e,_v296,_v295,_v294,_v293);
          }
        }),_v297);
    }
  });
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v292 = $args[0];
  ESLVal _v291 = $args[1];
  ESLVal _v290 = $args[2];
  ESLVal _v289 = $args[3];
  ESLVal _v288 = $args[4];
  ESLVal _v287 = $args[5];
  ESLVal _v286 = $args[6];
  {ESLVal _v55 = expType.apply(_v291,_v289,_v288,_v287,_v286);
        
        switch(_v55.termName) {
        case "FunType": {ESLVal $241 = _v55.termRef(0);
          ESLVal $240 = _v55.termRef(1);
          ESLVal $239 = _v55.termRef(2);
          
          {ESLVal l1 = $241;
          
          {ESLVal domain = $240;
          
          {ESLVal range = $239;
          
          {ESLVal supplied = expTypes.apply(_v290,_v289,_v288,_v287,_v286);
          
          if(length.apply(domain).eql(length.apply(supplied)).boolVal)
          if(typesEqual.apply(domain,supplied).boolVal)
            return range;
            else
              return error(new ESLVal("TypeError",_v292,new ESLVal("supplied argument types ").add(ppTypes.apply(supplied,_v286).add(new ESLVal(" do not match function domain ").add(ppTypes.apply(domain,_v286))))));
          else
            return error(new ESLVal("TypeError",_v292,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
        }
        }
        }
        }
        }
        default: {ESLVal t = _v55;
          
          return error(new ESLVal("TypeError",_v292,new ESLVal("unknown type for apply: ").add(ppType.apply(t,_v286))));
        }
      }
      }
    }
  });
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v285 = $args[0];
  ESLVal _v284 = $args[1];
  ESLVal _v283 = $args[2];
  ESLVal _v282 = $args[3];
  ESLVal _v281 = $args[4];
  ESLVal _v280 = $args[5];
  ESLVal _v279 = $args[6];
  ESLVal _v278 = $args[7];
  {ESLVal testType = expType.apply(_v284,_v281,_v280,_v279,_v278);
        
        if(isBoolType.apply(testType).boolVal)
        {ESLVal conseqType = expType.apply(_v283,_v281,_v280,_v279,_v278);
          ESLVal altType = expType.apply(_v282,_v281,_v280,_v279,_v278);
          
          if(typeEqual.apply(conseqType,altType).boolVal)
          return conseqType;
          else
            return error(new ESLVal("TypeError",_v285,new ESLVal("conseq and alt types do not agree: ").add(ppType.apply(conseqType,_v278).add(new ESLVal(" ").add(ppType.apply(altType,_v278))))));
        }
        else
          return error(new ESLVal("if expects a bool ").add(ppType.apply(testType,_v278)));
      }
    }
  });
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  {ESLVal _v53 = ds;
        
        if(_v53.isCons())
        {ESLVal $237 = _v53.head();
          ESLVal $238 = _v53.tail();
          
          {ESLVal d = $237;
          
          {ESLVal _v276 = $238;
          
          if(member.apply(decName.apply(d),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v54 = $qualArg;
              
              {ESLVal _v277 = _v54;
              
              return ESLVal.list(ESLVal.list(decName.apply(_v277)));
            }
            }
          }
        }).map(_v276).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",decLoc.apply(d),new ESLVal(" duplicate argument ").add(decName.apply(d))));
          else
            return checkDecs.apply(_v276);
        }
        }
        }
      else if(_v53.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(64373,64606)"));
      }
    }
  });
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v273 = $args[0];
  ESLVal _v272 = $args[1];
  ESLVal _v271 = $args[2];
  ESLVal _v270 = $args[3];
  ESLVal _v269 = $args[4];
  ESLVal _v268 = $args[5];
  ESLVal _v267 = $args[6];
  ESLVal _v266 = $args[7];
  ESLVal _v265 = $args[8];
  {checkDecs.apply(_v271);
      {ESLVal nType = expType.apply(_v272,_v268,_v267,_v266,_v265);
        
        if(isStrType.apply(nType).boolVal)
        {ESLVal declaredType = substTypeEnv.apply(_v265,_v270);
          
          return decTypes.apply(_v271,_v267,_v265,new ESLVal(new Function(new ESLVal("fun397"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v275 = $args[0];
          ESLVal _v274 = $args[1];
          {ESLVal actualRange = expType.apply(_v269,_v268,_v274,_v266,_v265);
                
                if(typeEqual.apply(declaredType,new ESLVal("FunType",_v273,_v275,actualRange)).boolVal)
                return new ESLVal("FunType",_v273,_v275,actualRange);
                else
                  return error(new ESLVal("TypeError",_v273,new ESLVal("function declared type ").add(ppType.apply(declaredType,_v265).add(new ESLVal(" but is ").add(ppType.apply(new ESLVal("FunType",_v273,_v275,actualRange),_v265))))));
              }
            }
          }));
        }
        else
          return error(new ESLVal("TypeError",_v273,new ESLVal("expecting a string for a function name: ").add(_v272)));
      }}
    }
  });
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v261 = $args[0];
  ESLVal _v260 = $args[1];
  ESLVal _v259 = $args[2];
  ESLVal _v258 = $args[3];
  LetRec letrec = new LetRec() {
        ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v263 = $args[0];
          ESLVal _v262 = $args[1];
          {ESLVal _v52 = _v263;
                
                if(_v52.isCons())
                {ESLVal $231 = _v52.head();
                  ESLVal $232 = _v52.tail();
                  
                  switch($231.termName) {
                  case "Dec": {ESLVal $236 = $231.termRef(0);
                    ESLVal $235 = $231.termRef(1);
                    ESLVal $234 = $231.termRef(2);
                    ESLVal $233 = $231.termRef(3);
                    
                    {ESLVal l = $236;
                    
                    {ESLVal n = $235;
                    
                    {ESLVal t = $234;
                    
                    {ESLVal st = $233;
                    
                    {ESLVal _v264 = $232;
                    
                    return processDecs.apply(_v264,_v262.cons(new ESLVal("Map",n,substTypeEnv.apply(_v259,t))));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(65619,65844)"));
                }
                }
              else if(_v52.isNil())
                return _v258.apply(reverse.apply(typeEnvRan.apply(_v262)),_v262.add(_v260));
              else return error(new ESLVal("case error at Pos(65619,65844)"));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "processDecs": return processDecs;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal processDecs = letrec.get("processDecs");
      
        return processDecs.apply(_v261,$nil);
      
    }
  });
  private static ESLVal isStrType = new ESLVal(new Function(new ESLVal("isStrType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v51 = t;
        
        switch(_v51.termName) {
        case "StrType": {ESLVal $230 = _v51.termRef(0);
          
          {ESLVal l = $230;
          
          return $true;
        }
        }
        default: {ESLVal _v257 = _v51;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isIntType = new ESLVal(new Function(new ESLVal("isIntType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v50 = t;
        
        switch(_v50.termName) {
        case "IntType": {ESLVal $229 = _v50.termRef(0);
          
          {ESLVal l = $229;
          
          return $true;
        }
        }
        default: {ESLVal _v256 = _v50;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isNumType = new ESLVal(new Function(new ESLVal("isNumType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v49 = t;
        
        switch(_v49.termName) {
        case "IntType": {ESLVal $228 = _v49.termRef(0);
          
          {ESLVal l = $228;
          
          return $true;
        }
        }
      case "FloatType": {ESLVal $227 = _v49.termRef(0);
          
          {ESLVal l = $227;
          
          return $true;
        }
        }
        default: {ESLVal _v255 = _v49;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isBoolType = new ESLVal(new Function(new ESLVal("isBoolType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v48 = t;
        
        switch(_v48.termName) {
        case "BoolType": {ESLVal $226 = _v48.termRef(0);
          
          {ESLVal l = $226;
          
          return $true;
        }
        }
        default: {ESLVal _v254 = _v48;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v253 = $args[0];
  ESLVal _v252 = $args[1];
  ESLVal _v251 = $args[2];
  ESLVal _v250 = $args[3];
  ESLVal _v249 = $args[4];
  ESLVal _v248 = $args[5];
  ESLVal _v247 = $args[6];
  ESLVal _v246 = $args[7];
  {ESLVal t0 = lookupType.apply(_v252,_v247);
        
        if(t0.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v253,new ESLVal("cannot find cnstr ").add(_v252)));
        else
          {ESLVal t = unfoldIf.apply(t0);
            
            return termTypeCheckUnion.apply(t,_v253,_v252,_v251,_v250,_v249,_v248,_v247,_v246);
          }
      }
    }
  });
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v243 = $args[0];
  ESLVal _v242 = $args[1];
  ESLVal _v241 = $args[2];
  ESLVal _v240 = $args[3];
  ESLVal _v239 = $args[4];
  ESLVal _v238 = $args[5];
  ESLVal _v237 = $args[6];
  ESLVal _v236 = $args[7];
  ESLVal _v235 = $args[8];
  if(_v243.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v242,new ESLVal("cannot find constructor ").add(_v241)));
        else
          {ESLVal _v46 = _v243;
            
            switch(_v46.termName) {
            case "TypeFun": {ESLVal $223 = _v46.termRef(0);
              ESLVal $222 = _v46.termRef(1);
              ESLVal $221 = _v46.termRef(2);
              
              {ESLVal lf = $223;
              
              {ESLVal ns = $222;
              
              {ESLVal body = $221;
              
              if(length.apply(ns).eql(length.apply(_v240)).boolVal)
              {ESLVal args = map.apply(new ESLVal(new Function(new ESLVal("fun398"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v244 = $args[0];
                  return substTypeEnv.apply(_v235,_v244);
                    }
                  }),_v240);
                
                {ESLVal _v47 = substTypeEnv.apply(zipTypeEnv.apply(ns,args),body);
                
                switch(_v47.termName) {
                case "UnionType": {ESLVal $225 = _v47.termRef(0);
                  ESLVal $224 = _v47.termRef(1);
                  
                  {ESLVal l1 = $225;
                  
                  {ESLVal terms = $224;
                  
                  {ESLVal ts2 = findTermArgTypes.apply(_v241,terms);
                  
                  if(length.apply(_v239).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v242,_v239,ts2,_v238,_v237,_v236,_v235);
                  return new ESLVal("UnionType",l1,terms);}
                  else
                    return error(_v241.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v239))))));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(67127,67677)"));
              }
              }
              }
              else
                return error(new ESLVal("TypeError",_v242,new ESLVal("generic constructor ").add(_v241.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(_v240))))))));
            }
            }
            }
            }
          case "UnionType": {ESLVal $220 = _v46.termRef(0);
              ESLVal $219 = _v46.termRef(1);
              
              {ESLVal l1 = $220;
              
              {ESLVal terms = $219;
              
              {ESLVal ts2 = findTermArgTypes.apply(_v241,terms);
              
              if(length.apply(_v240).neql($zero).boolVal)
              return error(new ESLVal("TypeError",_v242,new ESLVal("generic application of non-generic constructior: ").add(_v241)));
              else
                if(length.apply(_v239).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v242,_v239,ts2,_v238,_v237,_v236,_v235);
                  return _v243;}
                  else
                    return error(_v241.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v239))))));
            }
            }
            }
            }
            default: {ESLVal _v245 = _v46;
              
              return error(new ESLVal("TypeError",_v242,new ESLVal("expecting a union type for ").add(_v241.add(new ESLVal(" but got ").add(ppType.apply(_v245,_v235))))));
            }
          }
          }
    }
  });
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v45 = t;
        
        switch(_v45.termName) {
        case "RecType": {ESLVal $218 = _v45.termRef(0);
          ESLVal $217 = _v45.termRef(1);
          ESLVal $216 = _v45.termRef(2);
          
          {ESLVal l = $218;
          
          {ESLVal n = $217;
          
          {ESLVal _v233 = $216;
          
          return unfoldIf.apply(unfoldType.apply(l,n,_v233));
        }
        }
        }
        }
        default: {ESLVal _v234 = _v45;
          
          return _v234;
        }
      }
      }
    }
  });
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal terms = $args[1];
  {ESLVal _v44 = terms;
        
        if(_v44.isCons())
        {ESLVal $211 = _v44.head();
          ESLVal $212 = _v44.tail();
          
          switch($211.termName) {
          case "TermType": {ESLVal $215 = $211.termRef(0);
            ESLVal $214 = $211.termRef(1);
            ESLVal $213 = $211.termRef(2);
            
            {ESLVal l = $215;
            
            {ESLVal nn = $214;
            
            {ESLVal ts = $213;
            
            {ESLVal _v231 = $212;
            
            if(nn.eql(n).boolVal)
            return ts;
            else
              {ESLVal t = $211;
                
                {ESLVal _v232 = $212;
                
                return findTermArgTypes.apply(n,_v232);
              }
              }
          }
          }
          }
          }
          }
          default: {ESLVal t = $211;
            
            {ESLVal ts = $212;
            
            return findTermArgTypes.apply(n,ts);
          }
          }
        }
        }
      else if(_v44.isNil())
        return error(new ESLVal("cannot find constructor ").add(n));
      else return error(new ESLVal("case error at Pos(68673,68873)"));
      }
    }
  });
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v228 = $args[0];
  ESLVal _v227 = $args[1];
  ESLVal _v226 = $args[2];
  ESLVal _v225 = $args[3];
  ESLVal _v224 = $args[4];
  ESLVal _v223 = $args[5];
  ESLVal _v222 = $args[6];
  {ESLVal _v43 = _v227;
        ESLVal _v42 = _v226;
        
        if(_v43.isCons())
        {ESLVal $205 = _v43.head();
          ESLVal $206 = _v43.tail();
          
          if(_v42.isCons())
          {ESLVal $207 = _v42.head();
            ESLVal $208 = _v42.tail();
            
            {ESLVal e = $205;
            
            {ESLVal _v229 = $206;
            
            {ESLVal t = $207;
            
            {ESLVal _v230 = $208;
            
            {ESLVal tt = expType.apply(e,_v225,_v224,_v223,_v222);
            
            if(typeEqual.apply(t,tt).boolVal)
            return checkTermArgTypes.apply(_v228,_v229,_v230,_v225,_v224,_v223,_v222);
            else
              return error(new ESLVal("TypeError",_v228,new ESLVal("expected constructor arg type ").add(ppType.apply(t,_v222).add(new ESLVal(" but supplied ").add(ppType.apply(tt,_v222))))));
          }
          }
          }
          }
          }
          }
        else if(_v42.isNil())
          return error(new ESLVal("case error at Pos(68991,69413)"));
        else return error(new ESLVal("case error at Pos(68991,69413)"));
        }
      else if(_v43.isNil())
        if(_v42.isCons())
          {ESLVal $209 = _v42.head();
            ESLVal $210 = _v42.tail();
            
            return error(new ESLVal("case error at Pos(68991,69413)"));
          }
        else if(_v42.isNil())
          return $null;
        else return error(new ESLVal("case error at Pos(68991,69413)"));
      else return error(new ESLVal("case error at Pos(68991,69413)"));
      }
    }
  });
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v220 = $args[0];
  ESLVal _v219 = $args[1];
  ESLVal _v218 = $args[2];
  ESLVal _v217 = $args[3];
  ESLVal _v216 = $args[4];
  ESLVal _v215 = $args[5];
  {ESLVal _v41 = expType.apply(_v219,_v218,_v217,_v216,_v215);
        
        switch(_v41.termName) {
        case "BoolType": {ESLVal $204 = _v41.termRef(0);
          
          {ESLVal _v221 = $204;
          
          return new ESLVal("BoolType",_v221);
        }
        }
        default: {ESLVal t = _v41;
          
          return error(new ESLVal("TypeError",_v220,new ESLVal("expecting a boolean: ").add(ppType.apply(t,_v215))));
        }
      }
      }
    }
  });
  private static ESLVal varType = new ESLVal(new Function(new ESLVal("varType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal valueEnv = $args[2];
  {ESLVal t = lookupType.apply(n,valueEnv);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",l,new ESLVal("unbound variable ").add(n)));
        else
          {ESLVal _v40 = t;
            
            switch(_v40.termName) {
            case "TypeClosure": {ESLVal $203 = _v40.termRef(0);
              
              {ESLVal f = $203;
              
              return f.apply();
            }
            }
            default: {ESLVal _v214 = _v40;
              
              return _v214;
            }
          }
          }
      }
    }
  });
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v213 = $args[0];
  ESLVal _v212 = $args[1];
  ESLVal _v211 = $args[2];
  ESLVal _v210 = $args[3];
  ESLVal _v209 = $args[4];
  ESLVal _v208 = $args[5];
  {ESLVal[] t = new ESLVal[]{new ESLVal("VoidType",_v213)};
        
        {{
        ESLVal _v39 = _v212;
        while(_v39.isCons()) {
          ESLVal e = _v39.headVal;
          t[0] = expType.apply(e,_v211,_v210,_v209,_v208);
          _v39 = _v39.tailVal;}
      }
      return t[0];}
      }
    }
  });
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v207 = $args[0];
  ESLVal _v206 = $args[1];
  ESLVal _v205 = $args[2];
  ESLVal _v204 = $args[3];
  ESLVal _v203 = $args[4];
  ESLVal _v202 = $args[5];
  if(_v206.eql($nil).boolVal)
        return new ESLVal("ForallType",_v207,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v207,new ESLVal("VarType",_v207,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun399"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v205,_v204,_v203,_v202);
                }
              }),_v206);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("ListType",_v207,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v207,new ESLVal("lists should have elements of the same type: ").add(_v206)));
          }
    }
  });
  private static ESLVal allEqualTypes = new ESLVal(new Function(new ESLVal("allEqualTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v38 = ts;
        
        if(_v38.isCons())
        {ESLVal $201 = _v38.head();
          ESLVal $202 = _v38.tail();
          
          {ESLVal t2 = $201;
          
          {ESLVal _v199 = $202;
          
          if(typeEqual.apply(t1,t2).boolVal)
          return allEqualTypes.apply(t1,_v199);
          else
            {ESLVal _v200 = _v38;
              
              return $false;
            }
        }
        }
        }
      else if(_v38.isNil())
        return $true;
      else {ESLVal _v201 = _v38;
          
          return $false;
        }
      }
    }
  });
  private static ESLVal substDec = new ESLVal(new Function(new ESLVal("substDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v198 = $args[0];
  ESLVal _v197 = $args[1];
  ESLVal _v196 = $args[2];
  {ESLVal _v37 = _v196;
        
        switch(_v37.termName) {
        case "Dec": {ESLVal $200 = _v37.termRef(0);
          ESLVal $199 = _v37.termRef(1);
          ESLVal $198 = _v37.termRef(2);
          ESLVal $197 = _v37.termRef(3);
          
          {ESLVal l = $200;
          
          {ESLVal name = $199;
          
          {ESLVal t = $198;
          
          {ESLVal st = $197;
          
          return new ESLVal("Dec",l,name,substType.apply(_v198,_v197,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(70876,70973)"));
      }
      }
    }
  });
  private static ESLVal substDecEnv = new ESLVal(new Function(new ESLVal("substDecEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v36 = d;
        
        switch(_v36.termName) {
        case "Dec": {ESLVal $196 = _v36.termRef(0);
          ESLVal $195 = _v36.termRef(1);
          ESLVal $194 = _v36.termRef(2);
          ESLVal $193 = _v36.termRef(3);
          
          {ESLVal l = $196;
          
          {ESLVal name = $195;
          
          {ESLVal t = $194;
          
          {ESLVal st = $193;
          
          return new ESLVal("Dec",l,name,substTypeEnv.apply(env,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(71018,71112)"));
      }
      }
    }
  });
  private static ESLVal substMType = new ESLVal(new Function(new ESLVal("substMType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v195 = $args[0];
  ESLVal _v194 = $args[1];
  ESLVal _v193 = $args[2];
  {ESLVal _v34 = _v193;
        
        switch(_v34.termName) {
        case "MessageType": {ESLVal $192 = _v34.termRef(0);
          ESLVal $191 = _v34.termRef(1);
          
          {ESLVal l = $192;
          
          {ESLVal ts = $191;
          
          return new ESLVal("MessageType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v35 = $qualArg;
                
                {ESLVal t = _v35;
                
                return ESLVal.list(ESLVal.list(substType.apply(_v195,_v194,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(71172,71280)"));
      }
      }
    }
  });
  private static ESLVal substMTypeEnv = new ESLVal(new Function(new ESLVal("substMTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal m = $args[1];
  {ESLVal _v32 = m;
        
        switch(_v32.termName) {
        case "MessageType": {ESLVal $190 = _v32.termRef(0);
          ESLVal $189 = _v32.termRef(1);
          
          {ESLVal l = $190;
          
          {ESLVal ts = $189;
          
          return new ESLVal("MessageType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v33 = $qualArg;
                
                {ESLVal t = _v33;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(71332,71437)"));
      }
      }
    }
  });
  private static ESLVal substTypes = new ESLVal(new Function(new ESLVal("substTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v192 = $args[0];
  ESLVal _v191 = $args[1];
  ESLVal _v190 = $args[2];
  {ESLVal _v31 = _v190;
        
        if(_v31.isCons())
        {ESLVal $187 = _v31.head();
          ESLVal $188 = _v31.tail();
          
          {ESLVal t = $187;
          
          {ESLVal ts = $188;
          
          return substTypes.apply(_v192,_v191,ts).cons(substType.apply(_v192,_v191,t));
        }
        }
        }
      else if(_v31.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(71590,71710)"));
      }
    }
  });
  private static ESLVal substType = new ESLVal(new Function(new ESLVal("substType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v189 = $args[0];
  ESLVal _v188 = $args[1];
  ESLVal _v187 = $args[2];
  {ESLVal _v28 = _v187;
        
        switch(_v28.termName) {
        case "ApplyType": {ESLVal $186 = _v28.termRef(0);
          ESLVal $185 = _v28.termRef(1);
          ESLVal $184 = _v28.termRef(2);
          
          {ESLVal l = $186;
          
          {ESLVal m = $185;
          
          {ESLVal types = $184;
          
          if(m.eql(_v188).boolVal)
          return new ESLVal("ApplyTypeFun",l,_v189,substTypes.apply(_v189,_v188,types));
          else
            return new ESLVal("ApplyType",l,m,substTypes.apply(_v189,_v188,types));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $183 = _v28.termRef(0);
          ESLVal $182 = _v28.termRef(1);
          ESLVal $181 = _v28.termRef(2);
          
          {ESLVal l = $183;
          
          {ESLVal op = $182;
          
          {ESLVal args = $181;
          
          return new ESLVal("ApplyTypeFun",l,substType.apply(_v189,_v188,op),substTypes.apply(_v189,_v188,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $180 = _v28.termRef(0);
          ESLVal $179 = _v28.termRef(1);
          ESLVal $178 = _v28.termRef(2);
          
          {ESLVal l = $180;
          
          {ESLVal decs = $179;
          
          {ESLVal handlers = $178;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                {ESLVal d = _v29;
                
                return ESLVal.list(ESLVal.list(substDec.apply(_v189,_v188,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v30 = $qualArg;
                
                {ESLVal m = _v30;
                
                return ESLVal.list(ESLVal.list(substMType.apply(_v189,_v188,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ArrayType": {ESLVal $177 = _v28.termRef(0);
          ESLVal $176 = _v28.termRef(1);
          
          {ESLVal l = $177;
          
          {ESLVal t = $176;
          
          return new ESLVal("ArrayType",l,substType.apply(_v189,_v188,t));
        }
        }
        }
      case "BoolType": {ESLVal $175 = _v28.termRef(0);
          
          {ESLVal l = $175;
          
          return _v187;
        }
        }
      case "FloatType": {ESLVal $174 = _v28.termRef(0);
          
          {ESLVal l = $174;
          
          return _v187;
        }
        }
      case "ForallType": {ESLVal $173 = _v28.termRef(0);
          ESLVal $172 = _v28.termRef(1);
          ESLVal $171 = _v28.termRef(2);
          
          {ESLVal l = $173;
          
          {ESLVal ns = $172;
          
          {ESLVal t = $171;
          
          if(member.apply(_v188,ns).boolVal)
          return _v187;
          else
            return new ESLVal("ForallType",l,ns,substType.apply(_v189,_v188,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $170 = _v28.termRef(0);
          ESLVal $169 = _v28.termRef(1);
          ESLVal $168 = _v28.termRef(2);
          
          {ESLVal l = $170;
          
          {ESLVal d = $169;
          
          {ESLVal r = $168;
          
          return new ESLVal("FunType",l,substTypes.apply(_v189,_v188,d),substType.apply(_v189,_v188,r));
        }
        }
        }
        }
      case "IntType": {ESLVal $167 = _v28.termRef(0);
          
          {ESLVal l = $167;
          
          return _v187;
        }
        }
      case "ListType": {ESLVal $166 = _v28.termRef(0);
          ESLVal $165 = _v28.termRef(1);
          
          {ESLVal l = $166;
          
          {ESLVal t = $165;
          
          return new ESLVal("ListType",l,substType.apply(_v189,_v188,t));
        }
        }
        }
      case "NullType": {ESLVal $164 = _v28.termRef(0);
          
          {ESLVal l = $164;
          
          return _v187;
        }
        }
      case "RecordType": {ESLVal $163 = _v28.termRef(0);
          ESLVal $162 = _v28.termRef(1);
          
          {ESLVal l = $163;
          
          {ESLVal fs = $162;
          
          return new ESLVal("RecordType",l,substTypes.apply(_v189,_v188,fs));
        }
        }
        }
      case "RecType": {ESLVal $161 = _v28.termRef(0);
          ESLVal $160 = _v28.termRef(1);
          ESLVal $159 = _v28.termRef(2);
          
          {ESLVal l = $161;
          
          {ESLVal a = $160;
          
          {ESLVal t = $159;
          
          if(_v188.eql(a).boolVal)
          return _v187;
          else
            return new ESLVal("RecType",l,a,substType.apply(_v189,_v188,t));
        }
        }
        }
        }
      case "StrType": {ESLVal $158 = _v28.termRef(0);
          
          {ESLVal l = $158;
          
          return _v187;
        }
        }
      case "TermType": {ESLVal $157 = _v28.termRef(0);
          ESLVal $156 = _v28.termRef(1);
          ESLVal $155 = _v28.termRef(2);
          
          {ESLVal l = $157;
          
          {ESLVal f = $156;
          
          {ESLVal ts = $155;
          
          return new ESLVal("TermType",l,f,substTypes.apply(_v189,_v188,ts));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $154 = _v28.termRef(0);
          
          {ESLVal f = $154;
          
          return _v187;
        }
        }
      case "TypeFun": {ESLVal $153 = _v28.termRef(0);
          ESLVal $152 = _v28.termRef(1);
          ESLVal $151 = _v28.termRef(2);
          
          {ESLVal l = $153;
          
          {ESLVal ns = $152;
          
          {ESLVal t = $151;
          
          if(member.apply(_v188,ns).boolVal)
          return _v187;
          else
            return new ESLVal("TypeFun",l,ns,substType.apply(_v189,_v188,t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $150 = _v28.termRef(0);
          ESLVal $149 = _v28.termRef(1);
          
          {ESLVal l = $150;
          
          {ESLVal t = $149;
          
          return new ESLVal("UnfoldType",l,substType.apply(_v189,_v188,t));
        }
        }
        }
      case "UnionType": {ESLVal $148 = _v28.termRef(0);
          ESLVal $147 = _v28.termRef(1);
          
          {ESLVal l = $148;
          
          {ESLVal ts = $147;
          
          return new ESLVal("UnionType",l,substTypes.apply(_v189,_v188,ts));
        }
        }
        }
      case "VarType": {ESLVal $146 = _v28.termRef(0);
          ESLVal $145 = _v28.termRef(1);
          
          {ESLVal l = $146;
          
          {ESLVal name = $145;
          
          if(name.eql(_v188).boolVal)
          return _v189;
          else
            return _v187;
        }
        }
        }
      case "VoidType": {ESLVal $144 = _v28.termRef(0);
          
          {ESLVal l = $144;
          
          return _v187;
        }
        }
      case "UnionRef": {ESLVal $143 = _v28.termRef(0);
          ESLVal $142 = _v28.termRef(1);
          ESLVal $141 = _v28.termRef(2);
          
          {ESLVal l = $143;
          
          {ESLVal t = $142;
          
          {ESLVal name = $141;
          
          return new ESLVal("UnionRef",l,substType.apply(_v189,_v188,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v28;
          
          return error(x);
        }
      }
      }
    }
  });
  private static ESLVal substTypesEnv = new ESLVal(new Function(new ESLVal("substTypesEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v27 = types;
        
        if(_v27.isCons())
        {ESLVal $139 = _v27.head();
          ESLVal $140 = _v27.tail();
          
          {ESLVal t = $139;
          
          {ESLVal ts = $140;
          
          return substTypesEnv.apply(env,ts).cons(substTypeEnv.apply(env,t));
        }
        }
        }
      else if(_v27.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(73764,73875)"));
      }
    }
  });
  private static ESLVal substTypeEnv = new ESLVal(new Function(new ESLVal("substTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal oldType = $args[1];
  {ESLVal _v20 = oldType;
        
        switch(_v20.termName) {
        case "ApplyType": {ESLVal $138 = _v20.termRef(0);
          ESLVal $137 = _v20.termRef(1);
          ESLVal $136 = _v20.termRef(2);
          
          {ESLVal l = $138;
          
          {ESLVal n = $137;
          
          {ESLVal types = $136;
          
          {ESLVal op = lookupType.apply(n,env);
          
          if(op.eql($null).boolVal)
          return new ESLVal("ApplyType",l,n,substTypesEnv.apply(env,types));
          else
            return new ESLVal("ApplyTypeFun",l,op,substTypesEnv.apply(env,types));
        }
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $135 = _v20.termRef(0);
          ESLVal $134 = _v20.termRef(1);
          ESLVal $133 = _v20.termRef(2);
          
          {ESLVal l = $135;
          
          {ESLVal op = $134;
          
          {ESLVal args = $133;
          
          return new ESLVal("ApplyTypeFun",l,substTypeEnv.apply(env,op),substTypesEnv.apply(env,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $132 = _v20.termRef(0);
          ESLVal $131 = _v20.termRef(1);
          ESLVal $130 = _v20.termRef(2);
          
          {ESLVal l = $132;
          
          {ESLVal decs = $131;
          
          {ESLVal handlers = $130;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v25 = $qualArg;
                
                {ESLVal d = _v25;
                
                return ESLVal.list(ESLVal.list(substDecEnv.apply(env,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v26 = $qualArg;
                
                {ESLVal m = _v26;
                
                return ESLVal.list(ESLVal.list(substMTypeEnv.apply(env,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ArrayType": {ESLVal $129 = _v20.termRef(0);
          ESLVal $128 = _v20.termRef(1);
          
          {ESLVal l = $129;
          
          {ESLVal t = $128;
          
          return new ESLVal("ArrayType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BoolType": {ESLVal $127 = _v20.termRef(0);
          
          {ESLVal l = $127;
          
          return oldType;
        }
        }
      case "FloatType": {ESLVal $126 = _v20.termRef(0);
          
          {ESLVal l = $126;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $125 = _v20.termRef(0);
          ESLVal $124 = _v20.termRef(1);
          ESLVal $123 = _v20.termRef(2);
          
          {ESLVal l = $125;
          
          {ESLVal ns = $124;
          
          {ESLVal t = $123;
          
          return new ESLVal("ForallType",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "FieldType": {ESLVal $122 = _v20.termRef(0);
          ESLVal $121 = _v20.termRef(1);
          ESLVal $120 = _v20.termRef(2);
          
          {ESLVal l = $122;
          
          {ESLVal n = $121;
          
          {ESLVal t = $120;
          
          return new ESLVal("FieldType",l,n,substTypeEnv.apply(env,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $119 = _v20.termRef(0);
          ESLVal $118 = _v20.termRef(1);
          ESLVal $117 = _v20.termRef(2);
          
          {ESLVal l = $119;
          
          {ESLVal d = $118;
          
          {ESLVal r = $117;
          
          return new ESLVal("FunType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v24 = $qualArg;
                
                {ESLVal t = _v24;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(d).flatten().flatten(),substTypeEnv.apply(env,r));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $116 = _v20.termRef(0);
          ESLVal $115 = _v20.termRef(1);
          ESLVal $114 = _v20.termRef(2);
          ESLVal $113 = _v20.termRef(3);
          
          {ESLVal l = $116;
          
          {ESLVal d = $115;
          
          {ESLVal p = $114;
          
          {ESLVal r = $113;
          
          return new ESLVal("FunType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v23 = $qualArg;
                
                {ESLVal t = _v23;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(d).flatten().flatten(),substTypeEnv.apply(env,r));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $112 = _v20.termRef(0);
          
          {ESLVal l = $112;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $111 = _v20.termRef(0);
          ESLVal $110 = _v20.termRef(1);
          
          {ESLVal l = $111;
          
          {ESLVal t = $110;
          
          return new ESLVal("ListType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "SetType": {ESLVal $109 = _v20.termRef(0);
          ESLVal $108 = _v20.termRef(1);
          
          {ESLVal l = $109;
          
          {ESLVal t = $108;
          
          return new ESLVal("SetType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BagType": {ESLVal $107 = _v20.termRef(0);
          ESLVal $106 = _v20.termRef(1);
          
          {ESLVal l = $107;
          
          {ESLVal t = $106;
          
          return new ESLVal("BagType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "NullType": {ESLVal $105 = _v20.termRef(0);
          
          {ESLVal l = $105;
          
          return oldType;
        }
        }
      case "RecType": {ESLVal $104 = _v20.termRef(0);
          ESLVal $103 = _v20.termRef(1);
          ESLVal $102 = _v20.termRef(2);
          
          {ESLVal l = $104;
          
          {ESLVal a = $103;
          
          {ESLVal t = $102;
          
          return new ESLVal("RecType",l,a,substTypeEnv.apply(removeFromDom.apply(env,ESLVal.list(a)),t));
        }
        }
        }
        }
      case "RecordType": {ESLVal $101 = _v20.termRef(0);
          ESLVal $100 = _v20.termRef(1);
          
          {ESLVal l = $101;
          
          {ESLVal fs = $100;
          
          return new ESLVal("RecordType",l,substTypesEnv.apply(env,fs));
        }
        }
        }
      case "StrType": {ESLVal $99 = _v20.termRef(0);
          
          {ESLVal l = $99;
          
          return oldType;
        }
        }
      case "TermType": {ESLVal $98 = _v20.termRef(0);
          ESLVal $97 = _v20.termRef(1);
          ESLVal $96 = _v20.termRef(2);
          
          {ESLVal l = $98;
          
          {ESLVal f = $97;
          
          {ESLVal ts = $96;
          
          return new ESLVal("TermType",l,f,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v22 = $qualArg;
                
                {ESLVal t = _v22;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $95 = _v20.termRef(0);
          
          {ESLVal f = $95;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $94 = _v20.termRef(0);
          ESLVal $93 = _v20.termRef(1);
          ESLVal $92 = _v20.termRef(2);
          
          {ESLVal l = $94;
          
          {ESLVal ns = $93;
          
          {ESLVal t = $92;
          
          return new ESLVal("TypeFun",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $91 = _v20.termRef(0);
          ESLVal $90 = _v20.termRef(1);
          
          {ESLVal l = $91;
          
          {ESLVal t = $90;
          
          return new ESLVal("UnfoldType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "UnionType": {ESLVal $89 = _v20.termRef(0);
          ESLVal $88 = _v20.termRef(1);
          
          {ESLVal l = $89;
          
          {ESLVal ts = $88;
          
          return new ESLVal("UnionType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v21 = $qualArg;
                
                {ESLVal t = _v21;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
      case "VarType": {ESLVal $87 = _v20.termRef(0);
          ESLVal $86 = _v20.termRef(1);
          
          {ESLVal l = $87;
          
          {ESLVal name = $86;
          
          if(member.apply(name,typeEnvDom.apply(env)).boolVal)
          return lookupType.apply(name,env);
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $85 = _v20.termRef(0);
          
          {ESLVal l = $85;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $84 = _v20.termRef(0);
          ESLVal $83 = _v20.termRef(1);
          ESLVal $82 = _v20.termRef(2);
          
          {ESLVal l = $84;
          
          {ESLVal t = $83;
          
          {ESLVal name = $82;
          
          return new ESLVal("UnionRef",l,substTypeEnv.apply(env,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v20;
          
          return error(oldType);
        }
      }
      }
    }
  });
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v185 = $args[0];
          {ESLVal[] e = new ESLVal[]{$null};
                
                {ESLVal fenv = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v18 = $qualArg;
                        
                        {ESLVal t = _v18;
                        
                        return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v186 = $args[0];
                        {ESLVal _v19 = _v186;
                              
                              {ESLVal n = _v19;
                              
                              return ESLVal.list(ESLVal.list(new ESLVal("Map",n,new ESLVal("TypeClosure",new ESLVal(new Function(new ESLVal("lookup: ").add(n),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  return lookupType.apply(n,e[0]);
                                }
                              })))));
                            }
                            }
                          }
                        }).map(typeFV.apply(t)).flatten().flatten());
                      }
                      }
                    }
                  }).map(typeEnvRan.apply(_v185)).flatten().flatten();
                
                {ESLVal env1 = substOnce.apply(_v185,fenv);
                
                {e[0] = env1;
              return env1;}
              }
              }
              }
            }
          });
        ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v184 = $args[0];
          {ESLVal _v17 = _v184;
                
                if(_v17.isCons())
                {ESLVal $78 = _v17.head();
                  ESLVal $79 = _v17.tail();
                  
                  switch($78.termName) {
                  case "Map": {ESLVal $81 = $78.termRef(0);
                    ESLVal $80 = $78.termRef(1);
                    
                    {ESLVal n = $81;
                    
                    {ESLVal t = $80;
                    
                    {ESLVal e = $79;
                    
                    if(member.apply(n,typeFV.apply(t)).boolVal)
                    return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecType",p0,n,t)));
                    else
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,t));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(76610,76836)"));
                }
                }
              else if(_v17.isNil())
                return _v184;
              else return error(new ESLVal("case error at Pos(76610,76836)"));
              }
            }
          });
        ESLVal substOnceOld = new ESLVal(new Function(new ESLVal("substOnceOld"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v182 = $args[0];
          ESLVal _v181 = $args[1];
          {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  {ESLVal _v15 = m;
                        
                        switch(_v15.termName) {
                        case "Map": {ESLVal $77 = _v15.termRef(0);
                          ESLVal $76 = _v15.termRef(1);
                          
                          {ESLVal n = $77;
                          
                          {ESLVal t = $76;
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $qualArg = $args[0];
                          {ESLVal _v16 = $qualArg;
                                
                                {ESLVal _v183 = _v16;
                                
                                return ESLVal.list(ESLVal.list(new ESLVal("Map",_v183,_v181.apply(_v183))));
                              }
                              }
                            }
                          }).map(typeFV.apply(t)).flatten().flatten(),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(76951,77074)"));
                      }
                      }
                    }
                  });
                
                return map.apply(map1,_v182);
              }
            }
          });
        ESLVal substOnce = new ESLVal(new Function(new ESLVal("substOnce"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v179 = $args[0];
          ESLVal _v178 = $args[1];
          {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  {ESLVal _v13 = m;
                        
                        switch(_v13.termName) {
                        case "Map": {ESLVal $75 = _v13.termRef(0);
                          ESLVal $74 = _v13.termRef(1);
                          
                          {ESLVal n = $75;
                          
                          {ESLVal t = $74;
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $qualArg = $args[0];
                          {ESLVal _v14 = $qualArg;
                                
                                {ESLVal _v180 = _v14;
                                
                                return ESLVal.list(ESLVal.list(new ESLVal("Map",_v180,lookupType.apply(_v180,_v178))));
                              }
                              }
                            }
                          }).map(typeFV.apply(t)).flatten().flatten(),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(77213,77344)"));
                      }
                      }
                    }
                  });
                
                return map.apply(map1,_v179);
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "fixEnv": return fixEnv;
            
            case "introduceRecTypes": return introduceRecTypes;
            
            case "substOnceOld": return substOnceOld;
            
            case "substOnce": return substOnce;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal fixEnv = letrec.get("fixEnv");
      
      ESLVal introduceRecTypes = letrec.get("introduceRecTypes");
      
      ESLVal substOnceOld = letrec.get("substOnceOld");
      
      ESLVal substOnce = letrec.get("substOnce");
      
        return fixEnv.apply(introduceRecTypes.apply(env));
      
    }
  });
  private static ESLVal typeFV = new ESLVal(new Function(new ESLVal("typeFV"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  return removeDups.apply(varTypeNames.apply(typeFV1.apply(t,$nil)));
    }
  });
  private static ESLVal varTypeNames = new ESLVal(new Function(new ESLVal("varTypeNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal vs = $args[0];
  return map.apply(varTypeName,vs);
    }
  });
  private static ESLVal varTypeName = new ESLVal(new Function(new ESLVal("varTypeName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v12 = t;
        
        switch(_v12.termName) {
        case "VarType": {ESLVal $73 = _v12.termRef(0);
          ESLVal $72 = _v12.termRef(1);
          
          {ESLVal l = $73;
          
          {ESLVal n = $72;
          
          return n;
        }
        }
        }
        default: {ESLVal x = _v12;
          
          return new ESLVal("<var>");
        }
      }
      }
    }
  });
  private static ESLVal tdecsFV1 = new ESLVal(new Function(new ESLVal("tdecsFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal decs = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v11 = decs;
        
        if(_v11.isCons())
        {ESLVal $70 = _v11.head();
          ESLVal $71 = _v11.tail();
          
          {ESLVal d = $70;
          
          {ESLVal ds = $71;
          
          return tdecFV1.apply(d,tdecsFV1.apply(ds,fv));
        }
        }
        }
      else if(_v11.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(77730,77819)"));
      }
    }
  });
  private static ESLVal tdecFV1 = new ESLVal(new Function(new ESLVal("tdecFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v10 = d;
        
        switch(_v10.termName) {
        case "Dec": {ESLVal $69 = _v10.termRef(0);
          ESLVal $68 = _v10.termRef(1);
          ESLVal $67 = _v10.termRef(2);
          ESLVal $66 = _v10.termRef(3);
          
          {ESLVal l = $69;
          
          {ESLVal n = $68;
          
          {ESLVal t = $67;
          
          {ESLVal st = $66;
          
          return typeFV1.apply(t,fv);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(77863,77942)"));
      }
      }
    }
  });
  private static ESLVal handlersFV1 = new ESLVal(new Function(new ESLVal("handlersFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal handlers = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v9 = handlers;
        
        if(_v9.isCons())
        {ESLVal $64 = _v9.head();
          ESLVal $65 = _v9.tail();
          
          {ESLVal m = $64;
          
          {ESLVal hs = $65;
          
          return handlerFV1.apply(m,handlersFV1.apply(hs,fv));
        }
        }
        }
      else if(_v9.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(78000,78102)"));
      }
    }
  });
  private static ESLVal handlerFV1 = new ESLVal(new Function(new ESLVal("handlerFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v8 = m;
        
        switch(_v8.termName) {
        case "MessageType": {ESLVal $63 = _v8.termRef(0);
          ESLVal $62 = _v8.termRef(1);
          
          {ESLVal l = $63;
          
          {ESLVal ts = $62;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(78150,78226)"));
      }
      }
    }
  });
  private static ESLVal typesFV1 = new ESLVal(new Function(new ESLVal("typesFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v7 = ts;
        
        if(_v7.isCons())
        {ESLVal $60 = _v7.head();
          ESLVal $61 = _v7.tail();
          
          {ESLVal t = $60;
          
          {ESLVal _v177 = $61;
          
          return typeFV1.apply(t,typesFV1.apply(_v177,fv));
        }
        }
        }
      else if(_v7.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(78275,78362)"));
      }
    }
  });
  private static ESLVal typeFV1 = new ESLVal(new Function(new ESLVal("typeFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v3 = t;
        
        switch(_v3.termName) {
        case "ArrayType": {ESLVal $53 = _v3.termRef(0);
          ESLVal $52 = _v3.termRef(1);
          
          {ESLVal l = $53;
          
          {ESLVal _v176 = $52;
          
          return typeFV1.apply(_v176,fv);
        }
        }
        }
      case "ActType": {ESLVal $51 = _v3.termRef(0);
          ESLVal $50 = _v3.termRef(1);
          ESLVal $49 = _v3.termRef(2);
          
          {ESLVal l = $51;
          
          {ESLVal decs = $50;
          
          {ESLVal handlers = $49;
          
          return tdecsFV1.apply(decs,handlersFV1.apply(handlers,fv));
        }
        }
        }
        }
      case "ApplyType": {ESLVal $48 = _v3.termRef(0);
          ESLVal $47 = _v3.termRef(1);
          ESLVal $46 = _v3.termRef(2);
          
          {ESLVal l = $48;
          
          {ESLVal n = $47;
          
          {ESLVal types = $46;
          
          return typesFV1.apply(types,fv.cons(new ESLVal("VarType",l,n)));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $45 = _v3.termRef(0);
          ESLVal $44 = _v3.termRef(1);
          ESLVal $43 = _v3.termRef(2);
          
          {ESLVal l = $45;
          
          {ESLVal op = $44;
          
          {ESLVal args = $43;
          
          return typesFV1.apply(args,typeFV1.apply(op,fv));
        }
        }
        }
        }
      case "BoolType": {ESLVal $42 = _v3.termRef(0);
          
          {ESLVal l = $42;
          
          return fv;
        }
        }
      case "FieldType": {ESLVal $41 = _v3.termRef(0);
          ESLVal $40 = _v3.termRef(1);
          ESLVal $39 = _v3.termRef(2);
          
          {ESLVal l = $41;
          
          {ESLVal n = $40;
          
          {ESLVal _v175 = $39;
          
          return typeFV1.apply(_v175,fv);
        }
        }
        }
        }
      case "FloatType": {ESLVal $38 = _v3.termRef(0);
          
          {ESLVal l = $38;
          
          return fv;
        }
        }
      case "ForallType": {ESLVal $37 = _v3.termRef(0);
          ESLVal $36 = _v3.termRef(1);
          ESLVal $35 = _v3.termRef(2);
          
          {ESLVal l = $37;
          
          {ESLVal ns = $36;
          
          {ESLVal _v172 = $35;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun400"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v173 = $args[0];
          {ESLVal _v6 = _v173;
                
                switch(_v6.termName) {
                case "VarType": {ESLVal $59 = _v6.termRef(0);
                  ESLVal $58 = _v6.termRef(1);
                  
                  {ESLVal _v174 = $59;
                  
                  {ESLVal n = $58;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(79073,79133)"));
              }
              }
            }
          }),typeFV1.apply(_v172,$nil)).add(fv);
        }
        }
        }
        }
      case "FunType": {ESLVal $34 = _v3.termRef(0);
          ESLVal $33 = _v3.termRef(1);
          ESLVal $32 = _v3.termRef(2);
          
          {ESLVal l = $34;
          
          {ESLVal d = $33;
          
          {ESLVal r = $32;
          
          return typesFV1.apply(d,typeFV1.apply(r,fv));
        }
        }
        }
        }
      case "IntType": {ESLVal $31 = _v3.termRef(0);
          
          {ESLVal l = $31;
          
          return fv;
        }
        }
      case "ListType": {ESLVal $30 = _v3.termRef(0);
          ESLVal $29 = _v3.termRef(1);
          
          {ESLVal l = $30;
          
          {ESLVal _v171 = $29;
          
          return typeFV1.apply(_v171,fv);
        }
        }
        }
      case "BagType": {ESLVal $28 = _v3.termRef(0);
          ESLVal $27 = _v3.termRef(1);
          
          {ESLVal l = $28;
          
          {ESLVal _v170 = $27;
          
          return typeFV1.apply(_v170,fv);
        }
        }
        }
      case "SetType": {ESLVal $26 = _v3.termRef(0);
          ESLVal $25 = _v3.termRef(1);
          
          {ESLVal l = $26;
          
          {ESLVal _v169 = $25;
          
          return typeFV1.apply(_v169,fv);
        }
        }
        }
      case "NullType": {ESLVal $24 = _v3.termRef(0);
          
          {ESLVal l = $24;
          
          return fv;
        }
        }
      case "RecordType": {ESLVal $23 = _v3.termRef(0);
          ESLVal $22 = _v3.termRef(1);
          
          {ESLVal l = $23;
          
          {ESLVal fs = $22;
          
          return typesFV1.apply(fs,fv);
        }
        }
        }
      case "RecType": {ESLVal $21 = _v3.termRef(0);
          ESLVal $20 = _v3.termRef(1);
          ESLVal $19 = _v3.termRef(2);
          
          {ESLVal l = $21;
          
          {ESLVal a = $20;
          
          {ESLVal _v166 = $19;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun401"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v167 = $args[0];
          {ESLVal _v5 = _v167;
                
                switch(_v5.termName) {
                case "VarType": {ESLVal $57 = _v5.termRef(0);
                  ESLVal $56 = _v5.termRef(1);
                  
                  {ESLVal _v168 = $57;
                  
                  {ESLVal n = $56;
                  
                  return n.eql(a).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(79549,79597)"));
              }
              }
            }
          }),typeFV1.apply(_v166,$nil)).add(fv);
        }
        }
        }
        }
      case "StrType": {ESLVal $18 = _v3.termRef(0);
          
          {ESLVal l = $18;
          
          return fv;
        }
        }
      case "TypeClosure": {ESLVal $17 = _v3.termRef(0);
          
          {ESLVal f = $17;
          
          return $nil;
        }
        }
      case "TermType": {ESLVal $16 = _v3.termRef(0);
          ESLVal $15 = _v3.termRef(1);
          ESLVal $14 = _v3.termRef(2);
          
          {ESLVal l = $16;
          
          {ESLVal n = $15;
          
          {ESLVal ts = $14;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $13 = _v3.termRef(0);
          ESLVal $12 = _v3.termRef(1);
          ESLVal $11 = _v3.termRef(2);
          
          {ESLVal l = $13;
          
          {ESLVal ns = $12;
          
          {ESLVal _v163 = $11;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun402"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v164 = $args[0];
          {ESLVal _v4 = _v164;
                
                switch(_v4.termName) {
                case "VarType": {ESLVal $55 = _v4.termRef(0);
                  ESLVal $54 = _v4.termRef(1);
                  
                  {ESLVal _v165 = $55;
                  
                  {ESLVal n = $54;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(79826,79886)"));
              }
              }
            }
          }),typeFV1.apply(_v163,$nil)).add(fv);
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $10 = _v3.termRef(0);
          ESLVal $9 = _v3.termRef(1);
          
          {ESLVal l = $10;
          
          {ESLVal _v162 = $9;
          
          return typeFV1.apply(_v162,fv);
        }
        }
        }
      case "UnionType": {ESLVal $8 = _v3.termRef(0);
          ESLVal $7 = _v3.termRef(1);
          
          {ESLVal l = $8;
          
          {ESLVal ts = $7;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
      case "VarType": {ESLVal $6 = _v3.termRef(0);
          ESLVal $5 = _v3.termRef(1);
          
          {ESLVal l = $6;
          
          {ESLVal n = $5;
          
          return fv.cons(t);
        }
        }
        }
      case "VoidType": {ESLVal $4 = _v3.termRef(0);
          
          {ESLVal l = $4;
          
          return fv;
        }
        }
      case "UnionRef": {ESLVal $3 = _v3.termRef(0);
          ESLVal $2 = _v3.termRef(1);
          ESLVal $1 = _v3.termRef(2);
          
          {ESLVal l = $3;
          
          {ESLVal _v161 = $2;
          
          {ESLVal n = $1;
          
          return typeFV1.apply(_v161,fv);
        }
        }
        }
        }
        default: {ESLVal x = _v3;
          
          return error(x);
        }
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
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
                {new Function(new ESLVal("try"),getSelf()) {
                  public ESLVal apply(ESLVal... args) { 
                    try { 
                      return typeCheckModule.apply(new ESLVal("esl/compiler/test1.esl"));
                    } catch(ESLError $exception) {
                      ESLVal $x = $exception.value;
                      {ESLVal _v1 = $x;
                  
                  {ESLVal message = _v1;
                  
                  return print.apply(new ESLVal("Type Error: ").add(message));
                }
                }
                    }
                  }
                }.apply();
                print.apply(new ESLVal("DONE"));
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