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
  {ESLVal _v13 = d;
        
        switch(_v13.termName) {
        case "JDec": {ESLVal $128 = _v13.termRef(0);
          ESLVal $127 = _v13.termRef(1);
          
          {ESLVal n = $128;
          
          {ESLVal t = $127;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(156,201)").add(ESLVal.list(_v13)));
      }
      }
    }
  });
  private static ESLVal fieldName = new ESLVal(new Function(new ESLVal("fieldName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v12 = d;
        
        switch(_v12.termName) {
        case "JField": {ESLVal $126 = _v12.termRef(0);
          ESLVal $125 = _v12.termRef(1);
          ESLVal $124 = _v12.termRef(2);
          
          {ESLVal n = $126;
          
          {ESLVal t = $125;
          
          {ESLVal e = $124;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(236,290)").add(ESLVal.list(_v12)));
      }
      }
    }
  });
  private static ESLVal fieldJExp = new ESLVal(new Function(new ESLVal("fieldJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v11 = d;
        
        switch(_v11.termName) {
        case "JField": {ESLVal $123 = _v11.termRef(0);
          ESLVal $122 = _v11.termRef(1);
          ESLVal $121 = _v11.termRef(2);
          
          {ESLVal n = $123;
          
          {ESLVal t = $122;
          
          {ESLVal e = $121;
          
          return e;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(326,380)").add(ESLVal.list(_v11)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJModule = new ESLVal(new Function(new ESLVal("dynamicVarsJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v8 = m;
        
        switch(_v8.termName) {
        case "JModule": {ESLVal $117 = _v8.termRef(0);
          ESLVal $116 = _v8.termRef(1);
          ESLVal $115 = _v8.termRef(2);
          ESLVal $114 = _v8.termRef(3);
          
          {ESLVal n = $117;
          
          {ESLVal exports = $116;
          
          {ESLVal imports = $115;
          
          {ESLVal fs = $114;
          
          {{
          ESLVal _v9 = fs;
          while(_v9.isCons()) {
            ESLVal f = _v9.headVal;
            ((Supplier<ESLVal>)() -> { 
              {ESLVal _v10 = f;
                
                switch(_v10.termName) {
                case "JField": {ESLVal $120 = _v10.termRef(0);
                  ESLVal $119 = _v10.termRef(1);
                  ESLVal $118 = _v10.termRef(2);
                  
                  {ESLVal name = $120;
                  
                  {ESLVal t = $119;
                  
                  {ESLVal e = $118;
                  
                  return dynamicVarsJExp.apply(e);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(540,638)").add(ESLVal.list(_v10)));
              }
              }
            }).get();
            _v9 = _v9.tailVal;}
        }
        return $null;}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(420,650)").add(ESLVal.list(_v8)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJExp = new ESLVal(new Function(new ESLVal("dynamicVarsJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v7 = x;
        
        switch(_v7.termName) {
        case "JArrayRef": {ESLVal $113 = _v7.termRef(0);
          ESLVal $112 = _v7.termRef(1);
          
          {ESLVal a = $113;
          
          {ESLVal i = $112;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $111 = _v7.termRef(0);
          ESLVal $110 = _v7.termRef(1);
          ESLVal $109 = _v7.termRef(2);
          
          {ESLVal a = $111;
          
          {ESLVal i = $110;
          
          {ESLVal v = $109;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i).add(dynamicVarsJExp.apply(v)));
        }
        }
        }
        }
      case "JBecome": {ESLVal $108 = _v7.termRef(0);
          ESLVal $107 = _v7.termRef(1);
          
          {ESLVal e = $108;
          
          {ESLVal es = $107;
          
          return dynamicVarsJExp.apply(e).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun978"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v14 = $args[0];
          return dynamicVarsJExp.apply(_v14);
            }
          }),es)));
        }
        }
        }
      case "JFun": {ESLVal $106 = _v7.termRef(0);
          ESLVal $105 = _v7.termRef(1);
          ESLVal $104 = _v7.termRef(2);
          ESLVal $103 = _v7.termRef(3);
          
          {ESLVal v0 = $106;
          
          {ESLVal v1 = $105;
          
          {ESLVal v2 = $104;
          
          {ESLVal v3 = $103;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun979"),getSelf()) {
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
      case "JApply": {ESLVal $102 = _v7.termRef(0);
          ESLVal $101 = _v7.termRef(1);
          
          {ESLVal v0 = $102;
          
          {ESLVal v1 = $101;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun980"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JBinExp": {ESLVal $100 = _v7.termRef(0);
          ESLVal $99 = _v7.termRef(1);
          ESLVal $98 = _v7.termRef(2);
          
          {ESLVal v0 = $100;
          
          {ESLVal v1 = $99;
          
          {ESLVal v2 = $98;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v2));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $97 = _v7.termRef(0);
          ESLVal $96 = _v7.termRef(1);
          
          {ESLVal v0 = $97;
          
          {ESLVal v1 = $96;
          
          return dynamicVarsJCommand.apply(v0);
        }
        }
        }
      case "JIfExp": {ESLVal $95 = _v7.termRef(0);
          ESLVal $94 = _v7.termRef(1);
          ESLVal $93 = _v7.termRef(2);
          
          {ESLVal v0 = $95;
          
          {ESLVal v1 = $94;
          
          {ESLVal v2 = $93;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $92 = _v7.termRef(0);
          
          {ESLVal v0 = $92;
          
          return ESLVal.list();
        }
        }
      case "JTerm": {ESLVal $91 = _v7.termRef(0);
          ESLVal $90 = _v7.termRef(1);
          
          {ESLVal v0 = $91;
          
          {ESLVal v1 = $90;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun981"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JTermRef": {ESLVal $89 = _v7.termRef(0);
          ESLVal $88 = _v7.termRef(1);
          
          {ESLVal v0 = $89;
          
          {ESLVal v1 = $88;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JList": {ESLVal $87 = _v7.termRef(0);
          ESLVal $86 = _v7.termRef(1);
          
          {ESLVal v0 = $87;
          
          {ESLVal v1 = $86;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun982"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNil": {ESLVal $85 = _v7.termRef(0);
          
          {ESLVal v0 = $85;
          
          return ESLVal.list();
        }
        }
      case "JVar": {ESLVal $84 = _v7.termRef(0);
          ESLVal $83 = _v7.termRef(1);
          
          {ESLVal v0 = $84;
          
          {ESLVal v1 = $83;
          
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
      case "JError": {ESLVal $82 = _v7.termRef(0);
          
          {ESLVal v0 = $82;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JHead": {ESLVal $81 = _v7.termRef(0);
          
          {ESLVal v0 = $81;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JTail": {ESLVal $80 = _v7.termRef(0);
          
          {ESLVal v0 = $80;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JMapFun": {ESLVal $79 = _v7.termRef(0);
          ESLVal $78 = _v7.termRef(1);
          
          {ESLVal v0 = $79;
          
          {ESLVal v1 = $78;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JFlatten": {ESLVal $77 = _v7.termRef(0);
          
          {ESLVal v0 = $77;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNot": {ESLVal $76 = _v7.termRef(0);
          
          {ESLVal v0 = $76;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JBehaviour": {ESLVal $75 = _v7.termRef(0);
          ESLVal $74 = _v7.termRef(1);
          ESLVal $73 = _v7.termRef(2);
          ESLVal $72 = _v7.termRef(3);
          ESLVal $71 = _v7.termRef(4);
          
          {ESLVal v0 = $75;
          
          {ESLVal v1 = $74;
          
          {ESLVal v2 = $73;
          
          {ESLVal v3 = $72;
          
          {ESLVal v4 = $71;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun983"),getSelf()) {
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
      case "JExtendedBehaviour": {ESLVal $70 = _v7.termRef(0);
          ESLVal $69 = _v7.termRef(1);
          ESLVal $68 = _v7.termRef(2);
          ESLVal $67 = _v7.termRef(3);
          ESLVal $66 = _v7.termRef(4);
          ESLVal $65 = _v7.termRef(5);
          
          {ESLVal v0 = $70;
          
          {ESLVal parent = $69;
          
          {ESLVal v1 = $68;
          
          {ESLVal v2 = $67;
          
          {ESLVal v3 = $66;
          
          {ESLVal v4 = $65;
          
          return dynamicVarsJExp.apply(parent).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun984"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return dynamicVarsJFieldDef.apply(d);
            }
          }),v1)).add(dynamicVarsJExp.apply(v2).add(dynamicVarsJExp.apply(v3).add(dynamicVarsJCommand.apply(v4)))));
        }
        }
        }
        }
        }
        }
        }
      case "JNew": {ESLVal $64 = _v7.termRef(0);
          ESLVal $63 = _v7.termRef(1);
          
          {ESLVal v0 = $64;
          
          {ESLVal v1 = $63;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun985"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JNewArray": {ESLVal $62 = _v7.termRef(0);
          
          {ESLVal v0 = $62;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNewJava": {ESLVal $61 = _v7.termRef(0);
          ESLVal $60 = _v7.termRef(1);
          
          {ESLVal v0 = $61;
          
          {ESLVal v1 = $60;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun986"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNewTable": {
          return ESLVal.list();
        }
      case "JSend": {ESLVal $59 = _v7.termRef(0);
          ESLVal $58 = _v7.termRef(1);
          ESLVal $57 = _v7.termRef(2);
          
          {ESLVal v0 = $59;
          
          {ESLVal v1 = $58;
          
          {ESLVal v2 = $57;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun987"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v2)));
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $56 = _v7.termRef(0);
          
          {ESLVal e = $56;
          
          return dynamicVarsJExp.apply(e);
        }
        }
      case "JSendTimeSuper": {
          return ESLVal.list();
        }
      case "JSelf": {
          return ESLVal.list();
        }
      case "JTry": {ESLVal $55 = _v7.termRef(0);
          ESLVal $54 = _v7.termRef(1);
          ESLVal $53 = _v7.termRef(2);
          
          {ESLVal e = $55;
          
          {ESLVal n = $54;
          
          {ESLVal c = $53;
          
          return dynamicVarsJExp.apply(e).add(dynamicVarsJCommand.apply(c));
        }
        }
        }
        }
      case "JRef": {ESLVal $52 = _v7.termRef(0);
          ESLVal $51 = _v7.termRef(1);
          
          {ESLVal v0 = $52;
          
          {ESLVal v1 = $51;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JRefSuper": {ESLVal $50 = _v7.termRef(0);
          
          {ESLVal n = $50;
          
          return ESLVal.list();
        }
        }
      case "JGrab": {ESLVal $49 = _v7.termRef(0);
          ESLVal $48 = _v7.termRef(1);
          
          {ESLVal v0 = $49;
          
          {ESLVal v1 = $48;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun988"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v0)).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JProbably": {ESLVal $47 = _v7.termRef(0);
          ESLVal $46 = _v7.termRef(1);
          ESLVal $45 = _v7.termRef(2);
          
          {ESLVal v0 = $47;
          
          {ESLVal v1 = $46;
          
          {ESLVal v2 = $45;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(726,3843)").add(ESLVal.list(_v7)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJFieldDef = new ESLVal(new Function(new ESLVal("dynamicVarsJFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v6 = d;
        
        switch(_v6.termName) {
        case "JField": {ESLVal $44 = _v6.termRef(0);
          ESLVal $43 = _v6.termRef(1);
          ESLVal $42 = _v6.termRef(2);
          
          {ESLVal n = $44;
          
          {ESLVal t = $43;
          
          {ESLVal e = $42;
          
          return dynamicVarsJExp.apply(e);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3893,3964)").add(ESLVal.list(_v6)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJTermArm = new ESLVal(new Function(new ESLVal("dynamicVarsJTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v5 = t;
        
        switch(_v5.termName) {
        case "JTArm": {ESLVal $41 = _v5.termRef(0);
          ESLVal $40 = _v5.termRef(1);
          ESLVal $39 = _v5.termRef(2);
          
          {ESLVal n = $41;
          
          {ESLVal i = $40;
          
          {ESLVal c = $39;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4011,4087)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJIntArm = new ESLVal(new Function(new ESLVal("dynamicVarsJIntArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v4 = t;
        
        switch(_v4.termName) {
        case "JIArm": {ESLVal $38 = _v4.termRef(0);
          ESLVal $37 = _v4.termRef(1);
          
          {ESLVal i = $38;
          
          {ESLVal c = $37;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4132,4201)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJStrArm = new ESLVal(new Function(new ESLVal("dynamicVarsJStrArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v3 = t;
        
        switch(_v3.termName) {
        case "JSArm": {ESLVal $36 = _v3.termRef(0);
          ESLVal $35 = _v3.termRef(1);
          
          {ESLVal s = $36;
          
          {ESLVal c = $35;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4246,4315)").add(ESLVal.list(_v3)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJBoolArm = new ESLVal(new Function(new ESLVal("dynamicVarsJBoolArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v2 = t;
        
        switch(_v2.termName) {
        case "JBArm": {ESLVal $34 = _v2.termRef(0);
          ESLVal $33 = _v2.termRef(1);
          
          {ESLVal b = $34;
          
          {ESLVal c = $33;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4362,4433)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJCommand = new ESLVal(new Function(new ESLVal("dynamicVarsJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v1 = x;
        
        switch(_v1.termName) {
        case "JBlock": {ESLVal $32 = _v1.termRef(0);
          
          {ESLVal v0 = $32;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun989"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJCommand.apply(e);
            }
          }),v0));
        }
        }
      case "JReturn": {ESLVal $31 = _v1.termRef(0);
          
          {ESLVal v0 = $31;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JIfCommand": {ESLVal $30 = _v1.termRef(0);
          ESLVal $29 = _v1.termRef(1);
          ESLVal $28 = _v1.termRef(2);
          
          {ESLVal v0 = $30;
          
          {ESLVal v1 = $29;
          
          {ESLVal v2 = $28;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $27 = _v1.termRef(0);
          ESLVal $26 = _v1.termRef(1);
          ESLVal $25 = _v1.termRef(2);
          ESLVal $24 = _v1.termRef(3);
          
          {ESLVal v0 = $27;
          
          {ESLVal v1 = $26;
          
          {ESLVal v2 = $25;
          
          {ESLVal v3 = $24;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2).add(dynamicVarsJCommand.apply(v3))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $23 = _v1.termRef(0);
          ESLVal $22 = _v1.termRef(1);
          ESLVal $21 = _v1.termRef(2);
          
          {ESLVal v0 = $23;
          
          {ESLVal v1 = $22;
          
          {ESLVal v2 = $21;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun990"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJTermArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $20 = _v1.termRef(0);
          ESLVal $19 = _v1.termRef(1);
          ESLVal $18 = _v1.termRef(2);
          
          {ESLVal v0 = $20;
          
          {ESLVal v1 = $19;
          
          {ESLVal v2 = $18;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun991"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJIntArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $17 = _v1.termRef(0);
          ESLVal $16 = _v1.termRef(1);
          ESLVal $15 = _v1.termRef(2);
          
          {ESLVal v0 = $17;
          
          {ESLVal v1 = $16;
          
          {ESLVal v2 = $15;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun992"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJStrArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $14 = _v1.termRef(0);
          ESLVal $13 = _v1.termRef(1);
          ESLVal $12 = _v1.termRef(2);
          
          {ESLVal v0 = $14;
          
          {ESLVal v1 = $13;
          
          {ESLVal v2 = $12;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun993"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJBoolArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JLet": {ESLVal $11 = _v1.termRef(0);
          ESLVal $10 = _v1.termRef(1);
          
          {ESLVal v0 = $11;
          
          {ESLVal v1 = $10;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun994"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun995"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JLetRec": {ESLVal $9 = _v1.termRef(0);
          ESLVal $8 = _v1.termRef(1);
          
          {ESLVal v0 = $9;
          
          {ESLVal v1 = $8;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun996"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun997"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JUpdate": {ESLVal $7 = _v1.termRef(0);
          ESLVal $6 = _v1.termRef(1);
          
          {ESLVal v0 = $7;
          
          {ESLVal v1 = $6;
          
          return ESLVal.list(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JStatement": {ESLVal $5 = _v1.termRef(0);
          
          {ESLVal v0 = $5;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JFor": {ESLVal $4 = _v1.termRef(0);
          ESLVal $3 = _v1.termRef(1);
          ESLVal $2 = _v1.termRef(2);
          ESLVal $1 = _v1.termRef(3);
          
          {ESLVal listName = $4;
          
          {ESLVal v0 = $3;
          
          {ESLVal v1 = $2;
          
          {ESLVal v2 = $1;
          
          return ESLVal.list(listName).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4523,6450)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}