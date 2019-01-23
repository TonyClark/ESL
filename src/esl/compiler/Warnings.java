package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
import static esl.Displays.*;
public class Warnings {
  public static ESLVal getSelf() { return $null; }
  
public static ESLVal resetWarnings() {
    
    return setWarnings($nil);
  }
  public static ESLVal resetWarnings = new ESLVal(new Function(new ESLVal("resetWarnings"),null) { public ESLVal apply(ESLVal... args) { return resetWarnings(); }});
  public static ESLVal getWarnings() {
    
    return edb.ref("getProperty").apply(new ESLVal("$WARNINGS"));
  }
  public static ESLVal getWarnings = new ESLVal(new Function(new ESLVal("getWarnings"),null) { public ESLVal apply(ESLVal... args) { return getWarnings(); }});
  public static ESLVal setWarnings(ESLVal warnings) {
    
    return edb.ref("setProperty").apply(new ESLVal("$WARNINGS"),warnings);
  }
  public static ESLVal setWarnings = new ESLVal(new Function(new ESLVal("setWarnings"),null) { public ESLVal apply(ESLVal... args) { return setWarnings(args[0]); }});
  public static ESLVal addWarning(ESLVal l,ESLVal message) {
    
    return setWarnings(getWarnings().cons(new ESLVal("Warning",l,message)));
  }
  public static ESLVal addWarning = new ESLVal(new Function(new ESLVal("addWarning"),null) { public ESLVal apply(ESLVal... args) { return addWarning(args[0],args[1]); }});
public static void main(String[] args) {
  }
}