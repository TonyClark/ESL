package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class ColourGraph {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal nodeColour = new ESLVal(new Function(new ESLVal("nodeColour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  return propValue.apply(nodeProps.apply(n),new ESLVal("fillcolor"));
    }
  });
  private static ESLVal setNodeColour = new ESLVal(new Function(new ESLVal("setNodeColour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal c = $args[1];
  return setNodeProps.apply(n,setProp.apply(nodeProps.apply(n),new ESLVal("fillcolor"),c));
    }
  });
  private static ESLVal edgeBetween = new ESLVal(new Function(new ESLVal("edgeBetween"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal n1 = $args[1];
  ESLVal n2 = $args[2];
  return edgeTo.apply(e,n1,n2).or(edgeTo.apply(e,n2,n1));
    }
  });
  private static ESLVal edgeTo = new ESLVal(new Function(new ESLVal("edgeTo"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal n1 = $args[1];
  ESLVal n2 = $args[2];
  return edgeSource.apply(e).eql(nodeId.apply(n1)).and(edgeTarget.apply(e).eql(nodeId.apply(n2)));
    }
  });
  private static ESLVal kempe = new ESLVal(new Function(new ESLVal("kempe"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal graph = $args[0];
  ESLVal colours = $args[1];
  {ESLVal _v1 = graph;
        
        switch(_v1.termName) {
        case "Graph": {ESLVal $3 = _v1.termRef(0);
          ESLVal $2 = _v1.termRef(1);
          ESLVal $1 = _v1.termRef(2);
          
          if($2.isCons())
          {ESLVal $4 = $2.head();
            ESLVal $5 = $2.tail();
            
            {ESLVal props = $3;
            
            {ESLVal nodes = $2;
            
            {ESLVal edges = $1;
            
            {ESLVal degreeLessThan5 = new ESLVal(new Function(new ESLVal("degreeLessThan5"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal n = $args[0];
              return length.apply(new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal e = $l0.head();
                          $l0 = $l0.tail();
                          if(edgeSource.apply(e).eql(nodeId.apply(n)).or(edgeTarget.apply(e).eql(nodeId.apply(n))).boolVal) {$v.add(e);
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(edges)).lesseql(new ESLVal(5));
                }
              });
            
            {ESLVal n = select1.apply(nodes,$null,degreeLessThan5);
            
            {ESLVal es = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal e = $l0.head();
                    $l0 = $l0.tail();
                    if(edgeSource.apply(e).eql(nodeId.apply(n)).or(edgeTarget.apply(e).eql(nodeId.apply(n))).boolVal) {$v.add(e);
              }
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(edges);
            
            {ESLVal g = kempe.apply(new ESLVal("Graph",props,remove.apply(n,nodes),removeAll.apply(es,edges)),colours);
            
            {ESLVal _v2 = g;
            
            switch(_v2.termName) {
            case "Graph": {ESLVal $8 = _v2.termRef(0);
              ESLVal $7 = _v2.termRef(1);
              ESLVal $6 = _v2.termRef(2);
              
              {ESLVal _v5 = $8;
              
              {ESLVal _v6 = $7;
              
              {ESLVal _v7 = $6;
              
              {ESLVal adjacent = new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n0 = $l0.head();
                      $l0 = $l0.tail();
                      if(exists.apply(new ESLVal(new Function(new ESLVal("fun38"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal e = $args[0];
                return edgeBetween.apply(e,n,n0);
                  }
                }),es).boolVal) {$v.add(n0);
                }
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(_v6);
              
              {ESLVal usedColours = new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(nodeColour.apply(n));
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(adjacent);
              
              {ESLVal available = removeAll.apply(usedColours,colours);
              
              return new ESLVal("Graph",_v5,_v6.cons(setNodeColour.apply(n,head.apply(available))),_v7.add(es));
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(1141,1549)").add(ESLVal.list(_v2)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
          }
        else if($2.isNil())
          {ESLVal props = $3;
            
            {ESLVal edges = $1;
            
            return graph;
          }
          }
        else {ESLVal props = $3;
            
            {ESLVal nodes = $2;
            
            {ESLVal edges = $1;
            
            {ESLVal degreeLessThan5 = new ESLVal(new Function(new ESLVal("degreeLessThan5"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal n = $args[0];
              return length.apply(new java.util.function.Function<ESLVal,ESLVal>() {
                      public ESLVal apply(ESLVal $l0) {
                        ESLVal $a = $nil;
                        java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                        while(!$l0.isNil()) { 
                          ESLVal e = $l0.head();
                          $l0 = $l0.tail();
                          if(edgeSource.apply(e).eql(nodeId.apply(n)).or(edgeTarget.apply(e).eql(nodeId.apply(n))).boolVal) {$v.add(e);
                    }
                        }
                        for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                        return $a;
                      }}.apply(edges)).lesseql(new ESLVal(5));
                }
              });
            
            {ESLVal n = select1.apply(nodes,$null,degreeLessThan5);
            
            {ESLVal es = new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal e = $l0.head();
                    $l0 = $l0.tail();
                    if(edgeSource.apply(e).eql(nodeId.apply(n)).or(edgeTarget.apply(e).eql(nodeId.apply(n))).boolVal) {$v.add(e);
              }
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(edges);
            
            {ESLVal g = kempe.apply(new ESLVal("Graph",props,remove.apply(n,nodes),removeAll.apply(es,edges)),colours);
            
            {ESLVal _v3 = g;
            
            switch(_v3.termName) {
            case "Graph": {ESLVal $11 = _v3.termRef(0);
              ESLVal $10 = _v3.termRef(1);
              ESLVal $9 = _v3.termRef(2);
              
              {ESLVal _v8 = $11;
              
              {ESLVal _v9 = $10;
              
              {ESLVal _v10 = $9;
              
              {ESLVal adjacent = new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n0 = $l0.head();
                      $l0 = $l0.tail();
                      if(exists.apply(new ESLVal(new Function(new ESLVal("fun38"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal e = $args[0];
                return edgeBetween.apply(e,n,n0);
                  }
                }),es).boolVal) {$v.add(n0);
                }
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(_v9);
              
              {ESLVal usedColours = new java.util.function.Function<ESLVal,ESLVal>() {
                  public ESLVal apply(ESLVal $l0) {
                    ESLVal $a = $nil;
                    java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                    while(!$l0.isNil()) { 
                      ESLVal n = $l0.head();
                      $l0 = $l0.tail();
                      $v.add(nodeColour.apply(n));
                    }
                    for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                    return $a;
                  }}.apply(adjacent);
              
              {ESLVal available = removeAll.apply(usedColours,colours);
              
              return new ESLVal("Graph",_v8,_v9.cons(setNodeColour.apply(n,head.apply(available))),_v10.add(es));
            }
            }
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(1141,1549)").add(ESLVal.list(_v3)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        }
        default: return error(new ESLVal("case error at Pos(629,1553)").add(ESLVal.list(_v1)));
      }
      }
    }
  });
  private static ESLVal mkPlanar = new ESLVal(new Function(new ESLVal("mkPlanar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal v = $args[0];
  return new ESLVal("Graph",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              $v.add(new ESLVal("Node",ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("filled")),new ESLVal("Prop",new ESLVal("fillcolor"),new ESLVal(""))),i,new ESLVal("HTML",new ESLVal("N").add(i))));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(v)),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal i = $l0.head();
              $l0 = $l0.tail();
              ESLVal $l1 = ESLVal.list(random.apply(v));
        while(!$l1.isNil()) {
          ESLVal source = $l1.head();
          $l1 = $l1.tail();
          ESLVal $l2 = ESLVal.list(random.apply(v));
          while(!$l2.isNil()) {
            ESLVal target = $l2.head();
            $l2 = $l2.tail();
            if(source.neql(target).boolVal) {$v.add(new ESLVal("Edge",ESLVal.list(),source,target,new ESLVal("HTML",new ESLVal(""))));
            }
          }
        }
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply($zero.to(random.apply(new ESLVal(3).mul(v).sub(new ESLVal(6))))));
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
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
            return Lib.send(edb,"Show",new ESLVal("graph"),kempe.apply(mkPlanar.apply(new ESLVal(200)),ESLVal.list(new ESLVal("red"),new ESLVal("green"),new ESLVal("blue"),new ESLVal("gold"),new ESLVal("deeppink"))));
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}