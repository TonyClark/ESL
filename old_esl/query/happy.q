append([],l,l);
append([x|l1],l2,[x|l3]) <- append(l1,l2,l3);

member(x,[x|_]);
member(x,[_|l]) <- member(x,l);

take(0,l,[],l) <- !;
take(n,[],[],[]) <- !;
take(n,[x | l1],[x | l2],l3) <- m := n - 1, take(m,l1,l2,l3);

length([],0);
length([_|l],n) <- length(l,m), n := m + 1;

mkList(0,[]);
mkList(n,[x|l]) <- m := n - 1, mkList(m,l);

// print all the actors...

printActors(b) <- actor(i,b1,t), if b = b1 then print(i), print(' '), false else false;
printActors(_) <- println('');

// notmember(x,l) succeeds when x is a member of the list l.

notmember(x,[]) <- !;
notmember(x,[x|_]) <- !, false;
notmember(x,[_|l]) <- notmember(x,l);

// customers(c,[]) succeeds when c is a list of the customer actors at the current time.

customers([i|c],all) <- eventually[actor(i,'customer',_)], notmember(i,all), !, customers(c,[i|all]);
customers([],_);

// concluded(target) succeeds when the target is a customer that makes at least one purchase.
// timedOut(target) succeeds when the target is a customer that 

concluded(target) <- eventually[send(source,target,SaleConcluded,_)],!;
timedOut(target)  <- eventually[send(source,target,SaleTimedOut,_)], !;

// A customer is eventually happy when a sale is concluded and there is no timeout.

eventuallyHappy(customer) <- timedOut(customer), !, false;
eventuallyHappy(customer) <- concluded(customer);

// findHappy(customers,happy) is satisfied when happy are those customers that are eventually happy.

findHappy([],_) <- !, false;
findHappy([a|as],a) <- eventuallyHappy(a),!;
findHappy([_|as],a) <- findHappy(as,a);

// happyCustomers(happy) is satisfied when happy is a list of happy customers.

happyCustomers(happy) <- customers(cs,[]), !, filterHappy(cs,happy);
filterHappy([a|as],[a|hs]) <- eventuallyHappy(a), !, filterHappy(as,hs);
filterHappy([_|as],hs) <- !, filterHappy(as,hs);
filterHappy([],[]);

// unhappyCustomers(unhappy) is satisfied when unhappy is a list of customers none of which are happy.

unhappyCustomers(unhappy) <- customers(cs,[]), !, filterUnhappy(cs,unhappy);
filterUnhappy([a|as],hs) <- eventuallyHappy(a), !, filterUnhappy(as,hs);
filterUnhappy([a|as],[a|hs]) <- !, filterUnhappy(as,hs);
filterUnhappy([],[]);


neverHappy(target) <- eventually[send(_,target,SaleConcluded,_)],!,println(target),false;
neverHappy(target) <- true;
messages(a,[Edge([],a,a,Text(m))|ms]) <- eventually[send(_,a,m,t),println(t),next[messages(a,ms)]];
messages(a,[]);

graph(Graph([Node([],c,Text(c))],ms)) <- customers(cs,[]), member(c,cs), println(cs), neverHappy(c), messages(c,ms), println(ms);

tableOfCustomers(Table([],rows),n) <- println('HERE'),
  customers(cs,[]), println(cs),
  customerGraphs(cs, gs), 
  println(gs),
  splitList(gs,n,rs), println(rs),
  mkRows(rs,rows);
  
splitList([],_,[]);
splitList(l1,n,[l2 | ls]) <- print('SPLIT'), length(l1,len), println(len), take(n,l1,l2,l3), length(l2,len2), println(len2), length(l3,len3), println(len3), splitList(l3,n,ls);

mkRows([],[]);
mkRows([elements | rest],[Row([],data) | rows]) <- mkCols(elements,data), mkRows(rest,rows);

mkCols([],[]);
mkCols([element | elements],[Data([],element) | data]) <- mkCols(elements,data);

graph2(g) <- customers(cs,[]), shopGraph(cs,shopGraph), customerGraphs(cs,gs), mergeGraphs([shopGraph | gs],g);
shopGraph([],Graph([],[Node([],Shop,Text(Shop))],[]));
shopGraph([c|cs],Graph(_,nodes,[Edge([],Shop,NotInShop(c),Text(Customer(c))) | edges])) <- shopGraph(cs,Graph([],nodes,edges));
customerGraphs([],[]);
customerGraphs([c|cs],[g|gs]) <- customerGraph(c,g), customerGraphs(cs,gs);
customerGraph(c,Graph(_,nodes,edges)) <- customerNodes(c,nodes), customerEdges(c,edges);
customerNodes(c,[Node([],NotInShop(c),Text(NotInShop(c))),Node([],Browsing(c),Text(Browsing(c))),Node([],Queueing(c),Text(Queueing(c)))]);

customerEdges(c,edges) <-
  transitionEdges(c,NotInShop,Browsing,NotInShop(c),Browsing(c),browsingEdges),
  transitionEdges(c,Browsing,Queuing,Browsing(c),Queueing(c),queueingEdges),
  salesEdges(c,leavingEdges1),
  noSaleEdges(c,leavingEdges2),
  append(browsingEdges,queueingEdges,edges1),
  append(edges1,leavingEdges1,edges2),
  append(edges2,leavingEdges2,edges);
  
transitionEdges(c,sourceState,targetState,sourceNode,targetNode,[Edge([],sourceNode,targetNode,Text(t)) | edges]) <-
  eventually[state(c,'state',sourceState,_),eventually[state(c,'state',targetState,t),!,next[transitionEdges(c,sourceState,targetState,sourceNode,targetNode,edges)]]];
transitionEdges(c,_,_,_,_,[]);

salesEdges(c,[Edge([],Queueing(c),NotInShop(c),Text(Sale(t))) | edges]) <- 
  eventually[send(_,c,SaleConcluded,t),!,next[salesEdges(c,edges)]];
salesEdges(c,[]);

noSaleEdges(c,[Edge([],Queueing(c),NotInShop(c),Text(TimeOut(t))) | edges]) <- 
  eventually[send(_,c,SaleTimedOut,t),!,next[noSaleEdges(c,edges)]];
noSaleEdges(c,[]);

mergeGraphs([],Graph([],[],[]));
mergeGraphs([Graph(_,nodes,edges) | gs],Graph([],nodes1,edges1)) <- mergeGraphs(gs,Graph([],nodes2,edges2)), append(nodes,nodes2,nodes1), append(edges,edges2,edges1);

test1(g) <- graph2(g);
test2(t) <- tableOfCustomers(t,3);

do tableOfCustomers(t,5)
return t





































