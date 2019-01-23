package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Displays.*;
// import static esl.Lists.*;
public class Philosophers {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal timeLimit = new ESLVal(5000);
  private static ESLVal canDeadlock = $false;
  private static ESLVal numberOfPhilosophers = new ESLVal(10);
  private static ESLVal eatTime = new ESLVal(50);
  private static ESLVal thinkTime = new ESLVal(50);
  private static ESLVal pictureWidth = new ESLVal(1000);
  private static ESLVal pictureHeight = new ESLVal(1000);
  private static ESLVal centreX = new ESLVal(500);
  private static ESLVal centreY = new ESLVal(250);
  private static ESLVal chopstickRadius = new ESLVal(100);
  private static ESLVal philosopherRadius = new ESLVal(200);
  private static ESLVal philosopherWidth = new ESLVal(40);
  private static ESLVal philosopherHeight = new ESLVal(40);
  private static ESLVal history = $nil;
  private static ESLVal eatingIcon = new ESLVal("http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png");
  private static ESLVal thinkingIcon = new ESLVal("http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png");
  private static ESLVal redLine = new ESLVal("stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);");
  private static ESLVal unfilled = new ESLVal("stroke:black; fill-opacity:0;");
  private static ESLVal filled = new ESLVal("");
  // static ESLVal edb = null;
  private static ESLVal philosopher1 = new ESLVal(new Function(new ESLVal("philosopher1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal left = $args[1];
  ESLVal right = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("philosopher1")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v247 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v247)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(timeLimit).boolVal)
            {think();
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {history = history.cons(new ESLVal("Grab",i,right)).cons(new ESLVal("Grab",i,left));
                return $null;}
              }}.get();
                }},history);
              eat();
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                  public ESLVal apply(ESLVal ...args) { 
                    return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  {history = history.cons(new ESLVal("Release",right)).cons(new ESLVal("Release",left));
                  return $null;}
                }}.get();
                  }},history);}
            }}.get();
              }},left,right);}
            else
              {ESLVal _v253 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal philosopher2 = new ESLVal(new Function(new ESLVal("philosopher2"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal left = $args[1];
  ESLVal right = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("philosopher2")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v248 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v248)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(timeLimit).boolVal)
            {think();
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {history = history.cons(new ESLVal("Grab",i,left));
                return $null;}
              }}.get();
                }},history);
              think();
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                  public ESLVal apply(ESLVal ...args) { 
                    return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  {lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                    {history = history.cons(new ESLVal("Grab",i,right));
                    return $null;}
                  }}.get();
                    }},history);
                  return eat();}
                }}.get();
                  }},right);}
            }}.get();
              }},left);
            history = history.cons(new ESLVal("Release",right)).cons(new ESLVal("Release",left));}
            else
              {ESLVal _v252 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal chopstick = new ESLVal(new Function(new ESLVal("chopstick"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("chopstick")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v249 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v249)));
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
  private static ESLVal chopsticks = new SerializableFunction<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal i = $l0.head();
        $l0 = $l0.tail();
        $v.add(newActor(chopstick,new ESLVal(new Actor())));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(numberOfPhilosophers));
  private static ESLVal philosophers = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
    if(canDeadlock.boolVal)
      return new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              $v.add(newActor(philosopher2,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers))));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(numberOfPhilosophers));
      else
        return new SerializableFunction<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal i = $l0.head();
                $l0 = $l0.tail();
                $v.add(newActor(philosopher1,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers))));
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply($zero.to(numberOfPhilosophers));
  }}.get();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v250 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v250)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(timeLimit).boolVal)
            {Lib.send(edb,"Filmstrip",new ESLVal("Philosophers"),reverse(toPictures(filmstrip(history))));
            stopAll.apply();}
            else
              {ESLVal _v251 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
private static ESLVal pointX(ESLVal p) {
    
    {ESLVal _v235 = p;
      
      switch(_v235.termName) {
      case "Point": {ESLVal $266 = _v235.termRef(0);
        ESLVal $265 = _v235.termRef(1);
        
        {ESLVal x = $266;
        
        {ESLVal y = $265;
        
        return x;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4333,4376)").add(ESLVal.list(_v235)));
    }
    }
  }
  private static ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),null) { public ESLVal apply(ESLVal... args) { return pointX(args[0]); }});
  private static ESLVal pointY(ESLVal p) {
    
    {ESLVal _v236 = p;
      
      switch(_v236.termName) {
      case "Point": {ESLVal $268 = _v236.termRef(0);
        ESLVal $267 = _v236.termRef(1);
        
        {ESLVal x = $268;
        
        {ESLVal y = $267;
        
        return y;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4457,4500)").add(ESLVal.list(_v236)));
    }
    }
  }
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),null) { public ESLVal apply(ESLVal... args) { return pointY(args[0]); }});
  private static ESLVal toPictures(ESLVal filmstrip) {
    
    {ESLVal _v237 = filmstrip;
      
      if(_v237.isCons())
      {ESLVal $269 = _v237.head();
        ESLVal $270 = _v237.tail();
        
        {ESLVal s = $269;
        
        {ESLVal fs = $270;
        
        return toPictures(fs).cons(toPicture(s));
      }
      }
      }
    else if(_v237.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(4626,4723)").add(ESLVal.list(_v237)));
    }
  }
  private static ESLVal toPictures = new ESLVal(new Function(new ESLVal("toPictures"),null) { public ESLVal apply(ESLVal... args) { return toPictures(args[0]); }});
  private static ESLVal toPicture(ESLVal s) {
    
    {ESLVal _v238 = s;
      
      switch(_v238.termName) {
      case "Snapshot": {ESLVal $272 = _v238.termRef(0);
        ESLVal $271 = _v238.termRef(1);
        
        {ESLVal holds = $272;
        
        {ESLVal free = $271;
        
        return new ESLVal("Picture",pictureWidth,pictureHeight,toCircles($zero,chopsticks,holds,free).add(toPhils($zero,holds)));
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4759,4918)").add(ESLVal.list(_v238)));
    }
    }
  }
  private static ESLVal toPicture = new ESLVal(new Function(new ESLVal("toPicture"),null) { public ESLVal apply(ESLVal... args) { return toPicture(args[0]); }});
  private static ESLVal toPhils(ESLVal i,ESLVal holds) {
    
    if(i.eql(numberOfPhilosophers).boolVal)
      return $nil;
      else
        {ESLVal left = nth.apply(chopsticks,i);
          ESLVal right = nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers));
          ESLVal holding = getHolding(i,holds);
          ESLVal angle = new ESLVal(360).div(numberOfPhilosophers);
          
          {ESLVal leftPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,angle.mul(i));
          ESLVal rightPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,angle.mul(i.add($one)));
          ESLVal holdingLeft = member.apply(left,holding);
          ESLVal holdingRight = member.apply(right,holding);
          ESLVal linePoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,philosopherRadius.sub(new ESLVal(50)),angle.mul(i).add(angle.div(new ESLVal(2))));
          ESLVal philPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,philosopherRadius.sub(new ESLVal(30)),angle.mul(i).add(angle.div(new ESLVal(2))));
          
          return toPhil(philPoint,linePoint,leftPoint,rightPoint,holdingLeft,holdingRight).add(toPhils(i.add($one),holds));
        }
        }
  }
  private static ESLVal toPhils = new ESLVal(new Function(new ESLVal("toPhils"),null) { public ESLVal apply(ESLVal... args) { return toPhils(args[0],args[1]); }});
  private static ESLVal toPhil(ESLVal p,ESLVal lStart,ESLVal l,ESLVal r,ESLVal holdsLeft,ESLVal holdsRight) {
    
    {ESLVal leftLine = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(holdsLeft.boolVal)
            return ESLVal.list(new ESLVal("Line",pointX(lStart),pointY(lStart),pointX(l),pointY(l),redLine));
            else
              return $nil;
        }}.get();
      ESLVal rightLine = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(holdsRight.boolVal)
            return ESLVal.list(new ESLVal("Line",pointX(lStart),pointY(lStart),pointX(r),pointY(r),redLine));
            else
              return $nil;
        }}.get();
      ESLVal image = new ESLVal("Image",pointX(p).sub(philosopherWidth.div(new ESLVal(2))),pointY(p).sub(philosopherHeight.div(new ESLVal(2))),philosopherWidth,philosopherHeight,new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(holdsRight.and(holdsLeft).boolVal)
            return eatingIcon;
            else
              return thinkingIcon;
        }}.get());
      
      return ESLVal.list(image).add(leftLine.add(rightLine));
    }
  }
  private static ESLVal toPhil = new ESLVal(new Function(new ESLVal("toPhil"),null) { public ESLVal apply(ESLVal... args) { return toPhil(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  private static ESLVal getHolding(ESLVal i,ESLVal holds) {
    
    {ESLVal _v239 = holds;
      
      if(_v239.isCons())
      {ESLVal $273 = _v239.head();
        ESLVal $274 = _v239.tail();
        
        switch($273.termName) {
        case "Holds": {ESLVal $276 = $273.termRef(0);
          ESLVal $275 = $273.termRef(1);
          
          {ESLVal i1 = $276;
          
          {ESLVal cs = $275;
          
          {ESLVal hs = $274;
          
          if(i1.eql(i).boolVal)
          return cs;
          else
            {ESLVal h = $273;
              
              {ESLVal _v258 = $274;
              
              return getHolding(i,_v258);
            }
            }
        }
        }
        }
        }
        default: {ESLVal h = $273;
          
          {ESLVal hs = $274;
          
          return getHolding(i,hs);
        }
        }
      }
      }
    else if(_v239.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(7155,7312)").add(ESLVal.list(_v239)));
    }
  }
  private static ESLVal getHolding = new ESLVal(new Function(new ESLVal("getHolding"),null) { public ESLVal apply(ESLVal... args) { return getHolding(args[0],args[1]); }});
  private static ESLVal toCircles(ESLVal i,ESLVal chopsticks,ESLVal holds,ESLVal free) {
    
    {ESLVal _v240 = chopsticks;
      
      if(_v240.isCons())
      {ESLVal $277 = _v240.head();
        ESLVal $278 = _v240.tail();
        
        {ESLVal c = $277;
        
        {ESLVal cs = $278;
        
        return toCircles(i.add($one),cs,holds,free).cons(toCircle(i,c,holds,free));
      }
      }
      }
    else if(_v240.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(7451,7577)").add(ESLVal.list(_v240)));
    }
  }
  private static ESLVal toCircles = new ESLVal(new Function(new ESLVal("toCircles"),null) { public ESLVal apply(ESLVal... args) { return toCircles(args[0],args[1],args[2],args[3]); }});
  private static ESLVal toCircle(ESLVal i,ESLVal c,ESLVal holds,ESLVal free) {
    
    {ESLVal _v241 = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i));
      
      switch(_v241.termName) {
      case "Point": {ESLVal $280 = _v241.termRef(0);
        ESLVal $279 = _v241.termRef(1);
        
        {ESLVal x = $280;
        
        {ESLVal y = $279;
        
        if(member.apply(c,free).boolVal)
        return new ESLVal("Circle",x,y,new ESLVal(10),unfilled);
        else
          {ESLVal _v256 = $280;
            
            {ESLVal _v257 = $279;
            
            return new ESLVal("Circle",_v256,_v257,new ESLVal(10),filled);
          }
          }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(7817,8059)").add(ESLVal.list(_v241)));
    }
    }
  }
  private static ESLVal toCircle = new ESLVal(new Function(new ESLVal("toCircle"),null) { public ESLVal apply(ESLVal... args) { return toCircle(args[0],args[1],args[2],args[3]); }});
  private static ESLVal filmstrip(ESLVal history) {
    
    {ESLVal _v242 = history;
      
      if(_v242.isCons())
      {ESLVal $281 = _v242.head();
        ESLVal $282 = _v242.tail();
        
        switch($281.termName) {
        case "Grab": {ESLVal $285 = $281.termRef(0);
          ESLVal $284 = $281.termRef(1);
          
          {ESLVal p = $285;
          
          {ESLVal c = $284;
          
          {ESLVal h = $282;
          
          return extendFilmstrip(p,c,filmstrip(h));
        }
        }
        }
        }
      case "Release": {ESLVal $283 = $281.termRef(0);
          
          {ESLVal c = $283;
          
          {ESLVal h = $282;
          
          return reduceFilmstrip(c,filmstrip(h));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8239,8456)").add(ESLVal.list(_v242)));
      }
      }
    else if(_v242.isNil())
      return ESLVal.list(new ESLVal("Snapshot",$nil,chopsticks));
    else return error(new ESLVal("case error at Pos(8239,8456)").add(ESLVal.list(_v242)));
    }
  }
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),null) { public ESLVal apply(ESLVal... args) { return filmstrip(args[0]); }});
  private static ESLVal extendFilmstrip(ESLVal p,ESLVal c,ESLVal fs) {
    
    {ESLVal _v243 = fs;
      
      if(_v243.isCons())
      {ESLVal $286 = _v243.head();
        ESLVal $287 = _v243.tail();
        
        switch($286.termName) {
        case "Snapshot": {ESLVal $289 = $286.termRef(0);
          ESLVal $288 = $286.termRef(1);
          
          {ESLVal holds = $289;
          
          {ESLVal free = $288;
          
          {ESLVal _v255 = $287;
          
          return _v255.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",extendHolds(p,c,holds),remove.apply(c,free)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8642,8805)").add(ESLVal.list(_v243)));
      }
      }
    else if(_v243.isNil())
      return error(new ESLVal("case error at Pos(8642,8805)").add(ESLVal.list(_v243)));
    else return error(new ESLVal("case error at Pos(8642,8805)").add(ESLVal.list(_v243)));
    }
  }
  private static ESLVal extendFilmstrip = new ESLVal(new Function(new ESLVal("extendFilmstrip"),null) { public ESLVal apply(ESLVal... args) { return extendFilmstrip(args[0],args[1],args[2]); }});
  private static ESLVal reduceFilmstrip(ESLVal c,ESLVal fs) {
    
    {ESLVal _v244 = fs;
      
      if(_v244.isCons())
      {ESLVal $290 = _v244.head();
        ESLVal $291 = _v244.tail();
        
        switch($290.termName) {
        case "Snapshot": {ESLVal $293 = $290.termRef(0);
          ESLVal $292 = $290.termRef(1);
          
          {ESLVal holds = $293;
          
          {ESLVal free = $292;
          
          {ESLVal _v254 = $291;
          
          return _v254.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",reduceHolds(c,holds),free.cons(c)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(8971,9113)").add(ESLVal.list(_v244)));
      }
      }
    else if(_v244.isNil())
      return error(new ESLVal("case error at Pos(8971,9113)").add(ESLVal.list(_v244)));
    else return error(new ESLVal("case error at Pos(8971,9113)").add(ESLVal.list(_v244)));
    }
  }
  private static ESLVal reduceFilmstrip = new ESLVal(new Function(new ESLVal("reduceFilmstrip"),null) { public ESLVal apply(ESLVal... args) { return reduceFilmstrip(args[0],args[1]); }});
  private static ESLVal extendHolds(ESLVal p,ESLVal c,ESLVal holds) {
    
    {ESLVal _v245 = holds;
      
      if(_v245.isCons())
      {ESLVal $294 = _v245.head();
        ESLVal $295 = _v245.tail();
        
        switch($294.termName) {
        case "Holds": {ESLVal $297 = $294.termRef(0);
          ESLVal $296 = $294.termRef(1);
          
          {ESLVal p1 = $297;
          
          {ESLVal cs = $296;
          
          {ESLVal hs = $295;
          
          if(p.eql(p1).boolVal)
          return hs.cons(new ESLVal("Holds",p,cs.cons(c)));
          else
            return extendHolds(p,c,hs).cons(new ESLVal("Holds",p1,cs));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9249,9429)").add(ESLVal.list(_v245)));
      }
      }
    else if(_v245.isNil())
      return ESLVal.list(new ESLVal("Holds",p,ESLVal.list(c)));
    else return error(new ESLVal("case error at Pos(9249,9429)").add(ESLVal.list(_v245)));
    }
  }
  private static ESLVal extendHolds = new ESLVal(new Function(new ESLVal("extendHolds"),null) { public ESLVal apply(ESLVal... args) { return extendHolds(args[0],args[1],args[2]); }});
  private static ESLVal reduceHolds(ESLVal c,ESLVal holds) {
    
    {ESLVal _v246 = holds;
      
      if(_v246.isCons())
      {ESLVal $298 = _v246.head();
        ESLVal $299 = _v246.tail();
        
        switch($298.termName) {
        case "Holds": {ESLVal $301 = $298.termRef(0);
          ESLVal $300 = $298.termRef(1);
          
          {ESLVal p = $301;
          
          {ESLVal cs = $300;
          
          {ESLVal hs = $299;
          
          if(member.apply(c,cs).boolVal)
          return hs.cons(new ESLVal("Holds",p,remove.apply(c,cs)));
          else
            return reduceHolds(c,hs).cons(new ESLVal("Holds",p,cs));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(9536,9740)").add(ESLVal.list(_v246)));
      }
      }
    else if(_v246.isNil())
      return holds;
    else return error(new ESLVal("case error at Pos(9536,9740)").add(ESLVal.list(_v246)));
    }
  }
  private static ESLVal reduceHolds = new ESLVal(new Function(new ESLVal("reduceHolds"),null) { public ESLVal apply(ESLVal... args) { return reduceHolds(args[0],args[1]); }});
  private static ESLVal eat() {
    
    return wait.apply(eatTime);
  }
  private static ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),null) { public ESLVal apply(ESLVal... args) { return eat(); }});
  private static ESLVal think() {
    
    return wait.apply(thinkTime);
  }
  private static ESLVal think = new ESLVal(new Function(new ESLVal("think"),null) { public ESLVal apply(ESLVal... args) { return think(); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}