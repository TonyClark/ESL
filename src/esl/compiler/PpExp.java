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
  {ESLVal _v5 = ss;
        
        if(_v5.isCons())
        {ESLVal $8 = _v5.head();
          ESLVal $9 = _v5.tail();
          
          if($9.isCons())
          {ESLVal $10 = $9.head();
            ESLVal $11 = $9.tail();
            
            if($11.isCons())
            {ESLVal $12 = $11.head();
              ESLVal $13 = $11.tail();
              
              {ESLVal s = $8;
              
              {ESLVal _v127 = $9;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v127)));
            }
            }
            }
          else if($11.isNil())
            {ESLVal s1 = $8;
              
              {ESLVal s2 = $10;
              
              return s1.add(nl.apply(indent).add(s2));
            }
            }
          else {ESLVal s = $8;
              
              {ESLVal _v128 = $9;
              
              return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v128)));
            }
            }
          }
        else if($9.isNil())
          {ESLVal s = $8;
            
            return s;
          }
        else {ESLVal s = $8;
            
            {ESLVal _v129 = $9;
            
            return s.add(nl.apply(indent).add(ppJoin.apply(indent,_v129)));
          }
          }
        }
      else if(_v5.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(441,599)").add(ESLVal.list(_v5)));
      }
    }
  });
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v8 = env;
        while(_v8.isCons()) {
          ESLVal _v7 = _v8.headVal;
          {ESLVal _v6 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v9 = _v7;
                    
                    switch(_v9.termName) {
                    case "Map": {ESLVal $15 = _v9.termRef(0);
                      ESLVal $14 = _v9.termRef(1);
                      
                      {ESLVal n = $15;
                      
                      {ESLVal t = $14;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v9;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v6.apply();
          }
          _v8 = _v8.tailVal;}
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
  {ESLVal _v10 = t;
        
        switch(_v10.termName) {
        case "ActType": {ESLVal $71 = _v10.termRef(0);
          ESLVal $70 = _v10.termRef(1);
          ESLVal $69 = _v10.termRef(2);
          
          {ESLVal l = $71;
          
          {ESLVal decs = $70;
          
          {ESLVal handlers = $69;
          
          return new ESLVal("").add(t);
        }
        }
        }
        }
      case "ApplyType": {ESLVal $68 = _v10.termRef(0);
          ESLVal $67 = _v10.termRef(1);
          ESLVal $66 = _v10.termRef(2);
          
          {ESLVal l = $68;
          
          {ESLVal n = $67;
          
          {ESLVal args = $66;
          
          return n.add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $65 = _v10.termRef(0);
          ESLVal $64 = _v10.termRef(1);
          ESLVal $63 = _v10.termRef(2);
          
          {ESLVal l = $65;
          
          {ESLVal op = $64;
          
          {ESLVal args = $63;
          
          return ppType.apply(op).add(map.apply(ppType,args));
        }
        }
        }
        }
      case "ArrayType": {ESLVal $62 = _v10.termRef(0);
          ESLVal $61 = _v10.termRef(1);
          
          {ESLVal l = $62;
          
          {ESLVal _v126 = $61;
          
          return new ESLVal("Array[").add(ppType.apply(_v126).add(new ESLVal("]")));
        }
        }
        }
      case "BoolType": {ESLVal $60 = _v10.termRef(0);
          
          {ESLVal l = $60;
          
          return new ESLVal("Bool");
        }
        }
      case "FloatType": {ESLVal $59 = _v10.termRef(0);
          
          {ESLVal l = $59;
          
          return new ESLVal("Float");
        }
        }
      case "FieldType": {ESLVal $58 = _v10.termRef(0);
          ESLVal $57 = _v10.termRef(1);
          ESLVal $56 = _v10.termRef(2);
          
          {ESLVal l = $58;
          
          {ESLVal n = $57;
          
          {ESLVal _v125 = $56;
          
          return n.add(new ESLVal("::").add(ppType.apply(_v125)));
        }
        }
        }
        }
      case "ForallType": {ESLVal $55 = _v10.termRef(0);
          ESLVal $54 = _v10.termRef(1);
          ESLVal $53 = _v10.termRef(2);
          
          {ESLVal l = $55;
          
          {ESLVal ns = $54;
          
          {ESLVal _v124 = $53;
          
          return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v124))));
        }
        }
        }
        }
      case "FunType": {ESLVal $52 = _v10.termRef(0);
          ESLVal $51 = _v10.termRef(1);
          ESLVal $50 = _v10.termRef(2);
          
          {ESLVal l = $52;
          
          {ESLVal d = $51;
          
          {ESLVal r = $50;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
      case "TaggedFunType": {ESLVal $49 = _v10.termRef(0);
          ESLVal $48 = _v10.termRef(1);
          ESLVal $47 = _v10.termRef(2);
          ESLVal $46 = _v10.termRef(3);
          
          {ESLVal l = $49;
          
          {ESLVal d = $48;
          
          {ESLVal p = $47;
          
          {ESLVal r = $46;
          
          return map.apply(ppType,d).add(new ESLVal("->").add(ppType.apply(r)));
        }
        }
        }
        }
        }
      case "IntType": {ESLVal $45 = _v10.termRef(0);
          
          {ESLVal l = $45;
          
          return new ESLVal("Int");
        }
        }
      case "ListType": {ESLVal $44 = _v10.termRef(0);
          ESLVal $43 = _v10.termRef(1);
          
          {ESLVal l = $44;
          
          {ESLVal _v123 = $43;
          
          return new ESLVal("[").add(ppType.apply(_v123).add(new ESLVal("]")));
        }
        }
        }
      case "NullType": {ESLVal $42 = _v10.termRef(0);
          
          {ESLVal l = $42;
          
          return new ESLVal("Null");
        }
        }
      case "RecType": {ESLVal $41 = _v10.termRef(0);
          ESLVal $40 = _v10.termRef(1);
          ESLVal $39 = _v10.termRef(2);
          
          {ESLVal l = $41;
          
          {ESLVal n = $40;
          
          {ESLVal _v122 = $39;
          
          return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v122))));
        }
        }
        }
        }
      case "RecordType": {ESLVal $38 = _v10.termRef(0);
          ESLVal $37 = _v10.termRef(1);
          
          {ESLVal l = $38;
          
          {ESLVal fs = $37;
          
          return new ESLVal("{").add(fs.add(new ESLVal("}")));
        }
        }
        }
      case "StrType": {ESLVal $36 = _v10.termRef(0);
          
          {ESLVal l = $36;
          
          return new ESLVal("Str");
        }
        }
      case "TableType": {ESLVal $35 = _v10.termRef(0);
          ESLVal $34 = _v10.termRef(1);
          ESLVal $33 = _v10.termRef(2);
          
          {ESLVal l = $35;
          
          {ESLVal k = $34;
          
          {ESLVal v = $33;
          
          return new ESLVal("Hash[").add(ppType.apply(k).add(new ESLVal(",").add(ppType.apply(v).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "TermType": {ESLVal $32 = _v10.termRef(0);
          ESLVal $31 = _v10.termRef(1);
          ESLVal $30 = _v10.termRef(2);
          
          {ESLVal l = $32;
          
          {ESLVal n = $31;
          
          {ESLVal ts = $30;
          
          return n.add(map.apply(ppType,ts));
        }
        }
        }
        }
      case "TypeFun": {ESLVal $29 = _v10.termRef(0);
          ESLVal $28 = _v10.termRef(1);
          ESLVal $27 = _v10.termRef(2);
          
          {ESLVal l = $29;
          
          {ESLVal ns = $28;
          
          {ESLVal _v121 = $27;
          
          return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v121))));
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $26 = _v10.termRef(0);
          ESLVal $25 = _v10.termRef(1);
          
          {ESLVal l = $26;
          
          {ESLVal _v120 = $25;
          
          return new ESLVal("unfold ").add(ppType.apply(_v120));
        }
        }
        }
      case "UnionType": {ESLVal $24 = _v10.termRef(0);
          ESLVal $23 = _v10.termRef(1);
          
          {ESLVal l = $24;
          
          {ESLVal ts = $23;
          
          return new ESLVal("union ").add(map.apply(ppType,ts));
        }
        }
        }
      case "VarType": {ESLVal $22 = _v10.termRef(0);
          ESLVal $21 = _v10.termRef(1);
          
          {ESLVal l = $22;
          
          {ESLVal n = $21;
          
          return n;
        }
        }
        }
      case "VoidType": {ESLVal $20 = _v10.termRef(0);
          
          {ESLVal l = $20;
          
          return new ESLVal("Void");
        }
        }
      case "UnionRef": {ESLVal $19 = _v10.termRef(0);
          ESLVal $18 = _v10.termRef(1);
          ESLVal $17 = _v10.termRef(2);
          
          {ESLVal l = $19;
          
          {ESLVal _v119 = $18;
          
          {ESLVal n = $17;
          
          return ppType.apply(_v119).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $16 = _v10.termRef(0);
          
          {ESLVal f = $16;
          
          return f.add(new ESLVal(""));
        }
        }
        default: {ESLVal x = _v10;
          
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
  {ESLVal _v11 = exps;
        
        if(_v11.isCons())
        {ESLVal $72 = _v11.head();
          ESLVal $73 = _v11.tail();
          
          if($73.isCons())
          {ESLVal $74 = $73.head();
            ESLVal $75 = $73.tail();
            
            {ESLVal e1 = $72;
            
            {ESLVal e2 = $74;
            
            {ESLVal es = $75;
            
            return ppExp.apply(indent,e1).add(sep.add(ppExps.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($73.isNil())
          {ESLVal e = $72;
            
            return ppExp.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(2412,2570)").add(ESLVal.list(_v11)));
        }
      else if(_v11.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(2412,2570)").add(ESLVal.list(_v11)));
      }
    }
  });
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v12 = p;
        
        switch(_v12.termName) {
        case "PVar": {ESLVal $97 = _v12.termRef(0);
          ESLVal $96 = _v12.termRef(1);
          ESLVal $95 = _v12.termRef(2);
          
          {ESLVal l = $97;
          
          {ESLVal n = $96;
          
          {ESLVal t = $95;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $92 = _v12.termRef(0);
          ESLVal $91 = _v12.termRef(1);
          ESLVal $90 = _v12.termRef(2);
          ESLVal $89 = _v12.termRef(3);
          
          if($90.isCons())
          {ESLVal $93 = $90.head();
            ESLVal $94 = $90.tail();
            
            {ESLVal l = $92;
            
            {ESLVal n = $91;
            
            {ESLVal ts = $90;
            
            {ESLVal ps = $89;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
          }
        else if($90.isNil())
          {ESLVal l = $92;
            
            {ESLVal n = $91;
            
            {ESLVal ps = $89;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $92;
            
            {ESLVal n = $91;
            
            {ESLVal ts = $90;
            
            {ESLVal ps = $89;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $88 = _v12.termRef(0);
          ESLVal $87 = _v12.termRef(1);
          ESLVal $86 = _v12.termRef(2);
          
          {ESLVal l = $88;
          
          {ESLVal _v117 = $87;
          
          {ESLVal ts = $86;
          
          return ppPattern.apply(_v117);
        }
        }
        }
        }
      case "PNil": {ESLVal $85 = _v12.termRef(0);
          
          {ESLVal l = $85;
          
          return new ESLVal("[]");
        }
        }
      case "PInt": {ESLVal $84 = _v12.termRef(0);
          ESLVal $83 = _v12.termRef(1);
          
          {ESLVal l = $84;
          
          {ESLVal n = $83;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $82 = _v12.termRef(0);
          ESLVal $81 = _v12.termRef(1);
          
          {ESLVal l = $82;
          
          {ESLVal b = $81;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $80 = _v12.termRef(0);
          ESLVal $79 = _v12.termRef(1);
          
          {ESLVal l = $80;
          
          {ESLVal s = $79;
          
          return new ESLVal("\'").add(s.add(new ESLVal("\'")));
        }
        }
        }
      case "PCons": {ESLVal $78 = _v12.termRef(0);
          ESLVal $77 = _v12.termRef(1);
          ESLVal $76 = _v12.termRef(2);
          
          {ESLVal l = $78;
          
          {ESLVal h = $77;
          
          {ESLVal t = $76;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
        default: {ESLVal _v118 = _v12;
          
          return new ESLVal("<unknown: ").add(_v118.add(new ESLVal(">")));
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
  {ESLVal _v13 = exp;
        
        switch(_v13.termName) {
        case "Module": {ESLVal $248 = _v13.termRef(0);
          ESLVal $247 = _v13.termRef(1);
          ESLVal $246 = _v13.termRef(2);
          ESLVal $245 = _v13.termRef(3);
          ESLVal $244 = _v13.termRef(4);
          ESLVal $243 = _v13.termRef(5);
          ESLVal $242 = _v13.termRef(6);
          
          {ESLVal path = $248;
          
          {ESLVal name = $247;
          
          {ESLVal exports = $246;
          
          {ESLVal imports = $245;
          
          {ESLVal x = $244;
          
          {ESLVal y = $243;
          
          {ESLVal defs = $242;
          
          return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(2)),defs).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "Var": {ESLVal $241 = _v13.termRef(0);
          ESLVal $240 = _v13.termRef(1);
          
          {ESLVal l = $241;
          
          {ESLVal n = $240;
          
          return n;
        }
        }
        }
      case "StrExp": {ESLVal $239 = _v13.termRef(0);
          ESLVal $238 = _v13.termRef(1);
          
          {ESLVal l = $239;
          
          {ESLVal v = $238;
          
          return new ESLVal("\'").add(v.add(new ESLVal("\'")));
        }
        }
        }
      case "IntExp": {ESLVal $237 = _v13.termRef(0);
          ESLVal $236 = _v13.termRef(1);
          
          {ESLVal l = $237;
          
          {ESLVal v = $236;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "BoolExp": {ESLVal $235 = _v13.termRef(0);
          ESLVal $234 = _v13.termRef(1);
          
          {ESLVal l = $235;
          
          {ESLVal v = $234;
          
          return v.add(new ESLVal(""));
        }
        }
        }
      case "NullExp": {ESLVal $233 = _v13.termRef(0);
          
          {ESLVal l = $233;
          
          return new ESLVal("null");
        }
        }
      case "FloatExp": {ESLVal $232 = _v13.termRef(0);
          ESLVal $231 = _v13.termRef(1);
          
          {ESLVal l = $232;
          
          {ESLVal f = $231;
          
          return f.add(new ESLVal(""));
        }
        }
        }
      case "Apply": {ESLVal $230 = _v13.termRef(0);
          ESLVal $229 = _v13.termRef(1);
          ESLVal $228 = _v13.termRef(2);
          
          {ESLVal l = $230;
          
          {ESLVal op = $229;
          
          {ESLVal args = $228;
          
          return ppExp.apply(indent,op).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $227 = _v13.termRef(0);
          ESLVal $226 = _v13.termRef(1);
          ESLVal $225 = _v13.termRef(2);
          
          {ESLVal l = $227;
          
          {ESLVal op = $226;
          
          {ESLVal args = $225;
          
          return ppExp.apply(indent,op);
        }
        }
        }
        }
      case "Block": {ESLVal $224 = _v13.termRef(0);
          ESLVal $223 = _v13.termRef(1);
          
          {ESLVal l = $224;
          
          {ESLVal es = $223;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(ppExps.apply(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl.apply(indent).add(new ESLVal("}")))));
        }
        }
        }
      case "Case": {ESLVal $222 = _v13.termRef(0);
          ESLVal $221 = _v13.termRef(1);
          ESLVal $220 = _v13.termRef(2);
          ESLVal $219 = _v13.termRef(3);
          
          {ESLVal l = $222;
          
          {ESLVal ds = $221;
          
          {ESLVal es = $220;
          
          {ESLVal as = $219;
          
          return new ESLVal("case ").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun441"),getSelf()) {
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
      case "CaseTerm": {ESLVal $218 = _v13.termRef(0);
          ESLVal $217 = _v13.termRef(1);
          ESLVal $216 = _v13.termRef(2);
          ESLVal $215 = _v13.termRef(3);
          
          {ESLVal l = $218;
          
          {ESLVal e = $217;
          
          {ESLVal arms = $216;
          
          {ESLVal alt = $215;
          
          return new ESLVal("caseTerm ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun442"),getSelf()) {
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
      case "CaseList": {ESLVal $214 = _v13.termRef(0);
          ESLVal $213 = _v13.termRef(1);
          ESLVal $212 = _v13.termRef(2);
          ESLVal $211 = _v13.termRef(3);
          ESLVal $210 = _v13.termRef(4);
          
          {ESLVal l = $214;
          
          {ESLVal e = $213;
          
          {ESLVal cons = $212;
          
          {ESLVal nil = $211;
          
          {ESLVal alt = $210;
          
          return new ESLVal("caseList ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),cons).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl.apply(indent.add(new ESLVal(4))).add(ppExp.apply(indent.add(new ESLVal(4)),nil).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp.apply(indent.add(new ESLVal(4)),alt).add(nl.apply(indent).add(new ESLVal("}"))))))))))))))));
        }
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $209 = _v13.termRef(0);
          ESLVal $208 = _v13.termRef(1);
          ESLVal $207 = _v13.termRef(2);
          ESLVal $206 = _v13.termRef(3);
          
          {ESLVal l = $209;
          
          {ESLVal e = $208;
          
          {ESLVal arms = $207;
          
          {ESLVal alt = $206;
          
          return new ESLVal("caseInt ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun443"),getSelf()) {
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
      case "CaseStr": {ESLVal $205 = _v13.termRef(0);
          ESLVal $204 = _v13.termRef(1);
          ESLVal $203 = _v13.termRef(2);
          ESLVal $202 = _v13.termRef(3);
          
          {ESLVal l = $205;
          
          {ESLVal e = $204;
          
          {ESLVal arms = $203;
          
          {ESLVal alt = $202;
          
          return new ESLVal("caseStr ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun444"),getSelf()) {
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
      case "CaseBool": {ESLVal $201 = _v13.termRef(0);
          ESLVal $200 = _v13.termRef(1);
          ESLVal $199 = _v13.termRef(2);
          ESLVal $198 = _v13.termRef(3);
          
          {ESLVal l = $201;
          
          {ESLVal e = $200;
          
          {ESLVal arms = $199;
          
          {ESLVal alt = $198;
          
          return new ESLVal("caseBool ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun445"),getSelf()) {
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
      case "CaseError": {ESLVal $197 = _v13.termRef(0);
          ESLVal $196 = _v13.termRef(1);
          
          {ESLVal l = $197;
          
          {ESLVal e = $196;
          
          return new ESLVal("caseError()");
        }
        }
        }
      case "Head": {ESLVal $195 = _v13.termRef(0);
          
          {ESLVal e = $195;
          
          return new ESLVal("head(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Tail": {ESLVal $194 = _v13.termRef(0);
          
          {ESLVal e = $194;
          
          return new ESLVal("tail(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
      case "Cons": {ESLVal $193 = _v13.termRef(0);
          ESLVal $192 = _v13.termRef(1);
          
          {ESLVal h = $193;
          
          {ESLVal t = $192;
          
          return new ESLVal("cons(").add(ppExp.apply(indent,h).add(new ESLVal(",").add(ppExp.apply(indent,t).add(new ESLVal(")")))));
        }
        }
        }
      case "If": {ESLVal $191 = _v13.termRef(0);
          ESLVal $190 = _v13.termRef(1);
          ESLVal $189 = _v13.termRef(2);
          ESLVal $188 = _v13.termRef(3);
          
          {ESLVal l = $191;
          
          {ESLVal e1 = $190;
          
          {ESLVal e2 = $189;
          
          {ESLVal e3 = $188;
          
          return new ESLVal("if ").add(ppExp.apply(indent,e1).add(nl.apply(indent).add(new ESLVal("then").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(nl.apply(indent).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e3))))))))));
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $187 = _v13.termRef(0);
          ESLVal $186 = _v13.termRef(1);
          ESLVal $185 = _v13.termRef(2);
          ESLVal $184 = _v13.termRef(3);
          ESLVal $183 = _v13.termRef(4);
          
          {ESLVal l = $187;
          
          {ESLVal n = $186;
          
          {ESLVal args = $185;
          
          {ESLVal t = $184;
          
          {ESLVal e = $183;
          
          return new ESLVal("fun(").add(ppDecs.apply(indent,args).add(new ESLVal(")::").add(ppType.apply(t).add(new ESLVal(" ").add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        }
        }
        }
      case "Let": {ESLVal $182 = _v13.termRef(0);
          ESLVal $181 = _v13.termRef(1);
          ESLVal $180 = _v13.termRef(2);
          
          {ESLVal l = $182;
          
          {ESLVal bs = $181;
          
          {ESLVal e = $180;
          
          return new ESLVal("let ").add(ppBinds.apply(indent.add(new ESLVal(4)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "Letrec": {ESLVal $179 = _v13.termRef(0);
          ESLVal $178 = _v13.termRef(1);
          ESLVal $177 = _v13.termRef(2);
          
          {ESLVal l = $179;
          
          {ESLVal bs = $178;
          
          {ESLVal e = $177;
          
          return new ESLVal("letrec ").add(ppBinds.apply(indent.add(new ESLVal(7)),bs).add(nl.apply(indent).add(new ESLVal("in ").add(ppExp.apply(indent.add(new ESLVal(3)),e)))));
        }
        }
        }
        }
      case "List": {ESLVal $176 = _v13.termRef(0);
          ESLVal $175 = _v13.termRef(1);
          
          {ESLVal l = $176;
          
          {ESLVal es = $175;
          
          return new ESLVal("[").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal("]")));
        }
        }
        }
      case "Throw": {ESLVal $174 = _v13.termRef(0);
          ESLVal $173 = _v13.termRef(1);
          ESLVal $172 = _v13.termRef(2);
          
          {ESLVal l = $174;
          
          {ESLVal t = $173;
          
          {ESLVal e = $172;
          
          return new ESLVal("throw ").add(ppExp.apply(indent,e));
        }
        }
        }
        }
      case "Term": {ESLVal $171 = _v13.termRef(0);
          ESLVal $170 = _v13.termRef(1);
          ESLVal $169 = _v13.termRef(2);
          ESLVal $168 = _v13.termRef(3);
          
          {ESLVal l = $171;
          
          {ESLVal n = $170;
          
          {ESLVal ts = $169;
          
          {ESLVal es = $168;
          
          return n.add(new ESLVal("(").add(ppExps.apply(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $167 = _v13.termRef(0);
          ESLVal $166 = _v13.termRef(1);
          
          {ESLVal e = $167;
          
          {ESLVal n = $166;
          
          return new ESLVal("termRef(").add(ppExp.apply(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
        }
        }
        }
      case "BinExp": {ESLVal $165 = _v13.termRef(0);
          ESLVal $164 = _v13.termRef(1);
          ESLVal $163 = _v13.termRef(2);
          ESLVal $162 = _v13.termRef(3);
          
          {ESLVal l = $165;
          
          {ESLVal e1 = $164;
          
          {ESLVal op = $163;
          
          {ESLVal e2 = $162;
          
          return ppExp.apply(indent,e1).add(op.add(ppExp.apply(indent,e2)));
        }
        }
        }
        }
        }
      case "Update": {ESLVal $161 = _v13.termRef(0);
          ESLVal $160 = _v13.termRef(1);
          ESLVal $159 = _v13.termRef(2);
          
          {ESLVal l = $161;
          
          {ESLVal n = $160;
          
          {ESLVal e = $159;
          
          return n.add(new ESLVal(" := ").add(ppExp.apply(indent,e)));
        }
        }
        }
        }
      case "NewArray": {ESLVal $158 = _v13.termRef(0);
          ESLVal $157 = _v13.termRef(1);
          ESLVal $156 = _v13.termRef(2);
          
          {ESLVal l = $158;
          
          {ESLVal t = $157;
          
          {ESLVal n = $156;
          
          return new ESLVal("new Array[").add(ppType.apply(t).add(new ESLVal("](").add(ppExp.apply(indent,n).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "For": {ESLVal $155 = _v13.termRef(0);
          ESLVal $154 = _v13.termRef(1);
          ESLVal $153 = _v13.termRef(2);
          ESLVal $152 = _v13.termRef(3);
          
          {ESLVal l = $155;
          
          {ESLVal p = $154;
          
          {ESLVal e1 = $153;
          
          {ESLVal e2 = $152;
          
          return new ESLVal("for ").add(ppPattern.apply(p).add(new ESLVal(" in ").add(ppExp.apply(indent,e1).add(new ESLVal(" do {").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
        }
        }
        }
        }
        }
      case "Try": {ESLVal $151 = _v13.termRef(0);
          ESLVal $150 = _v13.termRef(1);
          ESLVal $149 = _v13.termRef(2);
          
          {ESLVal l = $151;
          
          {ESLVal e = $150;
          
          {ESLVal as = $149;
          
          return new ESLVal("try ").add(ppExp.apply(indent,e).add(new ESLVal(" {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun446"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal a = $args[0];
          return ppArm.apply(indent,a);
            }
          }),as)).add(nl.apply(indent).add(new ESLVal("}")))))));
        }
        }
        }
        }
      case "ActExp": {ESLVal $148 = _v13.termRef(0);
          ESLVal $147 = _v13.termRef(1);
          ESLVal $146 = _v13.termRef(2);
          ESLVal $145 = _v13.termRef(3);
          ESLVal $144 = _v13.termRef(4);
          ESLVal $143 = _v13.termRef(5);
          ESLVal $142 = _v13.termRef(6);
          ESLVal $141 = _v13.termRef(7);
          
          {ESLVal l = $148;
          
          {ESLVal n = $147;
          
          {ESLVal args = $146;
          
          {ESLVal x = $145;
          
          {ESLVal parent = $144;
          
          {ESLVal locals = $143;
          
          {ESLVal init = $142;
          
          {ESLVal handlers = $141;
          
          return new ESLVal("act ").add(ppExp.apply(indent,n).add(new ESLVal("(").add(ppDecs.apply(indent,args).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppBinds.apply(indent.add(new ESLVal(5)),locals).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp.apply(indent.add(new ESLVal(4)),init).add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun447"),getSelf()) {
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
      case "Self": {ESLVal $140 = _v13.termRef(0);
          
          {ESLVal l = $140;
          
          return new ESLVal("self");
        }
        }
      case "Ref": {ESLVal $139 = _v13.termRef(0);
          ESLVal $138 = _v13.termRef(1);
          ESLVal $137 = _v13.termRef(2);
          
          {ESLVal l = $139;
          
          {ESLVal e = $138;
          
          {ESLVal n = $137;
          
          return ppExp.apply(indent,e).add(new ESLVal(".").add(n));
        }
        }
        }
        }
      case "Send": {ESLVal $136 = _v13.termRef(0);
          ESLVal $135 = _v13.termRef(1);
          ESLVal $134 = _v13.termRef(2);
          
          {ESLVal l = $136;
          
          {ESLVal target = $135;
          
          {ESLVal message = $134;
          
          return ppExp.apply(indent,target).add(new ESLVal(" <- ").add(ppExp.apply(indent,message)));
        }
        }
        }
        }
      case "Cmp": {ESLVal $133 = _v13.termRef(0);
          ESLVal $132 = _v13.termRef(1);
          ESLVal $131 = _v13.termRef(2);
          
          {ESLVal l = $133;
          
          {ESLVal e = $132;
          
          {ESLVal qs = $131;
          
          return new ESLVal("[").add(ppExp.apply(indent,e).add(new ESLVal(" | ").add(ppJoin.apply(indent.add(new ESLVal(2)),map.apply(new ESLVal(new Function(new ESLVal("fun448"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal q = $args[0];
          return ppQual.apply(indent,q);
            }
          }),qs)).add(new ESLVal("]")))));
        }
        }
        }
        }
      case "New": {ESLVal $130 = _v13.termRef(0);
          ESLVal $129 = _v13.termRef(1);
          ESLVal $128 = _v13.termRef(2);
          
          {ESLVal l = $130;
          
          {ESLVal b = $129;
          
          {ESLVal args = $128;
          
          return new ESLVal("new ").add(ppExp.apply(indent,b).add(new ESLVal("(").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
      case "NewJava": {ESLVal $127 = _v13.termRef(0);
          ESLVal $126 = _v13.termRef(1);
          ESLVal $125 = _v13.termRef(2);
          ESLVal $124 = _v13.termRef(3);
          
          {ESLVal l = $127;
          
          {ESLVal className = $126;
          
          {ESLVal t = $125;
          
          {ESLVal args = $124;
          
          return new ESLVal("javaNew[").add(ppType.apply(t).add(new ESLVal("](\' + className + ").add(ppExps.apply(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $123 = _v13.termRef(0);
          ESLVal $122 = _v13.termRef(1);
          ESLVal $121 = _v13.termRef(2);
          
          {ESLVal l = $123;
          
          {ESLVal rs = $122;
          
          {ESLVal e = $121;
          
          return new ESLVal("*********grab");
        }
        }
        }
        }
      case "Probably": {ESLVal $120 = _v13.termRef(0);
          ESLVal $119 = _v13.termRef(1);
          ESLVal $118 = _v13.termRef(2);
          ESLVal $117 = _v13.termRef(3);
          ESLVal $116 = _v13.termRef(4);
          
          {ESLVal l = $120;
          
          {ESLVal p = $119;
          
          {ESLVal t = $118;
          
          {ESLVal e1 = $117;
          
          {ESLVal e2 = $116;
          
          return new ESLVal("**** probably");
        }
        }
        }
        }
        }
        }
      case "Not": {ESLVal $115 = _v13.termRef(0);
          ESLVal $114 = _v13.termRef(1);
          
          {ESLVal l = $115;
          
          {ESLVal e = $114;
          
          return new ESLVal("not(").add(ppExp.apply(indent,e).add(new ESLVal(")")));
        }
        }
        }
      case "Fold": {ESLVal $113 = _v13.termRef(0);
          ESLVal $112 = _v13.termRef(1);
          ESLVal $111 = _v13.termRef(2);
          
          {ESLVal l = $113;
          
          {ESLVal t = $112;
          
          {ESLVal e = $111;
          
          return new ESLVal("******** fold");
        }
        }
        }
        }
      case "Unfold": {ESLVal $110 = _v13.termRef(0);
          ESLVal $109 = _v13.termRef(1);
          ESLVal $108 = _v13.termRef(2);
          
          {ESLVal l = $110;
          
          {ESLVal t = $109;
          
          {ESLVal e = $108;
          
          return new ESLVal("******unfold");
        }
        }
        }
        }
      case "Now": {ESLVal $107 = _v13.termRef(0);
          
          {ESLVal l = $107;
          
          return new ESLVal("now");
        }
        }
      case "Become": {ESLVal $106 = _v13.termRef(0);
          ESLVal $105 = _v13.termRef(1);
          
          {ESLVal l = $106;
          
          {ESLVal e = $105;
          
          return new ESLVal("become ").add(ppExp.apply(indent,e));
        }
        }
        }
      case "ArrayRef": {ESLVal $104 = _v13.termRef(0);
          ESLVal $103 = _v13.termRef(1);
          ESLVal $102 = _v13.termRef(2);
          
          {ESLVal l = $104;
          
          {ESLVal a = $103;
          
          {ESLVal i = $102;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("]"))));
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $101 = _v13.termRef(0);
          ESLVal $100 = _v13.termRef(1);
          ESLVal $99 = _v13.termRef(2);
          ESLVal $98 = _v13.termRef(3);
          
          {ESLVal l = $101;
          
          {ESLVal a = $100;
          
          {ESLVal i = $99;
          
          {ESLVal v = $98;
          
          return ppExp.apply(indent,a).add(new ESLVal("[").add(ppExp.apply(indent,i).add(new ESLVal("] := ").add(ppExp.apply(indent,v)))));
        }
        }
        }
        }
        }
        default: {ESLVal x = _v13;
          
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
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun449"),getSelf()) {
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
  {ESLVal _v14 = d;
        
        switch(_v14.termName) {
        case "Dec": {ESLVal $252 = _v14.termRef(0);
          ESLVal $251 = _v14.termRef(1);
          ESLVal $250 = _v14.termRef(2);
          ESLVal $249 = _v14.termRef(3);
          
          {ESLVal l = $252;
          
          {ESLVal n = $251;
          
          {ESLVal dt = $250;
          
          {ESLVal t = $249;
          
          return n.add(new ESLVal("::").add(ppType.apply(t)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9565,9642)").add(ESLVal.list(_v14)));
      }
      }
    }
  });
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal bs = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun450"),getSelf()) {
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
  {ESLVal _v15 = b;
        
        switch(_v15.termName) {
        case "Binding": {ESLVal $276 = _v15.termRef(0);
          ESLVal $275 = _v15.termRef(1);
          ESLVal $274 = _v15.termRef(2);
          ESLVal $273 = _v15.termRef(3);
          ESLVal $272 = _v15.termRef(4);
          
          {ESLVal l = $276;
          
          {ESLVal name = $275;
          
          {ESLVal t = $274;
          
          {ESLVal st = $273;
          
          {ESLVal value = $272;
          
          return name.add(new ESLVal("=").add(ppExp.apply(indent,value).add(new ESLVal(";"))));
        }
        }
        }
        }
        }
        }
      case "TypeBind": {ESLVal $271 = _v15.termRef(0);
          ESLVal $270 = _v15.termRef(1);
          ESLVal $269 = _v15.termRef(2);
          ESLVal $268 = _v15.termRef(3);
          
          {ESLVal l = $271;
          
          {ESLVal name = $270;
          
          {ESLVal t = $269;
          
          {ESLVal ignore = $268;
          
          return new ESLVal("type ").add(name);
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $267 = _v15.termRef(0);
          ESLVal $266 = _v15.termRef(1);
          ESLVal $265 = _v15.termRef(2);
          ESLVal $264 = _v15.termRef(3);
          
          {ESLVal l = $267;
          
          {ESLVal name = $266;
          
          {ESLVal t = $265;
          
          {ESLVal ignore = $264;
          
          return new ESLVal("data ").add(name);
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $263 = _v15.termRef(0);
          ESLVal $262 = _v15.termRef(1);
          ESLVal $261 = _v15.termRef(2);
          ESLVal $260 = _v15.termRef(3);
          ESLVal $259 = _v15.termRef(4);
          ESLVal $258 = _v15.termRef(5);
          ESLVal $257 = _v15.termRef(6);
          
          {ESLVal l = $263;
          
          {ESLVal name = $262;
          
          {ESLVal args = $261;
          
          {ESLVal t = $260;
          
          {ESLVal st = $259;
          
          {ESLVal body = $258;
          
          {ESLVal guard = $257;
          
          return name.add(new ESLVal("(").add(ppPatterns.apply(args).add(new ESLVal(") = ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),body))))));
        }
        }
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $256 = _v15.termRef(0);
          ESLVal $255 = _v15.termRef(1);
          ESLVal $254 = _v15.termRef(2);
          ESLVal $253 = _v15.termRef(3);
          
          {ESLVal l = $256;
          
          {ESLVal name = $255;
          
          {ESLVal t = $254;
          
          {ESLVal ignore = $253;
          
          return name;
        }
        }
        }
        }
        }
        default: {ESLVal x = _v15;
          
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
  {ESLVal _v16 = a;
        
        switch(_v16.termName) {
        case "BArm": {ESLVal $280 = _v16.termRef(0);
          ESLVal $279 = _v16.termRef(1);
          ESLVal $278 = _v16.termRef(2);
          ESLVal $277 = _v16.termRef(3);
          
          {ESLVal l = $280;
          
          {ESLVal ps = $279;
          
          {ESLVal guard = $278;
          
          {ESLVal e = $277;
          
          return ppPatterns.apply(ps).add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10427,10565)").add(ESLVal.list(_v16)));
      }
      }
    }
  });
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal arms = $args[1];
  return ppJoin.apply(indent,map.apply(new ESLVal(new Function(new ESLVal("fun451"),getSelf()) {
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
  {ESLVal _v17 = a;
        
        switch(_v17.termName) {
        case "TArm": {ESLVal $282 = _v17.termRef(0);
          ESLVal $281 = _v17.termRef(1);
          
          {ESLVal n = $282;
          
          {ESLVal e = $281;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10727,10827)").add(ESLVal.list(_v17)));
      }
      }
    }
  });
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v18 = a;
        
        switch(_v18.termName) {
        case "IArm": {ESLVal $284 = _v18.termRef(0);
          ESLVal $283 = _v18.termRef(1);
          
          {ESLVal n = $284;
          
          {ESLVal e = $283;
          
          return n.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10883,10983)").add(ESLVal.list(_v18)));
      }
      }
    }
  });
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v19 = a;
        
        switch(_v19.termName) {
        case "SArm": {ESLVal $286 = _v19.termRef(0);
          ESLVal $285 = _v19.termRef(1);
          
          {ESLVal n = $286;
          
          {ESLVal e = $285;
          
          return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11039,11153)").add(ESLVal.list(_v19)));
      }
      }
    }
  });
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal a = $args[1];
  {ESLVal _v20 = a;
        
        switch(_v20.termName) {
        case "BoolArm": {ESLVal $288 = _v20.termRef(0);
          ESLVal $287 = _v20.termRef(1);
          
          {ESLVal b = $288;
          
          {ESLVal e = $287;
          
          return b.add(new ESLVal(" -> ").add(nl.apply(indent.add(new ESLVal(2))).add(ppExp.apply(indent.add(new ESLVal(2)),e))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11211,11315)").add(ESLVal.list(_v20)));
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
        
        {ESLVal _v21 = sourceFile;
        
        switch(_v21.strVal) {
        case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
        default: {ESLVal x = _v21;
          
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
  {ESLVal _v22 = m;
        
        switch(_v22.termName) {
        case "JModule": {ESLVal $292 = _v22.termRef(0);
          ESLVal $291 = _v22.termRef(1);
          ESLVal $290 = _v22.termRef(2);
          ESLVal $289 = _v22.termRef(3);
          
          {ESLVal n = $292;
          
          {ESLVal exports = $291;
          
          {ESLVal imports = $290;
          
          {ESLVal fields = $289;
          
          return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl.apply($zero).add(new ESLVal("import esl.lib.*;").add(nl.apply($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl.apply($zero).add(ppJoin.apply($zero,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal i = $l0.head();
                $l0 = $l0.tail();
                $v.add(getImport.apply(i));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(imports)).add(nl.apply($zero).add(new ESLVal("import java.util.function.Supplier;").add(nl.apply($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl.apply(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl.apply(new ESLVal(2)).add(ppJoin.apply(new ESLVal(2),map.apply(new ESLVal(new Function(new ESLVal("fun452"),getSelf()) {
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
        default: return error(new ESLVal("case error at Pos(11710,12472)").add(ESLVal.list(_v22)));
      }
      }
    }
  });
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal exports = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v23 = f;
        
        switch(_v23.termName) {
        case "JField": {ESLVal $295 = _v23.termRef(0);
          ESLVal $294 = _v23.termRef(1);
          ESLVal $293 = _v23.termRef(2);
          
          switch($295.strVal) {
          case "edb": switch($293.termName) {
            case "JNull": {
              {ESLVal t = $294;
              
              return new ESLVal("// static ESLVal edb = null;");
            }
            }
            default: {ESLVal n = $295;
              
              {ESLVal t = $294;
              
              {ESLVal e = $293;
              
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
          default: {ESLVal n = $295;
            
            {ESLVal t = $294;
            
            {ESLVal e = $293;
            
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
        default: return error(new ESLVal("case error at Pos(12541,12791)").add(ESLVal.list(_v23)));
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
  {ESLVal _v24 = exps;
        
        if(_v24.isCons())
        {ESLVal $296 = _v24.head();
          ESLVal $297 = _v24.tail();
          
          if($297.isCons())
          {ESLVal $298 = $297.head();
            ESLVal $299 = $297.tail();
            
            {ESLVal e1 = $296;
            
            {ESLVal e2 = $298;
            
            {ESLVal es = $299;
            
            return ppJExp.apply(indent,dynamics,e1).add(sep.add(ppJExps.apply(indent,dynamics,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($297.isNil())
          {ESLVal e = $296;
            
            return ppJExp.apply(indent,dynamics,e);
          }
        else return error(new ESLVal("case error at Pos(12861,13055)").add(ESLVal.list(_v24)));
        }
      else if(_v24.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(12861,13055)").add(ESLVal.list(_v24)));
      }
    }
  });
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal decs = $args[1];
  ESLVal sep = $args[2];
  {ESLVal _v25 = decs;
        
        if(_v25.isCons())
        {ESLVal $300 = _v25.head();
          ESLVal $301 = _v25.tail();
          
          if($301.isCons())
          {ESLVal $302 = $301.head();
            ESLVal $303 = $301.tail();
            
            {ESLVal e1 = $300;
            
            {ESLVal e2 = $302;
            
            {ESLVal es = $303;
            
            return pJDec.apply(indent,e1).add(sep.add(ppJDecs.apply(indent,es.cons(e2),sep)));
          }
          }
          }
          }
        else if($301.isNil())
          {ESLVal e = $300;
            
            return pJDec.apply(indent,e);
          }
        else return error(new ESLVal("case error at Pos(13117,13329)").add(ESLVal.list(_v25)));
        }
      else if(_v25.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(13117,13329)").add(ESLVal.list(_v25)));
      }
    }
  });
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v26 = d;
        
        switch(_v26.termName) {
        case "JDec": {ESLVal $305 = _v26.termRef(0);
          ESLVal $304 = _v26.termRef(1);
          
          {ESLVal n = $305;
          
          {ESLVal t = $304;
          
          return new ESLVal("ESLVal ").add(n);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(13375,13431)").add(ESLVal.list(_v26)));
      }
      }
    }
  });
  private static ESLVal ppJExp = new ESLVal(new Function(new ESLVal("ppJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v27 = e;
        
        switch(_v27.termName) {
        case "JArrayRef": {ESLVal $402 = _v27.termRef(0);
          ESLVal $401 = _v27.termRef(1);
          
          {ESLVal a = $402;
          
          {ESLVal i = $401;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal]"))));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $400 = _v27.termRef(0);
          ESLVal $399 = _v27.termRef(1);
          ESLVal $398 = _v27.termRef(2);
          
          {ESLVal a = $400;
          
          {ESLVal i = $399;
          
          {ESLVal v = $398;
          
          return ppJExp.apply(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp.apply(indent,dynamics,v)))));
        }
        }
        }
        }
      case "JBecome": {ESLVal $395 = _v27.termRef(0);
          ESLVal $394 = _v27.termRef(1);
          
          if($394.isCons())
          {ESLVal $396 = $394.head();
            ESLVal $397 = $394.tail();
            
            {ESLVal _v113 = $395;
            
            {ESLVal es = $394;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v113).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($394.isNil())
          {ESLVal _v114 = $395;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v114).add(new ESLVal(",getSelf())")));
          }
        else {ESLVal _v115 = $395;
            
            {ESLVal es = $394;
            
            return new ESLVal("become(").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v115).add(new ESLVal(",getSelf(),").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JConstExp": {ESLVal $389 = _v27.termRef(0);
          
          switch($389.termName) {
          case "JConstInt": {ESLVal $393 = $389.termRef(0);
            
            switch($393.intVal) {
            case 0: return new ESLVal("$zero");
          case 1: return new ESLVal("$one");
            default: {ESLVal n = $393;
              
              return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
            }
          }
          }
        case "JConstBool": {ESLVal $392 = $389.termRef(0);
            
            switch($392.boolVal ? 1 : 0) {
            case 1: return new ESLVal("$true");
          case 0: return new ESLVal("$false");
            default: {ESLVal _v111 = _v27;
              
              return new ESLVal("********** unknown expression: ").add(_v111);
            }
          }
          }
        case "JConstStr": {ESLVal $391 = $389.termRef(0);
            
            {ESLVal s = $391;
            
            return new ESLVal("new ESLVal(\"").add(javaString.apply(s).add(new ESLVal("\")")));
          }
          }
        case "JConstDouble": {ESLVal $390 = $389.termRef(0);
            
            {ESLVal d = $390;
            
            return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
          }
          }
          default: {ESLVal _v112 = _v27;
            
            return new ESLVal("********** unknown expression: ").add(_v112);
          }
        }
        }
      case "JNot": {ESLVal $388 = _v27.termRef(0);
          
          {ESLVal _v110 = $388;
          
          return ppJExp.apply(indent,dynamics,_v110).add(new ESLVal(".not()"));
        }
        }
      case "JNil": {ESLVal $387 = _v27.termRef(0);
          
          {ESLVal t = $387;
          
          return new ESLVal("$nil");
        }
        }
      case "JList": {ESLVal $386 = _v27.termRef(0);
          ESLVal $385 = _v27.termRef(1);
          
          {ESLVal t = $386;
          
          {ESLVal es = $385;
          
          return ppJListExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JSet": {ESLVal $384 = _v27.termRef(0);
          ESLVal $383 = _v27.termRef(1);
          
          {ESLVal t = $384;
          
          {ESLVal es = $383;
          
          return ppJSetExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JBag": {ESLVal $382 = _v27.termRef(0);
          ESLVal $381 = _v27.termRef(1);
          
          {ESLVal t = $382;
          
          {ESLVal es = $381;
          
          return ppJBagExp.apply(indent,dynamics,t,es);
        }
        }
        }
      case "JTerm": {ESLVal $378 = _v27.termRef(0);
          ESLVal $377 = _v27.termRef(1);
          
          if($377.isCons())
          {ESLVal $379 = $377.head();
            ESLVal $380 = $377.tail();
            
            {ESLVal n = $378;
            
            {ESLVal es = $377;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($377.isNil())
          {ESLVal n = $378;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
          }
        else {ESLVal n = $378;
            
            {ESLVal es = $377;
            
            return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JFun": {ESLVal $376 = _v27.termRef(0);
          ESLVal $375 = _v27.termRef(1);
          ESLVal $374 = _v27.termRef(2);
          ESLVal $373 = _v27.termRef(3);
          
          {ESLVal n = $376;
          
          {ESLVal args = $375;
          
          {ESLVal t = $374;
          
          {ESLVal body = $373;
          
          return ppJFun.apply(indent,dynamics,n,args,t,body);
        }
        }
        }
        }
        }
      case "JBinExp": {ESLVal $372 = _v27.termRef(0);
          ESLVal $371 = _v27.termRef(1);
          ESLVal $370 = _v27.termRef(2);
          
          switch($371.strVal) {
          case "at": {ESLVal e1 = $372;
            
            {ESLVal e2 = $370;
            
            return new ESLVal("at(() -> { return ").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal("; },() -> { return ").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal("; })")))));
          }
          }
        case "==": {ESLVal e1 = $372;
            
            {ESLVal e2 = $370;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))));
          }
          }
        case "cons": {ESLVal e1 = $372;
            
            {ESLVal e2 = $370;
            
            return ppJExp.apply(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(")"))));
          }
          }
          default: {ESLVal e1 = $372;
            
            {ESLVal op = $371;
            
            {ESLVal e2 = $370;
            
            return ppJExp.apply(indent,dynamics,e1).add(new ESLVal(".").add(op.add(new ESLVal("(").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")"))))));
          }
          }
          }
        }
        }
      case "JCmpExp": {ESLVal $369 = _v27.termRef(0);
          
          {ESLVal c = $369;
          
          return ppJCmp.apply(indent,dynamics,c);
        }
        }
      case "JNull": {
          return new ESLVal("$null");
        }
      case "JNow": {
          return new ESLVal("now()");
        }
      case "JVar": {ESLVal $368 = _v27.termRef(0);
          ESLVal $367 = _v27.termRef(1);
          
          {ESLVal n = $368;
          
          {ESLVal t = $367;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0]"));
          else
            {ESLVal _v108 = $368;
              
              {ESLVal _v109 = $367;
              
              return _v108;
            }
            }
        }
        }
        }
      case "JError": {ESLVal $366 = _v27.termRef(0);
          
          {ESLVal _v107 = $366;
          
          return new ESLVal("error(").add(ppJExp.apply(indent,dynamics,_v107).add(new ESLVal(")")));
        }
        }
      case "JApply": {ESLVal $365 = _v27.termRef(0);
          ESLVal $364 = _v27.termRef(1);
          
          {ESLVal _v106 = $365;
          
          {ESLVal es = $364;
          
          return ppJExp.apply(indent,dynamics,_v106).add(new ESLVal(".apply(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
        }
        }
        }
      case "JCommandExp": {ESLVal $363 = _v27.termRef(0);
          ESLVal $362 = _v27.termRef(1);
          
          {ESLVal c = $363;
          
          {ESLVal t = $362;
          
          return new ESLVal("((Supplier<ESLVal>)() -> { ").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c).add(nl.apply(indent).add(new ESLVal("}).get()")))));
        }
        }
        }
      case "JIfExp": {ESLVal $361 = _v27.termRef(0);
          ESLVal $360 = _v27.termRef(1);
          ESLVal $359 = _v27.termRef(2);
          
          {ESLVal _v105 = $361;
          
          {ESLVal e1 = $360;
          
          {ESLVal e2 = $359;
          
          return new ESLVal("(").add(ppJExp.apply(indent,dynamics,_v105).add(new ESLVal(".boolVal) ? (").add(ppJExp.apply(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp.apply(indent,dynamics,e2).add(new ESLVal(")")))))));
        }
        }
        }
        }
      case "JHead": {ESLVal $358 = _v27.termRef(0);
          
          {ESLVal _v104 = $358;
          
          return ppJExp.apply(indent,dynamics,_v104).add(new ESLVal(".head()"));
        }
        }
      case "JTail": {ESLVal $357 = _v27.termRef(0);
          
          {ESLVal _v103 = $357;
          
          return ppJExp.apply(indent,dynamics,_v103).add(new ESLVal(".tail()"));
        }
        }
      case "JTermRef": {ESLVal $356 = _v27.termRef(0);
          ESLVal $355 = _v27.termRef(1);
          
          {ESLVal _v102 = $356;
          
          {ESLVal n = $355;
          
          return ppJExp.apply(indent,dynamics,_v102).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
        }
        }
        }
      case "JMapFun": {ESLVal $354 = _v27.termRef(0);
          ESLVal $353 = _v27.termRef(1);
          
          {ESLVal f = $354;
          
          {ESLVal l = $353;
          
          return ppJExp.apply(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(")"))));
        }
        }
        }
      case "JFlatten": {ESLVal $352 = _v27.termRef(0);
          
          {ESLVal ls = $352;
          
          return ppJExp.apply(indent,dynamics,ls).add(new ESLVal(".flatten()"));
        }
        }
      case "JBehaviour": {ESLVal $347 = _v27.termRef(0);
          ESLVal $346 = _v27.termRef(1);
          ESLVal $345 = _v27.termRef(2);
          ESLVal $344 = _v27.termRef(3);
          ESLVal $343 = _v27.termRef(4);
          
          switch($344.termName) {
          case "JFun": {ESLVal $351 = $344.termRef(0);
            ESLVal $350 = $344.termRef(1);
            ESLVal $349 = $344.termRef(2);
            ESLVal $348 = $344.termRef(3);
            
            {ESLVal es = $347;
            
            {ESLVal fs = $346;
            
            {ESLVal init = $345;
            
            {ESLVal n = $351;
            
            {ESLVal args = $350;
            
            {ESLVal t = $349;
            
            {ESLVal body = $348;
            
            {ESLVal time = $343;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";"))))));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(es)).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"ref illegal \" + self + \".\" + name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _v101 = _v27;
            
            return new ESLVal("********** unknown expression: ").add(_v101);
          }
        }
        }
      case "JExtendedBehaviour": {ESLVal $338 = _v27.termRef(0);
          ESLVal $337 = _v27.termRef(1);
          ESLVal $336 = _v27.termRef(2);
          ESLVal $335 = _v27.termRef(3);
          ESLVal $334 = _v27.termRef(4);
          ESLVal $333 = _v27.termRef(5);
          
          switch($334.termName) {
          case "JFun": {ESLVal $342 = $334.termRef(0);
            ESLVal $341 = $334.termRef(1);
            ESLVal $340 = $334.termRef(2);
            ESLVal $339 = $334.termRef(3);
            
            {ESLVal es = $338;
            
            {ESLVal parent = $337;
            
            {ESLVal fs = $336;
            
            {ESLVal init = $335;
            
            {ESLVal n = $342;
            
            {ESLVal args = $341;
            
            {ESLVal t = $340;
            
            {ESLVal body = $339;
            
            {ESLVal time = $333;
            
            return new ESLVal("new ESLVal(new BehaviourAdapter(").add(ppBehaviourParent.apply(indent,dynamics,parent).add(new ESLVal(",").add(((Supplier<ESLVal>)() -> { 
              if(time.eql(new ESLVal("JBlock",ESLVal.list())).boolVal)
                return new ESLVal("false");
                else
                  return new ESLVal("true");
            }).get().add(new ESLVal(",getSelf(),").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(") {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,fs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";"))))));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(es)).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: return refSuper(name);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,time).add(nl.apply(indent).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("public ESLVal init() {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))))));
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
          default: {ESLVal _v100 = _v27;
            
            return new ESLVal("********** unknown expression: ").add(_v100);
          }
        }
        }
      case "JNew": {ESLVal $330 = _v27.termRef(0);
          ESLVal $329 = _v27.termRef(1);
          
          if($329.isCons())
          {ESLVal $331 = $329.head();
            ESLVal $332 = $329.tail();
            
            {ESLVal b = $330;
            
            {ESLVal args = $329;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($329.isNil())
          {ESLVal b = $330;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
          }
        else {ESLVal b = $330;
            
            {ESLVal args = $329;
            
            return new ESLVal("newActor(").add(ppJExp.apply(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JNewArray": {ESLVal $328 = _v27.termRef(0);
          
          {ESLVal i = $328;
          
          return new ESLVal("newArray(").add(ppJExp.apply(indent,dynamics,i).add(new ESLVal(".intVal)")));
        }
        }
      case "JNewTable": {
          return new ESLVal("newTable()");
        }
      case "JNewJava": {ESLVal $325 = _v27.termRef(0);
          ESLVal $324 = _v27.termRef(1);
          
          if($324.isCons())
          {ESLVal $326 = $324.head();
            ESLVal $327 = $324.tail();
            
            {ESLVal n = $325;
            
            {ESLVal args = $324;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
          }
        else if($324.isNil())
          {ESLVal n = $325;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
          }
        else {ESLVal n = $325;
            
            {ESLVal args = $324;
            
            return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
          }
          }
        }
      case "JRecord": {ESLVal $323 = _v27.termRef(0);
          
          {ESLVal fs = $323;
          
          return new ESLVal("newRecord(new ESLVal[]{").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                switch(_v28.termName) {
                case "JField": {ESLVal $405 = _v28.termRef(0);
                  ESLVal $404 = _v28.termRef(1);
                  ESLVal $403 = _v28.termRef(2);
                  
                  {ESLVal n = $405;
                  
                  {ESLVal t = $404;
                  
                  {ESLVal _v98 = $403;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JConstExp",new ESLVal("JConstStr",n))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v28;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal("},").add(ppJExps.apply(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                switch(_v29.termName) {
                case "JField": {ESLVal $408 = _v29.termRef(0);
                  ESLVal $407 = _v29.termRef(1);
                  ESLVal $406 = _v29.termRef(2);
                  
                  {ESLVal n = $408;
                  
                  {ESLVal t = $407;
                  
                  {ESLVal _v99 = $406;
                  
                  return ESLVal.list(ESLVal.list(_v99));
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
          }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      case "JSend": {ESLVal $320 = _v27.termRef(0);
          ESLVal $319 = _v27.termRef(1);
          ESLVal $318 = _v27.termRef(2);
          
          if($318.isCons())
          {ESLVal $321 = $318.head();
            ESLVal $322 = $318.tail();
            
            {ESLVal _v95 = $320;
            
            {ESLVal m = $319;
            
            {ESLVal args = $318;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v95).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
          }
        else if($318.isNil())
          {ESLVal _v96 = $320;
            
            {ESLVal m = $319;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v96).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
          }
          }
        else {ESLVal _v97 = $320;
            
            {ESLVal m = $319;
            
            {ESLVal args = $318;
            
            return new ESLVal("Lib.send(").add(ppJExp.apply(indent,dynamics,_v97).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
          }
          }
          }
        }
      case "JSendSuper": {ESLVal $317 = _v27.termRef(0);
          
          {ESLVal _v94 = $317;
          
          return new ESLVal("sendSuper(").add(ppJExp.apply(indent,dynamics,_v94).add(new ESLVal(")")));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("sendTimeSuper($t)");
        }
      case "JSelf": {
          return new ESLVal("getSelf()");
        }
      case "JRef": {ESLVal $316 = _v27.termRef(0);
          ESLVal $315 = _v27.termRef(1);
          
          {ESLVal _v93 = $316;
          
          {ESLVal n = $315;
          
          return ppJExp.apply(indent,dynamics,_v93).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
        }
        }
        }
      case "JRefSuper": {ESLVal $314 = _v27.termRef(0);
          
          {ESLVal n = $314;
          
          return new ESLVal("refSuper(\"").add(n.add(new ESLVal("\")")));
        }
        }
      case "JGrab": {ESLVal $313 = _v27.termRef(0);
          ESLVal $312 = _v27.termRef(1);
          
          {ESLVal es = $313;
          
          {ESLVal c = $312;
          
          return new ESLVal("lock(new Function(new ESLVal(\"grab\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal ...args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp.apply(indent,dynamics,c).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}},").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))))))))));
        }
        }
        }
      case "JTry": {ESLVal $311 = _v27.termRef(0);
          ESLVal $310 = _v27.termRef(1);
          ESLVal $309 = _v27.termRef(2);
          
          {ESLVal _v92 = $311;
          
          {ESLVal n = $310;
          
          {ESLVal c = $309;
          
          return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(4)),dynamics,_v92).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl.apply(indent.add(new ESLVal(6))).add(ppJCommand.apply(indent,dynamics,c).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
        }
        }
        }
        }
      case "JProbably": {ESLVal $308 = _v27.termRef(0);
          ESLVal $307 = _v27.termRef(1);
          ESLVal $306 = _v27.termRef(2);
          
          {ESLVal _v91 = $308;
          
          {ESLVal e1 = $307;
          
          {ESLVal e2 = $306;
          
          return new ESLVal("probably(").add(ppJExp.apply(indent,dynamics,_v91).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e1)).add(new ESLVal(",").add(ppJExp.apply(indent,dynamics,probFun.apply(e2)).add(new ESLVal(")")))))));
        }
        }
        }
        }
        default: {ESLVal _v116 = _v27;
          
          return new ESLVal("********** unknown expression: ").add(_v116);
        }
      }
      }
    }
  });
  private static ESLVal ppJCmp = new ESLVal(new Function(new ESLVal("ppJCmp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  { LetRec letrec = new LetRec() {
        ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v84 = $args[0];
          ESLVal _v85 = $args[1];
          ESLVal _v86 = $args[2];
          {ESLVal _v30 = _v86;
                
                switch(_v30.termName) {
                case "JCmpBind": {ESLVal $414 = _v30.termRef(0);
                  ESLVal $413 = _v30.termRef(1);
                  ESLVal $412 = _v30.termRef(2);
                  
                  {ESLVal n = $414;
                  
                  {ESLVal e = $413;
                  
                  {ESLVal _v88 = $412;
                  
                  return new ESLVal("ESLVal $l").add(_v85.add(new ESLVal(" = ").add(ppJExp.apply(_v84,dynamics,e).add(new ESLVal(";").add(nl.apply(_v84).add(new ESLVal("while(!$l").add(_v85.add(new ESLVal(".isNil()) {").add(nl.apply(_v84.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l").add(_v85.add(new ESLVal(".head();").add(nl.apply(_v84.add(new ESLVal(2))).add(new ESLVal("$l").add(_v85.add(new ESLVal(" = $l").add(_v85.add(new ESLVal(".tail();").add(nl.apply(_v84.add(new ESLVal(2))).add(inner.apply(_v84.add(new ESLVal(2)),_v85.add($one),_v88).add(nl.apply(_v84).add(new ESLVal("}")))))))))))))))))))))))));
                }
                }
                }
                }
              case "JCmpList": {ESLVal $411 = _v30.termRef(0);
                  
                  {ESLVal e = $411;
                  
                  return new ESLVal("$v.add(").add(ppJExp.apply(_v84,dynamics,e).add(new ESLVal(");")));
                }
                }
              case "JCmpIf": {ESLVal $410 = _v30.termRef(0);
                  ESLVal $409 = _v30.termRef(1);
                  
                  {ESLVal e = $410;
                  
                  {ESLVal _v87 = $409;
                  
                  return new ESLVal("if(").add(ppJExp.apply(_v84,dynamics,e).add(new ESLVal(".boolVal) {").add(inner.apply(_v84,_v85,_v87).add(nl.apply(_v84).add(new ESLVal("}"))))));
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(21287,21888)").add(ESLVal.list(_v30)));
              }
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
      
        {ESLVal _v31 = c;
        
        switch(_v31.termName) {
        case "JCmpOuter": {ESLVal $417 = _v31.termRef(0);
          ESLVal $416 = _v31.termRef(1);
          ESLVal $415 = _v31.termRef(2);
          
          {ESLVal n = $417;
          
          {ESLVal e = $416;
          
          {ESLVal _v89 = $415;
          
          return new ESLVal("new java.util.function.Function<ESLVal,ESLVal>() {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal $l0) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal $a = $nil;").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("while(!$l0.isNil()) { ").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l0.head();").add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("$l0 = $l0.tail();").add(nl.apply(indent.add(new ESLVal(6))).add(inner.apply(indent,$one,_v89).add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("return $a;").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}}.apply(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(")")))))))))))))))))))))))))));
        }
        }
        }
        }
        default: {ESLVal _v90 = _v31;
          
          return new ESLVal("// Illegal Comprehension ").add(_v90);
        }
      }
      }}
      
    }
  });
  private static ESLVal ppBehaviourParent = new ESLVal(new Function(new ESLVal("ppBehaviourParent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal e = $args[2];
  {ESLVal _v32 = e;
        
        switch(_v32.termName) {
        case "JApply": {ESLVal $419 = _v32.termRef(0);
          ESLVal $418 = _v32.termRef(1);
          
          {ESLVal op = $419;
          
          {ESLVal args = $418;
          
          return new ESLVal("getParent(getSelf(),").add(ppJExp.apply(indent,dynamics,op).add(new ESLVal(",").add(ppJExps.apply(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
        default: {ESLVal _v83 = _v32;
          
          return ppJExp.apply(indent,dynamics,_v83);
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
          {ESLVal _v33 = $qualArg;
                
                switch(_v33.termName) {
                case "JDec": {ESLVal $421 = _v33.termRef(0);
                  ESLVal $420 = _v33.termRef(1);
                  
                  {ESLVal _v79 = $421;
                  
                  {ESLVal _v80 = $420;
                  
                  return ESLVal.list(ESLVal.list(_v79));
                }
                }
                }
                default: {ESLVal _0 = _v33;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal boundDynamics = new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal d = $l0.head();
                $l0 = $l0.tail();
                if(member.apply(d,freeDynamics).boolVal) {$v.add(d);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(argNames);
        
        {ESLVal dom = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v34 = $qualArg;
                
                switch(_v34.termName) {
                case "JDec": {ESLVal $423 = _v34.termRef(0);
                  ESLVal $422 = _v34.termRef(1);
                  
                  {ESLVal _v81 = $423;
                  
                  {ESLVal _v82 = $422;
                  
                  return ESLVal.list(ESLVal.list(_v82));
                }
                }
                }
                default: {ESLVal _0 = _v34;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        ESLVal ran = t;
        
        return new ESLVal("new ESLVal(new Function(").add(ppJExp.apply(indent,dynamics,n).add(new ESLVal(",getSelf()) {").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... $args) {").add(nl.apply(indent.add(new ESLVal(4))).add(ppFunArgs.apply(indent,$zero,args,boundDynamics).add(ppJCommand.apply(indent.add(new ESLVal(4)),boundDynamics.add(new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              if(member.apply(d,argNames).not().boolVal) {$v.add(d);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(dynamics)),body).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("})"))))))))))));
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
  {ESLVal _v35 = args;
        
        if(_v35.isCons())
        {ESLVal $424 = _v35.head();
          ESLVal $425 = _v35.tail();
          
          switch($424.termName) {
          case "JDec": {ESLVal $427 = $424.termRef(0);
            ESLVal $426 = $424.termRef(1);
            
            {ESLVal n = $427;
            
            {ESLVal t = $426;
            
            {ESLVal _v75 = $425;
            
            if(member.apply(n,dynamicArgs).boolVal)
            return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v75,dynamicArgs)))))));
            else
              {ESLVal _v76 = $427;
                
                {ESLVal _v77 = $426;
                
                {ESLVal _v78 = $425;
                
                return new ESLVal("ESLVal ").add(_v76.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(ppFunArgs.apply(indent,i.add($one),_v78,dynamicArgs)))))));
              }
              }
              }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(23872,24266)").add(ESLVal.list(_v35)));
        }
        }
      else if(_v35.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(23872,24266)").add(ESLVal.list(_v35)));
      }
    }
  });
  private static ESLVal ppJCommand = new ESLVal(new Function(new ESLVal("ppJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal c = $args[2];
  {ESLVal _v36 = c;
        
        switch(_v36.termName) {
        case "JIfCommand": {ESLVal $463 = _v36.termRef(0);
          ESLVal $462 = _v36.termRef(1);
          ESLVal $461 = _v36.termRef(2);
          
          {ESLVal e = $463;
          
          {ESLVal c1 = $462;
          
          {ESLVal c2 = $461;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal)").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,c1).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("else").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,c2)))))))));
        }
        }
        }
        }
      case "JReturn": {ESLVal $458 = _v36.termRef(0);
          
          switch($458.termName) {
          case "JCommandExp": {ESLVal $460 = $458.termRef(0);
            ESLVal $459 = $458.termRef(1);
            
            {ESLVal _v73 = $460;
            
            {ESLVal t = $459;
            
            return ppJCommand.apply(indent,dynamics,_v73);
          }
          }
          }
          default: {ESLVal e = $458;
            
            return new ESLVal("return ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";")));
          }
        }
        }
      case "JCaseList": {ESLVal $457 = _v36.termRef(0);
          ESLVal $456 = _v36.termRef(1);
          ESLVal $455 = _v36.termRef(2);
          ESLVal $454 = _v36.termRef(3);
          
          {ESLVal l = $457;
          
          {ESLVal cons = $456;
          
          {ESLVal nil = $455;
          
          {ESLVal alt = $454;
          
          return new ESLVal("if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isCons())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,cons).add(nl.apply(indent).add(new ESLVal("else if(").add(ppJExp.apply(indent,dynamics,l).add(new ESLVal(".isNil())").add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,nil).add(nl.apply(indent).add(new ESLVal("else ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt))))))))))))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $453 = _v36.termRef(0);
          ESLVal $452 = _v36.termRef(1);
          ESLVal $451 = _v36.termRef(2);
          
          {ESLVal e = $453;
          
          {ESLVal arms = $452;
          
          {ESLVal alt = $451;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".termName) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v44 = $qualArg;
                
                switch(_v44.termName) {
                case "JTArm": {ESLVal $484 = _v44.termRef(0);
                  ESLVal $483 = _v44.termRef(1);
                  ESLVal $482 = _v44.termRef(2);
                  
                  {ESLVal n = $484;
                  
                  {ESLVal i = $483;
                  
                  {ESLVal _v72 = $482;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v72))))));
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
          }).map(arms).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,alt).add(nl.apply(indent).add(new ESLVal("}"))))))))));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $450 = _v36.termRef(0);
          ESLVal $449 = _v36.termRef(1);
          ESLVal $448 = _v36.termRef(2);
          
          {ESLVal e = $450;
          
          {ESLVal arms = $449;
          
          {ESLVal alt = $448;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".intVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v43 = $qualArg;
                
                switch(_v43.termName) {
                case "JIArm": {ESLVal $481 = _v43.termRef(0);
                  ESLVal $480 = _v43.termRef(1);
                  
                  {ESLVal n = $481;
                  
                  {ESLVal _v71 = $480;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v71))))));
                }
                }
                }
                default: {ESLVal _0 = _v43;
                  
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
      case "JCaseStr": {ESLVal $447 = _v36.termRef(0);
          ESLVal $446 = _v36.termRef(1);
          ESLVal $445 = _v36.termRef(2);
          
          {ESLVal e = $447;
          
          {ESLVal arms = $446;
          
          {ESLVal alt = $445;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".strVal) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v42 = $qualArg;
                
                switch(_v42.termName) {
                case "JSArm": {ESLVal $479 = _v42.termRef(0);
                  ESLVal $478 = _v42.termRef(1);
                  
                  {ESLVal s = $479;
                  
                  {ESLVal _v70 = $478;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v70))))));
                }
                }
                }
                default: {ESLVal _0 = _v42;
                  
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
      case "JCaseBool": {ESLVal $444 = _v36.termRef(0);
          ESLVal $443 = _v36.termRef(1);
          ESLVal $442 = _v36.termRef(2);
          
          {ESLVal e = $444;
          
          {ESLVal arms = $443;
          
          {ESLVal alt = $442;
          
          return new ESLVal("switch(").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(".boolVal ? 1 : 0) {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v41 = $qualArg;
                
                switch(_v41.termName) {
                case "JBArm": {ESLVal $477 = _v41.termRef(0);
                  ESLVal $476 = _v41.termRef(1);
                  
                  {ESLVal b = $477;
                  
                  {ESLVal _v69 = $476;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case ").add(((Supplier<ESLVal>)() -> { 
                    if(b.boolVal)
                      return $one;
                      else
                        return $zero;
                  }).get().add(new ESLVal(": ").add(ppJCommand.apply(indent.add(new ESLVal(2)),dynamics,_v69))))));
                }
                }
                }
                default: {ESLVal _0 = _v41;
                  
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
      case "JLet": {ESLVal $441 = _v36.termRef(0);
          ESLVal $440 = _v36.termRef(1);
          
          {ESLVal bs = $441;
          
          {ESLVal _v68 = $440;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v40 = $qualArg;
                  
                  switch(_v40.termName) {
                  case "JField": {ESLVal $475 = _v40.termRef(0);
                    ESLVal $474 = _v40.termRef(1);
                    ESLVal $473 = _v40.termRef(2);
                    
                    {ESLVal n = $475;
                    
                    {ESLVal t = $474;
                    
                    {ESLVal e = $473;
                    
                    return ESLVal.list(ESLVal.list(n));
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
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v68);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun453"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v68).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JLetRec": {ESLVal $439 = _v36.termRef(0);
          ESLVal $438 = _v36.termRef(1);
          
          {ESLVal bs = $439;
          
          {ESLVal _v67 = $438;
          
          return new ESLVal("{ LetRec letrec = new LetRec() {").add(nl.apply(indent.add(new ESLVal(2))).add(ppJFields.apply(indent.add(new ESLVal(2)),dynamics,bs).add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl.apply(indent.add(new ESLVal(6))).add(ppJoin.apply(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v38 = $qualArg;
                
                switch(_v38.termName) {
                case "JField": {ESLVal $469 = _v38.termRef(0);
                  ESLVal $468 = _v38.termRef(1);
                  ESLVal $467 = _v38.termRef(2);
                  
                  {ESLVal n = $469;
                  
                  {ESLVal t = $468;
                  
                  {ESLVal e = $467;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(6))))))))));
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
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"cannot find letrec binding\");").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("};").add(nl.apply(indent).add(ppJoin.apply(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v39 = $qualArg;
                
                switch(_v39.termName) {
                case "JField": {ESLVal $472 = _v39.termRef(0);
                  ESLVal $471 = _v39.termRef(1);
                  ESLVal $470 = _v39.termRef(2);
                  
                  {ESLVal n = $472;
                  
                  {ESLVal t = $471;
                  
                  {ESLVal e = $470;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = letrec.get(\"").add(n.add(new ESLVal("\");").add(nl.apply(indent))))))));
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
          }).map(bs).flatten().flatten()).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics,_v67).add(new ESLVal("}").add(nl.apply(indent)))))))))))))))))))))));
        }
        }
        }
      case "JPLet": {ESLVal $437 = _v36.termRef(0);
          ESLVal $436 = _v36.termRef(1);
          
          {ESLVal bs = $437;
          
          {ESLVal _v66 = $436;
          
          {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v37 = $qualArg;
                  
                  switch(_v37.termName) {
                  case "JField": {ESLVal $466 = _v37.termRef(0);
                    ESLVal $465 = _v37.termRef(1);
                    ESLVal $464 = _v37.termRef(2);
                    
                    {ESLVal n = $466;
                    
                    {ESLVal t = $465;
                    
                    {ESLVal e = $464;
                    
                    return ESLVal.list(ESLVal.list(n));
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
            }).map(bs).flatten().flatten();
          ESLVal dynamicVars = dynamicVarsJCommand.apply(_v66);
          
          {ESLVal boundDynamicVars = filter.apply(new ESLVal(new Function(new ESLVal("fun454"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal s = $args[0];
            return member.apply(s,dynamicVars);
              }
            }),boundVars);
          
          return new ESLVal("{").add(ppJParFields.apply(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl.apply(indent.add(new ESLVal(2))).add(ppJCommand.apply(indent,dynamics.add(boundDynamicVars),_v66).add(nl.apply(indent).add(new ESLVal("}"))))));
        }
        }
        }
        }
        }
      case "JBlock": {ESLVal $435 = _v36.termRef(0);
          
          {ESLVal cs = $435;
          
          return new ESLVal("{").add(ppJoin.apply(indent,new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal c = $l0.head();
                $l0 = $l0.tail();
                $v.add(ppJCommand.apply(indent,dynamics,c));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(cs)).add(new ESLVal("}")));
        }
        }
      case "JUpdate": {ESLVal $434 = _v36.termRef(0);
          ESLVal $433 = _v36.termRef(1);
          
          {ESLVal n = $434;
          
          {ESLVal e = $433;
          
          if(member.apply(n,dynamics).boolVal)
          return n.add(new ESLVal("[0] = ").add(ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"))));
          else
            {ESLVal _v64 = $434;
              
              {ESLVal _v65 = $433;
              
              return _v64.add(new ESLVal(" = ").add(ppJExp.apply(indent,dynamics,_v65).add(new ESLVal(";"))));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $432 = _v36.termRef(0);
          ESLVal $431 = _v36.termRef(1);
          ESLVal $430 = _v36.termRef(2);
          ESLVal $429 = _v36.termRef(3);
          
          {ESLVal listName = $432;
          
          {ESLVal varName = $431;
          
          {ESLVal e = $430;
          
          {ESLVal _v63 = $429;
          
          return new ESLVal("{").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl.apply(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl.apply(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl.apply(indent.add(new ESLVal(4))).add(ppJCommand.apply(indent.add(new ESLVal(4)),dynamics,_v63).add(nl.apply(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl.apply(indent).add(new ESLVal("}")))))))))))))))))))))))))));
        }
        }
        }
        }
        }
      case "JStatement": {ESLVal $428 = _v36.termRef(0);
          
          {ESLVal e = $428;
          
          return ppJExp.apply(indent,dynamics,e).add(new ESLVal(";"));
        }
        }
        default: {ESLVal _v74 = _v36;
          
          return new ESLVal("******* unknown command: ").add(_v74);
        }
      }
      }
    }
  });
  private static ESLVal ppJParFields = new ESLVal(new Function(new ESLVal("ppJParFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal bs = $args[2];
  { LetRec letrec = new LetRec() {
        ESLVal vals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v45 = $qualArg;
                
                switch(_v45.termName) {
                case "JField": {ESLVal $487 = _v45.termRef(0);
                  ESLVal $486 = _v45.termRef(1);
                  ESLVal $485 = _v45.termRef(2);
                  
                  {ESLVal n = $487;
                  
                  {ESLVal t = $486;
                  
                  {ESLVal e = $485;
                  
                  return ESLVal.list(ESLVal.list(e));
                }
                }
                }
                }
                default: {ESLVal _0 = _v45;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten();
        ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v46 = $qualArg;
                
                switch(_v46.termName) {
                case "JField": {ESLVal $490 = _v46.termRef(0);
                  ESLVal $489 = _v46.termRef(1);
                  ESLVal $488 = _v46.termRef(2);
                  
                  {ESLVal n = $490;
                  
                  {ESLVal t = $489;
                  
                  {ESLVal e = $488;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v46;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bs).flatten().flatten();
        ESLVal doVals = new ESLVal(new Function(new ESLVal("doVals"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal vals = $args[0];
          {ESLVal _v47 = vals;
                
                if(_v47.isCons())
                {ESLVal $491 = _v47.head();
                  ESLVal $492 = _v47.tail();
                  
                  if($492.isCons())
                  {ESLVal $493 = $492.head();
                    ESLVal $494 = $492.tail();
                    
                    {ESLVal v = $491;
                    
                    {ESLVal vs = $492;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v).add(new ESLVal(",").add(doVals.apply(vs))));
                  }
                  }
                  }
                else if($492.isNil())
                  {ESLVal v = $491;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v));
                  }
                else {ESLVal v = $491;
                    
                    {ESLVal vs = $492;
                    
                    return new ESLVal("() -> ").add(ppJExp.apply(indent,dynamics,v).add(new ESLVal(",").add(doVals.apply(vs))));
                  }
                  }
                }
              else if(_v47.isNil())
                return new ESLVal("");
              else return error(new ESLVal("case error at Pos(29387,29550)").add(ESLVal.list(_v47)));
              }
            }
          });
        ESLVal bindNames = new ESLVal(new Function(new ESLVal("bindNames"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ns = $args[0];
          ESLVal i = $args[1];
          {ESLVal _v48 = ns;
                
                if(_v48.isCons())
                {ESLVal $495 = _v48.head();
                  ESLVal $496 = _v48.tail();
                  
                  {ESLVal n = $495;
                  
                  {ESLVal _v60 = $496;
                  
                  if(member.apply(n,dynamics).boolVal)
                  return new ESLVal("ESLVal[] ").add(n.add(new ESLVal("= new ESLVal[]{$p[").add(i.add(new ESLVal("]};").add(nl.apply(indent).add(bindNames.apply(_v60,i.add($one))))))));
                  else
                    {ESLVal _v61 = $495;
                      
                      {ESLVal _v62 = $496;
                      
                      return new ESLVal("ESLVal ").add(_v61.add(new ESLVal("= $p[").add(i.add(new ESLVal("];").add(nl.apply(indent).add(bindNames.apply(_v62,i.add($one))))))));
                    }
                    }
                }
                }
                }
              else if(_v48.isNil())
                return new ESLVal("");
              else return error(new ESLVal("case error at Pos(29596,29846)").add(ESLVal.list(_v48)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "vals": return vals;
            
            case "names": return names;
            
            case "doVals": return doVals;
            
            case "bindNames": return bindNames;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal vals = letrec.get("vals");
      
      ESLVal names = letrec.get("names");
      
      ESLVal doVals = letrec.get("doVals");
      
      ESLVal bindNames = letrec.get("bindNames");
      
        return new ESLVal("ESLVal[] $p = plet(new Supplier[]{").add(doVals.apply(vals).add(new ESLVal("});").add(nl.apply(indent).add(bindNames.apply(names,$zero)))));}
      
    }
  });
  private static ESLVal ppJFields = new ESLVal(new Function(new ESLVal("ppJFields"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal bs = $args[2];
  {ESLVal _v49 = bs;
        
        if(_v49.isCons())
        {ESLVal $497 = _v49.head();
          ESLVal $498 = _v49.tail();
          
          {ESLVal f = $497;
          
          {ESLVal _v59 = $498;
          
          return ppFieldDef.apply(indent,dynamics,f).add(nl.apply(indent).add(ppJFields.apply(indent,dynamics,_v59)));
        }
        }
        }
      else if(_v49.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(30015,30165)").add(ESLVal.list(_v49)));
      }
    }
  });
  private static ESLVal ppFieldDef = new ESLVal(new Function(new ESLVal("ppFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal f = $args[2];
  {ESLVal _v50 = f;
        
        switch(_v50.termName) {
        case "JField": {ESLVal $501 = _v50.termRef(0);
          ESLVal $500 = _v50.termRef(1);
          ESLVal $499 = _v50.termRef(2);
          
          {ESLVal n = $501;
          
          {ESLVal t = $500;
          
          {ESLVal e = $499;
          
          if(member.apply(n,dynamics).boolVal)
          return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal("};")))));
          else
            {ESLVal _v56 = $501;
              
              {ESLVal _v57 = $500;
              
              {ESLVal _v58 = $499;
              
              return new ESLVal("ESLVal ").add(_v56.add(new ESLVal(" = ").add(ppJExp.apply(indent.add(new ESLVal(2)),dynamics,_v58).add(new ESLVal(";")))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(30229,30483)").add(ESLVal.list(_v50)));
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
  {ESLVal _v51 = es;
        
        if(_v51.isCons())
        {ESLVal $502 = _v51.head();
          ESLVal $503 = _v51.tail();
          
          {ESLVal _v54 = _v51;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v54,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      else if(_v51.isNil())
        return new ESLVal("new Term(\"").add(n.add(new ESLVal("\")")));
      else {ESLVal _v55 = _v51;
          
          return new ESLVal("new Term(\"").add(n.add(new ESLVal("\",").add(ppJExps.apply(indent,dynamics,_v55,new ESLVal(",")).add(new ESLVal(")")))));
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
  private static ESLVal ppJSetExp = new ESLVal(new Function(new ESLVal("ppJSetExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.set(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
    }
  });
  private static ESLVal ppJBagExp = new ESLVal(new Function(new ESLVal("ppJBagExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal indent = $args[0];
  ESLVal dynamics = $args[1];
  ESLVal t = $args[2];
  ESLVal es = $args[3];
  return new ESLVal("ESLVal.bag(").add(ppJExps.apply(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v53 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v53)));
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
                  {ESLVal _v52 = $x;
              
              {ESLVal message = _v52;
              
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