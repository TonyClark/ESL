package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.PpExp.*;
import java.util.function.Supplier;
public class Cases {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal loc0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal voidType = new ESLVal("VoidType",loc0);
  private static ESLVal varCounter = $zero;
  private static ESLVal newVar = new ESLVal(new Function(new ESLVal("newVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {varCounter = varCounter.add($one);
      return new ESLVal("$").add(varCounter);}
    }
  });
  private static ESLVal translateArms = new ESLVal(new Function(new ESLVal("translateArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal as = $args[0];
  {ESLVal _v2052 = as;
        
        if(_v2052.isCons())
        {ESLVal $2886 = _v2052.head();
          ESLVal $2887 = _v2052.tail();
          
          switch($2886.termName) {
          case "BArm": {ESLVal $2891 = $2886.termRef(0);
            ESLVal $2890 = $2886.termRef(1);
            ESLVal $2889 = $2886.termRef(2);
            ESLVal $2888 = $2886.termRef(3);
            
            {ESLVal l = $2891;
            
            {ESLVal ps = $2890;
            
            {ESLVal g = $2889;
            
            {ESLVal e = $2888;
            
            {ESLVal _v2118 = $2887;
            
            return translateArms.apply(_v2118).cons(new ESLVal("LArm",l,ps,$nil,g,e));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v2052)));
        }
        }
      else if(_v2052.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v2052)));
      }
    }
  });
  private static ESLVal newVars = new ESLVal(new Function(new ESLVal("newVars"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  if(n.eql($zero).boolVal)
        return ESLVal.list();
        else
          return newVars.apply(n.sub($one)).cons(newVar.apply());
    }
  });
  public static ESLVal translateCases = new ESLVal(new Function(new ESLVal("translateCases"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal exp = $args[0];
  {ESLVal _v2053 = exp;
        
        switch(_v2053.termName) {
        case "Module": {ESLVal $3013 = _v2053.termRef(0);
          ESLVal $3012 = _v2053.termRef(1);
          ESLVal $3011 = _v2053.termRef(2);
          ESLVal $3010 = _v2053.termRef(3);
          ESLVal $3009 = _v2053.termRef(4);
          ESLVal $3008 = _v2053.termRef(5);
          ESLVal $3007 = _v2053.termRef(6);
          
          {ESLVal path = $3013;
          
          {ESLVal name = $3012;
          
          {ESLVal exports = $3011;
          
          {ESLVal imports = $3010;
          
          {ESLVal x = $3009;
          
          {ESLVal y = $3008;
          
          {ESLVal defs = $3007;
          
          return new ESLVal("Module",path,name,exports,imports,x,y,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateDef.apply(d));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(mergeFunDefs.apply(defs)));
        }
        }
        }
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $3006 = _v2053.termRef(0);
          ESLVal $3005 = _v2053.termRef(1);
          ESLVal $3004 = _v2053.termRef(2);
          ESLVal $3003 = _v2053.termRef(3);
          ESLVal $3002 = _v2053.termRef(4);
          
          {ESLVal l = $3006;
          
          {ESLVal n = $3005;
          
          {ESLVal args = $3004;
          
          {ESLVal t = $3003;
          
          {ESLVal e = $3002;
          
          return new ESLVal("FunExp",l,n,args,t,translateCases.apply(e));
        }
        }
        }
        }
        }
        }
      case "StrExp": {ESLVal $3001 = _v2053.termRef(0);
          ESLVal $3000 = _v2053.termRef(1);
          
          {ESLVal l = $3001;
          
          {ESLVal v = $3000;
          
          return exp;
        }
        }
        }
      case "IntExp": {ESLVal $2999 = _v2053.termRef(0);
          ESLVal $2998 = _v2053.termRef(1);
          
          {ESLVal l = $2999;
          
          {ESLVal v = $2998;
          
          return exp;
        }
        }
        }
      case "BoolExp": {ESLVal $2997 = _v2053.termRef(0);
          ESLVal $2996 = _v2053.termRef(1);
          
          {ESLVal l = $2997;
          
          {ESLVal v = $2996;
          
          return exp;
        }
        }
        }
      case "BagExp": {ESLVal $2995 = _v2053.termRef(0);
          ESLVal $2994 = _v2053.termRef(1);
          
          {ESLVal l = $2995;
          
          {ESLVal es = $2994;
          
          return new ESLVal("BagExp",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
      case "NullExp": {ESLVal $2993 = _v2053.termRef(0);
          
          {ESLVal l = $2993;
          
          return exp;
        }
        }
      case "FloatExp": {ESLVal $2992 = _v2053.termRef(0);
          ESLVal $2991 = _v2053.termRef(1);
          
          {ESLVal l = $2992;
          
          {ESLVal f = $2991;
          
          return exp;
        }
        }
        }
      case "Term": {ESLVal $2990 = _v2053.termRef(0);
          ESLVal $2989 = _v2053.termRef(1);
          ESLVal $2988 = _v2053.termRef(2);
          ESLVal $2987 = _v2053.termRef(3);
          
          {ESLVal l = $2990;
          
          {ESLVal n = $2989;
          
          {ESLVal ts = $2988;
          
          {ESLVal es = $2987;
          
          return new ESLVal("Term",l,n,ts,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
        }
        }
      case "List": {ESLVal $2986 = _v2053.termRef(0);
          ESLVal $2985 = _v2053.termRef(1);
          
          {ESLVal l = $2986;
          
          {ESLVal es = $2985;
          
          return new ESLVal("List",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
      case "Block": {ESLVal $2984 = _v2053.termRef(0);
          ESLVal $2983 = _v2053.termRef(1);
          
          {ESLVal l = $2984;
          
          {ESLVal es = $2983;
          
          return new ESLVal("Block",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
      case "Apply": {ESLVal $2982 = _v2053.termRef(0);
          ESLVal $2981 = _v2053.termRef(1);
          ESLVal $2980 = _v2053.termRef(2);
          
          {ESLVal l = $2982;
          
          {ESLVal op = $2981;
          
          {ESLVal args = $2980;
          
          return new ESLVal("Apply",l,translateCases.apply(op),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $2979 = _v2053.termRef(0);
          ESLVal $2978 = _v2053.termRef(1);
          ESLVal $2977 = _v2053.termRef(2);
          
          {ESLVal l = $2979;
          
          {ESLVal op = $2978;
          
          {ESLVal args = $2977;
          
          return new ESLVal("ApplyTypeExp",l,translateCases.apply(op),args);
        }
        }
        }
        }
      case "Case": {ESLVal $2976 = _v2053.termRef(0);
          ESLVal $2975 = _v2053.termRef(1);
          ESLVal $2974 = _v2053.termRef(2);
          ESLVal $2973 = _v2053.termRef(3);
          
          {ESLVal l = $2976;
          
          {ESLVal ds = $2975;
          
          {ESLVal es = $2974;
          
          {ESLVal as = $2973;
          
          return compileCase.apply(l,es,translateArms.apply(as),new ESLVal("CaseError",l,new ESLVal("List",l,es)));
        }
        }
        }
        }
        }
      case "BinExp": {ESLVal $2972 = _v2053.termRef(0);
          ESLVal $2971 = _v2053.termRef(1);
          ESLVal $2970 = _v2053.termRef(2);
          ESLVal $2969 = _v2053.termRef(3);
          
          {ESLVal l = $2972;
          
          {ESLVal e1 = $2971;
          
          {ESLVal op = $2970;
          
          {ESLVal e2 = $2969;
          
          return new ESLVal("BinExp",l,translateCases.apply(e1),op,translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "For": {ESLVal $2968 = _v2053.termRef(0);
          ESLVal $2967 = _v2053.termRef(1);
          ESLVal $2966 = _v2053.termRef(2);
          ESLVal $2965 = _v2053.termRef(3);
          
          {ESLVal l = $2968;
          
          {ESLVal p = $2967;
          
          {ESLVal e1 = $2966;
          
          {ESLVal e2 = $2965;
          
          return new ESLVal("For",l,p,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $2964 = _v2053.termRef(0);
          ESLVal $2963 = _v2053.termRef(1);
          ESLVal $2962 = _v2053.termRef(2);
          
          {ESLVal l = $2964;
          
          {ESLVal t = $2963;
          
          {ESLVal e = $2962;
          
          return new ESLVal("Throw",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Try": {ESLVal $2961 = _v2053.termRef(0);
          ESLVal $2960 = _v2053.termRef(1);
          ESLVal $2959 = _v2053.termRef(2);
          
          {ESLVal l = $2961;
          
          {ESLVal e = $2960;
          
          {ESLVal as = $2959;
          
          return new ESLVal("Try",l,translateCases.apply(e),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal a = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateArm.apply(a));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(as));
        }
        }
        }
        }
      case "ActExp": {ESLVal $2958 = _v2053.termRef(0);
          ESLVal $2957 = _v2053.termRef(1);
          ESLVal $2956 = _v2053.termRef(2);
          ESLVal $2955 = _v2053.termRef(3);
          ESLVal $2954 = _v2053.termRef(4);
          ESLVal $2953 = _v2053.termRef(5);
          ESLVal $2952 = _v2053.termRef(6);
          ESLVal $2951 = _v2053.termRef(7);
          
          {ESLVal l = $2958;
          
          {ESLVal n = $2957;
          
          {ESLVal args = $2956;
          
          {ESLVal x = $2955;
          
          {ESLVal spec = $2954;
          
          {ESLVal locals = $2953;
          
          {ESLVal init = $2952;
          
          {ESLVal handlers = $2951;
          
          return new ESLVal("ActExp",l,n,args,x,spec,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateDef.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(locals),translateCases.apply(init),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal h = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateArm.apply(h));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(handlers));
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $2950 = _v2053.termRef(0);
          ESLVal $2949 = _v2053.termRef(1);
          ESLVal $2948 = _v2053.termRef(2);
          ESLVal $2947 = _v2053.termRef(3);
          
          {ESLVal l = $2950;
          
          {ESLVal e1 = $2949;
          
          {ESLVal e2 = $2948;
          
          {ESLVal e3 = $2947;
          
          return new ESLVal("If",l,translateCases.apply(e1),translateCases.apply(e2),translateCases.apply(e3));
        }
        }
        }
        }
        }
      case "Self": {ESLVal $2946 = _v2053.termRef(0);
          
          {ESLVal l = $2946;
          
          return exp;
        }
        }
      case "Update": {ESLVal $2945 = _v2053.termRef(0);
          ESLVal $2944 = _v2053.termRef(1);
          ESLVal $2943 = _v2053.termRef(2);
          
          {ESLVal l = $2945;
          
          {ESLVal n = $2944;
          
          {ESLVal e = $2943;
          
          return new ESLVal("Update",l,n,translateCases.apply(e));
        }
        }
        }
        }
      case "Ref": {ESLVal $2942 = _v2053.termRef(0);
          ESLVal $2941 = _v2053.termRef(1);
          ESLVal $2940 = _v2053.termRef(2);
          
          {ESLVal l = $2942;
          
          {ESLVal e = $2941;
          
          {ESLVal n = $2940;
          
          return new ESLVal("Ref",l,translateCases.apply(e),n);
        }
        }
        }
        }
      case "Var": {ESLVal $2939 = _v2053.termRef(0);
          ESLVal $2938 = _v2053.termRef(1);
          
          {ESLVal l = $2939;
          
          {ESLVal n = $2938;
          
          return exp;
        }
        }
        }
      case "Send": {ESLVal $2937 = _v2053.termRef(0);
          ESLVal $2936 = _v2053.termRef(1);
          ESLVal $2935 = _v2053.termRef(2);
          
          {ESLVal l = $2937;
          
          {ESLVal target = $2936;
          
          {ESLVal message = $2935;
          
          return new ESLVal("Send",l,translateCases.apply(target),translateCases.apply(message));
        }
        }
        }
        }
      case "SendTimeSuper": {ESLVal $2934 = _v2053.termRef(0);
          
          {ESLVal l = $2934;
          
          return new ESLVal("SendTimeSuper",l);
        }
        }
      case "SendSuper": {ESLVal $2933 = _v2053.termRef(0);
          ESLVal $2932 = _v2053.termRef(1);
          
          {ESLVal l = $2933;
          
          {ESLVal e = $2932;
          
          return new ESLVal("SendSuper",l,translateCases.apply(e));
        }
        }
        }
      case "SetExp": {ESLVal $2931 = _v2053.termRef(0);
          ESLVal $2930 = _v2053.termRef(1);
          
          {ESLVal l = $2931;
          
          {ESLVal es = $2930;
          
          return new ESLVal("SetExp",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
      case "Cmp": {ESLVal $2929 = _v2053.termRef(0);
          ESLVal $2928 = _v2053.termRef(1);
          ESLVal $2927 = _v2053.termRef(2);
          
          {ESLVal l = $2929;
          
          {ESLVal e = $2928;
          
          {ESLVal qs = $2927;
          
          return new ESLVal("Cmp",l,translateCases.apply(e),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal q = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateQual.apply(q));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(qs));
        }
        }
        }
        }
      case "New": {ESLVal $2926 = _v2053.termRef(0);
          ESLVal $2925 = _v2053.termRef(1);
          ESLVal $2924 = _v2053.termRef(2);
          
          {ESLVal l = $2926;
          
          {ESLVal b = $2925;
          
          {ESLVal args = $2924;
          
          return new ESLVal("New",l,translateCases.apply(b),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
        }
        }
      case "NewJava": {ESLVal $2923 = _v2053.termRef(0);
          ESLVal $2922 = _v2053.termRef(1);
          ESLVal $2921 = _v2053.termRef(2);
          ESLVal $2920 = _v2053.termRef(3);
          
          {ESLVal l = $2923;
          
          {ESLVal className = $2922;
          
          {ESLVal t = $2921;
          
          {ESLVal args = $2920;
          
          return new ESLVal("NewJava",l,className,t,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateCases.apply(e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $2919 = _v2053.termRef(0);
          ESLVal $2918 = _v2053.termRef(1);
          ESLVal $2917 = _v2053.termRef(2);
          
          {ESLVal l = $2919;
          
          {ESLVal bs = $2918;
          
          {ESLVal e = $2917;
          
          return new ESLVal("Let",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateDef.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),translateCases.apply(e));
        }
        }
        }
        }
      case "Letrec": {ESLVal $2916 = _v2053.termRef(0);
          ESLVal $2915 = _v2053.termRef(1);
          ESLVal $2914 = _v2053.termRef(2);
          
          {ESLVal l = $2916;
          
          {ESLVal bs = $2915;
          
          {ESLVal e = $2914;
          
          return new ESLVal("Letrec",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateDef.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),translateCases.apply(e));
        }
        }
        }
        }
      case "Grab": {ESLVal $2913 = _v2053.termRef(0);
          ESLVal $2912 = _v2053.termRef(1);
          ESLVal $2911 = _v2053.termRef(2);
          
          {ESLVal l = $2913;
          
          {ESLVal rs = $2912;
          
          {ESLVal e = $2911;
          
          return new ESLVal("Grab",l,rs,translateCases.apply(e));
        }
        }
        }
        }
      case "PLet": {ESLVal $2910 = _v2053.termRef(0);
          ESLVal $2909 = _v2053.termRef(1);
          ESLVal $2908 = _v2053.termRef(2);
          
          {ESLVal l = $2910;
          
          {ESLVal bs = $2909;
          
          {ESLVal e = $2908;
          
          return new ESLVal("PLet",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(translateDef.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),translateCases.apply(e));
        }
        }
        }
        }
      case "Probably": {ESLVal $2907 = _v2053.termRef(0);
          ESLVal $2906 = _v2053.termRef(1);
          ESLVal $2905 = _v2053.termRef(2);
          ESLVal $2904 = _v2053.termRef(3);
          ESLVal $2903 = _v2053.termRef(4);
          
          {ESLVal l = $2907;
          
          {ESLVal p = $2906;
          
          {ESLVal t = $2905;
          
          {ESLVal e1 = $2904;
          
          {ESLVal e2 = $2903;
          
          return new ESLVal("Probably",l,translateCases.apply(p),t,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $2902 = _v2053.termRef(0);
          ESLVal $2901 = _v2053.termRef(1);
          
          {ESLVal l = $2902;
          
          {ESLVal e = $2901;
          
          return new ESLVal("Not",l,translateCases.apply(e));
        }
        }
        }
      case "Fold": {ESLVal $2900 = _v2053.termRef(0);
          ESLVal $2899 = _v2053.termRef(1);
          ESLVal $2898 = _v2053.termRef(2);
          
          {ESLVal l = $2900;
          
          {ESLVal t = $2899;
          
          {ESLVal e = $2898;
          
          return new ESLVal("Fold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Unfold": {ESLVal $2897 = _v2053.termRef(0);
          ESLVal $2896 = _v2053.termRef(1);
          ESLVal $2895 = _v2053.termRef(2);
          
          {ESLVal l = $2897;
          
          {ESLVal t = $2896;
          
          {ESLVal e = $2895;
          
          return new ESLVal("Unfold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Now": {ESLVal $2894 = _v2053.termRef(0);
          
          {ESLVal l = $2894;
          
          return exp;
        }
        }
      case "Become": {ESLVal $2893 = _v2053.termRef(0);
          ESLVal $2892 = _v2053.termRef(1);
          
          {ESLVal l = $2893;
          
          {ESLVal e = $2892;
          
          return new ESLVal("Become",l,translateCases.apply(e));
        }
        }
        }
        default: {ESLVal x = _v2053;
          
          return error(exp);
        }
      }
      }
    }
  });
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2054 = arm;
        
        switch(_v2054.termName) {
        case "LArm": {ESLVal $3018 = _v2054.termRef(0);
          ESLVal $3017 = _v2054.termRef(1);
          ESLVal $3016 = _v2054.termRef(2);
          ESLVal $3015 = _v2054.termRef(3);
          ESLVal $3014 = _v2054.termRef(4);
          
          {ESLVal l = $3018;
          
          {ESLVal ps = $3017;
          
          {ESLVal bs = $3016;
          
          {ESLVal g = $3015;
          
          {ESLVal e = $3014;
          
          return ps;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8442,8522)").add(ESLVal.list(_v2054)));
      }
      }
    }
  });
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2055 = arm;
        
        switch(_v2055.termName) {
        case "LArm": {ESLVal $3023 = _v2055.termRef(0);
          ESLVal $3022 = _v2055.termRef(1);
          ESLVal $3021 = _v2055.termRef(2);
          ESLVal $3020 = _v2055.termRef(3);
          ESLVal $3019 = _v2055.termRef(4);
          
          {ESLVal l = $3023;
          
          {ESLVal ps = $3022;
          
          {ESLVal bs = $3021;
          
          {ESLVal g = $3020;
          
          {ESLVal e = $3019;
          
          return e;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8551,8630)").add(ESLVal.list(_v2055)));
      }
      }
    }
  });
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2056 = arm;
        
        switch(_v2056.termName) {
        case "LArm": {ESLVal $3028 = _v2056.termRef(0);
          ESLVal $3027 = _v2056.termRef(1);
          ESLVal $3026 = _v2056.termRef(2);
          ESLVal $3025 = _v2056.termRef(3);
          ESLVal $3024 = _v2056.termRef(4);
          
          {ESLVal l = $3028;
          
          {ESLVal ps = $3027;
          
          {ESLVal bs = $3026;
          
          {ESLVal g = $3025;
          
          {ESLVal e = $3024;
          
          return g;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8660,8739)").add(ESLVal.list(_v2056)));
      }
      }
    }
  });
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal e = $args[1];
  {ESLVal _v2057 = arm;
        
        switch(_v2057.termName) {
        case "LArm": {ESLVal $3033 = _v2057.termRef(0);
          ESLVal $3032 = _v2057.termRef(1);
          ESLVal $3031 = _v2057.termRef(2);
          ESLVal $3030 = _v2057.termRef(3);
          ESLVal $3029 = _v2057.termRef(4);
          
          {ESLVal l = $3033;
          
          {ESLVal ps = $3032;
          
          {ESLVal bs = $3031;
          
          {ESLVal g = $3030;
          
          {ESLVal old = $3029;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8778,8875)").add(ESLVal.list(_v2057)));
      }
      }
    }
  });
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal ps = $args[1];
  {ESLVal _v2058 = arm;
        
        switch(_v2058.termName) {
        case "LArm": {ESLVal $3038 = _v2058.termRef(0);
          ESLVal $3037 = _v2058.termRef(1);
          ESLVal $3036 = _v2058.termRef(2);
          ESLVal $3035 = _v2058.termRef(3);
          ESLVal $3034 = _v2058.termRef(4);
          
          {ESLVal l = $3038;
          
          {ESLVal old = $3037;
          
          {ESLVal bs = $3036;
          
          {ESLVal g = $3035;
          
          {ESLVal e = $3034;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8925,9022)").add(ESLVal.list(_v2058)));
      }
      }
    }
  });
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal newBS = $args[1];
  {ESLVal _v2059 = arm;
        
        switch(_v2059.termName) {
        case "LArm": {ESLVal $3043 = _v2059.termRef(0);
          ESLVal $3042 = _v2059.termRef(1);
          ESLVal $3041 = _v2059.termRef(2);
          ESLVal $3040 = _v2059.termRef(3);
          ESLVal $3039 = _v2059.termRef(4);
          
          {ESLVal l = $3043;
          
          {ESLVal ps = $3042;
          
          {ESLVal bs = $3041;
          
          {ESLVal g = $3040;
          
          {ESLVal e = $3039;
          
          return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9073,9178)").add(ESLVal.list(_v2059)));
      }
      }
    }
  });
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2060 = p;
        
        switch(_v2060.termName) {
        case "PVar": {ESLVal $3046 = _v2060.termRef(0);
          ESLVal $3045 = _v2060.termRef(1);
          ESLVal $3044 = _v2060.termRef(2);
          
          {ESLVal l = $3046;
          
          {ESLVal n = $3045;
          
          {ESLVal t = $3044;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2117 = _v2060;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2061 = p;
        
        switch(_v2061.termName) {
        case "PInt": {ESLVal $3048 = _v2061.termRef(0);
          ESLVal $3047 = _v2061.termRef(1);
          
          {ESLVal l = $3048;
          
          {ESLVal n = $3047;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2116 = _v2061;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2062 = p;
        
        switch(_v2062.termName) {
        case "PStr": {ESLVal $3050 = _v2062.termRef(0);
          ESLVal $3049 = _v2062.termRef(1);
          
          {ESLVal l = $3050;
          
          {ESLVal n = $3049;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2115 = _v2062;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2063 = p;
        
        switch(_v2063.termName) {
        case "PBool": {ESLVal $3052 = _v2063.termRef(0);
          ESLVal $3051 = _v2063.termRef(1);
          
          {ESLVal l = $3052;
          
          {ESLVal b = $3051;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2114 = _v2063;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2064 = p;
        
        switch(_v2064.termName) {
        case "PTerm": {ESLVal $3056 = _v2064.termRef(0);
          ESLVal $3055 = _v2064.termRef(1);
          ESLVal $3054 = _v2064.termRef(2);
          ESLVal $3053 = _v2064.termRef(3);
          
          {ESLVal l = $3056;
          
          {ESLVal n = $3055;
          
          {ESLVal ts = $3054;
          
          {ESLVal ps = $3053;
          
          return $true;
        }
        }
        }
        }
        }
        default: {ESLVal _v2113 = _v2064;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2065 = p;
        
        switch(_v2065.termName) {
        case "PCons": {ESLVal $3059 = _v2065.termRef(0);
          ESLVal $3058 = _v2065.termRef(1);
          ESLVal $3057 = _v2065.termRef(2);
          
          {ESLVal l = $3059;
          
          {ESLVal h = $3058;
          
          {ESLVal t = $3057;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2112 = _v2065;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2066 = p;
        
        switch(_v2066.termName) {
        case "PNil": {ESLVal $3064 = _v2066.termRef(0);
          
          {ESLVal l = $3064;
          
          return $true;
        }
        }
      case "PApplyType": {ESLVal $3062 = _v2066.termRef(0);
          ESLVal $3061 = _v2066.termRef(1);
          ESLVal $3060 = _v2066.termRef(2);
          
          switch($3061.termName) {
          case "PNil": {ESLVal $3063 = $3061.termRef(0);
            
            {ESLVal l1 = $3062;
            
            {ESLVal l2 = $3063;
            
            {ESLVal ts = $3060;
            
            return $true;
          }
          }
          }
          }
          default: {ESLVal _v2110 = _v2066;
            
            return $false;
          }
        }
        }
        default: {ESLVal _v2111 = _v2066;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPList = new ESLVal(new Function(new ESLVal("isPList"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  return isPCons.apply(p).or(isPNil.apply(p));
    }
  });
  private static ESLVal isPNonDetList = new ESLVal(new Function(new ESLVal("isPNonDetList"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  return isPAdd.apply(p);
    }
  });
  private static ESLVal isPSetCons = new ESLVal(new Function(new ESLVal("isPSetCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2067 = p;
        
        switch(_v2067.termName) {
        case "PSetCons": {ESLVal $3067 = _v2067.termRef(0);
          ESLVal $3066 = _v2067.termRef(1);
          ESLVal $3065 = _v2067.termRef(2);
          
          {ESLVal l = $3067;
          
          {ESLVal p1 = $3066;
          
          {ESLVal p2 = $3065;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2109 = _v2067;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPEmptySet = new ESLVal(new Function(new ESLVal("isPEmptySet"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2068 = p;
        
        switch(_v2068.termName) {
        case "PEmptySet": {ESLVal $3068 = _v2068.termRef(0);
          
          {ESLVal l = $3068;
          
          return $true;
        }
        }
        default: {ESLVal _v2108 = _v2068;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPAdd = new ESLVal(new Function(new ESLVal("isPAdd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2069 = p;
        
        switch(_v2069.termName) {
        case "PAdd": {ESLVal $3071 = _v2069.termRef(0);
          ESLVal $3070 = _v2069.termRef(1);
          ESLVal $3069 = _v2069.termRef(2);
          
          {ESLVal l = $3071;
          
          {ESLVal p1 = $3070;
          
          {ESLVal p2 = $3069;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2107 = _v2069;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPSet = new ESLVal(new Function(new ESLVal("isPSet"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  return isPSetCons.apply(p).or(isPEmptySet.apply(p));
    }
  });
  private static ESLVal pTermName = new ESLVal(new Function(new ESLVal("pTermName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2070 = p;
        
        switch(_v2070.termName) {
        case "PTerm": {ESLVal $3075 = _v2070.termRef(0);
          ESLVal $3074 = _v2070.termRef(1);
          ESLVal $3073 = _v2070.termRef(2);
          ESLVal $3072 = _v2070.termRef(3);
          
          {ESLVal l = $3075;
          
          {ESLVal n = $3074;
          
          {ESLVal ts = $3073;
          
          {ESLVal ps = $3072;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10558,10626)").add(ESLVal.list(_v2070)));
      }
      }
    }
  });
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2071 = p;
        
        switch(_v2071.termName) {
        case "PTerm": {ESLVal $3079 = _v2071.termRef(0);
          ESLVal $3078 = _v2071.termRef(1);
          ESLVal $3077 = _v2071.termRef(2);
          ESLVal $3076 = _v2071.termRef(3);
          
          {ESLVal l = $3079;
          
          {ESLVal n = $3078;
          
          {ESLVal ts = $3077;
          
          {ESLVal ps = $3076;
          
          return ps;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10666,10735)").add(ESLVal.list(_v2071)));
      }
      }
    }
  });
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2072 = p;
        
        switch(_v2072.termName) {
        case "PVar": {ESLVal $3082 = _v2072.termRef(0);
          ESLVal $3081 = _v2072.termRef(1);
          ESLVal $3080 = _v2072.termRef(2);
          
          {ESLVal l = $3082;
          
          {ESLVal n = $3081;
          
          {ESLVal t = $3080;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10768,10818)").add(ESLVal.list(_v2072)));
      }
      }
    }
  });
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2073 = p;
        
        switch(_v2073.termName) {
        case "PCons": {ESLVal $3085 = _v2073.termRef(0);
          ESLVal $3084 = _v2073.termRef(1);
          ESLVal $3083 = _v2073.termRef(2);
          
          {ESLVal l = $3085;
          
          {ESLVal h = $3084;
          
          {ESLVal t = $3083;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10856,10914)").add(ESLVal.list(_v2073)));
      }
      }
    }
  });
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2074 = p;
        
        switch(_v2074.termName) {
        case "PCons": {ESLVal $3088 = _v2074.termRef(0);
          ESLVal $3087 = _v2074.termRef(1);
          ESLVal $3086 = _v2074.termRef(2);
          
          {ESLVal l = $3088;
          
          {ESLVal h = $3087;
          
          {ESLVal t = $3086;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10952,11010)").add(ESLVal.list(_v2074)));
      }
      }
    }
  });
  private static ESLVal pSetConsHead = new ESLVal(new Function(new ESLVal("pSetConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2075 = p;
        
        switch(_v2075.termName) {
        case "PSetCons": {ESLVal $3091 = _v2075.termRef(0);
          ESLVal $3090 = _v2075.termRef(1);
          ESLVal $3089 = _v2075.termRef(2);
          
          {ESLVal l = $3091;
          
          {ESLVal h = $3090;
          
          {ESLVal t = $3089;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11051,11112)").add(ESLVal.list(_v2075)));
      }
      }
    }
  });
  private static ESLVal pSetConsTail = new ESLVal(new Function(new ESLVal("pSetConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2076 = p;
        
        switch(_v2076.termName) {
        case "PSetCons": {ESLVal $3094 = _v2076.termRef(0);
          ESLVal $3093 = _v2076.termRef(1);
          ESLVal $3092 = _v2076.termRef(2);
          
          {ESLVal l = $3094;
          
          {ESLVal h = $3093;
          
          {ESLVal t = $3092;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11153,11214)").add(ESLVal.list(_v2076)));
      }
      }
    }
  });
  private static ESLVal pAddLeft = new ESLVal(new Function(new ESLVal("pAddLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2077 = p;
        
        switch(_v2077.termName) {
        case "PAdd": {ESLVal $3097 = _v2077.termRef(0);
          ESLVal $3096 = _v2077.termRef(1);
          ESLVal $3095 = _v2077.termRef(2);
          
          {ESLVal l = $3097;
          
          {ESLVal left = $3096;
          
          {ESLVal right = $3095;
          
          return left;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11250,11317)").add(ESLVal.list(_v2077)));
      }
      }
    }
  });
  private static ESLVal pAddRight = new ESLVal(new Function(new ESLVal("pAddRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2078 = p;
        
        switch(_v2078.termName) {
        case "PAdd": {ESLVal $3100 = _v2078.termRef(0);
          ESLVal $3099 = _v2078.termRef(1);
          ESLVal $3098 = _v2078.termRef(2);
          
          {ESLVal l = $3100;
          
          {ESLVal left = $3099;
          
          {ESLVal right = $3098;
          
          return right;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11354,11422)").add(ESLVal.list(_v2078)));
      }
      }
    }
  });
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2079 = p;
        
        switch(_v2079.termName) {
        case "PInt": {ESLVal $3102 = _v2079.termRef(0);
          ESLVal $3101 = _v2079.termRef(1);
          
          {ESLVal l = $3102;
          
          {ESLVal n = $3101;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11456,11498)").add(ESLVal.list(_v2079)));
      }
      }
    }
  });
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2080 = p;
        
        switch(_v2080.termName) {
        case "PStr": {ESLVal $3104 = _v2080.termRef(0);
          ESLVal $3103 = _v2080.termRef(1);
          
          {ESLVal l = $3104;
          
          {ESLVal n = $3103;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11532,11574)").add(ESLVal.list(_v2080)));
      }
      }
    }
  });
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2081 = p;
        
        switch(_v2081.termName) {
        case "PBool": {ESLVal $3106 = _v2081.termRef(0);
          ESLVal $3105 = _v2081.termRef(1);
          
          {ESLVal l = $3106;
          
          {ESLVal b = $3105;
          
          return b;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11610,11655)").add(ESLVal.list(_v2081)));
      }
      }
    }
  });
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun551"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return length.apply(armPatterns.apply(a)).eql($zero);
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnVars = new ESLVal(new Function(new ESLVal("isFirstColumnVars"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun552"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnInts = new ESLVal(new Function(new ESLVal("isFirstColumnInts"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun553"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnStrs = new ESLVal(new Function(new ESLVal("isFirstColumnStrs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun554"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnBools = new ESLVal(new Function(new ESLVal("isFirstColumnBools"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun555"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnCnstrs = new ESLVal(new Function(new ESLVal("isFirstColumnCnstrs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun556"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnSets = new ESLVal(new Function(new ESLVal("isFirstColumnSets"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun557"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPSet.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnNonDetLists = new ESLVal(new Function(new ESLVal("isFirstColumnNonDetLists"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun558"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPNonDetList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal isFirstColumnLists = new ESLVal(new Function(new ESLVal("isFirstColumnLists"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal isList = new ESLVal(new Function(new ESLVal("isList"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a))).or(isPNil.apply(head.apply(armPatterns.apply(a))));
            }
          });
        
        return forall.apply(isList,arms);
      }
    }
  });
  private static ESLVal dropPattern = new ESLVal(new Function(new ESLVal("dropPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  return setArmPatterns.apply(arm,tail.apply(armPatterns.apply(arm)));
    }
  });
  private static ESLVal firstVarNames = new ESLVal(new Function(new ESLVal("firstVarNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun559"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return pVarName.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms);
    }
  });
  private static ESLVal sharedCnstr = new ESLVal(new Function(new ESLVal("sharedCnstr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return pTermName.apply(head.apply(armPatterns.apply(head.apply(arms))));
    }
  });
  private static ESLVal sharedInt = new ESLVal(new Function(new ESLVal("sharedInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return pIntValue.apply(head.apply(armPatterns.apply(head.apply(arms))));
    }
  });
  private static ESLVal sharedStr = new ESLVal(new Function(new ESLVal("sharedStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return pStrValue.apply(head.apply(armPatterns.apply(head.apply(arms))));
    }
  });
  private static ESLVal sharedBool = new ESLVal(new Function(new ESLVal("sharedBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return pBoolValue.apply(head.apply(armPatterns.apply(head.apply(arms))));
    }
  });
  private static ESLVal bindVarsBody = new ESLVal(new Function(new ESLVal("bindVarsBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal vNames = $args[1];
  return new ESLVal(new Function(new ESLVal("fun560"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal arms = $args[0];
        { LetRec letrec = new LetRec() {
              ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v2101 = $args[0];
                ESLVal _v2102 = $args[1];
                {ESLVal _v2082 = _v2101;
                      ESLVal _v2083 = _v2102;
                      
                      if(_v2082.isCons())
                      {ESLVal $3107 = _v2082.head();
                        ESLVal $3108 = _v2082.tail();
                        
                        if(_v2083.isCons())
                        {ESLVal $3109 = _v2083.head();
                          ESLVal $3110 = _v2083.tail();
                          
                          {ESLVal a = $3107;
                          
                          {ESLVal _v2103 = $3108;
                          
                          {ESLVal v = $3109;
                          
                          {ESLVal _v2104 = $3110;
                          
                          {ESLVal _v2084 = e;
                          
                          switch(_v2084.termName) {
                          case "Var": {ESLVal $3114 = _v2084.termRef(0);
                            ESLVal $3113 = _v2084.termRef(1);
                            
                            {ESLVal l = $3114;
                            
                            {ESLVal n = $3113;
                            
                            if(n.eql(v).boolVal)
                            return bind.apply(_v2103,_v2104).cons(a);
                            else
                              {ESLVal _v2105 = _v2084;
                                
                                return bind.apply(_v2103,_v2104).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v2105))));
                              }
                          }
                          }
                          }
                          default: {ESLVal _v2106 = _v2084;
                            
                            return bind.apply(_v2103,_v2104).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v2106))));
                          }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else if(_v2083.isNil())
                        return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2082,_v2083)));
                      else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2082,_v2083)));
                      }
                    else if(_v2082.isNil())
                      if(_v2083.isCons())
                        {ESLVal $3111 = _v2083.head();
                          ESLVal $3112 = _v2083.tail();
                          
                          return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2082,_v2083)));
                        }
                      else if(_v2083.isNil())
                        return $nil;
                      else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2082,_v2083)));
                    else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2082,_v2083)));
                    }
                  }
                });
              
              public ESLVal get(String name) {
                switch(name) {
                  case "bind": return bind;
                  
                  default: throw new Error("cannot find letrec binding");
                }
                }
              };
            ESLVal bind = letrec.get("bind");
            
              return bind.apply(arms,vNames);}
            
          }
        });
    }
  });
  private static ESLVal bindVars = new ESLVal(new Function(new ESLVal("bindVars"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal arms = $args[1];
  return bindVarsBody.apply(e,firstVarNames.apply(arms)).apply(map.apply(dropPattern,arms));
    }
  });
  private static ESLVal cnstrArms = new ESLVal(new Function(new ESLVal("cnstrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal arms = $args[1];
  return filter.apply(new ESLVal(new Function(new ESLVal("fun561"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return pTermName.apply(head.apply(armPatterns.apply(a))).eql(c);
          }
        }),arms);
    }
  });
  private static ESLVal intArms = new ESLVal(new Function(new ESLVal("intArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal arms = $args[1];
  return filter.apply(new ESLVal(new Function(new ESLVal("fun562"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return pIntValue.apply(head.apply(armPatterns.apply(a))).eql(n);
          }
        }),arms);
    }
  });
  private static ESLVal strArms = new ESLVal(new Function(new ESLVal("strArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  ESLVal arms = $args[1];
  return filter.apply(new ESLVal(new Function(new ESLVal("fun563"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return pStrValue.apply(head.apply(armPatterns.apply(a))).eql(s);
          }
        }),arms);
    }
  });
  private static ESLVal boolArms = new ESLVal(new Function(new ESLVal("boolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  ESLVal arms = $args[1];
  return filter.apply(new ESLVal(new Function(new ESLVal("fun564"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return pBoolValue.apply(head.apply(armPatterns.apply(a))).eql(b);
          }
        }),arms);
    }
  });
  private static ESLVal fieldBindings = new ESLVal(new Function(new ESLVal("fieldBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal names = $args[1];
  return new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("Binding",loc0,n,voidType,voidType,new ESLVal("TermRef",e,indexOf.apply(n,names))));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(names);
    }
  });
  private static ESLVal explodeCnstr = new ESLVal(new Function(new ESLVal("explodeCnstr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  return setArmPatterns.apply(a,pTermArgs.apply(head.apply(armPatterns.apply(a))).add(tail.apply(armPatterns.apply(a))));
    }
  });
  private static ESLVal explodeCons = new ESLVal(new Function(new ESLVal("explodeCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  return setArmPatterns.apply(a,ESLVal.list(pConsHead.apply(head.apply(armPatterns.apply(a))),pConsTail.apply(head.apply(armPatterns.apply(a)))).add(tail.apply(armPatterns.apply(a))));
    }
  });
  private static ESLVal explodeSetCons = new ESLVal(new Function(new ESLVal("explodeSetCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  return setArmPatterns.apply(a,ESLVal.list(pSetConsHead.apply(head.apply(armPatterns.apply(a))),pSetConsTail.apply(head.apply(armPatterns.apply(a)))).add(tail.apply(armPatterns.apply(a))));
    }
  });
  private static ESLVal explodeAdd = new ESLVal(new Function(new ESLVal("explodeAdd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  return setArmPatterns.apply(a,ESLVal.list(pAddLeft.apply(head.apply(armPatterns.apply(a))),pAddRight.apply(head.apply(armPatterns.apply(a)))).add(tail.apply(armPatterns.apply(a))));
    }
  });
  private static ESLVal cnstrArm = new ESLVal(new Function(new ESLVal("cnstrArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal e = $args[1];
  ESLVal es = $args[2];
  ESLVal arms = $args[3];
  ESLVal alt = $args[4];
  {ESLVal names = newVars.apply(length.apply(pTermArgs.apply(head.apply(armPatterns.apply(head.apply(arms))))));
        
        return new ESLVal("Let",loc0,fieldBindings.apply(e,names),compileCase.apply(l,new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("Var",loc0,n));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(names).add(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(explodeCnstr.apply(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(arms),alt));
      }
    }
  });
  private static ESLVal processCnstrs = new ESLVal(new Function(new ESLVal("processCnstrs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal cnstrs = removeDups.apply(map.apply(pTermName,map.apply(head,map.apply(armPatterns,arms))));
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun565"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return cnstrArms.apply(c,arms);
            }
          }),cnstrs);
        
        return new ESLVal("CaseTerm",l,head.apply(es),createTArms.apply(l,armss,es,alt),alt);
      }
      }
    }
  });
  private static ESLVal createTArms = new ESLVal(new Function(new ESLVal("createTArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal armss = $args[1];
  ESLVal es = $args[2];
  ESLVal alt = $args[3];
  {ESLVal _v2085 = armss;
        
        if(_v2085.isCons())
        {ESLVal $3115 = _v2085.head();
          ESLVal $3116 = _v2085.tail();
          
          {ESLVal as = $3115;
          
          {ESLVal _v2100 = $3116;
          
          return createTArms.apply(l,_v2100,es,alt).cons(new ESLVal("TArm",sharedCnstr.apply(as),cnstrArm.apply(l,head.apply(es),tail.apply(es),as,alt)));
        }
        }
        }
      else if(_v2085.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(16496,16676)").add(ESLVal.list(_v2085)));
      }
    }
  });
  private static ESLVal processConsArms = new ESLVal(new Function(new ESLVal("processConsArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal loc = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal l = head.apply(es);
        ESLVal hn = newVar.apply();
        ESLVal tn = newVar.apply();
        
        {ESLVal hp = new ESLVal("PVar",loc0,hn,voidType);
        ESLVal tp = new ESLVal("PVar",loc0,tn,voidType);
        ESLVal hv = new ESLVal("Var",loc0,hn);
        ESLVal tv = new ESLVal("Var",loc0,tn);
        
        return new ESLVal("Let",loc0,ESLVal.list(new ESLVal("Binding",loc0,hn,voidType,voidType,new ESLVal("Head",l)),new ESLVal("Binding",loc0,tn,voidType,voidType,new ESLVal("Tail",l))),compileCase.apply(loc,ESLVal.list(hv,tv).add(tail.apply(es)),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(explodeCons.apply(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(arms),alt));
      }
      }
    }
  });
  private static ESLVal processLists = new ESLVal(new Function(new ESLVal("processLists"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal consArms = filter.apply(new ESLVal(new Function(new ESLVal("fun566"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms);
        ESLVal nilArms = map.apply(dropPattern,filter.apply(new ESLVal(new Function(new ESLVal("fun567"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPNil.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms));
        
        return new ESLVal("CaseList",l,head.apply(es),processConsArms.apply(l,es,consArms,alt),compileCase.apply(l,tail.apply(es),nilArms,alt),alt);
      }
    }
  });
  private static ESLVal processSetArms = new ESLVal(new Function(new ESLVal("processSetArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arm = $args[2];
  {ESLVal _v2086 = head.apply(armPatterns.apply(arm));
        
        switch(_v2086.termName) {
        case "PEmptySet": {ESLVal $3123 = _v2086.termRef(0);
          
          {ESLVal pl = $3123;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("emptyset")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PSetCons": {ESLVal $3122 = _v2086.termRef(0);
          ESLVal $3121 = _v2086.termRef(1);
          ESLVal $3120 = _v2086.termRef(2);
          
          {ESLVal pl = $3122;
          
          {ESLVal p1 = $3121;
          
          {ESLVal p2 = $3120;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setcons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeSetCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $3119 = _v2086.termRef(0);
          ESLVal $3118 = _v2086.termRef(1);
          ESLVal $3117 = _v2086.termRef(2);
          
          {ESLVal pl = $3119;
          
          {ESLVal p1 = $3118;
          
          {ESLVal p2 = $3117;
          
          {ESLVal fail = newVar.apply();
          ESLVal left = newVar.apply();
          ESLVal right = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$add"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setadd")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(explodeAdd.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17621,18742)").add(ESLVal.list(_v2086)));
      }
      }
    }
  });
  private static ESLVal processNonDetListArms = new ESLVal(new Function(new ESLVal("processNonDetListArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arm = $args[2];
  {ESLVal _v2087 = head.apply(armPatterns.apply(arm));
        
        switch(_v2087.termName) {
        case "PNil": {ESLVal $3152 = _v2087.termRef(0);
          
          {ESLVal pl = $3152;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("nil")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PCons": {ESLVal $3151 = _v2087.termRef(0);
          ESLVal $3150 = _v2087.termRef(1);
          ESLVal $3149 = _v2087.termRef(2);
          
          {ESLVal pl = $3151;
          
          {ESLVal p1 = $3150;
          
          {ESLVal p2 = $3149;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("cons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $3126 = _v2087.termRef(0);
          ESLVal $3125 = _v2087.termRef(1);
          ESLVal $3124 = _v2087.termRef(2);
          
          switch($3125.termName) {
          case "PCons": {ESLVal $3147 = $3125.termRef(0);
            ESLVal $3146 = $3125.termRef(1);
            ESLVal $3145 = $3125.termRef(2);
            
            switch($3145.termName) {
            case "PNil": {ESLVal $3148 = $3145.termRef(0);
              
              {ESLVal l1 = $3126;
              
              {ESLVal l2 = $3147;
              
              {ESLVal p1 = $3146;
              
              {ESLVal l3 = $3148;
              
              {ESLVal p2 = $3124;
              
              {ESLVal fail = newVar.apply();
              ESLVal left = newVar.apply();
              ESLVal right = newVar.apply();
              ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns.apply(arm))));
              
              return new ESLVal("Term",l,new ESLVal("$selectLeft"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
            }
            }
            }
            }
            }
            }
            }
            default: switch($3124.termName) {
              case "PCons": {ESLVal $3136 = $3124.termRef(0);
                ESLVal $3135 = $3124.termRef(1);
                ESLVal $3134 = $3124.termRef(2);
                
                switch($3134.termName) {
                case "PNil": {ESLVal $3137 = $3134.termRef(0);
                  
                  {ESLVal l1 = $3126;
                  
                  {ESLVal p1 = $3125;
                  
                  {ESLVal l2 = $3136;
                  
                  {ESLVal p2 = $3135;
                  
                  {ESLVal l3 = $3137;
                  
                  {ESLVal fail = newVar.apply();
                  ESLVal left = newVar.apply();
                  ESLVal right = newVar.apply();
                  ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns.apply(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectRight"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
              }
            case "PAdd": {ESLVal $3129 = $3124.termRef(0);
                ESLVal $3128 = $3124.termRef(1);
                ESLVal $3127 = $3124.termRef(2);
                
                switch($3128.termName) {
                case "PCons": {ESLVal $3132 = $3128.termRef(0);
                  ESLVal $3131 = $3128.termRef(1);
                  ESLVal $3130 = $3128.termRef(2);
                  
                  switch($3130.termName) {
                  case "PNil": {ESLVal $3133 = $3130.termRef(0);
                    
                    {ESLVal l1 = $3126;
                    
                    {ESLVal p1 = $3125;
                    
                    {ESLVal l2 = $3129;
                    
                    {ESLVal l3 = $3132;
                    
                    {ESLVal p2 = $3131;
                    
                    {ESLVal l4 = $3133;
                    
                    {ESLVal p3 = $3127;
                    
                    {ESLVal fail = newVar.apply();
                    ESLVal left = newVar.apply();
                    ESLVal mid = newVar.apply();
                    ESLVal right = newVar.apply();
                    ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns.apply(arm))));
                    
                    return new ESLVal("Term",l,new ESLVal("$selectMid"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
            }
          }
          }
        case "PAdd": {ESLVal $3140 = $3125.termRef(0);
            ESLVal $3139 = $3125.termRef(1);
            ESLVal $3138 = $3125.termRef(2);
            
            switch($3138.termName) {
            case "PCons": {ESLVal $3143 = $3138.termRef(0);
              ESLVal $3142 = $3138.termRef(1);
              ESLVal $3141 = $3138.termRef(2);
              
              switch($3141.termName) {
              case "PNil": {ESLVal $3144 = $3141.termRef(0);
                
                {ESLVal l1 = $3126;
                
                {ESLVal l2 = $3140;
                
                {ESLVal p1 = $3139;
                
                {ESLVal l3 = $3143;
                
                {ESLVal p2 = $3142;
                
                {ESLVal l4 = $3144;
                
                {ESLVal p3 = $3124;
                
                {ESLVal fail = newVar.apply();
                ESLVal left = newVar.apply();
                ESLVal mid = newVar.apply();
                ESLVal right = newVar.apply();
                ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2,p3).add(armPatterns.apply(arm)));
                
                return new ESLVal("Term",l,new ESLVal("$selectMid"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: switch($3124.termName) {
                case "PCons": {ESLVal $3136 = $3124.termRef(0);
                  ESLVal $3135 = $3124.termRef(1);
                  ESLVal $3134 = $3124.termRef(2);
                  
                  switch($3134.termName) {
                  case "PNil": {ESLVal $3137 = $3134.termRef(0);
                    
                    {ESLVal l1 = $3126;
                    
                    {ESLVal p1 = $3125;
                    
                    {ESLVal l2 = $3136;
                    
                    {ESLVal p2 = $3135;
                    
                    {ESLVal l3 = $3137;
                    
                    {ESLVal fail = newVar.apply();
                    ESLVal left = newVar.apply();
                    ESLVal right = newVar.apply();
                    ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns.apply(arm))));
                    
                    return new ESLVal("Term",l,new ESLVal("$selectRight"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
                }
                }
              case "PAdd": {ESLVal $3129 = $3124.termRef(0);
                  ESLVal $3128 = $3124.termRef(1);
                  ESLVal $3127 = $3124.termRef(2);
                  
                  switch($3128.termName) {
                  case "PCons": {ESLVal $3132 = $3128.termRef(0);
                    ESLVal $3131 = $3128.termRef(1);
                    ESLVal $3130 = $3128.termRef(2);
                    
                    switch($3130.termName) {
                    case "PNil": {ESLVal $3133 = $3130.termRef(0);
                      
                      {ESLVal l1 = $3126;
                      
                      {ESLVal p1 = $3125;
                      
                      {ESLVal l2 = $3129;
                      
                      {ESLVal l3 = $3132;
                      
                      {ESLVal p2 = $3131;
                      
                      {ESLVal l4 = $3133;
                      
                      {ESLVal p3 = $3127;
                      
                      {ESLVal fail = newVar.apply();
                      ESLVal left = newVar.apply();
                      ESLVal mid = newVar.apply();
                      ESLVal right = newVar.apply();
                      ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns.apply(arm))));
                      
                      return new ESLVal("Term",l,new ESLVal("$selectMid"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
            }
            }
            default: switch($3124.termName) {
              case "PCons": {ESLVal $3136 = $3124.termRef(0);
                ESLVal $3135 = $3124.termRef(1);
                ESLVal $3134 = $3124.termRef(2);
                
                switch($3134.termName) {
                case "PNil": {ESLVal $3137 = $3134.termRef(0);
                  
                  {ESLVal l1 = $3126;
                  
                  {ESLVal p1 = $3125;
                  
                  {ESLVal l2 = $3136;
                  
                  {ESLVal p2 = $3135;
                  
                  {ESLVal l3 = $3137;
                  
                  {ESLVal fail = newVar.apply();
                  ESLVal left = newVar.apply();
                  ESLVal right = newVar.apply();
                  ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns.apply(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectRight"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
              }
            case "PAdd": {ESLVal $3129 = $3124.termRef(0);
                ESLVal $3128 = $3124.termRef(1);
                ESLVal $3127 = $3124.termRef(2);
                
                switch($3128.termName) {
                case "PCons": {ESLVal $3132 = $3128.termRef(0);
                  ESLVal $3131 = $3128.termRef(1);
                  ESLVal $3130 = $3128.termRef(2);
                  
                  switch($3130.termName) {
                  case "PNil": {ESLVal $3133 = $3130.termRef(0);
                    
                    {ESLVal l1 = $3126;
                    
                    {ESLVal p1 = $3125;
                    
                    {ESLVal l2 = $3129;
                    
                    {ESLVal l3 = $3132;
                    
                    {ESLVal p2 = $3131;
                    
                    {ESLVal l4 = $3133;
                    
                    {ESLVal p3 = $3127;
                    
                    {ESLVal fail = newVar.apply();
                    ESLVal left = newVar.apply();
                    ESLVal mid = newVar.apply();
                    ESLVal right = newVar.apply();
                    ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns.apply(arm))));
                    
                    return new ESLVal("Term",l,new ESLVal("$selectMid"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
            }
          }
          }
          default: switch($3124.termName) {
            case "PCons": {ESLVal $3136 = $3124.termRef(0);
              ESLVal $3135 = $3124.termRef(1);
              ESLVal $3134 = $3124.termRef(2);
              
              switch($3134.termName) {
              case "PNil": {ESLVal $3137 = $3134.termRef(0);
                
                {ESLVal l1 = $3126;
                
                {ESLVal p1 = $3125;
                
                {ESLVal l2 = $3136;
                
                {ESLVal p2 = $3135;
                
                {ESLVal l3 = $3137;
                
                {ESLVal fail = newVar.apply();
                ESLVal left = newVar.apply();
                ESLVal right = newVar.apply();
                ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns.apply(arm))));
                
                return new ESLVal("Term",l,new ESLVal("$selectRight"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
            }
            }
          case "PAdd": {ESLVal $3129 = $3124.termRef(0);
              ESLVal $3128 = $3124.termRef(1);
              ESLVal $3127 = $3124.termRef(2);
              
              switch($3128.termName) {
              case "PCons": {ESLVal $3132 = $3128.termRef(0);
                ESLVal $3131 = $3128.termRef(1);
                ESLVal $3130 = $3128.termRef(2);
                
                switch($3130.termName) {
                case "PNil": {ESLVal $3133 = $3130.termRef(0);
                  
                  {ESLVal l1 = $3126;
                  
                  {ESLVal p1 = $3125;
                  
                  {ESLVal l2 = $3129;
                  
                  {ESLVal l3 = $3132;
                  
                  {ESLVal p2 = $3131;
                  
                  {ESLVal l4 = $3133;
                  
                  {ESLVal p3 = $3127;
                  
                  {ESLVal fail = newVar.apply();
                  ESLVal left = newVar.apply();
                  ESLVal mid = newVar.apply();
                  ESLVal right = newVar.apply();
                  ESLVal newArm = setArmPatterns.apply(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns.apply(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectMid"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
                }
                }
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2087)));
      }
      }
    }
  });
  private static ESLVal processInts = new ESLVal(new Function(new ESLVal("processInts"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal ints = removeDups.apply(map.apply(pIntValue,map.apply(head,map.apply(armPatterns,arms))));
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun568"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return intArms.apply(c,arms);
            }
          }),ints);
        
        return new ESLVal("CaseInt",l,head.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal as = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("IArm",sharedInt.apply(as),compileCase.apply(l,tail.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(dropPattern.apply(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(as),alt)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(armss),alt);
      }
      }
    }
  });
  private static ESLVal processStrs = new ESLVal(new Function(new ESLVal("processStrs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal strs = removeDups.apply(map.apply(pStrValue,map.apply(head,map.apply(armPatterns,arms))));
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun569"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return strArms.apply(c,arms);
            }
          }),strs);
        
        return new ESLVal("CaseStr",l,head.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal as = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("SArm",sharedStr.apply(as),compileCase.apply(l,tail.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(dropPattern.apply(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(as),alt)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(armss),alt);
      }
      }
    }
  });
  private static ESLVal processBools = new ESLVal(new Function(new ESLVal("processBools"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal bools = removeDups.apply(map.apply(pBoolValue,map.apply(head,map.apply(armPatterns,arms))));
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun570"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return boolArms.apply(c,arms);
            }
          }),bools);
        
        return new ESLVal("CaseBool",l,head.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal as = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("BoolArm",sharedBool.apply(as),compileCase.apply(l,tail.apply(es),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(dropPattern.apply(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(as),alt)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(armss),alt);
      }
      }
    }
  });
  private static ESLVal processSets = new ESLVal(new Function(new ESLVal("processSets"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal f = new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setFail")),ESLVal.list(),$null,alt);
        
        return new ESLVal("CaseSet",l,head.apply(es),new ESLVal("List",l,new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(processSetArms.apply(l,tail.apply(es),a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(arms)),f);
      }
    }
  });
  private static ESLVal processNonDetLists = new ESLVal(new Function(new ESLVal("processNonDetLists"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {print.apply(new ESLVal("process nondet lists ").add(es.add(new ESLVal(" ").add(arms))));
      {ESLVal f = new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("listFail")),ESLVal.list(),$null,alt);
        
        return new ESLVal("CaseAdd",l,head.apply(es),new ESLVal("List",l,new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(processNonDetListArms.apply(l,tail.apply(es),a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(arms)),f);
      }}
    }
  });
  private static ESLVal splitTerms = new ESLVal(new Function(new ESLVal("splitTerms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun571"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun572"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitLists = new ESLVal(new Function(new ESLVal("splitLists"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun573"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun574"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitAdd = new ESLVal(new Function(new ESLVal("splitAdd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun575"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPAdd.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun576"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPAdd.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitSets = new ESLVal(new Function(new ESLVal("splitSets"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun577"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPSet.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun578"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPSet.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitInts = new ESLVal(new Function(new ESLVal("splitInts"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun579"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun580"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitStrs = new ESLVal(new Function(new ESLVal("splitStrs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun581"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun582"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitBools = new ESLVal(new Function(new ESLVal("splitBools"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun583"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun584"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitVars = new ESLVal(new Function(new ESLVal("splitVars"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun585"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun586"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),alt));
    }
  });
  private static ESLVal splitCase = new ESLVal(new Function(new ESLVal("splitCase"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  {ESLVal firstPatterns = map.apply(head,map.apply(armPatterns,arms));
        
        {ESLVal nonVarPatterns = filter.apply(new ESLVal(new Function(new ESLVal("fun587"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal p = $args[0];
          return isPVar.apply(p).not();
            }
          }),firstPatterns);
        
        if(isPTerm.apply(head.apply(nonVarPatterns)).boolVal)
        return splitTerms.apply(l,es,arms,alt);
        else
          if(isPList.apply(head.apply(nonVarPatterns)).boolVal)
            return splitLists.apply(l,es,arms,alt);
            else
              if(isPSet.apply(head.apply(nonVarPatterns)).boolVal)
                return splitSets.apply(l,es,arms,alt);
                else
                  if(isPInt.apply(head.apply(nonVarPatterns)).boolVal)
                    return splitInts.apply(l,es,arms,alt);
                    else
                      if(isPStr.apply(head.apply(nonVarPatterns)).boolVal)
                        return splitStrs.apply(l,es,arms,alt);
                        else
                          if(isPBool.apply(head.apply(nonVarPatterns)).boolVal)
                            return splitBools.apply(l,es,arms,alt);
                            else
                              if(isPVar.apply(head.apply(firstPatterns)).boolVal)
                                return splitVars.apply(l,es,arms,alt);
                                else
                                  if(isPAdd.apply(head.apply(firstPatterns)).boolVal)
                                    return splitAdd.apply(l,es,arms,alt);
                                    else
                                      return error(new ESLVal("unknown split case: ").add(arms));
      }
      }
    }
  });
  private static ESLVal compileCase = new ESLVal(new Function(new ESLVal("compileCase"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  if(arms.eql($nil).boolVal)
        return alt;
        else
          if(isEmptyPatterns.apply(arms).boolVal)
            return foldArms.apply(l,arms,alt);
            else
              if(isFirstColumnVars.apply(arms).boolVal)
                return compileCase.apply(l,tail.apply(es),bindVars.apply(head.apply(es),arms),alt);
                else
                  if(isFirstColumnCnstrs.apply(arms).boolVal)
                    return processCnstrs.apply(l,es,arms,alt);
                    else
                      if(isFirstColumnLists.apply(arms).boolVal)
                        return processLists.apply(l,es,arms,alt);
                        else
                          if(isFirstColumnInts.apply(arms).boolVal)
                            return processInts.apply(l,es,arms,alt);
                            else
                              if(isFirstColumnBools.apply(arms).boolVal)
                                return processBools.apply(l,es,arms,alt);
                                else
                                  if(isFirstColumnStrs.apply(arms).boolVal)
                                    return processStrs.apply(l,es,arms,alt);
                                    else
                                      if(isFirstColumnSets.apply(arms).boolVal)
                                        return processSets.apply(l,es,arms,alt);
                                        else
                                          if(isFirstColumnNonDetLists.apply(arms).boolVal)
                                            return processNonDetLists.apply(l,es,arms,alt);
                                            else
                                              return splitCase.apply(l,es,arms,alt);
    }
  });
  private static ESLVal foldArms = new ESLVal(new Function(new ESLVal("foldArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal arms = $args[1];
  ESLVal alt = $args[2];
  {ESLVal _v2088 = arms;
        
        if(_v2088.isCons())
        {ESLVal $3153 = _v2088.head();
          ESLVal $3154 = _v2088.tail();
          
          switch($3153.termName) {
          case "LArm": {ESLVal $3159 = $3153.termRef(0);
            ESLVal $3158 = $3153.termRef(1);
            ESLVal $3157 = $3153.termRef(2);
            ESLVal $3156 = $3153.termRef(3);
            ESLVal $3155 = $3153.termRef(4);
            
            if($3158.isCons())
            {ESLVal $3160 = $3158.head();
              ESLVal $3161 = $3158.tail();
              
              return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2088)));
            }
          else if($3158.isNil())
            {ESLVal al = $3159;
              
              {ESLVal bs = $3157;
              
              {ESLVal g = $3156;
              
              {ESLVal e = $3155;
              
              {ESLVal _v2099 = $3154;
              
              return foldArm.apply(al,bs,g,e,foldArms.apply(l,_v2099,alt));
            }
            }
            }
            }
            }
          else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2088)));
          }
          default: return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2088)));
        }
        }
      else if(_v2088.isNil())
        return alt;
      else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2088)));
      }
    }
  });
  private static ESLVal foldArm = new ESLVal(new Function(new ESLVal("foldArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal bss = $args[1];
  ESLVal g = $args[2];
  ESLVal e = $args[3];
  ESLVal alt = $args[4];
  {ESLVal _v2089 = bss;
        
        if(_v2089.isCons())
        {ESLVal $3162 = _v2089.head();
          ESLVal $3163 = _v2089.tail();
          
          {ESLVal bs = $3162;
          
          {ESLVal _v2096 = $3163;
          
          return new ESLVal("Let",l,bs,foldArm.apply(l,_v2096,g,e,alt));
        }
        }
        }
      else if(_v2089.isNil())
        {ESLVal _v2090 = g;
          
          switch(_v2090.termName) {
          case "BoolExp": {ESLVal $3165 = _v2090.termRef(0);
            ESLVal $3164 = _v2090.termRef(1);
            
            switch($3164.boolVal ? 1 : 0) {
            case 1: {ESLVal bl = $3165;
              
              return e;
            }
            default: {ESLVal _v2097 = _v2090;
              
              return new ESLVal("If",l,_v2097,e,alt);
            }
          }
          }
          default: {ESLVal _v2098 = _v2090;
            
            return new ESLVal("If",l,_v2098,e,alt);
          }
        }
        }
      else return error(new ESLVal("case error at Pos(27642,27842)").add(ESLVal.list(_v2089)));
      }
    }
  });
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v2091 = q;
        
        switch(_v2091.termName) {
        case "BQual": {ESLVal $3170 = _v2091.termRef(0);
          ESLVal $3169 = _v2091.termRef(1);
          ESLVal $3168 = _v2091.termRef(2);
          
          {ESLVal l = $3170;
          
          {ESLVal p = $3169;
          
          {ESLVal e = $3168;
          
          return new ESLVal("BQual",l,p,translateCases.apply(e));
        }
        }
        }
        }
      case "PQual": {ESLVal $3167 = _v2091.termRef(0);
          ESLVal $3166 = _v2091.termRef(1);
          
          {ESLVal l = $3167;
          
          {ESLVal p = $3166;
          
          return new ESLVal("PQual",l,translateCases.apply(p));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(27894,28031)").add(ESLVal.list(_v2091)));
      }
      }
    }
  });
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v2092 = a;
        
        switch(_v2092.termName) {
        case "LArm": {ESLVal $3175 = _v2092.termRef(0);
          ESLVal $3174 = _v2092.termRef(1);
          ESLVal $3173 = _v2092.termRef(2);
          ESLVal $3172 = _v2092.termRef(3);
          ESLVal $3171 = _v2092.termRef(4);
          
          {ESLVal l = $3175;
          
          {ESLVal ps = $3174;
          
          {ESLVal bs = $3173;
          
          {ESLVal guard = $3172;
          
          {ESLVal e = $3171;
          
          return new ESLVal("LArm",l,ps,bs,translateCases.apply(guard),translateCases.apply(e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28070,28203)").add(ESLVal.list(_v2092)));
      }
      }
    }
  });
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v2093 = b;
        
        switch(_v2093.termName) {
        case "Binding": {ESLVal $3199 = _v2093.termRef(0);
          ESLVal $3198 = _v2093.termRef(1);
          ESLVal $3197 = _v2093.termRef(2);
          ESLVal $3196 = _v2093.termRef(3);
          ESLVal $3195 = _v2093.termRef(4);
          
          {ESLVal l = $3199;
          
          {ESLVal name = $3198;
          
          {ESLVal t = $3197;
          
          {ESLVal st = $3196;
          
          {ESLVal value = $3195;
          
          return new ESLVal("Binding",l,name,t,st,translateCases.apply(value));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $3194 = _v2093.termRef(0);
          ESLVal $3193 = _v2093.termRef(1);
          ESLVal $3192 = _v2093.termRef(2);
          ESLVal $3191 = _v2093.termRef(3);
          
          {ESLVal l = $3194;
          
          {ESLVal name = $3193;
          
          {ESLVal t = $3192;
          
          {ESLVal ignore = $3191;
          
          return b;
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $3190 = _v2093.termRef(0);
          ESLVal $3189 = _v2093.termRef(1);
          ESLVal $3188 = _v2093.termRef(2);
          ESLVal $3187 = _v2093.termRef(3);
          
          {ESLVal l = $3190;
          
          {ESLVal name = $3189;
          
          {ESLVal t = $3188;
          
          {ESLVal ignore = $3187;
          
          return b;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $3186 = _v2093.termRef(0);
          ESLVal $3185 = _v2093.termRef(1);
          ESLVal $3184 = _v2093.termRef(2);
          ESLVal $3183 = _v2093.termRef(3);
          ESLVal $3182 = _v2093.termRef(4);
          ESLVal $3181 = _v2093.termRef(5);
          ESLVal $3180 = _v2093.termRef(6);
          
          {ESLVal l = $3186;
          
          {ESLVal n = $3185;
          
          {ESLVal args = $3184;
          
          {ESLVal t = $3183;
          
          {ESLVal st = $3182;
          
          {ESLVal body = $3181;
          
          {ESLVal guard = $3180;
          
          return new ESLVal("FunBind",l,n,args,t,st,translateCases.apply(body),translateCases.apply(guard));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $3179 = _v2093.termRef(0);
          ESLVal $3178 = _v2093.termRef(1);
          ESLVal $3177 = _v2093.termRef(2);
          ESLVal $3176 = _v2093.termRef(3);
          
          {ESLVal l = $3179;
          
          {ESLVal name = $3178;
          
          {ESLVal t = $3177;
          
          {ESLVal ignore = $3176;
          
          return b;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v2093;
          
          return error(x);
        }
      }
      }
    }
  });
  private static ESLVal pterm = new ESLVal(new Function(new ESLVal("pterm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal ps = $args[1];
  return new ESLVal("PTerm",loc0,n,$nil,ps);
    }
  });
  private static ESLVal pvar = new ESLVal(new Function(new ESLVal("pvar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  return new ESLVal("PVar",loc0,n,voidType);
    }
  });
  private static ESLVal var = new ESLVal(new Function(new ESLVal("var"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  return new ESLVal("Var",loc0,n);
    }
  });
  private static ESLVal pcons = new ESLVal(new Function(new ESLVal("pcons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal h = $args[0];
  ESLVal t = $args[1];
  return new ESLVal("PCons",loc0,h,t);
    }
  });
  private static ESLVal case0 = new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("x")),new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PVar",loc0,new ESLVal("xx"),voidType),new ESLVal("PVar",loc0,new ESLVal("yy"),voidType)),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK")))));
  private static ESLVal case1 = new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("x")),new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(pterm.apply(new ESLVal("A"),ESLVal.list(pterm.apply(new ESLVal("B"),ESLVal.list(pvar.apply(new ESLVal("v0")))),pvar.apply(new ESLVal("v1")),pvar.apply(new ESLVal("v2")))),pterm.apply(new ESLVal("C"),ESLVal.list())),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK1"))),new ESLVal("BArm",loc0,ESLVal.list(pvar.apply(new ESLVal("v0")),pterm.apply(new ESLVal("C"),ESLVal.list())),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK2")))));
  private static ESLVal case2 = new ESLVal("Case",loc0,$nil,ESLVal.list(var.apply(new ESLVal("l"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PNil",loc0)),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(pcons.apply(pterm.apply(new ESLVal("One"),ESLVal.list()),pvar.apply(new ESLVal("rest1")))),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(pcons.apply(pterm.apply(new ESLVal("Succ"),ESLVal.list(pterm.apply(new ESLVal("One"),ESLVal.list()))),pvar.apply(new ESLVal("rest2")))),var.apply(new ESLVal("g2")),var.apply(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(pcons.apply(pterm.apply(new ESLVal("Infinity"),ESLVal.list()),new ESLVal("PNil",loc0))),var.apply(new ESLVal("g3")),var.apply(new ESLVal("M3")))));
  private static ESLVal case3 = new ESLVal("Case",loc0,$nil,ESLVal.list(var.apply(new ESLVal("x")),var.apply(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$zero),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$one),new ESLVal("PInt",loc0,$zero)),var.apply(new ESLVal("g2")),var.apply(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$zero),pvar.apply(new ESLVal("x"))),var.apply(new ESLVal("g3")),var.apply(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar.apply(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g4")),var.apply(new ESLVal("M4")))));
  private static ESLVal case4 = new ESLVal("Case",loc0,$nil,ESLVal.list(var.apply(new ESLVal("x")),var.apply(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$zero)),var.apply(new ESLVal("g2")),var.apply(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("two")),pvar.apply(new ESLVal("x"))),var.apply(new ESLVal("g3")),var.apply(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar.apply(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g4")),var.apply(new ESLVal("M4")))));
  private static ESLVal case5 = new ESLVal("Case",loc0,$nil,ESLVal.list(var.apply(new ESLVal("x")),var.apply(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$zero)),var.apply(new ESLVal("g2")),var.apply(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("two")),pvar.apply(new ESLVal("x"))),var.apply(new ESLVal("g3")),var.apply(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar.apply(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g4")),var.apply(new ESLVal("M4"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PBool",loc0,$true),new ESLVal("PInt",loc0,$one)),var.apply(new ESLVal("g4")),var.apply(new ESLVal("M4")))));
  private static ESLVal case6 = new ESLVal("Case",loc0,$nil,ESLVal.list(var.apply(new ESLVal("x"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(pterm.apply(new ESLVal("A"),ESLVal.list(new ESLVal("PInt",loc0,$one)))),var.apply(new ESLVal("g1")),var.apply(new ESLVal("M1")))));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2095 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2095)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {new Function(new ESLVal("try"),getSelf()) {
              public ESLVal apply(ESLVal... args) { 
                try { 
                  return ((Supplier<ESLVal>)() -> { 
                  {print.apply(ppExp.apply($zero,translateCases.apply(case0)));
                  print.apply(ppExp.apply($zero,translateCases.apply(case1)));
                  print.apply(ppExp.apply($zero,translateCases.apply(case2)));
                  print.apply(ppExp.apply($zero,translateCases.apply(case3)));
                  print.apply(ppExp.apply($zero,translateCases.apply(case4)));
                  print.apply(ppExp.apply($zero,translateCases.apply(case5)));
                  return print.apply(ppExp.apply($zero,translateCases.apply(case6)));}
                }).get();
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v2094 = $x;
              
              {ESLVal x = _v2094;
              
              return print.apply(x);
            }
            }
                }
              }
            }.apply();
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
    newActor(main,new ESLVal(new Actor())); 
  }
}