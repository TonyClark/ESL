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
  {ESLVal _v110 = l;
        
        if(_v110.isCons())
        {ESLVal $108 = _v110.head();
          ESLVal $109 = _v110.tail();
          
          {ESLVal h = $108;
          
          {ESLVal t = $109;
          
          if(p.apply(h).boolVal)
          return h;
          else
            {ESLVal _v152 = $108;
              
              {ESLVal _v153 = $109;
              
              return select1.apply(_v153,d,p);
            }
            }
        }
        }
        }
      else if(_v110.isNil())
        return d;
      else return error(new ESLVal("case error at Pos(515,613)").add(ESLVal.list(_v110)));
      }
    }
  });
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v109 = l;
        
        if(_v109.isCons())
        {ESLVal $106 = _v109.head();
          ESLVal $107 = _v109.tail();
          
          {ESLVal m = $106;
          
          {ESLVal ms = $107;
          
          return map.apply(f,ms).cons(f.apply(m));
        }
        }
        }
      else if(_v109.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(651,719)").add(ESLVal.list(_v109)));
      }
    }
  });
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v108 = l;
        
        if(_v108.isCons())
        {ESLVal $104 = _v108.head();
          ESLVal $105 = _v108.tail();
          
          {ESLVal h = $104;
          
          {ESLVal t = $105;
          
          if(h.eql(v).boolVal)
          return remove.apply(v,t);
          else
            {ESLVal _v150 = $104;
              
              {ESLVal _v151 = $105;
              
              return remove.apply(v,_v151).cons(_v150);
            }
            }
        }
        }
        }
      else if(_v108.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(868,979)").add(ESLVal.list(_v108)));
      }
    }
  });
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v107 = l;
        
        if(_v107.isCons())
        {ESLVal $102 = _v107.head();
          ESLVal $103 = _v107.tail();
          
          {ESLVal h = $102;
          
          {ESLVal t = $103;
          
          if(h.eql(v).boolVal)
          return t;
          else
            {ESLVal _v148 = $102;
              
              {ESLVal _v149 = $103;
              
              return remove1.apply(v,_v149).cons(_v148);
            }
            }
        }
        }
        }
      else if(_v107.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1014,1113)").add(ESLVal.list(_v107)));
      }
    }
  });
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v106 = l;
        
        if(_v106.isCons())
        {ESLVal $100 = _v106.head();
          ESLVal $101 = _v106.tail();
          
          {ESLVal h = $100;
          
          {ESLVal t = $101;
          
          return $one.add(length.apply(t));
        }
        }
        }
      else if(_v106.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1252,1306)").add(ESLVal.list(_v106)));
      }
    }
  });
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal lists = $args[0];
  {ESLVal _v105 = lists;
        
        if(_v105.isCons())
        {ESLVal $98 = _v105.head();
          ESLVal $99 = _v105.tail();
          
          {ESLVal h = $98;
          
          {ESLVal t = $99;
          
          return h.add(flatten.apply(t));
        }
        }
        }
      else if(_v105.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1786,1852)").add(ESLVal.list(_v105)));
      }
    }
  });
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v104 = l;
        
        if(_v104.isCons())
        {ESLVal $96 = _v104.head();
          ESLVal $97 = _v104.tail();
          
          {ESLVal h = $96;
          
          {ESLVal t = $97;
          
          if(h.eql(x).boolVal)
          return $one.add(count.apply(x,t));
          else
            return count.apply(x,t);
        }
        }
        }
      else if(_v104.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1893,1981)").add(ESLVal.list(_v104)));
      }
    }
  });
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  ESLVal prefix = $args[1];
  {ESLVal _v103 = list;
        ESLVal _v102 = prefix;
        
        if(_v103.isCons())
        {ESLVal $92 = _v103.head();
          ESLVal $93 = _v103.tail();
          
          if(_v102.isCons())
          {ESLVal $94 = _v102.head();
            ESLVal $95 = _v102.tail();
            
            {ESLVal x = $92;
            
            {ESLVal _v146 = $93;
            
            {ESLVal y = $94;
            
            {ESLVal _v147 = $95;
            
            if(x.eql(y).boolVal)
            return hasPrefix.apply(_v146,_v147);
            else
              if(_v102.isCons())
                {ESLVal $90 = _v102.head();
                  ESLVal $91 = _v102.tail();
                  
                  {ESLVal l1 = _v103;
                  
                  {ESLVal l2 = _v102;
                  
                  return $false;
                }
                }
                }
              else if(_v102.isNil())
                {ESLVal l1 = _v103;
                  
                  return $true;
                }
              else {ESLVal l1 = _v103;
                  
                  {ESLVal l2 = _v102;
                  
                  return $false;
                }
                }
          }
          }
          }
          }
          }
        else if(_v102.isNil())
          if(_v102.isCons())
            {ESLVal $90 = _v102.head();
              ESLVal $91 = _v102.tail();
              
              {ESLVal l1 = _v103;
              
              {ESLVal l2 = _v102;
              
              return $false;
            }
            }
            }
          else if(_v102.isNil())
            {ESLVal l1 = _v103;
              
              return $true;
            }
          else {ESLVal l1 = _v103;
              
              {ESLVal l2 = _v102;
              
              return $false;
            }
            }
        else if(_v102.isCons())
            {ESLVal $90 = _v102.head();
              ESLVal $91 = _v102.tail();
              
              {ESLVal l1 = _v103;
              
              {ESLVal l2 = _v102;
              
              return $false;
            }
            }
            }
          else if(_v102.isNil())
            {ESLVal l1 = _v103;
              
              return $true;
            }
          else {ESLVal l1 = _v103;
              
              {ESLVal l2 = _v102;
              
              return $false;
            }
            }
        }
      else if(_v103.isNil())
        if(_v102.isCons())
          {ESLVal $90 = _v102.head();
            ESLVal $91 = _v102.tail();
            
            {ESLVal l1 = _v103;
            
            {ESLVal l2 = _v102;
            
            return $false;
          }
          }
          }
        else if(_v102.isNil())
          {ESLVal l1 = _v103;
            
            return $true;
          }
        else {ESLVal l1 = _v103;
            
            {ESLVal l2 = _v102;
            
            return $false;
          }
          }
      else if(_v102.isCons())
          {ESLVal $90 = _v102.head();
            ESLVal $91 = _v102.tail();
            
            {ESLVal l1 = _v103;
            
            {ESLVal l2 = _v102;
            
            return $false;
          }
          }
          }
        else if(_v102.isNil())
          {ESLVal l1 = _v103;
            
            return $true;
          }
        else {ESLVal l1 = _v103;
            
            {ESLVal l2 = _v102;
            
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
  {ESLVal _v101 = l;
        
        if(_v101.isCons())
        {ESLVal $88 = _v101.head();
          ESLVal $89 = _v101.tail();
          
          {ESLVal h = $88;
          
          {ESLVal t = $89;
          
          if(n.eql($zero).boolVal)
          return h;
          else
            return nth.apply(t,n.sub($one));
        }
        }
        }
      else if(_v101.isNil())
        return error(new ESLVal("cannot take nth element."));
      else return error(new ESLVal("case error at Pos(2295,2410)").add(ESLVal.list(_v101)));
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
          {ESLVal _v100 = l;
            
            if(_v100.isCons())
            {ESLVal $86 = _v100.head();
              ESLVal $87 = _v100.tail();
              
              {ESLVal h = $86;
              
              {ESLVal t = $87;
              
              return take.apply(t,n.sub($one)).cons(h);
            }
            }
            }
          else if(_v100.isNil())
            return error(new ESLVal("cannot take element ").add(n));
          else return error(new ESLVal("case error at Pos(2482,2584)").add(ESLVal.list(_v100)));
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
          {ESLVal _v99 = l;
            
            if(_v99.isCons())
            {ESLVal $84 = _v99.head();
              ESLVal $85 = _v99.tail();
              
              {ESLVal h = $84;
              
              {ESLVal t = $85;
              
              return drop.apply(t,n.sub($one));
            }
            }
            }
          else if(_v99.isNil())
            return error(new ESLVal("cannot drop element ").add(n));
          else return error(new ESLVal("case error at Pos(2652,2747)").add(ESLVal.list(_v99)));
          }
    }
  });
  public static ESLVal subst = new ESLVal(new Function(new ESLVal("subst"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal o = $args[1];
  ESLVal l = $args[2];
  {ESLVal _v98 = l;
        
        if(_v98.isCons())
        {ESLVal $82 = _v98.head();
          ESLVal $83 = _v98.tail();
          
          {ESLVal h = $82;
          
          {ESLVal t = $83;
          
          if(h.eql(o).boolVal)
          return subst.apply(n,o,t).cons(n);
          else
            return subst.apply(n,o,t).cons(h);
        }
        }
        }
      else if(_v98.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(2789,2893)").add(ESLVal.list(_v98)));
      }
    }
  });
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun72"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v97 = l;
        
        if(_v97.isCons())
        {ESLVal $80 = _v97.head();
          ESLVal $81 = _v97.tail();
          
          {ESLVal h = $80;
          
          {ESLVal t = $81;
          
          return h;
        }
        }
        }
      else if(_v97.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(2966,3045)").add(ESLVal.list(_v97)));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun73"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v96 = l;
        
        if(_v96.isCons())
        {ESLVal $78 = _v96.head();
          ESLVal $79 = _v96.tail();
          
          {ESLVal h = $78;
          
          {ESLVal t = $79;
          
          return t;
        }
        }
        }
      else if(_v96.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3122,3203)").add(ESLVal.list(_v96)));
      }
    }
  });
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v95 = l;
        
        if(_v95.isCons())
        {ESLVal $76 = _v95.head();
          ESLVal $77 = _v95.tail();
          
          {ESLVal _v144 = _v95;
          
          return $false;
        }
        }
      else if(_v95.isNil())
        return $true;
      else {ESLVal _v145 = _v95;
          
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
  {ESLVal _v94 = l;
        
        if(_v94.isCons())
        {ESLVal $74 = _v94.head();
          ESLVal $75 = _v94.tail();
          
          {ESLVal x = $74;
          
          {ESLVal xs = $75;
          
          if(x.eql(e).boolVal)
          return $true;
          else
            {ESLVal _v142 = $74;
              
              {ESLVal _v143 = $75;
              
              return member.apply(e,_v143);
            }
            }
        }
        }
        }
      else if(_v94.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3439,3544)").add(ESLVal.list(_v94)));
      }
    }
  });
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v93 = l;
        
        if(_v93.isCons())
        {ESLVal $72 = _v93.head();
          ESLVal $73 = _v93.tail();
          
          {ESLVal x = $72;
          
          {ESLVal xs = $73;
          
          return reverse.apply(xs).add(ESLVal.list(x));
        }
        }
        }
      else if(_v93.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3576,3650)").add(ESLVal.list(_v93)));
      }
    }
  });
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun74"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v92 = l;
        
        if(_v92.isCons())
        {ESLVal $70 = _v92.head();
          ESLVal $71 = _v92.tail();
          
          {ESLVal x = $70;
          
          {ESLVal xs = $71;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v140 = $70;
              
              {ESLVal _v141 = $71;
              
              return exists.apply(pred,_v141);
            }
            }
        }
        }
        }
      else if(_v92.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3758,3869)").add(ESLVal.list(_v92)));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun75"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v91 = l;
        
        if(_v91.isCons())
        {ESLVal $68 = _v91.head();
          ESLVal $69 = _v91.tail();
          
          {ESLVal x = $68;
          
          {ESLVal xs = $69;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v138 = $68;
              
              {ESLVal _v139 = $69;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v91.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(3976,4087)").add(ESLVal.list(_v91)));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal x = $args[2];
  {ESLVal _v90 = l;
        
        if(_v90.isCons())
        {ESLVal $66 = _v90.head();
          ESLVal $67 = _v90.tail();
          
          {ESLVal h = $66;
          
          {ESLVal t = $67;
          
          if(n.eql($zero).boolVal)
          return t.cons(x);
          else
            {ESLVal _v136 = $66;
              
              {ESLVal _v137 = $67;
              
              return replaceNth.apply(_v137,n.sub($one),x).cons(_v136);
            }
            }
        }
        }
        }
      else if(_v90.isNil())
        return error(new ESLVal("cannot replace nth of []"));
      else return error(new ESLVal("case error at Pos(4265,4408)").add(ESLVal.list(_v90)));
      }
    }
  });
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v89 = l;
        
        if(_v89.isCons())
        {ESLVal $64 = _v89.head();
          ESLVal $65 = _v89.tail();
          
          {ESLVal h = $64;
          
          {ESLVal _v133 = $65;
          
          if(h.eql(t).boolVal)
          return $zero;
          else
            {ESLVal _v134 = $64;
              
              {ESLVal _v135 = $65;
              
              return $one.add(indexOf.apply(t,_v135));
            }
            }
        }
        }
        }
      else if(_v89.isNil())
        return $zero.sub($one);
      else return error(new ESLVal("case error at Pos(4443,4544)").add(ESLVal.list(_v89)));
      }
    }
  });
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v88 = l;
        
        if(_v88.isCons())
        {ESLVal $62 = _v88.head();
          ESLVal $63 = _v88.tail();
          
          {ESLVal h = $62;
          
          {ESLVal t = $63;
          
          if(p.apply(h).boolVal)
          return select.apply(p,t).cons(h);
          else
            {ESLVal _v131 = $62;
              
              {ESLVal _v132 = $63;
              
              return select.apply(p,_v132);
            }
            }
        }
        }
        }
      else if(_v88.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4588,4702)").add(ESLVal.list(_v88)));
      }
    }
  });
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v87 = l;
        
        if(_v87.isCons())
        {ESLVal $60 = _v87.head();
          ESLVal $61 = _v87.tail();
          
          {ESLVal h = $60;
          
          {ESLVal t = $61;
          
          if(p.apply(h).boolVal)
          return reject.apply(p,t);
          else
            {ESLVal _v129 = $60;
              
              {ESLVal _v130 = $61;
              
              return reject.apply(p,_v130).cons(_v129);
            }
            }
        }
        }
        }
      else if(_v87.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4746,4860)").add(ESLVal.list(_v87)));
      }
    }
  });
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v86 = l;
        
        if(_v86.isCons())
        {ESLVal $56 = _v86.head();
          ESLVal $57 = _v86.tail();
          
          if($57.isCons())
          {ESLVal $58 = $57.head();
            ESLVal $59 = $57.tail();
            
            {ESLVal h = $56;
            
            {ESLVal _v127 = $57;
            
            return last.apply(_v127);
          }
          }
          }
        else if($57.isNil())
          {ESLVal x = $56;
            
            return x;
          }
        else {ESLVal h = $56;
            
            {ESLVal _v128 = $57;
            
            return last.apply(_v128);
          }
          }
        }
      else if(_v86.isNil())
        return error(new ESLVal("cannot find last element of emply list"));
      else return error(new ESLVal("case error at Pos(4987,5117)").add(ESLVal.list(_v86)));
      }
    }
  });
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v85 = l;
        
        if(_v85.isCons())
        {ESLVal $52 = _v85.head();
          ESLVal $53 = _v85.tail();
          
          if($53.isCons())
          {ESLVal $54 = $53.head();
            ESLVal $55 = $53.tail();
            
            {ESLVal h = $52;
            
            {ESLVal _v125 = $53;
            
            return butlast.apply(_v125).cons(h);
          }
          }
          }
        else if($53.isNil())
          {ESLVal x = $52;
            
            return $nil;
          }
        else {ESLVal h = $52;
            
            {ESLVal _v126 = $53;
            
            return butlast.apply(_v126).cons(h);
          }
          }
        }
      else if(_v85.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5260,5349)").add(ESLVal.list(_v85)));
      }
    }
  });
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v84 = l;
        
        if(_v84.isCons())
        {ESLVal $50 = _v84.head();
          ESLVal $51 = _v84.tail();
          
          {ESLVal h = $50;
          
          {ESLVal t = $51;
          
          if(h.eql(x).boolVal)
          return $one.add(occurrences.apply(x,t));
          else
            {ESLVal _v123 = $50;
              
              {ESLVal _v124 = $51;
              
              return occurrences.apply(x,_v124);
            }
            }
        }
        }
        }
      else if(_v84.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5388,5509)").add(ESLVal.list(_v84)));
      }
    }
  });
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v83 = l;
        
        if(_v83.isCons())
        {ESLVal $48 = _v83.head();
          ESLVal $49 = _v83.tail();
          
          {ESLVal h = $48;
          
          {ESLVal t = $49;
          
          if(pred.apply(h).boolVal)
          return filter.apply(pred,t).cons(h);
          else
            return filter.apply(pred,t);
        }
        }
        }
      else if(_v83.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5557,5688)").add(ESLVal.list(_v83)));
      }
    }
  });
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v122 = $args[0];
  ESLVal _v121 = $args[1];
  ESLVal _v120 = $args[2];
  ESLVal _v119 = $args[3];
  {ESLVal _v82 = _v119;
        
        if(_v82.isCons())
        {ESLVal $46 = _v82.head();
          ESLVal $47 = _v82.tail();
          
          {ESLVal h = $46;
          
          {ESLVal t = $47;
          
          return _v121.apply(_v122.apply(h),foldr.apply(_v122,_v121,_v120,t));
        }
        }
        }
      else if(_v82.isNil())
        return _v120;
      else return error(new ESLVal("case error at Pos(5755,5845)").add(ESLVal.list(_v82)));
      }
    }
  });
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun76"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  return foldr.apply(id,new ESLVal(new Function(new ESLVal("fun77"),getSelf()) {
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
  {ESLVal _v81 = list;
        
        if(_v81.isCons())
        {ESLVal $44 = _v81.head();
          ESLVal $45 = _v81.tail();
          
          {ESLVal x = $44;
          
          {ESLVal l = $45;
          
          return removeDups.apply(remove.apply(x,l)).cons(x);
        }
        }
        }
      else if(_v81.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(6005,6086)").add(ESLVal.list(_v81)));
      }
    }
  });
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  { LetRec letrec = new LetRec() {
        ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v118 = $args[0];
          ESLVal _v117 = $args[1];
          {print.apply(_v117);
              if(_v117.eql(ESLVal.list()).boolVal)
                return _v118;
                else
                  return pre.apply(_v118.add(ESLVal.list(last.apply(_v118).add(ESLVal.list(head.apply(_v117))))),tail.apply(_v117));}
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
  {ESLVal _v80 = l;
        
        if(_v80.isCons())
        {ESLVal $42 = _v80.head();
          ESLVal $43 = _v80.tail();
          
          {ESLVal t = $42;
          
          {ESLVal _v114 = $43;
          
          if(p.apply(t).boolVal)
          return takeWhile.apply(p,_v114).cons(t);
          else
            {ESLVal _v115 = $42;
              
              {ESLVal _v116 = $43;
              
              return $nil;
            }
            }
        }
        }
        }
      else if(_v80.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6368,6476)").add(ESLVal.list(_v80)));
      }
    }
  });
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v79 = l;
        
        if(_v79.isCons())
        {ESLVal $40 = _v79.head();
          ESLVal $41 = _v79.tail();
          
          {ESLVal t = $40;
          
          {ESLVal _v111 = $41;
          
          if(p.apply(t).boolVal)
          return dropWhile.apply(p,_v111);
          else
            {ESLVal _v112 = _v79;
              
              return _v112;
            }
        }
        }
        }
      else if(_v79.isNil())
        return $nil;
      else {ESLVal _v113 = _v79;
          
          return _v113;
        }
      }
    }
  });
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal removables = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v78 = removables;
        
        if(_v78.isCons())
        {ESLVal $38 = _v78.head();
          ESLVal $39 = _v78.tail();
          
          {ESLVal t = $38;
          
          {ESLVal r = $39;
          
          return removeAll.apply(r,remove.apply(t,l));
        }
        }
        }
      else if(_v78.isNil())
        return l;
      else return error(new ESLVal("case error at Pos(6669,6757)").add(ESLVal.list(_v78)));
      }
    }
  });
public static void main(String[] args) {
  }
}