type Value = rec V. union {
  Term(Str,[V]),
  Var(Str),
  I(Int),
  S(Str)
};

type BodyElement = rec B. union {
  Call(Str,[Value]),
  Is(Str,Value),
  Start(),
  End(),
  Next([B]),
  Prev([B]),
  Always([B]),
  Eventually([B]),
  Past([B])
};

type Prog = [Rule(Str,[Value],[BodyElement])];

type Env = [Bind(Str,Value)];

type Time = Int;

type Id = Int;

type StateVal = rec S. union {
  StateInt(Int),
  StateStr(Str),
  StateTerm(Str,[S])
};

type DB = [Fact(Time,Str,[Value])];

rule :: (Str,Rule(Str,[Value],[BodyElement]),Prog);
rule(n,Rule(n,as,body),[Rule(n,as,body) | prog]);
rule(n,r,[_|prog]) <-
  rule(n,r,prog);
  
prog::(Prog);
prog([Rule('x',[I(100),Var('v')],[Call('y',[S('xxx'),Var('v')])]),Rule('y',[Var('a'),Var('a')],[])]);
  
test1::(Time,DB,Str,[Value]);
test1(eot,db,name,values) <-
  prog(prog),
  call(0,eot,db,name,values,prog);

length[T] :: ([T],Int);
length[T]([],0) <- !;
length[T]([h|t],n) <-
  length[T](t,m), n := m + 1;

member[T] :: (T,[T]);
member[T](x,[x|_]);
member[T](x,[_|l]) <- member[T](x,l);
  
call ::(Time,Time,DB,Str,[Value],Prog);
call(time,eot,db,n,vs,prog) <-
  member[Fact(Time,Str,[Value])](Fact(time,n,vs),db);
call(time,eot,db,n,vs,prog) <-
  rule(n,Rule(n,as,body),prog),
  length[Value](vs,l),
  length[Value](as,l),
  matchs(as,vs,[],vars),
  trys(time,eot,db,body,vars,_,prog);
  
matchs :: ([Value],[Value],Env,Env);
matchs([],[],env,env);
matchs([a|as],[v|vs],in,out) <-
  match(a,v,in,in'),
  matchs(as,vs,in',out);
  
match :: (Value,Value,Env,Env);
match(Term(n,vs),Term(n,vs'),in,out) <-
  matchs(vs,vs',in,out);
match(Var(n),v,env,env) <-
  lookup(n,v,env);
match(Var(n),v,env,[Bind(n,v) | env]);
match(I(i),I(i),env,env);
match(S(s),S(s),env,env);

lookup :: (Str,Value,Env);
lookup(n,v,[Bind(n,v) | _]);
lookup(n,v,[_|env]) <-
  lookup(n,v,env);
  
trys :: (Time,Time,DB,[BodyElement],Env,Env,Prog);
trys(_,_,_,[],env,env,prog);
trys(time,eot,db,[e|es],in,out,prog) <-
  tryElement(time,eot,db,e,in,in',prog),
  trys(time,eot,db,es,in',out,prog);
  
tryElement :: (Time,Time,DB,BodyElement,Env,Env,Prog);
tryElement(time,eot,db,Call(n,vs),in,out,prog) <-
  derefs(vs,vs',in,out),
  call(time,eot,db,n,vs',prog);
tryElement(eot,eot,db,End,env,env,prog);
tryElement(0,_,db,Start,env,env,prog);
tryElement(eot,eot,db,Next(es),env,env,prog) <- !, false;
tryElement(time,eot,db,Next(es),in,out,prog) <- 
  time' := time + 1;
  trys(time',eot,db,es,in,out,prog);
tryElement(0,eot,db,Prev(es),env,env,prog) <- !, false;
tryElement(time,eot,db,Next(es),in,out,prog) <- 
  time' := time - 1;
  trys(time',eot,db,es,in,out,prog);
tryElement(eot,eot,db,Always(es),env,out,prog) <- !;
tryElement(time,eot,db,Always(es),in,out,prog) <-
  trys(time,eot,db,es,in,in',prog),
  time' := time + 1,
  tryElement(time',eot,db,Always(es),in',out,prog);
tryElement(eot,eot,db,Eventually(es),in,out,prog) <- !, false;
tryElement(time,eot,db,Eventually(es),in,out,prog) <-
  trys(time,eot,db,es,in,out,prog);
tryElement(time,eot,db,Eventually(es),in,out,prog) <-
  time' := time + 1,
  tryElement(time',eot,db,Eventually(es),in,out,prog);
tryElement(0,eot,db,Past(es),in,out,prog) <- !, false;
tryElement(time,eot,db,Past(es),in,out,prog) <-
  trys(time,eot,db,es,in,out,prog);
tryElement(time,eot,db,Past(es),in,out,prog) <-
  time' := time - 1,
  tryElement(time',eot,db,Past(es),in,out,prog);
tryElement(time,eot,db,Is(n,exp),env,env,prog) <-
  eval(exp,env,v),
  lookup(n,v,env);
  
eval :: (Value,Env,Value);
eval(Term('+',[left,right]),env,I(i)) <-
  eval(left,env,lv),
  eval(right,env,rv),
  i := lv + rv;
eval(Var(n),env,v) <-
  lookup(n,v,env);
eval(I(i),env,I(i));
eval(S(s),env,S(s));
  
derefs :: ([Value],[Value],Env,Env);
derefs([],[],env,env);
derefs([v|vs],[v'|vs'],in,out) <-
  deref(v,v',in,in'),
  derefs(vs,vs',in',out);
  
deref :: (Value,Value,Env,Env);
deref(Term(n,vs),Term(n,vs'),in,out) <-
  derefs(vs,vs',in,out);
deref(Var(n),v,env,env) <- 
  lookup(n,v,env),!;
deref(Var(n),v,env,[Bind(n,v) | env]);
deref(I(n),I(n),env,env);
deref(S(s),S(s),env,env);

