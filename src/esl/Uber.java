package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Uber {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal cab = new ESLVal(new Function(new ESLVal("cab"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x0 = $args[0];
  ESLVal y0 = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("cab")) {
          ESLVal x = x0;
          ESLVal y = y0;
          ESLVal direction = new ESLVal("North",new ESLVal[]{});
          ESLVal plan = ESLVal.list();
          ESLVal isEmpty = $true;
          ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(isEmpty.boolVal)
                  return new ESLVal("Empty",new ESLVal("Loc",x,y),direction,plan);
                  else
                    return new ESLVal("Full",new ESLVal("Loc",x,y),direction,plan);
              }
            });
          ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal m = $args[0];
            {ESLVal _v1 = m;
                  
                  switch(_v1.termName) {
                  case "ChangeDir": {ESLVal $2 = _v1.termRef(0);
                    
                    {ESLVal d = $2;
                    
                    return new ESLVal("Something",m);
                  }
                  }
                case "MoveDir": {ESLVal $1 = _v1.termRef(0);
                    
                    {ESLVal d = $1;
                    
                    return new ESLVal("Something",m);
                  }
                  }
                case "Pickup": {
                    return new ESLVal("Something",m);
                  }
                case "DropOff": {
                    return new ESLVal("Something",m);
                  }
                  default: {ESLVal _v46 = _v1;
                    
                    return new ESLVal("Nothing",new ESLVal[]{});
                  }
                }
                }
              }
            });
          ESLVal $observers = ESLVal.list();
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return Lib.send(o,"Start",getSelf(),now(),observeState.apply());}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{((Supplier<ESLVal>)() -> { 
            {ESLVal _v2 = $m;
              
              switch(_v2.termName) {
              case "Customer": {ESLVal $8 = _v2.termRef(0);
                ESLVal $7 = _v2.termRef(1);
                ESLVal $6 = _v2.termRef(2);
                ESLVal $5 = _v2.termRef(3);
                
                {ESLVal xStart = $8;
                
                {ESLVal yStart = $7;
                
                {ESLVal xEnd = $6;
                
                {ESLVal yEnd = $5;
                
                {plan = ESLVal.list(new ESLVal("Loc",xStart,yStart),new ESLVal("Loc",xEnd,yEnd));
              return Lib.send(getSelf(),"Move");}
              }
              }
              }
              }
              }
            case "Pickup": {
                {isEmpty = $false;
              return $null;}
              }
            case "DropOff": {
                {isEmpty = $true;
              return $null;}
              }
            case "Move": {
                {ESLVal _v3 = plan;
                
                if(_v3.isCons())
                {ESLVal $9 = _v3.head();
                  ESLVal $10 = _v3.tail();
                  
                  switch($9.termName) {
                  case "Loc": {ESLVal $12 = $9.termRef(0);
                    ESLVal $11 = $9.termRef(1);
                    
                    {ESLVal tx = $12;
                    
                    {ESLVal ty = $11;
                    
                    {ESLVal locs = $10;
                    
                    if(tx.eql(x).and(ty.eql(y).and(isEmpty)).boolVal)
                    {plan = locs;
                    Lib.send(getSelf(),"Pickup");
                    return Lib.send(getSelf(),"Move");}
                    else
                      {ESLVal _v47 = $12;
                        
                        {ESLVal _v48 = $11;
                        
                        {ESLVal _v49 = $10;
                        
                        if(_v47.eql(x).and(_v48.eql(y).and(isEmpty.not())).boolVal)
                        {plan = _v49;
                        Lib.send(getSelf(),"DropOff");
                        return Lib.send(getSelf(),"Move");}
                        else
                          {ESLVal _v50 = $12;
                            
                            {ESLVal _v51 = $11;
                            
                            {ESLVal _v52 = $10;
                            
                            if(x.gre(_v50).boolVal)
                            return Lib.send(getSelf(),"MoveDir",new ESLVal("West",new ESLVal[]{}));
                            else
                              {ESLVal _v53 = $12;
                                
                                {ESLVal _v54 = $11;
                                
                                {ESLVal _v55 = $10;
                                
                                if(x.less(_v53).boolVal)
                                return Lib.send(getSelf(),"MoveDir",new ESLVal("East",new ESLVal[]{}));
                                else
                                  {ESLVal _v56 = $12;
                                    
                                    {ESLVal _v57 = $11;
                                    
                                    {ESLVal _v58 = $10;
                                    
                                    if(y.gre(_v57).boolVal)
                                    return Lib.send(getSelf(),"MoveDir",new ESLVal("North",new ESLVal[]{}));
                                    else
                                      {ESLVal _v59 = $12;
                                        
                                        {ESLVal _v60 = $11;
                                        
                                        {ESLVal _v61 = $10;
                                        
                                        if(y.less(_v60).boolVal)
                                        return Lib.send(getSelf(),"MoveDir",new ESLVal("South",new ESLVal[]{}));
                                        else
                                          return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v3)));
                                      }
                                      }
                                      }
                                  }
                                  }
                                  }
                              }
                              }
                              }
                          }
                          }
                          }
                      }
                      }
                      }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v3)));
                }
                }
              else if(_v3.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v3)));
              }
              }
            case "MoveDir": {ESLVal $4 = _v2.termRef(0);
                
                switch($4.termName) {
                case "North": {
                  if(direction.eql(new ESLVal("North",new ESLVal[]{})).boolVal)
                  {y = y.sub($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $4;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "South": {
                  if(direction.eql(new ESLVal("South",new ESLVal[]{})).boolVal)
                  {y = y.add($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $4;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "East": {
                  if(direction.eql(new ESLVal("East",new ESLVal[]{})).boolVal)
                  {x = x.add($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $4;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "West": {
                  if(direction.eql(new ESLVal("West",new ESLVal[]{})).boolVal)
                  {x = x.sub($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $4;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
                default: {ESLVal d = $4;
                  
                  {Lib.send(getSelf(),"ChangeDir",d);
                return Lib.send(getSelf(),"MoveDir",d);}
                }
              }
              }
            case "ChangeDir": {ESLVal $3 = _v2.termRef(0);
                
                {ESLVal d = $3;
                
                {direction = d;
              return $null;}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
            }
            }
          }).get();
          {ESLVal $s = observeState.apply();
            
            {{
            ESLVal _v4 = $observers;
            while(_v4.isCons()) {
              ESLVal $o = _v4.headVal;
              ((Supplier<ESLVal>)() -> { 
                {ESLVal _v5 = observeMessage.apply($m);
                  
                  switch(_v5.termName) {
                  case "Something": {ESLVal $13 = _v5.termRef(0);
                    
                    {ESLVal $x = $13;
                    
                    return Lib.send($o,"Transition",getSelf(),now(),$x,$s);
                  }
                  }
                case "Nothing": {
                    return $null;
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
                }
                }
              }).get();
              _v4 = _v4.tailVal;}
          }
          return $null;}
          }}}
          public ESLVal get(String name) {
            switch(name) {
              case "observeState": return observeState;
              case "observeMessage": return observeMessage;
              case "addObserver": return addObserver;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal screenBehaviour = new ESLVal(new Function(new ESLVal("screenBehaviour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal width = $args[0];
  ESLVal height = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("screenBehaviour")) {
          ESLVal scale = new ESLVal(38);
          ESLVal scaleText = scale.add(new ESLVal("px"));
          ESLVal cellScale = scale.add(new ESLVal(10)).add(new ESLVal("px"));
          ESLVal frontTaxi = new ESLVal("HTML",new ESLVal("&#128662;"));
          ESLVal sideTaxi = new ESLVal("HTML",new ESLVal("&#128661;"));
          ESLVal customer = new ESLVal("HTML",new ESLVal("&#128587;"));
          ESLVal target = new ESLVal("HTML",new ESLVal("&#127919;"));
          ESLVal upArrow = new ESLVal("HTML",new ESLVal("&#8593;"));
          ESLVal downArrow = new ESLVal("HTML",new ESLVal("&#8595;"));
          ESLVal rightArrow = new ESLVal("HTML",new ESLVal("&#8594"));
          ESLVal leftArrow = new ESLVal("HTML",new ESLVal("&#8592;"));
          ESLVal space = new ESLVal("HTML",new ESLVal("&nbsp;"));
          ESLVal tableProps = ESLVal.list(new ESLVal("Prop",new ESLVal("border"),new ESLVal("1")),new ESLVal("Prop",new ESLVal("cellpadding"),new ESLVal("0")));
          ESLVal rowProps = ESLVal.list(new ESLVal("Prop",new ESLVal("align"),new ESLVal("center")),new ESLVal("Prop",new ESLVal("style"),new ESLVal("font-size:").add(scaleText.add(new ESLVal(";")))),new ESLVal("Prop",new ESLVal("width"),cellScale),new ESLVal("Prop",new ESLVal("height"),cellScale));
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            switch(_v6.termName) {
            case "Show": {ESLVal $16 = _v6.termRef(0);
              ESLVal $15 = _v6.termRef(1);
              ESLVal $14 = _v6.termRef(2);
              
              {ESLVal display = $16;
              
              {ESLVal jobs = $15;
              
              {ESLVal targets = $14;
              
              { LetRec letrec = new LetRec() {
              ESLVal path = new ESLVal(new Function(new ESLVal("path"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal p1 = $args[0];
                ESLVal p2 = $args[1];
                if(p1.eql(p2).boolVal)
                      return ESLVal.list();
                      else
                        {ESLVal _v7 = p1;
                          ESLVal _v8 = p2;
                          
                          switch(_v7.termName) {
                          case "Loc": {ESLVal $18 = _v7.termRef(0);
                            ESLVal $17 = _v7.termRef(1);
                            
                            switch(_v8.termName) {
                            case "Loc": {ESLVal $20 = _v8.termRef(0);
                              ESLVal $19 = _v8.termRef(1);
                              
                              {ESLVal x1 = $18;
                              
                              {ESLVal y1 = $17;
                              
                              {ESLVal x2 = $20;
                              
                              {ESLVal y2 = $19;
                              
                              if(x1.eql(x2).and(y1.less(y2)).boolVal)
                              return path.apply(new ESLVal("Loc",x1,y1.add($one)),p2).cons(new ESLVal("DLoc",x1,y1,new ESLVal("South",new ESLVal[]{})));
                              else
                                {ESLVal _v34 = $18;
                                  
                                  {ESLVal _v35 = $17;
                                  
                                  {ESLVal _v36 = $20;
                                  
                                  {ESLVal _v37 = $19;
                                  
                                  if(_v34.eql(_v36).and(_v35.gre(_v37)).boolVal)
                                  return path.apply(new ESLVal("Loc",_v34,_v35.sub($one)),p2).cons(new ESLVal("DLoc",_v34,_v35,new ESLVal("North",new ESLVal[]{})));
                                  else
                                    {ESLVal _v38 = $18;
                                      
                                      {ESLVal _v39 = $17;
                                      
                                      {ESLVal _v40 = $20;
                                      
                                      {ESLVal _v41 = $19;
                                      
                                      if(_v38.less(_v40).boolVal)
                                      return path.apply(new ESLVal("Loc",_v38.add($one),_v39),p2).cons(new ESLVal("DLoc",_v38,_v39,new ESLVal("East",new ESLVal[]{})));
                                      else
                                        {ESLVal _v42 = $18;
                                          
                                          {ESLVal _v43 = $17;
                                          
                                          {ESLVal _v44 = $20;
                                          
                                          {ESLVal _v45 = $19;
                                          
                                          if(_v42.gre(_v44).boolVal)
                                          return path.apply(new ESLVal("Loc",_v42.sub($one),_v43),p2).cons(new ESLVal("DLoc",_v42,_v43,new ESLVal("West",new ESLVal[]{})));
                                          else
                                            return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v7,_v8)));
                                        }
                                        }
                                        }
                                        }
                                    }
                                    }
                                    }
                                    }
                                }
                                }
                                }
                                }
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v7,_v8)));
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v7,_v8)));
                        }
                        }
                  }
                });
              ESLVal paths = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v9 = $qualArg;
                      
                      switch(_v9.termName) {
                      case "CabDisplay": {ESLVal $25 = _v9.termRef(0);
                        ESLVal $24 = _v9.termRef(1);
                        ESLVal $23 = _v9.termRef(2);
                        ESLVal $22 = _v9.termRef(3);
                        ESLVal $21 = _v9.termRef(4);
                        
                        if($21.isCons())
                        {ESLVal $26 = $21.head();
                          ESLVal $27 = $21.tail();
                          
                          if($27.isCons())
                          {ESLVal $28 = $27.head();
                            ESLVal $29 = $27.tail();
                            
                            {ESLVal _0 = _v9;
                            
                            return ESLVal.list();
                          }
                          }
                        else if($27.isNil())
                          {ESLVal cx = $25;
                            
                            {ESLVal cy = $24;
                            
                            {ESLVal d = $23;
                            
                            {ESLVal f = $22;
                            
                            {ESLVal l1 = $26;
                            
                            return ESLVal.list(new java.util.function.Function<ESLVal,ESLVal>() {
                              public ESLVal apply(ESLVal $l0) {
                                ESLVal $a = $nil;
                                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                                while(!$l0.isNil()) { 
                                  ESLVal l = $l0.head();
                                  $l0 = $l0.tail();
                                  $v.add(l);
                                }
                                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                                return $a;
                              }}.apply(path.apply(new ESLVal("Loc",cx,cy),l1)));
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal _0 = _v9;
                            
                            return ESLVal.list();
                          }
                        }
                      else if($21.isNil())
                        {ESLVal _0 = _v9;
                          
                          return ESLVal.list();
                        }
                      else {ESLVal _0 = _v9;
                          
                          return ESLVal.list();
                        }
                      }
                      default: {ESLVal _0 = _v9;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(display).flatten().flatten().add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v10 = $qualArg;
                      
                      switch(_v10.termName) {
                      case "CabDisplay": {ESLVal $34 = _v10.termRef(0);
                        ESLVal $33 = _v10.termRef(1);
                        ESLVal $32 = _v10.termRef(2);
                        ESLVal $31 = _v10.termRef(3);
                        ESLVal $30 = _v10.termRef(4);
                        
                        if($30.isCons())
                        {ESLVal $35 = $30.head();
                          ESLVal $36 = $30.tail();
                          
                          if($36.isCons())
                          {ESLVal $37 = $36.head();
                            ESLVal $38 = $36.tail();
                            
                            if($38.isCons())
                            {ESLVal $39 = $38.head();
                              ESLVal $40 = $38.tail();
                              
                              {ESLVal _0 = _v10;
                              
                              return ESLVal.list();
                            }
                            }
                          else if($38.isNil())
                            {ESLVal cx = $34;
                              
                              {ESLVal cy = $33;
                              
                              {ESLVal d = $32;
                              
                              {ESLVal f = $31;
                              
                              {ESLVal l1 = $35;
                              
                              {ESLVal l2 = $37;
                              
                              return ESLVal.list(new java.util.function.Function<ESLVal,ESLVal>() {
                                public ESLVal apply(ESLVal $l0) {
                                  ESLVal $a = $nil;
                                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                                  while(!$l0.isNil()) { 
                                    ESLVal l = $l0.head();
                                    $l0 = $l0.tail();
                                    $v.add(l);
                                  }
                                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                                  return $a;
                                }}.apply(path.apply(new ESLVal("Loc",cx,cy),l1).add(path.apply(l1,l2))));
                            }
                            }
                            }
                            }
                            }
                            }
                          else {ESLVal _0 = _v10;
                              
                              return ESLVal.list();
                            }
                          }
                        else if($36.isNil())
                          {ESLVal _0 = _v10;
                            
                            return ESLVal.list();
                          }
                        else {ESLVal _0 = _v10;
                            
                            return ESLVal.list();
                          }
                        }
                      else if($30.isNil())
                        {ESLVal _0 = _v10;
                          
                          return ESLVal.list();
                        }
                      else {ESLVal _0 = _v10;
                          
                          return ESLVal.list();
                        }
                      }
                      default: {ESLVal _0 = _v10;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(display).flatten().flatten());
              ESLVal getDisplay = new ESLVal(new Function(new ESLVal("getDisplay"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal x = $args[0];
                ESLVal y = $args[1];
                {ESLVal at = new ESLVal(new Function(new ESLVal("at"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal d = $args[0];
                        {ESLVal _v11 = d;
                              
                              switch(_v11.termName) {
                              case "CabDisplay": {ESLVal $45 = _v11.termRef(0);
                                ESLVal $44 = _v11.termRef(1);
                                ESLVal $43 = _v11.termRef(2);
                                ESLVal $42 = _v11.termRef(3);
                                ESLVal $41 = _v11.termRef(4);
                                
                                {ESLVal dx = $45;
                                
                                {ESLVal dy = $44;
                                
                                {ESLVal _v24 = $43;
                                
                                {ESLVal f = $42;
                                
                                {ESLVal p = $41;
                                
                                return dx.eql(x).and(dy.eql(y));
                              }
                              }
                              }
                              }
                              }
                              }
                              default: {ESLVal _v25 = _v11;
                                
                                return $false;
                              }
                            }
                            }
                          }
                        });
                      
                      {ESLVal d = select1.apply(display,$null,at);
                      
                      if(d.eql($null).boolVal)
                      if(member.apply(new ESLVal("Loc",x,y),jobs).boolVal)
                        return customer;
                        else
                          if(member.apply(new ESLVal("Loc",x,y),targets).boolVal)
                            return target;
                            else
                              if(member.apply(new ESLVal("DLoc",x,y,new ESLVal("North",new ESLVal[]{})),paths).boolVal)
                                return upArrow;
                                else
                                  if(member.apply(new ESLVal("DLoc",x,y,new ESLVal("South",new ESLVal[]{})),paths).boolVal)
                                    return downArrow;
                                    else
                                      if(member.apply(new ESLVal("DLoc",x,y,new ESLVal("East",new ESLVal[]{})),paths).boolVal)
                                        return rightArrow;
                                        else
                                          if(member.apply(new ESLVal("DLoc",x,y,new ESLVal("West",new ESLVal[]{})),paths).boolVal)
                                            return leftArrow;
                                            else
                                              return space;
                      else
                        {ESLVal _v12 = d;
                          
                          switch(_v12.termName) {
                          case "CabDisplay": {ESLVal $50 = _v12.termRef(0);
                            ESLVal $49 = _v12.termRef(1);
                            ESLVal $48 = _v12.termRef(2);
                            ESLVal $47 = _v12.termRef(3);
                            ESLVal $46 = _v12.termRef(4);
                            
                            switch($48.termName) {
                            case "North": {
                              {ESLVal _v32 = $50;
                              
                              {ESLVal _v33 = $49;
                              
                              {ESLVal b = $47;
                              
                              {ESLVal p = $46;
                              
                              return frontTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "East": {
                              {ESLVal _v30 = $50;
                              
                              {ESLVal _v31 = $49;
                              
                              {ESLVal b = $47;
                              
                              {ESLVal p = $46;
                              
                              return sideTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "West": {
                              {ESLVal _v28 = $50;
                              
                              {ESLVal _v29 = $49;
                              
                              {ESLVal b = $47;
                              
                              {ESLVal p = $46;
                              
                              return sideTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "South": {
                              {ESLVal _v26 = $50;
                              
                              {ESLVal _v27 = $49;
                              
                              {ESLVal b = $47;
                              
                              {ESLVal p = $46;
                              
                              return frontTaxi;
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(5850,6086)").add(ESLVal.list(_v12)));
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(5850,6086)").add(ESLVal.list(_v12)));
                        }
                        }
                    }
                    }
                  }
                });
              
              public ESLVal get(String name) {
                switch(name) {
                  case "path": return path;
                  
                  case "paths": return paths;
                  
                  case "getDisplay": return getDisplay;
                  
                  default: throw new Error("cannot find letrec binding");
                }
                }
              };
            ESLVal path = letrec.get("path");
            
            ESLVal paths = letrec.get("paths");
            
            ESLVal getDisplay = letrec.get("getDisplay");
            
              return Lib.send(edb,"Show",new ESLVal("Uber"),new ESLVal("Table",tableProps,new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal row = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(new ESLVal("Row",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
                public ESLVal apply(ESLVal $l0) {
                  ESLVal $a = $nil;
                  java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                  while(!$l0.isNil()) { 
                    ESLVal col = $l0.head();
                    $l0 = $l0.tail();
                    $v.add(new ESLVal("Data",rowProps,getDisplay.apply(col,row)));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply($zero.to(width))));
                  }
                  for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                  return $a;
                }}.apply($zero.to(height))));}
            
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal uberBehaviour = new ESLVal(new Function(new ESLVal("uberBehaviour"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal width = $args[0];
  ESLVal height = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("uberBehaviour")) {
          ESLVal maxJobs = new ESLVal(2);
          ESLVal pending = ESLVal.list();
          ESLVal jobs = ESLVal.list();
          ESLVal customers = ESLVal.list();
          ESLVal targets = ESLVal.list();
          ESLVal screen = newActor(screenBehaviour,new ESLVal(new Actor()),width,height);
          ESLVal display = newTable();
          ESLVal movedCabs = ESLVal.list();
          ESLVal checkJobs = new ESLVal(new Function(new ESLVal("checkJobs"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(pending.neql(ESLVal.list()).and(jobs.neql(ESLVal.list())).boolVal)
                  return allocateJob.apply();
                  else
                    return $null;
              }
            });
          ESLVal allocateJob = new ESLVal(new Function(new ESLVal("allocateJob"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal _v13 = head.apply(jobs);
                  
                  switch(_v13.termName) {
                  case "Job": {ESLVal $54 = _v13.termRef(0);
                    ESLVal $53 = _v13.termRef(1);
                    ESLVal $52 = _v13.termRef(2);
                    ESLVal $51 = _v13.termRef(3);
                    
                    {ESLVal xStart = $54;
                    
                    {ESLVal yStart = $53;
                    
                    {ESLVal xEnd = $52;
                    
                    {ESLVal yEnd = $51;
                    
                    {Lib.send(head.apply(pending),"Customer",xStart,yStart,xEnd,yEnd);
                  pending = tail.apply(pending);
                  {jobs = tail.apply(jobs);
                  return $null;}}
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(6777,6990)").add(ESLVal.list(_v13)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v14 = $m;
            
            switch(_v14.termName) {
            case "Start": {ESLVal $61 = _v14.termRef(0);
              ESLVal $60 = _v14.termRef(1);
              ESLVal $59 = _v14.termRef(2);
              
              {ESLVal c = $61;
              
              {ESLVal t = $60;
              
              {ESLVal s = $59;
              
              {((Supplier<ESLVal>)() -> { 
              {ESLVal _v19 = s;
                
                switch(_v19.termName) {
                case "Empty": {ESLVal $85 = _v19.termRef(0);
                  ESLVal $84 = _v19.termRef(1);
                  ESLVal $83 = _v19.termRef(2);
                  
                  switch($85.termName) {
                  case "Loc": {ESLVal $87 = $85.termRef(0);
                    ESLVal $86 = $85.termRef(1);
                    
                    {ESLVal x = $87;
                    
                    {ESLVal y = $86;
                    
                    {ESLVal d = $84;
                    
                    {ESLVal p = $83;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$false,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7039,7124)").add(ESLVal.list(_v19)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7039,7124)").add(ESLVal.list(_v19)));
              }
              }
            }).get();
            Lib.send(screen,"Show",display.ref("vals"),customers,targets);
            pending = pending.add(ESLVal.list(c));
            return checkJobs.apply();}
            }
            }
            }
            }
          case "Transition": {ESLVal $58 = _v14.termRef(0);
              ESLVal $57 = _v14.termRef(1);
              ESLVal $56 = _v14.termRef(2);
              ESLVal $55 = _v14.termRef(3);
              
              {ESLVal c = $58;
              
              {ESLVal t = $57;
              
              {ESLVal m = $56;
              
              {ESLVal s = $55;
              
              {((Supplier<ESLVal>)() -> { 
              {ESLVal _v15 = s;
                
                switch(_v15.termName) {
                case "Empty": {ESLVal $69 = _v15.termRef(0);
                  ESLVal $68 = _v15.termRef(1);
                  ESLVal $67 = _v15.termRef(2);
                  
                  switch($69.termName) {
                  case "Loc": {ESLVal $71 = $69.termRef(0);
                    ESLVal $70 = $69.termRef(1);
                    
                    {ESLVal x = $71;
                    
                    {ESLVal y = $70;
                    
                    {ESLVal d = $68;
                    
                    {ESLVal p = $67;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$false,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7292,7447)").add(ESLVal.list(_v15)));
                }
                }
              case "Full": {ESLVal $64 = _v15.termRef(0);
                  ESLVal $63 = _v15.termRef(1);
                  ESLVal $62 = _v15.termRef(2);
                  
                  switch($64.termName) {
                  case "Loc": {ESLVal $66 = $64.termRef(0);
                    ESLVal $65 = $64.termRef(1);
                    
                    {ESLVal x = $66;
                    
                    {ESLVal y = $65;
                    
                    {ESLVal d = $63;
                    
                    {ESLVal p = $62;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$true,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7292,7447)").add(ESLVal.list(_v15)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7292,7447)").add(ESLVal.list(_v15)));
              }
              }
            }).get();
            {ESLVal _v16 = m;
              
              switch(_v16.termName) {
              case "Pickup": {
                {ESLVal _v18 = s;
                
                switch(_v18.termName) {
                case "Full": {ESLVal $80 = _v18.termRef(0);
                  ESLVal $79 = _v18.termRef(1);
                  ESLVal $78 = _v18.termRef(2);
                  
                  switch($80.termName) {
                  case "Loc": {ESLVal $82 = $80.termRef(0);
                    ESLVal $81 = $80.termRef(1);
                    
                    {ESLVal x = $82;
                    
                    {ESLVal y = $81;
                    
                    {ESLVal d = $79;
                    
                    {ESLVal p = $78;
                    
                    {customers = remove.apply(new ESLVal("Loc",x,y),customers);
                  return $null;}
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7487,7583)").add(ESLVal.list(_v18)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7487,7583)").add(ESLVal.list(_v18)));
              }
              }
              }
            case "DropOff": {
                {((Supplier<ESLVal>)() -> { 
                {ESLVal _v17 = s;
                  
                  switch(_v17.termName) {
                  case "Empty": {ESLVal $75 = _v17.termRef(0);
                    ESLVal $74 = _v17.termRef(1);
                    ESLVal $73 = _v17.termRef(2);
                    
                    switch($75.termName) {
                    case "Loc": {ESLVal $77 = $75.termRef(0);
                      ESLVal $76 = $75.termRef(1);
                      
                      {ESLVal x = $77;
                      
                      {ESLVal y = $76;
                      
                      {ESLVal d = $74;
                      
                      {ESLVal p = $73;
                      
                      {targets = remove.apply(new ESLVal("Loc",x,y),targets);
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(7619,7712)").add(ESLVal.list(_v17)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7619,7712)").add(ESLVal.list(_v17)));
                }
                }
              }).get();
              pending = pending.add(ESLVal.list(c));
              return checkJobs.apply();}
              }
            case "ChangeDir": {ESLVal $72 = _v16.termRef(0);
                
                {ESLVal d = $72;
                
                return $null;
              }
              }
              default: {ESLVal _v23 = _v16;
                
                if(member.apply(c,movedCabs).boolVal)
                {movedCabs = ESLVal.list();
                return Lib.send(screen,"Show",display.ref("vals"),customers,targets);}
                else
                  {movedCabs = movedCabs.cons(c);
                  return $null;}
              }
            }
            }}
            }
            }
            }
            }
            }
          case "NewJob": {
              if(length.apply(jobs).less(maxJobs).boolVal)
              {ESLVal xStart = random.apply(width);
                ESLVal yStart = random.apply(height);
                ESLVal xEnd = random.apply(width);
                ESLVal yEnd = random.apply(height);
                
                {customers = customers.add(ESLVal.list(new ESLVal("Loc",xStart,yStart)));
              targets = targets.add(ESLVal.list(new ESLVal("Loc",xEnd,yEnd)));
              jobs = jobs.add(ESLVal.list(new ESLVal("Job",xStart,yStart,xEnd,yEnd)));
              return checkJobs.apply();}
              }
              else
                return $null;
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v14)));
          }
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          ESLVal noOfCabs = new ESLVal(2);
          ESLVal width = new ESLVal(10);
          ESLVal height = new ESLVal(10);
          ESLVal uber = newActor(uberBehaviour,new ESLVal(new Actor()),width,height);
          ESLVal cabs = new java.util.function.Function<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal n = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(newActor(cab,new ESLVal(new Actor()),random.apply(width),random.apply(height)));
                }
                for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                return $a;
              }}.apply($zero.to(noOfCabs));
          ESLVal limit = new ESLVal(40000);
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v21 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v21)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.less(limit).boolVal)
            probably(new ESLVal(5),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return Lib.send(uber,"NewJob");
              }
            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return $null;
              }
            }));
            else
              {ESLVal _v22 = $t;
                
                if($true.boolVal)
                stopAll.apply();
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {{
                  ESLVal _v20 = cabs;
                  while(_v20.isCons()) {
                    ESLVal c = _v20.headVal;
                    c.ref("addObserver").apply(uber);
                    _v20 = _v20.tailVal;}
                }
                return $null;}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}