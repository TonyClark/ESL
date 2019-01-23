package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.DynamicVars.*;
import static esl.compiler.Strings.*;
public class PpExp {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v60 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v60)));
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
                  return print.apply(ppExp($zero,parse.apply(new ESLVal("esl/compiler/test1.esl"))));
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v59 = $x;
              
              {ESLVal message = _v59;
              
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
private static ESLVal indentStr(ESLVal indent) {
    
    if(indent.eql($zero).boolVal)
      return new ESLVal("");
      else
        return new ESLVal(" ").add(indentStr(indent.sub($one)));
  }
  private static ESLVal indentStr = new ESLVal(new Function(new ESLVal("indentStr"),null) { public ESLVal apply(ESLVal... args) { return indentStr(args[0]); }});
  private static ESLVal nl(ESLVal indent) {
    
    return new ESLVal("\n").add(indentStr(indent));
  }
  private static ESLVal nl = new ESLVal(new Function(new ESLVal("nl"),null) { public ESLVal apply(ESLVal... args) { return nl(args[0]); }});
  private static ESLVal ppJoin(ESLVal indent,ESLVal ss) {
    
    {ESLVal _v7 = ss;
      
      if(_v7.isCons())
      {ESLVal $8 = _v7.head();
        ESLVal $9 = _v7.tail();
        
        if($9.isCons())
        {ESLVal $10 = $9.head();
          ESLVal $11 = $9.tail();
          
          if($11.isCons())
          {ESLVal $12 = $11.head();
            ESLVal $13 = $11.tail();
            
            {ESLVal s = $8;
            
            {ESLVal _v133 = $9;
            
            return s.add(nl(indent).add(ppJoin(indent,_v133)));
          }
          }
          }
        else if($11.isNil())
          {ESLVal s1 = $8;
            
            {ESLVal s2 = $10;
            
            return s1.add(nl(indent).add(s2));
          }
          }
        else {ESLVal s = $8;
            
            {ESLVal _v134 = $9;
            
            return s.add(nl(indent).add(ppJoin(indent,_v134)));
          }
          }
        }
      else if($9.isNil())
        {ESLVal s = $8;
          
          return s;
        }
      else {ESLVal s = $8;
          
          {ESLVal _v135 = $9;
          
          return s.add(nl(indent).add(ppJoin(indent,_v135)));
        }
        }
      }
    else if(_v7.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(1593,1751)").add(ESLVal.list(_v7)));
    }
  }
  private static ESLVal ppJoin = new ESLVal(new Function(new ESLVal("ppJoin"),null) { public ESLVal apply(ESLVal... args) { return ppJoin(args[0],args[1]); }});
  public static ESLVal ppTypeEnv(ESLVal env) {
    
    {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
      
      {{
      ESLVal _v10 = env;
      while(_v10.isCons()) {
        ESLVal _v9 = _v10.headVal;
        {ESLVal _v8 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal _v11 = _v9;
                  
                  switch(_v11.termName) {
                  case "Map": {ESLVal $15 = _v11.termRef(0);
                    ESLVal $14 = _v11.termRef(1);
                    
                    {ESLVal n = $15;
                    
                    {ESLVal t = $14;
                    
                    {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType(t).add(new ESLVal(",")))));
                  return $null;}
                  }
                  }
                  }
                  default: {ESLVal $$$ = _v11;
                    
                    return $null;
                  }
                }
                }
              }
            });
          
          _v8.apply();
        }
        _v10 = _v10.tailVal;}
    }
    return s[0].add(new ESLVal("]"));}
    }
  }
  public static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return ppTypeEnv(args[0]); }});
  public static ESLVal ppTypes(ESLVal ts) {
    
    return map(ppType,ts);
  }
  public static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),null) { public ESLVal apply(ESLVal... args) { return ppTypes(args[0]); }});
  public static ESLVal ppType(ESLVal t) {
    
    {ESLVal _v12 = t;
      
      switch(_v12.termName) {
      case "ActType": {ESLVal $74 = _v12.termRef(0);
        ESLVal $73 = _v12.termRef(1);
        ESLVal $72 = _v12.termRef(2);
        
        {ESLVal l = $74;
        
        {ESLVal decs = $73;
        
        {ESLVal handlers = $72;
        
        return new ESLVal("").add(t);
      }
      }
      }
      }
    case "ApplyType": {ESLVal $71 = _v12.termRef(0);
        ESLVal $70 = _v12.termRef(1);
        ESLVal $69 = _v12.termRef(2);
        
        {ESLVal l = $71;
        
        {ESLVal n = $70;
        
        {ESLVal args = $69;
        
        return n.add(map(ppType,args));
      }
      }
      }
      }
    case "ApplyTypeFun": {ESLVal $68 = _v12.termRef(0);
        ESLVal $67 = _v12.termRef(1);
        ESLVal $66 = _v12.termRef(2);
        
        {ESLVal l = $68;
        
        {ESLVal op = $67;
        
        {ESLVal args = $66;
        
        return ppType(op).add(map(ppType,args));
      }
      }
      }
      }
    case "ArrayType": {ESLVal $65 = _v12.termRef(0);
        ESLVal $64 = _v12.termRef(1);
        
        {ESLVal l = $65;
        
        {ESLVal _v132 = $64;
        
        return new ESLVal("Array[").add(ppType(_v132).add(new ESLVal("]")));
      }
      }
      }
    case "BoolType": {ESLVal $63 = _v12.termRef(0);
        
        {ESLVal l = $63;
        
        return new ESLVal("Bool");
      }
      }
    case "FloatType": {ESLVal $62 = _v12.termRef(0);
        
        {ESLVal l = $62;
        
        return new ESLVal("Float");
      }
      }
    case "FieldType": {ESLVal $61 = _v12.termRef(0);
        ESLVal $60 = _v12.termRef(1);
        ESLVal $59 = _v12.termRef(2);
        
        {ESLVal l = $61;
        
        {ESLVal n = $60;
        
        {ESLVal _v131 = $59;
        
        return n.add(new ESLVal("::").add(ppType(_v131)));
      }
      }
      }
      }
    case "ForallType": {ESLVal $58 = _v12.termRef(0);
        ESLVal $57 = _v12.termRef(1);
        ESLVal $56 = _v12.termRef(2);
        
        {ESLVal l = $58;
        
        {ESLVal ns = $57;
        
        {ESLVal _v130 = $56;
        
        return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType(_v130))));
      }
      }
      }
      }
    case "FunType": {ESLVal $55 = _v12.termRef(0);
        ESLVal $54 = _v12.termRef(1);
        ESLVal $53 = _v12.termRef(2);
        
        {ESLVal l = $55;
        
        {ESLVal d = $54;
        
        {ESLVal r = $53;
        
        return map(ppType,d).add(new ESLVal("->").add(ppType(r)));
      }
      }
      }
      }
    case "TaggedFunType": {ESLVal $52 = _v12.termRef(0);
        ESLVal $51 = _v12.termRef(1);
        ESLVal $50 = _v12.termRef(2);
        ESLVal $49 = _v12.termRef(3);
        
        {ESLVal l = $52;
        
        {ESLVal d = $51;
        
        {ESLVal p = $50;
        
        {ESLVal r = $49;
        
        return map(ppType,d).add(new ESLVal("->").add(ppType(r)));
      }
      }
      }
      }
      }
    case "IntType": {ESLVal $48 = _v12.termRef(0);
        
        {ESLVal l = $48;
        
        return new ESLVal("Int");
      }
      }
    case "ListType": {ESLVal $47 = _v12.termRef(0);
        ESLVal $46 = _v12.termRef(1);
        
        {ESLVal l = $47;
        
        {ESLVal _v129 = $46;
        
        return new ESLVal("[").add(ppType(_v129).add(new ESLVal("]")));
      }
      }
      }
    case "NullType": {ESLVal $45 = _v12.termRef(0);
        
        {ESLVal l = $45;
        
        return new ESLVal("Null");
      }
      }
    case "ObserverType": {ESLVal $44 = _v12.termRef(0);
        ESLVal $43 = _v12.termRef(1);
        ESLVal $42 = _v12.termRef(2);
        
        {ESLVal l = $44;
        
        {ESLVal s = $43;
        
        {ESLVal m = $42;
        
        return new ESLVal("Observer[").add(ppType(s).add(new ESLVal(",").add(ppType(m).add(new ESLVal("]")))));
      }
      }
      }
      }
    case "RecType": {ESLVal $41 = _v12.termRef(0);
        ESLVal $40 = _v12.termRef(1);
        ESLVal $39 = _v12.termRef(2);
        
        {ESLVal l = $41;
        
        {ESLVal n = $40;
        
        {ESLVal _v128 = $39;
        
        return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType(_v128))));
      }
      }
      }
      }
    case "RecordType": {ESLVal $38 = _v12.termRef(0);
        ESLVal $37 = _v12.termRef(1);
        
        {ESLVal l = $38;
        
        {ESLVal fs = $37;
        
        return new ESLVal("{").add(fs.add(new ESLVal("}")));
      }
      }
      }
    case "StrType": {ESLVal $36 = _v12.termRef(0);
        
        {ESLVal l = $36;
        
        return new ESLVal("Str");
      }
      }
    case "TableType": {ESLVal $35 = _v12.termRef(0);
        ESLVal $34 = _v12.termRef(1);
        ESLVal $33 = _v12.termRef(2);
        
        {ESLVal l = $35;
        
        {ESLVal k = $34;
        
        {ESLVal v = $33;
        
        return new ESLVal("Hash[").add(ppType(k).add(new ESLVal(",").add(ppType(v).add(new ESLVal("]")))));
      }
      }
      }
      }
    case "TermType": {ESLVal $32 = _v12.termRef(0);
        ESLVal $31 = _v12.termRef(1);
        ESLVal $30 = _v12.termRef(2);
        
        {ESLVal l = $32;
        
        {ESLVal n = $31;
        
        {ESLVal ts = $30;
        
        return n.add(map(ppType,ts));
      }
      }
      }
      }
    case "TypeFun": {ESLVal $29 = _v12.termRef(0);
        ESLVal $28 = _v12.termRef(1);
        ESLVal $27 = _v12.termRef(2);
        
        {ESLVal l = $29;
        
        {ESLVal ns = $28;
        
        {ESLVal _v127 = $27;
        
        return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType(_v127))));
      }
      }
      }
      }
    case "UnfoldType": {ESLVal $26 = _v12.termRef(0);
        ESLVal $25 = _v12.termRef(1);
        
        {ESLVal l = $26;
        
        {ESLVal _v126 = $25;
        
        return new ESLVal("unfold ").add(ppType(_v126));
      }
      }
      }
    case "UnionType": {ESLVal $24 = _v12.termRef(0);
        ESLVal $23 = _v12.termRef(1);
        
        {ESLVal l = $24;
        
        {ESLVal ts = $23;
        
        return new ESLVal("union ").add(map(ppType,ts));
      }
      }
      }
    case "VarType": {ESLVal $22 = _v12.termRef(0);
        ESLVal $21 = _v12.termRef(1);
        
        {ESLVal l = $22;
        
        {ESLVal n = $21;
        
        return n;
      }
      }
      }
    case "VoidType": {ESLVal $20 = _v12.termRef(0);
        
        {ESLVal l = $20;
        
        return new ESLVal("Void");
      }
      }
    case "UnionRef": {ESLVal $19 = _v12.termRef(0);
        ESLVal $18 = _v12.termRef(1);
        ESLVal $17 = _v12.termRef(2);
        
        {ESLVal l = $19;
        
        {ESLVal _v125 = $18;
        
        {ESLVal n = $17;
        
        return ppType(_v125).add(new ESLVal(".").add(n));
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $16 = _v12.termRef(0);
        
        {ESLVal f = $16;
        
        return f.add(new ESLVal(""));
      }
      }
      default: {ESLVal x = _v12;
        
        return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
      }
    }
    }
  }
  public static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),null) { public ESLVal apply(ESLVal... args) { return ppType(args[0]); }});
  public static ESLVal ppExps(ESLVal indent,ESLVal exps,ESLVal sep) {
    
    {ESLVal _v13 = exps;
      
      if(_v13.isCons())
      {ESLVal $75 = _v13.head();
        ESLVal $76 = _v13.tail();
        
        if($76.isCons())
        {ESLVal $77 = $76.head();
          ESLVal $78 = $76.tail();
          
          {ESLVal e1 = $75;
          
          {ESLVal e2 = $77;
          
          {ESLVal es = $78;
          
          return ppExp(indent,e1).add(sep.add(ppExps(indent,es.cons(e2),sep)));
        }
        }
        }
        }
      else if($76.isNil())
        {ESLVal e = $75;
          
          return ppExp(indent,e);
        }
      else return error(new ESLVal("case error at Pos(3657,3815)").add(ESLVal.list(_v13)));
      }
    else if(_v13.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(3657,3815)").add(ESLVal.list(_v13)));
    }
  }
  public static ESLVal ppExps = new ESLVal(new Function(new ESLVal("ppExps"),null) { public ESLVal apply(ESLVal... args) { return ppExps(args[0],args[1],args[2]); }});
  private static ESLVal ppPattern(ESLVal p) {
    
    {ESLVal _v14 = p;
      
      switch(_v14.termName) {
      case "PVar": {ESLVal $100 = _v14.termRef(0);
        ESLVal $99 = _v14.termRef(1);
        ESLVal $98 = _v14.termRef(2);
        
        {ESLVal l = $100;
        
        {ESLVal n = $99;
        
        {ESLVal t = $98;
        
        return n;
      }
      }
      }
      }
    case "PTerm": {ESLVal $95 = _v14.termRef(0);
        ESLVal $94 = _v14.termRef(1);
        ESLVal $93 = _v14.termRef(2);
        ESLVal $92 = _v14.termRef(3);
        
        if($93.isCons())
        {ESLVal $96 = $93.head();
          ESLVal $97 = $93.tail();
          
          {ESLVal l = $95;
          
          {ESLVal n = $94;
          
          {ESLVal ts = $93;
          
          {ESLVal ps = $92;
          
          return n.add(ppPatterns(ps));
        }
        }
        }
        }
        }
      else if($93.isNil())
        {ESLVal l = $95;
          
          {ESLVal n = $94;
          
          {ESLVal ps = $92;
          
          return n.add(ppPatterns(ps));
        }
        }
        }
      else {ESLVal l = $95;
          
          {ESLVal n = $94;
          
          {ESLVal ts = $93;
          
          {ESLVal ps = $92;
          
          return n.add(ppPatterns(ps));
        }
        }
        }
        }
      }
    case "PApplyType": {ESLVal $91 = _v14.termRef(0);
        ESLVal $90 = _v14.termRef(1);
        ESLVal $89 = _v14.termRef(2);
        
        {ESLVal l = $91;
        
        {ESLVal _v123 = $90;
        
        {ESLVal ts = $89;
        
        return ppPattern(_v123);
      }
      }
      }
      }
    case "PNil": {ESLVal $88 = _v14.termRef(0);
        
        {ESLVal l = $88;
        
        return new ESLVal("[]");
      }
      }
    case "PInt": {ESLVal $87 = _v14.termRef(0);
        ESLVal $86 = _v14.termRef(1);
        
        {ESLVal l = $87;
        
        {ESLVal n = $86;
        
        return new ESLVal("").add(n);
      }
      }
      }
    case "PBool": {ESLVal $85 = _v14.termRef(0);
        ESLVal $84 = _v14.termRef(1);
        
        {ESLVal l = $85;
        
        {ESLVal b = $84;
        
        return new ESLVal("").add(b);
      }
      }
      }
    case "PStr": {ESLVal $83 = _v14.termRef(0);
        ESLVal $82 = _v14.termRef(1);
        
        {ESLVal l = $83;
        
        {ESLVal s = $82;
        
        return new ESLVal("\'").add(s.add(new ESLVal("\'")));
      }
      }
      }
    case "PCons": {ESLVal $81 = _v14.termRef(0);
        ESLVal $80 = _v14.termRef(1);
        ESLVal $79 = _v14.termRef(2);
        
        {ESLVal l = $81;
        
        {ESLVal h = $80;
        
        {ESLVal t = $79;
        
        return ppPattern(h).add(new ESLVal(":").add(ppPattern(t)));
      }
      }
      }
      }
      default: {ESLVal _v124 = _v14;
        
        return new ESLVal("<unknown: ").add(_v124.add(new ESLVal(">")));
      }
    }
    }
  }
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),null) { public ESLVal apply(ESLVal... args) { return ppPattern(args[0]); }});
  private static ESLVal ppPatterns(ESLVal ps) {
    
    return map(ppPattern,ps);
  }
  private static ESLVal ppPatterns = new ESLVal(new Function(new ESLVal("ppPatterns"),null) { public ESLVal apply(ESLVal... args) { return ppPatterns(args[0]); }});
  public static ESLVal ppExp(ESLVal indent,ESLVal exp) {
    
    {ESLVal _v15 = exp;
      
      switch(_v15.termName) {
      case "Module": {ESLVal $251 = _v15.termRef(0);
        ESLVal $250 = _v15.termRef(1);
        ESLVal $249 = _v15.termRef(2);
        ESLVal $248 = _v15.termRef(3);
        ESLVal $247 = _v15.termRef(4);
        ESLVal $246 = _v15.termRef(5);
        ESLVal $245 = _v15.termRef(6);
        
        {ESLVal path = $251;
        
        {ESLVal name = $250;
        
        {ESLVal exports = $249;
        
        {ESLVal imports = $248;
        
        {ESLVal x = $247;
        
        {ESLVal y = $246;
        
        {ESLVal defs = $245;
        
        return new ESLVal("module ").add(name.add(new ESLVal("{").add(nl(indent.add(new ESLVal(2))).add(ppBinds(indent.add(new ESLVal(2)),defs).add(nl(indent).add(new ESLVal("}")))))));
      }
      }
      }
      }
      }
      }
      }
      }
    case "Var": {ESLVal $244 = _v15.termRef(0);
        ESLVal $243 = _v15.termRef(1);
        
        {ESLVal l = $244;
        
        {ESLVal n = $243;
        
        return n;
      }
      }
      }
    case "StrExp": {ESLVal $242 = _v15.termRef(0);
        ESLVal $241 = _v15.termRef(1);
        
        {ESLVal l = $242;
        
        {ESLVal v = $241;
        
        return new ESLVal("\'").add(v.add(new ESLVal("\'")));
      }
      }
      }
    case "IntExp": {ESLVal $240 = _v15.termRef(0);
        ESLVal $239 = _v15.termRef(1);
        
        {ESLVal l = $240;
        
        {ESLVal v = $239;
        
        return v.add(new ESLVal(""));
      }
      }
      }
    case "BoolExp": {ESLVal $238 = _v15.termRef(0);
        ESLVal $237 = _v15.termRef(1);
        
        {ESLVal l = $238;
        
        {ESLVal v = $237;
        
        return v.add(new ESLVal(""));
      }
      }
      }
    case "NullExp": {ESLVal $236 = _v15.termRef(0);
        
        {ESLVal l = $236;
        
        return new ESLVal("null");
      }
      }
    case "FloatExp": {ESLVal $235 = _v15.termRef(0);
        ESLVal $234 = _v15.termRef(1);
        
        {ESLVal l = $235;
        
        {ESLVal f = $234;
        
        return f.add(new ESLVal(""));
      }
      }
      }
    case "Apply": {ESLVal $233 = _v15.termRef(0);
        ESLVal $232 = _v15.termRef(1);
        ESLVal $231 = _v15.termRef(2);
        
        {ESLVal l = $233;
        
        {ESLVal op = $232;
        
        {ESLVal args = $231;
        
        return ppExp(indent,op).add(new ESLVal("(").add(ppExps(indent,args,new ESLVal(",")).add(new ESLVal(")"))));
      }
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $230 = _v15.termRef(0);
        ESLVal $229 = _v15.termRef(1);
        ESLVal $228 = _v15.termRef(2);
        
        {ESLVal l = $230;
        
        {ESLVal op = $229;
        
        {ESLVal args = $228;
        
        return ppExp(indent,op);
      }
      }
      }
      }
    case "Block": {ESLVal $227 = _v15.termRef(0);
        ESLVal $226 = _v15.termRef(1);
        
        {ESLVal l = $227;
        
        {ESLVal es = $226;
        
        return new ESLVal("{").add(nl(indent.add(new ESLVal(2))).add(ppExps(indent.add(new ESLVal(2)),es,new ESLVal(";")).add(nl(indent).add(new ESLVal("}")))));
      }
      }
      }
    case "Case": {ESLVal $225 = _v15.termRef(0);
        ESLVal $224 = _v15.termRef(1);
        ESLVal $223 = _v15.termRef(2);
        ESLVal $222 = _v15.termRef(3);
        
        {ESLVal l = $225;
        
        {ESLVal ds = $224;
        
        {ESLVal es = $223;
        
        {ESLVal as = $222;
        
        return new ESLVal("case ").add(ppExps(indent,es,new ESLVal(",")).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun312"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppArm(indent,a);
          }
        }),as)).add(nl(indent).add(new ESLVal("}")))))));
      }
      }
      }
      }
      }
    case "CaseTerm": {ESLVal $221 = _v15.termRef(0);
        ESLVal $220 = _v15.termRef(1);
        ESLVal $219 = _v15.termRef(2);
        ESLVal $218 = _v15.termRef(3);
        
        {ESLVal l = $221;
        
        {ESLVal e = $220;
        
        {ESLVal arms = $219;
        
        {ESLVal alt = $218;
        
        return new ESLVal("caseTerm ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun313"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppCaseTermArm(indent.add(new ESLVal(2)),a);
          }
        }),arms)).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp(indent.add(new ESLVal(4)),alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
      }
    case "CaseList": {ESLVal $217 = _v15.termRef(0);
        ESLVal $216 = _v15.termRef(1);
        ESLVal $215 = _v15.termRef(2);
        ESLVal $214 = _v15.termRef(3);
        ESLVal $213 = _v15.termRef(4);
        
        {ESLVal l = $217;
        
        {ESLVal e = $216;
        
        {ESLVal cons = $215;
        
        {ESLVal nil = $214;
        
        {ESLVal alt = $213;
        
        return new ESLVal("caseList ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("CONS ->").add(nl(indent.add(new ESLVal(4))).add(ppExp(indent.add(new ESLVal(4)),cons).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("NIL ->").add(nl(indent.add(new ESLVal(4))).add(ppExp(indent.add(new ESLVal(4)),nil).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp(indent.add(new ESLVal(4)),alt).add(nl(indent).add(new ESLVal("}"))))))))))))))));
      }
      }
      }
      }
      }
      }
    case "CaseInt": {ESLVal $212 = _v15.termRef(0);
        ESLVal $211 = _v15.termRef(1);
        ESLVal $210 = _v15.termRef(2);
        ESLVal $209 = _v15.termRef(3);
        
        {ESLVal l = $212;
        
        {ESLVal e = $211;
        
        {ESLVal arms = $210;
        
        {ESLVal alt = $209;
        
        return new ESLVal("caseInt ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun314"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppCaseIntsArm(indent.add(new ESLVal(2)),a);
          }
        }),arms)).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp(indent.add(new ESLVal(4)),alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
      }
    case "CaseStr": {ESLVal $208 = _v15.termRef(0);
        ESLVal $207 = _v15.termRef(1);
        ESLVal $206 = _v15.termRef(2);
        ESLVal $205 = _v15.termRef(3);
        
        {ESLVal l = $208;
        
        {ESLVal e = $207;
        
        {ESLVal arms = $206;
        
        {ESLVal alt = $205;
        
        return new ESLVal("caseStr ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun315"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppCaseStrsArm(indent.add(new ESLVal(2)),a);
          }
        }),arms)).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp(indent.add(new ESLVal(4)),alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
      }
    case "CaseBool": {ESLVal $204 = _v15.termRef(0);
        ESLVal $203 = _v15.termRef(1);
        ESLVal $202 = _v15.termRef(2);
        ESLVal $201 = _v15.termRef(3);
        
        {ESLVal l = $204;
        
        {ESLVal e = $203;
        
        {ESLVal arms = $202;
        
        {ESLVal alt = $201;
        
        return new ESLVal("caseBool ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun316"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppCaseBoolsArm(indent.add(new ESLVal(2)),a);
          }
        }),arms)).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else ").add(ppExp(indent.add(new ESLVal(4)),alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
      }
    case "CaseError": {ESLVal $200 = _v15.termRef(0);
        ESLVal $199 = _v15.termRef(1);
        
        {ESLVal l = $200;
        
        {ESLVal e = $199;
        
        return new ESLVal("caseError()");
      }
      }
      }
    case "Head": {ESLVal $198 = _v15.termRef(0);
        
        {ESLVal e = $198;
        
        return new ESLVal("head(").add(ppExp(indent,e).add(new ESLVal(")")));
      }
      }
    case "Tail": {ESLVal $197 = _v15.termRef(0);
        
        {ESLVal e = $197;
        
        return new ESLVal("tail(").add(ppExp(indent,e).add(new ESLVal(")")));
      }
      }
    case "Cons": {ESLVal $196 = _v15.termRef(0);
        ESLVal $195 = _v15.termRef(1);
        
        {ESLVal h = $196;
        
        {ESLVal t = $195;
        
        return new ESLVal("cons(").add(ppExp(indent,h).add(new ESLVal(",").add(ppExp(indent,t).add(new ESLVal(")")))));
      }
      }
      }
    case "If": {ESLVal $194 = _v15.termRef(0);
        ESLVal $193 = _v15.termRef(1);
        ESLVal $192 = _v15.termRef(2);
        ESLVal $191 = _v15.termRef(3);
        
        {ESLVal l = $194;
        
        {ESLVal e1 = $193;
        
        {ESLVal e2 = $192;
        
        {ESLVal e3 = $191;
        
        return new ESLVal("if ").add(ppExp(indent,e1).add(nl(indent).add(new ESLVal("then").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e2).add(nl(indent).add(new ESLVal("else").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e3))))))))));
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $190 = _v15.termRef(0);
        ESLVal $189 = _v15.termRef(1);
        ESLVal $188 = _v15.termRef(2);
        ESLVal $187 = _v15.termRef(3);
        ESLVal $186 = _v15.termRef(4);
        
        {ESLVal l = $190;
        
        {ESLVal n = $189;
        
        {ESLVal args = $188;
        
        {ESLVal t = $187;
        
        {ESLVal e = $186;
        
        return new ESLVal("fun(").add(ppDecs(indent,args).add(new ESLVal(")::").add(ppType(t).add(new ESLVal(" ").add(ppExp(indent.add(new ESLVal(2)),e))))));
      }
      }
      }
      }
      }
      }
    case "Let": {ESLVal $185 = _v15.termRef(0);
        ESLVal $184 = _v15.termRef(1);
        ESLVal $183 = _v15.termRef(2);
        
        {ESLVal l = $185;
        
        {ESLVal bs = $184;
        
        {ESLVal e = $183;
        
        return new ESLVal("let ").add(ppBinds(indent.add(new ESLVal(4)),bs).add(nl(indent).add(new ESLVal("in ").add(ppExp(indent.add(new ESLVal(3)),e)))));
      }
      }
      }
      }
    case "Letrec": {ESLVal $182 = _v15.termRef(0);
        ESLVal $181 = _v15.termRef(1);
        ESLVal $180 = _v15.termRef(2);
        
        {ESLVal l = $182;
        
        {ESLVal bs = $181;
        
        {ESLVal e = $180;
        
        return new ESLVal("letrec ").add(ppBinds(indent.add(new ESLVal(7)),bs).add(nl(indent).add(new ESLVal("in ").add(ppExp(indent.add(new ESLVal(3)),e)))));
      }
      }
      }
      }
    case "List": {ESLVal $179 = _v15.termRef(0);
        ESLVal $178 = _v15.termRef(1);
        
        {ESLVal l = $179;
        
        {ESLVal es = $178;
        
        return new ESLVal("[").add(ppExps(indent,es,new ESLVal(",")).add(new ESLVal("]")));
      }
      }
      }
    case "Throw": {ESLVal $177 = _v15.termRef(0);
        ESLVal $176 = _v15.termRef(1);
        ESLVal $175 = _v15.termRef(2);
        
        {ESLVal l = $177;
        
        {ESLVal t = $176;
        
        {ESLVal e = $175;
        
        return new ESLVal("throw ").add(ppExp(indent,e));
      }
      }
      }
      }
    case "Term": {ESLVal $174 = _v15.termRef(0);
        ESLVal $173 = _v15.termRef(1);
        ESLVal $172 = _v15.termRef(2);
        ESLVal $171 = _v15.termRef(3);
        
        {ESLVal l = $174;
        
        {ESLVal n = $173;
        
        {ESLVal ts = $172;
        
        {ESLVal es = $171;
        
        return n.add(new ESLVal("(").add(ppExps(indent,es,new ESLVal(",")).add(new ESLVal(")"))));
      }
      }
      }
      }
      }
    case "TermRef": {ESLVal $170 = _v15.termRef(0);
        ESLVal $169 = _v15.termRef(1);
        
        {ESLVal e = $170;
        
        {ESLVal n = $169;
        
        return new ESLVal("termRef(").add(ppExp(indent,e).add(new ESLVal(",").add(n.add(new ESLVal(")")))));
      }
      }
      }
    case "BinExp": {ESLVal $168 = _v15.termRef(0);
        ESLVal $167 = _v15.termRef(1);
        ESLVal $166 = _v15.termRef(2);
        ESLVal $165 = _v15.termRef(3);
        
        {ESLVal l = $168;
        
        {ESLVal e1 = $167;
        
        {ESLVal op = $166;
        
        {ESLVal e2 = $165;
        
        return ppExp(indent,e1).add(op.add(ppExp(indent,e2)));
      }
      }
      }
      }
      }
    case "Update": {ESLVal $164 = _v15.termRef(0);
        ESLVal $163 = _v15.termRef(1);
        ESLVal $162 = _v15.termRef(2);
        
        {ESLVal l = $164;
        
        {ESLVal n = $163;
        
        {ESLVal e = $162;
        
        return n.add(new ESLVal(" := ").add(ppExp(indent,e)));
      }
      }
      }
      }
    case "NewArray": {ESLVal $161 = _v15.termRef(0);
        ESLVal $160 = _v15.termRef(1);
        ESLVal $159 = _v15.termRef(2);
        
        {ESLVal l = $161;
        
        {ESLVal t = $160;
        
        {ESLVal n = $159;
        
        return new ESLVal("new Array[").add(ppType(t).add(new ESLVal("](").add(ppExp(indent,n).add(new ESLVal(")")))));
      }
      }
      }
      }
    case "For": {ESLVal $158 = _v15.termRef(0);
        ESLVal $157 = _v15.termRef(1);
        ESLVal $156 = _v15.termRef(2);
        ESLVal $155 = _v15.termRef(3);
        
        {ESLVal l = $158;
        
        {ESLVal p = $157;
        
        {ESLVal e1 = $156;
        
        {ESLVal e2 = $155;
        
        return new ESLVal("for ").add(ppPattern(p).add(new ESLVal(" in ").add(ppExp(indent,e1).add(new ESLVal(" do {").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e2).add(new ESLVal("}"))))))));
      }
      }
      }
      }
      }
    case "Try": {ESLVal $154 = _v15.termRef(0);
        ESLVal $153 = _v15.termRef(1);
        ESLVal $152 = _v15.termRef(2);
        
        {ESLVal l = $154;
        
        {ESLVal e = $153;
        
        {ESLVal as = $152;
        
        return new ESLVal("try ").add(ppExp(indent,e).add(new ESLVal(" {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun317"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppArm(indent,a);
          }
        }),as)).add(nl(indent).add(new ESLVal("}")))))));
      }
      }
      }
      }
    case "ActExp": {ESLVal $151 = _v15.termRef(0);
        ESLVal $150 = _v15.termRef(1);
        ESLVal $149 = _v15.termRef(2);
        ESLVal $148 = _v15.termRef(3);
        ESLVal $147 = _v15.termRef(4);
        ESLVal $146 = _v15.termRef(5);
        ESLVal $145 = _v15.termRef(6);
        ESLVal $144 = _v15.termRef(7);
        
        {ESLVal l = $151;
        
        {ESLVal n = $150;
        
        {ESLVal args = $149;
        
        {ESLVal x = $148;
        
        {ESLVal parent = $147;
        
        {ESLVal locals = $146;
        
        {ESLVal init = $145;
        
        {ESLVal handlers = $144;
        
        return new ESLVal("act ").add(ppExp(indent,n).add(new ESLVal("(").add(ppDecs(indent,args).add(new ESLVal(") {").add(nl(indent.add(new ESLVal(2))).add(ppBinds(indent.add(new ESLVal(5)),locals).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("-> ").add(ppExp(indent.add(new ESLVal(4)),init).add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun318"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal a = $args[0];
        return ppArm(indent,a);
          }
        }),handlers)).add(nl(indent).add(new ESLVal("}"))))))))))))));
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "Self": {ESLVal $143 = _v15.termRef(0);
        
        {ESLVal l = $143;
        
        return new ESLVal("self");
      }
      }
    case "Ref": {ESLVal $142 = _v15.termRef(0);
        ESLVal $141 = _v15.termRef(1);
        ESLVal $140 = _v15.termRef(2);
        
        {ESLVal l = $142;
        
        {ESLVal e = $141;
        
        {ESLVal n = $140;
        
        return ppExp(indent,e).add(new ESLVal(".").add(n));
      }
      }
      }
      }
    case "Send": {ESLVal $139 = _v15.termRef(0);
        ESLVal $138 = _v15.termRef(1);
        ESLVal $137 = _v15.termRef(2);
        
        {ESLVal l = $139;
        
        {ESLVal target = $138;
        
        {ESLVal message = $137;
        
        return ppExp(indent,target).add(new ESLVal(" <- ").add(ppExp(indent,message)));
      }
      }
      }
      }
    case "Cmp": {ESLVal $136 = _v15.termRef(0);
        ESLVal $135 = _v15.termRef(1);
        ESLVal $134 = _v15.termRef(2);
        
        {ESLVal l = $136;
        
        {ESLVal e = $135;
        
        {ESLVal qs = $134;
        
        return new ESLVal("[").add(ppExp(indent,e).add(new ESLVal(" | ").add(ppJoin(indent.add(new ESLVal(2)),map(new ESLVal(new Function(new ESLVal("fun319"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal q = $args[0];
        return ppQual(indent,q);
          }
        }),qs)).add(new ESLVal("]")))));
      }
      }
      }
      }
    case "New": {ESLVal $133 = _v15.termRef(0);
        ESLVal $132 = _v15.termRef(1);
        ESLVal $131 = _v15.termRef(2);
        
        {ESLVal l = $133;
        
        {ESLVal b = $132;
        
        {ESLVal args = $131;
        
        return new ESLVal("new ").add(ppExp(indent,b).add(new ESLVal("(").add(ppExps(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
      }
      }
      }
      }
    case "NewJava": {ESLVal $130 = _v15.termRef(0);
        ESLVal $129 = _v15.termRef(1);
        ESLVal $128 = _v15.termRef(2);
        ESLVal $127 = _v15.termRef(3);
        
        {ESLVal l = $130;
        
        {ESLVal className = $129;
        
        {ESLVal t = $128;
        
        {ESLVal args = $127;
        
        return new ESLVal("javaNew[").add(ppType(t).add(new ESLVal("](\' + className + ").add(ppExps(indent,args,new ESLVal(",")).add(new ESLVal(")")))));
      }
      }
      }
      }
      }
    case "Grab": {ESLVal $126 = _v15.termRef(0);
        ESLVal $125 = _v15.termRef(1);
        ESLVal $124 = _v15.termRef(2);
        
        {ESLVal l = $126;
        
        {ESLVal rs = $125;
        
        {ESLVal e = $124;
        
        return new ESLVal("*********grab");
      }
      }
      }
      }
    case "Probably": {ESLVal $123 = _v15.termRef(0);
        ESLVal $122 = _v15.termRef(1);
        ESLVal $121 = _v15.termRef(2);
        ESLVal $120 = _v15.termRef(3);
        ESLVal $119 = _v15.termRef(4);
        
        {ESLVal l = $123;
        
        {ESLVal p = $122;
        
        {ESLVal t = $121;
        
        {ESLVal e1 = $120;
        
        {ESLVal e2 = $119;
        
        return new ESLVal("**** probably");
      }
      }
      }
      }
      }
      }
    case "Not": {ESLVal $118 = _v15.termRef(0);
        ESLVal $117 = _v15.termRef(1);
        
        {ESLVal l = $118;
        
        {ESLVal e = $117;
        
        return new ESLVal("not(").add(ppExp(indent,e).add(new ESLVal(")")));
      }
      }
      }
    case "Fold": {ESLVal $116 = _v15.termRef(0);
        ESLVal $115 = _v15.termRef(1);
        ESLVal $114 = _v15.termRef(2);
        
        {ESLVal l = $116;
        
        {ESLVal t = $115;
        
        {ESLVal e = $114;
        
        return new ESLVal("******** fold");
      }
      }
      }
      }
    case "Unfold": {ESLVal $113 = _v15.termRef(0);
        ESLVal $112 = _v15.termRef(1);
        ESLVal $111 = _v15.termRef(2);
        
        {ESLVal l = $113;
        
        {ESLVal t = $112;
        
        {ESLVal e = $111;
        
        return new ESLVal("******unfold");
      }
      }
      }
      }
    case "Now": {ESLVal $110 = _v15.termRef(0);
        
        {ESLVal l = $110;
        
        return new ESLVal("now");
      }
      }
    case "Become": {ESLVal $109 = _v15.termRef(0);
        ESLVal $108 = _v15.termRef(1);
        
        {ESLVal l = $109;
        
        {ESLVal e = $108;
        
        return new ESLVal("become ").add(ppExp(indent,e));
      }
      }
      }
    case "ArrayRef": {ESLVal $107 = _v15.termRef(0);
        ESLVal $106 = _v15.termRef(1);
        ESLVal $105 = _v15.termRef(2);
        
        {ESLVal l = $107;
        
        {ESLVal a = $106;
        
        {ESLVal i = $105;
        
        return ppExp(indent,a).add(new ESLVal("[").add(ppExp(indent,i).add(new ESLVal("]"))));
      }
      }
      }
      }
    case "ArrayUpdate": {ESLVal $104 = _v15.termRef(0);
        ESLVal $103 = _v15.termRef(1);
        ESLVal $102 = _v15.termRef(2);
        ESLVal $101 = _v15.termRef(3);
        
        {ESLVal l = $104;
        
        {ESLVal a = $103;
        
        {ESLVal i = $102;
        
        {ESLVal v = $101;
        
        return ppExp(indent,a).add(new ESLVal("[").add(ppExp(indent,i).add(new ESLVal("] := ").add(ppExp(indent,v)))));
      }
      }
      }
      }
      }
      default: {ESLVal x = _v15;
        
        return error(new ESLVal("ppExp: ").add(x));
      }
    }
    }
  }
  public static ESLVal ppExp = new ESLVal(new Function(new ESLVal("ppExp"),null) { public ESLVal apply(ESLVal... args) { return ppExp(args[0],args[1]); }});
  private static ESLVal ppQual(ESLVal indent,ESLVal q) {
    
    return new ESLVal("qualifier: ").add(q);
  }
  private static ESLVal ppQual = new ESLVal(new Function(new ESLVal("ppQual"),null) { public ESLVal apply(ESLVal... args) { return ppQual(args[0],args[1]); }});
  private static ESLVal ppDecs(ESLVal indent,ESLVal bs) {
    
    return ppJoin(indent,map(new ESLVal(new Function(new ESLVal("fun320"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal b = $args[0];
      return ppDec(indent,b);
        }
      }),bs));
  }
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),null) { public ESLVal apply(ESLVal... args) { return ppDecs(args[0],args[1]); }});
  private static ESLVal ppDec(ESLVal indent,ESLVal d) {
    
    {ESLVal _v16 = d;
      
      switch(_v16.termName) {
      case "Dec": {ESLVal $255 = _v16.termRef(0);
        ESLVal $254 = _v16.termRef(1);
        ESLVal $253 = _v16.termRef(2);
        ESLVal $252 = _v16.termRef(3);
        
        {ESLVal l = $255;
        
        {ESLVal n = $254;
        
        {ESLVal dt = $253;
        
        {ESLVal t = $252;
        
        return n.add(new ESLVal("::").add(ppType(t)));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(10810,10887)").add(ESLVal.list(_v16)));
    }
    }
  }
  private static ESLVal ppDec = new ESLVal(new Function(new ESLVal("ppDec"),null) { public ESLVal apply(ESLVal... args) { return ppDec(args[0],args[1]); }});
  private static ESLVal ppBinds(ESLVal indent,ESLVal bs) {
    
    return ppJoin(indent,map(new ESLVal(new Function(new ESLVal("fun321"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal b = $args[0];
      return ppBind(indent,b);
        }
      }),bs));
  }
  private static ESLVal ppBinds = new ESLVal(new Function(new ESLVal("ppBinds"),null) { public ESLVal apply(ESLVal... args) { return ppBinds(args[0],args[1]); }});
  private static ESLVal ppBind(ESLVal indent,ESLVal b) {
    
    {ESLVal _v17 = b;
      
      switch(_v17.termName) {
      case "Binding": {ESLVal $279 = _v17.termRef(0);
        ESLVal $278 = _v17.termRef(1);
        ESLVal $277 = _v17.termRef(2);
        ESLVal $276 = _v17.termRef(3);
        ESLVal $275 = _v17.termRef(4);
        
        {ESLVal l = $279;
        
        {ESLVal name = $278;
        
        {ESLVal t = $277;
        
        {ESLVal st = $276;
        
        {ESLVal value = $275;
        
        return name.add(new ESLVal("=").add(ppExp(indent,value).add(new ESLVal(";"))));
      }
      }
      }
      }
      }
      }
    case "TypeBind": {ESLVal $274 = _v17.termRef(0);
        ESLVal $273 = _v17.termRef(1);
        ESLVal $272 = _v17.termRef(2);
        ESLVal $271 = _v17.termRef(3);
        
        {ESLVal l = $274;
        
        {ESLVal name = $273;
        
        {ESLVal t = $272;
        
        {ESLVal ignore = $271;
        
        return new ESLVal("type ").add(name);
      }
      }
      }
      }
      }
    case "DataBind": {ESLVal $270 = _v17.termRef(0);
        ESLVal $269 = _v17.termRef(1);
        ESLVal $268 = _v17.termRef(2);
        ESLVal $267 = _v17.termRef(3);
        
        {ESLVal l = $270;
        
        {ESLVal name = $269;
        
        {ESLVal t = $268;
        
        {ESLVal ignore = $267;
        
        return new ESLVal("data ").add(name);
      }
      }
      }
      }
      }
    case "FunBind": {ESLVal $266 = _v17.termRef(0);
        ESLVal $265 = _v17.termRef(1);
        ESLVal $264 = _v17.termRef(2);
        ESLVal $263 = _v17.termRef(3);
        ESLVal $262 = _v17.termRef(4);
        ESLVal $261 = _v17.termRef(5);
        ESLVal $260 = _v17.termRef(6);
        
        {ESLVal l = $266;
        
        {ESLVal name = $265;
        
        {ESLVal args = $264;
        
        {ESLVal t = $263;
        
        {ESLVal st = $262;
        
        {ESLVal body = $261;
        
        {ESLVal guard = $260;
        
        return name.add(new ESLVal("(").add(ppPatterns(args).add(new ESLVal(") = ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),body))))));
      }
      }
      }
      }
      }
      }
      }
      }
    case "CnstrBind": {ESLVal $259 = _v17.termRef(0);
        ESLVal $258 = _v17.termRef(1);
        ESLVal $257 = _v17.termRef(2);
        ESLVal $256 = _v17.termRef(3);
        
        {ESLVal l = $259;
        
        {ESLVal name = $258;
        
        {ESLVal t = $257;
        
        {ESLVal ignore = $256;
        
        return name;
      }
      }
      }
      }
      }
      default: {ESLVal x = _v17;
        
        return error(new ESLVal("ppBind: ").add(x));
      }
    }
    }
  }
  private static ESLVal ppBind = new ESLVal(new Function(new ESLVal("ppBind"),null) { public ESLVal apply(ESLVal... args) { return ppBind(args[0],args[1]); }});
  public static ESLVal ppArm(ESLVal indent,ESLVal a) {
    
    {ESLVal _v18 = a;
      
      switch(_v18.termName) {
      case "BArm": {ESLVal $283 = _v18.termRef(0);
        ESLVal $282 = _v18.termRef(1);
        ESLVal $281 = _v18.termRef(2);
        ESLVal $280 = _v18.termRef(3);
        
        {ESLVal l = $283;
        
        {ESLVal ps = $282;
        
        {ESLVal guard = $281;
        
        {ESLVal e = $280;
        
        return ppPatterns(ps).add(new ESLVal(" -> ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e))));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11672,11810)").add(ESLVal.list(_v18)));
    }
    }
  }
  public static ESLVal ppArm = new ESLVal(new Function(new ESLVal("ppArm"),null) { public ESLVal apply(ESLVal... args) { return ppArm(args[0],args[1]); }});
  public static ESLVal ppArms(ESLVal indent,ESLVal arms) {
    
    return ppJoin(indent,map(new ESLVal(new Function(new ESLVal("fun322"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal a = $args[0];
      return ppArm(indent,a);
        }
      }),arms));
  }
  public static ESLVal ppArms = new ESLVal(new Function(new ESLVal("ppArms"),null) { public ESLVal apply(ESLVal... args) { return ppArms(args[0],args[1]); }});
  private static ESLVal ppCaseTermArm(ESLVal indent,ESLVal a) {
    
    {ESLVal _v19 = a;
      
      switch(_v19.termName) {
      case "TArm": {ESLVal $285 = _v19.termRef(0);
        ESLVal $284 = _v19.termRef(1);
        
        {ESLVal n = $285;
        
        {ESLVal e = $284;
        
        return n.add(new ESLVal(" -> ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e))));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(11972,12072)").add(ESLVal.list(_v19)));
    }
    }
  }
  private static ESLVal ppCaseTermArm = new ESLVal(new Function(new ESLVal("ppCaseTermArm"),null) { public ESLVal apply(ESLVal... args) { return ppCaseTermArm(args[0],args[1]); }});
  private static ESLVal ppCaseIntsArm(ESLVal indent,ESLVal a) {
    
    {ESLVal _v20 = a;
      
      switch(_v20.termName) {
      case "IArm": {ESLVal $287 = _v20.termRef(0);
        ESLVal $286 = _v20.termRef(1);
        
        {ESLVal n = $287;
        
        {ESLVal e = $286;
        
        return n.add(new ESLVal(" -> ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e))));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(12128,12228)").add(ESLVal.list(_v20)));
    }
    }
  }
  private static ESLVal ppCaseIntsArm = new ESLVal(new Function(new ESLVal("ppCaseIntsArm"),null) { public ESLVal apply(ESLVal... args) { return ppCaseIntsArm(args[0],args[1]); }});
  private static ESLVal ppCaseStrsArm(ESLVal indent,ESLVal a) {
    
    {ESLVal _v21 = a;
      
      switch(_v21.termName) {
      case "SArm": {ESLVal $289 = _v21.termRef(0);
        ESLVal $288 = _v21.termRef(1);
        
        {ESLVal n = $289;
        
        {ESLVal e = $288;
        
        return new ESLVal("\'").add(n.add(new ESLVal("\'").add(new ESLVal(" -> ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e))))));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(12284,12398)").add(ESLVal.list(_v21)));
    }
    }
  }
  private static ESLVal ppCaseStrsArm = new ESLVal(new Function(new ESLVal("ppCaseStrsArm"),null) { public ESLVal apply(ESLVal... args) { return ppCaseStrsArm(args[0],args[1]); }});
  private static ESLVal ppCaseBoolsArm(ESLVal indent,ESLVal a) {
    
    {ESLVal _v22 = a;
      
      switch(_v22.termName) {
      case "BoolArm": {ESLVal $291 = _v22.termRef(0);
        ESLVal $290 = _v22.termRef(1);
        
        {ESLVal b = $291;
        
        {ESLVal e = $290;
        
        return b.add(new ESLVal(" -> ").add(nl(indent.add(new ESLVal(2))).add(ppExp(indent.add(new ESLVal(2)),e))));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(12456,12560)").add(ESLVal.list(_v22)));
    }
    }
  }
  private static ESLVal ppCaseBoolsArm = new ESLVal(new Function(new ESLVal("ppCaseBoolsArm"),null) { public ESLVal apply(ESLVal... args) { return ppCaseBoolsArm(args[0],args[1]); }});
  private static ESLVal getImport(ESLVal sourceFile) {
    
    {ESLVal path = toPath(sourceFile);
      
      {ESLVal p = pathToJavaPackage(path);
      ESLVal className = pathToJavaClassName(path);
      
      {ESLVal _v23 = sourceFile;
      
      switch(_v23.strVal) {
      case "esl/lists.esl": return new ESLVal("// import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
      default: {ESLVal x = _v23;
        
        return new ESLVal("import static ").add(p.add(new ESLVal(".").add(className.add(new ESLVal(".*;")))));
      }
    }
    }
    }
    }
  }
  private static ESLVal getImport = new ESLVal(new Function(new ESLVal("getImport"),null) { public ESLVal apply(ESLVal... args) { return getImport(args[0]); }});
  public static ESLVal ppJModule(ESLVal name,ESLVal p,ESLVal m) {
    
    {ESLVal _v24 = m;
      
      switch(_v24.termName) {
      case "JModule": {ESLVal $296 = _v24.termRef(0);
        ESLVal $295 = _v24.termRef(1);
        ESLVal $294 = _v24.termRef(2);
        ESLVal $293 = _v24.termRef(3);
        ESLVal $292 = _v24.termRef(4);
        
        {ESLVal n = $296;
        
        {ESLVal exports = $295;
        
        {ESLVal imports = $294;
        
        {ESLVal methods = $293;
        
        {ESLVal fields = $292;
        
        return new ESLVal("package ").add(p.add(new ESLVal(";").add(nl($zero).add(new ESLVal("import esl.lib.*;").add(nl($zero).add(new ESLVal("import static esl.lib.Lib.*;").add(nl($zero).add(ppJoin($zero,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              $v.add(getImport(i));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(imports)).add(nl($zero).add(new ESLVal("public class ").add(name.add(new ESLVal(" {").add(nl(new ESLVal(2)).add(new ESLVal("public static ESLVal getSelf() { return $null; }").add(nl(new ESLVal(2)).add(ppJoin(new ESLVal(2),map(new ESLVal(new Function(new ESLVal("fun323"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal f = $args[0];
        return ppJModuleField(new ESLVal(2),exports,f);
          }
        }),fields)).add(nl($zero).add(ppJoin(new ESLVal(2),map(new ESLVal(new Function(new ESLVal("fun324"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v121 = $args[0];
        return ppJModuleMethod(new ESLVal(2),exports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v25 = $qualArg;
                    
                    switch(_v25.termName) {
                    case "JField": {ESLVal $299 = _v25.termRef(0);
                      ESLVal $298 = _v25.termRef(1);
                      ESLVal $297 = _v25.termRef(2);
                      
                      {ESLVal _v122 = $299;
                      
                      {ESLVal t = $298;
                      
                      {ESLVal e = $297;
                      
                      return ESLVal.list(ESLVal.list(_v122));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v25;
                      
                      return $nil;
                    }
                  }
                  }
                }
              }).map(fields).flatten().flatten(),_v121);
          }
        }),methods)).add(nl($zero).add(new ESLVal("public static void main(String[] args) {").add(nl(new ESLVal(2)).add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(new ESLVal("main"),exports).boolVal)
            return new ESLVal("  newActor(main,new ESLVal(new Actor())); ").add(nl(new ESLVal(2)));
            else
              return new ESLVal("");
        }}.get().add(new ESLVal("}").add(nl($zero).add(new ESLVal("}"))))))))))))))))))))))))));
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(12955,13827)").add(ESLVal.list(_v24)));
    }
    }
  }
  public static ESLVal ppJModule = new ESLVal(new Function(new ESLVal("ppJModule"),null) { public ESLVal apply(ESLVal... args) { return ppJModule(args[0],args[1],args[2]); }});
  private static ESLVal ppJModuleField(ESLVal indent,ESLVal exports,ESLVal f) {
    
    {ESLVal _v26 = f;
      
      switch(_v26.termName) {
      case "JField": {ESLVal $302 = _v26.termRef(0);
        ESLVal $301 = _v26.termRef(1);
        ESLVal $300 = _v26.termRef(2);
        
        switch($302.strVal) {
        case "edb": switch($300.termName) {
          case "JNull": {
            {ESLVal t = $301;
            
            return new ESLVal("// static ESLVal edb = null;");
          }
          }
          default: {ESLVal n = $302;
            
            {ESLVal t = $301;
            
            {ESLVal e = $300;
            
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              if(member.apply(n,exports).boolVal)
                return new ESLVal("public ");
                else
                  return new ESLVal("private ");
            }}.get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp(indent,$nil,e).add(new ESLVal(";"))))));
          }
          }
          }
        }
        default: {ESLVal n = $302;
          
          {ESLVal t = $301;
          
          {ESLVal e = $300;
          
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            if(member.apply(n,exports).boolVal)
              return new ESLVal("public ");
              else
                return new ESLVal("private ");
          }}.get().add(new ESLVal("static ESLVal ").add(n.add(new ESLVal(" = ").add(ppJExp(indent,$nil,e).add(new ESLVal(";"))))));
        }
        }
        }
      }
      }
      default: return error(new ESLVal("case error at Pos(13896,14146)").add(ESLVal.list(_v26)));
    }
    }
  }
  private static ESLVal ppJModuleField = new ESLVal(new Function(new ESLVal("ppJModuleField"),null) { public ESLVal apply(ESLVal... args) { return ppJModuleField(args[0],args[1],args[2]); }});
  private static ESLVal ppJModuleMethod(ESLVal indent,ESLVal exports,ESLVal fieldNames,ESLVal method) {
    
    {ESLVal _v27 = method;
      
      switch(_v27.termName) {
      case "JMethod": {ESLVal $305 = _v27.termRef(0);
        ESLVal $304 = _v27.termRef(1);
        ESLVal $303 = _v27.termRef(2);
        
        {ESLVal name = $305;
        
        {ESLVal args = $304;
        
        {ESLVal body = $303;
        
        {ESLVal freeDynamics = removeAll(fieldNames,dynamicVarsJCommand(body));
        
        {ESLVal argDecs = joinBy(new ESLVal(44),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                switch(_v28.termName) {
                case "JDec": {ESLVal $307 = _v28.termRef(0);
                  ESLVal $306 = _v28.termRef(1);
                  
                  {ESLVal n = $307;
                  
                  {ESLVal t = $306;
                  
                  return ESLVal.list(ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                    if(member.apply(n,freeDynamics).boolVal)
                      return pJDec(indent,new ESLVal("JDec",new ESLVal("$raw_").add(n),t));
                      else
                        return pJDec(indent,new ESLVal("JDec",n,t));
                  }}.get()));
                }
                }
                }
                default: {ESLVal _0 = _v28;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten());
        ESLVal freeNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                switch(_v29.termName) {
                case "JDec": {ESLVal $309 = _v29.termRef(0);
                  ESLVal $308 = _v29.termRef(1);
                  
                  {ESLVal n = $309;
                  
                  {ESLVal t = $308;
                  
                  return ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                    if(member.apply(n,freeDynamics).boolVal)
                      return ESLVal.list(n);
                      else
                        return $nil;
                  }}.get());
                }
                }
                }
                default: {ESLVal _0 = _v29;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal freeDecs = joinBy(new ESLVal(32),new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                $v.add(new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$raw_").add(n.add(new ESLVal("};"))))));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(freeNames));
        
        return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(name,exports).boolVal)
            return new ESLVal("public ");
            else
              return new ESLVal("private ");
        }}.get().add(new ESLVal("static ESLVal ").add(name.add(new ESLVal("(").add(argDecs.add(new ESLVal(") {").add(nl(indent.add(new ESLVal(2))).add(freeDecs.add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),freeDynamics,body).add(nl(indent).add(new ESLVal("}").add(nl(indent).add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(member.apply(name,exports).boolVal)
            return new ESLVal("public ");
            else
              return new ESLVal("private ");
        }}.get().add(new ESLVal("static ESLVal ").add(name.add(new ESLVal(" = new ESLVal(new Function(").add(ppJExp(indent,$nil,new ESLVal("JConstExp",new ESLVal("JConstStr",name))).add(new ESLVal(",null) { ").add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(new ESLVal("return ").add(name.add(new ESLVal("(").add(joinBy(new ESLVal(44),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("args[").add(i.add(new ESLVal("]"))));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(length.apply(args)))).add(new ESLVal("); }});")))))))))))))))))))))))));
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(14238,15589)").add(ESLVal.list(_v27)));
    }
    }
  }
  private static ESLVal ppJModuleMethod = new ESLVal(new Function(new ESLVal("ppJModuleMethod"),null) { public ESLVal apply(ESLVal... args) { return ppJModuleMethod(args[0],args[1],args[2],args[3]); }});
  private static ESLVal ppJBehaviourMethod(ESLVal indent,ESLVal dynamics,ESLVal method) {
    
    {ESLVal _v30 = method;
      
      switch(_v30.termName) {
      case "JMethod": {ESLVal $312 = _v30.termRef(0);
        ESLVal $311 = _v30.termRef(1);
        ESLVal $310 = _v30.termRef(2);
        
        {ESLVal name = $312;
        
        {ESLVal args = $311;
        
        {ESLVal body = $310;
        
        {ESLVal freeDynamics = dynamicVarsJCommand(body);
        ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v31 = $qualArg;
                
                switch(_v31.termName) {
                case "JDec": {ESLVal $314 = _v31.termRef(0);
                  ESLVal $313 = _v31.termRef(1);
                  
                  {ESLVal n = $314;
                  
                  {ESLVal t = $313;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                default: {ESLVal _0 = _v31;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten();
        
        {ESLVal boundDynamics = new SerializableFunction<ESLVal,ESLVal>() {
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
        
        {ESLVal _v120 = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                if(member.apply(n,removeAll(boundDynamics,argNames)).not().boolVal) {$v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(dynamics);
        
        {ESLVal argDecs = joinBy(new ESLVal(44),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v32 = $qualArg;
                
                switch(_v32.termName) {
                case "JDec": {ESLVal $316 = _v32.termRef(0);
                  ESLVal $315 = _v32.termRef(1);
                  
                  {ESLVal n = $316;
                  
                  {ESLVal t = $315;
                  
                  return ESLVal.list(ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                    if(member.apply(n,boundDynamics).boolVal)
                      return pJDec(indent,new ESLVal("JDec",new ESLVal("$raw_").add(n),t));
                      else
                        return pJDec(indent,new ESLVal("JDec",n,t));
                  }}.get()));
                }
                }
                }
                default: {ESLVal _0 = _v32;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(args).flatten().flatten());
        ESLVal freeNames = new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                if(member.apply(n,boundDynamics).boolVal) {$v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(argNames);
        
        {ESLVal freeDecs = joinBy(new ESLVal(32),new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal n = $l0.head();
                $l0 = $l0.tail();
                $v.add(new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$raw_").add(n.add(new ESLVal("};"))))));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(freeNames));
        
        return new ESLVal("ESLVal ").add(name.add(new ESLVal("(").add(argDecs.add(new ESLVal(") {").add(nl(indent.add(new ESLVal(2))).add(freeDecs.add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),boundDynamics.add(_v120),body).add(nl(indent).add(new ESLVal("}").add(nl(indent).add(new ESLVal("ESLVal ").add(name.add(new ESLVal(" = new ESLVal(new Function(").add(ppJExp(indent,$nil,new ESLVal("JConstExp",new ESLVal("JConstStr",name))).add(new ESLVal(",null) { ").add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(new ESLVal("return ").add(name.add(new ESLVal("(").add(joinBy(new ESLVal(44),new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("args[").add(i.add(new ESLVal("]"))));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(length.apply(args)))).add(new ESLVal("); }});")))))))))))))))))))))));
      }
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(15669,17105)").add(ESLVal.list(_v30)));
    }
    }
  }
  private static ESLVal ppJBehaviourMethod = new ESLVal(new Function(new ESLVal("ppJBehaviourMethod"),null) { public ESLVal apply(ESLVal... args) { return ppJBehaviourMethod(args[0],args[1],args[2]); }});
  private static ESLVal ppJExps(ESLVal indent,ESLVal dynamics,ESLVal exps,ESLVal sep) {
    
    {ESLVal _v33 = exps;
      
      if(_v33.isCons())
      {ESLVal $317 = _v33.head();
        ESLVal $318 = _v33.tail();
        
        if($318.isCons())
        {ESLVal $319 = $318.head();
          ESLVal $320 = $318.tail();
          
          {ESLVal e1 = $317;
          
          {ESLVal e2 = $319;
          
          {ESLVal es = $320;
          
          return ppJExp(indent,dynamics,e1).add(sep.add(ppJExps(indent,dynamics,es.cons(e2),sep)));
        }
        }
        }
        }
      else if($318.isNil())
        {ESLVal e = $317;
          
          return ppJExp(indent,dynamics,e);
        }
      else return error(new ESLVal("case error at Pos(17175,17369)").add(ESLVal.list(_v33)));
      }
    else if(_v33.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(17175,17369)").add(ESLVal.list(_v33)));
    }
  }
  private static ESLVal ppJExps = new ESLVal(new Function(new ESLVal("ppJExps"),null) { public ESLVal apply(ESLVal... args) { return ppJExps(args[0],args[1],args[2],args[3]); }});
  private static ESLVal ppJDecs(ESLVal indent,ESLVal decs,ESLVal sep) {
    
    {ESLVal _v34 = decs;
      
      if(_v34.isCons())
      {ESLVal $321 = _v34.head();
        ESLVal $322 = _v34.tail();
        
        if($322.isCons())
        {ESLVal $323 = $322.head();
          ESLVal $324 = $322.tail();
          
          {ESLVal e1 = $321;
          
          {ESLVal e2 = $323;
          
          {ESLVal es = $324;
          
          return pJDec(indent,e1).add(sep.add(ppJDecs(indent,es.cons(e2),sep)));
        }
        }
        }
        }
      else if($322.isNil())
        {ESLVal e = $321;
          
          return pJDec(indent,e);
        }
      else return error(new ESLVal("case error at Pos(17431,17643)").add(ESLVal.list(_v34)));
      }
    else if(_v34.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(17431,17643)").add(ESLVal.list(_v34)));
    }
  }
  private static ESLVal ppJDecs = new ESLVal(new Function(new ESLVal("ppJDecs"),null) { public ESLVal apply(ESLVal... args) { return ppJDecs(args[0],args[1],args[2]); }});
  private static ESLVal pJDec(ESLVal indent,ESLVal d) {
    
    {ESLVal _v35 = d;
      
      switch(_v35.termName) {
      case "JDec": {ESLVal $326 = _v35.termRef(0);
        ESLVal $325 = _v35.termRef(1);
        
        {ESLVal n = $326;
        
        {ESLVal t = $325;
        
        return new ESLVal("ESLVal ").add(n);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(17689,17745)").add(ESLVal.list(_v35)));
    }
    }
  }
  private static ESLVal pJDec = new ESLVal(new Function(new ESLVal("pJDec"),null) { public ESLVal apply(ESLVal... args) { return pJDec(args[0],args[1]); }});
  private static ESLVal ppJExp(ESLVal indent,ESLVal dynamics,ESLVal e) {
    
    {ESLVal _v36 = e;
      
      switch(_v36.termName) {
      case "JArrayRef": {ESLVal $429 = _v36.termRef(0);
        ESLVal $428 = _v36.termRef(1);
        
        {ESLVal a = $429;
        
        {ESLVal i = $428;
        
        return ppJExp(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp(indent,dynamics,i).add(new ESLVal(".intVal]"))));
      }
      }
      }
    case "JArrayUpdate": {ESLVal $427 = _v36.termRef(0);
        ESLVal $426 = _v36.termRef(1);
        ESLVal $425 = _v36.termRef(2);
        
        {ESLVal a = $427;
        
        {ESLVal i = $426;
        
        {ESLVal v = $425;
        
        return ppJExp(indent,dynamics,a).add(new ESLVal(".array[").add(ppJExp(indent,dynamics,i).add(new ESLVal(".intVal] = ").add(ppJExp(indent,dynamics,v)))));
      }
      }
      }
      }
    case "JBecome": {ESLVal $422 = _v36.termRef(0);
        ESLVal $421 = _v36.termRef(1);
        
        if($421.isCons())
        {ESLVal $423 = $421.head();
          ESLVal $424 = $421.tail();
          
          {ESLVal _v116 = $422;
          
          {ESLVal es = $421;
          
          return new ESLVal("become(").add(ppJExp(indent.add(new ESLVal(2)),dynamics,_v116).add(new ESLVal(",getSelf(),").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
      else if($421.isNil())
        {ESLVal _v117 = $422;
          
          return new ESLVal("become(").add(ppJExp(indent.add(new ESLVal(2)),dynamics,_v117).add(new ESLVal(",getSelf())")));
        }
      else {ESLVal _v118 = $422;
          
          {ESLVal es = $421;
          
          return new ESLVal("become(").add(ppJExp(indent.add(new ESLVal(2)),dynamics,_v118).add(new ESLVal(",getSelf(),").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      }
    case "JConstExp": {ESLVal $416 = _v36.termRef(0);
        
        switch($416.termName) {
        case "JConstInt": {ESLVal $420 = $416.termRef(0);
          
          switch($420.intVal) {
          case 0: return new ESLVal("$zero");
        case 1: return new ESLVal("$one");
          default: {ESLVal n = $420;
            
            return new ESLVal("new ESLVal(").add(n.add(new ESLVal(")")));
          }
        }
        }
      case "JConstBool": {ESLVal $419 = $416.termRef(0);
          
          switch($419.boolVal ? 1 : 0) {
          case 1: return new ESLVal("$true");
        case 0: return new ESLVal("$false");
          default: {ESLVal _v114 = _v36;
            
            return new ESLVal("********** unknown expression: ").add(_v114);
          }
        }
        }
      case "JConstStr": {ESLVal $418 = $416.termRef(0);
          
          {ESLVal s = $418;
          
          return new ESLVal("new ESLVal(\"").add(javaString(s).add(new ESLVal("\")")));
        }
        }
      case "JConstDouble": {ESLVal $417 = $416.termRef(0);
          
          {ESLVal d = $417;
          
          return new ESLVal("new ESLVal(").add(d.add(new ESLVal(")")));
        }
        }
        default: {ESLVal _v115 = _v36;
          
          return new ESLVal("********** unknown expression: ").add(_v115);
        }
      }
      }
    case "JNot": {ESLVal $415 = _v36.termRef(0);
        
        {ESLVal _v113 = $415;
        
        return ppJExp(indent,dynamics,_v113).add(new ESLVal(".not()"));
      }
      }
    case "JNil": {ESLVal $414 = _v36.termRef(0);
        
        {ESLVal t = $414;
        
        return new ESLVal("$nil");
      }
      }
    case "JList": {ESLVal $411 = _v36.termRef(0);
        ESLVal $410 = _v36.termRef(1);
        
        if($410.isCons())
        {ESLVal $412 = $410.head();
          ESLVal $413 = $410.tail();
          
          {ESLVal t = $411;
          
          {ESLVal es = $410;
          
          return ppJListExp(indent,dynamics,t,es);
        }
        }
        }
      else if($410.isNil())
        {ESLVal t = $411;
          
          return new ESLVal("$nil");
        }
      else {ESLVal t = $411;
          
          {ESLVal es = $410;
          
          return ppJListExp(indent,dynamics,t,es);
        }
        }
      }
    case "JSet": {ESLVal $409 = _v36.termRef(0);
        ESLVal $408 = _v36.termRef(1);
        
        {ESLVal t = $409;
        
        {ESLVal es = $408;
        
        return ppJSetExp(indent,dynamics,t,es);
      }
      }
      }
    case "JBag": {ESLVal $407 = _v36.termRef(0);
        ESLVal $406 = _v36.termRef(1);
        
        {ESLVal t = $407;
        
        {ESLVal es = $406;
        
        return ppJBagExp(indent,dynamics,t,es);
      }
      }
      }
    case "JTerm": {ESLVal $403 = _v36.termRef(0);
        ESLVal $402 = _v36.termRef(1);
        
        if($402.isCons())
        {ESLVal $404 = $402.head();
          ESLVal $405 = $402.tail();
          
          {ESLVal n = $403;
          
          {ESLVal es = $402;
          
          return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
      else if($402.isNil())
        {ESLVal n = $403;
          
          return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",new ESLVal[]{})")));
        }
      else {ESLVal n = $403;
          
          {ESLVal es = $402;
          
          return new ESLVal("new ESLVal(\"").add(n.add(new ESLVal("\",").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      }
    case "JFun": {ESLVal $401 = _v36.termRef(0);
        ESLVal $400 = _v36.termRef(1);
        ESLVal $399 = _v36.termRef(2);
        ESLVal $398 = _v36.termRef(3);
        
        {ESLVal n = $401;
        
        {ESLVal args = $400;
        
        {ESLVal t = $399;
        
        {ESLVal body = $398;
        
        return ppJFun(indent,dynamics,n,args,t,body);
      }
      }
      }
      }
      }
    case "JBinExp": {ESLVal $397 = _v36.termRef(0);
        ESLVal $396 = _v36.termRef(1);
        ESLVal $395 = _v36.termRef(2);
        
        switch($396.strVal) {
        case "at": {ESLVal e1 = $397;
          
          {ESLVal e2 = $395;
          
          return new ESLVal("at(() -> { return ").add(ppJExp(indent,dynamics,e1).add(new ESLVal("; },() -> { return ").add(ppJExp(indent,dynamics,e2).add(new ESLVal("; })")))));
        }
        }
      case "==": {ESLVal e1 = $397;
          
          {ESLVal e2 = $395;
          
          return ppJExp(indent,dynamics,e1).add(new ESLVal(".equals(").add(ppJExp(indent,dynamics,e2).add(new ESLVal(")"))));
        }
        }
      case "cons": {ESLVal e1 = $397;
          
          {ESLVal e2 = $395;
          
          return ppJExp(indent,dynamics,e2).add(new ESLVal(".cons(").add(ppJExp(indent,dynamics,e1).add(new ESLVal(")"))));
        }
        }
        default: {ESLVal e1 = $397;
          
          {ESLVal op = $396;
          
          {ESLVal e2 = $395;
          
          return ppJExp(indent,dynamics,e1).add(new ESLVal(".").add(op.add(new ESLVal("(").add(ppJExp(indent,dynamics,e2).add(new ESLVal(")"))))));
        }
        }
        }
      }
      }
    case "JCmpExp": {ESLVal $394 = _v36.termRef(0);
        
        {ESLVal c = $394;
        
        return ppJCmp(indent,dynamics,c);
      }
      }
    case "JMethodCall": {ESLVal $393 = _v36.termRef(0);
        ESLVal $392 = _v36.termRef(1);
        
        {ESLVal name = $393;
        
        {ESLVal args = $392;
        
        return name.add(new ESLVal("(").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")"))));
      }
      }
      }
    case "JNull": {
        return new ESLVal("$null");
      }
    case "JNow": {
        return new ESLVal("now()");
      }
    case "JVar": {ESLVal $391 = _v36.termRef(0);
        ESLVal $390 = _v36.termRef(1);
        
        {ESLVal n = $391;
        
        {ESLVal t = $390;
        
        if(member.apply(n,dynamics).boolVal)
        return n.add(new ESLVal("[0]"));
        else
          {ESLVal _v111 = $391;
            
            {ESLVal _v112 = $390;
            
            return _v111;
          }
          }
      }
      }
      }
    case "JError": {ESLVal $389 = _v36.termRef(0);
        
        {ESLVal _v110 = $389;
        
        return new ESLVal("error(").add(ppJExp(indent,dynamics,_v110).add(new ESLVal(")")));
      }
      }
    case "JApply": {ESLVal $388 = _v36.termRef(0);
        ESLVal $387 = _v36.termRef(1);
        
        {ESLVal _v109 = $388;
        
        {ESLVal es = $387;
        
        return ppJExp(indent,dynamics,_v109).add(new ESLVal(".apply(").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")"))));
      }
      }
      }
    case "JCommandExp": {ESLVal $386 = _v36.termRef(0);
        ESLVal $385 = _v36.termRef(1);
        
        {ESLVal c = $386;
        
        {ESLVal t = $385;
        
        return new ESLVal("new SerializableSupplier<ESLVal>() { public ESLVal get() { ").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,c).add(nl(indent).add(new ESLVal("}}.get()")))));
      }
      }
      }
    case "JIfExp": {ESLVal $384 = _v36.termRef(0);
        ESLVal $383 = _v36.termRef(1);
        ESLVal $382 = _v36.termRef(2);
        
        {ESLVal _v108 = $384;
        
        {ESLVal e1 = $383;
        
        {ESLVal e2 = $382;
        
        return new ESLVal("(").add(ppJExp(indent,dynamics,_v108).add(new ESLVal(".boolVal) ? (").add(ppJExp(indent,dynamics,e1).add(new ESLVal(") : (").add(ppJExp(indent,dynamics,e2).add(new ESLVal(")")))))));
      }
      }
      }
      }
    case "JHead": {ESLVal $381 = _v36.termRef(0);
        
        {ESLVal _v107 = $381;
        
        return ppJExp(indent,dynamics,_v107).add(new ESLVal(".head()"));
      }
      }
    case "JTail": {ESLVal $380 = _v36.termRef(0);
        
        {ESLVal _v106 = $380;
        
        return ppJExp(indent,dynamics,_v106).add(new ESLVal(".tail()"));
      }
      }
    case "JTermRef": {ESLVal $379 = _v36.termRef(0);
        ESLVal $378 = _v36.termRef(1);
        
        {ESLVal _v105 = $379;
        
        {ESLVal n = $378;
        
        return ppJExp(indent,dynamics,_v105).add(new ESLVal(".termRef(").add(n.add(new ESLVal(")"))));
      }
      }
      }
    case "JMapFun": {ESLVal $377 = _v36.termRef(0);
        ESLVal $376 = _v36.termRef(1);
        
        {ESLVal f = $377;
        
        {ESLVal l = $376;
        
        return ppJExp(indent,dynamics,f).add(new ESLVal(".map(").add(ppJExp(indent,dynamics,l).add(new ESLVal(")"))));
      }
      }
      }
    case "JFlatten": {ESLVal $375 = _v36.termRef(0);
        
        {ESLVal ls = $375;
        
        return ppJExp(indent,dynamics,ls).add(new ESLVal(".flatten()"));
      }
      }
    case "JBehaviour": {ESLVal $370 = _v36.termRef(0);
        ESLVal $369 = _v36.termRef(1);
        ESLVal $368 = _v36.termRef(2);
        ESLVal $367 = _v36.termRef(3);
        ESLVal $366 = _v36.termRef(4);
        ESLVal $365 = _v36.termRef(5);
        
        switch($366.termName) {
        case "JFun": {ESLVal $374 = $366.termRef(0);
          ESLVal $373 = $366.termRef(1);
          ESLVal $372 = $366.termRef(2);
          ESLVal $371 = $366.termRef(3);
          
          {ESLVal es = $370;
          
          {ESLVal fs = $369;
          
          {ESLVal methods = $368;
          
          {ESLVal init = $367;
          
          {ESLVal n = $374;
          
          {ESLVal args = $373;
          
          {ESLVal t = $372;
          
          {ESLVal body = $371;
          
          {ESLVal time = $365;
          
          return new ESLVal("new ESLVal(new BehaviourAdapter(").add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            if(time.eql(new ESLVal("JBlock",$nil)).boolVal)
              return new ESLVal("false");
              else
                return new ESLVal("true");
          }}.get().add(new ESLVal(",getSelf(),").add(ppJExp(indent,dynamics,n).add(new ESLVal(") {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(new ESLVal(2),map(new ESLVal(new Function(new ESLVal("fun325"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal m = $args[0];
          return ppJBehaviourMethod(new ESLVal(2),dynamics,m);
            }
          }),methods)).add(nl($zero).add(ppJFields(indent.add(new ESLVal(2)),dynamics,fs).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl(indent.add(new ESLVal(6))).add(ppJoin(indent.add(new ESLVal(6)),new SerializableFunction<ESLVal,ESLVal>() {
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
            }}.apply(es)).add(nl(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"ref illegal \" + self + \".\" + name);").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,time).add(nl(indent).add(new ESLVal("}").add(nl(indent).add(new ESLVal("public ESLVal init() {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))))));
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
        default: {ESLVal _v104 = _v36;
          
          return new ESLVal("********** unknown expression: ").add(_v104);
        }
      }
      }
    case "JExtendedBehaviour": {ESLVal $360 = _v36.termRef(0);
        ESLVal $359 = _v36.termRef(1);
        ESLVal $358 = _v36.termRef(2);
        ESLVal $357 = _v36.termRef(3);
        ESLVal $356 = _v36.termRef(4);
        ESLVal $355 = _v36.termRef(5);
        ESLVal $354 = _v36.termRef(6);
        
        switch($355.termName) {
        case "JFun": {ESLVal $364 = $355.termRef(0);
          ESLVal $363 = $355.termRef(1);
          ESLVal $362 = $355.termRef(2);
          ESLVal $361 = $355.termRef(3);
          
          {ESLVal es = $360;
          
          {ESLVal parent = $359;
          
          {ESLVal fs = $358;
          
          {ESLVal methods = $357;
          
          {ESLVal init = $356;
          
          {ESLVal n = $364;
          
          {ESLVal args = $363;
          
          {ESLVal t = $362;
          
          {ESLVal body = $361;
          
          {ESLVal time = $354;
          
          return new ESLVal("new ESLVal(new BehaviourAdapter(").add(ppBehaviourParent(indent,dynamics,parent).add(new ESLVal(",").add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            if(time.eql(new ESLVal("JBlock",$nil)).boolVal)
              return new ESLVal("false");
              else
                return new ESLVal("true");
          }}.get().add(new ESLVal(",getSelf(),").add(ppJExp(indent,dynamics,n).add(new ESLVal(") {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(new ESLVal(2),map(new ESLVal(new Function(new ESLVal("fun326"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal m = $args[0];
          return ppJBehaviourMethod(new ESLVal(2),dynamics,m);
            }
          }),methods)).add(nl($zero).add(ppJFields(indent.add(new ESLVal(2)),dynamics,fs).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal handle(ESLVal $m) {").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,body).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl(indent.add(new ESLVal(6))).add(ppJoin(indent.add(new ESLVal(6)),new SerializableFunction<ESLVal,ESLVal>() {
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
            }}.apply(es)).add(nl(indent.add(new ESLVal(6))).add(new ESLVal("default: return refSuper(name);").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("public void handleTime(ESLVal $t) {").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,time).add(nl(indent).add(new ESLVal("}").add(nl(indent).add(new ESLVal("public ESLVal init() {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp(indent.add(new ESLVal(6)),dynamics,init).add(new ESLVal(";").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("})")))))))))))))))))))))))))))))))))))))))))));
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
        default: {ESLVal _v103 = _v36;
          
          return new ESLVal("********** unknown expression: ").add(_v103);
        }
      }
      }
    case "JNew": {ESLVal $351 = _v36.termRef(0);
        ESLVal $350 = _v36.termRef(1);
        
        if($350.isCons())
        {ESLVal $352 = $350.head();
          ESLVal $353 = $350.tail();
          
          {ESLVal b = $351;
          
          {ESLVal args = $350;
          
          return new ESLVal("newActor(").add(ppJExp(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
      else if($350.isNil())
        {ESLVal b = $351;
          
          return new ESLVal("newActor(").add(ppJExp(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()))")));
        }
      else {ESLVal b = $351;
          
          {ESLVal args = $350;
          
          return new ESLVal("newActor(").add(ppJExp(indent,dynamics,b).add(new ESLVal(",new ESLVal(new Actor()),").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      }
    case "JNewArray": {ESLVal $349 = _v36.termRef(0);
        
        {ESLVal i = $349;
        
        return new ESLVal("newArray(").add(ppJExp(indent,dynamics,i).add(new ESLVal(".intVal)")));
      }
      }
    case "JNewTable": {
        return new ESLVal("newTable()");
      }
    case "JNewJava": {ESLVal $346 = _v36.termRef(0);
        ESLVal $345 = _v36.termRef(1);
        
        if($345.isCons())
        {ESLVal $347 = $345.head();
          ESLVal $348 = $345.tail();
          
          {ESLVal n = $346;
          
          {ESLVal args = $345;
          
          return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
        }
      else if($345.isNil())
        {ESLVal n = $346;
          
          return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\")")));
        }
      else {ESLVal n = $346;
          
          {ESLVal args = $345;
          
          return new ESLVal("newJavaActor(\"").add(n.add(new ESLVal("\",").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
        }
        }
      }
    case "JRecord": {ESLVal $344 = _v36.termRef(0);
        
        {ESLVal fs = $344;
        
        return new ESLVal("newRecord(new ESLVal[]{").add(ppJExps(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v37 = $qualArg;
              
              switch(_v37.termName) {
              case "JField": {ESLVal $432 = _v37.termRef(0);
                ESLVal $431 = _v37.termRef(1);
                ESLVal $430 = _v37.termRef(2);
                
                {ESLVal n = $432;
                
                {ESLVal t = $431;
                
                {ESLVal _v101 = $430;
                
                return ESLVal.list(ESLVal.list(new ESLVal("JConstExp",new ESLVal("JConstStr",n))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v37;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal("},").add(ppJExps(indent,dynamics,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v38 = $qualArg;
              
              switch(_v38.termName) {
              case "JField": {ESLVal $435 = _v38.termRef(0);
                ESLVal $434 = _v38.termRef(1);
                ESLVal $433 = _v38.termRef(2);
                
                {ESLVal n = $435;
                
                {ESLVal t = $434;
                
                {ESLVal _v102 = $433;
                
                return ESLVal.list(ESLVal.list(_v102));
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
        }).map(fs).flatten().flatten(),new ESLVal(",")).add(new ESLVal(")")))));
      }
      }
    case "JSend": {ESLVal $341 = _v36.termRef(0);
        ESLVal $340 = _v36.termRef(1);
        ESLVal $339 = _v36.termRef(2);
        
        if($339.isCons())
        {ESLVal $342 = $339.head();
          ESLVal $343 = $339.tail();
          
          {ESLVal _v98 = $341;
          
          {ESLVal m = $340;
          
          {ESLVal args = $339;
          
          return new ESLVal("Lib.send(").add(ppJExp(indent,dynamics,_v98).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
        }
        }
        }
        }
      else if($339.isNil())
        {ESLVal _v99 = $341;
          
          {ESLVal m = $340;
          
          return new ESLVal("Lib.send(").add(ppJExp(indent,dynamics,_v99).add(new ESLVal(",\"").add(m.add(new ESLVal("\")")))));
        }
        }
      else {ESLVal _v100 = $341;
          
          {ESLVal m = $340;
          
          {ESLVal args = $339;
          
          return new ESLVal("Lib.send(").add(ppJExp(indent,dynamics,_v100).add(new ESLVal(",\"").add(m.add(new ESLVal("\",").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))))));
        }
        }
        }
      }
    case "JSendSuper": {ESLVal $338 = _v36.termRef(0);
        
        {ESLVal _v97 = $338;
        
        return new ESLVal("sendSuper(").add(ppJExp(indent,dynamics,_v97).add(new ESLVal(")")));
      }
      }
    case "JSendTimeSuper": {
        return new ESLVal("sendTimeSuper($t)");
      }
    case "JSelf": {
        return new ESLVal("getSelf()");
      }
    case "JRef": {ESLVal $337 = _v36.termRef(0);
        ESLVal $336 = _v36.termRef(1);
        
        {ESLVal _v96 = $337;
        
        {ESLVal n = $336;
        
        return ppJExp(indent,dynamics,_v96).add(new ESLVal(".ref(\"").add(n.add(new ESLVal("\")"))));
      }
      }
      }
    case "JRefSuper": {ESLVal $335 = _v36.termRef(0);
        
        {ESLVal n = $335;
        
        return new ESLVal("refSuper(\"").add(n.add(new ESLVal("\")")));
      }
      }
    case "JGrab": {ESLVal $334 = _v36.termRef(0);
        ESLVal $333 = _v36.termRef(1);
        
        {ESLVal es = $334;
        
        {ESLVal c = $333;
        
        return new ESLVal("lock(new Function(new ESLVal(\"grab\"),getSelf()) {").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal ...args) { ").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("return ").add(ppJExp(indent,dynamics,c).add(new ESLVal(";").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}},").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")))))))))));
      }
      }
      }
    case "JTry": {ESLVal $332 = _v36.termRef(0);
        ESLVal $331 = _v36.termRef(1);
        ESLVal $330 = _v36.termRef(2);
        
        {ESLVal _v95 = $332;
        
        {ESLVal n = $331;
        
        {ESLVal c = $330;
        
        return new ESLVal("new Function(new ESLVal(\"try\"),getSelf()) {").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... args) { ").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("try { ").add(nl(indent.add(new ESLVal(6))).add(new ESLVal("return ").add(ppJExp(indent.add(new ESLVal(4)),dynamics,_v95).add(new ESLVal(";").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("} catch(ESLError $exception) {").add(nl(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $exception.value;").add(nl(indent.add(new ESLVal(6))).add(ppJCommand(indent,dynamics,c).add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("}.apply()")))))))))))))))))))))));
      }
      }
      }
      }
    case "JProbably": {ESLVal $329 = _v36.termRef(0);
        ESLVal $328 = _v36.termRef(1);
        ESLVal $327 = _v36.termRef(2);
        
        {ESLVal _v94 = $329;
        
        {ESLVal e1 = $328;
        
        {ESLVal e2 = $327;
        
        return new ESLVal("probably(").add(ppJExp(indent,dynamics,_v94).add(new ESLVal(",").add(ppJExp(indent,dynamics,probFun(e1)).add(new ESLVal(",").add(ppJExp(indent,dynamics,probFun(e2)).add(new ESLVal(")")))))));
      }
      }
      }
      }
      default: {ESLVal _v119 = _v36;
        
        return new ESLVal("********** unknown expression: ").add(_v119);
      }
    }
    }
  }
  private static ESLVal ppJExp = new ESLVal(new Function(new ESLVal("ppJExp"),null) { public ESLVal apply(ESLVal... args) { return ppJExp(args[0],args[1],args[2]); }});
  private static ESLVal ppJCmp(ESLVal indent,ESLVal dynamics,ESLVal c) {
    
    { LetRec letrec = new LetRec() {
      ESLVal inner = new ESLVal(new Function(new ESLVal("inner"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v87 = $args[0];
        ESLVal _v88 = $args[1];
        ESLVal _v89 = $args[2];
        {ESLVal _v39 = _v89;
              
              switch(_v39.termName) {
              case "JCmpBind": {ESLVal $441 = _v39.termRef(0);
                ESLVal $440 = _v39.termRef(1);
                ESLVal $439 = _v39.termRef(2);
                
                {ESLVal n = $441;
                
                {ESLVal e = $440;
                
                {ESLVal _v91 = $439;
                
                return new ESLVal("ESLVal $l").add(_v88.add(new ESLVal(" = ").add(ppJExp(_v87,dynamics,e).add(new ESLVal(";").add(nl(_v87).add(new ESLVal("while(!$l").add(_v88.add(new ESLVal(".isNil()) {").add(nl(_v87.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l").add(_v88.add(new ESLVal(".head();").add(nl(_v87.add(new ESLVal(2))).add(new ESLVal("$l").add(_v88.add(new ESLVal(" = $l").add(_v88.add(new ESLVal(".tail();").add(nl(_v87.add(new ESLVal(2))).add(inner.apply(_v87.add(new ESLVal(2)),_v88.add($one),_v91).add(nl(_v87).add(new ESLVal("}")))))))))))))))))))))))));
              }
              }
              }
              }
            case "JCmpList": {ESLVal $438 = _v39.termRef(0);
                
                {ESLVal e = $438;
                
                return new ESLVal("$v.add(").add(ppJExp(_v87,dynamics,e).add(new ESLVal(");")));
              }
              }
            case "JCmpIf": {ESLVal $437 = _v39.termRef(0);
                ESLVal $436 = _v39.termRef(1);
                
                {ESLVal e = $437;
                
                {ESLVal _v90 = $436;
                
                return new ESLVal("if(").add(ppJExp(_v87,dynamics,e).add(new ESLVal(".boolVal) {").add(inner.apply(_v87,_v88,_v90).add(nl(_v87).add(new ESLVal("}"))))));
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(26331,26932)").add(ESLVal.list(_v39)));
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
    
      {ESLVal _v40 = c;
      
      switch(_v40.termName) {
      case "JCmpOuter": {ESLVal $444 = _v40.termRef(0);
        ESLVal $443 = _v40.termRef(1);
        ESLVal $442 = _v40.termRef(2);
        
        {ESLVal n = $444;
        
        {ESLVal e = $443;
        
        {ESLVal _v92 = $442;
        
        return new ESLVal("new SerializableFunction<ESLVal,ESLVal>() {").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal $l0) {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal $a = $nil;").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("while(!$l0.isNil()) { ").add(nl(indent.add(new ESLVal(6))).add(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = $l0.head();").add(nl(indent.add(new ESLVal(6))).add(new ESLVal("$l0 = $l0.tail();").add(nl(indent.add(new ESLVal(6))).add(inner.apply(indent,$one,_v92).add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("return $a;").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}}.apply(").add(ppJExp(indent,dynamics,e).add(new ESLVal(")")))))))))))))))))))))))))));
      }
      }
      }
      }
      default: {ESLVal _v93 = _v40;
        
        return new ESLVal("// Illegal Comprehension ").add(_v93);
      }
    }
    }}
    
  }
  private static ESLVal ppJCmp = new ESLVal(new Function(new ESLVal("ppJCmp"),null) { public ESLVal apply(ESLVal... args) { return ppJCmp(args[0],args[1],args[2]); }});
  private static ESLVal ppBehaviourParent(ESLVal indent,ESLVal dynamics,ESLVal e) {
    
    {ESLVal _v41 = e;
      
      switch(_v41.termName) {
      case "JApply": {ESLVal $446 = _v41.termRef(0);
        ESLVal $445 = _v41.termRef(1);
        
        {ESLVal op = $446;
        
        {ESLVal args = $445;
        
        return new ESLVal("getParent(getSelf(),").add(ppJExp(indent,dynamics,op).add(new ESLVal(",").add(ppJExps(indent,dynamics,args,new ESLVal(",")).add(new ESLVal(")")))));
      }
      }
      }
      default: {ESLVal _v86 = _v41;
        
        return ppJExp(indent,dynamics,_v86);
      }
    }
    }
  }
  private static ESLVal ppBehaviourParent = new ESLVal(new Function(new ESLVal("ppBehaviourParent"),null) { public ESLVal apply(ESLVal... args) { return ppBehaviourParent(args[0],args[1],args[2]); }});
  private static ESLVal probFun(ESLVal e) {
    
    return new ESLVal("JFun",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("probFun"))),$nil,$null,new ESLVal("JReturn",e));
  }
  private static ESLVal probFun = new ESLVal(new Function(new ESLVal("probFun"),null) { public ESLVal apply(ESLVal... args) { return probFun(args[0]); }});
  private static ESLVal ppJFun(ESLVal indent,ESLVal dynamics,ESLVal n,ESLVal args,ESLVal t,ESLVal body) {
    
    {ESLVal freeDynamics = dynamicVarsJCommand(body);
      ESLVal argNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v42 = $qualArg;
              
              switch(_v42.termName) {
              case "JDec": {ESLVal $448 = _v42.termRef(0);
                ESLVal $447 = _v42.termRef(1);
                
                {ESLVal _v84 = $448;
                
                {ESLVal _v85 = $447;
                
                return ESLVal.list(ESLVal.list(_v84));
              }
              }
              }
              default: {ESLVal _0 = _v42;
                
                return $nil;
              }
            }
            }
          }
        }).map(args).flatten().flatten();
      
      {ESLVal boundDynamics = new SerializableFunction<ESLVal,ESLVal>() {
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
      
      return new ESLVal("new ESLVal(new Function(").add(ppJExp(indent,dynamics,n).add(new ESLVal(",getSelf()) {").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal apply(ESLVal... $args) {").add(nl(indent.add(new ESLVal(4))).add(ppFunArgs(indent,$zero,args,boundDynamics).add(ppJCommand(indent.add(new ESLVal(4)),boundDynamics.add(new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal n = $l0.head();
            $l0 = $l0.tail();
            if(member.apply(n,removeAll(boundDynamics,argNames)).not().boolVal) {$v.add(n);
      }
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(dynamics)),body).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("}").add(nl(indent).add(new ESLVal("})"))))))))))));
    }
    }
  }
  private static ESLVal ppJFun = new ESLVal(new Function(new ESLVal("ppJFun"),null) { public ESLVal apply(ESLVal... args) { return ppJFun(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal ppFunArgs(ESLVal indent,ESLVal i,ESLVal args,ESLVal dynamicArgs) {
    
    {ESLVal _v43 = args;
      
      if(_v43.isCons())
      {ESLVal $449 = _v43.head();
        ESLVal $450 = _v43.tail();
        
        switch($449.termName) {
        case "JDec": {ESLVal $452 = $449.termRef(0);
          ESLVal $451 = $449.termRef(1);
          
          {ESLVal n = $452;
          
          {ESLVal t = $451;
          
          {ESLVal _v80 = $450;
          
          if(member.apply(n,dynamicArgs).boolVal)
          return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{$args[").add(i.add(new ESLVal("]};").add(nl(indent).add(ppFunArgs(indent,i.add($one),_v80,dynamicArgs)))))));
          else
            {ESLVal _v81 = $452;
              
              {ESLVal _v82 = $451;
              
              {ESLVal _v83 = $450;
              
              return new ESLVal("ESLVal ").add(_v81.add(new ESLVal(" = $args[").add(i.add(new ESLVal("];").add(nl(indent).add(ppFunArgs(indent,i.add($one),_v83,dynamicArgs)))))));
            }
            }
            }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(28846,29240)").add(ESLVal.list(_v43)));
      }
      }
    else if(_v43.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(28846,29240)").add(ESLVal.list(_v43)));
    }
  }
  private static ESLVal ppFunArgs = new ESLVal(new Function(new ESLVal("ppFunArgs"),null) { public ESLVal apply(ESLVal... args) { return ppFunArgs(args[0],args[1],args[2],args[3]); }});
  private static ESLVal ppJCommand(ESLVal indent,ESLVal dynamics,ESLVal c) {
    
    {ESLVal _v44 = c;
      
      switch(_v44.termName) {
      case "JIfCommand": {ESLVal $488 = _v44.termRef(0);
        ESLVal $487 = _v44.termRef(1);
        ESLVal $486 = _v44.termRef(2);
        
        {ESLVal e = $488;
        
        {ESLVal c1 = $487;
        
        {ESLVal c2 = $486;
        
        return new ESLVal("if(").add(ppJExp(indent,dynamics,e).add(new ESLVal(".boolVal)").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,c1).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("else").add(nl(indent.add(new ESLVal(4))).add(ppJCommand(indent.add(new ESLVal(4)),dynamics,c2)))))))));
      }
      }
      }
      }
    case "JReturn": {ESLVal $483 = _v44.termRef(0);
        
        switch($483.termName) {
        case "JCommandExp": {ESLVal $485 = $483.termRef(0);
          ESLVal $484 = $483.termRef(1);
          
          {ESLVal _v78 = $485;
          
          {ESLVal t = $484;
          
          return ppJCommand(indent,dynamics,_v78);
        }
        }
        }
        default: {ESLVal e = $483;
          
          return new ESLVal("return ").add(ppJExp(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";")));
        }
      }
      }
    case "JCaseList": {ESLVal $482 = _v44.termRef(0);
        ESLVal $481 = _v44.termRef(1);
        ESLVal $480 = _v44.termRef(2);
        ESLVal $479 = _v44.termRef(3);
        
        {ESLVal l = $482;
        
        {ESLVal cons = $481;
        
        {ESLVal nil = $480;
        
        {ESLVal alt = $479;
        
        return new ESLVal("if(").add(ppJExp(indent,dynamics,l).add(new ESLVal(".isCons())").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,cons).add(nl(indent).add(new ESLVal("else if(").add(ppJExp(indent,dynamics,l).add(new ESLVal(".isNil())").add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent.add(new ESLVal(2)),dynamics,nil).add(nl(indent).add(new ESLVal("else ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,alt))))))))))))));
      }
      }
      }
      }
      }
    case "JCaseTerm": {ESLVal $478 = _v44.termRef(0);
        ESLVal $477 = _v44.termRef(1);
        ESLVal $476 = _v44.termRef(2);
        
        {ESLVal e = $478;
        
        {ESLVal arms = $477;
        
        {ESLVal alt = $476;
        
        return new ESLVal("switch(").add(ppJExp(indent,dynamics,e).add(new ESLVal(".termName) {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v52 = $qualArg;
              
              switch(_v52.termName) {
              case "JTArm": {ESLVal $509 = _v52.termRef(0);
                ESLVal $508 = _v52.termRef(1);
                ESLVal $507 = _v52.termRef(2);
                
                {ESLVal n = $509;
                
                {ESLVal i = $508;
                
                {ESLVal _v77 = $507;
                
                return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,_v77))))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v52;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten()).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
    case "JCaseInt": {ESLVal $475 = _v44.termRef(0);
        ESLVal $474 = _v44.termRef(1);
        ESLVal $473 = _v44.termRef(2);
        
        {ESLVal e = $475;
        
        {ESLVal arms = $474;
        
        {ESLVal alt = $473;
        
        return new ESLVal("switch(").add(ppJExp(indent,dynamics,e).add(new ESLVal(".intVal) {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v51 = $qualArg;
              
              switch(_v51.termName) {
              case "JIArm": {ESLVal $506 = _v51.termRef(0);
                ESLVal $505 = _v51.termRef(1);
                
                {ESLVal n = $506;
                
                {ESLVal _v76 = $505;
                
                return ESLVal.list(ESLVal.list(new ESLVal("case ").add(n.add(new ESLVal(": ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,_v76))))));
              }
              }
              }
              default: {ESLVal _0 = _v51;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten()).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
    case "JCaseStr": {ESLVal $472 = _v44.termRef(0);
        ESLVal $471 = _v44.termRef(1);
        ESLVal $470 = _v44.termRef(2);
        
        {ESLVal e = $472;
        
        {ESLVal arms = $471;
        
        {ESLVal alt = $470;
        
        return new ESLVal("switch(").add(ppJExp(indent,dynamics,e).add(new ESLVal(".strVal) {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v50 = $qualArg;
              
              switch(_v50.termName) {
              case "JSArm": {ESLVal $504 = _v50.termRef(0);
                ESLVal $503 = _v50.termRef(1);
                
                {ESLVal s = $504;
                
                {ESLVal _v75 = $503;
                
                return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(s.add(new ESLVal("\": ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,_v75))))));
              }
              }
              }
              default: {ESLVal _0 = _v50;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten()).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
    case "JCaseBool": {ESLVal $469 = _v44.termRef(0);
        ESLVal $468 = _v44.termRef(1);
        ESLVal $467 = _v44.termRef(2);
        
        {ESLVal e = $469;
        
        {ESLVal arms = $468;
        
        {ESLVal alt = $467;
        
        return new ESLVal("switch(").add(ppJExp(indent,dynamics,e).add(new ESLVal(".boolVal ? 1 : 0) {").add(nl(indent.add(new ESLVal(2))).add(ppJoin(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v49 = $qualArg;
              
              switch(_v49.termName) {
              case "JBArm": {ESLVal $502 = _v49.termRef(0);
                ESLVal $501 = _v49.termRef(1);
                
                {ESLVal b = $502;
                
                {ESLVal _v74 = $501;
                
                return ESLVal.list(ESLVal.list(new ESLVal("case ").add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  if(b.boolVal)
                    return $one;
                    else
                      return $zero;
                }}.get().add(new ESLVal(": ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,_v74))))));
              }
              }
              }
              default: {ESLVal _0 = _v49;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten()).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("default: ").add(ppJCommand(indent.add(new ESLVal(2)),dynamics,alt).add(nl(indent).add(new ESLVal("}"))))))))));
      }
      }
      }
      }
    case "JLet": {ESLVal $466 = _v44.termRef(0);
        ESLVal $465 = _v44.termRef(1);
        
        {ESLVal bs = $466;
        
        {ESLVal _v73 = $465;
        
        {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v48 = $qualArg;
                
                switch(_v48.termName) {
                case "JField": {ESLVal $500 = _v48.termRef(0);
                  ESLVal $499 = _v48.termRef(1);
                  ESLVal $498 = _v48.termRef(2);
                  
                  {ESLVal n = $500;
                  
                  {ESLVal t = $499;
                  
                  {ESLVal e = $498;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v48;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(bs).flatten().flatten();
        ESLVal dynamicVars = dynamicVarsJCommand(_v73);
        
        {ESLVal boundDynamicVars = filter(new ESLVal(new Function(new ESLVal("fun327"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return member.apply(s,dynamicVars);
            }
          }),boundVars);
        
        return new ESLVal("{").add(ppJFields(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent,dynamics.add(boundDynamicVars),_v73).add(nl(indent).add(new ESLVal("}"))))));
      }
      }
      }
      }
      }
    case "JLetRec": {ESLVal $464 = _v44.termRef(0);
        ESLVal $463 = _v44.termRef(1);
        
        {ESLVal bs = $464;
        
        {ESLVal _v72 = $463;
        
        return new ESLVal("{ LetRec letrec = new LetRec() {").add(nl(indent.add(new ESLVal(2))).add(ppJFields(indent.add(new ESLVal(2)),dynamics,bs).add(nl(indent.add(new ESLVal(2))).add(new ESLVal("public ESLVal get(String name) {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("switch(name) {").add(nl(indent.add(new ESLVal(6))).add(ppJoin(indent.add(new ESLVal(6)),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v46 = $qualArg;
              
              switch(_v46.termName) {
              case "JField": {ESLVal $494 = _v46.termRef(0);
                ESLVal $493 = _v46.termRef(1);
                ESLVal $492 = _v46.termRef(2);
                
                {ESLVal n = $494;
                
                {ESLVal t = $493;
                
                {ESLVal e = $492;
                
                return ESLVal.list(ESLVal.list(new ESLVal("case \"").add(n.add(new ESLVal("\": return ").add(n.add(new ESLVal(";").add(nl(indent.add(new ESLVal(6))))))))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v46;
                
                return $nil;
              }
            }
            }
          }
        }).map(bs).flatten().flatten()).add(nl(indent.add(new ESLVal(6))).add(new ESLVal("default: throw new Error(\"cannot find letrec binding\");").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("}").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("};").add(nl(indent).add(ppJoin(indent,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v47 = $qualArg;
              
              switch(_v47.termName) {
              case "JField": {ESLVal $497 = _v47.termRef(0);
                ESLVal $496 = _v47.termRef(1);
                ESLVal $495 = _v47.termRef(2);
                
                {ESLVal n = $497;
                
                {ESLVal t = $496;
                
                {ESLVal e = $495;
                
                return ESLVal.list(ESLVal.list(new ESLVal("ESLVal ").add(n.add(new ESLVal(" = letrec.get(\"").add(n.add(new ESLVal("\");").add(nl(indent))))))));
              }
              }
              }
              }
              default: {ESLVal _0 = _v47;
                
                return $nil;
              }
            }
            }
          }
        }).map(bs).flatten().flatten()).add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent,dynamics,_v72).add(new ESLVal("}").add(nl(indent)))))))))))))))))))))));
      }
      }
      }
    case "JPLet": {ESLVal $462 = _v44.termRef(0);
        ESLVal $461 = _v44.termRef(1);
        
        {ESLVal bs = $462;
        
        {ESLVal _v71 = $461;
        
        {ESLVal boundVars = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v45 = $qualArg;
                
                switch(_v45.termName) {
                case "JField": {ESLVal $491 = _v45.termRef(0);
                  ESLVal $490 = _v45.termRef(1);
                  ESLVal $489 = _v45.termRef(2);
                  
                  {ESLVal n = $491;
                  
                  {ESLVal t = $490;
                  
                  {ESLVal e = $489;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v45;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(bs).flatten().flatten();
        ESLVal dynamicVars = dynamicVarsJCommand(_v71);
        
        {ESLVal boundDynamicVars = filter(new ESLVal(new Function(new ESLVal("fun328"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return member.apply(s,dynamicVars);
            }
          }),boundVars);
        
        return new ESLVal("{").add(ppJParFields(indent.add(new ESLVal(2)),dynamics.add(boundDynamicVars),bs).add(nl(indent.add(new ESLVal(2))).add(ppJCommand(indent,dynamics.add(boundDynamicVars),_v71).add(nl(indent).add(new ESLVal("}"))))));
      }
      }
      }
      }
      }
    case "JBlock": {ESLVal $460 = _v44.termRef(0);
        
        {ESLVal cs = $460;
        
        return new ESLVal("{").add(ppJoin(indent,new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal c = $l0.head();
              $l0 = $l0.tail();
              $v.add(ppJCommand(indent,dynamics,c));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(cs)).add(new ESLVal("}")));
      }
      }
    case "JUpdate": {ESLVal $459 = _v44.termRef(0);
        ESLVal $458 = _v44.termRef(1);
        
        {ESLVal n = $459;
        
        {ESLVal e = $458;
        
        if(member.apply(n,dynamics).boolVal)
        return n.add(new ESLVal("[0] = ").add(ppJExp(indent,dynamics,e).add(new ESLVal(";"))));
        else
          {ESLVal _v69 = $459;
            
            {ESLVal _v70 = $458;
            
            return _v69.add(new ESLVal(" = ").add(ppJExp(indent,dynamics,_v70).add(new ESLVal(";"))));
          }
          }
      }
      }
      }
    case "JFor": {ESLVal $457 = _v44.termRef(0);
        ESLVal $456 = _v44.termRef(1);
        ESLVal $455 = _v44.termRef(2);
        ESLVal $454 = _v44.termRef(3);
        
        {ESLVal listName = $457;
        
        {ESLVal varName = $456;
        
        {ESLVal e = $455;
        
        {ESLVal _v68 = $454;
        
        return new ESLVal("{").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("ESLVal ").add(listName.add(new ESLVal(" = ").add(ppJExp(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal(";").add(nl(indent.add(new ESLVal(2))).add(new ESLVal("while(").add(listName.add(new ESLVal(".isCons()) {").add(nl(indent.add(new ESLVal(4))).add(new ESLVal("ESLVal ").add(varName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".headVal;").add(nl(indent.add(new ESLVal(4))).add(ppJCommand(indent.add(new ESLVal(4)),dynamics,_v68).add(nl(indent.add(new ESLVal(4))).add(listName.add(new ESLVal(" = ").add(listName.add(new ESLVal(".tailVal;").add(new ESLVal("}").add(nl(indent).add(new ESLVal("}")))))))))))))))))))))))))));
      }
      }
      }
      }
      }
    case "JStatement": {ESLVal $453 = _v44.termRef(0);
        
        {ESLVal e = $453;
        
        return ppJExp(indent,dynamics,e).add(new ESLVal(";"));
      }
      }
      default: {ESLVal _v79 = _v44;
        
        return new ESLVal("******* unknown command: ").add(_v79);
      }
    }
    }
  }
  private static ESLVal ppJCommand = new ESLVal(new Function(new ESLVal("ppJCommand"),null) { public ESLVal apply(ESLVal... args) { return ppJCommand(args[0],args[1],args[2]); }});
  private static ESLVal ppJParFields(ESLVal indent,ESLVal dynamics,ESLVal bs) {
    
    { LetRec letrec = new LetRec() {
      ESLVal vals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v53 = $qualArg;
              
              switch(_v53.termName) {
              case "JField": {ESLVal $512 = _v53.termRef(0);
                ESLVal $511 = _v53.termRef(1);
                ESLVal $510 = _v53.termRef(2);
                
                {ESLVal n = $512;
                
                {ESLVal t = $511;
                
                {ESLVal e = $510;
                
                return ESLVal.list(ESLVal.list(e));
              }
              }
              }
              }
              default: {ESLVal _0 = _v53;
                
                return $nil;
              }
            }
            }
          }
        }).map(bs).flatten().flatten();
      ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v54 = $qualArg;
              
              switch(_v54.termName) {
              case "JField": {ESLVal $515 = _v54.termRef(0);
                ESLVal $514 = _v54.termRef(1);
                ESLVal $513 = _v54.termRef(2);
                
                {ESLVal n = $515;
                
                {ESLVal t = $514;
                
                {ESLVal e = $513;
                
                return ESLVal.list(ESLVal.list(n));
              }
              }
              }
              }
              default: {ESLVal _0 = _v54;
                
                return $nil;
              }
            }
            }
          }
        }).map(bs).flatten().flatten();
      ESLVal doVals = new ESLVal(new Function(new ESLVal("doVals"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal vals = $args[0];
        {ESLVal _v55 = vals;
              
              if(_v55.isCons())
              {ESLVal $516 = _v55.head();
                ESLVal $517 = _v55.tail();
                
                if($517.isCons())
                {ESLVal $518 = $517.head();
                  ESLVal $519 = $517.tail();
                  
                  {ESLVal v = $516;
                  
                  {ESLVal vs = $517;
                  
                  return new ESLVal("new SerializableSupplier<ESLVal>() { public ESLVal get() { return ").add(ppJExp(indent,dynamics,v).add(new ESLVal("; }},").add(doVals.apply(vs))));
                }
                }
                }
              else if($517.isNil())
                {ESLVal v = $516;
                  
                  return new ESLVal("new SerializableSupplier<ESLVal>() { public ESLVal get() { return ").add(ppJExp(indent,dynamics,v).add(new ESLVal("; }}")));
                }
              else {ESLVal v = $516;
                  
                  {ESLVal vs = $517;
                  
                  return new ESLVal("new SerializableSupplier<ESLVal>() { public ESLVal get() { return ").add(ppJExp(indent,dynamics,v).add(new ESLVal("; }},").add(doVals.apply(vs))));
                }
                }
              }
            else if(_v55.isNil())
              return new ESLVal("");
            else return error(new ESLVal("case error at Pos(34361,34657)").add(ESLVal.list(_v55)));
            }
          }
        });
      ESLVal bindNames = new ESLVal(new Function(new ESLVal("bindNames"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal ns = $args[0];
        ESLVal i = $args[1];
        {ESLVal _v56 = ns;
              
              if(_v56.isCons())
              {ESLVal $520 = _v56.head();
                ESLVal $521 = _v56.tail();
                
                {ESLVal n = $520;
                
                {ESLVal _v65 = $521;
                
                if(member.apply(n,dynamics).boolVal)
                return new ESLVal("ESLVal[] ").add(n.add(new ESLVal("= new ESLVal[]{$p[").add(i.add(new ESLVal("]};").add(nl(indent).add(bindNames.apply(_v65,i.add($one))))))));
                else
                  {ESLVal _v66 = $520;
                    
                    {ESLVal _v67 = $521;
                    
                    return new ESLVal("ESLVal ").add(_v66.add(new ESLVal("= $p[").add(i.add(new ESLVal("];").add(nl(indent).add(bindNames.apply(_v67,i.add($one))))))));
                  }
                  }
              }
              }
              }
            else if(_v56.isNil())
              return new ESLVal("");
            else return error(new ESLVal("case error at Pos(34703,34953)").add(ESLVal.list(_v56)));
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
    
      return new ESLVal("ESLVal[] $p = plet(new SerializableSupplier[]{").add(doVals.apply(vals).add(new ESLVal("});").add(nl(indent).add(bindNames.apply(names,$zero)))));}
    
  }
  private static ESLVal ppJParFields = new ESLVal(new Function(new ESLVal("ppJParFields"),null) { public ESLVal apply(ESLVal... args) { return ppJParFields(args[0],args[1],args[2]); }});
  private static ESLVal ppJFields(ESLVal indent,ESLVal dynamics,ESLVal bs) {
    
    {ESLVal _v57 = bs;
      
      if(_v57.isCons())
      {ESLVal $522 = _v57.head();
        ESLVal $523 = _v57.tail();
        
        {ESLVal f = $522;
        
        {ESLVal _v64 = $523;
        
        return ppFieldDef(indent,dynamics,f).add(nl(indent).add(ppJFields(indent,dynamics,_v64)));
      }
      }
      }
    else if(_v57.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(35134,35284)").add(ESLVal.list(_v57)));
    }
  }
  private static ESLVal ppJFields = new ESLVal(new Function(new ESLVal("ppJFields"),null) { public ESLVal apply(ESLVal... args) { return ppJFields(args[0],args[1],args[2]); }});
  private static ESLVal ppFieldDef(ESLVal indent,ESLVal dynamics,ESLVal f) {
    
    {ESLVal _v58 = f;
      
      switch(_v58.termName) {
      case "JField": {ESLVal $526 = _v58.termRef(0);
        ESLVal $525 = _v58.termRef(1);
        ESLVal $524 = _v58.termRef(2);
        
        {ESLVal n = $526;
        
        {ESLVal t = $525;
        
        {ESLVal e = $524;
        
        if(member.apply(n,dynamics).boolVal)
        return new ESLVal("ESLVal[] ").add(n.add(new ESLVal(" = new ESLVal[]{").add(ppJExp(indent.add(new ESLVal(2)),dynamics,e).add(new ESLVal("};")))));
        else
          {ESLVal _v61 = $526;
            
            {ESLVal _v62 = $525;
            
            {ESLVal _v63 = $524;
            
            return new ESLVal("ESLVal ").add(_v61.add(new ESLVal(" = ").add(ppJExp(indent.add(new ESLVal(2)),dynamics,_v63).add(new ESLVal(";")))));
          }
          }
          }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(35351,35605)").add(ESLVal.list(_v58)));
    }
    }
  }
  private static ESLVal ppFieldDef = new ESLVal(new Function(new ESLVal("ppFieldDef"),null) { public ESLVal apply(ESLVal... args) { return ppFieldDef(args[0],args[1],args[2]); }});
  private static ESLVal ppJListExp(ESLVal indent,ESLVal dynamics,ESLVal t,ESLVal es) {
    
    return new ESLVal("ESLVal.list(").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
  }
  private static ESLVal ppJListExp = new ESLVal(new Function(new ESLVal("ppJListExp"),null) { public ESLVal apply(ESLVal... args) { return ppJListExp(args[0],args[1],args[2],args[3]); }});
  private static ESLVal ppJSetExp(ESLVal indent,ESLVal dynamics,ESLVal t,ESLVal es) {
    
    return new ESLVal("ESLVal.set(").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
  }
  private static ESLVal ppJSetExp = new ESLVal(new Function(new ESLVal("ppJSetExp"),null) { public ESLVal apply(ESLVal... args) { return ppJSetExp(args[0],args[1],args[2],args[3]); }});
  private static ESLVal ppJBagExp(ESLVal indent,ESLVal dynamics,ESLVal t,ESLVal es) {
    
    return new ESLVal("ESLVal.bag(").add(ppJExps(indent,dynamics,es,new ESLVal(",")).add(new ESLVal(")")));
  }
  private static ESLVal ppJBagExp = new ESLVal(new Function(new ESLVal("ppJBagExp"),null) { public ESLVal apply(ESLVal... args) { return ppJBagExp(args[0],args[1],args[2],args[3]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}