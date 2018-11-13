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
  {ESLVal _v19 = p;
        
        switch(_v19.termName) {
        case "Point": {ESLVal $37 = _v19.termRef(0);
          ESLVal $36 = _v19.termRef(1);
          
          {ESLVal x = $37;
          
          {ESLVal y = $36;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4334,4377)").add(ESLVal.list(_v19)));
      }
      }
    }
  });
  private static ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v18 = p;
        
        switch(_v18.termName) {
        case "Point": {ESLVal $35 = _v18.termRef(0);
          ESLVal $34 = _v18.termRef(1);
          
          {ESLVal x = $35;
          
          {ESLVal y = $34;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4458,4501)").add(ESLVal.list(_v18)));
      }
      }
    }
  });
  private static ESLVal toPictures = new ESLVal(new Function(new ESLVal("toPictures"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v33 = $args[0];
  {ESLVal _v17 = _v33;
        
        if(_v17.isCons())
        {ESLVal $32 = _v17.head();
          ESLVal $33 = _v17.tail();
          
          {ESLVal s = $32;
          
          {ESLVal fs = $33;
          
          return toPictures.apply(fs).cons(toPicture.apply(s));
        }
        }
        }
      else if(_v17.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(4630,4727)").add(ESLVal.list(_v17)));
      }
    }
  });
  private static ESLVal toPicture = new ESLVal(new Function(new ESLVal("toPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v16 = s;
        
        switch(_v16.termName) {
        case "Snapshot": {ESLVal $31 = _v16.termRef(0);
          ESLVal $30 = _v16.termRef(1);
          
          {ESLVal holds = $31;
          
          {ESLVal free = $30;
          
          return new ESLVal("Picture",pictureWidth,pictureHeight,toCircles.apply($zero,chopsticks,holds,free).add(toPhils.apply($zero,holds)));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4766,4925)").add(ESLVal.list(_v16)));
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
  {ESLVal _v15 = holds;
        
        if(_v15.isCons())
        {ESLVal $26 = _v15.head();
          ESLVal $27 = _v15.tail();
          
          switch($26.termName) {
          case "Holds": {ESLVal $29 = $26.termRef(0);
            ESLVal $28 = $26.termRef(1);
            
            {ESLVal i1 = $29;
            
            {ESLVal cs = $28;
            
            {ESLVal hs = $27;
            
            if(i1.eql(i).boolVal)
            return cs;
            else
              {ESLVal h = $26;
                
                {ESLVal _v32 = $27;
                
                return getHolding.apply(i,_v32);
              }
              }
          }
          }
          }
          }
          default: {ESLVal h = $26;
            
            {ESLVal hs = $27;
            
            return getHolding.apply(i,hs);
          }
          }
        }
        }
      else if(_v15.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7161,7318)").add(ESLVal.list(_v15)));
      }
    }
  });
  private static ESLVal toCircles = new ESLVal(new Function(new ESLVal("toCircles"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v31 = $args[0];
  ESLVal _v30 = $args[1];
  ESLVal _v29 = $args[2];
  ESLVal _v28 = $args[3];
  {ESLVal _v14 = _v30;
        
        if(_v14.isCons())
        {ESLVal $24 = _v14.head();
          ESLVal $25 = _v14.tail();
          
          {ESLVal c = $24;
          
          {ESLVal cs = $25;
          
          return toCircles.apply(_v31.add($one),cs,_v29,_v28).cons(toCircle.apply(_v31,c,_v29,_v28));
        }
        }
        }
      else if(_v14.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(7457,7583)").add(ESLVal.list(_v14)));
      }
    }
  });
  private static ESLVal toCircle = new ESLVal(new Function(new ESLVal("toCircle"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  ESLVal free = $args[3];
  {ESLVal _v13 = edb.ref("math").ref("circlePos").apply(centreX,centreY,chopstickRadius,new ESLVal(360).div(numberOfPhilosophers).mul(i));
        
        switch(_v13.termName) {
        case "Point": {ESLVal $23 = _v13.termRef(0);
          ESLVal $22 = _v13.termRef(1);
          
          {ESLVal x = $23;
          
          {ESLVal y = $22;
          
          if(member.apply(c,free).boolVal)
          return new ESLVal("Circle",x,y,new ESLVal(10),unfilled);
          else
            {ESLVal _v26 = $23;
              
              {ESLVal _v27 = $22;
              
              return new ESLVal("Circle",_v26,_v27,new ESLVal(10),filled);
            }
            }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(7823,8065)").add(ESLVal.list(_v13)));
      }
      }
    }
  });
  private static ESLVal filmstrip = new ESLVal(new Function(new ESLVal("filmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v25 = $args[0];
  {ESLVal _v12 = _v25;
        
        if(_v12.isCons())
        {ESLVal $17 = _v12.head();
          ESLVal $18 = _v12.tail();
          
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
          default: return error(new ESLVal("case error at Pos(8245,8461)").add(ESLVal.list(_v12)));
        }
        }
      else if(_v12.isNil())
        return ESLVal.list(new ESLVal("Snapshot",$nil,chopsticks));
      else return error(new ESLVal("case error at Pos(8245,8461)").add(ESLVal.list(_v12)));
      }
    }
  });
  private static ESLVal extendFilmstrip = new ESLVal(new Function(new ESLVal("extendFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal fs = $args[2];
  {ESLVal _v11 = fs;
        
        if(_v11.isCons())
        {ESLVal $13 = _v11.head();
          ESLVal $14 = _v11.tail();
          
          switch($13.termName) {
          case "Snapshot": {ESLVal $16 = $13.termRef(0);
            ESLVal $15 = $13.termRef(1);
            
            {ESLVal holds = $16;
            
            {ESLVal free = $15;
            
            {ESLVal _v24 = $14;
            
            return _v24.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",extendHolds.apply(p,c,holds),remove.apply(c,free)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8647,8810)").add(ESLVal.list(_v11)));
        }
        }
      else if(_v11.isNil())
        return error(new ESLVal("case error at Pos(8647,8810)").add(ESLVal.list(_v11)));
      else return error(new ESLVal("case error at Pos(8647,8810)").add(ESLVal.list(_v11)));
      }
    }
  });
  private static ESLVal reduceFilmstrip = new ESLVal(new Function(new ESLVal("reduceFilmstrip"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal fs = $args[1];
  {ESLVal _v10 = fs;
        
        if(_v10.isCons())
        {ESLVal $9 = _v10.head();
          ESLVal $10 = _v10.tail();
          
          switch($9.termName) {
          case "Snapshot": {ESLVal $12 = $9.termRef(0);
            ESLVal $11 = $9.termRef(1);
            
            {ESLVal holds = $12;
            
            {ESLVal free = $11;
            
            {ESLVal _v23 = $10;
            
            return _v23.cons(new ESLVal("Snapshot",holds,free)).cons(new ESLVal("Snapshot",reduceHolds.apply(c,holds),free.cons(c)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8976,9118)").add(ESLVal.list(_v10)));
        }
        }
      else if(_v10.isNil())
        return error(new ESLVal("case error at Pos(8976,9118)").add(ESLVal.list(_v10)));
      else return error(new ESLVal("case error at Pos(8976,9118)").add(ESLVal.list(_v10)));
      }
    }
  });
  private static ESLVal extendHolds = new ESLVal(new Function(new ESLVal("extendHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  ESLVal c = $args[1];
  ESLVal holds = $args[2];
  {ESLVal _v9 = holds;
        
        if(_v9.isCons())
        {ESLVal $5 = _v9.head();
          ESLVal $6 = _v9.tail();
          
          switch($5.termName) {
          case "Holds": {ESLVal $8 = $5.termRef(0);
            ESLVal $7 = $5.termRef(1);
            
            {ESLVal p1 = $8;
            
            {ESLVal cs = $7;
            
            {ESLVal hs = $6;
            
            if(p.eql(p1).boolVal)
            return hs.cons(new ESLVal("Holds",p,cs.cons(c)));
            else
              return extendHolds.apply(p,c,hs).cons(new ESLVal("Holds",p1,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9254,9434)").add(ESLVal.list(_v9)));
        }
        }
      else if(_v9.isNil())
        return ESLVal.list(new ESLVal("Holds",p,ESLVal.list(c)));
      else return error(new ESLVal("case error at Pos(9254,9434)").add(ESLVal.list(_v9)));
      }
    }
  });
  private static ESLVal reduceHolds = new ESLVal(new Function(new ESLVal("reduceHolds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal holds = $args[1];
  {ESLVal _v8 = holds;
        
        if(_v8.isCons())
        {ESLVal $1 = _v8.head();
          ESLVal $2 = _v8.tail();
          
          switch($1.termName) {
          case "Holds": {ESLVal $4 = $1.termRef(0);
            ESLVal $3 = $1.termRef(1);
            
            {ESLVal p = $4;
            
            {ESLVal cs = $3;
            
            {ESLVal hs = $2;
            
            if(member.apply(c,cs).boolVal)
            return hs.cons(new ESLVal("Holds",p,remove.apply(c,cs)));
            else
              return reduceHolds.apply(c,hs).cons(new ESLVal("Holds",p,cs));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9541,9745)").add(ESLVal.list(_v8)));
        }
        }
      else if(_v8.isNil())
        return holds;
      else return error(new ESLVal("case error at Pos(9541,9745)").add(ESLVal.list(_v8)));
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v7)));
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
              {ESLVal _v22 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
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
              {ESLVal _v21 = $t;
                
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v5 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
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
  private static ESLVal chopsticks = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal _v4 = $qualArg;
        
        {ESLVal i = _v4;
        
        return ESLVal.list(ESLVal.list(newActor(chopstick,new ESLVal(new Actor()))));
      }
      }
    }
  }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
  private static ESLVal philosophers = ((Supplier<ESLVal>)() -> { 
    if(canDeadlock.boolVal)
      return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v2 = $qualArg;
              
              {ESLVal i = _v2;
              
              return ESLVal.list(ESLVal.list(newActor(philosopher2,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers)))));
            }
            }
          }
        }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
      else
        return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v3 = $qualArg;
                
                {ESLVal i = _v3;
                
                return ESLVal.list(ESLVal.list(newActor(philosopher1,new ESLVal(new Actor()),i,nth.apply(chopsticks,i),nth.apply(chopsticks,i.add($one).mod(numberOfPhilosophers)))));
              }
              }
            }
          }).map($zero.to(numberOfPhilosophers)).flatten().flatten();
  }).get();
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
              {ESLVal _v20 = $t;
                
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