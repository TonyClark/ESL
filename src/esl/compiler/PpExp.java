package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.DynamicVars.*;
import static esl.compiler.Strings.*;
import java.util.function.Supplier;
public class PpExp {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal p0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal indentStr = new ESLVal(new Function(new ESLVal("indentStr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  if(indent.eql($zero).boolVal)
        return new ESLVal("");
        else
          return new ESLVal(" ").add(indentStr.apply(indent.sub($one)));
    }
  });
  private static ESLVal nl = new ESLVal(new Function(new ESLVal("nl"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  return new ESLVal("\n").add(indentStr.apply(indent));
    }
  });
  private static ESLVal ppJoin = new ESLVal(new Function(new ESLVal("ppJoin"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal ss = $args[1];
  {ESLVal _v1 = ss;
        
        if(_v1.isCons())
        {ESLVal $1 = _v1.head();
          ESLVal $2 = _v1.tail();
          
          if($2.isCons())
          {ESLVal $3 = $2.head();
            ESLVal $4 = $2.tail();
            
            if($4.isCons())
            {ESLVal $5 = $4.head();
              ESLVal $6 = $4.tail();
              
              {ESLVal s = $1;
              
              {ESLVal _v45 = $2;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v45)));
            }
            }
            }
          else if($4.isNil())
            {ESLVal s1 = $1;
              
              {ESLVal s2 = $3;
              
              return s1.add(nl.apply(indent).add(s2));
            }
            }
          else {ESLVal s = $1;
              
              {ESLVal _v46 = $2;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v46)));
            }
            }
          }
        else if($2.isNil())
          {ESLVal s = $1;
            
            return s;
          }
        else {ESLVal s = $1;
            
            {ESLVal _v47 = $2;
            
            return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v47)));
          }
          }
        }
      else if(_v1.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(439,597)"));
      }
    }
  });
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v4 = env;
        while(_v4.isCons()) {
          ESLVal _v3 = _v4.headVal;
          {ESLVal _v2 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v5 = _v3;
                    
                    switch(_v5.termName) {
                    case "Map": {ESLVal $7 = _v5.termRef(0);
                      ESLVal $8 = _v5.termRef(1);
                      
                      {ESLVal n = $7;
                      
                      {ESLVal t = $8;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v5;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v2.apply();
          }
          _v4 = _v4.tailVal;}
      }
      return s[0].add(new ESLVal("]"));}
      }
    }
  });
  public static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  return map.apply(ppType,ts);
    }
  });
  public static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v6 = t;
        
        switch(_v6.termName) {
        case "ActType": {ESLVal $9 = _v6.termRef(0);
          ESLVal $10 = _v6.termRef(1);
          ESLVal $11 = _v6.termRef(2);
          
          {ESLVal l = $9;
          
          {ESLVal decs = $10;
          
          {ESLVal handlers = $11;
          
          return new ESLVal("").add(t);
        }
        }
        }
        }
      case "ApplyType": {ESLVal $12 = _v6.termRef(0);
          ESLVal $13 = _v6.termRef(1);
          ESLVal $14 = _v6.termRef(2);
          
          {ESLVal l = $12;
          
          {ESLVal n = $13;
          
          {ESLVal args = $14;
          
          return n.add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $15 = _v6.termRef(0);
          ESLVal $16 = _v6.termRef(1);
          ESLVal $17 = _v6.termRef(2);
          
          {ESLVal l = $15;
          
          {ESLVal op = $16;
          
          {ESLVal args = $17;
          
          return ppType.apply(op).add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $18 = _v6.termRef(0);
          ESLVal $19 = _v6.termRef(1);
          
          {ESLVal l = $18;
          
          {ESLVal _v48 = $19;
          
          return new ESLVal("Array[").add(ppType.apply(_v48).add(new ESLVal("]")));
        }
        }
        }
      case "BoolType": {ESLVal $20 = _v6.termRef(0);
          
          {ESLVal l = $20;
          
          return new ESLVal("Bool");
        }
        }
      case "FloatType": {ESLVal $21 = _v6.termRef(0);
          
          {ESLVal l = $21;
          
          return new ESLVal("Float");
        }
        }
      case "FieldType": {ESLVal $22 = _v6.termRef(0);
          ESLVal $23 = _v6.termRef(1);
          ESLVal $24 = _v6.termRef(2);
          
          {ESLVal l = $22;
          
          {ESLVal n = $23;
          
          {ESLVal _v49 = $24;
          
          return n.add(new ESLVal("::").add(ppType.apply(_v49)));
        }
        }
        }
        }
      case "ForallType": {ESLVal $25 = _v6.termRef(0);
          ESLVal $26 = _v6.termRef(1);
          ESLVal $27 = _v6.termRef(2);
          
          {ESLVal l = $25;
          
          {ESLVal ns = $26;
          
          {ESLVal _v50 = $27;
          
          return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v50))));
        }
        }
        }
        }
      case "FunType": {ESLVal $28 = _v6.termRef(0);
          ESLVal $29 = _v6.termRef(1);
          ESLVal $30 = _v6.termRef(2);
          
          {ESLVal l = $28;
          
          {ESLVal d = $29;
          
          {ESLVal r = $30;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $31 = _v6.termRef(0);
          ESLVal $32 = _v6.termRef(1);
          ESLVal $33 = _v6.termRef(2);
          ESLVal $34 = _v6.termRef(3);
          
          {ESLVal l = $31;
          
          {ESLVal d = $32;
          
          {ESLVal p = $33;
          
          {ESLVal r = $34;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $35 = _v6.termRef(0);
          
          {ESLVal l = $35;
          
          return new ESLVal("Int");
        }
        }
      case "ListType": {ESLVal $36 = _v6.termRef(0);
          ESLVal $37 = _v6.termRef(1);
          
          {ESLVal l = $36;
          
          {ESLVal _v51 = $37;
          
          return new ESLVal("[").add(ppType.apply(_v51).add(new ESLVal("]")));
        }
        }
        }
      case "NullType": {ESLVal $38 = _v6.termRef(0);
          
          {ESLVal l = $38;
          
          return new ESLVal("Null");
        }
        }
      case "RecType": {ESLVal $39 = _v6.termRef(0);
          ESLVal $40 = _v6.termRef(1);
          ESLVal $41 = _v6.termRef(2);
          
          {ESLVal l = $39;
          
          {ESLVal n = $40;
          
          {ESLVal _v52 = $41;
          
          return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v52))));
        }
        }
        }
        }
      case "RecordType": {ESLVal $42 = _v6.termRef(0);
          ESLVal $43 = _v6.termRef(1);
          
          {ESLVal l = $42;
          
          {ESLVal fs = $43;
          
          return new ESLVal("{").add(ppTypes.apply(fs).add(new ESLVal("}")));
        }
        }
        }
      case "StrType": {ESLVal $44 = _v6.termRef(0);
          
          {ESLVal l = $44;
          
          return new ESLVal("Str");
        }
        }
      case "TermType": {ESLVal $45 = _v6.termRef(0);
          ESLVal $46 = _v6.termRef(1);
          ESLVal $47 = _v6.termRef(2);
          
          {ESLVal l = $45;
          
          {ESLVal n = $46;
          
          {ESLVal ts = $47;
          
          return n.add(map.apply(ppType,ts));
        }
        }
        }
        }
      case "TypeFun": {ESLVal $48 = _v6.termRef(0);
          ESLVal $49 = _v6.termRef(1);
          ESLVal $50 = _v6.termRef(2);
          
          {ESLVal l = $48;
          
          {ESLVal ns = $49;
          
          {ESLVal _v53 = $50;
          
          return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v53))));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $51 = _v6.termRef(0);
          ESLVal $52 = _v6.termRef(1);
          
          {ESLVal l = $51;
          
          {ESLVal _v54 = $52;
          
          return new ESLVal("unfold ").add(ppType.apply(_v54));
        }
        }
        }
      case "UnionType": {ESLVal $53 = _v6.termRef(0);
          ESLVal $54 = _v6.termRef(1);
          
          {ESLVal l = $53;
          
          {ESLVal ts = $54;
          
          return new ESLVal("union ").add(map.apply(ppType,ts));
        }
        }
        }
      case "VarType": {ESLVal $55 = _v6.termRef(0);
          ESLVal $56 = _v6.termRef(1);
          
          {ESLVal l = $55;
          
          {ESLVal n = $56;
          
          return n;
        }
        }
        }
      case "VoidType": {ESLVal $57 = _v6.termRef(0);
          
          {ESLVal l = $57;
          
          return new ESLVal("Void");
        }
        }
      case "UnionRef": {ESLVal $58 = _v6.termRef(0);
          ESLVal $59 = _v6.termRef(1);
          ESLVal $60 = _v6.termRef(2);
          
          {ESLVal l = $58;
          
          {ESLVal _v55 = $59;
          
          {ESLVal n = $60;
          
          return ppType.apply(_v55).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $61 = _v6.termRef(0);
          
          {ESLVal f = $61;
          
          return f.add(new ESLVal(""));
        }
        }
        default: {ESLVal x = _v6;
          
          return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
        }
      }
      }
    }
  });
  public static ESLVal ppExps = new ESLVal(new Function(new ESLVal("ppExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exps = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v7 = exps;
        
        if(_v7.isCons())
        {ESLVal $62 = _v7.head();
          ESLVal $63 = _v7.tail();
          
          if($63.isCons())
          {ESLVal $64 = $63.head();
            ESLVal $65 = $63.tail();
            
            {ESLVal e1 = $62;
            
            {ESLVal e2 = $64;
            
            {ESLVal es = $65;
            
            return ppExp.apply(indent,e1).add(sep.add(ppExps.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($63.isNil())
          {ESLVal e = $62;
            
            return ppExp.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(2333,2491)"));
        }
      else if(_v7.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(2333,2491)"));
      }
    }
  });
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v8 = p;
        
        switch(_v8.termName) {
        case "PVar": {ESLVal $66 = _v8.termRef(0);
          ESLVal $67 = _v8.termRef(1);
          ESLVal $68 = _v8.termRef(2);
          
          {ESLVal l = $66;
          
          {ESLVal n = $67;
          
          {ESLVal t = $68;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $69 = _v8.termRef(0);
          ESLVal $70 = _v8.termRef(1);
          ESLVal $71 = _v8.termRef(2);
          ESLVal $72 = _v8.termRef(3);
          
          if($71.isCons())
          {ESLVal $73 = $71.head();
            ESLVal $74 = $71.tail();
            
            {ESLVal l = $69;
            
            {ESLVal n = $70;
            
            {ESLVal ts = $71;
            
            {ESLVal ps = $72;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
          }
        else if($71.isNil())
          {ESLVal l = $69;
            
            {ESLVal n = $70;
            
            {ESLVal ps = $72;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $69;
            
            {ESLVal n = $70;
            
            {ESLVal ts = $71;
            
            {ESLVal ps = $72;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $75 = _v8.termRef(0);
          ESLVal $76 = _v8.termRef(1);
          ESLVal $77 = _v8.termRef(2);
          
          {ESLVal l = $75;
          
          {ESLVal _v56 = $76;
          
          {ESLVal ts = $77;
          
          return ppPattern.apply(_v56);
        }
        }
        }
        }
      case "PNil": {ESLVal $78 = _v8.termRef(0);
          
          {ESLVal l = $78;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $79 = _v8.termRef(0);
          ESLVal $80 = _v8.termRef(1);
          
          {ESLVal l = $79;
          
          {ESLVal n = $80;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $81 = _v8.termRef(0);
          ESLVal $82 = _v8.termRef(1);
          
          {ESLVal l = $81;
          
          {ESLVal b = $82;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $83 = _v8.termRef(0);
          ESLVal $84 = _v8.termRef(1);
          
          {ESLVal l = $83;
          
          {ESLVal s = $84;
          
          return new ESLVal("\'").add(s.add(new ESLVal("\'")));
        }
        }
        }
      case "PCons": {ESLVal $85 = _v8.termRef(0);
          ESLVal $86 = _v8.termRef(1);
          ESLVal $87 = _v8.termRef(2);
          
          {ESLVal l = $85;
          
          {ESLVal h = $86;
          
          {ESLVal t = $87;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v57 = _v8;
          
          return new ESLVal("<unknown: ").add(_v57.add(new ESLVal(">")));
        }
      }
      }
    }
  });
  private static ESLVal ppPatterns = new ESLVal(new Function(new ESLVal("ppPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ps = $args[0];
  return map.apply(ppPattern,ps);
    }
  });
  public static ESLVal ppExp = new ESLVal(new Function(new ESLVal("ppExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exp = $args[1];
  {ESLVal _v9 = exp;
        
        switch(_v9.termName) {
        case "Module": {ESLVal $88 = _v9.termRef(0);
          ESLVal $89 = _v9.termRef(1);
          ESLVal $90 = _v9.termRef(2);
          ESLVal $91 = _v9.termRef(3);
          ESLVal $92 = _v9.termRef(4);
          ESLVal $93 = _v9.termRef(5);
          ESLVal $94 = _v9.termRef(6);
          
          {ESLVal path = $88;
          
          {ESLVal name = $89;
          
          {ESLVal exports = $90;
          
          {ESLVal imports = $91;
          
          {ESLVal x = $92;
          
          {ESLVal y = $93;
          
          {ESLVal defs = $94;
          
          return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(2)),defs).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "Var": {ESLVal $95 = _v9.termRef(0);
          ESLVal $96 = _v9.termRef(1);
          
          {ESLVal l = $95;
          
          {ESLVal n = $96;
          
          return n;
        }
        }
        }
      case "StrExp": {ESLVal $97 = _v9.termRef(0);
          ESLVal $98 = _v9.termRef(1);
          
          {ESLVal l = $97;
          
          {ESLVal v = $98;
          
          return new ESLVal("\'").add(v.add(new ESLVal("\'")));
        }
        }
        }
      case "IntExp": {ESLVal $99 = _v9.termRef(0);
          ESLVal $100 = _v9.termRef(1);
          
          {ESLVal l = $99;
          
          {ESLVal v = $100;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "BoolExp": {ESLVal $101 = _v9.termRef(0);
          ESLVal $102 = _v9.termRef(1);
          
          {ESLVal l = $101;
          
          {ESLVal v = $102;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "NullExp": {ESLVal $103 = _v9.termRef(0);
          
          {ESLVal l = $103;
          
          return new ESLVal("null");
        }
        }
      case "FloatExp": {ESLVal $104 = _v9.termRef(0);
          ESLVal $105 = _v9.termRef(1);
          
          {ESLVal l = $104;
          
          {ESLVal f = $105;
          
          return f.add(new ESLVal(""));
        }
        }
        }
      case "Apply": {ESLVal $106 = _v9.termRef(0);
          ESLVal $107 = _v9.termRef(1);
          ESLVal $108 = _v9.termRef(2);
          
          {ESLVal l = $106;
          
          {ESLVal op = $107;
          
          {ESLVal args = $108;
          
          return ppExp.apply(indent,op).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $109 = _v9.termRef(0);
          ESLVal $110 = _v9.termRef(1);
          ESLVal $111 = _v9.termRef(2);
          
          {ESLVal l = $109;
          
          {ESLVal op = $110;
          
          {ESLVal args = $111;
          
          return ppExp.apply(indent,op);
        }
        }
        }
        }
      case "Block": {ESLVal $112 = _v9.termRef(0);
          ESLVal $113 = _v9.termRef(1);
          
          {ESLVal l = $112;
          
          {ESLVal es = $113;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppExps.apply(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl.apply(indent).add(new ESLVal("}")))));
        }
        }
        }
      case "Case": {ESLVal $114 = _v9.termRef(0);
          ESLVal $115 = _v9.termRef(1);
          ESLVal $116 = _v9.termRef(2);
          ESLVal $117 = _v9.termRef(3);
          
          {ESLVal l = $114;
          
          {ESLVal ds = $115;
          
          {ESLVal es = $116;
          
          {ESLVal as = $117;
          
          return new ESLVal("case ").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9396"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $118 = _v9.termRef(0);
          ESLVal $119 = _v9.termRef(1);
          ESLVal $120 = _v9.termRef(2);
          ESLVal $121 = _v9.termRef(3);
          
          {ESLVal l = $118;
          
          {ESLVal e = $119;
          
          {ESLVal arms = $120;
          
          {ESLVal alt = $121;
          
          return new ESLVal("caseTerm ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9397"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseTermArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $122 = _v9.termRef(0);
          ESLVal $123 = _v9.termRef(1);
          ESLVal $124 = _v9.termRef(2);
          ESLVal $125 = _v9.termRef(3);
          ESLVal $126 = _v9.termRef(4);
          
          {ESLVal l = $122;
          
          {ESLVal e = $123;
          
          {ESLVal cons = $124;
          
          {ESLVal nil = $125;
          
          {ESLVal alt = $126;
          
          return new ESLVal("caseList ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),cons).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),nil).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))))))))));
        }
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $127 = _v9.termRef(0);
          ESLVal $128 = _v9.termRef(1);
          ESLVal $129 = _v9.termRef(2);
          ESLVal $130 = _v9.termRef(3);
          
          {ESLVal l = $127;
          
          {ESLVal e = $128;
          
          {ESLVal arms = $129;
          
          {ESLVal alt = $130;
          
          return new ESLVal("caseInt ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9398"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseIntsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $131 = _v9.termRef(0);
          ESLVal $132 = _v9.termRef(1);
          ESLVal $133 = _v9.termRef(2);
          ESLVal $134 = _v9.termRef(3);
          
          {ESLVal l = $131;
          
          {ESLVal e = $132;
          
          {ESLVal arms = $133;
          
          {ESLVal alt = $134;
          
          return new ESLVal("caseStr ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9399"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseStrsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $135 = _v9.termRef(0);
          ESLVal $136 = _v9.termRef(1);
          ESLVal $137 = _v9.termRef(2);
          ESLVal $138 = _v9.termRef(3);
          
          {ESLVal l = $135;
          
          {ESLVal e = $136;
          
          {ESLVal arms = $137;
          
          {ESLVal alt = $138;
          
          return new ESLVal("caseBool ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9400"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppCaseBoolsArm.apply(indent.add(new ESLVal(2)),a);
            }
          }),arms)).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
        }
      case "CaseError": {ESLVal $139 = _v9.termRef(0);
          
          {ESLVal l = $139;
          
          return new ESLVal("caseError()");
        }
        }
      case "Head": {ESLVal $140 = _v9.termRef(0);
          
          {ESLVal e = $140;
          
          return new ESLVal("head(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Tail": {ESLVal $141 = _v9.termRef(0);
          
          {ESLVal e = $141;
          
          return new ESLVal("tail(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Cons": {ESLVal $142 = _v9.termRef(0);
          ESLVal $143 = _v9.termRef(1);
          
          {ESLVal h = $142;
          
          {ESLVal t = $143;
          
          return new ESLVal("cons(").add(ppExp.apply(indent,h).add(new ESLVal(",").add(ppExp.apply(indent,t).add(new ESLVal(")")))));
        }
        }
        }
      case "If": {ESLVal $144 = _v9.termRef(0);
          ESLVal $145 = _v9.termRef(1);
          ESLVal $146 = _v9.termRef(2);
          ESLVal $147 = _v9.termRef(3);
          
          {ESLVal l = $144;
          
          {ESLVal e1 = $145;
          
          {ESLVal e2 = $146;
          
          {ESLVal e3 = $147;
          
          return new ESLVal("if ").add(ppExp.apply(indent,e1).add(nl.apply(indent).add(new ESLVal("then").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(nl.apply(indent).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e3))))))))));
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $148 = _v9.termRef(0);
          ESLVal $149 = _v9.termRef(1);
          ESLVal $150 = _v9.termRef(2);
          ESLVal $151 = _v9.termRef(3);
          ESLVal $152 = _v9.termRef(4);
          
          {ESLVal l = $148;
          
          {ESLVal n = $149;
          
          {ESLVal args = $150;
          
          {ESLVal t = $151;
          
          {ESLVal e = $152;
          
          return new ESLVal("fun(").add(ppDecs.apply(indent,args).add(new ESLVal(")::").add(ppType.apply(t).add(new ESLVal(" ").add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        }
        }
        }
      case "Let": {ESLVal $153 = _v9.termRef(0);
          ESLVal $154 = _v9.termRef(1);
          ESLVal $155 = _v9.termRef(2);
          
          {ESLVal l = $153;
          
          {ESLVal bs = $154;
          
          {ESLVal e = $155;
          
          return new ESLVal("let ").add(ppBinds.apply(indent.add(new ESLVal(4)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "Letrec": {ESLVal $156 = _v9.termRef(0);
          ESLVal $157 = _v9.termRef(1);
          ESLVal $158 = _v9.termRef(2);
          
          {ESLVal l = $156;
          
          {ESLVal bs = $157;
          
          {ESLVal e = $158;
          
          return new ESLVal("letrec ").add(ppBinds.apply(indent.add(new ESLVal(7)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "List": {ESLVal $159 = _v9.termRef(0);
          ESLVal $160 = _v9.termRef(1);
          
          {ESLVal l = $159;
          
          {ESLVal es = $160;
          
          return new ESLVal("[").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal("]")));
        }
        }
        }
      case "Throw": {ESLVal $161 = _v9.termRef(0);
          ESLVal $162 = _v9.termRef(1);
          ESLVal $163 = _v9.termRef(2);
          
          {ESLVal l = $161;
          
          {ESLVal t = $162;
          
          {ESLVal e = $163;
          
          return new ESLVal("throw ").add(ppExp.apply(indent,e));
        }
        }
        }
        }
      case "Term": {ESLVal $164 = _v9.termRef(0);
          ESLVal $165 = _v9.termRef(1);
          ESLVal $166 = _v9.termRef(2);
          ESLVal $167 = _v9.termRef(3);
          
          {ESLVal l = $164;
          
          {ESLVal n = $165;
          
          {ESLVal ts = $166;
          
          {ESLVal es = $167;
          
          return n.add(new ESLVal("(").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $168 = _v9.termRef(0);
          ESLVal $169 = _v9.termRef(1);
          
          {ESLVal e = $168;
          
          {ESLVal n = $169;
          
          return new ESLVal("termRef(").add(ppExp.apply(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
        }
        }
        }
      case "BinExp": {ESLVal $170 = _v9.termRef(0);
          ESLVal $171 = _v9.termRef(1);
          ESLVal $172 = _v9.termRef(2);
          ESLVal $173 = _v9.termRef(3);
          
          {ESLVal l = $170;
          
          {ESLVal e1 = $171;
          
          {ESLVal op = $172;
          
          {ESLVal e2 = $173;
          
          return ppExp.apply(indent,e1).add(op.add(ppExp.apply(indent,e2)));
        }
        }
        }
        }
        }
      case "Update": {ESLVal $174 = _v9.termRef(0);
          ESLVal $175 = _v9.termRef(1);
          ESLVal $176 = _v9.termRef(2);
          
          {ESLVal l = $174;
          
          {ESLVal n = $175;
          
          {ESLVal e = $176;
          
          return n.add(new ESLVal(" := ").add(ppExp.apply(indent,e)));
        }
        }
        }
        }
      case "NewArray": {ESLVal $177 = _v9.termRef(0);
          ESLVal $178 = _v9.termRef(1);
          ESLVal $179 = _v9.termRef(2);
          
          {ESLVal l = $177;
          
          {ESLVal t = $178;
          
          {ESLVal n = $179;
          
          return new ESLVal("new Array[").add(ppType.apply(t).add(new ESLVal("](").add(ppExp.apply(indent,n).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "For": {ESLVal $180 = _v9.termRef(0);
          ESLVal $181 = _v9.termRef(1);
          ESLVal $182 = _v9.termRef(2);
          ESLVal $183 = _v9.termRef(3);
          
          {ESLVal l = $180;
          
          {ESLVal p = $181;
          
          {ESLVal e1 = $182;
          
          {ESLVal e2 = $183;
          
          return new ESLVal("for ").add(ppPattern.apply(p).add(new ESLVal(" in ").add(ppExp.apply(indent,e1).add(new ESLVal(" do {").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
        }
        }
        }
        }
        }
      case "Try": {ESLVal $184 = _v9.termRef(0);
          ESLVal $185 = _v9.termRef(1);
          ESLVal $186 = _v9.termRef(2);
          
          {ESLVal l = $184;
          
          {ESLVal e = $185;
          
          {ESLVal as = $186;
          
          return new ESLVal("try ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9401"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
      case "ActExp": {ESLVal $187 = _v9.termRef(0);
          ESLVal $188 = _v9.termRef(1);
          ESLVal $189 = _v9.termRef(2);
          ESLVal $190 = _v9.termRef(3);
          ESLVal $191 = _v9.termRef(4);
          ESLVal $192 = _v9.termRef(5);
          ESLVal $193 = _v9.termRef(6);
          ESLVal $194 = _v9.termRef(7);
          
          {ESLVal l = $187;
          
          {ESLVal n = $188;
          
          {ESLVal args = $189;
          
          {ESLVal x = $190;
          
          {ESLVal spec = $191;
          
          {ESLVal locals = $192;
          
          {ESLVal init = $193;
          
          {ESLVal handlers = $194;
          
          return new ESLVal("act ").add(ppExp.apply(indent,n).add(new ESLVal("(").add(ppDecs.apply(indent,args).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(5)),locals).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp.apply(indent.add(new ESLVal(4)),init).add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9402"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),handlers)).add(nl.apply(indent).add(new ESLVal("}"))))))))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Self": {ESLVal $195 = _v9.termRef(0);
          
          {ESLVal l = $195;
          
          return new ESLVal("self");
        }
        }
      case "Ref": {ESLVal $196 = _v9.termRef(0);
          ESLVal $197 = _v9.termRef(1);
          ESLVal $198 = _v9.termRef(2);
          
          {ESLVal l = $196;
          
          {ESLVal e = $197;
          
          {ESLVal n = $198;
          
          return ppExp.apply(indent,e).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "Send": {ESLVal $199 = _v9.termRef(0);
          ESLVal $200 = _v9.termRef(1);
          ESLVal $201 = _v9.termRef(2);
          
          {ESLVal l = $199;
          
          {ESLVal target = $200;
          
          {ESLVal message = $201;
          
          return ppExp.apply(indent,target).add(new ESLVal(" <- ").add(ppExp.apply(indent,message)));
        }
        }
        }
        }
      case "Cmp": {ESLVal $202 = _v9.termRef(0);
          ESLVal $203 = _v9.termRef(1);
          ESLVal $204 = _v9.termRef(2);
          
          {ESLVal l = $202;
          
          {ESLVal e = $203;
          
          {ESLVal qs = $204;
          
          return new ESLVal("[").add(ppExp.apply(indent,e).add(new ESLVal(" | ").add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun9403"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal q = $args[0];
          return ppQual.apply(indent,q);
            }
          }),qs)).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "New": {ESLVal $205 = _v9.termRef(0);
          ESLVal $206 = _v9.termRef(1);
          ESLVal $207 = _v9.termRef(2);
          
          {ESLVal l = $205;
          
          {ESLVal b = $206;
          
          {ESLVal args = $207;
          
          return new ESLVal("new ").add(ppExp.apply(indent,b).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "NewJava": {ESLVal $208 = _v9.termRef(0);
          ESLVal $209 = _v9.termRef(1);
          ESLVal $210 = _v9.termRef(2);
          ESLVal $211 = _v9.termRef(3);
          
          {ESLVal l = $208;
          
          {ESLVal className = $209;
          
          {ESLVal t = $210;
          
          {ESLVal args = $211;
          
          return new ESLVal("javaNew[").add(ppType.apply(t).add(new ESLVal("](\' + className + ").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $212 = _v9.termRef(0);
          ESLVal $213 = _v9.termRef(1);
          ESLVal $214 = _v9.termRef(2);
          
          {ESLVal l = $212;
          
          {ESLVal rs = $213;
          
          {ESLVal e = $214;
          
          return new ESLVal("*********grab");
        }
        }
        }
        }
      case "Probably": {ESLVal $215 = _v9.termRef(0);
          ESLVal $216 = _v9.termRef(1);
          ESLVal $217 = _v9.termRef(2);
          ESLVal $218 = _v9.termRef(3);
          ESLVal $219 = _v9.termRef(4);
          
          {ESLVal l = $215;
          
          {ESLVal p = $216;
          
          {ESLVal t = $217;
          
          {ESLVal e1 = $218;
          
          {ESLVal e2 = $219;
          
          return new ESLVal("**** probably");
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $220 = _v9.termRef(0);
          ESLVal $221 = _v9.termRef(1);
          
          {ESLVal l = $220;
          
          {ESLVal e = $221;
          
          return new ESLVal("not(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
        }
      case "Fold": {ESLVal $222 = _v9.termRef(0);
          ESLVal $223 = _v9.termRef(1);
          ESLVal $224 = _v9.termRef(2);
          
          {ESLVal l = $222;
          
          {ESLVal t = $223;
          
          {ESLVal e = $224;
          
          return new ESLVal("******** fold");
        }
        }
        }
        }
      case "Unfold": {ESLVal $225 = _v9.termRef(0);
          ESLVal $226 = _v9.termRef(1);
          ESLVal $227 = _v9.termRef(2);
          
          {ESLVal l = $225;
          
          {ESLVal t = $226;
          
          {ESLVal e = $227;
          
          return new ESLVal("******unfold");
        }
        }
        }
        }
      case "Now": {ESLVal $228 = _v9.termRef(0);
          
          {ESLVal l = $228;
          
          return new ESLVal("now");
        }
        }
      case "Become": {ESLVal $229 = _v9.termRef(0);
          ESLVal $230 = _v9.termRef(1);
          
          {ESLVal l = $229;
          
          {ESLVal e = $230;
          
          return new ESLVal("become ").add(ppExp.apply(indent,e));
        }
        }
        }
      case "ArrayRef": {ESLVal $231 = _v9.termRef(0);
          ESLVal $232 = _v9.termRef(1);
          ESLVal $233 = _v9.termRef(2);
          
          {ESLVal l = $231;
          
          {ESLVal a = $232;
          
          {ESLVal i = $233;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("]"))));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $234 = _v9.termRef(0);
          ESLVal $235 = _v9.termRef(1);
          ESLVal $236 = _v9.termRef(2);
          ESLVal $237 = _v9.termRef(3);
          
          {ESLVal l = $234;
          
          {ESLVal a = $235;
          
          {ESLVal i = $236;
          
          {ESLVal v = $237;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("] := ").add(ppExp.apply(indent,v)))));
        }
        }
        }
        }
        }
        default: {ESLVal x = _v9;
          
          return error(new ESLVal("ppExp: ").add(x));
        }
      }
      }
    }
  });
  private static ESLVal ppQual = new ESLVal(new Function(new ESLVal("ppQual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal q = $args[1];
  return new ESLVal("qualifier: ").add(q);
    }
  });
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun9404"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal b = $args[0];
        return ppDec.apply(indent,b);
          }
        }),bs));
    }
  });
  private static ESLVal ppDec = new ESLVal(new Function(new ESLVal("ppDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v10 = d;
        
        switch(_v10.termName) {
        case "Dec": {ESLVal $238 = _v10.termRef(0);
          ESLVal $239 = _v10.termRef(1);
          ESLVal $240 = _v10.termRef(2);
          ESLVal $241 = _v10.termRef(3);
          
          {ESLVal l = $238;
          
          {ESLVal n = $239;
          
          {ESLVal dt = $240;
          
          {ESLVal t = $241;
          
          return n.add(new ESLVal("::").add(ppType.apply(t)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9468,9545)"));
      }
      }
    }
  });
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun9405"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal b = $args[0];
        return ppBind.apply(indent,b);
          }
        }),bs));
    }
  });
  private static ESLVal ppBind = new ESLVal(new Function(new ESLVal("ppBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal b = $args[1];
  {ESLVal _v11 = b;
        
        switch(_v11.termName) {
        case "Binding": {ESLVal $242 = _v11.termRef(0);
          ESLVal $243 = _v11.termRef(1);
          ESLVal $244 = _v11.termRef(2);
          ESLVal $245 = _v11.termRef(3);
          ESLVal $246 = _v11.termRef(4);
          
          {ESLVal l = $242;
          
          {ESLVal name = $243;
          
          {ESLVal t = $244;
          
          {ESLVal st = $245;
          
          {ESLVal value = $246;
          
          return name.add(new ESLVal("=").add(ppExp.apply(indent,value).add(new ESLVal(";"))));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $247 = _v11.termRef(0);
          ESLVal $248 = _v11.termRef(1);
          ESLVal $249 = _v11.termRef(2);
          ESLVal $250 = _v11.termRef(3);
          
          {ESLVal l = $247;
          
          {ESLVal name = $248;
          
          {ESLVal t = $249;
          
          {ESLVal ignore = $250;
          
          return new ESLVal("type ").add(name);
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $251 = _v11.termRef(0);
          ESLVal $252 = _v11.termRef(1);
          ESLVal $253 = _v11.termRef(2);
          ESLVal $254 = _v11.termRef(3);
          
          {ESLVal l = $251;
          
          {ESLVal name = $252;
          
          {ESLVal t = $253;
          
          {ESLVal ignore = $254;
          
          return new ESLVal("data ").add(name);
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $255 = _v11.termRef(0);
          ESLVal $256 = _v11.termRef(1);
          ESLVal $257 = _v11.termRef(2);
          ESLVal $258 = _v11.termRef(3);
          ESLVal $259 = _v11.termRef(4);
          ESLVal $260 = _v11.termRef(5);
          ESLVal $261 = _v11.termRef(6);
          
          {ESLVal l = $255;
          
          {ESLVal name = $256;
          
          {ESLVal args = $257;
          
          {ESLVal t = $258;
          
          {ESLVal st = $259;
          
          {ESLVal body = $260;
          
          {ESLVal guard = $261;
          
          return name.add(new ESLVal("(").add(ppPatterns.apply(args).add(new ESLVal(") = ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),body))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $262 = _v11.termRef(0);
          ESLVal $263 = _v11.termRef(1);
          ESLVal $264 = _v11.termRef(2);
          ESLVal $265 = _v11.termRef(3);
          
          {ESLVal l = $262;
          
          {ESLVal name = $263;
          
          {ESLVal t = $264;
          
          {ESLVal ignore = $265;
          
          return name;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v11;
          
          return error(new ESLVal("ppBind: ").add(x));
        }
      }
      }
    }
  });
  public static ESLVal ppArm = new ESLVal(new Function(new ESLVal("ppArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v12 = a;
        
        switch(_v12.termName) {
        case "BArm": {ESLVal $266 = _v12.termRef(0);
          ESLVal $267 = _v12.termRef(1);
          ESLVal $268 = _v12.termRef(2);
          ESLVal $269 = _v12.termRef(3);
          
          {ESLVal l = $266;
          
          {ESLVal ps = $267;
          
          {ESLVal guard = $268;
          
          {ESLVal e = $269;
          
          return ppPatterns.apply(ps).add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10330,10468)"));
      }
      }
    }
  });
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal arms = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun9406"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppArm.apply(indent,a);
          }
        }),arms));
    }
  });
  private static ESLVal ppCaseTermArm = new ESLVal(new Function(new ESLVal("ppCaseTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v13 = a;
        
        switch(_v13.termName) {
        case "TArm": {ESLVal $270 = _v13.termRef(0);
          ESLVal $271 = _v13.termRef(1);
          
          {ESLVal n = $270;
          
          {ESLVal e = $271;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10630,10730)"));
      }
      }
    }
  });
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v14 = a;
        
        switch(_v14.termName) {
        case "IArm": {ESLVal $272 = _v14.termRef(0);
          ESLVal $273 = _v14.termRef(1);
          
          {ESLVal n = $272;
          
          {ESLVal e = $273;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10786,10886)"));
      }
      }
    }
  });
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v15 = a;
        
        switch(_v15.termName) {
        case "SArm": {ESLVal $274 = _v15.termRef(0);
          ESLVal $275 = _v15.termRef(1);
          
          {ESLVal n = $274;
          
          {ESLVal e = $275;
          
          return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10942,11056)"));
      }
      }
    }
  });
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v16 = a;
        
        switch(_v16.termName) {
        case "BoolArm": {ESLVal $276 = _v16.termRef(0);
          ESLVal $277 = _v16.termRef(1);
          
          {ESLVal b = $276;
          
          {ESLVal e = $277;
          
          return b.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11114,11218)"));
      }
      }
    }
  });
  private static ESLVal getImport = new ESLVal(new Function(new ESLVal("getImport"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sourceFile = $args[0];
  {ESLVal path = toPath.apply(sourceFile);
        
        {ESLVal p = pathToJavaPackage.apply(path);
        ESLVal className = pathToJavaClassName.apply(path);
        
        {ESLVal _v17 = sourceFile;
        
        switch(_v17.strVal) {
        case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        default: {ESLVal x = _v17;
          
          return new ESLVal("import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        }
      }
      }
      }
      }
    }
  });
  public static ESLVal ppJModule = new ESLVal(new Function(new ESLVal("ppJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal p = $args[1];
  ESLVal m = $args[2];
  {ESLVal _v18 = m;
        
        switch(_v18.termName) {
        case "JModule": {ESLVal $278 = _v18.termRef(0);
          ESLVal $279 = _v18.termRef(1);
          ESLVal $280 = _v18.termRef(2);
          ESLVal $281 = _v18.termRef(3);
          
          {ESLVal n = $278;
          
          {ESLVal exports = $279;
          
          {ESLVal imports = $280;
          
          {ESLVal fields = $281;
          
          return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl.apply($zero).add(new ESLVal("import esl.lib.*;").add(nl.apply($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl.apply($zero).add(ppJoin.apply($zero,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v19 = $qualArg;
                
                {ESLVal i = _v19;
                
                return ESLVal.list(ESLVal.list(getImport.apply(i)));
              }
              }
            }
          }).map(imports).flatten().flatten()).add(nl.apply($zero).add(new ESLVal("import java.util.function.Supplier;").add(nl.apply($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl.apply(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl.apply(new ESLVal(2)).add(ppJoin.apply(new ESLVal(2),map.apply(new ESLVal(new Function(new ESLVal("fun9407"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return ppJModuleField.apply(new ESLVal(2),exports,f);
            }
          }),fields)).add(nl.apply($zero).add(new ESLVal("public static void main(String[] args) {").add(nl.apply(new ESLVal(2)).add(((Supplier<ESLVal>)() -> { 
            if(member.apply(new ESLVal("main"),exports).boolVal)
              return new ESLVal("  newActor(main,new ESLVal(new Actor())); ").add(nl.apply(new ESLVal(2)));
              else
                return new ESLVal("");
          }).get().add(new ESLVal("}").add(nl.apply($zero).add(new ESLVal("}"))))))))))))))))))))))))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11613,12375)"));
      }
      }
    }
  });
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exports = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v20 = f;
        
        switch(_v20.termName) {
        case "JField": {ESLVal $282 = _v20.termRef(0);
          ESLVal $283 = _v20.termRef(1);
          ESLVal $284 = _v20.termRef(2);
          
          switch($282.strVal) {
          case "edb": switch($284.termName) {
            case "JNull": {
              {ESLVal t = $283;
              
              return new ESLVal("// static ESLVal edb = null;");
            }
            }
            default: {ESLVal n = $282;
              
              {ESLVal t = $283;
              
              {ESLVal e = $284;
              
              return ((Supplier<ESLVal>)() -> { 
                if(member.apply(n,exports).boolVal)
                  return new ESLVal("public ");
                  else
                    return new ESLVal("private ");
              }).get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp.apply(indent,ESLVal.list(),e).add(new ESLVal(";"))))));
            }
            }
            }
          }
          default: {ESLVal n = $282;
            
            {ESLVal t = $283;
            
            {ESLVal e = $284;
            
            return ((Supplier<ESLVal>)() -> { 
              if(member.apply(n,exports).boolVal)
                return new ESLVal("public ");
                else
                  return new ESLVal("private ");
            }).get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp.apply(indent,ESLVal.list(),e).add(new ESLVal(";"))))));
          }
          }
          }
        }
        }
        default: return error(new ESLVal("case error at Pos(12444,12694)"));
      }
      }
    }
  });
  private static ESLVal ppJExps = new ESLVal(new Function(new ESLVal("ppJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal exps = $args[2];
  ESLVal sep = $args[3];
  {ESLVal _v21 = exps;
        
        if(_v21.isCons())
        {ESLVal $285 = _v21.head();
          ESLVal $286 = _v21.tail();
          
          if($286.isCons())
          {ESLVal $287 = $286.head();
            ESLVal $288 = $286.tail();
            
            {ESLVal e1 = $285;
            
            {ESLVal e2 = $287;
            
            {ESLVal es = $288;
            
            return ppJExp.apply(indent,dynamics,e1).add(sep.add(ppJExps.apply(indent,dynamics,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($286.isNil())
          {ESLVal e = $285;
            
            return ppJExp.apply(indent,dynamics,e);
          }
        else return error(new ESLVal("case error at Pos(12764,12958)"));
        }
      else if(_v21.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(12764,12958)"));
      }
    }
  });
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal decs = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v22 = decs;
        
        if(_v22.isCons())
        {ESLVal $289 = _v22.head();
          ESLVal $290 = _v22.tail();
          
          if($290.isCons())
          {ESLVal $291 = $290.head();
            ESLVal $292 = $290.tail();
            
            {ESLVal e1 = $289;
            
            {ESLVal e2 = $291;
            
            {ESLVal es = $292;
            
            return pJDec.apply(indent,e1).add(sep.add(ppJDecs.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($290.isNil())
          {ESLVal e = $289;
            
            return pJDec.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(13020,13232)"));
        }
      else if(_v22.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(13020,13232)"));
      }
    }
  });
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v23 = d;
        
        switch(_v23.termName) {
        case "JDec": {ESLVal $293 = _v23.termRef(0);
          ESLVal $294 = _v23.termRef(1);
          
          {ESLVal n = $293;
          
          {ESLVal t = $294;
          
          return new ESLVal("ESLVal ").add(n);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(13278,13334)"));
      }
      }
    }
  });
  private static ESLVal ppJExp = new ESLVal(new Function(new ESLVal("ppJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v24 = e;
        
        switch(_v24.termName) {
        case "JArrayRef": {ESLVal $295 = _v24.termRef(0);
          ESLVal $296 = _v24.termRef(1);
          
          {ESLVal a = $295;
          
          {ESLVal i = $296;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal]"))));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $297 = _v24.termRef(0);
          ESLVal $298 = _v24.termRef(1);
          ESLVal $299 = _v24.termRef(2);
          
          {ESLVal a = $297;
          
          {ESLVal i = $298;
          
          {ESLVal v = $299;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp.apply(indent,dynamics,v)))));
        }
        }
        }
        }
      case "JBecome": {ESLVal $300 = _v24.termRef(0);
          ESLVal $301 = _v24.termRef(1);
          
          if($301.isCons())
          {ESLVal $302 = $301.head();
            ESLVal $303 = $301.tail();
            
            {ESLVal _v58 = $300;
            
            {ESLVal es = $301;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v58).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($301.isNil())
          {ESLVal _v59 = $300;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v59).add(new ESLVal(",getSelf())")));
          }
        else {ESLVal _v60 = $300;
            
            {ESLVal es = $301;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v60).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JConstExp": {ESLVal $304 = _v24.termRef(0);
          
          switch($304.termName) {
          case "JConstInt": {ESLVal $305 = $304.termRef(0);
            
            switch($305.intVal) {
            case 0: return new ESLVal("$zero");
          case 1: return new ESLVal("$one");
            default: {ESLVal n = $305;
              
              return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
            }
          }
          }
        case "JConstBool": {ESLVal $306 = $304.termRef(0);
            
            switch($306.boolVal ? 1 : 0) {
            case 1: return new ESLVal("$true");
          case 0: return new ESLVal("$false");
            default: {ESLVal _v61 = _v24;
              
              return new ESLVal("********** unknown expression: ").add(_v61);
            }
          }
          }
        case "JConstStr": {ESLVal $307 = $304.termRef(0);
            
            {ESLVal s = $307;
            
            return new ESLVal("new ESLVal(\"").add(javaString.apply(s).add(new ESLVal("\")")));
          }
          }
        case "JConstDouble": {ESLVal $308 = $304.termRef(0);
            
            {ESLVal d = $308;
            
            return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
          }
          }
          default: {ESLVal _v62 = _v24;
            
            return new ESLVal("********** unknown expression: ").add(_v62);
          }
        }
        }
      case "JNot": {ESLVal $309 = _v24.termRef(0);
          
          {ESLVal _v63 = $309;
          
          return ppJExp.apply(indent,dynamics,_v63).add(new ESLVal(".not()"));
        }
        }
      case "JNil": {ESLVal $310 = _v24.termRef(0);
          
          {ESLVal t = $310;
          
          return new ESLVal("$nil");
        }
        }
      case "JList": {ESLVal $311 = _v24.termRef(0);
          ESLVal $312 = _v24.termRef(1);
          
          {ESLVal t = $311;
          
          {ESLVal es = $312;
          
          return ppJListExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JTerm": {ESLVal $313 = _v24.termRef(0);
          ESLVal $314 = _v24.termRef(1);
          
          if($314.isCons())
          {ESLVal $315 = $314.head();
            ESLVal $316 = $314.tail();
            
            {ESLVal n = $313;
            
            {ESLVal es = $314;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($314.isNil())
          {ESLVal n = $313;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
          }
        else {ESLVal n = $313;
            
            {ESLVal es = $314;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JFun": {ESLVal $317 = _v24.termRef(0);
          ESLVal $318 = _v24.termRef(1);
          ESLVal $319 = _v24.termRef(2);
          ESLVal $320 = _v24.termRef(3);
          
          {ESLVal n = $317;
          
          {ESLVal args = $318;
          
          {ESLVal t = $319;
          
          {ESLVal body = $320;
          
          return ppJFun.apply(indent,dynamics,n,args,t,body);
        }
        }
        }
        }
        }
      case "JBinExp": {ESLVal $321 = _v24.termRef(0);
          ESLVal $322 = _v24.termRef(1);
          ESLVal $323 = _v24.termRef(2);
          
          switch($322.strVal) {
          case "==": {ESLVal e1 = $321;
            
            {ESLVal e2 = $323;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))));
          }
          }
        case "cons": {ESLVal e1 = $321;
            
            {ESLVal e2 = $323;
            
            return ppJExp.apply(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(")"))));
          }
          }
          default: {ESLVal e1 = $321;
            
            {ESLVal op = $322;
            
            {ESLVal e2 = $323;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".").add(op.add(new ESLVal("(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))))));
          }
          }
          }
        }
        }
      case "JNull": {
          return new ESLVal("$null");
        }
      case "JNow": {
          return new ESLVal("now()");
        }
      case "JVar": {ESLVal $324 = _v24.termRef(0);
          ESLVal $325 = _v24.termRef(1);
          
          {ESLVal n = $324;
          
          {ESLVal t = $325;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0]"));
          else
            {ESLVal _v64 = $324;
              
              {ESLVal _v65 = $325;
              
              return _v64;
            }
            }
        }
        }
        }
      case "JError": {ESLVal $326 = _v24.termRef(0);
          
          {ESLVal _v66 = $326;
          
          return new ESLVal("error(").add(ppJExp.apply(indent,dynamics,_v66).add(new ESLVal(")")));
        }
        }
      case "JApply": {ESLVal $327 = _v24.termRef(0);
          ESLVal $328 = _v24.termRef(1);
          
          {ESLVal _v67 = $327;
          
          {ESLVal es = $328;
          
          return ppJExp.apply(indent,dynamics,_v67).add(new ESLVal(".apply(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
      case "JCommandExp": {ESLVal $329 = _v24.termRef(0);
          ESLVal $330 = _v24.termRef(1);
          
          {ESLVal c = $329;
          
          {ESLVal t = $330;
          
          return new ESLVal("((Supplier<ESLVal>)() -> { ").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c).add(nl.apply(indent).add(new ESLVal("}).get()")))));
        }
        }
        }
      case "JIfExp": {ESLVal $331 = _v24.termRef(0);
          ESLVal $332 = _v24.termRef(1);
          ESLVal $333 = _v24.termRef(2);
          
          {ESLVal _v68 = $331;
          
          {ESLVal e1 = $332;
          
          {ESLVal e2 = $333;
          
          return new ESLVal("(").add(ppJExp.apply(indent,dynamics,_v68).add(new ESLVal(".boolVal) ? (").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")")))))));
        }
        }
        }
        }
      case "JHead": {ESLVal $334 = _v24.termRef(0);
          
          {ESLVal _v69 = $334;
          
          return ppJExp.apply(indent,dynamics,_v69).add(new ESLVal(".head()"));
        }
        }
      case "JTail": {ESLVal $335 = _v24.termRef(0);
          
          {ESLVal _v70 = $335;
          
          return ppJExp.apply(indent,dynamics,_v70).add(new ESLVal(".tail()"));
        }
        }
      case "JTermRef": {ESLVal $336 = _v24.termRef(0);
          ESLVal $337 = _v24.termRef(1);
          
          {ESLVal _v71 = $336;
          
          {ESLVal n = $337;
          
          return ppJExp.apply(indent,dynamics,_v71).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
        }
        }
        }
      case "JMapFun": {ESLVal $338 = _v24.termRef(0);
          ESLVal $339 = _v24.termRef(1);
          
          {ESLVal f = $338;
          
          {ESLVal l = $339;
          
          return ppJExp.apply(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(")"))));
        }
        }
        }
      case "JFlatten": {ESLVal $340 = _v24.termRef(0);
          
          {ESLVal ls = $340;
          
          return ppJExp.apply(indent,dynamics,ls).add(new ESLVal(".flatten()"));
        }
        }
      case "JBehaviour": {ESLVal $341 = _v24.termRef(0);
          ESLVal $342 = _v24.termRef(1);
          ESLVal $343 = _v24.termRef(2);
          ESLVal $344 = _v24.termRef(3);
          ESLVal $345 = _v24.termRef(4);
          
          switch($344.termName) {
          case "JFun": {ESLVal $346 = $344.termRef(0);
            ESLVal $347 = $344.termRef(1);
            ESLVal $348 = $344.termRef(2);
            ESLVal $349 = $344.termRef(3);
            
            {ESLVal es = $341;
            
            {ESLVal fs = $342;
            
            {ESLVal init = $343;
            
            {ESLVal n = $346;
            
            {ESLVal args = $347;
            
            {ESLVal t = $348;
            
            {ESLVal body = $349;
            
            {ESLVal time = $345;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v25 = $qualArg;
                  
                  {ESLVal _v72 = _v25;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(_v72.add(new ESLVal("\": return ").add(_v72.add(new ESLVal(";")))))));
                }
                }
              }
            }).map(es).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"ref illegal \" + self + \".\" + name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _v73 = _v24;
            
            return new ESLVal("********** unknown expression: ").add(_v73);
          }
        }
        }
      case "JNew": {ESLVal $350 = _v24.termRef(0);
          ESLVal $351 = _v24.termRef(1);
          
          if($351.isCons())
          {ESLVal $352 = $351.head();
            ESLVal $353 = $351.tail();
            
            {ESLVal b = $350;
            
            {ESLVal args = $351;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($351.isNil())
          {ESLVal b = $350;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
          }
        else {ESLVal b = $350;
            
            {ESLVal args = $351;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JNewArray": {ESLVal $354 = _v24.termRef(0);
          
          {ESLVal i = $354;
          
          return new ESLVal("newArray(").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal)")));
        }
        }
      case "JNewJava": {ESLVal $355 = _v24.termRef(0);
          ESLVal $356 = _v24.termRef(1);
          
          if($356.isCons())
          {ESLVal $357 = $356.head();
            ESLVal $358 = $356.tail();
            
            {ESLVal n = $355;
            
            {ESLVal args = $356;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($356.isNil())
          {ESLVal n = $355;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
          }
        else {ESLVal n = $355;
            
            {ESLVal args = $356;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JSend": {ESLVal $359 = _v24.termRef(0);
          ESLVal $360 = _v24.termRef(1);
          ESLVal $361 = _v24.termRef(2);
          
          if($361.isCons())
          {ESLVal $362 = $361.head();
            ESLVal $363 = $361.tail();
            
            {ESLVal _v74 = $359;
            
            {ESLVal m = $360;
            
            {ESLVal args = $361;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v74).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
          }
        else if($361.isNil())
          {ESLVal _v75 = $359;
            
            {ESLVal m = $360;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v75).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
          }
          }
        else {ESLVal _v76 = $359;
            
            {ESLVal m = $360;
            
            {ESLVal args = $361;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v76).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
        }
      case "JSelf": {
          return new ESLVal("getSelf()");
        }
      case "JRef": {ESLVal $364 = _v24.termRef(0);
          ESLVal $365 = _v24.termRef(1);
          
          {ESLVal _v77 = $364;
          
          {ESLVal n = $365;
          
          return ppJExp.apply(indent,dynamics,_v77).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
        }
        }
        }
      case "JGrab": {ESLVal $366 = _v24.termRef(0);
          ESLVal $367 = _v24.termRef(1);
          
          {ESLVal es = $366;
          
          {ESLVal c = $367;
          
          return new ESLVal("lock(new Function(new ESLVal(\"grab\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal ...args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent,dynamics,c).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}},").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))))))))));
        }
        }
        }
      case "JTry": {ESLVal $368 = _v24.termRef(0);
          ESLVal $369 = _v24.termRef(1);
          ESLVal $370 = _v24.termRef(2);
          
          {ESLVal _v78 = $368;
          
          {ESLVal n = $369;
          
          {ESLVal c = $370;
          
          return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(4)),dynamics,_v78).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl.apply(indent.add(new ESLVal(6))).add(ppJCommand.apply(indent,dynamics,c).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
        }
        }
        }
        }
      case "JProbably": {ESLVal $371 = _v24.termRef(0);
          ESLVal $372 = _v24.termRef(1);
          ESLVal $373 = _v24.termRef(2);
          
          {ESLVal _v79 = $371;
          
          {ESLVal e1 = $372;
          
          {ESLVal e2 = $373;
          
          return new ESLVal("probably(").add(ppJExp.apply(indent,dynamics,_v79).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e1)).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e2)).add(new ESLVal(")")))))));
        }
        }
        }
        }
        default: {ESLVal _v80 = _v24;
          
          return new ESLVal("********** unknown expression: ").add(_v80);
        }
      }
      }
    }
  });
  private static ESLVal probFun = new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  return new ESLVal("JFun",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("probFun"))),ESLVal.list(),$null,new ESLVal("JReturn",e));
    }
  });
  private static ESLVal ppJFun = new ESLVal(new Function(new ESLVal("ppJFun"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal n = $args[2];
  ESLVal args = $args[3];
  ESLVal t = $args[4];
  ESLVal body = $args[5];
  {ESLVal freeDynamics = dynamicVarsJCommand.apply(body);
        ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v26 = $qualArg;
                
                switch(_v26.termName) {
                case "JDec": {ESLVal $374 = _v26.termRef(0);
                  ESLVal $375 = _v26.termRef(1);
                  
                  {ESLVal _v81 = $374;
                  
                  {ESLVal _v82 = $375;
                  
                  return ESLVal.list(ESLVal.list(_v81));
                }
                }
                }
                default: {ESLVal _0 = _v26;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal boundDynamics = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                {ESLVal d = _v27;
                
                return ESLVal.list((member.apply(d,freeDynamics).boolVal) ? (ESLVal.list(d)) : ($nil));
              }
              }
            }
          }).map(argNames).flatten().flatten();
        
        {ESLVal dom = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                switch(_v28.termName) {
                case "JDec": {ESLVal $376 = _v28.termRef(0);
                  ESLVal $377 = _v28.termRef(1);
                  
                  {ESLVal _v83 = $376;
                  
                  {ESLVal _v84 = $377;
                  
                  return ESLVal.list(ESLVal.list(_v84));
                }
                }
                }
                default: {ESLVal _0 = _v28;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        ESLVal ran = t;
        
        return new ESLVal("new ESLVal(new Function(").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(",getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... $args) {").add(nl.apply(indent.add(new ESLVal(4))).add(ppFunArgs.apply(indent,$zero,args,boundDynamics).add(ppJCommand.apply(indent.add(new ESLVal(4)),boundDynamics.add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v29 = $qualArg;
              
              {ESLVal d = _v29;
              
              return ESLVal.list((member.apply(d,argNames).not().boolVal) ? (ESLVal.list(d)) : ($nil));
            }
            }
          }
        }).map(dynamics).flatten().flatten()),body).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})"))))))))))));
      }
      }
      }
    }
  });
  private static ESLVal ppFunArgs = new ESLVal(new Function(new ESLVal("ppFunArgs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal i = $args[1];
  ESLVal args = $args[2];
  ESLVal dynamicArgs = $args[3];
  {ESLVal _v30 = args;
        
        if(_v30.isCons())
        {ESLVal $378 = _v30.head();
          ESLVal $379 = _v30.tail();
          
          switch($378.termName) {
          case "JDec": {ESLVal $380 = $378.termRef(0);
            ESLVal $381 = $378.termRef(1);
            
            {ESLVal n = $380;
            
            {ESLVal t = $381;
            
            {ESLVal _v85 = $379;
            
            if(member.apply(n,dynamicArgs).boolVal)
            return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v85,dynamicArgs)))))));
            else
              {ESLVal _v86 = $380;
                
                {ESLVal _v87 = $381;
                
                {ESLVal _v88 = $379;
                
                return new ESLVal("ESLVal ").add(_v86.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v88,dynamicArgs)))))));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20226,20620)"));
        }
        }
      else if(_v30.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(20226,20620)"));
      }
    }
  });
  private static ESLVal ppJCommand = new ESLVal(new Function(new ESLVal("ppJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  {ESLVal _v31 = c;
        
        switch(_v31.termName) {
        case "JIfCommand": {ESLVal $382 = _v31.termRef(0);
          ESLVal $383 = _v31.termRef(1);
          ESLVal $384 = _v31.termRef(2);
          
          {ESLVal e = $382;
          
          {ESLVal c1 = $383;
          
          {ESLVal c2 = $384;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal)").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c1).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,c2)))))))));
        }
        }
        }
        }
      case "JReturn": {ESLVal $385 = _v31.termRef(0);
          
          switch($385.termName) {
          case "JCommandExp": {ESLVal $386 = $385.termRef(0);
            ESLVal $387 = $385.termRef(1);
            
            {ESLVal _v89 = $386;
            
            {ESLVal t = $387;
            
            return ppJCommand.apply(indent,dynamics,_v89);
          }
          }
          }
          default: {ESLVal e = $385;
            
            return new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";")));
          }
        }
        }
      case "JCaseList": {ESLVal $388 = _v31.termRef(0);
          ESLVal $389 = _v31.termRef(1);
          ESLVal $390 = _v31.termRef(2);
          ESLVal $391 = _v31.termRef(3);
          
          {ESLVal l = $388;
          
          {ESLVal cons = $389;
          
          {ESLVal nil = $390;
          
          {ESLVal alt = $391;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isCons())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,cons).add(nl.apply(indent).add(new ESLVal("else if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isNil())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,nil).add(nl.apply(indent).add(new ESLVal("else ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt))))))))))))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $392 = _v31.termRef(0);
          ESLVal $393 = _v31.termRef(1);
          ESLVal $394 = _v31.termRef(2);
          
          {ESLVal e = $392;
          
          {ESLVal arms = $393;
          
          {ESLVal alt = $394;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".termName) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v32 = $qualArg;
                
                switch(_v32.termName) {
                case "JTArm": {ESLVal $416 = _v32.termRef(0);
                  ESLVal $417 = _v32.termRef(1);
                  ESLVal $418 = _v32.termRef(2);
                  
                  {ESLVal n = $416;
                  
                  {ESLVal i = $417;
                  
                  {ESLVal _v90 = $418;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v90))))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v32;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $395 = _v31.termRef(0);
          ESLVal $396 = _v31.termRef(1);
          ESLVal $397 = _v31.termRef(2);
          
          {ESLVal e = $395;
          
          {ESLVal arms = $396;
          
          {ESLVal alt = $397;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".intVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v33 = $qualArg;
                
                switch(_v33.termName) {
                case "JIArm": {ESLVal $419 = _v33.termRef(0);
                  ESLVal $420 = _v33.termRef(1);
                  
                  {ESLVal n = $419;
                  
                  {ESLVal _v91 = $420;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v91))))));
                }
                }
                }
                default: {ESLVal _0 = _v33;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $398 = _v31.termRef(0);
          ESLVal $399 = _v31.termRef(1);
          ESLVal $400 = _v31.termRef(2);
          
          {ESLVal e = $398;
          
          {ESLVal arms = $399;
          
          {ESLVal alt = $400;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".strVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v34 = $qualArg;
                
                switch(_v34.termName) {
                case "JSArm": {ESLVal $421 = _v34.termRef(0);
                  ESLVal $422 = _v34.termRef(1);
                  
                  {ESLVal s = $421;
                  
                  {ESLVal _v92 = $422;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v92))))));
                }
                }
                }
                default: {ESLVal _0 = _v34;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $401 = _v31.termRef(0);
          ESLVal $402 = _v31.termRef(1);
          ESLVal $403 = _v31.termRef(2);
          
          {ESLVal e = $401;
          
          {ESLVal arms = $402;
          
          {ESLVal alt = $403;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal ? 1 : 0) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v35 = $qualArg;
                
                switch(_v35.termName) {
                case "JBArm": {ESLVal $423 = _v35.termRef(0);
                  ESLVal $424 = _v35.termRef(1);
                  
                  {ESLVal b = $423;
                  
                  {ESLVal _v93 = $424;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(((Supplier<ESLVal>)() -> { 
                    if(b.boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v93))))));
                }
                }
                }
                default: {ESLVal _0 = _v35;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JLet": {ESLVal $404 = _v31.termRef(0);
          ESLVal $405 = _v31.termRef(1);
          
          {ESLVal bs = $404;
          
          {ESLVal _v94 = $405;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v36 = $qualArg;
                  
                  switch(_v36.termName) {
                  case "JField": {ESLVal $425 = _v36.termRef(0);
                    ESLVal $426 = _v36.termRef(1);
                    ESLVal $427 = _v36.termRef(2);
                    
                    {ESLVal n = $425;
                    
                    {ESLVal t = $426;
                    
                    {ESLVal e = $427;
                    
                    return ESLVal.list(ESLVal.list(n));
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
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v94);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun9408"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v94).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JLetRec": {ESLVal $406 = _v31.termRef(0);
          ESLVal $407 = _v31.termRef(1);
          
          {ESLVal bs = $406;
          
          {ESLVal _v95 = $407;
          
          return new ESLVal("LetRec letrec = new LetRec() {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,bs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v37 = $qualArg;
                
                switch(_v37.termName) {
                case "JField": {ESLVal $428 = _v37.termRef(0);
                  ESLVal $429 = _v37.termRef(1);
                  ESLVal $430 = _v37.termRef(2);
                  
                  {ESLVal n = $428;
                  
                  {ESLVal t = $429;
                  
                  {ESLVal e = $430;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(6))))))))));
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
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"cannot find letrec binding\");").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("};").add(nl.apply(indent).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v38 = $qualArg;
                
                switch(_v38.termName) {
                case "JField": {ESLVal $431 = _v38.termRef(0);
                  ESLVal $432 = _v38.termRef(1);
                  ESLVal $433 = _v38.termRef(2);
                  
                  {ESLVal n = $431;
                  
                  {ESLVal t = $432;
                  
                  {ESLVal e = $433;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = letrec.get(\"").add(n.add(new ESLVal("\");").add(nl.apply(indent))))))));
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
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics,_v95).add(nl.apply(indent))))))))))))))))))))));
        }
        }
        }
      case "JBlock": {ESLVal $408 = _v31.termRef(0);
          
          {ESLVal cs = $408;
          
          return new ESLVal("{").add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v39 = $qualArg;
                
                {ESLVal _v96 = _v39;
                
                return ESLVal.list(ESLVal.list(ppJCommand.apply(indent,dynamics,_v96)));
              }
              }
            }
          }).map(cs).flatten().flatten()).add(new ESLVal("}")));
        }
        }
      case "JUpdate": {ESLVal $409 = _v31.termRef(0);
          ESLVal $410 = _v31.termRef(1);
          
          {ESLVal n = $409;
          
          {ESLVal e = $410;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0] = ").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"))));
          else
            {ESLVal _v97 = $409;
              
              {ESLVal _v98 = $410;
              
              return _v97.add(new ESLVal(" = ").add(ppJExp.apply(indent,dynamics,_v98).add(new ESLVal(";"))));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $411 = _v31.termRef(0);
          ESLVal $412 = _v31.termRef(1);
          ESLVal $413 = _v31.termRef(2);
          ESLVal $414 = _v31.termRef(3);
          
          {ESLVal listName = $411;
          
          {ESLVal varName = $412;
          
          {ESLVal e = $413;
          
          {ESLVal _v99 = $414;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,_v99).add(nl.apply(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}")))))))))))))))))))))))))));
        }
        }
        }
        }
        }
      case "JStatement": {ESLVal $415 = _v31.termRef(0);
          
          {ESLVal e = $415;
          
          return ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"));
        }
        }
        default: {ESLVal _v100 = _v31;
          
          return new ESLVal("******* unknown command: ").add(_v100);
        }
      }
      }
    }
  });
  private static ESLVal ppJFields = new ESLVal(new Function(new ESLVal("ppJFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal bs = $args[2];
  {ESLVal _v40 = bs;
        
        if(_v40.isCons())
        {ESLVal $434 = _v40.head();
          ESLVal $435 = _v40.tail();
          
          {ESLVal f = $434;
          
          {ESLVal _v101 = $435;
          
          return ppFieldDef.apply(indent,dynamics,f).add(nl.apply(indent).add(ppJFields.apply(indent,dynamics,_v101)));
        }
        }
        }
      else if(_v40.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(25144,25294)"));
      }
    }
  });
  private static ESLVal ppFieldDef = new ESLVal(new Function(new ESLVal("ppFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v41 = f;
        
        switch(_v41.termName) {
        case "JField": {ESLVal $436 = _v41.termRef(0);
          ESLVal $437 = _v41.termRef(1);
          ESLVal $438 = _v41.termRef(2);
          
          {ESLVal n = $436;
          
          {ESLVal t = $437;
          
          {ESLVal e = $438;
          
          if(member.apply(n,dynamics).boolVal)
          return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal("};")))));
          else
            {ESLVal _v102 = $436;
              
              {ESLVal _v103 = $437;
              
              {ESLVal _v104 = $438;
              
              return new ESLVal("ESLVal ").add(_v102.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v104).add(new ESLVal(";")))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(25358,25612)"));
      }
      }
    }
  });
  private static ESLVal ppJTerm = new ESLVal(new Function(new ESLVal("ppJTerm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal n = $args[2];
  ESLVal es = $args[3];
  {ESLVal _v42 = es;
        
        if(_v42.isCons())
        {ESLVal $439 = _v42.head();
          ESLVal $440 = _v42.tail();
          
          {ESLVal _v105 = _v42;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v105,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      else if(_v42.isNil())
        return new ESLVal("new Term(\"").add(n.add(new ESLVal("\")")));
      else {ESLVal _v106 = _v42;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v106,new ESLVal(",")).add(new ESLVal(")")))));
        }
      }
    }
  });
  private static ESLVal ppJListExp = new ESLVal(new Function(new ESLVal("ppJListExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.list(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v44 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal t = $t;
            
            if($true.boolVal)
            {new Function(new ESLVal("try"),getSelf()) {
              public ESLVal apply(ESLVal... args) { 
                try { 
                  return print.apply(ppExp.apply($zero,parse.apply(new ESLVal("esl/compiler/test1.esl"))));
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v43 = $x;
              
              {ESLVal message = _v43;
              
              return print.apply(new ESLVal("PP Error: ").add(message));
            }
            }
                }
              }
            }.apply();
            print.apply(new ESLVal("DONE"));
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