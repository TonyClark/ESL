export esl

import 'esl/ast.xpl'

esl = { 

  file(name)      -> es=exports is=imports bs=bindings whitespace EOF { Module(name,es,is,bs) };
  exports         -> whitespace 'export' ! ns=names semi {ns} | { [] };
  imports         -> whitespace 'import' ! i=imp is=(comma imp)* semi {i:is} |  { [] };
  imp             -> name | string;
  esl             -> bs=bindings ! i=actinit as=barms EOF { New(Letrec(bs,Act('main',i,as))) };
  topLevelCommand -> whitespace d=eslCommand {d};
  eslCommand      -> x=tplvlSet ! {x} | x=tplvlExp ! {x} | x=tplvlQuit ! {x} | x=tplvlImport ! {x};
  tplvlSet        -> n=name ':=' e=exp ';' { TplvlSet(n,e) };
  tplvlQuit       -> 'quit' {'commands.Quit'()};
  tplvlImport     -> 'import' ns=strings ';' {Import(ns)};
  tplvlExp        -> e=exp semi { e };
  
  bindings        -> b=binding ! bs=(semi binding)* { b:bs } | {[]};
  binding         -> whitespace b=(valbind | funbind | actbind) ! {b};
  valbind         -> n=name eql e=exp { Binding(n,e) };
  funbind         -> n=name lparen ps=funargs rparen eql e=exp g=guard { FunBind(n,ps,e,g) };
  actbind         -> [[ 'act' n=name ps=actargs lcurl es=exports bs = bindings i=actinit as=barms rcurl  { Binding(n,Fun(n,ps,Act(n,es,bs,i,as))) } ]];
  actargs         -> lparen ps=params rparen {ps} | {[]};
  actinit         -> arrow e=exp semi {e} | { Null() };
  barms           -> a=barm ! as=(semi barm)* { a:as };
  barm            -> p=patterns g=(guard | { Bool(true) }) arrow ! e=exp { BArm(p,g,e) };
  patterns        -> p=pattern ps=(comma pattern)* { p:ps };
  pattern         -> whitespace s=[[simplePattern]] ! (colon p=pattern { PCons(s,p) } | 'or' p=pattern { POr(s,p) } | '+' p=pattern { PAdd(s,p) } | {s});
  simplePattern   -> pVar | pInt | pTerm | pList | pStr | pBool | pWild | pNull | pBag | pSet | lparen p=pattern rparen {p};
  pVar            -> n=name (eql p=pattern { PBind(n,p) } | { PVar(n) });
  pInt            -> n=int { PInt(n) };
  pStr            -> s=string { PStr(s) };
  pBool           ->  ('true' ! { PBool(true) } | 'false' { PBool(false) });
  pWild           -> underscore { PWild() };
  pNull           ->  'null' { PNull() };
  pTerm           -> n=Name (lparen ps=patterns rparen { PTerm(n,ps) } | { PTerm(n,[]) });
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
  params          -> n=name ns=(comma name)* { n:ns } | {[]};
  guard           -> 'when' exp | { Bool(true) };
  funargs         -> patterns | {[]};
  exp             -> e=simpleExp ! postexp^(e);
  postexp(e)      -> [[ o=op ! r=exp { BinExp(e,o,r) } ]]
                  |  [[ lparen es=exps rparen exp={ Apply(e,es) } ]] postexp^(exp)
                  |  leftArrow v=exp postsend^(e,[v]) 
                  |  [[ dot n=name ref={ Ref(e,Key.getKey(n)) } ]] postexp^(ref)
                  |  {e};
  postsend(a,m)   -> [[ at t=exp { Send(a,m,t) } | { Send(a,m,Int(0)) } ]];
  exps            -> e=exp es=(comma exp)* { e:es } | {[]};
  op              -> whitespace ('+' | '-' | '*' | '/' | 'andalso' | 'and' | 'orelse' | 'or' |':' | '<>' | '=' | '<' | '>' | '..' | '%');
  simpleExp       -> var | numExp | strExp | bool | me | probably | now | nul
                  |  n=name becomes e=exp { Update(n,e) }
                  |  [[ 'new'     n=name (lparen ps=exps rparen { New(Apply(Var(n),ps)) } | { New(Apply(Var(n),[])) }) ]]
                  |  [[ 'new'     s=string (lparen ps=exps rparen { NewJava(s,ps) } | { NewJava(s,[]) }) ]]
                  |  [[ 'not'    ! e=exp { Not(e) } ]]
                  |  [[ 'fun'    ! lparen as=params rparen e=exp { Fun(Fun.newName(),as,e) } ]]
                  |  [[ 'let'    ! bs=bindings  'in' e=exp { Let(bs,e) } ]]
                  |  [[ 'letrec' ! bs=bindings  'in' e=exp { Letrec(bs,e) } ]]
                  |  [[ 'case'   ! es=caseValues lcurl as=barms rcurl { Case(es,as) } ]]
                  |  [[ 'for'      p=pattern  'in' l=exp whitespace 'do' e=exp whitespace { For(p,l,e) } ]]
                  |  [[ 'for'    ! p=pattern  'in' l=exp arrow e=exp whitespace { Map(p,l,e) } ]]
                  |  [[ 'find'   ! p=pattern  'in' l=exp whitespace 'do' e=exp 'else' d=exp { Find(p,l,e,d) } ]]
                  |  [[ 'if'     ! t=exp  'then' c=exp whitespace 'else' a=exp { If(t,c,a) } ]]
                  |  [[ 'try'    ! e=exp  'catch' lcurl as=barms rcurl { Try(e,as) } ]]
                  |  [[ 'throw'  ! e=exp { Throw(e) } ]]
                  |  [[ 'bag'      lcurl es=exps rcurl { Bag(es) } ]]
                  |  [[ 'bag'      lcurl es=exps bar e=exp rcurl { BinExp(Bag(es),'+',e) } ]]
                  |  [[ 'set'      lcurl es=exps rcurl { Set(es) } ]]
                  |  [[ 'set'      lcurl es=exps bar e=exp rcurl { BinExp(Set(es),'+',e) } ]]
                  |  [[ lsquare (es=exps rsquare { List(es) } | rsquare { List([]) }) ]]
                  |  [[ lsquare e=exp bar qs=quals rsquare { Cmp(e,qs) } ]]
                  |  [[ n=Name es=(lparen es=exps rparen {es} | {[]}) { Term(n,es) } ]]
                  |  [[ 'become' n=name (lparen ps=exps rparen { Become(Apply(Var(n),ps)) } | { Become(Apply(Var(n),[])) }) ]]
                  |  [[ lcurl (e=exp es=(semi exp)* rcurl { Block(e:es) } | rcurl { Block([]) }) ]]
                  |  lparen e=exp rparen {e};
  var             -> [[ n=name (becomes e=exp { Update(n,e) } | { Var(n) }) ]];
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
  probably        -> [[ 'probably' lparen p=exp rparen e1=exp whitespace 'else' e2=exp { Apply(Apply(Var('probably'),[p,Fun(Fun.newName(),[],e1),Fun(Fun.newName(),[],e2)]),[]) } ]];
  
  
  whitespace  -> SKIPWHITE('//','/*','*/');
  lcurl       -> whitespace '{';
  rcurl       -> whitespace '}';
  lsquare     -> whitespace '[';
  rsquare     -> whitespace ']';
  lparen      -> whitespace '(';
  rparen      -> whitespace ')';
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
  colon       -> whitespace ':';
  underscore  -> whitespace '_';
  query       -> whitespace '?';
  at          -> whitespace '@';
  keyWord     -> key ! not([97,122] | [65,90]);
  key         -> 'EOF' | 'act' | 'export' | 'import' | 'for' | 'find' | 'do' | 'not' | 'fun' | 'letrec' | 'let' | 'in' | 'new' | 'true' | 'false' | 'case' | 'become' | 'self' | 'probably' | 'now' | 'null' | 'if' | 'then' | 'else' | 'when' | 'try' | 'catch' | 'throw' | 'bag' | 'set';
  name        -> whitespace not(keyWord) c=lowerChar chars=(alphaChar | numChar)*  whitespace ! {'values.Str'(c:chars)};
  names       -> n=name ns=(comma name)* { n:ns } | {[]};
  Name        -> whitespace not(keyWord) c=upperChar chars=(alphaChar | numChar)*  whitespace ! {'values.Str'(c:chars)};
  int         -> whitespace i=[48,57]+ ! {'values.Int'(i)};
  string      -> '\'' cs=(not(39) stringChar)* 39 ! {'values.Str'(cs)};
  strings     -> s=string ss=(x=string ',' {x})* ! {s:ss};
  alphaChar   -> lowerChar | upperChar;
  lowerChar   -> [97,122];
  upperChar   -> [65,90];
  stringChar  -> 92 c=. ! {c} | .;
  numChar     -> [48,57]
  
}