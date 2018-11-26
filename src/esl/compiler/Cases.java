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
  {ESLVal _v2188 = as;
        
        if(_v2188.isCons())
        {ESLVal $3183 = _v2188.head();
          ESLVal $3184 = _v2188.tail();
          
          switch($3183.termName) {
          case "BArm": {ESLVal $3188 = $3183.termRef(0);
            ESLVal $3187 = $3183.termRef(1);
            ESLVal $3186 = $3183.termRef(2);
            ESLVal $3185 = $3183.termRef(3);
            
            {ESLVal l = $3188;
            
            {ESLVal ps = $3187;
            
            {ESLVal g = $3186;
            
            {ESLVal e = $3185;
            
            {ESLVal _v2214 = $3184;
            
            return translateArms.apply(_v2214).cons(new ESLVal("LArm",l,ps,$nil,g,e));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v2188)));
        }
        }
      else if(_v2188.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v2188)));
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
  {ESLVal _v2171 = exp;
        
        switch(_v2171.termName) {
        case "Module": {ESLVal $3182 = _v2171.termRef(0);
          ESLVal $3181 = _v2171.termRef(1);
          ESLVal $3180 = _v2171.termRef(2);
          ESLVal $3179 = _v2171.termRef(3);
          ESLVal $3178 = _v2171.termRef(4);
          ESLVal $3177 = _v2171.termRef(5);
          ESLVal $3176 = _v2171.termRef(6);
          
          {ESLVal path = $3182;
          
          {ESLVal name = $3181;
          
          {ESLVal exports = $3180;
          
          {ESLVal imports = $3179;
          
          {ESLVal x = $3178;
          
          {ESLVal y = $3177;
          
          {ESLVal defs = $3176;
          
          return new ESLVal("Module",path,name,exports,imports,x,y,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2187 = $qualArg;
                
                {ESLVal d = _v2187;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(d)));
              }
              }
            }
          }).map(mergeFunDefs.apply(defs)).flatten().flatten());
        }
        }
        }
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $3175 = _v2171.termRef(0);
          ESLVal $3174 = _v2171.termRef(1);
          ESLVal $3173 = _v2171.termRef(2);
          ESLVal $3172 = _v2171.termRef(3);
          ESLVal $3171 = _v2171.termRef(4);
          
          {ESLVal l = $3175;
          
          {ESLVal n = $3174;
          
          {ESLVal args = $3173;
          
          {ESLVal t = $3172;
          
          {ESLVal e = $3171;
          
          return new ESLVal("FunExp",l,n,args,t,translateCases.apply(e));
        }
        }
        }
        }
        }
        }
      case "StrExp": {ESLVal $3170 = _v2171.termRef(0);
          ESLVal $3169 = _v2171.termRef(1);
          
          {ESLVal l = $3170;
          
          {ESLVal v = $3169;
          
          return exp;
        }
        }
        }
      case "IntExp": {ESLVal $3168 = _v2171.termRef(0);
          ESLVal $3167 = _v2171.termRef(1);
          
          {ESLVal l = $3168;
          
          {ESLVal v = $3167;
          
          return exp;
        }
        }
        }
      case "BoolExp": {ESLVal $3166 = _v2171.termRef(0);
          ESLVal $3165 = _v2171.termRef(1);
          
          {ESLVal l = $3166;
          
          {ESLVal v = $3165;
          
          return exp;
        }
        }
        }
      case "BagExp": {ESLVal $3164 = _v2171.termRef(0);
          ESLVal $3163 = _v2171.termRef(1);
          
          {ESLVal l = $3164;
          
          {ESLVal es = $3163;
          
          return new ESLVal("BagExp",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2186 = $qualArg;
                
                {ESLVal e = _v2186;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "NullExp": {ESLVal $3162 = _v2171.termRef(0);
          
          {ESLVal l = $3162;
          
          return exp;
        }
        }
      case "FloatExp": {ESLVal $3161 = _v2171.termRef(0);
          ESLVal $3160 = _v2171.termRef(1);
          
          {ESLVal l = $3161;
          
          {ESLVal f = $3160;
          
          return exp;
        }
        }
        }
      case "Term": {ESLVal $3159 = _v2171.termRef(0);
          ESLVal $3158 = _v2171.termRef(1);
          ESLVal $3157 = _v2171.termRef(2);
          ESLVal $3156 = _v2171.termRef(3);
          
          {ESLVal l = $3159;
          
          {ESLVal n = $3158;
          
          {ESLVal ts = $3157;
          
          {ESLVal es = $3156;
          
          return new ESLVal("Term",l,n,ts,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2185 = $qualArg;
                
                {ESLVal e = _v2185;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
        }
        }
      case "List": {ESLVal $3155 = _v2171.termRef(0);
          ESLVal $3154 = _v2171.termRef(1);
          
          {ESLVal l = $3155;
          
          {ESLVal es = $3154;
          
          return new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2184 = $qualArg;
                
                {ESLVal e = _v2184;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Block": {ESLVal $3153 = _v2171.termRef(0);
          ESLVal $3152 = _v2171.termRef(1);
          
          {ESLVal l = $3153;
          
          {ESLVal es = $3152;
          
          return new ESLVal("Block",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2183 = $qualArg;
                
                {ESLVal e = _v2183;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Apply": {ESLVal $3151 = _v2171.termRef(0);
          ESLVal $3150 = _v2171.termRef(1);
          ESLVal $3149 = _v2171.termRef(2);
          
          {ESLVal l = $3151;
          
          {ESLVal op = $3150;
          
          {ESLVal args = $3149;
          
          return new ESLVal("Apply",l,translateCases.apply(op),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2182 = $qualArg;
                
                {ESLVal e = _v2182;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $3148 = _v2171.termRef(0);
          ESLVal $3147 = _v2171.termRef(1);
          ESLVal $3146 = _v2171.termRef(2);
          
          {ESLVal l = $3148;
          
          {ESLVal op = $3147;
          
          {ESLVal args = $3146;
          
          return new ESLVal("ApplyTypeExp",l,translateCases.apply(op),args);
        }
        }
        }
        }
      case "Case": {ESLVal $3145 = _v2171.termRef(0);
          ESLVal $3144 = _v2171.termRef(1);
          ESLVal $3143 = _v2171.termRef(2);
          ESLVal $3142 = _v2171.termRef(3);
          
          {ESLVal l = $3145;
          
          {ESLVal ds = $3144;
          
          {ESLVal es = $3143;
          
          {ESLVal as = $3142;
          
          return compileCase.apply(l,es,translateArms.apply(as),new ESLVal("CaseError",l,new ESLVal("List",l,es)));
        }
        }
        }
        }
        }
      case "BinExp": {ESLVal $3141 = _v2171.termRef(0);
          ESLVal $3140 = _v2171.termRef(1);
          ESLVal $3139 = _v2171.termRef(2);
          ESLVal $3138 = _v2171.termRef(3);
          
          {ESLVal l = $3141;
          
          {ESLVal e1 = $3140;
          
          {ESLVal op = $3139;
          
          {ESLVal e2 = $3138;
          
          return new ESLVal("BinExp",l,translateCases.apply(e1),op,translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "For": {ESLVal $3137 = _v2171.termRef(0);
          ESLVal $3136 = _v2171.termRef(1);
          ESLVal $3135 = _v2171.termRef(2);
          ESLVal $3134 = _v2171.termRef(3);
          
          {ESLVal l = $3137;
          
          {ESLVal p = $3136;
          
          {ESLVal e1 = $3135;
          
          {ESLVal e2 = $3134;
          
          return new ESLVal("For",l,p,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $3133 = _v2171.termRef(0);
          ESLVal $3132 = _v2171.termRef(1);
          ESLVal $3131 = _v2171.termRef(2);
          
          {ESLVal l = $3133;
          
          {ESLVal t = $3132;
          
          {ESLVal e = $3131;
          
          return new ESLVal("Throw",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Try": {ESLVal $3130 = _v2171.termRef(0);
          ESLVal $3129 = _v2171.termRef(1);
          ESLVal $3128 = _v2171.termRef(2);
          
          {ESLVal l = $3130;
          
          {ESLVal e = $3129;
          
          {ESLVal as = $3128;
          
          return new ESLVal("Try",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2181 = $qualArg;
                
                {ESLVal a = _v2181;
                
                return ESLVal.list(ESLVal.list(translateArm.apply(a)));
              }
              }
            }
          }).map(as).flatten().flatten());
        }
        }
        }
        }
      case "ActExp": {ESLVal $3127 = _v2171.termRef(0);
          ESLVal $3126 = _v2171.termRef(1);
          ESLVal $3125 = _v2171.termRef(2);
          ESLVal $3124 = _v2171.termRef(3);
          ESLVal $3123 = _v2171.termRef(4);
          ESLVal $3122 = _v2171.termRef(5);
          ESLVal $3121 = _v2171.termRef(6);
          ESLVal $3120 = _v2171.termRef(7);
          
          {ESLVal l = $3127;
          
          {ESLVal n = $3126;
          
          {ESLVal args = $3125;
          
          {ESLVal x = $3124;
          
          {ESLVal spec = $3123;
          
          {ESLVal locals = $3122;
          
          {ESLVal init = $3121;
          
          {ESLVal handlers = $3120;
          
          return new ESLVal("ActExp",l,n,args,x,spec,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2179 = $qualArg;
                
                {ESLVal b = _v2179;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(locals).flatten().flatten(),translateCases.apply(init),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2180 = $qualArg;
                
                {ESLVal h = _v2180;
                
                return ESLVal.list(ESLVal.list(translateArm.apply(h)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $3119 = _v2171.termRef(0);
          ESLVal $3118 = _v2171.termRef(1);
          ESLVal $3117 = _v2171.termRef(2);
          ESLVal $3116 = _v2171.termRef(3);
          
          {ESLVal l = $3119;
          
          {ESLVal e1 = $3118;
          
          {ESLVal e2 = $3117;
          
          {ESLVal e3 = $3116;
          
          return new ESLVal("If",l,translateCases.apply(e1),translateCases.apply(e2),translateCases.apply(e3));
        }
        }
        }
        }
        }
      case "Self": {ESLVal $3115 = _v2171.termRef(0);
          
          {ESLVal l = $3115;
          
          return exp;
        }
        }
      case "Update": {ESLVal $3114 = _v2171.termRef(0);
          ESLVal $3113 = _v2171.termRef(1);
          ESLVal $3112 = _v2171.termRef(2);
          
          {ESLVal l = $3114;
          
          {ESLVal n = $3113;
          
          {ESLVal e = $3112;
          
          return new ESLVal("Update",l,n,translateCases.apply(e));
        }
        }
        }
        }
      case "Ref": {ESLVal $3111 = _v2171.termRef(0);
          ESLVal $3110 = _v2171.termRef(1);
          ESLVal $3109 = _v2171.termRef(2);
          
          {ESLVal l = $3111;
          
          {ESLVal e = $3110;
          
          {ESLVal n = $3109;
          
          return new ESLVal("Ref",l,translateCases.apply(e),n);
        }
        }
        }
        }
      case "Var": {ESLVal $3108 = _v2171.termRef(0);
          ESLVal $3107 = _v2171.termRef(1);
          
          {ESLVal l = $3108;
          
          {ESLVal n = $3107;
          
          return exp;
        }
        }
        }
      case "Send": {ESLVal $3106 = _v2171.termRef(0);
          ESLVal $3105 = _v2171.termRef(1);
          ESLVal $3104 = _v2171.termRef(2);
          
          {ESLVal l = $3106;
          
          {ESLVal target = $3105;
          
          {ESLVal message = $3104;
          
          return new ESLVal("Send",l,translateCases.apply(target),translateCases.apply(message));
        }
        }
        }
        }
      case "SendTimeSuper": {ESLVal $3103 = _v2171.termRef(0);
          
          {ESLVal l = $3103;
          
          return new ESLVal("SendTimeSuper",l);
        }
        }
      case "SendSuper": {ESLVal $3102 = _v2171.termRef(0);
          ESLVal $3101 = _v2171.termRef(1);
          
          {ESLVal l = $3102;
          
          {ESLVal e = $3101;
          
          return new ESLVal("SendSuper",l,translateCases.apply(e));
        }
        }
        }
      case "SetExp": {ESLVal $3100 = _v2171.termRef(0);
          ESLVal $3099 = _v2171.termRef(1);
          
          {ESLVal l = $3100;
          
          {ESLVal es = $3099;
          
          return new ESLVal("SetExp",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2178 = $qualArg;
                
                {ESLVal e = _v2178;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Cmp": {ESLVal $3098 = _v2171.termRef(0);
          ESLVal $3097 = _v2171.termRef(1);
          ESLVal $3096 = _v2171.termRef(2);
          
          {ESLVal l = $3098;
          
          {ESLVal e = $3097;
          
          {ESLVal qs = $3096;
          
          return new ESLVal("Cmp",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2177 = $qualArg;
                
                {ESLVal q = _v2177;
                
                return ESLVal.list(ESLVal.list(translateQual.apply(q)));
              }
              }
            }
          }).map(qs).flatten().flatten());
        }
        }
        }
        }
      case "New": {ESLVal $3095 = _v2171.termRef(0);
          ESLVal $3094 = _v2171.termRef(1);
          ESLVal $3093 = _v2171.termRef(2);
          
          {ESLVal l = $3095;
          
          {ESLVal b = $3094;
          
          {ESLVal args = $3093;
          
          return new ESLVal("New",l,translateCases.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2176 = $qualArg;
                
                {ESLVal e = _v2176;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "NewJava": {ESLVal $3092 = _v2171.termRef(0);
          ESLVal $3091 = _v2171.termRef(1);
          ESLVal $3090 = _v2171.termRef(2);
          ESLVal $3089 = _v2171.termRef(3);
          
          {ESLVal l = $3092;
          
          {ESLVal className = $3091;
          
          {ESLVal t = $3090;
          
          {ESLVal args = $3089;
          
          return new ESLVal("NewJava",l,className,t,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2175 = $qualArg;
                
                {ESLVal e = _v2175;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
        }
      case "Let": {ESLVal $3088 = _v2171.termRef(0);
          ESLVal $3087 = _v2171.termRef(1);
          ESLVal $3086 = _v2171.termRef(2);
          
          {ESLVal l = $3088;
          
          {ESLVal bs = $3087;
          
          {ESLVal e = $3086;
          
          return new ESLVal("Let",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2174 = $qualArg;
                
                {ESLVal b = _v2174;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Letrec": {ESLVal $3085 = _v2171.termRef(0);
          ESLVal $3084 = _v2171.termRef(1);
          ESLVal $3083 = _v2171.termRef(2);
          
          {ESLVal l = $3085;
          
          {ESLVal bs = $3084;
          
          {ESLVal e = $3083;
          
          return new ESLVal("Letrec",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2173 = $qualArg;
                
                {ESLVal b = _v2173;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Grab": {ESLVal $3082 = _v2171.termRef(0);
          ESLVal $3081 = _v2171.termRef(1);
          ESLVal $3080 = _v2171.termRef(2);
          
          {ESLVal l = $3082;
          
          {ESLVal rs = $3081;
          
          {ESLVal e = $3080;
          
          return new ESLVal("Grab",l,rs,translateCases.apply(e));
        }
        }
        }
        }
      case "PLet": {ESLVal $3079 = _v2171.termRef(0);
          ESLVal $3078 = _v2171.termRef(1);
          ESLVal $3077 = _v2171.termRef(2);
          
          {ESLVal l = $3079;
          
          {ESLVal bs = $3078;
          
          {ESLVal e = $3077;
          
          return new ESLVal("PLet",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2172 = $qualArg;
                
                {ESLVal b = _v2172;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Probably": {ESLVal $3076 = _v2171.termRef(0);
          ESLVal $3075 = _v2171.termRef(1);
          ESLVal $3074 = _v2171.termRef(2);
          ESLVal $3073 = _v2171.termRef(3);
          ESLVal $3072 = _v2171.termRef(4);
          
          {ESLVal l = $3076;
          
          {ESLVal p = $3075;
          
          {ESLVal t = $3074;
          
          {ESLVal e1 = $3073;
          
          {ESLVal e2 = $3072;
          
          return new ESLVal("Probably",l,translateCases.apply(p),t,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $3071 = _v2171.termRef(0);
          ESLVal $3070 = _v2171.termRef(1);
          
          {ESLVal l = $3071;
          
          {ESLVal e = $3070;
          
          return new ESLVal("Not",l,translateCases.apply(e));
        }
        }
        }
      case "Fold": {ESLVal $3069 = _v2171.termRef(0);
          ESLVal $3068 = _v2171.termRef(1);
          ESLVal $3067 = _v2171.termRef(2);
          
          {ESLVal l = $3069;
          
          {ESLVal t = $3068;
          
          {ESLVal e = $3067;
          
          return new ESLVal("Fold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Unfold": {ESLVal $3066 = _v2171.termRef(0);
          ESLVal $3065 = _v2171.termRef(1);
          ESLVal $3064 = _v2171.termRef(2);
          
          {ESLVal l = $3066;
          
          {ESLVal t = $3065;
          
          {ESLVal e = $3064;
          
          return new ESLVal("Unfold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Now": {ESLVal $3063 = _v2171.termRef(0);
          
          {ESLVal l = $3063;
          
          return exp;
        }
        }
      case "Become": {ESLVal $3062 = _v2171.termRef(0);
          ESLVal $3061 = _v2171.termRef(1);
          
          {ESLVal l = $3062;
          
          {ESLVal e = $3061;
          
          return new ESLVal("Become",l,translateCases.apply(e));
        }
        }
        }
        default: {ESLVal x = _v2171;
          
          return error(exp);
        }
      }
      }
    }
  });
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2170 = arm;
        
        switch(_v2170.termName) {
        case "LArm": {ESLVal $3060 = _v2170.termRef(0);
          ESLVal $3059 = _v2170.termRef(1);
          ESLVal $3058 = _v2170.termRef(2);
          ESLVal $3057 = _v2170.termRef(3);
          ESLVal $3056 = _v2170.termRef(4);
          
          {ESLVal l = $3060;
          
          {ESLVal ps = $3059;
          
          {ESLVal bs = $3058;
          
          {ESLVal g = $3057;
          
          {ESLVal e = $3056;
          
          return ps;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8442,8522)").add(ESLVal.list(_v2170)));
      }
      }
    }
  });
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2169 = arm;
        
        switch(_v2169.termName) {
        case "LArm": {ESLVal $3055 = _v2169.termRef(0);
          ESLVal $3054 = _v2169.termRef(1);
          ESLVal $3053 = _v2169.termRef(2);
          ESLVal $3052 = _v2169.termRef(3);
          ESLVal $3051 = _v2169.termRef(4);
          
          {ESLVal l = $3055;
          
          {ESLVal ps = $3054;
          
          {ESLVal bs = $3053;
          
          {ESLVal g = $3052;
          
          {ESLVal e = $3051;
          
          return e;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8551,8630)").add(ESLVal.list(_v2169)));
      }
      }
    }
  });
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v2168 = arm;
        
        switch(_v2168.termName) {
        case "LArm": {ESLVal $3050 = _v2168.termRef(0);
          ESLVal $3049 = _v2168.termRef(1);
          ESLVal $3048 = _v2168.termRef(2);
          ESLVal $3047 = _v2168.termRef(3);
          ESLVal $3046 = _v2168.termRef(4);
          
          {ESLVal l = $3050;
          
          {ESLVal ps = $3049;
          
          {ESLVal bs = $3048;
          
          {ESLVal g = $3047;
          
          {ESLVal e = $3046;
          
          return g;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8660,8739)").add(ESLVal.list(_v2168)));
      }
      }
    }
  });
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal e = $args[1];
  {ESLVal _v2167 = arm;
        
        switch(_v2167.termName) {
        case "LArm": {ESLVal $3045 = _v2167.termRef(0);
          ESLVal $3044 = _v2167.termRef(1);
          ESLVal $3043 = _v2167.termRef(2);
          ESLVal $3042 = _v2167.termRef(3);
          ESLVal $3041 = _v2167.termRef(4);
          
          {ESLVal l = $3045;
          
          {ESLVal ps = $3044;
          
          {ESLVal bs = $3043;
          
          {ESLVal g = $3042;
          
          {ESLVal old = $3041;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8778,8875)").add(ESLVal.list(_v2167)));
      }
      }
    }
  });
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal ps = $args[1];
  {ESLVal _v2166 = arm;
        
        switch(_v2166.termName) {
        case "LArm": {ESLVal $3040 = _v2166.termRef(0);
          ESLVal $3039 = _v2166.termRef(1);
          ESLVal $3038 = _v2166.termRef(2);
          ESLVal $3037 = _v2166.termRef(3);
          ESLVal $3036 = _v2166.termRef(4);
          
          {ESLVal l = $3040;
          
          {ESLVal old = $3039;
          
          {ESLVal bs = $3038;
          
          {ESLVal g = $3037;
          
          {ESLVal e = $3036;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8925,9022)").add(ESLVal.list(_v2166)));
      }
      }
    }
  });
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal newBS = $args[1];
  {ESLVal _v2165 = arm;
        
        switch(_v2165.termName) {
        case "LArm": {ESLVal $3035 = _v2165.termRef(0);
          ESLVal $3034 = _v2165.termRef(1);
          ESLVal $3033 = _v2165.termRef(2);
          ESLVal $3032 = _v2165.termRef(3);
          ESLVal $3031 = _v2165.termRef(4);
          
          {ESLVal l = $3035;
          
          {ESLVal ps = $3034;
          
          {ESLVal bs = $3033;
          
          {ESLVal g = $3032;
          
          {ESLVal e = $3031;
          
          return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9073,9178)").add(ESLVal.list(_v2165)));
      }
      }
    }
  });
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2164 = p;
        
        switch(_v2164.termName) {
        case "PVar": {ESLVal $3030 = _v2164.termRef(0);
          ESLVal $3029 = _v2164.termRef(1);
          ESLVal $3028 = _v2164.termRef(2);
          
          {ESLVal l = $3030;
          
          {ESLVal n = $3029;
          
          {ESLVal t = $3028;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2213 = _v2164;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2163 = p;
        
        switch(_v2163.termName) {
        case "PInt": {ESLVal $3027 = _v2163.termRef(0);
          ESLVal $3026 = _v2163.termRef(1);
          
          {ESLVal l = $3027;
          
          {ESLVal n = $3026;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2212 = _v2163;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2162 = p;
        
        switch(_v2162.termName) {
        case "PStr": {ESLVal $3025 = _v2162.termRef(0);
          ESLVal $3024 = _v2162.termRef(1);
          
          {ESLVal l = $3025;
          
          {ESLVal n = $3024;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2211 = _v2162;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2161 = p;
        
        switch(_v2161.termName) {
        case "PBool": {ESLVal $3023 = _v2161.termRef(0);
          ESLVal $3022 = _v2161.termRef(1);
          
          {ESLVal l = $3023;
          
          {ESLVal b = $3022;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v2210 = _v2161;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2160 = p;
        
        switch(_v2160.termName) {
        case "PTerm": {ESLVal $3021 = _v2160.termRef(0);
          ESLVal $3020 = _v2160.termRef(1);
          ESLVal $3019 = _v2160.termRef(2);
          ESLVal $3018 = _v2160.termRef(3);
          
          {ESLVal l = $3021;
          
          {ESLVal n = $3020;
          
          {ESLVal ts = $3019;
          
          {ESLVal ps = $3018;
          
          return $true;
        }
        }
        }
        }
        }
        default: {ESLVal _v2209 = _v2160;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2159 = p;
        
        switch(_v2159.termName) {
        case "PCons": {ESLVal $3017 = _v2159.termRef(0);
          ESLVal $3016 = _v2159.termRef(1);
          ESLVal $3015 = _v2159.termRef(2);
          
          {ESLVal l = $3017;
          
          {ESLVal h = $3016;
          
          {ESLVal t = $3015;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2208 = _v2159;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2158 = p;
        
        switch(_v2158.termName) {
        case "PNil": {ESLVal $3014 = _v2158.termRef(0);
          
          {ESLVal l = $3014;
          
          return $true;
        }
        }
      case "PApplyType": {ESLVal $3012 = _v2158.termRef(0);
          ESLVal $3011 = _v2158.termRef(1);
          ESLVal $3010 = _v2158.termRef(2);
          
          switch($3011.termName) {
          case "PNil": {ESLVal $3013 = $3011.termRef(0);
            
            {ESLVal l1 = $3012;
            
            {ESLVal l2 = $3013;
            
            {ESLVal ts = $3010;
            
            return $true;
          }
          }
          }
          }
          default: {ESLVal _v2206 = _v2158;
            
            return $false;
          }
        }
        }
        default: {ESLVal _v2207 = _v2158;
          
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
  {ESLVal _v2157 = p;
        
        switch(_v2157.termName) {
        case "PSetCons": {ESLVal $3009 = _v2157.termRef(0);
          ESLVal $3008 = _v2157.termRef(1);
          ESLVal $3007 = _v2157.termRef(2);
          
          {ESLVal l = $3009;
          
          {ESLVal p1 = $3008;
          
          {ESLVal p2 = $3007;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2205 = _v2157;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPEmptySet = new ESLVal(new Function(new ESLVal("isPEmptySet"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2156 = p;
        
        switch(_v2156.termName) {
        case "PEmptySet": {ESLVal $3006 = _v2156.termRef(0);
          
          {ESLVal l = $3006;
          
          return $true;
        }
        }
        default: {ESLVal _v2204 = _v2156;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPAdd = new ESLVal(new Function(new ESLVal("isPAdd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2155 = p;
        
        switch(_v2155.termName) {
        case "PAdd": {ESLVal $3005 = _v2155.termRef(0);
          ESLVal $3004 = _v2155.termRef(1);
          ESLVal $3003 = _v2155.termRef(2);
          
          {ESLVal l = $3005;
          
          {ESLVal p1 = $3004;
          
          {ESLVal p2 = $3003;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2203 = _v2155;
          
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
  {ESLVal _v2154 = p;
        
        switch(_v2154.termName) {
        case "PTerm": {ESLVal $3002 = _v2154.termRef(0);
          ESLVal $3001 = _v2154.termRef(1);
          ESLVal $3000 = _v2154.termRef(2);
          ESLVal $2999 = _v2154.termRef(3);
          
          {ESLVal l = $3002;
          
          {ESLVal n = $3001;
          
          {ESLVal ts = $3000;
          
          {ESLVal ps = $2999;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10558,10626)").add(ESLVal.list(_v2154)));
      }
      }
    }
  });
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2153 = p;
        
        switch(_v2153.termName) {
        case "PTerm": {ESLVal $2998 = _v2153.termRef(0);
          ESLVal $2997 = _v2153.termRef(1);
          ESLVal $2996 = _v2153.termRef(2);
          ESLVal $2995 = _v2153.termRef(3);
          
          {ESLVal l = $2998;
          
          {ESLVal n = $2997;
          
          {ESLVal ts = $2996;
          
          {ESLVal ps = $2995;
          
          return ps;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10666,10735)").add(ESLVal.list(_v2153)));
      }
      }
    }
  });
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2152 = p;
        
        switch(_v2152.termName) {
        case "PVar": {ESLVal $2994 = _v2152.termRef(0);
          ESLVal $2993 = _v2152.termRef(1);
          ESLVal $2992 = _v2152.termRef(2);
          
          {ESLVal l = $2994;
          
          {ESLVal n = $2993;
          
          {ESLVal t = $2992;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10768,10818)").add(ESLVal.list(_v2152)));
      }
      }
    }
  });
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2151 = p;
        
        switch(_v2151.termName) {
        case "PCons": {ESLVal $2991 = _v2151.termRef(0);
          ESLVal $2990 = _v2151.termRef(1);
          ESLVal $2989 = _v2151.termRef(2);
          
          {ESLVal l = $2991;
          
          {ESLVal h = $2990;
          
          {ESLVal t = $2989;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10856,10914)").add(ESLVal.list(_v2151)));
      }
      }
    }
  });
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2150 = p;
        
        switch(_v2150.termName) {
        case "PCons": {ESLVal $2988 = _v2150.termRef(0);
          ESLVal $2987 = _v2150.termRef(1);
          ESLVal $2986 = _v2150.termRef(2);
          
          {ESLVal l = $2988;
          
          {ESLVal h = $2987;
          
          {ESLVal t = $2986;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10952,11010)").add(ESLVal.list(_v2150)));
      }
      }
    }
  });
  private static ESLVal pSetConsHead = new ESLVal(new Function(new ESLVal("pSetConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2149 = p;
        
        switch(_v2149.termName) {
        case "PSetCons": {ESLVal $2985 = _v2149.termRef(0);
          ESLVal $2984 = _v2149.termRef(1);
          ESLVal $2983 = _v2149.termRef(2);
          
          {ESLVal l = $2985;
          
          {ESLVal h = $2984;
          
          {ESLVal t = $2983;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11051,11112)").add(ESLVal.list(_v2149)));
      }
      }
    }
  });
  private static ESLVal pSetConsTail = new ESLVal(new Function(new ESLVal("pSetConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2148 = p;
        
        switch(_v2148.termName) {
        case "PSetCons": {ESLVal $2982 = _v2148.termRef(0);
          ESLVal $2981 = _v2148.termRef(1);
          ESLVal $2980 = _v2148.termRef(2);
          
          {ESLVal l = $2982;
          
          {ESLVal h = $2981;
          
          {ESLVal t = $2980;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11153,11214)").add(ESLVal.list(_v2148)));
      }
      }
    }
  });
  private static ESLVal pAddLeft = new ESLVal(new Function(new ESLVal("pAddLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2147 = p;
        
        switch(_v2147.termName) {
        case "PAdd": {ESLVal $2979 = _v2147.termRef(0);
          ESLVal $2978 = _v2147.termRef(1);
          ESLVal $2977 = _v2147.termRef(2);
          
          {ESLVal l = $2979;
          
          {ESLVal left = $2978;
          
          {ESLVal right = $2977;
          
          return left;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11250,11317)").add(ESLVal.list(_v2147)));
      }
      }
    }
  });
  private static ESLVal pAddRight = new ESLVal(new Function(new ESLVal("pAddRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2146 = p;
        
        switch(_v2146.termName) {
        case "PAdd": {ESLVal $2976 = _v2146.termRef(0);
          ESLVal $2975 = _v2146.termRef(1);
          ESLVal $2974 = _v2146.termRef(2);
          
          {ESLVal l = $2976;
          
          {ESLVal left = $2975;
          
          {ESLVal right = $2974;
          
          return right;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11354,11422)").add(ESLVal.list(_v2146)));
      }
      }
    }
  });
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2145 = p;
        
        switch(_v2145.termName) {
        case "PInt": {ESLVal $2973 = _v2145.termRef(0);
          ESLVal $2972 = _v2145.termRef(1);
          
          {ESLVal l = $2973;
          
          {ESLVal n = $2972;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11456,11498)").add(ESLVal.list(_v2145)));
      }
      }
    }
  });
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2144 = p;
        
        switch(_v2144.termName) {
        case "PStr": {ESLVal $2971 = _v2144.termRef(0);
          ESLVal $2970 = _v2144.termRef(1);
          
          {ESLVal l = $2971;
          
          {ESLVal n = $2970;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11532,11574)").add(ESLVal.list(_v2144)));
      }
      }
    }
  });
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2143 = p;
        
        switch(_v2143.termName) {
        case "PBool": {ESLVal $2969 = _v2143.termRef(0);
          ESLVal $2968 = _v2143.termRef(1);
          
          {ESLVal l = $2969;
          
          {ESLVal b = $2968;
          
          return b;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11610,11655)").add(ESLVal.list(_v2143)));
      }
      }
    }
  });
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun934"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun935"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun936"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun937"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun938"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun939"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun940"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun941"),getSelf()) {
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
  return map.apply(new ESLVal(new Function(new ESLVal("fun942"),getSelf()) {
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
  return new ESLVal(new Function(new ESLVal("fun943"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal arms = $args[0];
        LetRec letrec = new LetRec() {
              ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v2198 = $args[0];
                ESLVal _v2197 = $args[1];
                {ESLVal _v2141 = _v2198;
                      ESLVal _v2140 = _v2197;
                      
                      if(_v2141.isCons())
                      {ESLVal $2960 = _v2141.head();
                        ESLVal $2961 = _v2141.tail();
                        
                        if(_v2140.isCons())
                        {ESLVal $2962 = _v2140.head();
                          ESLVal $2963 = _v2140.tail();
                          
                          {ESLVal a = $2960;
                          
                          {ESLVal _v2199 = $2961;
                          
                          {ESLVal v = $2962;
                          
                          {ESLVal _v2200 = $2963;
                          
                          {ESLVal _v2142 = e;
                          
                          switch(_v2142.termName) {
                          case "Var": {ESLVal $2967 = _v2142.termRef(0);
                            ESLVal $2966 = _v2142.termRef(1);
                            
                            {ESLVal l = $2967;
                            
                            {ESLVal n = $2966;
                            
                            if(n.eql(v).boolVal)
                            return bind.apply(_v2199,_v2200).cons(a);
                            else
                              {ESLVal _v2201 = _v2142;
                                
                                return bind.apply(_v2199,_v2200).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v2201))));
                              }
                          }
                          }
                          }
                          default: {ESLVal _v2202 = _v2142;
                            
                            return bind.apply(_v2199,_v2200).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v2202))));
                          }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else if(_v2140.isNil())
                        return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2141,_v2140)));
                      else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2141,_v2140)));
                      }
                    else if(_v2141.isNil())
                      if(_v2140.isCons())
                        {ESLVal $2964 = _v2140.head();
                          ESLVal $2965 = _v2140.tail();
                          
                          return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2141,_v2140)));
                        }
                      else if(_v2140.isNil())
                        return $nil;
                      else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2141,_v2140)));
                    else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v2141,_v2140)));
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
            
              return bind.apply(arms,vNames);
            
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun944"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun945"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun946"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun947"),getSelf()) {
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
  return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2139 = $qualArg;
              
              {ESLVal n = _v2139;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Binding",loc0,n,voidType,voidType,new ESLVal("TermRef",e,indexOf.apply(n,names)))));
            }
            }
          }
        }).map(names).flatten().flatten();
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
        
        return new ESLVal("Let",loc0,fieldBindings.apply(e,names),compileCase.apply(l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2137 = $qualArg;
              
              {ESLVal n = _v2137;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",loc0,n)));
            }
            }
          }
        }).map(names).flatten().flatten().add(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2138 = $qualArg;
              
              {ESLVal a = _v2138;
              
              return ESLVal.list(ESLVal.list(explodeCnstr.apply(a)));
            }
            }
          }
        }).map(arms).flatten().flatten(),alt));
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun948"),getSelf()) {
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
  {ESLVal _v2136 = armss;
        
        if(_v2136.isCons())
        {ESLVal $2958 = _v2136.head();
          ESLVal $2959 = _v2136.tail();
          
          {ESLVal as = $2958;
          
          {ESLVal _v2196 = $2959;
          
          return createTArms.apply(l,_v2196,es,alt).cons(new ESLVal("TArm",sharedCnstr.apply(as),cnstrArm.apply(l,head.apply(es),tail.apply(es),as,alt)));
        }
        }
        }
      else if(_v2136.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(16496,16676)").add(ESLVal.list(_v2136)));
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
        
        return new ESLVal("Let",loc0,ESLVal.list(new ESLVal("Binding",loc0,hn,voidType,voidType,new ESLVal("Head",l)),new ESLVal("Binding",loc0,tn,voidType,voidType,new ESLVal("Tail",l))),compileCase.apply(loc,ESLVal.list(hv,tv).add(tail.apply(es)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2135 = $qualArg;
              
              {ESLVal a = _v2135;
              
              return ESLVal.list(ESLVal.list(explodeCons.apply(a)));
            }
            }
          }
        }).map(arms).flatten().flatten(),alt));
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
  {ESLVal consArms = filter.apply(new ESLVal(new Function(new ESLVal("fun949"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms);
        ESLVal nilArms = map.apply(dropPattern,filter.apply(new ESLVal(new Function(new ESLVal("fun950"),getSelf()) {
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
  {ESLVal _v2134 = head.apply(armPatterns.apply(arm));
        
        switch(_v2134.termName) {
        case "PEmptySet": {ESLVal $2957 = _v2134.termRef(0);
          
          {ESLVal pl = $2957;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("emptyset")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PSetCons": {ESLVal $2956 = _v2134.termRef(0);
          ESLVal $2955 = _v2134.termRef(1);
          ESLVal $2954 = _v2134.termRef(2);
          
          {ESLVal pl = $2956;
          
          {ESLVal p1 = $2955;
          
          {ESLVal p2 = $2954;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setcons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeSetCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $2953 = _v2134.termRef(0);
          ESLVal $2952 = _v2134.termRef(1);
          ESLVal $2951 = _v2134.termRef(2);
          
          {ESLVal pl = $2953;
          
          {ESLVal p1 = $2952;
          
          {ESLVal p2 = $2951;
          
          {ESLVal fail = newVar.apply();
          ESLVal left = newVar.apply();
          ESLVal right = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$add"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setadd")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(explodeAdd.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17621,18742)").add(ESLVal.list(_v2134)));
      }
      }
    }
  });
  private static ESLVal processNonDetListArms = new ESLVal(new Function(new ESLVal("processNonDetListArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arm = $args[2];
  {ESLVal _v2133 = head.apply(armPatterns.apply(arm));
        
        switch(_v2133.termName) {
        case "PNil": {ESLVal $2950 = _v2133.termRef(0);
          
          {ESLVal pl = $2950;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("nil")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PCons": {ESLVal $2949 = _v2133.termRef(0);
          ESLVal $2948 = _v2133.termRef(1);
          ESLVal $2947 = _v2133.termRef(2);
          
          {ESLVal pl = $2949;
          
          {ESLVal p1 = $2948;
          
          {ESLVal p2 = $2947;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("cons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $2924 = _v2133.termRef(0);
          ESLVal $2923 = _v2133.termRef(1);
          ESLVal $2922 = _v2133.termRef(2);
          
          switch($2923.termName) {
          case "PCons": {ESLVal $2945 = $2923.termRef(0);
            ESLVal $2944 = $2923.termRef(1);
            ESLVal $2943 = $2923.termRef(2);
            
            switch($2943.termName) {
            case "PNil": {ESLVal $2946 = $2943.termRef(0);
              
              {ESLVal l1 = $2924;
              
              {ESLVal l2 = $2945;
              
              {ESLVal p1 = $2944;
              
              {ESLVal l3 = $2946;
              
              {ESLVal p2 = $2922;
              
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
            default: switch($2922.termName) {
              case "PCons": {ESLVal $2934 = $2922.termRef(0);
                ESLVal $2933 = $2922.termRef(1);
                ESLVal $2932 = $2922.termRef(2);
                
                switch($2932.termName) {
                case "PNil": {ESLVal $2935 = $2932.termRef(0);
                  
                  {ESLVal l1 = $2924;
                  
                  {ESLVal p1 = $2923;
                  
                  {ESLVal l2 = $2934;
                  
                  {ESLVal p2 = $2933;
                  
                  {ESLVal l3 = $2935;
                  
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
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
              }
            case "PAdd": {ESLVal $2927 = $2922.termRef(0);
                ESLVal $2926 = $2922.termRef(1);
                ESLVal $2925 = $2922.termRef(2);
                
                switch($2926.termName) {
                case "PCons": {ESLVal $2930 = $2926.termRef(0);
                  ESLVal $2929 = $2926.termRef(1);
                  ESLVal $2928 = $2926.termRef(2);
                  
                  switch($2928.termName) {
                  case "PNil": {ESLVal $2931 = $2928.termRef(0);
                    
                    {ESLVal l1 = $2924;
                    
                    {ESLVal p1 = $2923;
                    
                    {ESLVal l2 = $2927;
                    
                    {ESLVal l3 = $2930;
                    
                    {ESLVal p2 = $2929;
                    
                    {ESLVal l4 = $2931;
                    
                    {ESLVal p3 = $2925;
                    
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
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
            }
          }
          }
        case "PAdd": {ESLVal $2938 = $2923.termRef(0);
            ESLVal $2937 = $2923.termRef(1);
            ESLVal $2936 = $2923.termRef(2);
            
            switch($2936.termName) {
            case "PCons": {ESLVal $2941 = $2936.termRef(0);
              ESLVal $2940 = $2936.termRef(1);
              ESLVal $2939 = $2936.termRef(2);
              
              switch($2939.termName) {
              case "PNil": {ESLVal $2942 = $2939.termRef(0);
                
                {ESLVal l1 = $2924;
                
                {ESLVal l2 = $2938;
                
                {ESLVal p1 = $2937;
                
                {ESLVal l3 = $2941;
                
                {ESLVal p2 = $2940;
                
                {ESLVal l4 = $2942;
                
                {ESLVal p3 = $2922;
                
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
              default: switch($2922.termName) {
                case "PCons": {ESLVal $2934 = $2922.termRef(0);
                  ESLVal $2933 = $2922.termRef(1);
                  ESLVal $2932 = $2922.termRef(2);
                  
                  switch($2932.termName) {
                  case "PNil": {ESLVal $2935 = $2932.termRef(0);
                    
                    {ESLVal l1 = $2924;
                    
                    {ESLVal p1 = $2923;
                    
                    {ESLVal l2 = $2934;
                    
                    {ESLVal p2 = $2933;
                    
                    {ESLVal l3 = $2935;
                    
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
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
                }
                }
              case "PAdd": {ESLVal $2927 = $2922.termRef(0);
                  ESLVal $2926 = $2922.termRef(1);
                  ESLVal $2925 = $2922.termRef(2);
                  
                  switch($2926.termName) {
                  case "PCons": {ESLVal $2930 = $2926.termRef(0);
                    ESLVal $2929 = $2926.termRef(1);
                    ESLVal $2928 = $2926.termRef(2);
                    
                    switch($2928.termName) {
                    case "PNil": {ESLVal $2931 = $2928.termRef(0);
                      
                      {ESLVal l1 = $2924;
                      
                      {ESLVal p1 = $2923;
                      
                      {ESLVal l2 = $2927;
                      
                      {ESLVal l3 = $2930;
                      
                      {ESLVal p2 = $2929;
                      
                      {ESLVal l4 = $2931;
                      
                      {ESLVal p3 = $2925;
                      
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
                    default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
            }
            }
            default: switch($2922.termName) {
              case "PCons": {ESLVal $2934 = $2922.termRef(0);
                ESLVal $2933 = $2922.termRef(1);
                ESLVal $2932 = $2922.termRef(2);
                
                switch($2932.termName) {
                case "PNil": {ESLVal $2935 = $2932.termRef(0);
                  
                  {ESLVal l1 = $2924;
                  
                  {ESLVal p1 = $2923;
                  
                  {ESLVal l2 = $2934;
                  
                  {ESLVal p2 = $2933;
                  
                  {ESLVal l3 = $2935;
                  
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
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
              }
            case "PAdd": {ESLVal $2927 = $2922.termRef(0);
                ESLVal $2926 = $2922.termRef(1);
                ESLVal $2925 = $2922.termRef(2);
                
                switch($2926.termName) {
                case "PCons": {ESLVal $2930 = $2926.termRef(0);
                  ESLVal $2929 = $2926.termRef(1);
                  ESLVal $2928 = $2926.termRef(2);
                  
                  switch($2928.termName) {
                  case "PNil": {ESLVal $2931 = $2928.termRef(0);
                    
                    {ESLVal l1 = $2924;
                    
                    {ESLVal p1 = $2923;
                    
                    {ESLVal l2 = $2927;
                    
                    {ESLVal l3 = $2930;
                    
                    {ESLVal p2 = $2929;
                    
                    {ESLVal l4 = $2931;
                    
                    {ESLVal p3 = $2925;
                    
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
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
            }
          }
          }
          default: switch($2922.termName) {
            case "PCons": {ESLVal $2934 = $2922.termRef(0);
              ESLVal $2933 = $2922.termRef(1);
              ESLVal $2932 = $2922.termRef(2);
              
              switch($2932.termName) {
              case "PNil": {ESLVal $2935 = $2932.termRef(0);
                
                {ESLVal l1 = $2924;
                
                {ESLVal p1 = $2923;
                
                {ESLVal l2 = $2934;
                
                {ESLVal p2 = $2933;
                
                {ESLVal l3 = $2935;
                
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
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
            }
            }
          case "PAdd": {ESLVal $2927 = $2922.termRef(0);
              ESLVal $2926 = $2922.termRef(1);
              ESLVal $2925 = $2922.termRef(2);
              
              switch($2926.termName) {
              case "PCons": {ESLVal $2930 = $2926.termRef(0);
                ESLVal $2929 = $2926.termRef(1);
                ESLVal $2928 = $2926.termRef(2);
                
                switch($2928.termName) {
                case "PNil": {ESLVal $2931 = $2928.termRef(0);
                  
                  {ESLVal l1 = $2924;
                  
                  {ESLVal p1 = $2923;
                  
                  {ESLVal l2 = $2927;
                  
                  {ESLVal l3 = $2930;
                  
                  {ESLVal p2 = $2929;
                  
                  {ESLVal l4 = $2931;
                  
                  {ESLVal p3 = $2925;
                  
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
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v2133)));
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun951"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return intArms.apply(c,arms);
            }
          }),ints);
        
        return new ESLVal("CaseInt",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2131 = $qualArg;
              
              {ESLVal as = _v2131;
              
              return ESLVal.list(ESLVal.list(new ESLVal("IArm",sharedInt.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v2195 = $args[0];
              {ESLVal _v2132 = _v2195;
                    
                    {ESLVal a = _v2132;
                    
                    return ESLVal.list(ESLVal.list(dropPattern.apply(a)));
                  }
                  }
                }
              }).map(as).flatten().flatten(),alt))));
            }
            }
          }
        }).map(armss).flatten().flatten(),alt);
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun952"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return strArms.apply(c,arms);
            }
          }),strs);
        
        return new ESLVal("CaseStr",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2129 = $qualArg;
              
              {ESLVal as = _v2129;
              
              return ESLVal.list(ESLVal.list(new ESLVal("SArm",sharedStr.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v2194 = $args[0];
              {ESLVal _v2130 = _v2194;
                    
                    {ESLVal a = _v2130;
                    
                    return ESLVal.list(ESLVal.list(dropPattern.apply(a)));
                  }
                  }
                }
              }).map(as).flatten().flatten(),alt))));
            }
            }
          }
        }).map(armss).flatten().flatten(),alt);
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun953"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return boolArms.apply(c,arms);
            }
          }),bools);
        
        return new ESLVal("CaseBool",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2127 = $qualArg;
              
              {ESLVal as = _v2127;
              
              return ESLVal.list(ESLVal.list(new ESLVal("BoolArm",sharedBool.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v2193 = $args[0];
              {ESLVal _v2128 = _v2193;
                    
                    {ESLVal a = _v2128;
                    
                    return ESLVal.list(ESLVal.list(dropPattern.apply(a)));
                  }
                  }
                }
              }).map(as).flatten().flatten(),alt))));
            }
            }
          }
        }).map(armss).flatten().flatten(),alt);
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
        
        return new ESLVal("CaseSet",l,head.apply(es),new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2126 = $qualArg;
              
              {ESLVal a = _v2126;
              
              return ESLVal.list(ESLVal.list(processSetArms.apply(l,tail.apply(es),a)));
            }
            }
          }
        }).map(arms).flatten().flatten()),f);
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
        
        return new ESLVal("CaseAdd",l,head.apply(es),new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2125 = $qualArg;
              
              {ESLVal a = _v2125;
              
              return ESLVal.list(ESLVal.list(processNonDetListArms.apply(l,tail.apply(es),a)));
            }
            }
          }
        }).map(arms).flatten().flatten()),f);
      }}
    }
  });
  private static ESLVal splitTerms = new ESLVal(new Function(new ESLVal("splitTerms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun954"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun955"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun956"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun957"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun958"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPAdd.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun959"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun960"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPSet.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun961"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun962"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun963"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun964"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun965"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun966"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun967"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun968"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun969"),getSelf()) {
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
        
        {ESLVal nonVarPatterns = filter.apply(new ESLVal(new Function(new ESLVal("fun970"),getSelf()) {
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
  {ESLVal _v2124 = arms;
        
        if(_v2124.isCons())
        {ESLVal $2913 = _v2124.head();
          ESLVal $2914 = _v2124.tail();
          
          switch($2913.termName) {
          case "LArm": {ESLVal $2919 = $2913.termRef(0);
            ESLVal $2918 = $2913.termRef(1);
            ESLVal $2917 = $2913.termRef(2);
            ESLVal $2916 = $2913.termRef(3);
            ESLVal $2915 = $2913.termRef(4);
            
            if($2918.isCons())
            {ESLVal $2920 = $2918.head();
              ESLVal $2921 = $2918.tail();
              
              return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2124)));
            }
          else if($2918.isNil())
            {ESLVal al = $2919;
              
              {ESLVal bs = $2917;
              
              {ESLVal g = $2916;
              
              {ESLVal e = $2915;
              
              {ESLVal _v2192 = $2914;
              
              return foldArm.apply(al,bs,g,e,foldArms.apply(l,_v2192,alt));
            }
            }
            }
            }
            }
          else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2124)));
          }
          default: return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2124)));
        }
        }
      else if(_v2124.isNil())
        return alt;
      else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v2124)));
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
  {ESLVal _v2122 = bss;
        
        if(_v2122.isCons())
        {ESLVal $2909 = _v2122.head();
          ESLVal $2910 = _v2122.tail();
          
          {ESLVal bs = $2909;
          
          {ESLVal _v2189 = $2910;
          
          return new ESLVal("Let",l,bs,foldArm.apply(l,_v2189,g,e,alt));
        }
        }
        }
      else if(_v2122.isNil())
        {ESLVal _v2123 = g;
          
          switch(_v2123.termName) {
          case "BoolExp": {ESLVal $2912 = _v2123.termRef(0);
            ESLVal $2911 = _v2123.termRef(1);
            
            switch($2911.boolVal ? 1 : 0) {
            case 1: {ESLVal bl = $2912;
              
              return e;
            }
            default: {ESLVal _v2190 = _v2123;
              
              return new ESLVal("If",l,_v2190,e,alt);
            }
          }
          }
          default: {ESLVal _v2191 = _v2123;
            
            return new ESLVal("If",l,_v2191,e,alt);
          }
        }
        }
      else return error(new ESLVal("case error at Pos(27642,27842)").add(ESLVal.list(_v2122)));
      }
    }
  });
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v2121 = q;
        
        switch(_v2121.termName) {
        case "BQual": {ESLVal $2908 = _v2121.termRef(0);
          ESLVal $2907 = _v2121.termRef(1);
          ESLVal $2906 = _v2121.termRef(2);
          
          {ESLVal l = $2908;
          
          {ESLVal p = $2907;
          
          {ESLVal e = $2906;
          
          return new ESLVal("BQual",l,p,translateCases.apply(e));
        }
        }
        }
        }
      case "PQual": {ESLVal $2905 = _v2121.termRef(0);
          ESLVal $2904 = _v2121.termRef(1);
          
          {ESLVal l = $2905;
          
          {ESLVal p = $2904;
          
          return new ESLVal("PQual",l,translateCases.apply(p));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(27894,28031)").add(ESLVal.list(_v2121)));
      }
      }
    }
  });
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v2120 = a;
        
        switch(_v2120.termName) {
        case "LArm": {ESLVal $2903 = _v2120.termRef(0);
          ESLVal $2902 = _v2120.termRef(1);
          ESLVal $2901 = _v2120.termRef(2);
          ESLVal $2900 = _v2120.termRef(3);
          ESLVal $2899 = _v2120.termRef(4);
          
          {ESLVal l = $2903;
          
          {ESLVal ps = $2902;
          
          {ESLVal bs = $2901;
          
          {ESLVal guard = $2900;
          
          {ESLVal e = $2899;
          
          return new ESLVal("LArm",l,ps,bs,translateCases.apply(guard),translateCases.apply(e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28070,28203)").add(ESLVal.list(_v2120)));
      }
      }
    }
  });
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v2119 = b;
        
        switch(_v2119.termName) {
        case "Binding": {ESLVal $2898 = _v2119.termRef(0);
          ESLVal $2897 = _v2119.termRef(1);
          ESLVal $2896 = _v2119.termRef(2);
          ESLVal $2895 = _v2119.termRef(3);
          ESLVal $2894 = _v2119.termRef(4);
          
          {ESLVal l = $2898;
          
          {ESLVal name = $2897;
          
          {ESLVal t = $2896;
          
          {ESLVal st = $2895;
          
          {ESLVal value = $2894;
          
          return new ESLVal("Binding",l,name,t,st,translateCases.apply(value));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $2893 = _v2119.termRef(0);
          ESLVal $2892 = _v2119.termRef(1);
          ESLVal $2891 = _v2119.termRef(2);
          ESLVal $2890 = _v2119.termRef(3);
          
          {ESLVal l = $2893;
          
          {ESLVal name = $2892;
          
          {ESLVal t = $2891;
          
          {ESLVal ignore = $2890;
          
          return b;
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $2889 = _v2119.termRef(0);
          ESLVal $2888 = _v2119.termRef(1);
          ESLVal $2887 = _v2119.termRef(2);
          ESLVal $2886 = _v2119.termRef(3);
          
          {ESLVal l = $2889;
          
          {ESLVal name = $2888;
          
          {ESLVal t = $2887;
          
          {ESLVal ignore = $2886;
          
          return b;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $2885 = _v2119.termRef(0);
          ESLVal $2884 = _v2119.termRef(1);
          ESLVal $2883 = _v2119.termRef(2);
          ESLVal $2882 = _v2119.termRef(3);
          ESLVal $2881 = _v2119.termRef(4);
          ESLVal $2880 = _v2119.termRef(5);
          ESLVal $2879 = _v2119.termRef(6);
          
          {ESLVal l = $2885;
          
          {ESLVal n = $2884;
          
          {ESLVal args = $2883;
          
          {ESLVal t = $2882;
          
          {ESLVal st = $2881;
          
          {ESLVal body = $2880;
          
          {ESLVal guard = $2879;
          
          return new ESLVal("FunBind",l,n,args,t,st,translateCases.apply(body),translateCases.apply(guard));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $2878 = _v2119.termRef(0);
          ESLVal $2877 = _v2119.termRef(1);
          ESLVal $2876 = _v2119.termRef(2);
          ESLVal $2875 = _v2119.termRef(3);
          
          {ESLVal l = $2878;
          
          {ESLVal name = $2877;
          
          {ESLVal t = $2876;
          
          {ESLVal ignore = $2875;
          
          return b;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v2119;
          
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2118 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2118)));
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
                  {ESLVal _v2117 = $x;
              
              {ESLVal x = _v2117;
              
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