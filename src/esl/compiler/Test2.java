package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Sets.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Test2 {
  public static ESLVal getSelf() { return $null; }
  // static ESLVal edb = null;
  private static ESLVal treeTrans = new ESLVal(new Function(new ESLVal("treeTrans"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v20 = $args[0];
  ESLVal _v19 = $args[1];
  {ESLVal _v10 = _v19;
        
        switch(_v10.termName) {
        case "Branch": {ESLVal $54 = _v10.termRef(0);
          ESLVal $53 = _v10.termRef(1);
          
          {ESLVal l = $54;
          
          {ESLVal r = $53;
          
          return new ESLVal("Branch",treeTrans.apply(_v20,l),treeTrans.apply(_v20,r));
        }
        }
        }
      case "Leaf": {ESLVal $52 = _v10.termRef(0);
          
          {ESLVal v = $52;
          
          return new ESLVal("Leaf",_v20.apply(v));
        }
        }
        default: return error(new ESLVal("case error at Pos(254,391)").add(ESLVal.list(_v10)));
      }
      }
    }
  });
  private static ESLVal t1 = new ESLVal("Branch",new ESLVal("Leaf",new ESLVal(100)),new ESLVal("Leaf",new ESLVal(200)));
  private static ESLVal t2 = treeTrans.apply(new ESLVal(new Function(new ESLVal("fun122"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal i = $args[0];
  return i.gre(new ESLVal(100));
    }
  }),t1);
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  {ESLVal _v9 = $0;
        
        {ESLVal l = _v9;
        
        return l;
      }
      }
    }
  });
  private static ESLVal k = new ESLVal(new Function(new ESLVal("k"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  return l;
    }
  });
  private static ESLVal mkPoint = new ESLVal(new Function(new ESLVal("mkPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  ESLVal y = $args[1];
  return newRecord(new ESLVal[]{new ESLVal("getX"),new ESLVal("getY"),new ESLVal("setX"),new ESLVal("setY")},new ESLVal(new Function(new ESLVal("fun123"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return x;
          }
        }),new ESLVal(new Function(new ESLVal("fun124"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return y;
          }
        }),new ESLVal(new Function(new ESLVal("fun125"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v18 = $args[0];
        return mkPoint.apply(_v18,y);
          }
        }),new ESLVal(new Function(new ESLVal("fun126"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v17 = $args[0];
        return mkPoint.apply(x,_v17);
          }
        }));
    }
  });
  private static ESLVal len = new ESLVal(new Function(new ESLVal("len"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $0 = $args[0];
  {ESLVal _v8 = $0;
        
        if(_v8.isCons())
        {ESLVal $50 = _v8.head();
          ESLVal $51 = _v8.tail();
          
          {ESLVal h = $50;
          
          {ESLVal _v16 = $51;
          
          return $one.add(len.apply(_v16));
        }
        }
        }
      else if(_v8.isNil())
        return $zero;
      else return error(new ESLVal("case error at Pos(1029,1046)").add(ESLVal.list(_v8)));
      }
    }
  });
  private static ESLVal select = new ESLVal(new Function(new ESLVal("select"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s = $args[0];
  {ESLVal _v7 = s;
        
        return $ndCase.apply(_v7,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $39 = $args[0];
        ESLVal $40 = $args[1];
        ESLVal $38 = $args[2];
        return $ndCase.apply($39,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $42 = $args[0];
              ESLVal $43 = $args[1];
              ESLVal $41 = $args[2];
              return $ndCase.apply($40,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $45 = $args[0];
                    ESLVal $46 = $args[1];
                    ESLVal $44 = $args[2];
                    return $ndCase.apply($45,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $48 = $args[0];
                          ESLVal $49 = $args[1];
                          ESLVal $47 = $args[2];
                          {ESLVal x = $42;
                                
                                {ESLVal rest1 = $43;
                                
                                {ESLVal y = $48;
                                
                                {ESLVal rest2 = $49;
                                
                                {ESLVal rest3 = $46;
                                
                                if(x.add(y).eql(new ESLVal(100)).boolVal)
                                return ESLVal.list(x,y);
                                else
                                  return $47.apply();
                              }
                              }
                              }
                              }
                              }
                            }
                          }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return $44.apply();
                            }
                          }));
                      }
                    }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return $41.apply();
                      }
                    }));
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $38.apply();
                }
              }));
          }
        })),new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $21 = $args[0];
        ESLVal $22 = $args[1];
        ESLVal $20 = $args[2];
        return $ndCase.apply($21,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $24 = $args[0];
              ESLVal $25 = $args[1];
              ESLVal $23 = $args[2];
              return $ndCase.apply($25,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal $27 = $args[0];
                    ESLVal $28 = $args[1];
                    ESLVal $26 = $args[2];
                    return $ndCase.apply($22,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal $30 = $args[0];
                          ESLVal $31 = $args[1];
                          ESLVal $29 = $args[2];
                          return $ndCase.apply($30,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    ESLVal $33 = $args[0];
                                ESLVal $34 = $args[1];
                                ESLVal $32 = $args[2];
                                return $ndCase.apply($34,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          ESLVal $36 = $args[0];
                                      ESLVal $37 = $args[1];
                                      ESLVal $35 = $args[2];
                                      {ESLVal x = $24;
                                            
                                            {ESLVal x2 = $27;
                                            
                                            {ESLVal rest1 = $28;
                                            
                                            {ESLVal y = $33;
                                            
                                            {ESLVal y2 = $36;
                                            
                                            {ESLVal rest2 = $37;
                                            
                                            {ESLVal rest3 = $31;
                                            
                                            if(x.add(y).eql(new ESLVal(20)).and(x2.eql(y2)).boolVal)
                                            return ESLVal.list(x,y,x2,y2);
                                            else
                                              return $35.apply();
                                          }
                                          }
                                          }
                                          }
                                          }
                                          }
                                          }
                                        }
                                      }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                                        public ESLVal apply(ESLVal... $args) {
                                          return $32.apply();
                                        }
                                      }));
                                  }
                                }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                                  public ESLVal apply(ESLVal... $args) {
                                    return $29.apply();
                                  }
                                }));
                            }
                          }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              return $26.apply();
                            }
                          }));
                      }
                    }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return $23.apply();
                      }
                    }));
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $20.apply();
                }
              }));
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(1267,1464)").add(ESLVal.list(_v7)));
          }
        }));
      }
    }
  });
  private static ESLVal duplicate = new ESLVal(new Function(new ESLVal("duplicate"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal s1 = $args[0];
  ESLVal s2 = $args[1];
  ESLVal notFound = $args[2];
  {ESLVal _v6 = s1;
        ESLVal _v5 = s2;
        
        return $ndCase.apply(_v6,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $15 = $args[0];
        ESLVal $16 = $args[1];
        ESLVal $14 = $args[2];
        return $ndCase.apply(_v5,ESLVal.list(new ESLVal("$cons",new ESLVal(new Function(new ESLVal("setcons"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $18 = $args[0];
              ESLVal $19 = $args[1];
              ESLVal $17 = $args[2];
              {ESLVal x = $15;
                    
                    {ESLVal p = $16;
                    
                    {ESLVal y = $18;
                    
                    {ESLVal q = $19;
                    
                    if(x.eql(y).boolVal)
                    return x;
                    else
                      return $17.apply();
                  }
                  }
                  }
                  }
                }
              }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  return $14.apply();
                }
              }));
          }
        }))),new ESLVal(new Function(new ESLVal("setFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v14 = _v6;
              
              {ESLVal _v15 = _v5;
              
              return notFound;
            }
            }
          }
        }));
      }
    }
  });
  private static ESLVal listMem = new ESLVal(new Function(new ESLVal("listMem"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v4 = l;
        
        return $ndCase.apply(_v4,ESLVal.list(new ESLVal("$selectLeft",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $12 = $args[0];
        ESLVal $13 = $args[1];
        ESLVal $11 = $args[2];
        {ESLVal x = $12;
              
              {ESLVal _v13 = $13;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $11.apply();
            }
            }
          }
        })),new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $8 = $args[0];
        ESLVal $9 = $args[1];
        ESLVal $10 = $args[2];
        ESLVal $7 = $args[3];
        {ESLVal l1 = $8;
              
              {ESLVal x = $9;
              
              {ESLVal l2 = $10;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $7.apply();
            }
            }
            }
          }
        })),new ESLVal("$selectRight",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $5 = $args[0];
        ESLVal $6 = $args[1];
        ESLVal $4 = $args[2];
        {ESLVal _v12 = $5;
              
              {ESLVal x = $6;
              
              if(x.eql(n).boolVal)
              return $true;
              else
                return $4.apply();
            }
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v11 = _v4;
              
              return $false;
            }
          }
        }));
      }
    }
  });
  private static ESLVal g = new ESLVal(new Function(new ESLVal("g"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return $null;
    }
  });
  private static ESLVal t = newTable();
  private static ESLVal graph = new ESLVal("Graph",ESLVal.list(),ESLVal.list(new ESLVal("Node",ESLVal.list(),$zero,new ESLVal("HTML",new ESLVal("0"))),new ESLVal("Node",ESLVal.list(),$one,new ESLVal("HTML",new ESLVal("1"))),new ESLVal("Node",ESLVal.list(),new ESLVal(2),new ESLVal("HTML",new ESLVal("2"))),new ESLVal("Node",ESLVal.list(),new ESLVal(3),new ESLVal("HTML",new ESLVal("3")))),ESLVal.list(new ESLVal("Edge",ESLVal.list(),$zero,$one,new ESLVal("HTML",new ESLVal("e1"))),new ESLVal("Edge",ESLVal.list(),$zero,new ESLVal(2),new ESLVal("HTML",new ESLVal("e2"))),new ESLVal("Edge",ESLVal.list(),$one,new ESLVal(3),new ESLVal("HTML",new ESLVal("e3"))),new ESLVal("Edge",ESLVal.list(),new ESLVal(2),new ESLVal(3),new ESLVal("HTML",new ESLVal("e4")))));
  private static ESLVal tableProps = ESLVal.list(new ESLVal("Prop",new ESLVal("style"),new ESLVal("border: 1px solid black;")));
  private static ESLVal table = new ESLVal("Table",tableProps,new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal i = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("Row",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal j = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("Data",tableProps,new ESLVal("HTML",new ESLVal("<a href=\"edb:").add(j.add(new ESLVal("\">").add(j.add(new ESLVal("</a>"))))))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply(i.mul(new ESLVal(10)).to(i.mul(new ESLVal(10)).add(new ESLVal(10))))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(10))));
  private static ESLVal pie = new ESLVal("Pie",ESLVal.list(),new ESLVal("Annual Car Sales"),new ESLVal(400),new ESLVal(400),ESLVal.list(new ESLVal("Slice",ESLVal.list(),new ESLVal("VW"),new ESLVal(20)),new ESLVal("Slice",ESLVal.list(),new ESLVal("Vauxhall"),new ESLVal(10)),new ESLVal("Slice",ESLVal.list(),new ESLVal("Audi"),new ESLVal(20)),new ESLVal("Slice",ESLVal.list(),new ESLVal("Ford"),new ESLVal(10)),new ESLVal("Slice",ESLVal.list(),new ESLVal("Bentley"),new ESLVal(3)),new ESLVal("Slice",ESLVal.list(),new ESLVal("Volvo"),new ESLVal(40))));
  private static ESLVal lgraph = new ESLVal("LineGraph",ESLVal.list(),new ESLVal("Sales"),new ESLVal("Month"),new ESLVal("Volume"),new ESLVal(700),new ESLVal(500),new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal i = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("GLine",ESLVal.list(),new ESLVal("Product").add(i),new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal month = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("LPoint",ESLVal.list(),month,random.apply(new ESLVal(500))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(12)))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(3))));
  private static ESLVal salesFigures = ESLVal.list(new ESLVal("Sale",$one,new ESLVal(100)),new ESLVal("Sale",new ESLVal(2),new ESLVal(110)),new ESLVal("Sale",new ESLVal(3),new ESLVal(150)),new ESLVal("Sale",new ESLVal(4),new ESLVal(120)),new ESLVal("Sale",new ESLVal(5),new ESLVal(200)),new ESLVal("Sale",new ESLVal(6),new ESLVal(230)),new ESLVal("Sale",new ESLVal(7),new ESLVal(250)),new ESLVal("Sale",new ESLVal(8),new ESLVal(300)),new ESLVal("Sale",new ESLVal(9),new ESLVal(350)),new ESLVal("Sale",new ESLVal(10),new ESLVal(400)),new ESLVal("Sale",new ESLVal(11),new ESLVal(340)),new ESLVal("Sale",new ESLVal(12),new ESLVal(460)));
  private static ESLVal lgraphs = new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal month = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("LineGraph",ESLVal.list(),new ESLVal("Sales"),new ESLVal("Month"),new ESLVal("Volume"),new ESLVal(400),new ESLVal(200),ESLVal.list(new ESLVal("GLine",ESLVal.list(),new ESLVal("Product"),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal _v3 = $qualArg;
        
        switch(_v3.termName) {
        case "Sale": {ESLVal $3 = _v3.termRef(0);
          ESLVal $2 = _v3.termRef(1);
          
          {ESLVal m = $3;
          
          {ESLVal s = $2;
          
          return ESLVal.list(ESLVal.list(new ESLVal("LPoint",ESLVal.list(),m,s)));
        }
        }
        }
        default: {ESLVal _0 = _v3;
          
          return ESLVal.list();
        }
      }
      }
    }
  }).map(take.apply(salesFigures,month)).flatten().flatten()))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(13)));
  private static ESLVal picture = new ESLVal("Picture",new ESLVal(500),new ESLVal(500),ESLVal.list(new ESLVal("Rectangle",new ESLVal(100),new ESLVal(100),new ESLVal(300),new ESLVal(300),new ESLVal("fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)")),new ESLVal("Circle",new ESLVal(250),new ESLVal(250),new ESLVal(100),new ESLVal("fill:rgb(0,255,0);stroke-width:3;stroke:rgb(0,0,0)")),new ESLVal("Line",new ESLVal(200),new ESLVal(250),new ESLVal(300),new ESLVal(250),new ESLVal("stroke-width:3;stroke:rgb(255,0,0)")),new ESLVal("Image",new ESLVal(110),new ESLVal(110),new ESLVal(50),new ESLVal(50),new ESLVal("https://img.icons8.com/ios/1600/clock.png")),new ESLVal("Text",new ESLVal(110),new ESLVal(380),new ESLVal("My Picture"),new ESLVal("stroke:rgb(255,255,255)"))));
  private static ESLVal tableListener = new ESLVal(new Function(new ESLVal("tableListener"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("tableListener")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v2 = $m;
            
            switch(_v2.termName) {
            case "BrowserEvent": {ESLVal $1 = _v2.termRef(0);
              
              switch($1.strVal) {
              case "50": return stopAll.apply();
              default: {ESLVal s = $1;
                
                return print.apply(new ESLVal("you pressed: ").add(s));
              }
            }
            }
            default: return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v2)));
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
  private static ESLVal tableCounter = $zero;
  private static ESLVal tree = new ESLVal("Tree",new ESLVal(500),new ESLVal(500),new ESLVal("VBox",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal row = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("HBox",ESLVal.list(),new java.util.function.Function<ESLVal,ESLVal>() {
    public ESLVal apply(ESLVal $l0) {
      ESLVal $a = $nil;
      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
      while(!$l0.isNil()) { 
        ESLVal column = $l0.head();
        $l0 = $l0.tail();
        $v.add(new ESLVal("TreeNode",new ESLVal("Image",$zero,$zero,new ESLVal(10),new ESLVal(10),new ESLVal("https://img.icons8.com/ios/1600/clock.png"))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(10)))));
      }
      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
      return $a;
    }}.apply($zero.to(new ESLVal(5)))));
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
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
            return ((Supplier<ESLVal>)() -> { 
                {Lib.send(edb,"Show",new ESLVal("grid"),tree);
                stopAll.apply();
                print.apply(new ESLVal("g = ").add(edb.ref("getProperty").apply(new ESLVal("graph"))));
                t.ref("put").apply(new ESLVal("one"),$one);
                t.ref("put").apply(new ESLVal("two"),new ESLVal(2));
                t.ref("put").apply(new ESLVal("one"),new ESLVal(3));
                {ESLVal p = mkPoint.apply(new ESLVal(100),new ESLVal(200));
                  
                  {print.apply(p.ref("getX").apply());
                print.apply(p.ref("setX").apply(p.ref("getX").apply().add($one)).ref("getX").apply());
                print.apply(len.apply(ESLVal.list($one,new ESLVal(2),new ESLVal(3),new ESLVal(4),new ESLVal(5),new ESLVal(6),new ESLVal(7),new ESLVal(8))));
                print.apply(t1);
                return print.apply(t2);}
                }}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}