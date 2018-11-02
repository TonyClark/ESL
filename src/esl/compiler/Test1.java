package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Test1 {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal empty = new ESLVal(new Function(new ESLVal("empty"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("empty")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
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
  private static ESLVal point = new ESLVal(new Function(new ESLVal("point"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] x = new ESLVal[]{$args[0]};
  ESLVal[] y = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("point")) {
          ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return x[0];
              }
            });
          ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return y[0];
              }
            });
          ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal nx = $args[0];
            {x[0] = nx;
                return $null;}
              }
            });
          ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal ny = $args[0];
            {y[0] = ny;
                return $null;}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            switch(_v3.termName) {
            case "Move2D": {ESLVal $6 = _v3.termRef(0);
              ESLVal $5 = _v3.termRef(1);
              
              {ESLVal dx = $6;
              
              {ESLVal dy = $5;
              
              {setX.apply(x[0].add(dx));
            return setY.apply(y[0].add(dy));}
            }
            }
            }
          case "Show": {
              return print.apply(new ESLVal("(").add(x[0].add(new ESLVal(",").add(y[0].add(new ESLVal(")"))))));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "setX": return setX;
              case "setY": return setY;
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
  private static ESLVal point3D = new ESLVal(new Function(new ESLVal("point3D"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal[] z = new ESLVal[]{$args[2]};
  return new ESLVal(new BehaviourAdapter(point.apply(x,y),true,getSelf(),new ESLVal("point3D")) {
          ESLVal getZ = new ESLVal(new Function(new ESLVal("getZ"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return z[0];
              }
            });
          ESLVal setZ = new ESLVal(new Function(new ESLVal("setZ"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal nz = $args[0];
            {z[0] = nz;
                return $null;}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "Move3D": {ESLVal $4 = _v2.termRef(0);
              ESLVal $3 = _v2.termRef(1);
              ESLVal $2 = _v2.termRef(2);
              
              {ESLVal dx = $4;
              
              {ESLVal dy = $3;
              
              {ESLVal dz = $2;
              
              {sendSuper(new ESLVal("Move2D",dx,dy));
            return setZ.apply(z[0].add(dz));}
            }
            }
            }
            }
          case "Show": {
              return print.apply(new ESLVal("(").add(refSuper("getX").apply().add(new ESLVal(",").add(refSuper("getY").apply().add(new ESLVal(",").add(z[0].add(new ESLVal(")"))))))));
            }
            default: {ESLVal _v5 = _v2;
              
              {sendSuper(_v5);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getZ": return getZ;
              case "setZ": return setZ;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal $ = $t;
            
            if($true.boolVal)
            sendTimeSuper($t);
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
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            switch(_v1.termName) {
            case "K": {ESLVal $1 = _v1.termRef(0);
              
              {ESLVal l = $1;
              
              return $null;
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
            return ((Supplier<ESLVal>)() -> { 
                {ESLVal p = newActor(point3D,new ESLVal(new Actor()),$one,new ESLVal(2),new ESLVal(3));
                  
                  {Lib.send(p,"Show");
                Lib.send(p,"Move3D",new ESLVal(10),new ESLVal(10),new ESLVal(10));
                wait.apply(new ESLVal(1000));
                Lib.send(p,"Show");
                return stopAll.apply();}
                }
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}