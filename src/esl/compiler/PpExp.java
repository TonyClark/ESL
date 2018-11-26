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
  {ESLVal _v49 = ss;
        
        if(_v49.isCons())
        {ESLVal $491 = _v49.head();
          ESLVal $492 = _v49.tail();
          
          if($492.isCons())
          {ESLVal $493 = $492.head();
            ESLVal $494 = $492.tail();
            
            if($494.isCons())
            {ESLVal $495 = $494.head();
              ESLVal $496 = $494.tail();
              
              {ESLVal s = $491;
              
              {ESLVal _v123 = $492;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v123)));
            }
            }
            }
          else if($494.isNil())
            {ESLVal s1 = $491;
              
              {ESLVal s2 = $493;
              
              return s1.add(nl.apply(indent).add(s2));
            }
            }
          else {ESLVal s = $491;
              
              {ESLVal _v124 = $492;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v124)));
            }
            }
          }
        else if($492.isNil())
          {ESLVal s = $491;
            
            return s;
          }
        else {ESLVal s = $491;
            
            {ESLVal _v125 = $492;
            
            return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v125)));
          }
          }
        }
      else if(_v49.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(441,599)").add(ESLVal.list(_v49)));
      }
    }
  });
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v47 = env;
        while(_v47.isCons()) {
          ESLVal _v46 = _v47.headVal;
          {ESLVal _v45 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v48 = _v46;
                    
                    switch(_v48.termName) {
                    case "Map": {ESLVal $490 = _v48.termRef(0);
                      ESLVal $489 = _v48.termRef(1);
                      
                      {ESLVal n = $490;
                      
                      {ESLVal t = $489;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v48;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v45.apply();
          }
          _v47 = _v47.tailVal;}
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
  {ESLVal _v44 = t;
        
        switch(_v44.termName) {
        case "ActType": {ESLVal $488 = _v44.termRef(0);
          ESLVal $487 = _v44.termRef(1);
          ESLVal $486 = _v44.termRef(2);
          
          {ESLVal l = $488;
          
          {ESLVal decs = $487;
          
          {ESLVal handlers = $486;
          
          return new ESLVal("").add(t);
        }
        }
        }
        }
      case "ApplyType": {ESLVal $485 = _v44.termRef(0);
          ESLVal $484 = _v44.termRef(1);
          ESLVal $483 = _v44.termRef(2);
          
          {ESLVal l = $485;
          
          {ESLVal n = $484;
          
          {ESLVal args = $483;
          
          return n.add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $482 = _v44.termRef(0);
          ESLVal $481 = _v44.termRef(1);
          ESLVal $480 = _v44.termRef(2);
          
          {ESLVal l = $482;
          
          {ESLVal op = $481;
          
          {ESLVal args = $480;
          
          return ppType.apply(op).add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $479 = _v44.termRef(0);
          ESLVal $478 = _v44.termRef(1);
          
          {ESLVal l = $479;
          
          {ESLVal _v122 = $478;
          
          return new ESLVal("Array[").add(ppType.apply(_v122).add(new ESLVal("]")));
        }
        }
        }
      case "BoolType": {ESLVal $477 = _v44.termRef(0);
          
          {ESLVal l = $477;
          
          return new ESLVal("Bool");
        }
        }
      case "FloatType": {ESLVal $476 = _v44.termRef(0);
          
          {ESLVal l = $476;
          
          return new ESLVal("Float");
        }
        }
      case "FieldType": {ESLVal $475 = _v44.termRef(0);
          ESLVal $474 = _v44.termRef(1);
          ESLVal $473 = _v44.termRef(2);
          
          {ESLVal l = $475;
          
          {ESLVal n = $474;
          
          {ESLVal _v121 = $473;
          
          return n.add(new ESLVal("::").add(ppType.apply(_v121)));
        }
        }
        }
        }
      case "ForallType": {ESLVal $472 = _v44.termRef(0);
          ESLVal $471 = _v44.termRef(1);
          ESLVal $470 = _v44.termRef(2);
          
          {ESLVal l = $472;
          
          {ESLVal ns = $471;
          
          {ESLVal _v120 = $470;
          
          return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v120))));
        }
        }
        }
        }
      case "FunType": {ESLVal $469 = _v44.termRef(0);
          ESLVal $468 = _v44.termRef(1);
          ESLVal $467 = _v44.termRef(2);
          
          {ESLVal l = $469;
          
          {ESLVal d = $468;
          
          {ESLVal r = $467;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $466 = _v44.termRef(0);
          ESLVal $465 = _v44.termRef(1);
          ESLVal $464 = _v44.termRef(2);
          ESLVal $463 = _v44.termRef(3);
          
          {ESLVal l = $466;
          
          {ESLVal d = $465;
          
          {ESLVal p = $464;
          
          {ESLVal r = $463;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $462 = _v44.termRef(0);
          
          {ESLVal l = $462;
          
          return new ESLVal("Int");
        }
        }
      case "ListType": {ESLVal $461 = _v44.termRef(0);
          ESLVal $460 = _v44.termRef(1);
          
          {ESLVal l = $461;
          
          {ESLVal _v119 = $460;
          
          return new ESLVal("[").add(ppType.apply(_v119).add(new ESLVal("]")));
        }
        }
        }
      case "NullType": {ESLVal $459 = _v44.termRef(0);
          
          {ESLVal l = $459;
          
          return new ESLVal("Null");
        }
        }
      case "RecType": {ESLVal $458 = _v44.termRef(0);
          ESLVal $457 = _v44.termRef(1);
          ESLVal $456 = _v44.termRef(2);
          
          {ESLVal l = $458;
          
          {ESLVal n = $457;
          
          {ESLVal _v118 = $456;
          
          return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v118))));
        }
        }
        }
        }
      case "RecordType": {ESLVal $455 = _v44.termRef(0);
          ESLVal $454 = _v44.termRef(1);
          
          {ESLVal l = $455;
          
          {ESLVal fs = $454;
          
          return new ESLVal("{").add(fs.add(new ESLVal("}")));
        }
        }
        }
      case "StrType": {ESLVal $453 = _v44.termRef(0);
          
          {ESLVal l = $453;
          
          return new ESLVal("Str");
        }
        }
      case "TableType": {ESLVal $452 = _v44.termRef(0);
          ESLVal $451 = _v44.termRef(1);
          ESLVal $450 = _v44.termRef(2);
          
          {ESLVal l = $452;
          
          {ESLVal k = $451;
          
          {ESLVal v = $450;
          
          return new ESLVal("Hash[").add(ppType.apply(k).add(new ESLVal(",").add(ppType.apply(v).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "TermType": {ESLVal $449 = _v44.termRef(0);
          ESLVal $448 = _v44.termRef(1);
          ESLVal $447 = _v44.termRef(2);
          
          {ESLVal l = $449;
          
          {ESLVal n = $448;
          
          {ESLVal ts = $447;
          
          return n.add(map.apply(ppType,ts));
        }
        }
        }
        }
      case "TypeFun": {ESLVal $446 = _v44.termRef(0);
          ESLVal $445 = _v44.termRef(1);
          ESLVal $444 = _v44.termRef(2);
          
          {ESLVal l = $446;
          
          {ESLVal ns = $445;
          
          {ESLVal _v117 = $444;
          
          return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v117))));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $443 = _v44.termRef(0);
          ESLVal $442 = _v44.termRef(1);
          
          {ESLVal l = $443;
          
          {ESLVal _v116 = $442;
          
          return new ESLVal("unfold ").add(ppType.apply(_v116));
        }
        }
        }
      case "UnionType": {ESLVal $441 = _v44.termRef(0);
          ESLVal $440 = _v44.termRef(1);
          
          {ESLVal l = $441;
          
          {ESLVal ts = $440;
          
          return new ESLVal("union ").add(map.apply(ppType,ts));
        }
        }
        }
      case "VarType": {ESLVal $439 = _v44.termRef(0);
          ESLVal $438 = _v44.termRef(1);
          
          {ESLVal l = $439;
          
          {ESLVal n = $438;
          
          return n;
        }
        }
        }
      case "VoidType": {ESLVal $437 = _v44.termRef(0);
          
          {ESLVal l = $437;
          
          return new ESLVal("Void");
        }
        }
      case "UnionRef": {ESLVal $436 = _v44.termRef(0);
          ESLVal $435 = _v44.termRef(1);
          ESLVal $434 = _v44.termRef(2);
          
          {ESLVal l = $436;
          
          {ESLVal _v115 = $435;
          
          {ESLVal n = $434;
          
          return ppType.apply(_v115).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $433 = _v44.termRef(0);
          
          {ESLVal f = $433;
          
          return f.add(new ESLVal(""));
        }
        }
        default: {ESLVal x = _v44;
          
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
  {ESLVal _v43 = exps;
        
        if(_v43.isCons())
        {ESLVal $429 = _v43.head();
          ESLVal $430 = _v43.tail();
          
          if($430.isCons())
          {ESLVal $431 = $430.head();
            ESLVal $432 = $430.tail();
            
            {ESLVal e1 = $429;
            
            {ESLVal e2 = $431;
            
            {ESLVal es = $432;
            
            return ppExp.apply(indent,e1).add(sep.add(ppExps.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($430.isNil())
          {ESLVal e = $429;
            
            return ppExp.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(2412,2570)").add(ESLVal.list(_v43)));
        }
      else if(_v43.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(2412,2570)").add(ESLVal.list(_v43)));
      }
    }
  });
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v42 = p;
        
        switch(_v42.termName) {
        case "PVar": {ESLVal $428 = _v42.termRef(0);
          ESLVal $427 = _v42.termRef(1);
          ESLVal $426 = _v42.termRef(2);
          
          {ESLVal l = $428;
          
          {ESLVal n = $427;
          
          {ESLVal t = $426;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $423 = _v42.termRef(0);
          ESLVal $422 = _v42.termRef(1);
          ESLVal $421 = _v42.termRef(2);
          ESLVal $420 = _v42.termRef(3);
          
          if($421.isCons())
          {ESLVal $424 = $421.head();
            ESLVal $425 = $421.tail();
            
            {ESLVal l = $423;
            
            {ESLVal n = $422;
            
            {ESLVal ts = $421;
            
            {ESLVal ps = $420;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
          }
        else if($421.isNil())
          {ESLVal l = $423;
            
            {ESLVal n = $422;
            
            {ESLVal ps = $420;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $423;
            
            {ESLVal n = $422;
            
            {ESLVal ts = $421;
            
            {ESLVal ps = $420;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $419 = _v42.termRef(0);
          ESLVal $418 = _v42.termRef(1);
          ESLVal $417 = _v42.termRef(2);
          
          {ESLVal l = $419;
          
          {ESLVal _v113 = $418;
          
          {ESLVal ts = $417;
          
          return ppPattern.apply(_v113);
        }
        }
        }
        }
      case "PNil": {ESLVal $416 = _v42.termRef(0);
          
          {ESLVal l = $416;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $415 = _v42.termRef(0);
          ESLVal $414 = _v42.termRef(1);
          
          {ESLVal l = $415;
          
          {ESLVal n = $414;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $413 = _v42.termRef(0);
          ESLVal $412 = _v42.termRef(1);
          
          {ESLVal l = $413;
          
          {ESLVal b = $412;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $411 = _v42.termRef(0);
          ESLVal $410 = _v42.termRef(1);
          
          {ESLVal l = $411;
          
          {ESLVal s = $410;
          
          return new ESLVal("\'").add(s.add(new ESLVal("\'")));
        }
        }
        }
      case "PCons": {ESLVal $409 = _v42.termRef(0);
          ESLVal $408 = _v42.termRef(1);
          ESLVal $407 = _v42.termRef(2);
          
          {ESLVal l = $409;
          
          {ESLVal h = $408;
          
          {ESLVal t = $407;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v114 = _v42;
          
          return new ESLVal("<unknown: ").add(_v114.add(new ESLVal(">")));
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
  {ESLVal _v41 = exp;
        
        switch(_v41.termName) {
        case "Module": {ESLVal $406 = _v41.termRef(0);
          ESLVal $405 = _v41.termRef(1);
          ESLVal $404 = _v41.termRef(2);
          ESLVal $403 = _v41.termRef(3);
          ESLVal $402 = _v41.termRef(4);
          ESLVal $401 = _v41.termRef(5);
          ESLVal $400 = _v41.termRef(6);
          
          {ESLVal path = $406;
          
          {ESLVal name = $405;
          
          {ESLVal exports = $404;
          
          {ESLVal imports = $403;
          
          {ESLVal x = $402;
          
          {ESLVal y = $401;
          
          {ESLVal defs = $400;
          
          return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(2)),defs).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "Var": {ESLVal $399 = _v41.termRef(0);
          ESLVal $398 = _v41.termRef(1);
          
          {ESLVal l = $399;
          
          {ESLVal n = $398;
          
          return n;
        }
        }
        }
      case "StrExp": {ESLVal $397 = _v41.termRef(0);
          ESLVal $396 = _v41.termRef(1);
          
          {ESLVal l = $397;
          
          {ESLVal v = $396;
          
          return new ESLVal("\'").add(v.add(new ESLVal("\'")));
        }
        }
        }
      case "IntExp": {ESLVal $395 = _v41.termRef(0);
          ESLVal $394 = _v41.termRef(1);
          
          {ESLVal l = $395;
          
          {ESLVal v = $394;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "BoolExp": {ESLVal $393 = _v41.termRef(0);
          ESLVal $392 = _v41.termRef(1);
          
          {ESLVal l = $393;
          
          {ESLVal v = $392;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "NullExp": {ESLVal $391 = _v41.termRef(0);
          
          {ESLVal l = $391;
          
          return new ESLVal("null");
        }
        }
      case "FloatExp": {ESLVal $390 = _v41.termRef(0);
          ESLVal $389 = _v41.termRef(1);
          
          {ESLVal l = $390;
          
          {ESLVal f = $389;
          
          return f.add(new ESLVal(""));
        }
        }
        }
      case "Apply": {ESLVal $388 = _v41.termRef(0);
          ESLVal $387 = _v41.termRef(1);
          ESLVal $386 = _v41.termRef(2);
          
          {ESLVal l = $388;
          
          {ESLVal op = $387;
          
          {ESLVal args = $386;
          
          return ppExp.apply(indent,op).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $385 = _v41.termRef(0);
          ESLVal $384 = _v41.termRef(1);
          ESLVal $383 = _v41.termRef(2);
          
          {ESLVal l = $385;
          
          {ESLVal op = $384;
          
          {ESLVal args = $383;
          
          return ppExp.apply(indent,op);
        }
        }
        }
        }
      case "Block": {ESLVal $382 = _v41.termRef(0);
          ESLVal $381 = _v41.termRef(1);
          
          {ESLVal l = $382;
          
          {ESLVal es = $381;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppExps.apply(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl.apply(indent).add(new ESLVal("}")))));
        }
        }
        }
      case "Case": {ESLVal $380 = _v41.termRef(0);
          ESLVal $379 = _v41.termRef(1);
          ESLVal $378 = _v41.termRef(2);
          ESLVal $377 = _v41.termRef(3);
          
          {ESLVal l = $380;
          
          {ESLVal ds = $379;
          
          {ESLVal es = $378;
          
          {ESLVal as = $377;
          
          return new ESLVal("case ").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun420"),getSelf()) {
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
      case "CaseTerm": {ESLVal $376 = _v41.termRef(0);
          ESLVal $375 = _v41.termRef(1);
          ESLVal $374 = _v41.termRef(2);
          ESLVal $373 = _v41.termRef(3);
          
          {ESLVal l = $376;
          
          {ESLVal e = $375;
          
          {ESLVal arms = $374;
          
          {ESLVal alt = $373;
          
          return new ESLVal("caseTerm ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun421"),getSelf()) {
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
      case "CaseList": {ESLVal $372 = _v41.termRef(0);
          ESLVal $371 = _v41.termRef(1);
          ESLVal $370 = _v41.termRef(2);
          ESLVal $369 = _v41.termRef(3);
          ESLVal $368 = _v41.termRef(4);
          
          {ESLVal l = $372;
          
          {ESLVal e = $371;
          
          {ESLVal cons = $370;
          
          {ESLVal nil = $369;
          
          {ESLVal alt = $368;
          
          return new ESLVal("caseList ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),cons).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),nil).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))))))))));
        }
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $367 = _v41.termRef(0);
          ESLVal $366 = _v41.termRef(1);
          ESLVal $365 = _v41.termRef(2);
          ESLVal $364 = _v41.termRef(3);
          
          {ESLVal l = $367;
          
          {ESLVal e = $366;
          
          {ESLVal arms = $365;
          
          {ESLVal alt = $364;
          
          return new ESLVal("caseInt ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun422"),getSelf()) {
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
      case "CaseStr": {ESLVal $363 = _v41.termRef(0);
          ESLVal $362 = _v41.termRef(1);
          ESLVal $361 = _v41.termRef(2);
          ESLVal $360 = _v41.termRef(3);
          
          {ESLVal l = $363;
          
          {ESLVal e = $362;
          
          {ESLVal arms = $361;
          
          {ESLVal alt = $360;
          
          return new ESLVal("caseStr ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun423"),getSelf()) {
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
      case "CaseBool": {ESLVal $359 = _v41.termRef(0);
          ESLVal $358 = _v41.termRef(1);
          ESLVal $357 = _v41.termRef(2);
          ESLVal $356 = _v41.termRef(3);
          
          {ESLVal l = $359;
          
          {ESLVal e = $358;
          
          {ESLVal arms = $357;
          
          {ESLVal alt = $356;
          
          return new ESLVal("caseBool ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun424"),getSelf()) {
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
      case "CaseError": {ESLVal $355 = _v41.termRef(0);
          ESLVal $354 = _v41.termRef(1);
          
          {ESLVal l = $355;
          
          {ESLVal e = $354;
          
          return new ESLVal("caseError()");
        }
        }
        }
      case "Head": {ESLVal $353 = _v41.termRef(0);
          
          {ESLVal e = $353;
          
          return new ESLVal("head(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Tail": {ESLVal $352 = _v41.termRef(0);
          
          {ESLVal e = $352;
          
          return new ESLVal("tail(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Cons": {ESLVal $351 = _v41.termRef(0);
          ESLVal $350 = _v41.termRef(1);
          
          {ESLVal h = $351;
          
          {ESLVal t = $350;
          
          return new ESLVal("cons(").add(ppExp.apply(indent,h).add(new ESLVal(",").add(ppExp.apply(indent,t).add(new ESLVal(")")))));
        }
        }
        }
      case "If": {ESLVal $349 = _v41.termRef(0);
          ESLVal $348 = _v41.termRef(1);
          ESLVal $347 = _v41.termRef(2);
          ESLVal $346 = _v41.termRef(3);
          
          {ESLVal l = $349;
          
          {ESLVal e1 = $348;
          
          {ESLVal e2 = $347;
          
          {ESLVal e3 = $346;
          
          return new ESLVal("if ").add(ppExp.apply(indent,e1).add(nl.apply(indent).add(new ESLVal("then").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(nl.apply(indent).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e3))))))))));
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $345 = _v41.termRef(0);
          ESLVal $344 = _v41.termRef(1);
          ESLVal $343 = _v41.termRef(2);
          ESLVal $342 = _v41.termRef(3);
          ESLVal $341 = _v41.termRef(4);
          
          {ESLVal l = $345;
          
          {ESLVal n = $344;
          
          {ESLVal args = $343;
          
          {ESLVal t = $342;
          
          {ESLVal e = $341;
          
          return new ESLVal("fun(").add(ppDecs.apply(indent,args).add(new ESLVal(")::").add(ppType.apply(t).add(new ESLVal(" ").add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        }
        }
        }
      case "Let": {ESLVal $340 = _v41.termRef(0);
          ESLVal $339 = _v41.termRef(1);
          ESLVal $338 = _v41.termRef(2);
          
          {ESLVal l = $340;
          
          {ESLVal bs = $339;
          
          {ESLVal e = $338;
          
          return new ESLVal("let ").add(ppBinds.apply(indent.add(new ESLVal(4)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "Letrec": {ESLVal $337 = _v41.termRef(0);
          ESLVal $336 = _v41.termRef(1);
          ESLVal $335 = _v41.termRef(2);
          
          {ESLVal l = $337;
          
          {ESLVal bs = $336;
          
          {ESLVal e = $335;
          
          return new ESLVal("letrec ").add(ppBinds.apply(indent.add(new ESLVal(7)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "List": {ESLVal $334 = _v41.termRef(0);
          ESLVal $333 = _v41.termRef(1);
          
          {ESLVal l = $334;
          
          {ESLVal es = $333;
          
          return new ESLVal("[").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal("]")));
        }
        }
        }
      case "Throw": {ESLVal $332 = _v41.termRef(0);
          ESLVal $331 = _v41.termRef(1);
          ESLVal $330 = _v41.termRef(2);
          
          {ESLVal l = $332;
          
          {ESLVal t = $331;
          
          {ESLVal e = $330;
          
          return new ESLVal("throw ").add(ppExp.apply(indent,e));
        }
        }
        }
        }
      case "Term": {ESLVal $329 = _v41.termRef(0);
          ESLVal $328 = _v41.termRef(1);
          ESLVal $327 = _v41.termRef(2);
          ESLVal $326 = _v41.termRef(3);
          
          {ESLVal l = $329;
          
          {ESLVal n = $328;
          
          {ESLVal ts = $327;
          
          {ESLVal es = $326;
          
          return n.add(new ESLVal("(").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $325 = _v41.termRef(0);
          ESLVal $324 = _v41.termRef(1);
          
          {ESLVal e = $325;
          
          {ESLVal n = $324;
          
          return new ESLVal("termRef(").add(ppExp.apply(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
        }
        }
        }
      case "BinExp": {ESLVal $323 = _v41.termRef(0);
          ESLVal $322 = _v41.termRef(1);
          ESLVal $321 = _v41.termRef(2);
          ESLVal $320 = _v41.termRef(3);
          
          {ESLVal l = $323;
          
          {ESLVal e1 = $322;
          
          {ESLVal op = $321;
          
          {ESLVal e2 = $320;
          
          return ppExp.apply(indent,e1).add(op.add(ppExp.apply(indent,e2)));
        }
        }
        }
        }
        }
      case "Update": {ESLVal $319 = _v41.termRef(0);
          ESLVal $318 = _v41.termRef(1);
          ESLVal $317 = _v41.termRef(2);
          
          {ESLVal l = $319;
          
          {ESLVal n = $318;
          
          {ESLVal e = $317;
          
          return n.add(new ESLVal(" := ").add(ppExp.apply(indent,e)));
        }
        }
        }
        }
      case "NewArray": {ESLVal $316 = _v41.termRef(0);
          ESLVal $315 = _v41.termRef(1);
          ESLVal $314 = _v41.termRef(2);
          
          {ESLVal l = $316;
          
          {ESLVal t = $315;
          
          {ESLVal n = $314;
          
          return new ESLVal("new Array[").add(ppType.apply(t).add(new ESLVal("](").add(ppExp.apply(indent,n).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "For": {ESLVal $313 = _v41.termRef(0);
          ESLVal $312 = _v41.termRef(1);
          ESLVal $311 = _v41.termRef(2);
          ESLVal $310 = _v41.termRef(3);
          
          {ESLVal l = $313;
          
          {ESLVal p = $312;
          
          {ESLVal e1 = $311;
          
          {ESLVal e2 = $310;
          
          return new ESLVal("for ").add(ppPattern.apply(p).add(new ESLVal(" in ").add(ppExp.apply(indent,e1).add(new ESLVal(" do {").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
        }
        }
        }
        }
        }
      case "Try": {ESLVal $309 = _v41.termRef(0);
          ESLVal $308 = _v41.termRef(1);
          ESLVal $307 = _v41.termRef(2);
          
          {ESLVal l = $309;
          
          {ESLVal e = $308;
          
          {ESLVal as = $307;
          
          return new ESLVal("try ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun425"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
      case "ActExp": {ESLVal $306 = _v41.termRef(0);
          ESLVal $305 = _v41.termRef(1);
          ESLVal $304 = _v41.termRef(2);
          ESLVal $303 = _v41.termRef(3);
          ESLVal $302 = _v41.termRef(4);
          ESLVal $301 = _v41.termRef(5);
          ESLVal $300 = _v41.termRef(6);
          ESLVal $299 = _v41.termRef(7);
          
          {ESLVal l = $306;
          
          {ESLVal n = $305;
          
          {ESLVal args = $304;
          
          {ESLVal x = $303;
          
          {ESLVal parent = $302;
          
          {ESLVal locals = $301;
          
          {ESLVal init = $300;
          
          {ESLVal handlers = $299;
          
          return new ESLVal("act ").add(ppExp.apply(indent,n).add(new ESLVal("(").add(ppDecs.apply(indent,args).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(5)),locals).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp.apply(indent.add(new ESLVal(4)),init).add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun426"),getSelf()) {
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
      case "Self": {ESLVal $298 = _v41.termRef(0);
          
          {ESLVal l = $298;
          
          return new ESLVal("self");
        }
        }
      case "Ref": {ESLVal $297 = _v41.termRef(0);
          ESLVal $296 = _v41.termRef(1);
          ESLVal $295 = _v41.termRef(2);
          
          {ESLVal l = $297;
          
          {ESLVal e = $296;
          
          {ESLVal n = $295;
          
          return ppExp.apply(indent,e).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "Send": {ESLVal $294 = _v41.termRef(0);
          ESLVal $293 = _v41.termRef(1);
          ESLVal $292 = _v41.termRef(2);
          
          {ESLVal l = $294;
          
          {ESLVal target = $293;
          
          {ESLVal message = $292;
          
          return ppExp.apply(indent,target).add(new ESLVal(" <- ").add(ppExp.apply(indent,message)));
        }
        }
        }
        }
      case "Cmp": {ESLVal $291 = _v41.termRef(0);
          ESLVal $290 = _v41.termRef(1);
          ESLVal $289 = _v41.termRef(2);
          
          {ESLVal l = $291;
          
          {ESLVal e = $290;
          
          {ESLVal qs = $289;
          
          return new ESLVal("[").add(ppExp.apply(indent,e).add(new ESLVal(" | ").add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun427"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal q = $args[0];
          return ppQual.apply(indent,q);
            }
          }),qs)).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "New": {ESLVal $288 = _v41.termRef(0);
          ESLVal $287 = _v41.termRef(1);
          ESLVal $286 = _v41.termRef(2);
          
          {ESLVal l = $288;
          
          {ESLVal b = $287;
          
          {ESLVal args = $286;
          
          return new ESLVal("new ").add(ppExp.apply(indent,b).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "NewJava": {ESLVal $285 = _v41.termRef(0);
          ESLVal $284 = _v41.termRef(1);
          ESLVal $283 = _v41.termRef(2);
          ESLVal $282 = _v41.termRef(3);
          
          {ESLVal l = $285;
          
          {ESLVal className = $284;
          
          {ESLVal t = $283;
          
          {ESLVal args = $282;
          
          return new ESLVal("javaNew[").add(ppType.apply(t).add(new ESLVal("](\' + className + ").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $281 = _v41.termRef(0);
          ESLVal $280 = _v41.termRef(1);
          ESLVal $279 = _v41.termRef(2);
          
          {ESLVal l = $281;
          
          {ESLVal rs = $280;
          
          {ESLVal e = $279;
          
          return new ESLVal("*********grab");
        }
        }
        }
        }
      case "Probably": {ESLVal $278 = _v41.termRef(0);
          ESLVal $277 = _v41.termRef(1);
          ESLVal $276 = _v41.termRef(2);
          ESLVal $275 = _v41.termRef(3);
          ESLVal $274 = _v41.termRef(4);
          
          {ESLVal l = $278;
          
          {ESLVal p = $277;
          
          {ESLVal t = $276;
          
          {ESLVal e1 = $275;
          
          {ESLVal e2 = $274;
          
          return new ESLVal("**** probably");
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $273 = _v41.termRef(0);
          ESLVal $272 = _v41.termRef(1);
          
          {ESLVal l = $273;
          
          {ESLVal e = $272;
          
          return new ESLVal("not(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
        }
      case "Fold": {ESLVal $271 = _v41.termRef(0);
          ESLVal $270 = _v41.termRef(1);
          ESLVal $269 = _v41.termRef(2);
          
          {ESLVal l = $271;
          
          {ESLVal t = $270;
          
          {ESLVal e = $269;
          
          return new ESLVal("******** fold");
        }
        }
        }
        }
      case "Unfold": {ESLVal $268 = _v41.termRef(0);
          ESLVal $267 = _v41.termRef(1);
          ESLVal $266 = _v41.termRef(2);
          
          {ESLVal l = $268;
          
          {ESLVal t = $267;
          
          {ESLVal e = $266;
          
          return new ESLVal("******unfold");
        }
        }
        }
        }
      case "Now": {ESLVal $265 = _v41.termRef(0);
          
          {ESLVal l = $265;
          
          return new ESLVal("now");
        }
        }
      case "Become": {ESLVal $264 = _v41.termRef(0);
          ESLVal $263 = _v41.termRef(1);
          
          {ESLVal l = $264;
          
          {ESLVal e = $263;
          
          return new ESLVal("become ").add(ppExp.apply(indent,e));
        }
        }
        }
      case "ArrayRef": {ESLVal $262 = _v41.termRef(0);
          ESLVal $261 = _v41.termRef(1);
          ESLVal $260 = _v41.termRef(2);
          
          {ESLVal l = $262;
          
          {ESLVal a = $261;
          
          {ESLVal i = $260;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("]"))));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $259 = _v41.termRef(0);
          ESLVal $258 = _v41.termRef(1);
          ESLVal $257 = _v41.termRef(2);
          ESLVal $256 = _v41.termRef(3);
          
          {ESLVal l = $259;
          
          {ESLVal a = $258;
          
          {ESLVal i = $257;
          
          {ESLVal v = $256;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("] := ").add(ppExp.apply(indent,v)))));
        }
        }
        }
        }
        }
        default: {ESLVal x = _v41;
          
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
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun428"),getSelf()) {
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
  {ESLVal _v40 = d;
        
        switch(_v40.termName) {
        case "Dec": {ESLVal $255 = _v40.termRef(0);
          ESLVal $254 = _v40.termRef(1);
          ESLVal $253 = _v40.termRef(2);
          ESLVal $252 = _v40.termRef(3);
          
          {ESLVal l = $255;
          
          {ESLVal n = $254;
          
          {ESLVal dt = $253;
          
          {ESLVal t = $252;
          
          return n.add(new ESLVal("::").add(ppType.apply(t)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9565,9642)").add(ESLVal.list(_v40)));
      }
      }
    }
  });
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun429"),getSelf()) {
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
  {ESLVal _v39 = b;
        
        switch(_v39.termName) {
        case "Binding": {ESLVal $251 = _v39.termRef(0);
          ESLVal $250 = _v39.termRef(1);
          ESLVal $249 = _v39.termRef(2);
          ESLVal $248 = _v39.termRef(3);
          ESLVal $247 = _v39.termRef(4);
          
          {ESLVal l = $251;
          
          {ESLVal name = $250;
          
          {ESLVal t = $249;
          
          {ESLVal st = $248;
          
          {ESLVal value = $247;
          
          return name.add(new ESLVal("=").add(ppExp.apply(indent,value).add(new ESLVal(";"))));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $246 = _v39.termRef(0);
          ESLVal $245 = _v39.termRef(1);
          ESLVal $244 = _v39.termRef(2);
          ESLVal $243 = _v39.termRef(3);
          
          {ESLVal l = $246;
          
          {ESLVal name = $245;
          
          {ESLVal t = $244;
          
          {ESLVal ignore = $243;
          
          return new ESLVal("type ").add(name);
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $242 = _v39.termRef(0);
          ESLVal $241 = _v39.termRef(1);
          ESLVal $240 = _v39.termRef(2);
          ESLVal $239 = _v39.termRef(3);
          
          {ESLVal l = $242;
          
          {ESLVal name = $241;
          
          {ESLVal t = $240;
          
          {ESLVal ignore = $239;
          
          return new ESLVal("data ").add(name);
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $238 = _v39.termRef(0);
          ESLVal $237 = _v39.termRef(1);
          ESLVal $236 = _v39.termRef(2);
          ESLVal $235 = _v39.termRef(3);
          ESLVal $234 = _v39.termRef(4);
          ESLVal $233 = _v39.termRef(5);
          ESLVal $232 = _v39.termRef(6);
          
          {ESLVal l = $238;
          
          {ESLVal name = $237;
          
          {ESLVal args = $236;
          
          {ESLVal t = $235;
          
          {ESLVal st = $234;
          
          {ESLVal body = $233;
          
          {ESLVal guard = $232;
          
          return name.add(new ESLVal("(").add(ppPatterns.apply(args).add(new ESLVal(") = ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),body))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $231 = _v39.termRef(0);
          ESLVal $230 = _v39.termRef(1);
          ESLVal $229 = _v39.termRef(2);
          ESLVal $228 = _v39.termRef(3);
          
          {ESLVal l = $231;
          
          {ESLVal name = $230;
          
          {ESLVal t = $229;
          
          {ESLVal ignore = $228;
          
          return name;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v39;
          
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
  {ESLVal _v38 = a;
        
        switch(_v38.termName) {
        case "BArm": {ESLVal $227 = _v38.termRef(0);
          ESLVal $226 = _v38.termRef(1);
          ESLVal $225 = _v38.termRef(2);
          ESLVal $224 = _v38.termRef(3);
          
          {ESLVal l = $227;
          
          {ESLVal ps = $226;
          
          {ESLVal guard = $225;
          
          {ESLVal e = $224;
          
          return ppPatterns.apply(ps).add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10427,10565)").add(ESLVal.list(_v38)));
      }
      }
    }
  });
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal arms = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun430"),getSelf()) {
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
  {ESLVal _v37 = a;
        
        switch(_v37.termName) {
        case "TArm": {ESLVal $223 = _v37.termRef(0);
          ESLVal $222 = _v37.termRef(1);
          
          {ESLVal n = $223;
          
          {ESLVal e = $222;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10727,10827)").add(ESLVal.list(_v37)));
      }
      }
    }
  });
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v36 = a;
        
        switch(_v36.termName) {
        case "IArm": {ESLVal $221 = _v36.termRef(0);
          ESLVal $220 = _v36.termRef(1);
          
          {ESLVal n = $221;
          
          {ESLVal e = $220;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10883,10983)").add(ESLVal.list(_v36)));
      }
      }
    }
  });
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v35 = a;
        
        switch(_v35.termName) {
        case "SArm": {ESLVal $219 = _v35.termRef(0);
          ESLVal $218 = _v35.termRef(1);
          
          {ESLVal n = $219;
          
          {ESLVal e = $218;
          
          return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11039,11153)").add(ESLVal.list(_v35)));
      }
      }
    }
  });
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v34 = a;
        
        switch(_v34.termName) {
        case "BoolArm": {ESLVal $217 = _v34.termRef(0);
          ESLVal $216 = _v34.termRef(1);
          
          {ESLVal b = $217;
          
          {ESLVal e = $216;
          
          return b.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11211,11315)").add(ESLVal.list(_v34)));
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
        
        {ESLVal _v33 = sourceFile;
        
        switch(_v33.strVal) {
        case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        default: {ESLVal x = _v33;
          
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
  {ESLVal _v32 = m;
        
        switch(_v32.termName) {
        case "JModule": {ESLVal $215 = _v32.termRef(0);
          ESLVal $214 = _v32.termRef(1);
          ESLVal $213 = _v32.termRef(2);
          ESLVal $212 = _v32.termRef(3);
          
          {ESLVal n = $215;
          
          {ESLVal exports = $214;
          
          {ESLVal imports = $213;
          
          {ESLVal fields = $212;
          
          return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl.apply($zero).add(new ESLVal("import esl.lib.*;").add(nl.apply($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl.apply($zero).add(ppJoin.apply($zero,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal i = $l0.head();
                $l0 = $l0.tail();
                $v.add(getImport.apply(i));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(imports)).add(nl.apply($zero).add(new ESLVal("import java.util.function.Supplier;").add(nl.apply($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl.apply(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl.apply(new ESLVal(2)).add(ppJoin.apply(new ESLVal(2),map.apply(new ESLVal(new Function(new ESLVal("fun431"),getSelf()) {
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
        default: return error(new ESLVal("case error at Pos(11710,12472)").add(ESLVal.list(_v32)));
      }
      }
    }
  });
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exports = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v31 = f;
        
        switch(_v31.termName) {
        case "JField": {ESLVal $211 = _v31.termRef(0);
          ESLVal $210 = _v31.termRef(1);
          ESLVal $209 = _v31.termRef(2);
          
          switch($211.strVal) {
          case "edb": switch($209.termName) {
            case "JNull": {
              {ESLVal t = $210;
              
              return new ESLVal("// static ESLVal edb = null;");
            }
            }
            default: {ESLVal n = $211;
              
              {ESLVal t = $210;
              
              {ESLVal e = $209;
              
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
          default: {ESLVal n = $211;
            
            {ESLVal t = $210;
            
            {ESLVal e = $209;
            
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
        default: return error(new ESLVal("case error at Pos(12541,12791)").add(ESLVal.list(_v31)));
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
  {ESLVal _v30 = exps;
        
        if(_v30.isCons())
        {ESLVal $205 = _v30.head();
          ESLVal $206 = _v30.tail();
          
          if($206.isCons())
          {ESLVal $207 = $206.head();
            ESLVal $208 = $206.tail();
            
            {ESLVal e1 = $205;
            
            {ESLVal e2 = $207;
            
            {ESLVal es = $208;
            
            return ppJExp.apply(indent,dynamics,e1).add(sep.add(ppJExps.apply(indent,dynamics,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($206.isNil())
          {ESLVal e = $205;
            
            return ppJExp.apply(indent,dynamics,e);
          }
        else return error(new ESLVal("case error at Pos(12861,13055)").add(ESLVal.list(_v30)));
        }
      else if(_v30.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(12861,13055)").add(ESLVal.list(_v30)));
      }
    }
  });
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal decs = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v29 = decs;
        
        if(_v29.isCons())
        {ESLVal $201 = _v29.head();
          ESLVal $202 = _v29.tail();
          
          if($202.isCons())
          {ESLVal $203 = $202.head();
            ESLVal $204 = $202.tail();
            
            {ESLVal e1 = $201;
            
            {ESLVal e2 = $203;
            
            {ESLVal es = $204;
            
            return pJDec.apply(indent,e1).add(sep.add(ppJDecs.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($202.isNil())
          {ESLVal e = $201;
            
            return pJDec.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(13117,13329)").add(ESLVal.list(_v29)));
        }
      else if(_v29.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(13117,13329)").add(ESLVal.list(_v29)));
      }
    }
  });
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v28 = d;
        
        switch(_v28.termName) {
        case "JDec": {ESLVal $200 = _v28.termRef(0);
          ESLVal $199 = _v28.termRef(1);
          
          {ESLVal n = $200;
          
          {ESLVal t = $199;
          
          return new ESLVal("ESLVal ").add(n);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(13375,13431)").add(ESLVal.list(_v28)));
      }
      }
    }
  });
  private static ESLVal ppJExp = new ESLVal(new Function(new ESLVal("ppJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v25 = e;
        
        switch(_v25.termName) {
        case "JArrayRef": {ESLVal $192 = _v25.termRef(0);
          ESLVal $191 = _v25.termRef(1);
          
          {ESLVal a = $192;
          
          {ESLVal i = $191;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal]"))));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $190 = _v25.termRef(0);
          ESLVal $189 = _v25.termRef(1);
          ESLVal $188 = _v25.termRef(2);
          
          {ESLVal a = $190;
          
          {ESLVal i = $189;
          
          {ESLVal v = $188;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp.apply(indent,dynamics,v)))));
        }
        }
        }
        }
      case "JBecome": {ESLVal $185 = _v25.termRef(0);
          ESLVal $184 = _v25.termRef(1);
          
          if($184.isCons())
          {ESLVal $186 = $184.head();
            ESLVal $187 = $184.tail();
            
            {ESLVal _v109 = $185;
            
            {ESLVal es = $184;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v109).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($184.isNil())
          {ESLVal _v110 = $185;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v110).add(new ESLVal(",getSelf())")));
          }
        else {ESLVal _v111 = $185;
            
            {ESLVal es = $184;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v111).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JConstExp": {ESLVal $179 = _v25.termRef(0);
          
          switch($179.termName) {
          case "JConstInt": {ESLVal $183 = $179.termRef(0);
            
            switch($183.intVal) {
            case 0: return new ESLVal("$zero");
          case 1: return new ESLVal("$one");
            default: {ESLVal n = $183;
              
              return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
            }
          }
          }
        case "JConstBool": {ESLVal $182 = $179.termRef(0);
            
            switch($182.boolVal ? 1 : 0) {
            case 1: return new ESLVal("$true");
          case 0: return new ESLVal("$false");
            default: {ESLVal _v107 = _v25;
              
              return new ESLVal("********** unknown expression: ").add(_v107);
            }
          }
          }
        case "JConstStr": {ESLVal $181 = $179.termRef(0);
            
            {ESLVal s = $181;
            
            return new ESLVal("new ESLVal(\"").add(javaString.apply(s).add(new ESLVal("\")")));
          }
          }
        case "JConstDouble": {ESLVal $180 = $179.termRef(0);
            
            {ESLVal d = $180;
            
            return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
          }
          }
          default: {ESLVal _v108 = _v25;
            
            return new ESLVal("********** unknown expression: ").add(_v108);
          }
        }
        }
      case "JNot": {ESLVal $178 = _v25.termRef(0);
          
          {ESLVal _v106 = $178;
          
          return ppJExp.apply(indent,dynamics,_v106).add(new ESLVal(".not()"));
        }
        }
      case "JNil": {ESLVal $177 = _v25.termRef(0);
          
          {ESLVal t = $177;
          
          return new ESLVal("$nil");
        }
        }
      case "JList": {ESLVal $176 = _v25.termRef(0);
          ESLVal $175 = _v25.termRef(1);
          
          {ESLVal t = $176;
          
          {ESLVal es = $175;
          
          return ppJListExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JSet": {ESLVal $174 = _v25.termRef(0);
          ESLVal $173 = _v25.termRef(1);
          
          {ESLVal t = $174;
          
          {ESLVal es = $173;
          
          return ppJSetExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JBag": {ESLVal $172 = _v25.termRef(0);
          ESLVal $171 = _v25.termRef(1);
          
          {ESLVal t = $172;
          
          {ESLVal es = $171;
          
          return ppJBagExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JTerm": {ESLVal $168 = _v25.termRef(0);
          ESLVal $167 = _v25.termRef(1);
          
          if($167.isCons())
          {ESLVal $169 = $167.head();
            ESLVal $170 = $167.tail();
            
            {ESLVal n = $168;
            
            {ESLVal es = $167;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($167.isNil())
          {ESLVal n = $168;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
          }
        else {ESLVal n = $168;
            
            {ESLVal es = $167;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JFun": {ESLVal $166 = _v25.termRef(0);
          ESLVal $165 = _v25.termRef(1);
          ESLVal $164 = _v25.termRef(2);
          ESLVal $163 = _v25.termRef(3);
          
          {ESLVal n = $166;
          
          {ESLVal args = $165;
          
          {ESLVal t = $164;
          
          {ESLVal body = $163;
          
          return ppJFun.apply(indent,dynamics,n,args,t,body);
        }
        }
        }
        }
        }
      case "JBinExp": {ESLVal $162 = _v25.termRef(0);
          ESLVal $161 = _v25.termRef(1);
          ESLVal $160 = _v25.termRef(2);
          
          switch($161.strVal) {
          case "at": {ESLVal e1 = $162;
            
            {ESLVal e2 = $160;
            
            return new ESLVal("at(() -> { return ").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal("; },() -> { return ").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal("; })")))));
          }
          }
        case "==": {ESLVal e1 = $162;
            
            {ESLVal e2 = $160;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))));
          }
          }
        case "cons": {ESLVal e1 = $162;
            
            {ESLVal e2 = $160;
            
            return ppJExp.apply(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(")"))));
          }
          }
          default: {ESLVal e1 = $162;
            
            {ESLVal op = $161;
            
            {ESLVal e2 = $160;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".").add(op.add(new ESLVal("(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))))));
          }
          }
          }
        }
        }
      case "JCmpExp": {ESLVal $159 = _v25.termRef(0);
          
          {ESLVal c = $159;
          
          return ppJCmp.apply(indent,dynamics,c);
        }
        }
      case "JNull": {
          return new ESLVal("$null");
        }
      case "JNow": {
          return new ESLVal("now()");
        }
      case "JVar": {ESLVal $158 = _v25.termRef(0);
          ESLVal $157 = _v25.termRef(1);
          
          {ESLVal n = $158;
          
          {ESLVal t = $157;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0]"));
          else
            {ESLVal _v104 = $158;
              
              {ESLVal _v105 = $157;
              
              return _v104;
            }
            }
        }
        }
        }
      case "JError": {ESLVal $156 = _v25.termRef(0);
          
          {ESLVal _v103 = $156;
          
          return new ESLVal("error(").add(ppJExp.apply(indent,dynamics,_v103).add(new ESLVal(")")));
        }
        }
      case "JApply": {ESLVal $155 = _v25.termRef(0);
          ESLVal $154 = _v25.termRef(1);
          
          {ESLVal _v102 = $155;
          
          {ESLVal es = $154;
          
          return ppJExp.apply(indent,dynamics,_v102).add(new ESLVal(".apply(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
      case "JCommandExp": {ESLVal $153 = _v25.termRef(0);
          ESLVal $152 = _v25.termRef(1);
          
          {ESLVal c = $153;
          
          {ESLVal t = $152;
          
          return new ESLVal("((Supplier<ESLVal>)() -> { ").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c).add(nl.apply(indent).add(new ESLVal("}).get()")))));
        }
        }
        }
      case "JIfExp": {ESLVal $151 = _v25.termRef(0);
          ESLVal $150 = _v25.termRef(1);
          ESLVal $149 = _v25.termRef(2);
          
          {ESLVal _v101 = $151;
          
          {ESLVal e1 = $150;
          
          {ESLVal e2 = $149;
          
          return new ESLVal("(").add(ppJExp.apply(indent,dynamics,_v101).add(new ESLVal(".boolVal) ? (").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")")))))));
        }
        }
        }
        }
      case "JHead": {ESLVal $148 = _v25.termRef(0);
          
          {ESLVal _v100 = $148;
          
          return ppJExp.apply(indent,dynamics,_v100).add(new ESLVal(".head()"));
        }
        }
      case "JTail": {ESLVal $147 = _v25.termRef(0);
          
          {ESLVal _v99 = $147;
          
          return ppJExp.apply(indent,dynamics,_v99).add(new ESLVal(".tail()"));
        }
        }
      case "JTermRef": {ESLVal $146 = _v25.termRef(0);
          ESLVal $145 = _v25.termRef(1);
          
          {ESLVal _v98 = $146;
          
          {ESLVal n = $145;
          
          return ppJExp.apply(indent,dynamics,_v98).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
        }
        }
        }
      case "JMapFun": {ESLVal $144 = _v25.termRef(0);
          ESLVal $143 = _v25.termRef(1);
          
          {ESLVal f = $144;
          
          {ESLVal l = $143;
          
          return ppJExp.apply(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(")"))));
        }
        }
        }
      case "JFlatten": {ESLVal $142 = _v25.termRef(0);
          
          {ESLVal ls = $142;
          
          return ppJExp.apply(indent,dynamics,ls).add(new ESLVal(".flatten()"));
        }
        }
      case "JBehaviour": {ESLVal $137 = _v25.termRef(0);
          ESLVal $136 = _v25.termRef(1);
          ESLVal $135 = _v25.termRef(2);
          ESLVal $134 = _v25.termRef(3);
          ESLVal $133 = _v25.termRef(4);
          
          switch($134.termName) {
          case "JFun": {ESLVal $141 = $134.termRef(0);
            ESLVal $140 = $134.termRef(1);
            ESLVal $139 = $134.termRef(2);
            ESLVal $138 = $134.termRef(3);
            
            {ESLVal es = $137;
            
            {ESLVal fs = $136;
            
            {ESLVal init = $135;
            
            {ESLVal n = $141;
            
            {ESLVal args = $140;
            
            {ESLVal t = $139;
            
            {ESLVal body = $138;
            
            {ESLVal time = $133;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";"))))));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(es)).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"ref illegal \" + self + \".\" + name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _v97 = _v25;
            
            return new ESLVal("********** unknown expression: ").add(_v97);
          }
        }
        }
      case "JExtendedBehaviour": {ESLVal $128 = _v25.termRef(0);
          ESLVal $127 = _v25.termRef(1);
          ESLVal $126 = _v25.termRef(2);
          ESLVal $125 = _v25.termRef(3);
          ESLVal $124 = _v25.termRef(4);
          ESLVal $123 = _v25.termRef(5);
          
          switch($124.termName) {
          case "JFun": {ESLVal $132 = $124.termRef(0);
            ESLVal $131 = $124.termRef(1);
            ESLVal $130 = $124.termRef(2);
            ESLVal $129 = $124.termRef(3);
            
            {ESLVal es = $128;
            
            {ESLVal parent = $127;
            
            {ESLVal fs = $126;
            
            {ESLVal init = $125;
            
            {ESLVal n = $132;
            
            {ESLVal args = $131;
            
            {ESLVal t = $130;
            
            {ESLVal body = $129;
            
            {ESLVal time = $123;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(ppBehaviourParent.apply(indent,dynamics,parent).add(new ESLVal(",").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";"))))));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(es)).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: return refSuper(name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))))));
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
          default: {ESLVal _v96 = _v25;
            
            return new ESLVal("********** unknown expression: ").add(_v96);
          }
        }
        }
      case "JNew": {ESLVal $120 = _v25.termRef(0);
          ESLVal $119 = _v25.termRef(1);
          
          if($119.isCons())
          {ESLVal $121 = $119.head();
            ESLVal $122 = $119.tail();
            
            {ESLVal b = $120;
            
            {ESLVal args = $119;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($119.isNil())
          {ESLVal b = $120;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
          }
        else {ESLVal b = $120;
            
            {ESLVal args = $119;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JNewArray": {ESLVal $118 = _v25.termRef(0);
          
          {ESLVal i = $118;
          
          return new ESLVal("newArray(").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal)")));
        }
        }
      case "JNewTable": {
          return new ESLVal("newTable()");
        }
      case "JNewJava": {ESLVal $115 = _v25.termRef(0);
          ESLVal $114 = _v25.termRef(1);
          
          if($114.isCons())
          {ESLVal $116 = $114.head();
            ESLVal $117 = $114.tail();
            
            {ESLVal n = $115;
            
            {ESLVal args = $114;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($114.isNil())
          {ESLVal n = $115;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
          }
        else {ESLVal n = $115;
            
            {ESLVal args = $114;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JRecord": {ESLVal $113 = _v25.termRef(0);
          
          {ESLVal fs = $113;
          
          return new ESLVal("newRecord(new ESLVal[]{").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v26 = $qualArg;
                
                switch(_v26.termName) {
                case "JField": {ESLVal $195 = _v26.termRef(0);
                  ESLVal $194 = _v26.termRef(1);
                  ESLVal $193 = _v26.termRef(2);
                  
                  {ESLVal n = $195;
                  
                  {ESLVal t = $194;
                  
                  {ESLVal _v94 = $193;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JConstExp",new ESLVal("JConstStr",n))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v26;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal("},").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                switch(_v27.termName) {
                case "JField": {ESLVal $198 = _v27.termRef(0);
                  ESLVal $197 = _v27.termRef(1);
                  ESLVal $196 = _v27.termRef(2);
                  
                  {ESLVal n = $198;
                  
                  {ESLVal t = $197;
                  
                  {ESLVal _v95 = $196;
                  
                  return ESLVal.list(ESLVal.list(_v95));
                }
                }
                }
                }
                default: {ESLVal _0 = _v27;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      case "JSend": {ESLVal $110 = _v25.termRef(0);
          ESLVal $109 = _v25.termRef(1);
          ESLVal $108 = _v25.termRef(2);
          
          if($108.isCons())
          {ESLVal $111 = $108.head();
            ESLVal $112 = $108.tail();
            
            {ESLVal _v91 = $110;
            
            {ESLVal m = $109;
            
            {ESLVal args = $108;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v91).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
          }
        else if($108.isNil())
          {ESLVal _v92 = $110;
            
            {ESLVal m = $109;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v92).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
          }
          }
        else {ESLVal _v93 = $110;
            
            {ESLVal m = $109;
            
            {ESLVal args = $108;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v93).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
        }
      case "JSendSuper": {ESLVal $107 = _v25.termRef(0);
          
          {ESLVal _v90 = $107;
          
          return new ESLVal("sendSuper(").add(ppJExp.apply(indent,dynamics,_v90).add(new ESLVal(")")));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("sendTimeSuper($t)");
        }
      case "JSelf": {
          return new ESLVal("getSelf()");
        }
      case "JRef": {ESLVal $106 = _v25.termRef(0);
          ESLVal $105 = _v25.termRef(1);
          
          {ESLVal _v89 = $106;
          
          {ESLVal n = $105;
          
          return ppJExp.apply(indent,dynamics,_v89).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
        }
        }
        }
      case "JRefSuper": {ESLVal $104 = _v25.termRef(0);
          
          {ESLVal n = $104;
          
          return new ESLVal("refSuper(\"").add(n.add(new ESLVal("\")")));
        }
        }
      case "JGrab": {ESLVal $103 = _v25.termRef(0);
          ESLVal $102 = _v25.termRef(1);
          
          {ESLVal es = $103;
          
          {ESLVal c = $102;
          
          return new ESLVal("lock(new Function(new ESLVal(\"grab\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal ...args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent,dynamics,c).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}},").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))))))))));
        }
        }
        }
      case "JTry": {ESLVal $101 = _v25.termRef(0);
          ESLVal $100 = _v25.termRef(1);
          ESLVal $99 = _v25.termRef(2);
          
          {ESLVal _v88 = $101;
          
          {ESLVal n = $100;
          
          {ESLVal c = $99;
          
          return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(4)),dynamics,_v88).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl.apply(indent.add(new ESLVal(6))).add(ppJCommand.apply(indent,dynamics,c).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
        }
        }
        }
        }
      case "JProbably": {ESLVal $98 = _v25.termRef(0);
          ESLVal $97 = _v25.termRef(1);
          ESLVal $96 = _v25.termRef(2);
          
          {ESLVal _v87 = $98;
          
          {ESLVal e1 = $97;
          
          {ESLVal e2 = $96;
          
          return new ESLVal("probably(").add(ppJExp.apply(indent,dynamics,_v87).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e1)).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e2)).add(new ESLVal(")")))))));
        }
        }
        }
        }
        default: {ESLVal _v112 = _v25;
          
          return new ESLVal("********** unknown expression: ").add(_v112);
        }
      }
      }
    }
  });
  private static ESLVal ppJCmp = new ESLVal(new Function(new ESLVal("ppJCmp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  LetRec letrec = new LetRec() {
        ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v82 = $args[0];
          ESLVal _v81 = $args[1];
          ESLVal _v80 = $args[2];
          {ESLVal _v23 = _v80;
                
                switch(_v23.termName) {
                case "JCmpBind": {ESLVal $92 = _v23.termRef(0);
                  ESLVal $91 = _v23.termRef(1);
                  ESLVal $90 = _v23.termRef(2);
                  
                  {ESLVal n = $92;
                  
                  {ESLVal e = $91;
                  
                  {ESLVal _v84 = $90;
                  
                  return new ESLVal("ESLVal $l").add(_v81.add(new ESLVal(" = ").add(ppJExp.apply(_v82,dynamics,e).add(new ESLVal(";").add(nl.apply(_v82).add(new ESLVal("while(!$l").add(_v81.add(new ESLVal(".isNil()) {").add(nl.apply(_v82.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l").add(_v81.add(new ESLVal(".head();").add(nl.apply(_v82.add(new ESLVal(2))).add(new ESLVal("$l").add(_v81.add(new ESLVal(" = $l").add(_v81.add(new ESLVal(".tail();").add(nl.apply(_v82.add(new ESLVal(2))).add(inner.apply(_v82.add(new ESLVal(2)),_v81.add($one),_v84).add(nl.apply(_v82).add(new ESLVal("}")))))))))))))))))))))))));
                }
                }
                }
                }
              case "JCmpList": {ESLVal $89 = _v23.termRef(0);
                  
                  {ESLVal e = $89;
                  
                  return new ESLVal("$v.add(").add(ppJExp.apply(_v82,dynamics,e).add(new ESLVal(");")));
                }
                }
              case "JCmpIf": {ESLVal $88 = _v23.termRef(0);
                  ESLVal $87 = _v23.termRef(1);
                  
                  {ESLVal e = $88;
                  
                  {ESLVal _v83 = $87;
                  
                  return new ESLVal("if(").add(ppJExp.apply(_v82,dynamics,e).add(new ESLVal(".boolVal) {").add(inner.apply(_v82,_v81,_v83).add(nl.apply(_v82).add(new ESLVal("}"))))));
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(21287,21888)").add(ESLVal.list(_v23)));
              }
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
      
        {ESLVal _v24 = c;
        
        switch(_v24.termName) {
        case "JCmpOuter": {ESLVal $95 = _v24.termRef(0);
          ESLVal $94 = _v24.termRef(1);
          ESLVal $93 = _v24.termRef(2);
          
          {ESLVal n = $95;
          
          {ESLVal e = $94;
          
          {ESLVal _v85 = $93;
          
          return new ESLVal("new java.util.function.Function<ESLVal,ESLVal>() {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal $l0) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal $a = $nil;").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("while(!$l0.isNil()) { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l0.head();").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("$l0 = $l0.tail();").add(nl.apply(indent.add(new ESLVal(6))).add(inner.apply(indent,$one,_v85).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return $a;").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}}.apply(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(")")))))))))))))))))))))))))));
        }
        }
        }
        }
        default: {ESLVal _v86 = _v24;
          
          return new ESLVal("// Illegal Comprehension ").add(_v86);
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
  {ESLVal _v22 = e;
        
        switch(_v22.termName) {
        case "JApply": {ESLVal $86 = _v22.termRef(0);
          ESLVal $85 = _v22.termRef(1);
          
          {ESLVal op = $86;
          
          {ESLVal args = $85;
          
          return new ESLVal("getParent(getSelf(),").add(ppJExp.apply(indent,dynamics,op).add(new ESLVal(",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        default: {ESLVal _v79 = _v22;
          
          return ppJExp.apply(indent,dynamics,_v79);
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
          {ESLVal _v20 = $qualArg;
                
                switch(_v20.termName) {
                case "JDec": {ESLVal $82 = _v20.termRef(0);
                  ESLVal $81 = _v20.termRef(1);
                  
                  {ESLVal _v75 = $82;
                  
                  {ESLVal _v76 = $81;
                  
                  return ESLVal.list(ESLVal.list(_v75));
                }
                }
                }
                default: {ESLVal _0 = _v20;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal boundDynamics = new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                if(member.apply(d,freeDynamics).boolVal) {$v.add(d);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(argNames);
        
        {ESLVal dom = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v21 = $qualArg;
                
                switch(_v21.termName) {
                case "JDec": {ESLVal $84 = _v21.termRef(0);
                  ESLVal $83 = _v21.termRef(1);
                  
                  {ESLVal _v77 = $84;
                  
                  {ESLVal _v78 = $83;
                  
                  return ESLVal.list(ESLVal.list(_v78));
                }
                }
                }
                default: {ESLVal _0 = _v21;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        ESLVal ran = t;
        
        return new ESLVal("new ESLVal(new Function(").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(",getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... $args) {").add(nl.apply(indent.add(new ESLVal(4))).add(ppFunArgs.apply(indent,$zero,args,boundDynamics).add(ppJCommand.apply(indent.add(new ESLVal(4)),boundDynamics.add(new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              if(member.apply(d,argNames).not().boolVal) {$v.add(d);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(dynamics)),body).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})"))))))))))));
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
  {ESLVal _v19 = args;
        
        if(_v19.isCons())
        {ESLVal $77 = _v19.head();
          ESLVal $78 = _v19.tail();
          
          switch($77.termName) {
          case "JDec": {ESLVal $80 = $77.termRef(0);
            ESLVal $79 = $77.termRef(1);
            
            {ESLVal n = $80;
            
            {ESLVal t = $79;
            
            {ESLVal _v71 = $78;
            
            if(member.apply(n,dynamicArgs).boolVal)
            return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v71,dynamicArgs)))))));
            else
              {ESLVal _v72 = $80;
                
                {ESLVal _v73 = $79;
                
                {ESLVal _v74 = $78;
                
                return new ESLVal("ESLVal ").add(_v72.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v74,dynamicArgs)))))));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(23872,24266)").add(ESLVal.list(_v19)));
        }
        }
      else if(_v19.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(23872,24266)").add(ESLVal.list(_v19)));
      }
    }
  });
  private static ESLVal ppJCommand = new ESLVal(new Function(new ESLVal("ppJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  {ESLVal _v10 = c;
        
        switch(_v10.termName) {
        case "JIfCommand": {ESLVal $55 = _v10.termRef(0);
          ESLVal $54 = _v10.termRef(1);
          ESLVal $53 = _v10.termRef(2);
          
          {ESLVal e = $55;
          
          {ESLVal c1 = $54;
          
          {ESLVal c2 = $53;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal)").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c1).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,c2)))))))));
        }
        }
        }
        }
      case "JReturn": {ESLVal $50 = _v10.termRef(0);
          
          switch($50.termName) {
          case "JCommandExp": {ESLVal $52 = $50.termRef(0);
            ESLVal $51 = $50.termRef(1);
            
            {ESLVal _v69 = $52;
            
            {ESLVal t = $51;
            
            return ppJCommand.apply(indent,dynamics,_v69);
          }
          }
          }
          default: {ESLVal e = $50;
            
            return new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";")));
          }
        }
        }
      case "JCaseList": {ESLVal $49 = _v10.termRef(0);
          ESLVal $48 = _v10.termRef(1);
          ESLVal $47 = _v10.termRef(2);
          ESLVal $46 = _v10.termRef(3);
          
          {ESLVal l = $49;
          
          {ESLVal cons = $48;
          
          {ESLVal nil = $47;
          
          {ESLVal alt = $46;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isCons())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,cons).add(nl.apply(indent).add(new ESLVal("else if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isNil())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,nil).add(nl.apply(indent).add(new ESLVal("else ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt))))))))))))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $45 = _v10.termRef(0);
          ESLVal $44 = _v10.termRef(1);
          ESLVal $43 = _v10.termRef(2);
          
          {ESLVal e = $45;
          
          {ESLVal arms = $44;
          
          {ESLVal alt = $43;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".termName) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v18 = $qualArg;
                
                switch(_v18.termName) {
                case "JTArm": {ESLVal $76 = _v18.termRef(0);
                  ESLVal $75 = _v18.termRef(1);
                  ESLVal $74 = _v18.termRef(2);
                  
                  {ESLVal n = $76;
                  
                  {ESLVal i = $75;
                  
                  {ESLVal _v68 = $74;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v68))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v18;
                  
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
      case "JCaseInt": {ESLVal $42 = _v10.termRef(0);
          ESLVal $41 = _v10.termRef(1);
          ESLVal $40 = _v10.termRef(2);
          
          {ESLVal e = $42;
          
          {ESLVal arms = $41;
          
          {ESLVal alt = $40;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".intVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v17 = $qualArg;
                
                switch(_v17.termName) {
                case "JIArm": {ESLVal $73 = _v17.termRef(0);
                  ESLVal $72 = _v17.termRef(1);
                  
                  {ESLVal n = $73;
                  
                  {ESLVal _v67 = $72;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v67))))));
                }
                }
                }
                default: {ESLVal _0 = _v17;
                  
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
      case "JCaseStr": {ESLVal $39 = _v10.termRef(0);
          ESLVal $38 = _v10.termRef(1);
          ESLVal $37 = _v10.termRef(2);
          
          {ESLVal e = $39;
          
          {ESLVal arms = $38;
          
          {ESLVal alt = $37;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".strVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v16 = $qualArg;
                
                switch(_v16.termName) {
                case "JSArm": {ESLVal $71 = _v16.termRef(0);
                  ESLVal $70 = _v16.termRef(1);
                  
                  {ESLVal s = $71;
                  
                  {ESLVal _v66 = $70;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v66))))));
                }
                }
                }
                default: {ESLVal _0 = _v16;
                  
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
      case "JCaseBool": {ESLVal $36 = _v10.termRef(0);
          ESLVal $35 = _v10.termRef(1);
          ESLVal $34 = _v10.termRef(2);
          
          {ESLVal e = $36;
          
          {ESLVal arms = $35;
          
          {ESLVal alt = $34;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal ? 1 : 0) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v15 = $qualArg;
                
                switch(_v15.termName) {
                case "JBArm": {ESLVal $69 = _v15.termRef(0);
                  ESLVal $68 = _v15.termRef(1);
                  
                  {ESLVal b = $69;
                  
                  {ESLVal _v65 = $68;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(((Supplier<ESLVal>)() -> { 
                    if(b.boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v65))))));
                }
                }
                }
                default: {ESLVal _0 = _v15;
                  
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
      case "JLet": {ESLVal $33 = _v10.termRef(0);
          ESLVal $32 = _v10.termRef(1);
          
          {ESLVal bs = $33;
          
          {ESLVal _v64 = $32;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v14 = $qualArg;
                  
                  switch(_v14.termName) {
                  case "JField": {ESLVal $67 = _v14.termRef(0);
                    ESLVal $66 = _v14.termRef(1);
                    ESLVal $65 = _v14.termRef(2);
                    
                    {ESLVal n = $67;
                    
                    {ESLVal t = $66;
                    
                    {ESLVal e = $65;
                    
                    return ESLVal.list(ESLVal.list(n));
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
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v64);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun432"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v64).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JLetRec": {ESLVal $31 = _v10.termRef(0);
          ESLVal $30 = _v10.termRef(1);
          
          {ESLVal bs = $31;
          
          {ESLVal _v63 = $30;
          
          return new ESLVal("{ LetRec letrec = new LetRec() {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,bs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v12 = $qualArg;
                
                switch(_v12.termName) {
                case "JField": {ESLVal $61 = _v12.termRef(0);
                  ESLVal $60 = _v12.termRef(1);
                  ESLVal $59 = _v12.termRef(2);
                  
                  {ESLVal n = $61;
                  
                  {ESLVal t = $60;
                  
                  {ESLVal e = $59;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(6))))))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v12;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"cannot find letrec binding\");").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("};").add(nl.apply(indent).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v13 = $qualArg;
                
                switch(_v13.termName) {
                case "JField": {ESLVal $64 = _v13.termRef(0);
                  ESLVal $63 = _v13.termRef(1);
                  ESLVal $62 = _v13.termRef(2);
                  
                  {ESLVal n = $64;
                  
                  {ESLVal t = $63;
                  
                  {ESLVal e = $62;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = letrec.get(\"").add(n.add(new ESLVal("\");").add(nl.apply(indent))))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v13;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics,_v63).add(new ESLVal("}").add(nl.apply(indent)))))))))))))))))))))));
        }
        }
        }
      case "JPLet": {ESLVal $29 = _v10.termRef(0);
          ESLVal $28 = _v10.termRef(1);
          
          {ESLVal bs = $29;
          
          {ESLVal _v62 = $28;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v11 = $qualArg;
                  
                  switch(_v11.termName) {
                  case "JField": {ESLVal $58 = _v11.termRef(0);
                    ESLVal $57 = _v11.termRef(1);
                    ESLVal $56 = _v11.termRef(2);
                    
                    {ESLVal n = $58;
                    
                    {ESLVal t = $57;
                    
                    {ESLVal e = $56;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v11;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v62);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun433"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJParFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v62).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JBlock": {ESLVal $27 = _v10.termRef(0);
          
          {ESLVal cs = $27;
          
          return new ESLVal("{").add(ppJoin.apply(indent,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal c = $l0.head();
                $l0 = $l0.tail();
                $v.add(ppJCommand.apply(indent,dynamics,c));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(cs)).add(new ESLVal("}")));
        }
        }
      case "JUpdate": {ESLVal $26 = _v10.termRef(0);
          ESLVal $25 = _v10.termRef(1);
          
          {ESLVal n = $26;
          
          {ESLVal e = $25;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0] = ").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"))));
          else
            {ESLVal _v60 = $26;
              
              {ESLVal _v61 = $25;
              
              return _v60.add(new ESLVal(" = ").add(ppJExp.apply(indent,dynamics,_v61).add(new ESLVal(";"))));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $24 = _v10.termRef(0);
          ESLVal $23 = _v10.termRef(1);
          ESLVal $22 = _v10.termRef(2);
          ESLVal $21 = _v10.termRef(3);
          
          {ESLVal listName = $24;
          
          {ESLVal varName = $23;
          
          {ESLVal e = $22;
          
          {ESLVal _v59 = $21;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,_v59).add(nl.apply(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}")))))))))))))))))))))))))));
        }
        }
        }
        }
        }
      case "JStatement": {ESLVal $20 = _v10.termRef(0);
          
          {ESLVal e = $20;
          
          return ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"));
        }
        }
        default: {ESLVal _v70 = _v10;
          
          return new ESLVal("******* unknown command: ").add(_v70);
        }
      }
      }
    }
  });
  private static ESLVal ppJParFields = new ESLVal(new Function(new ESLVal("ppJParFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal bs = $args[2];
  LetRec letrec = new LetRec() {
        ESLVal vals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v9 = $qualArg;
                
                switch(_v9.termName) {
                case "JField": {ESLVal $19 = _v9.termRef(0);
                  ESLVal $18 = _v9.termRef(1);
                  ESLVal $17 = _v9.termRef(2);
                  
                  {ESLVal n = $19;
                  
                  {ESLVal t = $18;
                  
                  {ESLVal e = $17;
                  
                  return ESLVal.list(ESLVal.list(e));
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
          }).map(bs).flatten().flatten();
        ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v8 = $qualArg;
                
                switch(_v8.termName) {
                case "JField": {ESLVal $16 = _v8.termRef(0);
                  ESLVal $15 = _v8.termRef(1);
                  ESLVal $14 = _v8.termRef(2);
                  
                  {ESLVal n = $16;
                  
                  {ESLVal t = $15;
                  
                  {ESLVal e = $14;
                  
                  return ESLVal.list(ESLVal.list(n));
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
          }).map(bs).flatten().flatten();
        ESLVal doVals = new ESLVal(new Function(new ESLVal("doVals"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal vals = $args[0];
          {ESLVal _v7 = vals;
                
                if(_v7.isCons())
                {ESLVal $10 = _v7.head();
                  ESLVal $11 = _v7.tail();
                  
                  if($11.isCons())
                  {ESLVal $12 = $11.head();
                    ESLVal $13 = $11.tail();
                    
                    {ESLVal v = $10;
                    
                    {ESLVal vs = $11;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v).add(new ESLVal(",").add(doVals.apply(vs))));
                  }
                  }
                  }
                else if($11.isNil())
                  {ESLVal v = $10;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v));
                  }
                else {ESLVal v = $10;
                    
                    {ESLVal vs = $11;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v).add(new ESLVal(",").add(doVals.apply(vs))));
                  }
                  }
                }
              else if(_v7.isNil())
                return new ESLVal("");
              else return error(new ESLVal("case error at Pos(29387,29550)").add(ESLVal.list(_v7)));
              }
            }
          });
        ESLVal bindNames = new ESLVal(new Function(new ESLVal("bindNames"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ns = $args[0];
          ESLVal i = $args[1];
          {ESLVal _v6 = ns;
                
                if(_v6.isCons())
                {ESLVal $8 = _v6.head();
                  ESLVal $9 = _v6.tail();
                  
                  {ESLVal n = $8;
                  
                  {ESLVal _v56 = $9;
                  
                  if(member.apply(n,dynamics).boolVal)
                  return new ESLVal("ESLVal[] ").add(n.add(new ESLVal("= new ESLVal[]{$p[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(bindNames.apply(_v56,i.add($one))))))));
                  else
                    {ESLVal _v57 = $8;
                      
                      {ESLVal _v58 = $9;
                      
                      return new ESLVal("ESLVal ").add(_v57.add(new ESLVal("= $p[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(bindNames.apply(_v58,i.add($one))))))));
                    }
                    }
                }
                }
                }
              else if(_v6.isNil())
                return new ESLVal("");
              else return error(new ESLVal("case error at Pos(29596,29846)").add(ESLVal.list(_v6)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "vals": return vals;
            
            case "names": return names;
            
            case "doVals": return doVals;
            
            case "bindNames": return bindNames;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal vals = letrec.get("vals");
      
      ESLVal names = letrec.get("names");
      
      ESLVal doVals = letrec.get("doVals");
      
      ESLVal bindNames = letrec.get("bindNames");
      
        return new ESLVal("ESLVal[] $p = plet(new Supplier[]{").add(doVals.apply(vals).add(new ESLVal("});").add(nl.apply(indent).add(bindNames.apply(names,$zero)))));
      
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
          
          {ESLVal _v55 = $7;
          
          return ppFieldDef.apply(indent,dynamics,f).add(nl.apply(indent).add(ppJFields.apply(indent,dynamics,_v55)));
        }
        }
        }
      else if(_v5.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(30015,30165)").add(ESLVal.list(_v5)));
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
            {ESLVal _v52 = $5;
              
              {ESLVal _v53 = $4;
              
              {ESLVal _v54 = $3;
              
              return new ESLVal("ESLVal ").add(_v52.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v54).add(new ESLVal(";")))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(30229,30483)").add(ESLVal.list(_v4)));
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
          
          {ESLVal _v50 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v50,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      else if(_v3.isNil())
        return new ESLVal("new Term(\"").add(n.add(new ESLVal("\")")));
      else {ESLVal _v51 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v51,new ESLVal(",")).add(new ESLVal(")")))));
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
  private static ESLVal ppJSetExp = new ESLVal(new Function(new ESLVal("ppJSetExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.set(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
    }
  });
  private static ESLVal ppJBagExp = new ESLVal(new Function(new ESLVal("ppJBagExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.bag(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
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