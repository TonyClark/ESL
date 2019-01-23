package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
public class ColourGraph {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v108 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v108)));
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
                {Lib.send(edb,"Show",new ESLVal("graph"),kempe(mkPlanar(new ESLVal(500)),ESLVal.list(new ESLVal("red"),new ESLVal("green"),new ESLVal("blue"),new ESLVal("gold"),new ESLVal("deeppink"))));
                return stopAll.apply();}
              }}.get();
          }
        });
    }
  });
private static ESLVal nodeColour(ESLVal n) {
    
    return propValue(nodeProps(n),new ESLVal("fillcolor"));
  }
  private static ESLVal nodeColour = new ESLVal(new Function(new ESLVal("nodeColour"),null) { public ESLVal apply(ESLVal... args) { return nodeColour(args[0]); }});
  private static ESLVal setNodeColour(ESLVal n,ESLVal c) {
    
    return setNodeProps(n,setProp(nodeProps(n),new ESLVal("fillcolor"),c));
  }
  private static ESLVal setNodeColour = new ESLVal(new Function(new ESLVal("setNodeColour"),null) { public ESLVal apply(ESLVal... args) { return setNodeColour(args[0],args[1]); }});
  private static ESLVal edgeBetween(ESLVal e,ESLVal n1,ESLVal n2) {
    
    return edgeTo(e,n1,n2).or(edgeTo(e,n2,n1));
  }
  private static ESLVal edgeBetween = new ESLVal(new Function(new ESLVal("edgeBetween"),null) { public ESLVal apply(ESLVal... args) { return edgeBetween(args[0],args[1],args[2]); }});
  private static ESLVal edgeTo(ESLVal e,ESLVal n1,ESLVal n2) {
    
    return edgeSource(e).eql(nodeId(n1)).and(edgeTarget(e).eql(nodeId(n2)));
  }
  private static ESLVal edgeTo = new ESLVal(new Function(new ESLVal("edgeTo"),null) { public ESLVal apply(ESLVal... args) { return edgeTo(args[0],args[1],args[2]); }});
  private static ESLVal kempe(ESLVal graph,ESLVal colours) {
    
    {ESLVal _v105 = graph;
      
      switch(_v105.termName) {
      case "Graph": {ESLVal $143 = _v105.termRef(0);
        ESLVal $142 = _v105.termRef(1);
        ESLVal $141 = _v105.termRef(2);
        
        if($142.isCons())
        {ESLVal $144 = $142.head();
          ESLVal $145 = $142.tail();
          
          {ESLVal props = $143;
          
          {ESLVal nodes = $142;
          
          {ESLVal edges = $141;
          
          {ESLVal degreeLessThan5 = new ESLVal(new Function(new ESLVal("degreeLessThan5"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return length.apply(new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal e = $l0.head();
                        $l0 = $l0.tail();
                        if(edgeSource(e).eql(nodeId(n)).or(edgeTarget(e).eql(nodeId(n))).boolVal) {$v.add(e);
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(edges)).lesseql(new ESLVal(5));
              }
            });
          
          {ESLVal n = select1(nodes,$null,degreeLessThan5);
          
          {ESLVal es = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  if(edgeSource(e).eql(nodeId(n)).or(edgeTarget(e).eql(nodeId(n))).boolVal) {$v.add(e);
            }
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(edges);
          
          {ESLVal g = kempe(new ESLVal("Graph",props,remove.apply(n,nodes),removeAll(es,edges)),colours);
          
          {ESLVal _v106 = g;
          
          switch(_v106.termName) {
          case "Graph": {ESLVal $148 = _v106.termRef(0);
            ESLVal $147 = _v106.termRef(1);
            ESLVal $146 = _v106.termRef(2);
            
            {ESLVal _v109 = $148;
            
            {ESLVal _v110 = $147;
            
            {ESLVal _v111 = $146;
            
            {ESLVal adjacent = new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n0 = $l0.head();
                    $l0 = $l0.tail();
                    if(exists.apply(new ESLVal(new Function(new ESLVal("fun59"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return edgeBetween(e,n,n0);
                }
              }),es).boolVal) {$v.add(n0);
              }
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(_v110);
            
            {ESLVal usedColours = new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(nodeColour(n));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(adjacent);
            
            {ESLVal available = removeAll(usedColours,colours);
            
            return new ESLVal("Graph",_v109,_v110.cons(setNodeColour(n,head.apply(available))),_v111.add(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1142,1550)").add(ESLVal.list(_v106)));
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
      else if($142.isNil())
        {ESLVal props = $143;
          
          {ESLVal edges = $141;
          
          return graph;
        }
        }
      else {ESLVal props = $143;
          
          {ESLVal nodes = $142;
          
          {ESLVal edges = $141;
          
          {ESLVal degreeLessThan5 = new ESLVal(new Function(new ESLVal("degreeLessThan5"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal n = $args[0];
            return length.apply(new SerializableFunction<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal e = $l0.head();
                        $l0 = $l0.tail();
                        if(edgeSource(e).eql(nodeId(n)).or(edgeTarget(e).eql(nodeId(n))).boolVal) {$v.add(e);
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(edges)).lesseql(new ESLVal(5));
              }
            });
          
          {ESLVal n = select1(nodes,$null,degreeLessThan5);
          
          {ESLVal es = new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal e = $l0.head();
                  $l0 = $l0.tail();
                  if(edgeSource(e).eql(nodeId(n)).or(edgeTarget(e).eql(nodeId(n))).boolVal) {$v.add(e);
            }
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply(edges);
          
          {ESLVal g = kempe(new ESLVal("Graph",props,remove.apply(n,nodes),removeAll(es,edges)),colours);
          
          {ESLVal _v107 = g;
          
          switch(_v107.termName) {
          case "Graph": {ESLVal $151 = _v107.termRef(0);
            ESLVal $150 = _v107.termRef(1);
            ESLVal $149 = _v107.termRef(2);
            
            {ESLVal _v112 = $151;
            
            {ESLVal _v113 = $150;
            
            {ESLVal _v114 = $149;
            
            {ESLVal adjacent = new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n0 = $l0.head();
                    $l0 = $l0.tail();
                    if(exists.apply(new ESLVal(new Function(new ESLVal("fun59"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return edgeBetween(e,n,n0);
                }
              }),es).boolVal) {$v.add(n0);
              }
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(_v113);
            
            {ESLVal usedColours = new SerializableFunction<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal n = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(nodeColour(n));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply(adjacent);
            
            {ESLVal available = removeAll(usedColours,colours);
            
            return new ESLVal("Graph",_v112,_v113.cons(setNodeColour(n,head.apply(available))),_v114.add(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(1142,1550)").add(ESLVal.list(_v107)));
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
      default: return error(new ESLVal("case error at Pos(630,1554)").add(ESLVal.list(_v105)));
    }
    }
  }
  private static ESLVal kempe = new ESLVal(new Function(new ESLVal("kempe"),null) { public ESLVal apply(ESLVal... args) { return kempe(args[0],args[1]); }});
  private static ESLVal mkPlanar(ESLVal v) {
    
    return new ESLVal("Graph",$nil,new SerializableFunction<ESLVal,ESLVal>() {
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
        }}.apply($zero.to(v)),new SerializableFunction<ESLVal,ESLVal>() {
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
          if(source.neql(target).boolVal) {$v.add(new ESLVal("Edge",$nil,source,target,new ESLVal("HTML",new ESLVal(""))));
          }
        }
      }
          }
          for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
          return $a;
        }}.apply($zero.to(random.apply(new ESLVal(3).mul(v).sub(new ESLVal(6))))));
  }
  private static ESLVal mkPlanar = new ESLVal(new Function(new ESLVal("mkPlanar"),null) { public ESLVal apply(ESLVal... args) { return mkPlanar(args[0]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}