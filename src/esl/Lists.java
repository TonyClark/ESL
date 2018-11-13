package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Lists {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal adjoin = new ESLVal(new Function(new ESLVal("adjoin"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  if(member.apply(x,l).boolVal)
        return l;
        else
          return l.cons(x);
    }
  });
  public static ESLVal select1 = new ESLVal(new Function(new ESLVal("select1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal d = $args[1];
  ESLVal p = $args[2];
  {ESLVal _v33 = l;
        
        if(_v33.isCons())
        {ESLVal $71 = _v33.head();
          ESLVal $72 = _v33.tail();
          
          {ESLVal h = $71;
          
          {ESLVal t = $72;
          
          if(p.apply(h).boolVal)
          return h;
          else
            {ESLVal _v75 = $71;
              
              {ESLVal _v76 = $72;
              
              return select1.apply(_v76,d,p);
            }
            }
        }
        }
        }
      else if(_v33.isNil())
        return d;
      else return error(new ESLVal("case error at Pos(515,613)").add(ESLVal.list(_v33)));
      }
    }
  });
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v32 = l;
        
        if(_v32.isCons())
        {ESLVal $69 = _v32.head();
          ESLVal $70 = _v32.tail();
          
          {ESLVal m = $69;
          
          {ESLVal ms = $70;
          
          return map.apply(f,ms).cons(f.apply(m));
        }
        }
        }
      else if(_v32.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(651,719)").add(ESLVal.list(_v32)));
      }
    }
  });
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v31 = l;
        
        if(_v31.isCons())
        {ESLVal $67 = _v31.head();
          ESLVal $68 = _v31.tail();
          
          {ESLVal h = $67;
          
          {ESLVal t = $68;
          
          if(h.eql(v).boolVal)
          return remove.apply(v,t);
          else
            {ESLVal _v73 = $67;
              
              {ESLVal _v74 = $68;
              
              return remove.apply(v,_v74).cons(_v73);
            }
            }
        }
        }
        }
      else if(_v31.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(868,979)").add(ESLVal.list(_v31)));
      }
    }
  });
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v30 = l;
        
        if(_v30.isCons())
        {ESLVal $65 = _v30.head();
          ESLVal $66 = _v30.tail();
          
          {ESLVal h = $65;
          
          {ESLVal t = $66;
          
          if(h.eql(v).boolVal)
          return t;
          else
            {ESLVal _v71 = $65;
              
              {ESLVal _v72 = $66;
              
              return remove1.apply(v,_v72).cons(_v71);
            }
            }
        }
        }
        }
      else if(_v30.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1014,1113)").add(ESLVal.list(_v30)));
      }
    }
  });
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v29 = l;
        
        if(_v29.isCons())
        {ESLVal $63 = _v29.head();
          ESLVal $64 = _v29.tail();
          
          {ESLVal h = $63;
          
          {ESLVal t = $64;
          
          return $one.add(length.apply(t));
        }
        }
        }
      else if(_v29.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1252,1306)").add(ESLVal.list(_v29)));
      }
    }
  });
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal lists = $args[0];
  {ESLVal _v28 = lists;
        
        if(_v28.isCons())
        {ESLVal $61 = _v28.head();
          ESLVal $62 = _v28.tail();
          
          {ESLVal h = $61;
          
          {ESLVal t = $62;
          
          return h.add(flatten.apply(t));
        }
        }
        }
      else if(_v28.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1786,1852)").add(ESLVal.list(_v28)));
      }
    }
  });
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v27 = l;
        
        if(_v27.isCons())
        {ESLVal $59 = _v27.head();
          ESLVal $60 = _v27.tail();
          
          {ESLVal h = $59;
          
          {ESLVal t = $60;
          
          if(h.eql(x).boolVal)
          return $one.add(count.apply(x,t));
          else
            return count.apply(x,t);
        }
        }
        }
      else if(_v27.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1893,1981)").add(ESLVal.list(_v27)));
      }
    }
  });
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  ESLVal prefix = $args[1];
  {ESLVal _v26 = list;
        ESLVal _v25 = prefix;
        
        if(_v26.isCons())
        {ESLVal $55 = _v26.head();
          ESLVal $56 = _v26.tail();
          
          if(_v25.isCons())
          {ESLVal $57 = _v25.head();
            ESLVal $58 = _v25.tail();
            
            {ESLVal x = $55;
            
            {ESLVal _v69 = $56;
            
            {ESLVal y = $57;
            
            {ESLVal _v70 = $58;
            
            if(x.eql(y).boolVal)
            return hasPrefix.apply(_v69,_v70);
            else
              if(_v25.isCons())
                {ESLVal $53 = _v25.head();
                  ESLVal $54 = _v25.tail();
                  
                  {ESLVal l1 = _v26;
                  
                  {ESLVal l2 = _v25;
                  
                  return $false;
                }
                }
                }
              else if(_v25.isNil())
                {ESLVal l1 = _v26;
                  
                  return $true;
                }
              else {ESLVal l1 = _v26;
                  
                  {ESLVal l2 = _v25;
                  
                  return $false;
                }
                }
          }
          }
          }
          }
          }
        else if(_v25.isNil())
          if(_v25.isCons())
            {ESLVal $53 = _v25.head();
              ESLVal $54 = _v25.tail();
              
              {ESLVal l1 = _v26;
              
              {ESLVal l2 = _v25;
              
              return $false;
            }
            }
            }
          else if(_v25.isNil())
            {ESLVal l1 = _v26;
              
              return $true;
            }
          else {ESLVal l1 = _v26;
              
              {ESLVal l2 = _v25;
              
              return $false;
            }
            }
        else if(_v25.isCons())
            {ESLVal $53 = _v25.head();
              ESLVal $54 = _v25.tail();
              
              {ESLVal l1 = _v26;
              
              {ESLVal l2 = _v25;
              
              return $false;
            }
            }
            }
          else if(_v25.isNil())
            {ESLVal l1 = _v26;
              
              return $true;
            }
          else {ESLVal l1 = _v26;
              
              {ESLVal l2 = _v25;
              
              return $false;
            }
            }
        }
      else if(_v26.isNil())
        if(_v25.isCons())
          {ESLVal $53 = _v25.head();
            ESLVal $54 = _v25.tail();
            
            {ESLVal l1 = _v26;
            
            {ESLVal l2 = _v25;
            
            return $false;
          }
          }
          }
        else if(_v25.isNil())
          {ESLVal l1 = _v26;
            
            return $true;
          }
        else {ESLVal l1 = _v26;
            
            {ESLVal l2 = _v25;
            
            return $false;
          }
          }
      else if(_v25.isCons())
          {ESLVal $53 = _v25.head();
            ESLVal $54 = _v25.tail();
            
            {ESLVal l1 = _v26;
            
            {ESLVal l2 = _v25;
            
            return $false;
          }
          }
          }
        else if(_v25.isNil())
          {ESLVal l1 = _v26;
            
            return $true;
          }
        else {ESLVal l1 = _v26;
            
            {ESLVal l2 = _v25;
            
            return $false;
          }
          }
      }
    }
  });
  public static ESLVal nth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("nth"),new ESLVal(2));
  public static ESLVal nthSemantics = new ESLVal(new Function(new ESLVal("nthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v24 = l;
        
        if(_v24.isCons())
        {ESLVal $51 = _v24.head();
          ESLVal $52 = _v24.tail();
          
          {ESLVal h = $51;
          
          {ESLVal t = $52;
          
          if(n.eql($zero).boolVal)
          return h;
          else
            return nth.apply(t,n.sub($one));
        }
        }
        }
      else if(_v24.isNil())
        return error(new ESLVal("cannot take nth element."));
      else return error(new ESLVal("case error at Pos(2295,2410)").add(ESLVal.list(_v24)));
      }
    }
  });
  public static ESLVal take = new ESLVal(new Function(new ESLVal("take"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  if(n.eql($zero).boolVal)
        return $nil;
        else
          {ESLVal _v23 = l;
            
            if(_v23.isCons())
            {ESLVal $49 = _v23.head();
              ESLVal $50 = _v23.tail();
              
              {ESLVal h = $49;
              
              {ESLVal t = $50;
              
              return take.apply(t,n.sub($one)).cons(h);
            }
            }
            }
          else if(_v23.isNil())
            return error(new ESLVal("cannot take element ").add(n));
          else return error(new ESLVal("case error at Pos(2482,2584)").add(ESLVal.list(_v23)));
          }
    }
  });
  public static ESLVal drop = new ESLVal(new Function(new ESLVal("drop"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  if(n.eql($zero).boolVal)
        return l;
        else
          {ESLVal _v22 = l;
            
            if(_v22.isCons())
            {ESLVal $47 = _v22.head();
              ESLVal $48 = _v22.tail();
              
              {ESLVal h = $47;
              
              {ESLVal t = $48;
              
              return drop.apply(t,n.sub($one));
            }
            }
            }
          else if(_v22.isNil())
            return error(new ESLVal("cannot drop element ").add(n));
          else return error(new ESLVal("case error at Pos(2652,2747)").add(ESLVal.list(_v22)));
          }
    }
  });
  public static ESLVal subst = new ESLVal(new Function(new ESLVal("subst"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal o = $args[1];
  ESLVal l = $args[2];
  {ESLVal _v21 = l;
        
        if(_v21.isCons())
        {ESLVal $45 = _v21.head();
          ESLVal $46 = _v21.tail();
          
          {ESLVal h = $45;
          
          {ESLVal t = $46;
          
          if(h.eql(o).boolVal)
          return subst.apply(n,o,t).cons(n);
          else
            return subst.apply(n,o,t).cons(h);
        }
        }
        }
      else if(_v21.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(2789,2893)").add(ESLVal.list(_v21)));
      }
    }
  });
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun47"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v20 = l;
        
        if(_v20.isCons())
        {ESLVal $43 = _v20.head();
          ESLVal $44 = _v20.tail();
          
          {ESLVal h = $43;
          
          {ESLVal t = $44;
          
          return h;
        }
        }
        }
      else if(_v20.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(2966,3045)").add(ESLVal.list(_v20)));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun48"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v19 = l;
        
        if(_v19.isCons())
        {ESLVal $41 = _v19.head();
          ESLVal $42 = _v19.tail();
          
          {ESLVal h = $41;
          
          {ESLVal t = $42;
          
          return t;
        }
        }
        }
      else if(_v19.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3122,3203)").add(ESLVal.list(_v19)));
      }
    }
  });
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v18 = l;
        
        if(_v18.isCons())
        {ESLVal $39 = _v18.head();
          ESLVal $40 = _v18.tail();
          
          {ESLVal _v67 = _v18;
          
          return $false;
        }
        }
      else if(_v18.isNil())
        return $true;
      else {ESLVal _v68 = _v18;
          
          return $false;
        }
      }
    }
  });
  public static ESLVal member = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("member"),new ESLVal(2));
  public static ESLVal memberSemantics = new ESLVal(new Function(new ESLVal("memberSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v17 = l;
        
        if(_v17.isCons())
        {ESLVal $37 = _v17.head();
          ESLVal $38 = _v17.tail();
          
          {ESLVal x = $37;
          
          {ESLVal xs = $38;
          
          if(x.eql(e).boolVal)
          return $true;
          else
            {ESLVal _v65 = $37;
              
              {ESLVal _v66 = $38;
              
              return member.apply(e,_v66);
            }
            }
        }
        }
        }
      else if(_v17.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3439,3544)").add(ESLVal.list(_v17)));
      }
    }
  });
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v16 = l;
        
        if(_v16.isCons())
        {ESLVal $35 = _v16.head();
          ESLVal $36 = _v16.tail();
          
          {ESLVal x = $35;
          
          {ESLVal xs = $36;
          
          return reverse.apply(xs).add(ESLVal.list(x));
        }
        }
        }
      else if(_v16.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3576,3650)").add(ESLVal.list(_v16)));
      }
    }
  });
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun49"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v15 = l;
        
        if(_v15.isCons())
        {ESLVal $33 = _v15.head();
          ESLVal $34 = _v15.tail();
          
          {ESLVal x = $33;
          
          {ESLVal xs = $34;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v63 = $33;
              
              {ESLVal _v64 = $34;
              
              return exists.apply(pred,_v64);
            }
            }
        }
        }
        }
      else if(_v15.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3758,3869)").add(ESLVal.list(_v15)));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun50"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v14 = l;
        
        if(_v14.isCons())
        {ESLVal $31 = _v14.head();
          ESLVal $32 = _v14.tail();
          
          {ESLVal x = $31;
          
          {ESLVal xs = $32;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v61 = $31;
              
              {ESLVal _v62 = $32;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v14.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(3976,4087)").add(ESLVal.list(_v14)));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal x = $args[2];
  {ESLVal _v13 = l;
        
        if(_v13.isCons())
        {ESLVal $29 = _v13.head();
          ESLVal $30 = _v13.tail();
          
          {ESLVal h = $29;
          
          {ESLVal t = $30;
          
          if(n.eql($zero).boolVal)
          return t.cons(x);
          else
            {ESLVal _v59 = $29;
              
              {ESLVal _v60 = $30;
              
              return replaceNth.apply(_v60,n.sub($one),x).cons(_v59);
            }
            }
        }
        }
        }
      else if(_v13.isNil())
        return error(new ESLVal("cannot replace nth of []"));
      else return error(new ESLVal("case error at Pos(4265,4408)").add(ESLVal.list(_v13)));
      }
    }
  });
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v12 = l;
        
        if(_v12.isCons())
        {ESLVal $27 = _v12.head();
          ESLVal $28 = _v12.tail();
          
          {ESLVal h = $27;
          
          {ESLVal _v56 = $28;
          
          if(h.eql(t).boolVal)
          return $zero;
          else
            {ESLVal _v57 = $27;
              
              {ESLVal _v58 = $28;
              
              return $one.add(indexOf.apply(t,_v58));
            }
            }
        }
        }
        }
      else if(_v12.isNil())
        return $zero.sub($one);
      else return error(new ESLVal("case error at Pos(4443,4544)").add(ESLVal.list(_v12)));
      }
    }
  });
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v11 = l;
        
        if(_v11.isCons())
        {ESLVal $25 = _v11.head();
          ESLVal $26 = _v11.tail();
          
          {ESLVal h = $25;
          
          {ESLVal t = $26;
          
          if(p.apply(h).boolVal)
          return select.apply(p,t).cons(h);
          else
            {ESLVal _v54 = $25;
              
              {ESLVal _v55 = $26;
              
              return select.apply(p,_v55);
            }
            }
        }
        }
        }
      else if(_v11.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4588,4702)").add(ESLVal.list(_v11)));
      }
    }
  });
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v10 = l;
        
        if(_v10.isCons())
        {ESLVal $23 = _v10.head();
          ESLVal $24 = _v10.tail();
          
          {ESLVal h = $23;
          
          {ESLVal t = $24;
          
          if(p.apply(h).boolVal)
          return reject.apply(p,t);
          else
            {ESLVal _v52 = $23;
              
              {ESLVal _v53 = $24;
              
              return reject.apply(p,_v53).cons(_v52);
            }
            }
        }
        }
        }
      else if(_v10.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4746,4860)").add(ESLVal.list(_v10)));
      }
    }
  });
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v9 = l;
        
        if(_v9.isCons())
        {ESLVal $19 = _v9.head();
          ESLVal $20 = _v9.tail();
          
          if($20.isCons())
          {ESLVal $21 = $20.head();
            ESLVal $22 = $20.tail();
            
            {ESLVal h = $19;
            
            {ESLVal _v50 = $20;
            
            return last.apply(_v50);
          }
          }
          }
        else if($20.isNil())
          {ESLVal x = $19;
            
            return x;
          }
        else {ESLVal h = $19;
            
            {ESLVal _v51 = $20;
            
            return last.apply(_v51);
          }
          }
        }
      else if(_v9.isNil())
        return error(new ESLVal("cannot find last element of emply list"));
      else return error(new ESLVal("case error at Pos(4987,5117)").add(ESLVal.list(_v9)));
      }
    }
  });
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v8 = l;
        
        if(_v8.isCons())
        {ESLVal $15 = _v8.head();
          ESLVal $16 = _v8.tail();
          
          if($16.isCons())
          {ESLVal $17 = $16.head();
            ESLVal $18 = $16.tail();
            
            {ESLVal h = $15;
            
            {ESLVal _v48 = $16;
            
            return butlast.apply(_v48).cons(h);
          }
          }
          }
        else if($16.isNil())
          {ESLVal x = $15;
            
            return $nil;
          }
        else {ESLVal h = $15;
            
            {ESLVal _v49 = $16;
            
            return butlast.apply(_v49).cons(h);
          }
          }
        }
      else if(_v8.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5260,5349)").add(ESLVal.list(_v8)));
      }
    }
  });
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v7 = l;
        
        if(_v7.isCons())
        {ESLVal $13 = _v7.head();
          ESLVal $14 = _v7.tail();
          
          {ESLVal h = $13;
          
          {ESLVal t = $14;
          
          if(h.eql(x).boolVal)
          return $one.add(occurrences.apply(x,t));
          else
            {ESLVal _v46 = $13;
              
              {ESLVal _v47 = $14;
              
              return occurrences.apply(x,_v47);
            }
            }
        }
        }
        }
      else if(_v7.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5388,5509)").add(ESLVal.list(_v7)));
      }
    }
  });
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v6 = l;
        
        if(_v6.isCons())
        {ESLVal $11 = _v6.head();
          ESLVal $12 = _v6.tail();
          
          {ESLVal h = $11;
          
          {ESLVal t = $12;
          
          if(pred.apply(h).boolVal)
          return filter.apply(pred,t).cons(h);
          else
            return filter.apply(pred,t);
        }
        }
        }
      else if(_v6.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5557,5688)").add(ESLVal.list(_v6)));
      }
    }
  });
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v45 = $args[0];
  ESLVal _v44 = $args[1];
  ESLVal _v43 = $args[2];
  ESLVal _v42 = $args[3];
  {ESLVal _v5 = _v42;
        
        if(_v5.isCons())
        {ESLVal $9 = _v5.head();
          ESLVal $10 = _v5.tail();
          
          {ESLVal h = $9;
          
          {ESLVal t = $10;
          
          return _v44.apply(_v45.apply(h),foldr.apply(_v45,_v44,_v43,t));
        }
        }
        }
      else if(_v5.isNil())
        return _v43;
      else return error(new ESLVal("case error at Pos(5755,5845)").add(ESLVal.list(_v5)));
      }
    }
  });
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun51"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  return foldr.apply(id,new ESLVal(new Function(new ESLVal("fun52"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal x = $args[0];
        ESLVal y = $args[1];
        return x.add(y);
          }
        }),$zero,list);
    }
  });
  public static ESLVal removeDups = new ESLVal(new Function(new ESLVal("removeDups"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  {ESLVal _v4 = list;
        
        if(_v4.isCons())
        {ESLVal $7 = _v4.head();
          ESLVal $8 = _v4.tail();
          
          {ESLVal x = $7;
          
          {ESLVal l = $8;
          
          return removeDups.apply(remove.apply(x,l)).cons(x);
        }
        }
        }
      else if(_v4.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(6005,6086)").add(ESLVal.list(_v4)));
      }
    }
  });
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v41 = $args[0];
          ESLVal _v40 = $args[1];
          {print.apply(_v40);
              if(_v40.eql(ESLVal.list()).boolVal)
                return _v41;
                else
                  return pre.apply(_v41.add(ESLVal.list(last.apply(_v41).add(ESLVal.list(head.apply(_v40))))),tail.apply(_v40));}
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "pre": return pre;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal pre = letrec.get("pre");
      
        return pre.apply(ESLVal.list(ESLVal.list()),l);
      
    }
  });
  public static ESLVal takeWhile = new ESLVal(new Function(new ESLVal("takeWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v3 = l;
        
        if(_v3.isCons())
        {ESLVal $5 = _v3.head();
          ESLVal $6 = _v3.tail();
          
          {ESLVal t = $5;
          
          {ESLVal _v37 = $6;
          
          if(p.apply(t).boolVal)
          return takeWhile.apply(p,_v37).cons(t);
          else
            {ESLVal _v38 = $5;
              
              {ESLVal _v39 = $6;
              
              return $nil;
            }
            }
        }
        }
        }
      else if(_v3.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6368,6476)").add(ESLVal.list(_v3)));
      }
    }
  });
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v2 = l;
        
        if(_v2.isCons())
        {ESLVal $3 = _v2.head();
          ESLVal $4 = _v2.tail();
          
          {ESLVal t = $3;
          
          {ESLVal _v34 = $4;
          
          if(p.apply(t).boolVal)
          return dropWhile.apply(p,_v34);
          else
            {ESLVal _v35 = _v2;
              
              return _v35;
            }
        }
        }
        }
      else if(_v2.isNil())
        return $nil;
      else {ESLVal _v36 = _v2;
          
          return _v36;
        }
      }
    }
  });
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal removables = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v1 = removables;
        
        if(_v1.isCons())
        {ESLVal $1 = _v1.head();
          ESLVal $2 = _v1.tail();
          
          {ESLVal t = $1;
          
          {ESLVal r = $2;
          
          return removeAll.apply(r,remove.apply(t,l));
        }
        }
        }
      else if(_v1.isNil())
        return l;
      else return error(new ESLVal("case error at Pos(6669,6757)").add(ESLVal.list(_v1)));
      }
    }
  });
public static void main(String[] args) {
  }
}