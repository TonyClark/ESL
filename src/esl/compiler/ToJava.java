package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Tables.*;
// import static esl.Lists.*;
import static esl.compiler.Cases.*;
import static esl.compiler.Types.*;
import static esl.compiler.Info.*;
public class ToJava {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal addObserverJField = new ESLVal("JField",new ESLVal("addObserver"),$null,new ESLVal("JFun",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("addObserver"))),ESLVal.list(new ESLVal("JDec",new ESLVal("o"),$null)),$null,new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",new ESLVal("$observers"),new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("o"),$null),new ESLVal("cons"),new ESLVal("JVar",new ESLVal("$observers"),$null))),new ESLVal("JReturn",new ESLVal("JSend",new ESLVal("JVar",new ESLVal("o"),$null),new ESLVal("Start"),ESLVal.list(new ESLVal("JSelf",new ESLVal[]{}),new ESLVal("JNow",new ESLVal[]{}),new ESLVal("JApply",new ESLVal("JVar",new ESLVal("observeState"),$null),$nil))))))));
  private static ESLVal nameCount = $zero;
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v1771 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1771)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {print.apply(new ESLVal("").add(emptyTable));
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
private static ESLVal defToField(ESLVal d) {
    
    {ESLVal _v1718 = d;
      
      switch(_v1718.termName) {
      case "Binding": {ESLVal $3061 = _v1718.termRef(0);
        ESLVal $3060 = _v1718.termRef(1);
        ESLVal $3059 = _v1718.termRef(2);
        ESLVal $3058 = _v1718.termRef(3);
        ESLVal $3057 = _v1718.termRef(4);
        
        {ESLVal l = $3061;
        
        {ESLVal n = $3060;
        
        {ESLVal t = $3059;
        
        {ESLVal st = $3058;
        
        {ESLVal e = $3057;
        
        return new ESLVal("JField",n,$null,expToJExp(e));
      }
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $3054 = _v1718.termRef(0);
        ESLVal $3053 = _v1718.termRef(1);
        ESLVal $3052 = _v1718.termRef(2);
        ESLVal $3051 = _v1718.termRef(3);
        ESLVal $3050 = _v1718.termRef(4);
        ESLVal $3049 = _v1718.termRef(5);
        ESLVal $3048 = _v1718.termRef(6);
        
        switch($3048.termName) {
        case "BoolExp": {ESLVal $3056 = $3048.termRef(0);
          ESLVal $3055 = $3048.termRef(1);
          
          switch($3055.boolVal ? 1 : 0) {
          case 1: {ESLVal l = $3054;
            
            {ESLVal n = $3053;
            
            {ESLVal args = $3052;
            
            {ESLVal t = $3051;
            
            {ESLVal st = $3050;
            
            {ESLVal e = $3049;
            
            {ESLVal bl = $3056;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1719 = $qualArg;
                    
                    switch(_v1719.termName) {
                    case "PVar": {ESLVal $3064 = _v1719.termRef(0);
                      ESLVal $3063 = _v1719.termRef(1);
                      ESLVal $3062 = _v1719.termRef(2);
                      
                      {ESLVal _v1879 = $3064;
                      
                      {ESLVal _v1880 = $3063;
                      
                      {ESLVal _v1881 = $3062;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1879,_v1880,_v1881,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1719;
                      
                      return $nil;
                    }
                  }
                  }
                }
              }).map(args).flatten().flatten();
            
            return new ESLVal("JField",n,$null,expToJExp(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,e)));
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal l = $3054;
            
            {ESLVal n = $3053;
            
            {ESLVal args = $3052;
            
            {ESLVal t = $3051;
            
            {ESLVal st = $3050;
            
            {ESLVal e = $3049;
            
            {ESLVal g = $3048;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1720 = $qualArg;
                    
                    switch(_v1720.termName) {
                    case "PVar": {ESLVal $3067 = _v1720.termRef(0);
                      ESLVal $3066 = _v1720.termRef(1);
                      ESLVal $3065 = _v1720.termRef(2);
                      
                      {ESLVal _v1882 = $3067;
                      
                      {ESLVal _v1883 = $3066;
                      
                      {ESLVal _v1884 = $3065;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1882,_v1883,_v1884,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1720;
                      
                      return $nil;
                    }
                  }
                  }
                }
              }).map(args).flatten().flatten();
            
            return new ESLVal("JField",n,$null,expToJExp(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
        default: {ESLVal l = $3054;
          
          {ESLVal n = $3053;
          
          {ESLVal args = $3052;
          
          {ESLVal t = $3051;
          
          {ESLVal st = $3050;
          
          {ESLVal e = $3049;
          
          {ESLVal g = $3048;
          
          {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1721 = $qualArg;
                  
                  switch(_v1721.termName) {
                  case "PVar": {ESLVal $3070 = _v1721.termRef(0);
                    ESLVal $3069 = _v1721.termRef(1);
                    ESLVal $3068 = _v1721.termRef(2);
                    
                    {ESLVal _v1885 = $3070;
                    
                    {ESLVal _v1886 = $3069;
                    
                    {ESLVal _v1887 = $3068;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1885,_v1886,_v1887,st)));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1721;
                    
                    return $nil;
                  }
                }
                }
              }
            }).map(args).flatten().flatten();
          
          return new ESLVal("JField",n,$null,expToJExp(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
      default: {ESLVal _v1888 = _v1718;
        
        return error(new ESLVal("unexpected definition to translate to Java: ").add(_v1888));
      }
    }
    }
  }
  private static ESLVal defToField = new ESLVal(new Function(new ESLVal("defToField"),null) { public ESLVal apply(ESLVal... args) { return defToField(args[0]); }});
  private static ESLVal defToMethod(ESLVal d) {
    
    {ESLVal _v1722 = d;
      
      switch(_v1722.termName) {
      case "FunBind": {ESLVal $3077 = _v1722.termRef(0);
        ESLVal $3076 = _v1722.termRef(1);
        ESLVal $3075 = _v1722.termRef(2);
        ESLVal $3074 = _v1722.termRef(3);
        ESLVal $3073 = _v1722.termRef(4);
        ESLVal $3072 = _v1722.termRef(5);
        ESLVal $3071 = _v1722.termRef(6);
        
        {ESLVal l = $3077;
        
        {ESLVal n = $3076;
        
        {ESLVal args = $3075;
        
        {ESLVal t = $3074;
        
        {ESLVal st = $3073;
        
        {ESLVal body = $3072;
        
        {ESLVal guard = $3071;
        
        {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1723 = $qualArg;
                
                switch(_v1723.termName) {
                case "PVar": {ESLVal $3080 = _v1723.termRef(0);
                  ESLVal $3079 = _v1723.termRef(1);
                  ESLVal $3078 = _v1723.termRef(2);
                  
                  {ESLVal _v1875 = $3080;
                  
                  {ESLVal _v1876 = $3079;
                  
                  {ESLVal _v1877 = $3078;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JDec",_v1876,$null)));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1723;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        return new ESLVal("JMethod",n,formals,expToJCommand(body,$true));
      }
      }
      }
      }
      }
      }
      }
      }
      }
      default: {ESLVal _v1878 = _v1722;
        
        return error(new ESLVal("cannot transform definition ").add(_v1878.add(new ESLVal(" to a method"))));
      }
    }
    }
  }
  private static ESLVal defToMethod = new ESLVal(new Function(new ESLVal("defToMethod"),null) { public ESLVal apply(ESLVal... args) { return defToMethod(args[0]); }});
  private static ESLVal decToJDec(ESLVal d) {
    
    {ESLVal _v1724 = d;
      
      switch(_v1724.termName) {
      case "Dec": {ESLVal $3084 = _v1724.termRef(0);
        ESLVal $3083 = _v1724.termRef(1);
        ESLVal $3082 = _v1724.termRef(2);
        ESLVal $3081 = _v1724.termRef(3);
        
        {ESLVal l = $3084;
        
        {ESLVal n = $3083;
        
        {ESLVal t = $3082;
        
        {ESLVal st = $3081;
        
        return new ESLVal("JDec",n,$null);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2614,2690)").add(ESLVal.list(_v1724)));
    }
    }
  }
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),null) { public ESLVal apply(ESLVal... args) { return decToJDec(args[0]); }});
  private static ESLVal expsToJCommands(ESLVal cs,ESLVal isLast) {
    
    {ESLVal _v1725 = cs;
      
      if(_v1725.isCons())
      {ESLVal $3085 = _v1725.head();
        ESLVal $3086 = _v1725.tail();
        
        if($3086.isCons())
        {ESLVal $3087 = $3086.head();
          ESLVal $3088 = $3086.tail();
          
          {ESLVal c = $3085;
          
          {ESLVal _v1873 = $3086;
          
          return expsToJCommands(_v1873,isLast).cons(expToJCommand(c,$false));
        }
        }
        }
      else if($3086.isNil())
        {ESLVal c = $3085;
          
          return ESLVal.list(expToJCommand(c,isLast));
        }
      else {ESLVal c = $3085;
          
          {ESLVal _v1874 = $3086;
          
          return expsToJCommands(_v1874,isLast).cons(expToJCommand(c,$false));
        }
        }
      }
    else if(_v1725.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2749,2909)").add(ESLVal.list(_v1725)));
    }
  }
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),null) { public ESLVal apply(ESLVal... args) { return expsToJCommands(args[0],args[1]); }});
  private static ESLVal expToJCommand(ESLVal c,ESLVal isLast) {
    
    {ESLVal _v1726 = c;
      
      switch(_v1726.termName) {
      case "Block": {ESLVal $3134 = _v1726.termRef(0);
        ESLVal $3133 = _v1726.termRef(1);
        
        if($3133.isCons())
        {ESLVal $3135 = $3133.head();
          ESLVal $3136 = $3133.tail();
          
          if($3136.isCons())
          {ESLVal $3137 = $3136.head();
            ESLVal $3138 = $3136.tail();
            
            {ESLVal l = $3134;
            
            {ESLVal es = $3133;
            
            return new ESLVal("JBlock",new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(expToJCommand(e,$false));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand(last.apply(es),isLast))));
          }
          }
          }
        else if($3136.isNil())
          {ESLVal l = $3134;
            
            {ESLVal e = $3135;
            
            return expToJCommand(e,isLast);
          }
          }
        else {ESLVal l = $3134;
            
            {ESLVal es = $3133;
            
            return new ESLVal("JBlock",new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(expToJCommand(e,$false));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand(last.apply(es),isLast))));
          }
          }
        }
      else if($3133.isNil())
        {ESLVal l = $3134;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
          else
            {ESLVal _v1871 = $3134;
              
              return new ESLVal("JBlock",$nil);
            }
        }
      else {ESLVal l = $3134;
          
          {ESLVal es = $3133;
          
          return new ESLVal("JBlock",new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(expToJCommand(e,$false));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand(last.apply(es),isLast))));
        }
        }
      }
    case "Update": {ESLVal $3132 = _v1726.termRef(0);
        ESLVal $3131 = _v1726.termRef(1);
        ESLVal $3130 = _v1726.termRef(2);
        
        {ESLVal l = $3132;
        
        {ESLVal n = $3131;
        
        {ESLVal e = $3130;
        
        if(isLast.boolVal)
        return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
        else
          {ESLVal _v1868 = $3132;
            
            {ESLVal _v1869 = $3131;
            
            {ESLVal _v1870 = $3130;
            
            return new ESLVal("JUpdate",_v1869,expToJExp(_v1870));
          }
          }
          }
      }
      }
      }
      }
    case "If": {ESLVal $3129 = _v1726.termRef(0);
        ESLVal $3128 = _v1726.termRef(1);
        ESLVal $3127 = _v1726.termRef(2);
        ESLVal $3126 = _v1726.termRef(3);
        
        {ESLVal l = $3129;
        
        {ESLVal e1 = $3128;
        
        {ESLVal e2 = $3127;
        
        {ESLVal e3 = $3126;
        
        return new ESLVal("JIfCommand",expToJExp(e1),expToJCommand(e2,isLast),expToJCommand(e3,isLast));
      }
      }
      }
      }
      }
    case "CaseList": {ESLVal $3125 = _v1726.termRef(0);
        ESLVal $3124 = _v1726.termRef(1);
        ESLVal $3123 = _v1726.termRef(2);
        ESLVal $3122 = _v1726.termRef(3);
        ESLVal $3121 = _v1726.termRef(4);
        
        {ESLVal l = $3125;
        
        {ESLVal e = $3124;
        
        {ESLVal cons = $3123;
        
        {ESLVal nil = $3122;
        
        {ESLVal alt = $3121;
        
        return new ESLVal("JCaseList",expToJExp(e),expToJCommand(cons,isLast),expToJCommand(nil,isLast),expToJCommand(alt,isLast));
      }
      }
      }
      }
      }
      }
    case "CaseTerm": {ESLVal $3120 = _v1726.termRef(0);
        ESLVal $3119 = _v1726.termRef(1);
        ESLVal $3118 = _v1726.termRef(2);
        ESLVal $3117 = _v1726.termRef(3);
        
        {ESLVal l = $3120;
        
        {ESLVal e = $3119;
        
        {ESLVal arms = $3118;
        
        {ESLVal alt = $3117;
        
        return new ESLVal("JCaseTerm",expToJExp(e),termArmsToJTermArms(arms,isLast),expToJCommand(alt,isLast));
      }
      }
      }
      }
      }
    case "CaseInt": {ESLVal $3116 = _v1726.termRef(0);
        ESLVal $3115 = _v1726.termRef(1);
        ESLVal $3114 = _v1726.termRef(2);
        ESLVal $3113 = _v1726.termRef(3);
        
        {ESLVal l = $3116;
        
        {ESLVal e = $3115;
        
        {ESLVal arms = $3114;
        
        {ESLVal alt = $3113;
        
        return new ESLVal("JCaseInt",expToJExp(e),intArmsToJIntArms(arms,isLast),expToJCommand(alt,isLast));
      }
      }
      }
      }
      }
    case "CaseStr": {ESLVal $3112 = _v1726.termRef(0);
        ESLVal $3111 = _v1726.termRef(1);
        ESLVal $3110 = _v1726.termRef(2);
        ESLVal $3109 = _v1726.termRef(3);
        
        {ESLVal l = $3112;
        
        {ESLVal e = $3111;
        
        {ESLVal arms = $3110;
        
        {ESLVal alt = $3109;
        
        return new ESLVal("JCaseStr",expToJExp(e),strArmsToJStrArms(arms,isLast),expToJCommand(alt,isLast));
      }
      }
      }
      }
      }
    case "CaseBool": {ESLVal $3108 = _v1726.termRef(0);
        ESLVal $3107 = _v1726.termRef(1);
        ESLVal $3106 = _v1726.termRef(2);
        ESLVal $3105 = _v1726.termRef(3);
        
        {ESLVal l = $3108;
        
        {ESLVal e = $3107;
        
        {ESLVal arms = $3106;
        
        {ESLVal alt = $3105;
        
        return new ESLVal("JCaseBool",expToJExp(e),boolArmsToJBoolArms(arms,isLast),expToJCommand(alt,isLast));
      }
      }
      }
      }
      }
    case "Let": {ESLVal $3104 = _v1726.termRef(0);
        ESLVal $3103 = _v1726.termRef(1);
        ESLVal $3102 = _v1726.termRef(2);
        
        {ESLVal l = $3104;
        
        {ESLVal bs = $3103;
        
        {ESLVal e = $3102;
        
        return new ESLVal("JLet",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),expToJCommand(e,isLast));
      }
      }
      }
      }
    case "Letrec": {ESLVal $3101 = _v1726.termRef(0);
        ESLVal $3100 = _v1726.termRef(1);
        ESLVal $3099 = _v1726.termRef(2);
        
        {ESLVal l = $3101;
        
        {ESLVal bs = $3100;
        
        {ESLVal e = $3099;
        
        return new ESLVal("JLetRec",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),expToJCommand(e,$true));
      }
      }
      }
      }
    case "For": {ESLVal $3095 = _v1726.termRef(0);
        ESLVal $3094 = _v1726.termRef(1);
        ESLVal $3093 = _v1726.termRef(2);
        ESLVal $3092 = _v1726.termRef(3);
        
        switch($3094.termName) {
        case "PVar": {ESLVal $3098 = $3094.termRef(0);
          ESLVal $3097 = $3094.termRef(1);
          ESLVal $3096 = $3094.termRef(2);
          
          {ESLVal l1 = $3095;
          
          {ESLVal l2 = $3098;
          
          {ESLVal n = $3097;
          
          {ESLVal t = $3096;
          
          {ESLVal e = $3093;
          
          {ESLVal b = $3092;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName(),n,expToJExp(e),expToJCommand(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v1862 = $3095;
              
              {ESLVal _v1863 = $3098;
              
              {ESLVal _v1864 = $3097;
              
              {ESLVal _v1865 = $3096;
              
              {ESLVal _v1866 = $3093;
              
              {ESLVal _v1867 = $3092;
              
              return new ESLVal("JFor",newName(),_v1864,expToJExp(_v1866),expToJCommand(_v1867,$false));
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
        default: {ESLVal l = $3095;
          
          {ESLVal p = $3094;
          
          {ESLVal e = $3093;
          
          {ESLVal b = $3092;
          
          {ESLVal opName = newName();
          ESLVal varName = newName();
          
          return expToJCommand(new ESLVal("For",l,new ESLVal("PVar",l,varName,$null),e,new ESLVal("Let",l,ESLVal.list(new ESLVal("Binding",l,opName,$null,$null,new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("forp")),$nil,$null,new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,varName)),ESLVal.list(new ESLVal("BArm",l,ESLVal.list(p),new ESLVal("BoolExp",l,$true),b),new ESLVal("BArm",l,ESLVal.list(new ESLVal("PVar",l,new ESLVal("$$$"),$null)),new ESLVal("BoolExp",l,$true),new ESLVal("Block",l,$nil))))))),new ESLVal("Apply",l,new ESLVal("Var",l,opName),$nil))),isLast);
        }
        }
        }
        }
        }
      }
      }
    case "PLet": {ESLVal $3091 = _v1726.termRef(0);
        ESLVal $3090 = _v1726.termRef(1);
        ESLVal $3089 = _v1726.termRef(2);
        
        {ESLVal l = $3091;
        
        {ESLVal bs = $3090;
        
        {ESLVal e = $3089;
        
        return new ESLVal("JPLet",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),expToJCommand(e,isLast));
      }
      }
      }
      }
      default: {ESLVal e = _v1726;
        
        if(isLast.boolVal)
        return new ESLVal("JReturn",expToJExp(e));
        else
          {ESLVal _v1872 = _v1726;
            
            return new ESLVal("JStatement",expToJExp(_v1872));
          }
      }
    }
    }
  }
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),null) { public ESLVal apply(ESLVal... args) { return expToJCommand(args[0],args[1]); }});
  private static ESLVal expsToJExps(ESLVal es) {
    
    return map(new ESLVal(new Function(new ESLVal("fun424"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal e = $args[0];
      return expToJExp(e);
        }
      }),es);
  }
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),null) { public ESLVal apply(ESLVal... args) { return expsToJExps(args[0]); }});
  private static ESLVal termArmsToJTermArms(ESLVal arms,ESLVal isLast) {
    
    {ESLVal _v1727 = arms;
      
      if(_v1727.isCons())
      {ESLVal $3139 = _v1727.head();
        ESLVal $3140 = _v1727.tail();
        
        switch($3139.termName) {
        case "TArm": {ESLVal $3142 = $3139.termRef(0);
          ESLVal $3141 = $3139.termRef(1);
          
          {ESLVal n = $3142;
          
          {ESLVal e = $3141;
          
          {ESLVal _v1861 = $3140;
          
          return termArmsToJTermArms(_v1861,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand(e,isLast)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6244,6413)").add(ESLVal.list(_v1727)));
      }
      }
    else if(_v1727.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6244,6413)").add(ESLVal.list(_v1727)));
    }
  }
  private static ESLVal termArmsToJTermArms = new ESLVal(new Function(new ESLVal("termArmsToJTermArms"),null) { public ESLVal apply(ESLVal... args) { return termArmsToJTermArms(args[0],args[1]); }});
  private static ESLVal intArmsToJIntArms(ESLVal arms,ESLVal isLast) {
    
    {ESLVal _v1728 = arms;
      
      if(_v1728.isCons())
      {ESLVal $3143 = _v1728.head();
        ESLVal $3144 = _v1728.tail();
        
        switch($3143.termName) {
        case "IArm": {ESLVal $3146 = $3143.termRef(0);
          ESLVal $3145 = $3143.termRef(1);
          
          {ESLVal n = $3146;
          
          {ESLVal e = $3145;
          
          {ESLVal _v1860 = $3144;
          
          return intArmsToJIntArms(_v1860,isLast).cons(new ESLVal("JIArm",n,expToJCommand(e,isLast)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6482,6646)").add(ESLVal.list(_v1728)));
      }
      }
    else if(_v1728.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6482,6646)").add(ESLVal.list(_v1728)));
    }
  }
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),null) { public ESLVal apply(ESLVal... args) { return intArmsToJIntArms(args[0],args[1]); }});
  private static ESLVal strArmsToJStrArms(ESLVal arms,ESLVal isLast) {
    
    {ESLVal _v1729 = arms;
      
      if(_v1729.isCons())
      {ESLVal $3147 = _v1729.head();
        ESLVal $3148 = _v1729.tail();
        
        switch($3147.termName) {
        case "SArm": {ESLVal $3150 = $3147.termRef(0);
          ESLVal $3149 = $3147.termRef(1);
          
          {ESLVal s = $3150;
          
          {ESLVal e = $3149;
          
          {ESLVal _v1859 = $3148;
          
          return strArmsToJStrArms(_v1859,isLast).cons(new ESLVal("JSArm",s,expToJCommand(e,isLast)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6715,6879)").add(ESLVal.list(_v1729)));
      }
      }
    else if(_v1729.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6715,6879)").add(ESLVal.list(_v1729)));
    }
  }
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),null) { public ESLVal apply(ESLVal... args) { return strArmsToJStrArms(args[0],args[1]); }});
  private static ESLVal boolArmsToJBoolArms(ESLVal arms,ESLVal isLast) {
    
    {ESLVal _v1730 = arms;
      
      if(_v1730.isCons())
      {ESLVal $3151 = _v1730.head();
        ESLVal $3152 = _v1730.tail();
        
        switch($3151.termName) {
        case "BoolArm": {ESLVal $3154 = $3151.termRef(0);
          ESLVal $3153 = $3151.termRef(1);
          
          {ESLVal b = $3154;
          
          {ESLVal e = $3153;
          
          {ESLVal _v1858 = $3152;
          
          return boolArmsToJBoolArms(_v1858,isLast).cons(new ESLVal("JBArm",b,expToJCommand(e,isLast)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6954,7127)").add(ESLVal.list(_v1730)));
      }
      }
    else if(_v1730.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6954,7127)").add(ESLVal.list(_v1730)));
    }
  }
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),null) { public ESLVal apply(ESLVal... args) { return boolArmsToJBoolArms(args[0],args[1]); }});
  private static ESLVal opToJOp(ESLVal op) {
    
    {ESLVal _v1731 = op;
      
      switch(_v1731.strVal) {
      case "@": return new ESLVal("at");
    case "+": return new ESLVal("add");
    case "-": return new ESLVal("sub");
    case "*": return new ESLVal("mul");
    case "/": return new ESLVal("div");
    case "%": return new ESLVal("mod");
    case ">": return new ESLVal("gre");
    case ">=": return new ESLVal("greql");
    case "<": return new ESLVal("less");
    case "<=": return new ESLVal("lesseql");
    case "=": return new ESLVal("eql");
    case "<>": return new ESLVal("neql");
    case ":": return new ESLVal("cons");
    case "..": return new ESLVal("to");
    case "or": return new ESLVal("or");
    case "and": return new ESLVal("and");
    case "andalso": return new ESLVal("andalso");
    case "orelse": return new ESLVal("orelse");
      default: return error(new ESLVal("case error at Pos(7155,7524)").add(ESLVal.list(_v1731)));
    }
    }
  }
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),null) { public ESLVal apply(ESLVal... args) { return opToJOp(args[0]); }});
  private static ESLVal caseToJExp(ESLVal l,ESLVal es,ESLVal arms) {
    
    {ESLVal bindings = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("Binding",l,newName(),$null,$null,e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es);
      
      {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1732 = $qualArg;
              
              switch(_v1732.termName) {
              case "Binding": {ESLVal $3159 = _v1732.termRef(0);
                ESLVal $3158 = _v1732.termRef(1);
                ESLVal $3157 = _v1732.termRef(2);
                ESLVal $3156 = _v1732.termRef(3);
                ESLVal $3155 = _v1732.termRef(4);
                
                {ESLVal _v1857 = $3159;
                
                {ESLVal n = $3158;
                
                {ESLVal dt = $3157;
                
                {ESLVal t = $3156;
                
                {ESLVal e = $3155;
                
                return ESLVal.list(ESLVal.list(n));
              }
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v1732;
                
                return $nil;
              }
            }
            }
          }
        }).map(bindings).flatten().flatten();
      
      return expToJExp(new ESLVal("Let",l,bindings,translateCases(new ESLVal("Case",l,$nil,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal n = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Var",l,n));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(names),arms))));
    }
    }
  }
  private static ESLVal caseToJExp = new ESLVal(new Function(new ESLVal("caseToJExp"),null) { public ESLVal apply(ESLVal... args) { return caseToJExp(args[0],args[1],args[2]); }});
  private static ESLVal expToJExp(ESLVal e) {
    
    {ESLVal _v1733 = e;
      
      switch(_v1733.termName) {
      case "Apply": {ESLVal $3344 = _v1733.termRef(0);
        ESLVal $3343 = _v1733.termRef(1);
        ESLVal $3342 = _v1733.termRef(2);
        
        {ESLVal l = $3344;
        
        {ESLVal op = $3343;
        
        {ESLVal args = $3342;
        
        return new ESLVal("JApply",expToJExp(op),expsToJExps(args));
      }
      }
      }
      }
    case "ArrayUpdate": {ESLVal $3341 = _v1733.termRef(0);
        ESLVal $3340 = _v1733.termRef(1);
        ESLVal $3339 = _v1733.termRef(2);
        ESLVal $3338 = _v1733.termRef(3);
        
        {ESLVal l = $3341;
        
        {ESLVal a = $3340;
        
        {ESLVal i = $3339;
        
        {ESLVal v = $3338;
        
        return new ESLVal("JArrayUpdate",expToJExp(a),expToJExp(i),expToJExp(v));
      }
      }
      }
      }
      }
    case "ArrayRef": {ESLVal $3337 = _v1733.termRef(0);
        ESLVal $3336 = _v1733.termRef(1);
        ESLVal $3335 = _v1733.termRef(2);
        
        {ESLVal l = $3337;
        
        {ESLVal a = $3336;
        
        {ESLVal i = $3335;
        
        return new ESLVal("JArrayRef",expToJExp(a),expToJExp(i));
      }
      }
      }
      }
    case "IntExp": {ESLVal $3334 = _v1733.termRef(0);
        ESLVal $3333 = _v1733.termRef(1);
        
        {ESLVal l = $3334;
        
        {ESLVal n = $3333;
        
        return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
      }
      }
      }
    case "StrExp": {ESLVal $3332 = _v1733.termRef(0);
        ESLVal $3331 = _v1733.termRef(1);
        
        {ESLVal l = $3332;
        
        {ESLVal s = $3331;
        
        return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
      }
      }
      }
    case "BoolExp": {ESLVal $3330 = _v1733.termRef(0);
        ESLVal $3329 = _v1733.termRef(1);
        
        {ESLVal l = $3330;
        
        {ESLVal b = $3329;
        
        return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
      }
      }
      }
    case "FloatExp": {ESLVal $3328 = _v1733.termRef(0);
        ESLVal $3327 = _v1733.termRef(1);
        
        {ESLVal l = $3328;
        
        {ESLVal f = $3327;
        
        return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $3313 = _v1733.termRef(0);
        ESLVal $3312 = _v1733.termRef(1);
        ESLVal $3311 = _v1733.termRef(2);
        
        switch($3312.termName) {
        case "List": {ESLVal $3320 = $3312.termRef(0);
          ESLVal $3319 = $3312.termRef(1);
          
          if($3319.isCons())
          {ESLVal $3321 = $3319.head();
            ESLVal $3322 = $3319.tail();
            
            {ESLVal l = $3313;
            
            {ESLVal _v1850 = $3312;
            
            {ESLVal ts = $3311;
            
            return expToJExp(_v1850);
          }
          }
          }
          }
        else if($3319.isNil())
          if($3311.isCons())
            {ESLVal $3323 = $3311.head();
              ESLVal $3324 = $3311.tail();
              
              if($3324.isCons())
              {ESLVal $3325 = $3324.head();
                ESLVal $3326 = $3324.tail();
                
                {ESLVal l = $3313;
                
                {ESLVal _v1851 = $3312;
                
                {ESLVal ts = $3311;
                
                return expToJExp(_v1851);
              }
              }
              }
              }
            else if($3324.isNil())
              {ESLVal l1 = $3313;
                
                {ESLVal l2 = $3320;
                
                {ESLVal t = $3323;
                
                return new ESLVal("JNil",$null);
              }
              }
              }
            else {ESLVal l = $3313;
                
                {ESLVal _v1852 = $3312;
                
                {ESLVal ts = $3311;
                
                return expToJExp(_v1852);
              }
              }
              }
            }
          else if($3311.isNil())
            {ESLVal l = $3313;
              
              {ESLVal _v1853 = $3312;
              
              {ESLVal ts = $3311;
              
              return expToJExp(_v1853);
            }
            }
            }
          else {ESLVal l = $3313;
              
              {ESLVal _v1854 = $3312;
              
              {ESLVal ts = $3311;
              
              return expToJExp(_v1854);
            }
            }
            }
        else {ESLVal l = $3313;
            
            {ESLVal _v1855 = $3312;
            
            {ESLVal ts = $3311;
            
            return expToJExp(_v1855);
          }
          }
          }
        }
      case "NullExp": {ESLVal $3314 = $3312.termRef(0);
          
          if($3311.isCons())
          {ESLVal $3315 = $3311.head();
            ESLVal $3316 = $3311.tail();
            
            if($3316.isCons())
            {ESLVal $3317 = $3316.head();
              ESLVal $3318 = $3316.tail();
              
              {ESLVal l = $3313;
              
              {ESLVal _v1846 = $3312;
              
              {ESLVal ts = $3311;
              
              return expToJExp(_v1846);
            }
            }
            }
            }
          else if($3316.isNil())
            {ESLVal l1 = $3313;
              
              {ESLVal l2 = $3314;
              
              {ESLVal t = $3315;
              
              return new ESLVal("JNull",new ESLVal[]{});
            }
            }
            }
          else {ESLVal l = $3313;
              
              {ESLVal _v1847 = $3312;
              
              {ESLVal ts = $3311;
              
              return expToJExp(_v1847);
            }
            }
            }
          }
        else if($3311.isNil())
          {ESLVal l = $3313;
            
            {ESLVal _v1848 = $3312;
            
            {ESLVal ts = $3311;
            
            return expToJExp(_v1848);
          }
          }
          }
        else {ESLVal l = $3313;
            
            {ESLVal _v1849 = $3312;
            
            {ESLVal ts = $3311;
            
            return expToJExp(_v1849);
          }
          }
          }
        }
        default: {ESLVal l = $3313;
          
          {ESLVal _v1856 = $3312;
          
          {ESLVal ts = $3311;
          
          return expToJExp(_v1856);
        }
        }
        }
      }
      }
    case "List": {ESLVal $3310 = _v1733.termRef(0);
        ESLVal $3309 = _v1733.termRef(1);
        
        {ESLVal l = $3310;
        
        {ESLVal es = $3309;
        
        return new ESLVal("JList",$null,expsToJExps(es));
      }
      }
      }
    case "SetExp": {ESLVal $3308 = _v1733.termRef(0);
        ESLVal $3307 = _v1733.termRef(1);
        
        {ESLVal l = $3308;
        
        {ESLVal es = $3307;
        
        return new ESLVal("JSet",$null,expsToJExps(es));
      }
      }
      }
    case "BagExp": {ESLVal $3306 = _v1733.termRef(0);
        ESLVal $3305 = _v1733.termRef(1);
        
        {ESLVal l = $3306;
        
        {ESLVal es = $3305;
        
        return new ESLVal("JBag",$null,expsToJExps(es));
      }
      }
      }
    case "Term": {ESLVal $3304 = _v1733.termRef(0);
        ESLVal $3303 = _v1733.termRef(1);
        ESLVal $3302 = _v1733.termRef(2);
        ESLVal $3301 = _v1733.termRef(3);
        
        {ESLVal l = $3304;
        
        {ESLVal n = $3303;
        
        {ESLVal ts = $3302;
        
        {ESLVal es = $3301;
        
        return new ESLVal("JTerm",n,expsToJExps(es));
      }
      }
      }
      }
      }
    case "Case": {ESLVal $3300 = _v1733.termRef(0);
        ESLVal $3299 = _v1733.termRef(1);
        ESLVal $3298 = _v1733.termRef(2);
        ESLVal $3297 = _v1733.termRef(3);
        
        {ESLVal l = $3300;
        
        {ESLVal ds = $3299;
        
        {ESLVal es = $3298;
        
        {ESLVal arms = $3297;
        
        return caseToJExp(l,es,arms);
      }
      }
      }
      }
      }
    case "CaseAdd": {ESLVal $3296 = _v1733.termRef(0);
        ESLVal $3295 = _v1733.termRef(1);
        ESLVal $3294 = _v1733.termRef(2);
        ESLVal $3293 = _v1733.termRef(3);
        
        {ESLVal l = $3296;
        
        {ESLVal s = $3295;
        
        {ESLVal handler = $3294;
        
        {ESLVal fail = $3293;
        
        return expToJExp(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
      }
      }
      }
      }
      }
    case "CaseList": {ESLVal $3292 = _v1733.termRef(0);
        ESLVal $3291 = _v1733.termRef(1);
        ESLVal $3290 = _v1733.termRef(2);
        ESLVal $3289 = _v1733.termRef(3);
        ESLVal $3288 = _v1733.termRef(4);
        
        {ESLVal l = $3292;
        
        {ESLVal list = $3291;
        
        {ESLVal cons = $3290;
        
        {ESLVal nil = $3289;
        
        {ESLVal alt = $3288;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
      }
      }
    case "CaseTerm": {ESLVal $3287 = _v1733.termRef(0);
        ESLVal $3286 = _v1733.termRef(1);
        ESLVal $3285 = _v1733.termRef(2);
        ESLVal $3284 = _v1733.termRef(3);
        
        {ESLVal l = $3287;
        
        {ESLVal list = $3286;
        
        {ESLVal arms = $3285;
        
        {ESLVal alt = $3284;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
      }
    case "CaseStr": {ESLVal $3283 = _v1733.termRef(0);
        ESLVal $3282 = _v1733.termRef(1);
        ESLVal $3281 = _v1733.termRef(2);
        ESLVal $3280 = _v1733.termRef(3);
        
        {ESLVal l = $3283;
        
        {ESLVal s = $3282;
        
        {ESLVal arms = $3281;
        
        {ESLVal alt = $3280;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
      }
    case "CaseBool": {ESLVal $3279 = _v1733.termRef(0);
        ESLVal $3278 = _v1733.termRef(1);
        ESLVal $3277 = _v1733.termRef(2);
        ESLVal $3276 = _v1733.termRef(3);
        
        {ESLVal l = $3279;
        
        {ESLVal s = $3278;
        
        {ESLVal arms = $3277;
        
        {ESLVal alt = $3276;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
      }
    case "CaseSet": {ESLVal $3275 = _v1733.termRef(0);
        ESLVal $3274 = _v1733.termRef(1);
        ESLVal $3273 = _v1733.termRef(2);
        ESLVal $3272 = _v1733.termRef(3);
        
        {ESLVal l = $3275;
        
        {ESLVal s = $3274;
        
        {ESLVal handler = $3273;
        
        {ESLVal fail = $3272;
        
        return expToJExp(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
      }
      }
      }
      }
      }
    case "Head": {ESLVal $3271 = _v1733.termRef(0);
        
        {ESLVal _v1845 = $3271;
        
        return new ESLVal("JHead",expToJExp(_v1845));
      }
      }
    case "Tail": {ESLVal $3270 = _v1733.termRef(0);
        
        {ESLVal _v1844 = $3270;
        
        return new ESLVal("JTail",expToJExp(_v1844));
      }
      }
    case "CaseError": {ESLVal $3269 = _v1733.termRef(0);
        ESLVal $3268 = _v1733.termRef(1);
        
        {ESLVal l = $3269;
        
        {ESLVal _v1843 = $3268;
        
        return new ESLVal("JError",new ESLVal("JBinExp",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))),new ESLVal("add"),expToJExp(_v1843)));
      }
      }
      }
    case "NullExp": {ESLVal $3267 = _v1733.termRef(0);
        
        {ESLVal l = $3267;
        
        return new ESLVal("JNull",new ESLVal[]{});
      }
      }
    case "Var": {ESLVal $3266 = _v1733.termRef(0);
        ESLVal $3265 = _v1733.termRef(1);
        
        {ESLVal l = $3266;
        
        {ESLVal n = $3265;
        
        return new ESLVal("JVar",n,$null);
      }
      }
      }
    case "Let": {ESLVal $3264 = _v1733.termRef(0);
        ESLVal $3263 = _v1733.termRef(1);
        ESLVal $3262 = _v1733.termRef(2);
        
        {ESLVal l = $3264;
        
        {ESLVal bs = $3263;
        
        {ESLVal body = $3262;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
    case "Letrec": {ESLVal $3261 = _v1733.termRef(0);
        ESLVal $3260 = _v1733.termRef(1);
        ESLVal $3259 = _v1733.termRef(2);
        
        {ESLVal l = $3261;
        
        {ESLVal bs = $3260;
        
        {ESLVal body = $3259;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
    case "Throw": {ESLVal $3258 = _v1733.termRef(0);
        ESLVal $3257 = _v1733.termRef(1);
        ESLVal $3256 = _v1733.termRef(2);
        
        {ESLVal l = $3258;
        
        {ESLVal t = $3257;
        
        {ESLVal _v1842 = $3256;
        
        return new ESLVal("JError",expToJExp(_v1842));
      }
      }
      }
      }
    case "BinExp": {ESLVal $3255 = _v1733.termRef(0);
        ESLVal $3254 = _v1733.termRef(1);
        ESLVal $3253 = _v1733.termRef(2);
        ESLVal $3252 = _v1733.termRef(3);
        
        {ESLVal l = $3255;
        
        {ESLVal e1 = $3254;
        
        {ESLVal op = $3253;
        
        {ESLVal e2 = $3252;
        
        return new ESLVal("JBinExp",expToJExp(e1),opToJOp(op),expToJExp(e2));
      }
      }
      }
      }
      }
    case "Become": {ESLVal $3248 = _v1733.termRef(0);
        ESLVal $3247 = _v1733.termRef(1);
        
        switch($3247.termName) {
        case "Apply": {ESLVal $3251 = $3247.termRef(0);
          ESLVal $3250 = $3247.termRef(1);
          ESLVal $3249 = $3247.termRef(2);
          
          {ESLVal l = $3248;
          
          {ESLVal al = $3251;
          
          {ESLVal b = $3250;
          
          {ESLVal args = $3249;
          
          return new ESLVal("JBecome",expToJExp(b),expsToJExps(args));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7891,16696)").add(ESLVal.list(_v1733)));
      }
      }
    case "Block": {ESLVal $3242 = _v1733.termRef(0);
        ESLVal $3241 = _v1733.termRef(1);
        
        if($3241.isCons())
        {ESLVal $3243 = $3241.head();
          ESLVal $3244 = $3241.tail();
          
          if($3244.isCons())
          {ESLVal $3245 = $3244.head();
            ESLVal $3246 = $3244.tail();
            
            {ESLVal l = $3242;
            
            {ESLVal es = $3241;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands(es,$true)),$null);
          }
          }
          }
        else if($3244.isNil())
          {ESLVal l = $3242;
            
            {ESLVal _v1841 = $3243;
            
            return expToJExp(_v1841);
          }
          }
        else {ESLVal l = $3242;
            
            {ESLVal es = $3241;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands(es,$true)),$null);
          }
          }
        }
      else if($3241.isNil())
        {ESLVal l = $3242;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
      else {ESLVal l = $3242;
          
          {ESLVal es = $3241;
          
          return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands(es,$true)),$null);
        }
        }
      }
    case "If": {ESLVal $3240 = _v1733.termRef(0);
        ESLVal $3239 = _v1733.termRef(1);
        ESLVal $3238 = _v1733.termRef(2);
        ESLVal $3237 = _v1733.termRef(3);
        
        {ESLVal l = $3240;
        
        {ESLVal e1 = $3239;
        
        {ESLVal e2 = $3238;
        
        {ESLVal e3 = $3237;
        
        return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp(e1),expToJCommand(e2,$true),expToJCommand(e3,$true)),$null);
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $3236 = _v1733.termRef(0);
        ESLVal $3235 = _v1733.termRef(1);
        ESLVal $3234 = _v1733.termRef(2);
        ESLVal $3233 = _v1733.termRef(3);
        ESLVal $3232 = _v1733.termRef(4);
        
        {ESLVal l = $3236;
        
        {ESLVal n = $3235;
        
        {ESLVal args = $3234;
        
        {ESLVal t = $3233;
        
        {ESLVal body = $3232;
        
        return new ESLVal("JFun",expToJExp(n),map(new ESLVal(new Function(new ESLVal("fun425"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        return decToJDec(d);
          }
        }),args),new ESLVal("JFunType",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add($null);
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args),$null),expToJCommand(body,$true));
      }
      }
      }
      }
      }
      }
    case "TermRef": {ESLVal $3231 = _v1733.termRef(0);
        ESLVal $3230 = _v1733.termRef(1);
        
        {ESLVal _v1840 = $3231;
        
        {ESLVal i = $3230;
        
        return new ESLVal("JTermRef",expToJExp(_v1840),i);
      }
      }
      }
    case "Cmp": {ESLVal $3225 = _v1733.termRef(0);
        ESLVal $3224 = _v1733.termRef(1);
        ESLVal $3223 = _v1733.termRef(2);
        
        if($3223.isCons())
        {ESLVal $3226 = $3223.head();
          ESLVal $3227 = $3223.tail();
          
          switch($3226.termName) {
          case "PQual": {ESLVal $3229 = $3226.termRef(0);
            ESLVal $3228 = $3226.termRef(1);
            
            {ESLVal l = $3225;
            
            {ESLVal _v1827 = $3224;
            
            {ESLVal ql = $3229;
            
            {ESLVal p = $3228;
            
            {ESLVal qs = $3227;
            
            return expToJExp(new ESLVal("If",ql,p,new ESLVal("Cmp",l,_v1827,qs),new ESLVal("List",l,$nil)));
          }
          }
          }
          }
          }
          }
          default: {ESLVal l = $3225;
            
            {ESLVal _v1828 = $3224;
            
            {ESLVal qs = $3223;
            
            if(exists.apply(isBindingQualifier,qs).and(forall.apply(isSimpleQualifier,qs)).boolVal)
            return new ESLVal("JCmpExp",cmpToJCmp(_v1828,qs));
            else
              {ESLVal _v1829 = $3225;
                
                {ESLVal _v1830 = $3224;
                
                {ESLVal _v1831 = $3223;
                
                return cmpToJExp(_v1830,_v1831);
              }
              }
              }
          }
          }
          }
        }
        }
      else if($3223.isNil())
        {ESLVal l = $3225;
          
          {ESLVal _v1832 = $3224;
          
          {ESLVal qs = $3223;
          
          if(exists.apply(isBindingQualifier,qs).and(forall.apply(isSimpleQualifier,qs)).boolVal)
          return new ESLVal("JCmpExp",cmpToJCmp(_v1832,qs));
          else
            {ESLVal _v1833 = $3225;
              
              {ESLVal _v1834 = $3224;
              
              {ESLVal _v1835 = $3223;
              
              return cmpToJExp(_v1834,_v1835);
            }
            }
            }
        }
        }
        }
      else {ESLVal l = $3225;
          
          {ESLVal _v1836 = $3224;
          
          {ESLVal qs = $3223;
          
          if(exists.apply(isBindingQualifier,qs).and(forall.apply(isSimpleQualifier,qs)).boolVal)
          return new ESLVal("JCmpExp",cmpToJCmp(_v1836,qs));
          else
            {ESLVal _v1837 = $3225;
              
              {ESLVal _v1838 = $3224;
              
              {ESLVal _v1839 = $3223;
              
              return cmpToJExp(_v1838,_v1839);
            }
            }
            }
        }
        }
        }
      }
    case "Not": {ESLVal $3222 = _v1733.termRef(0);
        ESLVal $3221 = _v1733.termRef(1);
        
        {ESLVal l = $3222;
        
        {ESLVal _v1826 = $3221;
        
        return new ESLVal("JNot",expToJExp(_v1826));
      }
      }
      }
    case "New": {ESLVal $3220 = _v1733.termRef(0);
        ESLVal $3219 = _v1733.termRef(1);
        ESLVal $3218 = _v1733.termRef(2);
        
        {ESLVal l = $3220;
        
        {ESLVal b = $3219;
        
        {ESLVal args = $3218;
        
        return new ESLVal("JNew",expToJExp(b),expsToJExps(args));
      }
      }
      }
      }
    case "NewArray": {ESLVal $3217 = _v1733.termRef(0);
        ESLVal $3216 = _v1733.termRef(1);
        ESLVal $3215 = _v1733.termRef(2);
        
        {ESLVal l = $3217;
        
        {ESLVal t = $3216;
        
        {ESLVal i = $3215;
        
        return new ESLVal("JNewArray",expToJExp(i));
      }
      }
      }
      }
    case "NewJava": {ESLVal $3214 = _v1733.termRef(0);
        ESLVal $3213 = _v1733.termRef(1);
        ESLVal $3212 = _v1733.termRef(2);
        ESLVal $3211 = _v1733.termRef(3);
        
        {ESLVal l = $3214;
        
        {ESLVal n = $3213;
        
        {ESLVal t = $3212;
        
        {ESLVal args = $3211;
        
        return new ESLVal("JNewJava",n,expsToJExps(args));
      }
      }
      }
      }
      }
    case "NewTable": {ESLVal $3210 = _v1733.termRef(0);
        ESLVal $3209 = _v1733.termRef(1);
        ESLVal $3208 = _v1733.termRef(2);
        
        {ESLVal l = $3210;
        
        {ESLVal key = $3209;
        
        {ESLVal value = $3208;
        
        return new ESLVal("JNewTable",new ESLVal[]{});
      }
      }
      }
      }
    case "Record": {ESLVal $3207 = _v1733.termRef(0);
        ESLVal $3206 = _v1733.termRef(1);
        
        {ESLVal l = $3207;
        
        {ESLVal fs = $3206;
        
        return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1734 = $qualArg;
              
              switch(_v1734.termName) {
              case "Binding": {ESLVal $3349 = _v1734.termRef(0);
                ESLVal $3348 = _v1734.termRef(1);
                ESLVal $3347 = _v1734.termRef(2);
                ESLVal $3346 = _v1734.termRef(3);
                ESLVal $3345 = _v1734.termRef(4);
                
                {ESLVal bl = $3349;
                
                {ESLVal n = $3348;
                
                {ESLVal t = $3347;
                
                {ESLVal dt = $3346;
                
                {ESLVal _v1825 = $3345;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JField",n,$null,expToJExp(_v1825))));
              }
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v1734;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten());
      }
      }
      }
    case "Send": {ESLVal $3201 = _v1733.termRef(0);
        ESLVal $3200 = _v1733.termRef(1);
        ESLVal $3199 = _v1733.termRef(2);
        
        switch($3199.termName) {
        case "Term": {ESLVal $3205 = $3199.termRef(0);
          ESLVal $3204 = $3199.termRef(1);
          ESLVal $3203 = $3199.termRef(2);
          ESLVal $3202 = $3199.termRef(3);
          
          {ESLVal l = $3201;
          
          {ESLVal a = $3200;
          
          {ESLVal lt = $3205;
          
          {ESLVal n = $3204;
          
          {ESLVal ts = $3203;
          
          {ESLVal es = $3202;
          
          return new ESLVal("JSend",expToJExp(a),n,expsToJExps(es));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7891,16696)").add(ESLVal.list(_v1733)));
      }
      }
    case "SendTimeSuper": {ESLVal $3198 = _v1733.termRef(0);
        
        {ESLVal l = $3198;
        
        return new ESLVal("JSendTimeSuper",new ESLVal[]{});
      }
      }
    case "SendSuper": {ESLVal $3197 = _v1733.termRef(0);
        ESLVal $3196 = _v1733.termRef(1);
        
        {ESLVal l = $3197;
        
        {ESLVal _v1824 = $3196;
        
        return new ESLVal("JSendSuper",expToJExp(_v1824));
      }
      }
      }
    case "Self": {ESLVal $3195 = _v1733.termRef(0);
        
        {ESLVal l = $3195;
        
        return new ESLVal("JSelf",new ESLVal[]{});
      }
      }
    case "Fold": {ESLVal $3194 = _v1733.termRef(0);
        ESLVal $3193 = _v1733.termRef(1);
        ESLVal $3192 = _v1733.termRef(2);
        
        {ESLVal l = $3194;
        
        {ESLVal t = $3193;
        
        {ESLVal _v1823 = $3192;
        
        return expToJExp(_v1823);
      }
      }
      }
      }
    case "Now": {ESLVal $3191 = _v1733.termRef(0);
        
        {ESLVal l = $3191;
        
        return new ESLVal("JNow",new ESLVal[]{});
      }
      }
    case "Ref": {ESLVal $3190 = _v1733.termRef(0);
        ESLVal $3189 = _v1733.termRef(1);
        ESLVal $3188 = _v1733.termRef(2);
        
        {ESLVal l = $3190;
        
        {ESLVal _v1822 = $3189;
        
        {ESLVal n = $3188;
        
        return new ESLVal("JRef",expToJExp(_v1822),n);
      }
      }
      }
      }
    case "RefSuper": {ESLVal $3187 = _v1733.termRef(0);
        ESLVal $3186 = _v1733.termRef(1);
        
        {ESLVal l = $3187;
        
        {ESLVal n = $3186;
        
        return new ESLVal("JRefSuper",n);
      }
      }
      }
    case "For": {ESLVal $3185 = _v1733.termRef(0);
        ESLVal $3184 = _v1733.termRef(1);
        ESLVal $3183 = _v1733.termRef(2);
        ESLVal $3182 = _v1733.termRef(3);
        
        {ESLVal l1 = $3185;
        
        {ESLVal p = $3184;
        
        {ESLVal l2 = $3183;
        
        {ESLVal c = $3182;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
      }
    case "Grab": {ESLVal $3181 = _v1733.termRef(0);
        ESLVal $3180 = _v1733.termRef(1);
        ESLVal $3179 = _v1733.termRef(2);
        
        {ESLVal l = $3181;
        
        {ESLVal refs = $3180;
        
        {ESLVal _v1821 = $3179;
        
        return new ESLVal("JGrab",refsToJExps(refs),expToJExp(_v1821));
      }
      }
      }
      }
    case "Update": {ESLVal $3178 = _v1733.termRef(0);
        ESLVal $3177 = _v1733.termRef(1);
        ESLVal $3176 = _v1733.termRef(2);
        
        {ESLVal l = $3178;
        
        {ESLVal n = $3177;
        
        {ESLVal v = $3176;
        
        return new ESLVal("JCommandExp",expToJCommand(e,$true),$null);
      }
      }
      }
      }
    case "Probably": {ESLVal $3175 = _v1733.termRef(0);
        ESLVal $3174 = _v1733.termRef(1);
        ESLVal $3173 = _v1733.termRef(2);
        ESLVal $3172 = _v1733.termRef(3);
        ESLVal $3171 = _v1733.termRef(4);
        
        {ESLVal l = $3175;
        
        {ESLVal _v1820 = $3174;
        
        {ESLVal t = $3173;
        
        {ESLVal e1 = $3172;
        
        {ESLVal e2 = $3171;
        
        return new ESLVal("JProbably",expToJExp(_v1820),expToJExp(e1),expToJExp(e2));
      }
      }
      }
      }
      }
      }
    case "Try": {ESLVal $3170 = _v1733.termRef(0);
        ESLVal $3169 = _v1733.termRef(1);
        ESLVal $3168 = _v1733.termRef(2);
        
        {ESLVal l = $3170;
        
        {ESLVal _v1819 = $3169;
        
        {ESLVal arms = $3168;
        
        return new ESLVal("JTry",expToJExp(_v1819),new ESLVal("$x"),expToJCommand(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
      }
      }
      }
      }
    case "ActExp": {ESLVal $3167 = _v1733.termRef(0);
        ESLVal $3166 = _v1733.termRef(1);
        ESLVal $3165 = _v1733.termRef(2);
        ESLVal $3164 = _v1733.termRef(3);
        ESLVal $3163 = _v1733.termRef(4);
        ESLVal $3162 = _v1733.termRef(5);
        ESLVal $3161 = _v1733.termRef(6);
        ESLVal $3160 = _v1733.termRef(7);
        
        {ESLVal l = $3167;
        
        {ESLVal name = $3166;
        
        {ESLVal decs = $3165;
        
        {ESLVal exports = $3164;
        
        {ESLVal parent = $3163;
        
        {ESLVal defs = $3162;
        
        {ESLVal init = $3161;
        
        {ESLVal arms = $3160;
        
        return actToJava(name,decs,exports,parent,expandFunDefs(mergeFunDefs(defs)),init,arms);
      }
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(7891,16696)").add(ESLVal.list(_v1733)));
    }
    }
  }
  private static ESLVal expToJExp = new ESLVal(new Function(new ESLVal("expToJExp"),null) { public ESLVal apply(ESLVal... args) { return expToJExp(args[0]); }});
  private static ESLVal isSimpleQualifier(ESLVal q) {
    
    {ESLVal _v1735 = q;
      
      switch(_v1735.termName) {
      case "BQual": {ESLVal $3352 = _v1735.termRef(0);
        ESLVal $3351 = _v1735.termRef(1);
        ESLVal $3350 = _v1735.termRef(2);
        
        switch($3351.termName) {
        case "PVar": {ESLVal $3355 = $3351.termRef(0);
          ESLVal $3354 = $3351.termRef(1);
          ESLVal $3353 = $3351.termRef(2);
          
          {ESLVal l = $3352;
          
          {ESLVal vl = $3355;
          
          {ESLVal n = $3354;
          
          {ESLVal t = $3353;
          
          {ESLVal e = $3350;
          
          return $true;
        }
        }
        }
        }
        }
        }
        default: {ESLVal l = $3352;
          
          {ESLVal p = $3351;
          
          {ESLVal e = $3350;
          
          return $false;
        }
        }
        }
      }
      }
      default: {ESLVal _v1818 = _v1735;
        
        return $true;
      }
    }
    }
  }
  private static ESLVal isSimpleQualifier = new ESLVal(new Function(new ESLVal("isSimpleQualifier"),null) { public ESLVal apply(ESLVal... args) { return isSimpleQualifier(args[0]); }});
  private static ESLVal isBindingQualifier(ESLVal q) {
    
    {ESLVal _v1736 = q;
      
      switch(_v1736.termName) {
      case "BQual": {ESLVal $3358 = _v1736.termRef(0);
        ESLVal $3357 = _v1736.termRef(1);
        ESLVal $3356 = _v1736.termRef(2);
        
        {ESLVal l = $3358;
        
        {ESLVal p = $3357;
        
        {ESLVal e = $3356;
        
        return $true;
      }
      }
      }
      }
      default: {ESLVal _v1817 = _v1736;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isBindingQualifier = new ESLVal(new Function(new ESLVal("isBindingQualifier"),null) { public ESLVal apply(ESLVal... args) { return isBindingQualifier(args[0]); }});
  private static ESLVal cmpToJCmp(ESLVal e,ESLVal qs) {
    
    { LetRec letrec = new LetRec() {
      ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1812 = $args[0];
        {ESLVal _v1737 = _v1812;
              
              if(_v1737.isCons())
              {ESLVal $3359 = _v1737.head();
                ESLVal $3360 = _v1737.tail();
                
                switch($3359.termName) {
                case "BQual": {ESLVal $3365 = $3359.termRef(0);
                  ESLVal $3364 = $3359.termRef(1);
                  ESLVal $3363 = $3359.termRef(2);
                  
                  switch($3364.termName) {
                  case "PVar": {ESLVal $3368 = $3364.termRef(0);
                    ESLVal $3367 = $3364.termRef(1);
                    ESLVal $3366 = $3364.termRef(2);
                    
                    {ESLVal l = $3365;
                    
                    {ESLVal vl = $3368;
                    
                    {ESLVal n = $3367;
                    
                    {ESLVal t = $3366;
                    
                    {ESLVal listExp = $3363;
                    
                    {ESLVal _v1814 = $3360;
                    
                    return new ESLVal("JCmpBind",n,expToJExp(listExp),inner.apply(_v1814));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(17101,17299)").add(ESLVal.list(_v1737)));
                }
                }
              case "PQual": {ESLVal $3362 = $3359.termRef(0);
                  ESLVal $3361 = $3359.termRef(1);
                  
                  {ESLVal l = $3362;
                  
                  {ESLVal p = $3361;
                  
                  {ESLVal _v1813 = $3360;
                  
                  return new ESLVal("JCmpIf",expToJExp(p),inner.apply(_v1813));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(17101,17299)").add(ESLVal.list(_v1737)));
              }
              }
            else if(_v1737.isNil())
              return new ESLVal("JCmpList",expToJExp(e));
            else return error(new ESLVal("case error at Pos(17101,17299)").add(ESLVal.list(_v1737)));
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "inner": return inner;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal inner = letrec.get("inner");
    
      {ESLVal _v1738 = qs;
      
      if(_v1738.isCons())
      {ESLVal $3369 = _v1738.head();
        ESLVal $3370 = _v1738.tail();
        
        switch($3369.termName) {
        case "BQual": {ESLVal $3375 = $3369.termRef(0);
          ESLVal $3374 = $3369.termRef(1);
          ESLVal $3373 = $3369.termRef(2);
          
          switch($3374.termName) {
          case "PVar": {ESLVal $3378 = $3374.termRef(0);
            ESLVal $3377 = $3374.termRef(1);
            ESLVal $3376 = $3374.termRef(2);
            
            {ESLVal l = $3375;
            
            {ESLVal vl = $3378;
            
            {ESLVal n = $3377;
            
            {ESLVal t = $3376;
            
            {ESLVal listExp = $3373;
            
            {ESLVal _v1816 = $3370;
            
            return new ESLVal("JCmpOuter",n,expToJExp(listExp),inner.apply(_v1816));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(17311,17508)").add(ESLVal.list(_v1738)));
        }
        }
      case "PQual": {ESLVal $3372 = $3369.termRef(0);
          ESLVal $3371 = $3369.termRef(1);
          
          {ESLVal l = $3372;
          
          {ESLVal p = $3371;
          
          {ESLVal _v1815 = $3370;
          
          return new ESLVal("JCmpIf",expToJExp(p),cmpToJCmp(e,_v1815));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17311,17508)").add(ESLVal.list(_v1738)));
      }
      }
    else if(_v1738.isNil())
      return new ESLVal("JCmpList",expToJExp(e));
    else return error(new ESLVal("case error at Pos(17311,17508)").add(ESLVal.list(_v1738)));
    }}
    
  }
  private static ESLVal cmpToJCmp = new ESLVal(new Function(new ESLVal("cmpToJCmp"),null) { public ESLVal apply(ESLVal... args) { return cmpToJCmp(args[0],args[1]); }});
  private static ESLVal refsToJExps(ESLVal refs) {
    
    {ESLVal _v1739 = refs;
      
      if(_v1739.isCons())
      {ESLVal $3379 = _v1739.head();
        ESLVal $3380 = _v1739.tail();
        
        switch($3379.termName) {
        case "VarDynamicRef": {ESLVal $3385 = $3379.termRef(0);
          ESLVal $3384 = $3379.termRef(1);
          
          switch($3384.termName) {
          case "Var": {ESLVal $3387 = $3384.termRef(0);
            ESLVal $3386 = $3384.termRef(1);
            
            {ESLVal l = $3385;
            
            {ESLVal vl = $3387;
            
            {ESLVal n = $3386;
            
            {ESLVal _v1811 = $3380;
            
            return refsToJExps(_v1811).cons(new ESLVal("JVar",n,$null));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(17555,17796)").add(ESLVal.list(_v1739)));
        }
        }
      case "ActorDynamicRef": {ESLVal $3383 = $3379.termRef(0);
          ESLVal $3382 = $3379.termRef(1);
          ESLVal $3381 = $3379.termRef(2);
          
          {ESLVal l = $3383;
          
          {ESLVal e = $3382;
          
          {ESLVal n = $3381;
          
          {ESLVal _v1810 = $3380;
          
          return refsToJExps(_v1810).cons(new ESLVal("JRef",expToJExp(e),n));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17555,17796)").add(ESLVal.list(_v1739)));
      }
      }
    else if(_v1739.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(17555,17796)").add(ESLVal.list(_v1739)));
    }
  }
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),null) { public ESLVal apply(ESLVal... args) { return refsToJExps(args[0]); }});
  private static ESLVal actToJava(ESLVal name,ESLVal decs,ESLVal exports,ESLVal parent,ESLVal defs,ESLVal init,ESLVal arms) {
    
    if(parent.eql($null).boolVal)
      return simpleActToJava(name,decs,exports,defs,init,arms);
      else
        return extendedActToJava(name,decs,exports,parent,defs,init,arms);
  }
  private static ESLVal actToJava = new ESLVal(new Function(new ESLVal("actToJava"),null) { public ESLVal apply(ESLVal... args) { return actToJava(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal wrapListeners(ESLVal exports,ESLVal body) {
    
    {ESLVal p0 = new ESLVal("Pos",$zero,$zero);
      ESLVal t0 = $null;
      
      if(member.apply(new ESLVal("observeState"),exports).boolVal)
      return new ESLVal("Block",p0,ESLVal.list(body,new ESLVal("Let",p0,ESLVal.list(new ESLVal("Binding",p0,new ESLVal("$s"),t0,t0,new ESLVal("Apply",p0,new ESLVal("Var",p0,new ESLVal("observeState")),$nil))),new ESLVal("For",p0,new ESLVal("PVar",p0,new ESLVal("$o"),t0),new ESLVal("Var",p0,new ESLVal("$observers")),new ESLVal("Case",p0,$nil,ESLVal.list(new ESLVal("Apply",p0,new ESLVal("Var",p0,new ESLVal("observeMessage")),ESLVal.list(new ESLVal("Var",p0,new ESLVal("$m"))))),ESLVal.list(new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PTerm",p0,new ESLVal("Something"),$nil,ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$x"),$null)))),new ESLVal("BoolExp",p0,$true),new ESLVal("Send",p0,new ESLVal("Var",p0,new ESLVal("$o")),new ESLVal("Term",p0,new ESLVal("Transition"),$nil,ESLVal.list(new ESLVal("Self",p0),new ESLVal("Now",p0),new ESLVal("Var",p0,new ESLVal("$x")),new ESLVal("Var",p0,new ESLVal("$s")))))),new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PTerm",p0,new ESLVal("Nothing"),$nil,$nil)),new ESLVal("BoolExp",p0,$true),new ESLVal("Block",p0,$nil))))))));
      else
        return body;
    }
  }
  private static ESLVal wrapListeners = new ESLVal(new Function(new ESLVal("wrapListeners"),null) { public ESLVal apply(ESLVal... args) { return wrapListeners(args[0],args[1]); }});
  private static ESLVal simpleActToJava(ESLVal name,ESLVal decs,ESLVal exports,ESLVal defs,ESLVal init,ESLVal arms) {
    
    {ESLVal timeArms = select(isTimeArm,arms);
      
      {ESLVal nonTimeArms = reject(isTimeArm,arms);
      
      {ESLVal timeCommand = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(timeArms.eql($nil).boolVal)
            return new ESLVal("JBlock",$nil);
            else
              return timeArmsToJCommand(timeArms);
        }}.get();
      
      {ESLVal observers = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(new ESLVal("observeState"),exports).boolVal)
            return ESLVal.list(new ESLVal("JField",new ESLVal("$observers"),$null,new ESLVal("JList",$null,$nil)));
            else
              return $nil;
        }}.get();
      
      {ESLVal addObserver = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(new ESLVal("observeState"),exports).boolVal)
            return ESLVal.list(addObserverJField);
            else
              return $nil;
        }}.get();
      
      {ESLVal xAdd = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(new ESLVal("observeState"),exports).boolVal)
            return ESLVal.list(new ESLVal("addObserver"));
            else
              return $nil;
        }}.get();
      
      {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),wrapListeners(exports,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms)));
      ESLVal methods = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              if(isFunBind(m).boolVal) {$v.add(m);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs);
      ESLVal fields = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              if(isBinding(f).boolVal) {$v.add(f);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs);
      
      return new ESLVal("JBehaviour",exports.add(xAdd),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal b = $l0.head();
            $l0 = $l0.tail();
            $v.add(defToField(b));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(fields).add(observers.add(addObserver)),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal m = $l0.head();
            $l0 = $l0.tail();
            $v.add(defToMethod(m));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(methods),expToJExp(init),expToJExp(f),timeCommand);
    }
    }
    }
    }
    }
    }
    }
  }
  private static ESLVal simpleActToJava = new ESLVal(new Function(new ESLVal("simpleActToJava"),null) { public ESLVal apply(ESLVal... args) { return simpleActToJava(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal extendedActToJava(ESLVal name,ESLVal decs,ESLVal exports,ESLVal parent,ESLVal defs,ESLVal init,ESLVal arms) {
    
    {ESLVal p0 = new ESLVal("Pos",$zero,$zero);
      
      {ESLVal timeSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PTerm",p0,new ESLVal("Time"),$nil,ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$"),$null)))),new ESLVal("BoolExp",p0,$true),new ESLVal("SendTimeSuper",p0));
      
      {ESLVal timeArms = select(isTimeArm,arms).add(ESLVal.list(timeSuper));
      
      {ESLVal messageSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$m"),$null)),new ESLVal("BoolExp",p0,$true),new ESLVal("Block",p0,ESLVal.list(new ESLVal("SendSuper",p0,new ESLVal("Var",p0,new ESLVal("$m"))),new ESLVal("NullExp",p0))));
      
      {ESLVal nonTimeArms = reject(isTimeArm,arms).add(ESLVal.list(messageSuper));
      
      {ESLVal timeCommand = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(timeArms.eql($nil).boolVal)
            return new ESLVal("JBlock",$nil);
            else
              return timeArmsToJCommand(timeArms);
        }}.get();
      
      {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),wrapListeners(exports,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms)));
      ESLVal methods = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              if(isFunBind(m).boolVal) {$v.add(m);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs);
      ESLVal fields = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              if(isBinding(f).boolVal) {$v.add(f);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs);
      
      return new ESLVal("JExtendedBehaviour",exports,expToJExp(parent),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal b = $l0.head();
            $l0 = $l0.tail();
            $v.add(defToField(b));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(fields),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal m = $l0.head();
            $l0 = $l0.tail();
            $v.add(defToMethod(m));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(methods),expToJExp(init),expToJExp(f),timeCommand);
    }
    }
    }
    }
    }
    }
    }
  }
  private static ESLVal extendedActToJava = new ESLVal(new Function(new ESLVal("extendedActToJava"),null) { public ESLVal apply(ESLVal... args) { return extendedActToJava(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal isTimeArm(ESLVal a) {
    
    {ESLVal _v1740 = a;
      
      switch(_v1740.termName) {
      case "BArm": {ESLVal $3391 = _v1740.termRef(0);
        ESLVal $3390 = _v1740.termRef(1);
        ESLVal $3389 = _v1740.termRef(2);
        ESLVal $3388 = _v1740.termRef(3);
        
        if($3390.isCons())
        {ESLVal $3392 = $3390.head();
          ESLVal $3393 = $3390.tail();
          
          switch($3392.termName) {
          case "PTerm": {ESLVal $3397 = $3392.termRef(0);
            ESLVal $3396 = $3392.termRef(1);
            ESLVal $3395 = $3392.termRef(2);
            ESLVal $3394 = $3392.termRef(3);
            
            switch($3396.strVal) {
            case "Time": if($3393.isCons())
              {ESLVal $3398 = $3393.head();
                ESLVal $3399 = $3393.tail();
                
                {ESLVal _v1803 = _v1740;
                
                return $false;
              }
              }
            else if($3393.isNil())
              {ESLVal l = $3391;
                
                {ESLVal pl = $3397;
                
                {ESLVal ts = $3395;
                
                {ESLVal ps = $3394;
                
                {ESLVal g = $3389;
                
                {ESLVal e = $3388;
                
                return $true;
              }
              }
              }
              }
              }
              }
            else {ESLVal _v1804 = _v1740;
                
                return $false;
              }
            default: {ESLVal _v1805 = _v1740;
              
              return $false;
            }
          }
          }
          default: {ESLVal _v1806 = _v1740;
            
            return $false;
          }
        }
        }
      else if($3390.isNil())
        {ESLVal _v1807 = _v1740;
          
          return $false;
        }
      else {ESLVal _v1808 = _v1740;
          
          return $false;
        }
      }
      default: {ESLVal _v1809 = _v1740;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isTimeArm = new ESLVal(new Function(new ESLVal("isTimeArm"),null) { public ESLVal apply(ESLVal... args) { return isTimeArm(args[0]); }});
  private static ESLVal timeArmsToJCommand(ESLVal arms) {
    
    {ESLVal _v1741 = arms;
      
      if(_v1741.isCons())
      {ESLVal $3400 = _v1741.head();
        ESLVal $3401 = _v1741.tail();
        
        switch($3400.termName) {
        case "BArm": {ESLVal $3405 = $3400.termRef(0);
          ESLVal $3404 = $3400.termRef(1);
          ESLVal $3403 = $3400.termRef(2);
          ESLVal $3402 = $3400.termRef(3);
          
          if($3404.isCons())
          {ESLVal $3406 = $3404.head();
            ESLVal $3407 = $3404.tail();
            
            switch($3406.termName) {
            case "PTerm": {ESLVal $3411 = $3406.termRef(0);
              ESLVal $3410 = $3406.termRef(1);
              ESLVal $3409 = $3406.termRef(2);
              ESLVal $3408 = $3406.termRef(3);
              
              switch($3410.strVal) {
              case "Time": if($3409.isCons())
                {ESLVal $3412 = $3409.head();
                  ESLVal $3413 = $3409.tail();
                  
                  return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                }
              else if($3409.isNil())
                if($3408.isCons())
                  {ESLVal $3414 = $3408.head();
                    ESLVal $3415 = $3408.tail();
                    
                    switch($3414.termName) {
                    case "PVar": {ESLVal $3426 = $3414.termRef(0);
                      ESLVal $3425 = $3414.termRef(1);
                      ESLVal $3424 = $3414.termRef(2);
                      
                      if($3415.isCons())
                      {ESLVal $3427 = $3415.head();
                        ESLVal $3428 = $3415.tail();
                        
                        return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                      }
                    else if($3415.isNil())
                      if($3407.isCons())
                        {ESLVal $3429 = $3407.head();
                          ESLVal $3430 = $3407.tail();
                          
                          return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                        }
                      else if($3407.isNil())
                        {ESLVal l = $3405;
                          
                          {ESLVal tl = $3411;
                          
                          {ESLVal vl = $3426;
                          
                          {ESLVal n = $3425;
                          
                          {ESLVal t = $3424;
                          
                          {ESLVal g = $3403;
                          
                          {ESLVal e = $3402;
                          
                          {ESLVal _v1802 = $3401;
                          
                          return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp(g),expToJCommand(e,$false),timeArmsToJCommand(_v1802)));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                    else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                    }
                  case "PInt": {ESLVal $3417 = $3414.termRef(0);
                      ESLVal $3416 = $3414.termRef(1);
                      
                      if($3415.isCons())
                      {ESLVal $3418 = $3415.head();
                        ESLVal $3419 = $3415.tail();
                        
                        return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                      }
                    else if($3415.isNil())
                      if($3407.isCons())
                        {ESLVal $3420 = $3407.head();
                          ESLVal $3421 = $3407.tail();
                          
                          return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                        }
                      else if($3407.isNil())
                        switch($3403.termName) {
                          case "BoolExp": {ESLVal $3423 = $3403.termRef(0);
                            ESLVal $3422 = $3403.termRef(1);
                            
                            switch($3422.boolVal ? 1 : 0) {
                            case 1: {ESLVal l = $3405;
                              
                              {ESLVal tl = $3411;
                              
                              {ESLVal vl = $3417;
                              
                              {ESLVal n = $3416;
                              
                              {ESLVal bl = $3423;
                              
                              {ESLVal e = $3402;
                              
                              {ESLVal _v1801 = $3401;
                              
                              return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand(e,$false),timeArmsToJCommand(_v1801));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                        }
                      else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                    else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                    }
                    default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                  }
                  }
                else if($3408.isNil())
                  return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
                else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
              else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
              default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
            }
            }
            default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
          }
          }
        else if($3404.isNil())
          return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
        else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
        }
        default: return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
      }
      }
    else if(_v1741.isNil())
      return new ESLVal("JBlock",$nil);
    else return error(new ESLVal("case error at Pos(21723,22253)").add(ESLVal.list(_v1741)));
    }
  }
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),null) { public ESLVal apply(ESLVal... args) { return timeArmsToJCommand(args[0]); }});
  private static ESLVal cmpToJExp(ESLVal e,ESLVal qs) {
    
    {ESLVal _v1742 = qs;
      
      if(_v1742.isCons())
      {ESLVal $3431 = _v1742.head();
        ESLVal $3432 = _v1742.tail();
        
        switch($3431.termName) {
        case "BQual": {ESLVal $3437 = $3431.termRef(0);
          ESLVal $3436 = $3431.termRef(1);
          ESLVal $3435 = $3431.termRef(2);
          
          {ESLVal l = $3437;
          
          {ESLVal p = $3436;
          
          {ESLVal v = $3435;
          
          {ESLVal _v1800 = $3432;
          
          {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v1800)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
          
          return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp(f),expToJExp(v))));
        }
        }
        }
        }
        }
        }
      case "PQual": {ESLVal $3434 = $3431.termRef(0);
          ESLVal $3433 = $3431.termRef(1);
          
          {ESLVal l = $3434;
          
          {ESLVal p = $3433;
          
          {ESLVal _v1799 = $3432;
          
          return new ESLVal("JIfExp",expToJExp(p),cmpToJExp(e,_v1799),new ESLVal("JNil",$null));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(22300,22968)").add(ESLVal.list(_v1742)));
      }
      }
    else if(_v1742.isNil())
      return new ESLVal("JList",$null,ESLVal.list(expToJExp(e)));
    else return error(new ESLVal("case error at Pos(22300,22968)").add(ESLVal.list(_v1742)));
    }
  }
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),null) { public ESLVal apply(ESLVal... args) { return cmpToJExp(args[0],args[1]); }});
  public static ESLVal moduleToJava(ESLVal module) {
    
    {ESLVal _v1743 = module;
      
      switch(_v1743.termName) {
      case "Module": {ESLVal $3444 = _v1743.termRef(0);
        ESLVal $3443 = _v1743.termRef(1);
        ESLVal $3442 = _v1743.termRef(2);
        ESLVal $3441 = _v1743.termRef(3);
        ESLVal $3440 = _v1743.termRef(4);
        ESLVal $3439 = _v1743.termRef(5);
        ESLVal $3438 = _v1743.termRef(6);
        
        {ESLVal path = $3444;
        
        {ESLVal name = $3443;
        
        {ESLVal exports = $3442;
        
        {ESLVal imports = $3441;
        
        {ESLVal x = $3440;
        
        {ESLVal y = $3439;
        
        {ESLVal defs = $3438;
        
        {ESLVal _v1798 = expandFunDefs(mergeFunDefs(defs));
        
        {ESLVal methods = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                if(isFunBind(m).boolVal) {$v.add(m);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(_v1798);
        ESLVal fields = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal f = $l0.head();
                $l0 = $l0.tail();
                if(isBinding(f).boolVal) {$v.add(f);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(_v1798);
        
        return renameJVarsModule(new ESLVal("JModule",name,exports,imports,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToMethod(m));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(methods),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField(d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(fields)));
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
      default: return error(new ESLVal("case error at Pos(23006,23468)").add(ESLVal.list(_v1743)));
    }
    }
  }
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),null) { public ESLVal apply(ESLVal... args) { return moduleToJava(args[0]); }});
  private static ESLVal renameJVarsModule(ESLVal m) {
    
    {ESLVal _v1744 = m;
      
      switch(_v1744.termName) {
      case "JModule": {ESLVal $3449 = _v1744.termRef(0);
        ESLVal $3448 = _v1744.termRef(1);
        ESLVal $3447 = _v1744.termRef(2);
        ESLVal $3446 = _v1744.termRef(3);
        ESLVal $3445 = _v1744.termRef(4);
        
        {ESLVal name = $3449;
        
        {ESLVal exports = $3448;
        
        {ESLVal imports = $3447;
        
        {ESLVal ms = $3446;
        
        {ESLVal fs = $3445;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1745 = $qualArg;
                
                switch(_v1745.termName) {
                case "JField": {ESLVal $3452 = _v1745.termRef(0);
                  ESLVal $3451 = _v1745.termRef(1);
                  ESLVal $3450 = _v1745.termRef(2);
                  
                  {ESLVal n = $3452;
                  
                  {ESLVal t = $3451;
                  
                  {ESLVal e = $3450;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1745;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        
        {ESLVal newFields = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1746 = $qualArg;
                
                switch(_v1746.termName) {
                case "JField": {ESLVal $3455 = _v1746.termRef(0);
                  ESLVal $3454 = _v1746.termRef(1);
                  ESLVal $3453 = _v1746.termRef(2);
                  
                  {ESLVal n = $3455;
                  
                  {ESLVal t = $3454;
                  
                  {ESLVal e = $3453;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1746;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        ESLVal newMethods = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1747 = $qualArg;
                
                switch(_v1747.termName) {
                case "JMethod": {ESLVal $3458 = _v1747.termRef(0);
                  ESLVal $3457 = _v1747.termRef(1);
                  ESLVal $3456 = _v1747.termRef(2);
                  
                  {ESLVal n = $3458;
                  
                  {ESLVal args = $3457;
                  
                  {ESLVal body = $3456;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JMethod",n,args,renameJVarsCommand(body,fieldNames.add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1796 = $args[0];
                  {ESLVal _v1748 = _v1796;
                        
                        switch(_v1748.termName) {
                        case "JDec": {ESLVal $3460 = _v1748.termRef(0);
                          ESLVal $3459 = _v1748.termRef(1);
                          
                          {ESLVal _v1797 = $3460;
                          
                          {ESLVal t = $3459;
                          
                          return ESLVal.list(ESLVal.list(_v1797));
                        }
                        }
                        }
                        default: {ESLVal _0 = _v1748;
                          
                          return $nil;
                        }
                      }
                      }
                    }
                  }).map(args).flatten().flatten()),emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1747;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(ms).flatten().flatten();
        
        return new ESLVal("JModule",name,exports,imports,newMethods,newFields);
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(23508,24061)").add(ESLVal.list(_v1744)));
    }
    }
  }
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),null) { public ESLVal apply(ESLVal... args) { return renameJVarsModule(args[0]); }});
  private static ESLVal renameJVarsExp(ESLVal e,ESLVal vars,ESLVal env) {
    
    {ESLVal _v1749 = e;
      
      switch(_v1749.termName) {
      case "JFun": {ESLVal $3542 = _v1749.termRef(0);
        ESLVal $3541 = _v1749.termRef(1);
        ESLVal $3540 = _v1749.termRef(2);
        ESLVal $3539 = _v1749.termRef(3);
        
        {ESLVal v0 = $3542;
        
        {ESLVal v1 = $3541;
        
        {ESLVal v2 = $3540;
        
        {ESLVal v3 = $3539;
        
        {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1753 = $qualArg;
                
                switch(_v1753.termName) {
                case "JDec": {ESLVal $3553 = _v1753.termRef(0);
                  ESLVal $3552 = _v1753.termRef(1);
                  
                  {ESLVal n = $3553;
                  
                  {ESLVal t = $3552;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                default: {ESLVal _0 = _v1753;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v1).flatten().flatten();
        
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun426"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal n = $args[0];
      return member.apply(n,boundNames);
        }
      }),vars).boolVal)
        {ESLVal newNames = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newName());
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(boundNames);
          
          {ESLVal env1 = addEntries(boundNames,newNames,env);
          
          return new ESLVal("JFun",v0,new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                $v.add(new ESLVal("JDec",n,$null));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(newNames),v2,renameJVarsCommand(v3,boundNames.add(vars),env1));
        }
        }
        else
          return new ESLVal("JFun",v0,v1,v2,renameJVarsCommand(v3,boundNames.add(vars),env));
      }
      }
      }
      }
      }
      }
    case "JApply": {ESLVal $3538 = _v1749.termRef(0);
        ESLVal $3537 = _v1749.termRef(1);
        
        {ESLVal v0 = $3538;
        
        {ESLVal v1 = $3537;
        
        return new ESLVal("JApply",renameJVarsExp(v0,vars,env),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1));
      }
      }
      }
    case "JArrayRef": {ESLVal $3536 = _v1749.termRef(0);
        ESLVal $3535 = _v1749.termRef(1);
        
        {ESLVal a = $3536;
        
        {ESLVal i = $3535;
        
        return new ESLVal("JArrayRef",renameJVarsExp(a,vars,env),renameJVarsExp(i,vars,env));
      }
      }
      }
    case "JArrayUpdate": {ESLVal $3534 = _v1749.termRef(0);
        ESLVal $3533 = _v1749.termRef(1);
        ESLVal $3532 = _v1749.termRef(2);
        
        {ESLVal a = $3534;
        
        {ESLVal i = $3533;
        
        {ESLVal v = $3532;
        
        return new ESLVal("JArrayUpdate",renameJVarsExp(a,vars,env),renameJVarsExp(i,vars,env),renameJVarsExp(v,vars,env));
      }
      }
      }
      }
    case "JBecome": {ESLVal $3531 = _v1749.termRef(0);
        ESLVal $3530 = _v1749.termRef(1);
        
        {ESLVal _v1795 = $3531;
        
        {ESLVal es = $3530;
        
        return new ESLVal("JBecome",renameJVarsExp(_v1795,vars,env),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "JBinExp": {ESLVal $3529 = _v1749.termRef(0);
        ESLVal $3528 = _v1749.termRef(1);
        ESLVal $3527 = _v1749.termRef(2);
        
        {ESLVal v0 = $3529;
        
        {ESLVal v1 = $3528;
        
        {ESLVal v2 = $3527;
        
        return new ESLVal("JBinExp",renameJVarsExp(v0,vars,env),v1,renameJVarsExp(v2,vars,env));
      }
      }
      }
      }
    case "JCommandExp": {ESLVal $3526 = _v1749.termRef(0);
        ESLVal $3525 = _v1749.termRef(1);
        
        {ESLVal v0 = $3526;
        
        {ESLVal v1 = $3525;
        
        return new ESLVal("JCommandExp",renameJVarsCommand(v0,vars,env),v1);
      }
      }
      }
    case "JIfExp": {ESLVal $3524 = _v1749.termRef(0);
        ESLVal $3523 = _v1749.termRef(1);
        ESLVal $3522 = _v1749.termRef(2);
        
        {ESLVal v0 = $3524;
        
        {ESLVal v1 = $3523;
        
        {ESLVal v2 = $3522;
        
        return new ESLVal("JIfExp",renameJVarsExp(v0,vars,env),renameJVarsExp(v1,vars,env),renameJVarsExp(v2,vars,env));
      }
      }
      }
      }
    case "JConstExp": {ESLVal $3521 = _v1749.termRef(0);
        
        {ESLVal v0 = $3521;
        
        return e;
      }
      }
    case "JTerm": {ESLVal $3520 = _v1749.termRef(0);
        ESLVal $3519 = _v1749.termRef(1);
        
        {ESLVal v0 = $3520;
        
        {ESLVal v1 = $3519;
        
        return new ESLVal("JTerm",v0,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1));
      }
      }
      }
    case "JTermRef": {ESLVal $3518 = _v1749.termRef(0);
        ESLVal $3517 = _v1749.termRef(1);
        
        {ESLVal v0 = $3518;
        
        {ESLVal v1 = $3517;
        
        return new ESLVal("JTermRef",renameJVarsExp(v0,vars,env),v1);
      }
      }
      }
    case "JList": {ESLVal $3516 = _v1749.termRef(0);
        ESLVal $3515 = _v1749.termRef(1);
        
        {ESLVal v0 = $3516;
        
        {ESLVal v1 = $3515;
        
        return new ESLVal("JList",v0,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1));
      }
      }
      }
    case "JSet": {ESLVal $3514 = _v1749.termRef(0);
        ESLVal $3513 = _v1749.termRef(1);
        
        {ESLVal v0 = $3514;
        
        {ESLVal v1 = $3513;
        
        return new ESLVal("JSet",v0,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1));
      }
      }
      }
    case "JBag": {ESLVal $3512 = _v1749.termRef(0);
        ESLVal $3511 = _v1749.termRef(1);
        
        {ESLVal v0 = $3512;
        
        {ESLVal v1 = $3511;
        
        return new ESLVal("JBag",v0,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(v,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1));
      }
      }
      }
    case "JNil": {ESLVal $3510 = _v1749.termRef(0);
        
        {ESLVal v0 = $3510;
        
        return e;
      }
      }
    case "JNow": {
        return e;
      }
    case "JVar": {ESLVal $3509 = _v1749.termRef(0);
        ESLVal $3508 = _v1749.termRef(1);
        
        {ESLVal v0 = $3509;
        
        {ESLVal v1 = $3508;
        
        if(hasEntry(v0,env).boolVal)
        return new ESLVal("JVar",lookup(v0,env),v1);
        else
          return e;
      }
      }
      }
    case "JNull": {
        return e;
      }
    case "JError": {ESLVal $3507 = _v1749.termRef(0);
        
        {ESLVal v0 = $3507;
        
        return new ESLVal("JError",renameJVarsExp(v0,vars,env));
      }
      }
    case "JHead": {ESLVal $3506 = _v1749.termRef(0);
        
        {ESLVal v0 = $3506;
        
        return new ESLVal("JHead",renameJVarsExp(v0,vars,env));
      }
      }
    case "JTail": {ESLVal $3505 = _v1749.termRef(0);
        
        {ESLVal v0 = $3505;
        
        return new ESLVal("JTail",renameJVarsExp(v0,vars,env));
      }
      }
    case "JCastp": {ESLVal $3504 = _v1749.termRef(0);
        ESLVal $3503 = _v1749.termRef(1);
        ESLVal $3502 = _v1749.termRef(2);
        
        {ESLVal v0 = $3504;
        
        {ESLVal v1 = $3503;
        
        {ESLVal v2 = $3502;
        
        return new ESLVal("JCastp",v0,v1,renameJVarsExp(v2,vars,env));
      }
      }
      }
      }
    case "JCast": {ESLVal $3501 = _v1749.termRef(0);
        ESLVal $3500 = _v1749.termRef(1);
        
        {ESLVal v0 = $3501;
        
        {ESLVal v1 = $3500;
        
        return new ESLVal("JCast",v0,renameJVarsExp(v1,vars,env));
      }
      }
      }
    case "JCmpExp": {ESLVal $3499 = _v1749.termRef(0);
        
        {ESLVal cmp = $3499;
        
        return new ESLVal("JCmpExp",renameJVarsCmp(cmp,vars,env));
      }
      }
    case "JNot": {ESLVal $3498 = _v1749.termRef(0);
        
        {ESLVal _v1794 = $3498;
        
        return new ESLVal("JNot",renameJVarsExp(_v1794,vars,env));
      }
      }
    case "JNew": {ESLVal $3497 = _v1749.termRef(0);
        ESLVal $3496 = _v1749.termRef(1);
        
        {ESLVal b = $3497;
        
        {ESLVal args = $3496;
        
        return new ESLVal("JNew",renameJVarsExp(b,vars,env),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(a,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
    case "JNewArray": {ESLVal $3495 = _v1749.termRef(0);
        
        {ESLVal b = $3495;
        
        return new ESLVal("JNewArray",renameJVarsExp(b,vars,env));
      }
      }
    case "JNewJava": {ESLVal $3494 = _v1749.termRef(0);
        ESLVal $3493 = _v1749.termRef(1);
        
        {ESLVal n = $3494;
        
        {ESLVal args = $3493;
        
        return new ESLVal("JNewJava",n,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(a,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
    case "JNewTable": {
        return new ESLVal("JNewTable",new ESLVal[]{});
      }
    case "JMapFun": {ESLVal $3492 = _v1749.termRef(0);
        ESLVal $3491 = _v1749.termRef(1);
        
        {ESLVal f = $3492;
        
        {ESLVal l = $3491;
        
        return new ESLVal("JMapFun",renameJVarsExp(f,vars,env),renameJVarsExp(l,vars,env));
      }
      }
      }
    case "JRecord": {ESLVal $3490 = _v1749.termRef(0);
        
        {ESLVal fs = $3490;
        
        return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1752 = $qualArg;
              
              switch(_v1752.termName) {
              case "JField": {ESLVal $3551 = _v1752.termRef(0);
                ESLVal $3550 = _v1752.termRef(1);
                ESLVal $3549 = _v1752.termRef(2);
                
                {ESLVal n = $3551;
                
                {ESLVal t = $3550;
                
                {ESLVal _v1793 = $3549;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(_v1793,vars,env))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v1752;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten());
      }
      }
    case "JFlatten": {ESLVal $3489 = _v1749.termRef(0);
        
        {ESLVal _v1792 = $3489;
        
        return new ESLVal("JFlatten",renameJVarsExp(_v1792,vars,env));
      }
      }
    case "JSend": {ESLVal $3488 = _v1749.termRef(0);
        ESLVal $3487 = _v1749.termRef(1);
        ESLVal $3486 = _v1749.termRef(2);
        
        {ESLVal _v1791 = $3488;
        
        {ESLVal n = $3487;
        
        {ESLVal es = $3486;
        
        return new ESLVal("JSend",renameJVarsExp(_v1791,vars,env),n,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(e,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
      }
    case "JSendSuper": {ESLVal $3485 = _v1749.termRef(0);
        
        {ESLVal _v1790 = $3485;
        
        return new ESLVal("JSendSuper",renameJVarsExp(_v1790,vars,env));
      }
      }
    case "JSendTimeSuper": {
        return new ESLVal("JSendTimeSuper",new ESLVal[]{});
      }
    case "JSelf": {
        return new ESLVal("JSelf",new ESLVal[]{});
      }
    case "JRef": {ESLVal $3484 = _v1749.termRef(0);
        ESLVal $3483 = _v1749.termRef(1);
        
        {ESLVal _v1789 = $3484;
        
        {ESLVal n = $3483;
        
        return new ESLVal("JRef",renameJVarsExp(_v1789,vars,env),n);
      }
      }
      }
    case "JRefSuper": {ESLVal $3482 = _v1749.termRef(0);
        
        {ESLVal n = $3482;
        
        return new ESLVal("JRefSuper",n);
      }
      }
    case "JBehaviour": {ESLVal $3481 = _v1749.termRef(0);
        ESLVal $3480 = _v1749.termRef(1);
        ESLVal $3479 = _v1749.termRef(2);
        ESLVal $3478 = _v1749.termRef(3);
        ESLVal $3477 = _v1749.termRef(4);
        ESLVal $3476 = _v1749.termRef(5);
        
        {ESLVal es = $3481;
        
        {ESLVal fs = $3480;
        
        {ESLVal methods = $3479;
        
        {ESLVal init = $3478;
        
        {ESLVal handler = $3477;
        
        {ESLVal time = $3476;
        
        {ESLVal newFields = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1751 = $qualArg;
                
                switch(_v1751.termName) {
                case "JField": {ESLVal $3548 = _v1751.termRef(0);
                  ESLVal $3547 = _v1751.termRef(1);
                  ESLVal $3546 = _v1751.termRef(2);
                  
                  {ESLVal n = $3548;
                  
                  {ESLVal t = $3547;
                  
                  {ESLVal _v1788 = $3546;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(_v1788,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1751;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        ESLVal newMethods = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsMethod(m,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(methods);
        
        return new ESLVal("JBehaviour",es,newFields,newMethods,renameJVarsExp(init,vars,env),renameJVarsExp(handler,vars,env),renameJVarsCommand(time,vars,env));
      }
      }
      }
      }
      }
      }
      }
      }
    case "JExtendedBehaviour": {ESLVal $3475 = _v1749.termRef(0);
        ESLVal $3474 = _v1749.termRef(1);
        ESLVal $3473 = _v1749.termRef(2);
        ESLVal $3472 = _v1749.termRef(3);
        ESLVal $3471 = _v1749.termRef(4);
        ESLVal $3470 = _v1749.termRef(5);
        ESLVal $3469 = _v1749.termRef(6);
        
        {ESLVal es = $3475;
        
        {ESLVal parent = $3474;
        
        {ESLVal fs = $3473;
        
        {ESLVal methods = $3472;
        
        {ESLVal init = $3471;
        
        {ESLVal handler = $3470;
        
        {ESLVal time = $3469;
        
        {ESLVal newFields = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1750 = $qualArg;
                
                switch(_v1750.termName) {
                case "JField": {ESLVal $3545 = _v1750.termRef(0);
                  ESLVal $3544 = _v1750.termRef(1);
                  ESLVal $3543 = _v1750.termRef(2);
                  
                  {ESLVal n = $3545;
                  
                  {ESLVal t = $3544;
                  
                  {ESLVal _v1787 = $3543;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(_v1787,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1750;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        ESLVal newMethods = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsMethod(m,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(methods);
        
        return new ESLVal("JExtendedBehaviour",es,renameJVarsExp(parent,vars,env),newFields,newMethods,renameJVarsExp(init,vars,env),renameJVarsExp(handler,vars,env),renameJVarsCommand(time,vars,env));
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "JTry": {ESLVal $3468 = _v1749.termRef(0);
        ESLVal $3467 = _v1749.termRef(1);
        ESLVal $3466 = _v1749.termRef(2);
        
        {ESLVal _v1786 = $3468;
        
        {ESLVal n = $3467;
        
        {ESLVal c = $3466;
        
        return new ESLVal("JTry",renameJVarsExp(_v1786,vars,env),n,renameJVarsCommand(c,vars,env));
      }
      }
      }
      }
    case "JProbably": {ESLVal $3465 = _v1749.termRef(0);
        ESLVal $3464 = _v1749.termRef(1);
        ESLVal $3463 = _v1749.termRef(2);
        
        {ESLVal _v1785 = $3465;
        
        {ESLVal e1 = $3464;
        
        {ESLVal e2 = $3463;
        
        return new ESLVal("JProbably",renameJVarsExp(_v1785,vars,env),renameJVarsExp(e1,vars,env),renameJVarsExp(e2,vars,env));
      }
      }
      }
      }
    case "JGrab": {ESLVal $3462 = _v1749.termRef(0);
        ESLVal $3461 = _v1749.termRef(1);
        
        {ESLVal es = $3462;
        
        {ESLVal c = $3461;
        
        return new ESLVal("JGrab",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsExp(e,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es),renameJVarsExp(c,vars,env));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(24129,29083)").add(ESLVal.list(_v1749)));
    }
    }
  }
  private static ESLVal renameJVarsExp = new ESLVal(new Function(new ESLVal("renameJVarsExp"),null) { public ESLVal apply(ESLVal... args) { return renameJVarsExp(args[0],args[1],args[2]); }});
  private static ESLVal renameJVarsMethod(ESLVal m,ESLVal vars,ESLVal env) {
    
    {ESLVal _v1754 = m;
      
      switch(_v1754.termName) {
      case "JMethod": {ESLVal $3556 = _v1754.termRef(0);
        ESLVal $3555 = _v1754.termRef(1);
        ESLVal $3554 = _v1754.termRef(2);
        
        {ESLVal name = $3556;
        
        {ESLVal args = $3555;
        
        {ESLVal body = $3554;
        
        {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1755 = $qualArg;
                
                switch(_v1755.termName) {
                case "JDec": {ESLVal $3558 = _v1755.termRef(0);
                  ESLVal $3557 = _v1755.termRef(1);
                  
                  {ESLVal n = $3558;
                  
                  {ESLVal t = $3557;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                default: {ESLVal _0 = _v1755;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun427"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal n = $args[0];
      return member.apply(n,boundNames);
        }
      }),vars).boolVal)
        {ESLVal newNames = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newName());
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(boundNames);
          
          {ESLVal env1 = addEntries(boundNames,newNames,env);
          
          return new ESLVal("JMethod",name,new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                $v.add(new ESLVal("JDec",n,$null));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(newNames),renameJVarsCommand(body,boundNames.add(vars),env1));
        }
        }
        else
          return new ESLVal("JMethod",name,args,renameJVarsCommand(body,boundNames.add(vars),env));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(29167,29743)").add(ESLVal.list(_v1754)));
    }
    }
  }
  private static ESLVal renameJVarsMethod = new ESLVal(new Function(new ESLVal("renameJVarsMethod"),null) { public ESLVal apply(ESLVal... args) { return renameJVarsMethod(args[0],args[1],args[2]); }});
  private static ESLVal renameJVarsCmp(ESLVal c,ESLVal vars,ESLVal env) {
    
    {ESLVal _v1756 = c;
      
      switch(_v1756.termName) {
      case "JCmpList": {ESLVal $3567 = _v1756.termRef(0);
        
        {ESLVal e = $3567;
        
        return new ESLVal("JCmpList",renameJVarsExp(e,vars,env));
      }
      }
    case "JCmpOuter": {ESLVal $3566 = _v1756.termRef(0);
        ESLVal $3565 = _v1756.termRef(1);
        ESLVal $3564 = _v1756.termRef(2);
        
        {ESLVal n = $3566;
        
        {ESLVal e = $3565;
        
        {ESLVal _v1782 = $3564;
        
        {ESLVal _v1783 = remove.apply(n,vars);
        ESLVal _v1784 = addEntry(n,n,env);
        
        return new ESLVal("JCmpOuter",n,renameJVarsExp(e,_v1783,_v1784),renameJVarsCmp(_v1782,_v1783,_v1784));
      }
      }
      }
      }
      }
    case "JCmpBind": {ESLVal $3563 = _v1756.termRef(0);
        ESLVal $3562 = _v1756.termRef(1);
        ESLVal $3561 = _v1756.termRef(2);
        
        {ESLVal n = $3563;
        
        {ESLVal e = $3562;
        
        {ESLVal _v1779 = $3561;
        
        {ESLVal _v1780 = remove.apply(n,vars);
        ESLVal _v1781 = addEntry(n,n,env);
        
        return new ESLVal("JCmpBind",n,renameJVarsExp(e,_v1780,_v1781),renameJVarsCmp(_v1779,_v1780,_v1781));
      }
      }
      }
      }
      }
    case "JCmpIf": {ESLVal $3560 = _v1756.termRef(0);
        ESLVal $3559 = _v1756.termRef(1);
        
        {ESLVal e = $3560;
        
        {ESLVal _v1778 = $3559;
        
        return new ESLVal("JCmpIf",renameJVarsExp(e,vars,env),renameJVarsCmp(_v1778,vars,env));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(29813,30394)").add(ESLVal.list(_v1756)));
    }
    }
  }
  private static ESLVal renameJVarsCmp = new ESLVal(new Function(new ESLVal("renameJVarsCmp"),null) { public ESLVal apply(ESLVal... args) { return renameJVarsCmp(args[0],args[1],args[2]); }});
  private static ESLVal newName() {
    
    {nameCount = nameCount.add($one);
    return new ESLVal("_v").add(nameCount);}
  }
  private static ESLVal newName = new ESLVal(new Function(new ESLVal("newName"),null) { public ESLVal apply(ESLVal... args) { return newName(); }});
  private static ESLVal renameJVarsCommand(ESLVal c,ESLVal vars,ESLVal env) {
    
    {ESLVal _v1757 = c;
      
      switch(_v1757.termName) {
      case "JBlock": {ESLVal $3608 = _v1757.termRef(0);
        
        {ESLVal v0 = $3608;
        
        return new ESLVal("JBlock",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal c = $l0.head();
              $l0 = $l0.tail();
              $v.add(renameJVarsCommand(c,vars,env));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v0));
      }
      }
    case "JReturn": {ESLVal $3607 = _v1757.termRef(0);
        
        {ESLVal v0 = $3607;
        
        return new ESLVal("JReturn",renameJVarsExp(v0,vars,env));
      }
      }
    case "JSwitch": {ESLVal $3606 = _v1757.termRef(0);
        ESLVal $3605 = _v1757.termRef(1);
        ESLVal $3604 = _v1757.termRef(2);
        
        {ESLVal v0 = $3606;
        
        {ESLVal v1 = $3605;
        
        {ESLVal v2 = $3604;
        
        return error(new ESLVal("jswitch should not occur"));
      }
      }
      }
      }
    case "JSwitchList": {ESLVal $3603 = _v1757.termRef(0);
        ESLVal $3602 = _v1757.termRef(1);
        ESLVal $3601 = _v1757.termRef(2);
        ESLVal $3600 = _v1757.termRef(3);
        
        {ESLVal v0 = $3603;
        
        {ESLVal v1 = $3602;
        
        {ESLVal v2 = $3601;
        
        {ESLVal v3 = $3600;
        
        return new ESLVal("JSwitchList",renameJVarsExp(v0,vars,env),renameJVarsCommand(v1,vars,env),renameJVarsCommand(v2,vars,env),renameJVarsCommand(v3,vars,env));
      }
      }
      }
      }
      }
    case "JIfCommand": {ESLVal $3599 = _v1757.termRef(0);
        ESLVal $3598 = _v1757.termRef(1);
        ESLVal $3597 = _v1757.termRef(2);
        
        {ESLVal v0 = $3599;
        
        {ESLVal v1 = $3598;
        
        {ESLVal v2 = $3597;
        
        return new ESLVal("JIfCommand",renameJVarsExp(v0,vars,env),renameJVarsCommand(v1,vars,env),renameJVarsCommand(v2,vars,env));
      }
      }
      }
      }
    case "JCaseList": {ESLVal $3596 = _v1757.termRef(0);
        ESLVal $3595 = _v1757.termRef(1);
        ESLVal $3594 = _v1757.termRef(2);
        ESLVal $3593 = _v1757.termRef(3);
        
        {ESLVal v0 = $3596;
        
        {ESLVal v1 = $3595;
        
        {ESLVal v2 = $3594;
        
        {ESLVal v3 = $3593;
        
        return new ESLVal("JCaseList",renameJVarsExp(v0,vars,env),renameJVarsCommand(v1,vars,env),renameJVarsCommand(v2,vars,env),renameJVarsCommand(v3,vars,env));
      }
      }
      }
      }
      }
    case "JCaseInt": {ESLVal $3592 = _v1757.termRef(0);
        ESLVal $3591 = _v1757.termRef(1);
        ESLVal $3590 = _v1757.termRef(2);
        
        {ESLVal e = $3592;
        
        {ESLVal arms = $3591;
        
        {ESLVal alt = $3590;
        
        return new ESLVal("JCaseInt",renameJVarsExp(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1770 = $qualArg;
              
              switch(_v1770.termName) {
              case "JIArm": {ESLVal $3644 = _v1770.termRef(0);
                ESLVal $3643 = _v1770.termRef(1);
                
                {ESLVal n = $3644;
                
                {ESLVal _v1777 = $3643;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand(_v1777,vars,env))));
              }
              }
              }
              default: {ESLVal _0 = _v1770;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten(),renameJVarsCommand(alt,vars,env));
      }
      }
      }
      }
    case "JCaseStr": {ESLVal $3589 = _v1757.termRef(0);
        ESLVal $3588 = _v1757.termRef(1);
        ESLVal $3587 = _v1757.termRef(2);
        
        {ESLVal e = $3589;
        
        {ESLVal arms = $3588;
        
        {ESLVal alt = $3587;
        
        return new ESLVal("JCaseStr",renameJVarsExp(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1769 = $qualArg;
              
              switch(_v1769.termName) {
              case "JSArm": {ESLVal $3642 = _v1769.termRef(0);
                ESLVal $3641 = _v1769.termRef(1);
                
                {ESLVal s = $3642;
                
                {ESLVal _v1776 = $3641;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand(_v1776,vars,env))));
              }
              }
              }
              default: {ESLVal _0 = _v1769;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten(),renameJVarsCommand(alt,vars,env));
      }
      }
      }
      }
    case "JCaseBool": {ESLVal $3586 = _v1757.termRef(0);
        ESLVal $3585 = _v1757.termRef(1);
        ESLVal $3584 = _v1757.termRef(2);
        
        {ESLVal e = $3586;
        
        {ESLVal arms = $3585;
        
        {ESLVal alt = $3584;
        
        return new ESLVal("JCaseBool",renameJVarsExp(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1768 = $qualArg;
              
              switch(_v1768.termName) {
              case "JBArm": {ESLVal $3640 = _v1768.termRef(0);
                ESLVal $3639 = _v1768.termRef(1);
                
                {ESLVal b = $3640;
                
                {ESLVal _v1775 = $3639;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand(_v1775,vars,env))));
              }
              }
              }
              default: {ESLVal _0 = _v1768;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten(),renameJVarsCommand(alt,vars,env));
      }
      }
      }
      }
    case "JCaseTerm": {ESLVal $3583 = _v1757.termRef(0);
        ESLVal $3582 = _v1757.termRef(1);
        ESLVal $3581 = _v1757.termRef(2);
        
        {ESLVal e = $3583;
        
        {ESLVal arms = $3582;
        
        {ESLVal alt = $3581;
        
        return new ESLVal("JCaseTerm",renameJVarsExp(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1767 = $qualArg;
              
              switch(_v1767.termName) {
              case "JTArm": {ESLVal $3638 = _v1767.termRef(0);
                ESLVal $3637 = _v1767.termRef(1);
                ESLVal $3636 = _v1767.termRef(2);
                
                {ESLVal n = $3638;
                
                {ESLVal i = $3637;
                
                {ESLVal _v1774 = $3636;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand(_v1774,vars,env))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v1767;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten(),renameJVarsCommand(alt,vars,env));
      }
      }
      }
      }
    case "JLet": {ESLVal $3580 = _v1757.termRef(0);
        ESLVal $3579 = _v1757.termRef(1);
        
        {ESLVal v0 = $3580;
        
        {ESLVal v1 = $3579;
        
        {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1764 = $qualArg;
                
                switch(_v1764.termName) {
                case "JField": {ESLVal $3629 = _v1764.termRef(0);
                  ESLVal $3628 = _v1764.termRef(1);
                  ESLVal $3627 = _v1764.termRef(2);
                  
                  {ESLVal n = $3629;
                  
                  {ESLVal t = $3628;
                  
                  {ESLVal e = $3627;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1764;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten();
        
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun428"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal n = $args[0];
      return member.apply(n,vars);
        }
      }),boundNames).boolVal)
        {ESLVal newNames = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newName());
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(boundNames);
          
          {ESLVal env1 = addEntries(boundNames,newNames,env);
          
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1765 = $qualArg;
                
                switch(_v1765.termName) {
                case "JField": {ESLVal $3632 = _v1765.termRef(0);
                  ESLVal $3631 = _v1765.termRef(1);
                  ESLVal $3630 = _v1765.termRef(2);
                  
                  {ESLVal n = $3632;
                  
                  {ESLVal t = $3631;
                  
                  {ESLVal e = $3630;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup(n,env1),t,renameJVarsExp(e,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1765;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),env1));
        }
        }
        else
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1766 = $qualArg;
                  
                  switch(_v1766.termName) {
                  case "JField": {ESLVal $3635 = _v1766.termRef(0);
                    ESLVal $3634 = _v1766.termRef(1);
                    ESLVal $3633 = _v1766.termRef(2);
                    
                    {ESLVal n = $3635;
                    
                    {ESLVal t = $3634;
                    
                    {ESLVal e = $3633;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1766;
                    
                    return $nil;
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),env));
      }
      }
      }
      }
    case "JPLet": {ESLVal $3578 = _v1757.termRef(0);
        ESLVal $3577 = _v1757.termRef(1);
        
        {ESLVal v0 = $3578;
        
        {ESLVal v1 = $3577;
        
        {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1761 = $qualArg;
                
                switch(_v1761.termName) {
                case "JField": {ESLVal $3620 = _v1761.termRef(0);
                  ESLVal $3619 = _v1761.termRef(1);
                  ESLVal $3618 = _v1761.termRef(2);
                  
                  {ESLVal n = $3620;
                  
                  {ESLVal t = $3619;
                  
                  {ESLVal e = $3618;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1761;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten();
        
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun429"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal n = $args[0];
      return member.apply(n,vars);
        }
      }),boundNames).boolVal)
        {ESLVal newNames = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newName());
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(boundNames);
          
          {ESLVal env1 = addEntries(boundNames,newNames,env);
          
          return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1762 = $qualArg;
                
                switch(_v1762.termName) {
                case "JField": {ESLVal $3623 = _v1762.termRef(0);
                  ESLVal $3622 = _v1762.termRef(1);
                  ESLVal $3621 = _v1762.termRef(2);
                  
                  {ESLVal n = $3623;
                  
                  {ESLVal t = $3622;
                  
                  {ESLVal e = $3621;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup(n,env1),t,renameJVarsExp(e,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1762;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),env1));
        }
        }
        else
          return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1763 = $qualArg;
                  
                  switch(_v1763.termName) {
                  case "JField": {ESLVal $3626 = _v1763.termRef(0);
                    ESLVal $3625 = _v1763.termRef(1);
                    ESLVal $3624 = _v1763.termRef(2);
                    
                    {ESLVal n = $3626;
                    
                    {ESLVal t = $3625;
                    
                    {ESLVal e = $3624;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1763;
                    
                    return $nil;
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),env));
      }
      }
      }
      }
    case "JLetRec": {ESLVal $3576 = _v1757.termRef(0);
        ESLVal $3575 = _v1757.termRef(1);
        
        {ESLVal v0 = $3576;
        
        {ESLVal v1 = $3575;
        
        {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1758 = $qualArg;
                
                switch(_v1758.termName) {
                case "JField": {ESLVal $3611 = _v1758.termRef(0);
                  ESLVal $3610 = _v1758.termRef(1);
                  ESLVal $3609 = _v1758.termRef(2);
                  
                  {ESLVal n = $3611;
                  
                  {ESLVal t = $3610;
                  
                  {ESLVal e = $3609;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1758;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten();
        
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun430"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal n = $args[0];
      return member.apply(n,vars);
        }
      }),boundNames).boolVal)
        {ESLVal newNames = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newName());
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(boundNames);
          
          {ESLVal _v1773 = addEntries(boundNames,newNames,env);
          
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1759 = $qualArg;
                
                switch(_v1759.termName) {
                case "JField": {ESLVal $3614 = _v1759.termRef(0);
                  ESLVal $3613 = _v1759.termRef(1);
                  ESLVal $3612 = _v1759.termRef(2);
                  
                  {ESLVal n = $3614;
                  
                  {ESLVal t = $3613;
                  
                  {ESLVal e = $3612;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup(n,_v1773),t,renameJVarsExp(e,vars,_v1773))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1759;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),_v1773));
        }
        }
        else
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1760 = $qualArg;
                  
                  switch(_v1760.termName) {
                  case "JField": {ESLVal $3617 = _v1760.termRef(0);
                    ESLVal $3616 = _v1760.termRef(1);
                    ESLVal $3615 = _v1760.termRef(2);
                    
                    {ESLVal n = $3617;
                    
                    {ESLVal t = $3616;
                    
                    {ESLVal e = $3615;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1760;
                    
                    return $nil;
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand(v1,boundNames.add(vars),env));
      }
      }
      }
      }
    case "JStatement": {ESLVal $3574 = _v1757.termRef(0);
        
        {ESLVal e = $3574;
        
        return new ESLVal("JStatement",renameJVarsExp(e,vars,env));
      }
      }
    case "JUpdate": {ESLVal $3573 = _v1757.termRef(0);
        ESLVal $3572 = _v1757.termRef(1);
        
        {ESLVal name = $3573;
        
        {ESLVal value = $3572;
        
        if(hasEntry(name,env).boolVal)
        return new ESLVal("JUpdate",lookup(name,env),renameJVarsExp(value,vars,env));
        else
          {ESLVal v0 = $3573;
            
            {ESLVal v1 = $3572;
            
            return new ESLVal("JUpdate",v0,renameJVarsExp(v1,vars,env));
          }
          }
      }
      }
      }
    case "JFor": {ESLVal $3571 = _v1757.termRef(0);
        ESLVal $3570 = _v1757.termRef(1);
        ESLVal $3569 = _v1757.termRef(2);
        ESLVal $3568 = _v1757.termRef(3);
        
        {ESLVal l = $3571;
        
        {ESLVal n = $3570;
        
        {ESLVal e = $3569;
        
        {ESLVal _v1772 = $3568;
        
        return new ESLVal("JFor",l,n,renameJVarsExp(e,vars,env),renameJVarsCommand(_v1772,vars,env));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(30632,35040)").add(ESLVal.list(_v1757)));
    }
    }
  }
  private static ESLVal renameJVarsCommand = new ESLVal(new Function(new ESLVal("renameJVarsCommand"),null) { public ESLVal apply(ESLVal... args) { return renameJVarsCommand(args[0],args[1],args[2]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}