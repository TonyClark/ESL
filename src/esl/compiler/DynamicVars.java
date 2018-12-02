package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class DynamicVars {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v780 = d;
        
        switch(_v780.termName) {
        case "JDec": {ESLVal $1238 = _v780.termRef(0);
          ESLVal $1237 = _v780.termRef(1);
          
          {ESLVal n = $1238;
          
          {ESLVal t = $1237;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(156,201)").add(ESLVal.list(_v780)));
      }
      }
    }
  });
  private static ESLVal fieldName = new ESLVal(new Function(new ESLVal("fieldName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v781 = d;
        
        switch(_v781.termName) {
        case "JField": {ESLVal $1241 = _v781.termRef(0);
          ESLVal $1240 = _v781.termRef(1);
          ESLVal $1239 = _v781.termRef(2);
          
          {ESLVal n = $1241;
          
          {ESLVal t = $1240;
          
          {ESLVal e = $1239;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(236,290)").add(ESLVal.list(_v781)));
      }
      }
    }
  });
  private static ESLVal fieldJExp = new ESLVal(new Function(new ESLVal("fieldJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v782 = d;
        
        switch(_v782.termName) {
        case "JField": {ESLVal $1244 = _v782.termRef(0);
          ESLVal $1243 = _v782.termRef(1);
          ESLVal $1242 = _v782.termRef(2);
          
          {ESLVal n = $1244;
          
          {ESLVal t = $1243;
          
          {ESLVal e = $1242;
          
          return e;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(326,380)").add(ESLVal.list(_v782)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJModule = new ESLVal(new Function(new ESLVal("dynamicVarsJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v783 = m;
        
        switch(_v783.termName) {
        case "JModule": {ESLVal $1248 = _v783.termRef(0);
          ESLVal $1247 = _v783.termRef(1);
          ESLVal $1246 = _v783.termRef(2);
          ESLVal $1245 = _v783.termRef(3);
          
          {ESLVal n = $1248;
          
          {ESLVal exports = $1247;
          
          {ESLVal imports = $1246;
          
          {ESLVal fs = $1245;
          
          {{
          ESLVal _v784 = fs;
          while(_v784.isCons()) {
            ESLVal f = _v784.headVal;
            ((Supplier<ESLVal>)() -> { 
              {ESLVal _v785 = f;
                
                switch(_v785.termName) {
                case "JField": {ESLVal $1251 = _v785.termRef(0);
                  ESLVal $1250 = _v785.termRef(1);
                  ESLVal $1249 = _v785.termRef(2);
                  
                  {ESLVal name = $1251;
                  
                  {ESLVal t = $1250;
                  
                  {ESLVal e = $1249;
                  
                  return dynamicVarsJExp.apply(e);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(540,638)").add(ESLVal.list(_v785)));
              }
              }
            }).get();
            _v784 = _v784.tailVal;}
        }
        return $null;}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(420,650)").add(ESLVal.list(_v783)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJExp = new ESLVal(new Function(new ESLVal("dynamicVarsJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v786 = x;
        
        switch(_v786.termName) {
        case "JArrayRef": {ESLVal $1326 = _v786.termRef(0);
          ESLVal $1325 = _v786.termRef(1);
          
          {ESLVal a = $1326;
          
          {ESLVal i = $1325;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $1324 = _v786.termRef(0);
          ESLVal $1323 = _v786.termRef(1);
          ESLVal $1322 = _v786.termRef(2);
          
          {ESLVal a = $1324;
          
          {ESLVal i = $1323;
          
          {ESLVal v = $1322;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i).add(dynamicVarsJExp.apply(v)));
        }
        }
        }
        }
      case "JBecome": {ESLVal $1321 = _v786.termRef(0);
          ESLVal $1320 = _v786.termRef(1);
          
          {ESLVal e = $1321;
          
          {ESLVal es = $1320;
          
          return dynamicVarsJExp.apply(e).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun479"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v794 = $args[0];
          return dynamicVarsJExp.apply(_v794);
            }
          }),es)));
        }
        }
        }
      case "JFun": {ESLVal $1319 = _v786.termRef(0);
          ESLVal $1318 = _v786.termRef(1);
          ESLVal $1317 = _v786.termRef(2);
          ESLVal $1316 = _v786.termRef(3);
          
          {ESLVal v0 = $1319;
          
          {ESLVal v1 = $1318;
          
          {ESLVal v2 = $1317;
          
          {ESLVal v3 = $1316;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun480"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(decName,v1));
            }
          }),dynamicVarsJCommand.apply(v3));
        }
        }
        }
        }
        }
      case "JApply": {ESLVal $1315 = _v786.termRef(0);
          ESLVal $1314 = _v786.termRef(1);
          
          {ESLVal v0 = $1315;
          
          {ESLVal v1 = $1314;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun481"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JBinExp": {ESLVal $1313 = _v786.termRef(0);
          ESLVal $1312 = _v786.termRef(1);
          ESLVal $1311 = _v786.termRef(2);
          
          {ESLVal v0 = $1313;
          
          {ESLVal v1 = $1312;
          
          {ESLVal v2 = $1311;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v2));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $1310 = _v786.termRef(0);
          ESLVal $1309 = _v786.termRef(1);
          
          {ESLVal v0 = $1310;
          
          {ESLVal v1 = $1309;
          
          return dynamicVarsJCommand.apply(v0);
        }
        }
        }
      case "JIfExp": {ESLVal $1308 = _v786.termRef(0);
          ESLVal $1307 = _v786.termRef(1);
          ESLVal $1306 = _v786.termRef(2);
          
          {ESLVal v0 = $1308;
          
          {ESLVal v1 = $1307;
          
          {ESLVal v2 = $1306;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $1305 = _v786.termRef(0);
          
          {ESLVal v0 = $1305;
          
          return ESLVal.list();
        }
        }
      case "JCmpExp": {ESLVal $1304 = _v786.termRef(0);
          
          {ESLVal c = $1304;
          
          return ESLVal.list();
        }
        }
      case "JTerm": {ESLVal $1303 = _v786.termRef(0);
          ESLVal $1302 = _v786.termRef(1);
          
          {ESLVal v0 = $1303;
          
          {ESLVal v1 = $1302;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun482"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JTermRef": {ESLVal $1301 = _v786.termRef(0);
          ESLVal $1300 = _v786.termRef(1);
          
          {ESLVal v0 = $1301;
          
          {ESLVal v1 = $1300;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JList": {ESLVal $1299 = _v786.termRef(0);
          ESLVal $1298 = _v786.termRef(1);
          
          {ESLVal v0 = $1299;
          
          {ESLVal v1 = $1298;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun483"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JBag": {ESLVal $1297 = _v786.termRef(0);
          ESLVal $1296 = _v786.termRef(1);
          
          {ESLVal v0 = $1297;
          
          {ESLVal v1 = $1296;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun484"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JSet": {ESLVal $1295 = _v786.termRef(0);
          ESLVal $1294 = _v786.termRef(1);
          
          {ESLVal v0 = $1295;
          
          {ESLVal v1 = $1294;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun485"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNil": {ESLVal $1293 = _v786.termRef(0);
          
          {ESLVal v0 = $1293;
          
          return ESLVal.list();
        }
        }
      case "JVar": {ESLVal $1292 = _v786.termRef(0);
          ESLVal $1291 = _v786.termRef(1);
          
          {ESLVal v0 = $1292;
          
          {ESLVal v1 = $1291;
          
          return ESLVal.list();
        }
        }
        }
      case "JNull": {
          return ESLVal.list();
        }
      case "JNow": {
          return ESLVal.list();
        }
      case "JError": {ESLVal $1290 = _v786.termRef(0);
          
          {ESLVal v0 = $1290;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JHead": {ESLVal $1289 = _v786.termRef(0);
          
          {ESLVal v0 = $1289;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JTail": {ESLVal $1288 = _v786.termRef(0);
          
          {ESLVal v0 = $1288;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JMapFun": {ESLVal $1287 = _v786.termRef(0);
          ESLVal $1286 = _v786.termRef(1);
          
          {ESLVal v0 = $1287;
          
          {ESLVal v1 = $1286;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JFlatten": {ESLVal $1285 = _v786.termRef(0);
          
          {ESLVal v0 = $1285;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNot": {ESLVal $1284 = _v786.termRef(0);
          
          {ESLVal v0 = $1284;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JBehaviour": {ESLVal $1283 = _v786.termRef(0);
          ESLVal $1282 = _v786.termRef(1);
          ESLVal $1281 = _v786.termRef(2);
          ESLVal $1280 = _v786.termRef(3);
          ESLVal $1279 = _v786.termRef(4);
          
          {ESLVal v0 = $1283;
          
          {ESLVal v1 = $1282;
          
          {ESLVal v2 = $1281;
          
          {ESLVal v3 = $1280;
          
          {ESLVal v4 = $1279;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun486"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return dynamicVarsJFieldDef.apply(d);
            }
          }),v1)).add(dynamicVarsJExp.apply(v2).add(dynamicVarsJExp.apply(v3).add(dynamicVarsJCommand.apply(v4))));
        }
        }
        }
        }
        }
        }
      case "JExtendedBehaviour": {ESLVal $1278 = _v786.termRef(0);
          ESLVal $1277 = _v786.termRef(1);
          ESLVal $1276 = _v786.termRef(2);
          ESLVal $1275 = _v786.termRef(3);
          ESLVal $1274 = _v786.termRef(4);
          ESLVal $1273 = _v786.termRef(5);
          
          {ESLVal v0 = $1278;
          
          {ESLVal parent = $1277;
          
          {ESLVal v1 = $1276;
          
          {ESLVal v2 = $1275;
          
          {ESLVal v3 = $1274;
          
          {ESLVal v4 = $1273;
          
          return dynamicVarsJExp.apply(parent).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun487"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return dynamicVarsJFieldDef.apply(d);
            }
          }),v1)).add(dynamicVarsJExp.apply(v2).add(dynamicVarsJExp.apply(v3).add(dynamicVarsJCommand.apply(v4)))));
        }
        }
        }
        }
        }
        }
        }
      case "JNew": {ESLVal $1272 = _v786.termRef(0);
          ESLVal $1271 = _v786.termRef(1);
          
          {ESLVal v0 = $1272;
          
          {ESLVal v1 = $1271;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun488"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JNewArray": {ESLVal $1270 = _v786.termRef(0);
          
          {ESLVal v0 = $1270;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNewJava": {ESLVal $1269 = _v786.termRef(0);
          ESLVal $1268 = _v786.termRef(1);
          
          {ESLVal v0 = $1269;
          
          {ESLVal v1 = $1268;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun489"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNewTable": {
          return ESLVal.list();
        }
      case "JRecord": {ESLVal $1267 = _v786.termRef(0);
          
          {ESLVal fs = $1267;
          
          return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v787 = $qualArg;
                
                switch(_v787.termName) {
                case "JField": {ESLVal $1329 = _v787.termRef(0);
                  ESLVal $1328 = _v787.termRef(1);
                  ESLVal $1327 = _v787.termRef(2);
                  
                  {ESLVal n = $1329;
                  
                  {ESLVal t = $1328;
                  
                  {ESLVal e = $1327;
                  
                  return ESLVal.list(new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal v = $l0.head();
                        $l0 = $l0.tail();
                        $v.add(v);
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(dynamicVarsJExp.apply(e)));
                }
                }
                }
                }
                default: {ESLVal _0 = _v787;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        }
        }
      case "JSend": {ESLVal $1266 = _v786.termRef(0);
          ESLVal $1265 = _v786.termRef(1);
          ESLVal $1264 = _v786.termRef(2);
          
          {ESLVal v0 = $1266;
          
          {ESLVal v1 = $1265;
          
          {ESLVal v2 = $1264;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun490"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v2)));
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $1263 = _v786.termRef(0);
          
          {ESLVal e = $1263;
          
          return dynamicVarsJExp.apply(e);
        }
        }
      case "JSendTimeSuper": {
          return ESLVal.list();
        }
      case "JSelf": {
          return ESLVal.list();
        }
      case "JTry": {ESLVal $1262 = _v786.termRef(0);
          ESLVal $1261 = _v786.termRef(1);
          ESLVal $1260 = _v786.termRef(2);
          
          {ESLVal e = $1262;
          
          {ESLVal n = $1261;
          
          {ESLVal c = $1260;
          
          return dynamicVarsJExp.apply(e).add(dynamicVarsJCommand.apply(c));
        }
        }
        }
        }
      case "JRef": {ESLVal $1259 = _v786.termRef(0);
          ESLVal $1258 = _v786.termRef(1);
          
          {ESLVal v0 = $1259;
          
          {ESLVal v1 = $1258;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JRefSuper": {ESLVal $1257 = _v786.termRef(0);
          
          {ESLVal n = $1257;
          
          return ESLVal.list();
        }
        }
      case "JGrab": {ESLVal $1256 = _v786.termRef(0);
          ESLVal $1255 = _v786.termRef(1);
          
          {ESLVal v0 = $1256;
          
          {ESLVal v1 = $1255;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun491"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v0)).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JProbably": {ESLVal $1254 = _v786.termRef(0);
          ESLVal $1253 = _v786.termRef(1);
          ESLVal $1252 = _v786.termRef(2);
          
          {ESLVal v0 = $1254;
          
          {ESLVal v1 = $1253;
          
          {ESLVal v2 = $1252;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(726,4167)").add(ESLVal.list(_v786)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJFieldDef = new ESLVal(new Function(new ESLVal("dynamicVarsJFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v788 = d;
        
        switch(_v788.termName) {
        case "JField": {ESLVal $1332 = _v788.termRef(0);
          ESLVal $1331 = _v788.termRef(1);
          ESLVal $1330 = _v788.termRef(2);
          
          {ESLVal n = $1332;
          
          {ESLVal t = $1331;
          
          {ESLVal e = $1330;
          
          return dynamicVarsJExp.apply(e);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4217,4288)").add(ESLVal.list(_v788)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJTermArm = new ESLVal(new Function(new ESLVal("dynamicVarsJTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v789 = t;
        
        switch(_v789.termName) {
        case "JTArm": {ESLVal $1335 = _v789.termRef(0);
          ESLVal $1334 = _v789.termRef(1);
          ESLVal $1333 = _v789.termRef(2);
          
          {ESLVal n = $1335;
          
          {ESLVal i = $1334;
          
          {ESLVal c = $1333;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4335,4411)").add(ESLVal.list(_v789)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJIntArm = new ESLVal(new Function(new ESLVal("dynamicVarsJIntArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v790 = t;
        
        switch(_v790.termName) {
        case "JIArm": {ESLVal $1337 = _v790.termRef(0);
          ESLVal $1336 = _v790.termRef(1);
          
          {ESLVal i = $1337;
          
          {ESLVal c = $1336;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4456,4525)").add(ESLVal.list(_v790)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJStrArm = new ESLVal(new Function(new ESLVal("dynamicVarsJStrArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v791 = t;
        
        switch(_v791.termName) {
        case "JSArm": {ESLVal $1339 = _v791.termRef(0);
          ESLVal $1338 = _v791.termRef(1);
          
          {ESLVal s = $1339;
          
          {ESLVal c = $1338;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4570,4639)").add(ESLVal.list(_v791)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJBoolArm = new ESLVal(new Function(new ESLVal("dynamicVarsJBoolArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v792 = t;
        
        switch(_v792.termName) {
        case "JBArm": {ESLVal $1341 = _v792.termRef(0);
          ESLVal $1340 = _v792.termRef(1);
          
          {ESLVal b = $1341;
          
          {ESLVal c = $1340;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4686,4757)").add(ESLVal.list(_v792)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJCommand = new ESLVal(new Function(new ESLVal("dynamicVarsJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v793 = x;
        
        switch(_v793.termName) {
        case "JBlock": {ESLVal $1375 = _v793.termRef(0);
          
          {ESLVal v0 = $1375;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun492"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJCommand.apply(e);
            }
          }),v0));
        }
        }
      case "JReturn": {ESLVal $1374 = _v793.termRef(0);
          
          {ESLVal v0 = $1374;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JIfCommand": {ESLVal $1373 = _v793.termRef(0);
          ESLVal $1372 = _v793.termRef(1);
          ESLVal $1371 = _v793.termRef(2);
          
          {ESLVal v0 = $1373;
          
          {ESLVal v1 = $1372;
          
          {ESLVal v2 = $1371;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $1370 = _v793.termRef(0);
          ESLVal $1369 = _v793.termRef(1);
          ESLVal $1368 = _v793.termRef(2);
          ESLVal $1367 = _v793.termRef(3);
          
          {ESLVal v0 = $1370;
          
          {ESLVal v1 = $1369;
          
          {ESLVal v2 = $1368;
          
          {ESLVal v3 = $1367;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2).add(dynamicVarsJCommand.apply(v3))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $1366 = _v793.termRef(0);
          ESLVal $1365 = _v793.termRef(1);
          ESLVal $1364 = _v793.termRef(2);
          
          {ESLVal v0 = $1366;
          
          {ESLVal v1 = $1365;
          
          {ESLVal v2 = $1364;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun493"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJTermArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $1363 = _v793.termRef(0);
          ESLVal $1362 = _v793.termRef(1);
          ESLVal $1361 = _v793.termRef(2);
          
          {ESLVal v0 = $1363;
          
          {ESLVal v1 = $1362;
          
          {ESLVal v2 = $1361;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun494"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJIntArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $1360 = _v793.termRef(0);
          ESLVal $1359 = _v793.termRef(1);
          ESLVal $1358 = _v793.termRef(2);
          
          {ESLVal v0 = $1360;
          
          {ESLVal v1 = $1359;
          
          {ESLVal v2 = $1358;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun495"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJStrArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $1357 = _v793.termRef(0);
          ESLVal $1356 = _v793.termRef(1);
          ESLVal $1355 = _v793.termRef(2);
          
          {ESLVal v0 = $1357;
          
          {ESLVal v1 = $1356;
          
          {ESLVal v2 = $1355;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun496"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJBoolArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JLet": {ESLVal $1354 = _v793.termRef(0);
          ESLVal $1353 = _v793.termRef(1);
          
          {ESLVal v0 = $1354;
          
          {ESLVal v1 = $1353;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun497"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun498"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JPLet": {ESLVal $1352 = _v793.termRef(0);
          ESLVal $1351 = _v793.termRef(1);
          
          {ESLVal v0 = $1352;
          
          {ESLVal v1 = $1351;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun499"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun500"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JLetRec": {ESLVal $1350 = _v793.termRef(0);
          ESLVal $1349 = _v793.termRef(1);
          
          {ESLVal v0 = $1350;
          
          {ESLVal v1 = $1349;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun501"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun502"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JUpdate": {ESLVal $1348 = _v793.termRef(0);
          ESLVal $1347 = _v793.termRef(1);
          
          {ESLVal v0 = $1348;
          
          {ESLVal v1 = $1347;
          
          return ESLVal.list(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JStatement": {ESLVal $1346 = _v793.termRef(0);
          
          {ESLVal v0 = $1346;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JFor": {ESLVal $1345 = _v793.termRef(0);
          ESLVal $1344 = _v793.termRef(1);
          ESLVal $1343 = _v793.termRef(2);
          ESLVal $1342 = _v793.termRef(3);
          
          {ESLVal listName = $1345;
          
          {ESLVal v0 = $1344;
          
          {ESLVal v1 = $1343;
          
          {ESLVal v2 = $1342;
          
          return ESLVal.list(listName).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4847,7018)").add(ESLVal.list(_v793)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}