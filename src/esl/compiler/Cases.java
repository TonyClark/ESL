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
  {ESLVal _v71 = as;
        
        if(_v71.isCons())
        {ESLVal $306 = _v71.head();
          ESLVal $307 = _v71.tail();
          
          switch($306.termName) {
          case "BArm": {ESLVal $311 = $306.termRef(0);
            ESLVal $310 = $306.termRef(1);
            ESLVal $309 = $306.termRef(2);
            ESLVal $308 = $306.termRef(3);
            
            {ESLVal l = $311;
            
            {ESLVal ps = $310;
            
            {ESLVal g = $309;
            
            {ESLVal e = $308;
            
            {ESLVal _v97 = $307;
            
            return translateArms.apply(_v97).cons(new ESLVal("LArm",l,ps,$nil,g,e));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v71)));
        }
        }
      else if(_v71.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v71)));
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
  {ESLVal _v55 = exp;
        
        switch(_v55.termName) {
        case "Module": {ESLVal $305 = _v55.termRef(0);
          ESLVal $304 = _v55.termRef(1);
          ESLVal $303 = _v55.termRef(2);
          ESLVal $302 = _v55.termRef(3);
          ESLVal $301 = _v55.termRef(4);
          ESLVal $300 = _v55.termRef(5);
          ESLVal $299 = _v55.termRef(6);
          
          {ESLVal path = $305;
          
          {ESLVal name = $304;
          
          {ESLVal exports = $303;
          
          {ESLVal imports = $302;
          
          {ESLVal x = $301;
          
          {ESLVal y = $300;
          
          {ESLVal defs = $299;
          
          return new ESLVal("Module",path,name,exports,imports,x,y,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v70 = $qualArg;
                
                {ESLVal d = _v70;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(d)));
              }
              }
            }
          }).map(defs).flatten().flatten());
        }
        }
        }
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $298 = _v55.termRef(0);
          ESLVal $297 = _v55.termRef(1);
          ESLVal $296 = _v55.termRef(2);
          ESLVal $295 = _v55.termRef(3);
          ESLVal $294 = _v55.termRef(4);
          
          {ESLVal l = $298;
          
          {ESLVal n = $297;
          
          {ESLVal args = $296;
          
          {ESLVal t = $295;
          
          {ESLVal e = $294;
          
          return new ESLVal("FunExp",l,n,args,t,translateCases.apply(e));
        }
        }
        }
        }
        }
        }
      case "StrExp": {ESLVal $293 = _v55.termRef(0);
          ESLVal $292 = _v55.termRef(1);
          
          {ESLVal l = $293;
          
          {ESLVal v = $292;
          
          return exp;
        }
        }
        }
      case "IntExp": {ESLVal $291 = _v55.termRef(0);
          ESLVal $290 = _v55.termRef(1);
          
          {ESLVal l = $291;
          
          {ESLVal v = $290;
          
          return exp;
        }
        }
        }
      case "BoolExp": {ESLVal $289 = _v55.termRef(0);
          ESLVal $288 = _v55.termRef(1);
          
          {ESLVal l = $289;
          
          {ESLVal v = $288;
          
          return exp;
        }
        }
        }
      case "BagExp": {ESLVal $287 = _v55.termRef(0);
          ESLVal $286 = _v55.termRef(1);
          
          {ESLVal l = $287;
          
          {ESLVal es = $286;
          
          return new ESLVal("BagExp",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v69 = $qualArg;
                
                {ESLVal e = _v69;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "NullExp": {ESLVal $285 = _v55.termRef(0);
          
          {ESLVal l = $285;
          
          return exp;
        }
        }
      case "FloatExp": {ESLVal $284 = _v55.termRef(0);
          ESLVal $283 = _v55.termRef(1);
          
          {ESLVal l = $284;
          
          {ESLVal f = $283;
          
          return exp;
        }
        }
        }
      case "Term": {ESLVal $282 = _v55.termRef(0);
          ESLVal $281 = _v55.termRef(1);
          ESLVal $280 = _v55.termRef(2);
          ESLVal $279 = _v55.termRef(3);
          
          {ESLVal l = $282;
          
          {ESLVal n = $281;
          
          {ESLVal ts = $280;
          
          {ESLVal es = $279;
          
          return new ESLVal("Term",l,n,ts,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v68 = $qualArg;
                
                {ESLVal e = _v68;
                
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
      case "List": {ESLVal $278 = _v55.termRef(0);
          ESLVal $277 = _v55.termRef(1);
          
          {ESLVal l = $278;
          
          {ESLVal es = $277;
          
          return new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v67 = $qualArg;
                
                {ESLVal e = _v67;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Block": {ESLVal $276 = _v55.termRef(0);
          ESLVal $275 = _v55.termRef(1);
          
          {ESLVal l = $276;
          
          {ESLVal es = $275;
          
          return new ESLVal("Block",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v66 = $qualArg;
                
                {ESLVal e = _v66;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Apply": {ESLVal $274 = _v55.termRef(0);
          ESLVal $273 = _v55.termRef(1);
          ESLVal $272 = _v55.termRef(2);
          
          {ESLVal l = $274;
          
          {ESLVal op = $273;
          
          {ESLVal args = $272;
          
          return new ESLVal("Apply",l,translateCases.apply(op),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v65 = $qualArg;
                
                {ESLVal e = _v65;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $271 = _v55.termRef(0);
          ESLVal $270 = _v55.termRef(1);
          ESLVal $269 = _v55.termRef(2);
          
          {ESLVal l = $271;
          
          {ESLVal op = $270;
          
          {ESLVal args = $269;
          
          return new ESLVal("ApplyTypeExp",l,translateCases.apply(op),args);
        }
        }
        }
        }
      case "Case": {ESLVal $268 = _v55.termRef(0);
          ESLVal $267 = _v55.termRef(1);
          ESLVal $266 = _v55.termRef(2);
          ESLVal $265 = _v55.termRef(3);
          
          {ESLVal l = $268;
          
          {ESLVal ds = $267;
          
          {ESLVal es = $266;
          
          {ESLVal as = $265;
          
          return compileCase.apply(l,es,translateArms.apply(as),new ESLVal("CaseError",l,new ESLVal("List",l,es)));
        }
        }
        }
        }
        }
      case "BinExp": {ESLVal $264 = _v55.termRef(0);
          ESLVal $263 = _v55.termRef(1);
          ESLVal $262 = _v55.termRef(2);
          ESLVal $261 = _v55.termRef(3);
          
          {ESLVal l = $264;
          
          {ESLVal e1 = $263;
          
          {ESLVal op = $262;
          
          {ESLVal e2 = $261;
          
          return new ESLVal("BinExp",l,translateCases.apply(e1),op,translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "For": {ESLVal $260 = _v55.termRef(0);
          ESLVal $259 = _v55.termRef(1);
          ESLVal $258 = _v55.termRef(2);
          ESLVal $257 = _v55.termRef(3);
          
          {ESLVal l = $260;
          
          {ESLVal p = $259;
          
          {ESLVal e1 = $258;
          
          {ESLVal e2 = $257;
          
          return new ESLVal("For",l,p,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $256 = _v55.termRef(0);
          ESLVal $255 = _v55.termRef(1);
          ESLVal $254 = _v55.termRef(2);
          
          {ESLVal l = $256;
          
          {ESLVal t = $255;
          
          {ESLVal e = $254;
          
          return new ESLVal("Throw",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Try": {ESLVal $253 = _v55.termRef(0);
          ESLVal $252 = _v55.termRef(1);
          ESLVal $251 = _v55.termRef(2);
          
          {ESLVal l = $253;
          
          {ESLVal e = $252;
          
          {ESLVal as = $251;
          
          return new ESLVal("Try",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v64 = $qualArg;
                
                {ESLVal a = _v64;
                
                return ESLVal.list(ESLVal.list(translateArm.apply(a)));
              }
              }
            }
          }).map(as).flatten().flatten());
        }
        }
        }
        }
      case "ActExp": {ESLVal $250 = _v55.termRef(0);
          ESLVal $249 = _v55.termRef(1);
          ESLVal $248 = _v55.termRef(2);
          ESLVal $247 = _v55.termRef(3);
          ESLVal $246 = _v55.termRef(4);
          ESLVal $245 = _v55.termRef(5);
          ESLVal $244 = _v55.termRef(6);
          ESLVal $243 = _v55.termRef(7);
          
          {ESLVal l = $250;
          
          {ESLVal n = $249;
          
          {ESLVal args = $248;
          
          {ESLVal x = $247;
          
          {ESLVal spec = $246;
          
          {ESLVal locals = $245;
          
          {ESLVal init = $244;
          
          {ESLVal handlers = $243;
          
          return new ESLVal("ActExp",l,n,args,x,spec,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v62 = $qualArg;
                
                {ESLVal b = _v62;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(locals).flatten().flatten(),translateCases.apply(init),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v63 = $qualArg;
                
                {ESLVal h = _v63;
                
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
      case "If": {ESLVal $242 = _v55.termRef(0);
          ESLVal $241 = _v55.termRef(1);
          ESLVal $240 = _v55.termRef(2);
          ESLVal $239 = _v55.termRef(3);
          
          {ESLVal l = $242;
          
          {ESLVal e1 = $241;
          
          {ESLVal e2 = $240;
          
          {ESLVal e3 = $239;
          
          return new ESLVal("If",l,translateCases.apply(e1),translateCases.apply(e2),translateCases.apply(e3));
        }
        }
        }
        }
        }
      case "Self": {ESLVal $238 = _v55.termRef(0);
          
          {ESLVal l = $238;
          
          return exp;
        }
        }
      case "Update": {ESLVal $237 = _v55.termRef(0);
          ESLVal $236 = _v55.termRef(1);
          ESLVal $235 = _v55.termRef(2);
          
          {ESLVal l = $237;
          
          {ESLVal n = $236;
          
          {ESLVal e = $235;
          
          return new ESLVal("Update",l,n,translateCases.apply(e));
        }
        }
        }
        }
      case "Ref": {ESLVal $234 = _v55.termRef(0);
          ESLVal $233 = _v55.termRef(1);
          ESLVal $232 = _v55.termRef(2);
          
          {ESLVal l = $234;
          
          {ESLVal e = $233;
          
          {ESLVal n = $232;
          
          return new ESLVal("Ref",l,translateCases.apply(e),n);
        }
        }
        }
        }
      case "Var": {ESLVal $231 = _v55.termRef(0);
          ESLVal $230 = _v55.termRef(1);
          
          {ESLVal l = $231;
          
          {ESLVal n = $230;
          
          return exp;
        }
        }
        }
      case "Send": {ESLVal $229 = _v55.termRef(0);
          ESLVal $228 = _v55.termRef(1);
          ESLVal $227 = _v55.termRef(2);
          
          {ESLVal l = $229;
          
          {ESLVal target = $228;
          
          {ESLVal message = $227;
          
          return new ESLVal("Send",l,translateCases.apply(target),translateCases.apply(message));
        }
        }
        }
        }
      case "SendTimeSuper": {ESLVal $226 = _v55.termRef(0);
          
          {ESLVal l = $226;
          
          return new ESLVal("SendTimeSuper",l);
        }
        }
      case "SendSuper": {ESLVal $225 = _v55.termRef(0);
          ESLVal $224 = _v55.termRef(1);
          
          {ESLVal l = $225;
          
          {ESLVal e = $224;
          
          return new ESLVal("SendSuper",l,translateCases.apply(e));
        }
        }
        }
      case "SetExp": {ESLVal $223 = _v55.termRef(0);
          ESLVal $222 = _v55.termRef(1);
          
          {ESLVal l = $223;
          
          {ESLVal es = $222;
          
          return new ESLVal("SetExp",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v61 = $qualArg;
                
                {ESLVal e = _v61;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Cmp": {ESLVal $221 = _v55.termRef(0);
          ESLVal $220 = _v55.termRef(1);
          ESLVal $219 = _v55.termRef(2);
          
          {ESLVal l = $221;
          
          {ESLVal e = $220;
          
          {ESLVal qs = $219;
          
          return new ESLVal("Cmp",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v60 = $qualArg;
                
                {ESLVal q = _v60;
                
                return ESLVal.list(ESLVal.list(translateQual.apply(q)));
              }
              }
            }
          }).map(qs).flatten().flatten());
        }
        }
        }
        }
      case "New": {ESLVal $218 = _v55.termRef(0);
          ESLVal $217 = _v55.termRef(1);
          ESLVal $216 = _v55.termRef(2);
          
          {ESLVal l = $218;
          
          {ESLVal b = $217;
          
          {ESLVal args = $216;
          
          return new ESLVal("New",l,translateCases.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v59 = $qualArg;
                
                {ESLVal e = _v59;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "NewJava": {ESLVal $215 = _v55.termRef(0);
          ESLVal $214 = _v55.termRef(1);
          ESLVal $213 = _v55.termRef(2);
          ESLVal $212 = _v55.termRef(3);
          
          {ESLVal l = $215;
          
          {ESLVal className = $214;
          
          {ESLVal t = $213;
          
          {ESLVal args = $212;
          
          return new ESLVal("NewJava",l,className,t,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v58 = $qualArg;
                
                {ESLVal e = _v58;
                
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
      case "Let": {ESLVal $211 = _v55.termRef(0);
          ESLVal $210 = _v55.termRef(1);
          ESLVal $209 = _v55.termRef(2);
          
          {ESLVal l = $211;
          
          {ESLVal bs = $210;
          
          {ESLVal e = $209;
          
          return new ESLVal("Let",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v57 = $qualArg;
                
                {ESLVal b = _v57;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Letrec": {ESLVal $208 = _v55.termRef(0);
          ESLVal $207 = _v55.termRef(1);
          ESLVal $206 = _v55.termRef(2);
          
          {ESLVal l = $208;
          
          {ESLVal bs = $207;
          
          {ESLVal e = $206;
          
          return new ESLVal("Letrec",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v56 = $qualArg;
                
                {ESLVal b = _v56;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Grab": {ESLVal $205 = _v55.termRef(0);
          ESLVal $204 = _v55.termRef(1);
          ESLVal $203 = _v55.termRef(2);
          
          {ESLVal l = $205;
          
          {ESLVal rs = $204;
          
          {ESLVal e = $203;
          
          return new ESLVal("Grab",l,rs,translateCases.apply(e));
        }
        }
        }
        }
      case "Probably": {ESLVal $202 = _v55.termRef(0);
          ESLVal $201 = _v55.termRef(1);
          ESLVal $200 = _v55.termRef(2);
          ESLVal $199 = _v55.termRef(3);
          ESLVal $198 = _v55.termRef(4);
          
          {ESLVal l = $202;
          
          {ESLVal p = $201;
          
          {ESLVal t = $200;
          
          {ESLVal e1 = $199;
          
          {ESLVal e2 = $198;
          
          return new ESLVal("Probably",l,translateCases.apply(p),t,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $197 = _v55.termRef(0);
          ESLVal $196 = _v55.termRef(1);
          
          {ESLVal l = $197;
          
          {ESLVal e = $196;
          
          return new ESLVal("Not",l,translateCases.apply(e));
        }
        }
        }
      case "Fold": {ESLVal $195 = _v55.termRef(0);
          ESLVal $194 = _v55.termRef(1);
          ESLVal $193 = _v55.termRef(2);
          
          {ESLVal l = $195;
          
          {ESLVal t = $194;
          
          {ESLVal e = $193;
          
          return new ESLVal("Fold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Unfold": {ESLVal $192 = _v55.termRef(0);
          ESLVal $191 = _v55.termRef(1);
          ESLVal $190 = _v55.termRef(2);
          
          {ESLVal l = $192;
          
          {ESLVal t = $191;
          
          {ESLVal e = $190;
          
          return new ESLVal("Unfold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Now": {ESLVal $189 = _v55.termRef(0);
          
          {ESLVal l = $189;
          
          return exp;
        }
        }
      case "Become": {ESLVal $188 = _v55.termRef(0);
          ESLVal $187 = _v55.termRef(1);
          
          {ESLVal l = $188;
          
          {ESLVal e = $187;
          
          return new ESLVal("Become",l,translateCases.apply(e));
        }
        }
        }
        default: {ESLVal x = _v55;
          
          return error(exp);
        }
      }
      }
    }
  });
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v54 = arm;
        
        switch(_v54.termName) {
        case "LArm": {ESLVal $186 = _v54.termRef(0);
          ESLVal $185 = _v54.termRef(1);
          ESLVal $184 = _v54.termRef(2);
          ESLVal $183 = _v54.termRef(3);
          ESLVal $182 = _v54.termRef(4);
          
          {ESLVal l = $186;
          
          {ESLVal ps = $185;
          
          {ESLVal bs = $184;
          
          {ESLVal g = $183;
          
          {ESLVal e = $182;
          
          return ps;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8262,8342)").add(ESLVal.list(_v54)));
      }
      }
    }
  });
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v53 = arm;
        
        switch(_v53.termName) {
        case "LArm": {ESLVal $181 = _v53.termRef(0);
          ESLVal $180 = _v53.termRef(1);
          ESLVal $179 = _v53.termRef(2);
          ESLVal $178 = _v53.termRef(3);
          ESLVal $177 = _v53.termRef(4);
          
          {ESLVal l = $181;
          
          {ESLVal ps = $180;
          
          {ESLVal bs = $179;
          
          {ESLVal g = $178;
          
          {ESLVal e = $177;
          
          return e;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8371,8450)").add(ESLVal.list(_v53)));
      }
      }
    }
  });
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v52 = arm;
        
        switch(_v52.termName) {
        case "LArm": {ESLVal $176 = _v52.termRef(0);
          ESLVal $175 = _v52.termRef(1);
          ESLVal $174 = _v52.termRef(2);
          ESLVal $173 = _v52.termRef(3);
          ESLVal $172 = _v52.termRef(4);
          
          {ESLVal l = $176;
          
          {ESLVal ps = $175;
          
          {ESLVal bs = $174;
          
          {ESLVal g = $173;
          
          {ESLVal e = $172;
          
          return g;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8480,8559)").add(ESLVal.list(_v52)));
      }
      }
    }
  });
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal e = $args[1];
  {ESLVal _v51 = arm;
        
        switch(_v51.termName) {
        case "LArm": {ESLVal $171 = _v51.termRef(0);
          ESLVal $170 = _v51.termRef(1);
          ESLVal $169 = _v51.termRef(2);
          ESLVal $168 = _v51.termRef(3);
          ESLVal $167 = _v51.termRef(4);
          
          {ESLVal l = $171;
          
          {ESLVal ps = $170;
          
          {ESLVal bs = $169;
          
          {ESLVal g = $168;
          
          {ESLVal old = $167;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8598,8695)").add(ESLVal.list(_v51)));
      }
      }
    }
  });
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal ps = $args[1];
  {ESLVal _v50 = arm;
        
        switch(_v50.termName) {
        case "LArm": {ESLVal $166 = _v50.termRef(0);
          ESLVal $165 = _v50.termRef(1);
          ESLVal $164 = _v50.termRef(2);
          ESLVal $163 = _v50.termRef(3);
          ESLVal $162 = _v50.termRef(4);
          
          {ESLVal l = $166;
          
          {ESLVal old = $165;
          
          {ESLVal bs = $164;
          
          {ESLVal g = $163;
          
          {ESLVal e = $162;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8745,8842)").add(ESLVal.list(_v50)));
      }
      }
    }
  });
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal newBS = $args[1];
  {ESLVal _v49 = arm;
        
        switch(_v49.termName) {
        case "LArm": {ESLVal $161 = _v49.termRef(0);
          ESLVal $160 = _v49.termRef(1);
          ESLVal $159 = _v49.termRef(2);
          ESLVal $158 = _v49.termRef(3);
          ESLVal $157 = _v49.termRef(4);
          
          {ESLVal l = $161;
          
          {ESLVal ps = $160;
          
          {ESLVal bs = $159;
          
          {ESLVal g = $158;
          
          {ESLVal e = $157;
          
          return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8893,8998)").add(ESLVal.list(_v49)));
      }
      }
    }
  });
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v48 = p;
        
        switch(_v48.termName) {
        case "PVar": {ESLVal $156 = _v48.termRef(0);
          ESLVal $155 = _v48.termRef(1);
          ESLVal $154 = _v48.termRef(2);
          
          {ESLVal l = $156;
          
          {ESLVal n = $155;
          
          {ESLVal t = $154;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v96 = _v48;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v47 = p;
        
        switch(_v47.termName) {
        case "PInt": {ESLVal $153 = _v47.termRef(0);
          ESLVal $152 = _v47.termRef(1);
          
          {ESLVal l = $153;
          
          {ESLVal n = $152;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v95 = _v47;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v46 = p;
        
        switch(_v46.termName) {
        case "PStr": {ESLVal $151 = _v46.termRef(0);
          ESLVal $150 = _v46.termRef(1);
          
          {ESLVal l = $151;
          
          {ESLVal n = $150;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v94 = _v46;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v45 = p;
        
        switch(_v45.termName) {
        case "PBool": {ESLVal $149 = _v45.termRef(0);
          ESLVal $148 = _v45.termRef(1);
          
          {ESLVal l = $149;
          
          {ESLVal b = $148;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v93 = _v45;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v44 = p;
        
        switch(_v44.termName) {
        case "PTerm": {ESLVal $147 = _v44.termRef(0);
          ESLVal $146 = _v44.termRef(1);
          ESLVal $145 = _v44.termRef(2);
          ESLVal $144 = _v44.termRef(3);
          
          {ESLVal l = $147;
          
          {ESLVal n = $146;
          
          {ESLVal ts = $145;
          
          {ESLVal ps = $144;
          
          return $true;
        }
        }
        }
        }
        }
        default: {ESLVal _v92 = _v44;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v43 = p;
        
        switch(_v43.termName) {
        case "PCons": {ESLVal $143 = _v43.termRef(0);
          ESLVal $142 = _v43.termRef(1);
          ESLVal $141 = _v43.termRef(2);
          
          {ESLVal l = $143;
          
          {ESLVal h = $142;
          
          {ESLVal t = $141;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v91 = _v43;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v42 = p;
        
        switch(_v42.termName) {
        case "PNil": {ESLVal $140 = _v42.termRef(0);
          
          {ESLVal l = $140;
          
          return $true;
        }
        }
      case "PApplyType": {ESLVal $138 = _v42.termRef(0);
          ESLVal $137 = _v42.termRef(1);
          ESLVal $136 = _v42.termRef(2);
          
          switch($137.termName) {
          case "PNil": {ESLVal $139 = $137.termRef(0);
            
            {ESLVal l1 = $138;
            
            {ESLVal l2 = $139;
            
            {ESLVal ts = $136;
            
            return $true;
          }
          }
          }
          }
          default: {ESLVal _v89 = _v42;
            
            return $false;
          }
        }
        }
        default: {ESLVal _v90 = _v42;
          
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
  {ESLVal _v41 = p;
        
        switch(_v41.termName) {
        case "PSetCons": {ESLVal $135 = _v41.termRef(0);
          ESLVal $134 = _v41.termRef(1);
          ESLVal $133 = _v41.termRef(2);
          
          {ESLVal l = $135;
          
          {ESLVal p1 = $134;
          
          {ESLVal p2 = $133;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v88 = _v41;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPEmptySet = new ESLVal(new Function(new ESLVal("isPEmptySet"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v40 = p;
        
        switch(_v40.termName) {
        case "PEmptySet": {ESLVal $132 = _v40.termRef(0);
          
          {ESLVal l = $132;
          
          return $true;
        }
        }
        default: {ESLVal _v87 = _v40;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPAdd = new ESLVal(new Function(new ESLVal("isPAdd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v39 = p;
        
        switch(_v39.termName) {
        case "PAdd": {ESLVal $131 = _v39.termRef(0);
          ESLVal $130 = _v39.termRef(1);
          ESLVal $129 = _v39.termRef(2);
          
          {ESLVal l = $131;
          
          {ESLVal p1 = $130;
          
          {ESLVal p2 = $129;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v86 = _v39;
          
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
  {ESLVal _v38 = p;
        
        switch(_v38.termName) {
        case "PTerm": {ESLVal $128 = _v38.termRef(0);
          ESLVal $127 = _v38.termRef(1);
          ESLVal $126 = _v38.termRef(2);
          ESLVal $125 = _v38.termRef(3);
          
          {ESLVal l = $128;
          
          {ESLVal n = $127;
          
          {ESLVal ts = $126;
          
          {ESLVal ps = $125;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10378,10446)").add(ESLVal.list(_v38)));
      }
      }
    }
  });
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v37 = p;
        
        switch(_v37.termName) {
        case "PTerm": {ESLVal $124 = _v37.termRef(0);
          ESLVal $123 = _v37.termRef(1);
          ESLVal $122 = _v37.termRef(2);
          ESLVal $121 = _v37.termRef(3);
          
          {ESLVal l = $124;
          
          {ESLVal n = $123;
          
          {ESLVal ts = $122;
          
          {ESLVal ps = $121;
          
          return ps;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10486,10555)").add(ESLVal.list(_v37)));
      }
      }
    }
  });
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v36 = p;
        
        switch(_v36.termName) {
        case "PVar": {ESLVal $120 = _v36.termRef(0);
          ESLVal $119 = _v36.termRef(1);
          ESLVal $118 = _v36.termRef(2);
          
          {ESLVal l = $120;
          
          {ESLVal n = $119;
          
          {ESLVal t = $118;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10588,10638)").add(ESLVal.list(_v36)));
      }
      }
    }
  });
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v35 = p;
        
        switch(_v35.termName) {
        case "PCons": {ESLVal $117 = _v35.termRef(0);
          ESLVal $116 = _v35.termRef(1);
          ESLVal $115 = _v35.termRef(2);
          
          {ESLVal l = $117;
          
          {ESLVal h = $116;
          
          {ESLVal t = $115;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10676,10734)").add(ESLVal.list(_v35)));
      }
      }
    }
  });
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v34 = p;
        
        switch(_v34.termName) {
        case "PCons": {ESLVal $114 = _v34.termRef(0);
          ESLVal $113 = _v34.termRef(1);
          ESLVal $112 = _v34.termRef(2);
          
          {ESLVal l = $114;
          
          {ESLVal h = $113;
          
          {ESLVal t = $112;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10772,10830)").add(ESLVal.list(_v34)));
      }
      }
    }
  });
  private static ESLVal pSetConsHead = new ESLVal(new Function(new ESLVal("pSetConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v33 = p;
        
        switch(_v33.termName) {
        case "PSetCons": {ESLVal $111 = _v33.termRef(0);
          ESLVal $110 = _v33.termRef(1);
          ESLVal $109 = _v33.termRef(2);
          
          {ESLVal l = $111;
          
          {ESLVal h = $110;
          
          {ESLVal t = $109;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10871,10932)").add(ESLVal.list(_v33)));
      }
      }
    }
  });
  private static ESLVal pSetConsTail = new ESLVal(new Function(new ESLVal("pSetConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v32 = p;
        
        switch(_v32.termName) {
        case "PSetCons": {ESLVal $108 = _v32.termRef(0);
          ESLVal $107 = _v32.termRef(1);
          ESLVal $106 = _v32.termRef(2);
          
          {ESLVal l = $108;
          
          {ESLVal h = $107;
          
          {ESLVal t = $106;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10973,11034)").add(ESLVal.list(_v32)));
      }
      }
    }
  });
  private static ESLVal pAddLeft = new ESLVal(new Function(new ESLVal("pAddLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v31 = p;
        
        switch(_v31.termName) {
        case "PAdd": {ESLVal $105 = _v31.termRef(0);
          ESLVal $104 = _v31.termRef(1);
          ESLVal $103 = _v31.termRef(2);
          
          {ESLVal l = $105;
          
          {ESLVal left = $104;
          
          {ESLVal right = $103;
          
          return left;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11070,11137)").add(ESLVal.list(_v31)));
      }
      }
    }
  });
  private static ESLVal pAddRight = new ESLVal(new Function(new ESLVal("pAddRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v30 = p;
        
        switch(_v30.termName) {
        case "PAdd": {ESLVal $102 = _v30.termRef(0);
          ESLVal $101 = _v30.termRef(1);
          ESLVal $100 = _v30.termRef(2);
          
          {ESLVal l = $102;
          
          {ESLVal left = $101;
          
          {ESLVal right = $100;
          
          return right;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11174,11242)").add(ESLVal.list(_v30)));
      }
      }
    }
  });
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v29 = p;
        
        switch(_v29.termName) {
        case "PInt": {ESLVal $99 = _v29.termRef(0);
          ESLVal $98 = _v29.termRef(1);
          
          {ESLVal l = $99;
          
          {ESLVal n = $98;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11276,11318)").add(ESLVal.list(_v29)));
      }
      }
    }
  });
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v28 = p;
        
        switch(_v28.termName) {
        case "PStr": {ESLVal $97 = _v28.termRef(0);
          ESLVal $96 = _v28.termRef(1);
          
          {ESLVal l = $97;
          
          {ESLVal n = $96;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11352,11394)").add(ESLVal.list(_v28)));
      }
      }
    }
  });
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v27 = p;
        
        switch(_v27.termName) {
        case "PBool": {ESLVal $95 = _v27.termRef(0);
          ESLVal $94 = _v27.termRef(1);
          
          {ESLVal l = $95;
          
          {ESLVal b = $94;
          
          return b;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11430,11475)").add(ESLVal.list(_v27)));
      }
      }
    }
  });
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1078"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1079"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1080"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1081"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1082"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1083"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1084"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1085"),getSelf()) {
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
  return map.apply(new ESLVal(new Function(new ESLVal("fun1086"),getSelf()) {
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
  return new ESLVal(new Function(new ESLVal("fun1087"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal arms = $args[0];
        LetRec letrec = new LetRec() {
              ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v81 = $args[0];
                ESLVal _v80 = $args[1];
                {ESLVal _v25 = _v81;
                      ESLVal _v24 = _v80;
                      
                      if(_v25.isCons())
                      {ESLVal $86 = _v25.head();
                        ESLVal $87 = _v25.tail();
                        
                        if(_v24.isCons())
                        {ESLVal $88 = _v24.head();
                          ESLVal $89 = _v24.tail();
                          
                          {ESLVal a = $86;
                          
                          {ESLVal _v82 = $87;
                          
                          {ESLVal v = $88;
                          
                          {ESLVal _v83 = $89;
                          
                          {ESLVal _v26 = e;
                          
                          switch(_v26.termName) {
                          case "Var": {ESLVal $93 = _v26.termRef(0);
                            ESLVal $92 = _v26.termRef(1);
                            
                            {ESLVal l = $93;
                            
                            {ESLVal n = $92;
                            
                            if(n.eql(v).boolVal)
                            return bind.apply(_v82,_v83).cons(a);
                            else
                              {ESLVal _v84 = _v26;
                                
                                return bind.apply(_v82,_v83).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v84))));
                              }
                          }
                          }
                          }
                          default: {ESLVal _v85 = _v26;
                            
                            return bind.apply(_v82,_v83).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v85))));
                          }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else if(_v24.isNil())
                        return error(new ESLVal("case error at Pos(13645,13955)").add(ESLVal.list(_v25,_v24)));
                      else return error(new ESLVal("case error at Pos(13645,13955)").add(ESLVal.list(_v25,_v24)));
                      }
                    else if(_v25.isNil())
                      if(_v24.isCons())
                        {ESLVal $90 = _v24.head();
                          ESLVal $91 = _v24.tail();
                          
                          return error(new ESLVal("case error at Pos(13645,13955)").add(ESLVal.list(_v25,_v24)));
                        }
                      else if(_v24.isNil())
                        return $nil;
                      else return error(new ESLVal("case error at Pos(13645,13955)").add(ESLVal.list(_v25,_v24)));
                    else return error(new ESLVal("case error at Pos(13645,13955)").add(ESLVal.list(_v25,_v24)));
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1088"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1089"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1090"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1091"),getSelf()) {
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
        {ESLVal _v23 = $qualArg;
              
              {ESLVal n = _v23;
              
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
        {ESLVal _v21 = $qualArg;
              
              {ESLVal n = _v21;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",loc0,n)));
            }
            }
          }
        }).map(names).flatten().flatten().add(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v22 = $qualArg;
              
              {ESLVal a = _v22;
              
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1092"),getSelf()) {
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
  {ESLVal _v20 = armss;
        
        if(_v20.isCons())
        {ESLVal $84 = _v20.head();
          ESLVal $85 = _v20.tail();
          
          {ESLVal as = $84;
          
          {ESLVal _v79 = $85;
          
          return createTArms.apply(l,_v79,es,alt).cons(new ESLVal("TArm",sharedCnstr.apply(as),cnstrArm.apply(l,head.apply(es),tail.apply(es),as,alt)));
        }
        }
        }
      else if(_v20.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(16316,16496)").add(ESLVal.list(_v20)));
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
        {ESLVal _v19 = $qualArg;
              
              {ESLVal a = _v19;
              
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
  {ESLVal consArms = filter.apply(new ESLVal(new Function(new ESLVal("fun1093"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms);
        ESLVal nilArms = map.apply(dropPattern,filter.apply(new ESLVal(new Function(new ESLVal("fun1094"),getSelf()) {
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
  {ESLVal _v18 = head.apply(armPatterns.apply(arm));
        
        switch(_v18.termName) {
        case "PEmptySet": {ESLVal $83 = _v18.termRef(0);
          
          {ESLVal pl = $83;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("emptyset")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PSetCons": {ESLVal $82 = _v18.termRef(0);
          ESLVal $81 = _v18.termRef(1);
          ESLVal $80 = _v18.termRef(2);
          
          {ESLVal pl = $82;
          
          {ESLVal p1 = $81;
          
          {ESLVal p2 = $80;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setcons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeSetCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $79 = _v18.termRef(0);
          ESLVal $78 = _v18.termRef(1);
          ESLVal $77 = _v18.termRef(2);
          
          {ESLVal pl = $79;
          
          {ESLVal p1 = $78;
          
          {ESLVal p2 = $77;
          
          {ESLVal fail = newVar.apply();
          ESLVal left = newVar.apply();
          ESLVal right = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$add"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setadd")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(explodeAdd.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17441,18562)").add(ESLVal.list(_v18)));
      }
      }
    }
  });
  private static ESLVal processNonDetListArms = new ESLVal(new Function(new ESLVal("processNonDetListArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arm = $args[2];
  {ESLVal _v17 = head.apply(armPatterns.apply(arm));
        
        switch(_v17.termName) {
        case "PNil": {ESLVal $76 = _v17.termRef(0);
          
          {ESLVal pl = $76;
          
          {ESLVal fail = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$empty"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("nil")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,es,ESLVal.list(dropPattern.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
      case "PCons": {ESLVal $75 = _v17.termRef(0);
          ESLVal $74 = _v17.termRef(1);
          ESLVal $73 = _v17.termRef(2);
          
          {ESLVal pl = $75;
          
          {ESLVal p1 = $74;
          
          {ESLVal p2 = $73;
          
          {ESLVal fail = newVar.apply();
          ESLVal element = newVar.apply();
          ESLVal rest = newVar.apply();
          
          return new ESLVal("Term",l,new ESLVal("$cons"),ESLVal.list(),ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("cons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase.apply(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeCons.apply(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),ESLVal.list())))));
        }
        }
        }
        }
        }
      case "PAdd": {ESLVal $50 = _v17.termRef(0);
          ESLVal $49 = _v17.termRef(1);
          ESLVal $48 = _v17.termRef(2);
          
          switch($49.termName) {
          case "PCons": {ESLVal $71 = $49.termRef(0);
            ESLVal $70 = $49.termRef(1);
            ESLVal $69 = $49.termRef(2);
            
            switch($69.termName) {
            case "PNil": {ESLVal $72 = $69.termRef(0);
              
              {ESLVal l1 = $50;
              
              {ESLVal l2 = $71;
              
              {ESLVal p1 = $70;
              
              {ESLVal l3 = $72;
              
              {ESLVal p2 = $48;
              
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
            default: switch($48.termName) {
              case "PCons": {ESLVal $60 = $48.termRef(0);
                ESLVal $59 = $48.termRef(1);
                ESLVal $58 = $48.termRef(2);
                
                switch($58.termName) {
                case "PNil": {ESLVal $61 = $58.termRef(0);
                  
                  {ESLVal l1 = $50;
                  
                  {ESLVal p1 = $49;
                  
                  {ESLVal l2 = $60;
                  
                  {ESLVal p2 = $59;
                  
                  {ESLVal l3 = $61;
                  
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
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
              }
            case "PAdd": {ESLVal $53 = $48.termRef(0);
                ESLVal $52 = $48.termRef(1);
                ESLVal $51 = $48.termRef(2);
                
                switch($52.termName) {
                case "PCons": {ESLVal $56 = $52.termRef(0);
                  ESLVal $55 = $52.termRef(1);
                  ESLVal $54 = $52.termRef(2);
                  
                  switch($54.termName) {
                  case "PNil": {ESLVal $57 = $54.termRef(0);
                    
                    {ESLVal l1 = $50;
                    
                    {ESLVal p1 = $49;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal l3 = $56;
                    
                    {ESLVal p2 = $55;
                    
                    {ESLVal l4 = $57;
                    
                    {ESLVal p3 = $51;
                    
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
                  default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
            }
          }
          }
        case "PAdd": {ESLVal $64 = $49.termRef(0);
            ESLVal $63 = $49.termRef(1);
            ESLVal $62 = $49.termRef(2);
            
            switch($62.termName) {
            case "PCons": {ESLVal $67 = $62.termRef(0);
              ESLVal $66 = $62.termRef(1);
              ESLVal $65 = $62.termRef(2);
              
              switch($65.termName) {
              case "PNil": {ESLVal $68 = $65.termRef(0);
                
                {ESLVal l1 = $50;
                
                {ESLVal l2 = $64;
                
                {ESLVal p1 = $63;
                
                {ESLVal l3 = $67;
                
                {ESLVal p2 = $66;
                
                {ESLVal l4 = $68;
                
                {ESLVal p3 = $48;
                
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
              default: switch($48.termName) {
                case "PCons": {ESLVal $60 = $48.termRef(0);
                  ESLVal $59 = $48.termRef(1);
                  ESLVal $58 = $48.termRef(2);
                  
                  switch($58.termName) {
                  case "PNil": {ESLVal $61 = $58.termRef(0);
                    
                    {ESLVal l1 = $50;
                    
                    {ESLVal p1 = $49;
                    
                    {ESLVal l2 = $60;
                    
                    {ESLVal p2 = $59;
                    
                    {ESLVal l3 = $61;
                    
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
                  default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
                }
                }
              case "PAdd": {ESLVal $53 = $48.termRef(0);
                  ESLVal $52 = $48.termRef(1);
                  ESLVal $51 = $48.termRef(2);
                  
                  switch($52.termName) {
                  case "PCons": {ESLVal $56 = $52.termRef(0);
                    ESLVal $55 = $52.termRef(1);
                    ESLVal $54 = $52.termRef(2);
                    
                    switch($54.termName) {
                    case "PNil": {ESLVal $57 = $54.termRef(0);
                      
                      {ESLVal l1 = $50;
                      
                      {ESLVal p1 = $49;
                      
                      {ESLVal l2 = $53;
                      
                      {ESLVal l3 = $56;
                      
                      {ESLVal p2 = $55;
                      
                      {ESLVal l4 = $57;
                      
                      {ESLVal p3 = $51;
                      
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
                    default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
            }
            }
            default: switch($48.termName) {
              case "PCons": {ESLVal $60 = $48.termRef(0);
                ESLVal $59 = $48.termRef(1);
                ESLVal $58 = $48.termRef(2);
                
                switch($58.termName) {
                case "PNil": {ESLVal $61 = $58.termRef(0);
                  
                  {ESLVal l1 = $50;
                  
                  {ESLVal p1 = $49;
                  
                  {ESLVal l2 = $60;
                  
                  {ESLVal p2 = $59;
                  
                  {ESLVal l3 = $61;
                  
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
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
              }
            case "PAdd": {ESLVal $53 = $48.termRef(0);
                ESLVal $52 = $48.termRef(1);
                ESLVal $51 = $48.termRef(2);
                
                switch($52.termName) {
                case "PCons": {ESLVal $56 = $52.termRef(0);
                  ESLVal $55 = $52.termRef(1);
                  ESLVal $54 = $52.termRef(2);
                  
                  switch($54.termName) {
                  case "PNil": {ESLVal $57 = $54.termRef(0);
                    
                    {ESLVal l1 = $50;
                    
                    {ESLVal p1 = $49;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal l3 = $56;
                    
                    {ESLVal p2 = $55;
                    
                    {ESLVal l4 = $57;
                    
                    {ESLVal p3 = $51;
                    
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
                  default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
            }
          }
          }
          default: switch($48.termName) {
            case "PCons": {ESLVal $60 = $48.termRef(0);
              ESLVal $59 = $48.termRef(1);
              ESLVal $58 = $48.termRef(2);
              
              switch($58.termName) {
              case "PNil": {ESLVal $61 = $58.termRef(0);
                
                {ESLVal l1 = $50;
                
                {ESLVal p1 = $49;
                
                {ESLVal l2 = $60;
                
                {ESLVal p2 = $59;
                
                {ESLVal l3 = $61;
                
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
              default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
            }
            }
          case "PAdd": {ESLVal $53 = $48.termRef(0);
              ESLVal $52 = $48.termRef(1);
              ESLVal $51 = $48.termRef(2);
              
              switch($52.termName) {
              case "PCons": {ESLVal $56 = $52.termRef(0);
                ESLVal $55 = $52.termRef(1);
                ESLVal $54 = $52.termRef(2);
                
                switch($54.termName) {
                case "PNil": {ESLVal $57 = $54.termRef(0);
                  
                  {ESLVal l1 = $50;
                  
                  {ESLVal p1 = $49;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal l3 = $56;
                  
                  {ESLVal p2 = $55;
                  
                  {ESLVal l4 = $57;
                  
                  {ESLVal p3 = $51;
                  
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
                default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(18624,21442)").add(ESLVal.list(_v17)));
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1095"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return intArms.apply(c,arms);
            }
          }),ints);
        
        return new ESLVal("CaseInt",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v15 = $qualArg;
              
              {ESLVal as = _v15;
              
              return ESLVal.list(ESLVal.list(new ESLVal("IArm",sharedInt.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v78 = $args[0];
              {ESLVal _v16 = _v78;
                    
                    {ESLVal a = _v16;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1096"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return strArms.apply(c,arms);
            }
          }),strs);
        
        return new ESLVal("CaseStr",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v13 = $qualArg;
              
              {ESLVal as = _v13;
              
              return ESLVal.list(ESLVal.list(new ESLVal("SArm",sharedStr.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v77 = $args[0];
              {ESLVal _v14 = _v77;
                    
                    {ESLVal a = _v14;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1097"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return boolArms.apply(c,arms);
            }
          }),bools);
        
        return new ESLVal("CaseBool",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v11 = $qualArg;
              
              {ESLVal as = _v11;
              
              return ESLVal.list(ESLVal.list(new ESLVal("BoolArm",sharedBool.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v76 = $args[0];
              {ESLVal _v12 = _v76;
                    
                    {ESLVal a = _v12;
                    
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
        {ESLVal _v10 = $qualArg;
              
              {ESLVal a = _v10;
              
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
        {ESLVal _v9 = $qualArg;
              
              {ESLVal a = _v9;
              
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1098"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1099"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1100"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1101"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1102"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPAdd.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1103"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1104"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPSet.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1105"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1106"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1107"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1108"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1109"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1110"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1111"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1112"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1113"),getSelf()) {
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
        
        {ESLVal nonVarPatterns = filter.apply(new ESLVal(new Function(new ESLVal("fun1114"),getSelf()) {
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
  {ESLVal _v8 = arms;
        
        if(_v8.isCons())
        {ESLVal $39 = _v8.head();
          ESLVal $40 = _v8.tail();
          
          switch($39.termName) {
          case "LArm": {ESLVal $45 = $39.termRef(0);
            ESLVal $44 = $39.termRef(1);
            ESLVal $43 = $39.termRef(2);
            ESLVal $42 = $39.termRef(3);
            ESLVal $41 = $39.termRef(4);
            
            if($44.isCons())
            {ESLVal $46 = $44.head();
              ESLVal $47 = $44.tail();
              
              return error(new ESLVal("case error at Pos(27241,27397)").add(ESLVal.list(_v8)));
            }
          else if($44.isNil())
            {ESLVal al = $45;
              
              {ESLVal bs = $43;
              
              {ESLVal g = $42;
              
              {ESLVal e = $41;
              
              {ESLVal _v75 = $40;
              
              return foldArm.apply(al,bs,g,e,foldArms.apply(l,_v75,alt));
            }
            }
            }
            }
            }
          else return error(new ESLVal("case error at Pos(27241,27397)").add(ESLVal.list(_v8)));
          }
          default: return error(new ESLVal("case error at Pos(27241,27397)").add(ESLVal.list(_v8)));
        }
        }
      else if(_v8.isNil())
        return alt;
      else return error(new ESLVal("case error at Pos(27241,27397)").add(ESLVal.list(_v8)));
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
  {ESLVal _v6 = bss;
        
        if(_v6.isCons())
        {ESLVal $35 = _v6.head();
          ESLVal $36 = _v6.tail();
          
          {ESLVal bs = $35;
          
          {ESLVal _v72 = $36;
          
          return new ESLVal("Let",l,bs,foldArm.apply(l,_v72,g,e,alt));
        }
        }
        }
      else if(_v6.isNil())
        {ESLVal _v7 = g;
          
          switch(_v7.termName) {
          case "BoolExp": {ESLVal $38 = _v7.termRef(0);
            ESLVal $37 = _v7.termRef(1);
            
            switch($37.boolVal ? 1 : 0) {
            case 1: {ESLVal bl = $38;
              
              return e;
            }
            default: {ESLVal _v73 = _v7;
              
              return new ESLVal("If",l,_v73,e,alt);
            }
          }
          }
          default: {ESLVal _v74 = _v7;
            
            return new ESLVal("If",l,_v74,e,alt);
          }
        }
        }
      else return error(new ESLVal("case error at Pos(27462,27662)").add(ESLVal.list(_v6)));
      }
    }
  });
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v5 = q;
        
        switch(_v5.termName) {
        case "BQual": {ESLVal $34 = _v5.termRef(0);
          ESLVal $33 = _v5.termRef(1);
          ESLVal $32 = _v5.termRef(2);
          
          {ESLVal l = $34;
          
          {ESLVal p = $33;
          
          {ESLVal e = $32;
          
          return new ESLVal("BQual",l,p,translateCases.apply(e));
        }
        }
        }
        }
      case "PQual": {ESLVal $31 = _v5.termRef(0);
          ESLVal $30 = _v5.termRef(1);
          
          {ESLVal l = $31;
          
          {ESLVal p = $30;
          
          return new ESLVal("PQual",l,translateCases.apply(p));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(27714,27851)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v4 = a;
        
        switch(_v4.termName) {
        case "LArm": {ESLVal $29 = _v4.termRef(0);
          ESLVal $28 = _v4.termRef(1);
          ESLVal $27 = _v4.termRef(2);
          ESLVal $26 = _v4.termRef(3);
          ESLVal $25 = _v4.termRef(4);
          
          {ESLVal l = $29;
          
          {ESLVal ps = $28;
          
          {ESLVal bs = $27;
          
          {ESLVal guard = $26;
          
          {ESLVal e = $25;
          
          return new ESLVal("LArm",l,ps,bs,translateCases.apply(guard),translateCases.apply(e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(27890,28023)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v3 = b;
        
        switch(_v3.termName) {
        case "Binding": {ESLVal $24 = _v3.termRef(0);
          ESLVal $23 = _v3.termRef(1);
          ESLVal $22 = _v3.termRef(2);
          ESLVal $21 = _v3.termRef(3);
          ESLVal $20 = _v3.termRef(4);
          
          {ESLVal l = $24;
          
          {ESLVal name = $23;
          
          {ESLVal t = $22;
          
          {ESLVal st = $21;
          
          {ESLVal value = $20;
          
          return new ESLVal("Binding",l,name,t,st,translateCases.apply(value));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $19 = _v3.termRef(0);
          ESLVal $18 = _v3.termRef(1);
          ESLVal $17 = _v3.termRef(2);
          ESLVal $16 = _v3.termRef(3);
          
          {ESLVal l = $19;
          
          {ESLVal name = $18;
          
          {ESLVal t = $17;
          
          {ESLVal ignore = $16;
          
          return b;
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $15 = _v3.termRef(0);
          ESLVal $14 = _v3.termRef(1);
          ESLVal $13 = _v3.termRef(2);
          ESLVal $12 = _v3.termRef(3);
          
          {ESLVal l = $15;
          
          {ESLVal name = $14;
          
          {ESLVal t = $13;
          
          {ESLVal ignore = $12;
          
          return b;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $11 = _v3.termRef(0);
          ESLVal $10 = _v3.termRef(1);
          ESLVal $9 = _v3.termRef(2);
          ESLVal $8 = _v3.termRef(3);
          ESLVal $7 = _v3.termRef(4);
          ESLVal $6 = _v3.termRef(5);
          ESLVal $5 = _v3.termRef(6);
          
          {ESLVal l = $11;
          
          {ESLVal n = $10;
          
          {ESLVal args = $9;
          
          {ESLVal t = $8;
          
          {ESLVal st = $7;
          
          {ESLVal body = $6;
          
          {ESLVal guard = $5;
          
          return new ESLVal("FunBind",l,n,args,t,st,translateCases.apply(body),translateCases.apply(guard));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $4 = _v3.termRef(0);
          ESLVal $3 = _v3.termRef(1);
          ESLVal $2 = _v3.termRef(2);
          ESLVal $1 = _v3.termRef(3);
          
          {ESLVal l = $4;
          
          {ESLVal name = $3;
          
          {ESLVal t = $2;
          
          {ESLVal ignore = $1;
          
          return b;
        }
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
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
                  {ESLVal _v1 = $x;
              
              {ESLVal x = _v1;
              
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