package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Util.*;
public class Pac {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal player = new ESLVal(new Function(new ESLVal("player"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] _v227 = new ESLVal[]{$args[0]};
  ESLVal[] _v228 = new ESLVal[]{$args[1]};
  ESLVal _v229 = $args[2];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("player")) {
          ESLVal getX() {
    
    return _v227[0];
  }
  ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),null) { public ESLVal apply(ESLVal... args) { return getX(); }});
  ESLVal getY() {
    
    return _v228[0];
  }
  ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),null) { public ESLVal apply(ESLVal... args) { return getY(); }});
  ESLVal setX(ESLVal v) {
    
    {_v227[0] = v;
    return $null;}
  }
  ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),null) { public ESLVal apply(ESLVal... args) { return setX(args[0]); }});
  ESLVal setY(ESLVal v) {
    
    {_v228[0] = v;
    return $null;}
  }
  ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),null) { public ESLVal apply(ESLVal... args) { return setY(args[0]); }});
  ESLVal moveTo(ESLVal v1,ESLVal v2) {
    
    {_v227[0] = v1;
    {_v228[0] = v2;
    return $null;}}
  }
  ESLVal moveTo = new ESLVal(new Function(new ESLVal("moveTo"),null) { public ESLVal apply(ESLVal... args) { return moveTo(args[0],args[1]); }});
  ESLVal getMaze() {
    
    return _v229;
  }
  ESLVal getMaze = new ESLVal(new Function(new ESLVal("getMaze"),null) { public ESLVal apply(ESLVal... args) { return getMaze(); }});
  ESLVal move() {
    
    return error(new ESLVal("abstract operation move"));
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});
  ESLVal canMove(ESLVal _v232,ESLVal _v233) {
    
    return _v229.ref("legalPos").apply(_v232,_v233).or(_v229.ref("atHome").apply(_v232,_v233));
  }
  ESLVal canMove = new ESLVal(new Function(new ESLVal("canMove"),null) { public ESLVal apply(ESLVal... args) { return canMove(args[0],args[1]); }});
  ESLVal deltaOK(ESLVal dx,ESLVal dy) {
    
    return dx.eql($zero).and(dy.eql($zero)).not();
  }
  ESLVal deltaOK = new ESLVal(new Function(new ESLVal("deltaOK"),null) { public ESLVal apply(ESLVal... args) { return deltaOK(args[0],args[1]); }});
  ESLVal initPlans() {
    
    return ESLVal.list(ESLVal.list(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply())));
  }
  ESLVal initPlans = new ESLVal(new Function(new ESLVal("initPlans"),null) { public ESLVal apply(ESLVal... args) { return initPlans(); }});
  ESLVal getBestPlan(ESLVal better,ESLVal plans) {
    
    return select1(plans,$null,new ESLVal(new Function(new ESLVal("fun61"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal p1 = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun62"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p2 = $args[0];
            return p1.neql(p2).and(better.apply(p2,p1));
              }
            }),plans).not();
        }
      }));
  }
  ESLVal getBestPlan = new ESLVal(new Function(new ESLVal("getBestPlan"),null) { public ESLVal apply(ESLVal... args) { return getBestPlan(args[0],args[1]); }});
  ESLVal plan(ESLVal maxLength,ESLVal better,ESLVal goal,ESLVal pred,ESLVal moves,ESLVal plans) {
    
    if(plans.eql($nil).boolVal)
      return $null;
      else
        if(maxLength.less($zero).boolVal)
          return getBestPlan(better,plans);
          else
            {ESLVal p = goal.apply(plans);
              
              if(p.eql($null).boolVal)
              return plan(maxLength.sub($one),better,goal,pred,moves,new SerializableFunction<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal p = $l0.head();
                      $l0 = $l0.tail();
                      if(pred.apply(p).boolVal) {$v.add(p);
                }
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(addMoves(plans,moves)));
              else
                return p;
            }
  }
  ESLVal plan = new ESLVal(new Function(new ESLVal("plan"),null) { public ESLVal apply(ESLVal... args) { return plan(args[0],args[1],args[2],args[3],args[4],args[5]); }});
  ESLVal hasMove(ESLVal m) {
    
    return new ESLVal(new Function(new ESLVal("fun63"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal p = $args[0];
      return member.apply(m,p);
        }
      });
  }
  ESLVal hasMove = new ESLVal(new Function(new ESLVal("hasMove"),null) { public ESLVal apply(ESLVal... args) { return hasMove(args[0]); }});
  ESLVal addMoves(ESLVal plans,ESLVal moves) {
    
    return new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal p = $l0.head();
            $l0 = $l0.tail();
            ESLVal $l1 = moves.apply(p);
      while(!$l1.isNil()) {
        ESLVal m = $l1.head();
        $l1 = $l1.tail();
        if(exists.apply(hasMove(m),plans).not().boolVal) {$v.add(p.cons(m));
        }
      }
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(plans);
  }
  ESLVal addMoves = new ESLVal(new Function(new ESLVal("addMoves"),null) { public ESLVal apply(ESLVal... args) { return addMoves(args[0],args[1]); }});
ESLVal deltas = ESLVal.list(new ESLVal(-1),$zero,$one);
          ESLVal moves = cache(head,new ESLVal(new Function(new ESLVal("fun64"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v166 = head.apply(p);
                  
                  switch(_v166.termName) {
                  case "Loc": {ESLVal $231 = _v166.termRef(0);
                    ESLVal $230 = _v166.termRef(1);
                    
                    {ESLVal _v230 = $231;
                    
                    {ESLVal _v231 = $230;
                    
                    {ESLVal locs = new SerializableFunction<ESLVal,ESLVal>() {
                        public ESLVal apply(ESLVal $l0) {
                          ESLVal $a = $nil;
                          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                          while(!$l0.isNil()) { 
                            ESLVal dx = $l0.head();
                            $l0 = $l0.tail();
                            ESLVal $l1 = deltas;
                      while(!$l1.isNil()) {
                        ESLVal dy = $l1.head();
                        $l1 = $l1.tail();
                        if(getSelf().ref("deltaOK").apply(dx,dy).boolVal) {if(canMove(_v230.add(dx),_v231.add(dy)).boolVal) {$v.add(new ESLVal("Loc",_v230.add(dx),_v231.add(dy)));
                        }
                        }
                      }
                          }
                          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                          return $a;
                        }}.apply(deltas);
                    
                    return locs;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(3939,4141)").add(ESLVal.list(_v166)));
                }
                }
              }
            }));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v167 = $m;
            
            switch(_v167.termName) {
            case "Start": {
              return error(new ESLVal("abstract message Start"));
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v167)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "setX": return setX;
              case "setY": return setY;
              case "moveTo": return moveTo;
              case "getMaze": return getMaze;
              case "move": return move;
              case "canMove": return canMove;
              case "moves": return moves;
              case "plan": return plan;
              case "deltaOK": return deltaOK;
              case "initPlans": return initPlans;
              case "deltas": return deltas;
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
  private static ESLVal cellWidth = new ESLVal(20);
  private static ESLVal cellHeight = new ESLVal(20);
  private static ESLVal maxWidth = new ESLVal(29);
  private static ESLVal maxHeight = new ESLVal(27);
  private static ESLVal delay = new ESLVal(50);
  private static ESLVal cellEmpty = $zero;
  private static ESLVal legalCell = new ESLVal(2);
  private static ESLVal homeCell = new ESLVal(3);
  private static ESLVal hWall = new ESLVal(4);
  private static ESLVal vWall = new ESLVal(5);
  private static ESLVal topLeftCorner = new ESLVal(6);
  private static ESLVal topRightCorner = new ESLVal(7);
  private static ESLVal bottomLeftCorner = new ESLVal(8);
  private static ESLVal bottomRightCorner = new ESLVal(9);
  private static ESLVal timeLimit = new ESLVal(70000);
  private static ESLVal ghost = new ESLVal(new Function(new ESLVal("ghost"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal homeX = $args[2];
  ESLVal homeY = $args[3];
  ESLVal gType = $args[4];
  ESLVal m = $args[5];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),player,x,y,m),true,getSelf(),new ESLVal("ghost")) {
          ESLVal switchMode(ESLVal s) {
    
    {state = s;
    {modeCount = changeMode;
    return $null;}}
  }
  ESLVal switchMode = new ESLVal(new Function(new ESLVal("switchMode"),null) { public ESLVal apply(ESLVal... args) { return switchMode(args[0]); }});
  ESLVal deltaOK(ESLVal dx,ESLVal dy) {
    
    return refSuper("deltaOK").apply(dx,dy).and(dx.eql($zero).or(dy.eql($zero)));
  }
  ESLVal deltaOK = new ESLVal(new Function(new ESLVal("deltaOK"),null) { public ESLVal apply(ESLVal... args) { return deltaOK(args[0],args[1]); }});
  ESLVal move() {
    
    { LetRec letrec = new LetRec() {
      ESLVal planDistance = new ESLVal(new Function(new ESLVal("planDistance"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v219 = $args[0];
        ESLVal _v220 = $args[1];
        ESLVal _v221 = $args[2];
        {ESLVal _v168 = head.apply(_v219);
              
              switch(_v168.termName) {
              case "Loc": {ESLVal $233 = _v168.termRef(0);
                ESLVal $232 = _v168.termRef(1);
                
                {ESLVal x0 = $233;
                
                {ESLVal y0 = $232;
                
                return distance(_v220,_v221,x0,y0);
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(7915,7971)").add(ESLVal.list(_v168)));
            }
            }
          }
        });
      ESLVal pred = new ESLVal(new Function(new ESLVal("pred"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p = $args[0];
        return $true;
          }
        });
      ESLVal better = new ESLVal(new Function(new ESLVal("better"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal goalX = $args[0];
        ESLVal goalY = $args[1];
        return new ESLVal(new Function(new ESLVal("fun67"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal p1 = $args[0];
              ESLVal p2 = $args[1];
              return planDistance.apply(p1,goalX,goalY).less(planDistance.apply(p2,goalX,goalY));
                }
              });
          }
        });
      ESLVal at = new ESLVal(new Function(new ESLVal("at"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal goalX = $args[0];
        ESLVal goalY = $args[1];
        return new ESLVal(new Function(new ESLVal("fun68"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal plans = $args[0];
              return select1(plans,$null,new ESLVal(new Function(new ESLVal("fun69"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal p = $args[0];
                    return head.apply(p).eql(new ESLVal("Loc",goalX,goalY));
                      }
                    }));
                }
              });
          }
        });
      ESLVal getMove = new ESLVal(new Function(new ESLVal("getMove"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal goalX = $args[0];
        ESLVal goalY = $args[1];
        {ESLVal _v169 = getSelf().ref("plan").apply(new ESLVal(8),better.apply(goalX,goalY),at.apply(goalX,goalY),pred,getSelf().ref("moves"),getSelf().ref("initPlans").apply());
              
              if(_v169.isCons())
              {ESLVal $234 = _v169.head();
                ESLVal $235 = _v169.tail();
                
                if($235.isCons())
                {ESLVal $236 = $235.head();
                  ESLVal $237 = $235.tail();
                  
                  {ESLVal p = _v169;
                  
                  if(p.eql($null).boolVal)
                  return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                  else
                    {ESLVal _v215 = _v169;
                      
                      return last.apply(butlast.apply(_v215));
                    }
                }
                }
              else if($235.isNil())
                {ESLVal l = $234;
                  
                  return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                }
              else {ESLVal p = _v169;
                  
                  if(p.eql($null).boolVal)
                  return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                  else
                    {ESLVal _v216 = _v169;
                      
                      return last.apply(butlast.apply(_v216));
                    }
                }
              }
            else if(_v169.isNil())
              {ESLVal p = _v169;
                
                if(p.eql($null).boolVal)
                return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                else
                  {ESLVal _v217 = _v169;
                    
                    return last.apply(butlast.apply(_v217));
                  }
              }
            else {ESLVal p = _v169;
                
                if(p.eql($null).boolVal)
                return new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                else
                  {ESLVal _v218 = _v169;
                    
                    return last.apply(butlast.apply(_v218));
                  }
              }
            }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "planDistance": return planDistance;
          
          case "pred": return pred;
          
          case "better": return better;
          
          case "at": return at;
          
          case "getMove": return getMove;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal planDistance = letrec.get("planDistance");
    
    ESLVal pred = letrec.get("pred");
    
    ESLVal better = letrec.get("better");
    
    ESLVal at = letrec.get("at");
    
    ESLVal getMove = letrec.get("getMove");
    
      {ESLVal _v170 = state;
      
      switch(_v170.termName) {
      case "Scatter": {
        if(modeCount.gre($zero).boolVal)
        {ESLVal _v172 = getMove.apply(homeX,homeY);
          
          switch(_v172.termName) {
          case "Loc": {ESLVal $241 = _v172.termRef(0);
            ESLVal $240 = _v172.termRef(1);
            
            {ESLVal _v224 = $241;
            
            {ESLVal _v225 = $240;
            
            {getSelf().ref("moveTo").apply(_v224,_v225);
          {modeCount = modeCount.sub($one);
          return $null;}}
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(8907,9070)").add(ESLVal.list(_v172)));
        }
        }
        else
          return switchMode(new ESLVal("Chase",new ESLVal[]{}));
      }
    case "Chase": {
        if(modeCount.gre($zero).boolVal)
        {ESLVal _v171 = getMove.apply(m.ref("getPacman").apply().ref("getX").apply(),m.ref("getPacman").apply().ref("getY").apply());
          
          switch(_v171.termName) {
          case "Loc": {ESLVal $239 = _v171.termRef(0);
            ESLVal $238 = _v171.termRef(1);
            
            {ESLVal _v222 = $239;
            
            {ESLVal _v223 = $238;
            
            {getSelf().ref("moveTo").apply(_v222,_v223);
          {modeCount = modeCount.sub($one);
          return $null;}}
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(9205,9397)").add(ESLVal.list(_v171)));
        }
        }
        else
          return switchMode(new ESLVal("Scatter",new ESLVal[]{}));
      }
      default: return error(new ESLVal("case error at Pos(8786,9443)").add(ESLVal.list(_v170)));
    }
    }}
    
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});
ESLVal ghostType = gType;
          ESLVal state = new ESLVal("Chase",new ESLVal[]{});
          ESLVal changeMode = new ESLVal(15);
          ESLVal modeCount = changeMode;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v173 = $m;
            
            switch(_v173.termName) {
            case "Start": {
              return Lib.send(m,"RegisterGhost",getSelf());
            }
            default: {ESLVal _v226 = _v173;
              
              {sendSuper(_v226);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "ghostType": return ghostType;
              case "move": return move;
              case "deltaOK": return deltaOK;
              default: return refSuper(name);
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
  private static ESLVal ghost1 = new ESLVal(new Function(new ESLVal("ghost1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,$one,$one,$zero,m),true,getSelf(),new ESLVal("ghost1")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v174 = $m;
            
            {ESLVal _v214 = _v174;
            
            {sendSuper(_v214);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
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
  private static ESLVal ghost2 = new ESLVal(new Function(new ESLVal("ghost2"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,$one,maxHeight.sub(new ESLVal(2)),$one,m),true,getSelf(),new ESLVal("ghost2")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v175 = $m;
            
            {ESLVal _v213 = _v175;
            
            {sendSuper(_v213);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
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
  private static ESLVal ghost3 = new ESLVal(new Function(new ESLVal("ghost3"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,maxWidth.sub(new ESLVal(2)),$one,new ESLVal(2),m),true,getSelf(),new ESLVal("ghost3")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v176 = $m;
            
            {ESLVal _v212 = _v176;
            
            {sendSuper(_v212);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
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
  private static ESLVal ghost4 = new ESLVal(new Function(new ESLVal("ghost4"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),ghost,x,y,maxWidth.sub(new ESLVal(2)),maxHeight.sub(new ESLVal(2)),new ESLVal(3),m),true,getSelf(),new ESLVal("ghost4")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v177 = $m;
            
            {ESLVal _v211 = _v177;
            
            {sendSuper(_v211);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
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
  private static ESLVal pacman = new ESLVal(new Function(new ESLVal("pacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),player,x,y,m),true,getSelf(),new ESLVal("pacman")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v178 = $m;
            
            switch(_v178.termName) {
            case "Start": {
              return Lib.send(m,"RegisterPacman",getSelf());
            }
            default: {ESLVal _v210 = _v178;
              
              {sendSuper(_v210);
            return $null;}
            }
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: return refSuper(name);
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
  private static ESLVal playerPacman = new ESLVal(new Function(new ESLVal("playerPacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),pacman,x,y,m),true,getSelf(),new ESLVal("playerPacman")) {
          ESLVal move() {
    
    {ESLVal mouseX = gui.ref("mouseX");
      ESLVal mouseY = gui.ref("mouseY");
      
      {ESLVal dx = mouseX.sub(getSelf().ref("getX").apply());
      ESLVal dy = mouseY.sub(getSelf().ref("getY").apply());
      
      {ESLVal mx = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(dx.gre($zero).boolVal)
            return $one;
            else
              if(dx.less($zero).boolVal)
                return new ESLVal(-1);
                else
                  return $zero;
        }}.get();
      ESLVal my = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
          if(dy.gre($zero).boolVal)
            return $one;
            else
              if(dy.less($zero).boolVal)
                return new ESLVal(-1);
                else
                  return $zero;
        }}.get();
      
      {if(mx.neql($zero).and(m.ref("legalPos").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply())).boolVal)
      getSelf().ref("setX").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth));
      else
        if(my.neql($zero).and(m.ref("legalPos").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply().add(my))).boolVal)
          getSelf().ref("setY").apply(getSelf().ref("getY").apply().add(my));
          else
            if(m.ref("legalPos").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply().add(my)).boolVal)
              getSelf().ref("moveTo").apply(getSelf().ref("getX").apply().add(mx).mod(maxWidth),getSelf().ref("getY").apply().add(my));
              else
                if(getSelf().ref("getX").apply().add(mx).eql($zero).and(m.ref("legalPos").apply($zero,getSelf().ref("getY").apply())).boolVal)
                  getSelf().ref("setX").apply(maxWidth.sub($one));
                  else
                    {}
    Lib.send(gui,"Player",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
    m.ref("eat").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
    return wait.apply(delay);}
    }
    }
    }
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});

          public ESLVal handle(ESLVal $m) {{ESLVal _v179 = $m;
            
            {ESLVal _v209 = _v179;
            
            {sendSuper(_v209);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "move": return move;
              default: return refSuper(name);
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
  private static ESLVal autoPacman = new ESLVal(new Function(new ESLVal("autoPacman"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  ESLVal m = $args[2];
  return new ESLVal(new BehaviourAdapter(getParent(getSelf(),pacman,x,y,m),true,getSelf(),new ESLVal("autoPacman")) {
          ESLVal moves(ESLVal p) {
    
    return new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal p = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Loc",new SerializableSupplier<ESLVal>() { public ESLVal get() { 
        if(locX(p).eql($zero).boolVal)
          return maxWidth.sub($one);
          else
            return locX(p);
      }}.get(),locY(p)));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(refSuper("moves").apply(p));
  }
  ESLVal moves = new ESLVal(new Function(new ESLVal("moves"),null) { public ESLVal apply(ESLVal... args) { return moves(args[0]); }});
  ESLVal ghostDistance(ESLVal l) {
    
    return min(new ESLVal(1000.0),new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal g = $l0.head();
            $l0 = $l0.tail();
            $v.add(distance(locX(l),locY(l),g.ref("getX").apply(),g.ref("getY").apply()));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(m.ref("getGhosts").apply()));
  }
  ESLVal ghostDistance = new ESLVal(new Function(new ESLVal("ghostDistance"),null) { public ESLVal apply(ESLVal... args) { return ghostDistance(args[0]); }});
  ESLVal dangerous(ESLVal dangerZones) {
    
    return new ESLVal(new Function(new ESLVal("fun70"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal p = $args[0];
      {ESLVal canReach = take(dangerZones,length.apply(p).add($one));
            
            return exists.apply(new ESLVal(new Function(new ESLVal("fun71"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal zone = $args[0];
            return member.apply(head.apply(p),zone);
              }
            }),canReach).not();
          }
        }
      });
  }
  ESLVal dangerous = new ESLVal(new Function(new ESLVal("dangerous"),null) { public ESLVal apply(ESLVal... args) { return dangerous(args[0]); }});
  ESLVal min(ESLVal _v193,ESLVal _v194) {
    
    {ESLVal _v181 = _v194;
      
      if(_v181.isCons())
      {ESLVal $244 = _v181.head();
        ESLVal $245 = _v181.tail();
        
        {ESLVal f = $244;
        
        {ESLVal _v195 = $245;
        
        if(f.less(_v193).boolVal)
        return min(f,_v195);
        else
          {ESLVal _v196 = $244;
            
            {ESLVal _v197 = $245;
            
            return min(_v193,_v197);
          }
          }
      }
      }
      }
    else if(_v181.isNil())
      return _v193;
    else return error(new ESLVal("case error at Pos(12434,12525)").add(ESLVal.list(_v181)));
    }
  }
  ESLVal min = new ESLVal(new Function(new ESLVal("min"),null) { public ESLVal apply(ESLVal... args) { return min(args[0],args[1]); }});
  ESLVal nextMove(ESLVal p) {
    
    {ESLVal _v182 = p;
      
      return $ndCase.apply(_v182,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal $247 = $args[0];
      ESLVal $248 = $args[1];
      ESLVal $249 = $args[2];
      ESLVal $246 = $args[3];
      {ESLVal p1 = $247;
            
            {ESLVal l = $248;
            
            {ESLVal p2 = $249;
            
            if(length.apply(p2).eql($one).boolVal)
            return l;
            else
              return $246.apply();
          }
          }
          }
        }
      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          return error(new ESLVal("case error at Pos(12558,12624)").add(ESLVal.list(_v182)));
        }
      }));
    }
  }
  ESLVal nextMove = new ESLVal(new Function(new ESLVal("nextMove"),null) { public ESLVal apply(ESLVal... args) { return nextMove(args[0]); }});
  ESLVal move() {
    
    {ESLVal d = ghostDistance(new ESLVal("Loc",getSelf().ref("getX").apply(),getSelf().ref("getY").apply()));
      
      if(d.less(new ESLVal(5.0)).and(fleeing.not()).boolVal)
      {flee(new ESLVal(7));
      fleeing = $true;
      return doPlan();}
      else
        if(d.gre(new ESLVal(5.0)).and(fleeing).boolVal)
          {eat(new ESLVal(9));
          fleeing = $false;
          return doPlan();}
          else
            return doPlan();
    }
  }
  ESLVal move = new ESLVal(new Function(new ESLVal("move"),null) { public ESLVal apply(ESLVal... args) { return move(); }});
  ESLVal getDangerZones(ESLVal moves) {
    
    { LetRec letrec = new LetRec() {
      ESLVal ghostLocs = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal g = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("Loc",g.ref("getX").apply(),g.ref("getY").apply()));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(m.ref("getGhosts").apply());
      ESLVal zones = new ESLVal(new Function(new ESLVal("zones"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal zone = $args[0];
        ESLVal i = $args[1];
        ESLVal max = $args[2];
        if(i.greql(max).boolVal)
              return $nil;
              else
                {ESLVal z = new SerializableFunction<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal l = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = ghostMoves.apply(l);
                    while(!$l1.isNil()) {
                      ESLVal m = $l1.head();
                      $l1 = $l1.tail();
                      $v.add(m);
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(zone);
                  
                  return zones.apply(z,i.add($one),max).cons(z);
                }
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "ghostLocs": return ghostLocs;
          
          case "zones": return zones;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal ghostLocs = letrec.get("ghostLocs");
    
    ESLVal zones = letrec.get("zones");
    
      return zones.apply(ghostLocs,$zero,moves);}
    
  }
  ESLVal getDangerZones = new ESLVal(new Function(new ESLVal("getDangerZones"),null) { public ESLVal apply(ESLVal... args) { return getDangerZones(args[0]); }});
  ESLVal eat(ESLVal n) {
    
    { LetRec letrec = new LetRec() {
      ESLVal foodCount = new ESLVal(new Function(new ESLVal("foodCount"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal plan = $args[0];
        return sum(new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal l = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(food.array[locY(l).intVal].array[locX(l).intVal]);
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(plan));
          }
        });
      ESLVal moreFood = new ESLVal(new Function(new ESLVal("moreFood"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal plan1 = $args[0];
        ESLVal plan2 = $args[1];
        return foodCount.apply(plan1).gre(foodCount.apply(plan2));
          }
        });
      ESLVal mostFood = new ESLVal(new Function(new ESLVal("mostFood"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal plans = $args[0];
        if(length.apply(head.apply(plans)).less(n).boolVal)
              return $null;
              else
                return max(plans,moreFood);
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "foodCount": return foodCount;
          
          case "moreFood": return moreFood;
          
          case "mostFood": return mostFood;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal foodCount = letrec.get("foodCount");
    
    ESLVal moreFood = letrec.get("moreFood");
    
    ESLVal mostFood = letrec.get("mostFood");
    
      {ESLVal _v183 = getSelf().ref("plan").apply(n,moreFood,mostFood,dangerous(getDangerZones(n.add($one))),moves,getSelf().ref("initPlans").apply());
      
      if(_v183.isCons())
      {ESLVal $250 = _v183.head();
        ESLVal $251 = _v183.tail();
        
        if($251.isCons())
        {ESLVal $252 = $251.head();
          ESLVal $253 = $251.tail();
          
          {ESLVal p = _v183;
          
          if(p.eql($null).boolVal)
          {plan = $nil;
          return $null;}
          else
            {ESLVal _v198 = _v183;
              
              {plan = butlast.apply(_v198);
            return $null;}
            }
        }
        }
      else if($251.isNil())
        {ESLVal l = $250;
          
          {plan = $nil;
        return $null;}
        }
      else {ESLVal p = _v183;
          
          if(p.eql($null).boolVal)
          {plan = $nil;
          return $null;}
          else
            {ESLVal _v199 = _v183;
              
              {plan = butlast.apply(_v199);
            return $null;}
            }
        }
      }
    else if(_v183.isNil())
      {ESLVal p = _v183;
        
        if(p.eql($null).boolVal)
        {plan = $nil;
        return $null;}
        else
          {ESLVal _v200 = _v183;
            
            {plan = butlast.apply(_v200);
          return $null;}
          }
      }
    else {ESLVal p = _v183;
        
        if(p.eql($null).boolVal)
        {plan = $nil;
        return $null;}
        else
          {ESLVal _v201 = _v183;
            
            {plan = butlast.apply(_v201);
          return $null;}
          }
      }
    }}
    
  }
  ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),null) { public ESLVal apply(ESLVal... args) { return eat(args[0]); }});
  ESLVal flee(ESLVal n) {
    
    { LetRec letrec = new LetRec() {
      ESLVal ok = new ESLVal(new Function(new ESLVal("ok"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal p1 = $args[0];
        ESLVal p2 = $args[1];
        return $true;
          }
        });
      ESLVal anything = new ESLVal(new Function(new ESLVal("anything"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal plans = $args[0];
        if(length.apply(head.apply(plans)).less(n).boolVal)
              return $null;
              else
                return head.apply(plans);
          }
        });
      
      public ESLVal get(String name) {
        switch(name) {
          case "ok": return ok;
          
          case "anything": return anything;
          
          default: throw new Error("cannot find letrec binding");
        }
        }
      };
    ESLVal ok = letrec.get("ok");
    
    ESLVal anything = letrec.get("anything");
    
      {ESLVal _v184 = getSelf().ref("plan").apply(n,ok,anything,dangerous(getDangerZones(n.add($one))),moves,getSelf().ref("initPlans").apply());
      
      if(_v184.isCons())
      {ESLVal $254 = _v184.head();
        ESLVal $255 = _v184.tail();
        
        if($255.isCons())
        {ESLVal $256 = $255.head();
          ESLVal $257 = $255.tail();
          
          {ESLVal p = _v184;
          
          if(p.eql($null).boolVal)
          {plan = $nil;
          return $null;}
          else
            {ESLVal _v202 = _v184;
              
              {plan = butlast.apply(_v202);
            return $null;}
            }
        }
        }
      else if($255.isNil())
        {ESLVal l = $254;
          
          {plan = $nil;
        return $null;}
        }
      else {ESLVal p = _v184;
          
          if(p.eql($null).boolVal)
          {plan = $nil;
          return $null;}
          else
            {ESLVal _v203 = _v184;
              
              {plan = butlast.apply(_v203);
            return $null;}
            }
        }
      }
    else if(_v184.isNil())
      {ESLVal p = _v184;
        
        if(p.eql($null).boolVal)
        {plan = $nil;
        return $null;}
        else
          {ESLVal _v204 = _v184;
            
            {plan = butlast.apply(_v204);
          return $null;}
          }
      }
    else {ESLVal p = _v184;
        
        if(p.eql($null).boolVal)
        {plan = $nil;
        return $null;}
        else
          {ESLVal _v205 = _v184;
            
            {plan = butlast.apply(_v205);
          return $null;}
          }
      }
    }}
    
  }
  ESLVal flee = new ESLVal(new Function(new ESLVal("flee"),null) { public ESLVal apply(ESLVal... args) { return flee(args[0]); }});
  ESLVal doPlan() {
    
    if(plan.eql($nil).boolVal)
      return replan();
      else
        {ESLVal _v185 = plan;
          
          return $ndCase.apply(_v185,ESLVal.list(new ESLVal("$selectRight",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $259 = $args[0];
          ESLVal $260 = $args[1];
          ESLVal $258 = $args[2];
          {ESLVal p1 = $259;
                
                {ESLVal l = $260;
                
                {plan = p1;
              {ESLVal _v186 = l;
                
                switch(_v186.termName) {
                case "Loc": {ESLVal $262 = _v186.termRef(0);
                  ESLVal $261 = _v186.termRef(1);
                  
                  {ESLVal _v206 = $262;
                  
                  {ESLVal _v207 = $261;
                  
                  {getSelf().ref("moveTo").apply(_v206,_v207);
                Lib.send(gui,"Player",getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                m.ref("eat").apply(getSelf().ref("getX").apply(),getSelf().ref("getY").apply());
                return wait.apply(delay);}
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(15165,15448)").add(ESLVal.list(_v186)));
              }
              }}
              }
              }
            }
          }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              return error(new ESLVal("case error at Pos(15098,15466)").add(ESLVal.list(_v185)));
            }
          }));
        }
  }
  ESLVal doPlan = new ESLVal(new Function(new ESLVal("doPlan"),null) { public ESLVal apply(ESLVal... args) { return doPlan(); }});
  ESLVal replan() {
    
    if(fleeing.boolVal)
      return flee(new ESLVal(7));
      else
        return eat(new ESLVal(9));
  }
  ESLVal replan = new ESLVal(new Function(new ESLVal("replan"),null) { public ESLVal apply(ESLVal... args) { return replan(); }});
ESLVal plan = $nil;
          ESLVal fleeing = $false;
          ESLVal ghostMoves = cache(id,new ESLVal(new Function(new ESLVal("fun72"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal l = $args[0];
            {ESLVal _v180 = l;
                  
                  switch(_v180.termName) {
                  case "Loc": {ESLVal $243 = _v180.termRef(0);
                    ESLVal $242 = _v180.termRef(1);
                    
                    {ESLVal _v191 = $243;
                    
                    {ESLVal _v192 = $242;
                    
                    return new SerializableFunction<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal dx = $l0.head();
                          $l0 = $l0.tail();
                          ESLVal $l1 = refSuper("deltas");
                    while(!$l1.isNil()) {
                      ESLVal dy = $l1.head();
                      $l1 = $l1.tail();
                      if(dx.eql($zero).or(dy.eql($zero)).boolVal) {if(dx.eql($zero).and(dy.eql($zero)).not().boolVal) {if(getSelf().ref("canMove").apply(_v191.add(dx),_v192.add(dy)).boolVal) {$v.add(new ESLVal("Loc",_v191.add(dx),_v192.add(dy)));
                      }
                      }
                      }
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(refSuper("deltas"));
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(13058,13284)").add(ESLVal.list(_v180)));
                }
                }
              }
            }));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v187 = $m;
            
            {ESLVal _v208 = _v187;
            
            {sendSuper(_v208);
          return $null;}
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "move": return move;
              default: return refSuper(name);
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
  private static ESLVal maze = new ESLVal(new Function(new ESLVal("maze"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("maze")) {
          ESLVal eaten() {
    
    return exists.apply(isEatingPacman,ghosts);
  }
  ESLVal eaten = new ESLVal(new Function(new ESLVal("eaten"),null) { public ESLVal apply(ESLVal... args) { return eaten(); }});
  ESLVal is0(ESLVal n) {
    
    return n.eql($zero);
  }
  ESLVal is0 = new ESLVal(new Function(new ESLVal("is0"),null) { public ESLVal apply(ESLVal... args) { return is0(args[0]); }});
  ESLVal allEaten() {
    
    return forallArray(new ESLVal(new Function(new ESLVal("fun73"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal row = $args[0];
      return forallArray(is0,row,maxWidth);
        }
      }),food,maxHeight);
  }
  ESLVal allEaten = new ESLVal(new Function(new ESLVal("allEaten"),null) { public ESLVal apply(ESLVal... args) { return allEaten(); }});
  ESLVal isEatingPacman(ESLVal g) {
    
    return g.ref("getX").apply().eql(pacman.ref("getX").apply()).and(g.ref("getY").apply().eql(pacman.ref("getY").apply()));
  }
  ESLVal isEatingPacman = new ESLVal(new Function(new ESLVal("isEatingPacman"),null) { public ESLVal apply(ESLVal... args) { return isEatingPacman(args[0]); }});
  ESLVal getPacman() {
    
    return pacman;
  }
  ESLVal getPacman = new ESLVal(new Function(new ESLVal("getPacman"),null) { public ESLVal apply(ESLVal... args) { return getPacman(); }});
  ESLVal getGhosts() {
    
    return ghosts;
  }
  ESLVal getGhosts = new ESLVal(new Function(new ESLVal("getGhosts"),null) { public ESLVal apply(ESLVal... args) { return getGhosts(); }});
  ESLVal eat(ESLVal x,ESLVal y) {
    
    if(food.array[y.intVal].array[x.intVal].eql($one).boolVal)
      return food.array[y.intVal].array[x.intVal] = $zero;
      else
        return $null;
  }
  ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),null) { public ESLVal apply(ESLVal... args) { return eat(args[0],args[1]); }});
  ESLVal repaint() {
    
    return Lib.send(gui,"State",new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal g = $l0.head();
            $l0 = $l0.tail();
            $v.add(new ESLVal("Point",g,g.ref("ghostType"),g.ref("getX").apply(),g.ref("getY").apply()));
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(ghosts),food);
  }
  ESLVal repaint = new ESLVal(new Function(new ESLVal("repaint"),null) { public ESLVal apply(ESLVal... args) { return repaint(); }});
  ESLVal isWall(ESLVal x,ESLVal y) {
    
    return tiles.array[y.intVal].array[x.intVal].gre(legalCell);
  }
  ESLVal isWall = new ESLVal(new Function(new ESLVal("isWall"),null) { public ESLVal apply(ESLVal... args) { return isWall(args[0],args[1]); }});
  ESLVal atHome(ESLVal x,ESLVal y) {
    
    if(x.gre($zero.sub($one)).and(x.less(maxWidth).and(y.gre($zero.sub($one)).and(y.less(maxHeight)))).boolVal)
      return tiles.array[y.intVal].array[x.intVal].eql(homeCell);
      else
        return $false;
  }
  ESLVal atHome = new ESLVal(new Function(new ESLVal("atHome"),null) { public ESLVal apply(ESLVal... args) { return atHome(args[0],args[1]); }});
  ESLVal legalPos(ESLVal x,ESLVal y) {
    
    if(x.gre($zero.sub($one)).and(x.less(maxWidth).and(y.gre($zero.sub($one)).and(y.less(maxHeight)))).boolVal)
      return isWall(x,y).not();
      else
        return $false;
  }
  ESLVal legalPos = new ESLVal(new Function(new ESLVal("legalPos"),null) { public ESLVal apply(ESLVal... args) { return legalPos(args[0],args[1]); }});
  ESLVal playerLoses() {
    
    {print.apply(new ESLVal("You are eaten!"));
    return stopAll.apply();}
  }
  ESLVal playerLoses = new ESLVal(new Function(new ESLVal("playerLoses"),null) { public ESLVal apply(ESLVal... args) { return playerLoses(); }});
  ESLVal playerWins() {
    
    {print.apply(new ESLVal("You win!"));
    return stopAll.apply();}
  }
  ESLVal playerWins = new ESLVal(new Function(new ESLVal("playerWins"),null) { public ESLVal apply(ESLVal... args) { return playerWins(); }});
ESLVal ghosts = $nil;
          ESLVal pacman = $null;
          ESLVal players = $nil;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v188 = $m;
            
            switch(_v188.termName) {
            case "RegisterGhost": {ESLVal $264 = _v188.termRef(0);
              
              {ESLVal g = $264;
              
              {players = players.cons(g);
            {ghosts = ghosts.cons(g);
            return $null;}}
            }
            }
          case "RegisterPacman": {ESLVal $263 = _v188.termRef(0);
              
              {ESLVal p = $263;
              
              {players = players.cons(p).cons(p);
            {pacman = p;
            return $null;}}
            }
            }
          case "Move": {
              if(players.neql($nil).and(pacman.neql($null)).boolVal)
              if(allEaten().boolVal)
                return playerWins();
                else
                  if(eaten().boolVal)
                    return playerLoses();
                    else
                      {head.apply(players).ref("move").apply();
                      players = tail.apply(players).add(ESLVal.list(head.apply(players)));
                      repaint();
                      return Lib.send(getSelf(),"Move");}
              else
                return Lib.send(getSelf(),"Move");
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v188)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "isWall": return isWall;
              case "atHome": return atHome;
              case "getPacman": return getPacman;
              case "getGhosts": return getGhosts;
              case "legalPos": return legalPos;
              case "eat": return eat;
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
  private static ESLVal tiles = initArray(ESLVal.list(ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,new ESLVal(5),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),$zero,$zero,$zero,$zero,new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(9),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9)),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9))));
  private static ESLVal food = initArray(ESLVal.list(ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero)));
  private static ESLVal gui = newJavaActor("esl.pacman.Pacman",tiles);
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v189 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v189)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(timeLimit).boolVal)
            stopAll.apply();
            else
              {ESLVal _v190 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {edb.ref("display").apply(new ESLVal("Pacman"),gui);
                {ESLVal m = newActor(maze,new ESLVal(new Actor()));
                  
                  {ESLVal p = newActor(autoPacman,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(21),m);
                  ESLVal g1 = newActor(ghost1,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g2 = newActor(ghost2,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g3 = newActor(ghost3,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  ESLVal g4 = newActor(ghost4,new ESLVal(new Actor()),new ESLVal(15),new ESLVal(13),m);
                  
                  {Lib.send(p,"Start");
                Lib.send(g1,"Start");
                Lib.send(g2,"Start");
                Lib.send(g3,"Start");
                Lib.send(g4,"Start");
                return Lib.send(m,"Move");}
                }
                }}
              }}.get();
          }
        });
    }
  });
private static ESLVal locX(ESLVal l) {
    
    {ESLVal _v160 = l;
      
      switch(_v160.termName) {
      case "Loc": {ESLVal $225 = _v160.termRef(0);
        ESLVal $224 = _v160.termRef(1);
        
        {ESLVal x = $225;
        
        {ESLVal y = $224;
        
        return x;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(509,534)").add(ESLVal.list(_v160)));
    }
    }
  }
  private static ESLVal locX = new ESLVal(new Function(new ESLVal("locX"),null) { public ESLVal apply(ESLVal... args) { return locX(args[0]); }});
  private static ESLVal locY(ESLVal l) {
    
    {ESLVal _v161 = l;
      
      switch(_v161.termName) {
      case "Loc": {ESLVal $227 = _v161.termRef(0);
        ESLVal $226 = _v161.termRef(1);
        
        {ESLVal x = $227;
        
        {ESLVal y = $226;
        
        return y;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(555,580)").add(ESLVal.list(_v161)));
    }
    }
  }
  private static ESLVal locY = new ESLVal(new Function(new ESLVal("locY"),null) { public ESLVal apply(ESLVal... args) { return locY(args[0]); }});
  private static ESLVal imin(ESLVal x,ESLVal y) {
    
    if(x.less(y).boolVal)
      return x;
      else
        return y;
  }
  private static ESLVal imin = new ESLVal(new Function(new ESLVal("imin"),null) { public ESLVal apply(ESLVal... args) { return imin(args[0],args[1]); }});
  private static ESLVal imax(ESLVal x,ESLVal y) {
    
    if(x.gre(y).boolVal)
      return x;
      else
        return y;
  }
  private static ESLVal imax = new ESLVal(new Function(new ESLVal("imax"),null) { public ESLVal apply(ESLVal... args) { return imax(args[0],args[1]); }});
  private static ESLVal max(ESLVal l,ESLVal greater) {
    
    return select1(l,$null,new ESLVal(new Function(new ESLVal("fun65"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal greatest = $args[0];
      return exists.apply(new ESLVal(new Function(new ESLVal("fun66"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            return greater.apply(x,greatest);
              }
            }),l).not();
        }
      }));
  }
  private static ESLVal max = new ESLVal(new Function(new ESLVal("max"),null) { public ESLVal apply(ESLVal... args) { return max(args[0],args[1]); }});
  private static ESLVal sum(ESLVal l) {
    
    {ESLVal _v162 = l;
      
      if(_v162.isCons())
      {ESLVal $228 = _v162.head();
        ESLVal $229 = _v162.tail();
        
        {ESLVal n = $228;
        
        {ESLVal _v234 = $229;
        
        return n.add(sum(_v234));
      }
      }
      }
    else if(_v162.isNil())
      return $zero;
    else return error(new ESLVal("case error at Pos(5797,5845)").add(ESLVal.list(_v162)));
    }
  }
  private static ESLVal sum = new ESLVal(new Function(new ESLVal("sum"),null) { public ESLVal apply(ESLVal... args) { return sum(args[0]); }});
  private static ESLVal distance(ESLVal x1,ESLVal y1,ESLVal x2,ESLVal y2) {
    
    {ESLVal dx = x1.sub(x2);
      ESLVal dy = y1.sub(y2);
      
      return isqrt.apply(dx.mul(dx).add(dy.mul(dy)));
    }
  }
  private static ESLVal distance = new ESLVal(new Function(new ESLVal("distance"),null) { public ESLVal apply(ESLVal... args) { return distance(args[0],args[1],args[2],args[3]); }});
  private static ESLVal initArray(ESLVal l) {
    
    {ESLVal a = newArray(length.apply(l).intVal);
      
      {{
      ESLVal _v163 = $zero.to(length.apply(l));
      while(_v163.isCons()) {
        ESLVal y = _v163.headVal;
        {ESLVal b = newArray(length.apply(nth.apply(l,y)).intVal);
          
          {a.array[y.intVal] = b;
        {
          ESLVal _v164 = $zero.to(length.apply(nth.apply(l,y)));
          while(_v164.isCons()) {
            ESLVal x = _v164.headVal;
            a.array[y.intVal].array[x.intVal] = nth.apply(nth.apply(l,y),x);
            _v164 = _v164.tailVal;}
        }}
        }
        _v163 = _v163.tailVal;}
    }
    return a;}
    }
  }
  private static ESLVal initArray = new ESLVal(new Function(new ESLVal("initArray"),null) { public ESLVal apply(ESLVal... args) { return initArray(args[0]); }});
  private static ESLVal forallArray(ESLVal p,ESLVal a,ESLVal size) {
    
    {ESLVal[] b = new ESLVal[]{$true};
      
      {{
      ESLVal _v165 = $zero.to(size);
      while(_v165.isCons()) {
        ESLVal i = _v165.headVal;
        if(p.apply(a.array[i.intVal]).not().boolVal)
          b[0] = $false;
          else
            {}
        _v165 = _v165.tailVal;}
    }
    return b[0];}
    }
  }
  private static ESLVal forallArray = new ESLVal(new Function(new ESLVal("forallArray"),null) { public ESLVal apply(ESLVal... args) { return forallArray(args[0],args[1],args[2]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}