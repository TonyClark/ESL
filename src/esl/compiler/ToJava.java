package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Tables.*;
// import static esl.Lists.*;
import static esl.compiler.Cases.*;
import static esl.compiler.Types.*;
import java.util.function.Supplier;
public class ToJava {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal defToField = new ESLVal(new Function(new ESLVal("defToField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v2010 = d;
        
        switch(_v2010.termName) {
        case "Binding": {ESLVal $2865 = _v2010.termRef(0);
          ESLVal $2864 = _v2010.termRef(1);
          ESLVal $2863 = _v2010.termRef(2);
          ESLVal $2862 = _v2010.termRef(3);
          ESLVal $2861 = _v2010.termRef(4);
          
          {ESLVal l = $2865;
          
          {ESLVal n = $2864;
          
          {ESLVal t = $2863;
          
          {ESLVal st = $2862;
          
          {ESLVal e = $2861;
          
          return new ESLVal("JField",n,$null,expToJExp.apply(e));
        }
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $2858 = _v2010.termRef(0);
          ESLVal $2857 = _v2010.termRef(1);
          ESLVal $2856 = _v2010.termRef(2);
          ESLVal $2855 = _v2010.termRef(3);
          ESLVal $2854 = _v2010.termRef(4);
          ESLVal $2853 = _v2010.termRef(5);
          ESLVal $2852 = _v2010.termRef(6);
          
          switch($2852.termName) {
          case "BoolExp": {ESLVal $2860 = $2852.termRef(0);
            ESLVal $2859 = $2852.termRef(1);
            
            switch($2859.boolVal ? 1 : 0) {
            case 1: {ESLVal l = $2858;
              
              {ESLVal n = $2857;
              
              {ESLVal args = $2856;
              
              {ESLVal t = $2855;
              
              {ESLVal st = $2854;
              
              {ESLVal e = $2853;
              
              {ESLVal bl = $2860;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v2011 = $qualArg;
                      
                      switch(_v2011.termName) {
                      case "PVar": {ESLVal $2868 = _v2011.termRef(0);
                        ESLVal $2867 = _v2011.termRef(1);
                        ESLVal $2866 = _v2011.termRef(2);
                        
                        {ESLVal _v2108 = $2868;
                        
                        {ESLVal _v2109 = $2867;
                        
                        {ESLVal _v2110 = $2866;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v2108,_v2109,_v2110,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v2011;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(args).flatten().flatten();
              
              return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,e)));
            }
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $2858;
              
              {ESLVal n = $2857;
              
              {ESLVal args = $2856;
              
              {ESLVal t = $2855;
              
              {ESLVal st = $2854;
              
              {ESLVal e = $2853;
              
              {ESLVal g = $2852;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v2012 = $qualArg;
                      
                      switch(_v2012.termName) {
                      case "PVar": {ESLVal $2871 = _v2012.termRef(0);
                        ESLVal $2870 = _v2012.termRef(1);
                        ESLVal $2869 = _v2012.termRef(2);
                        
                        {ESLVal _v2111 = $2871;
                        
                        {ESLVal _v2112 = $2870;
                        
                        {ESLVal _v2113 = $2869;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v2111,_v2112,_v2113,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v2012;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(args).flatten().flatten();
              
              return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
          default: {ESLVal l = $2858;
            
            {ESLVal n = $2857;
            
            {ESLVal args = $2856;
            
            {ESLVal t = $2855;
            
            {ESLVal st = $2854;
            
            {ESLVal e = $2853;
            
            {ESLVal g = $2852;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v2013 = $qualArg;
                    
                    switch(_v2013.termName) {
                    case "PVar": {ESLVal $2874 = _v2013.termRef(0);
                      ESLVal $2873 = _v2013.termRef(1);
                      ESLVal $2872 = _v2013.termRef(2);
                      
                      {ESLVal _v2114 = $2874;
                      
                      {ESLVal _v2115 = $2873;
                      
                      {ESLVal _v2116 = $2872;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v2114,_v2115,_v2116,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v2013;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(args).flatten().flatten();
            
            return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
        default: return error(new ESLVal("case error at Pos(172,825)").add(ESLVal.list(_v2010)));
      }
      }
    }
  });
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v2009 = d;
        
        switch(_v2009.termName) {
        case "Dec": {ESLVal $2851 = _v2009.termRef(0);
          ESLVal $2850 = _v2009.termRef(1);
          ESLVal $2849 = _v2009.termRef(2);
          ESLVal $2848 = _v2009.termRef(3);
          
          {ESLVal l = $2851;
          
          {ESLVal n = $2850;
          
          {ESLVal t = $2849;
          
          {ESLVal st = $2848;
          
          return new ESLVal("JDec",n,$null);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(869,945)").add(ESLVal.list(_v2009)));
      }
      }
    }
  });
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cs = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v2008 = cs;
        
        if(_v2008.isCons())
        {ESLVal $2844 = _v2008.head();
          ESLVal $2845 = _v2008.tail();
          
          if($2845.isCons())
          {ESLVal $2846 = $2845.head();
            ESLVal $2847 = $2845.tail();
            
            {ESLVal c = $2844;
            
            {ESLVal _v2106 = $2845;
            
            return expsToJCommands.apply(_v2106,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
          }
        else if($2845.isNil())
          {ESLVal c = $2844;
            
            return ESLVal.list(expToJCommand.apply(c,isLast));
          }
        else {ESLVal c = $2844;
            
            {ESLVal _v2107 = $2845;
            
            return expsToJCommands.apply(_v2107,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
        }
      else if(_v2008.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1004,1164)").add(ESLVal.list(_v2008)));
      }
    }
  });
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v2001 = c;
        
        switch(_v2001.termName) {
        case "Block": {ESLVal $2839 = _v2001.termRef(0);
          ESLVal $2838 = _v2001.termRef(1);
          
          if($2838.isCons())
          {ESLVal $2840 = $2838.head();
            ESLVal $2841 = $2838.tail();
            
            if($2841.isCons())
            {ESLVal $2842 = $2841.head();
              ESLVal $2843 = $2841.tail();
              
              {ESLVal l = $2839;
              
              {ESLVal es = $2838;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v2005 = $qualArg;
                    
                    {ESLVal e = _v2005;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
            }
          else if($2841.isNil())
            {ESLVal l = $2839;
              
              {ESLVal e = $2840;
              
              return expToJCommand.apply(e,isLast);
            }
            }
          else {ESLVal l = $2839;
              
              {ESLVal es = $2838;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v2006 = $qualArg;
                    
                    {ESLVal e = _v2006;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
          }
        else if($2838.isNil())
          {ESLVal l = $2839;
            
            if(isLast.boolVal)
            return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
            else
              {ESLVal _v2104 = $2839;
                
                return new ESLVal("JBlock",$nil);
              }
          }
        else {ESLVal l = $2839;
            
            {ESLVal es = $2838;
            
            return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v2007 = $qualArg;
                  
                  {ESLVal e = _v2007;
                  
                  return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                }
                }
              }
            }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
          }
          }
        }
      case "Update": {ESLVal $2837 = _v2001.termRef(0);
          ESLVal $2836 = _v2001.termRef(1);
          ESLVal $2835 = _v2001.termRef(2);
          
          {ESLVal l = $2837;
          
          {ESLVal n = $2836;
          
          {ESLVal e = $2835;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp.apply(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v2101 = $2837;
              
              {ESLVal _v2102 = $2836;
              
              {ESLVal _v2103 = $2835;
              
              return new ESLVal("JUpdate",_v2102,expToJExp.apply(_v2103));
            }
            }
            }
        }
        }
        }
        }
      case "If": {ESLVal $2834 = _v2001.termRef(0);
          ESLVal $2833 = _v2001.termRef(1);
          ESLVal $2832 = _v2001.termRef(2);
          ESLVal $2831 = _v2001.termRef(3);
          
          {ESLVal l = $2834;
          
          {ESLVal e1 = $2833;
          
          {ESLVal e2 = $2832;
          
          {ESLVal e3 = $2831;
          
          return new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,isLast),expToJCommand.apply(e3,isLast));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $2830 = _v2001.termRef(0);
          ESLVal $2829 = _v2001.termRef(1);
          ESLVal $2828 = _v2001.termRef(2);
          ESLVal $2827 = _v2001.termRef(3);
          ESLVal $2826 = _v2001.termRef(4);
          
          {ESLVal l = $2830;
          
          {ESLVal e = $2829;
          
          {ESLVal cons = $2828;
          
          {ESLVal nil = $2827;
          
          {ESLVal alt = $2826;
          
          return new ESLVal("JCaseList",expToJExp.apply(e),expToJCommand.apply(cons,isLast),expToJCommand.apply(nil,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $2825 = _v2001.termRef(0);
          ESLVal $2824 = _v2001.termRef(1);
          ESLVal $2823 = _v2001.termRef(2);
          ESLVal $2822 = _v2001.termRef(3);
          
          {ESLVal l = $2825;
          
          {ESLVal e = $2824;
          
          {ESLVal arms = $2823;
          
          {ESLVal alt = $2822;
          
          return new ESLVal("JCaseTerm",expToJExp.apply(e),termArmsToJTermArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $2821 = _v2001.termRef(0);
          ESLVal $2820 = _v2001.termRef(1);
          ESLVal $2819 = _v2001.termRef(2);
          ESLVal $2818 = _v2001.termRef(3);
          
          {ESLVal l = $2821;
          
          {ESLVal e = $2820;
          
          {ESLVal arms = $2819;
          
          {ESLVal alt = $2818;
          
          return new ESLVal("JCaseInt",expToJExp.apply(e),intArmsToJIntArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $2817 = _v2001.termRef(0);
          ESLVal $2816 = _v2001.termRef(1);
          ESLVal $2815 = _v2001.termRef(2);
          ESLVal $2814 = _v2001.termRef(3);
          
          {ESLVal l = $2817;
          
          {ESLVal e = $2816;
          
          {ESLVal arms = $2815;
          
          {ESLVal alt = $2814;
          
          return new ESLVal("JCaseStr",expToJExp.apply(e),strArmsToJStrArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $2813 = _v2001.termRef(0);
          ESLVal $2812 = _v2001.termRef(1);
          ESLVal $2811 = _v2001.termRef(2);
          ESLVal $2810 = _v2001.termRef(3);
          
          {ESLVal l = $2813;
          
          {ESLVal e = $2812;
          
          {ESLVal arms = $2811;
          
          {ESLVal alt = $2810;
          
          return new ESLVal("JCaseBool",expToJExp.apply(e),boolArmsToJBoolArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $2809 = _v2001.termRef(0);
          ESLVal $2808 = _v2001.termRef(1);
          ESLVal $2807 = _v2001.termRef(2);
          
          {ESLVal l = $2809;
          
          {ESLVal bs = $2808;
          
          {ESLVal e = $2807;
          
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2004 = $qualArg;
                
                {ESLVal b = _v2004;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
      case "Letrec": {ESLVal $2806 = _v2001.termRef(0);
          ESLVal $2805 = _v2001.termRef(1);
          ESLVal $2804 = _v2001.termRef(2);
          
          {ESLVal l = $2806;
          
          {ESLVal bs = $2805;
          
          {ESLVal e = $2804;
          
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2003 = $qualArg;
                
                {ESLVal b = _v2003;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,$true));
        }
        }
        }
        }
      case "For": {ESLVal $2800 = _v2001.termRef(0);
          ESLVal $2799 = _v2001.termRef(1);
          ESLVal $2798 = _v2001.termRef(2);
          ESLVal $2797 = _v2001.termRef(3);
          
          switch($2799.termName) {
          case "PVar": {ESLVal $2803 = $2799.termRef(0);
            ESLVal $2802 = $2799.termRef(1);
            ESLVal $2801 = $2799.termRef(2);
            
            {ESLVal l1 = $2800;
            
            {ESLVal l2 = $2803;
            
            {ESLVal n = $2802;
            
            {ESLVal t = $2801;
            
            {ESLVal e = $2798;
            
            {ESLVal b = $2797;
            
            if(isLast.boolVal)
            return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName.apply(),n,expToJExp.apply(e),expToJCommand.apply(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
            else
              {ESLVal _v2095 = $2800;
                
                {ESLVal _v2096 = $2803;
                
                {ESLVal _v2097 = $2802;
                
                {ESLVal _v2098 = $2801;
                
                {ESLVal _v2099 = $2798;
                
                {ESLVal _v2100 = $2797;
                
                return new ESLVal("JFor",newName.apply(),_v2097,expToJExp.apply(_v2099),expToJCommand.apply(_v2100,$false));
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
          default: {ESLVal l = $2800;
            
            {ESLVal p = $2799;
            
            {ESLVal e = $2798;
            
            {ESLVal b = $2797;
            
            {ESLVal opName = newName.apply();
            ESLVal varName = newName.apply();
            
            return expToJCommand.apply(new ESLVal("For",l,new ESLVal("PVar",l,varName,$null),e,new ESLVal("Let",l,ESLVal.list(new ESLVal("Binding",l,opName,$null,$null,new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("forp")),ESLVal.list(),$null,new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,varName)),ESLVal.list(new ESLVal("BArm",l,ESLVal.list(p),new ESLVal("BoolExp",l,$true),b),new ESLVal("BArm",l,ESLVal.list(new ESLVal("PVar",l,new ESLVal("$$$"),$null)),new ESLVal("BoolExp",l,$true),new ESLVal("Block",l,ESLVal.list()))))))),new ESLVal("Apply",l,new ESLVal("Var",l,opName),ESLVal.list()))),isLast);
          }
          }
          }
          }
          }
        }
        }
      case "PLet": {ESLVal $2796 = _v2001.termRef(0);
          ESLVal $2795 = _v2001.termRef(1);
          ESLVal $2794 = _v2001.termRef(2);
          
          {ESLVal l = $2796;
          
          {ESLVal bs = $2795;
          
          {ESLVal e = $2794;
          
          return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v2002 = $qualArg;
                
                {ESLVal b = _v2002;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
        default: {ESLVal e = _v2001;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",expToJExp.apply(e));
          else
            {ESLVal _v2105 = _v2001;
              
              return new ESLVal("JStatement",expToJExp.apply(_v2105));
            }
        }
      }
      }
    }
  });
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal es = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun823"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expToJExp.apply(e);
          }
        }),es);
    }
  });
  private static ESLVal termArmsToJTermArms = new ESLVal(new Function(new ESLVal("termArmsToJTermArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v2000 = arms;
        
        if(_v2000.isCons())
        {ESLVal $2790 = _v2000.head();
          ESLVal $2791 = _v2000.tail();
          
          switch($2790.termName) {
          case "TArm": {ESLVal $2793 = $2790.termRef(0);
            ESLVal $2792 = $2790.termRef(1);
            
            {ESLVal n = $2793;
            
            {ESLVal e = $2792;
            
            {ESLVal _v2094 = $2791;
            
            return termArmsToJTermArms.apply(_v2094,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4366,4535)").add(ESLVal.list(_v2000)));
        }
        }
      else if(_v2000.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4366,4535)").add(ESLVal.list(_v2000)));
      }
    }
  });
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1999 = arms;
        
        if(_v1999.isCons())
        {ESLVal $2786 = _v1999.head();
          ESLVal $2787 = _v1999.tail();
          
          switch($2786.termName) {
          case "IArm": {ESLVal $2789 = $2786.termRef(0);
            ESLVal $2788 = $2786.termRef(1);
            
            {ESLVal n = $2789;
            
            {ESLVal e = $2788;
            
            {ESLVal _v2093 = $2787;
            
            return intArmsToJIntArms.apply(_v2093,isLast).cons(new ESLVal("JIArm",n,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4604,4768)").add(ESLVal.list(_v1999)));
        }
        }
      else if(_v1999.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4604,4768)").add(ESLVal.list(_v1999)));
      }
    }
  });
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1998 = arms;
        
        if(_v1998.isCons())
        {ESLVal $2782 = _v1998.head();
          ESLVal $2783 = _v1998.tail();
          
          switch($2782.termName) {
          case "SArm": {ESLVal $2785 = $2782.termRef(0);
            ESLVal $2784 = $2782.termRef(1);
            
            {ESLVal s = $2785;
            
            {ESLVal e = $2784;
            
            {ESLVal _v2092 = $2783;
            
            return strArmsToJStrArms.apply(_v2092,isLast).cons(new ESLVal("JSArm",s,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4837,5001)").add(ESLVal.list(_v1998)));
        }
        }
      else if(_v1998.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4837,5001)").add(ESLVal.list(_v1998)));
      }
    }
  });
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1997 = arms;
        
        if(_v1997.isCons())
        {ESLVal $2778 = _v1997.head();
          ESLVal $2779 = _v1997.tail();
          
          switch($2778.termName) {
          case "BoolArm": {ESLVal $2781 = $2778.termRef(0);
            ESLVal $2780 = $2778.termRef(1);
            
            {ESLVal b = $2781;
            
            {ESLVal e = $2780;
            
            {ESLVal _v2091 = $2779;
            
            return boolArmsToJBoolArms.apply(_v2091,isLast).cons(new ESLVal("JBArm",b,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5076,5249)").add(ESLVal.list(_v1997)));
        }
        }
      else if(_v1997.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5076,5249)").add(ESLVal.list(_v1997)));
      }
    }
  });
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal op = $args[0];
  {ESLVal _v1996 = op;
        
        switch(_v1996.strVal) {
        case "@": return new ESLVal("at");
      case "+": return new ESLVal("add");
      case "-": return new ESLVal("sub");
      case "*": return new ESLVal("mul");
      case "/": return new ESLVal("div");
      case "%": return new ESLVal("mod");
      case ">": return new ESLVal("gre");
      case ">=": return new ESLVal("greql");
      case "<": return new ESLVal("less");
      case "<=": return new ESLVal("lesseql");
      case "=": return new ESLVal("eql");
      case "<>": return new ESLVal("neql");
      case ":": return new ESLVal("cons");
      case "..": return new ESLVal("to");
      case "or": return new ESLVal("or");
      case "and": return new ESLVal("and");
      case "andalso": return new ESLVal("andalso");
      case "orelse": return new ESLVal("orelse");
        default: return error(new ESLVal("case error at Pos(5277,5646)").add(ESLVal.list(_v1996)));
      }
      }
    }
  });
  private static ESLVal caseToJExp = new ESLVal(new Function(new ESLVal("caseToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  {ESLVal bindings = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1993 = $qualArg;
                
                {ESLVal e = _v1993;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Binding",l,newName.apply(),$null,$null,e)));
              }
              }
            }
          }).map(es).flatten().flatten();
        
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1994 = $qualArg;
                
                switch(_v1994.termName) {
                case "Binding": {ESLVal $2777 = _v1994.termRef(0);
                  ESLVal $2776 = _v1994.termRef(1);
                  ESLVal $2775 = _v1994.termRef(2);
                  ESLVal $2774 = _v1994.termRef(3);
                  ESLVal $2773 = _v1994.termRef(4);
                  
                  {ESLVal _v2090 = $2777;
                  
                  {ESLVal n = $2776;
                  
                  {ESLVal dt = $2775;
                  
                  {ESLVal t = $2774;
                  
                  {ESLVal e = $2773;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v1994;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bindings).flatten().flatten();
        
        return expToJExp.apply(new ESLVal("Let",l,bindings,translateCases.apply(new ESLVal("Case",l,ESLVal.list(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1995 = $qualArg;
              
              {ESLVal n = _v1995;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",l,n)));
            }
            }
          }
        }).map(names).flatten().flatten(),arms))));
      }
      }
    }
  });
  private static ESLVal expToJExp = new ESLVal(new Function(new ESLVal("expToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v1990 = e;
        
        switch(_v1990.termName) {
        case "Apply": {ESLVal $2767 = _v1990.termRef(0);
          ESLVal $2766 = _v1990.termRef(1);
          ESLVal $2765 = _v1990.termRef(2);
          
          {ESLVal l = $2767;
          
          {ESLVal op = $2766;
          
          {ESLVal args = $2765;
          
          return new ESLVal("JApply",expToJExp.apply(op),expsToJExps.apply(args));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $2764 = _v1990.termRef(0);
          ESLVal $2763 = _v1990.termRef(1);
          ESLVal $2762 = _v1990.termRef(2);
          ESLVal $2761 = _v1990.termRef(3);
          
          {ESLVal l = $2764;
          
          {ESLVal a = $2763;
          
          {ESLVal i = $2762;
          
          {ESLVal v = $2761;
          
          return new ESLVal("JArrayUpdate",expToJExp.apply(a),expToJExp.apply(i),expToJExp.apply(v));
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $2760 = _v1990.termRef(0);
          ESLVal $2759 = _v1990.termRef(1);
          ESLVal $2758 = _v1990.termRef(2);
          
          {ESLVal l = $2760;
          
          {ESLVal a = $2759;
          
          {ESLVal i = $2758;
          
          return new ESLVal("JArrayRef",expToJExp.apply(a),expToJExp.apply(i));
        }
        }
        }
        }
      case "IntExp": {ESLVal $2757 = _v1990.termRef(0);
          ESLVal $2756 = _v1990.termRef(1);
          
          {ESLVal l = $2757;
          
          {ESLVal n = $2756;
          
          return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
        }
        }
        }
      case "StrExp": {ESLVal $2755 = _v1990.termRef(0);
          ESLVal $2754 = _v1990.termRef(1);
          
          {ESLVal l = $2755;
          
          {ESLVal s = $2754;
          
          return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
        }
        }
        }
      case "BoolExp": {ESLVal $2753 = _v1990.termRef(0);
          ESLVal $2752 = _v1990.termRef(1);
          
          {ESLVal l = $2753;
          
          {ESLVal b = $2752;
          
          return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
        }
        }
        }
      case "FloatExp": {ESLVal $2751 = _v1990.termRef(0);
          ESLVal $2750 = _v1990.termRef(1);
          
          {ESLVal l = $2751;
          
          {ESLVal f = $2750;
          
          return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $2736 = _v1990.termRef(0);
          ESLVal $2735 = _v1990.termRef(1);
          ESLVal $2734 = _v1990.termRef(2);
          
          switch($2735.termName) {
          case "List": {ESLVal $2743 = $2735.termRef(0);
            ESLVal $2742 = $2735.termRef(1);
            
            if($2742.isCons())
            {ESLVal $2744 = $2742.head();
              ESLVal $2745 = $2742.tail();
              
              {ESLVal l = $2736;
              
              {ESLVal _v2083 = $2735;
              
              {ESLVal ts = $2734;
              
              return expToJExp.apply(_v2083);
            }
            }
            }
            }
          else if($2742.isNil())
            if($2734.isCons())
              {ESLVal $2746 = $2734.head();
                ESLVal $2747 = $2734.tail();
                
                if($2747.isCons())
                {ESLVal $2748 = $2747.head();
                  ESLVal $2749 = $2747.tail();
                  
                  {ESLVal l = $2736;
                  
                  {ESLVal _v2084 = $2735;
                  
                  {ESLVal ts = $2734;
                  
                  return expToJExp.apply(_v2084);
                }
                }
                }
                }
              else if($2747.isNil())
                {ESLVal l1 = $2736;
                  
                  {ESLVal l2 = $2743;
                  
                  {ESLVal t = $2746;
                  
                  return new ESLVal("JNil",$null);
                }
                }
                }
              else {ESLVal l = $2736;
                  
                  {ESLVal _v2085 = $2735;
                  
                  {ESLVal ts = $2734;
                  
                  return expToJExp.apply(_v2085);
                }
                }
                }
              }
            else if($2734.isNil())
              {ESLVal l = $2736;
                
                {ESLVal _v2086 = $2735;
                
                {ESLVal ts = $2734;
                
                return expToJExp.apply(_v2086);
              }
              }
              }
            else {ESLVal l = $2736;
                
                {ESLVal _v2087 = $2735;
                
                {ESLVal ts = $2734;
                
                return expToJExp.apply(_v2087);
              }
              }
              }
          else {ESLVal l = $2736;
              
              {ESLVal _v2088 = $2735;
              
              {ESLVal ts = $2734;
              
              return expToJExp.apply(_v2088);
            }
            }
            }
          }
        case "NullExp": {ESLVal $2737 = $2735.termRef(0);
            
            if($2734.isCons())
            {ESLVal $2738 = $2734.head();
              ESLVal $2739 = $2734.tail();
              
              if($2739.isCons())
              {ESLVal $2740 = $2739.head();
                ESLVal $2741 = $2739.tail();
                
                {ESLVal l = $2736;
                
                {ESLVal _v2079 = $2735;
                
                {ESLVal ts = $2734;
                
                return expToJExp.apply(_v2079);
              }
              }
              }
              }
            else if($2739.isNil())
              {ESLVal l1 = $2736;
                
                {ESLVal l2 = $2737;
                
                {ESLVal t = $2738;
                
                return new ESLVal("JNull",new ESLVal[]{});
              }
              }
              }
            else {ESLVal l = $2736;
                
                {ESLVal _v2080 = $2735;
                
                {ESLVal ts = $2734;
                
                return expToJExp.apply(_v2080);
              }
              }
              }
            }
          else if($2734.isNil())
            {ESLVal l = $2736;
              
              {ESLVal _v2081 = $2735;
              
              {ESLVal ts = $2734;
              
              return expToJExp.apply(_v2081);
            }
            }
            }
          else {ESLVal l = $2736;
              
              {ESLVal _v2082 = $2735;
              
              {ESLVal ts = $2734;
              
              return expToJExp.apply(_v2082);
            }
            }
            }
          }
          default: {ESLVal l = $2736;
            
            {ESLVal _v2089 = $2735;
            
            {ESLVal ts = $2734;
            
            return expToJExp.apply(_v2089);
          }
          }
          }
        }
        }
      case "List": {ESLVal $2733 = _v1990.termRef(0);
          ESLVal $2732 = _v1990.termRef(1);
          
          {ESLVal l = $2733;
          
          {ESLVal es = $2732;
          
          return new ESLVal("JList",$null,expsToJExps.apply(es));
        }
        }
        }
      case "SetExp": {ESLVal $2731 = _v1990.termRef(0);
          ESLVal $2730 = _v1990.termRef(1);
          
          {ESLVal l = $2731;
          
          {ESLVal es = $2730;
          
          return new ESLVal("JSet",$null,expsToJExps.apply(es));
        }
        }
        }
      case "BagExp": {ESLVal $2729 = _v1990.termRef(0);
          ESLVal $2728 = _v1990.termRef(1);
          
          {ESLVal l = $2729;
          
          {ESLVal es = $2728;
          
          return new ESLVal("JBag",$null,expsToJExps.apply(es));
        }
        }
        }
      case "Term": {ESLVal $2727 = _v1990.termRef(0);
          ESLVal $2726 = _v1990.termRef(1);
          ESLVal $2725 = _v1990.termRef(2);
          ESLVal $2724 = _v1990.termRef(3);
          
          {ESLVal l = $2727;
          
          {ESLVal n = $2726;
          
          {ESLVal ts = $2725;
          
          {ESLVal es = $2724;
          
          return new ESLVal("JTerm",n,expsToJExps.apply(es));
        }
        }
        }
        }
        }
      case "Case": {ESLVal $2723 = _v1990.termRef(0);
          ESLVal $2722 = _v1990.termRef(1);
          ESLVal $2721 = _v1990.termRef(2);
          ESLVal $2720 = _v1990.termRef(3);
          
          {ESLVal l = $2723;
          
          {ESLVal ds = $2722;
          
          {ESLVal es = $2721;
          
          {ESLVal arms = $2720;
          
          return caseToJExp.apply(l,es,arms);
        }
        }
        }
        }
        }
      case "CaseAdd": {ESLVal $2719 = _v1990.termRef(0);
          ESLVal $2718 = _v1990.termRef(1);
          ESLVal $2717 = _v1990.termRef(2);
          ESLVal $2716 = _v1990.termRef(3);
          
          {ESLVal l = $2719;
          
          {ESLVal s = $2718;
          
          {ESLVal handler = $2717;
          
          {ESLVal fail = $2716;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $2715 = _v1990.termRef(0);
          ESLVal $2714 = _v1990.termRef(1);
          ESLVal $2713 = _v1990.termRef(2);
          ESLVal $2712 = _v1990.termRef(3);
          ESLVal $2711 = _v1990.termRef(4);
          
          {ESLVal l = $2715;
          
          {ESLVal list = $2714;
          
          {ESLVal cons = $2713;
          
          {ESLVal nil = $2712;
          
          {ESLVal alt = $2711;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $2710 = _v1990.termRef(0);
          ESLVal $2709 = _v1990.termRef(1);
          ESLVal $2708 = _v1990.termRef(2);
          ESLVal $2707 = _v1990.termRef(3);
          
          {ESLVal l = $2710;
          
          {ESLVal list = $2709;
          
          {ESLVal arms = $2708;
          
          {ESLVal alt = $2707;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $2706 = _v1990.termRef(0);
          ESLVal $2705 = _v1990.termRef(1);
          ESLVal $2704 = _v1990.termRef(2);
          ESLVal $2703 = _v1990.termRef(3);
          
          {ESLVal l = $2706;
          
          {ESLVal s = $2705;
          
          {ESLVal arms = $2704;
          
          {ESLVal alt = $2703;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $2702 = _v1990.termRef(0);
          ESLVal $2701 = _v1990.termRef(1);
          ESLVal $2700 = _v1990.termRef(2);
          ESLVal $2699 = _v1990.termRef(3);
          
          {ESLVal l = $2702;
          
          {ESLVal s = $2701;
          
          {ESLVal arms = $2700;
          
          {ESLVal alt = $2699;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseSet": {ESLVal $2698 = _v1990.termRef(0);
          ESLVal $2697 = _v1990.termRef(1);
          ESLVal $2696 = _v1990.termRef(2);
          ESLVal $2695 = _v1990.termRef(3);
          
          {ESLVal l = $2698;
          
          {ESLVal s = $2697;
          
          {ESLVal handler = $2696;
          
          {ESLVal fail = $2695;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "Head": {ESLVal $2694 = _v1990.termRef(0);
          
          {ESLVal _v2078 = $2694;
          
          return new ESLVal("JHead",expToJExp.apply(_v2078));
        }
        }
      case "Tail": {ESLVal $2693 = _v1990.termRef(0);
          
          {ESLVal _v2077 = $2693;
          
          return new ESLVal("JTail",expToJExp.apply(_v2077));
        }
        }
      case "CaseError": {ESLVal $2692 = _v1990.termRef(0);
          ESLVal $2691 = _v1990.termRef(1);
          
          {ESLVal l = $2692;
          
          {ESLVal _v2076 = $2691;
          
          return new ESLVal("JError",new ESLVal("JBinExp",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))),new ESLVal("add"),expToJExp.apply(_v2076)));
        }
        }
        }
      case "NullExp": {ESLVal $2690 = _v1990.termRef(0);
          
          {ESLVal l = $2690;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
        }
      case "Var": {ESLVal $2689 = _v1990.termRef(0);
          ESLVal $2688 = _v1990.termRef(1);
          
          {ESLVal l = $2689;
          
          {ESLVal n = $2688;
          
          return new ESLVal("JVar",n,$null);
        }
        }
        }
      case "Let": {ESLVal $2687 = _v1990.termRef(0);
          ESLVal $2686 = _v1990.termRef(1);
          ESLVal $2685 = _v1990.termRef(2);
          
          {ESLVal l = $2687;
          
          {ESLVal bs = $2686;
          
          {ESLVal body = $2685;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Letrec": {ESLVal $2684 = _v1990.termRef(0);
          ESLVal $2683 = _v1990.termRef(1);
          ESLVal $2682 = _v1990.termRef(2);
          
          {ESLVal l = $2684;
          
          {ESLVal bs = $2683;
          
          {ESLVal body = $2682;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Throw": {ESLVal $2681 = _v1990.termRef(0);
          ESLVal $2680 = _v1990.termRef(1);
          ESLVal $2679 = _v1990.termRef(2);
          
          {ESLVal l = $2681;
          
          {ESLVal t = $2680;
          
          {ESLVal _v2075 = $2679;
          
          return new ESLVal("JError",expToJExp.apply(_v2075));
        }
        }
        }
        }
      case "BinExp": {ESLVal $2678 = _v1990.termRef(0);
          ESLVal $2677 = _v1990.termRef(1);
          ESLVal $2676 = _v1990.termRef(2);
          ESLVal $2675 = _v1990.termRef(3);
          
          {ESLVal l = $2678;
          
          {ESLVal e1 = $2677;
          
          {ESLVal op = $2676;
          
          {ESLVal e2 = $2675;
          
          return new ESLVal("JBinExp",expToJExp.apply(e1),opToJOp.apply(op),expToJExp.apply(e2));
        }
        }
        }
        }
        }
      case "Become": {ESLVal $2671 = _v1990.termRef(0);
          ESLVal $2670 = _v1990.termRef(1);
          
          switch($2670.termName) {
          case "Apply": {ESLVal $2674 = $2670.termRef(0);
            ESLVal $2673 = $2670.termRef(1);
            ESLVal $2672 = $2670.termRef(2);
            
            {ESLVal l = $2671;
            
            {ESLVal al = $2674;
            
            {ESLVal b = $2673;
            
            {ESLVal args = $2672;
            
            return new ESLVal("JBecome",expToJExp.apply(b),expsToJExps.apply(args));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(6004,14628)").add(ESLVal.list(_v1990)));
        }
        }
      case "Block": {ESLVal $2665 = _v1990.termRef(0);
          ESLVal $2664 = _v1990.termRef(1);
          
          if($2664.isCons())
          {ESLVal $2666 = $2664.head();
            ESLVal $2667 = $2664.tail();
            
            if($2667.isCons())
            {ESLVal $2668 = $2667.head();
              ESLVal $2669 = $2667.tail();
              
              {ESLVal l = $2665;
              
              {ESLVal es = $2664;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
            }
          else if($2667.isNil())
            {ESLVal l = $2665;
              
              {ESLVal _v2074 = $2666;
              
              return expToJExp.apply(_v2074);
            }
            }
          else {ESLVal l = $2665;
              
              {ESLVal es = $2664;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
          }
        else if($2664.isNil())
          {ESLVal l = $2665;
            
            return new ESLVal("JNull",new ESLVal[]{});
          }
        else {ESLVal l = $2665;
            
            {ESLVal es = $2664;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
          }
          }
        }
      case "If": {ESLVal $2663 = _v1990.termRef(0);
          ESLVal $2662 = _v1990.termRef(1);
          ESLVal $2661 = _v1990.termRef(2);
          ESLVal $2660 = _v1990.termRef(3);
          
          {ESLVal l = $2663;
          
          {ESLVal e1 = $2662;
          
          {ESLVal e2 = $2661;
          
          {ESLVal e3 = $2660;
          
          return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,$true),expToJCommand.apply(e3,$true)),$null);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $2659 = _v1990.termRef(0);
          ESLVal $2658 = _v1990.termRef(1);
          ESLVal $2657 = _v1990.termRef(2);
          ESLVal $2656 = _v1990.termRef(3);
          ESLVal $2655 = _v1990.termRef(4);
          
          {ESLVal l = $2659;
          
          {ESLVal n = $2658;
          
          {ESLVal args = $2657;
          
          {ESLVal t = $2656;
          
          {ESLVal body = $2655;
          
          return new ESLVal("JFun",expToJExp.apply(n),map.apply(new ESLVal(new Function(new ESLVal("fun824"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return decToJDec.apply(d);
            }
          }),args),new ESLVal("JFunType",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1992 = $qualArg;
                
                {ESLVal a = _v1992;
                
                return ESLVal.list(ESLVal.list($null));
              }
              }
            }
          }).map(args).flatten().flatten(),$null),expToJCommand.apply(body,$true));
        }
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $2654 = _v1990.termRef(0);
          ESLVal $2653 = _v1990.termRef(1);
          
          {ESLVal _v2073 = $2654;
          
          {ESLVal i = $2653;
          
          return new ESLVal("JTermRef",expToJExp.apply(_v2073),i);
        }
        }
        }
      case "Cmp": {ESLVal $2652 = _v1990.termRef(0);
          ESLVal $2651 = _v1990.termRef(1);
          ESLVal $2650 = _v1990.termRef(2);
          
          {ESLVal l = $2652;
          
          {ESLVal _v2069 = $2651;
          
          {ESLVal qs = $2650;
          
          if(exists.apply(isBindingQualifier,qs).and(forall.apply(isSimpleQualifier,qs)).boolVal)
          return new ESLVal("JCmpExp",cmpToJCmp.apply(_v2069,qs));
          else
            {ESLVal _v2070 = $2652;
              
              {ESLVal _v2071 = $2651;
              
              {ESLVal _v2072 = $2650;
              
              return cmpToJExp.apply(_v2071,_v2072);
            }
            }
            }
        }
        }
        }
        }
      case "Not": {ESLVal $2649 = _v1990.termRef(0);
          ESLVal $2648 = _v1990.termRef(1);
          
          {ESLVal l = $2649;
          
          {ESLVal _v2068 = $2648;
          
          return new ESLVal("JNot",expToJExp.apply(_v2068));
        }
        }
        }
      case "New": {ESLVal $2647 = _v1990.termRef(0);
          ESLVal $2646 = _v1990.termRef(1);
          ESLVal $2645 = _v1990.termRef(2);
          
          {ESLVal l = $2647;
          
          {ESLVal b = $2646;
          
          {ESLVal args = $2645;
          
          return new ESLVal("JNew",expToJExp.apply(b),expsToJExps.apply(args));
        }
        }
        }
        }
      case "NewArray": {ESLVal $2644 = _v1990.termRef(0);
          ESLVal $2643 = _v1990.termRef(1);
          ESLVal $2642 = _v1990.termRef(2);
          
          {ESLVal l = $2644;
          
          {ESLVal t = $2643;
          
          {ESLVal i = $2642;
          
          return new ESLVal("JNewArray",expToJExp.apply(i));
        }
        }
        }
        }
      case "NewJava": {ESLVal $2641 = _v1990.termRef(0);
          ESLVal $2640 = _v1990.termRef(1);
          ESLVal $2639 = _v1990.termRef(2);
          ESLVal $2638 = _v1990.termRef(3);
          
          {ESLVal l = $2641;
          
          {ESLVal n = $2640;
          
          {ESLVal t = $2639;
          
          {ESLVal args = $2638;
          
          return new ESLVal("JNewJava",n,expsToJExps.apply(args));
        }
        }
        }
        }
        }
      case "NewTable": {ESLVal $2637 = _v1990.termRef(0);
          ESLVal $2636 = _v1990.termRef(1);
          ESLVal $2635 = _v1990.termRef(2);
          
          {ESLVal l = $2637;
          
          {ESLVal key = $2636;
          
          {ESLVal value = $2635;
          
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
        }
        }
        }
      case "Record": {ESLVal $2634 = _v1990.termRef(0);
          ESLVal $2633 = _v1990.termRef(1);
          
          {ESLVal l = $2634;
          
          {ESLVal fs = $2633;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1991 = $qualArg;
                
                switch(_v1991.termName) {
                case "Binding": {ESLVal $2772 = _v1991.termRef(0);
                  ESLVal $2771 = _v1991.termRef(1);
                  ESLVal $2770 = _v1991.termRef(2);
                  ESLVal $2769 = _v1991.termRef(3);
                  ESLVal $2768 = _v1991.termRef(4);
                  
                  {ESLVal bl = $2772;
                  
                  {ESLVal n = $2771;
                  
                  {ESLVal t = $2770;
                  
                  {ESLVal dt = $2769;
                  
                  {ESLVal _v2067 = $2768;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,$null,expToJExp.apply(_v2067))));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v1991;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "Send": {ESLVal $2628 = _v1990.termRef(0);
          ESLVal $2627 = _v1990.termRef(1);
          ESLVal $2626 = _v1990.termRef(2);
          
          switch($2626.termName) {
          case "Term": {ESLVal $2632 = $2626.termRef(0);
            ESLVal $2631 = $2626.termRef(1);
            ESLVal $2630 = $2626.termRef(2);
            ESLVal $2629 = $2626.termRef(3);
            
            {ESLVal l = $2628;
            
            {ESLVal a = $2627;
            
            {ESLVal lt = $2632;
            
            {ESLVal n = $2631;
            
            {ESLVal ts = $2630;
            
            {ESLVal es = $2629;
            
            return new ESLVal("JSend",expToJExp.apply(a),n,expsToJExps.apply(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(6004,14628)").add(ESLVal.list(_v1990)));
        }
        }
      case "SendTimeSuper": {ESLVal $2625 = _v1990.termRef(0);
          
          {ESLVal l = $2625;
          
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
        }
      case "SendSuper": {ESLVal $2624 = _v1990.termRef(0);
          ESLVal $2623 = _v1990.termRef(1);
          
          {ESLVal l = $2624;
          
          {ESLVal _v2066 = $2623;
          
          return new ESLVal("JSendSuper",expToJExp.apply(_v2066));
        }
        }
        }
      case "Self": {ESLVal $2622 = _v1990.termRef(0);
          
          {ESLVal l = $2622;
          
          return new ESLVal("JSelf",new ESLVal[]{});
        }
        }
      case "Fold": {ESLVal $2621 = _v1990.termRef(0);
          ESLVal $2620 = _v1990.termRef(1);
          ESLVal $2619 = _v1990.termRef(2);
          
          {ESLVal l = $2621;
          
          {ESLVal t = $2620;
          
          {ESLVal _v2065 = $2619;
          
          return expToJExp.apply(_v2065);
        }
        }
        }
        }
      case "Now": {ESLVal $2618 = _v1990.termRef(0);
          
          {ESLVal l = $2618;
          
          return new ESLVal("JNow",new ESLVal[]{});
        }
        }
      case "Ref": {ESLVal $2617 = _v1990.termRef(0);
          ESLVal $2616 = _v1990.termRef(1);
          ESLVal $2615 = _v1990.termRef(2);
          
          {ESLVal l = $2617;
          
          {ESLVal _v2064 = $2616;
          
          {ESLVal n = $2615;
          
          return new ESLVal("JRef",expToJExp.apply(_v2064),n);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $2614 = _v1990.termRef(0);
          ESLVal $2613 = _v1990.termRef(1);
          
          {ESLVal l = $2614;
          
          {ESLVal n = $2613;
          
          return new ESLVal("JRefSuper",n);
        }
        }
        }
      case "For": {ESLVal $2612 = _v1990.termRef(0);
          ESLVal $2611 = _v1990.termRef(1);
          ESLVal $2610 = _v1990.termRef(2);
          ESLVal $2609 = _v1990.termRef(3);
          
          {ESLVal l1 = $2612;
          
          {ESLVal p = $2611;
          
          {ESLVal l2 = $2610;
          
          {ESLVal c = $2609;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $2608 = _v1990.termRef(0);
          ESLVal $2607 = _v1990.termRef(1);
          ESLVal $2606 = _v1990.termRef(2);
          
          {ESLVal l = $2608;
          
          {ESLVal refs = $2607;
          
          {ESLVal _v2063 = $2606;
          
          return new ESLVal("JGrab",refsToJExps.apply(refs),expToJExp.apply(_v2063));
        }
        }
        }
        }
      case "Update": {ESLVal $2605 = _v1990.termRef(0);
          ESLVal $2604 = _v1990.termRef(1);
          ESLVal $2603 = _v1990.termRef(2);
          
          {ESLVal l = $2605;
          
          {ESLVal n = $2604;
          
          {ESLVal v = $2603;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Probably": {ESLVal $2602 = _v1990.termRef(0);
          ESLVal $2601 = _v1990.termRef(1);
          ESLVal $2600 = _v1990.termRef(2);
          ESLVal $2599 = _v1990.termRef(3);
          ESLVal $2598 = _v1990.termRef(4);
          
          {ESLVal l = $2602;
          
          {ESLVal _v2062 = $2601;
          
          {ESLVal t = $2600;
          
          {ESLVal e1 = $2599;
          
          {ESLVal e2 = $2598;
          
          return new ESLVal("JProbably",expToJExp.apply(_v2062),expToJExp.apply(e1),expToJExp.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Try": {ESLVal $2597 = _v1990.termRef(0);
          ESLVal $2596 = _v1990.termRef(1);
          ESLVal $2595 = _v1990.termRef(2);
          
          {ESLVal l = $2597;
          
          {ESLVal _v2061 = $2596;
          
          {ESLVal arms = $2595;
          
          return new ESLVal("JTry",expToJExp.apply(_v2061),new ESLVal("$x"),expToJCommand.apply(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
        }
        }
        }
        }
      case "ActExp": {ESLVal $2594 = _v1990.termRef(0);
          ESLVal $2593 = _v1990.termRef(1);
          ESLVal $2592 = _v1990.termRef(2);
          ESLVal $2591 = _v1990.termRef(3);
          ESLVal $2590 = _v1990.termRef(4);
          ESLVal $2589 = _v1990.termRef(5);
          ESLVal $2588 = _v1990.termRef(6);
          ESLVal $2587 = _v1990.termRef(7);
          
          {ESLVal l = $2594;
          
          {ESLVal name = $2593;
          
          {ESLVal decs = $2592;
          
          {ESLVal exports = $2591;
          
          {ESLVal parent = $2590;
          
          {ESLVal defs = $2589;
          
          {ESLVal init = $2588;
          
          {ESLVal arms = $2587;
          
          return actToJava.apply(name,decs,exports,parent,defs,init,arms);
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6004,14628)").add(ESLVal.list(_v1990)));
      }
      }
    }
  });
  private static ESLVal isSimpleQualifier = new ESLVal(new Function(new ESLVal("isSimpleQualifier"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v1989 = q;
        
        switch(_v1989.termName) {
        case "BQual": {ESLVal $2583 = _v1989.termRef(0);
          ESLVal $2582 = _v1989.termRef(1);
          ESLVal $2581 = _v1989.termRef(2);
          
          switch($2582.termName) {
          case "PVar": {ESLVal $2586 = $2582.termRef(0);
            ESLVal $2585 = $2582.termRef(1);
            ESLVal $2584 = $2582.termRef(2);
            
            {ESLVal l = $2583;
            
            {ESLVal vl = $2586;
            
            {ESLVal n = $2585;
            
            {ESLVal t = $2584;
            
            {ESLVal e = $2581;
            
            return $true;
          }
          }
          }
          }
          }
          }
          default: {ESLVal l = $2583;
            
            {ESLVal p = $2582;
            
            {ESLVal e = $2581;
            
            return $false;
          }
          }
          }
        }
        }
        default: {ESLVal _v2060 = _v1989;
          
          return $true;
        }
      }
      }
    }
  });
  private static ESLVal isBindingQualifier = new ESLVal(new Function(new ESLVal("isBindingQualifier"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v1988 = q;
        
        switch(_v1988.termName) {
        case "BQual": {ESLVal $2580 = _v1988.termRef(0);
          ESLVal $2579 = _v1988.termRef(1);
          ESLVal $2578 = _v1988.termRef(2);
          
          {ESLVal l = $2580;
          
          {ESLVal p = $2579;
          
          {ESLVal e = $2578;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v2059 = _v1988;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal cmpToJCmp = new ESLVal(new Function(new ESLVal("cmpToJCmp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  LetRec letrec = new LetRec() {
        ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v2054 = $args[0];
          {ESLVal _v1986 = _v2054;
                
                if(_v1986.isCons())
                {ESLVal $2558 = _v1986.head();
                  ESLVal $2559 = _v1986.tail();
                  
                  switch($2558.termName) {
                  case "BQual": {ESLVal $2564 = $2558.termRef(0);
                    ESLVal $2563 = $2558.termRef(1);
                    ESLVal $2562 = $2558.termRef(2);
                    
                    switch($2563.termName) {
                    case "PVar": {ESLVal $2567 = $2563.termRef(0);
                      ESLVal $2566 = $2563.termRef(1);
                      ESLVal $2565 = $2563.termRef(2);
                      
                      {ESLVal l = $2564;
                      
                      {ESLVal vl = $2567;
                      
                      {ESLVal n = $2566;
                      
                      {ESLVal t = $2565;
                      
                      {ESLVal listExp = $2562;
                      
                      {ESLVal _v2056 = $2559;
                      
                      return new ESLVal("JCmpBind",n,expToJExp.apply(listExp),inner.apply(_v2056));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(15031,15229)").add(ESLVal.list(_v1986)));
                  }
                  }
                case "PQual": {ESLVal $2561 = $2558.termRef(0);
                    ESLVal $2560 = $2558.termRef(1);
                    
                    {ESLVal l = $2561;
                    
                    {ESLVal p = $2560;
                    
                    {ESLVal _v2055 = $2559;
                    
                    return new ESLVal("JCmpIf",expToJExp.apply(p),inner.apply(_v2055));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(15031,15229)").add(ESLVal.list(_v1986)));
                }
                }
              else if(_v1986.isNil())
                return new ESLVal("JCmpList",expToJExp.apply(e));
              else return error(new ESLVal("case error at Pos(15031,15229)").add(ESLVal.list(_v1986)));
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
      
        {ESLVal _v1987 = qs;
        
        if(_v1987.isCons())
        {ESLVal $2568 = _v1987.head();
          ESLVal $2569 = _v1987.tail();
          
          switch($2568.termName) {
          case "BQual": {ESLVal $2574 = $2568.termRef(0);
            ESLVal $2573 = $2568.termRef(1);
            ESLVal $2572 = $2568.termRef(2);
            
            switch($2573.termName) {
            case "PVar": {ESLVal $2577 = $2573.termRef(0);
              ESLVal $2576 = $2573.termRef(1);
              ESLVal $2575 = $2573.termRef(2);
              
              {ESLVal l = $2574;
              
              {ESLVal vl = $2577;
              
              {ESLVal n = $2576;
              
              {ESLVal t = $2575;
              
              {ESLVal listExp = $2572;
              
              {ESLVal _v2058 = $2569;
              
              return new ESLVal("JCmpOuter",n,expToJExp.apply(listExp),inner.apply(_v2058));
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(15241,15438)").add(ESLVal.list(_v1987)));
          }
          }
        case "PQual": {ESLVal $2571 = $2568.termRef(0);
            ESLVal $2570 = $2568.termRef(1);
            
            {ESLVal l = $2571;
            
            {ESLVal p = $2570;
            
            {ESLVal _v2057 = $2569;
            
            return new ESLVal("JCmpIf",expToJExp.apply(p),cmpToJCmp.apply(e,_v2057));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(15241,15438)").add(ESLVal.list(_v1987)));
        }
        }
      else if(_v1987.isNil())
        return new ESLVal("JCmpList",expToJExp.apply(e));
      else return error(new ESLVal("case error at Pos(15241,15438)").add(ESLVal.list(_v1987)));
      }
      
    }
  });
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal refs = $args[0];
  {ESLVal _v1985 = refs;
        
        if(_v1985.isCons())
        {ESLVal $2549 = _v1985.head();
          ESLVal $2550 = _v1985.tail();
          
          switch($2549.termName) {
          case "VarDynamicRef": {ESLVal $2555 = $2549.termRef(0);
            ESLVal $2554 = $2549.termRef(1);
            
            switch($2554.termName) {
            case "Var": {ESLVal $2557 = $2554.termRef(0);
              ESLVal $2556 = $2554.termRef(1);
              
              {ESLVal l = $2555;
              
              {ESLVal vl = $2557;
              
              {ESLVal n = $2556;
              
              {ESLVal _v2053 = $2550;
              
              return refsToJExps.apply(_v2053).cons(new ESLVal("JVar",n,$null));
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(15485,15726)").add(ESLVal.list(_v1985)));
          }
          }
        case "ActorDynamicRef": {ESLVal $2553 = $2549.termRef(0);
            ESLVal $2552 = $2549.termRef(1);
            ESLVal $2551 = $2549.termRef(2);
            
            {ESLVal l = $2553;
            
            {ESLVal e = $2552;
            
            {ESLVal n = $2551;
            
            {ESLVal _v2052 = $2550;
            
            return refsToJExps.apply(_v2052).cons(new ESLVal("JRef",expToJExp.apply(e),n));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(15485,15726)").add(ESLVal.list(_v1985)));
        }
        }
      else if(_v1985.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(15485,15726)").add(ESLVal.list(_v1985)));
      }
    }
  });
  private static ESLVal actToJava = new ESLVal(new Function(new ESLVal("actToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal parent = $args[3];
  ESLVal defs = $args[4];
  ESLVal init = $args[5];
  ESLVal arms = $args[6];
  if(parent.eql($null).boolVal)
        return simpleActToJava.apply(name,decs,exports,defs,init,arms);
        else
          return extendedActToJava.apply(name,decs,exports,parent,defs,init,arms);
    }
  });
  private static ESLVal simpleActToJava = new ESLVal(new Function(new ESLVal("simpleActToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal defs = $args[3];
  ESLVal init = $args[4];
  ESLVal arms = $args[5];
  {ESLVal timeArms = select.apply(isTimeArm,arms);
        
        {ESLVal nonTimeArms = reject.apply(isTimeArm,arms);
        
        {ESLVal timeCommand = ((Supplier<ESLVal>)() -> { 
            if(timeArms.eql(ESLVal.list()).boolVal)
              return new ESLVal("JBlock",ESLVal.list());
              else
                return timeArmsToJCommand.apply(timeArms);
          }).get();
        
        {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms));
        
        return new ESLVal("JBehaviour",exports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1984 = $qualArg;
              
              {ESLVal b = _v1984;
              
              return ESLVal.list(ESLVal.list(defToField.apply(b)));
            }
            }
          }
        }).map(defs).flatten().flatten(),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
      }
      }
      }
      }
    }
  });
  private static ESLVal extendedActToJava = new ESLVal(new Function(new ESLVal("extendedActToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal parent = $args[3];
  ESLVal defs = $args[4];
  ESLVal init = $args[5];
  ESLVal arms = $args[6];
  {ESLVal p0 = new ESLVal("Pos",$zero,$zero);
        
        {ESLVal timeSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PTerm",p0,new ESLVal("Time"),ESLVal.list(),ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$"),$null)))),new ESLVal("BoolExp",p0,$true),new ESLVal("SendTimeSuper",p0));
        
        {ESLVal timeArms = select.apply(isTimeArm,arms).add(ESLVal.list(timeSuper));
        
        {ESLVal messageSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$m"),$null)),new ESLVal("BoolExp",p0,$true),new ESLVal("Block",p0,ESLVal.list(new ESLVal("SendSuper",p0,new ESLVal("Var",p0,new ESLVal("$m"))),new ESLVal("NullExp",p0))));
        
        {ESLVal nonTimeArms = reject.apply(isTimeArm,arms).add(ESLVal.list(messageSuper));
        
        {ESLVal timeCommand = ((Supplier<ESLVal>)() -> { 
            if(timeArms.eql(ESLVal.list()).boolVal)
              return new ESLVal("JBlock",ESLVal.list());
              else
                return timeArmsToJCommand.apply(timeArms);
          }).get();
        
        {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms));
        
        return new ESLVal("JExtendedBehaviour",exports,expToJExp.apply(parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1983 = $qualArg;
              
              {ESLVal b = _v1983;
              
              return ESLVal.list(ESLVal.list(defToField.apply(b)));
            }
            }
          }
        }).map(defs).flatten().flatten(),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
      }
      }
      }
      }
      }
      }
      }
    }
  });
  private static ESLVal isTimeArm = new ESLVal(new Function(new ESLVal("isTimeArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v1982 = a;
        
        switch(_v1982.termName) {
        case "BArm": {ESLVal $2540 = _v1982.termRef(0);
          ESLVal $2539 = _v1982.termRef(1);
          ESLVal $2538 = _v1982.termRef(2);
          ESLVal $2537 = _v1982.termRef(3);
          
          if($2539.isCons())
          {ESLVal $2541 = $2539.head();
            ESLVal $2542 = $2539.tail();
            
            switch($2541.termName) {
            case "PTerm": {ESLVal $2546 = $2541.termRef(0);
              ESLVal $2545 = $2541.termRef(1);
              ESLVal $2544 = $2541.termRef(2);
              ESLVal $2543 = $2541.termRef(3);
              
              switch($2545.strVal) {
              case "Time": if($2542.isCons())
                {ESLVal $2547 = $2542.head();
                  ESLVal $2548 = $2542.tail();
                  
                  {ESLVal _v2045 = _v1982;
                  
                  return $false;
                }
                }
              else if($2542.isNil())
                {ESLVal l = $2540;
                  
                  {ESLVal pl = $2546;
                  
                  {ESLVal ts = $2544;
                  
                  {ESLVal ps = $2543;
                  
                  {ESLVal g = $2538;
                  
                  {ESLVal e = $2537;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v2046 = _v1982;
                  
                  return $false;
                }
              default: {ESLVal _v2047 = _v1982;
                
                return $false;
              }
            }
            }
            default: {ESLVal _v2048 = _v1982;
              
              return $false;
            }
          }
          }
        else if($2539.isNil())
          {ESLVal _v2049 = _v1982;
            
            return $false;
          }
        else {ESLVal _v2050 = _v1982;
            
            return $false;
          }
        }
        default: {ESLVal _v2051 = _v1982;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal _v1981 = arms;
        
        if(_v1981.isCons())
        {ESLVal $2506 = _v1981.head();
          ESLVal $2507 = _v1981.tail();
          
          switch($2506.termName) {
          case "BArm": {ESLVal $2511 = $2506.termRef(0);
            ESLVal $2510 = $2506.termRef(1);
            ESLVal $2509 = $2506.termRef(2);
            ESLVal $2508 = $2506.termRef(3);
            
            if($2510.isCons())
            {ESLVal $2512 = $2510.head();
              ESLVal $2513 = $2510.tail();
              
              switch($2512.termName) {
              case "PTerm": {ESLVal $2517 = $2512.termRef(0);
                ESLVal $2516 = $2512.termRef(1);
                ESLVal $2515 = $2512.termRef(2);
                ESLVal $2514 = $2512.termRef(3);
                
                switch($2516.strVal) {
                case "Time": if($2515.isCons())
                  {ESLVal $2518 = $2515.head();
                    ESLVal $2519 = $2515.tail();
                    
                    return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                  }
                else if($2515.isNil())
                  if($2514.isCons())
                    {ESLVal $2520 = $2514.head();
                      ESLVal $2521 = $2514.tail();
                      
                      switch($2520.termName) {
                      case "PVar": {ESLVal $2532 = $2520.termRef(0);
                        ESLVal $2531 = $2520.termRef(1);
                        ESLVal $2530 = $2520.termRef(2);
                        
                        if($2521.isCons())
                        {ESLVal $2533 = $2521.head();
                          ESLVal $2534 = $2521.tail();
                          
                          return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                        }
                      else if($2521.isNil())
                        if($2513.isCons())
                          {ESLVal $2535 = $2513.head();
                            ESLVal $2536 = $2513.tail();
                            
                            return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                          }
                        else if($2513.isNil())
                          {ESLVal l = $2511;
                            
                            {ESLVal tl = $2517;
                            
                            {ESLVal vl = $2532;
                            
                            {ESLVal n = $2531;
                            
                            {ESLVal t = $2530;
                            
                            {ESLVal g = $2509;
                            
                            {ESLVal e = $2508;
                            
                            {ESLVal _v2044 = $2507;
                            
                            return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp.apply(g),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v2044)));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                      else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                      }
                    case "PInt": {ESLVal $2523 = $2520.termRef(0);
                        ESLVal $2522 = $2520.termRef(1);
                        
                        if($2521.isCons())
                        {ESLVal $2524 = $2521.head();
                          ESLVal $2525 = $2521.tail();
                          
                          return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                        }
                      else if($2521.isNil())
                        if($2513.isCons())
                          {ESLVal $2526 = $2513.head();
                            ESLVal $2527 = $2513.tail();
                            
                            return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                          }
                        else if($2513.isNil())
                          switch($2509.termName) {
                            case "BoolExp": {ESLVal $2529 = $2509.termRef(0);
                              ESLVal $2528 = $2509.termRef(1);
                              
                              switch($2528.boolVal ? 1 : 0) {
                              case 1: {ESLVal l = $2511;
                                
                                {ESLVal tl = $2517;
                                
                                {ESLVal vl = $2523;
                                
                                {ESLVal n = $2522;
                                
                                {ESLVal bl = $2529;
                                
                                {ESLVal e = $2508;
                                
                                {ESLVal _v2043 = $2507;
                                
                                return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v2043));
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                          }
                        else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                      else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                      }
                      default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                    }
                    }
                  else if($2514.isNil())
                    return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                  else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
                default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
              }
              }
              default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
            }
            }
          else if($2510.isNil())
            return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
          else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
          }
          default: return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
        }
        }
      else if(_v1981.isNil())
        return new ESLVal("JBlock",ESLVal.list());
      else return error(new ESLVal("case error at Pos(17827,18357)").add(ESLVal.list(_v1981)));
      }
    }
  });
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  {ESLVal _v1980 = qs;
        
        if(_v1980.isCons())
        {ESLVal $2499 = _v1980.head();
          ESLVal $2500 = _v1980.tail();
          
          switch($2499.termName) {
          case "BQual": {ESLVal $2505 = $2499.termRef(0);
            ESLVal $2504 = $2499.termRef(1);
            ESLVal $2503 = $2499.termRef(2);
            
            {ESLVal l = $2505;
            
            {ESLVal p = $2504;
            
            {ESLVal v = $2503;
            
            {ESLVal _v2042 = $2500;
            
            {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),ESLVal.list(),ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v2042)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
            
            return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp.apply(f),expToJExp.apply(v))));
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $2502 = $2499.termRef(0);
            ESLVal $2501 = $2499.termRef(1);
            
            {ESLVal l = $2502;
            
            {ESLVal p = $2501;
            
            {ESLVal _v2041 = $2500;
            
            return new ESLVal("JIfExp",expToJExp.apply(p),cmpToJExp.apply(e,_v2041),new ESLVal("JNil",$null));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(18404,19072)").add(ESLVal.list(_v1980)));
        }
        }
      else if(_v1980.isNil())
        return new ESLVal("JList",$null,ESLVal.list(expToJExp.apply(e)));
      else return error(new ESLVal("case error at Pos(18404,19072)").add(ESLVal.list(_v1980)));
      }
    }
  });
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  {ESLVal _v1978 = module;
        
        switch(_v1978.termName) {
        case "Module": {ESLVal $2498 = _v1978.termRef(0);
          ESLVal $2497 = _v1978.termRef(1);
          ESLVal $2496 = _v1978.termRef(2);
          ESLVal $2495 = _v1978.termRef(3);
          ESLVal $2494 = _v1978.termRef(4);
          ESLVal $2493 = _v1978.termRef(5);
          ESLVal $2492 = _v1978.termRef(6);
          
          {ESLVal path = $2498;
          
          {ESLVal name = $2497;
          
          {ESLVal exports = $2496;
          
          {ESLVal imports = $2495;
          
          {ESLVal x = $2494;
          
          {ESLVal y = $2493;
          
          {ESLVal defs = $2492;
          
          return renameJVarsModule.apply(new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1979 = $qualArg;
                
                {ESLVal d = _v1979;
                
                return ESLVal.list((isBinding.apply(d).or(isFunBind.apply(d)).boolVal) ? (ESLVal.list(defToField.apply(d))) : ($nil));
              }
              }
            }
          }).map(expandFunDefs.apply(mergeFunDefs.apply(defs))).flatten().flatten()));
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19110,19383)").add(ESLVal.list(_v1978)));
      }
      }
    }
  });
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v1975 = m;
        
        switch(_v1975.termName) {
        case "JModule": {ESLVal $2485 = _v1975.termRef(0);
          ESLVal $2484 = _v1975.termRef(1);
          ESLVal $2483 = _v1975.termRef(2);
          ESLVal $2482 = _v1975.termRef(3);
          
          {ESLVal name = $2485;
          
          {ESLVal exports = $2484;
          
          {ESLVal imports = $2483;
          
          {ESLVal fs = $2482;
          
          {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1976 = $qualArg;
                  
                  switch(_v1976.termName) {
                  case "JField": {ESLVal $2488 = _v1976.termRef(0);
                    ESLVal $2487 = _v1976.termRef(1);
                    ESLVal $2486 = _v1976.termRef(2);
                    
                    {ESLVal n = $2488;
                    
                    {ESLVal t = $2487;
                    
                    {ESLVal e = $2486;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1976;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(fs).flatten().flatten();
          
          return new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1977 = $qualArg;
                
                switch(_v1977.termName) {
                case "JField": {ESLVal $2491 = _v1977.termRef(0);
                  ESLVal $2490 = _v1977.termRef(1);
                  ESLVal $2489 = _v1977.termRef(2);
                  
                  {ESLVal n = $2491;
                  
                  {ESLVal t = $2490;
                  
                  {ESLVal e = $2489;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1977;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19423,19730)").add(ESLVal.list(_v1975)));
      }
      }
    }
  });
  private static ESLVal renameJVarsExp = new ESLVal(new Function(new ESLVal("renameJVarsExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v1958 = e;
        
        switch(_v1958.termName) {
        case "JFun": {ESLVal $2470 = _v1958.termRef(0);
          ESLVal $2469 = _v1958.termRef(1);
          ESLVal $2468 = _v1958.termRef(2);
          ESLVal $2467 = _v1958.termRef(3);
          
          {ESLVal v0 = $2470;
          
          {ESLVal v1 = $2469;
          
          {ESLVal v2 = $2468;
          
          {ESLVal v3 = $2467;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1972 = $qualArg;
                  
                  switch(_v1972.termName) {
                  case "JDec": {ESLVal $2481 = _v1972.termRef(0);
                    ESLVal $2480 = _v1972.termRef(1);
                    
                    {ESLVal n = $2481;
                    
                    {ESLVal t = $2480;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1972;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v1).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun825"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,boundNames);
          }
        }),vars).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1973 = $qualArg;
                    
                    {ESLVal n = _v1973;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JFun",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1974 = $qualArg;
                  
                  {ESLVal n = _v1974;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JDec",n,$null)));
                }
                }
              }
            }).map(newNames).flatten().flatten(),v2,renameJVarsCommand.apply(v3,boundNames.add(vars),env1));
          }
          }
          else
            return new ESLVal("JFun",v0,v1,v2,renameJVarsCommand.apply(v3,boundNames.add(vars),env));
        }
        }
        }
        }
        }
        }
      case "JApply": {ESLVal $2466 = _v1958.termRef(0);
          ESLVal $2465 = _v1958.termRef(1);
          
          {ESLVal v0 = $2466;
          
          {ESLVal v1 = $2465;
          
          return new ESLVal("JApply",renameJVarsExp.apply(v0,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1971 = $qualArg;
                
                {ESLVal v = _v1971;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JArrayRef": {ESLVal $2464 = _v1958.termRef(0);
          ESLVal $2463 = _v1958.termRef(1);
          
          {ESLVal a = $2464;
          
          {ESLVal i = $2463;
          
          return new ESLVal("JArrayRef",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $2462 = _v1958.termRef(0);
          ESLVal $2461 = _v1958.termRef(1);
          ESLVal $2460 = _v1958.termRef(2);
          
          {ESLVal a = $2462;
          
          {ESLVal i = $2461;
          
          {ESLVal v = $2460;
          
          return new ESLVal("JArrayUpdate",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env),renameJVarsExp.apply(v,vars,env));
        }
        }
        }
        }
      case "JBecome": {ESLVal $2459 = _v1958.termRef(0);
          ESLVal $2458 = _v1958.termRef(1);
          
          {ESLVal _v2040 = $2459;
          
          {ESLVal es = $2458;
          
          return new ESLVal("JBecome",renameJVarsExp.apply(_v2040,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1970 = $qualArg;
                
                {ESLVal v = _v1970;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "JBinExp": {ESLVal $2457 = _v1958.termRef(0);
          ESLVal $2456 = _v1958.termRef(1);
          ESLVal $2455 = _v1958.termRef(2);
          
          {ESLVal v0 = $2457;
          
          {ESLVal v1 = $2456;
          
          {ESLVal v2 = $2455;
          
          return new ESLVal("JBinExp",renameJVarsExp.apply(v0,vars,env),v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $2454 = _v1958.termRef(0);
          ESLVal $2453 = _v1958.termRef(1);
          
          {ESLVal v0 = $2454;
          
          {ESLVal v1 = $2453;
          
          return new ESLVal("JCommandExp",renameJVarsCommand.apply(v0,vars,env),v1);
        }
        }
        }
      case "JIfExp": {ESLVal $2452 = _v1958.termRef(0);
          ESLVal $2451 = _v1958.termRef(1);
          ESLVal $2450 = _v1958.termRef(2);
          
          {ESLVal v0 = $2452;
          
          {ESLVal v1 = $2451;
          
          {ESLVal v2 = $2450;
          
          return new ESLVal("JIfExp",renameJVarsExp.apply(v0,vars,env),renameJVarsExp.apply(v1,vars,env),renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $2449 = _v1958.termRef(0);
          
          {ESLVal v0 = $2449;
          
          return e;
        }
        }
      case "JTerm": {ESLVal $2448 = _v1958.termRef(0);
          ESLVal $2447 = _v1958.termRef(1);
          
          {ESLVal v0 = $2448;
          
          {ESLVal v1 = $2447;
          
          return new ESLVal("JTerm",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1969 = $qualArg;
                
                {ESLVal v = _v1969;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JTermRef": {ESLVal $2446 = _v1958.termRef(0);
          ESLVal $2445 = _v1958.termRef(1);
          
          {ESLVal v0 = $2446;
          
          {ESLVal v1 = $2445;
          
          return new ESLVal("JTermRef",renameJVarsExp.apply(v0,vars,env),v1);
        }
        }
        }
      case "JList": {ESLVal $2444 = _v1958.termRef(0);
          ESLVal $2443 = _v1958.termRef(1);
          
          {ESLVal v0 = $2444;
          
          {ESLVal v1 = $2443;
          
          return new ESLVal("JList",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1968 = $qualArg;
                
                {ESLVal v = _v1968;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JSet": {ESLVal $2442 = _v1958.termRef(0);
          ESLVal $2441 = _v1958.termRef(1);
          
          {ESLVal v0 = $2442;
          
          {ESLVal v1 = $2441;
          
          return new ESLVal("JSet",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1967 = $qualArg;
                
                {ESLVal v = _v1967;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JBag": {ESLVal $2440 = _v1958.termRef(0);
          ESLVal $2439 = _v1958.termRef(1);
          
          {ESLVal v0 = $2440;
          
          {ESLVal v1 = $2439;
          
          return new ESLVal("JBag",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1966 = $qualArg;
                
                {ESLVal v = _v1966;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JNil": {ESLVal $2438 = _v1958.termRef(0);
          
          {ESLVal v0 = $2438;
          
          return e;
        }
        }
      case "JNow": {
          return e;
        }
      case "JVar": {ESLVal $2437 = _v1958.termRef(0);
          ESLVal $2436 = _v1958.termRef(1);
          
          {ESLVal v0 = $2437;
          
          {ESLVal v1 = $2436;
          
          if(hasEntry.apply(v0,env).boolVal)
          return new ESLVal("JVar",lookup.apply(v0,env),v1);
          else
            return e;
        }
        }
        }
      case "JNull": {
          return e;
        }
      case "JError": {ESLVal $2435 = _v1958.termRef(0);
          
          {ESLVal v0 = $2435;
          
          return new ESLVal("JError",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JHead": {ESLVal $2434 = _v1958.termRef(0);
          
          {ESLVal v0 = $2434;
          
          return new ESLVal("JHead",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JTail": {ESLVal $2433 = _v1958.termRef(0);
          
          {ESLVal v0 = $2433;
          
          return new ESLVal("JTail",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JCastp": {ESLVal $2432 = _v1958.termRef(0);
          ESLVal $2431 = _v1958.termRef(1);
          ESLVal $2430 = _v1958.termRef(2);
          
          {ESLVal v0 = $2432;
          
          {ESLVal v1 = $2431;
          
          {ESLVal v2 = $2430;
          
          return new ESLVal("JCastp",v0,v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCast": {ESLVal $2429 = _v1958.termRef(0);
          ESLVal $2428 = _v1958.termRef(1);
          
          {ESLVal v0 = $2429;
          
          {ESLVal v1 = $2428;
          
          return new ESLVal("JCast",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JCmpExp": {ESLVal $2427 = _v1958.termRef(0);
          
          {ESLVal cmp = $2427;
          
          return new ESLVal("JCmpExp",renameJVarsCmp.apply(cmp,vars,env));
        }
        }
      case "JNot": {ESLVal $2426 = _v1958.termRef(0);
          
          {ESLVal _v2039 = $2426;
          
          return new ESLVal("JNot",renameJVarsExp.apply(_v2039,vars,env));
        }
        }
      case "JNew": {ESLVal $2425 = _v1958.termRef(0);
          ESLVal $2424 = _v1958.termRef(1);
          
          {ESLVal b = $2425;
          
          {ESLVal args = $2424;
          
          return new ESLVal("JNew",renameJVarsExp.apply(b,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1965 = $qualArg;
                
                {ESLVal a = _v1965;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewArray": {ESLVal $2423 = _v1958.termRef(0);
          
          {ESLVal b = $2423;
          
          return new ESLVal("JNewArray",renameJVarsExp.apply(b,vars,env));
        }
        }
      case "JNewJava": {ESLVal $2422 = _v1958.termRef(0);
          ESLVal $2421 = _v1958.termRef(1);
          
          {ESLVal n = $2422;
          
          {ESLVal args = $2421;
          
          return new ESLVal("JNewJava",n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1964 = $qualArg;
                
                {ESLVal a = _v1964;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewTable": {
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
      case "JMapFun": {ESLVal $2420 = _v1958.termRef(0);
          ESLVal $2419 = _v1958.termRef(1);
          
          {ESLVal f = $2420;
          
          {ESLVal l = $2419;
          
          return new ESLVal("JMapFun",renameJVarsExp.apply(f,vars,env),renameJVarsExp.apply(l,vars,env));
        }
        }
        }
      case "JRecord": {ESLVal $2418 = _v1958.termRef(0);
          
          {ESLVal fs = $2418;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1963 = $qualArg;
                
                switch(_v1963.termName) {
                case "JField": {ESLVal $2479 = _v1963.termRef(0);
                  ESLVal $2478 = _v1963.termRef(1);
                  ESLVal $2477 = _v1963.termRef(2);
                  
                  {ESLVal n = $2479;
                  
                  {ESLVal t = $2478;
                  
                  {ESLVal _v2038 = $2477;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v2038,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1963;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
      case "JFlatten": {ESLVal $2417 = _v1958.termRef(0);
          
          {ESLVal _v2037 = $2417;
          
          return new ESLVal("JFlatten",renameJVarsExp.apply(_v2037,vars,env));
        }
        }
      case "JSend": {ESLVal $2416 = _v1958.termRef(0);
          ESLVal $2415 = _v1958.termRef(1);
          ESLVal $2414 = _v1958.termRef(2);
          
          {ESLVal _v2035 = $2416;
          
          {ESLVal n = $2415;
          
          {ESLVal es = $2414;
          
          return new ESLVal("JSend",renameJVarsExp.apply(_v2035,vars,env),n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1962 = $qualArg;
                
                {ESLVal _v2036 = _v1962;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v2036,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $2413 = _v1958.termRef(0);
          
          {ESLVal _v2034 = $2413;
          
          return new ESLVal("JSendSuper",renameJVarsExp.apply(_v2034,vars,env));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
      case "JSelf": {
          return new ESLVal("JSelf",new ESLVal[]{});
        }
      case "JRef": {ESLVal $2412 = _v1958.termRef(0);
          ESLVal $2411 = _v1958.termRef(1);
          
          {ESLVal _v2033 = $2412;
          
          {ESLVal n = $2411;
          
          return new ESLVal("JRef",renameJVarsExp.apply(_v2033,vars,env),n);
        }
        }
        }
      case "JRefSuper": {ESLVal $2410 = _v1958.termRef(0);
          
          {ESLVal n = $2410;
          
          return new ESLVal("JRefSuper",n);
        }
        }
      case "JBehaviour": {ESLVal $2409 = _v1958.termRef(0);
          ESLVal $2408 = _v1958.termRef(1);
          ESLVal $2407 = _v1958.termRef(2);
          ESLVal $2406 = _v1958.termRef(3);
          ESLVal $2405 = _v1958.termRef(4);
          
          {ESLVal es = $2409;
          
          {ESLVal fs = $2408;
          
          {ESLVal init = $2407;
          
          {ESLVal handler = $2406;
          
          {ESLVal time = $2405;
          
          return new ESLVal("JBehaviour",es,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1961 = $qualArg;
                
                switch(_v1961.termName) {
                case "JField": {ESLVal $2476 = _v1961.termRef(0);
                  ESLVal $2475 = _v1961.termRef(1);
                  ESLVal $2474 = _v1961.termRef(2);
                  
                  {ESLVal n = $2476;
                  
                  {ESLVal t = $2475;
                  
                  {ESLVal _v2032 = $2474;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v2032,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1961;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),renameJVarsExp.apply(init,vars,env),renameJVarsExp.apply(handler,vars,env),renameJVarsCommand.apply(time,vars,env));
        }
        }
        }
        }
        }
        }
      case "JExtendedBehaviour": {ESLVal $2404 = _v1958.termRef(0);
          ESLVal $2403 = _v1958.termRef(1);
          ESLVal $2402 = _v1958.termRef(2);
          ESLVal $2401 = _v1958.termRef(3);
          ESLVal $2400 = _v1958.termRef(4);
          ESLVal $2399 = _v1958.termRef(5);
          
          {ESLVal es = $2404;
          
          {ESLVal parent = $2403;
          
          {ESLVal fs = $2402;
          
          {ESLVal init = $2401;
          
          {ESLVal handler = $2400;
          
          {ESLVal time = $2399;
          
          return new ESLVal("JExtendedBehaviour",es,renameJVarsExp.apply(parent,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1960 = $qualArg;
                
                switch(_v1960.termName) {
                case "JField": {ESLVal $2473 = _v1960.termRef(0);
                  ESLVal $2472 = _v1960.termRef(1);
                  ESLVal $2471 = _v1960.termRef(2);
                  
                  {ESLVal n = $2473;
                  
                  {ESLVal t = $2472;
                  
                  {ESLVal _v2031 = $2471;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v2031,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1960;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),renameJVarsExp.apply(init,vars,env),renameJVarsExp.apply(handler,vars,env),renameJVarsCommand.apply(time,vars,env));
        }
        }
        }
        }
        }
        }
        }
      case "JTry": {ESLVal $2398 = _v1958.termRef(0);
          ESLVal $2397 = _v1958.termRef(1);
          ESLVal $2396 = _v1958.termRef(2);
          
          {ESLVal _v2030 = $2398;
          
          {ESLVal n = $2397;
          
          {ESLVal c = $2396;
          
          return new ESLVal("JTry",renameJVarsExp.apply(_v2030,vars,env),n,renameJVarsCommand.apply(c,vars,env));
        }
        }
        }
        }
      case "JProbably": {ESLVal $2395 = _v1958.termRef(0);
          ESLVal $2394 = _v1958.termRef(1);
          ESLVal $2393 = _v1958.termRef(2);
          
          {ESLVal _v2029 = $2395;
          
          {ESLVal e1 = $2394;
          
          {ESLVal e2 = $2393;
          
          return new ESLVal("JProbably",renameJVarsExp.apply(_v2029,vars,env),renameJVarsExp.apply(e1,vars,env),renameJVarsExp.apply(e2,vars,env));
        }
        }
        }
        }
      case "JGrab": {ESLVal $2392 = _v1958.termRef(0);
          ESLVal $2391 = _v1958.termRef(1);
          
          {ESLVal es = $2392;
          
          {ESLVal c = $2391;
          
          return new ESLVal("JGrab",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1959 = $qualArg;
                
                {ESLVal _v2028 = _v1959;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v2028,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten(),renameJVarsExp.apply(c,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19800,24444)").add(ESLVal.list(_v1958)));
      }
      }
    }
  });
  private static ESLVal renameJVarsCmp = new ESLVal(new Function(new ESLVal("renameJVarsCmp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v1957 = c;
        
        switch(_v1957.termName) {
        case "JCmpList": {ESLVal $2390 = _v1957.termRef(0);
          
          {ESLVal e = $2390;
          
          return new ESLVal("JCmpList",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JCmpOuter": {ESLVal $2389 = _v1957.termRef(0);
          ESLVal $2388 = _v1957.termRef(1);
          ESLVal $2387 = _v1957.termRef(2);
          
          {ESLVal n = $2389;
          
          {ESLVal e = $2388;
          
          {ESLVal _v2025 = $2387;
          
          {ESLVal _v2027 = remove.apply(n,vars);
          ESLVal _v2026 = addEntry.apply(n,n,env);
          
          return new ESLVal("JCmpOuter",n,renameJVarsExp.apply(e,_v2027,_v2026),renameJVarsCmp.apply(_v2025,_v2027,_v2026));
        }
        }
        }
        }
        }
      case "JCmpBind": {ESLVal $2386 = _v1957.termRef(0);
          ESLVal $2385 = _v1957.termRef(1);
          ESLVal $2384 = _v1957.termRef(2);
          
          {ESLVal n = $2386;
          
          {ESLVal e = $2385;
          
          {ESLVal _v2022 = $2384;
          
          {ESLVal _v2024 = remove.apply(n,vars);
          ESLVal _v2023 = addEntry.apply(n,n,env);
          
          return new ESLVal("JCmpBind",n,renameJVarsExp.apply(e,_v2024,_v2023),renameJVarsCmp.apply(_v2022,_v2024,_v2023));
        }
        }
        }
        }
        }
      case "JCmpIf": {ESLVal $2383 = _v1957.termRef(0);
          ESLVal $2382 = _v1957.termRef(1);
          
          {ESLVal e = $2383;
          
          {ESLVal _v2021 = $2382;
          
          return new ESLVal("JCmpIf",renameJVarsExp.apply(e,vars,env),renameJVarsCmp.apply(_v2021,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(24519,25100)").add(ESLVal.list(_v1957)));
      }
      }
    }
  });
  private static ESLVal nameCount = $zero;
  private static ESLVal newName = new ESLVal(new Function(new ESLVal("newName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {nameCount = nameCount.add($one);
      return new ESLVal("_v").add(nameCount);}
    }
  });
  private static ESLVal renameJVarsCommand = new ESLVal(new Function(new ESLVal("renameJVarsCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v1939 = c;
        
        switch(_v1939.termName) {
        case "JBlock": {ESLVal $2345 = _v1939.termRef(0);
          
          {ESLVal v0 = $2345;
          
          return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1956 = $qualArg;
                
                {ESLVal _v2020 = _v1956;
                
                return ESLVal.list(ESLVal.list(renameJVarsCommand.apply(_v2020,vars,env)));
              }
              }
            }
          }).map(v0).flatten().flatten());
        }
        }
      case "JReturn": {ESLVal $2344 = _v1939.termRef(0);
          
          {ESLVal v0 = $2344;
          
          return new ESLVal("JReturn",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JSwitch": {ESLVal $2343 = _v1939.termRef(0);
          ESLVal $2342 = _v1939.termRef(1);
          ESLVal $2341 = _v1939.termRef(2);
          
          {ESLVal v0 = $2343;
          
          {ESLVal v1 = $2342;
          
          {ESLVal v2 = $2341;
          
          return error(new ESLVal("jswitch should not occur"));
        }
        }
        }
        }
      case "JSwitchList": {ESLVal $2340 = _v1939.termRef(0);
          ESLVal $2339 = _v1939.termRef(1);
          ESLVal $2338 = _v1939.termRef(2);
          ESLVal $2337 = _v1939.termRef(3);
          
          {ESLVal v0 = $2340;
          
          {ESLVal v1 = $2339;
          
          {ESLVal v2 = $2338;
          
          {ESLVal v3 = $2337;
          
          return new ESLVal("JSwitchList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JIfCommand": {ESLVal $2336 = _v1939.termRef(0);
          ESLVal $2335 = _v1939.termRef(1);
          ESLVal $2334 = _v1939.termRef(2);
          
          {ESLVal v0 = $2336;
          
          {ESLVal v1 = $2335;
          
          {ESLVal v2 = $2334;
          
          return new ESLVal("JIfCommand",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $2333 = _v1939.termRef(0);
          ESLVal $2332 = _v1939.termRef(1);
          ESLVal $2331 = _v1939.termRef(2);
          ESLVal $2330 = _v1939.termRef(3);
          
          {ESLVal v0 = $2333;
          
          {ESLVal v1 = $2332;
          
          {ESLVal v2 = $2331;
          
          {ESLVal v3 = $2330;
          
          return new ESLVal("JCaseList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $2329 = _v1939.termRef(0);
          ESLVal $2328 = _v1939.termRef(1);
          ESLVal $2327 = _v1939.termRef(2);
          
          {ESLVal e = $2329;
          
          {ESLVal arms = $2328;
          
          {ESLVal alt = $2327;
          
          return new ESLVal("JCaseInt",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1955 = $qualArg;
                
                switch(_v1955.termName) {
                case "JIArm": {ESLVal $2381 = _v1955.termRef(0);
                  ESLVal $2380 = _v1955.termRef(1);
                  
                  {ESLVal n = $2381;
                  
                  {ESLVal _v2019 = $2380;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand.apply(_v2019,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1955;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $2326 = _v1939.termRef(0);
          ESLVal $2325 = _v1939.termRef(1);
          ESLVal $2324 = _v1939.termRef(2);
          
          {ESLVal e = $2326;
          
          {ESLVal arms = $2325;
          
          {ESLVal alt = $2324;
          
          return new ESLVal("JCaseStr",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1954 = $qualArg;
                
                switch(_v1954.termName) {
                case "JSArm": {ESLVal $2379 = _v1954.termRef(0);
                  ESLVal $2378 = _v1954.termRef(1);
                  
                  {ESLVal s = $2379;
                  
                  {ESLVal _v2018 = $2378;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand.apply(_v2018,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1954;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $2323 = _v1939.termRef(0);
          ESLVal $2322 = _v1939.termRef(1);
          ESLVal $2321 = _v1939.termRef(2);
          
          {ESLVal e = $2323;
          
          {ESLVal arms = $2322;
          
          {ESLVal alt = $2321;
          
          return new ESLVal("JCaseBool",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1953 = $qualArg;
                
                switch(_v1953.termName) {
                case "JBArm": {ESLVal $2377 = _v1953.termRef(0);
                  ESLVal $2376 = _v1953.termRef(1);
                  
                  {ESLVal b = $2377;
                  
                  {ESLVal _v2017 = $2376;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand.apply(_v2017,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1953;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $2320 = _v1939.termRef(0);
          ESLVal $2319 = _v1939.termRef(1);
          ESLVal $2318 = _v1939.termRef(2);
          
          {ESLVal e = $2320;
          
          {ESLVal arms = $2319;
          
          {ESLVal alt = $2318;
          
          return new ESLVal("JCaseTerm",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1952 = $qualArg;
                
                switch(_v1952.termName) {
                case "JTArm": {ESLVal $2375 = _v1952.termRef(0);
                  ESLVal $2374 = _v1952.termRef(1);
                  ESLVal $2373 = _v1952.termRef(2);
                  
                  {ESLVal n = $2375;
                  
                  {ESLVal i = $2374;
                  
                  {ESLVal _v2016 = $2373;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand.apply(_v2016,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1952;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JLet": {ESLVal $2317 = _v1939.termRef(0);
          ESLVal $2316 = _v1939.termRef(1);
          
          {ESLVal v0 = $2317;
          
          {ESLVal v1 = $2316;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1948 = $qualArg;
                  
                  switch(_v1948.termName) {
                  case "JField": {ESLVal $2366 = _v1948.termRef(0);
                    ESLVal $2365 = _v1948.termRef(1);
                    ESLVal $2364 = _v1948.termRef(2);
                    
                    {ESLVal n = $2366;
                    
                    {ESLVal t = $2365;
                    
                    {ESLVal e = $2364;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1948;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun826"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1949 = $qualArg;
                    
                    {ESLVal n = _v1949;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1950 = $qualArg;
                  
                  switch(_v1950.termName) {
                  case "JField": {ESLVal $2369 = _v1950.termRef(0);
                    ESLVal $2368 = _v1950.termRef(1);
                    ESLVal $2367 = _v1950.termRef(2);
                    
                    {ESLVal n = $2369;
                    
                    {ESLVal t = $2368;
                    
                    {ESLVal e = $2367;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1950;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env1));
          }
          }
          else
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1951 = $qualArg;
                    
                    switch(_v1951.termName) {
                    case "JField": {ESLVal $2372 = _v1951.termRef(0);
                      ESLVal $2371 = _v1951.termRef(1);
                      ESLVal $2370 = _v1951.termRef(2);
                      
                      {ESLVal n = $2372;
                      
                      {ESLVal t = $2371;
                      
                      {ESLVal e = $2370;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1951;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env));
        }
        }
        }
        }
      case "JPLet": {ESLVal $2315 = _v1939.termRef(0);
          ESLVal $2314 = _v1939.termRef(1);
          
          {ESLVal v0 = $2315;
          
          {ESLVal v1 = $2314;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1944 = $qualArg;
                  
                  switch(_v1944.termName) {
                  case "JField": {ESLVal $2357 = _v1944.termRef(0);
                    ESLVal $2356 = _v1944.termRef(1);
                    ESLVal $2355 = _v1944.termRef(2);
                    
                    {ESLVal n = $2357;
                    
                    {ESLVal t = $2356;
                    
                    {ESLVal e = $2355;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1944;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun827"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1945 = $qualArg;
                    
                    {ESLVal n = _v1945;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1946 = $qualArg;
                  
                  switch(_v1946.termName) {
                  case "JField": {ESLVal $2360 = _v1946.termRef(0);
                    ESLVal $2359 = _v1946.termRef(1);
                    ESLVal $2358 = _v1946.termRef(2);
                    
                    {ESLVal n = $2360;
                    
                    {ESLVal t = $2359;
                    
                    {ESLVal e = $2358;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1946;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env1));
          }
          }
          else
            return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1947 = $qualArg;
                    
                    switch(_v1947.termName) {
                    case "JField": {ESLVal $2363 = _v1947.termRef(0);
                      ESLVal $2362 = _v1947.termRef(1);
                      ESLVal $2361 = _v1947.termRef(2);
                      
                      {ESLVal n = $2363;
                      
                      {ESLVal t = $2362;
                      
                      {ESLVal e = $2361;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1947;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env));
        }
        }
        }
        }
      case "JLetRec": {ESLVal $2313 = _v1939.termRef(0);
          ESLVal $2312 = _v1939.termRef(1);
          
          {ESLVal v0 = $2313;
          
          {ESLVal v1 = $2312;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1940 = $qualArg;
                  
                  switch(_v1940.termName) {
                  case "JField": {ESLVal $2348 = _v1940.termRef(0);
                    ESLVal $2347 = _v1940.termRef(1);
                    ESLVal $2346 = _v1940.termRef(2);
                    
                    {ESLVal n = $2348;
                    
                    {ESLVal t = $2347;
                    
                    {ESLVal e = $2346;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1940;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun828"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1941 = $qualArg;
                    
                    {ESLVal n = _v1941;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal _v2015 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1942 = $qualArg;
                  
                  switch(_v1942.termName) {
                  case "JField": {ESLVal $2351 = _v1942.termRef(0);
                    ESLVal $2350 = _v1942.termRef(1);
                    ESLVal $2349 = _v1942.termRef(2);
                    
                    {ESLVal n = $2351;
                    
                    {ESLVal t = $2350;
                    
                    {ESLVal e = $2349;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,_v2015),t,renameJVarsExp.apply(e,vars,_v2015))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1942;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),_v2015));
          }
          }
          else
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1943 = $qualArg;
                    
                    switch(_v1943.termName) {
                    case "JField": {ESLVal $2354 = _v1943.termRef(0);
                      ESLVal $2353 = _v1943.termRef(1);
                      ESLVal $2352 = _v1943.termRef(2);
                      
                      {ESLVal n = $2354;
                      
                      {ESLVal t = $2353;
                      
                      {ESLVal e = $2352;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1943;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env));
        }
        }
        }
        }
      case "JStatement": {ESLVal $2311 = _v1939.termRef(0);
          
          {ESLVal e = $2311;
          
          return new ESLVal("JStatement",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JUpdate": {ESLVal $2310 = _v1939.termRef(0);
          ESLVal $2309 = _v1939.termRef(1);
          
          {ESLVal name = $2310;
          
          {ESLVal value = $2309;
          
          if(hasEntry.apply(name,env).boolVal)
          return new ESLVal("JUpdate",lookup.apply(name,env),renameJVarsExp.apply(value,vars,env));
          else
            {ESLVal v0 = $2310;
              
              {ESLVal v1 = $2309;
              
              return new ESLVal("JUpdate",v0,renameJVarsExp.apply(v1,vars,env));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $2308 = _v1939.termRef(0);
          ESLVal $2307 = _v1939.termRef(1);
          ESLVal $2306 = _v1939.termRef(2);
          ESLVal $2305 = _v1939.termRef(3);
          
          {ESLVal l = $2308;
          
          {ESLVal n = $2307;
          
          {ESLVal e = $2306;
          
          {ESLVal _v2014 = $2305;
          
          return new ESLVal("JFor",l,n,renameJVarsExp.apply(e,vars,env),renameJVarsCommand.apply(_v2014,vars,env));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(25338,29746)").add(ESLVal.list(_v1939)));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1938 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1938)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {print.apply(new ESLVal("").add(emptyTable));
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