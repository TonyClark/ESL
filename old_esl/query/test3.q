length[T]::([T],Int);
length[T]([],0);
length[T]([_|l],n) <-
  length[T](l,m),
  n := m + 1;
  
mkList::(Int,[Int]);
mkList(0,[]);
mkList(n,[n|l]) <- m := n - 1, mkList(m,l);
  
main::(Int,Int);
main(m,n) <-
  mkList(m,l),
  length[Int](l,n);

 
