package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
public class Segregation {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal agent = new ESLVal(new Function(new ESLVal("agent"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] x = new ESLVal[]{$args[0]};
  ESLVal[] y = new ESLVal[]{$args[1]};
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("agent")) {
          ESLVal getX() {
    
    return x[0];
  }
  ESLVal getX = new ESLVal(new Function(new ESLVal("getX"),null) { public ESLVal apply(ESLVal... args) { return getX(); }});
  ESLVal getY() {
    
    return y[0];
  }
  ESLVal getY = new ESLVal(new Function(new ESLVal("getY"),null) { public ESLVal apply(ESLVal... args) { return getY(); }});
  ESLVal setX(ESLVal x0) {
    
    {x[0] = x0;
    return $null;}
  }
  ESLVal setX = new ESLVal(new Function(new ESLVal("setX"),null) { public ESLVal apply(ESLVal... args) { return setX(args[0]); }});
  ESLVal setY(ESLVal y0) {
    
    {y[0] = y0;
    return $null;}
  }
  ESLVal setY = new ESLVal(new Function(new ESLVal("setY"),null) { public ESLVal apply(ESLVal... args) { return setY(args[0]); }});

          public ESLVal handle(ESLVal $m) {{ESLVal _v330 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v330)));
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
            return Lib.send(population,"Move",getSelf());
          }
        });
    }
  });
  private static ESLVal intToFloat = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("intToFloat"),$one);
  private static ESLVal round = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("round"),$one);
  private static ESLVal diffLimit = new ESLVal(25.0);
  private static ESLVal width = new ESLVal(500);
  private static ESLVal height = new ESLVal(500);
  private static ESLVal redpc = new ESLVal(40);
  private static ESLVal emptypc = new ESLVal(5);
  private static ESLVal empty = $zero;
  private static ESLVal red = $one;
  private static ESLVal blue = new ESLVal(2);
  private static ESLVal limit = new ESLVal(60000);
  private static ESLVal pop = new ESLVal(new Function(new ESLVal("pop"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("pop")) {
          ESLVal createAgent(ESLVal x,ESLVal y) {
    
    {Lib.send(grid,"SetColour",x,y,colour(popEl(x,y)));
    return newActor(agent,new ESLVal(new Actor()),x,y);}
  }
  ESLVal createAgent = new ESLVal(new Function(new ESLVal("createAgent"),null) { public ESLVal apply(ESLVal... args) { return createAgent(args[0],args[1]); }});
  ESLVal createVacancy(ESLVal x,ESLVal y) {
    
    {Lib.send(grid,"SetColour",x,y,colour(empty));
    return new ESLVal("Coord",x,y);}
  }
  ESLVal createVacancy = new ESLVal(new Function(new ESLVal("createVacancy"),null) { public ESLVal apply(ESLVal... args) { return createVacancy(args[0],args[1]); }});
  ESLVal popEl(ESLVal x,ESLVal y) {
    
    return population.array[x.intVal].array[y.intVal];
  }
  ESLVal popEl = new ESLVal(new Function(new ESLVal("popEl"),null) { public ESLVal apply(ESLVal... args) { return popEl(args[0],args[1]); }});
  ESLVal createVacancies() {
    
    {ESLVal vacancies = new SerializableFunction<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal x = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = $zero.to(height);
        while(!$l1.isNil()) {
          ESLVal y = $l1.head();
          $l1 = $l1.tail();
          if(popEl(x,y).eql(empty).boolVal) {$v.add(createVacancy(x,y));
          }
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(width));
      
      {vLength = length.apply(vacancies);
    {ESLVal v = newArray(vLength.intVal);
      
      {{
      ESLVal _v335 = $zero.to(vLength);
      while(_v335.isCons()) {
        ESLVal i = _v335.headVal;
        v.array[i.intVal] = nth.apply(vacancies,i);
        _v335 = _v335.tailVal;}
    }
    return v;}
    }}
    }
  }
  ESLVal createVacancies = new ESLVal(new Function(new ESLVal("createVacancies"),null) { public ESLVal apply(ESLVal... args) { return createVacancies(); }});
  ESLVal popSet(ESLVal x,ESLVal y,ESLVal c) {
    
    {population.array[x.intVal].array[y.intVal] = c;
    return $null;}
  }
  ESLVal popSet = new ESLVal(new Function(new ESLVal("popSet"),null) { public ESLVal apply(ESLVal... args) { return popSet(args[0],args[1],args[2]); }});
  ESLVal diffCellCount(ESLVal x,ESLVal y,ESLVal c) {
    
    return length.apply(new SerializableFunction<ESLVal,ESLVal>() {
        public ESLVal apply(ESLVal $l0) {
          ESLVal $a = $nil;
          java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
          while(!$l0.isNil()) { 
            ESLVal dx = $l0.head();
            $l0 = $l0.tail();
            ESLVal $l1 = ESLVal.list(new ESLVal(-1),$zero,$one);
      while(!$l1.isNil()) {
        ESLVal dy = $l1.head();
        $l1 = $l1.tail();
        if(dx.eql($zero).and(dy.eql($zero)).not().boolVal) {if(legalx(x.add(dx)).boolVal) {if(legaly(y.add(dy)).boolVal) {if(popEl(x.add(dx),y.add(dy)).eql(c).boolVal) {$v.add($one);
        }
        }
        }
        }
      }
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply(ESLVal.list(new ESLVal(-1),$zero,$one)));
  }
  ESLVal diffCellCount = new ESLVal(new Function(new ESLVal("diffCellCount"),null) { public ESLVal apply(ESLVal... args) { return diffCellCount(args[0],args[1],args[2]); }});
  ESLVal diffpc(ESLVal x,ESLVal y) {
    
    return intToFloat.apply(diffCellCount(x,y,opp(popEl(x,y)))).div(new ESLVal(8.0)).mul(new ESLVal(100.0));
  }
  ESLVal diffpc = new ESLVal(new Function(new ESLVal("diffpc"),null) { public ESLVal apply(ESLVal... args) { return diffpc(args[0],args[1]); }});
ESLVal population = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal a = newArray(width.intVal);
                
                {{
                ESLVal _v331 = $zero.to(width);
                while(_v331.isCons()) {
                  ESLVal w = _v331.headVal;
                  {a.array[w.intVal] = newArray(height.intVal);
                  {
                    ESLVal _v332 = $zero.to(height);
                    while(_v332.isCons()) {
                      ESLVal h = _v332.headVal;
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
                      }));
                      _v332 = _v332.tailVal;}
                  }}
                  _v331 = _v331.tailVal;}
              }
              return a;}
              }
            }}.get();
          ESLVal agents = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal a = newArray(width.intVal);
                
                {{
                ESLVal _v333 = $zero.to(width);
                while(_v333.isCons()) {
                  ESLVal x = _v333.headVal;
                  {a.array[x.intVal] = newArray(height.intVal);
                  {
                    ESLVal _v334 = $zero.to(height);
                    while(_v334.isCons()) {
                      ESLVal y = _v334.headVal;
                      a.array[x.intVal].array[y.intVal] = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                        if(popEl(x,y).neql(empty).boolVal)
                          return createAgent(x,y);
                          else
                            return $null;
                      }}.get();
                      _v334 = _v334.tailVal;}
                  }}
                  _v333 = _v333.tailVal;}
              }
              return a;}
              }
            }}.get();
          ESLVal vLength = $zero;
          ESLVal vacancies = createVacancies();
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v336 = $m;
            
            switch(_v336.termName) {
            case "Move": {ESLVal $364 = _v336.termRef(0);
              
              {ESLVal a = $364;
              
              {ESLVal x = a.ref("getX").apply();
              ESLVal y = a.ref("getY").apply();
              
              if(diffpc(x,y).gre(diffLimit).boolVal)
              {ESLVal i = random.apply(vLength);
                
                {ESLVal p = vacancies.array[i.intVal];
                
                {ESLVal x0 = coordX(p);
                ESLVal y0 = coordY(p);
                
                {vacancies.array[i.intVal] = new ESLVal("Coord",x,y);
              popSet(x0,y0,popEl(x,y));
              popSet(x,y,empty);
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
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v336)));
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
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v337 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v337)));
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
            return edb.ref("display").apply(new ESLVal("Segregation"),grid);
          }
        });
    }
  });
private static ESLVal coordX(ESLVal p) {
    
    {ESLVal _v328 = p;
      
      switch(_v328.termName) {
      case "Coord": {ESLVal $361 = _v328.termRef(0);
        ESLVal $360 = _v328.termRef(1);
        
        {ESLVal x = $361;
        
        {ESLVal y = $360;
        
        return x;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(318,355)").add(ESLVal.list(_v328)));
    }
    }
  }
  private static ESLVal coordX = new ESLVal(new Function(new ESLVal("coordX"),null) { public ESLVal apply(ESLVal... args) { return coordX(args[0]); }});
  private static ESLVal coordY(ESLVal p) {
    
    {ESLVal _v329 = p;
      
      switch(_v329.termName) {
      case "Coord": {ESLVal $363 = _v329.termRef(0);
        ESLVal $362 = _v329.termRef(1);
        
        {ESLVal x = $363;
        
        {ESLVal y = $362;
        
        return y;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(379,416)").add(ESLVal.list(_v329)));
    }
    }
  }
  private static ESLVal coordY = new ESLVal(new Function(new ESLVal("coordY"),null) { public ESLVal apply(ESLVal... args) { return coordY(args[0]); }});
  private static ESLVal opp(ESLVal c) {
    
    if(c.eql(red).boolVal)
      return blue;
      else
        return red;
  }
  private static ESLVal opp = new ESLVal(new Function(new ESLVal("opp"),null) { public ESLVal apply(ESLVal... args) { return opp(args[0]); }});
  private static ESLVal colour(ESLVal c) {
    
    if(c.eql(red).boolVal)
      return new ESLVal("red");
      else
        if(c.eql(empty).boolVal)
          return new ESLVal("white");
          else
            return new ESLVal("blue");
  }
  private static ESLVal colour = new ESLVal(new Function(new ESLVal("colour"),null) { public ESLVal apply(ESLVal... args) { return colour(args[0]); }});
  private static ESLVal legalx(ESLVal x) {
    
    return x.eql($zero).or(x.gre($zero)).and(x.less(width));
  }
  private static ESLVal legalx = new ESLVal(new Function(new ESLVal("legalx"),null) { public ESLVal apply(ESLVal... args) { return legalx(args[0]); }});
  private static ESLVal legaly(ESLVal y) {
    
    return y.eql($zero).or(y.gre($zero)).and(y.less(height));
  }
  private static ESLVal legaly = new ESLVal(new Function(new ESLVal("legaly"),null) { public ESLVal apply(ESLVal... args) { return legaly(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}