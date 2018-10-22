export monitor

VoidType      = 'ast.types.Void'.java()


spec = { 

  monitor         -> whitespace [[ 'monitor' lcurl rs=mrule* rcurl { Monitor([]) } ]];
  mrule           -> whitespace [[ 'rule' n=name lcurl ps=mpattern* arrow e=exp rcurl { MonitorRule(name,0,ps,True(),e) } ]];
  mpattern        -> mterm | [[ '!' lsquare t=mterm rsquare { MTerm('$NOT',[t]) } ]];
  mterm           -> [[ n=Name (lparen vs=mvals rparen { MTerm(n,vs) } | { MTerm(n,[]) }) ]];
  mvals           -> v=mval vs=(',' mval)* { v:vs };
  mval            -> [[ mterm | i=int { MInt(i) } | s=str { MStr(s) } | 'true' { MBool(true) } | 'false' { MBool(false) } ]];

  
  
}