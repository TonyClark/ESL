export esl

import 'esl/ast.xpl'

esl = { 

  esl             -> bs=bindings EOF {bs};
  topLevelCommand -> whitespace d=eslCommand {d};
  eslCommand      -> x=tplvlSet ! {x} | x=tplvlExp ! {x} | x=tplvlQuit ! {x} | x=tplvlImport ! {x};
  tplvlSet        -> n=name ':=' e=exp ';' { TplvlSet(n,e) };
  tplvlQuit       -> 'quit' {'commands.Quit'()};
  tplvlImport     -> 'import' ns=strings ';' {Import(ns)};
  tplvlExp        -> e=exp semi { e };
  
  bindings        -> b=binding ! bs=(semi binding)* { b:bs };
  binding         -> valbind | funbind | actbind;
  valbind         -> n=name eql e=exp { Binding(n,e) };
  funbind         -> n=name lparen ps=params rparen eql e=exp { Binding(n,Fun(n,ps,e)) };
  actbind         -> 'act' n=name ps=actargs lcurl bs=barms rcurl { Binding(n,Act(n,ps,bs)) };
  actargs         -> lparen ps=params rparen {ps} | {[]};
  barms           -> a=barm as=(semi barm)* { a:as };
  barm            -> lparen ps=patterns rparen arrow e=exp { BArm(ps,e) };
  barm            -> p=pattern arrow e=exp { BArm([p],e) };
  patterns        -> p=pattern ps=(comma pattern)* { p:ps };
  pattern         -> s=simplePattern (colon p=pattern { PCons(s,p) } | {s});
  simplePattern   -> pVar | pInt | pTerm | pList | lparen p=pattern rparen {p};
  pVar            -> n=name { PVar(n) };
  pInt            -> n=int { PInt(n) };
  pTerm           -> n=Name (lparen ps=patterns rparen { PTerm(n,ps) } | { PTerm(n,[]) });
  pList           -> lsquare (rsquare { PNil() } | pListTail);
  pListTail       -> p=pattern (rsquare { PCons(p,PNil()) } | comma ps=pListTail { PCons(p,ps) });
  params          -> n=name ns=(comma name)* { n:ns } | {[]};
  exp             -> e=simpleExp postexp^(e);
  postexp(e)      -> o=op r=exp { BinExp(e,o,r) } 
                  |  lparen es=exps rparen { Apply(e,es) } 
                  |  leftArrow (lparen es=exps rparen { Send(e,es) } | v=exp { Send(e,[v]) })
                  |  {e};
  exps            -> e=exp es=(comma exp)* { e:es } | {[]};
  op              -> whitespace ('+' | '-' | '*' | '/' | 'and' | 'or' | ':');
  simpleExp       -> var | numExp | strExp | bool
                  |  n=name becomes e=exp { Update(n,e) }
                  |  whitespace 'new' n=name lparen ps=params rparen { New(n,ps) } 
                  |  whitespace 'not' e=exp { Not(e) } 
                  |  whitespace 'fun' lparen as=params rparen e=exp { Fun('',as,e) }
                  |  whitespace 'let' bs=bindings whitespace 'in' e=exp { Let(bs,e) }
                  |  whitespace 'letrec' bs=bindings whitespace 'in' e=exp { Letrec(bs,e) }
                  |  whitespace 'case' es=caseValues lcurl as=barms rcurl { Case(es,as) }
                  |  whitespace lsquare (es=exps rsquare { List(es) } | rsquare { List([]) })
                  |  whitespace lsquare e=exp bar qs=quals rsquare { Cmp(e,qs) }
                  |  n=Name es=(lparen es=exps rparen {es} | {[]}) { Term(n,es) }
                  |  whitespace 'become' n=name (lparen es=exps rparen { Become(n,es) } | { Become(n,[]) })
                  |  lcurl e=exp es=(semi exp)* rcurl { Block(e:es) }
                  |  lparen e=exp rparen {e};
  var             -> n=name { Var(n) };
  numExp          -> n=int (dot m=int { Float(n,m) } | { Int(n) });
  strExp          -> s=string { Str(s) };
  bool            -> whitespace ('true' { Bool(true) } | 'false' { Bool(false) });
  caseValues      -> lparen es=exps rparen { es } | e=exp {[e]};
  quals           -> q=qual qs=(comma qual)* { q:qs };
  qual            -> p=pattern leftArrow e=exp { BQual(p,e) };
  
  
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
  keyWord     -> key ! not([97,122] | [65,90]);
  key         -> 'EOF' | 'act' | 'not' | 'fun' | 'letrec' | 'let' | 'in' | 'new' | 'true' | 'false' | 'case' | 'become';
  name        -> whitespace not(keyWord) c=lowerChar chars=(alphaChar | numChar)*  whitespace ! {'values.Str'(c:chars)};
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