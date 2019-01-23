package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Tables {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal emptyTable = f();
private static ESLVal f() {
    
    return $nil;
  }
  private static ESLVal f = new ESLVal(new Function(new ESLVal("f"),null) { public ESLVal apply(ESLVal... args) { return f(); }});
  public static ESLVal addEntry(ESLVal k,ESLVal v,ESLVal t) {
    
    return t.cons(new ESLVal("TableEntry",k,v));
  }
  public static ESLVal addEntry = new ESLVal(new Function(new ESLVal("addEntry"),null) { public ESLVal apply(ESLVal... args) { return addEntry(args[0],args[1],args[2]); }});
  public static ESLVal addEntries(ESLVal ks,ESLVal vs,ESLVal t) {
    
    {ESLVal _v1637 = ks;
      ESLVal _v1638 = vs;
      
      if(_v1637.isCons())
      {ESLVal $2556 = _v1637.head();
        ESLVal $2557 = _v1637.tail();
        
        if(_v1638.isCons())
        {ESLVal $2558 = _v1638.head();
          ESLVal $2559 = _v1638.tail();
          
          {ESLVal k = $2556;
          
          {ESLVal _v1642 = $2557;
          
          {ESLVal v = $2558;
          
          {ESLVal _v1643 = $2559;
          
          return addEntries(_v1642,_v1643,addEntry(k,v,t));
        }
        }
        }
        }
        }
      else if(_v1638.isNil())
        if(_v1638.isCons())
          {ESLVal $2554 = _v1638.head();
            ESLVal $2555 = _v1638.tail();
            
            return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
          }
        else if(_v1638.isNil())
          {ESLVal _v1644 = _v1637;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
      else if(_v1638.isCons())
          {ESLVal $2554 = _v1638.head();
            ESLVal $2555 = _v1638.tail();
            
            return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
          }
        else if(_v1638.isNil())
          {ESLVal _v1645 = _v1637;
            
            return error(new ESLVal("ran out of values"));
          }
        else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
      }
    else if(_v1637.isNil())
      if(_v1638.isCons())
        {ESLVal $2560 = _v1638.head();
          ESLVal $2561 = _v1638.tail();
          
          {ESLVal _v1646 = _v1638;
          
          return error(new ESLVal("ran out of keys"));
        }
        }
      else if(_v1638.isNil())
        return t;
      else {ESLVal _v1647 = _v1638;
          
          return error(new ESLVal("ran out of keys"));
        }
    else if(_v1638.isCons())
        {ESLVal $2554 = _v1638.head();
          ESLVal $2555 = _v1638.tail();
          
          return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
        }
      else if(_v1638.isNil())
        {ESLVal _v1648 = _v1637;
          
          return error(new ESLVal("ran out of values"));
        }
      else return error(new ESLVal("case error at Pos(479,771)").add(ESLVal.list(_v1637,_v1638)));
    }
  }
  public static ESLVal addEntries = new ESLVal(new Function(new ESLVal("addEntries"),null) { public ESLVal apply(ESLVal... args) { return addEntries(args[0],args[1],args[2]); }});
  public static ESLVal getEntry(ESLVal k,ESLVal table) {
    
    {ESLVal _v1639 = table;
      
      if(_v1639.isCons())
      {ESLVal $2562 = _v1639.head();
        ESLVal $2563 = _v1639.tail();
        
        switch($2562.termName) {
        case "TableEntry": {ESLVal $2565 = $2562.termRef(0);
          ESLVal $2564 = $2562.termRef(1);
          
          {ESLVal kk = $2565;
          
          {ESLVal vv = $2564;
          
          {ESLVal _v1641 = $2563;
          
          if(kk.eql(k).boolVal)
          return new ESLVal("TableEntry",kk,vv);
          else
            return getEntry(k,_v1641);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1639)));
      }
      }
    else if(_v1639.isNil())
      return $null;
    else return error(new ESLVal("case error at Pos(843,1057)").add(ESLVal.list(_v1639)));
    }
  }
  public static ESLVal getEntry = new ESLVal(new Function(new ESLVal("getEntry"),null) { public ESLVal apply(ESLVal... args) { return getEntry(args[0],args[1]); }});
  public static ESLVal hasEntry(ESLVal k,ESLVal table) {
    
    return getEntry(k,table).neql($null);
  }
  public static ESLVal hasEntry = new ESLVal(new Function(new ESLVal("hasEntry"),null) { public ESLVal apply(ESLVal... args) { return hasEntry(args[0],args[1]); }});
  public static ESLVal lookup(ESLVal k,ESLVal table) {
    
    {ESLVal _v1640 = getEntry(k,table);
      
      switch(_v1640.termName) {
      case "TableEntry": {ESLVal $2567 = _v1640.termRef(0);
        ESLVal $2566 = _v1640.termRef(1);
        
        {ESLVal kk = $2567;
        
        {ESLVal vv = $2566;
        
        return vv;
      }
      }
      }
      default: {ESLVal e = _v1640;
        
        if(e.eql($null).boolVal)
        return error(new ESLVal("no key ").add(k.add(new ESLVal(" in table."))));
        else
          return error(new ESLVal("case error at Pos(1238,1424)").add(ESLVal.list(_v1640)));
      }
    }
    }
  }
  public static ESLVal lookup = new ESLVal(new Function(new ESLVal("lookup"),null) { public ESLVal apply(ESLVal... args) { return lookup(args[0],args[1]); }});
public static void main(String[] args) {
  }
}