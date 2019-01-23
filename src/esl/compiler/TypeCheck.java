package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.Tables.*;
import static esl.Displays.*;
import static esl.compiler.UnusedVars.*;
import static esl.compiler.Warnings.*;
import static esl.compiler.Strings.*;
import static esl.compiler.Info.*;
public class TypeCheck {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal p0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal actType0 = new ESLVal("ActType",p0,$nil,$nil);
  private static ESLVal contentType = new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("RawText"),ESLVal.list(new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("ESLSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("JavaSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0)))));
  private static ESLVal editMessage = new ESLVal("MessageType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Edit"),ESLVal.list(contentType))));
  private static ESLVal env0 = ESLVal.list(new ESLVal("Map",new ESLVal("edb"),new ESLVal("ActType",p0,ESLVal.list(new ESLVal("Dec",p0,new ESLVal("button"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("FunType",p0,$nil,new ESLVal("VoidType",p0))),new ESLVal("VoidType",p0)),$null),new ESLVal("Dec",p0,new ESLVal("display"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VarType",p0,new ESLVal("T")))),$null)),ESLVal.list(editMessage))),new ESLVal("Map",new ESLVal("kill"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("print"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("parse"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))),new ESLVal("Map",new ESLVal("random"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("IntType",p0))),new ESLVal("Map",new ESLVal("wait"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("stopAll"),new ESLVal("FunType",p0,$nil,new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("isqrt"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("FloatType",p0))),new ESLVal("Map",new ESLVal("round"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("FloatType",p0)),new ESLVal("IntType",p0))),new ESLVal("Map",new ESLVal("builtin"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("IntType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))));
  private static ESLVal cnstrEnv0 = ESLVal.list(new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))));
  private static ESLVal tenv0 = ESLVal.list(new ESLVal("Map",new ESLVal("EditType"),contentType),new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))),new ESLVal("Map",new ESLVal("Point"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Point"),ESLVal.list(new ESLVal("IntType",p0),new ESLVal("IntType",p0)))))));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v142 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v142)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {new Function(new ESLVal("try"),getSelf()) {
                  public ESLVal apply(ESLVal... args) { 
                    try { 
                      return typeCheckModule(new ESLVal("esl/compiler/test1.esl"));
                    } catch(ESLError $exception) {
                      ESLVal $x = $exception.value;
                      {ESLVal _v141 = $x;
                  
                  {ESLVal message = _v141;
                  
                  return print.apply(new ESLVal("Type Error: ").add(message));
                }
                }
                    }
                  }
                }.apply();
                print.apply(new ESLVal("DONE"));
                return stopAll.apply();}
              }}.get();
          }
        });
    }
  });
private static ESLVal ppPattern(ESLVal p) {
    
    {ESLVal _v1 = p;
      
      switch(_v1.termName) {
      case "PAdd": {ESLVal $33 = _v1.termRef(0);
        ESLVal $32 = _v1.termRef(1);
        ESLVal $31 = _v1.termRef(2);
        
        {ESLVal l = $33;
        
        {ESLVal p1 = $32;
        
        {ESLVal p2 = $31;
        
        return ppPattern(p1).add(new ESLVal(" + ").add(ppPattern(p2)));
      }
      }
      }
      }
    case "PVar": {ESLVal $30 = _v1.termRef(0);
        ESLVal $29 = _v1.termRef(1);
        ESLVal $28 = _v1.termRef(2);
        
        {ESLVal l = $30;
        
        {ESLVal n = $29;
        
        {ESLVal t = $28;
        
        return n;
      }
      }
      }
      }
    case "PTerm": {ESLVal $25 = _v1.termRef(0);
        ESLVal $24 = _v1.termRef(1);
        ESLVal $23 = _v1.termRef(2);
        ESLVal $22 = _v1.termRef(3);
        
        if($23.isCons())
        {ESLVal $26 = $23.head();
          ESLVal $27 = $23.tail();
          
          {ESLVal l = $25;
          
          {ESLVal n = $24;
          
          {ESLVal ts = $23;
          
          {ESLVal ps = $22;
          
          return n.add(ppTypes(ts,$nil).add(new ESLVal("").add(ppPatterns(ps))));
        }
        }
        }
        }
        }
      else if($23.isNil())
        {ESLVal l = $25;
          
          {ESLVal n = $24;
          
          {ESLVal ps = $22;
          
          return n.add(ppPatterns(ps));
        }
        }
        }
      else {ESLVal l = $25;
          
          {ESLVal n = $24;
          
          {ESLVal ts = $23;
          
          {ESLVal ps = $22;
          
          return n.add(ppTypes(ts,$nil).add(new ESLVal("").add(ppPatterns(ps))));
        }
        }
        }
        }
      }
    case "PApplyType": {ESLVal $21 = _v1.termRef(0);
        ESLVal $20 = _v1.termRef(1);
        ESLVal $19 = _v1.termRef(2);
        
        {ESLVal l = $21;
        
        {ESLVal _v592 = $20;
        
        {ESLVal ts = $19;
        
        return ppPattern(_v592).add(ppTypes(ts,$nil));
      }
      }
      }
      }
    case "PNil": {ESLVal $18 = _v1.termRef(0);
        
        {ESLVal l = $18;
        
        return new ESLVal("[]");
      }
      }
    case "PEmptySet": {ESLVal $17 = _v1.termRef(0);
        
        {ESLVal l = $17;
        
        return new ESLVal("Set{}");
      }
      }
    case "PEmptyBag": {ESLVal $16 = _v1.termRef(0);
        
        {ESLVal l = $16;
        
        return new ESLVal("Bag{}");
      }
      }
    case "PInt": {ESLVal $15 = _v1.termRef(0);
        ESLVal $14 = _v1.termRef(1);
        
        {ESLVal l = $15;
        
        {ESLVal n = $14;
        
        return new ESLVal("").add(n);
      }
      }
      }
    case "PBool": {ESLVal $13 = _v1.termRef(0);
        ESLVal $12 = _v1.termRef(1);
        
        {ESLVal l = $13;
        
        {ESLVal b = $12;
        
        return new ESLVal("").add(b);
      }
      }
      }
    case "PStr": {ESLVal $11 = _v1.termRef(0);
        ESLVal $10 = _v1.termRef(1);
        
        {ESLVal l = $11;
        
        {ESLVal s = $10;
        
        return s;
      }
      }
      }
    case "PCons": {ESLVal $9 = _v1.termRef(0);
        ESLVal $8 = _v1.termRef(1);
        ESLVal $7 = _v1.termRef(2);
        
        {ESLVal l = $9;
        
        {ESLVal h = $8;
        
        {ESLVal t = $7;
        
        return ppPattern(h).add(new ESLVal(":").add(ppPattern(t)));
      }
      }
      }
      }
    case "PSetCons": {ESLVal $6 = _v1.termRef(0);
        ESLVal $5 = _v1.termRef(1);
        ESLVal $4 = _v1.termRef(2);
        
        {ESLVal l = $6;
        
        {ESLVal p1 = $5;
        
        {ESLVal p2 = $4;
        
        return new ESLVal("Set{").add(ppPattern(p1).add(new ESLVal(" | ").add(ppPattern(p2).add(new ESLVal("}")))));
      }
      }
      }
      }
    case "PBagCons": {ESLVal $3 = _v1.termRef(0);
        ESLVal $2 = _v1.termRef(1);
        ESLVal $1 = _v1.termRef(2);
        
        {ESLVal l = $3;
        
        {ESLVal p1 = $2;
        
        {ESLVal p2 = $1;
        
        return new ESLVal("Bag{").add(ppPattern(p1).add(new ESLVal(" | ").add(ppPattern(p2).add(new ESLVal("}")))));
      }
      }
      }
      }
      default: {ESLVal _v593 = _v1;
        
        return new ESLVal("<unknown: ").add(_v593.add(new ESLVal(">")));
      }
    }
    }
  }
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),null) { public ESLVal apply(ESLVal... args) { return ppPattern(args[0]); }});
  private static ESLVal ppPatterns(ESLVal ps) {
    
    return map(ppPattern,ps);
  }
  private static ESLVal ppPatterns = new ESLVal(new Function(new ESLVal("ppPatterns"),null) { public ESLVal apply(ESLVal... args) { return ppPatterns(args[0]); }});
  private static ESLVal ppTypeEnv(ESLVal env) {
    
    {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
      
      {{
      ESLVal _v4 = env;
      while(_v4.isCons()) {
        ESLVal _v3 = _v4.headVal;
        {ESLVal _v2 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal _v5 = _v3;
                  
                  switch(_v5.termName) {
                  case "Map": {ESLVal $35 = _v5.termRef(0);
                    ESLVal $34 = _v5.termRef(1);
                    
                    {ESLVal n = $35;
                    
                    {ESLVal t = $34;
                    
                    {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType(t,env).add(new ESLVal(",")))));
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
  private static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),null) { public ESLVal apply(ESLVal... args) { return ppTypeEnv(args[0]); }});
  private static ESLVal ppTypes(ESLVal ts,ESLVal env) {
    
    return map(ppType0(env),ts);
  }
  private static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),null) { public ESLVal apply(ESLVal... args) { return ppTypes(args[0],args[1]); }});
  private static ESLVal getTypeName(ESLVal t0,ESLVal env) {
    
    {ESLVal[] name = new ESLVal[]{$null};
      
      {{
      ESLVal _v8 = env;
      while(_v8.isCons()) {
        ESLVal _v7 = _v8.headVal;
        {ESLVal _v6 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal _v9 = _v7;
                  
                  switch(_v9.termName) {
                  case "Map": {ESLVal $37 = _v9.termRef(0);
                    ESLVal $36 = _v9.termRef(1);
                    
                    {ESLVal n = $37;
                    
                    {ESLVal t = $36;
                    
                    if(typeEqual(t0,t).boolVal)
                    {name[0] = n;
                    return $null;}
                    else
                      return $null;
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
    return name[0];}
    }
  }
  private static ESLVal getTypeName = new ESLVal(new Function(new ESLVal("getTypeName"),null) { public ESLVal apply(ESLVal... args) { return getTypeName(args[0],args[1]); }});
  private static ESLVal ppType0(ESLVal env) {
    
    return new ESLVal(new Function(new ESLVal("fun171"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal t = $args[0];
      return ppType(t,env);
        }
      });
  }
  private static ESLVal ppType0 = new ESLVal(new Function(new ESLVal("ppType0"),null) { public ESLVal apply(ESLVal... args) { return ppType0(args[0]); }});
  private static ESLVal ppHandlers(ESLVal handlers,ESLVal env) {
    
    {ESLVal _v10 = handlers;
      
      if(_v10.isCons())
      {ESLVal $38 = _v10.head();
        ESLVal $39 = _v10.tail();
        
        switch($38.termName) {
        case "MessageType": {ESLVal $41 = $38.termRef(0);
          ESLVal $40 = $38.termRef(1);
          
          if($40.isCons())
          {ESLVal $42 = $40.head();
            ESLVal $43 = $40.tail();
            
            {ESLVal l = $41;
            
            {ESLVal t = $42;
            
            {ESLVal ts = $43;
            
            {ESLVal hs = $39;
            
            return ppType(t,env).add(new ESLVal("; ").add(ppHandlers(hs,env)));
          }
          }
          }
          }
          }
        else if($40.isNil())
          return error(new ESLVal("case error at Pos(5559,5693)").add(ESLVal.list(_v10)));
        else return error(new ESLVal("case error at Pos(5559,5693)").add(ESLVal.list(_v10)));
        }
        default: return error(new ESLVal("case error at Pos(5559,5693)").add(ESLVal.list(_v10)));
      }
      }
    else if(_v10.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(5559,5693)").add(ESLVal.list(_v10)));
    }
  }
  private static ESLVal ppHandlers = new ESLVal(new Function(new ESLVal("ppHandlers"),null) { public ESLVal apply(ESLVal... args) { return ppHandlers(args[0],args[1]); }});
  private static ESLVal ppDecs(ESLVal decs,ESLVal env) {
    
    {ESLVal _v11 = decs;
      
      if(_v11.isCons())
      {ESLVal $44 = _v11.head();
        ESLVal $45 = _v11.tail();
        
        switch($44.termName) {
        case "Dec": {ESLVal $49 = $44.termRef(0);
          ESLVal $48 = $44.termRef(1);
          ESLVal $47 = $44.termRef(2);
          ESLVal $46 = $44.termRef(3);
          
          {ESLVal l = $49;
          
          {ESLVal n = $48;
          
          {ESLVal t = $47;
          
          {ESLVal d = $46;
          
          {ESLVal _v591 = $45;
          
          return n.add(new ESLVal("::").add(ppType(t,env).add(new ESLVal("; ").add(ppDecs(_v591,env)))));
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5734,5848)").add(ESLVal.list(_v11)));
      }
      }
    else if(_v11.isNil())
      return new ESLVal("");
    else return error(new ESLVal("case error at Pos(5734,5848)").add(ESLVal.list(_v11)));
    }
  }
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),null) { public ESLVal apply(ESLVal... args) { return ppDecs(args[0],args[1]); }});
  private static ESLVal ppType(ESLVal t,ESLVal env) {
    
    if(getTypeName(t,env).neql($null).boolVal)
      return getTypeName(t,env);
      else
        {ESLVal _v12 = t;
          
          switch(_v12.termName) {
          case "ActType": {ESLVal $119 = _v12.termRef(0);
            ESLVal $118 = _v12.termRef(1);
            ESLVal $117 = _v12.termRef(2);
            
            {ESLVal l = $119;
            
            {ESLVal decs = $118;
            
            {ESLVal handlers = $117;
            
            return new ESLVal("Act { ").add(ppHandlers(handlers,env).add(new ESLVal(" }")));
          }
          }
          }
          }
        case "ApplyType": {ESLVal $116 = _v12.termRef(0);
            ESLVal $115 = _v12.termRef(1);
            ESLVal $114 = _v12.termRef(2);
            
            {ESLVal l = $116;
            
            {ESLVal n = $115;
            
            {ESLVal args = $114;
            
            return n.add(map(ppType0(env),args));
          }
          }
          }
          }
        case "ApplyTypeFun": {ESLVal $113 = _v12.termRef(0);
            ESLVal $112 = _v12.termRef(1);
            ESLVal $111 = _v12.termRef(2);
            
            {ESLVal l = $113;
            
            {ESLVal op = $112;
            
            {ESLVal args = $111;
            
            return ppType(op,env).add(map(ppType0(env),args));
          }
          }
          }
          }
        case "ArrayType": {ESLVal $110 = _v12.termRef(0);
            ESLVal $109 = _v12.termRef(1);
            
            {ESLVal l = $110;
            
            {ESLVal _v590 = $109;
            
            return new ESLVal("Array[").add(ppType(_v590,env).add(new ESLVal("]")));
          }
          }
          }
        case "BagType": {ESLVal $108 = _v12.termRef(0);
            ESLVal $107 = _v12.termRef(1);
            
            {ESLVal l = $108;
            
            {ESLVal _v589 = $107;
            
            return new ESLVal("Set{").add(ppType(_v589,env).add(new ESLVal("}")));
          }
          }
          }
        case "BoolType": {ESLVal $106 = _v12.termRef(0);
            
            {ESLVal l = $106;
            
            return new ESLVal("Bool");
          }
          }
        case "ExtendedAct": {ESLVal $105 = _v12.termRef(0);
            ESLVal $104 = _v12.termRef(1);
            ESLVal $103 = _v12.termRef(2);
            ESLVal $102 = _v12.termRef(3);
            
            {ESLVal l = $105;
            
            {ESLVal parent = $104;
            
            {ESLVal decs = $103;
            
            {ESLVal handlers = $102;
            
            return new ESLVal("Act extends ").add(ppType(parent,env).add(new ESLVal(" { ").add(ppHandlers(handlers,env).add(new ESLVal(" }")))));
          }
          }
          }
          }
          }
        case "FloatType": {ESLVal $101 = _v12.termRef(0);
            
            {ESLVal l = $101;
            
            return new ESLVal("Float");
          }
          }
        case "FieldType": {ESLVal $100 = _v12.termRef(0);
            ESLVal $99 = _v12.termRef(1);
            ESLVal $98 = _v12.termRef(2);
            
            {ESLVal l = $100;
            
            {ESLVal n = $99;
            
            {ESLVal _v588 = $98;
            
            return n.add(new ESLVal("::").add(ppType(_v588,env)));
          }
          }
          }
          }
        case "ForallType": {ESLVal $97 = _v12.termRef(0);
            ESLVal $96 = _v12.termRef(1);
            ESLVal $95 = _v12.termRef(2);
            
            {ESLVal l = $97;
            
            {ESLVal ns = $96;
            
            {ESLVal _v587 = $95;
            
            return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType(_v587,env))));
          }
          }
          }
          }
        case "FunType": {ESLVal $94 = _v12.termRef(0);
            ESLVal $93 = _v12.termRef(1);
            ESLVal $92 = _v12.termRef(2);
            
            {ESLVal l = $94;
            
            {ESLVal d = $93;
            
            {ESLVal r = $92;
            
            return map(ppType0(env),d).add(new ESLVal("->").add(ppType(r,env)));
          }
          }
          }
          }
        case "TaggedFunType": {ESLVal $91 = _v12.termRef(0);
            ESLVal $90 = _v12.termRef(1);
            ESLVal $89 = _v12.termRef(2);
            ESLVal $88 = _v12.termRef(3);
            
            {ESLVal l = $91;
            
            {ESLVal d = $90;
            
            {ESLVal p = $89;
            
            {ESLVal r = $88;
            
            return map(ppType0(env),d).add(new ESLVal("->").add(ppType(r,env)));
          }
          }
          }
          }
          }
        case "IntType": {ESLVal $87 = _v12.termRef(0);
            
            {ESLVal l = $87;
            
            return new ESLVal("Int");
          }
          }
        case "ListType": {ESLVal $86 = _v12.termRef(0);
            ESLVal $85 = _v12.termRef(1);
            
            {ESLVal l = $86;
            
            {ESLVal _v586 = $85;
            
            return new ESLVal("[").add(ppType(_v586,env).add(new ESLVal("]")));
          }
          }
          }
        case "NullType": {ESLVal $84 = _v12.termRef(0);
            
            {ESLVal l = $84;
            
            return new ESLVal("Null");
          }
          }
        case "ObserverType": {ESLVal $83 = _v12.termRef(0);
            ESLVal $82 = _v12.termRef(1);
            ESLVal $81 = _v12.termRef(2);
            
            {ESLVal l = $83;
            
            {ESLVal s = $82;
            
            {ESLVal m = $81;
            
            return new ESLVal("Observer[").add(ppType(s,env).add(new ESLVal(",").add(ppType(m,env).add(new ESLVal("]")))));
          }
          }
          }
          }
        case "ObservedType": {ESLVal $80 = _v12.termRef(0);
            ESLVal $79 = _v12.termRef(1);
            ESLVal $78 = _v12.termRef(2);
            
            {ESLVal l = $80;
            
            {ESLVal s = $79;
            
            {ESLVal m = $78;
            
            return new ESLVal("Observed[").add(ppType(s,env).add(new ESLVal(",").add(ppType(m,env).add(new ESLVal("]")))));
          }
          }
          }
          }
        case "RecType": {ESLVal $77 = _v12.termRef(0);
            ESLVal $76 = _v12.termRef(1);
            ESLVal $75 = _v12.termRef(2);
            
            {ESLVal l = $77;
            
            {ESLVal n = $76;
            
            {ESLVal _v585 = $75;
            
            return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType(_v585,env))));
          }
          }
          }
          }
        case "RecordType": {ESLVal $74 = _v12.termRef(0);
            ESLVal $73 = _v12.termRef(1);
            
            {ESLVal l = $74;
            
            {ESLVal fs = $73;
            
            return new ESLVal("{").add(ppDecs(fs,env).add(new ESLVal("}")));
          }
          }
          }
        case "SetType": {ESLVal $72 = _v12.termRef(0);
            ESLVal $71 = _v12.termRef(1);
            
            {ESLVal l = $72;
            
            {ESLVal _v584 = $71;
            
            return new ESLVal("Set{").add(ppType(_v584,env).add(new ESLVal("}")));
          }
          }
          }
        case "StrType": {ESLVal $70 = _v12.termRef(0);
            
            {ESLVal l = $70;
            
            return new ESLVal("Str");
          }
          }
        case "TableType": {ESLVal $69 = _v12.termRef(0);
            ESLVal $68 = _v12.termRef(1);
            ESLVal $67 = _v12.termRef(2);
            
            {ESLVal l = $69;
            
            {ESLVal k = $68;
            
            {ESLVal v = $67;
            
            return new ESLVal("Hash[").add(ppType(k,env).add(new ESLVal(",").add(ppType(v,env).add(new ESLVal("]")))));
          }
          }
          }
          }
        case "TermType": {ESLVal $66 = _v12.termRef(0);
            ESLVal $65 = _v12.termRef(1);
            ESLVal $64 = _v12.termRef(2);
            
            {ESLVal l = $66;
            
            {ESLVal n = $65;
            
            {ESLVal ts = $64;
            
            return n.add(map(ppType0(env),ts));
          }
          }
          }
          }
        case "TypeFun": {ESLVal $63 = _v12.termRef(0);
            ESLVal $62 = _v12.termRef(1);
            ESLVal $61 = _v12.termRef(2);
            
            {ESLVal l = $63;
            
            {ESLVal ns = $62;
            
            {ESLVal _v583 = $61;
            
            return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType(_v583,env))));
          }
          }
          }
          }
        case "UnfoldType": {ESLVal $60 = _v12.termRef(0);
            ESLVal $59 = _v12.termRef(1);
            
            {ESLVal l = $60;
            
            {ESLVal _v582 = $59;
            
            return new ESLVal("unfold ").add(ppType(_v582,env));
          }
          }
          }
        case "UnionType": {ESLVal $58 = _v12.termRef(0);
            ESLVal $57 = _v12.termRef(1);
            
            {ESLVal l = $58;
            
            {ESLVal ts = $57;
            
            return new ESLVal("union ").add(map(ppType0(env),ts));
          }
          }
          }
        case "VarType": {ESLVal $56 = _v12.termRef(0);
            ESLVal $55 = _v12.termRef(1);
            
            {ESLVal l = $56;
            
            {ESLVal n = $55;
            
            return n;
          }
          }
          }
        case "VoidType": {ESLVal $54 = _v12.termRef(0);
            
            {ESLVal l = $54;
            
            return new ESLVal("Void");
          }
          }
        case "UnionRef": {ESLVal $53 = _v12.termRef(0);
            ESLVal $52 = _v12.termRef(1);
            ESLVal $51 = _v12.termRef(2);
            
            {ESLVal l = $53;
            
            {ESLVal _v581 = $52;
            
            {ESLVal n = $51;
            
            return ppType(_v581,env).add(new ESLVal(".").add(n));
          }
          }
          }
          }
        case "TypeClosure": {ESLVal $50 = _v12.termRef(0);
            
            {ESLVal f = $50;
            
            return f.add(new ESLVal(""));
          }
          }
          default: {ESLVal x = _v12;
            
            return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
          }
        }
        }
  }
  private static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),null) { public ESLVal apply(ESLVal... args) { return ppType(args[0],args[1]); }});
  private static ESLVal typeEnv(ESLVal defs) {
    
    {ESLVal _v13 = defs;
      
      if(_v13.isCons())
      {ESLVal $120 = _v13.head();
        ESLVal $121 = _v13.tail();
        
        switch($120.termName) {
        case "TypeBind": {ESLVal $129 = $120.termRef(0);
          ESLVal $128 = $120.termRef(1);
          ESLVal $127 = $120.termRef(2);
          ESLVal $126 = $120.termRef(3);
          
          {ESLVal l = $129;
          
          {ESLVal n = $128;
          
          {ESLVal t = $127;
          
          {ESLVal e = $126;
          
          {ESLVal ds = $121;
          
          return typeEnv(ds).cons(new ESLVal("Map",n,t));
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $125 = $120.termRef(0);
          ESLVal $124 = $120.termRef(1);
          ESLVal $123 = $120.termRef(2);
          ESLVal $122 = $120.termRef(3);
          
          {ESLVal l = $125;
          
          {ESLVal n = $124;
          
          {ESLVal t = $123;
          
          {ESLVal e = $122;
          
          {ESLVal ds = $121;
          
          return typeEnv(ds).cons(new ESLVal("Map",n,t));
        }
        }
        }
        }
        }
        }
        default: {ESLVal b = $120;
          
          {ESLVal ds = $121;
          
          return typeEnv(ds);
        }
        }
      }
      }
    else if(_v13.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(8122,8365)").add(ESLVal.list(_v13)));
    }
  }
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),null) { public ESLVal apply(ESLVal... args) { return typeEnv(args[0]); }});
  private static ESLVal cnstrEnv(ESLVal defs,ESLVal env) {
    
    {ESLVal _v14 = defs;
      
      if(_v14.isCons())
      {ESLVal $130 = _v14.head();
        ESLVal $131 = _v14.tail();
        
        switch($130.termName) {
        case "TypeBind": {ESLVal $139 = $130.termRef(0);
          ESLVal $138 = $130.termRef(1);
          ESLVal $137 = $130.termRef(2);
          ESLVal $136 = $130.termRef(3);
          
          switch($137.termName) {
          case "RecType": {ESLVal $144 = $137.termRef(0);
            ESLVal $143 = $137.termRef(1);
            ESLVal $142 = $137.termRef(2);
            
            switch($142.termName) {
            case "UnionType": {ESLVal $146 = $142.termRef(0);
              ESLVal $145 = $142.termRef(1);
              
              {ESLVal l = $139;
              
              {ESLVal n = $138;
              
              {ESLVal ll = $144;
              
              {ESLVal m = $143;
              
              {ESLVal lll = $146;
              
              {ESLVal ts = $145;
              
              {ESLVal e = $136;
              
              {ESLVal ds = $131;
              
              return getConstructors(l,lookupType(n,env),lookupType(n,env)).add(cnstrEnv(ds,env));
            }
            }
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $139;
              
              {ESLVal n = $138;
              
              {ESLVal t = $137;
              
              {ESLVal e = $136;
              
              {ESLVal ds = $131;
              
              return cnstrEnv(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "UnionType": {ESLVal $141 = $137.termRef(0);
            ESLVal $140 = $137.termRef(1);
            
            {ESLVal l = $139;
            
            {ESLVal n = $138;
            
            {ESLVal lll = $141;
            
            {ESLVal ts = $140;
            
            {ESLVal e = $136;
            
            {ESLVal ds = $131;
            
            return getConstructors(l,lookupType(n,env),lookupType(n,env)).add(cnstrEnv(ds,env));
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal l = $139;
            
            {ESLVal n = $138;
            
            {ESLVal t = $137;
            
            {ESLVal e = $136;
            
            {ESLVal ds = $131;
            
            return cnstrEnv(ds,env);
          }
          }
          }
          }
          }
        }
        }
      case "DataBind": {ESLVal $135 = $130.termRef(0);
          ESLVal $134 = $130.termRef(1);
          ESLVal $133 = $130.termRef(2);
          ESLVal $132 = $130.termRef(3);
          
          {ESLVal l = $135;
          
          {ESLVal n = $134;
          
          {ESLVal t = $133;
          
          {ESLVal e = $132;
          
          {ESLVal ds = $131;
          
          return getConstructors(l,lookupType(n,env),lookupType(n,env)).add(cnstrEnv(ds,env));
        }
        }
        }
        }
        }
        }
        default: {ESLVal b = $130;
          
          {ESLVal ds = $131;
          
          return cnstrEnv(ds,env);
        }
        }
      }
      }
    else if(_v14.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(8497,9130)").add(ESLVal.list(_v14)));
    }
  }
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),null) { public ESLVal apply(ESLVal... args) { return cnstrEnv(args[0],args[1]); }});
  private static ESLVal getConstructors(ESLVal l,ESLVal dataType,ESLVal t) {
    
    {ESLVal _v15 = t;
      
      switch(_v15.termName) {
      case "RecType": {ESLVal $154 = _v15.termRef(0);
        ESLVal $153 = _v15.termRef(1);
        ESLVal $152 = _v15.termRef(2);
        
        {ESLVal _v578 = $154;
        
        {ESLVal n = $153;
        
        {ESLVal _v579 = $152;
        
        return getConstructors(_v578,dataType,_v579);
      }
      }
      }
      }
    case "TypeFun": {ESLVal $151 = _v15.termRef(0);
        ESLVal $150 = _v15.termRef(1);
        ESLVal $149 = _v15.termRef(2);
        
        {ESLVal _v576 = $151;
        
        {ESLVal ns = $150;
        
        {ESLVal _v577 = $149;
        
        return getConstructors(_v576,dataType,_v577);
      }
      }
      }
      }
    case "UnionType": {ESLVal $148 = _v15.termRef(0);
        ESLVal $147 = _v15.termRef(1);
        
        {ESLVal _v573 = $148;
        
        {ESLVal ts = $147;
        
        return map(new ESLVal(new Function(new ESLVal("fun172"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v574 = $args[0];
        {ESLVal _v16 = _v574;
              
              switch(_v16.termName) {
              case "TermType": {ESLVal $157 = _v16.termRef(0);
                ESLVal $156 = _v16.termRef(1);
                ESLVal $155 = _v16.termRef(2);
                
                {ESLVal _v575 = $157;
                
                {ESLVal n = $156;
                
                {ESLVal tts = $155;
                
                return new ESLVal("Map",n,dataType);
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(9649,9715)").add(ESLVal.list(_v16)));
            }
            }
          }
        }),ts);
      }
      }
      }
      default: {ESLVal _v580 = _v15;
        
        return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType(_v580,$nil))));
      }
    }
    }
  }
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),null) { public ESLVal apply(ESLVal... args) { return getConstructors(args[0],args[1],args[2]); }});
  private static ESLVal checkFreeTypes(ESLVal e) {
    
    {ESLVal dom = typeEnvDom(e);
      ESLVal ran = typeEnvRan(e);
      
      {ESLVal freeNames = removeAll(dom,flatten.apply(map(typeFV,ran)));
      
      if(freeNames.eql($nil).boolVal)
      return $null;
      else
        return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Unbound Types: ").add(freeNames)));
    }
    }
  }
  private static ESLVal checkFreeTypes = new ESLVal(new Function(new ESLVal("checkFreeTypes"),null) { public ESLVal apply(ESLVal... args) { return checkFreeTypes(args[0]); }});
  private static ESLVal checkSingletonTypes(ESLVal e) {
    
    {ESLVal _v17 = e;
      
      if(_v17.isCons())
      {ESLVal $158 = _v17.head();
        ESLVal $159 = _v17.tail();
        
        switch($158.termName) {
        case "Map": {ESLVal $161 = $158.termRef(0);
          ESLVal $160 = $158.termRef(1);
          
          {ESLVal n = $161;
          
          {ESLVal t = $160;
          
          {ESLVal _v572 = $159;
          
          if(member.apply(n,typeEnvDom(_v572)).boolVal)
          return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Duplicate type name: ").add(n)));
          else
            return checkSingletonTypes(_v572);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10419,10640)").add(ESLVal.list(_v17)));
      }
      }
    else if(_v17.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(10419,10640)").add(ESLVal.list(_v17)));
    }
  }
  private static ESLVal checkSingletonTypes = new ESLVal(new Function(new ESLVal("checkSingletonTypes"),null) { public ESLVal apply(ESLVal... args) { return checkSingletonTypes(args[0]); }});
  private static ESLVal checkSingletonConstructors(ESLVal cnstrEnv) {
    
    {ESLVal _v18 = cnstrEnv;
      
      if(_v18.isCons())
      {ESLVal $162 = _v18.head();
        ESLVal $163 = _v18.tail();
        
        switch($162.termName) {
        case "Map": {ESLVal $165 = $162.termRef(0);
          ESLVal $164 = $162.termRef(1);
          
          {ESLVal n = $165;
          
          {ESLVal t = $164;
          
          {ESLVal _v565 = $163;
          
          if(member.apply(n,typeEnvDom(_v565)).boolVal)
          { LetRec letrec = new LetRec() {
            ESLVal throwError = new ESLVal(new Function(new ESLVal("throwError"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v566 = $args[0];
              {ESLVal _v19 = _v566;
                    
                    switch(_v19.termName) {
                    case "UnionType": {ESLVal $176 = _v19.termRef(0);
                      ESLVal $175 = _v19.termRef(1);
                      
                      {ESLVal l = $176;
                      
                      {ESLVal ts = $175;
                      
                      return error(new ESLVal("TypeError",l,new ESLVal("Duplicate constructor name: ").add(n)));
                    }
                    }
                    }
                  case "ForallType": {ESLVal $174 = _v19.termRef(0);
                      ESLVal $173 = _v19.termRef(1);
                      ESLVal $172 = _v19.termRef(2);
                      
                      {ESLVal l = $174;
                      
                      {ESLVal ns = $173;
                      
                      {ESLVal _v570 = $172;
                      
                      return throwError.apply(_v570);
                    }
                    }
                    }
                    }
                  case "RecType": {ESLVal $171 = _v19.termRef(0);
                      ESLVal $170 = _v19.termRef(1);
                      ESLVal $169 = _v19.termRef(2);
                      
                      {ESLVal l = $171;
                      
                      {ESLVal _v568 = $170;
                      
                      {ESLVal _v569 = $169;
                      
                      return throwError.apply(_v569);
                    }
                    }
                    }
                    }
                  case "TypeFun": {ESLVal $168 = _v19.termRef(0);
                      ESLVal $167 = _v19.termRef(1);
                      ESLVal $166 = _v19.termRef(2);
                      
                      {ESLVal l = $168;
                      
                      {ESLVal ns = $167;
                      
                      {ESLVal _v567 = $166;
                      
                      return throwError.apply(_v567);
                    }
                    }
                    }
                    }
                    default: {ESLVal _v571 = _v19;
                      
                      return error(new ESLVal("Duplicate constructor name: ").add(n.add(new ESLVal(" ").add(_v571))));
                    }
                  }
                  }
                }
              });
            
            public ESLVal get(String name) {
              switch(name) {
                case "throwError": return throwError;
                
                default: throw new Error("cannot find letrec binding");
              }
              }
            };
          ESLVal throwError = letrec.get("throwError");
          
            return throwError.apply(t);}
          
          else
            return checkSingletonConstructors(_v565);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(10753,11408)").add(ESLVal.list(_v18)));
      }
      }
    else if(_v18.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(10753,11408)").add(ESLVal.list(_v18)));
    }
  }
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),null) { public ESLVal apply(ESLVal... args) { return checkSingletonConstructors(args[0]); }});
  private static ESLVal valueDefs(ESLVal defs) {
    
    {ESLVal _v20 = defs;
      
      if(_v20.isCons())
      {ESLVal $177 = _v20.head();
        ESLVal $178 = _v20.tail();
        
        switch($177.termName) {
        case "TypeBind": {ESLVal $190 = $177.termRef(0);
          ESLVal $189 = $177.termRef(1);
          ESLVal $188 = $177.termRef(2);
          ESLVal $187 = $177.termRef(3);
          
          {ESLVal l = $190;
          
          {ESLVal n = $189;
          
          {ESLVal t = $188;
          
          {ESLVal e = $187;
          
          {ESLVal ds = $178;
          
          return valueDefs(ds);
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $186 = $177.termRef(0);
          ESLVal $185 = $177.termRef(1);
          ESLVal $184 = $177.termRef(2);
          ESLVal $183 = $177.termRef(3);
          
          {ESLVal l1 = $186;
          
          {ESLVal n = $185;
          
          {ESLVal t = $184;
          
          {ESLVal e = $183;
          
          {ESLVal ds = $178;
          
          return valueDefs(ds);
        }
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $182 = $177.termRef(0);
          ESLVal $181 = $177.termRef(1);
          ESLVal $180 = $177.termRef(2);
          ESLVal $179 = $177.termRef(3);
          
          {ESLVal l1 = $182;
          
          {ESLVal n = $181;
          
          {ESLVal t = $180;
          
          {ESLVal e = $179;
          
          {ESLVal ds = $178;
          
          return valueDefs(ds);
        }
        }
        }
        }
        }
        }
        default: {ESLVal b = $177;
          
          {ESLVal ds = $178;
          
          return valueDefs(ds).cons(b);
        }
        }
      }
      }
    else if(_v20.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(11448,11758)").add(ESLVal.list(_v20)));
    }
  }
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),null) { public ESLVal apply(ESLVal... args) { return valueDefs(args[0]); }});
  private static ESLVal valueDefsToTEnv(ESLVal defs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v21 = defs;
      
      if(_v21.isCons())
      {ESLVal $191 = _v21.head();
        ESLVal $192 = _v21.tail();
        
        switch($191.termName) {
        case "FunBinds": {ESLVal $206 = $191.termRef(0);
          ESLVal $205 = $191.termRef(1);
          
          if($205.isCons())
          {ESLVal $207 = $205.head();
            ESLVal $208 = $205.tail();
            
            switch($207.termName) {
            case "FunCase": {ESLVal $213 = $207.termRef(0);
              ESLVal $212 = $207.termRef(1);
              ESLVal $211 = $207.termRef(2);
              ESLVal $210 = $207.termRef(3);
              ESLVal $209 = $207.termRef(4);
              
              switch($211.termName) {
              case "FunType": {ESLVal $216 = $211.termRef(0);
                ESLVal $215 = $211.termRef(1);
                ESLVal $214 = $211.termRef(2);
                
                {ESLVal n = $206;
                
                {ESLVal l = $213;
                
                {ESLVal args = $212;
                
                {ESLVal fl = $216;
                
                {ESLVal d = $215;
                
                {ESLVal r = $214;
                
                {ESLVal g = $210;
                
                {ESLVal e = $209;
                
                {ESLVal cases = $208;
                
                {ESLVal ds = $192;
                
                return valueDefsToTEnv(ds,selfType,valueEnv,cnstrEnv,typeEnv).cons(new ESLVal("Map",n,substTypeEnv(typeEnv,new ESLVal("FunType",fl,new SerializableFunction<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal p = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(getPatternType(l,p,selfType,valueEnv,cnstrEnv,typeEnv));
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(args),r))));
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
              default: return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
            }
            }
            default: return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
          }
          }
        else if($205.isNil())
          return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
        else return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
        }
      case "FunBind": {ESLVal $204 = $191.termRef(0);
          ESLVal $203 = $191.termRef(1);
          ESLVal $202 = $191.termRef(2);
          ESLVal $201 = $191.termRef(3);
          ESLVal $200 = $191.termRef(4);
          ESLVal $199 = $191.termRef(5);
          ESLVal $198 = $191.termRef(6);
          
          {ESLVal l = $204;
          
          {ESLVal n = $203;
          
          {ESLVal ps = $202;
          
          {ESLVal t = $201;
          
          {ESLVal st = $200;
          
          {ESLVal b = $199;
          
          {ESLVal g = $198;
          
          {ESLVal ds = $192;
          
          return valueDefsToTEnv(ds,selfType,valueEnv,cnstrEnv,typeEnv).cons(new ESLVal("Map",n,substTypeEnv(typeEnv,t)));
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $197 = $191.termRef(0);
          ESLVal $196 = $191.termRef(1);
          ESLVal $195 = $191.termRef(2);
          ESLVal $194 = $191.termRef(3);
          ESLVal $193 = $191.termRef(4);
          
          {ESLVal l = $197;
          
          {ESLVal n = $196;
          
          {ESLVal t = $195;
          
          {ESLVal st = $194;
          
          {ESLVal e = $193;
          
          {ESLVal ds = $192;
          
          return valueDefsToTEnv(ds,selfType,valueEnv,cnstrEnv,typeEnv).cons(new ESLVal("Map",n,substTypeEnv(typeEnv,t)));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
      }
      }
    else if(_v21.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(11865,12495)").add(ESLVal.list(_v21)));
    }
  }
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),null) { public ESLVal apply(ESLVal... args) { return valueDefsToTEnv(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal recordJustType(ESLVal e,ESLVal t) {
    
    {setTypeInfo(e,new ESLVal("JustType",t));
    return t;}
  }
  private static ESLVal recordJustType = new ESLVal(new Function(new ESLVal("recordJustType"),null) { public ESLVal apply(ESLVal... args) { return recordJustType(args[0],args[1]); }});
  public static ESLVal typeCheckModule(ESLVal path) {
    
    {print.apply(new ESLVal("[ type check ").add(path.add(new ESLVal("]"))));
    return typeCheckModuleInternal(path,getCache(),new ESLVal(new Function(new ESLVal("fun173"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal cache = $args[0];
      ESLVal valueEnv = $args[1];
      ESLVal cnstrEnv = $args[2];
      ESLVal typeEnv = $args[3];
      return $null;
        }
      }));}
  }
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),null) { public ESLVal apply(ESLVal... args) { return typeCheckModule(args[0]); }});
  private static ESLVal typeCheckModuleInternal(ESLVal path,ESLVal cache,ESLVal handler) {
    
    if(hasEntry(path,cache).boolVal)
      {ESLVal _v22 = lookup(path,cache);
        
        switch(_v22.termName) {
        case "Typed": {ESLVal $220 = _v22.termRef(0);
          ESLVal $219 = _v22.termRef(1);
          ESLVal $218 = _v22.termRef(2);
          ESLVal $217 = _v22.termRef(3);
          
          {ESLVal names = $220;
          
          {ESLVal vEnv = $219;
          
          {ESLVal cEnv = $218;
          
          {ESLVal tEnv = $217;
          
          return handler.apply(cache,vEnv,cEnv,tEnv);
        }
        }
        }
        }
        }
      case "Undefined": {
          return error(new ESLVal("recursive reference to ").add(path));
        }
        default: return error(new ESLVal("case error at Pos(12983,13215)").add(ESLVal.list(_v22)));
      }
      }
      else
        {ESLVal m = parse.apply(path);
          
          return typeCheckModuleCache(m,updateCache(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun174"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v561 = $args[0];
          ESLVal _v562 = $args[1];
          ESLVal _v563 = $args[2];
          ESLVal _v564 = $args[3];
          return handler.apply(updateCache(path,new ESLVal("Typed",moduleExportedMethodNames(m),_v562,_v563,_v564),_v561),_v562,_v563,_v564);
            }
          }));
        }
  }
  private static ESLVal typeCheckModuleInternal = new ESLVal(new Function(new ESLVal("typeCheckModuleInternal"),null) { public ESLVal apply(ESLVal... args) { return typeCheckModuleInternal(args[0],args[1],args[2]); }});
  public static ESLVal typeCheckEntryPoint(ESLVal module) {
    
    return typeCheckModuleCache(module,getCache(),new ESLVal(new Function(new ESLVal("fun175"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal cache = $args[0];
      ESLVal valueEnv = $args[1];
      ESLVal cnstrEnv = $args[2];
      ESLVal typeEnv = $args[3];
      return $null;
        }
      }));
  }
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),null) { public ESLVal apply(ESLVal... args) { return typeCheckEntryPoint(args[0]); }});
  private static ESLVal typeCheckModuleCache(ESLVal module,ESLVal cache,ESLVal handler) {
    
    return typeCheckModule0(module,cache,new ESLVal(new Function(new ESLVal("fun176"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal _v557 = $args[0];
      ESLVal _v558 = $args[1];
      ESLVal _v559 = $args[2];
      ESLVal _v560 = $args[3];
      {ESLVal _v23 = module;
            
            switch(_v23.termName) {
            case "Module": {ESLVal $227 = _v23.termRef(0);
              ESLVal $226 = _v23.termRef(1);
              ESLVal $225 = _v23.termRef(2);
              ESLVal $224 = _v23.termRef(3);
              ESLVal $223 = _v23.termRef(4);
              ESLVal $222 = _v23.termRef(5);
              ESLVal $221 = _v23.termRef(6);
              
              {ESLVal path = $227;
              
              {ESLVal name = $226;
              
              {ESLVal exports = $225;
              
              {ESLVal imports = $224;
              
              {ESLVal decs = $223;
              
              {ESLVal y = $222;
              
              {ESLVal defs = $221;
              
              return handler.apply(_v557,restrictTypeEnv(_v558,exports),restrictTypeEnv(_v559,exports),restrictTypeEnv(_v560,exports));
            }
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(14234,14497)").add(ESLVal.list(_v23)));
          }
          }
        }
      }));
  }
  private static ESLVal typeCheckModuleCache = new ESLVal(new Function(new ESLVal("typeCheckModuleCache"),null) { public ESLVal apply(ESLVal... args) { return typeCheckModuleCache(args[0],args[1],args[2]); }});
  private static ESLVal typeCheckModule0(ESLVal module,ESLVal cache,ESLVal handler) {
    
    { LetRec letrec = new LetRec() {
      ESLVal _v536 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v544 = $args[0];
        ESLVal _v545 = $args[1];
        ESLVal _v546 = $args[2];
        {ESLVal _v24 = _v544;
              
              if(_v24.isCons())
              {ESLVal $228 = _v24.head();
                ESLVal $229 = _v24.tail();
                
                {ESLVal path = $228;
                
                {ESLVal _v547 = $229;
                
                {ESLVal _v548 = _v547;
                
                return typeCheckModuleInternal(path,_v545,new ESLVal(new Function(new ESLVal("fun177"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v549 = $args[0];
                ESLVal _v550 = $args[1];
                ESLVal _v551 = $args[2];
                ESLVal _v552 = $args[3];
                return _v536.apply(_v548,_v549,new ESLVal(new Function(new ESLVal("fun178"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal _v553 = $args[0];
                      ESLVal _v554 = $args[1];
                      ESLVal _v555 = $args[2];
                      ESLVal _v556 = $args[3];
                      return _v546.apply(_v553,_v554.add(_v550),_v555.add(_v551),_v556.add(_v552));
                        }
                      }));
                  }
                }));
              }
              }
              }
              }
            else if(_v24.isNil())
              return _v546.apply(_v545,$nil,$nil,$nil);
            else return error(new ESLVal("case error at Pos(14877,15434)").add(ESLVal.list(_v24)));
            }
          }
        });
      ESLVal _v537 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v25 = module;
              
              switch(_v25.termName) {
              case "Module": {ESLVal $236 = _v25.termRef(0);
                ESLVal $235 = _v25.termRef(1);
                ESLVal $234 = _v25.termRef(2);
                ESLVal $233 = _v25.termRef(3);
                ESLVal $232 = _v25.termRef(4);
                ESLVal $231 = _v25.termRef(5);
                ESLVal $230 = _v25.termRef(6);
                
                {ESLVal path = $236;
                
                {ESLVal name = $235;
                
                {ESLVal exports = $234;
                
                {ESLVal imports = $233;
                
                {ESLVal decs = $232;
                
                {ESLVal y = $231;
                
                {ESLVal defs = $230;
                
                return _v536.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun179"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v538 = $args[0];
                ESLVal _v539 = $args[1];
                ESLVal _v540 = $args[2];
                ESLVal _v541 = $args[3];
                {ESLVal _v542 = typeEnv(defs);
                      ESLVal _v543 = mergeFunDefs(defs);
                      
                      {print.apply(new ESLVal("decs = ").add(decs));
                    resetInfo();
                    resetTypeInfo();
                    resetWarnings();
                    checkUnusedVars(module);
                    checkDupBindings(_v543);
                    checkFreeTypes(_v542.add(_v541.add(tenv0)));
                    checkSingletonTypes(_v542);
                    {ESLVal typeEnv = recTypes(_v542.add(_v541.add(tenv0)));
                      
                      {ESLVal cnstrEnv = cnstrEnv(_v543,typeEnv).add(_v540.add(cnstrEnv0));
                      
                      {checkSingletonConstructors(cnstrEnv);
                    {ESLVal valueEnv = typeCheckValues(valueDefs(_v543),theTypeNull,_v539,typeEnv,cnstrEnv);
                      
                      return handler.apply(_v538,valueEnv,cnstrEnv,typeEnv);
                    }}
                    }
                    }}
                    }
                  }
                }));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(15463,17172)").add(ESLVal.list(_v25)));
            }
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "_v536": return _v536;
          
          case "_v537": return _v537;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal _v536 = letrec.get("_v536");
    
    ESLVal _v537 = letrec.get("_v537");
    
      return _v537.apply();}
    
  }
  private static ESLVal typeCheckModule0 = new ESLVal(new Function(new ESLVal("typeCheckModule0"),null) { public ESLVal apply(ESLVal... args) { return typeCheckModule0(args[0],args[1],args[2]); }});
  private static ESLVal typeCheckValues(ESLVal valueDefs,ESLVal selfType,ESLVal ivalueEnv,ESLVal typeEnv,ESLVal cnstrEnv) {
    
    {ESLVal valueEnv = valueDefsToTEnv(valueDefs,selfType,$nil,cnstrEnv,typeEnv).add(ivalueEnv.add(env0));
      
      {{
      ESLVal _v26 = valueDefs;
      while(_v26.isCons()) {
        ESLVal def = _v26.headVal;
        typeCheckDef(def,selfType,valueEnv,valueEnv,cnstrEnv,typeEnv);
        _v26 = _v26.tailVal;}
    }
    return valueEnv;}
    }
  }
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),null) { public ESLVal apply(ESLVal... args) { return typeCheckValues(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal genericize(ESLVal l,ESLVal t) {
    
    if(length.apply(typeFV(t)).eql($zero).boolVal)
      return t;
      else
        return new ESLVal("ForallType",l,typeFV(t),t);
  }
  private static ESLVal genericize = new ESLVal(new Function(new ESLVal("genericize"),null) { public ESLVal apply(ESLVal... args) { return genericize(args[0],args[1]); }});
  private static ESLVal checkPatterns(ESLVal l,ESLVal ps) {
    
    {ESLVal names = new SerializableFunction<ESLVal,ESLVal>() {
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
          }}.apply(ps);
      
      if(removeDups(names).neql(names).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("duplicate pattern variables")));
      else
        return $null;
    }
  }
  private static ESLVal checkPatterns = new ESLVal(new Function(new ESLVal("checkPatterns"),null) { public ESLVal apply(ESLVal... args) { return checkPatterns(args[0],args[1]); }});
  private static ESLVal typeCheckDef(ESLVal def,ESLVal selfType,ESLVal baseValueEnv,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v27 = def;
      
      switch(_v27.termName) {
      case "FunBinds": {ESLVal $250 = _v27.termRef(0);
        ESLVal $249 = _v27.termRef(1);
        
        {ESLVal n = $250;
        
        {ESLVal cases = $249;
        
        { LetRec letrec = new LetRec() {
        ESLVal checkArities = new ESLVal(new Function(new ESLVal("checkArities"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v533 = $args[0];
          ESLVal _v534 = $args[1];
          {ESLVal _v31 = _v533;
                
                if(_v31.isCons())
                {ESLVal $260 = _v31.head();
                  ESLVal $261 = _v31.tail();
                  
                  switch($260.termName) {
                  case "FunCase": {ESLVal $266 = $260.termRef(0);
                    ESLVal $265 = $260.termRef(1);
                    ESLVal $264 = $260.termRef(2);
                    ESLVal $263 = $260.termRef(3);
                    ESLVal $262 = $260.termRef(4);
                    
                    {ESLVal l = $266;
                    
                    {ESLVal args = $265;
                    
                    {ESLVal t = $264;
                    
                    {ESLVal g = $263;
                    
                    {ESLVal e = $262;
                    
                    {ESLVal _v535 = $261;
                    
                    if(_v534.eql(new ESLVal(-1)).or(length.apply(args).eql(_v534)).boolVal)
                    return checkArities.apply(_v535,length.apply(args));
                    else
                      return error(new ESLVal("TypeError",l,new ESLVal("inconsistent overloaded arity")));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(18378,18670)").add(ESLVal.list(_v31)));
                }
                }
              else if(_v31.isNil())
                return _v534;
              else return error(new ESLVal("case error at Pos(18378,18670)").add(ESLVal.list(_v31)));
              }
            }
          });
        ESLVal funCaseLoc = new ESLVal(new Function(new ESLVal("funCaseLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          {ESLVal _v32 = f;
                
                switch(_v32.termName) {
                case "FunCase": {ESLVal $271 = _v32.termRef(0);
                  ESLVal $270 = _v32.termRef(1);
                  ESLVal $269 = _v32.termRef(2);
                  ESLVal $268 = _v32.termRef(3);
                  ESLVal $267 = _v32.termRef(4);
                  
                  {ESLVal l = $271;
                  
                  {ESLVal ps = $270;
                  
                  {ESLVal t = $269;
                  
                  {ESLVal g = $268;
                  
                  {ESLVal e = $267;
                  
                  return l;
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18709,18745)").add(ESLVal.list(_v32)));
              }
              }
            }
          });
        ESLVal funCasePatterns = new ESLVal(new Function(new ESLVal("funCasePatterns"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          {ESLVal _v33 = f;
                
                switch(_v33.termName) {
                case "FunCase": {ESLVal $276 = _v33.termRef(0);
                  ESLVal $275 = _v33.termRef(1);
                  ESLVal $274 = _v33.termRef(2);
                  ESLVal $273 = _v33.termRef(3);
                  ESLVal $272 = _v33.termRef(4);
                  
                  {ESLVal l = $276;
                  
                  {ESLVal ps = $275;
                  
                  {ESLVal t = $274;
                  
                  {ESLVal g = $273;
                  
                  {ESLVal e = $272;
                  
                  return ps;
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18795,18832)").add(ESLVal.list(_v33)));
              }
              }
            }
          });
        ESLVal funCaseGuard = new ESLVal(new Function(new ESLVal("funCaseGuard"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          {ESLVal _v34 = f;
                
                switch(_v34.termName) {
                case "FunCase": {ESLVal $281 = _v34.termRef(0);
                  ESLVal $280 = _v34.termRef(1);
                  ESLVal $279 = _v34.termRef(2);
                  ESLVal $278 = _v34.termRef(3);
                  ESLVal $277 = _v34.termRef(4);
                  
                  {ESLVal l = $281;
                  
                  {ESLVal ps = $280;
                  
                  {ESLVal t = $279;
                  
                  {ESLVal g = $278;
                  
                  {ESLVal e = $277;
                  
                  return g;
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18873,18909)").add(ESLVal.list(_v34)));
              }
              }
            }
          });
        ESLVal funCaseBody = new ESLVal(new Function(new ESLVal("funCaseBody"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          {ESLVal _v35 = f;
                
                switch(_v35.termName) {
                case "FunCase": {ESLVal $286 = _v35.termRef(0);
                  ESLVal $285 = _v35.termRef(1);
                  ESLVal $284 = _v35.termRef(2);
                  ESLVal $283 = _v35.termRef(3);
                  ESLVal $282 = _v35.termRef(4);
                  
                  {ESLVal l = $286;
                  
                  {ESLVal ps = $285;
                  
                  {ESLVal t = $284;
                  
                  {ESLVal g = $283;
                  
                  {ESLVal e = $282;
                  
                  return e;
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(18949,18985)").add(ESLVal.list(_v35)));
              }
              }
            }
          });
        ESLVal checkCases = new ESLVal(new Function(new ESLVal("checkCases"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v531 = $args[0];
          {ESLVal ts = new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal p = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(getPatternType(patternLoc(p),p,selfType,valueEnv,cnstrEnv,typeEnv));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(funCasePatterns.apply(head.apply(_v531)));
                
                {ESLVal _v532 = zipTypeEnv(new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal i = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("$v").add(i));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($zero.to(length.apply(ts))),new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal t = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(typeNF(t,typeEnv));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(ts)).add(valueEnv);
                
                {ESLVal caseExp = new ESLVal("Case",funCaseLoc.apply(head.apply(_v531)),$nil,new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal i = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("Var",patternLoc(nth.apply(funCasePatterns.apply(head.apply(_v531)),i)),new ESLVal("$v").add(i)));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply($zero.to(length.apply(ts))),new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal c = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(new ESLVal("BArm",funCaseLoc.apply(c),funCasePatterns.apply(c),funCaseGuard.apply(c),funCaseBody.apply(c)));
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(_v531));
                
                return expType(caseExp,selfType,_v532,cnstrEnv,typeEnv);
              }
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "checkArities": return checkArities;
            
            case "funCaseLoc": return funCaseLoc;
            
            case "funCasePatterns": return funCasePatterns;
            
            case "funCaseGuard": return funCaseGuard;
            
            case "funCaseBody": return funCaseBody;
            
            case "checkCases": return checkCases;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal checkArities = letrec.get("checkArities");
      
      ESLVal funCaseLoc = letrec.get("funCaseLoc");
      
      ESLVal funCasePatterns = letrec.get("funCasePatterns");
      
      ESLVal funCaseGuard = letrec.get("funCaseGuard");
      
      ESLVal funCaseBody = letrec.get("funCaseBody");
      
      ESLVal checkCases = letrec.get("checkCases");
      
        {checkArities.apply(cases,new ESLVal(-1));
      return checkCases.apply(cases);}}
      
      }
      }
      }
    case "FunBind": {ESLVal $248 = _v27.termRef(0);
        ESLVal $247 = _v27.termRef(1);
        ESLVal $246 = _v27.termRef(2);
        ESLVal $245 = _v27.termRef(3);
        ESLVal $244 = _v27.termRef(4);
        ESLVal $243 = _v27.termRef(5);
        ESLVal $242 = _v27.termRef(6);
        
        {ESLVal l = $248;
        
        {ESLVal n = $247;
        
        {ESLVal ps = $246;
        
        {ESLVal t = $245;
        
        {ESLVal st = $244;
        
        {ESLVal b = $243;
        
        {ESLVal g = $242;
        
        {checkPatterns(l,ps);
      {ESLVal argTypes = map(new ESLVal(new Function(new ESLVal("fun180"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal p = $args[0];
          {ESLVal _v28 = p;
                
                switch(_v28.termName) {
                case "PVar": {ESLVal $253 = _v28.termRef(0);
                  ESLVal $252 = _v28.termRef(1);
                  ESLVal $251 = _v28.termRef(2);
                  
                  {ESLVal _v525 = $253;
                  
                  {ESLVal _v526 = $252;
                  
                  {ESLVal _v527 = $251;
                  
                  return substTypeEnv(typeEnv,_v527);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(19899,19965)").add(ESLVal.list(_v28)));
              }
              }
            }
          }),ps);
        ESLVal argNames = map(new ESLVal(new Function(new ESLVal("fun181"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal p = $args[0];
          {ESLVal _v29 = p;
                
                switch(_v29.termName) {
                case "PVar": {ESLVal $256 = _v29.termRef(0);
                  ESLVal $255 = _v29.termRef(1);
                  ESLVal $254 = _v29.termRef(2);
                  
                  {ESLVal _v522 = $256;
                  
                  {ESLVal _v523 = $255;
                  
                  {ESLVal _v524 = $254;
                  
                  return _v523;
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(20037,20081)").add(ESLVal.list(_v29)));
              }
              }
            }
          }),ps);
        
        {ESLVal bodyType = guardedExpType(l,g,b,selfType,zipTypeEnv(argNames,argTypes).add(baseValueEnv),cnstrEnv,typeEnv);
        
        {ESLVal fType = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal _v30 = t;
              
              switch(_v30.termName) {
              case "ForallType": {ESLVal $259 = _v30.termRef(0);
                ESLVal $258 = _v30.termRef(1);
                ESLVal $257 = _v30.termRef(2);
                
                {ESLVal _v528 = $259;
                
                {ESLVal ns = $258;
                
                {ESLVal _v529 = $257;
                
                return genericize(_v528,new ESLVal("FunType",_v528,argTypes,bodyType));
              }
              }
              }
              }
              default: {ESLVal _v530 = _v30;
                
                return new ESLVal("FunType",l,argTypes,bodyType);
              }
            }
            }
          }}.get();
        ESLVal dType = substTypeEnv(typeEnv,t);
        
        if(subType(fType,dType).boolVal)
        return $null;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType(fType,typeEnv).add(new ESLVal(" does not match declaration ").add(ppType(dType,typeEnv))))))));
      }
      }
      }}
      }
      }
      }
      }
      }
      }
      }
      }
    case "Binding": {ESLVal $241 = _v27.termRef(0);
        ESLVal $240 = _v27.termRef(1);
        ESLVal $239 = _v27.termRef(2);
        ESLVal $238 = _v27.termRef(3);
        ESLVal $237 = _v27.termRef(4);
        
        {ESLVal l = $241;
        
        {ESLVal n = $240;
        
        {ESLVal dt = $239;
        
        {ESLVal st = $238;
        
        {ESLVal e = $237;
        
        {ESLVal valueType = expType(e,selfType,baseValueEnv,cnstrEnv,typeEnv);
        
        {ESLVal valueFV = typeFV(valueType);
        ESLVal declaredType = lookupType(n,valueEnv);
        
        {ESLVal _v521 = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            if(valueFV.eql($nil).boolVal)
              return valueType;
              else
                return new ESLVal("ForallType",l,valueFV,valueType);
          }}.get();
        
        if(subType(_v521,declaredType).boolVal)
        return $null;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType(_v521,typeEnv).add(new ESLVal(" does not match declared type = ").add(ppType(declaredType,typeEnv))))))));
      }
      }
      }
      }
      }
      }
      }
      }
      }
      default: {ESLVal b = _v27;
        
        return print.apply(new ESLVal("unexpected binding ").add(b));
      }
    }
    }
  }
  private static ESLVal typeCheckDef = new ESLVal(new Function(new ESLVal("typeCheckDef"),null) { public ESLVal apply(ESLVal... args) { return typeCheckDef(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal guardedExpType(ESLVal l,ESLVal g,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal bt = expType(g,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isBoolType(bt).boolVal)
      return expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      else
        return error(new ESLVal("TypeError",l,new ESLVal("guarded expression requires a boolean value: ").add(ppType(bt,typeEnv))));
    }
  }
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),null) { public ESLVal apply(ESLVal... args) { return guardedExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal expType(ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t = expType1(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(hasTypeInfo(e).boolVal)
      return t;
      else
        return recordJustType(e,t);
    }
  }
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),null) { public ESLVal apply(ESLVal... args) { return expType(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal expType1(ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v36 = e;
      
      switch(_v36.termName) {
      case "ActExp": {ESLVal $422 = _v36.termRef(0);
        ESLVal $421 = _v36.termRef(1);
        ESLVal $420 = _v36.termRef(2);
        ESLVal $419 = _v36.termRef(3);
        ESLVal $418 = _v36.termRef(4);
        ESLVal $417 = _v36.termRef(5);
        ESLVal $416 = _v36.termRef(6);
        ESLVal $415 = _v36.termRef(7);
        
        {ESLVal l = $422;
        
        {ESLVal n = $421;
        
        {ESLVal args = $420;
        
        {ESLVal exports = $419;
        
        {ESLVal parent = $418;
        
        {ESLVal bindings = $417;
        
        {ESLVal init = $416;
        
        {ESLVal arms = $415;
        
        return actType(l,n,args,parent,exports,mergeFunDefs(bindings),init,arms,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
      }
      }
      }
      }
    case "Apply": {ESLVal $414 = _v36.termRef(0);
        ESLVal $413 = _v36.termRef(1);
        ESLVal $412 = _v36.termRef(2);
        
        {ESLVal l = $414;
        
        {ESLVal op = $413;
        
        {ESLVal args = $412;
        
        return applyType(l,op,args,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "ApplyTypeExp": {ESLVal $411 = _v36.termRef(0);
        ESLVal $410 = _v36.termRef(1);
        ESLVal $409 = _v36.termRef(2);
        
        {ESLVal l = $411;
        
        {ESLVal _v520 = $410;
        
        {ESLVal ts = $409;
        
        return applyTypeExp(l,_v520,ts,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "ArrayUpdate": {ESLVal $408 = _v36.termRef(0);
        ESLVal $407 = _v36.termRef(1);
        ESLVal $406 = _v36.termRef(2);
        ESLVal $405 = _v36.termRef(3);
        
        {ESLVal l = $408;
        
        {ESLVal a = $407;
        
        {ESLVal i = $406;
        
        {ESLVal v = $405;
        
        return arrayUpdateType(l,a,i,v,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "ArrayRef": {ESLVal $404 = _v36.termRef(0);
        ESLVal $403 = _v36.termRef(1);
        ESLVal $402 = _v36.termRef(2);
        
        {ESLVal l = $404;
        
        {ESLVal a = $403;
        
        {ESLVal i = $402;
        
        return arrayRefType(l,a,i,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "BagExp": {ESLVal $401 = _v36.termRef(0);
        ESLVal $400 = _v36.termRef(1);
        
        {ESLVal l = $401;
        
        {ESLVal es = $400;
        
        return bagType(l,es,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "Become": {ESLVal $399 = _v36.termRef(0);
        ESLVal $398 = _v36.termRef(1);
        
        {ESLVal l = $399;
        
        {ESLVal _v519 = $398;
        
        return becomeType(l,_v519,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "BinExp": {ESLVal $397 = _v36.termRef(0);
        ESLVal $396 = _v36.termRef(1);
        ESLVal $395 = _v36.termRef(2);
        ESLVal $394 = _v36.termRef(3);
        
        {ESLVal l = $397;
        
        {ESLVal e1 = $396;
        
        {ESLVal op = $395;
        
        {ESLVal e2 = $394;
        
        return binExpType(l,e1,op,e2,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "Block": {ESLVal $393 = _v36.termRef(0);
        ESLVal $392 = _v36.termRef(1);
        
        {ESLVal l = $393;
        
        {ESLVal es = $392;
        
        return blockType(l,es,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "BoolExp": {ESLVal $391 = _v36.termRef(0);
        ESLVal $390 = _v36.termRef(1);
        
        {ESLVal l = $391;
        
        {ESLVal b = $390;
        
        return theTypeBool;
      }
      }
      }
    case "Case": {ESLVal $389 = _v36.termRef(0);
        ESLVal $388 = _v36.termRef(1);
        ESLVal $387 = _v36.termRef(2);
        ESLVal $386 = _v36.termRef(3);
        
        {ESLVal l = $389;
        
        {ESLVal decs = $388;
        
        {ESLVal es = $387;
        
        {ESLVal arms = $386;
        
        return caseType(l,es,arms,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "Cmp": {ESLVal $385 = _v36.termRef(0);
        ESLVal $384 = _v36.termRef(1);
        ESLVal $383 = _v36.termRef(2);
        
        {ESLVal l = $385;
        
        {ESLVal _v518 = $384;
        
        {ESLVal qs = $383;
        
        return cmpType(l,_v518,qs,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Grab": {ESLVal $382 = _v36.termRef(0);
        ESLVal $381 = _v36.termRef(1);
        ESLVal $380 = _v36.termRef(2);
        
        {ESLVal l = $382;
        
        {ESLVal refs = $381;
        
        {ESLVal _v517 = $380;
        
        return expType(_v517,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "FloatExp": {ESLVal $379 = _v36.termRef(0);
        ESLVal $378 = _v36.termRef(1);
        
        {ESLVal l = $379;
        
        {ESLVal f = $378;
        
        return theTypeFloat;
      }
      }
      }
    case "Fold": {ESLVal $377 = _v36.termRef(0);
        ESLVal $376 = _v36.termRef(1);
        ESLVal $375 = _v36.termRef(2);
        
        {ESLVal l = $377;
        
        {ESLVal t = $376;
        
        {ESLVal _v516 = $375;
        
        return foldType(l,t,_v516,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "For": {ESLVal $374 = _v36.termRef(0);
        ESLVal $373 = _v36.termRef(1);
        ESLVal $372 = _v36.termRef(2);
        ESLVal $371 = _v36.termRef(3);
        
        {ESLVal l = $374;
        
        {ESLVal p = $373;
        
        {ESLVal list = $372;
        
        {ESLVal _v515 = $371;
        
        return forType(l,p,list,_v515,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "FunExp": {ESLVal $370 = _v36.termRef(0);
        ESLVal $369 = _v36.termRef(1);
        ESLVal $368 = _v36.termRef(2);
        ESLVal $367 = _v36.termRef(3);
        ESLVal $366 = _v36.termRef(4);
        
        {ESLVal l = $370;
        
        {ESLVal n = $369;
        
        {ESLVal args = $368;
        
        {ESLVal t = $367;
        
        {ESLVal _v514 = $366;
        
        return funType(l,n,args,t,_v514,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
      }
    case "If": {ESLVal $365 = _v36.termRef(0);
        ESLVal $364 = _v36.termRef(1);
        ESLVal $363 = _v36.termRef(2);
        ESLVal $362 = _v36.termRef(3);
        
        {ESLVal l = $365;
        
        {ESLVal e1 = $364;
        
        {ESLVal e2 = $363;
        
        {ESLVal e3 = $362;
        
        return ifType(l,e1,e2,e3,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "IntExp": {ESLVal $361 = _v36.termRef(0);
        ESLVal $360 = _v36.termRef(1);
        
        {ESLVal l = $361;
        
        {ESLVal n = $360;
        
        return theTypeInt;
      }
      }
      }
    case "Let": {ESLVal $359 = _v36.termRef(0);
        ESLVal $358 = _v36.termRef(1);
        ESLVal $357 = _v36.termRef(2);
        
        {ESLVal l = $359;
        
        {ESLVal bs = $358;
        
        {ESLVal _v513 = $357;
        
        return letType(l,bs,_v513,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Letrec": {ESLVal $356 = _v36.termRef(0);
        ESLVal $355 = _v36.termRef(1);
        ESLVal $354 = _v36.termRef(2);
        
        {ESLVal l = $356;
        
        {ESLVal bs = $355;
        
        {ESLVal _v512 = $354;
        
        return letrecType(l,bs,_v512,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "List": {ESLVal $353 = _v36.termRef(0);
        ESLVal $352 = _v36.termRef(1);
        
        {ESLVal l = $353;
        
        {ESLVal es = $352;
        
        return listType(l,es,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "Now": {ESLVal $351 = _v36.termRef(0);
        
        {ESLVal l = $351;
        
        return theTypeInt;
      }
      }
    case "Probably": {ESLVal $350 = _v36.termRef(0);
        ESLVal $349 = _v36.termRef(1);
        ESLVal $348 = _v36.termRef(2);
        ESLVal $347 = _v36.termRef(3);
        ESLVal $346 = _v36.termRef(4);
        
        {ESLVal l = $350;
        
        {ESLVal p = $349;
        
        {ESLVal t = $348;
        
        {ESLVal e1 = $347;
        
        {ESLVal e2 = $346;
        
        return probablyType(l,p,t,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
      }
    case "PLet": {ESLVal $345 = _v36.termRef(0);
        ESLVal $344 = _v36.termRef(1);
        ESLVal $343 = _v36.termRef(2);
        
        {ESLVal l = $345;
        
        {ESLVal bs = $344;
        
        {ESLVal _v511 = $343;
        
        return letType(l,bs,_v511,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Record": {ESLVal $342 = _v36.termRef(0);
        ESLVal $341 = _v36.termRef(1);
        
        {ESLVal l = $342;
        
        {ESLVal fields = $341;
        
        return recordType(l,fields,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "Ref": {ESLVal $340 = _v36.termRef(0);
        ESLVal $339 = _v36.termRef(1);
        ESLVal $338 = _v36.termRef(2);
        
        {ESLVal l = $340;
        
        {ESLVal _v510 = $339;
        
        {ESLVal n = $338;
        
        return refType(l,_v510,n,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "RefSuper": {ESLVal $337 = _v36.termRef(0);
        ESLVal $336 = _v36.termRef(1);
        
        {ESLVal l = $337;
        
        {ESLVal n = $336;
        
        return refType(l,new ESLVal("Var",l,new ESLVal("$super")),n,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "Self": {ESLVal $335 = _v36.termRef(0);
        
        {ESLVal l = $335;
        
        return selfType;
      }
      }
    case "Send": {ESLVal $330 = _v36.termRef(0);
        ESLVal $329 = _v36.termRef(1);
        ESLVal $328 = _v36.termRef(2);
        
        switch($328.termName) {
        case "Term": {ESLVal $334 = $328.termRef(0);
          ESLVal $333 = $328.termRef(1);
          ESLVal $332 = $328.termRef(2);
          ESLVal $331 = $328.termRef(3);
          
          {ESLVal l = $330;
          
          {ESLVal target = $329;
          
          {ESLVal tl = $334;
          
          {ESLVal n = $333;
          
          {ESLVal ts = $332;
          
          {ESLVal args = $331;
          
          return sendType(l,target,n,args,selfType,valueEnv,cnstrEnv,typeEnv);
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(22389,27313)").add(ESLVal.list(_v36)));
      }
      }
    case "SendTimeSuper": {ESLVal $327 = _v36.termRef(0);
        
        {ESLVal l = $327;
        
        return theTypeVoid;
      }
      }
    case "SendSuper": {ESLVal $326 = _v36.termRef(0);
        ESLVal $325 = _v36.termRef(1);
        
        {ESLVal l = $326;
        
        {ESLVal _v509 = $325;
        
        return theTypeVoid;
      }
      }
      }
    case "SetExp": {ESLVal $324 = _v36.termRef(0);
        ESLVal $323 = _v36.termRef(1);
        
        {ESLVal l = $324;
        
        {ESLVal es = $323;
        
        return setType(l,es,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "StrExp": {ESLVal $322 = _v36.termRef(0);
        ESLVal $321 = _v36.termRef(1);
        
        {ESLVal l = $322;
        
        {ESLVal s = $321;
        
        return theTypeStr;
      }
      }
      }
    case "Term": {ESLVal $320 = _v36.termRef(0);
        ESLVal $319 = _v36.termRef(1);
        ESLVal $318 = _v36.termRef(2);
        ESLVal $317 = _v36.termRef(3);
        
        {ESLVal l = $320;
        
        {ESLVal n = $319;
        
        {ESLVal ts = $318;
        
        {ESLVal es = $317;
        
        return termType(l,n,ts,es,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
      }
    case "Throw": {ESLVal $316 = _v36.termRef(0);
        ESLVal $315 = _v36.termRef(1);
        ESLVal $314 = _v36.termRef(2);
        
        {ESLVal l = $316;
        
        {ESLVal t = $315;
        
        {ESLVal _v508 = $314;
        
        return throwType(l,t,_v508,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Try": {ESLVal $313 = _v36.termRef(0);
        ESLVal $312 = _v36.termRef(1);
        ESLVal $311 = _v36.termRef(2);
        
        {ESLVal l = $313;
        
        {ESLVal _v507 = $312;
        
        {ESLVal arms = $311;
        
        return tryType(l,_v507,arms,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "New": {ESLVal $310 = _v36.termRef(0);
        ESLVal $309 = _v36.termRef(1);
        ESLVal $308 = _v36.termRef(2);
        
        {ESLVal l = $310;
        
        {ESLVal b = $309;
        
        {ESLVal args = $308;
        
        return newType(l,b,args,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "NewArray": {ESLVal $307 = _v36.termRef(0);
        ESLVal $306 = _v36.termRef(1);
        ESLVal $305 = _v36.termRef(2);
        
        {ESLVal l = $307;
        
        {ESLVal t = $306;
        
        {ESLVal i = $305;
        
        return newArrayType(l,t,i,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "NewTable": {ESLVal $304 = _v36.termRef(0);
        ESLVal $303 = _v36.termRef(1);
        ESLVal $302 = _v36.termRef(2);
        
        {ESLVal l = $304;
        
        {ESLVal key = $303;
        
        {ESLVal value = $302;
        
        return new ESLVal("TableType",l,substTypeEnv(typeEnv,key),substTypeEnv(typeEnv,value));
      }
      }
      }
      }
    case "NewJava": {ESLVal $301 = _v36.termRef(0);
        ESLVal $300 = _v36.termRef(1);
        ESLVal $299 = _v36.termRef(2);
        ESLVal $298 = _v36.termRef(3);
        
        {ESLVal l = $301;
        
        {ESLVal path = $300;
        
        {ESLVal t = $299;
        
        {ESLVal args = $298;
        
        {{
        ESLVal _v37 = args;
        while(_v37.isCons()) {
          ESLVal a = _v37.headVal;
          expType(a,selfType,valueEnv,cnstrEnv,typeEnv);
          _v37 = _v37.tailVal;}
      }
      return substTypeEnv(typeEnv,t);}
      }
      }
      }
      }
      }
    case "Not": {ESLVal $297 = _v36.termRef(0);
        ESLVal $296 = _v36.termRef(1);
        
        {ESLVal l = $297;
        
        {ESLVal _v506 = $296;
        
        return notType(l,_v506,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
    case "NullExp": {ESLVal $295 = _v36.termRef(0);
        
        {ESLVal l = $295;
        
        return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
      }
      }
    case "Unfold": {ESLVal $294 = _v36.termRef(0);
        ESLVal $293 = _v36.termRef(1);
        ESLVal $292 = _v36.termRef(2);
        
        {ESLVal l = $294;
        
        {ESLVal t = $293;
        
        {ESLVal _v505 = $292;
        
        return unfoldTypeExp(l,t,_v505,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Update": {ESLVal $291 = _v36.termRef(0);
        ESLVal $290 = _v36.termRef(1);
        ESLVal $289 = _v36.termRef(2);
        
        {ESLVal l = $291;
        
        {ESLVal n = $290;
        
        {ESLVal _v504 = $289;
        
        return updateType(l,n,_v504,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "Var": {ESLVal $288 = _v36.termRef(0);
        ESLVal $287 = _v36.termRef(1);
        
        {ESLVal l = $288;
        
        {ESLVal n = $287;
        
        return varType(l,n,valueEnv,typeEnv);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(22389,27313)").add(ESLVal.list(_v36)));
    }
    }
  }
  private static ESLVal expType1 = new ESLVal(new Function(new ESLVal("expType1"),null) { public ESLVal apply(ESLVal... args) { return expType1(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal throwType(ESLVal l,ESLVal t,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal valType = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      return substTypeEnv(typeEnv,t);
    }
  }
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),null) { public ESLVal apply(ESLVal... args) { return throwType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal foldType(ESLVal l,ESLVal t,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal eType = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(substTypeEnv(typeEnv,t),eType).boolVal)
      return eType;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("fold type ").add(ppType(t,typeEnv).add(new ESLVal(" does not equal ").add(ppType(eType,typeEnv))))));
    }
  }
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),null) { public ESLVal apply(ESLVal... args) { return foldType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal unfoldTypeExp(ESLVal l,ESLVal t,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal eType = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal recType = substTypeEnv(typeEnv,t);
      
      {ESLVal _v38 = recType;
      
      switch(_v38.termName) {
      case "RecType": {ESLVal $425 = _v38.termRef(0);
        ESLVal $424 = _v38.termRef(1);
        ESLVal $423 = _v38.termRef(2);
        
        {ESLVal rl = $425;
        
        {ESLVal n = $424;
        
        {ESLVal _v502 = $423;
        
        if(typeEqual(substType(eType,n,_v502),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("unfold type ").add(ppType(substType(eType,n,_v502),typeEnv).add(new ESLVal(" does not equal ").add(ppType(eType,typeEnv))))));
      }
      }
      }
      }
      default: {ESLVal _v503 = _v38;
        
        return error(new ESLVal("TypeError",l,new ESLVal("unfold type expects a rec type").add(ppType(recType,typeEnv))));
      }
    }
    }
    }
  }
  private static ESLVal unfoldTypeExp = new ESLVal(new Function(new ESLVal("unfoldTypeExp"),null) { public ESLVal apply(ESLVal... args) { return unfoldTypeExp(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal arrayUpdateType(ESLVal l,ESLVal a,ESLVal i,ESLVal v,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal aType = expType(a,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal iType = expType(i,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal vType = expType(v,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v39 = aType;
      
      switch(_v39.termName) {
      case "ArrayType": {ESLVal $427 = _v39.termRef(0);
        ESLVal $426 = _v39.termRef(1);
        
        {ESLVal al = $427;
        
        {ESLVal t = $426;
        
        if(isIntType(iType).boolVal)
        if(typeEqual(vType,t).boolVal)
          return aType;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
        else
          return error(new ESLVal("TypeError",l,new ESLVal("array index should be an integer ").add(i)));
      }
      }
      }
      default: {ESLVal t = _v39;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting an array ").add(aType)));
      }
    }
    }
    }
  }
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),null) { public ESLVal apply(ESLVal... args) { return arrayUpdateType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal arrayRefType(ESLVal l,ESLVal a,ESLVal i,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal aType = expType(a,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal iType = expType(i,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v40 = aType;
      
      switch(_v40.termName) {
      case "ArrayType": {ESLVal $429 = _v40.termRef(0);
        ESLVal $428 = _v40.termRef(1);
        
        {ESLVal al = $429;
        
        {ESLVal t = $428;
        
        if(isIntType(iType).boolVal)
        return t;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("array index should be an integer ").add(i)));
      }
      }
      }
      default: {ESLVal t = _v40;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting an array ").add(aType)));
      }
    }
    }
    }
  }
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),null) { public ESLVal apply(ESLVal... args) { return arrayRefType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal newArrayType(ESLVal l,ESLVal t,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal i = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isIntType(i).boolVal)
      return new ESLVal("ArrayType",l,substTypeEnv(typeEnv,t));
      else
        return error(new ESLVal("TypeError",l,new ESLVal("expecting an integer type: ").add(i)));
    }
  }
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),null) { public ESLVal apply(ESLVal... args) { return newArrayType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal becomeType(ESLVal l,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal bType = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(bType,selfType).boolVal)
      return bType;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("expecting become to match self type: ").add(ppType(bType,typeEnv).add(new ESLVal(" ").add(ppType(selfType,typeEnv))))));
    }
  }
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),null) { public ESLVal apply(ESLVal... args) { return becomeType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal probablyType(ESLVal l,ESLVal p,ESLVal t,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal pt = expType(p,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isIntType(pt).boolVal)
      {ESLVal _v499 = substTypeEnv(typeEnv,t);
        ESLVal _v500 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
        ESLVal _v501 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
        
        if(typeEqual(_v499,_v500).and(typeEqual(_v499,_v501)).boolVal)
        return _v499;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("expecting probably arm types to agree: ").add(ppType(_v500,typeEnv).add(new ESLVal(" ").add(ppType(_v499,typeEnv).add(new ESLVal(" ").add(ppType(_v501,typeEnv))))))));
      }
      else
        return error(new ESLVal("TypeError",l,new ESLVal("expecting an integer: ").add(ppType(pt,typeEnv))));
    }
  }
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),null) { public ESLVal apply(ESLVal... args) { return probablyType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal newType(ESLVal l,ESLVal b,ESLVal args,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    return expType(new ESLVal("Apply",l,b,args),selfType,valueEnv,cnstrEnv,typeEnv);
  }
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),null) { public ESLVal apply(ESLVal... args) { return newType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal sendType(ESLVal l,ESLVal target,ESLVal n,ESLVal args,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v41 = typeNF(derefType(expType(target,selfType,valueEnv,cnstrEnv,typeEnv)),typeEnv);
      
      switch(_v41.termName) {
      case "ActType": {ESLVal $432 = _v41.termRef(0);
        ESLVal $431 = _v41.termRef(1);
        ESLVal $430 = _v41.termRef(2);
        
        {ESLVal al = $432;
        
        {ESLVal exports = $431;
        
        {ESLVal handlers = $430;
        
        { LetRec letrec = new LetRec() {
        ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v489 = $args[0];
          {ESLVal _v42 = _v489;
                
                if(_v42.isCons())
                {ESLVal $433 = _v42.head();
                  ESLVal $434 = _v42.tail();
                  
                  switch($433.termName) {
                  case "MessageType": {ESLVal $436 = $433.termRef(0);
                    ESLVal $435 = $433.termRef(1);
                    
                    if($435.isCons())
                    {ESLVal $437 = $435.head();
                      ESLVal $438 = $435.tail();
                      
                      switch($437.termName) {
                      case "TermType": {ESLVal $441 = $437.termRef(0);
                        ESLVal $440 = $437.termRef(1);
                        ESLVal $439 = $437.termRef(2);
                        
                        if($438.isCons())
                        {ESLVal $442 = $438.head();
                          ESLVal $443 = $438.tail();
                          
                          {ESLVal m = $433;
                          
                          {ESLVal _v490 = $434;
                          
                          return findHandler.apply(_v490);
                        }
                        }
                        }
                      else if($438.isNil())
                        {ESLVal ml = $436;
                          
                          {ESLVal tl = $441;
                          
                          {ESLVal m = $440;
                          
                          {ESLVal ts = $439;
                          
                          {ESLVal rest = $434;
                          
                          if(m.eql(n).boolVal)
                          return head.apply(_v489);
                          else
                            {ESLVal _v491 = $433;
                              
                              {ESLVal _v492 = $434;
                              
                              return findHandler.apply(_v492);
                            }
                            }
                        }
                        }
                        }
                        }
                        }
                      else {ESLVal m = $433;
                          
                          {ESLVal _v493 = $434;
                          
                          return findHandler.apply(_v493);
                        }
                        }
                      }
                      default: {ESLVal m = $433;
                        
                        {ESLVal _v494 = $434;
                        
                        return findHandler.apply(_v494);
                      }
                      }
                    }
                    }
                  else if($435.isNil())
                    {ESLVal m = $433;
                      
                      {ESLVal _v495 = $434;
                      
                      return findHandler.apply(_v495);
                    }
                    }
                  else {ESLVal m = $433;
                      
                      {ESLVal _v496 = $434;
                      
                      return findHandler.apply(_v496);
                    }
                    }
                  }
                  default: {ESLVal m = $433;
                    
                    {ESLVal _v497 = $434;
                    
                    return findHandler.apply(_v497);
                  }
                  }
                }
                }
              else if(_v42.isNil())
                return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n)));
              else return error(new ESLVal("case error at Pos(31507,31814)").add(ESLVal.list(_v42)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "findHandler": return findHandler;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal findHandler = letrec.get("findHandler");
      
        {ESLVal _v43 = findHandler.apply(handlers);
        
        switch(_v43.termName) {
        case "MessageType": {ESLVal $445 = _v43.termRef(0);
          ESLVal $444 = _v43.termRef(1);
          
          if($444.isCons())
          {ESLVal $446 = $444.head();
            ESLVal $447 = $444.tail();
            
            switch($446.termName) {
            case "TermType": {ESLVal $450 = $446.termRef(0);
              ESLVal $449 = $446.termRef(1);
              ESLVal $448 = $446.termRef(2);
              
              if($447.isCons())
              {ESLVal $451 = $447.head();
                ESLVal $452 = $447.tail();
                
                {ESLVal m = _v43;
                
                return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
              }
              }
            else if($447.isNil())
              {ESLVal ml = $445;
                
                {ESLVal tl = $450;
                
                {ESLVal _v498 = $449;
                
                {ESLVal ts1 = $448;
                
                {ESLVal ts2 = expTypes(args,selfType,valueEnv,cnstrEnv,typeEnv);
                
                if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                if(subTypes(ts2,ts1).boolVal)
                  {expType(target,selfType,valueEnv,cnstrEnv,typeEnv);
                  return theTypeVoid;}
                  else
                    return error(new ESLVal("TypeError",l,new ESLVal("message argument types ").add(ppTypes(ts2,typeEnv).add(new ESLVal(" do not match expected types ").add(ppTypes(ts1,typeEnv))))));
                else
                  return error(new ESLVal("TypeError",l,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
              }
              }
              }
              }
              }
            else {ESLVal m = _v43;
                
                return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            default: {ESLVal m = _v43;
              
              return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          }
        else if($444.isNil())
          {ESLVal m = _v43;
            
            return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
          }
        else {ESLVal m = _v43;
            
            return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        default: {ESLVal m = _v43;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot find message handler named ").add(n.add(new ESLVal(" in ").add(handlers)))));
        }
      }
      }}
      
      }
      }
      }
      }
      default: {ESLVal t = _v41;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a behaviour type: ").add(typeNF(derefType(expType(target,selfType,valueEnv,cnstrEnv,typeEnv)),typeEnv))));
      }
    }
    }
  }
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),null) { public ESLVal apply(ESLVal... args) { return sendType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal actType(ESLVal l,ESLVal n,ESLVal args,ESLVal parent,ESLVal exports,ESLVal bindings,ESLVal init,ESLVal arms,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    { LetRec letrec = new LetRec() {
      ESLVal checkObservedMessage = new ESLVal(new Function(new ESLVal("checkObservedMessage"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v44 = bindings;
              
              return $ndCase.apply(_v44,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $454 = $args[0];
              ESLVal $455 = $args[1];
              ESLVal $456 = $args[2];
              ESLVal $453 = $args[3];
              switch($455.termName) {
                    case "FunBind": {ESLVal $463 = $455.termRef(0);
                      ESLVal $462 = $455.termRef(1);
                      ESLVal $461 = $455.termRef(2);
                      ESLVal $460 = $455.termRef(3);
                      ESLVal $459 = $455.termRef(4);
                      ESLVal $458 = $455.termRef(5);
                      ESLVal $457 = $455.termRef(6);
                      
                      switch($462.strVal) {
                      case "observeMessage": {ESLVal bs1 = $454;
                        
                        {ESLVal _v481 = $463;
                        
                        {ESLVal ps = $461;
                        
                        {ESLVal t = $460;
                        
                        {ESLVal st = $459;
                        
                        {ESLVal g = $458;
                        
                        {ESLVal e = $457;
                        
                        {ESLVal bs2 = $456;
                        
                        {ESLVal _v45 = typeNF(t,typeEnv);
                        
                        switch(_v45.termName) {
                        case "FunType": {ESLVal $466 = _v45.termRef(0);
                          ESLVal $465 = _v45.termRef(1);
                          ESLVal $464 = _v45.termRef(2);
                          
                          if($465.isCons())
                          {ESLVal $467 = $465.head();
                            ESLVal $468 = $465.tail();
                            
                            if($468.isCons())
                            {ESLVal $469 = $468.head();
                              ESLVal $470 = $468.tail();
                              
                              {ESLVal _v482 = _v45;
                              
                              return error(new ESLVal("TypeError",_v481,new ESLVal("expecting observeMessage to have a type signature (In) -> Maybe[Out]")));
                            }
                            }
                          else if($468.isNil())
                            {ESLVal fl = $466;
                              
                              {ESLVal d = $467;
                              
                              {ESLVal r = $464;
                              
                              return checkObserveMessageDeclaration.apply(_v481,d,r);
                            }
                            }
                            }
                          else {ESLVal _v483 = _v45;
                              
                              return error(new ESLVal("TypeError",_v481,new ESLVal("expecting observeMessage to have a type signature (In) -> Maybe[Out]")));
                            }
                          }
                        else if($465.isNil())
                          {ESLVal _v484 = _v45;
                            
                            return error(new ESLVal("TypeError",_v481,new ESLVal("expecting observeMessage to have a type signature (In) -> Maybe[Out]")));
                          }
                        else {ESLVal _v485 = _v45;
                            
                            return error(new ESLVal("TypeError",_v481,new ESLVal("expecting observeMessage to have a type signature (In) -> Maybe[Out]")));
                          }
                        }
                        default: {ESLVal _v486 = _v45;
                          
                          return error(new ESLVal("TypeError",_v481,new ESLVal("expecting observeMessage to have a type signature (In) -> Maybe[Out]")));
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
                      default: return $453.apply();
                    }
                    }
                    default: return $453.apply();
                  }
                }
              }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal bs = _v44;
                    
                    return $null;
                  }
                }
              }));
            }
          }
        });
      ESLVal isTime = new ESLVal(new Function(new ESLVal("isTime"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        {ESLVal _v46 = t;
              
              switch(_v46.termName) {
              case "TermType": {ESLVal $473 = _v46.termRef(0);
                ESLVal $472 = _v46.termRef(1);
                ESLVal $471 = _v46.termRef(2);
                
                switch($472.strVal) {
                case "Time": {ESLVal _v478 = $473;
                  
                  {ESLVal ts = $471;
                  
                  return $true;
                }
                }
                default: {ESLVal _v479 = _v46;
                  
                  return $false;
                }
              }
              }
              default: {ESLVal _v480 = _v46;
                
                return $false;
              }
            }
            }
          }
        });
      ESLVal checkObserveMessageDeclaration = new ESLVal(new Function(new ESLVal("checkObserveMessageDeclaration"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v475 = $args[0];
        ESLVal _v476 = $args[1];
        ESLVal _v477 = $args[2];
        if(typeEqual(_v476,new ESLVal("UnionType",_v475,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v47 = $qualArg;
                  
                  switch(_v47.termName) {
                  case "MessageType": {ESLVal $475 = _v47.termRef(0);
                    ESLVal $474 = _v47.termRef(1);
                    
                    if($474.isCons())
                    {ESLVal $476 = $474.head();
                      ESLVal $477 = $474.tail();
                      
                      if($477.isCons())
                      {ESLVal $478 = $477.head();
                        ESLVal $479 = $477.tail();
                        
                        {ESLVal _0 = _v47;
                        
                        return $nil;
                      }
                      }
                    else if($477.isNil())
                      {ESLVal ml = $475;
                        
                        {ESLVal t = $476;
                        
                        return ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                          if(isTime.apply(t).not().boolVal)
                            return ESLVal.list(t);
                            else
                              return $nil;
                        }}.get());
                      }
                      }
                    else {ESLVal _0 = _v47;
                        
                        return $nil;
                      }
                    }
                  else if($474.isNil())
                    {ESLVal _0 = _v47;
                      
                      return $nil;
                    }
                  else {ESLVal _0 = _v47;
                      
                      return $nil;
                    }
                  }
                  default: {ESLVal _0 = _v47;
                    
                    return $nil;
                  }
                }
                }
              }
            }).map(getMessageTypes.apply(arms)).flatten().flatten())).boolVal)
              {ESLVal _v48 = typeNF(_v477,typeEnv);
                
                switch(_v48.termName) {
                case "UnionType": {ESLVal $481 = _v48.termRef(0);
                  ESLVal $480 = _v48.termRef(1);
                  
                  if($480.isCons())
                  {ESLVal $482 = $480.head();
                    ESLVal $483 = $480.tail();
                    
                    switch($482.termName) {
                    case "TermType": {ESLVal $486 = $482.termRef(0);
                      ESLVal $485 = $482.termRef(1);
                      ESLVal $484 = $482.termRef(2);
                      
                      switch($485.strVal) {
                      case "Something": if($484.isCons())
                        {ESLVal $487 = $484.head();
                          ESLVal $488 = $484.tail();
                          
                          if($488.isCons())
                          {ESLVal $489 = $488.head();
                            ESLVal $490 = $488.tail();
                            
                            {ESLVal ms = _v48;
                            
                            return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                          }
                          }
                        else if($488.isNil())
                          if($483.isCons())
                            {ESLVal $491 = $483.head();
                              ESLVal $492 = $483.tail();
                              
                              switch($491.termName) {
                              case "TermType": {ESLVal $495 = $491.termRef(0);
                                ESLVal $494 = $491.termRef(1);
                                ESLVal $493 = $491.termRef(2);
                                
                                switch($494.strVal) {
                                case "Nothing": if($493.isCons())
                                  {ESLVal $496 = $493.head();
                                    ESLVal $497 = $493.tail();
                                    
                                    {ESLVal ms = _v48;
                                    
                                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                  }
                                  }
                                else if($493.isNil())
                                  if($492.isCons())
                                    {ESLVal $498 = $492.head();
                                      ESLVal $499 = $492.tail();
                                      
                                      {ESLVal ms = _v48;
                                      
                                      return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                    }
                                    }
                                  else if($492.isNil())
                                    {ESLVal ul = $481;
                                      
                                      {ESLVal l1 = $486;
                                      
                                      {ESLVal t = $487;
                                      
                                      {ESLVal l2 = $495;
                                      
                                      return $null;
                                    }
                                    }
                                    }
                                    }
                                  else {ESLVal ms = _v48;
                                      
                                      return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                    }
                                else {ESLVal ms = _v48;
                                    
                                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                  }
                                default: {ESLVal ms = _v48;
                                  
                                  return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                }
                              }
                              }
                              default: {ESLVal ms = _v48;
                                
                                return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                              }
                            }
                            }
                          else if($483.isNil())
                            {ESLVal ms = _v48;
                              
                              return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                            }
                          else {ESLVal ms = _v48;
                              
                              return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                            }
                        else {ESLVal ms = _v48;
                            
                            return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                          }
                        }
                      else if($484.isNil())
                        {ESLVal ms = _v48;
                          
                          return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                        }
                      else {ESLVal ms = _v48;
                          
                          return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                        }
                    case "Nothing": if($484.isCons())
                        {ESLVal $500 = $484.head();
                          ESLVal $501 = $484.tail();
                          
                          {ESLVal ms = _v48;
                          
                          return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                        }
                        }
                      else if($484.isNil())
                        if($483.isCons())
                          {ESLVal $502 = $483.head();
                            ESLVal $503 = $483.tail();
                            
                            switch($502.termName) {
                            case "TermType": {ESLVal $506 = $502.termRef(0);
                              ESLVal $505 = $502.termRef(1);
                              ESLVal $504 = $502.termRef(2);
                              
                              switch($505.strVal) {
                              case "Something": if($504.isCons())
                                {ESLVal $507 = $504.head();
                                  ESLVal $508 = $504.tail();
                                  
                                  if($508.isCons())
                                  {ESLVal $509 = $508.head();
                                    ESLVal $510 = $508.tail();
                                    
                                    {ESLVal ms = _v48;
                                    
                                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                  }
                                  }
                                else if($508.isNil())
                                  if($503.isCons())
                                    {ESLVal $511 = $503.head();
                                      ESLVal $512 = $503.tail();
                                      
                                      {ESLVal ms = _v48;
                                      
                                      return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                    }
                                    }
                                  else if($503.isNil())
                                    {ESLVal ul = $481;
                                      
                                      {ESLVal l2 = $486;
                                      
                                      {ESLVal l1 = $506;
                                      
                                      {ESLVal t = $507;
                                      
                                      return $null;
                                    }
                                    }
                                    }
                                    }
                                  else {ESLVal ms = _v48;
                                      
                                      return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                    }
                                else {ESLVal ms = _v48;
                                    
                                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                  }
                                }
                              else if($504.isNil())
                                {ESLVal ms = _v48;
                                  
                                  return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                }
                              else {ESLVal ms = _v48;
                                  
                                  return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                                }
                              default: {ESLVal ms = _v48;
                                
                                return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                              }
                            }
                            }
                            default: {ESLVal ms = _v48;
                              
                              return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                            }
                          }
                          }
                        else if($483.isNil())
                          {ESLVal ms = _v48;
                            
                            return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                          }
                        else {ESLVal ms = _v48;
                            
                            return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                          }
                      else {ESLVal ms = _v48;
                          
                          return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                        }
                      default: {ESLVal ms = _v48;
                        
                        return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                      }
                    }
                    }
                    default: {ESLVal ms = _v48;
                      
                      return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                    }
                  }
                  }
                else if($480.isNil())
                  {ESLVal ms = _v48;
                    
                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                  }
                else {ESLVal ms = _v48;
                    
                    return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                  }
                }
                default: {ESLVal ms = _v48;
                  
                  return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must return a value of type Maybe: ").add(_v477)));
                }
              }
              }
              else
                return error(new ESLVal("TypeError",_v475,new ESLVal("observeMessage must have an arg type that matches the message types of the behaviour type: ").add(ppType(_v476,typeEnv).add(new ESLVal(" <> ").add(ppType(new ESLVal("UnionType",_v475,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal $qualArg = $args[0];
                  {ESLVal _v49 = $qualArg;
                        
                        switch(_v49.termName) {
                        case "MessageType": {ESLVal $514 = _v49.termRef(0);
                          ESLVal $513 = _v49.termRef(1);
                          
                          if($513.isCons())
                          {ESLVal $515 = $513.head();
                            ESLVal $516 = $513.tail();
                            
                            if($516.isCons())
                            {ESLVal $517 = $516.head();
                              ESLVal $518 = $516.tail();
                              
                              {ESLVal _0 = _v49;
                              
                              return $nil;
                            }
                            }
                          else if($516.isNil())
                            {ESLVal ml = $514;
                              
                              {ESLVal t = $515;
                              
                              return ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                                if(isTime.apply(t).not().boolVal)
                                  return ESLVal.list(t);
                                  else
                                    return $nil;
                              }}.get());
                            }
                            }
                          else {ESLVal _0 = _v49;
                              
                              return $nil;
                            }
                          }
                        else if($513.isNil())
                          {ESLVal _0 = _v49;
                            
                            return $nil;
                          }
                        else {ESLVal _0 = _v49;
                            
                            return $nil;
                          }
                        }
                        default: {ESLVal _0 = _v49;
                          
                          return $nil;
                        }
                      }
                      }
                    }
                  }).map(getMessageTypes.apply(arms)).flatten().flatten()),typeEnv))))));
          }
        });
      ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v466 = $args[0];
        ESLVal _v467 = $args[1];
        {ESLVal _v50 = _v467;
              
              if(_v50.isCons())
              {ESLVal $519 = _v50.head();
                ESLVal $520 = _v50.tail();
                
                switch($519.termName) {
                case "Binding": {ESLVal $532 = $519.termRef(0);
                  ESLVal $531 = $519.termRef(1);
                  ESLVal $530 = $519.termRef(2);
                  ESLVal $529 = $519.termRef(3);
                  ESLVal $528 = $519.termRef(4);
                  
                  {ESLVal _v471 = $532;
                  
                  {ESLVal m = $531;
                  
                  {ESLVal t = $530;
                  
                  {ESLVal st = $529;
                  
                  {ESLVal e = $528;
                  
                  {ESLVal _v472 = $520;
                  
                  if(m.eql(_v466).boolVal)
                  return _v471;
                  else
                    {ESLVal b = $519;
                      
                      {ESLVal _v473 = $520;
                      
                      return findLoc.apply(_v466,_v473);
                    }
                    }
                }
                }
                }
                }
                }
                }
                }
              case "FunBind": {ESLVal $527 = $519.termRef(0);
                  ESLVal $526 = $519.termRef(1);
                  ESLVal $525 = $519.termRef(2);
                  ESLVal $524 = $519.termRef(3);
                  ESLVal $523 = $519.termRef(4);
                  ESLVal $522 = $519.termRef(5);
                  ESLVal $521 = $519.termRef(6);
                  
                  {ESLVal _v468 = $527;
                  
                  {ESLVal m = $526;
                  
                  {ESLVal ps = $525;
                  
                  {ESLVal t = $524;
                  
                  {ESLVal st = $523;
                  
                  {ESLVal g = $522;
                  
                  {ESLVal e = $521;
                  
                  {ESLVal _v469 = $520;
                  
                  if(m.eql(_v466).boolVal)
                  return _v468;
                  else
                    {ESLVal b = $519;
                      
                      {ESLVal _v470 = $520;
                      
                      return findLoc.apply(_v466,_v470);
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
                default: {ESLVal b = $519;
                  
                  {ESLVal _v474 = $520;
                  
                  return findLoc.apply(_v466,_v474);
                }
                }
              }
              }
            else if(_v50.isNil())
              return p0;
            else return error(new ESLVal("case error at Pos(34603,34907)").add(ESLVal.list(_v50)));
            }
          }
        });
      ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v457 = $args[0];
        ESLVal _v458 = $args[1];
        {ESLVal _v51 = _v458;
              
              if(_v51.isCons())
              {ESLVal $533 = _v51.head();
                ESLVal $534 = _v51.tail();
                
                switch($533.termName) {
                case "Binding": {ESLVal $546 = $533.termRef(0);
                  ESLVal $545 = $533.termRef(1);
                  ESLVal $544 = $533.termRef(2);
                  ESLVal $543 = $533.termRef(3);
                  ESLVal $542 = $533.termRef(4);
                  
                  {ESLVal _v462 = $546;
                  
                  {ESLVal m = $545;
                  
                  {ESLVal t = $544;
                  
                  {ESLVal st = $543;
                  
                  {ESLVal e = $542;
                  
                  {ESLVal _v463 = $534;
                  
                  if(m.eql(_v457).boolVal)
                  return substTypeEnv(typeEnv,t);
                  else
                    {ESLVal b = $533;
                      
                      {ESLVal _v464 = $534;
                      
                      return findType.apply(_v457,_v464);
                    }
                    }
                }
                }
                }
                }
                }
                }
                }
              case "FunBind": {ESLVal $541 = $533.termRef(0);
                  ESLVal $540 = $533.termRef(1);
                  ESLVal $539 = $533.termRef(2);
                  ESLVal $538 = $533.termRef(3);
                  ESLVal $537 = $533.termRef(4);
                  ESLVal $536 = $533.termRef(5);
                  ESLVal $535 = $533.termRef(6);
                  
                  {ESLVal _v459 = $541;
                  
                  {ESLVal m = $540;
                  
                  {ESLVal ps = $539;
                  
                  {ESLVal t = $538;
                  
                  {ESLVal st = $537;
                  
                  {ESLVal g = $536;
                  
                  {ESLVal e = $535;
                  
                  {ESLVal _v460 = $534;
                  
                  if(m.eql(_v457).boolVal)
                  return substTypeEnv(typeEnv,t);
                  else
                    {ESLVal b = $533;
                      
                      {ESLVal _v461 = $534;
                      
                      return findType.apply(_v457,_v461);
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
                default: {ESLVal b = $533;
                  
                  {ESLVal _v465 = $534;
                  
                  return findType.apply(_v457,_v465);
                }
                }
              }
              }
            else if(_v51.isNil())
              return $null;
            else return error(new ESLVal("case error at Pos(34961,35318)").add(ESLVal.list(_v51)));
            }
          }
        });
      ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v453 = $args[0];
        {ESLVal _v52 = _v453;
              
              if(_v52.isCons())
              {ESLVal $547 = _v52.head();
                ESLVal $548 = _v52.tail();
                
                {ESLVal m = $547;
                
                {ESLVal _v454 = $548;
                
                {ESLVal _v455 = findType.apply(m,bindings);
                ESLVal _v456 = findLoc.apply(m,bindings);
                
                if(_v455.eql($null).boolVal)
                return error(new ESLVal("TypeError",_v456,new ESLVal("cannot find exported name ").add(m)));
                else
                  return decs.apply(_v454).cons(new ESLVal("Dec",_v456,m,_v455,_v455));
              }
              }
              }
              }
            else if(_v52.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(35361,35692)").add(ESLVal.list(_v52)));
            }
          }
        });
      ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v450 = $args[0];
        {ESLVal _v53 = _v450;
              
              if(_v53.isCons())
              {ESLVal $549 = _v53.head();
                ESLVal $550 = _v53.tail();
                
                switch($549.termName) {
                case "BArm": {ESLVal $554 = $549.termRef(0);
                  ESLVal $553 = $549.termRef(1);
                  ESLVal $552 = $549.termRef(2);
                  ESLVal $551 = $549.termRef(3);
                  
                  {ESLVal _v451 = $554;
                  
                  {ESLVal ps = $553;
                  
                  {ESLVal g = $552;
                  
                  {ESLVal e = $551;
                  
                  {ESLVal _v452 = $550;
                  
                  return getMessageTypes.apply(_v452).cons(getMessageType.apply(ps));
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(35743,35898)").add(ESLVal.list(_v53)));
              }
              }
            else if(_v53.isNil())
              return $nil;
            else return error(new ESLVal("case error at Pos(35743,35898)").add(ESLVal.list(_v53)));
            }
          }
        });
      ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal ps = $args[0];
        {ESLVal _v54 = ps;
              
              if(_v54.isCons())
              {ESLVal $555 = _v54.head();
                ESLVal $556 = _v54.tail();
                
                switch($555.termName) {
                case "PTerm": {ESLVal $560 = $555.termRef(0);
                  ESLVal $559 = $555.termRef(1);
                  ESLVal $558 = $555.termRef(2);
                  ESLVal $557 = $555.termRef(3);
                  
                  if($556.isCons())
                  {ESLVal $561 = $556.head();
                    ESLVal $562 = $556.tail();
                    
                    return error(new ESLVal("case error at Pos(35948,36219)").add(ESLVal.list(_v54)));
                  }
                else if($556.isNil())
                  {ESLVal pl = $560;
                    
                    {ESLVal termName = $559;
                    
                    {ESLVal targs = $558;
                    
                    {ESLVal _v449 = $557;
                    
                    {ESLVal ts = map(new ESLVal(new Function(new ESLVal("fun182"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal p = $args[0];
                      return getPatternType(l,p,selfType,valueEnv,cnstrEnv,typeEnv);
                        }
                      }),_v449);
                    
                    return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                  }
                  }
                  }
                  }
                  }
                else return error(new ESLVal("case error at Pos(35948,36219)").add(ESLVal.list(_v54)));
                }
                default: return error(new ESLVal("case error at Pos(35948,36219)").add(ESLVal.list(_v54)));
              }
              }
            else if(_v54.isNil())
              return error(new ESLVal("case error at Pos(35948,36219)").add(ESLVal.list(_v54)));
            else return error(new ESLVal("case error at Pos(35948,36219)").add(ESLVal.list(_v54)));
            }
          }
        });
      ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v444 = $args[0];
        ESLVal _v445 = $args[1];
        ESLVal _v446 = $args[2];
        {ESLVal _v55 = _v444;
              
              if(_v55.isCons())
              {ESLVal $563 = _v55.head();
                ESLVal $564 = _v55.tail();
                
                switch($563.termName) {
                case "BArm": {ESLVal $568 = $563.termRef(0);
                  ESLVal $567 = $563.termRef(1);
                  ESLVal $566 = $563.termRef(2);
                  ESLVal $565 = $563.termRef(3);
                  
                  {ESLVal _v447 = $568;
                  
                  {ESLVal ps = $567;
                  
                  {ESLVal g = $566;
                  
                  {ESLVal e = $565;
                  
                  {ESLVal _v448 = $564;
                  
                  {typeCheckArm.apply(_v447,ps,g,e,_v445,_v446);
                return typeCheckArms.apply(_v448,_v445,_v446);}
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(36295,36522)").add(ESLVal.list(_v55)));
              }
              }
            else if(_v55.isNil())
              return $null;
            else return error(new ESLVal("case error at Pos(36295,36522)").add(ESLVal.list(_v55)));
            }
          }
        });
      ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v435 = $args[0];
        ESLVal _v436 = $args[1];
        ESLVal _v437 = $args[2];
        ESLVal _v438 = $args[3];
        ESLVal _v439 = $args[4];
        ESLVal _v440 = $args[5];
        {ESLVal _v56 = _v436;
              
              if(_v56.isCons())
              {ESLVal $569 = _v56.head();
                ESLVal $570 = _v56.tail();
                
                switch($569.termName) {
                case "PTerm": {ESLVal $574 = $569.termRef(0);
                  ESLVal $573 = $569.termRef(1);
                  ESLVal $572 = $569.termRef(2);
                  ESLVal $571 = $569.termRef(3);
                  
                  if($570.isCons())
                  {ESLVal $575 = $570.head();
                    ESLVal $576 = $570.tail();
                    
                    return error(new ESLVal("case error at Pos(36621,37070)").add(ESLVal.list(_v56)));
                  }
                else if($570.isNil())
                  {ESLVal pl = $574;
                    
                    {ESLVal termName = $573;
                    
                    {ESLVal targs = $572;
                    
                    {ESLVal _v441 = $571;
                    
                    {ESLVal ts = map(new ESLVal(new Function(new ESLVal("fun183"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal p = $args[0];
                      return getPatternType(_v435,p,_v439,_v440,cnstrEnv,typeEnv);
                        }
                      }),_v441);
                    
                    {patternTypes(_v435,_v441,ts,_v439,_v440,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun184"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v442 = $args[0];
                  ESLVal _v443 = $args[1];
                  return expType(_v438,_v439,_v443,cnstrEnv,typeEnv);
                    }
                  }));
                  return $null;}
                  }
                  }
                  }
                  }
                  }
                else return error(new ESLVal("case error at Pos(36621,37070)").add(ESLVal.list(_v56)));
                }
                default: return error(new ESLVal("case error at Pos(36621,37070)").add(ESLVal.list(_v56)));
              }
              }
            else if(_v56.isNil())
              return error(new ESLVal("case error at Pos(36621,37070)").add(ESLVal.list(_v56)));
            else return error(new ESLVal("case error at Pos(36621,37070)").add(ESLVal.list(_v56)));
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "checkObservedMessage": return checkObservedMessage;
          
          case "isTime": return isTime;
          
          case "checkObserveMessageDeclaration": return checkObserveMessageDeclaration;
          
          case "findLoc": return findLoc;
          
          case "findType": return findType;
          
          case "decs": return decs;
          
          case "getMessageTypes": return getMessageTypes;
          
          case "getMessageType": return getMessageType;
          
          case "typeCheckArms": return typeCheckArms;
          
          case "typeCheckArm": return typeCheckArm;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal checkObservedMessage = letrec.get("checkObservedMessage");
    
    ESLVal isTime = letrec.get("isTime");
    
    ESLVal checkObserveMessageDeclaration = letrec.get("checkObserveMessageDeclaration");
    
    ESLVal findLoc = letrec.get("findLoc");
    
    ESLVal findType = letrec.get("findType");
    
    ESLVal decs = letrec.get("decs");
    
    ESLVal getMessageTypes = letrec.get("getMessageTypes");
    
    ESLVal getMessageType = letrec.get("getMessageType");
    
    ESLVal typeCheckArms = letrec.get("typeCheckArms");
    
    ESLVal typeCheckArm = letrec.get("typeCheckArm");
    
      {ESLVal parentType = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(parent.eql($null).boolVal)
            return actType0;
            else
              return expType(parent,selfType,valueEnv,cnstrEnv,typeEnv);
        }}.get();
      ESLVal localEnv = parBind(bindings,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal exportedDecs = decs.apply(exports);
      
      {ESLVal messageTypes = getMessageTypes.apply(arms);
      
      {ESLVal _v487 = new ESLVal("ExtendedAct",l,parentType,exportedDecs,messageTypes);
      ESLVal _v488 = ESLVal.list(new ESLVal("Map",new ESLVal("$super"),parentType));
      
      {typeCheckExports(l,exportedDecs,bindings,_v487,localEnv.add(valueEnv),typeEnv,cnstrEnv);
    typeCheckValues(valueDefs(bindings),_v487,_v488.add(localEnv.add(valueEnv)),typeEnv,cnstrEnv);
    expType(init,_v487,_v488.add(localEnv.add(valueEnv)),cnstrEnv,typeEnv);
    typeCheckArms.apply(arms,_v487,_v488.add(localEnv.add(valueEnv)));
    checkObservedMessage.apply();
    return _v487;}
    }
    }
    }
    }}
    
  }
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),null) { public ESLVal apply(ESLVal... args) { return actType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11]); }});
  private static ESLVal typeCheckExports(ESLVal l,ESLVal exports,ESLVal defs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {{
      ESLVal _v57 = exports;
      while(_v57.isCons()) {
        ESLVal e = _v57.headVal;
        if(exists.apply(new ESLVal(new Function(new ESLVal("fun185"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal b = $args[0];
        return bindingName(b).eql(decName(e)).and(typeEqual(lookupType(decName(e),valueEnv),decType(e)));
          }
        }),defs).boolVal)
          {}
          else
            error(new ESLVal("TypeError",l,new ESLVal(" cannot find export for ").add(decName(e))));
        _v57 = _v57.tailVal;}
    }
    return $null;}
  }
  private static ESLVal typeCheckExports = new ESLVal(new Function(new ESLVal("typeCheckExports"),null) { public ESLVal apply(ESLVal... args) { return typeCheckExports(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal bTypeExports(ESLVal t) {
    
    {ESLVal _v58 = t;
      
      switch(_v58.termName) {
      case "ExtendedAct": {ESLVal $587 = _v58.termRef(0);
        ESLVal $586 = _v58.termRef(1);
        ESLVal $585 = _v58.termRef(2);
        ESLVal $584 = _v58.termRef(3);
        
        {ESLVal l = $587;
        
        {ESLVal parent = $586;
        
        {ESLVal exports = $585;
        
        {ESLVal message = $584;
        
        return bTypeExports(parent).add(exports);
      }
      }
      }
      }
      }
    case "ActType": {ESLVal $583 = _v58.termRef(0);
        ESLVal $582 = _v58.termRef(1);
        ESLVal $581 = _v58.termRef(2);
        
        {ESLVal l = $583;
        
        {ESLVal exports = $582;
        
        {ESLVal message = $581;
        
        return exports;
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $580 = _v58.termRef(0);
        
        {ESLVal f = $580;
        
        return bTypeExports(f.apply());
      }
      }
    case "RecType": {ESLVal $579 = _v58.termRef(0);
        ESLVal $578 = _v58.termRef(1);
        ESLVal $577 = _v58.termRef(2);
        
        {ESLVal l = $579;
        
        {ESLVal n = $578;
        
        {ESLVal _v434 = $577;
        
        return bTypeExports(substType(new ESLVal("RecType",l,n,_v434),n,_v434));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(38496,38906)").add(ESLVal.list(_v58)));
    }
    }
  }
  private static ESLVal bTypeExports = new ESLVal(new Function(new ESLVal("bTypeExports"),null) { public ESLVal apply(ESLVal... args) { return bTypeExports(args[0]); }});
  private static ESLVal cmpType(ESLVal l,ESLVal e,ESLVal qs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v59 = qs;
      
      if(_v59.isCons())
      {ESLVal $588 = _v59.head();
        ESLVal $589 = _v59.tail();
        
        switch($588.termName) {
        case "BQual": {ESLVal $594 = $588.termRef(0);
          ESLVal $593 = $588.termRef(1);
          ESLVal $592 = $588.termRef(2);
          
          {ESLVal _v429 = $594;
          
          {ESLVal p = $593;
          
          {ESLVal list = $592;
          
          {ESLVal _v430 = $589;
          
          {ESLVal lType = expType(list,selfType,valueEnv,cnstrEnv,typeEnv);
          
          {ESLVal _v60 = lType;
          
          switch(_v60.termName) {
          case "ListType": {ESLVal $596 = _v60.termRef(0);
            ESLVal $595 = _v60.termRef(1);
            
            {ESLVal ll = $596;
            
            {ESLVal t = $595;
            
            {ESLVal _v431 = _v430;
            
            return patternType(_v429,p,substTypeEnv(typeEnv,t),selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun186"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v432 = $args[0];
            ESLVal _v433 = $args[1];
            return cmpType(_v429,e,_v431,selfType,_v433,cnstrEnv,typeEnv);
              }
            }));
          }
          }
          }
          }
          default: {ESLVal t = _v60;
            
            return error(new ESLVal("TypeError",_v429,new ESLVal("qualifier binding expects a list: ").add(ppType(t,typeEnv))));
          }
        }
        }
        }
        }
        }
        }
        }
        }
      case "PQual": {ESLVal $591 = $588.termRef(0);
          ESLVal $590 = $588.termRef(1);
          
          {ESLVal _v427 = $591;
          
          {ESLVal b = $590;
          
          {ESLVal _v428 = $589;
          
          {ESLVal bType = expType(b,selfType,valueEnv,cnstrEnv,typeEnv);
          
          if(isBoolType(bType).boolVal)
          return cmpType(_v427,e,_v428,selfType,valueEnv,cnstrEnv,typeEnv);
          else
            return error(new ESLVal("TypeError",_v427,new ESLVal("qualifier expects a boolean type: ").add(ppType(bType,typeEnv))));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(39017,40003)").add(ESLVal.list(_v59)));
      }
      }
    else if(_v59.isNil())
      {ESLVal t = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
        
        return new ESLVal("ListType",l,t);
      }
    else return error(new ESLVal("case error at Pos(39017,40003)").add(ESLVal.list(_v59)));
    }
  }
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),null) { public ESLVal apply(ESLVal... args) { return cmpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal updateType(ESLVal l,ESLVal n,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t = lookupType(n,valueEnv);
      
      if(t.eql($null).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("unbound variable ").add(n)));
      else
        {ESLVal valueType = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
          
          if(subType(valueType,t).boolVal)
          return valueType;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of variable ").add(n.add(new ESLVal("::").add(ppType(t,typeEnv).add(new ESLVal(" does not agree with value type ").add(ppType(valueType,typeEnv))))))));
        }
    }
  }
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),null) { public ESLVal apply(ESLVal... args) { return updateType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal letType(ESLVal l,ESLVal bs,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal env = parBind(bs,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {{
      ESLVal _v61 = bs;
      while(_v61.isCons()) {
        ESLVal b = _v61.headVal;
        typeCheckDef(b,selfType,valueEnv,env.add(valueEnv),cnstrEnv,typeEnv);
        _v61 = _v61.tailVal;}
    }
    return expType(e,selfType,env.add(valueEnv),cnstrEnv,typeEnv);}
    }
  }
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),null) { public ESLVal apply(ESLVal... args) { return letType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal letrecType(ESLVal l,ESLVal bs,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal env = recBind(bs,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {{
      ESLVal _v62 = bs;
      while(_v62.isCons()) {
        ESLVal b = _v62.headVal;
        typeCheckDef(b,selfType,env.add(valueEnv),env.add(valueEnv),cnstrEnv,typeEnv);
        _v62 = _v62.tailVal;}
    }
    return expType(e,selfType,env.add(valueEnv),cnstrEnv,typeEnv);}
    }
  }
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),null) { public ESLVal apply(ESLVal... args) { return letrecType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal checkDupBindings(ESLVal bs) {
    
    {ESLVal _v63 = bs;
      
      if(_v63.isCons())
      {ESLVal $597 = _v63.head();
        ESLVal $598 = _v63.tail();
        
        {ESLVal b = $597;
        
        {ESLVal _v426 = $598;
        
        if(member.apply(bindingName(b),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal b = $l0.head();
            $l0 = $l0.tail();
            $v.add(bindingName(b));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(_v426)).boolVal)
        return error(new ESLVal("TypeError",bindingLoc(b),new ESLVal("duplicate definitions for ").add(bindingName(b))));
        else
          return checkDupBindings(_v426);
      }
      }
      }
    else if(_v63.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(41249,41514)").add(ESLVal.list(_v63)));
    }
  }
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),null) { public ESLVal apply(ESLVal... args) { return checkDupBindings(args[0]); }});
  private static ESLVal parBind(ESLVal bs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {checkDupBindings(bs);
    return valueDefsToTEnv(valueDefs(bs),selfType,valueEnv,cnstrEnv,typeEnv);}
  }
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),null) { public ESLVal apply(ESLVal... args) { return parBind(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal recBind(ESLVal bs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    return valueDefsToTEnv(valueDefs(bs),selfType,valueEnv,cnstrEnv,typeEnv);
  }
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),null) { public ESLVal apply(ESLVal... args) { return recBind(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal caseType(ESLVal l,ESLVal es,ESLVal arms,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal ts1 = expTypes(es,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal ts2 = armTypes(arms,ts1,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {checkCase(l,ts1,arms);
    if(allEqualTypes(head.apply(ts2),tail.apply(ts2)).boolVal)
      return head.apply(ts2);
      else
        return error(new ESLVal("TypeError",l,new ESLVal("case arm types do not agree: ").add(ppTypes(ts1,typeEnv).add(new ESLVal(" ").add(ppTypes(ts2,typeEnv))))));}
    }
    }
  }
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),null) { public ESLVal apply(ESLVal... args) { return caseType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal checkCase(ESLVal l,ESLVal valueTypes,ESLVal arms) {
    
    {ESLVal _v64 = valueTypes;
      
      if(_v64.isCons())
      {ESLVal $599 = _v64.head();
        ESLVal $600 = _v64.tail();
        
        switch($599.termName) {
        case "UnionType": {ESLVal $602 = $599.termRef(0);
          ESLVal $601 = $599.termRef(1);
          
          {ESLVal ul = $602;
          
          {ESLVal ts = $601;
          
          {ESLVal _v424 = $600;
          
          {checkUnionAgainstArms(l,ts,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v65 = $qualArg;
              
              switch(_v65.termName) {
              case "BArm": {ESLVal $606 = _v65.termRef(0);
                ESLVal $605 = _v65.termRef(1);
                ESLVal $604 = _v65.termRef(2);
                ESLVal $603 = _v65.termRef(3);
                
                {ESLVal bl = $606;
                
                {ESLVal patterns = $605;
                
                {ESLVal guard = $604;
                
                {ESLVal body = $603;
                
                return ESLVal.list(ESLVal.list(head.apply(patterns)));
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v65;
                
                return $nil;
              }
            }
            }
          }
        }).map(arms).flatten().flatten());
        return checkCase(l,_v424,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v66 = $qualArg;
                
                switch(_v66.termName) {
                case "BArm": {ESLVal $610 = _v66.termRef(0);
                  ESLVal $609 = _v66.termRef(1);
                  ESLVal $608 = _v66.termRef(2);
                  ESLVal $607 = _v66.termRef(3);
                  
                  {ESLVal bl = $610;
                  
                  {ESLVal patterns = $609;
                  
                  {ESLVal guard = $608;
                  
                  {ESLVal body = $607;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("BArm",bl,tail.apply(patterns),guard,body)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v66;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(arms).flatten().flatten());}
        }
        }
        }
        }
        default: {ESLVal t = $599;
          
          {ESLVal _v425 = $600;
          
          return checkCase(l,_v425,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v67 = $qualArg;
                
                switch(_v67.termName) {
                case "BArm": {ESLVal $614 = _v67.termRef(0);
                  ESLVal $613 = _v67.termRef(1);
                  ESLVal $612 = _v67.termRef(2);
                  ESLVal $611 = _v67.termRef(3);
                  
                  {ESLVal bl = $614;
                  
                  {ESLVal patterns = $613;
                  
                  {ESLVal guard = $612;
                  
                  {ESLVal body = $611;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("BArm",bl,tail.apply(patterns),guard,body)));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v67;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(arms).flatten().flatten());
        }
        }
      }
      }
    else if(_v64.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(42500,42938)").add(ESLVal.list(_v64)));
    }
  }
  private static ESLVal checkCase = new ESLVal(new Function(new ESLVal("checkCase"),null) { public ESLVal apply(ESLVal... args) { return checkCase(args[0],args[1],args[2]); }});
  private static ESLVal checkUnionAgainstArms(ESLVal l,ESLVal terms,ESLVal patterns) {
    
    {ESLVal isPVar = new ESLVal(new Function(new ESLVal("isPVar"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        {ESLVal _v68 = p;
              
              switch(_v68.termName) {
              case "PVar": {ESLVal $617 = _v68.termRef(0);
                ESLVal $616 = _v68.termRef(1);
                ESLVal $615 = _v68.termRef(2);
                
                {ESLVal _v423 = $617;
                
                {ESLVal n = $616;
                
                {ESLVal t = $615;
                
                return $true;
              }
              }
              }
              }
              default: {ESLVal x = _v68;
                
                return $false;
              }
            }
            }
          }
        });
      
      if(exists.apply(isPVar,patterns).not().boolVal)
      {ESLVal cnstrNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v69 = $qualArg;
                
                switch(_v69.termName) {
                case "TermType": {ESLVal $620 = _v69.termRef(0);
                  ESLVal $619 = _v69.termRef(1);
                  ESLVal $618 = _v69.termRef(2);
                  
                  {ESLVal tl = $620;
                  
                  {ESLVal n = $619;
                  
                  {ESLVal ts = $618;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                default: {ESLVal _0 = _v69;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(terms).flatten().flatten();
        ESLVal patternNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v70 = $qualArg;
                
                switch(_v70.termName) {
                case "PTerm": {ESLVal $624 = _v70.termRef(0);
                  ESLVal $623 = _v70.termRef(1);
                  ESLVal $622 = _v70.termRef(2);
                  ESLVal $621 = _v70.termRef(3);
                  
                  {ESLVal tl = $624;
                  
                  {ESLVal n = $623;
                  
                  {ESLVal ts = $622;
                  
                  {ESLVal ps = $621;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v70;
                  
                  return $nil;
                }
              }
              }
            }
          }).map(patterns).flatten().flatten();
        
        if(forall.apply(new ESLVal(new Function(new ESLVal("fun187"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal cnstrName = $args[0];
      return member.apply(cnstrName,patternNames);
        }
      }),cnstrNames).boolVal)
        return $null;
        else
          return addWarning(l,new ESLVal("case handles constructors ").add(joinBy(new ESLVal(44),patternNames).add(new ESLVal(" but is missing patterns matching constructors ").add(joinBy(new ESLVal(44),removeAll(patternNames,cnstrNames))))));
      }
      else
        return $null;
    }
  }
  private static ESLVal checkUnionAgainstArms = new ESLVal(new Function(new ESLVal("checkUnionAgainstArms"),null) { public ESLVal apply(ESLVal... args) { return checkUnionAgainstArms(args[0],args[1],args[2]); }});
  private static ESLVal tryType(ESLVal l,ESLVal e,ESLVal arms,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal ts1 = expTypes(ESLVal.list(e),selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal ts2 = armTypes(arms,ts1,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(allEqualTypes(head.apply(ts2),tail.apply(ts2)).boolVal)
      return head.apply(ts2);
      else
        return error(new ESLVal("TypeError",l,new ESLVal("try arm types do not agree: ").add(ppTypes(ts1,typeEnv).add(new ESLVal(" ").add(ppTypes(ts2,typeEnv))))));
    }
    }
  }
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),null) { public ESLVal apply(ESLVal... args) { return tryType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal armTypes(ESLVal arms,ESLVal ts,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v71 = arms;
      
      if(_v71.isCons())
      {ESLVal $625 = _v71.head();
        ESLVal $626 = _v71.tail();
        
        {ESLVal a = $625;
        
        {ESLVal _v422 = $626;
        
        return armTypes(_v422,ts,selfType,valueEnv,cnstrEnv,typeEnv).cons(armType(a,ts,selfType,valueEnv,cnstrEnv,typeEnv));
      }
      }
      }
    else if(_v71.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(44173,44342)").add(ESLVal.list(_v71)));
    }
  }
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),null) { public ESLVal apply(ESLVal... args) { return armTypes(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal armType(ESLVal arm,ESLVal ts,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v72 = arm;
      
      switch(_v72.termName) {
      case "BArm": {ESLVal $630 = _v72.termRef(0);
        ESLVal $629 = _v72.termRef(1);
        ESLVal $628 = _v72.termRef(2);
        ESLVal $627 = _v72.termRef(3);
        
        {ESLVal l = $630;
        
        {ESLVal ps = $629;
        
        {ESLVal guard = $628;
        
        {ESLVal exp = $627;
        
        {checkPatterns(l,ps);
      if(length.apply(ps).eql(length.apply(ts)).boolVal)
        return patternTypes(l,ps,ts,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun188"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v419 = $args[0];
          ESLVal _v420 = $args[1];
          return guardedExpType(l,guard,exp,selfType,_v420,cnstrEnv,typeEnv);
            }
          }));
        else
          return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(ts))))));}
      }
      }
      }
      }
      }
      default: {ESLVal _v421 = _v72;
        
        return error(new ESLVal("unexpected type of arm: ").add(_v421));
      }
    }
    }
  }
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),null) { public ESLVal apply(ESLVal... args) { return armType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal refType(ESLVal l,ESLVal e,ESLVal n,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    { LetRec letrec = new LetRec() {
      ESLVal t = derefType(expType(e,selfType,valueEnv,cnstrEnv,typeEnv));
      ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal decs = $args[0];
        {ESLVal _v73 = decs;
              
              if(_v73.isCons())
              {ESLVal $631 = _v73.head();
                ESLVal $632 = _v73.tail();
                
                switch($631.termName) {
                case "Dec": {ESLVal $636 = $631.termRef(0);
                  ESLVal $635 = $631.termRef(1);
                  ESLVal $634 = $631.termRef(2);
                  ESLVal $633 = $631.termRef(3);
                  
                  {ESLVal _v390 = $636;
                  
                  {ESLVal m = $635;
                  
                  {ESLVal t = $634;
                  
                  {ESLVal st = $633;
                  
                  {ESLVal _v391 = $632;
                  
                  if(m.eql(n).boolVal)
                  return t;
                  else
                    {ESLVal d = $631;
                      
                      {ESLVal _v392 = $632;
                      
                      return findExport.apply(_v392);
                    }
                    }
                }
                }
                }
                }
                }
                }
                default: {ESLVal d = $631;
                  
                  {ESLVal _v393 = $632;
                  
                  return findExport.apply(_v393);
                }
                }
              }
              }
            else if(_v73.isNil())
              return $null;
            else return error(new ESLVal("case error at Pos(45192,45365)").add(ESLVal.list(_v73)));
            }
          }
        });
      ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal fs = $args[0];
        {ESLVal _v74 = fs;
              
              if(_v74.isCons())
              {ESLVal $637 = _v74.head();
                ESLVal $638 = _v74.tail();
                
                switch($637.termName) {
                case "Dec": {ESLVal $642 = $637.termRef(0);
                  ESLVal $641 = $637.termRef(1);
                  ESLVal $640 = $637.termRef(2);
                  ESLVal $639 = $637.termRef(3);
                  
                  {ESLVal _v385 = $642;
                  
                  {ESLVal m = $641;
                  
                  {ESLVal t = $640;
                  
                  {ESLVal ds = $639;
                  
                  {ESLVal _v386 = $638;
                  
                  if(m.eql(n).boolVal)
                  return t;
                  else
                    {ESLVal _v387 = $637;
                      
                      {ESLVal _v388 = $638;
                      
                      return findField.apply(_v388);
                    }
                    }
                }
                }
                }
                }
                }
                }
                default: {ESLVal t = $637;
                  
                  {ESLVal _v389 = $638;
                  
                  return findField.apply(_v389);
                }
                }
              }
              }
            else if(_v74.isNil())
              return error(new ESLVal("TypeError",l,new ESLVal("cannot find field name ").add(n)));
            else return error(new ESLVal("case error at Pos(45406,45614)").add(ESLVal.list(_v74)));
            }
          }
        });
      ESLVal exportsObserve = new ESLVal(new Function(new ESLVal("exportsObserve"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal exports = $args[0];
        {ESLVal _v75 = exports;
              
              if(_v75.isCons())
              {ESLVal $643 = _v75.head();
                ESLVal $644 = _v75.tail();
                
                switch($643.termName) {
                case "Dec": {ESLVal $648 = $643.termRef(0);
                  ESLVal $647 = $643.termRef(1);
                  ESLVal $646 = $643.termRef(2);
                  ESLVal $645 = $643.termRef(3);
                  
                  switch($647.strVal) {
                  case "observeState": switch($646.termName) {
                    case "FunType": {ESLVal $651 = $646.termRef(0);
                      ESLVal $650 = $646.termRef(1);
                      ESLVal $649 = $646.termRef(2);
                      
                      if($650.isCons())
                      {ESLVal $652 = $650.head();
                        ESLVal $653 = $650.tail();
                        
                        {ESLVal d = $643;
                        
                        {ESLVal _v380 = $644;
                        
                        return exportsObserve.apply(_v380);
                      }
                      }
                      }
                    else if($650.isNil())
                      {ESLVal dl = $648;
                        
                        {ESLVal fl = $651;
                        
                        {ESLVal stateType = $649;
                        
                        {ESLVal dt = $645;
                        
                        {ESLVal x = $644;
                        
                        return $true;
                      }
                      }
                      }
                      }
                      }
                    else {ESLVal d = $643;
                        
                        {ESLVal _v381 = $644;
                        
                        return exportsObserve.apply(_v381);
                      }
                      }
                    }
                    default: {ESLVal d = $643;
                      
                      {ESLVal _v382 = $644;
                      
                      return exportsObserve.apply(_v382);
                    }
                    }
                  }
                  default: {ESLVal d = $643;
                    
                    {ESLVal _v383 = $644;
                    
                    return exportsObserve.apply(_v383);
                  }
                  }
                }
                }
                default: {ESLVal d = $643;
                  
                  {ESLVal _v384 = $644;
                  
                  return exportsObserve.apply(_v384);
                }
                }
              }
              }
            else if(_v75.isNil())
              return $false;
            else return error(new ESLVal("case error at Pos(45665,45824)").add(ESLVal.list(_v75)));
            }
          }
        });
      ESLVal getObserver = new ESLVal(new Function(new ESLVal("getObserver"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v369 = $args[0];
        ESLVal _v370 = $args[1];
        ESLVal _v371 = $args[2];
        {ESLVal _v76 = _v370;
              
              return $ndCase.apply(_v76,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $655 = $args[0];
              ESLVal $656 = $args[1];
              ESLVal $657 = $args[2];
              ESLVal $654 = $args[3];
              switch($656.termName) {
                    case "Dec": {ESLVal $661 = $656.termRef(0);
                      ESLVal $660 = $656.termRef(1);
                      ESLVal $659 = $656.termRef(2);
                      ESLVal $658 = $656.termRef(3);
                      
                      switch($660.strVal) {
                      case "observeState": switch($659.termName) {
                        case "FunType": {ESLVal $664 = $659.termRef(0);
                          ESLVal $663 = $659.termRef(1);
                          ESLVal $662 = $659.termRef(2);
                          
                          if($663.isCons())
                          {ESLVal $665 = $663.head();
                            ESLVal $666 = $663.tail();
                            
                            return $654.apply();
                          }
                        else if($663.isNil())
                          {ESLVal e1 = $655;
                            
                            {ESLVal dl = $661;
                            
                            {ESLVal fl = $664;
                            
                            {ESLVal stateType = $662;
                            
                            {ESLVal dt = $658;
                            
                            {ESLVal e2 = $657;
                            
                            {ESLVal _v77 = _v370;
                            
                            return $ndCase.apply(_v77,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                ESLVal $668 = $args[0];
                            ESLVal $669 = $args[1];
                            ESLVal $670 = $args[2];
                            ESLVal $667 = $args[3];
                            switch($669.termName) {
                                  case "Dec": {ESLVal $674 = $669.termRef(0);
                                    ESLVal $673 = $669.termRef(1);
                                    ESLVal $672 = $669.termRef(2);
                                    ESLVal $671 = $669.termRef(3);
                                    
                                    switch($673.strVal) {
                                    case "observeMessage": switch($672.termName) {
                                      case "FunType": {ESLVal $677 = $672.termRef(0);
                                        ESLVal $676 = $672.termRef(1);
                                        ESLVal $675 = $672.termRef(2);
                                        
                                        if($676.isCons())
                                        {ESLVal $678 = $676.head();
                                          ESLVal $679 = $676.tail();
                                          
                                          if($679.isCons())
                                          {ESLVal $680 = $679.head();
                                            ESLVal $681 = $679.tail();
                                            
                                            return $667.apply();
                                          }
                                        else if($679.isNil())
                                          {ESLVal _v372 = $668;
                                            
                                            {ESLVal _v373 = $674;
                                            
                                            {ESLVal _v374 = $677;
                                            
                                            {ESLVal t = $678;
                                            
                                            {ESLVal messageType = $675;
                                            
                                            {ESLVal _v375 = $671;
                                            
                                            {ESLVal _v376 = $670;
                                            
                                            {ESLVal _v78 = typeNF(messageType,typeEnv);
                                            
                                            switch(_v78.termName) {
                                            case "UnionType": {ESLVal $683 = _v78.termRef(0);
                                              ESLVal $682 = _v78.termRef(1);
                                              
                                              return $ndCase.apply($682,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
                                                public ESLVal apply(ESLVal... $args) {
                                                  ESLVal $685 = $args[0];
                                              ESLVal $686 = $args[1];
                                              ESLVal $687 = $args[2];
                                              ESLVal $684 = $args[3];
                                              switch($686.termName) {
                                                    case "TermType": {ESLVal $690 = $686.termRef(0);
                                                      ESLVal $689 = $686.termRef(1);
                                                      ESLVal $688 = $686.termRef(2);
                                                      
                                                      switch($689.strVal) {
                                                      case "Something": if($688.isCons())
                                                        {ESLVal $691 = $688.head();
                                                          ESLVal $692 = $688.tail();
                                                          
                                                          if($692.isCons())
                                                          {ESLVal $693 = $692.head();
                                                            ESLVal $694 = $692.tail();
                                                            
                                                            return $684.apply();
                                                          }
                                                        else if($692.isNil())
                                                          {ESLVal ul = $683;
                                                            
                                                            {ESLVal ts1 = $685;
                                                            
                                                            {ESLVal tl = $690;
                                                            
                                                            {ESLVal _v377 = $691;
                                                            
                                                            {ESLVal ts2 = $687;
                                                            
                                                            return new ESLVal("ObserverType",_v369,stateType,_v377);
                                                          }
                                                          }
                                                          }
                                                          }
                                                          }
                                                        else return $684.apply();
                                                        }
                                                      else if($688.isNil())
                                                        return $684.apply();
                                                      else return $684.apply();
                                                      default: return $684.apply();
                                                    }
                                                    }
                                                    default: return $684.apply();
                                                  }
                                                }
                                              }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                                                public ESLVal apply(ESLVal... $args) {
                                                  {ESLVal _v378 = _v78;
                                                    
                                                    return error(new ESLVal("TypeError",_v369,new ESLVal("cannot find Something(t) for the message type: ").add(typeNF(messageType,typeEnv))));
                                                  }
                                                }
                                              }));
                                            }
                                            default: {ESLVal _v379 = _v78;
                                              
                                              return error(new ESLVal("TypeError",_v369,new ESLVal("cannot find Something(t) for the message type: ").add(typeNF(messageType,typeEnv))));
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
                                        else return $667.apply();
                                        }
                                      else if($676.isNil())
                                        return $667.apply();
                                      else return $667.apply();
                                      }
                                      default: return $667.apply();
                                    }
                                    default: return $667.apply();
                                  }
                                  }
                                  default: return $667.apply();
                                }
                              }
                            }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                return error(new ESLVal("case error at Pos(45998,46420)").add(ESLVal.list(_v77)));
                              }
                            }));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return $654.apply();
                        }
                        default: return $654.apply();
                      }
                      default: return $654.apply();
                    }
                    }
                    default: return $654.apply();
                  }
                }
              }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal es = _v76;
                    
                    return $null;
                  }
                }
              }));
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "t": return t;
          
          case "findExport": return findExport;
          
          case "findField": return findField;
          
          case "exportsObserve": return exportsObserve;
          
          case "getObserver": return getObserver;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal t = letrec.get("t");
    
    ESLVal findExport = letrec.get("findExport");
    
    ESLVal findField = letrec.get("findField");
    
    ESLVal exportsObserve = letrec.get("exportsObserve");
    
    ESLVal getObserver = letrec.get("getObserver");
    
      {ESLVal _v79 = typeNF(t,typeEnv);
      
      switch(_v79.termName) {
      case "StrType": {ESLVal $708 = _v79.termRef(0);
        
        {ESLVal sl = $708;
        
        if(n.eql(new ESLVal("explode")).boolVal)
        return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
        else
          {ESLVal _v416 = $708;
            
            if(n.eql(new ESLVal("writeDate")).boolVal)
            return theTypeFloat;
            else
              {ESLVal _v417 = _v79;
                
                return error(new ESLVal("TypeError",l,new ESLVal("expecting a record type, but received ").add(ppType(_v417,typeEnv))));
              }
          }
      }
      }
    case "TableType": {ESLVal $707 = _v79.termRef(0);
        ESLVal $706 = _v79.termRef(1);
        ESLVal $705 = _v79.termRef(2);
        
        {ESLVal _v399 = $707;
        
        {ESLVal k = $706;
        
        {ESLVal v = $705;
        
        if(n.eql(new ESLVal("get")).boolVal)
        return new ESLVal("FunType",_v399,ESLVal.list(k),v);
        else
          {ESLVal _v400 = $707;
            
            {ESLVal _v401 = $706;
            
            {ESLVal _v402 = $705;
            
            if(n.eql(new ESLVal("put")).boolVal)
            return new ESLVal("FunType",_v400,ESLVal.list(_v401,_v402),t);
            else
              {ESLVal _v403 = $707;
                
                {ESLVal _v404 = $706;
                
                {ESLVal _v405 = $705;
                
                if(n.eql(new ESLVal("keys")).boolVal)
                return new ESLVal("ListType",_v403,_v404);
                else
                  {ESLVal _v406 = $707;
                    
                    {ESLVal _v407 = $706;
                    
                    {ESLVal _v408 = $705;
                    
                    if(n.eql(new ESLVal("vals")).boolVal)
                    return new ESLVal("ListType",_v406,_v408);
                    else
                      {ESLVal _v409 = $707;
                        
                        {ESLVal _v410 = $706;
                        
                        {ESLVal _v411 = $705;
                        
                        if(n.eql(new ESLVal("hasKey")).boolVal)
                        return new ESLVal("FunType",_v409,ESLVal.list(_v410),theTypeBool);
                        else
                          {ESLVal _v412 = $707;
                            
                            {ESLVal _v413 = $706;
                            
                            {ESLVal _v414 = $705;
                            
                            if(n.eql(new ESLVal("clear")).boolVal)
                            return new ESLVal("FunType",_v412,$nil,theTypeVoid);
                            else
                              {ESLVal _v415 = _v79;
                                
                                return error(new ESLVal("TypeError",_v412,new ESLVal("expecting a record type, but received ").add(ppType(_v415,typeEnv))));
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
          }
          }
          }
      }
      }
      }
      }
    case "ListType": {ESLVal $704 = _v79.termRef(0);
        ESLVal $703 = _v79.termRef(1);
        
        {ESLVal ll = $704;
        
        {ESLVal _v397 = $703;
        
        if(n.eql(new ESLVal("implode")).boolVal)
        return theTypeStr;
        else
          {ESLVal _v398 = _v79;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a record type, but received ").add(ppType(_v398,typeEnv))));
          }
      }
      }
      }
    case "RecordType": {ESLVal $702 = _v79.termRef(0);
        ESLVal $701 = _v79.termRef(1);
        
        {ESLVal rl = $702;
        
        {ESLVal fs = $701;
        
        return findField.apply(fs);
      }
      }
      }
    case "ObservedType": {ESLVal $700 = _v79.termRef(0);
        ESLVal $699 = _v79.termRef(1);
        ESLVal $698 = _v79.termRef(2);
        
        {ESLVal _v395 = $700;
        
        {ESLVal s = $699;
        
        {ESLVal m = $698;
        
        if(n.eql(new ESLVal("addObserver")).boolVal)
        return new ESLVal("FunType",_v395,ESLVal.list(new ESLVal("ObserverType",_v395,s,m)),theTypeVoid);
        else
          {ESLVal _v396 = _v79;
            
            return error(new ESLVal("TypeError",_v395,new ESLVal("expecting a record type, but received ").add(ppType(_v396,typeEnv))));
          }
      }
      }
      }
      }
    case "ActType": {ESLVal $697 = _v79.termRef(0);
        ESLVal $696 = _v79.termRef(1);
        ESLVal $695 = _v79.termRef(2);
        
        {ESLVal al = $697;
        
        {ESLVal exports = $696;
        
        {ESLVal handlers = $695;
        
        if(n.eql(new ESLVal("addObserver")).and(exportsObserve.apply(exports)).boolVal)
        return new ESLVal("FunType",l,ESLVal.list(getObserver.apply(al,exports,handlers)),theTypeVoid);
        else
          {ESLVal _v394 = findExport.apply(exports);
            
            if(_v394.eql($null).boolVal)
            return error(new ESLVal("TypeError",l,new ESLVal("behaviour type does not export ").add(n)));
            else
              return substTypeEnv(typeEnv,_v394);
          }
      }
      }
      }
      }
      default: {ESLVal _v418 = _v79;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a record type, but received ").add(ppType(_v418,typeEnv))));
      }
    }
    }}
    
  }
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),null) { public ESLVal apply(ESLVal... args) { return refType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal derefType(ESLVal t) {
    
    {ESLVal _v80 = t;
      
      switch(_v80.termName) {
      case "TypeClosure": {ESLVal $709 = _v80.termRef(0);
        
        {ESLVal f = $709;
        
        return derefType(f.apply());
      }
      }
      default: {ESLVal _v368 = _v80;
        
        return _v368;
      }
    }
    }
  }
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),null) { public ESLVal apply(ESLVal... args) { return derefType(args[0]); }});
  private static ESLVal recordType(ESLVal l,ESLVal fields,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    { LetRec letrec = new LetRec() {
      ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v362 = $args[0];
        {ESLVal _v81 = _v362;
              
              if(_v81.isCons())
              {ESLVal $710 = _v81.head();
                ESLVal $711 = _v81.tail();
                
                switch($710.termName) {
                case "Binding": {ESLVal $716 = $710.termRef(0);
                  ESLVal $715 = $710.termRef(1);
                  ESLVal $714 = $710.termRef(2);
                  ESLVal $713 = $710.termRef(3);
                  ESLVal $712 = $710.termRef(4);
                  
                  {ESLVal _v363 = $716;
                  
                  {ESLVal n = $715;
                  
                  {ESLVal t = $714;
                  
                  {ESLVal st = $713;
                  
                  {ESLVal e = $712;
                  
                  {ESLVal _v364 = $711;
                  
                  {ESLVal _v365 = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
                  
                  return fieldTypes.apply(_v364).cons(new ESLVal("Dec",_v363,n,_v365,_v365));
                }
                }
                }
                }
                }
                }
                }
                }
                default: {ESLVal _v366 = _v81;
                  
                  return error(new ESLVal("TypeError",l,new ESLVal("unknown field representation: ").add(_v366)));
                }
              }
              }
            else if(_v81.isNil())
              return $nil;
            else {ESLVal _v367 = _v81;
                
                return error(new ESLVal("TypeError",l,new ESLVal("unknown field representation: ").add(_v367)));
              }
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "fieldTypes": return fieldTypes;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal fieldTypes = letrec.get("fieldTypes");
    
      return new ESLVal("RecordType",l,fieldTypes.apply(fields));}
    
  }
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),null) { public ESLVal apply(ESLVal... args) { return recordType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal forType(ESLVal l,ESLVal p,ESLVal list,ESLVal body,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal listType = expType(list,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v82 = listType;
      
      switch(_v82.termName) {
      case "ListType": {ESLVal $718 = _v82.termRef(0);
        ESLVal $717 = _v82.termRef(1);
        
        {ESLVal _v359 = $718;
        
        {ESLVal t = $717;
        
        return patternType(_v359,p,t,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun189"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v360 = $args[0];
        ESLVal _v361 = $args[1];
        return expType(body,selfType,_v361,cnstrEnv,typeEnv);
          }
        }));
      }
      }
      }
      default: {ESLVal t = _v82;
        
        return error(new ESLVal("TypeError",l,new ESLVal("for type expects a list: ").add(list)));
      }
    }
    }
    }
  }
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),null) { public ESLVal apply(ESLVal... args) { return forType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal patternTypes(ESLVal l,ESLVal ps,ESLVal ts,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v83 = ps;
      ESLVal _v84 = ts;
      
      if(_v83.isCons())
      {ESLVal $719 = _v83.head();
        ESLVal $720 = _v83.tail();
        
        if(_v84.isCons())
        {ESLVal $721 = _v84.head();
          ESLVal $722 = _v84.tail();
          
          {ESLVal p = $719;
          
          {ESLVal _v341 = $720;
          
          {ESLVal t = $721;
          
          {ESLVal _v342 = $722;
          
          {ESLVal _v343 = _v341;
          ESLVal _v344 = _v342;
          
          return patternType(l,p,t,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun190"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v345 = $args[0];
          ESLVal _v346 = $args[1];
          return patternTypes(l,_v343,_v344,selfType,_v346,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun191"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v347 = $args[0];
                ESLVal _v348 = $args[1];
                return f.apply(_v347.cons(_v345),_v348);
                  }
                }));
            }
          }));
        }
        }
        }
        }
        }
        }
      else if(_v84.isNil())
        {ESLVal _v349 = _v83;
          
          {ESLVal _v350 = _v84;
          
          return error(new ESLVal("TypeError",l,new ESLVal("somthing wrong with ").add(_v349.add(new ESLVal(" ").add(_v350)))));
        }
        }
      else {ESLVal _v351 = _v83;
          
          {ESLVal _v352 = _v84;
          
          return error(new ESLVal("TypeError",l,new ESLVal("somthing wrong with ").add(_v351.add(new ESLVal(" ").add(_v352)))));
        }
        }
      }
    else if(_v83.isNil())
      if(_v84.isCons())
        {ESLVal $723 = _v84.head();
          ESLVal $724 = _v84.tail();
          
          {ESLVal _v353 = _v83;
          
          {ESLVal _v354 = _v84;
          
          return error(new ESLVal("TypeError",l,new ESLVal("somthing wrong with ").add(_v353.add(new ESLVal(" ").add(_v354)))));
        }
        }
        }
      else if(_v84.isNil())
        return f.apply($nil,valueEnv);
      else {ESLVal _v355 = _v83;
          
          {ESLVal _v356 = _v84;
          
          return error(new ESLVal("TypeError",l,new ESLVal("somthing wrong with ").add(_v355.add(new ESLVal(" ").add(_v356)))));
        }
        }
    else {ESLVal _v357 = _v83;
        
        {ESLVal _v358 = _v84;
        
        return error(new ESLVal("TypeError",l,new ESLVal("somthing wrong with ").add(_v357.add(new ESLVal(" ").add(_v358)))));
      }
      }
    }
  }
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),null) { public ESLVal apply(ESLVal... args) { return patternTypes(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal getPatternType(ESLVal l,ESLVal p,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v85 = p;
      
      switch(_v85.termName) {
      case "PApplyType": {ESLVal $753 = _v85.termRef(0);
        ESLVal $752 = _v85.termRef(1);
        ESLVal $751 = _v85.termRef(2);
        
        {ESLVal _v338 = $753;
        
        {ESLVal _v339 = $752;
        
        {ESLVal args = $751;
        
        return getApplyPatternType(_v338,_v339,args,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "PBool": {ESLVal $750 = _v85.termRef(0);
        ESLVal $749 = _v85.termRef(1);
        
        {ESLVal _v337 = $750;
        
        {ESLVal b = $749;
        
        return theTypeBool;
      }
      }
      }
    case "PCons": {ESLVal $748 = _v85.termRef(0);
        ESLVal $747 = _v85.termRef(1);
        ESLVal $746 = _v85.termRef(2);
        
        {ESLVal _v336 = $748;
        
        {ESLVal hd = $747;
        
        {ESLVal tl = $746;
        
        return getPatternType(_v336,tl,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "PBagCons": {ESLVal $745 = _v85.termRef(0);
        ESLVal $744 = _v85.termRef(1);
        ESLVal $743 = _v85.termRef(2);
        
        {ESLVal _v335 = $745;
        
        {ESLVal hd = $744;
        
        {ESLVal tl = $743;
        
        return getPatternType(_v335,tl,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "PSetCons": {ESLVal $742 = _v85.termRef(0);
        ESLVal $741 = _v85.termRef(1);
        ESLVal $740 = _v85.termRef(2);
        
        {ESLVal _v334 = $742;
        
        {ESLVal hd = $741;
        
        {ESLVal tl = $740;
        
        return getPatternType(_v334,tl,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "PNil": {ESLVal $739 = _v85.termRef(0);
        
        {ESLVal _v333 = $739;
        
        return new ESLVal("ForallType",_v333,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v333,new ESLVal("VarType",_v333,new ESLVal("T"))));
      }
      }
    case "PNull": {ESLVal $738 = _v85.termRef(0);
        
        {ESLVal _v332 = $738;
        
        return new ESLVal("ForallType",_v332,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v332,new ESLVal("T")));
      }
      }
    case "PEmptyBag": {ESLVal $737 = _v85.termRef(0);
        
        {ESLVal _v331 = $737;
        
        return new ESLVal("ForallType",_v331,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v331,new ESLVal("VarType",_v331,new ESLVal("T"))));
      }
      }
    case "PEmptySet": {ESLVal $736 = _v85.termRef(0);
        
        {ESLVal _v330 = $736;
        
        return new ESLVal("ForallType",_v330,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v330,new ESLVal("VarType",_v330,new ESLVal("T"))));
      }
      }
    case "PInt": {ESLVal $735 = _v85.termRef(0);
        ESLVal $734 = _v85.termRef(1);
        
        {ESLVal _v329 = $735;
        
        {ESLVal n = $734;
        
        return theTypeInt;
      }
      }
      }
    case "PVar": {ESLVal $733 = _v85.termRef(0);
        ESLVal $732 = _v85.termRef(1);
        ESLVal $731 = _v85.termRef(2);
        
        {ESLVal _v328 = $733;
        
        {ESLVal n = $732;
        
        {ESLVal pt = $731;
        
        return substTypeEnv(typeEnv,pt);
      }
      }
      }
      }
    case "PStr": {ESLVal $730 = _v85.termRef(0);
        ESLVal $729 = _v85.termRef(1);
        
        {ESLVal _v327 = $730;
        
        {ESLVal s = $729;
        
        return theTypeStr;
      }
      }
      }
    case "PTerm": {ESLVal $728 = _v85.termRef(0);
        ESLVal $727 = _v85.termRef(1);
        ESLVal $726 = _v85.termRef(2);
        ESLVal $725 = _v85.termRef(3);
        
        {ESLVal _v326 = $728;
        
        {ESLVal n = $727;
        
        {ESLVal ts = $726;
        
        {ESLVal ps = $725;
        
        return lookupType(n,cnstrEnv);
      }
      }
      }
      }
      }
      default: {ESLVal _v340 = _v85;
        
        return error(new ESLVal("TypeError",l,new ESLVal("unknown type of pattern: ").add(_v340)));
      }
    }
    }
  }
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),null) { public ESLVal apply(ESLVal... args) { return getPatternType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal getApplyPatternType(ESLVal l,ESLVal pApplyType,ESLVal args,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v86 = getPatternType(l,pApplyType,selfType,valueEnv,cnstrEnv,typeEnv);
      
      switch(_v86.termName) {
      case "ForallType": {ESLVal $756 = _v86.termRef(0);
        ESLVal $755 = _v86.termRef(1);
        ESLVal $754 = _v86.termRef(2);
        
        {ESLVal l2 = $756;
        
        {ESLVal names = $755;
        
        {ESLVal typeExp = $754;
        
        return typeNF(typeExp,zipTypeEnv(names,args).add(typeEnv));
      }
      }
      }
      }
      default: {ESLVal t = _v86;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a universal type: ").add(ppType(t,typeEnv))));
      }
    }
    }
  }
  private static ESLVal getApplyPatternType = new ESLVal(new Function(new ESLVal("getApplyPatternType"),null) { public ESLVal apply(ESLVal... args) { return getApplyPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal patternType(ESLVal l,ESLVal p,ESLVal t,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v87 = p;
      
      switch(_v87.termName) {
      case "PAdd": {ESLVal $788 = _v87.termRef(0);
        ESLVal $787 = _v87.termRef(1);
        ESLVal $786 = _v87.termRef(2);
        
        {ESLVal _v324 = $788;
        
        {ESLVal p1 = $787;
        
        {ESLVal p2 = $786;
        
        return addPatternType(_v324,p1,p2,t,selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
      }
      }
    case "PApplyType": {ESLVal $785 = _v87.termRef(0);
        ESLVal $784 = _v87.termRef(1);
        ESLVal $783 = _v87.termRef(2);
        
        {ESLVal _v322 = $785;
        
        {ESLVal _v323 = $784;
        
        {ESLVal args = $783;
        
        return applyTypePatternType(_v322,_v323,substTypesEnv(typeEnv,args),t,selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
      }
      }
    case "PBool": {ESLVal $782 = _v87.termRef(0);
        ESLVal $781 = _v87.termRef(1);
        
        {ESLVal _v321 = $782;
        
        {ESLVal b = $781;
        
        if(isBoolType(typeNF(t,typeEnv)).boolVal)
        return f.apply(theTypeBool,valueEnv);
        else
          return error(new ESLVal("TypeError",_v321,new ESLVal("type mismatch: Bool and ").add(ppType(t,typeEnv))));
      }
      }
      }
    case "PBagCons": {ESLVal $780 = _v87.termRef(0);
        ESLVal $779 = _v87.termRef(1);
        ESLVal $778 = _v87.termRef(2);
        
        {ESLVal _v318 = $780;
        
        {ESLVal hd = $779;
        
        {ESLVal tl = $778;
        
        return bagConsPatternType(_v318,hd,tl,t,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun192"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v319 = $args[0];
        ESLVal _v320 = $args[1];
        return f.apply(new ESLVal("ListType",_v318,_v319),_v320);
          }
        }));
      }
      }
      }
      }
    case "PSetCons": {ESLVal $777 = _v87.termRef(0);
        ESLVal $776 = _v87.termRef(1);
        ESLVal $775 = _v87.termRef(2);
        
        {ESLVal _v315 = $777;
        
        {ESLVal hd = $776;
        
        {ESLVal tl = $775;
        
        return setConsPatternType(_v315,hd,tl,t,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun193"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v316 = $args[0];
        ESLVal _v317 = $args[1];
        return f.apply(new ESLVal("ListType",_v315,_v316),_v317);
          }
        }));
      }
      }
      }
      }
    case "PCons": {ESLVal $774 = _v87.termRef(0);
        ESLVal $773 = _v87.termRef(1);
        ESLVal $772 = _v87.termRef(2);
        
        {ESLVal _v312 = $774;
        
        {ESLVal hd = $773;
        
        {ESLVal tl = $772;
        
        return consPatternType(_v312,hd,tl,t,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun194"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v313 = $args[0];
        ESLVal _v314 = $args[1];
        return f.apply(new ESLVal("ListType",_v312,_v313),_v314);
          }
        }));
      }
      }
      }
      }
    case "PNil": {ESLVal $771 = _v87.termRef(0);
        
        {ESLVal _v311 = $771;
        
        return nilType(_v311,t,selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
    case "PNull": {ESLVal $770 = _v87.termRef(0);
        
        {ESLVal _v310 = $770;
        
        return f.apply(t,valueEnv);
      }
      }
    case "PEmptyBag": {ESLVal $769 = _v87.termRef(0);
        
        {ESLVal _v309 = $769;
        
        return emptyBagType(_v309,typeNF(t,typeEnv),selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
    case "PEmptySet": {ESLVal $768 = _v87.termRef(0);
        
        {ESLVal _v308 = $768;
        
        return emptySetType(_v308,typeNF(t,typeEnv),selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
    case "PInt": {ESLVal $767 = _v87.termRef(0);
        ESLVal $766 = _v87.termRef(1);
        
        {ESLVal _v307 = $767;
        
        {ESLVal n = $766;
        
        if(isIntType(typeNF(t,typeEnv)).boolVal)
        return f.apply(theTypeInt,valueEnv);
        else
          return error(new ESLVal("TypeError",_v307,new ESLVal("type mismatch: Int and ").add(ppType(t,typeEnv))));
      }
      }
      }
    case "PVar": {ESLVal $765 = _v87.termRef(0);
        ESLVal $764 = _v87.termRef(1);
        ESLVal $763 = _v87.termRef(2);
        
        {ESLVal _v306 = $765;
        
        {ESLVal n = $764;
        
        {ESLVal pt = $763;
        
        return f.apply(t,ESLVal.list(new ESLVal("Map",n,t)).add(valueEnv));
      }
      }
      }
      }
    case "PStr": {ESLVal $762 = _v87.termRef(0);
        ESLVal $761 = _v87.termRef(1);
        
        {ESLVal _v305 = $762;
        
        {ESLVal s = $761;
        
        if(isStrType(typeNF(t,typeEnv)).boolVal)
        return f.apply(theTypeStr,valueEnv);
        else
          return error(new ESLVal("TypeError",_v305,new ESLVal("type mismatch: Str and ").add(ppType(t,typeEnv))));
      }
      }
      }
    case "PTerm": {ESLVal $760 = _v87.termRef(0);
        ESLVal $759 = _v87.termRef(1);
        ESLVal $758 = _v87.termRef(2);
        ESLVal $757 = _v87.termRef(3);
        
        {ESLVal _v304 = $760;
        
        {ESLVal n = $759;
        
        {ESLVal ts = $758;
        
        {ESLVal ps = $757;
        
        return termPatternType(_v304,n,substTypesEnv(typeEnv,ts),ps,t,selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
      }
      }
      }
      default: {ESLVal _v325 = _v87;
        
        return error(new ESLVal("TypeError",l,new ESLVal("unknown type of pattern: ").add(_v325)));
      }
    }
    }
  }
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),null) { public ESLVal apply(ESLVal... args) { return patternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal addPatternType(ESLVal l,ESLVal p1,ESLVal p2,ESLVal valueType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    return patternType(l,p1,valueType,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun195"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal _v275 = $args[0];
      ESLVal _v276 = $args[1];
      return patternType(l,p2,valueType,selfType,_v276,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun196"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v277 = $args[0];
            ESLVal _v278 = $args[1];
            {ESLVal _v88 = valueType;
                  
                  switch(_v88.termName) {
                  case "ListType": {ESLVal $791 = _v88.termRef(0);
                    ESLVal $790 = _v88.termRef(1);
                    
                    {ESLVal tl = $791;
                    
                    {ESLVal t = $790;
                    
                    {ESLVal _v89 = p1;
                    ESLVal _v90 = p2;
                    
                    switch(_v89.termName) {
                    case "PCons": {ESLVal $824 = _v89.termRef(0);
                      ESLVal $823 = _v89.termRef(1);
                      ESLVal $822 = _v89.termRef(2);
                      
                      switch($822.termName) {
                      case "PNil": {ESLVal $825 = $822.termRef(0);
                        
                        switch(_v90.termName) {
                        case "PVar": {ESLVal $828 = _v90.termRef(0);
                          ESLVal $827 = _v90.termRef(1);
                          ESLVal $826 = _v90.termRef(2);
                          
                          {ESLVal l1 = $824;
                          
                          {ESLVal p = $823;
                          
                          {ESLVal l3 = $825;
                          
                          {ESLVal l4 = $828;
                          
                          {ESLVal n2 = $827;
                          
                          {ESLVal t2 = $826;
                          
                          return f.apply(valueType,_v278);
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v298 = _v89;
                          
                          {ESLVal _v299 = _v90;
                          
                          return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v300 = _v89;
                        
                        {ESLVal _v301 = _v90;
                        
                        return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                  case "PVar": {ESLVal $807 = _v89.termRef(0);
                      ESLVal $806 = _v89.termRef(1);
                      ESLVal $805 = _v89.termRef(2);
                      
                      switch(_v90.termName) {
                      case "PCons": {ESLVal $820 = _v90.termRef(0);
                        ESLVal $819 = _v90.termRef(1);
                        ESLVal $818 = _v90.termRef(2);
                        
                        switch($818.termName) {
                        case "PNil": {ESLVal $821 = $818.termRef(0);
                          
                          {ESLVal l1 = $807;
                          
                          {ESLVal n = $806;
                          
                          {ESLVal _v293 = $805;
                          
                          {ESLVal l2 = $820;
                          
                          {ESLVal p = $819;
                          
                          {ESLVal l3 = $821;
                          
                          return f.apply(valueType,_v278);
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        default: {ESLVal _v294 = _v89;
                          
                          {ESLVal _v295 = _v90;
                          
                          return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PAdd": {ESLVal $810 = _v90.termRef(0);
                        ESLVal $809 = _v90.termRef(1);
                        ESLVal $808 = _v90.termRef(2);
                        
                        switch($809.termName) {
                        case "PCons": {ESLVal $813 = $809.termRef(0);
                          ESLVal $812 = $809.termRef(1);
                          ESLVal $811 = $809.termRef(2);
                          
                          switch($811.termName) {
                          case "PNil": {ESLVal $814 = $811.termRef(0);
                            
                            switch($808.termName) {
                            case "PVar": {ESLVal $817 = $808.termRef(0);
                              ESLVal $816 = $808.termRef(1);
                              ESLVal $815 = $808.termRef(2);
                              
                              {ESLVal l1 = $807;
                              
                              {ESLVal n1 = $806;
                              
                              {ESLVal t1 = $805;
                              
                              {ESLVal l2 = $810;
                              
                              {ESLVal l3 = $813;
                              
                              {ESLVal p = $812;
                              
                              {ESLVal l5 = $814;
                              
                              {ESLVal l6 = $817;
                              
                              {ESLVal n3 = $816;
                              
                              {ESLVal t3 = $815;
                              
                              return f.apply(valueType,_v278);
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
                            default: {ESLVal _v287 = _v89;
                              
                              {ESLVal _v288 = _v90;
                              
                              return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v289 = _v89;
                            
                            {ESLVal _v290 = _v90;
                            
                            return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v291 = _v89;
                          
                          {ESLVal _v292 = _v90;
                          
                          return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v296 = _v89;
                        
                        {ESLVal _v297 = _v90;
                        
                        return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                  case "PAdd": {ESLVal $794 = _v89.termRef(0);
                      ESLVal $793 = _v89.termRef(1);
                      ESLVal $792 = _v89.termRef(2);
                      
                      switch($793.termName) {
                      case "PVar": {ESLVal $797 = $793.termRef(0);
                        ESLVal $796 = $793.termRef(1);
                        ESLVal $795 = $793.termRef(2);
                        
                        switch($792.termName) {
                        case "PCons": {ESLVal $800 = $792.termRef(0);
                          ESLVal $799 = $792.termRef(1);
                          ESLVal $798 = $792.termRef(2);
                          
                          switch($798.termName) {
                          case "PNil": {ESLVal $801 = $798.termRef(0);
                            
                            switch(_v90.termName) {
                            case "PVar": {ESLVal $804 = _v90.termRef(0);
                              ESLVal $803 = _v90.termRef(1);
                              ESLVal $802 = _v90.termRef(2);
                              
                              {ESLVal l1 = $794;
                              
                              {ESLVal l2 = $797;
                              
                              {ESLVal n1 = $796;
                              
                              {ESLVal t1 = $795;
                              
                              {ESLVal l3 = $800;
                              
                              {ESLVal p = $799;
                              
                              {ESLVal l5 = $801;
                              
                              {ESLVal l6 = $804;
                              
                              {ESLVal n3 = $803;
                              
                              {ESLVal t3 = $802;
                              
                              return f.apply(valueType,_v278);
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
                            default: {ESLVal _v279 = _v89;
                              
                              {ESLVal _v280 = _v90;
                              
                              return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v281 = _v89;
                            
                            {ESLVal _v282 = _v90;
                            
                            return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v283 = _v89;
                          
                          {ESLVal _v284 = _v90;
                          
                          return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v285 = _v89;
                        
                        {ESLVal _v286 = _v90;
                        
                        return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                    default: {ESLVal _v302 = _v89;
                      
                      {ESLVal _v303 = _v90;
                      
                      return error(new ESLVal("TypeError",l,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                    }
                    }
                  }
                  }
                  }
                  }
                  }
                case "TypeClosure": {ESLVal $789 = _v88.termRef(0);
                    
                    {ESLVal g = $789;
                    
                    return addPatternType(l,p1,p2,g.apply(),selfType,_v278,cnstrEnv,typeEnv,f);
                  }
                  }
                  default: {ESLVal t = _v88;
                    
                    return error(new ESLVal("TypeError",l,new ESLVal("+ expects lists: ").add(ppType(valueType,typeEnv))));
                  }
                }
                }
              }
            }));
        }
      }));
  }
  private static ESLVal addPatternType = new ESLVal(new Function(new ESLVal("addPatternType"),null) { public ESLVal apply(ESLVal... args) { return addPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal applyTypePatternType(ESLVal l,ESLVal p,ESLVal args,ESLVal valueType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    return patternType(l,p,valueType,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun197"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal _v271 = $args[0];
      ESLVal _v272 = $args[1];
      {ESLVal _v91 = typeNF(_v271,typeEnv);
            
            switch(_v91.termName) {
            case "TypeFun": {ESLVal $834 = _v91.termRef(0);
              ESLVal $833 = _v91.termRef(1);
              ESLVal $832 = _v91.termRef(2);
              
              {ESLVal fl = $834;
              
              {ESLVal ns = $833;
              
              {ESLVal t = $832;
              
              if(length.apply(args).eql(length.apply(ns)).boolVal)
              {ESLVal _v274 = substTypeEnv(zipTypeEnv(ns,args).add(typeEnv),t);
                
                if(typeEqual(_v274,valueType).boolVal)
                return f.apply(_v274,_v272);
                else
                  return error(new ESLVal("TypeError",l,new ESLVal("value type ").add(ppType(valueType,typeEnv).add(new ESLVal(" does not match pattern type ").add(ppType(_v274,typeEnv).add(new ESLVal(" ").add(ppTypeEnv(typeEnv))))))));
              }
              else
                return error(new ESLVal("TypeError",l,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(args))))));
            }
            }
            }
            }
          case "ForallType": {ESLVal $831 = _v91.termRef(0);
              ESLVal $830 = _v91.termRef(1);
              ESLVal $829 = _v91.termRef(2);
              
              {ESLVal fl = $831;
              
              {ESLVal ns = $830;
              
              {ESLVal t = $829;
              
              if(length.apply(args).eql(length.apply(ns)).boolVal)
              {ESLVal _v273 = substTypeEnv(zipTypeEnv(ns,args).add(typeEnv),t);
                
                if(typeEqual(_v273,valueType).boolVal)
                return f.apply(_v273,_v272);
                else
                  return error(new ESLVal("TypeError",l,new ESLVal("value type ").add(ppType(valueType,typeEnv).add(new ESLVal(" does not match pattern type ").add(ppType(_v273,typeEnv).add(new ESLVal(" ").add(ppTypeEnv(typeEnv))))))));
              }
              else
                return error(new ESLVal("TypeError",l,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(args))))));
            }
            }
            }
            }
            default: {ESLVal t = _v91;
              
              return f.apply(t,_v272);
            }
          }
          }
        }
      }));
  }
  private static ESLVal applyTypePatternType = new ESLVal(new Function(new ESLVal("applyTypePatternType"),null) { public ESLVal apply(ESLVal... args) { return applyTypePatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal termPatternType(ESLVal l,ESLVal n,ESLVal genericArgs,ESLVal ps,ESLVal valueType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal patternType = getTermPatternType(l,n,genericArgs,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(patternType,valueType).boolVal)
      {ESLVal _v92 = typeNF(valueType,typeEnv);
        
        switch(_v92.termName) {
        case "UnionType": {ESLVal $836 = _v92.termRef(0);
          ESLVal $835 = _v92.termRef(1);
          
          {ESLVal ul = $836;
          
          {ESLVal cs = $835;
          
          { LetRec letrec = new LetRec() {
          ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v265 = $args[0];
            {ESLVal _v93 = _v265;
                  
                  if(_v93.isCons())
                  {ESLVal $837 = _v93.head();
                    ESLVal $838 = _v93.tail();
                    
                    switch($837.termName) {
                    case "TermType": {ESLVal $841 = $837.termRef(0);
                      ESLVal $840 = $837.termRef(1);
                      ESLVal $839 = $837.termRef(2);
                      
                      {ESLVal tl = $841;
                      
                      {ESLVal m = $840;
                      
                      {ESLVal args = $839;
                      
                      {ESLVal _v266 = $838;
                      
                      if(m.eql(n).boolVal)
                      return args;
                      else
                        {ESLVal t = $837;
                          
                          {ESLVal _v267 = $838;
                          
                          return getCnstrArgs.apply(_v267);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal t = $837;
                      
                      {ESLVal _v268 = $838;
                      
                      return getCnstrArgs.apply(_v268);
                    }
                    }
                  }
                  }
                else if(_v93.isNil())
                  return error(new ESLVal("TypeError",l,new ESLVal("cannot find constructor for ").add(n)));
                else return error(new ESLVal("case error at Pos(56644,56903)").add(ESLVal.list(_v93)));
                }
              }
            });
          
          public ESLVal get(String name) {
            switch(name) {
              case "getCnstrArgs": return getCnstrArgs;
              
              default: throw new Error("cannot find letrec binding");
            }
            }
          };
        ESLVal getCnstrArgs = letrec.get("getCnstrArgs");
        
          {ESLVal argTypes = getCnstrArgs.apply(cs);
          
          if(length.apply(ps).eql(length.apply(argTypes)).boolVal)
          return patternTypes(l,ps,argTypes,selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun198"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v269 = $args[0];
            ESLVal _v270 = $args[1];
            return f.apply(typeNF(valueType,typeEnv),_v270);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("arity mismatch.")));
        }}
        
        }
        }
        }
        default: {ESLVal t = _v92;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a data type: ").add(valueType)));
        }
      }
      }
      else
        return error(new ESLVal("TypeError",l,new ESLVal("term pattern type ").add(ppType(patternType,typeEnv).add(new ESLVal(" does not match supplied value type ").add(ppType(valueType,typeEnv))))));
    }
  }
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),null) { public ESLVal apply(ESLVal... args) { return termPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9]); }});
  private static ESLVal typeNF(ESLVal t,ESLVal typeEnv) {
    
    {ESLVal _v94 = substTypeEnv(typeEnv,t);
      
      switch(_v94.termName) {
      case "ApplyTypeFun": {ESLVal $852 = _v94.termRef(0);
        ESLVal $851 = _v94.termRef(1);
        ESLVal $850 = _v94.termRef(2);
        
        {ESLVal l = $852;
        
        {ESLVal op = $851;
        
        {ESLVal args = $850;
        
        {ESLVal _v96 = typeNF(op,typeEnv);
        
        switch(_v96.termName) {
        case "TypeFun": {ESLVal $858 = _v96.termRef(0);
          ESLVal $857 = _v96.termRef(1);
          ESLVal $856 = _v96.termRef(2);
          
          {ESLVal _v261 = $858;
          
          {ESLVal ns = $857;
          
          {ESLVal _v262 = $856;
          
          if(length.apply(args).eql(length.apply(ns)).boolVal)
          return typeNF(substTypeEnv(zipTypeEnv(ns,args),_v262),typeEnv);
          else
            return error(new ESLVal("TypeError",_v261,new ESLVal("function arity error")));
        }
        }
        }
        }
        default: {ESLVal _v263 = _v96;
          
          return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType(typeNF(op,typeEnv),typeEnv))));
        }
      }
      }
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $849 = _v94.termRef(0);
        
        {ESLVal f = $849;
        
        return typeNF(f.apply(),typeEnv);
      }
      }
    case "RecType": {ESLVal $848 = _v94.termRef(0);
        ESLVal $847 = _v94.termRef(1);
        ESLVal $846 = _v94.termRef(2);
        
        {ESLVal l = $848;
        
        {ESLVal n = $847;
        
        {ESLVal _v260 = $846;
        
        return typeNF(substType(new ESLVal("RecType",l,n,_v260),n,_v260),typeEnv);
      }
      }
      }
      }
    case "ExtendedAct": {ESLVal $845 = _v94.termRef(0);
        ESLVal $844 = _v94.termRef(1);
        ESLVal $843 = _v94.termRef(2);
        ESLVal $842 = _v94.termRef(3);
        
        {ESLVal l1 = $845;
        
        {ESLVal parent = $844;
        
        {ESLVal decs1 = $843;
        
        {ESLVal ms1 = $842;
        
        {ESLVal _v95 = typeNF(parent,typeEnv);
        
        switch(_v95.termName) {
        case "ActType": {ESLVal $855 = _v95.termRef(0);
          ESLVal $854 = _v95.termRef(1);
          ESLVal $853 = _v95.termRef(2);
          
          {ESLVal l2 = $855;
          
          {ESLVal decs2 = $854;
          
          {ESLVal ms2 = $853;
          
          return new ESLVal("ActType",l1,decs2.add(decs1),ms2.add(ms1));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(58214,58349)").add(ESLVal.list(_v95)));
      }
      }
      }
      }
      }
      }
      }
      default: {ESLVal _v264 = _v94;
        
        return _v264;
      }
    }
    }
  }
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),null) { public ESLVal apply(ESLVal... args) { return typeNF(args[0],args[1]); }});
  private static ESLVal getTermPatternType(ESLVal l,ESLVal n,ESLVal genericArgs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t = lookupType(n,cnstrEnv);
      
      if(t.eql($null).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("unknown constructor ").add(n)));
      else
        if(length.apply(genericArgs).gre($zero).boolVal)
          return getGenericTermPatternType(l,t,genericArgs,selfType,valueEnv,cnstrEnv,typeEnv);
          else
            return t;
    }
  }
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),null) { public ESLVal apply(ESLVal... args) { return getTermPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal getGenericTermPatternType(ESLVal l,ESLVal t,ESLVal genericArgs,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v97 = t;
      
      switch(_v97.termName) {
      case "RecType": {ESLVal $864 = _v97.termRef(0);
        ESLVal $863 = _v97.termRef(1);
        ESLVal $862 = _v97.termRef(2);
        
        {ESLVal rl = $864;
        
        {ESLVal rn = $863;
        
        {ESLVal rt = $862;
        
        return getGenericTermPatternType(l,substType(new ESLVal("RecType",rl,rn,rt),rn,rt),genericArgs,selfType,valueEnv,cnstrEnv,typeEnv);
      }
      }
      }
      }
    case "TypeFun": {ESLVal $861 = _v97.termRef(0);
        ESLVal $860 = _v97.termRef(1);
        ESLVal $859 = _v97.termRef(2);
        
        {ESLVal al = $861;
        
        {ESLVal ns = $860;
        
        {ESLVal _v258 = $859;
        
        if(length.apply(ns).eql(length.apply(genericArgs)).boolVal)
        {ESLVal e = zipTypeEnv(ns,genericArgs);
          
          return substTypeEnv(e.add(typeEnv),_v258);
        }
        else
          return error(new ESLVal("TypeError",l,new ESLVal("generic constructor mismatch")));
      }
      }
      }
      }
      default: {ESLVal _v259 = _v97;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a generic type: ").add(ppType(_v259,typeEnv))));
      }
    }
    }
  }
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),null) { public ESLVal apply(ESLVal... args) { return getGenericTermPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal nilType(ESLVal l,ESLVal listType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v98 = typeNF(listType,typeEnv);
      
      switch(_v98.termName) {
      case "ListType": {ESLVal $867 = _v98.termRef(0);
        ESLVal $866 = _v98.termRef(1);
        
        {ESLVal ltl = $867;
        
        {ESLVal et = $866;
        
        return f.apply(new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",l,new ESLVal("VarType",l,new ESLVal("T")))),valueEnv);
      }
      }
      }
    case "TypeClosure": {ESLVal $865 = _v98.termRef(0);
        
        {ESLVal g = $865;
        
        return nilType(l,g.apply(),selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
      default: {ESLVal _v257 = _v98;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a list type: ").add(ppType(_v257,typeEnv))));
      }
    }
    }
  }
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),null) { public ESLVal apply(ESLVal... args) { return nilType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal emptyBagType(ESLVal l,ESLVal bagType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v99 = bagType;
      
      switch(_v99.termName) {
      case "BagType": {ESLVal $869 = _v99.termRef(0);
        ESLVal $868 = _v99.termRef(1);
        
        {ESLVal ltl = $869;
        
        {ESLVal et = $868;
        
        return f.apply(new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",l,new ESLVal("VarType",l,new ESLVal("T")))),valueEnv);
      }
      }
      }
      default: {ESLVal _v256 = _v99;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a bag type: ").add(ppType(_v256,typeEnv))));
      }
    }
    }
  }
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),null) { public ESLVal apply(ESLVal... args) { return emptyBagType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal emptySetType(ESLVal l,ESLVal setType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v100 = setType;
      
      switch(_v100.termName) {
      case "SetType": {ESLVal $871 = _v100.termRef(0);
        ESLVal $870 = _v100.termRef(1);
        
        {ESLVal ltl = $871;
        
        {ESLVal et = $870;
        
        return f.apply(new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",l,new ESLVal("VarType",l,new ESLVal("T")))),valueEnv);
      }
      }
      }
      default: {ESLVal _v255 = _v100;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a set type: ").add(ppType(_v255,typeEnv))));
      }
    }
    }
  }
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),null) { public ESLVal apply(ESLVal... args) { return emptySetType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal consPatternType(ESLVal l,ESLVal h,ESLVal t,ESLVal listType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v101 = typeNF(listType,typeEnv);
      
      switch(_v101.termName) {
      case "ListType": {ESLVal $874 = _v101.termRef(0);
        ESLVal $873 = _v101.termRef(1);
        
        {ESLVal ltl = $874;
        
        {ESLVal et = $873;
        
        return patternType(l,h,substTypeEnv(typeEnv,et),selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun199"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v250 = $args[0];
        ESLVal _v251 = $args[1];
        return patternType(l,t,listType,selfType,_v251,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun200"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v252 = $args[0];
              ESLVal _v253 = $args[1];
              return f.apply(_v250,_v253);
                }
              }));
          }
        }));
      }
      }
      }
    case "TypeClosure": {ESLVal $872 = _v101.termRef(0);
        
        {ESLVal g = $872;
        
        return consPatternType(l,h,t,g.apply(),selfType,valueEnv,cnstrEnv,typeEnv,f);
      }
      }
      default: {ESLVal _v254 = _v101;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a list type: ").add(ppType(_v254,typeEnv))));
      }
    }
    }
  }
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),null) { public ESLVal apply(ESLVal... args) { return consPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal bagConsPatternType(ESLVal l,ESLVal h,ESLVal t,ESLVal bagType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v102 = bagType;
      
      switch(_v102.termName) {
      case "BagType": {ESLVal $876 = _v102.termRef(0);
        ESLVal $875 = _v102.termRef(1);
        
        {ESLVal ltl = $876;
        
        {ESLVal et = $875;
        
        return patternType(l,h,substTypeEnv(typeEnv,et),selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun201"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v245 = $args[0];
        ESLVal _v246 = $args[1];
        return patternType(l,t,bagType,selfType,_v246,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun202"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v247 = $args[0];
              ESLVal _v248 = $args[1];
              return f.apply(_v245,_v248);
                }
              }));
          }
        }));
      }
      }
      }
      default: {ESLVal _v249 = _v102;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a bag type: ").add(ppType(_v249,typeEnv))));
      }
    }
    }
  }
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),null) { public ESLVal apply(ESLVal... args) { return bagConsPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal setConsPatternType(ESLVal l,ESLVal h,ESLVal t,ESLVal setType,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv,ESLVal f) {
    
    {ESLVal _v103 = setType;
      
      switch(_v103.termName) {
      case "SetType": {ESLVal $878 = _v103.termRef(0);
        ESLVal $877 = _v103.termRef(1);
        
        {ESLVal ltl = $878;
        
        {ESLVal et = $877;
        
        return patternType(l,h,substTypeEnv(typeEnv,et),selfType,valueEnv,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun203"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v240 = $args[0];
        ESLVal _v241 = $args[1];
        return patternType(l,t,setType,selfType,_v241,cnstrEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun204"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v242 = $args[0];
              ESLVal _v243 = $args[1];
              return f.apply(_v240,_v243);
                }
              }));
          }
        }));
      }
      }
      }
      default: {ESLVal _v244 = _v103;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a set type: ").add(ppType(_v244,typeEnv))));
      }
    }
    }
  }
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),null) { public ESLVal apply(ESLVal... args) { return setConsPatternType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal binExpType(ESLVal l,ESLVal e1,ESLVal op,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v104 = op;
      
      switch(_v104.strVal) {
      case "+": return plusExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "-": return subExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "*": return mulExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "/": return divExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case ":": return consExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "=": return eqlExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "<>": return neqlExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "and": return andExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "andalso": return andExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "or": return orExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "orelse": return orExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case ">": return compareExpType(l,e1,new ESLVal(">"),e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case ">=": return compareExpType(l,e1,new ESLVal(">="),e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "<": return compareExpType(l,e1,new ESLVal("<"),e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "<=": return compareExpType(l,e1,new ESLVal("<="),e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "..": return dotDotExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "%": return percentExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
    case "@": return atExpType(l,e1,e2,selfType,valueEnv,cnstrEnv,typeEnv);
      default: {ESLVal _v239 = _v104;
        
        return error(new ESLVal("TypeError",l,new ESLVal("unknown operator: ").add(_v239)));
      }
    }
    }
  }
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),null) { public ESLVal apply(ESLVal... args) { return binExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal andExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isBoolType(t1).and(isBoolType(t2)).boolVal)
      return t1;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("and expects boolean arguments: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),null) { public ESLVal apply(ESLVal... args) { return andExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal atExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(t1,t2).boolVal)
      return t1;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("@ expects arguments to be same type: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal atExpType = new ESLVal(new Function(new ESLVal("atExpType"),null) { public ESLVal apply(ESLVal... args) { return atExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal dotDotExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isIntType(t1).and(isIntType(t2)).boolVal)
      return new ESLVal("ListType",l,theTypeInt);
      else
        return error(new ESLVal("TypeError",l,new ESLVal(".. expects integer arguments: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),null) { public ESLVal apply(ESLVal... args) { return dotDotExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal percentExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isIntType(t1).and(isIntType(t2)).boolVal)
      return theTypeInt;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("% expects integer arguments: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),null) { public ESLVal apply(ESLVal... args) { return percentExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal compareExpType(ESLVal l,ESLVal e1,ESLVal op,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isNumType(t1).and(isNumType(t2)).boolVal)
      return new ESLVal("BoolType",l);
      else
        return error(new ESLVal("TypeError",l,op.add(new ESLVal(" expects numeric arguments: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv)))))));
    }
  }
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),null) { public ESLVal apply(ESLVal... args) { return compareExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal orExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isBoolType(t1).and(isBoolType(t2)).boolVal)
      return t1;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("or expects boolean arguments: ").add(ppType(t1,typeEnv).add(new ESLVal(" ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),null) { public ESLVal apply(ESLVal... args) { return orExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal eqlExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(t1,t2).boolVal)
      return theTypeBool;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("= expects types to agree: ").add(ppType(t1,typeEnv).add(new ESLVal(" <> ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),null) { public ESLVal apply(ESLVal... args) { return eqlExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal neqlExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(typeEqual(t1,t2).boolVal)
      return theTypeBool;
      else
        return error(new ESLVal("TypeError",l,new ESLVal("<> expects types to agree: ").add(ppType(t1,typeEnv).add(new ESLVal(" <> ").add(ppType(t2,typeEnv))))));
    }
  }
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),null) { public ESLVal apply(ESLVal... args) { return neqlExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal consExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = typeNF(expType(e1,selfType,valueEnv,cnstrEnv,typeEnv),typeEnv);
      ESLVal t2 = typeNF(expType(e2,selfType,valueEnv,cnstrEnv,typeEnv),typeEnv);
      
      {ESLVal _v105 = t2;
      ESLVal _v106 = t1;
      
      switch(_v105.termName) {
      case "ListType": {ESLVal $880 = _v105.termRef(0);
        ESLVal $879 = _v105.termRef(1);
        
        {ESLVal _v238 = $880;
        
        {ESLVal elementType = $879;
        
        {ESLVal headType = _v106;
        
        if(subType(headType,elementType).boolVal)
        return t2;
        else
          return error(new ESLVal("TypeError",_v238,new ESLVal(": expects head type ").add(ppType(headType,typeEnv).add(new ESLVal(" and element type ").add(ppType(elementType,typeEnv).add(new ESLVal(" to agree")))))));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(67404,67685)").add(ESLVal.list(_v105,_v106)));
    }
    }
    }
  }
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),null) { public ESLVal apply(ESLVal... args) { return consExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal divExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v107 = t1;
      ESLVal _v108 = t2;
      
      switch(_v107.termName) {
      case "IntType": {ESLVal $883 = _v107.termRef(0);
        
        switch(_v108.termName) {
        case "IntType": {ESLVal $884 = _v108.termRef(0);
          
          {ESLVal l1 = $883;
          
          {ESLVal l2 = $884;
          
          return t1;
        }
        }
        }
        default: {ESLVal _v234 = _v107;
          
          {ESLVal _v235 = _v108;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for /: ").add(ppType(_v234,typeEnv).add(new ESLVal(" and ").add(ppType(_v235,typeEnv))))));
        }
        }
      }
      }
    case "FloatType": {ESLVal $881 = _v107.termRef(0);
        
        switch(_v108.termName) {
        case "FloatType": {ESLVal $882 = _v108.termRef(0);
          
          {ESLVal l1 = $881;
          
          {ESLVal l2 = $882;
          
          return t1;
        }
        }
        }
        default: {ESLVal _v232 = _v107;
          
          {ESLVal _v233 = _v108;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for /: ").add(ppType(_v232,typeEnv).add(new ESLVal(" and ").add(ppType(_v233,typeEnv))))));
        }
        }
      }
      }
      default: {ESLVal _v236 = _v107;
        
        {ESLVal _v237 = _v108;
        
        return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for /: ").add(ppType(_v236,typeEnv).add(new ESLVal(" and ").add(ppType(_v237,typeEnv))))));
      }
      }
    }
    }
    }
  }
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),null) { public ESLVal apply(ESLVal... args) { return divExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal mulExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v109 = t1;
      ESLVal _v110 = t2;
      
      switch(_v109.termName) {
      case "IntType": {ESLVal $888 = _v109.termRef(0);
        
        switch(_v110.termName) {
        case "IntType": {ESLVal $890 = _v110.termRef(0);
          
          {ESLVal l1 = $888;
          
          {ESLVal l2 = $890;
          
          return t1;
        }
        }
        }
      case "FloatType": {ESLVal $889 = _v110.termRef(0);
          
          {ESLVal l1 = $888;
          
          {ESLVal l2 = $889;
          
          return t2;
        }
        }
        }
        default: {ESLVal _v228 = _v109;
          
          {ESLVal _v229 = _v110;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for *: ").add(ppType(_v228,typeEnv).add(new ESLVal(" and ").add(ppType(_v229,typeEnv))))));
        }
        }
      }
      }
    case "FloatType": {ESLVal $885 = _v109.termRef(0);
        
        switch(_v110.termName) {
        case "FloatType": {ESLVal $887 = _v110.termRef(0);
          
          {ESLVal l1 = $885;
          
          {ESLVal l2 = $887;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $886 = _v110.termRef(0);
          
          {ESLVal l1 = $885;
          
          {ESLVal l2 = $886;
          
          return t1;
        }
        }
        }
        default: {ESLVal _v226 = _v109;
          
          {ESLVal _v227 = _v110;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for *: ").add(ppType(_v226,typeEnv).add(new ESLVal(" and ").add(ppType(_v227,typeEnv))))));
        }
        }
      }
      }
      default: {ESLVal _v230 = _v109;
        
        {ESLVal _v231 = _v110;
        
        return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for *: ").add(ppType(_v230,typeEnv).add(new ESLVal(" and ").add(ppType(_v231,typeEnv))))));
      }
      }
    }
    }
    }
  }
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),null) { public ESLVal apply(ESLVal... args) { return mulExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal subExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v111 = t1;
      ESLVal _v112 = t2;
      
      switch(_v111.termName) {
      case "IntType": {ESLVal $894 = _v111.termRef(0);
        
        switch(_v112.termName) {
        case "IntType": {ESLVal $896 = _v112.termRef(0);
          
          {ESLVal l1 = $894;
          
          {ESLVal l2 = $896;
          
          return t1;
        }
        }
        }
      case "FloatType": {ESLVal $895 = _v112.termRef(0);
          
          {ESLVal l1 = $894;
          
          {ESLVal l2 = $895;
          
          return t2;
        }
        }
        }
        default: {ESLVal _v222 = _v111;
          
          {ESLVal _v223 = _v112;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for -: ").add(ppType(_v222,typeEnv).add(new ESLVal(" and ").add(ppType(_v223,typeEnv))))));
        }
        }
      }
      }
    case "FloatType": {ESLVal $891 = _v111.termRef(0);
        
        switch(_v112.termName) {
        case "FloatType": {ESLVal $893 = _v112.termRef(0);
          
          {ESLVal l1 = $891;
          
          {ESLVal l2 = $893;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $892 = _v112.termRef(0);
          
          {ESLVal l1 = $891;
          
          {ESLVal l2 = $892;
          
          return t1;
        }
        }
        }
        default: {ESLVal _v220 = _v111;
          
          {ESLVal _v221 = _v112;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for -: ").add(ppType(_v220,typeEnv).add(new ESLVal(" and ").add(ppType(_v221,typeEnv))))));
        }
        }
      }
      }
      default: {ESLVal _v224 = _v111;
        
        {ESLVal _v225 = _v112;
        
        return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for -: ").add(ppType(_v224,typeEnv).add(new ESLVal(" and ").add(ppType(_v225,typeEnv))))));
      }
      }
    }
    }
    }
  }
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),null) { public ESLVal apply(ESLVal... args) { return subExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal plusExpType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t1 = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      ESLVal t2 = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v113 = t1;
      ESLVal _v114 = t2;
      
      switch(_v113.termName) {
      case "StrType": {ESLVal $910 = _v113.termRef(0);
        
        {ESLVal _v214 = $910;
        
        {ESLVal _v215 = _v114;
        
        return t1;
      }
      }
      }
    case "IntType": {ESLVal $908 = _v113.termRef(0);
        
        switch(_v114.termName) {
        case "IntType": {ESLVal $909 = _v114.termRef(0);
          
          {ESLVal l1 = $908;
          
          {ESLVal l2 = $909;
          
          return t1;
        }
        }
        }
        default: switch(_v114.termName) {
          case "StrType": {ESLVal $897 = _v114.termRef(0);
            
            {ESLVal _v210 = _v113;
            
            {ESLVal _v211 = $897;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v212 = _v113;
            
            {ESLVal _v213 = _v114;
            
            return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v212,typeEnv).add(new ESLVal(" and ").add(ppType(_v213,typeEnv))))));
          }
          }
        }
      }
      }
    case "FloatType": {ESLVal $906 = _v113.termRef(0);
        
        switch(_v114.termName) {
        case "FloatType": {ESLVal $907 = _v114.termRef(0);
          
          {ESLVal l1 = $906;
          
          {ESLVal l2 = $907;
          
          return t1;
        }
        }
        }
        default: switch(_v114.termName) {
          case "StrType": {ESLVal $897 = _v114.termRef(0);
            
            {ESLVal _v206 = _v113;
            
            {ESLVal _v207 = $897;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v208 = _v113;
            
            {ESLVal _v209 = _v114;
            
            return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v208,typeEnv).add(new ESLVal(" and ").add(ppType(_v209,typeEnv))))));
          }
          }
        }
      }
      }
    case "ListType": {ESLVal $903 = _v113.termRef(0);
        ESLVal $902 = _v113.termRef(1);
        
        switch(_v114.termName) {
        case "ListType": {ESLVal $905 = _v114.termRef(0);
          ESLVal $904 = _v114.termRef(1);
          
          {ESLVal l1 = $903;
          
          {ESLVal _v196 = $902;
          
          {ESLVal l2 = $905;
          
          {ESLVal _v197 = $904;
          
          if(typeEqual(_v196,_v197).boolVal)
          return new ESLVal("ListType",l1,_v196);
          else
            switch(_v114.termName) {
              case "StrType": {ESLVal $897 = _v114.termRef(0);
                
                {ESLVal _v198 = _v113;
                
                {ESLVal _v199 = $897;
                
                return _v197;
              }
              }
              }
              default: {ESLVal _v200 = _v113;
                
                {ESLVal _v201 = _v114;
                
                return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v200,typeEnv).add(new ESLVal(" and ").add(ppType(_v201,typeEnv))))));
              }
              }
            }
        }
        }
        }
        }
        }
        default: switch(_v114.termName) {
          case "StrType": {ESLVal $897 = _v114.termRef(0);
            
            {ESLVal _v202 = _v113;
            
            {ESLVal _v203 = $897;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v204 = _v113;
            
            {ESLVal _v205 = _v114;
            
            return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v204,typeEnv).add(new ESLVal(" and ").add(ppType(_v205,typeEnv))))));
          }
          }
        }
      }
      }
    case "SetType": {ESLVal $899 = _v113.termRef(0);
        ESLVal $898 = _v113.termRef(1);
        
        switch(_v114.termName) {
        case "SetType": {ESLVal $901 = _v114.termRef(0);
          ESLVal $900 = _v114.termRef(1);
          
          {ESLVal l1 = $899;
          
          {ESLVal _v186 = $898;
          
          {ESLVal l2 = $901;
          
          {ESLVal _v187 = $900;
          
          if(typeEqual(_v186,_v187).boolVal)
          return new ESLVal("SetType",l1,_v186);
          else
            switch(_v114.termName) {
              case "StrType": {ESLVal $897 = _v114.termRef(0);
                
                {ESLVal _v188 = _v113;
                
                {ESLVal _v189 = $897;
                
                return _v187;
              }
              }
              }
              default: {ESLVal _v190 = _v113;
                
                {ESLVal _v191 = _v114;
                
                return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v190,typeEnv).add(new ESLVal(" and ").add(ppType(_v191,typeEnv))))));
              }
              }
            }
        }
        }
        }
        }
        }
        default: switch(_v114.termName) {
          case "StrType": {ESLVal $897 = _v114.termRef(0);
            
            {ESLVal _v192 = _v113;
            
            {ESLVal _v193 = $897;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v194 = _v113;
            
            {ESLVal _v195 = _v114;
            
            return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v194,typeEnv).add(new ESLVal(" and ").add(ppType(_v195,typeEnv))))));
          }
          }
        }
      }
      }
      default: switch(_v114.termName) {
        case "StrType": {ESLVal $897 = _v114.termRef(0);
          
          {ESLVal _v216 = _v113;
          
          {ESLVal _v217 = $897;
          
          return t2;
        }
        }
        }
        default: {ESLVal _v218 = _v113;
          
          {ESLVal _v219 = _v114;
          
          return error(new ESLVal("TypeError",l,new ESLVal("incomptible types for +: ").add(ppType(_v218,typeEnv).add(new ESLVal(" and ").add(ppType(_v219,typeEnv))))));
        }
        }
      }
    }
    }
    }
  }
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),null) { public ESLVal apply(ESLVal... args) { return plusExpType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal applyTypeExp(ESLVal l,ESLVal e,ESLVal ts,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v182 = substTypesEnv(typeEnv,ts);
      ESLVal _v183 = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      {ESLVal _v115 = _v183;
      
      switch(_v115.termName) {
      case "ForallType": {ESLVal $913 = _v115.termRef(0);
        ESLVal $912 = _v115.termRef(1);
        ESLVal $911 = _v115.termRef(2);
        
        {ESLVal l1 = $913;
        
        {ESLVal ns = $912;
        
        {ESLVal _v184 = $911;
        
        if(length.apply(ns).eql(length.apply(_v182)).boolVal)
        {ESLVal env = zipTypeEnv(ns,_v182);
          
          return substTypeEnv(env.add(valueEnv),_v184);
        }
        else
          return error(new ESLVal("TypeError",l,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v182))))));
      }
      }
      }
      }
      default: {ESLVal _v185 = _v115;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a universal type: ").add(_v185)));
      }
    }
    }
    }
  }
  private static ESLVal applyTypeExp = new ESLVal(new Function(new ESLVal("applyTypeExp"),null) { public ESLVal apply(ESLVal... args) { return applyTypeExp(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal expTypes(ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    return map(new ESLVal(new Function(new ESLVal("fun205"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal e = $args[0];
      return expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
        }
      }),es);
  }
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),null) { public ESLVal apply(ESLVal... args) { return expTypes(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal applyType(ESLVal l,ESLVal op,ESLVal args,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v116 = typeNF(expType(op,selfType,valueEnv,cnstrEnv,typeEnv),typeEnv);
      
      switch(_v116.termName) {
      case "FunType": {ESLVal $916 = _v116.termRef(0);
        ESLVal $915 = _v116.termRef(1);
        ESLVal $914 = _v116.termRef(2);
        
        {ESLVal l1 = $916;
        
        {ESLVal domain = $915;
        
        {ESLVal range = $914;
        
        {ESLVal supplied = expTypes(args,selfType,valueEnv,cnstrEnv,typeEnv);
        
        if(length.apply(domain).eql(length.apply(supplied)).boolVal)
        if(subTypes(supplied,domain).boolVal)
          return range;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("supplied argument types ").add(ppTypes(supplied,typeEnv).add(new ESLVal(" do not match function domain ").add(ppTypes(domain,typeEnv))))));
        else
          return error(new ESLVal("TypeError",l,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
      }
      }
      }
      }
      }
      default: {ESLVal t = _v116;
        
        return error(new ESLVal("TypeError",l,new ESLVal("unknown type for apply: ").add(ppType(t,typeEnv))));
      }
    }
    }
  }
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),null) { public ESLVal apply(ESLVal... args) { return applyType(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal ifType(ESLVal l,ESLVal e1,ESLVal e2,ESLVal e3,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal testType = expType(e1,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isBoolType(testType).boolVal)
      {ESLVal conseqType = expType(e2,selfType,valueEnv,cnstrEnv,typeEnv);
        ESLVal altType = expType(e3,selfType,valueEnv,cnstrEnv,typeEnv);
        
        if(typeEqual(conseqType,altType).boolVal)
        return conseqType;
        else
          return error(new ESLVal("TypeError",l,new ESLVal("conseq and alt types do not agree: ").add(ppType(conseqType,typeEnv).add(new ESLVal(" ").add(ppType(altType,typeEnv))))));
      }
      else
        return error(new ESLVal("if expects a bool ").add(ppType(testType,typeEnv)));
    }
  }
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),null) { public ESLVal apply(ESLVal... args) { return ifType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal checkDecs(ESLVal ds) {
    
    {ESLVal _v117 = ds;
      
      if(_v117.isCons())
      {ESLVal $917 = _v117.head();
        ESLVal $918 = _v117.tail();
        
        {ESLVal d = $917;
        
        {ESLVal _v181 = $918;
        
        if(member.apply(decName(d),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal d = $l0.head();
            $l0 = $l0.tail();
            $v.add(decName(d));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(_v181)).boolVal)
        return error(new ESLVal("TypeError",decLoc(d),new ESLVal(" duplicate argument ").add(decName(d))));
        else
          return checkDecs(_v181);
      }
      }
      }
    else if(_v117.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(72551,72784)").add(ESLVal.list(_v117)));
    }
  }
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),null) { public ESLVal apply(ESLVal... args) { return checkDecs(args[0]); }});
  private static ESLVal funType(ESLVal l,ESLVal n,ESLVal args,ESLVal t,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {checkDecs(args);
    {ESLVal nType = expType(n,selfType,valueEnv,cnstrEnv,typeEnv);
      
      if(isStrType(nType).boolVal)
      {ESLVal declaredType = substTypeEnv(typeEnv,t);
        
        return decTypes(args,valueEnv,typeEnv,new ESLVal(new Function(new ESLVal("fun206"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v179 = $args[0];
        ESLVal _v180 = $args[1];
        {ESLVal actualRange = expType(e,selfType,_v180,cnstrEnv,typeEnv);
              
              if(subType(new ESLVal("FunType",l,_v179,actualRange),declaredType).boolVal)
              return new ESLVal("FunType",l,_v179,actualRange);
              else
                return error(new ESLVal("TypeError",l,new ESLVal("function declared type ").add(ppType(declaredType,typeEnv).add(new ESLVal(" but is ").add(ppType(new ESLVal("FunType",l,_v179,actualRange),typeEnv))))));
            }
          }
        }));
      }
      else
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a string for a function name: ").add(n)));
    }}
  }
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),null) { public ESLVal apply(ESLVal... args) { return funType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal decTypes(ESLVal decs,ESLVal valueEnv,ESLVal typeEnv,ESLVal consumer) {
    
    { LetRec letrec = new LetRec() {
      ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v176 = $args[0];
        ESLVal _v177 = $args[1];
        {ESLVal _v118 = _v176;
              
              if(_v118.isCons())
              {ESLVal $919 = _v118.head();
                ESLVal $920 = _v118.tail();
                
                switch($919.termName) {
                case "Dec": {ESLVal $924 = $919.termRef(0);
                  ESLVal $923 = $919.termRef(1);
                  ESLVal $922 = $919.termRef(2);
                  ESLVal $921 = $919.termRef(3);
                  
                  {ESLVal l = $924;
                  
                  {ESLVal n = $923;
                  
                  {ESLVal t = $922;
                  
                  {ESLVal st = $921;
                  
                  {ESLVal _v178 = $920;
                  
                  return processDecs.apply(_v178,_v177.cons(new ESLVal("Map",n,substTypeEnv(typeEnv,t))));
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(73977,74202)").add(ESLVal.list(_v118)));
              }
              }
            else if(_v118.isNil())
              return consumer.apply(reverse(typeEnvRan(_v177)),_v177.add(valueEnv));
            else return error(new ESLVal("case error at Pos(73977,74202)").add(ESLVal.list(_v118)));
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "processDecs": return processDecs;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal processDecs = letrec.get("processDecs");
    
      return processDecs.apply(decs,$nil);}
    
  }
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),null) { public ESLVal apply(ESLVal... args) { return decTypes(args[0],args[1],args[2],args[3]); }});
  private static ESLVal termType(ESLVal l,ESLVal n,ESLVal ts,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal t0 = lookupType(n,cnstrEnv);
      
      if(t0.eql($null).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("cannot find cnstr ").add(n)));
      else
        {ESLVal t = unfoldIf(t0);
          
          return termTypeCheckUnion(t,l,n,ts,es,selfType,valueEnv,cnstrEnv,typeEnv);
        }
    }
  }
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),null) { public ESLVal apply(ESLVal... args) { return termType(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7]); }});
  private static ESLVal termTypeCheckUnion(ESLVal t,ESLVal l,ESLVal n,ESLVal ts,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    if(t.eql($null).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("cannot find constructor ").add(n)));
      else
        {ESLVal _v119 = t;
          
          switch(_v119.termName) {
          case "TypeFun": {ESLVal $929 = _v119.termRef(0);
            ESLVal $928 = _v119.termRef(1);
            ESLVal $927 = _v119.termRef(2);
            
            {ESLVal lf = $929;
            
            {ESLVal ns = $928;
            
            {ESLVal body = $927;
            
            if(length.apply(ns).eql(length.apply(ts)).boolVal)
            {ESLVal args = map(new ESLVal(new Function(new ESLVal("fun207"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v174 = $args[0];
                return substTypeEnv(typeEnv,_v174);
                  }
                }),ts);
              
              {ESLVal _v120 = substTypeEnv(zipTypeEnv(ns,args),body);
              
              switch(_v120.termName) {
              case "UnionType": {ESLVal $931 = _v120.termRef(0);
                ESLVal $930 = _v120.termRef(1);
                
                {ESLVal l1 = $931;
                
                {ESLVal terms = $930;
                
                {ESLVal ts2 = findTermArgTypes(n,terms);
                
                if(length.apply(es).eql(length.apply(ts2)).boolVal)
                {checkTermArgTypes(l,es,ts2,selfType,valueEnv,cnstrEnv,typeEnv);
                return new ESLVal("UnionType",l1,terms);}
                else
                  return error(new ESLVal("TypeError",l,n.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(es)))))));
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(75075,75637)").add(ESLVal.list(_v120)));
            }
            }
            }
            else
              return error(new ESLVal("TypeError",l,new ESLVal("generic constructor ").add(n.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(ts))))))));
          }
          }
          }
          }
        case "UnionType": {ESLVal $926 = _v119.termRef(0);
            ESLVal $925 = _v119.termRef(1);
            
            {ESLVal l1 = $926;
            
            {ESLVal terms = $925;
            
            {ESLVal ts2 = findTermArgTypes(n,terms);
            
            if(length.apply(ts).neql($zero).boolVal)
            return error(new ESLVal("TypeError",l,new ESLVal("generic application of non-generic constructior: ").add(n)));
            else
              if(length.apply(es).eql(length.apply(ts2)).boolVal)
                {checkTermArgTypes(l,es,ts2,selfType,valueEnv,cnstrEnv,typeEnv);
                return t;}
                else
                  return error(new ESLVal("TypeError",l,n.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(es)))))));
          }
          }
          }
          }
          default: {ESLVal _v175 = _v119;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a union type for ").add(n.add(new ESLVal(" but got ").add(ppType(_v175,typeEnv))))));
          }
        }
        }
  }
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),null) { public ESLVal apply(ESLVal... args) { return termTypeCheckUnion(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]); }});
  private static ESLVal unfoldIf(ESLVal t) {
    
    {ESLVal _v121 = t;
      
      switch(_v121.termName) {
      case "RecType": {ESLVal $934 = _v121.termRef(0);
        ESLVal $933 = _v121.termRef(1);
        ESLVal $932 = _v121.termRef(2);
        
        {ESLVal l = $934;
        
        {ESLVal n = $933;
        
        {ESLVal _v172 = $932;
        
        return unfoldIf(unfoldType(l,n,_v172));
      }
      }
      }
      }
      default: {ESLVal _v173 = _v121;
        
        return _v173;
      }
    }
    }
  }
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),null) { public ESLVal apply(ESLVal... args) { return unfoldIf(args[0]); }});
  private static ESLVal findTermArgTypes(ESLVal n,ESLVal terms) {
    
    {ESLVal _v122 = terms;
      
      if(_v122.isCons())
      {ESLVal $935 = _v122.head();
        ESLVal $936 = _v122.tail();
        
        switch($935.termName) {
        case "TermType": {ESLVal $939 = $935.termRef(0);
          ESLVal $938 = $935.termRef(1);
          ESLVal $937 = $935.termRef(2);
          
          {ESLVal l = $939;
          
          {ESLVal nn = $938;
          
          {ESLVal ts = $937;
          
          {ESLVal _v170 = $936;
          
          if(nn.eql(n).boolVal)
          return ts;
          else
            {ESLVal t = $935;
              
              {ESLVal _v171 = $936;
              
              return findTermArgTypes(n,_v171);
            }
            }
        }
        }
        }
        }
        }
        default: {ESLVal t = $935;
          
          {ESLVal ts = $936;
          
          return findTermArgTypes(n,ts);
        }
        }
      }
      }
    else if(_v122.isNil())
      return error(new ESLVal("cannot find constructor ").add(n));
    else return error(new ESLVal("case error at Pos(76645,76845)").add(ESLVal.list(_v122)));
    }
  }
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),null) { public ESLVal apply(ESLVal... args) { return findTermArgTypes(args[0],args[1]); }});
  private static ESLVal checkTermArgTypes(ESLVal l,ESLVal es,ESLVal ts,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v123 = es;
      ESLVal _v124 = ts;
      
      if(_v123.isCons())
      {ESLVal $940 = _v123.head();
        ESLVal $941 = _v123.tail();
        
        if(_v124.isCons())
        {ESLVal $942 = _v124.head();
          ESLVal $943 = _v124.tail();
          
          {ESLVal e = $940;
          
          {ESLVal _v168 = $941;
          
          {ESLVal t = $942;
          
          {ESLVal _v169 = $943;
          
          {ESLVal tt = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
          
          if(typeEqual(t,tt).boolVal)
          return checkTermArgTypes(l,_v168,_v169,selfType,valueEnv,cnstrEnv,typeEnv);
          else
            return error(new ESLVal("TypeError",l,new ESLVal("expected constructor arg type ").add(ppType(t,typeEnv).add(new ESLVal(" but supplied ").add(ppType(tt,typeEnv))))));
        }
        }
        }
        }
        }
        }
      else if(_v124.isNil())
        return error(new ESLVal("case error at Pos(76963,77385)").add(ESLVal.list(_v123,_v124)));
      else return error(new ESLVal("case error at Pos(76963,77385)").add(ESLVal.list(_v123,_v124)));
      }
    else if(_v123.isNil())
      if(_v124.isCons())
        {ESLVal $944 = _v124.head();
          ESLVal $945 = _v124.tail();
          
          return error(new ESLVal("case error at Pos(76963,77385)").add(ESLVal.list(_v123,_v124)));
        }
      else if(_v124.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(76963,77385)").add(ESLVal.list(_v123,_v124)));
    else return error(new ESLVal("case error at Pos(76963,77385)").add(ESLVal.list(_v123,_v124)));
    }
  }
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),null) { public ESLVal apply(ESLVal... args) { return checkTermArgTypes(args[0],args[1],args[2],args[3],args[4],args[5],args[6]); }});
  private static ESLVal notType(ESLVal l,ESLVal e,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal _v125 = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
      
      switch(_v125.termName) {
      case "BoolType": {ESLVal $946 = _v125.termRef(0);
        
        {ESLVal _v167 = $946;
        
        return theTypeBool;
      }
      }
      default: {ESLVal t = _v125;
        
        return error(new ESLVal("TypeError",l,new ESLVal("expecting a boolean: ").add(ppType(t,typeEnv))));
      }
    }
    }
  }
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),null) { public ESLVal apply(ESLVal... args) { return notType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal varType(ESLVal l,ESLVal n,ESLVal valueEnv,ESLVal typeEnv) {
    
    {ESLVal t = lookupType(n,valueEnv);
      
      if(t.eql($null).boolVal)
      return error(new ESLVal("TypeError",l,new ESLVal("unbound variable ").add(n)));
      else
        {ESLVal _v126 = t;
          
          switch(_v126.termName) {
          case "TypeClosure": {ESLVal $947 = _v126.termRef(0);
            
            {ESLVal f = $947;
            
            return f.apply();
          }
          }
          default: {ESLVal _v166 = _v126;
            
            return _v166;
          }
        }
        }
    }
  }
  private static ESLVal varType = new ESLVal(new Function(new ESLVal("varType"),null) { public ESLVal apply(ESLVal... args) { return varType(args[0],args[1],args[2],args[3]); }});
  private static ESLVal blockType(ESLVal l,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    {ESLVal[] t = new ESLVal[]{theTypeVoid};
      
      {{
      ESLVal _v127 = es;
      while(_v127.isCons()) {
        ESLVal e = _v127.headVal;
        t[0] = expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
        _v127 = _v127.tailVal;}
    }
    return t[0];}
    }
  }
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),null) { public ESLVal apply(ESLVal... args) { return blockType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal listType(ESLVal l,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    if(es.eql($nil).boolVal)
      return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",l,new ESLVal("VarType",l,new ESLVal("T"))));
      else
        {ESLVal ts = map(new ESLVal(new Function(new ESLVal("fun208"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal e = $args[0];
            return expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
              }
            }),es);
          
          if(allEqualTypes(head.apply(ts),tail.apply(ts)).boolVal)
          return new ESLVal("ListType",l,head.apply(ts));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("lists should have elements of the same type: ").add(es)));
        }
  }
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),null) { public ESLVal apply(ESLVal... args) { return listType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal setType(ESLVal l,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    if(es.eql($nil).boolVal)
      return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",l,new ESLVal("VarType",l,new ESLVal("T"))));
      else
        {ESLVal ts = map(new ESLVal(new Function(new ESLVal("fun209"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal e = $args[0];
            return expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
              }
            }),es);
          
          if(allEqualTypes(head.apply(ts),tail.apply(ts)).boolVal)
          return new ESLVal("SetType",l,head.apply(ts));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("sets should have elements of the same type: ").add(es)));
        }
  }
  private static ESLVal setType = new ESLVal(new Function(new ESLVal("setType"),null) { public ESLVal apply(ESLVal... args) { return setType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal bagType(ESLVal l,ESLVal es,ESLVal selfType,ESLVal valueEnv,ESLVal cnstrEnv,ESLVal typeEnv) {
    
    if(es.eql($nil).boolVal)
      return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",l,new ESLVal("VarType",l,new ESLVal("T"))));
      else
        {ESLVal ts = map(new ESLVal(new Function(new ESLVal("fun210"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal e = $args[0];
            return expType(e,selfType,valueEnv,cnstrEnv,typeEnv);
              }
            }),es);
          
          if(allEqualTypes(head.apply(ts),tail.apply(ts)).boolVal)
          return new ESLVal("BagType",l,head.apply(ts));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("bags should have elements of the same type: ").add(es)));
        }
  }
  private static ESLVal bagType = new ESLVal(new Function(new ESLVal("bagType"),null) { public ESLVal apply(ESLVal... args) { return bagType(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal recTypes(ESLVal env) {
    
    { LetRec letrec = new LetRec() {
      ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v165 = $args[0];
        {ESLVal[] e = new ESLVal[]{$null};
              
              {ESLVal fenv = new SerializableFunction<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal t = $l0.head();
                      $l0 = $l0.tail();
                      ESLVal $l1 = typeFV(t);
                while(!$l1.isNil()) {
                  ESLVal n = $l1.head();
                  $l1 = $l1.tail();
                  $v.add(new ESLVal("Map",n,new ESLVal("TypeClosure",new ESLVal(new Function(new ESLVal("lookup: ").add(n),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return lookupType(n,e[0]);
                    }
                  }))));
                }
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(typeEnvRan(_v165));
              
              {ESLVal env1 = substOnce.apply(_v165,fenv);
              
              {e[0] = env1;
            return env1;}
            }
            }
            }
          }
        });
      ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v164 = $args[0];
        {ESLVal _v128 = _v164;
              
              if(_v128.isCons())
              {ESLVal $948 = _v128.head();
                ESLVal $949 = _v128.tail();
                
                switch($948.termName) {
                case "Map": {ESLVal $951 = $948.termRef(0);
                  ESLVal $950 = $948.termRef(1);
                  
                  switch($950.termName) {
                  case "RecordType": {ESLVal $953 = $950.termRef(0);
                    ESLVal $952 = $950.termRef(1);
                    
                    {ESLVal n = $951;
                    
                    {ESLVal l = $953;
                    
                    {ESLVal fs = $952;
                    
                    {ESLVal e = $949;
                    
                    return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecordType",l,fs)));
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal n = $951;
                    
                    {ESLVal t = $950;
                    
                    {ESLVal e = $949;
                    
                    if(member.apply(n,typeFV(t)).boolVal)
                    return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecType",p0,n,t)));
                    else
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,t));
                  }
                  }
                  }
                }
                }
                default: return error(new ESLVal("case error at Pos(79948,80262)").add(ESLVal.list(_v128)));
              }
              }
            else if(_v128.isNil())
              return _v164;
            else return error(new ESLVal("case error at Pos(79948,80262)").add(ESLVal.list(_v128)));
            }
          }
        });
      ESLVal substOnce = new ESLVal(new Function(new ESLVal("substOnce"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v162 = $args[0];
        ESLVal _v163 = $args[1];
        {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal m = $args[0];
                {ESLVal _v129 = m;
                      
                      switch(_v129.termName) {
                      case "Map": {ESLVal $955 = _v129.termRef(0);
                        ESLVal $954 = _v129.termRef(1);
                        
                        {ESLVal n = $955;
                        
                        {ESLVal t = $954;
                        
                        return new ESLVal("Map",n,substTypeEnv(new SerializableFunction<ESLVal,ESLVal>() {
                          public ESLVal apply(ESLVal $l0) {
                            ESLVal $a = $nil;
                            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                            while(!$l0.isNil()) { 
                              ESLVal n = $l0.head();
                              $l0 = $l0.tail();
                              $v.add(new ESLVal("Map",n,lookupType(n,_v163)));
                            }
                            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                            return $a;
                          }}.apply(typeFV(t)),t));
                      }
                      }
                      }
                      default: return error(new ESLVal("case error at Pos(80372,80503)").add(ESLVal.list(_v129)));
                    }
                    }
                  }
                });
              
              return map(map1,_v162);
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "fixEnv": return fixEnv;
          
          case "introduceRecTypes": return introduceRecTypes;
          
          case "substOnce": return substOnce;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal fixEnv = letrec.get("fixEnv");
    
    ESLVal introduceRecTypes = letrec.get("introduceRecTypes");
    
    ESLVal substOnce = letrec.get("substOnce");
    
      return fixEnv.apply(introduceRecTypes.apply(env));}
    
  }
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),null) { public ESLVal apply(ESLVal... args) { return recTypes(args[0]); }});
  private static ESLVal typeFV(ESLVal t) {
    
    return removeDups(varTypeNames(typeFV1(t,$nil)));
  }
  private static ESLVal typeFV = new ESLVal(new Function(new ESLVal("typeFV"),null) { public ESLVal apply(ESLVal... args) { return typeFV(args[0]); }});
  private static ESLVal varTypeNames(ESLVal vs) {
    
    return map(varTypeName,vs);
  }
  private static ESLVal varTypeNames = new ESLVal(new Function(new ESLVal("varTypeNames"),null) { public ESLVal apply(ESLVal... args) { return varTypeNames(args[0]); }});
  private static ESLVal varTypeName(ESLVal t) {
    
    {ESLVal _v130 = t;
      
      switch(_v130.termName) {
      case "VarType": {ESLVal $957 = _v130.termRef(0);
        ESLVal $956 = _v130.termRef(1);
        
        {ESLVal l = $957;
        
        {ESLVal n = $956;
        
        return n;
      }
      }
      }
      default: {ESLVal x = _v130;
        
        return new ESLVal("<var>");
      }
    }
    }
  }
  private static ESLVal varTypeName = new ESLVal(new Function(new ESLVal("varTypeName"),null) { public ESLVal apply(ESLVal... args) { return varTypeName(args[0]); }});
  private static ESLVal tdecsFV1(ESLVal decs,ESLVal fv) {
    
    {ESLVal _v131 = decs;
      
      if(_v131.isCons())
      {ESLVal $958 = _v131.head();
        ESLVal $959 = _v131.tail();
        
        {ESLVal d = $958;
        
        {ESLVal ds = $959;
        
        return tdecFV1(d,tdecsFV1(ds,fv));
      }
      }
      }
    else if(_v131.isNil())
      return fv;
    else return error(new ESLVal("case error at Pos(80889,80978)").add(ESLVal.list(_v131)));
    }
  }
  private static ESLVal tdecsFV1 = new ESLVal(new Function(new ESLVal("tdecsFV1"),null) { public ESLVal apply(ESLVal... args) { return tdecsFV1(args[0],args[1]); }});
  private static ESLVal tdecFV1(ESLVal d,ESLVal fv) {
    
    {ESLVal _v132 = d;
      
      switch(_v132.termName) {
      case "Dec": {ESLVal $963 = _v132.termRef(0);
        ESLVal $962 = _v132.termRef(1);
        ESLVal $961 = _v132.termRef(2);
        ESLVal $960 = _v132.termRef(3);
        
        {ESLVal l = $963;
        
        {ESLVal n = $962;
        
        {ESLVal t = $961;
        
        {ESLVal st = $960;
        
        return typeFV1(t,fv);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(81022,81101)").add(ESLVal.list(_v132)));
    }
    }
  }
  private static ESLVal tdecFV1 = new ESLVal(new Function(new ESLVal("tdecFV1"),null) { public ESLVal apply(ESLVal... args) { return tdecFV1(args[0],args[1]); }});
  private static ESLVal handlersFV1(ESLVal handlers,ESLVal fv) {
    
    {ESLVal _v133 = handlers;
      
      if(_v133.isCons())
      {ESLVal $964 = _v133.head();
        ESLVal $965 = _v133.tail();
        
        {ESLVal m = $964;
        
        {ESLVal hs = $965;
        
        return handlerFV1(m,handlersFV1(hs,fv));
      }
      }
      }
    else if(_v133.isNil())
      return fv;
    else return error(new ESLVal("case error at Pos(81159,81261)").add(ESLVal.list(_v133)));
    }
  }
  private static ESLVal handlersFV1 = new ESLVal(new Function(new ESLVal("handlersFV1"),null) { public ESLVal apply(ESLVal... args) { return handlersFV1(args[0],args[1]); }});
  private static ESLVal handlerFV1(ESLVal m,ESLVal fv) {
    
    {ESLVal _v134 = m;
      
      switch(_v134.termName) {
      case "MessageType": {ESLVal $967 = _v134.termRef(0);
        ESLVal $966 = _v134.termRef(1);
        
        {ESLVal l = $967;
        
        {ESLVal ts = $966;
        
        return typesFV1(ts,fv);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(81309,81385)").add(ESLVal.list(_v134)));
    }
    }
  }
  private static ESLVal handlerFV1 = new ESLVal(new Function(new ESLVal("handlerFV1"),null) { public ESLVal apply(ESLVal... args) { return handlerFV1(args[0],args[1]); }});
  private static ESLVal typesFV1(ESLVal ts,ESLVal fv) {
    
    {ESLVal _v135 = ts;
      
      if(_v135.isCons())
      {ESLVal $968 = _v135.head();
        ESLVal $969 = _v135.tail();
        
        {ESLVal t = $968;
        
        {ESLVal _v161 = $969;
        
        return typeFV1(t,typesFV1(_v161,fv));
      }
      }
      }
    else if(_v135.isNil())
      return fv;
    else return error(new ESLVal("case error at Pos(81434,81521)").add(ESLVal.list(_v135)));
    }
  }
  private static ESLVal typesFV1 = new ESLVal(new Function(new ESLVal("typesFV1"),null) { public ESLVal apply(ESLVal... args) { return typesFV1(args[0],args[1]); }});
  private static ESLVal typeFV1(ESLVal t,ESLVal fv) {
    
    {ESLVal _v136 = t;
      
      switch(_v136.termName) {
      case "ArrayType": {ESLVal $1035 = _v136.termRef(0);
        ESLVal $1034 = _v136.termRef(1);
        
        {ESLVal l = $1035;
        
        {ESLVal _v160 = $1034;
        
        return typeFV1(_v160,fv);
      }
      }
      }
    case "ActType": {ESLVal $1033 = _v136.termRef(0);
        ESLVal $1032 = _v136.termRef(1);
        ESLVal $1031 = _v136.termRef(2);
        
        {ESLVal l = $1033;
        
        {ESLVal decs = $1032;
        
        {ESLVal handlers = $1031;
        
        return tdecsFV1(decs,handlersFV1(handlers,fv));
      }
      }
      }
      }
    case "ExtendedAct": {ESLVal $1030 = _v136.termRef(0);
        ESLVal $1029 = _v136.termRef(1);
        ESLVal $1028 = _v136.termRef(2);
        ESLVal $1027 = _v136.termRef(3);
        
        {ESLVal l = $1030;
        
        {ESLVal parent = $1029;
        
        {ESLVal decs = $1028;
        
        {ESLVal handlers = $1027;
        
        return tdecsFV1(decs,handlersFV1(handlers,typeFV1(parent,fv)));
      }
      }
      }
      }
      }
    case "ApplyType": {ESLVal $1026 = _v136.termRef(0);
        ESLVal $1025 = _v136.termRef(1);
        ESLVal $1024 = _v136.termRef(2);
        
        {ESLVal l = $1026;
        
        {ESLVal n = $1025;
        
        {ESLVal types = $1024;
        
        return typesFV1(types,fv.cons(new ESLVal("VarType",l,n)));
      }
      }
      }
      }
    case "ApplyTypeFun": {ESLVal $1023 = _v136.termRef(0);
        ESLVal $1022 = _v136.termRef(1);
        ESLVal $1021 = _v136.termRef(2);
        
        {ESLVal l = $1023;
        
        {ESLVal op = $1022;
        
        {ESLVal args = $1021;
        
        return typesFV1(args,typeFV1(op,fv));
      }
      }
      }
      }
    case "BoolType": {ESLVal $1020 = _v136.termRef(0);
        
        {ESLVal l = $1020;
        
        return fv;
      }
      }
    case "FieldType": {ESLVal $1019 = _v136.termRef(0);
        ESLVal $1018 = _v136.termRef(1);
        ESLVal $1017 = _v136.termRef(2);
        
        {ESLVal l = $1019;
        
        {ESLVal n = $1018;
        
        {ESLVal _v159 = $1017;
        
        return typeFV1(_v159,fv);
      }
      }
      }
      }
    case "FloatType": {ESLVal $1016 = _v136.termRef(0);
        
        {ESLVal l = $1016;
        
        return fv;
      }
      }
    case "ForallType": {ESLVal $1015 = _v136.termRef(0);
        ESLVal $1014 = _v136.termRef(1);
        ESLVal $1013 = _v136.termRef(2);
        
        {ESLVal l = $1015;
        
        {ESLVal ns = $1014;
        
        {ESLVal _v156 = $1013;
        
        return filter(new ESLVal(new Function(new ESLVal("fun211"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v157 = $args[0];
        {ESLVal _v140 = _v157;
              
              switch(_v140.termName) {
              case "VarType": {ESLVal $1045 = _v140.termRef(0);
                ESLVal $1044 = _v140.termRef(1);
                
                {ESLVal _v158 = $1045;
                
                {ESLVal n = $1044;
                
                return member.apply(n,ns).not();
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(82360,82420)").add(ESLVal.list(_v140)));
            }
            }
          }
        }),typeFV1(_v156,$nil)).add(fv);
      }
      }
      }
      }
    case "FunType": {ESLVal $1012 = _v136.termRef(0);
        ESLVal $1011 = _v136.termRef(1);
        ESLVal $1010 = _v136.termRef(2);
        
        {ESLVal l = $1012;
        
        {ESLVal d = $1011;
        
        {ESLVal r = $1010;
        
        return typesFV1(d,typeFV1(r,fv));
      }
      }
      }
      }
    case "IntType": {ESLVal $1009 = _v136.termRef(0);
        
        {ESLVal l = $1009;
        
        return fv;
      }
      }
    case "ListType": {ESLVal $1008 = _v136.termRef(0);
        ESLVal $1007 = _v136.termRef(1);
        
        {ESLVal l = $1008;
        
        {ESLVal _v155 = $1007;
        
        return typeFV1(_v155,fv);
      }
      }
      }
    case "BagType": {ESLVal $1006 = _v136.termRef(0);
        ESLVal $1005 = _v136.termRef(1);
        
        {ESLVal l = $1006;
        
        {ESLVal _v154 = $1005;
        
        return typeFV1(_v154,fv);
      }
      }
      }
    case "SetType": {ESLVal $1004 = _v136.termRef(0);
        ESLVal $1003 = _v136.termRef(1);
        
        {ESLVal l = $1004;
        
        {ESLVal _v153 = $1003;
        
        return typeFV1(_v153,fv);
      }
      }
      }
    case "NullType": {ESLVal $1002 = _v136.termRef(0);
        
        {ESLVal l = $1002;
        
        return fv;
      }
      }
    case "ObserverType": {ESLVal $1001 = _v136.termRef(0);
        ESLVal $1000 = _v136.termRef(1);
        ESLVal $999 = _v136.termRef(2);
        
        {ESLVal l = $1001;
        
        {ESLVal s = $1000;
        
        {ESLVal m = $999;
        
        return typeFV1(s,typeFV1(m,fv));
      }
      }
      }
      }
    case "ObservedType": {ESLVal $998 = _v136.termRef(0);
        ESLVal $997 = _v136.termRef(1);
        ESLVal $996 = _v136.termRef(2);
        
        {ESLVal l = $998;
        
        {ESLVal s = $997;
        
        {ESLVal m = $996;
        
        return typeFV1(s,typeFV1(m,fv));
      }
      }
      }
      }
    case "RecordType": {ESLVal $995 = _v136.termRef(0);
        ESLVal $994 = _v136.termRef(1);
        
        {ESLVal l = $995;
        
        {ESLVal fs = $994;
        
        return typesFV1(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v139 = $qualArg;
              
              switch(_v139.termName) {
              case "Dec": {ESLVal $1043 = _v139.termRef(0);
                ESLVal $1042 = _v139.termRef(1);
                ESLVal $1041 = _v139.termRef(2);
                ESLVal $1040 = _v139.termRef(3);
                
                {ESLVal _v151 = $1043;
                
                {ESLVal n = $1042;
                
                {ESLVal _v152 = $1041;
                
                {ESLVal dt = $1040;
                
                return ESLVal.list(ESLVal.list(_v152));
              }
              }
              }
              }
              }
              default: {ESLVal _0 = _v139;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten(),fv);
      }
      }
      }
    case "RecType": {ESLVal $993 = _v136.termRef(0);
        ESLVal $992 = _v136.termRef(1);
        ESLVal $991 = _v136.termRef(2);
        
        {ESLVal l = $993;
        
        {ESLVal a = $992;
        
        {ESLVal _v148 = $991;
        
        return filter(new ESLVal(new Function(new ESLVal("fun212"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v149 = $args[0];
        {ESLVal _v138 = _v149;
              
              switch(_v138.termName) {
              case "VarType": {ESLVal $1039 = _v138.termRef(0);
                ESLVal $1038 = _v138.termRef(1);
                
                {ESLVal _v150 = $1039;
                
                {ESLVal n = $1038;
                
                return n.eql(a).not();
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(83001,83049)").add(ESLVal.list(_v138)));
            }
            }
          }
        }),typeFV1(_v148,$nil)).add(fv);
      }
      }
      }
      }
    case "StrType": {ESLVal $990 = _v136.termRef(0);
        
        {ESLVal l = $990;
        
        return fv;
      }
      }
    case "TableType": {ESLVal $989 = _v136.termRef(0);
        ESLVal $988 = _v136.termRef(1);
        ESLVal $987 = _v136.termRef(2);
        
        {ESLVal l = $989;
        
        {ESLVal k = $988;
        
        {ESLVal v = $987;
        
        return typeFV1(k,typeFV1(v,fv));
      }
      }
      }
      }
    case "TypeClosure": {ESLVal $986 = _v136.termRef(0);
        
        {ESLVal f = $986;
        
        return $nil;
      }
      }
    case "TermType": {ESLVal $985 = _v136.termRef(0);
        ESLVal $984 = _v136.termRef(1);
        ESLVal $983 = _v136.termRef(2);
        
        {ESLVal l = $985;
        
        {ESLVal n = $984;
        
        {ESLVal ts = $983;
        
        return typesFV1(ts,fv);
      }
      }
      }
      }
    case "TypeFun": {ESLVal $982 = _v136.termRef(0);
        ESLVal $981 = _v136.termRef(1);
        ESLVal $980 = _v136.termRef(2);
        
        {ESLVal l = $982;
        
        {ESLVal ns = $981;
        
        {ESLVal _v145 = $980;
        
        return filter(new ESLVal(new Function(new ESLVal("fun213"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v146 = $args[0];
        {ESLVal _v137 = _v146;
              
              switch(_v137.termName) {
              case "VarType": {ESLVal $1037 = _v137.termRef(0);
                ESLVal $1036 = _v137.termRef(1);
                
                {ESLVal _v147 = $1037;
                
                {ESLVal n = $1036;
                
                return member.apply(n,ns).not();
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(83345,83405)").add(ESLVal.list(_v137)));
            }
            }
          }
        }),typeFV1(_v145,$nil)).add(fv);
      }
      }
      }
      }
    case "UnfoldType": {ESLVal $979 = _v136.termRef(0);
        ESLVal $978 = _v136.termRef(1);
        
        {ESLVal l = $979;
        
        {ESLVal _v144 = $978;
        
        return typeFV1(_v144,fv);
      }
      }
      }
    case "UnionType": {ESLVal $977 = _v136.termRef(0);
        ESLVal $976 = _v136.termRef(1);
        
        {ESLVal l = $977;
        
        {ESLVal ts = $976;
        
        return typesFV1(ts,fv);
      }
      }
      }
    case "VarType": {ESLVal $975 = _v136.termRef(0);
        ESLVal $974 = _v136.termRef(1);
        
        {ESLVal l = $975;
        
        {ESLVal n = $974;
        
        return fv.cons(t);
      }
      }
      }
    case "VoidType": {ESLVal $973 = _v136.termRef(0);
        
        {ESLVal l = $973;
        
        return fv;
      }
      }
    case "UnionRef": {ESLVal $972 = _v136.termRef(0);
        ESLVal $971 = _v136.termRef(1);
        ESLVal $970 = _v136.termRef(2);
        
        {ESLVal l = $972;
        
        {ESLVal _v143 = $971;
        
        {ESLVal n = $970;
        
        return typeFV1(_v143,fv);
      }
      }
      }
      }
      default: {ESLVal x = _v136;
        
        return error(x);
      }
    }
    }
  }
  private static ESLVal typeFV1 = new ESLVal(new Function(new ESLVal("typeFV1"),null) { public ESLVal apply(ESLVal... args) { return typeFV1(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}