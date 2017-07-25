append([],l,l);
append([x|l1],l2,[x|l3]) <- append(l1,l2,l3);

stateValue(_,_,Ref(_)) <- !;
stateValue(_,_,_) <- false;

actors(all) <- forall[
  actor(a,b,t),forall[state(a,n,v,t),stateValue(a,n,v)](State(n,v),values)
](Actor(a,b,values),all);

graph(nodes,edges) <-
  actors(all), println(all),
  actorsToNodes(all,nodes),
  actorsToEdges(all,edges1),
  messagesToEdges(all,edges2),
  append(edges1,edges2,edges);
  
actorsToNodes([],[]);
actorsToNodes([a | actors],nodes) <-
  actorToNode(a,Skip), !,
  actorsToNodes(actors,nodes);
actorsToNodes([a | actors],[Node(props,id,display) | nodes]) <-
  actorToNode(a,Node(props,id,display)),
  actorsToNodes(actors,nodes);
  
actorToNode(Actor(_,'main',_),Skip);
actorToNode(Actor(_,'init',_),Skip);
actorToNode(Actor(a,b,s),Node([],a,Table([],[Row([],[Data([],Text(l))]) | rows]))) <-
  l := b + '(' + a + ')',
  stateToRows(s,rows);
  
stateToRows([],[]);
stateToRows([s | ss],rs) <-
  stateToRow(s,Skip), !,
  stateToRows(ss,rs);
stateToRows([s | ss],[r | rs]) <-
  stateToRow(s,r),
  stateToRows(ss,rs);

stateToRow(State(_,Ref(_)),Skip);
stateToRow(State(s,v),Row([],[Data([],Text(l))])) <-
  l := s + '=' + v;
  
actorsToEdges([],[]);
actorsToEdges([Actor(a,b,s) | as],edges) <-
  actorToEdges(a,b,s,edges1),
  actorsToEdges(as,edges2),
  append(edges1,edges2,edges);

actorToEdges(a,b,[],[]);
actorToEdges(_,'main',_,[]);
actorToEdges(a,b,[State(n,v) | ss],edges) <-
  stateToEdge(a,b,n,v,Skip), !,
  actorToEdges(a,b,ss,edges);
actorToEdges(a,b,[State(n,v) | ss],[edge | edges]) <-
  stateToEdge(a,b,n,v,edge),
  actorToEdges(a,b,ss,edges);
actorToEdges(a,b,[_ | ss],edges) <-
  actorToEdges(a,b,ss,edges);
  
stateToEdge(a,b,'idle',_,Skip);
stateToEdge(a,b,n,Ref(r),Edge([],a,r,Text(n)));

messagesToEdges([],[]);
messagesToEdges([a|as],es) <-
  actorMessagesToEdges(a,es'),
  messagesToEdges(as,es''),
  append(es',es'',es);
  
actorMessagesToEdges(a,es) <-
  actorMessages(a,ms), println(ms),
  messagesToEdges(ms,es);
  
actorMessages(Actor(a,_,_),ms) <-
  forall[eventually[send(s,a,m,time)]](Message(s,a,m,time),ms);
  
messagesToEdges([],[]);
messagesToEdges([Message(source,target,m,t) | ms],[Edge([],source,target,Text(m)) | es]) <-
  messagesToEdges(ms,es);

//do forall[eventually[send(s,t,m,time)]](Send(s,t,m,time),messages),println(messages)
//return messages

do graph(nodes,edges)
return Graph([Prop('rankdir','LR')],nodes,edges)
















