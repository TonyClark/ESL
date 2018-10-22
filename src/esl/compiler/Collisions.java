package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Collisions { 
  public static ESLVal getSelf() { return $null; }
  private static ESLVal min = new ESLVal(new Function(new ESLVal("min"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  if(x.less(y).boolVal)
        return x;
        else
          return y;
    }
  });
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  if(x.gre(y).boolVal)
        return x;
        else
          return y;
    }
  });
  private static ESLVal followMouse = $false;
  private static ESLVal mouseX = $zero;
  private static ESLVal mouseY = $zero;
  private static ESLVal simulator = new ESLVal(new Function(new ESLVal("simulator"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("simulator")) {
          ESLVal gui = $null;
          ESLVal balls = ESLVal.list();
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "SetGUI": {ESLVal $1 = $m.termRef(0);
              
              {ESLVal g = $1;
              
              {gui = g;
            return $null;}
            }
            }
          case "Start": {
              {balls = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal i = $qualArg;
                  
                  return ESLVal.list(ESLVal.list(newActor(ball,new ESLVal(new Actor()),i,getSelf())));
                }
              }
            }).map($zero.to(gui.ref("size").sub($one))).flatten().flatten();
            return $null;}
            }
          case "Stop": {
              {{
              ESLVal _v1 = balls;
              while(_v1.isCons()) {
                if(_v1.isCons())
                  {ESLVal $6 = _v1.head();
                    ESLVal $7 = _v1.tail();
                    
                    {ESLVal ball = $6;
                    
                    {ESLVal _v2 = $7;
                    
                    {_v1 = _v2;
                  kill.apply(ball);}
                  }
                  }
                  }
                else if(_v1.isNil())
                  error(new ESLVal("case error at Pos(815,859)"));
                else error(new ESLVal("case error at Pos(815,859)"));
                }
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
          case "MouseMoved": {ESLVal $2 = $m.termRef(0);
              ESLVal $3 = $m.termRef(1);
              
              {ESLVal x = $2;
              
              {ESLVal y = $3;
              
              {mouseX = x;
            {mouseY = y;
            return $null;}}
            }
            }
            }
          case "MouseClick": {ESLVal $4 = $m.termRef(0);
              ESLVal $5 = $m.termRef(1);
              
              {ESLVal x = $4;
              
              {ESLVal y = $5;
              
              if(followMouse.boolVal)
              {followMouse = $false;
              {{
                ESLVal _v3 = balls;
                while(_v3.isCons()) {
                  if(_v3.isCons())
                    {ESLVal $8 = _v3.head();
                      ESLVal $9 = _v3.tail();
                      
                      {ESLVal ball = $8;
                      
                      {ESLVal _v4 = $9;
                      
                      {_v3 = _v4;
                    Lib.send(ball,"Bang",x,y);}
                    }
                    }
                    }
                  else if(_v3.isNil())
                    error(new ESLVal("case error at Pos(1129,1192)"));
                  else error(new ESLVal("case error at Pos(1129,1192)"));
                  }
              }
              return $null;}}
              else
                {followMouse = $true;
                return $null;}
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "gui": return gui;
              case "balls": return balls;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal t = $t;
            
            if($true.boolVal)
            {}
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
  private static ESLVal ball = new ESLVal(new Function(new ESLVal("ball"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal id = $args[0];
  ESLVal simulator = $args[1];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("ball")) {
          ESLVal x = random.apply(simulator.ref("gui").ref("width"));
          ESLVal y = random.apply(simulator.ref("gui").ref("height"));
          ESLVal dx = random.apply(new ESLVal(3)).sub(new ESLVal(2));
          ESLVal dy = random.apply(new ESLVal(3)).sub(new ESLVal(2));
          ESLVal checkDeltas = new ESLVal(new Function(new ESLVal("checkDeltas"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            if(dx.eql($zero).and(dy.eql($zero)).boolVal)
                  {dx = random.apply(new ESLVal(3)).sub(new ESLVal(2)).mul(n);
                  dy = random.apply(new ESLVal(3)).sub(new ESLVal(2)).mul(n);
                  return checkDeltas.apply(n.add($one));}
                  else
                    return $null;
              }
            });
          ESLVal hitWalls = new ESLVal(new Function(new ESLVal("hitWalls"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {if(x.add(dx.add(simulator.ref("gui").ref("ballSize"))).gre(simulator.ref("gui").ref("width")).boolVal)
                  dx = $zero.sub(dx);
                  else
                    if(x.add(dx).less($zero).boolVal)
                      dx = $zero.sub(dx);
                      else
                        if(y.add(dy.add(simulator.ref("gui").ref("ballSize"))).gre(simulator.ref("gui").ref("height")).boolVal)
                          dy = $zero.sub(dy);
                          else
                            if(y.add(dy).less($zero).boolVal)
                              dy = $zero.sub(dy);
                              else
                                {}
                return $null;}
              }
            });
          ESLVal overlaps = new ESLVal(new Function(new ESLVal("overlaps"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x1 = $args[0];
            ESLVal y1 = $args[1];
            ESLVal x2 = $args[2];
            ESLVal y2 = $args[3];
            return x1.gre(x2).andalso(x1.less(x2.add(simulator.ref("gui").ref("ballSize")))).andalso(y1.gre(y2).andalso(y1.less(y2.add(simulator.ref("gui").ref("ballSize"))))).orelse(x2.gre(x1).andalso(x2.less(x1.add(simulator.ref("gui").ref("ballSize")))).andalso(y2.gre(y1).andalso(y2.less(y1.add(simulator.ref("gui").ref("ballSize"))))));
              }
            });
          ESLVal hitBalls = new ESLVal(new Function(new ESLVal("hitBalls"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(simulator.ref("gui").ref("isOccupied").apply(id,x.add(dx),y.add(dy)).boolVal)
                  {dx = $zero.sub(dx);
                  {dy = $zero.sub(dy);
                  return $null;}}
                  else
                    return $null;
              }
            });
          ESLVal moveTowardsMouse = new ESLVal(new Function(new ESLVal("moveTowardsMouse"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {if(mouseX.less(x).boolVal)
                  x = x.sub(random.apply(new ESLVal(10)));
                  else
                    x = x.add(random.apply(new ESLVal(10)));
                if(mouseY.less(y).boolVal)
                  y = y.sub(random.apply(new ESLVal(10)));
                  else
                    y = y.add(random.apply(new ESLVal(10)));
                return Lib.send(simulator.ref("gui"),"Draw",id,x,y);}
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Bang": {ESLVal $10 = $m.termRef(0);
              ESLVal $11 = $m.termRef(1);
              
              {ESLVal bx = $10;
              
              {ESLVal by = $11;
              
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
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
              moveTowardsMouse.apply();
              else
                {hitWalls.apply();
                hitBalls.apply();
                x = max.apply($zero,min.apply(x.add(dx),simulator.ref("gui").ref("width")));
                y = max.apply($zero,min.apply(y.add(dy),simulator.ref("gui").ref("height")));
                Lib.send(simulator.ref("gui"),"Draw",id,x,y);}
            else
              {}
          }
        }
        public ESLVal init() {
            return checkDeltas.apply(new ESLVal(2));
          }
        });
    }
  });
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
            
            if($true.boolVal)
            {}
            else
              {}
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {print.apply(new ESLVal("about to create"));
                return edb.ref("display").apply(new ESLVal("Collisions"),newJavaActor("esl.collisions.CollisionFrame",newActor(simulator,new ESLVal(new Actor()))));}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}