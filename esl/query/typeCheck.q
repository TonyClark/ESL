// A type checker for rules. When the rules are supplied, it is assumed
// that there is a definition of the correct arity and genericity for
// all rules that are defined or called.

type TypeWithPos = rec A. union{ 

  // Types are suplied with start and end text position from the 
  // source files. These are removed prior to checking...
  
  Int(Int,Int), 
  Str(Int,Int), 
  List(Int,Int,A), 
  Term(Int,Int,Str,[A]), 
  Var(Int,Int,Str), 
  Union(Int,Int,[A]), 
  Rec(Int,Int,Str,A) 
};
  
type Type = rec B. union{ 

  // A type without the source position...
  
  Int(), 
  Str(), 
  List(B), 
  Term(Str,[B]), 
  Var(Str), 
  Union([B]), 
  Rec(Str,B), 
  Forall([Str],[B]) 
};
  
// An association between a nanme and a type...
type Maplet = Map(Str,Type);

type Value = rec C. union { 

  // A value occurs in a rule argument position...
  
  Wild(Int,Int), 
  Name(Int,Int,Str),
  Nil(Int,Int), 
  Pair(Int,Int,C,C), 
  Str(Int,Int,Str), 
  Int(Int,Int,Int), 
  Term(Int,Int,Str,[C]) 
};

type Element = rec D. union { 

  // The body of a rule may be one of these. They should retain
  // the source position for error reporting...
  
  Cut(Int,Int), 
  Call(Int,Int,Str,[Type],[Value]), 
  Relation(Int,Int,Value,Str,Value), 
  Is(Int,Int,Str,Value), 
  If(Int,Int,[D],[D],[D]), 
  Try(Int,Int,[D],[D]),
  Catch(Int,Int,Value,[D]),
  Throw(Int,Int,Value), 
  Forall(Int,Int,[D],Value,Value),
  Eventually(Int,Int,[D]),
  Next(Int,Int,[D]),
  Prev(Int,Int,[D]),
  Past(Int,Int,[D]),
  True(Int,Int), 
  StartOfTime(Int,Int), 
  EndOfTime(Int,Int), 
  False(Int,Int),
  Par(Int,Int,[D],[D])
};

type ElementWithPos = rec E. union { 

  // A body element where the types in generic calls have source positions.
  // The types are removed to produce an Element (as above)...
  
  Cut(Int,Int), 
  Call(Int,Int,Str,[TypeWithPos],[Value]), 
  Relation(Int,Int,Value,Str,Value), 
  Is(Int,Int,Str,Value), 
  If(Int,Int,[E],[E],[E]), 
  Catch(Int,Int,Value,[E]),
  Try(Int,Int,[E],[E]),
  Throw(Int,Int,Value), 
  Forall(Int,Int,[E],Value,Value),
  Eventually(Int,Int,[E]),
  Next(Int,Int,[E]), 
  Prev(Int,Int,[E]), 
  Past(Int,Int,[E]), 
  StartOfTime(Int,Int), 
  EndOfTime(Int,Int), 
  True(Int,Int), 
  False(Int,Int),
  Par(Int,Int,[E],[E])
};

// These are removed prior to type checking ...
type TypeDef = TypeDef();

stripPos :: (TypeWithPos,Type);
// Remove positions from types...
stripPos(Int(_,_),Int) <- !;
stripPos(Str(_,_),Str) <- !;
stripPos(List(_,_,t1),List(t2)) <- !, 
  stripPos(t1,t2);
stripPos(Term(_,_,name,types1),Term(name,types2)) <- !, 
  stripPoss(types1,types2);
stripPos(Var(_,_,name),Var(name)) <- !;
stripPos(Union(_,_,types),Union(types')) <- !, 
  stripPoss(types,types');
stripPos(Rec(s,e,n,t),Rec(n,t')) <- !, 
  stripPos(t,t');

stripPoss :: ([TypeWithPos],[Type]);
// Remove positions from lists of types...
stripPoss([],[]) <- !;
stripPoss([t1|ts1],[t2|ts2]) <- 
  stripPos(t1,t2), 
  stripPoss(ts1,ts2);
 
evals :: ([Maplet],[Type],[Type]);
// Lookup the names in types from the supplied env...
evals(_,[],[]) <- !;
evals(env,[t1 | ts1],[t2 | ts2]) <-
  eval(env,t1,t2),
  evals(env,ts1,ts2);
  
eval :: ([Maplet],Type,Type);
eval(env,Var(n),t) <- lookup(n,env,t), !;
eval(env,Int,Int) <- !;
eval(env,Str,Str) <- !;
eval(env,Term(name,types1),Term(name,types2)) <- !,
  evals(env,types1,types2);
eval(env,List(t1),List(t2)) <- !,
  eval(env,t1,t2);
eval(env,Forall(generics,types1),Forall(generics,types2)) <- !,
  evals(env,types1,types2);

allGenericVars :: ([Type]);
// Used to ensure that a list of generic variables (in a rule definition)
// does not become bound during type checking...
allGenericVars([]) <- !;
allGenericVars([t | ts]) <-
  isVar(t),
  allGenericVars(ts);

substs :: ([Type],[Str],[Type],[Type]);
// Replace a list of names with a corresponding list of types...
substs(types,names,[],[]) <- !;
substs(ts1,ns,[t2 | ts2],[t3 | ts3]) <- 
  subst1(ts1,ns,t2,t3), 
  substs(ts1,ns,ts2,ts3);

subst1 :: ([Type],[Str],Type,Type);
// Replace a lust of names with types in a type...
subst1([],[],t,t) <- !;
subst1([t | ts],[n | ns],t1,t3) <- 
  subst(t,n,t1,t2), 
  subst1(ts,ns,t2,t3);

subst :: (Type,Str,Type,Type);
// Replace a name in a type...
subst(t,n,t',t') <- isVar(t'), !;
subst(t,n,Var(n),t) <- !;
subst(t,n,Var(m),Var(m)) <- !;
subst(_,_,Int,Int) <- !;
subst(_,_,Str,Str) <- !;
subst(t1,n,List(t2),List(t3)) <- !, 
  subst(t1,n,t2,t3);
subst(t,n,Term(m,ts1),Term(m,ts2)) <- !, 
  substs([t],[n],ts1,ts2);
subst(t,n,Union(types),Union(types')) <- !, 
  substs([t],[n],types,types');
subst(t,n,Rec(n,t'),Rec(n,t)) <- !;
subst(t,n,Rec(n',t'),Rec(n',t'')) <- 
  subst(t,n,t',t'');

stripElements :: ([ElementWithPos],[Element]);
// Remove the position information in body elements...
stripElements([],[]) <- !;
stripElements([e1|es1],[e2|es2]) <- 
  stripElement(e1,e2),
  stripElements(es1,es2);
  
stripElement :: (ElementWithPos,Element);
// Remove the position information in a body element...
stripElement(Cut(s,e),Cut(s,e)) <- !;
stripElement(Call(s,e,n,gs1,vs),Call(s,e,n,gs2,vs)) <- !,
  stripPoss(gs1,gs2);
stripElement(Relation(s,e,l,o,r),Relation(s,e,l,o,r)) <- !;
stripElement(Is(s,e,n,v),Is(s,e,n,v));
stripElement(If(s,e,test,conseq,alt),If(s,e,test',conseq',alt')) <-
  stripElements(test,test'),
  stripElements(conseq,conseq'),
  stripElements(alt,alt');
stripElement(Throw(s,e,v),Throw(s,e,v));
stripElement(True(s,e),True(s,e));
stripElement(False(s,e),False(s,e));
stripElement(Try(s,e,body,handlers),Try(s,e,body',handlers')) <- !,
  stripElements(body,body'),
  stripElements(handlers,handlers');
stripElement(Catch(s,e,v,body),Catch(s,e,v,body')) <-
  stripElements(body,body');
stripElement(Forall(s,e,body,value,results),Forall(s,e,body',value,results)) <-
  stripElements(body,body');
stripElement(Eventually(s,e,body),Eventually(s,e,body')) <-
  stripElements(body,body');
stripElement(Next(s,e,body),Next(s,e,body')) <-
  stripElements(body,body');
stripElement(Prev(s,e,body),Prev(s,e,body')) <-
  stripElements(body,body');
stripElement(Past(s,e,body),Past(s,e,body')) <-
  stripElements(body,body');
stripElement(Par(s,e,g1,g2),Par(s,e,g1',g2')) <- !,
  stripElements(g1,g1'),
  stripElements(g2,g2');
stripElement(StartOfTime(s,e),StartOfTime(s,e)) <- !;
stripElement(EndOfTime(s,e),EndOfTime(s,e)) <- !;
stripElement(e,_) <- throw TypeError(0,0,Unstrippable(e));

substElements :: ([Type],[Str],[Element],[Element]);
// Replace a lit of names with corresponding types in elements. This
// means the generic type arguments are replaced...
substElements([],[],elements,elements) <- !;
substElements([t | ts],[n | ns],in,out) <-
  substElements1(t,n,in,out1),
  substElements(ts,ns,out1,out);
  
substElements1 :: (Type,Str,[Element],[Element]);
// Replace a name with a type in a list of elements...
substElements1(t,n,[],[]) <- !;
substElements1(t,n,[e1 | es1],[e2 | es2]) <-
  substElement(t,n,e1,e2),
  substElements1(t,n,es1,es2);
  
substElement :: (Type,Str,Element,Element);
// Replace a name with a type in a body element...
substElement(t,n,Cut(s,e),Cut(s,e)) <- !;
substElement(t,n,Call(s,e,n1,ts1,vs),Call(s,e,n1,ts2,vs)) <- !, 
  substs([t],[n],ts1,ts2);
substElement(t,n,Relation(s,e,l,o,r),Relation(s,e,l,o,r)) <- !;
substElement(t,n,Is(s,e,n1,v),Is(s,e,n1,v));
substElement(t,n,If(s,e,test,conseq,alt),If(s,e,test',conseq',alt')) <- !, 
  substElements1(t,n,test,test'),
  substElements1(t,n,conseq,conseq'),
  substElements1(t,n,alt,alt');
substElement(t,n,Throw(s,e,v),Throw(s,e,v));
substElement(t,n,True(s,e),True(s,e));
substElement(t,n,False(s,e),False(s,e));
substElement(t,n,Try(s,e,body,handlers),Try(s,e,body',handlers')) <-
  substElements1(t,n,body,body'),
  substElements1(t,n,handlers,handlers');
substElement(t,n,Catch(s,e,v,body),Catch(s,e,v,body')) <-
  substElements1(t,n,body,body');
substElement(t,n,Forall(s,e,body,value,results),Forall(s,e,body',value,results)) <-
  substElements1(t,n,body,body');
substElement(t,n,Eventually(s,e,body),Eventually(s,e,body')) <-
  substElements1(t,n,body,body');
substElement(t,n,Next(s,e,body),Next(s,e,body')) <-
  substElements1(t,n,body,body');
substElement(t,n,Prev(s,e,body),Prev(s,e,body')) <-
  substElements1(t,n,body,body');
substElement(t,n,Past(s,e,body),Past(s,e,body')) <-
  substElements1(t,n,body,body');
substElement(t,n,Par(s,e,g1,g2),Par(s,e,g1',g2')) <-
  substElements1(t,n,g1,g1'),
  substElements1(t,n,g2,g2');
substElement(t,n,StartOfTime(s,e),StartOfTime(s,e)) <- !;
substElement(t,n,EndOfTime(s,e),EndOfTime(s,e)) <- !;
substElement(t,n,e,_) <- throw TypeError(0,0,UnSubstable(e));

genEnv :: ([Str],[Maplet]);
// Generic a binding environment from a list of generic variable names...
genEnv([],[]) <- !;
genEnv([n | ns],[Map(n,t) | ms]) <- genEnv(ns,ms);

lookup :: (Str,[Maplet],Type);
// Get the value of a name in an environment...
lookup(name,[Map(name,t) | _],t)  <- !;
lookup(name,[_|maps],t)  <-
  lookup(name,maps,t);

length[T] :: ([T],Int);
length[T]([],0) <- !;
length[T]([h|t],n) <-
  length[T](t,m), n := m + 1;

append[T] :: ([T],[T],[T]);
append[T]([],l,l) <- !;
append[T]([x|l1],l2,[x|l3]) <- 
  append[T](l1,l2,l3);

allocateVars :: ([Str],[Type]);
allocateVars([],[]) <- !;
allocateVars([n|ns],[t|ts]) <-
  allocateVars(ns,ts);
  
ruleType :: (Str,Int,[TypeDec(Int,Int,Str,[Str],[TypeWithPos])],Forall([Str],[TypeWithPos]));
// Get the type of a rule based on its name, its arity and a list of type declarations.
// Note that a type is always universal: Forall(generics,types) even if the generics is
// the empty list of strings...
ruleType(name,arity,[TypeDec(s,e,name,generics,ts1) | _],Forall(generics,ts1))  <- 
  length[TypeWithPos](ts1,arity), !;
ruleType(name,arity,[_ | decs],ts)  <- 
  ruleType(name,arity,decs,ts);

typeCheck :: (RuleBase(Int,Int,[Rule],[TypeDec(Int,Int,Str,[Str],[TypeWithPos])],[TypeDef]),TypeError(Int,Int,Str));
// Take a complete rule base and check it...
typeCheck(RuleBase(s,e,[],typeDecs,typeDefs),_) <- !;                                              
typeCheck(RuleBase(s,e,[rule | rules],typeDecs,typeDefs),typeError) <- 
  try {
    typeCheck1(rule,typeDecs), !,
    typeCheck(RuleBase(s,e,rules,typeDecs,typeDefs),typeError)
  } catch x { typeError := x };
  
type Rule = Rule(Int,Int,Str,[Str],[Value],[ElementWithPos]);

typeCheck1 :: (Rule,[TypeDec(Int,Int,Str,[Str],[TypeWithPos])]);
// Type check one rule...
typeCheck1(Rule(s,e,name,ruleGenerics,args,body'),typeDecs) <- 
  // println(Rule(s,e,name,ruleGenerics,args,body')),
  // print('Unstripped Body'), println(body'),
  stripElements(body',body),
  // println('Stripped Body'), println(body),
  // get the rule type ruleType...
  length[Value](args,arity), 
  ruleType(name,arity,typeDecs,Forall(decGenerics,types')),
  // println('Rule Type = '), println(Forall(decGenerics,types')),
  stripPoss(types',types),
  // println('Stripped = '), println(types),
  // assume #ruleGenerics = #decGenerics...
  // allocate fresh variables for the generics...
  allocateVars(ruleGenerics,genericVars),
  // println('Generics 1 = '), println(genericVars),
  //print('DecGenerics = '), println(decGenerics),
  // substitute the variables into the dec and the rule...
  substs(genericVars,decGenerics,types,typesOut),
  // println('Generics 2 = '), println(genericVars),
  // println('types = '), println(types),
  // println('types out = '), println(typesOut),
  // println('TypeEnv = '), println(typesOut),
  substElements(genericVars,ruleGenerics,body,bodyOut),
  // println('genericVars 3 = '), println(genericVars),
  //print('ruleGenerics = '), println(genericVars),
  //print('Body = '), println(bodyOut),
  //print('Args = '), println(args),
  // check the head...
  typeCheckHead([],vars,args,typesOut),
  // println('args vars= '), println(vars),
  // check the body...
  typeCheckBody(typeDecs,vars,bodyOut),
  // println('Body vars = '), println(vars),
  // final check for the generics...
  // println('Generic vars = '), println(genericVars),
  if allGenericVars(genericVars)
  then true
  else throw TypeError(s,e,name + ' is not generic.'), !;
  
typeCheck1(Rule(s,e,name,ruleGenerics,args,body'),typeDecs) <- 
  throw TypeError(s,e,'Something went wrong.');
  
typeCheckHead :: ([Maplet],[Maplet],[Value],[Type]);
// Type checks the list of values against the list of types.
// The first environment is the current list of names associated
// with variables. The second environment contains the extension
// of variables in the values...
typeCheckHead(maps,maps,[],[]) <- !;
typeCheckHead(mapsIn,mapsOut,[p | ps],[t | ts]) <- 
  typeCheckArg(mapsIn,mapsOut1,p,t), 
  typeCheckHead(mapsOut1,mapsOut,ps,ts);
  
typeCheckArg :: ([Maplet],[Maplet],Value,Type);
// Dispatch on a value and associate it with a type...
typeCheckArg(maps,maps,               Wild(_,_),            _)                <- !;
typeCheckArg(maps,maps,               Name(s,e,n),          t)                <- lookup(n,maps,t), !;
typeCheckArg(maps,maps,               Name(s,e,n),          expected)         <- lookup(n,maps,defined), throw TypeError(s,e,[Expecting(expected),Defined(defined)]); 
typeCheckArg(mapsIn,[Map(n,t)|mapsIn],Name(s,e,n),          t);
typeCheckArg(mapsIn,mapsIn,           Nil(s,e),             List(t))          <- !;
typeCheckArg(mapsIn,mapsIn,           Nil(s,e),             t)                <- throw TypeError(s,e,'list type expected');
typeCheckArg(mapsIn,mapsOut,          Pair(s,e,p1,p2),      List(t))          <- typeCheckArg(mapsIn,mapsOut1,p1,t),  typeCheckArg(mapsOut1,mapsOut,p2,List(t)), !;
typeCheckArg(mapsIn,mapsOut,          Pair(s,e,p1,p2),      List(t))          <- typeCheckArg(mapsIn,mapsOut1,p1,defined), throw TypeError(s,e,Expected(t));
typeCheckArg(mapsIn,mapsOut,          Pair(s,e,p1,p2),      List(t))          <- typeCheckArg(mapsIn,mapsOut1,p2,defined), throw TypeError(s,e,Expected(List(t)));
typeCheckArg(mapsIn,mapsIn,           Str(s,e,v),           Str)              <- !;
typeCheckArg(mapsIn,mapsIn,           Str(s,e,v),           expected)         <- throw TypeError(s,e,[Expecting(expected),Defined(Str)]);
typeCheckArg(mapsIn,mapsIn,           Int(s,e,i),           Int)              <- !;
typeCheckArg(mapsIn,mapsIn,           Int(s,e,i),           expected)         <- throw TypeError(s,e,[Expecting(expected),Defined(Int)]);
typeCheckArg(mapsIn,mapsOut,          Term(s,e,name,values),Term(name,types)) <- typeCheckHead(mapsIn,mapsOut,values,types), !;
typeCheckArg(mapsIn,mapsOut,          value,                Rec(n,t))         <- subst(Rec(n,t),n,t,t'), typeCheckArg(mapsIn,mapsOut,value,t'), !;
typeCheckArg(mapsIn,mapsOut,          value,                Union(types))     <- chooseType(mapsIn,mapsOut,value,types), !;
typeCheckArg(mapsIn,mapsOut,          Term(s,e,name,values),expected)         <- throw TypeError(s,e,[Expecting(expected),Found(Term(name,values))]);

chooseType :: ([Maplet],[Maplet],Value,[Type]);
// Used to process union types. The value should be a term whose type is
// a member of the supplied list...
chooseType(_,_,Term(s,e,n,values),[]) <- 
  throw TypeError(s,e,'term not member of union');
chooseType(mapsIn,mapsOut,Term(s,e,n,values),[Term(n,types) | _]) <- 
  typeCheckHead(mapsIn,mapsOut,values,types), !;
chooseType(mapsIn,mapsOut,value,[_ | ts]) <- 
  chooseType(mapsIn,mapsOut,value,ts);

typeCheckBody :: ([TypeDec(Int,Int,Str,[Str],[TypeWithPos])],[Maplet],[Element]);
// Satisfied when the body elements are well typed in the context of the supplied environment...
typeCheckBody(typeDecs,maps,[]) <- !;
typeCheckBody(typeDecs,maps,[element | elements]) <-
  typeCheckElement(typeDecs,maps,mapsOut,element),
  typeCheckBody(typeDecs,mapsOut,elements);
  
typeCheckElements ::([TypeDec(Int,Int,Str,[Str],[TypeWithPos])],[Maplet],[Maplet],[Element]);
typeCheckElements(typeDecs,mapsIn,mapsIn,[]) <- !;
typeCheckElements(typeDecs,mapsIn,mapsOut,[e|es]) <- 
  typeCheckElement(typeDecs,mapsIn,mapsIn',e), 
  typeCheckElements(typeDecs,mapsIn',mapsOut,es);
  
typeCheckElement :: ([TypeDec(Int,Int,Str,[Str],[TypeWithPos])],[Maplet],[Maplet],Element);

// Satisfied when the body element is well typed in the context of the first environment
// and where the second environment contains any new variables encountered in the element...

typeCheckElement(typeDecs,mapsIn,mapsIn, Cut(s,e))                       <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'true',[],[]))         <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'isVar',[],[_]))       <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'print',[],[_]))       <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'println',[],[_]))     <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'systemTime',[],[_]))  <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'loadDB',[],[_]))      <- !;
typeCheckElement(typeDecs,maps,  maps,   Call(s,e,'state',[],[_,_,_,_])) <- !;
typeCheckElement(typeDecs,maps,  maps,   Relation(s,e,_,'<>',_))         <- !;
typeCheckElement(typeDecs,maps,  maps,   StartOfTime(s,e))               <- !;
typeCheckElement(typeDecs,maps,  maps,   EndOfTime(s,e))                 <- !;


typeCheckElement(typeDecs,maps,  maps,   Relation(s,e,l,'>',r)) <- !,
  typeCheckExp(maps,maps,l,Int),
  typeCheckExp(maps,maps,r,Int);
  
typeCheckElement(typeDecs,maps,  maps,   Relation(s,e,l,'<',r)) <- !,
  typeCheckExp(maps,maps,l,Int),
  typeCheckExp(maps,maps,r,Int);
  
typeCheckElement(typeDecs,maps,  maps,   Relation(s,e,l,'=',r)) <- !,
  typeCheckExp(maps,maps,l,t),
  typeCheckExp(maps,maps,r,t);

typeCheckElement(typeDecs,mapsIn,mapsOut,Call(s,e,name,gs,values)) <-  
  length[Value](values,arity), 
  ruleType(name,arity,typeDecs,Forall(args,types')), 
  stripPoss(types',types), 
  length[Type](gs,l), 
  length[Str](args,l), 
  substs(gs,args,types,expectedTypes), 
  typeCheckHead(mapsIn,mapsOut,values,expectedTypes), !;
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Call(s,e,'<',[],values)) <- 
  length[Value](values,2), 
  typeCheckHead(mapsIn,mapsOut,values,[Int,Int]), !;

typeCheckElement(typeDecs,_,_,Call(s,e,name,gs,values))  <-
  length[Value](values,arity), 
  ruleType(name,arity,typeDecs,Forall(args,types)),
  length[Type](gs,l1), 
  length[Str](args,l2), 
  l1 <> l2, 
  throw TypeError(s,e,'incorrect generic arity');
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Call(s,e,name,gs,values)) <- !,
  length[Value](values,arity), 
  ruleType(name,arity,typeDecs,Forall(args,types')), 
  stripPoss(types',types),
  length[Type](gs1,l), 
  length[Str](args,l), 
  substs(gs1,args,types,expectedTypes), 
  typeCheckHead(mapsIn,mapsOut,values,actualTypes), 
  throw TypeError(s,e,'arguments dont match');
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Is(s,e,name,exp)) <- 
  lookup(name,mapsIn,t), 
  if typeCheckExp(mapsIn,mapsOut,exp,t)
  then !
  else throw TypeError(s,e,Is(name,exp));
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Is(s,e,name,exp)) <- !,
  typeCheckExp([Map(name,t) | mapsIn],mapsOut,exp,t);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,If(s,e,test,conseq,alt)) <- !,
  typeCheckBody(typeDecs,mapsIn,test),
  typeCheckBody(typeDecs,mapsIn,conseq),
  typeCheckBody(typeDecs,mapsIn,alt);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Try(s,e,body,handlers)) <- !,
  typeCheckBody(typeDecs,mapsIn,body),
  typeCheckBody(typeDecs,mapsIn,handlers);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Catch(s,e,v,body)) <- !,
  typeCheckBody(typeDecs,mapsIn,body);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Eventually(s,e,body)) <- !,
  typeCheckBody(typeDecs,mapsIn,body);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Next(s,e,body)) <- !,
  typeCheckBody(typeDecs,mapsIn,body);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Prev(s,e,body)) <- !,
  typeCheckBody(typeDecs,mapsIn,body);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Past(s,e,body)) <- !,
  typeCheckBody(typeDecs,mapsIn,body);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Forall(s,e,body,value,results)) <- !,
  typeCheckElements(typeDecs,mapsIn,mapsIn',body),
  typeCheckArg(mapsIn',mapsIn'',value,t),
  typeCheckArg(mapsIn'',mapsOut,results,List(t));
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Par(s,e,g1,g2)) <- !,
  typeCheckElements(typeDecs,mapsIn,mapsIn',g1),
  typeCheckElements(typeDecs,mapsIn',mapsOut,g2);
  
typeCheckElement(typeDecs,mapsIn,mapsOut,Throw(s,e,v)) <- !;
typeCheckElement(typeDecs,mapsIn,mapsOut,True(s,e))    <- !;
typeCheckElement(typeDecs,mapsIn,mapsOut,False(s,e))   <- !;

typeCheckElement(_,_,_,element) <-
  throw TypeError(0,0,FailedToMatch(element));
  
typeCheckExp :: ([Maplet],[Maplet],Value,Type);
// Satisfied when the value represnts an expression with the supplied type...
typeCheckExp(maps,  maps,            Int(s,e,i),                Int)      <- !;
typeCheckExp(maps,  maps,            Int(s,e,i),                expected) <- throw TypeError(s,e,'expecting an integer');
typeCheckExp(maps,  maps,            Str(s,e,v),                Str)      <- !;
typeCheckExp(maps,  maps,            Str(s,e,v),                expected) <- throw TypeError(s,e,'expecting a string');
typeCheckExp(maps,  maps,            Name(s,e,n),               t)        <- lookup(n,maps,t),!;
typeCheckExp(maps,  [Map(n,t)|maps], Name(s,e,n),               t);
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'+',[left,right]),Int)      <- typeCheckExp(mapsIn,mapsOut1,left,Int),     typeCheckExp(mapsOut1,mapsOut,right,Int), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'+',[left,right]),List(t))  <- typeCheckExp(mapsIn,mapsOut1,left,List(t)), typeCheckExp(mapsOut1,mapsOut,right,List(t)), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'-',[left,right]),Int)      <- typeCheckExp(mapsIn,mapsOut1,left,Int),     typeCheckExp(mapsOut1,mapsOut,right,Int), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'*',[left,right]),Int)      <- typeCheckExp(mapsIn,mapsOut1,left,Int),     typeCheckExp(mapsOut1,mapsOut,right,Int), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'/',[left,right]),Int)      <- typeCheckExp(mapsIn,mapsOut1,left,Int),     typeCheckExp(mapsOut1,mapsOut,right,Int), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'+',[left,right]),Str)      <- typeCheckExp(mapsIn,mapsOut1,left,Str), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'+',[left,right]),Str)      <- typeCheckExp(mapsIn,mapsOut1,right,Str), !;
typeCheckExp(mapsIn,mapsOut,         Term(s,e,'+',[left,right]),Int)      <-
  typeCheckExp(mapsIn,mapsOut1,left,Int), 
  typeCheckExp(mapsOut1,mapsOut,right,defined), 
  throw TypeError(s,e,'expecting an integer');
typeCheckExp(mapsIn,mapsOut,Term(s,e,'+',[left,right]),Int)               <-
  typeCheckExp(mapsIn,mapsOut1,left,defined), 
  typeCheckExp(mapsOut1,mapsOut,right,Int), 
  throw TypeError(s,e,'expecting an integer');

do true
return OK
























