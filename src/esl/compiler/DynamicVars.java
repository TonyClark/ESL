package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class DynamicVars {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v227 = d;
        
        switch(_v227.termName) {
        case "JDec": {ESLVal $677 = _v227.termRef(0);
          ESLVal $676 = _v227.termRef(1);
          
          {ESLVal n = $677;
          
          {ESLVal t = $676;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(156,201)"));
      }
      }
    }
  });
  private static ESLVal fieldName = new ESLVal(new Function(new ESLVal("fieldName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v226 = d;
        
        switch(_v226.termName) {
        case "JField": {ESLVal $675 = _v226.termRef(0);
          ESLVal $674 = _v226.termRef(1);
          ESLVal $673 = _v226.termRef(2);
          
          {ESLVal n = $675;
          
          {ESLVal t = $674;
          
          {ESLVal e = $673;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(236,290)"));
      }
      }
    }
  });
  private static ESLVal fieldJExp = new ESLVal(new Function(new ESLVal("fieldJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v225 = d;
        
        switch(_v225.termName) {
        case "JField": {ESLVal $672 = _v225.termRef(0);
          ESLVal $671 = _v225.termRef(1);
          ESLVal $670 = _v225.termRef(2);
          
          {ESLVal n = $672;
          
          {ESLVal t = $671;
          
          {ESLVal e = $670;
          
          return e;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(326,380)"));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJModule = new ESLVal(new Function(new ESLVal("dynamicVarsJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v222 = m;
        
        switch(_v222.termName) {
        case "JModule": {ESLVal $666 = _v222.termRef(0);
          ESLVal $665 = _v222.termRef(1);
          ESLVal $664 = _v222.termRef(2);
          ESLVal $663 = _v222.termRef(3);
          
          {ESLVal n = $666;
          
          {ESLVal exports = $665;
          
          {ESLVal imports = $664;
          
          {ESLVal fs = $663;
          
          {{
          ESLVal _v223 = fs;
          while(_v223.isCons()) {
            ESLVal f = _v223.headVal;
            ((Supplier<ESLVal>)() -> { 
              {ESLVal _v224 = f;
                
                switch(_v224.termName) {
                case "JField": {ESLVal $669 = _v224.termRef(0);
                  ESLVal $668 = _v224.termRef(1);
                  ESLVal $667 = _v224.termRef(2);
                  
                  {ESLVal name = $669;
                  
                  {ESLVal t = $668;
                  
                  {ESLVal e = $667;
                  
                  return dynamicVarsJExp.apply(e);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(540,638)"));
              }
              }
            }).get();
            _v223 = _v223.tailVal;}
        }
        return $null;}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(420,650)"));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJExp = new ESLVal(new Function(new ESLVal("dynamicVarsJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v221 = x;
        
        switch(_v221.termName) {
        case "JArrayRef": {ESLVal $662 = _v221.termRef(0);
          ESLVal $661 = _v221.termRef(1);
          
          {ESLVal a = $662;
          
          {ESLVal i = $661;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $660 = _v221.termRef(0);
          ESLVal $659 = _v221.termRef(1);
          ESLVal $658 = _v221.termRef(2);
          
          {ESLVal a = $660;
          
          {ESLVal i = $659;
          
          {ESLVal v = $658;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i).add(dynamicVarsJExp.apply(v)));
        }
        }
        }
        }
      case "JBecome": {ESLVal $657 = _v221.termRef(0);
          ESLVal $656 = _v221.termRef(1);
          
          {ESLVal e = $657;
          
          {ESLVal es = $656;
          
          return dynamicVarsJExp.apply(e).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun559"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v228 = $args[0];
          return dynamicVarsJExp.apply(_v228);
            }
          }),es)));
        }
        }
        }
      case "JFun": {ESLVal $655 = _v221.termRef(0);
          ESLVal $654 = _v221.termRef(1);
          ESLVal $653 = _v221.termRef(2);
          ESLVal $652 = _v221.termRef(3);
          
          {ESLVal v0 = $655;
          
          {ESLVal v1 = $654;
          
          {ESLVal v2 = $653;
          
          {ESLVal v3 = $652;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun560"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(decName,v1));
            }
          }),dynamicVarsJCommand.apply(v3));
        }
        }
        }
        }
        }
      case "JApply": {ESLVal $651 = _v221.termRef(0);
          ESLVal $650 = _v221.termRef(1);
          
          {ESLVal v0 = $651;
          
          {ESLVal v1 = $650;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun561"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JBinExp": {ESLVal $649 = _v221.termRef(0);
          ESLVal $648 = _v221.termRef(1);
          ESLVal $647 = _v221.termRef(2);
          
          {ESLVal v0 = $649;
          
          {ESLVal v1 = $648;
          
          {ESLVal v2 = $647;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v2));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $646 = _v221.termRef(0);
          ESLVal $645 = _v221.termRef(1);
          
          {ESLVal v0 = $646;
          
          {ESLVal v1 = $645;
          
          return dynamicVarsJCommand.apply(v0);
        }
        }
        }
      case "JIfExp": {ESLVal $644 = _v221.termRef(0);
          ESLVal $643 = _v221.termRef(1);
          ESLVal $642 = _v221.termRef(2);
          
          {ESLVal v0 = $644;
          
          {ESLVal v1 = $643;
          
          {ESLVal v2 = $642;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $641 = _v221.termRef(0);
          
          {ESLVal v0 = $641;
          
          return ESLVal.list();
        }
        }
      case "JTerm": {ESLVal $640 = _v221.termRef(0);
          ESLVal $639 = _v221.termRef(1);
          
          {ESLVal v0 = $640;
          
          {ESLVal v1 = $639;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun562"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JTermRef": {ESLVal $638 = _v221.termRef(0);
          ESLVal $637 = _v221.termRef(1);
          
          {ESLVal v0 = $638;
          
          {ESLVal v1 = $637;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JList": {ESLVal $636 = _v221.termRef(0);
          ESLVal $635 = _v221.termRef(1);
          
          {ESLVal v0 = $636;
          
          {ESLVal v1 = $635;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun563"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNil": {ESLVal $634 = _v221.termRef(0);
          
          {ESLVal v0 = $634;
          
          return ESLVal.list();
        }
        }
      case "JVar": {ESLVal $633 = _v221.termRef(0);
          ESLVal $632 = _v221.termRef(1);
          
          {ESLVal v0 = $633;
          
          {ESLVal v1 = $632;
          
          return ESLVal.list();
        }
        }
        }
      case "JNull": {
          return ESLVal.list();
        }
      case "JNow": {
          return ESLVal.list();
        }
      case "JError": {ESLVal $631 = _v221.termRef(0);
          
          {ESLVal v0 = $631;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JHead": {ESLVal $630 = _v221.termRef(0);
          
          {ESLVal v0 = $630;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JTail": {ESLVal $629 = _v221.termRef(0);
          
          {ESLVal v0 = $629;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JMapFun": {ESLVal $628 = _v221.termRef(0);
          ESLVal $627 = _v221.termRef(1);
          
          {ESLVal v0 = $628;
          
          {ESLVal v1 = $627;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JFlatten": {ESLVal $626 = _v221.termRef(0);
          
          {ESLVal v0 = $626;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNot": {ESLVal $625 = _v221.termRef(0);
          
          {ESLVal v0 = $625;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JBehaviour": {ESLVal $624 = _v221.termRef(0);
          ESLVal $623 = _v221.termRef(1);
          ESLVal $622 = _v221.termRef(2);
          ESLVal $621 = _v221.termRef(3);
          ESLVal $620 = _v221.termRef(4);
          
          {ESLVal v0 = $624;
          
          {ESLVal v1 = $623;
          
          {ESLVal v2 = $622;
          
          {ESLVal v3 = $621;
          
          {ESLVal v4 = $620;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun564"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return dynamicVarsJFieldDef.apply(d);
            }
          }),v1)).add(dynamicVarsJExp.apply(v2).add(dynamicVarsJExp.apply(v3).add(dynamicVarsJCommand.apply(v4))));
        }
        }
        }
        }
        }
        }
      case "JNew": {ESLVal $619 = _v221.termRef(0);
          ESLVal $618 = _v221.termRef(1);
          
          {ESLVal v0 = $619;
          
          {ESLVal v1 = $618;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun565"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JNewArray": {ESLVal $617 = _v221.termRef(0);
          
          {ESLVal v0 = $617;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNewJava": {ESLVal $616 = _v221.termRef(0);
          ESLVal $615 = _v221.termRef(1);
          
          {ESLVal v0 = $616;
          
          {ESLVal v1 = $615;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun566"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JSend": {ESLVal $614 = _v221.termRef(0);
          ESLVal $613 = _v221.termRef(1);
          ESLVal $612 = _v221.termRef(2);
          
          {ESLVal v0 = $614;
          
          {ESLVal v1 = $613;
          
          {ESLVal v2 = $612;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun567"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v2)));
        }
        }
        }
        }
      case "JSelf": {
          return ESLVal.list();
        }
      case "JTry": {ESLVal $611 = _v221.termRef(0);
          ESLVal $610 = _v221.termRef(1);
          ESLVal $609 = _v221.termRef(2);
          
          {ESLVal e = $611;
          
          {ESLVal n = $610;
          
          {ESLVal c = $609;
          
          return dynamicVarsJExp.apply(e).add(dynamicVarsJCommand.apply(c));
        }
        }
        }
        }
      case "JRef": {ESLVal $608 = _v221.termRef(0);
          ESLVal $607 = _v221.termRef(1);
          
          {ESLVal v0 = $608;
          
          {ESLVal v1 = $607;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JGrab": {ESLVal $606 = _v221.termRef(0);
          ESLVal $605 = _v221.termRef(1);
          
          {ESLVal v0 = $606;
          
          {ESLVal v1 = $605;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun568"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v0)).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JProbably": {ESLVal $604 = _v221.termRef(0);
          ESLVal $603 = _v221.termRef(1);
          ESLVal $602 = _v221.termRef(2);
          
          {ESLVal v0 = $604;
          
          {ESLVal v1 = $603;
          
          {ESLVal v2 = $602;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(726,3400)"));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJFieldDef = new ESLVal(new Function(new ESLVal("dynamicVarsJFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v220 = d;
        
        switch(_v220.termName) {
        case "JField": {ESLVal $601 = _v220.termRef(0);
          ESLVal $600 = _v220.termRef(1);
          ESLVal $599 = _v220.termRef(2);
          
          {ESLVal n = $601;
          
          {ESLVal t = $600;
          
          {ESLVal e = $599;
          
          return dynamicVarsJExp.apply(e);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3450,3521)"));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJTermArm = new ESLVal(new Function(new ESLVal("dynamicVarsJTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v219 = t;
        
        switch(_v219.termName) {
        case "JTArm": {ESLVal $598 = _v219.termRef(0);
          ESLVal $597 = _v219.termRef(1);
          ESLVal $596 = _v219.termRef(2);
          
          {ESLVal n = $598;
          
          {ESLVal i = $597;
          
          {ESLVal c = $596;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3568,3644)"));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJIntArm = new ESLVal(new Function(new ESLVal("dynamicVarsJIntArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v218 = t;
        
        switch(_v218.termName) {
        case "JIArm": {ESLVal $595 = _v218.termRef(0);
          ESLVal $594 = _v218.termRef(1);
          
          {ESLVal i = $595;
          
          {ESLVal c = $594;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3689,3758)"));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJStrArm = new ESLVal(new Function(new ESLVal("dynamicVarsJStrArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v217 = t;
        
        switch(_v217.termName) {
        case "JSArm": {ESLVal $593 = _v217.termRef(0);
          ESLVal $592 = _v217.termRef(1);
          
          {ESLVal s = $593;
          
          {ESLVal c = $592;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3803,3872)"));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJBoolArm = new ESLVal(new Function(new ESLVal("dynamicVarsJBoolArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v216 = t;
        
        switch(_v216.termName) {
        case "JBArm": {ESLVal $591 = _v216.termRef(0);
          ESLVal $590 = _v216.termRef(1);
          
          {ESLVal b = $591;
          
          {ESLVal c = $590;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3919,3990)"));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJCommand = new ESLVal(new Function(new ESLVal("dynamicVarsJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v215 = x;
        
        switch(_v215.termName) {
        case "JBlock": {ESLVal $589 = _v215.termRef(0);
          
          {ESLVal v0 = $589;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun569"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJCommand.apply(e);
            }
          }),v0));
        }
        }
      case "JReturn": {ESLVal $588 = _v215.termRef(0);
          
          {ESLVal v0 = $588;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JIfCommand": {ESLVal $587 = _v215.termRef(0);
          ESLVal $586 = _v215.termRef(1);
          ESLVal $585 = _v215.termRef(2);
          
          {ESLVal v0 = $587;
          
          {ESLVal v1 = $586;
          
          {ESLVal v2 = $585;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $584 = _v215.termRef(0);
          ESLVal $583 = _v215.termRef(1);
          ESLVal $582 = _v215.termRef(2);
          ESLVal $581 = _v215.termRef(3);
          
          {ESLVal v0 = $584;
          
          {ESLVal v1 = $583;
          
          {ESLVal v2 = $582;
          
          {ESLVal v3 = $581;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2).add(dynamicVarsJCommand.apply(v3))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $580 = _v215.termRef(0);
          ESLVal $579 = _v215.termRef(1);
          ESLVal $578 = _v215.termRef(2);
          
          {ESLVal v0 = $580;
          
          {ESLVal v1 = $579;
          
          {ESLVal v2 = $578;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun570"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJTermArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $577 = _v215.termRef(0);
          ESLVal $576 = _v215.termRef(1);
          ESLVal $575 = _v215.termRef(2);
          
          {ESLVal v0 = $577;
          
          {ESLVal v1 = $576;
          
          {ESLVal v2 = $575;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun571"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJIntArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $574 = _v215.termRef(0);
          ESLVal $573 = _v215.termRef(1);
          ESLVal $572 = _v215.termRef(2);
          
          {ESLVal v0 = $574;
          
          {ESLVal v1 = $573;
          
          {ESLVal v2 = $572;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun572"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJStrArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $571 = _v215.termRef(0);
          ESLVal $570 = _v215.termRef(1);
          ESLVal $569 = _v215.termRef(2);
          
          {ESLVal v0 = $571;
          
          {ESLVal v1 = $570;
          
          {ESLVal v2 = $569;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun573"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJBoolArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JLet": {ESLVal $568 = _v215.termRef(0);
          ESLVal $567 = _v215.termRef(1);
          
          {ESLVal v0 = $568;
          
          {ESLVal v1 = $567;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun574"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun575"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JLetRec": {ESLVal $566 = _v215.termRef(0);
          ESLVal $565 = _v215.termRef(1);
          
          {ESLVal v0 = $566;
          
          {ESLVal v1 = $565;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun576"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun577"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JUpdate": {ESLVal $564 = _v215.termRef(0);
          ESLVal $563 = _v215.termRef(1);
          
          {ESLVal v0 = $564;
          
          {ESLVal v1 = $563;
          
          return ESLVal.list(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JStatement": {ESLVal $562 = _v215.termRef(0);
          
          {ESLVal v0 = $562;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JFor": {ESLVal $561 = _v215.termRef(0);
          ESLVal $560 = _v215.termRef(1);
          ESLVal $559 = _v215.termRef(2);
          ESLVal $558 = _v215.termRef(3);
          
          {ESLVal listName = $561;
          
          {ESLVal v0 = $560;
          
          {ESLVal v1 = $559;
          
          {ESLVal v2 = $558;
          
          return ESLVal.list(listName).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4080,6007)"));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}