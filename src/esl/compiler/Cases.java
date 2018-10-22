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
  {ESLVal _v5 = as;
        
        if(_v5.isCons())
        {ESLVal $8 = _v5.head();
          ESLVal $9 = _v5.tail();
          
          switch($8.termName) {
          case "BArm": {ESLVal $10 = $8.termRef(0);
            ESLVal $11 = $8.termRef(1);
            ESLVal $12 = $8.termRef(2);
            ESLVal $13 = $8.termRef(3);
            
            {ESLVal l = $10;
            
            {ESLVal ps = $11;
            
            {ESLVal g = $12;
            
            {ESLVal e = $13;
            
            {ESLVal _v63 = $9;
            
            return translateArms.apply(_v63).cons(new ESLVal("LArm",l,ps,$nil,g,e));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1889,2030)"));
        }
        }
      else if(_v5.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1889,2030)"));
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
  {ESLVal _v6 = exp;
        
        switch(_v6.termName) {
        case "Module": {ESLVal $14 = _v6.termRef(0);
          ESLVal $15 = _v6.termRef(1);
          ESLVal $16 = _v6.termRef(2);
          ESLVal $17 = _v6.termRef(3);
          ESLVal $18 = _v6.termRef(4);
          ESLVal $19 = _v6.termRef(5);
          ESLVal $20 = _v6.termRef(6);
          
          {ESLVal path = $14;
          
          {ESLVal name = $15;
          
          {ESLVal exports = $16;
          
          {ESLVal imports = $17;
          
          {ESLVal x = $18;
          
          {ESLVal y = $19;
          
          {ESLVal defs = $20;
          
          return new ESLVal("Module",path,name,exports,imports,x,y,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v7 = $qualArg;
                
                {ESLVal d = _v7;
                
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
      case "FunExp": {ESLVal $21 = _v6.termRef(0);
          ESLVal $22 = _v6.termRef(1);
          ESLVal $23 = _v6.termRef(2);
          ESLVal $24 = _v6.termRef(3);
          ESLVal $25 = _v6.termRef(4);
          
          {ESLVal l = $21;
          
          {ESLVal n = $22;
          
          {ESLVal args = $23;
          
          {ESLVal t = $24;
          
          {ESLVal e = $25;
          
          return new ESLVal("FunExp",l,n,args,t,translateCases.apply(e));
        }
        }
        }
        }
        }
        }
      case "StrExp": {ESLVal $26 = _v6.termRef(0);
          ESLVal $27 = _v6.termRef(1);
          
          {ESLVal l = $26;
          
          {ESLVal v = $27;
          
          return exp;
        }
        }
        }
      case "IntExp": {ESLVal $28 = _v6.termRef(0);
          ESLVal $29 = _v6.termRef(1);
          
          {ESLVal l = $28;
          
          {ESLVal v = $29;
          
          return exp;
        }
        }
        }
      case "BoolExp": {ESLVal $30 = _v6.termRef(0);
          ESLVal $31 = _v6.termRef(1);
          
          {ESLVal l = $30;
          
          {ESLVal v = $31;
          
          return exp;
        }
        }
        }
      case "NullExp": {ESLVal $32 = _v6.termRef(0);
          
          {ESLVal l = $32;
          
          return exp;
        }
        }
      case "FloatExp": {ESLVal $33 = _v6.termRef(0);
          ESLVal $34 = _v6.termRef(1);
          
          {ESLVal l = $33;
          
          {ESLVal f = $34;
          
          return exp;
        }
        }
        }
      case "Term": {ESLVal $35 = _v6.termRef(0);
          ESLVal $36 = _v6.termRef(1);
          ESLVal $37 = _v6.termRef(2);
          ESLVal $38 = _v6.termRef(3);
          
          {ESLVal l = $35;
          
          {ESLVal n = $36;
          
          {ESLVal ts = $37;
          
          {ESLVal es = $38;
          
          return new ESLVal("Term",l,n,ts,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v8 = $qualArg;
                
                {ESLVal e = _v8;
                
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
      case "List": {ESLVal $39 = _v6.termRef(0);
          ESLVal $40 = _v6.termRef(1);
          
          {ESLVal l = $39;
          
          {ESLVal es = $40;
          
          return new ESLVal("List",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v9 = $qualArg;
                
                {ESLVal e = _v9;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Block": {ESLVal $41 = _v6.termRef(0);
          ESLVal $42 = _v6.termRef(1);
          
          {ESLVal l = $41;
          
          {ESLVal es = $42;
          
          return new ESLVal("Block",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v10 = $qualArg;
                
                {ESLVal e = _v10;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "Apply": {ESLVal $43 = _v6.termRef(0);
          ESLVal $44 = _v6.termRef(1);
          ESLVal $45 = _v6.termRef(2);
          
          {ESLVal l = $43;
          
          {ESLVal op = $44;
          
          {ESLVal args = $45;
          
          return new ESLVal("Apply",l,translateCases.apply(op),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v11 = $qualArg;
                
                {ESLVal e = _v11;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $46 = _v6.termRef(0);
          ESLVal $47 = _v6.termRef(1);
          ESLVal $48 = _v6.termRef(2);
          
          {ESLVal l = $46;
          
          {ESLVal op = $47;
          
          {ESLVal args = $48;
          
          return new ESLVal("ApplyTypeExp",l,translateCases.apply(op),args);
        }
        }
        }
        }
      case "Case": {ESLVal $49 = _v6.termRef(0);
          ESLVal $50 = _v6.termRef(1);
          ESLVal $51 = _v6.termRef(2);
          ESLVal $52 = _v6.termRef(3);
          
          {ESLVal l = $49;
          
          {ESLVal ds = $50;
          
          {ESLVal es = $51;
          
          {ESLVal as = $52;
          
          return compileCase.apply(l,es,translateArms.apply(as),new ESLVal("CaseError",l));
        }
        }
        }
        }
        }
      case "BinExp": {ESLVal $53 = _v6.termRef(0);
          ESLVal $54 = _v6.termRef(1);
          ESLVal $55 = _v6.termRef(2);
          ESLVal $56 = _v6.termRef(3);
          
          {ESLVal l = $53;
          
          {ESLVal e1 = $54;
          
          {ESLVal op = $55;
          
          {ESLVal e2 = $56;
          
          return new ESLVal("BinExp",l,translateCases.apply(e1),op,translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "For": {ESLVal $57 = _v6.termRef(0);
          ESLVal $58 = _v6.termRef(1);
          ESLVal $59 = _v6.termRef(2);
          ESLVal $60 = _v6.termRef(3);
          
          {ESLVal l = $57;
          
          {ESLVal p = $58;
          
          {ESLVal e1 = $59;
          
          {ESLVal e2 = $60;
          
          return new ESLVal("For",l,p,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $61 = _v6.termRef(0);
          ESLVal $62 = _v6.termRef(1);
          ESLVal $63 = _v6.termRef(2);
          
          {ESLVal l = $61;
          
          {ESLVal t = $62;
          
          {ESLVal e = $63;
          
          return new ESLVal("Throw",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Try": {ESLVal $64 = _v6.termRef(0);
          ESLVal $65 = _v6.termRef(1);
          ESLVal $66 = _v6.termRef(2);
          
          {ESLVal l = $64;
          
          {ESLVal e = $65;
          
          {ESLVal as = $66;
          
          return new ESLVal("Try",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v12 = $qualArg;
                
                {ESLVal a = _v12;
                
                return ESLVal.list(ESLVal.list(translateArm.apply(a)));
              }
              }
            }
          }).map(as).flatten().flatten());
        }
        }
        }
        }
      case "ActExp": {ESLVal $67 = _v6.termRef(0);
          ESLVal $68 = _v6.termRef(1);
          ESLVal $69 = _v6.termRef(2);
          ESLVal $70 = _v6.termRef(3);
          ESLVal $71 = _v6.termRef(4);
          ESLVal $72 = _v6.termRef(5);
          ESLVal $73 = _v6.termRef(6);
          ESLVal $74 = _v6.termRef(7);
          
          {ESLVal l = $67;
          
          {ESLVal n = $68;
          
          {ESLVal args = $69;
          
          {ESLVal x = $70;
          
          {ESLVal spec = $71;
          
          {ESLVal locals = $72;
          
          {ESLVal init = $73;
          
          {ESLVal handlers = $74;
          
          return new ESLVal("ActExp",l,n,args,x,spec,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v13 = $qualArg;
                
                {ESLVal b = _v13;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(locals).flatten().flatten(),translateCases.apply(init),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v14 = $qualArg;
                
                {ESLVal h = _v14;
                
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
      case "If": {ESLVal $75 = _v6.termRef(0);
          ESLVal $76 = _v6.termRef(1);
          ESLVal $77 = _v6.termRef(2);
          ESLVal $78 = _v6.termRef(3);
          
          {ESLVal l = $75;
          
          {ESLVal e1 = $76;
          
          {ESLVal e2 = $77;
          
          {ESLVal e3 = $78;
          
          return new ESLVal("If",l,translateCases.apply(e1),translateCases.apply(e2),translateCases.apply(e3));
        }
        }
        }
        }
        }
      case "Self": {ESLVal $79 = _v6.termRef(0);
          
          {ESLVal l = $79;
          
          return exp;
        }
        }
      case "Update": {ESLVal $80 = _v6.termRef(0);
          ESLVal $81 = _v6.termRef(1);
          ESLVal $82 = _v6.termRef(2);
          
          {ESLVal l = $80;
          
          {ESLVal n = $81;
          
          {ESLVal e = $82;
          
          return new ESLVal("Update",l,n,translateCases.apply(e));
        }
        }
        }
        }
      case "Ref": {ESLVal $83 = _v6.termRef(0);
          ESLVal $84 = _v6.termRef(1);
          ESLVal $85 = _v6.termRef(2);
          
          {ESLVal l = $83;
          
          {ESLVal e = $84;
          
          {ESLVal n = $85;
          
          return new ESLVal("Ref",l,translateCases.apply(e),n);
        }
        }
        }
        }
      case "Var": {ESLVal $86 = _v6.termRef(0);
          ESLVal $87 = _v6.termRef(1);
          
          {ESLVal l = $86;
          
          {ESLVal n = $87;
          
          return exp;
        }
        }
        }
      case "Send": {ESLVal $88 = _v6.termRef(0);
          ESLVal $89 = _v6.termRef(1);
          ESLVal $90 = _v6.termRef(2);
          
          {ESLVal l = $88;
          
          {ESLVal target = $89;
          
          {ESLVal message = $90;
          
          return new ESLVal("Send",l,translateCases.apply(target),translateCases.apply(message));
        }
        }
        }
        }
      case "Cmp": {ESLVal $91 = _v6.termRef(0);
          ESLVal $92 = _v6.termRef(1);
          ESLVal $93 = _v6.termRef(2);
          
          {ESLVal l = $91;
          
          {ESLVal e = $92;
          
          {ESLVal qs = $93;
          
          return new ESLVal("Cmp",l,translateCases.apply(e),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v15 = $qualArg;
                
                {ESLVal q = _v15;
                
                return ESLVal.list(ESLVal.list(translateQual.apply(q)));
              }
              }
            }
          }).map(qs).flatten().flatten());
        }
        }
        }
        }
      case "New": {ESLVal $94 = _v6.termRef(0);
          ESLVal $95 = _v6.termRef(1);
          ESLVal $96 = _v6.termRef(2);
          
          {ESLVal l = $94;
          
          {ESLVal b = $95;
          
          {ESLVal args = $96;
          
          return new ESLVal("New",l,translateCases.apply(b),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v16 = $qualArg;
                
                {ESLVal e = _v16;
                
                return ESLVal.list(ESLVal.list(translateCases.apply(e)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
        }
      case "NewJava": {ESLVal $97 = _v6.termRef(0);
          ESLVal $98 = _v6.termRef(1);
          ESLVal $99 = _v6.termRef(2);
          ESLVal $100 = _v6.termRef(3);
          
          {ESLVal l = $97;
          
          {ESLVal className = $98;
          
          {ESLVal t = $99;
          
          {ESLVal args = $100;
          
          return new ESLVal("NewJava",l,className,t,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v17 = $qualArg;
                
                {ESLVal e = _v17;
                
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
      case "Let": {ESLVal $101 = _v6.termRef(0);
          ESLVal $102 = _v6.termRef(1);
          ESLVal $103 = _v6.termRef(2);
          
          {ESLVal l = $101;
          
          {ESLVal bs = $102;
          
          {ESLVal e = $103;
          
          return new ESLVal("Let",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v18 = $qualArg;
                
                {ESLVal b = _v18;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Letrec": {ESLVal $104 = _v6.termRef(0);
          ESLVal $105 = _v6.termRef(1);
          ESLVal $106 = _v6.termRef(2);
          
          {ESLVal l = $104;
          
          {ESLVal bs = $105;
          
          {ESLVal e = $106;
          
          return new ESLVal("Letrec",l,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v19 = $qualArg;
                
                {ESLVal b = _v19;
                
                return ESLVal.list(ESLVal.list(translateDef.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),translateCases.apply(e));
        }
        }
        }
        }
      case "Grab": {ESLVal $107 = _v6.termRef(0);
          ESLVal $108 = _v6.termRef(1);
          ESLVal $109 = _v6.termRef(2);
          
          {ESLVal l = $107;
          
          {ESLVal rs = $108;
          
          {ESLVal e = $109;
          
          return new ESLVal("Grab",l,rs,translateCases.apply(e));
        }
        }
        }
        }
      case "Probably": {ESLVal $110 = _v6.termRef(0);
          ESLVal $111 = _v6.termRef(1);
          ESLVal $112 = _v6.termRef(2);
          ESLVal $113 = _v6.termRef(3);
          ESLVal $114 = _v6.termRef(4);
          
          {ESLVal l = $110;
          
          {ESLVal p = $111;
          
          {ESLVal t = $112;
          
          {ESLVal e1 = $113;
          
          {ESLVal e2 = $114;
          
          return new ESLVal("Probably",l,translateCases.apply(p),t,translateCases.apply(e1),translateCases.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $115 = _v6.termRef(0);
          ESLVal $116 = _v6.termRef(1);
          
          {ESLVal l = $115;
          
          {ESLVal e = $116;
          
          return new ESLVal("Not",l,translateCases.apply(e));
        }
        }
        }
      case "Fold": {ESLVal $117 = _v6.termRef(0);
          ESLVal $118 = _v6.termRef(1);
          ESLVal $119 = _v6.termRef(2);
          
          {ESLVal l = $117;
          
          {ESLVal t = $118;
          
          {ESLVal e = $119;
          
          return new ESLVal("Fold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Unfold": {ESLVal $120 = _v6.termRef(0);
          ESLVal $121 = _v6.termRef(1);
          ESLVal $122 = _v6.termRef(2);
          
          {ESLVal l = $120;
          
          {ESLVal t = $121;
          
          {ESLVal e = $122;
          
          return new ESLVal("Unfold",l,t,translateCases.apply(e));
        }
        }
        }
        }
      case "Now": {ESLVal $123 = _v6.termRef(0);
          
          {ESLVal l = $123;
          
          return exp;
        }
        }
      case "Become": {ESLVal $124 = _v6.termRef(0);
          ESLVal $125 = _v6.termRef(1);
          
          {ESLVal l = $124;
          
          {ESLVal e = $125;
          
          return new ESLVal("Become",l,translateCases.apply(e));
        }
        }
        }
        default: {ESLVal x = _v6;
          
          return error(exp);
        }
      }
      }
    }
  });
  private static ESLVal armPatterns = new ESLVal(new Function(new ESLVal("armPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v20 = arm;
        
        switch(_v20.termName) {
        case "LArm": {ESLVal $126 = _v20.termRef(0);
          ESLVal $127 = _v20.termRef(1);
          ESLVal $128 = _v20.termRef(2);
          ESLVal $129 = _v20.termRef(3);
          ESLVal $130 = _v20.termRef(4);
          
          {ESLVal l = $126;
          
          {ESLVal ps = $127;
          
          {ESLVal bs = $128;
          
          {ESLVal g = $129;
          
          {ESLVal e = $130;
          
          return ps;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5203,5283)"));
      }
      }
    }
  });
  private static ESLVal armBody = new ESLVal(new Function(new ESLVal("armBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v21 = arm;
        
        switch(_v21.termName) {
        case "LArm": {ESLVal $131 = _v21.termRef(0);
          ESLVal $132 = _v21.termRef(1);
          ESLVal $133 = _v21.termRef(2);
          ESLVal $134 = _v21.termRef(3);
          ESLVal $135 = _v21.termRef(4);
          
          {ESLVal l = $131;
          
          {ESLVal ps = $132;
          
          {ESLVal bs = $133;
          
          {ESLVal g = $134;
          
          {ESLVal e = $135;
          
          return e;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5312,5391)"));
      }
      }
    }
  });
  private static ESLVal armGuard = new ESLVal(new Function(new ESLVal("armGuard"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  {ESLVal _v22 = arm;
        
        switch(_v22.termName) {
        case "LArm": {ESLVal $136 = _v22.termRef(0);
          ESLVal $137 = _v22.termRef(1);
          ESLVal $138 = _v22.termRef(2);
          ESLVal $139 = _v22.termRef(3);
          ESLVal $140 = _v22.termRef(4);
          
          {ESLVal l = $136;
          
          {ESLVal ps = $137;
          
          {ESLVal bs = $138;
          
          {ESLVal g = $139;
          
          {ESLVal e = $140;
          
          return g;
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5421,5500)"));
      }
      }
    }
  });
  private static ESLVal setArmBody = new ESLVal(new Function(new ESLVal("setArmBody"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal e = $args[1];
  {ESLVal _v23 = arm;
        
        switch(_v23.termName) {
        case "LArm": {ESLVal $141 = _v23.termRef(0);
          ESLVal $142 = _v23.termRef(1);
          ESLVal $143 = _v23.termRef(2);
          ESLVal $144 = _v23.termRef(3);
          ESLVal $145 = _v23.termRef(4);
          
          {ESLVal l = $141;
          
          {ESLVal ps = $142;
          
          {ESLVal bs = $143;
          
          {ESLVal g = $144;
          
          {ESLVal old = $145;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5539,5636)"));
      }
      }
    }
  });
  private static ESLVal setArmPatterns = new ESLVal(new Function(new ESLVal("setArmPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal ps = $args[1];
  {ESLVal _v24 = arm;
        
        switch(_v24.termName) {
        case "LArm": {ESLVal $146 = _v24.termRef(0);
          ESLVal $147 = _v24.termRef(1);
          ESLVal $148 = _v24.termRef(2);
          ESLVal $149 = _v24.termRef(3);
          ESLVal $150 = _v24.termRef(4);
          
          {ESLVal l = $146;
          
          {ESLVal old = $147;
          
          {ESLVal bs = $148;
          
          {ESLVal g = $149;
          
          {ESLVal e = $150;
          
          return new ESLVal("LArm",l,ps,bs,g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5686,5783)"));
      }
      }
    }
  });
  private static ESLVal addArmBindings = new ESLVal(new Function(new ESLVal("addArmBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arm = $args[0];
  ESLVal newBS = $args[1];
  {ESLVal _v25 = arm;
        
        switch(_v25.termName) {
        case "LArm": {ESLVal $151 = _v25.termRef(0);
          ESLVal $152 = _v25.termRef(1);
          ESLVal $153 = _v25.termRef(2);
          ESLVal $154 = _v25.termRef(3);
          ESLVal $155 = _v25.termRef(4);
          
          {ESLVal l = $151;
          
          {ESLVal ps = $152;
          
          {ESLVal bs = $153;
          
          {ESLVal g = $154;
          
          {ESLVal e = $155;
          
          return new ESLVal("LArm",l,ps,bs.add(ESLVal.list(newBS)),g,e);
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5834,5939)"));
      }
      }
    }
  });
  private static ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v26 = p;
        
        switch(_v26.termName) {
        case "PVar": {ESLVal $156 = _v26.termRef(0);
          ESLVal $157 = _v26.termRef(1);
          ESLVal $158 = _v26.termRef(2);
          
          {ESLVal l = $156;
          
          {ESLVal n = $157;
          
          {ESLVal t = $158;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v64 = _v26;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPInt = new ESLVal(new Function(new ESLVal("isPInt"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v27 = p;
        
        switch(_v27.termName) {
        case "PInt": {ESLVal $159 = _v27.termRef(0);
          ESLVal $160 = _v27.termRef(1);
          
          {ESLVal l = $159;
          
          {ESLVal n = $160;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v65 = _v27;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPStr = new ESLVal(new Function(new ESLVal("isPStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v28 = p;
        
        switch(_v28.termName) {
        case "PStr": {ESLVal $161 = _v28.termRef(0);
          ESLVal $162 = _v28.termRef(1);
          
          {ESLVal l = $161;
          
          {ESLVal n = $162;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v66 = _v28;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPBool = new ESLVal(new Function(new ESLVal("isPBool"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v29 = p;
        
        switch(_v29.termName) {
        case "PBool": {ESLVal $163 = _v29.termRef(0);
          ESLVal $164 = _v29.termRef(1);
          
          {ESLVal l = $163;
          
          {ESLVal b = $164;
          
          return $true;
        }
        }
        }
        default: {ESLVal _v67 = _v29;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPTerm = new ESLVal(new Function(new ESLVal("isPTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v30 = p;
        
        switch(_v30.termName) {
        case "PTerm": {ESLVal $165 = _v30.termRef(0);
          ESLVal $166 = _v30.termRef(1);
          ESLVal $167 = _v30.termRef(2);
          ESLVal $168 = _v30.termRef(3);
          
          {ESLVal l = $165;
          
          {ESLVal n = $166;
          
          {ESLVal ts = $167;
          
          {ESLVal ps = $168;
          
          return $true;
        }
        }
        }
        }
        }
        default: {ESLVal _v68 = _v30;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPCons = new ESLVal(new Function(new ESLVal("isPCons"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v31 = p;
        
        switch(_v31.termName) {
        case "PCons": {ESLVal $169 = _v31.termRef(0);
          ESLVal $170 = _v31.termRef(1);
          ESLVal $171 = _v31.termRef(2);
          
          {ESLVal l = $169;
          
          {ESLVal h = $170;
          
          {ESLVal t = $171;
          
          return $true;
        }
        }
        }
        }
        default: {ESLVal _v69 = _v31;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal isPNil = new ESLVal(new Function(new ESLVal("isPNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v32 = p;
        
        switch(_v32.termName) {
        case "PNil": {ESLVal $172 = _v32.termRef(0);
          
          {ESLVal l = $172;
          
          return $true;
        }
        }
      case "PApplyType": {ESLVal $173 = _v32.termRef(0);
          ESLVal $174 = _v32.termRef(1);
          ESLVal $175 = _v32.termRef(2);
          
          switch($174.termName) {
          case "PNil": {ESLVal $176 = $174.termRef(0);
            
            {ESLVal l1 = $173;
            
            {ESLVal l2 = $176;
            
            {ESLVal ts = $175;
            
            return $true;
          }
          }
          }
          }
          default: {ESLVal _v70 = _v32;
            
            return $false;
          }
        }
        }
        default: {ESLVal _v71 = _v32;
          
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
  {ESLVal _v33 = p;
        
        switch(_v33.termName) {
        case "PTerm": {ESLVal $177 = _v33.termRef(0);
          ESLVal $178 = _v33.termRef(1);
          ESLVal $179 = _v33.termRef(2);
          ESLVal $180 = _v33.termRef(3);
          
          {ESLVal l = $177;
          
          {ESLVal n = $178;
          
          {ESLVal ts = $179;
          
          {ESLVal ps = $180;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6847,6915)"));
      }
      }
    }
  });
  private static ESLVal pTermArgs = new ESLVal(new Function(new ESLVal("pTermArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v34 = p;
        
        switch(_v34.termName) {
        case "PTerm": {ESLVal $181 = _v34.termRef(0);
          ESLVal $182 = _v34.termRef(1);
          ESLVal $183 = _v34.termRef(2);
          ESLVal $184 = _v34.termRef(3);
          
          {ESLVal l = $181;
          
          {ESLVal n = $182;
          
          {ESLVal ts = $183;
          
          {ESLVal ps = $184;
          
          return ps;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(6955,7024)"));
      }
      }
    }
  });
  private static ESLVal pVarName = new ESLVal(new Function(new ESLVal("pVarName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v35 = p;
        
        switch(_v35.termName) {
        case "PVar": {ESLVal $185 = _v35.termRef(0);
          ESLVal $186 = _v35.termRef(1);
          ESLVal $187 = _v35.termRef(2);
          
          {ESLVal l = $185;
          
          {ESLVal n = $186;
          
          {ESLVal t = $187;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7057,7107)"));
      }
      }
    }
  });
  private static ESLVal pConsHead = new ESLVal(new Function(new ESLVal("pConsHead"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v36 = p;
        
        switch(_v36.termName) {
        case "PCons": {ESLVal $188 = _v36.termRef(0);
          ESLVal $189 = _v36.termRef(1);
          ESLVal $190 = _v36.termRef(2);
          
          {ESLVal l = $188;
          
          {ESLVal h = $189;
          
          {ESLVal t = $190;
          
          return h;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7145,7203)"));
      }
      }
    }
  });
  private static ESLVal pConsTail = new ESLVal(new Function(new ESLVal("pConsTail"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v37 = p;
        
        switch(_v37.termName) {
        case "PCons": {ESLVal $191 = _v37.termRef(0);
          ESLVal $192 = _v37.termRef(1);
          ESLVal $193 = _v37.termRef(2);
          
          {ESLVal l = $191;
          
          {ESLVal h = $192;
          
          {ESLVal t = $193;
          
          return t;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7241,7299)"));
      }
      }
    }
  });
  private static ESLVal pIntValue = new ESLVal(new Function(new ESLVal("pIntValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v38 = p;
        
        switch(_v38.termName) {
        case "PInt": {ESLVal $194 = _v38.termRef(0);
          ESLVal $195 = _v38.termRef(1);
          
          {ESLVal l = $194;
          
          {ESLVal n = $195;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7333,7375)"));
      }
      }
    }
  });
  private static ESLVal pStrValue = new ESLVal(new Function(new ESLVal("pStrValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v39 = p;
        
        switch(_v39.termName) {
        case "PStr": {ESLVal $196 = _v39.termRef(0);
          ESLVal $197 = _v39.termRef(1);
          
          {ESLVal l = $196;
          
          {ESLVal n = $197;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7409,7451)"));
      }
      }
    }
  });
  private static ESLVal pBoolValue = new ESLVal(new Function(new ESLVal("pBoolValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v40 = p;
        
        switch(_v40.termName) {
        case "PBool": {ESLVal $198 = _v40.termRef(0);
          ESLVal $199 = _v40.termRef(1);
          
          {ESLVal l = $198;
          
          {ESLVal b = $199;
          
          return b;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7487,7532)"));
      }
      }
    }
  });
  private static ESLVal isEmptyPatterns = new ESLVal(new Function(new ESLVal("isEmptyPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  return forall.apply(new ESLVal(new Function(new ESLVal("fun532"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun533"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun534"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun535"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun536"),getSelf()) {
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
  return forall.apply(new ESLVal(new Function(new ESLVal("fun537"),getSelf()) {
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
  return map.apply(new ESLVal(new Function(new ESLVal("fun538"),getSelf()) {
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
  return new ESLVal(new Function(new ESLVal("fun539"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal arms = $args[0];
        LetRec letrec = new LetRec() {
              ESLVal bind = new ESLVal(new Function(new ESLVal("bind"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v72 = $args[0];
                ESLVal _v73 = $args[1];
                {ESLVal _v41 = _v72;
                      ESLVal _v42 = _v73;
                      
                      if(_v41.isCons())
                      {ESLVal $200 = _v41.head();
                        ESLVal $201 = _v41.tail();
                        
                        if(_v42.isCons())
                        {ESLVal $202 = _v42.head();
                          ESLVal $203 = _v42.tail();
                          
                          {ESLVal a = $200;
                          
                          {ESLVal _v74 = $201;
                          
                          {ESLVal v = $202;
                          
                          {ESLVal _v75 = $203;
                          
                          {ESLVal _v43 = e;
                          
                          switch(_v43.termName) {
                          case "Var": {ESLVal $206 = _v43.termRef(0);
                            ESLVal $207 = _v43.termRef(1);
                            
                            {ESLVal l = $206;
                            
                            {ESLVal n = $207;
                            
                            if(n.eql(v).boolVal)
                            return bind.apply(_v74,_v75).cons(a);
                            else
                              {ESLVal _v76 = _v43;
                                
                                return bind.apply(_v74,_v75).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v76))));
                              }
                          }
                          }
                          }
                          default: {ESLVal _v77 = _v43;
                            
                            return bind.apply(_v74,_v75).cons(addArmBindings.apply(a,ESLVal.list(new ESLVal("Binding",loc0,v,voidType,voidType,_v77))));
                          }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                      else if(_v42.isNil())
                        return error(new ESLVal("case error at Pos(9097,9407)"));
                      else return error(new ESLVal("case error at Pos(9097,9407)"));
                      }
                    else if(_v41.isNil())
                      if(_v42.isCons())
                        {ESLVal $204 = _v42.head();
                          ESLVal $205 = _v42.tail();
                          
                          return error(new ESLVal("case error at Pos(9097,9407)"));
                        }
                      else if(_v42.isNil())
                        return $nil;
                      else return error(new ESLVal("case error at Pos(9097,9407)"));
                    else return error(new ESLVal("case error at Pos(9097,9407)"));
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun540"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun541"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun542"),getSelf()) {
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
  return filter.apply(new ESLVal(new Function(new ESLVal("fun543"),getSelf()) {
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
        {ESLVal _v44 = $qualArg;
              
              {ESLVal n = _v44;
              
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
        {ESLVal _v45 = $qualArg;
              
              {ESLVal n = _v45;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",loc0,n)));
            }
            }
          }
        }).map(names).flatten().flatten().add(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v46 = $qualArg;
              
              {ESLVal a = _v46;
              
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun544"),getSelf()) {
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
  {ESLVal _v47 = armss;
        
        if(_v47.isCons())
        {ESLVal $208 = _v47.head();
          ESLVal $209 = _v47.tail();
          
          {ESLVal as = $208;
          
          {ESLVal _v78 = $209;
          
          return createTArms.apply(l,_v78,es,alt).cons(new ESLVal("TArm",sharedCnstr.apply(as),cnstrArm.apply(l,head.apply(es),tail.apply(es),as,alt)));
        }
        }
        }
      else if(_v47.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11429,11609)"));
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
        {ESLVal _v48 = $qualArg;
              
              {ESLVal a = _v48;
              
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
  {ESLVal consArms = filter.apply(new ESLVal(new Function(new ESLVal("fun545"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return isPCons.apply(head.apply(armPatterns.apply(a)));
            }
          }),arms);
        ESLVal nilArms = map.apply(dropPattern,filter.apply(new ESLVal(new Function(new ESLVal("fun546"),getSelf()) {
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun547"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return intArms.apply(c,arms);
            }
          }),ints);
        
        return new ESLVal("CaseInt",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v49 = $qualArg;
              
              {ESLVal as = _v49;
              
              return ESLVal.list(ESLVal.list(new ESLVal("IArm",sharedInt.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v79 = $args[0];
              {ESLVal _v50 = _v79;
                    
                    {ESLVal a = _v50;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun548"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return strArms.apply(c,arms);
            }
          }),strs);
        
        return new ESLVal("CaseStr",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v51 = $qualArg;
              
              {ESLVal as = _v51;
              
              return ESLVal.list(ESLVal.list(new ESLVal("SArm",sharedStr.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v80 = $args[0];
              {ESLVal _v52 = _v80;
                    
                    {ESLVal a = _v52;
                    
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
        
        {ESLVal armss = map.apply(new ESLVal(new Function(new ESLVal("fun549"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return boolArms.apply(c,arms);
            }
          }),bools);
        
        return new ESLVal("CaseBool",l,head.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v53 = $qualArg;
              
              {ESLVal as = _v53;
              
              return ESLVal.list(ESLVal.list(new ESLVal("BoolArm",sharedBool.apply(as),compileCase.apply(l,tail.apply(es),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v81 = $args[0];
              {ESLVal _v54 = _v81;
                    
                    {ESLVal a = _v54;
                    
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun550"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPTerm.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun551"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun552"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPList.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun553"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun554"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPInt.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun555"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun556"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPStr.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun557"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun558"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPBool.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun559"),getSelf()) {
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
  return compileCase.apply(l,es,select.apply(new ESLVal(new Function(new ESLVal("fun560"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return isPVar.apply(head.apply(armPatterns.apply(a)));
          }
        }),arms),compileCase.apply(l,es,reject.apply(new ESLVal(new Function(new ESLVal("fun561"),getSelf()) {
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
        
        {ESLVal nonVarPatterns = filter.apply(new ESLVal(new Function(new ESLVal("fun562"),getSelf()) {
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
  {ESLVal _v55 = arms;
        
        if(_v55.isCons())
        {ESLVal $210 = _v55.head();
          ESLVal $211 = _v55.tail();
          
          switch($210.termName) {
          case "LArm": {ESLVal $212 = $210.termRef(0);
            ESLVal $213 = $210.termRef(1);
            ESLVal $214 = $210.termRef(2);
            ESLVal $215 = $210.termRef(3);
            ESLVal $216 = $210.termRef(4);
            
            if($213.isCons())
            {ESLVal $217 = $213.head();
              ESLVal $218 = $213.tail();
              
              return error(new ESLVal("case error at Pos(16947,17103)"));
            }
          else if($213.isNil())
            {ESLVal al = $212;
              
              {ESLVal bs = $214;
              
              {ESLVal g = $215;
              
              {ESLVal e = $216;
              
              {ESLVal _v82 = $211;
              
              return foldArm.apply(al,bs,g,e,foldArms.apply(l,_v82,alt));
            }
            }
            }
            }
            }
          else return error(new ESLVal("case error at Pos(16947,17103)"));
          }
          default: return error(new ESLVal("case error at Pos(16947,17103)"));
        }
        }
      else if(_v55.isNil())
        return alt;
      else return error(new ESLVal("case error at Pos(16947,17103)"));
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
  {ESLVal _v56 = bss;
        
        if(_v56.isCons())
        {ESLVal $219 = _v56.head();
          ESLVal $220 = _v56.tail();
          
          {ESLVal bs = $219;
          
          {ESLVal _v83 = $220;
          
          return new ESLVal("Let",l,bs,foldArm.apply(l,_v83,g,e,alt));
        }
        }
        }
      else if(_v56.isNil())
        {ESLVal _v57 = g;
          
          switch(_v57.termName) {
          case "BoolExp": {ESLVal $221 = _v57.termRef(0);
            ESLVal $222 = _v57.termRef(1);
            
            switch($222.boolVal ? 1 : 0) {
            case 1: {ESLVal bl = $221;
              
              return e;
            }
            default: {ESLVal _v84 = _v57;
              
              return new ESLVal("If",l,_v84,e,alt);
            }
          }
          }
          default: {ESLVal _v85 = _v57;
            
            return new ESLVal("If",l,_v85,e,alt);
          }
        }
        }
      else return error(new ESLVal("case error at Pos(17168,17368)"));
      }
    }
  });
  private static ESLVal translateQual = new ESLVal(new Function(new ESLVal("translateQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal q = $args[0];
  {ESLVal _v58 = q;
        
        switch(_v58.termName) {
        case "BQual": {ESLVal $223 = _v58.termRef(0);
          ESLVal $224 = _v58.termRef(1);
          ESLVal $225 = _v58.termRef(2);
          
          {ESLVal l = $223;
          
          {ESLVal p = $224;
          
          {ESLVal e = $225;
          
          return new ESLVal("BQual",l,p,translateCases.apply(e));
        }
        }
        }
        }
      case "PQual": {ESLVal $226 = _v58.termRef(0);
          ESLVal $227 = _v58.termRef(1);
          
          {ESLVal l = $226;
          
          {ESLVal p = $227;
          
          return new ESLVal("PQual",l,translateCases.apply(p));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17420,17557)"));
      }
      }
    }
  });
  private static ESLVal translateArm = new ESLVal(new Function(new ESLVal("translateArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v59 = a;
        
        switch(_v59.termName) {
        case "LArm": {ESLVal $228 = _v59.termRef(0);
          ESLVal $229 = _v59.termRef(1);
          ESLVal $230 = _v59.termRef(2);
          ESLVal $231 = _v59.termRef(3);
          ESLVal $232 = _v59.termRef(4);
          
          {ESLVal l = $228;
          
          {ESLVal ps = $229;
          
          {ESLVal bs = $230;
          
          {ESLVal guard = $231;
          
          {ESLVal e = $232;
          
          return new ESLVal("LArm",l,ps,bs,translateCases.apply(guard),translateCases.apply(e));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17596,17729)"));
      }
      }
    }
  });
  private static ESLVal translateDef = new ESLVal(new Function(new ESLVal("translateDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v60 = b;
        
        switch(_v60.termName) {
        case "Binding": {ESLVal $233 = _v60.termRef(0);
          ESLVal $234 = _v60.termRef(1);
          ESLVal $235 = _v60.termRef(2);
          ESLVal $236 = _v60.termRef(3);
          ESLVal $237 = _v60.termRef(4);
          
          {ESLVal l = $233;
          
          {ESLVal name = $234;
          
          {ESLVal t = $235;
          
          {ESLVal st = $236;
          
          {ESLVal value = $237;
          
          return new ESLVal("Binding",l,name,t,st,translateCases.apply(value));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $238 = _v60.termRef(0);
          ESLVal $239 = _v60.termRef(1);
          ESLVal $240 = _v60.termRef(2);
          ESLVal $241 = _v60.termRef(3);
          
          {ESLVal l = $238;
          
          {ESLVal name = $239;
          
          {ESLVal t = $240;
          
          {ESLVal ignore = $241;
          
          return b;
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $242 = _v60.termRef(0);
          ESLVal $243 = _v60.termRef(1);
          ESLVal $244 = _v60.termRef(2);
          ESLVal $245 = _v60.termRef(3);
          
          {ESLVal l = $242;
          
          {ESLVal name = $243;
          
          {ESLVal t = $244;
          
          {ESLVal ignore = $245;
          
          return b;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $246 = _v60.termRef(0);
          ESLVal $247 = _v60.termRef(1);
          ESLVal $248 = _v60.termRef(2);
          ESLVal $249 = _v60.termRef(3);
          ESLVal $250 = _v60.termRef(4);
          ESLVal $251 = _v60.termRef(5);
          ESLVal $252 = _v60.termRef(6);
          
          {ESLVal l = $246;
          
          {ESLVal n = $247;
          
          {ESLVal args = $248;
          
          {ESLVal t = $249;
          
          {ESLVal st = $250;
          
          {ESLVal body = $251;
          
          {ESLVal guard = $252;
          
          return new ESLVal("FunBind",l,n,args,t,st,translateCases.apply(body),translateCases.apply(guard));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $253 = _v60.termRef(0);
          ESLVal $254 = _v60.termRef(1);
          ESLVal $255 = _v60.termRef(2);
          ESLVal $256 = _v60.termRef(3);
          
          {ESLVal l = $253;
          
          {ESLVal name = $254;
          
          {ESLVal t = $255;
          
          {ESLVal ignore = $256;
          
          return b;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v60;
          
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v62 = $m;
            
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
                  {ESLVal _v61 = $x;
              
              {ESLVal x = _v61;
              
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