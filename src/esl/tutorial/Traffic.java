package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class Traffic {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal leftColour = new ESLVal("fill:green;stroke:green;");
  private static ESLVal rightColour = new ESLVal("fill:red;stroke:red;");
  private static ESLVal carSize = new ESLVal(30);
  private static ESLVal carGap = new ESLVal(2);
  private static ESLVal maxCarsWaiting = new ESLVal(7);
  private static ESLVal width = new ESLVal(4).mul(carSize);
  private static ESLVal border = new ESLVal(50);
  private static ESLVal waits = carSize.add(carGap).mul(maxCarsWaiting);
  private static ESLVal neckLength = new ESLVal(100);
  private static ESLVal neckWidth = carSize.add(new ESLVal(10));
  private static ESLVal gapLength = new ESLVal(150);
  private static ESLVal gapWidth = new ESLVal(100);
  private static ESLVal leftCarY = border.add(width.div(new ESLVal(4)));
  private static ESLVal rightCarY = border.add(width.sub(width.div(new ESLVal(4))));
  private static ESLVal pWidth = new ESLVal(1500);
  private static ESLVal pHeight = new ESLVal(1000);
  private static ESLVal leftTop = new ESLVal("Line",border,border,border.add(waits),border,new ESLVal("stroke:black;"));
  private static ESLVal leftBottom = new ESLVal("Line",border,border.add(width),border.add(waits),border.add(width),new ESLVal("stroke:black;"));
  private static ESLVal rightTop = new ESLVal("Line",border.add(waits.add(gapLength)),border,border.add(waits.add(gapLength.add(waits))),border,new ESLVal("stroke:black;"));
  private static ESLVal rightBottom = new ESLVal("Line",border.add(waits.add(gapLength)),width.add(border),border.add(waits.add(gapLength.add(waits))),width.add(border),new ESLVal("stroke:black;"));
  private static ESLVal topNeck = ESLVal.list(new ESLVal("Line",border.add(waits),border,border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(neckWidth).div(new ESLVal(2))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(neckWidth).div(new ESLVal(2))),border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),border.add(width.sub(neckWidth).div(new ESLVal(2))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),border.add(width.sub(neckWidth).div(new ESLVal(2))),border.add(waits.add(gapLength)),border,new ESLVal("stroke:black;")));
  private static ESLVal bottomNeck = ESLVal.list(new ESLVal("Line",border.add(waits),border.add(width),border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(width.sub(neckWidth).div(new ESLVal(2)))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),border.add(waits.add(gapLength)),border.add(width),new ESLVal("stroke:black;")));
  private static ESLVal neck = topNeck.add(bottomNeck);
  private static ESLVal centre = new ESLVal("Line",border,border.add(width.div(new ESLVal(2))),border.add(waits.mul(new ESLVal(2)).add(gapLength)),border.add(width.div(new ESLVal(2))),new ESLVal("stroke:grey;stroke-dasharray:5,5;"));
  private static ESLVal road = ESLVal.list(leftTop,leftBottom).add(neck.add(ESLVal.list(rightTop,rightBottom).add(ESLVal.list(centre))));
  private static ESLVal qLimit = new ESLVal(5);
  private static ESLVal qtLimit = new ESLVal(3);
  private static ESLVal tLimit = new ESLVal(5000);
  private static ESLVal sampleDelay = new ESLVal(20);
  private static ESLVal moveDelay = new ESLVal(20);
  private static ESLVal actions = $nil;
  private static ESLVal monitorState = new ESLVal("Even",new ESLVal[]{});
  private static ESLVal light = new ESLVal(new Function(new ESLVal("light"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("light")) {
          ESLVal change() {
    
    {ESLVal _v475 = colour;
      
      switch(_v475.strVal) {
      case "RED": {colour = new ESLVal("GREEN");
      return $null;}
    case "GREEN": {colour = new ESLVal("RED");
      return $null;}
      default: return error(new ESLVal("case error at Pos(8440,8527)").add(ESLVal.list(_v475)));
    }
    }
  }
  ESLVal change = new ESLVal(new Function(new ESLVal("change"),null) { public ESLVal apply(ESLVal... args) { return change(); }});
ESLVal colour = c;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v476 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v476)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "colour": return colour;
              case "change": return change;
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
  private static ESLVal trafficLights = new ESLVal(new Function(new ESLVal("trafficLights"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal r = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("trafficLights")) {
          
ESLVal left = l;
          ESLVal right = r;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v477 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v477)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "left": return left;
              case "right": return right;
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
  private static ESLVal approach = new ESLVal(new Function(new ESLVal("approach"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v486 = $args[0];
  ESLVal _v487 = $args[1];
  ESLVal _v488 = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("approach")) {
          ESLVal getQueueLength() {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return head.apply(queue);
        }},queue);
  }
  ESLVal getQueueLength = new ESLVal(new Function(new ESLVal("getQueueLength"),null) { public ESLVal apply(ESLVal... args) { return getQueueLength(); }});
  ESLVal prioritise() {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(length.apply(queue).gre(qtLimit).boolVal)
          return forall.apply(new ESLVal(new Function(new ESLVal("fun80"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return n.gre(qLimit);
              }
            }),take(queue,qtLimit));
          else
            return $false;
      }}.get();
        }},queue);
  }
  ESLVal prioritise = new ESLVal(new Function(new ESLVal("prioritise"),null) { public ESLVal apply(ESLVal... args) { return prioritise(); }});
  ESLVal move() {
    
    return lock(new Function(new ESLVal("grab"),getSelf()) {
        public ESLVal apply(ESLVal ...args) { 
          return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(_v487.ref("colour").eql(new ESLVal("GREEN")).boolVal)
          if(head.apply(queue).gre($zero).boolVal)
            {queue = queue.cons(head.apply(queue).sub($one));
            {actions = actions.add(ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              if(_v486.eql(new ESLVal("left")).boolVal)
                return new ESLVal("MoveLeft",new ESLVal[]{});
                else
                  return new ESLVal("MoveRight",new ESLVal[]{});
            }}.get()));
            return $null;}}
            else
              return $null;
          else
            return $null;
      }}.get();
        }},queue,actions);
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});
ESLVal queue = ESLVal.list($zero);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v478 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v478)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getQueueLength": return getQueueLength;
              case "move": return move;
              case "prioritise": return prioritise;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {probably(_v488,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                    {queue = queue.cons(head.apply(queue).add($one));
                    {actions = actions.add(ESLVal.list(new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                      if(_v486.eql(new ESLVal("left")).boolVal)
                        return new ESLVal("ArriveLeft",new ESLVal[]{});
                        else
                          return new ESLVal("ArriveRight",new ESLVal[]{});
                    }}.get()));
                    return $null;}}
                  }}.get();
                    }},queue,actions);
              }
            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return $null;
              }
            }));
            move();}
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal mon = new ESLVal(new Function(new ESLVal("mon"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v483 = $args[0];
  ESLVal _v484 = $args[1];
  ESLVal _v485 = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("mon")) {
          ESLVal queueRight() {
    
    return _v484.ref("getQueueLength").apply().gre($zero);
  }
  ESLVal queueRight = new ESLVal(new Function(new ESLVal("queueRight"),null) { public ESLVal apply(ESLVal... args) { return queueRight(); }});
  ESLVal allowRight() {
    
    if(_v485.ref("right").ref("colour").eql(new ESLVal("RED")).boolVal)
      {_v485.ref("right").ref("change").apply();
      return _v485.ref("left").ref("change").apply();}
      else
        return $null;
  }
  ESLVal allowRight = new ESLVal(new Function(new ESLVal("allowRight"),null) { public ESLVal apply(ESLVal... args) { return allowRight(); }});
  ESLVal allowLeft() {
    
    if(_v485.ref("left").ref("colour").eql(new ESLVal("RED")).boolVal)
      {_v485.ref("left").ref("change").apply();
      return _v485.ref("right").ref("change").apply();}
      else
        return $null;
  }
  ESLVal allowLeft = new ESLVal(new Function(new ESLVal("allowLeft"),null) { public ESLVal apply(ESLVal... args) { return allowLeft(); }});

          public ESLVal handle(ESLVal $m) {{ESLVal _v480 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v480)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal _v479 = monitorState;
                
                switch(_v479.termName) {
                case "PriorityRight": {
                  if(_v484.ref("prioritise").apply().boolVal)
                  return allowRight();
                  else
                    if(_v483.ref("prioritise").apply().boolVal)
                      return allowLeft();
                      else
                        if(queueRight().boolVal)
                          return allowRight();
                          else
                            return allowLeft();
                }
              case "Even": {
                  return probably(new ESLVal(50),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return allowLeft();
                    }
                  }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return allowRight();
                    }
                  }));
                }
                default: return error(new ESLVal("case error at Pos(10986,11435)").add(ESLVal.list(_v479)));
              }
              }
            }}.get();
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal l1 = newActor(light,new ESLVal(new Actor()),new ESLVal("RED"));
  private static ESLVal l2 = newActor(light,new ESLVal(new Actor()),new ESLVal("GREEN"));
  private static ESLVal left = newActor(approach,new ESLVal(new Actor()),new ESLVal("left"),l1,new ESLVal(20));
  private static ESLVal right = newActor(approach,new ESLVal(new Actor()),new ESLVal("right"),l2,new ESLVal(30));
  private static ESLVal lights = newActor(trafficLights,new ESLVal(new Actor()),l1,l2);
  private static ESLVal m = newActor(mon,new ESLVal(new Actor()),left,right,lights);
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
ESLVal stop = $false;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v481 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v481)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(tLimit).and(stop.not()).boolVal)
            {stop = $true;
            Lib.send(edb,"Filmstrip",new ESLVal("Traffic Filmstrip"),actionsToPictures($zero,$zero,$zero,$zero,actions));
            stopAll.apply();}
            else
              {ESLVal _v482 = $t;
                
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
private static ESLVal actionsToPictures(ESLVal qLeft,ESLVal qRight,ESLVal startLeft,ESLVal startRight,ESLVal as) {
    
    {ESLVal _v470 = as;
      
      if(_v470.isCons())
      {ESLVal $605 = _v470.head();
        ESLVal $606 = _v470.tail();
        
        switch($605.termName) {
        case "ArriveLeft": {
          {ESLVal _v492 = $606;
          
          return actionsToPictures(qLeft.add($one),qRight,startLeft,startRight,_v492).cons(picture(qLeft.add($one),qRight,startLeft,startRight));
        }
        }
      case "ArriveRight": {
          {ESLVal _v491 = $606;
          
          return actionsToPictures(qLeft,qRight.add($one),startLeft,startRight,_v491).cons(picture(qLeft,qRight.add($one),startLeft,startRight));
        }
        }
      case "MoveLeft": {
          {ESLVal _v490 = $606;
          
          return movesRight(startLeft.add($one),actionsToPictures(qLeft.sub($one),qRight,startLeft.add($one),startRight,_v490).cons(picture(qLeft.sub($one),qRight,startLeft.add($one),startRight)));
        }
        }
      case "MoveRight": {
          {ESLVal _v489 = $606;
          
          return movesLeft(startRight.add($one),actionsToPictures(qLeft,qRight.sub($one),startLeft,startRight.add($one),_v489).cons(picture(qLeft,qRight.sub($one),startLeft,startRight.add($one))));
        }
        }
        default: return error(new ESLVal("case error at Pos(1331,1912)").add(ESLVal.list(_v470)));
      }
      }
    else if(_v470.isNil())
      return $nil;
    else return error(new ESLVal("case error at Pos(1331,1912)").add(ESLVal.list(_v470)));
    }
  }
  private static ESLVal actionsToPictures = new ESLVal(new Function(new ESLVal("actionsToPictures"),null) { public ESLVal apply(ESLVal... args) { return actionsToPictures(args[0],args[1],args[2],args[3],args[4]); }});
  private static ESLVal movesRight(ESLVal label,ESLVal ps) {
    
    return exitRight($zero,label,tail.apply(ps)).cons(addCarAtNeckLeft(label,head.apply(ps)));
  }
  private static ESLVal movesRight = new ESLVal(new Function(new ESLVal("movesRight"),null) { public ESLVal apply(ESLVal... args) { return movesRight(args[0],args[1]); }});
  private static ESLVal movesLeft(ESLVal label,ESLVal ps) {
    
    return exitLeft($zero,label,tail.apply(ps)).cons(addCarAtNeckRight(label,head.apply(ps)));
  }
  private static ESLVal movesLeft = new ESLVal(new Function(new ESLVal("movesLeft"),null) { public ESLVal apply(ESLVal... args) { return movesLeft(args[0],args[1]); }});
  private static ESLVal exitRight(ESLVal pos,ESLVal label,ESLVal ds) {
    
    if(pos.eql(maxCarsWaiting).or(ds.eql($nil)).boolVal)
      return ds;
      else
        return exitRight(pos.add($one),label,tail.apply(ds)).cons(addCarOnRight(pos,label,head.apply(ds)));
  }
  private static ESLVal exitRight = new ESLVal(new Function(new ESLVal("exitRight"),null) { public ESLVal apply(ESLVal... args) { return exitRight(args[0],args[1],args[2]); }});
  private static ESLVal exitLeft(ESLVal pos,ESLVal label,ESLVal ds) {
    
    if(pos.eql(maxCarsWaiting).or(ds.eql($nil)).boolVal)
      return ds;
      else
        return exitLeft(pos.add($one),label,tail.apply(ds)).cons(addCarOnLeft(pos,label,head.apply(ds)));
  }
  private static ESLVal exitLeft = new ESLVal(new Function(new ESLVal("exitLeft"),null) { public ESLVal apply(ESLVal... args) { return exitLeft(args[0],args[1],args[2]); }});
  private static ESLVal addCarOnRight(ESLVal pos,ESLVal label,ESLVal d) {
    
    {ESLVal _v471 = d;
      
      switch(_v471.termName) {
      case "Picture": {ESLVal $609 = _v471.termRef(0);
        ESLVal $608 = _v471.termRef(1);
        ESLVal $607 = _v471.termRef(2);
        
        {ESLVal x = $609;
        
        {ESLVal y = $608;
        
        {ESLVal ps = $607;
        
        return new ESLVal("Picture",x,y,carOnRight(pos,label).add(ps));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2651,2731)").add(ESLVal.list(_v471)));
    }
    }
  }
  private static ESLVal addCarOnRight = new ESLVal(new Function(new ESLVal("addCarOnRight"),null) { public ESLVal apply(ESLVal... args) { return addCarOnRight(args[0],args[1],args[2]); }});
  private static ESLVal addCarOnLeft(ESLVal pos,ESLVal label,ESLVal d) {
    
    {ESLVal _v472 = d;
      
      switch(_v472.termName) {
      case "Picture": {ESLVal $612 = _v472.termRef(0);
        ESLVal $611 = _v472.termRef(1);
        ESLVal $610 = _v472.termRef(2);
        
        {ESLVal x = $612;
        
        {ESLVal y = $611;
        
        {ESLVal ps = $610;
        
        return new ESLVal("Picture",x,y,carOnLeft(pos,label).add(ps));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2793,2872)").add(ESLVal.list(_v472)));
    }
    }
  }
  private static ESLVal addCarOnLeft = new ESLVal(new Function(new ESLVal("addCarOnLeft"),null) { public ESLVal apply(ESLVal... args) { return addCarOnLeft(args[0],args[1],args[2]); }});
  private static ESLVal carOnRight(ESLVal pos,ESLVal label) {
    
    return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.add(carSize.add(carSize.mul(pos))))),border.add(width.div(new ESLVal(4))),carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",border.add(waits.add(gapLength.add(carSize.add(carSize.mul(pos).sub(new ESLVal(5)))))),new ESLVal(5).add(border.add(width.div(new ESLVal(4)))),label.add(new ESLVal("")),new ESLVal("")));
  }
  private static ESLVal carOnRight = new ESLVal(new Function(new ESLVal("carOnRight"),null) { public ESLVal apply(ESLVal... args) { return carOnRight(args[0],args[1]); }});
  private static ESLVal carOnLeft(ESLVal pos,ESLVal label) {
    
    return ESLVal.list(new ESLVal("Circle",border.add(waits.sub(carSize.add(carSize.mul(pos)))),border.add(new ESLVal(3).mul(width.div(new ESLVal(4)))),carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",border.add(waits.sub(carSize.add(carSize.mul(pos)).add(new ESLVal(5)))),new ESLVal(5).add(border.add(new ESLVal(3).mul(width.div(new ESLVal(4))))),label.add(new ESLVal("")),new ESLVal("")));
  }
  private static ESLVal carOnLeft = new ESLVal(new Function(new ESLVal("carOnLeft"),null) { public ESLVal apply(ESLVal... args) { return carOnLeft(args[0],args[1]); }});
  private static ESLVal addCarAtNeckLeft(ESLVal label,ESLVal d) {
    
    {ESLVal _v473 = d;
      
      switch(_v473.termName) {
      case "Picture": {ESLVal $615 = _v473.termRef(0);
        ESLVal $614 = _v473.termRef(1);
        ESLVal $613 = _v473.termRef(2);
        
        {ESLVal x = $615;
        
        {ESLVal y = $614;
        
        {ESLVal es = $613;
        
        return new ESLVal("Picture",x,y,neckCarLeft(label).add(es));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3399,3476)").add(ESLVal.list(_v473)));
    }
    }
  }
  private static ESLVal addCarAtNeckLeft = new ESLVal(new Function(new ESLVal("addCarAtNeckLeft"),null) { public ESLVal apply(ESLVal... args) { return addCarAtNeckLeft(args[0],args[1]); }});
  private static ESLVal addCarAtNeckRight(ESLVal label,ESLVal d) {
    
    {ESLVal _v474 = d;
      
      switch(_v474.termName) {
      case "Picture": {ESLVal $618 = _v474.termRef(0);
        ESLVal $617 = _v474.termRef(1);
        ESLVal $616 = _v474.termRef(2);
        
        {ESLVal x = $618;
        
        {ESLVal y = $617;
        
        {ESLVal es = $616;
        
        return new ESLVal("Picture",x,y,neckCarRight(label).add(es));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3534,3612)").add(ESLVal.list(_v474)));
    }
    }
  }
  private static ESLVal addCarAtNeckRight = new ESLVal(new Function(new ESLVal("addCarAtNeckRight"),null) { public ESLVal apply(ESLVal... args) { return addCarAtNeckRight(args[0],args[1]); }});
  private static ESLVal neckCarLeft(ESLVal label) {
    
    return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.div(new ESLVal(2)))),border.add(width.div(new ESLVal(2))),carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",border.add(waits.add(gapLength.div(new ESLVal(2)).sub(new ESLVal(5)))),new ESLVal(5).add(border.add(width.div(new ESLVal(2)))),new ESLVal("").add(label),new ESLVal("")));
  }
  private static ESLVal neckCarLeft = new ESLVal(new Function(new ESLVal("neckCarLeft"),null) { public ESLVal apply(ESLVal... args) { return neckCarLeft(args[0]); }});
  private static ESLVal neckCarRight(ESLVal label) {
    
    return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.div(new ESLVal(2)))),border.add(width.div(new ESLVal(2))),carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",border.add(waits.add(gapLength.div(new ESLVal(2)).sub(new ESLVal(5)))),new ESLVal(5).add(border.add(width.div(new ESLVal(2)))),new ESLVal("").add(label),new ESLVal("")));
  }
  private static ESLVal neckCarRight = new ESLVal(new Function(new ESLVal("neckCarRight"),null) { public ESLVal apply(ESLVal... args) { return neckCarRight(args[0]); }});
  private static ESLVal qLeftPicture(ESLVal cars,ESLVal startLeft) {
    
    if(cars.eql($zero).boolVal)
      return $nil;
      else
        return leftQCarPicture(cars.sub($one),startLeft.add(cars)).add(qLeftPicture(cars.sub($one),startLeft));
  }
  private static ESLVal qLeftPicture = new ESLVal(new Function(new ESLVal("qLeftPicture"),null) { public ESLVal apply(ESLVal... args) { return qLeftPicture(args[0],args[1]); }});
  private static ESLVal qRightPicture(ESLVal cars,ESLVal startRight) {
    
    if(cars.eql($zero).boolVal)
      return $nil;
      else
        return rightQCarPicture(cars.sub($one),startRight.add(cars)).add(qRightPicture(cars.sub($one),startRight));
  }
  private static ESLVal qRightPicture = new ESLVal(new Function(new ESLVal("qRightPicture"),null) { public ESLVal apply(ESLVal... args) { return qRightPicture(args[0],args[1]); }});
  private static ESLVal leftQCarPicture(ESLVal position,ESLVal label) {
    
    {ESLVal x = border.add(waits.sub(carSize.add(carGap).mul(position).add(carSize)));
      ESLVal y = leftCarY;
      
      return ESLVal.list(new ESLVal("Circle",x,y,carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",x.sub(new ESLVal(5)),y.add(new ESLVal(5)),new ESLVal("").add(label),new ESLVal("")));
    }
  }
  private static ESLVal leftQCarPicture = new ESLVal(new Function(new ESLVal("leftQCarPicture"),null) { public ESLVal apply(ESLVal... args) { return leftQCarPicture(args[0],args[1]); }});
  private static ESLVal rightQCarPicture(ESLVal position,ESLVal label) {
    
    {ESLVal x = border.add(waits.add(gapLength.add(carSize.add(carGap).mul(position).add(carSize))));
      ESLVal y = rightCarY;
      
      return ESLVal.list(new ESLVal("Circle",x,y,carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",x.sub(new ESLVal(5)),y.add(new ESLVal(5)),new ESLVal("").add(label),new ESLVal("")));
    }
  }
  private static ESLVal rightQCarPicture = new ESLVal(new Function(new ESLVal("rightQCarPicture"),null) { public ESLVal apply(ESLVal... args) { return rightQCarPicture(args[0],args[1]); }});
  private static ESLVal picture(ESLVal qLeft,ESLVal qRight,ESLVal startLeft,ESLVal startRight) {
    
    return new ESLVal("Picture",pWidth,pHeight,road.add(qLeftPicture(qLeft,startLeft).add(qRightPicture(qRight,startRight))));
  }
  private static ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),null) { public ESLVal apply(ESLVal... args) { return picture(args[0],args[1],args[2],args[3]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}