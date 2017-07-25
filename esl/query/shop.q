// This file processes SHOP snapshots to produce a state graph showing the actors and
// their connections. It should be run against a snapshot at a specific time tick.

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

state :: (Int,Str,Ref(Str),Int);
actor :: (Int,Str,Int);
send[T] :: (Int,Int,T,Int);

// declare member[T](T,[T])
// satisfied when first element is a member of the second element.

member[T] :: (T,[T]);

member[T](x,[x|_]);
member[T](x,[_|l]) <- member[T](x,l);

// declare notmember[T](T,[T])
// satified when member is not satisfied.

notmember[T] :: (T,[T]);

notmember[T](x,l) <- member[T](x,l), !, false;
notmember[T](x,l);

// declare append[T]([T],[T],[T])
// satisfied when the third list is the result of appending the first two lists.  

append[T] :: ([T],[T],[T]);

append[T]([],l,l) <- !;
append[T]([x|l1],l2,[x|l3]) <- append[T](l1,l2,l3);

length[T] :: ([T],Int);
length[T]([],0) <- !;
length[T]([_ | l],n) <-
  length[T](l,m),
  n := m + 1;
  
subset[T] :: ([T],[T]);
subset[T]([],[]);
subset[T]([x|l],[x|s]) <- subset[T](l,s);
subset[T](l,[_|s]) <- subset[T](l,s);

graph :: (Graph);

graph(Graph([],nodes,edges)) <- actors(nodes), links(edges);

links :: ([Edge]);

links(edges) <-
  allActors(as), 
  actorEdges(as,edges);
  
actorEdges :: ([Actor(Int,Str)],[Edge]);
actorEdges([],[]) <- !;
actorEdges([a | as],edges) <-
  getEdges(a,edges1), 
  actorEdges(as,edges2),
  append[Edge](edges1,edges2,edges);
  
getEdges :: (Actor(Int,Str),[Edge]);
  
getEdges(Actor(a,'aTill'),edges) <- !,
  aTillNextEdge(a,edges1),
  aTillTransactionsEdge(a,edges2),
  aTillAssistantEdge(a,edges3),
  append[Edge](edges1,edges2,edges4),
  append[Edge](edges4,edges3,edges);
  
getEdges(Actor(a,'transacted'),edges) <- !,
  aTransactedNextEdge(a,edges);
  
getEdges(Actor(a,'customer'),edges) <- !,
  customerTillsEdge(a,edges);
  
getEdges(Actor(a,'assistant'),edges) <- !,
  assistantTillsEdge(a,edges1),
  assistantAdvisingEdge(a,edges2),
  append[Edge](edges1,edges2,edges);
  
getEdges(Actor(a,'aTransaction'),edges) <- !,
  transactionCustomerEdges(a,edges1),
  transactionNextEdges(a,edges2),
  append[Edge](edges1,edges2,edges);
  
getEdges(_,[]);

assistantAdvisingEdge :: (Int,[Edge]);
assistantAdvisingEdge(a,[Edge([],a,b,Text('advising'))]) <-
  state(a,'advising',Ref(b),_),!;
assistantAdvisingEdge(_,[]);
  
transactionCustomerEdges :: (Int,[Edge]);
  
transactionCustomerEdges(a,[Edge([],a,b,Text('customer'))]) <-
  state(a,'c',Ref(b),_), !;
  
transactionCustomerEdges(a,[]);
  
transactionNextEdges(a,[Edge([],a,b,Text('next'))]) <-
  state(a,'next',Ref(b),_), !;
  
transactionNextEdges :: (Int,[Edge]);
  
transactionNextEdges(a,[]);
  
customerTillsEdge :: (Int,[Edge]);
  
customerTillsEdge(a,[Edge([],a,b,Text('tills'))]) <-
  state(a,'tills',Ref(b),_), !;
  
customerTillsEdge(a,[]);
  
assistantTillsEdge(a,[Edge([],a,b,Text('tills'))]) <-
  state(a,'tills',Ref(b),_), !;
  
assistantTillsEdge :: (Int,[Edge]);
assistantTillsEdge(a,[]);
  
aTillNextEdge(a,[Edge([],a,b,Text('next'))]) <-
  state(a,'next',Ref(b),_);
  
aTillAssistantEdge :: (Int,[Edge]);
  
aTillAssistantEdge(a,[Edge([],a,b,Text('assistant'))]) <-
  state(a,'assistant',Ref(b),_),!;
  
aTillAssistantEdge(a,[]);
  
aTillNextEdge(_,[]);
  
aTransactedNextEdge :: (Int,[Edge]);
aTransactedNextEdge(a,[Edge([],a,b,Text('next'))]) <-
 state(a,'next',Ref(b),_), !;
  
aTransactedNextEdge(a,[]);
  
aTillNextEdge :: (Int,[Edge]);
aTillNextEdge(_,[]);

aTillTransactionsEdge :: (Int,[Edge]);
  
aTillTransactionsEdge(a,[Edge([],a,b,Text('transactions'))]) <-
  state(a,'transactions',Ref(b),_);
aTillTransactionsEdge(_,[]);

actors::([Node]);
actors(nodes) <- allActors(as), println(as), actorsToNodes(as,nodes);

allActors :: ([Actor(Int,Str)]);
allActors([]) <- end, !;
allActors(actors) <- forall[actor(a,b,c)](Actor(a,b),actors'),next[allActors(actors'')],append[Actor(Int,Str)](actors',actors'',actors);

displayBehaviour :: (Str);
displayBehaviour('customer');
displayBehaviour('aTill');
displayBehaviour('leader');
displayBehaviour('gangMember');
displayBehaviour('assistant');
displayBehaviour('aTransaction');
displayBehaviour('noTransactions');
displayBehaviour('noTills');
displayBehaviour('transacted');


actorsToNodes ::([Actor(Int,Str)],[Node]);
actorsToNodes([],[]);
actorsToNodes([a|as],[n | nodes]) <- actorToNode(a,n), actorsToNodes(as,nodes);

actorToNode :: (Actor(Int,Str),Node);

actorToNode(Actor(a,'customer'),Node([Prop('shape','none')],a,Table([],[Row([],[Data([],Text(l))]),Row([],[Data([],Text(s))])]))) <- 
  l := 'customer' + a,
  state(a,'state',s,_);

actorToNode(Actor(a,'assistant'),Node([Prop('shape','none')],a,Table([],[Row([],[Data([],Text(l))]),Row([],[Data([],Text(s))])]))) <- 
  l := 'assistant' + a,
  state(a,'state',s,_);

actorToNode(Actor(a,'noTransactions'),Node([Prop('shape','point')],a,Text(l))) <-
  l := 'noTransactions' + a;

actorToNode(Actor(a,'transacted'),Node([Prop('shape','proteasesite')],a,Text(' ')));

actorToNode(Actor(a,'noTills'),Node([Prop('shape','proteinstab')],a,Text(' ')));

actorToNode(Actor(a,'aTill'),Node([],a,Text(l))) <-
  state(a,'broken',True,_),
  l := 'till' + a + '(BROKEN)';

actorToNode(Actor(a,'aTill'),Node([],a,Text(l))) <-
  state(a,'broken',False,_),
  l := 'till' + a;

actorToNode(Actor(a,'aTransaction'),Node([Prop('shape','none')],a,Table([],[Row([],[Data([],Text(l))]),Row([],[Data([],Text(tDelay))])]))) <-
  l := 'aTransaction' + a,
  state(a,'tDelay',x,tDelay);

actorToNode(Actor(a,b),Node([],a,Text(b)));

// The following are queries that can be applied to a complete shop history...

customers :: ([Int]);
customers([]) <- end, !;
customers(cs) <- forall[actor(a,'customer',_)](a,cs'), next[customers(cs'')], append[Int](cs',cs'',cs);

assistants :: ([Int]);
assistants([]) <- end, !;
assistants(cs) <- forall[actor(a,'assistant',_)](a,cs'), next[assistants(cs'')], append[Int](cs',cs'',cs);

makesPurchase :: ([Int],[Int]);
makesPurchase([],[]);
makesPurchase([c | cs],[c | cs']) <-
  makePurchase(c), !,
  makesPurchase(cs,cs');
makesPurchase([_ | cs],cs') <-
  makesPurchase(cs,cs');
  
makePurchase :: (Int);
makePurchase(c) <- eventually[send[SaleConcluded()](_,c,SaleConcluded,_)];

removeAll[T] :: ([T],[T],[T]);

removeAll[T]([],values,values);
removeAll[T]([x | xs],values,result) <-
  remove[T](x,values,values'),
  removeAll[T](xs,values',result);
  
remove[T] :: (T,[T],[T]);
remove[T](x,[],[]);
remove[T](x,[x | xs],result) <- !,
  remove[T](x,xs,result);
remove[T](x,[y|xs],[y|result]) <-
  remove[T](x,xs,result);
  
removeDuplicates[T] :: ([T],[T]);
removeDuplicates[T]([],[]);
removeDuplicates[T]([x | xs],[x | ys]) <-
  remove[T](x,xs,xs'),
  removeDuplicates[T](xs',ys);

noSales :: ([Int]);
noSales(cs'') <- 
  customers(cs),
  makesPurchase(cs,cs'),
  removeAll[Int](cs',cs,cs'');
  
loadDB :: (Str);
systemTime :: (Int);

printRaids :: ([Raid(Str,[Int])]);
printRaids([]) <- !;
printRaids([r|rs]) <- 
  println(r),
  printRaids(rs);

raidResults :: ([Str],[Raid(Str,[Int])]);
raidResults([],[]);
raidResults([file | files],[Raid(file,averages) | raids]) <-
  getRaidResultsTag(file,['a','b','c'],[2,3,4,5,6,7],timings),
  averages(timings,averages),
  raidResults(files,raids);
  
averages::([[Int]],[Int]);
averages([[] | _],[]) <- !;
averages(timings,[average | averages]) <-
  heads(timings,times), 
  tails(timings,timings'),
  average(times,average),
  averages(timings',averages);
  
heads::([[Int]],[Int]);
heads([],[]);
heads([[h|_]|rest],[h | heads]) <-
  heads(rest,heads);
  
tails::([[Int]],[[Int]]);
tails([],[]);
tails([[_|t]|rest],[t | tails]) <-
  tails(rest,tails);
  
average :: ([Int],Int);
average(ns,n) <-
  sum(ns,s),
  length[Int](ns,l),
  n := s/l;
  
sum :: ([Int],Int);
sum([],0);
sum([n | ns],s) <-
  sum(ns,s'),
  s := s' + n;
  
getRaidResultsTag :: (Str,[Str],[Int],[[Int]]);
getRaidResultsTag (file,[],cs,[]);
getRaidResultsTag(file,[t|ts],cs,[rs | raids]) <-
  getRaidResults(file,t,cs,rs),
  getRaidResultsTag(file,ts,cs,raids);
  
appStr :: (Str,Str,Str);
appStr(s1,s2,s3) <- s3 := s1 + s2;
  
getRaidResults :: (Str,Str,[Int],[Int]);
getRaidResults(file,tag,[],[]);
getRaidResults(file,tag,[c | cs],[time | times]) <- 
  appStr('/Users/acestc4/Dropbox/SHU_Files/Research/ESL/histories/shop/end',file,s),
  appStr(s,tag,s'),
  appStr(s','.hst',path),
  raidFile(c,path,time,raiders), !,
  getRaidResults(file,tag,cs,times);

raids :: ();
raids <-
  raidResults(['4','6','8','10','12','14','16','18','20','22','24','26','28','30'],raids),
  printRaids(raids);
  
raidFile :: (Int,Str,Int,[Int]);
raidFile(n,path,duration,raiders) <-
  loadDB(path),
  systemTime(t0),
  raid(n,raiders),
  systemTime(t1),
  duration := t1 - t0;
  
raidFile(n,path,0,raiders) <- println('FAIL');

raid1::(Int,Int,Int,[Int],[Int]);
raid1(n,n,t,_,[]) <- !;
raid1(0,n,t,[c | cs],[c | rs]) <- 
  eventually[state(c,'state',GettingHelp,t),raid1(1,n,t,cs,rs)];
raid1(0,n,t,[_ | cs ],rs) <- !,
  raid1(0,n,t,cs,rs);
raid1(m,n,t,[c | cs],[c | rs]) <- m < n,
  m' := m + 1,
  state(c,'state',GettingHelp,t),
  raid1(m',n,t,cs,rs), !;
raid1(m,n,t,[_ | cs ],rs) <- m < n,
  raid1(m,n,t,cs,rs);
  
raid :: (Int,[Int]);
raid(n,raiders) <-
  customers(customers), !,
  // raidOrig(n,raiders);
  raid1(0,n,t,customers,raiders);

raidOrig :: (Int,[Int]);
raidOrig(n,raiders) <-
  customers(customers), !,
  subset[Int](raiders,customers),
  length[Int](raiders,n), 
  eventually[allHelped(raiders,t)];
  //findAllHelped(raiders);
  
findAllHelped :: ([Int]);
findAllHelped(raiders) <-
  allHelped(raiders,t), !;
findAllHelped(raiders) <- next[findAllHelped(raiders)];

  
allHelped::([Int],Int);
allHelped([],t) <- !;
allHelped([c|cs],t) <- 
  state(c,'state',GettingHelp,t), 
  allHelped(cs,t);
  
filmstrip :: ([Display]);
filmstrip(filmstrip) <-
  customers(cs),
  filmstrip(cs,filmstrip);
  
filmstrip :: ([Int],[Display]);
filmstrip(_,[]) <- end;
filmstrip(cs,[snapshot | filmstrip]) <-
  snapshot(cs,snapshot),
  next[filmstrip(cs,filmstrip)];
  
snapshot :: ([Int],Display);
snapshot(customers,Table([],[Row([],[Data([],pie),Data([],states)])])) <-
  pie(customers,pie),
  states(customers,states);
  
states :: ([Int],Display);
states([],Table([],[]));
states([c|cs],Table([],[row | rows])) <-
  getStateRow(c,row), 
  states(cs,Table([],rows));

getStateRow::(Int,Row([Prop],[Data([Prop],Display)]));
getStateRow(c,Row([],[Data([],Text(t)),Data([],Text(s))])) <-
  t := c + '',
  state(c,'state',s,_), !;

pie::([Int],Display);
pie(customers,Pie([],'Satisfaction',500,500,[Slice([],'satisfied',satisfied),Slice([],'unsatisfied',unsatisfied)])) <-
  filterAnySale(customers,sales),
  length[Int](customers,clen),
  length[Int](sales,satisfied),
  unsatisfied := clen - satisfied;
  
filterAnySale::([Int],[Int]);
filterAnySale([],[]) <- !;
filterAnySale([c | cs],[c | ss]) <- 
  eventually[send[SaleConcluded()](_,c,SaleConcluded,_)], !,
  filterAnySale(cs,ss);
filterAnySale([_ | cs],ss) <-
  filterAnySale(cs,ss);
  
main::([Graph]);
main(graphs) <- allActors(as), actors(nodes), mkGraphs(0,10,100,as,nodes,graphs);

main0::(Display);
main0(pie) <- customers(cs), pie(cs,pie);

mkGraphs::(Int,Int,Int,[Actor(Int,Str)],[Node],[Graph]);

mkGraphs(current,min,max,actors,nodes,graphs) <-
  current < min, !, 
  current' := current + 1, 
  next[mkGraphs(current',min,max,actors,nodes,graphs)];
  
mkGraphs(max,_,max,actors,nodes,[]) <- !;

mkGraphs(n,min,max,actors,nodes,[Graph([],nodes,edges)|graphs]) <- 
  actorEdges(actors,edges),
  m:= n + 1, 
  next[mkGraphs(m,min,max,actors,nodes,graphs)];
  
test2 ::();
test2 <- raid(2,c);

test3 ::();
test3 <- raid(3,c);

test4 ::();
test4 <- raid(4,c);

test5 ::();
test5 <- raid(5,c);

test6 ::();
test6 <- raid(6,c);

test7 ::();
test7 <- raid(7,c);
  
do 
  graph(g), raid(as,raidTime), print(raidTime),
  //forall[eventually[send(_,a,SaleConcluded,_)]](a,as),print(as),
  noSales(customerIds),!,
  filmstrip(film), println(film)
return
 //customerIds
g






































































