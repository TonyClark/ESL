package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Types {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal locStart = new ESLVal(new Function(new ESLVal("locStart"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v206 = l;
        
        switch(_v206.termName) {
        case "Pos": {ESLVal $580 = _v206.termRef(0);
          ESLVal $579 = _v206.termRef(1);
          
          {ESLVal start = $580;
          
          {ESLVal end = $579;
          
          return start;
        }
        }
        }
      case "TypedLoc": {ESLVal $578 = _v206.termRef(0);
          ESLVal $577 = _v206.termRef(1);
          ESLVal $576 = _v206.termRef(2);
          
          {ESLVal t = $578;
          
          {ESLVal start = $577;
          
          {ESLVal end = $576;
          
          return start;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5784,5868)").add(ESLVal.list(_v206)));
      }
      }
    }
  });
  public static ESLVal locEnd = new ESLVal(new Function(new ESLVal("locEnd"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v207 = l;
        
        switch(_v207.termName) {
        case "Pos": {ESLVal $585 = _v207.termRef(0);
          ESLVal $584 = _v207.termRef(1);
          
          {ESLVal start = $585;
          
          {ESLVal end = $584;
          
          return end;
        }
        }
        }
      case "TypedLoc": {ESLVal $583 = _v207.termRef(0);
          ESLVal $582 = _v207.termRef(1);
          ESLVal $581 = _v207.termRef(2);
          
          {ESLVal t = $583;
          
          {ESLVal start = $582;
          
          {ESLVal end = $581;
          
          return end;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5895,5975)").add(ESLVal.list(_v207)));
      }
      }
    }
  });
  public static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v208 = d;
        
        switch(_v208.termName) {
        case "Dec": {ESLVal $589 = _v208.termRef(0);
          ESLVal $588 = _v208.termRef(1);
          ESLVal $587 = _v208.termRef(2);
          ESLVal $586 = _v208.termRef(3);
          
          {ESLVal l = $589;
          
          {ESLVal n = $588;
          
          {ESLVal t = $587;
          
          {ESLVal dt = $586;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6297,6419)").add(ESLVal.list(_v208)));
      }
      }
    }
  });
  public static ESLVal decLoc = new ESLVal(new Function(new ESLVal("decLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v209 = d;
        
        switch(_v209.termName) {
        case "Dec": {ESLVal $593 = _v209.termRef(0);
          ESLVal $592 = _v209.termRef(1);
          ESLVal $591 = _v209.termRef(2);
          ESLVal $590 = _v209.termRef(3);
          
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
        default: return error(new ESLVal("case error at Pos(6523,6581)").add(ESLVal.list(_v209)));
      }
      }
    }
  });
  public static ESLVal decType = new ESLVal(new Function(new ESLVal("decType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v210 = d;
        
        switch(_v210.termName) {
        case "Dec": {ESLVal $597 = _v210.termRef(0);
          ESLVal $596 = _v210.termRef(1);
          ESLVal $595 = _v210.termRef(2);
          ESLVal $594 = _v210.termRef(3);
          
          {ESLVal l = $597;
          
          {ESLVal n = $596;
          
          {ESLVal t = $595;
          
          {ESLVal dt = $594;
          
          return t;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6681,6739)").add(ESLVal.list(_v210)));
      }
      }
    }
  });
  public static ESLVal isStrType = new ESLVal(new Function(new ESLVal("isStrType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v211 = t;
        
        switch(_v211.termName) {
        case "StrType": {ESLVal $598 = _v211.termRef(0);
          
          {ESLVal l = $598;
          
          return $true;
        }
        }
        default: {ESLVal _v779 = _v211;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isIntType = new ESLVal(new Function(new ESLVal("isIntType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v212 = t;
        
        switch(_v212.termName) {
        case "IntType": {ESLVal $599 = _v212.termRef(0);
          
          {ESLVal l = $599;
          
          return $true;
        }
        }
        default: {ESLVal _v778 = _v212;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isNumType = new ESLVal(new Function(new ESLVal("isNumType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v213 = t;
        
        switch(_v213.termName) {
        case "IntType": {ESLVal $601 = _v213.termRef(0);
          
          {ESLVal l = $601;
          
          return $true;
        }
        }
      case "FloatType": {ESLVal $600 = _v213.termRef(0);
          
          {ESLVal l = $600;
          
          return $true;
        }
        }
        default: {ESLVal _v777 = _v213;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isBoolType = new ESLVal(new Function(new ESLVal("isBoolType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v214 = t;
        
        switch(_v214.termName) {
        case "BoolType": {ESLVal $602 = _v214.termRef(0);
          
          {ESLVal l = $602;
          
          return $true;
        }
        }
        default: {ESLVal _v776 = _v214;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isFloatType = new ESLVal(new Function(new ESLVal("isFloatType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v215 = t;
        
        switch(_v215.termName) {
        case "FloatType": {ESLVal $603 = _v215.termRef(0);
          
          {ESLVal l = $603;
          
          return $true;
        }
        }
        default: {ESLVal _v775 = _v215;
          
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
          {ESLVal _v216 = t1;
            ESLVal _v217 = t2;
            
            switch(_v216.termName) {
            case "ArrayType": {ESLVal $747 = _v216.termRef(0);
              ESLVal $746 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "ArrayType": {ESLVal $749 = _v217.termRef(0);
                ESLVal $748 = _v217.termRef(1);
                
                {ESLVal l1 = $747;
                
                {ESLVal _v751 = $746;
                
                {ESLVal l2 = $749;
                
                {ESLVal _v752 = $748;
                
                return typeEqual.apply(_v751,_v752);
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v761 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v761,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v759 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v760 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v759,flattenAct.apply(l2,_v760,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v758 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v757 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v757,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v755 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v756 = $607;
                  
                  return typeEqual.apply(_v755,substType.apply(new ESLVal("RecType",l2,n2,_v756),n2,_v756));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v753 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v754 = $604;
                  
                  return typeEqual.apply(_v753,_v754);
                }
                }
                }
                }
                }
                default: {ESLVal _v762 = _v216;
                  
                  {ESLVal _v763 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ActType": {ESLVal $742 = _v216.termRef(0);
              ESLVal $741 = _v216.termRef(1);
              ESLVal $740 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "ActType": {ESLVal $745 = _v217.termRef(0);
                ESLVal $744 = _v217.termRef(1);
                ESLVal $743 = _v217.termRef(2);
                
                {ESLVal l1 = $742;
                
                {ESLVal exports1 = $741;
                
                {ESLVal handlers1 = $740;
                
                {ESLVal l2 = $745;
                
                {ESLVal exports2 = $744;
                
                {ESLVal handlers2 = $743;
                
                return actEqual.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v748 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v748,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v746 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v747 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v746,flattenAct.apply(l2,_v747,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v745 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v744 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v744,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v742 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v743 = $607;
                  
                  return typeEqual.apply(_v742,substType.apply(new ESLVal("RecType",l2,n2,_v743),n2,_v743));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v740 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v741 = $604;
                  
                  return typeEqual.apply(_v740,_v741);
                }
                }
                }
                }
                }
                default: {ESLVal _v749 = _v216;
                  
                  {ESLVal _v750 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ApplyTypeFun": {ESLVal $736 = _v216.termRef(0);
              ESLVal $735 = _v216.termRef(1);
              ESLVal $734 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "ApplyTypeFun": {ESLVal $739 = _v217.termRef(0);
                ESLVal $738 = _v217.termRef(1);
                ESLVal $737 = _v217.termRef(2);
                
                {ESLVal l1 = $736;
                
                {ESLVal op1 = $735;
                
                {ESLVal args1 = $734;
                
                {ESLVal l2 = $739;
                
                {ESLVal op2 = $738;
                
                {ESLVal args2 = $737;
                
                return typeEqual.apply(op1,op2).and(typesEqual.apply(args1,args2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $736;
                
                {ESLVal op = $735;
                
                {ESLVal args = $734;
                
                {ESLVal _v739 = _v217;
                
                return typeEqual.apply(applyTypeFun.apply(l,forceType.apply(op),args),_v739);
              }
              }
              }
              }
            }
            }
          case "ExtendedAct": {ESLVal $733 = _v216.termRef(0);
              ESLVal $732 = _v216.termRef(1);
              ESLVal $731 = _v216.termRef(2);
              ESLVal $730 = _v216.termRef(3);
              
              {ESLVal l1 = $733;
              
              {ESLVal _v737 = $732;
              
              {ESLVal ds1 = $731;
              
              {ESLVal ms1 = $730;
              
              {ESLVal _v738 = _v217;
              
              return typeEqual.apply(flattenAct.apply(l1,_v737,ds1,ms1),_v738);
            }
            }
            }
            }
            }
            }
          case "BoolType": {ESLVal $728 = _v216.termRef(0);
              
              switch(_v217.termName) {
              case "BoolType": {ESLVal $729 = _v217.termRef(0);
                
                {ESLVal l1 = $728;
                
                {ESLVal l2 = $729;
                
                return $true;
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v734 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v734,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v732 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v733 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v732,flattenAct.apply(l2,_v733,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v731 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v730 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v730,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v728 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v729 = $607;
                  
                  return typeEqual.apply(_v728,substType.apply(new ESLVal("RecType",l2,n2,_v729),n2,_v729));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v726 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v727 = $604;
                  
                  return typeEqual.apply(_v726,_v727);
                }
                }
                }
                }
                }
                default: {ESLVal _v735 = _v216;
                  
                  {ESLVal _v736 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "FloatType": {ESLVal $726 = _v216.termRef(0);
              
              switch(_v217.termName) {
              case "FloatType": {ESLVal $727 = _v217.termRef(0);
                
                {ESLVal l1 = $726;
                
                {ESLVal l2 = $727;
                
                return $true;
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v723 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v723,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v721 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v722 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v721,flattenAct.apply(l2,_v722,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v720 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v719 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v719,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v717 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v718 = $607;
                  
                  return typeEqual.apply(_v717,substType.apply(new ESLVal("RecType",l2,n2,_v718),n2,_v718));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v715 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v716 = $604;
                  
                  return typeEqual.apply(_v715,_v716);
                }
                }
                }
                }
                }
                default: {ESLVal _v724 = _v216;
                  
                  {ESLVal _v725 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "IntType": {ESLVal $724 = _v216.termRef(0);
              
              switch(_v217.termName) {
              case "IntType": {ESLVal $725 = _v217.termRef(0);
                
                {ESLVal l1 = $724;
                
                {ESLVal l2 = $725;
                
                return $true;
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v712 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v712,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v710 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v711 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v710,flattenAct.apply(l2,_v711,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v709 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v708 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v708,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v706 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v707 = $607;
                  
                  return typeEqual.apply(_v706,substType.apply(new ESLVal("RecType",l2,n2,_v707),n2,_v707));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v704 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v705 = $604;
                  
                  return typeEqual.apply(_v704,_v705);
                }
                }
                }
                }
                }
                default: {ESLVal _v713 = _v216;
                  
                  {ESLVal _v714 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ListType": {ESLVal $710 = _v216.termRef(0);
              ESLVal $709 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "ListType": {ESLVal $723 = _v217.termRef(0);
                ESLVal $722 = _v217.termRef(1);
                
                {ESLVal l1 = $710;
                
                {ESLVal _v691 = $709;
                
                {ESLVal l2 = $723;
                
                {ESLVal _v692 = $722;
                
                return typeEqual.apply(_v691,_v692);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $713 = _v217.termRef(0);
                ESLVal $712 = _v217.termRef(1);
                ESLVal $711 = _v217.termRef(2);
                
                if($712.isCons())
                {ESLVal $714 = $712.head();
                  ESLVal $715 = $712.tail();
                  
                  if($715.isCons())
                  {ESLVal $716 = $715.head();
                    ESLVal $717 = $715.tail();
                    
                    switch(_v217.termName) {
                    case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                      ESLVal $620 = _v217.termRef(1);
                      ESLVal $619 = _v217.termRef(2);
                      
                      {ESLVal _v616 = _v216;
                      
                      {ESLVal l = $621;
                      
                      {ESLVal op = $620;
                      
                      {ESLVal args = $619;
                      
                      return typeEqual.apply(_v616,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                      ESLVal $617 = _v217.termRef(1);
                      ESLVal $616 = _v217.termRef(2);
                      ESLVal $615 = _v217.termRef(3);
                      
                      {ESLVal _v614 = _v216;
                      
                      {ESLVal l2 = $618;
                      
                      {ESLVal _v615 = $617;
                      
                      {ESLVal ds2 = $616;
                      
                      {ESLVal ms2 = $615;
                      
                      return typeEqual.apply(_v614,flattenAct.apply(l2,_v615,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $614 = _v217.termRef(0);
                      
                      {ESLVal t = _v216;
                      
                      {ESLVal l1 = $614;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $613 = _v217.termRef(0);
                      ESLVal $612 = _v217.termRef(1);
                      ESLVal $611 = _v217.termRef(2);
                      
                      {ESLVal _v613 = _v216;
                      
                      {ESLVal l2 = $613;
                      
                      {ESLVal n2 = $612;
                      
                      {ESLVal args2 = $611;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                      
                      {ESLVal _v612 = _v216;
                      
                      {ESLVal f = $610;
                      
                      return typeEqual.apply(_v612,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $609 = _v217.termRef(0);
                      ESLVal $608 = _v217.termRef(1);
                      ESLVal $607 = _v217.termRef(2);
                      
                      {ESLVal _v610 = _v216;
                      
                      {ESLVal l2 = $609;
                      
                      {ESLVal n2 = $608;
                      
                      {ESLVal _v611 = $607;
                      
                      return typeEqual.apply(_v610,substType.apply(new ESLVal("RecType",l2,n2,_v611),n2,_v611));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $606 = _v217.termRef(0);
                      ESLVal $605 = _v217.termRef(1);
                      ESLVal $604 = _v217.termRef(2);
                      
                      {ESLVal _v608 = _v216;
                      
                      {ESLVal l1 = $606;
                      
                      {ESLVal ns2 = $605;
                      
                      {ESLVal _v609 = $604;
                      
                      return typeEqual.apply(_v608,_v609);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v617 = _v216;
                      
                      {ESLVal _v618 = _v217;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($715.isNil())
                  switch($711.termName) {
                    case "ListType": {ESLVal $719 = $711.termRef(0);
                      ESLVal $718 = $711.termRef(1);
                      
                      switch($718.termName) {
                      case "VarType": {ESLVal $721 = $718.termRef(0);
                        ESLVal $720 = $718.termRef(1);
                        
                        {ESLVal l1 = $710;
                        
                        {ESLVal _v619 = $709;
                        
                        {ESLVal l2 = $713;
                        
                        {ESLVal v1 = $714;
                        
                        {ESLVal l3 = $719;
                        
                        {ESLVal l4 = $721;
                        
                        {ESLVal v2 = $720;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v217.termName) {
                            case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                              ESLVal $620 = _v217.termRef(1);
                              ESLVal $619 = _v217.termRef(2);
                              
                              {ESLVal _v633 = _v216;
                              
                              {ESLVal l = $621;
                              
                              {ESLVal op = $620;
                              
                              {ESLVal args = $619;
                              
                              return typeEqual.apply(_v633,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                              ESLVal $617 = _v217.termRef(1);
                              ESLVal $616 = _v217.termRef(2);
                              ESLVal $615 = _v217.termRef(3);
                              
                              {ESLVal _v630 = _v216;
                              
                              {ESLVal _v631 = $618;
                              
                              {ESLVal _v632 = $617;
                              
                              {ESLVal ds2 = $616;
                              
                              {ESLVal ms2 = $615;
                              
                              return typeEqual.apply(_v630,flattenAct.apply(_v631,_v632,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $614 = _v217.termRef(0);
                              
                              {ESLVal t = _v216;
                              
                              {ESLVal _v629 = $614;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $613 = _v217.termRef(0);
                              ESLVal $612 = _v217.termRef(1);
                              ESLVal $611 = _v217.termRef(2);
                              
                              {ESLVal _v627 = _v216;
                              
                              {ESLVal _v628 = $613;
                              
                              {ESLVal n2 = $612;
                              
                              {ESLVal args2 = $611;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                              
                              {ESLVal _v626 = _v216;
                              
                              {ESLVal f = $610;
                              
                              return typeEqual.apply(_v626,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $609 = _v217.termRef(0);
                              ESLVal $608 = _v217.termRef(1);
                              ESLVal $607 = _v217.termRef(2);
                              
                              {ESLVal _v623 = _v216;
                              
                              {ESLVal _v624 = $609;
                              
                              {ESLVal n2 = $608;
                              
                              {ESLVal _v625 = $607;
                              
                              return typeEqual.apply(_v623,substType.apply(new ESLVal("RecType",_v624,n2,_v625),n2,_v625));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $606 = _v217.termRef(0);
                              ESLVal $605 = _v217.termRef(1);
                              ESLVal $604 = _v217.termRef(2);
                              
                              {ESLVal _v620 = _v216;
                              
                              {ESLVal _v621 = $606;
                              
                              {ESLVal ns2 = $605;
                              
                              {ESLVal _v622 = $604;
                              
                              return typeEqual.apply(_v620,_v622);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v634 = _v216;
                              
                              {ESLVal _v635 = _v217;
                              
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
                      default: switch(_v217.termName) {
                        case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                          ESLVal $620 = _v217.termRef(1);
                          ESLVal $619 = _v217.termRef(2);
                          
                          {ESLVal _v644 = _v216;
                          
                          {ESLVal l = $621;
                          
                          {ESLVal op = $620;
                          
                          {ESLVal args = $619;
                          
                          return typeEqual.apply(_v644,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                          ESLVal $617 = _v217.termRef(1);
                          ESLVal $616 = _v217.termRef(2);
                          ESLVal $615 = _v217.termRef(3);
                          
                          {ESLVal _v642 = _v216;
                          
                          {ESLVal l2 = $618;
                          
                          {ESLVal _v643 = $617;
                          
                          {ESLVal ds2 = $616;
                          
                          {ESLVal ms2 = $615;
                          
                          return typeEqual.apply(_v642,flattenAct.apply(l2,_v643,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $614 = _v217.termRef(0);
                          
                          {ESLVal t = _v216;
                          
                          {ESLVal l1 = $614;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $613 = _v217.termRef(0);
                          ESLVal $612 = _v217.termRef(1);
                          ESLVal $611 = _v217.termRef(2);
                          
                          {ESLVal _v641 = _v216;
                          
                          {ESLVal l2 = $613;
                          
                          {ESLVal n2 = $612;
                          
                          {ESLVal args2 = $611;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                          
                          {ESLVal _v640 = _v216;
                          
                          {ESLVal f = $610;
                          
                          return typeEqual.apply(_v640,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $609 = _v217.termRef(0);
                          ESLVal $608 = _v217.termRef(1);
                          ESLVal $607 = _v217.termRef(2);
                          
                          {ESLVal _v638 = _v216;
                          
                          {ESLVal l2 = $609;
                          
                          {ESLVal n2 = $608;
                          
                          {ESLVal _v639 = $607;
                          
                          return typeEqual.apply(_v638,substType.apply(new ESLVal("RecType",l2,n2,_v639),n2,_v639));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $606 = _v217.termRef(0);
                          ESLVal $605 = _v217.termRef(1);
                          ESLVal $604 = _v217.termRef(2);
                          
                          {ESLVal _v636 = _v216;
                          
                          {ESLVal l1 = $606;
                          
                          {ESLVal ns2 = $605;
                          
                          {ESLVal _v637 = $604;
                          
                          return typeEqual.apply(_v636,_v637);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v645 = _v216;
                          
                          {ESLVal _v646 = _v217;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v217.termName) {
                      case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                        ESLVal $620 = _v217.termRef(1);
                        ESLVal $619 = _v217.termRef(2);
                        
                        {ESLVal _v655 = _v216;
                        
                        {ESLVal l = $621;
                        
                        {ESLVal op = $620;
                        
                        {ESLVal args = $619;
                        
                        return typeEqual.apply(_v655,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                        ESLVal $617 = _v217.termRef(1);
                        ESLVal $616 = _v217.termRef(2);
                        ESLVal $615 = _v217.termRef(3);
                        
                        {ESLVal _v653 = _v216;
                        
                        {ESLVal l2 = $618;
                        
                        {ESLVal _v654 = $617;
                        
                        {ESLVal ds2 = $616;
                        
                        {ESLVal ms2 = $615;
                        
                        return typeEqual.apply(_v653,flattenAct.apply(l2,_v654,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $614 = _v217.termRef(0);
                        
                        {ESLVal t = _v216;
                        
                        {ESLVal l1 = $614;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $613 = _v217.termRef(0);
                        ESLVal $612 = _v217.termRef(1);
                        ESLVal $611 = _v217.termRef(2);
                        
                        {ESLVal _v652 = _v216;
                        
                        {ESLVal l2 = $613;
                        
                        {ESLVal n2 = $612;
                        
                        {ESLVal args2 = $611;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                        
                        {ESLVal _v651 = _v216;
                        
                        {ESLVal f = $610;
                        
                        return typeEqual.apply(_v651,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $609 = _v217.termRef(0);
                        ESLVal $608 = _v217.termRef(1);
                        ESLVal $607 = _v217.termRef(2);
                        
                        {ESLVal _v649 = _v216;
                        
                        {ESLVal l2 = $609;
                        
                        {ESLVal n2 = $608;
                        
                        {ESLVal _v650 = $607;
                        
                        return typeEqual.apply(_v649,substType.apply(new ESLVal("RecType",l2,n2,_v650),n2,_v650));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $606 = _v217.termRef(0);
                        ESLVal $605 = _v217.termRef(1);
                        ESLVal $604 = _v217.termRef(2);
                        
                        {ESLVal _v647 = _v216;
                        
                        {ESLVal l1 = $606;
                        
                        {ESLVal ns2 = $605;
                        
                        {ESLVal _v648 = $604;
                        
                        return typeEqual.apply(_v647,_v648);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v656 = _v216;
                        
                        {ESLVal _v657 = _v217;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v217.termName) {
                    case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                      ESLVal $620 = _v217.termRef(1);
                      ESLVal $619 = _v217.termRef(2);
                      
                      {ESLVal _v666 = _v216;
                      
                      {ESLVal l = $621;
                      
                      {ESLVal op = $620;
                      
                      {ESLVal args = $619;
                      
                      return typeEqual.apply(_v666,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                      ESLVal $617 = _v217.termRef(1);
                      ESLVal $616 = _v217.termRef(2);
                      ESLVal $615 = _v217.termRef(3);
                      
                      {ESLVal _v664 = _v216;
                      
                      {ESLVal l2 = $618;
                      
                      {ESLVal _v665 = $617;
                      
                      {ESLVal ds2 = $616;
                      
                      {ESLVal ms2 = $615;
                      
                      return typeEqual.apply(_v664,flattenAct.apply(l2,_v665,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $614 = _v217.termRef(0);
                      
                      {ESLVal t = _v216;
                      
                      {ESLVal l1 = $614;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $613 = _v217.termRef(0);
                      ESLVal $612 = _v217.termRef(1);
                      ESLVal $611 = _v217.termRef(2);
                      
                      {ESLVal _v663 = _v216;
                      
                      {ESLVal l2 = $613;
                      
                      {ESLVal n2 = $612;
                      
                      {ESLVal args2 = $611;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                      
                      {ESLVal _v662 = _v216;
                      
                      {ESLVal f = $610;
                      
                      return typeEqual.apply(_v662,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $609 = _v217.termRef(0);
                      ESLVal $608 = _v217.termRef(1);
                      ESLVal $607 = _v217.termRef(2);
                      
                      {ESLVal _v660 = _v216;
                      
                      {ESLVal l2 = $609;
                      
                      {ESLVal n2 = $608;
                      
                      {ESLVal _v661 = $607;
                      
                      return typeEqual.apply(_v660,substType.apply(new ESLVal("RecType",l2,n2,_v661),n2,_v661));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $606 = _v217.termRef(0);
                      ESLVal $605 = _v217.termRef(1);
                      ESLVal $604 = _v217.termRef(2);
                      
                      {ESLVal _v658 = _v216;
                      
                      {ESLVal l1 = $606;
                      
                      {ESLVal ns2 = $605;
                      
                      {ESLVal _v659 = $604;
                      
                      return typeEqual.apply(_v658,_v659);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v667 = _v216;
                      
                      {ESLVal _v668 = _v217;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($712.isNil())
                switch(_v217.termName) {
                  case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                    ESLVal $620 = _v217.termRef(1);
                    ESLVal $619 = _v217.termRef(2);
                    
                    {ESLVal _v677 = _v216;
                    
                    {ESLVal l = $621;
                    
                    {ESLVal op = $620;
                    
                    {ESLVal args = $619;
                    
                    return typeEqual.apply(_v677,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                    ESLVal $617 = _v217.termRef(1);
                    ESLVal $616 = _v217.termRef(2);
                    ESLVal $615 = _v217.termRef(3);
                    
                    {ESLVal _v675 = _v216;
                    
                    {ESLVal l2 = $618;
                    
                    {ESLVal _v676 = $617;
                    
                    {ESLVal ds2 = $616;
                    
                    {ESLVal ms2 = $615;
                    
                    return typeEqual.apply(_v675,flattenAct.apply(l2,_v676,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $614 = _v217.termRef(0);
                    
                    {ESLVal t = _v216;
                    
                    {ESLVal l1 = $614;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $613 = _v217.termRef(0);
                    ESLVal $612 = _v217.termRef(1);
                    ESLVal $611 = _v217.termRef(2);
                    
                    {ESLVal _v674 = _v216;
                    
                    {ESLVal l2 = $613;
                    
                    {ESLVal n2 = $612;
                    
                    {ESLVal args2 = $611;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                    
                    {ESLVal _v673 = _v216;
                    
                    {ESLVal f = $610;
                    
                    return typeEqual.apply(_v673,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $609 = _v217.termRef(0);
                    ESLVal $608 = _v217.termRef(1);
                    ESLVal $607 = _v217.termRef(2);
                    
                    {ESLVal _v671 = _v216;
                    
                    {ESLVal l2 = $609;
                    
                    {ESLVal n2 = $608;
                    
                    {ESLVal _v672 = $607;
                    
                    return typeEqual.apply(_v671,substType.apply(new ESLVal("RecType",l2,n2,_v672),n2,_v672));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $606 = _v217.termRef(0);
                    ESLVal $605 = _v217.termRef(1);
                    ESLVal $604 = _v217.termRef(2);
                    
                    {ESLVal _v669 = _v216;
                    
                    {ESLVal l1 = $606;
                    
                    {ESLVal ns2 = $605;
                    
                    {ESLVal _v670 = $604;
                    
                    return typeEqual.apply(_v669,_v670);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v678 = _v216;
                    
                    {ESLVal _v679 = _v217;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v217.termName) {
                  case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                    ESLVal $620 = _v217.termRef(1);
                    ESLVal $619 = _v217.termRef(2);
                    
                    {ESLVal _v688 = _v216;
                    
                    {ESLVal l = $621;
                    
                    {ESLVal op = $620;
                    
                    {ESLVal args = $619;
                    
                    return typeEqual.apply(_v688,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                    ESLVal $617 = _v217.termRef(1);
                    ESLVal $616 = _v217.termRef(2);
                    ESLVal $615 = _v217.termRef(3);
                    
                    {ESLVal _v686 = _v216;
                    
                    {ESLVal l2 = $618;
                    
                    {ESLVal _v687 = $617;
                    
                    {ESLVal ds2 = $616;
                    
                    {ESLVal ms2 = $615;
                    
                    return typeEqual.apply(_v686,flattenAct.apply(l2,_v687,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $614 = _v217.termRef(0);
                    
                    {ESLVal t = _v216;
                    
                    {ESLVal l1 = $614;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $613 = _v217.termRef(0);
                    ESLVal $612 = _v217.termRef(1);
                    ESLVal $611 = _v217.termRef(2);
                    
                    {ESLVal _v685 = _v216;
                    
                    {ESLVal l2 = $613;
                    
                    {ESLVal n2 = $612;
                    
                    {ESLVal args2 = $611;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                    
                    {ESLVal _v684 = _v216;
                    
                    {ESLVal f = $610;
                    
                    return typeEqual.apply(_v684,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $609 = _v217.termRef(0);
                    ESLVal $608 = _v217.termRef(1);
                    ESLVal $607 = _v217.termRef(2);
                    
                    {ESLVal _v682 = _v216;
                    
                    {ESLVal l2 = $609;
                    
                    {ESLVal n2 = $608;
                    
                    {ESLVal _v683 = $607;
                    
                    return typeEqual.apply(_v682,substType.apply(new ESLVal("RecType",l2,n2,_v683),n2,_v683));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $606 = _v217.termRef(0);
                    ESLVal $605 = _v217.termRef(1);
                    ESLVal $604 = _v217.termRef(2);
                    
                    {ESLVal _v680 = _v216;
                    
                    {ESLVal l1 = $606;
                    
                    {ESLVal ns2 = $605;
                    
                    {ESLVal _v681 = $604;
                    
                    return typeEqual.apply(_v680,_v681);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v689 = _v216;
                    
                    {ESLVal _v690 = _v217;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v701 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v701,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v699 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v700 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v699,flattenAct.apply(l2,_v700,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v698 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v697 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v697,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v695 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v696 = $607;
                  
                  return typeEqual.apply(_v695,substType.apply(new ESLVal("RecType",l2,n2,_v696),n2,_v696));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v693 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v694 = $604;
                  
                  return typeEqual.apply(_v693,_v694);
                }
                }
                }
                }
                }
                default: {ESLVal _v702 = _v216;
                  
                  {ESLVal _v703 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $706 = _v216.termRef(0);
              ESLVal $705 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "BagType": {ESLVal $708 = _v217.termRef(0);
                ESLVal $707 = _v217.termRef(1);
                
                {ESLVal l1 = $706;
                
                {ESLVal _v595 = $705;
                
                {ESLVal l2 = $708;
                
                {ESLVal _v596 = $707;
                
                return typeEqual.apply(_v595,_v596);
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v605 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v605,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v603 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v604 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v603,flattenAct.apply(l2,_v604,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v602 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v601 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v601,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v599 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v600 = $607;
                  
                  return typeEqual.apply(_v599,substType.apply(new ESLVal("RecType",l2,n2,_v600),n2,_v600));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v597 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v598 = $604;
                  
                  return typeEqual.apply(_v597,_v598);
                }
                }
                }
                }
                }
                default: {ESLVal _v606 = _v216;
                  
                  {ESLVal _v607 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $691 = _v216.termRef(0);
              ESLVal $690 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "SetType": {ESLVal $704 = _v217.termRef(0);
                ESLVal $703 = _v217.termRef(1);
                
                {ESLVal l1 = $691;
                
                {ESLVal _v582 = $690;
                
                {ESLVal l2 = $704;
                
                {ESLVal _v583 = $703;
                
                return typeEqual.apply(_v582,_v583);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $694 = _v217.termRef(0);
                ESLVal $693 = _v217.termRef(1);
                ESLVal $692 = _v217.termRef(2);
                
                if($693.isCons())
                {ESLVal $695 = $693.head();
                  ESLVal $696 = $693.tail();
                  
                  if($696.isCons())
                  {ESLVal $697 = $696.head();
                    ESLVal $698 = $696.tail();
                    
                    switch(_v217.termName) {
                    case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                      ESLVal $620 = _v217.termRef(1);
                      ESLVal $619 = _v217.termRef(2);
                      
                      {ESLVal _v507 = _v216;
                      
                      {ESLVal l = $621;
                      
                      {ESLVal op = $620;
                      
                      {ESLVal args = $619;
                      
                      return typeEqual.apply(_v507,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                      ESLVal $617 = _v217.termRef(1);
                      ESLVal $616 = _v217.termRef(2);
                      ESLVal $615 = _v217.termRef(3);
                      
                      {ESLVal _v505 = _v216;
                      
                      {ESLVal l2 = $618;
                      
                      {ESLVal _v506 = $617;
                      
                      {ESLVal ds2 = $616;
                      
                      {ESLVal ms2 = $615;
                      
                      return typeEqual.apply(_v505,flattenAct.apply(l2,_v506,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $614 = _v217.termRef(0);
                      
                      {ESLVal t = _v216;
                      
                      {ESLVal l1 = $614;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $613 = _v217.termRef(0);
                      ESLVal $612 = _v217.termRef(1);
                      ESLVal $611 = _v217.termRef(2);
                      
                      {ESLVal _v504 = _v216;
                      
                      {ESLVal l2 = $613;
                      
                      {ESLVal n2 = $612;
                      
                      {ESLVal args2 = $611;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                      
                      {ESLVal _v503 = _v216;
                      
                      {ESLVal f = $610;
                      
                      return typeEqual.apply(_v503,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $609 = _v217.termRef(0);
                      ESLVal $608 = _v217.termRef(1);
                      ESLVal $607 = _v217.termRef(2);
                      
                      {ESLVal _v501 = _v216;
                      
                      {ESLVal l2 = $609;
                      
                      {ESLVal n2 = $608;
                      
                      {ESLVal _v502 = $607;
                      
                      return typeEqual.apply(_v501,substType.apply(new ESLVal("RecType",l2,n2,_v502),n2,_v502));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $606 = _v217.termRef(0);
                      ESLVal $605 = _v217.termRef(1);
                      ESLVal $604 = _v217.termRef(2);
                      
                      {ESLVal _v499 = _v216;
                      
                      {ESLVal l1 = $606;
                      
                      {ESLVal ns2 = $605;
                      
                      {ESLVal _v500 = $604;
                      
                      return typeEqual.apply(_v499,_v500);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v508 = _v216;
                      
                      {ESLVal _v509 = _v217;
                      
                      return $false;
                    }
                    }
                  }
                  }
                else if($696.isNil())
                  switch($692.termName) {
                    case "SetType": {ESLVal $700 = $692.termRef(0);
                      ESLVal $699 = $692.termRef(1);
                      
                      switch($699.termName) {
                      case "VarType": {ESLVal $702 = $699.termRef(0);
                        ESLVal $701 = $699.termRef(1);
                        
                        {ESLVal l1 = $691;
                        
                        {ESLVal _v510 = $690;
                        
                        {ESLVal l2 = $694;
                        
                        {ESLVal v1 = $695;
                        
                        {ESLVal l3 = $700;
                        
                        {ESLVal l4 = $702;
                        
                        {ESLVal v2 = $701;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v217.termName) {
                            case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                              ESLVal $620 = _v217.termRef(1);
                              ESLVal $619 = _v217.termRef(2);
                              
                              {ESLVal _v524 = _v216;
                              
                              {ESLVal l = $621;
                              
                              {ESLVal op = $620;
                              
                              {ESLVal args = $619;
                              
                              return typeEqual.apply(_v524,applyTypeFun.apply(l,forceType.apply(op),args));
                            }
                            }
                            }
                            }
                            }
                          case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                              ESLVal $617 = _v217.termRef(1);
                              ESLVal $616 = _v217.termRef(2);
                              ESLVal $615 = _v217.termRef(3);
                              
                              {ESLVal _v521 = _v216;
                              
                              {ESLVal _v522 = $618;
                              
                              {ESLVal _v523 = $617;
                              
                              {ESLVal ds2 = $616;
                              
                              {ESLVal ms2 = $615;
                              
                              return typeEqual.apply(_v521,flattenAct.apply(_v522,_v523,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "VoidType": {ESLVal $614 = _v217.termRef(0);
                              
                              {ESLVal t = _v216;
                              
                              {ESLVal _v520 = $614;
                              
                              return $true;
                            }
                            }
                            }
                          case "TermType": {ESLVal $613 = _v217.termRef(0);
                              ESLVal $612 = _v217.termRef(1);
                              ESLVal $611 = _v217.termRef(2);
                              
                              {ESLVal _v518 = _v216;
                              
                              {ESLVal _v519 = $613;
                              
                              {ESLVal n2 = $612;
                              
                              {ESLVal args2 = $611;
                              
                              return $false;
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                              
                              {ESLVal _v517 = _v216;
                              
                              {ESLVal f = $610;
                              
                              return typeEqual.apply(_v517,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $609 = _v217.termRef(0);
                              ESLVal $608 = _v217.termRef(1);
                              ESLVal $607 = _v217.termRef(2);
                              
                              {ESLVal _v514 = _v216;
                              
                              {ESLVal _v515 = $609;
                              
                              {ESLVal n2 = $608;
                              
                              {ESLVal _v516 = $607;
                              
                              return typeEqual.apply(_v514,substType.apply(new ESLVal("RecType",_v515,n2,_v516),n2,_v516));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $606 = _v217.termRef(0);
                              ESLVal $605 = _v217.termRef(1);
                              ESLVal $604 = _v217.termRef(2);
                              
                              {ESLVal _v511 = _v216;
                              
                              {ESLVal _v512 = $606;
                              
                              {ESLVal ns2 = $605;
                              
                              {ESLVal _v513 = $604;
                              
                              return typeEqual.apply(_v511,_v513);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v525 = _v216;
                              
                              {ESLVal _v526 = _v217;
                              
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
                      default: switch(_v217.termName) {
                        case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                          ESLVal $620 = _v217.termRef(1);
                          ESLVal $619 = _v217.termRef(2);
                          
                          {ESLVal _v535 = _v216;
                          
                          {ESLVal l = $621;
                          
                          {ESLVal op = $620;
                          
                          {ESLVal args = $619;
                          
                          return typeEqual.apply(_v535,applyTypeFun.apply(l,forceType.apply(op),args));
                        }
                        }
                        }
                        }
                        }
                      case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                          ESLVal $617 = _v217.termRef(1);
                          ESLVal $616 = _v217.termRef(2);
                          ESLVal $615 = _v217.termRef(3);
                          
                          {ESLVal _v533 = _v216;
                          
                          {ESLVal l2 = $618;
                          
                          {ESLVal _v534 = $617;
                          
                          {ESLVal ds2 = $616;
                          
                          {ESLVal ms2 = $615;
                          
                          return typeEqual.apply(_v533,flattenAct.apply(l2,_v534,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "VoidType": {ESLVal $614 = _v217.termRef(0);
                          
                          {ESLVal t = _v216;
                          
                          {ESLVal l1 = $614;
                          
                          return $true;
                        }
                        }
                        }
                      case "TermType": {ESLVal $613 = _v217.termRef(0);
                          ESLVal $612 = _v217.termRef(1);
                          ESLVal $611 = _v217.termRef(2);
                          
                          {ESLVal _v532 = _v216;
                          
                          {ESLVal l2 = $613;
                          
                          {ESLVal n2 = $612;
                          
                          {ESLVal args2 = $611;
                          
                          return $false;
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                          
                          {ESLVal _v531 = _v216;
                          
                          {ESLVal f = $610;
                          
                          return typeEqual.apply(_v531,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $609 = _v217.termRef(0);
                          ESLVal $608 = _v217.termRef(1);
                          ESLVal $607 = _v217.termRef(2);
                          
                          {ESLVal _v529 = _v216;
                          
                          {ESLVal l2 = $609;
                          
                          {ESLVal n2 = $608;
                          
                          {ESLVal _v530 = $607;
                          
                          return typeEqual.apply(_v529,substType.apply(new ESLVal("RecType",l2,n2,_v530),n2,_v530));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $606 = _v217.termRef(0);
                          ESLVal $605 = _v217.termRef(1);
                          ESLVal $604 = _v217.termRef(2);
                          
                          {ESLVal _v527 = _v216;
                          
                          {ESLVal l1 = $606;
                          
                          {ESLVal ns2 = $605;
                          
                          {ESLVal _v528 = $604;
                          
                          return typeEqual.apply(_v527,_v528);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v536 = _v216;
                          
                          {ESLVal _v537 = _v217;
                          
                          return $false;
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v217.termName) {
                      case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                        ESLVal $620 = _v217.termRef(1);
                        ESLVal $619 = _v217.termRef(2);
                        
                        {ESLVal _v546 = _v216;
                        
                        {ESLVal l = $621;
                        
                        {ESLVal op = $620;
                        
                        {ESLVal args = $619;
                        
                        return typeEqual.apply(_v546,applyTypeFun.apply(l,forceType.apply(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                        ESLVal $617 = _v217.termRef(1);
                        ESLVal $616 = _v217.termRef(2);
                        ESLVal $615 = _v217.termRef(3);
                        
                        {ESLVal _v544 = _v216;
                        
                        {ESLVal l2 = $618;
                        
                        {ESLVal _v545 = $617;
                        
                        {ESLVal ds2 = $616;
                        
                        {ESLVal ms2 = $615;
                        
                        return typeEqual.apply(_v544,flattenAct.apply(l2,_v545,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $614 = _v217.termRef(0);
                        
                        {ESLVal t = _v216;
                        
                        {ESLVal l1 = $614;
                        
                        return $true;
                      }
                      }
                      }
                    case "TermType": {ESLVal $613 = _v217.termRef(0);
                        ESLVal $612 = _v217.termRef(1);
                        ESLVal $611 = _v217.termRef(2);
                        
                        {ESLVal _v543 = _v216;
                        
                        {ESLVal l2 = $613;
                        
                        {ESLVal n2 = $612;
                        
                        {ESLVal args2 = $611;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                        
                        {ESLVal _v542 = _v216;
                        
                        {ESLVal f = $610;
                        
                        return typeEqual.apply(_v542,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $609 = _v217.termRef(0);
                        ESLVal $608 = _v217.termRef(1);
                        ESLVal $607 = _v217.termRef(2);
                        
                        {ESLVal _v540 = _v216;
                        
                        {ESLVal l2 = $609;
                        
                        {ESLVal n2 = $608;
                        
                        {ESLVal _v541 = $607;
                        
                        return typeEqual.apply(_v540,substType.apply(new ESLVal("RecType",l2,n2,_v541),n2,_v541));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $606 = _v217.termRef(0);
                        ESLVal $605 = _v217.termRef(1);
                        ESLVal $604 = _v217.termRef(2);
                        
                        {ESLVal _v538 = _v216;
                        
                        {ESLVal l1 = $606;
                        
                        {ESLVal ns2 = $605;
                        
                        {ESLVal _v539 = $604;
                        
                        return typeEqual.apply(_v538,_v539);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v547 = _v216;
                        
                        {ESLVal _v548 = _v217;
                        
                        return $false;
                      }
                      }
                    }
                  }
                else switch(_v217.termName) {
                    case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                      ESLVal $620 = _v217.termRef(1);
                      ESLVal $619 = _v217.termRef(2);
                      
                      {ESLVal _v557 = _v216;
                      
                      {ESLVal l = $621;
                      
                      {ESLVal op = $620;
                      
                      {ESLVal args = $619;
                      
                      return typeEqual.apply(_v557,applyTypeFun.apply(l,forceType.apply(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                      ESLVal $617 = _v217.termRef(1);
                      ESLVal $616 = _v217.termRef(2);
                      ESLVal $615 = _v217.termRef(3);
                      
                      {ESLVal _v555 = _v216;
                      
                      {ESLVal l2 = $618;
                      
                      {ESLVal _v556 = $617;
                      
                      {ESLVal ds2 = $616;
                      
                      {ESLVal ms2 = $615;
                      
                      return typeEqual.apply(_v555,flattenAct.apply(l2,_v556,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $614 = _v217.termRef(0);
                      
                      {ESLVal t = _v216;
                      
                      {ESLVal l1 = $614;
                      
                      return $true;
                    }
                    }
                    }
                  case "TermType": {ESLVal $613 = _v217.termRef(0);
                      ESLVal $612 = _v217.termRef(1);
                      ESLVal $611 = _v217.termRef(2);
                      
                      {ESLVal _v554 = _v216;
                      
                      {ESLVal l2 = $613;
                      
                      {ESLVal n2 = $612;
                      
                      {ESLVal args2 = $611;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                      
                      {ESLVal _v553 = _v216;
                      
                      {ESLVal f = $610;
                      
                      return typeEqual.apply(_v553,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $609 = _v217.termRef(0);
                      ESLVal $608 = _v217.termRef(1);
                      ESLVal $607 = _v217.termRef(2);
                      
                      {ESLVal _v551 = _v216;
                      
                      {ESLVal l2 = $609;
                      
                      {ESLVal n2 = $608;
                      
                      {ESLVal _v552 = $607;
                      
                      return typeEqual.apply(_v551,substType.apply(new ESLVal("RecType",l2,n2,_v552),n2,_v552));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $606 = _v217.termRef(0);
                      ESLVal $605 = _v217.termRef(1);
                      ESLVal $604 = _v217.termRef(2);
                      
                      {ESLVal _v549 = _v216;
                      
                      {ESLVal l1 = $606;
                      
                      {ESLVal ns2 = $605;
                      
                      {ESLVal _v550 = $604;
                      
                      return typeEqual.apply(_v549,_v550);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v558 = _v216;
                      
                      {ESLVal _v559 = _v217;
                      
                      return $false;
                    }
                    }
                  }
                }
              else if($693.isNil())
                switch(_v217.termName) {
                  case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                    ESLVal $620 = _v217.termRef(1);
                    ESLVal $619 = _v217.termRef(2);
                    
                    {ESLVal _v568 = _v216;
                    
                    {ESLVal l = $621;
                    
                    {ESLVal op = $620;
                    
                    {ESLVal args = $619;
                    
                    return typeEqual.apply(_v568,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                    ESLVal $617 = _v217.termRef(1);
                    ESLVal $616 = _v217.termRef(2);
                    ESLVal $615 = _v217.termRef(3);
                    
                    {ESLVal _v566 = _v216;
                    
                    {ESLVal l2 = $618;
                    
                    {ESLVal _v567 = $617;
                    
                    {ESLVal ds2 = $616;
                    
                    {ESLVal ms2 = $615;
                    
                    return typeEqual.apply(_v566,flattenAct.apply(l2,_v567,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $614 = _v217.termRef(0);
                    
                    {ESLVal t = _v216;
                    
                    {ESLVal l1 = $614;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $613 = _v217.termRef(0);
                    ESLVal $612 = _v217.termRef(1);
                    ESLVal $611 = _v217.termRef(2);
                    
                    {ESLVal _v565 = _v216;
                    
                    {ESLVal l2 = $613;
                    
                    {ESLVal n2 = $612;
                    
                    {ESLVal args2 = $611;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                    
                    {ESLVal _v564 = _v216;
                    
                    {ESLVal f = $610;
                    
                    return typeEqual.apply(_v564,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $609 = _v217.termRef(0);
                    ESLVal $608 = _v217.termRef(1);
                    ESLVal $607 = _v217.termRef(2);
                    
                    {ESLVal _v562 = _v216;
                    
                    {ESLVal l2 = $609;
                    
                    {ESLVal n2 = $608;
                    
                    {ESLVal _v563 = $607;
                    
                    return typeEqual.apply(_v562,substType.apply(new ESLVal("RecType",l2,n2,_v563),n2,_v563));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $606 = _v217.termRef(0);
                    ESLVal $605 = _v217.termRef(1);
                    ESLVal $604 = _v217.termRef(2);
                    
                    {ESLVal _v560 = _v216;
                    
                    {ESLVal l1 = $606;
                    
                    {ESLVal ns2 = $605;
                    
                    {ESLVal _v561 = $604;
                    
                    return typeEqual.apply(_v560,_v561);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v569 = _v216;
                    
                    {ESLVal _v570 = _v217;
                    
                    return $false;
                  }
                  }
                }
              else switch(_v217.termName) {
                  case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                    ESLVal $620 = _v217.termRef(1);
                    ESLVal $619 = _v217.termRef(2);
                    
                    {ESLVal _v579 = _v216;
                    
                    {ESLVal l = $621;
                    
                    {ESLVal op = $620;
                    
                    {ESLVal args = $619;
                    
                    return typeEqual.apply(_v579,applyTypeFun.apply(l,forceType.apply(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                    ESLVal $617 = _v217.termRef(1);
                    ESLVal $616 = _v217.termRef(2);
                    ESLVal $615 = _v217.termRef(3);
                    
                    {ESLVal _v577 = _v216;
                    
                    {ESLVal l2 = $618;
                    
                    {ESLVal _v578 = $617;
                    
                    {ESLVal ds2 = $616;
                    
                    {ESLVal ms2 = $615;
                    
                    return typeEqual.apply(_v577,flattenAct.apply(l2,_v578,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $614 = _v217.termRef(0);
                    
                    {ESLVal t = _v216;
                    
                    {ESLVal l1 = $614;
                    
                    return $true;
                  }
                  }
                  }
                case "TermType": {ESLVal $613 = _v217.termRef(0);
                    ESLVal $612 = _v217.termRef(1);
                    ESLVal $611 = _v217.termRef(2);
                    
                    {ESLVal _v576 = _v216;
                    
                    {ESLVal l2 = $613;
                    
                    {ESLVal n2 = $612;
                    
                    {ESLVal args2 = $611;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                    
                    {ESLVal _v575 = _v216;
                    
                    {ESLVal f = $610;
                    
                    return typeEqual.apply(_v575,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $609 = _v217.termRef(0);
                    ESLVal $608 = _v217.termRef(1);
                    ESLVal $607 = _v217.termRef(2);
                    
                    {ESLVal _v573 = _v216;
                    
                    {ESLVal l2 = $609;
                    
                    {ESLVal n2 = $608;
                    
                    {ESLVal _v574 = $607;
                    
                    return typeEqual.apply(_v573,substType.apply(new ESLVal("RecType",l2,n2,_v574),n2,_v574));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $606 = _v217.termRef(0);
                    ESLVal $605 = _v217.termRef(1);
                    ESLVal $604 = _v217.termRef(2);
                    
                    {ESLVal _v571 = _v216;
                    
                    {ESLVal l1 = $606;
                    
                    {ESLVal ns2 = $605;
                    
                    {ESLVal _v572 = $604;
                    
                    return typeEqual.apply(_v571,_v572);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v580 = _v216;
                    
                    {ESLVal _v581 = _v217;
                    
                    return $false;
                  }
                  }
                }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v592 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v592,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v590 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v591 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v590,flattenAct.apply(l2,_v591,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v589 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v588 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v588,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v586 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v587 = $607;
                  
                  return typeEqual.apply(_v586,substType.apply(new ESLVal("RecType",l2,n2,_v587),n2,_v587));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v584 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v585 = $604;
                  
                  return typeEqual.apply(_v584,_v585);
                }
                }
                }
                }
                }
                default: {ESLVal _v593 = _v216;
                  
                  {ESLVal _v594 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "StrType": {ESLVal $688 = _v216.termRef(0);
              
              switch(_v217.termName) {
              case "StrType": {ESLVal $689 = _v217.termRef(0);
                
                {ESLVal l1 = $688;
                
                {ESLVal l2 = $689;
                
                return $true;
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v496 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v496,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v494 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v495 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v494,flattenAct.apply(l2,_v495,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v493 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v492 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v492,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v490 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v491 = $607;
                  
                  return typeEqual.apply(_v490,substType.apply(new ESLVal("RecType",l2,n2,_v491),n2,_v491));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v488 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v489 = $604;
                  
                  return typeEqual.apply(_v488,_v489);
                }
                }
                }
                }
                }
                default: {ESLVal _v497 = _v216;
                  
                  {ESLVal _v498 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VoidType": {ESLVal $687 = _v216.termRef(0);
              
              {ESLVal l1 = $687;
              
              {ESLVal t = _v217;
              
              return $true;
            }
            }
            }
          case "FieldType": {ESLVal $683 = _v216.termRef(0);
              ESLVal $682 = _v216.termRef(1);
              ESLVal $681 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "FieldType": {ESLVal $686 = _v217.termRef(0);
                ESLVal $685 = _v217.termRef(1);
                ESLVal $684 = _v217.termRef(2);
                
                {ESLVal l1 = $683;
                
                {ESLVal n1 = $682;
                
                {ESLVal _v475 = $681;
                
                {ESLVal l2 = $686;
                
                {ESLVal n2 = $685;
                
                {ESLVal _v476 = $684;
                
                return n1.eql(n2).and(typeEqual.apply(_v475,_v476));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v485 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v485,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v483 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v484 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v483,flattenAct.apply(l2,_v484,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v482 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v481 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v481,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v479 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v480 = $607;
                  
                  return typeEqual.apply(_v479,substType.apply(new ESLVal("RecType",l2,n2,_v480),n2,_v480));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v477 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v478 = $604;
                  
                  return typeEqual.apply(_v477,_v478);
                }
                }
                }
                }
                }
                default: {ESLVal _v486 = _v216;
                  
                  {ESLVal _v487 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TableType": {ESLVal $677 = _v216.termRef(0);
              ESLVal $676 = _v216.termRef(1);
              ESLVal $675 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "TableType": {ESLVal $680 = _v217.termRef(0);
                ESLVal $679 = _v217.termRef(1);
                ESLVal $678 = _v217.termRef(2);
                
                {ESLVal l1 = $677;
                
                {ESLVal k1 = $676;
                
                {ESLVal v1 = $675;
                
                {ESLVal l2 = $680;
                
                {ESLVal k2 = $679;
                
                {ESLVal v2 = $678;
                
                return typeEqual.apply(k1,k2).and(typeEqual.apply(v1,v2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v472 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v472,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v470 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v471 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v470,flattenAct.apply(l2,_v471,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v469 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v468 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v468,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v466 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v467 = $607;
                  
                  return typeEqual.apply(_v466,substType.apply(new ESLVal("RecType",l2,n2,_v467),n2,_v467));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v464 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v465 = $604;
                  
                  return typeEqual.apply(_v464,_v465);
                }
                }
                }
                }
                }
                default: {ESLVal _v473 = _v216;
                  
                  {ESLVal _v474 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $671 = _v216.termRef(0);
              ESLVal $670 = _v216.termRef(1);
              ESLVal $669 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "TermType": {ESLVal $674 = _v217.termRef(0);
                ESLVal $673 = _v217.termRef(1);
                ESLVal $672 = _v217.termRef(2);
                
                {ESLVal l1 = $671;
                
                {ESLVal n1 = $670;
                
                {ESLVal args1 = $669;
                
                {ESLVal l2 = $674;
                
                {ESLVal n2 = $673;
                
                {ESLVal args2 = $672;
                
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
              default: {ESLVal l1 = $671;
                
                {ESLVal n1 = $670;
                
                {ESLVal args1 = $669;
                
                {ESLVal _v463 = _v217;
                
                return $false;
              }
              }
              }
              }
            }
            }
          case "FunType": {ESLVal $665 = _v216.termRef(0);
              ESLVal $664 = _v216.termRef(1);
              ESLVal $663 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "FunType": {ESLVal $668 = _v217.termRef(0);
                ESLVal $667 = _v217.termRef(1);
                ESLVal $666 = _v217.termRef(2);
                
                {ESLVal l1 = $665;
                
                {ESLVal d1 = $664;
                
                {ESLVal r1 = $663;
                
                {ESLVal l2 = $668;
                
                {ESLVal d2 = $667;
                
                {ESLVal r2 = $666;
                
                return typeEqual.apply(r1,r2).and(typesEqual.apply(d1,d2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v460 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v460,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v458 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v459 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v458,flattenAct.apply(l2,_v459,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v457 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v456 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v456,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v454 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v455 = $607;
                  
                  return typeEqual.apply(_v454,substType.apply(new ESLVal("RecType",l2,n2,_v455),n2,_v455));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v452 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v453 = $604;
                  
                  return typeEqual.apply(_v452,_v453);
                }
                }
                }
                }
                }
                default: {ESLVal _v461 = _v216;
                  
                  {ESLVal _v462 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $662 = _v216.termRef(0);
              
              {ESLVal f = $662;
              
              {ESLVal _v451 = _v217;
              
              return typeEqual.apply(f.apply(),_v451);
            }
            }
            }
          case "RecordType": {ESLVal $659 = _v216.termRef(0);
              ESLVal $658 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "RecordType": {ESLVal $661 = _v217.termRef(0);
                ESLVal $660 = _v217.termRef(1);
                
                {ESLVal l1 = $659;
                
                {ESLVal fs1 = $658;
                
                {ESLVal l2 = $661;
                
                {ESLVal fs2 = $660;
                
                return recordTypeEqual.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v448 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v448,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v446 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v447 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v446,flattenAct.apply(l2,_v447,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v445 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v444 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v444,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v442 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v443 = $607;
                  
                  return typeEqual.apply(_v442,substType.apply(new ESLVal("RecType",l2,n2,_v443),n2,_v443));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v440 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v441 = $604;
                  
                  return typeEqual.apply(_v440,_v441);
                }
                }
                }
                }
                }
                default: {ESLVal _v449 = _v216;
                  
                  {ESLVal _v450 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $654 = _v216.termRef(0);
              ESLVal $653 = _v216.termRef(1);
              ESLVal $652 = _v216.termRef(2);
              
              switch(_v217.termName) {
              case "RecType": {ESLVal $657 = _v217.termRef(0);
                ESLVal $656 = _v217.termRef(1);
                ESLVal $655 = _v217.termRef(2);
                
                {ESLVal l1 = $654;
                
                {ESLVal n1 = $653;
                
                {ESLVal _v432 = $652;
                
                {ESLVal l2 = $657;
                
                {ESLVal n2 = $656;
                
                {ESLVal _v433 = $655;
                
                if(n1.eql(n2).boolVal)
                return typeEqual.apply(_v432,_v433);
                else
                  {ESLVal _v434 = $654;
                    
                    {ESLVal _v435 = $653;
                    
                    {ESLVal _v436 = $652;
                    
                    {ESLVal _v437 = _v217;
                    
                    return typeEqual.apply(substType.apply(new ESLVal("RecType",_v434,_v435,_v436),_v435,_v436),_v437);
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
              default: {ESLVal l1 = $654;
                
                {ESLVal n1 = $653;
                
                {ESLVal _v438 = $652;
                
                {ESLVal _v439 = _v217;
                
                return typeEqual.apply(substType.apply(new ESLVal("RecType",l1,n1,_v438),n1,_v438),_v439);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $649 = _v216.termRef(0);
              ESLVal $648 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "UnionType": {ESLVal $651 = _v217.termRef(0);
                ESLVal $650 = _v217.termRef(1);
                
                {ESLVal l1 = $649;
                
                {ESLVal terms1 = $648;
                
                {ESLVal l2 = $651;
                
                {ESLVal terms2 = $650;
                
                return typeSetEqual.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v429 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v429,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v427 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v428 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v427,flattenAct.apply(l2,_v428,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v426 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v425 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v425,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v423 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v424 = $607;
                  
                  return typeEqual.apply(_v423,substType.apply(new ESLVal("RecType",l2,n2,_v424),n2,_v424));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v421 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v422 = $604;
                  
                  return typeEqual.apply(_v421,_v422);
                }
                }
                }
                }
                }
                default: {ESLVal _v430 = _v216;
                  
                  {ESLVal _v431 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $645 = _v216.termRef(0);
              ESLVal $644 = _v216.termRef(1);
              
              switch(_v217.termName) {
              case "VarType": {ESLVal $647 = _v217.termRef(0);
                ESLVal $646 = _v217.termRef(1);
                
                {ESLVal l1 = $645;
                
                {ESLVal n1 = $644;
                
                {ESLVal l2 = $647;
                
                {ESLVal n2 = $646;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v217.termName) {
                case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                  ESLVal $620 = _v217.termRef(1);
                  ESLVal $619 = _v217.termRef(2);
                  
                  {ESLVal _v418 = _v216;
                  
                  {ESLVal l = $621;
                  
                  {ESLVal op = $620;
                  
                  {ESLVal args = $619;
                  
                  return typeEqual.apply(_v418,applyTypeFun.apply(l,forceType.apply(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                  ESLVal $617 = _v217.termRef(1);
                  ESLVal $616 = _v217.termRef(2);
                  ESLVal $615 = _v217.termRef(3);
                  
                  {ESLVal _v416 = _v216;
                  
                  {ESLVal l2 = $618;
                  
                  {ESLVal _v417 = $617;
                  
                  {ESLVal ds2 = $616;
                  
                  {ESLVal ms2 = $615;
                  
                  return typeEqual.apply(_v416,flattenAct.apply(l2,_v417,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $614 = _v217.termRef(0);
                  
                  {ESLVal t = _v216;
                  
                  {ESLVal l1 = $614;
                  
                  return $true;
                }
                }
                }
              case "TermType": {ESLVal $613 = _v217.termRef(0);
                  ESLVal $612 = _v217.termRef(1);
                  ESLVal $611 = _v217.termRef(2);
                  
                  {ESLVal _v415 = _v216;
                  
                  {ESLVal l2 = $613;
                  
                  {ESLVal n2 = $612;
                  
                  {ESLVal args2 = $611;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                  
                  {ESLVal _v414 = _v216;
                  
                  {ESLVal f = $610;
                  
                  return typeEqual.apply(_v414,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $609 = _v217.termRef(0);
                  ESLVal $608 = _v217.termRef(1);
                  ESLVal $607 = _v217.termRef(2);
                  
                  {ESLVal _v412 = _v216;
                  
                  {ESLVal l2 = $609;
                  
                  {ESLVal n2 = $608;
                  
                  {ESLVal _v413 = $607;
                  
                  return typeEqual.apply(_v412,substType.apply(new ESLVal("RecType",l2,n2,_v413),n2,_v413));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $606 = _v217.termRef(0);
                  ESLVal $605 = _v217.termRef(1);
                  ESLVal $604 = _v217.termRef(2);
                  
                  {ESLVal _v410 = _v216;
                  
                  {ESLVal l1 = $606;
                  
                  {ESLVal ns2 = $605;
                  
                  {ESLVal _v411 = $604;
                  
                  return typeEqual.apply(_v410,_v411);
                }
                }
                }
                }
                }
                default: {ESLVal _v419 = _v216;
                  
                  {ESLVal _v420 = _v217;
                  
                  return $false;
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $624 = _v216.termRef(0);
              ESLVal $623 = _v216.termRef(1);
              ESLVal $622 = _v216.termRef(2);
              
              if($623.isCons())
              {ESLVal $628 = $623.head();
                ESLVal $629 = $623.tail();
                
                if($629.isCons())
                {ESLVal $630 = $629.head();
                  ESLVal $631 = $629.tail();
                  
                  switch(_v217.termName) {
                  case "ForallType": {ESLVal $627 = _v217.termRef(0);
                    ESLVal $626 = _v217.termRef(1);
                    ESLVal $625 = _v217.termRef(2);
                    
                    {ESLVal l1 = $624;
                    
                    {ESLVal ns1 = $623;
                    
                    {ESLVal _v358 = $622;
                    
                    {ESLVal l2 = $627;
                    
                    {ESLVal ns2 = $626;
                    
                    {ESLVal _v359 = $625;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v358,_v359));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $624;
                    
                    {ESLVal ns1 = $623;
                    
                    {ESLVal _v360 = $622;
                    
                    {ESLVal _v361 = _v217;
                    
                    return typeEqual.apply(_v360,_v361);
                  }
                  }
                  }
                  }
                }
                }
              else if($629.isNil())
                switch($622.termName) {
                  case "ListType": {ESLVal $639 = $622.termRef(0);
                    ESLVal $638 = $622.termRef(1);
                    
                    switch($638.termName) {
                    case "VarType": {ESLVal $641 = $638.termRef(0);
                      ESLVal $640 = $638.termRef(1);
                      
                      switch(_v217.termName) {
                      case "ListType": {ESLVal $643 = _v217.termRef(0);
                        ESLVal $642 = _v217.termRef(1);
                        
                        {ESLVal l2 = $624;
                        
                        {ESLVal v1 = $628;
                        
                        {ESLVal l3 = $639;
                        
                        {ESLVal l4 = $641;
                        
                        {ESLVal v2 = $640;
                        
                        {ESLVal l1 = $643;
                        
                        {ESLVal _v378 = $642;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v217.termName) {
                            case "ForallType": {ESLVal $627 = _v217.termRef(0);
                              ESLVal $626 = _v217.termRef(1);
                              ESLVal $625 = _v217.termRef(2);
                              
                              {ESLVal _v379 = $624;
                              
                              {ESLVal ns1 = $623;
                              
                              {ESLVal _v380 = $622;
                              
                              {ESLVal _v381 = $627;
                              
                              {ESLVal ns2 = $626;
                              
                              {ESLVal _v382 = $625;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v380,_v382));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v383 = $624;
                              
                              {ESLVal ns1 = $623;
                              
                              {ESLVal _v384 = $622;
                              
                              {ESLVal _v385 = _v217;
                              
                              return typeEqual.apply(_v384,_v385);
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
                      default: switch(_v217.termName) {
                        case "ForallType": {ESLVal $627 = _v217.termRef(0);
                          ESLVal $626 = _v217.termRef(1);
                          ESLVal $625 = _v217.termRef(2);
                          
                          {ESLVal l1 = $624;
                          
                          {ESLVal ns1 = $623;
                          
                          {ESLVal _v386 = $622;
                          
                          {ESLVal l2 = $627;
                          
                          {ESLVal ns2 = $626;
                          
                          {ESLVal _v387 = $625;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v386,_v387));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $624;
                          
                          {ESLVal ns1 = $623;
                          
                          {ESLVal _v388 = $622;
                          
                          {ESLVal _v389 = _v217;
                          
                          return typeEqual.apply(_v388,_v389);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v217.termName) {
                      case "ForallType": {ESLVal $627 = _v217.termRef(0);
                        ESLVal $626 = _v217.termRef(1);
                        ESLVal $625 = _v217.termRef(2);
                        
                        {ESLVal l1 = $624;
                        
                        {ESLVal ns1 = $623;
                        
                        {ESLVal _v390 = $622;
                        
                        {ESLVal l2 = $627;
                        
                        {ESLVal ns2 = $626;
                        
                        {ESLVal _v391 = $625;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v390,_v391));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $624;
                        
                        {ESLVal ns1 = $623;
                        
                        {ESLVal _v392 = $622;
                        
                        {ESLVal _v393 = _v217;
                        
                        return typeEqual.apply(_v392,_v393);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                case "SetType": {ESLVal $633 = $622.termRef(0);
                    ESLVal $632 = $622.termRef(1);
                    
                    switch($632.termName) {
                    case "VarType": {ESLVal $635 = $632.termRef(0);
                      ESLVal $634 = $632.termRef(1);
                      
                      switch(_v217.termName) {
                      case "SetType": {ESLVal $637 = _v217.termRef(0);
                        ESLVal $636 = _v217.termRef(1);
                        
                        {ESLVal l2 = $624;
                        
                        {ESLVal v1 = $628;
                        
                        {ESLVal l3 = $633;
                        
                        {ESLVal l4 = $635;
                        
                        {ESLVal v2 = $634;
                        
                        {ESLVal l1 = $637;
                        
                        {ESLVal _v362 = $636;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v217.termName) {
                            case "ForallType": {ESLVal $627 = _v217.termRef(0);
                              ESLVal $626 = _v217.termRef(1);
                              ESLVal $625 = _v217.termRef(2);
                              
                              {ESLVal _v363 = $624;
                              
                              {ESLVal ns1 = $623;
                              
                              {ESLVal _v364 = $622;
                              
                              {ESLVal _v365 = $627;
                              
                              {ESLVal ns2 = $626;
                              
                              {ESLVal _v366 = $625;
                              
                              return ns1.eql(ns2).and(typeEqual.apply(_v364,_v366));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v367 = $624;
                              
                              {ESLVal ns1 = $623;
                              
                              {ESLVal _v368 = $622;
                              
                              {ESLVal _v369 = _v217;
                              
                              return typeEqual.apply(_v368,_v369);
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
                      default: switch(_v217.termName) {
                        case "ForallType": {ESLVal $627 = _v217.termRef(0);
                          ESLVal $626 = _v217.termRef(1);
                          ESLVal $625 = _v217.termRef(2);
                          
                          {ESLVal l1 = $624;
                          
                          {ESLVal ns1 = $623;
                          
                          {ESLVal _v370 = $622;
                          
                          {ESLVal l2 = $627;
                          
                          {ESLVal ns2 = $626;
                          
                          {ESLVal _v371 = $625;
                          
                          return ns1.eql(ns2).and(typeEqual.apply(_v370,_v371));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $624;
                          
                          {ESLVal ns1 = $623;
                          
                          {ESLVal _v372 = $622;
                          
                          {ESLVal _v373 = _v217;
                          
                          return typeEqual.apply(_v372,_v373);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v217.termName) {
                      case "ForallType": {ESLVal $627 = _v217.termRef(0);
                        ESLVal $626 = _v217.termRef(1);
                        ESLVal $625 = _v217.termRef(2);
                        
                        {ESLVal l1 = $624;
                        
                        {ESLVal ns1 = $623;
                        
                        {ESLVal _v374 = $622;
                        
                        {ESLVal l2 = $627;
                        
                        {ESLVal ns2 = $626;
                        
                        {ESLVal _v375 = $625;
                        
                        return ns1.eql(ns2).and(typeEqual.apply(_v374,_v375));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $624;
                        
                        {ESLVal ns1 = $623;
                        
                        {ESLVal _v376 = $622;
                        
                        {ESLVal _v377 = _v217;
                        
                        return typeEqual.apply(_v376,_v377);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v217.termName) {
                    case "ForallType": {ESLVal $627 = _v217.termRef(0);
                      ESLVal $626 = _v217.termRef(1);
                      ESLVal $625 = _v217.termRef(2);
                      
                      {ESLVal l1 = $624;
                      
                      {ESLVal ns1 = $623;
                      
                      {ESLVal _v394 = $622;
                      
                      {ESLVal l2 = $627;
                      
                      {ESLVal ns2 = $626;
                      
                      {ESLVal _v395 = $625;
                      
                      return ns1.eql(ns2).and(typeEqual.apply(_v394,_v395));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $624;
                      
                      {ESLVal ns1 = $623;
                      
                      {ESLVal _v396 = $622;
                      
                      {ESLVal _v397 = _v217;
                      
                      return typeEqual.apply(_v396,_v397);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v217.termName) {
                  case "ForallType": {ESLVal $627 = _v217.termRef(0);
                    ESLVal $626 = _v217.termRef(1);
                    ESLVal $625 = _v217.termRef(2);
                    
                    {ESLVal l1 = $624;
                    
                    {ESLVal ns1 = $623;
                    
                    {ESLVal _v398 = $622;
                    
                    {ESLVal l2 = $627;
                    
                    {ESLVal ns2 = $626;
                    
                    {ESLVal _v399 = $625;
                    
                    return ns1.eql(ns2).and(typeEqual.apply(_v398,_v399));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $624;
                    
                    {ESLVal ns1 = $623;
                    
                    {ESLVal _v400 = $622;
                    
                    {ESLVal _v401 = _v217;
                    
                    return typeEqual.apply(_v400,_v401);
                  }
                  }
                  }
                  }
                }
              }
            else if($623.isNil())
              switch(_v217.termName) {
                case "ForallType": {ESLVal $627 = _v217.termRef(0);
                  ESLVal $626 = _v217.termRef(1);
                  ESLVal $625 = _v217.termRef(2);
                  
                  {ESLVal l1 = $624;
                  
                  {ESLVal ns1 = $623;
                  
                  {ESLVal _v402 = $622;
                  
                  {ESLVal l2 = $627;
                  
                  {ESLVal ns2 = $626;
                  
                  {ESLVal _v403 = $625;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v402,_v403));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $624;
                  
                  {ESLVal ns1 = $623;
                  
                  {ESLVal _v404 = $622;
                  
                  {ESLVal _v405 = _v217;
                  
                  return typeEqual.apply(_v404,_v405);
                }
                }
                }
                }
              }
            else switch(_v217.termName) {
                case "ForallType": {ESLVal $627 = _v217.termRef(0);
                  ESLVal $626 = _v217.termRef(1);
                  ESLVal $625 = _v217.termRef(2);
                  
                  {ESLVal l1 = $624;
                  
                  {ESLVal ns1 = $623;
                  
                  {ESLVal _v406 = $622;
                  
                  {ESLVal l2 = $627;
                  
                  {ESLVal ns2 = $626;
                  
                  {ESLVal _v407 = $625;
                  
                  return ns1.eql(ns2).and(typeEqual.apply(_v406,_v407));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $624;
                  
                  {ESLVal ns1 = $623;
                  
                  {ESLVal _v408 = $622;
                  
                  {ESLVal _v409 = _v217;
                  
                  return typeEqual.apply(_v408,_v409);
                }
                }
                }
                }
              }
            }
            default: switch(_v217.termName) {
              case "ApplyTypeFun": {ESLVal $621 = _v217.termRef(0);
                ESLVal $620 = _v217.termRef(1);
                ESLVal $619 = _v217.termRef(2);
                
                {ESLVal _v772 = _v216;
                
                {ESLVal l = $621;
                
                {ESLVal op = $620;
                
                {ESLVal args = $619;
                
                return typeEqual.apply(_v772,applyTypeFun.apply(l,forceType.apply(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $618 = _v217.termRef(0);
                ESLVal $617 = _v217.termRef(1);
                ESLVal $616 = _v217.termRef(2);
                ESLVal $615 = _v217.termRef(3);
                
                {ESLVal _v770 = _v216;
                
                {ESLVal l2 = $618;
                
                {ESLVal _v771 = $617;
                
                {ESLVal ds2 = $616;
                
                {ESLVal ms2 = $615;
                
                return typeEqual.apply(_v770,flattenAct.apply(l2,_v771,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $614 = _v217.termRef(0);
                
                {ESLVal t = _v216;
                
                {ESLVal l1 = $614;
                
                return $true;
              }
              }
              }
            case "TermType": {ESLVal $613 = _v217.termRef(0);
                ESLVal $612 = _v217.termRef(1);
                ESLVal $611 = _v217.termRef(2);
                
                {ESLVal _v769 = _v216;
                
                {ESLVal l2 = $613;
                
                {ESLVal n2 = $612;
                
                {ESLVal args2 = $611;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $610 = _v217.termRef(0);
                
                {ESLVal _v768 = _v216;
                
                {ESLVal f = $610;
                
                return typeEqual.apply(_v768,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $609 = _v217.termRef(0);
                ESLVal $608 = _v217.termRef(1);
                ESLVal $607 = _v217.termRef(2);
                
                {ESLVal _v766 = _v216;
                
                {ESLVal l2 = $609;
                
                {ESLVal n2 = $608;
                
                {ESLVal _v767 = $607;
                
                return typeEqual.apply(_v766,substType.apply(new ESLVal("RecType",l2,n2,_v767),n2,_v767));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $606 = _v217.termRef(0);
                ESLVal $605 = _v217.termRef(1);
                ESLVal $604 = _v217.termRef(2);
                
                {ESLVal _v764 = _v216;
                
                {ESLVal l1 = $606;
                
                {ESLVal ns2 = $605;
                
                {ESLVal _v765 = $604;
                
                return typeEqual.apply(_v764,_v765);
              }
              }
              }
              }
              }
              default: {ESLVal _v773 = _v216;
                
                {ESLVal _v774 = _v217;
                
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
          {ESLVal _v218 = sub;
            ESLVal _v219 = parent;
            
            switch(_v218.termName) {
            case "ActType": {ESLVal $854 = _v218.termRef(0);
              ESLVal $853 = _v218.termRef(1);
              ESLVal $852 = _v218.termRef(2);
              
              switch(_v219.termName) {
              case "ActType": {ESLVal $857 = _v219.termRef(0);
                ESLVal $856 = _v219.termRef(1);
                ESLVal $855 = _v219.termRef(2);
                
                {ESLVal l1 = $854;
                
                {ESLVal exports1 = $853;
                
                {ESLVal handlers1 = $852;
                
                {ESLVal l2 = $857;
                
                {ESLVal exports2 = $856;
                
                {ESLVal handlers2 = $855;
                
                return actSubType.apply(exports1,exports2,handlers1,handlers2);
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ExtendedAct": {ESLVal $851 = _v218.termRef(0);
              ESLVal $850 = _v218.termRef(1);
              ESLVal $849 = _v218.termRef(2);
              ESLVal $848 = _v218.termRef(3);
              
              {ESLVal l1 = $851;
              
              {ESLVal t1 = $850;
              
              {ESLVal ds1 = $849;
              
              {ESLVal ms1 = $848;
              
              {ESLVal t2 = _v219;
              
              return subType.apply(flattenAct.apply(l1,t1,ds1,ms1),t2);
            }
            }
            }
            }
            }
            }
          case "ListType": {ESLVal $834 = _v218.termRef(0);
              ESLVal $833 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "ListType": {ESLVal $847 = _v219.termRef(0);
                ESLVal $846 = _v219.termRef(1);
                
                {ESLVal l1 = $834;
                
                {ESLVal t1 = $833;
                
                {ESLVal l2 = $847;
                
                {ESLVal t2 = $846;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $837 = _v219.termRef(0);
                ESLVal $836 = _v219.termRef(1);
                ESLVal $835 = _v219.termRef(2);
                
                if($836.isCons())
                {ESLVal $838 = $836.head();
                  ESLVal $839 = $836.tail();
                  
                  if($839.isCons())
                  {ESLVal $840 = $839.head();
                    ESLVal $841 = $839.tail();
                    
                    switch(_v219.termName) {
                    case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                      ESLVal $759 = _v219.termRef(1);
                      ESLVal $758 = _v219.termRef(2);
                      ESLVal $757 = _v219.termRef(3);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $760;
                      
                      {ESLVal t2 = $759;
                      
                      {ESLVal ds2 = $758;
                      
                      {ESLVal ms2 = $757;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal f = $756;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $755 = _v219.termRef(0);
                      ESLVal $754 = _v219.termRef(1);
                      ESLVal $753 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $755;
                      
                      {ESLVal n2 = $754;
                      
                      {ESLVal t2 = $753;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $752 = _v219.termRef(0);
                      ESLVal $751 = _v219.termRef(1);
                      ESLVal $750 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l1 = $752;
                      
                      {ESLVal ns2 = $751;
                      
                      {ESLVal t2 = $750;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v218;
                      
                      {ESLVal t2 = _v219;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                  }
                else if($839.isNil())
                  switch($835.termName) {
                    case "ListType": {ESLVal $843 = $835.termRef(0);
                      ESLVal $842 = $835.termRef(1);
                      
                      switch($842.termName) {
                      case "VarType": {ESLVal $845 = $842.termRef(0);
                        ESLVal $844 = $842.termRef(1);
                        
                        {ESLVal l1 = $834;
                        
                        {ESLVal t1 = $833;
                        
                        {ESLVal l2 = $837;
                        
                        {ESLVal v1 = $838;
                        
                        {ESLVal l3 = $843;
                        
                        {ESLVal l4 = $845;
                        
                        {ESLVal v2 = $844;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v219.termName) {
                            case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                              ESLVal $759 = _v219.termRef(1);
                              ESLVal $758 = _v219.termRef(2);
                              ESLVal $757 = _v219.termRef(3);
                              
                              {ESLVal _v355 = _v218;
                              
                              {ESLVal _v356 = $760;
                              
                              {ESLVal t2 = $759;
                              
                              {ESLVal ds2 = $758;
                              
                              {ESLVal ms2 = $757;
                              
                              return subType.apply(_v355,flattenAct.apply(_v356,t2,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                              
                              {ESLVal _v354 = _v218;
                              
                              {ESLVal f = $756;
                              
                              return subType.apply(_v354,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $755 = _v219.termRef(0);
                              ESLVal $754 = _v219.termRef(1);
                              ESLVal $753 = _v219.termRef(2);
                              
                              {ESLVal _v352 = _v218;
                              
                              {ESLVal _v353 = $755;
                              
                              {ESLVal n2 = $754;
                              
                              {ESLVal t2 = $753;
                              
                              return subType.apply(_v352,substType.apply(new ESLVal("RecType",_v353,n2,t2),n2,t2));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $752 = _v219.termRef(0);
                              ESLVal $751 = _v219.termRef(1);
                              ESLVal $750 = _v219.termRef(2);
                              
                              {ESLVal _v350 = _v218;
                              
                              {ESLVal _v351 = $752;
                              
                              {ESLVal ns2 = $751;
                              
                              {ESLVal t2 = $750;
                              
                              return subType.apply(_v350,t2);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v357 = _v218;
                              
                              {ESLVal t2 = _v219;
                              
                              return typeEqual.apply(_v357,t2);
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
                      default: switch(_v219.termName) {
                        case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                          ESLVal $759 = _v219.termRef(1);
                          ESLVal $758 = _v219.termRef(2);
                          ESLVal $757 = _v219.termRef(3);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l2 = $760;
                          
                          {ESLVal t2 = $759;
                          
                          {ESLVal ds2 = $758;
                          
                          {ESLVal ms2 = $757;
                          
                          return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal f = $756;
                          
                          return subType.apply(t1,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $755 = _v219.termRef(0);
                          ESLVal $754 = _v219.termRef(1);
                          ESLVal $753 = _v219.termRef(2);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l2 = $755;
                          
                          {ESLVal n2 = $754;
                          
                          {ESLVal t2 = $753;
                          
                          return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $752 = _v219.termRef(0);
                          ESLVal $751 = _v219.termRef(1);
                          ESLVal $750 = _v219.termRef(2);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l1 = $752;
                          
                          {ESLVal ns2 = $751;
                          
                          {ESLVal t2 = $750;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v218;
                          
                          {ESLVal t2 = _v219;
                          
                          return typeEqual.apply(t1,t2);
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v219.termName) {
                      case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                        ESLVal $759 = _v219.termRef(1);
                        ESLVal $758 = _v219.termRef(2);
                        ESLVal $757 = _v219.termRef(3);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l2 = $760;
                        
                        {ESLVal t2 = $759;
                        
                        {ESLVal ds2 = $758;
                        
                        {ESLVal ms2 = $757;
                        
                        return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal f = $756;
                        
                        return subType.apply(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $755 = _v219.termRef(0);
                        ESLVal $754 = _v219.termRef(1);
                        ESLVal $753 = _v219.termRef(2);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l2 = $755;
                        
                        {ESLVal n2 = $754;
                        
                        {ESLVal t2 = $753;
                        
                        return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $752 = _v219.termRef(0);
                        ESLVal $751 = _v219.termRef(1);
                        ESLVal $750 = _v219.termRef(2);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l1 = $752;
                        
                        {ESLVal ns2 = $751;
                        
                        {ESLVal t2 = $750;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v218;
                        
                        {ESLVal t2 = _v219;
                        
                        return typeEqual.apply(t1,t2);
                      }
                      }
                    }
                  }
                else switch(_v219.termName) {
                    case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                      ESLVal $759 = _v219.termRef(1);
                      ESLVal $758 = _v219.termRef(2);
                      ESLVal $757 = _v219.termRef(3);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $760;
                      
                      {ESLVal t2 = $759;
                      
                      {ESLVal ds2 = $758;
                      
                      {ESLVal ms2 = $757;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal f = $756;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $755 = _v219.termRef(0);
                      ESLVal $754 = _v219.termRef(1);
                      ESLVal $753 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $755;
                      
                      {ESLVal n2 = $754;
                      
                      {ESLVal t2 = $753;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $752 = _v219.termRef(0);
                      ESLVal $751 = _v219.termRef(1);
                      ESLVal $750 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l1 = $752;
                      
                      {ESLVal ns2 = $751;
                      
                      {ESLVal t2 = $750;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v218;
                      
                      {ESLVal t2 = _v219;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                }
              else if($836.isNil())
                switch(_v219.termName) {
                  case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                    ESLVal $759 = _v219.termRef(1);
                    ESLVal $758 = _v219.termRef(2);
                    ESLVal $757 = _v219.termRef(3);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $760;
                    
                    {ESLVal t2 = $759;
                    
                    {ESLVal ds2 = $758;
                    
                    {ESLVal ms2 = $757;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal f = $756;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $755 = _v219.termRef(0);
                    ESLVal $754 = _v219.termRef(1);
                    ESLVal $753 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $755;
                    
                    {ESLVal n2 = $754;
                    
                    {ESLVal t2 = $753;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $752 = _v219.termRef(0);
                    ESLVal $751 = _v219.termRef(1);
                    ESLVal $750 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l1 = $752;
                    
                    {ESLVal ns2 = $751;
                    
                    {ESLVal t2 = $750;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v218;
                    
                    {ESLVal t2 = _v219;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              else switch(_v219.termName) {
                  case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                    ESLVal $759 = _v219.termRef(1);
                    ESLVal $758 = _v219.termRef(2);
                    ESLVal $757 = _v219.termRef(3);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $760;
                    
                    {ESLVal t2 = $759;
                    
                    {ESLVal ds2 = $758;
                    
                    {ESLVal ms2 = $757;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal f = $756;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $755 = _v219.termRef(0);
                    ESLVal $754 = _v219.termRef(1);
                    ESLVal $753 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $755;
                    
                    {ESLVal n2 = $754;
                    
                    {ESLVal t2 = $753;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $752 = _v219.termRef(0);
                    ESLVal $751 = _v219.termRef(1);
                    ESLVal $750 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l1 = $752;
                    
                    {ESLVal ns2 = $751;
                    
                    {ESLVal t2 = $750;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v218;
                    
                    {ESLVal t2 = _v219;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "BagType": {ESLVal $830 = _v218.termRef(0);
              ESLVal $829 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "BagType": {ESLVal $832 = _v219.termRef(0);
                ESLVal $831 = _v219.termRef(1);
                
                {ESLVal l1 = $830;
                
                {ESLVal t1 = $829;
                
                {ESLVal l2 = $832;
                
                {ESLVal t2 = $831;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "SetType": {ESLVal $815 = _v218.termRef(0);
              ESLVal $814 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "SetType": {ESLVal $828 = _v219.termRef(0);
                ESLVal $827 = _v219.termRef(1);
                
                {ESLVal l1 = $815;
                
                {ESLVal t1 = $814;
                
                {ESLVal l2 = $828;
                
                {ESLVal t2 = $827;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $818 = _v219.termRef(0);
                ESLVal $817 = _v219.termRef(1);
                ESLVal $816 = _v219.termRef(2);
                
                if($817.isCons())
                {ESLVal $819 = $817.head();
                  ESLVal $820 = $817.tail();
                  
                  if($820.isCons())
                  {ESLVal $821 = $820.head();
                    ESLVal $822 = $820.tail();
                    
                    switch(_v219.termName) {
                    case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                      ESLVal $759 = _v219.termRef(1);
                      ESLVal $758 = _v219.termRef(2);
                      ESLVal $757 = _v219.termRef(3);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $760;
                      
                      {ESLVal t2 = $759;
                      
                      {ESLVal ds2 = $758;
                      
                      {ESLVal ms2 = $757;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal f = $756;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $755 = _v219.termRef(0);
                      ESLVal $754 = _v219.termRef(1);
                      ESLVal $753 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $755;
                      
                      {ESLVal n2 = $754;
                      
                      {ESLVal t2 = $753;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $752 = _v219.termRef(0);
                      ESLVal $751 = _v219.termRef(1);
                      ESLVal $750 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l1 = $752;
                      
                      {ESLVal ns2 = $751;
                      
                      {ESLVal t2 = $750;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v218;
                      
                      {ESLVal t2 = _v219;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                  }
                else if($820.isNil())
                  switch($816.termName) {
                    case "SetType": {ESLVal $824 = $816.termRef(0);
                      ESLVal $823 = $816.termRef(1);
                      
                      switch($823.termName) {
                      case "VarType": {ESLVal $826 = $823.termRef(0);
                        ESLVal $825 = $823.termRef(1);
                        
                        {ESLVal l1 = $815;
                        
                        {ESLVal t1 = $814;
                        
                        {ESLVal l2 = $818;
                        
                        {ESLVal v1 = $819;
                        
                        {ESLVal l3 = $824;
                        
                        {ESLVal l4 = $826;
                        
                        {ESLVal v2 = $825;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v219.termName) {
                            case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                              ESLVal $759 = _v219.termRef(1);
                              ESLVal $758 = _v219.termRef(2);
                              ESLVal $757 = _v219.termRef(3);
                              
                              {ESLVal _v347 = _v218;
                              
                              {ESLVal _v348 = $760;
                              
                              {ESLVal t2 = $759;
                              
                              {ESLVal ds2 = $758;
                              
                              {ESLVal ms2 = $757;
                              
                              return subType.apply(_v347,flattenAct.apply(_v348,t2,ds2,ms2));
                            }
                            }
                            }
                            }
                            }
                            }
                          case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                              
                              {ESLVal _v346 = _v218;
                              
                              {ESLVal f = $756;
                              
                              return subType.apply(_v346,f.apply());
                            }
                            }
                            }
                          case "RecType": {ESLVal $755 = _v219.termRef(0);
                              ESLVal $754 = _v219.termRef(1);
                              ESLVal $753 = _v219.termRef(2);
                              
                              {ESLVal _v344 = _v218;
                              
                              {ESLVal _v345 = $755;
                              
                              {ESLVal n2 = $754;
                              
                              {ESLVal t2 = $753;
                              
                              return subType.apply(_v344,substType.apply(new ESLVal("RecType",_v345,n2,t2),n2,t2));
                            }
                            }
                            }
                            }
                            }
                          case "ForallType": {ESLVal $752 = _v219.termRef(0);
                              ESLVal $751 = _v219.termRef(1);
                              ESLVal $750 = _v219.termRef(2);
                              
                              {ESLVal _v342 = _v218;
                              
                              {ESLVal _v343 = $752;
                              
                              {ESLVal ns2 = $751;
                              
                              {ESLVal t2 = $750;
                              
                              return subType.apply(_v342,t2);
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v349 = _v218;
                              
                              {ESLVal t2 = _v219;
                              
                              return typeEqual.apply(_v349,t2);
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
                      default: switch(_v219.termName) {
                        case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                          ESLVal $759 = _v219.termRef(1);
                          ESLVal $758 = _v219.termRef(2);
                          ESLVal $757 = _v219.termRef(3);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l2 = $760;
                          
                          {ESLVal t2 = $759;
                          
                          {ESLVal ds2 = $758;
                          
                          {ESLVal ms2 = $757;
                          
                          return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                        }
                        }
                        }
                        }
                        }
                        }
                      case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal f = $756;
                          
                          return subType.apply(t1,f.apply());
                        }
                        }
                        }
                      case "RecType": {ESLVal $755 = _v219.termRef(0);
                          ESLVal $754 = _v219.termRef(1);
                          ESLVal $753 = _v219.termRef(2);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l2 = $755;
                          
                          {ESLVal n2 = $754;
                          
                          {ESLVal t2 = $753;
                          
                          return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                        }
                        }
                        }
                        }
                        }
                      case "ForallType": {ESLVal $752 = _v219.termRef(0);
                          ESLVal $751 = _v219.termRef(1);
                          ESLVal $750 = _v219.termRef(2);
                          
                          {ESLVal t1 = _v218;
                          
                          {ESLVal l1 = $752;
                          
                          {ESLVal ns2 = $751;
                          
                          {ESLVal t2 = $750;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v218;
                          
                          {ESLVal t2 = _v219;
                          
                          return typeEqual.apply(t1,t2);
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v219.termName) {
                      case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                        ESLVal $759 = _v219.termRef(1);
                        ESLVal $758 = _v219.termRef(2);
                        ESLVal $757 = _v219.termRef(3);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l2 = $760;
                        
                        {ESLVal t2 = $759;
                        
                        {ESLVal ds2 = $758;
                        
                        {ESLVal ms2 = $757;
                        
                        return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal f = $756;
                        
                        return subType.apply(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $755 = _v219.termRef(0);
                        ESLVal $754 = _v219.termRef(1);
                        ESLVal $753 = _v219.termRef(2);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l2 = $755;
                        
                        {ESLVal n2 = $754;
                        
                        {ESLVal t2 = $753;
                        
                        return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $752 = _v219.termRef(0);
                        ESLVal $751 = _v219.termRef(1);
                        ESLVal $750 = _v219.termRef(2);
                        
                        {ESLVal t1 = _v218;
                        
                        {ESLVal l1 = $752;
                        
                        {ESLVal ns2 = $751;
                        
                        {ESLVal t2 = $750;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v218;
                        
                        {ESLVal t2 = _v219;
                        
                        return typeEqual.apply(t1,t2);
                      }
                      }
                    }
                  }
                else switch(_v219.termName) {
                    case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                      ESLVal $759 = _v219.termRef(1);
                      ESLVal $758 = _v219.termRef(2);
                      ESLVal $757 = _v219.termRef(3);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $760;
                      
                      {ESLVal t2 = $759;
                      
                      {ESLVal ds2 = $758;
                      
                      {ESLVal ms2 = $757;
                      
                      return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal f = $756;
                      
                      return subType.apply(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $755 = _v219.termRef(0);
                      ESLVal $754 = _v219.termRef(1);
                      ESLVal $753 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l2 = $755;
                      
                      {ESLVal n2 = $754;
                      
                      {ESLVal t2 = $753;
                      
                      return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $752 = _v219.termRef(0);
                      ESLVal $751 = _v219.termRef(1);
                      ESLVal $750 = _v219.termRef(2);
                      
                      {ESLVal t1 = _v218;
                      
                      {ESLVal l1 = $752;
                      
                      {ESLVal ns2 = $751;
                      
                      {ESLVal t2 = $750;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v218;
                      
                      {ESLVal t2 = _v219;
                      
                      return typeEqual.apply(t1,t2);
                    }
                    }
                  }
                }
              else if($817.isNil())
                switch(_v219.termName) {
                  case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                    ESLVal $759 = _v219.termRef(1);
                    ESLVal $758 = _v219.termRef(2);
                    ESLVal $757 = _v219.termRef(3);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $760;
                    
                    {ESLVal t2 = $759;
                    
                    {ESLVal ds2 = $758;
                    
                    {ESLVal ms2 = $757;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal f = $756;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $755 = _v219.termRef(0);
                    ESLVal $754 = _v219.termRef(1);
                    ESLVal $753 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $755;
                    
                    {ESLVal n2 = $754;
                    
                    {ESLVal t2 = $753;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $752 = _v219.termRef(0);
                    ESLVal $751 = _v219.termRef(1);
                    ESLVal $750 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l1 = $752;
                    
                    {ESLVal ns2 = $751;
                    
                    {ESLVal t2 = $750;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v218;
                    
                    {ESLVal t2 = _v219;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              else switch(_v219.termName) {
                  case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                    ESLVal $759 = _v219.termRef(1);
                    ESLVal $758 = _v219.termRef(2);
                    ESLVal $757 = _v219.termRef(3);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $760;
                    
                    {ESLVal t2 = $759;
                    
                    {ESLVal ds2 = $758;
                    
                    {ESLVal ms2 = $757;
                    
                    return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal f = $756;
                    
                    return subType.apply(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $755 = _v219.termRef(0);
                    ESLVal $754 = _v219.termRef(1);
                    ESLVal $753 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l2 = $755;
                    
                    {ESLVal n2 = $754;
                    
                    {ESLVal t2 = $753;
                    
                    return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $752 = _v219.termRef(0);
                    ESLVal $751 = _v219.termRef(1);
                    ESLVal $750 = _v219.termRef(2);
                    
                    {ESLVal t1 = _v218;
                    
                    {ESLVal l1 = $752;
                    
                    {ESLVal ns2 = $751;
                    
                    {ESLVal t2 = $750;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v218;
                    
                    {ESLVal t2 = _v219;
                    
                    return typeEqual.apply(t1,t2);
                  }
                  }
                }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TermType": {ESLVal $810 = _v218.termRef(0);
              ESLVal $809 = _v218.termRef(1);
              ESLVal $808 = _v218.termRef(2);
              
              switch(_v219.termName) {
              case "TermType": {ESLVal $813 = _v219.termRef(0);
                ESLVal $812 = _v219.termRef(1);
                ESLVal $811 = _v219.termRef(2);
                
                {ESLVal l1 = $810;
                
                {ESLVal n1 = $809;
                
                {ESLVal args1 = $808;
                
                {ESLVal l2 = $813;
                
                {ESLVal n2 = $812;
                
                {ESLVal args2 = $811;
                
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
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "FunType": {ESLVal $804 = _v218.termRef(0);
              ESLVal $803 = _v218.termRef(1);
              ESLVal $802 = _v218.termRef(2);
              
              switch(_v219.termName) {
              case "FunType": {ESLVal $807 = _v219.termRef(0);
                ESLVal $806 = _v219.termRef(1);
                ESLVal $805 = _v219.termRef(2);
                
                {ESLVal l1 = $804;
                
                {ESLVal d1 = $803;
                
                {ESLVal r1 = $802;
                
                {ESLVal l2 = $807;
                
                {ESLVal d2 = $806;
                
                {ESLVal r2 = $805;
                
                return subType.apply(r1,r2).and(subTypes.apply(d2,d1));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "TypeClosure": {ESLVal $801 = _v218.termRef(0);
              
              {ESLVal f = $801;
              
              {ESLVal t2 = _v219;
              
              return subType.apply(f.apply(),t2);
            }
            }
            }
          case "RecordType": {ESLVal $798 = _v218.termRef(0);
              ESLVal $797 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "RecordType": {ESLVal $800 = _v219.termRef(0);
                ESLVal $799 = _v219.termRef(1);
                
                {ESLVal l1 = $798;
                
                {ESLVal fs1 = $797;
                
                {ESLVal l2 = $800;
                
                {ESLVal fs2 = $799;
                
                return recordSubType.apply(fs1,fs2);
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "RecType": {ESLVal $793 = _v218.termRef(0);
              ESLVal $792 = _v218.termRef(1);
              ESLVal $791 = _v218.termRef(2);
              
              switch(_v219.termName) {
              case "RecType": {ESLVal $796 = _v219.termRef(0);
                ESLVal $795 = _v219.termRef(1);
                ESLVal $794 = _v219.termRef(2);
                
                {ESLVal l1 = $793;
                
                {ESLVal n1 = $792;
                
                {ESLVal t1 = $791;
                
                {ESLVal l2 = $796;
                
                {ESLVal n2 = $795;
                
                {ESLVal t2 = $794;
                
                if(n1.eql(n2).boolVal)
                return subType.apply(t1,t2);
                else
                  {ESLVal _v338 = $793;
                    
                    {ESLVal _v339 = $792;
                    
                    {ESLVal _v340 = $791;
                    
                    {ESLVal _v341 = _v219;
                    
                    return subType.apply(substType.apply(new ESLVal("RecType",_v338,_v339,_v340),_v339,_v340),_v341);
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
              default: {ESLVal l1 = $793;
                
                {ESLVal n1 = $792;
                
                {ESLVal t1 = $791;
                
                {ESLVal t2 = _v219;
                
                return subType.apply(substType.apply(new ESLVal("RecType",l1,n1,t1),n1,t1),t2);
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $788 = _v218.termRef(0);
              ESLVal $787 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "UnionType": {ESLVal $790 = _v219.termRef(0);
                ESLVal $789 = _v219.termRef(1);
                
                {ESLVal l1 = $788;
                
                {ESLVal terms1 = $787;
                
                {ESLVal l2 = $790;
                
                {ESLVal terms2 = $789;
                
                return subTypes.apply(terms1,terms2);
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "VarType": {ESLVal $784 = _v218.termRef(0);
              ESLVal $783 = _v218.termRef(1);
              
              switch(_v219.termName) {
              case "VarType": {ESLVal $786 = _v219.termRef(0);
                ESLVal $785 = _v219.termRef(1);
                
                {ESLVal l1 = $784;
                
                {ESLVal n1 = $783;
                
                {ESLVal l2 = $786;
                
                {ESLVal n2 = $785;
                
                return n1.eql(n2);
              }
              }
              }
              }
              }
              default: switch(_v219.termName) {
                case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                  ESLVal $759 = _v219.termRef(1);
                  ESLVal $758 = _v219.termRef(2);
                  ESLVal $757 = _v219.termRef(3);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $760;
                  
                  {ESLVal t2 = $759;
                  
                  {ESLVal ds2 = $758;
                  
                  {ESLVal ms2 = $757;
                  
                  return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal f = $756;
                  
                  return subType.apply(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $755 = _v219.termRef(0);
                  ESLVal $754 = _v219.termRef(1);
                  ESLVal $753 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l2 = $755;
                  
                  {ESLVal n2 = $754;
                  
                  {ESLVal t2 = $753;
                  
                  return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $752 = _v219.termRef(0);
                  ESLVal $751 = _v219.termRef(1);
                  ESLVal $750 = _v219.termRef(2);
                  
                  {ESLVal t1 = _v218;
                  
                  {ESLVal l1 = $752;
                  
                  {ESLVal ns2 = $751;
                  
                  {ESLVal t2 = $750;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v218;
                  
                  {ESLVal t2 = _v219;
                  
                  return typeEqual.apply(t1,t2);
                }
                }
              }
            }
            }
          case "ForallType": {ESLVal $763 = _v218.termRef(0);
              ESLVal $762 = _v218.termRef(1);
              ESLVal $761 = _v218.termRef(2);
              
              if($762.isCons())
              {ESLVal $767 = $762.head();
                ESLVal $768 = $762.tail();
                
                if($768.isCons())
                {ESLVal $769 = $768.head();
                  ESLVal $770 = $768.tail();
                  
                  switch(_v219.termName) {
                  case "ForallType": {ESLVal $766 = _v219.termRef(0);
                    ESLVal $765 = _v219.termRef(1);
                    ESLVal $764 = _v219.termRef(2);
                    
                    {ESLVal l1 = $763;
                    
                    {ESLVal ns1 = $762;
                    
                    {ESLVal t1 = $761;
                    
                    {ESLVal l2 = $766;
                    
                    {ESLVal ns2 = $765;
                    
                    {ESLVal t2 = $764;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $763;
                    
                    {ESLVal ns1 = $762;
                    
                    {ESLVal t1 = $761;
                    
                    {ESLVal t2 = _v219;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
                }
              else if($768.isNil())
                switch($761.termName) {
                  case "ListType": {ESLVal $778 = $761.termRef(0);
                    ESLVal $777 = $761.termRef(1);
                    
                    switch($777.termName) {
                    case "VarType": {ESLVal $780 = $777.termRef(0);
                      ESLVal $779 = $777.termRef(1);
                      
                      switch(_v219.termName) {
                      case "ListType": {ESLVal $782 = _v219.termRef(0);
                        ESLVal $781 = _v219.termRef(1);
                        
                        {ESLVal l2 = $763;
                        
                        {ESLVal v1 = $767;
                        
                        {ESLVal l3 = $778;
                        
                        {ESLVal l4 = $780;
                        
                        {ESLVal v2 = $779;
                        
                        {ESLVal l1 = $782;
                        
                        {ESLVal t1 = $781;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v219.termName) {
                            case "ForallType": {ESLVal $766 = _v219.termRef(0);
                              ESLVal $765 = _v219.termRef(1);
                              ESLVal $764 = _v219.termRef(2);
                              
                              {ESLVal _v333 = $763;
                              
                              {ESLVal ns1 = $762;
                              
                              {ESLVal _v334 = $761;
                              
                              {ESLVal _v335 = $766;
                              
                              {ESLVal ns2 = $765;
                              
                              {ESLVal t2 = $764;
                              
                              return ns1.eql(ns2).and(subType.apply(_v334,t2));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v336 = $763;
                              
                              {ESLVal ns1 = $762;
                              
                              {ESLVal _v337 = $761;
                              
                              {ESLVal t2 = _v219;
                              
                              return subType.apply(_v337,t2);
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
                      default: switch(_v219.termName) {
                        case "ForallType": {ESLVal $766 = _v219.termRef(0);
                          ESLVal $765 = _v219.termRef(1);
                          ESLVal $764 = _v219.termRef(2);
                          
                          {ESLVal l1 = $763;
                          
                          {ESLVal ns1 = $762;
                          
                          {ESLVal t1 = $761;
                          
                          {ESLVal l2 = $766;
                          
                          {ESLVal ns2 = $765;
                          
                          {ESLVal t2 = $764;
                          
                          return ns1.eql(ns2).and(subType.apply(t1,t2));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $763;
                          
                          {ESLVal ns1 = $762;
                          
                          {ESLVal t1 = $761;
                          
                          {ESLVal t2 = _v219;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v219.termName) {
                      case "ForallType": {ESLVal $766 = _v219.termRef(0);
                        ESLVal $765 = _v219.termRef(1);
                        ESLVal $764 = _v219.termRef(2);
                        
                        {ESLVal l1 = $763;
                        
                        {ESLVal ns1 = $762;
                        
                        {ESLVal t1 = $761;
                        
                        {ESLVal l2 = $766;
                        
                        {ESLVal ns2 = $765;
                        
                        {ESLVal t2 = $764;
                        
                        return ns1.eql(ns2).and(subType.apply(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $763;
                        
                        {ESLVal ns1 = $762;
                        
                        {ESLVal t1 = $761;
                        
                        {ESLVal t2 = _v219;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                case "SetType": {ESLVal $772 = $761.termRef(0);
                    ESLVal $771 = $761.termRef(1);
                    
                    switch($771.termName) {
                    case "VarType": {ESLVal $774 = $771.termRef(0);
                      ESLVal $773 = $771.termRef(1);
                      
                      switch(_v219.termName) {
                      case "SetType": {ESLVal $776 = _v219.termRef(0);
                        ESLVal $775 = _v219.termRef(1);
                        
                        {ESLVal l2 = $763;
                        
                        {ESLVal v1 = $767;
                        
                        {ESLVal l3 = $772;
                        
                        {ESLVal l4 = $774;
                        
                        {ESLVal v2 = $773;
                        
                        {ESLVal l1 = $776;
                        
                        {ESLVal t1 = $775;
                        
                        if(v1.eql(v2).boolVal)
                        return $true;
                        else
                          switch(_v219.termName) {
                            case "ForallType": {ESLVal $766 = _v219.termRef(0);
                              ESLVal $765 = _v219.termRef(1);
                              ESLVal $764 = _v219.termRef(2);
                              
                              {ESLVal _v328 = $763;
                              
                              {ESLVal ns1 = $762;
                              
                              {ESLVal _v329 = $761;
                              
                              {ESLVal _v330 = $766;
                              
                              {ESLVal ns2 = $765;
                              
                              {ESLVal t2 = $764;
                              
                              return ns1.eql(ns2).and(subType.apply(_v329,t2));
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v331 = $763;
                              
                              {ESLVal ns1 = $762;
                              
                              {ESLVal _v332 = $761;
                              
                              {ESLVal t2 = _v219;
                              
                              return subType.apply(_v332,t2);
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
                      default: switch(_v219.termName) {
                        case "ForallType": {ESLVal $766 = _v219.termRef(0);
                          ESLVal $765 = _v219.termRef(1);
                          ESLVal $764 = _v219.termRef(2);
                          
                          {ESLVal l1 = $763;
                          
                          {ESLVal ns1 = $762;
                          
                          {ESLVal t1 = $761;
                          
                          {ESLVal l2 = $766;
                          
                          {ESLVal ns2 = $765;
                          
                          {ESLVal t2 = $764;
                          
                          return ns1.eql(ns2).and(subType.apply(t1,t2));
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal l1 = $763;
                          
                          {ESLVal ns1 = $762;
                          
                          {ESLVal t1 = $761;
                          
                          {ESLVal t2 = _v219;
                          
                          return subType.apply(t1,t2);
                        }
                        }
                        }
                        }
                      }
                    }
                    }
                    default: switch(_v219.termName) {
                      case "ForallType": {ESLVal $766 = _v219.termRef(0);
                        ESLVal $765 = _v219.termRef(1);
                        ESLVal $764 = _v219.termRef(2);
                        
                        {ESLVal l1 = $763;
                        
                        {ESLVal ns1 = $762;
                        
                        {ESLVal t1 = $761;
                        
                        {ESLVal l2 = $766;
                        
                        {ESLVal ns2 = $765;
                        
                        {ESLVal t2 = $764;
                        
                        return ns1.eql(ns2).and(subType.apply(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $763;
                        
                        {ESLVal ns1 = $762;
                        
                        {ESLVal t1 = $761;
                        
                        {ESLVal t2 = _v219;
                        
                        return subType.apply(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v219.termName) {
                    case "ForallType": {ESLVal $766 = _v219.termRef(0);
                      ESLVal $765 = _v219.termRef(1);
                      ESLVal $764 = _v219.termRef(2);
                      
                      {ESLVal l1 = $763;
                      
                      {ESLVal ns1 = $762;
                      
                      {ESLVal t1 = $761;
                      
                      {ESLVal l2 = $766;
                      
                      {ESLVal ns2 = $765;
                      
                      {ESLVal t2 = $764;
                      
                      return ns1.eql(ns2).and(subType.apply(t1,t2));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $763;
                      
                      {ESLVal ns1 = $762;
                      
                      {ESLVal t1 = $761;
                      
                      {ESLVal t2 = _v219;
                      
                      return subType.apply(t1,t2);
                    }
                    }
                    }
                    }
                  }
                }
              else switch(_v219.termName) {
                  case "ForallType": {ESLVal $766 = _v219.termRef(0);
                    ESLVal $765 = _v219.termRef(1);
                    ESLVal $764 = _v219.termRef(2);
                    
                    {ESLVal l1 = $763;
                    
                    {ESLVal ns1 = $762;
                    
                    {ESLVal t1 = $761;
                    
                    {ESLVal l2 = $766;
                    
                    {ESLVal ns2 = $765;
                    
                    {ESLVal t2 = $764;
                    
                    return ns1.eql(ns2).and(subType.apply(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $763;
                    
                    {ESLVal ns1 = $762;
                    
                    {ESLVal t1 = $761;
                    
                    {ESLVal t2 = _v219;
                    
                    return subType.apply(t1,t2);
                  }
                  }
                  }
                  }
                }
              }
            else if($762.isNil())
              switch(_v219.termName) {
                case "ForallType": {ESLVal $766 = _v219.termRef(0);
                  ESLVal $765 = _v219.termRef(1);
                  ESLVal $764 = _v219.termRef(2);
                  
                  {ESLVal l1 = $763;
                  
                  {ESLVal ns1 = $762;
                  
                  {ESLVal t1 = $761;
                  
                  {ESLVal l2 = $766;
                  
                  {ESLVal ns2 = $765;
                  
                  {ESLVal t2 = $764;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $763;
                  
                  {ESLVal ns1 = $762;
                  
                  {ESLVal t1 = $761;
                  
                  {ESLVal t2 = _v219;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            else switch(_v219.termName) {
                case "ForallType": {ESLVal $766 = _v219.termRef(0);
                  ESLVal $765 = _v219.termRef(1);
                  ESLVal $764 = _v219.termRef(2);
                  
                  {ESLVal l1 = $763;
                  
                  {ESLVal ns1 = $762;
                  
                  {ESLVal t1 = $761;
                  
                  {ESLVal l2 = $766;
                  
                  {ESLVal ns2 = $765;
                  
                  {ESLVal t2 = $764;
                  
                  return ns1.eql(ns2).and(subType.apply(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $763;
                  
                  {ESLVal ns1 = $762;
                  
                  {ESLVal t1 = $761;
                  
                  {ESLVal t2 = _v219;
                  
                  return subType.apply(t1,t2);
                }
                }
                }
                }
              }
            }
            default: switch(_v219.termName) {
              case "ExtendedAct": {ESLVal $760 = _v219.termRef(0);
                ESLVal $759 = _v219.termRef(1);
                ESLVal $758 = _v219.termRef(2);
                ESLVal $757 = _v219.termRef(3);
                
                {ESLVal t1 = _v218;
                
                {ESLVal l2 = $760;
                
                {ESLVal t2 = $759;
                
                {ESLVal ds2 = $758;
                
                {ESLVal ms2 = $757;
                
                return subType.apply(t1,flattenAct.apply(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $756 = _v219.termRef(0);
                
                {ESLVal t1 = _v218;
                
                {ESLVal f = $756;
                
                return subType.apply(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $755 = _v219.termRef(0);
                ESLVal $754 = _v219.termRef(1);
                ESLVal $753 = _v219.termRef(2);
                
                {ESLVal t1 = _v218;
                
                {ESLVal l2 = $755;
                
                {ESLVal n2 = $754;
                
                {ESLVal t2 = $753;
                
                return subType.apply(t1,substType.apply(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $752 = _v219.termRef(0);
                ESLVal $751 = _v219.termRef(1);
                ESLVal $750 = _v219.termRef(2);
                
                {ESLVal t1 = _v218;
                
                {ESLVal l1 = $752;
                
                {ESLVal ns2 = $751;
                
                {ESLVal t2 = $750;
                
                return subType.apply(t1,t2);
              }
              }
              }
              }
              }
              default: {ESLVal t1 = _v218;
                
                {ESLVal t2 = _v219;
                
                return typeEqual.apply(t1,t2);
              }
              }
            }
          }
          }
    }
  });
  public static ESLVal flattenAct = new ESLVal(new Function(new ESLVal("flattenAct"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l1 = $args[0];
  ESLVal t = $args[1];
  ESLVal ds1 = $args[2];
  ESLVal ms1 = $args[3];
  {ESLVal _v220 = t;
        
        switch(_v220.termName) {
        case "ActType": {ESLVal $868 = _v220.termRef(0);
          ESLVal $867 = _v220.termRef(1);
          ESLVal $866 = _v220.termRef(2);
          
          {ESLVal l2 = $868;
          
          {ESLVal ds2 = $867;
          
          {ESLVal ms2 = $866;
          
          return new ESLVal("ActType",l1,ds1.add(ds2),ms1.add(ms2));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $865 = _v220.termRef(0);
          ESLVal $864 = _v220.termRef(1);
          ESLVal $863 = _v220.termRef(2);
          ESLVal $862 = _v220.termRef(3);
          
          {ESLVal l2 = $865;
          
          {ESLVal _v326 = $864;
          
          {ESLVal ds2 = $863;
          
          {ESLVal ms2 = $862;
          
          return flattenAct.apply(l1,flattenAct.apply(l2,_v326,ds2,ms2),ds1,ms1);
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $861 = _v220.termRef(0);
          
          {ESLVal f = $861;
          
          return flattenAct.apply(l1,f.apply(),ds1,ms1);
        }
        }
      case "RecType": {ESLVal $860 = _v220.termRef(0);
          ESLVal $859 = _v220.termRef(1);
          ESLVal $858 = _v220.termRef(2);
          
          {ESLVal l2 = $860;
          
          {ESLVal n = $859;
          
          {ESLVal b = $858;
          
          return flattenAct.apply(l1,substType.apply(t,n,b),ds1,ms1);
        }
        }
        }
        }
        default: {ESLVal _v327 = _v220;
          
          return error(new ESLVal("TypeError",l1,new ESLVal("unknown type for flatten ").add(_v327)));
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun461"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun462"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports2);
          }
        }),exports1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun463"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun464"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d2 = $args[0];
              return equalDec.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun465"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun466"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers2);
          }
        }),handlers1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun467"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun468"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal m2 = $args[0];
              return equalMessage.apply(m1,m2);
                }
              }),handlers1);
          }
        }),handlers2))));
    }
  });
  public static ESLVal actSubType = new ESLVal(new Function(new ESLVal("actSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal exports1 = $args[0];
  ESLVal exports2 = $args[1];
  ESLVal handlers1 = $args[2];
  ESLVal handlers2 = $args[3];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun469"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun470"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal d1 = $args[0];
              return decSubType.apply(d1,d2);
                }
              }),exports1);
          }
        }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun471"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal m2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun472"),getSelf()) {
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
  {ESLVal _v221 = d1;
        ESLVal _v222 = d2;
        
        switch(_v221.termName) {
        case "Dec": {ESLVal $872 = _v221.termRef(0);
          ESLVal $871 = _v221.termRef(1);
          ESLVal $870 = _v221.termRef(2);
          ESLVal $869 = _v221.termRef(3);
          
          switch(_v222.termName) {
          case "Dec": {ESLVal $876 = _v222.termRef(0);
            ESLVal $875 = _v222.termRef(1);
            ESLVal $874 = _v222.termRef(2);
            ESLVal $873 = _v222.termRef(3);
            
            {ESLVal l1 = $872;
            
            {ESLVal n1 = $871;
            
            {ESLVal t1 = $870;
            
            {ESLVal st1 = $869;
            
            {ESLVal l2 = $876;
            
            {ESLVal n2 = $875;
            
            {ESLVal t2 = $874;
            
            {ESLVal st2 = $873;
            
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
          default: return error(new ESLVal("case error at Pos(19774,19905)").add(ESLVal.list(_v221,_v222)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19774,19905)").add(ESLVal.list(_v221,_v222)));
      }
      }
    }
  });
  public static ESLVal decSubType = new ESLVal(new Function(new ESLVal("decSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d1 = $args[0];
  ESLVal d2 = $args[1];
  {ESLVal _v223 = d1;
        ESLVal _v224 = d2;
        
        switch(_v223.termName) {
        case "Dec": {ESLVal $880 = _v223.termRef(0);
          ESLVal $879 = _v223.termRef(1);
          ESLVal $878 = _v223.termRef(2);
          ESLVal $877 = _v223.termRef(3);
          
          switch(_v224.termName) {
          case "Dec": {ESLVal $884 = _v224.termRef(0);
            ESLVal $883 = _v224.termRef(1);
            ESLVal $882 = _v224.termRef(2);
            ESLVal $881 = _v224.termRef(3);
            
            {ESLVal l1 = $880;
            
            {ESLVal n1 = $879;
            
            {ESLVal t1 = $878;
            
            {ESLVal st1 = $877;
            
            {ESLVal l2 = $884;
            
            {ESLVal n2 = $883;
            
            {ESLVal t2 = $882;
            
            {ESLVal st2 = $881;
            
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
          default: return error(new ESLVal("case error at Pos(19949,20078)").add(ESLVal.list(_v223,_v224)));
        }
        }
        default: return error(new ESLVal("case error at Pos(19949,20078)").add(ESLVal.list(_v223,_v224)));
      }
      }
    }
  });
  public static ESLVal equalMessage = new ESLVal(new Function(new ESLVal("equalMessage"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v225 = m1;
        ESLVal _v226 = m2;
        
        switch(_v225.termName) {
        case "MessageType": {ESLVal $886 = _v225.termRef(0);
          ESLVal $885 = _v225.termRef(1);
          
          switch(_v226.termName) {
          case "MessageType": {ESLVal $888 = _v226.termRef(0);
            ESLVal $887 = _v226.termRef(1);
            
            {ESLVal l1 = $886;
            
            {ESLVal ts1 = $885;
            
            {ESLVal l2 = $888;
            
            {ESLVal ts2 = $887;
            
            return typesEqual.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20124,20234)").add(ESLVal.list(_v225,_v226)));
        }
        }
        default: return error(new ESLVal("case error at Pos(20124,20234)").add(ESLVal.list(_v225,_v226)));
      }
      }
    }
  });
  public static ESLVal messSubType = new ESLVal(new Function(new ESLVal("messSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m1 = $args[0];
  ESLVal m2 = $args[1];
  {ESLVal _v227 = m1;
        ESLVal _v228 = m2;
        
        switch(_v227.termName) {
        case "MessageType": {ESLVal $890 = _v227.termRef(0);
          ESLVal $889 = _v227.termRef(1);
          
          switch(_v228.termName) {
          case "MessageType": {ESLVal $892 = _v228.termRef(0);
            ESLVal $891 = _v228.termRef(1);
            
            {ESLVal l1 = $890;
            
            {ESLVal ts1 = $889;
            
            {ESLVal l2 = $892;
            
            {ESLVal ts2 = $891;
            
            return subTypes.apply(ts1,ts2);
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20279,20387)").add(ESLVal.list(_v227,_v228)));
        }
        }
        default: return error(new ESLVal("case error at Pos(20279,20387)").add(ESLVal.list(_v227,_v228)));
      }
      }
    }
  });
  public static ESLVal recordTypeEqual = new ESLVal(new Function(new ESLVal("recordTypeEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun473"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun474"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return decName.apply(t1).eql(decName.apply(t2)).and(typeEqual.apply(decType.apply(t1),decType.apply(t2)));
                }
              }),fields2);
          }
        }),fields1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun475"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t1 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun476"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal t2 = $args[0];
              return decName.apply(t1).eql(decName.apply(t2)).and(typeEqual.apply(decType.apply(t1),decType.apply(t2)));
                }
              }),fields1);
          }
        }),fields2));
    }
  });
  public static ESLVal recordSubType = new ESLVal(new Function(new ESLVal("recordSubType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fields1 = $args[0];
  ESLVal fields2 = $args[1];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun477"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t2 = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun478"),getSelf()) {
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
  {ESLVal _v229 = op;
        
        switch(_v229.termName) {
        case "RecType": {ESLVal $898 = _v229.termRef(0);
          ESLVal $897 = _v229.termRef(1);
          ESLVal $896 = _v229.termRef(2);
          
          {ESLVal lr = $898;
          
          {ESLVal n = $897;
          
          {ESLVal t = $896;
          
          return applyTypeFun.apply(l,unfoldType.apply(lr,n,t),args);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $895 = _v229.termRef(0);
          ESLVal $894 = _v229.termRef(1);
          ESLVal $893 = _v229.termRef(2);
          
          {ESLVal _v324 = $895;
          
          {ESLVal names = $894;
          
          {ESLVal t = $893;
          
          if(length.apply(args).eql(length.apply(names)).boolVal)
          return substTypeEnv.apply(zipTypeEnv.apply(names,args),t);
          else
            return error(new ESLVal("TypeError",_v324,new ESLVal("type fun expects ").add(length.apply(names).add(new ESLVal(" args, but supplied with ").add(length.apply(args))))));
        }
        }
        }
        }
        default: {ESLVal _v325 = _v229;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(_v325)));
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
  {ESLVal _v230 = t;
        
        switch(_v230.termName) {
        case "TypeClosure": {ESLVal $899 = _v230.termRef(0);
          
          {ESLVal f = $899;
          
          return forceType.apply(f.apply());
        }
        }
        default: {ESLVal _v323 = _v230;
          
          return _v323;
        }
      }
      }
    }
  });
  public static ESLVal typesEqual = new ESLVal(new Function(new ESLVal("typesEqual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v231 = ts1;
        ESLVal _v232 = ts2;
        
        if(_v231.isCons())
        {ESLVal $902 = _v231.head();
          ESLVal $903 = _v231.tail();
          
          if(_v232.isCons())
          {ESLVal $904 = _v232.head();
            ESLVal $905 = _v232.tail();
            
            {ESLVal t1 = $902;
            
            {ESLVal _v316 = $903;
            
            {ESLVal t2 = $904;
            
            {ESLVal _v317 = $905;
            
            return typeEqual.apply(t1,t2).and(typesEqual.apply(_v316,_v317));
          }
          }
          }
          }
          }
        else if(_v232.isNil())
          if(_v232.isCons())
            {ESLVal $900 = _v232.head();
              ESLVal $901 = _v232.tail();
              
              return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
            }
          else if(_v232.isNil())
            {ESLVal _v318 = _v231;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
        else if(_v232.isCons())
            {ESLVal $900 = _v232.head();
              ESLVal $901 = _v232.tail();
              
              return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
            }
          else if(_v232.isNil())
            {ESLVal _v319 = _v231;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
        }
      else if(_v231.isNil())
        if(_v232.isCons())
          {ESLVal $906 = _v232.head();
            ESLVal $907 = _v232.tail();
            
            {ESLVal _v320 = _v232;
            
            return $false;
          }
          }
        else if(_v232.isNil())
          return $true;
        else {ESLVal _v321 = _v232;
            
            return $false;
          }
      else if(_v232.isCons())
          {ESLVal $900 = _v232.head();
            ESLVal $901 = _v232.tail();
            
            return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
          }
        else if(_v232.isNil())
          {ESLVal _v322 = _v231;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(21693,21903)").add(ESLVal.list(_v231,_v232)));
      }
    }
  });
  public static ESLVal subTypes = new ESLVal(new Function(new ESLVal("subTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  {ESLVal _v233 = ts1;
        ESLVal _v234 = ts2;
        
        if(_v233.isCons())
        {ESLVal $910 = _v233.head();
          ESLVal $911 = _v233.tail();
          
          if(_v234.isCons())
          {ESLVal $912 = _v234.head();
            ESLVal $913 = _v234.tail();
            
            {ESLVal t1 = $910;
            
            {ESLVal _v309 = $911;
            
            {ESLVal t2 = $912;
            
            {ESLVal _v310 = $913;
            
            return subType.apply(t1,t2).and(subTypes.apply(_v309,_v310));
          }
          }
          }
          }
          }
        else if(_v234.isNil())
          if(_v234.isCons())
            {ESLVal $908 = _v234.head();
              ESLVal $909 = _v234.tail();
              
              return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
            }
          else if(_v234.isNil())
            {ESLVal _v311 = _v233;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
        else if(_v234.isCons())
            {ESLVal $908 = _v234.head();
              ESLVal $909 = _v234.tail();
              
              return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
            }
          else if(_v234.isNil())
            {ESLVal _v312 = _v233;
              
              return $false;
            }
          else return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
        }
      else if(_v233.isNil())
        if(_v234.isCons())
          {ESLVal $914 = _v234.head();
            ESLVal $915 = _v234.tail();
            
            {ESLVal _v313 = _v234;
            
            return $false;
          }
          }
        else if(_v234.isNil())
          return $true;
        else {ESLVal _v314 = _v234;
            
            return $false;
          }
      else if(_v234.isCons())
          {ESLVal $908 = _v234.head();
            ESLVal $909 = _v234.tail();
            
            return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
          }
        else if(_v234.isNil())
          {ESLVal _v315 = _v233;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(21949,22155)").add(ESLVal.list(_v233,_v234)));
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
  {ESLVal _v235 = sub;
        
        if(_v235.isCons())
        {ESLVal $916 = _v235.head();
          ESLVal $917 = _v235.tail();
          
          {ESLVal t = $916;
          
          {ESLVal _v308 = $917;
          
          return typeMember.apply(t,sup).and(typeSubset.apply(_v308,sup));
        }
        }
        }
      else if(_v235.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(22315,22421)").add(ESLVal.list(_v235)));
      }
    }
  });
  public static ESLVal typeMember = new ESLVal(new Function(new ESLVal("typeMember"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal types = $args[1];
  {ESLVal _v236 = types;
        
        if(_v236.isCons())
        {ESLVal $918 = _v236.head();
          ESLVal $919 = _v236.tail();
          
          {ESLVal tt = $918;
          
          {ESLVal _v305 = $919;
          
          if(typeEqual.apply(t,tt).boolVal)
          return $true;
          else
            {ESLVal _v306 = $918;
              
              {ESLVal _v307 = $919;
              
              return typeMember.apply(t,_v307);
            }
            }
        }
        }
        }
      else if(_v236.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(22467,22614)").add(ESLVal.list(_v236)));
      }
    }
  });
  public static ESLVal substTypes = new ESLVal(new Function(new ESLVal("substTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldTypes = $args[2];
  {ESLVal _v237 = oldTypes;
        
        if(_v237.isCons())
        {ESLVal $920 = _v237.head();
          ESLVal $921 = _v237.tail();
          
          {ESLVal t = $920;
          
          {ESLVal ts = $921;
          
          return substTypes.apply(newType,n,ts).cons(substType.apply(newType,n,t));
        }
        }
        }
      else if(_v237.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(22766,22886)").add(ESLVal.list(_v237)));
      }
    }
  });
  public static ESLVal substType = new ESLVal(new Function(new ESLVal("substType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal oldType = $args[2];
  {ESLVal _v238 = oldType;
        
        switch(_v238.termName) {
        case "ApplyType": {ESLVal $976 = _v238.termRef(0);
          ESLVal $975 = _v238.termRef(1);
          ESLVal $974 = _v238.termRef(2);
          
          {ESLVal l = $976;
          
          {ESLVal m = $975;
          
          {ESLVal types = $974;
          
          if(m.eql(n).boolVal)
          return new ESLVal("ApplyTypeFun",l,newType,substTypes.apply(newType,n,types));
          else
            return new ESLVal("ApplyType",l,m,substTypes.apply(newType,n,types));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $973 = _v238.termRef(0);
          ESLVal $972 = _v238.termRef(1);
          ESLVal $971 = _v238.termRef(2);
          
          {ESLVal l = $973;
          
          {ESLVal op = $972;
          
          {ESLVal args = $971;
          
          return new ESLVal("ApplyTypeFun",l,substType.apply(newType,n,op),substTypes.apply(newType,n,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $970 = _v238.termRef(0);
          ESLVal $969 = _v238.termRef(1);
          ESLVal $968 = _v238.termRef(2);
          
          {ESLVal l = $970;
          
          {ESLVal decs = $969;
          
          {ESLVal handlers = $968;
          
          return new ESLVal("ActType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                $v.add(substDec.apply(newType,n,d));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(decs),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(substMType.apply(newType,n,m));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(handlers));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $967 = _v238.termRef(0);
          ESLVal $966 = _v238.termRef(1);
          
          {ESLVal l = $967;
          
          {ESLVal t = $966;
          
          return new ESLVal("ArrayType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "BoolType": {ESLVal $965 = _v238.termRef(0);
          
          {ESLVal l = $965;
          
          return oldType;
        }
        }
      case "ExtendedAct": {ESLVal $964 = _v238.termRef(0);
          ESLVal $963 = _v238.termRef(1);
          ESLVal $962 = _v238.termRef(2);
          ESLVal $961 = _v238.termRef(3);
          
          {ESLVal l = $964;
          
          {ESLVal parent = $963;
          
          {ESLVal decs = $962;
          
          {ESLVal ms = $961;
          
          return new ESLVal("ExtendedAct",l,substType.apply(newType,n,parent),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                $v.add(substDec.apply(newType,n,d));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(decs),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(substMType.apply(newType,n,m));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ms));
        }
        }
        }
        }
        }
      case "FloatType": {ESLVal $960 = _v238.termRef(0);
          
          {ESLVal l = $960;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $959 = _v238.termRef(0);
          ESLVal $958 = _v238.termRef(1);
          ESLVal $957 = _v238.termRef(2);
          
          {ESLVal l = $959;
          
          {ESLVal ns = $958;
          
          {ESLVal t = $957;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("ForallType",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $956 = _v238.termRef(0);
          ESLVal $955 = _v238.termRef(1);
          ESLVal $954 = _v238.termRef(2);
          
          {ESLVal l = $956;
          
          {ESLVal d = $955;
          
          {ESLVal r = $954;
          
          return new ESLVal("FunType",l,substTypes.apply(newType,n,d),substType.apply(newType,n,r));
        }
        }
        }
        }
      case "IntType": {ESLVal $953 = _v238.termRef(0);
          
          {ESLVal l = $953;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $952 = _v238.termRef(0);
          ESLVal $951 = _v238.termRef(1);
          
          {ESLVal l = $952;
          
          {ESLVal t = $951;
          
          return new ESLVal("ListType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "NullType": {ESLVal $950 = _v238.termRef(0);
          
          {ESLVal l = $950;
          
          return oldType;
        }
        }
      case "RecordType": {ESLVal $949 = _v238.termRef(0);
          ESLVal $948 = _v238.termRef(1);
          
          {ESLVal l = $949;
          
          {ESLVal fs = $948;
          
          return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v239 = $qualArg;
                
                switch(_v239.termName) {
                case "Dec": {ESLVal $980 = _v239.termRef(0);
                  ESLVal $979 = _v239.termRef(1);
                  ESLVal $978 = _v239.termRef(2);
                  ESLVal $977 = _v239.termRef(3);
                  
                  {ESLVal dl = $980;
                  
                  {ESLVal _v304 = $979;
                  
                  {ESLVal t = $978;
                  
                  {ESLVal dt = $977;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,_v304,substType.apply(newType,_v304,t),dt)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v239;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "RecType": {ESLVal $947 = _v238.termRef(0);
          ESLVal $946 = _v238.termRef(1);
          ESLVal $945 = _v238.termRef(2);
          
          {ESLVal l = $947;
          
          {ESLVal a = $946;
          
          {ESLVal t = $945;
          
          if(n.eql(a).boolVal)
          return oldType;
          else
            return new ESLVal("RecType",l,a,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "SetType": {ESLVal $944 = _v238.termRef(0);
          ESLVal $943 = _v238.termRef(1);
          
          {ESLVal l = $944;
          
          {ESLVal t = $943;
          
          return new ESLVal("SetType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "StrType": {ESLVal $942 = _v238.termRef(0);
          
          {ESLVal l = $942;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $941 = _v238.termRef(0);
          ESLVal $940 = _v238.termRef(1);
          ESLVal $939 = _v238.termRef(2);
          
          {ESLVal l = $941;
          
          {ESLVal k = $940;
          
          {ESLVal v = $939;
          
          return new ESLVal("TableType",l,substType.apply(newType,n,k),substType.apply(newType,n,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $938 = _v238.termRef(0);
          ESLVal $937 = _v238.termRef(1);
          ESLVal $936 = _v238.termRef(2);
          
          {ESLVal l = $938;
          
          {ESLVal f = $937;
          
          {ESLVal ts = $936;
          
          return new ESLVal("TermType",l,f,substTypes.apply(newType,n,ts));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $935 = _v238.termRef(0);
          
          {ESLVal f = $935;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $934 = _v238.termRef(0);
          ESLVal $933 = _v238.termRef(1);
          ESLVal $932 = _v238.termRef(2);
          
          {ESLVal l = $934;
          
          {ESLVal ns = $933;
          
          {ESLVal t = $932;
          
          if(member.apply(n,ns).boolVal)
          return oldType;
          else
            return new ESLVal("TypeFun",l,ns,substType.apply(newType,n,t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $931 = _v238.termRef(0);
          ESLVal $930 = _v238.termRef(1);
          
          {ESLVal l = $931;
          
          {ESLVal t = $930;
          
          return new ESLVal("UnfoldType",l,substType.apply(newType,n,t));
        }
        }
        }
      case "UnionType": {ESLVal $929 = _v238.termRef(0);
          ESLVal $928 = _v238.termRef(1);
          
          {ESLVal l = $929;
          
          {ESLVal ts = $928;
          
          return new ESLVal("UnionType",l,substTypes.apply(newType,n,ts));
        }
        }
        }
      case "VarType": {ESLVal $927 = _v238.termRef(0);
          ESLVal $926 = _v238.termRef(1);
          
          {ESLVal l = $927;
          
          {ESLVal name = $926;
          
          if(name.eql(n).boolVal)
          return newType;
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $925 = _v238.termRef(0);
          
          {ESLVal l = $925;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $924 = _v238.termRef(0);
          ESLVal $923 = _v238.termRef(1);
          ESLVal $922 = _v238.termRef(2);
          
          {ESLVal l = $924;
          
          {ESLVal t = $923;
          
          {ESLVal name = $922;
          
          return new ESLVal("UnionRef",l,substType.apply(newType,n,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v238;
          
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
  {ESLVal _v240 = types;
        
        if(_v240.isCons())
        {ESLVal $981 = _v240.head();
          ESLVal $982 = _v240.tail();
          
          {ESLVal t = $981;
          
          {ESLVal ts = $982;
          
          return substTypesEnv.apply(env,ts).cons(substTypeEnv.apply(env,t));
        }
        }
        }
      else if(_v240.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(25368,25479)").add(ESLVal.list(_v240)));
      }
    }
  });
  public static ESLVal substTypeEnv = new ESLVal(new Function(new ESLVal("substTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal oldType = $args[1];
  {ESLVal _v241 = oldType;
        
        switch(_v241.termName) {
        case "ApplyType": {ESLVal $1046 = _v241.termRef(0);
          ESLVal $1045 = _v241.termRef(1);
          ESLVal $1044 = _v241.termRef(2);
          
          {ESLVal l = $1046;
          
          {ESLVal n = $1045;
          
          {ESLVal types = $1044;
          
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
      case "ApplyTypeFun": {ESLVal $1043 = _v241.termRef(0);
          ESLVal $1042 = _v241.termRef(1);
          ESLVal $1041 = _v241.termRef(2);
          
          {ESLVal l = $1043;
          
          {ESLVal op = $1042;
          
          {ESLVal args = $1041;
          
          return new ESLVal("ApplyTypeFun",l,substTypeEnv.apply(env,op),substTypesEnv.apply(env,args));
        }
        }
        }
        }
      case "ActType": {ESLVal $1040 = _v241.termRef(0);
          ESLVal $1039 = _v241.termRef(1);
          ESLVal $1038 = _v241.termRef(2);
          
          {ESLVal l = $1040;
          
          {ESLVal decs = $1039;
          
          {ESLVal handlers = $1038;
          
          return new ESLVal("ActType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                $v.add(substDecEnv.apply(env,d));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(decs),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(substMTypeEnv.apply(env,m));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(handlers));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $1037 = _v241.termRef(0);
          ESLVal $1036 = _v241.termRef(1);
          ESLVal $1035 = _v241.termRef(2);
          ESLVal $1034 = _v241.termRef(3);
          
          {ESLVal l = $1037;
          
          {ESLVal parent = $1036;
          
          {ESLVal decs = $1035;
          
          {ESLVal handlers = $1034;
          
          return new ESLVal("ExtendedAct",l,substTypeEnv.apply(env,parent),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                $v.add(substDecEnv.apply(env,d));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(decs),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal m = $l0.head();
                $l0 = $l0.tail();
                $v.add(substMTypeEnv.apply(env,m));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(handlers));
        }
        }
        }
        }
        }
      case "ArrayType": {ESLVal $1033 = _v241.termRef(0);
          ESLVal $1032 = _v241.termRef(1);
          
          {ESLVal l = $1033;
          
          {ESLVal t = $1032;
          
          return new ESLVal("ArrayType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BoolType": {ESLVal $1031 = _v241.termRef(0);
          
          {ESLVal l = $1031;
          
          return oldType;
        }
        }
      case "FloatType": {ESLVal $1030 = _v241.termRef(0);
          
          {ESLVal l = $1030;
          
          return oldType;
        }
        }
      case "ForallType": {ESLVal $1029 = _v241.termRef(0);
          ESLVal $1028 = _v241.termRef(1);
          ESLVal $1027 = _v241.termRef(2);
          
          {ESLVal l = $1029;
          
          {ESLVal ns = $1028;
          
          {ESLVal t = $1027;
          
          return new ESLVal("ForallType",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "FieldType": {ESLVal $1026 = _v241.termRef(0);
          ESLVal $1025 = _v241.termRef(1);
          ESLVal $1024 = _v241.termRef(2);
          
          {ESLVal l = $1026;
          
          {ESLVal n = $1025;
          
          {ESLVal t = $1024;
          
          return new ESLVal("FieldType",l,n,substTypeEnv.apply(env,t));
        }
        }
        }
        }
      case "FunType": {ESLVal $1023 = _v241.termRef(0);
          ESLVal $1022 = _v241.termRef(1);
          ESLVal $1021 = _v241.termRef(2);
          
          {ESLVal l = $1023;
          
          {ESLVal d = $1022;
          
          {ESLVal r = $1021;
          
          return new ESLVal("FunType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substTypeEnv.apply(env,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(d),substTypeEnv.apply(env,r));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $1020 = _v241.termRef(0);
          ESLVal $1019 = _v241.termRef(1);
          ESLVal $1018 = _v241.termRef(2);
          ESLVal $1017 = _v241.termRef(3);
          
          {ESLVal l = $1020;
          
          {ESLVal d = $1019;
          
          {ESLVal p = $1018;
          
          {ESLVal r = $1017;
          
          return new ESLVal("FunType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substTypeEnv.apply(env,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(d),substTypeEnv.apply(env,r));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $1016 = _v241.termRef(0);
          
          {ESLVal l = $1016;
          
          return oldType;
        }
        }
      case "ListType": {ESLVal $1015 = _v241.termRef(0);
          ESLVal $1014 = _v241.termRef(1);
          
          {ESLVal l = $1015;
          
          {ESLVal t = $1014;
          
          return new ESLVal("ListType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "SetType": {ESLVal $1013 = _v241.termRef(0);
          ESLVal $1012 = _v241.termRef(1);
          
          {ESLVal l = $1013;
          
          {ESLVal t = $1012;
          
          return new ESLVal("SetType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "BagType": {ESLVal $1011 = _v241.termRef(0);
          ESLVal $1010 = _v241.termRef(1);
          
          {ESLVal l = $1011;
          
          {ESLVal t = $1010;
          
          return new ESLVal("BagType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "NullType": {ESLVal $1009 = _v241.termRef(0);
          
          {ESLVal l = $1009;
          
          return oldType;
        }
        }
      case "RecType": {ESLVal $1008 = _v241.termRef(0);
          ESLVal $1007 = _v241.termRef(1);
          ESLVal $1006 = _v241.termRef(2);
          
          {ESLVal l = $1008;
          
          {ESLVal a = $1007;
          
          {ESLVal t = $1006;
          
          return new ESLVal("RecType",l,a,substTypeEnv.apply(removeFromDom.apply(env,ESLVal.list(a)),t));
        }
        }
        }
        }
      case "RecordType": {ESLVal $1005 = _v241.termRef(0);
          ESLVal $1004 = _v241.termRef(1);
          
          {ESLVal l = $1005;
          
          {ESLVal fs = $1004;
          
          return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v242 = $qualArg;
                
                switch(_v242.termName) {
                case "Dec": {ESLVal $1050 = _v242.termRef(0);
                  ESLVal $1049 = _v242.termRef(1);
                  ESLVal $1048 = _v242.termRef(2);
                  ESLVal $1047 = _v242.termRef(3);
                  
                  {ESLVal dl = $1050;
                  
                  {ESLVal n = $1049;
                  
                  {ESLVal t = $1048;
                  
                  {ESLVal dt = $1047;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,n,substTypeEnv.apply(env,t),dt)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v242;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "StrType": {ESLVal $1003 = _v241.termRef(0);
          
          {ESLVal l = $1003;
          
          return oldType;
        }
        }
      case "TableType": {ESLVal $1002 = _v241.termRef(0);
          ESLVal $1001 = _v241.termRef(1);
          ESLVal $1000 = _v241.termRef(2);
          
          {ESLVal l = $1002;
          
          {ESLVal k = $1001;
          
          {ESLVal v = $1000;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(env,k),substTypeEnv.apply(env,v));
        }
        }
        }
        }
      case "TermType": {ESLVal $999 = _v241.termRef(0);
          ESLVal $998 = _v241.termRef(1);
          ESLVal $997 = _v241.termRef(2);
          
          {ESLVal l = $999;
          
          {ESLVal f = $998;
          
          {ESLVal ts = $997;
          
          return new ESLVal("TermType",l,f,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substTypeEnv.apply(env,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ts));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $996 = _v241.termRef(0);
          
          {ESLVal f = $996;
          
          return oldType;
        }
        }
      case "TypeFun": {ESLVal $995 = _v241.termRef(0);
          ESLVal $994 = _v241.termRef(1);
          ESLVal $993 = _v241.termRef(2);
          
          {ESLVal l = $995;
          
          {ESLVal ns = $994;
          
          {ESLVal t = $993;
          
          return new ESLVal("TypeFun",l,ns,substTypeEnv.apply(removeFromDom.apply(env,ns),t));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $992 = _v241.termRef(0);
          ESLVal $991 = _v241.termRef(1);
          
          {ESLVal l = $992;
          
          {ESLVal t = $991;
          
          return new ESLVal("UnfoldType",l,substTypeEnv.apply(env,t));
        }
        }
        }
      case "UnionType": {ESLVal $990 = _v241.termRef(0);
          ESLVal $989 = _v241.termRef(1);
          
          {ESLVal l = $990;
          
          {ESLVal ts = $989;
          
          return new ESLVal("UnionType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substTypeEnv.apply(env,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ts));
        }
        }
        }
      case "VarType": {ESLVal $988 = _v241.termRef(0);
          ESLVal $987 = _v241.termRef(1);
          
          {ESLVal l = $988;
          
          {ESLVal name = $987;
          
          if(member.apply(name,typeEnvDom.apply(env)).boolVal)
          return lookupType.apply(name,env);
          else
            return oldType;
        }
        }
        }
      case "VoidType": {ESLVal $986 = _v241.termRef(0);
          
          {ESLVal l = $986;
          
          return oldType;
        }
        }
      case "UnionRef": {ESLVal $985 = _v241.termRef(0);
          ESLVal $984 = _v241.termRef(1);
          ESLVal $983 = _v241.termRef(2);
          
          {ESLVal l = $985;
          
          {ESLVal t = $984;
          
          {ESLVal name = $983;
          
          return new ESLVal("UnionRef",l,substTypeEnv.apply(env,t),name);
        }
        }
        }
        }
        default: {ESLVal x = _v241;
          
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
  {ESLVal _v243 = ns;
        ESLVal _v244 = ts;
        
        if(_v243.isCons())
        {ESLVal $1051 = _v243.head();
          ESLVal $1052 = _v243.tail();
          
          if(_v244.isCons())
          {ESLVal $1053 = _v244.head();
            ESLVal $1054 = _v244.tail();
            
            {ESLVal n = $1051;
            
            {ESLVal _v302 = $1052;
            
            {ESLVal t = $1053;
            
            {ESLVal _v303 = $1054;
            
            return zipTypeEnv.apply(_v302,_v303).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
        else if(_v244.isNil())
          return error(new ESLVal("case error at Pos(28225,28346)").add(ESLVal.list(_v243,_v244)));
        else return error(new ESLVal("case error at Pos(28225,28346)").add(ESLVal.list(_v243,_v244)));
        }
      else if(_v243.isNil())
        if(_v244.isCons())
          {ESLVal $1055 = _v244.head();
            ESLVal $1056 = _v244.tail();
            
            return error(new ESLVal("case error at Pos(28225,28346)").add(ESLVal.list(_v243,_v244)));
          }
        else if(_v244.isNil())
          return $nil;
        else return error(new ESLVal("case error at Pos(28225,28346)").add(ESLVal.list(_v243,_v244)));
      else return error(new ESLVal("case error at Pos(28225,28346)").add(ESLVal.list(_v243,_v244)));
      }
    }
  });
  public static ESLVal lookupType = new ESLVal(new Function(new ESLVal("lookupType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v245 = env;
        
        if(_v245.isCons())
        {ESLVal $1057 = _v245.head();
          ESLVal $1058 = _v245.tail();
          
          switch($1057.termName) {
          case "Map": {ESLVal $1060 = $1057.termRef(0);
            ESLVal $1059 = $1057.termRef(1);
            
            {ESLVal n = $1060;
            
            {ESLVal t = $1059;
            
            {ESLVal e = $1058;
            
            if(n.eql(name).boolVal)
            return t;
            else
              {ESLVal m = $1057;
                
                {ESLVal _v301 = $1058;
                
                return lookupType.apply(name,_v301);
              }
              }
          }
          }
          }
          }
          default: {ESLVal m = $1057;
            
            {ESLVal e = $1058;
            
            return lookupType.apply(name,e);
          }
          }
        }
        }
      else if(_v245.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(28392,28529)").add(ESLVal.list(_v245)));
      }
    }
  });
  public static ESLVal typeEnvDom = new ESLVal(new Function(new ESLVal("typeEnvDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v246 = e;
        
        if(_v246.isCons())
        {ESLVal $1061 = _v246.head();
          ESLVal $1062 = _v246.tail();
          
          switch($1061.termName) {
          case "Map": {ESLVal $1064 = $1061.termRef(0);
            ESLVal $1063 = $1061.termRef(1);
            
            {ESLVal n = $1064;
            
            {ESLVal t = $1063;
            
            {ESLVal x = $1062;
            
            return typeEnvDom.apply(x).cons(n);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28564,28653)").add(ESLVal.list(_v246)));
        }
        }
      else if(_v246.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28564,28653)").add(ESLVal.list(_v246)));
      }
    }
  });
  public static ESLVal removeFromDom = new ESLVal(new Function(new ESLVal("removeFromDom"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v247 = e;
        
        if(_v247.isCons())
        {ESLVal $1065 = _v247.head();
          ESLVal $1066 = _v247.tail();
          
          switch($1065.termName) {
          case "Map": {ESLVal $1068 = $1065.termRef(0);
            ESLVal $1067 = $1065.termRef(1);
            
            {ESLVal n = $1068;
            
            {ESLVal t = $1067;
            
            {ESLVal _v297 = $1066;
            
            if(member.apply(n,ns).boolVal)
            return removeFromDom.apply(_v297,ns);
            else
              {ESLVal _v298 = $1068;
                
                {ESLVal _v299 = $1067;
                
                {ESLVal _v300 = $1066;
                
                return removeFromDom.apply(_v300,ns).cons(new ESLVal("Map",_v298,_v299));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28700,28882)").add(ESLVal.list(_v247)));
        }
        }
      else if(_v247.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28700,28882)").add(ESLVal.list(_v247)));
      }
    }
  });
  public static ESLVal restrictTypeEnv = new ESLVal(new Function(new ESLVal("restrictTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal ns = $args[1];
  {ESLVal _v248 = e;
        
        if(_v248.isCons())
        {ESLVal $1069 = _v248.head();
          ESLVal $1070 = _v248.tail();
          
          switch($1069.termName) {
          case "Map": {ESLVal $1072 = $1069.termRef(0);
            ESLVal $1071 = $1069.termRef(1);
            
            {ESLVal n = $1072;
            
            {ESLVal t = $1071;
            
            {ESLVal _v293 = $1070;
            
            if(member.apply(n,ns).not().boolVal)
            return restrictTypeEnv.apply(_v293,ns);
            else
              {ESLVal _v294 = $1072;
                
                {ESLVal _v295 = $1071;
                
                {ESLVal _v296 = $1070;
                
                return restrictTypeEnv.apply(_v296,ns).cons(new ESLVal("Map",_v294,_v295));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(28931,29122)").add(ESLVal.list(_v248)));
        }
        }
      else if(_v248.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(28931,29122)").add(ESLVal.list(_v248)));
      }
    }
  });
  public static ESLVal typeEnvRan = new ESLVal(new Function(new ESLVal("typeEnvRan"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v249 = e;
        
        if(_v249.isCons())
        {ESLVal $1073 = _v249.head();
          ESLVal $1074 = _v249.tail();
          
          switch($1073.termName) {
          case "Map": {ESLVal $1076 = $1073.termRef(0);
            ESLVal $1075 = $1073.termRef(1);
            
            {ESLVal n = $1076;
            
            {ESLVal t = $1075;
            
            {ESLVal x = $1074;
            
            return typeEnvRan.apply(x).cons(t);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(29158,29249)").add(ESLVal.list(_v249)));
        }
        }
      else if(_v249.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(29158,29249)").add(ESLVal.list(_v249)));
      }
    }
  });
  public static ESLVal allEqualTypes = new ESLVal(new Function(new ESLVal("allEqualTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal ts = $args[1];
  {ESLVal _v250 = ts;
        
        if(_v250.isCons())
        {ESLVal $1077 = _v250.head();
          ESLVal $1078 = _v250.tail();
          
          {ESLVal t2 = $1077;
          
          {ESLVal _v290 = $1078;
          
          if(typeEqual.apply(t1,t2).boolVal)
          return allEqualTypes.apply(t1,_v290);
          else
            {ESLVal _v291 = _v250;
              
              return $false;
            }
        }
        }
        }
      else if(_v250.isNil())
        return $true;
      else {ESLVal _v292 = _v250;
          
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
  {ESLVal _v251 = d;
        
        switch(_v251.termName) {
        case "Dec": {ESLVal $1082 = _v251.termRef(0);
          ESLVal $1081 = _v251.termRef(1);
          ESLVal $1080 = _v251.termRef(2);
          ESLVal $1079 = _v251.termRef(3);
          
          {ESLVal l = $1082;
          
          {ESLVal name = $1081;
          
          {ESLVal t = $1080;
          
          {ESLVal st = $1079;
          
          return new ESLVal("Dec",l,name,substType.apply(newType,n,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29482,29579)").add(ESLVal.list(_v251)));
      }
      }
    }
  });
  public static ESLVal substDecEnv = new ESLVal(new Function(new ESLVal("substDecEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v252 = d;
        
        switch(_v252.termName) {
        case "Dec": {ESLVal $1086 = _v252.termRef(0);
          ESLVal $1085 = _v252.termRef(1);
          ESLVal $1084 = _v252.termRef(2);
          ESLVal $1083 = _v252.termRef(3);
          
          {ESLVal l = $1086;
          
          {ESLVal name = $1085;
          
          {ESLVal t = $1084;
          
          {ESLVal st = $1083;
          
          return new ESLVal("Dec",l,name,substTypeEnv.apply(env,t),st);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29624,29718)").add(ESLVal.list(_v252)));
      }
      }
    }
  });
  public static ESLVal substMType = new ESLVal(new Function(new ESLVal("substMType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal newType = $args[0];
  ESLVal n = $args[1];
  ESLVal m = $args[2];
  {ESLVal _v253 = m;
        
        switch(_v253.termName) {
        case "MessageType": {ESLVal $1088 = _v253.termRef(0);
          ESLVal $1087 = _v253.termRef(1);
          
          {ESLVal l = $1088;
          
          {ESLVal ts = $1087;
          
          return new ESLVal("MessageType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substType.apply(newType,n,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ts));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29778,29886)").add(ESLVal.list(_v253)));
      }
      }
    }
  });
  public static ESLVal substMTypeEnv = new ESLVal(new Function(new ESLVal("substMTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  ESLVal m = $args[1];
  {ESLVal _v254 = m;
        
        switch(_v254.termName) {
        case "MessageType": {ESLVal $1090 = _v254.termRef(0);
          ESLVal $1089 = _v254.termRef(1);
          
          {ESLVal l = $1090;
          
          {ESLVal ts = $1089;
          
          return new ESLVal("MessageType",l,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal t = $l0.head();
                $l0 = $l0.tail();
                $v.add(substTypeEnv.apply(env,t));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ts));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(29938,30043)").add(ESLVal.list(_v254)));
      }
      }
    }
  });
  public static ESLVal patternNames = new ESLVal(new Function(new ESLVal("patternNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v255 = x;
        
        switch(_v255.termName) {
        case "PAdd": {ESLVal $1122 = _v255.termRef(0);
          ESLVal $1121 = _v255.termRef(1);
          ESLVal $1120 = _v255.termRef(2);
          
          {ESLVal l = $1122;
          
          {ESLVal p1 = $1121;
          
          {ESLVal p2 = $1120;
          
          return patternNames.apply(p1).add(patternNames.apply(p2));
        }
        }
        }
        }
      case "PVar": {ESLVal $1119 = _v255.termRef(0);
          ESLVal $1118 = _v255.termRef(1);
          ESLVal $1117 = _v255.termRef(2);
          
          {ESLVal v0 = $1119;
          
          {ESLVal v1 = $1118;
          
          {ESLVal v2 = $1117;
          
          return ESLVal.list(v1);
        }
        }
        }
        }
      case "PTerm": {ESLVal $1116 = _v255.termRef(0);
          ESLVal $1115 = _v255.termRef(1);
          ESLVal $1114 = _v255.termRef(2);
          ESLVal $1113 = _v255.termRef(3);
          
          {ESLVal v0 = $1116;
          
          {ESLVal v1 = $1115;
          
          {ESLVal v2 = $1114;
          
          {ESLVal v3 = $1113;
          
          return new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal p = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = patternNames.apply(p);
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
      case "PApplyType": {ESLVal $1112 = _v255.termRef(0);
          ESLVal $1111 = _v255.termRef(1);
          ESLVal $1110 = _v255.termRef(2);
          
          {ESLVal v0 = $1112;
          
          {ESLVal v1 = $1111;
          
          {ESLVal v2 = $1110;
          
          return patternNames.apply(v1);
        }
        }
        }
        }
      case "PNil": {ESLVal $1109 = _v255.termRef(0);
          
          {ESLVal v0 = $1109;
          
          return ESLVal.list();
        }
        }
      case "PNull": {ESLVal $1108 = _v255.termRef(0);
          
          {ESLVal v0 = $1108;
          
          return ESLVal.list();
        }
        }
      case "PInt": {ESLVal $1107 = _v255.termRef(0);
          ESLVal $1106 = _v255.termRef(1);
          
          {ESLVal v0 = $1107;
          
          {ESLVal v1 = $1106;
          
          return ESLVal.list();
        }
        }
        }
      case "PStr": {ESLVal $1105 = _v255.termRef(0);
          ESLVal $1104 = _v255.termRef(1);
          
          {ESLVal v0 = $1105;
          
          {ESLVal v1 = $1104;
          
          return ESLVal.list();
        }
        }
        }
      case "PBool": {ESLVal $1103 = _v255.termRef(0);
          ESLVal $1102 = _v255.termRef(1);
          
          {ESLVal v0 = $1103;
          
          {ESLVal v1 = $1102;
          
          return ESLVal.list();
        }
        }
        }
      case "PCons": {ESLVal $1101 = _v255.termRef(0);
          ESLVal $1100 = _v255.termRef(1);
          ESLVal $1099 = _v255.termRef(2);
          
          {ESLVal v0 = $1101;
          
          {ESLVal v1 = $1100;
          
          {ESLVal v2 = $1099;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $1098 = _v255.termRef(0);
          ESLVal $1097 = _v255.termRef(1);
          ESLVal $1096 = _v255.termRef(2);
          
          {ESLVal v0 = $1098;
          
          {ESLVal v1 = $1097;
          
          {ESLVal v2 = $1096;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptyBag": {ESLVal $1095 = _v255.termRef(0);
          
          {ESLVal v0 = $1095;
          
          return ESLVal.list();
        }
        }
      case "PSetCons": {ESLVal $1094 = _v255.termRef(0);
          ESLVal $1093 = _v255.termRef(1);
          ESLVal $1092 = _v255.termRef(2);
          
          {ESLVal v0 = $1094;
          
          {ESLVal v1 = $1093;
          
          {ESLVal v2 = $1092;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptySet": {ESLVal $1091 = _v255.termRef(0);
          
          {ESLVal v0 = $1091;
          
          return ESLVal.list();
        }
        }
        default: return error(new ESLVal("case error at Pos(30420,31200)").add(ESLVal.list(_v255)));
      }
      }
    }
  });
  public static ESLVal mergeFunDefs = new ESLVal(new Function(new ESLVal("mergeFunDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  { LetRec letrec = new LetRec() {
        ESLVal getFunCases = new ESLVal(new Function(new ESLVal("getFunCases"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v282 = $args[0];
          ESLVal _v283 = $args[1];
          {ESLVal _v256 = _v283;
                
                if(_v256.isCons())
                {ESLVal $1123 = _v256.head();
                  ESLVal $1124 = _v256.tail();
                  
                  switch($1123.termName) {
                  case "FunBind": {ESLVal $1131 = $1123.termRef(0);
                    ESLVal $1130 = $1123.termRef(1);
                    ESLVal $1129 = $1123.termRef(2);
                    ESLVal $1128 = $1123.termRef(3);
                    ESLVal $1127 = $1123.termRef(4);
                    ESLVal $1126 = $1123.termRef(5);
                    ESLVal $1125 = $1123.termRef(6);
                    
                    {ESLVal l = $1131;
                    
                    {ESLVal n0 = $1130;
                    
                    {ESLVal args = $1129;
                    
                    {ESLVal t = $1128;
                    
                    {ESLVal dt = $1127;
                    
                    {ESLVal e = $1126;
                    
                    {ESLVal g = $1125;
                    
                    {ESLVal _v284 = $1124;
                    
                    if(_v282.eql(n0).boolVal)
                    return getFunCases.apply(_v282,_v284).cons(new ESLVal("FunCase",l,args,t,g,e));
                    else
                      {ESLVal def = $1123;
                        
                        {ESLVal _v285 = $1124;
                        
                        return getFunCases.apply(_v282,_v285);
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
                  default: {ESLVal def = $1123;
                    
                    {ESLVal _v286 = $1124;
                    
                    return getFunCases.apply(_v282,_v286);
                  }
                  }
                }
                }
              else if(_v256.isNil())
                return ESLVal.list();
              else return error(new ESLVal("case error at Pos(31579,31756)").add(ESLVal.list(_v256)));
              }
            }
          });
        ESLVal removeFunCases = new ESLVal(new Function(new ESLVal("removeFunCases"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v277 = $args[0];
          ESLVal _v278 = $args[1];
          {ESLVal _v257 = _v278;
                
                if(_v257.isCons())
                {ESLVal $1132 = _v257.head();
                  ESLVal $1133 = _v257.tail();
                  
                  switch($1132.termName) {
                  case "FunBind": {ESLVal $1140 = $1132.termRef(0);
                    ESLVal $1139 = $1132.termRef(1);
                    ESLVal $1138 = $1132.termRef(2);
                    ESLVal $1137 = $1132.termRef(3);
                    ESLVal $1136 = $1132.termRef(4);
                    ESLVal $1135 = $1132.termRef(5);
                    ESLVal $1134 = $1132.termRef(6);
                    
                    {ESLVal l = $1140;
                    
                    {ESLVal n0 = $1139;
                    
                    {ESLVal args = $1138;
                    
                    {ESLVal t = $1137;
                    
                    {ESLVal dt = $1136;
                    
                    {ESLVal e = $1135;
                    
                    {ESLVal g = $1134;
                    
                    {ESLVal _v279 = $1133;
                    
                    if(_v277.eql(n0).boolVal)
                    return removeFunCases.apply(_v277,_v279);
                    else
                      {ESLVal def = $1132;
                        
                        {ESLVal _v280 = $1133;
                        
                        return removeFunCases.apply(_v277,_v280).cons(def);
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
                  default: {ESLVal def = $1132;
                    
                    {ESLVal _v281 = $1133;
                    
                    return removeFunCases.apply(_v277,_v281).cons(def);
                  }
                  }
                }
                }
              else if(_v257.isNil())
                return ESLVal.list();
              else return error(new ESLVal("case error at Pos(31815,31980)").add(ESLVal.list(_v257)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "getFunCases": return getFunCases;
            
            case "removeFunCases": return removeFunCases;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal getFunCases = letrec.get("getFunCases");
      
      ESLVal removeFunCases = letrec.get("removeFunCases");
      
        {ESLVal _v258 = defs;
        
        if(_v258.isCons())
        {ESLVal $1141 = _v258.head();
          ESLVal $1142 = _v258.tail();
          
          switch($1141.termName) {
          case "FunBind": {ESLVal $1149 = $1141.termRef(0);
            ESLVal $1148 = $1141.termRef(1);
            ESLVal $1147 = $1141.termRef(2);
            ESLVal $1146 = $1141.termRef(3);
            ESLVal $1145 = $1141.termRef(4);
            ESLVal $1144 = $1141.termRef(5);
            ESLVal $1143 = $1141.termRef(6);
            
            {ESLVal l = $1149;
            
            {ESLVal n = $1148;
            
            {ESLVal args = $1147;
            
            {ESLVal t = $1146;
            
            {ESLVal dt = $1145;
            
            {ESLVal e = $1144;
            
            {ESLVal g = $1143;
            
            {ESLVal _v287 = $1142;
            
            {ESLVal cases = getFunCases.apply(n,_v287);
            
            if(cases.eql(ESLVal.list()).boolVal)
            return mergeFunDefs.apply(_v287).cons(new ESLVal("FunBind",l,n,args,t,dt,e,g));
            else
              {ESLVal _v288 = removeFunCases.apply(n,_v287);
                
                return mergeFunDefs.apply(_v288).cons(new ESLVal("FunBinds",n,cases.cons(new ESLVal("FunCase",l,args,t,g,e))));
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
          default: {ESLVal def = $1141;
            
            {ESLVal _v289 = $1142;
            
            return mergeFunDefs.apply(_v289).cons(def);
          }
          }
        }
        }
      else if(_v258.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(31992,32412)").add(ESLVal.list(_v258)));
      }}
      
    }
  });
  public static ESLVal expandFunDefs = new ESLVal(new Function(new ESLVal("expandFunDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v259 = defs;
        
        if(_v259.isCons())
        {ESLVal $1150 = _v259.head();
          ESLVal $1151 = _v259.tail();
          
          switch($1150.termName) {
          case "FunBinds": {ESLVal $1153 = $1150.termRef(0);
            ESLVal $1152 = $1150.termRef(1);
            
            if($1152.isCons())
            {ESLVal $1154 = $1152.head();
              ESLVal $1155 = $1152.tail();
              
              switch($1154.termName) {
              case "FunCase": {ESLVal $1160 = $1154.termRef(0);
                ESLVal $1159 = $1154.termRef(1);
                ESLVal $1158 = $1154.termRef(2);
                ESLVal $1157 = $1154.termRef(3);
                ESLVal $1156 = $1154.termRef(4);
                
                {ESLVal n = $1153;
                
                {ESLVal l = $1160;
                
                {ESLVal args = $1159;
                
                {ESLVal t = $1158;
                
                {ESLVal g = $1157;
                
                {ESLVal e = $1156;
                
                {ESLVal cases = $1155;
                
                {ESLVal _v267 = $1151;
                
                {ESLVal names = new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal i = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("$").add(i));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($zero.to(length.apply(args)));
                
                return expandFunDefs.apply(_v267).cons(new ESLVal("Binding",l,n,t,t,new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(new ESLVal("Dec",l,n,$null,$null));
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(names),t,new ESLVal("Case",l,ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(new ESLVal("Var",l,n));
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(names),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v260 = $qualArg;
                      
                      switch(_v260.termName) {
                      case "FunCase": {ESLVal $1165 = _v260.termRef(0);
                        ESLVal $1164 = _v260.termRef(1);
                        ESLVal $1163 = _v260.termRef(2);
                        ESLVal $1162 = _v260.termRef(3);
                        ESLVal $1161 = _v260.termRef(4);
                        
                        {ESLVal _v268 = $1165;
                        
                        {ESLVal _v269 = $1164;
                        
                        {ESLVal _v270 = $1163;
                        
                        {ESLVal _v271 = $1162;
                        
                        {ESLVal _v272 = $1161;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("BArm",_v268,_v269,_v271,_v272)));
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v260;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(cases.cons(new ESLVal("FunCase",l,args,t,g,e))).flatten().flatten()))));
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
              default: {ESLVal d = $1150;
                
                {ESLVal _v273 = $1151;
                
                return expandFunDefs.apply(_v273).cons(d);
              }
              }
            }
            }
          else if($1152.isNil())
            {ESLVal d = $1150;
              
              {ESLVal _v274 = $1151;
              
              return expandFunDefs.apply(_v274).cons(d);
            }
            }
          else {ESLVal d = $1150;
              
              {ESLVal _v275 = $1151;
              
              return expandFunDefs.apply(_v275).cons(d);
            }
            }
          }
          default: {ESLVal d = $1150;
            
            {ESLVal _v276 = $1151;
            
            return expandFunDefs.apply(_v276).cons(d);
          }
          }
        }
        }
      else if(_v259.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(32460,32916)").add(ESLVal.list(_v259)));
      }
    }
  });
  public static ESLVal isBinding = new ESLVal(new Function(new ESLVal("isBinding"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v261 = b;
        
        switch(_v261.termName) {
        case "Binding": {ESLVal $1170 = _v261.termRef(0);
          ESLVal $1169 = _v261.termRef(1);
          ESLVal $1168 = _v261.termRef(2);
          ESLVal $1167 = _v261.termRef(3);
          ESLVal $1166 = _v261.termRef(4);
          
          {ESLVal l = $1170;
          
          {ESLVal n = $1169;
          
          {ESLVal t = $1168;
          
          {ESLVal st = $1167;
          
          {ESLVal e = $1166;
          
          return $true;
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v266 = _v261;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isFunBind = new ESLVal(new Function(new ESLVal("isFunBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v262 = b;
        
        switch(_v262.termName) {
        case "FunBind": {ESLVal $1177 = _v262.termRef(0);
          ESLVal $1176 = _v262.termRef(1);
          ESLVal $1175 = _v262.termRef(2);
          ESLVal $1174 = _v262.termRef(3);
          ESLVal $1173 = _v262.termRef(4);
          ESLVal $1172 = _v262.termRef(5);
          ESLVal $1171 = _v262.termRef(6);
          
          {ESLVal l = $1177;
          
          {ESLVal n = $1176;
          
          {ESLVal args = $1175;
          
          {ESLVal t = $1174;
          
          {ESLVal st = $1173;
          
          {ESLVal g = $1172;
          
          {ESLVal e = $1171;
          
          return $true;
        }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v265 = _v262;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal bindingName = new ESLVal(new Function(new ESLVal("bindingName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v263 = b;
        
        switch(_v263.termName) {
        case "TypeBind": {ESLVal $1203 = _v263.termRef(0);
          ESLVal $1202 = _v263.termRef(1);
          ESLVal $1201 = _v263.termRef(2);
          ESLVal $1200 = _v263.termRef(3);
          
          {ESLVal v0 = $1203;
          
          {ESLVal v1 = $1202;
          
          {ESLVal v2 = $1201;
          
          {ESLVal v3 = $1200;
          
          return v1;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $1199 = _v263.termRef(0);
          ESLVal $1198 = _v263.termRef(1);
          ESLVal $1197 = _v263.termRef(2);
          ESLVal $1196 = _v263.termRef(3);
          
          {ESLVal v0 = $1199;
          
          {ESLVal v1 = $1198;
          
          {ESLVal v2 = $1197;
          
          {ESLVal v3 = $1196;
          
          return v1;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $1195 = _v263.termRef(0);
          ESLVal $1194 = _v263.termRef(1);
          ESLVal $1193 = _v263.termRef(2);
          ESLVal $1192 = _v263.termRef(3);
          ESLVal $1191 = _v263.termRef(4);
          ESLVal $1190 = _v263.termRef(5);
          ESLVal $1189 = _v263.termRef(6);
          
          {ESLVal v0 = $1195;
          
          {ESLVal v1 = $1194;
          
          {ESLVal v2 = $1193;
          
          {ESLVal v3 = $1192;
          
          {ESLVal v4 = $1191;
          
          {ESLVal v5 = $1190;
          
          {ESLVal v6 = $1189;
          
          return v1;
        }
        }
        }
        }
        }
        }
        }
        }
      case "FunBinds": {ESLVal $1188 = _v263.termRef(0);
          ESLVal $1187 = _v263.termRef(1);
          
          {ESLVal n = $1188;
          
          {ESLVal cases = $1187;
          
          return n;
        }
        }
        }
      case "Binding": {ESLVal $1186 = _v263.termRef(0);
          ESLVal $1185 = _v263.termRef(1);
          ESLVal $1184 = _v263.termRef(2);
          ESLVal $1183 = _v263.termRef(3);
          ESLVal $1182 = _v263.termRef(4);
          
          {ESLVal v0 = $1186;
          
          {ESLVal v1 = $1185;
          
          {ESLVal v2 = $1184;
          
          {ESLVal v3 = $1183;
          
          {ESLVal v4 = $1182;
          
          return v1;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $1181 = _v263.termRef(0);
          ESLVal $1180 = _v263.termRef(1);
          ESLVal $1179 = _v263.termRef(2);
          ESLVal $1178 = _v263.termRef(3);
          
          {ESLVal v0 = $1181;
          
          {ESLVal v1 = $1180;
          
          {ESLVal v2 = $1179;
          
          {ESLVal v3 = $1178;
          
          return v1;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(33226,33575)").add(ESLVal.list(_v263)));
      }
      }
    }
  });
  public static ESLVal bindingLoc = new ESLVal(new Function(new ESLVal("bindingLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v264 = b;
        
        switch(_v264.termName) {
        case "TypeBind": {ESLVal $1236 = _v264.termRef(0);
          ESLVal $1235 = _v264.termRef(1);
          ESLVal $1234 = _v264.termRef(2);
          ESLVal $1233 = _v264.termRef(3);
          
          {ESLVal v0 = $1236;
          
          {ESLVal v1 = $1235;
          
          {ESLVal v2 = $1234;
          
          {ESLVal v3 = $1233;
          
          return v0;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $1232 = _v264.termRef(0);
          ESLVal $1231 = _v264.termRef(1);
          ESLVal $1230 = _v264.termRef(2);
          ESLVal $1229 = _v264.termRef(3);
          
          {ESLVal v0 = $1232;
          
          {ESLVal v1 = $1231;
          
          {ESLVal v2 = $1230;
          
          {ESLVal v3 = $1229;
          
          return v0;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $1228 = _v264.termRef(0);
          ESLVal $1227 = _v264.termRef(1);
          ESLVal $1226 = _v264.termRef(2);
          ESLVal $1225 = _v264.termRef(3);
          ESLVal $1224 = _v264.termRef(4);
          ESLVal $1223 = _v264.termRef(5);
          ESLVal $1222 = _v264.termRef(6);
          
          {ESLVal v0 = $1228;
          
          {ESLVal v1 = $1227;
          
          {ESLVal v2 = $1226;
          
          {ESLVal v3 = $1225;
          
          {ESLVal v4 = $1224;
          
          {ESLVal v5 = $1223;
          
          {ESLVal v6 = $1222;
          
          return v0;
        }
        }
        }
        }
        }
        }
        }
        }
      case "FunBinds": {ESLVal $1214 = _v264.termRef(0);
          ESLVal $1213 = _v264.termRef(1);
          
          if($1213.isCons())
          {ESLVal $1215 = $1213.head();
            ESLVal $1216 = $1213.tail();
            
            switch($1215.termName) {
            case "FunCase": {ESLVal $1221 = $1215.termRef(0);
              ESLVal $1220 = $1215.termRef(1);
              ESLVal $1219 = $1215.termRef(2);
              ESLVal $1218 = $1215.termRef(3);
              ESLVal $1217 = $1215.termRef(4);
              
              {ESLVal n = $1214;
              
              {ESLVal l = $1221;
              
              {ESLVal args = $1220;
              
              {ESLVal t = $1219;
              
              {ESLVal g = $1218;
              
              {ESLVal e = $1217;
              
              {ESLVal cases = $1216;
              
              return l;
            }
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(33607,33978)").add(ESLVal.list(_v264)));
          }
          }
        else if($1213.isNil())
          return error(new ESLVal("case error at Pos(33607,33978)").add(ESLVal.list(_v264)));
        else return error(new ESLVal("case error at Pos(33607,33978)").add(ESLVal.list(_v264)));
        }
      case "Binding": {ESLVal $1212 = _v264.termRef(0);
          ESLVal $1211 = _v264.termRef(1);
          ESLVal $1210 = _v264.termRef(2);
          ESLVal $1209 = _v264.termRef(3);
          ESLVal $1208 = _v264.termRef(4);
          
          {ESLVal v0 = $1212;
          
          {ESLVal v1 = $1211;
          
          {ESLVal v2 = $1210;
          
          {ESLVal v3 = $1209;
          
          {ESLVal v4 = $1208;
          
          return v0;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $1207 = _v264.termRef(0);
          ESLVal $1206 = _v264.termRef(1);
          ESLVal $1205 = _v264.termRef(2);
          ESLVal $1204 = _v264.termRef(3);
          
          {ESLVal v0 = $1207;
          
          {ESLVal v1 = $1206;
          
          {ESLVal v2 = $1205;
          
          {ESLVal v3 = $1204;
          
          return v0;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(33607,33978)").add(ESLVal.list(_v264)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}