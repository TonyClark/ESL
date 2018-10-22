package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Segregation {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal coordX = new ESLVal(new Function(new ESLVal("coordX"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  switch(p.termName) {
        case "Coord": {ESLVal $1 = p.termRef(0);
          ESLVal $2 = p.termRef(1);
          
          {ESLVal x = $1;
          
          {ESLVal y = $2;
          
          return x;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(361,398)"));
      }
    }
  });
  private static ESLVal coordY = new ESLVal(new Function(new ESLVal("coordY"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  switch(p.termName) {
        case "Coord": {ESLVal $3 = p.termRef(0);
          ESLVal $4 = p.termRef(1);
          
          {ESLVal x = $3;
          
          {ESLVal y = $4;
          
          return y;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(422,459)"));
      }
    }
  });
  private static ESLVal agent = new ESLVal(new Function(new ESLVal("agent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] x = new ESLVal[]{$args[0]};
  ESLVal[] y = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("agent")) {
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
                ESLVal x0 = $args[0];
            {x[0] = x0;
                return $null;}
              }
            });
          ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal y0 = $args[0];
            {y[0] = y0;
                return $null;}
              }
            });
          ESLVal toString = new ESLVal(new Function(new ESLVal("toString"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return new ESLVal("Agent(").add(x[0].add(new ESLVal(",").add(y[0].add(new ESLVal(")")))));
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Die": {
              return kill.apply(getSelf());
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getX": return getX;
              case "getY": return getY;
              case "setX": return setX;
              case "setY": return setY;
              case "toString": return toString;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return Lib.send(population,"Move",getSelf());
          }
        });
    }
  });
  private static ESLVal intToFloat = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("intToFloat"),$one);
  private static ESLVal round = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("round"),$one);
  private static ESLVal diffLimit = new ESLVal(25.0);
  private static ESLVal width = new ESLVal(1000);
  private static ESLVal height = new ESLVal(600);
  private static ESLVal redpc = new ESLVal(40);
  private static ESLVal emptypc = new ESLVal(10);
  private static ESLVal empty = $zero;
  private static ESLVal red = $one;
  private static ESLVal blue = new ESLVal(2);
  private static ESLVal limit = new ESLVal(60000);
  private static ESLVal opp = new ESLVal(new Function(new ESLVal("opp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  if(c.eql(red).boolVal)
        return blue;
        else
          return red;
    }
  });
  private static ESLVal colour = new ESLVal(new Function(new ESLVal("colour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  if(c.eql(red).boolVal)
        return new ESLVal("red");
        else
          if(c.eql(empty).boolVal)
            return new ESLVal("white");
            else
              return new ESLVal("blue");
    }
  });
  private static ESLVal legalx = new ESLVal(new Function(new ESLVal("legalx"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  return x.eql($zero).or(x.gre($zero)).and(x.less(width));
    }
  });
  private static ESLVal legaly = new ESLVal(new Function(new ESLVal("legaly"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal y = $args[0];
  return y.eql($zero).or(y.gre($zero)).and(y.less(height));
    }
  });
  private static ESLVal pop = new ESLVal(new Function(new ESLVal("pop"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("pop")) {
          ESLVal createAgent = new ESLVal(new Function(new ESLVal("createAgent"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            {Lib.send(grid,"SetColour",x,y,colour.apply(popEl.apply(x,y)));
                return newActor(agent,new ESLVal(new Actor()),x,y);}
              }
            });
          ESLVal createVacancy = new ESLVal(new Function(new ESLVal("createVacancy"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            {Lib.send(grid,"SetColour",x,y,colour.apply(empty));
                return new ESLVal("Coord",x,y);}
              }
            });
          ESLVal popEl = new ESLVal(new Function(new ESLVal("popEl"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return population.array[x.intVal].array[y.intVal];
              }
            });
          ESLVal population = ((Supplier<ESLVal>)() -> { 
              {ESLVal a = newArray(width.intVal);
                
                {{
                ESLVal _v1 = $zero.to(width);
                while(_v1.isCons()) {
                  if(_v1.isCons())
                    {ESLVal $5 = _v1.head();
                      ESLVal $6 = _v1.tail();
                      
                      {ESLVal w = $5;
                      
                      {ESLVal _v2 = $6;
                      
                      {_v1 = _v2;
                    {a.array[w.intVal] = newArray(height.intVal);
                    {
                      ESLVal _v3 = $zero.to(height);
                      while(_v3.isCons()) {
                        if(_v3.isCons())
                          {ESLVal $7 = _v3.head();
                            ESLVal $8 = _v3.tail();
                            
                            {ESLVal h = $7;
                            
                            {ESLVal _v4 = $8;
                            
                            {_v3 = _v4;
                          a.array[w.intVal].array[h.intVal] = probably(new ESLVal(100).sub(emptypc),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return probably(redpc,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    return red;
                                  }
                                }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    return blue;
                                  }
                                }));
                            }
                          }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return empty;
                            }
                          }));}
                          }
                          }
                          }
                        else if(_v3.isNil())
                          error(new ESLVal("case error at Pos(1887,2026)"));
                        else error(new ESLVal("case error at Pos(1887,2026)"));
                        }
                    }}}
                    }
                    }
                    }
                  else if(_v1.isNil())
                    error(new ESLVal("case error at Pos(1837,2034)"));
                  else error(new ESLVal("case error at Pos(1837,2034)"));
                  }
              }
              return a;}
              }
            }).get();
          ESLVal agents = ((Supplier<ESLVal>)() -> { 
              {ESLVal a = newArray(width.intVal);
                
                {{
                ESLVal _v5 = $zero.to(width);
                while(_v5.isCons()) {
                  if(_v5.isCons())
                    {ESLVal $9 = _v5.head();
                      ESLVal $10 = _v5.tail();
                      
                      {ESLVal x = $9;
                      
                      {ESLVal _v6 = $10;
                      
                      {_v5 = _v6;
                    {a.array[x.intVal] = newArray(height.intVal);
                    {
                      ESLVal _v7 = $zero.to(height);
                      while(_v7.isCons()) {
                        if(_v7.isCons())
                          {ESLVal $11 = _v7.head();
                            ESLVal $12 = _v7.tail();
                            
                            {ESLVal y = $11;
                            
                            {ESLVal _v8 = $12;
                            
                            {_v7 = _v8;
                          a.array[x.intVal].array[y.intVal] = ((Supplier<ESLVal>)() -> { 
                            if(popEl.apply(x,y).neql(empty).boolVal)
                              return createAgent.apply(x,y);
                              else
                                return $null;
                          }).get();}
                          }
                          }
                          }
                        else if(_v7.isNil())
                          error(new ESLVal("case error at Pos(2241,2363)"));
                        else error(new ESLVal("case error at Pos(2241,2363)"));
                        }
                    }}}
                    }
                    }
                    }
                  else if(_v5.isNil())
                    error(new ESLVal("case error at Pos(2189,2371)"));
                  else error(new ESLVal("case error at Pos(2189,2371)"));
                  }
              }
              return a;}
              }
            }).get();
          ESLVal vLength = $zero;
          ESLVal createVacancies = new ESLVal(new Function(new ESLVal("createVacancies"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal vacancies = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $qualArg = $args[0];
                    {ESLVal x = $qualArg;
                          
                          return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $qualArg = $args[0];
                          {ESLVal y = $qualArg;
                                
                                return ESLVal.list((popEl.apply(x,y).eql(empty).boolVal) ? (ESLVal.list(createVacancy.apply(x,y))) : ($nil));
                              }
                            }
                          }).map($zero.to(height)).flatten().flatten());
                        }
                      }
                    }).map($zero.to(width)).flatten().flatten();
                  
                  {vLength = length.apply(vacancies);
                {ESLVal v = newArray(vLength.intVal);
                  
                  {{
                  ESLVal _v9 = $zero.to(vLength);
                  while(_v9.isCons()) {
                    if(_v9.isCons())
                      {ESLVal $13 = _v9.head();
                        ESLVal $14 = _v9.tail();
                        
                        {ESLVal i = $13;
                        
                        {ESLVal _v10 = $14;
                        
                        {_v9 = _v10;
                      v.array[i.intVal] = nth.apply(vacancies,i);}
                      }
                      }
                      }
                    else if(_v9.isNil())
                      error(new ESLVal("case error at Pos(2679,2759)"));
                    else error(new ESLVal("case error at Pos(2679,2759)"));
                    }
                }
                return v;}
                }}
                }
              }
            });
          ESLVal vacancies = createVacancies.apply();
          ESLVal popSet = new ESLVal(new Function(new ESLVal("popSet"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            ESLVal c = $args[2];
            {population.array[x.intVal].array[y.intVal] = c;
                return $null;}
              }
            });
          ESLVal diffCellCount = new ESLVal(new Function(new ESLVal("diffCellCount"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            ESLVal c = $args[2];
            {ESLVal legalCell = new ESLVal(new Function(new ESLVal("legalCell"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal x = $args[0];
                    ESLVal y = $args[1];
                    if(legalx.apply(x).and(legaly.apply(y)).boolVal)
                          if(popEl.apply(x,y).eql(c).boolVal)
                            return $one;
                            else
                              return $zero;
                          else
                            return $zero;
                      }
                    });
                  
                  return legalCell.apply(x.sub($one),y).add(legalCell.apply(x.add($one),y).add(legalCell.apply(x,y.add($one)).add(legalCell.apply(x,y.sub($one)).add(legalCell.apply(x.sub($one),y.sub($one)).add(legalCell.apply(x.sub($one),y.add($one)).add(legalCell.apply(x.add($one),y.add($one)).add(legalCell.apply(x.add($one),y.sub($one)))))))));
                }
              }
            });
          ESLVal diffpc = new ESLVal(new Function(new ESLVal("diffpc"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal y = $args[1];
            return intToFloat.apply(diffCellCount.apply(x,y,opp.apply(popEl.apply(x,y)))).div(new ESLVal(8.0)).mul(new ESLVal(100.0));
              }
            });
          
          public ESLVal handle(ESLVal $m) {switch($m.termName) {
            case "Kill": {
              {kill.apply(getSelf());
            {{
              ESLVal _v11 = $zero.to(width);
              while(_v11.isCons()) {
                if(_v11.isCons())
                  {ESLVal $16 = _v11.head();
                    ESLVal $17 = _v11.tail();
                    
                    {ESLVal x = $16;
                    
                    {ESLVal _v12 = $17;
                    
                    {_v11 = _v12;
                  {
                    ESLVal _v13 = $zero.to(height);
                    while(_v13.isCons()) {
                      if(_v13.isCons())
                        {ESLVal $18 = _v13.head();
                          ESLVal $19 = _v13.tail();
                          
                          {ESLVal y = $18;
                          
                          {ESLVal _v14 = $19;
                          
                          {_v13 = _v14;
                        {ESLVal a = agents.array[x.intVal].array[y.intVal];
                          
                          if(a.neql($null).boolVal)
                          Lib.send(a,"Die");
                          else
                            {}
                        }}
                        }
                        }
                        }
                      else if(_v13.isNil())
                        error(new ESLVal("case error at Pos(3571,3722)"));
                      else error(new ESLVal("case error at Pos(3571,3722)"));
                      }
                  }}
                  }
                  }
                  }
                else if(_v11.isNil())
                  error(new ESLVal("case error at Pos(3537,3728)"));
                else error(new ESLVal("case error at Pos(3537,3728)"));
                }
            }
            return $null;}}
            }
          case "Move": {ESLVal $15 = $m.termRef(0);
              
              {ESLVal a = $15;
              
              {ESLVal x = a.ref("getX").apply();
              ESLVal y = a.ref("getY").apply();
              
              if(diffpc.apply(x,y).gre(diffLimit).boolVal)
              {ESLVal i = random.apply(vLength);
                
                {ESLVal p = vacancies.array[i.intVal];
                
                {ESLVal x0 = coordX.apply(p);
                ESLVal y0 = coordY.apply(p);
                
                {vacancies.array[i.intVal] = new ESLVal("Coord",x,y);
              popSet.apply(x0,y0,popEl.apply(x,y));
              popSet.apply(x,y,empty);
              Lib.send(grid,"Swap",x,y,x0,y0);
              a.ref("setX").apply(x0);
              a.ref("setY").apply(y0);
              return Lib.send(getSelf(),"Move",a);}
              }
              }
              }
              else
                return Lib.send(getSelf(),"Move",a);
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)"));
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
  private static ESLVal grid = newJavaActor("esl.grid.Grid",width,height,$one);
  private static ESLVal population = newActor(pop,new ESLVal(new Actor()));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
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
            return ((Supplier<ESLVal>)() -> { 
                {edb.ref("display").apply(new ESLVal("Segregation"),grid);
                return edb.ref("button").apply(new ESLVal("Segregation"),new ESLVal("stop"),new ESLVal("icons/stop.png"),new ESLVal("stop application"),new ESLVal(new Function(new ESLVal("fun406"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return stopAll.apply();
                    }
                  }));}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}