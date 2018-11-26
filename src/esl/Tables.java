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
  {ESLVal _v1918 = ks;
        ESLVal _v1917 = vs;
        
        if(_v1918.isCons())
        {ESLVal $2256 = _v1918.head();
          ESLVal $2257 = _v1918.tail();
          
          if(_v1917.isCons())
          {ESLVal $2258 = _v1917.head();
            ESLVal $2259 = _v1917.tail();
            
            {ESLVal k = $2256;
            
            {ESLVal _v1920 = $2257;
            
            {ESLVal v = $2258;
            
            {ESLVal _v1921 = $2259;
            
            return addEntries.apply(_v1920,_v1921,addEntry.apply(k,v,t));
          }
          }
          }
          }
          }
        else if(_v1917.isNil())
          if(_v1917.isCons())
            {ESLVal $2254 = _v1917.head();
              ESLVal $2255 = _v1917.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
            }
          else if(_v1917.isNil())
            {ESLVal _v1922 = _v1918;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
        else if(_v1917.isCons())
            {ESLVal $2254 = _v1917.head();
              ESLVal $2255 = _v1917.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
            }
          else if(_v1917.isNil())
            {ESLVal _v1923 = _v1918;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
        }
      else if(_v1918.isNil())
        if(_v1917.isCons())
          {ESLVal $2260 = _v1917.head();
            ESLVal $2261 = _v1917.tail();
            
            {ESLVal _v1924 = _v1917;
            
            return error(new ESLVal("ran out of keys"));
          }
          }
        else if(_v1917.isNil())
          return t;
        else {ESLVal _v1925 = _v1917;
            
            return error(new ESLVal("ran out of keys"));
          }
      else if(_v1917.isCons())
          {ESLVal $2254 = _v1917.head();
            ESLVal $2255 = _v1917.tail();
            
            return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
          }
        else if(_v1917.isNil())
          {ESLVal _v1926 = _v1918;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1918,_v1917)));
      }
    }
  });
  public static ESLVal getEntry = new ESLVal(new Function(new ESLVal("getEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  {ESLVal _v1916 = table;
        
        if(_v1916.isCons())
        {ESLVal $2250 = _v1916.head();
          ESLVal $2251 = _v1916.tail();
          
          switch($2250.termName) {
          case "TableEntry": {ESLVal $2253 = $2250.termRef(0);
            ESLVal $2252 = $2250.termRef(1);
            
            {ESLVal kk = $2253;
            
            {ESLVal vv = $2252;
            
            {ESLVal _v1919 = $2251;
            
            if(kk.eql(k).boolVal)
            return new ESLVal("TableEntry",kk,vv);
            else
              return getEntry.apply(k,_v1919);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1916)));
        }
        }
      else if(_v1916.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1916)));
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
  {ESLVal _v1915 = getEntry.apply(k,table);
        
        switch(_v1915.termName) {
        case "TableEntry": {ESLVal $2249 = _v1915.termRef(0);
          ESLVal $2248 = _v1915.termRef(1);
          
          {ESLVal kk = $2249;
          
          {ESLVal vv = $2248;
          
          return vv;
        }
        }
        }
        default: {ESLVal e = _v1915;
          
          if(e.eql($null).boolVal)
          return error(new ESLVal("no key ").add(k.add(new ESLVal(" in table."))));
          else
            return error(new ESLVal("case error at Pos(1238,1424)").add(ESLVal.list(_v1915)));
        }
      }
      }
    }
  });
public static void main(String[] args) {
  }
}