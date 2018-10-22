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
  {ESLVal _v167 = l;
        
        if(_v167.isCons())
        {ESLVal $544 = _v167.head();
          ESLVal $545 = _v167.tail();
          
          {ESLVal h = $544;
          
          {ESLVal t = $545;
          
          if(p.apply(h).boolVal)
          return h;
          else
            {ESLVal _v209 = $544;
              
              {ESLVal _v210 = $545;
              
              return select1.apply(_v210,d,p);
            }
            }
        }
        }
        }
      else if(_v167.isNil())
        return d;
      else return error(new ESLVal("case error at Pos(515,613)"));
      }
    }
  });
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v166 = l;
        
        if(_v166.isCons())
        {ESLVal $542 = _v166.head();
          ESLVal $543 = _v166.tail();
          
          {ESLVal m = $542;
          
          {ESLVal ms = $543;
          
          return map.apply(f,ms).cons(f.apply(m));
        }
        }
        }
      else if(_v166.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(651,741)"));
      }
    }
  });
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v165 = l;
        
        if(_v165.isCons())
        {ESLVal $540 = _v165.head();
          ESLVal $541 = _v165.tail();
          
          {ESLVal h = $540;
          
          {ESLVal t = $541;
          
          if(h.eql(v).boolVal)
          return remove.apply(v,t);
          else
            {ESLVal _v207 = $540;
              
              {ESLVal _v208 = $541;
              
              return remove.apply(v,_v208).cons(_v207);
            }
            }
        }
        }
        }
      else if(_v165.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(890,1023)"));
      }
    }
  });
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v164 = l;
        
        if(_v164.isCons())
        {ESLVal $538 = _v164.head();
          ESLVal $539 = _v164.tail();
          
          {ESLVal h = $538;
          
          {ESLVal t = $539;
          
          if(h.eql(v).boolVal)
          return t;
          else
            {ESLVal _v205 = $538;
              
              {ESLVal _v206 = $539;
              
              return remove1.apply(v,_v206).cons(_v205);
            }
            }
        }
        }
        }
      else if(_v164.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1058,1179)"));
      }
    }
  });
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v163 = l;
        
        if(_v163.isCons())
        {ESLVal $536 = _v163.head();
          ESLVal $537 = _v163.tail();
          
          {ESLVal h = $536;
          
          {ESLVal t = $537;
          
          return $one.add(length.apply(t));
        }
        }
        }
      else if(_v163.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1318,1394)"));
      }
    }
  });
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal lists = $args[0];
  {ESLVal _v162 = lists;
        
        if(_v162.isCons())
        {ESLVal $534 = _v162.head();
          ESLVal $535 = _v162.tail();
          
          {ESLVal h = $534;
          
          {ESLVal t = $535;
          
          return h.add(flatten.apply(t));
        }
        }
        }
      else if(_v162.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1874,1966)"));
      }
    }
  });
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v161 = l;
        
        if(_v161.isCons())
        {ESLVal $532 = _v161.head();
          ESLVal $533 = _v161.tail();
          
          {ESLVal h = $532;
          
          {ESLVal t = $533;
          
          if(h.eql(x).boolVal)
          return $one.add(count.apply(x,t));
          else
            return count.apply(x,t);
        }
        }
        }
      else if(_v161.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(2007,2117)"));
      }
    }
  });
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  ESLVal prefix = $args[1];
  {ESLVal _v160 = list;
        ESLVal _v159 = prefix;
        
        if(_v160.isCons())
        {ESLVal $528 = _v160.head();
          ESLVal $529 = _v160.tail();
          
          if(_v159.isCons())
          {ESLVal $530 = _v159.head();
            ESLVal $531 = _v159.tail();
            
            {ESLVal x = $528;
            
            {ESLVal _v203 = $529;
            
            {ESLVal y = $530;
            
            {ESLVal _v204 = $531;
            
            if(x.eql(y).boolVal)
            return hasPrefix.apply(_v203,_v204);
            else
              if(_v159.isCons())
                {ESLVal $526 = _v159.head();
                  ESLVal $527 = _v159.tail();
                  
                  {ESLVal l1 = _v160;
                  
                  {ESLVal l2 = _v159;
                  
                  return $false;
                }
                }
                }
              else if(_v159.isNil())
                {ESLVal l1 = _v160;
                  
                  return $true;
                }
              else {ESLVal l1 = _v160;
                  
                  {ESLVal l2 = _v159;
                  
                  return $false;
                }
                }
          }
          }
          }
          }
          }
        else if(_v159.isNil())
          if(_v159.isCons())
            {ESLVal $526 = _v159.head();
              ESLVal $527 = _v159.tail();
              
              {ESLVal l1 = _v160;
              
              {ESLVal l2 = _v159;
              
              return $false;
            }
            }
            }
          else if(_v159.isNil())
            {ESLVal l1 = _v160;
              
              return $true;
            }
          else {ESLVal l1 = _v160;
              
              {ESLVal l2 = _v159;
              
              return $false;
            }
            }
        else if(_v159.isCons())
            {ESLVal $526 = _v159.head();
              ESLVal $527 = _v159.tail();
              
              {ESLVal l1 = _v160;
              
              {ESLVal l2 = _v159;
              
              return $false;
            }
            }
            }
          else if(_v159.isNil())
            {ESLVal l1 = _v160;
              
              return $true;
            }
          else {ESLVal l1 = _v160;
              
              {ESLVal l2 = _v159;
              
              return $false;
            }
            }
        }
      else if(_v160.isNil())
        if(_v159.isCons())
          {ESLVal $526 = _v159.head();
            ESLVal $527 = _v159.tail();
            
            {ESLVal l1 = _v160;
            
            {ESLVal l2 = _v159;
            
            return $false;
          }
          }
          }
        else if(_v159.isNil())
          {ESLVal l1 = _v160;
            
            return $true;
          }
        else {ESLVal l1 = _v160;
            
            {ESLVal l2 = _v159;
            
            return $false;
          }
          }
      else if(_v159.isCons())
          {ESLVal $526 = _v159.head();
            ESLVal $527 = _v159.tail();
            
            {ESLVal l1 = _v160;
            
            {ESLVal l2 = _v159;
            
            return $false;
          }
          }
          }
        else if(_v159.isNil())
          {ESLVal l1 = _v160;
            
            return $true;
          }
        else {ESLVal l1 = _v160;
            
            {ESLVal l2 = _v159;
            
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
  {ESLVal _v158 = l;
        
        if(_v158.isCons())
        {ESLVal $524 = _v158.head();
          ESLVal $525 = _v158.tail();
          
          {ESLVal h = $524;
          
          {ESLVal t = $525;
          
          if(n.eql($zero).boolVal)
          return h;
          else
            return nth.apply(t,n.sub($one));
        }
        }
        }
      else if(_v158.isNil())
        return error(new ESLVal("cannot take nth element."));
      else return error(new ESLVal("case error at Pos(2477,2614)"));
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
          {ESLVal _v157 = l;
            
            if(_v157.isCons())
            {ESLVal $522 = _v157.head();
              ESLVal $523 = _v157.tail();
              
              {ESLVal h = $522;
              
              {ESLVal t = $523;
              
              return take.apply(t,n.sub($one)).cons(h);
            }
            }
            }
          else if(_v157.isNil())
            return error(new ESLVal("cannot take element ").add(n));
          else return error(new ESLVal("case error at Pos(2686,2814)"));
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
          {ESLVal _v156 = l;
            
            if(_v156.isCons())
            {ESLVal $520 = _v156.head();
              ESLVal $521 = _v156.tail();
              
              {ESLVal h = $520;
              
              {ESLVal t = $521;
              
              return drop.apply(t,n.sub($one));
            }
            }
            }
          else if(_v156.isNil())
            return error(new ESLVal("cannot drop element ").add(n));
          else return error(new ESLVal("case error at Pos(2882,3003)"));
          }
    }
  });
  public static ESLVal subst = new ESLVal(new Function(new ESLVal("subst"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal o = $args[1];
  ESLVal l = $args[2];
  {ESLVal _v155 = l;
        
        if(_v155.isCons())
        {ESLVal $518 = _v155.head();
          ESLVal $519 = _v155.tail();
          
          {ESLVal h = $518;
          
          {ESLVal t = $519;
          
          if(h.eql(o).boolVal)
          return subst.apply(n,o,t).cons(n);
          else
            return subst.apply(n,o,t).cons(h);
        }
        }
        }
      else if(_v155.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3045,3171)"));
      }
    }
  });
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun541"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v154 = l;
        
        if(_v154.isCons())
        {ESLVal $516 = _v154.head();
          ESLVal $517 = _v154.tail();
          
          {ESLVal h = $516;
          
          {ESLVal t = $517;
          
          return h;
        }
        }
        }
      else if(_v154.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(3244,3345)"));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun542"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v153 = l;
        
        if(_v153.isCons())
        {ESLVal $514 = _v153.head();
          ESLVal $515 = _v153.tail();
          
          {ESLVal h = $514;
          
          {ESLVal t = $515;
          
          return t;
        }
        }
        }
      else if(_v153.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3422,3525)"));
      }
    }
  });
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v152 = l;
        
        if(_v152.isCons())
        {ESLVal $512 = _v152.head();
          ESLVal $513 = _v152.tail();
          
          {ESLVal _v201 = _v152;
          
          return $false;
        }
        }
      else if(_v152.isNil())
        return $true;
      else {ESLVal _v202 = _v152;
          
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
  {ESLVal _v151 = l;
        
        if(_v151.isCons())
        {ESLVal $510 = _v151.head();
          ESLVal $511 = _v151.tail();
          
          {ESLVal x = $510;
          
          {ESLVal xs = $511;
          
          if(x.eql(e).boolVal)
          return $true;
          else
            {ESLVal _v199 = $510;
              
              {ESLVal _v200 = $511;
              
              return member.apply(e,_v200);
            }
            }
        }
        }
        }
      else if(_v151.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3761,3866)"));
      }
    }
  });
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v150 = l;
        
        if(_v150.isCons())
        {ESLVal $508 = _v150.head();
          ESLVal $509 = _v150.tail();
          
          {ESLVal x = $508;
          
          {ESLVal xs = $509;
          
          return reverse.apply(xs).add(ESLVal.list(x));
        }
        }
        }
      else if(_v150.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(3898,3972)"));
      }
    }
  });
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun543"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v149 = l;
        
        if(_v149.isCons())
        {ESLVal $506 = _v149.head();
          ESLVal $507 = _v149.tail();
          
          {ESLVal x = $506;
          
          {ESLVal xs = $507;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v197 = $506;
              
              {ESLVal _v198 = $507;
              
              return exists.apply(pred,_v198);
            }
            }
        }
        }
        }
      else if(_v149.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(4080,4191)"));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun544"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v148 = l;
        
        if(_v148.isCons())
        {ESLVal $504 = _v148.head();
          ESLVal $505 = _v148.tail();
          
          {ESLVal x = $504;
          
          {ESLVal xs = $505;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v195 = $504;
              
              {ESLVal _v196 = $505;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v148.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(4298,4409)"));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal x = $args[2];
  {ESLVal _v147 = l;
        
        if(_v147.isCons())
        {ESLVal $502 = _v147.head();
          ESLVal $503 = _v147.tail();
          
          {ESLVal h = $502;
          
          {ESLVal t = $503;
          
          if(n.eql($zero).boolVal)
          return t.cons(x);
          else
            {ESLVal _v193 = $502;
              
              {ESLVal _v194 = $503;
              
              return replaceNth.apply(_v194,n.sub($one),x).cons(_v193);
            }
            }
        }
        }
        }
      else if(_v147.isNil())
        return error(new ESLVal("cannot replace nth of []"));
      else return error(new ESLVal("case error at Pos(4587,4730)"));
      }
    }
  });
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v146 = l;
        
        if(_v146.isCons())
        {ESLVal $500 = _v146.head();
          ESLVal $501 = _v146.tail();
          
          {ESLVal h = $500;
          
          {ESLVal _v190 = $501;
          
          if(h.eql(t).boolVal)
          return $zero;
          else
            {ESLVal _v191 = $500;
              
              {ESLVal _v192 = $501;
              
              return $one.add(indexOf.apply(t,_v192));
            }
            }
        }
        }
        }
      else if(_v146.isNil())
        return $zero.sub($one);
      else return error(new ESLVal("case error at Pos(4765,4866)"));
      }
    }
  });
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v145 = l;
        
        if(_v145.isCons())
        {ESLVal $498 = _v145.head();
          ESLVal $499 = _v145.tail();
          
          {ESLVal h = $498;
          
          {ESLVal t = $499;
          
          if(p.apply(h).boolVal)
          return select.apply(p,t).cons(h);
          else
            {ESLVal _v188 = $498;
              
              {ESLVal _v189 = $499;
              
              return select.apply(p,_v189);
            }
            }
        }
        }
        }
      else if(_v145.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4910,5024)"));
      }
    }
  });
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v144 = l;
        
        if(_v144.isCons())
        {ESLVal $496 = _v144.head();
          ESLVal $497 = _v144.tail();
          
          {ESLVal h = $496;
          
          {ESLVal t = $497;
          
          if(p.apply(h).boolVal)
          return reject.apply(p,t);
          else
            {ESLVal _v186 = $496;
              
              {ESLVal _v187 = $497;
              
              return reject.apply(p,_v187).cons(_v186);
            }
            }
        }
        }
        }
      else if(_v144.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5068,5182)"));
      }
    }
  });
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v143 = l;
        
        if(_v143.isCons())
        {ESLVal $492 = _v143.head();
          ESLVal $493 = _v143.tail();
          
          if($493.isCons())
          {ESLVal $494 = $493.head();
            ESLVal $495 = $493.tail();
            
            {ESLVal h = $492;
            
            {ESLVal _v184 = $493;
            
            return last.apply(_v184);
          }
          }
          }
        else if($493.isNil())
          {ESLVal x = $492;
            
            return x;
          }
        else {ESLVal h = $492;
            
            {ESLVal _v185 = $493;
            
            return last.apply(_v185);
          }
          }
        }
      else if(_v143.isNil())
        return error(new ESLVal("cannot find last element of emply list"));
      else return error(new ESLVal("case error at Pos(5309,5439)"));
      }
    }
  });
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v142 = l;
        
        if(_v142.isCons())
        {ESLVal $488 = _v142.head();
          ESLVal $489 = _v142.tail();
          
          if($489.isCons())
          {ESLVal $490 = $489.head();
            ESLVal $491 = $489.tail();
            
            {ESLVal h = $488;
            
            {ESLVal _v182 = $489;
            
            return butlast.apply(_v182).cons(h);
          }
          }
          }
        else if($489.isNil())
          {ESLVal x = $488;
            
            return $nil;
          }
        else {ESLVal h = $488;
            
            {ESLVal _v183 = $489;
            
            return butlast.apply(_v183).cons(h);
          }
          }
        }
      else if(_v142.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5582,5671)"));
      }
    }
  });
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v141 = l;
        
        if(_v141.isCons())
        {ESLVal $486 = _v141.head();
          ESLVal $487 = _v141.tail();
          
          {ESLVal h = $486;
          
          {ESLVal t = $487;
          
          if(h.eql(x).boolVal)
          return $one.add(occurrences.apply(x,t));
          else
            {ESLVal _v180 = $486;
              
              {ESLVal _v181 = $487;
              
              return occurrences.apply(x,_v181);
            }
            }
        }
        }
        }
      else if(_v141.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(5710,5831)"));
      }
    }
  });
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v140 = l;
        
        if(_v140.isCons())
        {ESLVal $484 = _v140.head();
          ESLVal $485 = _v140.tail();
          
          {ESLVal h = $484;
          
          {ESLVal t = $485;
          
          if(pred.apply(h).boolVal)
          return filter.apply(pred,t).cons(h);
          else
            return filter.apply(pred,t);
        }
        }
        }
      else if(_v140.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(5879,6010)"));
      }
    }
  });
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v179 = $args[0];
  ESLVal _v178 = $args[1];
  ESLVal _v177 = $args[2];
  ESLVal _v176 = $args[3];
  {ESLVal _v139 = _v176;
        
        if(_v139.isCons())
        {ESLVal $482 = _v139.head();
          ESLVal $483 = _v139.tail();
          
          {ESLVal h = $482;
          
          {ESLVal t = $483;
          
          return _v178.apply(_v179.apply(h),foldr.apply(_v179,_v178,_v177,t));
        }
        }
        }
      else if(_v139.isNil())
        return _v177;
      else return error(new ESLVal("case error at Pos(6077,6167)"));
      }
    }
  });
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun545"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal list = $args[0];
  return foldr.apply(id,new ESLVal(new Function(new ESLVal("fun546"),getSelf()) {
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
  {ESLVal _v138 = list;
        
        if(_v138.isCons())
        {ESLVal $480 = _v138.head();
          ESLVal $481 = _v138.tail();
          
          {ESLVal x = $480;
          
          {ESLVal l = $481;
          
          return removeDups.apply(remove.apply(x,l)).cons(x);
        }
        }
        }
      else if(_v138.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(6327,6408)"));
      }
    }
  });
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  LetRec letrec = new LetRec() {
        ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v175 = $args[0];
          ESLVal _v174 = $args[1];
          {print.apply(_v174);
              if(_v174.eql(ESLVal.list()).boolVal)
                return _v175;
                else
                  return pre.apply(_v175.add(ESLVal.list(last.apply(_v175).add(ESLVal.list(head.apply(_v174))))),tail.apply(_v174));}
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
  {ESLVal _v137 = l;
        
        if(_v137.isCons())
        {ESLVal $478 = _v137.head();
          ESLVal $479 = _v137.tail();
          
          {ESLVal t = $478;
          
          {ESLVal _v171 = $479;
          
          if(p.apply(t).boolVal)
          return takeWhile.apply(p,_v171).cons(t);
          else
            {ESLVal _v172 = $478;
              
              {ESLVal _v173 = $479;
              
              return $nil;
            }
            }
        }
        }
        }
      else if(_v137.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(6690,6798)"));
      }
    }
  });
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v136 = l;
        
        if(_v136.isCons())
        {ESLVal $476 = _v136.head();
          ESLVal $477 = _v136.tail();
          
          {ESLVal t = $476;
          
          {ESLVal _v168 = $477;
          
          if(p.apply(t).boolVal)
          return dropWhile.apply(p,_v168);
          else
            {ESLVal _v169 = _v136;
              
              return _v169;
            }
        }
        }
        }
      else if(_v136.isNil())
        return $nil;
      else {ESLVal _v170 = _v136;
          
          return _v170;
        }
      }
    }
  });
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal removables = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v135 = removables;
        
        if(_v135.isCons())
        {ESLVal $474 = _v135.head();
          ESLVal $475 = _v135.tail();
          
          {ESLVal t = $474;
          
          {ESLVal r = $475;
          
          return removeAll.apply(r,remove.apply(t,l));
        }
        }
        }
      else if(_v135.isNil())
        return l;
      else return error(new ESLVal("case error at Pos(6991,7079)"));
      }
    }
  });
public static void main(String[] args) {
  }
}