package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
// import static esl.Lists.*;
public class Uber {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal cab = new ESLVal(new Function(new ESLVal("cab"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x0 = $args[0];
  ESLVal y0 = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("cab")) {
          ESLVal observeState() {
    
    if(isEmpty.boolVal)
      return new ESLVal("Empty",new ESLVal("Loc",x,y),direction,plan);
      else
        return new ESLVal("Full",new ESLVal("Loc",x,y),direction,plan);
  }
  ESLVal observeState = new ESLVal(new Function(new ESLVal("observeState"),null) { public ESLVal apply(ESLVal... args) { return observeState(); }});
  ESLVal observeMessage(ESLVal m) {
    
    {ESLVal _v493 = m;
      
      switch(_v493.termName) {
      case "ChangeDir": {ESLVal $620 = _v493.termRef(0);
        
        {ESLVal d = $620;
        
        return new ESLVal("Something",m);
      }
      }
    case "MoveDir": {ESLVal $619 = _v493.termRef(0);
        
        {ESLVal d = $619;
        
        return new ESLVal("Something",m);
      }
      }
    case "Pickup": {
        return new ESLVal("Something",m);
      }
    case "DropOff": {
        return new ESLVal("Something",m);
      }
      default: {ESLVal _v538 = _v493;
        
        return new ESLVal("Nothing",new ESLVal[]{});
      }
    }
    }
  }
  ESLVal observeMessage = new ESLVal(new Function(new ESLVal("observeMessage"),null) { public ESLVal apply(ESLVal... args) { return observeMessage(args[0]); }});
ESLVal x = x0;
          ESLVal y = y0;
          ESLVal direction = new ESLVal("North",new ESLVal[]{});
          ESLVal plan = $nil;
          ESLVal isEmpty = $true;
          ESLVal $observers = $nil;
          ESLVal addObserver = new ESLVal(new Function(new ESLVal("addObserver"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal o = $args[0];
            {$observers = $observers.cons(o);
                return Lib.send(o,"Start",getSelf(),now(),observeState());}
              }
            });
          
          public ESLVal handle(ESLVal $m) {{new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal _v494 = $m;
              
              switch(_v494.termName) {
              case "Customer": {ESLVal $626 = _v494.termRef(0);
                ESLVal $625 = _v494.termRef(1);
                ESLVal $624 = _v494.termRef(2);
                ESLVal $623 = _v494.termRef(3);
                
                {ESLVal xStart = $626;
                
                {ESLVal yStart = $625;
                
                {ESLVal xEnd = $624;
                
                {ESLVal yEnd = $623;
                
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
                {ESLVal _v495 = plan;
                
                if(_v495.isCons())
                {ESLVal $627 = _v495.head();
                  ESLVal $628 = _v495.tail();
                  
                  switch($627.termName) {
                  case "Loc": {ESLVal $630 = $627.termRef(0);
                    ESLVal $629 = $627.termRef(1);
                    
                    {ESLVal tx = $630;
                    
                    {ESLVal ty = $629;
                    
                    {ESLVal locs = $628;
                    
                    if(tx.eql(x).and(ty.eql(y).and(isEmpty)).boolVal)
                    {plan = locs;
                    Lib.send(getSelf(),"Pickup");
                    return Lib.send(getSelf(),"Move");}
                    else
                      {ESLVal _v539 = $630;
                        
                        {ESLVal _v540 = $629;
                        
                        {ESLVal _v541 = $628;
                        
                        if(_v539.eql(x).and(_v540.eql(y).and(isEmpty.not())).boolVal)
                        {plan = _v541;
                        Lib.send(getSelf(),"DropOff");
                        return Lib.send(getSelf(),"Move");}
                        else
                          {ESLVal _v542 = $630;
                            
                            {ESLVal _v543 = $629;
                            
                            {ESLVal _v544 = $628;
                            
                            if(x.gre(_v542).boolVal)
                            return Lib.send(getSelf(),"MoveDir",new ESLVal("West",new ESLVal[]{}));
                            else
                              {ESLVal _v545 = $630;
                                
                                {ESLVal _v546 = $629;
                                
                                {ESLVal _v547 = $628;
                                
                                if(x.less(_v545).boolVal)
                                return Lib.send(getSelf(),"MoveDir",new ESLVal("East",new ESLVal[]{}));
                                else
                                  {ESLVal _v548 = $630;
                                    
                                    {ESLVal _v549 = $629;
                                    
                                    {ESLVal _v550 = $628;
                                    
                                    if(y.gre(_v549).boolVal)
                                    return Lib.send(getSelf(),"MoveDir",new ESLVal("North",new ESLVal[]{}));
                                    else
                                      {ESLVal _v551 = $630;
                                        
                                        {ESLVal _v552 = $629;
                                        
                                        {ESLVal _v553 = $628;
                                        
                                        if(y.less(_v552).boolVal)
                                        return Lib.send(getSelf(),"MoveDir",new ESLVal("South",new ESLVal[]{}));
                                        else
                                          return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v495)));
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
                  default: return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v495)));
                }
                }
              else if(_v495.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(1813,2369)").add(ESLVal.list(_v495)));
              }
              }
            case "MoveDir": {ESLVal $622 = _v494.termRef(0);
                
                switch($622.termName) {
                case "North": {
                  if(direction.eql(new ESLVal("North",new ESLVal[]{})).boolVal)
                  {y = y.sub($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $622;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "South": {
                  if(direction.eql(new ESLVal("South",new ESLVal[]{})).boolVal)
                  {y = y.add($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $622;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "East": {
                  if(direction.eql(new ESLVal("East",new ESLVal[]{})).boolVal)
                  {x = x.add($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $622;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
              case "West": {
                  if(direction.eql(new ESLVal("West",new ESLVal[]{})).boolVal)
                  {x = x.sub($one);
                  return Lib.send(getSelf(),"Move");}
                  else
                    {ESLVal d = $622;
                      
                      {Lib.send(getSelf(),"ChangeDir",d);
                    return Lib.send(getSelf(),"MoveDir",d);}
                    }
                }
                default: {ESLVal d = $622;
                  
                  {Lib.send(getSelf(),"ChangeDir",d);
                return Lib.send(getSelf(),"MoveDir",d);}
                }
              }
              }
            case "ChangeDir": {ESLVal $621 = _v494.termRef(0);
                
                {ESLVal d = $621;
                
                {direction = d;
              return $null;}
              }
              }
              default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v494)));
            }
            }
          }}.get();
          {ESLVal $s = observeState();
            
            {{
            ESLVal _v496 = $observers;
            while(_v496.isCons()) {
              ESLVal $o = _v496.headVal;
              new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {ESLVal _v497 = observeMessage($m);
                  
                  switch(_v497.termName) {
                  case "Something": {ESLVal $631 = _v497.termRef(0);
                    
                    {ESLVal $x = $631;
                    
                    return Lib.send($o,"Transition",getSelf(),now(),$x,$s);
                  }
                  }
                case "Nothing": {
                    return $null;
                  }
                  default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v497)));
                }
                }
              }}.get();
              _v496 = _v496.tailVal;}
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v498 = $m;
            
            switch(_v498.termName) {
            case "Show": {ESLVal $634 = _v498.termRef(0);
              ESLVal $633 = _v498.termRef(1);
              ESLVal $632 = _v498.termRef(2);
              
              {ESLVal display = $634;
              
              {ESLVal jobs = $633;
              
              {ESLVal targets = $632;
              
              { LetRec letrec = new LetRec() {
              ESLVal path = new ESLVal(new Function(new ESLVal("path"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal p1 = $args[0];
                ESLVal p2 = $args[1];
                if(p1.eql(p2).boolVal)
                      return $nil;
                      else
                        {ESLVal _v499 = p1;
                          ESLVal _v500 = p2;
                          
                          switch(_v499.termName) {
                          case "Loc": {ESLVal $636 = _v499.termRef(0);
                            ESLVal $635 = _v499.termRef(1);
                            
                            switch(_v500.termName) {
                            case "Loc": {ESLVal $638 = _v500.termRef(0);
                              ESLVal $637 = _v500.termRef(1);
                              
                              {ESLVal x1 = $636;
                              
                              {ESLVal y1 = $635;
                              
                              {ESLVal x2 = $638;
                              
                              {ESLVal y2 = $637;
                              
                              if(x1.eql(x2).and(y1.less(y2)).boolVal)
                              return path.apply(new ESLVal("Loc",x1,y1.add($one)),p2).cons(new ESLVal("DLoc",x1,y1,new ESLVal("South",new ESLVal[]{})));
                              else
                                {ESLVal _v526 = $636;
                                  
                                  {ESLVal _v527 = $635;
                                  
                                  {ESLVal _v528 = $638;
                                  
                                  {ESLVal _v529 = $637;
                                  
                                  if(_v526.eql(_v528).and(_v527.gre(_v529)).boolVal)
                                  return path.apply(new ESLVal("Loc",_v526,_v527.sub($one)),p2).cons(new ESLVal("DLoc",_v526,_v527,new ESLVal("North",new ESLVal[]{})));
                                  else
                                    {ESLVal _v530 = $636;
                                      
                                      {ESLVal _v531 = $635;
                                      
                                      {ESLVal _v532 = $638;
                                      
                                      {ESLVal _v533 = $637;
                                      
                                      if(_v530.less(_v532).boolVal)
                                      return path.apply(new ESLVal("Loc",_v530.add($one),_v531),p2).cons(new ESLVal("DLoc",_v530,_v531,new ESLVal("East",new ESLVal[]{})));
                                      else
                                        {ESLVal _v534 = $636;
                                          
                                          {ESLVal _v535 = $635;
                                          
                                          {ESLVal _v536 = $638;
                                          
                                          {ESLVal _v537 = $637;
                                          
                                          if(_v534.gre(_v536).boolVal)
                                          return path.apply(new ESLVal("Loc",_v534.sub($one),_v535),p2).cons(new ESLVal("DLoc",_v534,_v535,new ESLVal("West",new ESLVal[]{})));
                                          else
                                            return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v499,_v500)));
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
                            default: return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v499,_v500)));
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(4141,4551)").add(ESLVal.list(_v499,_v500)));
                        }
                        }
                  }
                });
              ESLVal paths = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v501 = $qualArg;
                      
                      switch(_v501.termName) {
                      case "CabDisplay": {ESLVal $643 = _v501.termRef(0);
                        ESLVal $642 = _v501.termRef(1);
                        ESLVal $641 = _v501.termRef(2);
                        ESLVal $640 = _v501.termRef(3);
                        ESLVal $639 = _v501.termRef(4);
                        
                        if($639.isCons())
                        {ESLVal $644 = $639.head();
                          ESLVal $645 = $639.tail();
                          
                          if($645.isCons())
                          {ESLVal $646 = $645.head();
                            ESLVal $647 = $645.tail();
                            
                            {ESLVal _0 = _v501;
                            
                            return $nil;
                          }
                          }
                        else if($645.isNil())
                          {ESLVal cx = $643;
                            
                            {ESLVal cy = $642;
                            
                            {ESLVal d = $641;
                            
                            {ESLVal f = $640;
                            
                            {ESLVal l1 = $644;
                            
                            return ESLVal.list(new SerializableFunction<ESLVal,ESLVal>() {
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
                        else {ESLVal _0 = _v501;
                            
                            return $nil;
                          }
                        }
                      else if($639.isNil())
                        {ESLVal _0 = _v501;
                          
                          return $nil;
                        }
                      else {ESLVal _0 = _v501;
                          
                          return $nil;
                        }
                      }
                      default: {ESLVal _0 = _v501;
                        
                        return $nil;
                      }
                    }
                    }
                  }
                }).map(display).flatten().flatten().add(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v502 = $qualArg;
                      
                      switch(_v502.termName) {
                      case "CabDisplay": {ESLVal $652 = _v502.termRef(0);
                        ESLVal $651 = _v502.termRef(1);
                        ESLVal $650 = _v502.termRef(2);
                        ESLVal $649 = _v502.termRef(3);
                        ESLVal $648 = _v502.termRef(4);
                        
                        if($648.isCons())
                        {ESLVal $653 = $648.head();
                          ESLVal $654 = $648.tail();
                          
                          if($654.isCons())
                          {ESLVal $655 = $654.head();
                            ESLVal $656 = $654.tail();
                            
                            if($656.isCons())
                            {ESLVal $657 = $656.head();
                              ESLVal $658 = $656.tail();
                              
                              {ESLVal _0 = _v502;
                              
                              return $nil;
                            }
                            }
                          else if($656.isNil())
                            {ESLVal cx = $652;
                              
                              {ESLVal cy = $651;
                              
                              {ESLVal d = $650;
                              
                              {ESLVal f = $649;
                              
                              {ESLVal l1 = $653;
                              
                              {ESLVal l2 = $655;
                              
                              return ESLVal.list(new SerializableFunction<ESLVal,ESLVal>() {
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
                          else {ESLVal _0 = _v502;
                              
                              return $nil;
                            }
                          }
                        else if($654.isNil())
                          {ESLVal _0 = _v502;
                            
                            return $nil;
                          }
                        else {ESLVal _0 = _v502;
                            
                            return $nil;
                          }
                        }
                      else if($648.isNil())
                        {ESLVal _0 = _v502;
                          
                          return $nil;
                        }
                      else {ESLVal _0 = _v502;
                          
                          return $nil;
                        }
                      }
                      default: {ESLVal _0 = _v502;
                        
                        return $nil;
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
                        {ESLVal _v503 = d;
                              
                              switch(_v503.termName) {
                              case "CabDisplay": {ESLVal $663 = _v503.termRef(0);
                                ESLVal $662 = _v503.termRef(1);
                                ESLVal $661 = _v503.termRef(2);
                                ESLVal $660 = _v503.termRef(3);
                                ESLVal $659 = _v503.termRef(4);
                                
                                {ESLVal dx = $663;
                                
                                {ESLVal dy = $662;
                                
                                {ESLVal _v516 = $661;
                                
                                {ESLVal f = $660;
                                
                                {ESLVal p = $659;
                                
                                return dx.eql(x).and(dy.eql(y));
                              }
                              }
                              }
                              }
                              }
                              }
                              default: {ESLVal _v517 = _v503;
                                
                                return $false;
                              }
                            }
                            }
                          }
                        });
                      
                      {ESLVal d = select1(display,$null,at);
                      
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
                        {ESLVal _v504 = d;
                          
                          switch(_v504.termName) {
                          case "CabDisplay": {ESLVal $668 = _v504.termRef(0);
                            ESLVal $667 = _v504.termRef(1);
                            ESLVal $666 = _v504.termRef(2);
                            ESLVal $665 = _v504.termRef(3);
                            ESLVal $664 = _v504.termRef(4);
                            
                            switch($666.termName) {
                            case "North": {
                              {ESLVal _v524 = $668;
                              
                              {ESLVal _v525 = $667;
                              
                              {ESLVal b = $665;
                              
                              {ESLVal p = $664;
                              
                              return frontTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "East": {
                              {ESLVal _v522 = $668;
                              
                              {ESLVal _v523 = $667;
                              
                              {ESLVal b = $665;
                              
                              {ESLVal p = $664;
                              
                              return sideTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "West": {
                              {ESLVal _v520 = $668;
                              
                              {ESLVal _v521 = $667;
                              
                              {ESLVal b = $665;
                              
                              {ESLVal p = $664;
                              
                              return sideTaxi;
                            }
                            }
                            }
                            }
                            }
                          case "South": {
                              {ESLVal _v518 = $668;
                              
                              {ESLVal _v519 = $667;
                              
                              {ESLVal b = $665;
                              
                              {ESLVal p = $664;
                              
                              return frontTaxi;
                            }
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(5850,6086)").add(ESLVal.list(_v504)));
                          }
                          }
                          default: return error(new ESLVal("case error at Pos(5850,6086)").add(ESLVal.list(_v504)));
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
            
              {Lib.send(edb,"Show",new ESLVal("Uber"),new ESLVal("Table",tableProps,new SerializableFunction<ESLVal,ESLVal>() {
              public ESLVal apply(ESLVal $l0) {
                ESLVal $a = $nil;
                java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                while(!$l0.isNil()) { 
                  ESLVal row = $l0.head();
                  $l0 = $l0.tail();
                  $v.add(new ESLVal("Row",$nil,new SerializableFunction<ESLVal,ESLVal>() {
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
              }}.apply($zero.to(height))));
            return wait.apply(new ESLVal(300));}}
            
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v498)));
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
          ESLVal checkJobs() {
    
    if(pending.neql($nil).and(jobs.neql($nil)).boolVal)
      return allocateJob();
      else
        return $null;
  }
  ESLVal checkJobs = new ESLVal(new Function(new ESLVal("checkJobs"),null) { public ESLVal apply(ESLVal... args) { return checkJobs(); }});
  ESLVal allocateJob() {
    
    {ESLVal _v505 = head.apply(jobs);
      
      switch(_v505.termName) {
      case "Job": {ESLVal $672 = _v505.termRef(0);
        ESLVal $671 = _v505.termRef(1);
        ESLVal $670 = _v505.termRef(2);
        ESLVal $669 = _v505.termRef(3);
        
        {ESLVal xStart = $672;
        
        {ESLVal yStart = $671;
        
        {ESLVal xEnd = $670;
        
        {ESLVal yEnd = $669;
        
        {Lib.send(head.apply(pending),"Customer",xStart,yStart,xEnd,yEnd);
      pending = tail.apply(pending);
      {jobs = tail.apply(jobs);
      return $null;}}
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(6809,7022)").add(ESLVal.list(_v505)));
    }
    }
  }
  ESLVal allocateJob = new ESLVal(new Function(new ESLVal("allocateJob"),null) { public ESLVal apply(ESLVal... args) { return allocateJob(); }});
ESLVal maxJobs = new ESLVal(2);
          ESLVal pending = $nil;
          ESLVal jobs = $nil;
          ESLVal customers = $nil;
          ESLVal targets = $nil;
          ESLVal screen = newActor(screenBehaviour,new ESLVal(new Actor()),width,height);
          ESLVal display = newTable();
          ESLVal movedCabs = $nil;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v506 = $m;
            
            switch(_v506.termName) {
            case "Start": {ESLVal $679 = _v506.termRef(0);
              ESLVal $678 = _v506.termRef(1);
              ESLVal $677 = _v506.termRef(2);
              
              {ESLVal c = $679;
              
              {ESLVal t = $678;
              
              {ESLVal s = $677;
              
              {new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal _v511 = s;
                
                switch(_v511.termName) {
                case "Empty": {ESLVal $703 = _v511.termRef(0);
                  ESLVal $702 = _v511.termRef(1);
                  ESLVal $701 = _v511.termRef(2);
                  
                  switch($703.termName) {
                  case "Loc": {ESLVal $705 = $703.termRef(0);
                    ESLVal $704 = $703.termRef(1);
                    
                    {ESLVal x = $705;
                    
                    {ESLVal y = $704;
                    
                    {ESLVal d = $702;
                    
                    {ESLVal p = $701;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$false,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7071,7156)").add(ESLVal.list(_v511)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7071,7156)").add(ESLVal.list(_v511)));
              }
              }
            }}.get();
            Lib.send(screen,"Show",display.ref("vals"),customers,targets);
            pending = pending.add(ESLVal.list(c));
            return checkJobs();}
            }
            }
            }
            }
          case "Transition": {ESLVal $676 = _v506.termRef(0);
              ESLVal $675 = _v506.termRef(1);
              ESLVal $674 = _v506.termRef(2);
              ESLVal $673 = _v506.termRef(3);
              
              {ESLVal c = $676;
              
              {ESLVal t = $675;
              
              {ESLVal m = $674;
              
              {ESLVal s = $673;
              
              {new SerializableSupplier<ESLVal>() { public ESLVal get() { 
              {ESLVal _v507 = s;
                
                switch(_v507.termName) {
                case "Empty": {ESLVal $687 = _v507.termRef(0);
                  ESLVal $686 = _v507.termRef(1);
                  ESLVal $685 = _v507.termRef(2);
                  
                  switch($687.termName) {
                  case "Loc": {ESLVal $689 = $687.termRef(0);
                    ESLVal $688 = $687.termRef(1);
                    
                    {ESLVal x = $689;
                    
                    {ESLVal y = $688;
                    
                    {ESLVal d = $686;
                    
                    {ESLVal p = $685;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$false,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7324,7479)").add(ESLVal.list(_v507)));
                }
                }
              case "Full": {ESLVal $682 = _v507.termRef(0);
                  ESLVal $681 = _v507.termRef(1);
                  ESLVal $680 = _v507.termRef(2);
                  
                  switch($682.termName) {
                  case "Loc": {ESLVal $684 = $682.termRef(0);
                    ESLVal $683 = $682.termRef(1);
                    
                    {ESLVal x = $684;
                    
                    {ESLVal y = $683;
                    
                    {ESLVal d = $681;
                    
                    {ESLVal p = $680;
                    
                    return display.ref("put").apply(c,new ESLVal("CabDisplay",x,y,d,$true,p));
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7324,7479)").add(ESLVal.list(_v507)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7324,7479)").add(ESLVal.list(_v507)));
              }
              }
            }}.get();
            {ESLVal _v508 = m;
              
              switch(_v508.termName) {
              case "Pickup": {
                {ESLVal _v510 = s;
                
                switch(_v510.termName) {
                case "Full": {ESLVal $698 = _v510.termRef(0);
                  ESLVal $697 = _v510.termRef(1);
                  ESLVal $696 = _v510.termRef(2);
                  
                  switch($698.termName) {
                  case "Loc": {ESLVal $700 = $698.termRef(0);
                    ESLVal $699 = $698.termRef(1);
                    
                    {ESLVal x = $700;
                    
                    {ESLVal y = $699;
                    
                    {ESLVal d = $697;
                    
                    {ESLVal p = $696;
                    
                    {customers = remove.apply(new ESLVal("Loc",x,y),customers);
                  return $null;}
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7519,7615)").add(ESLVal.list(_v510)));
                }
                }
                default: return error(new ESLVal("case error at Pos(7519,7615)").add(ESLVal.list(_v510)));
              }
              }
              }
            case "DropOff": {
                {new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {ESLVal _v509 = s;
                  
                  switch(_v509.termName) {
                  case "Empty": {ESLVal $693 = _v509.termRef(0);
                    ESLVal $692 = _v509.termRef(1);
                    ESLVal $691 = _v509.termRef(2);
                    
                    switch($693.termName) {
                    case "Loc": {ESLVal $695 = $693.termRef(0);
                      ESLVal $694 = $693.termRef(1);
                      
                      {ESLVal x = $695;
                      
                      {ESLVal y = $694;
                      
                      {ESLVal d = $692;
                      
                      {ESLVal p = $691;
                      
                      {targets = remove.apply(new ESLVal("Loc",x,y),targets);
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(7651,7744)").add(ESLVal.list(_v509)));
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(7651,7744)").add(ESLVal.list(_v509)));
                }
                }
              }}.get();
              pending = pending.add(ESLVal.list(c));
              return checkJobs();}
              }
            case "ChangeDir": {ESLVal $690 = _v508.termRef(0);
                
                {ESLVal d = $690;
                
                return $null;
              }
              }
              default: {ESLVal _v515 = _v508;
                
                if(member.apply(c,movedCabs).boolVal)
                {movedCabs = $nil;
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
              return checkJobs();}
              }
              else
                return $null;
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v506)));
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
          ESLVal cabs = new SerializableFunction<ESLVal,ESLVal>() {
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
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v513 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v513)));
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
              {ESLVal _v514 = $t;
                
                if($true.boolVal)
                stopAll.apply();
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                {{
                  ESLVal _v512 = cabs;
                  while(_v512.isCons()) {
                    ESLVal c = _v512.headVal;
                    c.ref("addObserver").apply(uber);
                    _v512 = _v512.tailVal;}
                }
                return $null;}
              }}.get();
          }
        });
    }
  });

public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}