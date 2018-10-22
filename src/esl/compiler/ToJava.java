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
  {ESLVal _v1584 = d;
        
        switch(_v1584.termName) {
        case "Binding": {ESLVal $2163 = _v1584.termRef(0);
          ESLVal $2162 = _v1584.termRef(1);
          ESLVal $2161 = _v1584.termRef(2);
          ESLVal $2160 = _v1584.termRef(3);
          ESLVal $2159 = _v1584.termRef(4);
          
          {ESLVal l = $2163;
          
          {ESLVal n = $2162;
          
          {ESLVal t = $2161;
          
          {ESLVal st = $2160;
          
          {ESLVal e = $2159;
          
          return new ESLVal("JField",n,$null,expToJExp.apply(e));
        }
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $2156 = _v1584.termRef(0);
          ESLVal $2155 = _v1584.termRef(1);
          ESLVal $2154 = _v1584.termRef(2);
          ESLVal $2153 = _v1584.termRef(3);
          ESLVal $2152 = _v1584.termRef(4);
          ESLVal $2151 = _v1584.termRef(5);
          ESLVal $2150 = _v1584.termRef(6);
          
          switch($2150.termName) {
          case "BoolExp": {ESLVal $2158 = $2150.termRef(0);
            ESLVal $2157 = $2150.termRef(1);
            
            switch($2157.boolVal ? 1 : 0) {
            case 1: {ESLVal l = $2156;
              
              {ESLVal n = $2155;
              
              {ESLVal args = $2154;
              
              {ESLVal t = $2153;
              
              {ESLVal st = $2152;
              
              {ESLVal e = $2151;
              
              {ESLVal bl = $2158;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v1585 = $qualArg;
                      
                      switch(_v1585.termName) {
                      case "PVar": {ESLVal $2166 = _v1585.termRef(0);
                        ESLVal $2165 = _v1585.termRef(1);
                        ESLVal $2164 = _v1585.termRef(2);
                        
                        {ESLVal _v1666 = $2166;
                        
                        {ESLVal _v1667 = $2165;
                        
                        {ESLVal _v1668 = $2164;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1666,_v1667,_v1668,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v1585;
                        
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
            default: {ESLVal l = $2156;
              
              {ESLVal n = $2155;
              
              {ESLVal args = $2154;
              
              {ESLVal t = $2153;
              
              {ESLVal st = $2152;
              
              {ESLVal e = $2151;
              
              {ESLVal g = $2150;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v1586 = $qualArg;
                      
                      switch(_v1586.termName) {
                      case "PVar": {ESLVal $2169 = _v1586.termRef(0);
                        ESLVal $2168 = _v1586.termRef(1);
                        ESLVal $2167 = _v1586.termRef(2);
                        
                        {ESLVal _v1669 = $2169;
                        
                        {ESLVal _v1670 = $2168;
                        
                        {ESLVal _v1671 = $2167;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1669,_v1670,_v1671,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v1586;
                        
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
          default: {ESLVal l = $2156;
            
            {ESLVal n = $2155;
            
            {ESLVal args = $2154;
            
            {ESLVal t = $2153;
            
            {ESLVal st = $2152;
            
            {ESLVal e = $2151;
            
            {ESLVal g = $2150;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1587 = $qualArg;
                    
                    switch(_v1587.termName) {
                    case "PVar": {ESLVal $2172 = _v1587.termRef(0);
                      ESLVal $2171 = _v1587.termRef(1);
                      ESLVal $2170 = _v1587.termRef(2);
                      
                      {ESLVal _v1672 = $2172;
                      
                      {ESLVal _v1673 = $2171;
                      
                      {ESLVal _v1674 = $2170;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v1672,_v1673,_v1674,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1587;
                      
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
        default: return error(new ESLVal("case error at Pos(172,826)"));
      }
      }
    }
  });
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v1583 = d;
        
        switch(_v1583.termName) {
        case "Dec": {ESLVal $2149 = _v1583.termRef(0);
          ESLVal $2148 = _v1583.termRef(1);
          ESLVal $2147 = _v1583.termRef(2);
          ESLVal $2146 = _v1583.termRef(3);
          
          {ESLVal l = $2149;
          
          {ESLVal n = $2148;
          
          {ESLVal t = $2147;
          
          {ESLVal st = $2146;
          
          return new ESLVal("JDec",n,$null);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(870,946)"));
      }
      }
    }
  });
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cs = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1582 = cs;
        
        if(_v1582.isCons())
        {ESLVal $2142 = _v1582.head();
          ESLVal $2143 = _v1582.tail();
          
          if($2143.isCons())
          {ESLVal $2144 = $2143.head();
            ESLVal $2145 = $2143.tail();
            
            {ESLVal c = $2142;
            
            {ESLVal _v1664 = $2143;
            
            return expsToJCommands.apply(_v1664,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
          }
        else if($2143.isNil())
          {ESLVal c = $2142;
            
            return ESLVal.list(expToJCommand.apply(c,isLast));
          }
        else {ESLVal c = $2142;
            
            {ESLVal _v1665 = $2143;
            
            return expsToJCommands.apply(_v1665,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
        }
      else if(_v1582.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1004,1164)"));
      }
    }
  });
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1576 = c;
        
        switch(_v1576.termName) {
        case "Block": {ESLVal $2137 = _v1576.termRef(0);
          ESLVal $2136 = _v1576.termRef(1);
          
          if($2136.isCons())
          {ESLVal $2138 = $2136.head();
            ESLVal $2139 = $2136.tail();
            
            if($2139.isCons())
            {ESLVal $2140 = $2139.head();
              ESLVal $2141 = $2139.tail();
              
              {ESLVal l = $2137;
              
              {ESLVal es = $2136;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1579 = $qualArg;
                    
                    {ESLVal e = _v1579;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
            }
          else if($2139.isNil())
            {ESLVal l = $2137;
              
              {ESLVal e = $2138;
              
              return expToJCommand.apply(e,isLast);
            }
            }
          else {ESLVal l = $2137;
              
              {ESLVal es = $2136;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1580 = $qualArg;
                    
                    {ESLVal e = _v1580;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
          }
        else if($2136.isNil())
          {ESLVal l = $2137;
            
            if(isLast.boolVal)
            return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
            else
              {ESLVal _v1662 = $2137;
                
                return new ESLVal("JBlock",$nil);
              }
          }
        else {ESLVal l = $2137;
            
            {ESLVal es = $2136;
            
            return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1581 = $qualArg;
                  
                  {ESLVal e = _v1581;
                  
                  return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                }
                }
              }
            }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
          }
          }
        }
      case "Update": {ESLVal $2135 = _v1576.termRef(0);
          ESLVal $2134 = _v1576.termRef(1);
          ESLVal $2133 = _v1576.termRef(2);
          
          {ESLVal l = $2135;
          
          {ESLVal n = $2134;
          
          {ESLVal e = $2133;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp.apply(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v1659 = $2135;
              
              {ESLVal _v1660 = $2134;
              
              {ESLVal _v1661 = $2133;
              
              return new ESLVal("JUpdate",_v1660,expToJExp.apply(_v1661));
            }
            }
            }
        }
        }
        }
        }
      case "If": {ESLVal $2132 = _v1576.termRef(0);
          ESLVal $2131 = _v1576.termRef(1);
          ESLVal $2130 = _v1576.termRef(2);
          ESLVal $2129 = _v1576.termRef(3);
          
          {ESLVal l = $2132;
          
          {ESLVal e1 = $2131;
          
          {ESLVal e2 = $2130;
          
          {ESLVal e3 = $2129;
          
          return new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,isLast),expToJCommand.apply(e3,isLast));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $2128 = _v1576.termRef(0);
          ESLVal $2127 = _v1576.termRef(1);
          ESLVal $2126 = _v1576.termRef(2);
          ESLVal $2125 = _v1576.termRef(3);
          ESLVal $2124 = _v1576.termRef(4);
          
          {ESLVal l = $2128;
          
          {ESLVal e = $2127;
          
          {ESLVal cons = $2126;
          
          {ESLVal nil = $2125;
          
          {ESLVal alt = $2124;
          
          return new ESLVal("JCaseList",expToJExp.apply(e),expToJCommand.apply(cons,isLast),expToJCommand.apply(nil,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $2123 = _v1576.termRef(0);
          ESLVal $2122 = _v1576.termRef(1);
          ESLVal $2121 = _v1576.termRef(2);
          ESLVal $2120 = _v1576.termRef(3);
          
          {ESLVal l = $2123;
          
          {ESLVal e = $2122;
          
          {ESLVal arms = $2121;
          
          {ESLVal alt = $2120;
          
          return new ESLVal("JCaseTerm",expToJExp.apply(e),termArmsToJTermArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $2119 = _v1576.termRef(0);
          ESLVal $2118 = _v1576.termRef(1);
          ESLVal $2117 = _v1576.termRef(2);
          ESLVal $2116 = _v1576.termRef(3);
          
          {ESLVal l = $2119;
          
          {ESLVal e = $2118;
          
          {ESLVal arms = $2117;
          
          {ESLVal alt = $2116;
          
          return new ESLVal("JCaseInt",expToJExp.apply(e),intArmsToJIntArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $2115 = _v1576.termRef(0);
          ESLVal $2114 = _v1576.termRef(1);
          ESLVal $2113 = _v1576.termRef(2);
          ESLVal $2112 = _v1576.termRef(3);
          
          {ESLVal l = $2115;
          
          {ESLVal e = $2114;
          
          {ESLVal arms = $2113;
          
          {ESLVal alt = $2112;
          
          return new ESLVal("JCaseStr",expToJExp.apply(e),strArmsToJStrArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $2111 = _v1576.termRef(0);
          ESLVal $2110 = _v1576.termRef(1);
          ESLVal $2109 = _v1576.termRef(2);
          ESLVal $2108 = _v1576.termRef(3);
          
          {ESLVal l = $2111;
          
          {ESLVal e = $2110;
          
          {ESLVal arms = $2109;
          
          {ESLVal alt = $2108;
          
          return new ESLVal("JCaseBool",expToJExp.apply(e),boolArmsToJBoolArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $2107 = _v1576.termRef(0);
          ESLVal $2106 = _v1576.termRef(1);
          ESLVal $2105 = _v1576.termRef(2);
          
          {ESLVal l = $2107;
          
          {ESLVal bs = $2106;
          
          {ESLVal e = $2105;
          
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1578 = $qualArg;
                
                {ESLVal b = _v1578;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
      case "Letrec": {ESLVal $2104 = _v1576.termRef(0);
          ESLVal $2103 = _v1576.termRef(1);
          ESLVal $2102 = _v1576.termRef(2);
          
          {ESLVal l = $2104;
          
          {ESLVal bs = $2103;
          
          {ESLVal e = $2102;
          
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1577 = $qualArg;
                
                {ESLVal b = _v1577;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,$true));
        }
        }
        }
        }
      case "For": {ESLVal $2098 = _v1576.termRef(0);
          ESLVal $2097 = _v1576.termRef(1);
          ESLVal $2096 = _v1576.termRef(2);
          ESLVal $2095 = _v1576.termRef(3);
          
          switch($2097.termName) {
          case "PVar": {ESLVal $2101 = $2097.termRef(0);
            ESLVal $2100 = $2097.termRef(1);
            ESLVal $2099 = $2097.termRef(2);
            
            {ESLVal l = $2098;
            
            {ESLVal _v1652 = $2101;
            
            {ESLVal n = $2100;
            
            {ESLVal t = $2099;
            
            {ESLVal e = $2096;
            
            {ESLVal b = $2095;
            
            if(isLast.boolVal)
            return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName.apply(),n,expToJExp.apply(e),expToJCommand.apply(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
            else
              {ESLVal _v1653 = $2098;
                
                {ESLVal _v1654 = $2101;
                
                {ESLVal _v1655 = $2100;
                
                {ESLVal _v1656 = $2099;
                
                {ESLVal _v1657 = $2096;
                
                {ESLVal _v1658 = $2095;
                
                return new ESLVal("JFor",newName.apply(),_v1655,expToJExp.apply(_v1657),expToJCommand.apply(_v1658,$false));
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
          default: {ESLVal l = $2098;
            
            {ESLVal p = $2097;
            
            {ESLVal e = $2096;
            
            {ESLVal b = $2095;
            
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
        default: {ESLVal e = _v1576;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",expToJExp.apply(e));
          else
            {ESLVal _v1663 = _v1576;
              
              return new ESLVal("JStatement",expToJExp.apply(_v1663));
            }
        }
      }
      }
    }
  });
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal es = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun709"),getSelf()) {
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
  {ESLVal _v1575 = arms;
        
        if(_v1575.isCons())
        {ESLVal $2091 = _v1575.head();
          ESLVal $2092 = _v1575.tail();
          
          switch($2091.termName) {
          case "TArm": {ESLVal $2094 = $2091.termRef(0);
            ESLVal $2093 = $2091.termRef(1);
            
            {ESLVal n = $2094;
            
            {ESLVal e = $2093;
            
            {ESLVal _v1651 = $2092;
            
            return termArmsToJTermArms.apply(_v1651,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(3698,3867)"));
        }
        }
      else if(_v1575.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3698,3867)"));
      }
    }
  });
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1574 = arms;
        
        if(_v1574.isCons())
        {ESLVal $2087 = _v1574.head();
          ESLVal $2088 = _v1574.tail();
          
          switch($2087.termName) {
          case "IArm": {ESLVal $2090 = $2087.termRef(0);
            ESLVal $2089 = $2087.termRef(1);
            
            {ESLVal n = $2090;
            
            {ESLVal e = $2089;
            
            {ESLVal _v1650 = $2088;
            
            return intArmsToJIntArms.apply(_v1650,isLast).cons(new ESLVal("JIArm",n,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(3936,4100)"));
        }
        }
      else if(_v1574.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3936,4100)"));
      }
    }
  });
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1573 = arms;
        
        if(_v1573.isCons())
        {ESLVal $2083 = _v1573.head();
          ESLVal $2084 = _v1573.tail();
          
          switch($2083.termName) {
          case "SArm": {ESLVal $2086 = $2083.termRef(0);
            ESLVal $2085 = $2083.termRef(1);
            
            {ESLVal s = $2086;
            
            {ESLVal e = $2085;
            
            {ESLVal _v1649 = $2084;
            
            return strArmsToJStrArms.apply(_v1649,isLast).cons(new ESLVal("JSArm",s,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4169,4333)"));
        }
        }
      else if(_v1573.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4169,4333)"));
      }
    }
  });
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v1572 = arms;
        
        if(_v1572.isCons())
        {ESLVal $2079 = _v1572.head();
          ESLVal $2080 = _v1572.tail();
          
          switch($2079.termName) {
          case "BoolArm": {ESLVal $2082 = $2079.termRef(0);
            ESLVal $2081 = $2079.termRef(1);
            
            {ESLVal b = $2082;
            
            {ESLVal e = $2081;
            
            {ESLVal _v1648 = $2080;
            
            return boolArmsToJBoolArms.apply(_v1648,isLast).cons(new ESLVal("JBArm",b,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4408,4581)"));
        }
        }
      else if(_v1572.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4408,4581)"));
      }
    }
  });
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal op = $args[0];
  {ESLVal _v1571 = op;
        
        switch(_v1571.strVal) {
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
        default: return error(new ESLVal("case error at Pos(4609,4961)"));
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
          {ESLVal _v1568 = $qualArg;
                
                {ESLVal e = _v1568;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Binding",l,newName.apply(),$null,$null,e)));
              }
              }
            }
          }).map(es).flatten().flatten();
        
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1569 = $qualArg;
                
                switch(_v1569.termName) {
                case "Binding": {ESLVal $2078 = _v1569.termRef(0);
                  ESLVal $2077 = _v1569.termRef(1);
                  ESLVal $2076 = _v1569.termRef(2);
                  ESLVal $2075 = _v1569.termRef(3);
                  ESLVal $2074 = _v1569.termRef(4);
                  
                  {ESLVal _v1647 = $2078;
                  
                  {ESLVal n = $2077;
                  
                  {ESLVal dt = $2076;
                  
                  {ESLVal t = $2075;
                  
                  {ESLVal e = $2074;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v1569;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bindings).flatten().flatten();
        
        return expToJExp.apply(new ESLVal("Let",l,bindings,translateCases.apply(new ESLVal("Case",l,ESLVal.list(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1570 = $qualArg;
              
              {ESLVal n = _v1570;
              
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
  {ESLVal _v1566 = e;
        
        switch(_v1566.termName) {
        case "ArrayUpdate": {ESLVal $2073 = _v1566.termRef(0);
          ESLVal $2072 = _v1566.termRef(1);
          ESLVal $2071 = _v1566.termRef(2);
          ESLVal $2070 = _v1566.termRef(3);
          
          {ESLVal l = $2073;
          
          {ESLVal a = $2072;
          
          {ESLVal i = $2071;
          
          {ESLVal v = $2070;
          
          return new ESLVal("JArrayUpdate",expToJExp.apply(a),expToJExp.apply(i),expToJExp.apply(v));
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $2069 = _v1566.termRef(0);
          ESLVal $2068 = _v1566.termRef(1);
          ESLVal $2067 = _v1566.termRef(2);
          
          {ESLVal l = $2069;
          
          {ESLVal a = $2068;
          
          {ESLVal i = $2067;
          
          return new ESLVal("JArrayRef",expToJExp.apply(a),expToJExp.apply(i));
        }
        }
        }
        }
      case "IntExp": {ESLVal $2066 = _v1566.termRef(0);
          ESLVal $2065 = _v1566.termRef(1);
          
          {ESLVal l = $2066;
          
          {ESLVal n = $2065;
          
          return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
        }
        }
        }
      case "StrExp": {ESLVal $2064 = _v1566.termRef(0);
          ESLVal $2063 = _v1566.termRef(1);
          
          {ESLVal l = $2064;
          
          {ESLVal s = $2063;
          
          return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
        }
        }
        }
      case "BoolExp": {ESLVal $2062 = _v1566.termRef(0);
          ESLVal $2061 = _v1566.termRef(1);
          
          {ESLVal l = $2062;
          
          {ESLVal b = $2061;
          
          return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
        }
        }
        }
      case "FloatExp": {ESLVal $2060 = _v1566.termRef(0);
          ESLVal $2059 = _v1566.termRef(1);
          
          {ESLVal l = $2060;
          
          {ESLVal f = $2059;
          
          return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $2045 = _v1566.termRef(0);
          ESLVal $2044 = _v1566.termRef(1);
          ESLVal $2043 = _v1566.termRef(2);
          
          switch($2044.termName) {
          case "List": {ESLVal $2052 = $2044.termRef(0);
            ESLVal $2051 = $2044.termRef(1);
            
            if($2051.isCons())
            {ESLVal $2053 = $2051.head();
              ESLVal $2054 = $2051.tail();
              
              {ESLVal l = $2045;
              
              {ESLVal _v1640 = $2044;
              
              {ESLVal ts = $2043;
              
              return expToJExp.apply(_v1640);
            }
            }
            }
            }
          else if($2051.isNil())
            if($2043.isCons())
              {ESLVal $2055 = $2043.head();
                ESLVal $2056 = $2043.tail();
                
                if($2056.isCons())
                {ESLVal $2057 = $2056.head();
                  ESLVal $2058 = $2056.tail();
                  
                  {ESLVal l = $2045;
                  
                  {ESLVal _v1641 = $2044;
                  
                  {ESLVal ts = $2043;
                  
                  return expToJExp.apply(_v1641);
                }
                }
                }
                }
              else if($2056.isNil())
                {ESLVal l1 = $2045;
                  
                  {ESLVal l2 = $2052;
                  
                  {ESLVal t = $2055;
                  
                  return new ESLVal("JNil",$null);
                }
                }
                }
              else {ESLVal l = $2045;
                  
                  {ESLVal _v1642 = $2044;
                  
                  {ESLVal ts = $2043;
                  
                  return expToJExp.apply(_v1642);
                }
                }
                }
              }
            else if($2043.isNil())
              {ESLVal l = $2045;
                
                {ESLVal _v1643 = $2044;
                
                {ESLVal ts = $2043;
                
                return expToJExp.apply(_v1643);
              }
              }
              }
            else {ESLVal l = $2045;
                
                {ESLVal _v1644 = $2044;
                
                {ESLVal ts = $2043;
                
                return expToJExp.apply(_v1644);
              }
              }
              }
          else {ESLVal l = $2045;
              
              {ESLVal _v1645 = $2044;
              
              {ESLVal ts = $2043;
              
              return expToJExp.apply(_v1645);
            }
            }
            }
          }
        case "NullExp": {ESLVal $2046 = $2044.termRef(0);
            
            if($2043.isCons())
            {ESLVal $2047 = $2043.head();
              ESLVal $2048 = $2043.tail();
              
              if($2048.isCons())
              {ESLVal $2049 = $2048.head();
                ESLVal $2050 = $2048.tail();
                
                {ESLVal l = $2045;
                
                {ESLVal _v1636 = $2044;
                
                {ESLVal ts = $2043;
                
                return expToJExp.apply(_v1636);
              }
              }
              }
              }
            else if($2048.isNil())
              {ESLVal l1 = $2045;
                
                {ESLVal l2 = $2046;
                
                {ESLVal t = $2047;
                
                return new ESLVal("JNull",new ESLVal[]{});
              }
              }
              }
            else {ESLVal l = $2045;
                
                {ESLVal _v1637 = $2044;
                
                {ESLVal ts = $2043;
                
                return expToJExp.apply(_v1637);
              }
              }
              }
            }
          else if($2043.isNil())
            {ESLVal l = $2045;
              
              {ESLVal _v1638 = $2044;
              
              {ESLVal ts = $2043;
              
              return expToJExp.apply(_v1638);
            }
            }
            }
          else {ESLVal l = $2045;
              
              {ESLVal _v1639 = $2044;
              
              {ESLVal ts = $2043;
              
              return expToJExp.apply(_v1639);
            }
            }
            }
          }
          default: {ESLVal l = $2045;
            
            {ESLVal _v1646 = $2044;
            
            {ESLVal ts = $2043;
            
            return expToJExp.apply(_v1646);
          }
          }
          }
        }
        }
      case "List": {ESLVal $2042 = _v1566.termRef(0);
          ESLVal $2041 = _v1566.termRef(1);
          
          {ESLVal l = $2042;
          
          {ESLVal es = $2041;
          
          return new ESLVal("JList",$null,expsToJExps.apply(es));
        }
        }
        }
      case "Term": {ESLVal $2040 = _v1566.termRef(0);
          ESLVal $2039 = _v1566.termRef(1);
          ESLVal $2038 = _v1566.termRef(2);
          ESLVal $2037 = _v1566.termRef(3);
          
          {ESLVal l = $2040;
          
          {ESLVal n = $2039;
          
          {ESLVal ts = $2038;
          
          {ESLVal es = $2037;
          
          return new ESLVal("JTerm",n,expsToJExps.apply(es));
        }
        }
        }
        }
        }
      case "Case": {ESLVal $2036 = _v1566.termRef(0);
          ESLVal $2035 = _v1566.termRef(1);
          ESLVal $2034 = _v1566.termRef(2);
          ESLVal $2033 = _v1566.termRef(3);
          
          {ESLVal l = $2036;
          
          {ESLVal ds = $2035;
          
          {ESLVal es = $2034;
          
          {ESLVal arms = $2033;
          
          return caseToJExp.apply(l,es,arms);
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $2032 = _v1566.termRef(0);
          ESLVal $2031 = _v1566.termRef(1);
          ESLVal $2030 = _v1566.termRef(2);
          ESLVal $2029 = _v1566.termRef(3);
          ESLVal $2028 = _v1566.termRef(4);
          
          {ESLVal l = $2032;
          
          {ESLVal list = $2031;
          
          {ESLVal cons = $2030;
          
          {ESLVal nil = $2029;
          
          {ESLVal alt = $2028;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $2027 = _v1566.termRef(0);
          ESLVal $2026 = _v1566.termRef(1);
          ESLVal $2025 = _v1566.termRef(2);
          ESLVal $2024 = _v1566.termRef(3);
          
          {ESLVal l = $2027;
          
          {ESLVal list = $2026;
          
          {ESLVal arms = $2025;
          
          {ESLVal alt = $2024;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $2023 = _v1566.termRef(0);
          ESLVal $2022 = _v1566.termRef(1);
          ESLVal $2021 = _v1566.termRef(2);
          ESLVal $2020 = _v1566.termRef(3);
          
          {ESLVal l = $2023;
          
          {ESLVal s = $2022;
          
          {ESLVal arms = $2021;
          
          {ESLVal alt = $2020;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $2019 = _v1566.termRef(0);
          ESLVal $2018 = _v1566.termRef(1);
          ESLVal $2017 = _v1566.termRef(2);
          ESLVal $2016 = _v1566.termRef(3);
          
          {ESLVal l = $2019;
          
          {ESLVal s = $2018;
          
          {ESLVal arms = $2017;
          
          {ESLVal alt = $2016;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Head": {ESLVal $2015 = _v1566.termRef(0);
          
          {ESLVal _v1635 = $2015;
          
          return new ESLVal("JHead",expToJExp.apply(_v1635));
        }
        }
      case "Tail": {ESLVal $2014 = _v1566.termRef(0);
          
          {ESLVal _v1634 = $2014;
          
          return new ESLVal("JTail",expToJExp.apply(_v1634));
        }
        }
      case "CaseError": {ESLVal $2013 = _v1566.termRef(0);
          
          {ESLVal l = $2013;
          
          return new ESLVal("JError",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))));
        }
        }
      case "NullExp": {ESLVal $2012 = _v1566.termRef(0);
          
          {ESLVal l = $2012;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
        }
      case "Var": {ESLVal $2011 = _v1566.termRef(0);
          ESLVal $2010 = _v1566.termRef(1);
          
          {ESLVal l = $2011;
          
          {ESLVal n = $2010;
          
          return new ESLVal("JVar",n,$null);
        }
        }
        }
      case "Let": {ESLVal $2009 = _v1566.termRef(0);
          ESLVal $2008 = _v1566.termRef(1);
          ESLVal $2007 = _v1566.termRef(2);
          
          {ESLVal l = $2009;
          
          {ESLVal bs = $2008;
          
          {ESLVal body = $2007;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Letrec": {ESLVal $2006 = _v1566.termRef(0);
          ESLVal $2005 = _v1566.termRef(1);
          ESLVal $2004 = _v1566.termRef(2);
          
          {ESLVal l = $2006;
          
          {ESLVal bs = $2005;
          
          {ESLVal body = $2004;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Throw": {ESLVal $2003 = _v1566.termRef(0);
          ESLVal $2002 = _v1566.termRef(1);
          ESLVal $2001 = _v1566.termRef(2);
          
          {ESLVal l = $2003;
          
          {ESLVal t = $2002;
          
          {ESLVal _v1633 = $2001;
          
          return new ESLVal("JError",expToJExp.apply(_v1633));
        }
        }
        }
        }
      case "Apply": {ESLVal $2000 = _v1566.termRef(0);
          ESLVal $1999 = _v1566.termRef(1);
          ESLVal $1998 = _v1566.termRef(2);
          
          {ESLVal l = $2000;
          
          {ESLVal op = $1999;
          
          {ESLVal args = $1998;
          
          return new ESLVal("JApply",expToJExp.apply(op),expsToJExps.apply(args));
        }
        }
        }
        }
      case "BinExp": {ESLVal $1997 = _v1566.termRef(0);
          ESLVal $1996 = _v1566.termRef(1);
          ESLVal $1995 = _v1566.termRef(2);
          ESLVal $1994 = _v1566.termRef(3);
          
          {ESLVal l = $1997;
          
          {ESLVal e1 = $1996;
          
          {ESLVal op = $1995;
          
          {ESLVal e2 = $1994;
          
          return new ESLVal("JBinExp",expToJExp.apply(e1),opToJOp.apply(op),expToJExp.apply(e2));
        }
        }
        }
        }
        }
      case "Become": {ESLVal $1990 = _v1566.termRef(0);
          ESLVal $1989 = _v1566.termRef(1);
          
          switch($1989.termName) {
          case "Apply": {ESLVal $1993 = $1989.termRef(0);
            ESLVal $1992 = $1989.termRef(1);
            ESLVal $1991 = $1989.termRef(2);
            
            {ESLVal l = $1990;
            
            {ESLVal al = $1993;
            
            {ESLVal b = $1992;
            
            {ESLVal args = $1991;
            
            return new ESLVal("JBecome",expToJExp.apply(b),expsToJExps.apply(args));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5319,9175)"));
        }
        }
      case "Block": {ESLVal $1984 = _v1566.termRef(0);
          ESLVal $1983 = _v1566.termRef(1);
          
          if($1983.isCons())
          {ESLVal $1985 = $1983.head();
            ESLVal $1986 = $1983.tail();
            
            if($1986.isCons())
            {ESLVal $1987 = $1986.head();
              ESLVal $1988 = $1986.tail();
              
              {ESLVal l = $1984;
              
              {ESLVal es = $1983;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
            }
          else if($1986.isNil())
            {ESLVal l = $1984;
              
              {ESLVal _v1632 = $1985;
              
              return expToJExp.apply(_v1632);
            }
            }
          else {ESLVal l = $1984;
              
              {ESLVal es = $1983;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
          }
        else if($1983.isNil())
          {ESLVal l = $1984;
            
            return new ESLVal("JNull",new ESLVal[]{});
          }
        else {ESLVal l = $1984;
            
            {ESLVal es = $1983;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
          }
          }
        }
      case "If": {ESLVal $1982 = _v1566.termRef(0);
          ESLVal $1981 = _v1566.termRef(1);
          ESLVal $1980 = _v1566.termRef(2);
          ESLVal $1979 = _v1566.termRef(3);
          
          {ESLVal l = $1982;
          
          {ESLVal e1 = $1981;
          
          {ESLVal e2 = $1980;
          
          {ESLVal e3 = $1979;
          
          return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,$true),expToJCommand.apply(e3,$true)),$null);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $1978 = _v1566.termRef(0);
          ESLVal $1977 = _v1566.termRef(1);
          ESLVal $1976 = _v1566.termRef(2);
          ESLVal $1975 = _v1566.termRef(3);
          ESLVal $1974 = _v1566.termRef(4);
          
          {ESLVal l = $1978;
          
          {ESLVal n = $1977;
          
          {ESLVal args = $1976;
          
          {ESLVal t = $1975;
          
          {ESLVal body = $1974;
          
          return new ESLVal("JFun",expToJExp.apply(n),map.apply(new ESLVal(new Function(new ESLVal("fun710"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return decToJDec.apply(d);
            }
          }),args),new ESLVal("JFunType",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1567 = $qualArg;
                
                {ESLVal a = _v1567;
                
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
      case "TermRef": {ESLVal $1973 = _v1566.termRef(0);
          ESLVal $1972 = _v1566.termRef(1);
          
          {ESLVal _v1631 = $1973;
          
          {ESLVal i = $1972;
          
          return new ESLVal("JTermRef",expToJExp.apply(_v1631),i);
        }
        }
        }
      case "Cmp": {ESLVal $1971 = _v1566.termRef(0);
          ESLVal $1970 = _v1566.termRef(1);
          ESLVal $1969 = _v1566.termRef(2);
          
          {ESLVal l = $1971;
          
          {ESLVal _v1630 = $1970;
          
          {ESLVal qs = $1969;
          
          return cmpToJExp.apply(_v1630,qs);
        }
        }
        }
        }
      case "Not": {ESLVal $1968 = _v1566.termRef(0);
          ESLVal $1967 = _v1566.termRef(1);
          
          {ESLVal l = $1968;
          
          {ESLVal _v1629 = $1967;
          
          return new ESLVal("JNot",expToJExp.apply(_v1629));
        }
        }
        }
      case "New": {ESLVal $1966 = _v1566.termRef(0);
          ESLVal $1965 = _v1566.termRef(1);
          ESLVal $1964 = _v1566.termRef(2);
          
          {ESLVal l = $1966;
          
          {ESLVal b = $1965;
          
          {ESLVal args = $1964;
          
          return new ESLVal("JNew",expToJExp.apply(b),expsToJExps.apply(args));
        }
        }
        }
        }
      case "NewArray": {ESLVal $1963 = _v1566.termRef(0);
          ESLVal $1962 = _v1566.termRef(1);
          ESLVal $1961 = _v1566.termRef(2);
          
          {ESLVal l = $1963;
          
          {ESLVal t = $1962;
          
          {ESLVal i = $1961;
          
          return new ESLVal("JNewArray",expToJExp.apply(i));
        }
        }
        }
        }
      case "NewJava": {ESLVal $1960 = _v1566.termRef(0);
          ESLVal $1959 = _v1566.termRef(1);
          ESLVal $1958 = _v1566.termRef(2);
          ESLVal $1957 = _v1566.termRef(3);
          
          {ESLVal l = $1960;
          
          {ESLVal n = $1959;
          
          {ESLVal t = $1958;
          
          {ESLVal args = $1957;
          
          return new ESLVal("JNewJava",n,expsToJExps.apply(args));
        }
        }
        }
        }
        }
      case "Send": {ESLVal $1952 = _v1566.termRef(0);
          ESLVal $1951 = _v1566.termRef(1);
          ESLVal $1950 = _v1566.termRef(2);
          
          switch($1950.termName) {
          case "Term": {ESLVal $1956 = $1950.termRef(0);
            ESLVal $1955 = $1950.termRef(1);
            ESLVal $1954 = $1950.termRef(2);
            ESLVal $1953 = $1950.termRef(3);
            
            {ESLVal l = $1952;
            
            {ESLVal a = $1951;
            
            {ESLVal lt = $1956;
            
            {ESLVal n = $1955;
            
            {ESLVal ts = $1954;
            
            {ESLVal es = $1953;
            
            return new ESLVal("JSend",expToJExp.apply(a),n,expsToJExps.apply(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5319,9175)"));
        }
        }
      case "Self": {ESLVal $1949 = _v1566.termRef(0);
          
          {ESLVal l = $1949;
          
          return new ESLVal("JSelf",new ESLVal[]{});
        }
        }
      case "Fold": {ESLVal $1948 = _v1566.termRef(0);
          ESLVal $1947 = _v1566.termRef(1);
          ESLVal $1946 = _v1566.termRef(2);
          
          {ESLVal l = $1948;
          
          {ESLVal t = $1947;
          
          {ESLVal _v1628 = $1946;
          
          return expToJExp.apply(_v1628);
        }
        }
        }
        }
      case "Now": {ESLVal $1945 = _v1566.termRef(0);
          
          {ESLVal l = $1945;
          
          return new ESLVal("JNow",new ESLVal[]{});
        }
        }
      case "Ref": {ESLVal $1944 = _v1566.termRef(0);
          ESLVal $1943 = _v1566.termRef(1);
          ESLVal $1942 = _v1566.termRef(2);
          
          {ESLVal l = $1944;
          
          {ESLVal _v1627 = $1943;
          
          {ESLVal n = $1942;
          
          return new ESLVal("JRef",expToJExp.apply(_v1627),n);
        }
        }
        }
        }
      case "For": {ESLVal $1941 = _v1566.termRef(0);
          ESLVal $1940 = _v1566.termRef(1);
          ESLVal $1939 = _v1566.termRef(2);
          ESLVal $1938 = _v1566.termRef(3);
          
          {ESLVal l = $1941;
          
          {ESLVal p = $1940;
          
          {ESLVal _v1626 = $1939;
          
          {ESLVal c = $1938;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $1937 = _v1566.termRef(0);
          ESLVal $1936 = _v1566.termRef(1);
          ESLVal $1935 = _v1566.termRef(2);
          
          {ESLVal l = $1937;
          
          {ESLVal refs = $1936;
          
          {ESLVal _v1625 = $1935;
          
          return new ESLVal("JGrab",refsToJExps.apply(refs),expToJExp.apply(_v1625));
        }
        }
        }
        }
      case "Update": {ESLVal $1934 = _v1566.termRef(0);
          ESLVal $1933 = _v1566.termRef(1);
          ESLVal $1932 = _v1566.termRef(2);
          
          {ESLVal l = $1934;
          
          {ESLVal n = $1933;
          
          {ESLVal v = $1932;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Probably": {ESLVal $1931 = _v1566.termRef(0);
          ESLVal $1930 = _v1566.termRef(1);
          ESLVal $1929 = _v1566.termRef(2);
          ESLVal $1928 = _v1566.termRef(3);
          ESLVal $1927 = _v1566.termRef(4);
          
          {ESLVal l = $1931;
          
          {ESLVal _v1624 = $1930;
          
          {ESLVal t = $1929;
          
          {ESLVal e1 = $1928;
          
          {ESLVal e2 = $1927;
          
          return new ESLVal("JProbably",expToJExp.apply(_v1624),expToJExp.apply(e1),expToJExp.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Try": {ESLVal $1926 = _v1566.termRef(0);
          ESLVal $1925 = _v1566.termRef(1);
          ESLVal $1924 = _v1566.termRef(2);
          
          {ESLVal l = $1926;
          
          {ESLVal _v1623 = $1925;
          
          {ESLVal arms = $1924;
          
          return new ESLVal("JTry",expToJExp.apply(_v1623),new ESLVal("$x"),expToJCommand.apply(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
        }
        }
        }
        }
      case "ActExp": {ESLVal $1923 = _v1566.termRef(0);
          ESLVal $1922 = _v1566.termRef(1);
          ESLVal $1921 = _v1566.termRef(2);
          ESLVal $1920 = _v1566.termRef(3);
          ESLVal $1919 = _v1566.termRef(4);
          ESLVal $1918 = _v1566.termRef(5);
          ESLVal $1917 = _v1566.termRef(6);
          ESLVal $1916 = _v1566.termRef(7);
          
          {ESLVal l = $1923;
          
          {ESLVal name = $1922;
          
          {ESLVal decs = $1921;
          
          {ESLVal exports = $1920;
          
          {ESLVal spec = $1919;
          
          {ESLVal defs = $1918;
          
          {ESLVal init = $1917;
          
          {ESLVal arms = $1916;
          
          return actToJava.apply(name,decs,exports,spec,defs,init,arms);
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5319,9175)"));
      }
      }
    }
  });
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal refs = $args[0];
  {ESLVal _v1565 = refs;
        
        if(_v1565.isCons())
        {ESLVal $1907 = _v1565.head();
          ESLVal $1908 = _v1565.tail();
          
          switch($1907.termName) {
          case "VarDynamicRef": {ESLVal $1913 = $1907.termRef(0);
            ESLVal $1912 = $1907.termRef(1);
            
            switch($1912.termName) {
            case "Var": {ESLVal $1915 = $1912.termRef(0);
              ESLVal $1914 = $1912.termRef(1);
              
              {ESLVal l = $1913;
              
              {ESLVal vl = $1915;
              
              {ESLVal n = $1914;
              
              {ESLVal _v1622 = $1908;
              
              return refsToJExps.apply(_v1622).cons(new ESLVal("JVar",n,$null));
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(9218,9459)"));
          }
          }
        case "ActorDynamicRef": {ESLVal $1911 = $1907.termRef(0);
            ESLVal $1910 = $1907.termRef(1);
            ESLVal $1909 = $1907.termRef(2);
            
            {ESLVal l = $1911;
            
            {ESLVal e = $1910;
            
            {ESLVal n = $1909;
            
            {ESLVal _v1621 = $1908;
            
            return refsToJExps.apply(_v1621).cons(new ESLVal("JRef",expToJExp.apply(e),n));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9218,9459)"));
        }
        }
      else if(_v1565.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(9218,9459)"));
      }
    }
  });
  private static ESLVal actToJava = new ESLVal(new Function(new ESLVal("actToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal spec = $args[3];
  ESLVal defs = $args[4];
  ESLVal init = $args[5];
  ESLVal arms = $args[6];
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
        {ESLVal _v1564 = $qualArg;
              
              {ESLVal b = _v1564;
              
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
  private static ESLVal isTimeArm = new ESLVal(new Function(new ESLVal("isTimeArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v1563 = a;
        
        switch(_v1563.termName) {
        case "BArm": {ESLVal $1898 = _v1563.termRef(0);
          ESLVal $1897 = _v1563.termRef(1);
          ESLVal $1896 = _v1563.termRef(2);
          ESLVal $1895 = _v1563.termRef(3);
          
          if($1897.isCons())
          {ESLVal $1899 = $1897.head();
            ESLVal $1900 = $1897.tail();
            
            switch($1899.termName) {
            case "PTerm": {ESLVal $1904 = $1899.termRef(0);
              ESLVal $1903 = $1899.termRef(1);
              ESLVal $1902 = $1899.termRef(2);
              ESLVal $1901 = $1899.termRef(3);
              
              switch($1903.strVal) {
              case "Time": if($1900.isCons())
                {ESLVal $1905 = $1900.head();
                  ESLVal $1906 = $1900.tail();
                  
                  {ESLVal _v1614 = _v1563;
                  
                  return $false;
                }
                }
              else if($1900.isNil())
                {ESLVal l = $1898;
                  
                  {ESLVal pl = $1904;
                  
                  {ESLVal ts = $1902;
                  
                  {ESLVal ps = $1901;
                  
                  {ESLVal g = $1896;
                  
                  {ESLVal e = $1895;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v1615 = _v1563;
                  
                  return $false;
                }
              default: {ESLVal _v1616 = _v1563;
                
                return $false;
              }
            }
            }
            default: {ESLVal _v1617 = _v1563;
              
              return $false;
            }
          }
          }
        else if($1897.isNil())
          {ESLVal _v1618 = _v1563;
            
            return $false;
          }
        else {ESLVal _v1619 = _v1563;
            
            return $false;
          }
        }
        default: {ESLVal _v1620 = _v1563;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal _v1562 = arms;
        
        if(_v1562.isCons())
        {ESLVal $1864 = _v1562.head();
          ESLVal $1865 = _v1562.tail();
          
          switch($1864.termName) {
          case "BArm": {ESLVal $1869 = $1864.termRef(0);
            ESLVal $1868 = $1864.termRef(1);
            ESLVal $1867 = $1864.termRef(2);
            ESLVal $1866 = $1864.termRef(3);
            
            if($1868.isCons())
            {ESLVal $1870 = $1868.head();
              ESLVal $1871 = $1868.tail();
              
              switch($1870.termName) {
              case "PTerm": {ESLVal $1875 = $1870.termRef(0);
                ESLVal $1874 = $1870.termRef(1);
                ESLVal $1873 = $1870.termRef(2);
                ESLVal $1872 = $1870.termRef(3);
                
                switch($1874.strVal) {
                case "Time": if($1873.isCons())
                  {ESLVal $1876 = $1873.head();
                    ESLVal $1877 = $1873.tail();
                    
                    return error(new ESLVal("case error at Pos(10242,10772)"));
                  }
                else if($1873.isNil())
                  if($1872.isCons())
                    {ESLVal $1878 = $1872.head();
                      ESLVal $1879 = $1872.tail();
                      
                      switch($1878.termName) {
                      case "PVar": {ESLVal $1890 = $1878.termRef(0);
                        ESLVal $1889 = $1878.termRef(1);
                        ESLVal $1888 = $1878.termRef(2);
                        
                        if($1879.isCons())
                        {ESLVal $1891 = $1879.head();
                          ESLVal $1892 = $1879.tail();
                          
                          return error(new ESLVal("case error at Pos(10242,10772)"));
                        }
                      else if($1879.isNil())
                        if($1871.isCons())
                          {ESLVal $1893 = $1871.head();
                            ESLVal $1894 = $1871.tail();
                            
                            return error(new ESLVal("case error at Pos(10242,10772)"));
                          }
                        else if($1871.isNil())
                          {ESLVal l = $1869;
                            
                            {ESLVal tl = $1875;
                            
                            {ESLVal vl = $1890;
                            
                            {ESLVal n = $1889;
                            
                            {ESLVal t = $1888;
                            
                            {ESLVal g = $1867;
                            
                            {ESLVal e = $1866;
                            
                            {ESLVal _v1613 = $1865;
                            
                            return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp.apply(g),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v1613)));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return error(new ESLVal("case error at Pos(10242,10772)"));
                      else return error(new ESLVal("case error at Pos(10242,10772)"));
                      }
                    case "PInt": {ESLVal $1881 = $1878.termRef(0);
                        ESLVal $1880 = $1878.termRef(1);
                        
                        if($1879.isCons())
                        {ESLVal $1882 = $1879.head();
                          ESLVal $1883 = $1879.tail();
                          
                          return error(new ESLVal("case error at Pos(10242,10772)"));
                        }
                      else if($1879.isNil())
                        if($1871.isCons())
                          {ESLVal $1884 = $1871.head();
                            ESLVal $1885 = $1871.tail();
                            
                            return error(new ESLVal("case error at Pos(10242,10772)"));
                          }
                        else if($1871.isNil())
                          switch($1867.termName) {
                            case "BoolExp": {ESLVal $1887 = $1867.termRef(0);
                              ESLVal $1886 = $1867.termRef(1);
                              
                              switch($1886.boolVal ? 1 : 0) {
                              case 1: {ESLVal l = $1869;
                                
                                {ESLVal tl = $1875;
                                
                                {ESLVal vl = $1881;
                                
                                {ESLVal n = $1880;
                                
                                {ESLVal bl = $1887;
                                
                                {ESLVal e = $1866;
                                
                                {ESLVal _v1612 = $1865;
                                
                                return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v1612));
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: return error(new ESLVal("case error at Pos(10242,10772)"));
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(10242,10772)"));
                          }
                        else return error(new ESLVal("case error at Pos(10242,10772)"));
                      else return error(new ESLVal("case error at Pos(10242,10772)"));
                      }
                      default: return error(new ESLVal("case error at Pos(10242,10772)"));
                    }
                    }
                  else if($1872.isNil())
                    return error(new ESLVal("case error at Pos(10242,10772)"));
                  else return error(new ESLVal("case error at Pos(10242,10772)"));
                else return error(new ESLVal("case error at Pos(10242,10772)"));
                default: return error(new ESLVal("case error at Pos(10242,10772)"));
              }
              }
              default: return error(new ESLVal("case error at Pos(10242,10772)"));
            }
            }
          else if($1868.isNil())
            return error(new ESLVal("case error at Pos(10242,10772)"));
          else return error(new ESLVal("case error at Pos(10242,10772)"));
          }
          default: return error(new ESLVal("case error at Pos(10242,10772)"));
        }
        }
      else if(_v1562.isNil())
        return new ESLVal("JBlock",ESLVal.list());
      else return error(new ESLVal("case error at Pos(10242,10772)"));
      }
    }
  });
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  {ESLVal _v1561 = qs;
        
        if(_v1561.isCons())
        {ESLVal $1857 = _v1561.head();
          ESLVal $1858 = _v1561.tail();
          
          switch($1857.termName) {
          case "BQual": {ESLVal $1863 = $1857.termRef(0);
            ESLVal $1862 = $1857.termRef(1);
            ESLVal $1861 = $1857.termRef(2);
            
            {ESLVal l = $1863;
            
            {ESLVal p = $1862;
            
            {ESLVal v = $1861;
            
            {ESLVal _v1611 = $1858;
            
            {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),ESLVal.list(),ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v1611)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
            
            return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp.apply(f),expToJExp.apply(v))));
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $1860 = $1857.termRef(0);
            ESLVal $1859 = $1857.termRef(1);
            
            {ESLVal l = $1860;
            
            {ESLVal p = $1859;
            
            {ESLVal _v1610 = $1858;
            
            return new ESLVal("JIfExp",expToJExp.apply(p),cmpToJExp.apply(e,_v1610),new ESLVal("JNil",$null));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10819,11487)"));
        }
        }
      else if(_v1561.isNil())
        return new ESLVal("JList",$null,ESLVal.list(expToJExp.apply(e)));
      else return error(new ESLVal("case error at Pos(10819,11487)"));
      }
    }
  });
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  {ESLVal _v1559 = module;
        
        switch(_v1559.termName) {
        case "Module": {ESLVal $1856 = _v1559.termRef(0);
          ESLVal $1855 = _v1559.termRef(1);
          ESLVal $1854 = _v1559.termRef(2);
          ESLVal $1853 = _v1559.termRef(3);
          ESLVal $1852 = _v1559.termRef(4);
          ESLVal $1851 = _v1559.termRef(5);
          ESLVal $1850 = _v1559.termRef(6);
          
          {ESLVal path = $1856;
          
          {ESLVal name = $1855;
          
          {ESLVal exports = $1854;
          
          {ESLVal imports = $1853;
          
          {ESLVal x = $1852;
          
          {ESLVal y = $1851;
          
          {ESLVal defs = $1850;
          
          return renameJVarsModule.apply(new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1560 = $qualArg;
                
                {ESLVal d = _v1560;
                
                return ESLVal.list((isBinding.apply(d).or(isFunBind.apply(d)).boolVal) ? (ESLVal.list(defToField.apply(d))) : ($nil));
              }
              }
            }
          }).map(defs).flatten().flatten()));
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11525,11768)"));
      }
      }
    }
  });
  private static ESLVal zipFields = new ESLVal(new Function(new ESLVal("zipFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal fs = $args[0];
  ESLVal es = $args[1];
  ESLVal ts = $args[2];
  {ESLVal _v1558 = fs;
        ESLVal _v1557 = es;
        ESLVal _v1556 = ts;
        
        if(_v1558.isCons())
        {ESLVal $1837 = _v1558.head();
          ESLVal $1838 = _v1558.tail();
          
          switch($1837.termName) {
          case "JField": {ESLVal $1841 = $1837.termRef(0);
            ESLVal $1840 = $1837.termRef(1);
            ESLVal $1839 = $1837.termRef(2);
            
            if(_v1557.isCons())
            {ESLVal $1842 = _v1557.head();
              ESLVal $1843 = _v1557.tail();
              
              if(_v1556.isCons())
              {ESLVal $1844 = _v1556.head();
                ESLVal $1845 = _v1556.tail();
                
                {ESLVal n = $1841;
                
                {ESLVal t = $1840;
                
                {ESLVal e = $1839;
                
                {ESLVal _v1605 = $1838;
                
                {ESLVal _v1606 = $1842;
                
                {ESLVal _v1607 = $1843;
                
                {ESLVal _v1608 = $1844;
                
                {ESLVal _v1609 = $1845;
                
                return zipFields.apply(_v1605,_v1607,_v1609).cons(new ESLVal("JField",n,_v1608,_v1606));
              }
              }
              }
              }
              }
              }
              }
              }
              }
            else if(_v1556.isNil())
              return error(new ESLVal("case error at Pos(11837,12047)"));
            else return error(new ESLVal("case error at Pos(11837,12047)"));
            }
          else if(_v1557.isNil())
            return error(new ESLVal("case error at Pos(11837,12047)"));
          else return error(new ESLVal("case error at Pos(11837,12047)"));
          }
          default: return error(new ESLVal("case error at Pos(11837,12047)"));
        }
        }
      else if(_v1558.isNil())
        if(_v1557.isCons())
          {ESLVal $1846 = _v1557.head();
            ESLVal $1847 = _v1557.tail();
            
            return error(new ESLVal("case error at Pos(11837,12047)"));
          }
        else if(_v1557.isNil())
          if(_v1556.isCons())
            {ESLVal $1848 = _v1556.head();
              ESLVal $1849 = _v1556.tail();
              
              return error(new ESLVal("case error at Pos(11837,12047)"));
            }
          else if(_v1556.isNil())
            return $nil;
          else return error(new ESLVal("case error at Pos(11837,12047)"));
        else return error(new ESLVal("case error at Pos(11837,12047)"));
      else return error(new ESLVal("case error at Pos(11837,12047)"));
      }
    }
  });
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v1553 = m;
        
        switch(_v1553.termName) {
        case "JModule": {ESLVal $1830 = _v1553.termRef(0);
          ESLVal $1829 = _v1553.termRef(1);
          ESLVal $1828 = _v1553.termRef(2);
          ESLVal $1827 = _v1553.termRef(3);
          
          {ESLVal name = $1830;
          
          {ESLVal exports = $1829;
          
          {ESLVal imports = $1828;
          
          {ESLVal fs = $1827;
          
          {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1554 = $qualArg;
                  
                  switch(_v1554.termName) {
                  case "JField": {ESLVal $1833 = _v1554.termRef(0);
                    ESLVal $1832 = _v1554.termRef(1);
                    ESLVal $1831 = _v1554.termRef(2);
                    
                    {ESLVal n = $1833;
                    
                    {ESLVal t = $1832;
                    
                    {ESLVal e = $1831;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1554;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(fs).flatten().flatten();
          
          return new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1555 = $qualArg;
                
                switch(_v1555.termName) {
                case "JField": {ESLVal $1836 = _v1555.termRef(0);
                  ESLVal $1835 = _v1555.termRef(1);
                  ESLVal $1834 = _v1555.termRef(2);
                  
                  {ESLVal n = $1836;
                  
                  {ESLVal t = $1835;
                  
                  {ESLVal e = $1834;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1555;
                  
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
        default: return error(new ESLVal("case error at Pos(12088,12395)"));
      }
      }
    }
  });
  private static ESLVal renameJVarsExp = new ESLVal(new Function(new ESLVal("renameJVarsExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v1540 = e;
        
        switch(_v1540.termName) {
        case "JFun": {ESLVal $1821 = _v1540.termRef(0);
          ESLVal $1820 = _v1540.termRef(1);
          ESLVal $1819 = _v1540.termRef(2);
          ESLVal $1818 = _v1540.termRef(3);
          
          {ESLVal v0 = $1821;
          
          {ESLVal v1 = $1820;
          
          {ESLVal v2 = $1819;
          
          {ESLVal v3 = $1818;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1550 = $qualArg;
                  
                  switch(_v1550.termName) {
                  case "JDec": {ESLVal $1826 = _v1550.termRef(0);
                    ESLVal $1825 = _v1550.termRef(1);
                    
                    {ESLVal n = $1826;
                    
                    {ESLVal t = $1825;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1550;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v1).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun711"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,boundNames);
          }
        }),vars).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1551 = $qualArg;
                    
                    {ESLVal n = _v1551;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JFun",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1552 = $qualArg;
                  
                  {ESLVal n = _v1552;
                  
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
      case "JApply": {ESLVal $1817 = _v1540.termRef(0);
          ESLVal $1816 = _v1540.termRef(1);
          
          {ESLVal v0 = $1817;
          
          {ESLVal v1 = $1816;
          
          return new ESLVal("JApply",renameJVarsExp.apply(v0,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1549 = $qualArg;
                
                {ESLVal v = _v1549;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JArrayRef": {ESLVal $1815 = _v1540.termRef(0);
          ESLVal $1814 = _v1540.termRef(1);
          
          {ESLVal a = $1815;
          
          {ESLVal i = $1814;
          
          return new ESLVal("JArrayRef",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $1813 = _v1540.termRef(0);
          ESLVal $1812 = _v1540.termRef(1);
          ESLVal $1811 = _v1540.termRef(2);
          
          {ESLVal a = $1813;
          
          {ESLVal i = $1812;
          
          {ESLVal v = $1811;
          
          return new ESLVal("JArrayUpdate",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env),renameJVarsExp.apply(v,vars,env));
        }
        }
        }
        }
      case "JBecome": {ESLVal $1810 = _v1540.termRef(0);
          ESLVal $1809 = _v1540.termRef(1);
          
          {ESLVal _v1604 = $1810;
          
          {ESLVal es = $1809;
          
          return new ESLVal("JBecome",renameJVarsExp.apply(_v1604,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1548 = $qualArg;
                
                {ESLVal v = _v1548;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "JBinExp": {ESLVal $1808 = _v1540.termRef(0);
          ESLVal $1807 = _v1540.termRef(1);
          ESLVal $1806 = _v1540.termRef(2);
          
          {ESLVal v0 = $1808;
          
          {ESLVal v1 = $1807;
          
          {ESLVal v2 = $1806;
          
          return new ESLVal("JBinExp",renameJVarsExp.apply(v0,vars,env),v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $1805 = _v1540.termRef(0);
          ESLVal $1804 = _v1540.termRef(1);
          
          {ESLVal v0 = $1805;
          
          {ESLVal v1 = $1804;
          
          return new ESLVal("JCommandExp",renameJVarsCommand.apply(v0,vars,env),v1);
        }
        }
        }
      case "JIfExp": {ESLVal $1803 = _v1540.termRef(0);
          ESLVal $1802 = _v1540.termRef(1);
          ESLVal $1801 = _v1540.termRef(2);
          
          {ESLVal v0 = $1803;
          
          {ESLVal v1 = $1802;
          
          {ESLVal v2 = $1801;
          
          return new ESLVal("JIfExp",renameJVarsExp.apply(v0,vars,env),renameJVarsExp.apply(v1,vars,env),renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $1800 = _v1540.termRef(0);
          
          {ESLVal v0 = $1800;
          
          return e;
        }
        }
      case "JTerm": {ESLVal $1799 = _v1540.termRef(0);
          ESLVal $1798 = _v1540.termRef(1);
          
          {ESLVal v0 = $1799;
          
          {ESLVal v1 = $1798;
          
          return new ESLVal("JTerm",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1547 = $qualArg;
                
                {ESLVal v = _v1547;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JTermRef": {ESLVal $1797 = _v1540.termRef(0);
          ESLVal $1796 = _v1540.termRef(1);
          
          {ESLVal v0 = $1797;
          
          {ESLVal v1 = $1796;
          
          return new ESLVal("JTermRef",renameJVarsExp.apply(v0,vars,env),v1);
        }
        }
        }
      case "JList": {ESLVal $1795 = _v1540.termRef(0);
          ESLVal $1794 = _v1540.termRef(1);
          
          {ESLVal v0 = $1795;
          
          {ESLVal v1 = $1794;
          
          return new ESLVal("JList",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1546 = $qualArg;
                
                {ESLVal v = _v1546;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JNil": {ESLVal $1793 = _v1540.termRef(0);
          
          {ESLVal v0 = $1793;
          
          return e;
        }
        }
      case "JNow": {
          return e;
        }
      case "JVar": {ESLVal $1792 = _v1540.termRef(0);
          ESLVal $1791 = _v1540.termRef(1);
          
          {ESLVal v0 = $1792;
          
          {ESLVal v1 = $1791;
          
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
      case "JError": {ESLVal $1790 = _v1540.termRef(0);
          
          {ESLVal v0 = $1790;
          
          return new ESLVal("JError",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JHead": {ESLVal $1789 = _v1540.termRef(0);
          
          {ESLVal v0 = $1789;
          
          return new ESLVal("JHead",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JTail": {ESLVal $1788 = _v1540.termRef(0);
          
          {ESLVal v0 = $1788;
          
          return new ESLVal("JTail",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JCastp": {ESLVal $1787 = _v1540.termRef(0);
          ESLVal $1786 = _v1540.termRef(1);
          ESLVal $1785 = _v1540.termRef(2);
          
          {ESLVal v0 = $1787;
          
          {ESLVal v1 = $1786;
          
          {ESLVal v2 = $1785;
          
          return new ESLVal("JCastp",v0,v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCast": {ESLVal $1784 = _v1540.termRef(0);
          ESLVal $1783 = _v1540.termRef(1);
          
          {ESLVal v0 = $1784;
          
          {ESLVal v1 = $1783;
          
          return new ESLVal("JCast",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JNot": {ESLVal $1782 = _v1540.termRef(0);
          
          {ESLVal _v1603 = $1782;
          
          return new ESLVal("JNot",renameJVarsExp.apply(_v1603,vars,env));
        }
        }
      case "JNew": {ESLVal $1781 = _v1540.termRef(0);
          ESLVal $1780 = _v1540.termRef(1);
          
          {ESLVal b = $1781;
          
          {ESLVal args = $1780;
          
          return new ESLVal("JNew",renameJVarsExp.apply(b,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1545 = $qualArg;
                
                {ESLVal a = _v1545;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewArray": {ESLVal $1779 = _v1540.termRef(0);
          
          {ESLVal b = $1779;
          
          return new ESLVal("JNewArray",renameJVarsExp.apply(b,vars,env));
        }
        }
      case "JNewJava": {ESLVal $1778 = _v1540.termRef(0);
          ESLVal $1777 = _v1540.termRef(1);
          
          {ESLVal n = $1778;
          
          {ESLVal args = $1777;
          
          return new ESLVal("JNewJava",n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1544 = $qualArg;
                
                {ESLVal a = _v1544;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JMapFun": {ESLVal $1776 = _v1540.termRef(0);
          ESLVal $1775 = _v1540.termRef(1);
          
          {ESLVal f = $1776;
          
          {ESLVal l = $1775;
          
          return new ESLVal("JMapFun",renameJVarsExp.apply(f,vars,env),renameJVarsExp.apply(l,vars,env));
        }
        }
        }
      case "JFlatten": {ESLVal $1774 = _v1540.termRef(0);
          
          {ESLVal _v1602 = $1774;
          
          return new ESLVal("JFlatten",renameJVarsExp.apply(_v1602,vars,env));
        }
        }
      case "JSend": {ESLVal $1773 = _v1540.termRef(0);
          ESLVal $1772 = _v1540.termRef(1);
          ESLVal $1771 = _v1540.termRef(2);
          
          {ESLVal _v1600 = $1773;
          
          {ESLVal n = $1772;
          
          {ESLVal es = $1771;
          
          return new ESLVal("JSend",renameJVarsExp.apply(_v1600,vars,env),n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1543 = $qualArg;
                
                {ESLVal _v1601 = _v1543;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v1601,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
        }
      case "JSelf": {
          return new ESLVal("JSelf",new ESLVal[]{});
        }
      case "JRef": {ESLVal $1770 = _v1540.termRef(0);
          ESLVal $1769 = _v1540.termRef(1);
          
          {ESLVal _v1599 = $1770;
          
          {ESLVal n = $1769;
          
          return new ESLVal("JRef",renameJVarsExp.apply(_v1599,vars,env),n);
        }
        }
        }
      case "JBehaviour": {ESLVal $1768 = _v1540.termRef(0);
          ESLVal $1767 = _v1540.termRef(1);
          ESLVal $1766 = _v1540.termRef(2);
          ESLVal $1765 = _v1540.termRef(3);
          ESLVal $1764 = _v1540.termRef(4);
          
          {ESLVal es = $1768;
          
          {ESLVal fs = $1767;
          
          {ESLVal init = $1766;
          
          {ESLVal handler = $1765;
          
          {ESLVal time = $1764;
          
          return new ESLVal("JBehaviour",es,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1542 = $qualArg;
                
                switch(_v1542.termName) {
                case "JField": {ESLVal $1824 = _v1542.termRef(0);
                  ESLVal $1823 = _v1542.termRef(1);
                  ESLVal $1822 = _v1542.termRef(2);
                  
                  {ESLVal n = $1824;
                  
                  {ESLVal t = $1823;
                  
                  {ESLVal _v1598 = $1822;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v1598,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1542;
                  
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
      case "JTry": {ESLVal $1763 = _v1540.termRef(0);
          ESLVal $1762 = _v1540.termRef(1);
          ESLVal $1761 = _v1540.termRef(2);
          
          {ESLVal _v1597 = $1763;
          
          {ESLVal n = $1762;
          
          {ESLVal c = $1761;
          
          return new ESLVal("JTry",renameJVarsExp.apply(_v1597,vars,env),n,renameJVarsCommand.apply(c,vars,env));
        }
        }
        }
        }
      case "JProbably": {ESLVal $1760 = _v1540.termRef(0);
          ESLVal $1759 = _v1540.termRef(1);
          ESLVal $1758 = _v1540.termRef(2);
          
          {ESLVal _v1596 = $1760;
          
          {ESLVal e1 = $1759;
          
          {ESLVal e2 = $1758;
          
          return new ESLVal("JProbably",renameJVarsExp.apply(_v1596,vars,env),renameJVarsExp.apply(e1,vars,env),renameJVarsExp.apply(e2,vars,env));
        }
        }
        }
        }
      case "JGrab": {ESLVal $1757 = _v1540.termRef(0);
          ESLVal $1756 = _v1540.termRef(1);
          
          {ESLVal es = $1757;
          
          {ESLVal c = $1756;
          
          return new ESLVal("JGrab",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1541 = $qualArg;
                
                {ESLVal _v1595 = _v1541;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v1595,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten(),renameJVarsExp.apply(c,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(12465,16219)"));
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
  {ESLVal _v1526 = c;
        
        switch(_v1526.termName) {
        case "JBlock": {ESLVal $1728 = _v1526.termRef(0);
          
          {ESLVal v0 = $1728;
          
          return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1539 = $qualArg;
                
                {ESLVal _v1594 = _v1539;
                
                return ESLVal.list(ESLVal.list(renameJVarsCommand.apply(_v1594,vars,env)));
              }
              }
            }
          }).map(v0).flatten().flatten());
        }
        }
      case "JReturn": {ESLVal $1727 = _v1526.termRef(0);
          
          {ESLVal v0 = $1727;
          
          return new ESLVal("JReturn",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JSwitch": {ESLVal $1726 = _v1526.termRef(0);
          ESLVal $1725 = _v1526.termRef(1);
          ESLVal $1724 = _v1526.termRef(2);
          
          {ESLVal v0 = $1726;
          
          {ESLVal v1 = $1725;
          
          {ESLVal v2 = $1724;
          
          return error(new ESLVal("jswitch should not occur"));
        }
        }
        }
        }
      case "JSwitchList": {ESLVal $1723 = _v1526.termRef(0);
          ESLVal $1722 = _v1526.termRef(1);
          ESLVal $1721 = _v1526.termRef(2);
          ESLVal $1720 = _v1526.termRef(3);
          
          {ESLVal v0 = $1723;
          
          {ESLVal v1 = $1722;
          
          {ESLVal v2 = $1721;
          
          {ESLVal v3 = $1720;
          
          return new ESLVal("JSwitchList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JIfCommand": {ESLVal $1719 = _v1526.termRef(0);
          ESLVal $1718 = _v1526.termRef(1);
          ESLVal $1717 = _v1526.termRef(2);
          
          {ESLVal v0 = $1719;
          
          {ESLVal v1 = $1718;
          
          {ESLVal v2 = $1717;
          
          return new ESLVal("JIfCommand",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $1716 = _v1526.termRef(0);
          ESLVal $1715 = _v1526.termRef(1);
          ESLVal $1714 = _v1526.termRef(2);
          ESLVal $1713 = _v1526.termRef(3);
          
          {ESLVal v0 = $1716;
          
          {ESLVal v1 = $1715;
          
          {ESLVal v2 = $1714;
          
          {ESLVal v3 = $1713;
          
          return new ESLVal("JCaseList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $1712 = _v1526.termRef(0);
          ESLVal $1711 = _v1526.termRef(1);
          ESLVal $1710 = _v1526.termRef(2);
          
          {ESLVal e = $1712;
          
          {ESLVal arms = $1711;
          
          {ESLVal alt = $1710;
          
          return new ESLVal("JCaseInt",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1538 = $qualArg;
                
                switch(_v1538.termName) {
                case "JIArm": {ESLVal $1755 = _v1538.termRef(0);
                  ESLVal $1754 = _v1538.termRef(1);
                  
                  {ESLVal n = $1755;
                  
                  {ESLVal _v1593 = $1754;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand.apply(_v1593,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1538;
                  
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
      case "JCaseStr": {ESLVal $1709 = _v1526.termRef(0);
          ESLVal $1708 = _v1526.termRef(1);
          ESLVal $1707 = _v1526.termRef(2);
          
          {ESLVal e = $1709;
          
          {ESLVal arms = $1708;
          
          {ESLVal alt = $1707;
          
          return new ESLVal("JCaseStr",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1537 = $qualArg;
                
                switch(_v1537.termName) {
                case "JSArm": {ESLVal $1753 = _v1537.termRef(0);
                  ESLVal $1752 = _v1537.termRef(1);
                  
                  {ESLVal s = $1753;
                  
                  {ESLVal _v1592 = $1752;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand.apply(_v1592,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1537;
                  
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
      case "JCaseBool": {ESLVal $1706 = _v1526.termRef(0);
          ESLVal $1705 = _v1526.termRef(1);
          ESLVal $1704 = _v1526.termRef(2);
          
          {ESLVal e = $1706;
          
          {ESLVal arms = $1705;
          
          {ESLVal alt = $1704;
          
          return new ESLVal("JCaseBool",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1536 = $qualArg;
                
                switch(_v1536.termName) {
                case "JBArm": {ESLVal $1751 = _v1536.termRef(0);
                  ESLVal $1750 = _v1536.termRef(1);
                  
                  {ESLVal b = $1751;
                  
                  {ESLVal _v1591 = $1750;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand.apply(_v1591,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v1536;
                  
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
      case "JCaseTerm": {ESLVal $1703 = _v1526.termRef(0);
          ESLVal $1702 = _v1526.termRef(1);
          ESLVal $1701 = _v1526.termRef(2);
          
          {ESLVal e = $1703;
          
          {ESLVal arms = $1702;
          
          {ESLVal alt = $1701;
          
          return new ESLVal("JCaseTerm",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1535 = $qualArg;
                
                switch(_v1535.termName) {
                case "JTArm": {ESLVal $1749 = _v1535.termRef(0);
                  ESLVal $1748 = _v1535.termRef(1);
                  ESLVal $1747 = _v1535.termRef(2);
                  
                  {ESLVal n = $1749;
                  
                  {ESLVal i = $1748;
                  
                  {ESLVal _v1590 = $1747;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand.apply(_v1590,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v1535;
                  
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
      case "JLet": {ESLVal $1700 = _v1526.termRef(0);
          ESLVal $1699 = _v1526.termRef(1);
          
          {ESLVal v0 = $1700;
          
          {ESLVal v1 = $1699;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1531 = $qualArg;
                  
                  switch(_v1531.termName) {
                  case "JField": {ESLVal $1740 = _v1531.termRef(0);
                    ESLVal $1739 = _v1531.termRef(1);
                    ESLVal $1738 = _v1531.termRef(2);
                    
                    {ESLVal n = $1740;
                    
                    {ESLVal t = $1739;
                    
                    {ESLVal e = $1738;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1531;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun712"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1532 = $qualArg;
                    
                    {ESLVal n = _v1532;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1533 = $qualArg;
                  
                  switch(_v1533.termName) {
                  case "JField": {ESLVal $1743 = _v1533.termRef(0);
                    ESLVal $1742 = _v1533.termRef(1);
                    ESLVal $1741 = _v1533.termRef(2);
                    
                    {ESLVal n = $1743;
                    
                    {ESLVal t = $1742;
                    
                    {ESLVal e = $1741;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1533;
                    
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
              {ESLVal _v1534 = $qualArg;
                    
                    switch(_v1534.termName) {
                    case "JField": {ESLVal $1746 = _v1534.termRef(0);
                      ESLVal $1745 = _v1534.termRef(1);
                      ESLVal $1744 = _v1534.termRef(2);
                      
                      {ESLVal n = $1746;
                      
                      {ESLVal t = $1745;
                      
                      {ESLVal e = $1744;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1534;
                      
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
      case "JLetRec": {ESLVal $1698 = _v1526.termRef(0);
          ESLVal $1697 = _v1526.termRef(1);
          
          {ESLVal v0 = $1698;
          
          {ESLVal v1 = $1697;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1527 = $qualArg;
                  
                  switch(_v1527.termName) {
                  case "JField": {ESLVal $1731 = _v1527.termRef(0);
                    ESLVal $1730 = _v1527.termRef(1);
                    ESLVal $1729 = _v1527.termRef(2);
                    
                    {ESLVal n = $1731;
                    
                    {ESLVal t = $1730;
                    
                    {ESLVal e = $1729;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1527;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun713"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1528 = $qualArg;
                    
                    {ESLVal n = _v1528;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal _v1589 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v1529 = $qualArg;
                  
                  switch(_v1529.termName) {
                  case "JField": {ESLVal $1734 = _v1529.termRef(0);
                    ESLVal $1733 = _v1529.termRef(1);
                    ESLVal $1732 = _v1529.termRef(2);
                    
                    {ESLVal n = $1734;
                    
                    {ESLVal t = $1733;
                    
                    {ESLVal e = $1732;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,_v1589),t,renameJVarsExp.apply(e,vars,_v1589))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v1529;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),_v1589));
          }
          }
          else
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1530 = $qualArg;
                    
                    switch(_v1530.termName) {
                    case "JField": {ESLVal $1737 = _v1530.termRef(0);
                      ESLVal $1736 = _v1530.termRef(1);
                      ESLVal $1735 = _v1530.termRef(2);
                      
                      {ESLVal n = $1737;
                      
                      {ESLVal t = $1736;
                      
                      {ESLVal e = $1735;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v1530;
                      
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
      case "JStatement": {ESLVal $1696 = _v1526.termRef(0);
          
          {ESLVal e = $1696;
          
          return new ESLVal("JStatement",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JUpdate": {ESLVal $1695 = _v1526.termRef(0);
          ESLVal $1694 = _v1526.termRef(1);
          
          {ESLVal v0 = $1695;
          
          {ESLVal v1 = $1694;
          
          return new ESLVal("JUpdate",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JFor": {ESLVal $1693 = _v1526.termRef(0);
          ESLVal $1692 = _v1526.termRef(1);
          ESLVal $1691 = _v1526.termRef(2);
          ESLVal $1690 = _v1526.termRef(3);
          
          {ESLVal l = $1693;
          
          {ESLVal n = $1692;
          
          {ESLVal e = $1691;
          
          {ESLVal _v1588 = $1690;
          
          return new ESLVal("JFor",l,n,renameJVarsExp.apply(e,vars,env),renameJVarsCommand.apply(_v1588,vars,env));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(16460,19983)"));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1525 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
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