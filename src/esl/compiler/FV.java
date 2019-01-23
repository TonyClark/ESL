package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
// import static esl.Lists.*;
public class FV {
  public static ESLVal getSelf() { return $null; }
  
private static ESLVal remStr(ESLVal s,ESLVal ss) {
    
    return remove.apply(s,ss);
  }
  private static ESLVal remStr = new ESLVal(new Function(new ESLVal("remStr"),null) { public ESLVal apply(ESLVal... args) { return remStr(args[0],args[1]); }});
  private static ESLVal remStrs(ESLVal ss1,ESLVal ss2) {
    
    return removeAll(ss1,ss2);
  }
  private static ESLVal remStrs = new ESLVal(new Function(new ESLVal("remStrs"),null) { public ESLVal apply(ESLVal... args) { return remStrs(args[0],args[1]); }});
  public static ESLVal bindingFV(ESLVal b) {
    
    {ESLVal _v1705 = b;
      
      switch(_v1705.termName) {
      case "TypeBind": {ESLVal $2877 = _v1705.termRef(0);
        ESLVal $2876 = _v1705.termRef(1);
        ESLVal $2875 = _v1705.termRef(2);
        ESLVal $2874 = _v1705.termRef(3);
        
        {ESLVal v0 = $2877;
        
        {ESLVal v1 = $2876;
        
        {ESLVal v2 = $2875;
        
        {ESLVal v3 = $2874;
        
        return $nil;
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $2873 = _v1705.termRef(0);
        ESLVal $2872 = _v1705.termRef(1);
        ESLVal $2871 = _v1705.termRef(2);
        ESLVal $2870 = _v1705.termRef(3);
        
        {ESLVal v0 = $2873;
        
        {ESLVal v1 = $2872;
        
        {ESLVal v2 = $2871;
        
        {ESLVal v3 = $2870;
        
        return $nil;
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $2869 = _v1705.termRef(0);
        ESLVal $2868 = _v1705.termRef(1);
        ESLVal $2867 = _v1705.termRef(2);
        ESLVal $2866 = _v1705.termRef(3);
        ESLVal $2865 = _v1705.termRef(4);
        ESLVal $2864 = _v1705.termRef(5);
        ESLVal $2863 = _v1705.termRef(6);
        
        {ESLVal v0 = $2869;
        
        {ESLVal v1 = $2868;
        
        {ESLVal v2 = $2867;
        
        {ESLVal v3 = $2866;
        
        {ESLVal v4 = $2865;
        
        {ESLVal body = $2864;
        
        {ESLVal guard = $2863;
        
        return remStrs(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal p = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = patternNames(p);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v2),freeVars(body));
      }
      }
      }
      }
      }
      }
      }
      }
    case "FunBinds": {ESLVal $2855 = _v1705.termRef(0);
        ESLVal $2854 = _v1705.termRef(1);
        
        if($2854.isCons())
        {ESLVal $2856 = $2854.head();
          ESLVal $2857 = $2854.tail();
          
          switch($2856.termName) {
          case "FunCase": {ESLVal $2862 = $2856.termRef(0);
            ESLVal $2861 = $2856.termRef(1);
            ESLVal $2860 = $2856.termRef(2);
            ESLVal $2859 = $2856.termRef(3);
            ESLVal $2858 = $2856.termRef(4);
            
            {ESLVal n = $2855;
            
            {ESLVal l = $2862;
            
            {ESLVal args = $2861;
            
            {ESLVal t = $2860;
            
            {ESLVal g = $2859;
            
            {ESLVal e = $2858;
            
            {ESLVal cases = $2857;
            
            return $nil;
          }
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(230,815)").add(ESLVal.list(_v1705)));
        }
        }
      else if($2854.isNil())
        return error(new ESLVal("case error at Pos(230,815)").add(ESLVal.list(_v1705)));
      else return error(new ESLVal("case error at Pos(230,815)").add(ESLVal.list(_v1705)));
      }
    case "Binding": {ESLVal $2853 = _v1705.termRef(0);
        ESLVal $2852 = _v1705.termRef(1);
        ESLVal $2851 = _v1705.termRef(2);
        ESLVal $2850 = _v1705.termRef(3);
        ESLVal $2849 = _v1705.termRef(4);
        
        {ESLVal v0 = $2853;
        
        {ESLVal v1 = $2852;
        
        {ESLVal v2 = $2851;
        
        {ESLVal v3 = $2850;
        
        {ESLVal v4 = $2849;
        
        return freeVars(v4);
      }
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $2848 = _v1705.termRef(0);
        ESLVal $2847 = _v1705.termRef(1);
        ESLVal $2846 = _v1705.termRef(2);
        ESLVal $2845 = _v1705.termRef(3);
        
        {ESLVal v0 = $2848;
        
        {ESLVal v1 = $2847;
        
        {ESLVal v2 = $2846;
        
        {ESLVal v3 = $2845;
        
        return $nil;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(230,815)").add(ESLVal.list(_v1705)));
    }
    }
  }
  public static ESLVal bindingFV = new ESLVal(new Function(new ESLVal("bindingFV"),null) { public ESLVal apply(ESLVal... args) { return bindingFV(args[0]); }});
  private static ESLVal armFV(ESLVal a) {
    
    {ESLVal _v1706 = a;
      
      switch(_v1706.termName) {
      case "BArm": {ESLVal $2881 = _v1706.termRef(0);
        ESLVal $2880 = _v1706.termRef(1);
        ESLVal $2879 = _v1706.termRef(2);
        ESLVal $2878 = _v1706.termRef(3);
        
        {ESLVal l = $2881;
        
        {ESLVal ps = $2880;
        
        {ESLVal g = $2879;
        
        {ESLVal e = $2878;
        
        {ESLVal bound = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal p = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = patternNames(p);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ps);
        
        return remStrs(bound,freeVars(g).add(freeVars(e)));
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(842,993)").add(ESLVal.list(_v1706)));
    }
    }
  }
  private static ESLVal armFV = new ESLVal(new Function(new ESLVal("armFV"),null) { public ESLVal apply(ESLVal... args) { return armFV(args[0]); }});
  public static ESLVal freeVars(ESLVal e) {
    
    {ESLVal _v1707 = e;
      
      switch(_v1707.termName) {
      case "ActExp": {ESLVal $3033 = _v1707.termRef(0);
        ESLVal $3032 = _v1707.termRef(1);
        ESLVal $3031 = _v1707.termRef(2);
        ESLVal $3030 = _v1707.termRef(3);
        ESLVal $3029 = _v1707.termRef(4);
        ESLVal $3028 = _v1707.termRef(5);
        ESLVal $3027 = _v1707.termRef(6);
        ESLVal $3026 = _v1707.termRef(7);
        
        {ESLVal l = $3033;
        
        {ESLVal name = $3032;
        
        {ESLVal args = $3031;
        
        {ESLVal exports = $3030;
        
        {ESLVal parent = $3029;
        
        {ESLVal bindings = $3028;
        
        {ESLVal init = $3027;
        
        {ESLVal handlers = $3026;
        
        {ESLVal outerBoundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1710 = $qualArg;
                
                switch(_v1710.termName) {
                case "Dec": {ESLVal $3043 = _v1710.termRef(0);
                  ESLVal $3042 = _v1710.termRef(1);
                  ESLVal $3041 = _v1710.termRef(2);
                  ESLVal $3040 = _v1710.termRef(3);
                  
                  {ESLVal _v1715 = $3043;
                  
                  {ESLVal n = $3042;
                  
                  {ESLVal t = $3041;
                  
                  {ESLVal dt = $3040;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v1710;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        ESLVal innerBoundVars = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(bindingName(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bindings);
        ESLVal bindingFV = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = bindingFV(b);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bindings);
        ESLVal handlerFV = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal a = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = armFV(a);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(handlers);
        ESLVal parentFV = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            if(parent.eql($null).boolVal)
              return $nil;
              else
                return freeVars(parent);
          }}.get();
        
        return remStrs(outerBoundVars,freeVars(name).add(parentFV.add(freeVars(init)))).add(remStrs(outerBoundVars.add(innerBoundVars),bindingFV.add(handlerFV)));
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
    case "Apply": {ESLVal $3025 = _v1707.termRef(0);
        ESLVal $3024 = _v1707.termRef(1);
        ESLVal $3023 = _v1707.termRef(2);
        
        {ESLVal v0 = $3025;
        
        {ESLVal v1 = $3024;
        
        {ESLVal v2 = $3023;
        
        return freeVars(v1).add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v2));
      }
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $3022 = _v1707.termRef(0);
        ESLVal $3021 = _v1707.termRef(1);
        ESLVal $3020 = _v1707.termRef(2);
        
        {ESLVal v0 = $3022;
        
        {ESLVal v1 = $3021;
        
        {ESLVal v2 = $3020;
        
        return freeVars(v1);
      }
      }
      }
      }
    case "ArrayRef": {ESLVal $3019 = _v1707.termRef(0);
        ESLVal $3018 = _v1707.termRef(1);
        ESLVal $3017 = _v1707.termRef(2);
        
        {ESLVal v0 = $3019;
        
        {ESLVal v1 = $3018;
        
        {ESLVal v2 = $3017;
        
        return freeVars(v1).add(freeVars(v2));
      }
      }
      }
      }
    case "ArrayUpdate": {ESLVal $3016 = _v1707.termRef(0);
        ESLVal $3015 = _v1707.termRef(1);
        ESLVal $3014 = _v1707.termRef(2);
        ESLVal $3013 = _v1707.termRef(3);
        
        {ESLVal v0 = $3016;
        
        {ESLVal v1 = $3015;
        
        {ESLVal v2 = $3014;
        
        {ESLVal v3 = $3013;
        
        return freeVars(v1).add(freeVars(v2).add(freeVars(v3)));
      }
      }
      }
      }
      }
    case "BagExp": {ESLVal $3012 = _v1707.termRef(0);
        ESLVal $3011 = _v1707.termRef(1);
        
        {ESLVal v0 = $3012;
        
        {ESLVal v1 = $3011;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1);
      }
      }
      }
    case "Become": {ESLVal $3010 = _v1707.termRef(0);
        ESLVal $3009 = _v1707.termRef(1);
        
        {ESLVal v0 = $3010;
        
        {ESLVal v1 = $3009;
        
        return freeVars(v1);
      }
      }
      }
    case "BinExp": {ESLVal $3008 = _v1707.termRef(0);
        ESLVal $3007 = _v1707.termRef(1);
        ESLVal $3006 = _v1707.termRef(2);
        ESLVal $3005 = _v1707.termRef(3);
        
        {ESLVal v0 = $3008;
        
        {ESLVal v1 = $3007;
        
        {ESLVal v2 = $3006;
        
        {ESLVal v3 = $3005;
        
        return freeVars(v1).add(freeVars(v3));
      }
      }
      }
      }
      }
    case "Block": {ESLVal $3004 = _v1707.termRef(0);
        ESLVal $3003 = _v1707.termRef(1);
        
        {ESLVal v0 = $3004;
        
        {ESLVal v1 = $3003;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1);
      }
      }
      }
    case "BoolExp": {ESLVal $3002 = _v1707.termRef(0);
        ESLVal $3001 = _v1707.termRef(1);
        
        {ESLVal v0 = $3002;
        
        {ESLVal v1 = $3001;
        
        return $nil;
      }
      }
      }
    case "Case": {ESLVal $3000 = _v1707.termRef(0);
        ESLVal $2999 = _v1707.termRef(1);
        ESLVal $2998 = _v1707.termRef(2);
        ESLVal $2997 = _v1707.termRef(3);
        
        {ESLVal v0 = $3000;
        
        {ESLVal v1 = $2999;
        
        {ESLVal v2 = $2998;
        
        {ESLVal v3 = $2997;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v2).add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = armFV(a);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v3));
      }
      }
      }
      }
      }
    case "Cmp": {ESLVal $2989 = _v1707.termRef(0);
        ESLVal $2988 = _v1707.termRef(1);
        ESLVal $2987 = _v1707.termRef(2);
        
        if($2987.isCons())
        {ESLVal $2990 = $2987.head();
          ESLVal $2991 = $2987.tail();
          
          switch($2990.termName) {
          case "BQual": {ESLVal $2996 = $2990.termRef(0);
            ESLVal $2995 = $2990.termRef(1);
            ESLVal $2994 = $2990.termRef(2);
            
            {ESLVal l = $2989;
            
            {ESLVal _v1713 = $2988;
            
            {ESLVal ql = $2996;
            
            {ESLVal qp = $2995;
            
            {ESLVal qe = $2994;
            
            {ESLVal qs = $2991;
            
            return freeVars(qe).add(remStrs(patternNames(qp),freeVars(new ESLVal("Cmp",l,_v1713,qs))));
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $2993 = $2990.termRef(0);
            ESLVal $2992 = $2990.termRef(1);
            
            {ESLVal l = $2989;
            
            {ESLVal _v1712 = $2988;
            
            {ESLVal ql = $2993;
            
            {ESLVal qe = $2992;
            
            {ESLVal qs = $2991;
            
            return freeVars(qe).add(freeVars(new ESLVal("Cmp",l,_v1712,qs)));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1025,6155)").add(ESLVal.list(_v1707)));
        }
        }
      else if($2987.isNil())
        {ESLVal l = $2989;
          
          {ESLVal _v1714 = $2988;
          
          return freeVars(_v1714);
        }
        }
      else return error(new ESLVal("case error at Pos(1025,6155)").add(ESLVal.list(_v1707)));
      }
    case "Cons": {ESLVal $2986 = _v1707.termRef(0);
        ESLVal $2985 = _v1707.termRef(1);
        
        {ESLVal v0 = $2986;
        
        {ESLVal v1 = $2985;
        
        return freeVars(v0).add(freeVars(v1));
      }
      }
      }
    case "For": {ESLVal $2984 = _v1707.termRef(0);
        ESLVal $2983 = _v1707.termRef(1);
        ESLVal $2982 = _v1707.termRef(2);
        ESLVal $2981 = _v1707.termRef(3);
        
        {ESLVal v0 = $2984;
        
        {ESLVal v1 = $2983;
        
        {ESLVal v2 = $2982;
        
        {ESLVal v3 = $2981;
        
        return freeVars(v2).add(remStrs(patternNames(v1),freeVars(v3)));
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $2980 = _v1707.termRef(0);
        ESLVal $2979 = _v1707.termRef(1);
        ESLVal $2978 = _v1707.termRef(2);
        ESLVal $2977 = _v1707.termRef(3);
        ESLVal $2976 = _v1707.termRef(4);
        
        {ESLVal v0 = $2980;
        
        {ESLVal v1 = $2979;
        
        {ESLVal v2 = $2978;
        
        {ESLVal v3 = $2977;
        
        {ESLVal v4 = $2976;
        
        return remStrs(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1709 = $qualArg;
              
              switch(_v1709.termName) {
              case "Dec": {ESLVal $3039 = _v1709.termRef(0);
                ESLVal $3038 = _v1709.termRef(1);
                ESLVal $3037 = _v1709.termRef(2);
                ESLVal $3036 = _v1709.termRef(3);
                
                {ESLVal l = $3039;
                
                {ESLVal n = $3038;
                
                {ESLVal t = $3037;
                
                {ESLVal dt = $3036;
                
                return ESLVal.list(ESLVal.list(n));
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v1709;
                
                return $nil;
              }
            }
            }
          }
        }).map(v2).flatten().flatten(),freeVars(v1).add(freeVars(v4)));
      }
      }
      }
      }
      }
      }
    case "Grab": {ESLVal $2975 = _v1707.termRef(0);
        ESLVal $2974 = _v1707.termRef(1);
        ESLVal $2973 = _v1707.termRef(2);
        
        {ESLVal v0 = $2975;
        
        {ESLVal v1 = $2974;
        
        {ESLVal v2 = $2973;
        
        return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1708 = $qualArg;
              
              switch(_v1708.termName) {
              case "VarDynamicRef": {ESLVal $3035 = _v1708.termRef(0);
                ESLVal $3034 = _v1708.termRef(1);
                
                {ESLVal l = $3035;
                
                {ESLVal _v1711 = $3034;
                
                return ESLVal.list(new SerializableFunction<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(n);
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(freeVars(_v1711)));
              }
              }
              }
              default: {ESLVal _0 = _v1708;
                
                return $nil;
              }
            }
            }
          }
        }).map(v1).flatten().flatten().add(freeVars(v2));
      }
      }
      }
      }
    case "If": {ESLVal $2972 = _v1707.termRef(0);
        ESLVal $2971 = _v1707.termRef(1);
        ESLVal $2970 = _v1707.termRef(2);
        ESLVal $2969 = _v1707.termRef(3);
        
        {ESLVal v0 = $2972;
        
        {ESLVal v1 = $2971;
        
        {ESLVal v2 = $2970;
        
        {ESLVal v3 = $2969;
        
        return freeVars(v1).add(freeVars(v2).add(freeVars(v3)));
      }
      }
      }
      }
      }
    case "IntExp": {ESLVal $2968 = _v1707.termRef(0);
        ESLVal $2967 = _v1707.termRef(1);
        
        {ESLVal v0 = $2968;
        
        {ESLVal v1 = $2967;
        
        return $nil;
      }
      }
      }
    case "FloatExp": {ESLVal $2966 = _v1707.termRef(0);
        ESLVal $2965 = _v1707.termRef(1);
        
        {ESLVal v0 = $2966;
        
        {ESLVal v1 = $2965;
        
        return $nil;
      }
      }
      }
    case "Fold": {ESLVal $2964 = _v1707.termRef(0);
        ESLVal $2963 = _v1707.termRef(1);
        ESLVal $2962 = _v1707.termRef(2);
        
        {ESLVal v0 = $2964;
        
        {ESLVal v1 = $2963;
        
        {ESLVal v2 = $2962;
        
        return freeVars(v2);
      }
      }
      }
      }
    case "Head": {ESLVal $2961 = _v1707.termRef(0);
        
        {ESLVal v0 = $2961;
        
        return freeVars(v0);
      }
      }
    case "Let": {ESLVal $2960 = _v1707.termRef(0);
        ESLVal $2959 = _v1707.termRef(1);
        ESLVal $2958 = _v1707.termRef(2);
        
        {ESLVal v0 = $2960;
        
        {ESLVal v1 = $2959;
        
        {ESLVal v2 = $2958;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = bindingFV(b);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1).add(remStrs(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1),freeVars(v2)));
      }
      }
      }
      }
    case "Letrec": {ESLVal $2957 = _v1707.termRef(0);
        ESLVal $2956 = _v1707.termRef(1);
        ESLVal $2955 = _v1707.termRef(2);
        
        {ESLVal v0 = $2957;
        
        {ESLVal v1 = $2956;
        
        {ESLVal v2 = $2955;
        
        return remStrs(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = bindingFV(b);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1).add(freeVars(v2)));
      }
      }
      }
      }
    case "List": {ESLVal $2954 = _v1707.termRef(0);
        ESLVal $2953 = _v1707.termRef(1);
        
        {ESLVal v0 = $2954;
        
        {ESLVal v1 = $2953;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1);
      }
      }
      }
    case "Module": {ESLVal $2952 = _v1707.termRef(0);
        ESLVal $2951 = _v1707.termRef(1);
        ESLVal $2950 = _v1707.termRef(2);
        ESLVal $2949 = _v1707.termRef(3);
        ESLVal $2948 = _v1707.termRef(4);
        ESLVal $2947 = _v1707.termRef(5);
        ESLVal $2946 = _v1707.termRef(6);
        
        {ESLVal v0 = $2952;
        
        {ESLVal v1 = $2951;
        
        {ESLVal v2 = $2950;
        
        {ESLVal v3 = $2949;
        
        {ESLVal v4 = $2948;
        
        {ESLVal v5 = $2947;
        
        {ESLVal v6 = $2946;
        
        return remStrs(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v6),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = bindingFV(b);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v6));
      }
      }
      }
      }
      }
      }
      }
      }
    case "New": {ESLVal $2945 = _v1707.termRef(0);
        ESLVal $2944 = _v1707.termRef(1);
        ESLVal $2943 = _v1707.termRef(2);
        
        {ESLVal v0 = $2945;
        
        {ESLVal v1 = $2944;
        
        {ESLVal v2 = $2943;
        
        return freeVars(v1).add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v2));
      }
      }
      }
      }
    case "NewArray": {ESLVal $2942 = _v1707.termRef(0);
        ESLVal $2941 = _v1707.termRef(1);
        ESLVal $2940 = _v1707.termRef(2);
        
        {ESLVal v0 = $2942;
        
        {ESLVal v1 = $2941;
        
        {ESLVal v2 = $2940;
        
        return freeVars(v2);
      }
      }
      }
      }
    case "NewJava": {ESLVal $2939 = _v1707.termRef(0);
        ESLVal $2938 = _v1707.termRef(1);
        ESLVal $2937 = _v1707.termRef(2);
        ESLVal $2936 = _v1707.termRef(3);
        
        {ESLVal v0 = $2939;
        
        {ESLVal v1 = $2938;
        
        {ESLVal v2 = $2937;
        
        {ESLVal v3 = $2936;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v3);
      }
      }
      }
      }
      }
    case "NewTable": {ESLVal $2935 = _v1707.termRef(0);
        ESLVal $2934 = _v1707.termRef(1);
        ESLVal $2933 = _v1707.termRef(2);
        
        {ESLVal v0 = $2935;
        
        {ESLVal v1 = $2934;
        
        {ESLVal v2 = $2933;
        
        return $nil;
      }
      }
      }
      }
    case "Not": {ESLVal $2932 = _v1707.termRef(0);
        ESLVal $2931 = _v1707.termRef(1);
        
        {ESLVal v0 = $2932;
        
        {ESLVal v1 = $2931;
        
        return freeVars(v1);
      }
      }
      }
    case "Now": {ESLVal $2930 = _v1707.termRef(0);
        
        {ESLVal v0 = $2930;
        
        return $nil;
      }
      }
    case "NullExp": {ESLVal $2929 = _v1707.termRef(0);
        
        {ESLVal v0 = $2929;
        
        return $nil;
      }
      }
    case "PLet": {ESLVal $2928 = _v1707.termRef(0);
        ESLVal $2927 = _v1707.termRef(1);
        ESLVal $2926 = _v1707.termRef(2);
        
        {ESLVal v0 = $2928;
        
        {ESLVal v1 = $2927;
        
        {ESLVal v2 = $2926;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = bindingFV(b);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1).add(remStrs(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1),freeVars(v2)));
      }
      }
      }
      }
    case "Probably": {ESLVal $2925 = _v1707.termRef(0);
        ESLVal $2924 = _v1707.termRef(1);
        ESLVal $2923 = _v1707.termRef(2);
        ESLVal $2922 = _v1707.termRef(3);
        ESLVal $2921 = _v1707.termRef(4);
        
        {ESLVal v0 = $2925;
        
        {ESLVal v1 = $2924;
        
        {ESLVal v2 = $2923;
        
        {ESLVal v3 = $2922;
        
        {ESLVal v4 = $2921;
        
        return freeVars(v1).add(freeVars(v3).add(freeVars(v4)));
      }
      }
      }
      }
      }
      }
    case "Record": {ESLVal $2920 = _v1707.termRef(0);
        ESLVal $2919 = _v1707.termRef(1);
        
        {ESLVal v0 = $2920;
        
        {ESLVal v1 = $2919;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = bindingFV(b);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1);
      }
      }
      }
    case "RefSuper": {ESLVal $2918 = _v1707.termRef(0);
        ESLVal $2917 = _v1707.termRef(1);
        
        {ESLVal v0 = $2918;
        
        {ESLVal v1 = $2917;
        
        return $nil;
      }
      }
      }
    case "Ref": {ESLVal $2916 = _v1707.termRef(0);
        ESLVal $2915 = _v1707.termRef(1);
        ESLVal $2914 = _v1707.termRef(2);
        
        {ESLVal v0 = $2916;
        
        {ESLVal v1 = $2915;
        
        {ESLVal v2 = $2914;
        
        return freeVars(v1);
      }
      }
      }
      }
    case "Self": {ESLVal $2913 = _v1707.termRef(0);
        
        {ESLVal v0 = $2913;
        
        return $nil;
      }
      }
    case "Send": {ESLVal $2912 = _v1707.termRef(0);
        ESLVal $2911 = _v1707.termRef(1);
        ESLVal $2910 = _v1707.termRef(2);
        
        {ESLVal v0 = $2912;
        
        {ESLVal v1 = $2911;
        
        {ESLVal v2 = $2910;
        
        return freeVars(v1).add(freeVars(v2));
      }
      }
      }
      }
    case "SendSuper": {ESLVal $2909 = _v1707.termRef(0);
        ESLVal $2908 = _v1707.termRef(1);
        
        {ESLVal v0 = $2909;
        
        {ESLVal v1 = $2908;
        
        return freeVars(v1);
      }
      }
      }
    case "SendTimeSuper": {ESLVal $2907 = _v1707.termRef(0);
        
        {ESLVal v0 = $2907;
        
        return $nil;
      }
      }
    case "SetExp": {ESLVal $2906 = _v1707.termRef(0);
        ESLVal $2905 = _v1707.termRef(1);
        
        {ESLVal v0 = $2906;
        
        {ESLVal v1 = $2905;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v1);
      }
      }
      }
    case "StrExp": {ESLVal $2904 = _v1707.termRef(0);
        ESLVal $2903 = _v1707.termRef(1);
        
        {ESLVal v0 = $2904;
        
        {ESLVal v1 = $2903;
        
        return $nil;
      }
      }
      }
    case "Tail": {ESLVal $2902 = _v1707.termRef(0);
        
        {ESLVal v0 = $2902;
        
        return freeVars(v0);
      }
      }
    case "Term": {ESLVal $2901 = _v1707.termRef(0);
        ESLVal $2900 = _v1707.termRef(1);
        ESLVal $2899 = _v1707.termRef(2);
        ESLVal $2898 = _v1707.termRef(3);
        
        {ESLVal v0 = $2901;
        
        {ESLVal v1 = $2900;
        
        {ESLVal v2 = $2899;
        
        {ESLVal v3 = $2898;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = freeVars(e);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v3);
      }
      }
      }
      }
      }
    case "TermRef": {ESLVal $2897 = _v1707.termRef(0);
        ESLVal $2896 = _v1707.termRef(1);
        
        {ESLVal v0 = $2897;
        
        {ESLVal v1 = $2896;
        
        return freeVars(v0);
      }
      }
      }
    case "Throw": {ESLVal $2895 = _v1707.termRef(0);
        ESLVal $2894 = _v1707.termRef(1);
        ESLVal $2893 = _v1707.termRef(2);
        
        {ESLVal v0 = $2895;
        
        {ESLVal v1 = $2894;
        
        {ESLVal v2 = $2893;
        
        return freeVars(v2);
      }
      }
      }
      }
    case "Try": {ESLVal $2892 = _v1707.termRef(0);
        ESLVal $2891 = _v1707.termRef(1);
        ESLVal $2890 = _v1707.termRef(2);
        
        {ESLVal v0 = $2892;
        
        {ESLVal v1 = $2891;
        
        {ESLVal v2 = $2890;
        
        return freeVars(v1).add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = armFV(a);
        while(!$l1.isNil()) {
          ESLVal n = $l1.head();
          $l1 = $l1.tail();
          $v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(v2));
      }
      }
      }
      }
    case "Update": {ESLVal $2889 = _v1707.termRef(0);
        ESLVal $2888 = _v1707.termRef(1);
        ESLVal $2887 = _v1707.termRef(2);
        
        {ESLVal v0 = $2889;
        
        {ESLVal v1 = $2888;
        
        {ESLVal v2 = $2887;
        
        return ESLVal.list(v1).add(freeVars(v2));
      }
      }
      }
      }
    case "Unfold": {ESLVal $2886 = _v1707.termRef(0);
        ESLVal $2885 = _v1707.termRef(1);
        ESLVal $2884 = _v1707.termRef(2);
        
        {ESLVal v0 = $2886;
        
        {ESLVal v1 = $2885;
        
        {ESLVal v2 = $2884;
        
        return freeVars(v2);
      }
      }
      }
      }
    case "Var": {ESLVal $2883 = _v1707.termRef(0);
        ESLVal $2882 = _v1707.termRef(1);
        
        {ESLVal v0 = $2883;
        
        {ESLVal v1 = $2882;
        
        return ESLVal.list(v1);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1025,6155)").add(ESLVal.list(_v1707)));
    }
    }
  }
  public static ESLVal freeVars = new ESLVal(new Function(new ESLVal("freeVars"),null) { public ESLVal apply(ESLVal... args) { return freeVars(args[0]); }});
public static void main(String[] args) {
  }
}