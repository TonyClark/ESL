package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Strings.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class MapReduce {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal words = splitBy.apply(new ESLVal(32),new ESLVal("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"));
  private static ESLVal mkMap = new ESLVal(new Function(new ESLVal("mkMap"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal g = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("mkMap")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v11 = $m;
            
            switch(_v11.termName) {
            case "Perform": {ESLVal $14 = _v11.termRef(0);
              
              {ESLVal x = $14;
              
              return Lib.send(g,"Store",f.apply(x));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v11)));
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
  private static ESLVal mkGroup = new ESLVal(new Function(new ESLVal("mkGroup"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal[] n = new ESLVal[]{$args[0]};
  ESLVal reduce = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("mkGroup")) {
          ESLVal results = ESLVal.list();
          ESLVal add = new ESLVal(new Function(new ESLVal("add"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal x = $args[0];
            ESLVal rs = $args[1];
            {ESLVal _v7 = x;
                  
                  switch(_v7.termName) {
                  case "Key": {ESLVal $8 = _v7.termRef(0);
                    ESLVal $7 = _v7.termRef(1);
                    
                    {ESLVal i = $8;
                    
                    {ESLVal v = $7;
                    
                    {ESLVal _v8 = rs;
                    
                    if(_v8.isCons())
                    {ESLVal $9 = _v8.head();
                      ESLVal $10 = _v8.tail();
                      
                      switch($9.termName) {
                      case "Key": {ESLVal $12 = $9.termRef(0);
                        ESLVal $11 = $9.termRef(1);
                        
                        {ESLVal j = $12;
                        
                        {ESLVal vs = $11;
                        
                        {ESLVal _v12 = $10;
                        
                        if(i.eql(j).boolVal)
                        return _v12.cons(new ESLVal("Key",i,vs.cons(v)));
                        else
                          {ESLVal r = $9;
                            
                            {ESLVal _v13 = $10;
                            
                            return add.apply(x,_v13).cons(r);
                          }
                          }
                      }
                      }
                      }
                      }
                      default: {ESLVal r = $9;
                        
                        {ESLVal _v14 = $10;
                        
                        return add.apply(x,_v14).cons(r);
                      }
                      }
                    }
                    }
                  else if(_v8.isNil())
                    return ESLVal.list(new ESLVal("Key",i,ESLVal.list(v)));
                  else return error(new ESLVal("case error at Pos(2587,2829)").add(ESLVal.list(_v8)));
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(2315,2835)").add(ESLVal.list(_v7)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v9 = $m;
            
            switch(_v9.termName) {
            case "Store": {ESLVal $13 = _v9.termRef(0);
              
              {ESLVal x = $13;
              
              if(n[0].eql($one).boolVal)
              {results = add.apply(x,results);
              {{
                ESLVal _v10 = results;
                while(_v10.isCons()) {
                  ESLVal r = _v10.headVal;
                  Lib.send(reduce,"Process",r);
                  _v10 = _v10.tailVal;}
              }
              return $null;}}
              else
                {ESLVal _v15 = $13;
                  
                  {results = add.apply(_v15,results);
                {n[0] = n[0].sub($one);
                return $null;}}
                }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v9)));
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
  private static ESLVal mapper = new ESLVal(new Function(new ESLVal("mapper"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal f = $args[1];
  ESLVal g = $args[2];
  {{
        ESLVal _v6 = l;
        while(_v6.isCons()) {
          ESLVal x = _v6.headVal;
          Lib.send(newActor(mkMap,new ESLVal(new Actor()),f,g),"Perform",x);
          _v6 = _v6.tailVal;}
      }
      return $null;}
    }
  });
  private static ESLVal reduceWordLen = new ESLVal(new Function(new ESLVal("reduceWordLen"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("reduceWordLen")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            switch(_v4.termName) {
            case "Process": {ESLVal $4 = _v4.termRef(0);
              
              {ESLVal r = $4;
              
              {ESLVal _v5 = r;
              
              switch(_v5.termName) {
              case "Key": {ESLVal $6 = _v5.termRef(0);
                ESLVal $5 = _v5.termRef(1);
                
                {ESLVal i = $6;
                
                {ESLVal s = $5;
                
                return print.apply(i.add(new ESLVal(" ").add(s)));
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(4386,4475)").add(ESLVal.list(_v5)));
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
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
  private static ESLVal strLen = new ESLVal(new Function(new ESLVal("strLen"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  return new ESLVal("Key",length.apply(s.ref("explode")),s);
    }
  });
  private static ESLVal mapReduceWordLength = new ESLVal(new Function(new ESLVal("mapReduceWordLength"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {ESLVal g = newActor(mkGroup,new ESLVal(new Actor()),length.apply(words),newActor(reduceWordLen,new ESLVal(new Actor())));
        
        return mapper.apply(words,strLen,g);
      }
    }
  });
  private static ESLVal occurs = new ESLVal(new Function(new ESLVal("occurs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("occurs")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "Process": {ESLVal $1 = _v2.termRef(0);
              
              {ESLVal r = $1;
              
              {ESLVal _v3 = r;
              
              switch(_v3.termName) {
              case "Key": {ESLVal $3 = _v3.termRef(0);
                ESLVal $2 = _v3.termRef(1);
                
                {ESLVal s = $3;
                
                {ESLVal is = $2;
                
                return print.apply(s.add(new ESLVal(" ocurrences = ").add(length.apply(is))));
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(5130,5246)").add(ESLVal.list(_v3)));
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
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
  private static ESLVal strOccurs = new ESLVal(new Function(new ESLVal("strOccurs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  return new ESLVal("Key",s,$one);
    }
  });
  private static ESLVal mapReduceOccurrences = new ESLVal(new Function(new ESLVal("mapReduceOccurrences"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {ESLVal g = newActor(mkGroup,new ESLVal(new Actor()),length.apply(words),newActor(occurs,new ESLVal(new Actor())));
        
        return mapper.apply(words,strOccurs,g);
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
                {mapReduceWordLength.apply();
                return mapReduceOccurrences.apply();}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}