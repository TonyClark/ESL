export query, ruleBase, ruleCall, ruleDec

Always        = 'ast.query.body.Always'.java()
And           = 'ast.query.body.And'.java()
ApplyTypeFun  = 'ast.types.Apply'.java()
BoolType      = 'ast.types.Bool'.java()
Call          = 'ast.query.body.Call'.java()
Catch         = 'ast.query.body.Catch'.java()
Cut           = 'ast.query.body.Cut'.java()
Dec           = 'ast.binding.Dec'.java()
EndOfTime     = 'ast.query.body.EndOfTime'.java()
Eventually    = 'ast.query.body.Eventually'.java()
False         = 'ast.query.body.False'.java()
Forall        = 'ast.query.body.Forall'.java()
If            = 'ast.query.body.If'.java()
Int           = 'ast.query.value.Int'.java()
IntType       = 'ast.types.Int'.java()
Is            = 'ast.query.body.Is'.java()
Key           = 'runtime.data.Key'.java()
ListType      = 'ast.types.List'.java()
Named         = 'ast.query.value.Name'.java()
Next          = 'ast.query.body.Next'.java()
Nil           = 'ast.query.value.Nil'.java()
NullType      = 'ast.types.Null'.java()
Pair          = 'ast.query.value.Pair'.java()
Par           = 'ast.query.body.Par'.java()
Past          = 'ast.query.body.Past'.java()
Prev          = 'ast.query.body.Prev'.java()
Query         = 'ast.query.rules.Query'.java()
Relation      = 'ast.query.body.Relation'.java()
RecType       = 'ast.types.Rec'.java()
Rule          = 'ast.query.rules.Rule'.java()
RuleBase      = 'ast.query.rules.RuleBase'.java()
StartOfTime   = 'ast.query.body.StartOfTime'.java()
StrType       = 'ast.types.Str'.java()
Str           = 'ast.query.value.Str'.java()
Term          = 'ast.query.value.Term'.java()
TermType      = 'ast.types.Term'.java()
TypeDec       = 'ast.query.TypeDec'.java()
Throw         = 'ast.query.body.Throw'.java()
TypeUnion     = 'ast.types.Union'.java()
TypeVar       = 'ast.types.Var'.java()
True          = 'ast.query.body.True'.java()
Try           = 'ast.query.body.Try'.java()
TypeBind      = 'ast.binding.TypeBind'.java()
Wild          = 'ast.query.value.Wild'.java()
UnionRef      = 'ast.types.UnionRef'.java()
UnfoldType    = 'ast.types.Unfold'.java()
VoidType      = 'ast.types.Void'.java()

query = { 

  file(n)         -> [[ r=ruleBase b=queryAction v=queryResult EOF { Query(r,b,v) } ]];
  queryAction     -> whitespace 'do' body | { [True()] };
  queryResult     -> whitespace 'return' val | { Term(Key.getKey('OK'),[]) };
  ruleBase        -> rs={[]} ds={[]} ts={[]} (r=rule ! rs={rs + [r]} | d=typeDec ! ds={d:ds} | t=typeDef ! ts={ts + [t]})* { RuleBase(rs,ds,ts) };
  typeDec         -> whitespace [[ n=name as=optGenArgs coloncolon lparen ds=types rparen semi { TypeDec(Key.getKey(n),as,ds) } ]];
  typeDef         -> whitespace [[ 'type' n=Name d=typebindDec semi { TypeBind(n,d,d) } ]];
  typebindDec     -> [[ as=optGenArgs eql t=type { Dec.funType(as,t) } ]];
  optGenArgs      -> lsquare ns=Names rsquare { ns } | {[]}; 
  rule            -> whitespace [[ n=name gs=optGenArgs args=optArgs (leftArrow ! b=body semi { Rule(Key.getKey(n),gs,args,b) } | semi { Rule(Key.getKey(n),gs,args,[]) }) ]];
  optArgs         -> lparen vs=vals rparen { vs } | {[]};
  alwaysArgs      -> lparen vs=vals rparen { vs };
  vals            -> v=val vs=(comma val)* { v:vs };
  val             -> v = [[ wild | javaObj | var | int | str | term | list ]] postExp^(v);
  path            -> n=pathName ns=(dot pathName)* { n:ns };
  pathName        -> name;
  field           -> n=name eql v=val { Field(n,v) };
  fields          -> f=field fs=(semi field)* { f:fs };
  javaObj         -> p=path lsquare fs=fields rsquare { JavaObj(p,fs) };
  list            -> lsquare listTail;
  listTail        -> rsquare { Nil() } | v=val aListTail^(v);
  aListTail(head) -> rsquare { Pair(head,Nil()) } | bar tail=val rsquare { Pair(head,tail) } | comma vs=vals rsquare { Pair.list(head:vs) };
  wild            -> [[ underscore { Wild() } ]] ;
  var             -> whitespace [[ n=name { Named(n) } ]] ;
  int             -> whitespace [[ i=[48,57]+ ! { Int('values.Int'(i)) } ]];
  str             -> whitespace [[ '\'' cs=(not(39) stringChar)* 39 ! { Str('values.Str'(cs)) } ]];
  term            -> whitespace [[ n=Name args=optArgs { Term(Key.getKey(n),args) } ]];
  body            -> e=element es=(',' element)* { e:es } | {[]};
  element         -> throw | try | cut | startofTime | endOfTime | is | rel | call | always | eventually | past | test | next | prev | par | tt | ff | forall | lparen b=body rparen { And(b) };
  tt              -> whitespace [[ 'true' { True() } ]];
  ff              -> whitespace [[ 'false' { False() } ]];
  try             -> whitespace [[ 'try' lcurl b=body rcurl cs=catch* { Try(b,cs) } ]];
  throw           -> whitespace [[ 'throw' v=val { Throw(v) } ]];
  catch           -> whitespace [[ 'catch' v=val lcurl b=body rcurl { Catch(v,b) } ]];
  test            -> whitespace [[ 'if' b1=body whitespace 'then' b2=body whitespace 'else' b3=element { If(b1,b2,[b3]) } ]];
  always          -> whitespace [[ 'always' lsquare b=body rsquare { Always(b) } ]];
  eventually      -> whitespace [[ 'eventually' lsquare b=body rsquare { Eventually(b) } ]];
  past            -> whitespace [[ 'past' lsquare b=body rsquare { Past(b) } ]];
  next            -> whitespace [[ 'next' lsquare b=body rsquare { Next(b) } ]];
  prev            -> whitespace [[ 'prev' lsquare b=body rsquare { Prev(b) } ]];
  par             -> whitespace [[ 'par' lsquare g1=body semi g2=body rsquare { Par(g1,g2) } ]];
  forall          -> whitespace [[ 'forall' lsquare b=body rsquare lparen v=val comma r=val rparen { Forall(b,v,r) } ]];
  is              -> whitespace [[ n=name ':=' ! e=exp { Is(n,e) } ]];
  rel             -> whitespace [[ e1=exp o=rop e2=exp { Relation(e1,Key.getKey(o),e2) } ]];
  call            -> whitespace [[ n=name gs=optTypes args=optArgs { Call(Key.getKey(n),gs,args) } ]];
  optTypes        -> lsquare ts=types rsquare { ts } | {[]};
  cut             -> whitespace [[ bang { Cut() } ]];
  startOfTime     -> whitespace [[ 'start' { StartOfTime() } ]];
  endOfTime       -> whitespace [[ 'end' { EndOfTime() } ]];
  exp             -> e=simpleExp postExp^(e);
  simpleExp       -> var | int | str;
  postExp(e1)     -> whitespace [[ o=op e2=exp { Term(Key.getKey(o),[e1,e2]) } ]] | { e1 };
  rop             -> '<>' | '<' | '>' | '=' ;
  op              -> '+' | '*' | '/' | '-';
  
  topLevelCommands -> c=call cs=(comma call)* semi { c:cs }; 
  
  type        -> t = simpleType postType^(t);
  types       -> t=type ts=(comma type)* { t:ts } | {[]};
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
  cnstrTypes  -> t=cnstrType ts=(comma ! cnstrType)* { t:ts };
  cnstrType   -> [[ n=Name (lparen ts = types rparen ! { TermType(n,ts) } | { TermType(n,[]) }) ]]; 
  
  
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
  underscore  -> whitespace '_';
  bang        -> whitespace '!';
  keyWord     -> key ! not([97,122] | [65,90]);
  key         -> 'par' | 'throw' | 'try' | 'catch' | 'start' | 'end' | 'do' | 'always' | 'eventually' | 'next' | 'past' | 'prev' | 'if' | 'then' | 'else' | 'true' | 'false' | 'type' | 'forall';
  name        -> whitespace not(keyWord) c=lowerChar chars=(alphaChar | numChar | quote)* ! {'values.Str'(c:chars)};
  names       -> n=name ns=(comma name)* { n:ns } | {[]};
  Name        -> whitespace not(keyWord) c=upperChar chars=(alphaChar | numChar | quote)* ! {'values.Str'(c:chars)};
  Names       -> n=Name ns=(comma Name)* { n:ns} | {[]};
  strings     -> s=string ss=(x=string ',' {x})* ! {s:ss};
  alphaChar   -> lowerChar | upperChar;
  lowerChar   -> [97,122];
  upperChar   -> [65,90];
  stringChar  -> 92 c=. ! {c} | .;
  numChar     -> [48,57];
  quote       -> 39
  
}

ruleBase = query.ruleBase
ruleCall = query.call
ruleDec  = query.typeDec