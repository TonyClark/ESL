package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.PpExp.*;
public class Cases {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal loc0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal voidType = new ESLVal("VoidType",loc0);
  private static ESLVal varCounter = $zero;
  private static ESLVal case0 = new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("x")),new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PVar",loc0,new ESLVal("xx"),voidType),new ESLVal("PVar",loc0,new ESLVal("yy"),voidType)),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK")))));
  private static ESLVal case1 = new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("x")),new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(pterm(new ESLVal("A"),ESLVal.list(pterm(new ESLVal("B"),ESLVal.list(pvar(new ESLVal("v0")))),pvar(new ESLVal("v1")),pvar(new ESLVal("v2")))),pterm(new ESLVal("C"),$nil)),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK1"))),new ESLVal("BArm",loc0,ESLVal.list(pvar(new ESLVal("v0")),pterm(new ESLVal("C"),$nil)),new ESLVal("BoolExp",loc0,$true),new ESLVal("Var",loc0,new ESLVal("OK2")))));
  private static ESLVal case2 = new ESLVal("Case",loc0,$nil,ESLVal.list(var(new ESLVal("l"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PNil",loc0)),var(new ESLVal("g1")),var(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(pcons(pterm(new ESLVal("One"),$nil),pvar(new ESLVal("rest1")))),var(new ESLVal("g1")),var(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(pcons(pterm(new ESLVal("Succ"),ESLVal.list(pterm(new ESLVal("One"),$nil))),pvar(new ESLVal("rest2")))),var(new ESLVal("g2")),var(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(pcons(pterm(new ESLVal("Infinity"),$nil),new ESLVal("PNil",loc0))),var(new ESLVal("g3")),var(new ESLVal("M3")))));
  private static ESLVal case3 = new ESLVal("Case",loc0,$nil,ESLVal.list(var(new ESLVal("x")),var(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$zero),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g1")),var(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$one),new ESLVal("PInt",loc0,$zero)),var(new ESLVal("g2")),var(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PInt",loc0,$zero),pvar(new ESLVal("x"))),var(new ESLVal("g3")),var(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g4")),var(new ESLVal("M4")))));
  private static ESLVal case4 = new ESLVal("Case",loc0,$nil,ESLVal.list(var(new ESLVal("x")),var(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g1")),var(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$zero)),var(new ESLVal("g2")),var(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("two")),pvar(new ESLVal("x"))),var(new ESLVal("g3")),var(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g4")),var(new ESLVal("M4")))));
  private static ESLVal case5 = new ESLVal("Case",loc0,$nil,ESLVal.list(var(new ESLVal("x")),var(new ESLVal("y"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g1")),var(new ESLVal("M1"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("one")),new ESLVal("PInt",loc0,$zero)),var(new ESLVal("g2")),var(new ESLVal("M2"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PStr",loc0,new ESLVal("two")),pvar(new ESLVal("x"))),var(new ESLVal("g3")),var(new ESLVal("M3"))),new ESLVal("BArm",loc0,ESLVal.list(pvar(new ESLVal("x")),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g4")),var(new ESLVal("M4"))),new ESLVal("BArm",loc0,ESLVal.list(new ESLVal("PBool",loc0,$true),new ESLVal("PInt",loc0,$one)),var(new ESLVal("g4")),var(new ESLVal("M4")))));
  private static ESLVal case6 = new ESLVal("Case",loc0,$nil,ESLVal.list(var(new ESLVal("x"))),ESLVal.list(new ESLVal("BArm",loc0,ESLVal.list(pterm(new ESLVal("A"),ESLVal.list(new ESLVal("PInt",loc0,$one)))),var(new ESLVal("g1")),var(new ESLVal("M1")))));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v1932 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1932)));
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
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  {print.apply(ppExp($zero,translateCases(case0)));
                  print.apply(ppExp($zero,translateCases(case1)));
                  print.apply(ppExp($zero,translateCases(case2)));
                  print.apply(ppExp($zero,translateCases(case3)));
                  print.apply(ppExp($zero,translateCases(case4)));
                  print.apply(ppExp($zero,translateCases(case5)));
                  return print.apply(ppExp($zero,translateCases(case6)));}
                }}.get();
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v1931 = $x;
              
              {ESLVal x = _v1931;
              
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
private static ESLVal newVar() {
    
    {varCounter = varCounter.add($one);
    return new ESLVal("$").add(varCounter);}
  }
  private static ESLVal newVar = new ESLVal(new Function(new ESLVal("newVar"),null) { public ESLVal apply(ESLVal... args) { return newVar(); }});
  private static ESLVal translateArms(ESLVal as) {
    
    {ESLVal _v1889 = as;
      
      if(_v1889.isCons())
      {ESLVal $3645 = _v1889.head();
        ESLVal $3646 = _v1889.tail();
        
        switch($3645.termName) {
        case "BArm": {ESLVal $3650 = $3645.termRef(0);
          ESLVal $3649 = $3645.termRef(1);
          ESLVal $3648 = $3645.termRef(2);
          ESLVal $3647 = $3645.termRef(3);
          
          {ESLVal l = $3650;
          
          {ESLVal ps = $3649;
          
          {ESLVal g = $3648;
          
          {ESLVal e = $3647;
          
          {ESLVal _v1955 = $3646;
          
          return translateArms(_v1955).cons(new ESLVal("LArm",l,ps,$nil,g,e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v1889)));
      }
      }
    else if(_v1889.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(1889,2030)").add(ESLVal.list(_v1889)));
    }
  }
  private static ESLVal translateArms = new ESLVal(new Function(new ESLVal("translateArms"),null) { public ESLVal apply(ESLVal... args) { return translateArms(args[0]); }});
  private static ESLVal newVars(ESLVal n) {
    
    if(n.eql($zero).boolVal)
      return $nil;
      else
        return newVars(n.sub($one)).cons(newVar());
  }
  private static ESLVal newVars = new ESLVal(new Function(new ESLVal("newVars"),null) { public ESLVal apply(ESLVal... args) { return newVars(args[0]); }});
  public static ESLVal translateCases(ESLVal exp) {
    
    {ESLVal _v1890 = exp;
      
      switch(_v1890.termName) {
      case "Module": {ESLVal $3772 = _v1890.termRef(0);
        ESLVal $3771 = _v1890.termRef(1);
        ESLVal $3770 = _v1890.termRef(2);
        ESLVal $3769 = _v1890.termRef(3);
        ESLVal $3768 = _v1890.termRef(4);
        ESLVal $3767 = _v1890.termRef(5);
        ESLVal $3766 = _v1890.termRef(6);
        
        {ESLVal path = $3772;
        
        {ESLVal name = $3771;
        
        {ESLVal exports = $3770;
        
        {ESLVal imports = $3769;
        
        {ESLVal x = $3768;
        
        {ESLVal y = $3767;
        
        {ESLVal defs = $3766;
        
        return new ESLVal("Module",path,name,exports,imports,x,y,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateDef(d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(mergeFunDefs(defs)));
      }
      }
      }
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $3765 = _v1890.termRef(0);
        ESLVal $3764 = _v1890.termRef(1);
        ESLVal $3763 = _v1890.termRef(2);
        ESLVal $3762 = _v1890.termRef(3);
        ESLVal $3761 = _v1890.termRef(4);
        
        {ESLVal l = $3765;
        
        {ESLVal n = $3764;
        
        {ESLVal args = $3763;
        
        {ESLVal t = $3762;
        
        {ESLVal e = $3761;
        
        return new ESLVal("FunExp",l,n,args,t,translateCases(e));
      }
      }
      }
      }
      }
      }
    case "StrExp": {ESLVal $3760 = _v1890.termRef(0);
        ESLVal $3759 = _v1890.termRef(1);
        
        {ESLVal l = $3760;
        
        {ESLVal v = $3759;
        
        return exp;
      }
      }
      }
    case "IntExp": {ESLVal $3758 = _v1890.termRef(0);
        ESLVal $3757 = _v1890.termRef(1);
        
        {ESLVal l = $3758;
        
        {ESLVal v = $3757;
        
        return exp;
      }
      }
      }
    case "BoolExp": {ESLVal $3756 = _v1890.termRef(0);
        ESLVal $3755 = _v1890.termRef(1);
        
        {ESLVal l = $3756;
        
        {ESLVal v = $3755;
        
        return exp;
      }
      }
      }
    case "BagExp": {ESLVal $3754 = _v1890.termRef(0);
        ESLVal $3753 = _v1890.termRef(1);
        
        {ESLVal l = $3754;
        
        {ESLVal es = $3753;
        
        return new ESLVal("BagExp",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "NullExp": {ESLVal $3752 = _v1890.termRef(0);
        
        {ESLVal l = $3752;
        
        return exp;
      }
      }
    case "FloatExp": {ESLVal $3751 = _v1890.termRef(0);
        ESLVal $3750 = _v1890.termRef(1);
        
        {ESLVal l = $3751;
        
        {ESLVal f = $3750;
        
        return exp;
      }
      }
      }
    case "Term": {ESLVal $3749 = _v1890.termRef(0);
        ESLVal $3748 = _v1890.termRef(1);
        ESLVal $3747 = _v1890.termRef(2);
        ESLVal $3746 = _v1890.termRef(3);
        
        {ESLVal l = $3749;
        
        {ESLVal n = $3748;
        
        {ESLVal ts = $3747;
        
        {ESLVal es = $3746;
        
        return new ESLVal("Term",l,n,ts,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
      }
      }
    case "List": {ESLVal $3745 = _v1890.termRef(0);
        ESLVal $3744 = _v1890.termRef(1);
        
        {ESLVal l = $3745;
        
        {ESLVal es = $3744;
        
        return new ESLVal("List",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "Block": {ESLVal $3743 = _v1890.termRef(0);
        ESLVal $3742 = _v1890.termRef(1);
        
        {ESLVal l = $3743;
        
        {ESLVal es = $3742;
        
        return new ESLVal("Block",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "Apply": {ESLVal $3741 = _v1890.termRef(0);
        ESLVal $3740 = _v1890.termRef(1);
        ESLVal $3739 = _v1890.termRef(2);
        
        {ESLVal l = $3741;
        
        {ESLVal op = $3740;
        
        {ESLVal args = $3739;
        
        return new ESLVal("Apply",l,translateCases(op),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $3738 = _v1890.termRef(0);
        ESLVal $3737 = _v1890.termRef(1);
        ESLVal $3736 = _v1890.termRef(2);
        
        {ESLVal l = $3738;
        
        {ESLVal op = $3737;
        
        {ESLVal args = $3736;
        
        return new ESLVal("ApplyTypeExp",l,translateCases(op),args);
      }
      }
      }
      }
    case "Case": {ESLVal $3735 = _v1890.termRef(0);
        ESLVal $3734 = _v1890.termRef(1);
        ESLVal $3733 = _v1890.termRef(2);
        ESLVal $3732 = _v1890.termRef(3);
        
        {ESLVal l = $3735;
        
        {ESLVal ds = $3734;
        
        {ESLVal es = $3733;
        
        {ESLVal as = $3732;
        
        return compileCase(l,es,translateArms(as),new ESLVal("CaseError",l,new ESLVal("List",l,es)));
      }
      }
      }
      }
      }
    case "BinExp": {ESLVal $3731 = _v1890.termRef(0);
        ESLVal $3730 = _v1890.termRef(1);
        ESLVal $3729 = _v1890.termRef(2);
        ESLVal $3728 = _v1890.termRef(3);
        
        {ESLVal l = $3731;
        
        {ESLVal e1 = $3730;
        
        {ESLVal op = $3729;
        
        {ESLVal e2 = $3728;
        
        return new ESLVal("BinExp",l,translateCases(e1),op,translateCases(e2));
      }
      }
      }
      }
      }
    case "For": {ESLVal $3727 = _v1890.termRef(0);
        ESLVal $3726 = _v1890.termRef(1);
        ESLVal $3725 = _v1890.termRef(2);
        ESLVal $3724 = _v1890.termRef(3);
        
        {ESLVal l = $3727;
        
        {ESLVal p = $3726;
        
        {ESLVal e1 = $3725;
        
        {ESLVal e2 = $3724;
        
        return new ESLVal("For",l,p,translateCases(e1),translateCases(e2));
      }
      }
      }
      }
      }
    case "Throw": {ESLVal $3723 = _v1890.termRef(0);
        ESLVal $3722 = _v1890.termRef(1);
        ESLVal $3721 = _v1890.termRef(2);
        
        {ESLVal l = $3723;
        
        {ESLVal t = $3722;
        
        {ESLVal e = $3721;
        
        return new ESLVal("Throw",l,t,translateCases(e));
      }
      }
      }
      }
    case "Try": {ESLVal $3720 = _v1890.termRef(0);
        ESLVal $3719 = _v1890.termRef(1);
        ESLVal $3718 = _v1890.termRef(2);
        
        {ESLVal l = $3720;
        
        {ESLVal e = $3719;
        
        {ESLVal as = $3718;
        
        return new ESLVal("Try",l,translateCases(e),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal a = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateArm(a));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(as));
      }
      }
      }
      }
    case "ActExp": {ESLVal $3717 = _v1890.termRef(0);
        ESLVal $3716 = _v1890.termRef(1);
        ESLVal $3715 = _v1890.termRef(2);
        ESLVal $3714 = _v1890.termRef(3);
        ESLVal $3713 = _v1890.termRef(4);
        ESLVal $3712 = _v1890.termRef(5);
        ESLVal $3711 = _v1890.termRef(6);
        ESLVal $3710 = _v1890.termRef(7);
        
        {ESLVal l = $3717;
        
        {ESLVal n = $3716;
        
        {ESLVal args = $3715;
        
        {ESLVal x = $3714;
        
        {ESLVal spec = $3713;
        
        {ESLVal locals = $3712;
        
        {ESLVal init = $3711;
        
        {ESLVal handlers = $3710;
        
        return new ESLVal("ActExp",l,n,args,x,spec,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateDef(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(locals),translateCases(init),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal h = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateArm(h));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(handlers));
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "If": {ESLVal $3709 = _v1890.termRef(0);
        ESLVal $3708 = _v1890.termRef(1);
        ESLVal $3707 = _v1890.termRef(2);
        ESLVal $3706 = _v1890.termRef(3);
        
        {ESLVal l = $3709;
        
        {ESLVal e1 = $3708;
        
        {ESLVal e2 = $3707;
        
        {ESLVal e3 = $3706;
        
        return new ESLVal("If",l,translateCases(e1),translateCases(e2),translateCases(e3));
      }
      }
      }
      }
      }
    case "Self": {ESLVal $3705 = _v1890.termRef(0);
        
        {ESLVal l = $3705;
        
        return exp;
      }
      }
    case "Update": {ESLVal $3704 = _v1890.termRef(0);
        ESLVal $3703 = _v1890.termRef(1);
        ESLVal $3702 = _v1890.termRef(2);
        
        {ESLVal l = $3704;
        
        {ESLVal n = $3703;
        
        {ESLVal e = $3702;
        
        return new ESLVal("Update",l,n,translateCases(e));
      }
      }
      }
      }
    case "Ref": {ESLVal $3701 = _v1890.termRef(0);
        ESLVal $3700 = _v1890.termRef(1);
        ESLVal $3699 = _v1890.termRef(2);
        
        {ESLVal l = $3701;
        
        {ESLVal e = $3700;
        
        {ESLVal n = $3699;
        
        return new ESLVal("Ref",l,translateCases(e),n);
      }
      }
      }
      }
    case "Var": {ESLVal $3698 = _v1890.termRef(0);
        ESLVal $3697 = _v1890.termRef(1);
        
        {ESLVal l = $3698;
        
        {ESLVal n = $3697;
        
        return exp;
      }
      }
      }
    case "Send": {ESLVal $3696 = _v1890.termRef(0);
        ESLVal $3695 = _v1890.termRef(1);
        ESLVal $3694 = _v1890.termRef(2);
        
        {ESLVal l = $3696;
        
        {ESLVal target = $3695;
        
        {ESLVal message = $3694;
        
        return new ESLVal("Send",l,translateCases(target),translateCases(message));
      }
      }
      }
      }
    case "SendTimeSuper": {ESLVal $3693 = _v1890.termRef(0);
        
        {ESLVal l = $3693;
        
        return new ESLVal("SendTimeSuper",l);
      }
      }
    case "SendSuper": {ESLVal $3692 = _v1890.termRef(0);
        ESLVal $3691 = _v1890.termRef(1);
        
        {ESLVal l = $3692;
        
        {ESLVal e = $3691;
        
        return new ESLVal("SendSuper",l,translateCases(e));
      }
      }
      }
    case "SetExp": {ESLVal $3690 = _v1890.termRef(0);
        ESLVal $3689 = _v1890.termRef(1);
        
        {ESLVal l = $3690;
        
        {ESLVal es = $3689;
        
        return new ESLVal("SetExp",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(es));
      }
      }
      }
    case "Cmp": {ESLVal $3688 = _v1890.termRef(0);
        ESLVal $3687 = _v1890.termRef(1);
        ESLVal $3686 = _v1890.termRef(2);
        
        {ESLVal l = $3688;
        
        {ESLVal e = $3687;
        
        {ESLVal qs = $3686;
        
        return new ESLVal("Cmp",l,translateCases(e),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal q = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateQual(q));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(qs));
      }
      }
      }
      }
    case "New": {ESLVal $3685 = _v1890.termRef(0);
        ESLVal $3684 = _v1890.termRef(1);
        ESLVal $3683 = _v1890.termRef(2);
        
        {ESLVal l = $3685;
        
        {ESLVal b = $3684;
        
        {ESLVal args = $3683;
        
        return new ESLVal("New",l,translateCases(b),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
      }
    case "NewJava": {ESLVal $3682 = _v1890.termRef(0);
        ESLVal $3681 = _v1890.termRef(1);
        ESLVal $3680 = _v1890.termRef(2);
        ESLVal $3679 = _v1890.termRef(3);
        
        {ESLVal l = $3682;
        
        {ESLVal className = $3681;
        
        {ESLVal t = $3680;
        
        {ESLVal args = $3679;
        
        return new ESLVal("NewJava",l,className,t,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal e = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateCases(e));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(args));
      }
      }
      }
      }
      }
    case "Let": {ESLVal $3678 = _v1890.termRef(0);
        ESLVal $3677 = _v1890.termRef(1);
        ESLVal $3676 = _v1890.termRef(2);
        
        {ESLVal l = $3678;
        
        {ESLVal bs = $3677;
        
        {ESLVal e = $3676;
        
        return new ESLVal("Let",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateDef(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),translateCases(e));
      }
      }
      }
      }
    case "Letrec": {ESLVal $3675 = _v1890.termRef(0);
        ESLVal $3674 = _v1890.termRef(1);
        ESLVal $3673 = _v1890.termRef(2);
        
        {ESLVal l = $3675;
        
        {ESLVal bs = $3674;
        
        {ESLVal e = $3673;
        
        return new ESLVal("Letrec",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateDef(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),translateCases(e));
      }
      }
      }
      }
    case "Grab": {ESLVal $3672 = _v1890.termRef(0);
        ESLVal $3671 = _v1890.termRef(1);
        ESLVal $3670 = _v1890.termRef(2);
        
        {ESLVal l = $3672;
        
        {ESLVal rs = $3671;
        
        {ESLVal e = $3670;
        
        return new ESLVal("Grab",l,rs,translateCases(e));
      }
      }
      }
      }
    case "PLet": {ESLVal $3669 = _v1890.termRef(0);
        ESLVal $3668 = _v1890.termRef(1);
        ESLVal $3667 = _v1890.termRef(2);
        
        {ESLVal l = $3669;
        
        {ESLVal bs = $3668;
        
        {ESLVal e = $3667;
        
        return new ESLVal("PLet",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(translateDef(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(bs),translateCases(e));
      }
      }
      }
      }
    case "Probably": {ESLVal $3666 = _v1890.termRef(0);
        ESLVal $3665 = _v1890.termRef(1);
        ESLVal $3664 = _v1890.termRef(2);
        ESLVal $3663 = _v1890.termRef(3);
        ESLVal $3662 = _v1890.termRef(4);
        
        {ESLVal l = $3666;
        
        {ESLVal p = $3665;
        
        {ESLVal t = $3664;
        
        {ESLVal e1 = $3663;
        
        {ESLVal e2 = $3662;
        
        return new ESLVal("Probably",l,translateCases(p),t,translateCases(e1),translateCases(e2));
      }
      }
      }
      }
      }
      }
    case "Not": {ESLVal $3661 = _v1890.termRef(0);
        ESLVal $3660 = _v1890.termRef(1);
        
        {ESLVal l = $3661;
        
        {ESLVal e = $3660;
        
        return new ESLVal("Not",l,translateCases(e));
      }
      }
      }
    case "Fold": {ESLVal $3659 = _v1890.termRef(0);
        ESLVal $3658 = _v1890.termRef(1);
        ESLVal $3657 = _v1890.termRef(2);
        
        {ESLVal l = $3659;
        
        {ESLVal t = $3658;
        
        {ESLVal e = $3657;
        
        return new ESLVal("Fold",l,t,translateCases(e));
      }
      }
      }
      }
    case "Unfold": {ESLVal $3656 = _v1890.termRef(0);
        ESLVal $3655 = _v1890.termRef(1);
        ESLVal $3654 = _v1890.termRef(2);
        
        {ESLVal l = $3656;
        
        {ESLVal t = $3655;
        
        {ESLVal e = $3654;
        
        return new ESLVal("Unfold",l,t,translateCases(e));
      }
      }
      }
      }
    case "Now": {ESLVal $3653 = _v1890.termRef(0);
        
        {ESLVal l = $3653;
        
        return exp;
      }
      }
    case "Become": {ESLVal $3652 = _v1890.termRef(0);
        ESLVal $3651 = _v1890.termRef(1);
        
        {ESLVal l = $3652;
        
        {ESLVal e = $3651;
        
        return new ESLVal("Become",l,translateCases(e));
      }
      }
      }
      default: {ESLVal x = _v1890;
        
        return error(exp);
      }
    }
    }
  }
  public static ESLVal translateCases = new ESLVal(new Function(new ESLVal("translateCases"),null) { public ESLVal apply(ESLVal... args) { return translateCases(args[0]); }});
  private static ESLVal armPatterns(ESLVal arm) {
    
    {ESLVal _v1891 = arm;
      
      switch(_v1891.termName) {
      case "LArm": {ESLVal $3777 = _v1891.termRef(0);
        ESLVal $3776 = _v1891.termRef(1);
        ESLVal $3775 = _v1891.termRef(2);
        ESLVal $3774 = _v1891.termRef(3);
        ESLVal $3773 = _v1891.termRef(4);
        
        {ESLVal l = $3777;
        
        {ESLVal ps = $3776;
        
        {ESLVal bs = $3775;
        
        {ESLVal g = $3774;
        
        {ESLVal e = $3773;
        
        return ps;
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8442,8522)").add(ESLVal.list(_v1891)));
    }
    }
  }
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),null) { public ESLVal apply(ESLVal... args) { return armPatterns(args[0]); }});
  private static ESLVal armBody(ESLVal arm) {
    
    {ESLVal _v1892 = arm;
      
      switch(_v1892.termName) {
      case "LArm": {ESLVal $3782 = _v1892.termRef(0);
        ESLVal $3781 = _v1892.termRef(1);
        ESLVal $3780 = _v1892.termRef(2);
        ESLVal $3779 = _v1892.termRef(3);
        ESLVal $3778 = _v1892.termRef(4);
        
        {ESLVal l = $3782;
        
        {ESLVal ps = $3781;
        
        {ESLVal bs = $3780;
        
        {ESLVal g = $3779;
        
        {ESLVal e = $3778;
        
        return e;
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8551,8630)").add(ESLVal.list(_v1892)));
    }
    }
  }
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),null) { public ESLVal apply(ESLVal... args) { return armBody(args[0]); }});
  private static ESLVal armGuard(ESLVal arm) {
    
    {ESLVal _v1893 = arm;
      
      switch(_v1893.termName) {
      case "LArm": {ESLVal $3787 = _v1893.termRef(0);
        ESLVal $3786 = _v1893.termRef(1);
        ESLVal $3785 = _v1893.termRef(2);
        ESLVal $3784 = _v1893.termRef(3);
        ESLVal $3783 = _v1893.termRef(4);
        
        {ESLVal l = $3787;
        
        {ESLVal ps = $3786;
        
        {ESLVal bs = $3785;
        
        {ESLVal g = $3784;
        
        {ESLVal e = $3783;
        
        return g;
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8660,8739)").add(ESLVal.list(_v1893)));
    }
    }
  }
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),null) { public ESLVal apply(ESLVal... args) { return armGuard(args[0]); }});
  private static ESLVal setArmBody(ESLVal arm,ESLVal e) {
    
    {ESLVal _v1894 = arm;
      
      switch(_v1894.termName) {
      case "LArm": {ESLVal $3792 = _v1894.termRef(0);
        ESLVal $3791 = _v1894.termRef(1);
        ESLVal $3790 = _v1894.termRef(2);
        ESLVal $3789 = _v1894.termRef(3);
        ESLVal $3788 = _v1894.termRef(4);
        
        {ESLVal l = $3792;
        
        {ESLVal ps = $3791;
        
        {ESLVal bs = $3790;
        
        {ESLVal g = $3789;
        
        {ESLVal old = $3788;
        
        return new ESLVal("LArm",l,ps,bs,g,e);
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8778,8875)").add(ESLVal.list(_v1894)));
    }
    }
  }
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),null) { public ESLVal apply(ESLVal... args) { return setArmBody(args[0],args[1]); }});
  private static ESLVal setArmPatterns(ESLVal arm,ESLVal ps) {
    
    {ESLVal _v1895 = arm;
      
      switch(_v1895.termName) {
      case "LArm": {ESLVal $3797 = _v1895.termRef(0);
        ESLVal $3796 = _v1895.termRef(1);
        ESLVal $3795 = _v1895.termRef(2);
        ESLVal $3794 = _v1895.termRef(3);
        ESLVal $3793 = _v1895.termRef(4);
        
        {ESLVal l = $3797;
        
        {ESLVal old = $3796;
        
        {ESLVal bs = $3795;
        
        {ESLVal g = $3794;
        
        {ESLVal e = $3793;
        
        return new ESLVal("LArm",l,ps,bs,g,e);
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(8925,9022)").add(ESLVal.list(_v1895)));
    }
    }
  }
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),null) { public ESLVal apply(ESLVal... args) { return setArmPatterns(args[0],args[1]); }});
  private static ESLVal addArmBindings(ESLVal arm,ESLVal newBS) {
    
    {ESLVal _v1896 = arm;
      
      switch(_v1896.termName) {
      case "LArm": {ESLVal $3802 = _v1896.termRef(0);
        ESLVal $3801 = _v1896.termRef(1);
        ESLVal $3800 = _v1896.termRef(2);
        ESLVal $3799 = _v1896.termRef(3);
        ESLVal $3798 = _v1896.termRef(4);
        
        {ESLVal l = $3802;
        
        {ESLVal ps = $3801;
        
        {ESLVal bs = $3800;
        
        {ESLVal g = $3799;
        
        {ESLVal e = $3798;
        
        return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(9073,9178)").add(ESLVal.list(_v1896)));
    }
    }
  }
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),null) { public ESLVal apply(ESLVal... args) { return addArmBindings(args[0],args[1]); }});
  private static ESLVal isPVar(ESLVal p) {
    
    {ESLVal _v1897 = p;
      
      switch(_v1897.termName) {
      case "PVar": {ESLVal $3805 = _v1897.termRef(0);
        ESLVal $3804 = _v1897.termRef(1);
        ESLVal $3803 = _v1897.termRef(2);
        
        {ESLVal l = $3805;
        
        {ESLVal n = $3804;
        
        {ESLVal t = $3803;
        
        return $true;
      }
      }
      }
      }
      default: {ESLVal _v1954 = _v1897;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),null) { public ESLVal apply(ESLVal... args) { return isPVar(args[0]); }});
  private static ESLVal isPInt(ESLVal p) {
    
    {ESLVal _v1898 = p;
      
      switch(_v1898.termName) {
      case "PInt": {ESLVal $3807 = _v1898.termRef(0);
        ESLVal $3806 = _v1898.termRef(1);
        
        {ESLVal l = $3807;
        
        {ESLVal n = $3806;
        
        return $true;
      }
      }
      }
      default: {ESLVal _v1953 = _v1898;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),null) { public ESLVal apply(ESLVal... args) { return isPInt(args[0]); }});
  private static ESLVal isPStr(ESLVal p) {
    
    {ESLVal _v1899 = p;
      
      switch(_v1899.termName) {
      case "PStr": {ESLVal $3809 = _v1899.termRef(0);
        ESLVal $3808 = _v1899.termRef(1);
        
        {ESLVal l = $3809;
        
        {ESLVal n = $3808;
        
        return $true;
      }
      }
      }
      default: {ESLVal _v1952 = _v1899;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),null) { public ESLVal apply(ESLVal... args) { return isPStr(args[0]); }});
  private static ESLVal isPBool(ESLVal p) {
    
    {ESLVal _v1900 = p;
      
      switch(_v1900.termName) {
      case "PBool": {ESLVal $3811 = _v1900.termRef(0);
        ESLVal $3810 = _v1900.termRef(1);
        
        {ESLVal l = $3811;
        
        {ESLVal b = $3810;
        
        return $true;
      }
      }
      }
      default: {ESLVal _v1951 = _v1900;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),null) { public ESLVal apply(ESLVal... args) { return isPBool(args[0]); }});
  private static ESLVal isPTerm(ESLVal p) {
    
    {ESLVal _v1901 = p;
      
      switch(_v1901.termName) {
      case "PTerm": {ESLVal $3815 = _v1901.termRef(0);
        ESLVal $3814 = _v1901.termRef(1);
        ESLVal $3813 = _v1901.termRef(2);
        ESLVal $3812 = _v1901.termRef(3);
        
        {ESLVal l = $3815;
        
        {ESLVal n = $3814;
        
        {ESLVal ts = $3813;
        
        {ESLVal ps = $3812;
        
        return $true;
      }
      }
      }
      }
      }
      default: {ESLVal _v1950 = _v1901;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),null) { public ESLVal apply(ESLVal... args) { return isPTerm(args[0]); }});
  private static ESLVal isPCons(ESLVal p) {
    
    {ESLVal _v1902 = p;
      
      switch(_v1902.termName) {
      case "PCons": {ESLVal $3818 = _v1902.termRef(0);
        ESLVal $3817 = _v1902.termRef(1);
        ESLVal $3816 = _v1902.termRef(2);
        
        {ESLVal l = $3818;
        
        {ESLVal h = $3817;
        
        {ESLVal t = $3816;
        
        return $true;
      }
      }
      }
      }
      default: {ESLVal _v1949 = _v1902;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),null) { public ESLVal apply(ESLVal... args) { return isPCons(args[0]); }});
  private static ESLVal isPNil(ESLVal p) {
    
    {ESLVal _v1903 = p;
      
      switch(_v1903.termName) {
      case "PNil": {ESLVal $3823 = _v1903.termRef(0);
        
        {ESLVal l = $3823;
        
        return $true;
      }
      }
    case "PApplyType": {ESLVal $3821 = _v1903.termRef(0);
        ESLVal $3820 = _v1903.termRef(1);
        ESLVal $3819 = _v1903.termRef(2);
        
        switch($3820.termName) {
        case "PNil": {ESLVal $3822 = $3820.termRef(0);
          
          {ESLVal l1 = $3821;
          
          {ESLVal l2 = $3822;
          
          {ESLVal ts = $3819;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v1947 = _v1903;
          
          return $false;
        }
      }
      }
      default: {ESLVal _v1948 = _v1903;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),null) { public ESLVal apply(ESLVal... args) { return isPNil(args[0]); }});
  private static ESLVal isPList(ESLVal p) {
    
    return isPCons(p).or(isPNil(p));
  }
  private static ESLVal isPList = new ESLVal(new Function(new ESLVal("isPList"),null) { public ESLVal apply(ESLVal... args) { return isPList(args[0]); }});
  private static ESLVal isPNonDetList(ESLVal p) {
    
    return isPAdd(p);
  }
  private static ESLVal isPNonDetList = new ESLVal(new Function(new ESLVal("isPNonDetList"),null) { public ESLVal apply(ESLVal... args) { return isPNonDetList(args[0]); }});
  private static ESLVal isPSetCons(ESLVal p) {
    
    {ESLVal _v1904 = p;
      
      switch(_v1904.termName) {
      case "PSetCons": {ESLVal $3826 = _v1904.termRef(0);
        ESLVal $3825 = _v1904.termRef(1);
        ESLVal $3824 = _v1904.termRef(2);
        
        {ESLVal l = $3826;
        
        {ESLVal p1 = $3825;
        
        {ESLVal p2 = $3824;
        
        return $true;
      }
      }
      }
      }
      default: {ESLVal _v1946 = _v1904;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPSetCons = new ESLVal(new Function(new ESLVal("isPSetCons"),null) { public ESLVal apply(ESLVal... args) { return isPSetCons(args[0]); }});
  private static ESLVal isPEmptySet(ESLVal p) {
    
    {ESLVal _v1905 = p;
      
      switch(_v1905.termName) {
      case "PEmptySet": {ESLVal $3827 = _v1905.termRef(0);
        
        {ESLVal l = $3827;
        
        return $true;
      }
      }
      default: {ESLVal _v1945 = _v1905;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPEmptySet = new ESLVal(new Function(new ESLVal("isPEmptySet"),null) { public ESLVal apply(ESLVal... args) { return isPEmptySet(args[0]); }});
  private static ESLVal isPAdd(ESLVal p) {
    
    {ESLVal _v1906 = p;
      
      switch(_v1906.termName) {
      case "PAdd": {ESLVal $3830 = _v1906.termRef(0);
        ESLVal $3829 = _v1906.termRef(1);
        ESLVal $3828 = _v1906.termRef(2);
        
        {ESLVal l = $3830;
        
        {ESLVal p1 = $3829;
        
        {ESLVal p2 = $3828;
        
        return $true;
      }
      }
      }
      }
      default: {ESLVal _v1944 = _v1906;
        
        return $false;
      }
    }
    }
  }
  private static ESLVal isPAdd = new ESLVal(new Function(new ESLVal("isPAdd"),null) { public ESLVal apply(ESLVal... args) { return isPAdd(args[0]); }});
  private static ESLVal isPSet(ESLVal p) {
    
    return isPSetCons(p).or(isPEmptySet(p));
  }
  private static ESLVal isPSet = new ESLVal(new Function(new ESLVal("isPSet"),null) { public ESLVal apply(ESLVal... args) { return isPSet(args[0]); }});
  private static ESLVal pTermName(ESLVal p) {
    
    {ESLVal _v1907 = p;
      
      switch(_v1907.termName) {
      case "PTerm": {ESLVal $3834 = _v1907.termRef(0);
        ESLVal $3833 = _v1907.termRef(1);
        ESLVal $3832 = _v1907.termRef(2);
        ESLVal $3831 = _v1907.termRef(3);
        
        {ESLVal l = $3834;
        
        {ESLVal n = $3833;
        
        {ESLVal ts = $3832;
        
        {ESLVal ps = $3831;
        
        return n;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10558,10626)").add(ESLVal.list(_v1907)));
    }
    }
  }
  private static ESLVal pTermName = new ESLVal(new Function(new ESLVal("pTermName"),null) { public ESLVal apply(ESLVal... args) { return pTermName(args[0]); }});
  private static ESLVal pTermArgs(ESLVal p) {
    
    {ESLVal _v1908 = p;
      
      switch(_v1908.termName) {
      case "PTerm": {ESLVal $3838 = _v1908.termRef(0);
        ESLVal $3837 = _v1908.termRef(1);
        ESLVal $3836 = _v1908.termRef(2);
        ESLVal $3835 = _v1908.termRef(3);
        
        {ESLVal l = $3838;
        
        {ESLVal n = $3837;
        
        {ESLVal ts = $3836;
        
        {ESLVal ps = $3835;
        
        return ps;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10666,10735)").add(ESLVal.list(_v1908)));
    }
    }
  }
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),null) { public ESLVal apply(ESLVal... args) { return pTermArgs(args[0]); }});
  private static ESLVal pVarName(ESLVal p) {
    
    {ESLVal _v1909 = p;
      
      switch(_v1909.termName) {
      case "PVar": {ESLVal $3841 = _v1909.termRef(0);
        ESLVal $3840 = _v1909.termRef(1);
        ESLVal $3839 = _v1909.termRef(2);
        
        {ESLVal l = $3841;
        
        {ESLVal n = $3840;
        
        {ESLVal t = $3839;
        
        return n;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10768,10818)").add(ESLVal.list(_v1909)));
    }
    }
  }
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),null) { public ESLVal apply(ESLVal... args) { return pVarName(args[0]); }});
  private static ESLVal pConsHead(ESLVal p) {
    
    {ESLVal _v1910 = p;
      
      switch(_v1910.termName) {
      case "PCons": {ESLVal $3844 = _v1910.termRef(0);
        ESLVal $3843 = _v1910.termRef(1);
        ESLVal $3842 = _v1910.termRef(2);
        
        {ESLVal l = $3844;
        
        {ESLVal h = $3843;
        
        {ESLVal t = $3842;
        
        return h;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10856,10914)").add(ESLVal.list(_v1910)));
    }
    }
  }
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),null) { public ESLVal apply(ESLVal... args) { return pConsHead(args[0]); }});
  private static ESLVal pConsTail(ESLVal p) {
    
    {ESLVal _v1911 = p;
      
      switch(_v1911.termName) {
      case "PCons": {ESLVal $3847 = _v1911.termRef(0);
        ESLVal $3846 = _v1911.termRef(1);
        ESLVal $3845 = _v1911.termRef(2);
        
        {ESLVal l = $3847;
        
        {ESLVal h = $3846;
        
        {ESLVal t = $3845;
        
        return t;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10952,11010)").add(ESLVal.list(_v1911)));
    }
    }
  }
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),null) { public ESLVal apply(ESLVal... args) { return pConsTail(args[0]); }});
  private static ESLVal pSetConsHead(ESLVal p) {
    
    {ESLVal _v1912 = p;
      
      switch(_v1912.termName) {
      case "PSetCons": {ESLVal $3850 = _v1912.termRef(0);
        ESLVal $3849 = _v1912.termRef(1);
        ESLVal $3848 = _v1912.termRef(2);
        
        {ESLVal l = $3850;
        
        {ESLVal h = $3849;
        
        {ESLVal t = $3848;
        
        return h;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11051,11112)").add(ESLVal.list(_v1912)));
    }
    }
  }
  private static ESLVal pSetConsHead = new ESLVal(new Function(new ESLVal("pSetConsHead"),null) { public ESLVal apply(ESLVal... args) { return pSetConsHead(args[0]); }});
  private static ESLVal pSetConsTail(ESLVal p) {
    
    {ESLVal _v1913 = p;
      
      switch(_v1913.termName) {
      case "PSetCons": {ESLVal $3853 = _v1913.termRef(0);
        ESLVal $3852 = _v1913.termRef(1);
        ESLVal $3851 = _v1913.termRef(2);
        
        {ESLVal l = $3853;
        
        {ESLVal h = $3852;
        
        {ESLVal t = $3851;
        
        return t;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11153,11214)").add(ESLVal.list(_v1913)));
    }
    }
  }
  private static ESLVal pSetConsTail = new ESLVal(new Function(new ESLVal("pSetConsTail"),null) { public ESLVal apply(ESLVal... args) { return pSetConsTail(args[0]); }});
  private static ESLVal pAddLeft(ESLVal p) {
    
    {ESLVal _v1914 = p;
      
      switch(_v1914.termName) {
      case "PAdd": {ESLVal $3856 = _v1914.termRef(0);
        ESLVal $3855 = _v1914.termRef(1);
        ESLVal $3854 = _v1914.termRef(2);
        
        {ESLVal l = $3856;
        
        {ESLVal left = $3855;
        
        {ESLVal right = $3854;
        
        return left;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11250,11317)").add(ESLVal.list(_v1914)));
    }
    }
  }
  private static ESLVal pAddLeft = new ESLVal(new Function(new ESLVal("pAddLeft"),null) { public ESLVal apply(ESLVal... args) { return pAddLeft(args[0]); }});
  private static ESLVal pAddRight(ESLVal p) {
    
    {ESLVal _v1915 = p;
      
      switch(_v1915.termName) {
      case "PAdd": {ESLVal $3859 = _v1915.termRef(0);
        ESLVal $3858 = _v1915.termRef(1);
        ESLVal $3857 = _v1915.termRef(2);
        
        {ESLVal l = $3859;
        
        {ESLVal left = $3858;
        
        {ESLVal right = $3857;
        
        return right;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11354,11422)").add(ESLVal.list(_v1915)));
    }
    }
  }
  private static ESLVal pAddRight = new ESLVal(new Function(new ESLVal("pAddRight"),null) { public ESLVal apply(ESLVal... args) { return pAddRight(args[0]); }});
  private static ESLVal pIntValue(ESLVal p) {
    
    {ESLVal _v1916 = p;
      
      switch(_v1916.termName) {
      case "PInt": {ESLVal $3861 = _v1916.termRef(0);
        ESLVal $3860 = _v1916.termRef(1);
        
        {ESLVal l = $3861;
        
        {ESLVal n = $3860;
        
        return n;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11456,11498)").add(ESLVal.list(_v1916)));
    }
    }
  }
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),null) { public ESLVal apply(ESLVal... args) { return pIntValue(args[0]); }});
  private static ESLVal pStrValue(ESLVal p) {
    
    {ESLVal _v1917 = p;
      
      switch(_v1917.termName) {
      case "PStr": {ESLVal $3863 = _v1917.termRef(0);
        ESLVal $3862 = _v1917.termRef(1);
        
        {ESLVal l = $3863;
        
        {ESLVal n = $3862;
        
        return n;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11532,11574)").add(ESLVal.list(_v1917)));
    }
    }
  }
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),null) { public ESLVal apply(ESLVal... args) { return pStrValue(args[0]); }});
  private static ESLVal pBoolValue(ESLVal p) {
    
    {ESLVal _v1918 = p;
      
      switch(_v1918.termName) {
      case "PBool": {ESLVal $3865 = _v1918.termRef(0);
        ESLVal $3864 = _v1918.termRef(1);
        
        {ESLVal l = $3865;
        
        {ESLVal b = $3864;
        
        return b;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11610,11655)").add(ESLVal.list(_v1918)));
    }
    }
  }
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),null) { public ESLVal apply(ESLVal... args) { return pBoolValue(args[0]); }});
  private static ESLVal isEmptyPatterns(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun431"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return length.apply(armPatterns(a)).eql($zero);
        }
      }),arms);
  }
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),null) { public ESLVal apply(ESLVal... args) { return isEmptyPatterns(args[0]); }});
  private static ESLVal isFirstColumnVars(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun432"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPVar(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnVars = new ESLVal(new Function(new ESLVal("isFirstColumnVars"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnVars(args[0]); }});
  private static ESLVal isFirstColumnInts(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun433"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPInt(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnInts = new ESLVal(new Function(new ESLVal("isFirstColumnInts"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnInts(args[0]); }});
  private static ESLVal isFirstColumnStrs(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun434"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPStr(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnStrs = new ESLVal(new Function(new ESLVal("isFirstColumnStrs"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnStrs(args[0]); }});
  private static ESLVal isFirstColumnBools(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun435"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPBool(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnBools = new ESLVal(new Function(new ESLVal("isFirstColumnBools"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnBools(args[0]); }});
  private static ESLVal isFirstColumnCnstrs(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun436"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPTerm(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnCnstrs = new ESLVal(new Function(new ESLVal("isFirstColumnCnstrs"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnCnstrs(args[0]); }});
  private static ESLVal isFirstColumnSets(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun437"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPSet(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnSets = new ESLVal(new Function(new ESLVal("isFirstColumnSets"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnSets(args[0]); }});
  private static ESLVal isFirstColumnNonDetLists(ESLVal arms) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun438"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPNonDetList(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal isFirstColumnNonDetLists = new ESLVal(new Function(new ESLVal("isFirstColumnNonDetLists"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnNonDetLists(args[0]); }});
  private static ESLVal isFirstColumnLists(ESLVal arms) {
    
    {ESLVal isList = new ESLVal(new Function(new ESLVal("isList"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPCons(head.apply(armPatterns(a))).or(isPNil(head.apply(armPatterns(a))));
          }
        });
      
      return forall.apply(isList,arms);
    }
  }
  private static ESLVal isFirstColumnLists = new ESLVal(new Function(new ESLVal("isFirstColumnLists"),null) { public ESLVal apply(ESLVal... args) { return isFirstColumnLists(args[0]); }});
  private static ESLVal dropPattern(ESLVal arm) {
    
    return setArmPatterns(arm,tail.apply(armPatterns(arm)));
  }
  private static ESLVal dropPattern = new ESLVal(new Function(new ESLVal("dropPattern"),null) { public ESLVal apply(ESLVal... args) { return dropPattern(args[0]); }});
  private static ESLVal firstVarNames(ESLVal arms) {
    
    return map(new ESLVal(new Function(new ESLVal("fun439"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return pVarName(head.apply(armPatterns(a)));
        }
      }),arms);
  }
  private static ESLVal firstVarNames = new ESLVal(new Function(new ESLVal("firstVarNames"),null) { public ESLVal apply(ESLVal... args) { return firstVarNames(args[0]); }});
  private static ESLVal sharedCnstr(ESLVal arms) {
    
    return pTermName(head.apply(armPatterns(head.apply(arms))));
  }
  private static ESLVal sharedCnstr = new ESLVal(new Function(new ESLVal("sharedCnstr"),null) { public ESLVal apply(ESLVal... args) { return sharedCnstr(args[0]); }});
  private static ESLVal sharedInt(ESLVal arms) {
    
    return pIntValue(head.apply(armPatterns(head.apply(arms))));
  }
  private static ESLVal sharedInt = new ESLVal(new Function(new ESLVal("sharedInt"),null) { public ESLVal apply(ESLVal... args) { return sharedInt(args[0]); }});
  private static ESLVal sharedStr(ESLVal arms) {
    
    return pStrValue(head.apply(armPatterns(head.apply(arms))));
  }
  private static ESLVal sharedStr = new ESLVal(new Function(new ESLVal("sharedStr"),null) { public ESLVal apply(ESLVal... args) { return sharedStr(args[0]); }});
  private static ESLVal sharedBool(ESLVal arms) {
    
    return pBoolValue(head.apply(armPatterns(head.apply(arms))));
  }
  private static ESLVal sharedBool = new ESLVal(new Function(new ESLVal("sharedBool"),null) { public ESLVal apply(ESLVal... args) { return sharedBool(args[0]); }});
  private static ESLVal bindVarsBody(ESLVal e,ESLVal vNames) {
    
    return new ESLVal(new Function(new ESLVal("fun440"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal arms = $args[0];
      { LetRec letrec = new LetRec() {
            ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1938 = $args[0];
              ESLVal _v1939 = $args[1];
              {ESLVal _v1919 = _v1938;
                    ESLVal _v1920 = _v1939;
                    
                    if(_v1919.isCons())
                    {ESLVal $3866 = _v1919.head();
                      ESLVal $3867 = _v1919.tail();
                      
                      if(_v1920.isCons())
                      {ESLVal $3868 = _v1920.head();
                        ESLVal $3869 = _v1920.tail();
                        
                        {ESLVal a = $3866;
                        
                        {ESLVal _v1940 = $3867;
                        
                        {ESLVal v = $3868;
                        
                        {ESLVal _v1941 = $3869;
                        
                        {ESLVal _v1921 = e;
                        
                        switch(_v1921.termName) {
                        case "Var": {ESLVal $3873 = _v1921.termRef(0);
                          ESLVal $3872 = _v1921.termRef(1);
                          
                          {ESLVal l = $3873;
                          
                          {ESLVal n = $3872;
                          
                          if(n.eql(v).boolVal)
                          return bind.apply(_v1940,_v1941).cons(a);
                          else
                            {ESLVal _v1942 = _v1921;
                              
                              return bind.apply(_v1940,_v1941).cons(addArmBindings(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v1942))));
                            }
                        }
                        }
                        }
                        default: {ESLVal _v1943 = _v1921;
                          
                          return bind.apply(_v1940,_v1941).cons(addArmBindings(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v1943))));
                        }
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                    else if(_v1920.isNil())
                      return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v1919,_v1920)));
                    else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v1919,_v1920)));
                    }
                  else if(_v1919.isNil())
                    if(_v1920.isCons())
                      {ESLVal $3870 = _v1920.head();
                        ESLVal $3871 = _v1920.tail();
                        
                        return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v1919,_v1920)));
                      }
                    else if(_v1920.isNil())
                      return $nil;
                    else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v1919,_v1920)));
                  else return error(new ESLVal("case error at Pos(13825,14135)").add(ESLVal.list(_v1919,_v1920)));
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
          
            return bind.apply(arms,vNames);}
          
        }
      });
  }
  private static ESLVal bindVarsBody = new ESLVal(new Function(new ESLVal("bindVarsBody"),null) { public ESLVal apply(ESLVal... args) { return bindVarsBody(args[0],args[1]); }});
  private static ESLVal bindVars(ESLVal e,ESLVal arms) {
    
    return bindVarsBody(e,firstVarNames(arms)).apply(map(dropPattern,arms));
  }
  private static ESLVal bindVars = new ESLVal(new Function(new ESLVal("bindVars"),null) { public ESLVal apply(ESLVal... args) { return bindVars(args[0],args[1]); }});
  private static ESLVal cnstrArms(ESLVal c,ESLVal arms) {
    
    return filter(new ESLVal(new Function(new ESLVal("fun441"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return pTermName(head.apply(armPatterns(a))).eql(c);
        }
      }),arms);
  }
  private static ESLVal cnstrArms = new ESLVal(new Function(new ESLVal("cnstrArms"),null) { public ESLVal apply(ESLVal... args) { return cnstrArms(args[0],args[1]); }});
  private static ESLVal intArms(ESLVal n,ESLVal arms) {
    
    return filter(new ESLVal(new Function(new ESLVal("fun442"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return pIntValue(head.apply(armPatterns(a))).eql(n);
        }
      }),arms);
  }
  private static ESLVal intArms = new ESLVal(new Function(new ESLVal("intArms"),null) { public ESLVal apply(ESLVal... args) { return intArms(args[0],args[1]); }});
  private static ESLVal strArms(ESLVal s,ESLVal arms) {
    
    return filter(new ESLVal(new Function(new ESLVal("fun443"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return pStrValue(head.apply(armPatterns(a))).eql(s);
        }
      }),arms);
  }
  private static ESLVal strArms = new ESLVal(new Function(new ESLVal("strArms"),null) { public ESLVal apply(ESLVal... args) { return strArms(args[0],args[1]); }});
  private static ESLVal boolArms(ESLVal b,ESLVal arms) {
    
    return filter(new ESLVal(new Function(new ESLVal("fun444"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return pBoolValue(head.apply(armPatterns(a))).eql(b);
        }
      }),arms);
  }
  private static ESLVal boolArms = new ESLVal(new Function(new ESLVal("boolArms"),null) { public ESLVal apply(ESLVal... args) { return boolArms(args[0],args[1]); }});
  private static ESLVal fieldBindings(ESLVal e,ESLVal names) {
    
    return new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal n = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Binding",loc0,n,voidType,voidType,new ESLVal("TermRef",e,indexOf(n,names))));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(names);
  }
  private static ESLVal fieldBindings = new ESLVal(new Function(new ESLVal("fieldBindings"),null) { public ESLVal apply(ESLVal... args) { return fieldBindings(args[0],args[1]); }});
  private static ESLVal explodeCnstr(ESLVal a) {
    
    return setArmPatterns(a,pTermArgs(head.apply(armPatterns(a))).add(tail.apply(armPatterns(a))));
  }
  private static ESLVal explodeCnstr = new ESLVal(new Function(new ESLVal("explodeCnstr"),null) { public ESLVal apply(ESLVal... args) { return explodeCnstr(args[0]); }});
  private static ESLVal explodeCons(ESLVal a) {
    
    return setArmPatterns(a,ESLVal.list(pConsHead(head.apply(armPatterns(a))),pConsTail(head.apply(armPatterns(a)))).add(tail.apply(armPatterns(a))));
  }
  private static ESLVal explodeCons = new ESLVal(new Function(new ESLVal("explodeCons"),null) { public ESLVal apply(ESLVal... args) { return explodeCons(args[0]); }});
  private static ESLVal explodeSetCons(ESLVal a) {
    
    return setArmPatterns(a,ESLVal.list(pSetConsHead(head.apply(armPatterns(a))),pSetConsTail(head.apply(armPatterns(a)))).add(tail.apply(armPatterns(a))));
  }
  private static ESLVal explodeSetCons = new ESLVal(new Function(new ESLVal("explodeSetCons"),null) { public ESLVal apply(ESLVal... args) { return explodeSetCons(args[0]); }});
  private static ESLVal explodeAdd(ESLVal a) {
    
    return setArmPatterns(a,ESLVal.list(pAddLeft(head.apply(armPatterns(a))),pAddRight(head.apply(armPatterns(a)))).add(tail.apply(armPatterns(a))));
  }
  private static ESLVal explodeAdd = new ESLVal(new Function(new ESLVal("explodeAdd"),null) { public ESLVal apply(ESLVal... args) { return explodeAdd(args[0]); }});
  private static ESLVal cnstrArm(ESLVal l,ESLVal e,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal names = newVars(length.apply(pTermArgs(head.apply(armPatterns(head.apply(arms))))));
      
      return new ESLVal("Let",loc0,fieldBindings(e,names),compileCase(l,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal n = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Var",loc0,n));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(names).add(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(explodeCnstr(a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(arms),alt));
    }
  }
  private static ESLVal cnstrArm = new ESLVal(new Function(new ESLVal("cnstrArm"),null) { public ESLVal apply(ESLVal... args) { return cnstrArm(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal processCnstrs(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal cnstrs = removeDups(map(pTermName,map(head,map(armPatterns,arms))));
      
      {ESLVal armss = map(new ESLVal(new Function(new ESLVal("fun445"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal c = $args[0];
        return cnstrArms(c,arms);
          }
        }),cnstrs);
      
      return new ESLVal("CaseTerm",l,head.apply(es),createTArms(l,armss,es,alt),alt);
    }
    }
  }
  private static ESLVal processCnstrs = new ESLVal(new Function(new ESLVal("processCnstrs"),null) { public ESLVal apply(ESLVal... args) { return processCnstrs(args[0],args[1],args[2],args[3]); }});
  private static ESLVal createTArms(ESLVal l,ESLVal armss,ESLVal es,ESLVal alt) {
    
    {ESLVal _v1922 = armss;
      
      if(_v1922.isCons())
      {ESLVal $3874 = _v1922.head();
        ESLVal $3875 = _v1922.tail();
        
        {ESLVal as = $3874;
        
        {ESLVal _v1937 = $3875;
        
        return createTArms(l,_v1937,es,alt).cons(new ESLVal("TArm",sharedCnstr(as),cnstrArm(l,head.apply(es),tail.apply(es),as,alt)));
      }
      }
      }
    else if(_v1922.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(16496,16676)").add(ESLVal.list(_v1922)));
    }
  }
  private static ESLVal createTArms = new ESLVal(new Function(new ESLVal("createTArms"),null) { public ESLVal apply(ESLVal... args) { return createTArms(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processConsArms(ESLVal loc,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal l = head.apply(es);
      ESLVal hn = newVar();
      ESLVal tn = newVar();
      
      {ESLVal hp = new ESLVal("PVar",loc0,hn,voidType);
      ESLVal tp = new ESLVal("PVar",loc0,tn,voidType);
      ESLVal hv = new ESLVal("Var",loc0,hn);
      ESLVal tv = new ESLVal("Var",loc0,tn);
      
      return new ESLVal("Let",loc0,ESLVal.list(new ESLVal("Binding",loc0,hn,voidType,voidType,new ESLVal("Head",l)),new ESLVal("Binding",loc0,tn,voidType,voidType,new ESLVal("Tail",l))),compileCase(loc,ESLVal.list(hv,tv).add(tail.apply(es)),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(explodeCons(a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(arms),alt));
    }
    }
  }
  private static ESLVal processConsArms = new ESLVal(new Function(new ESLVal("processConsArms"),null) { public ESLVal apply(ESLVal... args) { return processConsArms(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processLists(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal consArms = filter(new ESLVal(new Function(new ESLVal("fun446"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPCons(head.apply(armPatterns(a)));
          }
        }),arms);
      ESLVal nilArms = map(dropPattern,filter(new ESLVal(new Function(new ESLVal("fun447"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPNil(head.apply(armPatterns(a)));
          }
        }),arms));
      
      return new ESLVal("CaseList",l,head.apply(es),processConsArms(l,es,consArms,alt),compileCase(l,tail.apply(es),nilArms,alt),alt);
    }
  }
  private static ESLVal processLists = new ESLVal(new Function(new ESLVal("processLists"),null) { public ESLVal apply(ESLVal... args) { return processLists(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processSetArms(ESLVal l,ESLVal es,ESLVal arm) {
    
    {ESLVal _v1923 = head.apply(armPatterns(arm));
      
      switch(_v1923.termName) {
      case "PEmptySet": {ESLVal $3882 = _v1923.termRef(0);
        
        {ESLVal pl = $3882;
        
        {ESLVal fail = newVar();
        
        return new ESLVal("Term",l,new ESLVal("$empty"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("emptyset")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,es,ESLVal.list(dropPattern(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
      }
      }
      }
    case "PSetCons": {ESLVal $3881 = _v1923.termRef(0);
        ESLVal $3880 = _v1923.termRef(1);
        ESLVal $3879 = _v1923.termRef(2);
        
        {ESLVal pl = $3881;
        
        {ESLVal p1 = $3880;
        
        {ESLVal p2 = $3879;
        
        {ESLVal fail = newVar();
        ESLVal element = newVar();
        ESLVal rest = newVar();
        
        return new ESLVal("Term",l,new ESLVal("$cons"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setcons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeSetCons(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
      }
      }
      }
      }
      }
    case "PAdd": {ESLVal $3878 = _v1923.termRef(0);
        ESLVal $3877 = _v1923.termRef(1);
        ESLVal $3876 = _v1923.termRef(2);
        
        {ESLVal pl = $3878;
        
        {ESLVal p1 = $3877;
        
        {ESLVal p2 = $3876;
        
        {ESLVal fail = newVar();
        ESLVal left = newVar();
        ESLVal right = newVar();
        
        return new ESLVal("Term",l,new ESLVal("$add"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setadd")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(explodeAdd(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(17621,18742)").add(ESLVal.list(_v1923)));
    }
    }
  }
  private static ESLVal processSetArms = new ESLVal(new Function(new ESLVal("processSetArms"),null) { public ESLVal apply(ESLVal... args) { return processSetArms(args[0],args[1],args[2]); }});
  private static ESLVal processNonDetListArms(ESLVal l,ESLVal es,ESLVal arm) {
    
    {ESLVal _v1924 = head.apply(armPatterns(arm));
      
      switch(_v1924.termName) {
      case "PNil": {ESLVal $3911 = _v1924.termRef(0);
        
        {ESLVal pl = $3911;
        
        {ESLVal fail = newVar();
        
        return new ESLVal("Term",l,new ESLVal("$empty"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("nil")),ESLVal.list(new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,es,ESLVal.list(dropPattern(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
      }
      }
      }
    case "PCons": {ESLVal $3910 = _v1924.termRef(0);
        ESLVal $3909 = _v1924.termRef(1);
        ESLVal $3908 = _v1924.termRef(2);
        
        {ESLVal pl = $3910;
        
        {ESLVal p1 = $3909;
        
        {ESLVal p2 = $3908;
        
        {ESLVal fail = newVar();
        ESLVal element = newVar();
        ESLVal rest = newVar();
        
        return new ESLVal("Term",l,new ESLVal("$cons"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("cons")),ESLVal.list(new ESLVal("Dec",l,element,$null,$null),new ESLVal("Dec",l,rest,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,element),new ESLVal("Var",l,rest)).add(es),ESLVal.list(explodeCons(arm)),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
      }
      }
      }
      }
      }
    case "PAdd": {ESLVal $3885 = _v1924.termRef(0);
        ESLVal $3884 = _v1924.termRef(1);
        ESLVal $3883 = _v1924.termRef(2);
        
        switch($3884.termName) {
        case "PCons": {ESLVal $3906 = $3884.termRef(0);
          ESLVal $3905 = $3884.termRef(1);
          ESLVal $3904 = $3884.termRef(2);
          
          switch($3904.termName) {
          case "PNil": {ESLVal $3907 = $3904.termRef(0);
            
            {ESLVal l1 = $3885;
            
            {ESLVal l2 = $3906;
            
            {ESLVal p1 = $3905;
            
            {ESLVal l3 = $3907;
            
            {ESLVal p2 = $3883;
            
            {ESLVal fail = newVar();
            ESLVal left = newVar();
            ESLVal right = newVar();
            ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns(arm))));
            
            return new ESLVal("Term",l,new ESLVal("$selectLeft"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
          }
          }
          }
          }
          }
          }
          }
          default: switch($3883.termName) {
            case "PCons": {ESLVal $3895 = $3883.termRef(0);
              ESLVal $3894 = $3883.termRef(1);
              ESLVal $3893 = $3883.termRef(2);
              
              switch($3893.termName) {
              case "PNil": {ESLVal $3896 = $3893.termRef(0);
                
                {ESLVal l1 = $3885;
                
                {ESLVal p1 = $3884;
                
                {ESLVal l2 = $3895;
                
                {ESLVal p2 = $3894;
                
                {ESLVal l3 = $3896;
                
                {ESLVal fail = newVar();
                ESLVal left = newVar();
                ESLVal right = newVar();
                ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns(arm))));
                
                return new ESLVal("Term",l,new ESLVal("$selectRight"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
            }
          case "PAdd": {ESLVal $3888 = $3883.termRef(0);
              ESLVal $3887 = $3883.termRef(1);
              ESLVal $3886 = $3883.termRef(2);
              
              switch($3887.termName) {
              case "PCons": {ESLVal $3891 = $3887.termRef(0);
                ESLVal $3890 = $3887.termRef(1);
                ESLVal $3889 = $3887.termRef(2);
                
                switch($3889.termName) {
                case "PNil": {ESLVal $3892 = $3889.termRef(0);
                  
                  {ESLVal l1 = $3885;
                  
                  {ESLVal p1 = $3884;
                  
                  {ESLVal l2 = $3888;
                  
                  {ESLVal l3 = $3891;
                  
                  {ESLVal p2 = $3890;
                  
                  {ESLVal l4 = $3892;
                  
                  {ESLVal p3 = $3886;
                  
                  {ESLVal fail = newVar();
                  ESLVal left = newVar();
                  ESLVal mid = newVar();
                  ESLVal right = newVar();
                  ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectMid"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
                }
                }
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
          }
        }
        }
      case "PAdd": {ESLVal $3899 = $3884.termRef(0);
          ESLVal $3898 = $3884.termRef(1);
          ESLVal $3897 = $3884.termRef(2);
          
          switch($3897.termName) {
          case "PCons": {ESLVal $3902 = $3897.termRef(0);
            ESLVal $3901 = $3897.termRef(1);
            ESLVal $3900 = $3897.termRef(2);
            
            switch($3900.termName) {
            case "PNil": {ESLVal $3903 = $3900.termRef(0);
              
              {ESLVal l1 = $3885;
              
              {ESLVal l2 = $3899;
              
              {ESLVal p1 = $3898;
              
              {ESLVal l3 = $3902;
              
              {ESLVal p2 = $3901;
              
              {ESLVal l4 = $3903;
              
              {ESLVal p3 = $3883;
              
              {ESLVal fail = newVar();
              ESLVal left = newVar();
              ESLVal mid = newVar();
              ESLVal right = newVar();
              ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2,p3).add(armPatterns(arm)));
              
              return new ESLVal("Term",l,new ESLVal("$selectMid"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
            }
            }
            }
            }
            }
            }
            }
            }
            }
            default: switch($3883.termName) {
              case "PCons": {ESLVal $3895 = $3883.termRef(0);
                ESLVal $3894 = $3883.termRef(1);
                ESLVal $3893 = $3883.termRef(2);
                
                switch($3893.termName) {
                case "PNil": {ESLVal $3896 = $3893.termRef(0);
                  
                  {ESLVal l1 = $3885;
                  
                  {ESLVal p1 = $3884;
                  
                  {ESLVal l2 = $3895;
                  
                  {ESLVal p2 = $3894;
                  
                  {ESLVal l3 = $3896;
                  
                  {ESLVal fail = newVar();
                  ESLVal left = newVar();
                  ESLVal right = newVar();
                  ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectRight"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
              }
              }
            case "PAdd": {ESLVal $3888 = $3883.termRef(0);
                ESLVal $3887 = $3883.termRef(1);
                ESLVal $3886 = $3883.termRef(2);
                
                switch($3887.termName) {
                case "PCons": {ESLVal $3891 = $3887.termRef(0);
                  ESLVal $3890 = $3887.termRef(1);
                  ESLVal $3889 = $3887.termRef(2);
                  
                  switch($3889.termName) {
                  case "PNil": {ESLVal $3892 = $3889.termRef(0);
                    
                    {ESLVal l1 = $3885;
                    
                    {ESLVal p1 = $3884;
                    
                    {ESLVal l2 = $3888;
                    
                    {ESLVal l3 = $3891;
                    
                    {ESLVal p2 = $3890;
                    
                    {ESLVal l4 = $3892;
                    
                    {ESLVal p3 = $3886;
                    
                    {ESLVal fail = newVar();
                    ESLVal left = newVar();
                    ESLVal mid = newVar();
                    ESLVal right = newVar();
                    ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns(arm))));
                    
                    return new ESLVal("Term",l,new ESLVal("$selectMid"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
          }
          }
          default: switch($3883.termName) {
            case "PCons": {ESLVal $3895 = $3883.termRef(0);
              ESLVal $3894 = $3883.termRef(1);
              ESLVal $3893 = $3883.termRef(2);
              
              switch($3893.termName) {
              case "PNil": {ESLVal $3896 = $3893.termRef(0);
                
                {ESLVal l1 = $3885;
                
                {ESLVal p1 = $3884;
                
                {ESLVal l2 = $3895;
                
                {ESLVal p2 = $3894;
                
                {ESLVal l3 = $3896;
                
                {ESLVal fail = newVar();
                ESLVal left = newVar();
                ESLVal right = newVar();
                ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns(arm))));
                
                return new ESLVal("Term",l,new ESLVal("$selectRight"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
            }
          case "PAdd": {ESLVal $3888 = $3883.termRef(0);
              ESLVal $3887 = $3883.termRef(1);
              ESLVal $3886 = $3883.termRef(2);
              
              switch($3887.termName) {
              case "PCons": {ESLVal $3891 = $3887.termRef(0);
                ESLVal $3890 = $3887.termRef(1);
                ESLVal $3889 = $3887.termRef(2);
                
                switch($3889.termName) {
                case "PNil": {ESLVal $3892 = $3889.termRef(0);
                  
                  {ESLVal l1 = $3885;
                  
                  {ESLVal p1 = $3884;
                  
                  {ESLVal l2 = $3888;
                  
                  {ESLVal l3 = $3891;
                  
                  {ESLVal p2 = $3890;
                  
                  {ESLVal l4 = $3892;
                  
                  {ESLVal p3 = $3886;
                  
                  {ESLVal fail = newVar();
                  ESLVal left = newVar();
                  ESLVal mid = newVar();
                  ESLVal right = newVar();
                  ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns(arm))));
                  
                  return new ESLVal("Term",l,new ESLVal("$selectMid"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
                }
                }
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
          }
        }
        }
        default: switch($3883.termName) {
          case "PCons": {ESLVal $3895 = $3883.termRef(0);
            ESLVal $3894 = $3883.termRef(1);
            ESLVal $3893 = $3883.termRef(2);
            
            switch($3893.termName) {
            case "PNil": {ESLVal $3896 = $3893.termRef(0);
              
              {ESLVal l1 = $3885;
              
              {ESLVal p1 = $3884;
              
              {ESLVal l2 = $3895;
              
              {ESLVal p2 = $3894;
              
              {ESLVal l3 = $3896;
              
              {ESLVal fail = newVar();
              ESLVal left = newVar();
              ESLVal right = newVar();
              ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2).add(tail.apply(armPatterns(arm))));
              
              return new ESLVal("Term",l,new ESLVal("$selectRight"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
          }
          }
        case "PAdd": {ESLVal $3888 = $3883.termRef(0);
            ESLVal $3887 = $3883.termRef(1);
            ESLVal $3886 = $3883.termRef(2);
            
            switch($3887.termName) {
            case "PCons": {ESLVal $3891 = $3887.termRef(0);
              ESLVal $3890 = $3887.termRef(1);
              ESLVal $3889 = $3887.termRef(2);
              
              switch($3889.termName) {
              case "PNil": {ESLVal $3892 = $3889.termRef(0);
                
                {ESLVal l1 = $3885;
                
                {ESLVal p1 = $3884;
                
                {ESLVal l2 = $3888;
                
                {ESLVal l3 = $3891;
                
                {ESLVal p2 = $3890;
                
                {ESLVal l4 = $3892;
                
                {ESLVal p3 = $3886;
                
                {ESLVal fail = newVar();
                ESLVal left = newVar();
                ESLVal mid = newVar();
                ESLVal right = newVar();
                ESLVal newArm = setArmPatterns(arm,ESLVal.list(p1,p2,p3).add(tail.apply(armPatterns(arm))));
                
                return new ESLVal("Term",l,new ESLVal("$selectMid"),$nil,ESLVal.list(new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("add")),ESLVal.list(new ESLVal("Dec",l,left,$null,$null),new ESLVal("Dec",l,mid,$null,$null),new ESLVal("Dec",l,right,$null,$null),new ESLVal("Dec",l,fail,$null,$null)),$null,compileCase(l,ESLVal.list(new ESLVal("Var",l,left),new ESLVal("Var",l,mid),new ESLVal("Var",l,right)).add(es),ESLVal.list(newArm),new ESLVal("Apply",l,new ESLVal("Var",l,fail),$nil)))));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
            }
            }
            default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
          }
          }
          default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
        }
      }
      }
      default: return error(new ESLVal("case error at Pos(18804,21622)").add(ESLVal.list(_v1924)));
    }
    }
  }
  private static ESLVal processNonDetListArms = new ESLVal(new Function(new ESLVal("processNonDetListArms"),null) { public ESLVal apply(ESLVal... args) { return processNonDetListArms(args[0],args[1],args[2]); }});
  private static ESLVal processInts(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal ints = removeDups(map(pIntValue,map(head,map(armPatterns,arms))));
      
      {ESLVal armss = map(new ESLVal(new Function(new ESLVal("fun448"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal c = $args[0];
        return intArms(c,arms);
          }
        }),ints);
      
      return new ESLVal("CaseInt",l,head.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal as = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("IArm",sharedInt(as),compileCase(l,tail.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(dropPattern(a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(as),alt)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(armss),alt);
    }
    }
  }
  private static ESLVal processInts = new ESLVal(new Function(new ESLVal("processInts"),null) { public ESLVal apply(ESLVal... args) { return processInts(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processStrs(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal strs = removeDups(map(pStrValue,map(head,map(armPatterns,arms))));
      
      {ESLVal armss = map(new ESLVal(new Function(new ESLVal("fun449"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal c = $args[0];
        return strArms(c,arms);
          }
        }),strs);
      
      return new ESLVal("CaseStr",l,head.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal as = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("SArm",sharedStr(as),compileCase(l,tail.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(dropPattern(a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(as),alt)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(armss),alt);
    }
    }
  }
  private static ESLVal processStrs = new ESLVal(new Function(new ESLVal("processStrs"),null) { public ESLVal apply(ESLVal... args) { return processStrs(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processBools(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal bools = removeDups(map(pBoolValue,map(head,map(armPatterns,arms))));
      
      {ESLVal armss = map(new ESLVal(new Function(new ESLVal("fun450"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal c = $args[0];
        return boolArms(c,arms);
          }
        }),bools);
      
      return new ESLVal("CaseBool",l,head.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal as = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("BoolArm",sharedBool(as),compileCase(l,tail.apply(es),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(dropPattern(a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(as),alt)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(armss),alt);
    }
    }
  }
  private static ESLVal processBools = new ESLVal(new Function(new ESLVal("processBools"),null) { public ESLVal apply(ESLVal... args) { return processBools(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processSets(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal f = new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("setFail")),$nil,$null,alt);
      
      return new ESLVal("CaseSet",l,head.apply(es),new ESLVal("List",l,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(processSetArms(l,tail.apply(es),a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(arms)),f);
    }
  }
  private static ESLVal processSets = new ESLVal(new Function(new ESLVal("processSets"),null) { public ESLVal apply(ESLVal... args) { return processSets(args[0],args[1],args[2],args[3]); }});
  private static ESLVal processNonDetLists(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {print.apply(new ESLVal("process nondet lists ").add(es.add(new ESLVal(" ").add(arms))));
    {ESLVal f = new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("listFail")),$nil,$null,alt);
      
      return new ESLVal("CaseAdd",l,head.apply(es),new ESLVal("List",l,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal a = $l0.head();
            $l0 = $l0.tail();
            $v.add(processNonDetListArms(l,tail.apply(es),a));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(arms)),f);
    }}
  }
  private static ESLVal processNonDetLists = new ESLVal(new Function(new ESLVal("processNonDetLists"),null) { public ESLVal apply(ESLVal... args) { return processNonDetLists(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitTerms(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun451"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPTerm(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun452"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPTerm(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitTerms = new ESLVal(new Function(new ESLVal("splitTerms"),null) { public ESLVal apply(ESLVal... args) { return splitTerms(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitLists(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun453"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPList(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun454"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPList(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitLists = new ESLVal(new Function(new ESLVal("splitLists"),null) { public ESLVal apply(ESLVal... args) { return splitLists(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitAdd(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun455"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPAdd(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun456"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPAdd(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitAdd = new ESLVal(new Function(new ESLVal("splitAdd"),null) { public ESLVal apply(ESLVal... args) { return splitAdd(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitSets(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun457"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPSet(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun458"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPSet(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitSets = new ESLVal(new Function(new ESLVal("splitSets"),null) { public ESLVal apply(ESLVal... args) { return splitSets(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitInts(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun459"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPInt(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun460"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPInt(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitInts = new ESLVal(new Function(new ESLVal("splitInts"),null) { public ESLVal apply(ESLVal... args) { return splitInts(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitStrs(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun461"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPStr(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun462"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPStr(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitStrs = new ESLVal(new Function(new ESLVal("splitStrs"),null) { public ESLVal apply(ESLVal... args) { return splitStrs(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitBools(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun463"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPBool(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun464"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPBool(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitBools = new ESLVal(new Function(new ESLVal("splitBools"),null) { public ESLVal apply(ESLVal... args) { return splitBools(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitVars(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    return compileCase(l,es,select(new ESLVal(new Function(new ESLVal("fun465"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPVar(head.apply(armPatterns(a)));
        }
      }),arms),compileCase(l,es,reject(new ESLVal(new Function(new ESLVal("fun466"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return isPVar(head.apply(armPatterns(a)));
        }
      }),arms),alt));
  }
  private static ESLVal splitVars = new ESLVal(new Function(new ESLVal("splitVars"),null) { public ESLVal apply(ESLVal... args) { return splitVars(args[0],args[1],args[2],args[3]); }});
  private static ESLVal splitCase(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    {ESLVal firstPatterns = map(head,map(armPatterns,arms));
      
      {ESLVal nonVarPatterns = filter(new ESLVal(new Function(new ESLVal("fun467"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        return isPVar(p).not();
          }
        }),firstPatterns);
      
      if(isPTerm(head.apply(nonVarPatterns)).boolVal)
      return splitTerms(l,es,arms,alt);
      else
        if(isPList(head.apply(nonVarPatterns)).boolVal)
          return splitLists(l,es,arms,alt);
          else
            if(isPSet(head.apply(nonVarPatterns)).boolVal)
              return splitSets(l,es,arms,alt);
              else
                if(isPInt(head.apply(nonVarPatterns)).boolVal)
                  return splitInts(l,es,arms,alt);
                  else
                    if(isPStr(head.apply(nonVarPatterns)).boolVal)
                      return splitStrs(l,es,arms,alt);
                      else
                        if(isPBool(head.apply(nonVarPatterns)).boolVal)
                          return splitBools(l,es,arms,alt);
                          else
                            if(isPVar(head.apply(firstPatterns)).boolVal)
                              return splitVars(l,es,arms,alt);
                              else
                                if(isPAdd(head.apply(firstPatterns)).boolVal)
                                  return splitAdd(l,es,arms,alt);
                                  else
                                    return error(new ESLVal("unknown split case: ").add(arms));
    }
    }
  }
  private static ESLVal splitCase = new ESLVal(new Function(new ESLVal("splitCase"),null) { public ESLVal apply(ESLVal... args) { return splitCase(args[0],args[1],args[2],args[3]); }});
  private static ESLVal compileCase(ESLVal l,ESLVal es,ESLVal arms,ESLVal alt) {
    
    if(arms.eql($nil).boolVal)
      return alt;
      else
        if(isEmptyPatterns(arms).boolVal)
          return foldArms(l,arms,alt);
          else
            if(isFirstColumnVars(arms).boolVal)
              return compileCase(l,tail.apply(es),bindVars(head.apply(es),arms),alt);
              else
                if(isFirstColumnCnstrs(arms).boolVal)
                  return processCnstrs(l,es,arms,alt);
                  else
                    if(isFirstColumnLists(arms).boolVal)
                      return processLists(l,es,arms,alt);
                      else
                        if(isFirstColumnInts(arms).boolVal)
                          return processInts(l,es,arms,alt);
                          else
                            if(isFirstColumnBools(arms).boolVal)
                              return processBools(l,es,arms,alt);
                              else
                                if(isFirstColumnStrs(arms).boolVal)
                                  return processStrs(l,es,arms,alt);
                                  else
                                    if(isFirstColumnSets(arms).boolVal)
                                      return processSets(l,es,arms,alt);
                                      else
                                        if(isFirstColumnNonDetLists(arms).boolVal)
                                          return processNonDetLists(l,es,arms,alt);
                                          else
                                            return splitCase(l,es,arms,alt);
  }
  private static ESLVal compileCase = new ESLVal(new Function(new ESLVal("compileCase"),null) { public ESLVal apply(ESLVal... args) { return compileCase(args[0],args[1],args[2],args[3]); }});
  private static ESLVal foldArms(ESLVal l,ESLVal arms,ESLVal alt) {
    
    {ESLVal _v1925 = arms;
      
      if(_v1925.isCons())
      {ESLVal $3912 = _v1925.head();
        ESLVal $3913 = _v1925.tail();
        
        switch($3912.termName) {
        case "LArm": {ESLVal $3918 = $3912.termRef(0);
          ESLVal $3917 = $3912.termRef(1);
          ESLVal $3916 = $3912.termRef(2);
          ESLVal $3915 = $3912.termRef(3);
          ESLVal $3914 = $3912.termRef(4);
          
          if($3917.isCons())
          {ESLVal $3919 = $3917.head();
            ESLVal $3920 = $3917.tail();
            
            return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v1925)));
          }
        else if($3917.isNil())
          {ESLVal al = $3918;
            
            {ESLVal bs = $3916;
            
            {ESLVal g = $3915;
            
            {ESLVal e = $3914;
            
            {ESLVal _v1936 = $3913;
            
            return foldArm(al,bs,g,e,foldArms(l,_v1936,alt));
          }
          }
          }
          }
          }
        else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v1925)));
        }
        default: return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v1925)));
      }
      }
    else if(_v1925.isNil())
      return alt;
    else return error(new ESLVal("case error at Pos(27421,27577)").add(ESLVal.list(_v1925)));
    }
  }
  private static ESLVal foldArms = new ESLVal(new Function(new ESLVal("foldArms"),null) { public ESLVal apply(ESLVal... args) { return foldArms(args[0],args[1],args[2]); }});
  private static ESLVal foldArm(ESLVal l,ESLVal bss,ESLVal g,ESLVal e,ESLVal alt) {
    
    {ESLVal _v1926 = bss;
      
      if(_v1926.isCons())
      {ESLVal $3921 = _v1926.head();
        ESLVal $3922 = _v1926.tail();
        
        {ESLVal bs = $3921;
        
        {ESLVal _v1933 = $3922;
        
        return new ESLVal("Let",l,bs,foldArm(l,_v1933,g,e,alt));
      }
      }
      }
    else if(_v1926.isNil())
      {ESLVal _v1927 = g;
        
        switch(_v1927.termName) {
        case "BoolExp": {ESLVal $3924 = _v1927.termRef(0);
          ESLVal $3923 = _v1927.termRef(1);
          
          switch($3923.boolVal ? 1 : 0) {
          case 1: {ESLVal bl = $3924;
            
            return e;
          }
          default: {ESLVal _v1934 = _v1927;
            
            return new ESLVal("If",l,_v1934,e,alt);
          }
        }
        }
        default: {ESLVal _v1935 = _v1927;
          
          return new ESLVal("If",l,_v1935,e,alt);
        }
      }
      }
    else return error(new ESLVal("case error at Pos(27642,27842)").add(ESLVal.list(_v1926)));
    }
  }
  private static ESLVal foldArm = new ESLVal(new Function(new ESLVal("foldArm"),null) { public ESLVal apply(ESLVal... args) { return foldArm(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal translateQual(ESLVal q) {
    
    {ESLVal _v1928 = q;
      
      switch(_v1928.termName) {
      case "BQual": {ESLVal $3929 = _v1928.termRef(0);
        ESLVal $3928 = _v1928.termRef(1);
        ESLVal $3927 = _v1928.termRef(2);
        
        {ESLVal l = $3929;
        
        {ESLVal p = $3928;
        
        {ESLVal e = $3927;
        
        return new ESLVal("BQual",l,p,translateCases(e));
      }
      }
      }
      }
    case "PQual": {ESLVal $3926 = _v1928.termRef(0);
        ESLVal $3925 = _v1928.termRef(1);
        
        {ESLVal l = $3926;
        
        {ESLVal p = $3925;
        
        return new ESLVal("PQual",l,translateCases(p));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(27894,28031)").add(ESLVal.list(_v1928)));
    }
    }
  }
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),null) { public ESLVal apply(ESLVal... args) { return translateQual(args[0]); }});
  private static ESLVal translateArm(ESLVal a) {
    
    {ESLVal _v1929 = a;
      
      switch(_v1929.termName) {
      case "LArm": {ESLVal $3934 = _v1929.termRef(0);
        ESLVal $3933 = _v1929.termRef(1);
        ESLVal $3932 = _v1929.termRef(2);
        ESLVal $3931 = _v1929.termRef(3);
        ESLVal $3930 = _v1929.termRef(4);
        
        {ESLVal l = $3934;
        
        {ESLVal ps = $3933;
        
        {ESLVal bs = $3932;
        
        {ESLVal guard = $3931;
        
        {ESLVal e = $3930;
        
        return new ESLVal("LArm",l,ps,bs,translateCases(guard),translateCases(e));
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(28070,28203)").add(ESLVal.list(_v1929)));
    }
    }
  }
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),null) { public ESLVal apply(ESLVal... args) { return translateArm(args[0]); }});
  private static ESLVal translateDef(ESLVal b) {
    
    {ESLVal _v1930 = b;
      
      switch(_v1930.termName) {
      case "Binding": {ESLVal $3958 = _v1930.termRef(0);
        ESLVal $3957 = _v1930.termRef(1);
        ESLVal $3956 = _v1930.termRef(2);
        ESLVal $3955 = _v1930.termRef(3);
        ESLVal $3954 = _v1930.termRef(4);
        
        {ESLVal l = $3958;
        
        {ESLVal name = $3957;
        
        {ESLVal t = $3956;
        
        {ESLVal st = $3955;
        
        {ESLVal value = $3954;
        
        return new ESLVal("Binding",l,name,t,st,translateCases(value));
      }
      }
      }
      }
      }
      }
    case "TypeBind": {ESLVal $3953 = _v1930.termRef(0);
        ESLVal $3952 = _v1930.termRef(1);
        ESLVal $3951 = _v1930.termRef(2);
        ESLVal $3950 = _v1930.termRef(3);
        
        {ESLVal l = $3953;
        
        {ESLVal name = $3952;
        
        {ESLVal t = $3951;
        
        {ESLVal ignore = $3950;
        
        return b;
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $3949 = _v1930.termRef(0);
        ESLVal $3948 = _v1930.termRef(1);
        ESLVal $3947 = _v1930.termRef(2);
        ESLVal $3946 = _v1930.termRef(3);
        
        {ESLVal l = $3949;
        
        {ESLVal name = $3948;
        
        {ESLVal t = $3947;
        
        {ESLVal ignore = $3946;
        
        return b;
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $3945 = _v1930.termRef(0);
        ESLVal $3944 = _v1930.termRef(1);
        ESLVal $3943 = _v1930.termRef(2);
        ESLVal $3942 = _v1930.termRef(3);
        ESLVal $3941 = _v1930.termRef(4);
        ESLVal $3940 = _v1930.termRef(5);
        ESLVal $3939 = _v1930.termRef(6);
        
        {ESLVal l = $3945;
        
        {ESLVal n = $3944;
        
        {ESLVal args = $3943;
        
        {ESLVal t = $3942;
        
        {ESLVal st = $3941;
        
        {ESLVal body = $3940;
        
        {ESLVal guard = $3939;
        
        return new ESLVal("FunBind",l,n,args,t,st,translateCases(body),translateCases(guard));
      }
      }
      }
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $3938 = _v1930.termRef(0);
        ESLVal $3937 = _v1930.termRef(1);
        ESLVal $3936 = _v1930.termRef(2);
        ESLVal $3935 = _v1930.termRef(3);
        
        {ESLVal l = $3938;
        
        {ESLVal name = $3937;
        
        {ESLVal t = $3936;
        
        {ESLVal ignore = $3935;
        
        return b;
      }
      }
      }
      }
      }
      default: {ESLVal x = _v1930;
        
        return error(x);
      }
    }
    }
  }
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),null) { public ESLVal apply(ESLVal... args) { return translateDef(args[0]); }});
  private static ESLVal pterm(ESLVal n,ESLVal ps) {
    
    return new ESLVal("PTerm",loc0,n,$nil,ps);
  }
  private static ESLVal pterm = new ESLVal(new Function(new ESLVal("pterm"),null) { public ESLVal apply(ESLVal... args) { return pterm(args[0],args[1]); }});
  private static ESLVal pvar(ESLVal n) {
    
    return new ESLVal("PVar",loc0,n,voidType);
  }
  private static ESLVal pvar = new ESLVal(new Function(new ESLVal("pvar"),null) { public ESLVal apply(ESLVal... args) { return pvar(args[0]); }});
  private static ESLVal var(ESLVal n) {
    
    return new ESLVal("Var",loc0,n);
  }
  private static ESLVal var = new ESLVal(new Function(new ESLVal("var"),null) { public ESLVal apply(ESLVal... args) { return var(args[0]); }});
  private static ESLVal pcons(ESLVal h,ESLVal t) {
    
    return new ESLVal("PCons",loc0,h,t);
  }
  private static ESLVal pcons = new ESLVal(new Function(new ESLVal("pcons"),null) { public ESLVal apply(ESLVal... args) { return pcons(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}