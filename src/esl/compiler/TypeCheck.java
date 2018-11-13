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
  {ESLVal _v123 = p;
        
        switch(_v123.termName) {
        case "PAdd": {ESLVal $814 = _v123.termRef(0);
          ESLVal $813 = _v123.termRef(1);
          ESLVal $812 = _v123.termRef(2);
          
          {ESLVal l = $814;
          
          {ESLVal p1 = $813;
          
          {ESLVal p2 = $812;
          
          return ppPattern.apply(p1).add(new ESLVal(" + ").add(ppPattern.apply(p2)));
        }
        }
        }
        }
      case "PVar": {ESLVal $811 = _v123.termRef(0);
          ESLVal $810 = _v123.termRef(1);
          ESLVal $809 = _v123.termRef(2);
          
          {ESLVal l = $811;
          
          {ESLVal n = $810;
          
          {ESLVal t = $809;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $806 = _v123.termRef(0);
          ESLVal $805 = _v123.termRef(1);
          ESLVal $804 = _v123.termRef(2);
          ESLVal $803 = _v123.termRef(3);
          
          if($804.isCons())
          {ESLVal $807 = $804.head();
            ESLVal $808 = $804.tail();
            
            {ESLVal l = $806;
            
            {ESLVal n = $805;
            
            {ESLVal ts = $804;
            
            {ESLVal ps = $803;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
          }
        else if($804.isNil())
          {ESLVal l = $806;
            
            {ESLVal n = $805;
            
            {ESLVal ps = $803;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $806;
            
            {ESLVal n = $805;
            
            {ESLVal ts = $804;
            
            {ESLVal ps = $803;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $802 = _v123.termRef(0);
          ESLVal $801 = _v123.termRef(1);
          ESLVal $800 = _v123.termRef(2);
          
          {ESLVal l = $802;
          
          {ESLVal _v1034 = $801;
          
          {ESLVal ts = $800;
          
          return ppPattern.apply(_v1034).add(ppTypes.apply(ts,ESLVal.list()));
        }
        }
        }
        }
      case "PNil": {ESLVal $799 = _v123.termRef(0);
          
          {ESLVal l = $799;
          
          return new ESLVal("[]");
        }
        }
      case "PEmptySet": {ESLVal $798 = _v123.termRef(0);
          
          {ESLVal l = $798;
          
          return new ESLVal("Set{}");
        }
        }
      case "PEmptyBag": {ESLVal $797 = _v123.termRef(0);
          
          {ESLVal l = $797;
          
          return new ESLVal("Bag{}");
        }
        }
      case "PInt": {ESLVal $796 = _v123.termRef(0);
          ESLVal $795 = _v123.termRef(1);
          
          {ESLVal l = $796;
          
          {ESLVal n = $795;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $794 = _v123.termRef(0);
          ESLVal $793 = _v123.termRef(1);
          
          {ESLVal l = $794;
          
          {ESLVal b = $793;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $792 = _v123.termRef(0);
          ESLVal $791 = _v123.termRef(1);
          
          {ESLVal l = $792;
          
          {ESLVal s = $791;
          
          return s;
        }
        }
        }
      case "PCons": {ESLVal $790 = _v123.termRef(0);
          ESLVal $789 = _v123.termRef(1);
          ESLVal $788 = _v123.termRef(2);
          
          {ESLVal l = $790;
          
          {ESLVal h = $789;
          
          {ESLVal t = $788;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $787 = _v123.termRef(0);
          ESLVal $786 = _v123.termRef(1);
          ESLVal $785 = _v123.termRef(2);
          
          {ESLVal l = $787;
          
          {ESLVal p1 = $786;
          
          {ESLVal p2 = $785;
          
          return new ESLVal("Set{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $784 = _v123.termRef(0);
          ESLVal $783 = _v123.termRef(1);
          ESLVal $782 = _v123.termRef(2);
          
          {ESLVal l = $784;
          
          {ESLVal p1 = $783;
          
          {ESLVal p2 = $782;
          
          return new ESLVal("Bag{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
        default: {ESLVal _v1035 = _v123;
          
          return new ESLVal("<unknown: ").add(_v1035.add(new ESLVal(">")));
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
        ESLVal _v121 = env;
        while(_v121.isCons()) {
          ESLVal _v120 = _v121.headVal;
          {ESLVal _v119 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v122 = _v120;
                    
                    switch(_v122.termName) {
                    case "Map": {ESLVal $781 = _v122.termRef(0);
                      ESLVal $780 = _v122.termRef(1);
                      
                      {ESLVal n = $781;
                      
                      {ESLVal t = $780;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t,env).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v122;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v119.apply();
          }
          _v121 = _v121.tailVal;}
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
        ESLVal _v117 = env;
        while(_v117.isCons()) {
          ESLVal _v116 = _v117.headVal;
          {ESLVal _v115 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v118 = _v116;
                    
                    switch(_v118.termName) {
                    case "Map": {ESLVal $779 = _v118.termRef(0);
                      ESLVal $778 = _v118.termRef(1);
                      
                      {ESLVal n = $779;
                      
                      {ESLVal t = $778;
                      
                      if(typeEqual.apply(t0,t).boolVal)
                      {name[0] = n;
                      return $null;}
                      else
                        return $null;
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
      return name[0];}
      }
    }
  });
  private static ESLVal ppType0 = new ESLVal(new Function(new ESLVal("ppType0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  return new ESLVal(new Function(new ESLVal("fun2896"),getSelf()) {
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
  {ESLVal _v114 = handlers;
        
        if(_v114.isCons())
        {ESLVal $772 = _v114.head();
          ESLVal $773 = _v114.tail();
          
          switch($772.termName) {
          case "MessageType": {ESLVal $775 = $772.termRef(0);
            ESLVal $774 = $772.termRef(1);
            
            if($774.isCons())
            {ESLVal $776 = $774.head();
              ESLVal $777 = $774.tail();
              
              {ESLVal l = $775;
              
              {ESLVal t = $776;
              
              {ESLVal ts = $777;
              
              {ESLVal hs = $773;
              
              return ppType.apply(t,env).add(new ESLVal("; ").add(ppHandlers.apply(hs,env)));
            }
            }
            }
            }
            }
          else if($774.isNil())
            return error(new ESLVal("case error at Pos(5351,5485)").add(ESLVal.list(_v114)));
          else return error(new ESLVal("case error at Pos(5351,5485)").add(ESLVal.list(_v114)));
          }
          default: return error(new ESLVal("case error at Pos(5351,5485)").add(ESLVal.list(_v114)));
        }
        }
      else if(_v114.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(5351,5485)").add(ESLVal.list(_v114)));
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
          {ESLVal _v113 = t;
            
            switch(_v113.termName) {
            case "ActType": {ESLVal $771 = _v113.termRef(0);
              ESLVal $770 = _v113.termRef(1);
              ESLVal $769 = _v113.termRef(2);
              
              {ESLVal l = $771;
              
              {ESLVal decs = $770;
              
              {ESLVal handlers = $769;
              
              return new ESLVal("Act { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")));
            }
            }
            }
            }
          case "ApplyType": {ESLVal $768 = _v113.termRef(0);
              ESLVal $767 = _v113.termRef(1);
              ESLVal $766 = _v113.termRef(2);
              
              {ESLVal l = $768;
              
              {ESLVal n = $767;
              
              {ESLVal args = $766;
              
              return n.add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ApplyTypeFun": {ESLVal $765 = _v113.termRef(0);
              ESLVal $764 = _v113.termRef(1);
              ESLVal $763 = _v113.termRef(2);
              
              {ESLVal l = $765;
              
              {ESLVal op = $764;
              
              {ESLVal args = $763;
              
              return ppType.apply(op,env).add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ArrayType": {ESLVal $762 = _v113.termRef(0);
              ESLVal $761 = _v113.termRef(1);
              
              {ESLVal l = $762;
              
              {ESLVal _v1033 = $761;
              
              return new ESLVal("Array[").add(ppType.apply(_v1033,env).add(new ESLVal("]")));
            }
            }
            }
          case "BagType": {ESLVal $760 = _v113.termRef(0);
              ESLVal $759 = _v113.termRef(1);
              
              {ESLVal l = $760;
              
              {ESLVal _v1032 = $759;
              
              return new ESLVal("Set{").add(ppType.apply(_v1032,env).add(new ESLVal("}")));
            }
            }
            }
          case "BoolType": {ESLVal $758 = _v113.termRef(0);
              
              {ESLVal l = $758;
              
              return new ESLVal("Bool");
            }
            }
          case "ExtendedAct": {ESLVal $757 = _v113.termRef(0);
              ESLVal $756 = _v113.termRef(1);
              ESLVal $755 = _v113.termRef(2);
              ESLVal $754 = _v113.termRef(3);
              
              {ESLVal l = $757;
              
              {ESLVal parent = $756;
              
              {ESLVal decs = $755;
              
              {ESLVal handlers = $754;
              
              return new ESLVal("Act extends ").add(ppType.apply(parent,env).add(new ESLVal(" { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")))));
            }
            }
            }
            }
            }
          case "FloatType": {ESLVal $753 = _v113.termRef(0);
              
              {ESLVal l = $753;
              
              return new ESLVal("Float");
            }
            }
          case "FieldType": {ESLVal $752 = _v113.termRef(0);
              ESLVal $751 = _v113.termRef(1);
              ESLVal $750 = _v113.termRef(2);
              
              {ESLVal l = $752;
              
              {ESLVal n = $751;
              
              {ESLVal _v1031 = $750;
              
              return n.add(new ESLVal("::").add(ppType.apply(_v1031,env)));
            }
            }
            }
            }
          case "ForallType": {ESLVal $749 = _v113.termRef(0);
              ESLVal $748 = _v113.termRef(1);
              ESLVal $747 = _v113.termRef(2);
              
              {ESLVal l = $749;
              
              {ESLVal ns = $748;
              
              {ESLVal _v1030 = $747;
              
              return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v1030,env))));
            }
            }
            }
            }
          case "FunType": {ESLVal $746 = _v113.termRef(0);
              ESLVal $745 = _v113.termRef(1);
              ESLVal $744 = _v113.termRef(2);
              
              {ESLVal l = $746;
              
              {ESLVal d = $745;
              
              {ESLVal r = $744;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
          case "TaggedFunType": {ESLVal $743 = _v113.termRef(0);
              ESLVal $742 = _v113.termRef(1);
              ESLVal $741 = _v113.termRef(2);
              ESLVal $740 = _v113.termRef(3);
              
              {ESLVal l = $743;
              
              {ESLVal d = $742;
              
              {ESLVal p = $741;
              
              {ESLVal r = $740;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
            }
          case "IntType": {ESLVal $739 = _v113.termRef(0);
              
              {ESLVal l = $739;
              
              return new ESLVal("Int");
            }
            }
          case "ListType": {ESLVal $738 = _v113.termRef(0);
              ESLVal $737 = _v113.termRef(1);
              
              {ESLVal l = $738;
              
              {ESLVal _v1029 = $737;
              
              return new ESLVal("[").add(ppType.apply(_v1029,env).add(new ESLVal("]")));
            }
            }
            }
          case "NullType": {ESLVal $736 = _v113.termRef(0);
              
              {ESLVal l = $736;
              
              return new ESLVal("Null");
            }
            }
          case "RecType": {ESLVal $735 = _v113.termRef(0);
              ESLVal $734 = _v113.termRef(1);
              ESLVal $733 = _v113.termRef(2);
              
              {ESLVal l = $735;
              
              {ESLVal n = $734;
              
              {ESLVal _v1028 = $733;
              
              return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v1028,env))));
            }
            }
            }
            }
          case "RecordType": {ESLVal $732 = _v113.termRef(0);
              ESLVal $731 = _v113.termRef(1);
              
              {ESLVal l = $732;
              
              {ESLVal fs = $731;
              
              return new ESLVal("{").add(fs.add(new ESLVal("}")));
            }
            }
            }
          case "SetType": {ESLVal $730 = _v113.termRef(0);
              ESLVal $729 = _v113.termRef(1);
              
              {ESLVal l = $730;
              
              {ESLVal _v1027 = $729;
              
              return new ESLVal("Set{").add(ppType.apply(_v1027,env).add(new ESLVal("}")));
            }
            }
            }
          case "StrType": {ESLVal $728 = _v113.termRef(0);
              
              {ESLVal l = $728;
              
              return new ESLVal("Str");
            }
            }
          case "TableType": {ESLVal $727 = _v113.termRef(0);
              ESLVal $726 = _v113.termRef(1);
              ESLVal $725 = _v113.termRef(2);
              
              {ESLVal l = $727;
              
              {ESLVal k = $726;
              
              {ESLVal v = $725;
              
              return new ESLVal("Hash[").add(ppType.apply(k,env).add(new ESLVal(",").add(ppType.apply(v,env).add(new ESLVal("]")))));
            }
            }
            }
            }
          case "TermType": {ESLVal $724 = _v113.termRef(0);
              ESLVal $723 = _v113.termRef(1);
              ESLVal $722 = _v113.termRef(2);
              
              {ESLVal l = $724;
              
              {ESLVal n = $723;
              
              {ESLVal ts = $722;
              
              return n.add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
            }
          case "TypeFun": {ESLVal $721 = _v113.termRef(0);
              ESLVal $720 = _v113.termRef(1);
              ESLVal $719 = _v113.termRef(2);
              
              {ESLVal l = $721;
              
              {ESLVal ns = $720;
              
              {ESLVal _v1026 = $719;
              
              return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v1026,env))));
            }
            }
            }
            }
          case "UnfoldType": {ESLVal $718 = _v113.termRef(0);
              ESLVal $717 = _v113.termRef(1);
              
              {ESLVal l = $718;
              
              {ESLVal _v1025 = $717;
              
              return new ESLVal("unfold ").add(ppType.apply(_v1025,env));
            }
            }
            }
          case "UnionType": {ESLVal $716 = _v113.termRef(0);
              ESLVal $715 = _v113.termRef(1);
              
              {ESLVal l = $716;
              
              {ESLVal ts = $715;
              
              return new ESLVal("union ").add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
          case "VarType": {ESLVal $714 = _v113.termRef(0);
              ESLVal $713 = _v113.termRef(1);
              
              {ESLVal l = $714;
              
              {ESLVal n = $713;
              
              return n;
            }
            }
            }
          case "VoidType": {ESLVal $712 = _v113.termRef(0);
              
              {ESLVal l = $712;
              
              return new ESLVal("Void");
            }
            }
          case "UnionRef": {ESLVal $711 = _v113.termRef(0);
              ESLVal $710 = _v113.termRef(1);
              ESLVal $709 = _v113.termRef(2);
              
              {ESLVal l = $711;
              
              {ESLVal _v1024 = $710;
              
              {ESLVal n = $709;
              
              return ppType.apply(_v1024,env).add(new ESLVal(".").add(n));
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $708 = _v113.termRef(0);
              
              {ESLVal f = $708;
              
              return f.add(new ESLVal(""));
            }
            }
            default: {ESLVal x = _v113;
              
              return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
            }
          }
          }
    }
  });
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v112 = defs;
        
        if(_v112.isCons())
        {ESLVal $698 = _v112.head();
          ESLVal $699 = _v112.tail();
          
          switch($698.termName) {
          case "TypeBind": {ESLVal $707 = $698.termRef(0);
            ESLVal $706 = $698.termRef(1);
            ESLVal $705 = $698.termRef(2);
            ESLVal $704 = $698.termRef(3);
            
            {ESLVal l = $707;
            
            {ESLVal n = $706;
            
            {ESLVal t = $705;
            
            {ESLVal e = $704;
            
            {ESLVal ds = $699;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $703 = $698.termRef(0);
            ESLVal $702 = $698.termRef(1);
            ESLVal $701 = $698.termRef(2);
            ESLVal $700 = $698.termRef(3);
            
            {ESLVal l = $703;
            
            {ESLVal n = $702;
            
            {ESLVal t = $701;
            
            {ESLVal e = $700;
            
            {ESLVal ds = $699;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $698;
            
            {ESLVal ds = $699;
            
            return typeEnv.apply(ds);
          }
          }
        }
        }
      else if(_v112.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7546,7789)").add(ESLVal.list(_v112)));
      }
    }
  });
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v111 = defs;
        
        if(_v111.isCons())
        {ESLVal $681 = _v111.head();
          ESLVal $682 = _v111.tail();
          
          switch($681.termName) {
          case "TypeBind": {ESLVal $690 = $681.termRef(0);
            ESLVal $689 = $681.termRef(1);
            ESLVal $688 = $681.termRef(2);
            ESLVal $687 = $681.termRef(3);
            
            switch($688.termName) {
            case "RecType": {ESLVal $695 = $688.termRef(0);
              ESLVal $694 = $688.termRef(1);
              ESLVal $693 = $688.termRef(2);
              
              switch($693.termName) {
              case "UnionType": {ESLVal $697 = $693.termRef(0);
                ESLVal $696 = $693.termRef(1);
                
                {ESLVal l = $690;
                
                {ESLVal n = $689;
                
                {ESLVal ll = $695;
                
                {ESLVal m = $694;
                
                {ESLVal lll = $697;
                
                {ESLVal ts = $696;
                
                {ESLVal e = $687;
                
                {ESLVal ds = $682;
                
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
              default: {ESLVal l = $690;
                
                {ESLVal n = $689;
                
                {ESLVal t = $688;
                
                {ESLVal e = $687;
                
                {ESLVal ds = $682;
                
                return cnstrEnv.apply(ds,env);
              }
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $692 = $688.termRef(0);
              ESLVal $691 = $688.termRef(1);
              
              {ESLVal l = $690;
              
              {ESLVal n = $689;
              
              {ESLVal lll = $692;
              
              {ESLVal ts = $691;
              
              {ESLVal e = $687;
              
              {ESLVal ds = $682;
              
              return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $690;
              
              {ESLVal n = $689;
              
              {ESLVal t = $688;
              
              {ESLVal e = $687;
              
              {ESLVal ds = $682;
              
              return cnstrEnv.apply(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "DataBind": {ESLVal $686 = $681.termRef(0);
            ESLVal $685 = $681.termRef(1);
            ESLVal $684 = $681.termRef(2);
            ESLVal $683 = $681.termRef(3);
            
            {ESLVal l = $686;
            
            {ESLVal n = $685;
            
            {ESLVal t = $684;
            
            {ESLVal e = $683;
            
            {ESLVal ds = $682;
            
            return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $681;
            
            {ESLVal ds = $682;
            
            return cnstrEnv.apply(ds,env);
          }
          }
        }
        }
      else if(_v111.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7921,8554)").add(ESLVal.list(_v111)));
      }
    }
  });
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal dataType = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v109 = t;
        
        switch(_v109.termName) {
        case "RecType": {ESLVal $677 = _v109.termRef(0);
          ESLVal $676 = _v109.termRef(1);
          ESLVal $675 = _v109.termRef(2);
          
          {ESLVal _v1021 = $677;
          
          {ESLVal n = $676;
          
          {ESLVal _v1022 = $675;
          
          return getConstructors.apply(_v1021,dataType,_v1022);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $674 = _v109.termRef(0);
          ESLVal $673 = _v109.termRef(1);
          ESLVal $672 = _v109.termRef(2);
          
          {ESLVal _v1019 = $674;
          
          {ESLVal ns = $673;
          
          {ESLVal _v1020 = $672;
          
          return getConstructors.apply(_v1019,dataType,_v1020);
        }
        }
        }
        }
      case "UnionType": {ESLVal $671 = _v109.termRef(0);
          ESLVal $670 = _v109.termRef(1);
          
          {ESLVal _v1016 = $671;
          
          {ESLVal ts = $670;
          
          return map.apply(new ESLVal(new Function(new ESLVal("fun2897"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1017 = $args[0];
          {ESLVal _v110 = _v1017;
                
                switch(_v110.termName) {
                case "TermType": {ESLVal $680 = _v110.termRef(0);
                  ESLVal $679 = _v110.termRef(1);
                  ESLVal $678 = _v110.termRef(2);
                  
                  {ESLVal _v1018 = $680;
                  
                  {ESLVal n = $679;
                  
                  {ESLVal tts = $678;
                  
                  return new ESLVal("Map",n,dataType);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(9073,9139)").add(ESLVal.list(_v110)));
              }
              }
            }
          }),ts);
        }
        }
        }
        default: {ESLVal _v1023 = _v109;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType.apply(_v1023,ESLVal.list()))));
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
  {ESLVal _v108 = e;
        
        if(_v108.isCons())
        {ESLVal $666 = _v108.head();
          ESLVal $667 = _v108.tail();
          
          switch($666.termName) {
          case "Map": {ESLVal $669 = $666.termRef(0);
            ESLVal $668 = $666.termRef(1);
            
            {ESLVal n = $669;
            
            {ESLVal t = $668;
            
            {ESLVal _v1015 = $667;
            
            if(member.apply(n,typeEnvDom.apply(_v1015)).boolVal)
            return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Duplicate type name: ").add(n)));
            else
              return checkSingletonTypes.apply(_v1015);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9843,10064)").add(ESLVal.list(_v108)));
        }
        }
      else if(_v108.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(9843,10064)").add(ESLVal.list(_v108)));
      }
    }
  });
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v107 = e;
        
        if(_v107.isCons())
        {ESLVal $662 = _v107.head();
          ESLVal $663 = _v107.tail();
          
          switch($662.termName) {
          case "Map": {ESLVal $665 = $662.termRef(0);
            ESLVal $664 = $662.termRef(1);
            
            {ESLVal n = $665;
            
            {ESLVal t = $664;
            
            {ESLVal _v1014 = $663;
            
            if(member.apply(n,typeEnvDom.apply(_v1014)).boolVal)
            return error(new ESLVal("Duplicate constructor name: ").add(n));
            else
              return checkSingletonConstructors.apply(_v1014);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10170,10385)").add(ESLVal.list(_v107)));
        }
        }
      else if(_v107.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10170,10385)").add(ESLVal.list(_v107)));
      }
    }
  });
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v106 = defs;
        
        if(_v106.isCons())
        {ESLVal $648 = _v106.head();
          ESLVal $649 = _v106.tail();
          
          switch($648.termName) {
          case "TypeBind": {ESLVal $661 = $648.termRef(0);
            ESLVal $660 = $648.termRef(1);
            ESLVal $659 = $648.termRef(2);
            ESLVal $658 = $648.termRef(3);
            
            {ESLVal l = $661;
            
            {ESLVal n = $660;
            
            {ESLVal t = $659;
            
            {ESLVal e = $658;
            
            {ESLVal ds = $649;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $657 = $648.termRef(0);
            ESLVal $656 = $648.termRef(1);
            ESLVal $655 = $648.termRef(2);
            ESLVal $654 = $648.termRef(3);
            
            {ESLVal l1 = $657;
            
            {ESLVal n = $656;
            
            {ESLVal t = $655;
            
            {ESLVal e = $654;
            
            {ESLVal ds = $649;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "CnstrBind": {ESLVal $653 = $648.termRef(0);
            ESLVal $652 = $648.termRef(1);
            ESLVal $651 = $648.termRef(2);
            ESLVal $650 = $648.termRef(3);
            
            {ESLVal l1 = $653;
            
            {ESLVal n = $652;
            
            {ESLVal t = $651;
            
            {ESLVal e = $650;
            
            {ESLVal ds = $649;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $648;
            
            {ESLVal ds = $649;
            
            return valueDefs.apply(ds).cons(b);
          }
          }
        }
        }
      else if(_v106.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(10426,10736)").add(ESLVal.list(_v106)));
      }
    }
  });
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1013 = $args[0];
  ESLVal _v1012 = $args[1];
  ESLVal _v1011 = $args[2];
  ESLVal _v1010 = $args[3];
  ESLVal _v1009 = $args[4];
  {ESLVal _v105 = _v1013;
        
        if(_v105.isCons())
        {ESLVal $634 = _v105.head();
          ESLVal $635 = _v105.tail();
          
          switch($634.termName) {
          case "FunBind": {ESLVal $647 = $634.termRef(0);
            ESLVal $646 = $634.termRef(1);
            ESLVal $645 = $634.termRef(2);
            ESLVal $644 = $634.termRef(3);
            ESLVal $643 = $634.termRef(4);
            ESLVal $642 = $634.termRef(5);
            ESLVal $641 = $634.termRef(6);
            
            {ESLVal l = $647;
            
            {ESLVal n = $646;
            
            {ESLVal ps = $645;
            
            {ESLVal t = $644;
            
            {ESLVal st = $643;
            
            {ESLVal b = $642;
            
            {ESLVal g = $641;
            
            {ESLVal ds = $635;
            
            return valueDefsToTEnv.apply(ds,_v1012,_v1011,_v1010,_v1009).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1009,t)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "Binding": {ESLVal $640 = $634.termRef(0);
            ESLVal $639 = $634.termRef(1);
            ESLVal $638 = $634.termRef(2);
            ESLVal $637 = $634.termRef(3);
            ESLVal $636 = $634.termRef(4);
            
            {ESLVal l = $640;
            
            {ESLVal n = $639;
            
            {ESLVal t = $638;
            
            {ESLVal st = $637;
            
            {ESLVal e = $636;
            
            {ESLVal ds = $635;
            
            return valueDefsToTEnv.apply(ds,_v1012,_v1011,_v1010,_v1009).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1009,t)));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10843,11529)").add(ESLVal.list(_v105)));
        }
        }
      else if(_v105.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(10843,11529)").add(ESLVal.list(_v105)));
      }
    }
  });
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  {print.apply(new ESLVal("[ type check ").add(path.add(new ESLVal("]"))));
      return typeCheckModuleInternal.apply(path,emptyTable,new ESLVal(new Function(new ESLVal("fun2898"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1008 = $args[0];
        ESLVal _v1007 = $args[1];
        ESLVal _v1006 = $args[2];
        ESLVal _v1005 = $args[3];
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
        {ESLVal _v104 = lookup.apply(path,cache);
          
          switch(_v104.termName) {
          case "Typed": {ESLVal $633 = _v104.termRef(0);
            ESLVal $632 = _v104.termRef(1);
            ESLVal $631 = _v104.termRef(2);
            ESLVal $630 = _v104.termRef(3);
            
            {ESLVal m = $633;
            
            {ESLVal vEnv = $632;
            
            {ESLVal cEnv = $631;
            
            {ESLVal tEnv = $630;
            
            return handler.apply(cache,vEnv,cEnv,tEnv);
          }
          }
          }
          }
          }
        case "Undefined": {
            return error(new ESLVal("recursive reference to ").add(path));
          }
          default: return error(new ESLVal("case error at Pos(11998,12232)").add(ESLVal.list(_v104)));
        }
        }
        else
          {ESLVal m = parse.apply(path);
            
            return typeCheckModuleCache.apply(m,addEntry.apply(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun2899"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1004 = $args[0];
            ESLVal _v1003 = $args[1];
            ESLVal _v1002 = $args[2];
            ESLVal _v1001 = $args[3];
            return handler.apply(addEntry.apply(path,new ESLVal("Typed",m,_v1003,_v1002,_v1001),_v1004),_v1003,_v1002,_v1001);
              }
            }));
          }
    }
  });
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  return typeCheckModuleCache.apply(module,emptyTable,new ESLVal(new Function(new ESLVal("fun2900"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1000 = $args[0];
        ESLVal _v999 = $args[1];
        ESLVal _v998 = $args[2];
        ESLVal _v997 = $args[3];
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
  return typeCheckModule0.apply(module,cache,new ESLVal(new Function(new ESLVal("fun2901"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v996 = $args[0];
        ESLVal _v995 = $args[1];
        ESLVal _v994 = $args[2];
        ESLVal _v993 = $args[3];
        {ESLVal _v103 = module;
              
              switch(_v103.termName) {
              case "Module": {ESLVal $629 = _v103.termRef(0);
                ESLVal $628 = _v103.termRef(1);
                ESLVal $627 = _v103.termRef(2);
                ESLVal $626 = _v103.termRef(3);
                ESLVal $625 = _v103.termRef(4);
                ESLVal $624 = _v103.termRef(5);
                ESLVal $623 = _v103.termRef(6);
                
                {ESLVal path = $629;
                
                {ESLVal name = $628;
                
                {ESLVal exports = $627;
                
                {ESLVal imports = $626;
                
                {ESLVal x = $625;
                
                {ESLVal y = $624;
                
                {ESLVal defs = $623;
                
                return handler.apply(_v996,restrictTypeEnv.apply(_v995,exports),restrictTypeEnv.apply(_v994,exports),restrictTypeEnv.apply(_v993,exports));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(12974,13232)").add(ESLVal.list(_v103)));
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
        ESLVal _v973 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v982 = $args[0];
          ESLVal _v981 = $args[1];
          ESLVal _v980 = $args[2];
          {ESLVal _v102 = _v982;
                
                if(_v102.isCons())
                {ESLVal $621 = _v102.head();
                  ESLVal $622 = _v102.tail();
                  
                  {ESLVal path = $621;
                  
                  {ESLVal _v983 = $622;
                  
                  {ESLVal _v984 = _v983;
                  
                  return typeCheckModuleInternal.apply(path,_v981,new ESLVal(new Function(new ESLVal("fun2902"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v988 = $args[0];
                  ESLVal _v987 = $args[1];
                  ESLVal _v986 = $args[2];
                  ESLVal _v985 = $args[3];
                  return _v973.apply(_v984,_v988,new ESLVal(new Function(new ESLVal("fun2903"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v992 = $args[0];
                        ESLVal _v991 = $args[1];
                        ESLVal _v990 = $args[2];
                        ESLVal _v989 = $args[3];
                        return _v980.apply(_v992,_v991.add(_v987),_v990.add(_v986),_v989.add(_v985));
                          }
                        }));
                    }
                  }));
                }
                }
                }
                }
              else if(_v102.isNil())
                return _v980.apply(_v981,$nil,$nil,$nil);
              else return error(new ESLVal("case error at Pos(13612,14169)").add(ESLVal.list(_v102)));
              }
            }
          });
        ESLVal _v972 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              {ESLVal _v101 = module;
                
                switch(_v101.termName) {
                case "Module": {ESLVal $620 = _v101.termRef(0);
                  ESLVal $619 = _v101.termRef(1);
                  ESLVal $618 = _v101.termRef(2);
                  ESLVal $617 = _v101.termRef(3);
                  ESLVal $616 = _v101.termRef(4);
                  ESLVal $615 = _v101.termRef(5);
                  ESLVal $614 = _v101.termRef(6);
                  
                  {ESLVal path = $620;
                  
                  {ESLVal name = $619;
                  
                  {ESLVal exports = $618;
                  
                  {ESLVal imports = $617;
                  
                  {ESLVal x = $616;
                  
                  {ESLVal y = $615;
                  
                  {ESLVal defs = $614;
                  
                  return _v973.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun2904"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v977 = $args[0];
                  ESLVal _v976 = $args[1];
                  ESLVal _v975 = $args[2];
                  ESLVal _v974 = $args[3];
                  {ESLVal e = typeEnv.apply(defs);
                        
                        {checkDupBindings.apply(defs);
                      checkFreeTypes.apply(e.add(_v974.add(tenv0)));
                      checkSingletonTypes.apply(e);
                      {ESLVal _v978 = recTypes.apply(e.add(_v974.add(tenv0)));
                        
                        {ESLVal _v979 = cnstrEnv.apply(defs,_v978).add(_v975.add(cnstrEnv0));
                        
                        {checkSingletonConstructors.apply(_v979);
                      {ESLVal valueEnv = typeCheckValues.apply(valueDefs.apply(defs),new ESLVal("NullType",p0),_v976,_v978,_v979);
                        
                        return handler.apply(_v977,valueEnv,_v979,_v978);
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
                default: return error(new ESLVal("case error at Pos(14198,15688)").add(ESLVal.list(_v101)));
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "_v973": return _v973;
            
            case "_v972": return _v972;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal _v973 = letrec.get("_v973");
      
      ESLVal _v972 = letrec.get("_v972");
      
        return _v972.apply();
      
    }
  });
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v971 = $args[0];
  ESLVal _v970 = $args[1];
  ESLVal _v969 = $args[2];
  ESLVal _v968 = $args[3];
  ESLVal _v967 = $args[4];
  {ESLVal valueEnv = valueDefsToTEnv.apply(_v971,_v970,$nil,_v967,_v968).add(_v969.add(env0));
        
        {{
        ESLVal _v100 = _v971;
        while(_v100.isCons()) {
          ESLVal def = _v100.headVal;
          typeCheckDef.apply(def,_v970,valueEnv,valueEnv,_v967,_v968);
          _v100 = _v100.tailVal;}
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
          {ESLVal _v98 = $qualArg;
                
                {ESLVal p = _v98;
                
                return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v966 = $args[0];
                {ESLVal _v99 = _v966;
                      
                      {ESLVal n = _v99;
                      
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
      ESLVal _v955 = $args[0];
  ESLVal _v954 = $args[1];
  ESLVal _v953 = $args[2];
  ESLVal _v952 = $args[3];
  ESLVal _v951 = $args[4];
  ESLVal _v950 = $args[5];
  {ESLVal _v94 = _v955;
        
        switch(_v94.termName) {
        case "FunBind": {ESLVal $604 = _v94.termRef(0);
          ESLVal $603 = _v94.termRef(1);
          ESLVal $602 = _v94.termRef(2);
          ESLVal $601 = _v94.termRef(3);
          ESLVal $600 = _v94.termRef(4);
          ESLVal $599 = _v94.termRef(5);
          ESLVal $598 = _v94.termRef(6);
          
          {ESLVal l = $604;
          
          {ESLVal n = $603;
          
          {ESLVal ps = $602;
          
          {ESLVal t = $601;
          
          {ESLVal st = $600;
          
          {ESLVal b = $599;
          
          {ESLVal g = $598;
          
          {checkPatterns.apply(l,ps);
        {ESLVal argTypes = map.apply(new ESLVal(new Function(new ESLVal("fun2905"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v96 = p;
                  
                  switch(_v96.termName) {
                  case "PVar": {ESLVal $610 = _v96.termRef(0);
                    ESLVal $609 = _v96.termRef(1);
                    ESLVal $608 = _v96.termRef(2);
                    
                    {ESLVal _v960 = $610;
                    
                    {ESLVal _v961 = $609;
                    
                    {ESLVal _v962 = $608;
                    
                    return substTypeEnv.apply(_v950,_v962);
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(16962,17028)").add(ESLVal.list(_v96)));
                }
                }
              }
            }),ps);
          ESLVal argNames = map.apply(new ESLVal(new Function(new ESLVal("fun2906"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v95 = p;
                  
                  switch(_v95.termName) {
                  case "PVar": {ESLVal $607 = _v95.termRef(0);
                    ESLVal $606 = _v95.termRef(1);
                    ESLVal $605 = _v95.termRef(2);
                    
                    {ESLVal _v957 = $607;
                    
                    {ESLVal _v958 = $606;
                    
                    {ESLVal _v959 = $605;
                    
                    return _v958;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(17100,17144)").add(ESLVal.list(_v95)));
                }
                }
              }
            }),ps);
          
          {ESLVal bodyType = guardedExpType.apply(l,g,b,_v954,zipTypeEnv.apply(argNames,argTypes).add(_v953),_v951,_v950);
          
          {ESLVal fType = ((Supplier<ESLVal>)() -> { 
              {ESLVal _v97 = t;
                
                switch(_v97.termName) {
                case "ForallType": {ESLVal $613 = _v97.termRef(0);
                  ESLVal $612 = _v97.termRef(1);
                  ESLVal $611 = _v97.termRef(2);
                  
                  {ESLVal _v963 = $613;
                  
                  {ESLVal ns = $612;
                  
                  {ESLVal _v964 = $611;
                  
                  return genericize.apply(_v963,new ESLVal("FunType",_v963,argTypes,bodyType));
                }
                }
                }
                }
                default: {ESLVal _v965 = _v97;
                  
                  return new ESLVal("FunType",l,argTypes,bodyType);
                }
              }
              }
            }).get();
          ESLVal dType = substTypeEnv.apply(_v950,t);
          
          if(subType.apply(fType,dType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType.apply(fType,_v950).add(new ESLVal(" does not match declaration ").add(ppType.apply(dType,_v950))))))));
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
      case "Binding": {ESLVal $597 = _v94.termRef(0);
          ESLVal $596 = _v94.termRef(1);
          ESLVal $595 = _v94.termRef(2);
          ESLVal $594 = _v94.termRef(3);
          ESLVal $593 = _v94.termRef(4);
          
          {ESLVal l = $597;
          
          {ESLVal n = $596;
          
          {ESLVal dt = $595;
          
          {ESLVal st = $594;
          
          {ESLVal e = $593;
          
          {ESLVal valueType = expType.apply(e,_v954,_v953,_v951,_v950);
          
          {ESLVal valueFV = typeFV.apply(valueType);
          ESLVal declaredType = lookupType.apply(n,_v952);
          
          {ESLVal _v956 = ((Supplier<ESLVal>)() -> { 
              if(valueFV.eql($nil).boolVal)
                return valueType;
                else
                  return new ESLVal("ForallType",l,valueFV,valueType);
            }).get();
          
          if(subType.apply(_v956,declaredType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType.apply(_v956,_v950).add(new ESLVal(" does not match declared type = ").add(ppType.apply(declaredType,_v950))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(16778,18551)").add(ESLVal.list(_v94)));
      }
      }
    }
  });
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v949 = $args[0];
  ESLVal _v948 = $args[1];
  ESLVal _v947 = $args[2];
  ESLVal _v946 = $args[3];
  ESLVal _v945 = $args[4];
  ESLVal _v944 = $args[5];
  ESLVal _v943 = $args[6];
  {ESLVal bt = expType.apply(_v948,_v946,_v945,_v944,_v943);
        
        if(isBoolType.apply(bt).boolVal)
        return expType.apply(_v947,_v946,_v945,_v944,_v943);
        else
          return error(new ESLVal("TypeError",_v949,new ESLVal("guarded expression requires a boolean value: ").add(ppType.apply(bt,_v943))));
      }
    }
  });
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v927 = $args[0];
  ESLVal _v926 = $args[1];
  ESLVal _v925 = $args[2];
  ESLVal _v924 = $args[3];
  ESLVal _v923 = $args[4];
  {ESLVal _v92 = _v927;
        
        switch(_v92.termName) {
        case "ActExp": {ESLVal $592 = _v92.termRef(0);
          ESLVal $591 = _v92.termRef(1);
          ESLVal $590 = _v92.termRef(2);
          ESLVal $589 = _v92.termRef(3);
          ESLVal $588 = _v92.termRef(4);
          ESLVal $587 = _v92.termRef(5);
          ESLVal $586 = _v92.termRef(6);
          ESLVal $585 = _v92.termRef(7);
          
          {ESLVal l = $592;
          
          {ESLVal n = $591;
          
          {ESLVal args = $590;
          
          {ESLVal exports = $589;
          
          {ESLVal parent = $588;
          
          {ESLVal bindings = $587;
          
          {ESLVal init = $586;
          
          {ESLVal arms = $585;
          
          return actType.apply(l,n,args,parent,exports,bindings,init,arms,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Apply": {ESLVal $584 = _v92.termRef(0);
          ESLVal $583 = _v92.termRef(1);
          ESLVal $582 = _v92.termRef(2);
          
          {ESLVal l = $584;
          
          {ESLVal op = $583;
          
          {ESLVal args = $582;
          
          return applyType.apply(l,op,args,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $581 = _v92.termRef(0);
          ESLVal $580 = _v92.termRef(1);
          ESLVal $579 = _v92.termRef(2);
          
          {ESLVal l = $581;
          
          {ESLVal _v942 = $580;
          
          {ESLVal ts = $579;
          
          return applyTypeExp.apply(l,_v942,ts,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $578 = _v92.termRef(0);
          ESLVal $577 = _v92.termRef(1);
          ESLVal $576 = _v92.termRef(2);
          ESLVal $575 = _v92.termRef(3);
          
          {ESLVal l = $578;
          
          {ESLVal a = $577;
          
          {ESLVal i = $576;
          
          {ESLVal v = $575;
          
          return arrayUpdateType.apply(l,a,i,v,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $574 = _v92.termRef(0);
          ESLVal $573 = _v92.termRef(1);
          ESLVal $572 = _v92.termRef(2);
          
          {ESLVal l = $574;
          
          {ESLVal a = $573;
          
          {ESLVal i = $572;
          
          return arrayRefType.apply(l,a,i,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "BagExp": {ESLVal $571 = _v92.termRef(0);
          ESLVal $570 = _v92.termRef(1);
          
          {ESLVal l = $571;
          
          {ESLVal es = $570;
          
          return bagType.apply(l,es,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "Become": {ESLVal $569 = _v92.termRef(0);
          ESLVal $568 = _v92.termRef(1);
          
          {ESLVal l = $569;
          
          {ESLVal _v941 = $568;
          
          return becomeType.apply(l,_v941,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "BinExp": {ESLVal $567 = _v92.termRef(0);
          ESLVal $566 = _v92.termRef(1);
          ESLVal $565 = _v92.termRef(2);
          ESLVal $564 = _v92.termRef(3);
          
          {ESLVal l = $567;
          
          {ESLVal e1 = $566;
          
          {ESLVal op = $565;
          
          {ESLVal e2 = $564;
          
          return binExpType.apply(l,e1,op,e2,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "Block": {ESLVal $563 = _v92.termRef(0);
          ESLVal $562 = _v92.termRef(1);
          
          {ESLVal l = $563;
          
          {ESLVal es = $562;
          
          return blockType.apply(l,es,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "BoolExp": {ESLVal $561 = _v92.termRef(0);
          ESLVal $560 = _v92.termRef(1);
          
          {ESLVal l = $561;
          
          {ESLVal b = $560;
          
          return new ESLVal("BoolType",l);
        }
        }
        }
      case "Case": {ESLVal $559 = _v92.termRef(0);
          ESLVal $558 = _v92.termRef(1);
          ESLVal $557 = _v92.termRef(2);
          ESLVal $556 = _v92.termRef(3);
          
          {ESLVal l = $559;
          
          {ESLVal decs = $558;
          
          {ESLVal es = $557;
          
          {ESLVal arms = $556;
          
          return caseType.apply(l,es,arms,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "Cmp": {ESLVal $555 = _v92.termRef(0);
          ESLVal $554 = _v92.termRef(1);
          ESLVal $553 = _v92.termRef(2);
          
          {ESLVal l = $555;
          
          {ESLVal _v940 = $554;
          
          {ESLVal qs = $553;
          
          return cmpType.apply(l,_v940,qs,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "Grab": {ESLVal $552 = _v92.termRef(0);
          ESLVal $551 = _v92.termRef(1);
          ESLVal $550 = _v92.termRef(2);
          
          {ESLVal l = $552;
          
          {ESLVal refs = $551;
          
          {ESLVal _v939 = $550;
          
          return expType.apply(_v939,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "FloatExp": {ESLVal $549 = _v92.termRef(0);
          ESLVal $548 = _v92.termRef(1);
          
          {ESLVal l = $549;
          
          {ESLVal f = $548;
          
          return new ESLVal("FloatType",l);
        }
        }
        }
      case "Fold": {ESLVal $547 = _v92.termRef(0);
          ESLVal $546 = _v92.termRef(1);
          ESLVal $545 = _v92.termRef(2);
          
          {ESLVal l = $547;
          
          {ESLVal t = $546;
          
          {ESLVal _v938 = $545;
          
          return foldType.apply(l,t,_v938,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "For": {ESLVal $544 = _v92.termRef(0);
          ESLVal $543 = _v92.termRef(1);
          ESLVal $542 = _v92.termRef(2);
          ESLVal $541 = _v92.termRef(3);
          
          {ESLVal l = $544;
          
          {ESLVal p = $543;
          
          {ESLVal list = $542;
          
          {ESLVal _v937 = $541;
          
          return forType.apply(l,p,list,_v937,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $540 = _v92.termRef(0);
          ESLVal $539 = _v92.termRef(1);
          ESLVal $538 = _v92.termRef(2);
          ESLVal $537 = _v92.termRef(3);
          ESLVal $536 = _v92.termRef(4);
          
          {ESLVal l = $540;
          
          {ESLVal n = $539;
          
          {ESLVal args = $538;
          
          {ESLVal t = $537;
          
          {ESLVal _v936 = $536;
          
          return funType.apply(l,n,args,t,_v936,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $535 = _v92.termRef(0);
          ESLVal $534 = _v92.termRef(1);
          ESLVal $533 = _v92.termRef(2);
          ESLVal $532 = _v92.termRef(3);
          
          {ESLVal l = $535;
          
          {ESLVal e1 = $534;
          
          {ESLVal e2 = $533;
          
          {ESLVal e3 = $532;
          
          return ifType.apply(l,e1,e2,e3,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "IntExp": {ESLVal $531 = _v92.termRef(0);
          ESLVal $530 = _v92.termRef(1);
          
          {ESLVal l = $531;
          
          {ESLVal n = $530;
          
          return new ESLVal("IntType",l);
        }
        }
        }
      case "Let": {ESLVal $529 = _v92.termRef(0);
          ESLVal $528 = _v92.termRef(1);
          ESLVal $527 = _v92.termRef(2);
          
          {ESLVal l = $529;
          
          {ESLVal bs = $528;
          
          {ESLVal _v935 = $527;
          
          return letType.apply(l,bs,_v935,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "Letrec": {ESLVal $526 = _v92.termRef(0);
          ESLVal $525 = _v92.termRef(1);
          ESLVal $524 = _v92.termRef(2);
          
          {ESLVal l = $526;
          
          {ESLVal bs = $525;
          
          {ESLVal _v934 = $524;
          
          return letrecType.apply(l,bs,_v934,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "List": {ESLVal $523 = _v92.termRef(0);
          ESLVal $522 = _v92.termRef(1);
          
          {ESLVal l = $523;
          
          {ESLVal es = $522;
          
          return listType.apply(l,es,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "Now": {ESLVal $521 = _v92.termRef(0);
          
          {ESLVal l = $521;
          
          return new ESLVal("IntType",l);
        }
        }
      case "Probably": {ESLVal $520 = _v92.termRef(0);
          ESLVal $519 = _v92.termRef(1);
          ESLVal $518 = _v92.termRef(2);
          ESLVal $517 = _v92.termRef(3);
          ESLVal $516 = _v92.termRef(4);
          
          {ESLVal l = $520;
          
          {ESLVal p = $519;
          
          {ESLVal t = $518;
          
          {ESLVal e1 = $517;
          
          {ESLVal e2 = $516;
          
          return probablyType.apply(l,p,t,e1,e2,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
        }
      case "Record": {ESLVal $515 = _v92.termRef(0);
          ESLVal $514 = _v92.termRef(1);
          
          {ESLVal l = $515;
          
          {ESLVal fields = $514;
          
          return recordType.apply(l,fields,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "Ref": {ESLVal $513 = _v92.termRef(0);
          ESLVal $512 = _v92.termRef(1);
          ESLVal $511 = _v92.termRef(2);
          
          {ESLVal l = $513;
          
          {ESLVal _v933 = $512;
          
          {ESLVal n = $511;
          
          return refType.apply(l,_v933,n,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $510 = _v92.termRef(0);
          ESLVal $509 = _v92.termRef(1);
          
          {ESLVal l = $510;
          
          {ESLVal n = $509;
          
          return refType.apply(l,new ESLVal("Var",l,new ESLVal("$super")),n,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "Self": {ESLVal $508 = _v92.termRef(0);
          
          {ESLVal l = $508;
          
          return _v926;
        }
        }
      case "Send": {ESLVal $503 = _v92.termRef(0);
          ESLVal $502 = _v92.termRef(1);
          ESLVal $501 = _v92.termRef(2);
          
          switch($501.termName) {
          case "Term": {ESLVal $507 = $501.termRef(0);
            ESLVal $506 = $501.termRef(1);
            ESLVal $505 = $501.termRef(2);
            ESLVal $504 = $501.termRef(3);
            
            {ESLVal l = $503;
            
            {ESLVal target = $502;
            
            {ESLVal tl = $507;
            
            {ESLVal n = $506;
            
            {ESLVal ts = $505;
            
            {ESLVal args = $504;
            
            return sendType.apply(l,target,n,args,_v926,_v925,_v924,_v923);
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(19029,22897)").add(ESLVal.list(_v92)));
        }
        }
      case "SendTimeSuper": {ESLVal $500 = _v92.termRef(0);
          
          {ESLVal l = $500;
          
          return new ESLVal("VoidType",l);
        }
        }
      case "SendSuper": {ESLVal $499 = _v92.termRef(0);
          ESLVal $498 = _v92.termRef(1);
          
          {ESLVal l = $499;
          
          {ESLVal _v932 = $498;
          
          return new ESLVal("VoidType",l);
        }
        }
        }
      case "SetExp": {ESLVal $497 = _v92.termRef(0);
          ESLVal $496 = _v92.termRef(1);
          
          {ESLVal l = $497;
          
          {ESLVal es = $496;
          
          return setType.apply(l,es,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "StrExp": {ESLVal $495 = _v92.termRef(0);
          ESLVal $494 = _v92.termRef(1);
          
          {ESLVal l = $495;
          
          {ESLVal s = $494;
          
          return new ESLVal("StrType",l);
        }
        }
        }
      case "Term": {ESLVal $493 = _v92.termRef(0);
          ESLVal $492 = _v92.termRef(1);
          ESLVal $491 = _v92.termRef(2);
          ESLVal $490 = _v92.termRef(3);
          
          {ESLVal l = $493;
          
          {ESLVal n = $492;
          
          {ESLVal ts = $491;
          
          {ESLVal es = $490;
          
          return termType.apply(l,n,ts,es,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $489 = _v92.termRef(0);
          ESLVal $488 = _v92.termRef(1);
          ESLVal $487 = _v92.termRef(2);
          
          {ESLVal l = $489;
          
          {ESLVal t = $488;
          
          {ESLVal _v931 = $487;
          
          return throwType.apply(l,t,_v931,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "Try": {ESLVal $486 = _v92.termRef(0);
          ESLVal $485 = _v92.termRef(1);
          ESLVal $484 = _v92.termRef(2);
          
          {ESLVal l = $486;
          
          {ESLVal _v930 = $485;
          
          {ESLVal arms = $484;
          
          return tryType.apply(l,_v930,arms,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "New": {ESLVal $483 = _v92.termRef(0);
          ESLVal $482 = _v92.termRef(1);
          ESLVal $481 = _v92.termRef(2);
          
          {ESLVal l = $483;
          
          {ESLVal b = $482;
          
          {ESLVal args = $481;
          
          return newType.apply(l,b,args,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "NewArray": {ESLVal $480 = _v92.termRef(0);
          ESLVal $479 = _v92.termRef(1);
          ESLVal $478 = _v92.termRef(2);
          
          {ESLVal l = $480;
          
          {ESLVal t = $479;
          
          {ESLVal i = $478;
          
          return newArrayType.apply(l,t,i,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "NewTable": {ESLVal $477 = _v92.termRef(0);
          ESLVal $476 = _v92.termRef(1);
          ESLVal $475 = _v92.termRef(2);
          
          {ESLVal l = $477;
          
          {ESLVal key = $476;
          
          {ESLVal value = $475;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(_v923,key),substTypeEnv.apply(_v923,value));
        }
        }
        }
        }
      case "NewJava": {ESLVal $474 = _v92.termRef(0);
          ESLVal $473 = _v92.termRef(1);
          ESLVal $472 = _v92.termRef(2);
          ESLVal $471 = _v92.termRef(3);
          
          {ESLVal l = $474;
          
          {ESLVal path = $473;
          
          {ESLVal t = $472;
          
          {ESLVal args = $471;
          
          {{
          ESLVal _v93 = args;
          while(_v93.isCons()) {
            ESLVal a = _v93.headVal;
            expType.apply(a,_v926,_v925,_v924,_v923);
            _v93 = _v93.tailVal;}
        }
        return substTypeEnv.apply(_v923,t);}
        }
        }
        }
        }
        }
      case "Not": {ESLVal $470 = _v92.termRef(0);
          ESLVal $469 = _v92.termRef(1);
          
          {ESLVal l = $470;
          
          {ESLVal _v929 = $469;
          
          return notType.apply(l,_v929,_v926,_v925,_v924,_v923);
        }
        }
        }
      case "NullExp": {ESLVal $468 = _v92.termRef(0);
          
          {ESLVal l = $468;
          
          return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
        }
        }
      case "Update": {ESLVal $467 = _v92.termRef(0);
          ESLVal $466 = _v92.termRef(1);
          ESLVal $465 = _v92.termRef(2);
          
          {ESLVal l = $467;
          
          {ESLVal n = $466;
          
          {ESLVal _v928 = $465;
          
          return updateType.apply(l,n,_v928,_v926,_v925,_v924,_v923);
        }
        }
        }
        }
      case "Var": {ESLVal $464 = _v92.termRef(0);
          ESLVal $463 = _v92.termRef(1);
          
          {ESLVal l = $464;
          
          {ESLVal n = $463;
          
          return varType.apply(l,n,_v925);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19029,22897)").add(ESLVal.list(_v92)));
      }
      }
    }
  });
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v922 = $args[0];
  ESLVal _v921 = $args[1];
  ESLVal _v920 = $args[2];
  ESLVal _v919 = $args[3];
  ESLVal _v918 = $args[4];
  ESLVal _v917 = $args[5];
  ESLVal _v916 = $args[6];
  {ESLVal valType = expType.apply(_v920,_v919,_v918,_v917,_v916);
        
        return substTypeEnv.apply(_v916,_v921);
      }
    }
  });
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v915 = $args[0];
  ESLVal _v914 = $args[1];
  ESLVal _v913 = $args[2];
  ESLVal _v912 = $args[3];
  ESLVal _v911 = $args[4];
  ESLVal _v910 = $args[5];
  ESLVal _v909 = $args[6];
  {ESLVal eType = expType.apply(_v913,_v912,_v911,_v910,_v909);
        
        if(typeEqual.apply(substTypeEnv.apply(_v909,_v914),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",_v915,new ESLVal("fold type ").add(ppType.apply(_v914,_v909).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v909))))));
      }
    }
  });
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v908 = $args[0];
  ESLVal _v907 = $args[1];
  ESLVal _v906 = $args[2];
  ESLVal _v905 = $args[3];
  ESLVal _v904 = $args[4];
  ESLVal _v903 = $args[5];
  ESLVal _v902 = $args[6];
  ESLVal _v901 = $args[7];
  {ESLVal aType = expType.apply(_v907,_v904,_v903,_v902,_v901);
        ESLVal iType = expType.apply(_v906,_v904,_v903,_v902,_v901);
        ESLVal vType = expType.apply(_v905,_v904,_v903,_v902,_v901);
        
        {ESLVal _v91 = aType;
        
        switch(_v91.termName) {
        case "ArrayType": {ESLVal $462 = _v91.termRef(0);
          ESLVal $461 = _v91.termRef(1);
          
          {ESLVal al = $462;
          
          {ESLVal t = $461;
          
          if(isIntType.apply(iType).boolVal)
          if(typeEqual.apply(vType,t).boolVal)
            return aType;
            else
              return error(new ESLVal("TypeError",_v908,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
          else
            return error(new ESLVal("TypeError",_v908,new ESLVal("array index should be an integer ").add(_v906)));
        }
        }
        }
        default: {ESLVal t = _v91;
          
          return error(new ESLVal("TypeError",_v908,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v900 = $args[0];
  ESLVal _v899 = $args[1];
  ESLVal _v898 = $args[2];
  ESLVal _v897 = $args[3];
  ESLVal _v896 = $args[4];
  ESLVal _v895 = $args[5];
  ESLVal _v894 = $args[6];
  {ESLVal aType = expType.apply(_v899,_v897,_v896,_v895,_v894);
        ESLVal iType = expType.apply(_v898,_v897,_v896,_v895,_v894);
        
        {ESLVal _v90 = aType;
        
        switch(_v90.termName) {
        case "ArrayType": {ESLVal $460 = _v90.termRef(0);
          ESLVal $459 = _v90.termRef(1);
          
          {ESLVal al = $460;
          
          {ESLVal t = $459;
          
          if(isIntType.apply(iType).boolVal)
          return t;
          else
            return error(new ESLVal("TypeError",_v900,new ESLVal("array index should be an integer ").add(_v898)));
        }
        }
        }
        default: {ESLVal t = _v90;
          
          return error(new ESLVal("TypeError",_v900,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v893 = $args[0];
  ESLVal _v892 = $args[1];
  ESLVal _v891 = $args[2];
  ESLVal _v890 = $args[3];
  ESLVal _v889 = $args[4];
  ESLVal _v888 = $args[5];
  ESLVal _v887 = $args[6];
  {ESLVal i = expType.apply(_v891,_v890,_v889,_v888,_v887);
        
        if(isIntType.apply(i).boolVal)
        return new ESLVal("ArrayType",_v893,substTypeEnv.apply(_v887,_v892));
        else
          return error(new ESLVal("TypeError",_v893,new ESLVal("expecting an integer type: ").add(i)));
      }
    }
  });
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v886 = $args[0];
  ESLVal _v885 = $args[1];
  ESLVal _v884 = $args[2];
  ESLVal _v883 = $args[3];
  ESLVal _v882 = $args[4];
  ESLVal _v881 = $args[5];
  {ESLVal bType = expType.apply(_v885,_v884,_v883,_v882,_v881);
        
        if(typeEqual.apply(bType,_v884).boolVal)
        return bType;
        else
          return error(new ESLVal("TypeError",_v886,new ESLVal("expecting become to match self type: ").add(ppType.apply(bType,_v881).add(new ESLVal(" ").add(ppType.apply(_v884,_v881))))));
      }
    }
  });
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v877 = $args[0];
  ESLVal _v876 = $args[1];
  ESLVal _v875 = $args[2];
  ESLVal _v874 = $args[3];
  ESLVal _v873 = $args[4];
  ESLVal _v872 = $args[5];
  ESLVal _v871 = $args[6];
  ESLVal _v870 = $args[7];
  ESLVal _v869 = $args[8];
  {ESLVal pt = expType.apply(_v876,_v872,_v871,_v870,_v869);
        
        if(isIntType.apply(pt).boolVal)
        {ESLVal _v880 = substTypeEnv.apply(_v869,_v875);
          ESLVal _v879 = expType.apply(_v874,_v872,_v871,_v870,_v869);
          ESLVal _v878 = expType.apply(_v873,_v872,_v871,_v870,_v869);
          
          if(typeEqual.apply(_v880,_v879).and(typeEqual.apply(_v880,_v878)).boolVal)
          return _v880;
          else
            return error(new ESLVal("TypeError",_v877,new ESLVal("expecting probably arm types to agree: ").add(ppType.apply(_v879,_v869).add(new ESLVal(" ").add(ppType.apply(_v880,_v869).add(new ESLVal(" ").add(ppType.apply(_v878,_v869))))))));
        }
        else
          return error(new ESLVal("TypeError",_v877,new ESLVal("expecting an integer: ").add(ppType.apply(pt,_v869))));
      }
    }
  });
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v868 = $args[0];
  ESLVal _v867 = $args[1];
  ESLVal _v866 = $args[2];
  ESLVal _v865 = $args[3];
  ESLVal _v864 = $args[4];
  ESLVal _v863 = $args[5];
  ESLVal _v862 = $args[6];
  return expType.apply(new ESLVal("Apply",_v868,_v867,_v866),_v865,_v864,_v863,_v862);
    }
  });
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v851 = $args[0];
  ESLVal _v850 = $args[1];
  ESLVal _v849 = $args[2];
  ESLVal _v848 = $args[3];
  ESLVal _v847 = $args[4];
  ESLVal _v846 = $args[5];
  ESLVal _v845 = $args[6];
  ESLVal _v844 = $args[7];
  {ESLVal _v87 = typeNF.apply(derefType.apply(expType.apply(_v850,_v847,_v846,_v845,_v844)),_v844);
        
        switch(_v87.termName) {
        case "ActType": {ESLVal $438 = _v87.termRef(0);
          ESLVal $437 = _v87.termRef(1);
          ESLVal $436 = _v87.termRef(2);
          
          {ESLVal al = $438;
          
          {ESLVal exports = $437;
          
          {ESLVal handlers = $436;
          
          LetRec letrec = new LetRec() {
          ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v852 = $args[0];
            {ESLVal _v88 = _v852;
                  
                  if(_v88.isCons())
                  {ESLVal $439 = _v88.head();
                    ESLVal $440 = _v88.tail();
                    
                    switch($439.termName) {
                    case "MessageType": {ESLVal $442 = $439.termRef(0);
                      ESLVal $441 = $439.termRef(1);
                      
                      if($441.isCons())
                      {ESLVal $443 = $441.head();
                        ESLVal $444 = $441.tail();
                        
                        switch($443.termName) {
                        case "TermType": {ESLVal $447 = $443.termRef(0);
                          ESLVal $446 = $443.termRef(1);
                          ESLVal $445 = $443.termRef(2);
                          
                          if($444.isCons())
                          {ESLVal $448 = $444.head();
                            ESLVal $449 = $444.tail();
                            
                            {ESLVal m = $439;
                            
                            {ESLVal _v853 = $440;
                            
                            return findHandler.apply(_v853);
                          }
                          }
                          }
                        else if($444.isNil())
                          {ESLVal ml = $442;
                            
                            {ESLVal tl = $447;
                            
                            {ESLVal m = $446;
                            
                            {ESLVal ts = $445;
                            
                            {ESLVal rest = $440;
                            
                            if(m.eql(_v849).boolVal)
                            return head.apply(_v852);
                            else
                              {ESLVal _v854 = $439;
                                
                                {ESLVal _v855 = $440;
                                
                                return findHandler.apply(_v855);
                              }
                              }
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal m = $439;
                            
                            {ESLVal _v856 = $440;
                            
                            return findHandler.apply(_v856);
                          }
                          }
                        }
                        default: {ESLVal m = $439;
                          
                          {ESLVal _v857 = $440;
                          
                          return findHandler.apply(_v857);
                        }
                        }
                      }
                      }
                    else if($441.isNil())
                      {ESLVal m = $439;
                        
                        {ESLVal _v858 = $440;
                        
                        return findHandler.apply(_v858);
                      }
                      }
                    else {ESLVal m = $439;
                        
                        {ESLVal _v859 = $440;
                        
                        return findHandler.apply(_v859);
                      }
                      }
                    }
                    default: {ESLVal m = $439;
                      
                      {ESLVal _v860 = $440;
                      
                      return findHandler.apply(_v860);
                    }
                    }
                  }
                  }
                else if(_v88.isNil())
                  return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849)));
                else return error(new ESLVal("case error at Pos(26502,26809)").add(ESLVal.list(_v88)));
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
        
          {ESLVal _v89 = findHandler.apply(handlers);
          
          switch(_v89.termName) {
          case "MessageType": {ESLVal $451 = _v89.termRef(0);
            ESLVal $450 = _v89.termRef(1);
            
            if($450.isCons())
            {ESLVal $452 = $450.head();
              ESLVal $453 = $450.tail();
              
              switch($452.termName) {
              case "TermType": {ESLVal $456 = $452.termRef(0);
                ESLVal $455 = $452.termRef(1);
                ESLVal $454 = $452.termRef(2);
                
                if($453.isCons())
                {ESLVal $457 = $453.head();
                  ESLVal $458 = $453.tail();
                  
                  {ESLVal m = _v89;
                  
                  return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
                }
                }
              else if($453.isNil())
                {ESLVal ml = $451;
                  
                  {ESLVal tl = $456;
                  
                  {ESLVal _v861 = $455;
                  
                  {ESLVal ts1 = $454;
                  
                  {ESLVal ts2 = expTypes.apply(_v848,_v847,_v846,_v845,_v844);
                  
                  if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                  if(subTypes.apply(ts2,ts1).boolVal)
                    {expType.apply(_v850,_v847,_v846,_v845,_v844);
                    return new ESLVal("VoidType",_v851);}
                    else
                      return error(new ESLVal("TypeError",_v851,new ESLVal("message argument types ").add(ppTypes.apply(ts2,_v844).add(new ESLVal(" do not match expected types ").add(ppTypes.apply(ts1,_v844))))));
                  else
                    return error(new ESLVal("TypeError",_v851,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
                }
                }
                }
                }
                }
              else {ESLVal m = _v89;
                  
                  return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
                }
              }
              default: {ESLVal m = _v89;
                
                return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            }
          else if($450.isNil())
            {ESLVal m = _v89;
              
              return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
            }
          else {ESLVal m = _v89;
              
              return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          default: {ESLVal m = _v89;
            
            return error(new ESLVal("TypeError",_v851,new ESLVal("cannot find message handler named ").add(_v849.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        }
        
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(26287,27635)").add(ESLVal.list(_v87)));
      }
      }
    }
  });
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v801 = $args[0];
  ESLVal _v800 = $args[1];
  ESLVal _v799 = $args[2];
  ESLVal _v798 = $args[3];
  ESLVal _v797 = $args[4];
  ESLVal _v796 = $args[5];
  ESLVal _v795 = $args[6];
  ESLVal _v794 = $args[7];
  ESLVal _v793 = $args[8];
  ESLVal _v792 = $args[9];
  ESLVal _v791 = $args[10];
  ESLVal _v790 = $args[11];
  LetRec letrec = new LetRec() {
        ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v834 = $args[0];
          ESLVal _v833 = $args[1];
          {ESLVal _v86 = _v833;
                
                if(_v86.isCons())
                {ESLVal $422 = _v86.head();
                  ESLVal $423 = _v86.tail();
                  
                  switch($422.termName) {
                  case "Binding": {ESLVal $435 = $422.termRef(0);
                    ESLVal $434 = $422.termRef(1);
                    ESLVal $433 = $422.termRef(2);
                    ESLVal $432 = $422.termRef(3);
                    ESLVal $431 = $422.termRef(4);
                    
                    {ESLVal _v838 = $435;
                    
                    {ESLVal m = $434;
                    
                    {ESLVal t = $433;
                    
                    {ESLVal st = $432;
                    
                    {ESLVal e = $431;
                    
                    {ESLVal _v839 = $423;
                    
                    if(m.eql(_v834).boolVal)
                    return _v838;
                    else
                      {ESLVal b = $422;
                        
                        {ESLVal _v840 = $423;
                        
                        return findLoc.apply(_v834,_v840);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $430 = $422.termRef(0);
                    ESLVal $429 = $422.termRef(1);
                    ESLVal $428 = $422.termRef(2);
                    ESLVal $427 = $422.termRef(3);
                    ESLVal $426 = $422.termRef(4);
                    ESLVal $425 = $422.termRef(5);
                    ESLVal $424 = $422.termRef(6);
                    
                    {ESLVal _v835 = $430;
                    
                    {ESLVal m = $429;
                    
                    {ESLVal ps = $428;
                    
                    {ESLVal t = $427;
                    
                    {ESLVal st = $426;
                    
                    {ESLVal g = $425;
                    
                    {ESLVal e = $424;
                    
                    {ESLVal _v836 = $423;
                    
                    if(m.eql(_v834).boolVal)
                    return _v835;
                    else
                      {ESLVal b = $422;
                        
                        {ESLVal _v837 = $423;
                        
                        return findLoc.apply(_v834,_v837);
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
                  default: {ESLVal b = $422;
                    
                    {ESLVal _v841 = $423;
                    
                    return findLoc.apply(_v834,_v841);
                  }
                  }
                }
                }
              else if(_v86.isNil())
                return p0;
              else return error(new ESLVal("case error at Pos(28145,28449)").add(ESLVal.list(_v86)));
              }
            }
          });
        ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v825 = $args[0];
          ESLVal _v824 = $args[1];
          {ESLVal _v85 = _v824;
                
                if(_v85.isCons())
                {ESLVal $408 = _v85.head();
                  ESLVal $409 = _v85.tail();
                  
                  switch($408.termName) {
                  case "Binding": {ESLVal $421 = $408.termRef(0);
                    ESLVal $420 = $408.termRef(1);
                    ESLVal $419 = $408.termRef(2);
                    ESLVal $418 = $408.termRef(3);
                    ESLVal $417 = $408.termRef(4);
                    
                    {ESLVal _v829 = $421;
                    
                    {ESLVal m = $420;
                    
                    {ESLVal t = $419;
                    
                    {ESLVal st = $418;
                    
                    {ESLVal e = $417;
                    
                    {ESLVal _v830 = $409;
                    
                    if(m.eql(_v825).boolVal)
                    return substTypeEnv.apply(_v790,t);
                    else
                      {ESLVal b = $408;
                        
                        {ESLVal _v831 = $409;
                        
                        return findType.apply(_v825,_v831);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $416 = $408.termRef(0);
                    ESLVal $415 = $408.termRef(1);
                    ESLVal $414 = $408.termRef(2);
                    ESLVal $413 = $408.termRef(3);
                    ESLVal $412 = $408.termRef(4);
                    ESLVal $411 = $408.termRef(5);
                    ESLVal $410 = $408.termRef(6);
                    
                    {ESLVal _v826 = $416;
                    
                    {ESLVal m = $415;
                    
                    {ESLVal ps = $414;
                    
                    {ESLVal t = $413;
                    
                    {ESLVal st = $412;
                    
                    {ESLVal g = $411;
                    
                    {ESLVal e = $410;
                    
                    {ESLVal _v827 = $409;
                    
                    if(m.eql(_v825).boolVal)
                    return substTypeEnv.apply(_v790,t);
                    else
                      {ESLVal b = $408;
                        
                        {ESLVal _v828 = $409;
                        
                        return findType.apply(_v825,_v828);
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
                  default: {ESLVal b = $408;
                    
                    {ESLVal _v832 = $409;
                    
                    return findType.apply(_v825,_v832);
                  }
                  }
                }
                }
              else if(_v85.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(28503,28860)").add(ESLVal.list(_v85)));
              }
            }
          });
        ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v820 = $args[0];
          {ESLVal _v84 = _v820;
                
                if(_v84.isCons())
                {ESLVal $406 = _v84.head();
                  ESLVal $407 = _v84.tail();
                  
                  {ESLVal m = $406;
                  
                  {ESLVal _v821 = $407;
                  
                  {ESLVal _v823 = findType.apply(m,_v796);
                  ESLVal _v822 = findLoc.apply(m,_v796);
                  
                  if(_v823.eql($null).boolVal)
                  return error(new ESLVal("TypeError",_v822,new ESLVal("cannot find exported name ").add(m)));
                  else
                    return decs.apply(_v821).cons(new ESLVal("Dec",_v822,m,_v823,_v823));
                }
                }
                }
                }
              else if(_v84.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(28902,29233)").add(ESLVal.list(_v84)));
              }
            }
          });
        ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v817 = $args[0];
          {ESLVal _v83 = _v817;
                
                if(_v83.isCons())
                {ESLVal $400 = _v83.head();
                  ESLVal $401 = _v83.tail();
                  
                  switch($400.termName) {
                  case "BArm": {ESLVal $405 = $400.termRef(0);
                    ESLVal $404 = $400.termRef(1);
                    ESLVal $403 = $400.termRef(2);
                    ESLVal $402 = $400.termRef(3);
                    
                    {ESLVal _v818 = $405;
                    
                    {ESLVal ps = $404;
                    
                    {ESLVal g = $403;
                    
                    {ESLVal e = $402;
                    
                    {ESLVal _v819 = $401;
                    
                    return getMessageTypes.apply(_v819).cons(getMessageType.apply(ps));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(29284,29439)").add(ESLVal.list(_v83)));
                }
                }
              else if(_v83.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(29284,29439)").add(ESLVal.list(_v83)));
              }
            }
          });
        ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ps = $args[0];
          {ESLVal _v82 = ps;
                
                if(_v82.isCons())
                {ESLVal $392 = _v82.head();
                  ESLVal $393 = _v82.tail();
                  
                  switch($392.termName) {
                  case "PTerm": {ESLVal $397 = $392.termRef(0);
                    ESLVal $396 = $392.termRef(1);
                    ESLVal $395 = $392.termRef(2);
                    ESLVal $394 = $392.termRef(3);
                    
                    if($393.isCons())
                    {ESLVal $398 = $393.head();
                      ESLVal $399 = $393.tail();
                      
                      return error(new ESLVal("case error at Pos(29489,29760)").add(ESLVal.list(_v82)));
                    }
                  else if($393.isNil())
                    {ESLVal pl = $397;
                      
                      {ESLVal termName = $396;
                      
                      {ESLVal targs = $395;
                      
                      {ESLVal _v816 = $394;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun2907"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v801,p,_v793,_v792,_v791,_v790);
                          }
                        }),_v816);
                      
                      return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(29489,29760)").add(ESLVal.list(_v82)));
                  }
                  default: return error(new ESLVal("case error at Pos(29489,29760)").add(ESLVal.list(_v82)));
                }
                }
              else if(_v82.isNil())
                return error(new ESLVal("case error at Pos(29489,29760)").add(ESLVal.list(_v82)));
              else return error(new ESLVal("case error at Pos(29489,29760)").add(ESLVal.list(_v82)));
              }
            }
          });
        ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v813 = $args[0];
          ESLVal _v812 = $args[1];
          ESLVal _v811 = $args[2];
          {ESLVal _v81 = _v813;
                
                if(_v81.isCons())
                {ESLVal $386 = _v81.head();
                  ESLVal $387 = _v81.tail();
                  
                  switch($386.termName) {
                  case "BArm": {ESLVal $391 = $386.termRef(0);
                    ESLVal $390 = $386.termRef(1);
                    ESLVal $389 = $386.termRef(2);
                    ESLVal $388 = $386.termRef(3);
                    
                    {ESLVal _v814 = $391;
                    
                    {ESLVal ps = $390;
                    
                    {ESLVal g = $389;
                    
                    {ESLVal e = $388;
                    
                    {ESLVal _v815 = $387;
                    
                    {typeCheckArm.apply(_v814,ps,g,e,_v812,_v811);
                  return typeCheckArms.apply(_v815,_v812,_v811);}
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(29836,30063)").add(ESLVal.list(_v81)));
                }
                }
              else if(_v81.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(29836,30063)").add(ESLVal.list(_v81)));
              }
            }
          });
        ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v807 = $args[0];
          ESLVal _v806 = $args[1];
          ESLVal _v805 = $args[2];
          ESLVal _v804 = $args[3];
          ESLVal _v803 = $args[4];
          ESLVal _v802 = $args[5];
          {ESLVal _v80 = _v806;
                
                if(_v80.isCons())
                {ESLVal $378 = _v80.head();
                  ESLVal $379 = _v80.tail();
                  
                  switch($378.termName) {
                  case "PTerm": {ESLVal $383 = $378.termRef(0);
                    ESLVal $382 = $378.termRef(1);
                    ESLVal $381 = $378.termRef(2);
                    ESLVal $380 = $378.termRef(3);
                    
                    if($379.isCons())
                    {ESLVal $384 = $379.head();
                      ESLVal $385 = $379.tail();
                      
                      return error(new ESLVal("case error at Pos(30162,30611)").add(ESLVal.list(_v80)));
                    }
                  else if($379.isNil())
                    {ESLVal pl = $383;
                      
                      {ESLVal termName = $382;
                      
                      {ESLVal targs = $381;
                      
                      {ESLVal _v808 = $380;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun2908"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v807,p,_v803,_v802,_v791,_v790);
                          }
                        }),_v808);
                      
                      {patternTypes.apply(_v807,_v808,ts,_v803,_v802,_v791,_v790,new ESLVal(new Function(new ESLVal("fun2909"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v810 = $args[0];
                    ESLVal _v809 = $args[1];
                    return expType.apply(_v804,_v803,_v809,_v791,_v790);
                      }
                    }));
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(30162,30611)").add(ESLVal.list(_v80)));
                  }
                  default: return error(new ESLVal("case error at Pos(30162,30611)").add(ESLVal.list(_v80)));
                }
                }
              else if(_v80.isNil())
                return error(new ESLVal("case error at Pos(30162,30611)").add(ESLVal.list(_v80)));
              else return error(new ESLVal("case error at Pos(30162,30611)").add(ESLVal.list(_v80)));
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
            if(_v798.eql($null).boolVal)
              return actType0;
              else
                return expType.apply(_v798,_v793,_v792,_v791,_v790);
          }).get();
        ESLVal localEnv = parBind.apply(_v796,_v793,_v792,_v791,_v790);
        
        {ESLVal exportedDecs = decs.apply(_v797);
        
        {ESLVal messageTypes = getMessageTypes.apply(_v794);
        
        {ESLVal _v843 = new ESLVal("ExtendedAct",_v801,parentType,exportedDecs,messageTypes);
        ESLVal _v842 = ESLVal.list(new ESLVal("Map",new ESLVal("$super"),parentType));
        
        {typeCheckExports.apply(_v801,exportedDecs,_v796,_v843,localEnv.add(_v792),_v790,_v791);
      typeCheckValues.apply(valueDefs.apply(_v796),_v843,_v842.add(localEnv.add(_v792)),_v790,_v791);
      expType.apply(_v795,_v843,_v842.add(localEnv.add(_v792)),_v791,_v790);
      typeCheckArms.apply(_v794,_v843,_v842.add(localEnv.add(_v792)));
      return _v843;}
      }
      }
      }
      }
      
    }
  });
  private static ESLVal typeCheckExports = new ESLVal(new Function(new ESLVal("typeCheckExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v789 = $args[0];
  ESLVal _v788 = $args[1];
  ESLVal _v787 = $args[2];
  ESLVal _v786 = $args[3];
  ESLVal _v785 = $args[4];
  ESLVal _v784 = $args[5];
  ESLVal _v783 = $args[6];
  {{
        ESLVal _v79 = _v788;
        while(_v79.isCons()) {
          ESLVal e = _v79.headVal;
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun2910"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal b = $args[0];
          return bindingName.apply(b).eql(decName.apply(e)).and(typeEqual.apply(lookupType.apply(decName.apply(e),_v785),decType.apply(e)));
            }
          }),_v787).boolVal)
            {}
            else
              error(new ESLVal("TypeError",_v789,new ESLVal(" cannot find export for ").add(decName.apply(e))));
          _v79 = _v79.tailVal;}
      }
      return $null;}
    }
  });
  private static ESLVal bTypeExports = new ESLVal(new Function(new ESLVal("bTypeExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v78 = t;
        
        switch(_v78.termName) {
        case "ExtendedAct": {ESLVal $377 = _v78.termRef(0);
          ESLVal $376 = _v78.termRef(1);
          ESLVal $375 = _v78.termRef(2);
          ESLVal $374 = _v78.termRef(3);
          
          {ESLVal l = $377;
          
          {ESLVal parent = $376;
          
          {ESLVal exports = $375;
          
          {ESLVal message = $374;
          
          return bTypeExports.apply(parent).add(exports);
        }
        }
        }
        }
        }
      case "ActType": {ESLVal $373 = _v78.termRef(0);
          ESLVal $372 = _v78.termRef(1);
          ESLVal $371 = _v78.termRef(2);
          
          {ESLVal l = $373;
          
          {ESLVal exports = $372;
          
          {ESLVal message = $371;
          
          return exports;
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $370 = _v78.termRef(0);
          
          {ESLVal f = $370;
          
          return bTypeExports.apply(f.apply());
        }
        }
      case "RecType": {ESLVal $369 = _v78.termRef(0);
          ESLVal $368 = _v78.termRef(1);
          ESLVal $367 = _v78.termRef(2);
          
          {ESLVal l = $369;
          
          {ESLVal n = $368;
          
          {ESLVal _v782 = $367;
          
          return bTypeExports.apply(substType.apply(new ESLVal("RecType",l,n,_v782),n,_v782));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(32007,32417)").add(ESLVal.list(_v78)));
      }
      }
    }
  });
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v774 = $args[0];
  ESLVal _v773 = $args[1];
  ESLVal _v772 = $args[2];
  ESLVal _v771 = $args[3];
  ESLVal _v770 = $args[4];
  ESLVal _v769 = $args[5];
  ESLVal _v768 = $args[6];
  {ESLVal _v76 = _v772;
        
        if(_v76.isCons())
        {ESLVal $358 = _v76.head();
          ESLVal $359 = _v76.tail();
          
          switch($358.termName) {
          case "BQual": {ESLVal $364 = $358.termRef(0);
            ESLVal $363 = $358.termRef(1);
            ESLVal $362 = $358.termRef(2);
            
            {ESLVal _v777 = $364;
            
            {ESLVal p = $363;
            
            {ESLVal list = $362;
            
            {ESLVal _v778 = $359;
            
            {ESLVal lType = expType.apply(list,_v771,_v770,_v769,_v768);
            
            {ESLVal _v77 = lType;
            
            switch(_v77.termName) {
            case "ListType": {ESLVal $366 = _v77.termRef(0);
              ESLVal $365 = _v77.termRef(1);
              
              {ESLVal ll = $366;
              
              {ESLVal t = $365;
              
              {ESLVal _v779 = _v778;
              
              return patternType.apply(_v777,p,substTypeEnv.apply(_v768,t),_v771,_v770,_v769,_v768,new ESLVal(new Function(new ESLVal("fun2911"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v781 = $args[0];
              ESLVal _v780 = $args[1];
              return cmpType.apply(_v777,_v773,_v779,_v771,_v780,_v769,_v768);
                }
              }));
            }
            }
            }
            }
            default: {ESLVal t = _v77;
              
              return error(new ESLVal("TypeError",_v777,new ESLVal("qualifier binding expects a list: ").add(ppType.apply(t,_v768))));
            }
          }
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $361 = $358.termRef(0);
            ESLVal $360 = $358.termRef(1);
            
            {ESLVal _v775 = $361;
            
            {ESLVal b = $360;
            
            {ESLVal _v776 = $359;
            
            {ESLVal bType = expType.apply(b,_v771,_v770,_v769,_v768);
            
            if(isBoolType.apply(bType).boolVal)
            return cmpType.apply(_v775,_v773,_v776,_v771,_v770,_v769,_v768);
            else
              return error(new ESLVal("TypeError",_v775,new ESLVal("qualifier expects a boolean type: ").add(ppType.apply(bType,_v768))));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(32528,33514)").add(ESLVal.list(_v76)));
        }
        }
      else if(_v76.isNil())
        {ESLVal t = expType.apply(_v773,_v771,_v770,_v769,_v768);
          
          return new ESLVal("ListType",_v774,t);
        }
      else return error(new ESLVal("case error at Pos(32528,33514)").add(ESLVal.list(_v76)));
      }
    }
  });
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v767 = $args[0];
  ESLVal _v766 = $args[1];
  ESLVal _v765 = $args[2];
  ESLVal _v764 = $args[3];
  ESLVal _v763 = $args[4];
  ESLVal _v762 = $args[5];
  ESLVal _v761 = $args[6];
  {ESLVal t = lookupType.apply(_v766,_v763);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v767,new ESLVal("unbound variable ").add(_v766)));
        else
          {ESLVal valueType = expType.apply(_v765,_v764,_v763,_v762,_v761);
            
            if(typeEqual.apply(valueType,t).boolVal)
            return valueType;
            else
              return error(new ESLVal("TypeError",_v767,new ESLVal("type of variable ").add(_v766.add(new ESLVal("::").add(ppType.apply(t,_v761).add(new ESLVal(" does not agree with value type ").add(ppType.apply(valueType,_v761))))))));
          }
      }
    }
  });
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v760 = $args[0];
  ESLVal _v759 = $args[1];
  ESLVal _v758 = $args[2];
  ESLVal _v757 = $args[3];
  ESLVal _v756 = $args[4];
  ESLVal _v755 = $args[5];
  ESLVal _v754 = $args[6];
  {ESLVal env = parBind.apply(_v759,_v757,_v756,_v755,_v754);
        
        {{
        ESLVal _v75 = _v759;
        while(_v75.isCons()) {
          ESLVal b = _v75.headVal;
          typeCheckDef.apply(b,_v757,_v756,env.add(_v756),_v755,_v754);
          _v75 = _v75.tailVal;}
      }
      return expType.apply(_v758,_v757,env.add(_v756),_v755,_v754);}
      }
    }
  });
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v753 = $args[0];
  ESLVal _v752 = $args[1];
  ESLVal _v751 = $args[2];
  ESLVal _v750 = $args[3];
  ESLVal _v749 = $args[4];
  ESLVal _v748 = $args[5];
  ESLVal _v747 = $args[6];
  {ESLVal env = recBind.apply(_v752,_v750,_v749,_v748,_v747);
        
        {{
        ESLVal _v74 = _v752;
        while(_v74.isCons()) {
          ESLVal b = _v74.headVal;
          typeCheckDef.apply(b,_v750,env.add(_v749),env.add(_v749),_v748,_v747);
          _v74 = _v74.tailVal;}
      }
      return expType.apply(_v751,_v750,env.add(_v749),_v748,_v747);}
      }
    }
  });
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal bs = $args[0];
  {ESLVal _v72 = bs;
        
        if(_v72.isCons())
        {ESLVal $356 = _v72.head();
          ESLVal $357 = _v72.tail();
          
          {ESLVal b = $356;
          
          {ESLVal _v745 = $357;
          
          if(member.apply(bindingName.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v73 = $qualArg;
              
              {ESLVal _v746 = _v73;
              
              return ESLVal.list(ESLVal.list(bindingName.apply(_v746)));
            }
            }
          }
        }).map(_v745).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",bindingLoc.apply(b),new ESLVal("duplicate definitions for ").add(bindingName.apply(b))));
          else
            return checkDupBindings.apply(_v745);
        }
        }
        }
      else if(_v72.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(34762,35027)").add(ESLVal.list(_v72)));
      }
    }
  });
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v744 = $args[0];
  ESLVal _v743 = $args[1];
  ESLVal _v742 = $args[2];
  ESLVal _v741 = $args[3];
  ESLVal _v740 = $args[4];
  {checkDupBindings.apply(_v744);
      return valueDefsToTEnv.apply(valueDefs.apply(_v744),_v743,_v742,_v741,_v740);}
    }
  });
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v739 = $args[0];
  ESLVal _v738 = $args[1];
  ESLVal _v737 = $args[2];
  ESLVal _v736 = $args[3];
  ESLVal _v735 = $args[4];
  return valueDefsToTEnv.apply(valueDefs.apply(_v739),_v738,_v737,_v736,_v735);
    }
  });
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v734 = $args[0];
  ESLVal _v733 = $args[1];
  ESLVal _v732 = $args[2];
  ESLVal _v731 = $args[3];
  ESLVal _v730 = $args[4];
  ESLVal _v729 = $args[5];
  ESLVal _v728 = $args[6];
  {ESLVal ts1 = expTypes.apply(_v733,_v731,_v730,_v729,_v728);
        
        {ESLVal ts2 = armTypes.apply(_v732,ts1,_v731,_v730,_v729,_v728);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v734,new ESLVal("case arm types do not agree: ").add(ppTypes.apply(ts1,_v728).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v728))))));
      }
      }
    }
  });
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v727 = $args[0];
  ESLVal _v726 = $args[1];
  ESLVal _v725 = $args[2];
  ESLVal _v724 = $args[3];
  ESLVal _v723 = $args[4];
  ESLVal _v722 = $args[5];
  ESLVal _v721 = $args[6];
  {ESLVal ts1 = expTypes.apply(ESLVal.list(_v726),_v724,_v723,_v722,_v721);
        
        {ESLVal ts2 = armTypes.apply(_v725,ts1,_v724,_v723,_v722,_v721);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v727,new ESLVal("try arm types do not agree: ").add(ppTypes.apply(ts1,_v721).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v721))))));
      }
      }
    }
  });
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v719 = $args[0];
  ESLVal _v718 = $args[1];
  ESLVal _v717 = $args[2];
  ESLVal _v716 = $args[3];
  ESLVal _v715 = $args[4];
  ESLVal _v714 = $args[5];
  {ESLVal _v71 = _v719;
        
        if(_v71.isCons())
        {ESLVal $354 = _v71.head();
          ESLVal $355 = _v71.tail();
          
          {ESLVal a = $354;
          
          {ESLVal _v720 = $355;
          
          return armTypes.apply(_v720,_v718,_v717,_v716,_v715,_v714).cons(armType.apply(a,_v718,_v717,_v716,_v715,_v714));
        }
        }
        }
      else if(_v71.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(36392,36561)").add(ESLVal.list(_v71)));
      }
    }
  });
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v711 = $args[0];
  ESLVal _v710 = $args[1];
  ESLVal _v709 = $args[2];
  ESLVal _v708 = $args[3];
  ESLVal _v707 = $args[4];
  ESLVal _v706 = $args[5];
  {ESLVal _v70 = _v711;
        
        switch(_v70.termName) {
        case "BArm": {ESLVal $353 = _v70.termRef(0);
          ESLVal $352 = _v70.termRef(1);
          ESLVal $351 = _v70.termRef(2);
          ESLVal $350 = _v70.termRef(3);
          
          {ESLVal l = $353;
          
          {ESLVal ps = $352;
          
          {ESLVal guard = $351;
          
          {ESLVal exp = $350;
          
          {checkPatterns.apply(l,ps);
        if(length.apply(ps).eql(length.apply(_v710)).boolVal)
          return patternTypes.apply(l,ps,_v710,_v709,_v708,_v707,_v706,new ESLVal(new Function(new ESLVal("fun2912"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v713 = $args[0];
            ESLVal _v712 = $args[1];
            return guardedExpType.apply(l,guard,exp,_v709,_v712,_v707,_v706);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(_v710))))));}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(36663,37124)").add(ESLVal.list(_v70)));
      }
      }
    }
  });
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v676 = $args[0];
  ESLVal _v675 = $args[1];
  ESLVal _v674 = $args[2];
  ESLVal _v673 = $args[3];
  ESLVal _v672 = $args[4];
  ESLVal _v671 = $args[5];
  ESLVal _v670 = $args[6];
  LetRec letrec = new LetRec() {
        ESLVal t = derefType.apply(expType.apply(_v675,_v673,_v672,_v671,_v670));
        ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal decs = $args[0];
          {ESLVal _v68 = decs;
                
                if(_v68.isCons())
                {ESLVal $333 = _v68.head();
                  ESLVal $334 = _v68.tail();
                  
                  switch($333.termName) {
                  case "Dec": {ESLVal $338 = $333.termRef(0);
                    ESLVal $337 = $333.termRef(1);
                    ESLVal $336 = $333.termRef(2);
                    ESLVal $335 = $333.termRef(3);
                    
                    {ESLVal _v682 = $338;
                    
                    {ESLVal m = $337;
                    
                    {ESLVal t = $336;
                    
                    {ESLVal st = $335;
                    
                    {ESLVal _v683 = $334;
                    
                    if(m.eql(_v674).boolVal)
                    return t;
                    else
                      {ESLVal d = $333;
                        
                        {ESLVal _v684 = $334;
                        
                        return findExport.apply(_v684);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal d = $333;
                    
                    {ESLVal _v685 = $334;
                    
                    return findExport.apply(_v685);
                  }
                  }
                }
                }
              else if(_v68.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(37352,37525)").add(ESLVal.list(_v68)));
              }
            }
          });
        ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal fs = $args[0];
          {ESLVal _v67 = fs;
                
                if(_v67.isCons())
                {ESLVal $327 = _v67.head();
                  ESLVal $328 = _v67.tail();
                  
                  switch($327.termName) {
                  case "Dec": {ESLVal $332 = $327.termRef(0);
                    ESLVal $331 = $327.termRef(1);
                    ESLVal $330 = $327.termRef(2);
                    ESLVal $329 = $327.termRef(3);
                    
                    {ESLVal _v677 = $332;
                    
                    {ESLVal m = $331;
                    
                    {ESLVal t = $330;
                    
                    {ESLVal ds = $329;
                    
                    {ESLVal _v678 = $328;
                    
                    if(m.eql(_v674).boolVal)
                    return t;
                    else
                      {ESLVal _v679 = $327;
                        
                        {ESLVal _v680 = $328;
                        
                        return findField.apply(_v680);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t = $327;
                    
                    {ESLVal _v681 = $328;
                    
                    return findField.apply(_v681);
                  }
                  }
                }
                }
              else if(_v67.isNil())
                return error(new ESLVal("TypeError",_v676,new ESLVal("cannot find field name ").add(_v674)));
              else return error(new ESLVal("case error at Pos(37566,37774)").add(ESLVal.list(_v67)));
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
      
        {ESLVal _v69 = typeNF.apply(t,_v670);
        
        switch(_v69.termName) {
        case "StrType": {ESLVal $349 = _v69.termRef(0);
          
          {ESLVal sl = $349;
          
          if(_v674.eql(new ESLVal("explode")).boolVal)
          return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
          else
            {ESLVal _v703 = $349;
              
              if(_v674.eql(new ESLVal("writeDate")).boolVal)
              return new ESLVal("FloatType",_v703);
              else
                {ESLVal _v704 = _v69;
                  
                  return error(new ESLVal("TypeError",_v676,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v704,_v670))));
                }
            }
        }
        }
      case "TableType": {ESLVal $348 = _v69.termRef(0);
          ESLVal $347 = _v69.termRef(1);
          ESLVal $346 = _v69.termRef(2);
          
          {ESLVal _v689 = $348;
          
          {ESLVal k = $347;
          
          {ESLVal v = $346;
          
          if(_v674.eql(new ESLVal("get")).boolVal)
          return new ESLVal("FunType",_v689,ESLVal.list(k),v);
          else
            {ESLVal _v690 = $348;
              
              {ESLVal _v691 = $347;
              
              {ESLVal _v692 = $346;
              
              if(_v674.eql(new ESLVal("put")).boolVal)
              return new ESLVal("FunType",_v690,ESLVal.list(_v691,_v692),t);
              else
                {ESLVal _v693 = $348;
                  
                  {ESLVal _v694 = $347;
                  
                  {ESLVal _v695 = $346;
                  
                  if(_v674.eql(new ESLVal("keys")).boolVal)
                  return new ESLVal("ListType",_v693,_v694);
                  else
                    {ESLVal _v696 = $348;
                      
                      {ESLVal _v697 = $347;
                      
                      {ESLVal _v698 = $346;
                      
                      if(_v674.eql(new ESLVal("vals")).boolVal)
                      return new ESLVal("ListType",_v696,_v698);
                      else
                        {ESLVal _v699 = $348;
                          
                          {ESLVal _v700 = $347;
                          
                          {ESLVal _v701 = $346;
                          
                          if(_v674.eql(new ESLVal("hasKey")).boolVal)
                          return new ESLVal("FunType",_v699,ESLVal.list(_v700),new ESLVal("BoolType",_v699));
                          else
                            {ESLVal _v702 = _v69;
                              
                              return error(new ESLVal("TypeError",_v699,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v702,_v670))));
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
      case "ListType": {ESLVal $345 = _v69.termRef(0);
          ESLVal $344 = _v69.termRef(1);
          
          {ESLVal ll = $345;
          
          {ESLVal _v687 = $344;
          
          if(_v674.eql(new ESLVal("implode")).boolVal)
          return new ESLVal("StrType",ll);
          else
            {ESLVal _v688 = _v69;
              
              return error(new ESLVal("TypeError",_v676,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v688,_v670))));
            }
        }
        }
        }
      case "RecordType": {ESLVal $343 = _v69.termRef(0);
          ESLVal $342 = _v69.termRef(1);
          
          {ESLVal rl = $343;
          
          {ESLVal fs = $342;
          
          return findField.apply(fs);
        }
        }
        }
      case "ActType": {ESLVal $341 = _v69.termRef(0);
          ESLVal $340 = _v69.termRef(1);
          ESLVal $339 = _v69.termRef(2);
          
          {ESLVal al = $341;
          
          {ESLVal exports = $340;
          
          {ESLVal handlers = $339;
          
          {ESLVal _v686 = findExport.apply(exports);
          
          if(_v686.eql($null).boolVal)
          return error(new ESLVal("TypeError",_v676,new ESLVal("behaviour type does not export ").add(_v674)));
          else
            return substTypeEnv.apply(_v670,_v686);
        }
        }
        }
        }
        }
        default: {ESLVal _v705 = _v69;
          
          return error(new ESLVal("TypeError",_v676,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v705,_v670))));
        }
      }
      }
      
    }
  });
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v66 = t;
        
        switch(_v66.termName) {
        case "TypeClosure": {ESLVal $326 = _v66.termRef(0);
          
          {ESLVal f = $326;
          
          return derefType.apply(f.apply());
        }
        }
        default: {ESLVal _v669 = _v66;
          
          return _v669;
        }
      }
      }
    }
  });
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v662 = $args[0];
  ESLVal _v661 = $args[1];
  ESLVal _v660 = $args[2];
  ESLVal _v659 = $args[3];
  ESLVal _v658 = $args[4];
  ESLVal _v657 = $args[5];
  LetRec letrec = new LetRec() {
        ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v663 = $args[0];
          {ESLVal _v65 = _v663;
                
                if(_v65.isCons())
                {ESLVal $319 = _v65.head();
                  ESLVal $320 = _v65.tail();
                  
                  switch($319.termName) {
                  case "Binding": {ESLVal $325 = $319.termRef(0);
                    ESLVal $324 = $319.termRef(1);
                    ESLVal $323 = $319.termRef(2);
                    ESLVal $322 = $319.termRef(3);
                    ESLVal $321 = $319.termRef(4);
                    
                    {ESLVal _v664 = $325;
                    
                    {ESLVal n = $324;
                    
                    {ESLVal t = $323;
                    
                    {ESLVal st = $322;
                    
                    {ESLVal e = $321;
                    
                    {ESLVal _v665 = $320;
                    
                    {ESLVal _v666 = expType.apply(e,_v660,_v659,_v658,_v657);
                    
                    return fieldTypes.apply(_v665).cons(new ESLVal("Dec",_v664,n,_v666,_v666));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v667 = _v65;
                    
                    return error(new ESLVal("TypeError",_v662,new ESLVal("unknown field representation: ").add(_v667)));
                  }
                }
                }
              else if(_v65.isNil())
                return $nil;
              else {ESLVal _v668 = _v65;
                  
                  return error(new ESLVal("TypeError",_v662,new ESLVal("unknown field representation: ").add(_v668)));
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
      
        return new ESLVal("RecordType",_v662,fieldTypes.apply(_v661));
      
    }
  });
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v652 = $args[0];
  ESLVal _v651 = $args[1];
  ESLVal _v650 = $args[2];
  ESLVal _v649 = $args[3];
  ESLVal _v648 = $args[4];
  ESLVal _v647 = $args[5];
  ESLVal _v646 = $args[6];
  ESLVal _v645 = $args[7];
  {ESLVal _v653 = expType.apply(_v650,_v648,_v647,_v646,_v645);
        
        {ESLVal _v64 = _v653;
        
        switch(_v64.termName) {
        case "ListType": {ESLVal $318 = _v64.termRef(0);
          ESLVal $317 = _v64.termRef(1);
          
          {ESLVal _v654 = $318;
          
          {ESLVal t = $317;
          
          return patternType.apply(_v654,_v651,t,_v648,_v647,_v646,_v645,new ESLVal(new Function(new ESLVal("fun2913"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v656 = $args[0];
          ESLVal _v655 = $args[1];
          return expType.apply(_v649,_v648,_v655,_v646,_v645);
            }
          }));
        }
        }
        }
        default: {ESLVal t = _v64;
          
          return error(new ESLVal("TypeError",_v652,new ESLVal("for type expects a list: ").add(_v650)));
        }
      }
      }
      }
    }
  });
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v626 = $args[0];
  ESLVal _v625 = $args[1];
  ESLVal _v624 = $args[2];
  ESLVal _v623 = $args[3];
  ESLVal _v622 = $args[4];
  ESLVal _v621 = $args[5];
  ESLVal _v620 = $args[6];
  ESLVal _v619 = $args[7];
  {ESLVal _v63 = _v625;
        ESLVal _v62 = _v624;
        
        if(_v63.isCons())
        {ESLVal $311 = _v63.head();
          ESLVal $312 = _v63.tail();
          
          if(_v62.isCons())
          {ESLVal $313 = _v62.head();
            ESLVal $314 = _v62.tail();
            
            {ESLVal p = $311;
            
            {ESLVal _v627 = $312;
            
            {ESLVal t = $313;
            
            {ESLVal _v628 = $314;
            
            {ESLVal _v630 = _v627;
            ESLVal _v629 = _v628;
            
            return patternType.apply(_v626,p,t,_v623,_v622,_v621,_v620,new ESLVal(new Function(new ESLVal("fun2914"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v632 = $args[0];
            ESLVal _v631 = $args[1];
            return patternTypes.apply(_v626,_v630,_v629,_v623,_v631,_v621,_v620,new ESLVal(new Function(new ESLVal("fun2915"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v634 = $args[0];
                  ESLVal _v633 = $args[1];
                  return _v619.apply(_v634.cons(_v632),_v633);
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
        else if(_v62.isNil())
          {ESLVal _v635 = _v63;
            
            {ESLVal _v636 = _v62;
            
            return error(new ESLVal("TypeError",_v626,new ESLVal("somthing wrong with ").add(_v635.add(new ESLVal(" ").add(_v636)))));
          }
          }
        else {ESLVal _v637 = _v63;
            
            {ESLVal _v638 = _v62;
            
            return error(new ESLVal("TypeError",_v626,new ESLVal("somthing wrong with ").add(_v637.add(new ESLVal(" ").add(_v638)))));
          }
          }
        }
      else if(_v63.isNil())
        if(_v62.isCons())
          {ESLVal $315 = _v62.head();
            ESLVal $316 = _v62.tail();
            
            {ESLVal _v639 = _v63;
            
            {ESLVal _v640 = _v62;
            
            return error(new ESLVal("TypeError",_v626,new ESLVal("somthing wrong with ").add(_v639.add(new ESLVal(" ").add(_v640)))));
          }
          }
          }
        else if(_v62.isNil())
          return _v619.apply($nil,_v622);
        else {ESLVal _v641 = _v63;
            
            {ESLVal _v642 = _v62;
            
            return error(new ESLVal("TypeError",_v626,new ESLVal("somthing wrong with ").add(_v641.add(new ESLVal(" ").add(_v642)))));
          }
          }
      else {ESLVal _v643 = _v63;
          
          {ESLVal _v644 = _v62;
          
          return error(new ESLVal("TypeError",_v626,new ESLVal("somthing wrong with ").add(_v643.add(new ESLVal(" ").add(_v644)))));
        }
        }
      }
    }
  });
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v603 = $args[0];
  ESLVal _v602 = $args[1];
  ESLVal _v601 = $args[2];
  ESLVal _v600 = $args[3];
  ESLVal _v599 = $args[4];
  ESLVal _v598 = $args[5];
  {ESLVal _v61 = _v602;
        
        switch(_v61.termName) {
        case "PApplyType": {ESLVal $310 = _v61.termRef(0);
          ESLVal $309 = _v61.termRef(1);
          ESLVal $308 = _v61.termRef(2);
          
          {ESLVal _v616 = $310;
          
          {ESLVal _v617 = $309;
          
          {ESLVal args = $308;
          
          return error(new ESLVal("should this happen?"));
        }
        }
        }
        }
      case "PBool": {ESLVal $307 = _v61.termRef(0);
          ESLVal $306 = _v61.termRef(1);
          
          {ESLVal _v615 = $307;
          
          {ESLVal b = $306;
          
          return new ESLVal("BoolType",_v615);
        }
        }
        }
      case "PCons": {ESLVal $305 = _v61.termRef(0);
          ESLVal $304 = _v61.termRef(1);
          ESLVal $303 = _v61.termRef(2);
          
          {ESLVal _v614 = $305;
          
          {ESLVal hd = $304;
          
          {ESLVal tl = $303;
          
          return getPatternType.apply(_v614,tl,_v601,_v600,_v599,_v598);
        }
        }
        }
        }
      case "PBagCons": {ESLVal $302 = _v61.termRef(0);
          ESLVal $301 = _v61.termRef(1);
          ESLVal $300 = _v61.termRef(2);
          
          {ESLVal _v613 = $302;
          
          {ESLVal hd = $301;
          
          {ESLVal tl = $300;
          
          return getPatternType.apply(_v613,tl,_v601,_v600,_v599,_v598);
        }
        }
        }
        }
      case "PSetCons": {ESLVal $299 = _v61.termRef(0);
          ESLVal $298 = _v61.termRef(1);
          ESLVal $297 = _v61.termRef(2);
          
          {ESLVal _v612 = $299;
          
          {ESLVal hd = $298;
          
          {ESLVal tl = $297;
          
          return getPatternType.apply(_v612,tl,_v601,_v600,_v599,_v598);
        }
        }
        }
        }
      case "PNil": {ESLVal $296 = _v61.termRef(0);
          
          {ESLVal _v611 = $296;
          
          return new ESLVal("ForallType",_v611,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v611,new ESLVal("VarType",_v611,new ESLVal("T"))));
        }
        }
      case "PNull": {ESLVal $295 = _v61.termRef(0);
          
          {ESLVal _v610 = $295;
          
          return new ESLVal("ForallType",_v610,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v610,new ESLVal("T")));
        }
        }
      case "PEmptyBag": {ESLVal $294 = _v61.termRef(0);
          
          {ESLVal _v609 = $294;
          
          return new ESLVal("ForallType",_v609,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v609,new ESLVal("VarType",_v609,new ESLVal("T"))));
        }
        }
      case "PEmptySet": {ESLVal $293 = _v61.termRef(0);
          
          {ESLVal _v608 = $293;
          
          return new ESLVal("ForallType",_v608,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v608,new ESLVal("VarType",_v608,new ESLVal("T"))));
        }
        }
      case "PInt": {ESLVal $292 = _v61.termRef(0);
          ESLVal $291 = _v61.termRef(1);
          
          {ESLVal _v607 = $292;
          
          {ESLVal n = $291;
          
          return new ESLVal("IntType",_v607);
        }
        }
        }
      case "PVar": {ESLVal $290 = _v61.termRef(0);
          ESLVal $289 = _v61.termRef(1);
          ESLVal $288 = _v61.termRef(2);
          
          {ESLVal _v606 = $290;
          
          {ESLVal n = $289;
          
          {ESLVal pt = $288;
          
          return substTypeEnv.apply(_v598,pt);
        }
        }
        }
        }
      case "PStr": {ESLVal $287 = _v61.termRef(0);
          ESLVal $286 = _v61.termRef(1);
          
          {ESLVal _v605 = $287;
          
          {ESLVal s = $286;
          
          return new ESLVal("StrType",_v605);
        }
        }
        }
      case "PTerm": {ESLVal $285 = _v61.termRef(0);
          ESLVal $284 = _v61.termRef(1);
          ESLVal $283 = _v61.termRef(2);
          ESLVal $282 = _v61.termRef(3);
          
          {ESLVal _v604 = $285;
          
          {ESLVal n = $284;
          
          {ESLVal ts = $283;
          
          {ESLVal ps = $282;
          
          return lookupType.apply(n,_v599);
        }
        }
        }
        }
        }
        default: {ESLVal _v618 = _v61;
          
          return error(new ESLVal("TypeError",_v603,new ESLVal("unknown type of pattern: ").add(_v618)));
        }
      }
      }
    }
  });
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v575 = $args[0];
  ESLVal _v574 = $args[1];
  ESLVal _v573 = $args[2];
  ESLVal _v572 = $args[3];
  ESLVal _v571 = $args[4];
  ESLVal _v570 = $args[5];
  ESLVal _v569 = $args[6];
  ESLVal _v568 = $args[7];
  {ESLVal _v60 = _v574;
        
        switch(_v60.termName) {
        case "PAdd": {ESLVal $281 = _v60.termRef(0);
          ESLVal $280 = _v60.termRef(1);
          ESLVal $279 = _v60.termRef(2);
          
          {ESLVal _v596 = $281;
          
          {ESLVal p1 = $280;
          
          {ESLVal p2 = $279;
          
          return addPatternType.apply(_v596,p1,p2,_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
        }
        }
      case "PApplyType": {ESLVal $278 = _v60.termRef(0);
          ESLVal $277 = _v60.termRef(1);
          ESLVal $276 = _v60.termRef(2);
          
          {ESLVal _v594 = $278;
          
          {ESLVal _v595 = $277;
          
          {ESLVal args = $276;
          
          return applyTypePatternType.apply(_v594,_v595,substTypesEnv.apply(_v569,args),_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
        }
        }
      case "PBool": {ESLVal $275 = _v60.termRef(0);
          ESLVal $274 = _v60.termRef(1);
          
          {ESLVal _v593 = $275;
          
          {ESLVal b = $274;
          
          if(isBoolType.apply(_v573).boolVal)
          return _v568.apply(new ESLVal("BoolType",_v593),_v571);
          else
            return error(new ESLVal("TypeError",_v593,new ESLVal("type mismatch: Bool and ").add(ppType.apply(_v573,_v569))));
        }
        }
        }
      case "PBagCons": {ESLVal $273 = _v60.termRef(0);
          ESLVal $272 = _v60.termRef(1);
          ESLVal $271 = _v60.termRef(2);
          
          {ESLVal _v590 = $273;
          
          {ESLVal hd = $272;
          
          {ESLVal tl = $271;
          
          return bagConsPatternType.apply(_v590,hd,tl,_v573,_v572,_v571,_v570,_v569,new ESLVal(new Function(new ESLVal("fun2916"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v592 = $args[0];
          ESLVal _v591 = $args[1];
          return _v568.apply(new ESLVal("ListType",_v590,_v592),_v591);
            }
          }));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $270 = _v60.termRef(0);
          ESLVal $269 = _v60.termRef(1);
          ESLVal $268 = _v60.termRef(2);
          
          {ESLVal _v587 = $270;
          
          {ESLVal hd = $269;
          
          {ESLVal tl = $268;
          
          return setConsPatternType.apply(_v587,hd,tl,_v573,_v572,_v571,_v570,_v569,new ESLVal(new Function(new ESLVal("fun2917"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v589 = $args[0];
          ESLVal _v588 = $args[1];
          return _v568.apply(new ESLVal("ListType",_v587,_v589),_v588);
            }
          }));
        }
        }
        }
        }
      case "PCons": {ESLVal $267 = _v60.termRef(0);
          ESLVal $266 = _v60.termRef(1);
          ESLVal $265 = _v60.termRef(2);
          
          {ESLVal _v584 = $267;
          
          {ESLVal hd = $266;
          
          {ESLVal tl = $265;
          
          return consPatternType.apply(_v584,hd,tl,_v573,_v572,_v571,_v570,_v569,new ESLVal(new Function(new ESLVal("fun2918"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v586 = $args[0];
          ESLVal _v585 = $args[1];
          return _v568.apply(new ESLVal("ListType",_v584,_v586),_v585);
            }
          }));
        }
        }
        }
        }
      case "PNil": {ESLVal $264 = _v60.termRef(0);
          
          {ESLVal _v583 = $264;
          
          return nilType.apply(_v583,_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
      case "PNull": {ESLVal $263 = _v60.termRef(0);
          
          {ESLVal _v582 = $263;
          
          return _v568.apply(_v573,_v571);
        }
        }
      case "PEmptyBag": {ESLVal $262 = _v60.termRef(0);
          
          {ESLVal _v581 = $262;
          
          return emptyBagType.apply(_v581,_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
      case "PEmptySet": {ESLVal $261 = _v60.termRef(0);
          
          {ESLVal _v580 = $261;
          
          return emptySetType.apply(_v580,_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
      case "PInt": {ESLVal $260 = _v60.termRef(0);
          ESLVal $259 = _v60.termRef(1);
          
          {ESLVal _v579 = $260;
          
          {ESLVal n = $259;
          
          if(isIntType.apply(_v573).boolVal)
          return _v568.apply(new ESLVal("IntType",_v579),_v571);
          else
            return error(new ESLVal("TypeError",_v579,new ESLVal("type mismatch: Int and ").add(ppType.apply(_v573,_v569))));
        }
        }
        }
      case "PVar": {ESLVal $258 = _v60.termRef(0);
          ESLVal $257 = _v60.termRef(1);
          ESLVal $256 = _v60.termRef(2);
          
          {ESLVal _v578 = $258;
          
          {ESLVal n = $257;
          
          {ESLVal pt = $256;
          
          return _v568.apply(_v573,ESLVal.list(new ESLVal("Map",n,_v573)).add(_v571));
        }
        }
        }
        }
      case "PStr": {ESLVal $255 = _v60.termRef(0);
          ESLVal $254 = _v60.termRef(1);
          
          {ESLVal _v577 = $255;
          
          {ESLVal s = $254;
          
          if(isStrType.apply(_v573).boolVal)
          return _v568.apply(new ESLVal("StrType",_v577),_v571);
          else
            return error(new ESLVal("TypeError",_v577,new ESLVal("type mismatch: Str and ").add(ppType.apply(_v573,_v569))));
        }
        }
        }
      case "PTerm": {ESLVal $253 = _v60.termRef(0);
          ESLVal $252 = _v60.termRef(1);
          ESLVal $251 = _v60.termRef(2);
          ESLVal $250 = _v60.termRef(3);
          
          {ESLVal _v576 = $253;
          
          {ESLVal n = $252;
          
          {ESLVal ts = $251;
          
          {ESLVal ps = $250;
          
          return termPatternType.apply(_v576,n,substTypesEnv.apply(_v569,ts),ps,_v573,_v572,_v571,_v570,_v569,_v568);
        }
        }
        }
        }
        }
        default: {ESLVal _v597 = _v60;
          
          return error(new ESLVal("TypeError",_v575,new ESLVal("unknown type of pattern: ").add(_v597)));
        }
      }
      }
    }
  });
  private static ESLVal addPatternType = new ESLVal(new Function(new ESLVal("addPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v538 = $args[0];
  ESLVal _v537 = $args[1];
  ESLVal _v536 = $args[2];
  ESLVal _v535 = $args[3];
  ESLVal _v534 = $args[4];
  ESLVal _v533 = $args[5];
  ESLVal _v532 = $args[6];
  ESLVal _v531 = $args[7];
  ESLVal _v530 = $args[8];
  return patternType.apply(_v538,_v537,_v535,_v534,_v533,_v532,_v531,new ESLVal(new Function(new ESLVal("fun2919"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v540 = $args[0];
        ESLVal _v539 = $args[1];
        return patternType.apply(_v538,_v536,_v535,_v534,_v539,_v532,_v531,new ESLVal(new Function(new ESLVal("fun2920"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v542 = $args[0];
              ESLVal _v541 = $args[1];
              {ESLVal _v57 = _v535;
                    
                    switch(_v57.termName) {
                    case "ListType": {ESLVal $212 = _v57.termRef(0);
                      ESLVal $211 = _v57.termRef(1);
                      
                      {ESLVal tl = $212;
                      
                      {ESLVal t = $211;
                      
                      {ESLVal _v59 = _v537;
                      ESLVal _v58 = _v536;
                      
                      switch(_v59.termName) {
                      case "PCons": {ESLVal $245 = _v59.termRef(0);
                        ESLVal $244 = _v59.termRef(1);
                        ESLVal $243 = _v59.termRef(2);
                        
                        switch($243.termName) {
                        case "PNil": {ESLVal $246 = $243.termRef(0);
                          
                          switch(_v58.termName) {
                          case "PVar": {ESLVal $249 = _v58.termRef(0);
                            ESLVal $248 = _v58.termRef(1);
                            ESLVal $247 = _v58.termRef(2);
                            
                            {ESLVal l1 = $245;
                            
                            {ESLVal p = $244;
                            
                            {ESLVal l3 = $246;
                            
                            {ESLVal l4 = $249;
                            
                            {ESLVal n2 = $248;
                            
                            {ESLVal t2 = $247;
                            
                            return _v530.apply(_v535,_v541);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v562 = _v59;
                            
                            {ESLVal _v563 = _v58;
                            
                            return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v564 = _v59;
                          
                          {ESLVal _v565 = _v58;
                          
                          return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PVar": {ESLVal $228 = _v59.termRef(0);
                        ESLVal $227 = _v59.termRef(1);
                        ESLVal $226 = _v59.termRef(2);
                        
                        switch(_v58.termName) {
                        case "PCons": {ESLVal $241 = _v58.termRef(0);
                          ESLVal $240 = _v58.termRef(1);
                          ESLVal $239 = _v58.termRef(2);
                          
                          switch($239.termName) {
                          case "PNil": {ESLVal $242 = $239.termRef(0);
                            
                            {ESLVal l1 = $228;
                            
                            {ESLVal n = $227;
                            
                            {ESLVal _v557 = $226;
                            
                            {ESLVal l2 = $241;
                            
                            {ESLVal p = $240;
                            
                            {ESLVal l3 = $242;
                            
                            return _v530.apply(_v535,_v541);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v558 = _v59;
                            
                            {ESLVal _v559 = _v58;
                            
                            return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                      case "PAdd": {ESLVal $231 = _v58.termRef(0);
                          ESLVal $230 = _v58.termRef(1);
                          ESLVal $229 = _v58.termRef(2);
                          
                          switch($230.termName) {
                          case "PCons": {ESLVal $234 = $230.termRef(0);
                            ESLVal $233 = $230.termRef(1);
                            ESLVal $232 = $230.termRef(2);
                            
                            switch($232.termName) {
                            case "PNil": {ESLVal $235 = $232.termRef(0);
                              
                              switch($229.termName) {
                              case "PVar": {ESLVal $238 = $229.termRef(0);
                                ESLVal $237 = $229.termRef(1);
                                ESLVal $236 = $229.termRef(2);
                                
                                {ESLVal l1 = $228;
                                
                                {ESLVal n1 = $227;
                                
                                {ESLVal t1 = $226;
                                
                                {ESLVal l2 = $231;
                                
                                {ESLVal l3 = $234;
                                
                                {ESLVal p = $233;
                                
                                {ESLVal l5 = $235;
                                
                                {ESLVal l6 = $238;
                                
                                {ESLVal n3 = $237;
                                
                                {ESLVal t3 = $236;
                                
                                return _v530.apply(_v535,_v541);
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
                              default: {ESLVal _v551 = _v59;
                                
                                {ESLVal _v552 = _v58;
                                
                                return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v553 = _v59;
                              
                              {ESLVal _v554 = _v58;
                              
                              return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v555 = _v59;
                            
                            {ESLVal _v556 = _v58;
                            
                            return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v560 = _v59;
                          
                          {ESLVal _v561 = _v58;
                          
                          return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PAdd": {ESLVal $215 = _v59.termRef(0);
                        ESLVal $214 = _v59.termRef(1);
                        ESLVal $213 = _v59.termRef(2);
                        
                        switch($214.termName) {
                        case "PVar": {ESLVal $218 = $214.termRef(0);
                          ESLVal $217 = $214.termRef(1);
                          ESLVal $216 = $214.termRef(2);
                          
                          switch($213.termName) {
                          case "PCons": {ESLVal $221 = $213.termRef(0);
                            ESLVal $220 = $213.termRef(1);
                            ESLVal $219 = $213.termRef(2);
                            
                            switch($219.termName) {
                            case "PNil": {ESLVal $222 = $219.termRef(0);
                              
                              switch(_v58.termName) {
                              case "PVar": {ESLVal $225 = _v58.termRef(0);
                                ESLVal $224 = _v58.termRef(1);
                                ESLVal $223 = _v58.termRef(2);
                                
                                {ESLVal l1 = $215;
                                
                                {ESLVal l2 = $218;
                                
                                {ESLVal n1 = $217;
                                
                                {ESLVal t1 = $216;
                                
                                {ESLVal l3 = $221;
                                
                                {ESLVal p = $220;
                                
                                {ESLVal l5 = $222;
                                
                                {ESLVal l6 = $225;
                                
                                {ESLVal n3 = $224;
                                
                                {ESLVal t3 = $223;
                                
                                return _v530.apply(_v535,_v541);
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
                              default: {ESLVal _v543 = _v59;
                                
                                {ESLVal _v544 = _v58;
                                
                                return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v545 = _v59;
                              
                              {ESLVal _v546 = _v58;
                              
                              return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v547 = _v59;
                            
                            {ESLVal _v548 = _v58;
                            
                            return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v549 = _v59;
                          
                          {ESLVal _v550 = _v58;
                          
                          return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v566 = _v59;
                        
                        {ESLVal _v567 = _v58;
                        
                        return error(new ESLVal("TypeError",_v538,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $210 = _v57.termRef(0);
                      
                      {ESLVal g = $210;
                      
                      return addPatternType.apply(_v538,_v537,_v536,g.apply(),_v534,_v541,_v532,_v531,_v530);
                    }
                    }
                    default: {ESLVal t = _v57;
                      
                      return error(new ESLVal("TypeError",_v538,new ESLVal("+ expects lists: ").add(ppType.apply(_v535,_v531))));
                    }
                  }
                  }
                }
              }));
          }
        }));
    }
  });
  private static ESLVal applyTypePatternType = new ESLVal(new Function(new ESLVal("applyTypePatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v525 = $args[0];
  ESLVal _v524 = $args[1];
  ESLVal _v523 = $args[2];
  ESLVal _v522 = $args[3];
  ESLVal _v521 = $args[4];
  ESLVal _v520 = $args[5];
  ESLVal _v519 = $args[6];
  ESLVal _v518 = $args[7];
  ESLVal _v517 = $args[8];
  return patternType.apply(_v525,_v524,_v522,_v521,_v520,_v519,_v518,new ESLVal(new Function(new ESLVal("fun2921"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v527 = $args[0];
        ESLVal _v526 = $args[1];
        {ESLVal _v56 = typeNF.apply(_v527,_v518);
              
              switch(_v56.termName) {
              case "TypeFun": {ESLVal $209 = _v56.termRef(0);
                ESLVal $208 = _v56.termRef(1);
                ESLVal $207 = _v56.termRef(2);
                
                {ESLVal fl = $209;
                
                {ESLVal ns = $208;
                
                {ESLVal t = $207;
                
                if(length.apply(_v523).eql(length.apply(ns)).boolVal)
                {ESLVal _v529 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v523).add(_v518),t);
                  
                  if(typeEqual.apply(_v529,_v522).boolVal)
                  return _v517.apply(_v529,_v526);
                  else
                    return error(new ESLVal("TypeError",_v525,new ESLVal("value type ").add(ppType.apply(_v522,_v518).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v529,_v518).add(new ESLVal(" ").add(ppTypeEnv.apply(_v518))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v525,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v523))))));
              }
              }
              }
              }
            case "ForallType": {ESLVal $206 = _v56.termRef(0);
                ESLVal $205 = _v56.termRef(1);
                ESLVal $204 = _v56.termRef(2);
                
                {ESLVal fl = $206;
                
                {ESLVal ns = $205;
                
                {ESLVal t = $204;
                
                if(length.apply(_v523).eql(length.apply(ns)).boolVal)
                {ESLVal _v528 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v523).add(_v518),t);
                  
                  if(typeEqual.apply(_v528,_v522).boolVal)
                  return _v517.apply(_v528,_v526);
                  else
                    return error(new ESLVal("TypeError",_v525,new ESLVal("value type ").add(ppType.apply(_v522,_v518).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v528,_v518).add(new ESLVal(" ").add(ppTypeEnv.apply(_v518))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v525,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v523))))));
              }
              }
              }
              }
              default: {ESLVal t = _v56;
                
                return _v517.apply(t,_v526);
              }
            }
            }
          }
        }));
    }
  });
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v509 = $args[0];
  ESLVal _v508 = $args[1];
  ESLVal _v507 = $args[2];
  ESLVal _v506 = $args[3];
  ESLVal _v505 = $args[4];
  ESLVal _v504 = $args[5];
  ESLVal _v503 = $args[6];
  ESLVal _v502 = $args[7];
  ESLVal _v501 = $args[8];
  ESLVal _v500 = $args[9];
  {ESLVal _v510 = getTermPatternType.apply(_v509,_v508,_v507,_v504,_v503,_v502,_v501);
        
        if(typeEqual.apply(_v510,_v505).boolVal)
        {ESLVal _v54 = typeNF.apply(_v505,_v501);
          
          switch(_v54.termName) {
          case "UnionType": {ESLVal $198 = _v54.termRef(0);
            ESLVal $197 = _v54.termRef(1);
            
            {ESLVal ul = $198;
            
            {ESLVal cs = $197;
            
            LetRec letrec = new LetRec() {
            ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v511 = $args[0];
              {ESLVal _v55 = _v511;
                    
                    if(_v55.isCons())
                    {ESLVal $199 = _v55.head();
                      ESLVal $200 = _v55.tail();
                      
                      switch($199.termName) {
                      case "TermType": {ESLVal $203 = $199.termRef(0);
                        ESLVal $202 = $199.termRef(1);
                        ESLVal $201 = $199.termRef(2);
                        
                        {ESLVal tl = $203;
                        
                        {ESLVal m = $202;
                        
                        {ESLVal args = $201;
                        
                        {ESLVal _v512 = $200;
                        
                        if(m.eql(_v508).boolVal)
                        return args;
                        else
                          {ESLVal t = $199;
                            
                            {ESLVal _v513 = $200;
                            
                            return getCnstrArgs.apply(_v513);
                          }
                          }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t = $199;
                        
                        {ESLVal _v514 = $200;
                        
                        return getCnstrArgs.apply(_v514);
                      }
                      }
                    }
                    }
                  else if(_v55.isNil())
                    return error(new ESLVal("TypeError",_v509,new ESLVal("cannot find constructor for ").add(_v508)));
                  else return error(new ESLVal("case error at Pos(46982,47241)").add(ESLVal.list(_v55)));
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
            
            if(length.apply(_v506).eql(length.apply(argTypes)).boolVal)
            return patternTypes.apply(_v509,_v506,argTypes,_v504,_v503,_v502,_v501,new ESLVal(new Function(new ESLVal("fun2922"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v516 = $args[0];
              ESLVal _v515 = $args[1];
              return _v500.apply(typeNF.apply(_v505,_v501),_v515);
                }
              }));
            else
              return error(new ESLVal("TypeError",_v509,new ESLVal("arity mismatch.")));
          }
          
          }
          }
          }
          default: {ESLVal t = _v54;
            
            return error(new ESLVal("TypeError",_v509,new ESLVal("expecting a data type: ").add(_v505)));
          }
        }
        }
        else
          return error(new ESLVal("TypeError",_v509,new ESLVal("term pattern type ").add(ppType.apply(_v510,_v501).add(new ESLVal(" does not match supplied value type ").add(ppType.apply(_v505,_v501))))));
      }
    }
  });
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v494 = $args[0];
  ESLVal _v493 = $args[1];
  {ESLVal _v51 = substTypeEnv.apply(_v493,_v494);
        
        switch(_v51.termName) {
        case "ApplyTypeFun": {ESLVal $190 = _v51.termRef(0);
          ESLVal $189 = _v51.termRef(1);
          ESLVal $188 = _v51.termRef(2);
          
          {ESLVal l = $190;
          
          {ESLVal op = $189;
          
          {ESLVal args = $188;
          
          {ESLVal _v53 = typeNF.apply(op,_v493);
          
          switch(_v53.termName) {
          case "TypeFun": {ESLVal $196 = _v53.termRef(0);
            ESLVal $195 = _v53.termRef(1);
            ESLVal $194 = _v53.termRef(2);
            
            {ESLVal _v496 = $196;
            
            {ESLVal ns = $195;
            
            {ESLVal _v497 = $194;
            
            if(length.apply(args).eql(length.apply(ns)).boolVal)
            return typeNF.apply(substTypeEnv.apply(zipTypeEnv.apply(ns,args),_v497),_v493);
            else
              return error(new ESLVal("TypeError",_v496,new ESLVal("function arity error")));
          }
          }
          }
          }
          default: {ESLVal _v498 = _v53;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(typeNF.apply(op,_v493),_v493))));
          }
        }
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $187 = _v51.termRef(0);
          
          {ESLVal f = $187;
          
          return typeNF.apply(f.apply(),_v493);
        }
        }
      case "RecType": {ESLVal $186 = _v51.termRef(0);
          ESLVal $185 = _v51.termRef(1);
          ESLVal $184 = _v51.termRef(2);
          
          {ESLVal l = $186;
          
          {ESLVal n = $185;
          
          {ESLVal _v495 = $184;
          
          return typeNF.apply(substType.apply(new ESLVal("RecType",l,n,_v495),n,_v495),_v493);
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $183 = _v51.termRef(0);
          ESLVal $182 = _v51.termRef(1);
          ESLVal $181 = _v51.termRef(2);
          ESLVal $180 = _v51.termRef(3);
          
          {ESLVal l1 = $183;
          
          {ESLVal parent = $182;
          
          {ESLVal decs1 = $181;
          
          {ESLVal ms1 = $180;
          
          {ESLVal _v52 = typeNF.apply(parent,_v493);
          
          switch(_v52.termName) {
          case "ActType": {ESLVal $193 = _v52.termRef(0);
            ESLVal $192 = _v52.termRef(1);
            ESLVal $191 = _v52.termRef(2);
            
            {ESLVal l2 = $193;
            
            {ESLVal decs2 = $192;
            
            {ESLVal ms2 = $191;
            
            return new ESLVal("ActType",l1,decs2.add(decs1),ms2.add(ms1));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(48558,48693)").add(ESLVal.list(_v52)));
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v499 = _v51;
          
          return _v499;
        }
      }
      }
    }
  });
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v492 = $args[0];
  ESLVal _v491 = $args[1];
  ESLVal _v490 = $args[2];
  ESLVal _v489 = $args[3];
  ESLVal _v488 = $args[4];
  ESLVal _v487 = $args[5];
  ESLVal _v486 = $args[6];
  {ESLVal t = lookupType.apply(_v491,_v487);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v492,new ESLVal("unknown constructor ").add(_v491)));
        else
          if(length.apply(_v490).gre($zero).boolVal)
            return getGenericTermPatternType.apply(_v492,t,_v490,_v489,_v488,_v487,_v486);
            else
              return t;
      }
    }
  });
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v483 = $args[0];
  ESLVal _v482 = $args[1];
  ESLVal _v481 = $args[2];
  ESLVal _v480 = $args[3];
  ESLVal _v479 = $args[4];
  ESLVal _v478 = $args[5];
  ESLVal _v477 = $args[6];
  {ESLVal _v50 = _v482;
        
        switch(_v50.termName) {
        case "RecType": {ESLVal $179 = _v50.termRef(0);
          ESLVal $178 = _v50.termRef(1);
          ESLVal $177 = _v50.termRef(2);
          
          {ESLVal rl = $179;
          
          {ESLVal rn = $178;
          
          {ESLVal rt = $177;
          
          return getGenericTermPatternType.apply(_v483,substType.apply(new ESLVal("RecType",rl,rn,rt),rn,rt),_v481,_v480,_v479,_v478,_v477);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $176 = _v50.termRef(0);
          ESLVal $175 = _v50.termRef(1);
          ESLVal $174 = _v50.termRef(2);
          
          {ESLVal al = $176;
          
          {ESLVal ns = $175;
          
          {ESLVal _v484 = $174;
          
          if(length.apply(ns).eql(length.apply(_v481)).boolVal)
          {ESLVal e = zipTypeEnv.apply(ns,_v481);
            
            return substTypeEnv.apply(e.add(_v477),_v484);
          }
          else
            return error(new ESLVal("TypeError",_v483,new ESLVal("generic constructor mismatch")));
        }
        }
        }
        }
        default: {ESLVal _v485 = _v50;
          
          return error(new ESLVal("TypeError",_v483,new ESLVal("expecting a generic type: ").add(ppType.apply(_v485,_v477))));
        }
      }
      }
    }
  });
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v475 = $args[0];
  ESLVal _v474 = $args[1];
  ESLVal _v473 = $args[2];
  ESLVal _v472 = $args[3];
  ESLVal _v471 = $args[4];
  ESLVal _v470 = $args[5];
  ESLVal _v469 = $args[6];
  {ESLVal _v49 = _v474;
        
        switch(_v49.termName) {
        case "ListType": {ESLVal $173 = _v49.termRef(0);
          ESLVal $172 = _v49.termRef(1);
          
          {ESLVal ltl = $173;
          
          {ESLVal et = $172;
          
          return _v469.apply(new ESLVal("ForallType",_v475,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v475,new ESLVal("VarType",_v475,new ESLVal("T")))),_v472);
        }
        }
        }
      case "TypeClosure": {ESLVal $171 = _v49.termRef(0);
          
          {ESLVal g = $171;
          
          return nilType.apply(_v475,g.apply(),_v473,_v472,_v471,_v470,_v469);
        }
        }
        default: {ESLVal _v476 = _v49;
          
          return error(new ESLVal("TypeError",_v475,new ESLVal("expecting a list type: ").add(ppType.apply(_v476,_v470))));
        }
      }
      }
    }
  });
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v467 = $args[0];
  ESLVal _v466 = $args[1];
  ESLVal _v465 = $args[2];
  ESLVal _v464 = $args[3];
  ESLVal _v463 = $args[4];
  ESLVal _v462 = $args[5];
  ESLVal _v461 = $args[6];
  {ESLVal _v48 = _v466;
        
        switch(_v48.termName) {
        case "BagType": {ESLVal $170 = _v48.termRef(0);
          ESLVal $169 = _v48.termRef(1);
          
          {ESLVal ltl = $170;
          
          {ESLVal et = $169;
          
          return _v461.apply(new ESLVal("ForallType",_v467,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v467,new ESLVal("VarType",_v467,new ESLVal("T")))),_v464);
        }
        }
        }
        default: {ESLVal _v468 = _v48;
          
          return error(new ESLVal("TypeError",_v467,new ESLVal("expecting a bag type: ").add(ppType.apply(_v468,_v462))));
        }
      }
      }
    }
  });
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v459 = $args[0];
  ESLVal _v458 = $args[1];
  ESLVal _v457 = $args[2];
  ESLVal _v456 = $args[3];
  ESLVal _v455 = $args[4];
  ESLVal _v454 = $args[5];
  ESLVal _v453 = $args[6];
  {ESLVal _v47 = _v458;
        
        switch(_v47.termName) {
        case "SetType": {ESLVal $168 = _v47.termRef(0);
          ESLVal $167 = _v47.termRef(1);
          
          {ESLVal ltl = $168;
          
          {ESLVal et = $167;
          
          return _v453.apply(new ESLVal("ForallType",_v459,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v459,new ESLVal("VarType",_v459,new ESLVal("T")))),_v456);
        }
        }
        }
        default: {ESLVal _v460 = _v47;
          
          return error(new ESLVal("TypeError",_v459,new ESLVal("expecting a set type: ").add(ppType.apply(_v460,_v454))));
        }
      }
      }
    }
  });
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v447 = $args[0];
  ESLVal _v446 = $args[1];
  ESLVal _v445 = $args[2];
  ESLVal _v444 = $args[3];
  ESLVal _v443 = $args[4];
  ESLVal _v442 = $args[5];
  ESLVal _v441 = $args[6];
  ESLVal _v440 = $args[7];
  ESLVal _v439 = $args[8];
  {ESLVal _v46 = _v444;
        
        switch(_v46.termName) {
        case "ListType": {ESLVal $166 = _v46.termRef(0);
          ESLVal $165 = _v46.termRef(1);
          
          {ESLVal ltl = $166;
          
          {ESLVal et = $165;
          
          return patternType.apply(_v447,_v446,substTypeEnv.apply(_v440,et),_v443,_v442,_v441,_v440,new ESLVal(new Function(new ESLVal("fun2923"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v449 = $args[0];
          ESLVal _v448 = $args[1];
          return patternType.apply(_v447,_v445,_v444,_v443,_v448,_v441,_v440,new ESLVal(new Function(new ESLVal("fun2924"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v451 = $args[0];
                ESLVal _v450 = $args[1];
                return _v439.apply(_v449,_v450);
                  }
                }));
            }
          }));
        }
        }
        }
      case "TypeClosure": {ESLVal $164 = _v46.termRef(0);
          
          {ESLVal g = $164;
          
          return consPatternType.apply(_v447,_v446,_v445,g.apply(),_v443,_v442,_v441,_v440,_v439);
        }
        }
        default: {ESLVal _v452 = _v46;
          
          return error(new ESLVal("TypeError",_v447,new ESLVal("expecting a list type: ").add(ppType.apply(_v452,_v440))));
        }
      }
      }
    }
  });
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v433 = $args[0];
  ESLVal _v432 = $args[1];
  ESLVal _v431 = $args[2];
  ESLVal _v430 = $args[3];
  ESLVal _v429 = $args[4];
  ESLVal _v428 = $args[5];
  ESLVal _v427 = $args[6];
  ESLVal _v426 = $args[7];
  ESLVal _v425 = $args[8];
  {ESLVal _v45 = _v430;
        
        switch(_v45.termName) {
        case "BagType": {ESLVal $163 = _v45.termRef(0);
          ESLVal $162 = _v45.termRef(1);
          
          {ESLVal ltl = $163;
          
          {ESLVal et = $162;
          
          return patternType.apply(_v433,_v432,substTypeEnv.apply(_v426,et),_v429,_v428,_v427,_v426,new ESLVal(new Function(new ESLVal("fun2925"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v435 = $args[0];
          ESLVal _v434 = $args[1];
          return patternType.apply(_v433,_v431,_v430,_v429,_v434,_v427,_v426,new ESLVal(new Function(new ESLVal("fun2926"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v437 = $args[0];
                ESLVal _v436 = $args[1];
                return _v425.apply(_v435,_v436);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v438 = _v45;
          
          return error(new ESLVal("TypeError",_v433,new ESLVal("expecting a bag type: ").add(ppType.apply(_v438,_v426))));
        }
      }
      }
    }
  });
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),getSelf()) {
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
  {ESLVal _v44 = _v416;
        
        switch(_v44.termName) {
        case "SetType": {ESLVal $161 = _v44.termRef(0);
          ESLVal $160 = _v44.termRef(1);
          
          {ESLVal ltl = $161;
          
          {ESLVal et = $160;
          
          return patternType.apply(_v419,_v418,substTypeEnv.apply(_v412,et),_v415,_v414,_v413,_v412,new ESLVal(new Function(new ESLVal("fun2927"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v421 = $args[0];
          ESLVal _v420 = $args[1];
          return patternType.apply(_v419,_v417,_v416,_v415,_v420,_v413,_v412,new ESLVal(new Function(new ESLVal("fun2928"),getSelf()) {
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
        default: {ESLVal _v424 = _v44;
          
          return error(new ESLVal("TypeError",_v419,new ESLVal("expecting a set type: ").add(ppType.apply(_v424,_v412))));
        }
      }
      }
    }
  });
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v409 = $args[0];
  ESLVal _v408 = $args[1];
  ESLVal _v407 = $args[2];
  ESLVal _v406 = $args[3];
  ESLVal _v405 = $args[4];
  ESLVal _v404 = $args[5];
  ESLVal _v403 = $args[6];
  ESLVal _v402 = $args[7];
  {ESLVal _v43 = _v407;
        
        switch(_v43.strVal) {
        case "+": return plusExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "-": return subExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "*": return mulExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "/": return divExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case ":": return consExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "=": return eqlExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "<>": return neqlExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "and": return andExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "andalso": return andExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "or": return orExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "orelse": return orExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case ">": return compareExpType.apply(_v409,_v408,new ESLVal(">"),_v406,_v405,_v404,_v403,_v402);
      case ">=": return compareExpType.apply(_v409,_v408,new ESLVal(">="),_v406,_v405,_v404,_v403,_v402);
      case "<": return compareExpType.apply(_v409,_v408,new ESLVal("<"),_v406,_v405,_v404,_v403,_v402);
      case "<=": return compareExpType.apply(_v409,_v408,new ESLVal("<="),_v406,_v405,_v404,_v403,_v402);
      case "..": return dotDotExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
      case "%": return percentExpType.apply(_v409,_v408,_v406,_v405,_v404,_v403,_v402);
        default: {ESLVal _v410 = _v43;
          
          return error(new ESLVal("TypeError",_v409,new ESLVal("unknown operator: ").add(_v410)));
        }
      }
      }
    }
  });
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v401 = $args[0];
  ESLVal _v400 = $args[1];
  ESLVal _v399 = $args[2];
  ESLVal _v398 = $args[3];
  ESLVal _v397 = $args[4];
  ESLVal _v396 = $args[5];
  ESLVal _v395 = $args[6];
  {ESLVal t1 = expType.apply(_v400,_v398,_v397,_v396,_v395);
        ESLVal t2 = expType.apply(_v399,_v398,_v397,_v396,_v395);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v401,new ESLVal("and expects boolean arguments: ").add(ppType.apply(t1,_v395).add(new ESLVal(" ").add(ppType.apply(t2,_v395))))));
      }
    }
  });
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v394 = $args[0];
  ESLVal _v393 = $args[1];
  ESLVal _v392 = $args[2];
  ESLVal _v391 = $args[3];
  ESLVal _v390 = $args[4];
  ESLVal _v389 = $args[5];
  ESLVal _v388 = $args[6];
  {ESLVal t1 = expType.apply(_v393,_v391,_v390,_v389,_v388);
        ESLVal t2 = expType.apply(_v392,_v391,_v390,_v389,_v388);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("ListType",_v394,new ESLVal("IntType",_v394));
        else
          return error(new ESLVal("TypeError",_v394,new ESLVal(".. expects integer arguments: ").add(ppType.apply(t1,_v388).add(new ESLVal(" ").add(ppType.apply(t2,_v388))))));
      }
    }
  });
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v387 = $args[0];
  ESLVal _v386 = $args[1];
  ESLVal _v385 = $args[2];
  ESLVal _v384 = $args[3];
  ESLVal _v383 = $args[4];
  ESLVal _v382 = $args[5];
  ESLVal _v381 = $args[6];
  {ESLVal t1 = expType.apply(_v386,_v384,_v383,_v382,_v381);
        ESLVal t2 = expType.apply(_v385,_v384,_v383,_v382,_v381);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("IntType",_v387);
        else
          return error(new ESLVal("TypeError",_v387,new ESLVal("% expects integer arguments: ").add(ppType.apply(t1,_v381).add(new ESLVal(" ").add(ppType.apply(t2,_v381))))));
      }
    }
  });
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v380 = $args[0];
  ESLVal _v379 = $args[1];
  ESLVal _v378 = $args[2];
  ESLVal _v377 = $args[3];
  ESLVal _v376 = $args[4];
  ESLVal _v375 = $args[5];
  ESLVal _v374 = $args[6];
  ESLVal _v373 = $args[7];
  {ESLVal t1 = expType.apply(_v379,_v376,_v375,_v374,_v373);
        ESLVal t2 = expType.apply(_v377,_v376,_v375,_v374,_v373);
        
        if(isNumType.apply(t1).and(isNumType.apply(t2)).boolVal)
        return new ESLVal("BoolType",_v380);
        else
          return error(new ESLVal("TypeError",_v380,_v378.add(new ESLVal(" expects numeric arguments: ").add(ppType.apply(t1,_v373).add(new ESLVal(" ").add(ppType.apply(t2,_v373)))))));
      }
    }
  });
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),getSelf()) {
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
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v372,new ESLVal("or expects boolean arguments: ").add(ppType.apply(t1,_v366).add(new ESLVal(" ").add(ppType.apply(t2,_v366))))));
      }
    }
  });
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v365 = $args[0];
  ESLVal _v364 = $args[1];
  ESLVal _v363 = $args[2];
  ESLVal _v362 = $args[3];
  ESLVal _v361 = $args[4];
  ESLVal _v360 = $args[5];
  ESLVal _v359 = $args[6];
  {ESLVal t1 = expType.apply(_v364,_v362,_v361,_v360,_v359);
        ESLVal t2 = expType.apply(_v363,_v362,_v361,_v360,_v359);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v365);
        else
          return error(new ESLVal("TypeError",_v365,new ESLVal("= expects types to agree: ").add(ppType.apply(t1,_v359).add(new ESLVal(" <> ").add(ppType.apply(t2,_v359))))));
      }
    }
  });
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v358 = $args[0];
  ESLVal _v357 = $args[1];
  ESLVal _v356 = $args[2];
  ESLVal _v355 = $args[3];
  ESLVal _v354 = $args[4];
  ESLVal _v353 = $args[5];
  ESLVal _v352 = $args[6];
  {ESLVal t1 = expType.apply(_v357,_v355,_v354,_v353,_v352);
        ESLVal t2 = expType.apply(_v356,_v355,_v354,_v353,_v352);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v358);
        else
          return error(new ESLVal("TypeError",_v358,new ESLVal("<> expects types to agree: ").add(ppType.apply(t1,_v352).add(new ESLVal(" <> ").add(ppType.apply(t2,_v352))))));
      }
    }
  });
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v350 = $args[0];
  ESLVal _v349 = $args[1];
  ESLVal _v348 = $args[2];
  ESLVal _v347 = $args[3];
  ESLVal _v346 = $args[4];
  ESLVal _v345 = $args[5];
  ESLVal _v344 = $args[6];
  {ESLVal t1 = typeNF.apply(expType.apply(_v349,_v347,_v346,_v345,_v344),_v344);
        ESLVal t2 = typeNF.apply(expType.apply(_v348,_v347,_v346,_v345,_v344),_v344);
        
        {ESLVal _v42 = t2;
        ESLVal _v41 = t1;
        
        switch(_v42.termName) {
        case "ListType": {ESLVal $159 = _v42.termRef(0);
          ESLVal $158 = _v42.termRef(1);
          
          {ESLVal _v351 = $159;
          
          {ESLVal elementType = $158;
          
          {ESLVal headType = _v41;
          
          if(subType.apply(headType,elementType).boolVal)
          return t2;
          else
            return error(new ESLVal("TypeError",_v351,new ESLVal(": expects head type ").add(ppType.apply(headType,_v344).add(new ESLVal(" and element type ").add(ppType.apply(elementType,_v344).add(new ESLVal(" to agree")))))));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(57254,57535)").add(ESLVal.list(_v42,_v41)));
      }
      }
      }
    }
  });
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),getSelf()) {
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
        
        {ESLVal _v40 = t1;
        ESLVal _v39 = t2;
        
        switch(_v40.termName) {
        case "IntType": {ESLVal $156 = _v40.termRef(0);
          
          switch(_v39.termName) {
          case "IntType": {ESLVal $157 = _v39.termRef(0);
            
            {ESLVal l1 = $156;
            
            {ESLVal l2 = $157;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v340 = _v40;
            
            {ESLVal _v341 = _v39;
            
            return error(new ESLVal("TypeError",_v337,new ESLVal("incomptible types for /: ").add(ppType.apply(_v340,_v331).add(new ESLVal(" and ").add(ppType.apply(_v341,_v331))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $154 = _v40.termRef(0);
          
          switch(_v39.termName) {
          case "FloatType": {ESLVal $155 = _v39.termRef(0);
            
            {ESLVal l1 = $154;
            
            {ESLVal l2 = $155;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v338 = _v40;
            
            {ESLVal _v339 = _v39;
            
            return error(new ESLVal("TypeError",_v337,new ESLVal("incomptible types for /: ").add(ppType.apply(_v338,_v331).add(new ESLVal(" and ").add(ppType.apply(_v339,_v331))))));
          }
          }
        }
        }
        default: {ESLVal _v342 = _v40;
          
          {ESLVal _v343 = _v39;
          
          return error(new ESLVal("TypeError",_v337,new ESLVal("incomptible types for /: ").add(ppType.apply(_v342,_v331).add(new ESLVal(" and ").add(ppType.apply(_v343,_v331))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v324 = $args[0];
  ESLVal _v323 = $args[1];
  ESLVal _v322 = $args[2];
  ESLVal _v321 = $args[3];
  ESLVal _v320 = $args[4];
  ESLVal _v319 = $args[5];
  ESLVal _v318 = $args[6];
  {ESLVal t1 = expType.apply(_v323,_v321,_v320,_v319,_v318);
        ESLVal t2 = expType.apply(_v322,_v321,_v320,_v319,_v318);
        
        {ESLVal _v38 = t1;
        ESLVal _v37 = t2;
        
        switch(_v38.termName) {
        case "IntType": {ESLVal $151 = _v38.termRef(0);
          
          switch(_v37.termName) {
          case "IntType": {ESLVal $153 = _v37.termRef(0);
            
            {ESLVal l1 = $151;
            
            {ESLVal l2 = $153;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $152 = _v37.termRef(0);
            
            {ESLVal l1 = $151;
            
            {ESLVal l2 = $152;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v327 = _v38;
            
            {ESLVal _v328 = _v37;
            
            return error(new ESLVal("TypeError",_v324,new ESLVal("incomptible types for *: ").add(ppType.apply(_v327,_v318).add(new ESLVal(" and ").add(ppType.apply(_v328,_v318))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $148 = _v38.termRef(0);
          
          switch(_v37.termName) {
          case "FloatType": {ESLVal $150 = _v37.termRef(0);
            
            {ESLVal l1 = $148;
            
            {ESLVal l2 = $150;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $149 = _v37.termRef(0);
            
            {ESLVal l1 = $148;
            
            {ESLVal l2 = $149;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v325 = _v38;
            
            {ESLVal _v326 = _v37;
            
            return error(new ESLVal("TypeError",_v324,new ESLVal("incomptible types for *: ").add(ppType.apply(_v325,_v318).add(new ESLVal(" and ").add(ppType.apply(_v326,_v318))))));
          }
          }
        }
        }
        default: {ESLVal _v329 = _v38;
          
          {ESLVal _v330 = _v37;
          
          return error(new ESLVal("TypeError",_v324,new ESLVal("incomptible types for *: ").add(ppType.apply(_v329,_v318).add(new ESLVal(" and ").add(ppType.apply(_v330,_v318))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v311 = $args[0];
  ESLVal _v310 = $args[1];
  ESLVal _v309 = $args[2];
  ESLVal _v308 = $args[3];
  ESLVal _v307 = $args[4];
  ESLVal _v306 = $args[5];
  ESLVal _v305 = $args[6];
  {ESLVal t1 = expType.apply(_v310,_v308,_v307,_v306,_v305);
        ESLVal t2 = expType.apply(_v309,_v308,_v307,_v306,_v305);
        
        {ESLVal _v36 = t1;
        ESLVal _v35 = t2;
        
        switch(_v36.termName) {
        case "IntType": {ESLVal $145 = _v36.termRef(0);
          
          switch(_v35.termName) {
          case "IntType": {ESLVal $147 = _v35.termRef(0);
            
            {ESLVal l1 = $145;
            
            {ESLVal l2 = $147;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $146 = _v35.termRef(0);
            
            {ESLVal l1 = $145;
            
            {ESLVal l2 = $146;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v314 = _v36;
            
            {ESLVal _v315 = _v35;
            
            return error(new ESLVal("TypeError",_v311,new ESLVal("incomptible types for -: ").add(ppType.apply(_v314,_v305).add(new ESLVal(" and ").add(ppType.apply(_v315,_v305))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $142 = _v36.termRef(0);
          
          switch(_v35.termName) {
          case "FloatType": {ESLVal $144 = _v35.termRef(0);
            
            {ESLVal l1 = $142;
            
            {ESLVal l2 = $144;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $143 = _v35.termRef(0);
            
            {ESLVal l1 = $142;
            
            {ESLVal l2 = $143;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v312 = _v36;
            
            {ESLVal _v313 = _v35;
            
            return error(new ESLVal("TypeError",_v311,new ESLVal("incomptible types for -: ").add(ppType.apply(_v312,_v305).add(new ESLVal(" and ").add(ppType.apply(_v313,_v305))))));
          }
          }
        }
        }
        default: {ESLVal _v316 = _v36;
          
          {ESLVal _v317 = _v35;
          
          return error(new ESLVal("TypeError",_v311,new ESLVal("incomptible types for -: ").add(ppType.apply(_v316,_v305).add(new ESLVal(" and ").add(ppType.apply(_v317,_v305))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v270 = $args[0];
  ESLVal _v269 = $args[1];
  ESLVal _v268 = $args[2];
  ESLVal _v267 = $args[3];
  ESLVal _v266 = $args[4];
  ESLVal _v265 = $args[5];
  ESLVal _v264 = $args[6];
  {ESLVal t1 = expType.apply(_v269,_v267,_v266,_v265,_v264);
        ESLVal t2 = expType.apply(_v268,_v267,_v266,_v265,_v264);
        
        {ESLVal _v34 = t1;
        ESLVal _v33 = t2;
        
        switch(_v34.termName) {
        case "StrType": {ESLVal $141 = _v34.termRef(0);
          
          {ESLVal _v299 = $141;
          
          {ESLVal _v300 = _v33;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $139 = _v34.termRef(0);
          
          switch(_v33.termName) {
          case "IntType": {ESLVal $140 = _v33.termRef(0);
            
            {ESLVal l1 = $139;
            
            {ESLVal l2 = $140;
            
            return t1;
          }
          }
          }
          default: switch(_v33.termName) {
            case "StrType": {ESLVal $128 = _v33.termRef(0);
              
              {ESLVal _v295 = _v34;
              
              {ESLVal _v296 = $128;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v297 = _v34;
              
              {ESLVal _v298 = _v33;
              
              return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v297,_v264).add(new ESLVal(" and ").add(ppType.apply(_v298,_v264))))));
            }
            }
          }
        }
        }
      case "FloatType": {ESLVal $137 = _v34.termRef(0);
          
          switch(_v33.termName) {
          case "FloatType": {ESLVal $138 = _v33.termRef(0);
            
            {ESLVal l1 = $137;
            
            {ESLVal l2 = $138;
            
            return t1;
          }
          }
          }
          default: switch(_v33.termName) {
            case "StrType": {ESLVal $128 = _v33.termRef(0);
              
              {ESLVal _v291 = _v34;
              
              {ESLVal _v292 = $128;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v293 = _v34;
              
              {ESLVal _v294 = _v33;
              
              return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v293,_v264).add(new ESLVal(" and ").add(ppType.apply(_v294,_v264))))));
            }
            }
          }
        }
        }
      case "ListType": {ESLVal $134 = _v34.termRef(0);
          ESLVal $133 = _v34.termRef(1);
          
          switch(_v33.termName) {
          case "ListType": {ESLVal $136 = _v33.termRef(0);
            ESLVal $135 = _v33.termRef(1);
            
            {ESLVal l1 = $134;
            
            {ESLVal _v281 = $133;
            
            {ESLVal l2 = $136;
            
            {ESLVal _v282 = $135;
            
            if(typeEqual.apply(_v281,_v282).boolVal)
            return new ESLVal("ListType",l1,_v281);
            else
              switch(_v33.termName) {
                case "StrType": {ESLVal $128 = _v33.termRef(0);
                  
                  {ESLVal _v283 = _v34;
                  
                  {ESLVal _v284 = $128;
                  
                  return _v282;
                }
                }
                }
                default: {ESLVal _v285 = _v34;
                  
                  {ESLVal _v286 = _v33;
                  
                  return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v285,_v264).add(new ESLVal(" and ").add(ppType.apply(_v286,_v264))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v33.termName) {
            case "StrType": {ESLVal $128 = _v33.termRef(0);
              
              {ESLVal _v287 = _v34;
              
              {ESLVal _v288 = $128;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v289 = _v34;
              
              {ESLVal _v290 = _v33;
              
              return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v289,_v264).add(new ESLVal(" and ").add(ppType.apply(_v290,_v264))))));
            }
            }
          }
        }
        }
      case "SetType": {ESLVal $130 = _v34.termRef(0);
          ESLVal $129 = _v34.termRef(1);
          
          switch(_v33.termName) {
          case "SetType": {ESLVal $132 = _v33.termRef(0);
            ESLVal $131 = _v33.termRef(1);
            
            {ESLVal l1 = $130;
            
            {ESLVal _v271 = $129;
            
            {ESLVal l2 = $132;
            
            {ESLVal _v272 = $131;
            
            if(typeEqual.apply(_v271,_v272).boolVal)
            return new ESLVal("SetType",l1,_v271);
            else
              switch(_v33.termName) {
                case "StrType": {ESLVal $128 = _v33.termRef(0);
                  
                  {ESLVal _v273 = _v34;
                  
                  {ESLVal _v274 = $128;
                  
                  return _v272;
                }
                }
                }
                default: {ESLVal _v275 = _v34;
                  
                  {ESLVal _v276 = _v33;
                  
                  return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v275,_v264).add(new ESLVal(" and ").add(ppType.apply(_v276,_v264))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v33.termName) {
            case "StrType": {ESLVal $128 = _v33.termRef(0);
              
              {ESLVal _v277 = _v34;
              
              {ESLVal _v278 = $128;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v279 = _v34;
              
              {ESLVal _v280 = _v33;
              
              return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v279,_v264).add(new ESLVal(" and ").add(ppType.apply(_v280,_v264))))));
            }
            }
          }
        }
        }
        default: switch(_v33.termName) {
          case "StrType": {ESLVal $128 = _v33.termRef(0);
            
            {ESLVal _v301 = _v34;
            
            {ESLVal _v302 = $128;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v303 = _v34;
            
            {ESLVal _v304 = _v33;
            
            return error(new ESLVal("TypeError",_v270,new ESLVal("incomptible types for +: ").add(ppType.apply(_v303,_v264).add(new ESLVal(" and ").add(ppType.apply(_v304,_v264))))));
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
      ESLVal _v259 = $args[0];
  ESLVal _v258 = $args[1];
  ESLVal _v257 = $args[2];
  ESLVal _v256 = $args[3];
  ESLVal _v255 = $args[4];
  ESLVal _v254 = $args[5];
  ESLVal _v253 = $args[6];
  {ESLVal _v261 = substTypesEnv.apply(_v253,_v257);
        ESLVal _v260 = expType.apply(_v258,_v256,_v255,_v254,_v253);
        
        {ESLVal _v32 = _v260;
        
        switch(_v32.termName) {
        case "ForallType": {ESLVal $127 = _v32.termRef(0);
          ESLVal $126 = _v32.termRef(1);
          ESLVal $125 = _v32.termRef(2);
          
          {ESLVal l1 = $127;
          
          {ESLVal ns = $126;
          
          {ESLVal _v262 = $125;
          
          if(length.apply(ns).eql(length.apply(_v261)).boolVal)
          {ESLVal env = zipTypeEnv.apply(ns,_v261);
            
            return substTypeEnv.apply(env.add(_v255),_v262);
          }
          else
            return error(new ESLVal("TypeError",_v259,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v261))))));
        }
        }
        }
        }
        default: {ESLVal _v263 = _v32;
          
          return error(new ESLVal("TypeError",_v259,new ESLVal("expecting a universal type: ").add(_v263)));
        }
      }
      }
      }
    }
  });
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v252 = $args[0];
  ESLVal _v251 = $args[1];
  ESLVal _v250 = $args[2];
  ESLVal _v249 = $args[3];
  ESLVal _v248 = $args[4];
  return map.apply(new ESLVal(new Function(new ESLVal("fun2929"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expType.apply(e,_v251,_v250,_v249,_v248);
          }
        }),_v252);
    }
  });
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v247 = $args[0];
  ESLVal _v246 = $args[1];
  ESLVal _v245 = $args[2];
  ESLVal _v244 = $args[3];
  ESLVal _v243 = $args[4];
  ESLVal _v242 = $args[5];
  ESLVal _v241 = $args[6];
  {ESLVal _v31 = typeNF.apply(expType.apply(_v246,_v244,_v243,_v242,_v241),_v241);
        
        switch(_v31.termName) {
        case "FunType": {ESLVal $124 = _v31.termRef(0);
          ESLVal $123 = _v31.termRef(1);
          ESLVal $122 = _v31.termRef(2);
          
          {ESLVal l1 = $124;
          
          {ESLVal domain = $123;
          
          {ESLVal range = $122;
          
          {ESLVal supplied = expTypes.apply(_v245,_v244,_v243,_v242,_v241);
          
          if(length.apply(domain).eql(length.apply(supplied)).boolVal)
          if(subTypes.apply(supplied,domain).boolVal)
            return range;
            else
              return error(new ESLVal("TypeError",_v247,new ESLVal("supplied argument types ").add(ppTypes.apply(supplied,_v241).add(new ESLVal(" do not match function domain ").add(ppTypes.apply(domain,_v241))))));
          else
            return error(new ESLVal("TypeError",_v247,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
        }
        }
        }
        }
        }
        default: {ESLVal t = _v31;
          
          return error(new ESLVal("TypeError",_v247,new ESLVal("unknown type for apply: ").add(ppType.apply(t,_v241))));
        }
      }
      }
    }
  });
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v240 = $args[0];
  ESLVal _v239 = $args[1];
  ESLVal _v238 = $args[2];
  ESLVal _v237 = $args[3];
  ESLVal _v236 = $args[4];
  ESLVal _v235 = $args[5];
  ESLVal _v234 = $args[6];
  ESLVal _v233 = $args[7];
  {ESLVal testType = expType.apply(_v239,_v236,_v235,_v234,_v233);
        
        if(isBoolType.apply(testType).boolVal)
        {ESLVal conseqType = expType.apply(_v238,_v236,_v235,_v234,_v233);
          ESLVal altType = expType.apply(_v237,_v236,_v235,_v234,_v233);
          
          if(typeEqual.apply(conseqType,altType).boolVal)
          return conseqType;
          else
            return error(new ESLVal("TypeError",_v240,new ESLVal("conseq and alt types do not agree: ").add(ppType.apply(conseqType,_v233).add(new ESLVal(" ").add(ppType.apply(altType,_v233))))));
        }
        else
          return error(new ESLVal("if expects a bool ").add(ppType.apply(testType,_v233)));
      }
    }
  });
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  {ESLVal _v29 = ds;
        
        if(_v29.isCons())
        {ESLVal $120 = _v29.head();
          ESLVal $121 = _v29.tail();
          
          {ESLVal d = $120;
          
          {ESLVal _v231 = $121;
          
          if(member.apply(decName.apply(d),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v30 = $qualArg;
              
              {ESLVal _v232 = _v30;
              
              return ESLVal.list(ESLVal.list(decName.apply(_v232)));
            }
            }
          }
        }).map(_v231).flatten().flatten()).boolVal)
          return error(new ESLVal("TypeError",decLoc.apply(d),new ESLVal(" duplicate argument ").add(decName.apply(d))));
          else
            return checkDecs.apply(_v231);
        }
        }
        }
      else if(_v29.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(62401,62634)").add(ESLVal.list(_v29)));
      }
    }
  });
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v228 = $args[0];
  ESLVal _v227 = $args[1];
  ESLVal _v226 = $args[2];
  ESLVal _v225 = $args[3];
  ESLVal _v224 = $args[4];
  ESLVal _v223 = $args[5];
  ESLVal _v222 = $args[6];
  ESLVal _v221 = $args[7];
  ESLVal _v220 = $args[8];
  {checkDecs.apply(_v226);
      {ESLVal nType = expType.apply(_v227,_v223,_v222,_v221,_v220);
        
        if(isStrType.apply(nType).boolVal)
        {ESLVal declaredType = substTypeEnv.apply(_v220,_v225);
          
          return decTypes.apply(_v226,_v222,_v220,new ESLVal(new Function(new ESLVal("fun2930"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v230 = $args[0];
          ESLVal _v229 = $args[1];
          {ESLVal actualRange = expType.apply(_v224,_v223,_v229,_v221,_v220);
                
                if(subType.apply(new ESLVal("FunType",_v228,_v230,actualRange),declaredType).boolVal)
                return new ESLVal("FunType",_v228,_v230,actualRange);
                else
                  return error(new ESLVal("TypeError",_v228,new ESLVal("function declared type ").add(ppType.apply(declaredType,_v220).add(new ESLVal(" but is ").add(ppType.apply(new ESLVal("FunType",_v228,_v230,actualRange),_v220))))));
              }
            }
          }));
        }
        else
          return error(new ESLVal("TypeError",_v228,new ESLVal("expecting a string for a function name: ").add(_v227)));
      }}
    }
  });
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v216 = $args[0];
  ESLVal _v215 = $args[1];
  ESLVal _v214 = $args[2];
  ESLVal _v213 = $args[3];
  LetRec letrec = new LetRec() {
        ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v218 = $args[0];
          ESLVal _v217 = $args[1];
          {ESLVal _v28 = _v218;
                
                if(_v28.isCons())
                {ESLVal $114 = _v28.head();
                  ESLVal $115 = _v28.tail();
                  
                  switch($114.termName) {
                  case "Dec": {ESLVal $119 = $114.termRef(0);
                    ESLVal $118 = $114.termRef(1);
                    ESLVal $117 = $114.termRef(2);
                    ESLVal $116 = $114.termRef(3);
                    
                    {ESLVal l = $119;
                    
                    {ESLVal n = $118;
                    
                    {ESLVal t = $117;
                    
                    {ESLVal st = $116;
                    
                    {ESLVal _v219 = $115;
                    
                    return processDecs.apply(_v219,_v217.cons(new ESLVal("Map",n,substTypeEnv.apply(_v214,t))));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(63827,64052)").add(ESLVal.list(_v28)));
                }
                }
              else if(_v28.isNil())
                return _v213.apply(reverse.apply(typeEnvRan.apply(_v217)),_v217.add(_v215));
              else return error(new ESLVal("case error at Pos(63827,64052)").add(ESLVal.list(_v28)));
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
      
        return processDecs.apply(_v216,$nil);
      
    }
  });
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v212 = $args[0];
  ESLVal _v211 = $args[1];
  ESLVal _v210 = $args[2];
  ESLVal _v209 = $args[3];
  ESLVal _v208 = $args[4];
  ESLVal _v207 = $args[5];
  ESLVal _v206 = $args[6];
  ESLVal _v205 = $args[7];
  {ESLVal t0 = lookupType.apply(_v211,_v206);
        
        if(t0.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v212,new ESLVal("cannot find cnstr ").add(_v211)));
        else
          {ESLVal t = unfoldIf.apply(t0);
            
            return termTypeCheckUnion.apply(t,_v212,_v211,_v210,_v209,_v208,_v207,_v206,_v205);
          }
      }
    }
  });
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v202 = $args[0];
  ESLVal _v201 = $args[1];
  ESLVal _v200 = $args[2];
  ESLVal _v199 = $args[3];
  ESLVal _v198 = $args[4];
  ESLVal _v197 = $args[5];
  ESLVal _v196 = $args[6];
  ESLVal _v195 = $args[7];
  ESLVal _v194 = $args[8];
  if(_v202.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v201,new ESLVal("cannot find constructor ").add(_v200)));
        else
          {ESLVal _v26 = _v202;
            
            switch(_v26.termName) {
            case "TypeFun": {ESLVal $111 = _v26.termRef(0);
              ESLVal $110 = _v26.termRef(1);
              ESLVal $109 = _v26.termRef(2);
              
              {ESLVal lf = $111;
              
              {ESLVal ns = $110;
              
              {ESLVal body = $109;
              
              if(length.apply(ns).eql(length.apply(_v199)).boolVal)
              {ESLVal args = map.apply(new ESLVal(new Function(new ESLVal("fun2931"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v203 = $args[0];
                  return substTypeEnv.apply(_v194,_v203);
                    }
                  }),_v199);
                
                {ESLVal _v27 = substTypeEnv.apply(zipTypeEnv.apply(ns,args),body);
                
                switch(_v27.termName) {
                case "UnionType": {ESLVal $113 = _v27.termRef(0);
                  ESLVal $112 = _v27.termRef(1);
                  
                  {ESLVal l1 = $113;
                  
                  {ESLVal terms = $112;
                  
                  {ESLVal ts2 = findTermArgTypes.apply(_v200,terms);
                  
                  if(length.apply(_v198).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v201,_v198,ts2,_v197,_v196,_v195,_v194);
                  return new ESLVal("UnionType",l1,terms);}
                  else
                    return error(_v200.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v198))))));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(64925,65475)").add(ESLVal.list(_v27)));
              }
              }
              }
              else
                return error(new ESLVal("TypeError",_v201,new ESLVal("generic constructor ").add(_v200.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(_v199))))))));
            }
            }
            }
            }
          case "UnionType": {ESLVal $108 = _v26.termRef(0);
              ESLVal $107 = _v26.termRef(1);
              
              {ESLVal l1 = $108;
              
              {ESLVal terms = $107;
              
              {ESLVal ts2 = findTermArgTypes.apply(_v200,terms);
              
              if(length.apply(_v199).neql($zero).boolVal)
              return error(new ESLVal("TypeError",_v201,new ESLVal("generic application of non-generic constructior: ").add(_v200)));
              else
                if(length.apply(_v198).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v201,_v198,ts2,_v197,_v196,_v195,_v194);
                  return _v202;}
                  else
                    return error(_v200.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v198))))));
            }
            }
            }
            }
            default: {ESLVal _v204 = _v26;
              
              return error(new ESLVal("TypeError",_v201,new ESLVal("expecting a union type for ").add(_v200.add(new ESLVal(" but got ").add(ppType.apply(_v204,_v194))))));
            }
          }
          }
    }
  });
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v25 = t;
        
        switch(_v25.termName) {
        case "RecType": {ESLVal $106 = _v25.termRef(0);
          ESLVal $105 = _v25.termRef(1);
          ESLVal $104 = _v25.termRef(2);
          
          {ESLVal l = $106;
          
          {ESLVal n = $105;
          
          {ESLVal _v192 = $104;
          
          return unfoldIf.apply(unfoldType.apply(l,n,_v192));
        }
        }
        }
        }
        default: {ESLVal _v193 = _v25;
          
          return _v193;
        }
      }
      }
    }
  });
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal terms = $args[1];
  {ESLVal _v24 = terms;
        
        if(_v24.isCons())
        {ESLVal $99 = _v24.head();
          ESLVal $100 = _v24.tail();
          
          switch($99.termName) {
          case "TermType": {ESLVal $103 = $99.termRef(0);
            ESLVal $102 = $99.termRef(1);
            ESLVal $101 = $99.termRef(2);
            
            {ESLVal l = $103;
            
            {ESLVal nn = $102;
            
            {ESLVal ts = $101;
            
            {ESLVal _v190 = $100;
            
            if(nn.eql(n).boolVal)
            return ts;
            else
              {ESLVal t = $99;
                
                {ESLVal _v191 = $100;
                
                return findTermArgTypes.apply(n,_v191);
              }
              }
          }
          }
          }
          }
          }
          default: {ESLVal t = $99;
            
            {ESLVal ts = $100;
            
            return findTermArgTypes.apply(n,ts);
          }
          }
        }
        }
      else if(_v24.isNil())
        return error(new ESLVal("cannot find constructor ").add(n));
      else return error(new ESLVal("case error at Pos(66471,66671)").add(ESLVal.list(_v24)));
      }
    }
  });
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v187 = $args[0];
  ESLVal _v186 = $args[1];
  ESLVal _v185 = $args[2];
  ESLVal _v184 = $args[3];
  ESLVal _v183 = $args[4];
  ESLVal _v182 = $args[5];
  ESLVal _v181 = $args[6];
  {ESLVal _v23 = _v186;
        ESLVal _v22 = _v185;
        
        if(_v23.isCons())
        {ESLVal $93 = _v23.head();
          ESLVal $94 = _v23.tail();
          
          if(_v22.isCons())
          {ESLVal $95 = _v22.head();
            ESLVal $96 = _v22.tail();
            
            {ESLVal e = $93;
            
            {ESLVal _v188 = $94;
            
            {ESLVal t = $95;
            
            {ESLVal _v189 = $96;
            
            {ESLVal tt = expType.apply(e,_v184,_v183,_v182,_v181);
            
            if(typeEqual.apply(t,tt).boolVal)
            return checkTermArgTypes.apply(_v187,_v188,_v189,_v184,_v183,_v182,_v181);
            else
              return error(new ESLVal("TypeError",_v187,new ESLVal("expected constructor arg type ").add(ppType.apply(t,_v181).add(new ESLVal(" but supplied ").add(ppType.apply(tt,_v181))))));
          }
          }
          }
          }
          }
          }
        else if(_v22.isNil())
          return error(new ESLVal("case error at Pos(66789,67211)").add(ESLVal.list(_v23,_v22)));
        else return error(new ESLVal("case error at Pos(66789,67211)").add(ESLVal.list(_v23,_v22)));
        }
      else if(_v23.isNil())
        if(_v22.isCons())
          {ESLVal $97 = _v22.head();
            ESLVal $98 = _v22.tail();
            
            return error(new ESLVal("case error at Pos(66789,67211)").add(ESLVal.list(_v23,_v22)));
          }
        else if(_v22.isNil())
          return $null;
        else return error(new ESLVal("case error at Pos(66789,67211)").add(ESLVal.list(_v23,_v22)));
      else return error(new ESLVal("case error at Pos(66789,67211)").add(ESLVal.list(_v23,_v22)));
      }
    }
  });
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v179 = $args[0];
  ESLVal _v178 = $args[1];
  ESLVal _v177 = $args[2];
  ESLVal _v176 = $args[3];
  ESLVal _v175 = $args[4];
  ESLVal _v174 = $args[5];
  {ESLVal _v21 = expType.apply(_v178,_v177,_v176,_v175,_v174);
        
        switch(_v21.termName) {
        case "BoolType": {ESLVal $92 = _v21.termRef(0);
          
          {ESLVal _v180 = $92;
          
          return new ESLVal("BoolType",_v180);
        }
        }
        default: {ESLVal t = _v21;
          
          return error(new ESLVal("TypeError",_v179,new ESLVal("expecting a boolean: ").add(ppType.apply(t,_v174))));
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
          {ESLVal _v20 = t;
            
            switch(_v20.termName) {
            case "TypeClosure": {ESLVal $91 = _v20.termRef(0);
              
              {ESLVal f = $91;
              
              return f.apply();
            }
            }
            default: {ESLVal _v173 = _v20;
              
              return _v173;
            }
          }
          }
      }
    }
  });
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v172 = $args[0];
  ESLVal _v171 = $args[1];
  ESLVal _v170 = $args[2];
  ESLVal _v169 = $args[3];
  ESLVal _v168 = $args[4];
  ESLVal _v167 = $args[5];
  {ESLVal[] t = new ESLVal[]{new ESLVal("VoidType",_v172)};
        
        {{
        ESLVal _v19 = _v171;
        while(_v19.isCons()) {
          ESLVal e = _v19.headVal;
          t[0] = expType.apply(e,_v170,_v169,_v168,_v167);
          _v19 = _v19.tailVal;}
      }
      return t[0];}
      }
    }
  });
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v166 = $args[0];
  ESLVal _v165 = $args[1];
  ESLVal _v164 = $args[2];
  ESLVal _v163 = $args[3];
  ESLVal _v162 = $args[4];
  ESLVal _v161 = $args[5];
  if(_v165.eql($nil).boolVal)
        return new ESLVal("ForallType",_v166,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v166,new ESLVal("VarType",_v166,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun2932"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v164,_v163,_v162,_v161);
                }
              }),_v165);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("ListType",_v166,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v166,new ESLVal("lists should have elements of the same type: ").add(_v165)));
          }
    }
  });
  private static ESLVal setType = new ESLVal(new Function(new ESLVal("setType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v160 = $args[0];
  ESLVal _v159 = $args[1];
  ESLVal _v158 = $args[2];
  ESLVal _v157 = $args[3];
  ESLVal _v156 = $args[4];
  ESLVal _v155 = $args[5];
  if(_v159.eql($nil).boolVal)
        return new ESLVal("ForallType",_v160,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v160,new ESLVal("VarType",_v160,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun2933"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v158,_v157,_v156,_v155);
                }
              }),_v159);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("SetType",_v160,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v160,new ESLVal("sets should have elements of the same type: ").add(_v159)));
          }
    }
  });
  private static ESLVal bagType = new ESLVal(new Function(new ESLVal("bagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v154 = $args[0];
  ESLVal _v153 = $args[1];
  ESLVal _v152 = $args[2];
  ESLVal _v151 = $args[3];
  ESLVal _v150 = $args[4];
  ESLVal _v149 = $args[5];
  if(_v153.eql($nil).boolVal)
        return new ESLVal("ForallType",_v154,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v154,new ESLVal("VarType",_v154,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun2934"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v152,_v151,_v150,_v149);
                }
              }),_v153);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("BagType",_v154,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v154,new ESLVal("bags should have elements of the same type: ").add(_v153)));
          }
    }
  });
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v147 = $args[0];
          {ESLVal[] e = new ESLVal[]{$null};
                
                {ESLVal fenv = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v17 = $qualArg;
                        
                        {ESLVal t = _v17;
                        
                        return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v148 = $args[0];
                        {ESLVal _v18 = _v148;
                              
                              {ESLVal n = _v18;
                              
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
                  }).map(typeEnvRan.apply(_v147)).flatten().flatten();
                
                {ESLVal env1 = substOnce.apply(_v147,fenv);
                
                {e[0] = env1;
              return env1;}
              }
              }
              }
            }
          });
        ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v146 = $args[0];
          {ESLVal _v16 = _v146;
                
                if(_v16.isCons())
                {ESLVal $87 = _v16.head();
                  ESLVal $88 = _v16.tail();
                  
                  switch($87.termName) {
                  case "Map": {ESLVal $90 = $87.termRef(0);
                    ESLVal $89 = $87.termRef(1);
                    
                    {ESLVal n = $90;
                    
                    {ESLVal t = $89;
                    
                    {ESLVal e = $88;
                    
                    if(member.apply(n,typeFV.apply(t)).boolVal)
                    return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecType",p0,n,t)));
                    else
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,t));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(69760,69986)").add(ESLVal.list(_v16)));
                }
                }
              else if(_v16.isNil())
                return _v146;
              else return error(new ESLVal("case error at Pos(69760,69986)").add(ESLVal.list(_v16)));
              }
            }
          });
        ESLVal substOnce = new ESLVal(new Function(new ESLVal("substOnce"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v144 = $args[0];
          ESLVal _v143 = $args[1];
          {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  {ESLVal _v14 = m;
                        
                        switch(_v14.termName) {
                        case "Map": {ESLVal $86 = _v14.termRef(0);
                          ESLVal $85 = _v14.termRef(1);
                          
                          {ESLVal n = $86;
                          
                          {ESLVal t = $85;
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $qualArg = $args[0];
                          {ESLVal _v15 = $qualArg;
                                
                                {ESLVal _v145 = _v15;
                                
                                return ESLVal.list(ESLVal.list(new ESLVal("Map",_v145,lookupType.apply(_v145,_v143))));
                              }
                              }
                            }
                          }).map(typeFV.apply(t)).flatten().flatten(),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(70096,70227)").add(ESLVal.list(_v14)));
                      }
                      }
                    }
                  });
                
                return map.apply(map1,_v144);
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
  {ESLVal _v13 = t;
        
        switch(_v13.termName) {
        case "VarType": {ESLVal $84 = _v13.termRef(0);
          ESLVal $83 = _v13.termRef(1);
          
          {ESLVal l = $84;
          
          {ESLVal n = $83;
          
          return n;
        }
        }
        }
        default: {ESLVal x = _v13;
          
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
  {ESLVal _v12 = decs;
        
        if(_v12.isCons())
        {ESLVal $81 = _v12.head();
          ESLVal $82 = _v12.tail();
          
          {ESLVal d = $81;
          
          {ESLVal ds = $82;
          
          return tdecFV1.apply(d,tdecsFV1.apply(ds,fv));
        }
        }
        }
      else if(_v12.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(70613,70702)").add(ESLVal.list(_v12)));
      }
    }
  });
  private static ESLVal tdecFV1 = new ESLVal(new Function(new ESLVal("tdecFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v11 = d;
        
        switch(_v11.termName) {
        case "Dec": {ESLVal $80 = _v11.termRef(0);
          ESLVal $79 = _v11.termRef(1);
          ESLVal $78 = _v11.termRef(2);
          ESLVal $77 = _v11.termRef(3);
          
          {ESLVal l = $80;
          
          {ESLVal n = $79;
          
          {ESLVal t = $78;
          
          {ESLVal st = $77;
          
          return typeFV1.apply(t,fv);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(70746,70825)").add(ESLVal.list(_v11)));
      }
      }
    }
  });
  private static ESLVal handlersFV1 = new ESLVal(new Function(new ESLVal("handlersFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal handlers = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v10 = handlers;
        
        if(_v10.isCons())
        {ESLVal $75 = _v10.head();
          ESLVal $76 = _v10.tail();
          
          {ESLVal m = $75;
          
          {ESLVal hs = $76;
          
          return handlerFV1.apply(m,handlersFV1.apply(hs,fv));
        }
        }
        }
      else if(_v10.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(70883,70985)").add(ESLVal.list(_v10)));
      }
    }
  });
  private static ESLVal handlerFV1 = new ESLVal(new Function(new ESLVal("handlerFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v9 = m;
        
        switch(_v9.termName) {
        case "MessageType": {ESLVal $74 = _v9.termRef(0);
          ESLVal $73 = _v9.termRef(1);
          
          {ESLVal l = $74;
          
          {ESLVal ts = $73;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(71033,71109)").add(ESLVal.list(_v9)));
      }
      }
    }
  });
  private static ESLVal typesFV1 = new ESLVal(new Function(new ESLVal("typesFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v8 = ts;
        
        if(_v8.isCons())
        {ESLVal $71 = _v8.head();
          ESLVal $72 = _v8.tail();
          
          {ESLVal t = $71;
          
          {ESLVal _v142 = $72;
          
          return typeFV1.apply(t,typesFV1.apply(_v142,fv));
        }
        }
        }
      else if(_v8.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(71158,71245)").add(ESLVal.list(_v8)));
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
          
          {ESLVal _v141 = $59;
          
          return typeFV1.apply(_v141,fv);
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
          
          {ESLVal _v140 = $42;
          
          return typeFV1.apply(_v140,fv);
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
          
          {ESLVal _v137 = $38;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun2935"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v138 = $args[0];
          {ESLVal _v7 = _v138;
                
                switch(_v7.termName) {
                case "VarType": {ESLVal $70 = _v7.termRef(0);
                  ESLVal $69 = _v7.termRef(1);
                  
                  {ESLVal _v139 = $70;
                  
                  {ESLVal n = $69;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(72084,72144)").add(ESLVal.list(_v7)));
              }
              }
            }
          }),typeFV1.apply(_v137,$nil)).add(fv);
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
          
          {ESLVal _v136 = $32;
          
          return typeFV1.apply(_v136,fv);
        }
        }
        }
      case "BagType": {ESLVal $31 = _v3.termRef(0);
          ESLVal $30 = _v3.termRef(1);
          
          {ESLVal l = $31;
          
          {ESLVal _v135 = $30;
          
          return typeFV1.apply(_v135,fv);
        }
        }
        }
      case "SetType": {ESLVal $29 = _v3.termRef(0);
          ESLVal $28 = _v3.termRef(1);
          
          {ESLVal l = $29;
          
          {ESLVal _v134 = $28;
          
          return typeFV1.apply(_v134,fv);
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
          
          return typesFV1.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v6 = $qualArg;
                
                switch(_v6.termName) {
                case "Dec": {ESLVal $68 = _v6.termRef(0);
                  ESLVal $67 = _v6.termRef(1);
                  ESLVal $66 = _v6.termRef(2);
                  ESLVal $65 = _v6.termRef(3);
                  
                  {ESLVal _v132 = $68;
                  
                  {ESLVal n = $67;
                  
                  {ESLVal _v133 = $66;
                  
                  {ESLVal dt = $65;
                  
                  return ESLVal.list(ESLVal.list(_v133));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v6;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),fv);
        }
        }
        }
      case "RecType": {ESLVal $24 = _v3.termRef(0);
          ESLVal $23 = _v3.termRef(1);
          ESLVal $22 = _v3.termRef(2);
          
          {ESLVal l = $24;
          
          {ESLVal a = $23;
          
          {ESLVal _v129 = $22;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun2936"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v130 = $args[0];
          {ESLVal _v5 = _v130;
                
                switch(_v5.termName) {
                case "VarType": {ESLVal $64 = _v5.termRef(0);
                  ESLVal $63 = _v5.termRef(1);
                  
                  {ESLVal _v131 = $64;
                  
                  {ESLVal n = $63;
                  
                  return n.eql(a).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(72585,72633)").add(ESLVal.list(_v5)));
              }
              }
            }
          }),typeFV1.apply(_v129,$nil)).add(fv);
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
          
          {ESLVal _v126 = $11;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun2937"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v127 = $args[0];
          {ESLVal _v4 = _v127;
                
                switch(_v4.termName) {
                case "VarType": {ESLVal $62 = _v4.termRef(0);
                  ESLVal $61 = _v4.termRef(1);
                  
                  {ESLVal _v128 = $62;
                  
                  {ESLVal n = $61;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(72929,72989)").add(ESLVal.list(_v4)));
              }
              }
            }
          }),typeFV1.apply(_v126,$nil)).add(fv);
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $10 = _v3.termRef(0);
          ESLVal $9 = _v3.termRef(1);
          
          {ESLVal l = $10;
          
          {ESLVal _v125 = $9;
          
          return typeFV1.apply(_v125,fv);
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
          
          {ESLVal _v124 = $2;
          
          {ESLVal n = $1;
          
          return typeFV1.apply(_v124,fv);
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