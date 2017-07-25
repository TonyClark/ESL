main1 <-  forall[
  x(x,y),
  forall[
    x(a,b)
  ](Pair(a,b),l)
](Triple(x,y,l),l'), length(l',k), println(k);

main <- end, !;
main <- forall[actor(a,'assistant',c)](a,as), println(as), getAdvising(as,advising),println(advising), firstAdvising(as,first), println(first);
//main <- forall[send(a,b,c,d)](Send(a,b,c,d),ss), !, next[main];
//main <- forall[state(a,b,c,d)](State(a,b,c,d),ss), !, next[main];
main <- next[main];

getAdvising([],[]) <- !;
getAdvising([a|as],[Advising(a,vs) | advising]) <- allAdvising(a,vs), getAdvising(as,advising);

firstAdvising([],[]) <- !;
firstAdvising([a | as],[First(a,c,t) | advising]) <- eventually[state(a,'advising',c,t)], !, firstAdvising(as,advising);
firstAdvising([_ | as],advising) <- firstAdvising(as,advising);

allAdvising(a,[]) <- end, !;
allAdvising(a,[v | vs]) <- state(a,'advising',v,_), !, next[allAdvising(a,vs)];
allAdvising(a,vs) <- next[allAdvising(a,vs)];

display([]) <- !;
display(x) <- println(x);

length([],0) <- !;
length([_|t],n) <- length(t,m), n := m + 1;

y(0,1);
y(1,2);
y(2,3);
