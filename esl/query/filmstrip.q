actors(all,limit) <- forall[
  actor(a,b,_), forall[state(a,n,v,t),t < limit, println(t)](State(n,v),values)
](Actor(a,b,values),all);

do actors(as,100)
return as



