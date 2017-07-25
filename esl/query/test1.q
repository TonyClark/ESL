// Used for type checking

type Num = Int;
type INum = Num;
type P[T] = Pair(T,T);

test1 :: ([INum]);
test1([1,2,3,4,5]) <- test2(1,'s',T(100,[K]));

test2 :: (Num,Str,T(INum,[K()]));
test2(1,'x',T(1,[K,K,K]));

test3[T] :: ([T]);
test3[T]([x]) <- test3[T]([x,x]), test5(Tail(99),100);

test4 :: (Num);
test4(x) <- test3[Num]([x]), test3[Str](['1']);

type Coin = union { Head(Str), Tail(Int) };

test5 :: (Coin,Int);
test5(Head(x),1) <- x := 'xxx';
test5(Tail(y),a) <- y := a, a := 999;
test5(Tail(z),0);

type IntSeq = rec T. union { Tree(T,T), Pair(Int,T), Nil() };

test6 :: (IntSeq);
test6(Pair(0,Pair(1,Pair(2,Tree(Nil,Pair(3,Tree(Nil,Nil)))))));

test7 :: (P[P[Int]]);
test7(Pair(Pair(1,2),Pair(2,3)));

test8::();
test8;

do test(x)
return x

















































