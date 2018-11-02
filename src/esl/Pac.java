package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Pac {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal cellWidth = new ESLVal(20);
  private static ESLVal cellHeight = new ESLVal(20);
  private static ESLVal maxWidth = new ESLVal(29);
  private static ESLVal delay = $one;
  private static ESLVal cellEmpty = $zero;
  private static ESLVal legalCell = new ESLVal(2);
  private static ESLVal homeCell = new ESLVal(3);
  private static ESLVal hWall = new ESLVal(4);
  private static ESLVal vWall = new ESLVal(5);
  private static ESLVal topLeftCorner = new ESLVal(6);
  private static ESLVal topRightCorner = new ESLVal(7);
  private static ESLVal bottomLeftCorner = new ESLVal(8);
  private static ESLVal bottomRightCorner = new ESLVal(9);
  private static ESLVal timeLimit = new ESLVal(50000);
  private static ESLVal ghost = new ESLVal(new Function(new ESLVal("ghost"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal strategy = $args[1];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("ghost")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v12 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v12)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.mod(delay).eql($zero).boolVal)
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return ((Supplier<ESLVal>)() -> { 
              if(m.ref("isGhostTurn").apply(getSelf()).boolVal)
                {strategy.apply(getSelf(),m);
                return m.ref("ghostMoved").apply();}
                else
                  return $null;
            }).get();
              }},m.ref("mon"));
            else
              {ESLVal _v23 = $t;
                
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
  private static ESLVal maze = new ESLVal(new Function(new ESLVal("maze"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("maze")) {
          ESLVal mon = $zero;
          ESLVal playerX = new ESLVal(20);
          ESLVal playerY = new ESLVal(20);
          ESLVal ghosts = ESLVal.list();
          ESLVal turnCounter = $zero;
          ESLVal eaten = new ESLVal(new Function(new ESLVal("eaten"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return exists.apply(isEatingPlayer,ghosts);
              }
            });
          ESLVal is0 = new ESLVal(new Function(new ESLVal("fun266"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return n.eql($zero);
              }
            });
          ESLVal allEaten = new ESLVal(new Function(new ESLVal("allEaten"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return forall.apply(new ESLVal(new Function(new ESLVal("fun267"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal row = $args[0];
                  return forall.apply(is0,row);
                    }
                  }),food);
              }
            });
          ESLVal isEatingPlayer = new ESLVal(new Function(new ESLVal("isEatingPlayer"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            return pointX.apply(p).eql(playerX).and(pointY.apply(p).eql(playerY));
              }
            });
          ESLVal isGhostTurn = new ESLVal(new Function(new ESLVal("isGhostTurn"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            {ESLVal _v10 = ghosts;
                  
                  if(_v10.isCons())
                  {ESLVal $21 = _v10.head();
                    ESLVal $22 = _v10.tail();
                    
                    switch($21.termName) {
                    case "Point": {ESLVal $26 = $21.termRef(0);
                      ESLVal $25 = $21.termRef(1);
                      ESLVal $24 = $21.termRef(2);
                      ESLVal $23 = $21.termRef(3);
                      
                      {ESLVal g1 = $26;
                      
                      {ESLVal t = $25;
                      
                      {ESLVal x = $24;
                      
                      {ESLVal y = $23;
                      
                      {ESLVal gs = $22;
                      
                      if(g1.eql(g).and(turnCounter.less(length.apply(ghosts))).boolVal)
                      return $true;
                      else
                        {ESLVal _v21 = _v10;
                          
                          return $false;
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal gs = _v10;
                      
                      return $false;
                    }
                  }
                  }
                else if(_v10.isNil())
                  {ESLVal gs = _v10;
                    
                    return $false;
                  }
                else {ESLVal gs = _v10;
                    
                    return $false;
                  }
                }
              }
            });
          ESLVal ghostMoved = new ESLVal(new Function(new ESLVal("ghostMoved"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ghosts = tail.apply(ghosts).add(ESLVal.list(head.apply(ghosts)));
                return $null;}
              }
            });
          ESLVal moveGhost = new ESLVal(new Function(new ESLVal("moveGhost"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            ESLVal x = $args[1];
            ESLVal y = $args[2];
            {ghosts = subst.apply(new ESLVal("Point",g,ghostType.apply(g),x,y),getGhost.apply(g,ghosts),ghosts);
                Lib.send(gui,"State",ghosts,food);
                {turnCounter = turnCounter.add($one);
                return $null;}}
              }
            });
          ESLVal isWall = new ESLVal(new Function(new ESLVal("isWall"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return nth.apply(nth.apply(tiles,y),x).gre(legalCell);
              }
            });
          ESLVal atHome = new ESLVal(new Function(new ESLVal("atHome"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return nth.apply(nth.apply(tiles,y),x).eql(homeCell);
              }
            });
          ESLVal ghostX = new ESLVal(new Function(new ESLVal("ghostX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            return pointX.apply(getGhost.apply(g,ghosts));
              }
            });
          ESLVal ghostY = new ESLVal(new Function(new ESLVal("ghostY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            return pointY.apply(getGhost.apply(g,ghosts));
              }
            });
          ESLVal ghostType = new ESLVal(new Function(new ESLVal("ghostType"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            return pointType.apply(getGhost.apply(g,ghosts));
              }
            });
          ESLVal getGhost = new ESLVal(new Function(new ESLVal("getGhost"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            ESLVal gs = $args[1];
            {ESLVal _v9 = gs;
                  
                  if(_v9.isCons())
                  {ESLVal $15 = _v9.head();
                    ESLVal $16 = _v9.tail();
                    
                    switch($15.termName) {
                    case "Point": {ESLVal $20 = $15.termRef(0);
                      ESLVal $19 = $15.termRef(1);
                      ESLVal $18 = $15.termRef(2);
                      ESLVal $17 = $15.termRef(3);
                      
                      {ESLVal g1 = $20;
                      
                      {ESLVal t = $19;
                      
                      {ESLVal x = $18;
                      
                      {ESLVal y = $17;
                      
                      {ESLVal _v17 = $16;
                      
                      if(g1.eql(g).boolVal)
                      return new ESLVal("Point",g,t,x,y);
                      else
                        {ESLVal _v18 = $15;
                          
                          {ESLVal _v19 = $16;
                          
                          return getGhost.apply(g,_v19);
                        }
                        }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal g1 = $15;
                      
                      {ESLVal _v20 = $16;
                      
                      return getGhost.apply(g,_v20);
                    }
                    }
                  }
                  }
                else if(_v9.isNil())
                  return error(new ESLVal("case error at Pos(6385,6561)").add(ESLVal.list(_v9)));
                else return error(new ESLVal("case error at Pos(6385,6561)").add(ESLVal.list(_v9)));
                }
              }
            });
          ESLVal pointX = new ESLVal(new Function(new ESLVal("pointX"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            {ESLVal _v8 = g;
                  
                  switch(_v8.termName) {
                  case "Point": {ESLVal $14 = _v8.termRef(0);
                    ESLVal $13 = _v8.termRef(1);
                    ESLVal $12 = _v8.termRef(2);
                    ESLVal $11 = _v8.termRef(3);
                    
                    {ESLVal _v16 = $14;
                    
                    {ESLVal t = $13;
                    
                    {ESLVal x = $12;
                    
                    {ESLVal y = $11;
                    
                    return x;
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(6635,6688)").add(ESLVal.list(_v8)));
                }
                }
              }
            });
          ESLVal pointY = new ESLVal(new Function(new ESLVal("pointY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            {ESLVal _v7 = g;
                  
                  switch(_v7.termName) {
                  case "Point": {ESLVal $10 = _v7.termRef(0);
                    ESLVal $9 = _v7.termRef(1);
                    ESLVal $8 = _v7.termRef(2);
                    ESLVal $7 = _v7.termRef(3);
                    
                    {ESLVal _v15 = $10;
                    
                    {ESLVal t = $9;
                    
                    {ESLVal x = $8;
                    
                    {ESLVal y = $7;
                    
                    return y;
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(6719,6772)").add(ESLVal.list(_v7)));
                }
                }
              }
            });
          ESLVal pointType = new ESLVal(new Function(new ESLVal("pointType"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal g = $args[0];
            {ESLVal _v6 = g;
                  
                  switch(_v6.termName) {
                  case "Point": {ESLVal $6 = _v6.termRef(0);
                    ESLVal $5 = _v6.termRef(1);
                    ESLVal $4 = _v6.termRef(2);
                    ESLVal $3 = _v6.termRef(3);
                    
                    {ESLVal _v14 = $6;
                    
                    {ESLVal t = $5;
                    
                    {ESLVal x = $4;
                    
                    {ESLVal y = $3;
                    
                    return t;
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(6806,6859)").add(ESLVal.list(_v6)));
                }
                }
              }
            });
          ESLVal legalPos = new ESLVal(new Function(new ESLVal("legalPos"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return x.gre($zero.sub($one)).and(x.less(length.apply(head.apply(tiles))).and(y.gre($zero.sub($one)).and(y.less(length.apply(tiles)).and(isWall.apply(x,y).not()))));
              }
            });
          ESLVal eat = new ESLVal(new Function(new ESLVal("eat"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(nth.apply(nth.apply(food,playerY),playerX).eql($one).boolVal)
                  {ESLVal row = nth.apply(food,playerY);
                    
                    {food = replaceNth.apply(food,playerY,replaceNth.apply(row,playerX,$zero));
                  return $null;}
                  }
                  else
                    return $null;
              }
            });
          ESLVal playerTurn = new ESLVal(new Function(new ESLVal("playerTurn"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal mouseX = gui.ref("mouseX");
                  ESLVal mouseY = gui.ref("mouseY");
                  
                  {ESLVal dx = mouseX.sub(playerX);
                  ESLVal dy = mouseY.sub(playerY);
                  
                  {ESLVal mx = ((Supplier<ESLVal>)() -> { 
                      if(dx.gre($zero).boolVal)
                        return $one;
                        else
                          if(dx.less($zero).boolVal)
                            return $zero.sub($one);
                            else
                              return $zero;
                    }).get();
                  ESLVal my = ((Supplier<ESLVal>)() -> { 
                      if(dy.gre($zero).boolVal)
                        return $one;
                        else
                          if(dy.less($zero).boolVal)
                            return $zero.sub($one);
                            else
                              return $zero;
                    }).get();
                  
                  {if(mx.neql($zero).and(legalPos.apply(playerX.add(mx).mod(maxWidth),playerY)).boolVal)
                  playerX = playerX.add(mx).mod(maxWidth);
                  else
                    if(my.neql($zero).and(legalPos.apply(playerX,playerY.add(my))).boolVal)
                      playerY = playerY.add(my);
                      else
                        if(legalPos.apply(playerX.add(mx).mod(maxWidth),playerY.add(my)).boolVal)
                          {playerX = playerX.add(mx).mod(maxWidth);
                          playerY = playerY.add(my);}
                          else
                            if(playerX.add(mx).eql($zero).or(playerX.add(mx).less($zero)).boolVal)
                              playerX = maxWidth.sub($one);
                              else
                                {}
                Lib.send(gui,"Player",playerX,playerY);
                eat.apply();
                turnCounter = $zero;
                return wait.apply(new ESLVal(100));}
                }
                }
                }
              }
            });
          ESLVal playerLoses = new ESLVal(new Function(new ESLVal("playerLoses"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("You are eaten!"));
                return stopAll.apply();}
              }
            });
          ESLVal playerWins = new ESLVal(new Function(new ESLVal("playerWins"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {print.apply(new ESLVal("You win!"));
                return stopAll.apply();}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v11 = $m;
            
            switch(_v11.termName) {
            case "RegisterGhost": {ESLVal $30 = _v11.termRef(0);
              ESLVal $29 = _v11.termRef(1);
              ESLVal $28 = _v11.termRef(2);
              ESLVal $27 = _v11.termRef(3);
              
              {ESLVal g = $30;
              
              {ESLVal t = $29;
              
              {ESLVal x = $28;
              
              {ESLVal y = $27;
              
              {ghosts = ghosts.cons(new ESLVal("Point",g,t,x,y));
            return $null;}
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v11)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "mon": return mon;
              case "isGhostTurn": return isGhostTurn;
              case "ghostMoved": return ghostMoved;
              case "moveGhost": return moveGhost;
              case "isWall": return isWall;
              case "atHome": return atHome;
              case "ghostX": return ghostX;
              case "ghostY": return ghostY;
              case "playerX": return playerX;
              case "playerY": return playerY;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.mod(delay).eql($zero).boolVal)
            lock(new Function(new ESLVal("grab"),getSelf()) {
              public ESLVal apply(ESLVal ...args) { 
                return ((Supplier<ESLVal>)() -> { 
              {if(eaten.apply().boolVal)
                playerLoses.apply();
                else
                  {}
              if(allEaten.apply().boolVal)
                playerWins.apply();
                else
                  {}
              if(turnCounter.eql(length.apply(ghosts)).boolVal)
                return playerTurn.apply();
                else
                  return $null;}
            }).get();
              }},mon);
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
  private static ESLVal opp = new ESLVal(new Function(new ESLVal("opp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal direction = $args[0];
  {ESLVal _v5 = direction;
        
        switch(_v5.strVal) {
        case "NORTH": return new ESLVal("SOUTH");
      case "SOUTH": return new ESLVal("NORTH");
      case "EAST": return new ESLVal("WEST");
      case "WEST": return new ESLVal("EAST");
        default: return error(new ESLVal("case error at Pos(9463,9577)").add(ESLVal.list(_v5)));
      }
      }
    }
  });
  private static ESLVal defaultGhost = new ESLVal(new Function(new ESLVal("defaultGhost"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] direction = new ESLVal[]{$args[0]};
  LetRec letrec = new LetRec() {
        ESLVal canMove = new ESLVal(new Function(new ESLVal("canMove"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal x = $args[0];
          ESLVal y = $args[1];
          ESLVal m = $args[2];
          {ESLVal _v4 = direction[0];
                
                switch(_v4.strVal) {
                case "NORTH": return m.ref("isWall").apply(x,y.sub($one)).not();
              case "SOUTH": return m.ref("isWall").apply(x,y.add($one)).not();
              case "EAST": return m.ref("isWall").apply(x.add($one),y).not();
              case "WEST": return m.ref("isWall").apply(x.sub($one),y).not();
                default: return error(new ESLVal("case error at Pos(9932,10118)").add(ESLVal.list(_v4)));
              }
              }
            }
          });
        ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal g = $args[0];
          ESLVal x = $args[1];
          ESLVal y = $args[2];
          ESLVal m = $args[3];
          {ESLVal _v3 = direction[0];
                
                switch(_v3.strVal) {
                case "NORTH": return m.ref("moveGhost").apply(g,x,y.sub($one));
              case "SOUTH": return m.ref("moveGhost").apply(g,x,y.add($one));
              case "EAST": return m.ref("moveGhost").apply(g,x.add($one),y);
              case "WEST": return m.ref("moveGhost").apply(g,x.sub($one),y);
                default: return error(new ESLVal("case error at Pos(10174,10362)").add(ESLVal.list(_v3)));
              }
              }
            }
          });
        ESLVal changeDirection = new ESLVal(new Function(new ESLVal("changeDirection"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal x = $args[0];
          ESLVal y = $args[1];
          ESLVal goalX = $args[2];
          ESLVal goalY = $args[3];
          ESLVal m = $args[4];
          {ESLVal[] directions = new ESLVal[]{ESLVal.list()};
                
                {if(x.less(goalX).boolVal)
                directions[0] = directions[0].cons(new ESLVal("EAST"));
                else
                  {}
              if(x.gre(goalX).boolVal)
                directions[0] = directions[0].cons(new ESLVal("WEST"));
                else
                  {}
              if(y.less(goalY).boolVal)
                directions[0] = directions[0].cons(new ESLVal("SOUTH"));
                else
                  {}
              if(y.gre(goalY).boolVal)
                directions[0] = directions[0].cons(new ESLVal("NORTH"));
                else
                  {}
              directions[0] = remove.apply(direction[0],remove.apply(opp.apply(direction[0]),directions[0])).add(ESLVal.list(opp.apply(direction[0])));
              return chooseDirection.apply(x,y,directions[0],m);}
              }
            }
          });
        ESLVal chooseDirection = new ESLVal(new Function(new ESLVal("chooseDirection"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal x = $args[0];
          ESLVal y = $args[1];
          ESLVal directions = $args[2];
          ESLVal m = $args[3];
          {ESLVal _v2 = directions;
                
                if(_v2.isCons())
                {ESLVal $1 = _v2.head();
                  ESLVal $2 = _v2.tail();
                  
                  switch($1.strVal) {
                  case "NORTH": {ESLVal ds = $2;
                    
                    if(m.ref("isWall").apply(x,y.sub($one)).not().boolVal)
                    {direction[0] = new ESLVal("NORTH");
                    return $null;}
                    else
                      return chooseDirection.apply(x,y,ds,m);
                  }
                case "SOUTH": {ESLVal ds = $2;
                    
                    if(m.ref("isWall").apply(x,y.add($one)).not().boolVal)
                    {direction[0] = new ESLVal("SOUTH");
                    return $null;}
                    else
                      return chooseDirection.apply(x,y,ds,m);
                  }
                case "EAST": {ESLVal ds = $2;
                    
                    if(m.ref("isWall").apply(x.add($one),y).not().boolVal)
                    {direction[0] = new ESLVal("EAST");
                    return $null;}
                    else
                      return chooseDirection.apply(x,y,ds,m);
                  }
                case "WEST": {ESLVal ds = $2;
                    
                    if(m.ref("isWall").apply(x.sub($one),y).not().boolVal)
                    {direction[0] = new ESLVal("WEST");
                    return $null;}
                    else
                      return chooseDirection.apply(x,y,ds,m);
                  }
                  default: return error(new ESLVal("case error at Pos(10992,11480)").add(ESLVal.list(_v2)));
                }
                }
              else if(_v2.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(10992,11480)").add(ESLVal.list(_v2)));
              }
            }
          });
        ESLVal defaultGhost1 = new ESLVal(new Function(new ESLVal("defaultGhost1"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal g = $args[0];
          ESLVal m = $args[1];
          {ESLVal x = m.ref("ghostX").apply(g);
                ESLVal y = m.ref("ghostY").apply(g);
                ESLVal goalX = m.ref("playerX");
                ESLVal goalY = m.ref("playerY");
                
                if(m.ref("atHome").apply(x,y).boolVal)
                return move.apply(g,x,y.sub($one),m);
                else
                  if(canMove.apply(x,y,m).boolVal)
                    return move.apply(g,x,y,m);
                    else
                      return changeDirection.apply(x,y,goalX,goalY,m);
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "canMove": return canMove;
            
            case "move": return move;
            
            case "changeDirection": return changeDirection;
            
            case "chooseDirection": return chooseDirection;
            
            case "defaultGhost1": return defaultGhost1;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal canMove = letrec.get("canMove");
      
      ESLVal move = letrec.get("move");
      
      ESLVal changeDirection = letrec.get("changeDirection");
      
      ESLVal chooseDirection = letrec.get("chooseDirection");
      
      ESLVal defaultGhost1 = letrec.get("defaultGhost1");
      
        return defaultGhost1;
      
    }
  });
  private static ESLVal tiles = ESLVal.list(ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,new ESLVal(5),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),$zero,$zero,$zero,$zero,new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(3),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4)),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(5),$zero,$zero,$zero,$zero,$zero),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(7),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(7),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(6),new ESLVal(9),$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(9)),ESLVal.list(new ESLVal(6),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(6),new ESLVal(7),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(6),new ESLVal(7),$zero,new ESLVal(8),new ESLVal(9),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(7)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5),new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5),new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),new ESLVal(6),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5),new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(7),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(9),$zero,$zero,$zero,$zero,new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9),$zero,new ESLVal(5)),ESLVal.list(new ESLVal(5),$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,new ESLVal(5)),ESLVal.list(new ESLVal(8),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(4),new ESLVal(9)));
  private static ESLVal food = ESLVal.list(ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$one,$one,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$one,$one,$one,$zero,$zero,$one,$one,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$one,$zero,$zero,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$one,$one,$one,$one,$zero,$zero,$one,$one,$one,$one,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$one,$zero),ESLVal.list($zero,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$one,$zero),ESLVal.list($zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero,$zero));
  private static ESLVal gui = newJavaActor("esl.pacman.Pacman",tiles);
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
            stopAll.apply();
            else
              {ESLVal _v13 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {edb.ref("display").apply(new ESLVal("Pacman"),gui);
                {ESLVal m = newActor(maze,new ESLVal(new Actor()));
                  
                  {ESLVal g1 = newActor(ghost,new ESLVal(new Actor()),m,defaultGhost.apply(new ESLVal("WEST")));
                  ESLVal g2 = newActor(ghost,new ESLVal(new Actor()),m,defaultGhost.apply(new ESLVal("NORTH")));
                  ESLVal g3 = newActor(ghost,new ESLVal(new Actor()),m,defaultGhost.apply(new ESLVal("NORTH")));
                  ESLVal g4 = newActor(ghost,new ESLVal(new Actor()),m,defaultGhost.apply(new ESLVal("EAST")));
                  
                  {Lib.send(m,"RegisterGhost",g1,$zero,new ESLVal(14),new ESLVal(13));
                Lib.send(m,"RegisterGhost",g2,$one,new ESLVal(14),new ESLVal(13));
                Lib.send(m,"RegisterGhost",g3,new ESLVal(2),new ESLVal(14),new ESLVal(13));
                return Lib.send(m,"RegisterGhost",g4,new ESLVal(3),new ESLVal(14),new ESLVal(13));}
                }
                }}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}