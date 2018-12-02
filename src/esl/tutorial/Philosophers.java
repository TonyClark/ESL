package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Displays.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Philosophers {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal timeLimit = new ESLVal(5000);
  private static ESLVal canDeadlock = $true;
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
  private static ESLVal history = ESLVal.list();
  private static ESLVal eatingIcon = new ESLVal("http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png");
  private static ESLVal thinkingIcon = new ESLVal("http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png");
  private static ESLVal redLine = new ESLVal("stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);");
  private static ESLVal unfilled = new ESLVal("stroke:black; fill-opacity:0;");
  private static ESLVal filled = new ESLVal("");
  // static ESLVal edb = null;
  private static ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v1 = p;
        
        switch(_v1.termName) {
        case "Point": {ESLVal $2 = _v1.termRef(0);
          ESLVal $1 = _v1.termRef(1);
          
          {ESLVal x = $2;
          
          {ESLVal y = $1;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4331,4374)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v2 = p;
        
        switch(_v2.termName) {
        case "Point": {ESLVal $4 = _v2.termRef(0);
          ESLVal $3 = _v2.termRef(1);
          
          {ESLVal x = $4;
          
          {ESLVal y = $3;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4455,4498)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  private static ESLVal toPictures = new ESLVal(new Function(new ESLVal("toPictures"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v30 = $args[0];
  {ESLVal _v3 = _v30;
        
        if(_v3.isCons())
        {ESLVal $5 = _v3.head();
          ESLVal $6 = _v3.tail();
          
          {ESLVal s = $5;
          
          {ESLVal fs = $6;
          
          return toPictures.apply(fs).cons(toPicture.apply(s));
        }
        }
        }
      else if(_v3.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(4624,4721)").add(ESLVal.list(_v3)));
      }
    }
  });
  private static ESLVal toPicture = new ESLVal(new Function(new ESLVal("toPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v4 = s;
        
        switch(_v4.termName) {
        case "Snapshot": {ESLVal $8 = _v4.termRef(0);
          ESLVal $7 = _v4.termRef(1);
          
          {ESLVal holds = $8;
          
          {ESLVal free = $7;
          
          return new ESLVal("Picture",pictureWidth,pictureHeight,toCircles.apply($zero,chopsticks,holds,free).add(toPhils.apply($zero,holds)));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4757,4916)").add(ESLVal.list(_v4)));
      }
      }
    }
  });
  private static ESLVal toPhils = new ESLVal(new Function(new ESLVal("toPhils"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal holds = $args[1];
  if(i.eql(numberOfPhilosophers).boolVal)
        return ESLVal.list();
        else
          {ESLVal left = nth.apply(chopsticks,i);
            ESLVal right = nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers));
            ESLVal holding = getHolding.apply(i,holds);
            ESLVal angle = new ESLVal(360).div(numberOfPhilosophers);
            
            {ESLVal leftPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,angle.mul(i));
            ESLVal rightPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,angle.mul(i.add($one)));
            ESLVal holdingLeft = member.apply(left,holding);
            ESLVal holdingRight = member.apply(right,holding);
            ESLVal linePoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,philosopherRadius.sub(new ESLVal(50)),angle.mul(i).add(angle.div(new ESLVal(2))));
            ESLVal philPoint = edb.ref("math").ref("circlePos").apply(centreX,centreY,philosopherRadius.sub(new ESLVal(30)),angle.mul(i).add(angle.div(new ESLVal(2))));
            
            return toPhil.apply(philPoint,linePoint,leftPoint,rightPoint,holdingLeft,holdingRight).add(toPhils.apply(i.add($one),holds));
          }
          }
    }
  });
  private static ESLVal toPhil = new ESLVal(new Function(new ESLVal("toPhil"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal lStart = $args[1];
  ESLVal l = $args[2];
  ESLVal r = $args[3];
  ESLVal holdsLeft = $args[4];
  ESLVal holdsRight = $args[5];
  {ESLVal leftLine = ((Supplier<ESLVal>)() -> { 
            if(holdsLeft.boolVal)
              return ESLVal.list(new ESLVal("Line",pointX.apply(lStart),pointY.apply(lStart),pointX.apply(l),pointY.apply(l),redLine));
              else
                return ESLVal.list();
          }).get();
        ESLVal rightLine = ((Supplier<ESLVal>)() -> { 
            if(holdsRight.boolVal)
              return ESLVal.list(new ESLVal("Line",pointX.apply(lStart),pointY.apply(lStart),pointX.apply(r),pointY.apply(r),redLine));
              else
                return ESLVal.list();
          }).get();
        ESLVal image = new ESLVal("Image",pointX.apply(p).sub(philosopherWidth.div(new ESLVal(2))),pointY.apply(p).sub(philosopherHeight.div(new ESLVal(2))),philosopherWidth,philosopherHeight,((Supplier<ESLVal>)() -> { 
            if(holdsRight.and(holdsLeft).boolVal)
              return eatingIcon;
              else
                return thinkingIcon;
          }).get());
        
        return ESLVal.list(image).add(leftLine.add(rightLine));
      }
    }
  });
  private static ESLVal getHolding = new ESLVal(new Function(new ESLVal("getHolding"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal holds = $args[1];
  {ESLVal _v5 = holds;
        
        if(_v5.isCons())
        {ESLVal $9 = _v5.head();
          ESLVal $10 = _v5.tail();
          
          switch($9.termName) {
          case "Holds": {ESLVal $12 = $9.termRef(0);
            ESLVal $11 = $9.termRef(1);
            
            {ESLVal i1 = $12;
            
            {ESLVal cs = $11;
            
            {ESLVal hs = $10;
            
            if(i1.eql(i).boolVal)
            return cs;
            else
              {ESLVal h = $9;
                
                {ESLVal _v29 = $10;
                
                return getHolding.apply(i,_v29);
              }
              }
          }
          }
          }
          }
          default: {ESLVal h = $9;
            
            {ESLVal hs = $10;
            
            return getHolding.apply(i,hs);
          }
          }
        }
        }
      else if(_v5.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7152,7309)").add(ESLVal.list(_v5)));
      }
    }
  });
  private static ESLVal toCircles = new ESLVal(new Function(new ESLVal("toCircles"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v25 = $args[0];
  ESLVal _v26 = $args[1];
  ESLVal _v27 = $args[2];
  ESLVal _v28 = $args[3];
  {ESLVal _v6 = _v26;
        
        if(_v6.isCons())
        {ESLVal $13 = _v6.head();
          ESLVal $14 = _v6.tail();
          
          {ESLVal c = $13;
          
          {ESLVal cs = $14;
          
          return toCircles.apply(_v25.add($one),cs,_v27,_v28).cons(toCircle.apply(_v25,c,_v27,_v28));
        }
        }
        }
      else if(_v6.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7448,7574)").add(ESLVal.list(_v6)));
      }
    }
  });
  private static ESLVal toCircle = new ESLVal(new Function(new ESLVal("toCircle"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  ESLVal free = $args[3];
  {ESLVal _v7 = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i));
        
        switch(_v7.termName) {
        case "Point": {ESLVal $16 = _v7.termRef(0);
          ESLVal $15 = _v7.termRef(1);
          
          {ESLVal x = $16;
          
          {ESLVal y = $15;
          
          if(member.apply(c,free).boolVal)
          return new ESLVal("Circle",x,y,new ESLVal(10),unfilled);
          else
            {ESLVal _v23 = $16;
              
              {ESLVal _v24 = $15;
              
              return new ESLVal("Circle",_v23,_v24,new ESLVal(10),filled);
            }
            }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7814,8056)").add(ESLVal.list(_v7)));
      }
      }
    }
  });
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v22 = $args[0];
  {ESLVal _v8 = _v22;
        
        if(_v8.isCons())
        {ESLVal $17 = _v8.head();
          ESLVal $18 = _v8.tail();
          
          switch($17.termName) {
          case "Grab": {ESLVal $21 = $17.termRef(0);
            ESLVal $20 = $17.termRef(1);
            
            {ESLVal p = $21;
            
            {ESLVal c = $20;
            
            {ESLVal h = $18;
            
            return extendFilmstrip.apply(p,c,filmstrip.apply(h));
          }
          }
          }
          }
        case "Release": {ESLVal $19 = $17.termRef(0);
            
            {ESLVal c = $19;
            
            {ESLVal h = $18;
            
            return reduceFilmstrip.apply(c,filmstrip.apply(h));
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8236,8452)").add(ESLVal.list(_v8)));
        }
        }
      else if(_v8.isNil())
        return ESLVal.list(new ESLVal("Snapshot",$nil,chopsticks));
      else return error(new ESLVal("case error at Pos(8236,8452)").add(ESLVal.list(_v8)));
      }
    }
  });
  private static ESLVal extendFilmstrip = new ESLVal(new Function(new ESLVal("extendFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal fs = $args[2];
  {ESLVal _v9 = fs;
        
        if(_v9.isCons())
        {ESLVal $22 = _v9.head();
          ESLVal $23 = _v9.tail();
          
          switch($22.termName) {
          case "Snapshot": {ESLVal $25 = $22.termRef(0);
            ESLVal $24 = $22.termRef(1);
            
            {ESLVal holds = $25;
            
            {ESLVal free = $24;
            
            {ESLVal _v21 = $23;
            
            return _v21.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",extendHolds.apply(p,c,holds),remove.apply(c,free)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8638,8801)").add(ESLVal.list(_v9)));
        }
        }
      else if(_v9.isNil())
        return error(new ESLVal("case error at Pos(8638,8801)").add(ESLVal.list(_v9)));
      else return error(new ESLVal("case error at Pos(8638,8801)").add(ESLVal.list(_v9)));
      }
    }
  });
  private static ESLVal reduceFilmstrip = new ESLVal(new Function(new ESLVal("reduceFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal fs = $args[1];
  {ESLVal _v10 = fs;
        
        if(_v10.isCons())
        {ESLVal $26 = _v10.head();
          ESLVal $27 = _v10.tail();
          
          switch($26.termName) {
          case "Snapshot": {ESLVal $29 = $26.termRef(0);
            ESLVal $28 = $26.termRef(1);
            
            {ESLVal holds = $29;
            
            {ESLVal free = $28;
            
            {ESLVal _v20 = $27;
            
            return _v20.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",reduceHolds.apply(c,holds),free.cons(c)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8967,9109)").add(ESLVal.list(_v10)));
        }
        }
      else if(_v10.isNil())
        return error(new ESLVal("case error at Pos(8967,9109)").add(ESLVal.list(_v10)));
      else return error(new ESLVal("case error at Pos(8967,9109)").add(ESLVal.list(_v10)));
      }
    }
  });
  private static ESLVal extendHolds = new ESLVal(new Function(new ESLVal("extendHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  {ESLVal _v11 = holds;
        
        if(_v11.isCons())
        {ESLVal $30 = _v11.head();
          ESLVal $31 = _v11.tail();
          
          switch($30.termName) {
          case "Holds": {ESLVal $33 = $30.termRef(0);
            ESLVal $32 = $30.termRef(1);
            
            {ESLVal p1 = $33;
            
            {ESLVal cs = $32;
            
            {ESLVal hs = $31;
            
            if(p.eql(p1).boolVal)
            return hs.cons(new ESLVal("Holds",p,cs.cons(c)));
            else
              return extendHolds.apply(p,c,hs).cons(new ESLVal("Holds",p1,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9245,9425)").add(ESLVal.list(_v11)));
        }
        }
      else if(_v11.isNil())
        return ESLVal.list(new ESLVal("Holds",p,ESLVal.list(c)));
      else return error(new ESLVal("case error at Pos(9245,9425)").add(ESLVal.list(_v11)));
      }
    }
  });
  private static ESLVal reduceHolds = new ESLVal(new Function(new ESLVal("reduceHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal holds = $args[1];
  {ESLVal _v12 = holds;
        
        if(_v12.isCons())
        {ESLVal $34 = _v12.head();
          ESLVal $35 = _v12.tail();
          
          switch($34.termName) {
          case "Holds": {ESLVal $37 = $34.termRef(0);
            ESLVal $36 = $34.termRef(1);
            
            {ESLVal p = $37;
            
            {ESLVal cs = $36;
            
            {ESLVal hs = $35;
            
            if(member.apply(c,cs).boolVal)
            return hs.cons(new ESLVal("Holds",p,remove.apply(c,cs)));
            else
              return reduceHolds.apply(c,hs).cons(new ESLVal("Holds",p,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9532,9736)").add(ESLVal.list(_v12)));
        }
        }
      else if(_v12.isNil())
        return holds;
      else return error(new ESLVal("case error at Pos(9532,9736)").add(ESLVal.list(_v12)));
      }
    }
  });
  private static ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return wait.apply(eatTime);
    }
  });
  private static ESLVal think = new ESLVal(new Function(new ESLVal("think"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return wait.apply(thinkTime);
    }
  });
  private static ESLVal philosopher1 = new ESLVal(new Function(new ESLVal("philosopher1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal left = $args[1];
  ESLVal right = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("philosopher1")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v13 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v13)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(timeLimit).boolVal)
            {think.apply();
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return ((Supplier<ESLVal>)() -> { 
              {lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return ((Supplier<ESLVal>)() -> { 
                {history = history.cons(new ESLVal("Grab",i,right)).cons(new ESLVal("Grab",i,left));
                return $null;}
              }).get();
                }},history);
              eat.apply();
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                  public ESLVal apply(ESLVal ...args) { 
                    return ((Supplier<ESLVal>)() -> { 
                  {history = history.cons(new ESLVal("Release",right)).cons(new ESLVal("Release",left));
                  return $null;}
                }).get();
                  }},history);}
            }).get();
              }},left,right);}
            else
              {ESLVal _v19 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v14 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v14)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(timeLimit).boolVal)
            {think.apply();
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return ((Supplier<ESLVal>)() -> { 
              {lock(new Function(new ESLVal("grab"),getSelf()) {
                public ESLVal apply(ESLVal ...args) { 
                  return ((Supplier<ESLVal>)() -> { 
                {history = history.cons(new ESLVal("Grab",i,left));
                return $null;}
              }).get();
                }},history);
              think.apply();
              return lock(new Function(new ESLVal("grab"),getSelf()) {
                  public ESLVal apply(ESLVal ...args) { 
                    return ((Supplier<ESLVal>)() -> { 
                  {lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return ((Supplier<ESLVal>)() -> { 
                    {history = history.cons(new ESLVal("Grab",i,right));
                    return $null;}
                  }).get();
                    }},history);
                  return eat.apply();}
                }).get();
                  }},right);}
            }).get();
              }},left);
            history = history.cons(new ESLVal("Release",right)).cons(new ESLVal("Release",left));}
            else
              {ESLVal _v18 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v15 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v15)));
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
  private static ESLVal chopsticks = new java.util.function.Function<ESLVal,ESLVal>() {
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
  private static ESLVal philosophers = ((Supplier<ESLVal>)() -> { 
    if(canDeadlock.boolVal)
      return new java.util.function.Function<ESLVal,ESLVal>() {
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
        return new java.util.function.Function<ESLVal,ESLVal>() {
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
  }).get();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v16 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v16)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(timeLimit).boolVal)
            {Lib.send(edb,"Filmstrip",new ESLVal("Philosophers"),reverse.apply(toPictures.apply(filmstrip.apply(history))));
            stopAll.apply();}
            else
              {ESLVal _v17 = $t;
                
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
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}