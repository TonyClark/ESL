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
  {ESLVal _v1 = d;
        
        switch(_v1.termName) {
        case "Binding": {ESLVal $14 = _v1.termRef(0);
          ESLVal $13 = _v1.termRef(1);
          ESLVal $12 = _v1.termRef(2);
          ESLVal $11 = _v1.termRef(3);
          ESLVal $10 = _v1.termRef(4);
          
          {ESLVal l = $14;
          
          {ESLVal n = $13;
          
          {ESLVal t = $12;
          
          {ESLVal st = $11;
          
          {ESLVal e = $10;
          
          return new ESLVal("JField",n,$null,expToJExp.apply(e));
        }
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $7 = _v1.termRef(0);
          ESLVal $6 = _v1.termRef(1);
          ESLVal $5 = _v1.termRef(2);
          ESLVal $4 = _v1.termRef(3);
          ESLVal $3 = _v1.termRef(4);
          ESLVal $2 = _v1.termRef(5);
          ESLVal $1 = _v1.termRef(6);
          
          switch($1.termName) {
          case "BoolExp": {ESLVal $9 = $1.termRef(0);
            ESLVal $8 = $1.termRef(1);
            
            switch($8.boolVal ? 1 : 0) {
            case 1: {ESLVal l = $7;
              
              {ESLVal n = $6;
              
              {ESLVal args = $5;
              
              {ESLVal t = $4;
              
              {ESLVal st = $3;
              
              {ESLVal e = $2;
              
              {ESLVal bl = $9;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v2 = $qualArg;
                      
                      switch(_v2.termName) {
                      case "PVar": {ESLVal $17 = _v2.termRef(0);
                        ESLVal $16 = _v2.termRef(1);
                        ESLVal $15 = _v2.termRef(2);
                        
                        {ESLVal _v140 = $17;
                        
                        {ESLVal _v141 = $16;
                        
                        {ESLVal _v142 = $15;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v140,_v141,_v142,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v2;
                        
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
            default: {ESLVal l = $7;
              
              {ESLVal n = $6;
              
              {ESLVal args = $5;
              
              {ESLVal t = $4;
              
              {ESLVal st = $3;
              
              {ESLVal e = $2;
              
              {ESLVal g = $1;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v3 = $qualArg;
                      
                      switch(_v3.termName) {
                      case "PVar": {ESLVal $20 = _v3.termRef(0);
                        ESLVal $19 = _v3.termRef(1);
                        ESLVal $18 = _v3.termRef(2);
                        
                        {ESLVal _v143 = $20;
                        
                        {ESLVal _v144 = $19;
                        
                        {ESLVal _v145 = $18;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v143,_v144,_v145,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v3;
                        
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
          default: {ESLVal l = $7;
            
            {ESLVal n = $6;
            
            {ESLVal args = $5;
            
            {ESLVal t = $4;
            
            {ESLVal st = $3;
            
            {ESLVal e = $2;
            
            {ESLVal g = $1;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v4 = $qualArg;
                    
                    switch(_v4.termName) {
                    case "PVar": {ESLVal $23 = _v4.termRef(0);
                      ESLVal $22 = _v4.termRef(1);
                      ESLVal $21 = _v4.termRef(2);
                      
                      {ESLVal _v146 = $23;
                      
                      {ESLVal _v147 = $22;
                      
                      {ESLVal _v148 = $21;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v146,_v147,_v148,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v4;
                      
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
        default: return error(new ESLVal("case error at Pos(172,825)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v5 = d;
        
        switch(_v5.termName) {
        case "Dec": {ESLVal $27 = _v5.termRef(0);
          ESLVal $26 = _v5.termRef(1);
          ESLVal $25 = _v5.termRef(2);
          ESLVal $24 = _v5.termRef(3);
          
          {ESLVal l = $27;
          
          {ESLVal n = $26;
          
          {ESLVal t = $25;
          
          {ESLVal st = $24;
          
          return new ESLVal("JDec",n,$null);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(869,945)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cs = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v6 = cs;
        
        if(_v6.isCons())
        {ESLVal $28 = _v6.head();
          ESLVal $29 = _v6.tail();
          
          if($29.isCons())
          {ESLVal $30 = $29.head();
            ESLVal $31 = $29.tail();
            
            {ESLVal c = $28;
            
            {ESLVal _v138 = $29;
            
            return expsToJCommands.apply(_v138,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
          }
        else if($29.isNil())
          {ESLVal c = $28;
            
            return ESLVal.list(expToJCommand.apply(c,isLast));
          }
        else {ESLVal c = $28;
            
            {ESLVal _v139 = $29;
            
            return expsToJCommands.apply(_v139,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
        }
      else if(_v6.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1004,1164)").add(ESLVal.list(_v6)));
      }
    }
  });
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v7 = c;
        
        switch(_v7.termName) {
        case "Block": {ESLVal $77 = _v7.termRef(0);
          ESLVal $76 = _v7.termRef(1);
          
          if($76.isCons())
          {ESLVal $78 = $76.head();
            ESLVal $79 = $76.tail();
            
            if($79.isCons())
            {ESLVal $80 = $79.head();
              ESLVal $81 = $79.tail();
              
              {ESLVal l = $77;
              
              {ESLVal es = $76;
              
              return new ESLVal("JBlock",new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal e = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(expToJCommand.apply(e,$false));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
            }
          else if($79.isNil())
            {ESLVal l = $77;
              
              {ESLVal e = $78;
              
              return expToJCommand.apply(e,isLast);
            }
            }
          else {ESLVal l = $77;
              
              {ESLVal es = $76;
              
              return new ESLVal("JBlock",new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal e = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(expToJCommand.apply(e,$false));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
          }
        else if($76.isNil())
          {ESLVal l = $77;
            
            if(isLast.boolVal)
            return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
            else
              {ESLVal _v136 = $77;
                
                return new ESLVal("JBlock",$nil);
              }
          }
        else {ESLVal l = $77;
            
            {ESLVal es = $76;
            
            return new ESLVal("JBlock",new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(expToJCommand.apply(e,$false));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(butlast.apply(es)).add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
          }
          }
        }
      case "Update": {ESLVal $75 = _v7.termRef(0);
          ESLVal $74 = _v7.termRef(1);
          ESLVal $73 = _v7.termRef(2);
          
          {ESLVal l = $75;
          
          {ESLVal n = $74;
          
          {ESLVal e = $73;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp.apply(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v133 = $75;
              
              {ESLVal _v134 = $74;
              
              {ESLVal _v135 = $73;
              
              return new ESLVal("JUpdate",_v134,expToJExp.apply(_v135));
            }
            }
            }
        }
        }
        }
        }
      case "If": {ESLVal $72 = _v7.termRef(0);
          ESLVal $71 = _v7.termRef(1);
          ESLVal $70 = _v7.termRef(2);
          ESLVal $69 = _v7.termRef(3);
          
          {ESLVal l = $72;
          
          {ESLVal e1 = $71;
          
          {ESLVal e2 = $70;
          
          {ESLVal e3 = $69;
          
          return new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,isLast),expToJCommand.apply(e3,isLast));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $68 = _v7.termRef(0);
          ESLVal $67 = _v7.termRef(1);
          ESLVal $66 = _v7.termRef(2);
          ESLVal $65 = _v7.termRef(3);
          ESLVal $64 = _v7.termRef(4);
          
          {ESLVal l = $68;
          
          {ESLVal e = $67;
          
          {ESLVal cons = $66;
          
          {ESLVal nil = $65;
          
          {ESLVal alt = $64;
          
          return new ESLVal("JCaseList",expToJExp.apply(e),expToJCommand.apply(cons,isLast),expToJCommand.apply(nil,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $63 = _v7.termRef(0);
          ESLVal $62 = _v7.termRef(1);
          ESLVal $61 = _v7.termRef(2);
          ESLVal $60 = _v7.termRef(3);
          
          {ESLVal l = $63;
          
          {ESLVal e = $62;
          
          {ESLVal arms = $61;
          
          {ESLVal alt = $60;
          
          return new ESLVal("JCaseTerm",expToJExp.apply(e),termArmsToJTermArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $59 = _v7.termRef(0);
          ESLVal $58 = _v7.termRef(1);
          ESLVal $57 = _v7.termRef(2);
          ESLVal $56 = _v7.termRef(3);
          
          {ESLVal l = $59;
          
          {ESLVal e = $58;
          
          {ESLVal arms = $57;
          
          {ESLVal alt = $56;
          
          return new ESLVal("JCaseInt",expToJExp.apply(e),intArmsToJIntArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $55 = _v7.termRef(0);
          ESLVal $54 = _v7.termRef(1);
          ESLVal $53 = _v7.termRef(2);
          ESLVal $52 = _v7.termRef(3);
          
          {ESLVal l = $55;
          
          {ESLVal e = $54;
          
          {ESLVal arms = $53;
          
          {ESLVal alt = $52;
          
          return new ESLVal("JCaseStr",expToJExp.apply(e),strArmsToJStrArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $51 = _v7.termRef(0);
          ESLVal $50 = _v7.termRef(1);
          ESLVal $49 = _v7.termRef(2);
          ESLVal $48 = _v7.termRef(3);
          
          {ESLVal l = $51;
          
          {ESLVal e = $50;
          
          {ESLVal arms = $49;
          
          {ESLVal alt = $48;
          
          return new ESLVal("JCaseBool",expToJExp.apply(e),boolArmsToJBoolArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $47 = _v7.termRef(0);
          ESLVal $46 = _v7.termRef(1);
          ESLVal $45 = _v7.termRef(2);
          
          {ESLVal l = $47;
          
          {ESLVal bs = $46;
          
          {ESLVal e = $45;
          
          return new ESLVal("JLet",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(defToField.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
      case "Letrec": {ESLVal $44 = _v7.termRef(0);
          ESLVal $43 = _v7.termRef(1);
          ESLVal $42 = _v7.termRef(2);
          
          {ESLVal l = $44;
          
          {ESLVal bs = $43;
          
          {ESLVal e = $42;
          
          return new ESLVal("JLetRec",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(defToField.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),expToJCommand.apply(e,$true));
        }
        }
        }
        }
      case "For": {ESLVal $38 = _v7.termRef(0);
          ESLVal $37 = _v7.termRef(1);
          ESLVal $36 = _v7.termRef(2);
          ESLVal $35 = _v7.termRef(3);
          
          switch($37.termName) {
          case "PVar": {ESLVal $41 = $37.termRef(0);
            ESLVal $40 = $37.termRef(1);
            ESLVal $39 = $37.termRef(2);
            
            {ESLVal l1 = $38;
            
            {ESLVal l2 = $41;
            
            {ESLVal n = $40;
            
            {ESLVal t = $39;
            
            {ESLVal e = $36;
            
            {ESLVal b = $35;
            
            if(isLast.boolVal)
            return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName.apply(),n,expToJExp.apply(e),expToJCommand.apply(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
            else
              {ESLVal _v127 = $38;
                
                {ESLVal _v128 = $41;
                
                {ESLVal _v129 = $40;
                
                {ESLVal _v130 = $39;
                
                {ESLVal _v131 = $36;
                
                {ESLVal _v132 = $35;
                
                return new ESLVal("JFor",newName.apply(),_v129,expToJExp.apply(_v131),expToJCommand.apply(_v132,$false));
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
          default: {ESLVal l = $38;
            
            {ESLVal p = $37;
            
            {ESLVal e = $36;
            
            {ESLVal b = $35;
            
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
      case "PLet": {ESLVal $34 = _v7.termRef(0);
          ESLVal $33 = _v7.termRef(1);
          ESLVal $32 = _v7.termRef(2);
          
          {ESLVal l = $34;
          
          {ESLVal bs = $33;
          
          {ESLVal e = $32;
          
          return new ESLVal("JPLet",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal b = $l0.head();
                $l0 = $l0.tail();
                $v.add(defToField.apply(b));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(bs),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
        default: {ESLVal e = _v7;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",expToJExp.apply(e));
          else
            {ESLVal _v137 = _v7;
              
              return new ESLVal("JStatement",expToJExp.apply(_v137));
            }
        }
      }
      }
    }
  });
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal es = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun222"),getSelf()) {
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
  {ESLVal _v8 = arms;
        
        if(_v8.isCons())
        {ESLVal $82 = _v8.head();
          ESLVal $83 = _v8.tail();
          
          switch($82.termName) {
          case "TArm": {ESLVal $85 = $82.termRef(0);
            ESLVal $84 = $82.termRef(1);
            
            {ESLVal n = $85;
            
            {ESLVal e = $84;
            
            {ESLVal _v126 = $83;
            
            return termArmsToJTermArms.apply(_v126,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4499,4668)").add(ESLVal.list(_v8)));
        }
        }
      else if(_v8.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4499,4668)").add(ESLVal.list(_v8)));
      }
    }
  });
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v9 = arms;
        
        if(_v9.isCons())
        {ESLVal $86 = _v9.head();
          ESLVal $87 = _v9.tail();
          
          switch($86.termName) {
          case "IArm": {ESLVal $89 = $86.termRef(0);
            ESLVal $88 = $86.termRef(1);
            
            {ESLVal n = $89;
            
            {ESLVal e = $88;
            
            {ESLVal _v125 = $87;
            
            return intArmsToJIntArms.apply(_v125,isLast).cons(new ESLVal("JIArm",n,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4737,4901)").add(ESLVal.list(_v9)));
        }
        }
      else if(_v9.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4737,4901)").add(ESLVal.list(_v9)));
      }
    }
  });
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v10 = arms;
        
        if(_v10.isCons())
        {ESLVal $90 = _v10.head();
          ESLVal $91 = _v10.tail();
          
          switch($90.termName) {
          case "SArm": {ESLVal $93 = $90.termRef(0);
            ESLVal $92 = $90.termRef(1);
            
            {ESLVal s = $93;
            
            {ESLVal e = $92;
            
            {ESLVal _v124 = $91;
            
            return strArmsToJStrArms.apply(_v124,isLast).cons(new ESLVal("JSArm",s,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4970,5134)").add(ESLVal.list(_v10)));
        }
        }
      else if(_v10.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4970,5134)").add(ESLVal.list(_v10)));
      }
    }
  });
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v11 = arms;
        
        if(_v11.isCons())
        {ESLVal $94 = _v11.head();
          ESLVal $95 = _v11.tail();
          
          switch($94.termName) {
          case "BoolArm": {ESLVal $97 = $94.termRef(0);
            ESLVal $96 = $94.termRef(1);
            
            {ESLVal b = $97;
            
            {ESLVal e = $96;
            
            {ESLVal _v123 = $95;
            
            return boolArmsToJBoolArms.apply(_v123,isLast).cons(new ESLVal("JBArm",b,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5209,5382)").add(ESLVal.list(_v11)));
        }
        }
      else if(_v11.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5209,5382)").add(ESLVal.list(_v11)));
      }
    }
  });
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal op = $args[0];
  {ESLVal _v12 = op;
        
        switch(_v12.strVal) {
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
        default: return error(new ESLVal("case error at Pos(5410,5779)").add(ESLVal.list(_v12)));
      }
      }
    }
  });
  private static ESLVal caseToJExp = new ESLVal(new Function(new ESLVal("caseToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  {ESLVal bindings = new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(new ESLVal("Binding",l,newName.apply(),$null,$null,e));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es);
        
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v13 = $qualArg;
                
                switch(_v13.termName) {
                case "Binding": {ESLVal $102 = _v13.termRef(0);
                  ESLVal $101 = _v13.termRef(1);
                  ESLVal $100 = _v13.termRef(2);
                  ESLVal $99 = _v13.termRef(3);
                  ESLVal $98 = _v13.termRef(4);
                  
                  {ESLVal _v122 = $102;
                  
                  {ESLVal n = $101;
                  
                  {ESLVal dt = $100;
                  
                  {ESLVal t = $99;
                  
                  {ESLVal e = $98;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v13;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bindings).flatten().flatten();
        
        return expToJExp.apply(new ESLVal("Let",l,bindings,translateCases.apply(new ESLVal("Case",l,ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
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
          }}.apply(names),arms))));
      }
      }
    }
  });
  private static ESLVal expToJExp = new ESLVal(new Function(new ESLVal("expToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v14 = e;
        
        switch(_v14.termName) {
        case "Apply": {ESLVal $283 = _v14.termRef(0);
          ESLVal $282 = _v14.termRef(1);
          ESLVal $281 = _v14.termRef(2);
          
          {ESLVal l = $283;
          
          {ESLVal op = $282;
          
          {ESLVal args = $281;
          
          return new ESLVal("JApply",expToJExp.apply(op),expsToJExps.apply(args));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $280 = _v14.termRef(0);
          ESLVal $279 = _v14.termRef(1);
          ESLVal $278 = _v14.termRef(2);
          ESLVal $277 = _v14.termRef(3);
          
          {ESLVal l = $280;
          
          {ESLVal a = $279;
          
          {ESLVal i = $278;
          
          {ESLVal v = $277;
          
          return new ESLVal("JArrayUpdate",expToJExp.apply(a),expToJExp.apply(i),expToJExp.apply(v));
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $276 = _v14.termRef(0);
          ESLVal $275 = _v14.termRef(1);
          ESLVal $274 = _v14.termRef(2);
          
          {ESLVal l = $276;
          
          {ESLVal a = $275;
          
          {ESLVal i = $274;
          
          return new ESLVal("JArrayRef",expToJExp.apply(a),expToJExp.apply(i));
        }
        }
        }
        }
      case "IntExp": {ESLVal $273 = _v14.termRef(0);
          ESLVal $272 = _v14.termRef(1);
          
          {ESLVal l = $273;
          
          {ESLVal n = $272;
          
          return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
        }
        }
        }
      case "StrExp": {ESLVal $271 = _v14.termRef(0);
          ESLVal $270 = _v14.termRef(1);
          
          {ESLVal l = $271;
          
          {ESLVal s = $270;
          
          return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
        }
        }
        }
      case "BoolExp": {ESLVal $269 = _v14.termRef(0);
          ESLVal $268 = _v14.termRef(1);
          
          {ESLVal l = $269;
          
          {ESLVal b = $268;
          
          return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
        }
        }
        }
      case "FloatExp": {ESLVal $267 = _v14.termRef(0);
          ESLVal $266 = _v14.termRef(1);
          
          {ESLVal l = $267;
          
          {ESLVal f = $266;
          
          return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $252 = _v14.termRef(0);
          ESLVal $251 = _v14.termRef(1);
          ESLVal $250 = _v14.termRef(2);
          
          switch($251.termName) {
          case "List": {ESLVal $259 = $251.termRef(0);
            ESLVal $258 = $251.termRef(1);
            
            if($258.isCons())
            {ESLVal $260 = $258.head();
              ESLVal $261 = $258.tail();
              
              {ESLVal l = $252;
              
              {ESLVal _v115 = $251;
              
              {ESLVal ts = $250;
              
              return expToJExp.apply(_v115);
            }
            }
            }
            }
          else if($258.isNil())
            if($250.isCons())
              {ESLVal $262 = $250.head();
                ESLVal $263 = $250.tail();
                
                if($263.isCons())
                {ESLVal $264 = $263.head();
                  ESLVal $265 = $263.tail();
                  
                  {ESLVal l = $252;
                  
                  {ESLVal _v116 = $251;
                  
                  {ESLVal ts = $250;
                  
                  return expToJExp.apply(_v116);
                }
                }
                }
                }
              else if($263.isNil())
                {ESLVal l1 = $252;
                  
                  {ESLVal l2 = $259;
                  
                  {ESLVal t = $262;
                  
                  return new ESLVal("JNil",$null);
                }
                }
                }
              else {ESLVal l = $252;
                  
                  {ESLVal _v117 = $251;
                  
                  {ESLVal ts = $250;
                  
                  return expToJExp.apply(_v117);
                }
                }
                }
              }
            else if($250.isNil())
              {ESLVal l = $252;
                
                {ESLVal _v118 = $251;
                
                {ESLVal ts = $250;
                
                return expToJExp.apply(_v118);
              }
              }
              }
            else {ESLVal l = $252;
                
                {ESLVal _v119 = $251;
                
                {ESLVal ts = $250;
                
                return expToJExp.apply(_v119);
              }
              }
              }
          else {ESLVal l = $252;
              
              {ESLVal _v120 = $251;
              
              {ESLVal ts = $250;
              
              return expToJExp.apply(_v120);
            }
            }
            }
          }
        case "NullExp": {ESLVal $253 = $251.termRef(0);
            
            if($250.isCons())
            {ESLVal $254 = $250.head();
              ESLVal $255 = $250.tail();
              
              if($255.isCons())
              {ESLVal $256 = $255.head();
                ESLVal $257 = $255.tail();
                
                {ESLVal l = $252;
                
                {ESLVal _v111 = $251;
                
                {ESLVal ts = $250;
                
                return expToJExp.apply(_v111);
              }
              }
              }
              }
            else if($255.isNil())
              {ESLVal l1 = $252;
                
                {ESLVal l2 = $253;
                
                {ESLVal t = $254;
                
                return new ESLVal("JNull",new ESLVal[]{});
              }
              }
              }
            else {ESLVal l = $252;
                
                {ESLVal _v112 = $251;
                
                {ESLVal ts = $250;
                
                return expToJExp.apply(_v112);
              }
              }
              }
            }
          else if($250.isNil())
            {ESLVal l = $252;
              
              {ESLVal _v113 = $251;
              
              {ESLVal ts = $250;
              
              return expToJExp.apply(_v113);
            }
            }
            }
          else {ESLVal l = $252;
              
              {ESLVal _v114 = $251;
              
              {ESLVal ts = $250;
              
              return expToJExp.apply(_v114);
            }
            }
            }
          }
          default: {ESLVal l = $252;
            
            {ESLVal _v121 = $251;
            
            {ESLVal ts = $250;
            
            return expToJExp.apply(_v121);
          }
          }
          }
        }
        }
      case "List": {ESLVal $249 = _v14.termRef(0);
          ESLVal $248 = _v14.termRef(1);
          
          {ESLVal l = $249;
          
          {ESLVal es = $248;
          
          return new ESLVal("JList",$null,expsToJExps.apply(es));
        }
        }
        }
      case "SetExp": {ESLVal $247 = _v14.termRef(0);
          ESLVal $246 = _v14.termRef(1);
          
          {ESLVal l = $247;
          
          {ESLVal es = $246;
          
          return new ESLVal("JSet",$null,expsToJExps.apply(es));
        }
        }
        }
      case "BagExp": {ESLVal $245 = _v14.termRef(0);
          ESLVal $244 = _v14.termRef(1);
          
          {ESLVal l = $245;
          
          {ESLVal es = $244;
          
          return new ESLVal("JBag",$null,expsToJExps.apply(es));
        }
        }
        }
      case "Term": {ESLVal $243 = _v14.termRef(0);
          ESLVal $242 = _v14.termRef(1);
          ESLVal $241 = _v14.termRef(2);
          ESLVal $240 = _v14.termRef(3);
          
          {ESLVal l = $243;
          
          {ESLVal n = $242;
          
          {ESLVal ts = $241;
          
          {ESLVal es = $240;
          
          return new ESLVal("JTerm",n,expsToJExps.apply(es));
        }
        }
        }
        }
        }
      case "Case": {ESLVal $239 = _v14.termRef(0);
          ESLVal $238 = _v14.termRef(1);
          ESLVal $237 = _v14.termRef(2);
          ESLVal $236 = _v14.termRef(3);
          
          {ESLVal l = $239;
          
          {ESLVal ds = $238;
          
          {ESLVal es = $237;
          
          {ESLVal arms = $236;
          
          return caseToJExp.apply(l,es,arms);
        }
        }
        }
        }
        }
      case "CaseAdd": {ESLVal $235 = _v14.termRef(0);
          ESLVal $234 = _v14.termRef(1);
          ESLVal $233 = _v14.termRef(2);
          ESLVal $232 = _v14.termRef(3);
          
          {ESLVal l = $235;
          
          {ESLVal s = $234;
          
          {ESLVal handler = $233;
          
          {ESLVal fail = $232;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $231 = _v14.termRef(0);
          ESLVal $230 = _v14.termRef(1);
          ESLVal $229 = _v14.termRef(2);
          ESLVal $228 = _v14.termRef(3);
          ESLVal $227 = _v14.termRef(4);
          
          {ESLVal l = $231;
          
          {ESLVal list = $230;
          
          {ESLVal cons = $229;
          
          {ESLVal nil = $228;
          
          {ESLVal alt = $227;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $226 = _v14.termRef(0);
          ESLVal $225 = _v14.termRef(1);
          ESLVal $224 = _v14.termRef(2);
          ESLVal $223 = _v14.termRef(3);
          
          {ESLVal l = $226;
          
          {ESLVal list = $225;
          
          {ESLVal arms = $224;
          
          {ESLVal alt = $223;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $222 = _v14.termRef(0);
          ESLVal $221 = _v14.termRef(1);
          ESLVal $220 = _v14.termRef(2);
          ESLVal $219 = _v14.termRef(3);
          
          {ESLVal l = $222;
          
          {ESLVal s = $221;
          
          {ESLVal arms = $220;
          
          {ESLVal alt = $219;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $218 = _v14.termRef(0);
          ESLVal $217 = _v14.termRef(1);
          ESLVal $216 = _v14.termRef(2);
          ESLVal $215 = _v14.termRef(3);
          
          {ESLVal l = $218;
          
          {ESLVal s = $217;
          
          {ESLVal arms = $216;
          
          {ESLVal alt = $215;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseSet": {ESLVal $214 = _v14.termRef(0);
          ESLVal $213 = _v14.termRef(1);
          ESLVal $212 = _v14.termRef(2);
          ESLVal $211 = _v14.termRef(3);
          
          {ESLVal l = $214;
          
          {ESLVal s = $213;
          
          {ESLVal handler = $212;
          
          {ESLVal fail = $211;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "Head": {ESLVal $210 = _v14.termRef(0);
          
          {ESLVal _v110 = $210;
          
          return new ESLVal("JHead",expToJExp.apply(_v110));
        }
        }
      case "Tail": {ESLVal $209 = _v14.termRef(0);
          
          {ESLVal _v109 = $209;
          
          return new ESLVal("JTail",expToJExp.apply(_v109));
        }
        }
      case "CaseError": {ESLVal $208 = _v14.termRef(0);
          ESLVal $207 = _v14.termRef(1);
          
          {ESLVal l = $208;
          
          {ESLVal _v108 = $207;
          
          return new ESLVal("JError",new ESLVal("JBinExp",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))),new ESLVal("add"),expToJExp.apply(_v108)));
        }
        }
        }
      case "NullExp": {ESLVal $206 = _v14.termRef(0);
          
          {ESLVal l = $206;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
        }
      case "Var": {ESLVal $205 = _v14.termRef(0);
          ESLVal $204 = _v14.termRef(1);
          
          {ESLVal l = $205;
          
          {ESLVal n = $204;
          
          return new ESLVal("JVar",n,$null);
        }
        }
        }
      case "Let": {ESLVal $203 = _v14.termRef(0);
          ESLVal $202 = _v14.termRef(1);
          ESLVal $201 = _v14.termRef(2);
          
          {ESLVal l = $203;
          
          {ESLVal bs = $202;
          
          {ESLVal body = $201;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Letrec": {ESLVal $200 = _v14.termRef(0);
          ESLVal $199 = _v14.termRef(1);
          ESLVal $198 = _v14.termRef(2);
          
          {ESLVal l = $200;
          
          {ESLVal bs = $199;
          
          {ESLVal body = $198;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Throw": {ESLVal $197 = _v14.termRef(0);
          ESLVal $196 = _v14.termRef(1);
          ESLVal $195 = _v14.termRef(2);
          
          {ESLVal l = $197;
          
          {ESLVal t = $196;
          
          {ESLVal _v107 = $195;
          
          return new ESLVal("JError",expToJExp.apply(_v107));
        }
        }
        }
        }
      case "BinExp": {ESLVal $194 = _v14.termRef(0);
          ESLVal $193 = _v14.termRef(1);
          ESLVal $192 = _v14.termRef(2);
          ESLVal $191 = _v14.termRef(3);
          
          {ESLVal l = $194;
          
          {ESLVal e1 = $193;
          
          {ESLVal op = $192;
          
          {ESLVal e2 = $191;
          
          return new ESLVal("JBinExp",expToJExp.apply(e1),opToJOp.apply(op),expToJExp.apply(e2));
        }
        }
        }
        }
        }
      case "Become": {ESLVal $187 = _v14.termRef(0);
          ESLVal $186 = _v14.termRef(1);
          
          switch($186.termName) {
          case "Apply": {ESLVal $190 = $186.termRef(0);
            ESLVal $189 = $186.termRef(1);
            ESLVal $188 = $186.termRef(2);
            
            {ESLVal l = $187;
            
            {ESLVal al = $190;
            
            {ESLVal b = $189;
            
            {ESLVal args = $188;
            
            return new ESLVal("JBecome",expToJExp.apply(b),expsToJExps.apply(args));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(6137,14761)").add(ESLVal.list(_v14)));
        }
        }
      case "Block": {ESLVal $181 = _v14.termRef(0);
          ESLVal $180 = _v14.termRef(1);
          
          if($180.isCons())
          {ESLVal $182 = $180.head();
            ESLVal $183 = $180.tail();
            
            if($183.isCons())
            {ESLVal $184 = $183.head();
              ESLVal $185 = $183.tail();
              
              {ESLVal l = $181;
              
              {ESLVal es = $180;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
            }
          else if($183.isNil())
            {ESLVal l = $181;
              
              {ESLVal _v106 = $182;
              
              return expToJExp.apply(_v106);
            }
            }
          else {ESLVal l = $181;
              
              {ESLVal es = $180;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
          }
        else if($180.isNil())
          {ESLVal l = $181;
            
            return new ESLVal("JNull",new ESLVal[]{});
          }
        else {ESLVal l = $181;
            
            {ESLVal es = $180;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
          }
          }
        }
      case "If": {ESLVal $179 = _v14.termRef(0);
          ESLVal $178 = _v14.termRef(1);
          ESLVal $177 = _v14.termRef(2);
          ESLVal $176 = _v14.termRef(3);
          
          {ESLVal l = $179;
          
          {ESLVal e1 = $178;
          
          {ESLVal e2 = $177;
          
          {ESLVal e3 = $176;
          
          return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,$true),expToJCommand.apply(e3,$true)),$null);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $175 = _v14.termRef(0);
          ESLVal $174 = _v14.termRef(1);
          ESLVal $173 = _v14.termRef(2);
          ESLVal $172 = _v14.termRef(3);
          ESLVal $171 = _v14.termRef(4);
          
          {ESLVal l = $175;
          
          {ESLVal n = $174;
          
          {ESLVal args = $173;
          
          {ESLVal t = $172;
          
          {ESLVal body = $171;
          
          return new ESLVal("JFun",expToJExp.apply(n),map.apply(new ESLVal(new Function(new ESLVal("fun223"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return decToJDec.apply(d);
            }
          }),args),new ESLVal("JFunType",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal a = $l0.head();
                $l0 = $l0.tail();
                $v.add($null);
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args),$null),expToJCommand.apply(body,$true));
        }
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $170 = _v14.termRef(0);
          ESLVal $169 = _v14.termRef(1);
          
          {ESLVal _v105 = $170;
          
          {ESLVal i = $169;
          
          return new ESLVal("JTermRef",expToJExp.apply(_v105),i);
        }
        }
        }
      case "Cmp": {ESLVal $168 = _v14.termRef(0);
          ESLVal $167 = _v14.termRef(1);
          ESLVal $166 = _v14.termRef(2);
          
          {ESLVal l = $168;
          
          {ESLVal _v101 = $167;
          
          {ESLVal qs = $166;
          
          if(exists.apply(isBindingQualifier,qs).and(forall.apply(isSimpleQualifier,qs)).boolVal)
          return new ESLVal("JCmpExp",cmpToJCmp.apply(_v101,qs));
          else
            {ESLVal _v102 = $168;
              
              {ESLVal _v103 = $167;
              
              {ESLVal _v104 = $166;
              
              return cmpToJExp.apply(_v103,_v104);
            }
            }
            }
        }
        }
        }
        }
      case "Not": {ESLVal $165 = _v14.termRef(0);
          ESLVal $164 = _v14.termRef(1);
          
          {ESLVal l = $165;
          
          {ESLVal _v100 = $164;
          
          return new ESLVal("JNot",expToJExp.apply(_v100));
        }
        }
        }
      case "New": {ESLVal $163 = _v14.termRef(0);
          ESLVal $162 = _v14.termRef(1);
          ESLVal $161 = _v14.termRef(2);
          
          {ESLVal l = $163;
          
          {ESLVal b = $162;
          
          {ESLVal args = $161;
          
          return new ESLVal("JNew",expToJExp.apply(b),expsToJExps.apply(args));
        }
        }
        }
        }
      case "NewArray": {ESLVal $160 = _v14.termRef(0);
          ESLVal $159 = _v14.termRef(1);
          ESLVal $158 = _v14.termRef(2);
          
          {ESLVal l = $160;
          
          {ESLVal t = $159;
          
          {ESLVal i = $158;
          
          return new ESLVal("JNewArray",expToJExp.apply(i));
        }
        }
        }
        }
      case "NewJava": {ESLVal $157 = _v14.termRef(0);
          ESLVal $156 = _v14.termRef(1);
          ESLVal $155 = _v14.termRef(2);
          ESLVal $154 = _v14.termRef(3);
          
          {ESLVal l = $157;
          
          {ESLVal n = $156;
          
          {ESLVal t = $155;
          
          {ESLVal args = $154;
          
          return new ESLVal("JNewJava",n,expsToJExps.apply(args));
        }
        }
        }
        }
        }
      case "NewTable": {ESLVal $153 = _v14.termRef(0);
          ESLVal $152 = _v14.termRef(1);
          ESLVal $151 = _v14.termRef(2);
          
          {ESLVal l = $153;
          
          {ESLVal key = $152;
          
          {ESLVal value = $151;
          
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
        }
        }
        }
      case "Record": {ESLVal $150 = _v14.termRef(0);
          ESLVal $149 = _v14.termRef(1);
          
          {ESLVal l = $150;
          
          {ESLVal fs = $149;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v15 = $qualArg;
                
                switch(_v15.termName) {
                case "Binding": {ESLVal $288 = _v15.termRef(0);
                  ESLVal $287 = _v15.termRef(1);
                  ESLVal $286 = _v15.termRef(2);
                  ESLVal $285 = _v15.termRef(3);
                  ESLVal $284 = _v15.termRef(4);
                  
                  {ESLVal bl = $288;
                  
                  {ESLVal n = $287;
                  
                  {ESLVal t = $286;
                  
                  {ESLVal dt = $285;
                  
                  {ESLVal _v99 = $284;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,$null,expToJExp.apply(_v99))));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v15;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "Send": {ESLVal $144 = _v14.termRef(0);
          ESLVal $143 = _v14.termRef(1);
          ESLVal $142 = _v14.termRef(2);
          
          switch($142.termName) {
          case "Term": {ESLVal $148 = $142.termRef(0);
            ESLVal $147 = $142.termRef(1);
            ESLVal $146 = $142.termRef(2);
            ESLVal $145 = $142.termRef(3);
            
            {ESLVal l = $144;
            
            {ESLVal a = $143;
            
            {ESLVal lt = $148;
            
            {ESLVal n = $147;
            
            {ESLVal ts = $146;
            
            {ESLVal es = $145;
            
            return new ESLVal("JSend",expToJExp.apply(a),n,expsToJExps.apply(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(6137,14761)").add(ESLVal.list(_v14)));
        }
        }
      case "SendTimeSuper": {ESLVal $141 = _v14.termRef(0);
          
          {ESLVal l = $141;
          
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
        }
      case "SendSuper": {ESLVal $140 = _v14.termRef(0);
          ESLVal $139 = _v14.termRef(1);
          
          {ESLVal l = $140;
          
          {ESLVal _v98 = $139;
          
          return new ESLVal("JSendSuper",expToJExp.apply(_v98));
        }
        }
        }
      case "Self": {ESLVal $138 = _v14.termRef(0);
          
          {ESLVal l = $138;
          
          return new ESLVal("JSelf",new ESLVal[]{});
        }
        }
      case "Fold": {ESLVal $137 = _v14.termRef(0);
          ESLVal $136 = _v14.termRef(1);
          ESLVal $135 = _v14.termRef(2);
          
          {ESLVal l = $137;
          
          {ESLVal t = $136;
          
          {ESLVal _v97 = $135;
          
          return expToJExp.apply(_v97);
        }
        }
        }
        }
      case "Now": {ESLVal $134 = _v14.termRef(0);
          
          {ESLVal l = $134;
          
          return new ESLVal("JNow",new ESLVal[]{});
        }
        }
      case "Ref": {ESLVal $133 = _v14.termRef(0);
          ESLVal $132 = _v14.termRef(1);
          ESLVal $131 = _v14.termRef(2);
          
          {ESLVal l = $133;
          
          {ESLVal _v96 = $132;
          
          {ESLVal n = $131;
          
          return new ESLVal("JRef",expToJExp.apply(_v96),n);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $130 = _v14.termRef(0);
          ESLVal $129 = _v14.termRef(1);
          
          {ESLVal l = $130;
          
          {ESLVal n = $129;
          
          return new ESLVal("JRefSuper",n);
        }
        }
        }
      case "For": {ESLVal $128 = _v14.termRef(0);
          ESLVal $127 = _v14.termRef(1);
          ESLVal $126 = _v14.termRef(2);
          ESLVal $125 = _v14.termRef(3);
          
          {ESLVal l1 = $128;
          
          {ESLVal p = $127;
          
          {ESLVal l2 = $126;
          
          {ESLVal c = $125;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $124 = _v14.termRef(0);
          ESLVal $123 = _v14.termRef(1);
          ESLVal $122 = _v14.termRef(2);
          
          {ESLVal l = $124;
          
          {ESLVal refs = $123;
          
          {ESLVal _v95 = $122;
          
          return new ESLVal("JGrab",refsToJExps.apply(refs),expToJExp.apply(_v95));
        }
        }
        }
        }
      case "Update": {ESLVal $121 = _v14.termRef(0);
          ESLVal $120 = _v14.termRef(1);
          ESLVal $119 = _v14.termRef(2);
          
          {ESLVal l = $121;
          
          {ESLVal n = $120;
          
          {ESLVal v = $119;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Probably": {ESLVal $118 = _v14.termRef(0);
          ESLVal $117 = _v14.termRef(1);
          ESLVal $116 = _v14.termRef(2);
          ESLVal $115 = _v14.termRef(3);
          ESLVal $114 = _v14.termRef(4);
          
          {ESLVal l = $118;
          
          {ESLVal _v94 = $117;
          
          {ESLVal t = $116;
          
          {ESLVal e1 = $115;
          
          {ESLVal e2 = $114;
          
          return new ESLVal("JProbably",expToJExp.apply(_v94),expToJExp.apply(e1),expToJExp.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Try": {ESLVal $113 = _v14.termRef(0);
          ESLVal $112 = _v14.termRef(1);
          ESLVal $111 = _v14.termRef(2);
          
          {ESLVal l = $113;
          
          {ESLVal _v93 = $112;
          
          {ESLVal arms = $111;
          
          return new ESLVal("JTry",expToJExp.apply(_v93),new ESLVal("$x"),expToJCommand.apply(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
        }
        }
        }
        }
      case "ActExp": {ESLVal $110 = _v14.termRef(0);
          ESLVal $109 = _v14.termRef(1);
          ESLVal $108 = _v14.termRef(2);
          ESLVal $107 = _v14.termRef(3);
          ESLVal $106 = _v14.termRef(4);
          ESLVal $105 = _v14.termRef(5);
          ESLVal $104 = _v14.termRef(6);
          ESLVal $103 = _v14.termRef(7);
          
          {ESLVal l = $110;
          
          {ESLVal name = $109;
          
          {ESLVal decs = $108;
          
          {ESLVal exports = $107;
          
          {ESLVal parent = $106;
          
          {ESLVal defs = $105;
          
          {ESLVal init = $104;
          
          {ESLVal arms = $103;
          
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
        default: return error(new ESLVal("case error at Pos(6137,14761)").add(ESLVal.list(_v14)));
      }
      }
    }
  });
  private static ESLVal isSimpleQualifier = new ESLVal(new Function(new ESLVal("isSimpleQualifier"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v16 = q;
        
        switch(_v16.termName) {
        case "BQual": {ESLVal $291 = _v16.termRef(0);
          ESLVal $290 = _v16.termRef(1);
          ESLVal $289 = _v16.termRef(2);
          
          switch($290.termName) {
          case "PVar": {ESLVal $294 = $290.termRef(0);
            ESLVal $293 = $290.termRef(1);
            ESLVal $292 = $290.termRef(2);
            
            {ESLVal l = $291;
            
            {ESLVal vl = $294;
            
            {ESLVal n = $293;
            
            {ESLVal t = $292;
            
            {ESLVal e = $289;
            
            return $true;
          }
          }
          }
          }
          }
          }
          default: {ESLVal l = $291;
            
            {ESLVal p = $290;
            
            {ESLVal e = $289;
            
            return $false;
          }
          }
          }
        }
        }
        default: {ESLVal _v92 = _v16;
          
          return $true;
        }
      }
      }
    }
  });
  private static ESLVal isBindingQualifier = new ESLVal(new Function(new ESLVal("isBindingQualifier"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v17 = q;
        
        switch(_v17.termName) {
        case "BQual": {ESLVal $297 = _v17.termRef(0);
          ESLVal $296 = _v17.termRef(1);
          ESLVal $295 = _v17.termRef(2);
          
          {ESLVal l = $297;
          
          {ESLVal p = $296;
          
          {ESLVal e = $295;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v91 = _v17;
          
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
  { LetRec letrec = new LetRec() {
        ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v86 = $args[0];
          {ESLVal _v18 = _v86;
                
                if(_v18.isCons())
                {ESLVal $298 = _v18.head();
                  ESLVal $299 = _v18.tail();
                  
                  switch($298.termName) {
                  case "BQual": {ESLVal $304 = $298.termRef(0);
                    ESLVal $303 = $298.termRef(1);
                    ESLVal $302 = $298.termRef(2);
                    
                    switch($303.termName) {
                    case "PVar": {ESLVal $307 = $303.termRef(0);
                      ESLVal $306 = $303.termRef(1);
                      ESLVal $305 = $303.termRef(2);
                      
                      {ESLVal l = $304;
                      
                      {ESLVal vl = $307;
                      
                      {ESLVal n = $306;
                      
                      {ESLVal t = $305;
                      
                      {ESLVal listExp = $302;
                      
                      {ESLVal _v88 = $299;
                      
                      return new ESLVal("JCmpBind",n,expToJExp.apply(listExp),inner.apply(_v88));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(15164,15362)").add(ESLVal.list(_v18)));
                  }
                  }
                case "PQual": {ESLVal $301 = $298.termRef(0);
                    ESLVal $300 = $298.termRef(1);
                    
                    {ESLVal l = $301;
                    
                    {ESLVal p = $300;
                    
                    {ESLVal _v87 = $299;
                    
                    return new ESLVal("JCmpIf",expToJExp.apply(p),inner.apply(_v87));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(15164,15362)").add(ESLVal.list(_v18)));
                }
                }
              else if(_v18.isNil())
                return new ESLVal("JCmpList",expToJExp.apply(e));
              else return error(new ESLVal("case error at Pos(15164,15362)").add(ESLVal.list(_v18)));
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
      
        {ESLVal _v19 = qs;
        
        if(_v19.isCons())
        {ESLVal $308 = _v19.head();
          ESLVal $309 = _v19.tail();
          
          switch($308.termName) {
          case "BQual": {ESLVal $314 = $308.termRef(0);
            ESLVal $313 = $308.termRef(1);
            ESLVal $312 = $308.termRef(2);
            
            switch($313.termName) {
            case "PVar": {ESLVal $317 = $313.termRef(0);
              ESLVal $316 = $313.termRef(1);
              ESLVal $315 = $313.termRef(2);
              
              {ESLVal l = $314;
              
              {ESLVal vl = $317;
              
              {ESLVal n = $316;
              
              {ESLVal t = $315;
              
              {ESLVal listExp = $312;
              
              {ESLVal _v90 = $309;
              
              return new ESLVal("JCmpOuter",n,expToJExp.apply(listExp),inner.apply(_v90));
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(15374,15571)").add(ESLVal.list(_v19)));
          }
          }
        case "PQual": {ESLVal $311 = $308.termRef(0);
            ESLVal $310 = $308.termRef(1);
            
            {ESLVal l = $311;
            
            {ESLVal p = $310;
            
            {ESLVal _v89 = $309;
            
            return new ESLVal("JCmpIf",expToJExp.apply(p),cmpToJCmp.apply(e,_v89));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(15374,15571)").add(ESLVal.list(_v19)));
        }
        }
      else if(_v19.isNil())
        return new ESLVal("JCmpList",expToJExp.apply(e));
      else return error(new ESLVal("case error at Pos(15374,15571)").add(ESLVal.list(_v19)));
      }}
      
    }
  });
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal refs = $args[0];
  {ESLVal _v20 = refs;
        
        if(_v20.isCons())
        {ESLVal $318 = _v20.head();
          ESLVal $319 = _v20.tail();
          
          switch($318.termName) {
          case "VarDynamicRef": {ESLVal $324 = $318.termRef(0);
            ESLVal $323 = $318.termRef(1);
            
            switch($323.termName) {
            case "Var": {ESLVal $326 = $323.termRef(0);
              ESLVal $325 = $323.termRef(1);
              
              {ESLVal l = $324;
              
              {ESLVal vl = $326;
              
              {ESLVal n = $325;
              
              {ESLVal _v85 = $319;
              
              return refsToJExps.apply(_v85).cons(new ESLVal("JVar",n,$null));
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(15618,15859)").add(ESLVal.list(_v20)));
          }
          }
        case "ActorDynamicRef": {ESLVal $322 = $318.termRef(0);
            ESLVal $321 = $318.termRef(1);
            ESLVal $320 = $318.termRef(2);
            
            {ESLVal l = $322;
            
            {ESLVal e = $321;
            
            {ESLVal n = $320;
            
            {ESLVal _v84 = $319;
            
            return refsToJExps.apply(_v84).cons(new ESLVal("JRef",expToJExp.apply(e),n));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(15618,15859)").add(ESLVal.list(_v20)));
        }
        }
      else if(_v20.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(15618,15859)").add(ESLVal.list(_v20)));
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
        
        return new ESLVal("JBehaviour",exports,new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField.apply(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
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
        
        return new ESLVal("JExtendedBehaviour",exports,expToJExp.apply(parent),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(defToField.apply(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(defs),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
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
  {ESLVal _v21 = a;
        
        switch(_v21.termName) {
        case "BArm": {ESLVal $330 = _v21.termRef(0);
          ESLVal $329 = _v21.termRef(1);
          ESLVal $328 = _v21.termRef(2);
          ESLVal $327 = _v21.termRef(3);
          
          if($329.isCons())
          {ESLVal $331 = $329.head();
            ESLVal $332 = $329.tail();
            
            switch($331.termName) {
            case "PTerm": {ESLVal $336 = $331.termRef(0);
              ESLVal $335 = $331.termRef(1);
              ESLVal $334 = $331.termRef(2);
              ESLVal $333 = $331.termRef(3);
              
              switch($335.strVal) {
              case "Time": if($332.isCons())
                {ESLVal $337 = $332.head();
                  ESLVal $338 = $332.tail();
                  
                  {ESLVal _v77 = _v21;
                  
                  return $false;
                }
                }
              else if($332.isNil())
                {ESLVal l = $330;
                  
                  {ESLVal pl = $336;
                  
                  {ESLVal ts = $334;
                  
                  {ESLVal ps = $333;
                  
                  {ESLVal g = $328;
                  
                  {ESLVal e = $327;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v78 = _v21;
                  
                  return $false;
                }
              default: {ESLVal _v79 = _v21;
                
                return $false;
              }
            }
            }
            default: {ESLVal _v80 = _v21;
              
              return $false;
            }
          }
          }
        else if($329.isNil())
          {ESLVal _v81 = _v21;
            
            return $false;
          }
        else {ESLVal _v82 = _v21;
            
            return $false;
          }
        }
        default: {ESLVal _v83 = _v21;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal _v22 = arms;
        
        if(_v22.isCons())
        {ESLVal $339 = _v22.head();
          ESLVal $340 = _v22.tail();
          
          switch($339.termName) {
          case "BArm": {ESLVal $344 = $339.termRef(0);
            ESLVal $343 = $339.termRef(1);
            ESLVal $342 = $339.termRef(2);
            ESLVal $341 = $339.termRef(3);
            
            if($343.isCons())
            {ESLVal $345 = $343.head();
              ESLVal $346 = $343.tail();
              
              switch($345.termName) {
              case "PTerm": {ESLVal $350 = $345.termRef(0);
                ESLVal $349 = $345.termRef(1);
                ESLVal $348 = $345.termRef(2);
                ESLVal $347 = $345.termRef(3);
                
                switch($349.strVal) {
                case "Time": if($348.isCons())
                  {ESLVal $351 = $348.head();
                    ESLVal $352 = $348.tail();
                    
                    return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                  }
                else if($348.isNil())
                  if($347.isCons())
                    {ESLVal $353 = $347.head();
                      ESLVal $354 = $347.tail();
                      
                      switch($353.termName) {
                      case "PVar": {ESLVal $365 = $353.termRef(0);
                        ESLVal $364 = $353.termRef(1);
                        ESLVal $363 = $353.termRef(2);
                        
                        if($354.isCons())
                        {ESLVal $366 = $354.head();
                          ESLVal $367 = $354.tail();
                          
                          return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                        }
                      else if($354.isNil())
                        if($346.isCons())
                          {ESLVal $368 = $346.head();
                            ESLVal $369 = $346.tail();
                            
                            return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                          }
                        else if($346.isNil())
                          {ESLVal l = $344;
                            
                            {ESLVal tl = $350;
                            
                            {ESLVal vl = $365;
                            
                            {ESLVal n = $364;
                            
                            {ESLVal t = $363;
                            
                            {ESLVal g = $342;
                            
                            {ESLVal e = $341;
                            
                            {ESLVal _v76 = $340;
                            
                            return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp.apply(g),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v76)));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                      else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                      }
                    case "PInt": {ESLVal $356 = $353.termRef(0);
                        ESLVal $355 = $353.termRef(1);
                        
                        if($354.isCons())
                        {ESLVal $357 = $354.head();
                          ESLVal $358 = $354.tail();
                          
                          return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                        }
                      else if($354.isNil())
                        if($346.isCons())
                          {ESLVal $359 = $346.head();
                            ESLVal $360 = $346.tail();
                            
                            return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                          }
                        else if($346.isNil())
                          switch($342.termName) {
                            case "BoolExp": {ESLVal $362 = $342.termRef(0);
                              ESLVal $361 = $342.termRef(1);
                              
                              switch($361.boolVal ? 1 : 0) {
                              case 1: {ESLVal l = $344;
                                
                                {ESLVal tl = $350;
                                
                                {ESLVal vl = $356;
                                
                                {ESLVal n = $355;
                                
                                {ESLVal bl = $362;
                                
                                {ESLVal e = $341;
                                
                                {ESLVal _v75 = $340;
                                
                                return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v75));
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                          }
                        else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                      else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                      }
                      default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                    }
                    }
                  else if($347.isNil())
                    return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                  else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
                default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
              }
              }
              default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
            }
            }
          else if($343.isNil())
            return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
          else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
          }
          default: return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
        }
        }
      else if(_v22.isNil())
        return new ESLVal("JBlock",ESLVal.list());
      else return error(new ESLVal("case error at Pos(17960,18490)").add(ESLVal.list(_v22)));
      }
    }
  });
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  {ESLVal _v23 = qs;
        
        if(_v23.isCons())
        {ESLVal $370 = _v23.head();
          ESLVal $371 = _v23.tail();
          
          switch($370.termName) {
          case "BQual": {ESLVal $376 = $370.termRef(0);
            ESLVal $375 = $370.termRef(1);
            ESLVal $374 = $370.termRef(2);
            
            {ESLVal l = $376;
            
            {ESLVal p = $375;
            
            {ESLVal v = $374;
            
            {ESLVal _v74 = $371;
            
            {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),ESLVal.list(),ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v74)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
            
            return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp.apply(f),expToJExp.apply(v))));
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $373 = $370.termRef(0);
            ESLVal $372 = $370.termRef(1);
            
            {ESLVal l = $373;
            
            {ESLVal p = $372;
            
            {ESLVal _v73 = $371;
            
            return new ESLVal("JIfExp",expToJExp.apply(p),cmpToJExp.apply(e,_v73),new ESLVal("JNil",$null));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(18537,19205)").add(ESLVal.list(_v23)));
        }
        }
      else if(_v23.isNil())
        return new ESLVal("JList",$null,ESLVal.list(expToJExp.apply(e)));
      else return error(new ESLVal("case error at Pos(18537,19205)").add(ESLVal.list(_v23)));
      }
    }
  });
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  {ESLVal _v24 = module;
        
        switch(_v24.termName) {
        case "Module": {ESLVal $383 = _v24.termRef(0);
          ESLVal $382 = _v24.termRef(1);
          ESLVal $381 = _v24.termRef(2);
          ESLVal $380 = _v24.termRef(3);
          ESLVal $379 = _v24.termRef(4);
          ESLVal $378 = _v24.termRef(5);
          ESLVal $377 = _v24.termRef(6);
          
          {ESLVal path = $383;
          
          {ESLVal name = $382;
          
          {ESLVal exports = $381;
          
          {ESLVal imports = $380;
          
          {ESLVal x = $379;
          
          {ESLVal y = $378;
          
          {ESLVal defs = $377;
          
          return renameJVarsModule.apply(new ESLVal("JModule",name,exports,imports,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                if(isBinding.apply(d).or(isFunBind.apply(d)).boolVal) {$v.add(defToField.apply(d));
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(expandFunDefs.apply(mergeFunDefs.apply(defs)))));
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19243,19516)").add(ESLVal.list(_v24)));
      }
      }
    }
  });
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v25 = m;
        
        switch(_v25.termName) {
        case "JModule": {ESLVal $387 = _v25.termRef(0);
          ESLVal $386 = _v25.termRef(1);
          ESLVal $385 = _v25.termRef(2);
          ESLVal $384 = _v25.termRef(3);
          
          {ESLVal name = $387;
          
          {ESLVal exports = $386;
          
          {ESLVal imports = $385;
          
          {ESLVal fs = $384;
          
          {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v26 = $qualArg;
                  
                  switch(_v26.termName) {
                  case "JField": {ESLVal $390 = _v26.termRef(0);
                    ESLVal $389 = _v26.termRef(1);
                    ESLVal $388 = _v26.termRef(2);
                    
                    {ESLVal n = $390;
                    
                    {ESLVal t = $389;
                    
                    {ESLVal e = $388;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v26;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(fs).flatten().flatten();
          
          return new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                switch(_v27.termName) {
                case "JField": {ESLVal $393 = _v27.termRef(0);
                  ESLVal $392 = _v27.termRef(1);
                  ESLVal $391 = _v27.termRef(2);
                  
                  {ESLVal n = $393;
                  
                  {ESLVal t = $392;
                  
                  {ESLVal e = $391;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v27;
                  
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
        default: return error(new ESLVal("case error at Pos(19556,19863)").add(ESLVal.list(_v25)));
      }
      }
    }
  });
  private static ESLVal renameJVarsExp = new ESLVal(new Function(new ESLVal("renameJVarsExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v28 = e;
        
        switch(_v28.termName) {
        case "JFun": {ESLVal $473 = _v28.termRef(0);
          ESLVal $472 = _v28.termRef(1);
          ESLVal $471 = _v28.termRef(2);
          ESLVal $470 = _v28.termRef(3);
          
          {ESLVal v0 = $473;
          
          {ESLVal v1 = $472;
          
          {ESLVal v2 = $471;
          
          {ESLVal v3 = $470;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v32 = $qualArg;
                  
                  switch(_v32.termName) {
                  case "JDec": {ESLVal $484 = _v32.termRef(0);
                    ESLVal $483 = _v32.termRef(1);
                    
                    {ESLVal n = $484;
                    
                    {ESLVal t = $483;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  default: {ESLVal _0 = _v32;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v1).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun224"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,boundNames);
          }
        }),vars).boolVal)
          {ESLVal newNames = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(newName.apply());
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(boundNames);
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JFun",v0,new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("JDec",n,$null));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(newNames),v2,renameJVarsCommand.apply(v3,boundNames.add(vars),env1));
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
      case "JApply": {ESLVal $469 = _v28.termRef(0);
          ESLVal $468 = _v28.termRef(1);
          
          {ESLVal v0 = $469;
          
          {ESLVal v1 = $468;
          
          return new ESLVal("JApply",renameJVarsExp.apply(v0,vars,env),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v1));
        }
        }
        }
      case "JArrayRef": {ESLVal $467 = _v28.termRef(0);
          ESLVal $466 = _v28.termRef(1);
          
          {ESLVal a = $467;
          
          {ESLVal i = $466;
          
          return new ESLVal("JArrayRef",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $465 = _v28.termRef(0);
          ESLVal $464 = _v28.termRef(1);
          ESLVal $463 = _v28.termRef(2);
          
          {ESLVal a = $465;
          
          {ESLVal i = $464;
          
          {ESLVal v = $463;
          
          return new ESLVal("JArrayUpdate",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env),renameJVarsExp.apply(v,vars,env));
        }
        }
        }
        }
      case "JBecome": {ESLVal $462 = _v28.termRef(0);
          ESLVal $461 = _v28.termRef(1);
          
          {ESLVal _v72 = $462;
          
          {ESLVal es = $461;
          
          return new ESLVal("JBecome",renameJVarsExp.apply(_v72,vars,env),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
      case "JBinExp": {ESLVal $460 = _v28.termRef(0);
          ESLVal $459 = _v28.termRef(1);
          ESLVal $458 = _v28.termRef(2);
          
          {ESLVal v0 = $460;
          
          {ESLVal v1 = $459;
          
          {ESLVal v2 = $458;
          
          return new ESLVal("JBinExp",renameJVarsExp.apply(v0,vars,env),v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $457 = _v28.termRef(0);
          ESLVal $456 = _v28.termRef(1);
          
          {ESLVal v0 = $457;
          
          {ESLVal v1 = $456;
          
          return new ESLVal("JCommandExp",renameJVarsCommand.apply(v0,vars,env),v1);
        }
        }
        }
      case "JIfExp": {ESLVal $455 = _v28.termRef(0);
          ESLVal $454 = _v28.termRef(1);
          ESLVal $453 = _v28.termRef(2);
          
          {ESLVal v0 = $455;
          
          {ESLVal v1 = $454;
          
          {ESLVal v2 = $453;
          
          return new ESLVal("JIfExp",renameJVarsExp.apply(v0,vars,env),renameJVarsExp.apply(v1,vars,env),renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $452 = _v28.termRef(0);
          
          {ESLVal v0 = $452;
          
          return e;
        }
        }
      case "JTerm": {ESLVal $451 = _v28.termRef(0);
          ESLVal $450 = _v28.termRef(1);
          
          {ESLVal v0 = $451;
          
          {ESLVal v1 = $450;
          
          return new ESLVal("JTerm",v0,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v1));
        }
        }
        }
      case "JTermRef": {ESLVal $449 = _v28.termRef(0);
          ESLVal $448 = _v28.termRef(1);
          
          {ESLVal v0 = $449;
          
          {ESLVal v1 = $448;
          
          return new ESLVal("JTermRef",renameJVarsExp.apply(v0,vars,env),v1);
        }
        }
        }
      case "JList": {ESLVal $447 = _v28.termRef(0);
          ESLVal $446 = _v28.termRef(1);
          
          {ESLVal v0 = $447;
          
          {ESLVal v1 = $446;
          
          return new ESLVal("JList",v0,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v1));
        }
        }
        }
      case "JSet": {ESLVal $445 = _v28.termRef(0);
          ESLVal $444 = _v28.termRef(1);
          
          {ESLVal v0 = $445;
          
          {ESLVal v1 = $444;
          
          return new ESLVal("JSet",v0,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v1));
        }
        }
        }
      case "JBag": {ESLVal $443 = _v28.termRef(0);
          ESLVal $442 = _v28.termRef(1);
          
          {ESLVal v0 = $443;
          
          {ESLVal v1 = $442;
          
          return new ESLVal("JBag",v0,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal v = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(v,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v1));
        }
        }
        }
      case "JNil": {ESLVal $441 = _v28.termRef(0);
          
          {ESLVal v0 = $441;
          
          return e;
        }
        }
      case "JNow": {
          return e;
        }
      case "JVar": {ESLVal $440 = _v28.termRef(0);
          ESLVal $439 = _v28.termRef(1);
          
          {ESLVal v0 = $440;
          
          {ESLVal v1 = $439;
          
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
      case "JError": {ESLVal $438 = _v28.termRef(0);
          
          {ESLVal v0 = $438;
          
          return new ESLVal("JError",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JHead": {ESLVal $437 = _v28.termRef(0);
          
          {ESLVal v0 = $437;
          
          return new ESLVal("JHead",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JTail": {ESLVal $436 = _v28.termRef(0);
          
          {ESLVal v0 = $436;
          
          return new ESLVal("JTail",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JCastp": {ESLVal $435 = _v28.termRef(0);
          ESLVal $434 = _v28.termRef(1);
          ESLVal $433 = _v28.termRef(2);
          
          {ESLVal v0 = $435;
          
          {ESLVal v1 = $434;
          
          {ESLVal v2 = $433;
          
          return new ESLVal("JCastp",v0,v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCast": {ESLVal $432 = _v28.termRef(0);
          ESLVal $431 = _v28.termRef(1);
          
          {ESLVal v0 = $432;
          
          {ESLVal v1 = $431;
          
          return new ESLVal("JCast",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JCmpExp": {ESLVal $430 = _v28.termRef(0);
          
          {ESLVal cmp = $430;
          
          return new ESLVal("JCmpExp",renameJVarsCmp.apply(cmp,vars,env));
        }
        }
      case "JNot": {ESLVal $429 = _v28.termRef(0);
          
          {ESLVal _v71 = $429;
          
          return new ESLVal("JNot",renameJVarsExp.apply(_v71,vars,env));
        }
        }
      case "JNew": {ESLVal $428 = _v28.termRef(0);
          ESLVal $427 = _v28.termRef(1);
          
          {ESLVal b = $428;
          
          {ESLVal args = $427;
          
          return new ESLVal("JNew",renameJVarsExp.apply(b,vars,env),new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal a = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(a,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
        }
      case "JNewArray": {ESLVal $426 = _v28.termRef(0);
          
          {ESLVal b = $426;
          
          return new ESLVal("JNewArray",renameJVarsExp.apply(b,vars,env));
        }
        }
      case "JNewJava": {ESLVal $425 = _v28.termRef(0);
          ESLVal $424 = _v28.termRef(1);
          
          {ESLVal n = $425;
          
          {ESLVal args = $424;
          
          return new ESLVal("JNewJava",n,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal a = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(a,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(args));
        }
        }
        }
      case "JNewTable": {
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
      case "JMapFun": {ESLVal $423 = _v28.termRef(0);
          ESLVal $422 = _v28.termRef(1);
          
          {ESLVal f = $423;
          
          {ESLVal l = $422;
          
          return new ESLVal("JMapFun",renameJVarsExp.apply(f,vars,env),renameJVarsExp.apply(l,vars,env));
        }
        }
        }
      case "JRecord": {ESLVal $421 = _v28.termRef(0);
          
          {ESLVal fs = $421;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v31 = $qualArg;
                
                switch(_v31.termName) {
                case "JField": {ESLVal $482 = _v31.termRef(0);
                  ESLVal $481 = _v31.termRef(1);
                  ESLVal $480 = _v31.termRef(2);
                  
                  {ESLVal n = $482;
                  
                  {ESLVal t = $481;
                  
                  {ESLVal _v70 = $480;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v70,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v31;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
      case "JFlatten": {ESLVal $420 = _v28.termRef(0);
          
          {ESLVal _v69 = $420;
          
          return new ESLVal("JFlatten",renameJVarsExp.apply(_v69,vars,env));
        }
        }
      case "JSend": {ESLVal $419 = _v28.termRef(0);
          ESLVal $418 = _v28.termRef(1);
          ESLVal $417 = _v28.termRef(2);
          
          {ESLVal _v68 = $419;
          
          {ESLVal n = $418;
          
          {ESLVal es = $417;
          
          return new ESLVal("JSend",renameJVarsExp.apply(_v68,vars,env),n,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(e,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es));
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $416 = _v28.termRef(0);
          
          {ESLVal _v67 = $416;
          
          return new ESLVal("JSendSuper",renameJVarsExp.apply(_v67,vars,env));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
      case "JSelf": {
          return new ESLVal("JSelf",new ESLVal[]{});
        }
      case "JRef": {ESLVal $415 = _v28.termRef(0);
          ESLVal $414 = _v28.termRef(1);
          
          {ESLVal _v66 = $415;
          
          {ESLVal n = $414;
          
          return new ESLVal("JRef",renameJVarsExp.apply(_v66,vars,env),n);
        }
        }
        }
      case "JRefSuper": {ESLVal $413 = _v28.termRef(0);
          
          {ESLVal n = $413;
          
          return new ESLVal("JRefSuper",n);
        }
        }
      case "JBehaviour": {ESLVal $412 = _v28.termRef(0);
          ESLVal $411 = _v28.termRef(1);
          ESLVal $410 = _v28.termRef(2);
          ESLVal $409 = _v28.termRef(3);
          ESLVal $408 = _v28.termRef(4);
          
          {ESLVal es = $412;
          
          {ESLVal fs = $411;
          
          {ESLVal init = $410;
          
          {ESLVal handler = $409;
          
          {ESLVal time = $408;
          
          return new ESLVal("JBehaviour",es,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v30 = $qualArg;
                
                switch(_v30.termName) {
                case "JField": {ESLVal $479 = _v30.termRef(0);
                  ESLVal $478 = _v30.termRef(1);
                  ESLVal $477 = _v30.termRef(2);
                  
                  {ESLVal n = $479;
                  
                  {ESLVal t = $478;
                  
                  {ESLVal _v65 = $477;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v65,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v30;
                  
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
      case "JExtendedBehaviour": {ESLVal $407 = _v28.termRef(0);
          ESLVal $406 = _v28.termRef(1);
          ESLVal $405 = _v28.termRef(2);
          ESLVal $404 = _v28.termRef(3);
          ESLVal $403 = _v28.termRef(4);
          ESLVal $402 = _v28.termRef(5);
          
          {ESLVal es = $407;
          
          {ESLVal parent = $406;
          
          {ESLVal fs = $405;
          
          {ESLVal init = $404;
          
          {ESLVal handler = $403;
          
          {ESLVal time = $402;
          
          return new ESLVal("JExtendedBehaviour",es,renameJVarsExp.apply(parent,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                switch(_v29.termName) {
                case "JField": {ESLVal $476 = _v29.termRef(0);
                  ESLVal $475 = _v29.termRef(1);
                  ESLVal $474 = _v29.termRef(2);
                  
                  {ESLVal n = $476;
                  
                  {ESLVal t = $475;
                  
                  {ESLVal _v64 = $474;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v64,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v29;
                  
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
      case "JTry": {ESLVal $401 = _v28.termRef(0);
          ESLVal $400 = _v28.termRef(1);
          ESLVal $399 = _v28.termRef(2);
          
          {ESLVal _v63 = $401;
          
          {ESLVal n = $400;
          
          {ESLVal c = $399;
          
          return new ESLVal("JTry",renameJVarsExp.apply(_v63,vars,env),n,renameJVarsCommand.apply(c,vars,env));
        }
        }
        }
        }
      case "JProbably": {ESLVal $398 = _v28.termRef(0);
          ESLVal $397 = _v28.termRef(1);
          ESLVal $396 = _v28.termRef(2);
          
          {ESLVal _v62 = $398;
          
          {ESLVal e1 = $397;
          
          {ESLVal e2 = $396;
          
          return new ESLVal("JProbably",renameJVarsExp.apply(_v62,vars,env),renameJVarsExp.apply(e1,vars,env),renameJVarsExp.apply(e2,vars,env));
        }
        }
        }
        }
      case "JGrab": {ESLVal $395 = _v28.termRef(0);
          ESLVal $394 = _v28.termRef(1);
          
          {ESLVal es = $395;
          
          {ESLVal c = $394;
          
          return new ESLVal("JGrab",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal e = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsExp.apply(e,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(es),renameJVarsExp.apply(c,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(19933,24577)").add(ESLVal.list(_v28)));
      }
      }
    }
  });
  private static ESLVal renameJVarsCmp = new ESLVal(new Function(new ESLVal("renameJVarsCmp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v33 = c;
        
        switch(_v33.termName) {
        case "JCmpList": {ESLVal $493 = _v33.termRef(0);
          
          {ESLVal e = $493;
          
          return new ESLVal("JCmpList",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JCmpOuter": {ESLVal $492 = _v33.termRef(0);
          ESLVal $491 = _v33.termRef(1);
          ESLVal $490 = _v33.termRef(2);
          
          {ESLVal n = $492;
          
          {ESLVal e = $491;
          
          {ESLVal _v59 = $490;
          
          {ESLVal _v60 = remove.apply(n,vars);
          ESLVal _v61 = addEntry.apply(n,n,env);
          
          return new ESLVal("JCmpOuter",n,renameJVarsExp.apply(e,_v60,_v61),renameJVarsCmp.apply(_v59,_v60,_v61));
        }
        }
        }
        }
        }
      case "JCmpBind": {ESLVal $489 = _v33.termRef(0);
          ESLVal $488 = _v33.termRef(1);
          ESLVal $487 = _v33.termRef(2);
          
          {ESLVal n = $489;
          
          {ESLVal e = $488;
          
          {ESLVal _v56 = $487;
          
          {ESLVal _v57 = remove.apply(n,vars);
          ESLVal _v58 = addEntry.apply(n,n,env);
          
          return new ESLVal("JCmpBind",n,renameJVarsExp.apply(e,_v57,_v58),renameJVarsCmp.apply(_v56,_v57,_v58));
        }
        }
        }
        }
        }
      case "JCmpIf": {ESLVal $486 = _v33.termRef(0);
          ESLVal $485 = _v33.termRef(1);
          
          {ESLVal e = $486;
          
          {ESLVal _v55 = $485;
          
          return new ESLVal("JCmpIf",renameJVarsExp.apply(e,vars,env),renameJVarsCmp.apply(_v55,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(24652,25233)").add(ESLVal.list(_v33)));
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
  {ESLVal _v34 = c;
        
        switch(_v34.termName) {
        case "JBlock": {ESLVal $534 = _v34.termRef(0);
          
          {ESLVal v0 = $534;
          
          return new ESLVal("JBlock",new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal c = $l0.head();
                $l0 = $l0.tail();
                $v.add(renameJVarsCommand.apply(c,vars,env));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(v0));
        }
        }
      case "JReturn": {ESLVal $533 = _v34.termRef(0);
          
          {ESLVal v0 = $533;
          
          return new ESLVal("JReturn",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JSwitch": {ESLVal $532 = _v34.termRef(0);
          ESLVal $531 = _v34.termRef(1);
          ESLVal $530 = _v34.termRef(2);
          
          {ESLVal v0 = $532;
          
          {ESLVal v1 = $531;
          
          {ESLVal v2 = $530;
          
          return error(new ESLVal("jswitch should not occur"));
        }
        }
        }
        }
      case "JSwitchList": {ESLVal $529 = _v34.termRef(0);
          ESLVal $528 = _v34.termRef(1);
          ESLVal $527 = _v34.termRef(2);
          ESLVal $526 = _v34.termRef(3);
          
          {ESLVal v0 = $529;
          
          {ESLVal v1 = $528;
          
          {ESLVal v2 = $527;
          
          {ESLVal v3 = $526;
          
          return new ESLVal("JSwitchList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JIfCommand": {ESLVal $525 = _v34.termRef(0);
          ESLVal $524 = _v34.termRef(1);
          ESLVal $523 = _v34.termRef(2);
          
          {ESLVal v0 = $525;
          
          {ESLVal v1 = $524;
          
          {ESLVal v2 = $523;
          
          return new ESLVal("JIfCommand",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $522 = _v34.termRef(0);
          ESLVal $521 = _v34.termRef(1);
          ESLVal $520 = _v34.termRef(2);
          ESLVal $519 = _v34.termRef(3);
          
          {ESLVal v0 = $522;
          
          {ESLVal v1 = $521;
          
          {ESLVal v2 = $520;
          
          {ESLVal v3 = $519;
          
          return new ESLVal("JCaseList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $518 = _v34.termRef(0);
          ESLVal $517 = _v34.termRef(1);
          ESLVal $516 = _v34.termRef(2);
          
          {ESLVal e = $518;
          
          {ESLVal arms = $517;
          
          {ESLVal alt = $516;
          
          return new ESLVal("JCaseInt",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v47 = $qualArg;
                
                switch(_v47.termName) {
                case "JIArm": {ESLVal $570 = _v47.termRef(0);
                  ESLVal $569 = _v47.termRef(1);
                  
                  {ESLVal n = $570;
                  
                  {ESLVal _v54 = $569;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand.apply(_v54,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v47;
                  
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
      case "JCaseStr": {ESLVal $515 = _v34.termRef(0);
          ESLVal $514 = _v34.termRef(1);
          ESLVal $513 = _v34.termRef(2);
          
          {ESLVal e = $515;
          
          {ESLVal arms = $514;
          
          {ESLVal alt = $513;
          
          return new ESLVal("JCaseStr",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v46 = $qualArg;
                
                switch(_v46.termName) {
                case "JSArm": {ESLVal $568 = _v46.termRef(0);
                  ESLVal $567 = _v46.termRef(1);
                  
                  {ESLVal s = $568;
                  
                  {ESLVal _v53 = $567;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand.apply(_v53,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v46;
                  
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
      case "JCaseBool": {ESLVal $512 = _v34.termRef(0);
          ESLVal $511 = _v34.termRef(1);
          ESLVal $510 = _v34.termRef(2);
          
          {ESLVal e = $512;
          
          {ESLVal arms = $511;
          
          {ESLVal alt = $510;
          
          return new ESLVal("JCaseBool",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v45 = $qualArg;
                
                switch(_v45.termName) {
                case "JBArm": {ESLVal $566 = _v45.termRef(0);
                  ESLVal $565 = _v45.termRef(1);
                  
                  {ESLVal b = $566;
                  
                  {ESLVal _v52 = $565;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand.apply(_v52,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v45;
                  
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
      case "JCaseTerm": {ESLVal $509 = _v34.termRef(0);
          ESLVal $508 = _v34.termRef(1);
          ESLVal $507 = _v34.termRef(2);
          
          {ESLVal e = $509;
          
          {ESLVal arms = $508;
          
          {ESLVal alt = $507;
          
          return new ESLVal("JCaseTerm",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v44 = $qualArg;
                
                switch(_v44.termName) {
                case "JTArm": {ESLVal $564 = _v44.termRef(0);
                  ESLVal $563 = _v44.termRef(1);
                  ESLVal $562 = _v44.termRef(2);
                  
                  {ESLVal n = $564;
                  
                  {ESLVal i = $563;
                  
                  {ESLVal _v51 = $562;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand.apply(_v51,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v44;
                  
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
      case "JLet": {ESLVal $506 = _v34.termRef(0);
          ESLVal $505 = _v34.termRef(1);
          
          {ESLVal v0 = $506;
          
          {ESLVal v1 = $505;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v41 = $qualArg;
                  
                  switch(_v41.termName) {
                  case "JField": {ESLVal $555 = _v41.termRef(0);
                    ESLVal $554 = _v41.termRef(1);
                    ESLVal $553 = _v41.termRef(2);
                    
                    {ESLVal n = $555;
                    
                    {ESLVal t = $554;
                    
                    {ESLVal e = $553;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v41;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun225"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(newName.apply());
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(boundNames);
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v42 = $qualArg;
                  
                  switch(_v42.termName) {
                  case "JField": {ESLVal $558 = _v42.termRef(0);
                    ESLVal $557 = _v42.termRef(1);
                    ESLVal $556 = _v42.termRef(2);
                    
                    {ESLVal n = $558;
                    
                    {ESLVal t = $557;
                    
                    {ESLVal e = $556;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v42;
                    
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
              {ESLVal _v43 = $qualArg;
                    
                    switch(_v43.termName) {
                    case "JField": {ESLVal $561 = _v43.termRef(0);
                      ESLVal $560 = _v43.termRef(1);
                      ESLVal $559 = _v43.termRef(2);
                      
                      {ESLVal n = $561;
                      
                      {ESLVal t = $560;
                      
                      {ESLVal e = $559;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v43;
                      
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
      case "JPLet": {ESLVal $504 = _v34.termRef(0);
          ESLVal $503 = _v34.termRef(1);
          
          {ESLVal v0 = $504;
          
          {ESLVal v1 = $503;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v38 = $qualArg;
                  
                  switch(_v38.termName) {
                  case "JField": {ESLVal $546 = _v38.termRef(0);
                    ESLVal $545 = _v38.termRef(1);
                    ESLVal $544 = _v38.termRef(2);
                    
                    {ESLVal n = $546;
                    
                    {ESLVal t = $545;
                    
                    {ESLVal e = $544;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v38;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun226"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(newName.apply());
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(boundNames);
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JPLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v39 = $qualArg;
                  
                  switch(_v39.termName) {
                  case "JField": {ESLVal $549 = _v39.termRef(0);
                    ESLVal $548 = _v39.termRef(1);
                    ESLVal $547 = _v39.termRef(2);
                    
                    {ESLVal n = $549;
                    
                    {ESLVal t = $548;
                    
                    {ESLVal e = $547;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v39;
                    
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
              {ESLVal _v40 = $qualArg;
                    
                    switch(_v40.termName) {
                    case "JField": {ESLVal $552 = _v40.termRef(0);
                      ESLVal $551 = _v40.termRef(1);
                      ESLVal $550 = _v40.termRef(2);
                      
                      {ESLVal n = $552;
                      
                      {ESLVal t = $551;
                      
                      {ESLVal e = $550;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v40;
                      
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
      case "JLetRec": {ESLVal $502 = _v34.termRef(0);
          ESLVal $501 = _v34.termRef(1);
          
          {ESLVal v0 = $502;
          
          {ESLVal v1 = $501;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v35 = $qualArg;
                  
                  switch(_v35.termName) {
                  case "JField": {ESLVal $537 = _v35.termRef(0);
                    ESLVal $536 = _v35.termRef(1);
                    ESLVal $535 = _v35.termRef(2);
                    
                    {ESLVal n = $537;
                    
                    {ESLVal t = $536;
                    
                    {ESLVal e = $535;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v35;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun227"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(newName.apply());
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(boundNames);
            
            {ESLVal _v50 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v36 = $qualArg;
                  
                  switch(_v36.termName) {
                  case "JField": {ESLVal $540 = _v36.termRef(0);
                    ESLVal $539 = _v36.termRef(1);
                    ESLVal $538 = _v36.termRef(2);
                    
                    {ESLVal n = $540;
                    
                    {ESLVal t = $539;
                    
                    {ESLVal e = $538;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,_v50),t,renameJVarsExp.apply(e,vars,_v50))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v36;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),_v50));
          }
          }
          else
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v37 = $qualArg;
                    
                    switch(_v37.termName) {
                    case "JField": {ESLVal $543 = _v37.termRef(0);
                      ESLVal $542 = _v37.termRef(1);
                      ESLVal $541 = _v37.termRef(2);
                      
                      {ESLVal n = $543;
                      
                      {ESLVal t = $542;
                      
                      {ESLVal e = $541;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v37;
                      
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
      case "JStatement": {ESLVal $500 = _v34.termRef(0);
          
          {ESLVal e = $500;
          
          return new ESLVal("JStatement",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JUpdate": {ESLVal $499 = _v34.termRef(0);
          ESLVal $498 = _v34.termRef(1);
          
          {ESLVal name = $499;
          
          {ESLVal value = $498;
          
          if(hasEntry.apply(name,env).boolVal)
          return new ESLVal("JUpdate",lookup.apply(name,env),renameJVarsExp.apply(value,vars,env));
          else
            {ESLVal v0 = $499;
              
              {ESLVal v1 = $498;
              
              return new ESLVal("JUpdate",v0,renameJVarsExp.apply(v1,vars,env));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $497 = _v34.termRef(0);
          ESLVal $496 = _v34.termRef(1);
          ESLVal $495 = _v34.termRef(2);
          ESLVal $494 = _v34.termRef(3);
          
          {ESLVal l = $497;
          
          {ESLVal n = $496;
          
          {ESLVal e = $495;
          
          {ESLVal _v49 = $494;
          
          return new ESLVal("JFor",l,n,renameJVarsExp.apply(e,vars,env),renameJVarsCommand.apply(_v49,vars,env));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(25471,29879)").add(ESLVal.list(_v34)));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v48 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v48)));
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