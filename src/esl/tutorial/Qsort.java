package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Qsort {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal nums = new SerializableFunction<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal n = $l0.head();
        $l0 = $l0.tail();
        $v.add(random.apply(new ESLVal(2000)));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(2000)));
  private static ESLVal qmain = new ESLVal(new Function(new ESLVal("qmain"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qmain")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v312 = $m;
            
            switch(_v312.termName) {
            case "Sorted": {ESLVal $353 = _v312.termRef(0);
              ESLVal $352 = _v312.termRef(1);
              
              switch($352.termName) {
              case "Final": {
                {ESLVal _v319 = $353;
                
                {print.apply(_v319);
              return stopAll.apply();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v312)));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v312)));
          }
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
            return newActor(qsorter,new ESLVal(new Actor()),getSelf(),l,new ESLVal("Final",new ESLVal[]{}));
          }
        });
    }
  });
  private static ESLVal qwaiter = new ESLVal(new Function(new ESLVal("qwaiter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal parent = $args[0];
  ESLVal n = $args[1];
  ESLVal dir = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qwaiter")) {
          ESLVal check() {
    
    if(left.neql($null).and(right.neql($null)).boolVal)
      return Lib.send(parent,"Sorted",left.add(ESLVal.list(n).add(right)),dir);
      else
        return $null;
  }
  ESLVal check = new ESLVal(new Function(new ESLVal("check"),null) { public ESLVal apply(ESLVal... args) { return check(); }});
ESLVal left = $null;
          ESLVal right = $null;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v313 = $m;
            
            switch(_v313.termName) {
            case "Sorted": {ESLVal $355 = _v313.termRef(0);
              ESLVal $354 = _v313.termRef(1);
              
              switch($354.termName) {
              case "Left": {
                {ESLVal l = $355;
                
                {left = l;
              return check();}
              }
              }
            case "Right": {
                {ESLVal l = $355;
                
                {right = l;
              return check();}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v313)));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v313)));
          }
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
            return $null;
          }
        });
    }
  });
  private static ESLVal qsorter = new ESLVal(new Function(new ESLVal("qsorter"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal parent = $args[0];
  ESLVal l = $args[1];
  ESLVal dir = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("qsorter")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v315 = $m;
            
            switch(_v315.termName) {
            case "Sorted": {ESLVal $359 = _v315.termRef(0);
              ESLVal $358 = _v315.termRef(1);
              
              {ESLVal _v318 = $359;
              
              {ESLVal d = $358;
              
              return error(new ESLVal("error!"));
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v315)));
          }
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
                {ESLVal _v314 = l;
                  
                  if(_v314.isCons())
                  {ESLVal $356 = _v314.head();
                    ESLVal $357 = _v314.tail();
                    
                    {ESLVal x = $356;
                    
                    {ESLVal _v317 = $357;
                    
                    {newActor(qsorter,new ESLVal(new Actor()),getSelf(),new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal n = $l0.head();
                        $l0 = $l0.tail();
                        if(n.less(x).boolVal) {$v.add(n);
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(_v317),new ESLVal("Left",new ESLVal[]{}));
                  newActor(qsorter,new ESLVal(new Actor()),getSelf(),new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal n = $l0.head();
                        $l0 = $l0.tail();
                        if(n.gre(x).boolVal) {$v.add(n);
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(_v317),new ESLVal("Right",new ESLVal[]{}));
                  become(qwaiter,getSelf(),parent,x,dir);
                  return $null;}
                  }
                  }
                  }
                else if(_v314.isNil())
                  return Lib.send(parent,"Sorted",l,dir);
                else return error(new ESLVal("case error at Pos(1385,2194)").add(ESLVal.list(_v314)));
                }
              }}.get();
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v316 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v316)));
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
            return newActor(qmain,new ESLVal(new Actor()),nums);
          }
        });
    }
  });
private static ESLVal qsort(ESLVal l) {
    
    {ESLVal _v310 = l;
      
      if(_v310.isCons())
      {ESLVal $348 = _v310.head();
        ESLVal $349 = _v310.tail();
        
        {ESLVal x = $348;
        
        {ESLVal _v321 = $349;
        
        return qsort(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              if(n.less(x).boolVal) {$v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v321)).add(ESLVal.list(x).add(qsort(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              if(n.gre(x).boolVal) {$v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v321))));
      }
      }
      }
    else if(_v310.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2449,2594)").add(ESLVal.list(_v310)));
    }
  }
  private static ESLVal qsort = new ESLVal(new Function(new ESLVal("qsort"),null) { public ESLVal apply(ESLVal... args) { return qsort(args[0]); }});
  private static ESLVal psort(ESLVal l) {
    
    {ESLVal _v311 = l;
      
      if(_v311.isCons())
      {ESLVal $350 = _v311.head();
        ESLVal $351 = _v311.tail();
        
        {ESLVal x = $350;
        
        {ESLVal _v320 = $351;
        
        {ESLVal[] $p = plet(new SerializableSupplier[]{new SerializableSupplier<ESLVal>() { public ESLVal get() { return psort(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              if(n.less(x).boolVal) {$v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v320)); }},new SerializableSupplier<ESLVal>() { public ESLVal get() { return psort(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal n = $l0.head();
              $l0 = $l0.tail();
              if(n.gre(x).boolVal) {$v.add(n);
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v320)); }}});
        ESLVal left= $p[0];
        ESLVal right= $p[1];
        
        return left.add(ESLVal.list(x).add(right));
      }
      }
      }
      }
    else if(_v311.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(2652,2858)").add(ESLVal.list(_v311)));
    }
  }
  private static ESLVal psort = new ESLVal(new Function(new ESLVal("psort"),null) { public ESLVal apply(ESLVal... args) { return psort(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}