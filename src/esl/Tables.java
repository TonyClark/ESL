package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Tables {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return $nil;
    }
  });
  public static ESLVal emptyTable = f.apply();
  public static ESLVal addEntry = new ESLVal(new Function(new ESLVal("addEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal v = $args[1];
  ESLVal t = $args[2];
  return t.cons(new ESLVal("TableEntry",k,v));
    }
  });
  public static ESLVal addEntries = new ESLVal(new Function(new ESLVal("addEntries"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ks = $args[0];
  ESLVal vs = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v1516 = ks;
        ESLVal _v1515 = vs;
        
        if(_v1516.isCons())
        {ESLVal $1684 = _v1516.head();
          ESLVal $1685 = _v1516.tail();
          
          if(_v1515.isCons())
          {ESLVal $1686 = _v1515.head();
            ESLVal $1687 = _v1515.tail();
            
            {ESLVal k = $1684;
            
            {ESLVal _v1518 = $1685;
            
            {ESLVal v = $1686;
            
            {ESLVal _v1519 = $1687;
            
            return addEntries.apply(_v1518,_v1519,addEntry.apply(k,v,t));
          }
          }
          }
          }
          }
        else if(_v1515.isNil())
          if(_v1515.isCons())
            {ESLVal $1682 = _v1515.head();
              ESLVal $1683 = _v1515.tail();
              
              return error(new ESLVal("case error at Pos(479,771)"));
            }
          else if(_v1515.isNil())
            {ESLVal _v1520 = _v1516;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)"));
        else if(_v1515.isCons())
            {ESLVal $1682 = _v1515.head();
              ESLVal $1683 = _v1515.tail();
              
              return error(new ESLVal("case error at Pos(479,771)"));
            }
          else if(_v1515.isNil())
            {ESLVal _v1521 = _v1516;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)"));
        }
      else if(_v1516.isNil())
        if(_v1515.isCons())
          {ESLVal $1688 = _v1515.head();
            ESLVal $1689 = _v1515.tail();
            
            {ESLVal _v1522 = _v1515;
            
            return error(new ESLVal("ran out of keys"));
          }
          }
        else if(_v1515.isNil())
          return t;
        else {ESLVal _v1523 = _v1515;
            
            return error(new ESLVal("ran out of keys"));
          }
      else if(_v1515.isCons())
          {ESLVal $1682 = _v1515.head();
            ESLVal $1683 = _v1515.tail();
            
            return error(new ESLVal("case error at Pos(479,771)"));
          }
        else if(_v1515.isNil())
          {ESLVal _v1524 = _v1516;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)"));
      }
    }
  });
  public static ESLVal getEntry = new ESLVal(new Function(new ESLVal("getEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  {ESLVal _v1514 = table;
        
        if(_v1514.isCons())
        {ESLVal $1678 = _v1514.head();
          ESLVal $1679 = _v1514.tail();
          
          switch($1678.termName) {
          case "TableEntry": {ESLVal $1681 = $1678.termRef(0);
            ESLVal $1680 = $1678.termRef(1);
            
            {ESLVal kk = $1681;
            
            {ESLVal vv = $1680;
            
            {ESLVal _v1517 = $1679;
            
            if(kk.eql(k).boolVal)
            return new ESLVal("TableEntry",kk,vv);
            else
              return getEntry.apply(k,_v1517);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(843,1057)"));
        }
        }
      else if(_v1514.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(843,1057)"));
      }
    }
  });
  public static ESLVal hasEntry = new ESLVal(new Function(new ESLVal("hasEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  return getEntry.apply(k,table).neql($null);
    }
  });
  public static ESLVal lookup = new ESLVal(new Function(new ESLVal("lookup"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  {ESLVal _v1513 = getEntry.apply(k,table);
        
        switch(_v1513.termName) {
        case "TableEntry": {ESLVal $1677 = _v1513.termRef(0);
          ESLVal $1676 = _v1513.termRef(1);
          
          {ESLVal kk = $1677;
          
          {ESLVal vv = $1676;
          
          return vv;
        }
        }
        }
        default: {ESLVal e = _v1513;
          
          if(e.eql($null).boolVal)
          return error(new ESLVal("no key ").add(k.add(new ESLVal(" in table."))));
          else
            return error(new ESLVal("case error at Pos(1238,1424)"));
        }
      }
      }
    }
  });
public static void main(String[] args) {
  }
}