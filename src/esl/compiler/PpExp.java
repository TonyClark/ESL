package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.DynamicVars.*;
import static esl.compiler.Strings.*;
import java.util.function.Supplier;
public class PpExp {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal p0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal indentStr = new ESLVal(new Function(new ESLVal("indentStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  if(indent.eql($zero).boolVal)
        return new ESLVal("");
        else
          return new ESLVal(" ").add(indentStr.apply(indent.sub($one)));
    }
  });
  private static ESLVal nl = new ESLVal(new Function(new ESLVal("nl"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  return new ESLVal("\n").add(indentStr.apply(indent));
    }
  });
  private static ESLVal ppJoin = new ESLVal(new Function(new ESLVal("ppJoin"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal ss = $args[1];
  {ESLVal _v46 = ss;
        
        if(_v46.isCons())
        {ESLVal $453 = _v46.head();
          ESLVal $454 = _v46.tail();
          
          if($454.isCons())
          {ESLVal $455 = $454.head();
            ESLVal $456 = $454.tail();
            
            if($456.isCons())
            {ESLVal $457 = $456.head();
              ESLVal $458 = $456.tail();
              
              {ESLVal s = $453;
              
              {ESLVal _v110 = $454;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v110)));
            }
            }
            }
          else if($456.isNil())
            {ESLVal s1 = $453;
              
              {ESLVal s2 = $455;
              
              return s1.add(nl.apply(indent).add(s2));
            }
            }
          else {ESLVal s = $453;
              
              {ESLVal _v111 = $454;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v111)));
            }
            }
          }
        else if($454.isNil())
          {ESLVal s = $453;
            
            return s;
          }
        else {ESLVal s = $453;
            
            {ESLVal _v112 = $454;
            
            return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v112)));
          }
          }
        }
      else if(_v46.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(440,598)").add(ESLVal.list(_v46)));
      }
    }
  });
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v44 = env;
        while(_v44.isCons()) {
          ESLVal _v43 = _v44.headVal;
          {ESLVal _v42 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v45 = _v43;
                    
                    switch(_v45.termName) {
                    case "Map": {ESLVal $452 = _v45.termRef(0);
                      ESLVal $451 = _v45.termRef(1);
                      
                      {ESLVal n = $452;
                      
                      {ESLVal t = $451;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v45;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v42.apply();
          }
          _v44 = _v44.tailVal;}
      }
      return s[0].add(new ESLVal("]"));}
      }
    }
  });
  public static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  return map.apply(ppType,ts);
    }
  });
  public static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v41 = t;
        
        switch(_v41.termName) {
        case "ActType": {ESLVal $450 = _v41.termRef(0);
          ESLVal $449 = _v41.termRef(1);
          ESLVal $448 = _v41.termRef(2);
          
          {ESLVal l = $450;
          
          {ESLVal decs = $449;
          
          {ESLVal handlers = $448;
          
          return new ESLVal("").add(t);
        }
        }
        }
        }
      case "ApplyType": {ESLVal $447 = _v41.termRef(0);
          ESLVal $446 = _v41.termRef(1);
          ESLVal $445 = _v41.termRef(2);
          
          {ESLVal l = $447;
          
          {ESLVal n = $446;
          
          {ESLVal args = $445;
          
          return n.add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $444 = _v41.termRef(0);
          ESLVal $443 = _v41.termRef(1);
          ESLVal $442 = _v41.termRef(2);
          
          {ESLVal l = $444;
          
          {ESLVal op = $443;
          
          {ESLVal args = $442;
          
          return ppType.apply(op).add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $441 = _v41.termRef(0);
          ESLVal $440 = _v41.termRef(1);
          
          {ESLVal l = $441;
          
          {ESLVal _v109 = $440;
          
          return new ESLVal("Array[").add(ppType.apply(_v109).add(new ESLVal("]")));
        }
        }
        }
      case "BoolType": {ESLVal $439 = _v41.termRef(0);
          
          {ESLVal l = $439;
          
          return new ESLVal("Bool");
        }
        }
      case "FloatType": {ESLVal $438 = _v41.termRef(0);
          
          {ESLVal l = $438;
          
          return new ESLVal("Float");
        }
        }
      case "FieldType": {ESLVal $437 = _v41.termRef(0);
          ESLVal $436 = _v41.termRef(1);
          ESLVal $435 = _v41.termRef(2);
          
          {ESLVal l = $437;
          
          {ESLVal n = $436;
          
          {ESLVal _v108 = $435;
          
          return n.add(new ESLVal("::").add(ppType.apply(_v108)));
        }
        }
        }
        }
      case "ForallType": {ESLVal $434 = _v41.termRef(0);
          ESLVal $433 = _v41.termRef(1);
          ESLVal $432 = _v41.termRef(2);
          
          {ESLVal l = $434;
          
          {ESLVal ns = $433;
          
          {ESLVal _v107 = $432;
          
          return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v107))));
        }
        }
        }
        }
      case "FunType": {ESLVal $431 = _v41.termRef(0);
          ESLVal $430 = _v41.termRef(1);
          ESLVal $429 = _v41.termRef(2);
          
          {ESLVal l = $431;
          
          {ESLVal d = $430;
          
          {ESLVal r = $429;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $428 = _v41.termRef(0);
          ESLVal $427 = _v41.termRef(1);
          ESLVal $426 = _v41.termRef(2);
          ESLVal $425 = _v41.termRef(3);
          
          {ESLVal l = $428;
          
          {ESLVal d = $427;
          
          {ESLVal p = $426;
          
          {ESLVal r = $425;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $424 = _v41.termRef(0);
          
          {ESLVal l = $424;
          
          return new ESLVal("Int");
        }
        }
      case "ListType": {ESLVal $423 = _v41.termRef(0);
          ESLVal $422 = _v41.termRef(1);
          
          {ESLVal l = $423;
          
          {ESLVal _v106 = $422;
          
          return new ESLVal("[").add(ppType.apply(_v106).add(new ESLVal("]")));
        }
        }
        }
      case "NullType": {ESLVal $421 = _v41.termRef(0);
          
          {ESLVal l = $421;
          
          return new ESLVal("Null");
        }
        }
      case "RecType": {ESLVal $420 = _v41.termRef(0);
          ESLVal $419 = _v41.termRef(1);
          ESLVal $418 = _v41.termRef(2);
          
          {ESLVal l = $420;
          
          {ESLVal n = $419;
          
          {ESLVal _v105 = $418;
          
          return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v105))));
        }
        }
        }
        }
      case "RecordType": {ESLVal $417 = _v41.termRef(0);
          ESLVal $416 = _v41.termRef(1);
          
          {ESLVal l = $417;
          
          {ESLVal fs = $416;
          
          return new ESLVal("{").add(ppTypes.apply(fs).add(new ESLVal("}")));
        }
        }
        }
      case "StrType": {ESLVal $415 = _v41.termRef(0);
          
          {ESLVal l = $415;
          
          return new ESLVal("Str");
        }
        }
      case "TableType": {ESLVal $414 = _v41.termRef(0);
          ESLVal $413 = _v41.termRef(1);
          ESLVal $412 = _v41.termRef(2);
          
          {ESLVal l = $414;
          
          {ESLVal k = $413;
          
          {ESLVal v = $412;
          
          return new ESLVal("Hash[").add(ppType.apply(k).add(new ESLVal(",").add(ppType.apply(v).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "TermType": {ESLVal $411 = _v41.termRef(0);
          ESLVal $410 = _v41.termRef(1);
          ESLVal $409 = _v41.termRef(2);
          
          {ESLVal l = $411;
          
          {ESLVal n = $410;
          
          {ESLVal ts = $409;
          
          return n.add(map.apply(ppType,ts));
        }
        }
        }
        }
      case "TypeFun": {ESLVal $408 = _v41.termRef(0);
          ESLVal $407 = _v41.termRef(1);
          ESLVal $406 = _v41.termRef(2);
          
          {ESLVal l = $408;
          
          {ESLVal ns = $407;
          
          {ESLVal _v104 = $406;
          
          return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v104))));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $405 = _v41.termRef(0);
          ESLVal $404 = _v41.termRef(1);
          
          {ESLVal l = $405;
          
          {ESLVal _v103 = $404;
          
          return new ESLVal("unfold ").add(ppType.apply(_v103));
        }
        }
        }
      case "UnionType": {ESLVal $403 = _v41.termRef(0);
          ESLVal $402 = _v41.termRef(1);
          
          {ESLVal l = $403;
          
          {ESLVal ts = $402;
          
          return new ESLVal("union ").add(map.apply(ppType,ts));
        }
        }
        }
      case "VarType": {ESLVal $401 = _v41.termRef(0);
          ESLVal $400 = _v41.termRef(1);
          
          {ESLVal l = $401;
          
          {ESLVal n = $400;
          
          return n;
        }
        }
        }
      case "VoidType": {ESLVal $399 = _v41.termRef(0);
          
          {ESLVal l = $399;
          
          return new ESLVal("Void");
        }
        }
      case "UnionRef": {ESLVal $398 = _v41.termRef(0);
          ESLVal $397 = _v41.termRef(1);
          ESLVal $396 = _v41.termRef(2);
          
          {ESLVal l = $398;
          
          {ESLVal _v102 = $397;
          
          {ESLVal n = $396;
          
          return ppType.apply(_v102).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $395 = _v41.termRef(0);
          
          {ESLVal f = $395;
          
          return f.add(new ESLVal(""));
        }
        }
        default: {ESLVal x = _v41;
          
          return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
        }
      }
      }
    }
  });
  public static ESLVal ppExps = new ESLVal(new Function(new ESLVal("ppExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exps = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v40 = exps;
        
        if(_v40.isCons())
        {ESLVal $391 = _v40.head();
          ESLVal $392 = _v40.tail();
          
          if($392.isCons())
          {ESLVal $393 = $392.head();
            ESLVal $394 = $392.tail();
            
            {ESLVal e1 = $391;
            
            {ESLVal e2 = $393;
            
            {ESLVal es = $394;
            
            return ppExp.apply(indent,e1).add(sep.add(ppExps.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($392.isNil())
          {ESLVal e = $391;
            
            return ppExp.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(2420,2578)").add(ESLVal.list(_v40)));
        }
      else if(_v40.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(2420,2578)").add(ESLVal.list(_v40)));
      }
    }
  });
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v39 = p;
        
        switch(_v39.termName) {
        case "PVar": {ESLVal $390 = _v39.termRef(0);
          ESLVal $389 = _v39.termRef(1);
          ESLVal $388 = _v39.termRef(2);
          
          {ESLVal l = $390;
          
          {ESLVal n = $389;
          
          {ESLVal t = $388;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $385 = _v39.termRef(0);
          ESLVal $384 = _v39.termRef(1);
          ESLVal $383 = _v39.termRef(2);
          ESLVal $382 = _v39.termRef(3);
          
          if($383.isCons())
          {ESLVal $386 = $383.head();
            ESLVal $387 = $383.tail();
            
            {ESLVal l = $385;
            
            {ESLVal n = $384;
            
            {ESLVal ts = $383;
            
            {ESLVal ps = $382;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
          }
        else if($383.isNil())
          {ESLVal l = $385;
            
            {ESLVal n = $384;
            
            {ESLVal ps = $382;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $385;
            
            {ESLVal n = $384;
            
            {ESLVal ts = $383;
            
            {ESLVal ps = $382;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $381 = _v39.termRef(0);
          ESLVal $380 = _v39.termRef(1);
          ESLVal $379 = _v39.termRef(2);
          
          {ESLVal l = $381;
          
          {ESLVal _v100 = $380;
          
          {ESLVal ts = $379;
          
          return ppPattern.apply(_v100);
        }
        }
        }
        }
      case "PNil": {ESLVal $378 = _v39.termRef(0);
          
          {ESLVal l = $378;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $377 = _v39.termRef(0);
          ESLVal $376 = _v39.termRef(1);
          
          {ESLVal l = $377;
          
          {ESLVal n = $376;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $375 = _v39.termRef(0);
          ESLVal $374 = _v39.termRef(1);
          
          {ESLVal l = $375;
          
          {ESLVal b = $374;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $373 = _v39.termRef(0);
          ESLVal $372 = _v39.termRef(1);
          
          {ESLVal l = $373;
          
          {ESLVal s = $372;
          
          return new ESLVal("\'").add(s.add(new ESLVal("\'")));
        }
        }
        }
      case "PCons": {ESLVal $371 = _v39.termRef(0);
          ESLVal $370 = _v39.termRef(1);
          ESLVal $369 = _v39.termRef(2);
          
          {ESLVal l = $371;
          
          {ESLVal h = $370;
          
          {ESLVal t = $369;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v101 = _v39;
          
          return new ESLVal("<unknown: ").add(_v101.add(new ESLVal(">")));
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
  public static ESLVal ppExp = new ESLVal(new Function(new ESLVal("ppExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exp = $args[1];
  {ESLVal _v38 = exp;
        
        switch(_v38.termName) {
        case "Module": {ESLVal $368 = _v38.termRef(0);
          ESLVal $367 = _v38.termRef(1);
          ESLVal $366 = _v38.termRef(2);
          ESLVal $365 = _v38.termRef(3);
          ESLVal $364 = _v38.termRef(4);
          ESLVal $363 = _v38.termRef(5);
          ESLVal $362 = _v38.termRef(6);
          
          {ESLVal path = $368;
          
          {ESLVal name = $367;
          
          {ESLVal exports = $366;
          
          {ESLVal imports = $365;
          
          {ESLVal x = $364;
          
          {ESLVal y = $363;
          
          {ESLVal defs = $362;
          
          return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(2)),defs).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "Var": {ESLVal $361 = _v38.termRef(0);
          ESLVal $360 = _v38.termRef(1);
          
          {ESLVal l = $361;
          
          {ESLVal n = $360;
          
          return n;
        }
        }
        }
      case "StrExp": {ESLVal $359 = _v38.termRef(0);
          ESLVal $358 = _v38.termRef(1);
          
          {ESLVal l = $359;
          
          {ESLVal v = $358;
          
          return new ESLVal("\'").add(v.add(new ESLVal("\'")));
        }
        }
        }
      case "IntExp": {ESLVal $357 = _v38.termRef(0);
          ESLVal $356 = _v38.termRef(1);
          
          {ESLVal l = $357;
          
          {ESLVal v = $356;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "BoolExp": {ESLVal $355 = _v38.termRef(0);
          ESLVal $354 = _v38.termRef(1);
          
          {ESLVal l = $355;
          
          {ESLVal v = $354;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "NullExp": {ESLVal $353 = _v38.termRef(0);
          
          {ESLVal l = $353;
          
          return new ESLVal("null");
        }
        }
      case "FloatExp": {ESLVal $352 = _v38.termRef(0);
          ESLVal $351 = _v38.termRef(1);
          
          {ESLVal l = $352;
          
          {ESLVal f = $351;
          
          return f.add(new ESLVal(""));
        }
        }
        }
      case "Apply": {ESLVal $350 = _v38.termRef(0);
          ESLVal $349 = _v38.termRef(1);
          ESLVal $348 = _v38.termRef(2);
          
          {ESLVal l = $350;
          
          {ESLVal op = $349;
          
          {ESLVal args = $348;
          
          return ppExp.apply(indent,op).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $347 = _v38.termRef(0);
          ESLVal $346 = _v38.termRef(1);
          ESLVal $345 = _v38.termRef(2);
          
          {ESLVal l = $347;
          
          {ESLVal op = $346;
          
          {ESLVal args = $345;
          
          return ppExp.apply(indent,op);
        }
        }
        }
        }
      case "Block": {ESLVal $344 = _v38.termRef(0);
          ESLVal $343 = _v38.termRef(1);
          
          {ESLVal l = $344;
          
          {ESLVal es = $343;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppExps.apply(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl.apply(indent).add(new ESLVal("}")))));
        }
        }
        }
      case "Case": {ESLVal $342 = _v38.termRef(0);
          ESLVal $341 = _v38.termRef(1);
          ESLVal $340 = _v38.termRef(2);
          ESLVal $339 = _v38.termRef(3);
          
          {ESLVal l = $342;
          
          {ESLVal ds = $341;
          
          {ESLVal es = $340;
          
          {ESLVal as = $339;
          
          return new ESLVal("case ").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3391"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $338 = _v38.termRef(0);
          ESLVal $337 = _v38.termRef(1);
          ESLVal $336 = _v38.termRef(2);
          ESLVal $335 = _v38.termRef(3);
          
          {ESLVal l = $338;
          
          {ESLVal e = $337;
          
          {ESLVal arms = $336;
          
          {ESLVal alt = $335;
          
          return new ESLVal("caseTerm ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3392"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseTermArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $334 = _v38.termRef(0);
          ESLVal $333 = _v38.termRef(1);
          ESLVal $332 = _v38.termRef(2);
          ESLVal $331 = _v38.termRef(3);
          ESLVal $330 = _v38.termRef(4);
          
          {ESLVal l = $334;
          
          {ESLVal e = $333;
          
          {ESLVal cons = $332;
          
          {ESLVal nil = $331;
          
          {ESLVal alt = $330;
          
          return new ESLVal("caseList ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),cons).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),nil).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))))))))));
        }
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $329 = _v38.termRef(0);
          ESLVal $328 = _v38.termRef(1);
          ESLVal $327 = _v38.termRef(2);
          ESLVal $326 = _v38.termRef(3);
          
          {ESLVal l = $329;
          
          {ESLVal e = $328;
          
          {ESLVal arms = $327;
          
          {ESLVal alt = $326;
          
          return new ESLVal("caseInt ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3393"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseIntsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $325 = _v38.termRef(0);
          ESLVal $324 = _v38.termRef(1);
          ESLVal $323 = _v38.termRef(2);
          ESLVal $322 = _v38.termRef(3);
          
          {ESLVal l = $325;
          
          {ESLVal e = $324;
          
          {ESLVal arms = $323;
          
          {ESLVal alt = $322;
          
          return new ESLVal("caseStr ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3394"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseStrsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $321 = _v38.termRef(0);
          ESLVal $320 = _v38.termRef(1);
          ESLVal $319 = _v38.termRef(2);
          ESLVal $318 = _v38.termRef(3);
          
          {ESLVal l = $321;
          
          {ESLVal e = $320;
          
          {ESLVal arms = $319;
          
          {ESLVal alt = $318;
          
          return new ESLVal("caseBool ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3395"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseBoolsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseError": {ESLVal $317 = _v38.termRef(0);
          ESLVal $316 = _v38.termRef(1);
          
          {ESLVal l = $317;
          
          {ESLVal e = $316;
          
          return new ESLVal("caseError()");
        }
        }
        }
      case "Head": {ESLVal $315 = _v38.termRef(0);
          
          {ESLVal e = $315;
          
          return new ESLVal("head(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Tail": {ESLVal $314 = _v38.termRef(0);
          
          {ESLVal e = $314;
          
          return new ESLVal("tail(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Cons": {ESLVal $313 = _v38.termRef(0);
          ESLVal $312 = _v38.termRef(1);
          
          {ESLVal h = $313;
          
          {ESLVal t = $312;
          
          return new ESLVal("cons(").add(ppExp.apply(indent,h).add(new ESLVal(",").add(ppExp.apply(indent,t).add(new ESLVal(")")))));
        }
        }
        }
      case "If": {ESLVal $311 = _v38.termRef(0);
          ESLVal $310 = _v38.termRef(1);
          ESLVal $309 = _v38.termRef(2);
          ESLVal $308 = _v38.termRef(3);
          
          {ESLVal l = $311;
          
          {ESLVal e1 = $310;
          
          {ESLVal e2 = $309;
          
          {ESLVal e3 = $308;
          
          return new ESLVal("if ").add(ppExp.apply(indent,e1).add(nl.apply(indent).add(new ESLVal("then").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(nl.apply(indent).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e3))))))))));
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $307 = _v38.termRef(0);
          ESLVal $306 = _v38.termRef(1);
          ESLVal $305 = _v38.termRef(2);
          ESLVal $304 = _v38.termRef(3);
          ESLVal $303 = _v38.termRef(4);
          
          {ESLVal l = $307;
          
          {ESLVal n = $306;
          
          {ESLVal args = $305;
          
          {ESLVal t = $304;
          
          {ESLVal e = $303;
          
          return new ESLVal("fun(").add(ppDecs.apply(indent,args).add(new ESLVal(")::").add(ppType.apply(t).add(new ESLVal(" ").add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        }
        }
        }
      case "Let": {ESLVal $302 = _v38.termRef(0);
          ESLVal $301 = _v38.termRef(1);
          ESLVal $300 = _v38.termRef(2);
          
          {ESLVal l = $302;
          
          {ESLVal bs = $301;
          
          {ESLVal e = $300;
          
          return new ESLVal("let ").add(ppBinds.apply(indent.add(new ESLVal(4)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "Letrec": {ESLVal $299 = _v38.termRef(0);
          ESLVal $298 = _v38.termRef(1);
          ESLVal $297 = _v38.termRef(2);
          
          {ESLVal l = $299;
          
          {ESLVal bs = $298;
          
          {ESLVal e = $297;
          
          return new ESLVal("letrec ").add(ppBinds.apply(indent.add(new ESLVal(7)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "List": {ESLVal $296 = _v38.termRef(0);
          ESLVal $295 = _v38.termRef(1);
          
          {ESLVal l = $296;
          
          {ESLVal es = $295;
          
          return new ESLVal("[").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal("]")));
        }
        }
        }
      case "Throw": {ESLVal $294 = _v38.termRef(0);
          ESLVal $293 = _v38.termRef(1);
          ESLVal $292 = _v38.termRef(2);
          
          {ESLVal l = $294;
          
          {ESLVal t = $293;
          
          {ESLVal e = $292;
          
          return new ESLVal("throw ").add(ppExp.apply(indent,e));
        }
        }
        }
        }
      case "Term": {ESLVal $291 = _v38.termRef(0);
          ESLVal $290 = _v38.termRef(1);
          ESLVal $289 = _v38.termRef(2);
          ESLVal $288 = _v38.termRef(3);
          
          {ESLVal l = $291;
          
          {ESLVal n = $290;
          
          {ESLVal ts = $289;
          
          {ESLVal es = $288;
          
          return n.add(new ESLVal("(").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $287 = _v38.termRef(0);
          ESLVal $286 = _v38.termRef(1);
          
          {ESLVal e = $287;
          
          {ESLVal n = $286;
          
          return new ESLVal("termRef(").add(ppExp.apply(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
        }
        }
        }
      case "BinExp": {ESLVal $285 = _v38.termRef(0);
          ESLVal $284 = _v38.termRef(1);
          ESLVal $283 = _v38.termRef(2);
          ESLVal $282 = _v38.termRef(3);
          
          {ESLVal l = $285;
          
          {ESLVal e1 = $284;
          
          {ESLVal op = $283;
          
          {ESLVal e2 = $282;
          
          return ppExp.apply(indent,e1).add(op.add(ppExp.apply(indent,e2)));
        }
        }
        }
        }
        }
      case "Update": {ESLVal $281 = _v38.termRef(0);
          ESLVal $280 = _v38.termRef(1);
          ESLVal $279 = _v38.termRef(2);
          
          {ESLVal l = $281;
          
          {ESLVal n = $280;
          
          {ESLVal e = $279;
          
          return n.add(new ESLVal(" := ").add(ppExp.apply(indent,e)));
        }
        }
        }
        }
      case "NewArray": {ESLVal $278 = _v38.termRef(0);
          ESLVal $277 = _v38.termRef(1);
          ESLVal $276 = _v38.termRef(2);
          
          {ESLVal l = $278;
          
          {ESLVal t = $277;
          
          {ESLVal n = $276;
          
          return new ESLVal("new Array[").add(ppType.apply(t).add(new ESLVal("](").add(ppExp.apply(indent,n).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "For": {ESLVal $275 = _v38.termRef(0);
          ESLVal $274 = _v38.termRef(1);
          ESLVal $273 = _v38.termRef(2);
          ESLVal $272 = _v38.termRef(3);
          
          {ESLVal l = $275;
          
          {ESLVal p = $274;
          
          {ESLVal e1 = $273;
          
          {ESLVal e2 = $272;
          
          return new ESLVal("for ").add(ppPattern.apply(p).add(new ESLVal(" in ").add(ppExp.apply(indent,e1).add(new ESLVal(" do {").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
        }
        }
        }
        }
        }
      case "Try": {ESLVal $271 = _v38.termRef(0);
          ESLVal $270 = _v38.termRef(1);
          ESLVal $269 = _v38.termRef(2);
          
          {ESLVal l = $271;
          
          {ESLVal e = $270;
          
          {ESLVal as = $269;
          
          return new ESLVal("try ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3396"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
      case "ActExp": {ESLVal $268 = _v38.termRef(0);
          ESLVal $267 = _v38.termRef(1);
          ESLVal $266 = _v38.termRef(2);
          ESLVal $265 = _v38.termRef(3);
          ESLVal $264 = _v38.termRef(4);
          ESLVal $263 = _v38.termRef(5);
          ESLVal $262 = _v38.termRef(6);
          ESLVal $261 = _v38.termRef(7);
          
          {ESLVal l = $268;
          
          {ESLVal n = $267;
          
          {ESLVal args = $266;
          
          {ESLVal x = $265;
          
          {ESLVal parent = $264;
          
          {ESLVal locals = $263;
          
          {ESLVal init = $262;
          
          {ESLVal handlers = $261;
          
          return new ESLVal("act ").add(ppExp.apply(indent,n).add(new ESLVal("(").add(ppDecs.apply(indent,args).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(5)),locals).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp.apply(indent.add(new ESLVal(4)),init).add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3397"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),handlers)).add(nl.apply(indent).add(new ESLVal("}"))))))))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Self": {ESLVal $260 = _v38.termRef(0);
          
          {ESLVal l = $260;
          
          return new ESLVal("self");
        }
        }
      case "Ref": {ESLVal $259 = _v38.termRef(0);
          ESLVal $258 = _v38.termRef(1);
          ESLVal $257 = _v38.termRef(2);
          
          {ESLVal l = $259;
          
          {ESLVal e = $258;
          
          {ESLVal n = $257;
          
          return ppExp.apply(indent,e).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "Send": {ESLVal $256 = _v38.termRef(0);
          ESLVal $255 = _v38.termRef(1);
          ESLVal $254 = _v38.termRef(2);
          
          {ESLVal l = $256;
          
          {ESLVal target = $255;
          
          {ESLVal message = $254;
          
          return ppExp.apply(indent,target).add(new ESLVal(" <- ").add(ppExp.apply(indent,message)));
        }
        }
        }
        }
      case "Cmp": {ESLVal $253 = _v38.termRef(0);
          ESLVal $252 = _v38.termRef(1);
          ESLVal $251 = _v38.termRef(2);
          
          {ESLVal l = $253;
          
          {ESLVal e = $252;
          
          {ESLVal qs = $251;
          
          return new ESLVal("[").add(ppExp.apply(indent,e).add(new ESLVal(" | ").add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun3398"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal q = $args[0];
          return ppQual.apply(indent,q);
            }
          }),qs)).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "New": {ESLVal $250 = _v38.termRef(0);
          ESLVal $249 = _v38.termRef(1);
          ESLVal $248 = _v38.termRef(2);
          
          {ESLVal l = $250;
          
          {ESLVal b = $249;
          
          {ESLVal args = $248;
          
          return new ESLVal("new ").add(ppExp.apply(indent,b).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "NewJava": {ESLVal $247 = _v38.termRef(0);
          ESLVal $246 = _v38.termRef(1);
          ESLVal $245 = _v38.termRef(2);
          ESLVal $244 = _v38.termRef(3);
          
          {ESLVal l = $247;
          
          {ESLVal className = $246;
          
          {ESLVal t = $245;
          
          {ESLVal args = $244;
          
          return new ESLVal("javaNew[").add(ppType.apply(t).add(new ESLVal("](\' + className + ").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $243 = _v38.termRef(0);
          ESLVal $242 = _v38.termRef(1);
          ESLVal $241 = _v38.termRef(2);
          
          {ESLVal l = $243;
          
          {ESLVal rs = $242;
          
          {ESLVal e = $241;
          
          return new ESLVal("*********grab");
        }
        }
        }
        }
      case "Probably": {ESLVal $240 = _v38.termRef(0);
          ESLVal $239 = _v38.termRef(1);
          ESLVal $238 = _v38.termRef(2);
          ESLVal $237 = _v38.termRef(3);
          ESLVal $236 = _v38.termRef(4);
          
          {ESLVal l = $240;
          
          {ESLVal p = $239;
          
          {ESLVal t = $238;
          
          {ESLVal e1 = $237;
          
          {ESLVal e2 = $236;
          
          return new ESLVal("**** probably");
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $235 = _v38.termRef(0);
          ESLVal $234 = _v38.termRef(1);
          
          {ESLVal l = $235;
          
          {ESLVal e = $234;
          
          return new ESLVal("not(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
        }
      case "Fold": {ESLVal $233 = _v38.termRef(0);
          ESLVal $232 = _v38.termRef(1);
          ESLVal $231 = _v38.termRef(2);
          
          {ESLVal l = $233;
          
          {ESLVal t = $232;
          
          {ESLVal e = $231;
          
          return new ESLVal("******** fold");
        }
        }
        }
        }
      case "Unfold": {ESLVal $230 = _v38.termRef(0);
          ESLVal $229 = _v38.termRef(1);
          ESLVal $228 = _v38.termRef(2);
          
          {ESLVal l = $230;
          
          {ESLVal t = $229;
          
          {ESLVal e = $228;
          
          return new ESLVal("******unfold");
        }
        }
        }
        }
      case "Now": {ESLVal $227 = _v38.termRef(0);
          
          {ESLVal l = $227;
          
          return new ESLVal("now");
        }
        }
      case "Become": {ESLVal $226 = _v38.termRef(0);
          ESLVal $225 = _v38.termRef(1);
          
          {ESLVal l = $226;
          
          {ESLVal e = $225;
          
          return new ESLVal("become ").add(ppExp.apply(indent,e));
        }
        }
        }
      case "ArrayRef": {ESLVal $224 = _v38.termRef(0);
          ESLVal $223 = _v38.termRef(1);
          ESLVal $222 = _v38.termRef(2);
          
          {ESLVal l = $224;
          
          {ESLVal a = $223;
          
          {ESLVal i = $222;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("]"))));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $221 = _v38.termRef(0);
          ESLVal $220 = _v38.termRef(1);
          ESLVal $219 = _v38.termRef(2);
          ESLVal $218 = _v38.termRef(3);
          
          {ESLVal l = $221;
          
          {ESLVal a = $220;
          
          {ESLVal i = $219;
          
          {ESLVal v = $218;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("] := ").add(ppExp.apply(indent,v)))));
        }
        }
        }
        }
        }
        default: {ESLVal x = _v38;
          
          return error(new ESLVal("ppExp: ").add(x));
        }
      }
      }
    }
  });
  private static ESLVal ppQual = new ESLVal(new Function(new ESLVal("ppQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal q = $args[1];
  return new ESLVal("qualifier: ").add(q);
    }
  });
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun3399"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal b = $args[0];
        return ppDec.apply(indent,b);
          }
        }),bs));
    }
  });
  private static ESLVal ppDec = new ESLVal(new Function(new ESLVal("ppDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v37 = d;
        
        switch(_v37.termName) {
        case "Dec": {ESLVal $217 = _v37.termRef(0);
          ESLVal $216 = _v37.termRef(1);
          ESLVal $215 = _v37.termRef(2);
          ESLVal $214 = _v37.termRef(3);
          
          {ESLVal l = $217;
          
          {ESLVal n = $216;
          
          {ESLVal dt = $215;
          
          {ESLVal t = $214;
          
          return n.add(new ESLVal("::").add(ppType.apply(t)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9566,9643)").add(ESLVal.list(_v37)));
      }
      }
    }
  });
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun3400"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal b = $args[0];
        return ppBind.apply(indent,b);
          }
        }),bs));
    }
  });
  private static ESLVal ppBind = new ESLVal(new Function(new ESLVal("ppBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal b = $args[1];
  {ESLVal _v36 = b;
        
        switch(_v36.termName) {
        case "Binding": {ESLVal $213 = _v36.termRef(0);
          ESLVal $212 = _v36.termRef(1);
          ESLVal $211 = _v36.termRef(2);
          ESLVal $210 = _v36.termRef(3);
          ESLVal $209 = _v36.termRef(4);
          
          {ESLVal l = $213;
          
          {ESLVal name = $212;
          
          {ESLVal t = $211;
          
          {ESLVal st = $210;
          
          {ESLVal value = $209;
          
          return name.add(new ESLVal("=").add(ppExp.apply(indent,value).add(new ESLVal(";"))));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $208 = _v36.termRef(0);
          ESLVal $207 = _v36.termRef(1);
          ESLVal $206 = _v36.termRef(2);
          ESLVal $205 = _v36.termRef(3);
          
          {ESLVal l = $208;
          
          {ESLVal name = $207;
          
          {ESLVal t = $206;
          
          {ESLVal ignore = $205;
          
          return new ESLVal("type ").add(name);
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $204 = _v36.termRef(0);
          ESLVal $203 = _v36.termRef(1);
          ESLVal $202 = _v36.termRef(2);
          ESLVal $201 = _v36.termRef(3);
          
          {ESLVal l = $204;
          
          {ESLVal name = $203;
          
          {ESLVal t = $202;
          
          {ESLVal ignore = $201;
          
          return new ESLVal("data ").add(name);
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $200 = _v36.termRef(0);
          ESLVal $199 = _v36.termRef(1);
          ESLVal $198 = _v36.termRef(2);
          ESLVal $197 = _v36.termRef(3);
          ESLVal $196 = _v36.termRef(4);
          ESLVal $195 = _v36.termRef(5);
          ESLVal $194 = _v36.termRef(6);
          
          {ESLVal l = $200;
          
          {ESLVal name = $199;
          
          {ESLVal args = $198;
          
          {ESLVal t = $197;
          
          {ESLVal st = $196;
          
          {ESLVal body = $195;
          
          {ESLVal guard = $194;
          
          return name.add(new ESLVal("(").add(ppPatterns.apply(args).add(new ESLVal(") = ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),body))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $193 = _v36.termRef(0);
          ESLVal $192 = _v36.termRef(1);
          ESLVal $191 = _v36.termRef(2);
          ESLVal $190 = _v36.termRef(3);
          
          {ESLVal l = $193;
          
          {ESLVal name = $192;
          
          {ESLVal t = $191;
          
          {ESLVal ignore = $190;
          
          return name;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v36;
          
          return error(new ESLVal("ppBind: ").add(x));
        }
      }
      }
    }
  });
  public static ESLVal ppArm = new ESLVal(new Function(new ESLVal("ppArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v35 = a;
        
        switch(_v35.termName) {
        case "BArm": {ESLVal $189 = _v35.termRef(0);
          ESLVal $188 = _v35.termRef(1);
          ESLVal $187 = _v35.termRef(2);
          ESLVal $186 = _v35.termRef(3);
          
          {ESLVal l = $189;
          
          {ESLVal ps = $188;
          
          {ESLVal guard = $187;
          
          {ESLVal e = $186;
          
          return ppPatterns.apply(ps).add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10428,10566)").add(ESLVal.list(_v35)));
      }
      }
    }
  });
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal arms = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun3401"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppArm.apply(indent,a);
          }
        }),arms));
    }
  });
  private static ESLVal ppCaseTermArm = new ESLVal(new Function(new ESLVal("ppCaseTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v34 = a;
        
        switch(_v34.termName) {
        case "TArm": {ESLVal $185 = _v34.termRef(0);
          ESLVal $184 = _v34.termRef(1);
          
          {ESLVal n = $185;
          
          {ESLVal e = $184;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10728,10828)").add(ESLVal.list(_v34)));
      }
      }
    }
  });
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v33 = a;
        
        switch(_v33.termName) {
        case "IArm": {ESLVal $183 = _v33.termRef(0);
          ESLVal $182 = _v33.termRef(1);
          
          {ESLVal n = $183;
          
          {ESLVal e = $182;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10884,10984)").add(ESLVal.list(_v33)));
      }
      }
    }
  });
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v32 = a;
        
        switch(_v32.termName) {
        case "SArm": {ESLVal $181 = _v32.termRef(0);
          ESLVal $180 = _v32.termRef(1);
          
          {ESLVal n = $181;
          
          {ESLVal e = $180;
          
          return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11040,11154)").add(ESLVal.list(_v32)));
      }
      }
    }
  });
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v31 = a;
        
        switch(_v31.termName) {
        case "BoolArm": {ESLVal $179 = _v31.termRef(0);
          ESLVal $178 = _v31.termRef(1);
          
          {ESLVal b = $179;
          
          {ESLVal e = $178;
          
          return b.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11212,11316)").add(ESLVal.list(_v31)));
      }
      }
    }
  });
  private static ESLVal getImport = new ESLVal(new Function(new ESLVal("getImport"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sourceFile = $args[0];
  {ESLVal path = toPath.apply(sourceFile);
        
        {ESLVal p = pathToJavaPackage.apply(path);
        ESLVal className = pathToJavaClassName.apply(path);
        
        {ESLVal _v30 = sourceFile;
        
        switch(_v30.strVal) {
        case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        default: {ESLVal x = _v30;
          
          return new ESLVal("import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        }
      }
      }
      }
      }
    }
  });
  public static ESLVal ppJModule = new ESLVal(new Function(new ESLVal("ppJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal p = $args[1];
  ESLVal m = $args[2];
  {ESLVal _v28 = m;
        
        switch(_v28.termName) {
        case "JModule": {ESLVal $177 = _v28.termRef(0);
          ESLVal $176 = _v28.termRef(1);
          ESLVal $175 = _v28.termRef(2);
          ESLVal $174 = _v28.termRef(3);
          
          {ESLVal n = $177;
          
          {ESLVal exports = $176;
          
          {ESLVal imports = $175;
          
          {ESLVal fields = $174;
          
          return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl.apply($zero).add(new ESLVal("import esl.lib.*;").add(nl.apply($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl.apply($zero).add(ppJoin.apply($zero,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                {ESLVal i = _v29;
                
                return ESLVal.list(ESLVal.list(getImport.apply(i)));
              }
              }
            }
          }).map(imports).flatten().flatten()).add(nl.apply($zero).add(new ESLVal("import java.util.function.Supplier;").add(nl.apply($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl.apply(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl.apply(new ESLVal(2)).add(ppJoin.apply(new ESLVal(2),map.apply(new ESLVal(new Function(new ESLVal("fun3402"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return ppJModuleField.apply(new ESLVal(2),exports,f);
            }
          }),fields)).add(nl.apply($zero).add(new ESLVal("public static void main(String[] args) {").add(nl.apply(new ESLVal(2)).add(((Supplier<ESLVal>)() -> { 
            if(member.apply(new ESLVal("main"),exports).boolVal)
              return new ESLVal("  newActor(main,new ESLVal(new Actor())); ").add(nl.apply(new ESLVal(2)));
              else
                return new ESLVal("");
          }).get().add(new ESLVal("}").add(nl.apply($zero).add(new ESLVal("}"))))))))))))))))))))))))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11711,12473)").add(ESLVal.list(_v28)));
      }
      }
    }
  });
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exports = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v27 = f;
        
        switch(_v27.termName) {
        case "JField": {ESLVal $173 = _v27.termRef(0);
          ESLVal $172 = _v27.termRef(1);
          ESLVal $171 = _v27.termRef(2);
          
          switch($173.strVal) {
          case "edb": switch($171.termName) {
            case "JNull": {
              {ESLVal t = $172;
              
              return new ESLVal("// static ESLVal edb = null;");
            }
            }
            default: {ESLVal n = $173;
              
              {ESLVal t = $172;
              
              {ESLVal e = $171;
              
              return ((Supplier<ESLVal>)() -> { 
                if(member.apply(n,exports).boolVal)
                  return new ESLVal("public ");
                  else
                    return new ESLVal("private ");
              }).get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp.apply(indent,ESLVal.list(),e).add(new ESLVal(";"))))));
            }
            }
            }
          }
          default: {ESLVal n = $173;
            
            {ESLVal t = $172;
            
            {ESLVal e = $171;
            
            return ((Supplier<ESLVal>)() -> { 
              if(member.apply(n,exports).boolVal)
                return new ESLVal("public ");
                else
                  return new ESLVal("private ");
            }).get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp.apply(indent,ESLVal.list(),e).add(new ESLVal(";"))))));
          }
          }
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(12542,12792)").add(ESLVal.list(_v27)));
      }
      }
    }
  });
  private static ESLVal ppJExps = new ESLVal(new Function(new ESLVal("ppJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal exps = $args[2];
  ESLVal sep = $args[3];
  {ESLVal _v26 = exps;
        
        if(_v26.isCons())
        {ESLVal $167 = _v26.head();
          ESLVal $168 = _v26.tail();
          
          if($168.isCons())
          {ESLVal $169 = $168.head();
            ESLVal $170 = $168.tail();
            
            {ESLVal e1 = $167;
            
            {ESLVal e2 = $169;
            
            {ESLVal es = $170;
            
            return ppJExp.apply(indent,dynamics,e1).add(sep.add(ppJExps.apply(indent,dynamics,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($168.isNil())
          {ESLVal e = $167;
            
            return ppJExp.apply(indent,dynamics,e);
          }
        else return error(new ESLVal("case error at Pos(12862,13056)").add(ESLVal.list(_v26)));
        }
      else if(_v26.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(12862,13056)").add(ESLVal.list(_v26)));
      }
    }
  });
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal decs = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v25 = decs;
        
        if(_v25.isCons())
        {ESLVal $163 = _v25.head();
          ESLVal $164 = _v25.tail();
          
          if($164.isCons())
          {ESLVal $165 = $164.head();
            ESLVal $166 = $164.tail();
            
            {ESLVal e1 = $163;
            
            {ESLVal e2 = $165;
            
            {ESLVal es = $166;
            
            return pJDec.apply(indent,e1).add(sep.add(ppJDecs.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($164.isNil())
          {ESLVal e = $163;
            
            return pJDec.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(13118,13330)").add(ESLVal.list(_v25)));
        }
      else if(_v25.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(13118,13330)").add(ESLVal.list(_v25)));
      }
    }
  });
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v24 = d;
        
        switch(_v24.termName) {
        case "JDec": {ESLVal $162 = _v24.termRef(0);
          ESLVal $161 = _v24.termRef(1);
          
          {ESLVal n = $162;
          
          {ESLVal t = $161;
          
          return new ESLVal("ESLVal ").add(n);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(13376,13432)").add(ESLVal.list(_v24)));
      }
      }
    }
  });
  private static ESLVal ppJExp = new ESLVal(new Function(new ESLVal("ppJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v21 = e;
        
        switch(_v21.termName) {
        case "JArrayRef": {ESLVal $160 = _v21.termRef(0);
          ESLVal $159 = _v21.termRef(1);
          
          {ESLVal a = $160;
          
          {ESLVal i = $159;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal]"))));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $158 = _v21.termRef(0);
          ESLVal $157 = _v21.termRef(1);
          ESLVal $156 = _v21.termRef(2);
          
          {ESLVal a = $158;
          
          {ESLVal i = $157;
          
          {ESLVal v = $156;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp.apply(indent,dynamics,v)))));
        }
        }
        }
        }
      case "JBecome": {ESLVal $153 = _v21.termRef(0);
          ESLVal $152 = _v21.termRef(1);
          
          if($152.isCons())
          {ESLVal $154 = $152.head();
            ESLVal $155 = $152.tail();
            
            {ESLVal _v96 = $153;
            
            {ESLVal es = $152;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v96).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($152.isNil())
          {ESLVal _v97 = $153;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v97).add(new ESLVal(",getSelf())")));
          }
        else {ESLVal _v98 = $153;
            
            {ESLVal es = $152;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v98).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JConstExp": {ESLVal $147 = _v21.termRef(0);
          
          switch($147.termName) {
          case "JConstInt": {ESLVal $151 = $147.termRef(0);
            
            switch($151.intVal) {
            case 0: return new ESLVal("$zero");
          case 1: return new ESLVal("$one");
            default: {ESLVal n = $151;
              
              return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
            }
          }
          }
        case "JConstBool": {ESLVal $150 = $147.termRef(0);
            
            switch($150.boolVal ? 1 : 0) {
            case 1: return new ESLVal("$true");
          case 0: return new ESLVal("$false");
            default: {ESLVal _v94 = _v21;
              
              return new ESLVal("********** unknown expression: ").add(_v94);
            }
          }
          }
        case "JConstStr": {ESLVal $149 = $147.termRef(0);
            
            {ESLVal s = $149;
            
            return new ESLVal("new ESLVal(\"").add(javaString.apply(s).add(new ESLVal("\")")));
          }
          }
        case "JConstDouble": {ESLVal $148 = $147.termRef(0);
            
            {ESLVal d = $148;
            
            return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
          }
          }
          default: {ESLVal _v95 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v95);
          }
        }
        }
      case "JNot": {ESLVal $146 = _v21.termRef(0);
          
          {ESLVal _v93 = $146;
          
          return ppJExp.apply(indent,dynamics,_v93).add(new ESLVal(".not()"));
        }
        }
      case "JNil": {ESLVal $145 = _v21.termRef(0);
          
          {ESLVal t = $145;
          
          return new ESLVal("$nil");
        }
        }
      case "JList": {ESLVal $144 = _v21.termRef(0);
          ESLVal $143 = _v21.termRef(1);
          
          {ESLVal t = $144;
          
          {ESLVal es = $143;
          
          return ppJListExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JTerm": {ESLVal $140 = _v21.termRef(0);
          ESLVal $139 = _v21.termRef(1);
          
          if($139.isCons())
          {ESLVal $141 = $139.head();
            ESLVal $142 = $139.tail();
            
            {ESLVal n = $140;
            
            {ESLVal es = $139;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($139.isNil())
          {ESLVal n = $140;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
          }
        else {ESLVal n = $140;
            
            {ESLVal es = $139;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JFun": {ESLVal $138 = _v21.termRef(0);
          ESLVal $137 = _v21.termRef(1);
          ESLVal $136 = _v21.termRef(2);
          ESLVal $135 = _v21.termRef(3);
          
          {ESLVal n = $138;
          
          {ESLVal args = $137;
          
          {ESLVal t = $136;
          
          {ESLVal body = $135;
          
          return ppJFun.apply(indent,dynamics,n,args,t,body);
        }
        }
        }
        }
        }
      case "JBinExp": {ESLVal $134 = _v21.termRef(0);
          ESLVal $133 = _v21.termRef(1);
          ESLVal $132 = _v21.termRef(2);
          
          switch($133.strVal) {
          case "==": {ESLVal e1 = $134;
            
            {ESLVal e2 = $132;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))));
          }
          }
        case "cons": {ESLVal e1 = $134;
            
            {ESLVal e2 = $132;
            
            return ppJExp.apply(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(")"))));
          }
          }
          default: {ESLVal e1 = $134;
            
            {ESLVal op = $133;
            
            {ESLVal e2 = $132;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".").add(op.add(new ESLVal("(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))))));
          }
          }
          }
        }
        }
      case "JNull": {
          return new ESLVal("$null");
        }
      case "JNow": {
          return new ESLVal("now()");
        }
      case "JVar": {ESLVal $131 = _v21.termRef(0);
          ESLVal $130 = _v21.termRef(1);
          
          {ESLVal n = $131;
          
          {ESLVal t = $130;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0]"));
          else
            {ESLVal _v91 = $131;
              
              {ESLVal _v92 = $130;
              
              return _v91;
            }
            }
        }
        }
        }
      case "JError": {ESLVal $129 = _v21.termRef(0);
          
          {ESLVal _v90 = $129;
          
          return new ESLVal("error(").add(ppJExp.apply(indent,dynamics,_v90).add(new ESLVal(")")));
        }
        }
      case "JApply": {ESLVal $128 = _v21.termRef(0);
          ESLVal $127 = _v21.termRef(1);
          
          {ESLVal _v89 = $128;
          
          {ESLVal es = $127;
          
          return ppJExp.apply(indent,dynamics,_v89).add(new ESLVal(".apply(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
      case "JCommandExp": {ESLVal $126 = _v21.termRef(0);
          ESLVal $125 = _v21.termRef(1);
          
          {ESLVal c = $126;
          
          {ESLVal t = $125;
          
          return new ESLVal("((Supplier<ESLVal>)() -> { ").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c).add(nl.apply(indent).add(new ESLVal("}).get()")))));
        }
        }
        }
      case "JIfExp": {ESLVal $124 = _v21.termRef(0);
          ESLVal $123 = _v21.termRef(1);
          ESLVal $122 = _v21.termRef(2);
          
          {ESLVal _v88 = $124;
          
          {ESLVal e1 = $123;
          
          {ESLVal e2 = $122;
          
          return new ESLVal("(").add(ppJExp.apply(indent,dynamics,_v88).add(new ESLVal(".boolVal) ? (").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")")))))));
        }
        }
        }
        }
      case "JHead": {ESLVal $121 = _v21.termRef(0);
          
          {ESLVal _v87 = $121;
          
          return ppJExp.apply(indent,dynamics,_v87).add(new ESLVal(".head()"));
        }
        }
      case "JTail": {ESLVal $120 = _v21.termRef(0);
          
          {ESLVal _v86 = $120;
          
          return ppJExp.apply(indent,dynamics,_v86).add(new ESLVal(".tail()"));
        }
        }
      case "JTermRef": {ESLVal $119 = _v21.termRef(0);
          ESLVal $118 = _v21.termRef(1);
          
          {ESLVal _v85 = $119;
          
          {ESLVal n = $118;
          
          return ppJExp.apply(indent,dynamics,_v85).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
        }
        }
        }
      case "JMapFun": {ESLVal $117 = _v21.termRef(0);
          ESLVal $116 = _v21.termRef(1);
          
          {ESLVal f = $117;
          
          {ESLVal l = $116;
          
          return ppJExp.apply(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(")"))));
        }
        }
        }
      case "JFlatten": {ESLVal $115 = _v21.termRef(0);
          
          {ESLVal ls = $115;
          
          return ppJExp.apply(indent,dynamics,ls).add(new ESLVal(".flatten()"));
        }
        }
      case "JBehaviour": {ESLVal $110 = _v21.termRef(0);
          ESLVal $109 = _v21.termRef(1);
          ESLVal $108 = _v21.termRef(2);
          ESLVal $107 = _v21.termRef(3);
          ESLVal $106 = _v21.termRef(4);
          
          switch($107.termName) {
          case "JFun": {ESLVal $114 = $107.termRef(0);
            ESLVal $113 = $107.termRef(1);
            ESLVal $112 = $107.termRef(2);
            ESLVal $111 = $107.termRef(3);
            
            {ESLVal es = $110;
            
            {ESLVal fs = $109;
            
            {ESLVal init = $108;
            
            {ESLVal n = $114;
            
            {ESLVal args = $113;
            
            {ESLVal t = $112;
            
            {ESLVal body = $111;
            
            {ESLVal time = $106;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v23 = $qualArg;
                  
                  {ESLVal _v83 = _v23;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(_v83.add(new ESLVal("\": return ").add(_v83.add(new ESLVal(";")))))));
                }
                }
              }
            }).map(es).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"ref illegal \" + self + \".\" + name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _v84 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v84);
          }
        }
        }
      case "JExtendedBehaviour": {ESLVal $101 = _v21.termRef(0);
          ESLVal $100 = _v21.termRef(1);
          ESLVal $99 = _v21.termRef(2);
          ESLVal $98 = _v21.termRef(3);
          ESLVal $97 = _v21.termRef(4);
          ESLVal $96 = _v21.termRef(5);
          
          switch($97.termName) {
          case "JFun": {ESLVal $105 = $97.termRef(0);
            ESLVal $104 = $97.termRef(1);
            ESLVal $103 = $97.termRef(2);
            ESLVal $102 = $97.termRef(3);
            
            {ESLVal es = $101;
            
            {ESLVal parent = $100;
            
            {ESLVal fs = $99;
            
            {ESLVal init = $98;
            
            {ESLVal n = $105;
            
            {ESLVal args = $104;
            
            {ESLVal t = $103;
            
            {ESLVal body = $102;
            
            {ESLVal time = $96;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(ppBehaviourParent.apply(indent,dynamics,parent).add(new ESLVal(",").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v22 = $qualArg;
                  
                  {ESLVal _v81 = _v22;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(_v81.add(new ESLVal("\": return ").add(_v81.add(new ESLVal(";")))))));
                }
                }
              }
            }).map(es).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: return refSuper(name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))))));
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
          default: {ESLVal _v82 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v82);
          }
        }
        }
      case "JNew": {ESLVal $93 = _v21.termRef(0);
          ESLVal $92 = _v21.termRef(1);
          
          if($92.isCons())
          {ESLVal $94 = $92.head();
            ESLVal $95 = $92.tail();
            
            {ESLVal b = $93;
            
            {ESLVal args = $92;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($92.isNil())
          {ESLVal b = $93;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
          }
        else {ESLVal b = $93;
            
            {ESLVal args = $92;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JNewArray": {ESLVal $91 = _v21.termRef(0);
          
          {ESLVal i = $91;
          
          return new ESLVal("newArray(").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal)")));
        }
        }
      case "JNewTable": {
          return new ESLVal("newTable()");
        }
      case "JNewJava": {ESLVal $88 = _v21.termRef(0);
          ESLVal $87 = _v21.termRef(1);
          
          if($87.isCons())
          {ESLVal $89 = $87.head();
            ESLVal $90 = $87.tail();
            
            {ESLVal n = $88;
            
            {ESLVal args = $87;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($87.isNil())
          {ESLVal n = $88;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
          }
        else {ESLVal n = $88;
            
            {ESLVal args = $87;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JSend": {ESLVal $84 = _v21.termRef(0);
          ESLVal $83 = _v21.termRef(1);
          ESLVal $82 = _v21.termRef(2);
          
          if($82.isCons())
          {ESLVal $85 = $82.head();
            ESLVal $86 = $82.tail();
            
            {ESLVal _v78 = $84;
            
            {ESLVal m = $83;
            
            {ESLVal args = $82;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v78).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
          }
        else if($82.isNil())
          {ESLVal _v79 = $84;
            
            {ESLVal m = $83;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v79).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
          }
          }
        else {ESLVal _v80 = $84;
            
            {ESLVal m = $83;
            
            {ESLVal args = $82;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v80).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
        }
      case "JSendSuper": {ESLVal $81 = _v21.termRef(0);
          
          {ESLVal _v77 = $81;
          
          return new ESLVal("sendSuper(").add(ppJExp.apply(indent,dynamics,_v77).add(new ESLVal(")")));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("sendTimeSuper($t)");
        }
      case "JSelf": {
          return new ESLVal("getSelf()");
        }
      case "JRef": {ESLVal $80 = _v21.termRef(0);
          ESLVal $79 = _v21.termRef(1);
          
          {ESLVal _v76 = $80;
          
          {ESLVal n = $79;
          
          return ppJExp.apply(indent,dynamics,_v76).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
        }
        }
        }
      case "JRefSuper": {ESLVal $78 = _v21.termRef(0);
          
          {ESLVal n = $78;
          
          return new ESLVal("refSuper(\"").add(n.add(new ESLVal("\")")));
        }
        }
      case "JGrab": {ESLVal $77 = _v21.termRef(0);
          ESLVal $76 = _v21.termRef(1);
          
          {ESLVal es = $77;
          
          {ESLVal c = $76;
          
          return new ESLVal("lock(new Function(new ESLVal(\"grab\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal ...args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent,dynamics,c).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}},").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))))))))));
        }
        }
        }
      case "JTry": {ESLVal $75 = _v21.termRef(0);
          ESLVal $74 = _v21.termRef(1);
          ESLVal $73 = _v21.termRef(2);
          
          {ESLVal _v75 = $75;
          
          {ESLVal n = $74;
          
          {ESLVal c = $73;
          
          return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(4)),dynamics,_v75).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl.apply(indent.add(new ESLVal(6))).add(ppJCommand.apply(indent,dynamics,c).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
        }
        }
        }
        }
      case "JProbably": {ESLVal $72 = _v21.termRef(0);
          ESLVal $71 = _v21.termRef(1);
          ESLVal $70 = _v21.termRef(2);
          
          {ESLVal _v74 = $72;
          
          {ESLVal e1 = $71;
          
          {ESLVal e2 = $70;
          
          return new ESLVal("probably(").add(ppJExp.apply(indent,dynamics,_v74).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e1)).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e2)).add(new ESLVal(")")))))));
        }
        }
        }
        }
        default: {ESLVal _v99 = _v21;
          
          return new ESLVal("********** unknown expression: ").add(_v99);
        }
      }
      }
    }
  });
  private static ESLVal ppBehaviourParent = new ESLVal(new Function(new ESLVal("ppBehaviourParent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v20 = e;
        
        switch(_v20.termName) {
        case "JApply": {ESLVal $69 = _v20.termRef(0);
          ESLVal $68 = _v20.termRef(1);
          
          {ESLVal op = $69;
          
          {ESLVal args = $68;
          
          return new ESLVal("getParent(getSelf(),").add(ppJExp.apply(indent,dynamics,op).add(new ESLVal(",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        default: {ESLVal _v73 = _v20;
          
          return ppJExp.apply(indent,dynamics,_v73);
        }
      }
      }
    }
  });
  private static ESLVal probFun = new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  return new ESLVal("JFun",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("probFun"))),ESLVal.list(),$null,new ESLVal("JReturn",e));
    }
  });
  private static ESLVal ppJFun = new ESLVal(new Function(new ESLVal("ppJFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal n = $args[2];
  ESLVal args = $args[3];
  ESLVal t = $args[4];
  ESLVal body = $args[5];
  {ESLVal freeDynamics = dynamicVarsJCommand.apply(body);
        ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v16 = $qualArg;
                
                switch(_v16.termName) {
                case "JDec": {ESLVal $65 = _v16.termRef(0);
                  ESLVal $64 = _v16.termRef(1);
                  
                  {ESLVal _v69 = $65;
                  
                  {ESLVal _v70 = $64;
                  
                  return ESLVal.list(ESLVal.list(_v69));
                }
                }
                }
                default: {ESLVal _0 = _v16;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal boundDynamics = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v17 = $qualArg;
                
                {ESLVal d = _v17;
                
                return ESLVal.list((member.apply(d,freeDynamics).boolVal) ? (ESLVal.list(d)) : ($nil));
              }
              }
            }
          }).map(argNames).flatten().flatten();
        
        {ESLVal dom = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v18 = $qualArg;
                
                switch(_v18.termName) {
                case "JDec": {ESLVal $67 = _v18.termRef(0);
                  ESLVal $66 = _v18.termRef(1);
                  
                  {ESLVal _v71 = $67;
                  
                  {ESLVal _v72 = $66;
                  
                  return ESLVal.list(ESLVal.list(_v72));
                }
                }
                }
                default: {ESLVal _0 = _v18;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        ESLVal ran = t;
        
        return new ESLVal("new ESLVal(new Function(").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(",getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... $args) {").add(nl.apply(indent.add(new ESLVal(4))).add(ppFunArgs.apply(indent,$zero,args,boundDynamics).add(ppJCommand.apply(indent.add(new ESLVal(4)),boundDynamics.add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v19 = $qualArg;
              
              {ESLVal d = _v19;
              
              return ESLVal.list((member.apply(d,argNames).not().boolVal) ? (ESLVal.list(d)) : ($nil));
            }
            }
          }
        }).map(dynamics).flatten().flatten()),body).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})"))))))))))));
      }
      }
      }
    }
  });
  private static ESLVal ppFunArgs = new ESLVal(new Function(new ESLVal("ppFunArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal i = $args[1];
  ESLVal args = $args[2];
  ESLVal dynamicArgs = $args[3];
  {ESLVal _v15 = args;
        
        if(_v15.isCons())
        {ESLVal $60 = _v15.head();
          ESLVal $61 = _v15.tail();
          
          switch($60.termName) {
          case "JDec": {ESLVal $63 = $60.termRef(0);
            ESLVal $62 = $60.termRef(1);
            
            {ESLVal n = $63;
            
            {ESLVal t = $62;
            
            {ESLVal _v65 = $61;
            
            if(member.apply(n,dynamicArgs).boolVal)
            return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v65,dynamicArgs)))))));
            else
              {ESLVal _v66 = $63;
                
                {ESLVal _v67 = $62;
                
                {ESLVal _v68 = $61;
                
                return new ESLVal("ESLVal ").add(_v66.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v68,dynamicArgs)))))));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(21851,22245)").add(ESLVal.list(_v15)));
        }
        }
      else if(_v15.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(21851,22245)").add(ESLVal.list(_v15)));
      }
    }
  });
  private static ESLVal ppJCommand = new ESLVal(new Function(new ESLVal("ppJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  {ESLVal _v6 = c;
        
        switch(_v6.termName) {
        case "JIfCommand": {ESLVal $41 = _v6.termRef(0);
          ESLVal $40 = _v6.termRef(1);
          ESLVal $39 = _v6.termRef(2);
          
          {ESLVal e = $41;
          
          {ESLVal c1 = $40;
          
          {ESLVal c2 = $39;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal)").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c1).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,c2)))))))));
        }
        }
        }
        }
      case "JReturn": {ESLVal $36 = _v6.termRef(0);
          
          switch($36.termName) {
          case "JCommandExp": {ESLVal $38 = $36.termRef(0);
            ESLVal $37 = $36.termRef(1);
            
            {ESLVal _v63 = $38;
            
            {ESLVal t = $37;
            
            return ppJCommand.apply(indent,dynamics,_v63);
          }
          }
          }
          default: {ESLVal e = $36;
            
            return new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";")));
          }
        }
        }
      case "JCaseList": {ESLVal $35 = _v6.termRef(0);
          ESLVal $34 = _v6.termRef(1);
          ESLVal $33 = _v6.termRef(2);
          ESLVal $32 = _v6.termRef(3);
          
          {ESLVal l = $35;
          
          {ESLVal cons = $34;
          
          {ESLVal nil = $33;
          
          {ESLVal alt = $32;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isCons())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,cons).add(nl.apply(indent).add(new ESLVal("else if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isNil())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,nil).add(nl.apply(indent).add(new ESLVal("else ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt))))))))))))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $31 = _v6.termRef(0);
          ESLVal $30 = _v6.termRef(1);
          ESLVal $29 = _v6.termRef(2);
          
          {ESLVal e = $31;
          
          {ESLVal arms = $30;
          
          {ESLVal alt = $29;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".termName) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v14 = $qualArg;
                
                switch(_v14.termName) {
                case "JTArm": {ESLVal $59 = _v14.termRef(0);
                  ESLVal $58 = _v14.termRef(1);
                  ESLVal $57 = _v14.termRef(2);
                  
                  {ESLVal n = $59;
                  
                  {ESLVal i = $58;
                  
                  {ESLVal _v62 = $57;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v62))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v14;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $28 = _v6.termRef(0);
          ESLVal $27 = _v6.termRef(1);
          ESLVal $26 = _v6.termRef(2);
          
          {ESLVal e = $28;
          
          {ESLVal arms = $27;
          
          {ESLVal alt = $26;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".intVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v13 = $qualArg;
                
                switch(_v13.termName) {
                case "JIArm": {ESLVal $56 = _v13.termRef(0);
                  ESLVal $55 = _v13.termRef(1);
                  
                  {ESLVal n = $56;
                  
                  {ESLVal _v61 = $55;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v61))))));
                }
                }
                }
                default: {ESLVal _0 = _v13;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $25 = _v6.termRef(0);
          ESLVal $24 = _v6.termRef(1);
          ESLVal $23 = _v6.termRef(2);
          
          {ESLVal e = $25;
          
          {ESLVal arms = $24;
          
          {ESLVal alt = $23;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".strVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v12 = $qualArg;
                
                switch(_v12.termName) {
                case "JSArm": {ESLVal $54 = _v12.termRef(0);
                  ESLVal $53 = _v12.termRef(1);
                  
                  {ESLVal s = $54;
                  
                  {ESLVal _v60 = $53;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v60))))));
                }
                }
                }
                default: {ESLVal _0 = _v12;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $22 = _v6.termRef(0);
          ESLVal $21 = _v6.termRef(1);
          ESLVal $20 = _v6.termRef(2);
          
          {ESLVal e = $22;
          
          {ESLVal arms = $21;
          
          {ESLVal alt = $20;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal ? 1 : 0) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v11 = $qualArg;
                
                switch(_v11.termName) {
                case "JBArm": {ESLVal $52 = _v11.termRef(0);
                  ESLVal $51 = _v11.termRef(1);
                  
                  {ESLVal b = $52;
                  
                  {ESLVal _v59 = $51;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(((Supplier<ESLVal>)() -> { 
                    if(b.boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v59))))));
                }
                }
                }
                default: {ESLVal _0 = _v11;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JLet": {ESLVal $19 = _v6.termRef(0);
          ESLVal $18 = _v6.termRef(1);
          
          {ESLVal bs = $19;
          
          {ESLVal _v58 = $18;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v10 = $qualArg;
                  
                  switch(_v10.termName) {
                  case "JField": {ESLVal $50 = _v10.termRef(0);
                    ESLVal $49 = _v10.termRef(1);
                    ESLVal $48 = _v10.termRef(2);
                    
                    {ESLVal n = $50;
                    
                    {ESLVal t = $49;
                    
                    {ESLVal e = $48;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v10;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v58);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun3403"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v58).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JLetRec": {ESLVal $17 = _v6.termRef(0);
          ESLVal $16 = _v6.termRef(1);
          
          {ESLVal bs = $17;
          
          {ESLVal _v57 = $16;
          
          return new ESLVal("LetRec letrec = new LetRec() {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,bs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v8 = $qualArg;
                
                switch(_v8.termName) {
                case "JField": {ESLVal $44 = _v8.termRef(0);
                  ESLVal $43 = _v8.termRef(1);
                  ESLVal $42 = _v8.termRef(2);
                  
                  {ESLVal n = $44;
                  
                  {ESLVal t = $43;
                  
                  {ESLVal e = $42;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(6))))))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v8;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"cannot find letrec binding\");").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("};").add(nl.apply(indent).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v9 = $qualArg;
                
                switch(_v9.termName) {
                case "JField": {ESLVal $47 = _v9.termRef(0);
                  ESLVal $46 = _v9.termRef(1);
                  ESLVal $45 = _v9.termRef(2);
                  
                  {ESLVal n = $47;
                  
                  {ESLVal t = $46;
                  
                  {ESLVal e = $45;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = letrec.get(\"").add(n.add(new ESLVal("\");").add(nl.apply(indent))))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v9;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics,_v57).add(nl.apply(indent))))))))))))))))))))));
        }
        }
        }
      case "JBlock": {ESLVal $15 = _v6.termRef(0);
          
          {ESLVal cs = $15;
          
          return new ESLVal("{").add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v7 = $qualArg;
                
                {ESLVal _v56 = _v7;
                
                return ESLVal.list(ESLVal.list(ppJCommand.apply(indent,dynamics,_v56)));
              }
              }
            }
          }).map(cs).flatten().flatten()).add(new ESLVal("}")));
        }
        }
      case "JUpdate": {ESLVal $14 = _v6.termRef(0);
          ESLVal $13 = _v6.termRef(1);
          
          {ESLVal n = $14;
          
          {ESLVal e = $13;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0] = ").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"))));
          else
            {ESLVal _v54 = $14;
              
              {ESLVal _v55 = $13;
              
              return _v54.add(new ESLVal(" = ").add(ppJExp.apply(indent,dynamics,_v55).add(new ESLVal(";"))));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $12 = _v6.termRef(0);
          ESLVal $11 = _v6.termRef(1);
          ESLVal $10 = _v6.termRef(2);
          ESLVal $9 = _v6.termRef(3);
          
          {ESLVal listName = $12;
          
          {ESLVal varName = $11;
          
          {ESLVal e = $10;
          
          {ESLVal _v53 = $9;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,_v53).add(nl.apply(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}")))))))))))))))))))))))))));
        }
        }
        }
        }
        }
      case "JStatement": {ESLVal $8 = _v6.termRef(0);
          
          {ESLVal e = $8;
          
          return ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"));
        }
        }
        default: {ESLVal _v64 = _v6;
          
          return new ESLVal("******* unknown command: ").add(_v64);
        }
      }
      }
    }
  });
  private static ESLVal ppJFields = new ESLVal(new Function(new ESLVal("ppJFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal bs = $args[2];
  {ESLVal _v5 = bs;
        
        if(_v5.isCons())
        {ESLVal $6 = _v5.head();
          ESLVal $7 = _v5.tail();
          
          {ESLVal f = $6;
          
          {ESLVal _v52 = $7;
          
          return ppFieldDef.apply(indent,dynamics,f).add(nl.apply(indent).add(ppJFields.apply(indent,dynamics,_v52)));
        }
        }
        }
      else if(_v5.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(26769,26919)").add(ESLVal.list(_v5)));
      }
    }
  });
  private static ESLVal ppFieldDef = new ESLVal(new Function(new ESLVal("ppFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v4 = f;
        
        switch(_v4.termName) {
        case "JField": {ESLVal $5 = _v4.termRef(0);
          ESLVal $4 = _v4.termRef(1);
          ESLVal $3 = _v4.termRef(2);
          
          {ESLVal n = $5;
          
          {ESLVal t = $4;
          
          {ESLVal e = $3;
          
          if(member.apply(n,dynamics).boolVal)
          return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal("};")))));
          else
            {ESLVal _v49 = $5;
              
              {ESLVal _v50 = $4;
              
              {ESLVal _v51 = $3;
              
              return new ESLVal("ESLVal ").add(_v49.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v51).add(new ESLVal(";")))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(26983,27237)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal ppJTerm = new ESLVal(new Function(new ESLVal("ppJTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal n = $args[2];
  ESLVal es = $args[3];
  {ESLVal _v3 = es;
        
        if(_v3.isCons())
        {ESLVal $1 = _v3.head();
          ESLVal $2 = _v3.tail();
          
          {ESLVal _v47 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v47,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      else if(_v3.isNil())
        return new ESLVal("new Term(\"").add(n.add(new ESLVal("\")")));
      else {ESLVal _v48 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v48,new ESLVal(",")).add(new ESLVal(")")))));
        }
      }
    }
  });
  private static ESLVal ppJListExp = new ESLVal(new Function(new ESLVal("ppJListExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.list(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
    }
  });
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
          {ESLVal t = $t;
            
            if($true.boolVal)
            {new Function(new ESLVal("try"),getSelf()) {
              public ESLVal apply(ESLVal... args) { 
                try { 
                  return print.apply(ppExp.apply($zero,parse.apply(new ESLVal("esl/compiler/test1.esl"))));
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v1 = $x;
              
              {ESLVal message = _v1;
              
              return print.apply(new ESLVal("PP Error: ").add(message));
            }
            }
                }
              }
            }.apply();
            print.apply(new ESLVal("DONE"));
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