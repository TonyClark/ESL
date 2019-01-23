package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Strings.*;
// import static esl.Lists.*;
public class MapReduce {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal words = splitBy(new ESLVal(32),new ESLVal("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"));
  private static ESLVal mkMap = new ESLVal(new Function(new ESLVal("mkMap"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal f = $args[0];
  ESLVal g = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("mkMap")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v130 = $m;
            
            switch(_v130.termName) {
            case "Perform": {ESLVal $198 = _v130.termRef(0);
              
              {ESLVal x = $198;
              
              return Lib.send(g,"Store",f.apply(x));
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v130)));
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
          ESLVal add(ESLVal x,ESLVal rs) {
    
    {ESLVal _v131 = x;
      
      switch(_v131.termName) {
      case "Key": {ESLVal $200 = _v131.termRef(0);
        ESLVal $199 = _v131.termRef(1);
        
        {ESLVal i = $200;
        
        {ESLVal v = $199;
        
        {ESLVal _v132 = rs;
        
        if(_v132.isCons())
        {ESLVal $201 = _v132.head();
          ESLVal $202 = _v132.tail();
          
          switch($201.termName) {
          case "Key": {ESLVal $204 = $201.termRef(0);
            ESLVal $203 = $201.termRef(1);
            
            {ESLVal j = $204;
            
            {ESLVal vs = $203;
            
            {ESLVal _v140 = $202;
            
            if(i.eql(j).boolVal)
            return _v140.cons(new ESLVal("Key",i,vs.cons(v)));
            else
              {ESLVal r = $201;
                
                {ESLVal _v141 = $202;
                
                return add(x,_v141).cons(r);
              }
              }
          }
          }
          }
          }
          default: {ESLVal r = $201;
            
            {ESLVal _v142 = $202;
            
            return add(x,_v142).cons(r);
          }
          }
        }
        }
      else if(_v132.isNil())
        return ESLVal.list(new ESLVal("Key",i,ESLVal.list(v)));
      else return error(new ESLVal("case error at Pos(2588,2830)").add(ESLVal.list(_v132)));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2316,2836)").add(ESLVal.list(_v131)));
    }
    }
  }
  ESLVal add = new ESLVal(new Function(new ESLVal("add"),null) { public ESLVal apply(ESLVal... args) { return add(args[0],args[1]); }});
ESLVal results = $nil;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v133 = $m;
            
            switch(_v133.termName) {
            case "Store": {ESLVal $205 = _v133.termRef(0);
              
              {ESLVal x = $205;
              
              if(n[0].eql($one).boolVal)
              {results = add(x,results);
              {{
                ESLVal _v134 = results;
                while(_v134.isCons()) {
                  ESLVal r = _v134.headVal;
                  Lib.send(reduce,"Process",r);
                  _v134 = _v134.tailVal;}
              }
              return $null;}}
              else
                {ESLVal _v143 = $205;
                  
                  {results = add(_v143,results);
                {n[0] = n[0].sub($one);
                return $null;}}
                }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v133)));
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
  private static ESLVal reduceWordLen = new ESLVal(new Function(new ESLVal("reduceWordLen"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("reduceWordLen")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v135 = $m;
            
            switch(_v135.termName) {
            case "Process": {ESLVal $206 = _v135.termRef(0);
              
              {ESLVal r = $206;
              
              {ESLVal _v136 = r;
              
              switch(_v136.termName) {
              case "Key": {ESLVal $208 = _v136.termRef(0);
                ESLVal $207 = _v136.termRef(1);
                
                {ESLVal i = $208;
                
                {ESLVal s = $207;
                
                return print.apply(i.add(new ESLVal(" ").add(s)));
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(4390,4479)").add(ESLVal.list(_v136)));
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v135)));
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
  private static ESLVal occurs = new ESLVal(new Function(new ESLVal("occurs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("occurs")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v137 = $m;
            
            switch(_v137.termName) {
            case "Process": {ESLVal $209 = _v137.termRef(0);
              
              {ESLVal r = $209;
              
              {ESLVal _v138 = r;
              
              switch(_v138.termName) {
              case "Key": {ESLVal $211 = _v138.termRef(0);
                ESLVal $210 = _v138.termRef(1);
                
                {ESLVal s = $211;
                
                {ESLVal is = $210;
                
                return print.apply(s.add(new ESLVal(" ocurrences = ").add(length.apply(is))));
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(5137,5253)").add(ESLVal.list(_v138)));
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v137)));
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
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v139 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v139)));
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
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {mapReduceWordLength();
                return mapReduceOccurrences();}
              }}.get();
          }
        });
    }
  });
private static ESLVal mapReduce(ESLVal l,ESLVal f,ESLVal g) {
    
    {{
      ESLVal _v129 = l;
      while(_v129.isCons()) {
        ESLVal x = _v129.headVal;
        Lib.send(newActor(mkMap,new ESLVal(new Actor()),f,g),"Perform",x);
        _v129 = _v129.tailVal;}
    }
    return $null;}
  }
  private static ESLVal mapReduce = new ESLVal(new Function(new ESLVal("mapReduce"),null) { public ESLVal apply(ESLVal... args) { return mapReduce(args[0],args[1],args[2]); }});
  private static ESLVal strLen(ESLVal s) {
    
    return new ESLVal("Key",length.apply(s.ref("explode")),s);
  }
  private static ESLVal strLen = new ESLVal(new Function(new ESLVal("strLen"),null) { public ESLVal apply(ESLVal... args) { return strLen(args[0]); }});
  private static ESLVal mapReduceWordLength() {
    
    {ESLVal g = newActor(mkGroup,new ESLVal(new Actor()),length.apply(words),newActor(reduceWordLen,new ESLVal(new Actor())));
      
      return mapReduce(words,strLen,g);
    }
  }
  private static ESLVal mapReduceWordLength = new ESLVal(new Function(new ESLVal("mapReduceWordLength"),null) { public ESLVal apply(ESLVal... args) { return mapReduceWordLength(); }});
  private static ESLVal strOccurs(ESLVal s) {
    
    return new ESLVal("Key",s,$one);
  }
  private static ESLVal strOccurs = new ESLVal(new Function(new ESLVal("strOccurs"),null) { public ESLVal apply(ESLVal... args) { return strOccurs(args[0]); }});
  private static ESLVal mapReduceOccurrences() {
    
    {ESLVal g = newActor(mkGroup,new ESLVal(new Actor()),length.apply(words),newActor(occurs,new ESLVal(new Actor())));
      
      return mapReduce(words,strOccurs,g);
    }
  }
  private static ESLVal mapReduceOccurrences = new ESLVal(new Function(new ESLVal("mapReduceOccurrences"),null) { public ESLVal apply(ESLVal... args) { return mapReduceOccurrences(); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}