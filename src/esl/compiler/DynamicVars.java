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
  {ESLVal _v825 = d;
        
        switch(_v825.termName) {
        case "JDec": {ESLVal $1375 = _v825.termRef(0);
          ESLVal $1374 = _v825.termRef(1);
          
          {ESLVal n = $1375;
          
          {ESLVal t = $1374;
          
          return n;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(156,201)").add(ESLVal.list(_v825)));
      }
      }
    }
  });
  private static ESLVal fieldName = new ESLVal(new Function(new ESLVal("fieldName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v824 = d;
        
        switch(_v824.termName) {
        case "JField": {ESLVal $1373 = _v824.termRef(0);
          ESLVal $1372 = _v824.termRef(1);
          ESLVal $1371 = _v824.termRef(2);
          
          {ESLVal n = $1373;
          
          {ESLVal t = $1372;
          
          {ESLVal e = $1371;
          
          return n;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(236,290)").add(ESLVal.list(_v824)));
      }
      }
    }
  });
  private static ESLVal fieldJExp = new ESLVal(new Function(new ESLVal("fieldJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v823 = d;
        
        switch(_v823.termName) {
        case "JField": {ESLVal $1370 = _v823.termRef(0);
          ESLVal $1369 = _v823.termRef(1);
          ESLVal $1368 = _v823.termRef(2);
          
          {ESLVal n = $1370;
          
          {ESLVal t = $1369;
          
          {ESLVal e = $1368;
          
          return e;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(326,380)").add(ESLVal.list(_v823)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJModule = new ESLVal(new Function(new ESLVal("dynamicVarsJModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v820 = m;
        
        switch(_v820.termName) {
        case "JModule": {ESLVal $1364 = _v820.termRef(0);
          ESLVal $1363 = _v820.termRef(1);
          ESLVal $1362 = _v820.termRef(2);
          ESLVal $1361 = _v820.termRef(3);
          
          {ESLVal n = $1364;
          
          {ESLVal exports = $1363;
          
          {ESLVal imports = $1362;
          
          {ESLVal fs = $1361;
          
          {{
          ESLVal _v821 = fs;
          while(_v821.isCons()) {
            ESLVal f = _v821.headVal;
            ((Supplier<ESLVal>)() -> { 
              {ESLVal _v822 = f;
                
                switch(_v822.termName) {
                case "JField": {ESLVal $1367 = _v822.termRef(0);
                  ESLVal $1366 = _v822.termRef(1);
                  ESLVal $1365 = _v822.termRef(2);
                  
                  {ESLVal name = $1367;
                  
                  {ESLVal t = $1366;
                  
                  {ESLVal e = $1365;
                  
                  return dynamicVarsJExp.apply(e);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(540,638)").add(ESLVal.list(_v822)));
              }
              }
            }).get();
            _v821 = _v821.tailVal;}
        }
        return $null;}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(420,650)").add(ESLVal.list(_v820)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJExp = new ESLVal(new Function(new ESLVal("dynamicVarsJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v817 = x;
        
        switch(_v817.termName) {
        case "JArrayRef": {ESLVal $1357 = _v817.termRef(0);
          ESLVal $1356 = _v817.termRef(1);
          
          {ESLVal a = $1357;
          
          {ESLVal i = $1356;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $1355 = _v817.termRef(0);
          ESLVal $1354 = _v817.termRef(1);
          ESLVal $1353 = _v817.termRef(2);
          
          {ESLVal a = $1355;
          
          {ESLVal i = $1354;
          
          {ESLVal v = $1353;
          
          return dynamicVarsJExp.apply(a).add(dynamicVarsJExp.apply(i).add(dynamicVarsJExp.apply(v)));
        }
        }
        }
        }
      case "JBecome": {ESLVal $1352 = _v817.termRef(0);
          ESLVal $1351 = _v817.termRef(1);
          
          {ESLVal e = $1352;
          
          {ESLVal es = $1351;
          
          return dynamicVarsJExp.apply(e).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun637"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v827 = $args[0];
          return dynamicVarsJExp.apply(_v827);
            }
          }),es)));
        }
        }
        }
      case "JFun": {ESLVal $1350 = _v817.termRef(0);
          ESLVal $1349 = _v817.termRef(1);
          ESLVal $1348 = _v817.termRef(2);
          ESLVal $1347 = _v817.termRef(3);
          
          {ESLVal v0 = $1350;
          
          {ESLVal v1 = $1349;
          
          {ESLVal v2 = $1348;
          
          {ESLVal v3 = $1347;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun638"),getSelf()) {
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
      case "JApply": {ESLVal $1346 = _v817.termRef(0);
          ESLVal $1345 = _v817.termRef(1);
          
          {ESLVal v0 = $1346;
          
          {ESLVal v1 = $1345;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun639"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JBinExp": {ESLVal $1344 = _v817.termRef(0);
          ESLVal $1343 = _v817.termRef(1);
          ESLVal $1342 = _v817.termRef(2);
          
          {ESLVal v0 = $1344;
          
          {ESLVal v1 = $1343;
          
          {ESLVal v2 = $1342;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v2));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $1341 = _v817.termRef(0);
          ESLVal $1340 = _v817.termRef(1);
          
          {ESLVal v0 = $1341;
          
          {ESLVal v1 = $1340;
          
          return dynamicVarsJCommand.apply(v0);
        }
        }
        }
      case "JIfExp": {ESLVal $1339 = _v817.termRef(0);
          ESLVal $1338 = _v817.termRef(1);
          ESLVal $1337 = _v817.termRef(2);
          
          {ESLVal v0 = $1339;
          
          {ESLVal v1 = $1338;
          
          {ESLVal v2 = $1337;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $1336 = _v817.termRef(0);
          
          {ESLVal v0 = $1336;
          
          return ESLVal.list();
        }
        }
      case "JCmpExp": {ESLVal $1335 = _v817.termRef(0);
          
          {ESLVal c = $1335;
          
          return ESLVal.list();
        }
        }
      case "JTerm": {ESLVal $1334 = _v817.termRef(0);
          ESLVal $1333 = _v817.termRef(1);
          
          {ESLVal v0 = $1334;
          
          {ESLVal v1 = $1333;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun640"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JTermRef": {ESLVal $1332 = _v817.termRef(0);
          ESLVal $1331 = _v817.termRef(1);
          
          {ESLVal v0 = $1332;
          
          {ESLVal v1 = $1331;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JList": {ESLVal $1330 = _v817.termRef(0);
          ESLVal $1329 = _v817.termRef(1);
          
          {ESLVal v0 = $1330;
          
          {ESLVal v1 = $1329;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun641"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JBag": {ESLVal $1328 = _v817.termRef(0);
          ESLVal $1327 = _v817.termRef(1);
          
          {ESLVal v0 = $1328;
          
          {ESLVal v1 = $1327;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun642"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JSet": {ESLVal $1326 = _v817.termRef(0);
          ESLVal $1325 = _v817.termRef(1);
          
          {ESLVal v0 = $1326;
          
          {ESLVal v1 = $1325;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun643"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1));
        }
        }
        }
      case "JNil": {ESLVal $1324 = _v817.termRef(0);
          
          {ESLVal v0 = $1324;
          
          return ESLVal.list();
        }
        }
      case "JVar": {ESLVal $1323 = _v817.termRef(0);
          ESLVal $1322 = _v817.termRef(1);
          
          {ESLVal v0 = $1323;
          
          {ESLVal v1 = $1322;
          
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
      case "JError": {ESLVal $1321 = _v817.termRef(0);
          
          {ESLVal v0 = $1321;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JHead": {ESLVal $1320 = _v817.termRef(0);
          
          {ESLVal v0 = $1320;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JTail": {ESLVal $1319 = _v817.termRef(0);
          
          {ESLVal v0 = $1319;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JMapFun": {ESLVal $1318 = _v817.termRef(0);
          ESLVal $1317 = _v817.termRef(1);
          
          {ESLVal v0 = $1318;
          
          {ESLVal v1 = $1317;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JFlatten": {ESLVal $1316 = _v817.termRef(0);
          
          {ESLVal v0 = $1316;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNot": {ESLVal $1315 = _v817.termRef(0);
          
          {ESLVal v0 = $1315;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JBehaviour": {ESLVal $1314 = _v817.termRef(0);
          ESLVal $1313 = _v817.termRef(1);
          ESLVal $1312 = _v817.termRef(2);
          ESLVal $1311 = _v817.termRef(3);
          ESLVal $1310 = _v817.termRef(4);
          
          {ESLVal v0 = $1314;
          
          {ESLVal v1 = $1313;
          
          {ESLVal v2 = $1312;
          
          {ESLVal v3 = $1311;
          
          {ESLVal v4 = $1310;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun644"),getSelf()) {
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
      case "JExtendedBehaviour": {ESLVal $1309 = _v817.termRef(0);
          ESLVal $1308 = _v817.termRef(1);
          ESLVal $1307 = _v817.termRef(2);
          ESLVal $1306 = _v817.termRef(3);
          ESLVal $1305 = _v817.termRef(4);
          ESLVal $1304 = _v817.termRef(5);
          
          {ESLVal v0 = $1309;
          
          {ESLVal parent = $1308;
          
          {ESLVal v1 = $1307;
          
          {ESLVal v2 = $1306;
          
          {ESLVal v3 = $1305;
          
          {ESLVal v4 = $1304;
          
          return dynamicVarsJExp.apply(parent).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun645"),getSelf()) {
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
      case "JNew": {ESLVal $1303 = _v817.termRef(0);
          ESLVal $1302 = _v817.termRef(1);
          
          {ESLVal v0 = $1303;
          
          {ESLVal v1 = $1302;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun646"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v1)));
        }
        }
        }
      case "JNewArray": {ESLVal $1301 = _v817.termRef(0);
          
          {ESLVal v0 = $1301;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JNewJava": {ESLVal $1300 = _v817.termRef(0);
          ESLVal $1299 = _v817.termRef(1);
          
          {ESLVal v0 = $1300;
          
          {ESLVal v1 = $1299;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun647"),getSelf()) {
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
      case "JRecord": {ESLVal $1298 = _v817.termRef(0);
          
          {ESLVal fs = $1298;
          
          return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v818 = $qualArg;
                
                switch(_v818.termName) {
                case "JField": {ESLVal $1360 = _v818.termRef(0);
                  ESLVal $1359 = _v818.termRef(1);
                  ESLVal $1358 = _v818.termRef(2);
                  
                  {ESLVal n = $1360;
                  
                  {ESLVal t = $1359;
                  
                  {ESLVal e = $1358;
                  
                  return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v826 = $args[0];
                  {ESLVal _v819 = _v826;
                        
                        {ESLVal v = _v819;
                        
                        return ESLVal.list(ESLVal.list(v));
                      }
                      }
                    }
                  }).map(dynamicVarsJExp.apply(e)).flatten().flatten());
                }
                }
                }
                }
                default: {ESLVal _0 = _v818;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten();
        }
        }
      case "JSend": {ESLVal $1297 = _v817.termRef(0);
          ESLVal $1296 = _v817.termRef(1);
          ESLVal $1295 = _v817.termRef(2);
          
          {ESLVal v0 = $1297;
          
          {ESLVal v1 = $1296;
          
          {ESLVal v2 = $1295;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun648"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v2)));
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $1294 = _v817.termRef(0);
          
          {ESLVal e = $1294;
          
          return dynamicVarsJExp.apply(e);
        }
        }
      case "JSendTimeSuper": {
          return ESLVal.list();
        }
      case "JSelf": {
          return ESLVal.list();
        }
      case "JTry": {ESLVal $1293 = _v817.termRef(0);
          ESLVal $1292 = _v817.termRef(1);
          ESLVal $1291 = _v817.termRef(2);
          
          {ESLVal e = $1293;
          
          {ESLVal n = $1292;
          
          {ESLVal c = $1291;
          
          return dynamicVarsJExp.apply(e).add(dynamicVarsJCommand.apply(c));
        }
        }
        }
        }
      case "JRef": {ESLVal $1290 = _v817.termRef(0);
          ESLVal $1289 = _v817.termRef(1);
          
          {ESLVal v0 = $1290;
          
          {ESLVal v1 = $1289;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
        }
      case "JRefSuper": {ESLVal $1288 = _v817.termRef(0);
          
          {ESLVal n = $1288;
          
          return ESLVal.list();
        }
        }
      case "JGrab": {ESLVal $1287 = _v817.termRef(0);
          ESLVal $1286 = _v817.termRef(1);
          
          {ESLVal v0 = $1287;
          
          {ESLVal v1 = $1286;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun649"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJExp.apply(e);
            }
          }),v0)).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JProbably": {ESLVal $1285 = _v817.termRef(0);
          ESLVal $1284 = _v817.termRef(1);
          ESLVal $1283 = _v817.termRef(2);
          
          {ESLVal v0 = $1285;
          
          {ESLVal v1 = $1284;
          
          {ESLVal v2 = $1283;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJExp.apply(v2)));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(726,4167)").add(ESLVal.list(_v817)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJFieldDef = new ESLVal(new Function(new ESLVal("dynamicVarsJFieldDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v816 = d;
        
        switch(_v816.termName) {
        case "JField": {ESLVal $1282 = _v816.termRef(0);
          ESLVal $1281 = _v816.termRef(1);
          ESLVal $1280 = _v816.termRef(2);
          
          {ESLVal n = $1282;
          
          {ESLVal t = $1281;
          
          {ESLVal e = $1280;
          
          return dynamicVarsJExp.apply(e);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4217,4288)").add(ESLVal.list(_v816)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJTermArm = new ESLVal(new Function(new ESLVal("dynamicVarsJTermArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v815 = t;
        
        switch(_v815.termName) {
        case "JTArm": {ESLVal $1279 = _v815.termRef(0);
          ESLVal $1278 = _v815.termRef(1);
          ESLVal $1277 = _v815.termRef(2);
          
          {ESLVal n = $1279;
          
          {ESLVal i = $1278;
          
          {ESLVal c = $1277;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4335,4411)").add(ESLVal.list(_v815)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJIntArm = new ESLVal(new Function(new ESLVal("dynamicVarsJIntArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v814 = t;
        
        switch(_v814.termName) {
        case "JIArm": {ESLVal $1276 = _v814.termRef(0);
          ESLVal $1275 = _v814.termRef(1);
          
          {ESLVal i = $1276;
          
          {ESLVal c = $1275;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4456,4525)").add(ESLVal.list(_v814)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJStrArm = new ESLVal(new Function(new ESLVal("dynamicVarsJStrArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v813 = t;
        
        switch(_v813.termName) {
        case "JSArm": {ESLVal $1274 = _v813.termRef(0);
          ESLVal $1273 = _v813.termRef(1);
          
          {ESLVal s = $1274;
          
          {ESLVal c = $1273;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4570,4639)").add(ESLVal.list(_v813)));
      }
      }
    }
  });
  private static ESLVal dynamicVarsJBoolArm = new ESLVal(new Function(new ESLVal("dynamicVarsJBoolArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v812 = t;
        
        switch(_v812.termName) {
        case "JBArm": {ESLVal $1272 = _v812.termRef(0);
          ESLVal $1271 = _v812.termRef(1);
          
          {ESLVal b = $1272;
          
          {ESLVal c = $1271;
          
          return dynamicVarsJCommand.apply(c);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4686,4757)").add(ESLVal.list(_v812)));
      }
      }
    }
  });
  public static ESLVal dynamicVarsJCommand = new ESLVal(new Function(new ESLVal("dynamicVarsJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v811 = x;
        
        switch(_v811.termName) {
        case "JBlock": {ESLVal $1270 = _v811.termRef(0);
          
          {ESLVal v0 = $1270;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun650"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal e = $args[0];
          return dynamicVarsJCommand.apply(e);
            }
          }),v0));
        }
        }
      case "JReturn": {ESLVal $1269 = _v811.termRef(0);
          
          {ESLVal v0 = $1269;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JIfCommand": {ESLVal $1268 = _v811.termRef(0);
          ESLVal $1267 = _v811.termRef(1);
          ESLVal $1266 = _v811.termRef(2);
          
          {ESLVal v0 = $1268;
          
          {ESLVal v1 = $1267;
          
          {ESLVal v2 = $1266;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $1265 = _v811.termRef(0);
          ESLVal $1264 = _v811.termRef(1);
          ESLVal $1263 = _v811.termRef(2);
          ESLVal $1262 = _v811.termRef(3);
          
          {ESLVal v0 = $1265;
          
          {ESLVal v1 = $1264;
          
          {ESLVal v2 = $1263;
          
          {ESLVal v3 = $1262;
          
          return dynamicVarsJExp.apply(v0).add(dynamicVarsJCommand.apply(v1).add(dynamicVarsJCommand.apply(v2).add(dynamicVarsJCommand.apply(v3))));
        }
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $1261 = _v811.termRef(0);
          ESLVal $1260 = _v811.termRef(1);
          ESLVal $1259 = _v811.termRef(2);
          
          {ESLVal v0 = $1261;
          
          {ESLVal v1 = $1260;
          
          {ESLVal v2 = $1259;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun651"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJTermArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $1258 = _v811.termRef(0);
          ESLVal $1257 = _v811.termRef(1);
          ESLVal $1256 = _v811.termRef(2);
          
          {ESLVal v0 = $1258;
          
          {ESLVal v1 = $1257;
          
          {ESLVal v2 = $1256;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun652"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJIntArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $1255 = _v811.termRef(0);
          ESLVal $1254 = _v811.termRef(1);
          ESLVal $1253 = _v811.termRef(2);
          
          {ESLVal v0 = $1255;
          
          {ESLVal v1 = $1254;
          
          {ESLVal v2 = $1253;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun653"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJStrArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $1252 = _v811.termRef(0);
          ESLVal $1251 = _v811.termRef(1);
          ESLVal $1250 = _v811.termRef(2);
          
          {ESLVal v0 = $1252;
          
          {ESLVal v1 = $1251;
          
          {ESLVal v2 = $1250;
          
          return dynamicVarsJExp.apply(v0).add(flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun654"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal t = $args[0];
          return dynamicVarsJBoolArm.apply(t);
            }
          }),v1)).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
      case "JLet": {ESLVal $1249 = _v811.termRef(0);
          ESLVal $1248 = _v811.termRef(1);
          
          {ESLVal v0 = $1249;
          
          {ESLVal v1 = $1248;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun655"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun656"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JPLet": {ESLVal $1247 = _v811.termRef(0);
          ESLVal $1246 = _v811.termRef(1);
          
          {ESLVal v0 = $1247;
          
          {ESLVal v1 = $1246;
          
          return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun657"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(reject.apply(new ESLVal(new Function(new ESLVal("fun658"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JLetRec": {ESLVal $1245 = _v811.termRef(0);
          ESLVal $1244 = _v811.termRef(1);
          
          {ESLVal v0 = $1245;
          
          {ESLVal v1 = $1244;
          
          return reject.apply(new ESLVal(new Function(new ESLVal("fun659"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal n = $args[0];
          return member.apply(n,map.apply(fieldName,v0));
            }
          }),flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun660"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal f = $args[0];
          return dynamicVarsJExp.apply(fieldJExp.apply(f));
            }
          }),v0)).add(dynamicVarsJCommand.apply(v1)));
        }
        }
        }
      case "JUpdate": {ESLVal $1243 = _v811.termRef(0);
          ESLVal $1242 = _v811.termRef(1);
          
          {ESLVal v0 = $1243;
          
          {ESLVal v1 = $1242;
          
          return ESLVal.list(v0).add(dynamicVarsJExp.apply(v1));
        }
        }
        }
      case "JStatement": {ESLVal $1241 = _v811.termRef(0);
          
          {ESLVal v0 = $1241;
          
          return dynamicVarsJExp.apply(v0);
        }
        }
      case "JFor": {ESLVal $1240 = _v811.termRef(0);
          ESLVal $1239 = _v811.termRef(1);
          ESLVal $1238 = _v811.termRef(2);
          ESLVal $1237 = _v811.termRef(3);
          
          {ESLVal listName = $1240;
          
          {ESLVal v0 = $1239;
          
          {ESLVal v1 = $1238;
          
          {ESLVal v2 = $1237;
          
          return ESLVal.list(listName).add(dynamicVarsJExp.apply(v1).add(dynamicVarsJCommand.apply(v2)));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4847,7018)").add(ESLVal.list(_v811)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}