package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Predator {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal board = $nil;
  private static ESLVal messages = $nil;
  private static ESLVal stop = $false;
  private static ESLVal predator = new ESLVal(new Function(new ESLVal("predator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal[] x = new ESLVal[]{$args[1]};
  ESLVal[] y = new ESLVal[]{$args[2]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("predator")) {
          ESLVal getX() {
    
    return x[0];
  }
  ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),null) { public ESLVal apply(ESLVal... args) { return getX(); }});
  ESLVal getY() {
    
    return y[0];
  }
  ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),null) { public ESLVal apply(ESLVal... args) { return getY(); }});
  ESLVal getId() {
    
    return id;
  }
  ESLVal getId = new ESLVal(new Function(new ESLVal("getId"),null) { public ESLVal apply(ESLVal... args) { return getId(); }});
  ESLVal at(ESLVal px,ESLVal py) {
    
    return px.eql(x[0]).and(py.eql(y[0]));
  }
  ESLVal at = new ESLVal(new Function(new ESLVal("at"),null) { public ESLVal apply(ESLVal... args) { return at(args[0],args[1]); }});
  ESLVal move(ESLVal dx,ESLVal dy) {
    
    if(legalPredatorPos(x[0].add(dx),y[0].add(dy)).boolVal)
      {x[0] = x[0].add(dx);
      y[0] = y[0].add(dy);
      {messages = messages.add(ESLVal.list(new ESLVal("MovePredator",id,x[0],y[0])));
      return $null;}}
      else
        return $null;
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(args[0],args[1]); }});

          public ESLVal handle(ESLVal $m) {{ESLVal _v273 = $m;
            
            switch(_v273.termName) {
            case "Move": {
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                if(turn.eql(id).boolVal)
                  {turn = turn.add($one).mod(numOfPredators.add($one));
                  {ESLVal dx = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                        if(thePrey.ref("getX").apply().gre(x[0]).boolVal)
                          return $one;
                          else
                            if(thePrey.ref("getX").apply().less(x[0]).boolVal)
                              return $zero.sub($one);
                              else
                                return $zero;
                      }}.get();
                    ESLVal dy = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                        if(thePrey.ref("getY").apply().gre(y[0]).boolVal)
                          return $one;
                          else
                            if(thePrey.ref("getY").apply().less(y[0]).boolVal)
                              return $zero.sub($one);
                              else
                                return $zero;
                      }}.get();
                    
                    if(dy.neql($zero).and(legalPredatorPos(x[0],y[0].add(dy))).boolVal)
                    return move($zero,dy);
                    else
                      if(dx.neql($zero).and(legalPredatorPos(x[0].add(dx),y[0])).boolVal)
                        return move(dx,$zero);
                        else
                          return probably(new ESLVal(50),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                return move($zero,$one.sub(random.apply(new ESLVal(3))));
                              }
                            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                              public ESLVal apply(ESLVal... $args) {
                                return move($one.sub(random.apply(new ESLVal(3))),$zero);
                              }
                            }));
                  }}
                  else
                    return $null;
              }}.get();
                }},messages);
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v273)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "at": return at;
              case "getId": return getId;
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
  private static ESLVal prey = new ESLVal(new Function(new ESLVal("prey"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] x = new ESLVal[]{$args[0]};
  ESLVal[] y = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("prey")) {
          ESLVal getX() {
    
    return x[0];
  }
  ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),null) { public ESLVal apply(ESLVal... args) { return getX(); }});
  ESLVal getY() {
    
    return y[0];
  }
  ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),null) { public ESLVal apply(ESLVal... args) { return getY(); }});
  ESLVal at(ESLVal px,ESLVal py) {
    
    return px.eql(x[0]).and(py.eql(y[0]));
  }
  ESLVal at = new ESLVal(new Function(new ESLVal("at"),null) { public ESLVal apply(ESLVal... args) { return at(args[0],args[1]); }});
  ESLVal dir(ESLVal n) {
    
    if(n.less($zero).boolVal)
      return new ESLVal(-1);
      else
        return $one;
  }
  ESLVal dir = new ESLVal(new Function(new ESLVal("dir"),null) { public ESLVal apply(ESLVal... args) { return dir(args[0]); }});
  ESLVal move(ESLVal dx,ESLVal dy) {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(legalPreyPos(x[0].add(dx),y[0].add(dy)).boolVal)
          {x[0] = x[0].add(dx);
          y[0] = y[0].add(dy);
          print.apply(new ESLVal("prey moved to ").add(x[0].add(new ESLVal(" ").add(y[0]))));
          {messages = messages.add(ESLVal.list(new ESLVal("MovePrey",x[0],y[0])));
          return $null;}}
          else
            return $null;
      }}.get();
        }},messages);
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(args[0],args[1]); }});
  ESLVal predatorWins() {
    
    {print.apply(new ESLVal("predator wins!"));
    {stop = $true;
    return $null;}}
  }
  ESLVal predatorWins = new ESLVal(new Function(new ESLVal("predatorWins"),null) { public ESLVal apply(ESLVal... args) { return predatorWins(); }});
  ESLVal cannotMove() {
    
    return legalPreyPos(x[0].sub($one),y[0].sub($one)).not().and(legalPreyPos(x[0].sub($one),y[0]).not().and(legalPreyPos(x[0].add($one),y[0]).not().and(legalPreyPos(x[0],y[0].sub($one)).not().and(legalPreyPos(x[0],y[0].add($one)).not().and(legalPreyPos(x[0].add($one),y[0].add($one)).not())))));
  }
  ESLVal cannotMove = new ESLVal(new Function(new ESLVal("cannotMove"),null) { public ESLVal apply(ESLVal... args) { return cannotMove(); }});
  ESLVal changeDir() {
    
    if(legalPreyPos(x[0].sub($one),y[0].sub($one)).boolVal)
      {dirX = $zero.sub($one);
      {dirY = $zero.sub($one);
      return $null;}}
      else
        if(legalPreyPos(x[0].sub($one),y[0]).boolVal)
          {dirX = $zero.sub($one);
          {dirY = $zero;
          return $null;}}
          else
            if(legalPreyPos(x[0],y[0].sub($one)).boolVal)
              {dirX = $zero;
              {dirY = $zero.sub($one);
              return $null;}}
              else
                if(legalPreyPos(x[0].add($one),y[0]).boolVal)
                  {dirX = $one;
                  {dirY = $zero;
                  return $null;}}
                  else
                    if(legalPreyPos(x[0],y[0].add($one)).boolVal)
                      {dirX = $zero;
                      {dirY = $one;
                      return $null;}}
                      else
                        if(legalPreyPos(x[0].add($one),y[0].add($one)).boolVal)
                          {dirX = $one;
                          {dirY = $one;
                          return $null;}}
                          else
                            return $null;
  }
  ESLVal changeDir = new ESLVal(new Function(new ESLVal("changeDir"),null) { public ESLVal apply(ESLVal... args) { return changeDir(); }});
ESLVal dirX = $one.sub(random.apply(new ESLVal(3)));
          ESLVal dirY = $one.sub(random.apply(new ESLVal(3)));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v274 = $m;
            
            switch(_v274.termName) {
            case "Move": {
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                if(turn.eql(numOfPredators).boolVal)
                  {turn = turn.add($one).mod(numOfPredators.add($one));
                  if(cannotMove().boolVal)
                    return predatorWins();
                    else
                      if(legalPreyPos(x[0].add(dirX),y[0].add(dirY)).boolVal)
                        return move(dirX,dirY);
                        else
                          return changeDir();}
                  else
                    return $null;
              }}.get();
                }},messages);
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v274)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "at": return at;
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
  private static ESLVal size = new ESLVal(60);
  private static ESLVal width = new ESLVal(10);
  private static ESLVal height = new ESLVal(10);
  private static ESLVal numOfPredators = new ESLVal(3);
  private static ESLVal numOfRocks = random.apply(new ESLVal(30)).add(new ESLVal(5));
  private static ESLVal points = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
    { LetRec letrec = new LetRec() {
      ESLVal generate = new ESLVal(new Function(new ESLVal("generate"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal ps = $args[0];
        ESLVal n = $args[1];
        if(n.eql($zero).boolVal)
              return $nil;
              else
                {ESLVal x = random.apply(width);
                  ESLVal y = random.apply(height);
                  
                  if(member.apply(new ESLVal("Point",x,y),ps).boolVal)
                  return generate.apply(ps,n);
                  else
                    return generate.apply(ps.cons(new ESLVal("Point",x,y)),n.sub($one)).cons(new ESLVal("Point",x,y));
                }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "generate": return generate;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal generate = letrec.get("generate");
    
      return generate.apply($nil,numOfPredators.add($one.add(numOfRocks)));}
    
  }}.get();
  private static ESLVal limit = new ESLVal(10000);
  private static ESLVal turn = $zero;
  private static ESLVal rocks = drop(points,numOfPredators.add($one));
  private static ESLVal predators = new SerializableFunction<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal p = $l0.head();
        $l0 = $l0.tail();
        $v.add(newActor(predator,new ESLVal(new Actor()),p,pointX(nth.apply(points,p)),pointY(nth.apply(points,p))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(numOfPredators));
  private static ESLVal thePrey = newActor(prey,new ESLVal(new Actor()),pointX(nth.apply(points,numOfPredators)),pointY(nth.apply(points,numOfPredators)));
  private static ESLVal emptyBoard = new SerializableFunction<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal y = $l0.head();
        $l0 = $l0.tail();
        $v.add(new SerializableFunction<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal x = $l0.head();
        $l0 = $l0.tail();
        $v.add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
    if(onRock(x,y).boolVal)
      return new ESLVal("Rock",new ESLVal[]{});
      else
        return new ESLVal("EmptyLoc",new ESLVal[]{});
  }}.get());
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(width)));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(height));
  private static ESLVal space = new ESLVal("TreeNode",new ESLVal("Rectangle",$zero,$zero,size,size,new ESLVal("")));
  private static ESLVal rockIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/rock.png")));
  private static ESLVal predIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/wolf.jpg")));
  private static ESLVal preyIcon = new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,size,size,new ESLVal("images/predator/sheep.jpg")));
  private static ESLVal movePreyIntoPosition = new ESLVal("MovePrey",thePrey.ref("getX").apply(),thePrey.ref("getY").apply());
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v276 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v276)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(stop.not().and(n.less(limit)).boolVal)
            {{
              ESLVal _v275 = predators;
              while(_v275.isCons()) {
                ESLVal p = _v275.headVal;
                Lib.send(p,"Move");
                _v275 = _v275.tailVal;}
            }
            Lib.send(thePrey,"Move");}
            else
              {ESLVal _v277 = $t;
                
                if($true.boolVal)
                {ESLVal film = omega(messages,messageId,mapBoth,mergeDisplays,mapBoard(emptyBoard));
                  
                  {print.apply(new ESLVal("create filmstrip..."));
                Lib.send(edb,"Filmstrip",new ESLVal("predator"),film);
                stopAll.apply();}
                }
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {messages = ESLVal.list(movePreyIntoPosition).add(map(movePredatorIntoPosition,predators));
                return $null;}
              }}.get();
          }
        });
    }
  });
private static ESLVal foldr(ESLVal map,ESLVal op,ESLVal empty,ESLVal list) {
    
    {ESLVal _v259 = list;
      
      if(_v259.isCons())
      {ESLVal $302 = _v259.head();
        ESLVal $303 = _v259.tail();
        
        {ESLVal h = $302;
        
        {ESLVal t = $303;
        
        return op.apply(map.apply(h),foldr(map,op,empty,t));
      }
      }
      }
    else if(_v259.isNil())
      return empty;
    else return error(new ESLVal("case error at Pos(792,882)").add(ESLVal.list(_v259)));
    }
  }
  private static ESLVal foldr = new ESLVal(new Function(new ESLVal("foldr"),null) { public ESLVal apply(ESLVal... args) { return foldr(args[0],args[1],args[2],args[3]); }});
  private static ESLVal abs(ESLVal n) {
    
    if(n.less($zero).boolVal)
      return $zero.sub(n);
      else
        return n;
  }
  private static ESLVal abs = new ESLVal(new Function(new ESLVal("abs"),null) { public ESLVal apply(ESLVal... args) { return abs(args[0]); }});
  private static ESLVal pointX(ESLVal p) {
    
    {ESLVal _v260 = p;
      
      switch(_v260.termName) {
      case "Point": {ESLVal $305 = _v260.termRef(0);
        ESLVal $304 = _v260.termRef(1);
        
        {ESLVal x = $305;
        
        {ESLVal y = $304;
        
        return x;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(5588,5615)").add(ESLVal.list(_v260)));
    }
    }
  }
  private static ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),null) { public ESLVal apply(ESLVal... args) { return pointX(args[0]); }});
  private static ESLVal pointY(ESLVal p) {
    
    {ESLVal _v261 = p;
      
      switch(_v261.termName) {
      case "Point": {ESLVal $307 = _v261.termRef(0);
        ESLVal $306 = _v261.termRef(1);
        
        {ESLVal x = $307;
        
        {ESLVal y = $306;
        
        return y;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(5640,5667)").add(ESLVal.list(_v261)));
    }
    }
  }
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),null) { public ESLVal apply(ESLVal... args) { return pointY(args[0]); }});
  private static ESLVal onBoard(ESLVal x,ESLVal y) {
    
    return x.greql($zero).and(x.less(width).and(y.greql($zero).and(y.less(height))));
  }
  private static ESLVal onBoard = new ESLVal(new Function(new ESLVal("onBoard"),null) { public ESLVal apply(ESLVal... args) { return onBoard(args[0],args[1]); }});
  private static ESLVal onRock(ESLVal x,ESLVal y) {
    
    return member.apply(new ESLVal("Point",x,y),rocks);
  }
  private static ESLVal onRock = new ESLVal(new Function(new ESLVal("onRock"),null) { public ESLVal apply(ESLVal... args) { return onRock(args[0],args[1]); }});
  private static ESLVal legalPreyPos(ESLVal x,ESLVal y) {
    
    return onRock(x,y).not().and(onBoard(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun75"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal p = $args[0];
      return p.ref("at").apply(x,y);
        }
      }),predators).not()));
  }
  private static ESLVal legalPreyPos = new ESLVal(new Function(new ESLVal("legalPreyPos"),null) { public ESLVal apply(ESLVal... args) { return legalPreyPos(args[0],args[1]); }});
  private static ESLVal legalPredatorPos(ESLVal x,ESLVal y) {
    
    return onRock(x,y).not().and(onBoard(x,y).and(exists.apply(new ESLVal(new Function(new ESLVal("fun76"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal p = $args[0];
      return p.ref("at").apply(x,y);
        }
      }),predators).not().and(thePrey.ref("at").apply(x,y).not())));
  }
  private static ESLVal legalPredatorPos = new ESLVal(new Function(new ESLVal("legalPredatorPos"),null) { public ESLVal apply(ESLVal... args) { return legalPredatorPos(args[0],args[1]); }});
  private static ESLVal mapMessage(ESLVal m) {
    
    {ESLVal _v262 = m;
      
      switch(_v262.termName) {
      case "MovePredator": {ESLVal $312 = _v262.termRef(0);
        ESLVal $311 = _v262.termRef(1);
        ESLVal $310 = _v262.termRef(2);
        
        {ESLVal i = $312;
        
        {ESLVal x0 = $311;
        
        {ESLVal y0 = $310;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal y = $l0.head();
              $l0 = $l0.tail();
              $v.add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal x = $l0.head();
              $l0 = $l0.tail();
              $v.add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(x.eql(x0).and(y.eql(y0)).boolVal)
            return new ESLVal("PredLoc",new ESLVal[]{});
            else
              if(onRock(x,y).boolVal)
                return new ESLVal("Rock",new ESLVal[]{});
                else
                  return new ESLVal("EmptyLoc",new ESLVal[]{});
        }}.get());
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(width)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(height));
      }
      }
      }
      }
    case "MovePrey": {ESLVal $309 = _v262.termRef(0);
        ESLVal $308 = _v262.termRef(1);
        
        {ESLVal x0 = $309;
        
        {ESLVal y0 = $308;
        
        return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal y = $l0.head();
              $l0 = $l0.tail();
              $v.add(new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal x = $l0.head();
              $l0 = $l0.tail();
              $v.add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(x.eql(x0).and(y.eql(y0)).boolVal)
            return new ESLVal("PreyLoc",new ESLVal[]{});
            else
              if(onRock(x,y).boolVal)
                return new ESLVal("Rock",new ESLVal[]{});
                else
                  return new ESLVal("EmptyLoc",new ESLVal[]{});
        }}.get());
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(width)));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(height));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6518,6831)").add(ESLVal.list(_v262)));
    }
    }
  }
  private static ESLVal mapMessage = new ESLVal(new Function(new ESLVal("mapMessage"),null) { public ESLVal apply(ESLVal... args) { return mapMessage(args[0]); }});
  private static ESLVal mergeLocations(ESLVal l1,ESLVal l2) {
    
    {ESLVal _v263 = l1;
      ESLVal _v264 = l2;
      
      switch(_v263.termName) {
      case "EmptyLoc": {
        switch(_v264.termName) {
        case "EmptyLoc": {
          return new ESLVal("EmptyLoc",new ESLVal[]{});
        }
        default: {ESLVal _v308 = _v264;
          
          return _v308;
        }
      }
      }
    case "PredLoc": {
        switch(_v264.termName) {
        case "PredLoc": {
          return new ESLVal("PredLoc",new ESLVal[]{});
        }
        default: switch(_v264.termName) {
          case "EmptyLoc": {
            {ESLVal _v307 = _v263;
            
            return _v307;
          }
          }
          default: return error(new ESLVal("case error at Pos(6891,7099)").add(ESLVal.list(_v263,_v264)));
        }
      }
      }
    case "PreyLoc": {
        switch(_v264.termName) {
        case "PreyLoc": {
          return new ESLVal("PreyLoc",new ESLVal[]{});
        }
        default: switch(_v264.termName) {
          case "EmptyLoc": {
            {ESLVal _v306 = _v263;
            
            return _v306;
          }
          }
          default: return error(new ESLVal("case error at Pos(6891,7099)").add(ESLVal.list(_v263,_v264)));
        }
      }
      }
    case "Rock": {
        switch(_v264.termName) {
        case "Rock": {
          return new ESLVal("Rock",new ESLVal[]{});
        }
        default: switch(_v264.termName) {
          case "EmptyLoc": {
            {ESLVal _v305 = _v263;
            
            return _v305;
          }
          }
          default: return error(new ESLVal("case error at Pos(6891,7099)").add(ESLVal.list(_v263,_v264)));
        }
      }
      }
      default: switch(_v264.termName) {
        case "EmptyLoc": {
          {ESLVal _v309 = _v263;
          
          return _v309;
        }
        }
        default: return error(new ESLVal("case error at Pos(6891,7099)").add(ESLVal.list(_v263,_v264)));
      }
    }
    }
  }
  private static ESLVal mergeLocations = new ESLVal(new Function(new ESLVal("mergeLocations"),null) { public ESLVal apply(ESLVal... args) { return mergeLocations(args[0],args[1]); }});
  private static ESLVal mergeBoards(ESLVal b1,ESLVal b2) {
    
    return new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal y = $l0.head();
            $l0 = $l0.tail();
            $v.add(new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal x = $l0.head();
            $l0 = $l0.tail();
            $v.add(mergeLocations(nth.apply(nth.apply(b1,y),x),nth.apply(nth.apply(b2,y),x)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($zero.to(width)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($zero.to(height));
  }
  private static ESLVal mergeBoards = new ESLVal(new Function(new ESLVal("mergeBoards"),null) { public ESLVal apply(ESLVal... args) { return mergeBoards(args[0],args[1]); }});
  private static ESLVal mergeDisplays(ESLVal d1,ESLVal d2) {
    
    {ESLVal _v265 = d1;
      ESLVal _v266 = d2;
      
      switch(_v265.termName) {
      case "Tree": {ESLVal $315 = _v265.termRef(0);
        ESLVal $314 = _v265.termRef(1);
        ESLVal $313 = _v265.termRef(2);
        
        switch(_v266.termName) {
        case "Tree": {ESLVal $318 = _v266.termRef(0);
          ESLVal $317 = _v266.termRef(1);
          ESLVal $316 = _v266.termRef(2);
          
          {ESLVal w1 = $315;
          
          {ESLVal h1 = $314;
          
          {ESLVal t1 = $313;
          
          {ESLVal w2 = $318;
          
          {ESLVal h2 = $317;
          
          {ESLVal t2 = $316;
          
          return new ESLVal("Tree",w1,h1,mergeTrees(t1,t2));
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7369,7499)").add(ESLVal.list(_v265,_v266)));
      }
      }
      default: return error(new ESLVal("case error at Pos(7369,7499)").add(ESLVal.list(_v265,_v266)));
    }
    }
  }
  private static ESLVal mergeDisplays = new ESLVal(new Function(new ESLVal("mergeDisplays"),null) { public ESLVal apply(ESLVal... args) { return mergeDisplays(args[0],args[1]); }});
  private static ESLVal getBoard(ESLVal ms) {
    
    return foldr(mapMessage,mergeBoards,$nil,ms);
  }
  private static ESLVal getBoard = new ESLVal(new Function(new ESLVal("getBoard"),null) { public ESLVal apply(ESLVal... args) { return getBoard(args[0]); }});
  private static ESLVal hist(ESLVal id,ESLVal h) {
    
    {ESLVal _v267 = h;
      
      if(_v267.isCons())
      {ESLVal $319 = _v267.head();
        ESLVal $320 = _v267.tail();
        
        {ESLVal _v303 = _v267;
        
        {ESLVal m = last.apply(_v303);
        ESLVal hh = butlast.apply(_v303);
        
        return hist(id,hh).add(ESLVal.list(combine(id,$nil,hh,m)));
      }
      }
      }
    else if(_v267.isNil())
      return $nil;
    else {ESLVal _v304 = _v267;
        
        {ESLVal m = last.apply(_v304);
        ESLVal hh = butlast.apply(_v304);
        
        return hist(id,hh).add(ESLVal.list(combine(id,$nil,hh,m)));
      }
      }
    }
  }
  private static ESLVal hist = new ESLVal(new Function(new ESLVal("hist"),null) { public ESLVal apply(ESLVal... args) { return hist(args[0],args[1]); }});
  private static ESLVal combine(ESLVal id,ESLVal ids,ESLVal h,ESLVal m) {
    
    {ESLVal _v268 = h;
      
      if(_v268.isCons())
      {ESLVal $321 = _v268.head();
        ESLVal $322 = _v268.tail();
        
        {ESLVal _v301 = _v268;
        
        {ESLVal mm = last.apply(_v301);
        ESLVal hh = butlast.apply(_v301);
        
        if(member.apply(id.apply(m),ids).boolVal)
        return combine(id,ids,hh,mm);
        else
          return combine(id,ids.add(ESLVal.list(id.apply(m))),hh,mm).add(ESLVal.list(m));
      }
      }
      }
    else if(_v268.isNil())
      if(member.apply(id.apply(m),ids).boolVal)
        return $nil;
        else
          return ESLVal.list(m);
    else {ESLVal _v302 = _v268;
        
        {ESLVal mm = last.apply(_v302);
        ESLVal hh = butlast.apply(_v302);
        
        if(member.apply(id.apply(m),ids).boolVal)
        return combine(id,ids,hh,mm);
        else
          return combine(id,ids.add(ESLVal.list(id.apply(m))),hh,mm).add(ESLVal.list(m));
      }
      }
    }
  }
  private static ESLVal combine = new ESLVal(new Function(new ESLVal("combine"),null) { public ESLVal apply(ESLVal... args) { return combine(args[0],args[1],args[2],args[3]); }});
  private static ESLVal messageId(ESLVal m) {
    
    {ESLVal _v269 = m;
      
      switch(_v269.termName) {
      case "MovePredator": {ESLVal $325 = _v269.termRef(0);
        ESLVal $324 = _v269.termRef(1);
        ESLVal $323 = _v269.termRef(2);
        
        {ESLVal id = $325;
        
        {ESLVal x = $324;
        
        {ESLVal y = $323;
        
        return id;
      }
      }
      }
      }
      default: {ESLVal _v300 = _v269;
        
        return new ESLVal(-1);
      }
    }
    }
  }
  private static ESLVal messageId = new ESLVal(new Function(new ESLVal("messageId"),null) { public ESLVal apply(ESLVal... args) { return messageId(args[0]); }});
  private static ESLVal filmstrip(ESLVal ms) {
    
    {ESLVal h = hist(messageId,ms);
      
      return map(new ESLVal(new Function(new ESLVal("fun77"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal _v299 = $args[0];
      return foldr(mapMessage,mergeBoards,emptyBoard,_v299);
        }
      }),h).cons(emptyBoard);
    }
  }
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),null) { public ESLVal apply(ESLVal... args) { return filmstrip(args[0]); }});
  private static ESLVal mergeTrees(ESLVal d1,ESLVal d2) {
    
    {ESLVal _v270 = d1;
      ESLVal _v271 = d2;
      
      switch(_v270.termName) {
      case "VBox": {ESLVal $345 = _v270.termRef(0);
        ESLVal $344 = _v270.termRef(1);
        
        switch(_v271.termName) {
        case "VBox": {ESLVal $347 = _v271.termRef(0);
          ESLVal $346 = _v271.termRef(1);
          
          {ESLVal p1 = $345;
          
          {ESLVal l1 = $344;
          
          {ESLVal p2 = $347;
          
          {ESLVal l2 = $346;
          
          return new ESLVal("VBox",p1,new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal i = $l0.head();
                $l0 = $l0.tail();
                $v.add(mergeTrees(nth.apply(l1,i),nth.apply(l2,i)));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(length.apply(l1))));
        }
        }
        }
        }
        }
        default: switch(_v271.termName) {
          case "Padding": {ESLVal $332 = _v271.termRef(0);
            
            {ESLVal t = _v270;
            
            {ESLVal p2 = $332;
            
            return t;
          }
          }
          }
        case "TreeNode": {ESLVal $326 = _v271.termRef(0);
            
            switch($326.termName) {
            case "Rectangle": {ESLVal $331 = $326.termRef(0);
              ESLVal $330 = $326.termRef(1);
              ESLVal $329 = $326.termRef(2);
              ESLVal $328 = $326.termRef(3);
              ESLVal $327 = $326.termRef(4);
              
              {ESLVal _v289 = _v270;
              
              {ESLVal w = $331;
              
              {ESLVal h = $330;
              
              {ESLVal s1 = $329;
              
              {ESLVal s2 = $328;
              
              {ESLVal p = $327;
              
              return _v289;
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal _v290 = _v270;
              
              {ESLVal _v291 = _v271;
              
              return _v290;
            }
            }
          }
          }
          default: {ESLVal _v292 = _v270;
            
            {ESLVal _v293 = _v271;
            
            return _v292;
          }
          }
        }
      }
      }
    case "HBox": {ESLVal $341 = _v270.termRef(0);
        ESLVal $340 = _v270.termRef(1);
        
        switch(_v271.termName) {
        case "HBox": {ESLVal $343 = _v271.termRef(0);
          ESLVal $342 = _v271.termRef(1);
          
          {ESLVal p1 = $341;
          
          {ESLVal l1 = $340;
          
          {ESLVal p2 = $343;
          
          {ESLVal l2 = $342;
          
          return new ESLVal("HBox",p1,new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal i = $l0.head();
                $l0 = $l0.tail();
                $v.add(mergeTrees(nth.apply(l1,i),nth.apply(l2,i)));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(length.apply(l1))));
        }
        }
        }
        }
        }
        default: switch(_v271.termName) {
          case "Padding": {ESLVal $332 = _v271.termRef(0);
            
            {ESLVal t = _v270;
            
            {ESLVal p2 = $332;
            
            return t;
          }
          }
          }
        case "TreeNode": {ESLVal $326 = _v271.termRef(0);
            
            switch($326.termName) {
            case "Rectangle": {ESLVal $331 = $326.termRef(0);
              ESLVal $330 = $326.termRef(1);
              ESLVal $329 = $326.termRef(2);
              ESLVal $328 = $326.termRef(3);
              ESLVal $327 = $326.termRef(4);
              
              {ESLVal _v284 = _v270;
              
              {ESLVal w = $331;
              
              {ESLVal h = $330;
              
              {ESLVal s1 = $329;
              
              {ESLVal s2 = $328;
              
              {ESLVal p = $327;
              
              return _v284;
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal _v285 = _v270;
              
              {ESLVal _v286 = _v271;
              
              return _v285;
            }
            }
          }
          }
          default: {ESLVal _v287 = _v270;
            
            {ESLVal _v288 = _v271;
            
            return _v287;
          }
          }
        }
      }
      }
    case "Padding": {ESLVal $339 = _v270.termRef(0);
        
        {ESLVal p1 = $339;
        
        {ESLVal t = _v271;
        
        return t;
      }
      }
      }
    case "TreeNode": {ESLVal $333 = _v270.termRef(0);
        
        switch($333.termName) {
        case "Rectangle": {ESLVal $338 = $333.termRef(0);
          ESLVal $337 = $333.termRef(1);
          ESLVal $336 = $333.termRef(2);
          ESLVal $335 = $333.termRef(3);
          ESLVal $334 = $333.termRef(4);
          
          {ESLVal w = $338;
          
          {ESLVal h = $337;
          
          {ESLVal s1 = $336;
          
          {ESLVal s2 = $335;
          
          {ESLVal p = $334;
          
          {ESLVal _v278 = _v271;
          
          return _v278;
        }
        }
        }
        }
        }
        }
        }
        default: switch(_v271.termName) {
          case "Padding": {ESLVal $332 = _v271.termRef(0);
            
            {ESLVal t = _v270;
            
            {ESLVal p2 = $332;
            
            return t;
          }
          }
          }
        case "TreeNode": {ESLVal $326 = _v271.termRef(0);
            
            switch($326.termName) {
            case "Rectangle": {ESLVal $331 = $326.termRef(0);
              ESLVal $330 = $326.termRef(1);
              ESLVal $329 = $326.termRef(2);
              ESLVal $328 = $326.termRef(3);
              ESLVal $327 = $326.termRef(4);
              
              {ESLVal _v279 = _v270;
              
              {ESLVal w = $331;
              
              {ESLVal h = $330;
              
              {ESLVal s1 = $329;
              
              {ESLVal s2 = $328;
              
              {ESLVal p = $327;
              
              return _v279;
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal _v280 = _v270;
              
              {ESLVal _v281 = _v271;
              
              return _v280;
            }
            }
          }
          }
          default: {ESLVal _v282 = _v270;
            
            {ESLVal _v283 = _v271;
            
            return _v282;
          }
          }
        }
      }
      }
      default: switch(_v271.termName) {
        case "Padding": {ESLVal $332 = _v271.termRef(0);
          
          {ESLVal t = _v270;
          
          {ESLVal p2 = $332;
          
          return t;
        }
        }
        }
      case "TreeNode": {ESLVal $326 = _v271.termRef(0);
          
          switch($326.termName) {
          case "Rectangle": {ESLVal $331 = $326.termRef(0);
            ESLVal $330 = $326.termRef(1);
            ESLVal $329 = $326.termRef(2);
            ESLVal $328 = $326.termRef(3);
            ESLVal $327 = $326.termRef(4);
            
            {ESLVal _v294 = _v270;
            
            {ESLVal w = $331;
            
            {ESLVal h = $330;
            
            {ESLVal s1 = $329;
            
            {ESLVal s2 = $328;
            
            {ESLVal p = $327;
            
            return _v294;
          }
          }
          }
          }
          }
          }
          }
          default: {ESLVal _v295 = _v270;
            
            {ESLVal _v296 = _v271;
            
            return _v295;
          }
          }
        }
        }
        default: {ESLVal _v297 = _v270;
          
          {ESLVal _v298 = _v271;
          
          return _v297;
        }
        }
      }
    }
    }
  }
  private static ESLVal mergeTrees = new ESLVal(new Function(new ESLVal("mergeTrees"),null) { public ESLVal apply(ESLVal... args) { return mergeTrees(args[0],args[1]); }});
  private static ESLVal mapBoard(ESLVal b) {
    
    {ESLVal mapRow = new ESLVal(new Function(new ESLVal("mapRow"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal row = $args[0];
        return new ESLVal("HBox",$nil,new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal l = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {ESLVal _v272 = l;
                  
                  switch(_v272.termName) {
                  case "PredLoc": {
                    return predIcon;
                  }
                case "PreyLoc": {
                    return preyIcon;
                  }
                case "EmptyLoc": {
                    return space;
                  }
                case "Rock": {
                    return rockIcon;
                  }
                  default: return error(new ESLVal("case error at Pos(9549,9637)").add(ESLVal.list(_v272)));
                }
                }
              }}.get());
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(row));
          }
        });
      
      return new ESLVal("Tree",width.mul(size),height.mul(size),new ESLVal("VBox",$nil,new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal y = $l0.head();
            $l0 = $l0.tail();
            $v.add(mapRow.apply(nth.apply(b,y)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($zero.to(height))));
    }
  }
  private static ESLVal mapBoard = new ESLVal(new Function(new ESLVal("mapBoard"),null) { public ESLVal apply(ESLVal... args) { return mapBoard(args[0]); }});
  private static ESLVal omega(ESLVal events,ESLVal id,ESLVal e,ESLVal oplus,ESLVal epsilon) {
    
    {ESLVal states = hist(id,events);
      
      {ESLVal semantics = map(new ESLVal(new Function(new ESLVal("fun78"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal ms = $args[0];
        return foldr(e,oplus,epsilon,ms);
          }
        }),states);
      
      return semantics;
    }
    }
  }
  private static ESLVal omega = new ESLVal(new Function(new ESLVal("omega"),null) { public ESLVal apply(ESLVal... args) { return omega(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal mapBoth(ESLVal m) {
    
    return mapBoard(mapMessage(m));
  }
  private static ESLVal mapBoth = new ESLVal(new Function(new ESLVal("mapBoth"),null) { public ESLVal apply(ESLVal... args) { return mapBoth(args[0]); }});
  private static ESLVal movePredatorIntoPosition(ESLVal p) {
    
    return new ESLVal("MovePredator",p.ref("getId").apply(),p.ref("getX").apply(),p.ref("getY").apply());
  }
  private static ESLVal movePredatorIntoPosition = new ESLVal(new Function(new ESLVal("movePredatorIntoPosition"),null) { public ESLVal apply(ESLVal... args) { return movePredatorIntoPosition(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}