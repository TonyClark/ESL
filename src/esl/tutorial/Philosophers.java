package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Displays.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
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
  switch(p.termName) {
        case "Point": {ESLVal $1 = p.termRef(0);
          ESLVal $2 = p.termRef(1);
          
          {ESLVal x = $1;
          
          {ESLVal y = $2;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4336,4379)"));
      }
    }
  });
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  switch(p.termName) {
        case "Point": {ESLVal $3 = p.termRef(0);
          ESLVal $4 = p.termRef(1);
          
          {ESLVal x = $3;
          
          {ESLVal y = $4;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4460,4503)"));
      }
    }
  });
  private static ESLVal toPictures = new ESLVal(new Function(new ESLVal("toPictures"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal filmstrip = $args[0];
  if(filmstrip.isCons())
        {ESLVal $5 = filmstrip.head();
          ESLVal $6 = filmstrip.tail();
          
          {ESLVal s = $5;
          
          {ESLVal fs = $6;
          
          return toPictures.apply(fs).cons(toPicture.apply(s));
        }
        }
        }
      else if(filmstrip.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(4632,4729)"));
    }
  });
  private static ESLVal toPicture = new ESLVal(new Function(new ESLVal("toPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  switch(s.termName) {
        case "Snapshot": {ESLVal $7 = s.termRef(0);
          ESLVal $8 = s.termRef(1);
          
          {ESLVal holds = $7;
          
          {ESLVal free = $8;
          
          return new ESLVal("Picture",pictureWidth,pictureHeight,toCircles.apply($zero,chopsticks,holds,free).add(toPhils.apply($zero,holds)));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4768,4927)"));
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
  if(holds.isCons())
        {ESLVal $9 = holds.head();
          ESLVal $10 = holds.tail();
          
          switch($9.termName) {
          case "Holds": {ESLVal $11 = $9.termRef(0);
            ESLVal $12 = $9.termRef(1);
            
            {ESLVal i1 = $11;
            
            {ESLVal cs = $12;
            
            {ESLVal hs = $10;
            
            if(i1.eql(i).boolVal)
            return cs;
            else
              {ESLVal h = $9;
                
                {ESLVal _v1 = $10;
                
                return getHolding.apply(i,_v1);
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
      else if(holds.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7163,7320)"));
    }
  });
  private static ESLVal toCircles = new ESLVal(new Function(new ESLVal("toCircles"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal chopsticks = $args[1];
  ESLVal holds = $args[2];
  ESLVal free = $args[3];
  if(chopsticks.isCons())
        {ESLVal $13 = chopsticks.head();
          ESLVal $14 = chopsticks.tail();
          
          {ESLVal c = $13;
          
          {ESLVal cs = $14;
          
          return toCircles.apply(i.add($one),cs,holds,free).cons(toCircle.apply(i,c,holds,free));
        }
        }
        }
      else if(chopsticks.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7459,7585)"));
    }
  });
  private static ESLVal toCircle = new ESLVal(new Function(new ESLVal("toCircle"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  ESLVal free = $args[3];
  switch(edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i)).termName) {
        case "Point": {ESLVal $15 = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i)).termRef(0);
          ESLVal $16 = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i)).termRef(1);
          
          {ESLVal x = $15;
          
          {ESLVal y = $16;
          
          if(member.apply(c,free).boolVal)
          return new ESLVal("Circle",x,y,new ESLVal(10),unfilled);
          else
            {ESLVal _v2 = $15;
              
              {ESLVal _v3 = $16;
              
              return new ESLVal("Circle",_v2,_v3,new ESLVal(10),filled);
            }
            }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7825,8067)"));
      }
    }
  });
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal history = $args[0];
  if(history.isCons())
        {ESLVal $17 = history.head();
          ESLVal $18 = history.tail();
          
          switch($17.termName) {
          case "Grab": {ESLVal $19 = $17.termRef(0);
            ESLVal $20 = $17.termRef(1);
            
            {ESLVal p = $19;
            
            {ESLVal c = $20;
            
            {ESLVal h = $18;
            
            return extendFilmstrip.apply(p,c,filmstrip.apply(h));
          }
          }
          }
          }
        case "Release": {ESLVal $21 = $17.termRef(0);
            
            {ESLVal c = $21;
            
            {ESLVal h = $18;
            
            return reduceFilmstrip.apply(c,filmstrip.apply(h));
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8247,8463)"));
        }
        }
      else if(history.isNil())
        return ESLVal.list(new ESLVal("Snapshot",$nil,chopsticks));
      else return error(new ESLVal("case error at Pos(8247,8463)"));
    }
  });
  private static ESLVal extendFilmstrip = new ESLVal(new Function(new ESLVal("extendFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal fs = $args[2];
  if(fs.isCons())
        {ESLVal $22 = fs.head();
          ESLVal $23 = fs.tail();
          
          switch($22.termName) {
          case "Snapshot": {ESLVal $24 = $22.termRef(0);
            ESLVal $25 = $22.termRef(1);
            
            {ESLVal holds = $24;
            
            {ESLVal free = $25;
            
            {ESLVal _v4 = $23;
            
            return _v4.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",extendHolds.apply(p,c,holds),remove.apply(c,free)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8649,8812)"));
        }
        }
      else if(fs.isNil())
        return error(new ESLVal("case error at Pos(8649,8812)"));
      else return error(new ESLVal("case error at Pos(8649,8812)"));
    }
  });
  private static ESLVal reduceFilmstrip = new ESLVal(new Function(new ESLVal("reduceFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal fs = $args[1];
  if(fs.isCons())
        {ESLVal $26 = fs.head();
          ESLVal $27 = fs.tail();
          
          switch($26.termName) {
          case "Snapshot": {ESLVal $28 = $26.termRef(0);
            ESLVal $29 = $26.termRef(1);
            
            {ESLVal holds = $28;
            
            {ESLVal free = $29;
            
            {ESLVal _v5 = $27;
            
            return _v5.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",reduceHolds.apply(c,holds),free.cons(c)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8978,9120)"));
        }
        }
      else if(fs.isNil())
        return error(new ESLVal("case error at Pos(8978,9120)"));
      else return error(new ESLVal("case error at Pos(8978,9120)"));
    }
  });
  private static ESLVal extendHolds = new ESLVal(new Function(new ESLVal("extendHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  if(holds.isCons())
        {ESLVal $30 = holds.head();
          ESLVal $31 = holds.tail();
          
          switch($30.termName) {
          case "Holds": {ESLVal $32 = $30.termRef(0);
            ESLVal $33 = $30.termRef(1);
            
            {ESLVal p1 = $32;
            
            {ESLVal cs = $33;
            
            {ESLVal hs = $31;
            
            if(p.eql(p1).boolVal)
            return hs.cons(new ESLVal("Holds",p,cs.cons(c)));
            else
              return extendHolds.apply(p,c,hs).cons(new ESLVal("Holds",p1,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9256,9436)"));
        }
        }
      else if(holds.isNil())
        return ESLVal.list(new ESLVal("Holds",p,ESLVal.list(c)));
      else return error(new ESLVal("case error at Pos(9256,9436)"));
    }
  });
  private static ESLVal reduceHolds = new ESLVal(new Function(new ESLVal("reduceHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal holds = $args[1];
  if(holds.isCons())
        {ESLVal $34 = holds.head();
          ESLVal $35 = holds.tail();
          
          switch($34.termName) {
          case "Holds": {ESLVal $36 = $34.termRef(0);
            ESLVal $37 = $34.termRef(1);
            
            {ESLVal p = $36;
            
            {ESLVal cs = $37;
            
            {ESLVal hs = $35;
            
            if(member.apply(c,cs).boolVal)
            return hs.cons(new ESLVal("Holds",p,remove.apply(c,cs)));
            else
              return reduceHolds.apply(c,hs).cons(new ESLVal("Holds",p,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9543,9747)"));
        }
        }
      else if(holds.isNil())
        return holds;
      else return error(new ESLVal("case error at Pos(9543,9747)"));
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
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
              {ESLVal _v6 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
              {ESLVal _v7 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
  private static ESLVal chopsticks = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal i = $qualArg;
        
        return ESLVal.list(ESLVal.list(newActor(chopstick,new ESLVal(new Actor()))));
      }
    }
  }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
  private static ESLVal philosophers = ((Supplier<ESLVal>)() -> { 
    if(canDeadlock.boolVal)
      return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal i = $qualArg;
              
              return ESLVal.list(ESLVal.list(newActor(philosopher2,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers)))));
            }
          }
        }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
      else
        return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal i = $qualArg;
                
                return ESLVal.list(ESLVal.list(newActor(philosopher1,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers)))));
              }
            }
          }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
  }).get();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {return error(new ESLVal("case error at Pos(0,0)"));}
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
              {ESLVal _v8 = $t;
                
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