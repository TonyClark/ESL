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
  {ESLVal _v48 = ss;
        
        if(_v48.isCons())
        {ESLVal $464 = _v48.head();
          ESLVal $465 = _v48.tail();
          
          if($465.isCons())
          {ESLVal $466 = $465.head();
            ESLVal $467 = $465.tail();
            
            if($467.isCons())
            {ESLVal $468 = $467.head();
              ESLVal $469 = $467.tail();
              
              {ESLVal s = $464;
              
              {ESLVal _v114 = $465;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v114)));
            }
            }
            }
          else if($467.isNil())
            {ESLVal s1 = $464;
              
              {ESLVal s2 = $466;
              
              return s1.add(nl.apply(indent).add(s2));
            }
            }
          else {ESLVal s = $464;
              
              {ESLVal _v115 = $465;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v115)));
            }
            }
          }
        else if($465.isNil())
          {ESLVal s = $464;
            
            return s;
          }
        else {ESLVal s = $464;
            
            {ESLVal _v116 = $465;
            
            return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v116)));
          }
          }
        }
      else if(_v48.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(440,598)").add(ESLVal.list(_v48)));
      }
    }
  });
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v46 = env;
        while(_v46.isCons()) {
          ESLVal _v45 = _v46.headVal;
          {ESLVal _v44 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v47 = _v45;
                    
                    switch(_v47.termName) {
                    case "Map": {ESLVal $463 = _v47.termRef(0);
                      ESLVal $462 = _v47.termRef(1);
                      
                      {ESLVal n = $463;
                      
                      {ESLVal t = $462;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v47;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v44.apply();
          }
          _v46 = _v46.tailVal;}
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
  {ESLVal _v43 = t;
        
        switch(_v43.termName) {
        case "ActType": {ESLVal $461 = _v43.termRef(0);
          ESLVal $460 = _v43.termRef(1);
          ESLVal $459 = _v43.termRef(2);
          
          {ESLVal l = $461;
          
          {ESLVal decs = $460;
          
          {ESLVal handlers = $459;
          
          return new ESLVal("").add(t);
        }
        }
        }
        }
      case "ApplyType": {ESLVal $458 = _v43.termRef(0);
          ESLVal $457 = _v43.termRef(1);
          ESLVal $456 = _v43.termRef(2);
          
          {ESLVal l = $458;
          
          {ESLVal n = $457;
          
          {ESLVal args = $456;
          
          return n.add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $455 = _v43.termRef(0);
          ESLVal $454 = _v43.termRef(1);
          ESLVal $453 = _v43.termRef(2);
          
          {ESLVal l = $455;
          
          {ESLVal op = $454;
          
          {ESLVal args = $453;
          
          return ppType.apply(op).add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $452 = _v43.termRef(0);
          ESLVal $451 = _v43.termRef(1);
          
          {ESLVal l = $452;
          
          {ESLVal _v113 = $451;
          
          return new ESLVal("Array[").add(ppType.apply(_v113).add(new ESLVal("]")));
        }
        }
        }
      case "BoolType": {ESLVal $450 = _v43.termRef(0);
          
          {ESLVal l = $450;
          
          return new ESLVal("Bool");
        }
        }
      case "FloatType": {ESLVal $449 = _v43.termRef(0);
          
          {ESLVal l = $449;
          
          return new ESLVal("Float");
        }
        }
      case "FieldType": {ESLVal $448 = _v43.termRef(0);
          ESLVal $447 = _v43.termRef(1);
          ESLVal $446 = _v43.termRef(2);
          
          {ESLVal l = $448;
          
          {ESLVal n = $447;
          
          {ESLVal _v112 = $446;
          
          return n.add(new ESLVal("::").add(ppType.apply(_v112)));
        }
        }
        }
        }
      case "ForallType": {ESLVal $445 = _v43.termRef(0);
          ESLVal $444 = _v43.termRef(1);
          ESLVal $443 = _v43.termRef(2);
          
          {ESLVal l = $445;
          
          {ESLVal ns = $444;
          
          {ESLVal _v111 = $443;
          
          return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v111))));
        }
        }
        }
        }
      case "FunType": {ESLVal $442 = _v43.termRef(0);
          ESLVal $441 = _v43.termRef(1);
          ESLVal $440 = _v43.termRef(2);
          
          {ESLVal l = $442;
          
          {ESLVal d = $441;
          
          {ESLVal r = $440;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $439 = _v43.termRef(0);
          ESLVal $438 = _v43.termRef(1);
          ESLVal $437 = _v43.termRef(2);
          ESLVal $436 = _v43.termRef(3);
          
          {ESLVal l = $439;
          
          {ESLVal d = $438;
          
          {ESLVal p = $437;
          
          {ESLVal r = $436;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $435 = _v43.termRef(0);
          
          {ESLVal l = $435;
          
          return new ESLVal("Int");
        }
        }
      case "ListType": {ESLVal $434 = _v43.termRef(0);
          ESLVal $433 = _v43.termRef(1);
          
          {ESLVal l = $434;
          
          {ESLVal _v110 = $433;
          
          return new ESLVal("[").add(ppType.apply(_v110).add(new ESLVal("]")));
        }
        }
        }
      case "NullType": {ESLVal $432 = _v43.termRef(0);
          
          {ESLVal l = $432;
          
          return new ESLVal("Null");
        }
        }
      case "RecType": {ESLVal $431 = _v43.termRef(0);
          ESLVal $430 = _v43.termRef(1);
          ESLVal $429 = _v43.termRef(2);
          
          {ESLVal l = $431;
          
          {ESLVal n = $430;
          
          {ESLVal _v109 = $429;
          
          return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v109))));
        }
        }
        }
        }
      case "RecordType": {ESLVal $428 = _v43.termRef(0);
          ESLVal $427 = _v43.termRef(1);
          
          {ESLVal l = $428;
          
          {ESLVal fs = $427;
          
          return new ESLVal("{").add(fs.add(new ESLVal("}")));
        }
        }
        }
      case "StrType": {ESLVal $426 = _v43.termRef(0);
          
          {ESLVal l = $426;
          
          return new ESLVal("Str");
        }
        }
      case "TableType": {ESLVal $425 = _v43.termRef(0);
          ESLVal $424 = _v43.termRef(1);
          ESLVal $423 = _v43.termRef(2);
          
          {ESLVal l = $425;
          
          {ESLVal k = $424;
          
          {ESLVal v = $423;
          
          return new ESLVal("Hash[").add(ppType.apply(k).add(new ESLVal(",").add(ppType.apply(v).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "TermType": {ESLVal $422 = _v43.termRef(0);
          ESLVal $421 = _v43.termRef(1);
          ESLVal $420 = _v43.termRef(2);
          
          {ESLVal l = $422;
          
          {ESLVal n = $421;
          
          {ESLVal ts = $420;
          
          return n.add(map.apply(ppType,ts));
        }
        }
        }
        }
      case "TypeFun": {ESLVal $419 = _v43.termRef(0);
          ESLVal $418 = _v43.termRef(1);
          ESLVal $417 = _v43.termRef(2);
          
          {ESLVal l = $419;
          
          {ESLVal ns = $418;
          
          {ESLVal _v108 = $417;
          
          return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v108))));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $416 = _v43.termRef(0);
          ESLVal $415 = _v43.termRef(1);
          
          {ESLVal l = $416;
          
          {ESLVal _v107 = $415;
          
          return new ESLVal("unfold ").add(ppType.apply(_v107));
        }
        }
        }
      case "UnionType": {ESLVal $414 = _v43.termRef(0);
          ESLVal $413 = _v43.termRef(1);
          
          {ESLVal l = $414;
          
          {ESLVal ts = $413;
          
          return new ESLVal("union ").add(map.apply(ppType,ts));
        }
        }
        }
      case "VarType": {ESLVal $412 = _v43.termRef(0);
          ESLVal $411 = _v43.termRef(1);
          
          {ESLVal l = $412;
          
          {ESLVal n = $411;
          
          return n;
        }
        }
        }
      case "VoidType": {ESLVal $410 = _v43.termRef(0);
          
          {ESLVal l = $410;
          
          return new ESLVal("Void");
        }
        }
      case "UnionRef": {ESLVal $409 = _v43.termRef(0);
          ESLVal $408 = _v43.termRef(1);
          ESLVal $407 = _v43.termRef(2);
          
          {ESLVal l = $409;
          
          {ESLVal _v106 = $408;
          
          {ESLVal n = $407;
          
          return ppType.apply(_v106).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $406 = _v43.termRef(0);
          
          {ESLVal f = $406;
          
          return f.add(new ESLVal(""));
        }
        }
        default: {ESLVal x = _v43;
          
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
  {ESLVal _v42 = exps;
        
        if(_v42.isCons())
        {ESLVal $402 = _v42.head();
          ESLVal $403 = _v42.tail();
          
          if($403.isCons())
          {ESLVal $404 = $403.head();
            ESLVal $405 = $403.tail();
            
            {ESLVal e1 = $402;
            
            {ESLVal e2 = $404;
            
            {ESLVal es = $405;
            
            return ppExp.apply(indent,e1).add(sep.add(ppExps.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($403.isNil())
          {ESLVal e = $402;
            
            return ppExp.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(2411,2569)").add(ESLVal.list(_v42)));
        }
      else if(_v42.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(2411,2569)").add(ESLVal.list(_v42)));
      }
    }
  });
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v41 = p;
        
        switch(_v41.termName) {
        case "PVar": {ESLVal $401 = _v41.termRef(0);
          ESLVal $400 = _v41.termRef(1);
          ESLVal $399 = _v41.termRef(2);
          
          {ESLVal l = $401;
          
          {ESLVal n = $400;
          
          {ESLVal t = $399;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $396 = _v41.termRef(0);
          ESLVal $395 = _v41.termRef(1);
          ESLVal $394 = _v41.termRef(2);
          ESLVal $393 = _v41.termRef(3);
          
          if($394.isCons())
          {ESLVal $397 = $394.head();
            ESLVal $398 = $394.tail();
            
            {ESLVal l = $396;
            
            {ESLVal n = $395;
            
            {ESLVal ts = $394;
            
            {ESLVal ps = $393;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
          }
        else if($394.isNil())
          {ESLVal l = $396;
            
            {ESLVal n = $395;
            
            {ESLVal ps = $393;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $396;
            
            {ESLVal n = $395;
            
            {ESLVal ts = $394;
            
            {ESLVal ps = $393;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $392 = _v41.termRef(0);
          ESLVal $391 = _v41.termRef(1);
          ESLVal $390 = _v41.termRef(2);
          
          {ESLVal l = $392;
          
          {ESLVal _v104 = $391;
          
          {ESLVal ts = $390;
          
          return ppPattern.apply(_v104);
        }
        }
        }
        }
      case "PNil": {ESLVal $389 = _v41.termRef(0);
          
          {ESLVal l = $389;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $388 = _v41.termRef(0);
          ESLVal $387 = _v41.termRef(1);
          
          {ESLVal l = $388;
          
          {ESLVal n = $387;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $386 = _v41.termRef(0);
          ESLVal $385 = _v41.termRef(1);
          
          {ESLVal l = $386;
          
          {ESLVal b = $385;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $384 = _v41.termRef(0);
          ESLVal $383 = _v41.termRef(1);
          
          {ESLVal l = $384;
          
          {ESLVal s = $383;
          
          return new ESLVal("\'").add(s.add(new ESLVal("\'")));
        }
        }
        }
      case "PCons": {ESLVal $382 = _v41.termRef(0);
          ESLVal $381 = _v41.termRef(1);
          ESLVal $380 = _v41.termRef(2);
          
          {ESLVal l = $382;
          
          {ESLVal h = $381;
          
          {ESLVal t = $380;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v105 = _v41;
          
          return new ESLVal("<unknown: ").add(_v105.add(new ESLVal(">")));
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
  {ESLVal _v40 = exp;
        
        switch(_v40.termName) {
        case "Module": {ESLVal $379 = _v40.termRef(0);
          ESLVal $378 = _v40.termRef(1);
          ESLVal $377 = _v40.termRef(2);
          ESLVal $376 = _v40.termRef(3);
          ESLVal $375 = _v40.termRef(4);
          ESLVal $374 = _v40.termRef(5);
          ESLVal $373 = _v40.termRef(6);
          
          {ESLVal path = $379;
          
          {ESLVal name = $378;
          
          {ESLVal exports = $377;
          
          {ESLVal imports = $376;
          
          {ESLVal x = $375;
          
          {ESLVal y = $374;
          
          {ESLVal defs = $373;
          
          return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(2)),defs).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "Var": {ESLVal $372 = _v40.termRef(0);
          ESLVal $371 = _v40.termRef(1);
          
          {ESLVal l = $372;
          
          {ESLVal n = $371;
          
          return n;
        }
        }
        }
      case "StrExp": {ESLVal $370 = _v40.termRef(0);
          ESLVal $369 = _v40.termRef(1);
          
          {ESLVal l = $370;
          
          {ESLVal v = $369;
          
          return new ESLVal("\'").add(v.add(new ESLVal("\'")));
        }
        }
        }
      case "IntExp": {ESLVal $368 = _v40.termRef(0);
          ESLVal $367 = _v40.termRef(1);
          
          {ESLVal l = $368;
          
          {ESLVal v = $367;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "BoolExp": {ESLVal $366 = _v40.termRef(0);
          ESLVal $365 = _v40.termRef(1);
          
          {ESLVal l = $366;
          
          {ESLVal v = $365;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "NullExp": {ESLVal $364 = _v40.termRef(0);
          
          {ESLVal l = $364;
          
          return new ESLVal("null");
        }
        }
      case "FloatExp": {ESLVal $363 = _v40.termRef(0);
          ESLVal $362 = _v40.termRef(1);
          
          {ESLVal l = $363;
          
          {ESLVal f = $362;
          
          return f.add(new ESLVal(""));
        }
        }
        }
      case "Apply": {ESLVal $361 = _v40.termRef(0);
          ESLVal $360 = _v40.termRef(1);
          ESLVal $359 = _v40.termRef(2);
          
          {ESLVal l = $361;
          
          {ESLVal op = $360;
          
          {ESLVal args = $359;
          
          return ppExp.apply(indent,op).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $358 = _v40.termRef(0);
          ESLVal $357 = _v40.termRef(1);
          ESLVal $356 = _v40.termRef(2);
          
          {ESLVal l = $358;
          
          {ESLVal op = $357;
          
          {ESLVal args = $356;
          
          return ppExp.apply(indent,op);
        }
        }
        }
        }
      case "Block": {ESLVal $355 = _v40.termRef(0);
          ESLVal $354 = _v40.termRef(1);
          
          {ESLVal l = $355;
          
          {ESLVal es = $354;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppExps.apply(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl.apply(indent).add(new ESLVal("}")))));
        }
        }
        }
      case "Case": {ESLVal $353 = _v40.termRef(0);
          ESLVal $352 = _v40.termRef(1);
          ESLVal $351 = _v40.termRef(2);
          ESLVal $350 = _v40.termRef(3);
          
          {ESLVal l = $353;
          
          {ESLVal ds = $352;
          
          {ESLVal es = $351;
          
          {ESLVal as = $350;
          
          return new ESLVal("case ").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5171"),getSelf()) {
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
      case "CaseTerm": {ESLVal $349 = _v40.termRef(0);
          ESLVal $348 = _v40.termRef(1);
          ESLVal $347 = _v40.termRef(2);
          ESLVal $346 = _v40.termRef(3);
          
          {ESLVal l = $349;
          
          {ESLVal e = $348;
          
          {ESLVal arms = $347;
          
          {ESLVal alt = $346;
          
          return new ESLVal("caseTerm ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5172"),getSelf()) {
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
      case "CaseList": {ESLVal $345 = _v40.termRef(0);
          ESLVal $344 = _v40.termRef(1);
          ESLVal $343 = _v40.termRef(2);
          ESLVal $342 = _v40.termRef(3);
          ESLVal $341 = _v40.termRef(4);
          
          {ESLVal l = $345;
          
          {ESLVal e = $344;
          
          {ESLVal cons = $343;
          
          {ESLVal nil = $342;
          
          {ESLVal alt = $341;
          
          return new ESLVal("caseList ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),cons).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),nil).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))))))))));
        }
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $340 = _v40.termRef(0);
          ESLVal $339 = _v40.termRef(1);
          ESLVal $338 = _v40.termRef(2);
          ESLVal $337 = _v40.termRef(3);
          
          {ESLVal l = $340;
          
          {ESLVal e = $339;
          
          {ESLVal arms = $338;
          
          {ESLVal alt = $337;
          
          return new ESLVal("caseInt ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5173"),getSelf()) {
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
      case "CaseStr": {ESLVal $336 = _v40.termRef(0);
          ESLVal $335 = _v40.termRef(1);
          ESLVal $334 = _v40.termRef(2);
          ESLVal $333 = _v40.termRef(3);
          
          {ESLVal l = $336;
          
          {ESLVal e = $335;
          
          {ESLVal arms = $334;
          
          {ESLVal alt = $333;
          
          return new ESLVal("caseStr ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5174"),getSelf()) {
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
      case "CaseBool": {ESLVal $332 = _v40.termRef(0);
          ESLVal $331 = _v40.termRef(1);
          ESLVal $330 = _v40.termRef(2);
          ESLVal $329 = _v40.termRef(3);
          
          {ESLVal l = $332;
          
          {ESLVal e = $331;
          
          {ESLVal arms = $330;
          
          {ESLVal alt = $329;
          
          return new ESLVal("caseBool ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5175"),getSelf()) {
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
      case "CaseError": {ESLVal $328 = _v40.termRef(0);
          ESLVal $327 = _v40.termRef(1);
          
          {ESLVal l = $328;
          
          {ESLVal e = $327;
          
          return new ESLVal("caseError()");
        }
        }
        }
      case "Head": {ESLVal $326 = _v40.termRef(0);
          
          {ESLVal e = $326;
          
          return new ESLVal("head(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Tail": {ESLVal $325 = _v40.termRef(0);
          
          {ESLVal e = $325;
          
          return new ESLVal("tail(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Cons": {ESLVal $324 = _v40.termRef(0);
          ESLVal $323 = _v40.termRef(1);
          
          {ESLVal h = $324;
          
          {ESLVal t = $323;
          
          return new ESLVal("cons(").add(ppExp.apply(indent,h).add(new ESLVal(",").add(ppExp.apply(indent,t).add(new ESLVal(")")))));
        }
        }
        }
      case "If": {ESLVal $322 = _v40.termRef(0);
          ESLVal $321 = _v40.termRef(1);
          ESLVal $320 = _v40.termRef(2);
          ESLVal $319 = _v40.termRef(3);
          
          {ESLVal l = $322;
          
          {ESLVal e1 = $321;
          
          {ESLVal e2 = $320;
          
          {ESLVal e3 = $319;
          
          return new ESLVal("if ").add(ppExp.apply(indent,e1).add(nl.apply(indent).add(new ESLVal("then").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(nl.apply(indent).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e3))))))))));
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $318 = _v40.termRef(0);
          ESLVal $317 = _v40.termRef(1);
          ESLVal $316 = _v40.termRef(2);
          ESLVal $315 = _v40.termRef(3);
          ESLVal $314 = _v40.termRef(4);
          
          {ESLVal l = $318;
          
          {ESLVal n = $317;
          
          {ESLVal args = $316;
          
          {ESLVal t = $315;
          
          {ESLVal e = $314;
          
          return new ESLVal("fun(").add(ppDecs.apply(indent,args).add(new ESLVal(")::").add(ppType.apply(t).add(new ESLVal(" ").add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        }
        }
        }
      case "Let": {ESLVal $313 = _v40.termRef(0);
          ESLVal $312 = _v40.termRef(1);
          ESLVal $311 = _v40.termRef(2);
          
          {ESLVal l = $313;
          
          {ESLVal bs = $312;
          
          {ESLVal e = $311;
          
          return new ESLVal("let ").add(ppBinds.apply(indent.add(new ESLVal(4)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "Letrec": {ESLVal $310 = _v40.termRef(0);
          ESLVal $309 = _v40.termRef(1);
          ESLVal $308 = _v40.termRef(2);
          
          {ESLVal l = $310;
          
          {ESLVal bs = $309;
          
          {ESLVal e = $308;
          
          return new ESLVal("letrec ").add(ppBinds.apply(indent.add(new ESLVal(7)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "List": {ESLVal $307 = _v40.termRef(0);
          ESLVal $306 = _v40.termRef(1);
          
          {ESLVal l = $307;
          
          {ESLVal es = $306;
          
          return new ESLVal("[").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal("]")));
        }
        }
        }
      case "Throw": {ESLVal $305 = _v40.termRef(0);
          ESLVal $304 = _v40.termRef(1);
          ESLVal $303 = _v40.termRef(2);
          
          {ESLVal l = $305;
          
          {ESLVal t = $304;
          
          {ESLVal e = $303;
          
          return new ESLVal("throw ").add(ppExp.apply(indent,e));
        }
        }
        }
        }
      case "Term": {ESLVal $302 = _v40.termRef(0);
          ESLVal $301 = _v40.termRef(1);
          ESLVal $300 = _v40.termRef(2);
          ESLVal $299 = _v40.termRef(3);
          
          {ESLVal l = $302;
          
          {ESLVal n = $301;
          
          {ESLVal ts = $300;
          
          {ESLVal es = $299;
          
          return n.add(new ESLVal("(").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $298 = _v40.termRef(0);
          ESLVal $297 = _v40.termRef(1);
          
          {ESLVal e = $298;
          
          {ESLVal n = $297;
          
          return new ESLVal("termRef(").add(ppExp.apply(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
        }
        }
        }
      case "BinExp": {ESLVal $296 = _v40.termRef(0);
          ESLVal $295 = _v40.termRef(1);
          ESLVal $294 = _v40.termRef(2);
          ESLVal $293 = _v40.termRef(3);
          
          {ESLVal l = $296;
          
          {ESLVal e1 = $295;
          
          {ESLVal op = $294;
          
          {ESLVal e2 = $293;
          
          return ppExp.apply(indent,e1).add(op.add(ppExp.apply(indent,e2)));
        }
        }
        }
        }
        }
      case "Update": {ESLVal $292 = _v40.termRef(0);
          ESLVal $291 = _v40.termRef(1);
          ESLVal $290 = _v40.termRef(2);
          
          {ESLVal l = $292;
          
          {ESLVal n = $291;
          
          {ESLVal e = $290;
          
          return n.add(new ESLVal(" := ").add(ppExp.apply(indent,e)));
        }
        }
        }
        }
      case "NewArray": {ESLVal $289 = _v40.termRef(0);
          ESLVal $288 = _v40.termRef(1);
          ESLVal $287 = _v40.termRef(2);
          
          {ESLVal l = $289;
          
          {ESLVal t = $288;
          
          {ESLVal n = $287;
          
          return new ESLVal("new Array[").add(ppType.apply(t).add(new ESLVal("](").add(ppExp.apply(indent,n).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "For": {ESLVal $286 = _v40.termRef(0);
          ESLVal $285 = _v40.termRef(1);
          ESLVal $284 = _v40.termRef(2);
          ESLVal $283 = _v40.termRef(3);
          
          {ESLVal l = $286;
          
          {ESLVal p = $285;
          
          {ESLVal e1 = $284;
          
          {ESLVal e2 = $283;
          
          return new ESLVal("for ").add(ppPattern.apply(p).add(new ESLVal(" in ").add(ppExp.apply(indent,e1).add(new ESLVal(" do {").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
        }
        }
        }
        }
        }
      case "Try": {ESLVal $282 = _v40.termRef(0);
          ESLVal $281 = _v40.termRef(1);
          ESLVal $280 = _v40.termRef(2);
          
          {ESLVal l = $282;
          
          {ESLVal e = $281;
          
          {ESLVal as = $280;
          
          return new ESLVal("try ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5176"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
      case "ActExp": {ESLVal $279 = _v40.termRef(0);
          ESLVal $278 = _v40.termRef(1);
          ESLVal $277 = _v40.termRef(2);
          ESLVal $276 = _v40.termRef(3);
          ESLVal $275 = _v40.termRef(4);
          ESLVal $274 = _v40.termRef(5);
          ESLVal $273 = _v40.termRef(6);
          ESLVal $272 = _v40.termRef(7);
          
          {ESLVal l = $279;
          
          {ESLVal n = $278;
          
          {ESLVal args = $277;
          
          {ESLVal x = $276;
          
          {ESLVal parent = $275;
          
          {ESLVal locals = $274;
          
          {ESLVal init = $273;
          
          {ESLVal handlers = $272;
          
          return new ESLVal("act ").add(ppExp.apply(indent,n).add(new ESLVal("(").add(ppDecs.apply(indent,args).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(5)),locals).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp.apply(indent.add(new ESLVal(4)),init).add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5177"),getSelf()) {
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
      case "Self": {ESLVal $271 = _v40.termRef(0);
          
          {ESLVal l = $271;
          
          return new ESLVal("self");
        }
        }
      case "Ref": {ESLVal $270 = _v40.termRef(0);
          ESLVal $269 = _v40.termRef(1);
          ESLVal $268 = _v40.termRef(2);
          
          {ESLVal l = $270;
          
          {ESLVal e = $269;
          
          {ESLVal n = $268;
          
          return ppExp.apply(indent,e).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "Send": {ESLVal $267 = _v40.termRef(0);
          ESLVal $266 = _v40.termRef(1);
          ESLVal $265 = _v40.termRef(2);
          
          {ESLVal l = $267;
          
          {ESLVal target = $266;
          
          {ESLVal message = $265;
          
          return ppExp.apply(indent,target).add(new ESLVal(" <- ").add(ppExp.apply(indent,message)));
        }
        }
        }
        }
      case "Cmp": {ESLVal $264 = _v40.termRef(0);
          ESLVal $263 = _v40.termRef(1);
          ESLVal $262 = _v40.termRef(2);
          
          {ESLVal l = $264;
          
          {ESLVal e = $263;
          
          {ESLVal qs = $262;
          
          return new ESLVal("[").add(ppExp.apply(indent,e).add(new ESLVal(" | ").add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun5178"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal q = $args[0];
          return ppQual.apply(indent,q);
            }
          }),qs)).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "New": {ESLVal $261 = _v40.termRef(0);
          ESLVal $260 = _v40.termRef(1);
          ESLVal $259 = _v40.termRef(2);
          
          {ESLVal l = $261;
          
          {ESLVal b = $260;
          
          {ESLVal args = $259;
          
          return new ESLVal("new ").add(ppExp.apply(indent,b).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "NewJava": {ESLVal $258 = _v40.termRef(0);
          ESLVal $257 = _v40.termRef(1);
          ESLVal $256 = _v40.termRef(2);
          ESLVal $255 = _v40.termRef(3);
          
          {ESLVal l = $258;
          
          {ESLVal className = $257;
          
          {ESLVal t = $256;
          
          {ESLVal args = $255;
          
          return new ESLVal("javaNew[").add(ppType.apply(t).add(new ESLVal("](\' + className + ").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $254 = _v40.termRef(0);
          ESLVal $253 = _v40.termRef(1);
          ESLVal $252 = _v40.termRef(2);
          
          {ESLVal l = $254;
          
          {ESLVal rs = $253;
          
          {ESLVal e = $252;
          
          return new ESLVal("*********grab");
        }
        }
        }
        }
      case "Probably": {ESLVal $251 = _v40.termRef(0);
          ESLVal $250 = _v40.termRef(1);
          ESLVal $249 = _v40.termRef(2);
          ESLVal $248 = _v40.termRef(3);
          ESLVal $247 = _v40.termRef(4);
          
          {ESLVal l = $251;
          
          {ESLVal p = $250;
          
          {ESLVal t = $249;
          
          {ESLVal e1 = $248;
          
          {ESLVal e2 = $247;
          
          return new ESLVal("**** probably");
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $246 = _v40.termRef(0);
          ESLVal $245 = _v40.termRef(1);
          
          {ESLVal l = $246;
          
          {ESLVal e = $245;
          
          return new ESLVal("not(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
        }
      case "Fold": {ESLVal $244 = _v40.termRef(0);
          ESLVal $243 = _v40.termRef(1);
          ESLVal $242 = _v40.termRef(2);
          
          {ESLVal l = $244;
          
          {ESLVal t = $243;
          
          {ESLVal e = $242;
          
          return new ESLVal("******** fold");
        }
        }
        }
        }
      case "Unfold": {ESLVal $241 = _v40.termRef(0);
          ESLVal $240 = _v40.termRef(1);
          ESLVal $239 = _v40.termRef(2);
          
          {ESLVal l = $241;
          
          {ESLVal t = $240;
          
          {ESLVal e = $239;
          
          return new ESLVal("******unfold");
        }
        }
        }
        }
      case "Now": {ESLVal $238 = _v40.termRef(0);
          
          {ESLVal l = $238;
          
          return new ESLVal("now");
        }
        }
      case "Become": {ESLVal $237 = _v40.termRef(0);
          ESLVal $236 = _v40.termRef(1);
          
          {ESLVal l = $237;
          
          {ESLVal e = $236;
          
          return new ESLVal("become ").add(ppExp.apply(indent,e));
        }
        }
        }
      case "ArrayRef": {ESLVal $235 = _v40.termRef(0);
          ESLVal $234 = _v40.termRef(1);
          ESLVal $233 = _v40.termRef(2);
          
          {ESLVal l = $235;
          
          {ESLVal a = $234;
          
          {ESLVal i = $233;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("]"))));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $232 = _v40.termRef(0);
          ESLVal $231 = _v40.termRef(1);
          ESLVal $230 = _v40.termRef(2);
          ESLVal $229 = _v40.termRef(3);
          
          {ESLVal l = $232;
          
          {ESLVal a = $231;
          
          {ESLVal i = $230;
          
          {ESLVal v = $229;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("] := ").add(ppExp.apply(indent,v)))));
        }
        }
        }
        }
        }
        default: {ESLVal x = _v40;
          
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
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun5179"),getSelf()) {
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
  {ESLVal _v39 = d;
        
        switch(_v39.termName) {
        case "Dec": {ESLVal $228 = _v39.termRef(0);
          ESLVal $227 = _v39.termRef(1);
          ESLVal $226 = _v39.termRef(2);
          ESLVal $225 = _v39.termRef(3);
          
          {ESLVal l = $228;
          
          {ESLVal n = $227;
          
          {ESLVal dt = $226;
          
          {ESLVal t = $225;
          
          return n.add(new ESLVal("::").add(ppType.apply(t)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9557,9634)").add(ESLVal.list(_v39)));
      }
      }
    }
  });
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun5180"),getSelf()) {
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
  {ESLVal _v38 = b;
        
        switch(_v38.termName) {
        case "Binding": {ESLVal $224 = _v38.termRef(0);
          ESLVal $223 = _v38.termRef(1);
          ESLVal $222 = _v38.termRef(2);
          ESLVal $221 = _v38.termRef(3);
          ESLVal $220 = _v38.termRef(4);
          
          {ESLVal l = $224;
          
          {ESLVal name = $223;
          
          {ESLVal t = $222;
          
          {ESLVal st = $221;
          
          {ESLVal value = $220;
          
          return name.add(new ESLVal("=").add(ppExp.apply(indent,value).add(new ESLVal(";"))));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $219 = _v38.termRef(0);
          ESLVal $218 = _v38.termRef(1);
          ESLVal $217 = _v38.termRef(2);
          ESLVal $216 = _v38.termRef(3);
          
          {ESLVal l = $219;
          
          {ESLVal name = $218;
          
          {ESLVal t = $217;
          
          {ESLVal ignore = $216;
          
          return new ESLVal("type ").add(name);
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $215 = _v38.termRef(0);
          ESLVal $214 = _v38.termRef(1);
          ESLVal $213 = _v38.termRef(2);
          ESLVal $212 = _v38.termRef(3);
          
          {ESLVal l = $215;
          
          {ESLVal name = $214;
          
          {ESLVal t = $213;
          
          {ESLVal ignore = $212;
          
          return new ESLVal("data ").add(name);
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $211 = _v38.termRef(0);
          ESLVal $210 = _v38.termRef(1);
          ESLVal $209 = _v38.termRef(2);
          ESLVal $208 = _v38.termRef(3);
          ESLVal $207 = _v38.termRef(4);
          ESLVal $206 = _v38.termRef(5);
          ESLVal $205 = _v38.termRef(6);
          
          {ESLVal l = $211;
          
          {ESLVal name = $210;
          
          {ESLVal args = $209;
          
          {ESLVal t = $208;
          
          {ESLVal st = $207;
          
          {ESLVal body = $206;
          
          {ESLVal guard = $205;
          
          return name.add(new ESLVal("(").add(ppPatterns.apply(args).add(new ESLVal(") = ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),body))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $204 = _v38.termRef(0);
          ESLVal $203 = _v38.termRef(1);
          ESLVal $202 = _v38.termRef(2);
          ESLVal $201 = _v38.termRef(3);
          
          {ESLVal l = $204;
          
          {ESLVal name = $203;
          
          {ESLVal t = $202;
          
          {ESLVal ignore = $201;
          
          return name;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v38;
          
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
  {ESLVal _v37 = a;
        
        switch(_v37.termName) {
        case "BArm": {ESLVal $200 = _v37.termRef(0);
          ESLVal $199 = _v37.termRef(1);
          ESLVal $198 = _v37.termRef(2);
          ESLVal $197 = _v37.termRef(3);
          
          {ESLVal l = $200;
          
          {ESLVal ps = $199;
          
          {ESLVal guard = $198;
          
          {ESLVal e = $197;
          
          return ppPatterns.apply(ps).add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10419,10557)").add(ESLVal.list(_v37)));
      }
      }
    }
  });
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal arms = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun5181"),getSelf()) {
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
  {ESLVal _v36 = a;
        
        switch(_v36.termName) {
        case "TArm": {ESLVal $196 = _v36.termRef(0);
          ESLVal $195 = _v36.termRef(1);
          
          {ESLVal n = $196;
          
          {ESLVal e = $195;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10719,10819)").add(ESLVal.list(_v36)));
      }
      }
    }
  });
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v35 = a;
        
        switch(_v35.termName) {
        case "IArm": {ESLVal $194 = _v35.termRef(0);
          ESLVal $193 = _v35.termRef(1);
          
          {ESLVal n = $194;
          
          {ESLVal e = $193;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10875,10975)").add(ESLVal.list(_v35)));
      }
      }
    }
  });
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v34 = a;
        
        switch(_v34.termName) {
        case "SArm": {ESLVal $192 = _v34.termRef(0);
          ESLVal $191 = _v34.termRef(1);
          
          {ESLVal n = $192;
          
          {ESLVal e = $191;
          
          return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11031,11145)").add(ESLVal.list(_v34)));
      }
      }
    }
  });
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v33 = a;
        
        switch(_v33.termName) {
        case "BoolArm": {ESLVal $190 = _v33.termRef(0);
          ESLVal $189 = _v33.termRef(1);
          
          {ESLVal b = $190;
          
          {ESLVal e = $189;
          
          return b.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11203,11307)").add(ESLVal.list(_v33)));
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
        
        {ESLVal _v32 = sourceFile;
        
        switch(_v32.strVal) {
        case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        default: {ESLVal x = _v32;
          
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
  {ESLVal _v30 = m;
        
        switch(_v30.termName) {
        case "JModule": {ESLVal $188 = _v30.termRef(0);
          ESLVal $187 = _v30.termRef(1);
          ESLVal $186 = _v30.termRef(2);
          ESLVal $185 = _v30.termRef(3);
          
          {ESLVal n = $188;
          
          {ESLVal exports = $187;
          
          {ESLVal imports = $186;
          
          {ESLVal fields = $185;
          
          return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl.apply($zero).add(new ESLVal("import esl.lib.*;").add(nl.apply($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl.apply($zero).add(ppJoin.apply($zero,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v31 = $qualArg;
                
                {ESLVal i = _v31;
                
                return ESLVal.list(ESLVal.list(getImport.apply(i)));
              }
              }
            }
          }).map(imports).flatten().flatten()).add(nl.apply($zero).add(new ESLVal("import java.util.function.Supplier;").add(nl.apply($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl.apply(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl.apply(new ESLVal(2)).add(ppJoin.apply(new ESLVal(2),map.apply(new ESLVal(new Function(new ESLVal("fun5182"),getSelf()) {
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
        default: return error(new ESLVal("case error at Pos(11702,12464)").add(ESLVal.list(_v30)));
      }
      }
    }
  });
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exports = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v29 = f;
        
        switch(_v29.termName) {
        case "JField": {ESLVal $184 = _v29.termRef(0);
          ESLVal $183 = _v29.termRef(1);
          ESLVal $182 = _v29.termRef(2);
          
          switch($184.strVal) {
          case "edb": switch($182.termName) {
            case "JNull": {
              {ESLVal t = $183;
              
              return new ESLVal("// static ESLVal edb = null;");
            }
            }
            default: {ESLVal n = $184;
              
              {ESLVal t = $183;
              
              {ESLVal e = $182;
              
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
          default: {ESLVal n = $184;
            
            {ESLVal t = $183;
            
            {ESLVal e = $182;
            
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
        default: return error(new ESLVal("case error at Pos(12533,12783)").add(ESLVal.list(_v29)));
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
  {ESLVal _v28 = exps;
        
        if(_v28.isCons())
        {ESLVal $178 = _v28.head();
          ESLVal $179 = _v28.tail();
          
          if($179.isCons())
          {ESLVal $180 = $179.head();
            ESLVal $181 = $179.tail();
            
            {ESLVal e1 = $178;
            
            {ESLVal e2 = $180;
            
            {ESLVal es = $181;
            
            return ppJExp.apply(indent,dynamics,e1).add(sep.add(ppJExps.apply(indent,dynamics,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($179.isNil())
          {ESLVal e = $178;
            
            return ppJExp.apply(indent,dynamics,e);
          }
        else return error(new ESLVal("case error at Pos(12853,13047)").add(ESLVal.list(_v28)));
        }
      else if(_v28.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(12853,13047)").add(ESLVal.list(_v28)));
      }
    }
  });
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal decs = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v27 = decs;
        
        if(_v27.isCons())
        {ESLVal $174 = _v27.head();
          ESLVal $175 = _v27.tail();
          
          if($175.isCons())
          {ESLVal $176 = $175.head();
            ESLVal $177 = $175.tail();
            
            {ESLVal e1 = $174;
            
            {ESLVal e2 = $176;
            
            {ESLVal es = $177;
            
            return pJDec.apply(indent,e1).add(sep.add(ppJDecs.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($175.isNil())
          {ESLVal e = $174;
            
            return pJDec.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(13109,13321)").add(ESLVal.list(_v27)));
        }
      else if(_v27.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(13109,13321)").add(ESLVal.list(_v27)));
      }
    }
  });
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v26 = d;
        
        switch(_v26.termName) {
        case "JDec": {ESLVal $173 = _v26.termRef(0);
          ESLVal $172 = _v26.termRef(1);
          
          {ESLVal n = $173;
          
          {ESLVal t = $172;
          
          return new ESLVal("ESLVal ").add(n);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(13367,13423)").add(ESLVal.list(_v26)));
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
        case "JArrayRef": {ESLVal $165 = _v21.termRef(0);
          ESLVal $164 = _v21.termRef(1);
          
          {ESLVal a = $165;
          
          {ESLVal i = $164;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal]"))));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $163 = _v21.termRef(0);
          ESLVal $162 = _v21.termRef(1);
          ESLVal $161 = _v21.termRef(2);
          
          {ESLVal a = $163;
          
          {ESLVal i = $162;
          
          {ESLVal v = $161;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp.apply(indent,dynamics,v)))));
        }
        }
        }
        }
      case "JBecome": {ESLVal $158 = _v21.termRef(0);
          ESLVal $157 = _v21.termRef(1);
          
          if($157.isCons())
          {ESLVal $159 = $157.head();
            ESLVal $160 = $157.tail();
            
            {ESLVal _v100 = $158;
            
            {ESLVal es = $157;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v100).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($157.isNil())
          {ESLVal _v101 = $158;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v101).add(new ESLVal(",getSelf())")));
          }
        else {ESLVal _v102 = $158;
            
            {ESLVal es = $157;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v102).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JConstExp": {ESLVal $152 = _v21.termRef(0);
          
          switch($152.termName) {
          case "JConstInt": {ESLVal $156 = $152.termRef(0);
            
            switch($156.intVal) {
            case 0: return new ESLVal("$zero");
          case 1: return new ESLVal("$one");
            default: {ESLVal n = $156;
              
              return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
            }
          }
          }
        case "JConstBool": {ESLVal $155 = $152.termRef(0);
            
            switch($155.boolVal ? 1 : 0) {
            case 1: return new ESLVal("$true");
          case 0: return new ESLVal("$false");
            default: {ESLVal _v98 = _v21;
              
              return new ESLVal("********** unknown expression: ").add(_v98);
            }
          }
          }
        case "JConstStr": {ESLVal $154 = $152.termRef(0);
            
            {ESLVal s = $154;
            
            return new ESLVal("new ESLVal(\"").add(javaString.apply(s).add(new ESLVal("\")")));
          }
          }
        case "JConstDouble": {ESLVal $153 = $152.termRef(0);
            
            {ESLVal d = $153;
            
            return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
          }
          }
          default: {ESLVal _v99 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v99);
          }
        }
        }
      case "JNot": {ESLVal $151 = _v21.termRef(0);
          
          {ESLVal _v97 = $151;
          
          return ppJExp.apply(indent,dynamics,_v97).add(new ESLVal(".not()"));
        }
        }
      case "JNil": {ESLVal $150 = _v21.termRef(0);
          
          {ESLVal t = $150;
          
          return new ESLVal("$nil");
        }
        }
      case "JList": {ESLVal $149 = _v21.termRef(0);
          ESLVal $148 = _v21.termRef(1);
          
          {ESLVal t = $149;
          
          {ESLVal es = $148;
          
          return ppJListExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JSet": {ESLVal $147 = _v21.termRef(0);
          ESLVal $146 = _v21.termRef(1);
          
          {ESLVal t = $147;
          
          {ESLVal es = $146;
          
          return ppJSetExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JBag": {ESLVal $145 = _v21.termRef(0);
          ESLVal $144 = _v21.termRef(1);
          
          {ESLVal t = $145;
          
          {ESLVal es = $144;
          
          return ppJBagExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JTerm": {ESLVal $141 = _v21.termRef(0);
          ESLVal $140 = _v21.termRef(1);
          
          if($140.isCons())
          {ESLVal $142 = $140.head();
            ESLVal $143 = $140.tail();
            
            {ESLVal n = $141;
            
            {ESLVal es = $140;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($140.isNil())
          {ESLVal n = $141;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
          }
        else {ESLVal n = $141;
            
            {ESLVal es = $140;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JFun": {ESLVal $139 = _v21.termRef(0);
          ESLVal $138 = _v21.termRef(1);
          ESLVal $137 = _v21.termRef(2);
          ESLVal $136 = _v21.termRef(3);
          
          {ESLVal n = $139;
          
          {ESLVal args = $138;
          
          {ESLVal t = $137;
          
          {ESLVal body = $136;
          
          return ppJFun.apply(indent,dynamics,n,args,t,body);
        }
        }
        }
        }
        }
      case "JBinExp": {ESLVal $135 = _v21.termRef(0);
          ESLVal $134 = _v21.termRef(1);
          ESLVal $133 = _v21.termRef(2);
          
          switch($134.strVal) {
          case "==": {ESLVal e1 = $135;
            
            {ESLVal e2 = $133;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))));
          }
          }
        case "cons": {ESLVal e1 = $135;
            
            {ESLVal e2 = $133;
            
            return ppJExp.apply(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(")"))));
          }
          }
          default: {ESLVal e1 = $135;
            
            {ESLVal op = $134;
            
            {ESLVal e2 = $133;
            
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
      case "JVar": {ESLVal $132 = _v21.termRef(0);
          ESLVal $131 = _v21.termRef(1);
          
          {ESLVal n = $132;
          
          {ESLVal t = $131;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0]"));
          else
            {ESLVal _v95 = $132;
              
              {ESLVal _v96 = $131;
              
              return _v95;
            }
            }
        }
        }
        }
      case "JError": {ESLVal $130 = _v21.termRef(0);
          
          {ESLVal _v94 = $130;
          
          return new ESLVal("error(").add(ppJExp.apply(indent,dynamics,_v94).add(new ESLVal(")")));
        }
        }
      case "JApply": {ESLVal $129 = _v21.termRef(0);
          ESLVal $128 = _v21.termRef(1);
          
          {ESLVal _v93 = $129;
          
          {ESLVal es = $128;
          
          return ppJExp.apply(indent,dynamics,_v93).add(new ESLVal(".apply(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
      case "JCommandExp": {ESLVal $127 = _v21.termRef(0);
          ESLVal $126 = _v21.termRef(1);
          
          {ESLVal c = $127;
          
          {ESLVal t = $126;
          
          return new ESLVal("((Supplier<ESLVal>)() -> { ").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c).add(nl.apply(indent).add(new ESLVal("}).get()")))));
        }
        }
        }
      case "JIfExp": {ESLVal $125 = _v21.termRef(0);
          ESLVal $124 = _v21.termRef(1);
          ESLVal $123 = _v21.termRef(2);
          
          {ESLVal _v92 = $125;
          
          {ESLVal e1 = $124;
          
          {ESLVal e2 = $123;
          
          return new ESLVal("(").add(ppJExp.apply(indent,dynamics,_v92).add(new ESLVal(".boolVal) ? (").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")")))))));
        }
        }
        }
        }
      case "JHead": {ESLVal $122 = _v21.termRef(0);
          
          {ESLVal _v91 = $122;
          
          return ppJExp.apply(indent,dynamics,_v91).add(new ESLVal(".head()"));
        }
        }
      case "JTail": {ESLVal $121 = _v21.termRef(0);
          
          {ESLVal _v90 = $121;
          
          return ppJExp.apply(indent,dynamics,_v90).add(new ESLVal(".tail()"));
        }
        }
      case "JTermRef": {ESLVal $120 = _v21.termRef(0);
          ESLVal $119 = _v21.termRef(1);
          
          {ESLVal _v89 = $120;
          
          {ESLVal n = $119;
          
          return ppJExp.apply(indent,dynamics,_v89).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
        }
        }
        }
      case "JMapFun": {ESLVal $118 = _v21.termRef(0);
          ESLVal $117 = _v21.termRef(1);
          
          {ESLVal f = $118;
          
          {ESLVal l = $117;
          
          return ppJExp.apply(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(")"))));
        }
        }
        }
      case "JFlatten": {ESLVal $116 = _v21.termRef(0);
          
          {ESLVal ls = $116;
          
          return ppJExp.apply(indent,dynamics,ls).add(new ESLVal(".flatten()"));
        }
        }
      case "JBehaviour": {ESLVal $111 = _v21.termRef(0);
          ESLVal $110 = _v21.termRef(1);
          ESLVal $109 = _v21.termRef(2);
          ESLVal $108 = _v21.termRef(3);
          ESLVal $107 = _v21.termRef(4);
          
          switch($108.termName) {
          case "JFun": {ESLVal $115 = $108.termRef(0);
            ESLVal $114 = $108.termRef(1);
            ESLVal $113 = $108.termRef(2);
            ESLVal $112 = $108.termRef(3);
            
            {ESLVal es = $111;
            
            {ESLVal fs = $110;
            
            {ESLVal init = $109;
            
            {ESLVal n = $115;
            
            {ESLVal args = $114;
            
            {ESLVal t = $113;
            
            {ESLVal body = $112;
            
            {ESLVal time = $107;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v25 = $qualArg;
                  
                  {ESLVal _v87 = _v25;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(_v87.add(new ESLVal("\": return ").add(_v87.add(new ESLVal(";")))))));
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
          default: {ESLVal _v88 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v88);
          }
        }
        }
      case "JExtendedBehaviour": {ESLVal $102 = _v21.termRef(0);
          ESLVal $101 = _v21.termRef(1);
          ESLVal $100 = _v21.termRef(2);
          ESLVal $99 = _v21.termRef(3);
          ESLVal $98 = _v21.termRef(4);
          ESLVal $97 = _v21.termRef(5);
          
          switch($98.termName) {
          case "JFun": {ESLVal $106 = $98.termRef(0);
            ESLVal $105 = $98.termRef(1);
            ESLVal $104 = $98.termRef(2);
            ESLVal $103 = $98.termRef(3);
            
            {ESLVal es = $102;
            
            {ESLVal parent = $101;
            
            {ESLVal fs = $100;
            
            {ESLVal init = $99;
            
            {ESLVal n = $106;
            
            {ESLVal args = $105;
            
            {ESLVal t = $104;
            
            {ESLVal body = $103;
            
            {ESLVal time = $97;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(ppBehaviourParent.apply(indent,dynamics,parent).add(new ESLVal(",").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v24 = $qualArg;
                  
                  {ESLVal _v85 = _v24;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(_v85.add(new ESLVal("\": return ").add(_v85.add(new ESLVal(";")))))));
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
          default: {ESLVal _v86 = _v21;
            
            return new ESLVal("********** unknown expression: ").add(_v86);
          }
        }
        }
      case "JNew": {ESLVal $94 = _v21.termRef(0);
          ESLVal $93 = _v21.termRef(1);
          
          if($93.isCons())
          {ESLVal $95 = $93.head();
            ESLVal $96 = $93.tail();
            
            {ESLVal b = $94;
            
            {ESLVal args = $93;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($93.isNil())
          {ESLVal b = $94;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
          }
        else {ESLVal b = $94;
            
            {ESLVal args = $93;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JNewArray": {ESLVal $92 = _v21.termRef(0);
          
          {ESLVal i = $92;
          
          return new ESLVal("newArray(").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal)")));
        }
        }
      case "JNewTable": {
          return new ESLVal("newTable()");
        }
      case "JNewJava": {ESLVal $89 = _v21.termRef(0);
          ESLVal $88 = _v21.termRef(1);
          
          if($88.isCons())
          {ESLVal $90 = $88.head();
            ESLVal $91 = $88.tail();
            
            {ESLVal n = $89;
            
            {ESLVal args = $88;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($88.isNil())
          {ESLVal n = $89;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
          }
        else {ESLVal n = $89;
            
            {ESLVal args = $88;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JRecord": {ESLVal $87 = _v21.termRef(0);
          
          {ESLVal fs = $87;
          
          return new ESLVal("newRecord(new ESLVal[]{").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v22 = $qualArg;
                
                switch(_v22.termName) {
                case "JField": {ESLVal $168 = _v22.termRef(0);
                  ESLVal $167 = _v22.termRef(1);
                  ESLVal $166 = _v22.termRef(2);
                  
                  {ESLVal n = $168;
                  
                  {ESLVal t = $167;
                  
                  {ESLVal _v83 = $166;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JConstExp",new ESLVal("JConstStr",n))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v22;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal("},").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v23 = $qualArg;
                
                switch(_v23.termName) {
                case "JField": {ESLVal $171 = _v23.termRef(0);
                  ESLVal $170 = _v23.termRef(1);
                  ESLVal $169 = _v23.termRef(2);
                  
                  {ESLVal n = $171;
                  
                  {ESLVal t = $170;
                  
                  {ESLVal _v84 = $169;
                  
                  return ESLVal.list(ESLVal.list(_v84));
                }
                }
                }
                }
                default: {ESLVal _0 = _v23;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      case "JSend": {ESLVal $84 = _v21.termRef(0);
          ESLVal $83 = _v21.termRef(1);
          ESLVal $82 = _v21.termRef(2);
          
          if($82.isCons())
          {ESLVal $85 = $82.head();
            ESLVal $86 = $82.tail();
            
            {ESLVal _v80 = $84;
            
            {ESLVal m = $83;
            
            {ESLVal args = $82;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v80).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
          }
        else if($82.isNil())
          {ESLVal _v81 = $84;
            
            {ESLVal m = $83;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v81).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
          }
          }
        else {ESLVal _v82 = $84;
            
            {ESLVal m = $83;
            
            {ESLVal args = $82;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v82).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
        }
      case "JSendSuper": {ESLVal $81 = _v21.termRef(0);
          
          {ESLVal _v79 = $81;
          
          return new ESLVal("sendSuper(").add(ppJExp.apply(indent,dynamics,_v79).add(new ESLVal(")")));
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
          
          {ESLVal _v78 = $80;
          
          {ESLVal n = $79;
          
          return ppJExp.apply(indent,dynamics,_v78).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
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
          
          {ESLVal _v77 = $75;
          
          {ESLVal n = $74;
          
          {ESLVal c = $73;
          
          return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(4)),dynamics,_v77).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl.apply(indent.add(new ESLVal(6))).add(ppJCommand.apply(indent,dynamics,c).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
        }
        }
        }
        }
      case "JProbably": {ESLVal $72 = _v21.termRef(0);
          ESLVal $71 = _v21.termRef(1);
          ESLVal $70 = _v21.termRef(2);
          
          {ESLVal _v76 = $72;
          
          {ESLVal e1 = $71;
          
          {ESLVal e2 = $70;
          
          return new ESLVal("probably(").add(ppJExp.apply(indent,dynamics,_v76).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e1)).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e2)).add(new ESLVal(")")))))));
        }
        }
        }
        }
        default: {ESLVal _v103 = _v21;
          
          return new ESLVal("********** unknown expression: ").add(_v103);
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
        default: {ESLVal _v75 = _v20;
          
          return ppJExp.apply(indent,dynamics,_v75);
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
                  
                  {ESLVal _v71 = $65;
                  
                  {ESLVal _v72 = $64;
                  
                  return ESLVal.list(ESLVal.list(_v71));
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
                  
                  {ESLVal _v73 = $67;
                  
                  {ESLVal _v74 = $66;
                  
                  return ESLVal.list(ESLVal.list(_v74));
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
            
            {ESLVal _v67 = $61;
            
            if(member.apply(n,dynamicArgs).boolVal)
            return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v67,dynamicArgs)))))));
            else
              {ESLVal _v68 = $63;
                
                {ESLVal _v69 = $62;
                
                {ESLVal _v70 = $61;
                
                return new ESLVal("ESLVal ").add(_v68.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v70,dynamicArgs)))))));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(22186,22580)").add(ESLVal.list(_v15)));
        }
        }
      else if(_v15.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(22186,22580)").add(ESLVal.list(_v15)));
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
            
            {ESLVal _v65 = $38;
            
            {ESLVal t = $37;
            
            return ppJCommand.apply(indent,dynamics,_v65);
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
                  
                  {ESLVal _v64 = $57;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v64))))));
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
                  
                  {ESLVal _v63 = $55;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v63))))));
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
                  
                  {ESLVal _v62 = $53;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v62))))));
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
                  
                  {ESLVal _v61 = $51;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(((Supplier<ESLVal>)() -> { 
                    if(b.boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v61))))));
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
          
          {ESLVal _v60 = $18;
          
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
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v60);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun5183"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v60).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JLetRec": {ESLVal $17 = _v6.termRef(0);
          ESLVal $16 = _v6.termRef(1);
          
          {ESLVal bs = $17;
          
          {ESLVal _v59 = $16;
          
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
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics,_v59).add(nl.apply(indent))))))))))))))))))))));
        }
        }
        }
      case "JBlock": {ESLVal $15 = _v6.termRef(0);
          
          {ESLVal cs = $15;
          
          return new ESLVal("{").add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v7 = $qualArg;
                
                {ESLVal _v58 = _v7;
                
                return ESLVal.list(ESLVal.list(ppJCommand.apply(indent,dynamics,_v58)));
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
            {ESLVal _v56 = $14;
              
              {ESLVal _v57 = $13;
              
              return _v56.add(new ESLVal(" = ").add(ppJExp.apply(indent,dynamics,_v57).add(new ESLVal(";"))));
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
          
          {ESLVal _v55 = $9;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,_v55).add(nl.apply(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}")))))))))))))))))))))))))));
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
        default: {ESLVal _v66 = _v6;
          
          return new ESLVal("******* unknown command: ").add(_v66);
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
          
          {ESLVal _v54 = $7;
          
          return ppFieldDef.apply(indent,dynamics,f).add(nl.apply(indent).add(ppJFields.apply(indent,dynamics,_v54)));
        }
        }
        }
      else if(_v5.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(27104,27254)").add(ESLVal.list(_v5)));
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
            {ESLVal _v51 = $5;
              
              {ESLVal _v52 = $4;
              
              {ESLVal _v53 = $3;
              
              return new ESLVal("ESLVal ").add(_v51.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v53).add(new ESLVal(";")))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(27318,27572)").add(ESLVal.list(_v4)));
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
          
          {ESLVal _v49 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v49,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      else if(_v3.isNil())
        return new ESLVal("new Term(\"").add(n.add(new ESLVal("\")")));
      else {ESLVal _v50 = _v3;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v50,new ESLVal(",")).add(new ESLVal(")")))));
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