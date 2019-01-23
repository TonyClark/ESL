package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.Warnings.*;
import static esl.Displays.*;
import static esl.compiler.FV.*;
public class UnusedVars {
  public static ESLVal getSelf() { return $null; }
  
public static ESLVal checkUnusedVars(ESLVal module) {
    
    return walkAST(module);
  }
  public static ESLVal checkUnusedVars = new ESLVal(new Function(new ESLVal("checkUnusedVars"),null) { public ESLVal apply(ESLVal... args) { return checkUnusedVars(args[0]); }});
  private static ESLVal walkArm(ESLVal x) {
    
    {ESLVal _v1660 = x;
      
      switch(_v1660.termName) {
      case "BArm": {ESLVal $2619 = _v1660.termRef(0);
        ESLVal $2618 = _v1660.termRef(1);
        ESLVal $2617 = _v1660.termRef(2);
        ESLVal $2616 = _v1660.termRef(3);
        
        {ESLVal v0 = $2619;
        
        {ESLVal v1 = $2618;
        
        {ESLVal v2 = $2617;
        
        {ESLVal v3 = $2616;
        
        {{
        ESLVal _v1661 = v1;
        while(_v1661.isCons()) {
          ESLVal p = _v1661.headVal;
          walkPattern(p);
          _v1661 = _v1661.tailVal;}
      }
      walkAST(v2);
      return walkAST(v3);}
      }
      }
      }
      }
      }
    case "LArm": {ESLVal $2615 = _v1660.termRef(0);
        ESLVal $2614 = _v1660.termRef(1);
        ESLVal $2613 = _v1660.termRef(2);
        ESLVal $2612 = _v1660.termRef(3);
        ESLVal $2611 = _v1660.termRef(4);
        
        {ESLVal v0 = $2615;
        
        {ESLVal v1 = $2614;
        
        {ESLVal v2 = $2613;
        
        {ESLVal v3 = $2612;
        
        {ESLVal v4 = $2611;
        
        return $null;
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1426,1640)").add(ESLVal.list(_v1660)));
    }
    }
  }
  private static ESLVal walkArm = new ESLVal(new Function(new ESLVal("walkArm"),null) { public ESLVal apply(ESLVal... args) { return walkArm(args[0]); }});
  private static ESLVal walkPattern(ESLVal x) {
    
    {ESLVal _v1662 = x;
      
      switch(_v1662.termName) {
      case "PAdd": {ESLVal $2651 = _v1662.termRef(0);
        ESLVal $2650 = _v1662.termRef(1);
        ESLVal $2649 = _v1662.termRef(2);
        
        {ESLVal v0 = $2651;
        
        {ESLVal v1 = $2650;
        
        {ESLVal v2 = $2649;
        
        {walkPattern(v1);
      return walkPattern(v2);}
      }
      }
      }
      }
    case "PApplyType": {ESLVal $2648 = _v1662.termRef(0);
        ESLVal $2647 = _v1662.termRef(1);
        ESLVal $2646 = _v1662.termRef(2);
        
        {ESLVal v0 = $2648;
        
        {ESLVal v1 = $2647;
        
        {ESLVal v2 = $2646;
        
        return walkPattern(v1);
      }
      }
      }
      }
    case "PBagCons": {ESLVal $2645 = _v1662.termRef(0);
        ESLVal $2644 = _v1662.termRef(1);
        ESLVal $2643 = _v1662.termRef(2);
        
        {ESLVal v0 = $2645;
        
        {ESLVal v1 = $2644;
        
        {ESLVal v2 = $2643;
        
        {walkPattern(v1);
      return walkPattern(v2);}
      }
      }
      }
      }
    case "PBool": {ESLVal $2642 = _v1662.termRef(0);
        ESLVal $2641 = _v1662.termRef(1);
        
        {ESLVal v0 = $2642;
        
        {ESLVal v1 = $2641;
        
        return $null;
      }
      }
      }
    case "PCons": {ESLVal $2640 = _v1662.termRef(0);
        ESLVal $2639 = _v1662.termRef(1);
        ESLVal $2638 = _v1662.termRef(2);
        
        {ESLVal v0 = $2640;
        
        {ESLVal v1 = $2639;
        
        {ESLVal v2 = $2638;
        
        {walkPattern(v1);
      return walkPattern(v2);}
      }
      }
      }
      }
    case "PEmptyBag": {ESLVal $2637 = _v1662.termRef(0);
        
        {ESLVal v0 = $2637;
        
        return $null;
      }
      }
    case "PEmptySet": {ESLVal $2636 = _v1662.termRef(0);
        
        {ESLVal v0 = $2636;
        
        return $null;
      }
      }
    case "PInt": {ESLVal $2635 = _v1662.termRef(0);
        ESLVal $2634 = _v1662.termRef(1);
        
        {ESLVal v0 = $2635;
        
        {ESLVal v1 = $2634;
        
        return $null;
      }
      }
      }
    case "PNil": {ESLVal $2633 = _v1662.termRef(0);
        
        {ESLVal v0 = $2633;
        
        return $null;
      }
      }
    case "PNull": {ESLVal $2632 = _v1662.termRef(0);
        
        {ESLVal v0 = $2632;
        
        return $null;
      }
      }
    case "PSetCons": {ESLVal $2631 = _v1662.termRef(0);
        ESLVal $2630 = _v1662.termRef(1);
        ESLVal $2629 = _v1662.termRef(2);
        
        {ESLVal v0 = $2631;
        
        {ESLVal v1 = $2630;
        
        {ESLVal v2 = $2629;
        
        {walkPattern(v1);
      return walkPattern(v2);}
      }
      }
      }
      }
    case "PStr": {ESLVal $2628 = _v1662.termRef(0);
        ESLVal $2627 = _v1662.termRef(1);
        
        {ESLVal v0 = $2628;
        
        {ESLVal v1 = $2627;
        
        return $null;
      }
      }
      }
    case "PTerm": {ESLVal $2626 = _v1662.termRef(0);
        ESLVal $2625 = _v1662.termRef(1);
        ESLVal $2624 = _v1662.termRef(2);
        ESLVal $2623 = _v1662.termRef(3);
        
        {ESLVal v0 = $2626;
        
        {ESLVal v1 = $2625;
        
        {ESLVal v2 = $2624;
        
        {ESLVal v3 = $2623;
        
        {{
        ESLVal _v1663 = v3;
        while(_v1663.isCons()) {
          ESLVal p = _v1663.headVal;
          walkPattern(p);
          _v1663 = _v1663.tailVal;}
      }
      return $null;}
      }
      }
      }
      }
      }
    case "PVar": {ESLVal $2622 = _v1662.termRef(0);
        ESLVal $2621 = _v1662.termRef(1);
        ESLVal $2620 = _v1662.termRef(2);
        
        {ESLVal v0 = $2622;
        
        {ESLVal v1 = $2621;
        
        {ESLVal v2 = $2620;
        
        return $null;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1684,2528)").add(ESLVal.list(_v1662)));
    }
    }
  }
  private static ESLVal walkPattern = new ESLVal(new Function(new ESLVal("walkPattern"),null) { public ESLVal apply(ESLVal... args) { return walkPattern(args[0]); }});
  private static ESLVal walkTDec(ESLVal d) {
    
    {ESLVal _v1664 = d;
      
      switch(_v1664.termName) {
      case "Dec": {ESLVal $2655 = _v1664.termRef(0);
        ESLVal $2654 = _v1664.termRef(1);
        ESLVal $2653 = _v1664.termRef(2);
        ESLVal $2652 = _v1664.termRef(3);
        
        {ESLVal v0 = $2655;
        
        {ESLVal v1 = $2654;
        
        {ESLVal v2 = $2653;
        
        {ESLVal v3 = $2652;
        
        return $null;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2560,2626)").add(ESLVal.list(_v1664)));
    }
    }
  }
  private static ESLVal walkTDec = new ESLVal(new Function(new ESLVal("walkTDec"),null) { public ESLVal apply(ESLVal... args) { return walkTDec(args[0]); }});
  private static ESLVal walkTBind(ESLVal b) {
    
    {ESLVal _v1665 = b;
      
      switch(_v1665.termName) {
      case "TypeBind": {ESLVal $2681 = _v1665.termRef(0);
        ESLVal $2680 = _v1665.termRef(1);
        ESLVal $2679 = _v1665.termRef(2);
        ESLVal $2678 = _v1665.termRef(3);
        
        {ESLVal v0 = $2681;
        
        {ESLVal v1 = $2680;
        
        {ESLVal v2 = $2679;
        
        {ESLVal v3 = $2678;
        
        return $null;
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $2677 = _v1665.termRef(0);
        ESLVal $2676 = _v1665.termRef(1);
        ESLVal $2675 = _v1665.termRef(2);
        ESLVal $2674 = _v1665.termRef(3);
        
        {ESLVal v0 = $2677;
        
        {ESLVal v1 = $2676;
        
        {ESLVal v2 = $2675;
        
        {ESLVal v3 = $2674;
        
        return $null;
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $2673 = _v1665.termRef(0);
        ESLVal $2672 = _v1665.termRef(1);
        ESLVal $2671 = _v1665.termRef(2);
        ESLVal $2670 = _v1665.termRef(3);
        ESLVal $2669 = _v1665.termRef(4);
        ESLVal $2668 = _v1665.termRef(5);
        ESLVal $2667 = _v1665.termRef(6);
        
        {ESLVal l = $2673;
        
        {ESLVal name = $2672;
        
        {ESLVal args = $2671;
        
        {ESLVal t = $2670;
        
        {ESLVal dt = $2669;
        
        {ESLVal body = $2668;
        
        {ESLVal guard = $2667;
        
        {{ESLVal usedNames = freeVars(body).add(freeVars(guard));
        
        {
        ESLVal _v1666 = args;
        while(_v1666.isCons()) {
          ESLVal arg = _v1666.headVal;
          {
            ESLVal _v1667 = patternNames(arg);
            while(_v1667.isCons()) {
              ESLVal n = _v1667.headVal;
              if(member.apply(n,usedNames).not().boolVal)
                addWarning(patternLoc(arg),n.add(new ESLVal(" is not used in the function body.")));
                else
                  {}
              _v1667 = _v1667.tailVal;}
          }
          _v1666 = _v1666.tailVal;}
      }
      }
      walkAST(body);
      return walkAST(guard);}
      }
      }
      }
      }
      }
      }
      }
      }
    case "FunBinds": {ESLVal $2666 = _v1665.termRef(0);
        ESLVal $2665 = _v1665.termRef(1);
        
        {ESLVal v0 = $2666;
        
        {ESLVal v1 = $2665;
        
        return $null;
      }
      }
      }
    case "Binding": {ESLVal $2664 = _v1665.termRef(0);
        ESLVal $2663 = _v1665.termRef(1);
        ESLVal $2662 = _v1665.termRef(2);
        ESLVal $2661 = _v1665.termRef(3);
        ESLVal $2660 = _v1665.termRef(4);
        
        {ESLVal v0 = $2664;
        
        {ESLVal v1 = $2663;
        
        {ESLVal v2 = $2662;
        
        {ESLVal v3 = $2661;
        
        {ESLVal v4 = $2660;
        
        return walkAST(v4);
      }
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $2659 = _v1665.termRef(0);
        ESLVal $2658 = _v1665.termRef(1);
        ESLVal $2657 = _v1665.termRef(2);
        ESLVal $2656 = _v1665.termRef(3);
        
        {ESLVal v0 = $2659;
        
        {ESLVal v1 = $2658;
        
        {ESLVal v2 = $2657;
        
        {ESLVal v3 = $2656;
        
        return $null;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2661,3429)").add(ESLVal.list(_v1665)));
    }
    }
  }
  private static ESLVal walkTBind = new ESLVal(new Function(new ESLVal("walkTBind"),null) { public ESLVal apply(ESLVal... args) { return walkTBind(args[0]); }});
  private static ESLVal walkQualifier(ESLVal x) {
    
    {ESLVal _v1668 = x;
      
      switch(_v1668.termName) {
      case "BQual": {ESLVal $2686 = _v1668.termRef(0);
        ESLVal $2685 = _v1668.termRef(1);
        ESLVal $2684 = _v1668.termRef(2);
        
        {ESLVal v0 = $2686;
        
        {ESLVal v1 = $2685;
        
        {ESLVal v2 = $2684;
        
        {walkPattern(v1);
      return walkAST(v2);}
      }
      }
      }
      }
    case "PQual": {ESLVal $2683 = _v1668.termRef(0);
        ESLVal $2682 = _v1668.termRef(1);
        
        {ESLVal v0 = $2683;
        
        {ESLVal v1 = $2682;
        
        return walkAST(v1);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3478,3639)").add(ESLVal.list(_v1668)));
    }
    }
  }
  private static ESLVal walkQualifier = new ESLVal(new Function(new ESLVal("walkQualifier"),null) { public ESLVal apply(ESLVal... args) { return walkQualifier(args[0]); }});
  private static ESLVal walkDRef(ESLVal x) {
    
    {ESLVal _v1669 = x;
      
      switch(_v1669.termName) {
      case "VarDynamicRef": {ESLVal $2691 = _v1669.termRef(0);
        ESLVal $2690 = _v1669.termRef(1);
        
        {ESLVal v0 = $2691;
        
        {ESLVal v1 = $2690;
        
        return walkAST(v1);
      }
      }
      }
    case "ActorDynamicRef": {ESLVal $2689 = _v1669.termRef(0);
        ESLVal $2688 = _v1669.termRef(1);
        ESLVal $2687 = _v1669.termRef(2);
        
        {ESLVal v0 = $2689;
        
        {ESLVal v1 = $2688;
        
        {ESLVal v2 = $2687;
        
        return walkAST(v1);
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3673,3797)").add(ESLVal.list(_v1669)));
    }
    }
  }
  private static ESLVal walkDRef = new ESLVal(new Function(new ESLVal("walkDRef"),null) { public ESLVal apply(ESLVal... args) { return walkDRef(args[0]); }});
  private static ESLVal walkAST(ESLVal x) {
    
    {ESLVal _v1670 = x;
      
      switch(_v1670.termName) {
      case "ActExp": {ESLVal $2844 = _v1670.termRef(0);
        ESLVal $2843 = _v1670.termRef(1);
        ESLVal $2842 = _v1670.termRef(2);
        ESLVal $2841 = _v1670.termRef(3);
        ESLVal $2840 = _v1670.termRef(4);
        ESLVal $2839 = _v1670.termRef(5);
        ESLVal $2838 = _v1670.termRef(6);
        ESLVal $2837 = _v1670.termRef(7);
        
        {ESLVal l = $2844;
        
        {ESLVal name = $2843;
        
        {ESLVal args = $2842;
        
        {ESLVal exports = $2841;
        
        {ESLVal parent = $2840;
        
        {ESLVal bindings = $2839;
        
        {ESLVal init = $2838;
        
        {ESLVal handlers = $2837;
        
        return $null;
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "Apply": {ESLVal $2836 = _v1670.termRef(0);
        ESLVal $2835 = _v1670.termRef(1);
        ESLVal $2834 = _v1670.termRef(2);
        
        {ESLVal v0 = $2836;
        
        {ESLVal v1 = $2835;
        
        {ESLVal v2 = $2834;
        
        {walkAST(v1);
      {{
        ESLVal _v1691 = v2;
        while(_v1691.isCons()) {
          ESLVal e = _v1691.headVal;
          walkAST(e);
          _v1691 = _v1691.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $2833 = _v1670.termRef(0);
        ESLVal $2832 = _v1670.termRef(1);
        ESLVal $2831 = _v1670.termRef(2);
        
        {ESLVal v0 = $2833;
        
        {ESLVal v1 = $2832;
        
        {ESLVal v2 = $2831;
        
        return walkAST(v1);
      }
      }
      }
      }
    case "ArrayRef": {ESLVal $2830 = _v1670.termRef(0);
        ESLVal $2829 = _v1670.termRef(1);
        ESLVal $2828 = _v1670.termRef(2);
        
        {ESLVal v0 = $2830;
        
        {ESLVal v1 = $2829;
        
        {ESLVal v2 = $2828;
        
        {walkAST(v1);
      return walkAST(v2);}
      }
      }
      }
      }
    case "ArrayUpdate": {ESLVal $2827 = _v1670.termRef(0);
        ESLVal $2826 = _v1670.termRef(1);
        ESLVal $2825 = _v1670.termRef(2);
        ESLVal $2824 = _v1670.termRef(3);
        
        {ESLVal v0 = $2827;
        
        {ESLVal v1 = $2826;
        
        {ESLVal v2 = $2825;
        
        {ESLVal v3 = $2824;
        
        {walkAST(v1);
      walkAST(v2);
      return walkAST(v3);}
      }
      }
      }
      }
      }
    case "BagExp": {ESLVal $2823 = _v1670.termRef(0);
        ESLVal $2822 = _v1670.termRef(1);
        
        {ESLVal v0 = $2823;
        
        {ESLVal v1 = $2822;
        
        {{
        ESLVal _v1690 = v1;
        while(_v1690.isCons()) {
          ESLVal e = _v1690.headVal;
          walkAST(e);
          _v1690 = _v1690.tailVal;}
      }
      return $null;}
      }
      }
      }
    case "Become": {ESLVal $2821 = _v1670.termRef(0);
        ESLVal $2820 = _v1670.termRef(1);
        
        {ESLVal v0 = $2821;
        
        {ESLVal v1 = $2820;
        
        return walkAST(v1);
      }
      }
      }
    case "BinExp": {ESLVal $2819 = _v1670.termRef(0);
        ESLVal $2818 = _v1670.termRef(1);
        ESLVal $2817 = _v1670.termRef(2);
        ESLVal $2816 = _v1670.termRef(3);
        
        {ESLVal v0 = $2819;
        
        {ESLVal v1 = $2818;
        
        {ESLVal v2 = $2817;
        
        {ESLVal v3 = $2816;
        
        {walkAST(v1);
      return walkAST(v3);}
      }
      }
      }
      }
      }
    case "Block": {ESLVal $2815 = _v1670.termRef(0);
        ESLVal $2814 = _v1670.termRef(1);
        
        {ESLVal v0 = $2815;
        
        {ESLVal v1 = $2814;
        
        {{
        ESLVal _v1689 = v1;
        while(_v1689.isCons()) {
          ESLVal e = _v1689.headVal;
          walkAST(e);
          _v1689 = _v1689.tailVal;}
      }
      return $null;}
      }
      }
      }
    case "BoolExp": {ESLVal $2813 = _v1670.termRef(0);
        ESLVal $2812 = _v1670.termRef(1);
        
        {ESLVal v0 = $2813;
        
        {ESLVal v1 = $2812;
        
        return $null;
      }
      }
      }
    case "Case": {ESLVal $2811 = _v1670.termRef(0);
        ESLVal $2810 = _v1670.termRef(1);
        ESLVal $2809 = _v1670.termRef(2);
        ESLVal $2808 = _v1670.termRef(3);
        
        {ESLVal v0 = $2811;
        
        {ESLVal v1 = $2810;
        
        {ESLVal v2 = $2809;
        
        {ESLVal v3 = $2808;
        
        {{
        ESLVal _v1686 = v1;
        while(_v1686.isCons()) {
          ESLVal d = _v1686.headVal;
          walkTDec(d);
          _v1686 = _v1686.tailVal;}
      }
      {
        ESLVal _v1687 = v2;
        while(_v1687.isCons()) {
          ESLVal e = _v1687.headVal;
          walkAST(e);
          _v1687 = _v1687.tailVal;}
      }
      {{
        ESLVal _v1688 = v3;
        while(_v1688.isCons()) {
          ESLVal a = _v1688.headVal;
          walkArm(a);
          _v1688 = _v1688.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
      }
    case "Cmp": {ESLVal $2807 = _v1670.termRef(0);
        ESLVal $2806 = _v1670.termRef(1);
        ESLVal $2805 = _v1670.termRef(2);
        
        {ESLVal v0 = $2807;
        
        {ESLVal v1 = $2806;
        
        {ESLVal v2 = $2805;
        
        {walkAST(v1);
      {{
        ESLVal _v1685 = v2;
        while(_v1685.isCons()) {
          ESLVal q = _v1685.headVal;
          walkQualifier(q);
          _v1685 = _v1685.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
    case "Cons": {ESLVal $2804 = _v1670.termRef(0);
        ESLVal $2803 = _v1670.termRef(1);
        
        {ESLVal v0 = $2804;
        
        {ESLVal v1 = $2803;
        
        {walkAST(v0);
      return walkAST(v1);}
      }
      }
      }
    case "For": {ESLVal $2802 = _v1670.termRef(0);
        ESLVal $2801 = _v1670.termRef(1);
        ESLVal $2800 = _v1670.termRef(2);
        ESLVal $2799 = _v1670.termRef(3);
        
        {ESLVal v0 = $2802;
        
        {ESLVal v1 = $2801;
        
        {ESLVal v2 = $2800;
        
        {ESLVal v3 = $2799;
        
        {walkPattern(v1);
      walkAST(v2);
      return walkAST(v3);}
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $2790 = _v1670.termRef(0);
        ESLVal $2789 = _v1670.termRef(1);
        ESLVal $2788 = _v1670.termRef(2);
        ESLVal $2787 = _v1670.termRef(3);
        ESLVal $2786 = _v1670.termRef(4);
        
        switch($2786.termName) {
        case "ActExp": {ESLVal $2798 = $2786.termRef(0);
          ESLVal $2797 = $2786.termRef(1);
          ESLVal $2796 = $2786.termRef(2);
          ESLVal $2795 = $2786.termRef(3);
          ESLVal $2794 = $2786.termRef(4);
          ESLVal $2793 = $2786.termRef(5);
          ESLVal $2792 = $2786.termRef(6);
          ESLVal $2791 = $2786.termRef(7);
          
          {ESLVal fl = $2790;
          
          {ESLVal fname = $2789;
          
          {ESLVal fargs = $2788;
          
          {ESLVal t = $2787;
          
          {ESLVal l = $2798;
          
          {ESLVal name = $2797;
          
          {ESLVal args = $2796;
          
          {ESLVal exports = $2795;
          
          {ESLVal parent = $2794;
          
          {ESLVal bindings = $2793;
          
          {ESLVal init = $2792;
          
          {ESLVal handlers = $2791;
          
          if(parent.eql($null).boolVal)
          return walkAST(new ESLVal("FunExp",l,name,args,t,new ESLVal("Letrec",l,bindings,new ESLVal("Case",l,$nil,new SerializableFunction<ESLVal,ESLVal>() {
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
              }}.apply(exports).add(ESLVal.list(init)),handlers))));
          else
            {ESLVal _v1692 = $2790;
              
              {ESLVal _v1693 = $2789;
              
              {ESLVal _v1694 = $2788;
              
              {ESLVal _v1695 = $2787;
              
              {ESLVal _v1696 = $2798;
              
              {ESLVal _v1697 = $2797;
              
              {ESLVal _v1698 = $2796;
              
              {ESLVal _v1699 = $2795;
              
              {ESLVal _v1700 = $2794;
              
              {ESLVal _v1701 = $2793;
              
              {ESLVal _v1702 = $2792;
              
              {ESLVal _v1703 = $2791;
              
              return walkAST(new ESLVal("FunExp",_v1696,_v1697,_v1698,_v1695,new ESLVal("Letrec",_v1696,_v1701,new ESLVal("Case",_v1696,$nil,new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(new ESLVal("Var",_v1696,n));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(_v1699).add(ESLVal.list(_v1700,_v1702)),_v1703))));
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
        default: {ESLVal l = $2790;
          
          {ESLVal name = $2789;
          
          {ESLVal args = $2788;
          
          {ESLVal t = $2787;
          
          {ESLVal body = $2786;
          
          {ESLVal usedNames = freeVars(body);
          
          {{
          ESLVal _v1684 = args;
          while(_v1684.isCons()) {
            ESLVal d = _v1684.headVal;
            {if(member.apply(decName(d),usedNames).not().boolVal)
              addWarning(decLoc(d),decName(d).add(new ESLVal(" is not used in the function body.")));
              else
                {}
            walkTDec(d);}
            _v1684 = _v1684.tailVal;}
        }
        walkAST(name);
        return walkAST(body);}
        }
        }
        }
        }
        }
        }
      }
      }
    case "Grab": {ESLVal $2785 = _v1670.termRef(0);
        ESLVal $2784 = _v1670.termRef(1);
        ESLVal $2783 = _v1670.termRef(2);
        
        {ESLVal v0 = $2785;
        
        {ESLVal v1 = $2784;
        
        {ESLVal v2 = $2783;
        
        {{
        ESLVal _v1683 = v1;
        while(_v1683.isCons()) {
          ESLVal d = _v1683.headVal;
          walkDRef(d);
          _v1683 = _v1683.tailVal;}
      }
      return walkAST(v2);}
      }
      }
      }
      }
    case "If": {ESLVal $2782 = _v1670.termRef(0);
        ESLVal $2781 = _v1670.termRef(1);
        ESLVal $2780 = _v1670.termRef(2);
        ESLVal $2779 = _v1670.termRef(3);
        
        {ESLVal v0 = $2782;
        
        {ESLVal v1 = $2781;
        
        {ESLVal v2 = $2780;
        
        {ESLVal v3 = $2779;
        
        {walkAST(v1);
      walkAST(v2);
      return walkAST(v3);}
      }
      }
      }
      }
      }
    case "IntExp": {ESLVal $2778 = _v1670.termRef(0);
        ESLVal $2777 = _v1670.termRef(1);
        
        {ESLVal v0 = $2778;
        
        {ESLVal v1 = $2777;
        
        return $null;
      }
      }
      }
    case "FloatExp": {ESLVal $2776 = _v1670.termRef(0);
        ESLVal $2775 = _v1670.termRef(1);
        
        {ESLVal v0 = $2776;
        
        {ESLVal v1 = $2775;
        
        return $null;
      }
      }
      }
    case "Fold": {ESLVal $2774 = _v1670.termRef(0);
        ESLVal $2773 = _v1670.termRef(1);
        ESLVal $2772 = _v1670.termRef(2);
        
        {ESLVal v0 = $2774;
        
        {ESLVal v1 = $2773;
        
        {ESLVal v2 = $2772;
        
        return walkAST(v2);
      }
      }
      }
      }
    case "Head": {ESLVal $2771 = _v1670.termRef(0);
        
        {ESLVal v0 = $2771;
        
        return walkAST(v0);
      }
      }
    case "Let": {ESLVal $2770 = _v1670.termRef(0);
        ESLVal $2769 = _v1670.termRef(1);
        ESLVal $2768 = _v1670.termRef(2);
        
        {ESLVal l = $2770;
        
        {ESLVal bindings = $2769;
        
        {ESLVal body = $2768;
        
        {ESLVal usedNames = freeVars(body);
        
        {{
        ESLVal _v1682 = bindings;
        while(_v1682.isCons()) {
          ESLVal b = _v1682.headVal;
          {if(member.apply(bindingName(b),usedNames).not().boolVal)
            addWarning(bindingLoc(b),bindingName(b).add(new ESLVal(" is not used in the let body.")));
            else
              {}
          walkTBind(b);}
          _v1682 = _v1682.tailVal;}
      }
      return walkAST(body);}
      }
      }
      }
      }
      }
    case "Letrec": {ESLVal $2767 = _v1670.termRef(0);
        ESLVal $2766 = _v1670.termRef(1);
        ESLVal $2765 = _v1670.termRef(2);
        
        {ESLVal l = $2767;
        
        {ESLVal bindings = $2766;
        
        {ESLVal body = $2765;
        
        {ESLVal usedNames = freeVars(body).add(new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = bindingFV(b);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bindings));
        
        {{
        ESLVal _v1681 = bindings;
        while(_v1681.isCons()) {
          ESLVal b = _v1681.headVal;
          {if(member.apply(bindingName(b),usedNames).not().boolVal)
            addWarning(bindingLoc(b),bindingName(b).add(new ESLVal(" is not used in the letrec body.")));
            else
              {}
          walkTBind(b);}
          _v1681 = _v1681.tailVal;}
      }
      return walkAST(body);}
      }
      }
      }
      }
      }
    case "List": {ESLVal $2764 = _v1670.termRef(0);
        ESLVal $2763 = _v1670.termRef(1);
        
        {ESLVal v0 = $2764;
        
        {ESLVal v1 = $2763;
        
        {{
        ESLVal _v1680 = v1;
        while(_v1680.isCons()) {
          ESLVal e = _v1680.headVal;
          walkAST(e);
          _v1680 = _v1680.tailVal;}
      }
      return $null;}
      }
      }
      }
    case "Module": {ESLVal $2762 = _v1670.termRef(0);
        ESLVal $2761 = _v1670.termRef(1);
        ESLVal $2760 = _v1670.termRef(2);
        ESLVal $2759 = _v1670.termRef(3);
        ESLVal $2758 = _v1670.termRef(4);
        ESLVal $2757 = _v1670.termRef(5);
        ESLVal $2756 = _v1670.termRef(6);
        
        {ESLVal path = $2762;
        
        {ESLVal name = $2761;
        
        {ESLVal exports = $2760;
        
        {ESLVal imports = $2759;
        
        {ESLVal v4 = $2758;
        
        {ESLVal v5 = $2757;
        
        {ESLVal defs = $2756;
        
        {ESLVal usedNames = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = bindingFV(b);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(defs).add(exports);
        
        {{
        ESLVal _v1678 = defs;
        while(_v1678.isCons()) {
          ESLVal b = _v1678.headVal;
          if(isBinding(b).or(isFunBind(b)).boolVal)
            if(member.apply(bindingName(b),usedNames).not().boolVal)
              addWarning(bindingLoc(b),bindingName(b).add(new ESLVal(" is not used or exported.")));
              else
                {}
            else
              {}
          _v1678 = _v1678.tailVal;}
      }
      {{
        ESLVal _v1679 = defs;
        while(_v1679.isCons()) {
          ESLVal b = _v1679.headVal;
          walkTBind(b);
          _v1679 = _v1679.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "New": {ESLVal $2755 = _v1670.termRef(0);
        ESLVal $2754 = _v1670.termRef(1);
        ESLVal $2753 = _v1670.termRef(2);
        
        {ESLVal v0 = $2755;
        
        {ESLVal v1 = $2754;
        
        {ESLVal v2 = $2753;
        
        {walkAST(v1);
      {{
        ESLVal _v1677 = v2;
        while(_v1677.isCons()) {
          ESLVal e = _v1677.headVal;
          walkAST(e);
          _v1677 = _v1677.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
    case "NewArray": {ESLVal $2752 = _v1670.termRef(0);
        ESLVal $2751 = _v1670.termRef(1);
        ESLVal $2750 = _v1670.termRef(2);
        
        {ESLVal v0 = $2752;
        
        {ESLVal v1 = $2751;
        
        {ESLVal v2 = $2750;
        
        return walkAST(v2);
      }
      }
      }
      }
    case "NewJava": {ESLVal $2749 = _v1670.termRef(0);
        ESLVal $2748 = _v1670.termRef(1);
        ESLVal $2747 = _v1670.termRef(2);
        ESLVal $2746 = _v1670.termRef(3);
        
        {ESLVal v0 = $2749;
        
        {ESLVal v1 = $2748;
        
        {ESLVal v2 = $2747;
        
        {ESLVal v3 = $2746;
        
        {{
        ESLVal _v1676 = v3;
        while(_v1676.isCons()) {
          ESLVal e = _v1676.headVal;
          walkAST(e);
          _v1676 = _v1676.tailVal;}
      }
      return $null;}
      }
      }
      }
      }
      }
    case "NewTable": {ESLVal $2745 = _v1670.termRef(0);
        ESLVal $2744 = _v1670.termRef(1);
        ESLVal $2743 = _v1670.termRef(2);
        
        {ESLVal v0 = $2745;
        
        {ESLVal v1 = $2744;
        
        {ESLVal v2 = $2743;
        
        return $null;
      }
      }
      }
      }
    case "Not": {ESLVal $2742 = _v1670.termRef(0);
        ESLVal $2741 = _v1670.termRef(1);
        
        {ESLVal v0 = $2742;
        
        {ESLVal v1 = $2741;
        
        return walkAST(v1);
      }
      }
      }
    case "Now": {ESLVal $2740 = _v1670.termRef(0);
        
        {ESLVal v0 = $2740;
        
        return $null;
      }
      }
    case "NullExp": {ESLVal $2739 = _v1670.termRef(0);
        
        {ESLVal v0 = $2739;
        
        return $null;
      }
      }
    case "PLet": {ESLVal $2738 = _v1670.termRef(0);
        ESLVal $2737 = _v1670.termRef(1);
        ESLVal $2736 = _v1670.termRef(2);
        
        {ESLVal v0 = $2738;
        
        {ESLVal v1 = $2737;
        
        {ESLVal v2 = $2736;
        
        {{
        ESLVal _v1675 = v1;
        while(_v1675.isCons()) {
          ESLVal b = _v1675.headVal;
          walkTBind(b);
          _v1675 = _v1675.tailVal;}
      }
      return walkAST(v2);}
      }
      }
      }
      }
    case "Probably": {ESLVal $2735 = _v1670.termRef(0);
        ESLVal $2734 = _v1670.termRef(1);
        ESLVal $2733 = _v1670.termRef(2);
        ESLVal $2732 = _v1670.termRef(3);
        ESLVal $2731 = _v1670.termRef(4);
        
        {ESLVal v0 = $2735;
        
        {ESLVal v1 = $2734;
        
        {ESLVal v2 = $2733;
        
        {ESLVal v3 = $2732;
        
        {ESLVal v4 = $2731;
        
        {walkAST(v1);
      walkAST(v3);
      return walkAST(v4);}
      }
      }
      }
      }
      }
      }
    case "Record": {ESLVal $2730 = _v1670.termRef(0);
        ESLVal $2729 = _v1670.termRef(1);
        
        {ESLVal v0 = $2730;
        
        {ESLVal v1 = $2729;
        
        {{
        ESLVal _v1674 = v1;
        while(_v1674.isCons()) {
          ESLVal b = _v1674.headVal;
          walkTBind(b);
          _v1674 = _v1674.tailVal;}
      }
      return $null;}
      }
      }
      }
    case "RefSuper": {ESLVal $2728 = _v1670.termRef(0);
        ESLVal $2727 = _v1670.termRef(1);
        
        {ESLVal v0 = $2728;
        
        {ESLVal v1 = $2727;
        
        return $null;
      }
      }
      }
    case "Ref": {ESLVal $2726 = _v1670.termRef(0);
        ESLVal $2725 = _v1670.termRef(1);
        ESLVal $2724 = _v1670.termRef(2);
        
        {ESLVal v0 = $2726;
        
        {ESLVal v1 = $2725;
        
        {ESLVal v2 = $2724;
        
        return walkAST(v1);
      }
      }
      }
      }
    case "Self": {ESLVal $2723 = _v1670.termRef(0);
        
        {ESLVal v0 = $2723;
        
        return $null;
      }
      }
    case "Send": {ESLVal $2722 = _v1670.termRef(0);
        ESLVal $2721 = _v1670.termRef(1);
        ESLVal $2720 = _v1670.termRef(2);
        
        {ESLVal v0 = $2722;
        
        {ESLVal v1 = $2721;
        
        {ESLVal v2 = $2720;
        
        {walkAST(v1);
      return walkAST(v2);}
      }
      }
      }
      }
    case "SendSuper": {ESLVal $2719 = _v1670.termRef(0);
        ESLVal $2718 = _v1670.termRef(1);
        
        {ESLVal v0 = $2719;
        
        {ESLVal v1 = $2718;
        
        return walkAST(v1);
      }
      }
      }
    case "SendTimeSuper": {ESLVal $2717 = _v1670.termRef(0);
        
        {ESLVal v0 = $2717;
        
        return $null;
      }
      }
    case "SetExp": {ESLVal $2716 = _v1670.termRef(0);
        ESLVal $2715 = _v1670.termRef(1);
        
        {ESLVal v0 = $2716;
        
        {ESLVal v1 = $2715;
        
        {{
        ESLVal _v1673 = v1;
        while(_v1673.isCons()) {
          ESLVal e = _v1673.headVal;
          walkAST(e);
          _v1673 = _v1673.tailVal;}
      }
      return $null;}
      }
      }
      }
    case "StrExp": {ESLVal $2714 = _v1670.termRef(0);
        ESLVal $2713 = _v1670.termRef(1);
        
        {ESLVal v0 = $2714;
        
        {ESLVal v1 = $2713;
        
        return $null;
      }
      }
      }
    case "Tail": {ESLVal $2712 = _v1670.termRef(0);
        
        {ESLVal v0 = $2712;
        
        return walkAST(v0);
      }
      }
    case "Term": {ESLVal $2711 = _v1670.termRef(0);
        ESLVal $2710 = _v1670.termRef(1);
        ESLVal $2709 = _v1670.termRef(2);
        ESLVal $2708 = _v1670.termRef(3);
        
        {ESLVal v0 = $2711;
        
        {ESLVal v1 = $2710;
        
        {ESLVal v2 = $2709;
        
        {ESLVal v3 = $2708;
        
        {{
        ESLVal _v1672 = v3;
        while(_v1672.isCons()) {
          ESLVal termArg = _v1672.headVal;
          walkAST(termArg);
          _v1672 = _v1672.tailVal;}
      }
      return $null;}
      }
      }
      }
      }
      }
    case "TermRef": {ESLVal $2707 = _v1670.termRef(0);
        ESLVal $2706 = _v1670.termRef(1);
        
        {ESLVal v0 = $2707;
        
        {ESLVal v1 = $2706;
        
        return walkAST(v0);
      }
      }
      }
    case "Throw": {ESLVal $2705 = _v1670.termRef(0);
        ESLVal $2704 = _v1670.termRef(1);
        ESLVal $2703 = _v1670.termRef(2);
        
        {ESLVal v0 = $2705;
        
        {ESLVal v1 = $2704;
        
        {ESLVal v2 = $2703;
        
        return walkAST(v2);
      }
      }
      }
      }
    case "Try": {ESLVal $2702 = _v1670.termRef(0);
        ESLVal $2701 = _v1670.termRef(1);
        ESLVal $2700 = _v1670.termRef(2);
        
        {ESLVal v0 = $2702;
        
        {ESLVal v1 = $2701;
        
        {ESLVal v2 = $2700;
        
        {walkAST(v1);
      {{
        ESLVal _v1671 = v2;
        while(_v1671.isCons()) {
          ESLVal a = _v1671.headVal;
          walkArm(a);
          _v1671 = _v1671.tailVal;}
      }
      return $null;}}
      }
      }
      }
      }
    case "Update": {ESLVal $2699 = _v1670.termRef(0);
        ESLVal $2698 = _v1670.termRef(1);
        ESLVal $2697 = _v1670.termRef(2);
        
        {ESLVal v0 = $2699;
        
        {ESLVal v1 = $2698;
        
        {ESLVal v2 = $2697;
        
        return walkAST(v2);
      }
      }
      }
      }
    case "Unfold": {ESLVal $2696 = _v1670.termRef(0);
        ESLVal $2695 = _v1670.termRef(1);
        ESLVal $2694 = _v1670.termRef(2);
        
        {ESLVal v0 = $2696;
        
        {ESLVal v1 = $2695;
        
        {ESLVal v2 = $2694;
        
        return walkAST(v2);
      }
      }
      }
      }
    case "Var": {ESLVal $2693 = _v1670.termRef(0);
        ESLVal $2692 = _v1670.termRef(1);
        
        {ESLVal v0 = $2693;
        
        {ESLVal v1 = $2692;
        
        return $null;
      }
      }
      }
      default: {ESLVal _v1704 = _v1670;
        
        return print.apply(new ESLVal("unknown expression: ").add(_v1704));
      }
    }
    }
  }
  private static ESLVal walkAST = new ESLVal(new Function(new ESLVal("walkAST"),null) { public ESLVal apply(ESLVal... args) { return walkAST(args[0]); }});
public static void main(String[] args) {
  }
}