package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Traffic {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal leftColour = new ESLVal("fill:green;stroke:green;");
  private static ESLVal rightColour = new ESLVal("fill:red;stroke:red;");
  private static ESLVal actionsToPictures = new ESLVal(new Function(new ESLVal("actionsToPictures"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal qLeft = $args[0];
  ESLVal qRight = $args[1];
  ESLVal startLeft = $args[2];
  ESLVal startRight = $args[3];
  ESLVal as = $args[4];
  {ESLVal _v12 = as;
        
        if(_v12.isCons())
        {ESLVal $13 = _v12.head();
          ESLVal $14 = _v12.tail();
          
          switch($13.termName) {
          case "ArriveLeft": {
            {ESLVal _v23 = $14;
            
            return actionsToPictures.apply(qLeft.add($one),qRight,startLeft,startRight,_v23).cons(picture.apply(qLeft.add($one),qRight,startLeft,startRight));
          }
          }
        case "ArriveRight": {
            {ESLVal _v22 = $14;
            
            return actionsToPictures.apply(qLeft,qRight.add($one),startLeft,startRight,_v22).cons(picture.apply(qLeft,qRight.add($one),startLeft,startRight));
          }
          }
        case "MoveLeft": {
            {ESLVal _v21 = $14;
            
            return movesRight.apply(startLeft.add($one),actionsToPictures.apply(qLeft.sub($one),qRight,startLeft.add($one),startRight,_v21).cons(picture.apply(qLeft.sub($one),qRight,startLeft.add($one),startRight)));
          }
          }
        case "MoveRight": {
            {ESLVal _v20 = $14;
            
            return movesLeft.apply(startRight.add($one),actionsToPictures.apply(qLeft,qRight.sub($one),startLeft,startRight.add($one),_v20).cons(picture.apply(qLeft,qRight.sub($one),startLeft,startRight.add($one))));
          }
          }
          default: return error(new ESLVal("case error at Pos(1330,1911)").add(ESLVal.list(_v12)));
        }
        }
      else if(_v12.isNil())
        return ESLVal.list();
      else return error(new ESLVal("case error at Pos(1330,1911)").add(ESLVal.list(_v12)));
      }
    }
  });
  private static ESLVal movesRight = new ESLVal(new Function(new ESLVal("movesRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  ESLVal ps = $args[1];
  return exitRight.apply($zero,label,tail.apply(ps)).cons(addCarAtNeckLeft.apply(label,head.apply(ps)));
    }
  });
  private static ESLVal movesLeft = new ESLVal(new Function(new ESLVal("movesLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  ESLVal ps = $args[1];
  return exitLeft.apply($zero,label,tail.apply(ps)).cons(addCarAtNeckRight.apply(label,head.apply(ps)));
    }
  });
  private static ESLVal exitRight = new ESLVal(new Function(new ESLVal("exitRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  ESLVal ds = $args[2];
  if(pos.eql(maxCarsWaiting).or(ds.eql(ESLVal.list())).boolVal)
        return ds;
        else
          return exitRight.apply(pos.add($one),label,tail.apply(ds)).cons(addCarOnRight.apply(pos,label,head.apply(ds)));
    }
  });
  private static ESLVal exitLeft = new ESLVal(new Function(new ESLVal("exitLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  ESLVal ds = $args[2];
  if(pos.eql(maxCarsWaiting).or(ds.eql(ESLVal.list())).boolVal)
        return ds;
        else
          return exitLeft.apply(pos.add($one),label,tail.apply(ds)).cons(addCarOnLeft.apply(pos,label,head.apply(ds)));
    }
  });
  private static ESLVal addCarOnRight = new ESLVal(new Function(new ESLVal("addCarOnRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  ESLVal d = $args[2];
  {ESLVal _v11 = d;
        
        switch(_v11.termName) {
        case "Picture": {ESLVal $12 = _v11.termRef(0);
          ESLVal $11 = _v11.termRef(1);
          ESLVal $10 = _v11.termRef(2);
          
          {ESLVal x = $12;
          
          {ESLVal y = $11;
          
          {ESLVal ps = $10;
          
          return new ESLVal("Picture",x,y,carOnRight.apply(pos,label).add(ps));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2650,2730)").add(ESLVal.list(_v11)));
      }
      }
    }
  });
  private static ESLVal addCarOnLeft = new ESLVal(new Function(new ESLVal("addCarOnLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  ESLVal d = $args[2];
  {ESLVal _v10 = d;
        
        switch(_v10.termName) {
        case "Picture": {ESLVal $9 = _v10.termRef(0);
          ESLVal $8 = _v10.termRef(1);
          ESLVal $7 = _v10.termRef(2);
          
          {ESLVal x = $9;
          
          {ESLVal y = $8;
          
          {ESLVal ps = $7;
          
          return new ESLVal("Picture",x,y,carOnLeft.apply(pos,label).add(ps));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2792,2871)").add(ESLVal.list(_v10)));
      }
      }
    }
  });
  private static ESLVal carOnRight = new ESLVal(new Function(new ESLVal("carOnRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.add(carSize.add(carSize.mul(pos))))),border.add(width.div(new ESLVal(4))),carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",border.add(waits.add(gapLength.add(carSize.add(carSize.mul(pos).sub(new ESLVal(5)))))),new ESLVal(5).add(border.add(width.div(new ESLVal(4)))),label.add(new ESLVal("")),new ESLVal("")));
    }
  });
  private static ESLVal carOnLeft = new ESLVal(new Function(new ESLVal("carOnLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal pos = $args[0];
  ESLVal label = $args[1];
  return ESLVal.list(new ESLVal("Circle",border.add(waits.sub(carSize.add(carSize.mul(pos)))),border.add(new ESLVal(3).mul(width.div(new ESLVal(4)))),carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",border.add(waits.sub(carSize.add(carSize.mul(pos)).add(new ESLVal(5)))),new ESLVal(5).add(border.add(new ESLVal(3).mul(width.div(new ESLVal(4))))),label.add(new ESLVal("")),new ESLVal("")));
    }
  });
  private static ESLVal addCarAtNeckLeft = new ESLVal(new Function(new ESLVal("addCarAtNeckLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v9 = d;
        
        switch(_v9.termName) {
        case "Picture": {ESLVal $6 = _v9.termRef(0);
          ESLVal $5 = _v9.termRef(1);
          ESLVal $4 = _v9.termRef(2);
          
          {ESLVal x = $6;
          
          {ESLVal y = $5;
          
          {ESLVal es = $4;
          
          return new ESLVal("Picture",x,y,neckCarLeft.apply(label).add(es));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3398,3475)").add(ESLVal.list(_v9)));
      }
      }
    }
  });
  private static ESLVal addCarAtNeckRight = new ESLVal(new Function(new ESLVal("addCarAtNeckRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  ESLVal d = $args[1];
  {ESLVal _v8 = d;
        
        switch(_v8.termName) {
        case "Picture": {ESLVal $3 = _v8.termRef(0);
          ESLVal $2 = _v8.termRef(1);
          ESLVal $1 = _v8.termRef(2);
          
          {ESLVal x = $3;
          
          {ESLVal y = $2;
          
          {ESLVal es = $1;
          
          return new ESLVal("Picture",x,y,neckCarRight.apply(label).add(es));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3533,3611)").add(ESLVal.list(_v8)));
      }
      }
    }
  });
  private static ESLVal carSize = new ESLVal(30);
  private static ESLVal carGap = new ESLVal(2);
  private static ESLVal maxCarsWaiting = new ESLVal(7);
  private static ESLVal width = new ESLVal(4).mul(carSize);
  private static ESLVal border = new ESLVal(50);
  private static ESLVal waits = carSize.add(carGap).mul(maxCarsWaiting);
  private static ESLVal neckLength = new ESLVal(100);
  private static ESLVal neckWidth = carSize.add(new ESLVal(10));
  private static ESLVal gapLength = new ESLVal(150);
  private static ESLVal gapWidth = new ESLVal(100);
  private static ESLVal leftCarY = border.add(width.div(new ESLVal(4)));
  private static ESLVal rightCarY = border.add(width.sub(width.div(new ESLVal(4))));
  private static ESLVal pWidth = new ESLVal(1500);
  private static ESLVal pHeight = new ESLVal(1000);
  private static ESLVal neckCarLeft = new ESLVal(new Function(new ESLVal("neckCarLeft"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.div(new ESLVal(2)))),border.add(width.div(new ESLVal(2))),carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",border.add(waits.add(gapLength.div(new ESLVal(2)).sub(new ESLVal(5)))),new ESLVal(5).add(border.add(width.div(new ESLVal(2)))),new ESLVal("").add(label),new ESLVal("")));
    }
  });
  private static ESLVal neckCarRight = new ESLVal(new Function(new ESLVal("neckCarRight"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal label = $args[0];
  return ESLVal.list(new ESLVal("Circle",border.add(waits.add(gapLength.div(new ESLVal(2)))),border.add(width.div(new ESLVal(2))),carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",border.add(waits.add(gapLength.div(new ESLVal(2)).sub(new ESLVal(5)))),new ESLVal(5).add(border.add(width.div(new ESLVal(2)))),new ESLVal("").add(label),new ESLVal("")));
    }
  });
  private static ESLVal leftTop = new ESLVal("Line",border,border,border.add(waits),border,new ESLVal("stroke:black;"));
  private static ESLVal leftBottom = new ESLVal("Line",border,border.add(width),border.add(waits),border.add(width),new ESLVal("stroke:black;"));
  private static ESLVal rightTop = new ESLVal("Line",border.add(waits.add(gapLength)),border,border.add(waits.add(gapLength.add(waits))),border,new ESLVal("stroke:black;"));
  private static ESLVal rightBottom = new ESLVal("Line",border.add(waits.add(gapLength)),width.add(border),border.add(waits.add(gapLength.add(waits))),width.add(border),new ESLVal("stroke:black;"));
  private static ESLVal topNeck = ESLVal.list(new ESLVal("Line",border.add(waits),border,border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(neckWidth).div(new ESLVal(2))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(neckWidth).div(new ESLVal(2))),border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),border.add(width.sub(neckWidth).div(new ESLVal(2))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),border.add(width.sub(neckWidth).div(new ESLVal(2))),border.add(waits.add(gapLength)),border,new ESLVal("stroke:black;")));
  private static ESLVal bottomNeck = ESLVal.list(new ESLVal("Line",border.add(waits),border.add(width),border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),border.add(width.sub(width.sub(neckWidth).div(new ESLVal(2)))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(neckLength).div(new ESLVal(2)))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),new ESLVal("stroke:black;")),new ESLVal("Line",border.add(waits.add(gapLength.sub(gapLength.sub(neckLength).div(new ESLVal(2))))),width.add(border.sub(width.sub(neckWidth).div(new ESLVal(2)))),border.add(waits.add(gapLength)),border.add(width),new ESLVal("stroke:black;")));
  private static ESLVal neck = topNeck.add(bottomNeck);
  private static ESLVal centre = new ESLVal("Line",border,border.add(width.div(new ESLVal(2))),border.add(waits.mul(new ESLVal(2)).add(gapLength)),border.add(width.div(new ESLVal(2))),new ESLVal("stroke:grey;stroke-dasharray:5,5;"));
  private static ESLVal road = ESLVal.list(leftTop,leftBottom).add(neck.add(ESLVal.list(rightTop,rightBottom).add(ESLVal.list(centre))));
  private static ESLVal qLeftPicture = new ESLVal(new Function(new ESLVal("qLeftPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cars = $args[0];
  ESLVal startLeft = $args[1];
  if(cars.eql($zero).boolVal)
        return ESLVal.list();
        else
          return leftQCarPicture.apply(cars.sub($one),startLeft.add(cars)).add(qLeftPicture.apply(cars.sub($one),startLeft));
    }
  });
  private static ESLVal qRightPicture = new ESLVal(new Function(new ESLVal("qRightPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cars = $args[0];
  ESLVal startRight = $args[1];
  if(cars.eql($zero).boolVal)
        return ESLVal.list();
        else
          return rightQCarPicture.apply(cars.sub($one),startRight.add(cars)).add(qRightPicture.apply(cars.sub($one),startRight));
    }
  });
  private static ESLVal leftQCarPicture = new ESLVal(new Function(new ESLVal("leftQCarPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal position = $args[0];
  ESLVal label = $args[1];
  {ESLVal x = border.add(waits.sub(carSize.add(carGap).mul(position).add(carSize)));
        ESLVal y = leftCarY;
        
        return ESLVal.list(new ESLVal("Circle",x,y,carSize.div(new ESLVal(2)),leftColour),new ESLVal("Text",x.sub(new ESLVal(5)),y.add(new ESLVal(5)),new ESLVal("").add(label),new ESLVal("")));
      }
    }
  });
  private static ESLVal rightQCarPicture = new ESLVal(new Function(new ESLVal("rightQCarPicture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal position = $args[0];
  ESLVal label = $args[1];
  {ESLVal x = border.add(waits.add(gapLength.add(carSize.add(carGap).mul(position).add(carSize))));
        ESLVal y = rightCarY;
        
        return ESLVal.list(new ESLVal("Circle",x,y,carSize.div(new ESLVal(2)),rightColour),new ESLVal("Text",x.sub(new ESLVal(5)),y.add(new ESLVal(5)),new ESLVal("").add(label),new ESLVal("")));
      }
    }
  });
  private static ESLVal picture = new ESLVal(new Function(new ESLVal("picture"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal qLeft = $args[0];
  ESLVal qRight = $args[1];
  ESLVal startLeft = $args[2];
  ESLVal startRight = $args[3];
  return new ESLVal("Picture",pWidth,pHeight,road.add(qLeftPicture.apply(qLeft,startLeft).add(qRightPicture.apply(qRight,startRight))));
    }
  });
  private static ESLVal qLimit = new ESLVal(5);
  private static ESLVal qtLimit = new ESLVal(3);
  private static ESLVal tLimit = new ESLVal(10000);
  private static ESLVal sampleDelay = new ESLVal(20);
  private static ESLVal moveDelay = new ESLVal(20);
  private static ESLVal actions = ESLVal.list();
  private static ESLVal monitorState = new ESLVal("Even",new ESLVal[]{});
  private static ESLVal light = new ESLVal(new Function(new ESLVal("light"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("light")) {
          ESLVal colour = c;
          ESLVal change = new ESLVal(new Function(new ESLVal("change"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                {ESLVal _v6 = colour;
                  
                  switch(_v6.strVal) {
                  case "RED": {colour = new ESLVal("GREEN");
                  return $null;}
                case "GREEN": {colour = new ESLVal("RED");
                  return $null;}
                  default: return error(new ESLVal("case error at Pos(8434,8521)").add(ESLVal.list(_v6)));
                }
                }
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v7 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v7)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "colour": return colour;
              case "change": return change;
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
  private static ESLVal trafficLights = new ESLVal(new Function(new ESLVal("trafficLights"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal r = $args[1];
  return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("trafficLights")) {
          ESLVal left = l;
          ESLVal right = r;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v5 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v5)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "left": return left;
              case "right": return right;
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
  private static ESLVal approach = new ESLVal(new Function(new ESLVal("approach"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v19 = $args[0];
  ESLVal _v18 = $args[1];
  ESLVal _v17 = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("approach")) {
          ESLVal queue = ESLVal.list($zero);
          ESLVal getQueue = new ESLVal(new Function(new ESLVal("getQueue"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return head.apply(queue);
                    }},queue);
              }
            });
          ESLVal prioritise = new ESLVal(new Function(new ESLVal("prioritise"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return ((Supplier<ESLVal>)() -> { 
                    if(length.apply(queue).gre(qtLimit).boolVal)
                      return forall.apply(new ESLVal(new Function(new ESLVal("fun72"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal n = $args[0];
                        return n.gre(qLimit);
                          }
                        }),take.apply(queue,qtLimit));
                      else
                        return $false;
                  }).get();
                    }},queue);
              }
            });
          ESLVal move = new ESLVal(new Function(new ESLVal("move"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return ((Supplier<ESLVal>)() -> { 
                    if(_v18.ref("colour").eql(new ESLVal("GREEN")).boolVal)
                      if(head.apply(queue).gre($zero).boolVal)
                        {queue = queue.cons(head.apply(queue).sub($one));
                        {actions = actions.add(ESLVal.list(((Supplier<ESLVal>)() -> { 
                          if(_v19.eql(new ESLVal("left")).boolVal)
                            return new ESLVal("MoveLeft",new ESLVal[]{});
                            else
                              return new ESLVal("MoveRight",new ESLVal[]{});
                        }).get()));
                        return $null;}}
                        else
                          return $null;
                      else
                        return $null;
                  }).get();
                    }},queue,actions);
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v4)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              case "getQueue": return getQueue;
              case "move": return move;
              case "prioritise": return prioritise;
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {probably(_v17,new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return lock(new Function(new ESLVal("grab"),getSelf()) {
                    public ESLVal apply(ESLVal ...args) { 
                      return ((Supplier<ESLVal>)() -> { 
                    {queue = queue.cons(head.apply(queue).add($one));
                    {actions = actions.add(ESLVal.list(((Supplier<ESLVal>)() -> { 
                      if(_v19.eql(new ESLVal("left")).boolVal)
                        return new ESLVal("ArriveLeft",new ESLVal[]{});
                        else
                          return new ESLVal("ArriveRight",new ESLVal[]{});
                    }).get()));
                    return $null;}}
                  }).get();
                    }},queue,actions);
              }
            }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return $null;
              }
            }));
            move.apply();}
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal mon = new ESLVal(new Function(new ESLVal("mon"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v16 = $args[0];
  ESLVal _v15 = $args[1];
  ESLVal _v14 = $args[2];
  return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("mon")) {
          ESLVal queueRight = new ESLVal(new Function(new ESLVal("queueRight"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                return _v15.ref("getQueue").apply().gre($zero);
              }
            });
          ESLVal allowRight = new ESLVal(new Function(new ESLVal("allowRight"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(_v14.ref("right").ref("colour").eql(new ESLVal("RED")).boolVal)
                  {_v14.ref("right").ref("change").apply();
                  return _v14.ref("left").ref("change").apply();}
                  else
                    return $null;
              }
            });
          ESLVal allowLeft = new ESLVal(new Function(new ESLVal("allowLeft"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                if(_v14.ref("left").ref("colour").eql(new ESLVal("RED")).boolVal)
                  {_v14.ref("left").ref("change").apply();
                  return _v14.ref("right").ref("change").apply();}
                  else
                    return $null;
              }
            });
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v3 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v3)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            ((Supplier<ESLVal>)() -> { 
              {ESLVal _v2 = monitorState;
                
                switch(_v2.termName) {
                case "PriorityRight": {
                  if(_v15.ref("prioritise").apply().boolVal)
                  return allowRight.apply();
                  else
                    if(_v16.ref("prioritise").apply().boolVal)
                      return allowLeft.apply();
                      else
                        if(queueRight.apply().boolVal)
                          return allowRight.apply();
                          else
                            return allowLeft.apply();
                }
              case "Even": {
                  return probably(new ESLVal(50),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return allowLeft.apply();
                    }
                  }),new ESLVal(new Function(new ESLVal("probFun"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      return allowRight.apply();
                    }
                  }));
                }
                default: return error(new ESLVal("case error at Pos(10961,11410)").add(ESLVal.list(_v2)));
              }
              }
            }).get();
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
  private static ESLVal l1 = newActor(light,new ESLVal(new Actor()),new ESLVal("RED"));
  private static ESLVal l2 = newActor(light,new ESLVal(new Actor()),new ESLVal("GREEN"));
  private static ESLVal left = newActor(approach,new ESLVal(new Actor()),new ESLVal("left"),l1,new ESLVal(20));
  private static ESLVal right = newActor(approach,new ESLVal(new Actor()),new ESLVal("right"),l2,new ESLVal(30));
  private static ESLVal lights = newActor(trafficLights,new ESLVal(new Actor()),l1,l2);
  private static ESLVal m = newActor(mon,new ESLVal(new Actor()),left,right,lights);
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          ESLVal stop = $false;
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if(n.gre(tLimit).and(stop.not()).boolVal)
            {stop = $true;
            Lib.send(edb,"Filmstrip",new ESLVal("Traffic Filmstrip"),actionsToPictures.apply($zero,$zero,$zero,$zero,actions));
            stopAll.apply();}
            else
              {ESLVal _v13 = $t;
                
                if($true.boolVal)
                {}
                else
                  {}
              }
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}