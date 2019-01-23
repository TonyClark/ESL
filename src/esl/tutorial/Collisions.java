package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Collisions {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal followMouse = $false;
  private static ESLVal mouseX = $zero;
  private static ESLVal mouseY = $zero;
  private static ESLVal simulator = new ESLVal(new Function(new ESLVal("simulator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("simulator")) {
          
ESLVal gui = $null;
          ESLVal balls = $nil;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v98 = $m;
            
            switch(_v98.termName) {
            case "SetGUI": {ESLVal $138 = _v98.termRef(0);
              
              {ESLVal g = $138;
              
              {gui = g;
            return $null;}
            }
            }
          case "Start": {
              {balls = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal i = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newActor(ball,new ESLVal(new Actor()),i,getSelf()));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(gui.ref("size").sub($one)));
            return $null;}
            }
          case "Stop": {
              {{
              ESLVal _v100 = balls;
              while(_v100.isCons()) {
                ESLVal ball = _v100.headVal;
                kill.apply(ball);
                _v100 = _v100.tailVal;}
            }
            return $null;}
            }
          case "Close": {
              return stopAll.apply();
            }
          case "MouseEnter": {
              {followMouse = $true;
            return $null;}
            }
          case "MouseExit": {
              {followMouse = $false;
            return $null;}
            }
          case "MouseMoved": {ESLVal $137 = _v98.termRef(0);
              ESLVal $136 = _v98.termRef(1);
              
              {ESLVal x = $137;
              
              {ESLVal y = $136;
              
              {mouseX = x;
            {mouseY = y;
            return $null;}}
            }
            }
            }
          case "MouseClick": {ESLVal $135 = _v98.termRef(0);
              ESLVal $134 = _v98.termRef(1);
              
              {ESLVal x = $135;
              
              {ESLVal y = $134;
              
              if(followMouse.boolVal)
              {followMouse = $false;
              {{
                ESLVal _v99 = balls;
                while(_v99.isCons()) {
                  ESLVal ball = _v99.headVal;
                  Lib.send(ball,"Bang",x,y);
                  _v99 = _v99.tailVal;}
              }
              return $null;}}
              else
                {followMouse = $true;
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v98)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "gui": return gui;
              case "balls": return balls;
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
  private static ESLVal ball = new ESLVal(new Function(new ESLVal("ball"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v103 = $args[0];
  ESLVal _v104 = $args[1];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("ball")) {
          ESLVal checkDeltas(ESLVal n) {
    
    if(dx.eql($zero).and(dy.eql($zero)).boolVal)
      {dx = random.apply(new ESLVal(3)).sub(new ESLVal(2)).mul(n);
      dy = random.apply(new ESLVal(3)).sub(new ESLVal(2)).mul(n);
      return checkDeltas(n.add($one));}
      else
        return $null;
  }
  ESLVal checkDeltas = new ESLVal(new Function(new ESLVal("checkDeltas"),null) { public ESLVal apply(ESLVal... args) { return checkDeltas(args[0]); }});
  ESLVal hitWalls() {
    
    {if(x.add(dx.add(_v104.ref("gui").ref("ballSize"))).gre(_v104.ref("gui").ref("width")).boolVal)
      dx = $zero.sub(dx);
      else
        if(x.add(dx).less($zero).boolVal)
          dx = $zero.sub(dx);
          else
            if(y.add(dy.add(_v104.ref("gui").ref("ballSize"))).gre(_v104.ref("gui").ref("height")).boolVal)
              dy = $zero.sub(dy);
              else
                if(y.add(dy).less($zero).boolVal)
                  dy = $zero.sub(dy);
                  else
                    {}
    return $null;}
  }
  ESLVal hitWalls = new ESLVal(new Function(new ESLVal("hitWalls"),null) { public ESLVal apply(ESLVal... args) { return hitWalls(); }});
  ESLVal overlaps(ESLVal x1,ESLVal y1,ESLVal x2,ESLVal y2) {
    
    return x1.gre(x2).andalso(x1.less(x2.add(_v104.ref("gui").ref("ballSize")))).andalso(y1.gre(y2).andalso(y1.less(y2.add(_v104.ref("gui").ref("ballSize"))))).orelse(x2.gre(x1).andalso(x2.less(x1.add(_v104.ref("gui").ref("ballSize")))).andalso(y2.gre(y1).andalso(y2.less(y1.add(_v104.ref("gui").ref("ballSize"))))));
  }
  ESLVal overlaps = new ESLVal(new Function(new ESLVal("overlaps"),null) { public ESLVal apply(ESLVal... args) { return overlaps(args[0],args[1],args[2],args[3]); }});
  ESLVal hitBalls() {
    
    if(_v104.ref("gui").ref("isOccupied").apply(_v103,x.add(dx),y.add(dy)).boolVal)
      {dx = $zero.sub(dx);
      {dy = $zero.sub(dy);
      return $null;}}
      else
        return $null;
  }
  ESLVal hitBalls = new ESLVal(new Function(new ESLVal("hitBalls"),null) { public ESLVal apply(ESLVal... args) { return hitBalls(); }});
  ESLVal moveTowardsMouse() {
    
    {if(mouseX.less(x).boolVal)
      x = x.sub(random.apply(new ESLVal(10)));
      else
        x = x.add(random.apply(new ESLVal(10)));
    if(mouseY.less(y).boolVal)
      y = y.sub(random.apply(new ESLVal(10)));
      else
        y = y.add(random.apply(new ESLVal(10)));
    return Lib.send(_v104.ref("gui"),"Draw",_v103,x,y);}
  }
  ESLVal moveTowardsMouse = new ESLVal(new Function(new ESLVal("moveTowardsMouse"),null) { public ESLVal apply(ESLVal... args) { return moveTowardsMouse(); }});
ESLVal x = random.apply(_v104.ref("gui").ref("width"));
          ESLVal y = random.apply(_v104.ref("gui").ref("height"));
          ESLVal dx = random.apply(new ESLVal(3)).sub(new ESLVal(2));
          ESLVal dy = random.apply(new ESLVal(3)).sub(new ESLVal(2));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v101 = $m;
            
            switch(_v101.termName) {
            case "Bang": {ESLVal $140 = _v101.termRef(0);
              ESLVal $139 = _v101.termRef(1);
              
              {ESLVal bx = $140;
              
              {ESLVal by = $139;
              
              {if(x.less(bx).boolVal)
              dx = random.apply(new ESLVal(5));
              else
                dx = $zero.sub(random.apply(new ESLVal(5)));
            if(y.less(by).boolVal)
              dy = random.apply(new ESLVal(5));
              else
                dy = $zero.sub(random.apply(new ESLVal(5)));
            x = x.add(dx.mul(new ESLVal(50)));
            {y = y.add(dy.mul(new ESLVal(50)));
            return $null;}}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v101)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "x": return x;
              case "y": return y;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            if(followMouse.boolVal)
              moveTowardsMouse();
              else
                {hitWalls();
                hitBalls();
                x = max($zero,min(x.add(dx),_v104.ref("gui").ref("width")));
                y = max($zero,min(y.add(dy),_v104.ref("gui").ref("height")));
                Lib.send(_v104.ref("gui"),"Draw",_v103,x,y);}
            else
              {}
          }
        }
        public ESLVal init() {
            return checkDeltas(new ESLVal(2));
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v102 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v102)));
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
            return edb.ref("display").apply(new ESLVal("Collisions"),newJavaActor("esl.collisions.CollisionFrame",newActor(simulator,new ESLVal(new Actor()))));
          }
        });
    }
  });
private static ESLVal min(ESLVal x,ESLVal y) {
    
    if(x.less(y).boolVal)
      return x;
      else
        return y;
  }
  private static ESLVal min = new ESLVal(new Function(new ESLVal("min"),null) { public ESLVal apply(ESLVal... args) { return min(args[0],args[1]); }});
  private static ESLVal max(ESLVal x,ESLVal y) {
    
    if(x.gre(y).boolVal)
      return x;
      else
        return y;
  }
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),null) { public ESLVal apply(ESLVal... args) { return max(args[0],args[1]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}