package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.Info.*;
public class MethodTransform {
  public static ESLVal getSelf() { return $null; }
  
public static ESLVal addMethodCalls(ESLVal module) {
    
    {ESLVal _v1956 = module;
      
      switch(_v1956.termName) {
      case "JModule": {ESLVal $3963 = _v1956.termRef(0);
        ESLVal $3962 = _v1956.termRef(1);
        ESLVal $3961 = _v1956.termRef(2);
        ESLVal $3960 = _v1956.termRef(3);
        ESLVal $3959 = _v1956.termRef(4);
        
        {ESLVal name = $3963;
        
        {ESLVal exports = $3962;
        
        {ESLVal imports = $3961;
        
        {ESLVal methods = $3960;
        
        {ESLVal fields = $3959;
        
        {ESLVal importedMethodNames = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal path = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = getCachedModuleExportedMethodNames(path);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(imports);
        ESLVal methodNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1957 = $qualArg;
                
                switch(_v1957.termName) {
                case "JMethod": {ESLVal $3966 = _v1957.termRef(0);
                  ESLVal $3965 = _v1957.termRef(1);
                  ESLVal $3964 = _v1957.termRef(2);
                  
                  {ESLVal n = $3966;
                  
                  {ESLVal args = $3965;
                  
                  {ESLVal body = $3964;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1957;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(methods).flatten().flatten();
        
        {ESLVal newMethods = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(walkJMethodDef(m,methodNames.add(importedMethodNames)));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(methods);
        ESLVal newFields = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1958 = $qualArg;
                
                switch(_v1958.termName) {
                case "JField": {ESLVal $3969 = _v1958.termRef(0);
                  ESLVal $3968 = _v1958.termRef(1);
                  ESLVal $3967 = _v1958.termRef(2);
                  
                  {ESLVal n = $3969;
                  
                  {ESLVal t = $3968;
                  
                  {ESLVal e = $3967;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,walkJExp(e,methodNames.add(importedMethodNames)))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1958;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        return new ESLVal("JModule",name,exports,imports,newMethods,newFields);
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1193,1746)").add(ESLVal.list(_v1956)));
    }
    }
  }
  public static ESLVal addMethodCalls = new ESLVal(new Function(new ESLVal("addMethodCalls"),null) { public ESLVal apply(ESLVal... args) { return addMethodCalls(args[0]); }});
  private static ESLVal walkJMethodDef(ESLVal method,ESLVal methodNames) {
    
    {ESLVal _v1959 = method;
      
      switch(_v1959.termName) {
      case "JMethod": {ESLVal $3972 = _v1959.termRef(0);
        ESLVal $3971 = _v1959.termRef(1);
        ESLVal $3970 = _v1959.termRef(2);
        
        {ESLVal n = $3972;
        
        {ESLVal args = $3971;
        
        {ESLVal body = $3970;
        
        {ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1960 = $qualArg;
                
                switch(_v1960.termName) {
                case "JDec": {ESLVal $3974 = _v1960.termRef(0);
                  ESLVal $3973 = _v1960.termRef(1);
                  
                  {ESLVal _v1984 = $3974;
                  
                  {ESLVal t = $3973;
                  
                  return ESLVal.list(ESLVal.list(_v1984));
                }
                }
                }
                default: {ESLVal _0 = _v1960;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal _v1985 = removeAll(argNames,methodNames);
        
        return new ESLVal("JMethod",n,args,walkJCommand(body,_v1985));
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1818,2047)").add(ESLVal.list(_v1959)));
    }
    }
  }
  private static ESLVal walkJMethodDef = new ESLVal(new Function(new ESLVal("walkJMethodDef"),null) { public ESLVal apply(ESLVal... args) { return walkJMethodDef(args[0],args[1]); }});
  private static ESLVal walkJExp(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1961 = x;
      
      switch(_v1961.termName) {
      case "JApply": {ESLVal $4051 = _v1961.termRef(0);
        ESLVal $4050 = _v1961.termRef(1);
        
        switch($4051.termName) {
        case "JVar": {ESLVal $4053 = $4051.termRef(0);
          ESLVal $4052 = $4051.termRef(1);
          
          {ESLVal n = $4053;
          
          {ESLVal t = $4052;
          
          {ESLVal args = $4050;
          
          if(member.apply(n,methodNames).boolVal)
          return new ESLVal("JMethodCall",n,new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(walkJExp(e,methodNames));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(args));
          else
            {ESLVal op = $4051;
              
              {ESLVal _v1983 = $4050;
              
              return new ESLVal("JApply",walkJExp(op,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal e = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(walkJExp(e,methodNames));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(_v1983));
            }
            }
        }
        }
        }
        }
        default: {ESLVal op = $4051;
          
          {ESLVal args = $4050;
          
          return new ESLVal("JApply",walkJExp(op,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(walkJExp(e,methodNames));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
      }
      }
    case "JArrayRef": {ESLVal $4049 = _v1961.termRef(0);
        ESLVal $4048 = _v1961.termRef(1);
        
        {ESLVal array = $4049;
        
        {ESLVal index = $4048;
        
        return new ESLVal("JArrayRef",walkJExp(array,methodNames),walkJExp(index,methodNames));
      }
      }
      }
    case "JArrayUpdate": {ESLVal $4047 = _v1961.termRef(0);
        ESLVal $4046 = _v1961.termRef(1);
        ESLVal $4045 = _v1961.termRef(2);
        
        {ESLVal array = $4047;
        
        {ESLVal index = $4046;
        
        {ESLVal value = $4045;
        
        return new ESLVal("JArrayUpdate",walkJExp(array,methodNames),walkJExp(index,methodNames),walkJExp(value,methodNames));
      }
      }
      }
      }
    case "JBag": {ESLVal $4044 = _v1961.termRef(0);
        ESLVal $4043 = _v1961.termRef(1);
        
        {ESLVal t = $4044;
        
        {ESLVal values = $4043;
        
        return new ESLVal("JBag",t,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal v = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(v,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(values));
      }
      }
      }
    case "JBecome": {ESLVal $4042 = _v1961.termRef(0);
        ESLVal $4041 = _v1961.termRef(1);
        
        {ESLVal behaviour = $4042;
        
        {ESLVal args = $4041;
        
        return new ESLVal("JBecome",walkJExp(behaviour,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal arg = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(arg,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
    case "JBehaviour": {ESLVal $4040 = _v1961.termRef(0);
        ESLVal $4039 = _v1961.termRef(1);
        ESLVal $4038 = _v1961.termRef(2);
        ESLVal $4037 = _v1961.termRef(3);
        ESLVal $4036 = _v1961.termRef(4);
        ESLVal $4035 = _v1961.termRef(5);
        
        {ESLVal exports = $4040;
        
        {ESLVal fields = $4039;
        
        {ESLVal methods = $4038;
        
        {ESLVal parent = $4037;
        
        {ESLVal init = $4036;
        
        {ESLVal handler = $4035;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1965 = $qualArg;
                
                switch(_v1965.termName) {
                case "JField": {ESLVal $4064 = _v1965.termRef(0);
                  ESLVal $4063 = _v1965.termRef(1);
                  ESLVal $4062 = _v1965.termRef(2);
                  
                  {ESLVal n = $4064;
                  
                  {ESLVal t = $4063;
                  
                  {ESLVal v = $4062;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1965;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        {ESLVal _v1982 = removeAll(fieldNames,methodNames).add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1966 = $qualArg;
                
                switch(_v1966.termName) {
                case "JMethod": {ESLVal $4067 = _v1966.termRef(0);
                  ESLVal $4066 = _v1966.termRef(1);
                  ESLVal $4065 = _v1966.termRef(2);
                  
                  {ESLVal n = $4067;
                  
                  {ESLVal args = $4066;
                  
                  {ESLVal body = $4065;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1966;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(methods).flatten().flatten());
        
        return new ESLVal("JBehaviour",exports,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,_v1982));
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
              $v.add(walkJMethodDef(m,_v1982));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(methods),walkJExp(parent,_v1982),walkJExp(init,_v1982),walkJCommand(handler,_v1982));
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "JBinExp": {ESLVal $4034 = _v1961.termRef(0);
        ESLVal $4033 = _v1961.termRef(1);
        ESLVal $4032 = _v1961.termRef(2);
        
        {ESLVal e1 = $4034;
        
        {ESLVal op = $4033;
        
        {ESLVal e2 = $4032;
        
        return new ESLVal("JBinExp",walkJExp(e1,methodNames),op,walkJExp(e2,methodNames));
      }
      }
      }
      }
    case "JCmpExp": {ESLVal $4031 = _v1961.termRef(0);
        
        {ESLVal cmp = $4031;
        
        return new ESLVal("JCmpExp",walkJCmp(cmp,methodNames));
      }
      }
    case "JCommandExp": {ESLVal $4030 = _v1961.termRef(0);
        ESLVal $4029 = _v1961.termRef(1);
        
        {ESLVal c = $4030;
        
        {ESLVal t = $4029;
        
        return new ESLVal("JCommandExp",walkJCommand(c,methodNames),t);
      }
      }
      }
    case "JConstExp": {ESLVal $4028 = _v1961.termRef(0);
        
        {ESLVal c = $4028;
        
        return new ESLVal("JConstExp",c);
      }
      }
    case "JError": {ESLVal $4027 = _v1961.termRef(0);
        
        {ESLVal e = $4027;
        
        return new ESLVal("JError",walkJExp(e,methodNames));
      }
      }
    case "JExtendedBehaviour": {ESLVal $4026 = _v1961.termRef(0);
        ESLVal $4025 = _v1961.termRef(1);
        ESLVal $4024 = _v1961.termRef(2);
        ESLVal $4023 = _v1961.termRef(3);
        ESLVal $4022 = _v1961.termRef(4);
        ESLVal $4021 = _v1961.termRef(5);
        ESLVal $4020 = _v1961.termRef(6);
        
        {ESLVal exports = $4026;
        
        {ESLVal parent = $4025;
        
        {ESLVal fields = $4024;
        
        {ESLVal methods = $4023;
        
        {ESLVal init = $4022;
        
        {ESLVal handler = $4021;
        
        {ESLVal time = $4020;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1963 = $qualArg;
                
                switch(_v1963.termName) {
                case "JField": {ESLVal $4058 = _v1963.termRef(0);
                  ESLVal $4057 = _v1963.termRef(1);
                  ESLVal $4056 = _v1963.termRef(2);
                  
                  {ESLVal n = $4058;
                  
                  {ESLVal t = $4057;
                  
                  {ESLVal v = $4056;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1963;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        {ESLVal _v1981 = removeAll(fieldNames,methodNames).add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1964 = $qualArg;
                
                switch(_v1964.termName) {
                case "JMethod": {ESLVal $4061 = _v1964.termRef(0);
                  ESLVal $4060 = _v1964.termRef(1);
                  ESLVal $4059 = _v1964.termRef(2);
                  
                  {ESLVal n = $4061;
                  
                  {ESLVal args = $4060;
                  
                  {ESLVal body = $4059;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1964;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(methods).flatten().flatten());
        
        return new ESLVal("JExtendedBehaviour",exports,walkJExp(parent,_v1981),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,_v1981));
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
              $v.add(walkJMethodDef(m,_v1981));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(methods),walkJExp(init,_v1981),walkJExp(handler,_v1981),walkJCommand(time,_v1981));
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
    case "JFlatten": {ESLVal $4019 = _v1961.termRef(0);
        
        {ESLVal e = $4019;
        
        return new ESLVal("JFlatten",walkJExp(e,methodNames));
      }
      }
    case "JFun": {ESLVal $4018 = _v1961.termRef(0);
        ESLVal $4017 = _v1961.termRef(1);
        ESLVal $4016 = _v1961.termRef(2);
        ESLVal $4015 = _v1961.termRef(3);
        
        {ESLVal name = $4018;
        
        {ESLVal args = $4017;
        
        {ESLVal t = $4016;
        
        {ESLVal body = $4015;
        
        {ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1962 = $qualArg;
                
                switch(_v1962.termName) {
                case "JDec": {ESLVal $4055 = _v1962.termRef(0);
                  ESLVal $4054 = _v1962.termRef(1);
                  
                  {ESLVal n = $4055;
                  
                  {ESLVal _v1979 = $4054;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                default: {ESLVal _0 = _v1962;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal _v1980 = removeAll(argNames,methodNames);
        
        return new ESLVal("JFun",walkJExp(name,_v1980),args,t,walkJCommand(body,_v1980));
      }
      }
      }
      }
      }
      }
      }
    case "JGrab": {ESLVal $4014 = _v1961.termRef(0);
        ESLVal $4013 = _v1961.termRef(1);
        
        {ESLVal es = $4014;
        
        {ESLVal body = $4013;
        
        return new ESLVal("JGrab",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es),walkJExp(body,methodNames));
      }
      }
      }
    case "JHead": {ESLVal $4012 = _v1961.termRef(0);
        
        {ESLVal e = $4012;
        
        return new ESLVal("JHead",walkJExp(e,methodNames));
      }
      }
    case "JIfExp": {ESLVal $4011 = _v1961.termRef(0);
        ESLVal $4010 = _v1961.termRef(1);
        ESLVal $4009 = _v1961.termRef(2);
        
        {ESLVal e1 = $4011;
        
        {ESLVal e2 = $4010;
        
        {ESLVal e3 = $4009;
        
        return new ESLVal("JIfExp",walkJExp(e1,methodNames),walkJExp(e2,methodNames),walkJExp(e3,methodNames));
      }
      }
      }
      }
    case "JList": {ESLVal $4008 = _v1961.termRef(0);
        ESLVal $4007 = _v1961.termRef(1);
        
        {ESLVal t = $4008;
        
        {ESLVal es = $4007;
        
        return new ESLVal("JList",t,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "JMapFun": {ESLVal $4006 = _v1961.termRef(0);
        ESLVal $4005 = _v1961.termRef(1);
        
        {ESLVal f = $4006;
        
        {ESLVal e = $4005;
        
        return new ESLVal("JMapFun",walkJExp(f,methodNames),walkJExp(e,methodNames));
      }
      }
      }
    case "JNew": {ESLVal $4004 = _v1961.termRef(0);
        ESLVal $4003 = _v1961.termRef(1);
        
        {ESLVal b = $4004;
        
        {ESLVal args = $4003;
        
        return new ESLVal("JNew",walkJExp(b,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal arg = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(arg,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
    case "JNewArray": {ESLVal $4002 = _v1961.termRef(0);
        
        {ESLVal e = $4002;
        
        return new ESLVal("JNewArray",walkJExp(e,methodNames));
      }
      }
    case "JNewJava": {ESLVal $4001 = _v1961.termRef(0);
        ESLVal $4000 = _v1961.termRef(1);
        
        {ESLVal path = $4001;
        
        {ESLVal args = $4000;
        
        return new ESLVal("JNewJava",path,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
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
    case "JNil": {ESLVal $3999 = _v1961.termRef(0);
        
        {ESLVal t = $3999;
        
        return new ESLVal("JNil",t);
      }
      }
    case "JNot": {ESLVal $3998 = _v1961.termRef(0);
        
        {ESLVal e = $3998;
        
        return new ESLVal("JNot",walkJExp(e,methodNames));
      }
      }
    case "JNow": {
        return new ESLVal("JNow",new ESLVal[]{});
      }
    case "JNull": {
        return new ESLVal("JNull",new ESLVal[]{});
      }
    case "JProbably": {ESLVal $3997 = _v1961.termRef(0);
        ESLVal $3996 = _v1961.termRef(1);
        ESLVal $3995 = _v1961.termRef(2);
        
        {ESLVal e1 = $3997;
        
        {ESLVal e2 = $3996;
        
        {ESLVal e3 = $3995;
        
        return new ESLVal("JProbably",walkJExp(e1,methodNames),walkJExp(e2,methodNames),walkJExp(e3,methodNames));
      }
      }
      }
      }
    case "JRecord": {ESLVal $3994 = _v1961.termRef(0);
        
        {ESLVal fields = $3994;
        
        return new ESLVal("JRecord",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(fields));
      }
      }
    case "JRef": {ESLVal $3993 = _v1961.termRef(0);
        ESLVal $3992 = _v1961.termRef(1);
        
        {ESLVal e = $3993;
        
        {ESLVal name = $3992;
        
        return new ESLVal("JRef",walkJExp(e,methodNames),name);
      }
      }
      }
    case "JRefSuper": {ESLVal $3991 = _v1961.termRef(0);
        
        {ESLVal name = $3991;
        
        return new ESLVal("JRefSuper",name);
      }
      }
    case "JSelf": {
        return new ESLVal("JSelf",new ESLVal[]{});
      }
    case "JSend": {ESLVal $3990 = _v1961.termRef(0);
        ESLVal $3989 = _v1961.termRef(1);
        ESLVal $3988 = _v1961.termRef(2);
        
        {ESLVal e = $3990;
        
        {ESLVal name = $3989;
        
        {ESLVal args = $3988;
        
        return new ESLVal("JSend",walkJExp(e,methodNames),name,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
      }
    case "JSendSuper": {ESLVal $3987 = _v1961.termRef(0);
        
        {ESLVal e = $3987;
        
        return new ESLVal("JSendSuper",walkJExp(e,methodNames));
      }
      }
    case "JSendTimeSuper": {
        return new ESLVal("JSendTimeSuper",new ESLVal[]{});
      }
    case "JSet": {ESLVal $3986 = _v1961.termRef(0);
        ESLVal $3985 = _v1961.termRef(1);
        
        {ESLVal t = $3986;
        
        {ESLVal values = $3985;
        
        return new ESLVal("JSet",t,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(values));
      }
      }
      }
    case "JTail": {ESLVal $3984 = _v1961.termRef(0);
        
        {ESLVal e = $3984;
        
        return new ESLVal("JTail",walkJExp(e,methodNames));
      }
      }
    case "JTerm": {ESLVal $3983 = _v1961.termRef(0);
        ESLVal $3982 = _v1961.termRef(1);
        
        {ESLVal name = $3983;
        
        {ESLVal values = $3982;
        
        return new ESLVal("JTerm",name,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJExp(e,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(values));
      }
      }
      }
    case "JTermRef": {ESLVal $3981 = _v1961.termRef(0);
        ESLVal $3980 = _v1961.termRef(1);
        
        {ESLVal e = $3981;
        
        {ESLVal i = $3980;
        
        return new ESLVal("JTermRef",walkJExp(e,methodNames),i);
      }
      }
      }
    case "JTry": {ESLVal $3979 = _v1961.termRef(0);
        ESLVal $3978 = _v1961.termRef(1);
        ESLVal $3977 = _v1961.termRef(2);
        
        {ESLVal e = $3979;
        
        {ESLVal n = $3978;
        
        {ESLVal c = $3977;
        
        return new ESLVal("JTry",walkJExp(e,methodNames),n,walkJCommand(c,methodNames));
      }
      }
      }
      }
    case "JVar": {ESLVal $3976 = _v1961.termRef(0);
        ESLVal $3975 = _v1961.termRef(1);
        
        {ESLVal name = $3976;
        
        {ESLVal t = $3975;
        
        return new ESLVal("JVar",name,t);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2098,5954)").add(ESLVal.list(_v1961)));
    }
    }
  }
  private static ESLVal walkJExp = new ESLVal(new Function(new ESLVal("walkJExp"),null) { public ESLVal apply(ESLVal... args) { return walkJExp(args[0],args[1]); }});
  private static ESLVal walkJFieldDef(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1967 = x;
      
      switch(_v1967.termName) {
      case "JField": {ESLVal $4070 = _v1967.termRef(0);
        ESLVal $4069 = _v1967.termRef(1);
        ESLVal $4068 = _v1967.termRef(2);
        
        {ESLVal name = $4070;
        
        {ESLVal t = $4069;
        
        {ESLVal value = $4068;
        
        return new ESLVal("JField",name,t,walkJExp(value,methodNames));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6022,6106)").add(ESLVal.list(_v1967)));
    }
    }
  }
  private static ESLVal walkJFieldDef = new ESLVal(new Function(new ESLVal("walkJFieldDef"),null) { public ESLVal apply(ESLVal... args) { return walkJFieldDef(args[0],args[1]); }});
  private static ESLVal walkJCommand(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1968 = x;
      
      switch(_v1968.termName) {
      case "JBlock": {ESLVal $4111 = _v1968.termRef(0);
        
        {ESLVal commands = $4111;
        
        return new ESLVal("JBlock",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal c = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJCommand(c,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(commands));
      }
      }
    case "JCaseBool": {ESLVal $4110 = _v1968.termRef(0);
        ESLVal $4109 = _v1968.termRef(1);
        ESLVal $4108 = _v1968.termRef(2);
        
        {ESLVal e = $4110;
        
        {ESLVal boolArms = $4109;
        
        {ESLVal alt = $4108;
        
        return new ESLVal("JCaseBool",walkJExp(e,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJBoolArm(a,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(boolArms),walkJCommand(alt,methodNames));
      }
      }
      }
      }
    case "JCaseInt": {ESLVal $4107 = _v1968.termRef(0);
        ESLVal $4106 = _v1968.termRef(1);
        ESLVal $4105 = _v1968.termRef(2);
        
        {ESLVal e = $4107;
        
        {ESLVal intArms = $4106;
        
        {ESLVal alt = $4105;
        
        return new ESLVal("JCaseInt",walkJExp(e,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJIntArm(a,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(intArms),walkJCommand(alt,methodNames));
      }
      }
      }
      }
    case "JCaseList": {ESLVal $4104 = _v1968.termRef(0);
        ESLVal $4103 = _v1968.termRef(1);
        ESLVal $4102 = _v1968.termRef(2);
        ESLVal $4101 = _v1968.termRef(3);
        
        {ESLVal e = $4104;
        
        {ESLVal head = $4103;
        
        {ESLVal tail = $4102;
        
        {ESLVal alt = $4101;
        
        return new ESLVal("JCaseList",walkJExp(e,methodNames),walkJCommand(head,methodNames),walkJCommand(tail,methodNames),walkJCommand(alt,methodNames));
      }
      }
      }
      }
      }
    case "JCaseStr": {ESLVal $4100 = _v1968.termRef(0);
        ESLVal $4099 = _v1968.termRef(1);
        ESLVal $4098 = _v1968.termRef(2);
        
        {ESLVal e = $4100;
        
        {ESLVal strArms = $4099;
        
        {ESLVal alt = $4098;
        
        return new ESLVal("JCaseStr",walkJExp(e,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJStrArm(a,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(strArms),walkJCommand(alt,methodNames));
      }
      }
      }
      }
    case "JCaseTerm": {ESLVal $4097 = _v1968.termRef(0);
        ESLVal $4096 = _v1968.termRef(1);
        ESLVal $4095 = _v1968.termRef(2);
        
        {ESLVal e = $4097;
        
        {ESLVal termArms = $4096;
        
        {ESLVal alt = $4095;
        
        return new ESLVal("JCaseTerm",walkJExp(e,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJTermArm(a,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(termArms),walkJCommand(alt,methodNames));
      }
      }
      }
      }
    case "JFor": {ESLVal $4094 = _v1968.termRef(0);
        ESLVal $4093 = _v1968.termRef(1);
        ESLVal $4092 = _v1968.termRef(2);
        ESLVal $4091 = _v1968.termRef(3);
        
        {ESLVal n1 = $4094;
        
        {ESLVal n2 = $4093;
        
        {ESLVal e = $4092;
        
        {ESLVal c = $4091;
        
        return new ESLVal("JFor",n1,n2,walkJExp(e,methodNames),walkJCommand(c,methodNames));
      }
      }
      }
      }
      }
    case "JIfCommand": {ESLVal $4090 = _v1968.termRef(0);
        ESLVal $4089 = _v1968.termRef(1);
        ESLVal $4088 = _v1968.termRef(2);
        
        {ESLVal e = $4090;
        
        {ESLVal c1 = $4089;
        
        {ESLVal c2 = $4088;
        
        return new ESLVal("JIfCommand",walkJExp(e,methodNames),walkJCommand(c1,methodNames),walkJCommand(c2,methodNames));
      }
      }
      }
      }
    case "JLet": {ESLVal $4087 = _v1968.termRef(0);
        ESLVal $4086 = _v1968.termRef(1);
        
        {ESLVal fields = $4087;
        
        {ESLVal body = $4086;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1971 = $qualArg;
                
                switch(_v1971.termName) {
                case "JField": {ESLVal $4120 = _v1971.termRef(0);
                  ESLVal $4119 = _v1971.termRef(1);
                  ESLVal $4118 = _v1971.termRef(2);
                  
                  {ESLVal n = $4120;
                  
                  {ESLVal t = $4119;
                  
                  {ESLVal v = $4118;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1971;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        {ESLVal methodNames2 = removeAll(fieldNames,methodNames);
        
        return new ESLVal("JLet",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(fields),walkJCommand(body,methodNames2));
      }
      }
      }
      }
      }
    case "JLetRec": {ESLVal $4085 = _v1968.termRef(0);
        ESLVal $4084 = _v1968.termRef(1);
        
        {ESLVal fields = $4085;
        
        {ESLVal body = $4084;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1970 = $qualArg;
                
                switch(_v1970.termName) {
                case "JField": {ESLVal $4117 = _v1970.termRef(0);
                  ESLVal $4116 = _v1970.termRef(1);
                  ESLVal $4115 = _v1970.termRef(2);
                  
                  {ESLVal n = $4117;
                  
                  {ESLVal t = $4116;
                  
                  {ESLVal v = $4115;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1970;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        {ESLVal _v1978 = removeAll(fieldNames,methodNames);
        
        return new ESLVal("JLetRec",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,_v1978));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(fields),walkJCommand(body,_v1978));
      }
      }
      }
      }
      }
    case "JPLet": {ESLVal $4083 = _v1968.termRef(0);
        ESLVal $4082 = _v1968.termRef(1);
        
        {ESLVal fields = $4083;
        
        {ESLVal body = $4082;
        
        {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1969 = $qualArg;
                
                switch(_v1969.termName) {
                case "JField": {ESLVal $4114 = _v1969.termRef(0);
                  ESLVal $4113 = _v1969.termRef(1);
                  ESLVal $4112 = _v1969.termRef(2);
                  
                  {ESLVal n = $4114;
                  
                  {ESLVal t = $4113;
                  
                  {ESLVal v = $4112;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1969;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(fields).flatten().flatten();
        
        {ESLVal methodNames2 = removeAll(fieldNames,methodNames);
        
        return new ESLVal("JPLet",new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal f = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJFieldDef(f,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(fields),walkJCommand(body,methodNames2));
      }
      }
      }
      }
      }
    case "JReturn": {ESLVal $4081 = _v1968.termRef(0);
        
        {ESLVal e = $4081;
        
        return new ESLVal("JReturn",walkJExp(e,methodNames));
      }
      }
    case "JStatement": {ESLVal $4080 = _v1968.termRef(0);
        
        {ESLVal e = $4080;
        
        return new ESLVal("JStatement",walkJExp(e,methodNames));
      }
      }
    case "JSwitch": {ESLVal $4079 = _v1968.termRef(0);
        ESLVal $4078 = _v1968.termRef(1);
        ESLVal $4077 = _v1968.termRef(2);
        
        {ESLVal e = $4079;
        
        {ESLVal cases = $4078;
        
        {ESLVal command = $4077;
        
        return new ESLVal("JSwitch",walkJExp(e,methodNames),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal c = $l0.head();
              $l0 = $l0.tail();
              $v.add(walkJCase(c,methodNames));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(cases),walkJCommand(command,methodNames));
      }
      }
      }
      }
    case "JSwitchList": {ESLVal $4076 = _v1968.termRef(0);
        ESLVal $4075 = _v1968.termRef(1);
        ESLVal $4074 = _v1968.termRef(2);
        ESLVal $4073 = _v1968.termRef(3);
        
        {ESLVal e = $4076;
        
        {ESLVal c1 = $4075;
        
        {ESLVal c2 = $4074;
        
        {ESLVal c3 = $4073;
        
        return new ESLVal("JSwitchList",walkJExp(e,methodNames),walkJCommand(c1,methodNames),walkJCommand(c2,methodNames),walkJCommand(c3,methodNames));
      }
      }
      }
      }
      }
    case "JUpdate": {ESLVal $4072 = _v1968.termRef(0);
        ESLVal $4071 = _v1968.termRef(1);
        
        {ESLVal n = $4072;
        
        {ESLVal e = $4071;
        
        return new ESLVal("JUpdate",n,walkJExp(e,methodNames));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6171,8461)").add(ESLVal.list(_v1968)));
    }
    }
  }
  private static ESLVal walkJCommand = new ESLVal(new Function(new ESLVal("walkJCommand"),null) { public ESLVal apply(ESLVal... args) { return walkJCommand(args[0],args[1]); }});
  private static ESLVal walkJBoolArm(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1972 = x;
      
      switch(_v1972.termName) {
      case "JBArm": {ESLVal $4122 = _v1972.termRef(0);
        ESLVal $4121 = _v1972.termRef(1);
        
        {ESLVal b = $4122;
        
        {ESLVal command = $4121;
        
        return new ESLVal("JBArm",b,walkJCommand(command,methodNames));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8526,8606)").add(ESLVal.list(_v1972)));
    }
    }
  }
  private static ESLVal walkJBoolArm = new ESLVal(new Function(new ESLVal("walkJBoolArm"),null) { public ESLVal apply(ESLVal... args) { return walkJBoolArm(args[0],args[1]); }});
  private static ESLVal walkJIntArm(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1973 = x;
      
      switch(_v1973.termName) {
      case "JIArm": {ESLVal $4124 = _v1973.termRef(0);
        ESLVal $4123 = _v1973.termRef(1);
        
        {ESLVal i = $4124;
        
        {ESLVal command = $4123;
        
        return new ESLVal("JIArm",i,walkJCommand(command,methodNames));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8668,8748)").add(ESLVal.list(_v1973)));
    }
    }
  }
  private static ESLVal walkJIntArm = new ESLVal(new Function(new ESLVal("walkJIntArm"),null) { public ESLVal apply(ESLVal... args) { return walkJIntArm(args[0],args[1]); }});
  private static ESLVal walkJStrArm(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1974 = x;
      
      switch(_v1974.termName) {
      case "JSArm": {ESLVal $4126 = _v1974.termRef(0);
        ESLVal $4125 = _v1974.termRef(1);
        
        {ESLVal s = $4126;
        
        {ESLVal command = $4125;
        
        return new ESLVal("JSArm",s,walkJCommand(command,methodNames));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8810,8890)").add(ESLVal.list(_v1974)));
    }
    }
  }
  private static ESLVal walkJStrArm = new ESLVal(new Function(new ESLVal("walkJStrArm"),null) { public ESLVal apply(ESLVal... args) { return walkJStrArm(args[0],args[1]); }});
  private static ESLVal walkJTermArm(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1975 = x;
      
      switch(_v1975.termName) {
      case "JTArm": {ESLVal $4129 = _v1975.termRef(0);
        ESLVal $4128 = _v1975.termRef(1);
        ESLVal $4127 = _v1975.termRef(2);
        
        {ESLVal name = $4129;
        
        {ESLVal index = $4128;
        
        {ESLVal command = $4127;
        
        return new ESLVal("JTArm",name,index,walkJCommand(command,methodNames));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8955,9053)").add(ESLVal.list(_v1975)));
    }
    }
  }
  private static ESLVal walkJTermArm = new ESLVal(new Function(new ESLVal("walkJTermArm"),null) { public ESLVal apply(ESLVal... args) { return walkJTermArm(args[0],args[1]); }});
  private static ESLVal walkJCase(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1976 = x;
      
      switch(_v1976.termName) {
      case "JCaseOf": {ESLVal $4131 = _v1976.termRef(0);
        ESLVal $4130 = _v1976.termRef(1);
        
        {ESLVal k = $4131;
        
        {ESLVal command = $4130;
        
        return new ESLVal("JCaseOf",k,walkJCommand(command,methodNames));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(9109,9193)").add(ESLVal.list(_v1976)));
    }
    }
  }
  private static ESLVal walkJCase = new ESLVal(new Function(new ESLVal("walkJCase"),null) { public ESLVal apply(ESLVal... args) { return walkJCase(args[0],args[1]); }});
  private static ESLVal walkJCmp(ESLVal x,ESLVal methodNames) {
    
    {ESLVal _v1977 = x;
      
      switch(_v1977.termName) {
      case "JCmpList": {ESLVal $4140 = _v1977.termRef(0);
        
        {ESLVal e = $4140;
        
        return new ESLVal("JCmpList",walkJExp(e,methodNames));
      }
      }
    case "JCmpOuter": {ESLVal $4139 = _v1977.termRef(0);
        ESLVal $4138 = _v1977.termRef(1);
        ESLVal $4137 = _v1977.termRef(2);
        
        {ESLVal n = $4139;
        
        {ESLVal e = $4138;
        
        {ESLVal c = $4137;
        
        return new ESLVal("JCmpOuter",n,walkJExp(e,remove.apply(n,methodNames)),walkJCmp(c,remove.apply(n,methodNames)));
      }
      }
      }
      }
    case "JCmpIf": {ESLVal $4136 = _v1977.termRef(0);
        ESLVal $4135 = _v1977.termRef(1);
        
        {ESLVal e = $4136;
        
        {ESLVal c = $4135;
        
        return new ESLVal("JCmpIf",walkJExp(e,methodNames),walkJCmp(c,methodNames));
      }
      }
      }
    case "JCmpBind": {ESLVal $4134 = _v1977.termRef(0);
        ESLVal $4133 = _v1977.termRef(1);
        ESLVal $4132 = _v1977.termRef(2);
        
        {ESLVal n = $4134;
        
        {ESLVal e = $4133;
        
        {ESLVal c = $4132;
        
        return new ESLVal("JCmpBind",n,walkJExp(e,remove.apply(n,methodNames)),walkJCmp(c,remove.apply(n,methodNames)));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(9246,9618)").add(ESLVal.list(_v1977)));
    }
    }
  }
  private static ESLVal walkJCmp = new ESLVal(new Function(new ESLVal("walkJCmp"),null) { public ESLVal apply(ESLVal... args) { return walkJCmp(args[0],args[1]); }});
public static void main(String[] args) {
  }
}