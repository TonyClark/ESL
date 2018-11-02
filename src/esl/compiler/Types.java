package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Types {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal locStart = new ESLVal(new Function(new ESLVal("locStart"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v68 = l;
        
        switch(_v68.termName) {
        case "Pos": {ESLVal $560 = _v68.termRef(0);
          ESLVal $559 = _v68.termRef(1);
          
          {ESLVal start = $560;
          
          {ESLVal end = $559;
          
          return start;
        }
        }
        }
      case "TypedLoc": {ESLVal $558 = _v68.termRef(0);
          ESLVal $557 = _v68.termRef(1);
          ESLVal $556 = _v68.termRef(2);
          
          {ESLVal t = $558;
          
          {ESLVal start = $557;
          
          {ESLVal end = $556;
          
          return start;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5780,5864)").add(ESLVal.list(_v68)));
      }
      }
    }
  });
  private static ESLVal locEnd = new ESLVal(new Function(new ESLVal("locEnd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v67 = l;
        
        switch(_v67.termName) {
        case "Pos": {ESLVal $555 = _v67.termRef(0);
          ESLVal $554 = _v67.termRef(1);
          
          {ESLVal start = $555;
          
          {ESLVal end = $554;
          
          return end;
        }
        }
        }
      case "TypedLoc": {ESLVal $553 = _v67.termRef(0);
          ESLVal $552 = _v67.termRef(1);
          ESLVal $551 = _v67.termRef(2);
          
          {ESLVal t = $553;
          
          {ESLVal start = $552;
          
          {ESLVal end = $551;
          
          return end;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5891,5971)").add(ESLVal.list(_v67)));
      }
      }
    }
  });
  public static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v66 = d;
        
        switch(_v66.termName) {
        case "Dec": {ESLVal $550 = _v66.termRef(0);
          ESLVal $549 = _v66.termRef(1);
          ESLVal $548 = _v66.termRef(2);
          ESLVal $547 = _v66.termRef(3);
          
          {ESLVal l = $550;
          
          {ESLVal n = $549;
          
          {ESLVal t = $548;
          
          {ESLVal dt = $547;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6293,6415)").add(ESLVal.list(_v66)));
      }
      }
    }
  });
  public static ESLVal decLoc = new ESLVal(new Function(new ESLVal("decLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v65 = d;
        
        switch(_v65.termName) {
        case "Dec": {ESLVal $546 = _v65.termRef(0);
          ESLVal $545 = _v65.termRef(1);
          ESLVal $544 = _v65.termRef(2);
          ESLVal $543 = _v65.termRef(3);
          
          {ESLVal l = $546;
          
          {ESLVal n = $545;
          
          {ESLVal t = $544;
          
          {ESLVal dt = $543;
          
          return l;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6519,6577)").add(ESLVal.list(_v65)));
      }
      }
    }
  });
  public static ESLVal decType = new ESLVal(new Function(new ESLVal("decType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v64 = d;
        
        switch(_v64.termName) {
        case "Dec": {ESLVal $542 = _v64.termRef(0);
          ESLVal $541 = _v64.termRef(1);
          ESLVal $540 = _v64.termRef(2);
          ESLVal $539 = _v64.termRef(3);
          
          {ESLVal l = $542;
          
          {ESLVal n = $541;
          
          {ESLVal t = $540;
          
          {ESLVal dt = $539;
          
          return t;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6677,6735)").add(ESLVal.list(_v64)));
      }
      }
    }
  });
  public static ESLVal isStrType = new ESLVal(new Function(new ESLVal("isStrType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v63 = t;
        
        switch(_v63.termName) {
        case "StrType": {ESLVal $538 = _v63.termRef(0);
          
          {ESLVal l = $538;
          
          return $true;
        }
        }
        default: {ESLVal _v448 = _v63;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isIntType = new ESLVal(new Function(new ESLVal("isIntType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v62 = t;
        
        switch(_v62.termName) {
        case "IntType": {ESLVal $537 = _v62.termRef(0);
          
          {ESLVal l = $537;
          
          return $true;
        }
        }
        default: {ESLVal _v447 = _v62;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isNumType = new ESLVal(new Function(new ESLVal("isNumType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v61 = t;
        
        switch(_v61.termName) {
        case "IntType": {ESLVal $536 = _v61.termRef(0);
          
          {ESLVal l = $536;
          
          return $true;
        }
        }
      case "FloatType": {ESLVal $535 = _v61.termRef(0);
          
          {ESLVal l = $535;
          
          return $true;
        }
        }
        default: {ESLVal _v446 = _v61;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isBoolType = new ESLVal(new Function(new ESLVal("isBoolType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v60 = t;
        
        switch(_v60.termName) {
        case "BoolType": {ESLVal $534 = _v60.termRef(0);
          
          {ESLVal l = $534;
          
          return $true;
        }
        }
        default: {ESLVal _v445 = _v60;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isFloatType = new ESLVal(new Function(new ESLVal("isFloatType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v59 = t;
        
        switch(_v59.termName) {
        case "FloatType": {ESLVal $533 = _v59.termRef(0);
          
          {ESLVal l = $533;
          
          return $true;
        }
        }
        default: {ESLVal _v444 = _v59;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal typeEqual = new ESLVal(new Function(new ESLVal("typeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  {ESLVal b = typeEqual1.apply(t1,t2);
        
        return b;
      }
    }
  });
  public static ESLVal typeEqual1 = new ESLVal(new Function(new ESLVal("typeEqual1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  if(t1.eql(t2).boolVal)
        return $true;
        else
          {ESLVal _v58 = t1;
            ESLVal _v57 = t2;
            
            switch(_v58.termName) {
            case "ArrayType": {ESLVal $530 = _v58.termRef(0);
              ESLVal $529 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "ArrayType": {ESLVal $532 = _v57.termRef(0);
                ESLVal $531 = _v57.termRef(1);
                
                {ESLVal l1 = $530;
                
                {ESLVal _v420 = $529;
                
                {ESLVal l2 = $532;
                
                {ESLVal _v421 = $531;
                
                return typeEqual.apply(_v420,_v421);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v430 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v430,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v428 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v429 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v428,flattenAct.apply(l2,_v429,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v427 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v426 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v426,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v424 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v425 = $407;
                  
                  return typeEqual.apply(_v424,substType.apply(new ESLVal("RecType",l2,n2,_v425),n2,_v425));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v422 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v423 = $404;
                  
                  return typeEqual.apply(_v422,_v423);
                }
                }
                }
                }
                }
                default: {ESLVal _v431 = _v58;
                  
                  {ESLVal _v432 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ActType": {ESLVal $525 = _v58.termRef(0);
              ESLVal $524 = _v58.termRef(1);
              ESLVal $523 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "ActType": {ESLVal $528 = _v57.termRef(0);
                ESLVal $527 = _v57.termRef(1);
                ESLVal $526 = _v57.termRef(2);
                
                {ESLVal l1 = $525;
                
                {ESLVal exports1 = $524;
                
                {ESLVal handlers1 = $523;
                
                {ESLVal l2 = $528;
                
                {ESLVal exports2 = $527;
                
                {ESLVal handlers2 = $526;
                
                return actEqual.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v417 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v417,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v415 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v416 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v415,flattenAct.apply(l2,_v416,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v414 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v413 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v413,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v411 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v412 = $407;
                  
                  return typeEqual.apply(_v411,substType.apply(new ESLVal("RecType",l2,n2,_v412),n2,_v412));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v409 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v410 = $404;
                  
                  return typeEqual.apply(_v409,_v410);
                }
                }
                }
                }
                }
                default: {ESLVal _v418 = _v58;
                  
                  {ESLVal _v419 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ApplyTypeFun": {ESLVal $519 = _v58.termRef(0);
              ESLVal $518 = _v58.termRef(1);
              ESLVal $517 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "ApplyTypeFun": {ESLVal $522 = _v57.termRef(0);
                ESLVal $521 = _v57.termRef(1);
                ESLVal $520 = _v57.termRef(2);
                
                {ESLVal l1 = $519;
                
                {ESLVal op1 = $518;
                
                {ESLVal args1 = $517;
                
                {ESLVal l2 = $522;
                
                {ESLVal op2 = $521;
                
                {ESLVal args2 = $520;
                
                return typeEqual.apply(op1,op2).and(typesEqual.apply(args1,args2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $519;
                
                {ESLVal op = $518;
                
                {ESLVal args = $517;
                
                {ESLVal _v408 = _v57;
                
                return typeEqual.apply(applyTypeFun.apply(l,forceType.apply(op),args),_v408);
              }
              }
              }
              }
            }
            }
          case "ExtendedAct": {ESLVal $516 = _v58.termRef(0);
              ESLVal $515 = _v58.termRef(1);
              ESLVal $514 = _v58.termRef(2);
              ESLVal $513 = _v58.termRef(3);
              
              {ESLVal l1 = $516;
              
              {ESLVal _v406 = $515;
              
              {ESLVal ds1 = $514;
              
              {ESLVal ms1 = $513;
              
              {ESLVal _v407 = _v57;
              
              return typeEqual.apply(flattenAct.apply(l1,_v406,ds1,ms1),_v407);
            }
            }
            }
            }
            }
            }
          case "BoolType": {ESLVal $511 = _v58.termRef(0);
              
              switch(_v57.termName) {
              case "BoolType": {ESLVal $512 = _v57.termRef(0);
                
                {ESLVal l1 = $511;
                
                {ESLVal l2 = $512;
                
                return $true;
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v403 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v403,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v401 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v402 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v401,flattenAct.apply(l2,_v402,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v400 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v399 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v399,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v397 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v398 = $407;
                  
                  return typeEqual.apply(_v397,substType.apply(new ESLVal("RecType",l2,n2,_v398),n2,_v398));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v395 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v396 = $404;
                  
                  return typeEqual.apply(_v395,_v396);
                }
                }
                }
                }
                }
                default: {ESLVal _v404 = _v58;
                  
                  {ESLVal _v405 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "FloatType": {ESLVal $509 = _v58.termRef(0);
              
              switch(_v57.termName) {
              case "FloatType": {ESLVal $510 = _v57.termRef(0);
                
                {ESLVal l1 = $509;
                
                {ESLVal l2 = $510;
                
                return $true;
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v392 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v392,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v390 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v391 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v390,flattenAct.apply(l2,_v391,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v389 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v388 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v388,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v386 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v387 = $407;
                  
                  return typeEqual.apply(_v386,substType.apply(new ESLVal("RecType",l2,n2,_v387),n2,_v387));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v384 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v385 = $404;
                  
                  return typeEqual.apply(_v384,_v385);
                }
                }
                }
                }
                }
                default: {ESLVal _v393 = _v58;
                  
                  {ESLVal _v394 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "IntType": {ESLVal $507 = _v58.termRef(0);
              
              switch(_v57.termName) {
              case "IntType": {ESLVal $508 = _v57.termRef(0);
                
                {ESLVal l1 = $507;
                
                {ESLVal l2 = $508;
                
                return $true;
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v381 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v381,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v379 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v380 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v379,flattenAct.apply(l2,_v380,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v378 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v377 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v377,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v375 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v376 = $407;
                  
                  return typeEqual.apply(_v375,substType.apply(new ESLVal("RecType",l2,n2,_v376),n2,_v376));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v373 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v374 = $404;
                  
                  return typeEqual.apply(_v373,_v374);
                }
                }
                }
                }
                }
                default: {ESLVal _v382 = _v58;
                  
                  {ESLVal _v383 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ListType": {ESLVal $493 = _v58.termRef(0);
              ESLVal $492 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "ListType": {ESLVal $506 = _v57.termRef(0);
                ESLVal $505 = _v57.termRef(1);
                
                {ESLVal l1 = $493;
                
                {ESLVal _v360 = $492;
                
                {ESLVal l2 = $506;
                
                {ESLVal _v361 = $505;
                
                return typeEqual.apply(_v360,_v361);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $496 = _v57.termRef(0);
                ESLVal $495 = _v57.termRef(1);
                ESLVal $494 = _v57.termRef(2);
                
                if($495.isCons())
                {ESLVal $497 = $495.head();
                  ESLVal $498 = $495.tail();
                  
                  if($498.isCons())
                  {ESLVal $499 = $498.head();
                    ESLVal $500 = $498.tail();
                    
                    switch(_v57.termName) {
                    case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                      ESLVal $420 = _v57.termRef(1);
                      ESLVal $419 = _v57.termRef(2);
                      
                      {ESLVal _v285 = _v58;
                      
                      {ESLVal l = $421;
                      
                      {ESLVal op = $420;
                      
                      {ESLVal args = $419;
                      
                      return typeEqual.apply(_v285,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                      ESLVal $417 = _v57.termRef(1);
                      ESLVal $416 = _v57.termRef(2);
                      ESLVal $415 = _v57.termRef(3);
                      
                      {ESLVal _v283 = _v58;
                      
                      {ESLVal l2 = $418;
                      
                      {ESLVal _v284 = $417;
                      
                      {ESLVal ds2 = $416;
                      
                      {ESLVal ms2 = $415;
                      
                      return typeEqual.apply(_v283,flattenAct.apply(l2,_v284,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $414 = _v57.termRef(0);
                      
                      {ESLVal t = _v58;
                      
                      {ESLVal l1 = $414;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $413 = _v57.termRef(0);
                      ESLVal $412 = _v57.termRef(1);
                      ESLVal $411 = _v57.termRef(2);
                      
                      {ESLVal _v282 = _v58;
                      
                      {ESLVal l2 = $413;
                      
                      {ESLVal n2 = $412;
                      
                      {ESLVal args2 = $411;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                      
                      {ESLVal _v281 = _v58;
                      
                      {ESLVal f = $410;
                      
                      return typeEqual.apply(_v281,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $409 = _v57.termRef(0);
                      ESLVal $408 = _v57.termRef(1);
                      ESLVal $407 = _v57.termRef(2);
                      
                      {ESLVal _v279 = _v58;
                      
                      {ESLVal l2 = $409;
                      
                      {ESLVal n2 = $408;
                      
                      {ESLVal _v280 = $407;
                      
                      return typeEqual.apply(_v279,substType.apply(new ESLVal("RecType",l2,n2,_v280),n2,_v280));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $406 = _v57.termRef(0);
                      ESLVal $405 = _v57.termRef(1);
                      ESLVal $404 = _v57.termRef(2);
                      
                      {ESLVal _v277 = _v58;
                      
                      {ESLVal l1 = $406;
                      
                      {ESLVal ns2 = $405;
                      
                      {ESLVal _v278 = $404;
                      
                      return typeEqual.apply(_v277,_v278);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v286 = _v58;
                      
                      {ESLVal _v287 = _v57;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($498.isNil())
                  switch($494.termName) {
                    case "ListType": {ESLVal $502 = $494.termRef(0);
                      ESLVal $501 = $494.termRef(1);
                      
                      switch($501.termName) {
                      case "VarType": {ESLVal $504 = $501.termRef(0);
                        ESLVal $503 = $501.termRef(1);
                        
                        {ESLVal l1 = $493;
                        
                        {ESLVal _v288 = $492;
                        
                        {ESLVal l2 = $496;
                        
                        {ESLVal v1 = $497;
                        
                        {ESLVal l3 = $502;
                        
                        {ESLVal l4 = $504;
                        
                        {ESLVal v2 = $503;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                              ESLVal $420 = _v57.termRef(1);
                              ESLVal $419 = _v57.termRef(2);
                              
                              {ESLVal _v302 = _v58;
                              
                              {ESLVal l = $421;
                              
                              {ESLVal op = $420;
                              
                              {ESLVal args = $419;
                              
                              return typeEqual.apply(_v302,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                              ESLVal $417 = _v57.termRef(1);
                              ESLVal $416 = _v57.termRef(2);
                              ESLVal $415 = _v57.termRef(3);
                              
                              {ESLVal _v299 = _v58;
                              
                              {ESLVal _v300 = $418;
                              
                              {ESLVal _v301 = $417;
                              
                              {ESLVal ds2 = $416;
                              
                              {ESLVal ms2 = $415;
                              
                              return typeEqual.apply(_v299,flattenAct.apply(_v300,_v301,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $414 = _v57.termRef(0);
                              
                              {ESLVal t = _v58;
                              
                              {ESLVal _v298 = $414;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $413 = _v57.termRef(0);
                              ESLVal $412 = _v57.termRef(1);
                              ESLVal $411 = _v57.termRef(2);
                              
                              {ESLVal _v296 = _v58;
                              
                              {ESLVal _v297 = $413;
                              
                              {ESLVal n2 = $412;
                              
                              {ESLVal args2 = $411;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                              
                              {ESLVal _v295 = _v58;
                              
                              {ESLVal f = $410;
                              
                              return typeEqual.apply(_v295,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $409 = _v57.termRef(0);
                              ESLVal $408 = _v57.termRef(1);
                              ESLVal $407 = _v57.termRef(2);
                              
                              {ESLVal _v292 = _v58;
                              
                              {ESLVal _v293 = $409;
                              
                              {ESLVal n2 = $408;
                              
                              {ESLVal _v294 = $407;
                              
                              return typeEqual.apply(_v292,substType.apply(new ESLVal("RecType",_v293,n2,_v294),n2,_v294));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $406 = _v57.termRef(0);
                              ESLVal $405 = _v57.termRef(1);
                              ESLVal $404 = _v57.termRef(2);
                              
                              {ESLVal _v289 = _v58;
                              
                              {ESLVal _v290 = $406;
                              
                              {ESLVal ns2 = $405;
                              
                              {ESLVal _v291 = $404;
                              
                              return typeEqual.apply(_v289,_v291);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v303 = _v58;
                              
                              {ESLVal _v304 = _v57;
                              
                              return $false;
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
                      default: switch(_v57.termName) {
                        case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                          ESLVal $420 = _v57.termRef(1);
                          ESLVal $419 = _v57.termRef(2);
                          
                          {ESLVal _v313 = _v58;
                          
                          {ESLVal l = $421;
                          
                          {ESLVal op = $420;
                          
                          {ESLVal args = $419;
                          
                          return typeEqual.apply(_v313,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                          ESLVal $417 = _v57.termRef(1);
                          ESLVal $416 = _v57.termRef(2);
                          ESLVal $415 = _v57.termRef(3);
                          
                          {ESLVal _v311 = _v58;
                          
                          {ESLVal l2 = $418;
                          
                          {ESLVal _v312 = $417;
                          
                          {ESLVal ds2 = $416;
                          
                          {ESLVal ms2 = $415;
                          
                          return typeEqual.apply(_v311,flattenAct.apply(l2,_v312,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $414 = _v57.termRef(0);
                          
                          {ESLVal t = _v58;
                          
                          {ESLVal l1 = $414;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $413 = _v57.termRef(0);
                          ESLVal $412 = _v57.termRef(1);
                          ESLVal $411 = _v57.termRef(2);
                          
                          {ESLVal _v310 = _v58;
                          
                          {ESLVal l2 = $413;
                          
                          {ESLVal n2 = $412;
                          
                          {ESLVal args2 = $411;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                          
                          {ESLVal _v309 = _v58;
                          
                          {ESLVal f = $410;
                          
                          return typeEqual.apply(_v309,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $409 = _v57.termRef(0);
                          ESLVal $408 = _v57.termRef(1);
                          ESLVal $407 = _v57.termRef(2);
                          
                          {ESLVal _v307 = _v58;
                          
                          {ESLVal l2 = $409;
                          
                          {ESLVal n2 = $408;
                          
                          {ESLVal _v308 = $407;
                          
                          return typeEqual.apply(_v307,substType.apply(new ESLVal("RecType",l2,n2,_v308),n2,_v308));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $406 = _v57.termRef(0);
                          ESLVal $405 = _v57.termRef(1);
                          ESLVal $404 = _v57.termRef(2);
                          
                          {ESLVal _v305 = _v58;
                          
                          {ESLVal l1 = $406;
                          
                          {ESLVal ns2 = $405;
                          
                          {ESLVal _v306 = $404;
                          
                          return typeEqual.apply(_v305,_v306);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v314 = _v58;
                          
                          {ESLVal _v315 = _v57;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                        ESLVal $420 = _v57.termRef(1);
                        ESLVal $419 = _v57.termRef(2);
                        
                        {ESLVal _v324 = _v58;
                        
                        {ESLVal l = $421;
                        
                        {ESLVal op = $420;
                        
                        {ESLVal args = $419;
                        
                        return typeEqual.apply(_v324,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                        ESLVal $417 = _v57.termRef(1);
                        ESLVal $416 = _v57.termRef(2);
                        ESLVal $415 = _v57.termRef(3);
                        
                        {ESLVal _v322 = _v58;
                        
                        {ESLVal l2 = $418;
                        
                        {ESLVal _v323 = $417;
                        
                        {ESLVal ds2 = $416;
                        
                        {ESLVal ms2 = $415;
                        
                        return typeEqual.apply(_v322,flattenAct.apply(l2,_v323,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $414 = _v57.termRef(0);
                        
                        {ESLVal t = _v58;
                        
                        {ESLVal l1 = $414;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $413 = _v57.termRef(0);
                        ESLVal $412 = _v57.termRef(1);
                        ESLVal $411 = _v57.termRef(2);
                        
                        {ESLVal _v321 = _v58;
                        
                        {ESLVal l2 = $413;
                        
                        {ESLVal n2 = $412;
                        
                        {ESLVal args2 = $411;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                        
                        {ESLVal _v320 = _v58;
                        
                        {ESLVal f = $410;
                        
                        return typeEqual.apply(_v320,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $409 = _v57.termRef(0);
                        ESLVal $408 = _v57.termRef(1);
                        ESLVal $407 = _v57.termRef(2);
                        
                        {ESLVal _v318 = _v58;
                        
                        {ESLVal l2 = $409;
                        
                        {ESLVal n2 = $408;
                        
                        {ESLVal _v319 = $407;
                        
                        return typeEqual.apply(_v318,substType.apply(new ESLVal("RecType",l2,n2,_v319),n2,_v319));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $406 = _v57.termRef(0);
                        ESLVal $405 = _v57.termRef(1);
                        ESLVal $404 = _v57.termRef(2);
                        
                        {ESLVal _v316 = _v58;
                        
                        {ESLVal l1 = $406;
                        
                        {ESLVal ns2 = $405;
                        
                        {ESLVal _v317 = $404;
                        
                        return typeEqual.apply(_v316,_v317);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v325 = _v58;
                        
                        {ESLVal _v326 = _v57;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v57.termName) {
                    case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                      ESLVal $420 = _v57.termRef(1);
                      ESLVal $419 = _v57.termRef(2);
                      
                      {ESLVal _v335 = _v58;
                      
                      {ESLVal l = $421;
                      
                      {ESLVal op = $420;
                      
                      {ESLVal args = $419;
                      
                      return typeEqual.apply(_v335,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                      ESLVal $417 = _v57.termRef(1);
                      ESLVal $416 = _v57.termRef(2);
                      ESLVal $415 = _v57.termRef(3);
                      
                      {ESLVal _v333 = _v58;
                      
                      {ESLVal l2 = $418;
                      
                      {ESLVal _v334 = $417;
                      
                      {ESLVal ds2 = $416;
                      
                      {ESLVal ms2 = $415;
                      
                      return typeEqual.apply(_v333,flattenAct.apply(l2,_v334,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $414 = _v57.termRef(0);
                      
                      {ESLVal t = _v58;
                      
                      {ESLVal l1 = $414;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $413 = _v57.termRef(0);
                      ESLVal $412 = _v57.termRef(1);
                      ESLVal $411 = _v57.termRef(2);
                      
                      {ESLVal _v332 = _v58;
                      
                      {ESLVal l2 = $413;
                      
                      {ESLVal n2 = $412;
                      
                      {ESLVal args2 = $411;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                      
                      {ESLVal _v331 = _v58;
                      
                      {ESLVal f = $410;
                      
                      return typeEqual.apply(_v331,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $409 = _v57.termRef(0);
                      ESLVal $408 = _v57.termRef(1);
                      ESLVal $407 = _v57.termRef(2);
                      
                      {ESLVal _v329 = _v58;
                      
                      {ESLVal l2 = $409;
                      
                      {ESLVal n2 = $408;
                      
                      {ESLVal _v330 = $407;
                      
                      return typeEqual.apply(_v329,substType.apply(new ESLVal("RecType",l2,n2,_v330),n2,_v330));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $406 = _v57.termRef(0);
                      ESLVal $405 = _v57.termRef(1);
                      ESLVal $404 = _v57.termRef(2);
                      
                      {ESLVal _v327 = _v58;
                      
                      {ESLVal l1 = $406;
                      
                      {ESLVal ns2 = $405;
                      
                      {ESLVal _v328 = $404;
                      
                      return typeEqual.apply(_v327,_v328);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v336 = _v58;
                      
                      {ESLVal _v337 = _v57;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($495.isNil())
                switch(_v57.termName) {
                  case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                    ESLVal $420 = _v57.termRef(1);
                    ESLVal $419 = _v57.termRef(2);
                    
                    {ESLVal _v346 = _v58;
                    
                    {ESLVal l = $421;
                    
                    {ESLVal op = $420;
                    
                    {ESLVal args = $419;
                    
                    return typeEqual.apply(_v346,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                    ESLVal $417 = _v57.termRef(1);
                    ESLVal $416 = _v57.termRef(2);
                    ESLVal $415 = _v57.termRef(3);
                    
                    {ESLVal _v344 = _v58;
                    
                    {ESLVal l2 = $418;
                    
                    {ESLVal _v345 = $417;
                    
                    {ESLVal ds2 = $416;
                    
                    {ESLVal ms2 = $415;
                    
                    return typeEqual.apply(_v344,flattenAct.apply(l2,_v345,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $414 = _v57.termRef(0);
                    
                    {ESLVal t = _v58;
                    
                    {ESLVal l1 = $414;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $413 = _v57.termRef(0);
                    ESLVal $412 = _v57.termRef(1);
                    ESLVal $411 = _v57.termRef(2);
                    
                    {ESLVal _v343 = _v58;
                    
                    {ESLVal l2 = $413;
                    
                    {ESLVal n2 = $412;
                    
                    {ESLVal args2 = $411;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                    
                    {ESLVal _v342 = _v58;
                    
                    {ESLVal f = $410;
                    
                    return typeEqual.apply(_v342,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $409 = _v57.termRef(0);
                    ESLVal $408 = _v57.termRef(1);
                    ESLVal $407 = _v57.termRef(2);
                    
                    {ESLVal _v340 = _v58;
                    
                    {ESLVal l2 = $409;
                    
                    {ESLVal n2 = $408;
                    
                    {ESLVal _v341 = $407;
                    
                    return typeEqual.apply(_v340,substType.apply(new ESLVal("RecType",l2,n2,_v341),n2,_v341));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $406 = _v57.termRef(0);
                    ESLVal $405 = _v57.termRef(1);
                    ESLVal $404 = _v57.termRef(2);
                    
                    {ESLVal _v338 = _v58;
                    
                    {ESLVal l1 = $406;
                    
                    {ESLVal ns2 = $405;
                    
                    {ESLVal _v339 = $404;
                    
                    return typeEqual.apply(_v338,_v339);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v347 = _v58;
                    
                    {ESLVal _v348 = _v57;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v57.termName) {
                  case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                    ESLVal $420 = _v57.termRef(1);
                    ESLVal $419 = _v57.termRef(2);
                    
                    {ESLVal _v357 = _v58;
                    
                    {ESLVal l = $421;
                    
                    {ESLVal op = $420;
                    
                    {ESLVal args = $419;
                    
                    return typeEqual.apply(_v357,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                    ESLVal $417 = _v57.termRef(1);
                    ESLVal $416 = _v57.termRef(2);
                    ESLVal $415 = _v57.termRef(3);
                    
                    {ESLVal _v355 = _v58;
                    
                    {ESLVal l2 = $418;
                    
                    {ESLVal _v356 = $417;
                    
                    {ESLVal ds2 = $416;
                    
                    {ESLVal ms2 = $415;
                    
                    return typeEqual.apply(_v355,flattenAct.apply(l2,_v356,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $414 = _v57.termRef(0);
                    
                    {ESLVal t = _v58;
                    
                    {ESLVal l1 = $414;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $413 = _v57.termRef(0);
                    ESLVal $412 = _v57.termRef(1);
                    ESLVal $411 = _v57.termRef(2);
                    
                    {ESLVal _v354 = _v58;
                    
                    {ESLVal l2 = $413;
                    
                    {ESLVal n2 = $412;
                    
                    {ESLVal args2 = $411;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                    
                    {ESLVal _v353 = _v58;
                    
                    {ESLVal f = $410;
                    
                    return typeEqual.apply(_v353,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $409 = _v57.termRef(0);
                    ESLVal $408 = _v57.termRef(1);
                    ESLVal $407 = _v57.termRef(2);
                    
                    {ESLVal _v351 = _v58;
                    
                    {ESLVal l2 = $409;
                    
                    {ESLVal n2 = $408;
                    
                    {ESLVal _v352 = $407;
                    
                    return typeEqual.apply(_v351,substType.apply(new ESLVal("RecType",l2,n2,_v352),n2,_v352));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $406 = _v57.termRef(0);
                    ESLVal $405 = _v57.termRef(1);
                    ESLVal $404 = _v57.termRef(2);
                    
                    {ESLVal _v349 = _v58;
                    
                    {ESLVal l1 = $406;
                    
                    {ESLVal ns2 = $405;
                    
                    {ESLVal _v350 = $404;
                    
                    return typeEqual.apply(_v349,_v350);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v358 = _v58;
                    
                    {ESLVal _v359 = _v57;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v370 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v370,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v368 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v369 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v368,flattenAct.apply(l2,_v369,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v367 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v366 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v366,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v364 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v365 = $407;
                  
                  return typeEqual.apply(_v364,substType.apply(new ESLVal("RecType",l2,n2,_v365),n2,_v365));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v362 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v363 = $404;
                  
                  return typeEqual.apply(_v362,_v363);
                }
                }
                }
                }
                }
                default: {ESLVal _v371 = _v58;
                  
                  {ESLVal _v372 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $489 = _v58.termRef(0);
              ESLVal $488 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "BagType": {ESLVal $491 = _v57.termRef(0);
                ESLVal $490 = _v57.termRef(1);
                
                {ESLVal l1 = $489;
                
                {ESLVal _v264 = $488;
                
                {ESLVal l2 = $491;
                
                {ESLVal _v265 = $490;
                
                return typeEqual.apply(_v264,_v265);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v274 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v274,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v272 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v273 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v272,flattenAct.apply(l2,_v273,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v271 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v270 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v270,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v268 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v269 = $407;
                  
                  return typeEqual.apply(_v268,substType.apply(new ESLVal("RecType",l2,n2,_v269),n2,_v269));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v266 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v267 = $404;
                  
                  return typeEqual.apply(_v266,_v267);
                }
                }
                }
                }
                }
                default: {ESLVal _v275 = _v58;
                  
                  {ESLVal _v276 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $485 = _v58.termRef(0);
              ESLVal $484 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "SetType": {ESLVal $487 = _v57.termRef(0);
                ESLVal $486 = _v57.termRef(1);
                
                {ESLVal l1 = $485;
                
                {ESLVal _v251 = $484;
                
                {ESLVal l2 = $487;
                
                {ESLVal _v252 = $486;
                
                return typeEqual.apply(_v251,_v252);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v261 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v261,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v259 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v260 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v259,flattenAct.apply(l2,_v260,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v258 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v257 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v257,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v255 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v256 = $407;
                  
                  return typeEqual.apply(_v255,substType.apply(new ESLVal("RecType",l2,n2,_v256),n2,_v256));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v253 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v254 = $404;
                  
                  return typeEqual.apply(_v253,_v254);
                }
                }
                }
                }
                }
                default: {ESLVal _v262 = _v58;
                  
                  {ESLVal _v263 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "StrType": {ESLVal $482 = _v58.termRef(0);
              
              switch(_v57.termName) {
              case "StrType": {ESLVal $483 = _v57.termRef(0);
                
                {ESLVal l1 = $482;
                
                {ESLVal l2 = $483;
                
                return $true;
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v248 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v248,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v246 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v247 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v246,flattenAct.apply(l2,_v247,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v245 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v244 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v244,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v242 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v243 = $407;
                  
                  return typeEqual.apply(_v242,substType.apply(new ESLVal("RecType",l2,n2,_v243),n2,_v243));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v240 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v241 = $404;
                  
                  return typeEqual.apply(_v240,_v241);
                }
                }
                }
                }
                }
                default: {ESLVal _v249 = _v58;
                  
                  {ESLVal _v250 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VoidType": {ESLVal $481 = _v58.termRef(0);
              
              {ESLVal l1 = $481;
              
              {ESLVal t = _v57;
              
              return $true;
            }
            }
            }
          case "FieldType": {ESLVal $477 = _v58.termRef(0);
              ESLVal $476 = _v58.termRef(1);
              ESLVal $475 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "FieldType": {ESLVal $480 = _v57.termRef(0);
                ESLVal $479 = _v57.termRef(1);
                ESLVal $478 = _v57.termRef(2);
                
                {ESLVal l1 = $477;
                
                {ESLVal n1 = $476;
                
                {ESLVal _v227 = $475;
                
                {ESLVal l2 = $480;
                
                {ESLVal n2 = $479;
                
                {ESLVal _v228 = $478;
                
                return n1.eql(n2).and(typeEqual.apply(_v227,_v228));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v237 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v237,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v235 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v236 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v235,flattenAct.apply(l2,_v236,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v234 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v233 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v233,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v231 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v232 = $407;
                  
                  return typeEqual.apply(_v231,substType.apply(new ESLVal("RecType",l2,n2,_v232),n2,_v232));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v229 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v230 = $404;
                  
                  return typeEqual.apply(_v229,_v230);
                }
                }
                }
                }
                }
                default: {ESLVal _v238 = _v58;
                  
                  {ESLVal _v239 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TableType": {ESLVal $471 = _v58.termRef(0);
              ESLVal $470 = _v58.termRef(1);
              ESLVal $469 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "TableType": {ESLVal $474 = _v57.termRef(0);
                ESLVal $473 = _v57.termRef(1);
                ESLVal $472 = _v57.termRef(2);
                
                {ESLVal l1 = $471;
                
                {ESLVal k1 = $470;
                
                {ESLVal v1 = $469;
                
                {ESLVal l2 = $474;
                
                {ESLVal k2 = $473;
                
                {ESLVal v2 = $472;
                
                return typeEqual.apply(k1,k2).and(typeEqual.apply(v1,v2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v224 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v224,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v222 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v223 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v222,flattenAct.apply(l2,_v223,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v221 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v220 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v220,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v218 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v219 = $407;
                  
                  return typeEqual.apply(_v218,substType.apply(new ESLVal("RecType",l2,n2,_v219),n2,_v219));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v216 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v217 = $404;
                  
                  return typeEqual.apply(_v216,_v217);
                }
                }
                }
                }
                }
                default: {ESLVal _v225 = _v58;
                  
                  {ESLVal _v226 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $465 = _v58.termRef(0);
              ESLVal $464 = _v58.termRef(1);
              ESLVal $463 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "TermType": {ESLVal $468 = _v57.termRef(0);
                ESLVal $467 = _v57.termRef(1);
                ESLVal $466 = _v57.termRef(2);
                
                {ESLVal l1 = $465;
                
                {ESLVal n1 = $464;
                
                {ESLVal args1 = $463;
                
                {ESLVal l2 = $468;
                
                {ESLVal n2 = $467;
                
                {ESLVal args2 = $466;
                
                if(n1.eql(n2).boolVal)
                return typesEqual.apply(args1,args2);
                else
                  return $false;
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $465;
                
                {ESLVal n1 = $464;
                
                {ESLVal args1 = $463;
                
                {ESLVal _v215 = _v57;
                
                return $false;
              }
              }
              }
              }
            }
            }
          case "FunType": {ESLVal $459 = _v58.termRef(0);
              ESLVal $458 = _v58.termRef(1);
              ESLVal $457 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "FunType": {ESLVal $462 = _v57.termRef(0);
                ESLVal $461 = _v57.termRef(1);
                ESLVal $460 = _v57.termRef(2);
                
                {ESLVal l1 = $459;
                
                {ESLVal d1 = $458;
                
                {ESLVal r1 = $457;
                
                {ESLVal l2 = $462;
                
                {ESLVal d2 = $461;
                
                {ESLVal r2 = $460;
                
                return typeEqual.apply(r1,r2).and(typesEqual.apply(d1,d2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v212 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v212,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v210 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v211 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v210,flattenAct.apply(l2,_v211,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v209 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v208 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v208,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v206 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v207 = $407;
                  
                  return typeEqual.apply(_v206,substType.apply(new ESLVal("RecType",l2,n2,_v207),n2,_v207));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v204 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v205 = $404;
                  
                  return typeEqual.apply(_v204,_v205);
                }
                }
                }
                }
                }
                default: {ESLVal _v213 = _v58;
                  
                  {ESLVal _v214 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $456 = _v58.termRef(0);
              
              {ESLVal f = $456;
              
              {ESLVal _v203 = _v57;
              
              return typeEqual.apply(f.apply(),_v203);
            }
            }
            }
          case "RecordType": {ESLVal $453 = _v58.termRef(0);
              ESLVal $452 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "RecordType": {ESLVal $455 = _v57.termRef(0);
                ESLVal $454 = _v57.termRef(1);
                
                {ESLVal l1 = $453;
                
                {ESLVal fs1 = $452;
                
                {ESLVal l2 = $455;
                
                {ESLVal fs2 = $454;
                
                return recordTypeEqual.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v200 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v200,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v198 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v199 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v198,flattenAct.apply(l2,_v199,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v197 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v196 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v196,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v194 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v195 = $407;
                  
                  return typeEqual.apply(_v194,substType.apply(new ESLVal("RecType",l2,n2,_v195),n2,_v195));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v192 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v193 = $404;
                  
                  return typeEqual.apply(_v192,_v193);
                }
                }
                }
                }
                }
                default: {ESLVal _v201 = _v58;
                  
                  {ESLVal _v202 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $448 = _v58.termRef(0);
              ESLVal $447 = _v58.termRef(1);
              ESLVal $446 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "RecType": {ESLVal $451 = _v57.termRef(0);
                ESLVal $450 = _v57.termRef(1);
                ESLVal $449 = _v57.termRef(2);
                
                {ESLVal l1 = $448;
                
                {ESLVal n1 = $447;
                
                {ESLVal _v184 = $446;
                
                {ESLVal l2 = $451;
                
                {ESLVal n2 = $450;
                
                {ESLVal _v185 = $449;
                
                if(n1.eql(n2).boolVal)
                return typeEqual.apply(_v184,_v185);
                else
                  {ESLVal _v186 = $448;
                    
                    {ESLVal _v187 = $447;
                    
                    {ESLVal _v188 = $446;
                    
                    {ESLVal _v189 = _v57;
                    
                    return typeEqual.apply(substType.apply(new ESLVal("RecType",_v186,_v187,_v188),_v187,_v188),_v189);
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
              default: {ESLVal l1 = $448;
                
                {ESLVal n1 = $447;
                
                {ESLVal _v190 = $446;
                
                {ESLVal _v191 = _v57;
                
                return typeEqual.apply(substType.apply(new ESLVal("RecType",l1,n1,_v190),n1,_v190),_v191);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $443 = _v58.termRef(0);
              ESLVal $442 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "UnionType": {ESLVal $445 = _v57.termRef(0);
                ESLVal $444 = _v57.termRef(1);
                
                {ESLVal l1 = $443;
                
                {ESLVal terms1 = $442;
                
                {ESLVal l2 = $445;
                
                {ESLVal terms2 = $444;
                
                return typeSetEqual.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v181 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v181,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v179 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v180 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v179,flattenAct.apply(l2,_v180,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v178 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v177 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v177,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v175 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v176 = $407;
                  
                  return typeEqual.apply(_v175,substType.apply(new ESLVal("RecType",l2,n2,_v176),n2,_v176));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v173 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v174 = $404;
                  
                  return typeEqual.apply(_v173,_v174);
                }
                }
                }
                }
                }
                default: {ESLVal _v182 = _v58;
                  
                  {ESLVal _v183 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $439 = _v58.termRef(0);
              ESLVal $438 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "VarType": {ESLVal $441 = _v57.termRef(0);
                ESLVal $440 = _v57.termRef(1);
                
                {ESLVal l1 = $439;
                
                {ESLVal n1 = $438;
                
                {ESLVal l2 = $441;
                
                {ESLVal n2 = $440;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                  ESLVal $420 = _v57.termRef(1);
                  ESLVal $419 = _v57.termRef(2);
                  
                  {ESLVal _v170 = _v58;
                  
                  {ESLVal l = $421;
                  
                  {ESLVal op = $420;
                  
                  {ESLVal args = $419;
                  
                  return typeEqual.apply(_v170,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                  ESLVal $417 = _v57.termRef(1);
                  ESLVal $416 = _v57.termRef(2);
                  ESLVal $415 = _v57.termRef(3);
                  
                  {ESLVal _v168 = _v58;
                  
                  {ESLVal l2 = $418;
                  
                  {ESLVal _v169 = $417;
                  
                  {ESLVal ds2 = $416;
                  
                  {ESLVal ms2 = $415;
                  
                  return typeEqual.apply(_v168,flattenAct.apply(l2,_v169,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $414 = _v57.termRef(0);
                  
                  {ESLVal t = _v58;
                  
                  {ESLVal l1 = $414;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $413 = _v57.termRef(0);
                  ESLVal $412 = _v57.termRef(1);
                  ESLVal $411 = _v57.termRef(2);
                  
                  {ESLVal _v167 = _v58;
                  
                  {ESLVal l2 = $413;
                  
                  {ESLVal n2 = $412;
                  
                  {ESLVal args2 = $411;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                  
                  {ESLVal _v166 = _v58;
                  
                  {ESLVal f = $410;
                  
                  return typeEqual.apply(_v166,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $409 = _v57.termRef(0);
                  ESLVal $408 = _v57.termRef(1);
                  ESLVal $407 = _v57.termRef(2);
                  
                  {ESLVal _v164 = _v58;
                  
                  {ESLVal l2 = $409;
                  
                  {ESLVal n2 = $408;
                  
                  {ESLVal _v165 = $407;
                  
                  return typeEqual.apply(_v164,substType.apply(new ESLVal("RecType",l2,n2,_v165),n2,_v165));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $406 = _v57.termRef(0);
                  ESLVal $405 = _v57.termRef(1);
                  ESLVal $404 = _v57.termRef(2);
                  
                  {ESLVal _v162 = _v58;
                  
                  {ESLVal l1 = $406;
                  
                  {ESLVal ns2 = $405;
                  
                  {ESLVal _v163 = $404;
                  
                  return typeEqual.apply(_v162,_v163);
                }
                }
                }
                }
                }
                default: {ESLVal _v171 = _v58;
                  
                  {ESLVal _v172 = _v57;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $424 = _v58.termRef(0);
              ESLVal $423 = _v58.termRef(1);
              ESLVal $422 = _v58.termRef(2);
              
              if($423.isCons())
              {ESLVal $428 = $423.head();
                ESLVal $429 = $423.tail();
                
                if($429.isCons())
                {ESLVal $430 = $429.head();
                  ESLVal $431 = $429.tail();
                  
                  switch(_v57.termName) {
                  case "ForallType": {ESLVal $427 = _v57.termRef(0);
                    ESLVal $426 = _v57.termRef(1);
                    ESLVal $425 = _v57.termRef(2);
                    
                    {ESLVal l1 = $424;
                    
                    {ESLVal ns1 = $423;
                    
                    {ESLVal _v126 = $422;
                    
                    {ESLVal l2 = $427;
                    
                    {ESLVal ns2 = $426;
                    
                    {ESLVal _v127 = $425;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v126,_v127));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $424;
                    
                    {ESLVal ns1 = $423;
                    
                    {ESLVal _v128 = $422;
                    
                    {ESLVal _v129 = _v57;
                    
                    return typeEqual.apply(_v128,_v129);
                  }
                  }
                  }
                  }
                }
                }
              else if($429.isNil())
                switch($422.termName) {
                  case "ListType": {ESLVal $433 = $422.termRef(0);
                    ESLVal $432 = $422.termRef(1);
                    
                    switch($432.termName) {
                    case "VarType": {ESLVal $435 = $432.termRef(0);
                      ESLVal $434 = $432.termRef(1);
                      
                      switch(_v57.termName) {
                      case "ListType": {ESLVal $437 = _v57.termRef(0);
                        ESLVal $436 = _v57.termRef(1);
                        
                        {ESLVal l2 = $424;
                        
                        {ESLVal v1 = $428;
                        
                        {ESLVal l3 = $433;
                        
                        {ESLVal l4 = $435;
                        
                        {ESLVal v2 = $434;
                        
                        {ESLVal l1 = $437;
                        
                        {ESLVal _v130 = $436;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ForallType": {ESLVal $427 = _v57.termRef(0);
                              ESLVal $426 = _v57.termRef(1);
                              ESLVal $425 = _v57.termRef(2);
                              
                              {ESLVal _v131 = $424;
                              
                              {ESLVal ns1 = $423;
                              
                              {ESLVal _v132 = $422;
                              
                              {ESLVal _v133 = $427;
                              
                              {ESLVal ns2 = $426;
                              
                              {ESLVal _v134 = $425;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v132,_v134));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v135 = $424;
                              
                              {ESLVal ns1 = $423;
                              
                              {ESLVal _v136 = $422;
                              
                              {ESLVal _v137 = _v57;
                              
                              return typeEqual.apply(_v136,_v137);
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
                      default: switch(_v57.termName) {
                        case "ForallType": {ESLVal $427 = _v57.termRef(0);
                          ESLVal $426 = _v57.termRef(1);
                          ESLVal $425 = _v57.termRef(2);
                          
                          {ESLVal l1 = $424;
                          
                          {ESLVal ns1 = $423;
                          
                          {ESLVal _v138 = $422;
                          
                          {ESLVal l2 = $427;
                          
                          {ESLVal ns2 = $426;
                          
                          {ESLVal _v139 = $425;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v138,_v139));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $424;
                          
                          {ESLVal ns1 = $423;
                          
                          {ESLVal _v140 = $422;
                          
                          {ESLVal _v141 = _v57;
                          
                          return typeEqual.apply(_v140,_v141);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ForallType": {ESLVal $427 = _v57.termRef(0);
                        ESLVal $426 = _v57.termRef(1);
                        ESLVal $425 = _v57.termRef(2);
                        
                        {ESLVal l1 = $424;
                        
                        {ESLVal ns1 = $423;
                        
                        {ESLVal _v142 = $422;
                        
                        {ESLVal l2 = $427;
                        
                        {ESLVal ns2 = $426;
                        
                        {ESLVal _v143 = $425;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v142,_v143));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $424;
                        
                        {ESLVal ns1 = $423;
                        
                        {ESLVal _v144 = $422;
                        
                        {ESLVal _v145 = _v57;
                        
                        return typeEqual.apply(_v144,_v145);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v57.termName) {
                    case "ForallType": {ESLVal $427 = _v57.termRef(0);
                      ESLVal $426 = _v57.termRef(1);
                      ESLVal $425 = _v57.termRef(2);
                      
                      {ESLVal l1 = $424;
                      
                      {ESLVal ns1 = $423;
                      
                      {ESLVal _v146 = $422;
                      
                      {ESLVal l2 = $427;
                      
                      {ESLVal ns2 = $426;
                      
                      {ESLVal _v147 = $425;
                      
                      return ns1.eql(ns2).and(typeEqual.apply(_v146,_v147));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $424;
                      
                      {ESLVal ns1 = $423;
                      
                      {ESLVal _v148 = $422;
                      
                      {ESLVal _v149 = _v57;
                      
                      return typeEqual.apply(_v148,_v149);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v57.termName) {
                  case "ForallType": {ESLVal $427 = _v57.termRef(0);
                    ESLVal $426 = _v57.termRef(1);
                    ESLVal $425 = _v57.termRef(2);
                    
                    {ESLVal l1 = $424;
                    
                    {ESLVal ns1 = $423;
                    
                    {ESLVal _v150 = $422;
                    
                    {ESLVal l2 = $427;
                    
                    {ESLVal ns2 = $426;
                    
                    {ESLVal _v151 = $425;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v150,_v151));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $424;
                    
                    {ESLVal ns1 = $423;
                    
                    {ESLVal _v152 = $422;
                    
                    {ESLVal _v153 = _v57;
                    
                    return typeEqual.apply(_v152,_v153);
                  }
                  }
                  }
                  }
                }
              }
            else if($423.isNil())
              switch(_v57.termName) {
                case "ForallType": {ESLVal $427 = _v57.termRef(0);
                  ESLVal $426 = _v57.termRef(1);
                  ESLVal $425 = _v57.termRef(2);
                  
                  {ESLVal l1 = $424;
                  
                  {ESLVal ns1 = $423;
                  
                  {ESLVal _v154 = $422;
                  
                  {ESLVal l2 = $427;
                  
                  {ESLVal ns2 = $426;
                  
                  {ESLVal _v155 = $425;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v154,_v155));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $424;
                  
                  {ESLVal ns1 = $423;
                  
                  {ESLVal _v156 = $422;
                  
                  {ESLVal _v157 = _v57;
                  
                  return typeEqual.apply(_v156,_v157);
                }
                }
                }
                }
              }
            else switch(_v57.termName) {
                case "ForallType": {ESLVal $427 = _v57.termRef(0);
                  ESLVal $426 = _v57.termRef(1);
                  ESLVal $425 = _v57.termRef(2);
                  
                  {ESLVal l1 = $424;
                  
                  {ESLVal ns1 = $423;
                  
                  {ESLVal _v158 = $422;
                  
                  {ESLVal l2 = $427;
                  
                  {ESLVal ns2 = $426;
                  
                  {ESLVal _v159 = $425;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v158,_v159));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $424;
                  
                  {ESLVal ns1 = $423;
                  
                  {ESLVal _v160 = $422;
                  
                  {ESLVal _v161 = _v57;
                  
                  return typeEqual.apply(_v160,_v161);
                }
                }
                }
                }
              }
            }
            default: switch(_v57.termName) {
              case "ApplyTypeFun": {ESLVal $421 = _v57.termRef(0);
                ESLVal $420 = _v57.termRef(1);
                ESLVal $419 = _v57.termRef(2);
                
                {ESLVal _v441 = _v58;
                
                {ESLVal l = $421;
                
                {ESLVal op = $420;
                
                {ESLVal args = $419;
                
                return typeEqual.apply(_v441,applyTypeFun.apply(l,forceType.apply(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $418 = _v57.termRef(0);
                ESLVal $417 = _v57.termRef(1);
                ESLVal $416 = _v57.termRef(2);
                ESLVal $415 = _v57.termRef(3);
                
                {ESLVal _v439 = _v58;
                
                {ESLVal l2 = $418;
                
                {ESLVal _v440 = $417;
                
                {ESLVal ds2 = $416;
                
                {ESLVal ms2 = $415;
                
                return typeEqual.apply(_v439,flattenAct.apply(l2,_v440,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $414 = _v57.termRef(0);
                
                {ESLVal t = _v58;
                
                {ESLVal l1 = $414;
                
                return $true;
              }
              }
              }
            case "TermType": {ESLVal $413 = _v57.termRef(0);
                ESLVal $412 = _v57.termRef(1);
                ESLVal $411 = _v57.termRef(2);
                
                {ESLVal _v438 = _v58;
                
                {ESLVal l2 = $413;
                
                {ESLVal n2 = $412;
                
                {ESLVal args2 = $411;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $410 = _v57.termRef(0);
                
                {ESLVal _v437 = _v58;
                
                {ESLVal f = $410;
                
                return typeEqual.apply(_v437,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $409 = _v57.termRef(0);
                ESLVal $408 = _v57.termRef(1);
                ESLVal $407 = _v57.termRef(2);
                
                {ESLVal _v435 = _v58;
                
                {ESLVal l2 = $409;
                
                {ESLVal n2 = $408;
                
                {ESLVal _v436 = $407;
                
                return typeEqual.apply(_v435,substType.apply(new ESLVal("RecType",l2,n2,_v436),n2,_v436));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $406 = _v57.termRef(0);
                ESLVal $405 = _v57.termRef(1);
                ESLVal $404 = _v57.termRef(2);
                
                {ESLVal _v433 = _v58;
                
                {ESLVal l1 = $406;
                
                {ESLVal ns2 = $405;
                
                {ESLVal _v434 = $404;
                
                return typeEqual.apply(_v433,_v434);
              }
              }
              }
              }
              }
              default: {ESLVal _v442 = _v58;
                
                {ESLVal _v443 = _v57;
                
                return $false;
              }
              }
            }
          }
          }
    }
  });
  public static ESLVal subType = new ESLVal(new Function(new ESLVal("subType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sub = $args[0];
  ESLVal parent = $args[1];
  if(sub.eql(parent).boolVal)
        return $true;
        else
          {ESLVal _v56 = sub;
            ESLVal _v55 = parent;
            
            switch(_v56.termName) {
            case "ActType": {ESLVal $400 = _v56.termRef(0);
              ESLVal $399 = _v56.termRef(1);
              ESLVal $398 = _v56.termRef(2);
              
              switch(_v55.termName) {
              case "ActType": {ESLVal $403 = _v55.termRef(0);
                ESLVal $402 = _v55.termRef(1);
                ESLVal $401 = _v55.termRef(2);
                
                {ESLVal l1 = $400;
                
                {ESLVal exports1 = $399;
                
                {ESLVal handlers1 = $398;
                
                {ESLVal l2 = $403;
                
                {ESLVal exports2 = $402;
                
                {ESLVal handlers2 = $401;
                
                return actSubType.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ExtendedAct": {ESLVal $397 = _v56.termRef(0);
              ESLVal $396 = _v56.termRef(1);
              ESLVal $395 = _v56.termRef(2);
              ESLVal $394 = _v56.termRef(3);
              
              {ESLVal l1 = $397;
              
              {ESLVal t1 = $396;
              
              {ESLVal ds1 = $395;
              
              {ESLVal ms1 = $394;
              
              {ESLVal t2 = _v55;
              
              return subType.apply(flattenAct.apply(l1,t1,ds1,ms1),t2);
            }
            }
            }
            }
            }
            }
          case "ListType": {ESLVal $380 = _v56.termRef(0);
              ESLVal $379 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "ListType": {ESLVal $393 = _v55.termRef(0);
                ESLVal $392 = _v55.termRef(1);
                
                {ESLVal l1 = $380;
                
                {ESLVal t1 = $379;
                
                {ESLVal l2 = $393;
                
                {ESLVal t2 = $392;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $383 = _v55.termRef(0);
                ESLVal $382 = _v55.termRef(1);
                ESLVal $381 = _v55.termRef(2);
                
                if($382.isCons())
                {ESLVal $384 = $382.head();
                  ESLVal $385 = $382.tail();
                  
                  if($385.isCons())
                  {ESLVal $386 = $385.head();
                    ESLVal $387 = $385.tail();
                    
                    switch(_v55.termName) {
                    case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                      ESLVal $322 = _v55.termRef(1);
                      ESLVal $321 = _v55.termRef(2);
                      ESLVal $320 = _v55.termRef(3);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l2 = $323;
                      
                      {ESLVal t2 = $322;
                      
                      {ESLVal ds2 = $321;
                      
                      {ESLVal ms2 = $320;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal f = $319;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $318 = _v55.termRef(0);
                      ESLVal $317 = _v55.termRef(1);
                      ESLVal $316 = _v55.termRef(2);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l2 = $318;
                      
                      {ESLVal n2 = $317;
                      
                      {ESLVal t2 = $316;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $315 = _v55.termRef(0);
                      ESLVal $314 = _v55.termRef(1);
                      ESLVal $313 = _v55.termRef(2);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l1 = $315;
                      
                      {ESLVal ns2 = $314;
                      
                      {ESLVal t2 = $313;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v56;
                      
                      {ESLVal t2 = _v55;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                  }
                else if($385.isNil())
                  switch($381.termName) {
                    case "ListType": {ESLVal $389 = $381.termRef(0);
                      ESLVal $388 = $381.termRef(1);
                      
                      switch($388.termName) {
                      case "VarType": {ESLVal $391 = $388.termRef(0);
                        ESLVal $390 = $388.termRef(1);
                        
                        {ESLVal l1 = $380;
                        
                        {ESLVal t1 = $379;
                        
                        {ESLVal l2 = $383;
                        
                        {ESLVal v1 = $384;
                        
                        {ESLVal l3 = $389;
                        
                        {ESLVal l4 = $391;
                        
                        {ESLVal v2 = $390;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v55.termName) {
                            case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                              ESLVal $322 = _v55.termRef(1);
                              ESLVal $321 = _v55.termRef(2);
                              ESLVal $320 = _v55.termRef(3);
                              
                              {ESLVal _v123 = _v56;
                              
                              {ESLVal _v124 = $323;
                              
                              {ESLVal t2 = $322;
                              
                              {ESLVal ds2 = $321;
                              
                              {ESLVal ms2 = $320;
                              
                              return subType.apply(_v123,flattenAct.apply(_v124,t2,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                              
                              {ESLVal _v122 = _v56;
                              
                              {ESLVal f = $319;
                              
                              return subType.apply(_v122,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $318 = _v55.termRef(0);
                              ESLVal $317 = _v55.termRef(1);
                              ESLVal $316 = _v55.termRef(2);
                              
                              {ESLVal _v120 = _v56;
                              
                              {ESLVal _v121 = $318;
                              
                              {ESLVal n2 = $317;
                              
                              {ESLVal t2 = $316;
                              
                              return subType.apply(_v120,substType.apply(new ESLVal("RecType",_v121,n2,t2),n2,t2));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $315 = _v55.termRef(0);
                              ESLVal $314 = _v55.termRef(1);
                              ESLVal $313 = _v55.termRef(2);
                              
                              {ESLVal _v118 = _v56;
                              
                              {ESLVal _v119 = $315;
                              
                              {ESLVal ns2 = $314;
                              
                              {ESLVal t2 = $313;
                              
                              return subType.apply(_v118,t2);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v125 = _v56;
                              
                              {ESLVal t2 = _v55;
                              
                              return typeEqual.apply(_v125,t2);
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
                      default: switch(_v55.termName) {
                        case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                          ESLVal $322 = _v55.termRef(1);
                          ESLVal $321 = _v55.termRef(2);
                          ESLVal $320 = _v55.termRef(3);
                          
                          {ESLVal t1 = _v56;
                          
                          {ESLVal l2 = $323;
                          
                          {ESLVal t2 = $322;
                          
                          {ESLVal ds2 = $321;
                          
                          {ESLVal ms2 = $320;
                          
                          return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                          
                          {ESLVal t1 = _v56;
                          
                          {ESLVal f = $319;
                          
                          return subType.apply(t1,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $318 = _v55.termRef(0);
                          ESLVal $317 = _v55.termRef(1);
                          ESLVal $316 = _v55.termRef(2);
                          
                          {ESLVal t1 = _v56;
                          
                          {ESLVal l2 = $318;
                          
                          {ESLVal n2 = $317;
                          
                          {ESLVal t2 = $316;
                          
                          return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $315 = _v55.termRef(0);
                          ESLVal $314 = _v55.termRef(1);
                          ESLVal $313 = _v55.termRef(2);
                          
                          {ESLVal t1 = _v56;
                          
                          {ESLVal l1 = $315;
                          
                          {ESLVal ns2 = $314;
                          
                          {ESLVal t2 = $313;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v56;
                          
                          {ESLVal t2 = _v55;
                          
                          return typeEqual.apply(t1,t2);
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v55.termName) {
                      case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                        ESLVal $322 = _v55.termRef(1);
                        ESLVal $321 = _v55.termRef(2);
                        ESLVal $320 = _v55.termRef(3);
                        
                        {ESLVal t1 = _v56;
                        
                        {ESLVal l2 = $323;
                        
                        {ESLVal t2 = $322;
                        
                        {ESLVal ds2 = $321;
                        
                        {ESLVal ms2 = $320;
                        
                        return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                        
                        {ESLVal t1 = _v56;
                        
                        {ESLVal f = $319;
                        
                        return subType.apply(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $318 = _v55.termRef(0);
                        ESLVal $317 = _v55.termRef(1);
                        ESLVal $316 = _v55.termRef(2);
                        
                        {ESLVal t1 = _v56;
                        
                        {ESLVal l2 = $318;
                        
                        {ESLVal n2 = $317;
                        
                        {ESLVal t2 = $316;
                        
                        return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $315 = _v55.termRef(0);
                        ESLVal $314 = _v55.termRef(1);
                        ESLVal $313 = _v55.termRef(2);
                        
                        {ESLVal t1 = _v56;
                        
                        {ESLVal l1 = $315;
                        
                        {ESLVal ns2 = $314;
                        
                        {ESLVal t2 = $313;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v56;
                        
                        {ESLVal t2 = _v55;
                        
                        return typeEqual.apply(t1,t2);
                      }
                      }
                    }
                  }
                else switch(_v55.termName) {
                    case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                      ESLVal $322 = _v55.termRef(1);
                      ESLVal $321 = _v55.termRef(2);
                      ESLVal $320 = _v55.termRef(3);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l2 = $323;
                      
                      {ESLVal t2 = $322;
                      
                      {ESLVal ds2 = $321;
                      
                      {ESLVal ms2 = $320;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal f = $319;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $318 = _v55.termRef(0);
                      ESLVal $317 = _v55.termRef(1);
                      ESLVal $316 = _v55.termRef(2);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l2 = $318;
                      
                      {ESLVal n2 = $317;
                      
                      {ESLVal t2 = $316;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $315 = _v55.termRef(0);
                      ESLVal $314 = _v55.termRef(1);
                      ESLVal $313 = _v55.termRef(2);
                      
                      {ESLVal t1 = _v56;
                      
                      {ESLVal l1 = $315;
                      
                      {ESLVal ns2 = $314;
                      
                      {ESLVal t2 = $313;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v56;
                      
                      {ESLVal t2 = _v55;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                }
              else if($382.isNil())
                switch(_v55.termName) {
                  case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                    ESLVal $322 = _v55.termRef(1);
                    ESLVal $321 = _v55.termRef(2);
                    ESLVal $320 = _v55.termRef(3);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l2 = $323;
                    
                    {ESLVal t2 = $322;
                    
                    {ESLVal ds2 = $321;
                    
                    {ESLVal ms2 = $320;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal f = $319;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $318 = _v55.termRef(0);
                    ESLVal $317 = _v55.termRef(1);
                    ESLVal $316 = _v55.termRef(2);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l2 = $318;
                    
                    {ESLVal n2 = $317;
                    
                    {ESLVal t2 = $316;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $315 = _v55.termRef(0);
                    ESLVal $314 = _v55.termRef(1);
                    ESLVal $313 = _v55.termRef(2);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l1 = $315;
                    
                    {ESLVal ns2 = $314;
                    
                    {ESLVal t2 = $313;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v56;
                    
                    {ESLVal t2 = _v55;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              else switch(_v55.termName) {
                  case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                    ESLVal $322 = _v55.termRef(1);
                    ESLVal $321 = _v55.termRef(2);
                    ESLVal $320 = _v55.termRef(3);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l2 = $323;
                    
                    {ESLVal t2 = $322;
                    
                    {ESLVal ds2 = $321;
                    
                    {ESLVal ms2 = $320;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal f = $319;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $318 = _v55.termRef(0);
                    ESLVal $317 = _v55.termRef(1);
                    ESLVal $316 = _v55.termRef(2);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l2 = $318;
                    
                    {ESLVal n2 = $317;
                    
                    {ESLVal t2 = $316;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $315 = _v55.termRef(0);
                    ESLVal $314 = _v55.termRef(1);
                    ESLVal $313 = _v55.termRef(2);
                    
                    {ESLVal t1 = _v56;
                    
                    {ESLVal l1 = $315;
                    
                    {ESLVal ns2 = $314;
                    
                    {ESLVal t2 = $313;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v56;
                    
                    {ESLVal t2 = _v55;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $376 = _v56.termRef(0);
              ESLVal $375 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "BagType": {ESLVal $378 = _v55.termRef(0);
                ESLVal $377 = _v55.termRef(1);
                
                {ESLVal l1 = $376;
                
                {ESLVal t1 = $375;
                
                {ESLVal l2 = $378;
                
                {ESLVal t2 = $377;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $372 = _v56.termRef(0);
              ESLVal $371 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "SetType": {ESLVal $374 = _v55.termRef(0);
                ESLVal $373 = _v55.termRef(1);
                
                {ESLVal l1 = $372;
                
                {ESLVal t1 = $371;
                
                {ESLVal l2 = $374;
                
                {ESLVal t2 = $373;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $367 = _v56.termRef(0);
              ESLVal $366 = _v56.termRef(1);
              ESLVal $365 = _v56.termRef(2);
              
              switch(_v55.termName) {
              case "TermType": {ESLVal $370 = _v55.termRef(0);
                ESLVal $369 = _v55.termRef(1);
                ESLVal $368 = _v55.termRef(2);
                
                {ESLVal l1 = $367;
                
                {ESLVal n1 = $366;
                
                {ESLVal args1 = $365;
                
                {ESLVal l2 = $370;
                
                {ESLVal n2 = $369;
                
                {ESLVal args2 = $368;
                
                if(n1.eql(n2).boolVal)
                return subTypes.apply(args1,args2);
                else
                  return $false;
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "FunType": {ESLVal $361 = _v56.termRef(0);
              ESLVal $360 = _v56.termRef(1);
              ESLVal $359 = _v56.termRef(2);
              
              switch(_v55.termName) {
              case "FunType": {ESLVal $364 = _v55.termRef(0);
                ESLVal $363 = _v55.termRef(1);
                ESLVal $362 = _v55.termRef(2);
                
                {ESLVal l1 = $361;
                
                {ESLVal d1 = $360;
                
                {ESLVal r1 = $359;
                
                {ESLVal l2 = $364;
                
                {ESLVal d2 = $363;
                
                {ESLVal r2 = $362;
                
                return subType.apply(r1,r2).and(subTypes.apply(d2,d1));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $358 = _v56.termRef(0);
              
              {ESLVal f = $358;
              
              {ESLVal t2 = _v55;
              
              return subType.apply(f.apply(),t2);
            }
            }
            }
          case "RecordType": {ESLVal $355 = _v56.termRef(0);
              ESLVal $354 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "RecordType": {ESLVal $357 = _v55.termRef(0);
                ESLVal $356 = _v55.termRef(1);
                
                {ESLVal l1 = $355;
                
                {ESLVal fs1 = $354;
                
                {ESLVal l2 = $357;
                
                {ESLVal fs2 = $356;
                
                return recordSubType.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $350 = _v56.termRef(0);
              ESLVal $349 = _v56.termRef(1);
              ESLVal $348 = _v56.termRef(2);
              
              switch(_v55.termName) {
              case "RecType": {ESLVal $353 = _v55.termRef(0);
                ESLVal $352 = _v55.termRef(1);
                ESLVal $351 = _v55.termRef(2);
                
                {ESLVal l1 = $350;
                
                {ESLVal n1 = $349;
                
                {ESLVal t1 = $348;
                
                {ESLVal l2 = $353;
                
                {ESLVal n2 = $352;
                
                {ESLVal t2 = $351;
                
                if(n1.eql(n2).boolVal)
                return subType.apply(t1,t2);
                else
                  {ESLVal _v114 = $350;
                    
                    {ESLVal _v115 = $349;
                    
                    {ESLVal _v116 = $348;
                    
                    {ESLVal _v117 = _v55;
                    
                    return subType.apply(substType.apply(new ESLVal("RecType",_v114,_v115,_v116),_v115,_v116),_v117);
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
              default: {ESLVal l1 = $350;
                
                {ESLVal n1 = $349;
                
                {ESLVal t1 = $348;
                
                {ESLVal t2 = _v55;
                
                return subType.apply(substType.apply(new ESLVal("RecType",l1,n1,t1),n1,t1),t2);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $345 = _v56.termRef(0);
              ESLVal $344 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "UnionType": {ESLVal $347 = _v55.termRef(0);
                ESLVal $346 = _v55.termRef(1);
                
                {ESLVal l1 = $345;
                
                {ESLVal terms1 = $344;
                
                {ESLVal l2 = $347;
                
                {ESLVal terms2 = $346;
                
                return subTypes.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $341 = _v56.termRef(0);
              ESLVal $340 = _v56.termRef(1);
              
              switch(_v55.termName) {
              case "VarType": {ESLVal $343 = _v55.termRef(0);
                ESLVal $342 = _v55.termRef(1);
                
                {ESLVal l1 = $341;
                
                {ESLVal n1 = $340;
                
                {ESLVal l2 = $343;
                
                {ESLVal n2 = $342;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v55.termName) {
                case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                  ESLVal $322 = _v55.termRef(1);
                  ESLVal $321 = _v55.termRef(2);
                  ESLVal $320 = _v55.termRef(3);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $323;
                  
                  {ESLVal t2 = $322;
                  
                  {ESLVal ds2 = $321;
                  
                  {ESLVal ms2 = $320;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal f = $319;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $318 = _v55.termRef(0);
                  ESLVal $317 = _v55.termRef(1);
                  ESLVal $316 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l2 = $318;
                  
                  {ESLVal n2 = $317;
                  
                  {ESLVal t2 = $316;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $315 = _v55.termRef(0);
                  ESLVal $314 = _v55.termRef(1);
                  ESLVal $313 = _v55.termRef(2);
                  
                  {ESLVal t1 = _v56;
                  
                  {ESLVal l1 = $315;
                  
                  {ESLVal ns2 = $314;
                  
                  {ESLVal t2 = $313;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v56;
                  
                  {ESLVal t2 = _v55;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $326 = _v56.termRef(0);
              ESLVal $325 = _v56.termRef(1);
              ESLVal $324 = _v56.termRef(2);
              
              if($325.isCons())
              {ESLVal $330 = $325.head();
                ESLVal $331 = $325.tail();
                
                if($331.isCons())
                {ESLVal $332 = $331.head();
                  ESLVal $333 = $331.tail();
                  
                  switch(_v55.termName) {
                  case "ForallType": {ESLVal $329 = _v55.termRef(0);
                    ESLVal $328 = _v55.termRef(1);
                    ESLVal $327 = _v55.termRef(2);
                    
                    {ESLVal l1 = $326;
                    
                    {ESLVal ns1 = $325;
                    
                    {ESLVal t1 = $324;
                    
                    {ESLVal l2 = $329;
                    
                    {ESLVal ns2 = $328;
                    
                    {ESLVal t2 = $327;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $326;
                    
                    {ESLVal ns1 = $325;
                    
                    {ESLVal t1 = $324;
                    
                    {ESLVal t2 = _v55;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
                }
              else if($331.isNil())
                switch($324.termName) {
                  case "ListType": {ESLVal $335 = $324.termRef(0);
                    ESLVal $334 = $324.termRef(1);
                    
                    switch($334.termName) {
                    case "VarType": {ESLVal $337 = $334.termRef(0);
                      ESLVal $336 = $334.termRef(1);
                      
                      switch(_v55.termName) {
                      case "ListType": {ESLVal $339 = _v55.termRef(0);
                        ESLVal $338 = _v55.termRef(1);
                        
                        {ESLVal l2 = $326;
                        
                        {ESLVal v1 = $330;
                        
                        {ESLVal l3 = $335;
                        
                        {ESLVal l4 = $337;
                        
                        {ESLVal v2 = $336;
                        
                        {ESLVal l1 = $339;
                        
                        {ESLVal t1 = $338;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v55.termName) {
                            case "ForallType": {ESLVal $329 = _v55.termRef(0);
                              ESLVal $328 = _v55.termRef(1);
                              ESLVal $327 = _v55.termRef(2);
                              
                              {ESLVal _v109 = $326;
                              
                              {ESLVal ns1 = $325;
                              
                              {ESLVal _v110 = $324;
                              
                              {ESLVal _v111 = $329;
                              
                              {ESLVal ns2 = $328;
                              
                              {ESLVal t2 = $327;
                              
                              return ns1.eql(ns2).and(subType.apply(_v110,t2));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v112 = $326;
                              
                              {ESLVal ns1 = $325;
                              
                              {ESLVal _v113 = $324;
                              
                              {ESLVal t2 = _v55;
                              
                              return subType.apply(_v113,t2);
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
                      default: switch(_v55.termName) {
                        case "ForallType": {ESLVal $329 = _v55.termRef(0);
                          ESLVal $328 = _v55.termRef(1);
                          ESLVal $327 = _v55.termRef(2);
                          
                          {ESLVal l1 = $326;
                          
                          {ESLVal ns1 = $325;
                          
                          {ESLVal t1 = $324;
                          
                          {ESLVal l2 = $329;
                          
                          {ESLVal ns2 = $328;
                          
                          {ESLVal t2 = $327;
                          
                          return ns1.eql(ns2).and(subType.apply(t1,t2));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $326;
                          
                          {ESLVal ns1 = $325;
                          
                          {ESLVal t1 = $324;
                          
                          {ESLVal t2 = _v55;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v55.termName) {
                      case "ForallType": {ESLVal $329 = _v55.termRef(0);
                        ESLVal $328 = _v55.termRef(1);
                        ESLVal $327 = _v55.termRef(2);
                        
                        {ESLVal l1 = $326;
                        
                        {ESLVal ns1 = $325;
                        
                        {ESLVal t1 = $324;
                        
                        {ESLVal l2 = $329;
                        
                        {ESLVal ns2 = $328;
                        
                        {ESLVal t2 = $327;
                        
                        return ns1.eql(ns2).and(subType.apply(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $326;
                        
                        {ESLVal ns1 = $325;
                        
                        {ESLVal t1 = $324;
                        
                        {ESLVal t2 = _v55;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v55.termName) {
                    case "ForallType": {ESLVal $329 = _v55.termRef(0);
                      ESLVal $328 = _v55.termRef(1);
                      ESLVal $327 = _v55.termRef(2);
                      
                      {ESLVal l1 = $326;
                      
                      {ESLVal ns1 = $325;
                      
                      {ESLVal t1 = $324;
                      
                      {ESLVal l2 = $329;
                      
                      {ESLVal ns2 = $328;
                      
                      {ESLVal t2 = $327;
                      
                      return ns1.eql(ns2).and(subType.apply(t1,t2));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $326;
                      
                      {ESLVal ns1 = $325;
                      
                      {ESLVal t1 = $324;
                      
                      {ESLVal t2 = _v55;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v55.termName) {
                  case "ForallType": {ESLVal $329 = _v55.termRef(0);
                    ESLVal $328 = _v55.termRef(1);
                    ESLVal $327 = _v55.termRef(2);
                    
                    {ESLVal l1 = $326;
                    
                    {ESLVal ns1 = $325;
                    
                    {ESLVal t1 = $324;
                    
                    {ESLVal l2 = $329;
                    
                    {ESLVal ns2 = $328;
                    
                    {ESLVal t2 = $327;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $326;
                    
                    {ESLVal ns1 = $325;
                    
                    {ESLVal t1 = $324;
                    
                    {ESLVal t2 = _v55;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
              }
            else if($325.isNil())
              switch(_v55.termName) {
                case "ForallType": {ESLVal $329 = _v55.termRef(0);
                  ESLVal $328 = _v55.termRef(1);
                  ESLVal $327 = _v55.termRef(2);
                  
                  {ESLVal l1 = $326;
                  
                  {ESLVal ns1 = $325;
                  
                  {ESLVal t1 = $324;
                  
                  {ESLVal l2 = $329;
                  
                  {ESLVal ns2 = $328;
                  
                  {ESLVal t2 = $327;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $326;
                  
                  {ESLVal ns1 = $325;
                  
                  {ESLVal t1 = $324;
                  
                  {ESLVal t2 = _v55;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            else switch(_v55.termName) {
                case "ForallType": {ESLVal $329 = _v55.termRef(0);
                  ESLVal $328 = _v55.termRef(1);
                  ESLVal $327 = _v55.termRef(2);
                  
                  {ESLVal l1 = $326;
                  
                  {ESLVal ns1 = $325;
                  
                  {ESLVal t1 = $324;
                  
                  {ESLVal l2 = $329;
                  
                  {ESLVal ns2 = $328;
                  
                  {ESLVal t2 = $327;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $326;
                  
                  {ESLVal ns1 = $325;
                  
                  {ESLVal t1 = $324;
                  
                  {ESLVal t2 = _v55;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            }
            default: switch(_v55.termName) {
              case "ExtendedAct": {ESLVal $323 = _v55.termRef(0);
                ESLVal $322 = _v55.termRef(1);
                ESLVal $321 = _v55.termRef(2);
                ESLVal $320 = _v55.termRef(3);
                
                {ESLVal t1 = _v56;
                
                {ESLVal l2 = $323;
                
                {ESLVal t2 = $322;
                
                {ESLVal ds2 = $321;
                
                {ESLVal ms2 = $320;
                
                return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $319 = _v55.termRef(0);
                
                {ESLVal t1 = _v56;
                
                {ESLVal f = $319;
                
                return subType.apply(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $318 = _v55.termRef(0);
                ESLVal $317 = _v55.termRef(1);
                ESLVal $316 = _v55.termRef(2);
                
                {ESLVal t1 = _v56;
                
                {ESLVal l2 = $318;
                
                {ESLVal n2 = $317;
                
                {ESLVal t2 = $316;
                
                return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $315 = _v55.termRef(0);
                ESLVal $314 = _v55.termRef(1);
                ESLVal $313 = _v55.termRef(2);
                
                {ESLVal t1 = _v56;
                
                {ESLVal l1 = $315;
                
                {ESLVal ns2 = $314;
                
                {ESLVal t2 = $313;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: {ESLVal t1 = _v56;
                
                {ESLVal t2 = _v55;
                
                return typeEqual.apply(t1,t2);
              }
              }
            }
          }
          }
    }
  });
  private static ESLVal flattenAct = new ESLVal(new Function(new ESLVal("flattenAct"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l1 = $args[0];
  ESLVal t = $args[1];
  ESLVal ds1 = $args[2];
  ESLVal ms1 = $args[3];
  {ESLVal _v54 = t;
        
        switch(_v54.termName) {
        case "ActType": {ESLVal $312 = _v54.termRef(0);
          ESLVal $311 = _v54.termRef(1);
          ESLVal $310 = _v54.termRef(2);
          
          {ESLVal l2 = $312;
          
          {ESLVal ds2 = $311;
          
          {ESLVal ms2 = $310;
          
          return new ESLVal("ActType",l1,ds1.add(ds2),ms1.add(ms2));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $309 = _v54.termRef(0);
          ESLVal $308 = _v54.termRef(1);
          ESLVal $307 = _v54.termRef(2);
          ESLVal $306 = _v54.termRef(3);
          
          {ESLVal l2 = $309;
          
          {ESLVal _v107 = $308;
          
          {ESLVal ds2 = $307;
          
          {ESLVal ms2 = $306;
          
          return flattenAct.apply(l1,flattenAct.apply(l2,_v107,ds2,ms2),ds1,ms1);
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $305 = _v54.termRef(0);
          
          {ESLVal f = $305;
          
          return flattenAct.apply(l1,f.apply(),ds1,ms1);
        }
        }
      case "RecType": {ESLVal $304 = _v54.termRef(0);
          ESLVal $303 = _v54.termRef(1);
          ESLVal $302 = _v54.termRef(2);
          
          {ESLVal l2 = $304;
          
          {ESLVal n = $303;
          
          {ESLVal b = $302;
          
          return flattenAct.apply(l1,substType.apply(t,n,b),ds1,ms1);
        }
        }
        }
        }
        default: {ESLVal _v108 = _v54;
          
          return error(new ESLVal("TypeError",l1,new ESLVal("unknown type for flatten ").add(_v108)));
        }
      }
      }
    }
  });
  public static ESLVal actEqual = new ESLVal(new Function(new ESLVal("actEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal exports1 = $args[0];
  ESLVal exports2 = $args[1];
  ESLVal handlers1 = $args[2];
  ESLVal handlers2 = $args[3];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun2408"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2409"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports2);
          }
        }),exports1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun2410"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2411"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun2412"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2413"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers2);
          }
        }),handlers1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun2414"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2415"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers1);
          }
        }),handlers2))));
    }
  });
  private static ESLVal actSubType = new ESLVal(new Function(new ESLVal("actSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal exports1 = $args[0];
  ESLVal exports2 = $args[1];
  ESLVal handlers1 = $args[2];
  ESLVal handlers2 = $args[3];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun2416"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2417"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d1 = $args[0];
              return decSubType.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun2418"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2419"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m1 = $args[0];
              return messSubType.apply(m1,m2);
                }
              }),handlers1);
          }
        }),handlers2));
    }
  });
  public static ESLVal equalDec = new ESLVal(new Function(new ESLVal("equalDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v53 = d1;
        ESLVal _v52 = d2;
        
        switch(_v53.termName) {
        case "Dec": {ESLVal $297 = _v53.termRef(0);
          ESLVal $296 = _v53.termRef(1);
          ESLVal $295 = _v53.termRef(2);
          ESLVal $294 = _v53.termRef(3);
          
          switch(_v52.termName) {
          case "Dec": {ESLVal $301 = _v52.termRef(0);
            ESLVal $300 = _v52.termRef(1);
            ESLVal $299 = _v52.termRef(2);
            ESLVal $298 = _v52.termRef(3);
            
            {ESLVal l1 = $297;
            
            {ESLVal n1 = $296;
            
            {ESLVal t1 = $295;
            
            {ESLVal st1 = $294;
            
            {ESLVal l2 = $301;
            
            {ESLVal n2 = $300;
            
            {ESLVal t2 = $299;
            
            {ESLVal st2 = $298;
            
            return n1.eql(n2).and(typeEqual.apply(t1,t2));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(19217,19348)").add(ESLVal.list(_v53,_v52)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19217,19348)").add(ESLVal.list(_v53,_v52)));
      }
      }
    }
  });
  private static ESLVal decSubType = new ESLVal(new Function(new ESLVal("decSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v51 = d1;
        ESLVal _v50 = d2;
        
        switch(_v51.termName) {
        case "Dec": {ESLVal $289 = _v51.termRef(0);
          ESLVal $288 = _v51.termRef(1);
          ESLVal $287 = _v51.termRef(2);
          ESLVal $286 = _v51.termRef(3);
          
          switch(_v50.termName) {
          case "Dec": {ESLVal $293 = _v50.termRef(0);
            ESLVal $292 = _v50.termRef(1);
            ESLVal $291 = _v50.termRef(2);
            ESLVal $290 = _v50.termRef(3);
            
            {ESLVal l1 = $289;
            
            {ESLVal n1 = $288;
            
            {ESLVal t1 = $287;
            
            {ESLVal st1 = $286;
            
            {ESLVal l2 = $293;
            
            {ESLVal n2 = $292;
            
            {ESLVal t2 = $291;
            
            {ESLVal st2 = $290;
            
            return n1.eql(n2).and(subType.apply(t1,t2));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(19392,19521)").add(ESLVal.list(_v51,_v50)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19392,19521)").add(ESLVal.list(_v51,_v50)));
      }
      }
    }
  });
  public static ESLVal equalMessage = new ESLVal(new Function(new ESLVal("equalMessage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v49 = m1;
        ESLVal _v48 = m2;
        
        switch(_v49.termName) {
        case "MessageType": {ESLVal $283 = _v49.termRef(0);
          ESLVal $282 = _v49.termRef(1);
          
          switch(_v48.termName) {
          case "MessageType": {ESLVal $285 = _v48.termRef(0);
            ESLVal $284 = _v48.termRef(1);
            
            {ESLVal l1 = $283;
            
            {ESLVal ts1 = $282;
            
            {ESLVal l2 = $285;
            
            {ESLVal ts2 = $284;
            
            return typesEqual.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(19567,19677)").add(ESLVal.list(_v49,_v48)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19567,19677)").add(ESLVal.list(_v49,_v48)));
      }
      }
    }
  });
  private static ESLVal messSubType = new ESLVal(new Function(new ESLVal("messSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v47 = m1;
        ESLVal _v46 = m2;
        
        switch(_v47.termName) {
        case "MessageType": {ESLVal $279 = _v47.termRef(0);
          ESLVal $278 = _v47.termRef(1);
          
          switch(_v46.termName) {
          case "MessageType": {ESLVal $281 = _v46.termRef(0);
            ESLVal $280 = _v46.termRef(1);
            
            {ESLVal l1 = $279;
            
            {ESLVal ts1 = $278;
            
            {ESLVal l2 = $281;
            
            {ESLVal ts2 = $280;
            
            return subTypes.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(19722,19830)").add(ESLVal.list(_v47,_v46)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19722,19830)").add(ESLVal.list(_v47,_v46)));
      }
      }
    }
  });
  public static ESLVal recordTypeEqual = new ESLVal(new Function(new ESLVal("recordTypeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun2420"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2421"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return typeEqual.apply(t1,t2);
                }
              }),fields2);
          }
        }),fields1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun2422"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2423"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return typeEqual.apply(t1,t2);
                }
              }),fields1);
          }
        }),fields2));
    }
  });
  private static ESLVal recordSubType = new ESLVal(new Function(new ESLVal("recordSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun2424"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun2425"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t1 = $args[0];
              return subType.apply(t1,t2);
                }
              }),fields1);
          }
        }),fields2);
    }
  });
  public static ESLVal applyTypeFun = new ESLVal(new Function(new ESLVal("applyTypeFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal op = $args[1];
  ESLVal args = $args[2];
  {ESLVal _v45 = op;
        
        switch(_v45.termName) {
        case "RecType": {ESLVal $277 = _v45.termRef(0);
          ESLVal $276 = _v45.termRef(1);
          ESLVal $275 = _v45.termRef(2);
          
          {ESLVal lr = $277;
          
          {ESLVal n = $276;
          
          {ESLVal t = $275;
          
          return applyTypeFun.apply(l,unfoldType.apply(lr,n,t),args);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $274 = _v45.termRef(0);
          ESLVal $273 = _v45.termRef(1);
          ESLVal $272 = _v45.termRef(2);
          
          {ESLVal _v105 = $274;
          
          {ESLVal names = $273;
          
          {ESLVal t = $272;
          
          if(length.apply(args).eql(length.apply(names)).boolVal)
          return substTypeEnv.apply(zipTypeEnv.apply(names,args),t);
          else
            return error(new ESLVal("TypeError",_v105,new ESLVal("type fun expects ").add(length.apply(names).add(new ESLVal(" args, but supplied with ").add(length.apply(args))))));
        }
        }
        }
        }
        default: {ESLVal _v106 = _v45;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(_v106)));
        }
      }
      }
    }
  });
  public static ESLVal unfoldType = new ESLVal(new Function(new ESLVal("unfoldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal t = $args[2];
  return substType.apply(new ESLVal("RecType",l,n,t),n,t);
    }
  });
  public static ESLVal forceType = new ESLVal(new Function(new ESLVal("forceType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v44 = t;
        
        switch(_v44.termName) {
        case "TypeClosure": {ESLVal $271 = _v44.termRef(0);
          
          {ESLVal f = $271;
          
          return forceType.apply(f.apply());
        }
        }
        default: {ESLVal _v104 = _v44;
          
          return _v104;
        }
      }
      }
    }
  });
  public static ESLVal typesEqual = new ESLVal(new Function(new ESLVal("typesEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v43 = ts1;
        ESLVal _v42 = ts2;
        
        if(_v43.isCons())
        {ESLVal $265 = _v43.head();
          ESLVal $266 = _v43.tail();
          
          if(_v42.isCons())
          {ESLVal $267 = _v42.head();
            ESLVal $268 = _v42.tail();
            
            {ESLVal t1 = $265;
            
            {ESLVal _v97 = $266;
            
            {ESLVal t2 = $267;
            
            {ESLVal _v98 = $268;
            
            return typeEqual.apply(t1,t2).and(typesEqual.apply(_v97,_v98));
          }
          }
          }
          }
          }
        else if(_v42.isNil())
          if(_v42.isCons())
            {ESLVal $263 = _v42.head();
              ESLVal $264 = _v42.tail();
              
              return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
            }
          else if(_v42.isNil())
            {ESLVal _v99 = _v43;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
        else if(_v42.isCons())
            {ESLVal $263 = _v42.head();
              ESLVal $264 = _v42.tail();
              
              return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
            }
          else if(_v42.isNil())
            {ESLVal _v100 = _v43;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
        }
      else if(_v43.isNil())
        if(_v42.isCons())
          {ESLVal $269 = _v42.head();
            ESLVal $270 = _v42.tail();
            
            {ESLVal _v101 = _v42;
            
            return $false;
          }
          }
        else if(_v42.isNil())
          return $true;
        else {ESLVal _v102 = _v42;
            
            return $false;
          }
      else if(_v42.isCons())
          {ESLVal $263 = _v42.head();
            ESLVal $264 = _v42.tail();
            
            return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
          }
        else if(_v42.isNil())
          {ESLVal _v103 = _v43;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(20988,21198)").add(ESLVal.list(_v43,_v42)));
      }
    }
  });
  public static ESLVal subTypes = new ESLVal(new Function(new ESLVal("subTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v41 = ts1;
        ESLVal _v40 = ts2;
        
        if(_v41.isCons())
        {ESLVal $257 = _v41.head();
          ESLVal $258 = _v41.tail();
          
          if(_v40.isCons())
          {ESLVal $259 = _v40.head();
            ESLVal $260 = _v40.tail();
            
            {ESLVal t1 = $257;
            
            {ESLVal _v90 = $258;
            
            {ESLVal t2 = $259;
            
            {ESLVal _v91 = $260;
            
            return subType.apply(t1,t2).and(subTypes.apply(_v90,_v91));
          }
          }
          }
          }
          }
        else if(_v40.isNil())
          if(_v40.isCons())
            {ESLVal $255 = _v40.head();
              ESLVal $256 = _v40.tail();
              
              return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
            }
          else if(_v40.isNil())
            {ESLVal _v92 = _v41;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
        else if(_v40.isCons())
            {ESLVal $255 = _v40.head();
              ESLVal $256 = _v40.tail();
              
              return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
            }
          else if(_v40.isNil())
            {ESLVal _v93 = _v41;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
        }
      else if(_v41.isNil())
        if(_v40.isCons())
          {ESLVal $261 = _v40.head();
            ESLVal $262 = _v40.tail();
            
            {ESLVal _v94 = _v40;
            
            return $false;
          }
          }
        else if(_v40.isNil())
          return $true;
        else {ESLVal _v95 = _v40;
            
            return $false;
          }
      else if(_v40.isCons())
          {ESLVal $255 = _v40.head();
            ESLVal $256 = _v40.tail();
            
            return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
          }
        else if(_v40.isNil())
          {ESLVal _v96 = _v41;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(21244,21450)").add(ESLVal.list(_v41,_v40)));
      }
    }
  });
  public static ESLVal typeSetEqual = new ESLVal(new Function(new ESLVal("typeSetEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal types1 = $args[0];
  ESLVal types2 = $args[1];
  return typeSubset.apply(types1,types2).and(typeSubset.apply(types2,types1));
    }
  });
  public static ESLVal typeSubset = new ESLVal(new Function(new ESLVal("typeSubset"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sub = $args[0];
  ESLVal sup = $args[1];
  {ESLVal _v39 = sub;
        
        if(_v39.isCons())
        {ESLVal $253 = _v39.head();
          ESLVal $254 = _v39.tail();
          
          {ESLVal t = $253;
          
          {ESLVal _v89 = $254;
          
          return typeMember.apply(t,sup).and(typeSubset.apply(_v89,sup));
        }
        }
        }
      else if(_v39.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(21610,21716)").add(ESLVal.list(_v39)));
      }
    }
  });
  public static ESLVal typeMember = new ESLVal(new Function(new ESLVal("typeMember"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v38 = types;
        
        if(_v38.isCons())
        {ESLVal $251 = _v38.head();
          ESLVal $252 = _v38.tail();
          
          {ESLVal tt = $251;
          
          {ESLVal _v86 = $252;
          
          if(typeEqual.apply(t,tt).boolVal)
          return $true;
          else
            {ESLVal _v87 = $251;
              
              {ESLVal _v88 = $252;
              
              return typeMember.apply(t,_v88);
            }
            }
        }
        }
        }
      else if(_v38.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(21762,21909)").add(ESLVal.list(_v38)));
      }
    }
  });
  public static ESLVal substTypes = new ESLVal(new Function(new ESLVal("substTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldTypes = $args[2];
  {ESLVal _v37 = oldTypes;
        
        if(_v37.isCons())
        {ESLVal $249 = _v37.head();
          ESLVal $250 = _v37.tail();
          
          {ESLVal t = $249;
          
          {ESLVal ts = $250;
          
          return substTypes.apply(newType,n,ts).cons(substType.apply(newType,n,t));
        }
        }
        }
      else if(_v37.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(22061,22181)").add(ESLVal.list(_v37)));
      }
    }
  });
  public static ESLVal substType = new ESLVal(new Function(new ESLVal("substType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldType = $args[2];
  {ESLVal _v32 = oldType;
        
        switch(_v32.termName) {
        case "ApplyType": {ESLVal $248 = _v32.termRef(0);
          ESLVal $247 = _v32.termRef(1);
          ESLVal $246 = _v32.termRef(2);
          
          {ESLVal l = $248;
          
          {ESLVal m = $247;
          
          {ESLVal types = $246;
          
          if(m.eql(n).boolVal)
          return new ESLVal("ApplyTypeFun",l,newType,substTypes.apply(newType,n,types));
          else
            return new ESLVal("ApplyType",l,m,substTypes.apply(newType,n,types));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $245 = _v32.termRef(0);
          ESLVal $244 = _v32.termRef(1);
          ESLVal $243 = _v32.termRef(2);
          
          {ESLVal l = $245;
          
          {ESLVal op = $244;
          
          {ESLVal args = $243;
          
          return new ESLVal("ApplyTypeFun",l,substType.apply(newType,n,op),substTypes.apply(newType,n,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $242 = _v32.termRef(0);
          ESLVal $241 = _v32.termRef(1);
          ESLVal $240 = _v32.termRef(2);
          
          {ESLVal l = $242;
          
          {ESLVal decs = $241;
          
          {ESLVal handlers = $240;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v35 = $qualArg;
                
                {ESLVal d = _v35;
                
                return ESLVal.list(ESLVal.list(substDec.apply(newType,n,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v36 = $qualArg;
                
                {ESLVal m = _v36;
                
                return ESLVal.list(ESLVal.list(substMType.apply(newType,n,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ArrayType": {ESLVal $239 = _v32.termRef(0);
          ESLVal $238 = _v32.termRef(1);
          
          {ESLVal l = $239;
          
          {ESLVal t = $238;
          
          return new ESLVal("ArrayType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "BoolType": {ESLVal $237 = _v32.termRef(0);
          
          {ESLVal l = $237;
          
          return oldType;
        }
        }
      case "ExtendedAct": {ESLVal $236 = _v32.termRef(0);
          ESLVal $235 = _v32.termRef(1);
          ESLVal $234 = _v32.termRef(2);
          ESLVal $233 = _v32.termRef(3);
          
          {ESLVal l = $236;
          
          {ESLVal parent = $235;
          
          {ESLVal decs = $234;
          
          {ESLVal ms = $233;
          
          return new ESLVal("ExtendedAct",l,substType.apply(newType,n,parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v33 = $qualArg;
                
                {ESLVal d = _v33;
                
                return ESLVal.list(ESLVal.list(substDec.apply(newType,n,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v34 = $qualArg;
                
                {ESLVal m = _v34;
                
                return ESLVal.list(ESLVal.list(substMType.apply(newType,n,m)));
              }
              }
            }
          }).map(ms).flatten().flatten());
        }
        }
        }
        }
        }
      case "FloatType": {ESLVal $232 = _v32.termRef(0);
          
          {ESLVal l = $232;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $231 = _v32.termRef(0);
          ESLVal $230 = _v32.termRef(1);
          ESLVal $229 = _v32.termRef(2);
          
          {ESLVal l = $231;
          
          {ESLVal ns = $230;
          
          {ESLVal t = $229;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("ForallType",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $228 = _v32.termRef(0);
          ESLVal $227 = _v32.termRef(1);
          ESLVal $226 = _v32.termRef(2);
          
          {ESLVal l = $228;
          
          {ESLVal d = $227;
          
          {ESLVal r = $226;
          
          return new ESLVal("FunType",l,substTypes.apply(newType,n,d),substType.apply(newType,n,r));
        }
        }
        }
        }
      case "IntType": {ESLVal $225 = _v32.termRef(0);
          
          {ESLVal l = $225;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $224 = _v32.termRef(0);
          ESLVal $223 = _v32.termRef(1);
          
          {ESLVal l = $224;
          
          {ESLVal t = $223;
          
          return new ESLVal("ListType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "NullType": {ESLVal $222 = _v32.termRef(0);
          
          {ESLVal l = $222;
          
          return oldType;
        }
        }
      case "RecordType": {ESLVal $221 = _v32.termRef(0);
          ESLVal $220 = _v32.termRef(1);
          
          {ESLVal l = $221;
          
          {ESLVal fs = $220;
          
          return new ESLVal("RecordType",l,substTypes.apply(newType,n,fs));
        }
        }
        }
      case "RecType": {ESLVal $219 = _v32.termRef(0);
          ESLVal $218 = _v32.termRef(1);
          ESLVal $217 = _v32.termRef(2);
          
          {ESLVal l = $219;
          
          {ESLVal a = $218;
          
          {ESLVal t = $217;
          
          if(n.eql(a).boolVal)
          return oldType;
          else
            return new ESLVal("RecType",l,a,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "StrType": {ESLVal $216 = _v32.termRef(0);
          
          {ESLVal l = $216;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $215 = _v32.termRef(0);
          ESLVal $214 = _v32.termRef(1);
          ESLVal $213 = _v32.termRef(2);
          
          {ESLVal l = $215;
          
          {ESLVal k = $214;
          
          {ESLVal v = $213;
          
          return new ESLVal("TableType",l,substType.apply(newType,n,k),substType.apply(newType,n,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $212 = _v32.termRef(0);
          ESLVal $211 = _v32.termRef(1);
          ESLVal $210 = _v32.termRef(2);
          
          {ESLVal l = $212;
          
          {ESLVal f = $211;
          
          {ESLVal ts = $210;
          
          return new ESLVal("TermType",l,f,substTypes.apply(newType,n,ts));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $209 = _v32.termRef(0);
          
          {ESLVal f = $209;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $208 = _v32.termRef(0);
          ESLVal $207 = _v32.termRef(1);
          ESLVal $206 = _v32.termRef(2);
          
          {ESLVal l = $208;
          
          {ESLVal ns = $207;
          
          {ESLVal t = $206;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("TypeFun",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $205 = _v32.termRef(0);
          ESLVal $204 = _v32.termRef(1);
          
          {ESLVal l = $205;
          
          {ESLVal t = $204;
          
          return new ESLVal("UnfoldType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "UnionType": {ESLVal $203 = _v32.termRef(0);
          ESLVal $202 = _v32.termRef(1);
          
          {ESLVal l = $203;
          
          {ESLVal ts = $202;
          
          return new ESLVal("UnionType",l,substTypes.apply(newType,n,ts));
        }
        }
        }
      case "VarType": {ESLVal $201 = _v32.termRef(0);
          ESLVal $200 = _v32.termRef(1);
          
          {ESLVal l = $201;
          
          {ESLVal name = $200;
          
          if(name.eql(n).boolVal)
          return newType;
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $199 = _v32.termRef(0);
          
          {ESLVal l = $199;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $198 = _v32.termRef(0);
          ESLVal $197 = _v32.termRef(1);
          ESLVal $196 = _v32.termRef(2);
          
          {ESLVal l = $198;
          
          {ESLVal t = $197;
          
          {ESLVal name = $196;
          
          return new ESLVal("UnionRef",l,substType.apply(newType,n,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v32;
          
          return error(x);
        }
      }
      }
    }
  });
  public static ESLVal substTypesEnv = new ESLVal(new Function(new ESLVal("substTypesEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v31 = types;
        
        if(_v31.isCons())
        {ESLVal $194 = _v31.head();
          ESLVal $195 = _v31.tail();
          
          {ESLVal t = $194;
          
          {ESLVal ts = $195;
          
          return substTypesEnv.apply(env,ts).cons(substTypeEnv.apply(env,t));
        }
        }
        }
      else if(_v31.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(24537,24648)").add(ESLVal.list(_v31)));
      }
    }
  });
  public static ESLVal substTypeEnv = new ESLVal(new Function(new ESLVal("substTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal oldType = $args[1];
  {ESLVal _v22 = oldType;
        
        switch(_v22.termName) {
        case "ApplyType": {ESLVal $193 = _v22.termRef(0);
          ESLVal $192 = _v22.termRef(1);
          ESLVal $191 = _v22.termRef(2);
          
          {ESLVal l = $193;
          
          {ESLVal n = $192;
          
          {ESLVal types = $191;
          
          {ESLVal op = lookupType.apply(n,env);
          
          if(op.eql($null).boolVal)
          return new ESLVal("ApplyType",l,n,substTypesEnv.apply(env,types));
          else
            return new ESLVal("ApplyTypeFun",l,op,substTypesEnv.apply(env,types));
        }
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $190 = _v22.termRef(0);
          ESLVal $189 = _v22.termRef(1);
          ESLVal $188 = _v22.termRef(2);
          
          {ESLVal l = $190;
          
          {ESLVal op = $189;
          
          {ESLVal args = $188;
          
          return new ESLVal("ApplyTypeFun",l,substTypeEnv.apply(env,op),substTypesEnv.apply(env,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $187 = _v22.termRef(0);
          ESLVal $186 = _v22.termRef(1);
          ESLVal $185 = _v22.termRef(2);
          
          {ESLVal l = $187;
          
          {ESLVal decs = $186;
          
          {ESLVal handlers = $185;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                {ESLVal d = _v29;
                
                return ESLVal.list(ESLVal.list(substDecEnv.apply(env,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v30 = $qualArg;
                
                {ESLVal m = _v30;
                
                return ESLVal.list(ESLVal.list(substMTypeEnv.apply(env,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $184 = _v22.termRef(0);
          ESLVal $183 = _v22.termRef(1);
          ESLVal $182 = _v22.termRef(2);
          ESLVal $181 = _v22.termRef(3);
          
          {ESLVal l = $184;
          
          {ESLVal parent = $183;
          
          {ESLVal decs = $182;
          
          {ESLVal handlers = $181;
          
          return new ESLVal("ExtendedAct",l,substTypeEnv.apply(env,parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                {ESLVal d = _v27;
                
                return ESLVal.list(ESLVal.list(substDecEnv.apply(env,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                {ESLVal m = _v28;
                
                return ESLVal.list(ESLVal.list(substMTypeEnv.apply(env,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
        }
      case "ArrayType": {ESLVal $180 = _v22.termRef(0);
          ESLVal $179 = _v22.termRef(1);
          
          {ESLVal l = $180;
          
          {ESLVal t = $179;
          
          return new ESLVal("ArrayType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BoolType": {ESLVal $178 = _v22.termRef(0);
          
          {ESLVal l = $178;
          
          return oldType;
        }
        }
      case "FloatType": {ESLVal $177 = _v22.termRef(0);
          
          {ESLVal l = $177;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $176 = _v22.termRef(0);
          ESLVal $175 = _v22.termRef(1);
          ESLVal $174 = _v22.termRef(2);
          
          {ESLVal l = $176;
          
          {ESLVal ns = $175;
          
          {ESLVal t = $174;
          
          return new ESLVal("ForallType",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "FieldType": {ESLVal $173 = _v22.termRef(0);
          ESLVal $172 = _v22.termRef(1);
          ESLVal $171 = _v22.termRef(2);
          
          {ESLVal l = $173;
          
          {ESLVal n = $172;
          
          {ESLVal t = $171;
          
          return new ESLVal("FieldType",l,n,substTypeEnv.apply(env,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $170 = _v22.termRef(0);
          ESLVal $169 = _v22.termRef(1);
          ESLVal $168 = _v22.termRef(2);
          
          {ESLVal l = $170;
          
          {ESLVal d = $169;
          
          {ESLVal r = $168;
          
          return new ESLVal("FunType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v26 = $qualArg;
                
                {ESLVal t = _v26;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(d).flatten().flatten(),substTypeEnv.apply(env,r));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $167 = _v22.termRef(0);
          ESLVal $166 = _v22.termRef(1);
          ESLVal $165 = _v22.termRef(2);
          ESLVal $164 = _v22.termRef(3);
          
          {ESLVal l = $167;
          
          {ESLVal d = $166;
          
          {ESLVal p = $165;
          
          {ESLVal r = $164;
          
          return new ESLVal("FunType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v25 = $qualArg;
                
                {ESLVal t = _v25;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(d).flatten().flatten(),substTypeEnv.apply(env,r));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $163 = _v22.termRef(0);
          
          {ESLVal l = $163;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $162 = _v22.termRef(0);
          ESLVal $161 = _v22.termRef(1);
          
          {ESLVal l = $162;
          
          {ESLVal t = $161;
          
          return new ESLVal("ListType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "SetType": {ESLVal $160 = _v22.termRef(0);
          ESLVal $159 = _v22.termRef(1);
          
          {ESLVal l = $160;
          
          {ESLVal t = $159;
          
          return new ESLVal("SetType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BagType": {ESLVal $158 = _v22.termRef(0);
          ESLVal $157 = _v22.termRef(1);
          
          {ESLVal l = $158;
          
          {ESLVal t = $157;
          
          return new ESLVal("BagType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "NullType": {ESLVal $156 = _v22.termRef(0);
          
          {ESLVal l = $156;
          
          return oldType;
        }
        }
      case "RecType": {ESLVal $155 = _v22.termRef(0);
          ESLVal $154 = _v22.termRef(1);
          ESLVal $153 = _v22.termRef(2);
          
          {ESLVal l = $155;
          
          {ESLVal a = $154;
          
          {ESLVal t = $153;
          
          return new ESLVal("RecType",l,a,substTypeEnv.apply(removeFromDom.apply(env,ESLVal.list(a)),t));
        }
        }
        }
        }
      case "RecordType": {ESLVal $152 = _v22.termRef(0);
          ESLVal $151 = _v22.termRef(1);
          
          {ESLVal l = $152;
          
          {ESLVal fs = $151;
          
          return new ESLVal("RecordType",l,substTypesEnv.apply(env,fs));
        }
        }
        }
      case "StrType": {ESLVal $150 = _v22.termRef(0);
          
          {ESLVal l = $150;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $149 = _v22.termRef(0);
          ESLVal $148 = _v22.termRef(1);
          ESLVal $147 = _v22.termRef(2);
          
          {ESLVal l = $149;
          
          {ESLVal k = $148;
          
          {ESLVal v = $147;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(env,k),substTypeEnv.apply(env,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $146 = _v22.termRef(0);
          ESLVal $145 = _v22.termRef(1);
          ESLVal $144 = _v22.termRef(2);
          
          {ESLVal l = $146;
          
          {ESLVal f = $145;
          
          {ESLVal ts = $144;
          
          return new ESLVal("TermType",l,f,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v24 = $qualArg;
                
                {ESLVal t = _v24;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $143 = _v22.termRef(0);
          
          {ESLVal f = $143;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $142 = _v22.termRef(0);
          ESLVal $141 = _v22.termRef(1);
          ESLVal $140 = _v22.termRef(2);
          
          {ESLVal l = $142;
          
          {ESLVal ns = $141;
          
          {ESLVal t = $140;
          
          return new ESLVal("TypeFun",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $139 = _v22.termRef(0);
          ESLVal $138 = _v22.termRef(1);
          
          {ESLVal l = $139;
          
          {ESLVal t = $138;
          
          return new ESLVal("UnfoldType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "UnionType": {ESLVal $137 = _v22.termRef(0);
          ESLVal $136 = _v22.termRef(1);
          
          {ESLVal l = $137;
          
          {ESLVal ts = $136;
          
          return new ESLVal("UnionType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v23 = $qualArg;
                
                {ESLVal t = _v23;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
      case "VarType": {ESLVal $135 = _v22.termRef(0);
          ESLVal $134 = _v22.termRef(1);
          
          {ESLVal l = $135;
          
          {ESLVal name = $134;
          
          if(member.apply(name,typeEnvDom.apply(env)).boolVal)
          return lookupType.apply(name,env);
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $133 = _v22.termRef(0);
          
          {ESLVal l = $133;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $132 = _v22.termRef(0);
          ESLVal $131 = _v22.termRef(1);
          ESLVal $130 = _v22.termRef(2);
          
          {ESLVal l = $132;
          
          {ESLVal t = $131;
          
          {ESLVal name = $130;
          
          return new ESLVal("UnionRef",l,substTypeEnv.apply(env,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v22;
          
          return error(oldType);
        }
      }
      }
    }
  });
  public static ESLVal zipTypeEnv = new ESLVal(new Function(new ESLVal("zipTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ns = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v21 = ns;
        ESLVal _v20 = ts;
        
        if(_v21.isCons())
        {ESLVal $124 = _v21.head();
          ESLVal $125 = _v21.tail();
          
          if(_v20.isCons())
          {ESLVal $126 = _v20.head();
            ESLVal $127 = _v20.tail();
            
            {ESLVal n = $124;
            
            {ESLVal _v84 = $125;
            
            {ESLVal t = $126;
            
            {ESLVal _v85 = $127;
            
            return zipTypeEnv.apply(_v84,_v85).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
        else if(_v20.isNil())
          return error(new ESLVal("case error at Pos(27334,27455)").add(ESLVal.list(_v21,_v20)));
        else return error(new ESLVal("case error at Pos(27334,27455)").add(ESLVal.list(_v21,_v20)));
        }
      else if(_v21.isNil())
        if(_v20.isCons())
          {ESLVal $128 = _v20.head();
            ESLVal $129 = _v20.tail();
            
            return error(new ESLVal("case error at Pos(27334,27455)").add(ESLVal.list(_v21,_v20)));
          }
        else if(_v20.isNil())
          return $nil;
        else return error(new ESLVal("case error at Pos(27334,27455)").add(ESLVal.list(_v21,_v20)));
      else return error(new ESLVal("case error at Pos(27334,27455)").add(ESLVal.list(_v21,_v20)));
      }
    }
  });
  public static ESLVal lookupType = new ESLVal(new Function(new ESLVal("lookupType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v19 = env;
        
        if(_v19.isCons())
        {ESLVal $120 = _v19.head();
          ESLVal $121 = _v19.tail();
          
          switch($120.termName) {
          case "Map": {ESLVal $123 = $120.termRef(0);
            ESLVal $122 = $120.termRef(1);
            
            {ESLVal n = $123;
            
            {ESLVal t = $122;
            
            {ESLVal e = $121;
            
            if(n.eql(name).boolVal)
            return t;
            else
              {ESLVal m = $120;
                
                {ESLVal _v83 = $121;
                
                return lookupType.apply(name,_v83);
              }
              }
          }
          }
          }
          }
          default: {ESLVal m = $120;
            
            {ESLVal e = $121;
            
            return lookupType.apply(name,e);
          }
          }
        }
        }
      else if(_v19.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(27501,27638)").add(ESLVal.list(_v19)));
      }
    }
  });
  public static ESLVal typeEnvDom = new ESLVal(new Function(new ESLVal("typeEnvDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v18 = e;
        
        if(_v18.isCons())
        {ESLVal $116 = _v18.head();
          ESLVal $117 = _v18.tail();
          
          switch($116.termName) {
          case "Map": {ESLVal $119 = $116.termRef(0);
            ESLVal $118 = $116.termRef(1);
            
            {ESLVal n = $119;
            
            {ESLVal t = $118;
            
            {ESLVal x = $117;
            
            return typeEnvDom.apply(x).cons(n);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(27673,27762)").add(ESLVal.list(_v18)));
        }
        }
      else if(_v18.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(27673,27762)").add(ESLVal.list(_v18)));
      }
    }
  });
  public static ESLVal removeFromDom = new ESLVal(new Function(new ESLVal("removeFromDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v17 = e;
        
        if(_v17.isCons())
        {ESLVal $112 = _v17.head();
          ESLVal $113 = _v17.tail();
          
          switch($112.termName) {
          case "Map": {ESLVal $115 = $112.termRef(0);
            ESLVal $114 = $112.termRef(1);
            
            {ESLVal n = $115;
            
            {ESLVal t = $114;
            
            {ESLVal _v79 = $113;
            
            if(member.apply(n,ns).boolVal)
            return removeFromDom.apply(_v79,ns);
            else
              {ESLVal _v80 = $115;
                
                {ESLVal _v81 = $114;
                
                {ESLVal _v82 = $113;
                
                return removeFromDom.apply(_v82,ns).cons(new ESLVal("Map",_v80,_v81));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(27809,27991)").add(ESLVal.list(_v17)));
        }
        }
      else if(_v17.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(27809,27991)").add(ESLVal.list(_v17)));
      }
    }
  });
  public static ESLVal restrictTypeEnv = new ESLVal(new Function(new ESLVal("restrictTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v16 = e;
        
        if(_v16.isCons())
        {ESLVal $108 = _v16.head();
          ESLVal $109 = _v16.tail();
          
          switch($108.termName) {
          case "Map": {ESLVal $111 = $108.termRef(0);
            ESLVal $110 = $108.termRef(1);
            
            {ESLVal n = $111;
            
            {ESLVal t = $110;
            
            {ESLVal _v75 = $109;
            
            if(member.apply(n,ns).not().boolVal)
            return restrictTypeEnv.apply(_v75,ns);
            else
              {ESLVal _v76 = $111;
                
                {ESLVal _v77 = $110;
                
                {ESLVal _v78 = $109;
                
                return restrictTypeEnv.apply(_v78,ns).cons(new ESLVal("Map",_v76,_v77));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28040,28231)").add(ESLVal.list(_v16)));
        }
        }
      else if(_v16.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28040,28231)").add(ESLVal.list(_v16)));
      }
    }
  });
  public static ESLVal typeEnvRan = new ESLVal(new Function(new ESLVal("typeEnvRan"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v15 = e;
        
        if(_v15.isCons())
        {ESLVal $104 = _v15.head();
          ESLVal $105 = _v15.tail();
          
          switch($104.termName) {
          case "Map": {ESLVal $107 = $104.termRef(0);
            ESLVal $106 = $104.termRef(1);
            
            {ESLVal n = $107;
            
            {ESLVal t = $106;
            
            {ESLVal x = $105;
            
            return typeEnvRan.apply(x).cons(t);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28267,28358)").add(ESLVal.list(_v15)));
        }
        }
      else if(_v15.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28267,28358)").add(ESLVal.list(_v15)));
      }
    }
  });
  public static ESLVal allEqualTypes = new ESLVal(new Function(new ESLVal("allEqualTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v14 = ts;
        
        if(_v14.isCons())
        {ESLVal $102 = _v14.head();
          ESLVal $103 = _v14.tail();
          
          {ESLVal t2 = $102;
          
          {ESLVal _v72 = $103;
          
          if(typeEqual.apply(t1,t2).boolVal)
          return allEqualTypes.apply(t1,_v72);
          else
            {ESLVal _v73 = _v14;
              
              return $false;
            }
        }
        }
        }
      else if(_v14.isNil())
        return $true;
      else {ESLVal _v74 = _v14;
          
          return $false;
        }
      }
    }
  });
  public static ESLVal substDec = new ESLVal(new Function(new ESLVal("substDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal d = $args[2];
  {ESLVal _v13 = d;
        
        switch(_v13.termName) {
        case "Dec": {ESLVal $101 = _v13.termRef(0);
          ESLVal $100 = _v13.termRef(1);
          ESLVal $99 = _v13.termRef(2);
          ESLVal $98 = _v13.termRef(3);
          
          {ESLVal l = $101;
          
          {ESLVal name = $100;
          
          {ESLVal t = $99;
          
          {ESLVal st = $98;
          
          return new ESLVal("Dec",l,name,substType.apply(newType,n,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28591,28688)").add(ESLVal.list(_v13)));
      }
      }
    }
  });
  public static ESLVal substDecEnv = new ESLVal(new Function(new ESLVal("substDecEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v12 = d;
        
        switch(_v12.termName) {
        case "Dec": {ESLVal $97 = _v12.termRef(0);
          ESLVal $96 = _v12.termRef(1);
          ESLVal $95 = _v12.termRef(2);
          ESLVal $94 = _v12.termRef(3);
          
          {ESLVal l = $97;
          
          {ESLVal name = $96;
          
          {ESLVal t = $95;
          
          {ESLVal st = $94;
          
          return new ESLVal("Dec",l,name,substTypeEnv.apply(env,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28733,28827)").add(ESLVal.list(_v12)));
      }
      }
    }
  });
  public static ESLVal substMType = new ESLVal(new Function(new ESLVal("substMType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal m = $args[2];
  {ESLVal _v10 = m;
        
        switch(_v10.termName) {
        case "MessageType": {ESLVal $93 = _v10.termRef(0);
          ESLVal $92 = _v10.termRef(1);
          
          {ESLVal l = $93;
          
          {ESLVal ts = $92;
          
          return new ESLVal("MessageType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v11 = $qualArg;
                
                {ESLVal t = _v11;
                
                return ESLVal.list(ESLVal.list(substType.apply(newType,n,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28887,28995)").add(ESLVal.list(_v10)));
      }
      }
    }
  });
  public static ESLVal substMTypeEnv = new ESLVal(new Function(new ESLVal("substMTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal m = $args[1];
  {ESLVal _v8 = m;
        
        switch(_v8.termName) {
        case "MessageType": {ESLVal $91 = _v8.termRef(0);
          ESLVal $90 = _v8.termRef(1);
          
          {ESLVal l = $91;
          
          {ESLVal ts = $90;
          
          return new ESLVal("MessageType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v9 = $qualArg;
                
                {ESLVal t = _v9;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(ts).flatten().flatten());
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29047,29152)").add(ESLVal.list(_v8)));
      }
      }
    }
  });
  public static ESLVal patternNames = new ESLVal(new Function(new ESLVal("patternNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v5 = x;
        
        switch(_v5.termName) {
        case "PVar": {ESLVal $89 = _v5.termRef(0);
          ESLVal $88 = _v5.termRef(1);
          ESLVal $87 = _v5.termRef(2);
          
          {ESLVal v0 = $89;
          
          {ESLVal v1 = $88;
          
          {ESLVal v2 = $87;
          
          return ESLVal.list(v1);
        }
        }
        }
        }
      case "PTerm": {ESLVal $86 = _v5.termRef(0);
          ESLVal $85 = _v5.termRef(1);
          ESLVal $84 = _v5.termRef(2);
          ESLVal $83 = _v5.termRef(3);
          
          {ESLVal v0 = $86;
          
          {ESLVal v1 = $85;
          
          {ESLVal v2 = $84;
          
          {ESLVal v3 = $83;
          
          return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v6 = $qualArg;
                
                {ESLVal p = _v6;
                
                return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v71 = $args[0];
                {ESLVal _v7 = _v71;
                      
                      {ESLVal n = _v7;
                      
                      return ESLVal.list(ESLVal.list(n));
                    }
                    }
                  }
                }).map(patternNames.apply(p)).flatten().flatten());
              }
              }
            }
          }).map(v3).flatten().flatten();
        }
        }
        }
        }
        }
      case "PApplyType": {ESLVal $82 = _v5.termRef(0);
          ESLVal $81 = _v5.termRef(1);
          ESLVal $80 = _v5.termRef(2);
          
          {ESLVal v0 = $82;
          
          {ESLVal v1 = $81;
          
          {ESLVal v2 = $80;
          
          return patternNames.apply(v1);
        }
        }
        }
        }
      case "PNil": {ESLVal $79 = _v5.termRef(0);
          
          {ESLVal v0 = $79;
          
          return ESLVal.list();
        }
        }
      case "PNull": {ESLVal $78 = _v5.termRef(0);
          
          {ESLVal v0 = $78;
          
          return ESLVal.list();
        }
        }
      case "PInt": {ESLVal $77 = _v5.termRef(0);
          ESLVal $76 = _v5.termRef(1);
          
          {ESLVal v0 = $77;
          
          {ESLVal v1 = $76;
          
          return ESLVal.list();
        }
        }
        }
      case "PStr": {ESLVal $75 = _v5.termRef(0);
          ESLVal $74 = _v5.termRef(1);
          
          {ESLVal v0 = $75;
          
          {ESLVal v1 = $74;
          
          return ESLVal.list();
        }
        }
        }
      case "PBool": {ESLVal $73 = _v5.termRef(0);
          ESLVal $72 = _v5.termRef(1);
          
          {ESLVal v0 = $73;
          
          {ESLVal v1 = $72;
          
          return ESLVal.list();
        }
        }
        }
      case "PCons": {ESLVal $71 = _v5.termRef(0);
          ESLVal $70 = _v5.termRef(1);
          ESLVal $69 = _v5.termRef(2);
          
          {ESLVal v0 = $71;
          
          {ESLVal v1 = $70;
          
          {ESLVal v2 = $69;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $68 = _v5.termRef(0);
          ESLVal $67 = _v5.termRef(1);
          ESLVal $66 = _v5.termRef(2);
          
          {ESLVal v0 = $68;
          
          {ESLVal v1 = $67;
          
          {ESLVal v2 = $66;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptyBag": {ESLVal $65 = _v5.termRef(0);
          
          {ESLVal v0 = $65;
          
          return ESLVal.list();
        }
        }
      case "PSetCons": {ESLVal $64 = _v5.termRef(0);
          ESLVal $63 = _v5.termRef(1);
          ESLVal $62 = _v5.termRef(2);
          
          {ESLVal v0 = $64;
          
          {ESLVal v1 = $63;
          
          {ESLVal v2 = $62;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptySet": {ESLVal $61 = _v5.termRef(0);
          
          {ESLVal v0 = $61;
          
          return ESLVal.list();
        }
        }
        default: return error(new ESLVal("case error at Pos(29480,30179)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  public static ESLVal isBinding = new ESLVal(new Function(new ESLVal("isBinding"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v4 = b;
        
        switch(_v4.termName) {
        case "Binding": {ESLVal $60 = _v4.termRef(0);
          ESLVal $59 = _v4.termRef(1);
          ESLVal $58 = _v4.termRef(2);
          ESLVal $57 = _v4.termRef(3);
          ESLVal $56 = _v4.termRef(4);
          
          {ESLVal l = $60;
          
          {ESLVal n = $59;
          
          {ESLVal t = $58;
          
          {ESLVal st = $57;
          
          {ESLVal e = $56;
          
          return $true;
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v70 = _v4;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isFunBind = new ESLVal(new Function(new ESLVal("isFunBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v3 = b;
        
        switch(_v3.termName) {
        case "FunBind": {ESLVal $55 = _v3.termRef(0);
          ESLVal $54 = _v3.termRef(1);
          ESLVal $53 = _v3.termRef(2);
          ESLVal $52 = _v3.termRef(3);
          ESLVal $51 = _v3.termRef(4);
          ESLVal $50 = _v3.termRef(5);
          ESLVal $49 = _v3.termRef(6);
          
          {ESLVal l = $55;
          
          {ESLVal n = $54;
          
          {ESLVal args = $53;
          
          {ESLVal t = $52;
          
          {ESLVal st = $51;
          
          {ESLVal g = $50;
          
          {ESLVal e = $49;
          
          return $true;
        }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v69 = _v3;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal bindingName = new ESLVal(new Function(new ESLVal("bindingName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v2 = b;
        
        switch(_v2.termName) {
        case "TypeBind": {ESLVal $48 = _v2.termRef(0);
          ESLVal $47 = _v2.termRef(1);
          ESLVal $46 = _v2.termRef(2);
          ESLVal $45 = _v2.termRef(3);
          
          {ESLVal v0 = $48;
          
          {ESLVal v1 = $47;
          
          {ESLVal v2 = $46;
          
          {ESLVal v3 = $45;
          
          return v1;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $44 = _v2.termRef(0);
          ESLVal $43 = _v2.termRef(1);
          ESLVal $42 = _v2.termRef(2);
          ESLVal $41 = _v2.termRef(3);
          
          {ESLVal v0 = $44;
          
          {ESLVal v1 = $43;
          
          {ESLVal v2 = $42;
          
          {ESLVal v3 = $41;
          
          return v1;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $40 = _v2.termRef(0);
          ESLVal $39 = _v2.termRef(1);
          ESLVal $38 = _v2.termRef(2);
          ESLVal $37 = _v2.termRef(3);
          ESLVal $36 = _v2.termRef(4);
          ESLVal $35 = _v2.termRef(5);
          ESLVal $34 = _v2.termRef(6);
          
          {ESLVal v0 = $40;
          
          {ESLVal v1 = $39;
          
          {ESLVal v2 = $38;
          
          {ESLVal v3 = $37;
          
          {ESLVal v4 = $36;
          
          {ESLVal v5 = $35;
          
          {ESLVal v6 = $34;
          
          return v1;
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $33 = _v2.termRef(0);
          ESLVal $32 = _v2.termRef(1);
          ESLVal $31 = _v2.termRef(2);
          ESLVal $30 = _v2.termRef(3);
          ESLVal $29 = _v2.termRef(4);
          
          {ESLVal v0 = $33;
          
          {ESLVal v1 = $32;
          
          {ESLVal v2 = $31;
          
          {ESLVal v3 = $30;
          
          {ESLVal v4 = $29;
          
          return v1;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $28 = _v2.termRef(0);
          ESLVal $27 = _v2.termRef(1);
          ESLVal $26 = _v2.termRef(2);
          ESLVal $25 = _v2.termRef(3);
          
          {ESLVal v0 = $28;
          
          {ESLVal v1 = $27;
          
          {ESLVal v2 = $26;
          
          {ESLVal v3 = $25;
          
          return v1;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(30680,31001)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  public static ESLVal bindingLoc = new ESLVal(new Function(new ESLVal("bindingLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1 = b;
        
        switch(_v1.termName) {
        case "TypeBind": {ESLVal $24 = _v1.termRef(0);
          ESLVal $23 = _v1.termRef(1);
          ESLVal $22 = _v1.termRef(2);
          ESLVal $21 = _v1.termRef(3);
          
          {ESLVal v0 = $24;
          
          {ESLVal v1 = $23;
          
          {ESLVal v2 = $22;
          
          {ESLVal v3 = $21;
          
          return v0;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $20 = _v1.termRef(0);
          ESLVal $19 = _v1.termRef(1);
          ESLVal $18 = _v1.termRef(2);
          ESLVal $17 = _v1.termRef(3);
          
          {ESLVal v0 = $20;
          
          {ESLVal v1 = $19;
          
          {ESLVal v2 = $18;
          
          {ESLVal v3 = $17;
          
          return v0;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $16 = _v1.termRef(0);
          ESLVal $15 = _v1.termRef(1);
          ESLVal $14 = _v1.termRef(2);
          ESLVal $13 = _v1.termRef(3);
          ESLVal $12 = _v1.termRef(4);
          ESLVal $11 = _v1.termRef(5);
          ESLVal $10 = _v1.termRef(6);
          
          {ESLVal v0 = $16;
          
          {ESLVal v1 = $15;
          
          {ESLVal v2 = $14;
          
          {ESLVal v3 = $13;
          
          {ESLVal v4 = $12;
          
          {ESLVal v5 = $11;
          
          {ESLVal v6 = $10;
          
          return v0;
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $9 = _v1.termRef(0);
          ESLVal $8 = _v1.termRef(1);
          ESLVal $7 = _v1.termRef(2);
          ESLVal $6 = _v1.termRef(3);
          ESLVal $5 = _v1.termRef(4);
          
          {ESLVal v0 = $9;
          
          {ESLVal v1 = $8;
          
          {ESLVal v2 = $7;
          
          {ESLVal v3 = $6;
          
          {ESLVal v4 = $5;
          
          return v0;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $4 = _v1.termRef(0);
          ESLVal $3 = _v1.termRef(1);
          ESLVal $2 = _v1.termRef(2);
          ESLVal $1 = _v1.termRef(3);
          
          {ESLVal v0 = $4;
          
          {ESLVal v1 = $3;
          
          {ESLVal v2 = $2;
          
          {ESLVal v3 = $1;
          
          return v0;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(31033,31354)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}