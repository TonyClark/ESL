export esl

import 'esl/ast.xpl'

esl = { 

  file(name)      -> es=exports is=imports bs=bindings whitespace EOF { Module(name,es,is,bs) };
  exports         -> whitespace [[ 'export' ! ns=exportedNames semi { Export(ns) } | { Export([]) } ]];
  imports         -> whitespace [[ 'import' ! i=imp is=(comma imp)* semi { Imports(i:is)} |  { Imports([]) } ]];
  imp             -> [[ n=name { Import(n) } | s=string { Import(s) } ]];
  esl             -> bs=bindings ! i=actinit as=barms EOF { New(Letrec(bs,Act('main',i,as))) };
  topLevelCommand -> whitespace d=eslCommand {d};
  eslCommand      -> x=tplvlSet ! {x} | x=tplvlExp ! {x} | x=tplvlQuit ! {x} | x=tplvlImport ! {x};
  tplvlSet        -> n=name ':=' e=exp ';' { TplvlSet(n,e) };
  tplvlQuit       -> 'quit' {'commands.Quit'()};
  tplvlImport     -> 'import' ns=strings ';' {Import(ns)};
  tplvlExp        -> e=exp semi { e };
  
  bindings        -> b=binding ! bs=(semi binding)* { b:bs } | {[]};
  binding         -> whitespace b=(actbind | typebind | databind | cnstrbind | valbind | funbind) ! {b};
  cnstrbind       -> [[ 'cnstr' n1=Name gs=optGenericDecs eql t=type dot n2=Name { CnstrBind(n1,Dec.funType(gs,UnionRef(t,n2)),Dec.funType(gs,UnionRef(t,n2))) } ]];
  valbind         -> [[ n=name d=valbindDec eql e=exp { Binding(n,d,e) } ]];
  valbindDec      -> [[ ns=optGenericDecs t=typeDec { Dec.generic(ns,t) } ]];
  funbind         -> [[ n=name [[ ns=optGenericDecs lparen [[ ps=funargs ]] rparen t=typeDec d={Dec.generic(ns,FunType(FunType.ptypes(ps),t))} ]] eql e=exp g=guard { FunBind(n,ps,d,e,g) } ]];
  actbind         -> [[ 'act' n=name gs=optGenericDecs [[ ps=actargs  t=typeDec d={Dec.generic(gs,FunType(FunType.types(ps),t))} ]] lcurl es=exports bs = bindings i=actinit as=barms rcurl  { Binding(n,d,Fun(Str(n),ps,d,Act(Str(n),es,bs,i,as))) } ]];
  typebind        -> [[ 'type' n=Name d=typebindDec { TypeBind(n,d,d) } ]];
  typebindDec     -> [[ as=typeargs eql t=type { Dec.funType(as,t) } ]];
  databind        -> [[ 'data' n=Name gs=optGenericDecs eql ds=dataOpts { DataBind(n,Dec.funType(gs,TypeUnion(ds)),Dec.funType(gs,TypeUnion(ds))) } ]];
  dataOpts        -> d=dataOpt ds=(bar dataOpt)* {d:ds};
  dataOpt         -> n=Name (lparen ts=types rparen { TermType(n,ts) } | { TermType(n,[]) });
  typeargs        -> lsquare ns=Names rsquare { ns } | {[]};
  actargs         -> lparen ps=params rparen {ps} | {[]};
  actinit         -> arrow e=exp semi {e} | { Null() };
  barms           -> a=barm ! as=(semi barm)* { a:as };
  barm            -> p=patterns g=(guard | { Bool(true) }) arrow ! e=exp { BArm(p,g,e) };
  patterns        -> p=pattern ps=(comma pattern)* { p:ps };
  pattern         -> whitespace s=[[simplePattern]] ! (
                       colon p=pattern { PCons(s,p) } 
                       | 'or' p=pattern { POr(s,p) } 
                       | '+' p=pattern { PAdd(s,p) } 
                       | lsquare ts=types rsquare { PApplyType(s,ts) }
                       | {s});
  simplePattern   -> pVar | pInt | pTerm | pList | pStr | pBool | pWild | pNull | pBag | pSet | lparen p=pattern rparen {p};
  pVar            -> n=name t=optTypeDec (eql p=pattern { PBind(n,t,p) } | { PVar(n,t) });
  pInt            -> n=int { PInt(n) };
  pStr            -> s=string { PStr(s) };
  pBool           ->  ('true' ! { PBool(true) } | 'false' { PBool(false) });
  pWild           -> underscore { PWild() };
  pNull           ->  'null' { PNull() };
  pTerm           -> n=Name ts=optTypes (lparen ps=patterns rparen { PTerm(n,ts,ps) } | { PTerm(n,ts,[]) });
  pList           -> lsquare (rsquare { PNil() } | pListTail);
  pListTail       -> p=pattern (rsquare { PCons(p,PNil()) } | comma ps=pListTail { PCons(p,ps) });
  pBag            -> 'bag' lcurl (rcurl { PEmptyBag() } | p=pattern pBagTail^(p));
  pBagTail(p)     -> rcurl { PBagCons(p,PEmptyBag()) };
  pBagTail(p)     -> comma ps=pBagTail { PBagCons(p,ps) };
  pBagTail(p)     -> bar b=pattern rcurl { PBagCons(p,b) };
  pSet            -> 'set' lcurl (rcurl { PEmptySet() } | p=pattern pSetTail^(p));
  pSetTail(p)     -> rcurl { PSetCons(p,PEmptySet()) };
  pSetTail(p)     -> comma ps=pSetTail { PSetCons(p,ps) };
  pSetTail(p)     -> bar b=pattern rcurl { PSetCons(p,b) };
  params          -> n=dec ns=(comma dec)* { n:ns } | {[]};
  dec             -> [[ n=name coloncolon t=type { Dec(n,t) } ]];
  decs            -> d=dec ds=(semi dec)* { d:ds } | {[]};
  declarations    -> ds=decs semi {ds} | {[]};
  guard           -> 'when' exp | { Bool(true) };
  funargs         -> patterns | {[]};
  exp             -> [[ whitespace e=simpleExp ! postexp^(e) ]];
  postexp(e)      -> o=op ! r=exp { BinExp(e,o,r) }
                  |  [[ lparen es=exps rparen exp={ Apply(e,es) } ]] postexp^(exp)
                  |  [[ lsquare ts=types rsquare exp={ApplyType(e,ts)} ]] postexp^(exp)
                  |  leftArrow v=exp postsend^(e,[v]) 
                  |  [[ dot n=name ref={ Ref(e,Key.getKey(n)) } ]] postexp^(ref)
                  |  {e};
  postsend(a,m)   -> [[ at t=exp { Send(a,m,t) } | { Send(a,m,Int(0)) } ]];
  exps            -> e=exp es=(comma exp)* { e:es } | {[]};
  op              -> whitespace ('+' | '-' | '*' | '/' | 'andalso' | 'and' | 'orelse' | 'or' |':' | '<>' | '=' | '<' | '>' | '..' | '%');
  optActName      -> exp | { Str(Act.newName()) };
  funName         -> exp | { Str(Fun.newName()) };
  simpleExp       -> var | numExp | strExp | bool | me | probably | now | nul
                  |  n=name becomes e=exp { Update(n,e) }
                  |  [[ 'act'     n=optActName lcurl es=exports bs = bindings i=actinit as=barms rcurl  { Act(n,es,bs,i,as) } ]]
                  |  [[ 'new'     s=string ! lsquare t=type rsquare (lparen ps=exps rparen { NewJava(s,t,ps) } | { NewJava(s,t,[]) }) ]]
                  |  [[ 'new'     n=simpleExp (lparen ps=exps rparen { New(Apply(n,ps)) } | { New(Apply(n,[])) }) ]]
                  |  [[ 'not'    ! e=exp { Not(e) } ]]
                  |  [[ 'fun'    ! n=funName lparen as=params rparen t=typeDec e=exp { Fun(n,as,FunType(FunType.types(as),t),e) } ]]
                  |  [[ 'grab'   ! lparen vs=dynamicRefs rparen e=exp { Grab(vs,e) } ]]
                  |  [[ 'let'    ! bs=bindings  'in' e=exp { Let(bs,e) } ]]
                  |  [[ 'letrec' ! bs=bindings  'in' e=exp { Letrec(bs,e) } ]]
                  |  [[ 'case'   ! es=caseValues lcurl ds=declarations as=barms rcurl { Case(ds,es,as) } ]]
                  |  [[ 'for'      p=pattern  'in' l=exp whitespace 'do' e=exp whitespace { For(p,l,e) } ]]
                  |  [[ 'for'    ! p=pattern  'in' l=exp arrow e=exp whitespace { Map(p,l,e) } ]]
                  |  [[ 'find'   ! p=pattern  'in' l=exp whitespace 'do' e=exp 'else' d=exp { Find(p,l,e,d) } ]]
                  |  [[ 'if'     ! t=exp  'then' c=exp whitespace 'else' a=exp { If(t,c,a) } ]]
                  |  [[ 'try'    ! e=exp  'catch' lcurl as=barms rcurl { Try(e,as) } ]]
                  |  [[ 'throw'  ! lsquare t=type rsquare e=exp { Throw(t,e) } ]]
                  |  [[ 'bag'      lcurl es=exps rcurl { Bag(es) } ]]
                  |  [[ 'bag'      lcurl es=exps bar e=exp rcurl { BinExp(Bag(es),'+',e) } ]]
                  |  [[ 'set'      lcurl es=exps rcurl { Set(es) } ]]
                  |  [[ 'set'      lcurl es=exps bar e=exp rcurl { BinExp(Set(es),'+',e) } ]]
                  |  [[ 'fold'     lsquare t=type rsquare e=exp { Fold(t,e) } ]]
                  |  [[ 'unfold'   lsquare t=type rsquare e=exp { Unfold(t,e) } ]]
                  |  [[ lsquare (es=exps rsquare { List(es) } | rsquare { List([]) }) ]]
                  |  [[ lsquare e=exp bar qs=quals rsquare { Cmp(e,qs) } ]]
                  |  [[ n=Name ts=optTypes es=(lparen es=exps rparen {es} | {[]}) { Term(n,ts,es) } ]]
                  |  [[ 'become' n=simpleExp (lparen ps=exps rparen { Become(Apply(n,ps)) } | { Become(Apply(n,[])) }) ]]
                  |  [[ lcurl (e=exp es=(semi exp)* rcurl { Block(e:es) } | rcurl { Block([]) }) ]]
                  |  lparen e=exp rparen {e};
  var             -> [[ n=name (becomes e=exp { Update(n,e) } | { Var(n) }) ]];
  dynamicRefs     -> v=dynamicRef vs=(comma dynamicRef)* { v:vs };
  dynamicRef      -> [[ e=simpleExp dot n=name { ActorDynamicRef(e,Key.getKey(n)) } | n=name { VarDynamicRef(Var(n)) } ]];
  me              -> [[ 'self' { Self() } ]];
  now             -> [[ 'now' { Now() } ]];
  nul             -> [[ 'null' { Null() } ]];
  numExp          -> [[ n=int (dot m=int { Float(n,m) } | { Int(n) }) ]];
  strExp          -> [[ s=string { Str(s) } ]];
  bool            -> [[ ('true' { Bool(true) } | 'false' { Bool(false) }) ]];
  caseValues      -> e=exps {e};
  quals           -> q=qual qs=(comma qual)* { q:qs };
  qual            -> p=pattern leftArrow e=exp { BQual(p,e) };
  qual            -> query e=exp { PQual(e) };
  probably        -> [[ 'probably' lparen p=exp rparen coloncolon t=type e1=exp whitespace 'else' e2=exp { Apply(Apply(ApplyType(Var('probably'),[t]),[p,Fun(Str(Fun.newName()),[],FunType([],t),e1),Fun(Str(Fun.newName()),[],FunType([],t),e2)]),[]) } ]];
  
  type        -> t = simpleType postType^(t);
  postType(t) -> { t };
  simpleType  -> [[ 'Int' { IntType() } ]]
              |  [[ 'Bool' { BoolType() } ]]
              |  [[ 'Str' { StrType() } ]]
              |  [[ 'Null' { NullType() } ]]
              |  [[ 'Void' { VoidType() } ]]
              |  [[ lsquare t=type rsquare { ListType(t) } ]]
              |  [[ lparen ts=types rparen arrow t=type { FunType(ts,t) } ]]
              |  [[ 'Bag' lcurl t=type rcurl { BagType(t) } ]]
              |  [[ 'Set' lcurl t=type rcurl { SetType(t) } ]]
              |  [[ 'Act' lcurl ds=exportedDecs ns=messageTypes rcurl { ActType(ds,ns) } ]]
              |  [[ 'rec' n=Name dot t=type { RecType(n,t) } ]]
              |  [[ 'unfold' lsquare t=type rsquare { UnfoldType(t) } ]]
              |  [[ 'union' lcurl ts=cnstrTypes rcurl { TypeUnion(ts) } ]]
              |  [[ n=Name lparen ts = types rparen { TermType(n,ts) } ]]
              |  [[ n=Name lsquare ts = types rsquare { ApplyTypeFun(n,ts) } ]] 
              |  [[ n=Name { TypeVar(n) } ]];
              
  optGenericDecs -> lsquare ns=Names rsquare { ns } | {[]}; 
  optTypes    -> lsquare ts=types rsquare {ts} | {[]};   
  cnstrTypes  -> t=cnstrType ts=(comma cnstrType)* { t:ts };
  cnstrType   -> [[ n=Name (lparen ts = types rparen { TermType(n,ts) } | { TermType(n,[]) }) ]]; 
  optTypeDec  -> coloncolon type | { VoidType() };           
  typeDec     -> coloncolon type;
  types       -> t=type ts=(comma type)* { t:ts } | {[]};
  handlerTypes -> m=handlerType ms=(semi handlerType)* { m:ms };
  handlerType -> [[ m=types arrow t=type { HandlerType(m,t) } ]]
              |  [[ whitespace n=Name arrow t=type { HandlerType([TermType(n,[])],t) } ]];
  messageTypes -> m=messageType ms=(semi messageType)* { m:ms };
  messageType -> [[ t=type ts=(comma type)* { MessageType(t:ts) } ]]
              |  [[ whitespace n=Name { MessageType([TermType(n,[])]) } ]];
  exportedDecs -> 'export' d=dec ds=(semi dec)* semi { d:ds } | {[]};
  
  whitespace  -> SKIPWHITE('//','/*','*/');
  lcurl       -> whitespace '{';
  rcurl       -> whitespace '}';
  lsquare     -> whitespace '[';
  rsquare     -> whitespace ']';
  lparen      -> whitespace '(';
  rparen      -> whitespace ')';
  coloncolon  -> whitespace '::';
  colon       -> whitespace ':';
  semi        -> whitespace ';';
  eql         -> whitespace '=';
  gre         -> whitespace '>';
  less        -> whitespace '<';
  comma       -> whitespace ',';
  arrow       -> whitespace '->';
  leftArrow   -> whitespace '<-';
  dot         -> whitespace '.';
  bar         -> whitespace '|';
  becomes     -> whitespace ':=';
  underscore  -> whitespace '_';
  query       -> whitespace '?';
  at          -> whitespace '@';
  keyWord     -> key ! not([97,122] | [65,90]);
  key         -> 'EOF' | 'grab' | 'cnstr' | 'Bag' | 'Set' | 'act' | 'fold' | 'unfold' | 'export' | 'import' | 'for' | 'find' | 'do' | 'not' | 'fun' | 'letrec' | 'let' | 'in' | 'new' | 'true' | 'false' | 'case' | 'become' | 'self' | 'probably' | 'now' | 'null' | 'if' | 'then' | 'else' | 'when' | 'try' | 'catch' | 'throw' | 'bag' | 'set';
  name        -> whitespace not(keyWord) c=lowerChar chars=(alphaChar | numChar)*  whitespace ! {'values.Str'(c:chars)};
  names       -> n=name ns=(comma name)* { n:ns } | {[]};
  Name        -> whitespace not(keyWord) c=upperChar chars=(alphaChar | numChar)*  whitespace ! {'values.Str'(c:chars)};
  Names       -> n=Name ns=(comma Name)* { n:ns} | {[]};
  exportedName  -> [[ n=name { ExportedName(n) } | n=Name { ExportedName(n) } ]];
  exportedNames -> n=exportedName ns=(comma exportedName)* { n:ns } | {[]};
  int         -> whitespace i=[48,57]+ ! {'values.Int'(i)};
  string      -> '\'' cs=(not(39) stringChar)* 39 ! {'values.Str'(cs)};
  strings     -> s=string ss=(x=string ',' {x})* ! {s:ss};
  alphaChar   -> lowerChar | upperChar;
  lowerChar   -> [97,122];
  upperChar   -> [65,90];
  stringChar  -> 92 c=. ! {c} | .;
  numChar     -> [48,57]
  
}