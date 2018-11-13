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
  {ESLVal _v70 = l;
        
        switch(_v70.termName) {
        case "Pos": {ESLVal $607 = _v70.termRef(0);
          ESLVal $606 = _v70.termRef(1);
          
          {ESLVal start = $607;
          
          {ESLVal end = $606;
          
          return start;
        }
        }
        }
      case "TypedLoc": {ESLVal $605 = _v70.termRef(0);
          ESLVal $604 = _v70.termRef(1);
          ESLVal $603 = _v70.termRef(2);
          
          {ESLVal t = $605;
          
          {ESLVal start = $604;
          
          {ESLVal end = $603;
          
          return start;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5833,5917)").add(ESLVal.list(_v70)));
      }
      }
    }
  });
  private static ESLVal locEnd = new ESLVal(new Function(new ESLVal("locEnd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v69 = l;
        
        switch(_v69.termName) {
        case "Pos": {ESLVal $602 = _v69.termRef(0);
          ESLVal $601 = _v69.termRef(1);
          
          {ESLVal start = $602;
          
          {ESLVal end = $601;
          
          return end;
        }
        }
        }
      case "TypedLoc": {ESLVal $600 = _v69.termRef(0);
          ESLVal $599 = _v69.termRef(1);
          ESLVal $598 = _v69.termRef(2);
          
          {ESLVal t = $600;
          
          {ESLVal start = $599;
          
          {ESLVal end = $598;
          
          return end;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5944,6024)").add(ESLVal.list(_v69)));
      }
      }
    }
  });
  public static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v68 = d;
        
        switch(_v68.termName) {
        case "Dec": {ESLVal $597 = _v68.termRef(0);
          ESLVal $596 = _v68.termRef(1);
          ESLVal $595 = _v68.termRef(2);
          ESLVal $594 = _v68.termRef(3);
          
          {ESLVal l = $597;
          
          {ESLVal n = $596;
          
          {ESLVal t = $595;
          
          {ESLVal dt = $594;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6346,6468)").add(ESLVal.list(_v68)));
      }
      }
    }
  });
  public static ESLVal decLoc = new ESLVal(new Function(new ESLVal("decLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v67 = d;
        
        switch(_v67.termName) {
        case "Dec": {ESLVal $593 = _v67.termRef(0);
          ESLVal $592 = _v67.termRef(1);
          ESLVal $591 = _v67.termRef(2);
          ESLVal $590 = _v67.termRef(3);
          
          {ESLVal l = $593;
          
          {ESLVal n = $592;
          
          {ESLVal t = $591;
          
          {ESLVal dt = $590;
          
          return l;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6572,6630)").add(ESLVal.list(_v67)));
      }
      }
    }
  });
  public static ESLVal decType = new ESLVal(new Function(new ESLVal("decType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v66 = d;
        
        switch(_v66.termName) {
        case "Dec": {ESLVal $589 = _v66.termRef(0);
          ESLVal $588 = _v66.termRef(1);
          ESLVal $587 = _v66.termRef(2);
          ESLVal $586 = _v66.termRef(3);
          
          {ESLVal l = $589;
          
          {ESLVal n = $588;
          
          {ESLVal t = $587;
          
          {ESLVal dt = $586;
          
          return t;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6730,6788)").add(ESLVal.list(_v66)));
      }
      }
    }
  });
  public static ESLVal isStrType = new ESLVal(new Function(new ESLVal("isStrType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v65 = t;
        
        switch(_v65.termName) {
        case "StrType": {ESLVal $585 = _v65.termRef(0);
          
          {ESLVal l = $585;
          
          return $true;
        }
        }
        default: {ESLVal _v563 = _v65;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isIntType = new ESLVal(new Function(new ESLVal("isIntType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v64 = t;
        
        switch(_v64.termName) {
        case "IntType": {ESLVal $584 = _v64.termRef(0);
          
          {ESLVal l = $584;
          
          return $true;
        }
        }
        default: {ESLVal _v562 = _v64;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isNumType = new ESLVal(new Function(new ESLVal("isNumType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v63 = t;
        
        switch(_v63.termName) {
        case "IntType": {ESLVal $583 = _v63.termRef(0);
          
          {ESLVal l = $583;
          
          return $true;
        }
        }
      case "FloatType": {ESLVal $582 = _v63.termRef(0);
          
          {ESLVal l = $582;
          
          return $true;
        }
        }
        default: {ESLVal _v561 = _v63;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isBoolType = new ESLVal(new Function(new ESLVal("isBoolType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v62 = t;
        
        switch(_v62.termName) {
        case "BoolType": {ESLVal $581 = _v62.termRef(0);
          
          {ESLVal l = $581;
          
          return $true;
        }
        }
        default: {ESLVal _v560 = _v62;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isFloatType = new ESLVal(new Function(new ESLVal("isFloatType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v61 = t;
        
        switch(_v61.termName) {
        case "FloatType": {ESLVal $580 = _v61.termRef(0);
          
          {ESLVal l = $580;
          
          return $true;
        }
        }
        default: {ESLVal _v559 = _v61;
          
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
          {ESLVal _v60 = t1;
            ESLVal _v59 = t2;
            
            switch(_v60.termName) {
            case "ArrayType": {ESLVal $577 = _v60.termRef(0);
              ESLVal $576 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "ArrayType": {ESLVal $579 = _v59.termRef(0);
                ESLVal $578 = _v59.termRef(1);
                
                {ESLVal l1 = $577;
                
                {ESLVal _v535 = $576;
                
                {ESLVal l2 = $579;
                
                {ESLVal _v536 = $578;
                
                return typeEqual.apply(_v535,_v536);
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v545 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v545,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v543 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v544 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v543,flattenAct.apply(l2,_v544,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v542 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v541 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v541,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v539 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v540 = $437;
                  
                  return typeEqual.apply(_v539,substType.apply(new ESLVal("RecType",l2,n2,_v540),n2,_v540));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v537 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v538 = $434;
                  
                  return typeEqual.apply(_v537,_v538);
                }
                }
                }
                }
                }
                default: {ESLVal _v546 = _v60;
                  
                  {ESLVal _v547 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ActType": {ESLVal $572 = _v60.termRef(0);
              ESLVal $571 = _v60.termRef(1);
              ESLVal $570 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "ActType": {ESLVal $575 = _v59.termRef(0);
                ESLVal $574 = _v59.termRef(1);
                ESLVal $573 = _v59.termRef(2);
                
                {ESLVal l1 = $572;
                
                {ESLVal exports1 = $571;
                
                {ESLVal handlers1 = $570;
                
                {ESLVal l2 = $575;
                
                {ESLVal exports2 = $574;
                
                {ESLVal handlers2 = $573;
                
                return actEqual.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v532 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v532,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v530 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v531 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v530,flattenAct.apply(l2,_v531,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v529 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v528 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v528,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v526 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v527 = $437;
                  
                  return typeEqual.apply(_v526,substType.apply(new ESLVal("RecType",l2,n2,_v527),n2,_v527));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v524 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v525 = $434;
                  
                  return typeEqual.apply(_v524,_v525);
                }
                }
                }
                }
                }
                default: {ESLVal _v533 = _v60;
                  
                  {ESLVal _v534 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ApplyTypeFun": {ESLVal $566 = _v60.termRef(0);
              ESLVal $565 = _v60.termRef(1);
              ESLVal $564 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "ApplyTypeFun": {ESLVal $569 = _v59.termRef(0);
                ESLVal $568 = _v59.termRef(1);
                ESLVal $567 = _v59.termRef(2);
                
                {ESLVal l1 = $566;
                
                {ESLVal op1 = $565;
                
                {ESLVal args1 = $564;
                
                {ESLVal l2 = $569;
                
                {ESLVal op2 = $568;
                
                {ESLVal args2 = $567;
                
                return typeEqual.apply(op1,op2).and(typesEqual.apply(args1,args2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $566;
                
                {ESLVal op = $565;
                
                {ESLVal args = $564;
                
                {ESLVal _v523 = _v59;
                
                return typeEqual.apply(applyTypeFun.apply(l,forceType.apply(op),args),_v523);
              }
              }
              }
              }
            }
            }
          case "ExtendedAct": {ESLVal $563 = _v60.termRef(0);
              ESLVal $562 = _v60.termRef(1);
              ESLVal $561 = _v60.termRef(2);
              ESLVal $560 = _v60.termRef(3);
              
              {ESLVal l1 = $563;
              
              {ESLVal _v521 = $562;
              
              {ESLVal ds1 = $561;
              
              {ESLVal ms1 = $560;
              
              {ESLVal _v522 = _v59;
              
              return typeEqual.apply(flattenAct.apply(l1,_v521,ds1,ms1),_v522);
            }
            }
            }
            }
            }
            }
          case "BoolType": {ESLVal $558 = _v60.termRef(0);
              
              switch(_v59.termName) {
              case "BoolType": {ESLVal $559 = _v59.termRef(0);
                
                {ESLVal l1 = $558;
                
                {ESLVal l2 = $559;
                
                return $true;
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v518 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v518,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v516 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v517 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v516,flattenAct.apply(l2,_v517,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v515 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v514 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v514,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v512 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v513 = $437;
                  
                  return typeEqual.apply(_v512,substType.apply(new ESLVal("RecType",l2,n2,_v513),n2,_v513));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v510 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v511 = $434;
                  
                  return typeEqual.apply(_v510,_v511);
                }
                }
                }
                }
                }
                default: {ESLVal _v519 = _v60;
                  
                  {ESLVal _v520 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "FloatType": {ESLVal $556 = _v60.termRef(0);
              
              switch(_v59.termName) {
              case "FloatType": {ESLVal $557 = _v59.termRef(0);
                
                {ESLVal l1 = $556;
                
                {ESLVal l2 = $557;
                
                return $true;
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v507 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v507,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v505 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v506 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v505,flattenAct.apply(l2,_v506,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v504 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v503 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v503,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v501 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v502 = $437;
                  
                  return typeEqual.apply(_v501,substType.apply(new ESLVal("RecType",l2,n2,_v502),n2,_v502));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v499 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v500 = $434;
                  
                  return typeEqual.apply(_v499,_v500);
                }
                }
                }
                }
                }
                default: {ESLVal _v508 = _v60;
                  
                  {ESLVal _v509 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "IntType": {ESLVal $554 = _v60.termRef(0);
              
              switch(_v59.termName) {
              case "IntType": {ESLVal $555 = _v59.termRef(0);
                
                {ESLVal l1 = $554;
                
                {ESLVal l2 = $555;
                
                return $true;
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v496 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v496,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v494 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v495 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v494,flattenAct.apply(l2,_v495,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v493 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v492 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v492,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v490 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v491 = $437;
                  
                  return typeEqual.apply(_v490,substType.apply(new ESLVal("RecType",l2,n2,_v491),n2,_v491));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v488 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v489 = $434;
                  
                  return typeEqual.apply(_v488,_v489);
                }
                }
                }
                }
                }
                default: {ESLVal _v497 = _v60;
                  
                  {ESLVal _v498 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ListType": {ESLVal $540 = _v60.termRef(0);
              ESLVal $539 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "ListType": {ESLVal $553 = _v59.termRef(0);
                ESLVal $552 = _v59.termRef(1);
                
                {ESLVal l1 = $540;
                
                {ESLVal _v475 = $539;
                
                {ESLVal l2 = $553;
                
                {ESLVal _v476 = $552;
                
                return typeEqual.apply(_v475,_v476);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $543 = _v59.termRef(0);
                ESLVal $542 = _v59.termRef(1);
                ESLVal $541 = _v59.termRef(2);
                
                if($542.isCons())
                {ESLVal $544 = $542.head();
                  ESLVal $545 = $542.tail();
                  
                  if($545.isCons())
                  {ESLVal $546 = $545.head();
                    ESLVal $547 = $545.tail();
                    
                    switch(_v59.termName) {
                    case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                      ESLVal $450 = _v59.termRef(1);
                      ESLVal $449 = _v59.termRef(2);
                      
                      {ESLVal _v400 = _v60;
                      
                      {ESLVal l = $451;
                      
                      {ESLVal op = $450;
                      
                      {ESLVal args = $449;
                      
                      return typeEqual.apply(_v400,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                      ESLVal $447 = _v59.termRef(1);
                      ESLVal $446 = _v59.termRef(2);
                      ESLVal $445 = _v59.termRef(3);
                      
                      {ESLVal _v398 = _v60;
                      
                      {ESLVal l2 = $448;
                      
                      {ESLVal _v399 = $447;
                      
                      {ESLVal ds2 = $446;
                      
                      {ESLVal ms2 = $445;
                      
                      return typeEqual.apply(_v398,flattenAct.apply(l2,_v399,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $444 = _v59.termRef(0);
                      
                      {ESLVal t = _v60;
                      
                      {ESLVal l1 = $444;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $443 = _v59.termRef(0);
                      ESLVal $442 = _v59.termRef(1);
                      ESLVal $441 = _v59.termRef(2);
                      
                      {ESLVal _v397 = _v60;
                      
                      {ESLVal l2 = $443;
                      
                      {ESLVal n2 = $442;
                      
                      {ESLVal args2 = $441;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                      
                      {ESLVal _v396 = _v60;
                      
                      {ESLVal f = $440;
                      
                      return typeEqual.apply(_v396,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $439 = _v59.termRef(0);
                      ESLVal $438 = _v59.termRef(1);
                      ESLVal $437 = _v59.termRef(2);
                      
                      {ESLVal _v394 = _v60;
                      
                      {ESLVal l2 = $439;
                      
                      {ESLVal n2 = $438;
                      
                      {ESLVal _v395 = $437;
                      
                      return typeEqual.apply(_v394,substType.apply(new ESLVal("RecType",l2,n2,_v395),n2,_v395));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $436 = _v59.termRef(0);
                      ESLVal $435 = _v59.termRef(1);
                      ESLVal $434 = _v59.termRef(2);
                      
                      {ESLVal _v392 = _v60;
                      
                      {ESLVal l1 = $436;
                      
                      {ESLVal ns2 = $435;
                      
                      {ESLVal _v393 = $434;
                      
                      return typeEqual.apply(_v392,_v393);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v401 = _v60;
                      
                      {ESLVal _v402 = _v59;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($545.isNil())
                  switch($541.termName) {
                    case "ListType": {ESLVal $549 = $541.termRef(0);
                      ESLVal $548 = $541.termRef(1);
                      
                      switch($548.termName) {
                      case "VarType": {ESLVal $551 = $548.termRef(0);
                        ESLVal $550 = $548.termRef(1);
                        
                        {ESLVal l1 = $540;
                        
                        {ESLVal _v403 = $539;
                        
                        {ESLVal l2 = $543;
                        
                        {ESLVal v1 = $544;
                        
                        {ESLVal l3 = $549;
                        
                        {ESLVal l4 = $551;
                        
                        {ESLVal v2 = $550;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v59.termName) {
                            case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                              ESLVal $450 = _v59.termRef(1);
                              ESLVal $449 = _v59.termRef(2);
                              
                              {ESLVal _v417 = _v60;
                              
                              {ESLVal l = $451;
                              
                              {ESLVal op = $450;
                              
                              {ESLVal args = $449;
                              
                              return typeEqual.apply(_v417,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                              ESLVal $447 = _v59.termRef(1);
                              ESLVal $446 = _v59.termRef(2);
                              ESLVal $445 = _v59.termRef(3);
                              
                              {ESLVal _v414 = _v60;
                              
                              {ESLVal _v415 = $448;
                              
                              {ESLVal _v416 = $447;
                              
                              {ESLVal ds2 = $446;
                              
                              {ESLVal ms2 = $445;
                              
                              return typeEqual.apply(_v414,flattenAct.apply(_v415,_v416,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $444 = _v59.termRef(0);
                              
                              {ESLVal t = _v60;
                              
                              {ESLVal _v413 = $444;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $443 = _v59.termRef(0);
                              ESLVal $442 = _v59.termRef(1);
                              ESLVal $441 = _v59.termRef(2);
                              
                              {ESLVal _v411 = _v60;
                              
                              {ESLVal _v412 = $443;
                              
                              {ESLVal n2 = $442;
                              
                              {ESLVal args2 = $441;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                              
                              {ESLVal _v410 = _v60;
                              
                              {ESLVal f = $440;
                              
                              return typeEqual.apply(_v410,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $439 = _v59.termRef(0);
                              ESLVal $438 = _v59.termRef(1);
                              ESLVal $437 = _v59.termRef(2);
                              
                              {ESLVal _v407 = _v60;
                              
                              {ESLVal _v408 = $439;
                              
                              {ESLVal n2 = $438;
                              
                              {ESLVal _v409 = $437;
                              
                              return typeEqual.apply(_v407,substType.apply(new ESLVal("RecType",_v408,n2,_v409),n2,_v409));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $436 = _v59.termRef(0);
                              ESLVal $435 = _v59.termRef(1);
                              ESLVal $434 = _v59.termRef(2);
                              
                              {ESLVal _v404 = _v60;
                              
                              {ESLVal _v405 = $436;
                              
                              {ESLVal ns2 = $435;
                              
                              {ESLVal _v406 = $434;
                              
                              return typeEqual.apply(_v404,_v406);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v418 = _v60;
                              
                              {ESLVal _v419 = _v59;
                              
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
                      default: switch(_v59.termName) {
                        case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                          ESLVal $450 = _v59.termRef(1);
                          ESLVal $449 = _v59.termRef(2);
                          
                          {ESLVal _v428 = _v60;
                          
                          {ESLVal l = $451;
                          
                          {ESLVal op = $450;
                          
                          {ESLVal args = $449;
                          
                          return typeEqual.apply(_v428,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                          ESLVal $447 = _v59.termRef(1);
                          ESLVal $446 = _v59.termRef(2);
                          ESLVal $445 = _v59.termRef(3);
                          
                          {ESLVal _v426 = _v60;
                          
                          {ESLVal l2 = $448;
                          
                          {ESLVal _v427 = $447;
                          
                          {ESLVal ds2 = $446;
                          
                          {ESLVal ms2 = $445;
                          
                          return typeEqual.apply(_v426,flattenAct.apply(l2,_v427,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $444 = _v59.termRef(0);
                          
                          {ESLVal t = _v60;
                          
                          {ESLVal l1 = $444;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $443 = _v59.termRef(0);
                          ESLVal $442 = _v59.termRef(1);
                          ESLVal $441 = _v59.termRef(2);
                          
                          {ESLVal _v425 = _v60;
                          
                          {ESLVal l2 = $443;
                          
                          {ESLVal n2 = $442;
                          
                          {ESLVal args2 = $441;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                          
                          {ESLVal _v424 = _v60;
                          
                          {ESLVal f = $440;
                          
                          return typeEqual.apply(_v424,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $439 = _v59.termRef(0);
                          ESLVal $438 = _v59.termRef(1);
                          ESLVal $437 = _v59.termRef(2);
                          
                          {ESLVal _v422 = _v60;
                          
                          {ESLVal l2 = $439;
                          
                          {ESLVal n2 = $438;
                          
                          {ESLVal _v423 = $437;
                          
                          return typeEqual.apply(_v422,substType.apply(new ESLVal("RecType",l2,n2,_v423),n2,_v423));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $436 = _v59.termRef(0);
                          ESLVal $435 = _v59.termRef(1);
                          ESLVal $434 = _v59.termRef(2);
                          
                          {ESLVal _v420 = _v60;
                          
                          {ESLVal l1 = $436;
                          
                          {ESLVal ns2 = $435;
                          
                          {ESLVal _v421 = $434;
                          
                          return typeEqual.apply(_v420,_v421);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v429 = _v60;
                          
                          {ESLVal _v430 = _v59;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v59.termName) {
                      case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                        ESLVal $450 = _v59.termRef(1);
                        ESLVal $449 = _v59.termRef(2);
                        
                        {ESLVal _v439 = _v60;
                        
                        {ESLVal l = $451;
                        
                        {ESLVal op = $450;
                        
                        {ESLVal args = $449;
                        
                        return typeEqual.apply(_v439,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                        ESLVal $447 = _v59.termRef(1);
                        ESLVal $446 = _v59.termRef(2);
                        ESLVal $445 = _v59.termRef(3);
                        
                        {ESLVal _v437 = _v60;
                        
                        {ESLVal l2 = $448;
                        
                        {ESLVal _v438 = $447;
                        
                        {ESLVal ds2 = $446;
                        
                        {ESLVal ms2 = $445;
                        
                        return typeEqual.apply(_v437,flattenAct.apply(l2,_v438,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $444 = _v59.termRef(0);
                        
                        {ESLVal t = _v60;
                        
                        {ESLVal l1 = $444;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $443 = _v59.termRef(0);
                        ESLVal $442 = _v59.termRef(1);
                        ESLVal $441 = _v59.termRef(2);
                        
                        {ESLVal _v436 = _v60;
                        
                        {ESLVal l2 = $443;
                        
                        {ESLVal n2 = $442;
                        
                        {ESLVal args2 = $441;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                        
                        {ESLVal _v435 = _v60;
                        
                        {ESLVal f = $440;
                        
                        return typeEqual.apply(_v435,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $439 = _v59.termRef(0);
                        ESLVal $438 = _v59.termRef(1);
                        ESLVal $437 = _v59.termRef(2);
                        
                        {ESLVal _v433 = _v60;
                        
                        {ESLVal l2 = $439;
                        
                        {ESLVal n2 = $438;
                        
                        {ESLVal _v434 = $437;
                        
                        return typeEqual.apply(_v433,substType.apply(new ESLVal("RecType",l2,n2,_v434),n2,_v434));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $436 = _v59.termRef(0);
                        ESLVal $435 = _v59.termRef(1);
                        ESLVal $434 = _v59.termRef(2);
                        
                        {ESLVal _v431 = _v60;
                        
                        {ESLVal l1 = $436;
                        
                        {ESLVal ns2 = $435;
                        
                        {ESLVal _v432 = $434;
                        
                        return typeEqual.apply(_v431,_v432);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v440 = _v60;
                        
                        {ESLVal _v441 = _v59;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v59.termName) {
                    case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                      ESLVal $450 = _v59.termRef(1);
                      ESLVal $449 = _v59.termRef(2);
                      
                      {ESLVal _v450 = _v60;
                      
                      {ESLVal l = $451;
                      
                      {ESLVal op = $450;
                      
                      {ESLVal args = $449;
                      
                      return typeEqual.apply(_v450,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                      ESLVal $447 = _v59.termRef(1);
                      ESLVal $446 = _v59.termRef(2);
                      ESLVal $445 = _v59.termRef(3);
                      
                      {ESLVal _v448 = _v60;
                      
                      {ESLVal l2 = $448;
                      
                      {ESLVal _v449 = $447;
                      
                      {ESLVal ds2 = $446;
                      
                      {ESLVal ms2 = $445;
                      
                      return typeEqual.apply(_v448,flattenAct.apply(l2,_v449,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $444 = _v59.termRef(0);
                      
                      {ESLVal t = _v60;
                      
                      {ESLVal l1 = $444;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $443 = _v59.termRef(0);
                      ESLVal $442 = _v59.termRef(1);
                      ESLVal $441 = _v59.termRef(2);
                      
                      {ESLVal _v447 = _v60;
                      
                      {ESLVal l2 = $443;
                      
                      {ESLVal n2 = $442;
                      
                      {ESLVal args2 = $441;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                      
                      {ESLVal _v446 = _v60;
                      
                      {ESLVal f = $440;
                      
                      return typeEqual.apply(_v446,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $439 = _v59.termRef(0);
                      ESLVal $438 = _v59.termRef(1);
                      ESLVal $437 = _v59.termRef(2);
                      
                      {ESLVal _v444 = _v60;
                      
                      {ESLVal l2 = $439;
                      
                      {ESLVal n2 = $438;
                      
                      {ESLVal _v445 = $437;
                      
                      return typeEqual.apply(_v444,substType.apply(new ESLVal("RecType",l2,n2,_v445),n2,_v445));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $436 = _v59.termRef(0);
                      ESLVal $435 = _v59.termRef(1);
                      ESLVal $434 = _v59.termRef(2);
                      
                      {ESLVal _v442 = _v60;
                      
                      {ESLVal l1 = $436;
                      
                      {ESLVal ns2 = $435;
                      
                      {ESLVal _v443 = $434;
                      
                      return typeEqual.apply(_v442,_v443);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v451 = _v60;
                      
                      {ESLVal _v452 = _v59;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($542.isNil())
                switch(_v59.termName) {
                  case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                    ESLVal $450 = _v59.termRef(1);
                    ESLVal $449 = _v59.termRef(2);
                    
                    {ESLVal _v461 = _v60;
                    
                    {ESLVal l = $451;
                    
                    {ESLVal op = $450;
                    
                    {ESLVal args = $449;
                    
                    return typeEqual.apply(_v461,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                    ESLVal $447 = _v59.termRef(1);
                    ESLVal $446 = _v59.termRef(2);
                    ESLVal $445 = _v59.termRef(3);
                    
                    {ESLVal _v459 = _v60;
                    
                    {ESLVal l2 = $448;
                    
                    {ESLVal _v460 = $447;
                    
                    {ESLVal ds2 = $446;
                    
                    {ESLVal ms2 = $445;
                    
                    return typeEqual.apply(_v459,flattenAct.apply(l2,_v460,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $444 = _v59.termRef(0);
                    
                    {ESLVal t = _v60;
                    
                    {ESLVal l1 = $444;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $443 = _v59.termRef(0);
                    ESLVal $442 = _v59.termRef(1);
                    ESLVal $441 = _v59.termRef(2);
                    
                    {ESLVal _v458 = _v60;
                    
                    {ESLVal l2 = $443;
                    
                    {ESLVal n2 = $442;
                    
                    {ESLVal args2 = $441;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                    
                    {ESLVal _v457 = _v60;
                    
                    {ESLVal f = $440;
                    
                    return typeEqual.apply(_v457,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $439 = _v59.termRef(0);
                    ESLVal $438 = _v59.termRef(1);
                    ESLVal $437 = _v59.termRef(2);
                    
                    {ESLVal _v455 = _v60;
                    
                    {ESLVal l2 = $439;
                    
                    {ESLVal n2 = $438;
                    
                    {ESLVal _v456 = $437;
                    
                    return typeEqual.apply(_v455,substType.apply(new ESLVal("RecType",l2,n2,_v456),n2,_v456));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $436 = _v59.termRef(0);
                    ESLVal $435 = _v59.termRef(1);
                    ESLVal $434 = _v59.termRef(2);
                    
                    {ESLVal _v453 = _v60;
                    
                    {ESLVal l1 = $436;
                    
                    {ESLVal ns2 = $435;
                    
                    {ESLVal _v454 = $434;
                    
                    return typeEqual.apply(_v453,_v454);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v462 = _v60;
                    
                    {ESLVal _v463 = _v59;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v59.termName) {
                  case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                    ESLVal $450 = _v59.termRef(1);
                    ESLVal $449 = _v59.termRef(2);
                    
                    {ESLVal _v472 = _v60;
                    
                    {ESLVal l = $451;
                    
                    {ESLVal op = $450;
                    
                    {ESLVal args = $449;
                    
                    return typeEqual.apply(_v472,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                    ESLVal $447 = _v59.termRef(1);
                    ESLVal $446 = _v59.termRef(2);
                    ESLVal $445 = _v59.termRef(3);
                    
                    {ESLVal _v470 = _v60;
                    
                    {ESLVal l2 = $448;
                    
                    {ESLVal _v471 = $447;
                    
                    {ESLVal ds2 = $446;
                    
                    {ESLVal ms2 = $445;
                    
                    return typeEqual.apply(_v470,flattenAct.apply(l2,_v471,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $444 = _v59.termRef(0);
                    
                    {ESLVal t = _v60;
                    
                    {ESLVal l1 = $444;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $443 = _v59.termRef(0);
                    ESLVal $442 = _v59.termRef(1);
                    ESLVal $441 = _v59.termRef(2);
                    
                    {ESLVal _v469 = _v60;
                    
                    {ESLVal l2 = $443;
                    
                    {ESLVal n2 = $442;
                    
                    {ESLVal args2 = $441;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                    
                    {ESLVal _v468 = _v60;
                    
                    {ESLVal f = $440;
                    
                    return typeEqual.apply(_v468,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $439 = _v59.termRef(0);
                    ESLVal $438 = _v59.termRef(1);
                    ESLVal $437 = _v59.termRef(2);
                    
                    {ESLVal _v466 = _v60;
                    
                    {ESLVal l2 = $439;
                    
                    {ESLVal n2 = $438;
                    
                    {ESLVal _v467 = $437;
                    
                    return typeEqual.apply(_v466,substType.apply(new ESLVal("RecType",l2,n2,_v467),n2,_v467));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $436 = _v59.termRef(0);
                    ESLVal $435 = _v59.termRef(1);
                    ESLVal $434 = _v59.termRef(2);
                    
                    {ESLVal _v464 = _v60;
                    
                    {ESLVal l1 = $436;
                    
                    {ESLVal ns2 = $435;
                    
                    {ESLVal _v465 = $434;
                    
                    return typeEqual.apply(_v464,_v465);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v473 = _v60;
                    
                    {ESLVal _v474 = _v59;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v485 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v485,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v483 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v484 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v483,flattenAct.apply(l2,_v484,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v482 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v481 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v481,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v479 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v480 = $437;
                  
                  return typeEqual.apply(_v479,substType.apply(new ESLVal("RecType",l2,n2,_v480),n2,_v480));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v477 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v478 = $434;
                  
                  return typeEqual.apply(_v477,_v478);
                }
                }
                }
                }
                }
                default: {ESLVal _v486 = _v60;
                  
                  {ESLVal _v487 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $536 = _v60.termRef(0);
              ESLVal $535 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "BagType": {ESLVal $538 = _v59.termRef(0);
                ESLVal $537 = _v59.termRef(1);
                
                {ESLVal l1 = $536;
                
                {ESLVal _v379 = $535;
                
                {ESLVal l2 = $538;
                
                {ESLVal _v380 = $537;
                
                return typeEqual.apply(_v379,_v380);
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v389 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v389,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v387 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v388 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v387,flattenAct.apply(l2,_v388,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v386 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v385 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v385,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v383 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v384 = $437;
                  
                  return typeEqual.apply(_v383,substType.apply(new ESLVal("RecType",l2,n2,_v384),n2,_v384));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v381 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v382 = $434;
                  
                  return typeEqual.apply(_v381,_v382);
                }
                }
                }
                }
                }
                default: {ESLVal _v390 = _v60;
                  
                  {ESLVal _v391 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $521 = _v60.termRef(0);
              ESLVal $520 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "SetType": {ESLVal $534 = _v59.termRef(0);
                ESLVal $533 = _v59.termRef(1);
                
                {ESLVal l1 = $521;
                
                {ESLVal _v366 = $520;
                
                {ESLVal l2 = $534;
                
                {ESLVal _v367 = $533;
                
                return typeEqual.apply(_v366,_v367);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $524 = _v59.termRef(0);
                ESLVal $523 = _v59.termRef(1);
                ESLVal $522 = _v59.termRef(2);
                
                if($523.isCons())
                {ESLVal $525 = $523.head();
                  ESLVal $526 = $523.tail();
                  
                  if($526.isCons())
                  {ESLVal $527 = $526.head();
                    ESLVal $528 = $526.tail();
                    
                    switch(_v59.termName) {
                    case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                      ESLVal $450 = _v59.termRef(1);
                      ESLVal $449 = _v59.termRef(2);
                      
                      {ESLVal _v291 = _v60;
                      
                      {ESLVal l = $451;
                      
                      {ESLVal op = $450;
                      
                      {ESLVal args = $449;
                      
                      return typeEqual.apply(_v291,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                      ESLVal $447 = _v59.termRef(1);
                      ESLVal $446 = _v59.termRef(2);
                      ESLVal $445 = _v59.termRef(3);
                      
                      {ESLVal _v289 = _v60;
                      
                      {ESLVal l2 = $448;
                      
                      {ESLVal _v290 = $447;
                      
                      {ESLVal ds2 = $446;
                      
                      {ESLVal ms2 = $445;
                      
                      return typeEqual.apply(_v289,flattenAct.apply(l2,_v290,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $444 = _v59.termRef(0);
                      
                      {ESLVal t = _v60;
                      
                      {ESLVal l1 = $444;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $443 = _v59.termRef(0);
                      ESLVal $442 = _v59.termRef(1);
                      ESLVal $441 = _v59.termRef(2);
                      
                      {ESLVal _v288 = _v60;
                      
                      {ESLVal l2 = $443;
                      
                      {ESLVal n2 = $442;
                      
                      {ESLVal args2 = $441;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                      
                      {ESLVal _v287 = _v60;
                      
                      {ESLVal f = $440;
                      
                      return typeEqual.apply(_v287,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $439 = _v59.termRef(0);
                      ESLVal $438 = _v59.termRef(1);
                      ESLVal $437 = _v59.termRef(2);
                      
                      {ESLVal _v285 = _v60;
                      
                      {ESLVal l2 = $439;
                      
                      {ESLVal n2 = $438;
                      
                      {ESLVal _v286 = $437;
                      
                      return typeEqual.apply(_v285,substType.apply(new ESLVal("RecType",l2,n2,_v286),n2,_v286));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $436 = _v59.termRef(0);
                      ESLVal $435 = _v59.termRef(1);
                      ESLVal $434 = _v59.termRef(2);
                      
                      {ESLVal _v283 = _v60;
                      
                      {ESLVal l1 = $436;
                      
                      {ESLVal ns2 = $435;
                      
                      {ESLVal _v284 = $434;
                      
                      return typeEqual.apply(_v283,_v284);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v292 = _v60;
                      
                      {ESLVal _v293 = _v59;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($526.isNil())
                  switch($522.termName) {
                    case "SetType": {ESLVal $530 = $522.termRef(0);
                      ESLVal $529 = $522.termRef(1);
                      
                      switch($529.termName) {
                      case "VarType": {ESLVal $532 = $529.termRef(0);
                        ESLVal $531 = $529.termRef(1);
                        
                        {ESLVal l1 = $521;
                        
                        {ESLVal _v294 = $520;
                        
                        {ESLVal l2 = $524;
                        
                        {ESLVal v1 = $525;
                        
                        {ESLVal l3 = $530;
                        
                        {ESLVal l4 = $532;
                        
                        {ESLVal v2 = $531;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v59.termName) {
                            case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                              ESLVal $450 = _v59.termRef(1);
                              ESLVal $449 = _v59.termRef(2);
                              
                              {ESLVal _v308 = _v60;
                              
                              {ESLVal l = $451;
                              
                              {ESLVal op = $450;
                              
                              {ESLVal args = $449;
                              
                              return typeEqual.apply(_v308,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                              ESLVal $447 = _v59.termRef(1);
                              ESLVal $446 = _v59.termRef(2);
                              ESLVal $445 = _v59.termRef(3);
                              
                              {ESLVal _v305 = _v60;
                              
                              {ESLVal _v306 = $448;
                              
                              {ESLVal _v307 = $447;
                              
                              {ESLVal ds2 = $446;
                              
                              {ESLVal ms2 = $445;
                              
                              return typeEqual.apply(_v305,flattenAct.apply(_v306,_v307,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $444 = _v59.termRef(0);
                              
                              {ESLVal t = _v60;
                              
                              {ESLVal _v304 = $444;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $443 = _v59.termRef(0);
                              ESLVal $442 = _v59.termRef(1);
                              ESLVal $441 = _v59.termRef(2);
                              
                              {ESLVal _v302 = _v60;
                              
                              {ESLVal _v303 = $443;
                              
                              {ESLVal n2 = $442;
                              
                              {ESLVal args2 = $441;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                              
                              {ESLVal _v301 = _v60;
                              
                              {ESLVal f = $440;
                              
                              return typeEqual.apply(_v301,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $439 = _v59.termRef(0);
                              ESLVal $438 = _v59.termRef(1);
                              ESLVal $437 = _v59.termRef(2);
                              
                              {ESLVal _v298 = _v60;
                              
                              {ESLVal _v299 = $439;
                              
                              {ESLVal n2 = $438;
                              
                              {ESLVal _v300 = $437;
                              
                              return typeEqual.apply(_v298,substType.apply(new ESLVal("RecType",_v299,n2,_v300),n2,_v300));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $436 = _v59.termRef(0);
                              ESLVal $435 = _v59.termRef(1);
                              ESLVal $434 = _v59.termRef(2);
                              
                              {ESLVal _v295 = _v60;
                              
                              {ESLVal _v296 = $436;
                              
                              {ESLVal ns2 = $435;
                              
                              {ESLVal _v297 = $434;
                              
                              return typeEqual.apply(_v295,_v297);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v309 = _v60;
                              
                              {ESLVal _v310 = _v59;
                              
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
                      default: switch(_v59.termName) {
                        case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                          ESLVal $450 = _v59.termRef(1);
                          ESLVal $449 = _v59.termRef(2);
                          
                          {ESLVal _v319 = _v60;
                          
                          {ESLVal l = $451;
                          
                          {ESLVal op = $450;
                          
                          {ESLVal args = $449;
                          
                          return typeEqual.apply(_v319,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                          ESLVal $447 = _v59.termRef(1);
                          ESLVal $446 = _v59.termRef(2);
                          ESLVal $445 = _v59.termRef(3);
                          
                          {ESLVal _v317 = _v60;
                          
                          {ESLVal l2 = $448;
                          
                          {ESLVal _v318 = $447;
                          
                          {ESLVal ds2 = $446;
                          
                          {ESLVal ms2 = $445;
                          
                          return typeEqual.apply(_v317,flattenAct.apply(l2,_v318,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $444 = _v59.termRef(0);
                          
                          {ESLVal t = _v60;
                          
                          {ESLVal l1 = $444;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $443 = _v59.termRef(0);
                          ESLVal $442 = _v59.termRef(1);
                          ESLVal $441 = _v59.termRef(2);
                          
                          {ESLVal _v316 = _v60;
                          
                          {ESLVal l2 = $443;
                          
                          {ESLVal n2 = $442;
                          
                          {ESLVal args2 = $441;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                          
                          {ESLVal _v315 = _v60;
                          
                          {ESLVal f = $440;
                          
                          return typeEqual.apply(_v315,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $439 = _v59.termRef(0);
                          ESLVal $438 = _v59.termRef(1);
                          ESLVal $437 = _v59.termRef(2);
                          
                          {ESLVal _v313 = _v60;
                          
                          {ESLVal l2 = $439;
                          
                          {ESLVal n2 = $438;
                          
                          {ESLVal _v314 = $437;
                          
                          return typeEqual.apply(_v313,substType.apply(new ESLVal("RecType",l2,n2,_v314),n2,_v314));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $436 = _v59.termRef(0);
                          ESLVal $435 = _v59.termRef(1);
                          ESLVal $434 = _v59.termRef(2);
                          
                          {ESLVal _v311 = _v60;
                          
                          {ESLVal l1 = $436;
                          
                          {ESLVal ns2 = $435;
                          
                          {ESLVal _v312 = $434;
                          
                          return typeEqual.apply(_v311,_v312);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v320 = _v60;
                          
                          {ESLVal _v321 = _v59;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v59.termName) {
                      case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                        ESLVal $450 = _v59.termRef(1);
                        ESLVal $449 = _v59.termRef(2);
                        
                        {ESLVal _v330 = _v60;
                        
                        {ESLVal l = $451;
                        
                        {ESLVal op = $450;
                        
                        {ESLVal args = $449;
                        
                        return typeEqual.apply(_v330,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                        ESLVal $447 = _v59.termRef(1);
                        ESLVal $446 = _v59.termRef(2);
                        ESLVal $445 = _v59.termRef(3);
                        
                        {ESLVal _v328 = _v60;
                        
                        {ESLVal l2 = $448;
                        
                        {ESLVal _v329 = $447;
                        
                        {ESLVal ds2 = $446;
                        
                        {ESLVal ms2 = $445;
                        
                        return typeEqual.apply(_v328,flattenAct.apply(l2,_v329,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $444 = _v59.termRef(0);
                        
                        {ESLVal t = _v60;
                        
                        {ESLVal l1 = $444;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $443 = _v59.termRef(0);
                        ESLVal $442 = _v59.termRef(1);
                        ESLVal $441 = _v59.termRef(2);
                        
                        {ESLVal _v327 = _v60;
                        
                        {ESLVal l2 = $443;
                        
                        {ESLVal n2 = $442;
                        
                        {ESLVal args2 = $441;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                        
                        {ESLVal _v326 = _v60;
                        
                        {ESLVal f = $440;
                        
                        return typeEqual.apply(_v326,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $439 = _v59.termRef(0);
                        ESLVal $438 = _v59.termRef(1);
                        ESLVal $437 = _v59.termRef(2);
                        
                        {ESLVal _v324 = _v60;
                        
                        {ESLVal l2 = $439;
                        
                        {ESLVal n2 = $438;
                        
                        {ESLVal _v325 = $437;
                        
                        return typeEqual.apply(_v324,substType.apply(new ESLVal("RecType",l2,n2,_v325),n2,_v325));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $436 = _v59.termRef(0);
                        ESLVal $435 = _v59.termRef(1);
                        ESLVal $434 = _v59.termRef(2);
                        
                        {ESLVal _v322 = _v60;
                        
                        {ESLVal l1 = $436;
                        
                        {ESLVal ns2 = $435;
                        
                        {ESLVal _v323 = $434;
                        
                        return typeEqual.apply(_v322,_v323);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v331 = _v60;
                        
                        {ESLVal _v332 = _v59;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v59.termName) {
                    case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                      ESLVal $450 = _v59.termRef(1);
                      ESLVal $449 = _v59.termRef(2);
                      
                      {ESLVal _v341 = _v60;
                      
                      {ESLVal l = $451;
                      
                      {ESLVal op = $450;
                      
                      {ESLVal args = $449;
                      
                      return typeEqual.apply(_v341,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                      ESLVal $447 = _v59.termRef(1);
                      ESLVal $446 = _v59.termRef(2);
                      ESLVal $445 = _v59.termRef(3);
                      
                      {ESLVal _v339 = _v60;
                      
                      {ESLVal l2 = $448;
                      
                      {ESLVal _v340 = $447;
                      
                      {ESLVal ds2 = $446;
                      
                      {ESLVal ms2 = $445;
                      
                      return typeEqual.apply(_v339,flattenAct.apply(l2,_v340,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $444 = _v59.termRef(0);
                      
                      {ESLVal t = _v60;
                      
                      {ESLVal l1 = $444;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $443 = _v59.termRef(0);
                      ESLVal $442 = _v59.termRef(1);
                      ESLVal $441 = _v59.termRef(2);
                      
                      {ESLVal _v338 = _v60;
                      
                      {ESLVal l2 = $443;
                      
                      {ESLVal n2 = $442;
                      
                      {ESLVal args2 = $441;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                      
                      {ESLVal _v337 = _v60;
                      
                      {ESLVal f = $440;
                      
                      return typeEqual.apply(_v337,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $439 = _v59.termRef(0);
                      ESLVal $438 = _v59.termRef(1);
                      ESLVal $437 = _v59.termRef(2);
                      
                      {ESLVal _v335 = _v60;
                      
                      {ESLVal l2 = $439;
                      
                      {ESLVal n2 = $438;
                      
                      {ESLVal _v336 = $437;
                      
                      return typeEqual.apply(_v335,substType.apply(new ESLVal("RecType",l2,n2,_v336),n2,_v336));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $436 = _v59.termRef(0);
                      ESLVal $435 = _v59.termRef(1);
                      ESLVal $434 = _v59.termRef(2);
                      
                      {ESLVal _v333 = _v60;
                      
                      {ESLVal l1 = $436;
                      
                      {ESLVal ns2 = $435;
                      
                      {ESLVal _v334 = $434;
                      
                      return typeEqual.apply(_v333,_v334);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v342 = _v60;
                      
                      {ESLVal _v343 = _v59;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($523.isNil())
                switch(_v59.termName) {
                  case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                    ESLVal $450 = _v59.termRef(1);
                    ESLVal $449 = _v59.termRef(2);
                    
                    {ESLVal _v352 = _v60;
                    
                    {ESLVal l = $451;
                    
                    {ESLVal op = $450;
                    
                    {ESLVal args = $449;
                    
                    return typeEqual.apply(_v352,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                    ESLVal $447 = _v59.termRef(1);
                    ESLVal $446 = _v59.termRef(2);
                    ESLVal $445 = _v59.termRef(3);
                    
                    {ESLVal _v350 = _v60;
                    
                    {ESLVal l2 = $448;
                    
                    {ESLVal _v351 = $447;
                    
                    {ESLVal ds2 = $446;
                    
                    {ESLVal ms2 = $445;
                    
                    return typeEqual.apply(_v350,flattenAct.apply(l2,_v351,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $444 = _v59.termRef(0);
                    
                    {ESLVal t = _v60;
                    
                    {ESLVal l1 = $444;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $443 = _v59.termRef(0);
                    ESLVal $442 = _v59.termRef(1);
                    ESLVal $441 = _v59.termRef(2);
                    
                    {ESLVal _v349 = _v60;
                    
                    {ESLVal l2 = $443;
                    
                    {ESLVal n2 = $442;
                    
                    {ESLVal args2 = $441;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                    
                    {ESLVal _v348 = _v60;
                    
                    {ESLVal f = $440;
                    
                    return typeEqual.apply(_v348,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $439 = _v59.termRef(0);
                    ESLVal $438 = _v59.termRef(1);
                    ESLVal $437 = _v59.termRef(2);
                    
                    {ESLVal _v346 = _v60;
                    
                    {ESLVal l2 = $439;
                    
                    {ESLVal n2 = $438;
                    
                    {ESLVal _v347 = $437;
                    
                    return typeEqual.apply(_v346,substType.apply(new ESLVal("RecType",l2,n2,_v347),n2,_v347));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $436 = _v59.termRef(0);
                    ESLVal $435 = _v59.termRef(1);
                    ESLVal $434 = _v59.termRef(2);
                    
                    {ESLVal _v344 = _v60;
                    
                    {ESLVal l1 = $436;
                    
                    {ESLVal ns2 = $435;
                    
                    {ESLVal _v345 = $434;
                    
                    return typeEqual.apply(_v344,_v345);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v353 = _v60;
                    
                    {ESLVal _v354 = _v59;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v59.termName) {
                  case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                    ESLVal $450 = _v59.termRef(1);
                    ESLVal $449 = _v59.termRef(2);
                    
                    {ESLVal _v363 = _v60;
                    
                    {ESLVal l = $451;
                    
                    {ESLVal op = $450;
                    
                    {ESLVal args = $449;
                    
                    return typeEqual.apply(_v363,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                    ESLVal $447 = _v59.termRef(1);
                    ESLVal $446 = _v59.termRef(2);
                    ESLVal $445 = _v59.termRef(3);
                    
                    {ESLVal _v361 = _v60;
                    
                    {ESLVal l2 = $448;
                    
                    {ESLVal _v362 = $447;
                    
                    {ESLVal ds2 = $446;
                    
                    {ESLVal ms2 = $445;
                    
                    return typeEqual.apply(_v361,flattenAct.apply(l2,_v362,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $444 = _v59.termRef(0);
                    
                    {ESLVal t = _v60;
                    
                    {ESLVal l1 = $444;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $443 = _v59.termRef(0);
                    ESLVal $442 = _v59.termRef(1);
                    ESLVal $441 = _v59.termRef(2);
                    
                    {ESLVal _v360 = _v60;
                    
                    {ESLVal l2 = $443;
                    
                    {ESLVal n2 = $442;
                    
                    {ESLVal args2 = $441;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                    
                    {ESLVal _v359 = _v60;
                    
                    {ESLVal f = $440;
                    
                    return typeEqual.apply(_v359,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $439 = _v59.termRef(0);
                    ESLVal $438 = _v59.termRef(1);
                    ESLVal $437 = _v59.termRef(2);
                    
                    {ESLVal _v357 = _v60;
                    
                    {ESLVal l2 = $439;
                    
                    {ESLVal n2 = $438;
                    
                    {ESLVal _v358 = $437;
                    
                    return typeEqual.apply(_v357,substType.apply(new ESLVal("RecType",l2,n2,_v358),n2,_v358));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $436 = _v59.termRef(0);
                    ESLVal $435 = _v59.termRef(1);
                    ESLVal $434 = _v59.termRef(2);
                    
                    {ESLVal _v355 = _v60;
                    
                    {ESLVal l1 = $436;
                    
                    {ESLVal ns2 = $435;
                    
                    {ESLVal _v356 = $434;
                    
                    return typeEqual.apply(_v355,_v356);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v364 = _v60;
                    
                    {ESLVal _v365 = _v59;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v376 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v376,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v374 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v375 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v374,flattenAct.apply(l2,_v375,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v373 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v372 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v372,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v370 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v371 = $437;
                  
                  return typeEqual.apply(_v370,substType.apply(new ESLVal("RecType",l2,n2,_v371),n2,_v371));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v368 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v369 = $434;
                  
                  return typeEqual.apply(_v368,_v369);
                }
                }
                }
                }
                }
                default: {ESLVal _v377 = _v60;
                  
                  {ESLVal _v378 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "StrType": {ESLVal $518 = _v60.termRef(0);
              
              switch(_v59.termName) {
              case "StrType": {ESLVal $519 = _v59.termRef(0);
                
                {ESLVal l1 = $518;
                
                {ESLVal l2 = $519;
                
                return $true;
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v280 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v280,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v278 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v279 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v278,flattenAct.apply(l2,_v279,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v277 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v276 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v276,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v274 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v275 = $437;
                  
                  return typeEqual.apply(_v274,substType.apply(new ESLVal("RecType",l2,n2,_v275),n2,_v275));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v272 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v273 = $434;
                  
                  return typeEqual.apply(_v272,_v273);
                }
                }
                }
                }
                }
                default: {ESLVal _v281 = _v60;
                  
                  {ESLVal _v282 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VoidType": {ESLVal $517 = _v60.termRef(0);
              
              {ESLVal l1 = $517;
              
              {ESLVal t = _v59;
              
              return $true;
            }
            }
            }
          case "FieldType": {ESLVal $513 = _v60.termRef(0);
              ESLVal $512 = _v60.termRef(1);
              ESLVal $511 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "FieldType": {ESLVal $516 = _v59.termRef(0);
                ESLVal $515 = _v59.termRef(1);
                ESLVal $514 = _v59.termRef(2);
                
                {ESLVal l1 = $513;
                
                {ESLVal n1 = $512;
                
                {ESLVal _v259 = $511;
                
                {ESLVal l2 = $516;
                
                {ESLVal n2 = $515;
                
                {ESLVal _v260 = $514;
                
                return n1.eql(n2).and(typeEqual.apply(_v259,_v260));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v269 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v269,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v267 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v268 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v267,flattenAct.apply(l2,_v268,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v266 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v265 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v265,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v263 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v264 = $437;
                  
                  return typeEqual.apply(_v263,substType.apply(new ESLVal("RecType",l2,n2,_v264),n2,_v264));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v261 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v262 = $434;
                  
                  return typeEqual.apply(_v261,_v262);
                }
                }
                }
                }
                }
                default: {ESLVal _v270 = _v60;
                  
                  {ESLVal _v271 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TableType": {ESLVal $507 = _v60.termRef(0);
              ESLVal $506 = _v60.termRef(1);
              ESLVal $505 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "TableType": {ESLVal $510 = _v59.termRef(0);
                ESLVal $509 = _v59.termRef(1);
                ESLVal $508 = _v59.termRef(2);
                
                {ESLVal l1 = $507;
                
                {ESLVal k1 = $506;
                
                {ESLVal v1 = $505;
                
                {ESLVal l2 = $510;
                
                {ESLVal k2 = $509;
                
                {ESLVal v2 = $508;
                
                return typeEqual.apply(k1,k2).and(typeEqual.apply(v1,v2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v256 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v256,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v254 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v255 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v254,flattenAct.apply(l2,_v255,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v253 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v252 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v252,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v250 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v251 = $437;
                  
                  return typeEqual.apply(_v250,substType.apply(new ESLVal("RecType",l2,n2,_v251),n2,_v251));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v248 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v249 = $434;
                  
                  return typeEqual.apply(_v248,_v249);
                }
                }
                }
                }
                }
                default: {ESLVal _v257 = _v60;
                  
                  {ESLVal _v258 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $501 = _v60.termRef(0);
              ESLVal $500 = _v60.termRef(1);
              ESLVal $499 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "TermType": {ESLVal $504 = _v59.termRef(0);
                ESLVal $503 = _v59.termRef(1);
                ESLVal $502 = _v59.termRef(2);
                
                {ESLVal l1 = $501;
                
                {ESLVal n1 = $500;
                
                {ESLVal args1 = $499;
                
                {ESLVal l2 = $504;
                
                {ESLVal n2 = $503;
                
                {ESLVal args2 = $502;
                
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
              default: {ESLVal l1 = $501;
                
                {ESLVal n1 = $500;
                
                {ESLVal args1 = $499;
                
                {ESLVal _v247 = _v59;
                
                return $false;
              }
              }
              }
              }
            }
            }
          case "FunType": {ESLVal $495 = _v60.termRef(0);
              ESLVal $494 = _v60.termRef(1);
              ESLVal $493 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "FunType": {ESLVal $498 = _v59.termRef(0);
                ESLVal $497 = _v59.termRef(1);
                ESLVal $496 = _v59.termRef(2);
                
                {ESLVal l1 = $495;
                
                {ESLVal d1 = $494;
                
                {ESLVal r1 = $493;
                
                {ESLVal l2 = $498;
                
                {ESLVal d2 = $497;
                
                {ESLVal r2 = $496;
                
                return typeEqual.apply(r1,r2).and(typesEqual.apply(d1,d2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v244 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v244,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v242 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v243 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v242,flattenAct.apply(l2,_v243,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v241 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v240 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v240,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v238 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v239 = $437;
                  
                  return typeEqual.apply(_v238,substType.apply(new ESLVal("RecType",l2,n2,_v239),n2,_v239));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v236 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v237 = $434;
                  
                  return typeEqual.apply(_v236,_v237);
                }
                }
                }
                }
                }
                default: {ESLVal _v245 = _v60;
                  
                  {ESLVal _v246 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $492 = _v60.termRef(0);
              
              {ESLVal f = $492;
              
              {ESLVal _v235 = _v59;
              
              return typeEqual.apply(f.apply(),_v235);
            }
            }
            }
          case "RecordType": {ESLVal $489 = _v60.termRef(0);
              ESLVal $488 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "RecordType": {ESLVal $491 = _v59.termRef(0);
                ESLVal $490 = _v59.termRef(1);
                
                {ESLVal l1 = $489;
                
                {ESLVal fs1 = $488;
                
                {ESLVal l2 = $491;
                
                {ESLVal fs2 = $490;
                
                return recordTypeEqual.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v232 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v232,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v230 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v231 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v230,flattenAct.apply(l2,_v231,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v229 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v228 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v228,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v226 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v227 = $437;
                  
                  return typeEqual.apply(_v226,substType.apply(new ESLVal("RecType",l2,n2,_v227),n2,_v227));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v224 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v225 = $434;
                  
                  return typeEqual.apply(_v224,_v225);
                }
                }
                }
                }
                }
                default: {ESLVal _v233 = _v60;
                  
                  {ESLVal _v234 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $484 = _v60.termRef(0);
              ESLVal $483 = _v60.termRef(1);
              ESLVal $482 = _v60.termRef(2);
              
              switch(_v59.termName) {
              case "RecType": {ESLVal $487 = _v59.termRef(0);
                ESLVal $486 = _v59.termRef(1);
                ESLVal $485 = _v59.termRef(2);
                
                {ESLVal l1 = $484;
                
                {ESLVal n1 = $483;
                
                {ESLVal _v216 = $482;
                
                {ESLVal l2 = $487;
                
                {ESLVal n2 = $486;
                
                {ESLVal _v217 = $485;
                
                if(n1.eql(n2).boolVal)
                return typeEqual.apply(_v216,_v217);
                else
                  {ESLVal _v218 = $484;
                    
                    {ESLVal _v219 = $483;
                    
                    {ESLVal _v220 = $482;
                    
                    {ESLVal _v221 = _v59;
                    
                    return typeEqual.apply(substType.apply(new ESLVal("RecType",_v218,_v219,_v220),_v219,_v220),_v221);
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
              default: {ESLVal l1 = $484;
                
                {ESLVal n1 = $483;
                
                {ESLVal _v222 = $482;
                
                {ESLVal _v223 = _v59;
                
                return typeEqual.apply(substType.apply(new ESLVal("RecType",l1,n1,_v222),n1,_v222),_v223);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $479 = _v60.termRef(0);
              ESLVal $478 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "UnionType": {ESLVal $481 = _v59.termRef(0);
                ESLVal $480 = _v59.termRef(1);
                
                {ESLVal l1 = $479;
                
                {ESLVal terms1 = $478;
                
                {ESLVal l2 = $481;
                
                {ESLVal terms2 = $480;
                
                return typeSetEqual.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v213 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v213,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v211 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v212 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v211,flattenAct.apply(l2,_v212,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v210 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v209 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v209,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v207 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v208 = $437;
                  
                  return typeEqual.apply(_v207,substType.apply(new ESLVal("RecType",l2,n2,_v208),n2,_v208));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v205 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v206 = $434;
                  
                  return typeEqual.apply(_v205,_v206);
                }
                }
                }
                }
                }
                default: {ESLVal _v214 = _v60;
                  
                  {ESLVal _v215 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $475 = _v60.termRef(0);
              ESLVal $474 = _v60.termRef(1);
              
              switch(_v59.termName) {
              case "VarType": {ESLVal $477 = _v59.termRef(0);
                ESLVal $476 = _v59.termRef(1);
                
                {ESLVal l1 = $475;
                
                {ESLVal n1 = $474;
                
                {ESLVal l2 = $477;
                
                {ESLVal n2 = $476;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v59.termName) {
                case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                  ESLVal $450 = _v59.termRef(1);
                  ESLVal $449 = _v59.termRef(2);
                  
                  {ESLVal _v202 = _v60;
                  
                  {ESLVal l = $451;
                  
                  {ESLVal op = $450;
                  
                  {ESLVal args = $449;
                  
                  return typeEqual.apply(_v202,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                  ESLVal $447 = _v59.termRef(1);
                  ESLVal $446 = _v59.termRef(2);
                  ESLVal $445 = _v59.termRef(3);
                  
                  {ESLVal _v200 = _v60;
                  
                  {ESLVal l2 = $448;
                  
                  {ESLVal _v201 = $447;
                  
                  {ESLVal ds2 = $446;
                  
                  {ESLVal ms2 = $445;
                  
                  return typeEqual.apply(_v200,flattenAct.apply(l2,_v201,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $444 = _v59.termRef(0);
                  
                  {ESLVal t = _v60;
                  
                  {ESLVal l1 = $444;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $443 = _v59.termRef(0);
                  ESLVal $442 = _v59.termRef(1);
                  ESLVal $441 = _v59.termRef(2);
                  
                  {ESLVal _v199 = _v60;
                  
                  {ESLVal l2 = $443;
                  
                  {ESLVal n2 = $442;
                  
                  {ESLVal args2 = $441;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                  
                  {ESLVal _v198 = _v60;
                  
                  {ESLVal f = $440;
                  
                  return typeEqual.apply(_v198,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $439 = _v59.termRef(0);
                  ESLVal $438 = _v59.termRef(1);
                  ESLVal $437 = _v59.termRef(2);
                  
                  {ESLVal _v196 = _v60;
                  
                  {ESLVal l2 = $439;
                  
                  {ESLVal n2 = $438;
                  
                  {ESLVal _v197 = $437;
                  
                  return typeEqual.apply(_v196,substType.apply(new ESLVal("RecType",l2,n2,_v197),n2,_v197));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $436 = _v59.termRef(0);
                  ESLVal $435 = _v59.termRef(1);
                  ESLVal $434 = _v59.termRef(2);
                  
                  {ESLVal _v194 = _v60;
                  
                  {ESLVal l1 = $436;
                  
                  {ESLVal ns2 = $435;
                  
                  {ESLVal _v195 = $434;
                  
                  return typeEqual.apply(_v194,_v195);
                }
                }
                }
                }
                }
                default: {ESLVal _v203 = _v60;
                  
                  {ESLVal _v204 = _v59;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $454 = _v60.termRef(0);
              ESLVal $453 = _v60.termRef(1);
              ESLVal $452 = _v60.termRef(2);
              
              if($453.isCons())
              {ESLVal $458 = $453.head();
                ESLVal $459 = $453.tail();
                
                if($459.isCons())
                {ESLVal $460 = $459.head();
                  ESLVal $461 = $459.tail();
                  
                  switch(_v59.termName) {
                  case "ForallType": {ESLVal $457 = _v59.termRef(0);
                    ESLVal $456 = _v59.termRef(1);
                    ESLVal $455 = _v59.termRef(2);
                    
                    {ESLVal l1 = $454;
                    
                    {ESLVal ns1 = $453;
                    
                    {ESLVal _v142 = $452;
                    
                    {ESLVal l2 = $457;
                    
                    {ESLVal ns2 = $456;
                    
                    {ESLVal _v143 = $455;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v142,_v143));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $454;
                    
                    {ESLVal ns1 = $453;
                    
                    {ESLVal _v144 = $452;
                    
                    {ESLVal _v145 = _v59;
                    
                    return typeEqual.apply(_v144,_v145);
                  }
                  }
                  }
                  }
                }
                }
              else if($459.isNil())
                switch($452.termName) {
                  case "ListType": {ESLVal $469 = $452.termRef(0);
                    ESLVal $468 = $452.termRef(1);
                    
                    switch($468.termName) {
                    case "VarType": {ESLVal $471 = $468.termRef(0);
                      ESLVal $470 = $468.termRef(1);
                      
                      switch(_v59.termName) {
                      case "ListType": {ESLVal $473 = _v59.termRef(0);
                        ESLVal $472 = _v59.termRef(1);
                        
                        {ESLVal l2 = $454;
                        
                        {ESLVal v1 = $458;
                        
                        {ESLVal l3 = $469;
                        
                        {ESLVal l4 = $471;
                        
                        {ESLVal v2 = $470;
                        
                        {ESLVal l1 = $473;
                        
                        {ESLVal _v162 = $472;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v59.termName) {
                            case "ForallType": {ESLVal $457 = _v59.termRef(0);
                              ESLVal $456 = _v59.termRef(1);
                              ESLVal $455 = _v59.termRef(2);
                              
                              {ESLVal _v163 = $454;
                              
                              {ESLVal ns1 = $453;
                              
                              {ESLVal _v164 = $452;
                              
                              {ESLVal _v165 = $457;
                              
                              {ESLVal ns2 = $456;
                              
                              {ESLVal _v166 = $455;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v164,_v166));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v167 = $454;
                              
                              {ESLVal ns1 = $453;
                              
                              {ESLVal _v168 = $452;
                              
                              {ESLVal _v169 = _v59;
                              
                              return typeEqual.apply(_v168,_v169);
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
                      default: switch(_v59.termName) {
                        case "ForallType": {ESLVal $457 = _v59.termRef(0);
                          ESLVal $456 = _v59.termRef(1);
                          ESLVal $455 = _v59.termRef(2);
                          
                          {ESLVal l1 = $454;
                          
                          {ESLVal ns1 = $453;
                          
                          {ESLVal _v170 = $452;
                          
                          {ESLVal l2 = $457;
                          
                          {ESLVal ns2 = $456;
                          
                          {ESLVal _v171 = $455;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v170,_v171));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $454;
                          
                          {ESLVal ns1 = $453;
                          
                          {ESLVal _v172 = $452;
                          
                          {ESLVal _v173 = _v59;
                          
                          return typeEqual.apply(_v172,_v173);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v59.termName) {
                      case "ForallType": {ESLVal $457 = _v59.termRef(0);
                        ESLVal $456 = _v59.termRef(1);
                        ESLVal $455 = _v59.termRef(2);
                        
                        {ESLVal l1 = $454;
                        
                        {ESLVal ns1 = $453;
                        
                        {ESLVal _v174 = $452;
                        
                        {ESLVal l2 = $457;
                        
                        {ESLVal ns2 = $456;
                        
                        {ESLVal _v175 = $455;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v174,_v175));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $454;
                        
                        {ESLVal ns1 = $453;
                        
                        {ESLVal _v176 = $452;
                        
                        {ESLVal _v177 = _v59;
                        
                        return typeEqual.apply(_v176,_v177);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                case "SetType": {ESLVal $463 = $452.termRef(0);
                    ESLVal $462 = $452.termRef(1);
                    
                    switch($462.termName) {
                    case "VarType": {ESLVal $465 = $462.termRef(0);
                      ESLVal $464 = $462.termRef(1);
                      
                      switch(_v59.termName) {
                      case "SetType": {ESLVal $467 = _v59.termRef(0);
                        ESLVal $466 = _v59.termRef(1);
                        
                        {ESLVal l2 = $454;
                        
                        {ESLVal v1 = $458;
                        
                        {ESLVal l3 = $463;
                        
                        {ESLVal l4 = $465;
                        
                        {ESLVal v2 = $464;
                        
                        {ESLVal l1 = $467;
                        
                        {ESLVal _v146 = $466;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v59.termName) {
                            case "ForallType": {ESLVal $457 = _v59.termRef(0);
                              ESLVal $456 = _v59.termRef(1);
                              ESLVal $455 = _v59.termRef(2);
                              
                              {ESLVal _v147 = $454;
                              
                              {ESLVal ns1 = $453;
                              
                              {ESLVal _v148 = $452;
                              
                              {ESLVal _v149 = $457;
                              
                              {ESLVal ns2 = $456;
                              
                              {ESLVal _v150 = $455;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v148,_v150));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v151 = $454;
                              
                              {ESLVal ns1 = $453;
                              
                              {ESLVal _v152 = $452;
                              
                              {ESLVal _v153 = _v59;
                              
                              return typeEqual.apply(_v152,_v153);
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
                      default: switch(_v59.termName) {
                        case "ForallType": {ESLVal $457 = _v59.termRef(0);
                          ESLVal $456 = _v59.termRef(1);
                          ESLVal $455 = _v59.termRef(2);
                          
                          {ESLVal l1 = $454;
                          
                          {ESLVal ns1 = $453;
                          
                          {ESLVal _v154 = $452;
                          
                          {ESLVal l2 = $457;
                          
                          {ESLVal ns2 = $456;
                          
                          {ESLVal _v155 = $455;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v154,_v155));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $454;
                          
                          {ESLVal ns1 = $453;
                          
                          {ESLVal _v156 = $452;
                          
                          {ESLVal _v157 = _v59;
                          
                          return typeEqual.apply(_v156,_v157);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v59.termName) {
                      case "ForallType": {ESLVal $457 = _v59.termRef(0);
                        ESLVal $456 = _v59.termRef(1);
                        ESLVal $455 = _v59.termRef(2);
                        
                        {ESLVal l1 = $454;
                        
                        {ESLVal ns1 = $453;
                        
                        {ESLVal _v158 = $452;
                        
                        {ESLVal l2 = $457;
                        
                        {ESLVal ns2 = $456;
                        
                        {ESLVal _v159 = $455;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v158,_v159));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $454;
                        
                        {ESLVal ns1 = $453;
                        
                        {ESLVal _v160 = $452;
                        
                        {ESLVal _v161 = _v59;
                        
                        return typeEqual.apply(_v160,_v161);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v59.termName) {
                    case "ForallType": {ESLVal $457 = _v59.termRef(0);
                      ESLVal $456 = _v59.termRef(1);
                      ESLVal $455 = _v59.termRef(2);
                      
                      {ESLVal l1 = $454;
                      
                      {ESLVal ns1 = $453;
                      
                      {ESLVal _v178 = $452;
                      
                      {ESLVal l2 = $457;
                      
                      {ESLVal ns2 = $456;
                      
                      {ESLVal _v179 = $455;
                      
                      return ns1.eql(ns2).and(typeEqual.apply(_v178,_v179));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $454;
                      
                      {ESLVal ns1 = $453;
                      
                      {ESLVal _v180 = $452;
                      
                      {ESLVal _v181 = _v59;
                      
                      return typeEqual.apply(_v180,_v181);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v59.termName) {
                  case "ForallType": {ESLVal $457 = _v59.termRef(0);
                    ESLVal $456 = _v59.termRef(1);
                    ESLVal $455 = _v59.termRef(2);
                    
                    {ESLVal l1 = $454;
                    
                    {ESLVal ns1 = $453;
                    
                    {ESLVal _v182 = $452;
                    
                    {ESLVal l2 = $457;
                    
                    {ESLVal ns2 = $456;
                    
                    {ESLVal _v183 = $455;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v182,_v183));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $454;
                    
                    {ESLVal ns1 = $453;
                    
                    {ESLVal _v184 = $452;
                    
                    {ESLVal _v185 = _v59;
                    
                    return typeEqual.apply(_v184,_v185);
                  }
                  }
                  }
                  }
                }
              }
            else if($453.isNil())
              switch(_v59.termName) {
                case "ForallType": {ESLVal $457 = _v59.termRef(0);
                  ESLVal $456 = _v59.termRef(1);
                  ESLVal $455 = _v59.termRef(2);
                  
                  {ESLVal l1 = $454;
                  
                  {ESLVal ns1 = $453;
                  
                  {ESLVal _v186 = $452;
                  
                  {ESLVal l2 = $457;
                  
                  {ESLVal ns2 = $456;
                  
                  {ESLVal _v187 = $455;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v186,_v187));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $454;
                  
                  {ESLVal ns1 = $453;
                  
                  {ESLVal _v188 = $452;
                  
                  {ESLVal _v189 = _v59;
                  
                  return typeEqual.apply(_v188,_v189);
                }
                }
                }
                }
              }
            else switch(_v59.termName) {
                case "ForallType": {ESLVal $457 = _v59.termRef(0);
                  ESLVal $456 = _v59.termRef(1);
                  ESLVal $455 = _v59.termRef(2);
                  
                  {ESLVal l1 = $454;
                  
                  {ESLVal ns1 = $453;
                  
                  {ESLVal _v190 = $452;
                  
                  {ESLVal l2 = $457;
                  
                  {ESLVal ns2 = $456;
                  
                  {ESLVal _v191 = $455;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v190,_v191));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $454;
                  
                  {ESLVal ns1 = $453;
                  
                  {ESLVal _v192 = $452;
                  
                  {ESLVal _v193 = _v59;
                  
                  return typeEqual.apply(_v192,_v193);
                }
                }
                }
                }
              }
            }
            default: switch(_v59.termName) {
              case "ApplyTypeFun": {ESLVal $451 = _v59.termRef(0);
                ESLVal $450 = _v59.termRef(1);
                ESLVal $449 = _v59.termRef(2);
                
                {ESLVal _v556 = _v60;
                
                {ESLVal l = $451;
                
                {ESLVal op = $450;
                
                {ESLVal args = $449;
                
                return typeEqual.apply(_v556,applyTypeFun.apply(l,forceType.apply(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $448 = _v59.termRef(0);
                ESLVal $447 = _v59.termRef(1);
                ESLVal $446 = _v59.termRef(2);
                ESLVal $445 = _v59.termRef(3);
                
                {ESLVal _v554 = _v60;
                
                {ESLVal l2 = $448;
                
                {ESLVal _v555 = $447;
                
                {ESLVal ds2 = $446;
                
                {ESLVal ms2 = $445;
                
                return typeEqual.apply(_v554,flattenAct.apply(l2,_v555,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $444 = _v59.termRef(0);
                
                {ESLVal t = _v60;
                
                {ESLVal l1 = $444;
                
                return $true;
              }
              }
              }
            case "TermType": {ESLVal $443 = _v59.termRef(0);
                ESLVal $442 = _v59.termRef(1);
                ESLVal $441 = _v59.termRef(2);
                
                {ESLVal _v553 = _v60;
                
                {ESLVal l2 = $443;
                
                {ESLVal n2 = $442;
                
                {ESLVal args2 = $441;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $440 = _v59.termRef(0);
                
                {ESLVal _v552 = _v60;
                
                {ESLVal f = $440;
                
                return typeEqual.apply(_v552,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $439 = _v59.termRef(0);
                ESLVal $438 = _v59.termRef(1);
                ESLVal $437 = _v59.termRef(2);
                
                {ESLVal _v550 = _v60;
                
                {ESLVal l2 = $439;
                
                {ESLVal n2 = $438;
                
                {ESLVal _v551 = $437;
                
                return typeEqual.apply(_v550,substType.apply(new ESLVal("RecType",l2,n2,_v551),n2,_v551));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $436 = _v59.termRef(0);
                ESLVal $435 = _v59.termRef(1);
                ESLVal $434 = _v59.termRef(2);
                
                {ESLVal _v548 = _v60;
                
                {ESLVal l1 = $436;
                
                {ESLVal ns2 = $435;
                
                {ESLVal _v549 = $434;
                
                return typeEqual.apply(_v548,_v549);
              }
              }
              }
              }
              }
              default: {ESLVal _v557 = _v60;
                
                {ESLVal _v558 = _v59;
                
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
          {ESLVal _v58 = sub;
            ESLVal _v57 = parent;
            
            switch(_v58.termName) {
            case "ActType": {ESLVal $430 = _v58.termRef(0);
              ESLVal $429 = _v58.termRef(1);
              ESLVal $428 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "ActType": {ESLVal $433 = _v57.termRef(0);
                ESLVal $432 = _v57.termRef(1);
                ESLVal $431 = _v57.termRef(2);
                
                {ESLVal l1 = $430;
                
                {ESLVal exports1 = $429;
                
                {ESLVal handlers1 = $428;
                
                {ESLVal l2 = $433;
                
                {ESLVal exports2 = $432;
                
                {ESLVal handlers2 = $431;
                
                return actSubType.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ExtendedAct": {ESLVal $427 = _v58.termRef(0);
              ESLVal $426 = _v58.termRef(1);
              ESLVal $425 = _v58.termRef(2);
              ESLVal $424 = _v58.termRef(3);
              
              {ESLVal l1 = $427;
              
              {ESLVal t1 = $426;
              
              {ESLVal ds1 = $425;
              
              {ESLVal ms1 = $424;
              
              {ESLVal t2 = _v57;
              
              return subType.apply(flattenAct.apply(l1,t1,ds1,ms1),t2);
            }
            }
            }
            }
            }
            }
          case "ListType": {ESLVal $410 = _v58.termRef(0);
              ESLVal $409 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "ListType": {ESLVal $423 = _v57.termRef(0);
                ESLVal $422 = _v57.termRef(1);
                
                {ESLVal l1 = $410;
                
                {ESLVal t1 = $409;
                
                {ESLVal l2 = $423;
                
                {ESLVal t2 = $422;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $413 = _v57.termRef(0);
                ESLVal $412 = _v57.termRef(1);
                ESLVal $411 = _v57.termRef(2);
                
                if($412.isCons())
                {ESLVal $414 = $412.head();
                  ESLVal $415 = $412.tail();
                  
                  if($415.isCons())
                  {ESLVal $416 = $415.head();
                    ESLVal $417 = $415.tail();
                    
                    switch(_v57.termName) {
                    case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                      ESLVal $335 = _v57.termRef(1);
                      ESLVal $334 = _v57.termRef(2);
                      ESLVal $333 = _v57.termRef(3);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $336;
                      
                      {ESLVal t2 = $335;
                      
                      {ESLVal ds2 = $334;
                      
                      {ESLVal ms2 = $333;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal f = $332;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $331 = _v57.termRef(0);
                      ESLVal $330 = _v57.termRef(1);
                      ESLVal $329 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $331;
                      
                      {ESLVal n2 = $330;
                      
                      {ESLVal t2 = $329;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $328 = _v57.termRef(0);
                      ESLVal $327 = _v57.termRef(1);
                      ESLVal $326 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l1 = $328;
                      
                      {ESLVal ns2 = $327;
                      
                      {ESLVal t2 = $326;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v58;
                      
                      {ESLVal t2 = _v57;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                  }
                else if($415.isNil())
                  switch($411.termName) {
                    case "ListType": {ESLVal $419 = $411.termRef(0);
                      ESLVal $418 = $411.termRef(1);
                      
                      switch($418.termName) {
                      case "VarType": {ESLVal $421 = $418.termRef(0);
                        ESLVal $420 = $418.termRef(1);
                        
                        {ESLVal l1 = $410;
                        
                        {ESLVal t1 = $409;
                        
                        {ESLVal l2 = $413;
                        
                        {ESLVal v1 = $414;
                        
                        {ESLVal l3 = $419;
                        
                        {ESLVal l4 = $421;
                        
                        {ESLVal v2 = $420;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                              ESLVal $335 = _v57.termRef(1);
                              ESLVal $334 = _v57.termRef(2);
                              ESLVal $333 = _v57.termRef(3);
                              
                              {ESLVal _v139 = _v58;
                              
                              {ESLVal _v140 = $336;
                              
                              {ESLVal t2 = $335;
                              
                              {ESLVal ds2 = $334;
                              
                              {ESLVal ms2 = $333;
                              
                              return subType.apply(_v139,flattenAct.apply(_v140,t2,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                              
                              {ESLVal _v138 = _v58;
                              
                              {ESLVal f = $332;
                              
                              return subType.apply(_v138,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $331 = _v57.termRef(0);
                              ESLVal $330 = _v57.termRef(1);
                              ESLVal $329 = _v57.termRef(2);
                              
                              {ESLVal _v136 = _v58;
                              
                              {ESLVal _v137 = $331;
                              
                              {ESLVal n2 = $330;
                              
                              {ESLVal t2 = $329;
                              
                              return subType.apply(_v136,substType.apply(new ESLVal("RecType",_v137,n2,t2),n2,t2));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $328 = _v57.termRef(0);
                              ESLVal $327 = _v57.termRef(1);
                              ESLVal $326 = _v57.termRef(2);
                              
                              {ESLVal _v134 = _v58;
                              
                              {ESLVal _v135 = $328;
                              
                              {ESLVal ns2 = $327;
                              
                              {ESLVal t2 = $326;
                              
                              return subType.apply(_v134,t2);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v141 = _v58;
                              
                              {ESLVal t2 = _v57;
                              
                              return typeEqual.apply(_v141,t2);
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
                        case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                          ESLVal $335 = _v57.termRef(1);
                          ESLVal $334 = _v57.termRef(2);
                          ESLVal $333 = _v57.termRef(3);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l2 = $336;
                          
                          {ESLVal t2 = $335;
                          
                          {ESLVal ds2 = $334;
                          
                          {ESLVal ms2 = $333;
                          
                          return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal f = $332;
                          
                          return subType.apply(t1,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $331 = _v57.termRef(0);
                          ESLVal $330 = _v57.termRef(1);
                          ESLVal $329 = _v57.termRef(2);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l2 = $331;
                          
                          {ESLVal n2 = $330;
                          
                          {ESLVal t2 = $329;
                          
                          return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $328 = _v57.termRef(0);
                          ESLVal $327 = _v57.termRef(1);
                          ESLVal $326 = _v57.termRef(2);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l1 = $328;
                          
                          {ESLVal ns2 = $327;
                          
                          {ESLVal t2 = $326;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v58;
                          
                          {ESLVal t2 = _v57;
                          
                          return typeEqual.apply(t1,t2);
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                        ESLVal $335 = _v57.termRef(1);
                        ESLVal $334 = _v57.termRef(2);
                        ESLVal $333 = _v57.termRef(3);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l2 = $336;
                        
                        {ESLVal t2 = $335;
                        
                        {ESLVal ds2 = $334;
                        
                        {ESLVal ms2 = $333;
                        
                        return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal f = $332;
                        
                        return subType.apply(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $331 = _v57.termRef(0);
                        ESLVal $330 = _v57.termRef(1);
                        ESLVal $329 = _v57.termRef(2);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l2 = $331;
                        
                        {ESLVal n2 = $330;
                        
                        {ESLVal t2 = $329;
                        
                        return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $328 = _v57.termRef(0);
                        ESLVal $327 = _v57.termRef(1);
                        ESLVal $326 = _v57.termRef(2);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l1 = $328;
                        
                        {ESLVal ns2 = $327;
                        
                        {ESLVal t2 = $326;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v58;
                        
                        {ESLVal t2 = _v57;
                        
                        return typeEqual.apply(t1,t2);
                      }
                      }
                    }
                  }
                else switch(_v57.termName) {
                    case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                      ESLVal $335 = _v57.termRef(1);
                      ESLVal $334 = _v57.termRef(2);
                      ESLVal $333 = _v57.termRef(3);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $336;
                      
                      {ESLVal t2 = $335;
                      
                      {ESLVal ds2 = $334;
                      
                      {ESLVal ms2 = $333;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal f = $332;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $331 = _v57.termRef(0);
                      ESLVal $330 = _v57.termRef(1);
                      ESLVal $329 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $331;
                      
                      {ESLVal n2 = $330;
                      
                      {ESLVal t2 = $329;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $328 = _v57.termRef(0);
                      ESLVal $327 = _v57.termRef(1);
                      ESLVal $326 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l1 = $328;
                      
                      {ESLVal ns2 = $327;
                      
                      {ESLVal t2 = $326;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v58;
                      
                      {ESLVal t2 = _v57;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                }
              else if($412.isNil())
                switch(_v57.termName) {
                  case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                    ESLVal $335 = _v57.termRef(1);
                    ESLVal $334 = _v57.termRef(2);
                    ESLVal $333 = _v57.termRef(3);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $336;
                    
                    {ESLVal t2 = $335;
                    
                    {ESLVal ds2 = $334;
                    
                    {ESLVal ms2 = $333;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal f = $332;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $331 = _v57.termRef(0);
                    ESLVal $330 = _v57.termRef(1);
                    ESLVal $329 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $331;
                    
                    {ESLVal n2 = $330;
                    
                    {ESLVal t2 = $329;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $328 = _v57.termRef(0);
                    ESLVal $327 = _v57.termRef(1);
                    ESLVal $326 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l1 = $328;
                    
                    {ESLVal ns2 = $327;
                    
                    {ESLVal t2 = $326;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v58;
                    
                    {ESLVal t2 = _v57;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              else switch(_v57.termName) {
                  case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                    ESLVal $335 = _v57.termRef(1);
                    ESLVal $334 = _v57.termRef(2);
                    ESLVal $333 = _v57.termRef(3);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $336;
                    
                    {ESLVal t2 = $335;
                    
                    {ESLVal ds2 = $334;
                    
                    {ESLVal ms2 = $333;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal f = $332;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $331 = _v57.termRef(0);
                    ESLVal $330 = _v57.termRef(1);
                    ESLVal $329 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $331;
                    
                    {ESLVal n2 = $330;
                    
                    {ESLVal t2 = $329;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $328 = _v57.termRef(0);
                    ESLVal $327 = _v57.termRef(1);
                    ESLVal $326 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l1 = $328;
                    
                    {ESLVal ns2 = $327;
                    
                    {ESLVal t2 = $326;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v58;
                    
                    {ESLVal t2 = _v57;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $406 = _v58.termRef(0);
              ESLVal $405 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "BagType": {ESLVal $408 = _v57.termRef(0);
                ESLVal $407 = _v57.termRef(1);
                
                {ESLVal l1 = $406;
                
                {ESLVal t1 = $405;
                
                {ESLVal l2 = $408;
                
                {ESLVal t2 = $407;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $391 = _v58.termRef(0);
              ESLVal $390 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "SetType": {ESLVal $404 = _v57.termRef(0);
                ESLVal $403 = _v57.termRef(1);
                
                {ESLVal l1 = $391;
                
                {ESLVal t1 = $390;
                
                {ESLVal l2 = $404;
                
                {ESLVal t2 = $403;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $394 = _v57.termRef(0);
                ESLVal $393 = _v57.termRef(1);
                ESLVal $392 = _v57.termRef(2);
                
                if($393.isCons())
                {ESLVal $395 = $393.head();
                  ESLVal $396 = $393.tail();
                  
                  if($396.isCons())
                  {ESLVal $397 = $396.head();
                    ESLVal $398 = $396.tail();
                    
                    switch(_v57.termName) {
                    case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                      ESLVal $335 = _v57.termRef(1);
                      ESLVal $334 = _v57.termRef(2);
                      ESLVal $333 = _v57.termRef(3);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $336;
                      
                      {ESLVal t2 = $335;
                      
                      {ESLVal ds2 = $334;
                      
                      {ESLVal ms2 = $333;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal f = $332;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $331 = _v57.termRef(0);
                      ESLVal $330 = _v57.termRef(1);
                      ESLVal $329 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $331;
                      
                      {ESLVal n2 = $330;
                      
                      {ESLVal t2 = $329;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $328 = _v57.termRef(0);
                      ESLVal $327 = _v57.termRef(1);
                      ESLVal $326 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l1 = $328;
                      
                      {ESLVal ns2 = $327;
                      
                      {ESLVal t2 = $326;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v58;
                      
                      {ESLVal t2 = _v57;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                  }
                else if($396.isNil())
                  switch($392.termName) {
                    case "SetType": {ESLVal $400 = $392.termRef(0);
                      ESLVal $399 = $392.termRef(1);
                      
                      switch($399.termName) {
                      case "VarType": {ESLVal $402 = $399.termRef(0);
                        ESLVal $401 = $399.termRef(1);
                        
                        {ESLVal l1 = $391;
                        
                        {ESLVal t1 = $390;
                        
                        {ESLVal l2 = $394;
                        
                        {ESLVal v1 = $395;
                        
                        {ESLVal l3 = $400;
                        
                        {ESLVal l4 = $402;
                        
                        {ESLVal v2 = $401;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                              ESLVal $335 = _v57.termRef(1);
                              ESLVal $334 = _v57.termRef(2);
                              ESLVal $333 = _v57.termRef(3);
                              
                              {ESLVal _v131 = _v58;
                              
                              {ESLVal _v132 = $336;
                              
                              {ESLVal t2 = $335;
                              
                              {ESLVal ds2 = $334;
                              
                              {ESLVal ms2 = $333;
                              
                              return subType.apply(_v131,flattenAct.apply(_v132,t2,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                              
                              {ESLVal _v130 = _v58;
                              
                              {ESLVal f = $332;
                              
                              return subType.apply(_v130,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $331 = _v57.termRef(0);
                              ESLVal $330 = _v57.termRef(1);
                              ESLVal $329 = _v57.termRef(2);
                              
                              {ESLVal _v128 = _v58;
                              
                              {ESLVal _v129 = $331;
                              
                              {ESLVal n2 = $330;
                              
                              {ESLVal t2 = $329;
                              
                              return subType.apply(_v128,substType.apply(new ESLVal("RecType",_v129,n2,t2),n2,t2));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $328 = _v57.termRef(0);
                              ESLVal $327 = _v57.termRef(1);
                              ESLVal $326 = _v57.termRef(2);
                              
                              {ESLVal _v126 = _v58;
                              
                              {ESLVal _v127 = $328;
                              
                              {ESLVal ns2 = $327;
                              
                              {ESLVal t2 = $326;
                              
                              return subType.apply(_v126,t2);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v133 = _v58;
                              
                              {ESLVal t2 = _v57;
                              
                              return typeEqual.apply(_v133,t2);
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
                        case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                          ESLVal $335 = _v57.termRef(1);
                          ESLVal $334 = _v57.termRef(2);
                          ESLVal $333 = _v57.termRef(3);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l2 = $336;
                          
                          {ESLVal t2 = $335;
                          
                          {ESLVal ds2 = $334;
                          
                          {ESLVal ms2 = $333;
                          
                          return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal f = $332;
                          
                          return subType.apply(t1,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $331 = _v57.termRef(0);
                          ESLVal $330 = _v57.termRef(1);
                          ESLVal $329 = _v57.termRef(2);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l2 = $331;
                          
                          {ESLVal n2 = $330;
                          
                          {ESLVal t2 = $329;
                          
                          return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $328 = _v57.termRef(0);
                          ESLVal $327 = _v57.termRef(1);
                          ESLVal $326 = _v57.termRef(2);
                          
                          {ESLVal t1 = _v58;
                          
                          {ESLVal l1 = $328;
                          
                          {ESLVal ns2 = $327;
                          
                          {ESLVal t2 = $326;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v58;
                          
                          {ESLVal t2 = _v57;
                          
                          return typeEqual.apply(t1,t2);
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                        ESLVal $335 = _v57.termRef(1);
                        ESLVal $334 = _v57.termRef(2);
                        ESLVal $333 = _v57.termRef(3);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l2 = $336;
                        
                        {ESLVal t2 = $335;
                        
                        {ESLVal ds2 = $334;
                        
                        {ESLVal ms2 = $333;
                        
                        return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal f = $332;
                        
                        return subType.apply(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $331 = _v57.termRef(0);
                        ESLVal $330 = _v57.termRef(1);
                        ESLVal $329 = _v57.termRef(2);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l2 = $331;
                        
                        {ESLVal n2 = $330;
                        
                        {ESLVal t2 = $329;
                        
                        return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $328 = _v57.termRef(0);
                        ESLVal $327 = _v57.termRef(1);
                        ESLVal $326 = _v57.termRef(2);
                        
                        {ESLVal t1 = _v58;
                        
                        {ESLVal l1 = $328;
                        
                        {ESLVal ns2 = $327;
                        
                        {ESLVal t2 = $326;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v58;
                        
                        {ESLVal t2 = _v57;
                        
                        return typeEqual.apply(t1,t2);
                      }
                      }
                    }
                  }
                else switch(_v57.termName) {
                    case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                      ESLVal $335 = _v57.termRef(1);
                      ESLVal $334 = _v57.termRef(2);
                      ESLVal $333 = _v57.termRef(3);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $336;
                      
                      {ESLVal t2 = $335;
                      
                      {ESLVal ds2 = $334;
                      
                      {ESLVal ms2 = $333;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal f = $332;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $331 = _v57.termRef(0);
                      ESLVal $330 = _v57.termRef(1);
                      ESLVal $329 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l2 = $331;
                      
                      {ESLVal n2 = $330;
                      
                      {ESLVal t2 = $329;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $328 = _v57.termRef(0);
                      ESLVal $327 = _v57.termRef(1);
                      ESLVal $326 = _v57.termRef(2);
                      
                      {ESLVal t1 = _v58;
                      
                      {ESLVal l1 = $328;
                      
                      {ESLVal ns2 = $327;
                      
                      {ESLVal t2 = $326;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v58;
                      
                      {ESLVal t2 = _v57;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                }
              else if($393.isNil())
                switch(_v57.termName) {
                  case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                    ESLVal $335 = _v57.termRef(1);
                    ESLVal $334 = _v57.termRef(2);
                    ESLVal $333 = _v57.termRef(3);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $336;
                    
                    {ESLVal t2 = $335;
                    
                    {ESLVal ds2 = $334;
                    
                    {ESLVal ms2 = $333;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal f = $332;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $331 = _v57.termRef(0);
                    ESLVal $330 = _v57.termRef(1);
                    ESLVal $329 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $331;
                    
                    {ESLVal n2 = $330;
                    
                    {ESLVal t2 = $329;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $328 = _v57.termRef(0);
                    ESLVal $327 = _v57.termRef(1);
                    ESLVal $326 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l1 = $328;
                    
                    {ESLVal ns2 = $327;
                    
                    {ESLVal t2 = $326;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v58;
                    
                    {ESLVal t2 = _v57;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              else switch(_v57.termName) {
                  case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                    ESLVal $335 = _v57.termRef(1);
                    ESLVal $334 = _v57.termRef(2);
                    ESLVal $333 = _v57.termRef(3);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $336;
                    
                    {ESLVal t2 = $335;
                    
                    {ESLVal ds2 = $334;
                    
                    {ESLVal ms2 = $333;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal f = $332;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $331 = _v57.termRef(0);
                    ESLVal $330 = _v57.termRef(1);
                    ESLVal $329 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l2 = $331;
                    
                    {ESLVal n2 = $330;
                    
                    {ESLVal t2 = $329;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $328 = _v57.termRef(0);
                    ESLVal $327 = _v57.termRef(1);
                    ESLVal $326 = _v57.termRef(2);
                    
                    {ESLVal t1 = _v58;
                    
                    {ESLVal l1 = $328;
                    
                    {ESLVal ns2 = $327;
                    
                    {ESLVal t2 = $326;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v58;
                    
                    {ESLVal t2 = _v57;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $386 = _v58.termRef(0);
              ESLVal $385 = _v58.termRef(1);
              ESLVal $384 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "TermType": {ESLVal $389 = _v57.termRef(0);
                ESLVal $388 = _v57.termRef(1);
                ESLVal $387 = _v57.termRef(2);
                
                {ESLVal l1 = $386;
                
                {ESLVal n1 = $385;
                
                {ESLVal args1 = $384;
                
                {ESLVal l2 = $389;
                
                {ESLVal n2 = $388;
                
                {ESLVal args2 = $387;
                
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
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "FunType": {ESLVal $380 = _v58.termRef(0);
              ESLVal $379 = _v58.termRef(1);
              ESLVal $378 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "FunType": {ESLVal $383 = _v57.termRef(0);
                ESLVal $382 = _v57.termRef(1);
                ESLVal $381 = _v57.termRef(2);
                
                {ESLVal l1 = $380;
                
                {ESLVal d1 = $379;
                
                {ESLVal r1 = $378;
                
                {ESLVal l2 = $383;
                
                {ESLVal d2 = $382;
                
                {ESLVal r2 = $381;
                
                return subType.apply(r1,r2).and(subTypes.apply(d2,d1));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $377 = _v58.termRef(0);
              
              {ESLVal f = $377;
              
              {ESLVal t2 = _v57;
              
              return subType.apply(f.apply(),t2);
            }
            }
            }
          case "RecordType": {ESLVal $374 = _v58.termRef(0);
              ESLVal $373 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "RecordType": {ESLVal $376 = _v57.termRef(0);
                ESLVal $375 = _v57.termRef(1);
                
                {ESLVal l1 = $374;
                
                {ESLVal fs1 = $373;
                
                {ESLVal l2 = $376;
                
                {ESLVal fs2 = $375;
                
                return recordSubType.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $369 = _v58.termRef(0);
              ESLVal $368 = _v58.termRef(1);
              ESLVal $367 = _v58.termRef(2);
              
              switch(_v57.termName) {
              case "RecType": {ESLVal $372 = _v57.termRef(0);
                ESLVal $371 = _v57.termRef(1);
                ESLVal $370 = _v57.termRef(2);
                
                {ESLVal l1 = $369;
                
                {ESLVal n1 = $368;
                
                {ESLVal t1 = $367;
                
                {ESLVal l2 = $372;
                
                {ESLVal n2 = $371;
                
                {ESLVal t2 = $370;
                
                if(n1.eql(n2).boolVal)
                return subType.apply(t1,t2);
                else
                  {ESLVal _v122 = $369;
                    
                    {ESLVal _v123 = $368;
                    
                    {ESLVal _v124 = $367;
                    
                    {ESLVal _v125 = _v57;
                    
                    return subType.apply(substType.apply(new ESLVal("RecType",_v122,_v123,_v124),_v123,_v124),_v125);
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
              default: {ESLVal l1 = $369;
                
                {ESLVal n1 = $368;
                
                {ESLVal t1 = $367;
                
                {ESLVal t2 = _v57;
                
                return subType.apply(substType.apply(new ESLVal("RecType",l1,n1,t1),n1,t1),t2);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $364 = _v58.termRef(0);
              ESLVal $363 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "UnionType": {ESLVal $366 = _v57.termRef(0);
                ESLVal $365 = _v57.termRef(1);
                
                {ESLVal l1 = $364;
                
                {ESLVal terms1 = $363;
                
                {ESLVal l2 = $366;
                
                {ESLVal terms2 = $365;
                
                return subTypes.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $360 = _v58.termRef(0);
              ESLVal $359 = _v58.termRef(1);
              
              switch(_v57.termName) {
              case "VarType": {ESLVal $362 = _v57.termRef(0);
                ESLVal $361 = _v57.termRef(1);
                
                {ESLVal l1 = $360;
                
                {ESLVal n1 = $359;
                
                {ESLVal l2 = $362;
                
                {ESLVal n2 = $361;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v57.termName) {
                case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                  ESLVal $335 = _v57.termRef(1);
                  ESLVal $334 = _v57.termRef(2);
                  ESLVal $333 = _v57.termRef(3);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $336;
                  
                  {ESLVal t2 = $335;
                  
                  {ESLVal ds2 = $334;
                  
                  {ESLVal ms2 = $333;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal f = $332;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $331 = _v57.termRef(0);
                  ESLVal $330 = _v57.termRef(1);
                  ESLVal $329 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l2 = $331;
                  
                  {ESLVal n2 = $330;
                  
                  {ESLVal t2 = $329;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $328 = _v57.termRef(0);
                  ESLVal $327 = _v57.termRef(1);
                  ESLVal $326 = _v57.termRef(2);
                  
                  {ESLVal t1 = _v58;
                  
                  {ESLVal l1 = $328;
                  
                  {ESLVal ns2 = $327;
                  
                  {ESLVal t2 = $326;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v58;
                  
                  {ESLVal t2 = _v57;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $339 = _v58.termRef(0);
              ESLVal $338 = _v58.termRef(1);
              ESLVal $337 = _v58.termRef(2);
              
              if($338.isCons())
              {ESLVal $343 = $338.head();
                ESLVal $344 = $338.tail();
                
                if($344.isCons())
                {ESLVal $345 = $344.head();
                  ESLVal $346 = $344.tail();
                  
                  switch(_v57.termName) {
                  case "ForallType": {ESLVal $342 = _v57.termRef(0);
                    ESLVal $341 = _v57.termRef(1);
                    ESLVal $340 = _v57.termRef(2);
                    
                    {ESLVal l1 = $339;
                    
                    {ESLVal ns1 = $338;
                    
                    {ESLVal t1 = $337;
                    
                    {ESLVal l2 = $342;
                    
                    {ESLVal ns2 = $341;
                    
                    {ESLVal t2 = $340;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $339;
                    
                    {ESLVal ns1 = $338;
                    
                    {ESLVal t1 = $337;
                    
                    {ESLVal t2 = _v57;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
                }
              else if($344.isNil())
                switch($337.termName) {
                  case "ListType": {ESLVal $354 = $337.termRef(0);
                    ESLVal $353 = $337.termRef(1);
                    
                    switch($353.termName) {
                    case "VarType": {ESLVal $356 = $353.termRef(0);
                      ESLVal $355 = $353.termRef(1);
                      
                      switch(_v57.termName) {
                      case "ListType": {ESLVal $358 = _v57.termRef(0);
                        ESLVal $357 = _v57.termRef(1);
                        
                        {ESLVal l2 = $339;
                        
                        {ESLVal v1 = $343;
                        
                        {ESLVal l3 = $354;
                        
                        {ESLVal l4 = $356;
                        
                        {ESLVal v2 = $355;
                        
                        {ESLVal l1 = $358;
                        
                        {ESLVal t1 = $357;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ForallType": {ESLVal $342 = _v57.termRef(0);
                              ESLVal $341 = _v57.termRef(1);
                              ESLVal $340 = _v57.termRef(2);
                              
                              {ESLVal _v117 = $339;
                              
                              {ESLVal ns1 = $338;
                              
                              {ESLVal _v118 = $337;
                              
                              {ESLVal _v119 = $342;
                              
                              {ESLVal ns2 = $341;
                              
                              {ESLVal t2 = $340;
                              
                              return ns1.eql(ns2).and(subType.apply(_v118,t2));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v120 = $339;
                              
                              {ESLVal ns1 = $338;
                              
                              {ESLVal _v121 = $337;
                              
                              {ESLVal t2 = _v57;
                              
                              return subType.apply(_v121,t2);
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
                        case "ForallType": {ESLVal $342 = _v57.termRef(0);
                          ESLVal $341 = _v57.termRef(1);
                          ESLVal $340 = _v57.termRef(2);
                          
                          {ESLVal l1 = $339;
                          
                          {ESLVal ns1 = $338;
                          
                          {ESLVal t1 = $337;
                          
                          {ESLVal l2 = $342;
                          
                          {ESLVal ns2 = $341;
                          
                          {ESLVal t2 = $340;
                          
                          return ns1.eql(ns2).and(subType.apply(t1,t2));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $339;
                          
                          {ESLVal ns1 = $338;
                          
                          {ESLVal t1 = $337;
                          
                          {ESLVal t2 = _v57;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ForallType": {ESLVal $342 = _v57.termRef(0);
                        ESLVal $341 = _v57.termRef(1);
                        ESLVal $340 = _v57.termRef(2);
                        
                        {ESLVal l1 = $339;
                        
                        {ESLVal ns1 = $338;
                        
                        {ESLVal t1 = $337;
                        
                        {ESLVal l2 = $342;
                        
                        {ESLVal ns2 = $341;
                        
                        {ESLVal t2 = $340;
                        
                        return ns1.eql(ns2).and(subType.apply(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $339;
                        
                        {ESLVal ns1 = $338;
                        
                        {ESLVal t1 = $337;
                        
                        {ESLVal t2 = _v57;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                case "SetType": {ESLVal $348 = $337.termRef(0);
                    ESLVal $347 = $337.termRef(1);
                    
                    switch($347.termName) {
                    case "VarType": {ESLVal $350 = $347.termRef(0);
                      ESLVal $349 = $347.termRef(1);
                      
                      switch(_v57.termName) {
                      case "SetType": {ESLVal $352 = _v57.termRef(0);
                        ESLVal $351 = _v57.termRef(1);
                        
                        {ESLVal l2 = $339;
                        
                        {ESLVal v1 = $343;
                        
                        {ESLVal l3 = $348;
                        
                        {ESLVal l4 = $350;
                        
                        {ESLVal v2 = $349;
                        
                        {ESLVal l1 = $352;
                        
                        {ESLVal t1 = $351;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v57.termName) {
                            case "ForallType": {ESLVal $342 = _v57.termRef(0);
                              ESLVal $341 = _v57.termRef(1);
                              ESLVal $340 = _v57.termRef(2);
                              
                              {ESLVal _v112 = $339;
                              
                              {ESLVal ns1 = $338;
                              
                              {ESLVal _v113 = $337;
                              
                              {ESLVal _v114 = $342;
                              
                              {ESLVal ns2 = $341;
                              
                              {ESLVal t2 = $340;
                              
                              return ns1.eql(ns2).and(subType.apply(_v113,t2));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v115 = $339;
                              
                              {ESLVal ns1 = $338;
                              
                              {ESLVal _v116 = $337;
                              
                              {ESLVal t2 = _v57;
                              
                              return subType.apply(_v116,t2);
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
                        case "ForallType": {ESLVal $342 = _v57.termRef(0);
                          ESLVal $341 = _v57.termRef(1);
                          ESLVal $340 = _v57.termRef(2);
                          
                          {ESLVal l1 = $339;
                          
                          {ESLVal ns1 = $338;
                          
                          {ESLVal t1 = $337;
                          
                          {ESLVal l2 = $342;
                          
                          {ESLVal ns2 = $341;
                          
                          {ESLVal t2 = $340;
                          
                          return ns1.eql(ns2).and(subType.apply(t1,t2));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $339;
                          
                          {ESLVal ns1 = $338;
                          
                          {ESLVal t1 = $337;
                          
                          {ESLVal t2 = _v57;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v57.termName) {
                      case "ForallType": {ESLVal $342 = _v57.termRef(0);
                        ESLVal $341 = _v57.termRef(1);
                        ESLVal $340 = _v57.termRef(2);
                        
                        {ESLVal l1 = $339;
                        
                        {ESLVal ns1 = $338;
                        
                        {ESLVal t1 = $337;
                        
                        {ESLVal l2 = $342;
                        
                        {ESLVal ns2 = $341;
                        
                        {ESLVal t2 = $340;
                        
                        return ns1.eql(ns2).and(subType.apply(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $339;
                        
                        {ESLVal ns1 = $338;
                        
                        {ESLVal t1 = $337;
                        
                        {ESLVal t2 = _v57;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v57.termName) {
                    case "ForallType": {ESLVal $342 = _v57.termRef(0);
                      ESLVal $341 = _v57.termRef(1);
                      ESLVal $340 = _v57.termRef(2);
                      
                      {ESLVal l1 = $339;
                      
                      {ESLVal ns1 = $338;
                      
                      {ESLVal t1 = $337;
                      
                      {ESLVal l2 = $342;
                      
                      {ESLVal ns2 = $341;
                      
                      {ESLVal t2 = $340;
                      
                      return ns1.eql(ns2).and(subType.apply(t1,t2));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $339;
                      
                      {ESLVal ns1 = $338;
                      
                      {ESLVal t1 = $337;
                      
                      {ESLVal t2 = _v57;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v57.termName) {
                  case "ForallType": {ESLVal $342 = _v57.termRef(0);
                    ESLVal $341 = _v57.termRef(1);
                    ESLVal $340 = _v57.termRef(2);
                    
                    {ESLVal l1 = $339;
                    
                    {ESLVal ns1 = $338;
                    
                    {ESLVal t1 = $337;
                    
                    {ESLVal l2 = $342;
                    
                    {ESLVal ns2 = $341;
                    
                    {ESLVal t2 = $340;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $339;
                    
                    {ESLVal ns1 = $338;
                    
                    {ESLVal t1 = $337;
                    
                    {ESLVal t2 = _v57;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
              }
            else if($338.isNil())
              switch(_v57.termName) {
                case "ForallType": {ESLVal $342 = _v57.termRef(0);
                  ESLVal $341 = _v57.termRef(1);
                  ESLVal $340 = _v57.termRef(2);
                  
                  {ESLVal l1 = $339;
                  
                  {ESLVal ns1 = $338;
                  
                  {ESLVal t1 = $337;
                  
                  {ESLVal l2 = $342;
                  
                  {ESLVal ns2 = $341;
                  
                  {ESLVal t2 = $340;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $339;
                  
                  {ESLVal ns1 = $338;
                  
                  {ESLVal t1 = $337;
                  
                  {ESLVal t2 = _v57;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            else switch(_v57.termName) {
                case "ForallType": {ESLVal $342 = _v57.termRef(0);
                  ESLVal $341 = _v57.termRef(1);
                  ESLVal $340 = _v57.termRef(2);
                  
                  {ESLVal l1 = $339;
                  
                  {ESLVal ns1 = $338;
                  
                  {ESLVal t1 = $337;
                  
                  {ESLVal l2 = $342;
                  
                  {ESLVal ns2 = $341;
                  
                  {ESLVal t2 = $340;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $339;
                  
                  {ESLVal ns1 = $338;
                  
                  {ESLVal t1 = $337;
                  
                  {ESLVal t2 = _v57;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            }
            default: switch(_v57.termName) {
              case "ExtendedAct": {ESLVal $336 = _v57.termRef(0);
                ESLVal $335 = _v57.termRef(1);
                ESLVal $334 = _v57.termRef(2);
                ESLVal $333 = _v57.termRef(3);
                
                {ESLVal t1 = _v58;
                
                {ESLVal l2 = $336;
                
                {ESLVal t2 = $335;
                
                {ESLVal ds2 = $334;
                
                {ESLVal ms2 = $333;
                
                return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $332 = _v57.termRef(0);
                
                {ESLVal t1 = _v58;
                
                {ESLVal f = $332;
                
                return subType.apply(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $331 = _v57.termRef(0);
                ESLVal $330 = _v57.termRef(1);
                ESLVal $329 = _v57.termRef(2);
                
                {ESLVal t1 = _v58;
                
                {ESLVal l2 = $331;
                
                {ESLVal n2 = $330;
                
                {ESLVal t2 = $329;
                
                return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $328 = _v57.termRef(0);
                ESLVal $327 = _v57.termRef(1);
                ESLVal $326 = _v57.termRef(2);
                
                {ESLVal t1 = _v58;
                
                {ESLVal l1 = $328;
                
                {ESLVal ns2 = $327;
                
                {ESLVal t2 = $326;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: {ESLVal t1 = _v58;
                
                {ESLVal t2 = _v57;
                
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
  {ESLVal _v56 = t;
        
        switch(_v56.termName) {
        case "ActType": {ESLVal $325 = _v56.termRef(0);
          ESLVal $324 = _v56.termRef(1);
          ESLVal $323 = _v56.termRef(2);
          
          {ESLVal l2 = $325;
          
          {ESLVal ds2 = $324;
          
          {ESLVal ms2 = $323;
          
          return new ESLVal("ActType",l1,ds1.add(ds2),ms1.add(ms2));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $322 = _v56.termRef(0);
          ESLVal $321 = _v56.termRef(1);
          ESLVal $320 = _v56.termRef(2);
          ESLVal $319 = _v56.termRef(3);
          
          {ESLVal l2 = $322;
          
          {ESLVal _v110 = $321;
          
          {ESLVal ds2 = $320;
          
          {ESLVal ms2 = $319;
          
          return flattenAct.apply(l1,flattenAct.apply(l2,_v110,ds2,ms2),ds1,ms1);
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $318 = _v56.termRef(0);
          
          {ESLVal f = $318;
          
          return flattenAct.apply(l1,f.apply(),ds1,ms1);
        }
        }
      case "RecType": {ESLVal $317 = _v56.termRef(0);
          ESLVal $316 = _v56.termRef(1);
          ESLVal $315 = _v56.termRef(2);
          
          {ESLVal l2 = $317;
          
          {ESLVal n = $316;
          
          {ESLVal b = $315;
          
          return flattenAct.apply(l1,substType.apply(t,n,b),ds1,ms1);
        }
        }
        }
        }
        default: {ESLVal _v111 = _v56;
          
          return error(new ESLVal("TypeError",l1,new ESLVal("unknown type for flatten ").add(_v111)));
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun150"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun151"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports2);
          }
        }),exports1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun152"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun153"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun154"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun155"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers2);
          }
        }),handlers1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun156"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun157"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun158"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun159"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d1 = $args[0];
              return decSubType.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun160"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun161"),getSelf()) {
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
  {ESLVal _v55 = d1;
        ESLVal _v54 = d2;
        
        switch(_v55.termName) {
        case "Dec": {ESLVal $310 = _v55.termRef(0);
          ESLVal $309 = _v55.termRef(1);
          ESLVal $308 = _v55.termRef(2);
          ESLVal $307 = _v55.termRef(3);
          
          switch(_v54.termName) {
          case "Dec": {ESLVal $314 = _v54.termRef(0);
            ESLVal $313 = _v54.termRef(1);
            ESLVal $312 = _v54.termRef(2);
            ESLVal $311 = _v54.termRef(3);
            
            {ESLVal l1 = $310;
            
            {ESLVal n1 = $309;
            
            {ESLVal t1 = $308;
            
            {ESLVal st1 = $307;
            
            {ESLVal l2 = $314;
            
            {ESLVal n2 = $313;
            
            {ESLVal t2 = $312;
            
            {ESLVal st2 = $311;
            
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
          default: return error(new ESLVal("case error at Pos(19840,19971)").add(ESLVal.list(_v55,_v54)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19840,19971)").add(ESLVal.list(_v55,_v54)));
      }
      }
    }
  });
  private static ESLVal decSubType = new ESLVal(new Function(new ESLVal("decSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v53 = d1;
        ESLVal _v52 = d2;
        
        switch(_v53.termName) {
        case "Dec": {ESLVal $302 = _v53.termRef(0);
          ESLVal $301 = _v53.termRef(1);
          ESLVal $300 = _v53.termRef(2);
          ESLVal $299 = _v53.termRef(3);
          
          switch(_v52.termName) {
          case "Dec": {ESLVal $306 = _v52.termRef(0);
            ESLVal $305 = _v52.termRef(1);
            ESLVal $304 = _v52.termRef(2);
            ESLVal $303 = _v52.termRef(3);
            
            {ESLVal l1 = $302;
            
            {ESLVal n1 = $301;
            
            {ESLVal t1 = $300;
            
            {ESLVal st1 = $299;
            
            {ESLVal l2 = $306;
            
            {ESLVal n2 = $305;
            
            {ESLVal t2 = $304;
            
            {ESLVal st2 = $303;
            
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
          default: return error(new ESLVal("case error at Pos(20015,20144)").add(ESLVal.list(_v53,_v52)));
        }
        }
        default: return error(new ESLVal("case error at Pos(20015,20144)").add(ESLVal.list(_v53,_v52)));
      }
      }
    }
  });
  public static ESLVal equalMessage = new ESLVal(new Function(new ESLVal("equalMessage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v51 = m1;
        ESLVal _v50 = m2;
        
        switch(_v51.termName) {
        case "MessageType": {ESLVal $296 = _v51.termRef(0);
          ESLVal $295 = _v51.termRef(1);
          
          switch(_v50.termName) {
          case "MessageType": {ESLVal $298 = _v50.termRef(0);
            ESLVal $297 = _v50.termRef(1);
            
            {ESLVal l1 = $296;
            
            {ESLVal ts1 = $295;
            
            {ESLVal l2 = $298;
            
            {ESLVal ts2 = $297;
            
            return typesEqual.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20190,20300)").add(ESLVal.list(_v51,_v50)));
        }
        }
        default: return error(new ESLVal("case error at Pos(20190,20300)").add(ESLVal.list(_v51,_v50)));
      }
      }
    }
  });
  private static ESLVal messSubType = new ESLVal(new Function(new ESLVal("messSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v49 = m1;
        ESLVal _v48 = m2;
        
        switch(_v49.termName) {
        case "MessageType": {ESLVal $292 = _v49.termRef(0);
          ESLVal $291 = _v49.termRef(1);
          
          switch(_v48.termName) {
          case "MessageType": {ESLVal $294 = _v48.termRef(0);
            ESLVal $293 = _v48.termRef(1);
            
            {ESLVal l1 = $292;
            
            {ESLVal ts1 = $291;
            
            {ESLVal l2 = $294;
            
            {ESLVal ts2 = $293;
            
            return subTypes.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20345,20453)").add(ESLVal.list(_v49,_v48)));
        }
        }
        default: return error(new ESLVal("case error at Pos(20345,20453)").add(ESLVal.list(_v49,_v48)));
      }
      }
    }
  });
  public static ESLVal recordTypeEqual = new ESLVal(new Function(new ESLVal("recordTypeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun162"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun163"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return decName.apply(t1).eql(decName.apply(t2)).and(typeEqual.apply(decType.apply(t1),decType.apply(t2)));
                }
              }),fields2);
          }
        }),fields1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun164"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun165"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return decName.apply(t1).eql(decName.apply(t2)).and(typeEqual.apply(decType.apply(t1),decType.apply(t2)));
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun166"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun167"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t1 = $args[0];
              return decName.apply(t1).eql(decName.apply(t2)).and(subType.apply(decType.apply(t1),decType.apply(t2)));
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
  {ESLVal _v47 = op;
        
        switch(_v47.termName) {
        case "RecType": {ESLVal $290 = _v47.termRef(0);
          ESLVal $289 = _v47.termRef(1);
          ESLVal $288 = _v47.termRef(2);
          
          {ESLVal lr = $290;
          
          {ESLVal n = $289;
          
          {ESLVal t = $288;
          
          return applyTypeFun.apply(l,unfoldType.apply(lr,n,t),args);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $287 = _v47.termRef(0);
          ESLVal $286 = _v47.termRef(1);
          ESLVal $285 = _v47.termRef(2);
          
          {ESLVal _v108 = $287;
          
          {ESLVal names = $286;
          
          {ESLVal t = $285;
          
          if(length.apply(args).eql(length.apply(names)).boolVal)
          return substTypeEnv.apply(zipTypeEnv.apply(names,args),t);
          else
            return error(new ESLVal("TypeError",_v108,new ESLVal("type fun expects ").add(length.apply(names).add(new ESLVal(" args, but supplied with ").add(length.apply(args))))));
        }
        }
        }
        }
        default: {ESLVal _v109 = _v47;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(_v109)));
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
  {ESLVal _v46 = t;
        
        switch(_v46.termName) {
        case "TypeClosure": {ESLVal $284 = _v46.termRef(0);
          
          {ESLVal f = $284;
          
          return forceType.apply(f.apply());
        }
        }
        default: {ESLVal _v107 = _v46;
          
          return _v107;
        }
      }
      }
    }
  });
  public static ESLVal typesEqual = new ESLVal(new Function(new ESLVal("typesEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v45 = ts1;
        ESLVal _v44 = ts2;
        
        if(_v45.isCons())
        {ESLVal $278 = _v45.head();
          ESLVal $279 = _v45.tail();
          
          if(_v44.isCons())
          {ESLVal $280 = _v44.head();
            ESLVal $281 = _v44.tail();
            
            {ESLVal t1 = $278;
            
            {ESLVal _v100 = $279;
            
            {ESLVal t2 = $280;
            
            {ESLVal _v101 = $281;
            
            return typeEqual.apply(t1,t2).and(typesEqual.apply(_v100,_v101));
          }
          }
          }
          }
          }
        else if(_v44.isNil())
          if(_v44.isCons())
            {ESLVal $276 = _v44.head();
              ESLVal $277 = _v44.tail();
              
              return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
            }
          else if(_v44.isNil())
            {ESLVal _v102 = _v45;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
        else if(_v44.isCons())
            {ESLVal $276 = _v44.head();
              ESLVal $277 = _v44.tail();
              
              return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
            }
          else if(_v44.isNil())
            {ESLVal _v103 = _v45;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
        }
      else if(_v45.isNil())
        if(_v44.isCons())
          {ESLVal $282 = _v44.head();
            ESLVal $283 = _v44.tail();
            
            {ESLVal _v104 = _v44;
            
            return $false;
          }
          }
        else if(_v44.isNil())
          return $true;
        else {ESLVal _v105 = _v44;
            
            return $false;
          }
      else if(_v44.isCons())
          {ESLVal $276 = _v44.head();
            ESLVal $277 = _v44.tail();
            
            return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
          }
        else if(_v44.isNil())
          {ESLVal _v106 = _v45;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(21755,21965)").add(ESLVal.list(_v45,_v44)));
      }
    }
  });
  public static ESLVal subTypes = new ESLVal(new Function(new ESLVal("subTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v43 = ts1;
        ESLVal _v42 = ts2;
        
        if(_v43.isCons())
        {ESLVal $270 = _v43.head();
          ESLVal $271 = _v43.tail();
          
          if(_v42.isCons())
          {ESLVal $272 = _v42.head();
            ESLVal $273 = _v42.tail();
            
            {ESLVal t1 = $270;
            
            {ESLVal _v93 = $271;
            
            {ESLVal t2 = $272;
            
            {ESLVal _v94 = $273;
            
            return subType.apply(t1,t2).and(subTypes.apply(_v93,_v94));
          }
          }
          }
          }
          }
        else if(_v42.isNil())
          if(_v42.isCons())
            {ESLVal $268 = _v42.head();
              ESLVal $269 = _v42.tail();
              
              return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
            }
          else if(_v42.isNil())
            {ESLVal _v95 = _v43;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
        else if(_v42.isCons())
            {ESLVal $268 = _v42.head();
              ESLVal $269 = _v42.tail();
              
              return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
            }
          else if(_v42.isNil())
            {ESLVal _v96 = _v43;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
        }
      else if(_v43.isNil())
        if(_v42.isCons())
          {ESLVal $274 = _v42.head();
            ESLVal $275 = _v42.tail();
            
            {ESLVal _v97 = _v42;
            
            return $false;
          }
          }
        else if(_v42.isNil())
          return $true;
        else {ESLVal _v98 = _v42;
            
            return $false;
          }
      else if(_v42.isCons())
          {ESLVal $268 = _v42.head();
            ESLVal $269 = _v42.tail();
            
            return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
          }
        else if(_v42.isNil())
          {ESLVal _v99 = _v43;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(22011,22217)").add(ESLVal.list(_v43,_v42)));
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
  {ESLVal _v41 = sub;
        
        if(_v41.isCons())
        {ESLVal $266 = _v41.head();
          ESLVal $267 = _v41.tail();
          
          {ESLVal t = $266;
          
          {ESLVal _v92 = $267;
          
          return typeMember.apply(t,sup).and(typeSubset.apply(_v92,sup));
        }
        }
        }
      else if(_v41.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(22377,22483)").add(ESLVal.list(_v41)));
      }
    }
  });
  public static ESLVal typeMember = new ESLVal(new Function(new ESLVal("typeMember"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v40 = types;
        
        if(_v40.isCons())
        {ESLVal $264 = _v40.head();
          ESLVal $265 = _v40.tail();
          
          {ESLVal tt = $264;
          
          {ESLVal _v89 = $265;
          
          if(typeEqual.apply(t,tt).boolVal)
          return $true;
          else
            {ESLVal _v90 = $264;
              
              {ESLVal _v91 = $265;
              
              return typeMember.apply(t,_v91);
            }
            }
        }
        }
        }
      else if(_v40.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(22529,22676)").add(ESLVal.list(_v40)));
      }
    }
  });
  public static ESLVal substTypes = new ESLVal(new Function(new ESLVal("substTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldTypes = $args[2];
  {ESLVal _v39 = oldTypes;
        
        if(_v39.isCons())
        {ESLVal $262 = _v39.head();
          ESLVal $263 = _v39.tail();
          
          {ESLVal t = $262;
          
          {ESLVal ts = $263;
          
          return substTypes.apply(newType,n,ts).cons(substType.apply(newType,n,t));
        }
        }
        }
      else if(_v39.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(22828,22948)").add(ESLVal.list(_v39)));
      }
    }
  });
  public static ESLVal substType = new ESLVal(new Function(new ESLVal("substType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldType = $args[2];
  {ESLVal _v33 = oldType;
        
        switch(_v33.termName) {
        case "ApplyType": {ESLVal $257 = _v33.termRef(0);
          ESLVal $256 = _v33.termRef(1);
          ESLVal $255 = _v33.termRef(2);
          
          {ESLVal l = $257;
          
          {ESLVal m = $256;
          
          {ESLVal types = $255;
          
          if(m.eql(n).boolVal)
          return new ESLVal("ApplyTypeFun",l,newType,substTypes.apply(newType,n,types));
          else
            return new ESLVal("ApplyType",l,m,substTypes.apply(newType,n,types));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $254 = _v33.termRef(0);
          ESLVal $253 = _v33.termRef(1);
          ESLVal $252 = _v33.termRef(2);
          
          {ESLVal l = $254;
          
          {ESLVal op = $253;
          
          {ESLVal args = $252;
          
          return new ESLVal("ApplyTypeFun",l,substType.apply(newType,n,op),substTypes.apply(newType,n,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $251 = _v33.termRef(0);
          ESLVal $250 = _v33.termRef(1);
          ESLVal $249 = _v33.termRef(2);
          
          {ESLVal l = $251;
          
          {ESLVal decs = $250;
          
          {ESLVal handlers = $249;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v37 = $qualArg;
                
                {ESLVal d = _v37;
                
                return ESLVal.list(ESLVal.list(substDec.apply(newType,n,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v38 = $qualArg;
                
                {ESLVal m = _v38;
                
                return ESLVal.list(ESLVal.list(substMType.apply(newType,n,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ArrayType": {ESLVal $248 = _v33.termRef(0);
          ESLVal $247 = _v33.termRef(1);
          
          {ESLVal l = $248;
          
          {ESLVal t = $247;
          
          return new ESLVal("ArrayType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "BoolType": {ESLVal $246 = _v33.termRef(0);
          
          {ESLVal l = $246;
          
          return oldType;
        }
        }
      case "ExtendedAct": {ESLVal $245 = _v33.termRef(0);
          ESLVal $244 = _v33.termRef(1);
          ESLVal $243 = _v33.termRef(2);
          ESLVal $242 = _v33.termRef(3);
          
          {ESLVal l = $245;
          
          {ESLVal parent = $244;
          
          {ESLVal decs = $243;
          
          {ESLVal ms = $242;
          
          return new ESLVal("ExtendedAct",l,substType.apply(newType,n,parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
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
          }).map(ms).flatten().flatten());
        }
        }
        }
        }
        }
      case "FloatType": {ESLVal $241 = _v33.termRef(0);
          
          {ESLVal l = $241;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $240 = _v33.termRef(0);
          ESLVal $239 = _v33.termRef(1);
          ESLVal $238 = _v33.termRef(2);
          
          {ESLVal l = $240;
          
          {ESLVal ns = $239;
          
          {ESLVal t = $238;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("ForallType",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $237 = _v33.termRef(0);
          ESLVal $236 = _v33.termRef(1);
          ESLVal $235 = _v33.termRef(2);
          
          {ESLVal l = $237;
          
          {ESLVal d = $236;
          
          {ESLVal r = $235;
          
          return new ESLVal("FunType",l,substTypes.apply(newType,n,d),substType.apply(newType,n,r));
        }
        }
        }
        }
      case "IntType": {ESLVal $234 = _v33.termRef(0);
          
          {ESLVal l = $234;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $233 = _v33.termRef(0);
          ESLVal $232 = _v33.termRef(1);
          
          {ESLVal l = $233;
          
          {ESLVal t = $232;
          
          return new ESLVal("ListType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "NullType": {ESLVal $231 = _v33.termRef(0);
          
          {ESLVal l = $231;
          
          return oldType;
        }
        }
      case "RecordType": {ESLVal $230 = _v33.termRef(0);
          ESLVal $229 = _v33.termRef(1);
          
          {ESLVal l = $230;
          
          {ESLVal fs = $229;
          
          return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v34 = $qualArg;
                
                switch(_v34.termName) {
                case "Dec": {ESLVal $261 = _v34.termRef(0);
                  ESLVal $260 = _v34.termRef(1);
                  ESLVal $259 = _v34.termRef(2);
                  ESLVal $258 = _v34.termRef(3);
                  
                  {ESLVal dl = $261;
                  
                  {ESLVal _v88 = $260;
                  
                  {ESLVal t = $259;
                  
                  {ESLVal dt = $258;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,_v88,substType.apply(newType,_v88,t),dt)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v34;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "RecType": {ESLVal $228 = _v33.termRef(0);
          ESLVal $227 = _v33.termRef(1);
          ESLVal $226 = _v33.termRef(2);
          
          {ESLVal l = $228;
          
          {ESLVal a = $227;
          
          {ESLVal t = $226;
          
          if(n.eql(a).boolVal)
          return oldType;
          else
            return new ESLVal("RecType",l,a,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "SetType": {ESLVal $225 = _v33.termRef(0);
          ESLVal $224 = _v33.termRef(1);
          
          {ESLVal l = $225;
          
          {ESLVal t = $224;
          
          return new ESLVal("SetType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "StrType": {ESLVal $223 = _v33.termRef(0);
          
          {ESLVal l = $223;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $222 = _v33.termRef(0);
          ESLVal $221 = _v33.termRef(1);
          ESLVal $220 = _v33.termRef(2);
          
          {ESLVal l = $222;
          
          {ESLVal k = $221;
          
          {ESLVal v = $220;
          
          return new ESLVal("TableType",l,substType.apply(newType,n,k),substType.apply(newType,n,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $219 = _v33.termRef(0);
          ESLVal $218 = _v33.termRef(1);
          ESLVal $217 = _v33.termRef(2);
          
          {ESLVal l = $219;
          
          {ESLVal f = $218;
          
          {ESLVal ts = $217;
          
          return new ESLVal("TermType",l,f,substTypes.apply(newType,n,ts));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $216 = _v33.termRef(0);
          
          {ESLVal f = $216;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $215 = _v33.termRef(0);
          ESLVal $214 = _v33.termRef(1);
          ESLVal $213 = _v33.termRef(2);
          
          {ESLVal l = $215;
          
          {ESLVal ns = $214;
          
          {ESLVal t = $213;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("TypeFun",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $212 = _v33.termRef(0);
          ESLVal $211 = _v33.termRef(1);
          
          {ESLVal l = $212;
          
          {ESLVal t = $211;
          
          return new ESLVal("UnfoldType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "UnionType": {ESLVal $210 = _v33.termRef(0);
          ESLVal $209 = _v33.termRef(1);
          
          {ESLVal l = $210;
          
          {ESLVal ts = $209;
          
          return new ESLVal("UnionType",l,substTypes.apply(newType,n,ts));
        }
        }
        }
      case "VarType": {ESLVal $208 = _v33.termRef(0);
          ESLVal $207 = _v33.termRef(1);
          
          {ESLVal l = $208;
          
          {ESLVal name = $207;
          
          if(name.eql(n).boolVal)
          return newType;
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $206 = _v33.termRef(0);
          
          {ESLVal l = $206;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $205 = _v33.termRef(0);
          ESLVal $204 = _v33.termRef(1);
          ESLVal $203 = _v33.termRef(2);
          
          {ESLVal l = $205;
          
          {ESLVal t = $204;
          
          {ESLVal name = $203;
          
          return new ESLVal("UnionRef",l,substType.apply(newType,n,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v33;
          
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
  {ESLVal _v32 = types;
        
        if(_v32.isCons())
        {ESLVal $201 = _v32.head();
          ESLVal $202 = _v32.tail();
          
          {ESLVal t = $201;
          
          {ESLVal ts = $202;
          
          return substTypesEnv.apply(env,ts).cons(substTypeEnv.apply(env,t));
        }
        }
        }
      else if(_v32.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(25430,25541)").add(ESLVal.list(_v32)));
      }
    }
  });
  public static ESLVal substTypeEnv = new ESLVal(new Function(new ESLVal("substTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal oldType = $args[1];
  {ESLVal _v22 = oldType;
        
        switch(_v22.termName) {
        case "ApplyType": {ESLVal $196 = _v22.termRef(0);
          ESLVal $195 = _v22.termRef(1);
          ESLVal $194 = _v22.termRef(2);
          
          {ESLVal l = $196;
          
          {ESLVal n = $195;
          
          {ESLVal types = $194;
          
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
      case "ApplyTypeFun": {ESLVal $193 = _v22.termRef(0);
          ESLVal $192 = _v22.termRef(1);
          ESLVal $191 = _v22.termRef(2);
          
          {ESLVal l = $193;
          
          {ESLVal op = $192;
          
          {ESLVal args = $191;
          
          return new ESLVal("ApplyTypeFun",l,substTypeEnv.apply(env,op),substTypesEnv.apply(env,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $190 = _v22.termRef(0);
          ESLVal $189 = _v22.termRef(1);
          ESLVal $188 = _v22.termRef(2);
          
          {ESLVal l = $190;
          
          {ESLVal decs = $189;
          
          {ESLVal handlers = $188;
          
          return new ESLVal("ActType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v30 = $qualArg;
                
                {ESLVal d = _v30;
                
                return ESLVal.list(ESLVal.list(substDecEnv.apply(env,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v31 = $qualArg;
                
                {ESLVal m = _v31;
                
                return ESLVal.list(ESLVal.list(substMTypeEnv.apply(env,m)));
              }
              }
            }
          }).map(handlers).flatten().flatten());
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $187 = _v22.termRef(0);
          ESLVal $186 = _v22.termRef(1);
          ESLVal $185 = _v22.termRef(2);
          ESLVal $184 = _v22.termRef(3);
          
          {ESLVal l = $187;
          
          {ESLVal parent = $186;
          
          {ESLVal decs = $185;
          
          {ESLVal handlers = $184;
          
          return new ESLVal("ExtendedAct",l,substTypeEnv.apply(env,parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                {ESLVal d = _v28;
                
                return ESLVal.list(ESLVal.list(substDecEnv.apply(env,d)));
              }
              }
            }
          }).map(decs).flatten().flatten(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                {ESLVal m = _v29;
                
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
      case "ArrayType": {ESLVal $183 = _v22.termRef(0);
          ESLVal $182 = _v22.termRef(1);
          
          {ESLVal l = $183;
          
          {ESLVal t = $182;
          
          return new ESLVal("ArrayType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BoolType": {ESLVal $181 = _v22.termRef(0);
          
          {ESLVal l = $181;
          
          return oldType;
        }
        }
      case "FloatType": {ESLVal $180 = _v22.termRef(0);
          
          {ESLVal l = $180;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $179 = _v22.termRef(0);
          ESLVal $178 = _v22.termRef(1);
          ESLVal $177 = _v22.termRef(2);
          
          {ESLVal l = $179;
          
          {ESLVal ns = $178;
          
          {ESLVal t = $177;
          
          return new ESLVal("ForallType",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "FieldType": {ESLVal $176 = _v22.termRef(0);
          ESLVal $175 = _v22.termRef(1);
          ESLVal $174 = _v22.termRef(2);
          
          {ESLVal l = $176;
          
          {ESLVal n = $175;
          
          {ESLVal t = $174;
          
          return new ESLVal("FieldType",l,n,substTypeEnv.apply(env,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $173 = _v22.termRef(0);
          ESLVal $172 = _v22.termRef(1);
          ESLVal $171 = _v22.termRef(2);
          
          {ESLVal l = $173;
          
          {ESLVal d = $172;
          
          {ESLVal r = $171;
          
          return new ESLVal("FunType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                {ESLVal t = _v27;
                
                return ESLVal.list(ESLVal.list(substTypeEnv.apply(env,t)));
              }
              }
            }
          }).map(d).flatten().flatten(),substTypeEnv.apply(env,r));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $170 = _v22.termRef(0);
          ESLVal $169 = _v22.termRef(1);
          ESLVal $168 = _v22.termRef(2);
          ESLVal $167 = _v22.termRef(3);
          
          {ESLVal l = $170;
          
          {ESLVal d = $169;
          
          {ESLVal p = $168;
          
          {ESLVal r = $167;
          
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
        }
      case "IntType": {ESLVal $166 = _v22.termRef(0);
          
          {ESLVal l = $166;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $165 = _v22.termRef(0);
          ESLVal $164 = _v22.termRef(1);
          
          {ESLVal l = $165;
          
          {ESLVal t = $164;
          
          return new ESLVal("ListType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "SetType": {ESLVal $163 = _v22.termRef(0);
          ESLVal $162 = _v22.termRef(1);
          
          {ESLVal l = $163;
          
          {ESLVal t = $162;
          
          return new ESLVal("SetType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BagType": {ESLVal $161 = _v22.termRef(0);
          ESLVal $160 = _v22.termRef(1);
          
          {ESLVal l = $161;
          
          {ESLVal t = $160;
          
          return new ESLVal("BagType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "NullType": {ESLVal $159 = _v22.termRef(0);
          
          {ESLVal l = $159;
          
          return oldType;
        }
        }
      case "RecType": {ESLVal $158 = _v22.termRef(0);
          ESLVal $157 = _v22.termRef(1);
          ESLVal $156 = _v22.termRef(2);
          
          {ESLVal l = $158;
          
          {ESLVal a = $157;
          
          {ESLVal t = $156;
          
          return new ESLVal("RecType",l,a,substTypeEnv.apply(removeFromDom.apply(env,ESLVal.list(a)),t));
        }
        }
        }
        }
      case "RecordType": {ESLVal $155 = _v22.termRef(0);
          ESLVal $154 = _v22.termRef(1);
          
          {ESLVal l = $155;
          
          {ESLVal fs = $154;
          
          return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v25 = $qualArg;
                
                switch(_v25.termName) {
                case "Dec": {ESLVal $200 = _v25.termRef(0);
                  ESLVal $199 = _v25.termRef(1);
                  ESLVal $198 = _v25.termRef(2);
                  ESLVal $197 = _v25.termRef(3);
                  
                  {ESLVal dl = $200;
                  
                  {ESLVal n = $199;
                  
                  {ESLVal t = $198;
                  
                  {ESLVal dt = $197;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,n,substTypeEnv.apply(env,t),dt)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v25;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "StrType": {ESLVal $153 = _v22.termRef(0);
          
          {ESLVal l = $153;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $152 = _v22.termRef(0);
          ESLVal $151 = _v22.termRef(1);
          ESLVal $150 = _v22.termRef(2);
          
          {ESLVal l = $152;
          
          {ESLVal k = $151;
          
          {ESLVal v = $150;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(env,k),substTypeEnv.apply(env,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $149 = _v22.termRef(0);
          ESLVal $148 = _v22.termRef(1);
          ESLVal $147 = _v22.termRef(2);
          
          {ESLVal l = $149;
          
          {ESLVal f = $148;
          
          {ESLVal ts = $147;
          
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
      case "TypeClosure": {ESLVal $146 = _v22.termRef(0);
          
          {ESLVal f = $146;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $145 = _v22.termRef(0);
          ESLVal $144 = _v22.termRef(1);
          ESLVal $143 = _v22.termRef(2);
          
          {ESLVal l = $145;
          
          {ESLVal ns = $144;
          
          {ESLVal t = $143;
          
          return new ESLVal("TypeFun",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $142 = _v22.termRef(0);
          ESLVal $141 = _v22.termRef(1);
          
          {ESLVal l = $142;
          
          {ESLVal t = $141;
          
          return new ESLVal("UnfoldType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "UnionType": {ESLVal $140 = _v22.termRef(0);
          ESLVal $139 = _v22.termRef(1);
          
          {ESLVal l = $140;
          
          {ESLVal ts = $139;
          
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
      case "VarType": {ESLVal $138 = _v22.termRef(0);
          ESLVal $137 = _v22.termRef(1);
          
          {ESLVal l = $138;
          
          {ESLVal name = $137;
          
          if(member.apply(name,typeEnvDom.apply(env)).boolVal)
          return lookupType.apply(name,env);
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $136 = _v22.termRef(0);
          
          {ESLVal l = $136;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $135 = _v22.termRef(0);
          ESLVal $134 = _v22.termRef(1);
          ESLVal $133 = _v22.termRef(2);
          
          {ESLVal l = $135;
          
          {ESLVal t = $134;
          
          {ESLVal name = $133;
          
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
        {ESLVal $127 = _v21.head();
          ESLVal $128 = _v21.tail();
          
          if(_v20.isCons())
          {ESLVal $129 = _v20.head();
            ESLVal $130 = _v20.tail();
            
            {ESLVal n = $127;
            
            {ESLVal _v86 = $128;
            
            {ESLVal t = $129;
            
            {ESLVal _v87 = $130;
            
            return zipTypeEnv.apply(_v86,_v87).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
        else if(_v20.isNil())
          return error(new ESLVal("case error at Pos(28287,28408)").add(ESLVal.list(_v21,_v20)));
        else return error(new ESLVal("case error at Pos(28287,28408)").add(ESLVal.list(_v21,_v20)));
        }
      else if(_v21.isNil())
        if(_v20.isCons())
          {ESLVal $131 = _v20.head();
            ESLVal $132 = _v20.tail();
            
            return error(new ESLVal("case error at Pos(28287,28408)").add(ESLVal.list(_v21,_v20)));
          }
        else if(_v20.isNil())
          return $nil;
        else return error(new ESLVal("case error at Pos(28287,28408)").add(ESLVal.list(_v21,_v20)));
      else return error(new ESLVal("case error at Pos(28287,28408)").add(ESLVal.list(_v21,_v20)));
      }
    }
  });
  public static ESLVal lookupType = new ESLVal(new Function(new ESLVal("lookupType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v19 = env;
        
        if(_v19.isCons())
        {ESLVal $123 = _v19.head();
          ESLVal $124 = _v19.tail();
          
          switch($123.termName) {
          case "Map": {ESLVal $126 = $123.termRef(0);
            ESLVal $125 = $123.termRef(1);
            
            {ESLVal n = $126;
            
            {ESLVal t = $125;
            
            {ESLVal e = $124;
            
            if(n.eql(name).boolVal)
            return t;
            else
              {ESLVal m = $123;
                
                {ESLVal _v85 = $124;
                
                return lookupType.apply(name,_v85);
              }
              }
          }
          }
          }
          }
          default: {ESLVal m = $123;
            
            {ESLVal e = $124;
            
            return lookupType.apply(name,e);
          }
          }
        }
        }
      else if(_v19.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(28454,28591)").add(ESLVal.list(_v19)));
      }
    }
  });
  public static ESLVal typeEnvDom = new ESLVal(new Function(new ESLVal("typeEnvDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v18 = e;
        
        if(_v18.isCons())
        {ESLVal $119 = _v18.head();
          ESLVal $120 = _v18.tail();
          
          switch($119.termName) {
          case "Map": {ESLVal $122 = $119.termRef(0);
            ESLVal $121 = $119.termRef(1);
            
            {ESLVal n = $122;
            
            {ESLVal t = $121;
            
            {ESLVal x = $120;
            
            return typeEnvDom.apply(x).cons(n);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28626,28715)").add(ESLVal.list(_v18)));
        }
        }
      else if(_v18.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28626,28715)").add(ESLVal.list(_v18)));
      }
    }
  });
  public static ESLVal removeFromDom = new ESLVal(new Function(new ESLVal("removeFromDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v17 = e;
        
        if(_v17.isCons())
        {ESLVal $115 = _v17.head();
          ESLVal $116 = _v17.tail();
          
          switch($115.termName) {
          case "Map": {ESLVal $118 = $115.termRef(0);
            ESLVal $117 = $115.termRef(1);
            
            {ESLVal n = $118;
            
            {ESLVal t = $117;
            
            {ESLVal _v81 = $116;
            
            if(member.apply(n,ns).boolVal)
            return removeFromDom.apply(_v81,ns);
            else
              {ESLVal _v82 = $118;
                
                {ESLVal _v83 = $117;
                
                {ESLVal _v84 = $116;
                
                return removeFromDom.apply(_v84,ns).cons(new ESLVal("Map",_v82,_v83));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28762,28944)").add(ESLVal.list(_v17)));
        }
        }
      else if(_v17.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28762,28944)").add(ESLVal.list(_v17)));
      }
    }
  });
  public static ESLVal restrictTypeEnv = new ESLVal(new Function(new ESLVal("restrictTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v16 = e;
        
        if(_v16.isCons())
        {ESLVal $111 = _v16.head();
          ESLVal $112 = _v16.tail();
          
          switch($111.termName) {
          case "Map": {ESLVal $114 = $111.termRef(0);
            ESLVal $113 = $111.termRef(1);
            
            {ESLVal n = $114;
            
            {ESLVal t = $113;
            
            {ESLVal _v77 = $112;
            
            if(member.apply(n,ns).not().boolVal)
            return restrictTypeEnv.apply(_v77,ns);
            else
              {ESLVal _v78 = $114;
                
                {ESLVal _v79 = $113;
                
                {ESLVal _v80 = $112;
                
                return restrictTypeEnv.apply(_v80,ns).cons(new ESLVal("Map",_v78,_v79));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28993,29184)").add(ESLVal.list(_v16)));
        }
        }
      else if(_v16.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28993,29184)").add(ESLVal.list(_v16)));
      }
    }
  });
  public static ESLVal typeEnvRan = new ESLVal(new Function(new ESLVal("typeEnvRan"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v15 = e;
        
        if(_v15.isCons())
        {ESLVal $107 = _v15.head();
          ESLVal $108 = _v15.tail();
          
          switch($107.termName) {
          case "Map": {ESLVal $110 = $107.termRef(0);
            ESLVal $109 = $107.termRef(1);
            
            {ESLVal n = $110;
            
            {ESLVal t = $109;
            
            {ESLVal x = $108;
            
            return typeEnvRan.apply(x).cons(t);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(29220,29311)").add(ESLVal.list(_v15)));
        }
        }
      else if(_v15.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(29220,29311)").add(ESLVal.list(_v15)));
      }
    }
  });
  public static ESLVal allEqualTypes = new ESLVal(new Function(new ESLVal("allEqualTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v14 = ts;
        
        if(_v14.isCons())
        {ESLVal $105 = _v14.head();
          ESLVal $106 = _v14.tail();
          
          {ESLVal t2 = $105;
          
          {ESLVal _v74 = $106;
          
          if(typeEqual.apply(t1,t2).boolVal)
          return allEqualTypes.apply(t1,_v74);
          else
            {ESLVal _v75 = _v14;
              
              return $false;
            }
        }
        }
        }
      else if(_v14.isNil())
        return $true;
      else {ESLVal _v76 = _v14;
          
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
        case "Dec": {ESLVal $104 = _v13.termRef(0);
          ESLVal $103 = _v13.termRef(1);
          ESLVal $102 = _v13.termRef(2);
          ESLVal $101 = _v13.termRef(3);
          
          {ESLVal l = $104;
          
          {ESLVal name = $103;
          
          {ESLVal t = $102;
          
          {ESLVal st = $101;
          
          return new ESLVal("Dec",l,name,substType.apply(newType,n,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29544,29641)").add(ESLVal.list(_v13)));
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
        case "Dec": {ESLVal $100 = _v12.termRef(0);
          ESLVal $99 = _v12.termRef(1);
          ESLVal $98 = _v12.termRef(2);
          ESLVal $97 = _v12.termRef(3);
          
          {ESLVal l = $100;
          
          {ESLVal name = $99;
          
          {ESLVal t = $98;
          
          {ESLVal st = $97;
          
          return new ESLVal("Dec",l,name,substTypeEnv.apply(env,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29686,29780)").add(ESLVal.list(_v12)));
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
        case "MessageType": {ESLVal $96 = _v10.termRef(0);
          ESLVal $95 = _v10.termRef(1);
          
          {ESLVal l = $96;
          
          {ESLVal ts = $95;
          
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
        default: return error(new ESLVal("case error at Pos(29840,29948)").add(ESLVal.list(_v10)));
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
        case "MessageType": {ESLVal $94 = _v8.termRef(0);
          ESLVal $93 = _v8.termRef(1);
          
          {ESLVal l = $94;
          
          {ESLVal ts = $93;
          
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
        default: return error(new ESLVal("case error at Pos(30000,30105)").add(ESLVal.list(_v8)));
      }
      }
    }
  });
  public static ESLVal patternNames = new ESLVal(new Function(new ESLVal("patternNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v5 = x;
        
        switch(_v5.termName) {
        case "PAdd": {ESLVal $92 = _v5.termRef(0);
          ESLVal $91 = _v5.termRef(1);
          ESLVal $90 = _v5.termRef(2);
          
          {ESLVal l = $92;
          
          {ESLVal p1 = $91;
          
          {ESLVal p2 = $90;
          
          return patternNames.apply(p1).add(patternNames.apply(p2));
        }
        }
        }
        }
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
                    ESLVal _v73 = $args[0];
                {ESLVal _v7 = _v73;
                      
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
        default: return error(new ESLVal("case error at Pos(30450,31230)").add(ESLVal.list(_v5)));
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
        default: {ESLVal _v72 = _v4;
          
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
        default: {ESLVal _v71 = _v3;
          
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
        default: return error(new ESLVal("case error at Pos(31731,32052)").add(ESLVal.list(_v2)));
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
        default: return error(new ESLVal("case error at Pos(32084,32405)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}