package esl.tutorial;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Excel.*;
// import static esl.Lists.*;
public class Bikes {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            new Function(new ESLVal("try"),getSelf()) {
              public ESLVal apply(ESLVal... args) { 
                try { 
                  return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  {print.apply(new ESLVal("total sales before update = ").add(totalSales()));
                  addBike(new ESLVal("Electric"),new ESLVal(3000.0),new ESLVal(20.0),$false,new ESLVal("06/01/2019"));
                  print.apply(new ESLVal("total sales after update = ").add(totalSales()));
                  return stopAll.apply();}
                }}.get();
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v5 = $x;
              
              {ESLVal x = _v5;
              
              return print.apply(x);
            }
            }
                }
              }
            }.apply();
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
private static ESLVal totalSales() {
    
    return new Function(new ESLVal("try"),getSelf()) {
        public ESLVal apply(ESLVal... args) { 
          try { 
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal book = readWorkbook.apply(new ESLVal("esl/data/bikes.xlsx"));
              
              {ESLVal sales = getColumnNamed(getSheet(book,$zero),new ESLVal("Sales"));
              
              {print.apply(new ESLVal("book pre = ").add(book));
            return foldr(id,new ESLVal(new Function(new ESLVal("fun21"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal x = $args[0];
              ESLVal y = $args[1];
              return x.add(y);
                }
              }),new ESLVal(0.0),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v1 = $qualArg;
                    
                    switch(_v1.termName) {
                    case "XFloat": {ESLVal $1 = _v1.termRef(0);
                      
                      {ESLVal n = $1;
                      
                      return ESLVal.list(ESLVal.list(n));
                    }
                    }
                    default: {ESLVal _0 = _v1;
                      
                      return $nil;
                    }
                  }
                  }
                }
              }).map(sales).flatten().flatten());}
            }
            }
          }}.get();
          } catch(ESLError $exception) {
            ESLVal $x = $exception.value;
            {ESLVal _v2 = $x;
        
        {ESLVal e = _v2;
        
        {print.apply(new ESLVal("Error: ").add(e));
      return new ESLVal(0.0);}
      }
      }
          }
        }
      }.apply();
  }
  private static ESLVal totalSales = new ESLVal(new Function(new ESLVal("totalSales"),null) { public ESLVal apply(ESLVal... args) { return totalSales(); }});
  private static ESLVal addBike(ESLVal model,ESLVal price,ESLVal sales,ESLVal current,ESLVal date) {
    
    return new Function(new ESLVal("try"),getSelf()) {
        public ESLVal apply(ESLVal... args) { 
          try { 
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal book = readWorkbook.apply(new ESLVal("esl/data/bikes.xlsx"));
              ESLVal newRow = new ESLVal("XRow",ESLVal.list(new ESLVal("XStr",model),new ESLVal("XFloat",price),new ESLVal("XFloat",sales),new ESLVal("XBool",current),new ESLVal("XDate",date)));
              
              {ESLVal newBook = new SerializableSupplier<ESLVal>() { public ESLVal get() { 
                  {ESLVal _v3 = book;
                    
                    switch(_v3.termName) {
                    case "XWorkbook": {ESLVal $2 = _v3.termRef(0);
                      
                      if($2.isCons())
                      {ESLVal $3 = $2.head();
                        ESLVal $4 = $2.tail();
                        
                        switch($3.termName) {
                        case "XSheet": {ESLVal $6 = $3.termRef(0);
                          ESLVal $5 = $3.termRef(1);
                          
                          if($4.isCons())
                          {ESLVal $7 = $4.head();
                            ESLVal $8 = $4.tail();
                            
                            return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                          }
                        else if($4.isNil())
                          {ESLVal name = $6;
                            
                            {ESLVal rows = $5;
                            
                            return new ESLVal("XWorkbook",ESLVal.list(new ESLVal("XSheet",name,rows.add(ESLVal.list(newRow)))));
                          }
                          }
                        else return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                        }
                        default: return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                      }
                      }
                    else if($2.isNil())
                      return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                    else return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                    }
                    default: return error(new ESLVal("case error at Pos(729,819)").add(ESLVal.list(_v3)));
                  }
                  }
                }}.get();
              
              {print.apply(new ESLVal("book = ").add(book));
            return writeWorkbook.apply(new ESLVal("esl/data/bikes.xlsx"),newBook);}
            }
            }
          }}.get();
          } catch(ESLError $exception) {
            ESLVal $x = $exception.value;
            {ESLVal _v4 = $x;
        
        {ESLVal e = _v4;
        
        {print.apply(new ESLVal("Error: ").add(e));
      return new ESLVal(0.0);}
      }
      }
          }
        }
      }.apply();
  }
  private static ESLVal addBike = new ESLVal(new Function(new ESLVal("addBike"),null) { public ESLVal apply(ESLVal... args) { return addBike(args[0],args[1],args[2],args[3],args[4]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}
