package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
public class Types {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal theTypeBool = new ESLVal("BoolType",new ESLVal("Pos",$zero,$zero));
  public static ESLVal theTypeInt = new ESLVal("IntType",new ESLVal("Pos",$zero,$zero));
  public static ESLVal theTypeFloat = new ESLVal("FloatType",new ESLVal("Pos",$zero,$zero));
  public static ESLVal theTypeNull = new ESLVal("NullType",new ESLVal("Pos",$zero,$zero));
  public static ESLVal theTypeStr = new ESLVal("StrType",new ESLVal("Pos",$zero,$zero));
  public static ESLVal theTypeVoid = new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero));
public static ESLVal locStart(ESLVal l) {
    
    {ESLVal _v1 = l;
      
      switch(_v1.termName) {
      case "Pos": {ESLVal $5 = _v1.termRef(0);
        ESLVal $4 = _v1.termRef(1);
        
        {ESLVal start = $5;
        
        {ESLVal end = $4;
        
        return start;
      }
      }
      }
    case "TypedLoc": {ESLVal $3 = _v1.termRef(0);
        ESLVal $2 = _v1.termRef(1);
        ESLVal $1 = _v1.termRef(2);
        
        {ESLVal t = $3;
        
        {ESLVal start = $2;
        
        {ESLVal end = $1;
        
        return start;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6040,6124)").add(ESLVal.list(_v1)));
    }
    }
  }
  public static ESLVal locStart = new ESLVal(new Function(new ESLVal("locStart"),null) { public ESLVal apply(ESLVal... args) { return locStart(args[0]); }});
  public static ESLVal locEnd(ESLVal l) {
    
    {ESLVal _v2 = l;
      
      switch(_v2.termName) {
      case "Pos": {ESLVal $10 = _v2.termRef(0);
        ESLVal $9 = _v2.termRef(1);
        
        {ESLVal start = $10;
        
        {ESLVal end = $9;
        
        return end;
      }
      }
      }
    case "TypedLoc": {ESLVal $8 = _v2.termRef(0);
        ESLVal $7 = _v2.termRef(1);
        ESLVal $6 = _v2.termRef(2);
        
        {ESLVal t = $8;
        
        {ESLVal start = $7;
        
        {ESLVal end = $6;
        
        return end;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6151,6231)").add(ESLVal.list(_v2)));
    }
    }
  }
  public static ESLVal locEnd = new ESLVal(new Function(new ESLVal("locEnd"),null) { public ESLVal apply(ESLVal... args) { return locEnd(args[0]); }});
  public static ESLVal decName(ESLVal d) {
    
    {ESLVal _v3 = d;
      
      switch(_v3.termName) {
      case "Dec": {ESLVal $14 = _v3.termRef(0);
        ESLVal $13 = _v3.termRef(1);
        ESLVal $12 = _v3.termRef(2);
        ESLVal $11 = _v3.termRef(3);
        
        {ESLVal l = $14;
        
        {ESLVal n = $13;
        
        {ESLVal t = $12;
        
        {ESLVal dt = $11;
        
        return n;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6553,6675)").add(ESLVal.list(_v3)));
    }
    }
  }
  public static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),null) { public ESLVal apply(ESLVal... args) { return decName(args[0]); }});
  public static ESLVal decLoc(ESLVal d) {
    
    {ESLVal _v4 = d;
      
      switch(_v4.termName) {
      case "Dec": {ESLVal $18 = _v4.termRef(0);
        ESLVal $17 = _v4.termRef(1);
        ESLVal $16 = _v4.termRef(2);
        ESLVal $15 = _v4.termRef(3);
        
        {ESLVal l = $18;
        
        {ESLVal n = $17;
        
        {ESLVal t = $16;
        
        {ESLVal dt = $15;
        
        return l;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6779,6837)").add(ESLVal.list(_v4)));
    }
    }
  }
  public static ESLVal decLoc = new ESLVal(new Function(new ESLVal("decLoc"),null) { public ESLVal apply(ESLVal... args) { return decLoc(args[0]); }});
  public static ESLVal decType(ESLVal d) {
    
    {ESLVal _v5 = d;
      
      switch(_v5.termName) {
      case "Dec": {ESLVal $22 = _v5.termRef(0);
        ESLVal $21 = _v5.termRef(1);
        ESLVal $20 = _v5.termRef(2);
        ESLVal $19 = _v5.termRef(3);
        
        {ESLVal l = $22;
        
        {ESLVal n = $21;
        
        {ESLVal t = $20;
        
        {ESLVal dt = $19;
        
        return t;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6937,6995)").add(ESLVal.list(_v5)));
    }
    }
  }
  public static ESLVal decType = new ESLVal(new Function(new ESLVal("decType"),null) { public ESLVal apply(ESLVal... args) { return decType(args[0]); }});
  public static ESLVal isStrType(ESLVal t) {
    
    {ESLVal _v6 = t;
      
      switch(_v6.termName) {
      case "StrType": {ESLVal $23 = _v6.termRef(0);
        
        {ESLVal l = $23;
        
        return $true;
      }
      }
      default: {ESLVal _v808 = _v6;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isStrType = new ESLVal(new Function(new ESLVal("isStrType"),null) { public ESLVal apply(ESLVal... args) { return isStrType(args[0]); }});
  public static ESLVal isIntType(ESLVal t) {
    
    {ESLVal _v7 = t;
      
      switch(_v7.termName) {
      case "IntType": {ESLVal $24 = _v7.termRef(0);
        
        {ESLVal l = $24;
        
        return $true;
      }
      }
      default: {ESLVal _v807 = _v7;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isIntType = new ESLVal(new Function(new ESLVal("isIntType"),null) { public ESLVal apply(ESLVal... args) { return isIntType(args[0]); }});
  public static ESLVal isNumType(ESLVal t) {
    
    {ESLVal _v8 = t;
      
      switch(_v8.termName) {
      case "IntType": {ESLVal $26 = _v8.termRef(0);
        
        {ESLVal l = $26;
        
        return $true;
      }
      }
    case "FloatType": {ESLVal $25 = _v8.termRef(0);
        
        {ESLVal l = $25;
        
        return $true;
      }
      }
      default: {ESLVal _v806 = _v8;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isNumType = new ESLVal(new Function(new ESLVal("isNumType"),null) { public ESLVal apply(ESLVal... args) { return isNumType(args[0]); }});
  public static ESLVal isBoolType(ESLVal t) {
    
    {ESLVal _v9 = t;
      
      switch(_v9.termName) {
      case "BoolType": {ESLVal $27 = _v9.termRef(0);
        
        {ESLVal l = $27;
        
        return $true;
      }
      }
      default: {ESLVal _v805 = _v9;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isBoolType = new ESLVal(new Function(new ESLVal("isBoolType"),null) { public ESLVal apply(ESLVal... args) { return isBoolType(args[0]); }});
  public static ESLVal isFloatType(ESLVal t) {
    
    {ESLVal _v10 = t;
      
      switch(_v10.termName) {
      case "FloatType": {ESLVal $28 = _v10.termRef(0);
        
        {ESLVal l = $28;
        
        return $true;
      }
      }
      default: {ESLVal _v804 = _v10;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isFloatType = new ESLVal(new Function(new ESLVal("isFloatType"),null) { public ESLVal apply(ESLVal... args) { return isFloatType(args[0]); }});
  public static ESLVal typeEqual(ESLVal t1,ESLVal t2) {
    
    {ESLVal b = typeEqual1(t1,t2);
      
      return b;
    }
  }
  public static ESLVal typeEqual = new ESLVal(new Function(new ESLVal("typeEqual"),null) { public ESLVal apply(ESLVal... args) { return typeEqual(args[0],args[1]); }});
  public static ESLVal typeEqual1(ESLVal t1,ESLVal t2) {
    
    if(t1.eql(t2).boolVal)
      return $true;
      else
        {ESLVal _v11 = t1;
          ESLVal _v12 = t2;
          
          switch(_v11.termName) {
          case "ArrayType": {ESLVal $198 = _v11.termRef(0);
            ESLVal $197 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "ArrayType": {ESLVal $200 = _v12.termRef(0);
              ESLVal $199 = _v12.termRef(1);
              
              {ESLVal l1 = $198;
              
              {ESLVal _v768 = $197;
              
              {ESLVal l2 = $200;
              
              {ESLVal _v769 = $199;
              
              return typeEqual(_v768,_v769);
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v784 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v784,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v782 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v783 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v782,flattenAct(l2,_v783,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v779 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v779,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v780 = _v11;
                  
                  {ESLVal _v781 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v776 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v776,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v777 = _v11;
                  
                  {ESLVal _v778 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v775 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v774 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v774,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v772 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v773 = $32;
                
                return typeEqual(_v772,substType(new ESLVal("RecType",l2,n2,_v773),n2,_v773));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v770 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v771 = $29;
                
                return typeEqual(_v770,_v771);
              }
              }
              }
              }
              }
              default: {ESLVal _v785 = _v11;
                
                {ESLVal _v786 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "ActType": {ESLVal $193 = _v11.termRef(0);
            ESLVal $192 = _v11.termRef(1);
            ESLVal $191 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "ActType": {ESLVal $196 = _v12.termRef(0);
              ESLVal $195 = _v12.termRef(1);
              ESLVal $194 = _v12.termRef(2);
              
              {ESLVal l1 = $193;
              
              {ESLVal exports1 = $192;
              
              {ESLVal handlers1 = $191;
              
              {ESLVal l2 = $196;
              
              {ESLVal exports2 = $195;
              
              {ESLVal handlers2 = $194;
              
              return actEqual(exports1,exports2,handlers1,handlers2);
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v765 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v765,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v763 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v764 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v763,flattenAct(l2,_v764,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v760 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v760,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v761 = _v11;
                  
                  {ESLVal _v762 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v757 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v757,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v758 = _v11;
                  
                  {ESLVal _v759 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v756 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v755 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v755,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v753 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v754 = $32;
                
                return typeEqual(_v753,substType(new ESLVal("RecType",l2,n2,_v754),n2,_v754));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v751 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v752 = $29;
                
                return typeEqual(_v751,_v752);
              }
              }
              }
              }
              }
              default: {ESLVal _v766 = _v11;
                
                {ESLVal _v767 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "ApplyTypeFun": {ESLVal $187 = _v11.termRef(0);
            ESLVal $186 = _v11.termRef(1);
            ESLVal $185 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "ApplyTypeFun": {ESLVal $190 = _v12.termRef(0);
              ESLVal $189 = _v12.termRef(1);
              ESLVal $188 = _v12.termRef(2);
              
              {ESLVal l1 = $187;
              
              {ESLVal op1 = $186;
              
              {ESLVal args1 = $185;
              
              {ESLVal l2 = $190;
              
              {ESLVal op2 = $189;
              
              {ESLVal args2 = $188;
              
              return typeEqual(op1,op2).and(typesEqual(args1,args2));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $187;
              
              {ESLVal op = $186;
              
              {ESLVal args = $185;
              
              {ESLVal _v750 = _v12;
              
              return typeEqual(applyTypeFun(l,forceType(op),args),_v750);
            }
            }
            }
            }
          }
          }
        case "ExtendedAct": {ESLVal $184 = _v11.termRef(0);
            ESLVal $183 = _v11.termRef(1);
            ESLVal $182 = _v11.termRef(2);
            ESLVal $181 = _v11.termRef(3);
            
            {ESLVal l1 = $184;
            
            {ESLVal _v748 = $183;
            
            {ESLVal ds1 = $182;
            
            {ESLVal ms1 = $181;
            
            {ESLVal _v749 = _v12;
            
            return typeEqual(flattenAct(l1,_v748,ds1,ms1),_v749);
          }
          }
          }
          }
          }
          }
        case "BoolType": {ESLVal $179 = _v11.termRef(0);
            
            switch(_v12.termName) {
            case "BoolType": {ESLVal $180 = _v12.termRef(0);
              
              {ESLVal l1 = $179;
              
              {ESLVal l2 = $180;
              
              return $true;
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v745 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v745,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v743 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v744 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v743,flattenAct(l2,_v744,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v740 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v740,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v741 = _v11;
                  
                  {ESLVal _v742 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v737 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v737,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v738 = _v11;
                  
                  {ESLVal _v739 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v736 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v735 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v735,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v733 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v734 = $32;
                
                return typeEqual(_v733,substType(new ESLVal("RecType",l2,n2,_v734),n2,_v734));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v731 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v732 = $29;
                
                return typeEqual(_v731,_v732);
              }
              }
              }
              }
              }
              default: {ESLVal _v746 = _v11;
                
                {ESLVal _v747 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "FloatType": {ESLVal $177 = _v11.termRef(0);
            
            switch(_v12.termName) {
            case "FloatType": {ESLVal $178 = _v12.termRef(0);
              
              {ESLVal l1 = $177;
              
              {ESLVal l2 = $178;
              
              return $true;
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v728 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v728,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v726 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v727 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v726,flattenAct(l2,_v727,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v723 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v723,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v724 = _v11;
                  
                  {ESLVal _v725 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v720 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v720,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v721 = _v11;
                  
                  {ESLVal _v722 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v719 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v718 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v718,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v716 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v717 = $32;
                
                return typeEqual(_v716,substType(new ESLVal("RecType",l2,n2,_v717),n2,_v717));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v714 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v715 = $29;
                
                return typeEqual(_v714,_v715);
              }
              }
              }
              }
              }
              default: {ESLVal _v729 = _v11;
                
                {ESLVal _v730 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "IntType": {ESLVal $175 = _v11.termRef(0);
            
            switch(_v12.termName) {
            case "IntType": {ESLVal $176 = _v12.termRef(0);
              
              {ESLVal l1 = $175;
              
              {ESLVal l2 = $176;
              
              return $true;
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v711 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v711,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v709 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v710 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v709,flattenAct(l2,_v710,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v706 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v706,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v707 = _v11;
                  
                  {ESLVal _v708 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v703 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v703,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v704 = _v11;
                  
                  {ESLVal _v705 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v702 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v701 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v701,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v699 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v700 = $32;
                
                return typeEqual(_v699,substType(new ESLVal("RecType",l2,n2,_v700),n2,_v700));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v697 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v698 = $29;
                
                return typeEqual(_v697,_v698);
              }
              }
              }
              }
              }
              default: {ESLVal _v712 = _v11;
                
                {ESLVal _v713 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "ListType": {ESLVal $161 = _v11.termRef(0);
            ESLVal $160 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "ListType": {ESLVal $174 = _v12.termRef(0);
              ESLVal $173 = _v12.termRef(1);
              
              {ESLVal l1 = $161;
              
              {ESLVal _v678 = $160;
              
              {ESLVal l2 = $174;
              
              {ESLVal _v679 = $173;
              
              return typeEqual(_v678,_v679);
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $164 = _v12.termRef(0);
              ESLVal $163 = _v12.termRef(1);
              ESLVal $162 = _v12.termRef(2);
              
              if($163.isCons())
              {ESLVal $165 = $163.head();
                ESLVal $166 = $163.tail();
                
                if($166.isCons())
                {ESLVal $167 = $166.head();
                  ESLVal $168 = $166.tail();
                  
                  switch(_v12.termName) {
                  case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                    ESLVal $55 = _v12.termRef(1);
                    ESLVal $54 = _v12.termRef(2);
                    
                    {ESLVal _v567 = _v11;
                    
                    {ESLVal l = $56;
                    
                    {ESLVal op = $55;
                    
                    {ESLVal args = $54;
                    
                    return typeEqual(_v567,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                    ESLVal $52 = _v12.termRef(1);
                    ESLVal $51 = _v12.termRef(2);
                    ESLVal $50 = _v12.termRef(3);
                    
                    {ESLVal _v565 = _v11;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal _v566 = $52;
                    
                    {ESLVal ds2 = $51;
                    
                    {ESLVal ms2 = $50;
                    
                    return typeEqual(_v565,flattenAct(l2,_v566,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $49 = _v12.termRef(0);
                    
                    {ESLVal t = _v11;
                    
                    {ESLVal l1 = $49;
                    
                    return $true;
                  }
                  }
                  }
                case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                    ESLVal $45 = _v12.termRef(1);
                    ESLVal $44 = _v12.termRef(2);
                    
                    switch($44.termName) {
                    case "UnionType": {ESLVal $48 = $44.termRef(0);
                      ESLVal $47 = $44.termRef(1);
                      
                      {ESLVal _v562 = _v11;
                      
                      {ESLVal l = $46;
                      
                      {ESLVal state = $45;
                      
                      {ESLVal ul = $48;
                      
                      {ESLVal terms = $47;
                      
                      return typeEqual(_v562,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v563 = _v11;
                      
                      {ESLVal _v564 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                    ESLVal $40 = _v12.termRef(1);
                    ESLVal $39 = _v12.termRef(2);
                    
                    switch($39.termName) {
                    case "UnionType": {ESLVal $43 = $39.termRef(0);
                      ESLVal $42 = $39.termRef(1);
                      
                      {ESLVal _v559 = _v11;
                      
                      {ESLVal l = $41;
                      
                      {ESLVal state = $40;
                      
                      {ESLVal ul = $43;
                      
                      {ESLVal terms = $42;
                      
                      return typeEqual(_v559,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v560 = _v11;
                      
                      {ESLVal _v561 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "TermType": {ESLVal $38 = _v12.termRef(0);
                    ESLVal $37 = _v12.termRef(1);
                    ESLVal $36 = _v12.termRef(2);
                    
                    {ESLVal _v558 = _v11;
                    
                    {ESLVal l2 = $38;
                    
                    {ESLVal n2 = $37;
                    
                    {ESLVal args2 = $36;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                    
                    {ESLVal _v557 = _v11;
                    
                    {ESLVal f = $35;
                    
                    return typeEqual(_v557,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $34 = _v12.termRef(0);
                    ESLVal $33 = _v12.termRef(1);
                    ESLVal $32 = _v12.termRef(2);
                    
                    {ESLVal _v555 = _v11;
                    
                    {ESLVal l2 = $34;
                    
                    {ESLVal n2 = $33;
                    
                    {ESLVal _v556 = $32;
                    
                    return typeEqual(_v555,substType(new ESLVal("RecType",l2,n2,_v556),n2,_v556));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $31 = _v12.termRef(0);
                    ESLVal $30 = _v12.termRef(1);
                    ESLVal $29 = _v12.termRef(2);
                    
                    {ESLVal _v553 = _v11;
                    
                    {ESLVal l1 = $31;
                    
                    {ESLVal ns2 = $30;
                    
                    {ESLVal _v554 = $29;
                    
                    return typeEqual(_v553,_v554);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v568 = _v11;
                    
                    {ESLVal _v569 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              else if($166.isNil())
                switch($162.termName) {
                  case "ListType": {ESLVal $170 = $162.termRef(0);
                    ESLVal $169 = $162.termRef(1);
                    
                    switch($169.termName) {
                    case "VarType": {ESLVal $172 = $169.termRef(0);
                      ESLVal $171 = $169.termRef(1);
                      
                      {ESLVal l1 = $161;
                      
                      {ESLVal _v570 = $160;
                      
                      {ESLVal l2 = $164;
                      
                      {ESLVal v1 = $165;
                      
                      {ESLVal l3 = $170;
                      
                      {ESLVal l4 = $172;
                      
                      {ESLVal v2 = $171;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v12.termName) {
                          case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                            ESLVal $55 = _v12.termRef(1);
                            ESLVal $54 = _v12.termRef(2);
                            
                            {ESLVal _v590 = _v11;
                            
                            {ESLVal l = $56;
                            
                            {ESLVal op = $55;
                            
                            {ESLVal args = $54;
                            
                            return typeEqual(_v590,applyTypeFun(l,forceType(op),args));
                          }
                          }
                          }
                          }
                          }
                        case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                            ESLVal $52 = _v12.termRef(1);
                            ESLVal $51 = _v12.termRef(2);
                            ESLVal $50 = _v12.termRef(3);
                            
                            {ESLVal _v587 = _v11;
                            
                            {ESLVal _v588 = $53;
                            
                            {ESLVal _v589 = $52;
                            
                            {ESLVal ds2 = $51;
                            
                            {ESLVal ms2 = $50;
                            
                            return typeEqual(_v587,flattenAct(_v588,_v589,ds2,ms2));
                          }
                          }
                          }
                          }
                          }
                          }
                        case "VoidType": {ESLVal $49 = _v12.termRef(0);
                            
                            {ESLVal t = _v11;
                            
                            {ESLVal _v586 = $49;
                            
                            return $true;
                          }
                          }
                          }
                        case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                            ESLVal $45 = _v12.termRef(1);
                            ESLVal $44 = _v12.termRef(2);
                            
                            switch($44.termName) {
                            case "UnionType": {ESLVal $48 = $44.termRef(0);
                              ESLVal $47 = $44.termRef(1);
                              
                              {ESLVal _v583 = _v11;
                              
                              {ESLVal l = $46;
                              
                              {ESLVal state = $45;
                              
                              {ESLVal ul = $48;
                              
                              {ESLVal terms = $47;
                              
                              return typeEqual(_v583,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v584 = _v11;
                              
                              {ESLVal _v585 = _v12;
                              
                              return $false;
                            }
                            }
                          }
                          }
                        case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                            ESLVal $40 = _v12.termRef(1);
                            ESLVal $39 = _v12.termRef(2);
                            
                            switch($39.termName) {
                            case "UnionType": {ESLVal $43 = $39.termRef(0);
                              ESLVal $42 = $39.termRef(1);
                              
                              {ESLVal _v580 = _v11;
                              
                              {ESLVal l = $41;
                              
                              {ESLVal state = $40;
                              
                              {ESLVal ul = $43;
                              
                              {ESLVal terms = $42;
                              
                              return typeEqual(_v580,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v581 = _v11;
                              
                              {ESLVal _v582 = _v12;
                              
                              return $false;
                            }
                            }
                          }
                          }
                        case "TermType": {ESLVal $38 = _v12.termRef(0);
                            ESLVal $37 = _v12.termRef(1);
                            ESLVal $36 = _v12.termRef(2);
                            
                            {ESLVal _v578 = _v11;
                            
                            {ESLVal _v579 = $38;
                            
                            {ESLVal n2 = $37;
                            
                            {ESLVal args2 = $36;
                            
                            return $false;
                          }
                          }
                          }
                          }
                          }
                        case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                            
                            {ESLVal _v577 = _v11;
                            
                            {ESLVal f = $35;
                            
                            return typeEqual(_v577,f.apply());
                          }
                          }
                          }
                        case "RecType": {ESLVal $34 = _v12.termRef(0);
                            ESLVal $33 = _v12.termRef(1);
                            ESLVal $32 = _v12.termRef(2);
                            
                            {ESLVal _v574 = _v11;
                            
                            {ESLVal _v575 = $34;
                            
                            {ESLVal n2 = $33;
                            
                            {ESLVal _v576 = $32;
                            
                            return typeEqual(_v574,substType(new ESLVal("RecType",_v575,n2,_v576),n2,_v576));
                          }
                          }
                          }
                          }
                          }
                        case "ForallType": {ESLVal $31 = _v12.termRef(0);
                            ESLVal $30 = _v12.termRef(1);
                            ESLVal $29 = _v12.termRef(2);
                            
                            {ESLVal _v571 = _v11;
                            
                            {ESLVal _v572 = $31;
                            
                            {ESLVal ns2 = $30;
                            
                            {ESLVal _v573 = $29;
                            
                            return typeEqual(_v571,_v573);
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v591 = _v11;
                            
                            {ESLVal _v592 = _v12;
                            
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
                    default: switch(_v12.termName) {
                      case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                        ESLVal $55 = _v12.termRef(1);
                        ESLVal $54 = _v12.termRef(2);
                        
                        {ESLVal _v607 = _v11;
                        
                        {ESLVal l = $56;
                        
                        {ESLVal op = $55;
                        
                        {ESLVal args = $54;
                        
                        return typeEqual(_v607,applyTypeFun(l,forceType(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                        ESLVal $52 = _v12.termRef(1);
                        ESLVal $51 = _v12.termRef(2);
                        ESLVal $50 = _v12.termRef(3);
                        
                        {ESLVal _v605 = _v11;
                        
                        {ESLVal l2 = $53;
                        
                        {ESLVal _v606 = $52;
                        
                        {ESLVal ds2 = $51;
                        
                        {ESLVal ms2 = $50;
                        
                        return typeEqual(_v605,flattenAct(l2,_v606,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $49 = _v12.termRef(0);
                        
                        {ESLVal t = _v11;
                        
                        {ESLVal l1 = $49;
                        
                        return $true;
                      }
                      }
                      }
                    case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                        ESLVal $45 = _v12.termRef(1);
                        ESLVal $44 = _v12.termRef(2);
                        
                        switch($44.termName) {
                        case "UnionType": {ESLVal $48 = $44.termRef(0);
                          ESLVal $47 = $44.termRef(1);
                          
                          {ESLVal _v602 = _v11;
                          
                          {ESLVal l = $46;
                          
                          {ESLVal state = $45;
                          
                          {ESLVal ul = $48;
                          
                          {ESLVal terms = $47;
                          
                          return typeEqual(_v602,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v603 = _v11;
                          
                          {ESLVal _v604 = _v12;
                          
                          return $false;
                        }
                        }
                      }
                      }
                    case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                        ESLVal $40 = _v12.termRef(1);
                        ESLVal $39 = _v12.termRef(2);
                        
                        switch($39.termName) {
                        case "UnionType": {ESLVal $43 = $39.termRef(0);
                          ESLVal $42 = $39.termRef(1);
                          
                          {ESLVal _v599 = _v11;
                          
                          {ESLVal l = $41;
                          
                          {ESLVal state = $40;
                          
                          {ESLVal ul = $43;
                          
                          {ESLVal terms = $42;
                          
                          return typeEqual(_v599,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v600 = _v11;
                          
                          {ESLVal _v601 = _v12;
                          
                          return $false;
                        }
                        }
                      }
                      }
                    case "TermType": {ESLVal $38 = _v12.termRef(0);
                        ESLVal $37 = _v12.termRef(1);
                        ESLVal $36 = _v12.termRef(2);
                        
                        {ESLVal _v598 = _v11;
                        
                        {ESLVal l2 = $38;
                        
                        {ESLVal n2 = $37;
                        
                        {ESLVal args2 = $36;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                        
                        {ESLVal _v597 = _v11;
                        
                        {ESLVal f = $35;
                        
                        return typeEqual(_v597,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $34 = _v12.termRef(0);
                        ESLVal $33 = _v12.termRef(1);
                        ESLVal $32 = _v12.termRef(2);
                        
                        {ESLVal _v595 = _v11;
                        
                        {ESLVal l2 = $34;
                        
                        {ESLVal n2 = $33;
                        
                        {ESLVal _v596 = $32;
                        
                        return typeEqual(_v595,substType(new ESLVal("RecType",l2,n2,_v596),n2,_v596));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $31 = _v12.termRef(0);
                        ESLVal $30 = _v12.termRef(1);
                        ESLVal $29 = _v12.termRef(2);
                        
                        {ESLVal _v593 = _v11;
                        
                        {ESLVal l1 = $31;
                        
                        {ESLVal ns2 = $30;
                        
                        {ESLVal _v594 = $29;
                        
                        return typeEqual(_v593,_v594);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v608 = _v11;
                        
                        {ESLVal _v609 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v12.termName) {
                    case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                      ESLVal $55 = _v12.termRef(1);
                      ESLVal $54 = _v12.termRef(2);
                      
                      {ESLVal _v624 = _v11;
                      
                      {ESLVal l = $56;
                      
                      {ESLVal op = $55;
                      
                      {ESLVal args = $54;
                      
                      return typeEqual(_v624,applyTypeFun(l,forceType(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                      ESLVal $52 = _v12.termRef(1);
                      ESLVal $51 = _v12.termRef(2);
                      ESLVal $50 = _v12.termRef(3);
                      
                      {ESLVal _v622 = _v11;
                      
                      {ESLVal l2 = $53;
                      
                      {ESLVal _v623 = $52;
                      
                      {ESLVal ds2 = $51;
                      
                      {ESLVal ms2 = $50;
                      
                      return typeEqual(_v622,flattenAct(l2,_v623,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $49 = _v12.termRef(0);
                      
                      {ESLVal t = _v11;
                      
                      {ESLVal l1 = $49;
                      
                      return $true;
                    }
                    }
                    }
                  case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                      ESLVal $45 = _v12.termRef(1);
                      ESLVal $44 = _v12.termRef(2);
                      
                      switch($44.termName) {
                      case "UnionType": {ESLVal $48 = $44.termRef(0);
                        ESLVal $47 = $44.termRef(1);
                        
                        {ESLVal _v619 = _v11;
                        
                        {ESLVal l = $46;
                        
                        {ESLVal state = $45;
                        
                        {ESLVal ul = $48;
                        
                        {ESLVal terms = $47;
                        
                        return typeEqual(_v619,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v620 = _v11;
                        
                        {ESLVal _v621 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                    }
                  case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                      ESLVal $40 = _v12.termRef(1);
                      ESLVal $39 = _v12.termRef(2);
                      
                      switch($39.termName) {
                      case "UnionType": {ESLVal $43 = $39.termRef(0);
                        ESLVal $42 = $39.termRef(1);
                        
                        {ESLVal _v616 = _v11;
                        
                        {ESLVal l = $41;
                        
                        {ESLVal state = $40;
                        
                        {ESLVal ul = $43;
                        
                        {ESLVal terms = $42;
                        
                        return typeEqual(_v616,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v617 = _v11;
                        
                        {ESLVal _v618 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                    }
                  case "TermType": {ESLVal $38 = _v12.termRef(0);
                      ESLVal $37 = _v12.termRef(1);
                      ESLVal $36 = _v12.termRef(2);
                      
                      {ESLVal _v615 = _v11;
                      
                      {ESLVal l2 = $38;
                      
                      {ESLVal n2 = $37;
                      
                      {ESLVal args2 = $36;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                      
                      {ESLVal _v614 = _v11;
                      
                      {ESLVal f = $35;
                      
                      return typeEqual(_v614,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $34 = _v12.termRef(0);
                      ESLVal $33 = _v12.termRef(1);
                      ESLVal $32 = _v12.termRef(2);
                      
                      {ESLVal _v612 = _v11;
                      
                      {ESLVal l2 = $34;
                      
                      {ESLVal n2 = $33;
                      
                      {ESLVal _v613 = $32;
                      
                      return typeEqual(_v612,substType(new ESLVal("RecType",l2,n2,_v613),n2,_v613));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $31 = _v12.termRef(0);
                      ESLVal $30 = _v12.termRef(1);
                      ESLVal $29 = _v12.termRef(2);
                      
                      {ESLVal _v610 = _v11;
                      
                      {ESLVal l1 = $31;
                      
                      {ESLVal ns2 = $30;
                      
                      {ESLVal _v611 = $29;
                      
                      return typeEqual(_v610,_v611);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v625 = _v11;
                      
                      {ESLVal _v626 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                }
              else switch(_v12.termName) {
                  case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                    ESLVal $55 = _v12.termRef(1);
                    ESLVal $54 = _v12.termRef(2);
                    
                    {ESLVal _v641 = _v11;
                    
                    {ESLVal l = $56;
                    
                    {ESLVal op = $55;
                    
                    {ESLVal args = $54;
                    
                    return typeEqual(_v641,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                    ESLVal $52 = _v12.termRef(1);
                    ESLVal $51 = _v12.termRef(2);
                    ESLVal $50 = _v12.termRef(3);
                    
                    {ESLVal _v639 = _v11;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal _v640 = $52;
                    
                    {ESLVal ds2 = $51;
                    
                    {ESLVal ms2 = $50;
                    
                    return typeEqual(_v639,flattenAct(l2,_v640,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $49 = _v12.termRef(0);
                    
                    {ESLVal t = _v11;
                    
                    {ESLVal l1 = $49;
                    
                    return $true;
                  }
                  }
                  }
                case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                    ESLVal $45 = _v12.termRef(1);
                    ESLVal $44 = _v12.termRef(2);
                    
                    switch($44.termName) {
                    case "UnionType": {ESLVal $48 = $44.termRef(0);
                      ESLVal $47 = $44.termRef(1);
                      
                      {ESLVal _v636 = _v11;
                      
                      {ESLVal l = $46;
                      
                      {ESLVal state = $45;
                      
                      {ESLVal ul = $48;
                      
                      {ESLVal terms = $47;
                      
                      return typeEqual(_v636,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v637 = _v11;
                      
                      {ESLVal _v638 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                    ESLVal $40 = _v12.termRef(1);
                    ESLVal $39 = _v12.termRef(2);
                    
                    switch($39.termName) {
                    case "UnionType": {ESLVal $43 = $39.termRef(0);
                      ESLVal $42 = $39.termRef(1);
                      
                      {ESLVal _v633 = _v11;
                      
                      {ESLVal l = $41;
                      
                      {ESLVal state = $40;
                      
                      {ESLVal ul = $43;
                      
                      {ESLVal terms = $42;
                      
                      return typeEqual(_v633,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v634 = _v11;
                      
                      {ESLVal _v635 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "TermType": {ESLVal $38 = _v12.termRef(0);
                    ESLVal $37 = _v12.termRef(1);
                    ESLVal $36 = _v12.termRef(2);
                    
                    {ESLVal _v632 = _v11;
                    
                    {ESLVal l2 = $38;
                    
                    {ESLVal n2 = $37;
                    
                    {ESLVal args2 = $36;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                    
                    {ESLVal _v631 = _v11;
                    
                    {ESLVal f = $35;
                    
                    return typeEqual(_v631,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $34 = _v12.termRef(0);
                    ESLVal $33 = _v12.termRef(1);
                    ESLVal $32 = _v12.termRef(2);
                    
                    {ESLVal _v629 = _v11;
                    
                    {ESLVal l2 = $34;
                    
                    {ESLVal n2 = $33;
                    
                    {ESLVal _v630 = $32;
                    
                    return typeEqual(_v629,substType(new ESLVal("RecType",l2,n2,_v630),n2,_v630));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $31 = _v12.termRef(0);
                    ESLVal $30 = _v12.termRef(1);
                    ESLVal $29 = _v12.termRef(2);
                    
                    {ESLVal _v627 = _v11;
                    
                    {ESLVal l1 = $31;
                    
                    {ESLVal ns2 = $30;
                    
                    {ESLVal _v628 = $29;
                    
                    return typeEqual(_v627,_v628);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v642 = _v11;
                    
                    {ESLVal _v643 = _v12;
                    
                    return $false;
                  }
                  }
                }
              }
            else if($163.isNil())
              switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v658 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v658,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v656 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v657 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v656,flattenAct(l2,_v657,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v653 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v653,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v654 = _v11;
                    
                    {ESLVal _v655 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v650 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v650,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v651 = _v11;
                    
                    {ESLVal _v652 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v649 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v648 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v648,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v646 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v647 = $32;
                  
                  return typeEqual(_v646,substType(new ESLVal("RecType",l2,n2,_v647),n2,_v647));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v644 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v645 = $29;
                  
                  return typeEqual(_v644,_v645);
                }
                }
                }
                }
                }
                default: {ESLVal _v659 = _v11;
                  
                  {ESLVal _v660 = _v12;
                  
                  return $false;
                }
                }
              }
            else switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v675 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v675,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v673 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v674 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v673,flattenAct(l2,_v674,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v670 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v670,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v671 = _v11;
                    
                    {ESLVal _v672 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v667 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v667,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v668 = _v11;
                    
                    {ESLVal _v669 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v666 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v665 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v665,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v663 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v664 = $32;
                  
                  return typeEqual(_v663,substType(new ESLVal("RecType",l2,n2,_v664),n2,_v664));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v661 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v662 = $29;
                  
                  return typeEqual(_v661,_v662);
                }
                }
                }
                }
                }
                default: {ESLVal _v676 = _v11;
                  
                  {ESLVal _v677 = _v12;
                  
                  return $false;
                }
                }
              }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v694 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v694,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v692 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v693 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v692,flattenAct(l2,_v693,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v689 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v689,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v690 = _v11;
                  
                  {ESLVal _v691 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v686 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v686,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v687 = _v11;
                  
                  {ESLVal _v688 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v685 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v684 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v684,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v682 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v683 = $32;
                
                return typeEqual(_v682,substType(new ESLVal("RecType",l2,n2,_v683),n2,_v683));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v680 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v681 = $29;
                
                return typeEqual(_v680,_v681);
              }
              }
              }
              }
              }
              default: {ESLVal _v695 = _v11;
                
                {ESLVal _v696 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "BagType": {ESLVal $157 = _v11.termRef(0);
            ESLVal $156 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "BagType": {ESLVal $159 = _v12.termRef(0);
              ESLVal $158 = _v12.termRef(1);
              
              {ESLVal l1 = $157;
              
              {ESLVal _v534 = $156;
              
              {ESLVal l2 = $159;
              
              {ESLVal _v535 = $158;
              
              return typeEqual(_v534,_v535);
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v550 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v550,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v548 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v549 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v548,flattenAct(l2,_v549,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v545 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v545,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v546 = _v11;
                  
                  {ESLVal _v547 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v542 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v542,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v543 = _v11;
                  
                  {ESLVal _v544 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v541 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v540 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v540,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v538 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v539 = $32;
                
                return typeEqual(_v538,substType(new ESLVal("RecType",l2,n2,_v539),n2,_v539));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v536 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v537 = $29;
                
                return typeEqual(_v536,_v537);
              }
              }
              }
              }
              }
              default: {ESLVal _v551 = _v11;
                
                {ESLVal _v552 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "SetType": {ESLVal $142 = _v11.termRef(0);
            ESLVal $141 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "SetType": {ESLVal $155 = _v12.termRef(0);
              ESLVal $154 = _v12.termRef(1);
              
              {ESLVal l1 = $142;
              
              {ESLVal _v515 = $141;
              
              {ESLVal l2 = $155;
              
              {ESLVal _v516 = $154;
              
              return typeEqual(_v515,_v516);
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $145 = _v12.termRef(0);
              ESLVal $144 = _v12.termRef(1);
              ESLVal $143 = _v12.termRef(2);
              
              if($144.isCons())
              {ESLVal $146 = $144.head();
                ESLVal $147 = $144.tail();
                
                if($147.isCons())
                {ESLVal $148 = $147.head();
                  ESLVal $149 = $147.tail();
                  
                  switch(_v12.termName) {
                  case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                    ESLVal $55 = _v12.termRef(1);
                    ESLVal $54 = _v12.termRef(2);
                    
                    {ESLVal _v404 = _v11;
                    
                    {ESLVal l = $56;
                    
                    {ESLVal op = $55;
                    
                    {ESLVal args = $54;
                    
                    return typeEqual(_v404,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                    ESLVal $52 = _v12.termRef(1);
                    ESLVal $51 = _v12.termRef(2);
                    ESLVal $50 = _v12.termRef(3);
                    
                    {ESLVal _v402 = _v11;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal _v403 = $52;
                    
                    {ESLVal ds2 = $51;
                    
                    {ESLVal ms2 = $50;
                    
                    return typeEqual(_v402,flattenAct(l2,_v403,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $49 = _v12.termRef(0);
                    
                    {ESLVal t = _v11;
                    
                    {ESLVal l1 = $49;
                    
                    return $true;
                  }
                  }
                  }
                case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                    ESLVal $45 = _v12.termRef(1);
                    ESLVal $44 = _v12.termRef(2);
                    
                    switch($44.termName) {
                    case "UnionType": {ESLVal $48 = $44.termRef(0);
                      ESLVal $47 = $44.termRef(1);
                      
                      {ESLVal _v399 = _v11;
                      
                      {ESLVal l = $46;
                      
                      {ESLVal state = $45;
                      
                      {ESLVal ul = $48;
                      
                      {ESLVal terms = $47;
                      
                      return typeEqual(_v399,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v400 = _v11;
                      
                      {ESLVal _v401 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                    ESLVal $40 = _v12.termRef(1);
                    ESLVal $39 = _v12.termRef(2);
                    
                    switch($39.termName) {
                    case "UnionType": {ESLVal $43 = $39.termRef(0);
                      ESLVal $42 = $39.termRef(1);
                      
                      {ESLVal _v396 = _v11;
                      
                      {ESLVal l = $41;
                      
                      {ESLVal state = $40;
                      
                      {ESLVal ul = $43;
                      
                      {ESLVal terms = $42;
                      
                      return typeEqual(_v396,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v397 = _v11;
                      
                      {ESLVal _v398 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "TermType": {ESLVal $38 = _v12.termRef(0);
                    ESLVal $37 = _v12.termRef(1);
                    ESLVal $36 = _v12.termRef(2);
                    
                    {ESLVal _v395 = _v11;
                    
                    {ESLVal l2 = $38;
                    
                    {ESLVal n2 = $37;
                    
                    {ESLVal args2 = $36;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                    
                    {ESLVal _v394 = _v11;
                    
                    {ESLVal f = $35;
                    
                    return typeEqual(_v394,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $34 = _v12.termRef(0);
                    ESLVal $33 = _v12.termRef(1);
                    ESLVal $32 = _v12.termRef(2);
                    
                    {ESLVal _v392 = _v11;
                    
                    {ESLVal l2 = $34;
                    
                    {ESLVal n2 = $33;
                    
                    {ESLVal _v393 = $32;
                    
                    return typeEqual(_v392,substType(new ESLVal("RecType",l2,n2,_v393),n2,_v393));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $31 = _v12.termRef(0);
                    ESLVal $30 = _v12.termRef(1);
                    ESLVal $29 = _v12.termRef(2);
                    
                    {ESLVal _v390 = _v11;
                    
                    {ESLVal l1 = $31;
                    
                    {ESLVal ns2 = $30;
                    
                    {ESLVal _v391 = $29;
                    
                    return typeEqual(_v390,_v391);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v405 = _v11;
                    
                    {ESLVal _v406 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              else if($147.isNil())
                switch($143.termName) {
                  case "SetType": {ESLVal $151 = $143.termRef(0);
                    ESLVal $150 = $143.termRef(1);
                    
                    switch($150.termName) {
                    case "VarType": {ESLVal $153 = $150.termRef(0);
                      ESLVal $152 = $150.termRef(1);
                      
                      {ESLVal l1 = $142;
                      
                      {ESLVal _v407 = $141;
                      
                      {ESLVal l2 = $145;
                      
                      {ESLVal v1 = $146;
                      
                      {ESLVal l3 = $151;
                      
                      {ESLVal l4 = $153;
                      
                      {ESLVal v2 = $152;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v12.termName) {
                          case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                            ESLVal $55 = _v12.termRef(1);
                            ESLVal $54 = _v12.termRef(2);
                            
                            {ESLVal _v427 = _v11;
                            
                            {ESLVal l = $56;
                            
                            {ESLVal op = $55;
                            
                            {ESLVal args = $54;
                            
                            return typeEqual(_v427,applyTypeFun(l,forceType(op),args));
                          }
                          }
                          }
                          }
                          }
                        case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                            ESLVal $52 = _v12.termRef(1);
                            ESLVal $51 = _v12.termRef(2);
                            ESLVal $50 = _v12.termRef(3);
                            
                            {ESLVal _v424 = _v11;
                            
                            {ESLVal _v425 = $53;
                            
                            {ESLVal _v426 = $52;
                            
                            {ESLVal ds2 = $51;
                            
                            {ESLVal ms2 = $50;
                            
                            return typeEqual(_v424,flattenAct(_v425,_v426,ds2,ms2));
                          }
                          }
                          }
                          }
                          }
                          }
                        case "VoidType": {ESLVal $49 = _v12.termRef(0);
                            
                            {ESLVal t = _v11;
                            
                            {ESLVal _v423 = $49;
                            
                            return $true;
                          }
                          }
                          }
                        case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                            ESLVal $45 = _v12.termRef(1);
                            ESLVal $44 = _v12.termRef(2);
                            
                            switch($44.termName) {
                            case "UnionType": {ESLVal $48 = $44.termRef(0);
                              ESLVal $47 = $44.termRef(1);
                              
                              {ESLVal _v420 = _v11;
                              
                              {ESLVal l = $46;
                              
                              {ESLVal state = $45;
                              
                              {ESLVal ul = $48;
                              
                              {ESLVal terms = $47;
                              
                              return typeEqual(_v420,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v421 = _v11;
                              
                              {ESLVal _v422 = _v12;
                              
                              return $false;
                            }
                            }
                          }
                          }
                        case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                            ESLVal $40 = _v12.termRef(1);
                            ESLVal $39 = _v12.termRef(2);
                            
                            switch($39.termName) {
                            case "UnionType": {ESLVal $43 = $39.termRef(0);
                              ESLVal $42 = $39.termRef(1);
                              
                              {ESLVal _v417 = _v11;
                              
                              {ESLVal l = $41;
                              
                              {ESLVal state = $40;
                              
                              {ESLVal ul = $43;
                              
                              {ESLVal terms = $42;
                              
                              return typeEqual(_v417,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                            }
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v418 = _v11;
                              
                              {ESLVal _v419 = _v12;
                              
                              return $false;
                            }
                            }
                          }
                          }
                        case "TermType": {ESLVal $38 = _v12.termRef(0);
                            ESLVal $37 = _v12.termRef(1);
                            ESLVal $36 = _v12.termRef(2);
                            
                            {ESLVal _v415 = _v11;
                            
                            {ESLVal _v416 = $38;
                            
                            {ESLVal n2 = $37;
                            
                            {ESLVal args2 = $36;
                            
                            return $false;
                          }
                          }
                          }
                          }
                          }
                        case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                            
                            {ESLVal _v414 = _v11;
                            
                            {ESLVal f = $35;
                            
                            return typeEqual(_v414,f.apply());
                          }
                          }
                          }
                        case "RecType": {ESLVal $34 = _v12.termRef(0);
                            ESLVal $33 = _v12.termRef(1);
                            ESLVal $32 = _v12.termRef(2);
                            
                            {ESLVal _v411 = _v11;
                            
                            {ESLVal _v412 = $34;
                            
                            {ESLVal n2 = $33;
                            
                            {ESLVal _v413 = $32;
                            
                            return typeEqual(_v411,substType(new ESLVal("RecType",_v412,n2,_v413),n2,_v413));
                          }
                          }
                          }
                          }
                          }
                        case "ForallType": {ESLVal $31 = _v12.termRef(0);
                            ESLVal $30 = _v12.termRef(1);
                            ESLVal $29 = _v12.termRef(2);
                            
                            {ESLVal _v408 = _v11;
                            
                            {ESLVal _v409 = $31;
                            
                            {ESLVal ns2 = $30;
                            
                            {ESLVal _v410 = $29;
                            
                            return typeEqual(_v408,_v410);
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v428 = _v11;
                            
                            {ESLVal _v429 = _v12;
                            
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
                    default: switch(_v12.termName) {
                      case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                        ESLVal $55 = _v12.termRef(1);
                        ESLVal $54 = _v12.termRef(2);
                        
                        {ESLVal _v444 = _v11;
                        
                        {ESLVal l = $56;
                        
                        {ESLVal op = $55;
                        
                        {ESLVal args = $54;
                        
                        return typeEqual(_v444,applyTypeFun(l,forceType(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                        ESLVal $52 = _v12.termRef(1);
                        ESLVal $51 = _v12.termRef(2);
                        ESLVal $50 = _v12.termRef(3);
                        
                        {ESLVal _v442 = _v11;
                        
                        {ESLVal l2 = $53;
                        
                        {ESLVal _v443 = $52;
                        
                        {ESLVal ds2 = $51;
                        
                        {ESLVal ms2 = $50;
                        
                        return typeEqual(_v442,flattenAct(l2,_v443,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "VoidType": {ESLVal $49 = _v12.termRef(0);
                        
                        {ESLVal t = _v11;
                        
                        {ESLVal l1 = $49;
                        
                        return $true;
                      }
                      }
                      }
                    case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                        ESLVal $45 = _v12.termRef(1);
                        ESLVal $44 = _v12.termRef(2);
                        
                        switch($44.termName) {
                        case "UnionType": {ESLVal $48 = $44.termRef(0);
                          ESLVal $47 = $44.termRef(1);
                          
                          {ESLVal _v439 = _v11;
                          
                          {ESLVal l = $46;
                          
                          {ESLVal state = $45;
                          
                          {ESLVal ul = $48;
                          
                          {ESLVal terms = $47;
                          
                          return typeEqual(_v439,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v440 = _v11;
                          
                          {ESLVal _v441 = _v12;
                          
                          return $false;
                        }
                        }
                      }
                      }
                    case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                        ESLVal $40 = _v12.termRef(1);
                        ESLVal $39 = _v12.termRef(2);
                        
                        switch($39.termName) {
                        case "UnionType": {ESLVal $43 = $39.termRef(0);
                          ESLVal $42 = $39.termRef(1);
                          
                          {ESLVal _v436 = _v11;
                          
                          {ESLVal l = $41;
                          
                          {ESLVal state = $40;
                          
                          {ESLVal ul = $43;
                          
                          {ESLVal terms = $42;
                          
                          return typeEqual(_v436,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v437 = _v11;
                          
                          {ESLVal _v438 = _v12;
                          
                          return $false;
                        }
                        }
                      }
                      }
                    case "TermType": {ESLVal $38 = _v12.termRef(0);
                        ESLVal $37 = _v12.termRef(1);
                        ESLVal $36 = _v12.termRef(2);
                        
                        {ESLVal _v435 = _v11;
                        
                        {ESLVal l2 = $38;
                        
                        {ESLVal n2 = $37;
                        
                        {ESLVal args2 = $36;
                        
                        return $false;
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                        
                        {ESLVal _v434 = _v11;
                        
                        {ESLVal f = $35;
                        
                        return typeEqual(_v434,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $34 = _v12.termRef(0);
                        ESLVal $33 = _v12.termRef(1);
                        ESLVal $32 = _v12.termRef(2);
                        
                        {ESLVal _v432 = _v11;
                        
                        {ESLVal l2 = $34;
                        
                        {ESLVal n2 = $33;
                        
                        {ESLVal _v433 = $32;
                        
                        return typeEqual(_v432,substType(new ESLVal("RecType",l2,n2,_v433),n2,_v433));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $31 = _v12.termRef(0);
                        ESLVal $30 = _v12.termRef(1);
                        ESLVal $29 = _v12.termRef(2);
                        
                        {ESLVal _v430 = _v11;
                        
                        {ESLVal l1 = $31;
                        
                        {ESLVal ns2 = $30;
                        
                        {ESLVal _v431 = $29;
                        
                        return typeEqual(_v430,_v431);
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v445 = _v11;
                        
                        {ESLVal _v446 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v12.termName) {
                    case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                      ESLVal $55 = _v12.termRef(1);
                      ESLVal $54 = _v12.termRef(2);
                      
                      {ESLVal _v461 = _v11;
                      
                      {ESLVal l = $56;
                      
                      {ESLVal op = $55;
                      
                      {ESLVal args = $54;
                      
                      return typeEqual(_v461,applyTypeFun(l,forceType(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                      ESLVal $52 = _v12.termRef(1);
                      ESLVal $51 = _v12.termRef(2);
                      ESLVal $50 = _v12.termRef(3);
                      
                      {ESLVal _v459 = _v11;
                      
                      {ESLVal l2 = $53;
                      
                      {ESLVal _v460 = $52;
                      
                      {ESLVal ds2 = $51;
                      
                      {ESLVal ms2 = $50;
                      
                      return typeEqual(_v459,flattenAct(l2,_v460,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "VoidType": {ESLVal $49 = _v12.termRef(0);
                      
                      {ESLVal t = _v11;
                      
                      {ESLVal l1 = $49;
                      
                      return $true;
                    }
                    }
                    }
                  case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                      ESLVal $45 = _v12.termRef(1);
                      ESLVal $44 = _v12.termRef(2);
                      
                      switch($44.termName) {
                      case "UnionType": {ESLVal $48 = $44.termRef(0);
                        ESLVal $47 = $44.termRef(1);
                        
                        {ESLVal _v456 = _v11;
                        
                        {ESLVal l = $46;
                        
                        {ESLVal state = $45;
                        
                        {ESLVal ul = $48;
                        
                        {ESLVal terms = $47;
                        
                        return typeEqual(_v456,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v457 = _v11;
                        
                        {ESLVal _v458 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                    }
                  case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                      ESLVal $40 = _v12.termRef(1);
                      ESLVal $39 = _v12.termRef(2);
                      
                      switch($39.termName) {
                      case "UnionType": {ESLVal $43 = $39.termRef(0);
                        ESLVal $42 = $39.termRef(1);
                        
                        {ESLVal _v453 = _v11;
                        
                        {ESLVal l = $41;
                        
                        {ESLVal state = $40;
                        
                        {ESLVal ul = $43;
                        
                        {ESLVal terms = $42;
                        
                        return typeEqual(_v453,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal _v454 = _v11;
                        
                        {ESLVal _v455 = _v12;
                        
                        return $false;
                      }
                      }
                    }
                    }
                  case "TermType": {ESLVal $38 = _v12.termRef(0);
                      ESLVal $37 = _v12.termRef(1);
                      ESLVal $36 = _v12.termRef(2);
                      
                      {ESLVal _v452 = _v11;
                      
                      {ESLVal l2 = $38;
                      
                      {ESLVal n2 = $37;
                      
                      {ESLVal args2 = $36;
                      
                      return $false;
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                      
                      {ESLVal _v451 = _v11;
                      
                      {ESLVal f = $35;
                      
                      return typeEqual(_v451,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $34 = _v12.termRef(0);
                      ESLVal $33 = _v12.termRef(1);
                      ESLVal $32 = _v12.termRef(2);
                      
                      {ESLVal _v449 = _v11;
                      
                      {ESLVal l2 = $34;
                      
                      {ESLVal n2 = $33;
                      
                      {ESLVal _v450 = $32;
                      
                      return typeEqual(_v449,substType(new ESLVal("RecType",l2,n2,_v450),n2,_v450));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $31 = _v12.termRef(0);
                      ESLVal $30 = _v12.termRef(1);
                      ESLVal $29 = _v12.termRef(2);
                      
                      {ESLVal _v447 = _v11;
                      
                      {ESLVal l1 = $31;
                      
                      {ESLVal ns2 = $30;
                      
                      {ESLVal _v448 = $29;
                      
                      return typeEqual(_v447,_v448);
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v462 = _v11;
                      
                      {ESLVal _v463 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                }
              else switch(_v12.termName) {
                  case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                    ESLVal $55 = _v12.termRef(1);
                    ESLVal $54 = _v12.termRef(2);
                    
                    {ESLVal _v478 = _v11;
                    
                    {ESLVal l = $56;
                    
                    {ESLVal op = $55;
                    
                    {ESLVal args = $54;
                    
                    return typeEqual(_v478,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                    ESLVal $52 = _v12.termRef(1);
                    ESLVal $51 = _v12.termRef(2);
                    ESLVal $50 = _v12.termRef(3);
                    
                    {ESLVal _v476 = _v11;
                    
                    {ESLVal l2 = $53;
                    
                    {ESLVal _v477 = $52;
                    
                    {ESLVal ds2 = $51;
                    
                    {ESLVal ms2 = $50;
                    
                    return typeEqual(_v476,flattenAct(l2,_v477,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "VoidType": {ESLVal $49 = _v12.termRef(0);
                    
                    {ESLVal t = _v11;
                    
                    {ESLVal l1 = $49;
                    
                    return $true;
                  }
                  }
                  }
                case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                    ESLVal $45 = _v12.termRef(1);
                    ESLVal $44 = _v12.termRef(2);
                    
                    switch($44.termName) {
                    case "UnionType": {ESLVal $48 = $44.termRef(0);
                      ESLVal $47 = $44.termRef(1);
                      
                      {ESLVal _v473 = _v11;
                      
                      {ESLVal l = $46;
                      
                      {ESLVal state = $45;
                      
                      {ESLVal ul = $48;
                      
                      {ESLVal terms = $47;
                      
                      return typeEqual(_v473,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v474 = _v11;
                      
                      {ESLVal _v475 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                    ESLVal $40 = _v12.termRef(1);
                    ESLVal $39 = _v12.termRef(2);
                    
                    switch($39.termName) {
                    case "UnionType": {ESLVal $43 = $39.termRef(0);
                      ESLVal $42 = $39.termRef(1);
                      
                      {ESLVal _v470 = _v11;
                      
                      {ESLVal l = $41;
                      
                      {ESLVal state = $40;
                      
                      {ESLVal ul = $43;
                      
                      {ESLVal terms = $42;
                      
                      return typeEqual(_v470,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _v471 = _v11;
                      
                      {ESLVal _v472 = _v12;
                      
                      return $false;
                    }
                    }
                  }
                  }
                case "TermType": {ESLVal $38 = _v12.termRef(0);
                    ESLVal $37 = _v12.termRef(1);
                    ESLVal $36 = _v12.termRef(2);
                    
                    {ESLVal _v469 = _v11;
                    
                    {ESLVal l2 = $38;
                    
                    {ESLVal n2 = $37;
                    
                    {ESLVal args2 = $36;
                    
                    return $false;
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                    
                    {ESLVal _v468 = _v11;
                    
                    {ESLVal f = $35;
                    
                    return typeEqual(_v468,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $34 = _v12.termRef(0);
                    ESLVal $33 = _v12.termRef(1);
                    ESLVal $32 = _v12.termRef(2);
                    
                    {ESLVal _v466 = _v11;
                    
                    {ESLVal l2 = $34;
                    
                    {ESLVal n2 = $33;
                    
                    {ESLVal _v467 = $32;
                    
                    return typeEqual(_v466,substType(new ESLVal("RecType",l2,n2,_v467),n2,_v467));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $31 = _v12.termRef(0);
                    ESLVal $30 = _v12.termRef(1);
                    ESLVal $29 = _v12.termRef(2);
                    
                    {ESLVal _v464 = _v11;
                    
                    {ESLVal l1 = $31;
                    
                    {ESLVal ns2 = $30;
                    
                    {ESLVal _v465 = $29;
                    
                    return typeEqual(_v464,_v465);
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v479 = _v11;
                    
                    {ESLVal _v480 = _v12;
                    
                    return $false;
                  }
                  }
                }
              }
            else if($144.isNil())
              switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v495 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v495,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v493 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v494 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v493,flattenAct(l2,_v494,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v490 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v490,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v491 = _v11;
                    
                    {ESLVal _v492 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v487 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v487,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v488 = _v11;
                    
                    {ESLVal _v489 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v486 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v485 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v485,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v483 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v484 = $32;
                  
                  return typeEqual(_v483,substType(new ESLVal("RecType",l2,n2,_v484),n2,_v484));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v481 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v482 = $29;
                  
                  return typeEqual(_v481,_v482);
                }
                }
                }
                }
                }
                default: {ESLVal _v496 = _v11;
                  
                  {ESLVal _v497 = _v12;
                  
                  return $false;
                }
                }
              }
            else switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v512 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v512,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v510 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v511 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v510,flattenAct(l2,_v511,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v507 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v507,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v508 = _v11;
                    
                    {ESLVal _v509 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v504 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v504,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v505 = _v11;
                    
                    {ESLVal _v506 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v503 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v502 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v502,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v500 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v501 = $32;
                  
                  return typeEqual(_v500,substType(new ESLVal("RecType",l2,n2,_v501),n2,_v501));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v498 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v499 = $29;
                  
                  return typeEqual(_v498,_v499);
                }
                }
                }
                }
                }
                default: {ESLVal _v513 = _v11;
                  
                  {ESLVal _v514 = _v12;
                  
                  return $false;
                }
                }
              }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v531 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v531,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v529 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v530 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v529,flattenAct(l2,_v530,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v526 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v526,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v527 = _v11;
                  
                  {ESLVal _v528 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v523 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v523,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v524 = _v11;
                  
                  {ESLVal _v525 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v522 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v521 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v521,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v519 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v520 = $32;
                
                return typeEqual(_v519,substType(new ESLVal("RecType",l2,n2,_v520),n2,_v520));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v517 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v518 = $29;
                
                return typeEqual(_v517,_v518);
              }
              }
              }
              }
              }
              default: {ESLVal _v532 = _v11;
                
                {ESLVal _v533 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "StrType": {ESLVal $139 = _v11.termRef(0);
            
            switch(_v12.termName) {
            case "StrType": {ESLVal $140 = _v12.termRef(0);
              
              {ESLVal l1 = $139;
              
              {ESLVal l2 = $140;
              
              return $true;
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v387 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v387,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v385 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v386 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v385,flattenAct(l2,_v386,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v382 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v382,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v383 = _v11;
                  
                  {ESLVal _v384 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v379 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v379,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v380 = _v11;
                  
                  {ESLVal _v381 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v378 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v377 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v377,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v375 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v376 = $32;
                
                return typeEqual(_v375,substType(new ESLVal("RecType",l2,n2,_v376),n2,_v376));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v373 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v374 = $29;
                
                return typeEqual(_v373,_v374);
              }
              }
              }
              }
              }
              default: {ESLVal _v388 = _v11;
                
                {ESLVal _v389 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "VoidType": {ESLVal $138 = _v11.termRef(0);
            
            {ESLVal l1 = $138;
            
            {ESLVal t = _v12;
            
            return $true;
          }
          }
          }
        case "FieldType": {ESLVal $134 = _v11.termRef(0);
            ESLVal $133 = _v11.termRef(1);
            ESLVal $132 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "FieldType": {ESLVal $137 = _v12.termRef(0);
              ESLVal $136 = _v12.termRef(1);
              ESLVal $135 = _v12.termRef(2);
              
              {ESLVal l1 = $134;
              
              {ESLVal n1 = $133;
              
              {ESLVal _v354 = $132;
              
              {ESLVal l2 = $137;
              
              {ESLVal n2 = $136;
              
              {ESLVal _v355 = $135;
              
              return n1.eql(n2).and(typeEqual(_v354,_v355));
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v370 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v370,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v368 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v369 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v368,flattenAct(l2,_v369,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v365 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v365,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v366 = _v11;
                  
                  {ESLVal _v367 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v362 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v362,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v363 = _v11;
                  
                  {ESLVal _v364 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v361 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v360 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v360,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v358 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v359 = $32;
                
                return typeEqual(_v358,substType(new ESLVal("RecType",l2,n2,_v359),n2,_v359));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v356 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v357 = $29;
                
                return typeEqual(_v356,_v357);
              }
              }
              }
              }
              }
              default: {ESLVal _v371 = _v11;
                
                {ESLVal _v372 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "ObservedType": {ESLVal $126 = _v11.termRef(0);
            ESLVal $125 = _v11.termRef(1);
            ESLVal $124 = _v11.termRef(2);
            
            switch($124.termName) {
            case "UnionType": {ESLVal $131 = $124.termRef(0);
              ESLVal $130 = $124.termRef(1);
              
              {ESLVal l = $126;
              
              {ESLVal state = $125;
              
              {ESLVal ul = $131;
              
              {ESLVal terms = $130;
              
              {ESLVal _v336 = _v12;
              
              return typeEqual(expandObservedType(l,state,new ESLVal("UnionType",ul,terms)),_v336);
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ObservedType": {ESLVal $129 = _v12.termRef(0);
                ESLVal $128 = _v12.termRef(1);
                ESLVal $127 = _v12.termRef(2);
                
                {ESLVal l1 = $126;
                
                {ESLVal s1 = $125;
                
                {ESLVal m1 = $124;
                
                {ESLVal l2 = $129;
                
                {ESLVal s2 = $128;
                
                {ESLVal m2 = $127;
                
                return typeEqual(s1,s2).and(typeEqual(m1,m2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v351 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v351,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v349 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v350 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v349,flattenAct(l2,_v350,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v346 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v346,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v347 = _v11;
                    
                    {ESLVal _v348 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v343 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v343,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v344 = _v11;
                    
                    {ESLVal _v345 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v342 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v341 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v341,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v339 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v340 = $32;
                  
                  return typeEqual(_v339,substType(new ESLVal("RecType",l2,n2,_v340),n2,_v340));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v337 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v338 = $29;
                  
                  return typeEqual(_v337,_v338);
                }
                }
                }
                }
                }
                default: {ESLVal _v352 = _v11;
                  
                  {ESLVal _v353 = _v12;
                  
                  return $false;
                }
                }
              }
            }
          }
          }
        case "ObserverType": {ESLVal $118 = _v11.termRef(0);
            ESLVal $117 = _v11.termRef(1);
            ESLVal $116 = _v11.termRef(2);
            
            switch($116.termName) {
            case "UnionType": {ESLVal $123 = $116.termRef(0);
              ESLVal $122 = $116.termRef(1);
              
              {ESLVal l = $118;
              
              {ESLVal state = $117;
              
              {ESLVal ul = $123;
              
              {ESLVal terms = $122;
              
              {ESLVal _v318 = _v12;
              
              return typeEqual(expandObserverType(l,state,new ESLVal("UnionType",ul,terms)),_v318);
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ObserverType": {ESLVal $121 = _v12.termRef(0);
                ESLVal $120 = _v12.termRef(1);
                ESLVal $119 = _v12.termRef(2);
                
                {ESLVal l1 = $118;
                
                {ESLVal state1 = $117;
                
                {ESLVal messages1 = $116;
                
                {ESLVal l2 = $121;
                
                {ESLVal state2 = $120;
                
                {ESLVal messages2 = $119;
                
                return typeEqual(state1,state2).and(typeEqual(messages1,messages2));
              }
              }
              }
              }
              }
              }
              }
              default: switch(_v12.termName) {
                case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                  ESLVal $55 = _v12.termRef(1);
                  ESLVal $54 = _v12.termRef(2);
                  
                  {ESLVal _v333 = _v11;
                  
                  {ESLVal l = $56;
                  
                  {ESLVal op = $55;
                  
                  {ESLVal args = $54;
                  
                  return typeEqual(_v333,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                  ESLVal $52 = _v12.termRef(1);
                  ESLVal $51 = _v12.termRef(2);
                  ESLVal $50 = _v12.termRef(3);
                  
                  {ESLVal _v331 = _v11;
                  
                  {ESLVal l2 = $53;
                  
                  {ESLVal _v332 = $52;
                  
                  {ESLVal ds2 = $51;
                  
                  {ESLVal ms2 = $50;
                  
                  return typeEqual(_v331,flattenAct(l2,_v332,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "VoidType": {ESLVal $49 = _v12.termRef(0);
                  
                  {ESLVal t = _v11;
                  
                  {ESLVal l1 = $49;
                  
                  return $true;
                }
                }
                }
              case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                  ESLVal $45 = _v12.termRef(1);
                  ESLVal $44 = _v12.termRef(2);
                  
                  switch($44.termName) {
                  case "UnionType": {ESLVal $48 = $44.termRef(0);
                    ESLVal $47 = $44.termRef(1);
                    
                    {ESLVal _v328 = _v11;
                    
                    {ESLVal l = $46;
                    
                    {ESLVal state = $45;
                    
                    {ESLVal ul = $48;
                    
                    {ESLVal terms = $47;
                    
                    return typeEqual(_v328,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v329 = _v11;
                    
                    {ESLVal _v330 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                  ESLVal $40 = _v12.termRef(1);
                  ESLVal $39 = _v12.termRef(2);
                  
                  switch($39.termName) {
                  case "UnionType": {ESLVal $43 = $39.termRef(0);
                    ESLVal $42 = $39.termRef(1);
                    
                    {ESLVal _v325 = _v11;
                    
                    {ESLVal l = $41;
                    
                    {ESLVal state = $40;
                    
                    {ESLVal ul = $43;
                    
                    {ESLVal terms = $42;
                    
                    return typeEqual(_v325,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v326 = _v11;
                    
                    {ESLVal _v327 = _v12;
                    
                    return $false;
                  }
                  }
                }
                }
              case "TermType": {ESLVal $38 = _v12.termRef(0);
                  ESLVal $37 = _v12.termRef(1);
                  ESLVal $36 = _v12.termRef(2);
                  
                  {ESLVal _v324 = _v11;
                  
                  {ESLVal l2 = $38;
                  
                  {ESLVal n2 = $37;
                  
                  {ESLVal args2 = $36;
                  
                  return $false;
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                  
                  {ESLVal _v323 = _v11;
                  
                  {ESLVal f = $35;
                  
                  return typeEqual(_v323,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $34 = _v12.termRef(0);
                  ESLVal $33 = _v12.termRef(1);
                  ESLVal $32 = _v12.termRef(2);
                  
                  {ESLVal _v321 = _v11;
                  
                  {ESLVal l2 = $34;
                  
                  {ESLVal n2 = $33;
                  
                  {ESLVal _v322 = $32;
                  
                  return typeEqual(_v321,substType(new ESLVal("RecType",l2,n2,_v322),n2,_v322));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $31 = _v12.termRef(0);
                  ESLVal $30 = _v12.termRef(1);
                  ESLVal $29 = _v12.termRef(2);
                  
                  {ESLVal _v319 = _v11;
                  
                  {ESLVal l1 = $31;
                  
                  {ESLVal ns2 = $30;
                  
                  {ESLVal _v320 = $29;
                  
                  return typeEqual(_v319,_v320);
                }
                }
                }
                }
                }
                default: {ESLVal _v334 = _v11;
                  
                  {ESLVal _v335 = _v12;
                  
                  return $false;
                }
                }
              }
            }
          }
          }
        case "TableType": {ESLVal $112 = _v11.termRef(0);
            ESLVal $111 = _v11.termRef(1);
            ESLVal $110 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "TableType": {ESLVal $115 = _v12.termRef(0);
              ESLVal $114 = _v12.termRef(1);
              ESLVal $113 = _v12.termRef(2);
              
              {ESLVal l1 = $112;
              
              {ESLVal k1 = $111;
              
              {ESLVal v1 = $110;
              
              {ESLVal l2 = $115;
              
              {ESLVal k2 = $114;
              
              {ESLVal v2 = $113;
              
              return typeEqual(k1,k2).and(typeEqual(v1,v2));
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v315 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v315,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v313 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v314 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v313,flattenAct(l2,_v314,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v310 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v310,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v311 = _v11;
                  
                  {ESLVal _v312 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v307 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v307,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v308 = _v11;
                  
                  {ESLVal _v309 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v306 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v305 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v305,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v303 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v304 = $32;
                
                return typeEqual(_v303,substType(new ESLVal("RecType",l2,n2,_v304),n2,_v304));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v301 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v302 = $29;
                
                return typeEqual(_v301,_v302);
              }
              }
              }
              }
              }
              default: {ESLVal _v316 = _v11;
                
                {ESLVal _v317 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "TermType": {ESLVal $106 = _v11.termRef(0);
            ESLVal $105 = _v11.termRef(1);
            ESLVal $104 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "TermType": {ESLVal $109 = _v12.termRef(0);
              ESLVal $108 = _v12.termRef(1);
              ESLVal $107 = _v12.termRef(2);
              
              {ESLVal l1 = $106;
              
              {ESLVal n1 = $105;
              
              {ESLVal args1 = $104;
              
              {ESLVal l2 = $109;
              
              {ESLVal n2 = $108;
              
              {ESLVal args2 = $107;
              
              if(n1.eql(n2).boolVal)
              return typesEqual(args1,args2);
              else
                return $false;
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l1 = $106;
              
              {ESLVal n1 = $105;
              
              {ESLVal args1 = $104;
              
              {ESLVal _v300 = _v12;
              
              return $false;
            }
            }
            }
            }
          }
          }
        case "FunType": {ESLVal $100 = _v11.termRef(0);
            ESLVal $99 = _v11.termRef(1);
            ESLVal $98 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "FunType": {ESLVal $103 = _v12.termRef(0);
              ESLVal $102 = _v12.termRef(1);
              ESLVal $101 = _v12.termRef(2);
              
              {ESLVal l1 = $100;
              
              {ESLVal d1 = $99;
              
              {ESLVal r1 = $98;
              
              {ESLVal l2 = $103;
              
              {ESLVal d2 = $102;
              
              {ESLVal r2 = $101;
              
              return typeEqual(r1,r2).and(typesEqual(d1,d2));
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v297 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v297,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v295 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v296 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v295,flattenAct(l2,_v296,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v292 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v292,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v293 = _v11;
                  
                  {ESLVal _v294 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v289 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v289,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v290 = _v11;
                  
                  {ESLVal _v291 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v288 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v287 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v287,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v285 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v286 = $32;
                
                return typeEqual(_v285,substType(new ESLVal("RecType",l2,n2,_v286),n2,_v286));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v283 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v284 = $29;
                
                return typeEqual(_v283,_v284);
              }
              }
              }
              }
              }
              default: {ESLVal _v298 = _v11;
                
                {ESLVal _v299 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "TypeClosure": {ESLVal $97 = _v11.termRef(0);
            
            {ESLVal f = $97;
            
            {ESLVal _v282 = _v12;
            
            return typeEqual(f.apply(),_v282);
          }
          }
          }
        case "RecordType": {ESLVal $94 = _v11.termRef(0);
            ESLVal $93 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "RecordType": {ESLVal $96 = _v12.termRef(0);
              ESLVal $95 = _v12.termRef(1);
              
              {ESLVal l1 = $94;
              
              {ESLVal fs1 = $93;
              
              {ESLVal l2 = $96;
              
              {ESLVal fs2 = $95;
              
              return recordTypeEqual(fs1,fs2);
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v279 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v279,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v277 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v278 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v277,flattenAct(l2,_v278,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v274 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v274,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v275 = _v11;
                  
                  {ESLVal _v276 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v271 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v271,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v272 = _v11;
                  
                  {ESLVal _v273 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v270 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v269 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v269,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v267 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v268 = $32;
                
                return typeEqual(_v267,substType(new ESLVal("RecType",l2,n2,_v268),n2,_v268));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v265 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v266 = $29;
                
                return typeEqual(_v265,_v266);
              }
              }
              }
              }
              }
              default: {ESLVal _v280 = _v11;
                
                {ESLVal _v281 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "RecType": {ESLVal $89 = _v11.termRef(0);
            ESLVal $88 = _v11.termRef(1);
            ESLVal $87 = _v11.termRef(2);
            
            switch(_v12.termName) {
            case "RecType": {ESLVal $92 = _v12.termRef(0);
              ESLVal $91 = _v12.termRef(1);
              ESLVal $90 = _v12.termRef(2);
              
              {ESLVal l1 = $89;
              
              {ESLVal n1 = $88;
              
              {ESLVal _v257 = $87;
              
              {ESLVal l2 = $92;
              
              {ESLVal n2 = $91;
              
              {ESLVal _v258 = $90;
              
              if(n1.eql(n2).boolVal)
              return typeEqual(_v257,_v258);
              else
                {ESLVal _v259 = $89;
                  
                  {ESLVal _v260 = $88;
                  
                  {ESLVal _v261 = $87;
                  
                  {ESLVal _v262 = _v12;
                  
                  return typeEqual(substType(new ESLVal("RecType",_v259,_v260,_v261),_v260,_v261),_v262);
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
            default: {ESLVal l1 = $89;
              
              {ESLVal n1 = $88;
              
              {ESLVal _v263 = $87;
              
              {ESLVal _v264 = _v12;
              
              return typeEqual(substType(new ESLVal("RecType",l1,n1,_v263),n1,_v263),_v264);
            }
            }
            }
            }
          }
          }
        case "UnionType": {ESLVal $84 = _v11.termRef(0);
            ESLVal $83 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "UnionType": {ESLVal $86 = _v12.termRef(0);
              ESLVal $85 = _v12.termRef(1);
              
              {ESLVal l1 = $84;
              
              {ESLVal terms1 = $83;
              
              {ESLVal l2 = $86;
              
              {ESLVal terms2 = $85;
              
              return typeSetEqual(terms1,terms2);
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v254 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v254,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v252 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v253 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v252,flattenAct(l2,_v253,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v249 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v249,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v250 = _v11;
                  
                  {ESLVal _v251 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v246 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v246,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v247 = _v11;
                  
                  {ESLVal _v248 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v245 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v244 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v244,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v242 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v243 = $32;
                
                return typeEqual(_v242,substType(new ESLVal("RecType",l2,n2,_v243),n2,_v243));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v240 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v241 = $29;
                
                return typeEqual(_v240,_v241);
              }
              }
              }
              }
              }
              default: {ESLVal _v255 = _v11;
                
                {ESLVal _v256 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "VarType": {ESLVal $80 = _v11.termRef(0);
            ESLVal $79 = _v11.termRef(1);
            
            switch(_v12.termName) {
            case "VarType": {ESLVal $82 = _v12.termRef(0);
              ESLVal $81 = _v12.termRef(1);
              
              {ESLVal l1 = $80;
              
              {ESLVal n1 = $79;
              
              {ESLVal l2 = $82;
              
              {ESLVal n2 = $81;
              
              return n1.eql(n2);
            }
            }
            }
            }
            }
            default: switch(_v12.termName) {
              case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
                ESLVal $55 = _v12.termRef(1);
                ESLVal $54 = _v12.termRef(2);
                
                {ESLVal _v237 = _v11;
                
                {ESLVal l = $56;
                
                {ESLVal op = $55;
                
                {ESLVal args = $54;
                
                return typeEqual(_v237,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
                ESLVal $52 = _v12.termRef(1);
                ESLVal $51 = _v12.termRef(2);
                ESLVal $50 = _v12.termRef(3);
                
                {ESLVal _v235 = _v11;
                
                {ESLVal l2 = $53;
                
                {ESLVal _v236 = $52;
                
                {ESLVal ds2 = $51;
                
                {ESLVal ms2 = $50;
                
                return typeEqual(_v235,flattenAct(l2,_v236,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "VoidType": {ESLVal $49 = _v12.termRef(0);
                
                {ESLVal t = _v11;
                
                {ESLVal l1 = $49;
                
                return $true;
              }
              }
              }
            case "ObservedType": {ESLVal $46 = _v12.termRef(0);
                ESLVal $45 = _v12.termRef(1);
                ESLVal $44 = _v12.termRef(2);
                
                switch($44.termName) {
                case "UnionType": {ESLVal $48 = $44.termRef(0);
                  ESLVal $47 = $44.termRef(1);
                  
                  {ESLVal _v232 = _v11;
                  
                  {ESLVal l = $46;
                  
                  {ESLVal state = $45;
                  
                  {ESLVal ul = $48;
                  
                  {ESLVal terms = $47;
                  
                  return typeEqual(_v232,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v233 = _v11;
                  
                  {ESLVal _v234 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "ObserverType": {ESLVal $41 = _v12.termRef(0);
                ESLVal $40 = _v12.termRef(1);
                ESLVal $39 = _v12.termRef(2);
                
                switch($39.termName) {
                case "UnionType": {ESLVal $43 = $39.termRef(0);
                  ESLVal $42 = $39.termRef(1);
                  
                  {ESLVal _v229 = _v11;
                  
                  {ESLVal l = $41;
                  
                  {ESLVal state = $40;
                  
                  {ESLVal ul = $43;
                  
                  {ESLVal terms = $42;
                  
                  return typeEqual(_v229,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v230 = _v11;
                  
                  {ESLVal _v231 = _v12;
                  
                  return $false;
                }
                }
              }
              }
            case "TermType": {ESLVal $38 = _v12.termRef(0);
                ESLVal $37 = _v12.termRef(1);
                ESLVal $36 = _v12.termRef(2);
                
                {ESLVal _v228 = _v11;
                
                {ESLVal l2 = $38;
                
                {ESLVal n2 = $37;
                
                {ESLVal args2 = $36;
                
                return $false;
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
                
                {ESLVal _v227 = _v11;
                
                {ESLVal f = $35;
                
                return typeEqual(_v227,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $34 = _v12.termRef(0);
                ESLVal $33 = _v12.termRef(1);
                ESLVal $32 = _v12.termRef(2);
                
                {ESLVal _v225 = _v11;
                
                {ESLVal l2 = $34;
                
                {ESLVal n2 = $33;
                
                {ESLVal _v226 = $32;
                
                return typeEqual(_v225,substType(new ESLVal("RecType",l2,n2,_v226),n2,_v226));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $31 = _v12.termRef(0);
                ESLVal $30 = _v12.termRef(1);
                ESLVal $29 = _v12.termRef(2);
                
                {ESLVal _v223 = _v11;
                
                {ESLVal l1 = $31;
                
                {ESLVal ns2 = $30;
                
                {ESLVal _v224 = $29;
                
                return typeEqual(_v223,_v224);
              }
              }
              }
              }
              }
              default: {ESLVal _v238 = _v11;
                
                {ESLVal _v239 = _v12;
                
                return $false;
              }
              }
            }
          }
          }
        case "ForallType": {ESLVal $59 = _v11.termRef(0);
            ESLVal $58 = _v11.termRef(1);
            ESLVal $57 = _v11.termRef(2);
            
            if($58.isCons())
            {ESLVal $63 = $58.head();
              ESLVal $64 = $58.tail();
              
              if($64.isCons())
              {ESLVal $65 = $64.head();
                ESLVal $66 = $64.tail();
                
                switch(_v12.termName) {
                case "ForallType": {ESLVal $62 = _v12.termRef(0);
                  ESLVal $61 = _v12.termRef(1);
                  ESLVal $60 = _v12.termRef(2);
                  
                  {ESLVal l1 = $59;
                  
                  {ESLVal ns1 = $58;
                  
                  {ESLVal _v171 = $57;
                  
                  {ESLVal l2 = $62;
                  
                  {ESLVal ns2 = $61;
                  
                  {ESLVal _v172 = $60;
                  
                  return ns1.eql(ns2).and(typeEqual(_v171,_v172));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $59;
                  
                  {ESLVal ns1 = $58;
                  
                  {ESLVal _v173 = $57;
                  
                  {ESLVal _v174 = _v12;
                  
                  return typeEqual(_v173,_v174);
                }
                }
                }
                }
              }
              }
            else if($64.isNil())
              switch($57.termName) {
                case "ListType": {ESLVal $74 = $57.termRef(0);
                  ESLVal $73 = $57.termRef(1);
                  
                  switch($73.termName) {
                  case "VarType": {ESLVal $76 = $73.termRef(0);
                    ESLVal $75 = $73.termRef(1);
                    
                    switch(_v12.termName) {
                    case "ListType": {ESLVal $78 = _v12.termRef(0);
                      ESLVal $77 = _v12.termRef(1);
                      
                      {ESLVal l2 = $59;
                      
                      {ESLVal v1 = $63;
                      
                      {ESLVal l3 = $74;
                      
                      {ESLVal l4 = $76;
                      
                      {ESLVal v2 = $75;
                      
                      {ESLVal l1 = $78;
                      
                      {ESLVal _v191 = $77;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v12.termName) {
                          case "ForallType": {ESLVal $62 = _v12.termRef(0);
                            ESLVal $61 = _v12.termRef(1);
                            ESLVal $60 = _v12.termRef(2);
                            
                            {ESLVal _v192 = $59;
                            
                            {ESLVal ns1 = $58;
                            
                            {ESLVal _v193 = $57;
                            
                            {ESLVal _v194 = $62;
                            
                            {ESLVal ns2 = $61;
                            
                            {ESLVal _v195 = $60;
                            
                            return ns1.eql(ns2).and(typeEqual(_v193,_v195));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v196 = $59;
                            
                            {ESLVal ns1 = $58;
                            
                            {ESLVal _v197 = $57;
                            
                            {ESLVal _v198 = _v12;
                            
                            return typeEqual(_v197,_v198);
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
                    default: switch(_v12.termName) {
                      case "ForallType": {ESLVal $62 = _v12.termRef(0);
                        ESLVal $61 = _v12.termRef(1);
                        ESLVal $60 = _v12.termRef(2);
                        
                        {ESLVal l1 = $59;
                        
                        {ESLVal ns1 = $58;
                        
                        {ESLVal _v199 = $57;
                        
                        {ESLVal l2 = $62;
                        
                        {ESLVal ns2 = $61;
                        
                        {ESLVal _v200 = $60;
                        
                        return ns1.eql(ns2).and(typeEqual(_v199,_v200));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $59;
                        
                        {ESLVal ns1 = $58;
                        
                        {ESLVal _v201 = $57;
                        
                        {ESLVal _v202 = _v12;
                        
                        return typeEqual(_v201,_v202);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v12.termName) {
                    case "ForallType": {ESLVal $62 = _v12.termRef(0);
                      ESLVal $61 = _v12.termRef(1);
                      ESLVal $60 = _v12.termRef(2);
                      
                      {ESLVal l1 = $59;
                      
                      {ESLVal ns1 = $58;
                      
                      {ESLVal _v203 = $57;
                      
                      {ESLVal l2 = $62;
                      
                      {ESLVal ns2 = $61;
                      
                      {ESLVal _v204 = $60;
                      
                      return ns1.eql(ns2).and(typeEqual(_v203,_v204));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $59;
                      
                      {ESLVal ns1 = $58;
                      
                      {ESLVal _v205 = $57;
                      
                      {ESLVal _v206 = _v12;
                      
                      return typeEqual(_v205,_v206);
                    }
                    }
                    }
                    }
                  }
                }
                }
              case "SetType": {ESLVal $68 = $57.termRef(0);
                  ESLVal $67 = $57.termRef(1);
                  
                  switch($67.termName) {
                  case "VarType": {ESLVal $70 = $67.termRef(0);
                    ESLVal $69 = $67.termRef(1);
                    
                    switch(_v12.termName) {
                    case "SetType": {ESLVal $72 = _v12.termRef(0);
                      ESLVal $71 = _v12.termRef(1);
                      
                      {ESLVal l2 = $59;
                      
                      {ESLVal v1 = $63;
                      
                      {ESLVal l3 = $68;
                      
                      {ESLVal l4 = $70;
                      
                      {ESLVal v2 = $69;
                      
                      {ESLVal l1 = $72;
                      
                      {ESLVal _v175 = $71;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v12.termName) {
                          case "ForallType": {ESLVal $62 = _v12.termRef(0);
                            ESLVal $61 = _v12.termRef(1);
                            ESLVal $60 = _v12.termRef(2);
                            
                            {ESLVal _v176 = $59;
                            
                            {ESLVal ns1 = $58;
                            
                            {ESLVal _v177 = $57;
                            
                            {ESLVal _v178 = $62;
                            
                            {ESLVal ns2 = $61;
                            
                            {ESLVal _v179 = $60;
                            
                            return ns1.eql(ns2).and(typeEqual(_v177,_v179));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v180 = $59;
                            
                            {ESLVal ns1 = $58;
                            
                            {ESLVal _v181 = $57;
                            
                            {ESLVal _v182 = _v12;
                            
                            return typeEqual(_v181,_v182);
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
                    default: switch(_v12.termName) {
                      case "ForallType": {ESLVal $62 = _v12.termRef(0);
                        ESLVal $61 = _v12.termRef(1);
                        ESLVal $60 = _v12.termRef(2);
                        
                        {ESLVal l1 = $59;
                        
                        {ESLVal ns1 = $58;
                        
                        {ESLVal _v183 = $57;
                        
                        {ESLVal l2 = $62;
                        
                        {ESLVal ns2 = $61;
                        
                        {ESLVal _v184 = $60;
                        
                        return ns1.eql(ns2).and(typeEqual(_v183,_v184));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $59;
                        
                        {ESLVal ns1 = $58;
                        
                        {ESLVal _v185 = $57;
                        
                        {ESLVal _v186 = _v12;
                        
                        return typeEqual(_v185,_v186);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v12.termName) {
                    case "ForallType": {ESLVal $62 = _v12.termRef(0);
                      ESLVal $61 = _v12.termRef(1);
                      ESLVal $60 = _v12.termRef(2);
                      
                      {ESLVal l1 = $59;
                      
                      {ESLVal ns1 = $58;
                      
                      {ESLVal _v187 = $57;
                      
                      {ESLVal l2 = $62;
                      
                      {ESLVal ns2 = $61;
                      
                      {ESLVal _v188 = $60;
                      
                      return ns1.eql(ns2).and(typeEqual(_v187,_v188));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $59;
                      
                      {ESLVal ns1 = $58;
                      
                      {ESLVal _v189 = $57;
                      
                      {ESLVal _v190 = _v12;
                      
                      return typeEqual(_v189,_v190);
                    }
                    }
                    }
                    }
                  }
                }
                }
                default: switch(_v12.termName) {
                  case "ForallType": {ESLVal $62 = _v12.termRef(0);
                    ESLVal $61 = _v12.termRef(1);
                    ESLVal $60 = _v12.termRef(2);
                    
                    {ESLVal l1 = $59;
                    
                    {ESLVal ns1 = $58;
                    
                    {ESLVal _v207 = $57;
                    
                    {ESLVal l2 = $62;
                    
                    {ESLVal ns2 = $61;
                    
                    {ESLVal _v208 = $60;
                    
                    return ns1.eql(ns2).and(typeEqual(_v207,_v208));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $59;
                    
                    {ESLVal ns1 = $58;
                    
                    {ESLVal _v209 = $57;
                    
                    {ESLVal _v210 = _v12;
                    
                    return typeEqual(_v209,_v210);
                  }
                  }
                  }
                  }
                }
              }
            else switch(_v12.termName) {
                case "ForallType": {ESLVal $62 = _v12.termRef(0);
                  ESLVal $61 = _v12.termRef(1);
                  ESLVal $60 = _v12.termRef(2);
                  
                  {ESLVal l1 = $59;
                  
                  {ESLVal ns1 = $58;
                  
                  {ESLVal _v211 = $57;
                  
                  {ESLVal l2 = $62;
                  
                  {ESLVal ns2 = $61;
                  
                  {ESLVal _v212 = $60;
                  
                  return ns1.eql(ns2).and(typeEqual(_v211,_v212));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $59;
                  
                  {ESLVal ns1 = $58;
                  
                  {ESLVal _v213 = $57;
                  
                  {ESLVal _v214 = _v12;
                  
                  return typeEqual(_v213,_v214);
                }
                }
                }
                }
              }
            }
          else if($58.isNil())
            switch(_v12.termName) {
              case "ForallType": {ESLVal $62 = _v12.termRef(0);
                ESLVal $61 = _v12.termRef(1);
                ESLVal $60 = _v12.termRef(2);
                
                {ESLVal l1 = $59;
                
                {ESLVal ns1 = $58;
                
                {ESLVal _v215 = $57;
                
                {ESLVal l2 = $62;
                
                {ESLVal ns2 = $61;
                
                {ESLVal _v216 = $60;
                
                return ns1.eql(ns2).and(typeEqual(_v215,_v216));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $59;
                
                {ESLVal ns1 = $58;
                
                {ESLVal _v217 = $57;
                
                {ESLVal _v218 = _v12;
                
                return typeEqual(_v217,_v218);
              }
              }
              }
              }
            }
          else switch(_v12.termName) {
              case "ForallType": {ESLVal $62 = _v12.termRef(0);
                ESLVal $61 = _v12.termRef(1);
                ESLVal $60 = _v12.termRef(2);
                
                {ESLVal l1 = $59;
                
                {ESLVal ns1 = $58;
                
                {ESLVal _v219 = $57;
                
                {ESLVal l2 = $62;
                
                {ESLVal ns2 = $61;
                
                {ESLVal _v220 = $60;
                
                return ns1.eql(ns2).and(typeEqual(_v219,_v220));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $59;
                
                {ESLVal ns1 = $58;
                
                {ESLVal _v221 = $57;
                
                {ESLVal _v222 = _v12;
                
                return typeEqual(_v221,_v222);
              }
              }
              }
              }
            }
          }
          default: switch(_v12.termName) {
            case "ApplyTypeFun": {ESLVal $56 = _v12.termRef(0);
              ESLVal $55 = _v12.termRef(1);
              ESLVal $54 = _v12.termRef(2);
              
              {ESLVal _v801 = _v11;
              
              {ESLVal l = $56;
              
              {ESLVal op = $55;
              
              {ESLVal args = $54;
              
              return typeEqual(_v801,applyTypeFun(l,forceType(op),args));
            }
            }
            }
            }
            }
          case "ExtendedAct": {ESLVal $53 = _v12.termRef(0);
              ESLVal $52 = _v12.termRef(1);
              ESLVal $51 = _v12.termRef(2);
              ESLVal $50 = _v12.termRef(3);
              
              {ESLVal _v799 = _v11;
              
              {ESLVal l2 = $53;
              
              {ESLVal _v800 = $52;
              
              {ESLVal ds2 = $51;
              
              {ESLVal ms2 = $50;
              
              return typeEqual(_v799,flattenAct(l2,_v800,ds2,ms2));
            }
            }
            }
            }
            }
            }
          case "VoidType": {ESLVal $49 = _v12.termRef(0);
              
              {ESLVal t = _v11;
              
              {ESLVal l1 = $49;
              
              return $true;
            }
            }
            }
          case "ObservedType": {ESLVal $46 = _v12.termRef(0);
              ESLVal $45 = _v12.termRef(1);
              ESLVal $44 = _v12.termRef(2);
              
              switch($44.termName) {
              case "UnionType": {ESLVal $48 = $44.termRef(0);
                ESLVal $47 = $44.termRef(1);
                
                {ESLVal _v796 = _v11;
                
                {ESLVal l = $46;
                
                {ESLVal state = $45;
                
                {ESLVal ul = $48;
                
                {ESLVal terms = $47;
                
                return typeEqual(_v796,expandObservedType(l,state,new ESLVal("UnionType",ul,terms)));
              }
              }
              }
              }
              }
              }
              default: {ESLVal _v797 = _v11;
                
                {ESLVal _v798 = _v12;
                
                return $false;
              }
              }
            }
            }
          case "ObserverType": {ESLVal $41 = _v12.termRef(0);
              ESLVal $40 = _v12.termRef(1);
              ESLVal $39 = _v12.termRef(2);
              
              switch($39.termName) {
              case "UnionType": {ESLVal $43 = $39.termRef(0);
                ESLVal $42 = $39.termRef(1);
                
                {ESLVal _v793 = _v11;
                
                {ESLVal l = $41;
                
                {ESLVal state = $40;
                
                {ESLVal ul = $43;
                
                {ESLVal terms = $42;
                
                return typeEqual(_v793,expandObserverType(l,state,new ESLVal("UnionType",ul,terms)));
              }
              }
              }
              }
              }
              }
              default: {ESLVal _v794 = _v11;
                
                {ESLVal _v795 = _v12;
                
                return $false;
              }
              }
            }
            }
          case "TermType": {ESLVal $38 = _v12.termRef(0);
              ESLVal $37 = _v12.termRef(1);
              ESLVal $36 = _v12.termRef(2);
              
              {ESLVal _v792 = _v11;
              
              {ESLVal l2 = $38;
              
              {ESLVal n2 = $37;
              
              {ESLVal args2 = $36;
              
              return $false;
            }
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $35 = _v12.termRef(0);
              
              {ESLVal _v791 = _v11;
              
              {ESLVal f = $35;
              
              return typeEqual(_v791,f.apply());
            }
            }
            }
          case "RecType": {ESLVal $34 = _v12.termRef(0);
              ESLVal $33 = _v12.termRef(1);
              ESLVal $32 = _v12.termRef(2);
              
              {ESLVal _v789 = _v11;
              
              {ESLVal l2 = $34;
              
              {ESLVal n2 = $33;
              
              {ESLVal _v790 = $32;
              
              return typeEqual(_v789,substType(new ESLVal("RecType",l2,n2,_v790),n2,_v790));
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $31 = _v12.termRef(0);
              ESLVal $30 = _v12.termRef(1);
              ESLVal $29 = _v12.termRef(2);
              
              {ESLVal _v787 = _v11;
              
              {ESLVal l1 = $31;
              
              {ESLVal ns2 = $30;
              
              {ESLVal _v788 = $29;
              
              return typeEqual(_v787,_v788);
            }
            }
            }
            }
            }
            default: {ESLVal _v802 = _v11;
              
              {ESLVal _v803 = _v12;
              
              return $false;
            }
            }
          }
        }
        }
  }
  public static ESLVal typeEqual1 = new ESLVal(new Function(new ESLVal("typeEqual1"),null) { public ESLVal apply(ESLVal... args) { return typeEqual1(args[0],args[1]); }});
  public static ESLVal subType(ESLVal sub,ESLVal parent) {
    
    if(sub.eql(parent).boolVal)
      return $true;
      else
        {ESLVal _v13 = sub;
          ESLVal _v14 = parent;
          
          switch(_v13.termName) {
          case "ActType": {ESLVal $319 = _v13.termRef(0);
            ESLVal $318 = _v13.termRef(1);
            ESLVal $317 = _v13.termRef(2);
            
            switch(_v14.termName) {
            case "ActType": {ESLVal $322 = _v14.termRef(0);
              ESLVal $321 = _v14.termRef(1);
              ESLVal $320 = _v14.termRef(2);
              
              {ESLVal l1 = $319;
              
              {ESLVal exports1 = $318;
              
              {ESLVal handlers1 = $317;
              
              {ESLVal l2 = $322;
              
              {ESLVal exports2 = $321;
              
              {ESLVal handlers2 = $320;
              
              return actSubType(exports1,exports2,handlers1,handlers2);
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "ApplyTypeFun": {ESLVal $316 = _v13.termRef(0);
            ESLVal $315 = _v13.termRef(1);
            ESLVal $314 = _v13.termRef(2);
            
            {ESLVal l = $316;
            
            {ESLVal op = $315;
            
            {ESLVal args = $314;
            
            {ESLVal t2 = _v14;
            
            return subType(applyTypeFun(l,forceType(op),args),t2);
          }
          }
          }
          }
          }
        case "ExtendedAct": {ESLVal $313 = _v13.termRef(0);
            ESLVal $312 = _v13.termRef(1);
            ESLVal $311 = _v13.termRef(2);
            ESLVal $310 = _v13.termRef(3);
            
            {ESLVal l1 = $313;
            
            {ESLVal t1 = $312;
            
            {ESLVal ds1 = $311;
            
            {ESLVal ms1 = $310;
            
            {ESLVal t2 = _v14;
            
            return subType(flattenAct(l1,t1,ds1,ms1),t2);
          }
          }
          }
          }
          }
          }
        case "ListType": {ESLVal $296 = _v13.termRef(0);
            ESLVal $295 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "ListType": {ESLVal $309 = _v14.termRef(0);
              ESLVal $308 = _v14.termRef(1);
              
              {ESLVal l1 = $296;
              
              {ESLVal t1 = $295;
              
              {ESLVal l2 = $309;
              
              {ESLVal t2 = $308;
              
              return subType(t1,t2);
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $299 = _v14.termRef(0);
              ESLVal $298 = _v14.termRef(1);
              ESLVal $297 = _v14.termRef(2);
              
              if($298.isCons())
              {ESLVal $300 = $298.head();
                ESLVal $301 = $298.tail();
                
                if($301.isCons())
                {ESLVal $302 = $301.head();
                  ESLVal $303 = $301.tail();
                  
                  switch(_v14.termName) {
                  case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                    ESLVal $221 = _v14.termRef(1);
                    ESLVal $220 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $222;
                    
                    {ESLVal op = $221;
                    
                    {ESLVal args = $220;
                    
                    return subType(t1,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                    ESLVal $218 = _v14.termRef(1);
                    ESLVal $217 = _v14.termRef(2);
                    ESLVal $216 = _v14.termRef(3);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $219;
                    
                    {ESLVal t2 = $218;
                    
                    {ESLVal ds2 = $217;
                    
                    {ESLVal ms2 = $216;
                    
                    return subType(t1,flattenAct(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal f = $215;
                    
                    return subType(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $214 = _v14.termRef(0);
                    ESLVal $213 = _v14.termRef(1);
                    ESLVal $212 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $214;
                    
                    {ESLVal n2 = $213;
                    
                    {ESLVal t2 = $212;
                    
                    return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $211 = _v14.termRef(0);
                    ESLVal $210 = _v14.termRef(1);
                    ESLVal $209 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l1 = $211;
                    
                    {ESLVal ns2 = $210;
                    
                    {ESLVal t2 = $209;
                    
                    return subType(t1,t2);
                  }
                  }
                  }
                  }
                  }
                case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                    ESLVal $206 = _v14.termRef(1);
                    ESLVal $205 = _v14.termRef(2);
                    
                    switch($205.termName) {
                    case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal f = $208;
                      
                      return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal messages = $205;
                      
                      return subType(t1,expandObservedType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                    ESLVal $202 = _v14.termRef(1);
                    ESLVal $201 = _v14.termRef(2);
                    
                    switch($201.termName) {
                    case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal f = $204;
                      
                      return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal messages = $201;
                      
                      return subType(t1,expandObserverType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal t2 = _v14;
                    
                    return typeEqual(t1,t2);
                  }
                  }
                }
                }
              else if($301.isNil())
                switch($297.termName) {
                  case "ListType": {ESLVal $305 = $297.termRef(0);
                    ESLVal $304 = $297.termRef(1);
                    
                    switch($304.termName) {
                    case "VarType": {ESLVal $307 = $304.termRef(0);
                      ESLVal $306 = $304.termRef(1);
                      
                      {ESLVal l1 = $296;
                      
                      {ESLVal t1 = $295;
                      
                      {ESLVal l2 = $299;
                      
                      {ESLVal v1 = $300;
                      
                      {ESLVal l3 = $305;
                      
                      {ESLVal l4 = $307;
                      
                      {ESLVal v2 = $306;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v14.termName) {
                          case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                            ESLVal $221 = _v14.termRef(1);
                            ESLVal $220 = _v14.termRef(2);
                            
                            {ESLVal _v169 = _v13;
                            
                            {ESLVal l = $222;
                            
                            {ESLVal op = $221;
                            
                            {ESLVal args = $220;
                            
                            return subType(_v169,applyTypeFun(l,forceType(op),args));
                          }
                          }
                          }
                          }
                          }
                        case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                            ESLVal $218 = _v14.termRef(1);
                            ESLVal $217 = _v14.termRef(2);
                            ESLVal $216 = _v14.termRef(3);
                            
                            {ESLVal _v167 = _v13;
                            
                            {ESLVal _v168 = $219;
                            
                            {ESLVal t2 = $218;
                            
                            {ESLVal ds2 = $217;
                            
                            {ESLVal ms2 = $216;
                            
                            return subType(_v167,flattenAct(_v168,t2,ds2,ms2));
                          }
                          }
                          }
                          }
                          }
                          }
                        case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                            
                            {ESLVal _v166 = _v13;
                            
                            {ESLVal f = $215;
                            
                            return subType(_v166,f.apply());
                          }
                          }
                          }
                        case "RecType": {ESLVal $214 = _v14.termRef(0);
                            ESLVal $213 = _v14.termRef(1);
                            ESLVal $212 = _v14.termRef(2);
                            
                            {ESLVal _v164 = _v13;
                            
                            {ESLVal _v165 = $214;
                            
                            {ESLVal n2 = $213;
                            
                            {ESLVal t2 = $212;
                            
                            return subType(_v164,substType(new ESLVal("RecType",_v165,n2,t2),n2,t2));
                          }
                          }
                          }
                          }
                          }
                        case "ForallType": {ESLVal $211 = _v14.termRef(0);
                            ESLVal $210 = _v14.termRef(1);
                            ESLVal $209 = _v14.termRef(2);
                            
                            {ESLVal _v162 = _v13;
                            
                            {ESLVal _v163 = $211;
                            
                            {ESLVal ns2 = $210;
                            
                            {ESLVal t2 = $209;
                            
                            return subType(_v162,t2);
                          }
                          }
                          }
                          }
                          }
                        case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                            ESLVal $206 = _v14.termRef(1);
                            ESLVal $205 = _v14.termRef(2);
                            
                            switch($205.termName) {
                            case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                              
                              {ESLVal _v160 = _v13;
                              
                              {ESLVal l = $207;
                              
                              {ESLVal state = $206;
                              
                              {ESLVal f = $208;
                              
                              return subType(_v160,new ESLVal("ObservedType",l,state,f.apply()));
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v161 = _v13;
                              
                              {ESLVal l = $207;
                              
                              {ESLVal state = $206;
                              
                              {ESLVal messages = $205;
                              
                              return subType(_v161,expandObservedType(l,state,messages));
                            }
                            }
                            }
                            }
                          }
                          }
                        case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                            ESLVal $202 = _v14.termRef(1);
                            ESLVal $201 = _v14.termRef(2);
                            
                            switch($201.termName) {
                            case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                              
                              {ESLVal _v158 = _v13;
                              
                              {ESLVal l = $203;
                              
                              {ESLVal state = $202;
                              
                              {ESLVal f = $204;
                              
                              return subType(_v158,new ESLVal("ObserverType",l,state,f.apply()));
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v159 = _v13;
                              
                              {ESLVal l = $203;
                              
                              {ESLVal state = $202;
                              
                              {ESLVal messages = $201;
                              
                              return subType(_v159,expandObserverType(l,state,messages));
                            }
                            }
                            }
                            }
                          }
                          }
                          default: {ESLVal _v170 = _v13;
                            
                            {ESLVal t2 = _v14;
                            
                            return typeEqual(_v170,t2);
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
                    default: switch(_v14.termName) {
                      case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                        ESLVal $221 = _v14.termRef(1);
                        ESLVal $220 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $222;
                        
                        {ESLVal op = $221;
                        
                        {ESLVal args = $220;
                        
                        return subType(t1,applyTypeFun(l,forceType(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                        ESLVal $218 = _v14.termRef(1);
                        ESLVal $217 = _v14.termRef(2);
                        ESLVal $216 = _v14.termRef(3);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l2 = $219;
                        
                        {ESLVal t2 = $218;
                        
                        {ESLVal ds2 = $217;
                        
                        {ESLVal ms2 = $216;
                        
                        return subType(t1,flattenAct(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal f = $215;
                        
                        return subType(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $214 = _v14.termRef(0);
                        ESLVal $213 = _v14.termRef(1);
                        ESLVal $212 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l2 = $214;
                        
                        {ESLVal n2 = $213;
                        
                        {ESLVal t2 = $212;
                        
                        return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $211 = _v14.termRef(0);
                        ESLVal $210 = _v14.termRef(1);
                        ESLVal $209 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l1 = $211;
                        
                        {ESLVal ns2 = $210;
                        
                        {ESLVal t2 = $209;
                        
                        return subType(t1,t2);
                      }
                      }
                      }
                      }
                      }
                    case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                        ESLVal $206 = _v14.termRef(1);
                        ESLVal $205 = _v14.termRef(2);
                        
                        switch($205.termName) {
                        case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                          
                          {ESLVal t1 = _v13;
                          
                          {ESLVal l = $207;
                          
                          {ESLVal state = $206;
                          
                          {ESLVal f = $208;
                          
                          return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v13;
                          
                          {ESLVal l = $207;
                          
                          {ESLVal state = $206;
                          
                          {ESLVal messages = $205;
                          
                          return subType(t1,expandObservedType(l,state,messages));
                        }
                        }
                        }
                        }
                      }
                      }
                    case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                        ESLVal $202 = _v14.termRef(1);
                        ESLVal $201 = _v14.termRef(2);
                        
                        switch($201.termName) {
                        case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                          
                          {ESLVal t1 = _v13;
                          
                          {ESLVal l = $203;
                          
                          {ESLVal state = $202;
                          
                          {ESLVal f = $204;
                          
                          return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v13;
                          
                          {ESLVal l = $203;
                          
                          {ESLVal state = $202;
                          
                          {ESLVal messages = $201;
                          
                          return subType(t1,expandObserverType(l,state,messages));
                        }
                        }
                        }
                        }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal t2 = _v14;
                        
                        return typeEqual(t1,t2);
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v14.termName) {
                    case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                      ESLVal $221 = _v14.termRef(1);
                      ESLVal $220 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $222;
                      
                      {ESLVal op = $221;
                      
                      {ESLVal args = $220;
                      
                      return subType(t1,applyTypeFun(l,forceType(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                      ESLVal $218 = _v14.termRef(1);
                      ESLVal $217 = _v14.termRef(2);
                      ESLVal $216 = _v14.termRef(3);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l2 = $219;
                      
                      {ESLVal t2 = $218;
                      
                      {ESLVal ds2 = $217;
                      
                      {ESLVal ms2 = $216;
                      
                      return subType(t1,flattenAct(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal f = $215;
                      
                      return subType(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $214 = _v14.termRef(0);
                      ESLVal $213 = _v14.termRef(1);
                      ESLVal $212 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l2 = $214;
                      
                      {ESLVal n2 = $213;
                      
                      {ESLVal t2 = $212;
                      
                      return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $211 = _v14.termRef(0);
                      ESLVal $210 = _v14.termRef(1);
                      ESLVal $209 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l1 = $211;
                      
                      {ESLVal ns2 = $210;
                      
                      {ESLVal t2 = $209;
                      
                      return subType(t1,t2);
                    }
                    }
                    }
                    }
                    }
                  case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                      ESLVal $206 = _v14.termRef(1);
                      ESLVal $205 = _v14.termRef(2);
                      
                      switch($205.termName) {
                      case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $207;
                        
                        {ESLVal state = $206;
                        
                        {ESLVal f = $208;
                        
                        return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal l = $207;
                        
                        {ESLVal state = $206;
                        
                        {ESLVal messages = $205;
                        
                        return subType(t1,expandObservedType(l,state,messages));
                      }
                      }
                      }
                      }
                    }
                    }
                  case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                      ESLVal $202 = _v14.termRef(1);
                      ESLVal $201 = _v14.termRef(2);
                      
                      switch($201.termName) {
                      case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $203;
                        
                        {ESLVal state = $202;
                        
                        {ESLVal f = $204;
                        
                        return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal l = $203;
                        
                        {ESLVal state = $202;
                        
                        {ESLVal messages = $201;
                        
                        return subType(t1,expandObserverType(l,state,messages));
                      }
                      }
                      }
                      }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal t2 = _v14;
                      
                      return typeEqual(t1,t2);
                    }
                    }
                  }
                }
              else switch(_v14.termName) {
                  case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                    ESLVal $221 = _v14.termRef(1);
                    ESLVal $220 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $222;
                    
                    {ESLVal op = $221;
                    
                    {ESLVal args = $220;
                    
                    return subType(t1,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                    ESLVal $218 = _v14.termRef(1);
                    ESLVal $217 = _v14.termRef(2);
                    ESLVal $216 = _v14.termRef(3);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $219;
                    
                    {ESLVal t2 = $218;
                    
                    {ESLVal ds2 = $217;
                    
                    {ESLVal ms2 = $216;
                    
                    return subType(t1,flattenAct(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal f = $215;
                    
                    return subType(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $214 = _v14.termRef(0);
                    ESLVal $213 = _v14.termRef(1);
                    ESLVal $212 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $214;
                    
                    {ESLVal n2 = $213;
                    
                    {ESLVal t2 = $212;
                    
                    return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $211 = _v14.termRef(0);
                    ESLVal $210 = _v14.termRef(1);
                    ESLVal $209 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l1 = $211;
                    
                    {ESLVal ns2 = $210;
                    
                    {ESLVal t2 = $209;
                    
                    return subType(t1,t2);
                  }
                  }
                  }
                  }
                  }
                case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                    ESLVal $206 = _v14.termRef(1);
                    ESLVal $205 = _v14.termRef(2);
                    
                    switch($205.termName) {
                    case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal f = $208;
                      
                      return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal messages = $205;
                      
                      return subType(t1,expandObservedType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                    ESLVal $202 = _v14.termRef(1);
                    ESLVal $201 = _v14.termRef(2);
                    
                    switch($201.termName) {
                    case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal f = $204;
                      
                      return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal messages = $201;
                      
                      return subType(t1,expandObserverType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal t2 = _v14;
                    
                    return typeEqual(t1,t2);
                  }
                  }
                }
              }
            else if($298.isNil())
              switch(_v14.termName) {
                case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                  ESLVal $221 = _v14.termRef(1);
                  ESLVal $220 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $222;
                  
                  {ESLVal op = $221;
                  
                  {ESLVal args = $220;
                  
                  return subType(t1,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                  ESLVal $218 = _v14.termRef(1);
                  ESLVal $217 = _v14.termRef(2);
                  ESLVal $216 = _v14.termRef(3);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $219;
                  
                  {ESLVal t2 = $218;
                  
                  {ESLVal ds2 = $217;
                  
                  {ESLVal ms2 = $216;
                  
                  return subType(t1,flattenAct(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal f = $215;
                  
                  return subType(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $214 = _v14.termRef(0);
                  ESLVal $213 = _v14.termRef(1);
                  ESLVal $212 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $214;
                  
                  {ESLVal n2 = $213;
                  
                  {ESLVal t2 = $212;
                  
                  return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $211 = _v14.termRef(0);
                  ESLVal $210 = _v14.termRef(1);
                  ESLVal $209 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l1 = $211;
                  
                  {ESLVal ns2 = $210;
                  
                  {ESLVal t2 = $209;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
                }
              case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                  ESLVal $206 = _v14.termRef(1);
                  ESLVal $205 = _v14.termRef(2);
                  
                  switch($205.termName) {
                  case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal f = $208;
                    
                    return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal messages = $205;
                    
                    return subType(t1,expandObservedType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                  ESLVal $202 = _v14.termRef(1);
                  ESLVal $201 = _v14.termRef(2);
                  
                  switch($201.termName) {
                  case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal f = $204;
                    
                    return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal messages = $201;
                    
                    return subType(t1,expandObserverType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal t2 = _v14;
                  
                  return typeEqual(t1,t2);
                }
                }
              }
            else switch(_v14.termName) {
                case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                  ESLVal $221 = _v14.termRef(1);
                  ESLVal $220 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $222;
                  
                  {ESLVal op = $221;
                  
                  {ESLVal args = $220;
                  
                  return subType(t1,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                  ESLVal $218 = _v14.termRef(1);
                  ESLVal $217 = _v14.termRef(2);
                  ESLVal $216 = _v14.termRef(3);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $219;
                  
                  {ESLVal t2 = $218;
                  
                  {ESLVal ds2 = $217;
                  
                  {ESLVal ms2 = $216;
                  
                  return subType(t1,flattenAct(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal f = $215;
                  
                  return subType(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $214 = _v14.termRef(0);
                  ESLVal $213 = _v14.termRef(1);
                  ESLVal $212 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $214;
                  
                  {ESLVal n2 = $213;
                  
                  {ESLVal t2 = $212;
                  
                  return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $211 = _v14.termRef(0);
                  ESLVal $210 = _v14.termRef(1);
                  ESLVal $209 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l1 = $211;
                  
                  {ESLVal ns2 = $210;
                  
                  {ESLVal t2 = $209;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
                }
              case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                  ESLVal $206 = _v14.termRef(1);
                  ESLVal $205 = _v14.termRef(2);
                  
                  switch($205.termName) {
                  case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal f = $208;
                    
                    return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal messages = $205;
                    
                    return subType(t1,expandObservedType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                  ESLVal $202 = _v14.termRef(1);
                  ESLVal $201 = _v14.termRef(2);
                  
                  switch($201.termName) {
                  case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal f = $204;
                    
                    return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal messages = $201;
                    
                    return subType(t1,expandObserverType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal t2 = _v14;
                  
                  return typeEqual(t1,t2);
                }
                }
              }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "BagType": {ESLVal $292 = _v13.termRef(0);
            ESLVal $291 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "BagType": {ESLVal $294 = _v14.termRef(0);
              ESLVal $293 = _v14.termRef(1);
              
              {ESLVal l1 = $292;
              
              {ESLVal t1 = $291;
              
              {ESLVal l2 = $294;
              
              {ESLVal t2 = $293;
              
              return subType(t1,t2);
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "SetType": {ESLVal $277 = _v13.termRef(0);
            ESLVal $276 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "SetType": {ESLVal $290 = _v14.termRef(0);
              ESLVal $289 = _v14.termRef(1);
              
              {ESLVal l1 = $277;
              
              {ESLVal t1 = $276;
              
              {ESLVal l2 = $290;
              
              {ESLVal t2 = $289;
              
              return subType(t1,t2);
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $280 = _v14.termRef(0);
              ESLVal $279 = _v14.termRef(1);
              ESLVal $278 = _v14.termRef(2);
              
              if($279.isCons())
              {ESLVal $281 = $279.head();
                ESLVal $282 = $279.tail();
                
                if($282.isCons())
                {ESLVal $283 = $282.head();
                  ESLVal $284 = $282.tail();
                  
                  switch(_v14.termName) {
                  case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                    ESLVal $221 = _v14.termRef(1);
                    ESLVal $220 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $222;
                    
                    {ESLVal op = $221;
                    
                    {ESLVal args = $220;
                    
                    return subType(t1,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                    ESLVal $218 = _v14.termRef(1);
                    ESLVal $217 = _v14.termRef(2);
                    ESLVal $216 = _v14.termRef(3);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $219;
                    
                    {ESLVal t2 = $218;
                    
                    {ESLVal ds2 = $217;
                    
                    {ESLVal ms2 = $216;
                    
                    return subType(t1,flattenAct(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal f = $215;
                    
                    return subType(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $214 = _v14.termRef(0);
                    ESLVal $213 = _v14.termRef(1);
                    ESLVal $212 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $214;
                    
                    {ESLVal n2 = $213;
                    
                    {ESLVal t2 = $212;
                    
                    return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $211 = _v14.termRef(0);
                    ESLVal $210 = _v14.termRef(1);
                    ESLVal $209 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l1 = $211;
                    
                    {ESLVal ns2 = $210;
                    
                    {ESLVal t2 = $209;
                    
                    return subType(t1,t2);
                  }
                  }
                  }
                  }
                  }
                case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                    ESLVal $206 = _v14.termRef(1);
                    ESLVal $205 = _v14.termRef(2);
                    
                    switch($205.termName) {
                    case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal f = $208;
                      
                      return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal messages = $205;
                      
                      return subType(t1,expandObservedType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                    ESLVal $202 = _v14.termRef(1);
                    ESLVal $201 = _v14.termRef(2);
                    
                    switch($201.termName) {
                    case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal f = $204;
                      
                      return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal messages = $201;
                      
                      return subType(t1,expandObserverType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal t2 = _v14;
                    
                    return typeEqual(t1,t2);
                  }
                  }
                }
                }
              else if($282.isNil())
                switch($278.termName) {
                  case "SetType": {ESLVal $286 = $278.termRef(0);
                    ESLVal $285 = $278.termRef(1);
                    
                    switch($285.termName) {
                    case "VarType": {ESLVal $288 = $285.termRef(0);
                      ESLVal $287 = $285.termRef(1);
                      
                      {ESLVal l1 = $277;
                      
                      {ESLVal t1 = $276;
                      
                      {ESLVal l2 = $280;
                      
                      {ESLVal v1 = $281;
                      
                      {ESLVal l3 = $286;
                      
                      {ESLVal l4 = $288;
                      
                      {ESLVal v2 = $287;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v14.termName) {
                          case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                            ESLVal $221 = _v14.termRef(1);
                            ESLVal $220 = _v14.termRef(2);
                            
                            {ESLVal _v156 = _v13;
                            
                            {ESLVal l = $222;
                            
                            {ESLVal op = $221;
                            
                            {ESLVal args = $220;
                            
                            return subType(_v156,applyTypeFun(l,forceType(op),args));
                          }
                          }
                          }
                          }
                          }
                        case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                            ESLVal $218 = _v14.termRef(1);
                            ESLVal $217 = _v14.termRef(2);
                            ESLVal $216 = _v14.termRef(3);
                            
                            {ESLVal _v154 = _v13;
                            
                            {ESLVal _v155 = $219;
                            
                            {ESLVal t2 = $218;
                            
                            {ESLVal ds2 = $217;
                            
                            {ESLVal ms2 = $216;
                            
                            return subType(_v154,flattenAct(_v155,t2,ds2,ms2));
                          }
                          }
                          }
                          }
                          }
                          }
                        case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                            
                            {ESLVal _v153 = _v13;
                            
                            {ESLVal f = $215;
                            
                            return subType(_v153,f.apply());
                          }
                          }
                          }
                        case "RecType": {ESLVal $214 = _v14.termRef(0);
                            ESLVal $213 = _v14.termRef(1);
                            ESLVal $212 = _v14.termRef(2);
                            
                            {ESLVal _v151 = _v13;
                            
                            {ESLVal _v152 = $214;
                            
                            {ESLVal n2 = $213;
                            
                            {ESLVal t2 = $212;
                            
                            return subType(_v151,substType(new ESLVal("RecType",_v152,n2,t2),n2,t2));
                          }
                          }
                          }
                          }
                          }
                        case "ForallType": {ESLVal $211 = _v14.termRef(0);
                            ESLVal $210 = _v14.termRef(1);
                            ESLVal $209 = _v14.termRef(2);
                            
                            {ESLVal _v149 = _v13;
                            
                            {ESLVal _v150 = $211;
                            
                            {ESLVal ns2 = $210;
                            
                            {ESLVal t2 = $209;
                            
                            return subType(_v149,t2);
                          }
                          }
                          }
                          }
                          }
                        case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                            ESLVal $206 = _v14.termRef(1);
                            ESLVal $205 = _v14.termRef(2);
                            
                            switch($205.termName) {
                            case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                              
                              {ESLVal _v147 = _v13;
                              
                              {ESLVal l = $207;
                              
                              {ESLVal state = $206;
                              
                              {ESLVal f = $208;
                              
                              return subType(_v147,new ESLVal("ObservedType",l,state,f.apply()));
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v148 = _v13;
                              
                              {ESLVal l = $207;
                              
                              {ESLVal state = $206;
                              
                              {ESLVal messages = $205;
                              
                              return subType(_v148,expandObservedType(l,state,messages));
                            }
                            }
                            }
                            }
                          }
                          }
                        case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                            ESLVal $202 = _v14.termRef(1);
                            ESLVal $201 = _v14.termRef(2);
                            
                            switch($201.termName) {
                            case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                              
                              {ESLVal _v145 = _v13;
                              
                              {ESLVal l = $203;
                              
                              {ESLVal state = $202;
                              
                              {ESLVal f = $204;
                              
                              return subType(_v145,new ESLVal("ObserverType",l,state,f.apply()));
                            }
                            }
                            }
                            }
                            }
                            default: {ESLVal _v146 = _v13;
                              
                              {ESLVal l = $203;
                              
                              {ESLVal state = $202;
                              
                              {ESLVal messages = $201;
                              
                              return subType(_v146,expandObserverType(l,state,messages));
                            }
                            }
                            }
                            }
                          }
                          }
                          default: {ESLVal _v157 = _v13;
                            
                            {ESLVal t2 = _v14;
                            
                            return typeEqual(_v157,t2);
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
                    default: switch(_v14.termName) {
                      case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                        ESLVal $221 = _v14.termRef(1);
                        ESLVal $220 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $222;
                        
                        {ESLVal op = $221;
                        
                        {ESLVal args = $220;
                        
                        return subType(t1,applyTypeFun(l,forceType(op),args));
                      }
                      }
                      }
                      }
                      }
                    case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                        ESLVal $218 = _v14.termRef(1);
                        ESLVal $217 = _v14.termRef(2);
                        ESLVal $216 = _v14.termRef(3);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l2 = $219;
                        
                        {ESLVal t2 = $218;
                        
                        {ESLVal ds2 = $217;
                        
                        {ESLVal ms2 = $216;
                        
                        return subType(t1,flattenAct(l2,t2,ds2,ms2));
                      }
                      }
                      }
                      }
                      }
                      }
                    case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal f = $215;
                        
                        return subType(t1,f.apply());
                      }
                      }
                      }
                    case "RecType": {ESLVal $214 = _v14.termRef(0);
                        ESLVal $213 = _v14.termRef(1);
                        ESLVal $212 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l2 = $214;
                        
                        {ESLVal n2 = $213;
                        
                        {ESLVal t2 = $212;
                        
                        return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                      }
                      }
                      }
                      }
                      }
                    case "ForallType": {ESLVal $211 = _v14.termRef(0);
                        ESLVal $210 = _v14.termRef(1);
                        ESLVal $209 = _v14.termRef(2);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l1 = $211;
                        
                        {ESLVal ns2 = $210;
                        
                        {ESLVal t2 = $209;
                        
                        return subType(t1,t2);
                      }
                      }
                      }
                      }
                      }
                    case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                        ESLVal $206 = _v14.termRef(1);
                        ESLVal $205 = _v14.termRef(2);
                        
                        switch($205.termName) {
                        case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                          
                          {ESLVal t1 = _v13;
                          
                          {ESLVal l = $207;
                          
                          {ESLVal state = $206;
                          
                          {ESLVal f = $208;
                          
                          return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v13;
                          
                          {ESLVal l = $207;
                          
                          {ESLVal state = $206;
                          
                          {ESLVal messages = $205;
                          
                          return subType(t1,expandObservedType(l,state,messages));
                        }
                        }
                        }
                        }
                      }
                      }
                    case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                        ESLVal $202 = _v14.termRef(1);
                        ESLVal $201 = _v14.termRef(2);
                        
                        switch($201.termName) {
                        case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                          
                          {ESLVal t1 = _v13;
                          
                          {ESLVal l = $203;
                          
                          {ESLVal state = $202;
                          
                          {ESLVal f = $204;
                          
                          return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal t1 = _v13;
                          
                          {ESLVal l = $203;
                          
                          {ESLVal state = $202;
                          
                          {ESLVal messages = $201;
                          
                          return subType(t1,expandObserverType(l,state,messages));
                        }
                        }
                        }
                        }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal t2 = _v14;
                        
                        return typeEqual(t1,t2);
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v14.termName) {
                    case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                      ESLVal $221 = _v14.termRef(1);
                      ESLVal $220 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $222;
                      
                      {ESLVal op = $221;
                      
                      {ESLVal args = $220;
                      
                      return subType(t1,applyTypeFun(l,forceType(op),args));
                    }
                    }
                    }
                    }
                    }
                  case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                      ESLVal $218 = _v14.termRef(1);
                      ESLVal $217 = _v14.termRef(2);
                      ESLVal $216 = _v14.termRef(3);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l2 = $219;
                      
                      {ESLVal t2 = $218;
                      
                      {ESLVal ds2 = $217;
                      
                      {ESLVal ms2 = $216;
                      
                      return subType(t1,flattenAct(l2,t2,ds2,ms2));
                    }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal f = $215;
                      
                      return subType(t1,f.apply());
                    }
                    }
                    }
                  case "RecType": {ESLVal $214 = _v14.termRef(0);
                      ESLVal $213 = _v14.termRef(1);
                      ESLVal $212 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l2 = $214;
                      
                      {ESLVal n2 = $213;
                      
                      {ESLVal t2 = $212;
                      
                      return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                    }
                    }
                    }
                    }
                    }
                  case "ForallType": {ESLVal $211 = _v14.termRef(0);
                      ESLVal $210 = _v14.termRef(1);
                      ESLVal $209 = _v14.termRef(2);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l1 = $211;
                      
                      {ESLVal ns2 = $210;
                      
                      {ESLVal t2 = $209;
                      
                      return subType(t1,t2);
                    }
                    }
                    }
                    }
                    }
                  case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                      ESLVal $206 = _v14.termRef(1);
                      ESLVal $205 = _v14.termRef(2);
                      
                      switch($205.termName) {
                      case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $207;
                        
                        {ESLVal state = $206;
                        
                        {ESLVal f = $208;
                        
                        return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal l = $207;
                        
                        {ESLVal state = $206;
                        
                        {ESLVal messages = $205;
                        
                        return subType(t1,expandObservedType(l,state,messages));
                      }
                      }
                      }
                      }
                    }
                    }
                  case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                      ESLVal $202 = _v14.termRef(1);
                      ESLVal $201 = _v14.termRef(2);
                      
                      switch($201.termName) {
                      case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                        
                        {ESLVal t1 = _v13;
                        
                        {ESLVal l = $203;
                        
                        {ESLVal state = $202;
                        
                        {ESLVal f = $204;
                        
                        return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t1 = _v13;
                        
                        {ESLVal l = $203;
                        
                        {ESLVal state = $202;
                        
                        {ESLVal messages = $201;
                        
                        return subType(t1,expandObserverType(l,state,messages));
                      }
                      }
                      }
                      }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal t2 = _v14;
                      
                      return typeEqual(t1,t2);
                    }
                    }
                  }
                }
              else switch(_v14.termName) {
                  case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                    ESLVal $221 = _v14.termRef(1);
                    ESLVal $220 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $222;
                    
                    {ESLVal op = $221;
                    
                    {ESLVal args = $220;
                    
                    return subType(t1,applyTypeFun(l,forceType(op),args));
                  }
                  }
                  }
                  }
                  }
                case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                    ESLVal $218 = _v14.termRef(1);
                    ESLVal $217 = _v14.termRef(2);
                    ESLVal $216 = _v14.termRef(3);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $219;
                    
                    {ESLVal t2 = $218;
                    
                    {ESLVal ds2 = $217;
                    
                    {ESLVal ms2 = $216;
                    
                    return subType(t1,flattenAct(l2,t2,ds2,ms2));
                  }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal f = $215;
                    
                    return subType(t1,f.apply());
                  }
                  }
                  }
                case "RecType": {ESLVal $214 = _v14.termRef(0);
                    ESLVal $213 = _v14.termRef(1);
                    ESLVal $212 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l2 = $214;
                    
                    {ESLVal n2 = $213;
                    
                    {ESLVal t2 = $212;
                    
                    return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                  }
                  }
                  }
                  }
                  }
                case "ForallType": {ESLVal $211 = _v14.termRef(0);
                    ESLVal $210 = _v14.termRef(1);
                    ESLVal $209 = _v14.termRef(2);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l1 = $211;
                    
                    {ESLVal ns2 = $210;
                    
                    {ESLVal t2 = $209;
                    
                    return subType(t1,t2);
                  }
                  }
                  }
                  }
                  }
                case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                    ESLVal $206 = _v14.termRef(1);
                    ESLVal $205 = _v14.termRef(2);
                    
                    switch($205.termName) {
                    case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal f = $208;
                      
                      return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $207;
                      
                      {ESLVal state = $206;
                      
                      {ESLVal messages = $205;
                      
                      return subType(t1,expandObservedType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                    ESLVal $202 = _v14.termRef(1);
                    ESLVal $201 = _v14.termRef(2);
                    
                    switch($201.termName) {
                    case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                      
                      {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal f = $204;
                      
                      return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t1 = _v13;
                      
                      {ESLVal l = $203;
                      
                      {ESLVal state = $202;
                      
                      {ESLVal messages = $201;
                      
                      return subType(t1,expandObserverType(l,state,messages));
                    }
                    }
                    }
                    }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal t2 = _v14;
                    
                    return typeEqual(t1,t2);
                  }
                  }
                }
              }
            else if($279.isNil())
              switch(_v14.termName) {
                case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                  ESLVal $221 = _v14.termRef(1);
                  ESLVal $220 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $222;
                  
                  {ESLVal op = $221;
                  
                  {ESLVal args = $220;
                  
                  return subType(t1,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                  ESLVal $218 = _v14.termRef(1);
                  ESLVal $217 = _v14.termRef(2);
                  ESLVal $216 = _v14.termRef(3);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $219;
                  
                  {ESLVal t2 = $218;
                  
                  {ESLVal ds2 = $217;
                  
                  {ESLVal ms2 = $216;
                  
                  return subType(t1,flattenAct(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal f = $215;
                  
                  return subType(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $214 = _v14.termRef(0);
                  ESLVal $213 = _v14.termRef(1);
                  ESLVal $212 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $214;
                  
                  {ESLVal n2 = $213;
                  
                  {ESLVal t2 = $212;
                  
                  return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $211 = _v14.termRef(0);
                  ESLVal $210 = _v14.termRef(1);
                  ESLVal $209 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l1 = $211;
                  
                  {ESLVal ns2 = $210;
                  
                  {ESLVal t2 = $209;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
                }
              case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                  ESLVal $206 = _v14.termRef(1);
                  ESLVal $205 = _v14.termRef(2);
                  
                  switch($205.termName) {
                  case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal f = $208;
                    
                    return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal messages = $205;
                    
                    return subType(t1,expandObservedType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                  ESLVal $202 = _v14.termRef(1);
                  ESLVal $201 = _v14.termRef(2);
                  
                  switch($201.termName) {
                  case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal f = $204;
                    
                    return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal messages = $201;
                    
                    return subType(t1,expandObserverType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal t2 = _v14;
                  
                  return typeEqual(t1,t2);
                }
                }
              }
            else switch(_v14.termName) {
                case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                  ESLVal $221 = _v14.termRef(1);
                  ESLVal $220 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $222;
                  
                  {ESLVal op = $221;
                  
                  {ESLVal args = $220;
                  
                  return subType(t1,applyTypeFun(l,forceType(op),args));
                }
                }
                }
                }
                }
              case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                  ESLVal $218 = _v14.termRef(1);
                  ESLVal $217 = _v14.termRef(2);
                  ESLVal $216 = _v14.termRef(3);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $219;
                  
                  {ESLVal t2 = $218;
                  
                  {ESLVal ds2 = $217;
                  
                  {ESLVal ms2 = $216;
                  
                  return subType(t1,flattenAct(l2,t2,ds2,ms2));
                }
                }
                }
                }
                }
                }
              case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal f = $215;
                  
                  return subType(t1,f.apply());
                }
                }
                }
              case "RecType": {ESLVal $214 = _v14.termRef(0);
                  ESLVal $213 = _v14.termRef(1);
                  ESLVal $212 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l2 = $214;
                  
                  {ESLVal n2 = $213;
                  
                  {ESLVal t2 = $212;
                  
                  return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
                }
                }
                }
                }
                }
              case "ForallType": {ESLVal $211 = _v14.termRef(0);
                  ESLVal $210 = _v14.termRef(1);
                  ESLVal $209 = _v14.termRef(2);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l1 = $211;
                  
                  {ESLVal ns2 = $210;
                  
                  {ESLVal t2 = $209;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
                }
              case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                  ESLVal $206 = _v14.termRef(1);
                  ESLVal $205 = _v14.termRef(2);
                  
                  switch($205.termName) {
                  case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal f = $208;
                    
                    return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $207;
                    
                    {ESLVal state = $206;
                    
                    {ESLVal messages = $205;
                    
                    return subType(t1,expandObservedType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
              case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                  ESLVal $202 = _v14.termRef(1);
                  ESLVal $201 = _v14.termRef(2);
                  
                  switch($201.termName) {
                  case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                    
                    {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal f = $204;
                    
                    return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t1 = _v13;
                    
                    {ESLVal l = $203;
                    
                    {ESLVal state = $202;
                    
                    {ESLVal messages = $201;
                    
                    return subType(t1,expandObserverType(l,state,messages));
                  }
                  }
                  }
                  }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal t2 = _v14;
                  
                  return typeEqual(t1,t2);
                }
                }
              }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "TermType": {ESLVal $272 = _v13.termRef(0);
            ESLVal $271 = _v13.termRef(1);
            ESLVal $270 = _v13.termRef(2);
            
            switch(_v14.termName) {
            case "TermType": {ESLVal $275 = _v14.termRef(0);
              ESLVal $274 = _v14.termRef(1);
              ESLVal $273 = _v14.termRef(2);
              
              {ESLVal l1 = $272;
              
              {ESLVal n1 = $271;
              
              {ESLVal args1 = $270;
              
              {ESLVal l2 = $275;
              
              {ESLVal n2 = $274;
              
              {ESLVal args2 = $273;
              
              if(n1.eql(n2).boolVal)
              return subTypes(args1,args2);
              else
                return $false;
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "FunType": {ESLVal $266 = _v13.termRef(0);
            ESLVal $265 = _v13.termRef(1);
            ESLVal $264 = _v13.termRef(2);
            
            switch(_v14.termName) {
            case "FunType": {ESLVal $269 = _v14.termRef(0);
              ESLVal $268 = _v14.termRef(1);
              ESLVal $267 = _v14.termRef(2);
              
              {ESLVal l1 = $266;
              
              {ESLVal d1 = $265;
              
              {ESLVal r1 = $264;
              
              {ESLVal l2 = $269;
              
              {ESLVal d2 = $268;
              
              {ESLVal r2 = $267;
              
              return subType(r1,r2).and(subTypes(d2,d1));
            }
            }
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "TypeClosure": {ESLVal $263 = _v13.termRef(0);
            
            {ESLVal f = $263;
            
            {ESLVal t2 = _v14;
            
            return subType(f.apply(),t2);
          }
          }
          }
        case "RecordType": {ESLVal $260 = _v13.termRef(0);
            ESLVal $259 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "RecordType": {ESLVal $262 = _v14.termRef(0);
              ESLVal $261 = _v14.termRef(1);
              
              {ESLVal l1 = $260;
              
              {ESLVal fs1 = $259;
              
              {ESLVal l2 = $262;
              
              {ESLVal fs2 = $261;
              
              return recordSubType(fs1,fs2);
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "RecType": {ESLVal $255 = _v13.termRef(0);
            ESLVal $254 = _v13.termRef(1);
            ESLVal $253 = _v13.termRef(2);
            
            switch(_v14.termName) {
            case "RecType": {ESLVal $258 = _v14.termRef(0);
              ESLVal $257 = _v14.termRef(1);
              ESLVal $256 = _v14.termRef(2);
              
              {ESLVal l1 = $255;
              
              {ESLVal n1 = $254;
              
              {ESLVal t1 = $253;
              
              {ESLVal l2 = $258;
              
              {ESLVal n2 = $257;
              
              {ESLVal t2 = $256;
              
              if(n1.eql(n2).boolVal)
              return subType(t1,t2);
              else
                {ESLVal _v141 = $255;
                  
                  {ESLVal _v142 = $254;
                  
                  {ESLVal _v143 = $253;
                  
                  {ESLVal _v144 = _v14;
                  
                  return subType(substType(new ESLVal("RecType",_v141,_v142,_v143),_v142,_v143),_v144);
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
            default: {ESLVal l1 = $255;
              
              {ESLVal n1 = $254;
              
              {ESLVal t1 = $253;
              
              {ESLVal t2 = _v14;
              
              return subType(substType(new ESLVal("RecType",l1,n1,t1),n1,t1),t2);
            }
            }
            }
            }
          }
          }
        case "UnionType": {ESLVal $250 = _v13.termRef(0);
            ESLVal $249 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "UnionType": {ESLVal $252 = _v14.termRef(0);
              ESLVal $251 = _v14.termRef(1);
              
              {ESLVal l1 = $250;
              
              {ESLVal terms1 = $249;
              
              {ESLVal l2 = $252;
              
              {ESLVal terms2 = $251;
              
              return subTypes(terms1,terms2);
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "VarType": {ESLVal $246 = _v13.termRef(0);
            ESLVal $245 = _v13.termRef(1);
            
            switch(_v14.termName) {
            case "VarType": {ESLVal $248 = _v14.termRef(0);
              ESLVal $247 = _v14.termRef(1);
              
              {ESLVal l1 = $246;
              
              {ESLVal n1 = $245;
              
              {ESLVal l2 = $248;
              
              {ESLVal n2 = $247;
              
              return n1.eql(n2);
            }
            }
            }
            }
            }
            default: switch(_v14.termName) {
              case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
                ESLVal $221 = _v14.termRef(1);
                ESLVal $220 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $222;
                
                {ESLVal op = $221;
                
                {ESLVal args = $220;
                
                return subType(t1,applyTypeFun(l,forceType(op),args));
              }
              }
              }
              }
              }
            case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
                ESLVal $218 = _v14.termRef(1);
                ESLVal $217 = _v14.termRef(2);
                ESLVal $216 = _v14.termRef(3);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $219;
                
                {ESLVal t2 = $218;
                
                {ESLVal ds2 = $217;
                
                {ESLVal ms2 = $216;
                
                return subType(t1,flattenAct(l2,t2,ds2,ms2));
              }
              }
              }
              }
              }
              }
            case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal f = $215;
                
                return subType(t1,f.apply());
              }
              }
              }
            case "RecType": {ESLVal $214 = _v14.termRef(0);
                ESLVal $213 = _v14.termRef(1);
                ESLVal $212 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l2 = $214;
                
                {ESLVal n2 = $213;
                
                {ESLVal t2 = $212;
                
                return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
              }
              }
              }
              }
              }
            case "ForallType": {ESLVal $211 = _v14.termRef(0);
                ESLVal $210 = _v14.termRef(1);
                ESLVal $209 = _v14.termRef(2);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l1 = $211;
                
                {ESLVal ns2 = $210;
                
                {ESLVal t2 = $209;
                
                return subType(t1,t2);
              }
              }
              }
              }
              }
            case "ObservedType": {ESLVal $207 = _v14.termRef(0);
                ESLVal $206 = _v14.termRef(1);
                ESLVal $205 = _v14.termRef(2);
                
                switch($205.termName) {
                case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal f = $208;
                  
                  return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $207;
                  
                  {ESLVal state = $206;
                  
                  {ESLVal messages = $205;
                  
                  return subType(t1,expandObservedType(l,state,messages));
                }
                }
                }
                }
              }
              }
            case "ObserverType": {ESLVal $203 = _v14.termRef(0);
                ESLVal $202 = _v14.termRef(1);
                ESLVal $201 = _v14.termRef(2);
                
                switch($201.termName) {
                case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                  
                  {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal f = $204;
                  
                  return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
                }
                }
                }
                }
                }
                default: {ESLVal t1 = _v13;
                  
                  {ESLVal l = $203;
                  
                  {ESLVal state = $202;
                  
                  {ESLVal messages = $201;
                  
                  return subType(t1,expandObserverType(l,state,messages));
                }
                }
                }
                }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal t2 = _v14;
                
                return typeEqual(t1,t2);
              }
              }
            }
          }
          }
        case "ForallType": {ESLVal $225 = _v13.termRef(0);
            ESLVal $224 = _v13.termRef(1);
            ESLVal $223 = _v13.termRef(2);
            
            if($224.isCons())
            {ESLVal $229 = $224.head();
              ESLVal $230 = $224.tail();
              
              if($230.isCons())
              {ESLVal $231 = $230.head();
                ESLVal $232 = $230.tail();
                
                switch(_v14.termName) {
                case "ForallType": {ESLVal $228 = _v14.termRef(0);
                  ESLVal $227 = _v14.termRef(1);
                  ESLVal $226 = _v14.termRef(2);
                  
                  {ESLVal l1 = $225;
                  
                  {ESLVal ns1 = $224;
                  
                  {ESLVal t1 = $223;
                  
                  {ESLVal l2 = $228;
                  
                  {ESLVal ns2 = $227;
                  
                  {ESLVal t2 = $226;
                  
                  return ns1.eql(ns2).and(subType(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $225;
                  
                  {ESLVal ns1 = $224;
                  
                  {ESLVal t1 = $223;
                  
                  {ESLVal t2 = _v14;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
              }
              }
            else if($230.isNil())
              switch($223.termName) {
                case "ListType": {ESLVal $240 = $223.termRef(0);
                  ESLVal $239 = $223.termRef(1);
                  
                  switch($239.termName) {
                  case "VarType": {ESLVal $242 = $239.termRef(0);
                    ESLVal $241 = $239.termRef(1);
                    
                    switch(_v14.termName) {
                    case "ListType": {ESLVal $244 = _v14.termRef(0);
                      ESLVal $243 = _v14.termRef(1);
                      
                      {ESLVal l2 = $225;
                      
                      {ESLVal v1 = $229;
                      
                      {ESLVal l3 = $240;
                      
                      {ESLVal l4 = $242;
                      
                      {ESLVal v2 = $241;
                      
                      {ESLVal l1 = $244;
                      
                      {ESLVal t1 = $243;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v14.termName) {
                          case "ForallType": {ESLVal $228 = _v14.termRef(0);
                            ESLVal $227 = _v14.termRef(1);
                            ESLVal $226 = _v14.termRef(2);
                            
                            {ESLVal _v136 = $225;
                            
                            {ESLVal ns1 = $224;
                            
                            {ESLVal _v137 = $223;
                            
                            {ESLVal _v138 = $228;
                            
                            {ESLVal ns2 = $227;
                            
                            {ESLVal t2 = $226;
                            
                            return ns1.eql(ns2).and(subType(_v137,t2));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v139 = $225;
                            
                            {ESLVal ns1 = $224;
                            
                            {ESLVal _v140 = $223;
                            
                            {ESLVal t2 = _v14;
                            
                            return subType(_v140,t2);
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
                    default: switch(_v14.termName) {
                      case "ForallType": {ESLVal $228 = _v14.termRef(0);
                        ESLVal $227 = _v14.termRef(1);
                        ESLVal $226 = _v14.termRef(2);
                        
                        {ESLVal l1 = $225;
                        
                        {ESLVal ns1 = $224;
                        
                        {ESLVal t1 = $223;
                        
                        {ESLVal l2 = $228;
                        
                        {ESLVal ns2 = $227;
                        
                        {ESLVal t2 = $226;
                        
                        return ns1.eql(ns2).and(subType(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $225;
                        
                        {ESLVal ns1 = $224;
                        
                        {ESLVal t1 = $223;
                        
                        {ESLVal t2 = _v14;
                        
                        return subType(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v14.termName) {
                    case "ForallType": {ESLVal $228 = _v14.termRef(0);
                      ESLVal $227 = _v14.termRef(1);
                      ESLVal $226 = _v14.termRef(2);
                      
                      {ESLVal l1 = $225;
                      
                      {ESLVal ns1 = $224;
                      
                      {ESLVal t1 = $223;
                      
                      {ESLVal l2 = $228;
                      
                      {ESLVal ns2 = $227;
                      
                      {ESLVal t2 = $226;
                      
                      return ns1.eql(ns2).and(subType(t1,t2));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $225;
                      
                      {ESLVal ns1 = $224;
                      
                      {ESLVal t1 = $223;
                      
                      {ESLVal t2 = _v14;
                      
                      return subType(t1,t2);
                    }
                    }
                    }
                    }
                  }
                }
                }
              case "SetType": {ESLVal $234 = $223.termRef(0);
                  ESLVal $233 = $223.termRef(1);
                  
                  switch($233.termName) {
                  case "VarType": {ESLVal $236 = $233.termRef(0);
                    ESLVal $235 = $233.termRef(1);
                    
                    switch(_v14.termName) {
                    case "SetType": {ESLVal $238 = _v14.termRef(0);
                      ESLVal $237 = _v14.termRef(1);
                      
                      {ESLVal l2 = $225;
                      
                      {ESLVal v1 = $229;
                      
                      {ESLVal l3 = $234;
                      
                      {ESLVal l4 = $236;
                      
                      {ESLVal v2 = $235;
                      
                      {ESLVal l1 = $238;
                      
                      {ESLVal t1 = $237;
                      
                      if(v1.eql(v2).boolVal)
                      return $true;
                      else
                        switch(_v14.termName) {
                          case "ForallType": {ESLVal $228 = _v14.termRef(0);
                            ESLVal $227 = _v14.termRef(1);
                            ESLVal $226 = _v14.termRef(2);
                            
                            {ESLVal _v131 = $225;
                            
                            {ESLVal ns1 = $224;
                            
                            {ESLVal _v132 = $223;
                            
                            {ESLVal _v133 = $228;
                            
                            {ESLVal ns2 = $227;
                            
                            {ESLVal t2 = $226;
                            
                            return ns1.eql(ns2).and(subType(_v132,t2));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v134 = $225;
                            
                            {ESLVal ns1 = $224;
                            
                            {ESLVal _v135 = $223;
                            
                            {ESLVal t2 = _v14;
                            
                            return subType(_v135,t2);
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
                    default: switch(_v14.termName) {
                      case "ForallType": {ESLVal $228 = _v14.termRef(0);
                        ESLVal $227 = _v14.termRef(1);
                        ESLVal $226 = _v14.termRef(2);
                        
                        {ESLVal l1 = $225;
                        
                        {ESLVal ns1 = $224;
                        
                        {ESLVal t1 = $223;
                        
                        {ESLVal l2 = $228;
                        
                        {ESLVal ns2 = $227;
                        
                        {ESLVal t2 = $226;
                        
                        return ns1.eql(ns2).and(subType(t1,t2));
                      }
                      }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal l1 = $225;
                        
                        {ESLVal ns1 = $224;
                        
                        {ESLVal t1 = $223;
                        
                        {ESLVal t2 = _v14;
                        
                        return subType(t1,t2);
                      }
                      }
                      }
                      }
                    }
                  }
                  }
                  default: switch(_v14.termName) {
                    case "ForallType": {ESLVal $228 = _v14.termRef(0);
                      ESLVal $227 = _v14.termRef(1);
                      ESLVal $226 = _v14.termRef(2);
                      
                      {ESLVal l1 = $225;
                      
                      {ESLVal ns1 = $224;
                      
                      {ESLVal t1 = $223;
                      
                      {ESLVal l2 = $228;
                      
                      {ESLVal ns2 = $227;
                      
                      {ESLVal t2 = $226;
                      
                      return ns1.eql(ns2).and(subType(t1,t2));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal l1 = $225;
                      
                      {ESLVal ns1 = $224;
                      
                      {ESLVal t1 = $223;
                      
                      {ESLVal t2 = _v14;
                      
                      return subType(t1,t2);
                    }
                    }
                    }
                    }
                  }
                }
                }
                default: switch(_v14.termName) {
                  case "ForallType": {ESLVal $228 = _v14.termRef(0);
                    ESLVal $227 = _v14.termRef(1);
                    ESLVal $226 = _v14.termRef(2);
                    
                    {ESLVal l1 = $225;
                    
                    {ESLVal ns1 = $224;
                    
                    {ESLVal t1 = $223;
                    
                    {ESLVal l2 = $228;
                    
                    {ESLVal ns2 = $227;
                    
                    {ESLVal t2 = $226;
                    
                    return ns1.eql(ns2).and(subType(t1,t2));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal l1 = $225;
                    
                    {ESLVal ns1 = $224;
                    
                    {ESLVal t1 = $223;
                    
                    {ESLVal t2 = _v14;
                    
                    return subType(t1,t2);
                  }
                  }
                  }
                  }
                }
              }
            else switch(_v14.termName) {
                case "ForallType": {ESLVal $228 = _v14.termRef(0);
                  ESLVal $227 = _v14.termRef(1);
                  ESLVal $226 = _v14.termRef(2);
                  
                  {ESLVal l1 = $225;
                  
                  {ESLVal ns1 = $224;
                  
                  {ESLVal t1 = $223;
                  
                  {ESLVal l2 = $228;
                  
                  {ESLVal ns2 = $227;
                  
                  {ESLVal t2 = $226;
                  
                  return ns1.eql(ns2).and(subType(t1,t2));
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal l1 = $225;
                  
                  {ESLVal ns1 = $224;
                  
                  {ESLVal t1 = $223;
                  
                  {ESLVal t2 = _v14;
                  
                  return subType(t1,t2);
                }
                }
                }
                }
              }
            }
          else if($224.isNil())
            switch(_v14.termName) {
              case "ForallType": {ESLVal $228 = _v14.termRef(0);
                ESLVal $227 = _v14.termRef(1);
                ESLVal $226 = _v14.termRef(2);
                
                {ESLVal l1 = $225;
                
                {ESLVal ns1 = $224;
                
                {ESLVal t1 = $223;
                
                {ESLVal l2 = $228;
                
                {ESLVal ns2 = $227;
                
                {ESLVal t2 = $226;
                
                return ns1.eql(ns2).and(subType(t1,t2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $225;
                
                {ESLVal ns1 = $224;
                
                {ESLVal t1 = $223;
                
                {ESLVal t2 = _v14;
                
                return subType(t1,t2);
              }
              }
              }
              }
            }
          else switch(_v14.termName) {
              case "ForallType": {ESLVal $228 = _v14.termRef(0);
                ESLVal $227 = _v14.termRef(1);
                ESLVal $226 = _v14.termRef(2);
                
                {ESLVal l1 = $225;
                
                {ESLVal ns1 = $224;
                
                {ESLVal t1 = $223;
                
                {ESLVal l2 = $228;
                
                {ESLVal ns2 = $227;
                
                {ESLVal t2 = $226;
                
                return ns1.eql(ns2).and(subType(t1,t2));
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l1 = $225;
                
                {ESLVal ns1 = $224;
                
                {ESLVal t1 = $223;
                
                {ESLVal t2 = _v14;
                
                return subType(t1,t2);
              }
              }
              }
              }
            }
          }
          default: switch(_v14.termName) {
            case "ApplyTypeFun": {ESLVal $222 = _v14.termRef(0);
              ESLVal $221 = _v14.termRef(1);
              ESLVal $220 = _v14.termRef(2);
              
              {ESLVal t1 = _v13;
              
              {ESLVal l = $222;
              
              {ESLVal op = $221;
              
              {ESLVal args = $220;
              
              return subType(t1,applyTypeFun(l,forceType(op),args));
            }
            }
            }
            }
            }
          case "ExtendedAct": {ESLVal $219 = _v14.termRef(0);
              ESLVal $218 = _v14.termRef(1);
              ESLVal $217 = _v14.termRef(2);
              ESLVal $216 = _v14.termRef(3);
              
              {ESLVal t1 = _v13;
              
              {ESLVal l2 = $219;
              
              {ESLVal t2 = $218;
              
              {ESLVal ds2 = $217;
              
              {ESLVal ms2 = $216;
              
              return subType(t1,flattenAct(l2,t2,ds2,ms2));
            }
            }
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $215 = _v14.termRef(0);
              
              {ESLVal t1 = _v13;
              
              {ESLVal f = $215;
              
              return subType(t1,f.apply());
            }
            }
            }
          case "RecType": {ESLVal $214 = _v14.termRef(0);
              ESLVal $213 = _v14.termRef(1);
              ESLVal $212 = _v14.termRef(2);
              
              {ESLVal t1 = _v13;
              
              {ESLVal l2 = $214;
              
              {ESLVal n2 = $213;
              
              {ESLVal t2 = $212;
              
              return subType(t1,substType(new ESLVal("RecType",l2,n2,t2),n2,t2));
            }
            }
            }
            }
            }
          case "ForallType": {ESLVal $211 = _v14.termRef(0);
              ESLVal $210 = _v14.termRef(1);
              ESLVal $209 = _v14.termRef(2);
              
              {ESLVal t1 = _v13;
              
              {ESLVal l1 = $211;
              
              {ESLVal ns2 = $210;
              
              {ESLVal t2 = $209;
              
              return subType(t1,t2);
            }
            }
            }
            }
            }
          case "ObservedType": {ESLVal $207 = _v14.termRef(0);
              ESLVal $206 = _v14.termRef(1);
              ESLVal $205 = _v14.termRef(2);
              
              switch($205.termName) {
              case "TypeClosure": {ESLVal $208 = $205.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $207;
                
                {ESLVal state = $206;
                
                {ESLVal f = $208;
                
                return subType(t1,new ESLVal("ObservedType",l,state,f.apply()));
              }
              }
              }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal l = $207;
                
                {ESLVal state = $206;
                
                {ESLVal messages = $205;
                
                return subType(t1,expandObservedType(l,state,messages));
              }
              }
              }
              }
            }
            }
          case "ObserverType": {ESLVal $203 = _v14.termRef(0);
              ESLVal $202 = _v14.termRef(1);
              ESLVal $201 = _v14.termRef(2);
              
              switch($201.termName) {
              case "TypeClosure": {ESLVal $204 = $201.termRef(0);
                
                {ESLVal t1 = _v13;
                
                {ESLVal l = $203;
                
                {ESLVal state = $202;
                
                {ESLVal f = $204;
                
                return subType(t1,new ESLVal("ObserverType",l,state,f.apply()));
              }
              }
              }
              }
              }
              default: {ESLVal t1 = _v13;
                
                {ESLVal l = $203;
                
                {ESLVal state = $202;
                
                {ESLVal messages = $201;
                
                return subType(t1,expandObserverType(l,state,messages));
              }
              }
              }
              }
            }
            }
            default: {ESLVal t1 = _v13;
              
              {ESLVal t2 = _v14;
              
              return typeEqual(t1,t2);
            }
            }
          }
        }
        }
  }
  public static ESLVal subType = new ESLVal(new Function(new ESLVal("subType"),null) { public ESLVal apply(ESLVal... args) { return subType(args[0],args[1]); }});
  public static ESLVal expandObserverType(ESLVal l1,ESLVal state,ESLVal messages) {
    
    return new ESLVal("ActType",l1,$nil,ESLVal.list(new ESLVal("MessageType",l1,ESLVal.list(new ESLVal("TermType",l1,new ESLVal("Start"),ESLVal.list(expandObservedType(l1,state,messages),new ESLVal("IntType",l1),state)))),new ESLVal("MessageType",l1,ESLVal.list(new ESLVal("TermType",l1,new ESLVal("Transition"),ESLVal.list(expandObservedType(l1,state,messages),new ESLVal("IntType",l1),messages,state))))));
  }
  public static ESLVal expandObserverType = new ESLVal(new Function(new ESLVal("expandObserverType"),null) { public ESLVal apply(ESLVal... args) { return expandObserverType(args[0],args[1],args[2]); }});
  public static ESLVal maybe(ESLVal t) {
    
    return new ESLVal("UnionType",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("TermType",new ESLVal("Pos",$zero,$zero),new ESLVal("Exactly"),ESLVal.list(t)),new ESLVal("TermType",new ESLVal("Pos",$zero,$zero),new ESLVal("Nothing"),$nil)));
  }
  public static ESLVal maybe = new ESLVal(new Function(new ESLVal("maybe"),null) { public ESLVal apply(ESLVal... args) { return maybe(args[0]); }});
  public static ESLVal expandObservedType(ESLVal l,ESLVal state,ESLVal messages) {
    
    return new ESLVal("ActType",l,ESLVal.list(new ESLVal("Dec",l,new ESLVal("observeState"),new ESLVal("FunType",l,$nil,state),new ESLVal("FunType",l,$nil,state)),new ESLVal("Dec",l,new ESLVal("observeMessage"),new ESLVal("FunType",l,ESLVal.list(new ESLVal("UnionType",l,$nil)),maybe(messages)),new ESLVal("FunType",l,ESLVal.list(new ESLVal("UnionType",l,$nil)),maybe(messages)))),$nil);
  }
  public static ESLVal expandObservedType = new ESLVal(new Function(new ESLVal("expandObservedType"),null) { public ESLVal apply(ESLVal... args) { return expandObservedType(args[0],args[1],args[2]); }});
  public static ESLVal flattenAct(ESLVal l1,ESLVal t,ESLVal ds1,ESLVal ms1) {
    
    {ESLVal _v15 = t;
      
      switch(_v15.termName) {
      case "ActType": {ESLVal $333 = _v15.termRef(0);
        ESLVal $332 = _v15.termRef(1);
        ESLVal $331 = _v15.termRef(2);
        
        {ESLVal l2 = $333;
        
        {ESLVal ds2 = $332;
        
        {ESLVal ms2 = $331;
        
        return new ESLVal("ActType",l1,ds1.add(ds2),ms1.add(ms2));
      }
      }
      }
      }
    case "ExtendedAct": {ESLVal $330 = _v15.termRef(0);
        ESLVal $329 = _v15.termRef(1);
        ESLVal $328 = _v15.termRef(2);
        ESLVal $327 = _v15.termRef(3);
        
        {ESLVal l2 = $330;
        
        {ESLVal _v129 = $329;
        
        {ESLVal ds2 = $328;
        
        {ESLVal ms2 = $327;
        
        return flattenAct(l1,flattenAct(l2,_v129,ds2,ms2),ds1,ms1);
      }
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $326 = _v15.termRef(0);
        
        {ESLVal f = $326;
        
        return flattenAct(l1,f.apply(),ds1,ms1);
      }
      }
    case "RecType": {ESLVal $325 = _v15.termRef(0);
        ESLVal $324 = _v15.termRef(1);
        ESLVal $323 = _v15.termRef(2);
        
        {ESLVal l2 = $325;
        
        {ESLVal n = $324;
        
        {ESLVal b = $323;
        
        return flattenAct(l1,substType(t,n,b),ds1,ms1);
      }
      }
      }
      }
      default: {ESLVal _v130 = _v15;
        
        return error(new ESLVal("TypeError",l1,new ESLVal("unknown type for flatten ").add(_v130)));
      }
    }
    }
  }
  public static ESLVal flattenAct = new ESLVal(new Function(new ESLVal("flattenAct"),null) { public ESLVal apply(ESLVal... args) { return flattenAct(args[0],args[1],args[2],args[3]); }});
  public static ESLVal actEqual(ESLVal exports1,ESLVal exports2,ESLVal handlers1,ESLVal handlers2) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun60"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal d1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun61"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal d2 = $args[0];
            return equalDec(d1,d2);
              }
            }),exports2);
        }
      }),exports1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun62"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal d1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun63"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal d2 = $args[0];
            return equalDec(d1,d2);
              }
            }),exports1);
        }
      }),exports2).and(forall.apply(new ESLVal(new Function(new ESLVal("fun64"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal m1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun65"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m2 = $args[0];
            return equalMessage(m1,m2);
              }
            }),handlers2);
        }
      }),handlers1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun66"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal m1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun67"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m2 = $args[0];
            return equalMessage(m1,m2);
              }
            }),handlers1);
        }
      }),handlers2))));
  }
  public static ESLVal actEqual = new ESLVal(new Function(new ESLVal("actEqual"),null) { public ESLVal apply(ESLVal... args) { return actEqual(args[0],args[1],args[2],args[3]); }});
  public static ESLVal actSubType(ESLVal exports1,ESLVal exports2,ESLVal handlers1,ESLVal handlers2) {
    
    {ESLVal isObservedMessage = new ESLVal(new Function(new ESLVal("isObservedMessage"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        {ESLVal _v16 = d;
              
              switch(_v16.termName) {
              case "Dec": {ESLVal $337 = _v16.termRef(0);
                ESLVal $336 = _v16.termRef(1);
                ESLVal $335 = _v16.termRef(2);
                ESLVal $334 = _v16.termRef(3);
                
                switch($336.strVal) {
                case "observeMessage": {ESLVal l = $337;
                  
                  {ESLVal t1 = $335;
                  
                  {ESLVal t2 = $334;
                  
                  return $true;
                }
                }
                }
                default: {ESLVal _v127 = _v16;
                  
                  return $false;
                }
              }
              }
              default: {ESLVal _v128 = _v16;
                
                return $false;
              }
            }
            }
          }
        });
      
      return forall.apply(new ESLVal(new Function(new ESLVal("fun68"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal d2 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun69"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal d1 = $args[0];
            return decSubType(d1,d2);
              }
            }),reject(isObservedMessage,exports1));
        }
      }),reject(isObservedMessage,exports2)).and(forall.apply(new ESLVal(new Function(new ESLVal("fun70"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal m2 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun71"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m1 = $args[0];
            return messSubType(m1,m2);
              }
            }),handlers1);
        }
      }),handlers2));
    }
  }
  public static ESLVal actSubType = new ESLVal(new Function(new ESLVal("actSubType"),null) { public ESLVal apply(ESLVal... args) { return actSubType(args[0],args[1],args[2],args[3]); }});
  public static ESLVal equalDec(ESLVal d1,ESLVal d2) {
    
    {ESLVal _v17 = d1;
      ESLVal _v18 = d2;
      
      switch(_v17.termName) {
      case "Dec": {ESLVal $341 = _v17.termRef(0);
        ESLVal $340 = _v17.termRef(1);
        ESLVal $339 = _v17.termRef(2);
        ESLVal $338 = _v17.termRef(3);
        
        switch(_v18.termName) {
        case "Dec": {ESLVal $345 = _v18.termRef(0);
          ESLVal $344 = _v18.termRef(1);
          ESLVal $343 = _v18.termRef(2);
          ESLVal $342 = _v18.termRef(3);
          
          {ESLVal l1 = $341;
          
          {ESLVal n1 = $340;
          
          {ESLVal t1 = $339;
          
          {ESLVal st1 = $338;
          
          {ESLVal l2 = $345;
          
          {ESLVal n2 = $344;
          
          {ESLVal t2 = $343;
          
          {ESLVal st2 = $342;
          
          return n1.eql(n2).and(typeEqual(t1,t2));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(23287,23418)").add(ESLVal.list(_v17,_v18)));
      }
      }
      default: return error(new ESLVal("case error at Pos(23287,23418)").add(ESLVal.list(_v17,_v18)));
    }
    }
  }
  public static ESLVal equalDec = new ESLVal(new Function(new ESLVal("equalDec"),null) { public ESLVal apply(ESLVal... args) { return equalDec(args[0],args[1]); }});
  public static ESLVal decSubType(ESLVal d1,ESLVal d2) {
    
    {ESLVal _v19 = d1;
      ESLVal _v20 = d2;
      
      switch(_v19.termName) {
      case "Dec": {ESLVal $349 = _v19.termRef(0);
        ESLVal $348 = _v19.termRef(1);
        ESLVal $347 = _v19.termRef(2);
        ESLVal $346 = _v19.termRef(3);
        
        switch(_v20.termName) {
        case "Dec": {ESLVal $353 = _v20.termRef(0);
          ESLVal $352 = _v20.termRef(1);
          ESLVal $351 = _v20.termRef(2);
          ESLVal $350 = _v20.termRef(3);
          
          {ESLVal l1 = $349;
          
          {ESLVal n1 = $348;
          
          {ESLVal t1 = $347;
          
          {ESLVal st1 = $346;
          
          {ESLVal l2 = $353;
          
          {ESLVal n2 = $352;
          
          {ESLVal t2 = $351;
          
          {ESLVal st2 = $350;
          
          return n1.eql(n2).and(subType(t1,t2));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(23462,23592)").add(ESLVal.list(_v19,_v20)));
      }
      }
      default: return error(new ESLVal("case error at Pos(23462,23592)").add(ESLVal.list(_v19,_v20)));
    }
    }
  }
  public static ESLVal decSubType = new ESLVal(new Function(new ESLVal("decSubType"),null) { public ESLVal apply(ESLVal... args) { return decSubType(args[0],args[1]); }});
  public static ESLVal equalMessage(ESLVal m1,ESLVal m2) {
    
    {ESLVal _v21 = m1;
      ESLVal _v22 = m2;
      
      switch(_v21.termName) {
      case "MessageType": {ESLVal $355 = _v21.termRef(0);
        ESLVal $354 = _v21.termRef(1);
        
        switch(_v22.termName) {
        case "MessageType": {ESLVal $357 = _v22.termRef(0);
          ESLVal $356 = _v22.termRef(1);
          
          {ESLVal l1 = $355;
          
          {ESLVal ts1 = $354;
          
          {ESLVal l2 = $357;
          
          {ESLVal ts2 = $356;
          
          return typesEqual(ts1,ts2);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(23638,23748)").add(ESLVal.list(_v21,_v22)));
      }
      }
      default: return error(new ESLVal("case error at Pos(23638,23748)").add(ESLVal.list(_v21,_v22)));
    }
    }
  }
  public static ESLVal equalMessage = new ESLVal(new Function(new ESLVal("equalMessage"),null) { public ESLVal apply(ESLVal... args) { return equalMessage(args[0],args[1]); }});
  public static ESLVal messSubType(ESLVal m1,ESLVal m2) {
    
    {ESLVal _v23 = m1;
      ESLVal _v24 = m2;
      
      switch(_v23.termName) {
      case "MessageType": {ESLVal $359 = _v23.termRef(0);
        ESLVal $358 = _v23.termRef(1);
        
        switch(_v24.termName) {
        case "MessageType": {ESLVal $361 = _v24.termRef(0);
          ESLVal $360 = _v24.termRef(1);
          
          {ESLVal l1 = $359;
          
          {ESLVal ts1 = $358;
          
          {ESLVal l2 = $361;
          
          {ESLVal ts2 = $360;
          
          return subTypes(ts1,ts2);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(23793,23901)").add(ESLVal.list(_v23,_v24)));
      }
      }
      default: return error(new ESLVal("case error at Pos(23793,23901)").add(ESLVal.list(_v23,_v24)));
    }
    }
  }
  public static ESLVal messSubType = new ESLVal(new Function(new ESLVal("messSubType"),null) { public ESLVal apply(ESLVal... args) { return messSubType(args[0],args[1]); }});
  public static ESLVal recordTypeEqual(ESLVal fields1,ESLVal fields2) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun72"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal t1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun73"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal t2 = $args[0];
            return decName(t1).eql(decName(t2)).and(typeEqual(decType(t1),decType(t2)));
              }
            }),fields2);
        }
      }),fields1).and(forall.apply(new ESLVal(new Function(new ESLVal("fun74"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal t1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun75"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal t2 = $args[0];
            return decName(t1).eql(decName(t2)).and(typeEqual(decType(t1),decType(t2)));
              }
            }),fields1);
        }
      }),fields2));
  }
  public static ESLVal recordTypeEqual = new ESLVal(new Function(new ESLVal("recordTypeEqual"),null) { public ESLVal apply(ESLVal... args) { return recordTypeEqual(args[0],args[1]); }});
  public static ESLVal recordSubType(ESLVal fields1,ESLVal fields2) {
    
    return forall.apply(new ESLVal(new Function(new ESLVal("fun76"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal t2 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun77"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal t1 = $args[0];
            return decName(t1).eql(decName(t2)).and(subType(decType(t1),decType(t2)));
              }
            }),fields1);
        }
      }),fields2);
  }
  public static ESLVal recordSubType = new ESLVal(new Function(new ESLVal("recordSubType"),null) { public ESLVal apply(ESLVal... args) { return recordSubType(args[0],args[1]); }});
  public static ESLVal applyTypeFun(ESLVal l,ESLVal op,ESLVal args) {
    
    {ESLVal _v25 = op;
      
      switch(_v25.termName) {
      case "RecType": {ESLVal $367 = _v25.termRef(0);
        ESLVal $366 = _v25.termRef(1);
        ESLVal $365 = _v25.termRef(2);
        
        {ESLVal lr = $367;
        
        {ESLVal n = $366;
        
        {ESLVal t = $365;
        
        return applyTypeFun(l,unfoldType(lr,n,t),args);
      }
      }
      }
      }
    case "TypeFun": {ESLVal $364 = _v25.termRef(0);
        ESLVal $363 = _v25.termRef(1);
        ESLVal $362 = _v25.termRef(2);
        
        {ESLVal _v125 = $364;
        
        {ESLVal names = $363;
        
        {ESLVal t = $362;
        
        if(length.apply(args).eql(length.apply(names)).boolVal)
        return substTypeEnv(zipTypeEnv(names,args),t);
        else
          return error(new ESLVal("TypeError",_v125,new ESLVal("type fun expects ").add(length.apply(names).add(new ESLVal(" args, but supplied with ").add(length.apply(args))))));
      }
      }
      }
      }
      default: {ESLVal _v126 = _v25;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(_v126)));
      }
    }
    }
  }
  public static ESLVal applyTypeFun = new ESLVal(new Function(new ESLVal("applyTypeFun"),null) { public ESLVal apply(ESLVal... args) { return applyTypeFun(args[0],args[1],args[2]); }});
  public static ESLVal unfoldType(ESLVal l,ESLVal n,ESLVal t) {
    
    return substType(new ESLVal("RecType",l,n,t),n,t);
  }
  public static ESLVal unfoldType = new ESLVal(new Function(new ESLVal("unfoldType"),null) { public ESLVal apply(ESLVal... args) { return unfoldType(args[0],args[1],args[2]); }});
  public static ESLVal forceType(ESLVal t) {
    
    {ESLVal _v26 = t;
      
      switch(_v26.termName) {
      case "TypeClosure": {ESLVal $368 = _v26.termRef(0);
        
        {ESLVal f = $368;
        
        return forceType(f.apply());
      }
      }
      default: {ESLVal _v124 = _v26;
        
        return _v124;
      }
    }
    }
  }
  public static ESLVal forceType = new ESLVal(new Function(new ESLVal("forceType"),null) { public ESLVal apply(ESLVal... args) { return forceType(args[0]); }});
  public static ESLVal typesEqual(ESLVal ts1,ESLVal ts2) {
    
    {ESLVal _v27 = ts1;
      ESLVal _v28 = ts2;
      
      if(_v27.isCons())
      {ESLVal $371 = _v27.head();
        ESLVal $372 = _v27.tail();
        
        if(_v28.isCons())
        {ESLVal $373 = _v28.head();
          ESLVal $374 = _v28.tail();
          
          {ESLVal t1 = $371;
          
          {ESLVal _v117 = $372;
          
          {ESLVal t2 = $373;
          
          {ESLVal _v118 = $374;
          
          return typeEqual(t1,t2).and(typesEqual(_v117,_v118));
        }
        }
        }
        }
        }
      else if(_v28.isNil())
        if(_v28.isCons())
          {ESLVal $369 = _v28.head();
            ESLVal $370 = _v28.tail();
            
            return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
          }
        else if(_v28.isNil())
          {ESLVal _v119 = _v27;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
      else if(_v28.isCons())
          {ESLVal $369 = _v28.head();
            ESLVal $370 = _v28.tail();
            
            return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
          }
        else if(_v28.isNil())
          {ESLVal _v120 = _v27;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
      }
    else if(_v27.isNil())
      if(_v28.isCons())
        {ESLVal $375 = _v28.head();
          ESLVal $376 = _v28.tail();
          
          {ESLVal _v121 = _v28;
          
          return $false;
        }
        }
      else if(_v28.isNil())
        return $true;
      else {ESLVal _v122 = _v28;
          
          return $false;
        }
    else if(_v28.isCons())
        {ESLVal $369 = _v28.head();
          ESLVal $370 = _v28.tail();
          
          return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
        }
      else if(_v28.isNil())
        {ESLVal _v123 = _v27;
          
          return $false;
        }
      else return error(new ESLVal("case error at Pos(25207,25417)").add(ESLVal.list(_v27,_v28)));
    }
  }
  public static ESLVal typesEqual = new ESLVal(new Function(new ESLVal("typesEqual"),null) { public ESLVal apply(ESLVal... args) { return typesEqual(args[0],args[1]); }});
  public static ESLVal subTypes(ESLVal ts1,ESLVal ts2) {
    
    {ESLVal _v29 = ts1;
      ESLVal _v30 = ts2;
      
      if(_v29.isCons())
      {ESLVal $379 = _v29.head();
        ESLVal $380 = _v29.tail();
        
        if(_v30.isCons())
        {ESLVal $381 = _v30.head();
          ESLVal $382 = _v30.tail();
          
          {ESLVal t1 = $379;
          
          {ESLVal _v110 = $380;
          
          {ESLVal t2 = $381;
          
          {ESLVal _v111 = $382;
          
          return subType(t1,t2).and(subTypes(_v110,_v111));
        }
        }
        }
        }
        }
      else if(_v30.isNil())
        if(_v30.isCons())
          {ESLVal $377 = _v30.head();
            ESLVal $378 = _v30.tail();
            
            return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
          }
        else if(_v30.isNil())
          {ESLVal _v112 = _v29;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
      else if(_v30.isCons())
          {ESLVal $377 = _v30.head();
            ESLVal $378 = _v30.tail();
            
            return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
          }
        else if(_v30.isNil())
          {ESLVal _v113 = _v29;
            
            return $false;
          }
        else return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
      }
    else if(_v29.isNil())
      if(_v30.isCons())
        {ESLVal $383 = _v30.head();
          ESLVal $384 = _v30.tail();
          
          {ESLVal _v114 = _v30;
          
          return $false;
        }
        }
      else if(_v30.isNil())
        return $true;
      else {ESLVal _v115 = _v30;
          
          return $false;
        }
    else if(_v30.isCons())
        {ESLVal $377 = _v30.head();
          ESLVal $378 = _v30.tail();
          
          return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
        }
      else if(_v30.isNil())
        {ESLVal _v116 = _v29;
          
          return $false;
        }
      else return error(new ESLVal("case error at Pos(25463,25669)").add(ESLVal.list(_v29,_v30)));
    }
  }
  public static ESLVal subTypes = new ESLVal(new Function(new ESLVal("subTypes"),null) { public ESLVal apply(ESLVal... args) { return subTypes(args[0],args[1]); }});
  public static ESLVal typeSetEqual(ESLVal types1,ESLVal types2) {
    
    return typeSubset(types1,types2).and(typeSubset(types2,types1));
  }
  public static ESLVal typeSetEqual = new ESLVal(new Function(new ESLVal("typeSetEqual"),null) { public ESLVal apply(ESLVal... args) { return typeSetEqual(args[0],args[1]); }});
  public static ESLVal typeSubset(ESLVal sub,ESLVal sup) {
    
    {ESLVal _v31 = sub;
      
      if(_v31.isCons())
      {ESLVal $385 = _v31.head();
        ESLVal $386 = _v31.tail();
        
        {ESLVal t = $385;
        
        {ESLVal _v109 = $386;
        
        return typeMember(t,sup).and(typeSubset(_v109,sup));
      }
      }
      }
    else if(_v31.isNil())
      return $true;
    else return error(new ESLVal("case error at Pos(25829,25935)").add(ESLVal.list(_v31)));
    }
  }
  public static ESLVal typeSubset = new ESLVal(new Function(new ESLVal("typeSubset"),null) { public ESLVal apply(ESLVal... args) { return typeSubset(args[0],args[1]); }});
  public static ESLVal typeMember(ESLVal t,ESLVal types) {
    
    {ESLVal _v32 = types;
      
      if(_v32.isCons())
      {ESLVal $387 = _v32.head();
        ESLVal $388 = _v32.tail();
        
        {ESLVal tt = $387;
        
        {ESLVal _v106 = $388;
        
        if(typeEqual(t,tt).boolVal)
        return $true;
        else
          {ESLVal _v107 = $387;
            
            {ESLVal _v108 = $388;
            
            return typeMember(t,_v108);
          }
          }
      }
      }
      }
    else if(_v32.isNil())
      return $false;
    else return error(new ESLVal("case error at Pos(25981,26128)").add(ESLVal.list(_v32)));
    }
  }
  public static ESLVal typeMember = new ESLVal(new Function(new ESLVal("typeMember"),null) { public ESLVal apply(ESLVal... args) { return typeMember(args[0],args[1]); }});
  public static ESLVal substTypes(ESLVal newType,ESLVal n,ESLVal oldTypes) {
    
    {ESLVal _v33 = oldTypes;
      
      if(_v33.isCons())
      {ESLVal $389 = _v33.head();
        ESLVal $390 = _v33.tail();
        
        {ESLVal t = $389;
        
        {ESLVal ts = $390;
        
        return substTypes(newType,n,ts).cons(substType(newType,n,t));
      }
      }
      }
    else if(_v33.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(26280,26400)").add(ESLVal.list(_v33)));
    }
  }
  public static ESLVal substTypes = new ESLVal(new Function(new ESLVal("substTypes"),null) { public ESLVal apply(ESLVal... args) { return substTypes(args[0],args[1],args[2]); }});
  public static ESLVal substType(ESLVal newType,ESLVal n,ESLVal oldType) {
    
    {ESLVal _v34 = oldType;
      
      switch(_v34.termName) {
      case "ApplyType": {ESLVal $451 = _v34.termRef(0);
        ESLVal $450 = _v34.termRef(1);
        ESLVal $449 = _v34.termRef(2);
        
        {ESLVal l = $451;
        
        {ESLVal m = $450;
        
        {ESLVal types = $449;
        
        if(m.eql(n).boolVal)
        return new ESLVal("ApplyTypeFun",l,newType,substTypes(newType,n,types));
        else
          return new ESLVal("ApplyType",l,m,substTypes(newType,n,types));
      }
      }
      }
      }
    case "ApplyTypeFun": {ESLVal $448 = _v34.termRef(0);
        ESLVal $447 = _v34.termRef(1);
        ESLVal $446 = _v34.termRef(2);
        
        {ESLVal l = $448;
        
        {ESLVal op = $447;
        
        {ESLVal args = $446;
        
        return new ESLVal("ApplyTypeFun",l,substType(newType,n,op),substTypes(newType,n,args));
      }
      }
      }
      }
    case "ActType": {ESLVal $445 = _v34.termRef(0);
        ESLVal $444 = _v34.termRef(1);
        ESLVal $443 = _v34.termRef(2);
        
        {ESLVal l = $445;
        
        {ESLVal decs = $444;
        
        {ESLVal handlers = $443;
        
        return new ESLVal("ActType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(substDec(newType,n,d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(decs),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              $v.add(substMType(newType,n,m));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(handlers));
      }
      }
      }
      }
    case "ArrayType": {ESLVal $442 = _v34.termRef(0);
        ESLVal $441 = _v34.termRef(1);
        
        {ESLVal l = $442;
        
        {ESLVal t = $441;
        
        return new ESLVal("ArrayType",l,substType(newType,n,t));
      }
      }
      }
    case "BoolType": {ESLVal $440 = _v34.termRef(0);
        
        {ESLVal l = $440;
        
        return oldType;
      }
      }
    case "ExtendedAct": {ESLVal $439 = _v34.termRef(0);
        ESLVal $438 = _v34.termRef(1);
        ESLVal $437 = _v34.termRef(2);
        ESLVal $436 = _v34.termRef(3);
        
        {ESLVal l = $439;
        
        {ESLVal parent = $438;
        
        {ESLVal decs = $437;
        
        {ESLVal ms = $436;
        
        return new ESLVal("ExtendedAct",l,substType(newType,n,parent),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(substDec(newType,n,d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(decs),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              $v.add(substMType(newType,n,m));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(ms));
      }
      }
      }
      }
      }
    case "FloatType": {ESLVal $435 = _v34.termRef(0);
        
        {ESLVal l = $435;
        
        return oldType;
      }
      }
    case "ForallType": {ESLVal $434 = _v34.termRef(0);
        ESLVal $433 = _v34.termRef(1);
        ESLVal $432 = _v34.termRef(2);
        
        {ESLVal l = $434;
        
        {ESLVal ns = $433;
        
        {ESLVal t = $432;
        
        if(member.apply(n,ns).boolVal)
        return oldType;
        else
          return new ESLVal("ForallType",l,ns,substType(newType,n,t));
      }
      }
      }
      }
    case "FunType": {ESLVal $431 = _v34.termRef(0);
        ESLVal $430 = _v34.termRef(1);
        ESLVal $429 = _v34.termRef(2);
        
        {ESLVal l = $431;
        
        {ESLVal d = $430;
        
        {ESLVal r = $429;
        
        return new ESLVal("FunType",l,substTypes(newType,n,d),substType(newType,n,r));
      }
      }
      }
      }
    case "IntType": {ESLVal $428 = _v34.termRef(0);
        
        {ESLVal l = $428;
        
        return oldType;
      }
      }
    case "ListType": {ESLVal $427 = _v34.termRef(0);
        ESLVal $426 = _v34.termRef(1);
        
        {ESLVal l = $427;
        
        {ESLVal t = $426;
        
        return new ESLVal("ListType",l,substType(newType,n,t));
      }
      }
      }
    case "NullType": {ESLVal $425 = _v34.termRef(0);
        
        {ESLVal l = $425;
        
        return oldType;
      }
      }
    case "ObserverType": {ESLVal $424 = _v34.termRef(0);
        ESLVal $423 = _v34.termRef(1);
        ESLVal $422 = _v34.termRef(2);
        
        {ESLVal l = $424;
        
        {ESLVal s = $423;
        
        {ESLVal m = $422;
        
        return new ESLVal("ObserverType",l,substType(newType,n,s),substType(newType,n,m));
      }
      }
      }
      }
    case "ObservedType": {ESLVal $421 = _v34.termRef(0);
        ESLVal $420 = _v34.termRef(1);
        ESLVal $419 = _v34.termRef(2);
        
        {ESLVal l = $421;
        
        {ESLVal s = $420;
        
        {ESLVal m = $419;
        
        return new ESLVal("ObservedType",l,substType(newType,n,s),substType(newType,n,m));
      }
      }
      }
      }
    case "RecordType": {ESLVal $418 = _v34.termRef(0);
        ESLVal $417 = _v34.termRef(1);
        
        {ESLVal l = $418;
        
        {ESLVal fs = $417;
        
        return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v35 = $qualArg;
              
              switch(_v35.termName) {
              case "Dec": {ESLVal $455 = _v35.termRef(0);
                ESLVal $454 = _v35.termRef(1);
                ESLVal $453 = _v35.termRef(2);
                ESLVal $452 = _v35.termRef(3);
                
                {ESLVal dl = $455;
                
                {ESLVal _v105 = $454;
                
                {ESLVal t = $453;
                
                {ESLVal dt = $452;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,_v105,substType(newType,_v105,t),dt)));
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v35;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten());
      }
      }
      }
    case "RecType": {ESLVal $416 = _v34.termRef(0);
        ESLVal $415 = _v34.termRef(1);
        ESLVal $414 = _v34.termRef(2);
        
        {ESLVal l = $416;
        
        {ESLVal a = $415;
        
        {ESLVal t = $414;
        
        if(n.eql(a).boolVal)
        return oldType;
        else
          return new ESLVal("RecType",l,a,substType(newType,n,t));
      }
      }
      }
      }
    case "SetType": {ESLVal $413 = _v34.termRef(0);
        ESLVal $412 = _v34.termRef(1);
        
        {ESLVal l = $413;
        
        {ESLVal t = $412;
        
        return new ESLVal("SetType",l,substType(newType,n,t));
      }
      }
      }
    case "StrType": {ESLVal $411 = _v34.termRef(0);
        
        {ESLVal l = $411;
        
        return oldType;
      }
      }
    case "TableType": {ESLVal $410 = _v34.termRef(0);
        ESLVal $409 = _v34.termRef(1);
        ESLVal $408 = _v34.termRef(2);
        
        {ESLVal l = $410;
        
        {ESLVal k = $409;
        
        {ESLVal v = $408;
        
        return new ESLVal("TableType",l,substType(newType,n,k),substType(newType,n,v));
      }
      }
      }
      }
    case "TermType": {ESLVal $407 = _v34.termRef(0);
        ESLVal $406 = _v34.termRef(1);
        ESLVal $405 = _v34.termRef(2);
        
        {ESLVal l = $407;
        
        {ESLVal f = $406;
        
        {ESLVal ts = $405;
        
        return new ESLVal("TermType",l,f,substTypes(newType,n,ts));
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $404 = _v34.termRef(0);
        
        {ESLVal f = $404;
        
        return oldType;
      }
      }
    case "TypeFun": {ESLVal $403 = _v34.termRef(0);
        ESLVal $402 = _v34.termRef(1);
        ESLVal $401 = _v34.termRef(2);
        
        {ESLVal l = $403;
        
        {ESLVal ns = $402;
        
        {ESLVal t = $401;
        
        if(member.apply(n,ns).boolVal)
        return oldType;
        else
          return new ESLVal("TypeFun",l,ns,substType(newType,n,t));
      }
      }
      }
      }
    case "UnfoldType": {ESLVal $400 = _v34.termRef(0);
        ESLVal $399 = _v34.termRef(1);
        
        {ESLVal l = $400;
        
        {ESLVal t = $399;
        
        return new ESLVal("UnfoldType",l,substType(newType,n,t));
      }
      }
      }
    case "UnionType": {ESLVal $398 = _v34.termRef(0);
        ESLVal $397 = _v34.termRef(1);
        
        {ESLVal l = $398;
        
        {ESLVal ts = $397;
        
        return new ESLVal("UnionType",l,substTypes(newType,n,ts));
      }
      }
      }
    case "VarType": {ESLVal $396 = _v34.termRef(0);
        ESLVal $395 = _v34.termRef(1);
        
        {ESLVal l = $396;
        
        {ESLVal name = $395;
        
        if(name.eql(n).boolVal)
        return newType;
        else
          return oldType;
      }
      }
      }
    case "VoidType": {ESLVal $394 = _v34.termRef(0);
        
        {ESLVal l = $394;
        
        return oldType;
      }
      }
    case "UnionRef": {ESLVal $393 = _v34.termRef(0);
        ESLVal $392 = _v34.termRef(1);
        ESLVal $391 = _v34.termRef(2);
        
        {ESLVal l = $393;
        
        {ESLVal t = $392;
        
        {ESLVal name = $391;
        
        return new ESLVal("UnionRef",l,substType(newType,n,t),name);
      }
      }
      }
      }
      default: {ESLVal x = _v34;
        
        return error(x);
      }
    }
    }
  }
  public static ESLVal substType = new ESLVal(new Function(new ESLVal("substType"),null) { public ESLVal apply(ESLVal... args) { return substType(args[0],args[1],args[2]); }});
  public static ESLVal substTypesEnv(ESLVal env,ESLVal types) {
    
    {ESLVal _v36 = types;
      
      if(_v36.isCons())
      {ESLVal $456 = _v36.head();
        ESLVal $457 = _v36.tail();
        
        {ESLVal t = $456;
        
        {ESLVal ts = $457;
        
        return substTypesEnv(env,ts).cons(substTypeEnv(env,t));
      }
      }
      }
    else if(_v36.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(29096,29207)").add(ESLVal.list(_v36)));
    }
  }
  public static ESLVal substTypesEnv = new ESLVal(new Function(new ESLVal("substTypesEnv"),null) { public ESLVal apply(ESLVal... args) { return substTypesEnv(args[0],args[1]); }});
  public static ESLVal substTypeEnv(ESLVal env,ESLVal oldType) {
    
    {ESLVal _v37 = oldType;
      
      switch(_v37.termName) {
      case "ApplyType": {ESLVal $527 = _v37.termRef(0);
        ESLVal $526 = _v37.termRef(1);
        ESLVal $525 = _v37.termRef(2);
        
        {ESLVal l = $527;
        
        {ESLVal n = $526;
        
        {ESLVal types = $525;
        
        {ESLVal op = lookupType(n,env);
        
        if(op.eql($null).boolVal)
        return new ESLVal("ApplyType",l,n,substTypesEnv(env,types));
        else
          return new ESLVal("ApplyTypeFun",l,op,substTypesEnv(env,types));
      }
      }
      }
      }
      }
    case "ApplyTypeFun": {ESLVal $524 = _v37.termRef(0);
        ESLVal $523 = _v37.termRef(1);
        ESLVal $522 = _v37.termRef(2);
        
        {ESLVal l = $524;
        
        {ESLVal op = $523;
        
        {ESLVal args = $522;
        
        return new ESLVal("ApplyTypeFun",l,substTypeEnv(env,op),substTypesEnv(env,args));
      }
      }
      }
      }
    case "ActType": {ESLVal $521 = _v37.termRef(0);
        ESLVal $520 = _v37.termRef(1);
        ESLVal $519 = _v37.termRef(2);
        
        {ESLVal l = $521;
        
        {ESLVal decs = $520;
        
        {ESLVal handlers = $519;
        
        return new ESLVal("ActType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(substDecEnv(env,d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(decs),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              $v.add(substMTypeEnv(env,m));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(handlers));
      }
      }
      }
      }
    case "ExtendedAct": {ESLVal $518 = _v37.termRef(0);
        ESLVal $517 = _v37.termRef(1);
        ESLVal $516 = _v37.termRef(2);
        ESLVal $515 = _v37.termRef(3);
        
        {ESLVal l = $518;
        
        {ESLVal parent = $517;
        
        {ESLVal decs = $516;
        
        {ESLVal handlers = $515;
        
        return new ESLVal("ExtendedAct",l,substTypeEnv(env,parent),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(substDecEnv(env,d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(decs),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal m = $l0.head();
              $l0 = $l0.tail();
              $v.add(substMTypeEnv(env,m));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(handlers));
      }
      }
      }
      }
      }
    case "ArrayType": {ESLVal $514 = _v37.termRef(0);
        ESLVal $513 = _v37.termRef(1);
        
        {ESLVal l = $514;
        
        {ESLVal t = $513;
        
        return new ESLVal("ArrayType",l,substTypeEnv(env,t));
      }
      }
      }
    case "BoolType": {ESLVal $512 = _v37.termRef(0);
        
        {ESLVal l = $512;
        
        return oldType;
      }
      }
    case "FloatType": {ESLVal $511 = _v37.termRef(0);
        
        {ESLVal l = $511;
        
        return oldType;
      }
      }
    case "ForallType": {ESLVal $510 = _v37.termRef(0);
        ESLVal $509 = _v37.termRef(1);
        ESLVal $508 = _v37.termRef(2);
        
        {ESLVal l = $510;
        
        {ESLVal ns = $509;
        
        {ESLVal t = $508;
        
        return new ESLVal("ForallType",l,ns,substTypeEnv(removeFromDom(env,ns),t));
      }
      }
      }
      }
    case "FieldType": {ESLVal $507 = _v37.termRef(0);
        ESLVal $506 = _v37.termRef(1);
        ESLVal $505 = _v37.termRef(2);
        
        {ESLVal l = $507;
        
        {ESLVal n = $506;
        
        {ESLVal t = $505;
        
        return new ESLVal("FieldType",l,n,substTypeEnv(env,t));
      }
      }
      }
      }
    case "FunType": {ESLVal $504 = _v37.termRef(0);
        ESLVal $503 = _v37.termRef(1);
        ESLVal $502 = _v37.termRef(2);
        
        {ESLVal l = $504;
        
        {ESLVal d = $503;
        
        {ESLVal r = $502;
        
        return new ESLVal("FunType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substTypeEnv(env,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(d),substTypeEnv(env,r));
      }
      }
      }
      }
    case "TaggedFunType": {ESLVal $501 = _v37.termRef(0);
        ESLVal $500 = _v37.termRef(1);
        ESLVal $499 = _v37.termRef(2);
        ESLVal $498 = _v37.termRef(3);
        
        {ESLVal l = $501;
        
        {ESLVal d = $500;
        
        {ESLVal p = $499;
        
        {ESLVal r = $498;
        
        return new ESLVal("FunType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substTypeEnv(env,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(d),substTypeEnv(env,r));
      }
      }
      }
      }
      }
    case "IntType": {ESLVal $497 = _v37.termRef(0);
        
        {ESLVal l = $497;
        
        return oldType;
      }
      }
    case "ListType": {ESLVal $496 = _v37.termRef(0);
        ESLVal $495 = _v37.termRef(1);
        
        {ESLVal l = $496;
        
        {ESLVal t = $495;
        
        return new ESLVal("ListType",l,substTypeEnv(env,t));
      }
      }
      }
    case "SetType": {ESLVal $494 = _v37.termRef(0);
        ESLVal $493 = _v37.termRef(1);
        
        {ESLVal l = $494;
        
        {ESLVal t = $493;
        
        return new ESLVal("SetType",l,substTypeEnv(env,t));
      }
      }
      }
    case "BagType": {ESLVal $492 = _v37.termRef(0);
        ESLVal $491 = _v37.termRef(1);
        
        {ESLVal l = $492;
        
        {ESLVal t = $491;
        
        return new ESLVal("BagType",l,substTypeEnv(env,t));
      }
      }
      }
    case "NullType": {ESLVal $490 = _v37.termRef(0);
        
        {ESLVal l = $490;
        
        return oldType;
      }
      }
    case "ObserverType": {ESLVal $489 = _v37.termRef(0);
        ESLVal $488 = _v37.termRef(1);
        ESLVal $487 = _v37.termRef(2);
        
        {ESLVal l = $489;
        
        {ESLVal s = $488;
        
        {ESLVal m = $487;
        
        return new ESLVal("ObserverType",l,substTypeEnv(env,s),substTypeEnv(env,m));
      }
      }
      }
      }
    case "ObservedType": {ESLVal $486 = _v37.termRef(0);
        ESLVal $485 = _v37.termRef(1);
        ESLVal $484 = _v37.termRef(2);
        
        {ESLVal l = $486;
        
        {ESLVal s = $485;
        
        {ESLVal m = $484;
        
        return new ESLVal("ObservedType",l,substTypeEnv(env,s),substTypeEnv(env,m));
      }
      }
      }
      }
    case "RecType": {ESLVal $483 = _v37.termRef(0);
        ESLVal $482 = _v37.termRef(1);
        ESLVal $481 = _v37.termRef(2);
        
        {ESLVal l = $483;
        
        {ESLVal a = $482;
        
        {ESLVal t = $481;
        
        return new ESLVal("RecType",l,a,substTypeEnv(removeFromDom(env,ESLVal.list(a)),t));
      }
      }
      }
      }
    case "RecordType": {ESLVal $480 = _v37.termRef(0);
        ESLVal $479 = _v37.termRef(1);
        
        {ESLVal l = $480;
        
        {ESLVal fs = $479;
        
        return new ESLVal("RecordType",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v38 = $qualArg;
              
              switch(_v38.termName) {
              case "Dec": {ESLVal $531 = _v38.termRef(0);
                ESLVal $530 = _v38.termRef(1);
                ESLVal $529 = _v38.termRef(2);
                ESLVal $528 = _v38.termRef(3);
                
                {ESLVal dl = $531;
                
                {ESLVal n = $530;
                
                {ESLVal t = $529;
                
                {ESLVal dt = $528;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Dec",dl,n,substTypeEnv(env,t),dt)));
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v38;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten());
      }
      }
      }
    case "StrType": {ESLVal $478 = _v37.termRef(0);
        
        {ESLVal l = $478;
        
        return oldType;
      }
      }
    case "TableType": {ESLVal $477 = _v37.termRef(0);
        ESLVal $476 = _v37.termRef(1);
        ESLVal $475 = _v37.termRef(2);
        
        {ESLVal l = $477;
        
        {ESLVal k = $476;
        
        {ESLVal v = $475;
        
        return new ESLVal("TableType",l,substTypeEnv(env,k),substTypeEnv(env,v));
      }
      }
      }
      }
    case "TermType": {ESLVal $474 = _v37.termRef(0);
        ESLVal $473 = _v37.termRef(1);
        ESLVal $472 = _v37.termRef(2);
        
        {ESLVal l = $474;
        
        {ESLVal f = $473;
        
        {ESLVal ts = $472;
        
        return new ESLVal("TermType",l,f,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substTypeEnv(env,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(ts));
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $471 = _v37.termRef(0);
        
        {ESLVal f = $471;
        
        return oldType;
      }
      }
    case "TypeFun": {ESLVal $470 = _v37.termRef(0);
        ESLVal $469 = _v37.termRef(1);
        ESLVal $468 = _v37.termRef(2);
        
        {ESLVal l = $470;
        
        {ESLVal ns = $469;
        
        {ESLVal t = $468;
        
        return new ESLVal("TypeFun",l,ns,substTypeEnv(removeFromDom(env,ns),t));
      }
      }
      }
      }
    case "UnfoldType": {ESLVal $467 = _v37.termRef(0);
        ESLVal $466 = _v37.termRef(1);
        
        {ESLVal l = $467;
        
        {ESLVal t = $466;
        
        return new ESLVal("UnfoldType",l,substTypeEnv(env,t));
      }
      }
      }
    case "UnionType": {ESLVal $465 = _v37.termRef(0);
        ESLVal $464 = _v37.termRef(1);
        
        {ESLVal l = $465;
        
        {ESLVal ts = $464;
        
        return new ESLVal("UnionType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substTypeEnv(env,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(ts));
      }
      }
      }
    case "VarType": {ESLVal $463 = _v37.termRef(0);
        ESLVal $462 = _v37.termRef(1);
        
        {ESLVal l = $463;
        
        {ESLVal name = $462;
        
        if(member.apply(name,typeEnvDom(env)).boolVal)
        return lookupType(name,env);
        else
          return oldType;
      }
      }
      }
    case "VoidType": {ESLVal $461 = _v37.termRef(0);
        
        {ESLVal l = $461;
        
        return oldType;
      }
      }
    case "UnionRef": {ESLVal $460 = _v37.termRef(0);
        ESLVal $459 = _v37.termRef(1);
        ESLVal $458 = _v37.termRef(2);
        
        {ESLVal l = $460;
        
        {ESLVal t = $459;
        
        {ESLVal name = $458;
        
        return new ESLVal("UnionRef",l,substTypeEnv(env,t),name);
      }
      }
      }
      }
      default: {ESLVal x = _v37;
        
        return error(new ESLVal("substTypeEnv: ").add(oldType));
      }
    }
    }
  }
  public static ESLVal substTypeEnv = new ESLVal(new Function(new ESLVal("substTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return substTypeEnv(args[0],args[1]); }});
  public static ESLVal zipTypeEnv(ESLVal ns,ESLVal ts) {
    
    {ESLVal _v39 = ns;
      ESLVal _v40 = ts;
      
      if(_v39.isCons())
      {ESLVal $532 = _v39.head();
        ESLVal $533 = _v39.tail();
        
        if(_v40.isCons())
        {ESLVal $534 = _v40.head();
          ESLVal $535 = _v40.tail();
          
          {ESLVal n = $532;
          
          {ESLVal _v103 = $533;
          
          {ESLVal t = $534;
          
          {ESLVal _v104 = $535;
          
          return zipTypeEnv(_v103,_v104).cons(new ESLVal("Map",n,t));
        }
        }
        }
        }
        }
      else if(_v40.isNil())
        return error(new ESLVal("case error at Pos(32143,32264)").add(ESLVal.list(_v39,_v40)));
      else return error(new ESLVal("case error at Pos(32143,32264)").add(ESLVal.list(_v39,_v40)));
      }
    else if(_v39.isNil())
      if(_v40.isCons())
        {ESLVal $536 = _v40.head();
          ESLVal $537 = _v40.tail();
          
          return error(new ESLVal("case error at Pos(32143,32264)").add(ESLVal.list(_v39,_v40)));
        }
      else if(_v40.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(32143,32264)").add(ESLVal.list(_v39,_v40)));
    else return error(new ESLVal("case error at Pos(32143,32264)").add(ESLVal.list(_v39,_v40)));
    }
  }
  public static ESLVal zipTypeEnv = new ESLVal(new Function(new ESLVal("zipTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return zipTypeEnv(args[0],args[1]); }});
  public static ESLVal lookupType(ESLVal name,ESLVal env) {
    
    {ESLVal _v41 = env;
      
      if(_v41.isCons())
      {ESLVal $538 = _v41.head();
        ESLVal $539 = _v41.tail();
        
        switch($538.termName) {
        case "Map": {ESLVal $541 = $538.termRef(0);
          ESLVal $540 = $538.termRef(1);
          
          {ESLVal n = $541;
          
          {ESLVal t = $540;
          
          {ESLVal e = $539;
          
          if(n.eql(name).boolVal)
          return t;
          else
            {ESLVal m = $538;
              
              {ESLVal _v102 = $539;
              
              return lookupType(name,_v102);
            }
            }
        }
        }
        }
        }
        default: {ESLVal m = $538;
          
          {ESLVal e = $539;
          
          return lookupType(name,e);
        }
        }
      }
      }
    else if(_v41.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(32310,32447)").add(ESLVal.list(_v41)));
    }
  }
  public static ESLVal lookupType = new ESLVal(new Function(new ESLVal("lookupType"),null) { public ESLVal apply(ESLVal... args) { return lookupType(args[0],args[1]); }});
  public static ESLVal typeEnvDom(ESLVal e) {
    
    {ESLVal _v42 = e;
      
      if(_v42.isCons())
      {ESLVal $542 = _v42.head();
        ESLVal $543 = _v42.tail();
        
        switch($542.termName) {
        case "Map": {ESLVal $545 = $542.termRef(0);
          ESLVal $544 = $542.termRef(1);
          
          {ESLVal n = $545;
          
          {ESLVal t = $544;
          
          {ESLVal x = $543;
          
          return typeEnvDom(x).cons(n);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(32482,32571)").add(ESLVal.list(_v42)));
      }
      }
    else if(_v42.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(32482,32571)").add(ESLVal.list(_v42)));
    }
  }
  public static ESLVal typeEnvDom = new ESLVal(new Function(new ESLVal("typeEnvDom"),null) { public ESLVal apply(ESLVal... args) { return typeEnvDom(args[0]); }});
  public static ESLVal removeFromDom(ESLVal e,ESLVal ns) {
    
    {ESLVal _v43 = e;
      
      if(_v43.isCons())
      {ESLVal $546 = _v43.head();
        ESLVal $547 = _v43.tail();
        
        switch($546.termName) {
        case "Map": {ESLVal $549 = $546.termRef(0);
          ESLVal $548 = $546.termRef(1);
          
          {ESLVal n = $549;
          
          {ESLVal t = $548;
          
          {ESLVal _v98 = $547;
          
          if(member.apply(n,ns).boolVal)
          return removeFromDom(_v98,ns);
          else
            {ESLVal _v99 = $549;
              
              {ESLVal _v100 = $548;
              
              {ESLVal _v101 = $547;
              
              return removeFromDom(_v101,ns).cons(new ESLVal("Map",_v99,_v100));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(32618,32800)").add(ESLVal.list(_v43)));
      }
      }
    else if(_v43.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(32618,32800)").add(ESLVal.list(_v43)));
    }
  }
  public static ESLVal removeFromDom = new ESLVal(new Function(new ESLVal("removeFromDom"),null) { public ESLVal apply(ESLVal... args) { return removeFromDom(args[0],args[1]); }});
  public static ESLVal restrictTypeEnv(ESLVal e,ESLVal ns) {
    
    {ESLVal _v44 = e;
      
      if(_v44.isCons())
      {ESLVal $550 = _v44.head();
        ESLVal $551 = _v44.tail();
        
        switch($550.termName) {
        case "Map": {ESLVal $553 = $550.termRef(0);
          ESLVal $552 = $550.termRef(1);
          
          {ESLVal n = $553;
          
          {ESLVal t = $552;
          
          {ESLVal _v94 = $551;
          
          if(member.apply(n,ns).not().boolVal)
          return restrictTypeEnv(_v94,ns);
          else
            {ESLVal _v95 = $553;
              
              {ESLVal _v96 = $552;
              
              {ESLVal _v97 = $551;
              
              return restrictTypeEnv(_v97,ns).cons(new ESLVal("Map",_v95,_v96));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(32849,33040)").add(ESLVal.list(_v44)));
      }
      }
    else if(_v44.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(32849,33040)").add(ESLVal.list(_v44)));
    }
  }
  public static ESLVal restrictTypeEnv = new ESLVal(new Function(new ESLVal("restrictTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return restrictTypeEnv(args[0],args[1]); }});
  public static ESLVal typeEnvRan(ESLVal e) {
    
    {ESLVal _v45 = e;
      
      if(_v45.isCons())
      {ESLVal $554 = _v45.head();
        ESLVal $555 = _v45.tail();
        
        switch($554.termName) {
        case "Map": {ESLVal $557 = $554.termRef(0);
          ESLVal $556 = $554.termRef(1);
          
          {ESLVal n = $557;
          
          {ESLVal t = $556;
          
          {ESLVal x = $555;
          
          return typeEnvRan(x).cons(t);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(33076,33167)").add(ESLVal.list(_v45)));
      }
      }
    else if(_v45.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(33076,33167)").add(ESLVal.list(_v45)));
    }
  }
  public static ESLVal typeEnvRan = new ESLVal(new Function(new ESLVal("typeEnvRan"),null) { public ESLVal apply(ESLVal... args) { return typeEnvRan(args[0]); }});
  public static ESLVal allEqualTypes(ESLVal t1,ESLVal ts) {
    
    {ESLVal _v46 = ts;
      
      if(_v46.isCons())
      {ESLVal $558 = _v46.head();
        ESLVal $559 = _v46.tail();
        
        {ESLVal t2 = $558;
        
        {ESLVal _v91 = $559;
        
        if(typeEqual(t1,t2).boolVal)
        return allEqualTypes(t1,_v91);
        else
          {ESLVal _v92 = _v46;
            
            return $false;
          }
      }
      }
      }
    else if(_v46.isNil())
      return $true;
    else {ESLVal _v93 = _v46;
        
        return $false;
      }
    }
  }
  public static ESLVal allEqualTypes = new ESLVal(new Function(new ESLVal("allEqualTypes"),null) { public ESLVal apply(ESLVal... args) { return allEqualTypes(args[0],args[1]); }});
  public static ESLVal substDec(ESLVal newType,ESLVal n,ESLVal d) {
    
    {ESLVal _v47 = d;
      
      switch(_v47.termName) {
      case "Dec": {ESLVal $563 = _v47.termRef(0);
        ESLVal $562 = _v47.termRef(1);
        ESLVal $561 = _v47.termRef(2);
        ESLVal $560 = _v47.termRef(3);
        
        {ESLVal l = $563;
        
        {ESLVal name = $562;
        
        {ESLVal t = $561;
        
        {ESLVal st = $560;
        
        return new ESLVal("Dec",l,name,substType(newType,n,t),st);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(33400,33497)").add(ESLVal.list(_v47)));
    }
    }
  }
  public static ESLVal substDec = new ESLVal(new Function(new ESLVal("substDec"),null) { public ESLVal apply(ESLVal... args) { return substDec(args[0],args[1],args[2]); }});
  public static ESLVal substDecEnv(ESLVal env,ESLVal d) {
    
    {ESLVal _v48 = d;
      
      switch(_v48.termName) {
      case "Dec": {ESLVal $567 = _v48.termRef(0);
        ESLVal $566 = _v48.termRef(1);
        ESLVal $565 = _v48.termRef(2);
        ESLVal $564 = _v48.termRef(3);
        
        {ESLVal l = $567;
        
        {ESLVal name = $566;
        
        {ESLVal t = $565;
        
        {ESLVal st = $564;
        
        return new ESLVal("Dec",l,name,substTypeEnv(env,t),st);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(33542,33636)").add(ESLVal.list(_v48)));
    }
    }
  }
  public static ESLVal substDecEnv = new ESLVal(new Function(new ESLVal("substDecEnv"),null) { public ESLVal apply(ESLVal... args) { return substDecEnv(args[0],args[1]); }});
  public static ESLVal substMType(ESLVal newType,ESLVal n,ESLVal m) {
    
    {ESLVal _v49 = m;
      
      switch(_v49.termName) {
      case "MessageType": {ESLVal $569 = _v49.termRef(0);
        ESLVal $568 = _v49.termRef(1);
        
        {ESLVal l = $569;
        
        {ESLVal ts = $568;
        
        return new ESLVal("MessageType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substType(newType,n,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(ts));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(33696,33804)").add(ESLVal.list(_v49)));
    }
    }
  }
  public static ESLVal substMType = new ESLVal(new Function(new ESLVal("substMType"),null) { public ESLVal apply(ESLVal... args) { return substMType(args[0],args[1],args[2]); }});
  public static ESLVal substMTypeEnv(ESLVal env,ESLVal m) {
    
    {ESLVal _v50 = m;
      
      switch(_v50.termName) {
      case "MessageType": {ESLVal $571 = _v50.termRef(0);
        ESLVal $570 = _v50.termRef(1);
        
        {ESLVal l = $571;
        
        {ESLVal ts = $570;
        
        return new ESLVal("MessageType",l,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal t = $l0.head();
              $l0 = $l0.tail();
              $v.add(substTypeEnv(env,t));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(ts));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(33856,33961)").add(ESLVal.list(_v50)));
    }
    }
  }
  public static ESLVal substMTypeEnv = new ESLVal(new Function(new ESLVal("substMTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return substMTypeEnv(args[0],args[1]); }});
  public static ESLVal patternNames(ESLVal x) {
    
    {ESLVal _v51 = x;
      
      switch(_v51.termName) {
      case "PAdd": {ESLVal $603 = _v51.termRef(0);
        ESLVal $602 = _v51.termRef(1);
        ESLVal $601 = _v51.termRef(2);
        
        {ESLVal l = $603;
        
        {ESLVal p1 = $602;
        
        {ESLVal p2 = $601;
        
        return patternNames(p1).add(patternNames(p2));
      }
      }
      }
      }
    case "PVar": {ESLVal $600 = _v51.termRef(0);
        ESLVal $599 = _v51.termRef(1);
        ESLVal $598 = _v51.termRef(2);
        
        {ESLVal v0 = $600;
        
        {ESLVal v1 = $599;
        
        {ESLVal v2 = $598;
        
        return ESLVal.list(v1);
      }
      }
      }
      }
    case "PTerm": {ESLVal $597 = _v51.termRef(0);
        ESLVal $596 = _v51.termRef(1);
        ESLVal $595 = _v51.termRef(2);
        ESLVal $594 = _v51.termRef(3);
        
        {ESLVal v0 = $597;
        
        {ESLVal v1 = $596;
        
        {ESLVal v2 = $595;
        
        {ESLVal v3 = $594;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal p = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = patternNames(p);
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
    case "PApplyType": {ESLVal $593 = _v51.termRef(0);
        ESLVal $592 = _v51.termRef(1);
        ESLVal $591 = _v51.termRef(2);
        
        {ESLVal v0 = $593;
        
        {ESLVal v1 = $592;
        
        {ESLVal v2 = $591;
        
        return patternNames(v1);
      }
      }
      }
      }
    case "PNil": {ESLVal $590 = _v51.termRef(0);
        
        {ESLVal v0 = $590;
        
        return $nil;
      }
      }
    case "PNull": {ESLVal $589 = _v51.termRef(0);
        
        {ESLVal v0 = $589;
        
        return $nil;
      }
      }
    case "PInt": {ESLVal $588 = _v51.termRef(0);
        ESLVal $587 = _v51.termRef(1);
        
        {ESLVal v0 = $588;
        
        {ESLVal v1 = $587;
        
        return $nil;
      }
      }
      }
    case "PStr": {ESLVal $586 = _v51.termRef(0);
        ESLVal $585 = _v51.termRef(1);
        
        {ESLVal v0 = $586;
        
        {ESLVal v1 = $585;
        
        return $nil;
      }
      }
      }
    case "PBool": {ESLVal $584 = _v51.termRef(0);
        ESLVal $583 = _v51.termRef(1);
        
        {ESLVal v0 = $584;
        
        {ESLVal v1 = $583;
        
        return $nil;
      }
      }
      }
    case "PCons": {ESLVal $582 = _v51.termRef(0);
        ESLVal $581 = _v51.termRef(1);
        ESLVal $580 = _v51.termRef(2);
        
        {ESLVal v0 = $582;
        
        {ESLVal v1 = $581;
        
        {ESLVal v2 = $580;
        
        return patternNames(v1).add(patternNames(v2));
      }
      }
      }
      }
    case "PBagCons": {ESLVal $579 = _v51.termRef(0);
        ESLVal $578 = _v51.termRef(1);
        ESLVal $577 = _v51.termRef(2);
        
        {ESLVal v0 = $579;
        
        {ESLVal v1 = $578;
        
        {ESLVal v2 = $577;
        
        return patternNames(v1).add(patternNames(v2));
      }
      }
      }
      }
    case "PEmptyBag": {ESLVal $576 = _v51.termRef(0);
        
        {ESLVal v0 = $576;
        
        return $nil;
      }
      }
    case "PSetCons": {ESLVal $575 = _v51.termRef(0);
        ESLVal $574 = _v51.termRef(1);
        ESLVal $573 = _v51.termRef(2);
        
        {ESLVal v0 = $575;
        
        {ESLVal v1 = $574;
        
        {ESLVal v2 = $573;
        
        return patternNames(v1).add(patternNames(v2));
      }
      }
      }
      }
    case "PEmptySet": {ESLVal $572 = _v51.termRef(0);
        
        {ESLVal v0 = $572;
        
        return $nil;
      }
      }
      default: return error(new ESLVal("case error at Pos(34835,35615)").add(ESLVal.list(_v51)));
    }
    }
  }
  public static ESLVal patternNames = new ESLVal(new Function(new ESLVal("patternNames"),null) { public ESLVal apply(ESLVal... args) { return patternNames(args[0]); }});
  public static ESLVal patternLoc(ESLVal x) {
    
    {ESLVal _v52 = x;
      
      switch(_v52.termName) {
      case "PAdd": {ESLVal $635 = _v52.termRef(0);
        ESLVal $634 = _v52.termRef(1);
        ESLVal $633 = _v52.termRef(2);
        
        {ESLVal l = $635;
        
        {ESLVal p1 = $634;
        
        {ESLVal p2 = $633;
        
        return l;
      }
      }
      }
      }
    case "PVar": {ESLVal $632 = _v52.termRef(0);
        ESLVal $631 = _v52.termRef(1);
        ESLVal $630 = _v52.termRef(2);
        
        {ESLVal l = $632;
        
        {ESLVal v1 = $631;
        
        {ESLVal v2 = $630;
        
        return l;
      }
      }
      }
      }
    case "PTerm": {ESLVal $629 = _v52.termRef(0);
        ESLVal $628 = _v52.termRef(1);
        ESLVal $627 = _v52.termRef(2);
        ESLVal $626 = _v52.termRef(3);
        
        {ESLVal l = $629;
        
        {ESLVal v1 = $628;
        
        {ESLVal v2 = $627;
        
        {ESLVal v3 = $626;
        
        return l;
      }
      }
      }
      }
      }
    case "PApplyType": {ESLVal $625 = _v52.termRef(0);
        ESLVal $624 = _v52.termRef(1);
        ESLVal $623 = _v52.termRef(2);
        
        {ESLVal l = $625;
        
        {ESLVal v1 = $624;
        
        {ESLVal v2 = $623;
        
        return l;
      }
      }
      }
      }
    case "PNil": {ESLVal $622 = _v52.termRef(0);
        
        {ESLVal l = $622;
        
        return l;
      }
      }
    case "PNull": {ESLVal $621 = _v52.termRef(0);
        
        {ESLVal l = $621;
        
        return l;
      }
      }
    case "PInt": {ESLVal $620 = _v52.termRef(0);
        ESLVal $619 = _v52.termRef(1);
        
        {ESLVal l = $620;
        
        {ESLVal v1 = $619;
        
        return l;
      }
      }
      }
    case "PStr": {ESLVal $618 = _v52.termRef(0);
        ESLVal $617 = _v52.termRef(1);
        
        {ESLVal l = $618;
        
        {ESLVal v1 = $617;
        
        return l;
      }
      }
      }
    case "PBool": {ESLVal $616 = _v52.termRef(0);
        ESLVal $615 = _v52.termRef(1);
        
        {ESLVal l = $616;
        
        {ESLVal v1 = $615;
        
        return l;
      }
      }
      }
    case "PCons": {ESLVal $614 = _v52.termRef(0);
        ESLVal $613 = _v52.termRef(1);
        ESLVal $612 = _v52.termRef(2);
        
        {ESLVal l = $614;
        
        {ESLVal v1 = $613;
        
        {ESLVal v2 = $612;
        
        return l;
      }
      }
      }
      }
    case "PBagCons": {ESLVal $611 = _v52.termRef(0);
        ESLVal $610 = _v52.termRef(1);
        ESLVal $609 = _v52.termRef(2);
        
        {ESLVal l = $611;
        
        {ESLVal v1 = $610;
        
        {ESLVal v2 = $609;
        
        return l;
      }
      }
      }
      }
    case "PEmptyBag": {ESLVal $608 = _v52.termRef(0);
        
        {ESLVal l = $608;
        
        return l;
      }
      }
    case "PSetCons": {ESLVal $607 = _v52.termRef(0);
        ESLVal $606 = _v52.termRef(1);
        ESLVal $605 = _v52.termRef(2);
        
        {ESLVal l = $607;
        
        {ESLVal v1 = $606;
        
        {ESLVal v2 = $605;
        
        return l;
      }
      }
      }
      }
    case "PEmptySet": {ESLVal $604 = _v52.termRef(0);
        
        {ESLVal l = $604;
        
        return l;
      }
      }
      default: return error(new ESLVal("case error at Pos(35653,36209)").add(ESLVal.list(_v52)));
    }
    }
  }
  public static ESLVal patternLoc = new ESLVal(new Function(new ESLVal("patternLoc"),null) { public ESLVal apply(ESLVal... args) { return patternLoc(args[0]); }});
  public static ESLVal mergeFunDefs(ESLVal defs) {
    
    { LetRec letrec = new LetRec() {
      ESLVal getFunCases = new ESLVal(new Function(new ESLVal("getFunCases"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v83 = $args[0];
        ESLVal _v84 = $args[1];
        {ESLVal _v53 = _v84;
              
              if(_v53.isCons())
              {ESLVal $636 = _v53.head();
                ESLVal $637 = _v53.tail();
                
                switch($636.termName) {
                case "FunBind": {ESLVal $644 = $636.termRef(0);
                  ESLVal $643 = $636.termRef(1);
                  ESLVal $642 = $636.termRef(2);
                  ESLVal $641 = $636.termRef(3);
                  ESLVal $640 = $636.termRef(4);
                  ESLVal $639 = $636.termRef(5);
                  ESLVal $638 = $636.termRef(6);
                  
                  {ESLVal l = $644;
                  
                  {ESLVal n0 = $643;
                  
                  {ESLVal args = $642;
                  
                  {ESLVal t = $641;
                  
                  {ESLVal dt = $640;
                  
                  {ESLVal e = $639;
                  
                  {ESLVal g = $638;
                  
                  {ESLVal _v85 = $637;
                  
                  if(_v83.eql(n0).boolVal)
                  return getFunCases.apply(_v83,_v85).cons(new ESLVal("FunCase",l,args,t,g,e));
                  else
                    {ESLVal def = $636;
                      
                      {ESLVal _v86 = $637;
                      
                      return getFunCases.apply(_v83,_v86);
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
                default: {ESLVal def = $636;
                  
                  {ESLVal _v87 = $637;
                  
                  return getFunCases.apply(_v83,_v87);
                }
                }
              }
              }
            else if(_v53.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(36588,36765)").add(ESLVal.list(_v53)));
            }
          }
        });
      ESLVal removeFunCases = new ESLVal(new Function(new ESLVal("removeFunCases"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v78 = $args[0];
        ESLVal _v79 = $args[1];
        {ESLVal _v54 = _v79;
              
              if(_v54.isCons())
              {ESLVal $645 = _v54.head();
                ESLVal $646 = _v54.tail();
                
                switch($645.termName) {
                case "FunBind": {ESLVal $653 = $645.termRef(0);
                  ESLVal $652 = $645.termRef(1);
                  ESLVal $651 = $645.termRef(2);
                  ESLVal $650 = $645.termRef(3);
                  ESLVal $649 = $645.termRef(4);
                  ESLVal $648 = $645.termRef(5);
                  ESLVal $647 = $645.termRef(6);
                  
                  {ESLVal l = $653;
                  
                  {ESLVal n0 = $652;
                  
                  {ESLVal args = $651;
                  
                  {ESLVal t = $650;
                  
                  {ESLVal dt = $649;
                  
                  {ESLVal e = $648;
                  
                  {ESLVal g = $647;
                  
                  {ESLVal _v80 = $646;
                  
                  if(_v78.eql(n0).boolVal)
                  return removeFunCases.apply(_v78,_v80);
                  else
                    {ESLVal def = $645;
                      
                      {ESLVal _v81 = $646;
                      
                      return removeFunCases.apply(_v78,_v81).cons(def);
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
                default: {ESLVal def = $645;
                  
                  {ESLVal _v82 = $646;
                  
                  return removeFunCases.apply(_v78,_v82).cons(def);
                }
                }
              }
              }
            else if(_v54.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(36824,36989)").add(ESLVal.list(_v54)));
            }
          }
        });
      ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        {ESLVal _v55 = p;
              
              switch(_v55.termName) {
              case "PVar": {ESLVal $656 = _v55.termRef(0);
                ESLVal $655 = _v55.termRef(1);
                ESLVal $654 = _v55.termRef(2);
                
                {ESLVal l = $656;
                
                {ESLVal v = $655;
                
                {ESLVal t = $654;
                
                return $true;
              }
              }
              }
              }
              default: {ESLVal _v77 = _v55;
                
                return $false;
              }
            }
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "getFunCases": return getFunCases;
          
          case "removeFunCases": return removeFunCases;
          
          case "isPVar": return isPVar;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal getFunCases = letrec.get("getFunCases");
    
    ESLVal removeFunCases = letrec.get("removeFunCases");
    
    ESLVal isPVar = letrec.get("isPVar");
    
      {ESLVal _v56 = defs;
      
      if(_v56.isCons())
      {ESLVal $657 = _v56.head();
        ESLVal $658 = _v56.tail();
        
        switch($657.termName) {
        case "FunBind": {ESLVal $665 = $657.termRef(0);
          ESLVal $664 = $657.termRef(1);
          ESLVal $663 = $657.termRef(2);
          ESLVal $662 = $657.termRef(3);
          ESLVal $661 = $657.termRef(4);
          ESLVal $660 = $657.termRef(5);
          ESLVal $659 = $657.termRef(6);
          
          {ESLVal l = $665;
          
          {ESLVal n = $664;
          
          {ESLVal args = $663;
          
          {ESLVal t = $662;
          
          {ESLVal dt = $661;
          
          {ESLVal e = $660;
          
          {ESLVal g = $659;
          
          {ESLVal _v88 = $658;
          
          {ESLVal cases = getFunCases.apply(n,_v88);
          
          if(cases.eql($nil).and(forall.apply(isPVar,args)).boolVal)
          return mergeFunDefs(_v88).cons(new ESLVal("FunBind",l,n,args,t,dt,e,g));
          else
            {ESLVal _v89 = removeFunCases.apply(n,_v88);
              
              return mergeFunDefs(_v89).cons(new ESLVal("FunBinds",n,cases.cons(new ESLVal("FunCase",l,args,t,g,e))));
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
        default: {ESLVal def = $657;
          
          {ESLVal _v90 = $658;
          
          return mergeFunDefs(_v90).cons(def);
        }
        }
      }
      }
    else if(_v56.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(37077,37561)").add(ESLVal.list(_v56)));
    }}
    
  }
  public static ESLVal mergeFunDefs = new ESLVal(new Function(new ESLVal("mergeFunDefs"),null) { public ESLVal apply(ESLVal... args) { return mergeFunDefs(args[0]); }});
  public static ESLVal expandFunDefs(ESLVal defs) {
    
    {ESLVal _v57 = defs;
      
      if(_v57.isCons())
      {ESLVal $666 = _v57.head();
        ESLVal $667 = _v57.tail();
        
        switch($666.termName) {
        case "FunBinds": {ESLVal $669 = $666.termRef(0);
          ESLVal $668 = $666.termRef(1);
          
          if($668.isCons())
          {ESLVal $670 = $668.head();
            ESLVal $671 = $668.tail();
            
            switch($670.termName) {
            case "FunCase": {ESLVal $676 = $670.termRef(0);
              ESLVal $675 = $670.termRef(1);
              ESLVal $674 = $670.termRef(2);
              ESLVal $673 = $670.termRef(3);
              ESLVal $672 = $670.termRef(4);
              
              {ESLVal n = $669;
              
              {ESLVal l = $676;
              
              {ESLVal args = $675;
              
              {ESLVal t = $674;
              
              {ESLVal g = $673;
              
              {ESLVal e = $672;
              
              {ESLVal cases = $671;
              
              {ESLVal _v67 = $667;
              
              {ESLVal names = new SerializableFunction<ESLVal,ESLVal>() {
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
              
              return expandFunDefs(_v67).cons(new ESLVal("Binding",l,n,t,t,new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),new SerializableFunction<ESLVal,ESLVal>() {
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
                }}.apply(names),t,new ESLVal("Case",l,$nil,new SerializableFunction<ESLVal,ESLVal>() {
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
              {ESLVal _v58 = $qualArg;
                    
                    switch(_v58.termName) {
                    case "FunCase": {ESLVal $681 = _v58.termRef(0);
                      ESLVal $680 = _v58.termRef(1);
                      ESLVal $679 = _v58.termRef(2);
                      ESLVal $678 = _v58.termRef(3);
                      ESLVal $677 = _v58.termRef(4);
                      
                      {ESLVal _v68 = $681;
                      
                      {ESLVal _v69 = $680;
                      
                      {ESLVal _v70 = $679;
                      
                      {ESLVal _v71 = $678;
                      
                      {ESLVal _v72 = $677;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("BArm",_v68,_v69,_v71,_v72)));
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v58;
                      
                      return $nil;
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
            default: {ESLVal d = $666;
              
              {ESLVal _v73 = $667;
              
              return expandFunDefs(_v73).cons(d);
            }
            }
          }
          }
        else if($668.isNil())
          {ESLVal d = $666;
            
            {ESLVal _v74 = $667;
            
            return expandFunDefs(_v74).cons(d);
          }
          }
        else {ESLVal d = $666;
            
            {ESLVal _v75 = $667;
            
            return expandFunDefs(_v75).cons(d);
          }
          }
        }
        default: {ESLVal d = $666;
          
          {ESLVal _v76 = $667;
          
          return expandFunDefs(_v76).cons(d);
        }
        }
      }
      }
    else if(_v57.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(37609,38065)").add(ESLVal.list(_v57)));
    }
  }
  public static ESLVal expandFunDefs = new ESLVal(new Function(new ESLVal("expandFunDefs"),null) { public ESLVal apply(ESLVal... args) { return expandFunDefs(args[0]); }});
  public static ESLVal isBinding(ESLVal b) {
    
    {ESLVal _v59 = b;
      
      switch(_v59.termName) {
      case "Binding": {ESLVal $686 = _v59.termRef(0);
        ESLVal $685 = _v59.termRef(1);
        ESLVal $684 = _v59.termRef(2);
        ESLVal $683 = _v59.termRef(3);
        ESLVal $682 = _v59.termRef(4);
        
        {ESLVal l = $686;
        
        {ESLVal n = $685;
        
        {ESLVal t = $684;
        
        {ESLVal st = $683;
        
        {ESLVal e = $682;
        
        return $true;
      }
      }
      }
      }
      }
      }
      default: {ESLVal _v66 = _v59;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isBinding = new ESLVal(new Function(new ESLVal("isBinding"),null) { public ESLVal apply(ESLVal... args) { return isBinding(args[0]); }});
  public static ESLVal isFunBind(ESLVal b) {
    
    {ESLVal _v60 = b;
      
      switch(_v60.termName) {
      case "FunBind": {ESLVal $693 = _v60.termRef(0);
        ESLVal $692 = _v60.termRef(1);
        ESLVal $691 = _v60.termRef(2);
        ESLVal $690 = _v60.termRef(3);
        ESLVal $689 = _v60.termRef(4);
        ESLVal $688 = _v60.termRef(5);
        ESLVal $687 = _v60.termRef(6);
        
        {ESLVal l = $693;
        
        {ESLVal n = $692;
        
        {ESLVal args = $691;
        
        {ESLVal t = $690;
        
        {ESLVal st = $689;
        
        {ESLVal g = $688;
        
        {ESLVal e = $687;
        
        return $true;
      }
      }
      }
      }
      }
      }
      }
      }
      default: {ESLVal _v65 = _v60;
        
        return $false;
      }
    }
    }
  }
  public static ESLVal isFunBind = new ESLVal(new Function(new ESLVal("isFunBind"),null) { public ESLVal apply(ESLVal... args) { return isFunBind(args[0]); }});
  public static ESLVal bindingName(ESLVal b) {
    
    {ESLVal _v61 = b;
      
      switch(_v61.termName) {
      case "TypeBind": {ESLVal $719 = _v61.termRef(0);
        ESLVal $718 = _v61.termRef(1);
        ESLVal $717 = _v61.termRef(2);
        ESLVal $716 = _v61.termRef(3);
        
        {ESLVal v0 = $719;
        
        {ESLVal v1 = $718;
        
        {ESLVal v2 = $717;
        
        {ESLVal v3 = $716;
        
        return v1;
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $715 = _v61.termRef(0);
        ESLVal $714 = _v61.termRef(1);
        ESLVal $713 = _v61.termRef(2);
        ESLVal $712 = _v61.termRef(3);
        
        {ESLVal v0 = $715;
        
        {ESLVal v1 = $714;
        
        {ESLVal v2 = $713;
        
        {ESLVal v3 = $712;
        
        return v1;
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $711 = _v61.termRef(0);
        ESLVal $710 = _v61.termRef(1);
        ESLVal $709 = _v61.termRef(2);
        ESLVal $708 = _v61.termRef(3);
        ESLVal $707 = _v61.termRef(4);
        ESLVal $706 = _v61.termRef(5);
        ESLVal $705 = _v61.termRef(6);
        
        {ESLVal v0 = $711;
        
        {ESLVal v1 = $710;
        
        {ESLVal v2 = $709;
        
        {ESLVal v3 = $708;
        
        {ESLVal v4 = $707;
        
        {ESLVal v5 = $706;
        
        {ESLVal v6 = $705;
        
        return v1;
      }
      }
      }
      }
      }
      }
      }
      }
    case "FunBinds": {ESLVal $704 = _v61.termRef(0);
        ESLVal $703 = _v61.termRef(1);
        
        {ESLVal n = $704;
        
        {ESLVal cases = $703;
        
        return n;
      }
      }
      }
    case "Binding": {ESLVal $702 = _v61.termRef(0);
        ESLVal $701 = _v61.termRef(1);
        ESLVal $700 = _v61.termRef(2);
        ESLVal $699 = _v61.termRef(3);
        ESLVal $698 = _v61.termRef(4);
        
        {ESLVal v0 = $702;
        
        {ESLVal v1 = $701;
        
        {ESLVal v2 = $700;
        
        {ESLVal v3 = $699;
        
        {ESLVal v4 = $698;
        
        return v1;
      }
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $697 = _v61.termRef(0);
        ESLVal $696 = _v61.termRef(1);
        ESLVal $695 = _v61.termRef(2);
        ESLVal $694 = _v61.termRef(3);
        
        {ESLVal v0 = $697;
        
        {ESLVal v1 = $696;
        
        {ESLVal v2 = $695;
        
        {ESLVal v3 = $694;
        
        return v1;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(38375,38724)").add(ESLVal.list(_v61)));
    }
    }
  }
  public static ESLVal bindingName = new ESLVal(new Function(new ESLVal("bindingName"),null) { public ESLVal apply(ESLVal... args) { return bindingName(args[0]); }});
  public static ESLVal bindingLoc(ESLVal b) {
    
    {ESLVal _v62 = b;
      
      switch(_v62.termName) {
      case "TypeBind": {ESLVal $752 = _v62.termRef(0);
        ESLVal $751 = _v62.termRef(1);
        ESLVal $750 = _v62.termRef(2);
        ESLVal $749 = _v62.termRef(3);
        
        {ESLVal v0 = $752;
        
        {ESLVal v1 = $751;
        
        {ESLVal v2 = $750;
        
        {ESLVal v3 = $749;
        
        return v0;
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $748 = _v62.termRef(0);
        ESLVal $747 = _v62.termRef(1);
        ESLVal $746 = _v62.termRef(2);
        ESLVal $745 = _v62.termRef(3);
        
        {ESLVal v0 = $748;
        
        {ESLVal v1 = $747;
        
        {ESLVal v2 = $746;
        
        {ESLVal v3 = $745;
        
        return v0;
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $744 = _v62.termRef(0);
        ESLVal $743 = _v62.termRef(1);
        ESLVal $742 = _v62.termRef(2);
        ESLVal $741 = _v62.termRef(3);
        ESLVal $740 = _v62.termRef(4);
        ESLVal $739 = _v62.termRef(5);
        ESLVal $738 = _v62.termRef(6);
        
        {ESLVal v0 = $744;
        
        {ESLVal v1 = $743;
        
        {ESLVal v2 = $742;
        
        {ESLVal v3 = $741;
        
        {ESLVal v4 = $740;
        
        {ESLVal v5 = $739;
        
        {ESLVal v6 = $738;
        
        return v0;
      }
      }
      }
      }
      }
      }
      }
      }
    case "FunBinds": {ESLVal $730 = _v62.termRef(0);
        ESLVal $729 = _v62.termRef(1);
        
        if($729.isCons())
        {ESLVal $731 = $729.head();
          ESLVal $732 = $729.tail();
          
          switch($731.termName) {
          case "FunCase": {ESLVal $737 = $731.termRef(0);
            ESLVal $736 = $731.termRef(1);
            ESLVal $735 = $731.termRef(2);
            ESLVal $734 = $731.termRef(3);
            ESLVal $733 = $731.termRef(4);
            
            {ESLVal n = $730;
            
            {ESLVal l = $737;
            
            {ESLVal args = $736;
            
            {ESLVal t = $735;
            
            {ESLVal g = $734;
            
            {ESLVal e = $733;
            
            {ESLVal cases = $732;
            
            return l;
          }
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(38756,39127)").add(ESLVal.list(_v62)));
        }
        }
      else if($729.isNil())
        return error(new ESLVal("case error at Pos(38756,39127)").add(ESLVal.list(_v62)));
      else return error(new ESLVal("case error at Pos(38756,39127)").add(ESLVal.list(_v62)));
      }
    case "Binding": {ESLVal $728 = _v62.termRef(0);
        ESLVal $727 = _v62.termRef(1);
        ESLVal $726 = _v62.termRef(2);
        ESLVal $725 = _v62.termRef(3);
        ESLVal $724 = _v62.termRef(4);
        
        {ESLVal v0 = $728;
        
        {ESLVal v1 = $727;
        
        {ESLVal v2 = $726;
        
        {ESLVal v3 = $725;
        
        {ESLVal v4 = $724;
        
        return v0;
      }
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $723 = _v62.termRef(0);
        ESLVal $722 = _v62.termRef(1);
        ESLVal $721 = _v62.termRef(2);
        ESLVal $720 = _v62.termRef(3);
        
        {ESLVal v0 = $723;
        
        {ESLVal v1 = $722;
        
        {ESLVal v2 = $721;
        
        {ESLVal v3 = $720;
        
        return v0;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(38756,39127)").add(ESLVal.list(_v62)));
    }
    }
  }
  public static ESLVal bindingLoc = new ESLVal(new Function(new ESLVal("bindingLoc"),null) { public ESLVal apply(ESLVal... args) { return bindingLoc(args[0]); }});
  public static ESLVal moduleExportedMethodNames(ESLVal module) {
    
    {ESLVal _v63 = module;
      
      switch(_v63.termName) {
      case "Module": {ESLVal $759 = _v63.termRef(0);
        ESLVal $758 = _v63.termRef(1);
        ESLVal $757 = _v63.termRef(2);
        ESLVal $756 = _v63.termRef(3);
        ESLVal $755 = _v63.termRef(4);
        ESLVal $754 = _v63.termRef(5);
        ESLVal $753 = _v63.termRef(6);
        
        {ESLVal path = $759;
        
        {ESLVal name = $758;
        
        {ESLVal exports = $757;
        
        {ESLVal imports = $756;
        
        {ESLVal x = $755;
        
        {ESLVal y = $754;
        
        {ESLVal defs = $753;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              if(isFunBind(b).boolVal) {if(member.apply(bindingName(b),exports).boolVal) {$v.add(bindingName(b));
        }
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs);
      }
      }
      }
      }
      }
      }
      }
      }
      default: {ESLVal _v64 = _v63;
        
        return $nil;
      }
    }
    }
  }
  public static ESLVal moduleExportedMethodNames = new ESLVal(new Function(new ESLVal("moduleExportedMethodNames"),null) { public ESLVal apply(ESLVal... args) { return moduleExportedMethodNames(args[0]); }});
public static void main(String[] args) {
  }
}