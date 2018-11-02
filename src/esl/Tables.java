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
  {ESLVal _v1598 = ks;
        ESLVal _v1597 = vs;
        
        if(_v1598.isCons())
        {ESLVal $1929 = _v1598.head();
          ESLVal $1930 = _v1598.tail();
          
          if(_v1597.isCons())
          {ESLVal $1931 = _v1597.head();
            ESLVal $1932 = _v1597.tail();
            
            {ESLVal k = $1929;
            
            {ESLVal _v1600 = $1930;
            
            {ESLVal v = $1931;
            
            {ESLVal _v1601 = $1932;
            
            return addEntries.apply(_v1600,_v1601,addEntry.apply(k,v,t));
          }
          }
          }
          }
          }
        else if(_v1597.isNil())
          if(_v1597.isCons())
            {ESLVal $1927 = _v1597.head();
              ESLVal $1928 = _v1597.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
            }
          else if(_v1597.isNil())
            {ESLVal _v1602 = _v1598;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
        else if(_v1597.isCons())
            {ESLVal $1927 = _v1597.head();
              ESLVal $1928 = _v1597.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
            }
          else if(_v1597.isNil())
            {ESLVal _v1603 = _v1598;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
        }
      else if(_v1598.isNil())
        if(_v1597.isCons())
          {ESLVal $1933 = _v1597.head();
            ESLVal $1934 = _v1597.tail();
            
            {ESLVal _v1604 = _v1597;
            
            return error(new ESLVal("ran out of keys"));
          }
          }
        else if(_v1597.isNil())
          return t;
        else {ESLVal _v1605 = _v1597;
            
            return error(new ESLVal("ran out of keys"));
          }
      else if(_v1597.isCons())
          {ESLVal $1927 = _v1597.head();
            ESLVal $1928 = _v1597.tail();
            
            return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
          }
        else if(_v1597.isNil())
          {ESLVal _v1606 = _v1598;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1598,_v1597)));
      }
    }
  });
  public static ESLVal getEntry = new ESLVal(new Function(new ESLVal("getEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  {ESLVal _v1596 = table;
        
        if(_v1596.isCons())
        {ESLVal $1923 = _v1596.head();
          ESLVal $1924 = _v1596.tail();
          
          switch($1923.termName) {
          case "TableEntry": {ESLVal $1926 = $1923.termRef(0);
            ESLVal $1925 = $1923.termRef(1);
            
            {ESLVal kk = $1926;
            
            {ESLVal vv = $1925;
            
            {ESLVal _v1599 = $1924;
            
            if(kk.eql(k).boolVal)
            return new ESLVal("TableEntry",kk,vv);
            else
              return getEntry.apply(k,_v1599);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1596)));
        }
        }
      else if(_v1596.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1596)));
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
  {ESLVal _v1595 = getEntry.apply(k,table);
        
        switch(_v1595.termName) {
        case "TableEntry": {ESLVal $1922 = _v1595.termRef(0);
          ESLVal $1921 = _v1595.termRef(1);
          
          {ESLVal kk = $1922;
          
          {ESLVal vv = $1921;
          
          return vv;
        }
        }
        }
        default: {ESLVal e = _v1595;
          
          if(e.eql($null).boolVal)
          return error(new ESLVal("no key ").add(k.add(new ESLVal(" in table."))));
          else
            return error(new ESLVal("case error at Pos(1238,1424)").add(ESLVal.list(_v1595)));
        }
      }
      }
    }
  });
public static void main(String[] args) {
  }
}