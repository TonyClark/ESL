stateMachine(Act(s,e,name,exports,bindings,init,arms),Graph([],[Node([],stateStart,Text(stateStart))],edges)) <- 
  getState(bindings,stateName,stateStart),
  getTransitions(arms,edges);
  
getState([Binding(_,_,'state',_,exp) | _],'state',value) <- expValue(exp,value);
getState([_|bindings],stateName,stateStart) <- getState(bindings,stateName,stateStart);

getTransitions([],[]);
getTransitions([arm | arms],[edge | edges]) <- getTransition(arm,edge), getTransitions(arms,edges);

getTransition(arm,Edge([],source,target,label)) <- 
  transitionSource(arm,source), 
  transitionTarget(arm,target),
  transitionLabel(arm,label);
  
transitionSource(BArm(_,guard,_),source) <- stateValue(guard,source);
stateValue(BinExp(_,_,Var(_,_,'state'),'=',exp),value) <- expValue(exp,value);
stateValue(BinExp(_,_,left,_,right),value) <- stateValue(left,value);
stateValue(BinExp(_,_,left,_,right),value) <- stateValue(right,value);

expValue(Term(_,_,name,types,args),name);

transitionTarget(BArm(_,_,body),target) <- stateChange(body,target);

stateChange(Block(_,_,es),target) <- stateChange(es,target);
stateChange(Update(_,_,'state',exp),target) <- expValue(exp,target);
stateChange(Apply(_,_,Apply(_,_,ApplyType(_,_,Var(_,_,probably),_),p,Fun(_,_,_,_,_,e),_),target)
stateChange(Apply(_,_,op,args),target) <- stateChange(op,target);
stateChange(Apply(_,_,op,args),target) <- stateChange(args,target);
stateChange(Fun(_,_,_,_,_,body),target) <- stateChange(body,target);
stateChange(Let(_,_,_,body),target) <- stateChange(body,target);
stateChange([e | es],target) <- stateChange(e,target);
stateChange([e | es],target) <- stateChange(es,target);


transitionLabel(BArm([pattern],guard,_),Text(l)) <- !, patternLabel(pattern,label), removeState(guard,exp), pp(exp,p), l := label + '?' + p;
transitionLabel(BArm(patterns,guard,_),Text(labels)) <- patternLabels(patterns,labels);
patternLabels([],[]);
patternLabels([p|ps],[l|ls]) <- patternLabel(p,l), patternLabels(ps,ls);
patternLabel(PTerm(_,_,n,_,ps),label) <- patternLabels(ps,ls),implode(n,ls,label);
patternLabel(PVar(_,_,n,_),n);
patternLabel(v,v);

removeState(BinExp(_,_,BinExp(_,_,Var(_,_,'state'),_,_),'and',exp),exp);
removeState(BinExp(_,_,BinExp(_,_,_,_,Var(_,_,'state')),'and',exp),exp);
removeState(BinExp(_,_,exp,'and',BinExp(_,_,Var(_,_,'state'),_,_)),exp);
removeState(BinExp(_,_,exp,'and',BinExp(_,_,_,_,Var(_,_,'state'))),exp);
removeState(BinExp(_,_,exp1,op,exp2),BinExp(_,_,exp3,op,exp4)) <- 
  removeState(exp1,exp3),
  removeState(exp2,exp4);
removeState(BinExp(_,_,Var(_,_,'state'),_,_),True);
removeState(BinExp(_,_,_,_,Var(_,_,'state')),True);

  
pp(BinExp(_,_,e1,'>',e2),s) <- pp(e1,s1), pp(e2,s2), s := s1 + 'gre' + s2;
pp(BinExp(_,_,e1,'<',e2),s) <- pp(e1,s1), pp(e2,s2), s := s1 + 'le' + s2;
pp(BinExp(_,_,e1,op,e2),s) <- pp(e1,s1), pp(e2,s2), s := s1 + op + s2;
pp(Var(_,_,n),n);
pp(x,x);

implode(n,vs,Implode(n,vs));












