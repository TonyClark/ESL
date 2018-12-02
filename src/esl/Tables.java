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
  {ESLVal _v1881 = ks;
        ESLVal _v1882 = vs;
        
        if(_v1881.isCons())
        {ESLVal $2261 = _v1881.head();
          ESLVal $2262 = _v1881.tail();
          
          if(_v1882.isCons())
          {ESLVal $2263 = _v1882.head();
            ESLVal $2264 = _v1882.tail();
            
            {ESLVal k = $2261;
            
            {ESLVal _v1886 = $2262;
            
            {ESLVal v = $2263;
            
            {ESLVal _v1887 = $2264;
            
            return addEntries.apply(_v1886,_v1887,addEntry.apply(k,v,t));
          }
          }
          }
          }
          }
        else if(_v1882.isNil())
          if(_v1882.isCons())
            {ESLVal $2259 = _v1882.head();
              ESLVal $2260 = _v1882.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
            }
          else if(_v1882.isNil())
            {ESLVal _v1888 = _v1881;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
        else if(_v1882.isCons())
            {ESLVal $2259 = _v1882.head();
              ESLVal $2260 = _v1882.tail();
              
              return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
            }
          else if(_v1882.isNil())
            {ESLVal _v1889 = _v1881;
              
              return error(new ESLVal("ran out of values"));
            }
          else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
        }
      else if(_v1881.isNil())
        if(_v1882.isCons())
          {ESLVal $2265 = _v1882.head();
            ESLVal $2266 = _v1882.tail();
            
            {ESLVal _v1890 = _v1882;
            
            return error(new ESLVal("ran out of keys"));
          }
          }
        else if(_v1882.isNil())
          return t;
        else {ESLVal _v1891 = _v1882;
            
            return error(new ESLVal("ran out of keys"));
          }
      else if(_v1882.isCons())
          {ESLVal $2259 = _v1882.head();
            ESLVal $2260 = _v1882.tail();
            
            return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
          }
        else if(_v1882.isNil())
          {ESLVal _v1892 = _v1881;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1881,_v1882)));
      }
    }
  });
  public static ESLVal getEntry = new ESLVal(new Function(new ESLVal("getEntry"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal k = $args[0];
  ESLVal table = $args[1];
  {ESLVal _v1883 = table;
        
        if(_v1883.isCons())
        {ESLVal $2267 = _v1883.head();
          ESLVal $2268 = _v1883.tail();
          
          switch($2267.termName) {
          case "TableEntry": {ESLVal $2270 = $2267.termRef(0);
            ESLVal $2269 = $2267.termRef(1);
            
            {ESLVal kk = $2270;
            
            {ESLVal vv = $2269;
            
            {ESLVal _v1885 = $2268;
            
            if(kk.eql(k).boolVal)
            return new ESLVal("TableEntry",kk,vv);
            else
              return getEntry.apply(k,_v1885);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1883)));
        }
        }
      else if(_v1883.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1883)));
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
  {ESLVal _v1884 = getEntry.apply(k,table);
        
        switch(_v1884.termName) {
        case "TableEntry": {ESLVal $2272 = _v1884.termRef(0);
          ESLVal $2271 = _v1884.termRef(1);
          
          {ESLVal kk = $2272;
          
          {ESLVal vv = $2271;
          
          return vv;
        }
        }
        }
        default: {ESLVal e = _v1884;
          
          if(e.eql($null).boolVal)
          return error(new ESLVal("no key ").add(k.add(new ESLVal(" in table."))));
          else
            return error(new ESLVal("case error at Pos(1238,1424)").add(ESLVal.list(_v1884)));
        }
      }
      }
    }
  });
public static void main(String[] args) {
  }
}