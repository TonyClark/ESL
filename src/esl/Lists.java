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
  {ESLVal _v11 = l;
        
        if(_v11.isCons())
        {ESLVal $12 = _v11.head();
          ESLVal $13 = _v11.tail();
          
          {ESLVal h = $12;
          
          {ESLVal t = $13;
          
          if(p.apply(h).boolVal)
          return h;
          else
            {ESLVal _v85 = $12;
              
              {ESLVal _v86 = $13;
              
              return select1.apply(_v86,d,p);
            }
            }
        }
        }
        }
      else if(_v11.isNil())
        return d;
      else return error(new ESLVal("case error at Pos(515,613)").add(ESLVal.list(_v11)));
      }
    }
  });
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v12 = l;
        
        if(_v12.isCons())
        {ESLVal $14 = _v12.head();
          ESLVal $15 = _v12.tail();
          
          {ESLVal m = $14;
          
          {ESLVal ms = $15;
          
          return map.apply(f,ms).cons(f.apply(m));
        }
        }
        }
      else if(_v12.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(651,719)").add(ESLVal.list(_v12)));
      }
    }
  });
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v13 = l;
        
        if(_v13.isCons())
        {ESLVal $16 = _v13.head();
          ESLVal $17 = _v13.tail();
          
          {ESLVal h = $16;
          
          {ESLVal t = $17;
          
          if(h.eql(v).boolVal)
          return remove.apply(v,t);
          else
            {ESLVal _v83 = $16;
              
              {ESLVal _v84 = $17;
              
              return remove.apply(v,_v84).cons(_v83);
            }
            }
        }
        }
        }
      else if(_v13.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(868,979)").add(ESLVal.list(_v13)));
      }
    }
  });
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v14 = l;
        
        if(_v14.isCons())
        {ESLVal $18 = _v14.head();
          ESLVal $19 = _v14.tail();
          
          {ESLVal h = $18;
          
          {ESLVal t = $19;
          
          if(h.eql(v).boolVal)
          return t;
          else
            {ESLVal _v81 = $18;
              
              {ESLVal _v82 = $19;
              
              return remove1.apply(v,_v82).cons(_v81);
            }
            }
        }
        }
        }
      else if(_v14.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1014,1113)").add(ESLVal.list(_v14)));
      }
    }
  });
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v15 = l;
        
        if(_v15.isCons())
        {ESLVal $20 = _v15.head();
          ESLVal $21 = _v15.tail();
          
          {ESLVal h = $20;
          
          {ESLVal t = $21;
          
          return $one.add(length.apply(t));
        }
        }
        }
      else if(_v15.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1252,1306)").add(ESLVal.list(_v15)));
      }
    }
  });
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal lists = $args[0];
  {ESLVal _v16 = lists;
        
        if(_v16.isCons())
        {ESLVal $22 = _v16.head();
          ESLVal $23 = _v16.tail();
          
          {ESLVal h = $22;
          
          {ESLVal t = $23;
          
          return h.add(flatten.apply(t));
        }
        }
        }
      else if(_v16.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1786,1852)").add(ESLVal.list(_v16)));
      }
    }
  });
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v17 = l;
        
        if(_v17.isCons())
        {ESLVal $24 = _v17.head();
          ESLVal $25 = _v17.tail();
          
          {ESLVal h = $24;
          
          {ESLVal t = $25;
          
          if(h.eql(x).boolVal)
          return $one.add(count.apply(x,t));
          else
            return count.apply(x,t);
        }
        }
        }
      else if(_v17.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1893,1981)").add(ESLVal.list(_v17)));
      }
    }
  });
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  ESLVal prefix = $args[1];
  {ESLVal _v18 = list;
        ESLVal _v19 = prefix;
        
        if(_v18.isCons())
        {ESLVal $28 = _v18.head();
          ESLVal $29 = _v18.tail();
          
          if(_v19.isCons())
          {ESLVal $30 = _v19.head();
            ESLVal $31 = _v19.tail();
            
            {ESLVal x = $28;
            
            {ESLVal _v79 = $29;
            
            {ESLVal y = $30;
            
            {ESLVal _v80 = $31;
            
            if(x.eql(y).boolVal)
            return hasPrefix.apply(_v79,_v80);
            else
              if(_v19.isCons())
                {ESLVal $26 = _v19.head();
                  ESLVal $27 = _v19.tail();
                  
                  {ESLVal l1 = _v18;
                  
                  {ESLVal l2 = _v19;
                  
                  return $false;
                }
                }
                }
              else if(_v19.isNil())
                {ESLVal l1 = _v18;
                  
                  return $true;
                }
              else {ESLVal l1 = _v18;
                  
                  {ESLVal l2 = _v19;
                  
                  return $false;
                }
                }
          }
          }
          }
          }
          }
        else if(_v19.isNil())
          if(_v19.isCons())
            {ESLVal $26 = _v19.head();
              ESLVal $27 = _v19.tail();
              
              {ESLVal l1 = _v18;
              
              {ESLVal l2 = _v19;
              
              return $false;
            }
            }
            }
          else if(_v19.isNil())
            {ESLVal l1 = _v18;
              
              return $true;
            }
          else {ESLVal l1 = _v18;
              
              {ESLVal l2 = _v19;
              
              return $false;
            }
            }
        else if(_v19.isCons())
            {ESLVal $26 = _v19.head();
              ESLVal $27 = _v19.tail();
              
              {ESLVal l1 = _v18;
              
              {ESLVal l2 = _v19;
              
              return $false;
            }
            }
            }
          else if(_v19.isNil())
            {ESLVal l1 = _v18;
              
              return $true;
            }
          else {ESLVal l1 = _v18;
              
              {ESLVal l2 = _v19;
              
              return $false;
            }
            }
        }
      else if(_v18.isNil())
        if(_v19.isCons())
          {ESLVal $26 = _v19.head();
            ESLVal $27 = _v19.tail();
            
            {ESLVal l1 = _v18;
            
            {ESLVal l2 = _v19;
            
            return $false;
          }
          }
          }
        else if(_v19.isNil())
          {ESLVal l1 = _v18;
            
            return $true;
          }
        else {ESLVal l1 = _v18;
            
            {ESLVal l2 = _v19;
            
            return $false;
          }
          }
      else if(_v19.isCons())
          {ESLVal $26 = _v19.head();
            ESLVal $27 = _v19.tail();
            
            {ESLVal l1 = _v18;
            
            {ESLVal l2 = _v19;
            
            return $false;
          }
          }
          }
        else if(_v19.isNil())
          {ESLVal l1 = _v18;
            
            return $true;
          }
        else {ESLVal l1 = _v18;
            
            {ESLVal l2 = _v19;
            
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
  {ESLVal _v20 = l;
        
        if(_v20.isCons())
        {ESLVal $32 = _v20.head();
          ESLVal $33 = _v20.tail();
          
          {ESLVal h = $32;
          
          {ESLVal t = $33;
          
          if(n.eql($zero).boolVal)
          return h;
          else
            return nth.apply(t,n.sub($one));
        }
        }
        }
      else if(_v20.isNil())
        return error(new ESLVal("cannot take nth element."));
      else return error(new ESLVal("case error at Pos(2295,2410)").add(ESLVal.list(_v20)));
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
          {ESLVal _v21 = l;
            
            if(_v21.isCons())
            {ESLVal $34 = _v21.head();
              ESLVal $35 = _v21.tail();
              
              {ESLVal h = $34;
              
              {ESLVal t = $35;
              
              return take.apply(t,n.sub($one)).cons(h);
            }
            }
            }
          else if(_v21.isNil())
            return error(new ESLVal("cannot take element ").add(n));
          else return error(new ESLVal("case error at Pos(2482,2584)").add(ESLVal.list(_v21)));
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
            {ESLVal $36 = _v22.head();
              ESLVal $37 = _v22.tail();
              
              {ESLVal h = $36;
              
              {ESLVal t = $37;
              
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
  {ESLVal _v23 = l;
        
        if(_v23.isCons())
        {ESLVal $38 = _v23.head();
          ESLVal $39 = _v23.tail();
          
          {ESLVal h = $38;
          
          {ESLVal t = $39;
          
          if(h.eql(o).boolVal)
          return subst.apply(n,o,t).cons(n);
          else
            return subst.apply(n,o,t).cons(h);
        }
        }
        }
      else if(_v23.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(2789,2893)").add(ESLVal.list(_v23)));
      }
    }
  });
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun80"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v24 = l;
        
        if(_v24.isCons())
        {ESLVal $40 = _v24.head();
          ESLVal $41 = _v24.tail();
          
          {ESLVal h = $40;
          
          {ESLVal t = $41;
          
          return h;
        }
        }
        }
      else if(_v24.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(2966,3045)").add(ESLVal.list(_v24)));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun81"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v25 = l;
        
        if(_v25.isCons())
        {ESLVal $42 = _v25.head();
          ESLVal $43 = _v25.tail();
          
          {ESLVal h = $42;
          
          {ESLVal t = $43;
          
          return t;
        }
        }
        }
      else if(_v25.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3122,3203)").add(ESLVal.list(_v25)));
      }
    }
  });
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v26 = l;
        
        if(_v26.isCons())
        {ESLVal $44 = _v26.head();
          ESLVal $45 = _v26.tail();
          
          {ESLVal _v77 = _v26;
          
          return $false;
        }
        }
      else if(_v26.isNil())
        return $true;
      else {ESLVal _v78 = _v26;
          
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
  {ESLVal _v27 = l;
        
        if(_v27.isCons())
        {ESLVal $46 = _v27.head();
          ESLVal $47 = _v27.tail();
          
          {ESLVal x = $46;
          
          {ESLVal xs = $47;
          
          if(x.eql(e).boolVal)
          return $true;
          else
            {ESLVal _v75 = $46;
              
              {ESLVal _v76 = $47;
              
              return member.apply(e,_v76);
            }
            }
        }
        }
        }
      else if(_v27.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3439,3544)").add(ESLVal.list(_v27)));
      }
    }
  });
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v28 = l;
        
        if(_v28.isCons())
        {ESLVal $48 = _v28.head();
          ESLVal $49 = _v28.tail();
          
          {ESLVal x = $48;
          
          {ESLVal xs = $49;
          
          return reverse.apply(xs).add(ESLVal.list(x));
        }
        }
        }
      else if(_v28.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3576,3650)").add(ESLVal.list(_v28)));
      }
    }
  });
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun82"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v29 = l;
        
        if(_v29.isCons())
        {ESLVal $50 = _v29.head();
          ESLVal $51 = _v29.tail();
          
          {ESLVal x = $50;
          
          {ESLVal xs = $51;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v73 = $50;
              
              {ESLVal _v74 = $51;
              
              return exists.apply(pred,_v74);
            }
            }
        }
        }
        }
      else if(_v29.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3758,3869)").add(ESLVal.list(_v29)));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun83"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v30 = l;
        
        if(_v30.isCons())
        {ESLVal $52 = _v30.head();
          ESLVal $53 = _v30.tail();
          
          {ESLVal x = $52;
          
          {ESLVal xs = $53;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v71 = $52;
              
              {ESLVal _v72 = $53;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v30.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(3976,4087)").add(ESLVal.list(_v30)));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal x = $args[2];
  {ESLVal _v31 = l;
        
        if(_v31.isCons())
        {ESLVal $54 = _v31.head();
          ESLVal $55 = _v31.tail();
          
          {ESLVal h = $54;
          
          {ESLVal t = $55;
          
          if(n.eql($zero).boolVal)
          return t.cons(x);
          else
            {ESLVal _v69 = $54;
              
              {ESLVal _v70 = $55;
              
              return replaceNth.apply(_v70,n.sub($one),x).cons(_v69);
            }
            }
        }
        }
        }
      else if(_v31.isNil())
        return error(new ESLVal("cannot replace nth of []"));
      else return error(new ESLVal("case error at Pos(4265,4408)").add(ESLVal.list(_v31)));
      }
    }
  });
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v32 = l;
        
        if(_v32.isCons())
        {ESLVal $56 = _v32.head();
          ESLVal $57 = _v32.tail();
          
          {ESLVal h = $56;
          
          {ESLVal _v66 = $57;
          
          if(h.eql(t).boolVal)
          return $zero;
          else
            {ESLVal _v67 = $56;
              
              {ESLVal _v68 = $57;
              
              return $one.add(indexOf.apply(t,_v68));
            }
            }
        }
        }
        }
      else if(_v32.isNil())
        return $zero.sub($one);
      else return error(new ESLVal("case error at Pos(4443,4544)").add(ESLVal.list(_v32)));
      }
    }
  });
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v33 = l;
        
        if(_v33.isCons())
        {ESLVal $58 = _v33.head();
          ESLVal $59 = _v33.tail();
          
          {ESLVal h = $58;
          
          {ESLVal t = $59;
          
          if(p.apply(h).boolVal)
          return select.apply(p,t).cons(h);
          else
            {ESLVal _v64 = $58;
              
              {ESLVal _v65 = $59;
              
              return select.apply(p,_v65);
            }
            }
        }
        }
        }
      else if(_v33.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4588,4702)").add(ESLVal.list(_v33)));
      }
    }
  });
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v34 = l;
        
        if(_v34.isCons())
        {ESLVal $60 = _v34.head();
          ESLVal $61 = _v34.tail();
          
          {ESLVal h = $60;
          
          {ESLVal t = $61;
          
          if(p.apply(h).boolVal)
          return reject.apply(p,t);
          else
            {ESLVal _v62 = $60;
              
              {ESLVal _v63 = $61;
              
              return reject.apply(p,_v63).cons(_v62);
            }
            }
        }
        }
        }
      else if(_v34.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4746,4860)").add(ESLVal.list(_v34)));
      }
    }
  });
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v35 = l;
        
        if(_v35.isCons())
        {ESLVal $62 = _v35.head();
          ESLVal $63 = _v35.tail();
          
          if($63.isCons())
          {ESLVal $64 = $63.head();
            ESLVal $65 = $63.tail();
            
            {ESLVal h = $62;
            
            {ESLVal _v60 = $63;
            
            return last.apply(_v60);
          }
          }
          }
        else if($63.isNil())
          {ESLVal x = $62;
            
            return x;
          }
        else {ESLVal h = $62;
            
            {ESLVal _v61 = $63;
            
            return last.apply(_v61);
          }
          }
        }
      else if(_v35.isNil())
        return error(new ESLVal("cannot find last element of emply list"));
      else return error(new ESLVal("case error at Pos(4987,5117)").add(ESLVal.list(_v35)));
      }
    }
  });
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v36 = l;
        
        if(_v36.isCons())
        {ESLVal $66 = _v36.head();
          ESLVal $67 = _v36.tail();
          
          if($67.isCons())
          {ESLVal $68 = $67.head();
            ESLVal $69 = $67.tail();
            
            {ESLVal h = $66;
            
            {ESLVal _v58 = $67;
            
            return butlast.apply(_v58).cons(h);
          }
          }
          }
        else if($67.isNil())
          {ESLVal x = $66;
            
            return $nil;
          }
        else {ESLVal h = $66;
            
            {ESLVal _v59 = $67;
            
            return butlast.apply(_v59).cons(h);
          }
          }
        }
      else if(_v36.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5260,5349)").add(ESLVal.list(_v36)));
      }
    }
  });
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v37 = l;
        
        if(_v37.isCons())
        {ESLVal $70 = _v37.head();
          ESLVal $71 = _v37.tail();
          
          {ESLVal h = $70;
          
          {ESLVal t = $71;
          
          if(h.eql(x).boolVal)
          return $one.add(occurrences.apply(x,t));
          else
            {ESLVal _v56 = $70;
              
              {ESLVal _v57 = $71;
              
              return occurrences.apply(x,_v57);
            }
            }
        }
        }
        }
      else if(_v37.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5388,5509)").add(ESLVal.list(_v37)));
      }
    }
  });
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v38 = l;
        
        if(_v38.isCons())
        {ESLVal $72 = _v38.head();
          ESLVal $73 = _v38.tail();
          
          {ESLVal h = $72;
          
          {ESLVal t = $73;
          
          if(pred.apply(h).boolVal)
          return filter.apply(pred,t).cons(h);
          else
            return filter.apply(pred,t);
        }
        }
        }
      else if(_v38.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5557,5688)").add(ESLVal.list(_v38)));
      }
    }
  });
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v52 = $args[0];
  ESLVal _v53 = $args[1];
  ESLVal _v54 = $args[2];
  ESLVal _v55 = $args[3];
  {ESLVal _v39 = _v55;
        
        if(_v39.isCons())
        {ESLVal $74 = _v39.head();
          ESLVal $75 = _v39.tail();
          
          {ESLVal h = $74;
          
          {ESLVal t = $75;
          
          return _v53.apply(_v52.apply(h),foldr.apply(_v52,_v53,_v54,t));
        }
        }
        }
      else if(_v39.isNil())
        return _v54;
      else return error(new ESLVal("case error at Pos(5755,5845)").add(ESLVal.list(_v39)));
      }
    }
  });
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun84"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  return foldr.apply(id,new ESLVal(new Function(new ESLVal("fun85"),getSelf()) {
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
  {ESLVal _v40 = list;
        
        if(_v40.isCons())
        {ESLVal $76 = _v40.head();
          ESLVal $77 = _v40.tail();
          
          {ESLVal x = $76;
          
          {ESLVal l = $77;
          
          return removeDups.apply(remove.apply(x,l)).cons(x);
        }
        }
        }
      else if(_v40.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(6005,6086)").add(ESLVal.list(_v40)));
      }
    }
  });
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  { LetRec letrec = new LetRec() {
        ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v50 = $args[0];
          ESLVal _v51 = $args[1];
          {print.apply(_v51);
              if(_v51.eql(ESLVal.list()).boolVal)
                return _v50;
                else
                  return pre.apply(_v50.add(ESLVal.list(last.apply(_v50).add(ESLVal.list(head.apply(_v51))))),tail.apply(_v51));}
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
      
        return pre.apply(ESLVal.list(ESLVal.list()),l);}
      
    }
  });
  public static ESLVal takeWhile = new ESLVal(new Function(new ESLVal("takeWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v41 = l;
        
        if(_v41.isCons())
        {ESLVal $78 = _v41.head();
          ESLVal $79 = _v41.tail();
          
          {ESLVal t = $78;
          
          {ESLVal _v47 = $79;
          
          if(p.apply(t).boolVal)
          return takeWhile.apply(p,_v47).cons(t);
          else
            {ESLVal _v48 = $78;
              
              {ESLVal _v49 = $79;
              
              return $nil;
            }
            }
        }
        }
        }
      else if(_v41.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6368,6476)").add(ESLVal.list(_v41)));
      }
    }
  });
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v42 = l;
        
        if(_v42.isCons())
        {ESLVal $80 = _v42.head();
          ESLVal $81 = _v42.tail();
          
          {ESLVal t = $80;
          
          {ESLVal _v44 = $81;
          
          if(p.apply(t).boolVal)
          return dropWhile.apply(p,_v44);
          else
            {ESLVal _v45 = _v42;
              
              return _v45;
            }
        }
        }
        }
      else if(_v42.isNil())
        return $nil;
      else {ESLVal _v46 = _v42;
          
          return _v46;
        }
      }
    }
  });
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal removables = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v43 = removables;
        
        if(_v43.isCons())
        {ESLVal $82 = _v43.head();
          ESLVal $83 = _v43.tail();
          
          {ESLVal t = $82;
          
          {ESLVal r = $83;
          
          return removeAll.apply(r,remove.apply(t,l));
        }
        }
        }
      else if(_v43.isNil())
        return l;
      else return error(new ESLVal("case error at Pos(6669,6757)").add(ESLVal.list(_v43)));
      }
    }
  });
public static void main(String[] args) {
  }
}