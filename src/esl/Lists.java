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
  {ESLVal _v147 = l;
        
        if(_v147.isCons())
        {ESLVal $530 = _v147.head();
          ESLVal $531 = _v147.tail();
          
          {ESLVal h = $530;
          
          {ESLVal t = $531;
          
          if(p.apply(h).boolVal)
          return h;
          else
            {ESLVal _v189 = $530;
              
              {ESLVal _v190 = $531;
              
              return select1.apply(_v190,d,p);
            }
            }
        }
        }
        }
      else if(_v147.isNil())
        return d;
      else return error(new ESLVal("case error at Pos(515,613)").add(ESLVal.list(_v147)));
      }
    }
  });
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v146 = l;
        
        if(_v146.isCons())
        {ESLVal $528 = _v146.head();
          ESLVal $529 = _v146.tail();
          
          {ESLVal m = $528;
          
          {ESLVal ms = $529;
          
          return map.apply(f,ms).cons(f.apply(m));
        }
        }
        }
      else if(_v146.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(651,742)").add(ESLVal.list(_v146)));
      }
    }
  });
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v145 = l;
        
        if(_v145.isCons())
        {ESLVal $526 = _v145.head();
          ESLVal $527 = _v145.tail();
          
          {ESLVal h = $526;
          
          {ESLVal t = $527;
          
          if(h.eql(v).boolVal)
          return remove.apply(v,t);
          else
            {ESLVal _v187 = $526;
              
              {ESLVal _v188 = $527;
              
              return remove.apply(v,_v188).cons(_v187);
            }
            }
        }
        }
        }
      else if(_v145.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(891,1024)").add(ESLVal.list(_v145)));
      }
    }
  });
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v144 = l;
        
        if(_v144.isCons())
        {ESLVal $524 = _v144.head();
          ESLVal $525 = _v144.tail();
          
          {ESLVal h = $524;
          
          {ESLVal t = $525;
          
          if(h.eql(v).boolVal)
          return t;
          else
            {ESLVal _v185 = $524;
              
              {ESLVal _v186 = $525;
              
              return remove1.apply(v,_v186).cons(_v185);
            }
            }
        }
        }
        }
      else if(_v144.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1059,1180)").add(ESLVal.list(_v144)));
      }
    }
  });
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v143 = l;
        
        if(_v143.isCons())
        {ESLVal $522 = _v143.head();
          ESLVal $523 = _v143.tail();
          
          {ESLVal h = $522;
          
          {ESLVal t = $523;
          
          return $one.add(length.apply(t));
        }
        }
        }
      else if(_v143.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1319,1395)").add(ESLVal.list(_v143)));
      }
    }
  });
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal lists = $args[0];
  {ESLVal _v142 = lists;
        
        if(_v142.isCons())
        {ESLVal $520 = _v142.head();
          ESLVal $521 = _v142.tail();
          
          {ESLVal h = $520;
          
          {ESLVal t = $521;
          
          return h.add(flatten.apply(t));
        }
        }
        }
      else if(_v142.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1875,1967)").add(ESLVal.list(_v142)));
      }
    }
  });
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v141 = l;
        
        if(_v141.isCons())
        {ESLVal $518 = _v141.head();
          ESLVal $519 = _v141.tail();
          
          {ESLVal h = $518;
          
          {ESLVal t = $519;
          
          if(h.eql(x).boolVal)
          return $one.add(count.apply(x,t));
          else
            return count.apply(x,t);
        }
        }
        }
      else if(_v141.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(2008,2118)").add(ESLVal.list(_v141)));
      }
    }
  });
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  ESLVal prefix = $args[1];
  {ESLVal _v140 = list;
        ESLVal _v139 = prefix;
        
        if(_v140.isCons())
        {ESLVal $514 = _v140.head();
          ESLVal $515 = _v140.tail();
          
          if(_v139.isCons())
          {ESLVal $516 = _v139.head();
            ESLVal $517 = _v139.tail();
            
            {ESLVal x = $514;
            
            {ESLVal _v183 = $515;
            
            {ESLVal y = $516;
            
            {ESLVal _v184 = $517;
            
            if(x.eql(y).boolVal)
            return hasPrefix.apply(_v183,_v184);
            else
              if(_v139.isCons())
                {ESLVal $512 = _v139.head();
                  ESLVal $513 = _v139.tail();
                  
                  {ESLVal l1 = _v140;
                  
                  {ESLVal l2 = _v139;
                  
                  return $false;
                }
                }
                }
              else if(_v139.isNil())
                {ESLVal l1 = _v140;
                  
                  return $true;
                }
              else {ESLVal l1 = _v140;
                  
                  {ESLVal l2 = _v139;
                  
                  return $false;
                }
                }
          }
          }
          }
          }
          }
        else if(_v139.isNil())
          if(_v139.isCons())
            {ESLVal $512 = _v139.head();
              ESLVal $513 = _v139.tail();
              
              {ESLVal l1 = _v140;
              
              {ESLVal l2 = _v139;
              
              return $false;
            }
            }
            }
          else if(_v139.isNil())
            {ESLVal l1 = _v140;
              
              return $true;
            }
          else {ESLVal l1 = _v140;
              
              {ESLVal l2 = _v139;
              
              return $false;
            }
            }
        else if(_v139.isCons())
            {ESLVal $512 = _v139.head();
              ESLVal $513 = _v139.tail();
              
              {ESLVal l1 = _v140;
              
              {ESLVal l2 = _v139;
              
              return $false;
            }
            }
            }
          else if(_v139.isNil())
            {ESLVal l1 = _v140;
              
              return $true;
            }
          else {ESLVal l1 = _v140;
              
              {ESLVal l2 = _v139;
              
              return $false;
            }
            }
        }
      else if(_v140.isNil())
        if(_v139.isCons())
          {ESLVal $512 = _v139.head();
            ESLVal $513 = _v139.tail();
            
            {ESLVal l1 = _v140;
            
            {ESLVal l2 = _v139;
            
            return $false;
          }
          }
          }
        else if(_v139.isNil())
          {ESLVal l1 = _v140;
            
            return $true;
          }
        else {ESLVal l1 = _v140;
            
            {ESLVal l2 = _v139;
            
            return $false;
          }
          }
      else if(_v139.isCons())
          {ESLVal $512 = _v139.head();
            ESLVal $513 = _v139.tail();
            
            {ESLVal l1 = _v140;
            
            {ESLVal l2 = _v139;
            
            return $false;
          }
          }
          }
        else if(_v139.isNil())
          {ESLVal l1 = _v140;
            
            return $true;
          }
        else {ESLVal l1 = _v140;
            
            {ESLVal l2 = _v139;
            
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
  {ESLVal _v138 = l;
        
        if(_v138.isCons())
        {ESLVal $510 = _v138.head();
          ESLVal $511 = _v138.tail();
          
          {ESLVal h = $510;
          
          {ESLVal t = $511;
          
          if(n.eql($zero).boolVal)
          return h;
          else
            return nth.apply(t,n.sub($one));
        }
        }
        }
      else if(_v138.isNil())
        return error(new ESLVal("cannot take nth element."));
      else return error(new ESLVal("case error at Pos(2478,2615)").add(ESLVal.list(_v138)));
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
          {ESLVal _v137 = l;
            
            if(_v137.isCons())
            {ESLVal $508 = _v137.head();
              ESLVal $509 = _v137.tail();
              
              {ESLVal h = $508;
              
              {ESLVal t = $509;
              
              return take.apply(t,n.sub($one)).cons(h);
            }
            }
            }
          else if(_v137.isNil())
            return error(new ESLVal("cannot take element ").add(n));
          else return error(new ESLVal("case error at Pos(2687,2815)").add(ESLVal.list(_v137)));
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
          {ESLVal _v136 = l;
            
            if(_v136.isCons())
            {ESLVal $506 = _v136.head();
              ESLVal $507 = _v136.tail();
              
              {ESLVal h = $506;
              
              {ESLVal t = $507;
              
              return drop.apply(t,n.sub($one));
            }
            }
            }
          else if(_v136.isNil())
            return error(new ESLVal("cannot drop element ").add(n));
          else return error(new ESLVal("case error at Pos(2883,3004)").add(ESLVal.list(_v136)));
          }
    }
  });
  public static ESLVal subst = new ESLVal(new Function(new ESLVal("subst"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal o = $args[1];
  ESLVal l = $args[2];
  {ESLVal _v135 = l;
        
        if(_v135.isCons())
        {ESLVal $504 = _v135.head();
          ESLVal $505 = _v135.tail();
          
          {ESLVal h = $504;
          
          {ESLVal t = $505;
          
          if(h.eql(o).boolVal)
          return subst.apply(n,o,t).cons(n);
          else
            return subst.apply(n,o,t).cons(h);
        }
        }
        }
      else if(_v135.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3046,3172)").add(ESLVal.list(_v135)));
      }
    }
  });
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun776"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v134 = l;
        
        if(_v134.isCons())
        {ESLVal $502 = _v134.head();
          ESLVal $503 = _v134.tail();
          
          {ESLVal h = $502;
          
          {ESLVal t = $503;
          
          return h;
        }
        }
        }
      else if(_v134.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(3245,3346)").add(ESLVal.list(_v134)));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun777"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v133 = l;
        
        if(_v133.isCons())
        {ESLVal $500 = _v133.head();
          ESLVal $501 = _v133.tail();
          
          {ESLVal h = $500;
          
          {ESLVal t = $501;
          
          return t;
        }
        }
        }
      else if(_v133.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3423,3526)").add(ESLVal.list(_v133)));
      }
    }
  });
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v132 = l;
        
        if(_v132.isCons())
        {ESLVal $498 = _v132.head();
          ESLVal $499 = _v132.tail();
          
          {ESLVal _v181 = _v132;
          
          return $false;
        }
        }
      else if(_v132.isNil())
        return $true;
      else {ESLVal _v182 = _v132;
          
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
  {ESLVal _v131 = l;
        
        if(_v131.isCons())
        {ESLVal $496 = _v131.head();
          ESLVal $497 = _v131.tail();
          
          {ESLVal x = $496;
          
          {ESLVal xs = $497;
          
          if(x.eql(e).boolVal)
          return $true;
          else
            {ESLVal _v179 = $496;
              
              {ESLVal _v180 = $497;
              
              return member.apply(e,_v180);
            }
            }
        }
        }
        }
      else if(_v131.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3762,3867)").add(ESLVal.list(_v131)));
      }
    }
  });
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v130 = l;
        
        if(_v130.isCons())
        {ESLVal $494 = _v130.head();
          ESLVal $495 = _v130.tail();
          
          {ESLVal x = $494;
          
          {ESLVal xs = $495;
          
          return reverse.apply(xs).add(ESLVal.list(x));
        }
        }
        }
      else if(_v130.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3899,3973)").add(ESLVal.list(_v130)));
      }
    }
  });
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun778"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v129 = l;
        
        if(_v129.isCons())
        {ESLVal $492 = _v129.head();
          ESLVal $493 = _v129.tail();
          
          {ESLVal x = $492;
          
          {ESLVal xs = $493;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v177 = $492;
              
              {ESLVal _v178 = $493;
              
              return exists.apply(pred,_v178);
            }
            }
        }
        }
        }
      else if(_v129.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(4081,4192)").add(ESLVal.list(_v129)));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun779"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v128 = l;
        
        if(_v128.isCons())
        {ESLVal $490 = _v128.head();
          ESLVal $491 = _v128.tail();
          
          {ESLVal x = $490;
          
          {ESLVal xs = $491;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v175 = $490;
              
              {ESLVal _v176 = $491;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v128.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(4299,4410)").add(ESLVal.list(_v128)));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal x = $args[2];
  {ESLVal _v127 = l;
        
        if(_v127.isCons())
        {ESLVal $488 = _v127.head();
          ESLVal $489 = _v127.tail();
          
          {ESLVal h = $488;
          
          {ESLVal t = $489;
          
          if(n.eql($zero).boolVal)
          return t.cons(x);
          else
            {ESLVal _v173 = $488;
              
              {ESLVal _v174 = $489;
              
              return replaceNth.apply(_v174,n.sub($one),x).cons(_v173);
            }
            }
        }
        }
        }
      else if(_v127.isNil())
        return error(new ESLVal("cannot replace nth of []"));
      else return error(new ESLVal("case error at Pos(4588,4731)").add(ESLVal.list(_v127)));
      }
    }
  });
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v126 = l;
        
        if(_v126.isCons())
        {ESLVal $486 = _v126.head();
          ESLVal $487 = _v126.tail();
          
          {ESLVal h = $486;
          
          {ESLVal _v170 = $487;
          
          if(h.eql(t).boolVal)
          return $zero;
          else
            {ESLVal _v171 = $486;
              
              {ESLVal _v172 = $487;
              
              return $one.add(indexOf.apply(t,_v172));
            }
            }
        }
        }
        }
      else if(_v126.isNil())
        return $zero.sub($one);
      else return error(new ESLVal("case error at Pos(4766,4867)").add(ESLVal.list(_v126)));
      }
    }
  });
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v125 = l;
        
        if(_v125.isCons())
        {ESLVal $484 = _v125.head();
          ESLVal $485 = _v125.tail();
          
          {ESLVal h = $484;
          
          {ESLVal t = $485;
          
          if(p.apply(h).boolVal)
          return select.apply(p,t).cons(h);
          else
            {ESLVal _v168 = $484;
              
              {ESLVal _v169 = $485;
              
              return select.apply(p,_v169);
            }
            }
        }
        }
        }
      else if(_v125.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4911,5025)").add(ESLVal.list(_v125)));
      }
    }
  });
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v124 = l;
        
        if(_v124.isCons())
        {ESLVal $482 = _v124.head();
          ESLVal $483 = _v124.tail();
          
          {ESLVal h = $482;
          
          {ESLVal t = $483;
          
          if(p.apply(h).boolVal)
          return reject.apply(p,t);
          else
            {ESLVal _v166 = $482;
              
              {ESLVal _v167 = $483;
              
              return reject.apply(p,_v167).cons(_v166);
            }
            }
        }
        }
        }
      else if(_v124.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5069,5183)").add(ESLVal.list(_v124)));
      }
    }
  });
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v123 = l;
        
        if(_v123.isCons())
        {ESLVal $478 = _v123.head();
          ESLVal $479 = _v123.tail();
          
          if($479.isCons())
          {ESLVal $480 = $479.head();
            ESLVal $481 = $479.tail();
            
            {ESLVal h = $478;
            
            {ESLVal _v164 = $479;
            
            return last.apply(_v164);
          }
          }
          }
        else if($479.isNil())
          {ESLVal x = $478;
            
            return x;
          }
        else {ESLVal h = $478;
            
            {ESLVal _v165 = $479;
            
            return last.apply(_v165);
          }
          }
        }
      else if(_v123.isNil())
        return error(new ESLVal("cannot find last element of emply list"));
      else return error(new ESLVal("case error at Pos(5310,5440)").add(ESLVal.list(_v123)));
      }
    }
  });
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v122 = l;
        
        if(_v122.isCons())
        {ESLVal $474 = _v122.head();
          ESLVal $475 = _v122.tail();
          
          if($475.isCons())
          {ESLVal $476 = $475.head();
            ESLVal $477 = $475.tail();
            
            {ESLVal h = $474;
            
            {ESLVal _v162 = $475;
            
            return butlast.apply(_v162).cons(h);
          }
          }
          }
        else if($475.isNil())
          {ESLVal x = $474;
            
            return $nil;
          }
        else {ESLVal h = $474;
            
            {ESLVal _v163 = $475;
            
            return butlast.apply(_v163).cons(h);
          }
          }
        }
      else if(_v122.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5583,5672)").add(ESLVal.list(_v122)));
      }
    }
  });
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v121 = l;
        
        if(_v121.isCons())
        {ESLVal $472 = _v121.head();
          ESLVal $473 = _v121.tail();
          
          {ESLVal h = $472;
          
          {ESLVal t = $473;
          
          if(h.eql(x).boolVal)
          return $one.add(occurrences.apply(x,t));
          else
            {ESLVal _v160 = $472;
              
              {ESLVal _v161 = $473;
              
              return occurrences.apply(x,_v161);
            }
            }
        }
        }
        }
      else if(_v121.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5711,5832)").add(ESLVal.list(_v121)));
      }
    }
  });
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v120 = l;
        
        if(_v120.isCons())
        {ESLVal $470 = _v120.head();
          ESLVal $471 = _v120.tail();
          
          {ESLVal h = $470;
          
          {ESLVal t = $471;
          
          if(pred.apply(h).boolVal)
          return filter.apply(pred,t).cons(h);
          else
            return filter.apply(pred,t);
        }
        }
        }
      else if(_v120.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5880,6011)").add(ESLVal.list(_v120)));
      }
    }
  });
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v159 = $args[0];
  ESLVal _v158 = $args[1];
  ESLVal _v157 = $args[2];
  ESLVal _v156 = $args[3];
  {ESLVal _v119 = _v156;
        
        if(_v119.isCons())
        {ESLVal $468 = _v119.head();
          ESLVal $469 = _v119.tail();
          
          {ESLVal h = $468;
          
          {ESLVal t = $469;
          
          return _v158.apply(_v159.apply(h),foldr.apply(_v159,_v158,_v157,t));
        }
        }
        }
      else if(_v119.isNil())
        return _v157;
      else return error(new ESLVal("case error at Pos(6078,6168)").add(ESLVal.list(_v119)));
      }
    }
  });
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun780"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  return foldr.apply(id,new ESLVal(new Function(new ESLVal("fun781"),getSelf()) {
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
  {ESLVal _v118 = list;
        
        if(_v118.isCons())
        {ESLVal $466 = _v118.head();
          ESLVal $467 = _v118.tail();
          
          {ESLVal x = $466;
          
          {ESLVal l = $467;
          
          return removeDups.apply(remove.apply(x,l)).cons(x);
        }
        }
        }
      else if(_v118.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(6328,6409)").add(ESLVal.list(_v118)));
      }
    }
  });
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v155 = $args[0];
          ESLVal _v154 = $args[1];
          {print.apply(_v154);
              if(_v154.eql(ESLVal.list()).boolVal)
                return _v155;
                else
                  return pre.apply(_v155.add(ESLVal.list(last.apply(_v155).add(ESLVal.list(head.apply(_v154))))),tail.apply(_v154));}
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
  {ESLVal _v117 = l;
        
        if(_v117.isCons())
        {ESLVal $464 = _v117.head();
          ESLVal $465 = _v117.tail();
          
          {ESLVal t = $464;
          
          {ESLVal _v151 = $465;
          
          if(p.apply(t).boolVal)
          return takeWhile.apply(p,_v151).cons(t);
          else
            {ESLVal _v152 = $464;
              
              {ESLVal _v153 = $465;
              
              return $nil;
            }
            }
        }
        }
        }
      else if(_v117.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6691,6799)").add(ESLVal.list(_v117)));
      }
    }
  });
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v116 = l;
        
        if(_v116.isCons())
        {ESLVal $462 = _v116.head();
          ESLVal $463 = _v116.tail();
          
          {ESLVal t = $462;
          
          {ESLVal _v148 = $463;
          
          if(p.apply(t).boolVal)
          return dropWhile.apply(p,_v148);
          else
            {ESLVal _v149 = _v116;
              
              return _v149;
            }
        }
        }
        }
      else if(_v116.isNil())
        return $nil;
      else {ESLVal _v150 = _v116;
          
          return _v150;
        }
      }
    }
  });
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal removables = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v115 = removables;
        
        if(_v115.isCons())
        {ESLVal $460 = _v115.head();
          ESLVal $461 = _v115.tail();
          
          {ESLVal t = $460;
          
          {ESLVal r = $461;
          
          return removeAll.apply(r,remove.apply(t,l));
        }
        }
        }
      else if(_v115.isNil())
        return l;
      else return error(new ESLVal("case error at Pos(6992,7080)").add(ESLVal.list(_v115)));
      }
    }
  });
public static void main(String[] args) {
  }
}