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
  {ESLVal _v1809 = as;
        
        if(_v1809.isCons())
        {ESLVal $2664 = _v1809.head();
          ESLVal $2665 = _v1809.tail();
          
          switch($2664.termName) {
          case "BArm": {ESLVal $2669 = $2664.termRef(0);
            ESLVal $2668 = $2664.termRef(1);
            ESLVal $2667 = $2664.termRef(2);
            ESLVal $2666 = $2664.termRef(3);
            
            {ESLVal l = $2669;
            
            {ESLVal ps = $2668;
            
            {ESLVal g = $2667;
            
            {ESLVal e = $2666;
            
            {ESLVal _v1832 = $2665;
            
            return translateArms.apply(_v1832).cons(new ESLVal("LArm",l,ps,$nil,g,e));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v1809)));
        }
        }
      else if(_v1809.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v1809)));
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
  {ESLVal _v1795 = exp;
        
        switch(_v1795.termName) {
        case "Module": {ESLVal $2663 = _v1795.termRef(0);
          ESLVal $2662 = _v1795.termRef(1);
          ESLVal $2661 = _v1795.termRef(2);
          ESLVal $2660 = _v1795.termRef(3);
          ESLVal $2659 = _v1795.termRef(4);
          ESLVal $2658 = _v1795.termRef(5);
          ESLVal $2657 = _v1795.termRef(6);
          
          {ESLVal path = $2663;
          
          {ESLVal name = $2662;
          
          {ESLVal exports = $2661;
          
          {ESLVal imports = $2660;
          
          {ESLVal x = $2659;
          
          {ESLVal y = $2658;
          
          {ESLVal defs = $2657;
          
          return new ESLVal("Module",path,name,exports,imports,x,y,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1808 = $qualArg;
                
                {ESLVal d = _v1808;
                
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
      case "FunExp": {ESLVal $2656 = _v1795.termRef(0);
          ESLVal $2655 = _v1795.termRef(1);
          ESLVal $2654 = _v1795.termRef(2);
          ESLVal $2653 = _v1795.termRef(3);
          ESLVal $2652 = _v1795.termRef(4);
          
          {ESLVal l = $2656;
          
          {ESLVal n = $2655;
          
          {ESLVal args = $2654;
          
          {ESLVal t = $2653;
          
          {ESLVal e = $2652;
          
          return new ESLVal("FunExp",l,n,args,t,translateCases.apply(e));
        }
        }
        }
        }
        }
        }
      case "StrExp": {ESLVal $2651 = _v1795.termRef(0);
          ESLVal $2650 = _v1795.termRef(1);
          
          {ESLVal l = $2651;
          
          {ESLVal v = $2650;
          
          return exp;
        }
        }
        }
      case "IntExp": {ESLVal $2649 = _v1795.termRef(0);
          ESLVal $2648 = _v1795.termRef(1);
          
          {ESLVal l = $2649;
          
          {ESLVal v = $2648;
          
          return exp;
        }
        }
        }
      case "BoolExp": {ESLVal $2647 = _v1795.termRef(0);
          ESLVal $2646 = _v1795.termRef(1);
          
          {ESLVal l = $2647;
          
          {ESLVal v = $2646;
          
          return exp;
        }
        }
        }
      case "NullExp": {ESLVal $2645 = _v1795.termRef(0);
          
          {ESLVal l = $2645;
          
          return exp;
        }
        }
      case "FloatExp": {ESLVal $2644 = _v1795.termRef(0);
          ESLVal $2643 = _v1795.termRef(1);
          
          {ESLVal l = $2644;
          
          {ESLVal f = $2643;
          
          return exp;
        }
        }
        }
      case "Term": {ESLVal $2642 = _v1795.termRef(0);
          ESLVal $2641 = _v1795.termRef(1);
          ESLVal $2640 = _v1795.termRef(2);
          ESLVal $2639 = _v1795.termRef(3);
          
          {ESLVal l = $2642;
          
          {ESLVal n = $2641;
          
          {ESLVal ts = $2640;
          
          {ESLVal es = $2639;
          
          return new ESLVal("Term",l,n,ts,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1807 = $qualArg;
                
                {ESLVal e = _v1807;
                
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
      case "List": {ESLVal $2638 = _v1795.termRef(0);
          ESLVal $2637 = _v1795.termRef(1);
          
          {ESLVal l = $2638;
          
          {ESLVal es = $2637;
          
          return new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1806 = $qualArg;
                
                {ESLVal e = _v1806;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Block": {ESLVal $2636 = _v1795.termRef(0);
          ESLVal $2635 = _v1795.termRef(1);
          
          {ESLVal l = $2636;
          
          {ESLVal es = $2635;
          
          return new ESLVal("Block",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1805 = $qualArg;
                
                {ESLVal e = _v1805;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Apply": {ESLVal $2634 = _v1795.termRef(0);
          ESLVal $2633 = _v1795.termRef(1);
          ESLVal $2632 = _v1795.termRef(2);
          
          {ESLVal l = $2634;
          
          {ESLVal op = $2633;
          
          {ESLVal args = $2632;
          
          return new ESLVal("Apply",l,translateCases.apply(op),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1804 = $qualArg;
                
                {ESLVal e = _v1804;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $2631 = _v1795.termRef(0);
          ESLVal $2630 = _v1795.termRef(1);
          ESLVal $2629 = _v1795.termRef(2);
          
          {ESLVal l = $2631;
          
          {ESLVal op = $2630;
          
          {ESLVal args = $2629;
          
          return new ESLVal("ApplyTypeExp",l,translateCases.apply(op),args);
        }
        }
        }
        }
      case "Case": {ESLVal $2628 = _v1795.termRef(0);
          ESLVal $2627 = _v1795.termRef(1);
          ESLVal $2626 = _v1795.termRef(2);
          ESLVal $2625 = _v1795.termRef(3);
          
          {ESLVal l = $2628;
          
          {ESLVal ds = $2627;
          
          {ESLVal es = $2626;
          
          {ESLVal as = $2625;
          
          return compileCase.apply(l,es,translateArms.apply(as),new ESLVal("CaseError",l,new ESLVal("List",l,es)));
        }
        }
        }
        }
        }
      case "BinExp": {ESLVal $2624 = _v1795.termRef(0);
          ESLVal $2623 = _v1795.termRef(1);
          ESLVal $2622 = _v1795.termRef(2);
          ESLVal $2621 = _v1795.termRef(3);
          
          {ESLVal l = $2624;
          
          {ESLVal e1 = $2623;
          
          {ESLVal op = $2622;
          
          {ESLVal e2 = $2621;
          
          return new ESLVal("BinExp",l,translateCases.apply(e1),op,translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "For": {ESLVal $2620 = _v1795.termRef(0);
          ESLVal $2619 = _v1795.termRef(1);
          ESLVal $2618 = _v1795.termRef(2);
          ESLVal $2617 = _v1795.termRef(3);
          
          {ESLVal l = $2620;
          
          {ESLVal p = $2619;
          
          {ESLVal e1 = $2618;
          
          {ESLVal e2 = $2617;
          
          return new ESLVal("For",l,p,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $2616 = _v1795.termRef(0);
          ESLVal $2615 = _v1795.termRef(1);
          ESLVal $2614 = _v1795.termRef(2);
          
          {ESLVal l = $2616;
          
          {ESLVal t = $2615;
          
          {ESLVal e = $2614;
          
          return new ESLVal("Throw",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Try": {ESLVal $2613 = _v1795.termRef(0);
          ESLVal $2612 = _v1795.termRef(1);
          ESLVal $2611 = _v1795.termRef(2);
          
          {ESLVal l = $2613;
          
          {ESLVal e = $2612;
          
          {ESLVal as = $2611;
          
          return new ESLVal("Try",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1803 = $qualArg;
                
                {ESLVal a = _v1803;
                
                return ESLVal.list(ESLVal.list(translateArm.apply(a)));
              }
              }
            }
          }).map(as).flatten().flatten());
        }
        }
        }
        }
      case "ActExp": {ESLVal $2610 = _v1795.termRef(0);
          ESLVal $2609 = _v1795.termRef(1);
          ESLVal $2608 = _v1795.termRef(2);
          ESLVal $2607 = _v1795.termRef(3);
          ESLVal $2606 = _v1795.termRef(4);
          ESLVal $2605 = _v1795.termRef(5);
          ESLVal $2604 = _v1795.termRef(6);
          ESLVal $2603 = _v1795.termRef(7);
          
          {ESLVal l = $2610;
          
          {ESLVal n = $2609;
          
          {ESLVal args = $2608;
          
          {ESLVal x = $2607;
          
          {ESLVal spec = $2606;
          
          {ESLVal locals = $2605;
          
          {ESLVal init = $2604;
          
          {ESLVal handlers = $2603;
          
          return new ESLVal("ActExp",l,n,args,x,spec,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1801 = $qualArg;
                
                {ESLVal b = _v1801;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(locals).flatten().flatten(),translateCases.apply(init),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1802 = $qualArg;
                
                {ESLVal h = _v1802;
                
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
      case "If": {ESLVal $2602 = _v1795.termRef(0);
          ESLVal $2601 = _v1795.termRef(1);
          ESLVal $2600 = _v1795.termRef(2);
          ESLVal $2599 = _v1795.termRef(3);
          
          {ESLVal l = $2602;
          
          {ESLVal e1 = $2601;
          
          {ESLVal e2 = $2600;
          
          {ESLVal e3 = $2599;
          
          return new ESLVal("If",l,translateCases.apply(e1),translateCases.apply(e2),translateCases.apply(e3));
        }
        }
        }
        }
        }
      case "Self": {ESLVal $2598 = _v1795.termRef(0);
          
          {ESLVal l = $2598;
          
          return exp;
        }
        }
      case "Update": {ESLVal $2597 = _v1795.termRef(0);
          ESLVal $2596 = _v1795.termRef(1);
          ESLVal $2595 = _v1795.termRef(2);
          
          {ESLVal l = $2597;
          
          {ESLVal n = $2596;
          
          {ESLVal e = $2595;
          
          return new ESLVal("Update",l,n,translateCases.apply(e));
        }
        }
        }
        }
      case "Ref": {ESLVal $2594 = _v1795.termRef(0);
          ESLVal $2593 = _v1795.termRef(1);
          ESLVal $2592 = _v1795.termRef(2);
          
          {ESLVal l = $2594;
          
          {ESLVal e = $2593;
          
          {ESLVal n = $2592;
          
          return new ESLVal("Ref",l,translateCases.apply(e),n);
        }
        }
        }
        }
      case "Var": {ESLVal $2591 = _v1795.termRef(0);
          ESLVal $2590 = _v1795.termRef(1);
          
          {ESLVal l = $2591;
          
          {ESLVal n = $2590;
          
          return exp;
        }
        }
        }
      case "Send": {ESLVal $2589 = _v1795.termRef(0);
          ESLVal $2588 = _v1795.termRef(1);
          ESLVal $2587 = _v1795.termRef(2);
          
          {ESLVal l = $2589;
          
          {ESLVal target = $2588;
          
          {ESLVal message = $2587;
          
          return new ESLVal("Send",l,translateCases.apply(target),translateCases.apply(message));
        }
        }
        }
        }
      case "SendTimeSuper": {ESLVal $2586 = _v1795.termRef(0);
          
          {ESLVal l = $2586;
          
          return new ESLVal("SendTimeSuper",l);
        }
        }
      case "SendSuper": {ESLVal $2585 = _v1795.termRef(0);
          ESLVal $2584 = _v1795.termRef(1);
          
          {ESLVal l = $2585;
          
          {ESLVal e = $2584;
          
          return new ESLVal("SendSuper",l,translateCases.apply(e));
        }
        }
        }
      case "Cmp": {ESLVal $2583 = _v1795.termRef(0);
          ESLVal $2582 = _v1795.termRef(1);
          ESLVal $2581 = _v1795.termRef(2);
          
          {ESLVal l = $2583;
          
          {ESLVal e = $2582;
          
          {ESLVal qs = $2581;
          
          return new ESLVal("Cmp",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1800 = $qualArg;
                
                {ESLVal q = _v1800;
                
                return ESLVal.list(ESLVal.list(translateQual.apply(q)));
              }
              }
            }
          }).map(qs).flatten().flatten());
        }
        }
        }
        }
      case "New": {ESLVal $2580 = _v1795.termRef(0);
          ESLVal $2579 = _v1795.termRef(1);
          ESLVal $2578 = _v1795.termRef(2);
          
          {ESLVal l = $2580;
          
          {ESLVal b = $2579;
          
          {ESLVal args = $2578;
          
          return new ESLVal("New",l,translateCases.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1799 = $qualArg;
                
                {ESLVal e = _v1799;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "NewJava": {ESLVal $2577 = _v1795.termRef(0);
          ESLVal $2576 = _v1795.termRef(1);
          ESLVal $2575 = _v1795.termRef(2);
          ESLVal $2574 = _v1795.termRef(3);
          
          {ESLVal l = $2577;
          
          {ESLVal className = $2576;
          
          {ESLVal t = $2575;
          
          {ESLVal args = $2574;
          
          return new ESLVal("NewJava",l,className,t,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1798 = $qualArg;
                
                {ESLVal e = _v1798;
                
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
      case "Let": {ESLVal $2573 = _v1795.termRef(0);
          ESLVal $2572 = _v1795.termRef(1);
          ESLVal $2571 = _v1795.termRef(2);
          
          {ESLVal l = $2573;
          
          {ESLVal bs = $2572;
          
          {ESLVal e = $2571;
          
          return new ESLVal("Let",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1797 = $qualArg;
                
                {ESLVal b = _v1797;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Letrec": {ESLVal $2570 = _v1795.termRef(0);
          ESLVal $2569 = _v1795.termRef(1);
          ESLVal $2568 = _v1795.termRef(2);
          
          {ESLVal l = $2570;
          
          {ESLVal bs = $2569;
          
          {ESLVal e = $2568;
          
          return new ESLVal("Letrec",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1796 = $qualArg;
                
                {ESLVal b = _v1796;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Grab": {ESLVal $2567 = _v1795.termRef(0);
          ESLVal $2566 = _v1795.termRef(1);
          ESLVal $2565 = _v1795.termRef(2);
          
          {ESLVal l = $2567;
          
          {ESLVal rs = $2566;
          
          {ESLVal e = $2565;
          
          return new ESLVal("Grab",l,rs,translateCases.apply(e));
        }
        }
        }
        }
      case "Probably": {ESLVal $2564 = _v1795.termRef(0);
          ESLVal $2563 = _v1795.termRef(1);
          ESLVal $2562 = _v1795.termRef(2);
          ESLVal $2561 = _v1795.termRef(3);
          ESLVal $2560 = _v1795.termRef(4);
          
          {ESLVal l = $2564;
          
          {ESLVal p = $2563;
          
          {ESLVal t = $2562;
          
          {ESLVal e1 = $2561;
          
          {ESLVal e2 = $2560;
          
          return new ESLVal("Probably",l,translateCases.apply(p),t,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $2559 = _v1795.termRef(0);
          ESLVal $2558 = _v1795.termRef(1);
          
          {ESLVal l = $2559;
          
          {ESLVal e = $2558;
          
          return new ESLVal("Not",l,translateCases.apply(e));
        }
        }
        }
      case "Fold": {ESLVal $2557 = _v1795.termRef(0);
          ESLVal $2556 = _v1795.termRef(1);
          ESLVal $2555 = _v1795.termRef(2);
          
          {ESLVal l = $2557;
          
          {ESLVal t = $2556;
          
          {ESLVal e = $2555;
          
          return new ESLVal("Fold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Unfold": {ESLVal $2554 = _v1795.termRef(0);
          ESLVal $2553 = _v1795.termRef(1);
          ESLVal $2552 = _v1795.termRef(2);
          
          {ESLVal l = $2554;
          
          {ESLVal t = $2553;
          
          {ESLVal e = $2552;
          
          return new ESLVal("Unfold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Now": {ESLVal $2551 = _v1795.termRef(0);
          
          {ESLVal l = $2551;
          
          return exp;
        }
        }
      case "Become": {ESLVal $2550 = _v1795.termRef(0);
          ESLVal $2549 = _v1795.termRef(1);
          
          {ESLVal l = $2550;
          
          {ESLVal e = $2549;
          
          return new ESLVal("Become",l,translateCases.apply(e));
        }
        }
        }
        default: {ESLVal x = _v1795;
          
          return error(exp);
        }
      }
      }
    }
  });
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v1794 = arm;
        
        switch(_v1794.termName) {
        case "LArm": {ESLVal $2548 = _v1794.termRef(0);
          ESLVal $2547 = _v1794.termRef(1);
          ESLVal $2546 = _v1794.termRef(2);
          ESLVal $2545 = _v1794.termRef(3);
          ESLVal $2544 = _v1794.termRef(4);
          
          {ESLVal l = $2548;
          
          {ESLVal ps = $2547;
          
          {ESLVal bs = $2546;
          
          {ESLVal g = $2545;
          
          {ESLVal e = $2544;
          
          return ps;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7773,7853)").add(ESLVal.list(_v1794)));
      }
      }
    }
  });
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v1793 = arm;
        
        switch(_v1793.termName) {
        case "LArm": {ESLVal $2543 = _v1793.termRef(0);
          ESLVal $2542 = _v1793.termRef(1);
          ESLVal $2541 = _v1793.termRef(2);
          ESLVal $2540 = _v1793.termRef(3);
          ESLVal $2539 = _v1793.termRef(4);
          
          {ESLVal l = $2543;
          
          {ESLVal ps = $2542;
          
          {ESLVal bs = $2541;
          
          {ESLVal g = $2540;
          
          {ESLVal e = $2539;
          
          return e;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7882,7961)").add(ESLVal.list(_v1793)));
      }
      }
    }
  });
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v1792 = arm;
        
        switch(_v1792.termName) {
        case "LArm": {ESLVal $2538 = _v1792.termRef(0);
          ESLVal $2537 = _v1792.termRef(1);
          ESLVal $2536 = _v1792.termRef(2);
          ESLVal $2535 = _v1792.termRef(3);
          ESLVal $2534 = _v1792.termRef(4);
          
          {ESLVal l = $2538;
          
          {ESLVal ps = $2537;
          
          {ESLVal bs = $2536;
          
          {ESLVal g = $2535;
          
          {ESLVal e = $2534;
          
          return g;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7991,8070)").add(ESLVal.list(_v1792)));
      }
      }
    }
  });
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal e = $args[1];
  {ESLVal _v1791 = arm;
        
        switch(_v1791.termName) {
        case "LArm": {ESLVal $2533 = _v1791.termRef(0);
          ESLVal $2532 = _v1791.termRef(1);
          ESLVal $2531 = _v1791.termRef(2);
          ESLVal $2530 = _v1791.termRef(3);
          ESLVal $2529 = _v1791.termRef(4);
          
          {ESLVal l = $2533;
          
          {ESLVal ps = $2532;
          
          {ESLVal bs = $2531;
          
          {ESLVal g = $2530;
          
          {ESLVal old = $2529;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8109,8206)").add(ESLVal.list(_v1791)));
      }
      }
    }
  });
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal ps = $args[1];
  {ESLVal _v1790 = arm;
        
        switch(_v1790.termName) {
        case "LArm": {ESLVal $2528 = _v1790.termRef(0);
          ESLVal $2527 = _v1790.termRef(1);
          ESLVal $2526 = _v1790.termRef(2);
          ESLVal $2525 = _v1790.termRef(3);
          ESLVal $2524 = _v1790.termRef(4);
          
          {ESLVal l = $2528;
          
          {ESLVal old = $2527;
          
          {ESLVal bs = $2526;
          
          {ESLVal g = $2525;
          
          {ESLVal e = $2524;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8256,8353)").add(ESLVal.list(_v1790)));
      }
      }
    }
  });
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal newBS = $args[1];
  {ESLVal _v1789 = arm;
        
        switch(_v1789.termName) {
        case "LArm": {ESLVal $2523 = _v1789.termRef(0);
          ESLVal $2522 = _v1789.termRef(1);
          ESLVal $2521 = _v1789.termRef(2);
          ESLVal $2520 = _v1789.termRef(3);
          ESLVal $2519 = _v1789.termRef(4);
          
          {ESLVal l = $2523;
          
          {ESLVal ps = $2522;
          
          {ESLVal bs = $2521;
          
          {ESLVal g = $2520;
          
          {ESLVal e = $2519;
          
          return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8404,8509)").add(ESLVal.list(_v1789)));
      }
      }
    }
  });
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1788 = p;
        
        switch(_v1788.termName) {
        case "PVar": {ESLVal $2518 = _v1788.termRef(0);
          ESLVal $2517 = _v1788.termRef(1);
          ESLVal $2516 = _v1788.termRef(2);
          
          {ESLVal l = $2518;
          
          {ESLVal n = $2517;
          
          {ESLVal t = $2516;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v1831 = _v1788;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1787 = p;
        
        switch(_v1787.termName) {
        case "PInt": {ESLVal $2515 = _v1787.termRef(0);
          ESLVal $2514 = _v1787.termRef(1);
          
          {ESLVal l = $2515;
          
          {ESLVal n = $2514;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v1830 = _v1787;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1786 = p;
        
        switch(_v1786.termName) {
        case "PStr": {ESLVal $2513 = _v1786.termRef(0);
          ESLVal $2512 = _v1786.termRef(1);
          
          {ESLVal l = $2513;
          
          {ESLVal n = $2512;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v1829 = _v1786;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1785 = p;
        
        switch(_v1785.termName) {
        case "PBool": {ESLVal $2511 = _v1785.termRef(0);
          ESLVal $2510 = _v1785.termRef(1);
          
          {ESLVal l = $2511;
          
          {ESLVal b = $2510;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v1828 = _v1785;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1784 = p;
        
        switch(_v1784.termName) {
        case "PTerm": {ESLVal $2509 = _v1784.termRef(0);
          ESLVal $2508 = _v1784.termRef(1);
          ESLVal $2507 = _v1784.termRef(2);
          ESLVal $2506 = _v1784.termRef(3);
          
          {ESLVal l = $2509;
          
          {ESLVal n = $2508;
          
          {ESLVal ts = $2507;
          
          {ESLVal ps = $2506;
          
          return $true;
        }
        }
        }
        }
        }
        default: {ESLVal _v1827 = _v1784;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1783 = p;
        
        switch(_v1783.termName) {
        case "PCons": {ESLVal $2505 = _v1783.termRef(0);
          ESLVal $2504 = _v1783.termRef(1);
          ESLVal $2503 = _v1783.termRef(2);
          
          {ESLVal l = $2505;
          
          {ESLVal h = $2504;
          
          {ESLVal t = $2503;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v1826 = _v1783;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1782 = p;
        
        switch(_v1782.termName) {
        case "PNil": {ESLVal $2502 = _v1782.termRef(0);
          
          {ESLVal l = $2502;
          
          return $true;
        }
        }
      case "PApplyType": {ESLVal $2500 = _v1782.termRef(0);
          ESLVal $2499 = _v1782.termRef(1);
          ESLVal $2498 = _v1782.termRef(2);
          
          switch($2499.termName) {
          case "PNil": {ESLVal $2501 = $2499.termRef(0);
            
            {ESLVal l1 = $2500;
            
            {ESLVal l2 = $2501;
            
            {ESLVal ts = $2498;
            
            return $true;
          }
          }
          }
          }
          default: {ESLVal _v1824 = _v1782;
            
            return $false;
          }
        }
        }
        default: {ESLVal _v1825 = _v1782;
          
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
  private static ESLVal pTermName = new ESLVal(new Function(new ESLVal("pTermName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1781 = p;
        
        switch(_v1781.termName) {
        case "PTerm": {ESLVal $2497 = _v1781.termRef(0);
          ESLVal $2496 = _v1781.termRef(1);
          ESLVal $2495 = _v1781.termRef(2);
          ESLVal $2494 = _v1781.termRef(3);
          
          {ESLVal l = $2497;
          
          {ESLVal n = $2496;
          
          {ESLVal ts = $2495;
          
          {ESLVal ps = $2494;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9417,9485)").add(ESLVal.list(_v1781)));
      }
      }
    }
  });
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1780 = p;
        
        switch(_v1780.termName) {
        case "PTerm": {ESLVal $2493 = _v1780.termRef(0);
          ESLVal $2492 = _v1780.termRef(1);
          ESLVal $2491 = _v1780.termRef(2);
          ESLVal $2490 = _v1780.termRef(3);
          
          {ESLVal l = $2493;
          
          {ESLVal n = $2492;
          
          {ESLVal ts = $2491;
          
          {ESLVal ps = $2490;
          
          return ps;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9525,9594)").add(ESLVal.list(_v1780)));
      }
      }
    }
  });
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1779 = p;
        
        switch(_v1779.termName) {
        case "PVar": {ESLVal $2489 = _v1779.termRef(0);
          ESLVal $2488 = _v1779.termRef(1);
          ESLVal $2487 = _v1779.termRef(2);
          
          {ESLVal l = $2489;
          
          {ESLVal n = $2488;
          
          {ESLVal t = $2487;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9627,9677)").add(ESLVal.list(_v1779)));
      }
      }
    }
  });
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1778 = p;
        
        switch(_v1778.termName) {
        case "PCons": {ESLVal $2486 = _v1778.termRef(0);
          ESLVal $2485 = _v1778.termRef(1);
          ESLVal $2484 = _v1778.termRef(2);
          
          {ESLVal l = $2486;
          
          {ESLVal h = $2485;
          
          {ESLVal t = $2484;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9715,9773)").add(ESLVal.list(_v1778)));
      }
      }
    }
  });
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1777 = p;
        
        switch(_v1777.termName) {
        case "PCons": {ESLVal $2483 = _v1777.termRef(0);
          ESLVal $2482 = _v1777.termRef(1);
          ESLVal $2481 = _v1777.termRef(2);
          
          {ESLVal l = $2483;
          
          {ESLVal h = $2482;
          
          {ESLVal t = $2481;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9811,9869)").add(ESLVal.list(_v1777)));
      }
      }
    }
  });
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1776 = p;
        
        switch(_v1776.termName) {
        case "PInt": {ESLVal $2480 = _v1776.termRef(0);
          ESLVal $2479 = _v1776.termRef(1);
          
          {ESLVal l = $2480;
          
          {ESLVal n = $2479;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9903,9945)").add(ESLVal.list(_v1776)));
      }
      }
    }
  });
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1775 = p;
        
        switch(_v1775.termName) {
        case "PStr": {ESLVal $2478 = _v1775.termRef(0);
          ESLVal $2477 = _v1775.termRef(1);
          
          {ESLVal l = $2478;
          
          {ESLVal n = $2477;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9979,10021)").add(ESLVal.list(_v1775)));
      }
      }
    }
  });
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1774 = p;
        
        switch(_v1774.termName) {
        case "PBool": {ESLVal $2476 = _v1774.termRef(0);
          ESLVal $2475 = _v1774.termRef(1);
          
          {ESLVal l = $2476;
          
          {ESLVal b = $2475;
          
          return b;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10057,10102)").add(ESLVal.list(_v1774)));
      }
      }
    }
  });
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1096"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1097"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1098"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1099"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1100"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun1101"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
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
  return map.apply(new ESLVal(new Function(new ESLVal("fun1102"),getSelf()) {
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
  return new ESLVal(new Function(new ESLVal("fun1103"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal arms = $args[0];
        LetRec letrec = new LetRec() {
              ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1819 = $args[0];
                ESLVal _v1818 = $args[1];
                {ESLVal _v1772 = _v1819;
                      ESLVal _v1771 = _v1818;
                      
                      if(_v1772.isCons())
                      {ESLVal $2467 = _v1772.head();
                        ESLVal $2468 = _v1772.tail();
                        
                        if(_v1771.isCons())
                        {ESLVal $2469 = _v1771.head();
                          ESLVal $2470 = _v1771.tail();
                          
                          {ESLVal a = $2467;
                          
                          {ESLVal _v1820 = $2468;
                          
                          {ESLVal v = $2469;
                          
                          {ESLVal _v1821 = $2470;
                          
                          {ESLVal _v1773 = e;
                          
                          switch(_v1773.termName) {
                          case "Var": {ESLVal $2474 = _v1773.termRef(0);
                            ESLVal $2473 = _v1773.termRef(1);
                            
                            {ESLVal l = $2474;
                            
                            {ESLVal n = $2473;
                            
                            if(n.eql(v).boolVal)
                            return bind.apply(_v1820,_v1821).cons(a);
                            else
                              {ESLVal _v1822 = _v1773;
                                
                                return bind.apply(_v1820,_v1821).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v1822))));
                              }
                          }
                          }
                          }
                          default: {ESLVal _v1823 = _v1773;
                            
                            return bind.apply(_v1820,_v1821).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v1823))));
                          }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else if(_v1771.isNil())
                        return error(new ESLVal("case error at Pos(11667,11977)").add(ESLVal.list(_v1772,_v1771)));
                      else return error(new ESLVal("case error at Pos(11667,11977)").add(ESLVal.list(_v1772,_v1771)));
                      }
                    else if(_v1772.isNil())
                      if(_v1771.isCons())
                        {ESLVal $2471 = _v1771.head();
                          ESLVal $2472 = _v1771.tail();
                          
                          return error(new ESLVal("case error at Pos(11667,11977)").add(ESLVal.list(_v1772,_v1771)));
                        }
                      else if(_v1771.isNil())
                        return $nil;
                      else return error(new ESLVal("case error at Pos(11667,11977)").add(ESLVal.list(_v1772,_v1771)));
                    else return error(new ESLVal("case error at Pos(11667,11977)").add(ESLVal.list(_v1772,_v1771)));
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1104"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1105"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1106"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun1107"),getSelf()) {
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
        {ESLVal _v1770 = $qualArg;
              
              {ESLVal n = _v1770;
              
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
        {ESLVal _v1768 = $qualArg;
              
              {ESLVal n = _v1768;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",loc0,n)));
            }
            }
          }
        }).map(names).flatten().flatten().add(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1769 = $qualArg;
              
              {ESLVal a = _v1769;
              
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1108"),getSelf()) {
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
  {ESLVal _v1767 = armss;
        
        if(_v1767.isCons())
        {ESLVal $2465 = _v1767.head();
          ESLVal $2466 = _v1767.tail();
          
          {ESLVal as = $2465;
          
          {ESLVal _v1817 = $2466;
          
          return createTArms.apply(l,_v1817,es,alt).cons(new ESLVal("TArm",sharedCnstr.apply(as),cnstrArm.apply(l,head.apply(es),tail.apply(es),as,alt)));
        }
        }
        }
      else if(_v1767.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(13999,14179)").add(ESLVal.list(_v1767)));
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
        {ESLVal _v1766 = $qualArg;
              
              {ESLVal a = _v1766;
              
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
  {ESLVal consArms = filter.apply(new ESLVal(new Function(new ESLVal("fun1109"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms);
        ESLVal nilArms = map.apply(dropPattern,filter.apply(new ESLVal(new Function(new ESLVal("fun1110"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPNil.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms));
        
        return new ESLVal("CaseList",l,head.apply(es),processConsArms.apply(l,es,consArms,alt),compileCase.apply(l,tail.apply(es),nilArms,alt),alt);
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1111"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return intArms.apply(c,arms);
            }
          }),ints);
        
        return new ESLVal("CaseInt",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1764 = $qualArg;
              
              {ESLVal as = _v1764;
              
              return ESLVal.list(ESLVal.list(new ESLVal("IArm",sharedInt.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1816 = $args[0];
              {ESLVal _v1765 = _v1816;
                    
                    {ESLVal a = _v1765;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1112"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return strArms.apply(c,arms);
            }
          }),strs);
        
        return new ESLVal("CaseStr",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1762 = $qualArg;
              
              {ESLVal as = _v1762;
              
              return ESLVal.list(ESLVal.list(new ESLVal("SArm",sharedStr.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1815 = $args[0];
              {ESLVal _v1763 = _v1815;
                    
                    {ESLVal a = _v1763;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun1113"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return boolArms.apply(c,arms);
            }
          }),bools);
        
        return new ESLVal("CaseBool",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1760 = $qualArg;
              
              {ESLVal as = _v1760;
              
              return ESLVal.list(ESLVal.list(new ESLVal("BoolArm",sharedBool.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1814 = $args[0];
              {ESLVal _v1761 = _v1814;
                    
                    {ESLVal a = _v1761;
                    
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
  private static ESLVal splitTerms = new ESLVal(new Function(new ESLVal("splitTerms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  ESLVal alt = $args[3];
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1114"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1115"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1116"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1117"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1118"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1119"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1120"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1121"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1122"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1123"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun1124"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun1125"),getSelf()) {
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
        
        {ESLVal nonVarPatterns = filter.apply(new ESLVal(new Function(new ESLVal("fun1126"),getSelf()) {
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
                                      return splitCase.apply(l,es,arms,alt);
    }
  });
  private static ESLVal foldArms = new ESLVal(new Function(new ESLVal("foldArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal arms = $args[1];
  ESLVal alt = $args[2];
  {ESLVal _v1759 = arms;
        
        if(_v1759.isCons())
        {ESLVal $2456 = _v1759.head();
          ESLVal $2457 = _v1759.tail();
          
          switch($2456.termName) {
          case "LArm": {ESLVal $2462 = $2456.termRef(0);
            ESLVal $2461 = $2456.termRef(1);
            ESLVal $2460 = $2456.termRef(2);
            ESLVal $2459 = $2456.termRef(3);
            ESLVal $2458 = $2456.termRef(4);
            
            if($2461.isCons())
            {ESLVal $2463 = $2461.head();
              ESLVal $2464 = $2461.tail();
              
              return error(new ESLVal("case error at Pos(19517,19673)").add(ESLVal.list(_v1759)));
            }
          else if($2461.isNil())
            {ESLVal al = $2462;
              
              {ESLVal bs = $2460;
              
              {ESLVal g = $2459;
              
              {ESLVal e = $2458;
              
              {ESLVal _v1813 = $2457;
              
              return foldArm.apply(al,bs,g,e,foldArms.apply(l,_v1813,alt));
            }
            }
            }
            }
            }
          else return error(new ESLVal("case error at Pos(19517,19673)").add(ESLVal.list(_v1759)));
          }
          default: return error(new ESLVal("case error at Pos(19517,19673)").add(ESLVal.list(_v1759)));
        }
        }
      else if(_v1759.isNil())
        return alt;
      else return error(new ESLVal("case error at Pos(19517,19673)").add(ESLVal.list(_v1759)));
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
  {ESLVal _v1757 = bss;
        
        if(_v1757.isCons())
        {ESLVal $2452 = _v1757.head();
          ESLVal $2453 = _v1757.tail();
          
          {ESLVal bs = $2452;
          
          {ESLVal _v1810 = $2453;
          
          return new ESLVal("Let",l,bs,foldArm.apply(l,_v1810,g,e,alt));
        }
        }
        }
      else if(_v1757.isNil())
        {ESLVal _v1758 = g;
          
          switch(_v1758.termName) {
          case "BoolExp": {ESLVal $2455 = _v1758.termRef(0);
            ESLVal $2454 = _v1758.termRef(1);
            
            switch($2454.boolVal ? 1 : 0) {
            case 1: {ESLVal bl = $2455;
              
              return e;
            }
            default: {ESLVal _v1811 = _v1758;
              
              return new ESLVal("If",l,_v1811,e,alt);
            }
          }
          }
          default: {ESLVal _v1812 = _v1758;
            
            return new ESLVal("If",l,_v1812,e,alt);
          }
        }
        }
      else return error(new ESLVal("case error at Pos(19738,19938)").add(ESLVal.list(_v1757)));
      }
    }
  });
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v1756 = q;
        
        switch(_v1756.termName) {
        case "BQual": {ESLVal $2451 = _v1756.termRef(0);
          ESLVal $2450 = _v1756.termRef(1);
          ESLVal $2449 = _v1756.termRef(2);
          
          {ESLVal l = $2451;
          
          {ESLVal p = $2450;
          
          {ESLVal e = $2449;
          
          return new ESLVal("BQual",l,p,translateCases.apply(e));
        }
        }
        }
        }
      case "PQual": {ESLVal $2448 = _v1756.termRef(0);
          ESLVal $2447 = _v1756.termRef(1);
          
          {ESLVal l = $2448;
          
          {ESLVal p = $2447;
          
          return new ESLVal("PQual",l,translateCases.apply(p));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19990,20127)").add(ESLVal.list(_v1756)));
      }
      }
    }
  });
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v1755 = a;
        
        switch(_v1755.termName) {
        case "LArm": {ESLVal $2446 = _v1755.termRef(0);
          ESLVal $2445 = _v1755.termRef(1);
          ESLVal $2444 = _v1755.termRef(2);
          ESLVal $2443 = _v1755.termRef(3);
          ESLVal $2442 = _v1755.termRef(4);
          
          {ESLVal l = $2446;
          
          {ESLVal ps = $2445;
          
          {ESLVal bs = $2444;
          
          {ESLVal guard = $2443;
          
          {ESLVal e = $2442;
          
          return new ESLVal("LArm",l,ps,bs,translateCases.apply(guard),translateCases.apply(e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(20166,20299)").add(ESLVal.list(_v1755)));
      }
      }
    }
  });
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1754 = b;
        
        switch(_v1754.termName) {
        case "Binding": {ESLVal $2441 = _v1754.termRef(0);
          ESLVal $2440 = _v1754.termRef(1);
          ESLVal $2439 = _v1754.termRef(2);
          ESLVal $2438 = _v1754.termRef(3);
          ESLVal $2437 = _v1754.termRef(4);
          
          {ESLVal l = $2441;
          
          {ESLVal name = $2440;
          
          {ESLVal t = $2439;
          
          {ESLVal st = $2438;
          
          {ESLVal value = $2437;
          
          return new ESLVal("Binding",l,name,t,st,translateCases.apply(value));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $2436 = _v1754.termRef(0);
          ESLVal $2435 = _v1754.termRef(1);
          ESLVal $2434 = _v1754.termRef(2);
          ESLVal $2433 = _v1754.termRef(3);
          
          {ESLVal l = $2436;
          
          {ESLVal name = $2435;
          
          {ESLVal t = $2434;
          
          {ESLVal ignore = $2433;
          
          return b;
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $2432 = _v1754.termRef(0);
          ESLVal $2431 = _v1754.termRef(1);
          ESLVal $2430 = _v1754.termRef(2);
          ESLVal $2429 = _v1754.termRef(3);
          
          {ESLVal l = $2432;
          
          {ESLVal name = $2431;
          
          {ESLVal t = $2430;
          
          {ESLVal ignore = $2429;
          
          return b;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $2428 = _v1754.termRef(0);
          ESLVal $2427 = _v1754.termRef(1);
          ESLVal $2426 = _v1754.termRef(2);
          ESLVal $2425 = _v1754.termRef(3);
          ESLVal $2424 = _v1754.termRef(4);
          ESLVal $2423 = _v1754.termRef(5);
          ESLVal $2422 = _v1754.termRef(6);
          
          {ESLVal l = $2428;
          
          {ESLVal n = $2427;
          
          {ESLVal args = $2426;
          
          {ESLVal t = $2425;
          
          {ESLVal st = $2424;
          
          {ESLVal body = $2423;
          
          {ESLVal guard = $2422;
          
          return new ESLVal("FunBind",l,n,args,t,st,translateCases.apply(body),translateCases.apply(guard));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $2421 = _v1754.termRef(0);
          ESLVal $2420 = _v1754.termRef(1);
          ESLVal $2419 = _v1754.termRef(2);
          ESLVal $2418 = _v1754.termRef(3);
          
          {ESLVal l = $2421;
          
          {ESLVal name = $2420;
          
          {ESLVal t = $2419;
          
          {ESLVal ignore = $2418;
          
          return b;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v1754;
          
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1753 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1753)));
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
                  {ESLVal _v1752 = $x;
              
              {ESLVal x = _v1752;
              
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