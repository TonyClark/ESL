package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.Tables.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class TypeCheck {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v123 = p;
        
        switch(_v123.termName) {
        case "PAdd": {ESLVal $871 = _v123.termRef(0);
          ESLVal $870 = _v123.termRef(1);
          ESLVal $869 = _v123.termRef(2);
          
          {ESLVal l = $871;
          
          {ESLVal p1 = $870;
          
          {ESLVal p2 = $869;
          
          return ppPattern.apply(p1).add(new ESLVal(" + ").add(ppPattern.apply(p2)));
        }
        }
        }
        }
      case "PVar": {ESLVal $868 = _v123.termRef(0);
          ESLVal $867 = _v123.termRef(1);
          ESLVal $866 = _v123.termRef(2);
          
          {ESLVal l = $868;
          
          {ESLVal n = $867;
          
          {ESLVal t = $866;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $863 = _v123.termRef(0);
          ESLVal $862 = _v123.termRef(1);
          ESLVal $861 = _v123.termRef(2);
          ESLVal $860 = _v123.termRef(3);
          
          if($861.isCons())
          {ESLVal $864 = $861.head();
            ESLVal $865 = $861.tail();
            
            {ESLVal l = $863;
            
            {ESLVal n = $862;
            
            {ESLVal ts = $861;
            
            {ESLVal ps = $860;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
          }
        else if($861.isNil())
          {ESLVal l = $863;
            
            {ESLVal n = $862;
            
            {ESLVal ps = $860;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $863;
            
            {ESLVal n = $862;
            
            {ESLVal ts = $861;
            
            {ESLVal ps = $860;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $859 = _v123.termRef(0);
          ESLVal $858 = _v123.termRef(1);
          ESLVal $857 = _v123.termRef(2);
          
          {ESLVal l = $859;
          
          {ESLVal _v1066 = $858;
          
          {ESLVal ts = $857;
          
          return ppPattern.apply(_v1066).add(ppTypes.apply(ts,ESLVal.list()));
        }
        }
        }
        }
      case "PNil": {ESLVal $856 = _v123.termRef(0);
          
          {ESLVal l = $856;
          
          return new ESLVal("[]");
        }
        }
      case "PEmptySet": {ESLVal $855 = _v123.termRef(0);
          
          {ESLVal l = $855;
          
          return new ESLVal("Set{}");
        }
        }
      case "PEmptyBag": {ESLVal $854 = _v123.termRef(0);
          
          {ESLVal l = $854;
          
          return new ESLVal("Bag{}");
        }
        }
      case "PInt": {ESLVal $853 = _v123.termRef(0);
          ESLVal $852 = _v123.termRef(1);
          
          {ESLVal l = $853;
          
          {ESLVal n = $852;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $851 = _v123.termRef(0);
          ESLVal $850 = _v123.termRef(1);
          
          {ESLVal l = $851;
          
          {ESLVal b = $850;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $849 = _v123.termRef(0);
          ESLVal $848 = _v123.termRef(1);
          
          {ESLVal l = $849;
          
          {ESLVal s = $848;
          
          return s;
        }
        }
        }
      case "PCons": {ESLVal $847 = _v123.termRef(0);
          ESLVal $846 = _v123.termRef(1);
          ESLVal $845 = _v123.termRef(2);
          
          {ESLVal l = $847;
          
          {ESLVal h = $846;
          
          {ESLVal t = $845;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $844 = _v123.termRef(0);
          ESLVal $843 = _v123.termRef(1);
          ESLVal $842 = _v123.termRef(2);
          
          {ESLVal l = $844;
          
          {ESLVal p1 = $843;
          
          {ESLVal p2 = $842;
          
          return new ESLVal("Set{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $841 = _v123.termRef(0);
          ESLVal $840 = _v123.termRef(1);
          ESLVal $839 = _v123.termRef(2);
          
          {ESLVal l = $841;
          
          {ESLVal p1 = $840;
          
          {ESLVal p2 = $839;
          
          return new ESLVal("Bag{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
        default: {ESLVal _v1067 = _v123;
          
          return new ESLVal("<unknown: ").add(_v1067.add(new ESLVal(">")));
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
                    case "Map": {ESLVal $838 = _v122.termRef(0);
                      ESLVal $837 = _v122.termRef(1);
                      
                      {ESLVal n = $838;
                      
                      {ESLVal t = $837;
                      
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
                    case "Map": {ESLVal $836 = _v118.termRef(0);
                      ESLVal $835 = _v118.termRef(1);
                      
                      {ESLVal n = $836;
                      
                      {ESLVal t = $835;
                      
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
  return new ESLVal(new Function(new ESLVal("fun264"),getSelf()) {
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
        {ESLVal $829 = _v114.head();
          ESLVal $830 = _v114.tail();
          
          switch($829.termName) {
          case "MessageType": {ESLVal $832 = $829.termRef(0);
            ESLVal $831 = $829.termRef(1);
            
            if($831.isCons())
            {ESLVal $833 = $831.head();
              ESLVal $834 = $831.tail();
              
              {ESLVal l = $832;
              
              {ESLVal t = $833;
              
              {ESLVal ts = $834;
              
              {ESLVal hs = $830;
              
              return ppType.apply(t,env).add(new ESLVal("; ").add(ppHandlers.apply(hs,env)));
            }
            }
            }
            }
            }
          else if($831.isNil())
            return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v114)));
          else return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v114)));
          }
          default: return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v114)));
        }
        }
      else if(_v114.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v114)));
      }
    }
  });
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal decs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v113 = decs;
        
        if(_v113.isCons())
        {ESLVal $823 = _v113.head();
          ESLVal $824 = _v113.tail();
          
          switch($823.termName) {
          case "Dec": {ESLVal $828 = $823.termRef(0);
            ESLVal $827 = $823.termRef(1);
            ESLVal $826 = $823.termRef(2);
            ESLVal $825 = $823.termRef(3);
            
            {ESLVal l = $828;
            
            {ESLVal n = $827;
            
            {ESLVal t = $826;
            
            {ESLVal d = $825;
            
            {ESLVal _v1065 = $824;
            
            return n.add(new ESLVal("::").add(ppType.apply(t,env).add(new ESLVal("; ").add(ppDecs.apply(_v1065,env)))));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5545,5659)").add(ESLVal.list(_v113)));
        }
        }
      else if(_v113.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(5545,5659)").add(ESLVal.list(_v113)));
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
          {ESLVal _v112 = t;
            
            switch(_v112.termName) {
            case "ActType": {ESLVal $822 = _v112.termRef(0);
              ESLVal $821 = _v112.termRef(1);
              ESLVal $820 = _v112.termRef(2);
              
              {ESLVal l = $822;
              
              {ESLVal decs = $821;
              
              {ESLVal handlers = $820;
              
              return new ESLVal("Act { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")));
            }
            }
            }
            }
          case "ApplyType": {ESLVal $819 = _v112.termRef(0);
              ESLVal $818 = _v112.termRef(1);
              ESLVal $817 = _v112.termRef(2);
              
              {ESLVal l = $819;
              
              {ESLVal n = $818;
              
              {ESLVal args = $817;
              
              return n.add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ApplyTypeFun": {ESLVal $816 = _v112.termRef(0);
              ESLVal $815 = _v112.termRef(1);
              ESLVal $814 = _v112.termRef(2);
              
              {ESLVal l = $816;
              
              {ESLVal op = $815;
              
              {ESLVal args = $814;
              
              return ppType.apply(op,env).add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ArrayType": {ESLVal $813 = _v112.termRef(0);
              ESLVal $812 = _v112.termRef(1);
              
              {ESLVal l = $813;
              
              {ESLVal _v1064 = $812;
              
              return new ESLVal("Array[").add(ppType.apply(_v1064,env).add(new ESLVal("]")));
            }
            }
            }
          case "BagType": {ESLVal $811 = _v112.termRef(0);
              ESLVal $810 = _v112.termRef(1);
              
              {ESLVal l = $811;
              
              {ESLVal _v1063 = $810;
              
              return new ESLVal("Set{").add(ppType.apply(_v1063,env).add(new ESLVal("}")));
            }
            }
            }
          case "BoolType": {ESLVal $809 = _v112.termRef(0);
              
              {ESLVal l = $809;
              
              return new ESLVal("Bool");
            }
            }
          case "ExtendedAct": {ESLVal $808 = _v112.termRef(0);
              ESLVal $807 = _v112.termRef(1);
              ESLVal $806 = _v112.termRef(2);
              ESLVal $805 = _v112.termRef(3);
              
              {ESLVal l = $808;
              
              {ESLVal parent = $807;
              
              {ESLVal decs = $806;
              
              {ESLVal handlers = $805;
              
              return new ESLVal("Act extends ").add(ppType.apply(parent,env).add(new ESLVal(" { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")))));
            }
            }
            }
            }
            }
          case "FloatType": {ESLVal $804 = _v112.termRef(0);
              
              {ESLVal l = $804;
              
              return new ESLVal("Float");
            }
            }
          case "FieldType": {ESLVal $803 = _v112.termRef(0);
              ESLVal $802 = _v112.termRef(1);
              ESLVal $801 = _v112.termRef(2);
              
              {ESLVal l = $803;
              
              {ESLVal n = $802;
              
              {ESLVal _v1062 = $801;
              
              return n.add(new ESLVal("::").add(ppType.apply(_v1062,env)));
            }
            }
            }
            }
          case "ForallType": {ESLVal $800 = _v112.termRef(0);
              ESLVal $799 = _v112.termRef(1);
              ESLVal $798 = _v112.termRef(2);
              
              {ESLVal l = $800;
              
              {ESLVal ns = $799;
              
              {ESLVal _v1061 = $798;
              
              return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v1061,env))));
            }
            }
            }
            }
          case "FunType": {ESLVal $797 = _v112.termRef(0);
              ESLVal $796 = _v112.termRef(1);
              ESLVal $795 = _v112.termRef(2);
              
              {ESLVal l = $797;
              
              {ESLVal d = $796;
              
              {ESLVal r = $795;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
          case "TaggedFunType": {ESLVal $794 = _v112.termRef(0);
              ESLVal $793 = _v112.termRef(1);
              ESLVal $792 = _v112.termRef(2);
              ESLVal $791 = _v112.termRef(3);
              
              {ESLVal l = $794;
              
              {ESLVal d = $793;
              
              {ESLVal p = $792;
              
              {ESLVal r = $791;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
            }
          case "IntType": {ESLVal $790 = _v112.termRef(0);
              
              {ESLVal l = $790;
              
              return new ESLVal("Int");
            }
            }
          case "ListType": {ESLVal $789 = _v112.termRef(0);
              ESLVal $788 = _v112.termRef(1);
              
              {ESLVal l = $789;
              
              {ESLVal _v1060 = $788;
              
              return new ESLVal("[").add(ppType.apply(_v1060,env).add(new ESLVal("]")));
            }
            }
            }
          case "NullType": {ESLVal $787 = _v112.termRef(0);
              
              {ESLVal l = $787;
              
              return new ESLVal("Null");
            }
            }
          case "RecType": {ESLVal $786 = _v112.termRef(0);
              ESLVal $785 = _v112.termRef(1);
              ESLVal $784 = _v112.termRef(2);
              
              {ESLVal l = $786;
              
              {ESLVal n = $785;
              
              {ESLVal _v1059 = $784;
              
              return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v1059,env))));
            }
            }
            }
            }
          case "RecordType": {ESLVal $783 = _v112.termRef(0);
              ESLVal $782 = _v112.termRef(1);
              
              {ESLVal l = $783;
              
              {ESLVal fs = $782;
              
              return new ESLVal("{").add(ppDecs.apply(fs,env).add(new ESLVal("}")));
            }
            }
            }
          case "SetType": {ESLVal $781 = _v112.termRef(0);
              ESLVal $780 = _v112.termRef(1);
              
              {ESLVal l = $781;
              
              {ESLVal _v1058 = $780;
              
              return new ESLVal("Set{").add(ppType.apply(_v1058,env).add(new ESLVal("}")));
            }
            }
            }
          case "StrType": {ESLVal $779 = _v112.termRef(0);
              
              {ESLVal l = $779;
              
              return new ESLVal("Str");
            }
            }
          case "TableType": {ESLVal $778 = _v112.termRef(0);
              ESLVal $777 = _v112.termRef(1);
              ESLVal $776 = _v112.termRef(2);
              
              {ESLVal l = $778;
              
              {ESLVal k = $777;
              
              {ESLVal v = $776;
              
              return new ESLVal("Hash[").add(ppType.apply(k,env).add(new ESLVal(",").add(ppType.apply(v,env).add(new ESLVal("]")))));
            }
            }
            }
            }
          case "TermType": {ESLVal $775 = _v112.termRef(0);
              ESLVal $774 = _v112.termRef(1);
              ESLVal $773 = _v112.termRef(2);
              
              {ESLVal l = $775;
              
              {ESLVal n = $774;
              
              {ESLVal ts = $773;
              
              return n.add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
            }
          case "TypeFun": {ESLVal $772 = _v112.termRef(0);
              ESLVal $771 = _v112.termRef(1);
              ESLVal $770 = _v112.termRef(2);
              
              {ESLVal l = $772;
              
              {ESLVal ns = $771;
              
              {ESLVal _v1057 = $770;
              
              return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v1057,env))));
            }
            }
            }
            }
          case "UnfoldType": {ESLVal $769 = _v112.termRef(0);
              ESLVal $768 = _v112.termRef(1);
              
              {ESLVal l = $769;
              
              {ESLVal _v1056 = $768;
              
              return new ESLVal("unfold ").add(ppType.apply(_v1056,env));
            }
            }
            }
          case "UnionType": {ESLVal $767 = _v112.termRef(0);
              ESLVal $766 = _v112.termRef(1);
              
              {ESLVal l = $767;
              
              {ESLVal ts = $766;
              
              return new ESLVal("union ").add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
          case "VarType": {ESLVal $765 = _v112.termRef(0);
              ESLVal $764 = _v112.termRef(1);
              
              {ESLVal l = $765;
              
              {ESLVal n = $764;
              
              return n;
            }
            }
            }
          case "VoidType": {ESLVal $763 = _v112.termRef(0);
              
              {ESLVal l = $763;
              
              return new ESLVal("Void");
            }
            }
          case "UnionRef": {ESLVal $762 = _v112.termRef(0);
              ESLVal $761 = _v112.termRef(1);
              ESLVal $760 = _v112.termRef(2);
              
              {ESLVal l = $762;
              
              {ESLVal _v1055 = $761;
              
              {ESLVal n = $760;
              
              return ppType.apply(_v1055,env).add(new ESLVal(".").add(n));
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $759 = _v112.termRef(0);
              
              {ESLVal f = $759;
              
              return f.add(new ESLVal(""));
            }
            }
            default: {ESLVal x = _v112;
              
              return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
            }
          }
          }
    }
  });
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v111 = defs;
        
        if(_v111.isCons())
        {ESLVal $749 = _v111.head();
          ESLVal $750 = _v111.tail();
          
          switch($749.termName) {
          case "TypeBind": {ESLVal $758 = $749.termRef(0);
            ESLVal $757 = $749.termRef(1);
            ESLVal $756 = $749.termRef(2);
            ESLVal $755 = $749.termRef(3);
            
            {ESLVal l = $758;
            
            {ESLVal n = $757;
            
            {ESLVal t = $756;
            
            {ESLVal e = $755;
            
            {ESLVal ds = $750;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $754 = $749.termRef(0);
            ESLVal $753 = $749.termRef(1);
            ESLVal $752 = $749.termRef(2);
            ESLVal $751 = $749.termRef(3);
            
            {ESLVal l = $754;
            
            {ESLVal n = $753;
            
            {ESLVal t = $752;
            
            {ESLVal e = $751;
            
            {ESLVal ds = $750;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $749;
            
            {ESLVal ds = $750;
            
            return typeEnv.apply(ds);
          }
          }
        }
        }
      else if(_v111.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7732,7975)").add(ESLVal.list(_v111)));
      }
    }
  });
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v110 = defs;
        
        if(_v110.isCons())
        {ESLVal $732 = _v110.head();
          ESLVal $733 = _v110.tail();
          
          switch($732.termName) {
          case "TypeBind": {ESLVal $741 = $732.termRef(0);
            ESLVal $740 = $732.termRef(1);
            ESLVal $739 = $732.termRef(2);
            ESLVal $738 = $732.termRef(3);
            
            switch($739.termName) {
            case "RecType": {ESLVal $746 = $739.termRef(0);
              ESLVal $745 = $739.termRef(1);
              ESLVal $744 = $739.termRef(2);
              
              switch($744.termName) {
              case "UnionType": {ESLVal $748 = $744.termRef(0);
                ESLVal $747 = $744.termRef(1);
                
                {ESLVal l = $741;
                
                {ESLVal n = $740;
                
                {ESLVal ll = $746;
                
                {ESLVal m = $745;
                
                {ESLVal lll = $748;
                
                {ESLVal ts = $747;
                
                {ESLVal e = $738;
                
                {ESLVal ds = $733;
                
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
              default: {ESLVal l = $741;
                
                {ESLVal n = $740;
                
                {ESLVal t = $739;
                
                {ESLVal e = $738;
                
                {ESLVal ds = $733;
                
                return cnstrEnv.apply(ds,env);
              }
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $743 = $739.termRef(0);
              ESLVal $742 = $739.termRef(1);
              
              {ESLVal l = $741;
              
              {ESLVal n = $740;
              
              {ESLVal lll = $743;
              
              {ESLVal ts = $742;
              
              {ESLVal e = $738;
              
              {ESLVal ds = $733;
              
              return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $741;
              
              {ESLVal n = $740;
              
              {ESLVal t = $739;
              
              {ESLVal e = $738;
              
              {ESLVal ds = $733;
              
              return cnstrEnv.apply(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "DataBind": {ESLVal $737 = $732.termRef(0);
            ESLVal $736 = $732.termRef(1);
            ESLVal $735 = $732.termRef(2);
            ESLVal $734 = $732.termRef(3);
            
            {ESLVal l = $737;
            
            {ESLVal n = $736;
            
            {ESLVal t = $735;
            
            {ESLVal e = $734;
            
            {ESLVal ds = $733;
            
            return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $732;
            
            {ESLVal ds = $733;
            
            return cnstrEnv.apply(ds,env);
          }
          }
        }
        }
      else if(_v110.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(8107,8740)").add(ESLVal.list(_v110)));
      }
    }
  });
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal dataType = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v108 = t;
        
        switch(_v108.termName) {
        case "RecType": {ESLVal $728 = _v108.termRef(0);
          ESLVal $727 = _v108.termRef(1);
          ESLVal $726 = _v108.termRef(2);
          
          {ESLVal _v1052 = $728;
          
          {ESLVal n = $727;
          
          {ESLVal _v1053 = $726;
          
          return getConstructors.apply(_v1052,dataType,_v1053);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $725 = _v108.termRef(0);
          ESLVal $724 = _v108.termRef(1);
          ESLVal $723 = _v108.termRef(2);
          
          {ESLVal _v1050 = $725;
          
          {ESLVal ns = $724;
          
          {ESLVal _v1051 = $723;
          
          return getConstructors.apply(_v1050,dataType,_v1051);
        }
        }
        }
        }
      case "UnionType": {ESLVal $722 = _v108.termRef(0);
          ESLVal $721 = _v108.termRef(1);
          
          {ESLVal _v1047 = $722;
          
          {ESLVal ts = $721;
          
          return map.apply(new ESLVal(new Function(new ESLVal("fun265"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1048 = $args[0];
          {ESLVal _v109 = _v1048;
                
                switch(_v109.termName) {
                case "TermType": {ESLVal $731 = _v109.termRef(0);
                  ESLVal $730 = _v109.termRef(1);
                  ESLVal $729 = _v109.termRef(2);
                  
                  {ESLVal _v1049 = $731;
                  
                  {ESLVal n = $730;
                  
                  {ESLVal tts = $729;
                  
                  return new ESLVal("Map",n,dataType);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(9259,9325)").add(ESLVal.list(_v109)));
              }
              }
            }
          }),ts);
        }
        }
        }
        default: {ESLVal _v1054 = _v108;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType.apply(_v1054,ESLVal.list()))));
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
  {ESLVal _v107 = e;
        
        if(_v107.isCons())
        {ESLVal $717 = _v107.head();
          ESLVal $718 = _v107.tail();
          
          switch($717.termName) {
          case "Map": {ESLVal $720 = $717.termRef(0);
            ESLVal $719 = $717.termRef(1);
            
            {ESLVal n = $720;
            
            {ESLVal t = $719;
            
            {ESLVal _v1046 = $718;
            
            if(member.apply(n,typeEnvDom.apply(_v1046)).boolVal)
            return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Duplicate type name: ").add(n)));
            else
              return checkSingletonTypes.apply(_v1046);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10029,10250)").add(ESLVal.list(_v107)));
        }
        }
      else if(_v107.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10029,10250)").add(ESLVal.list(_v107)));
      }
    }
  });
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1038 = $args[0];
  {ESLVal _v105 = _v1038;
        
        if(_v105.isCons())
        {ESLVal $702 = _v105.head();
          ESLVal $703 = _v105.tail();
          
          switch($702.termName) {
          case "Map": {ESLVal $705 = $702.termRef(0);
            ESLVal $704 = $702.termRef(1);
            
            {ESLVal n = $705;
            
            {ESLVal t = $704;
            
            {ESLVal _v1039 = $703;
            
            if(member.apply(n,typeEnvDom.apply(_v1039)).boolVal)
            { LetRec letrec = new LetRec() {
              ESLVal throwError = new ESLVal(new Function(new ESLVal("throwError"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1040 = $args[0];
                {ESLVal _v106 = _v1040;
                      
                      switch(_v106.termName) {
                      case "UnionType": {ESLVal $716 = _v106.termRef(0);
                        ESLVal $715 = _v106.termRef(1);
                        
                        {ESLVal l = $716;
                        
                        {ESLVal ts = $715;
                        
                        return error(new ESLVal("TypeError",l,new ESLVal("Duplicate constructor name: ").add(n)));
                      }
                      }
                      }
                    case "ForallType": {ESLVal $714 = _v106.termRef(0);
                        ESLVal $713 = _v106.termRef(1);
                        ESLVal $712 = _v106.termRef(2);
                        
                        {ESLVal l = $714;
                        
                        {ESLVal ns = $713;
                        
                        {ESLVal _v1044 = $712;
                        
                        return throwError.apply(_v1044);
                      }
                      }
                      }
                      }
                    case "RecType": {ESLVal $711 = _v106.termRef(0);
                        ESLVal $710 = _v106.termRef(1);
                        ESLVal $709 = _v106.termRef(2);
                        
                        {ESLVal l = $711;
                        
                        {ESLVal _v1042 = $710;
                        
                        {ESLVal _v1043 = $709;
                        
                        return throwError.apply(_v1043);
                      }
                      }
                      }
                      }
                    case "TypeFun": {ESLVal $708 = _v106.termRef(0);
                        ESLVal $707 = _v106.termRef(1);
                        ESLVal $706 = _v106.termRef(2);
                        
                        {ESLVal l = $708;
                        
                        {ESLVal ns = $707;
                        
                        {ESLVal _v1041 = $706;
                        
                        return throwError.apply(_v1041);
                      }
                      }
                      }
                      }
                      default: {ESLVal _v1045 = _v106;
                        
                        return error(new ESLVal("Duplicate constructor name: ").add(n.add(new ESLVal(" ").add(_v1045))));
                      }
                    }
                    }
                  }
                });
              
              public ESLVal get(String name) {
                switch(name) {
                  case "throwError": return throwError;
                  
                  default: throw new Error("cannot find letrec binding");
                }
                }
              };
            ESLVal throwError = letrec.get("throwError");
            
              return throwError.apply(t);}
            
            else
              return checkSingletonConstructors.apply(_v1039);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10363,11018)").add(ESLVal.list(_v105)));
        }
        }
      else if(_v105.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10363,11018)").add(ESLVal.list(_v105)));
      }
    }
  });
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v104 = defs;
        
        if(_v104.isCons())
        {ESLVal $688 = _v104.head();
          ESLVal $689 = _v104.tail();
          
          switch($688.termName) {
          case "TypeBind": {ESLVal $701 = $688.termRef(0);
            ESLVal $700 = $688.termRef(1);
            ESLVal $699 = $688.termRef(2);
            ESLVal $698 = $688.termRef(3);
            
            {ESLVal l = $701;
            
            {ESLVal n = $700;
            
            {ESLVal t = $699;
            
            {ESLVal e = $698;
            
            {ESLVal ds = $689;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $697 = $688.termRef(0);
            ESLVal $696 = $688.termRef(1);
            ESLVal $695 = $688.termRef(2);
            ESLVal $694 = $688.termRef(3);
            
            {ESLVal l1 = $697;
            
            {ESLVal n = $696;
            
            {ESLVal t = $695;
            
            {ESLVal e = $694;
            
            {ESLVal ds = $689;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "CnstrBind": {ESLVal $693 = $688.termRef(0);
            ESLVal $692 = $688.termRef(1);
            ESLVal $691 = $688.termRef(2);
            ESLVal $690 = $688.termRef(3);
            
            {ESLVal l1 = $693;
            
            {ESLVal n = $692;
            
            {ESLVal t = $691;
            
            {ESLVal e = $690;
            
            {ESLVal ds = $689;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $688;
            
            {ESLVal ds = $689;
            
            return valueDefs.apply(ds).cons(b);
          }
          }
        }
        }
      else if(_v104.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11059,11369)").add(ESLVal.list(_v104)));
      }
    }
  });
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1037 = $args[0];
  ESLVal _v1036 = $args[1];
  ESLVal _v1035 = $args[2];
  ESLVal _v1034 = $args[3];
  ESLVal _v1033 = $args[4];
  {ESLVal _v103 = _v1037;
        
        if(_v103.isCons())
        {ESLVal $665 = _v103.head();
          ESLVal $666 = _v103.tail();
          
          switch($665.termName) {
          case "FunBinds": {ESLVal $680 = $665.termRef(0);
            ESLVal $679 = $665.termRef(1);
            
            if($679.isCons())
            {ESLVal $681 = $679.head();
              ESLVal $682 = $679.tail();
              
              switch($681.termName) {
              case "FunCase": {ESLVal $687 = $681.termRef(0);
                ESLVal $686 = $681.termRef(1);
                ESLVal $685 = $681.termRef(2);
                ESLVal $684 = $681.termRef(3);
                ESLVal $683 = $681.termRef(4);
                
                {ESLVal n = $680;
                
                {ESLVal l = $687;
                
                {ESLVal args = $686;
                
                {ESLVal t = $685;
                
                {ESLVal g = $684;
                
                {ESLVal e = $683;
                
                {ESLVal cases = $682;
                
                {ESLVal ds = $666;
                
                return valueDefsToTEnv.apply(ds,_v1036,_v1035,_v1034,_v1033).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1033,t)));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v103)));
            }
            }
          else if($679.isNil())
            return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v103)));
          else return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v103)));
          }
        case "FunBind": {ESLVal $678 = $665.termRef(0);
            ESLVal $677 = $665.termRef(1);
            ESLVal $676 = $665.termRef(2);
            ESLVal $675 = $665.termRef(3);
            ESLVal $674 = $665.termRef(4);
            ESLVal $673 = $665.termRef(5);
            ESLVal $672 = $665.termRef(6);
            
            {ESLVal l = $678;
            
            {ESLVal n = $677;
            
            {ESLVal ps = $676;
            
            {ESLVal t = $675;
            
            {ESLVal st = $674;
            
            {ESLVal b = $673;
            
            {ESLVal g = $672;
            
            {ESLVal ds = $666;
            
            return valueDefsToTEnv.apply(ds,_v1036,_v1035,_v1034,_v1033).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1033,t)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "Binding": {ESLVal $671 = $665.termRef(0);
            ESLVal $670 = $665.termRef(1);
            ESLVal $669 = $665.termRef(2);
            ESLVal $668 = $665.termRef(3);
            ESLVal $667 = $665.termRef(4);
            
            {ESLVal l = $671;
            
            {ESLVal n = $670;
            
            {ESLVal t = $669;
            
            {ESLVal st = $668;
            
            {ESLVal e = $667;
            
            {ESLVal ds = $666;
            
            return valueDefsToTEnv.apply(ds,_v1036,_v1035,_v1034,_v1033).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1033,t)));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v103)));
        }
        }
      else if(_v103.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v103)));
      }
    }
  });
  private static ESLVal getCache = new ESLVal(new Function(new ESLVal("getCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {ESLVal cache = edb.ref("getProperty").apply(new ESLVal("typeCheckCache"));
        
        if(cache.eql($null).boolVal)
        return emptyTable;
        else
          return cache;
      }
    }
  });
  private static ESLVal setCache = new ESLVal(new Function(new ESLVal("setCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cache = $args[0];
  return edb.ref("setProperty").apply(new ESLVal("typeCheckCache"),cache);
    }
  });
  private static ESLVal updateCache = new ESLVal(new Function(new ESLVal("updateCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  ESLVal record = $args[1];
  ESLVal cache = $args[2];
  {ESLVal _v1032 = addEntry.apply(path,record,cache);
        
        {setCache.apply(_v1032);
      return _v1032;}
      }
    }
  });
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  {print.apply(new ESLVal("[ type check ").add(path.add(new ESLVal("]"))));
      return typeCheckModuleInternal.apply(path,getCache.apply(),new ESLVal(new Function(new ESLVal("fun266"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1031 = $args[0];
        ESLVal _v1030 = $args[1];
        ESLVal _v1029 = $args[2];
        ESLVal _v1028 = $args[3];
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
        {ESLVal _v102 = lookup.apply(path,cache);
          
          switch(_v102.termName) {
          case "Typed": {ESLVal $664 = _v102.termRef(0);
            ESLVal $663 = _v102.termRef(1);
            ESLVal $662 = _v102.termRef(2);
            ESLVal $661 = _v102.termRef(3);
            
            {ESLVal m = $664;
            
            {ESLVal vEnv = $663;
            
            {ESLVal cEnv = $662;
            
            {ESLVal tEnv = $661;
            
            return handler.apply(cache,vEnv,cEnv,tEnv);
          }
          }
          }
          }
          }
        case "Undefined": {
            return error(new ESLVal("recursive reference to ").add(path));
          }
          default: return error(new ESLVal("case error at Pos(13000,13234)").add(ESLVal.list(_v102)));
        }
        }
        else
          {ESLVal m = parse.apply(path);
            
            return typeCheckModuleCache.apply(m,updateCache.apply(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun267"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1027 = $args[0];
            ESLVal _v1026 = $args[1];
            ESLVal _v1025 = $args[2];
            ESLVal _v1024 = $args[3];
            return handler.apply(updateCache.apply(path,new ESLVal("Typed",m,_v1026,_v1025,_v1024),_v1027),_v1026,_v1025,_v1024);
              }
            }));
          }
    }
  });
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  return typeCheckModuleCache.apply(module,getCache.apply(),new ESLVal(new Function(new ESLVal("fun268"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1023 = $args[0];
        ESLVal _v1022 = $args[1];
        ESLVal _v1021 = $args[2];
        ESLVal _v1020 = $args[3];
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
  return typeCheckModule0.apply(module,cache,new ESLVal(new Function(new ESLVal("fun269"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1019 = $args[0];
        ESLVal _v1018 = $args[1];
        ESLVal _v1017 = $args[2];
        ESLVal _v1016 = $args[3];
        {ESLVal _v101 = module;
              
              switch(_v101.termName) {
              case "Module": {ESLVal $660 = _v101.termRef(0);
                ESLVal $659 = _v101.termRef(1);
                ESLVal $658 = _v101.termRef(2);
                ESLVal $657 = _v101.termRef(3);
                ESLVal $656 = _v101.termRef(4);
                ESLVal $655 = _v101.termRef(5);
                ESLVal $654 = _v101.termRef(6);
                
                {ESLVal path = $660;
                
                {ESLVal name = $659;
                
                {ESLVal exports = $658;
                
                {ESLVal imports = $657;
                
                {ESLVal x = $656;
                
                {ESLVal y = $655;
                
                {ESLVal defs = $654;
                
                return handler.apply(_v1019,restrictTypeEnv.apply(_v1018,exports),restrictTypeEnv.apply(_v1017,exports),restrictTypeEnv.apply(_v1016,exports));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(13946,14204)").add(ESLVal.list(_v101)));
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
  { LetRec letrec = new LetRec() {
        ESLVal _v994 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1005 = $args[0];
          ESLVal _v1004 = $args[1];
          ESLVal _v1003 = $args[2];
          {ESLVal _v100 = _v1005;
                
                if(_v100.isCons())
                {ESLVal $652 = _v100.head();
                  ESLVal $653 = _v100.tail();
                  
                  {ESLVal path = $652;
                  
                  {ESLVal _v1006 = $653;
                  
                  {ESLVal _v1007 = _v1006;
                  
                  return typeCheckModuleInternal.apply(path,_v1004,new ESLVal(new Function(new ESLVal("fun270"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1011 = $args[0];
                  ESLVal _v1010 = $args[1];
                  ESLVal _v1009 = $args[2];
                  ESLVal _v1008 = $args[3];
                  return _v994.apply(_v1007,_v1011,new ESLVal(new Function(new ESLVal("fun271"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v1015 = $args[0];
                        ESLVal _v1014 = $args[1];
                        ESLVal _v1013 = $args[2];
                        ESLVal _v1012 = $args[3];
                        return _v1003.apply(_v1015,_v1014.add(_v1010),_v1013.add(_v1009),_v1012.add(_v1008));
                          }
                        }));
                    }
                  }));
                }
                }
                }
                }
              else if(_v100.isNil())
                return _v1003.apply(_v1004,$nil,$nil,$nil);
              else return error(new ESLVal("case error at Pos(14584,15141)").add(ESLVal.list(_v100)));
              }
            }
          });
        ESLVal _v993 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              {ESLVal _v99 = module;
                
                switch(_v99.termName) {
                case "Module": {ESLVal $651 = _v99.termRef(0);
                  ESLVal $650 = _v99.termRef(1);
                  ESLVal $649 = _v99.termRef(2);
                  ESLVal $648 = _v99.termRef(3);
                  ESLVal $647 = _v99.termRef(4);
                  ESLVal $646 = _v99.termRef(5);
                  ESLVal $645 = _v99.termRef(6);
                  
                  {ESLVal path = $651;
                  
                  {ESLVal name = $650;
                  
                  {ESLVal exports = $649;
                  
                  {ESLVal imports = $648;
                  
                  {ESLVal x = $647;
                  
                  {ESLVal y = $646;
                  
                  {ESLVal defs = $645;
                  
                  return _v994.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun272"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v998 = $args[0];
                  ESLVal _v997 = $args[1];
                  ESLVal _v996 = $args[2];
                  ESLVal _v995 = $args[3];
                  {ESLVal _v1000 = typeEnv.apply(defs);
                        ESLVal _v999 = mergeFunDefs.apply(defs);
                        
                        {checkDupBindings.apply(_v999);
                      checkFreeTypes.apply(_v1000.add(_v995.add(tenv0)));
                      checkSingletonTypes.apply(_v1000);
                      {ESLVal _v1001 = recTypes.apply(_v1000.add(_v995.add(tenv0)));
                        
                        {ESLVal _v1002 = cnstrEnv.apply(_v999,_v1001).add(_v996.add(cnstrEnv0));
                        
                        {checkSingletonConstructors.apply(_v1002);
                      {ESLVal valueEnv = typeCheckValues.apply(valueDefs.apply(_v999),new ESLVal("NullType",p0),_v997,_v1001,_v1002);
                        
                        return handler.apply(_v998,valueEnv,_v1002,_v1001);
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
                default: return error(new ESLVal("case error at Pos(15170,16712)").add(ESLVal.list(_v99)));
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "_v994": return _v994;
            
            case "_v993": return _v993;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal _v994 = letrec.get("_v994");
      
      ESLVal _v993 = letrec.get("_v993");
      
        return _v993.apply();}
      
    }
  });
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v992 = $args[0];
  ESLVal _v991 = $args[1];
  ESLVal _v990 = $args[2];
  ESLVal _v989 = $args[3];
  ESLVal _v988 = $args[4];
  {ESLVal valueEnv = valueDefsToTEnv.apply(_v992,_v991,$nil,_v988,_v989).add(_v990.add(env0));
        
        {{
        ESLVal _v98 = _v992;
        while(_v98.isCons()) {
          ESLVal def = _v98.headVal;
          typeCheckDef.apply(def,_v991,valueEnv,valueEnv,_v988,_v989);
          _v98 = _v98.tailVal;}
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
  {ESLVal names = new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal p = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = patternNames.apply(p);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ps);
        
        if(removeDups.apply(names).neql(names).boolVal)
        return error(new ESLVal("TypeError",l,new ESLVal("duplicate pattern variables")));
        else
          return $null;
      }
    }
  });
  private static ESLVal typeCheckDef = new ESLVal(new Function(new ESLVal("typeCheckDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v969 = $args[0];
  ESLVal _v968 = $args[1];
  ESLVal _v967 = $args[2];
  ESLVal _v966 = $args[3];
  ESLVal _v965 = $args[4];
  ESLVal _v964 = $args[5];
  {ESLVal _v90 = _v969;
        
        switch(_v90.termName) {
        case "FunBinds": {ESLVal $617 = _v90.termRef(0);
          ESLVal $616 = _v90.termRef(1);
          
          {ESLVal n = $617;
          
          {ESLVal cases = $616;
          
          { LetRec letrec = new LetRec() {
          ESLVal checkArities = new ESLVal(new Function(new ESLVal("checkArities"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v986 = $args[0];
            ESLVal _v985 = $args[1];
            {ESLVal _v97 = _v986;
                  
                  if(_v97.isCons())
                  {ESLVal $638 = _v97.head();
                    ESLVal $639 = _v97.tail();
                    
                    switch($638.termName) {
                    case "FunCase": {ESLVal $644 = $638.termRef(0);
                      ESLVal $643 = $638.termRef(1);
                      ESLVal $642 = $638.termRef(2);
                      ESLVal $641 = $638.termRef(3);
                      ESLVal $640 = $638.termRef(4);
                      
                      {ESLVal l = $644;
                      
                      {ESLVal args = $643;
                      
                      {ESLVal t = $642;
                      
                      {ESLVal g = $641;
                      
                      {ESLVal e = $640;
                      
                      {ESLVal _v987 = $639;
                      
                      if(_v985.eql(new ESLVal(-1)).or(length.apply(args).eql(_v985)).boolVal)
                      return checkArities.apply(_v987,length.apply(args));
                      else
                        return error(new ESLVal("TypeError",l,new ESLVal("inconsistent overloaded arity")));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(17919,18208)").add(ESLVal.list(_v97)));
                  }
                  }
                else if(_v97.isNil())
                  return $null;
                else return error(new ESLVal("case error at Pos(17919,18208)").add(ESLVal.list(_v97)));
                }
              }
            });
          ESLVal checkLoneVars = new ESLVal(new Function(new ESLVal("checkLoneVars"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v983 = $args[0];
            {ESLVal _v95 = _v983;
                  
                  if(_v95.isCons())
                  {ESLVal $631 = _v95.head();
                    ESLVal $632 = _v95.tail();
                    
                    switch($631.termName) {
                    case "FunCase": {ESLVal $637 = $631.termRef(0);
                      ESLVal $636 = $631.termRef(1);
                      ESLVal $635 = $631.termRef(2);
                      ESLVal $634 = $631.termRef(3);
                      ESLVal $633 = $631.termRef(4);
                      
                      {ESLVal l = $637;
                      
                      {ESLVal args = $636;
                      
                      {ESLVal t = $635;
                      
                      {ESLVal g = $634;
                      
                      {ESLVal e = $633;
                      
                      {ESLVal _v984 = $632;
                      
                      {{
                      ESLVal _v96 = args;
                      while(_v96.isCons()) {
                        ESLVal arg = _v96.headVal;
                        checkLoneVar.apply(arg);
                        _v96 = _v96.tailVal;}
                    }
                    return checkLoneVars.apply(_v984);}
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(18267,18502)").add(ESLVal.list(_v95)));
                  }
                  }
                else if(_v95.isNil())
                  return $null;
                else return error(new ESLVal("case error at Pos(18267,18502)").add(ESLVal.list(_v95)));
                }
              }
            });
          ESLVal checkLoneVar = new ESLVal(new Function(new ESLVal("checkLoneVar"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v94 = p;
                  
                  switch(_v94.termName) {
                  case "PVar": {ESLVal $629 = _v94.termRef(0);
                    ESLVal $628 = _v94.termRef(1);
                    ESLVal $627 = _v94.termRef(2);
                    
                    switch($627.termName) {
                    case "VoidType": {ESLVal $630 = $627.termRef(0);
                      
                      {ESLVal l = $629;
                      
                      {ESLVal _v980 = $628;
                      
                      {ESLVal tl = $630;
                      
                      return error(new ESLVal("TypeError",l,new ESLVal("top level variables should be typed.")));
                    }
                    }
                    }
                    }
                    default: {ESLVal _v981 = _v94;
                      
                      return $null;
                    }
                  }
                  }
                  default: {ESLVal _v982 = _v94;
                    
                    return $null;
                  }
                }
                }
              }
            });
          
          public ESLVal get(String name) {
            switch(name) {
              case "checkArities": return checkArities;
              
              case "checkLoneVars": return checkLoneVars;
              
              case "checkLoneVar": return checkLoneVar;
              
              default: throw new Error("cannot find letrec binding");
            }
            }
          };
        ESLVal checkArities = letrec.get("checkArities");
        
        ESLVal checkLoneVars = letrec.get("checkLoneVars");
        
        ESLVal checkLoneVar = letrec.get("checkLoneVar");
        
          {checkArities.apply(cases,new ESLVal(-1));
        return checkLoneVars.apply(cases);}}
        
        }
        }
        }
      case "FunBind": {ESLVal $615 = _v90.termRef(0);
          ESLVal $614 = _v90.termRef(1);
          ESLVal $613 = _v90.termRef(2);
          ESLVal $612 = _v90.termRef(3);
          ESLVal $611 = _v90.termRef(4);
          ESLVal $610 = _v90.termRef(5);
          ESLVal $609 = _v90.termRef(6);
          
          {ESLVal l = $615;
          
          {ESLVal n = $614;
          
          {ESLVal ps = $613;
          
          {ESLVal t = $612;
          
          {ESLVal st = $611;
          
          {ESLVal b = $610;
          
          {ESLVal g = $609;
          
          {checkPatterns.apply(l,ps);
        {ESLVal argTypes = map.apply(new ESLVal(new Function(new ESLVal("fun273"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v92 = p;
                  
                  switch(_v92.termName) {
                  case "PVar": {ESLVal $623 = _v92.termRef(0);
                    ESLVal $622 = _v92.termRef(1);
                    ESLVal $621 = _v92.termRef(2);
                    
                    {ESLVal _v974 = $623;
                    
                    {ESLVal _v975 = $622;
                    
                    {ESLVal _v976 = $621;
                    
                    return substTypeEnv.apply(_v964,_v976);
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(19134,19200)").add(ESLVal.list(_v92)));
                }
                }
              }
            }),ps);
          ESLVal argNames = map.apply(new ESLVal(new Function(new ESLVal("fun274"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v91 = p;
                  
                  switch(_v91.termName) {
                  case "PVar": {ESLVal $620 = _v91.termRef(0);
                    ESLVal $619 = _v91.termRef(1);
                    ESLVal $618 = _v91.termRef(2);
                    
                    {ESLVal _v971 = $620;
                    
                    {ESLVal _v972 = $619;
                    
                    {ESLVal _v973 = $618;
                    
                    return _v972;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(19272,19316)").add(ESLVal.list(_v91)));
                }
                }
              }
            }),ps);
          
          {ESLVal bodyType = guardedExpType.apply(l,g,b,_v968,zipTypeEnv.apply(argNames,argTypes).add(_v967),_v965,_v964);
          
          {ESLVal fType = ((Supplier<ESLVal>)() -> { 
              {ESLVal _v93 = t;
                
                switch(_v93.termName) {
                case "ForallType": {ESLVal $626 = _v93.termRef(0);
                  ESLVal $625 = _v93.termRef(1);
                  ESLVal $624 = _v93.termRef(2);
                  
                  {ESLVal _v977 = $626;
                  
                  {ESLVal ns = $625;
                  
                  {ESLVal _v978 = $624;
                  
                  return genericize.apply(_v977,new ESLVal("FunType",_v977,argTypes,bodyType));
                }
                }
                }
                }
                default: {ESLVal _v979 = _v93;
                  
                  return new ESLVal("FunType",l,argTypes,bodyType);
                }
              }
              }
            }).get();
          ESLVal dType = substTypeEnv.apply(_v964,t);
          
          if(subType.apply(fType,dType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType.apply(fType,_v964).add(new ESLVal(" does not match declaration ").add(ppType.apply(dType,_v964))))))));
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
      case "Binding": {ESLVal $608 = _v90.termRef(0);
          ESLVal $607 = _v90.termRef(1);
          ESLVal $606 = _v90.termRef(2);
          ESLVal $605 = _v90.termRef(3);
          ESLVal $604 = _v90.termRef(4);
          
          {ESLVal l = $608;
          
          {ESLVal n = $607;
          
          {ESLVal dt = $606;
          
          {ESLVal st = $605;
          
          {ESLVal e = $604;
          
          {ESLVal valueType = expType.apply(e,_v968,_v967,_v965,_v964);
          
          {ESLVal valueFV = typeFV.apply(valueType);
          ESLVal declaredType = lookupType.apply(n,_v966);
          
          {ESLVal _v970 = ((Supplier<ESLVal>)() -> { 
              if(valueFV.eql($nil).boolVal)
                return valueType;
                else
                  return new ESLVal("ForallType",l,valueFV,valueType);
            }).get();
          
          if(subType.apply(_v970,declaredType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType.apply(_v970,_v964).add(new ESLVal(" does not match declared type = ").add(ppType.apply(declaredType,_v964))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17800,20723)").add(ESLVal.list(_v90)));
      }
      }
    }
  });
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v963 = $args[0];
  ESLVal _v962 = $args[1];
  ESLVal _v961 = $args[2];
  ESLVal _v960 = $args[3];
  ESLVal _v959 = $args[4];
  ESLVal _v958 = $args[5];
  ESLVal _v957 = $args[6];
  {ESLVal bt = expType.apply(_v962,_v960,_v959,_v958,_v957);
        
        if(isBoolType.apply(bt).boolVal)
        return expType.apply(_v961,_v960,_v959,_v958,_v957);
        else
          return error(new ESLVal("TypeError",_v963,new ESLVal("guarded expression requires a boolean value: ").add(ppType.apply(bt,_v957))));
      }
    }
  });
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v939 = $args[0];
  ESLVal _v938 = $args[1];
  ESLVal _v937 = $args[2];
  ESLVal _v936 = $args[3];
  ESLVal _v935 = $args[4];
  {ESLVal _v88 = _v939;
        
        switch(_v88.termName) {
        case "ActExp": {ESLVal $603 = _v88.termRef(0);
          ESLVal $602 = _v88.termRef(1);
          ESLVal $601 = _v88.termRef(2);
          ESLVal $600 = _v88.termRef(3);
          ESLVal $599 = _v88.termRef(4);
          ESLVal $598 = _v88.termRef(5);
          ESLVal $597 = _v88.termRef(6);
          ESLVal $596 = _v88.termRef(7);
          
          {ESLVal l = $603;
          
          {ESLVal n = $602;
          
          {ESLVal args = $601;
          
          {ESLVal exports = $600;
          
          {ESLVal parent = $599;
          
          {ESLVal bindings = $598;
          
          {ESLVal init = $597;
          
          {ESLVal arms = $596;
          
          return actType.apply(l,n,args,parent,exports,bindings,init,arms,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Apply": {ESLVal $595 = _v88.termRef(0);
          ESLVal $594 = _v88.termRef(1);
          ESLVal $593 = _v88.termRef(2);
          
          {ESLVal l = $595;
          
          {ESLVal op = $594;
          
          {ESLVal args = $593;
          
          return applyType.apply(l,op,args,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $592 = _v88.termRef(0);
          ESLVal $591 = _v88.termRef(1);
          ESLVal $590 = _v88.termRef(2);
          
          {ESLVal l = $592;
          
          {ESLVal _v956 = $591;
          
          {ESLVal ts = $590;
          
          return applyTypeExp.apply(l,_v956,ts,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $589 = _v88.termRef(0);
          ESLVal $588 = _v88.termRef(1);
          ESLVal $587 = _v88.termRef(2);
          ESLVal $586 = _v88.termRef(3);
          
          {ESLVal l = $589;
          
          {ESLVal a = $588;
          
          {ESLVal i = $587;
          
          {ESLVal v = $586;
          
          return arrayUpdateType.apply(l,a,i,v,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $585 = _v88.termRef(0);
          ESLVal $584 = _v88.termRef(1);
          ESLVal $583 = _v88.termRef(2);
          
          {ESLVal l = $585;
          
          {ESLVal a = $584;
          
          {ESLVal i = $583;
          
          return arrayRefType.apply(l,a,i,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "BagExp": {ESLVal $582 = _v88.termRef(0);
          ESLVal $581 = _v88.termRef(1);
          
          {ESLVal l = $582;
          
          {ESLVal es = $581;
          
          return bagType.apply(l,es,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "Become": {ESLVal $580 = _v88.termRef(0);
          ESLVal $579 = _v88.termRef(1);
          
          {ESLVal l = $580;
          
          {ESLVal _v955 = $579;
          
          return becomeType.apply(l,_v955,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "BinExp": {ESLVal $578 = _v88.termRef(0);
          ESLVal $577 = _v88.termRef(1);
          ESLVal $576 = _v88.termRef(2);
          ESLVal $575 = _v88.termRef(3);
          
          {ESLVal l = $578;
          
          {ESLVal e1 = $577;
          
          {ESLVal op = $576;
          
          {ESLVal e2 = $575;
          
          return binExpType.apply(l,e1,op,e2,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "Block": {ESLVal $574 = _v88.termRef(0);
          ESLVal $573 = _v88.termRef(1);
          
          {ESLVal l = $574;
          
          {ESLVal es = $573;
          
          return blockType.apply(l,es,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "BoolExp": {ESLVal $572 = _v88.termRef(0);
          ESLVal $571 = _v88.termRef(1);
          
          {ESLVal l = $572;
          
          {ESLVal b = $571;
          
          return new ESLVal("BoolType",l);
        }
        }
        }
      case "Case": {ESLVal $570 = _v88.termRef(0);
          ESLVal $569 = _v88.termRef(1);
          ESLVal $568 = _v88.termRef(2);
          ESLVal $567 = _v88.termRef(3);
          
          {ESLVal l = $570;
          
          {ESLVal decs = $569;
          
          {ESLVal es = $568;
          
          {ESLVal arms = $567;
          
          return caseType.apply(l,es,arms,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "Cmp": {ESLVal $566 = _v88.termRef(0);
          ESLVal $565 = _v88.termRef(1);
          ESLVal $564 = _v88.termRef(2);
          
          {ESLVal l = $566;
          
          {ESLVal _v954 = $565;
          
          {ESLVal qs = $564;
          
          return cmpType.apply(l,_v954,qs,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Grab": {ESLVal $563 = _v88.termRef(0);
          ESLVal $562 = _v88.termRef(1);
          ESLVal $561 = _v88.termRef(2);
          
          {ESLVal l = $563;
          
          {ESLVal refs = $562;
          
          {ESLVal _v953 = $561;
          
          return expType.apply(_v953,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "FloatExp": {ESLVal $560 = _v88.termRef(0);
          ESLVal $559 = _v88.termRef(1);
          
          {ESLVal l = $560;
          
          {ESLVal f = $559;
          
          return new ESLVal("FloatType",l);
        }
        }
        }
      case "Fold": {ESLVal $558 = _v88.termRef(0);
          ESLVal $557 = _v88.termRef(1);
          ESLVal $556 = _v88.termRef(2);
          
          {ESLVal l = $558;
          
          {ESLVal t = $557;
          
          {ESLVal _v952 = $556;
          
          return foldType.apply(l,t,_v952,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "For": {ESLVal $555 = _v88.termRef(0);
          ESLVal $554 = _v88.termRef(1);
          ESLVal $553 = _v88.termRef(2);
          ESLVal $552 = _v88.termRef(3);
          
          {ESLVal l = $555;
          
          {ESLVal p = $554;
          
          {ESLVal list = $553;
          
          {ESLVal _v951 = $552;
          
          return forType.apply(l,p,list,_v951,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $551 = _v88.termRef(0);
          ESLVal $550 = _v88.termRef(1);
          ESLVal $549 = _v88.termRef(2);
          ESLVal $548 = _v88.termRef(3);
          ESLVal $547 = _v88.termRef(4);
          
          {ESLVal l = $551;
          
          {ESLVal n = $550;
          
          {ESLVal args = $549;
          
          {ESLVal t = $548;
          
          {ESLVal _v950 = $547;
          
          return funType.apply(l,n,args,t,_v950,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $546 = _v88.termRef(0);
          ESLVal $545 = _v88.termRef(1);
          ESLVal $544 = _v88.termRef(2);
          ESLVal $543 = _v88.termRef(3);
          
          {ESLVal l = $546;
          
          {ESLVal e1 = $545;
          
          {ESLVal e2 = $544;
          
          {ESLVal e3 = $543;
          
          return ifType.apply(l,e1,e2,e3,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "IntExp": {ESLVal $542 = _v88.termRef(0);
          ESLVal $541 = _v88.termRef(1);
          
          {ESLVal l = $542;
          
          {ESLVal n = $541;
          
          return new ESLVal("IntType",l);
        }
        }
        }
      case "Let": {ESLVal $540 = _v88.termRef(0);
          ESLVal $539 = _v88.termRef(1);
          ESLVal $538 = _v88.termRef(2);
          
          {ESLVal l = $540;
          
          {ESLVal bs = $539;
          
          {ESLVal _v949 = $538;
          
          return letType.apply(l,bs,_v949,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Letrec": {ESLVal $537 = _v88.termRef(0);
          ESLVal $536 = _v88.termRef(1);
          ESLVal $535 = _v88.termRef(2);
          
          {ESLVal l = $537;
          
          {ESLVal bs = $536;
          
          {ESLVal _v948 = $535;
          
          return letrecType.apply(l,bs,_v948,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "List": {ESLVal $534 = _v88.termRef(0);
          ESLVal $533 = _v88.termRef(1);
          
          {ESLVal l = $534;
          
          {ESLVal es = $533;
          
          return listType.apply(l,es,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "Now": {ESLVal $532 = _v88.termRef(0);
          
          {ESLVal l = $532;
          
          return new ESLVal("IntType",l);
        }
        }
      case "Probably": {ESLVal $531 = _v88.termRef(0);
          ESLVal $530 = _v88.termRef(1);
          ESLVal $529 = _v88.termRef(2);
          ESLVal $528 = _v88.termRef(3);
          ESLVal $527 = _v88.termRef(4);
          
          {ESLVal l = $531;
          
          {ESLVal p = $530;
          
          {ESLVal t = $529;
          
          {ESLVal e1 = $528;
          
          {ESLVal e2 = $527;
          
          return probablyType.apply(l,p,t,e1,e2,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
        }
      case "PLet": {ESLVal $526 = _v88.termRef(0);
          ESLVal $525 = _v88.termRef(1);
          ESLVal $524 = _v88.termRef(2);
          
          {ESLVal l = $526;
          
          {ESLVal bs = $525;
          
          {ESLVal _v947 = $524;
          
          return letType.apply(l,bs,_v947,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Record": {ESLVal $523 = _v88.termRef(0);
          ESLVal $522 = _v88.termRef(1);
          
          {ESLVal l = $523;
          
          {ESLVal fields = $522;
          
          return recordType.apply(l,fields,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "Ref": {ESLVal $521 = _v88.termRef(0);
          ESLVal $520 = _v88.termRef(1);
          ESLVal $519 = _v88.termRef(2);
          
          {ESLVal l = $521;
          
          {ESLVal _v946 = $520;
          
          {ESLVal n = $519;
          
          return refType.apply(l,_v946,n,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $518 = _v88.termRef(0);
          ESLVal $517 = _v88.termRef(1);
          
          {ESLVal l = $518;
          
          {ESLVal n = $517;
          
          return refType.apply(l,new ESLVal("Var",l,new ESLVal("$super")),n,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "Self": {ESLVal $516 = _v88.termRef(0);
          
          {ESLVal l = $516;
          
          return _v938;
        }
        }
      case "Send": {ESLVal $511 = _v88.termRef(0);
          ESLVal $510 = _v88.termRef(1);
          ESLVal $509 = _v88.termRef(2);
          
          switch($509.termName) {
          case "Term": {ESLVal $515 = $509.termRef(0);
            ESLVal $514 = $509.termRef(1);
            ESLVal $513 = $509.termRef(2);
            ESLVal $512 = $509.termRef(3);
            
            {ESLVal l = $511;
            
            {ESLVal target = $510;
            
            {ESLVal tl = $515;
            
            {ESLVal n = $514;
            
            {ESLVal ts = $513;
            
            {ESLVal args = $512;
            
            return sendType.apply(l,target,n,args,_v938,_v937,_v936,_v935);
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(21201,25254)").add(ESLVal.list(_v88)));
        }
        }
      case "SendTimeSuper": {ESLVal $508 = _v88.termRef(0);
          
          {ESLVal l = $508;
          
          return new ESLVal("VoidType",l);
        }
        }
      case "SendSuper": {ESLVal $507 = _v88.termRef(0);
          ESLVal $506 = _v88.termRef(1);
          
          {ESLVal l = $507;
          
          {ESLVal _v945 = $506;
          
          return new ESLVal("VoidType",l);
        }
        }
        }
      case "SetExp": {ESLVal $505 = _v88.termRef(0);
          ESLVal $504 = _v88.termRef(1);
          
          {ESLVal l = $505;
          
          {ESLVal es = $504;
          
          return setType.apply(l,es,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "StrExp": {ESLVal $503 = _v88.termRef(0);
          ESLVal $502 = _v88.termRef(1);
          
          {ESLVal l = $503;
          
          {ESLVal s = $502;
          
          return new ESLVal("StrType",l);
        }
        }
        }
      case "Term": {ESLVal $501 = _v88.termRef(0);
          ESLVal $500 = _v88.termRef(1);
          ESLVal $499 = _v88.termRef(2);
          ESLVal $498 = _v88.termRef(3);
          
          {ESLVal l = $501;
          
          {ESLVal n = $500;
          
          {ESLVal ts = $499;
          
          {ESLVal es = $498;
          
          return termType.apply(l,n,ts,es,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $497 = _v88.termRef(0);
          ESLVal $496 = _v88.termRef(1);
          ESLVal $495 = _v88.termRef(2);
          
          {ESLVal l = $497;
          
          {ESLVal t = $496;
          
          {ESLVal _v944 = $495;
          
          return throwType.apply(l,t,_v944,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Try": {ESLVal $494 = _v88.termRef(0);
          ESLVal $493 = _v88.termRef(1);
          ESLVal $492 = _v88.termRef(2);
          
          {ESLVal l = $494;
          
          {ESLVal _v943 = $493;
          
          {ESLVal arms = $492;
          
          return tryType.apply(l,_v943,arms,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "New": {ESLVal $491 = _v88.termRef(0);
          ESLVal $490 = _v88.termRef(1);
          ESLVal $489 = _v88.termRef(2);
          
          {ESLVal l = $491;
          
          {ESLVal b = $490;
          
          {ESLVal args = $489;
          
          return newType.apply(l,b,args,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "NewArray": {ESLVal $488 = _v88.termRef(0);
          ESLVal $487 = _v88.termRef(1);
          ESLVal $486 = _v88.termRef(2);
          
          {ESLVal l = $488;
          
          {ESLVal t = $487;
          
          {ESLVal i = $486;
          
          return newArrayType.apply(l,t,i,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "NewTable": {ESLVal $485 = _v88.termRef(0);
          ESLVal $484 = _v88.termRef(1);
          ESLVal $483 = _v88.termRef(2);
          
          {ESLVal l = $485;
          
          {ESLVal key = $484;
          
          {ESLVal value = $483;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(_v935,key),substTypeEnv.apply(_v935,value));
        }
        }
        }
        }
      case "NewJava": {ESLVal $482 = _v88.termRef(0);
          ESLVal $481 = _v88.termRef(1);
          ESLVal $480 = _v88.termRef(2);
          ESLVal $479 = _v88.termRef(3);
          
          {ESLVal l = $482;
          
          {ESLVal path = $481;
          
          {ESLVal t = $480;
          
          {ESLVal args = $479;
          
          {{
          ESLVal _v89 = args;
          while(_v89.isCons()) {
            ESLVal a = _v89.headVal;
            expType.apply(a,_v938,_v937,_v936,_v935);
            _v89 = _v89.tailVal;}
        }
        return substTypeEnv.apply(_v935,t);}
        }
        }
        }
        }
        }
      case "Not": {ESLVal $478 = _v88.termRef(0);
          ESLVal $477 = _v88.termRef(1);
          
          {ESLVal l = $478;
          
          {ESLVal _v942 = $477;
          
          return notType.apply(l,_v942,_v938,_v937,_v936,_v935);
        }
        }
        }
      case "NullExp": {ESLVal $476 = _v88.termRef(0);
          
          {ESLVal l = $476;
          
          return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
        }
        }
      case "Unfold": {ESLVal $475 = _v88.termRef(0);
          ESLVal $474 = _v88.termRef(1);
          ESLVal $473 = _v88.termRef(2);
          
          {ESLVal l = $475;
          
          {ESLVal t = $474;
          
          {ESLVal _v941 = $473;
          
          return unfoldTypeExp.apply(l,t,_v941,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Update": {ESLVal $472 = _v88.termRef(0);
          ESLVal $471 = _v88.termRef(1);
          ESLVal $470 = _v88.termRef(2);
          
          {ESLVal l = $472;
          
          {ESLVal n = $471;
          
          {ESLVal _v940 = $470;
          
          return updateType.apply(l,n,_v940,_v938,_v937,_v936,_v935);
        }
        }
        }
        }
      case "Var": {ESLVal $469 = _v88.termRef(0);
          ESLVal $468 = _v88.termRef(1);
          
          {ESLVal l = $469;
          
          {ESLVal n = $468;
          
          return varType.apply(l,n,_v937);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(21201,25254)").add(ESLVal.list(_v88)));
      }
      }
    }
  });
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v934 = $args[0];
  ESLVal _v933 = $args[1];
  ESLVal _v932 = $args[2];
  ESLVal _v931 = $args[3];
  ESLVal _v930 = $args[4];
  ESLVal _v929 = $args[5];
  ESLVal _v928 = $args[6];
  {ESLVal valType = expType.apply(_v932,_v931,_v930,_v929,_v928);
        
        return substTypeEnv.apply(_v928,_v933);
      }
    }
  });
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v927 = $args[0];
  ESLVal _v926 = $args[1];
  ESLVal _v925 = $args[2];
  ESLVal _v924 = $args[3];
  ESLVal _v923 = $args[4];
  ESLVal _v922 = $args[5];
  ESLVal _v921 = $args[6];
  {ESLVal eType = expType.apply(_v925,_v924,_v923,_v922,_v921);
        
        if(typeEqual.apply(substTypeEnv.apply(_v921,_v926),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",_v927,new ESLVal("fold type ").add(ppType.apply(_v926,_v921).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v921))))));
      }
    }
  });
  private static ESLVal unfoldTypeExp = new ESLVal(new Function(new ESLVal("unfoldTypeExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v918 = $args[0];
  ESLVal _v917 = $args[1];
  ESLVal _v916 = $args[2];
  ESLVal _v915 = $args[3];
  ESLVal _v914 = $args[4];
  ESLVal _v913 = $args[5];
  ESLVal _v912 = $args[6];
  {ESLVal eType = expType.apply(_v916,_v915,_v914,_v913,_v912);
        ESLVal recType = substTypeEnv.apply(_v912,_v917);
        
        {ESLVal _v87 = recType;
        
        switch(_v87.termName) {
        case "RecType": {ESLVal $467 = _v87.termRef(0);
          ESLVal $466 = _v87.termRef(1);
          ESLVal $465 = _v87.termRef(2);
          
          {ESLVal rl = $467;
          
          {ESLVal n = $466;
          
          {ESLVal _v919 = $465;
          
          if(typeEqual.apply(substType.apply(eType,n,_v919),eType).boolVal)
          return eType;
          else
            return error(new ESLVal("TypeError",_v918,new ESLVal("unfold type ").add(ppType.apply(substType.apply(eType,n,_v919),_v912).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v912))))));
        }
        }
        }
        }
        default: {ESLVal _v920 = _v87;
          
          return error(new ESLVal("TypeError",_v918,new ESLVal("unfold type expects a rec type").add(ppType.apply(recType,_v912))));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v911 = $args[0];
  ESLVal _v910 = $args[1];
  ESLVal _v909 = $args[2];
  ESLVal _v908 = $args[3];
  ESLVal _v907 = $args[4];
  ESLVal _v906 = $args[5];
  ESLVal _v905 = $args[6];
  ESLVal _v904 = $args[7];
  {ESLVal aType = expType.apply(_v910,_v907,_v906,_v905,_v904);
        ESLVal iType = expType.apply(_v909,_v907,_v906,_v905,_v904);
        ESLVal vType = expType.apply(_v908,_v907,_v906,_v905,_v904);
        
        {ESLVal _v86 = aType;
        
        switch(_v86.termName) {
        case "ArrayType": {ESLVal $464 = _v86.termRef(0);
          ESLVal $463 = _v86.termRef(1);
          
          {ESLVal al = $464;
          
          {ESLVal t = $463;
          
          if(isIntType.apply(iType).boolVal)
          if(typeEqual.apply(vType,t).boolVal)
            return aType;
            else
              return error(new ESLVal("TypeError",_v911,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
          else
            return error(new ESLVal("TypeError",_v911,new ESLVal("array index should be an integer ").add(_v909)));
        }
        }
        }
        default: {ESLVal t = _v86;
          
          return error(new ESLVal("TypeError",_v911,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v903 = $args[0];
  ESLVal _v902 = $args[1];
  ESLVal _v901 = $args[2];
  ESLVal _v900 = $args[3];
  ESLVal _v899 = $args[4];
  ESLVal _v898 = $args[5];
  ESLVal _v897 = $args[6];
  {ESLVal aType = expType.apply(_v902,_v900,_v899,_v898,_v897);
        ESLVal iType = expType.apply(_v901,_v900,_v899,_v898,_v897);
        
        {ESLVal _v85 = aType;
        
        switch(_v85.termName) {
        case "ArrayType": {ESLVal $462 = _v85.termRef(0);
          ESLVal $461 = _v85.termRef(1);
          
          {ESLVal al = $462;
          
          {ESLVal t = $461;
          
          if(isIntType.apply(iType).boolVal)
          return t;
          else
            return error(new ESLVal("TypeError",_v903,new ESLVal("array index should be an integer ").add(_v901)));
        }
        }
        }
        default: {ESLVal t = _v85;
          
          return error(new ESLVal("TypeError",_v903,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v896 = $args[0];
  ESLVal _v895 = $args[1];
  ESLVal _v894 = $args[2];
  ESLVal _v893 = $args[3];
  ESLVal _v892 = $args[4];
  ESLVal _v891 = $args[5];
  ESLVal _v890 = $args[6];
  {ESLVal i = expType.apply(_v894,_v893,_v892,_v891,_v890);
        
        if(isIntType.apply(i).boolVal)
        return new ESLVal("ArrayType",_v896,substTypeEnv.apply(_v890,_v895));
        else
          return error(new ESLVal("TypeError",_v896,new ESLVal("expecting an integer type: ").add(i)));
      }
    }
  });
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v889 = $args[0];
  ESLVal _v888 = $args[1];
  ESLVal _v887 = $args[2];
  ESLVal _v886 = $args[3];
  ESLVal _v885 = $args[4];
  ESLVal _v884 = $args[5];
  {ESLVal bType = expType.apply(_v888,_v887,_v886,_v885,_v884);
        
        if(typeEqual.apply(bType,_v887).boolVal)
        return bType;
        else
          return error(new ESLVal("TypeError",_v889,new ESLVal("expecting become to match self type: ").add(ppType.apply(bType,_v884).add(new ESLVal(" ").add(ppType.apply(_v887,_v884))))));
      }
    }
  });
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v880 = $args[0];
  ESLVal _v879 = $args[1];
  ESLVal _v878 = $args[2];
  ESLVal _v877 = $args[3];
  ESLVal _v876 = $args[4];
  ESLVal _v875 = $args[5];
  ESLVal _v874 = $args[6];
  ESLVal _v873 = $args[7];
  ESLVal _v872 = $args[8];
  {ESLVal pt = expType.apply(_v879,_v875,_v874,_v873,_v872);
        
        if(isIntType.apply(pt).boolVal)
        {ESLVal _v883 = substTypeEnv.apply(_v872,_v878);
          ESLVal _v882 = expType.apply(_v877,_v875,_v874,_v873,_v872);
          ESLVal _v881 = expType.apply(_v876,_v875,_v874,_v873,_v872);
          
          if(typeEqual.apply(_v883,_v882).and(typeEqual.apply(_v883,_v881)).boolVal)
          return _v883;
          else
            return error(new ESLVal("TypeError",_v880,new ESLVal("expecting probably arm types to agree: ").add(ppType.apply(_v882,_v872).add(new ESLVal(" ").add(ppType.apply(_v883,_v872).add(new ESLVal(" ").add(ppType.apply(_v881,_v872))))))));
        }
        else
          return error(new ESLVal("TypeError",_v880,new ESLVal("expecting an integer: ").add(ppType.apply(pt,_v872))));
      }
    }
  });
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v871 = $args[0];
  ESLVal _v870 = $args[1];
  ESLVal _v869 = $args[2];
  ESLVal _v868 = $args[3];
  ESLVal _v867 = $args[4];
  ESLVal _v866 = $args[5];
  ESLVal _v865 = $args[6];
  return expType.apply(new ESLVal("Apply",_v871,_v870,_v869),_v868,_v867,_v866,_v865);
    }
  });
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v854 = $args[0];
  ESLVal _v853 = $args[1];
  ESLVal _v852 = $args[2];
  ESLVal _v851 = $args[3];
  ESLVal _v850 = $args[4];
  ESLVal _v849 = $args[5];
  ESLVal _v848 = $args[6];
  ESLVal _v847 = $args[7];
  {ESLVal _v82 = typeNF.apply(derefType.apply(expType.apply(_v853,_v850,_v849,_v848,_v847)),_v847);
        
        switch(_v82.termName) {
        case "ActType": {ESLVal $440 = _v82.termRef(0);
          ESLVal $439 = _v82.termRef(1);
          ESLVal $438 = _v82.termRef(2);
          
          {ESLVal al = $440;
          
          {ESLVal exports = $439;
          
          {ESLVal handlers = $438;
          
          { LetRec letrec = new LetRec() {
          ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v855 = $args[0];
            {ESLVal _v83 = _v855;
                  
                  if(_v83.isCons())
                  {ESLVal $441 = _v83.head();
                    ESLVal $442 = _v83.tail();
                    
                    switch($441.termName) {
                    case "MessageType": {ESLVal $444 = $441.termRef(0);
                      ESLVal $443 = $441.termRef(1);
                      
                      if($443.isCons())
                      {ESLVal $445 = $443.head();
                        ESLVal $446 = $443.tail();
                        
                        switch($445.termName) {
                        case "TermType": {ESLVal $449 = $445.termRef(0);
                          ESLVal $448 = $445.termRef(1);
                          ESLVal $447 = $445.termRef(2);
                          
                          if($446.isCons())
                          {ESLVal $450 = $446.head();
                            ESLVal $451 = $446.tail();
                            
                            {ESLVal m = $441;
                            
                            {ESLVal _v856 = $442;
                            
                            return findHandler.apply(_v856);
                          }
                          }
                          }
                        else if($446.isNil())
                          {ESLVal ml = $444;
                            
                            {ESLVal tl = $449;
                            
                            {ESLVal m = $448;
                            
                            {ESLVal ts = $447;
                            
                            {ESLVal rest = $442;
                            
                            if(m.eql(_v852).boolVal)
                            return head.apply(_v855);
                            else
                              {ESLVal _v857 = $441;
                                
                                {ESLVal _v858 = $442;
                                
                                return findHandler.apply(_v858);
                              }
                              }
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal m = $441;
                            
                            {ESLVal _v859 = $442;
                            
                            return findHandler.apply(_v859);
                          }
                          }
                        }
                        default: {ESLVal m = $441;
                          
                          {ESLVal _v860 = $442;
                          
                          return findHandler.apply(_v860);
                        }
                        }
                      }
                      }
                    else if($443.isNil())
                      {ESLVal m = $441;
                        
                        {ESLVal _v861 = $442;
                        
                        return findHandler.apply(_v861);
                      }
                      }
                    else {ESLVal m = $441;
                        
                        {ESLVal _v862 = $442;
                        
                        return findHandler.apply(_v862);
                      }
                      }
                    }
                    default: {ESLVal m = $441;
                      
                      {ESLVal _v863 = $442;
                      
                      return findHandler.apply(_v863);
                    }
                    }
                  }
                  }
                else if(_v83.isNil())
                  return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852)));
                else return error(new ESLVal("case error at Pos(29449,29756)").add(ESLVal.list(_v83)));
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
        
          {ESLVal _v84 = findHandler.apply(handlers);
          
          switch(_v84.termName) {
          case "MessageType": {ESLVal $453 = _v84.termRef(0);
            ESLVal $452 = _v84.termRef(1);
            
            if($452.isCons())
            {ESLVal $454 = $452.head();
              ESLVal $455 = $452.tail();
              
              switch($454.termName) {
              case "TermType": {ESLVal $458 = $454.termRef(0);
                ESLVal $457 = $454.termRef(1);
                ESLVal $456 = $454.termRef(2);
                
                if($455.isCons())
                {ESLVal $459 = $455.head();
                  ESLVal $460 = $455.tail();
                  
                  {ESLVal m = _v84;
                  
                  return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
                }
                }
              else if($455.isNil())
                {ESLVal ml = $453;
                  
                  {ESLVal tl = $458;
                  
                  {ESLVal _v864 = $457;
                  
                  {ESLVal ts1 = $456;
                  
                  {ESLVal ts2 = expTypes.apply(_v851,_v850,_v849,_v848,_v847);
                  
                  if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                  if(subTypes.apply(ts2,ts1).boolVal)
                    {expType.apply(_v853,_v850,_v849,_v848,_v847);
                    return new ESLVal("VoidType",_v854);}
                    else
                      return error(new ESLVal("TypeError",_v854,new ESLVal("message argument types ").add(ppTypes.apply(ts2,_v847).add(new ESLVal(" do not match expected types ").add(ppTypes.apply(ts1,_v847))))));
                  else
                    return error(new ESLVal("TypeError",_v854,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
                }
                }
                }
                }
                }
              else {ESLVal m = _v84;
                  
                  return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
                }
              }
              default: {ESLVal m = _v84;
                
                return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            }
          else if($452.isNil())
            {ESLVal m = _v84;
              
              return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
            }
          else {ESLVal m = _v84;
              
              return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          default: {ESLVal m = _v84;
            
            return error(new ESLVal("TypeError",_v854,new ESLVal("cannot find message handler named ").add(_v852.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        }}
        
        }
        }
        }
        }
        default: {ESLVal t = _v82;
          
          return error(new ESLVal("TypeError",_v854,new ESLVal("expecting a behaviour type: ").add(typeNF.apply(derefType.apply(expType.apply(_v853,_v850,_v849,_v848,_v847)),_v847))));
        }
      }
      }
    }
  });
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v804 = $args[0];
  ESLVal _v803 = $args[1];
  ESLVal _v802 = $args[2];
  ESLVal _v801 = $args[3];
  ESLVal _v800 = $args[4];
  ESLVal _v799 = $args[5];
  ESLVal _v798 = $args[6];
  ESLVal _v797 = $args[7];
  ESLVal _v796 = $args[8];
  ESLVal _v795 = $args[9];
  ESLVal _v794 = $args[10];
  ESLVal _v793 = $args[11];
  { LetRec letrec = new LetRec() {
        ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v837 = $args[0];
          ESLVal _v836 = $args[1];
          {ESLVal _v81 = _v836;
                
                if(_v81.isCons())
                {ESLVal $424 = _v81.head();
                  ESLVal $425 = _v81.tail();
                  
                  switch($424.termName) {
                  case "Binding": {ESLVal $437 = $424.termRef(0);
                    ESLVal $436 = $424.termRef(1);
                    ESLVal $435 = $424.termRef(2);
                    ESLVal $434 = $424.termRef(3);
                    ESLVal $433 = $424.termRef(4);
                    
                    {ESLVal _v841 = $437;
                    
                    {ESLVal m = $436;
                    
                    {ESLVal t = $435;
                    
                    {ESLVal st = $434;
                    
                    {ESLVal e = $433;
                    
                    {ESLVal _v842 = $425;
                    
                    if(m.eql(_v837).boolVal)
                    return _v841;
                    else
                      {ESLVal b = $424;
                        
                        {ESLVal _v843 = $425;
                        
                        return findLoc.apply(_v837,_v843);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $432 = $424.termRef(0);
                    ESLVal $431 = $424.termRef(1);
                    ESLVal $430 = $424.termRef(2);
                    ESLVal $429 = $424.termRef(3);
                    ESLVal $428 = $424.termRef(4);
                    ESLVal $427 = $424.termRef(5);
                    ESLVal $426 = $424.termRef(6);
                    
                    {ESLVal _v838 = $432;
                    
                    {ESLVal m = $431;
                    
                    {ESLVal ps = $430;
                    
                    {ESLVal t = $429;
                    
                    {ESLVal st = $428;
                    
                    {ESLVal g = $427;
                    
                    {ESLVal e = $426;
                    
                    {ESLVal _v839 = $425;
                    
                    if(m.eql(_v837).boolVal)
                    return _v838;
                    else
                      {ESLVal b = $424;
                        
                        {ESLVal _v840 = $425;
                        
                        return findLoc.apply(_v837,_v840);
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
                  default: {ESLVal b = $424;
                    
                    {ESLVal _v844 = $425;
                    
                    return findLoc.apply(_v837,_v844);
                  }
                  }
                }
                }
              else if(_v81.isNil())
                return p0;
              else return error(new ESLVal("case error at Pos(31239,31543)").add(ESLVal.list(_v81)));
              }
            }
          });
        ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v828 = $args[0];
          ESLVal _v827 = $args[1];
          {ESLVal _v80 = _v827;
                
                if(_v80.isCons())
                {ESLVal $410 = _v80.head();
                  ESLVal $411 = _v80.tail();
                  
                  switch($410.termName) {
                  case "Binding": {ESLVal $423 = $410.termRef(0);
                    ESLVal $422 = $410.termRef(1);
                    ESLVal $421 = $410.termRef(2);
                    ESLVal $420 = $410.termRef(3);
                    ESLVal $419 = $410.termRef(4);
                    
                    {ESLVal _v832 = $423;
                    
                    {ESLVal m = $422;
                    
                    {ESLVal t = $421;
                    
                    {ESLVal st = $420;
                    
                    {ESLVal e = $419;
                    
                    {ESLVal _v833 = $411;
                    
                    if(m.eql(_v828).boolVal)
                    return substTypeEnv.apply(_v793,t);
                    else
                      {ESLVal b = $410;
                        
                        {ESLVal _v834 = $411;
                        
                        return findType.apply(_v828,_v834);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $418 = $410.termRef(0);
                    ESLVal $417 = $410.termRef(1);
                    ESLVal $416 = $410.termRef(2);
                    ESLVal $415 = $410.termRef(3);
                    ESLVal $414 = $410.termRef(4);
                    ESLVal $413 = $410.termRef(5);
                    ESLVal $412 = $410.termRef(6);
                    
                    {ESLVal _v829 = $418;
                    
                    {ESLVal m = $417;
                    
                    {ESLVal ps = $416;
                    
                    {ESLVal t = $415;
                    
                    {ESLVal st = $414;
                    
                    {ESLVal g = $413;
                    
                    {ESLVal e = $412;
                    
                    {ESLVal _v830 = $411;
                    
                    if(m.eql(_v828).boolVal)
                    return substTypeEnv.apply(_v793,t);
                    else
                      {ESLVal b = $410;
                        
                        {ESLVal _v831 = $411;
                        
                        return findType.apply(_v828,_v831);
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
                  default: {ESLVal b = $410;
                    
                    {ESLVal _v835 = $411;
                    
                    return findType.apply(_v828,_v835);
                  }
                  }
                }
                }
              else if(_v80.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(31597,31954)").add(ESLVal.list(_v80)));
              }
            }
          });
        ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v823 = $args[0];
          {ESLVal _v79 = _v823;
                
                if(_v79.isCons())
                {ESLVal $408 = _v79.head();
                  ESLVal $409 = _v79.tail();
                  
                  {ESLVal m = $408;
                  
                  {ESLVal _v824 = $409;
                  
                  {ESLVal _v826 = findType.apply(m,_v799);
                  ESLVal _v825 = findLoc.apply(m,_v799);
                  
                  if(_v826.eql($null).boolVal)
                  return error(new ESLVal("TypeError",_v825,new ESLVal("cannot find exported name ").add(m)));
                  else
                    return decs.apply(_v824).cons(new ESLVal("Dec",_v825,m,_v826,_v826));
                }
                }
                }
                }
              else if(_v79.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(31996,32327)").add(ESLVal.list(_v79)));
              }
            }
          });
        ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v820 = $args[0];
          {ESLVal _v78 = _v820;
                
                if(_v78.isCons())
                {ESLVal $402 = _v78.head();
                  ESLVal $403 = _v78.tail();
                  
                  switch($402.termName) {
                  case "BArm": {ESLVal $407 = $402.termRef(0);
                    ESLVal $406 = $402.termRef(1);
                    ESLVal $405 = $402.termRef(2);
                    ESLVal $404 = $402.termRef(3);
                    
                    {ESLVal _v821 = $407;
                    
                    {ESLVal ps = $406;
                    
                    {ESLVal g = $405;
                    
                    {ESLVal e = $404;
                    
                    {ESLVal _v822 = $403;
                    
                    return getMessageTypes.apply(_v822).cons(getMessageType.apply(ps));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(32378,32533)").add(ESLVal.list(_v78)));
                }
                }
              else if(_v78.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(32378,32533)").add(ESLVal.list(_v78)));
              }
            }
          });
        ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ps = $args[0];
          {ESLVal _v77 = ps;
                
                if(_v77.isCons())
                {ESLVal $394 = _v77.head();
                  ESLVal $395 = _v77.tail();
                  
                  switch($394.termName) {
                  case "PTerm": {ESLVal $399 = $394.termRef(0);
                    ESLVal $398 = $394.termRef(1);
                    ESLVal $397 = $394.termRef(2);
                    ESLVal $396 = $394.termRef(3);
                    
                    if($395.isCons())
                    {ESLVal $400 = $395.head();
                      ESLVal $401 = $395.tail();
                      
                      return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v77)));
                    }
                  else if($395.isNil())
                    {ESLVal pl = $399;
                      
                      {ESLVal termName = $398;
                      
                      {ESLVal targs = $397;
                      
                      {ESLVal _v819 = $396;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun275"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v804,p,_v796,_v795,_v794,_v793);
                          }
                        }),_v819);
                      
                      return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v77)));
                  }
                  default: return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v77)));
                }
                }
              else if(_v77.isNil())
                return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v77)));
              else return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v77)));
              }
            }
          });
        ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v816 = $args[0];
          ESLVal _v815 = $args[1];
          ESLVal _v814 = $args[2];
          {ESLVal _v76 = _v816;
                
                if(_v76.isCons())
                {ESLVal $388 = _v76.head();
                  ESLVal $389 = _v76.tail();
                  
                  switch($388.termName) {
                  case "BArm": {ESLVal $393 = $388.termRef(0);
                    ESLVal $392 = $388.termRef(1);
                    ESLVal $391 = $388.termRef(2);
                    ESLVal $390 = $388.termRef(3);
                    
                    {ESLVal _v817 = $393;
                    
                    {ESLVal ps = $392;
                    
                    {ESLVal g = $391;
                    
                    {ESLVal e = $390;
                    
                    {ESLVal _v818 = $389;
                    
                    {typeCheckArm.apply(_v817,ps,g,e,_v815,_v814);
                  return typeCheckArms.apply(_v818,_v815,_v814);}
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(32930,33157)").add(ESLVal.list(_v76)));
                }
                }
              else if(_v76.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(32930,33157)").add(ESLVal.list(_v76)));
              }
            }
          });
        ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v810 = $args[0];
          ESLVal _v809 = $args[1];
          ESLVal _v808 = $args[2];
          ESLVal _v807 = $args[3];
          ESLVal _v806 = $args[4];
          ESLVal _v805 = $args[5];
          {ESLVal _v75 = _v809;
                
                if(_v75.isCons())
                {ESLVal $380 = _v75.head();
                  ESLVal $381 = _v75.tail();
                  
                  switch($380.termName) {
                  case "PTerm": {ESLVal $385 = $380.termRef(0);
                    ESLVal $384 = $380.termRef(1);
                    ESLVal $383 = $380.termRef(2);
                    ESLVal $382 = $380.termRef(3);
                    
                    if($381.isCons())
                    {ESLVal $386 = $381.head();
                      ESLVal $387 = $381.tail();
                      
                      return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v75)));
                    }
                  else if($381.isNil())
                    {ESLVal pl = $385;
                      
                      {ESLVal termName = $384;
                      
                      {ESLVal targs = $383;
                      
                      {ESLVal _v811 = $382;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun276"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v810,p,_v806,_v805,_v794,_v793);
                          }
                        }),_v811);
                      
                      {patternTypes.apply(_v810,_v811,ts,_v806,_v805,_v794,_v793,new ESLVal(new Function(new ESLVal("fun277"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v813 = $args[0];
                    ESLVal _v812 = $args[1];
                    return expType.apply(_v807,_v806,_v812,_v794,_v793);
                      }
                    }));
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v75)));
                  }
                  default: return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v75)));
                }
                }
              else if(_v75.isNil())
                return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v75)));
              else return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v75)));
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
            if(_v801.eql($null).boolVal)
              return actType0;
              else
                return expType.apply(_v801,_v796,_v795,_v794,_v793);
          }).get();
        ESLVal localEnv = parBind.apply(_v799,_v796,_v795,_v794,_v793);
        
        {ESLVal exportedDecs = decs.apply(_v800);
        
        {ESLVal messageTypes = getMessageTypes.apply(_v797);
        
        {ESLVal _v846 = new ESLVal("ExtendedAct",_v804,parentType,exportedDecs,messageTypes);
        ESLVal _v845 = ESLVal.list(new ESLVal("Map",new ESLVal("$super"),parentType));
        
        {typeCheckExports.apply(_v804,exportedDecs,_v799,_v846,localEnv.add(_v795),_v793,_v794);
      typeCheckValues.apply(valueDefs.apply(_v799),_v846,_v845.add(localEnv.add(_v795)),_v793,_v794);
      expType.apply(_v798,_v846,_v845.add(localEnv.add(_v795)),_v794,_v793);
      typeCheckArms.apply(_v797,_v846,_v845.add(localEnv.add(_v795)));
      return _v846;}
      }
      }
      }
      }}
      
    }
  });
  private static ESLVal typeCheckExports = new ESLVal(new Function(new ESLVal("typeCheckExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v792 = $args[0];
  ESLVal _v791 = $args[1];
  ESLVal _v790 = $args[2];
  ESLVal _v789 = $args[3];
  ESLVal _v788 = $args[4];
  ESLVal _v787 = $args[5];
  ESLVal _v786 = $args[6];
  {{
        ESLVal _v74 = _v791;
        while(_v74.isCons()) {
          ESLVal e = _v74.headVal;
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun278"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal b = $args[0];
          return bindingName.apply(b).eql(decName.apply(e)).and(typeEqual.apply(lookupType.apply(decName.apply(e),_v788),decType.apply(e)));
            }
          }),_v790).boolVal)
            {}
            else
              error(new ESLVal("TypeError",_v792,new ESLVal(" cannot find export for ").add(decName.apply(e))));
          _v74 = _v74.tailVal;}
      }
      return $null;}
    }
  });
  private static ESLVal bTypeExports = new ESLVal(new Function(new ESLVal("bTypeExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v73 = t;
        
        switch(_v73.termName) {
        case "ExtendedAct": {ESLVal $379 = _v73.termRef(0);
          ESLVal $378 = _v73.termRef(1);
          ESLVal $377 = _v73.termRef(2);
          ESLVal $376 = _v73.termRef(3);
          
          {ESLVal l = $379;
          
          {ESLVal parent = $378;
          
          {ESLVal exports = $377;
          
          {ESLVal message = $376;
          
          return bTypeExports.apply(parent).add(exports);
        }
        }
        }
        }
        }
      case "ActType": {ESLVal $375 = _v73.termRef(0);
          ESLVal $374 = _v73.termRef(1);
          ESLVal $373 = _v73.termRef(2);
          
          {ESLVal l = $375;
          
          {ESLVal exports = $374;
          
          {ESLVal message = $373;
          
          return exports;
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $372 = _v73.termRef(0);
          
          {ESLVal f = $372;
          
          return bTypeExports.apply(f.apply());
        }
        }
      case "RecType": {ESLVal $371 = _v73.termRef(0);
          ESLVal $370 = _v73.termRef(1);
          ESLVal $369 = _v73.termRef(2);
          
          {ESLVal l = $371;
          
          {ESLVal n = $370;
          
          {ESLVal _v785 = $369;
          
          return bTypeExports.apply(substType.apply(new ESLVal("RecType",l,n,_v785),n,_v785));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(35101,35511)").add(ESLVal.list(_v73)));
      }
      }
    }
  });
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v777 = $args[0];
  ESLVal _v776 = $args[1];
  ESLVal _v775 = $args[2];
  ESLVal _v774 = $args[3];
  ESLVal _v773 = $args[4];
  ESLVal _v772 = $args[5];
  ESLVal _v771 = $args[6];
  {ESLVal _v71 = _v775;
        
        if(_v71.isCons())
        {ESLVal $360 = _v71.head();
          ESLVal $361 = _v71.tail();
          
          switch($360.termName) {
          case "BQual": {ESLVal $366 = $360.termRef(0);
            ESLVal $365 = $360.termRef(1);
            ESLVal $364 = $360.termRef(2);
            
            {ESLVal _v780 = $366;
            
            {ESLVal p = $365;
            
            {ESLVal list = $364;
            
            {ESLVal _v781 = $361;
            
            {ESLVal lType = expType.apply(list,_v774,_v773,_v772,_v771);
            
            {ESLVal _v72 = lType;
            
            switch(_v72.termName) {
            case "ListType": {ESLVal $368 = _v72.termRef(0);
              ESLVal $367 = _v72.termRef(1);
              
              {ESLVal ll = $368;
              
              {ESLVal t = $367;
              
              {ESLVal _v782 = _v781;
              
              return patternType.apply(_v780,p,substTypeEnv.apply(_v771,t),_v774,_v773,_v772,_v771,new ESLVal(new Function(new ESLVal("fun279"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v784 = $args[0];
              ESLVal _v783 = $args[1];
              return cmpType.apply(_v780,_v776,_v782,_v774,_v783,_v772,_v771);
                }
              }));
            }
            }
            }
            }
            default: {ESLVal t = _v72;
              
              return error(new ESLVal("TypeError",_v780,new ESLVal("qualifier binding expects a list: ").add(ppType.apply(t,_v771))));
            }
          }
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $363 = $360.termRef(0);
            ESLVal $362 = $360.termRef(1);
            
            {ESLVal _v778 = $363;
            
            {ESLVal b = $362;
            
            {ESLVal _v779 = $361;
            
            {ESLVal bType = expType.apply(b,_v774,_v773,_v772,_v771);
            
            if(isBoolType.apply(bType).boolVal)
            return cmpType.apply(_v778,_v776,_v779,_v774,_v773,_v772,_v771);
            else
              return error(new ESLVal("TypeError",_v778,new ESLVal("qualifier expects a boolean type: ").add(ppType.apply(bType,_v771))));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(35622,36608)").add(ESLVal.list(_v71)));
        }
        }
      else if(_v71.isNil())
        {ESLVal t = expType.apply(_v776,_v774,_v773,_v772,_v771);
          
          return new ESLVal("ListType",_v777,t);
        }
      else return error(new ESLVal("case error at Pos(35622,36608)").add(ESLVal.list(_v71)));
      }
    }
  });
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v770 = $args[0];
  ESLVal _v769 = $args[1];
  ESLVal _v768 = $args[2];
  ESLVal _v767 = $args[3];
  ESLVal _v766 = $args[4];
  ESLVal _v765 = $args[5];
  ESLVal _v764 = $args[6];
  {ESLVal t = lookupType.apply(_v769,_v766);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v770,new ESLVal("unbound variable ").add(_v769)));
        else
          {ESLVal valueType = expType.apply(_v768,_v767,_v766,_v765,_v764);
            
            if(typeEqual.apply(valueType,t).boolVal)
            return valueType;
            else
              return error(new ESLVal("TypeError",_v770,new ESLVal("type of variable ").add(_v769.add(new ESLVal("::").add(ppType.apply(t,_v764).add(new ESLVal(" does not agree with value type ").add(ppType.apply(valueType,_v764))))))));
          }
      }
    }
  });
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v763 = $args[0];
  ESLVal _v762 = $args[1];
  ESLVal _v761 = $args[2];
  ESLVal _v760 = $args[3];
  ESLVal _v759 = $args[4];
  ESLVal _v758 = $args[5];
  ESLVal _v757 = $args[6];
  {ESLVal env = parBind.apply(_v762,_v760,_v759,_v758,_v757);
        
        {{
        ESLVal _v70 = _v762;
        while(_v70.isCons()) {
          ESLVal b = _v70.headVal;
          typeCheckDef.apply(b,_v760,_v759,env.add(_v759),_v758,_v757);
          _v70 = _v70.tailVal;}
      }
      return expType.apply(_v761,_v760,env.add(_v759),_v758,_v757);}
      }
    }
  });
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v756 = $args[0];
  ESLVal _v755 = $args[1];
  ESLVal _v754 = $args[2];
  ESLVal _v753 = $args[3];
  ESLVal _v752 = $args[4];
  ESLVal _v751 = $args[5];
  ESLVal _v750 = $args[6];
  {ESLVal env = recBind.apply(_v755,_v753,_v752,_v751,_v750);
        
        {{
        ESLVal _v69 = _v755;
        while(_v69.isCons()) {
          ESLVal b = _v69.headVal;
          typeCheckDef.apply(b,_v753,env.add(_v752),env.add(_v752),_v751,_v750);
          _v69 = _v69.tailVal;}
      }
      return expType.apply(_v754,_v753,env.add(_v752),_v751,_v750);}
      }
    }
  });
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal bs = $args[0];
  {ESLVal _v68 = bs;
        
        if(_v68.isCons())
        {ESLVal $358 = _v68.head();
          ESLVal $359 = _v68.tail();
          
          {ESLVal b = $358;
          
          {ESLVal _v749 = $359;
          
          if(member.apply(bindingName.apply(b),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName.apply(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v749)).boolVal)
          return error(new ESLVal("TypeError",bindingLoc.apply(b),new ESLVal("duplicate definitions for ").add(bindingName.apply(b))));
          else
            return checkDupBindings.apply(_v749);
        }
        }
        }
      else if(_v68.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(37856,38121)").add(ESLVal.list(_v68)));
      }
    }
  });
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v748 = $args[0];
  ESLVal _v747 = $args[1];
  ESLVal _v746 = $args[2];
  ESLVal _v745 = $args[3];
  ESLVal _v744 = $args[4];
  {checkDupBindings.apply(_v748);
      return valueDefsToTEnv.apply(valueDefs.apply(_v748),_v747,_v746,_v745,_v744);}
    }
  });
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v743 = $args[0];
  ESLVal _v742 = $args[1];
  ESLVal _v741 = $args[2];
  ESLVal _v740 = $args[3];
  ESLVal _v739 = $args[4];
  return valueDefsToTEnv.apply(valueDefs.apply(_v743),_v742,_v741,_v740,_v739);
    }
  });
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v738 = $args[0];
  ESLVal _v737 = $args[1];
  ESLVal _v736 = $args[2];
  ESLVal _v735 = $args[3];
  ESLVal _v734 = $args[4];
  ESLVal _v733 = $args[5];
  ESLVal _v732 = $args[6];
  {ESLVal ts1 = expTypes.apply(_v737,_v735,_v734,_v733,_v732);
        
        {ESLVal ts2 = armTypes.apply(_v736,ts1,_v735,_v734,_v733,_v732);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v738,new ESLVal("case arm types do not agree: ").add(ppTypes.apply(ts1,_v732).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v732))))));
      }
      }
    }
  });
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v731 = $args[0];
  ESLVal _v730 = $args[1];
  ESLVal _v729 = $args[2];
  ESLVal _v728 = $args[3];
  ESLVal _v727 = $args[4];
  ESLVal _v726 = $args[5];
  ESLVal _v725 = $args[6];
  {ESLVal ts1 = expTypes.apply(ESLVal.list(_v730),_v728,_v727,_v726,_v725);
        
        {ESLVal ts2 = armTypes.apply(_v729,ts1,_v728,_v727,_v726,_v725);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v731,new ESLVal("try arm types do not agree: ").add(ppTypes.apply(ts1,_v725).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v725))))));
      }
      }
    }
  });
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v723 = $args[0];
  ESLVal _v722 = $args[1];
  ESLVal _v721 = $args[2];
  ESLVal _v720 = $args[3];
  ESLVal _v719 = $args[4];
  ESLVal _v718 = $args[5];
  {ESLVal _v67 = _v723;
        
        if(_v67.isCons())
        {ESLVal $356 = _v67.head();
          ESLVal $357 = _v67.tail();
          
          {ESLVal a = $356;
          
          {ESLVal _v724 = $357;
          
          return armTypes.apply(_v724,_v722,_v721,_v720,_v719,_v718).cons(armType.apply(a,_v722,_v721,_v720,_v719,_v718));
        }
        }
        }
      else if(_v67.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(39486,39655)").add(ESLVal.list(_v67)));
      }
    }
  });
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v715 = $args[0];
  ESLVal _v714 = $args[1];
  ESLVal _v713 = $args[2];
  ESLVal _v712 = $args[3];
  ESLVal _v711 = $args[4];
  ESLVal _v710 = $args[5];
  {ESLVal _v66 = _v715;
        
        switch(_v66.termName) {
        case "BArm": {ESLVal $355 = _v66.termRef(0);
          ESLVal $354 = _v66.termRef(1);
          ESLVal $353 = _v66.termRef(2);
          ESLVal $352 = _v66.termRef(3);
          
          {ESLVal l = $355;
          
          {ESLVal ps = $354;
          
          {ESLVal guard = $353;
          
          {ESLVal exp = $352;
          
          {checkPatterns.apply(l,ps);
        if(length.apply(ps).eql(length.apply(_v714)).boolVal)
          return patternTypes.apply(l,ps,_v714,_v713,_v712,_v711,_v710,new ESLVal(new Function(new ESLVal("fun280"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v717 = $args[0];
            ESLVal _v716 = $args[1];
            return guardedExpType.apply(l,guard,exp,_v713,_v716,_v711,_v710);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(_v714))))));}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(39757,40218)").add(ESLVal.list(_v66)));
      }
      }
    }
  });
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v680 = $args[0];
  ESLVal _v679 = $args[1];
  ESLVal _v678 = $args[2];
  ESLVal _v677 = $args[3];
  ESLVal _v676 = $args[4];
  ESLVal _v675 = $args[5];
  ESLVal _v674 = $args[6];
  { LetRec letrec = new LetRec() {
        ESLVal t = derefType.apply(expType.apply(_v679,_v677,_v676,_v675,_v674));
        ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal decs = $args[0];
          {ESLVal _v64 = decs;
                
                if(_v64.isCons())
                {ESLVal $335 = _v64.head();
                  ESLVal $336 = _v64.tail();
                  
                  switch($335.termName) {
                  case "Dec": {ESLVal $340 = $335.termRef(0);
                    ESLVal $339 = $335.termRef(1);
                    ESLVal $338 = $335.termRef(2);
                    ESLVal $337 = $335.termRef(3);
                    
                    {ESLVal _v686 = $340;
                    
                    {ESLVal m = $339;
                    
                    {ESLVal t = $338;
                    
                    {ESLVal st = $337;
                    
                    {ESLVal _v687 = $336;
                    
                    if(m.eql(_v678).boolVal)
                    return t;
                    else
                      {ESLVal d = $335;
                        
                        {ESLVal _v688 = $336;
                        
                        return findExport.apply(_v688);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal d = $335;
                    
                    {ESLVal _v689 = $336;
                    
                    return findExport.apply(_v689);
                  }
                  }
                }
                }
              else if(_v64.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(40446,40619)").add(ESLVal.list(_v64)));
              }
            }
          });
        ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal fs = $args[0];
          {ESLVal _v63 = fs;
                
                if(_v63.isCons())
                {ESLVal $329 = _v63.head();
                  ESLVal $330 = _v63.tail();
                  
                  switch($329.termName) {
                  case "Dec": {ESLVal $334 = $329.termRef(0);
                    ESLVal $333 = $329.termRef(1);
                    ESLVal $332 = $329.termRef(2);
                    ESLVal $331 = $329.termRef(3);
                    
                    {ESLVal _v681 = $334;
                    
                    {ESLVal m = $333;
                    
                    {ESLVal t = $332;
                    
                    {ESLVal ds = $331;
                    
                    {ESLVal _v682 = $330;
                    
                    if(m.eql(_v678).boolVal)
                    return t;
                    else
                      {ESLVal _v683 = $329;
                        
                        {ESLVal _v684 = $330;
                        
                        return findField.apply(_v684);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t = $329;
                    
                    {ESLVal _v685 = $330;
                    
                    return findField.apply(_v685);
                  }
                  }
                }
                }
              else if(_v63.isNil())
                return error(new ESLVal("TypeError",_v680,new ESLVal("cannot find field name ").add(_v678)));
              else return error(new ESLVal("case error at Pos(40660,40868)").add(ESLVal.list(_v63)));
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
      
        {ESLVal _v65 = typeNF.apply(t,_v674);
        
        switch(_v65.termName) {
        case "StrType": {ESLVal $351 = _v65.termRef(0);
          
          {ESLVal sl = $351;
          
          if(_v678.eql(new ESLVal("explode")).boolVal)
          return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
          else
            {ESLVal _v707 = $351;
              
              if(_v678.eql(new ESLVal("writeDate")).boolVal)
              return new ESLVal("FloatType",_v707);
              else
                {ESLVal _v708 = _v65;
                  
                  return error(new ESLVal("TypeError",_v680,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v708,_v674))));
                }
            }
        }
        }
      case "TableType": {ESLVal $350 = _v65.termRef(0);
          ESLVal $349 = _v65.termRef(1);
          ESLVal $348 = _v65.termRef(2);
          
          {ESLVal _v693 = $350;
          
          {ESLVal k = $349;
          
          {ESLVal v = $348;
          
          if(_v678.eql(new ESLVal("get")).boolVal)
          return new ESLVal("FunType",_v693,ESLVal.list(k),v);
          else
            {ESLVal _v694 = $350;
              
              {ESLVal _v695 = $349;
              
              {ESLVal _v696 = $348;
              
              if(_v678.eql(new ESLVal("put")).boolVal)
              return new ESLVal("FunType",_v694,ESLVal.list(_v695,_v696),t);
              else
                {ESLVal _v697 = $350;
                  
                  {ESLVal _v698 = $349;
                  
                  {ESLVal _v699 = $348;
                  
                  if(_v678.eql(new ESLVal("keys")).boolVal)
                  return new ESLVal("ListType",_v697,_v698);
                  else
                    {ESLVal _v700 = $350;
                      
                      {ESLVal _v701 = $349;
                      
                      {ESLVal _v702 = $348;
                      
                      if(_v678.eql(new ESLVal("vals")).boolVal)
                      return new ESLVal("ListType",_v700,_v702);
                      else
                        {ESLVal _v703 = $350;
                          
                          {ESLVal _v704 = $349;
                          
                          {ESLVal _v705 = $348;
                          
                          if(_v678.eql(new ESLVal("hasKey")).boolVal)
                          return new ESLVal("FunType",_v703,ESLVal.list(_v704),new ESLVal("BoolType",_v703));
                          else
                            {ESLVal _v706 = _v65;
                              
                              return error(new ESLVal("TypeError",_v703,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v706,_v674))));
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
      case "ListType": {ESLVal $347 = _v65.termRef(0);
          ESLVal $346 = _v65.termRef(1);
          
          {ESLVal ll = $347;
          
          {ESLVal _v691 = $346;
          
          if(_v678.eql(new ESLVal("implode")).boolVal)
          return new ESLVal("StrType",ll);
          else
            {ESLVal _v692 = _v65;
              
              return error(new ESLVal("TypeError",_v680,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v692,_v674))));
            }
        }
        }
        }
      case "RecordType": {ESLVal $345 = _v65.termRef(0);
          ESLVal $344 = _v65.termRef(1);
          
          {ESLVal rl = $345;
          
          {ESLVal fs = $344;
          
          return findField.apply(fs);
        }
        }
        }
      case "ActType": {ESLVal $343 = _v65.termRef(0);
          ESLVal $342 = _v65.termRef(1);
          ESLVal $341 = _v65.termRef(2);
          
          {ESLVal al = $343;
          
          {ESLVal exports = $342;
          
          {ESLVal handlers = $341;
          
          {ESLVal _v690 = findExport.apply(exports);
          
          if(_v690.eql($null).boolVal)
          return error(new ESLVal("TypeError",_v680,new ESLVal("behaviour type does not export ").add(_v678)));
          else
            return substTypeEnv.apply(_v674,_v690);
        }
        }
        }
        }
        }
        default: {ESLVal _v709 = _v65;
          
          return error(new ESLVal("TypeError",_v680,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v709,_v674))));
        }
      }
      }}
      
    }
  });
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v62 = t;
        
        switch(_v62.termName) {
        case "TypeClosure": {ESLVal $328 = _v62.termRef(0);
          
          {ESLVal f = $328;
          
          return derefType.apply(f.apply());
        }
        }
        default: {ESLVal _v673 = _v62;
          
          return _v673;
        }
      }
      }
    }
  });
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v666 = $args[0];
  ESLVal _v665 = $args[1];
  ESLVal _v664 = $args[2];
  ESLVal _v663 = $args[3];
  ESLVal _v662 = $args[4];
  ESLVal _v661 = $args[5];
  { LetRec letrec = new LetRec() {
        ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v667 = $args[0];
          {ESLVal _v61 = _v667;
                
                if(_v61.isCons())
                {ESLVal $321 = _v61.head();
                  ESLVal $322 = _v61.tail();
                  
                  switch($321.termName) {
                  case "Binding": {ESLVal $327 = $321.termRef(0);
                    ESLVal $326 = $321.termRef(1);
                    ESLVal $325 = $321.termRef(2);
                    ESLVal $324 = $321.termRef(3);
                    ESLVal $323 = $321.termRef(4);
                    
                    {ESLVal _v668 = $327;
                    
                    {ESLVal n = $326;
                    
                    {ESLVal t = $325;
                    
                    {ESLVal st = $324;
                    
                    {ESLVal e = $323;
                    
                    {ESLVal _v669 = $322;
                    
                    {ESLVal _v670 = expType.apply(e,_v664,_v663,_v662,_v661);
                    
                    return fieldTypes.apply(_v669).cons(new ESLVal("Dec",_v668,n,_v670,_v670));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v671 = _v61;
                    
                    return error(new ESLVal("TypeError",_v666,new ESLVal("unknown field representation: ").add(_v671)));
                  }
                }
                }
              else if(_v61.isNil())
                return $nil;
              else {ESLVal _v672 = _v61;
                  
                  return error(new ESLVal("TypeError",_v666,new ESLVal("unknown field representation: ").add(_v672)));
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
      
        return new ESLVal("RecordType",_v666,fieldTypes.apply(_v665));}
      
    }
  });
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v656 = $args[0];
  ESLVal _v655 = $args[1];
  ESLVal _v654 = $args[2];
  ESLVal _v653 = $args[3];
  ESLVal _v652 = $args[4];
  ESLVal _v651 = $args[5];
  ESLVal _v650 = $args[6];
  ESLVal _v649 = $args[7];
  {ESLVal _v657 = expType.apply(_v654,_v652,_v651,_v650,_v649);
        
        {ESLVal _v60 = _v657;
        
        switch(_v60.termName) {
        case "ListType": {ESLVal $320 = _v60.termRef(0);
          ESLVal $319 = _v60.termRef(1);
          
          {ESLVal _v658 = $320;
          
          {ESLVal t = $319;
          
          return patternType.apply(_v658,_v655,t,_v652,_v651,_v650,_v649,new ESLVal(new Function(new ESLVal("fun281"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v660 = $args[0];
          ESLVal _v659 = $args[1];
          return expType.apply(_v653,_v652,_v659,_v650,_v649);
            }
          }));
        }
        }
        }
        default: {ESLVal t = _v60;
          
          return error(new ESLVal("TypeError",_v656,new ESLVal("for type expects a list: ").add(_v654)));
        }
      }
      }
      }
    }
  });
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v630 = $args[0];
  ESLVal _v629 = $args[1];
  ESLVal _v628 = $args[2];
  ESLVal _v627 = $args[3];
  ESLVal _v626 = $args[4];
  ESLVal _v625 = $args[5];
  ESLVal _v624 = $args[6];
  ESLVal _v623 = $args[7];
  {ESLVal _v59 = _v629;
        ESLVal _v58 = _v628;
        
        if(_v59.isCons())
        {ESLVal $313 = _v59.head();
          ESLVal $314 = _v59.tail();
          
          if(_v58.isCons())
          {ESLVal $315 = _v58.head();
            ESLVal $316 = _v58.tail();
            
            {ESLVal p = $313;
            
            {ESLVal _v631 = $314;
            
            {ESLVal t = $315;
            
            {ESLVal _v632 = $316;
            
            {ESLVal _v634 = _v631;
            ESLVal _v633 = _v632;
            
            return patternType.apply(_v630,p,t,_v627,_v626,_v625,_v624,new ESLVal(new Function(new ESLVal("fun282"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v636 = $args[0];
            ESLVal _v635 = $args[1];
            return patternTypes.apply(_v630,_v634,_v633,_v627,_v635,_v625,_v624,new ESLVal(new Function(new ESLVal("fun283"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v638 = $args[0];
                  ESLVal _v637 = $args[1];
                  return _v623.apply(_v638.cons(_v636),_v637);
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
          {ESLVal _v639 = _v59;
            
            {ESLVal _v640 = _v58;
            
            return error(new ESLVal("TypeError",_v630,new ESLVal("somthing wrong with ").add(_v639.add(new ESLVal(" ").add(_v640)))));
          }
          }
        else {ESLVal _v641 = _v59;
            
            {ESLVal _v642 = _v58;
            
            return error(new ESLVal("TypeError",_v630,new ESLVal("somthing wrong with ").add(_v641.add(new ESLVal(" ").add(_v642)))));
          }
          }
        }
      else if(_v59.isNil())
        if(_v58.isCons())
          {ESLVal $317 = _v58.head();
            ESLVal $318 = _v58.tail();
            
            {ESLVal _v643 = _v59;
            
            {ESLVal _v644 = _v58;
            
            return error(new ESLVal("TypeError",_v630,new ESLVal("somthing wrong with ").add(_v643.add(new ESLVal(" ").add(_v644)))));
          }
          }
          }
        else if(_v58.isNil())
          return _v623.apply($nil,_v626);
        else {ESLVal _v645 = _v59;
            
            {ESLVal _v646 = _v58;
            
            return error(new ESLVal("TypeError",_v630,new ESLVal("somthing wrong with ").add(_v645.add(new ESLVal(" ").add(_v646)))));
          }
          }
      else {ESLVal _v647 = _v59;
          
          {ESLVal _v648 = _v58;
          
          return error(new ESLVal("TypeError",_v630,new ESLVal("somthing wrong with ").add(_v647.add(new ESLVal(" ").add(_v648)))));
        }
        }
      }
    }
  });
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v607 = $args[0];
  ESLVal _v606 = $args[1];
  ESLVal _v605 = $args[2];
  ESLVal _v604 = $args[3];
  ESLVal _v603 = $args[4];
  ESLVal _v602 = $args[5];
  {ESLVal _v57 = _v606;
        
        switch(_v57.termName) {
        case "PApplyType": {ESLVal $312 = _v57.termRef(0);
          ESLVal $311 = _v57.termRef(1);
          ESLVal $310 = _v57.termRef(2);
          
          {ESLVal _v620 = $312;
          
          {ESLVal _v621 = $311;
          
          {ESLVal args = $310;
          
          return error(new ESLVal("should this happen?"));
        }
        }
        }
        }
      case "PBool": {ESLVal $309 = _v57.termRef(0);
          ESLVal $308 = _v57.termRef(1);
          
          {ESLVal _v619 = $309;
          
          {ESLVal b = $308;
          
          return new ESLVal("BoolType",_v619);
        }
        }
        }
      case "PCons": {ESLVal $307 = _v57.termRef(0);
          ESLVal $306 = _v57.termRef(1);
          ESLVal $305 = _v57.termRef(2);
          
          {ESLVal _v618 = $307;
          
          {ESLVal hd = $306;
          
          {ESLVal tl = $305;
          
          return getPatternType.apply(_v618,tl,_v605,_v604,_v603,_v602);
        }
        }
        }
        }
      case "PBagCons": {ESLVal $304 = _v57.termRef(0);
          ESLVal $303 = _v57.termRef(1);
          ESLVal $302 = _v57.termRef(2);
          
          {ESLVal _v617 = $304;
          
          {ESLVal hd = $303;
          
          {ESLVal tl = $302;
          
          return getPatternType.apply(_v617,tl,_v605,_v604,_v603,_v602);
        }
        }
        }
        }
      case "PSetCons": {ESLVal $301 = _v57.termRef(0);
          ESLVal $300 = _v57.termRef(1);
          ESLVal $299 = _v57.termRef(2);
          
          {ESLVal _v616 = $301;
          
          {ESLVal hd = $300;
          
          {ESLVal tl = $299;
          
          return getPatternType.apply(_v616,tl,_v605,_v604,_v603,_v602);
        }
        }
        }
        }
      case "PNil": {ESLVal $298 = _v57.termRef(0);
          
          {ESLVal _v615 = $298;
          
          return new ESLVal("ForallType",_v615,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v615,new ESLVal("VarType",_v615,new ESLVal("T"))));
        }
        }
      case "PNull": {ESLVal $297 = _v57.termRef(0);
          
          {ESLVal _v614 = $297;
          
          return new ESLVal("ForallType",_v614,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v614,new ESLVal("T")));
        }
        }
      case "PEmptyBag": {ESLVal $296 = _v57.termRef(0);
          
          {ESLVal _v613 = $296;
          
          return new ESLVal("ForallType",_v613,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v613,new ESLVal("VarType",_v613,new ESLVal("T"))));
        }
        }
      case "PEmptySet": {ESLVal $295 = _v57.termRef(0);
          
          {ESLVal _v612 = $295;
          
          return new ESLVal("ForallType",_v612,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v612,new ESLVal("VarType",_v612,new ESLVal("T"))));
        }
        }
      case "PInt": {ESLVal $294 = _v57.termRef(0);
          ESLVal $293 = _v57.termRef(1);
          
          {ESLVal _v611 = $294;
          
          {ESLVal n = $293;
          
          return new ESLVal("IntType",_v611);
        }
        }
        }
      case "PVar": {ESLVal $292 = _v57.termRef(0);
          ESLVal $291 = _v57.termRef(1);
          ESLVal $290 = _v57.termRef(2);
          
          {ESLVal _v610 = $292;
          
          {ESLVal n = $291;
          
          {ESLVal pt = $290;
          
          return substTypeEnv.apply(_v602,pt);
        }
        }
        }
        }
      case "PStr": {ESLVal $289 = _v57.termRef(0);
          ESLVal $288 = _v57.termRef(1);
          
          {ESLVal _v609 = $289;
          
          {ESLVal s = $288;
          
          return new ESLVal("StrType",_v609);
        }
        }
        }
      case "PTerm": {ESLVal $287 = _v57.termRef(0);
          ESLVal $286 = _v57.termRef(1);
          ESLVal $285 = _v57.termRef(2);
          ESLVal $284 = _v57.termRef(3);
          
          {ESLVal _v608 = $287;
          
          {ESLVal n = $286;
          
          {ESLVal ts = $285;
          
          {ESLVal ps = $284;
          
          return lookupType.apply(n,_v603);
        }
        }
        }
        }
        }
        default: {ESLVal _v622 = _v57;
          
          return error(new ESLVal("TypeError",_v607,new ESLVal("unknown type of pattern: ").add(_v622)));
        }
      }
      }
    }
  });
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v579 = $args[0];
  ESLVal _v578 = $args[1];
  ESLVal _v577 = $args[2];
  ESLVal _v576 = $args[3];
  ESLVal _v575 = $args[4];
  ESLVal _v574 = $args[5];
  ESLVal _v573 = $args[6];
  ESLVal _v572 = $args[7];
  {ESLVal _v56 = _v578;
        
        switch(_v56.termName) {
        case "PAdd": {ESLVal $283 = _v56.termRef(0);
          ESLVal $282 = _v56.termRef(1);
          ESLVal $281 = _v56.termRef(2);
          
          {ESLVal _v600 = $283;
          
          {ESLVal p1 = $282;
          
          {ESLVal p2 = $281;
          
          return addPatternType.apply(_v600,p1,p2,_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
        }
        }
      case "PApplyType": {ESLVal $280 = _v56.termRef(0);
          ESLVal $279 = _v56.termRef(1);
          ESLVal $278 = _v56.termRef(2);
          
          {ESLVal _v598 = $280;
          
          {ESLVal _v599 = $279;
          
          {ESLVal args = $278;
          
          return applyTypePatternType.apply(_v598,_v599,substTypesEnv.apply(_v573,args),_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
        }
        }
      case "PBool": {ESLVal $277 = _v56.termRef(0);
          ESLVal $276 = _v56.termRef(1);
          
          {ESLVal _v597 = $277;
          
          {ESLVal b = $276;
          
          if(isBoolType.apply(_v577).boolVal)
          return _v572.apply(new ESLVal("BoolType",_v597),_v575);
          else
            return error(new ESLVal("TypeError",_v597,new ESLVal("type mismatch: Bool and ").add(ppType.apply(_v577,_v573))));
        }
        }
        }
      case "PBagCons": {ESLVal $275 = _v56.termRef(0);
          ESLVal $274 = _v56.termRef(1);
          ESLVal $273 = _v56.termRef(2);
          
          {ESLVal _v594 = $275;
          
          {ESLVal hd = $274;
          
          {ESLVal tl = $273;
          
          return bagConsPatternType.apply(_v594,hd,tl,_v577,_v576,_v575,_v574,_v573,new ESLVal(new Function(new ESLVal("fun284"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v596 = $args[0];
          ESLVal _v595 = $args[1];
          return _v572.apply(new ESLVal("ListType",_v594,_v596),_v595);
            }
          }));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $272 = _v56.termRef(0);
          ESLVal $271 = _v56.termRef(1);
          ESLVal $270 = _v56.termRef(2);
          
          {ESLVal _v591 = $272;
          
          {ESLVal hd = $271;
          
          {ESLVal tl = $270;
          
          return setConsPatternType.apply(_v591,hd,tl,_v577,_v576,_v575,_v574,_v573,new ESLVal(new Function(new ESLVal("fun285"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v593 = $args[0];
          ESLVal _v592 = $args[1];
          return _v572.apply(new ESLVal("ListType",_v591,_v593),_v592);
            }
          }));
        }
        }
        }
        }
      case "PCons": {ESLVal $269 = _v56.termRef(0);
          ESLVal $268 = _v56.termRef(1);
          ESLVal $267 = _v56.termRef(2);
          
          {ESLVal _v588 = $269;
          
          {ESLVal hd = $268;
          
          {ESLVal tl = $267;
          
          return consPatternType.apply(_v588,hd,tl,_v577,_v576,_v575,_v574,_v573,new ESLVal(new Function(new ESLVal("fun286"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v590 = $args[0];
          ESLVal _v589 = $args[1];
          return _v572.apply(new ESLVal("ListType",_v588,_v590),_v589);
            }
          }));
        }
        }
        }
        }
      case "PNil": {ESLVal $266 = _v56.termRef(0);
          
          {ESLVal _v587 = $266;
          
          return nilType.apply(_v587,_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
      case "PNull": {ESLVal $265 = _v56.termRef(0);
          
          {ESLVal _v586 = $265;
          
          return _v572.apply(_v577,_v575);
        }
        }
      case "PEmptyBag": {ESLVal $264 = _v56.termRef(0);
          
          {ESLVal _v585 = $264;
          
          return emptyBagType.apply(_v585,_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
      case "PEmptySet": {ESLVal $263 = _v56.termRef(0);
          
          {ESLVal _v584 = $263;
          
          return emptySetType.apply(_v584,_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
      case "PInt": {ESLVal $262 = _v56.termRef(0);
          ESLVal $261 = _v56.termRef(1);
          
          {ESLVal _v583 = $262;
          
          {ESLVal n = $261;
          
          if(isIntType.apply(_v577).boolVal)
          return _v572.apply(new ESLVal("IntType",_v583),_v575);
          else
            return error(new ESLVal("TypeError",_v583,new ESLVal("type mismatch: Int and ").add(ppType.apply(_v577,_v573))));
        }
        }
        }
      case "PVar": {ESLVal $260 = _v56.termRef(0);
          ESLVal $259 = _v56.termRef(1);
          ESLVal $258 = _v56.termRef(2);
          
          {ESLVal _v582 = $260;
          
          {ESLVal n = $259;
          
          {ESLVal pt = $258;
          
          return _v572.apply(_v577,ESLVal.list(new ESLVal("Map",n,_v577)).add(_v575));
        }
        }
        }
        }
      case "PStr": {ESLVal $257 = _v56.termRef(0);
          ESLVal $256 = _v56.termRef(1);
          
          {ESLVal _v581 = $257;
          
          {ESLVal s = $256;
          
          if(isStrType.apply(_v577).boolVal)
          return _v572.apply(new ESLVal("StrType",_v581),_v575);
          else
            return error(new ESLVal("TypeError",_v581,new ESLVal("type mismatch: Str and ").add(ppType.apply(_v577,_v573))));
        }
        }
        }
      case "PTerm": {ESLVal $255 = _v56.termRef(0);
          ESLVal $254 = _v56.termRef(1);
          ESLVal $253 = _v56.termRef(2);
          ESLVal $252 = _v56.termRef(3);
          
          {ESLVal _v580 = $255;
          
          {ESLVal n = $254;
          
          {ESLVal ts = $253;
          
          {ESLVal ps = $252;
          
          return termPatternType.apply(_v580,n,substTypesEnv.apply(_v573,ts),ps,_v577,_v576,_v575,_v574,_v573,_v572);
        }
        }
        }
        }
        }
        default: {ESLVal _v601 = _v56;
          
          return error(new ESLVal("TypeError",_v579,new ESLVal("unknown type of pattern: ").add(_v601)));
        }
      }
      }
    }
  });
  private static ESLVal addPatternType = new ESLVal(new Function(new ESLVal("addPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v542 = $args[0];
  ESLVal _v541 = $args[1];
  ESLVal _v540 = $args[2];
  ESLVal _v539 = $args[3];
  ESLVal _v538 = $args[4];
  ESLVal _v537 = $args[5];
  ESLVal _v536 = $args[6];
  ESLVal _v535 = $args[7];
  ESLVal _v534 = $args[8];
  return patternType.apply(_v542,_v541,_v539,_v538,_v537,_v536,_v535,new ESLVal(new Function(new ESLVal("fun287"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v544 = $args[0];
        ESLVal _v543 = $args[1];
        return patternType.apply(_v542,_v540,_v539,_v538,_v543,_v536,_v535,new ESLVal(new Function(new ESLVal("fun288"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v546 = $args[0];
              ESLVal _v545 = $args[1];
              {ESLVal _v53 = _v539;
                    
                    switch(_v53.termName) {
                    case "ListType": {ESLVal $214 = _v53.termRef(0);
                      ESLVal $213 = _v53.termRef(1);
                      
                      {ESLVal tl = $214;
                      
                      {ESLVal t = $213;
                      
                      {ESLVal _v55 = _v541;
                      ESLVal _v54 = _v540;
                      
                      switch(_v55.termName) {
                      case "PCons": {ESLVal $247 = _v55.termRef(0);
                        ESLVal $246 = _v55.termRef(1);
                        ESLVal $245 = _v55.termRef(2);
                        
                        switch($245.termName) {
                        case "PNil": {ESLVal $248 = $245.termRef(0);
                          
                          switch(_v54.termName) {
                          case "PVar": {ESLVal $251 = _v54.termRef(0);
                            ESLVal $250 = _v54.termRef(1);
                            ESLVal $249 = _v54.termRef(2);
                            
                            {ESLVal l1 = $247;
                            
                            {ESLVal p = $246;
                            
                            {ESLVal l3 = $248;
                            
                            {ESLVal l4 = $251;
                            
                            {ESLVal n2 = $250;
                            
                            {ESLVal t2 = $249;
                            
                            return _v534.apply(_v539,_v545);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v566 = _v55;
                            
                            {ESLVal _v567 = _v54;
                            
                            return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v568 = _v55;
                          
                          {ESLVal _v569 = _v54;
                          
                          return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PVar": {ESLVal $230 = _v55.termRef(0);
                        ESLVal $229 = _v55.termRef(1);
                        ESLVal $228 = _v55.termRef(2);
                        
                        switch(_v54.termName) {
                        case "PCons": {ESLVal $243 = _v54.termRef(0);
                          ESLVal $242 = _v54.termRef(1);
                          ESLVal $241 = _v54.termRef(2);
                          
                          switch($241.termName) {
                          case "PNil": {ESLVal $244 = $241.termRef(0);
                            
                            {ESLVal l1 = $230;
                            
                            {ESLVal n = $229;
                            
                            {ESLVal _v561 = $228;
                            
                            {ESLVal l2 = $243;
                            
                            {ESLVal p = $242;
                            
                            {ESLVal l3 = $244;
                            
                            return _v534.apply(_v539,_v545);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v562 = _v55;
                            
                            {ESLVal _v563 = _v54;
                            
                            return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                      case "PAdd": {ESLVal $233 = _v54.termRef(0);
                          ESLVal $232 = _v54.termRef(1);
                          ESLVal $231 = _v54.termRef(2);
                          
                          switch($232.termName) {
                          case "PCons": {ESLVal $236 = $232.termRef(0);
                            ESLVal $235 = $232.termRef(1);
                            ESLVal $234 = $232.termRef(2);
                            
                            switch($234.termName) {
                            case "PNil": {ESLVal $237 = $234.termRef(0);
                              
                              switch($231.termName) {
                              case "PVar": {ESLVal $240 = $231.termRef(0);
                                ESLVal $239 = $231.termRef(1);
                                ESLVal $238 = $231.termRef(2);
                                
                                {ESLVal l1 = $230;
                                
                                {ESLVal n1 = $229;
                                
                                {ESLVal t1 = $228;
                                
                                {ESLVal l2 = $233;
                                
                                {ESLVal l3 = $236;
                                
                                {ESLVal p = $235;
                                
                                {ESLVal l5 = $237;
                                
                                {ESLVal l6 = $240;
                                
                                {ESLVal n3 = $239;
                                
                                {ESLVal t3 = $238;
                                
                                return _v534.apply(_v539,_v545);
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
                              default: {ESLVal _v555 = _v55;
                                
                                {ESLVal _v556 = _v54;
                                
                                return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v557 = _v55;
                              
                              {ESLVal _v558 = _v54;
                              
                              return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v559 = _v55;
                            
                            {ESLVal _v560 = _v54;
                            
                            return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v564 = _v55;
                          
                          {ESLVal _v565 = _v54;
                          
                          return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PAdd": {ESLVal $217 = _v55.termRef(0);
                        ESLVal $216 = _v55.termRef(1);
                        ESLVal $215 = _v55.termRef(2);
                        
                        switch($216.termName) {
                        case "PVar": {ESLVal $220 = $216.termRef(0);
                          ESLVal $219 = $216.termRef(1);
                          ESLVal $218 = $216.termRef(2);
                          
                          switch($215.termName) {
                          case "PCons": {ESLVal $223 = $215.termRef(0);
                            ESLVal $222 = $215.termRef(1);
                            ESLVal $221 = $215.termRef(2);
                            
                            switch($221.termName) {
                            case "PNil": {ESLVal $224 = $221.termRef(0);
                              
                              switch(_v54.termName) {
                              case "PVar": {ESLVal $227 = _v54.termRef(0);
                                ESLVal $226 = _v54.termRef(1);
                                ESLVal $225 = _v54.termRef(2);
                                
                                {ESLVal l1 = $217;
                                
                                {ESLVal l2 = $220;
                                
                                {ESLVal n1 = $219;
                                
                                {ESLVal t1 = $218;
                                
                                {ESLVal l3 = $223;
                                
                                {ESLVal p = $222;
                                
                                {ESLVal l5 = $224;
                                
                                {ESLVal l6 = $227;
                                
                                {ESLVal n3 = $226;
                                
                                {ESLVal t3 = $225;
                                
                                return _v534.apply(_v539,_v545);
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
                              default: {ESLVal _v547 = _v55;
                                
                                {ESLVal _v548 = _v54;
                                
                                return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v549 = _v55;
                              
                              {ESLVal _v550 = _v54;
                              
                              return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v551 = _v55;
                            
                            {ESLVal _v552 = _v54;
                            
                            return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v553 = _v55;
                          
                          {ESLVal _v554 = _v54;
                          
                          return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v570 = _v55;
                        
                        {ESLVal _v571 = _v54;
                        
                        return error(new ESLVal("TypeError",_v542,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $212 = _v53.termRef(0);
                      
                      {ESLVal g = $212;
                      
                      return addPatternType.apply(_v542,_v541,_v540,g.apply(),_v538,_v545,_v536,_v535,_v534);
                    }
                    }
                    default: {ESLVal t = _v53;
                      
                      return error(new ESLVal("TypeError",_v542,new ESLVal("+ expects lists: ").add(ppType.apply(_v539,_v535))));
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
      ESLVal _v529 = $args[0];
  ESLVal _v528 = $args[1];
  ESLVal _v527 = $args[2];
  ESLVal _v526 = $args[3];
  ESLVal _v525 = $args[4];
  ESLVal _v524 = $args[5];
  ESLVal _v523 = $args[6];
  ESLVal _v522 = $args[7];
  ESLVal _v521 = $args[8];
  return patternType.apply(_v529,_v528,_v526,_v525,_v524,_v523,_v522,new ESLVal(new Function(new ESLVal("fun289"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v531 = $args[0];
        ESLVal _v530 = $args[1];
        {ESLVal _v52 = typeNF.apply(_v531,_v522);
              
              switch(_v52.termName) {
              case "TypeFun": {ESLVal $211 = _v52.termRef(0);
                ESLVal $210 = _v52.termRef(1);
                ESLVal $209 = _v52.termRef(2);
                
                {ESLVal fl = $211;
                
                {ESLVal ns = $210;
                
                {ESLVal t = $209;
                
                if(length.apply(_v527).eql(length.apply(ns)).boolVal)
                {ESLVal _v533 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v527).add(_v522),t);
                  
                  if(typeEqual.apply(_v533,_v526).boolVal)
                  return _v521.apply(_v533,_v530);
                  else
                    return error(new ESLVal("TypeError",_v529,new ESLVal("value type ").add(ppType.apply(_v526,_v522).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v533,_v522).add(new ESLVal(" ").add(ppTypeEnv.apply(_v522))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v529,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v527))))));
              }
              }
              }
              }
            case "ForallType": {ESLVal $208 = _v52.termRef(0);
                ESLVal $207 = _v52.termRef(1);
                ESLVal $206 = _v52.termRef(2);
                
                {ESLVal fl = $208;
                
                {ESLVal ns = $207;
                
                {ESLVal t = $206;
                
                if(length.apply(_v527).eql(length.apply(ns)).boolVal)
                {ESLVal _v532 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v527).add(_v522),t);
                  
                  if(typeEqual.apply(_v532,_v526).boolVal)
                  return _v521.apply(_v532,_v530);
                  else
                    return error(new ESLVal("TypeError",_v529,new ESLVal("value type ").add(ppType.apply(_v526,_v522).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v532,_v522).add(new ESLVal(" ").add(ppTypeEnv.apply(_v522))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v529,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v527))))));
              }
              }
              }
              }
              default: {ESLVal t = _v52;
                
                return _v521.apply(t,_v530);
              }
            }
            }
          }
        }));
    }
  });
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v513 = $args[0];
  ESLVal _v512 = $args[1];
  ESLVal _v511 = $args[2];
  ESLVal _v510 = $args[3];
  ESLVal _v509 = $args[4];
  ESLVal _v508 = $args[5];
  ESLVal _v507 = $args[6];
  ESLVal _v506 = $args[7];
  ESLVal _v505 = $args[8];
  ESLVal _v504 = $args[9];
  {ESLVal _v514 = getTermPatternType.apply(_v513,_v512,_v511,_v508,_v507,_v506,_v505);
        
        if(typeEqual.apply(_v514,_v509).boolVal)
        {ESLVal _v50 = typeNF.apply(_v509,_v505);
          
          switch(_v50.termName) {
          case "UnionType": {ESLVal $200 = _v50.termRef(0);
            ESLVal $199 = _v50.termRef(1);
            
            {ESLVal ul = $200;
            
            {ESLVal cs = $199;
            
            { LetRec letrec = new LetRec() {
            ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v515 = $args[0];
              {ESLVal _v51 = _v515;
                    
                    if(_v51.isCons())
                    {ESLVal $201 = _v51.head();
                      ESLVal $202 = _v51.tail();
                      
                      switch($201.termName) {
                      case "TermType": {ESLVal $205 = $201.termRef(0);
                        ESLVal $204 = $201.termRef(1);
                        ESLVal $203 = $201.termRef(2);
                        
                        {ESLVal tl = $205;
                        
                        {ESLVal m = $204;
                        
                        {ESLVal args = $203;
                        
                        {ESLVal _v516 = $202;
                        
                        if(m.eql(_v512).boolVal)
                        return args;
                        else
                          {ESLVal t = $201;
                            
                            {ESLVal _v517 = $202;
                            
                            return getCnstrArgs.apply(_v517);
                          }
                          }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t = $201;
                        
                        {ESLVal _v518 = $202;
                        
                        return getCnstrArgs.apply(_v518);
                      }
                      }
                    }
                    }
                  else if(_v51.isNil())
                    return error(new ESLVal("TypeError",_v513,new ESLVal("cannot find constructor for ").add(_v512)));
                  else return error(new ESLVal("case error at Pos(50076,50335)").add(ESLVal.list(_v51)));
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
            
            if(length.apply(_v510).eql(length.apply(argTypes)).boolVal)
            return patternTypes.apply(_v513,_v510,argTypes,_v508,_v507,_v506,_v505,new ESLVal(new Function(new ESLVal("fun290"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v520 = $args[0];
              ESLVal _v519 = $args[1];
              return _v504.apply(typeNF.apply(_v509,_v505),_v519);
                }
              }));
            else
              return error(new ESLVal("TypeError",_v513,new ESLVal("arity mismatch.")));
          }}
          
          }
          }
          }
          default: {ESLVal t = _v50;
            
            return error(new ESLVal("TypeError",_v513,new ESLVal("expecting a data type: ").add(_v509)));
          }
        }
        }
        else
          return error(new ESLVal("TypeError",_v513,new ESLVal("term pattern type ").add(ppType.apply(_v514,_v505).add(new ESLVal(" does not match supplied value type ").add(ppType.apply(_v509,_v505))))));
      }
    }
  });
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v498 = $args[0];
  ESLVal _v497 = $args[1];
  {ESLVal _v47 = substTypeEnv.apply(_v497,_v498);
        
        switch(_v47.termName) {
        case "ApplyTypeFun": {ESLVal $192 = _v47.termRef(0);
          ESLVal $191 = _v47.termRef(1);
          ESLVal $190 = _v47.termRef(2);
          
          {ESLVal l = $192;
          
          {ESLVal op = $191;
          
          {ESLVal args = $190;
          
          {ESLVal _v49 = typeNF.apply(op,_v497);
          
          switch(_v49.termName) {
          case "TypeFun": {ESLVal $198 = _v49.termRef(0);
            ESLVal $197 = _v49.termRef(1);
            ESLVal $196 = _v49.termRef(2);
            
            {ESLVal _v500 = $198;
            
            {ESLVal ns = $197;
            
            {ESLVal _v501 = $196;
            
            if(length.apply(args).eql(length.apply(ns)).boolVal)
            return typeNF.apply(substTypeEnv.apply(zipTypeEnv.apply(ns,args),_v501),_v497);
            else
              return error(new ESLVal("TypeError",_v500,new ESLVal("function arity error")));
          }
          }
          }
          }
          default: {ESLVal _v502 = _v49;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(typeNF.apply(op,_v497),_v497))));
          }
        }
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $189 = _v47.termRef(0);
          
          {ESLVal f = $189;
          
          return typeNF.apply(f.apply(),_v497);
        }
        }
      case "RecType": {ESLVal $188 = _v47.termRef(0);
          ESLVal $187 = _v47.termRef(1);
          ESLVal $186 = _v47.termRef(2);
          
          {ESLVal l = $188;
          
          {ESLVal n = $187;
          
          {ESLVal _v499 = $186;
          
          return typeNF.apply(substType.apply(new ESLVal("RecType",l,n,_v499),n,_v499),_v497);
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $185 = _v47.termRef(0);
          ESLVal $184 = _v47.termRef(1);
          ESLVal $183 = _v47.termRef(2);
          ESLVal $182 = _v47.termRef(3);
          
          {ESLVal l1 = $185;
          
          {ESLVal parent = $184;
          
          {ESLVal decs1 = $183;
          
          {ESLVal ms1 = $182;
          
          {ESLVal _v48 = typeNF.apply(parent,_v497);
          
          switch(_v48.termName) {
          case "ActType": {ESLVal $195 = _v48.termRef(0);
            ESLVal $194 = _v48.termRef(1);
            ESLVal $193 = _v48.termRef(2);
            
            {ESLVal l2 = $195;
            
            {ESLVal decs2 = $194;
            
            {ESLVal ms2 = $193;
            
            return new ESLVal("ActType",l1,decs2.add(decs1),ms2.add(ms1));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(51652,51787)").add(ESLVal.list(_v48)));
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v503 = _v47;
          
          return _v503;
        }
      }
      }
    }
  });
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v496 = $args[0];
  ESLVal _v495 = $args[1];
  ESLVal _v494 = $args[2];
  ESLVal _v493 = $args[3];
  ESLVal _v492 = $args[4];
  ESLVal _v491 = $args[5];
  ESLVal _v490 = $args[6];
  {ESLVal t = lookupType.apply(_v495,_v491);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v496,new ESLVal("unknown constructor ").add(_v495)));
        else
          if(length.apply(_v494).gre($zero).boolVal)
            return getGenericTermPatternType.apply(_v496,t,_v494,_v493,_v492,_v491,_v490);
            else
              return t;
      }
    }
  });
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v487 = $args[0];
  ESLVal _v486 = $args[1];
  ESLVal _v485 = $args[2];
  ESLVal _v484 = $args[3];
  ESLVal _v483 = $args[4];
  ESLVal _v482 = $args[5];
  ESLVal _v481 = $args[6];
  {ESLVal _v46 = _v486;
        
        switch(_v46.termName) {
        case "RecType": {ESLVal $181 = _v46.termRef(0);
          ESLVal $180 = _v46.termRef(1);
          ESLVal $179 = _v46.termRef(2);
          
          {ESLVal rl = $181;
          
          {ESLVal rn = $180;
          
          {ESLVal rt = $179;
          
          return getGenericTermPatternType.apply(_v487,substType.apply(new ESLVal("RecType",rl,rn,rt),rn,rt),_v485,_v484,_v483,_v482,_v481);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $178 = _v46.termRef(0);
          ESLVal $177 = _v46.termRef(1);
          ESLVal $176 = _v46.termRef(2);
          
          {ESLVal al = $178;
          
          {ESLVal ns = $177;
          
          {ESLVal _v488 = $176;
          
          if(length.apply(ns).eql(length.apply(_v485)).boolVal)
          {ESLVal e = zipTypeEnv.apply(ns,_v485);
            
            return substTypeEnv.apply(e.add(_v481),_v488);
          }
          else
            return error(new ESLVal("TypeError",_v487,new ESLVal("generic constructor mismatch")));
        }
        }
        }
        }
        default: {ESLVal _v489 = _v46;
          
          return error(new ESLVal("TypeError",_v487,new ESLVal("expecting a generic type: ").add(ppType.apply(_v489,_v481))));
        }
      }
      }
    }
  });
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v479 = $args[0];
  ESLVal _v478 = $args[1];
  ESLVal _v477 = $args[2];
  ESLVal _v476 = $args[3];
  ESLVal _v475 = $args[4];
  ESLVal _v474 = $args[5];
  ESLVal _v473 = $args[6];
  {ESLVal _v45 = _v478;
        
        switch(_v45.termName) {
        case "ListType": {ESLVal $175 = _v45.termRef(0);
          ESLVal $174 = _v45.termRef(1);
          
          {ESLVal ltl = $175;
          
          {ESLVal et = $174;
          
          return _v473.apply(new ESLVal("ForallType",_v479,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v479,new ESLVal("VarType",_v479,new ESLVal("T")))),_v476);
        }
        }
        }
      case "TypeClosure": {ESLVal $173 = _v45.termRef(0);
          
          {ESLVal g = $173;
          
          return nilType.apply(_v479,g.apply(),_v477,_v476,_v475,_v474,_v473);
        }
        }
        default: {ESLVal _v480 = _v45;
          
          return error(new ESLVal("TypeError",_v479,new ESLVal("expecting a list type: ").add(ppType.apply(_v480,_v474))));
        }
      }
      }
    }
  });
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v471 = $args[0];
  ESLVal _v470 = $args[1];
  ESLVal _v469 = $args[2];
  ESLVal _v468 = $args[3];
  ESLVal _v467 = $args[4];
  ESLVal _v466 = $args[5];
  ESLVal _v465 = $args[6];
  {ESLVal _v44 = _v470;
        
        switch(_v44.termName) {
        case "BagType": {ESLVal $172 = _v44.termRef(0);
          ESLVal $171 = _v44.termRef(1);
          
          {ESLVal ltl = $172;
          
          {ESLVal et = $171;
          
          return _v465.apply(new ESLVal("ForallType",_v471,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v471,new ESLVal("VarType",_v471,new ESLVal("T")))),_v468);
        }
        }
        }
        default: {ESLVal _v472 = _v44;
          
          return error(new ESLVal("TypeError",_v471,new ESLVal("expecting a bag type: ").add(ppType.apply(_v472,_v466))));
        }
      }
      }
    }
  });
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v463 = $args[0];
  ESLVal _v462 = $args[1];
  ESLVal _v461 = $args[2];
  ESLVal _v460 = $args[3];
  ESLVal _v459 = $args[4];
  ESLVal _v458 = $args[5];
  ESLVal _v457 = $args[6];
  {ESLVal _v43 = _v462;
        
        switch(_v43.termName) {
        case "SetType": {ESLVal $170 = _v43.termRef(0);
          ESLVal $169 = _v43.termRef(1);
          
          {ESLVal ltl = $170;
          
          {ESLVal et = $169;
          
          return _v457.apply(new ESLVal("ForallType",_v463,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v463,new ESLVal("VarType",_v463,new ESLVal("T")))),_v460);
        }
        }
        }
        default: {ESLVal _v464 = _v43;
          
          return error(new ESLVal("TypeError",_v463,new ESLVal("expecting a set type: ").add(ppType.apply(_v464,_v458))));
        }
      }
      }
    }
  });
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v451 = $args[0];
  ESLVal _v450 = $args[1];
  ESLVal _v449 = $args[2];
  ESLVal _v448 = $args[3];
  ESLVal _v447 = $args[4];
  ESLVal _v446 = $args[5];
  ESLVal _v445 = $args[6];
  ESLVal _v444 = $args[7];
  ESLVal _v443 = $args[8];
  {ESLVal _v42 = _v448;
        
        switch(_v42.termName) {
        case "ListType": {ESLVal $168 = _v42.termRef(0);
          ESLVal $167 = _v42.termRef(1);
          
          {ESLVal ltl = $168;
          
          {ESLVal et = $167;
          
          return patternType.apply(_v451,_v450,substTypeEnv.apply(_v444,et),_v447,_v446,_v445,_v444,new ESLVal(new Function(new ESLVal("fun291"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v453 = $args[0];
          ESLVal _v452 = $args[1];
          return patternType.apply(_v451,_v449,_v448,_v447,_v452,_v445,_v444,new ESLVal(new Function(new ESLVal("fun292"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v455 = $args[0];
                ESLVal _v454 = $args[1];
                return _v443.apply(_v453,_v454);
                  }
                }));
            }
          }));
        }
        }
        }
      case "TypeClosure": {ESLVal $166 = _v42.termRef(0);
          
          {ESLVal g = $166;
          
          return consPatternType.apply(_v451,_v450,_v449,g.apply(),_v447,_v446,_v445,_v444,_v443);
        }
        }
        default: {ESLVal _v456 = _v42;
          
          return error(new ESLVal("TypeError",_v451,new ESLVal("expecting a list type: ").add(ppType.apply(_v456,_v444))));
        }
      }
      }
    }
  });
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v437 = $args[0];
  ESLVal _v436 = $args[1];
  ESLVal _v435 = $args[2];
  ESLVal _v434 = $args[3];
  ESLVal _v433 = $args[4];
  ESLVal _v432 = $args[5];
  ESLVal _v431 = $args[6];
  ESLVal _v430 = $args[7];
  ESLVal _v429 = $args[8];
  {ESLVal _v41 = _v434;
        
        switch(_v41.termName) {
        case "BagType": {ESLVal $165 = _v41.termRef(0);
          ESLVal $164 = _v41.termRef(1);
          
          {ESLVal ltl = $165;
          
          {ESLVal et = $164;
          
          return patternType.apply(_v437,_v436,substTypeEnv.apply(_v430,et),_v433,_v432,_v431,_v430,new ESLVal(new Function(new ESLVal("fun293"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v439 = $args[0];
          ESLVal _v438 = $args[1];
          return patternType.apply(_v437,_v435,_v434,_v433,_v438,_v431,_v430,new ESLVal(new Function(new ESLVal("fun294"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v441 = $args[0];
                ESLVal _v440 = $args[1];
                return _v429.apply(_v439,_v440);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v442 = _v41;
          
          return error(new ESLVal("TypeError",_v437,new ESLVal("expecting a bag type: ").add(ppType.apply(_v442,_v430))));
        }
      }
      }
    }
  });
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v423 = $args[0];
  ESLVal _v422 = $args[1];
  ESLVal _v421 = $args[2];
  ESLVal _v420 = $args[3];
  ESLVal _v419 = $args[4];
  ESLVal _v418 = $args[5];
  ESLVal _v417 = $args[6];
  ESLVal _v416 = $args[7];
  ESLVal _v415 = $args[8];
  {ESLVal _v40 = _v420;
        
        switch(_v40.termName) {
        case "SetType": {ESLVal $163 = _v40.termRef(0);
          ESLVal $162 = _v40.termRef(1);
          
          {ESLVal ltl = $163;
          
          {ESLVal et = $162;
          
          return patternType.apply(_v423,_v422,substTypeEnv.apply(_v416,et),_v419,_v418,_v417,_v416,new ESLVal(new Function(new ESLVal("fun295"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v425 = $args[0];
          ESLVal _v424 = $args[1];
          return patternType.apply(_v423,_v421,_v420,_v419,_v424,_v417,_v416,new ESLVal(new Function(new ESLVal("fun296"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v427 = $args[0];
                ESLVal _v426 = $args[1];
                return _v415.apply(_v425,_v426);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v428 = _v40;
          
          return error(new ESLVal("TypeError",_v423,new ESLVal("expecting a set type: ").add(ppType.apply(_v428,_v416))));
        }
      }
      }
    }
  });
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v413 = $args[0];
  ESLVal _v412 = $args[1];
  ESLVal _v411 = $args[2];
  ESLVal _v410 = $args[3];
  ESLVal _v409 = $args[4];
  ESLVal _v408 = $args[5];
  ESLVal _v407 = $args[6];
  ESLVal _v406 = $args[7];
  {ESLVal _v39 = _v411;
        
        switch(_v39.strVal) {
        case "+": return plusExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "-": return subExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "*": return mulExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "/": return divExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case ":": return consExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "=": return eqlExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "<>": return neqlExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "and": return andExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "andalso": return andExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "or": return orExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "orelse": return orExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case ">": return compareExpType.apply(_v413,_v412,new ESLVal(">"),_v410,_v409,_v408,_v407,_v406);
      case ">=": return compareExpType.apply(_v413,_v412,new ESLVal(">="),_v410,_v409,_v408,_v407,_v406);
      case "<": return compareExpType.apply(_v413,_v412,new ESLVal("<"),_v410,_v409,_v408,_v407,_v406);
      case "<=": return compareExpType.apply(_v413,_v412,new ESLVal("<="),_v410,_v409,_v408,_v407,_v406);
      case "..": return dotDotExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "%": return percentExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
      case "@": return atExpType.apply(_v413,_v412,_v410,_v409,_v408,_v407,_v406);
        default: {ESLVal _v414 = _v39;
          
          return error(new ESLVal("TypeError",_v413,new ESLVal("unknown operator: ").add(_v414)));
        }
      }
      }
    }
  });
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v405 = $args[0];
  ESLVal _v404 = $args[1];
  ESLVal _v403 = $args[2];
  ESLVal _v402 = $args[3];
  ESLVal _v401 = $args[4];
  ESLVal _v400 = $args[5];
  ESLVal _v399 = $args[6];
  {ESLVal t1 = expType.apply(_v404,_v402,_v401,_v400,_v399);
        ESLVal t2 = expType.apply(_v403,_v402,_v401,_v400,_v399);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v405,new ESLVal("and expects boolean arguments: ").add(ppType.apply(t1,_v399).add(new ESLVal(" ").add(ppType.apply(t2,_v399))))));
      }
    }
  });
  private static ESLVal atExpType = new ESLVal(new Function(new ESLVal("atExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v398 = $args[0];
  ESLVal _v397 = $args[1];
  ESLVal _v396 = $args[2];
  ESLVal _v395 = $args[3];
  ESLVal _v394 = $args[4];
  ESLVal _v393 = $args[5];
  ESLVal _v392 = $args[6];
  {ESLVal t1 = expType.apply(_v397,_v395,_v394,_v393,_v392);
        ESLVal t2 = expType.apply(_v396,_v395,_v394,_v393,_v392);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v398,new ESLVal("@ expects arguments to be same type: ").add(ppType.apply(t1,_v392).add(new ESLVal(" ").add(ppType.apply(t2,_v392))))));
      }
    }
  });
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v391 = $args[0];
  ESLVal _v390 = $args[1];
  ESLVal _v389 = $args[2];
  ESLVal _v388 = $args[3];
  ESLVal _v387 = $args[4];
  ESLVal _v386 = $args[5];
  ESLVal _v385 = $args[6];
  {ESLVal t1 = expType.apply(_v390,_v388,_v387,_v386,_v385);
        ESLVal t2 = expType.apply(_v389,_v388,_v387,_v386,_v385);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("ListType",_v391,new ESLVal("IntType",_v391));
        else
          return error(new ESLVal("TypeError",_v391,new ESLVal(".. expects integer arguments: ").add(ppType.apply(t1,_v385).add(new ESLVal(" ").add(ppType.apply(t2,_v385))))));
      }
    }
  });
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v384 = $args[0];
  ESLVal _v383 = $args[1];
  ESLVal _v382 = $args[2];
  ESLVal _v381 = $args[3];
  ESLVal _v380 = $args[4];
  ESLVal _v379 = $args[5];
  ESLVal _v378 = $args[6];
  {ESLVal t1 = expType.apply(_v383,_v381,_v380,_v379,_v378);
        ESLVal t2 = expType.apply(_v382,_v381,_v380,_v379,_v378);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("IntType",_v384);
        else
          return error(new ESLVal("TypeError",_v384,new ESLVal("% expects integer arguments: ").add(ppType.apply(t1,_v378).add(new ESLVal(" ").add(ppType.apply(t2,_v378))))));
      }
    }
  });
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v377 = $args[0];
  ESLVal _v376 = $args[1];
  ESLVal _v375 = $args[2];
  ESLVal _v374 = $args[3];
  ESLVal _v373 = $args[4];
  ESLVal _v372 = $args[5];
  ESLVal _v371 = $args[6];
  ESLVal _v370 = $args[7];
  {ESLVal t1 = expType.apply(_v376,_v373,_v372,_v371,_v370);
        ESLVal t2 = expType.apply(_v374,_v373,_v372,_v371,_v370);
        
        if(isNumType.apply(t1).and(isNumType.apply(t2)).boolVal)
        return new ESLVal("BoolType",_v377);
        else
          return error(new ESLVal("TypeError",_v377,_v375.add(new ESLVal(" expects numeric arguments: ").add(ppType.apply(t1,_v370).add(new ESLVal(" ").add(ppType.apply(t2,_v370)))))));
      }
    }
  });
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v369 = $args[0];
  ESLVal _v368 = $args[1];
  ESLVal _v367 = $args[2];
  ESLVal _v366 = $args[3];
  ESLVal _v365 = $args[4];
  ESLVal _v364 = $args[5];
  ESLVal _v363 = $args[6];
  {ESLVal t1 = expType.apply(_v368,_v366,_v365,_v364,_v363);
        ESLVal t2 = expType.apply(_v367,_v366,_v365,_v364,_v363);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v369,new ESLVal("or expects boolean arguments: ").add(ppType.apply(t1,_v363).add(new ESLVal(" ").add(ppType.apply(t2,_v363))))));
      }
    }
  });
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v362 = $args[0];
  ESLVal _v361 = $args[1];
  ESLVal _v360 = $args[2];
  ESLVal _v359 = $args[3];
  ESLVal _v358 = $args[4];
  ESLVal _v357 = $args[5];
  ESLVal _v356 = $args[6];
  {ESLVal t1 = expType.apply(_v361,_v359,_v358,_v357,_v356);
        ESLVal t2 = expType.apply(_v360,_v359,_v358,_v357,_v356);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v362);
        else
          return error(new ESLVal("TypeError",_v362,new ESLVal("= expects types to agree: ").add(ppType.apply(t1,_v356).add(new ESLVal(" <> ").add(ppType.apply(t2,_v356))))));
      }
    }
  });
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v355 = $args[0];
  ESLVal _v354 = $args[1];
  ESLVal _v353 = $args[2];
  ESLVal _v352 = $args[3];
  ESLVal _v351 = $args[4];
  ESLVal _v350 = $args[5];
  ESLVal _v349 = $args[6];
  {ESLVal t1 = expType.apply(_v354,_v352,_v351,_v350,_v349);
        ESLVal t2 = expType.apply(_v353,_v352,_v351,_v350,_v349);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v355);
        else
          return error(new ESLVal("TypeError",_v355,new ESLVal("<> expects types to agree: ").add(ppType.apply(t1,_v349).add(new ESLVal(" <> ").add(ppType.apply(t2,_v349))))));
      }
    }
  });
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v347 = $args[0];
  ESLVal _v346 = $args[1];
  ESLVal _v345 = $args[2];
  ESLVal _v344 = $args[3];
  ESLVal _v343 = $args[4];
  ESLVal _v342 = $args[5];
  ESLVal _v341 = $args[6];
  {ESLVal t1 = typeNF.apply(expType.apply(_v346,_v344,_v343,_v342,_v341),_v341);
        ESLVal t2 = typeNF.apply(expType.apply(_v345,_v344,_v343,_v342,_v341),_v341);
        
        {ESLVal _v38 = t2;
        ESLVal _v37 = t1;
        
        switch(_v38.termName) {
        case "ListType": {ESLVal $161 = _v38.termRef(0);
          ESLVal $160 = _v38.termRef(1);
          
          {ESLVal _v348 = $161;
          
          {ESLVal elementType = $160;
          
          {ESLVal headType = _v37;
          
          if(subType.apply(headType,elementType).boolVal)
          return t2;
          else
            return error(new ESLVal("TypeError",_v348,new ESLVal(": expects head type ").add(ppType.apply(headType,_v341).add(new ESLVal(" and element type ").add(ppType.apply(elementType,_v341).add(new ESLVal(" to agree")))))));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(60810,61091)").add(ESLVal.list(_v38,_v37)));
      }
      }
      }
    }
  });
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v334 = $args[0];
  ESLVal _v333 = $args[1];
  ESLVal _v332 = $args[2];
  ESLVal _v331 = $args[3];
  ESLVal _v330 = $args[4];
  ESLVal _v329 = $args[5];
  ESLVal _v328 = $args[6];
  {ESLVal t1 = expType.apply(_v333,_v331,_v330,_v329,_v328);
        ESLVal t2 = expType.apply(_v332,_v331,_v330,_v329,_v328);
        
        {ESLVal _v36 = t1;
        ESLVal _v35 = t2;
        
        switch(_v36.termName) {
        case "IntType": {ESLVal $158 = _v36.termRef(0);
          
          switch(_v35.termName) {
          case "IntType": {ESLVal $159 = _v35.termRef(0);
            
            {ESLVal l1 = $158;
            
            {ESLVal l2 = $159;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v337 = _v36;
            
            {ESLVal _v338 = _v35;
            
            return error(new ESLVal("TypeError",_v334,new ESLVal("incomptible types for /: ").add(ppType.apply(_v337,_v328).add(new ESLVal(" and ").add(ppType.apply(_v338,_v328))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $156 = _v36.termRef(0);
          
          switch(_v35.termName) {
          case "FloatType": {ESLVal $157 = _v35.termRef(0);
            
            {ESLVal l1 = $156;
            
            {ESLVal l2 = $157;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v335 = _v36;
            
            {ESLVal _v336 = _v35;
            
            return error(new ESLVal("TypeError",_v334,new ESLVal("incomptible types for /: ").add(ppType.apply(_v335,_v328).add(new ESLVal(" and ").add(ppType.apply(_v336,_v328))))));
          }
          }
        }
        }
        default: {ESLVal _v339 = _v36;
          
          {ESLVal _v340 = _v35;
          
          return error(new ESLVal("TypeError",_v334,new ESLVal("incomptible types for /: ").add(ppType.apply(_v339,_v328).add(new ESLVal(" and ").add(ppType.apply(_v340,_v328))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v321 = $args[0];
  ESLVal _v320 = $args[1];
  ESLVal _v319 = $args[2];
  ESLVal _v318 = $args[3];
  ESLVal _v317 = $args[4];
  ESLVal _v316 = $args[5];
  ESLVal _v315 = $args[6];
  {ESLVal t1 = expType.apply(_v320,_v318,_v317,_v316,_v315);
        ESLVal t2 = expType.apply(_v319,_v318,_v317,_v316,_v315);
        
        {ESLVal _v34 = t1;
        ESLVal _v33 = t2;
        
        switch(_v34.termName) {
        case "IntType": {ESLVal $153 = _v34.termRef(0);
          
          switch(_v33.termName) {
          case "IntType": {ESLVal $155 = _v33.termRef(0);
            
            {ESLVal l1 = $153;
            
            {ESLVal l2 = $155;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $154 = _v33.termRef(0);
            
            {ESLVal l1 = $153;
            
            {ESLVal l2 = $154;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v324 = _v34;
            
            {ESLVal _v325 = _v33;
            
            return error(new ESLVal("TypeError",_v321,new ESLVal("incomptible types for *: ").add(ppType.apply(_v324,_v315).add(new ESLVal(" and ").add(ppType.apply(_v325,_v315))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $150 = _v34.termRef(0);
          
          switch(_v33.termName) {
          case "FloatType": {ESLVal $152 = _v33.termRef(0);
            
            {ESLVal l1 = $150;
            
            {ESLVal l2 = $152;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $151 = _v33.termRef(0);
            
            {ESLVal l1 = $150;
            
            {ESLVal l2 = $151;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v322 = _v34;
            
            {ESLVal _v323 = _v33;
            
            return error(new ESLVal("TypeError",_v321,new ESLVal("incomptible types for *: ").add(ppType.apply(_v322,_v315).add(new ESLVal(" and ").add(ppType.apply(_v323,_v315))))));
          }
          }
        }
        }
        default: {ESLVal _v326 = _v34;
          
          {ESLVal _v327 = _v33;
          
          return error(new ESLVal("TypeError",_v321,new ESLVal("incomptible types for *: ").add(ppType.apply(_v326,_v315).add(new ESLVal(" and ").add(ppType.apply(_v327,_v315))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v308 = $args[0];
  ESLVal _v307 = $args[1];
  ESLVal _v306 = $args[2];
  ESLVal _v305 = $args[3];
  ESLVal _v304 = $args[4];
  ESLVal _v303 = $args[5];
  ESLVal _v302 = $args[6];
  {ESLVal t1 = expType.apply(_v307,_v305,_v304,_v303,_v302);
        ESLVal t2 = expType.apply(_v306,_v305,_v304,_v303,_v302);
        
        {ESLVal _v32 = t1;
        ESLVal _v31 = t2;
        
        switch(_v32.termName) {
        case "IntType": {ESLVal $147 = _v32.termRef(0);
          
          switch(_v31.termName) {
          case "IntType": {ESLVal $149 = _v31.termRef(0);
            
            {ESLVal l1 = $147;
            
            {ESLVal l2 = $149;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $148 = _v31.termRef(0);
            
            {ESLVal l1 = $147;
            
            {ESLVal l2 = $148;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v311 = _v32;
            
            {ESLVal _v312 = _v31;
            
            return error(new ESLVal("TypeError",_v308,new ESLVal("incomptible types for -: ").add(ppType.apply(_v311,_v302).add(new ESLVal(" and ").add(ppType.apply(_v312,_v302))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $144 = _v32.termRef(0);
          
          switch(_v31.termName) {
          case "FloatType": {ESLVal $146 = _v31.termRef(0);
            
            {ESLVal l1 = $144;
            
            {ESLVal l2 = $146;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $145 = _v31.termRef(0);
            
            {ESLVal l1 = $144;
            
            {ESLVal l2 = $145;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v309 = _v32;
            
            {ESLVal _v310 = _v31;
            
            return error(new ESLVal("TypeError",_v308,new ESLVal("incomptible types for -: ").add(ppType.apply(_v309,_v302).add(new ESLVal(" and ").add(ppType.apply(_v310,_v302))))));
          }
          }
        }
        }
        default: {ESLVal _v313 = _v32;
          
          {ESLVal _v314 = _v31;
          
          return error(new ESLVal("TypeError",_v308,new ESLVal("incomptible types for -: ").add(ppType.apply(_v313,_v302).add(new ESLVal(" and ").add(ppType.apply(_v314,_v302))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v267 = $args[0];
  ESLVal _v266 = $args[1];
  ESLVal _v265 = $args[2];
  ESLVal _v264 = $args[3];
  ESLVal _v263 = $args[4];
  ESLVal _v262 = $args[5];
  ESLVal _v261 = $args[6];
  {ESLVal t1 = expType.apply(_v266,_v264,_v263,_v262,_v261);
        ESLVal t2 = expType.apply(_v265,_v264,_v263,_v262,_v261);
        
        {ESLVal _v30 = t1;
        ESLVal _v29 = t2;
        
        switch(_v30.termName) {
        case "StrType": {ESLVal $143 = _v30.termRef(0);
          
          {ESLVal _v296 = $143;
          
          {ESLVal _v297 = _v29;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $141 = _v30.termRef(0);
          
          switch(_v29.termName) {
          case "IntType": {ESLVal $142 = _v29.termRef(0);
            
            {ESLVal l1 = $141;
            
            {ESLVal l2 = $142;
            
            return t1;
          }
          }
          }
          default: switch(_v29.termName) {
            case "StrType": {ESLVal $130 = _v29.termRef(0);
              
              {ESLVal _v292 = _v30;
              
              {ESLVal _v293 = $130;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v294 = _v30;
              
              {ESLVal _v295 = _v29;
              
              return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v294,_v261).add(new ESLVal(" and ").add(ppType.apply(_v295,_v261))))));
            }
            }
          }
        }
        }
      case "FloatType": {ESLVal $139 = _v30.termRef(0);
          
          switch(_v29.termName) {
          case "FloatType": {ESLVal $140 = _v29.termRef(0);
            
            {ESLVal l1 = $139;
            
            {ESLVal l2 = $140;
            
            return t1;
          }
          }
          }
          default: switch(_v29.termName) {
            case "StrType": {ESLVal $130 = _v29.termRef(0);
              
              {ESLVal _v288 = _v30;
              
              {ESLVal _v289 = $130;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v290 = _v30;
              
              {ESLVal _v291 = _v29;
              
              return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v290,_v261).add(new ESLVal(" and ").add(ppType.apply(_v291,_v261))))));
            }
            }
          }
        }
        }
      case "ListType": {ESLVal $136 = _v30.termRef(0);
          ESLVal $135 = _v30.termRef(1);
          
          switch(_v29.termName) {
          case "ListType": {ESLVal $138 = _v29.termRef(0);
            ESLVal $137 = _v29.termRef(1);
            
            {ESLVal l1 = $136;
            
            {ESLVal _v278 = $135;
            
            {ESLVal l2 = $138;
            
            {ESLVal _v279 = $137;
            
            if(typeEqual.apply(_v278,_v279).boolVal)
            return new ESLVal("ListType",l1,_v278);
            else
              switch(_v29.termName) {
                case "StrType": {ESLVal $130 = _v29.termRef(0);
                  
                  {ESLVal _v280 = _v30;
                  
                  {ESLVal _v281 = $130;
                  
                  return _v279;
                }
                }
                }
                default: {ESLVal _v282 = _v30;
                  
                  {ESLVal _v283 = _v29;
                  
                  return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v282,_v261).add(new ESLVal(" and ").add(ppType.apply(_v283,_v261))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v29.termName) {
            case "StrType": {ESLVal $130 = _v29.termRef(0);
              
              {ESLVal _v284 = _v30;
              
              {ESLVal _v285 = $130;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v286 = _v30;
              
              {ESLVal _v287 = _v29;
              
              return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v286,_v261).add(new ESLVal(" and ").add(ppType.apply(_v287,_v261))))));
            }
            }
          }
        }
        }
      case "SetType": {ESLVal $132 = _v30.termRef(0);
          ESLVal $131 = _v30.termRef(1);
          
          switch(_v29.termName) {
          case "SetType": {ESLVal $134 = _v29.termRef(0);
            ESLVal $133 = _v29.termRef(1);
            
            {ESLVal l1 = $132;
            
            {ESLVal _v268 = $131;
            
            {ESLVal l2 = $134;
            
            {ESLVal _v269 = $133;
            
            if(typeEqual.apply(_v268,_v269).boolVal)
            return new ESLVal("SetType",l1,_v268);
            else
              switch(_v29.termName) {
                case "StrType": {ESLVal $130 = _v29.termRef(0);
                  
                  {ESLVal _v270 = _v30;
                  
                  {ESLVal _v271 = $130;
                  
                  return _v269;
                }
                }
                }
                default: {ESLVal _v272 = _v30;
                  
                  {ESLVal _v273 = _v29;
                  
                  return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v272,_v261).add(new ESLVal(" and ").add(ppType.apply(_v273,_v261))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v29.termName) {
            case "StrType": {ESLVal $130 = _v29.termRef(0);
              
              {ESLVal _v274 = _v30;
              
              {ESLVal _v275 = $130;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v276 = _v30;
              
              {ESLVal _v277 = _v29;
              
              return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v276,_v261).add(new ESLVal(" and ").add(ppType.apply(_v277,_v261))))));
            }
            }
          }
        }
        }
        default: switch(_v29.termName) {
          case "StrType": {ESLVal $130 = _v29.termRef(0);
            
            {ESLVal _v298 = _v30;
            
            {ESLVal _v299 = $130;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v300 = _v30;
            
            {ESLVal _v301 = _v29;
            
            return error(new ESLVal("TypeError",_v267,new ESLVal("incomptible types for +: ").add(ppType.apply(_v300,_v261).add(new ESLVal(" and ").add(ppType.apply(_v301,_v261))))));
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
      ESLVal _v256 = $args[0];
  ESLVal _v255 = $args[1];
  ESLVal _v254 = $args[2];
  ESLVal _v253 = $args[3];
  ESLVal _v252 = $args[4];
  ESLVal _v251 = $args[5];
  ESLVal _v250 = $args[6];
  {ESLVal _v258 = substTypesEnv.apply(_v250,_v254);
        ESLVal _v257 = expType.apply(_v255,_v253,_v252,_v251,_v250);
        
        {ESLVal _v28 = _v257;
        
        switch(_v28.termName) {
        case "ForallType": {ESLVal $129 = _v28.termRef(0);
          ESLVal $128 = _v28.termRef(1);
          ESLVal $127 = _v28.termRef(2);
          
          {ESLVal l1 = $129;
          
          {ESLVal ns = $128;
          
          {ESLVal _v259 = $127;
          
          if(length.apply(ns).eql(length.apply(_v258)).boolVal)
          {ESLVal env = zipTypeEnv.apply(ns,_v258);
            
            return substTypeEnv.apply(env.add(_v252),_v259);
          }
          else
            return error(new ESLVal("TypeError",_v256,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v258))))));
        }
        }
        }
        }
        default: {ESLVal _v260 = _v28;
          
          return error(new ESLVal("TypeError",_v256,new ESLVal("expecting a universal type: ").add(_v260)));
        }
      }
      }
      }
    }
  });
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v249 = $args[0];
  ESLVal _v248 = $args[1];
  ESLVal _v247 = $args[2];
  ESLVal _v246 = $args[3];
  ESLVal _v245 = $args[4];
  return map.apply(new ESLVal(new Function(new ESLVal("fun297"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expType.apply(e,_v248,_v247,_v246,_v245);
          }
        }),_v249);
    }
  });
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v244 = $args[0];
  ESLVal _v243 = $args[1];
  ESLVal _v242 = $args[2];
  ESLVal _v241 = $args[3];
  ESLVal _v240 = $args[4];
  ESLVal _v239 = $args[5];
  ESLVal _v238 = $args[6];
  {ESLVal _v27 = typeNF.apply(expType.apply(_v243,_v241,_v240,_v239,_v238),_v238);
        
        switch(_v27.termName) {
        case "FunType": {ESLVal $126 = _v27.termRef(0);
          ESLVal $125 = _v27.termRef(1);
          ESLVal $124 = _v27.termRef(2);
          
          {ESLVal l1 = $126;
          
          {ESLVal domain = $125;
          
          {ESLVal range = $124;
          
          {ESLVal supplied = expTypes.apply(_v242,_v241,_v240,_v239,_v238);
          
          if(length.apply(domain).eql(length.apply(supplied)).boolVal)
          if(subTypes.apply(supplied,domain).boolVal)
            return range;
            else
              return error(new ESLVal("TypeError",_v244,new ESLVal("supplied argument types ").add(ppTypes.apply(supplied,_v238).add(new ESLVal(" do not match function domain ").add(ppTypes.apply(domain,_v238))))));
          else
            return error(new ESLVal("TypeError",_v244,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
        }
        }
        }
        }
        }
        default: {ESLVal t = _v27;
          
          return error(new ESLVal("TypeError",_v244,new ESLVal("unknown type for apply: ").add(ppType.apply(t,_v238))));
        }
      }
      }
    }
  });
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v237 = $args[0];
  ESLVal _v236 = $args[1];
  ESLVal _v235 = $args[2];
  ESLVal _v234 = $args[3];
  ESLVal _v233 = $args[4];
  ESLVal _v232 = $args[5];
  ESLVal _v231 = $args[6];
  ESLVal _v230 = $args[7];
  {ESLVal testType = expType.apply(_v236,_v233,_v232,_v231,_v230);
        
        if(isBoolType.apply(testType).boolVal)
        {ESLVal conseqType = expType.apply(_v235,_v233,_v232,_v231,_v230);
          ESLVal altType = expType.apply(_v234,_v233,_v232,_v231,_v230);
          
          if(typeEqual.apply(conseqType,altType).boolVal)
          return conseqType;
          else
            return error(new ESLVal("TypeError",_v237,new ESLVal("conseq and alt types do not agree: ").add(ppType.apply(conseqType,_v230).add(new ESLVal(" ").add(ppType.apply(altType,_v230))))));
        }
        else
          return error(new ESLVal("if expects a bool ").add(ppType.apply(testType,_v230)));
      }
    }
  });
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  {ESLVal _v26 = ds;
        
        if(_v26.isCons())
        {ESLVal $122 = _v26.head();
          ESLVal $123 = _v26.tail();
          
          {ESLVal d = $122;
          
          {ESLVal _v229 = $123;
          
          if(member.apply(decName.apply(d),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(decName.apply(d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v229)).boolVal)
          return error(new ESLVal("TypeError",decLoc.apply(d),new ESLVal(" duplicate argument ").add(decName.apply(d))));
          else
            return checkDecs.apply(_v229);
        }
        }
        }
      else if(_v26.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(65957,66190)").add(ESLVal.list(_v26)));
      }
    }
  });
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v226 = $args[0];
  ESLVal _v225 = $args[1];
  ESLVal _v224 = $args[2];
  ESLVal _v223 = $args[3];
  ESLVal _v222 = $args[4];
  ESLVal _v221 = $args[5];
  ESLVal _v220 = $args[6];
  ESLVal _v219 = $args[7];
  ESLVal _v218 = $args[8];
  {checkDecs.apply(_v224);
      {ESLVal nType = expType.apply(_v225,_v221,_v220,_v219,_v218);
        
        if(isStrType.apply(nType).boolVal)
        {ESLVal declaredType = substTypeEnv.apply(_v218,_v223);
          
          return decTypes.apply(_v224,_v220,_v218,new ESLVal(new Function(new ESLVal("fun298"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v228 = $args[0];
          ESLVal _v227 = $args[1];
          {ESLVal actualRange = expType.apply(_v222,_v221,_v227,_v219,_v218);
                
                if(subType.apply(new ESLVal("FunType",_v226,_v228,actualRange),declaredType).boolVal)
                return new ESLVal("FunType",_v226,_v228,actualRange);
                else
                  return error(new ESLVal("TypeError",_v226,new ESLVal("function declared type ").add(ppType.apply(declaredType,_v218).add(new ESLVal(" but is ").add(ppType.apply(new ESLVal("FunType",_v226,_v228,actualRange),_v218))))));
              }
            }
          }));
        }
        else
          return error(new ESLVal("TypeError",_v226,new ESLVal("expecting a string for a function name: ").add(_v225)));
      }}
    }
  });
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v214 = $args[0];
  ESLVal _v213 = $args[1];
  ESLVal _v212 = $args[2];
  ESLVal _v211 = $args[3];
  { LetRec letrec = new LetRec() {
        ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v216 = $args[0];
          ESLVal _v215 = $args[1];
          {ESLVal _v25 = _v216;
                
                if(_v25.isCons())
                {ESLVal $116 = _v25.head();
                  ESLVal $117 = _v25.tail();
                  
                  switch($116.termName) {
                  case "Dec": {ESLVal $121 = $116.termRef(0);
                    ESLVal $120 = $116.termRef(1);
                    ESLVal $119 = $116.termRef(2);
                    ESLVal $118 = $116.termRef(3);
                    
                    {ESLVal l = $121;
                    
                    {ESLVal n = $120;
                    
                    {ESLVal t = $119;
                    
                    {ESLVal st = $118;
                    
                    {ESLVal _v217 = $117;
                    
                    return processDecs.apply(_v217,_v215.cons(new ESLVal("Map",n,substTypeEnv.apply(_v212,t))));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(67383,67608)").add(ESLVal.list(_v25)));
                }
                }
              else if(_v25.isNil())
                return _v211.apply(reverse.apply(typeEnvRan.apply(_v215)),_v215.add(_v213));
              else return error(new ESLVal("case error at Pos(67383,67608)").add(ESLVal.list(_v25)));
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
      
        return processDecs.apply(_v214,$nil);}
      
    }
  });
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v210 = $args[0];
  ESLVal _v209 = $args[1];
  ESLVal _v208 = $args[2];
  ESLVal _v207 = $args[3];
  ESLVal _v206 = $args[4];
  ESLVal _v205 = $args[5];
  ESLVal _v204 = $args[6];
  ESLVal _v203 = $args[7];
  {ESLVal t0 = lookupType.apply(_v209,_v204);
        
        if(t0.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v210,new ESLVal("cannot find cnstr ").add(_v209)));
        else
          {ESLVal t = unfoldIf.apply(t0);
            
            return termTypeCheckUnion.apply(t,_v210,_v209,_v208,_v207,_v206,_v205,_v204,_v203);
          }
      }
    }
  });
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v200 = $args[0];
  ESLVal _v199 = $args[1];
  ESLVal _v198 = $args[2];
  ESLVal _v197 = $args[3];
  ESLVal _v196 = $args[4];
  ESLVal _v195 = $args[5];
  ESLVal _v194 = $args[6];
  ESLVal _v193 = $args[7];
  ESLVal _v192 = $args[8];
  if(_v200.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v199,new ESLVal("cannot find constructor ").add(_v198)));
        else
          {ESLVal _v23 = _v200;
            
            switch(_v23.termName) {
            case "TypeFun": {ESLVal $113 = _v23.termRef(0);
              ESLVal $112 = _v23.termRef(1);
              ESLVal $111 = _v23.termRef(2);
              
              {ESLVal lf = $113;
              
              {ESLVal ns = $112;
              
              {ESLVal body = $111;
              
              if(length.apply(ns).eql(length.apply(_v197)).boolVal)
              {ESLVal args = map.apply(new ESLVal(new Function(new ESLVal("fun299"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v201 = $args[0];
                  return substTypeEnv.apply(_v192,_v201);
                    }
                  }),_v197);
                
                {ESLVal _v24 = substTypeEnv.apply(zipTypeEnv.apply(ns,args),body);
                
                switch(_v24.termName) {
                case "UnionType": {ESLVal $115 = _v24.termRef(0);
                  ESLVal $114 = _v24.termRef(1);
                  
                  {ESLVal l1 = $115;
                  
                  {ESLVal terms = $114;
                  
                  {ESLVal ts2 = findTermArgTypes.apply(_v198,terms);
                  
                  if(length.apply(_v196).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v199,_v196,ts2,_v195,_v194,_v193,_v192);
                  return new ESLVal("UnionType",l1,terms);}
                  else
                    return error(new ESLVal("TypeError",_v199,_v198.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v196)))))));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(68481,69043)").add(ESLVal.list(_v24)));
              }
              }
              }
              else
                return error(new ESLVal("TypeError",_v199,new ESLVal("generic constructor ").add(_v198.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(_v197))))))));
            }
            }
            }
            }
          case "UnionType": {ESLVal $110 = _v23.termRef(0);
              ESLVal $109 = _v23.termRef(1);
              
              {ESLVal l1 = $110;
              
              {ESLVal terms = $109;
              
              {ESLVal ts2 = findTermArgTypes.apply(_v198,terms);
              
              if(length.apply(_v197).neql($zero).boolVal)
              return error(new ESLVal("TypeError",_v199,new ESLVal("generic application of non-generic constructior: ").add(_v198)));
              else
                if(length.apply(_v196).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v199,_v196,ts2,_v195,_v194,_v193,_v192);
                  return _v200;}
                  else
                    return error(new ESLVal("TypeError",_v199,_v198.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v196)))))));
            }
            }
            }
            }
            default: {ESLVal _v202 = _v23;
              
              return error(new ESLVal("TypeError",_v199,new ESLVal("expecting a union type for ").add(_v198.add(new ESLVal(" but got ").add(ppType.apply(_v202,_v192))))));
            }
          }
          }
    }
  });
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v22 = t;
        
        switch(_v22.termName) {
        case "RecType": {ESLVal $108 = _v22.termRef(0);
          ESLVal $107 = _v22.termRef(1);
          ESLVal $106 = _v22.termRef(2);
          
          {ESLVal l = $108;
          
          {ESLVal n = $107;
          
          {ESLVal _v190 = $106;
          
          return unfoldIf.apply(unfoldType.apply(l,n,_v190));
        }
        }
        }
        }
        default: {ESLVal _v191 = _v22;
          
          return _v191;
        }
      }
      }
    }
  });
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal terms = $args[1];
  {ESLVal _v21 = terms;
        
        if(_v21.isCons())
        {ESLVal $101 = _v21.head();
          ESLVal $102 = _v21.tail();
          
          switch($101.termName) {
          case "TermType": {ESLVal $105 = $101.termRef(0);
            ESLVal $104 = $101.termRef(1);
            ESLVal $103 = $101.termRef(2);
            
            {ESLVal l = $105;
            
            {ESLVal nn = $104;
            
            {ESLVal ts = $103;
            
            {ESLVal _v188 = $102;
            
            if(nn.eql(n).boolVal)
            return ts;
            else
              {ESLVal t = $101;
                
                {ESLVal _v189 = $102;
                
                return findTermArgTypes.apply(n,_v189);
              }
              }
          }
          }
          }
          }
          }
          default: {ESLVal t = $101;
            
            {ESLVal ts = $102;
            
            return findTermArgTypes.apply(n,ts);
          }
          }
        }
        }
      else if(_v21.isNil())
        return error(new ESLVal("cannot find constructor ").add(n));
      else return error(new ESLVal("case error at Pos(70051,70251)").add(ESLVal.list(_v21)));
      }
    }
  });
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v185 = $args[0];
  ESLVal _v184 = $args[1];
  ESLVal _v183 = $args[2];
  ESLVal _v182 = $args[3];
  ESLVal _v181 = $args[4];
  ESLVal _v180 = $args[5];
  ESLVal _v179 = $args[6];
  {ESLVal _v20 = _v184;
        ESLVal _v19 = _v183;
        
        if(_v20.isCons())
        {ESLVal $95 = _v20.head();
          ESLVal $96 = _v20.tail();
          
          if(_v19.isCons())
          {ESLVal $97 = _v19.head();
            ESLVal $98 = _v19.tail();
            
            {ESLVal e = $95;
            
            {ESLVal _v186 = $96;
            
            {ESLVal t = $97;
            
            {ESLVal _v187 = $98;
            
            {ESLVal tt = expType.apply(e,_v182,_v181,_v180,_v179);
            
            if(typeEqual.apply(t,tt).boolVal)
            return checkTermArgTypes.apply(_v185,_v186,_v187,_v182,_v181,_v180,_v179);
            else
              return error(new ESLVal("TypeError",_v185,new ESLVal("expected constructor arg type ").add(ppType.apply(t,_v179).add(new ESLVal(" but supplied ").add(ppType.apply(tt,_v179))))));
          }
          }
          }
          }
          }
          }
        else if(_v19.isNil())
          return error(new ESLVal("case error at Pos(70369,70791)").add(ESLVal.list(_v20,_v19)));
        else return error(new ESLVal("case error at Pos(70369,70791)").add(ESLVal.list(_v20,_v19)));
        }
      else if(_v20.isNil())
        if(_v19.isCons())
          {ESLVal $99 = _v19.head();
            ESLVal $100 = _v19.tail();
            
            return error(new ESLVal("case error at Pos(70369,70791)").add(ESLVal.list(_v20,_v19)));
          }
        else if(_v19.isNil())
          return $null;
        else return error(new ESLVal("case error at Pos(70369,70791)").add(ESLVal.list(_v20,_v19)));
      else return error(new ESLVal("case error at Pos(70369,70791)").add(ESLVal.list(_v20,_v19)));
      }
    }
  });
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v177 = $args[0];
  ESLVal _v176 = $args[1];
  ESLVal _v175 = $args[2];
  ESLVal _v174 = $args[3];
  ESLVal _v173 = $args[4];
  ESLVal _v172 = $args[5];
  {ESLVal _v18 = expType.apply(_v176,_v175,_v174,_v173,_v172);
        
        switch(_v18.termName) {
        case "BoolType": {ESLVal $94 = _v18.termRef(0);
          
          {ESLVal _v178 = $94;
          
          return new ESLVal("BoolType",_v178);
        }
        }
        default: {ESLVal t = _v18;
          
          return error(new ESLVal("TypeError",_v177,new ESLVal("expecting a boolean: ").add(ppType.apply(t,_v172))));
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
          {ESLVal _v17 = t;
            
            switch(_v17.termName) {
            case "TypeClosure": {ESLVal $93 = _v17.termRef(0);
              
              {ESLVal f = $93;
              
              return f.apply();
            }
            }
            default: {ESLVal _v171 = _v17;
              
              return _v171;
            }
          }
          }
      }
    }
  });
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v170 = $args[0];
  ESLVal _v169 = $args[1];
  ESLVal _v168 = $args[2];
  ESLVal _v167 = $args[3];
  ESLVal _v166 = $args[4];
  ESLVal _v165 = $args[5];
  {ESLVal[] t = new ESLVal[]{new ESLVal("VoidType",_v170)};
        
        {{
        ESLVal _v16 = _v169;
        while(_v16.isCons()) {
          ESLVal e = _v16.headVal;
          t[0] = expType.apply(e,_v168,_v167,_v166,_v165);
          _v16 = _v16.tailVal;}
      }
      return t[0];}
      }
    }
  });
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v164 = $args[0];
  ESLVal _v163 = $args[1];
  ESLVal _v162 = $args[2];
  ESLVal _v161 = $args[3];
  ESLVal _v160 = $args[4];
  ESLVal _v159 = $args[5];
  if(_v163.eql($nil).boolVal)
        return new ESLVal("ForallType",_v164,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v164,new ESLVal("VarType",_v164,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun300"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v162,_v161,_v160,_v159);
                }
              }),_v163);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("ListType",_v164,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v164,new ESLVal("lists should have elements of the same type: ").add(_v163)));
          }
    }
  });
  private static ESLVal setType = new ESLVal(new Function(new ESLVal("setType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v158 = $args[0];
  ESLVal _v157 = $args[1];
  ESLVal _v156 = $args[2];
  ESLVal _v155 = $args[3];
  ESLVal _v154 = $args[4];
  ESLVal _v153 = $args[5];
  if(_v157.eql($nil).boolVal)
        return new ESLVal("ForallType",_v158,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v158,new ESLVal("VarType",_v158,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun301"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v156,_v155,_v154,_v153);
                }
              }),_v157);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("SetType",_v158,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v158,new ESLVal("sets should have elements of the same type: ").add(_v157)));
          }
    }
  });
  private static ESLVal bagType = new ESLVal(new Function(new ESLVal("bagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v152 = $args[0];
  ESLVal _v151 = $args[1];
  ESLVal _v150 = $args[2];
  ESLVal _v149 = $args[3];
  ESLVal _v148 = $args[4];
  ESLVal _v147 = $args[5];
  if(_v151.eql($nil).boolVal)
        return new ESLVal("ForallType",_v152,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v152,new ESLVal("VarType",_v152,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun302"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v150,_v149,_v148,_v147);
                }
              }),_v151);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("BagType",_v152,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v152,new ESLVal("bags should have elements of the same type: ").add(_v151)));
          }
    }
  });
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  { LetRec letrec = new LetRec() {
        ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v146 = $args[0];
          {ESLVal[] e = new ESLVal[]{$null};
                
                {ESLVal fenv = new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal t = $l0.head();
                        $l0 = $l0.tail();
                        ESLVal $l1 = typeFV.apply(t);
                  while(!$l1.isNil()) {
                    ESLVal n = $l1.head();
                    $l1 = $l1.tail();
                    $v.add(new ESLVal("Map",n,new ESLVal("TypeClosure",new ESLVal(new Function(new ESLVal("lookup: ").add(n),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return lookupType.apply(n,e[0]);
                      }
                    }))));
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(typeEnvRan.apply(_v146));
                
                {ESLVal env1 = substOnce.apply(_v146,fenv);
                
                {e[0] = env1;
              return env1;}
              }
              }
              }
            }
          });
        ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v145 = $args[0];
          {ESLVal _v15 = _v145;
                
                if(_v15.isCons())
                {ESLVal $87 = _v15.head();
                  ESLVal $88 = _v15.tail();
                  
                  switch($87.termName) {
                  case "Map": {ESLVal $90 = $87.termRef(0);
                    ESLVal $89 = $87.termRef(1);
                    
                    switch($89.termName) {
                    case "RecordType": {ESLVal $92 = $89.termRef(0);
                      ESLVal $91 = $89.termRef(1);
                      
                      {ESLVal n = $90;
                      
                      {ESLVal l = $92;
                      
                      {ESLVal fs = $91;
                      
                      {ESLVal e = $88;
                      
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecordType",l,fs)));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal n = $90;
                      
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
                  }
                  default: return error(new ESLVal("case error at Pos(73340,73654)").add(ESLVal.list(_v15)));
                }
                }
              else if(_v15.isNil())
                return _v145;
              else return error(new ESLVal("case error at Pos(73340,73654)").add(ESLVal.list(_v15)));
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
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new java.util.function.Function<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal n = $l0.head();
                                $l0 = $l0.tail();
                                $v.add(new ESLVal("Map",n,lookupType.apply(n,_v143)));
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(typeFV.apply(t)),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(73764,73895)").add(ESLVal.list(_v14)));
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
      
        return fixEnv.apply(introduceRecTypes.apply(env));}
      
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
      else return error(new ESLVal("case error at Pos(74281,74370)").add(ESLVal.list(_v12)));
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
        default: return error(new ESLVal("case error at Pos(74414,74493)").add(ESLVal.list(_v11)));
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
      else return error(new ESLVal("case error at Pos(74551,74653)").add(ESLVal.list(_v10)));
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
        default: return error(new ESLVal("case error at Pos(74701,74777)").add(ESLVal.list(_v9)));
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
      else return error(new ESLVal("case error at Pos(74826,74913)").add(ESLVal.list(_v8)));
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
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun303"),getSelf()) {
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
                default: return error(new ESLVal("case error at Pos(75752,75812)").add(ESLVal.list(_v7)));
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
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun304"),getSelf()) {
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
                default: return error(new ESLVal("case error at Pos(76253,76301)").add(ESLVal.list(_v5)));
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
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun305"),getSelf()) {
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
                default: return error(new ESLVal("case error at Pos(76597,76657)").add(ESLVal.list(_v4)));
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