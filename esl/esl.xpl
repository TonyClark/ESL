export esl

import 'esl/ast.xpl'

esl = { 

  file(name)      -> es=exports is=imports bs=bindings EOF { Module(name,es,is,bs) };
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
  binding         -> b=(valbind | funbind | actbind) ! {b};
  valbind         -> n=name eql e=exp { Binding(n,e) };
  funbind         -> n=name lparen ps=params rparen eql e=exp { Binding(n,Fun(n,ps,e)) };
  actbind         -> whitespace 'act' n=name ps=actargs lcurl bs = bindings i=actinit as=barms rcurl { Binding(n,Fun(n,ps,Letrec(bs,Act(n,i,as)))) };
  actargs         -> lparen ps=params rparen {ps} | {[]};
  actinit         -> arrow e=exp semi {e} | { Null() };
  barms           -> a=barm ! as=(semi barm)* { a:as };
  barm            -> lparen ps=patterns rparen arrow e=exp { BArm(ps,e) };
  barm            -> p=pattern arrow ! e=exp { BArm([p],e) };
  patterns        -> p=pattern ps=(comma pattern)* { p:ps };
  pattern         -> s=simplePattern ! (colon p=pattern { PCons(s,p) } | query e=exp { PGuard(e,s) } | {s});
  simplePattern   -> pVar | pInt | pTerm | pList | pStr | pBool | pWild | pNull | lparen p=pattern rparen {p};
  pVar            -> n=name (eql p=pattern { PBind(n,p) } | { PVar(n) });
  pInt            -> n=int { PInt(n) };
  pStr            -> s=string { PStr(s) };
  pBool           -> whitespace ('true' ! { PBool(true) } | 'false' { PBool(false) });
  pWild           -> underscore { PWild() };
  pNull           -> whitespace 'null' { PNull() };
  pTerm           -> n=Name (lparen ps=patterns rparen { PTerm(n,ps) } | { PTerm(n,[]) });
  pList           -> lsquare (rsquare { PNil() } | pListTail);
  pListTail       -> p=pattern (rsquare { PCons(p,PNil()) } | comma ps=pListTail { PCons(p,ps) });
  params          -> n=name ns=(comma name)* { n:ns } | {[]};
  exp             -> e=simpleExp ! postexp^(e);
  postexp(e)      -> o=op ! r=exp { BinExp(e,o,r) } 
                  |  lparen es=exps rparen { Apply(e,es) } 
                  |  leftArrow v=exp { Send(e,[v]) }
                  |  {e};
  exps            -> e=exp es=(comma exp)* { e:es } | {[]};
  op              -> whitespace ('+' | '-' | '*' | '/' | 'and' | 'or' | ':' | '<>' | '=' | '<' | '>' | '..');
  simpleExp       -> var | numExp | strExp | bool | me | probably | now | nul
                  |  n=name becomes e=exp { Update(n,e) }
                  |  whitespace 'new'    ! n=name (lparen ps=exps rparen { New(Apply(Var(n),ps)) } | { New(Apply(Var(n),[])) })
                  |  whitespace 'not'    ! e=exp { Not(e) } 
                  |  whitespace 'fun'    ! lparen as=params rparen e=exp { Fun('',as,e) }
                  |  whitespace 'let'    ! bs=bindings whitespace 'in' e=exp { Let(bs,e) }
                  |  whitespace 'letrec' ! bs=bindings whitespace 'in' e=exp { Letrec(bs,e) }
                  |  whitespace 'case'   ! es=caseValues lcurl as=barms rcurl { Case(es,as) }
                  |  whitespace 'for'      p=pattern whitespace 'in' l=exp whitespace 'do' e=exp whitespace { For(p,l,e) }
                  |  whitespace 'for'    ! p=pattern whitespace 'in' l=exp arrow e=exp whitespace { Map(p,l,e) }
                  |  whitespace 'find'   ! p=pattern whitespace 'in' l=exp whitespace 'do' e=exp 'else' d=exp { Find(p,l,e,d) }
                  |  whitespace 'if'     ! t=exp whitespace 'then' c=exp whitespace 'else' a=exp { If(t,c,a) }
                  |  whitespace lsquare (es=exps rsquare { List(es) } | rsquare { List([]) })
                  |  whitespace lsquare e=exp bar qs=quals rsquare { Cmp(e,qs) }
                  |  n=Name es=(lparen es=exps rparen {es} | {[]}) { Term(n,es) }
                  |  whitespace 'become' e=exp { Become(e) }
                  |  lcurl (e=exp es=(semi exp)* rcurl { Block(e:es) } | rcurl { Block([]) })
                  |  lparen e=exp rparen {e};
  var             -> n=name (becomes e=exp { Update(n,e) } | { Var(n) });
  me              -> whitespace 'self' { Self() };
  now             -> whitespace 'now' { Now() };
  nul             -> whitespace 'null' { Null() };
  numExp          -> n=int (dot m=int { Float(n,m) } | { Int(n) });
  strExp          -> s=string { Str(s) };
  bool            -> whitespace ('true' { Bool(true) } | 'false' { Bool(false) });
  caseValues      -> lparen es=exps rparen { es } | e=exp {[e]};
  quals           -> q=qual qs=(comma qual)* { q:qs };
  qual            -> p=pattern leftArrow e=exp { BQual(p,e) };
  qual            -> query e=exp { PQual(e) };
  probably        -> whitespace 'probably' lparen p=exp rparen e1=exp whitespace 'else' e2=exp { Apply(Apply(Var('probably'),[p,Fun('prob1',[],e1),Fun('prob2',[],e2)]),[]) };
  
  
  whitespace  -> (32 ! | 10 ! | 13 ! | 9 ! | comment)* !;
  comment     -> '//' ([32,126] !)* ! | '/*' (not('*/') .)* '*/';
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
  keyWord     -> key ! not([97,122] | [65,90]);
  key         -> 'EOF' | 'act' | 'export' | 'import' | 'for' | 'find' | 'do' | 'not' | 'fun' | 'letrec' | 'let' | 'in' | 'new' | 'true' | 'false' | 'case' | 'become' | 'self' | 'probably' | 'now' | 'null' | 'if' | 'then' | 'else';
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