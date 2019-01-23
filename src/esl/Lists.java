package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Lists {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal remove = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("remove"),new ESLVal(2));
  public static ESLVal length = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("length"),$one);
  public static ESLVal flatten = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("flatten"),$one);
  public static ESLVal nth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("nth"),new ESLVal(2));
  public static ESLVal head = new ESLVal(new Function(new ESLVal("fun329"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v165 = l;
        
        if(_v165.isCons())
        {ESLVal $591 = _v165.head();
          ESLVal $592 = _v165.tail();
          
          {ESLVal h = $591;
          
          {ESLVal t = $592;
          
          return h;
        }
        }
        }
      else if(_v165.isNil())
        return error(new ESLVal("cannot take the head of []"));
      else return error(new ESLVal("case error at Pos(2966,3045)").add(ESLVal.list(_v165)));
      }
    }
  });
  public static ESLVal tail = new ESLVal(new Function(new ESLVal("fun330"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  {ESLVal _v166 = l;
        
        if(_v166.isCons())
        {ESLVal $593 = _v166.head();
          ESLVal $594 = _v166.tail();
          
          {ESLVal h = $593;
          
          {ESLVal t = $594;
          
          return t;
        }
        }
        }
      else if(_v166.isNil())
        return error(new ESLVal("cannot take the tail of []"));
      else return error(new ESLVal("case error at Pos(3122,3203)").add(ESLVal.list(_v166)));
      }
    }
  });
  public static ESLVal member = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("member"),new ESLVal(2));
  public static ESLVal exists = new ESLVal(new Function(new ESLVal("fun331"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v167 = l;
        
        if(_v167.isCons())
        {ESLVal $595 = _v167.head();
          ESLVal $596 = _v167.tail();
          
          {ESLVal x = $595;
          
          {ESLVal xs = $596;
          
          if(pred.apply(x).boolVal)
          return $true;
          else
            {ESLVal _v171 = $595;
              
              {ESLVal _v172 = $596;
              
              return exists.apply(pred,_v172);
            }
            }
        }
        }
        }
      else if(_v167.isNil())
        return $false;
      else return error(new ESLVal("case error at Pos(3758,3869)").add(ESLVal.list(_v167)));
      }
    }
  });
  public static ESLVal forall = new ESLVal(new Function(new ESLVal("fun332"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pred = $args[0];
  ESLVal l = $args[1];
  {ESLVal _v168 = l;
        
        if(_v168.isCons())
        {ESLVal $597 = _v168.head();
          ESLVal $598 = _v168.tail();
          
          {ESLVal x = $597;
          
          {ESLVal xs = $598;
          
          if(pred.apply(x).boolVal)
          return forall.apply(pred,xs);
          else
            {ESLVal _v169 = $597;
              
              {ESLVal _v170 = $598;
              
              return $false;
            }
            }
        }
        }
        }
      else if(_v168.isNil())
        return $true;
      else return error(new ESLVal("case error at Pos(3976,4087)").add(ESLVal.list(_v168)));
      }
    }
  });
  public static ESLVal replaceNth = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("replaceNth"),new ESLVal(3));
  public static ESLVal last = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("last"),$one);
  public static ESLVal butlast = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("butlast"),$one);
  public static ESLVal id = new ESLVal(new Function(new ESLVal("fun333"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x;
    }
  });
public static ESLVal adjoin(ESLVal x,ESLVal l) {
    
    if(member.apply(x,l).boolVal)
      return l;
      else
        return l.cons(x);
  }
  public static ESLVal adjoin = new ESLVal(new Function(new ESLVal("adjoin"),null) { public ESLVal apply(ESLVal... args) { return adjoin(args[0],args[1]); }});
  public static ESLVal select1(ESLVal l,ESLVal d,ESLVal p) {
    
    {ESLVal _v136 = l;
      
      if(_v136.isCons())
      {ESLVal $527 = _v136.head();
        ESLVal $528 = _v136.tail();
        
        {ESLVal h = $527;
        
        {ESLVal t = $528;
        
        if(p.apply(h).boolVal)
        return h;
        else
          {ESLVal _v204 = $527;
            
            {ESLVal _v205 = $528;
            
            return select1(_v205,d,p);
          }
          }
      }
      }
      }
    else if(_v136.isNil())
      return d;
    else return error(new ESLVal("case error at Pos(515,613)").add(ESLVal.list(_v136)));
    }
  }
  public static ESLVal select1 = new ESLVal(new Function(new ESLVal("select1"),null) { public ESLVal apply(ESLVal... args) { return select1(args[0],args[1],args[2]); }});
  public static ESLVal map(ESLVal f,ESLVal l) {
    
    {ESLVal _v137 = l;
      
      if(_v137.isCons())
      {ESLVal $529 = _v137.head();
        ESLVal $530 = _v137.tail();
        
        {ESLVal m = $529;
        
        {ESLVal ms = $530;
        
        return map(f,ms).cons(f.apply(m));
      }
      }
      }
    else if(_v137.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(652,719)").add(ESLVal.list(_v137)));
    }
  }
  public static ESLVal map = new ESLVal(new Function(new ESLVal("map"),null) { public ESLVal apply(ESLVal... args) { return map(args[0],args[1]); }});
  public static ESLVal removeSemantics(ESLVal v,ESLVal l) {
    
    {ESLVal _v138 = l;
      
      if(_v138.isCons())
      {ESLVal $531 = _v138.head();
        ESLVal $532 = _v138.tail();
        
        {ESLVal h = $531;
        
        {ESLVal t = $532;
        
        if(h.eql(v).boolVal)
        return remove.apply(v,t);
        else
          {ESLVal _v202 = $531;
            
            {ESLVal _v203 = $532;
            
            return remove.apply(v,_v203).cons(_v202);
          }
          }
      }
      }
      }
    else if(_v138.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(868,979)").add(ESLVal.list(_v138)));
    }
  }
  public static ESLVal removeSemantics = new ESLVal(new Function(new ESLVal("removeSemantics"),null) { public ESLVal apply(ESLVal... args) { return removeSemantics(args[0],args[1]); }});
  public static ESLVal remove1(ESLVal v,ESLVal l) {
    
    {ESLVal _v139 = l;
      
      if(_v139.isCons())
      {ESLVal $533 = _v139.head();
        ESLVal $534 = _v139.tail();
        
        {ESLVal h = $533;
        
        {ESLVal t = $534;
        
        if(h.eql(v).boolVal)
        return t;
        else
          {ESLVal _v200 = $533;
            
            {ESLVal _v201 = $534;
            
            return remove1(v,_v201).cons(_v200);
          }
          }
      }
      }
      }
    else if(_v139.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(1014,1113)").add(ESLVal.list(_v139)));
    }
  }
  public static ESLVal remove1 = new ESLVal(new Function(new ESLVal("remove1"),null) { public ESLVal apply(ESLVal... args) { return remove1(args[0],args[1]); }});
  public static ESLVal lengthSemantics(ESLVal l) {
    
    {ESLVal _v140 = l;
      
      if(_v140.isCons())
      {ESLVal $535 = _v140.head();
        ESLVal $536 = _v140.tail();
        
        {ESLVal h = $535;
        
        {ESLVal t = $536;
        
        return $one.add(length.apply(t));
      }
      }
      }
    else if(_v140.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(1252,1306)").add(ESLVal.list(_v140)));
    }
  }
  public static ESLVal lengthSemantics = new ESLVal(new Function(new ESLVal("lengthSemantics"),null) { public ESLVal apply(ESLVal... args) { return lengthSemantics(args[0]); }});
  public static ESLVal flattenSemantics(ESLVal lists) {
    
    {ESLVal _v141 = lists;
      
      if(_v141.isCons())
      {ESLVal $537 = _v141.head();
        ESLVal $538 = _v141.tail();
        
        {ESLVal h = $537;
        
        {ESLVal t = $538;
        
        return h.add(flatten.apply(t));
      }
      }
      }
    else if(_v141.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(1786,1852)").add(ESLVal.list(_v141)));
    }
  }
  public static ESLVal flattenSemantics = new ESLVal(new Function(new ESLVal("flattenSemantics"),null) { public ESLVal apply(ESLVal... args) { return flattenSemantics(args[0]); }});
  public static ESLVal count(ESLVal x,ESLVal l) {
    
    {ESLVal _v142 = l;
      
      if(_v142.isCons())
      {ESLVal $539 = _v142.head();
        ESLVal $540 = _v142.tail();
        
        {ESLVal h = $539;
        
        {ESLVal t = $540;
        
        if(h.eql(x).boolVal)
        return $one.add(count(x,t));
        else
          return count(x,t);
      }
      }
      }
    else if(_v142.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(1893,1981)").add(ESLVal.list(_v142)));
    }
  }
  public static ESLVal count = new ESLVal(new Function(new ESLVal("count"),null) { public ESLVal apply(ESLVal... args) { return count(args[0],args[1]); }});
  public static ESLVal hasPrefix(ESLVal list,ESLVal prefix) {
    
    {ESLVal _v143 = list;
      ESLVal _v144 = prefix;
      
      if(_v143.isCons())
      {ESLVal $543 = _v143.head();
        ESLVal $544 = _v143.tail();
        
        if(_v144.isCons())
        {ESLVal $545 = _v144.head();
          ESLVal $546 = _v144.tail();
          
          {ESLVal x = $543;
          
          {ESLVal _v198 = $544;
          
          {ESLVal y = $545;
          
          {ESLVal _v199 = $546;
          
          if(x.eql(y).boolVal)
          return hasPrefix(_v198,_v199);
          else
            if(_v144.isCons())
              {ESLVal $541 = _v144.head();
                ESLVal $542 = _v144.tail();
                
                {ESLVal l1 = _v143;
                
                {ESLVal l2 = _v144;
                
                return $false;
              }
              }
              }
            else if(_v144.isNil())
              {ESLVal l1 = _v143;
                
                return $true;
              }
            else {ESLVal l1 = _v143;
                
                {ESLVal l2 = _v144;
                
                return $false;
              }
              }
        }
        }
        }
        }
        }
      else if(_v144.isNil())
        if(_v144.isCons())
          {ESLVal $541 = _v144.head();
            ESLVal $542 = _v144.tail();
            
            {ESLVal l1 = _v143;
            
            {ESLVal l2 = _v144;
            
            return $false;
          }
          }
          }
        else if(_v144.isNil())
          {ESLVal l1 = _v143;
            
            return $true;
          }
        else {ESLVal l1 = _v143;
            
            {ESLVal l2 = _v144;
            
            return $false;
          }
          }
      else if(_v144.isCons())
          {ESLVal $541 = _v144.head();
            ESLVal $542 = _v144.tail();
            
            {ESLVal l1 = _v143;
            
            {ESLVal l2 = _v144;
            
            return $false;
          }
          }
          }
        else if(_v144.isNil())
          {ESLVal l1 = _v143;
            
            return $true;
          }
        else {ESLVal l1 = _v143;
            
            {ESLVal l2 = _v144;
            
            return $false;
          }
          }
      }
    else if(_v143.isNil())
      if(_v144.isCons())
        {ESLVal $541 = _v144.head();
          ESLVal $542 = _v144.tail();
          
          {ESLVal l1 = _v143;
          
          {ESLVal l2 = _v144;
          
          return $false;
        }
        }
        }
      else if(_v144.isNil())
        {ESLVal l1 = _v143;
          
          return $true;
        }
      else {ESLVal l1 = _v143;
          
          {ESLVal l2 = _v144;
          
          return $false;
        }
        }
    else if(_v144.isCons())
        {ESLVal $541 = _v144.head();
          ESLVal $542 = _v144.tail();
          
          {ESLVal l1 = _v143;
          
          {ESLVal l2 = _v144;
          
          return $false;
        }
        }
        }
      else if(_v144.isNil())
        {ESLVal l1 = _v143;
          
          return $true;
        }
      else {ESLVal l1 = _v143;
          
          {ESLVal l2 = _v144;
          
          return $false;
        }
        }
    }
  }
  public static ESLVal hasPrefix = new ESLVal(new Function(new ESLVal("hasPrefix"),null) { public ESLVal apply(ESLVal... args) { return hasPrefix(args[0],args[1]); }});
  public static ESLVal nthSemantics(ESLVal l,ESLVal n) {
    
    {ESLVal _v145 = l;
      
      if(_v145.isCons())
      {ESLVal $547 = _v145.head();
        ESLVal $548 = _v145.tail();
        
        {ESLVal h = $547;
        
        {ESLVal t = $548;
        
        if(n.eql($zero).boolVal)
        return h;
        else
          return nth.apply(t,n.sub($one));
      }
      }
      }
    else if(_v145.isNil())
      return error(new ESLVal("cannot take nth element."));
    else return error(new ESLVal("case error at Pos(2295,2410)").add(ESLVal.list(_v145)));
    }
  }
  public static ESLVal nthSemantics = new ESLVal(new Function(new ESLVal("nthSemantics"),null) { public ESLVal apply(ESLVal... args) { return nthSemantics(args[0],args[1]); }});
  public static ESLVal take(ESLVal l,ESLVal n) {
    
    if(n.eql($zero).boolVal)
      return $nil;
      else
        {ESLVal _v146 = l;
          
          if(_v146.isCons())
          {ESLVal $549 = _v146.head();
            ESLVal $550 = _v146.tail();
            
            {ESLVal h = $549;
            
            {ESLVal t = $550;
            
            return take(t,n.sub($one)).cons(h);
          }
          }
          }
        else if(_v146.isNil())
          return error(new ESLVal("cannot take element ").add(n));
        else return error(new ESLVal("case error at Pos(2482,2584)").add(ESLVal.list(_v146)));
        }
  }
  public static ESLVal take = new ESLVal(new Function(new ESLVal("take"),null) { public ESLVal apply(ESLVal... args) { return take(args[0],args[1]); }});
  public static ESLVal drop(ESLVal l,ESLVal n) {
    
    if(n.eql($zero).boolVal)
      return l;
      else
        {ESLVal _v147 = l;
          
          if(_v147.isCons())
          {ESLVal $551 = _v147.head();
            ESLVal $552 = _v147.tail();
            
            {ESLVal h = $551;
            
            {ESLVal t = $552;
            
            return drop(t,n.sub($one));
          }
          }
          }
        else if(_v147.isNil())
          return error(new ESLVal("cannot drop element ").add(n));
        else return error(new ESLVal("case error at Pos(2652,2747)").add(ESLVal.list(_v147)));
        }
  }
  public static ESLVal drop = new ESLVal(new Function(new ESLVal("drop"),null) { public ESLVal apply(ESLVal... args) { return drop(args[0],args[1]); }});
  public static ESLVal subst(ESLVal n,ESLVal o,ESLVal l) {
    
    {ESLVal _v148 = l;
      
      if(_v148.isCons())
      {ESLVal $553 = _v148.head();
        ESLVal $554 = _v148.tail();
        
        {ESLVal h = $553;
        
        {ESLVal t = $554;
        
        if(h.eql(o).boolVal)
        return subst(n,o,t).cons(n);
        else
          return subst(n,o,t).cons(h);
      }
      }
      }
    else if(_v148.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2789,2893)").add(ESLVal.list(_v148)));
    }
  }
  public static ESLVal subst = new ESLVal(new Function(new ESLVal("subst"),null) { public ESLVal apply(ESLVal... args) { return subst(args[0],args[1],args[2]); }});
  public static ESLVal isNil(ESLVal l) {
    
    {ESLVal _v149 = l;
      
      if(_v149.isCons())
      {ESLVal $555 = _v149.head();
        ESLVal $556 = _v149.tail();
        
        {ESLVal _v196 = _v149;
        
        return $false;
      }
      }
    else if(_v149.isNil())
      return $true;
    else {ESLVal _v197 = _v149;
        
        return $false;
      }
    }
  }
  public static ESLVal isNil = new ESLVal(new Function(new ESLVal("isNil"),null) { public ESLVal apply(ESLVal... args) { return isNil(args[0]); }});
  public static ESLVal memberSemantics(ESLVal e,ESLVal l) {
    
    {ESLVal _v150 = l;
      
      if(_v150.isCons())
      {ESLVal $557 = _v150.head();
        ESLVal $558 = _v150.tail();
        
        {ESLVal x = $557;
        
        {ESLVal xs = $558;
        
        if(x.eql(e).boolVal)
        return $true;
        else
          {ESLVal _v194 = $557;
            
            {ESLVal _v195 = $558;
            
            return member.apply(e,_v195);
          }
          }
      }
      }
      }
    else if(_v150.isNil())
      return $false;
    else return error(new ESLVal("case error at Pos(3439,3544)").add(ESLVal.list(_v150)));
    }
  }
  public static ESLVal memberSemantics = new ESLVal(new Function(new ESLVal("memberSemantics"),null) { public ESLVal apply(ESLVal... args) { return memberSemantics(args[0],args[1]); }});
  public static ESLVal reverse(ESLVal l) {
    
    {ESLVal _v151 = l;
      
      if(_v151.isCons())
      {ESLVal $559 = _v151.head();
        ESLVal $560 = _v151.tail();
        
        {ESLVal x = $559;
        
        {ESLVal xs = $560;
        
        return reverse(xs).add(ESLVal.list(x));
      }
      }
      }
    else if(_v151.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(3576,3650)").add(ESLVal.list(_v151)));
    }
  }
  public static ESLVal reverse = new ESLVal(new Function(new ESLVal("reverse"),null) { public ESLVal apply(ESLVal... args) { return reverse(args[0]); }});
  public static ESLVal replaceNthSemantics(ESLVal l,ESLVal n,ESLVal x) {
    
    {ESLVal _v152 = l;
      
      if(_v152.isCons())
      {ESLVal $561 = _v152.head();
        ESLVal $562 = _v152.tail();
        
        {ESLVal h = $561;
        
        {ESLVal t = $562;
        
        if(n.eql($zero).boolVal)
        return t.cons(x);
        else
          {ESLVal _v192 = $561;
            
            {ESLVal _v193 = $562;
            
            return replaceNth.apply(_v193,n.sub($one),x).cons(_v192);
          }
          }
      }
      }
      }
    else if(_v152.isNil())
      return error(new ESLVal("cannot replace nth of []"));
    else return error(new ESLVal("case error at Pos(4265,4408)").add(ESLVal.list(_v152)));
    }
  }
  public static ESLVal replaceNthSemantics = new ESLVal(new Function(new ESLVal("replaceNthSemantics"),null) { public ESLVal apply(ESLVal... args) { return replaceNthSemantics(args[0],args[1],args[2]); }});
  public static ESLVal indexOf(ESLVal t,ESLVal l) {
    
    {ESLVal _v153 = l;
      
      if(_v153.isCons())
      {ESLVal $563 = _v153.head();
        ESLVal $564 = _v153.tail();
        
        {ESLVal h = $563;
        
        {ESLVal _v189 = $564;
        
        if(h.eql(t).boolVal)
        return $zero;
        else
          {ESLVal _v190 = $563;
            
            {ESLVal _v191 = $564;
            
            return $one.add(indexOf(t,_v191));
          }
          }
      }
      }
      }
    else if(_v153.isNil())
      return $zero.sub($one);
    else return error(new ESLVal("case error at Pos(4443,4544)").add(ESLVal.list(_v153)));
    }
  }
  public static ESLVal indexOf = new ESLVal(new Function(new ESLVal("indexOf"),null) { public ESLVal apply(ESLVal... args) { return indexOf(args[0],args[1]); }});
  public static ESLVal select(ESLVal p,ESLVal l) {
    
    {ESLVal _v154 = l;
      
      if(_v154.isCons())
      {ESLVal $565 = _v154.head();
        ESLVal $566 = _v154.tail();
        
        {ESLVal h = $565;
        
        {ESLVal t = $566;
        
        if(p.apply(h).boolVal)
        return select(p,t).cons(h);
        else
          {ESLVal _v187 = $565;
            
            {ESLVal _v188 = $566;
            
            return select(p,_v188);
          }
          }
      }
      }
      }
    else if(_v154.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(4588,4702)").add(ESLVal.list(_v154)));
    }
  }
  public static ESLVal select = new ESLVal(new Function(new ESLVal("select"),null) { public ESLVal apply(ESLVal... args) { return select(args[0],args[1]); }});
  public static ESLVal reject(ESLVal p,ESLVal l) {
    
    {ESLVal _v155 = l;
      
      if(_v155.isCons())
      {ESLVal $567 = _v155.head();
        ESLVal $568 = _v155.tail();
        
        {ESLVal h = $567;
        
        {ESLVal t = $568;
        
        if(p.apply(h).boolVal)
        return reject(p,t);
        else
          {ESLVal _v185 = $567;
            
            {ESLVal _v186 = $568;
            
            return reject(p,_v186).cons(_v185);
          }
          }
      }
      }
      }
    else if(_v155.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(4746,4860)").add(ESLVal.list(_v155)));
    }
  }
  public static ESLVal reject = new ESLVal(new Function(new ESLVal("reject"),null) { public ESLVal apply(ESLVal... args) { return reject(args[0],args[1]); }});
  public static ESLVal lastSemantics(ESLVal l) {
    
    {ESLVal _v156 = l;
      
      if(_v156.isCons())
      {ESLVal $569 = _v156.head();
        ESLVal $570 = _v156.tail();
        
        if($570.isCons())
        {ESLVal $571 = $570.head();
          ESLVal $572 = $570.tail();
          
          {ESLVal h = $569;
          
          {ESLVal _v183 = $570;
          
          return last.apply(_v183);
        }
        }
        }
      else if($570.isNil())
        {ESLVal x = $569;
          
          return x;
        }
      else {ESLVal h = $569;
          
          {ESLVal _v184 = $570;
          
          return last.apply(_v184);
        }
        }
      }
    else if(_v156.isNil())
      return error(new ESLVal("cannot find last element of emply list"));
    else return error(new ESLVal("case error at Pos(4987,5117)").add(ESLVal.list(_v156)));
    }
  }
  public static ESLVal lastSemantics = new ESLVal(new Function(new ESLVal("lastSemantics"),null) { public ESLVal apply(ESLVal... args) { return lastSemantics(args[0]); }});
  public static ESLVal butlastSemantics(ESLVal l) {
    
    {ESLVal _v157 = l;
      
      if(_v157.isCons())
      {ESLVal $573 = _v157.head();
        ESLVal $574 = _v157.tail();
        
        if($574.isCons())
        {ESLVal $575 = $574.head();
          ESLVal $576 = $574.tail();
          
          {ESLVal h = $573;
          
          {ESLVal _v181 = $574;
          
          return butlast.apply(_v181).cons(h);
        }
        }
        }
      else if($574.isNil())
        {ESLVal x = $573;
          
          return $nil;
        }
      else {ESLVal h = $573;
          
          {ESLVal _v182 = $574;
          
          return butlast.apply(_v182).cons(h);
        }
        }
      }
    else if(_v157.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(5260,5349)").add(ESLVal.list(_v157)));
    }
  }
  public static ESLVal butlastSemantics = new ESLVal(new Function(new ESLVal("butlastSemantics"),null) { public ESLVal apply(ESLVal... args) { return butlastSemantics(args[0]); }});
  public static ESLVal occurrences(ESLVal x,ESLVal l) {
    
    {ESLVal _v158 = l;
      
      if(_v158.isCons())
      {ESLVal $577 = _v158.head();
        ESLVal $578 = _v158.tail();
        
        {ESLVal h = $577;
        
        {ESLVal t = $578;
        
        if(h.eql(x).boolVal)
        return $one.add(occurrences(x,t));
        else
          {ESLVal _v179 = $577;
            
            {ESLVal _v180 = $578;
            
            return occurrences(x,_v180);
          }
          }
      }
      }
      }
    else if(_v158.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(5388,5509)").add(ESLVal.list(_v158)));
    }
  }
  public static ESLVal occurrences = new ESLVal(new Function(new ESLVal("occurrences"),null) { public ESLVal apply(ESLVal... args) { return occurrences(args[0],args[1]); }});
  public static ESLVal filter(ESLVal pred,ESLVal l) {
    
    {ESLVal _v159 = l;
      
      if(_v159.isCons())
      {ESLVal $579 = _v159.head();
        ESLVal $580 = _v159.tail();
        
        {ESLVal h = $579;
        
        {ESLVal t = $580;
        
        if(pred.apply(h).boolVal)
        return filter(pred,t).cons(h);
        else
          return filter(pred,t);
      }
      }
      }
    else if(_v159.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(5557,5688)").add(ESLVal.list(_v159)));
    }
  }
  public static ESLVal filter = new ESLVal(new Function(new ESLVal("filter"),null) { public ESLVal apply(ESLVal... args) { return filter(args[0],args[1]); }});
  public static ESLVal foldr(ESLVal map,ESLVal op,ESLVal empty,ESLVal list) {
    
    {ESLVal _v160 = list;
      
      if(_v160.isCons())
      {ESLVal $581 = _v160.head();
        ESLVal $582 = _v160.tail();
        
        {ESLVal h = $581;
        
        {ESLVal t = $582;
        
        return op.apply(map.apply(h),foldr(map,op,empty,t));
      }
      }
      }
    else if(_v160.isNil())
      return empty;
    else return error(new ESLVal("case error at Pos(5755,5845)").add(ESLVal.list(_v160)));
    }
  }
  public static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),null) { public ESLVal apply(ESLVal... args) { return foldr(args[0],args[1],args[2],args[3]); }});
  public static ESLVal sum(ESLVal list) {
    
    return foldr(id,new ESLVal(new Function(new ESLVal("fun334"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal x = $args[0];
      ESLVal y = $args[1];
      return x.add(y);
        }
      }),$zero,list);
  }
  public static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),null) { public ESLVal apply(ESLVal... args) { return sum(args[0]); }});
  public static ESLVal removeDups(ESLVal list) {
    
    {ESLVal _v161 = list;
      
      if(_v161.isCons())
      {ESLVal $583 = _v161.head();
        ESLVal $584 = _v161.tail();
        
        {ESLVal x = $583;
        
        {ESLVal l = $584;
        
        return removeDups(remove.apply(x,l)).cons(x);
      }
      }
      }
    else if(_v161.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6005,6086)").add(ESLVal.list(_v161)));
    }
  }
  public static ESLVal removeDups = new ESLVal(new Function(new ESLVal("removeDups"),null) { public ESLVal apply(ESLVal... args) { return removeDups(args[0]); }});
  public static ESLVal prefixes(ESLVal l) {
    
    { LetRec letrec = new LetRec() {
      ESLVal pre = new ESLVal(new Function(new ESLVal("pre"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal prefixes = $args[0];
        ESLVal rest = $args[1];
        {print.apply(rest);
            if(rest.eql($nil).boolVal)
              return prefixes;
              else
                return pre.apply(prefixes.add(ESLVal.list(last.apply(prefixes).add(ESLVal.list(head.apply(rest))))),tail.apply(rest));}
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
    
      return pre.apply(ESLVal.list($nil),l);}
    
  }
  public static ESLVal prefixes = new ESLVal(new Function(new ESLVal("prefixes"),null) { public ESLVal apply(ESLVal... args) { return prefixes(args[0]); }});
  public static ESLVal takeWhile(ESLVal p,ESLVal l) {
    
    {ESLVal _v162 = l;
      
      if(_v162.isCons())
      {ESLVal $585 = _v162.head();
        ESLVal $586 = _v162.tail();
        
        {ESLVal t = $585;
        
        {ESLVal _v176 = $586;
        
        if(p.apply(t).boolVal)
        return takeWhile(p,_v176).cons(t);
        else
          {ESLVal _v177 = $585;
            
            {ESLVal _v178 = $586;
            
            return $nil;
          }
          }
      }
      }
      }
    else if(_v162.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(6368,6476)").add(ESLVal.list(_v162)));
    }
  }
  public static ESLVal takeWhile = new ESLVal(new Function(new ESLVal("takeWhile"),null) { public ESLVal apply(ESLVal... args) { return takeWhile(args[0],args[1]); }});
  public static ESLVal dropWhile(ESLVal p,ESLVal l) {
    
    {ESLVal _v163 = l;
      
      if(_v163.isCons())
      {ESLVal $587 = _v163.head();
        ESLVal $588 = _v163.tail();
        
        {ESLVal t = $587;
        
        {ESLVal _v173 = $588;
        
        if(p.apply(t).boolVal)
        return dropWhile(p,_v173);
        else
          {ESLVal _v174 = _v163;
            
            return _v174;
          }
      }
      }
      }
    else if(_v163.isNil())
      return $nil;
    else {ESLVal _v175 = _v163;
        
        return _v175;
      }
    }
  }
  public static ESLVal dropWhile = new ESLVal(new Function(new ESLVal("dropWhile"),null) { public ESLVal apply(ESLVal... args) { return dropWhile(args[0],args[1]); }});
  public static ESLVal removeAll(ESLVal removables,ESLVal l) {
    
    {ESLVal _v164 = removables;
      
      if(_v164.isCons())
      {ESLVal $589 = _v164.head();
        ESLVal $590 = _v164.tail();
        
        {ESLVal t = $589;
        
        {ESLVal r = $590;
        
        return removeAll(r,remove.apply(t,l));
      }
      }
      }
    else if(_v164.isNil())
      return l;
    else return error(new ESLVal("case error at Pos(6669,6757)").add(ESLVal.list(_v164)));
    }
  }
  public static ESLVal removeAll = new ESLVal(new Function(new ESLVal("removeAll"),null) { public ESLVal apply(ESLVal... args) { return removeAll(args[0],args[1]); }});
public static void main(String[] args) {
  }
}