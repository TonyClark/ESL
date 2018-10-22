type Prop = Prop(Str,Str);
type Display = rec T. union{ 
  Table([Prop],[Row([Prop],[Data([Prop],T)])]), 
  Pie([Prop],Str,Int,Int,[Slice([Prop],Str,Int)]),
  Text(Str), 
  Graph([Prop],[Node([Prop],Int,T)],[Edge([Prop],Int,Int,T)])
};
type Node = Node([Prop],Int,Display);
type Edge = Edge([Prop],Int,Int,Display);
type Graph = Graph([Prop],[Node],[Edge]);
type Arm = Str;
type Def = Binding(Int,Int,Str,Str,Fun(Int,Int,Str,Str,Str,Act(Int,Int,Str,Str,Str,Str,[Arm])));

staticDiagram::([Def],Graph);
staticDiagram([],Graph([],[],[])) <-
  println(defs);
staticDiagram([def|defs],g) <-
  processDef(def,g1),
  staticDiagram(defs,g2);
  
processDef::(Def,Graph);
processDef(Binding(_,_,_,_,Fun(_,_,_,_,Fun(_,_,_,_,Act(_,_,name,_,_,_,arms)))),g) <-
  println(name);
processDef(d,g) <-
  println(d);

do x





