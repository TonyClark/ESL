package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
// import static esl.Lists.*;
import static esl.Displays.*;
import static esl.Tables.*;
public class Info {
  public static ESLVal getSelf() { return $null; }
  
public static ESLVal resetInfo() {
    
    return edb.ref("setProperty").apply(new ESLVal("$INFO"),newTable());
  }
  public static ESLVal resetInfo = new ESLVal(new Function(new ESLVal("resetInfo"),null) { public ESLVal apply(ESLVal... args) { return resetInfo(); }});
  public static ESLVal setInfo(ESLVal l,ESLVal s) {
    
    return edb.ref("getProperty").apply(new ESLVal("$INFO")).ref("put").apply(l,s);
  }
  public static ESLVal setInfo = new ESLVal(new Function(new ESLVal("setInfo"),null) { public ESLVal apply(ESLVal... args) { return setInfo(args[0],args[1]); }});
  public static ESLVal resetTypeInfo() {
    
    return edb.ref("setProperty").apply(new ESLVal("$TYPEINFO"),newTable());
  }
  public static ESLVal resetTypeInfo = new ESLVal(new Function(new ESLVal("resetTypeInfo"),null) { public ESLVal apply(ESLVal... args) { return resetTypeInfo(); }});
  public static ESLVal setTypeInfo(ESLVal e,ESLVal t) {
    
    return edb.ref("getProperty").apply(new ESLVal("$TYPEINFO")).ref("put").apply(e,t);
  }
  public static ESLVal setTypeInfo = new ESLVal(new Function(new ESLVal("setTypeInfo"),null) { public ESLVal apply(ESLVal... args) { return setTypeInfo(args[0],args[1]); }});
  public static ESLVal hasTypeInfo(ESLVal e) {
    
    return edb.ref("getProperty").apply(new ESLVal("$TYPEINFO")).ref("hasKey").apply(e);
  }
  public static ESLVal hasTypeInfo = new ESLVal(new Function(new ESLVal("hasTypeInfo"),null) { public ESLVal apply(ESLVal... args) { return hasTypeInfo(args[0]); }});
  public static ESLVal getTypeInfo(ESLVal e) {
    
    return edb.ref("getProperty").apply(new ESLVal("$TYPEINFO")).ref("get").apply(e);
  }
  public static ESLVal getTypeInfo = new ESLVal(new Function(new ESLVal("getTypeInfo"),null) { public ESLVal apply(ESLVal... args) { return getTypeInfo(args[0]); }});
  public static ESLVal getCache() {
    
    {ESLVal cache = edb.ref("getProperty").apply(new ESLVal("typeCheckCache"));
      
      if(cache.eql($null).boolVal)
      return emptyTable;
      else
        return cache;
    }
  }
  public static ESLVal getCache = new ESLVal(new Function(new ESLVal("getCache"),null) { public ESLVal apply(ESLVal... args) { return getCache(); }});
  public static ESLVal setCache(ESLVal cache) {
    
    return edb.ref("setProperty").apply(new ESLVal("typeCheckCache"),cache);
  }
  public static ESLVal setCache = new ESLVal(new Function(new ESLVal("setCache"),null) { public ESLVal apply(ESLVal... args) { return setCache(args[0]); }});
  public static ESLVal updateCache(ESLVal path,ESLVal record,ESLVal cache) {
    
    {ESLVal _v1717 = addEntry(path,record,cache);
      
      {setCache(_v1717);
    return _v1717;}
    }
  }
  public static ESLVal updateCache = new ESLVal(new Function(new ESLVal("updateCache"),null) { public ESLVal apply(ESLVal... args) { return updateCache(args[0],args[1],args[2]); }});
  public static ESLVal isCachedModule(ESLVal path) {
    
    return hasEntry(path,getCache());
  }
  public static ESLVal isCachedModule = new ESLVal(new Function(new ESLVal("isCachedModule"),null) { public ESLVal apply(ESLVal... args) { return isCachedModule(args[0]); }});
  public static ESLVal getCachedModuleExportedMethodNames(ESLVal path) {
    
    {ESLVal _v1716 = lookup(path,getCache());
      
      switch(_v1716.termName) {
      case "Typed": {ESLVal $3047 = _v1716.termRef(0);
        ESLVal $3046 = _v1716.termRef(1);
        ESLVal $3045 = _v1716.termRef(2);
        ESLVal $3044 = _v1716.termRef(3);
        
        {ESLVal names = $3047;
        
        {ESLVal valueEnv = $3046;
        
        {ESLVal cnstrEnv = $3045;
        
        {ESLVal typeEnv = $3044;
        
        return names;
      }
      }
      }
      }
      }
    case "Undefined": {
        return $nil;
      }
      default: return error(new ESLVal("case error at Pos(1724,1845)").add(ESLVal.list(_v1716)));
    }
    }
  }
  public static ESLVal getCachedModuleExportedMethodNames = new ESLVal(new Function(new ESLVal("getCachedModuleExportedMethodNames"),null) { public ESLVal apply(ESLVal... args) { return getCachedModuleExportedMethodNames(args[0]); }});
public static void main(String[] args) {
  }
}