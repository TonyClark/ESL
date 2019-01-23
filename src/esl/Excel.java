package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Displays.*;
// import static esl.Lists.*;
public class Excel {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal readWorkbook = builtin.apply(new ESLVal(""),new ESLVal("readWorkbook"),$one);
  public static ESLVal writeWorkbook = builtin.apply(new ESLVal(""),new ESLVal("writeWorkbook"),$one);
private static ESLVal rowCells(ESLVal row) {
    
    {ESLVal _v7 = row;
      
      switch(_v7.termName) {
      case "XRow": {ESLVal $9 = _v7.termRef(0);
        
        {ESLVal cells = $9;
        
        return cells;
      }
      }
      default: return error(new ESLVal("case error at Pos(755,795)").add(ESLVal.list(_v7)));
    }
    }
  }
  private static ESLVal rowCells = new ESLVal(new Function(new ESLVal("rowCells"),null) { public ESLVal apply(ESLVal... args) { return rowCells(args[0]); }});
  public static ESLVal getSheet(ESLVal b,ESLVal n) {
    
    {ESLVal _v8 = b;
      
      switch(_v8.termName) {
      case "XWorkbook": {ESLVal $10 = _v8.termRef(0);
        
        {ESLVal sheets = $10;
        
        return nth.apply(sheets,n);
      }
      }
      default: return error(new ESLVal("case error at Pos(839,903)").add(ESLVal.list(_v8)));
    }
    }
  }
  public static ESLVal getSheet = new ESLVal(new Function(new ESLVal("getSheet"),null) { public ESLVal apply(ESLVal... args) { return getSheet(args[0],args[1]); }});
  public static ESLVal getSheetNamed(ESLVal s,ESLVal name) {
    
    {ESLVal sheetNamed = new ESLVal(new Function(new ESLVal("sheetNamed"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v14 = $args[0];
        {ESLVal _v9 = _v14;
              
              switch(_v9.termName) {
              case "XSheet": {ESLVal $12 = _v9.termRef(0);
                ESLVal $11 = _v9.termRef(1);
                
                {ESLVal n = $12;
                
                {ESLVal rows = $11;
                
                if(n.eql(name).boolVal)
                return $true;
                else
                  {ESLVal _v15 = _v9;
                    
                    return $false;
                  }
              }
              }
              }
              default: {ESLVal _v16 = _v9;
                
                return $false;
              }
            }
            }
          }
        });
      
      {ESLVal _v10 = s;
      
      switch(_v10.termName) {
      case "XWorkbook": {ESLVal $13 = _v10.termRef(0);
        
        {ESLVal sheets = $13;
        
        return select1(sheets,$null,sheetNamed);
      }
      }
      default: return error(new ESLVal("case error at Pos(1065,1163)").add(ESLVal.list(_v10)));
    }
    }
    }
  }
  public static ESLVal getSheetNamed = new ESLVal(new Function(new ESLVal("getSheetNamed"),null) { public ESLVal apply(ESLVal... args) { return getSheetNamed(args[0],args[1]); }});
  private static ESLVal getColumn(ESLVal s,ESLVal n) {
    
    {ESLVal _v11 = s;
      
      switch(_v11.termName) {
      case "XSheet": {ESLVal $15 = _v11.termRef(0);
        ESLVal $14 = _v11.termRef(1);
        
        {ESLVal name = $15;
        
        {ESLVal rows = $14;
        
        return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v12 = $qualArg;
              
              switch(_v12.termName) {
              case "XRow": {ESLVal $16 = _v12.termRef(0);
                
                {ESLVal cells = $16;
                
                return ESLVal.list(ESLVal.list(nth.apply(cells,n)));
              }
              }
              default: {ESLVal _0 = _v12;
                
                return $nil;
              }
            }
            }
          }
        }).map(rows).flatten().flatten();
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1218,1306)").add(ESLVal.list(_v11)));
    }
    }
  }
  private static ESLVal getColumn = new ESLVal(new Function(new ESLVal("getColumn"),null) { public ESLVal apply(ESLVal... args) { return getColumn(args[0],args[1]); }});
  public static ESLVal getColumnNamed(ESLVal s,ESLVal n) {
    
    {ESLVal _v13 = s;
      
      switch(_v13.termName) {
      case "XSheet": {ESLVal $18 = _v13.termRef(0);
        ESLVal $17 = _v13.termRef(1);
        
        {ESLVal name = $18;
        
        {ESLVal rows = $17;
        
        {ESLVal i = indexOf(new ESLVal("XStr",n),rowCells(head.apply(rows)));
        
        return tail.apply(getColumn(s,i));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(1362,1521)").add(ESLVal.list(_v13)));
    }
    }
  }
  public static ESLVal getColumnNamed = new ESLVal(new Function(new ESLVal("getColumnNamed"),null) { public ESLVal apply(ESLVal... args) { return getColumnNamed(args[0],args[1]); }});
public static void main(String[] args) {
  }
}