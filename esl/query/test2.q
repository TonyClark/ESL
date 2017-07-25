type Num = Int;
type INum = Num;
type P[T] = Pair(T,T);

actor::(Int,Str,Int);

test1 :: (INum);
test1(x) <- append[Int]([1,2,3],[x],l);

append[T] :: ([T],[T],[T]);
append[T]([],l,l) <- !;
append[T]([h|l1],l2,[h|l3]) <- append[T](l1,l2,l3);

test2 :: (T(Str));
test2(T('x')) <- test2(T('z'));
test2(T('y'));
test2(T('z')) <- test2(T('y'));

test3::([T(Str)]);
test3(xs) <- forall[test2(x)](x,xs); 

allActors :: ([Actor(Int,Str)],[Actor(Int,Str)]);
allActors(in,in) <- end, !;
allActors(in,out) <- forall[actor(a,b,c)](Actor(a,'assistant'),actors), append[Actor(Int,Str)](actors,in,in'), next[allActors(in',out)];

main :: ([Actor(Int,Str)]);
main(result) <- test2(T('x')), allActors([],result);

do append[Int](l,[4,5,6],[1,2,3,4,5,6]), allActors([],ns), println(ns)
return l















