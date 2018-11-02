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
  {ESLVal _v119 = p;
        
        switch(_v119.termName) {
        case "PVar": {ESLVal $741 = _v119.termRef(0);
          ESLVal $740 = _v119.termRef(1);
          ESLVal $739 = _v119.termRef(2);
          
          {ESLVal l = $741;
          
          {ESLVal n = $740;
          
          {ESLVal t = $739;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $736 = _v119.termRef(0);
          ESLVal $735 = _v119.termRef(1);
          ESLVal $734 = _v119.termRef(2);
          ESLVal $733 = _v119.termRef(3);
          
          if($734.isCons())
          {ESLVal $737 = $734.head();
            ESLVal $738 = $734.tail();
            
            {ESLVal l = $736;
            
            {ESLVal n = $735;
            
            {ESLVal ts = $734;
            
            {ESLVal ps = $733;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
          }
        else if($734.isNil())
          {ESLVal l = $736;
            
            {ESLVal n = $735;
            
            {ESLVal ps = $733;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $736;
            
            {ESLVal n = $735;
            
            {ESLVal ts = $734;
            
            {ESLVal ps = $733;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $732 = _v119.termRef(0);
          ESLVal $731 = _v119.termRef(1);
          ESLVal $730 = _v119.termRef(2);
          
          {ESLVal l = $732;
          
          {ESLVal _v964 = $731;
          
          {ESLVal ts = $730;
          
          return ppPattern.apply(_v964).add(ppTypes.apply(ts,ESLVal.list()));
        }
        }
        }
        }
      case "PNil": {ESLVal $729 = _v119.termRef(0);
          
          {ESLVal l = $729;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $728 = _v119.termRef(0);
          ESLVal $727 = _v119.termRef(1);
          
          {ESLVal l = $728;
          
          {ESLVal n = $727;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $726 = _v119.termRef(0);
          ESLVal $725 = _v119.termRef(1);
          
          {ESLVal l = $726;
          
          {ESLVal b = $725;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $724 = _v119.termRef(0);
          ESLVal $723 = _v119.termRef(1);
          
          {ESLVal l = $724;
          
          {ESLVal s = $723;
          
          return s;
        }
        }
        }
      case "PCons": {ESLVal $722 = _v119.termRef(0);
          ESLVal $721 = _v119.termRef(1);
          ESLVal $720 = _v119.termRef(2);
          
          {ESLVal l = $722;
          
          {ESLVal h = $721;
          
          {ESLVal t = $720;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v965 = _v119;
          
          return new ESLVal("<unknown: ").add(_v965.add(new ESLVal(">")));
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
  private static ESLVal actType0 = new ESLVal("ActType",p0,ESLVal.list(),ESLVal.list());
  private static ESLVal contentType = new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("RawText"),ESLVal.list(new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("ESLSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("JavaSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0)))));
  private static ESLVal editMessage = new ESLVal("MessageType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Edit"),ESLVal.list(contentType))));
  private static ESLVal env0 = ESLVal.list(new ESLVal("Map",new ESLVal("edb"),new ESLVal("ActType",p0,ESLVal.list(new ESLVal("Dec",p0,new ESLVal("button"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("VoidType",p0)),$null),new ESLVal("Dec",p0,new ESLVal("display"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VarType",p0,new ESLVal("T")))),$null)),ESLVal.list(editMessage))),new ESLVal("Map",new ESLVal("kill"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("print"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("parse"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))),new ESLVal("Map",new ESLVal("random"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("IntType",p0))),new ESLVal("Map",new ESLVal("wait"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("stopAll"),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("isqrt"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("FloatType",p0))),new ESLVal("Map",new ESLVal("builtin"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("IntType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))));
  private static ESLVal cnstrEnv0 = ESLVal.list(new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))));
  private static ESLVal tenv0 = ESLVal.list(new ESLVal("Map",new ESLVal("EditType"),contentType),new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))),new ESLVal("Map",new ESLVal("Point"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Point"),ESLVal.list(new ESLVal("IntType",p0),new ESLVal("IntType",p0)))))));
  private static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v117 = env;
        while(_v117.isCons()) {
          ESLVal _v116 = _v117.headVal;
          {ESLVal _v115 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v118 = _v116;
                    
                    switch(_v118.termName) {
                    case "Map": {ESLVal $719 = _v118.termRef(0);
                      ESLVal $718 = _v118.termRef(1);
                      
                      {ESLVal n = $719;
                      
                      {ESLVal t = $718;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t,env).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v118;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v115.apply();
          }
          _v117 = _v117.tailVal;}
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
        ESLVal _v113 = env;
        while(_v113.isCons()) {
          ESLVal _v112 = _v113.headVal;
          {ESLVal _v111 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v114 = _v112;
                    
                    switch(_v114.termName) {
                    case "Map": {ESLVal $717 = _v114.termRef(0);
                      ESLVal $716 = _v114.termRef(1);
                      
                      {ESLVal n = $717;
                      
                      {ESLVal t = $716;
                      
                      if(typeEqual.apply(t0,t).boolVal)
                      {name[0] = n;
                      return $null;}
                      else
                        return $null;
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v114;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v111.apply();
          }
          _v113 = _v113.tailVal;}
      }
      return name[0];}
      }
    }
  });
  private static ESLVal ppType0 = new ESLVal(new Function(new ESLVal("ppType0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  return new ESLVal(new Function(new ESLVal("fun601"),getSelf()) {
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
  {ESLVal _v110 = handlers;
        
        if(_v110.isCons())
        {ESLVal $710 = _v110.head();
          ESLVal $711 = _v110.tail();
          
          switch($710.termName) {
          case "MessageType": {ESLVal $713 = $710.termRef(0);
            ESLVal $712 = $710.termRef(1);
            
            if($712.isCons())
            {ESLVal $714 = $712.head();
              ESLVal $715 = $712.tail();
              
              {ESLVal l = $713;
              
              {ESLVal t = $714;
              
              {ESLVal ts = $715;
              
              {ESLVal hs = $711;
              
              return ppType.apply(t,env).add(new ESLVal("; ").add(ppHandlers.apply(hs,env)));
            }
            }
            }
            }
            }
          else if($712.isNil())
            return error(new ESLVal("case error at Pos(4996,5130)").add(ESLVal.list(_v110)));
          else return error(new ESLVal("case error at Pos(4996,5130)").add(ESLVal.list(_v110)));
          }
          default: return error(new ESLVal("case error at Pos(4996,5130)").add(ESLVal.list(_v110)));
        }
        }
      else if(_v110.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(4996,5130)").add(ESLVal.list(_v110)));
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
          {ESLVal _v109 = t;
            
            switch(_v109.termName) {
            case "ActType": {ESLVal $709 = _v109.termRef(0);
              ESLVal $708 = _v109.termRef(1);
              ESLVal $707 = _v109.termRef(2);
              
              {ESLVal l = $709;
              
              {ESLVal decs = $708;
              
              {ESLVal handlers = $707;
              
              return new ESLVal("Act { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")));
            }
            }
            }
            }
          case "ApplyType": {ESLVal $706 = _v109.termRef(0);
              ESLVal $705 = _v109.termRef(1);
              ESLVal $704 = _v109.termRef(2);
              
              {ESLVal l = $706;
              
              {ESLVal n = $705;
              
              {ESLVal args = $704;
              
              return n.add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ApplyTypeFun": {ESLVal $703 = _v109.termRef(0);
              ESLVal $702 = _v109.termRef(1);
              ESLVal $701 = _v109.termRef(2);
              
              {ESLVal l = $703;
              
              {ESLVal op = $702;
              
              {ESLVal args = $701;
              
              return ppType.apply(op,env).add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ArrayType": {ESLVal $700 = _v109.termRef(0);
              ESLVal $699 = _v109.termRef(1);
              
              {ESLVal l = $700;
              
              {ESLVal _v963 = $699;
              
              return new ESLVal("Array[").add(ppType.apply(_v963,env).add(new ESLVal("]")));
            }
            }
            }
          case "BoolType": {ESLVal $698 = _v109.termRef(0);
              
              {ESLVal l = $698;
              
              return new ESLVal("Bool");
            }
            }
          case "ExtendedAct": {ESLVal $697 = _v109.termRef(0);
              ESLVal $696 = _v109.termRef(1);
              ESLVal $695 = _v109.termRef(2);
              ESLVal $694 = _v109.termRef(3);
              
              {ESLVal l = $697;
              
              {ESLVal parent = $696;
              
              {ESLVal decs = $695;
              
              {ESLVal handlers = $694;
              
              return new ESLVal("Act extends ").add(ppType.apply(parent,env).add(new ESLVal(" { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")))));
            }
            }
            }
            }
            }
          case "FloatType": {ESLVal $693 = _v109.termRef(0);
              
              {ESLVal l = $693;
              
              return new ESLVal("Float");
            }
            }
          case "FieldType": {ESLVal $692 = _v109.termRef(0);
              ESLVal $691 = _v109.termRef(1);
              ESLVal $690 = _v109.termRef(2);
              
              {ESLVal l = $692;
              
              {ESLVal n = $691;
              
              {ESLVal _v962 = $690;
              
              return n.add(new ESLVal("::").add(ppType.apply(_v962,env)));
            }
            }
            }
            }
          case "ForallType": {ESLVal $689 = _v109.termRef(0);
              ESLVal $688 = _v109.termRef(1);
              ESLVal $687 = _v109.termRef(2);
              
              {ESLVal l = $689;
              
              {ESLVal ns = $688;
              
              {ESLVal _v961 = $687;
              
              return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v961,env))));
            }
            }
            }
            }
          case "FunType": {ESLVal $686 = _v109.termRef(0);
              ESLVal $685 = _v109.termRef(1);
              ESLVal $684 = _v109.termRef(2);
              
              {ESLVal l = $686;
              
              {ESLVal d = $685;
              
              {ESLVal r = $684;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
          case "TaggedFunType": {ESLVal $683 = _v109.termRef(0);
              ESLVal $682 = _v109.termRef(1);
              ESLVal $681 = _v109.termRef(2);
              ESLVal $680 = _v109.termRef(3);
              
              {ESLVal l = $683;
              
              {ESLVal d = $682;
              
              {ESLVal p = $681;
              
              {ESLVal r = $680;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
            }
          case "IntType": {ESLVal $679 = _v109.termRef(0);
              
              {ESLVal l = $679;
              
              return new ESLVal("Int");
            }
            }
          case "ListType": {ESLVal $678 = _v109.termRef(0);
              ESLVal $677 = _v109.termRef(1);
              
              {ESLVal l = $678;
              
              {ESLVal _v960 = $677;
              
              return new ESLVal("[").add(ppType.apply(_v960,env).add(new ESLVal("]")));
            }
            }
            }
          case "NullType": {ESLVal $676 = _v109.termRef(0);
              
              {ESLVal l = $676;
              
              return new ESLVal("Null");
            }
            }
          case "RecType": {ESLVal $675 = _v109.termRef(0);
              ESLVal $674 = _v109.termRef(1);
              ESLVal $673 = _v109.termRef(2);
              
              {ESLVal l = $675;
              
              {ESLVal n = $674;
              
              {ESLVal _v959 = $673;
              
              return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v959,env))));
            }
            }
            }
            }
          case "RecordType": {ESLVal $672 = _v109.termRef(0);
              ESLVal $671 = _v109.termRef(1);
              
              {ESLVal l = $672;
              
              {ESLVal fs = $671;
              
              return new ESLVal("{").add(ppTypes.apply(fs,env).add(new ESLVal("}")));
            }
            }
            }
          case "StrType": {ESLVal $670 = _v109.termRef(0);
              
              {ESLVal l = $670;
              
              return new ESLVal("Str");
            }
            }
          case "TableType": {ESLVal $669 = _v109.termRef(0);
              ESLVal $668 = _v109.termRef(1);
              ESLVal $667 = _v109.termRef(2);
              
              {ESLVal l = $669;
              
              {ESLVal k = $668;
              
              {ESLVal v = $667;
              
              return new ESLVal("Hash[").add(ppType.apply(k,env).add(new ESLVal(",").add(ppType.apply(v,env).add(new ESLVal("]")))));
            }
            }
            }
            }
          case "TermType": {ESLVal $666 = _v109.termRef(0);
              ESLVal $665 = _v109.termRef(1);
              ESLVal $664 = _v109.termRef(2);
              
              {ESLVal l = $666;
              
              {ESLVal n = $665;
              
              {ESLVal ts = $664;
              
              return n.add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
            }
          case "TypeFun": {ESLVal $663 = _v109.termRef(0);
              ESLVal $662 = _v109.termRef(1);
              ESLVal $661 = _v109.termRef(2);
              
              {ESLVal l = $663;
              
              {ESLVal ns = $662;
              
              {ESLVal _v958 = $661;
              
              return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v958,env))));
            }
            }
            }
            }
          case "UnfoldType": {ESLVal $660 = _v109.termRef(0);
              ESLVal $659 = _v109.termRef(1);
              
              {ESLVal l = $660;
              
              {ESLVal _v957 = $659;
              
              return new ESLVal("unfold ").add(ppType.apply(_v957,env));
            }
            }
            }
          case "UnionType": {ESLVal $658 = _v109.termRef(0);
              ESLVal $657 = _v109.termRef(1);
              
              {ESLVal l = $658;
              
              {ESLVal ts = $657;
              
              return new ESLVal("union ").add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
          case "VarType": {ESLVal $656 = _v109.termRef(0);
              ESLVal $655 = _v109.termRef(1);
              
              {ESLVal l = $656;
              
              {ESLVal n = $655;
              
              return n;
            }
            }
            }
          case "VoidType": {ESLVal $654 = _v109.termRef(0);
              
              {ESLVal l = $654;
              
              return new ESLVal("Void");
            }
            }
          case "UnionRef": {ESLVal $653 = _v109.termRef(0);
              ESLVal $652 = _v109.termRef(1);
              ESLVal $651 = _v109.termRef(2);
              
              {ESLVal l = $653;
              
              {ESLVal _v956 = $652;
              
              {ESLVal n = $651;
              
              return ppType.apply(_v956,env).add(new ESLVal(".").add(n));
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $650 = _v109.termRef(0);
              
              {ESLVal f = $650;
              
              return f.add(new ESLVal(""));
            }
            }
            default: {ESLVal x = _v109;
              
              return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
            }
          }
          }
    }
  });
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v108 = defs;
        
        if(_v108.isCons())
        {ESLVal $640 = _v108.head();
          ESLVal $641 = _v108.tail();
          
          switch($640.termName) {
          case "TypeBind": {ESLVal $649 = $640.termRef(0);
            ESLVal $648 = $640.termRef(1);
            ESLVal $647 = $640.termRef(2);
            ESLVal $646 = $640.termRef(3);
            
            {ESLVal l = $649;
            
            {ESLVal n = $648;
            
            {ESLVal t = $647;
            
            {ESLVal e = $646;
            
            {ESLVal ds = $641;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $645 = $640.termRef(0);
            ESLVal $644 = $640.termRef(1);
            ESLVal $643 = $640.termRef(2);
            ESLVal $642 = $640.termRef(3);
            
            {ESLVal l = $645;
            
            {ESLVal n = $644;
            
            {ESLVal t = $643;
            
            {ESLVal e = $642;
            
            {ESLVal ds = $641;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $640;
            
            {ESLVal ds = $641;
            
            return typeEnv.apply(ds);
          }
          }
        }
        }
      else if(_v108.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7084,7327)").add(ESLVal.list(_v108)));
      }
    }
  });
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v107 = defs;
        
        if(_v107.isCons())
        {ESLVal $623 = _v107.head();
          ESLVal $624 = _v107.tail();
          
          switch($623.termName) {
          case "TypeBind": {ESLVal $632 = $623.termRef(0);
            ESLVal $631 = $623.termRef(1);
            ESLVal $630 = $623.termRef(2);
            ESLVal $629 = $623.termRef(3);
            
            switch($630.termName) {
            case "RecType": {ESLVal $637 = $630.termRef(0);
              ESLVal $636 = $630.termRef(1);
              ESLVal $635 = $630.termRef(2);
              
              switch($635.termName) {
              case "UnionType": {ESLVal $639 = $635.termRef(0);
                ESLVal $638 = $635.termRef(1);
                
                {ESLVal l = $632;
                
                {ESLVal n = $631;
                
                {ESLVal ll = $637;
                
                {ESLVal m = $636;
                
                {ESLVal lll = $639;
                
                {ESLVal ts = $638;
                
                {ESLVal e = $629;
                
                {ESLVal ds = $624;
                
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
              default: {ESLVal l = $632;
                
                {ESLVal n = $631;
                
                {ESLVal t = $630;
                
                {ESLVal e = $629;
                
                {ESLVal ds = $624;
                
                return cnstrEnv.apply(ds,env);
              }
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $634 = $630.termRef(0);
              ESLVal $633 = $630.termRef(1);
              
              {ESLVal l = $632;
              
              {ESLVal n = $631;
              
              {ESLVal lll = $634;
              
              {ESLVal ts = $633;
              
              {ESLVal e = $629;
              
              {ESLVal ds = $624;
              
              return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $632;
              
              {ESLVal n = $631;
              
              {ESLVal t = $630;
              
              {ESLVal e = $629;
              
              {ESLVal ds = $624;
              
              return cnstrEnv.apply(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "DataBind": {ESLVal $628 = $623.termRef(0);
            ESLVal $627 = $623.termRef(1);
            ESLVal $626 = $623.termRef(2);
            ESLVal $625 = $623.termRef(3);
            
            {ESLVal l = $628;
            
            {ESLVal n = $627;
            
            {ESLVal t = $626;
            
            {ESLVal e = $625;
            
            {ESLVal ds = $624;
            
            return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $623;
            
            {ESLVal ds = $624;
            
            return cnstrEnv.apply(ds,env);
          }
          }
        }
        }
      else if(_v107.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7459,8092)").add(ESLVal.list(_v107)));
      }
    }
  });
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal dataType = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v105 = t;
        
        switch(_v105.termName) {
        case "RecType": {ESLVal $619 = _v105.termRef(0);
          ESLVal $618 = _v105.termRef(1);
          ESLVal $617 = _v105.termRef(2);
          
          {ESLVal _v953 = $619;
          
          {ESLVal n = $618;
          
          {ESLVal _v954 = $617;
          
          return getConstructors.apply(_v953,dataType,_v954);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $616 = _v105.termRef(0);
          ESLVal $615 = _v105.termRef(1);
          ESLVal $614 = _v105.termRef(2);
          
          {ESLVal _v951 = $616;
          
          {ESLVal ns = $615;
          
          {ESLVal _v952 = $614;
          
          return getConstructors.apply(_v951,dataType,_v952);
        }
        }
        }
        }
      case "UnionType": {ESLVal $613 = _v105.termRef(0);
          ESLVal $612 = _v105.termRef(1);
          
          {ESLVal _v948 = $613;
          
          {ESLVal ts = $612;
          
          return map.apply(new ESLVal(new Function(new ESLVal("fun602"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v949 = $args[0];
          {ESLVal _v106 = _v949;
                
                switch(_v106.termName) {
                case "TermType": {ESLVal $622 = _v106.termRef(0);
                  ESLVal $621 = _v106.termRef(1);
                  ESLVal $620 = _v106.termRef(2);
                  
                  {ESLVal _v950 = $622;
                  
                  {ESLVal n = $621;
                  
                  {ESLVal tts = $620;
                  
                  return new ESLVal("Map",n,dataType);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(8611,8677)").add(ESLVal.list(_v106)));
              }
              }
            }
          }),ts);
        }
        }
        }
        default: {ESLVal _v955 = _v105;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType.apply(_v955,ESLVal.list()))));
        }
      }
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
          return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Unbound Types: ").add(freeNames)));
      }
      }
    }
  });
  private static ESLVal checkSingletonTypes = new ESLVal(new Function(new ESLVal("checkSingletonTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v104 = e;
        
        if(_v104.isCons())
        {ESLVal $608 = _v104.head();
          ESLVal $609 = _v104.tail();
          
          switch($608.termName) {
          case "Map": {ESLVal $611 = $608.termRef(0);
            ESLVal $610 = $608.termRef(1);
            
            {ESLVal n = $611;
            
            {ESLVal t = $610;
            
            {ESLVal _v947 = $609;
            
            if(member.apply(n,typeEnvDom.apply(_v947)).boolVal)
            return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Duplicate type name: ").add(n)));
            else
              return checkSingletonTypes.apply(_v947);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9381,9602)").add(ESLVal.list(_v104)));
        }
        }
      else if(_v104.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(9381,9602)").add(ESLVal.list(_v104)));
      }
    }
  });
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v103 = e;
        
        if(_v103.isCons())
        {ESLVal $604 = _v103.head();
          ESLVal $605 = _v103.tail();
          
          switch($604.termName) {
          case "Map": {ESLVal $607 = $604.termRef(0);
            ESLVal $606 = $604.termRef(1);
            
            {ESLVal n = $607;
            
            {ESLVal t = $606;
            
            {ESLVal _v946 = $605;
            
            if(member.apply(n,typeEnvDom.apply(_v946)).boolVal)
            return error(new ESLVal("Duplicate constructor name: ").add(n));
            else
              return checkSingletonConstructors.apply(_v946);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9708,9923)").add(ESLVal.list(_v103)));
        }
        }
      else if(_v103.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(9708,9923)").add(ESLVal.list(_v103)));
      }
    }
  });
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v102 = defs;
        
        if(_v102.isCons())
        {ESLVal $590 = _v102.head();
          ESLVal $591 = _v102.tail();
          
          switch($590.termName) {
          case "TypeBind": {ESLVal $603 = $590.termRef(0);
            ESLVal $602 = $590.termRef(1);
            ESLVal $601 = $590.termRef(2);
            ESLVal $600 = $590.termRef(3);
            
            {ESLVal l = $603;
            
            {ESLVal n = $602;
            
            {ESLVal t = $601;
            
            {ESLVal e = $600;
            
            {ESLVal ds = $591;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $599 = $590.termRef(0);
            ESLVal $598 = $590.termRef(1);
            ESLVal $597 = $590.termRef(2);
            ESLVal $596 = $590.termRef(3);
            
            {ESLVal l1 = $599;
            
            {ESLVal n = $598;
            
            {ESLVal t = $597;
            
            {ESLVal e = $596;
            
            {ESLVal ds = $591;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "CnstrBind": {ESLVal $595 = $590.termRef(0);
            ESLVal $594 = $590.termRef(1);
            ESLVal $593 = $590.termRef(2);
            ESLVal $592 = $590.termRef(3);
            
            {ESLVal l1 = $595;
            
            {ESLVal n = $594;
            
            {ESLVal t = $593;
            
            {ESLVal e = $592;
            
            {ESLVal ds = $591;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $590;
            
            {ESLVal ds = $591;
            
            return valueDefs.apply(ds).cons(b);
          }
          }
        }
        }
      else if(_v102.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(9964,10274)").add(ESLVal.list(_v102)));
      }
    }
  });
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v945 = $args[0];
  ESLVal _v944 = $args[1];
  ESLVal _v943 = $args[2];
  ESLVal _v942 = $args[3];
  ESLVal _v941 = $args[4];
  {ESLVal _v101 = _v945;
        
        if(_v101.isCons())
        {ESLVal $576 = _v101.head();
          ESLVal $577 = _v101.tail();
          
          switch($576.termName) {
          case "FunBind": {ESLVal $589 = $576.termRef(0);
            ESLVal $588 = $576.termRef(1);
            ESLVal $587 = $576.termRef(2);
            ESLVal $586 = $576.termRef(3);
            ESLVal $585 = $576.termRef(4);
            ESLVal $584 = $576.termRef(5);
            ESLVal $583 = $576.termRef(6);
            
            {ESLVal l = $589;
            
            {ESLVal n = $588;
            
            {ESLVal ps = $587;
            
            {ESLVal t = $586;
            
            {ESLVal st = $585;
            
            {ESLVal b = $584;
            
            {ESLVal g = $583;
            
            {ESLVal ds = $577;
            
            return valueDefsToTEnv.apply(ds,_v944,_v943,_v942,_v941).cons(new ESLVal("Map",n,substTypeEnv.apply(_v941,t)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "Binding": {ESLVal $582 = $576.termRef(0);
            ESLVal $581 = $576.termRef(1);
            ESLVal $580 = $576.termRef(2);
            ESLVal $579 = $576.termRef(3);
            ESLVal $578 = $576.termRef(4);
            
            {ESLVal l = $582;
            
            {ESLVal n = $581;
            
            {ESLVal t = $580;
            
            {ESLVal st = $579;
            
            {ESLVal e = $578;
            
            {ESLVal ds = $577;
            
            return valueDefsToTEnv.apply(ds,_v944,_v943,_v942,_v941).cons(new ESLVal("Map",n,substTypeEnv.apply(_v941,t)));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10381,11067)").add(ESLVal.list(_v101)));
        }
        }
      else if(_v101.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(10381,11067)").add(ESLVal.list(_v101)));
      }
    }
  });
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  {print.apply(new ESLVal("[ type check ").add(path.add(new ESLVal("]"))));
      return typeCheckModuleInternal.apply(path,emptyTable,new ESLVal(new Function(new ESLVal("fun603"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v940 = $args[0];
        ESLVal _v939 = $args[1];
        ESLVal _v938 = $args[2];
        ESLVal _v937 = $args[3];
        return $null;
          }
        }));}
    }
  });
  private static ESLVal typeCheckModuleInternal = new ESLVal(new Function(new ESLVal("typeCheckModuleInternal"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  if(hasEntry.apply(path,cache).boolVal)
        {ESLVal _v100 = lookup.apply(path,cache);
          
          switch(_v100.termName) {
          case "Typed": {ESLVal $575 = _v100.termRef(0);
            ESLVal $574 = _v100.termRef(1);
            ESLVal $573 = _v100.termRef(2);
            ESLVal $572 = _v100.termRef(3);
            
            {ESLVal m = $575;
            
            {ESLVal vEnv = $574;
            
            {ESLVal cEnv = $573;
            
            {ESLVal tEnv = $572;
            
            return handler.apply(cache,vEnv,cEnv,tEnv);
          }
          }
          }
          }
          }
        case "Undefined": {
            return error(new ESLVal("recursive reference to ").add(path));
          }
          default: return error(new ESLVal("case error at Pos(11536,11770)").add(ESLVal.list(_v100)));
        }
        }
        else
          {ESLVal m = parse.apply(path);
            
            return typeCheckModuleCache.apply(m,addEntry.apply(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun604"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v936 = $args[0];
            ESLVal _v935 = $args[1];
            ESLVal _v934 = $args[2];
            ESLVal _v933 = $args[3];
            return handler.apply(addEntry.apply(path,new ESLVal("Typed",m,_v935,_v934,_v933),_v936),_v935,_v934,_v933);
              }
            }));
          }
    }
  });
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  return typeCheckModuleCache.apply(module,emptyTable,new ESLVal(new Function(new ESLVal("fun605"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v932 = $args[0];
        ESLVal _v931 = $args[1];
        ESLVal _v930 = $args[2];
        ESLVal _v929 = $args[3];
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
  return typeCheckModule0.apply(module,cache,new ESLVal(new Function(new ESLVal("fun606"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v928 = $args[0];
        ESLVal _v927 = $args[1];
        ESLVal _v926 = $args[2];
        ESLVal _v925 = $args[3];
        {ESLVal _v99 = module;
              
              switch(_v99.termName) {
              case "Module": {ESLVal $571 = _v99.termRef(0);
                ESLVal $570 = _v99.termRef(1);
                ESLVal $569 = _v99.termRef(2);
                ESLVal $568 = _v99.termRef(3);
                ESLVal $567 = _v99.termRef(4);
                ESLVal $566 = _v99.termRef(5);
                ESLVal $565 = _v99.termRef(6);
                
                {ESLVal path = $571;
                
                {ESLVal name = $570;
                
                {ESLVal exports = $569;
                
                {ESLVal imports = $568;
                
                {ESLVal x = $567;
                
                {ESLVal y = $566;
                
                {ESLVal defs = $565;
                
                return handler.apply(_v928,restrictTypeEnv.apply(_v927,exports),restrictTypeEnv.apply(_v926,exports),restrictTypeEnv.apply(_v925,exports));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(12512,12770)").add(ESLVal.list(_v99)));
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
        ESLVal _v905 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v914 = $args[0];
          ESLVal _v913 = $args[1];
          ESLVal _v912 = $args[2];
          {ESLVal _v98 = _v914;
                
                if(_v98.isCons())
                {ESLVal $563 = _v98.head();
                  ESLVal $564 = _v98.tail();
                  
                  {ESLVal path = $563;
                  
                  {ESLVal _v915 = $564;
                  
                  {ESLVal _v916 = _v915;
                  
                  return typeCheckModuleInternal.apply(path,_v913,new ESLVal(new Function(new ESLVal("fun607"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v920 = $args[0];
                  ESLVal _v919 = $args[1];
                  ESLVal _v918 = $args[2];
                  ESLVal _v917 = $args[3];
                  return _v905.apply(_v916,_v920,new ESLVal(new Function(new ESLVal("fun608"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v924 = $args[0];
                        ESLVal _v923 = $args[1];
                        ESLVal _v922 = $args[2];
                        ESLVal _v921 = $args[3];
                        return _v912.apply(_v924,_v923.add(_v919),_v922.add(_v918),_v921.add(_v917));
                          }
                        }));
                    }
                  }));
                }
                }
                }
                }
              else if(_v98.isNil())
                return _v912.apply(_v913,$nil,$nil,$nil);
              else return error(new ESLVal("case error at Pos(13150,13707)").add(ESLVal.list(_v98)));
              }
            }
          });
        ESLVal _v904 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              {ESLVal _v97 = module;
                
                switch(_v97.termName) {
                case "Module": {ESLVal $562 = _v97.termRef(0);
                  ESLVal $561 = _v97.termRef(1);
                  ESLVal $560 = _v97.termRef(2);
                  ESLVal $559 = _v97.termRef(3);
                  ESLVal $558 = _v97.termRef(4);
                  ESLVal $557 = _v97.termRef(5);
                  ESLVal $556 = _v97.termRef(6);
                  
                  {ESLVal path = $562;
                  
                  {ESLVal name = $561;
                  
                  {ESLVal exports = $560;
                  
                  {ESLVal imports = $559;
                  
                  {ESLVal x = $558;
                  
                  {ESLVal y = $557;
                  
                  {ESLVal defs = $556;
                  
                  return _v905.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun609"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v909 = $args[0];
                  ESLVal _v908 = $args[1];
                  ESLVal _v907 = $args[2];
                  ESLVal _v906 = $args[3];
                  {ESLVal e = typeEnv.apply(defs);
                        
                        {checkDupBindings.apply(defs);
                      checkFreeTypes.apply(e.add(_v906.add(tenv0)));
                      checkSingletonTypes.apply(e);
                      {ESLVal _v910 = recTypes.apply(e.add(_v906.add(tenv0)));
                        
                        {ESLVal _v911 = cnstrEnv.apply(defs,_v910).add(_v907.add(cnstrEnv0));
                        
                        {checkSingletonConstructors.apply(_v911);
                      {ESLVal valueEnv = typeCheckValues.apply(valueDefs.apply(defs),new ESLVal("NullType",p0),_v908,_v910,_v911);
                        
                        return handler.apply(_v909,valueEnv,_v911,_v910);
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
                default: return error(new ESLVal("case error at Pos(13736,15226)").add(ESLVal.list(_v97)));
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "_v905": return _v905;
            
            case "_v904": return _v904;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal _v905 = letrec.get("_v905");
      
      ESLVal _v904 = letrec.get("_v904");
      
        return _v904.apply();
      
    }
  });
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v903 = $args[0];
  ESLVal _v902 = $args[1];
  ESLVal _v901 = $args[2];
  ESLVal _v900 = $args[3];
  ESLVal _v899 = $args[4];
  {ESLVal valueEnv = valueDefsToTEnv.apply(_v903,_v902,$nil,_v899,_v900).add(_v901.add(env0));
        
        {{
        ESLVal _v96 = _v903;
        while(_v96.isCons()) {
          ESLVal def = _v96.headVal;
          typeCheckDef.apply(def,_v902,valueEnv,valueEnv,_v899,_v900);
          _v96 = _v96.tailVal;}
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
          {ESLVal _v94 = $qualArg;
                
                {ESLVal p = _v94;
                
                return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v898 = $args[0];
                {ESLVal _v95 = _v898;
                      
                      {ESLVal n = _v95;
                      
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
      ESLVal _v887 = $args[0];
  ESLVal _v886 = $args[1];
  ESLVal _v885 = $args[2];
  ESLVal _v884 = $args[3];
  ESLVal _v883 = $args[4];
  ESLVal _v882 = $args[5];
  {ESLVal _v90 = _v887;
        
        switch(_v90.termName) {
        case "FunBind": {ESLVal $546 = _v90.termRef(0);
          ESLVal $545 = _v90.termRef(1);
          ESLVal $544 = _v90.termRef(2);
          ESLVal $543 = _v90.termRef(3);
          ESLVal $542 = _v90.termRef(4);
          ESLVal $541 = _v90.termRef(5);
          ESLVal $540 = _v90.termRef(6);
          
          {ESLVal l = $546;
          
          {ESLVal n = $545;
          
          {ESLVal ps = $544;
          
          {ESLVal t = $543;
          
          {ESLVal st = $542;
          
          {ESLVal b = $541;
          
          {ESLVal g = $540;
          
          {checkPatterns.apply(l,ps);
        {ESLVal argTypes = map.apply(new ESLVal(new Function(new ESLVal("fun610"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v92 = p;
                  
                  switch(_v92.termName) {
                  case "PVar": {ESLVal $552 = _v92.termRef(0);
                    ESLVal $551 = _v92.termRef(1);
                    ESLVal $550 = _v92.termRef(2);
                    
                    {ESLVal _v892 = $552;
                    
                    {ESLVal _v893 = $551;
                    
                    {ESLVal _v894 = $550;
                    
                    return substTypeEnv.apply(_v882,_v894);
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(16500,16566)").add(ESLVal.list(_v92)));
                }
                }
              }
            }),ps);
          ESLVal argNames = map.apply(new ESLVal(new Function(new ESLVal("fun611"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v91 = p;
                  
                  switch(_v91.termName) {
                  case "PVar": {ESLVal $549 = _v91.termRef(0);
                    ESLVal $548 = _v91.termRef(1);
                    ESLVal $547 = _v91.termRef(2);
                    
                    {ESLVal _v889 = $549;
                    
                    {ESLVal _v890 = $548;
                    
                    {ESLVal _v891 = $547;
                    
                    return _v890;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(16638,16682)").add(ESLVal.list(_v91)));
                }
                }
              }
            }),ps);
          
          {ESLVal bodyType = guardedExpType.apply(l,g,b,_v886,zipTypeEnv.apply(argNames,argTypes).add(_v885),_v883,_v882);
          
          {ESLVal fType = ((Supplier<ESLVal>)() -> { 
              {ESLVal _v93 = t;
                
                switch(_v93.termName) {
                case "ForallType": {ESLVal $555 = _v93.termRef(0);
                  ESLVal $554 = _v93.termRef(1);
                  ESLVal $553 = _v93.termRef(2);
                  
                  {ESLVal _v895 = $555;
                  
                  {ESLVal ns = $554;
                  
                  {ESLVal _v896 = $553;
                  
                  return genericize.apply(_v895,new ESLVal("FunType",_v895,argTypes,bodyType));
                }
                }
                }
                }
                default: {ESLVal _v897 = _v93;
                  
                  return new ESLVal("FunType",l,argTypes,bodyType);
                }
              }
              }
            }).get();
          ESLVal dType = substTypeEnv.apply(_v882,t);
          
          if(subType.apply(fType,dType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType.apply(fType,_v882).add(new ESLVal(" does not match declaration ").add(ppType.apply(dType,_v882))))))));
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
      case "Binding": {ESLVal $539 = _v90.termRef(0);
          ESLVal $538 = _v90.termRef(1);
          ESLVal $537 = _v90.termRef(2);
          ESLVal $536 = _v90.termRef(3);
          ESLVal $535 = _v90.termRef(4);
          
          {ESLVal l = $539;
          
          {ESLVal n = $538;
          
          {ESLVal dt = $537;
          
          {ESLVal st = $536;
          
          {ESLVal e = $535;
          
          {ESLVal valueType = expType.apply(e,_v886,_v885,_v883,_v882);
          
          {ESLVal valueFV = typeFV.apply(valueType);
          ESLVal declaredType = lookupType.apply(n,_v884);
          
          {ESLVal _v888 = ((Supplier<ESLVal>)() -> { 
              if(valueFV.eql($nil).boolVal)
                return valueType;
                else
                  return new ESLVal("ForallType",l,valueFV,valueType);
            }).get();
          
          if(subType.apply(_v888,declaredType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType.apply(_v888,_v882).add(new ESLVal(" does not match declared type = ").add(ppType.apply(declaredType,_v882))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(16316,18089)").add(ESLVal.list(_v90)));
      }
      }
    }
  });
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v881 = $args[0];
  ESLVal _v880 = $args[1];
  ESLVal _v879 = $args[2];
  ESLVal _v878 = $args[3];
  ESLVal _v877 = $args[4];
  ESLVal _v876 = $args[5];
  ESLVal _v875 = $args[6];
  {ESLVal bt = expType.apply(_v880,_v878,_v877,_v876,_v875);
        
        if(isBoolType.apply(bt).boolVal)
        return expType.apply(_v879,_v878,_v877,_v876,_v875);
        else
          return error(new ESLVal("TypeError",_v881,new ESLVal("guarded expression requires a boolean value: ").add(ppType.apply(bt,_v875))));
      }
    }
  });
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v859 = $args[0];
  ESLVal _v858 = $args[1];
  ESLVal _v857 = $args[2];
  ESLVal _v856 = $args[3];
  ESLVal _v855 = $args[4];
  {ESLVal _v88 = _v859;
        
        switch(_v88.termName) {
        case "ActExp": {ESLVal $534 = _v88.termRef(0);
          ESLVal $533 = _v88.termRef(1);
          ESLVal $532 = _v88.termRef(2);
          ESLVal $531 = _v88.termRef(3);
          ESLVal $530 = _v88.termRef(4);
          ESLVal $529 = _v88.termRef(5);
          ESLVal $528 = _v88.termRef(6);
          ESLVal $527 = _v88.termRef(7);
          
          {ESLVal l = $534;
          
          {ESLVal n = $533;
          
          {ESLVal args = $532;
          
          {ESLVal exports = $531;
          
          {ESLVal parent = $530;
          
          {ESLVal bindings = $529;
          
          {ESLVal init = $528;
          
          {ESLVal arms = $527;
          
          return actType.apply(l,n,args,parent,exports,bindings,init,arms,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Apply": {ESLVal $526 = _v88.termRef(0);
          ESLVal $525 = _v88.termRef(1);
          ESLVal $524 = _v88.termRef(2);
          
          {ESLVal l = $526;
          
          {ESLVal op = $525;
          
          {ESLVal args = $524;
          
          return applyType.apply(l,op,args,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $523 = _v88.termRef(0);
          ESLVal $522 = _v88.termRef(1);
          ESLVal $521 = _v88.termRef(2);
          
          {ESLVal l = $523;
          
          {ESLVal _v874 = $522;
          
          {ESLVal ts = $521;
          
          return applyTypeExp.apply(l,_v874,ts,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $520 = _v88.termRef(0);
          ESLVal $519 = _v88.termRef(1);
          ESLVal $518 = _v88.termRef(2);
          ESLVal $517 = _v88.termRef(3);
          
          {ESLVal l = $520;
          
          {ESLVal a = $519;
          
          {ESLVal i = $518;
          
          {ESLVal v = $517;
          
          return arrayUpdateType.apply(l,a,i,v,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $516 = _v88.termRef(0);
          ESLVal $515 = _v88.termRef(1);
          ESLVal $514 = _v88.termRef(2);
          
          {ESLVal l = $516;
          
          {ESLVal a = $515;
          
          {ESLVal i = $514;
          
          return arrayRefType.apply(l,a,i,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "Become": {ESLVal $513 = _v88.termRef(0);
          ESLVal $512 = _v88.termRef(1);
          
          {ESLVal l = $513;
          
          {ESLVal _v873 = $512;
          
          return becomeType.apply(l,_v873,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "BinExp": {ESLVal $511 = _v88.termRef(0);
          ESLVal $510 = _v88.termRef(1);
          ESLVal $509 = _v88.termRef(2);
          ESLVal $508 = _v88.termRef(3);
          
          {ESLVal l = $511;
          
          {ESLVal e1 = $510;
          
          {ESLVal op = $509;
          
          {ESLVal e2 = $508;
          
          return binExpType.apply(l,e1,op,e2,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "Block": {ESLVal $507 = _v88.termRef(0);
          ESLVal $506 = _v88.termRef(1);
          
          {ESLVal l = $507;
          
          {ESLVal es = $506;
          
          return blockType.apply(l,es,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "BoolExp": {ESLVal $505 = _v88.termRef(0);
          ESLVal $504 = _v88.termRef(1);
          
          {ESLVal l = $505;
          
          {ESLVal b = $504;
          
          return new ESLVal("BoolType",l);
        }
        }
        }
      case "Case": {ESLVal $503 = _v88.termRef(0);
          ESLVal $502 = _v88.termRef(1);
          ESLVal $501 = _v88.termRef(2);
          ESLVal $500 = _v88.termRef(3);
          
          {ESLVal l = $503;
          
          {ESLVal decs = $502;
          
          {ESLVal es = $501;
          
          {ESLVal arms = $500;
          
          return caseType.apply(l,es,arms,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "Cmp": {ESLVal $499 = _v88.termRef(0);
          ESLVal $498 = _v88.termRef(1);
          ESLVal $497 = _v88.termRef(2);
          
          {ESLVal l = $499;
          
          {ESLVal _v872 = $498;
          
          {ESLVal qs = $497;
          
          return cmpType.apply(l,_v872,qs,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "Grab": {ESLVal $496 = _v88.termRef(0);
          ESLVal $495 = _v88.termRef(1);
          ESLVal $494 = _v88.termRef(2);
          
          {ESLVal l = $496;
          
          {ESLVal refs = $495;
          
          {ESLVal _v871 = $494;
          
          return expType.apply(_v871,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "FloatExp": {ESLVal $493 = _v88.termRef(0);
          ESLVal $492 = _v88.termRef(1);
          
          {ESLVal l = $493;
          
          {ESLVal f = $492;
          
          return new ESLVal("FloatType",l);
        }
        }
        }
      case "Fold": {ESLVal $491 = _v88.termRef(0);
          ESLVal $490 = _v88.termRef(1);
          ESLVal $489 = _v88.termRef(2);
          
          {ESLVal l = $491;
          
          {ESLVal t = $490;
          
          {ESLVal _v870 = $489;
          
          return foldType.apply(l,t,_v870,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "For": {ESLVal $488 = _v88.termRef(0);
          ESLVal $487 = _v88.termRef(1);
          ESLVal $486 = _v88.termRef(2);
          ESLVal $485 = _v88.termRef(3);
          
          {ESLVal l = $488;
          
          {ESLVal p = $487;
          
          {ESLVal list = $486;
          
          {ESLVal _v869 = $485;
          
          return forType.apply(l,p,list,_v869,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $484 = _v88.termRef(0);
          ESLVal $483 = _v88.termRef(1);
          ESLVal $482 = _v88.termRef(2);
          ESLVal $481 = _v88.termRef(3);
          ESLVal $480 = _v88.termRef(4);
          
          {ESLVal l = $484;
          
          {ESLVal n = $483;
          
          {ESLVal args = $482;
          
          {ESLVal t = $481;
          
          {ESLVal _v868 = $480;
          
          return funType.apply(l,n,args,t,_v868,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $479 = _v88.termRef(0);
          ESLVal $478 = _v88.termRef(1);
          ESLVal $477 = _v88.termRef(2);
          ESLVal $476 = _v88.termRef(3);
          
          {ESLVal l = $479;
          
          {ESLVal e1 = $478;
          
          {ESLVal e2 = $477;
          
          {ESLVal e3 = $476;
          
          return ifType.apply(l,e1,e2,e3,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "IntExp": {ESLVal $475 = _v88.termRef(0);
          ESLVal $474 = _v88.termRef(1);
          
          {ESLVal l = $475;
          
          {ESLVal n = $474;
          
          return new ESLVal("IntType",l);
        }
        }
        }
      case "Let": {ESLVal $473 = _v88.termRef(0);
          ESLVal $472 = _v88.termRef(1);
          ESLVal $471 = _v88.termRef(2);
          
          {ESLVal l = $473;
          
          {ESLVal bs = $472;
          
          {ESLVal _v867 = $471;
          
          return letType.apply(l,bs,_v867,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "Letrec": {ESLVal $470 = _v88.termRef(0);
          ESLVal $469 = _v88.termRef(1);
          ESLVal $468 = _v88.termRef(2);
          
          {ESLVal l = $470;
          
          {ESLVal bs = $469;
          
          {ESLVal _v866 = $468;
          
          return letrecType.apply(l,bs,_v866,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "List": {ESLVal $467 = _v88.termRef(0);
          ESLVal $466 = _v88.termRef(1);
          
          {ESLVal l = $467;
          
          {ESLVal es = $466;
          
          return listType.apply(l,es,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "Now": {ESLVal $465 = _v88.termRef(0);
          
          {ESLVal l = $465;
          
          return new ESLVal("IntType",l);
        }
        }
      case "Probably": {ESLVal $464 = _v88.termRef(0);
          ESLVal $463 = _v88.termRef(1);
          ESLVal $462 = _v88.termRef(2);
          ESLVal $461 = _v88.termRef(3);
          ESLVal $460 = _v88.termRef(4);
          
          {ESLVal l = $464;
          
          {ESLVal p = $463;
          
          {ESLVal t = $462;
          
          {ESLVal e1 = $461;
          
          {ESLVal e2 = $460;
          
          return probablyType.apply(l,p,t,e1,e2,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
        }
      case "Record": {ESLVal $459 = _v88.termRef(0);
          ESLVal $458 = _v88.termRef(1);
          
          {ESLVal l = $459;
          
          {ESLVal fields = $458;
          
          return recordType.apply(l,fields,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "Ref": {ESLVal $457 = _v88.termRef(0);
          ESLVal $456 = _v88.termRef(1);
          ESLVal $455 = _v88.termRef(2);
          
          {ESLVal l = $457;
          
          {ESLVal _v865 = $456;
          
          {ESLVal n = $455;
          
          return refType.apply(l,_v865,n,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $454 = _v88.termRef(0);
          ESLVal $453 = _v88.termRef(1);
          
          {ESLVal l = $454;
          
          {ESLVal n = $453;
          
          return refType.apply(l,new ESLVal("Var",l,new ESLVal("$super")),n,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "Self": {ESLVal $452 = _v88.termRef(0);
          
          {ESLVal l = $452;
          
          return _v858;
        }
        }
      case "Send": {ESLVal $447 = _v88.termRef(0);
          ESLVal $446 = _v88.termRef(1);
          ESLVal $445 = _v88.termRef(2);
          
          switch($445.termName) {
          case "Term": {ESLVal $451 = $445.termRef(0);
            ESLVal $450 = $445.termRef(1);
            ESLVal $449 = $445.termRef(2);
            ESLVal $448 = $445.termRef(3);
            
            {ESLVal l = $447;
            
            {ESLVal target = $446;
            
            {ESLVal tl = $451;
            
            {ESLVal n = $450;
            
            {ESLVal ts = $449;
            
            {ESLVal args = $448;
            
            return sendType.apply(l,target,n,args,_v858,_v857,_v856,_v855);
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(18567,22271)").add(ESLVal.list(_v88)));
        }
        }
      case "SendTimeSuper": {ESLVal $444 = _v88.termRef(0);
          
          {ESLVal l = $444;
          
          return new ESLVal("VoidType",l);
        }
        }
      case "SendSuper": {ESLVal $443 = _v88.termRef(0);
          ESLVal $442 = _v88.termRef(1);
          
          {ESLVal l = $443;
          
          {ESLVal _v864 = $442;
          
          return new ESLVal("VoidType",l);
        }
        }
        }
      case "StrExp": {ESLVal $441 = _v88.termRef(0);
          ESLVal $440 = _v88.termRef(1);
          
          {ESLVal l = $441;
          
          {ESLVal s = $440;
          
          return new ESLVal("StrType",l);
        }
        }
        }
      case "Term": {ESLVal $439 = _v88.termRef(0);
          ESLVal $438 = _v88.termRef(1);
          ESLVal $437 = _v88.termRef(2);
          ESLVal $436 = _v88.termRef(3);
          
          {ESLVal l = $439;
          
          {ESLVal n = $438;
          
          {ESLVal ts = $437;
          
          {ESLVal es = $436;
          
          return termType.apply(l,n,ts,es,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $435 = _v88.termRef(0);
          ESLVal $434 = _v88.termRef(1);
          ESLVal $433 = _v88.termRef(2);
          
          {ESLVal l = $435;
          
          {ESLVal t = $434;
          
          {ESLVal _v863 = $433;
          
          return throwType.apply(l,t,_v863,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "Try": {ESLVal $432 = _v88.termRef(0);
          ESLVal $431 = _v88.termRef(1);
          ESLVal $430 = _v88.termRef(2);
          
          {ESLVal l = $432;
          
          {ESLVal _v862 = $431;
          
          {ESLVal arms = $430;
          
          return tryType.apply(l,_v862,arms,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "New": {ESLVal $429 = _v88.termRef(0);
          ESLVal $428 = _v88.termRef(1);
          ESLVal $427 = _v88.termRef(2);
          
          {ESLVal l = $429;
          
          {ESLVal b = $428;
          
          {ESLVal args = $427;
          
          return newType.apply(l,b,args,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "NewArray": {ESLVal $426 = _v88.termRef(0);
          ESLVal $425 = _v88.termRef(1);
          ESLVal $424 = _v88.termRef(2);
          
          {ESLVal l = $426;
          
          {ESLVal t = $425;
          
          {ESLVal i = $424;
          
          return newArrayType.apply(l,t,i,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "NewTable": {ESLVal $423 = _v88.termRef(0);
          ESLVal $422 = _v88.termRef(1);
          ESLVal $421 = _v88.termRef(2);
          
          {ESLVal l = $423;
          
          {ESLVal key = $422;
          
          {ESLVal value = $421;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(_v855,key),substTypeEnv.apply(_v855,value));
        }
        }
        }
        }
      case "NewJava": {ESLVal $420 = _v88.termRef(0);
          ESLVal $419 = _v88.termRef(1);
          ESLVal $418 = _v88.termRef(2);
          ESLVal $417 = _v88.termRef(3);
          
          {ESLVal l = $420;
          
          {ESLVal path = $419;
          
          {ESLVal t = $418;
          
          {ESLVal args = $417;
          
          {{
          ESLVal _v89 = args;
          while(_v89.isCons()) {
            ESLVal a = _v89.headVal;
            expType.apply(a,_v858,_v857,_v856,_v855);
            _v89 = _v89.tailVal;}
        }
        return substTypeEnv.apply(_v855,t);}
        }
        }
        }
        }
        }
      case "Not": {ESLVal $416 = _v88.termRef(0);
          ESLVal $415 = _v88.termRef(1);
          
          {ESLVal l = $416;
          
          {ESLVal _v861 = $415;
          
          return notType.apply(l,_v861,_v858,_v857,_v856,_v855);
        }
        }
        }
      case "NullExp": {ESLVal $414 = _v88.termRef(0);
          
          {ESLVal l = $414;
          
          return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
        }
        }
      case "Update": {ESLVal $413 = _v88.termRef(0);
          ESLVal $412 = _v88.termRef(1);
          ESLVal $411 = _v88.termRef(2);
          
          {ESLVal l = $413;
          
          {ESLVal n = $412;
          
          {ESLVal _v860 = $411;
          
          return updateType.apply(l,n,_v860,_v858,_v857,_v856,_v855);
        }
        }
        }
        }
      case "Var": {ESLVal $410 = _v88.termRef(0);
          ESLVal $409 = _v88.termRef(1);
          
          {ESLVal l = $410;
          
          {ESLVal n = $409;
          
          return varType.apply(l,n,_v857);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(18567,22271)").add(ESLVal.list(_v88)));
      }
      }
    }
  });
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v854 = $args[0];
  ESLVal _v853 = $args[1];
  ESLVal _v852 = $args[2];
  ESLVal _v851 = $args[3];
  ESLVal _v850 = $args[4];
  ESLVal _v849 = $args[5];
  ESLVal _v848 = $args[6];
  {ESLVal valType = expType.apply(_v852,_v851,_v850,_v849,_v848);
        
        return substTypeEnv.apply(_v848,_v853);
      }
    }
  });
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v847 = $args[0];
  ESLVal _v846 = $args[1];
  ESLVal _v845 = $args[2];
  ESLVal _v844 = $args[3];
  ESLVal _v843 = $args[4];
  ESLVal _v842 = $args[5];
  ESLVal _v841 = $args[6];
  {ESLVal eType = expType.apply(_v845,_v844,_v843,_v842,_v841);
        
        if(typeEqual.apply(substTypeEnv.apply(_v841,_v846),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",_v847,new ESLVal("fold type ").add(ppType.apply(_v846,_v841).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v841))))));
      }
    }
  });
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v840 = $args[0];
  ESLVal _v839 = $args[1];
  ESLVal _v838 = $args[2];
  ESLVal _v837 = $args[3];
  ESLVal _v836 = $args[4];
  ESLVal _v835 = $args[5];
  ESLVal _v834 = $args[6];
  ESLVal _v833 = $args[7];
  {ESLVal aType = expType.apply(_v839,_v836,_v835,_v834,_v833);
        ESLVal iType = expType.apply(_v838,_v836,_v835,_v834,_v833);
        ESLVal vType = expType.apply(_v837,_v836,_v835,_v834,_v833);
        
        {ESLVal _v87 = aType;
        
        switch(_v87.termName) {
        case "ArrayType": {ESLVal $408 = _v87.termRef(0);
          ESLVal $407 = _v87.termRef(1);
          
          {ESLVal al = $408;
          
          {ESLVal t = $407;
          
          if(isIntType.apply(iType).boolVal)
          if(typeEqual.apply(vType,t).boolVal)
            return aType;
            else
              return error(new ESLVal("TypeError",_v840,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
          else
            return error(new ESLVal("TypeError",_v840,new ESLVal("array index should be an integer ").add(_v838)));
        }
        }
        }
        default: {ESLVal t = _v87;
          
          return error(new ESLVal("TypeError",_v840,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v832 = $args[0];
  ESLVal _v831 = $args[1];
  ESLVal _v830 = $args[2];
  ESLVal _v829 = $args[3];
  ESLVal _v828 = $args[4];
  ESLVal _v827 = $args[5];
  ESLVal _v826 = $args[6];
  {ESLVal aType = expType.apply(_v831,_v829,_v828,_v827,_v826);
        ESLVal iType = expType.apply(_v830,_v829,_v828,_v827,_v826);
        
        {ESLVal _v86 = aType;
        
        switch(_v86.termName) {
        case "ArrayType": {ESLVal $406 = _v86.termRef(0);
          ESLVal $405 = _v86.termRef(1);
          
          {ESLVal al = $406;
          
          {ESLVal t = $405;
          
          if(isIntType.apply(iType).boolVal)
          return t;
          else
            return error(new ESLVal("TypeError",_v832,new ESLVal("array index should be an integer ").add(_v830)));
        }
        }
        }
        default: {ESLVal t = _v86;
          
          return error(new ESLVal("TypeError",_v832,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v825 = $args[0];
  ESLVal _v824 = $args[1];
  ESLVal _v823 = $args[2];
  ESLVal _v822 = $args[3];
  ESLVal _v821 = $args[4];
  ESLVal _v820 = $args[5];
  ESLVal _v819 = $args[6];
  {ESLVal i = expType.apply(_v823,_v822,_v821,_v820,_v819);
        
        if(isIntType.apply(i).boolVal)
        return new ESLVal("ArrayType",_v825,substTypeEnv.apply(_v819,_v824));
        else
          return error(new ESLVal("TypeError",_v825,new ESLVal("expecting an integer type: ").add(i)));
      }
    }
  });
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v818 = $args[0];
  ESLVal _v817 = $args[1];
  ESLVal _v816 = $args[2];
  ESLVal _v815 = $args[3];
  ESLVal _v814 = $args[4];
  ESLVal _v813 = $args[5];
  {ESLVal bType = expType.apply(_v817,_v816,_v815,_v814,_v813);
        
        if(typeEqual.apply(bType,_v816).boolVal)
        return bType;
        else
          return error(new ESLVal("TypeError",_v818,new ESLVal("expecting become to match self type: ").add(ppType.apply(bType,_v813).add(new ESLVal(" ").add(ppType.apply(_v816,_v813))))));
      }
    }
  });
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v809 = $args[0];
  ESLVal _v808 = $args[1];
  ESLVal _v807 = $args[2];
  ESLVal _v806 = $args[3];
  ESLVal _v805 = $args[4];
  ESLVal _v804 = $args[5];
  ESLVal _v803 = $args[6];
  ESLVal _v802 = $args[7];
  ESLVal _v801 = $args[8];
  {ESLVal pt = expType.apply(_v808,_v804,_v803,_v802,_v801);
        
        if(isIntType.apply(pt).boolVal)
        {ESLVal _v812 = substTypeEnv.apply(_v801,_v807);
          ESLVal _v811 = expType.apply(_v806,_v804,_v803,_v802,_v801);
          ESLVal _v810 = expType.apply(_v805,_v804,_v803,_v802,_v801);
          
          if(typeEqual.apply(_v812,_v811).and(typeEqual.apply(_v812,_v810)).boolVal)
          return _v812;
          else
            return error(new ESLVal("TypeError",_v809,new ESLVal("expecting probably arm types to agree: ").add(ppType.apply(_v811,_v801).add(new ESLVal(" ").add(ppType.apply(_v812,_v801).add(new ESLVal(" ").add(ppType.apply(_v810,_v801))))))));
        }
        else
          return error(new ESLVal("TypeError",_v809,new ESLVal("expecting an integer: ").add(ppType.apply(pt,_v801))));
      }
    }
  });
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v800 = $args[0];
  ESLVal _v799 = $args[1];
  ESLVal _v798 = $args[2];
  ESLVal _v797 = $args[3];
  ESLVal _v796 = $args[4];
  ESLVal _v795 = $args[5];
  ESLVal _v794 = $args[6];
  return expType.apply(new ESLVal("Apply",_v800,_v799,_v798),_v797,_v796,_v795,_v794);
    }
  });
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v783 = $args[0];
  ESLVal _v782 = $args[1];
  ESLVal _v781 = $args[2];
  ESLVal _v780 = $args[3];
  ESLVal _v779 = $args[4];
  ESLVal _v778 = $args[5];
  ESLVal _v777 = $args[6];
  ESLVal _v776 = $args[7];
  {ESLVal _v83 = typeNF.apply(derefType.apply(expType.apply(_v782,_v779,_v778,_v777,_v776)),_v776);
        
        switch(_v83.termName) {
        case "ActType": {ESLVal $384 = _v83.termRef(0);
          ESLVal $383 = _v83.termRef(1);
          ESLVal $382 = _v83.termRef(2);
          
          {ESLVal al = $384;
          
          {ESLVal exports = $383;
          
          {ESLVal handlers = $382;
          
          LetRec letrec = new LetRec() {
          ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v784 = $args[0];
            {ESLVal _v84 = _v784;
                  
                  if(_v84.isCons())
                  {ESLVal $385 = _v84.head();
                    ESLVal $386 = _v84.tail();
                    
                    switch($385.termName) {
                    case "MessageType": {ESLVal $388 = $385.termRef(0);
                      ESLVal $387 = $385.termRef(1);
                      
                      if($387.isCons())
                      {ESLVal $389 = $387.head();
                        ESLVal $390 = $387.tail();
                        
                        switch($389.termName) {
                        case "TermType": {ESLVal $393 = $389.termRef(0);
                          ESLVal $392 = $389.termRef(1);
                          ESLVal $391 = $389.termRef(2);
                          
                          if($390.isCons())
                          {ESLVal $394 = $390.head();
                            ESLVal $395 = $390.tail();
                            
                            {ESLVal m = $385;
                            
                            {ESLVal _v785 = $386;
                            
                            return findHandler.apply(_v785);
                          }
                          }
                          }
                        else if($390.isNil())
                          {ESLVal ml = $388;
                            
                            {ESLVal tl = $393;
                            
                            {ESLVal m = $392;
                            
                            {ESLVal ts = $391;
                            
                            {ESLVal rest = $386;
                            
                            if(m.eql(_v781).boolVal)
                            return head.apply(_v784);
                            else
                              {ESLVal _v786 = $385;
                                
                                {ESLVal _v787 = $386;
                                
                                return findHandler.apply(_v787);
                              }
                              }
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal m = $385;
                            
                            {ESLVal _v788 = $386;
                            
                            return findHandler.apply(_v788);
                          }
                          }
                        }
                        default: {ESLVal m = $385;
                          
                          {ESLVal _v789 = $386;
                          
                          return findHandler.apply(_v789);
                        }
                        }
                      }
                      }
                    else if($387.isNil())
                      {ESLVal m = $385;
                        
                        {ESLVal _v790 = $386;
                        
                        return findHandler.apply(_v790);
                      }
                      }
                    else {ESLVal m = $385;
                        
                        {ESLVal _v791 = $386;
                        
                        return findHandler.apply(_v791);
                      }
                      }
                    }
                    default: {ESLVal m = $385;
                      
                      {ESLVal _v792 = $386;
                      
                      return findHandler.apply(_v792);
                    }
                    }
                  }
                  }
                else if(_v84.isNil())
                  return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781)));
                else return error(new ESLVal("case error at Pos(25876,26183)").add(ESLVal.list(_v84)));
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
        
          {ESLVal _v85 = findHandler.apply(handlers);
          
          switch(_v85.termName) {
          case "MessageType": {ESLVal $397 = _v85.termRef(0);
            ESLVal $396 = _v85.termRef(1);
            
            if($396.isCons())
            {ESLVal $398 = $396.head();
              ESLVal $399 = $396.tail();
              
              switch($398.termName) {
              case "TermType": {ESLVal $402 = $398.termRef(0);
                ESLVal $401 = $398.termRef(1);
                ESLVal $400 = $398.termRef(2);
                
                if($399.isCons())
                {ESLVal $403 = $399.head();
                  ESLVal $404 = $399.tail();
                  
                  {ESLVal m = _v85;
                  
                  return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
                }
                }
              else if($399.isNil())
                {ESLVal ml = $397;
                  
                  {ESLVal tl = $402;
                  
                  {ESLVal _v793 = $401;
                  
                  {ESLVal ts1 = $400;
                  
                  {ESLVal ts2 = expTypes.apply(_v780,_v779,_v778,_v777,_v776);
                  
                  if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                  if(subTypes.apply(ts2,ts1).boolVal)
                    {expType.apply(_v782,_v779,_v778,_v777,_v776);
                    return new ESLVal("VoidType",_v783);}
                    else
                      return error(new ESLVal("TypeError",_v783,new ESLVal("message argument types ").add(ppTypes.apply(ts2,_v776).add(new ESLVal(" do not match expected types ").add(ppTypes.apply(ts1,_v776))))));
                  else
                    return error(new ESLVal("TypeError",_v783,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
                }
                }
                }
                }
                }
              else {ESLVal m = _v85;
                  
                  return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
                }
              }
              default: {ESLVal m = _v85;
                
                return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            }
          else if($396.isNil())
            {ESLVal m = _v85;
              
              return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
            }
          else {ESLVal m = _v85;
              
              return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          default: {ESLVal m = _v85;
            
            return error(new ESLVal("TypeError",_v783,new ESLVal("cannot find message handler named ").add(_v781.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        }
        
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(25661,27009)").add(ESLVal.list(_v83)));
      }
      }
    }
  });
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v733 = $args[0];
  ESLVal _v732 = $args[1];
  ESLVal _v731 = $args[2];
  ESLVal _v730 = $args[3];
  ESLVal _v729 = $args[4];
  ESLVal _v728 = $args[5];
  ESLVal _v727 = $args[6];
  ESLVal _v726 = $args[7];
  ESLVal _v725 = $args[8];
  ESLVal _v724 = $args[9];
  ESLVal _v723 = $args[10];
  ESLVal _v722 = $args[11];
  LetRec letrec = new LetRec() {
        ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v766 = $args[0];
          ESLVal _v765 = $args[1];
          {ESLVal _v82 = _v765;
                
                if(_v82.isCons())
                {ESLVal $368 = _v82.head();
                  ESLVal $369 = _v82.tail();
                  
                  switch($368.termName) {
                  case "Binding": {ESLVal $381 = $368.termRef(0);
                    ESLVal $380 = $368.termRef(1);
                    ESLVal $379 = $368.termRef(2);
                    ESLVal $378 = $368.termRef(3);
                    ESLVal $377 = $368.termRef(4);
                    
                    {ESLVal _v770 = $381;
                    
                    {ESLVal m = $380;
                    
                    {ESLVal t = $379;
                    
                    {ESLVal st = $378;
                    
                    {ESLVal e = $377;
                    
                    {ESLVal _v771 = $369;
                    
                    if(m.eql(_v766).boolVal)
                    return _v770;
                    else
                      {ESLVal b = $368;
                        
                        {ESLVal _v772 = $369;
                        
                        return findLoc.apply(_v766,_v772);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $376 = $368.termRef(0);
                    ESLVal $375 = $368.termRef(1);
                    ESLVal $374 = $368.termRef(2);
                    ESLVal $373 = $368.termRef(3);
                    ESLVal $372 = $368.termRef(4);
                    ESLVal $371 = $368.termRef(5);
                    ESLVal $370 = $368.termRef(6);
                    
                    {ESLVal _v767 = $376;
                    
                    {ESLVal m = $375;
                    
                    {ESLVal ps = $374;
                    
                    {ESLVal t = $373;
                    
                    {ESLVal st = $372;
                    
                    {ESLVal g = $371;
                    
                    {ESLVal e = $370;
                    
                    {ESLVal _v768 = $369;
                    
                    if(m.eql(_v766).boolVal)
                    return _v767;
                    else
                      {ESLVal b = $368;
                        
                        {ESLVal _v769 = $369;
                        
                        return findLoc.apply(_v766,_v769);
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
                  default: {ESLVal b = $368;
                    
                    {ESLVal _v773 = $369;
                    
                    return findLoc.apply(_v766,_v773);
                  }
                  }
                }
                }
              else if(_v82.isNil())
                return p0;
              else return error(new ESLVal("case error at Pos(27519,27823)").add(ESLVal.list(_v82)));
              }
            }
          });
        ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v757 = $args[0];
          ESLVal _v756 = $args[1];
          {ESLVal _v81 = _v756;
                
                if(_v81.isCons())
                {ESLVal $354 = _v81.head();
                  ESLVal $355 = _v81.tail();
                  
                  switch($354.termName) {
                  case "Binding": {ESLVal $367 = $354.termRef(0);
                    ESLVal $366 = $354.termRef(1);
                    ESLVal $365 = $354.termRef(2);
                    ESLVal $364 = $354.termRef(3);
                    ESLVal $363 = $354.termRef(4);
                    
                    {ESLVal _v761 = $367;
                    
                    {ESLVal m = $366;
                    
                    {ESLVal t = $365;
                    
                    {ESLVal st = $364;
                    
                    {ESLVal e = $363;
                    
                    {ESLVal _v762 = $355;
                    
                    if(m.eql(_v757).boolVal)
                    return substTypeEnv.apply(_v722,t);
                    else
                      {ESLVal b = $354;
                        
                        {ESLVal _v763 = $355;
                        
                        return findType.apply(_v757,_v763);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $362 = $354.termRef(0);
                    ESLVal $361 = $354.termRef(1);
                    ESLVal $360 = $354.termRef(2);
                    ESLVal $359 = $354.termRef(3);
                    ESLVal $358 = $354.termRef(4);
                    ESLVal $357 = $354.termRef(5);
                    ESLVal $356 = $354.termRef(6);
                    
                    {ESLVal _v758 = $362;
                    
                    {ESLVal m = $361;
                    
                    {ESLVal ps = $360;
                    
                    {ESLVal t = $359;
                    
                    {ESLVal st = $358;
                    
                    {ESLVal g = $357;
                    
                    {ESLVal e = $356;
                    
                    {ESLVal _v759 = $355;
                    
                    if(m.eql(_v757).boolVal)
                    return substTypeEnv.apply(_v722,t);
                    else
                      {ESLVal b = $354;
                        
                        {ESLVal _v760 = $355;
                        
                        return findType.apply(_v757,_v760);
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
                  default: {ESLVal b = $354;
                    
                    {ESLVal _v764 = $355;
                    
                    return findType.apply(_v757,_v764);
                  }
                  }
                }
                }
              else if(_v81.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(27877,28234)").add(ESLVal.list(_v81)));
              }
            }
          });
        ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v752 = $args[0];
          {ESLVal _v80 = _v752;
                
                if(_v80.isCons())
                {ESLVal $352 = _v80.head();
                  ESLVal $353 = _v80.tail();
                  
                  {ESLVal m = $352;
                  
                  {ESLVal _v753 = $353;
                  
                  {ESLVal _v755 = findType.apply(m,_v728);
                  ESLVal _v754 = findLoc.apply(m,_v728);
                  
                  if(_v755.eql($null).boolVal)
                  return error(new ESLVal("TypeError",_v754,new ESLVal("cannot find exported name ").add(m)));
                  else
                    return decs.apply(_v753).cons(new ESLVal("Dec",_v754,m,_v755,_v755));
                }
                }
                }
                }
              else if(_v80.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(28276,28607)").add(ESLVal.list(_v80)));
              }
            }
          });
        ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v749 = $args[0];
          {ESLVal _v79 = _v749;
                
                if(_v79.isCons())
                {ESLVal $346 = _v79.head();
                  ESLVal $347 = _v79.tail();
                  
                  switch($346.termName) {
                  case "BArm": {ESLVal $351 = $346.termRef(0);
                    ESLVal $350 = $346.termRef(1);
                    ESLVal $349 = $346.termRef(2);
                    ESLVal $348 = $346.termRef(3);
                    
                    {ESLVal _v750 = $351;
                    
                    {ESLVal ps = $350;
                    
                    {ESLVal g = $349;
                    
                    {ESLVal e = $348;
                    
                    {ESLVal _v751 = $347;
                    
                    return getMessageTypes.apply(_v751).cons(getMessageType.apply(ps));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(28658,28813)").add(ESLVal.list(_v79)));
                }
                }
              else if(_v79.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(28658,28813)").add(ESLVal.list(_v79)));
              }
            }
          });
        ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ps = $args[0];
          {ESLVal _v78 = ps;
                
                if(_v78.isCons())
                {ESLVal $338 = _v78.head();
                  ESLVal $339 = _v78.tail();
                  
                  switch($338.termName) {
                  case "PTerm": {ESLVal $343 = $338.termRef(0);
                    ESLVal $342 = $338.termRef(1);
                    ESLVal $341 = $338.termRef(2);
                    ESLVal $340 = $338.termRef(3);
                    
                    if($339.isCons())
                    {ESLVal $344 = $339.head();
                      ESLVal $345 = $339.tail();
                      
                      return error(new ESLVal("case error at Pos(28863,29134)").add(ESLVal.list(_v78)));
                    }
                  else if($339.isNil())
                    {ESLVal pl = $343;
                      
                      {ESLVal termName = $342;
                      
                      {ESLVal targs = $341;
                      
                      {ESLVal _v748 = $340;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun612"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v733,p,_v725,_v724,_v723,_v722);
                          }
                        }),_v748);
                      
                      return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(28863,29134)").add(ESLVal.list(_v78)));
                  }
                  default: return error(new ESLVal("case error at Pos(28863,29134)").add(ESLVal.list(_v78)));
                }
                }
              else if(_v78.isNil())
                return error(new ESLVal("case error at Pos(28863,29134)").add(ESLVal.list(_v78)));
              else return error(new ESLVal("case error at Pos(28863,29134)").add(ESLVal.list(_v78)));
              }
            }
          });
        ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v745 = $args[0];
          ESLVal _v744 = $args[1];
          ESLVal _v743 = $args[2];
          {ESLVal _v77 = _v745;
                
                if(_v77.isCons())
                {ESLVal $332 = _v77.head();
                  ESLVal $333 = _v77.tail();
                  
                  switch($332.termName) {
                  case "BArm": {ESLVal $337 = $332.termRef(0);
                    ESLVal $336 = $332.termRef(1);
                    ESLVal $335 = $332.termRef(2);
                    ESLVal $334 = $332.termRef(3);
                    
                    {ESLVal _v746 = $337;
                    
                    {ESLVal ps = $336;
                    
                    {ESLVal g = $335;
                    
                    {ESLVal e = $334;
                    
                    {ESLVal _v747 = $333;
                    
                    {typeCheckArm.apply(_v746,ps,g,e,_v744,_v743);
                  return typeCheckArms.apply(_v747,_v744,_v743);}
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(29210,29437)").add(ESLVal.list(_v77)));
                }
                }
              else if(_v77.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(29210,29437)").add(ESLVal.list(_v77)));
              }
            }
          });
        ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v739 = $args[0];
          ESLVal _v738 = $args[1];
          ESLVal _v737 = $args[2];
          ESLVal _v736 = $args[3];
          ESLVal _v735 = $args[4];
          ESLVal _v734 = $args[5];
          {ESLVal _v76 = _v738;
                
                if(_v76.isCons())
                {ESLVal $324 = _v76.head();
                  ESLVal $325 = _v76.tail();
                  
                  switch($324.termName) {
                  case "PTerm": {ESLVal $329 = $324.termRef(0);
                    ESLVal $328 = $324.termRef(1);
                    ESLVal $327 = $324.termRef(2);
                    ESLVal $326 = $324.termRef(3);
                    
                    if($325.isCons())
                    {ESLVal $330 = $325.head();
                      ESLVal $331 = $325.tail();
                      
                      return error(new ESLVal("case error at Pos(29536,29985)").add(ESLVal.list(_v76)));
                    }
                  else if($325.isNil())
                    {ESLVal pl = $329;
                      
                      {ESLVal termName = $328;
                      
                      {ESLVal targs = $327;
                      
                      {ESLVal _v740 = $326;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun613"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v739,p,_v735,_v734,_v723,_v722);
                          }
                        }),_v740);
                      
                      {patternTypes.apply(_v739,_v740,ts,_v735,_v734,_v723,_v722,new ESLVal(new Function(new ESLVal("fun614"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v742 = $args[0];
                    ESLVal _v741 = $args[1];
                    return expType.apply(_v736,_v735,_v741,_v723,_v722);
                      }
                    }));
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(29536,29985)").add(ESLVal.list(_v76)));
                  }
                  default: return error(new ESLVal("case error at Pos(29536,29985)").add(ESLVal.list(_v76)));
                }
                }
              else if(_v76.isNil())
                return error(new ESLVal("case error at Pos(29536,29985)").add(ESLVal.list(_v76)));
              else return error(new ESLVal("case error at Pos(29536,29985)").add(ESLVal.list(_v76)));
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
      
        {ESLVal parentType = ((Supplier<ESLVal>)() -> { 
            if(_v730.eql($null).boolVal)
              return actType0;
              else
                return expType.apply(_v730,_v725,_v724,_v723,_v722);
          }).get();
        ESLVal localEnv = parBind.apply(_v728,_v725,_v724,_v723,_v722);
        
        {ESLVal exportedDecs = decs.apply(_v729);
        
        {ESLVal messageTypes = getMessageTypes.apply(_v726);
        
        {ESLVal _v775 = new ESLVal("ExtendedAct",_v733,parentType,exportedDecs,messageTypes);
        ESLVal _v774 = ESLVal.list(new ESLVal("Map",new ESLVal("$super"),parentType));
        
        {typeCheckExports.apply(_v733,exportedDecs,_v728,_v775,localEnv.add(_v724),_v722,_v723);
      typeCheckValues.apply(valueDefs.apply(_v728),_v775,_v774.add(localEnv.add(_v724)),_v722,_v723);
      expType.apply(_v727,_v775,_v774.add(localEnv.add(_v724)),_v723,_v722);
      typeCheckArms.apply(_v726,_v775,_v774.add(localEnv.add(_v724)));
      return _v775;}
      }
      }
      }
      }
      
    }
  });
  private static ESLVal typeCheckExports = new ESLVal(new Function(new ESLVal("typeCheckExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v721 = $args[0];
  ESLVal _v720 = $args[1];
  ESLVal _v719 = $args[2];
  ESLVal _v718 = $args[3];
  ESLVal _v717 = $args[4];
  ESLVal _v716 = $args[5];
  ESLVal _v715 = $args[6];
  {{
        ESLVal _v75 = _v720;
        while(_v75.isCons()) {
          ESLVal e = _v75.headVal;
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun615"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal b = $args[0];
          return bindingName.apply(b).eql(decName.apply(e)).and(typeEqual.apply(lookupType.apply(decName.apply(e),_v717),decType.apply(e)));
            }
          }),_v719).boolVal)
            {}
            else
              error(new ESLVal("TypeError",_v721,new ESLVal(" cannot find export for ").add(decName.apply(e))));
          _v75 = _v75.tailVal;}
      }
      return $null;}
    }
  });
  private static ESLVal bTypeExports = new ESLVal(new Function(new ESLVal("bTypeExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v74 = t;
        
        switch(_v74.termName) {
        case "ExtendedAct": {ESLVal $323 = _v74.termRef(0);
          ESLVal $322 = _v74.termRef(1);
          ESLVal $321 = _v74.termRef(2);
          ESLVal $320 = _v74.termRef(3);
          
          {ESLVal l = $323;
          
          {ESLVal parent = $322;
          
          {ESLVal exports = $321;
          
          {ESLVal message = $320;
          
          return bTypeExports.apply(parent).add(exports);
        }
        }
        }
        }
        }
      case "ActType": {ESLVal $319 = _v74.termRef(0);
          ESLVal $318 = _v74.termRef(1);
          ESLVal $317 = _v74.termRef(2);
          
          {ESLVal l = $319;
          
          {ESLVal exports = $318;
          
          {ESLVal message = $317;
          
          return exports;
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $316 = _v74.termRef(0);
          
          {ESLVal f = $316;
          
          return bTypeExports.apply(f.apply());
        }
        }
      case "RecType": {ESLVal $315 = _v74.termRef(0);
          ESLVal $314 = _v74.termRef(1);
          ESLVal $313 = _v74.termRef(2);
          
          {ESLVal l = $315;
          
          {ESLVal n = $314;
          
          {ESLVal _v714 = $313;
          
          return bTypeExports.apply(substType.apply(new ESLVal("RecType",l,n,_v714),n,_v714));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(31381,31791)").add(ESLVal.list(_v74)));
      }
      }
    }
  });
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v706 = $args[0];
  ESLVal _v705 = $args[1];
  ESLVal _v704 = $args[2];
  ESLVal _v703 = $args[3];
  ESLVal _v702 = $args[4];
  ESLVal _v701 = $args[5];
  ESLVal _v700 = $args[6];
  {ESLVal _v72 = _v704;
        
        if(_v72.isCons())
        {ESLVal $304 = _v72.head();
          ESLVal $305 = _v72.tail();
          
          switch($304.termName) {
          case "BQual": {ESLVal $310 = $304.termRef(0);
            ESLVal $309 = $304.termRef(1);
            ESLVal $308 = $304.termRef(2);
            
            {ESLVal _v709 = $310;
            
            {ESLVal p = $309;
            
            {ESLVal list = $308;
            
            {ESLVal _v710 = $305;
            
            {ESLVal lType = expType.apply(list,_v703,_v702,_v701,_v700);
            
            {ESLVal _v73 = lType;
            
            switch(_v73.termName) {
            case "ListType": {ESLVal $312 = _v73.termRef(0);
              ESLVal $311 = _v73.termRef(1);
              
              {ESLVal ll = $312;
              
              {ESLVal t = $311;
              
              {ESLVal _v711 = _v710;
              
              return patternType.apply(_v709,p,substTypeEnv.apply(_v700,t),_v703,_v702,_v701,_v700,new ESLVal(new Function(new ESLVal("fun616"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v713 = $args[0];
              ESLVal _v712 = $args[1];
              return cmpType.apply(_v709,_v705,_v711,_v703,_v712,_v701,_v700);
                }
              }));
            }
            }
            }
            }
            default: {ESLVal t = _v73;
              
              return error(new ESLVal("TypeError",_v709,new ESLVal("qualifier binding expects a list: ").add(ppType.apply(t,_v700))));
            }
          }
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $307 = $304.termRef(0);
            ESLVal $306 = $304.termRef(1);
            
            {ESLVal _v707 = $307;
            
            {ESLVal b = $306;
            
            {ESLVal _v708 = $305;
            
            {ESLVal bType = expType.apply(b,_v703,_v702,_v701,_v700);
            
            if(isBoolType.apply(bType).boolVal)
            return cmpType.apply(_v707,_v705,_v708,_v703,_v702,_v701,_v700);
            else
              return error(new ESLVal("TypeError",_v707,new ESLVal("qualifier expects a boolean type: ").add(ppType.apply(bType,_v700))));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(31902,32888)").add(ESLVal.list(_v72)));
        }
        }
      else if(_v72.isNil())
        {ESLVal t = expType.apply(_v705,_v703,_v702,_v701,_v700);
          
          return new ESLVal("ListType",_v706,t);
        }
      else return error(new ESLVal("case error at Pos(31902,32888)").add(ESLVal.list(_v72)));
      }
    }
  });
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v699 = $args[0];
  ESLVal _v698 = $args[1];
  ESLVal _v697 = $args[2];
  ESLVal _v696 = $args[3];
  ESLVal _v695 = $args[4];
  ESLVal _v694 = $args[5];
  ESLVal _v693 = $args[6];
  {ESLVal t = lookupType.apply(_v698,_v695);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v699,new ESLVal("unbound variable ").add(_v698)));
        else
          {ESLVal valueType = expType.apply(_v697,_v696,_v695,_v694,_v693);
            
            if(typeEqual.apply(valueType,t).boolVal)
            return valueType;
            else
              return error(new ESLVal("TypeError",_v699,new ESLVal("type of variable ").add(_v698.add(new ESLVal("::").add(ppType.apply(t,_v693).add(new ESLVal(" does not agree with value type ").add(ppType.apply(valueType,_v693))))))));
          }
      }
    }
  });
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v692 = $args[0];
  ESLVal _v691 = $args[1];
  ESLVal _v690 = $args[2];
  ESLVal _v689 = $args[3];
  ESLVal _v688 = $args[4];
  ESLVal _v687 = $args[5];
  ESLVal _v686 = $args[6];
  {ESLVal env = parBind.apply(_v691,_v689,_v688,_v687,_v686);
        
        {{
        ESLVal _v71 = _v691;
        while(_v71.isCons()) {
          ESLVal b = _v71.headVal;
          typeCheckDef.apply(b,_v689,_v688,env.add(_v688),_v687,_v686);
          _v71 = _v71.tailVal;}
      }
      return expType.apply(_v690,_v689,env.add(_v688),_v687,_v686);}
      }
    }
  });
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v685 = $args[0];
  ESLVal _v684 = $args[1];
  ESLVal _v683 = $args[2];
  ESLVal _v682 = $args[3];
  ESLVal _v681 = $args[4];
  ESLVal _v680 = $args[5];
  ESLVal _v679 = $args[6];
  {ESLVal env = recBind.apply(_v684,_v682,_v681,_v680,_v679);
        
        {{
        ESLVal _v70 = _v684;
        while(_v70.isCons()) {
          ESLVal b = _v70.headVal;
          typeCheckDef.apply(b,_v682,env.add(_v681),env.add(_v681),_v680,_v679);
          _v70 = _v70.tailVal;}
      }
      return expType.apply(_v683,_v682,env.add(_v681),_v680,_v679);}
      }
    }
  });
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal bs = $args[0];
  {ESLVal _v68 = bs;
        
        if(_v68.isCons())
        {ESLVal $302 = _v68.head();
          ESLVal $303 = _v68.tail();
          
          {ESLVal b = $302;
          
          {ESLVal _v677 = $303;
          
          if(member.apply(bindingName.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v69 = $qualArg;
              
              {ESLVal _v678 = _v69;
              
              return ESLVal.list(ESLVal.list(bindingName.apply(_v678)));
            }
            }
          }
        }).map(_v677).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",bindingLoc.apply(b),new ESLVal("duplicate definitions for ").add(bindingName.apply(b))));
          else
            return checkDupBindings.apply(_v677);
        }
        }
        }
      else if(_v68.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(34136,34401)").add(ESLVal.list(_v68)));
      }
    }
  });
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v676 = $args[0];
  ESLVal _v675 = $args[1];
  ESLVal _v674 = $args[2];
  ESLVal _v673 = $args[3];
  ESLVal _v672 = $args[4];
  {checkDupBindings.apply(_v676);
      return valueDefsToTEnv.apply(valueDefs.apply(_v676),_v675,_v674,_v673,_v672);}
    }
  });
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v671 = $args[0];
  ESLVal _v670 = $args[1];
  ESLVal _v669 = $args[2];
  ESLVal _v668 = $args[3];
  ESLVal _v667 = $args[4];
  return valueDefsToTEnv.apply(valueDefs.apply(_v671),_v670,_v669,_v668,_v667);
    }
  });
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v666 = $args[0];
  ESLVal _v665 = $args[1];
  ESLVal _v664 = $args[2];
  ESLVal _v663 = $args[3];
  ESLVal _v662 = $args[4];
  ESLVal _v661 = $args[5];
  ESLVal _v660 = $args[6];
  {ESLVal ts1 = expTypes.apply(_v665,_v663,_v662,_v661,_v660);
        
        {ESLVal ts2 = armTypes.apply(_v664,ts1,_v663,_v662,_v661,_v660);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v666,new ESLVal("case arm types do not agree: ").add(ppTypes.apply(ts1,_v660).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v660))))));
      }
      }
    }
  });
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v659 = $args[0];
  ESLVal _v658 = $args[1];
  ESLVal _v657 = $args[2];
  ESLVal _v656 = $args[3];
  ESLVal _v655 = $args[4];
  ESLVal _v654 = $args[5];
  ESLVal _v653 = $args[6];
  {ESLVal ts1 = expTypes.apply(ESLVal.list(_v658),_v656,_v655,_v654,_v653);
        
        {ESLVal ts2 = armTypes.apply(_v657,ts1,_v656,_v655,_v654,_v653);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v659,new ESLVal("try arm types do not agree: ").add(ppTypes.apply(ts1,_v653).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v653))))));
      }
      }
    }
  });
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v651 = $args[0];
  ESLVal _v650 = $args[1];
  ESLVal _v649 = $args[2];
  ESLVal _v648 = $args[3];
  ESLVal _v647 = $args[4];
  ESLVal _v646 = $args[5];
  {ESLVal _v67 = _v651;
        
        if(_v67.isCons())
        {ESLVal $300 = _v67.head();
          ESLVal $301 = _v67.tail();
          
          {ESLVal a = $300;
          
          {ESLVal _v652 = $301;
          
          return armTypes.apply(_v652,_v650,_v649,_v648,_v647,_v646).cons(armType.apply(a,_v650,_v649,_v648,_v647,_v646));
        }
        }
        }
      else if(_v67.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(35766,35935)").add(ESLVal.list(_v67)));
      }
    }
  });
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v643 = $args[0];
  ESLVal _v642 = $args[1];
  ESLVal _v641 = $args[2];
  ESLVal _v640 = $args[3];
  ESLVal _v639 = $args[4];
  ESLVal _v638 = $args[5];
  {ESLVal _v66 = _v643;
        
        switch(_v66.termName) {
        case "BArm": {ESLVal $299 = _v66.termRef(0);
          ESLVal $298 = _v66.termRef(1);
          ESLVal $297 = _v66.termRef(2);
          ESLVal $296 = _v66.termRef(3);
          
          {ESLVal l = $299;
          
          {ESLVal ps = $298;
          
          {ESLVal guard = $297;
          
          {ESLVal exp = $296;
          
          {checkPatterns.apply(l,ps);
        if(length.apply(ps).eql(length.apply(_v642)).boolVal)
          return patternTypes.apply(l,ps,_v642,_v641,_v640,_v639,_v638,new ESLVal(new Function(new ESLVal("fun617"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v645 = $args[0];
            ESLVal _v644 = $args[1];
            return guardedExpType.apply(l,guard,exp,_v641,_v644,_v639,_v638);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(_v642))))));}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(36037,36498)").add(ESLVal.list(_v66)));
      }
      }
    }
  });
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v608 = $args[0];
  ESLVal _v607 = $args[1];
  ESLVal _v606 = $args[2];
  ESLVal _v605 = $args[3];
  ESLVal _v604 = $args[4];
  ESLVal _v603 = $args[5];
  ESLVal _v602 = $args[6];
  LetRec letrec = new LetRec() {
        ESLVal t = derefType.apply(expType.apply(_v607,_v605,_v604,_v603,_v602));
        ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal decs = $args[0];
          {ESLVal _v64 = decs;
                
                if(_v64.isCons())
                {ESLVal $279 = _v64.head();
                  ESLVal $280 = _v64.tail();
                  
                  switch($279.termName) {
                  case "Dec": {ESLVal $284 = $279.termRef(0);
                    ESLVal $283 = $279.termRef(1);
                    ESLVal $282 = $279.termRef(2);
                    ESLVal $281 = $279.termRef(3);
                    
                    {ESLVal _v614 = $284;
                    
                    {ESLVal m = $283;
                    
                    {ESLVal t = $282;
                    
                    {ESLVal st = $281;
                    
                    {ESLVal _v615 = $280;
                    
                    if(m.eql(_v606).boolVal)
                    return t;
                    else
                      {ESLVal d = $279;
                        
                        {ESLVal _v616 = $280;
                        
                        return findExport.apply(_v616);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal d = $279;
                    
                    {ESLVal _v617 = $280;
                    
                    return findExport.apply(_v617);
                  }
                  }
                }
                }
              else if(_v64.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(36726,36899)").add(ESLVal.list(_v64)));
              }
            }
          });
        ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal fs = $args[0];
          {ESLVal _v63 = fs;
                
                if(_v63.isCons())
                {ESLVal $274 = _v63.head();
                  ESLVal $275 = _v63.tail();
                  
                  switch($274.termName) {
                  case "FieldType": {ESLVal $278 = $274.termRef(0);
                    ESLVal $277 = $274.termRef(1);
                    ESLVal $276 = $274.termRef(2);
                    
                    {ESLVal _v609 = $278;
                    
                    {ESLVal m = $277;
                    
                    {ESLVal t = $276;
                    
                    {ESLVal _v610 = $275;
                    
                    if(m.eql(_v606).boolVal)
                    return t;
                    else
                      {ESLVal _v611 = $274;
                        
                        {ESLVal _v612 = $275;
                        
                        return findField.apply(_v612);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t = $274;
                    
                    {ESLVal _v613 = $275;
                    
                    return findField.apply(_v613);
                  }
                  }
                }
                }
              else if(_v63.isNil())
                return error(new ESLVal("TypeError",_v608,new ESLVal("cannot find field name ").add(_v606)));
              else return error(new ESLVal("case error at Pos(36940,37145)").add(ESLVal.list(_v63)));
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
      
        {ESLVal _v65 = typeNF.apply(t,_v602);
        
        switch(_v65.termName) {
        case "StrType": {ESLVal $295 = _v65.termRef(0);
          
          {ESLVal sl = $295;
          
          if(_v606.eql(new ESLVal("explode")).boolVal)
          return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
          else
            {ESLVal _v635 = $295;
              
              if(_v606.eql(new ESLVal("writeDate")).boolVal)
              return new ESLVal("FloatType",_v635);
              else
                {ESLVal _v636 = _v65;
                  
                  return error(new ESLVal("TypeError",_v608,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v636,_v602))));
                }
            }
        }
        }
      case "TableType": {ESLVal $294 = _v65.termRef(0);
          ESLVal $293 = _v65.termRef(1);
          ESLVal $292 = _v65.termRef(2);
          
          {ESLVal _v621 = $294;
          
          {ESLVal k = $293;
          
          {ESLVal v = $292;
          
          if(_v606.eql(new ESLVal("get")).boolVal)
          return new ESLVal("FunType",_v621,ESLVal.list(k),v);
          else
            {ESLVal _v622 = $294;
              
              {ESLVal _v623 = $293;
              
              {ESLVal _v624 = $292;
              
              if(_v606.eql(new ESLVal("put")).boolVal)
              return new ESLVal("FunType",_v622,ESLVal.list(_v623,_v624),t);
              else
                {ESLVal _v625 = $294;
                  
                  {ESLVal _v626 = $293;
                  
                  {ESLVal _v627 = $292;
                  
                  if(_v606.eql(new ESLVal("keys")).boolVal)
                  return new ESLVal("ListType",_v625,_v626);
                  else
                    {ESLVal _v628 = $294;
                      
                      {ESLVal _v629 = $293;
                      
                      {ESLVal _v630 = $292;
                      
                      if(_v606.eql(new ESLVal("vals")).boolVal)
                      return new ESLVal("ListType",_v628,_v630);
                      else
                        {ESLVal _v631 = $294;
                          
                          {ESLVal _v632 = $293;
                          
                          {ESLVal _v633 = $292;
                          
                          if(_v606.eql(new ESLVal("hasKey")).boolVal)
                          return new ESLVal("FunType",_v631,ESLVal.list(_v632),new ESLVal("BoolType",_v631));
                          else
                            {ESLVal _v634 = _v65;
                              
                              return error(new ESLVal("TypeError",_v631,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v634,_v602))));
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
        }
        }
        }
        }
      case "ListType": {ESLVal $291 = _v65.termRef(0);
          ESLVal $290 = _v65.termRef(1);
          
          {ESLVal ll = $291;
          
          {ESLVal _v619 = $290;
          
          if(_v606.eql(new ESLVal("implode")).boolVal)
          return new ESLVal("StrType",ll);
          else
            {ESLVal _v620 = _v65;
              
              return error(new ESLVal("TypeError",_v608,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v620,_v602))));
            }
        }
        }
        }
      case "RecordType": {ESLVal $289 = _v65.termRef(0);
          ESLVal $288 = _v65.termRef(1);
          
          {ESLVal rl = $289;
          
          {ESLVal fs = $288;
          
          return findField.apply(fs);
        }
        }
        }
      case "ActType": {ESLVal $287 = _v65.termRef(0);
          ESLVal $286 = _v65.termRef(1);
          ESLVal $285 = _v65.termRef(2);
          
          {ESLVal al = $287;
          
          {ESLVal exports = $286;
          
          {ESLVal handlers = $285;
          
          {ESLVal _v618 = findExport.apply(exports);
          
          if(_v618.eql($null).boolVal)
          return error(new ESLVal("TypeError",_v608,new ESLVal("behaviour type does not export ").add(_v606)));
          else
            return substTypeEnv.apply(_v602,_v618);
        }
        }
        }
        }
        }
        default: {ESLVal _v637 = _v65;
          
          return error(new ESLVal("TypeError",_v608,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v637,_v602))));
        }
      }
      }
      
    }
  });
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v62 = t;
        
        switch(_v62.termName) {
        case "TypeClosure": {ESLVal $273 = _v62.termRef(0);
          
          {ESLVal f = $273;
          
          return derefType.apply(f.apply());
        }
        }
        default: {ESLVal _v601 = _v62;
          
          return _v601;
        }
      }
      }
    }
  });
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v595 = $args[0];
  ESLVal _v594 = $args[1];
  ESLVal _v593 = $args[2];
  ESLVal _v592 = $args[3];
  ESLVal _v591 = $args[4];
  ESLVal _v590 = $args[5];
  LetRec letrec = new LetRec() {
        ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v596 = $args[0];
          {ESLVal _v61 = _v596;
                
                if(_v61.isCons())
                {ESLVal $266 = _v61.head();
                  ESLVal $267 = _v61.tail();
                  
                  switch($266.termName) {
                  case "Binding": {ESLVal $272 = $266.termRef(0);
                    ESLVal $271 = $266.termRef(1);
                    ESLVal $270 = $266.termRef(2);
                    ESLVal $269 = $266.termRef(3);
                    ESLVal $268 = $266.termRef(4);
                    
                    {ESLVal _v597 = $272;
                    
                    {ESLVal n = $271;
                    
                    {ESLVal t = $270;
                    
                    {ESLVal st = $269;
                    
                    {ESLVal e = $268;
                    
                    {ESLVal _v598 = $267;
                    
                    return fieldTypes.apply(_v598).cons(new ESLVal("FieldType",_v597,n,expType.apply(e,_v593,_v592,_v591,_v590)));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v599 = _v61;
                    
                    return error(new ESLVal("TypeError",_v595,new ESLVal("unknown field representation: ").add(_v599)));
                  }
                }
                }
              else if(_v61.isNil())
                return $nil;
              else {ESLVal _v600 = _v61;
                  
                  return error(new ESLVal("TypeError",_v595,new ESLVal("unknown field representation: ").add(_v600)));
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
      
        return new ESLVal("RecordType",_v595,fieldTypes.apply(_v594));
      
    }
  });
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v585 = $args[0];
  ESLVal _v584 = $args[1];
  ESLVal _v583 = $args[2];
  ESLVal _v582 = $args[3];
  ESLVal _v581 = $args[4];
  ESLVal _v580 = $args[5];
  ESLVal _v579 = $args[6];
  ESLVal _v578 = $args[7];
  {ESLVal _v586 = expType.apply(_v583,_v581,_v580,_v579,_v578);
        
        {ESLVal _v60 = _v586;
        
        switch(_v60.termName) {
        case "ListType": {ESLVal $265 = _v60.termRef(0);
          ESLVal $264 = _v60.termRef(1);
          
          {ESLVal _v587 = $265;
          
          {ESLVal t = $264;
          
          return patternType.apply(_v587,_v584,t,_v581,_v580,_v579,_v578,new ESLVal(new Function(new ESLVal("fun618"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v589 = $args[0];
          ESLVal _v588 = $args[1];
          return expType.apply(_v582,_v581,_v588,_v579,_v578);
            }
          }));
        }
        }
        }
        default: {ESLVal t = _v60;
          
          return error(new ESLVal("TypeError",_v585,new ESLVal("for type expects a list: ").add(_v583)));
        }
      }
      }
      }
    }
  });
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v559 = $args[0];
  ESLVal _v558 = $args[1];
  ESLVal _v557 = $args[2];
  ESLVal _v556 = $args[3];
  ESLVal _v555 = $args[4];
  ESLVal _v554 = $args[5];
  ESLVal _v553 = $args[6];
  ESLVal _v552 = $args[7];
  {ESLVal _v59 = _v558;
        ESLVal _v58 = _v557;
        
        if(_v59.isCons())
        {ESLVal $258 = _v59.head();
          ESLVal $259 = _v59.tail();
          
          if(_v58.isCons())
          {ESLVal $260 = _v58.head();
            ESLVal $261 = _v58.tail();
            
            {ESLVal p = $258;
            
            {ESLVal _v560 = $259;
            
            {ESLVal t = $260;
            
            {ESLVal _v561 = $261;
            
            {ESLVal _v563 = _v560;
            ESLVal _v562 = _v561;
            
            return patternType.apply(_v559,p,t,_v556,_v555,_v554,_v553,new ESLVal(new Function(new ESLVal("fun619"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v565 = $args[0];
            ESLVal _v564 = $args[1];
            return patternTypes.apply(_v559,_v563,_v562,_v556,_v564,_v554,_v553,new ESLVal(new Function(new ESLVal("fun620"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v567 = $args[0];
                  ESLVal _v566 = $args[1];
                  return _v552.apply(_v567.cons(_v565),_v566);
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
        else if(_v58.isNil())
          {ESLVal _v568 = _v59;
            
            {ESLVal _v569 = _v58;
            
            return error(new ESLVal("TypeError",_v559,new ESLVal("somthing wrong with ").add(_v568.add(new ESLVal(" ").add(_v569)))));
          }
          }
        else {ESLVal _v570 = _v59;
            
            {ESLVal _v571 = _v58;
            
            return error(new ESLVal("TypeError",_v559,new ESLVal("somthing wrong with ").add(_v570.add(new ESLVal(" ").add(_v571)))));
          }
          }
        }
      else if(_v59.isNil())
        if(_v58.isCons())
          {ESLVal $262 = _v58.head();
            ESLVal $263 = _v58.tail();
            
            {ESLVal _v572 = _v59;
            
            {ESLVal _v573 = _v58;
            
            return error(new ESLVal("TypeError",_v559,new ESLVal("somthing wrong with ").add(_v572.add(new ESLVal(" ").add(_v573)))));
          }
          }
          }
        else if(_v58.isNil())
          return _v552.apply($nil,_v555);
        else {ESLVal _v574 = _v59;
            
            {ESLVal _v575 = _v58;
            
            return error(new ESLVal("TypeError",_v559,new ESLVal("somthing wrong with ").add(_v574.add(new ESLVal(" ").add(_v575)))));
          }
          }
      else {ESLVal _v576 = _v59;
          
          {ESLVal _v577 = _v58;
          
          return error(new ESLVal("TypeError",_v559,new ESLVal("somthing wrong with ").add(_v576.add(new ESLVal(" ").add(_v577)))));
        }
        }
      }
    }
  });
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v536 = $args[0];
  ESLVal _v535 = $args[1];
  ESLVal _v534 = $args[2];
  ESLVal _v533 = $args[3];
  ESLVal _v532 = $args[4];
  ESLVal _v531 = $args[5];
  {ESLVal _v57 = _v535;
        
        switch(_v57.termName) {
        case "PApplyType": {ESLVal $257 = _v57.termRef(0);
          ESLVal $256 = _v57.termRef(1);
          ESLVal $255 = _v57.termRef(2);
          
          {ESLVal _v549 = $257;
          
          {ESLVal _v550 = $256;
          
          {ESLVal args = $255;
          
          return error(new ESLVal("should this happen?"));
        }
        }
        }
        }
      case "PBool": {ESLVal $254 = _v57.termRef(0);
          ESLVal $253 = _v57.termRef(1);
          
          {ESLVal _v548 = $254;
          
          {ESLVal b = $253;
          
          return new ESLVal("BoolType",_v548);
        }
        }
        }
      case "PCons": {ESLVal $252 = _v57.termRef(0);
          ESLVal $251 = _v57.termRef(1);
          ESLVal $250 = _v57.termRef(2);
          
          {ESLVal _v547 = $252;
          
          {ESLVal hd = $251;
          
          {ESLVal tl = $250;
          
          return getPatternType.apply(_v547,tl,_v534,_v533,_v532,_v531);
        }
        }
        }
        }
      case "PBagCons": {ESLVal $249 = _v57.termRef(0);
          ESLVal $248 = _v57.termRef(1);
          ESLVal $247 = _v57.termRef(2);
          
          {ESLVal _v546 = $249;
          
          {ESLVal hd = $248;
          
          {ESLVal tl = $247;
          
          return getPatternType.apply(_v546,tl,_v534,_v533,_v532,_v531);
        }
        }
        }
        }
      case "PSetCons": {ESLVal $246 = _v57.termRef(0);
          ESLVal $245 = _v57.termRef(1);
          ESLVal $244 = _v57.termRef(2);
          
          {ESLVal _v545 = $246;
          
          {ESLVal hd = $245;
          
          {ESLVal tl = $244;
          
          return getPatternType.apply(_v545,tl,_v534,_v533,_v532,_v531);
        }
        }
        }
        }
      case "PNil": {ESLVal $243 = _v57.termRef(0);
          
          {ESLVal _v544 = $243;
          
          return new ESLVal("ForallType",_v544,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v544,new ESLVal("VarType",_v544,new ESLVal("T"))));
        }
        }
      case "PNull": {ESLVal $242 = _v57.termRef(0);
          
          {ESLVal _v543 = $242;
          
          return new ESLVal("ForallType",_v543,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v543,new ESLVal("T")));
        }
        }
      case "PEmptyBag": {ESLVal $241 = _v57.termRef(0);
          
          {ESLVal _v542 = $241;
          
          return new ESLVal("ForallType",_v542,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v542,new ESLVal("VarType",_v542,new ESLVal("T"))));
        }
        }
      case "PEmptySet": {ESLVal $240 = _v57.termRef(0);
          
          {ESLVal _v541 = $240;
          
          return new ESLVal("ForallType",_v541,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v541,new ESLVal("VarType",_v541,new ESLVal("T"))));
        }
        }
      case "PInt": {ESLVal $239 = _v57.termRef(0);
          ESLVal $238 = _v57.termRef(1);
          
          {ESLVal _v540 = $239;
          
          {ESLVal n = $238;
          
          return new ESLVal("IntType",_v540);
        }
        }
        }
      case "PVar": {ESLVal $237 = _v57.termRef(0);
          ESLVal $236 = _v57.termRef(1);
          ESLVal $235 = _v57.termRef(2);
          
          {ESLVal _v539 = $237;
          
          {ESLVal n = $236;
          
          {ESLVal pt = $235;
          
          return substTypeEnv.apply(_v531,pt);
        }
        }
        }
        }
      case "PStr": {ESLVal $234 = _v57.termRef(0);
          ESLVal $233 = _v57.termRef(1);
          
          {ESLVal _v538 = $234;
          
          {ESLVal s = $233;
          
          return new ESLVal("StrType",_v538);
        }
        }
        }
      case "PTerm": {ESLVal $232 = _v57.termRef(0);
          ESLVal $231 = _v57.termRef(1);
          ESLVal $230 = _v57.termRef(2);
          ESLVal $229 = _v57.termRef(3);
          
          {ESLVal _v537 = $232;
          
          {ESLVal n = $231;
          
          {ESLVal ts = $230;
          
          {ESLVal ps = $229;
          
          return lookupType.apply(n,_v532);
        }
        }
        }
        }
        }
        default: {ESLVal _v551 = _v57;
          
          return error(new ESLVal("TypeError",_v536,new ESLVal("unknown type of pattern: ").add(_v551)));
        }
      }
      }
    }
  });
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v509 = $args[0];
  ESLVal _v508 = $args[1];
  ESLVal _v507 = $args[2];
  ESLVal _v506 = $args[3];
  ESLVal _v505 = $args[4];
  ESLVal _v504 = $args[5];
  ESLVal _v503 = $args[6];
  ESLVal _v502 = $args[7];
  {ESLVal _v56 = _v508;
        
        switch(_v56.termName) {
        case "PApplyType": {ESLVal $228 = _v56.termRef(0);
          ESLVal $227 = _v56.termRef(1);
          ESLVal $226 = _v56.termRef(2);
          
          {ESLVal _v528 = $228;
          
          {ESLVal _v529 = $227;
          
          {ESLVal args = $226;
          
          return applyTypePatternType.apply(_v528,_v529,substTypesEnv.apply(_v503,args),_v507,_v506,_v505,_v504,_v503,_v502);
        }
        }
        }
        }
      case "PBool": {ESLVal $225 = _v56.termRef(0);
          ESLVal $224 = _v56.termRef(1);
          
          {ESLVal _v527 = $225;
          
          {ESLVal b = $224;
          
          if(isBoolType.apply(_v507).boolVal)
          return _v502.apply(new ESLVal("BoolType",_v527),_v505);
          else
            return error(new ESLVal("TypeError",_v527,new ESLVal("type mismatch: Bool and ").add(ppType.apply(_v507,_v503))));
        }
        }
        }
      case "PBagCons": {ESLVal $223 = _v56.termRef(0);
          ESLVal $222 = _v56.termRef(1);
          ESLVal $221 = _v56.termRef(2);
          
          {ESLVal _v524 = $223;
          
          {ESLVal hd = $222;
          
          {ESLVal tl = $221;
          
          return bagConsPatternType.apply(_v524,hd,tl,_v507,_v506,_v505,_v504,_v503,new ESLVal(new Function(new ESLVal("fun621"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v526 = $args[0];
          ESLVal _v525 = $args[1];
          return _v502.apply(new ESLVal("ListType",_v524,_v526),_v525);
            }
          }));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $220 = _v56.termRef(0);
          ESLVal $219 = _v56.termRef(1);
          ESLVal $218 = _v56.termRef(2);
          
          {ESLVal _v521 = $220;
          
          {ESLVal hd = $219;
          
          {ESLVal tl = $218;
          
          return setConsPatternType.apply(_v521,hd,tl,_v507,_v506,_v505,_v504,_v503,new ESLVal(new Function(new ESLVal("fun622"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v523 = $args[0];
          ESLVal _v522 = $args[1];
          return _v502.apply(new ESLVal("ListType",_v521,_v523),_v522);
            }
          }));
        }
        }
        }
        }
      case "PCons": {ESLVal $217 = _v56.termRef(0);
          ESLVal $216 = _v56.termRef(1);
          ESLVal $215 = _v56.termRef(2);
          
          {ESLVal _v518 = $217;
          
          {ESLVal hd = $216;
          
          {ESLVal tl = $215;
          
          return consPatternType.apply(_v518,hd,tl,_v507,_v506,_v505,_v504,_v503,new ESLVal(new Function(new ESLVal("fun623"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v520 = $args[0];
          ESLVal _v519 = $args[1];
          return _v502.apply(new ESLVal("ListType",_v518,_v520),_v519);
            }
          }));
        }
        }
        }
        }
      case "PNil": {ESLVal $214 = _v56.termRef(0);
          
          {ESLVal _v517 = $214;
          
          return nilType.apply(_v517,_v507,_v506,_v505,_v504,_v503,_v502);
        }
        }
      case "PNull": {ESLVal $213 = _v56.termRef(0);
          
          {ESLVal _v516 = $213;
          
          return _v502.apply(_v507,_v505);
        }
        }
      case "PEmptyBag": {ESLVal $212 = _v56.termRef(0);
          
          {ESLVal _v515 = $212;
          
          return emptyBagType.apply(_v515,_v507,_v506,_v505,_v504,_v503,_v502);
        }
        }
      case "PEmptySet": {ESLVal $211 = _v56.termRef(0);
          
          {ESLVal _v514 = $211;
          
          return emptySetType.apply(_v514,_v507,_v506,_v505,_v504,_v503,_v502);
        }
        }
      case "PInt": {ESLVal $210 = _v56.termRef(0);
          ESLVal $209 = _v56.termRef(1);
          
          {ESLVal _v513 = $210;
          
          {ESLVal n = $209;
          
          if(isIntType.apply(_v507).boolVal)
          return _v502.apply(new ESLVal("IntType",_v513),_v505);
          else
            return error(new ESLVal("TypeError",_v513,new ESLVal("type mismatch: Int and ").add(ppType.apply(_v507,_v503))));
        }
        }
        }
      case "PVar": {ESLVal $208 = _v56.termRef(0);
          ESLVal $207 = _v56.termRef(1);
          ESLVal $206 = _v56.termRef(2);
          
          {ESLVal _v512 = $208;
          
          {ESLVal n = $207;
          
          {ESLVal pt = $206;
          
          return _v502.apply(_v507,ESLVal.list(new ESLVal("Map",n,_v507)).add(_v505));
        }
        }
        }
        }
      case "PStr": {ESLVal $205 = _v56.termRef(0);
          ESLVal $204 = _v56.termRef(1);
          
          {ESLVal _v511 = $205;
          
          {ESLVal s = $204;
          
          if(isStrType.apply(_v507).boolVal)
          return _v502.apply(new ESLVal("StrType",_v511),_v505);
          else
            return error(new ESLVal("TypeError",_v511,new ESLVal("type mismatch: Str and ").add(ppType.apply(_v507,_v503))));
        }
        }
        }
      case "PTerm": {ESLVal $203 = _v56.termRef(0);
          ESLVal $202 = _v56.termRef(1);
          ESLVal $201 = _v56.termRef(2);
          ESLVal $200 = _v56.termRef(3);
          
          {ESLVal _v510 = $203;
          
          {ESLVal n = $202;
          
          {ESLVal ts = $201;
          
          {ESLVal ps = $200;
          
          return termPatternType.apply(_v510,n,substTypesEnv.apply(_v503,ts),ps,_v507,_v506,_v505,_v504,_v503,_v502);
        }
        }
        }
        }
        }
        default: {ESLVal _v530 = _v56;
          
          return error(new ESLVal("TypeError",_v509,new ESLVal("unknown type of pattern: ").add(_v530)));
        }
      }
      }
    }
  });
  private static ESLVal applyTypePatternType = new ESLVal(new Function(new ESLVal("applyTypePatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v497 = $args[0];
  ESLVal _v496 = $args[1];
  ESLVal _v495 = $args[2];
  ESLVal _v494 = $args[3];
  ESLVal _v493 = $args[4];
  ESLVal _v492 = $args[5];
  ESLVal _v491 = $args[6];
  ESLVal _v490 = $args[7];
  ESLVal _v489 = $args[8];
  return patternType.apply(_v497,_v496,_v494,_v493,_v492,_v491,_v490,new ESLVal(new Function(new ESLVal("fun624"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v499 = $args[0];
        ESLVal _v498 = $args[1];
        {ESLVal _v55 = typeNF.apply(_v499,_v490);
              
              switch(_v55.termName) {
              case "TypeFun": {ESLVal $199 = _v55.termRef(0);
                ESLVal $198 = _v55.termRef(1);
                ESLVal $197 = _v55.termRef(2);
                
                {ESLVal fl = $199;
                
                {ESLVal ns = $198;
                
                {ESLVal t = $197;
                
                if(length.apply(_v495).eql(length.apply(ns)).boolVal)
                {ESLVal _v501 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v495).add(_v490),t);
                  
                  if(typeEqual.apply(_v501,_v494).boolVal)
                  return _v489.apply(_v501,_v498);
                  else
                    return error(new ESLVal("TypeError",_v497,new ESLVal("value type ").add(ppType.apply(_v494,_v490).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v501,_v490).add(new ESLVal(" ").add(ppTypeEnv.apply(_v490))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v497,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v495))))));
              }
              }
              }
              }
            case "ForallType": {ESLVal $196 = _v55.termRef(0);
                ESLVal $195 = _v55.termRef(1);
                ESLVal $194 = _v55.termRef(2);
                
                {ESLVal fl = $196;
                
                {ESLVal ns = $195;
                
                {ESLVal t = $194;
                
                if(length.apply(_v495).eql(length.apply(ns)).boolVal)
                {ESLVal _v500 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v495).add(_v490),t);
                  
                  if(typeEqual.apply(_v500,_v494).boolVal)
                  return _v489.apply(_v500,_v498);
                  else
                    return error(new ESLVal("TypeError",_v497,new ESLVal("value type ").add(ppType.apply(_v494,_v490).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v500,_v490).add(new ESLVal(" ").add(ppTypeEnv.apply(_v490))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v497,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v495))))));
              }
              }
              }
              }
              default: {ESLVal t = _v55;
                
                return _v489.apply(t,_v498);
              }
            }
            }
          }
        }));
    }
  });
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v481 = $args[0];
  ESLVal _v480 = $args[1];
  ESLVal _v479 = $args[2];
  ESLVal _v478 = $args[3];
  ESLVal _v477 = $args[4];
  ESLVal _v476 = $args[5];
  ESLVal _v475 = $args[6];
  ESLVal _v474 = $args[7];
  ESLVal _v473 = $args[8];
  ESLVal _v472 = $args[9];
  {ESLVal _v482 = getTermPatternType.apply(_v481,_v480,_v479,_v476,_v475,_v474,_v473);
        
        if(typeEqual.apply(_v482,_v477).boolVal)
        {ESLVal _v53 = typeNF.apply(_v477,_v473);
          
          switch(_v53.termName) {
          case "UnionType": {ESLVal $188 = _v53.termRef(0);
            ESLVal $187 = _v53.termRef(1);
            
            {ESLVal ul = $188;
            
            {ESLVal cs = $187;
            
            LetRec letrec = new LetRec() {
            ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v483 = $args[0];
              {ESLVal _v54 = _v483;
                    
                    if(_v54.isCons())
                    {ESLVal $189 = _v54.head();
                      ESLVal $190 = _v54.tail();
                      
                      switch($189.termName) {
                      case "TermType": {ESLVal $193 = $189.termRef(0);
                        ESLVal $192 = $189.termRef(1);
                        ESLVal $191 = $189.termRef(2);
                        
                        {ESLVal tl = $193;
                        
                        {ESLVal m = $192;
                        
                        {ESLVal args = $191;
                        
                        {ESLVal _v484 = $190;
                        
                        if(m.eql(_v480).boolVal)
                        return args;
                        else
                          {ESLVal t = $189;
                            
                            {ESLVal _v485 = $190;
                            
                            return getCnstrArgs.apply(_v485);
                          }
                          }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t = $189;
                        
                        {ESLVal _v486 = $190;
                        
                        return getCnstrArgs.apply(_v486);
                      }
                      }
                    }
                    }
                  else if(_v54.isNil())
                    return error(new ESLVal("TypeError",_v481,new ESLVal("cannot find constructor for ").add(_v480)));
                  else return error(new ESLVal("case error at Pos(45116,45375)").add(ESLVal.list(_v54)));
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
            
            if(length.apply(_v478).eql(length.apply(argTypes)).boolVal)
            return patternTypes.apply(_v481,_v478,argTypes,_v476,_v475,_v474,_v473,new ESLVal(new Function(new ESLVal("fun625"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v488 = $args[0];
              ESLVal _v487 = $args[1];
              return _v472.apply(typeNF.apply(_v477,_v473),_v487);
                }
              }));
            else
              return error(new ESLVal("TypeError",_v481,new ESLVal("arity mismatch.")));
          }
          
          }
          }
          }
          default: {ESLVal t = _v53;
            
            return error(new ESLVal("TypeError",_v481,new ESLVal("expecting a data type: ").add(_v477)));
          }
        }
        }
        else
          return error(new ESLVal("TypeError",_v481,new ESLVal("term pattern type ").add(ppType.apply(_v482,_v473).add(new ESLVal(" does not match supplied value type ").add(ppType.apply(_v477,_v473))))));
      }
    }
  });
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v466 = $args[0];
  ESLVal _v465 = $args[1];
  {ESLVal _v50 = substTypeEnv.apply(_v465,_v466);
        
        switch(_v50.termName) {
        case "ApplyTypeFun": {ESLVal $180 = _v50.termRef(0);
          ESLVal $179 = _v50.termRef(1);
          ESLVal $178 = _v50.termRef(2);
          
          {ESLVal l = $180;
          
          {ESLVal op = $179;
          
          {ESLVal args = $178;
          
          {ESLVal _v52 = typeNF.apply(op,_v465);
          
          switch(_v52.termName) {
          case "TypeFun": {ESLVal $186 = _v52.termRef(0);
            ESLVal $185 = _v52.termRef(1);
            ESLVal $184 = _v52.termRef(2);
            
            {ESLVal _v468 = $186;
            
            {ESLVal ns = $185;
            
            {ESLVal _v469 = $184;
            
            if(length.apply(args).eql(length.apply(ns)).boolVal)
            return typeNF.apply(substTypeEnv.apply(zipTypeEnv.apply(ns,args),_v469),_v465);
            else
              return error(new ESLVal("TypeError",_v468,new ESLVal("function arity error")));
          }
          }
          }
          }
          default: {ESLVal _v470 = _v52;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(typeNF.apply(op,_v465),_v465))));
          }
        }
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $177 = _v50.termRef(0);
          
          {ESLVal f = $177;
          
          return typeNF.apply(f.apply(),_v465);
        }
        }
      case "RecType": {ESLVal $176 = _v50.termRef(0);
          ESLVal $175 = _v50.termRef(1);
          ESLVal $174 = _v50.termRef(2);
          
          {ESLVal l = $176;
          
          {ESLVal n = $175;
          
          {ESLVal _v467 = $174;
          
          return typeNF.apply(substType.apply(new ESLVal("RecType",l,n,_v467),n,_v467),_v465);
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $173 = _v50.termRef(0);
          ESLVal $172 = _v50.termRef(1);
          ESLVal $171 = _v50.termRef(2);
          ESLVal $170 = _v50.termRef(3);
          
          {ESLVal l1 = $173;
          
          {ESLVal parent = $172;
          
          {ESLVal decs1 = $171;
          
          {ESLVal ms1 = $170;
          
          {ESLVal _v51 = typeNF.apply(parent,_v465);
          
          switch(_v51.termName) {
          case "ActType": {ESLVal $183 = _v51.termRef(0);
            ESLVal $182 = _v51.termRef(1);
            ESLVal $181 = _v51.termRef(2);
            
            {ESLVal l2 = $183;
            
            {ESLVal decs2 = $182;
            
            {ESLVal ms2 = $181;
            
            return new ESLVal("ActType",l1,decs2.add(decs1),ms2.add(ms1));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(46692,46827)").add(ESLVal.list(_v51)));
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v471 = _v50;
          
          return _v471;
        }
      }
      }
    }
  });
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v464 = $args[0];
  ESLVal _v463 = $args[1];
  ESLVal _v462 = $args[2];
  ESLVal _v461 = $args[3];
  ESLVal _v460 = $args[4];
  ESLVal _v459 = $args[5];
  ESLVal _v458 = $args[6];
  {ESLVal t = lookupType.apply(_v463,_v459);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v464,new ESLVal("unknown constructor ").add(_v463)));
        else
          if(length.apply(_v462).gre($zero).boolVal)
            return getGenericTermPatternType.apply(_v464,t,_v462,_v461,_v460,_v459,_v458);
            else
              return t;
      }
    }
  });
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v455 = $args[0];
  ESLVal _v454 = $args[1];
  ESLVal _v453 = $args[2];
  ESLVal _v452 = $args[3];
  ESLVal _v451 = $args[4];
  ESLVal _v450 = $args[5];
  ESLVal _v449 = $args[6];
  {ESLVal _v49 = _v454;
        
        switch(_v49.termName) {
        case "RecType": {ESLVal $169 = _v49.termRef(0);
          ESLVal $168 = _v49.termRef(1);
          ESLVal $167 = _v49.termRef(2);
          
          {ESLVal rl = $169;
          
          {ESLVal rn = $168;
          
          {ESLVal rt = $167;
          
          return getGenericTermPatternType.apply(_v455,substType.apply(new ESLVal("RecType",rl,rn,rt),rn,rt),_v453,_v452,_v451,_v450,_v449);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $166 = _v49.termRef(0);
          ESLVal $165 = _v49.termRef(1);
          ESLVal $164 = _v49.termRef(2);
          
          {ESLVal al = $166;
          
          {ESLVal ns = $165;
          
          {ESLVal _v456 = $164;
          
          if(length.apply(ns).eql(length.apply(_v453)).boolVal)
          {ESLVal e = zipTypeEnv.apply(ns,_v453);
            
            return substTypeEnv.apply(e.add(_v449),_v456);
          }
          else
            return error(new ESLVal("TypeError",_v455,new ESLVal("generic constructor mismatch")));
        }
        }
        }
        }
        default: {ESLVal _v457 = _v49;
          
          return error(new ESLVal("TypeError",_v455,new ESLVal("expecting a generic type: ").add(ppType.apply(_v457,_v449))));
        }
      }
      }
    }
  });
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v447 = $args[0];
  ESLVal _v446 = $args[1];
  ESLVal _v445 = $args[2];
  ESLVal _v444 = $args[3];
  ESLVal _v443 = $args[4];
  ESLVal _v442 = $args[5];
  ESLVal _v441 = $args[6];
  {ESLVal _v48 = _v446;
        
        switch(_v48.termName) {
        case "ListType": {ESLVal $163 = _v48.termRef(0);
          ESLVal $162 = _v48.termRef(1);
          
          {ESLVal ltl = $163;
          
          {ESLVal et = $162;
          
          return _v441.apply(new ESLVal("ForallType",_v447,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v447,new ESLVal("VarType",_v447,new ESLVal("T")))),_v444);
        }
        }
        }
        default: {ESLVal _v448 = _v48;
          
          return error(new ESLVal("TypeError",_v447,new ESLVal("expecting a list type: ").add(ppType.apply(_v448,_v442))));
        }
      }
      }
    }
  });
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v439 = $args[0];
  ESLVal _v438 = $args[1];
  ESLVal _v437 = $args[2];
  ESLVal _v436 = $args[3];
  ESLVal _v435 = $args[4];
  ESLVal _v434 = $args[5];
  ESLVal _v433 = $args[6];
  {ESLVal _v47 = _v438;
        
        switch(_v47.termName) {
        case "BagType": {ESLVal $161 = _v47.termRef(0);
          ESLVal $160 = _v47.termRef(1);
          
          {ESLVal ltl = $161;
          
          {ESLVal et = $160;
          
          return _v433.apply(new ESLVal("ForallType",_v439,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v439,new ESLVal("VarType",_v439,new ESLVal("T")))),_v436);
        }
        }
        }
        default: {ESLVal _v440 = _v47;
          
          return error(new ESLVal("TypeError",_v439,new ESLVal("expecting a bag type: ").add(ppType.apply(_v440,_v434))));
        }
      }
      }
    }
  });
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v431 = $args[0];
  ESLVal _v430 = $args[1];
  ESLVal _v429 = $args[2];
  ESLVal _v428 = $args[3];
  ESLVal _v427 = $args[4];
  ESLVal _v426 = $args[5];
  ESLVal _v425 = $args[6];
  {ESLVal _v46 = _v430;
        
        switch(_v46.termName) {
        case "SetType": {ESLVal $159 = _v46.termRef(0);
          ESLVal $158 = _v46.termRef(1);
          
          {ESLVal ltl = $159;
          
          {ESLVal et = $158;
          
          return _v425.apply(new ESLVal("ForallType",_v431,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v431,new ESLVal("VarType",_v431,new ESLVal("T")))),_v428);
        }
        }
        }
        default: {ESLVal _v432 = _v46;
          
          return error(new ESLVal("TypeError",_v431,new ESLVal("expecting a set type: ").add(ppType.apply(_v432,_v426))));
        }
      }
      }
    }
  });
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v419 = $args[0];
  ESLVal _v418 = $args[1];
  ESLVal _v417 = $args[2];
  ESLVal _v416 = $args[3];
  ESLVal _v415 = $args[4];
  ESLVal _v414 = $args[5];
  ESLVal _v413 = $args[6];
  ESLVal _v412 = $args[7];
  ESLVal _v411 = $args[8];
  {ESLVal _v45 = _v416;
        
        switch(_v45.termName) {
        case "ListType": {ESLVal $157 = _v45.termRef(0);
          ESLVal $156 = _v45.termRef(1);
          
          {ESLVal ltl = $157;
          
          {ESLVal et = $156;
          
          return patternType.apply(_v419,_v418,substTypeEnv.apply(_v412,et),_v415,_v414,_v413,_v412,new ESLVal(new Function(new ESLVal("fun626"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v421 = $args[0];
          ESLVal _v420 = $args[1];
          return patternType.apply(_v419,_v417,_v416,_v415,_v420,_v413,_v412,new ESLVal(new Function(new ESLVal("fun627"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v423 = $args[0];
                ESLVal _v422 = $args[1];
                return _v411.apply(_v421,_v422);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v424 = _v45;
          
          return error(new ESLVal("TypeError",_v419,new ESLVal("expecting a list type: ").add(ppType.apply(_v424,_v412))));
        }
      }
      }
    }
  });
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v405 = $args[0];
  ESLVal _v404 = $args[1];
  ESLVal _v403 = $args[2];
  ESLVal _v402 = $args[3];
  ESLVal _v401 = $args[4];
  ESLVal _v400 = $args[5];
  ESLVal _v399 = $args[6];
  ESLVal _v398 = $args[7];
  ESLVal _v397 = $args[8];
  {ESLVal _v44 = _v402;
        
        switch(_v44.termName) {
        case "BagType": {ESLVal $155 = _v44.termRef(0);
          ESLVal $154 = _v44.termRef(1);
          
          {ESLVal ltl = $155;
          
          {ESLVal et = $154;
          
          return patternType.apply(_v405,_v404,substTypeEnv.apply(_v398,et),_v401,_v400,_v399,_v398,new ESLVal(new Function(new ESLVal("fun628"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v407 = $args[0];
          ESLVal _v406 = $args[1];
          return patternType.apply(_v405,_v403,_v402,_v401,_v406,_v399,_v398,new ESLVal(new Function(new ESLVal("fun629"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v409 = $args[0];
                ESLVal _v408 = $args[1];
                return _v397.apply(_v407,_v408);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v410 = _v44;
          
          return error(new ESLVal("TypeError",_v405,new ESLVal("expecting a bag type: ").add(ppType.apply(_v410,_v398))));
        }
      }
      }
    }
  });
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v391 = $args[0];
  ESLVal _v390 = $args[1];
  ESLVal _v389 = $args[2];
  ESLVal _v388 = $args[3];
  ESLVal _v387 = $args[4];
  ESLVal _v386 = $args[5];
  ESLVal _v385 = $args[6];
  ESLVal _v384 = $args[7];
  ESLVal _v383 = $args[8];
  {ESLVal _v43 = _v388;
        
        switch(_v43.termName) {
        case "SetType": {ESLVal $153 = _v43.termRef(0);
          ESLVal $152 = _v43.termRef(1);
          
          {ESLVal ltl = $153;
          
          {ESLVal et = $152;
          
          return patternType.apply(_v391,_v390,substTypeEnv.apply(_v384,et),_v387,_v386,_v385,_v384,new ESLVal(new Function(new ESLVal("fun630"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v393 = $args[0];
          ESLVal _v392 = $args[1];
          return patternType.apply(_v391,_v389,_v388,_v387,_v392,_v385,_v384,new ESLVal(new Function(new ESLVal("fun631"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v395 = $args[0];
                ESLVal _v394 = $args[1];
                return _v383.apply(_v393,_v394);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v396 = _v43;
          
          return error(new ESLVal("TypeError",_v391,new ESLVal("expecting a set type: ").add(ppType.apply(_v396,_v384))));
        }
      }
      }
    }
  });
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v381 = $args[0];
  ESLVal _v380 = $args[1];
  ESLVal _v379 = $args[2];
  ESLVal _v378 = $args[3];
  ESLVal _v377 = $args[4];
  ESLVal _v376 = $args[5];
  ESLVal _v375 = $args[6];
  ESLVal _v374 = $args[7];
  {ESLVal _v42 = _v379;
        
        switch(_v42.strVal) {
        case "+": return plusExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "-": return subExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "*": return mulExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "/": return divExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case ":": return consExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "=": return eqlExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "<>": return neqlExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "and": return andExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "andalso": return andExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "or": return orExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "orelse": return orExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case ">": return compareExpType.apply(_v381,_v380,new ESLVal(">"),_v378,_v377,_v376,_v375,_v374);
      case ">=": return compareExpType.apply(_v381,_v380,new ESLVal(">="),_v378,_v377,_v376,_v375,_v374);
      case "<": return compareExpType.apply(_v381,_v380,new ESLVal("<"),_v378,_v377,_v376,_v375,_v374);
      case "<=": return compareExpType.apply(_v381,_v380,new ESLVal("<="),_v378,_v377,_v376,_v375,_v374);
      case "..": return dotDotExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
      case "%": return percentExpType.apply(_v381,_v380,_v378,_v377,_v376,_v375,_v374);
        default: {ESLVal _v382 = _v42;
          
          return error(new ESLVal("TypeError",_v381,new ESLVal("unknown operator: ").add(_v382)));
        }
      }
      }
    }
  });
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v373 = $args[0];
  ESLVal _v372 = $args[1];
  ESLVal _v371 = $args[2];
  ESLVal _v370 = $args[3];
  ESLVal _v369 = $args[4];
  ESLVal _v368 = $args[5];
  ESLVal _v367 = $args[6];
  {ESLVal t1 = expType.apply(_v372,_v370,_v369,_v368,_v367);
        ESLVal t2 = expType.apply(_v371,_v370,_v369,_v368,_v367);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v373,new ESLVal("and expects boolean arguments: ").add(ppType.apply(t1,_v367).add(new ESLVal(" ").add(ppType.apply(t2,_v367))))));
      }
    }
  });
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v366 = $args[0];
  ESLVal _v365 = $args[1];
  ESLVal _v364 = $args[2];
  ESLVal _v363 = $args[3];
  ESLVal _v362 = $args[4];
  ESLVal _v361 = $args[5];
  ESLVal _v360 = $args[6];
  {ESLVal t1 = expType.apply(_v365,_v363,_v362,_v361,_v360);
        ESLVal t2 = expType.apply(_v364,_v363,_v362,_v361,_v360);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("ListType",_v366,new ESLVal("IntType",_v366));
        else
          return error(new ESLVal("TypeError",_v366,new ESLVal(".. expects integer arguments: ").add(ppType.apply(t1,_v360).add(new ESLVal(" ").add(ppType.apply(t2,_v360))))));
      }
    }
  });
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),getSelf()) {
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
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("IntType",_v359);
        else
          return error(new ESLVal("TypeError",_v359,new ESLVal("% expects integer arguments: ").add(ppType.apply(t1,_v353).add(new ESLVal(" ").add(ppType.apply(t2,_v353))))));
      }
    }
  });
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v352 = $args[0];
  ESLVal _v351 = $args[1];
  ESLVal _v350 = $args[2];
  ESLVal _v349 = $args[3];
  ESLVal _v348 = $args[4];
  ESLVal _v347 = $args[5];
  ESLVal _v346 = $args[6];
  ESLVal _v345 = $args[7];
  {ESLVal t1 = expType.apply(_v351,_v348,_v347,_v346,_v345);
        ESLVal t2 = expType.apply(_v349,_v348,_v347,_v346,_v345);
        
        if(isNumType.apply(t1).and(isNumType.apply(t2)).boolVal)
        return new ESLVal("BoolType",_v352);
        else
          return error(new ESLVal("TypeError",_v352,_v350.add(new ESLVal(" expects numeric arguments: ").add(ppType.apply(t1,_v345).add(new ESLVal(" ").add(ppType.apply(t2,_v345)))))));
      }
    }
  });
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v344 = $args[0];
  ESLVal _v343 = $args[1];
  ESLVal _v342 = $args[2];
  ESLVal _v341 = $args[3];
  ESLVal _v340 = $args[4];
  ESLVal _v339 = $args[5];
  ESLVal _v338 = $args[6];
  {ESLVal t1 = expType.apply(_v343,_v341,_v340,_v339,_v338);
        ESLVal t2 = expType.apply(_v342,_v341,_v340,_v339,_v338);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v344,new ESLVal("or expects boolean arguments: ").add(ppType.apply(t1,_v338).add(new ESLVal(" ").add(ppType.apply(t2,_v338))))));
      }
    }
  });
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v337 = $args[0];
  ESLVal _v336 = $args[1];
  ESLVal _v335 = $args[2];
  ESLVal _v334 = $args[3];
  ESLVal _v333 = $args[4];
  ESLVal _v332 = $args[5];
  ESLVal _v331 = $args[6];
  {ESLVal t1 = expType.apply(_v336,_v334,_v333,_v332,_v331);
        ESLVal t2 = expType.apply(_v335,_v334,_v333,_v332,_v331);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v337);
        else
          return error(new ESLVal("TypeError",_v337,new ESLVal("= expects types to agree: ").add(ppType.apply(t1,_v331).add(new ESLVal(" <> ").add(ppType.apply(t2,_v331))))));
      }
    }
  });
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v330 = $args[0];
  ESLVal _v329 = $args[1];
  ESLVal _v328 = $args[2];
  ESLVal _v327 = $args[3];
  ESLVal _v326 = $args[4];
  ESLVal _v325 = $args[5];
  ESLVal _v324 = $args[6];
  {ESLVal t1 = expType.apply(_v329,_v327,_v326,_v325,_v324);
        ESLVal t2 = expType.apply(_v328,_v327,_v326,_v325,_v324);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v330);
        else
          return error(new ESLVal("TypeError",_v330,new ESLVal("<> expects types to agree: ").add(ppType.apply(t1,_v324).add(new ESLVal(" <> ").add(ppType.apply(t2,_v324))))));
      }
    }
  });
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v322 = $args[0];
  ESLVal _v321 = $args[1];
  ESLVal _v320 = $args[2];
  ESLVal _v319 = $args[3];
  ESLVal _v318 = $args[4];
  ESLVal _v317 = $args[5];
  ESLVal _v316 = $args[6];
  {ESLVal t1 = typeNF.apply(expType.apply(_v321,_v319,_v318,_v317,_v316),_v316);
        ESLVal t2 = typeNF.apply(expType.apply(_v320,_v319,_v318,_v317,_v316),_v316);
        
        {ESLVal _v41 = t2;
        ESLVal _v40 = t1;
        
        switch(_v41.termName) {
        case "ListType": {ESLVal $151 = _v41.termRef(0);
          ESLVal $150 = _v41.termRef(1);
          
          {ESLVal _v323 = $151;
          
          {ESLVal elementType = $150;
          
          {ESLVal headType = _v40;
          
          if(subType.apply(headType,elementType).boolVal)
          return t2;
          else
            return error(new ESLVal("TypeError",_v323,new ESLVal(": expects head type ").add(ppType.apply(headType,_v316).add(new ESLVal(" and element type ").add(ppType.apply(elementType,_v316).add(new ESLVal(" to agree")))))));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(55226,55507)").add(ESLVal.list(_v41,_v40)));
      }
      }
      }
    }
  });
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v309 = $args[0];
  ESLVal _v308 = $args[1];
  ESLVal _v307 = $args[2];
  ESLVal _v306 = $args[3];
  ESLVal _v305 = $args[4];
  ESLVal _v304 = $args[5];
  ESLVal _v303 = $args[6];
  {ESLVal t1 = expType.apply(_v308,_v306,_v305,_v304,_v303);
        ESLVal t2 = expType.apply(_v307,_v306,_v305,_v304,_v303);
        
        {ESLVal _v39 = t1;
        ESLVal _v38 = t2;
        
        switch(_v39.termName) {
        case "IntType": {ESLVal $148 = _v39.termRef(0);
          
          switch(_v38.termName) {
          case "IntType": {ESLVal $149 = _v38.termRef(0);
            
            {ESLVal l1 = $148;
            
            {ESLVal l2 = $149;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v312 = _v39;
            
            {ESLVal _v313 = _v38;
            
            return error(new ESLVal("TypeError",_v309,new ESLVal("incomptible types for /: ").add(ppType.apply(_v312,_v303).add(new ESLVal(" and ").add(ppType.apply(_v313,_v303))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $146 = _v39.termRef(0);
          
          switch(_v38.termName) {
          case "FloatType": {ESLVal $147 = _v38.termRef(0);
            
            {ESLVal l1 = $146;
            
            {ESLVal l2 = $147;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v310 = _v39;
            
            {ESLVal _v311 = _v38;
            
            return error(new ESLVal("TypeError",_v309,new ESLVal("incomptible types for /: ").add(ppType.apply(_v310,_v303).add(new ESLVal(" and ").add(ppType.apply(_v311,_v303))))));
          }
          }
        }
        }
        default: {ESLVal _v314 = _v39;
          
          {ESLVal _v315 = _v38;
          
          return error(new ESLVal("TypeError",_v309,new ESLVal("incomptible types for /: ").add(ppType.apply(_v314,_v303).add(new ESLVal(" and ").add(ppType.apply(_v315,_v303))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v296 = $args[0];
  ESLVal _v295 = $args[1];
  ESLVal _v294 = $args[2];
  ESLVal _v293 = $args[3];
  ESLVal _v292 = $args[4];
  ESLVal _v291 = $args[5];
  ESLVal _v290 = $args[6];
  {ESLVal t1 = expType.apply(_v295,_v293,_v292,_v291,_v290);
        ESLVal t2 = expType.apply(_v294,_v293,_v292,_v291,_v290);
        
        {ESLVal _v37 = t1;
        ESLVal _v36 = t2;
        
        switch(_v37.termName) {
        case "IntType": {ESLVal $143 = _v37.termRef(0);
          
          switch(_v36.termName) {
          case "IntType": {ESLVal $145 = _v36.termRef(0);
            
            {ESLVal l1 = $143;
            
            {ESLVal l2 = $145;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $144 = _v36.termRef(0);
            
            {ESLVal l1 = $143;
            
            {ESLVal l2 = $144;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v299 = _v37;
            
            {ESLVal _v300 = _v36;
            
            return error(new ESLVal("TypeError",_v296,new ESLVal("incomptible types for *: ").add(ppType.apply(_v299,_v290).add(new ESLVal(" and ").add(ppType.apply(_v300,_v290))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $140 = _v37.termRef(0);
          
          switch(_v36.termName) {
          case "FloatType": {ESLVal $142 = _v36.termRef(0);
            
            {ESLVal l1 = $140;
            
            {ESLVal l2 = $142;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $141 = _v36.termRef(0);
            
            {ESLVal l1 = $140;
            
            {ESLVal l2 = $141;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v297 = _v37;
            
            {ESLVal _v298 = _v36;
            
            return error(new ESLVal("TypeError",_v296,new ESLVal("incomptible types for *: ").add(ppType.apply(_v297,_v290).add(new ESLVal(" and ").add(ppType.apply(_v298,_v290))))));
          }
          }
        }
        }
        default: {ESLVal _v301 = _v37;
          
          {ESLVal _v302 = _v36;
          
          return error(new ESLVal("TypeError",_v296,new ESLVal("incomptible types for *: ").add(ppType.apply(_v301,_v290).add(new ESLVal(" and ").add(ppType.apply(_v302,_v290))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v283 = $args[0];
  ESLVal _v282 = $args[1];
  ESLVal _v281 = $args[2];
  ESLVal _v280 = $args[3];
  ESLVal _v279 = $args[4];
  ESLVal _v278 = $args[5];
  ESLVal _v277 = $args[6];
  {ESLVal t1 = expType.apply(_v282,_v280,_v279,_v278,_v277);
        ESLVal t2 = expType.apply(_v281,_v280,_v279,_v278,_v277);
        
        {ESLVal _v35 = t1;
        ESLVal _v34 = t2;
        
        switch(_v35.termName) {
        case "IntType": {ESLVal $137 = _v35.termRef(0);
          
          switch(_v34.termName) {
          case "IntType": {ESLVal $139 = _v34.termRef(0);
            
            {ESLVal l1 = $137;
            
            {ESLVal l2 = $139;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $138 = _v34.termRef(0);
            
            {ESLVal l1 = $137;
            
            {ESLVal l2 = $138;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v286 = _v35;
            
            {ESLVal _v287 = _v34;
            
            return error(new ESLVal("TypeError",_v283,new ESLVal("incomptible types for -: ").add(ppType.apply(_v286,_v277).add(new ESLVal(" and ").add(ppType.apply(_v287,_v277))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $134 = _v35.termRef(0);
          
          switch(_v34.termName) {
          case "FloatType": {ESLVal $136 = _v34.termRef(0);
            
            {ESLVal l1 = $134;
            
            {ESLVal l2 = $136;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $135 = _v34.termRef(0);
            
            {ESLVal l1 = $134;
            
            {ESLVal l2 = $135;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v284 = _v35;
            
            {ESLVal _v285 = _v34;
            
            return error(new ESLVal("TypeError",_v283,new ESLVal("incomptible types for -: ").add(ppType.apply(_v284,_v277).add(new ESLVal(" and ").add(ppType.apply(_v285,_v277))))));
          }
          }
        }
        }
        default: {ESLVal _v288 = _v35;
          
          {ESLVal _v289 = _v34;
          
          return error(new ESLVal("TypeError",_v283,new ESLVal("incomptible types for -: ").add(ppType.apply(_v288,_v277).add(new ESLVal(" and ").add(ppType.apply(_v289,_v277))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v252 = $args[0];
  ESLVal _v251 = $args[1];
  ESLVal _v250 = $args[2];
  ESLVal _v249 = $args[3];
  ESLVal _v248 = $args[4];
  ESLVal _v247 = $args[5];
  ESLVal _v246 = $args[6];
  {ESLVal t1 = expType.apply(_v251,_v249,_v248,_v247,_v246);
        ESLVal t2 = expType.apply(_v250,_v249,_v248,_v247,_v246);
        
        {ESLVal _v33 = t1;
        ESLVal _v32 = t2;
        
        switch(_v33.termName) {
        case "StrType": {ESLVal $133 = _v33.termRef(0);
          
          {ESLVal _v271 = $133;
          
          {ESLVal _v272 = _v32;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $131 = _v33.termRef(0);
          
          switch(_v32.termName) {
          case "IntType": {ESLVal $132 = _v32.termRef(0);
            
            {ESLVal l1 = $131;
            
            {ESLVal l2 = $132;
            
            return t1;
          }
          }
          }
          default: switch(_v32.termName) {
            case "StrType": {ESLVal $124 = _v32.termRef(0);
              
              {ESLVal _v267 = _v33;
              
              {ESLVal _v268 = $124;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v269 = _v33;
              
              {ESLVal _v270 = _v32;
              
              return error(new ESLVal("TypeError",_v252,new ESLVal("incomptible types for +: ").add(ppType.apply(_v269,_v246).add(new ESLVal(" and ").add(ppType.apply(_v270,_v246))))));
            }
            }
          }
        }
        }
      case "FloatType": {ESLVal $129 = _v33.termRef(0);
          
          switch(_v32.termName) {
          case "FloatType": {ESLVal $130 = _v32.termRef(0);
            
            {ESLVal l1 = $129;
            
            {ESLVal l2 = $130;
            
            return t1;
          }
          }
          }
          default: switch(_v32.termName) {
            case "StrType": {ESLVal $124 = _v32.termRef(0);
              
              {ESLVal _v263 = _v33;
              
              {ESLVal _v264 = $124;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v265 = _v33;
              
              {ESLVal _v266 = _v32;
              
              return error(new ESLVal("TypeError",_v252,new ESLVal("incomptible types for +: ").add(ppType.apply(_v265,_v246).add(new ESLVal(" and ").add(ppType.apply(_v266,_v246))))));
            }
            }
          }
        }
        }
      case "ListType": {ESLVal $126 = _v33.termRef(0);
          ESLVal $125 = _v33.termRef(1);
          
          switch(_v32.termName) {
          case "ListType": {ESLVal $128 = _v32.termRef(0);
            ESLVal $127 = _v32.termRef(1);
            
            {ESLVal l1 = $126;
            
            {ESLVal _v253 = $125;
            
            {ESLVal l2 = $128;
            
            {ESLVal _v254 = $127;
            
            if(typeEqual.apply(_v253,_v254).boolVal)
            return new ESLVal("ListType",l1,_v253);
            else
              switch(_v32.termName) {
                case "StrType": {ESLVal $124 = _v32.termRef(0);
                  
                  {ESLVal _v255 = _v33;
                  
                  {ESLVal _v256 = $124;
                  
                  return _v254;
                }
                }
                }
                default: {ESLVal _v257 = _v33;
                  
                  {ESLVal _v258 = _v32;
                  
                  return error(new ESLVal("TypeError",_v252,new ESLVal("incomptible types for +: ").add(ppType.apply(_v257,_v246).add(new ESLVal(" and ").add(ppType.apply(_v258,_v246))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v32.termName) {
            case "StrType": {ESLVal $124 = _v32.termRef(0);
              
              {ESLVal _v259 = _v33;
              
              {ESLVal _v260 = $124;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v261 = _v33;
              
              {ESLVal _v262 = _v32;
              
              return error(new ESLVal("TypeError",_v252,new ESLVal("incomptible types for +: ").add(ppType.apply(_v261,_v246).add(new ESLVal(" and ").add(ppType.apply(_v262,_v246))))));
            }
            }
          }
        }
        }
        default: switch(_v32.termName) {
          case "StrType": {ESLVal $124 = _v32.termRef(0);
            
            {ESLVal _v273 = _v33;
            
            {ESLVal _v274 = $124;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v275 = _v33;
            
            {ESLVal _v276 = _v32;
            
            return error(new ESLVal("TypeError",_v252,new ESLVal("incomptible types for +: ").add(ppType.apply(_v275,_v246).add(new ESLVal(" and ").add(ppType.apply(_v276,_v246))))));
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
      ESLVal _v241 = $args[0];
  ESLVal _v240 = $args[1];
  ESLVal _v239 = $args[2];
  ESLVal _v238 = $args[3];
  ESLVal _v237 = $args[4];
  ESLVal _v236 = $args[5];
  ESLVal _v235 = $args[6];
  {ESLVal _v243 = substTypesEnv.apply(_v235,_v239);
        ESLVal _v242 = expType.apply(_v240,_v238,_v237,_v236,_v235);
        
        {ESLVal _v31 = _v242;
        
        switch(_v31.termName) {
        case "ForallType": {ESLVal $123 = _v31.termRef(0);
          ESLVal $122 = _v31.termRef(1);
          ESLVal $121 = _v31.termRef(2);
          
          {ESLVal l1 = $123;
          
          {ESLVal ns = $122;
          
          {ESLVal _v244 = $121;
          
          if(length.apply(ns).eql(length.apply(_v243)).boolVal)
          {ESLVal env = zipTypeEnv.apply(ns,_v243);
            
            return substTypeEnv.apply(env.add(_v237),_v244);
          }
          else
            return error(new ESLVal("TypeError",_v241,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v243))))));
        }
        }
        }
        }
        default: {ESLVal _v245 = _v31;
          
          return error(new ESLVal("TypeError",_v241,new ESLVal("expecting a universal type: ").add(_v245)));
        }
      }
      }
      }
    }
  });
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v234 = $args[0];
  ESLVal _v233 = $args[1];
  ESLVal _v232 = $args[2];
  ESLVal _v231 = $args[3];
  ESLVal _v230 = $args[4];
  return map.apply(new ESLVal(new Function(new ESLVal("fun632"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expType.apply(e,_v233,_v232,_v231,_v230);
          }
        }),_v234);
    }
  });
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v229 = $args[0];
  ESLVal _v228 = $args[1];
  ESLVal _v227 = $args[2];
  ESLVal _v226 = $args[3];
  ESLVal _v225 = $args[4];
  ESLVal _v224 = $args[5];
  ESLVal _v223 = $args[6];
  {ESLVal _v30 = typeNF.apply(expType.apply(_v228,_v226,_v225,_v224,_v223),_v223);
        
        switch(_v30.termName) {
        case "FunType": {ESLVal $120 = _v30.termRef(0);
          ESLVal $119 = _v30.termRef(1);
          ESLVal $118 = _v30.termRef(2);
          
          {ESLVal l1 = $120;
          
          {ESLVal domain = $119;
          
          {ESLVal range = $118;
          
          {ESLVal supplied = expTypes.apply(_v227,_v226,_v225,_v224,_v223);
          
          if(length.apply(domain).eql(length.apply(supplied)).boolVal)
          if(subTypes.apply(supplied,domain).boolVal)
            return range;
            else
              return error(new ESLVal("TypeError",_v229,new ESLVal("supplied argument types ").add(ppTypes.apply(supplied,_v223).add(new ESLVal(" do not match function domain ").add(ppTypes.apply(domain,_v223))))));
          else
            return error(new ESLVal("TypeError",_v229,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
        }
        }
        }
        }
        }
        default: {ESLVal t = _v30;
          
          return error(new ESLVal("TypeError",_v229,new ESLVal("unknown type for apply: ").add(ppType.apply(t,_v223))));
        }
      }
      }
    }
  });
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v222 = $args[0];
  ESLVal _v221 = $args[1];
  ESLVal _v220 = $args[2];
  ESLVal _v219 = $args[3];
  ESLVal _v218 = $args[4];
  ESLVal _v217 = $args[5];
  ESLVal _v216 = $args[6];
  ESLVal _v215 = $args[7];
  {ESLVal testType = expType.apply(_v221,_v218,_v217,_v216,_v215);
        
        if(isBoolType.apply(testType).boolVal)
        {ESLVal conseqType = expType.apply(_v220,_v218,_v217,_v216,_v215);
          ESLVal altType = expType.apply(_v219,_v218,_v217,_v216,_v215);
          
          if(typeEqual.apply(conseqType,altType).boolVal)
          return conseqType;
          else
            return error(new ESLVal("TypeError",_v222,new ESLVal("conseq and alt types do not agree: ").add(ppType.apply(conseqType,_v215).add(new ESLVal(" ").add(ppType.apply(altType,_v215))))));
        }
        else
          return error(new ESLVal("if expects a bool ").add(ppType.apply(testType,_v215)));
      }
    }
  });
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  {ESLVal _v28 = ds;
        
        if(_v28.isCons())
        {ESLVal $116 = _v28.head();
          ESLVal $117 = _v28.tail();
          
          {ESLVal d = $116;
          
          {ESLVal _v213 = $117;
          
          if(member.apply(decName.apply(d),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v29 = $qualArg;
              
              {ESLVal _v214 = _v29;
              
              return ESLVal.list(ESLVal.list(decName.apply(_v214)));
            }
            }
          }
        }).map(_v213).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",decLoc.apply(d),new ESLVal(" duplicate argument ").add(decName.apply(d))));
          else
            return checkDecs.apply(_v213);
        }
        }
        }
      else if(_v28.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(60277,60510)").add(ESLVal.list(_v28)));
      }
    }
  });
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v210 = $args[0];
  ESLVal _v209 = $args[1];
  ESLVal _v208 = $args[2];
  ESLVal _v207 = $args[3];
  ESLVal _v206 = $args[4];
  ESLVal _v205 = $args[5];
  ESLVal _v204 = $args[6];
  ESLVal _v203 = $args[7];
  ESLVal _v202 = $args[8];
  {checkDecs.apply(_v208);
      {ESLVal nType = expType.apply(_v209,_v205,_v204,_v203,_v202);
        
        if(isStrType.apply(nType).boolVal)
        {ESLVal declaredType = substTypeEnv.apply(_v202,_v207);
          
          return decTypes.apply(_v208,_v204,_v202,new ESLVal(new Function(new ESLVal("fun633"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v212 = $args[0];
          ESLVal _v211 = $args[1];
          {ESLVal actualRange = expType.apply(_v206,_v205,_v211,_v203,_v202);
                
                if(subType.apply(new ESLVal("FunType",_v210,_v212,actualRange),declaredType).boolVal)
                return new ESLVal("FunType",_v210,_v212,actualRange);
                else
                  return error(new ESLVal("TypeError",_v210,new ESLVal("function declared type ").add(ppType.apply(declaredType,_v202).add(new ESLVal(" but is ").add(ppType.apply(new ESLVal("FunType",_v210,_v212,actualRange),_v202))))));
              }
            }
          }));
        }
        else
          return error(new ESLVal("TypeError",_v210,new ESLVal("expecting a string for a function name: ").add(_v209)));
      }}
    }
  });
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v198 = $args[0];
  ESLVal _v197 = $args[1];
  ESLVal _v196 = $args[2];
  ESLVal _v195 = $args[3];
  LetRec letrec = new LetRec() {
        ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v200 = $args[0];
          ESLVal _v199 = $args[1];
          {ESLVal _v27 = _v200;
                
                if(_v27.isCons())
                {ESLVal $110 = _v27.head();
                  ESLVal $111 = _v27.tail();
                  
                  switch($110.termName) {
                  case "Dec": {ESLVal $115 = $110.termRef(0);
                    ESLVal $114 = $110.termRef(1);
                    ESLVal $113 = $110.termRef(2);
                    ESLVal $112 = $110.termRef(3);
                    
                    {ESLVal l = $115;
                    
                    {ESLVal n = $114;
                    
                    {ESLVal t = $113;
                    
                    {ESLVal st = $112;
                    
                    {ESLVal _v201 = $111;
                    
                    return processDecs.apply(_v201,_v199.cons(new ESLVal("Map",n,substTypeEnv.apply(_v196,t))));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(61703,61928)").add(ESLVal.list(_v27)));
                }
                }
              else if(_v27.isNil())
                return _v195.apply(reverse.apply(typeEnvRan.apply(_v199)),_v199.add(_v197));
              else return error(new ESLVal("case error at Pos(61703,61928)").add(ESLVal.list(_v27)));
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
      
        return processDecs.apply(_v198,$nil);
      
    }
  });
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v194 = $args[0];
  ESLVal _v193 = $args[1];
  ESLVal _v192 = $args[2];
  ESLVal _v191 = $args[3];
  ESLVal _v190 = $args[4];
  ESLVal _v189 = $args[5];
  ESLVal _v188 = $args[6];
  ESLVal _v187 = $args[7];
  {ESLVal t0 = lookupType.apply(_v193,_v188);
        
        if(t0.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v194,new ESLVal("cannot find cnstr ").add(_v193)));
        else
          {ESLVal t = unfoldIf.apply(t0);
            
            return termTypeCheckUnion.apply(t,_v194,_v193,_v192,_v191,_v190,_v189,_v188,_v187);
          }
      }
    }
  });
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v184 = $args[0];
  ESLVal _v183 = $args[1];
  ESLVal _v182 = $args[2];
  ESLVal _v181 = $args[3];
  ESLVal _v180 = $args[4];
  ESLVal _v179 = $args[5];
  ESLVal _v178 = $args[6];
  ESLVal _v177 = $args[7];
  ESLVal _v176 = $args[8];
  if(_v184.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v183,new ESLVal("cannot find constructor ").add(_v182)));
        else
          {ESLVal _v25 = _v184;
            
            switch(_v25.termName) {
            case "TypeFun": {ESLVal $107 = _v25.termRef(0);
              ESLVal $106 = _v25.termRef(1);
              ESLVal $105 = _v25.termRef(2);
              
              {ESLVal lf = $107;
              
              {ESLVal ns = $106;
              
              {ESLVal body = $105;
              
              if(length.apply(ns).eql(length.apply(_v181)).boolVal)
              {ESLVal args = map.apply(new ESLVal(new Function(new ESLVal("fun634"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v185 = $args[0];
                  return substTypeEnv.apply(_v176,_v185);
                    }
                  }),_v181);
                
                {ESLVal _v26 = substTypeEnv.apply(zipTypeEnv.apply(ns,args),body);
                
                switch(_v26.termName) {
                case "UnionType": {ESLVal $109 = _v26.termRef(0);
                  ESLVal $108 = _v26.termRef(1);
                  
                  {ESLVal l1 = $109;
                  
                  {ESLVal terms = $108;
                  
                  {ESLVal ts2 = findTermArgTypes.apply(_v182,terms);
                  
                  if(length.apply(_v180).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v183,_v180,ts2,_v179,_v178,_v177,_v176);
                  return new ESLVal("UnionType",l1,terms);}
                  else
                    return error(_v182.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v180))))));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(62801,63351)").add(ESLVal.list(_v26)));
              }
              }
              }
              else
                return error(new ESLVal("TypeError",_v183,new ESLVal("generic constructor ").add(_v182.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(_v181))))))));
            }
            }
            }
            }
          case "UnionType": {ESLVal $104 = _v25.termRef(0);
              ESLVal $103 = _v25.termRef(1);
              
              {ESLVal l1 = $104;
              
              {ESLVal terms = $103;
              
              {ESLVal ts2 = findTermArgTypes.apply(_v182,terms);
              
              if(length.apply(_v181).neql($zero).boolVal)
              return error(new ESLVal("TypeError",_v183,new ESLVal("generic application of non-generic constructior: ").add(_v182)));
              else
                if(length.apply(_v180).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v183,_v180,ts2,_v179,_v178,_v177,_v176);
                  return _v184;}
                  else
                    return error(_v182.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v180))))));
            }
            }
            }
            }
            default: {ESLVal _v186 = _v25;
              
              return error(new ESLVal("TypeError",_v183,new ESLVal("expecting a union type for ").add(_v182.add(new ESLVal(" but got ").add(ppType.apply(_v186,_v176))))));
            }
          }
          }
    }
  });
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v24 = t;
        
        switch(_v24.termName) {
        case "RecType": {ESLVal $102 = _v24.termRef(0);
          ESLVal $101 = _v24.termRef(1);
          ESLVal $100 = _v24.termRef(2);
          
          {ESLVal l = $102;
          
          {ESLVal n = $101;
          
          {ESLVal _v174 = $100;
          
          return unfoldIf.apply(unfoldType.apply(l,n,_v174));
        }
        }
        }
        }
        default: {ESLVal _v175 = _v24;
          
          return _v175;
        }
      }
      }
    }
  });
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal terms = $args[1];
  {ESLVal _v23 = terms;
        
        if(_v23.isCons())
        {ESLVal $95 = _v23.head();
          ESLVal $96 = _v23.tail();
          
          switch($95.termName) {
          case "TermType": {ESLVal $99 = $95.termRef(0);
            ESLVal $98 = $95.termRef(1);
            ESLVal $97 = $95.termRef(2);
            
            {ESLVal l = $99;
            
            {ESLVal nn = $98;
            
            {ESLVal ts = $97;
            
            {ESLVal _v172 = $96;
            
            if(nn.eql(n).boolVal)
            return ts;
            else
              {ESLVal t = $95;
                
                {ESLVal _v173 = $96;
                
                return findTermArgTypes.apply(n,_v173);
              }
              }
          }
          }
          }
          }
          }
          default: {ESLVal t = $95;
            
            {ESLVal ts = $96;
            
            return findTermArgTypes.apply(n,ts);
          }
          }
        }
        }
      else if(_v23.isNil())
        return error(new ESLVal("cannot find constructor ").add(n));
      else return error(new ESLVal("case error at Pos(64347,64547)").add(ESLVal.list(_v23)));
      }
    }
  });
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v169 = $args[0];
  ESLVal _v168 = $args[1];
  ESLVal _v167 = $args[2];
  ESLVal _v166 = $args[3];
  ESLVal _v165 = $args[4];
  ESLVal _v164 = $args[5];
  ESLVal _v163 = $args[6];
  {ESLVal _v22 = _v168;
        ESLVal _v21 = _v167;
        
        if(_v22.isCons())
        {ESLVal $89 = _v22.head();
          ESLVal $90 = _v22.tail();
          
          if(_v21.isCons())
          {ESLVal $91 = _v21.head();
            ESLVal $92 = _v21.tail();
            
            {ESLVal e = $89;
            
            {ESLVal _v170 = $90;
            
            {ESLVal t = $91;
            
            {ESLVal _v171 = $92;
            
            {ESLVal tt = expType.apply(e,_v166,_v165,_v164,_v163);
            
            if(typeEqual.apply(t,tt).boolVal)
            return checkTermArgTypes.apply(_v169,_v170,_v171,_v166,_v165,_v164,_v163);
            else
              return error(new ESLVal("TypeError",_v169,new ESLVal("expected constructor arg type ").add(ppType.apply(t,_v163).add(new ESLVal(" but supplied ").add(ppType.apply(tt,_v163))))));
          }
          }
          }
          }
          }
          }
        else if(_v21.isNil())
          return error(new ESLVal("case error at Pos(64665,65087)").add(ESLVal.list(_v22,_v21)));
        else return error(new ESLVal("case error at Pos(64665,65087)").add(ESLVal.list(_v22,_v21)));
        }
      else if(_v22.isNil())
        if(_v21.isCons())
          {ESLVal $93 = _v21.head();
            ESLVal $94 = _v21.tail();
            
            return error(new ESLVal("case error at Pos(64665,65087)").add(ESLVal.list(_v22,_v21)));
          }
        else if(_v21.isNil())
          return $null;
        else return error(new ESLVal("case error at Pos(64665,65087)").add(ESLVal.list(_v22,_v21)));
      else return error(new ESLVal("case error at Pos(64665,65087)").add(ESLVal.list(_v22,_v21)));
      }
    }
  });
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v161 = $args[0];
  ESLVal _v160 = $args[1];
  ESLVal _v159 = $args[2];
  ESLVal _v158 = $args[3];
  ESLVal _v157 = $args[4];
  ESLVal _v156 = $args[5];
  {ESLVal _v20 = expType.apply(_v160,_v159,_v158,_v157,_v156);
        
        switch(_v20.termName) {
        case "BoolType": {ESLVal $88 = _v20.termRef(0);
          
          {ESLVal _v162 = $88;
          
          return new ESLVal("BoolType",_v162);
        }
        }
        default: {ESLVal t = _v20;
          
          return error(new ESLVal("TypeError",_v161,new ESLVal("expecting a boolean: ").add(ppType.apply(t,_v156))));
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
          {ESLVal _v19 = t;
            
            switch(_v19.termName) {
            case "TypeClosure": {ESLVal $87 = _v19.termRef(0);
              
              {ESLVal f = $87;
              
              return f.apply();
            }
            }
            default: {ESLVal _v155 = _v19;
              
              return _v155;
            }
          }
          }
      }
    }
  });
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v154 = $args[0];
  ESLVal _v153 = $args[1];
  ESLVal _v152 = $args[2];
  ESLVal _v151 = $args[3];
  ESLVal _v150 = $args[4];
  ESLVal _v149 = $args[5];
  {ESLVal[] t = new ESLVal[]{new ESLVal("VoidType",_v154)};
        
        {{
        ESLVal _v18 = _v153;
        while(_v18.isCons()) {
          ESLVal e = _v18.headVal;
          t[0] = expType.apply(e,_v152,_v151,_v150,_v149);
          _v18 = _v18.tailVal;}
      }
      return t[0];}
      }
    }
  });
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v148 = $args[0];
  ESLVal _v147 = $args[1];
  ESLVal _v146 = $args[2];
  ESLVal _v145 = $args[3];
  ESLVal _v144 = $args[4];
  ESLVal _v143 = $args[5];
  if(_v147.eql($nil).boolVal)
        return new ESLVal("ForallType",_v148,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v148,new ESLVal("VarType",_v148,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun635"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v146,_v145,_v144,_v143);
                }
              }),_v147);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("ListType",_v148,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v148,new ESLVal("lists should have elements of the same type: ").add(_v147)));
          }
    }
  });
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v141 = $args[0];
          {ESLVal[] e = new ESLVal[]{$null};
                
                {ESLVal fenv = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v16 = $qualArg;
                        
                        {ESLVal t = _v16;
                        
                        return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v142 = $args[0];
                        {ESLVal _v17 = _v142;
                              
                              {ESLVal n = _v17;
                              
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
                  }).map(typeEnvRan.apply(_v141)).flatten().flatten();
                
                {ESLVal env1 = substOnce.apply(_v141,fenv);
                
                {e[0] = env1;
              return env1;}
              }
              }
              }
            }
          });
        ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v140 = $args[0];
          {ESLVal _v15 = _v140;
                
                if(_v15.isCons())
                {ESLVal $83 = _v15.head();
                  ESLVal $84 = _v15.tail();
                  
                  switch($83.termName) {
                  case "Map": {ESLVal $86 = $83.termRef(0);
                    ESLVal $85 = $83.termRef(1);
                    
                    {ESLVal n = $86;
                    
                    {ESLVal t = $85;
                    
                    {ESLVal e = $84;
                    
                    if(member.apply(n,typeFV.apply(t)).boolVal)
                    return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecType",p0,n,t)));
                    else
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,t));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(66708,66934)").add(ESLVal.list(_v15)));
                }
                }
              else if(_v15.isNil())
                return _v140;
              else return error(new ESLVal("case error at Pos(66708,66934)").add(ESLVal.list(_v15)));
              }
            }
          });
        ESLVal substOnce = new ESLVal(new Function(new ESLVal("substOnce"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v138 = $args[0];
          ESLVal _v137 = $args[1];
          {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  {ESLVal _v13 = m;
                        
                        switch(_v13.termName) {
                        case "Map": {ESLVal $82 = _v13.termRef(0);
                          ESLVal $81 = _v13.termRef(1);
                          
                          {ESLVal n = $82;
                          
                          {ESLVal t = $81;
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $qualArg = $args[0];
                          {ESLVal _v14 = $qualArg;
                                
                                {ESLVal _v139 = _v14;
                                
                                return ESLVal.list(ESLVal.list(new ESLVal("Map",_v139,lookupType.apply(_v139,_v137))));
                              }
                              }
                            }
                          }).map(typeFV.apply(t)).flatten().flatten(),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(67044,67175)").add(ESLVal.list(_v13)));
                      }
                      }
                    }
                  });
                
                return map.apply(map1,_v138);
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "fixEnv": return fixEnv;
            
            case "introduceRecTypes": return introduceRecTypes;
            
            case "substOnce": return substOnce;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal fixEnv = letrec.get("fixEnv");
      
      ESLVal introduceRecTypes = letrec.get("introduceRecTypes");
      
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
        case "VarType": {ESLVal $80 = _v12.termRef(0);
          ESLVal $79 = _v12.termRef(1);
          
          {ESLVal l = $80;
          
          {ESLVal n = $79;
          
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
        {ESLVal $77 = _v11.head();
          ESLVal $78 = _v11.tail();
          
          {ESLVal d = $77;
          
          {ESLVal ds = $78;
          
          return tdecFV1.apply(d,tdecsFV1.apply(ds,fv));
        }
        }
        }
      else if(_v11.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(67561,67650)").add(ESLVal.list(_v11)));
      }
    }
  });
  private static ESLVal tdecFV1 = new ESLVal(new Function(new ESLVal("tdecFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v10 = d;
        
        switch(_v10.termName) {
        case "Dec": {ESLVal $76 = _v10.termRef(0);
          ESLVal $75 = _v10.termRef(1);
          ESLVal $74 = _v10.termRef(2);
          ESLVal $73 = _v10.termRef(3);
          
          {ESLVal l = $76;
          
          {ESLVal n = $75;
          
          {ESLVal t = $74;
          
          {ESLVal st = $73;
          
          return typeFV1.apply(t,fv);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(67694,67773)").add(ESLVal.list(_v10)));
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
        {ESLVal $71 = _v9.head();
          ESLVal $72 = _v9.tail();
          
          {ESLVal m = $71;
          
          {ESLVal hs = $72;
          
          return handlerFV1.apply(m,handlersFV1.apply(hs,fv));
        }
        }
        }
      else if(_v9.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(67831,67933)").add(ESLVal.list(_v9)));
      }
    }
  });
  private static ESLVal handlerFV1 = new ESLVal(new Function(new ESLVal("handlerFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v8 = m;
        
        switch(_v8.termName) {
        case "MessageType": {ESLVal $70 = _v8.termRef(0);
          ESLVal $69 = _v8.termRef(1);
          
          {ESLVal l = $70;
          
          {ESLVal ts = $69;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(67981,68057)").add(ESLVal.list(_v8)));
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
        {ESLVal $67 = _v7.head();
          ESLVal $68 = _v7.tail();
          
          {ESLVal t = $67;
          
          {ESLVal _v136 = $68;
          
          return typeFV1.apply(t,typesFV1.apply(_v136,fv));
        }
        }
        }
      else if(_v7.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(68106,68193)").add(ESLVal.list(_v7)));
      }
    }
  });
  private static ESLVal typeFV1 = new ESLVal(new Function(new ESLVal("typeFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v3 = t;
        
        switch(_v3.termName) {
        case "ArrayType": {ESLVal $60 = _v3.termRef(0);
          ESLVal $59 = _v3.termRef(1);
          
          {ESLVal l = $60;
          
          {ESLVal _v135 = $59;
          
          return typeFV1.apply(_v135,fv);
        }
        }
        }
      case "ActType": {ESLVal $58 = _v3.termRef(0);
          ESLVal $57 = _v3.termRef(1);
          ESLVal $56 = _v3.termRef(2);
          
          {ESLVal l = $58;
          
          {ESLVal decs = $57;
          
          {ESLVal handlers = $56;
          
          return tdecsFV1.apply(decs,handlersFV1.apply(handlers,fv));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $55 = _v3.termRef(0);
          ESLVal $54 = _v3.termRef(1);
          ESLVal $53 = _v3.termRef(2);
          ESLVal $52 = _v3.termRef(3);
          
          {ESLVal l = $55;
          
          {ESLVal parent = $54;
          
          {ESLVal decs = $53;
          
          {ESLVal handlers = $52;
          
          return tdecsFV1.apply(decs,handlersFV1.apply(handlers,typeFV1.apply(parent,fv)));
        }
        }
        }
        }
        }
      case "ApplyType": {ESLVal $51 = _v3.termRef(0);
          ESLVal $50 = _v3.termRef(1);
          ESLVal $49 = _v3.termRef(2);
          
          {ESLVal l = $51;
          
          {ESLVal n = $50;
          
          {ESLVal types = $49;
          
          return typesFV1.apply(types,fv.cons(new ESLVal("VarType",l,n)));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $48 = _v3.termRef(0);
          ESLVal $47 = _v3.termRef(1);
          ESLVal $46 = _v3.termRef(2);
          
          {ESLVal l = $48;
          
          {ESLVal op = $47;
          
          {ESLVal args = $46;
          
          return typesFV1.apply(args,typeFV1.apply(op,fv));
        }
        }
        }
        }
      case "BoolType": {ESLVal $45 = _v3.termRef(0);
          
          {ESLVal l = $45;
          
          return fv;
        }
        }
      case "FieldType": {ESLVal $44 = _v3.termRef(0);
          ESLVal $43 = _v3.termRef(1);
          ESLVal $42 = _v3.termRef(2);
          
          {ESLVal l = $44;
          
          {ESLVal n = $43;
          
          {ESLVal _v134 = $42;
          
          return typeFV1.apply(_v134,fv);
        }
        }
        }
        }
      case "FloatType": {ESLVal $41 = _v3.termRef(0);
          
          {ESLVal l = $41;
          
          return fv;
        }
        }
      case "ForallType": {ESLVal $40 = _v3.termRef(0);
          ESLVal $39 = _v3.termRef(1);
          ESLVal $38 = _v3.termRef(2);
          
          {ESLVal l = $40;
          
          {ESLVal ns = $39;
          
          {ESLVal _v131 = $38;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun636"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v132 = $args[0];
          {ESLVal _v6 = _v132;
                
                switch(_v6.termName) {
                case "VarType": {ESLVal $66 = _v6.termRef(0);
                  ESLVal $65 = _v6.termRef(1);
                  
                  {ESLVal _v133 = $66;
                  
                  {ESLVal n = $65;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(69032,69092)").add(ESLVal.list(_v6)));
              }
              }
            }
          }),typeFV1.apply(_v131,$nil)).add(fv);
        }
        }
        }
        }
      case "FunType": {ESLVal $37 = _v3.termRef(0);
          ESLVal $36 = _v3.termRef(1);
          ESLVal $35 = _v3.termRef(2);
          
          {ESLVal l = $37;
          
          {ESLVal d = $36;
          
          {ESLVal r = $35;
          
          return typesFV1.apply(d,typeFV1.apply(r,fv));
        }
        }
        }
        }
      case "IntType": {ESLVal $34 = _v3.termRef(0);
          
          {ESLVal l = $34;
          
          return fv;
        }
        }
      case "ListType": {ESLVal $33 = _v3.termRef(0);
          ESLVal $32 = _v3.termRef(1);
          
          {ESLVal l = $33;
          
          {ESLVal _v130 = $32;
          
          return typeFV1.apply(_v130,fv);
        }
        }
        }
      case "BagType": {ESLVal $31 = _v3.termRef(0);
          ESLVal $30 = _v3.termRef(1);
          
          {ESLVal l = $31;
          
          {ESLVal _v129 = $30;
          
          return typeFV1.apply(_v129,fv);
        }
        }
        }
      case "SetType": {ESLVal $29 = _v3.termRef(0);
          ESLVal $28 = _v3.termRef(1);
          
          {ESLVal l = $29;
          
          {ESLVal _v128 = $28;
          
          return typeFV1.apply(_v128,fv);
        }
        }
        }
      case "NullType": {ESLVal $27 = _v3.termRef(0);
          
          {ESLVal l = $27;
          
          return fv;
        }
        }
      case "RecordType": {ESLVal $26 = _v3.termRef(0);
          ESLVal $25 = _v3.termRef(1);
          
          {ESLVal l = $26;
          
          {ESLVal fs = $25;
          
          return typesFV1.apply(fs,fv);
        }
        }
        }
      case "RecType": {ESLVal $24 = _v3.termRef(0);
          ESLVal $23 = _v3.termRef(1);
          ESLVal $22 = _v3.termRef(2);
          
          {ESLVal l = $24;
          
          {ESLVal a = $23;
          
          {ESLVal _v125 = $22;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun637"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v126 = $args[0];
          {ESLVal _v5 = _v126;
                
                switch(_v5.termName) {
                case "VarType": {ESLVal $64 = _v5.termRef(0);
                  ESLVal $63 = _v5.termRef(1);
                  
                  {ESLVal _v127 = $64;
                  
                  {ESLVal n = $63;
                  
                  return n.eql(a).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(69508,69556)").add(ESLVal.list(_v5)));
              }
              }
            }
          }),typeFV1.apply(_v125,$nil)).add(fv);
        }
        }
        }
        }
      case "StrType": {ESLVal $21 = _v3.termRef(0);
          
          {ESLVal l = $21;
          
          return fv;
        }
        }
      case "TableType": {ESLVal $20 = _v3.termRef(0);
          ESLVal $19 = _v3.termRef(1);
          ESLVal $18 = _v3.termRef(2);
          
          {ESLVal l = $20;
          
          {ESLVal k = $19;
          
          {ESLVal v = $18;
          
          return typeFV1.apply(k,typeFV1.apply(v,fv));
        }
        }
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
          
          {ESLVal _v122 = $11;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun638"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v123 = $args[0];
          {ESLVal _v4 = _v123;
                
                switch(_v4.termName) {
                case "VarType": {ESLVal $62 = _v4.termRef(0);
                  ESLVal $61 = _v4.termRef(1);
                  
                  {ESLVal _v124 = $62;
                  
                  {ESLVal n = $61;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(69852,69912)").add(ESLVal.list(_v4)));
              }
              }
            }
          }),typeFV1.apply(_v122,$nil)).add(fv);
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $10 = _v3.termRef(0);
          ESLVal $9 = _v3.termRef(1);
          
          {ESLVal l = $10;
          
          {ESLVal _v121 = $9;
          
          return typeFV1.apply(_v121,fv);
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
          
          {ESLVal _v120 = $2;
          
          {ESLVal n = $1;
          
          return typeFV1.apply(_v120,fv);
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
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
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