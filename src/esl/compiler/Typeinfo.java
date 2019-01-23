package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class Typeinfo {
  public static ESLVal getSelf() { return $null; }
  
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
public static void main(String[] args) {
  }
}