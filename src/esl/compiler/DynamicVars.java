package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.Types.*;
// import static esl.Lists.*;
public class DynamicVars {
  public static ESLVal getSelf() { return $null; }
  
private static ESLVal decName(ESLVal d) {
    
    {ESLVal _v1014 = d;
      
      switch(_v1014.termName) {
      case "JDec": {ESLVal $1359 = _v1014.termRef(0);
        ESLVal $1358 = _v1014.termRef(1);
        
        {ESLVal n = $1359;
        
        {ESLVal t = $1358;
        
        return n;
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(137,182)").add(ESLVal.list(_v1014)));
    }
    }
  }
  private static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),null) { public ESLVal apply(ESLVal... args) { return decName(args[0]); }});
  private static ESLVal fieldName(ESLVal d) {
    
    {ESLVal _v1015 = d;
      
      switch(_v1015.termName) {
      case "JField": {ESLVal $1362 = _v1015.termRef(0);
        ESLVal $1361 = _v1015.termRef(1);
        ESLVal $1360 = _v1015.termRef(2);
        
        {ESLVal n = $1362;
        
        {ESLVal t = $1361;
        
        {ESLVal e = $1360;
        
        return n;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(217,272)").add(ESLVal.list(_v1015)));
    }
    }
  }
  private static ESLVal fieldName = new ESLVal(new Function(new ESLVal("fieldName"),null) { public ESLVal apply(ESLVal... args) { return fieldName(args[0]); }});
  private static ESLVal fieldJExp(ESLVal d) {
    
    {ESLVal _v1016 = d;
      
      switch(_v1016.termName) {
      case "JField": {ESLVal $1365 = _v1016.termRef(0);
        ESLVal $1364 = _v1016.termRef(1);
        ESLVal $1363 = _v1016.termRef(2);
        
        {ESLVal n = $1365;
        
        {ESLVal t = $1364;
        
        {ESLVal e = $1363;
        
        return e;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(308,362)").add(ESLVal.list(_v1016)));
    }
    }
  }
  private static ESLVal fieldJExp = new ESLVal(new Function(new ESLVal("fieldJExp"),null) { public ESLVal apply(ESLVal... args) { return fieldJExp(args[0]); }});
  public static ESLVal dynamicVarsJExp(ESLVal x) {
    
    {ESLVal _v1017 = x;
      
      switch(_v1017.termName) {
      case "JArrayRef": {ESLVal $1444 = _v1017.termRef(0);
        ESLVal $1443 = _v1017.termRef(1);
        
        {ESLVal a = $1444;
        
        {ESLVal i = $1443;
        
        return dynamicVarsJExp(a).add(dynamicVarsJExp(i));
      }
      }
      }
    case "JArrayUpdate": {ESLVal $1442 = _v1017.termRef(0);
        ESLVal $1441 = _v1017.termRef(1);
        ESLVal $1440 = _v1017.termRef(2);
        
        {ESLVal a = $1442;
        
        {ESLVal i = $1441;
        
        {ESLVal v = $1440;
        
        return dynamicVarsJExp(a).add(dynamicVarsJExp(i).add(dynamicVarsJExp(v)));
      }
      }
      }
      }
    case "JBecome": {ESLVal $1439 = _v1017.termRef(0);
        ESLVal $1438 = _v1017.termRef(1);
        
        {ESLVal e = $1439;
        
        {ESLVal es = $1438;
        
        return dynamicVarsJExp(e).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun353"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1027 = $args[0];
        return dynamicVarsJExp(_v1027);
          }
        }),es)));
      }
      }
      }
    case "JFun": {ESLVal $1437 = _v1017.termRef(0);
        ESLVal $1436 = _v1017.termRef(1);
        ESLVal $1435 = _v1017.termRef(2);
        ESLVal $1434 = _v1017.termRef(3);
        
        {ESLVal v0 = $1437;
        
        {ESLVal v1 = $1436;
        
        {ESLVal v2 = $1435;
        
        {ESLVal v3 = $1434;
        
        return reject(new ESLVal(new Function(new ESLVal("fun354"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,map(decName,v1));
          }
        }),dynamicVarsJCommand(v3));
      }
      }
      }
      }
      }
    case "JApply": {ESLVal $1433 = _v1017.termRef(0);
        ESLVal $1432 = _v1017.termRef(1);
        
        {ESLVal v0 = $1433;
        
        {ESLVal v1 = $1432;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun355"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1)));
      }
      }
      }
    case "JBinExp": {ESLVal $1431 = _v1017.termRef(0);
        ESLVal $1430 = _v1017.termRef(1);
        ESLVal $1429 = _v1017.termRef(2);
        
        {ESLVal v0 = $1431;
        
        {ESLVal v1 = $1430;
        
        {ESLVal v2 = $1429;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJExp(v2));
      }
      }
      }
      }
    case "JCommandExp": {ESLVal $1428 = _v1017.termRef(0);
        ESLVal $1427 = _v1017.termRef(1);
        
        {ESLVal v0 = $1428;
        
        {ESLVal v1 = $1427;
        
        return dynamicVarsJCommand(v0);
      }
      }
      }
    case "JIfExp": {ESLVal $1426 = _v1017.termRef(0);
        ESLVal $1425 = _v1017.termRef(1);
        ESLVal $1424 = _v1017.termRef(2);
        
        {ESLVal v0 = $1426;
        
        {ESLVal v1 = $1425;
        
        {ESLVal v2 = $1424;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJExp(v1).add(dynamicVarsJExp(v2)));
      }
      }
      }
      }
    case "JConstExp": {ESLVal $1423 = _v1017.termRef(0);
        
        {ESLVal v0 = $1423;
        
        return $nil;
      }
      }
    case "JCmpExp": {ESLVal $1422 = _v1017.termRef(0);
        
        {ESLVal c = $1422;
        
        return $nil;
      }
      }
    case "JTerm": {ESLVal $1421 = _v1017.termRef(0);
        ESLVal $1420 = _v1017.termRef(1);
        
        {ESLVal v0 = $1421;
        
        {ESLVal v1 = $1420;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun356"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1));
      }
      }
      }
    case "JTermRef": {ESLVal $1419 = _v1017.termRef(0);
        ESLVal $1418 = _v1017.termRef(1);
        
        {ESLVal v0 = $1419;
        
        {ESLVal v1 = $1418;
        
        return dynamicVarsJExp(v0);
      }
      }
      }
    case "JList": {ESLVal $1417 = _v1017.termRef(0);
        ESLVal $1416 = _v1017.termRef(1);
        
        {ESLVal v0 = $1417;
        
        {ESLVal v1 = $1416;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun357"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1));
      }
      }
      }
    case "JBag": {ESLVal $1415 = _v1017.termRef(0);
        ESLVal $1414 = _v1017.termRef(1);
        
        {ESLVal v0 = $1415;
        
        {ESLVal v1 = $1414;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun358"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1));
      }
      }
      }
    case "JSet": {ESLVal $1413 = _v1017.termRef(0);
        ESLVal $1412 = _v1017.termRef(1);
        
        {ESLVal v0 = $1413;
        
        {ESLVal v1 = $1412;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun359"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1));
      }
      }
      }
    case "JNil": {ESLVal $1411 = _v1017.termRef(0);
        
        {ESLVal v0 = $1411;
        
        return $nil;
      }
      }
    case "JVar": {ESLVal $1410 = _v1017.termRef(0);
        ESLVal $1409 = _v1017.termRef(1);
        
        {ESLVal v0 = $1410;
        
        {ESLVal v1 = $1409;
        
        return $nil;
      }
      }
      }
    case "JNull": {
        return $nil;
      }
    case "JNow": {
        return $nil;
      }
    case "JError": {ESLVal $1408 = _v1017.termRef(0);
        
        {ESLVal v0 = $1408;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JHead": {ESLVal $1407 = _v1017.termRef(0);
        
        {ESLVal v0 = $1407;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JTail": {ESLVal $1406 = _v1017.termRef(0);
        
        {ESLVal v0 = $1406;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JMapFun": {ESLVal $1405 = _v1017.termRef(0);
        ESLVal $1404 = _v1017.termRef(1);
        
        {ESLVal v0 = $1405;
        
        {ESLVal v1 = $1404;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJExp(v1));
      }
      }
      }
    case "JFlatten": {ESLVal $1403 = _v1017.termRef(0);
        
        {ESLVal v0 = $1403;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JNot": {ESLVal $1402 = _v1017.termRef(0);
        
        {ESLVal v0 = $1402;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JBehaviour": {ESLVal $1401 = _v1017.termRef(0);
        ESLVal $1400 = _v1017.termRef(1);
        ESLVal $1399 = _v1017.termRef(2);
        ESLVal $1398 = _v1017.termRef(3);
        ESLVal $1397 = _v1017.termRef(4);
        ESLVal $1396 = _v1017.termRef(5);
        
        {ESLVal v0 = $1401;
        
        {ESLVal v1 = $1400;
        
        {ESLVal methods = $1399;
        
        {ESLVal v2 = $1398;
        
        {ESLVal v3 = $1397;
        
        {ESLVal v4 = $1396;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun360"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        return dynamicVarsJFieldDef(d);
          }
        }),v1)).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun361"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        return dynamicVarsJMethodDef(d);
          }
        }),methods)).add(dynamicVarsJExp(v2).add(dynamicVarsJExp(v3).add(dynamicVarsJCommand(v4)))));
      }
      }
      }
      }
      }
      }
      }
    case "JExtendedBehaviour": {ESLVal $1395 = _v1017.termRef(0);
        ESLVal $1394 = _v1017.termRef(1);
        ESLVal $1393 = _v1017.termRef(2);
        ESLVal $1392 = _v1017.termRef(3);
        ESLVal $1391 = _v1017.termRef(4);
        ESLVal $1390 = _v1017.termRef(5);
        ESLVal $1389 = _v1017.termRef(6);
        
        {ESLVal v0 = $1395;
        
        {ESLVal parent = $1394;
        
        {ESLVal v1 = $1393;
        
        {ESLVal methods = $1392;
        
        {ESLVal v2 = $1391;
        
        {ESLVal v3 = $1390;
        
        {ESLVal v4 = $1389;
        
        return dynamicVarsJExp(parent).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun362"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        return dynamicVarsJFieldDef(d);
          }
        }),v1)).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun363"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal d = $args[0];
        return dynamicVarsJMethodDef(d);
          }
        }),methods)).add(dynamicVarsJExp(v2).add(dynamicVarsJExp(v3).add(dynamicVarsJCommand(v4))))));
      }
      }
      }
      }
      }
      }
      }
      }
    case "JMethodCall": {ESLVal $1388 = _v1017.termRef(0);
        ESLVal $1387 = _v1017.termRef(1);
        
        {ESLVal name = $1388;
        
        {ESLVal args = $1387;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun364"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),args));
      }
      }
      }
    case "JNew": {ESLVal $1386 = _v1017.termRef(0);
        ESLVal $1385 = _v1017.termRef(1);
        
        {ESLVal v0 = $1386;
        
        {ESLVal v1 = $1385;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun365"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1)));
      }
      }
      }
    case "JNewArray": {ESLVal $1384 = _v1017.termRef(0);
        
        {ESLVal v0 = $1384;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JNewJava": {ESLVal $1383 = _v1017.termRef(0);
        ESLVal $1382 = _v1017.termRef(1);
        
        {ESLVal v0 = $1383;
        
        {ESLVal v1 = $1382;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun366"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v1));
      }
      }
      }
    case "JNewTable": {
        return $nil;
      }
    case "JRecord": {ESLVal $1381 = _v1017.termRef(0);
        
        {ESLVal fs = $1381;
        
        return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v1018 = $qualArg;
              
              switch(_v1018.termName) {
              case "JField": {ESLVal $1447 = _v1018.termRef(0);
                ESLVal $1446 = _v1018.termRef(1);
                ESLVal $1445 = _v1018.termRef(2);
                
                {ESLVal n = $1447;
                
                {ESLVal t = $1446;
                
                {ESLVal e = $1445;
                
                return ESLVal.list(new SerializableFunction<ESLVal,ESLVal>() {
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
                  }}.apply(dynamicVarsJExp(e)));
              }
              }
              }
              }
              default: {ESLVal _0 = _v1018;
                
                return $nil;
              }
            }
            }
          }
        }).map(fs).flatten().flatten();
      }
      }
    case "JSend": {ESLVal $1380 = _v1017.termRef(0);
        ESLVal $1379 = _v1017.termRef(1);
        ESLVal $1378 = _v1017.termRef(2);
        
        {ESLVal v0 = $1380;
        
        {ESLVal v1 = $1379;
        
        {ESLVal v2 = $1378;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun367"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v2)));
      }
      }
      }
      }
    case "JSendSuper": {ESLVal $1377 = _v1017.termRef(0);
        
        {ESLVal e = $1377;
        
        return dynamicVarsJExp(e);
      }
      }
    case "JSendTimeSuper": {
        return $nil;
      }
    case "JSelf": {
        return $nil;
      }
    case "JTry": {ESLVal $1376 = _v1017.termRef(0);
        ESLVal $1375 = _v1017.termRef(1);
        ESLVal $1374 = _v1017.termRef(2);
        
        {ESLVal e = $1376;
        
        {ESLVal n = $1375;
        
        {ESLVal c = $1374;
        
        return dynamicVarsJExp(e).add(dynamicVarsJCommand(c));
      }
      }
      }
      }
    case "JRef": {ESLVal $1373 = _v1017.termRef(0);
        ESLVal $1372 = _v1017.termRef(1);
        
        {ESLVal v0 = $1373;
        
        {ESLVal v1 = $1372;
        
        return dynamicVarsJExp(v0);
      }
      }
      }
    case "JRefSuper": {ESLVal $1371 = _v1017.termRef(0);
        
        {ESLVal n = $1371;
        
        return $nil;
      }
      }
    case "JGrab": {ESLVal $1370 = _v1017.termRef(0);
        ESLVal $1369 = _v1017.termRef(1);
        
        {ESLVal v0 = $1370;
        
        {ESLVal v1 = $1369;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun368"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJExp(e);
          }
        }),v0)).add(dynamicVarsJExp(v1));
      }
      }
      }
    case "JProbably": {ESLVal $1368 = _v1017.termRef(0);
        ESLVal $1367 = _v1017.termRef(1);
        ESLVal $1366 = _v1017.termRef(2);
        
        {ESLVal v0 = $1368;
        
        {ESLVal v1 = $1367;
        
        {ESLVal v2 = $1366;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJExp(v1).add(dynamicVarsJExp(v2)));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(438,4209)").add(ESLVal.list(_v1017)));
    }
    }
  }
  public static ESLVal dynamicVarsJExp = new ESLVal(new Function(new ESLVal("dynamicVarsJExp"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJExp(args[0]); }});
  private static ESLVal dynamicVarsJFieldDef(ESLVal d) {
    
    {ESLVal _v1019 = d;
      
      switch(_v1019.termName) {
      case "JField": {ESLVal $1450 = _v1019.termRef(0);
        ESLVal $1449 = _v1019.termRef(1);
        ESLVal $1448 = _v1019.termRef(2);
        
        {ESLVal n = $1450;
        
        {ESLVal t = $1449;
        
        {ESLVal e = $1448;
        
        return dynamicVarsJExp(e);
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4259,4330)").add(ESLVal.list(_v1019)));
    }
    }
  }
  private static ESLVal dynamicVarsJFieldDef = new ESLVal(new Function(new ESLVal("dynamicVarsJFieldDef"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJFieldDef(args[0]); }});
  private static ESLVal dynamicVarsJMethodDef(ESLVal m) {
    
    {ESLVal _v1020 = m;
      
      switch(_v1020.termName) {
      case "JMethod": {ESLVal $1453 = _v1020.termRef(0);
        ESLVal $1452 = _v1020.termRef(1);
        ESLVal $1451 = _v1020.termRef(2);
        
        {ESLVal n = $1453;
        
        {ESLVal args = $1452;
        
        {ESLVal body = $1451;
        
        return reject(new ESLVal(new Function(new ESLVal("fun369"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1026 = $args[0];
        return member.apply(_v1026,map(decName,args));
          }
        }),dynamicVarsJCommand(body));
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4380,4529)").add(ESLVal.list(_v1020)));
    }
    }
  }
  private static ESLVal dynamicVarsJMethodDef = new ESLVal(new Function(new ESLVal("dynamicVarsJMethodDef"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJMethodDef(args[0]); }});
  private static ESLVal dynamicVarsJTermArm(ESLVal t) {
    
    {ESLVal _v1021 = t;
      
      switch(_v1021.termName) {
      case "JTArm": {ESLVal $1456 = _v1021.termRef(0);
        ESLVal $1455 = _v1021.termRef(1);
        ESLVal $1454 = _v1021.termRef(2);
        
        {ESLVal n = $1456;
        
        {ESLVal i = $1455;
        
        {ESLVal c = $1454;
        
        return dynamicVarsJCommand(c);
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4576,4652)").add(ESLVal.list(_v1021)));
    }
    }
  }
  private static ESLVal dynamicVarsJTermArm = new ESLVal(new Function(new ESLVal("dynamicVarsJTermArm"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJTermArm(args[0]); }});
  private static ESLVal dynamicVarsJIntArm(ESLVal t) {
    
    {ESLVal _v1022 = t;
      
      switch(_v1022.termName) {
      case "JIArm": {ESLVal $1458 = _v1022.termRef(0);
        ESLVal $1457 = _v1022.termRef(1);
        
        {ESLVal i = $1458;
        
        {ESLVal c = $1457;
        
        return dynamicVarsJCommand(c);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4697,4766)").add(ESLVal.list(_v1022)));
    }
    }
  }
  private static ESLVal dynamicVarsJIntArm = new ESLVal(new Function(new ESLVal("dynamicVarsJIntArm"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJIntArm(args[0]); }});
  private static ESLVal dynamicVarsJStrArm(ESLVal t) {
    
    {ESLVal _v1023 = t;
      
      switch(_v1023.termName) {
      case "JSArm": {ESLVal $1460 = _v1023.termRef(0);
        ESLVal $1459 = _v1023.termRef(1);
        
        {ESLVal s = $1460;
        
        {ESLVal c = $1459;
        
        return dynamicVarsJCommand(c);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4811,4880)").add(ESLVal.list(_v1023)));
    }
    }
  }
  private static ESLVal dynamicVarsJStrArm = new ESLVal(new Function(new ESLVal("dynamicVarsJStrArm"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJStrArm(args[0]); }});
  private static ESLVal dynamicVarsJBoolArm(ESLVal t) {
    
    {ESLVal _v1024 = t;
      
      switch(_v1024.termName) {
      case "JBArm": {ESLVal $1462 = _v1024.termRef(0);
        ESLVal $1461 = _v1024.termRef(1);
        
        {ESLVal b = $1462;
        
        {ESLVal c = $1461;
        
        return dynamicVarsJCommand(c);
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(4927,4998)").add(ESLVal.list(_v1024)));
    }
    }
  }
  private static ESLVal dynamicVarsJBoolArm = new ESLVal(new Function(new ESLVal("dynamicVarsJBoolArm"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJBoolArm(args[0]); }});
  public static ESLVal dynamicVarsJCommand(ESLVal x) {
    
    {ESLVal _v1025 = x;
      
      switch(_v1025.termName) {
      case "JBlock": {ESLVal $1496 = _v1025.termRef(0);
        
        {ESLVal v0 = $1496;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun370"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return dynamicVarsJCommand(e);
          }
        }),v0));
      }
      }
    case "JReturn": {ESLVal $1495 = _v1025.termRef(0);
        
        {ESLVal v0 = $1495;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JIfCommand": {ESLVal $1494 = _v1025.termRef(0);
        ESLVal $1493 = _v1025.termRef(1);
        ESLVal $1492 = _v1025.termRef(2);
        
        {ESLVal v0 = $1494;
        
        {ESLVal v1 = $1493;
        
        {ESLVal v2 = $1492;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJCommand(v1).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
    case "JCaseList": {ESLVal $1491 = _v1025.termRef(0);
        ESLVal $1490 = _v1025.termRef(1);
        ESLVal $1489 = _v1025.termRef(2);
        ESLVal $1488 = _v1025.termRef(3);
        
        {ESLVal v0 = $1491;
        
        {ESLVal v1 = $1490;
        
        {ESLVal v2 = $1489;
        
        {ESLVal v3 = $1488;
        
        return dynamicVarsJExp(v0).add(dynamicVarsJCommand(v1).add(dynamicVarsJCommand(v2).add(dynamicVarsJCommand(v3))));
      }
      }
      }
      }
      }
    case "JCaseTerm": {ESLVal $1487 = _v1025.termRef(0);
        ESLVal $1486 = _v1025.termRef(1);
        ESLVal $1485 = _v1025.termRef(2);
        
        {ESLVal v0 = $1487;
        
        {ESLVal v1 = $1486;
        
        {ESLVal v2 = $1485;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun371"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return dynamicVarsJTermArm(t);
          }
        }),v1)).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
    case "JCaseInt": {ESLVal $1484 = _v1025.termRef(0);
        ESLVal $1483 = _v1025.termRef(1);
        ESLVal $1482 = _v1025.termRef(2);
        
        {ESLVal v0 = $1484;
        
        {ESLVal v1 = $1483;
        
        {ESLVal v2 = $1482;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun372"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return dynamicVarsJIntArm(t);
          }
        }),v1)).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
    case "JCaseStr": {ESLVal $1481 = _v1025.termRef(0);
        ESLVal $1480 = _v1025.termRef(1);
        ESLVal $1479 = _v1025.termRef(2);
        
        {ESLVal v0 = $1481;
        
        {ESLVal v1 = $1480;
        
        {ESLVal v2 = $1479;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun373"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return dynamicVarsJStrArm(t);
          }
        }),v1)).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
    case "JCaseBool": {ESLVal $1478 = _v1025.termRef(0);
        ESLVal $1477 = _v1025.termRef(1);
        ESLVal $1476 = _v1025.termRef(2);
        
        {ESLVal v0 = $1478;
        
        {ESLVal v1 = $1477;
        
        {ESLVal v2 = $1476;
        
        return dynamicVarsJExp(v0).add(flatten.apply(map(new ESLVal(new Function(new ESLVal("fun374"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return dynamicVarsJBoolArm(t);
          }
        }),v1)).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
    case "JLet": {ESLVal $1475 = _v1025.termRef(0);
        ESLVal $1474 = _v1025.termRef(1);
        
        {ESLVal v0 = $1475;
        
        {ESLVal v1 = $1474;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun375"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal f = $args[0];
        return dynamicVarsJExp(fieldJExp(f));
          }
        }),v0)).add(reject(new ESLVal(new Function(new ESLVal("fun376"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,map(fieldName,v0));
          }
        }),dynamicVarsJCommand(v1)));
      }
      }
      }
    case "JPLet": {ESLVal $1473 = _v1025.termRef(0);
        ESLVal $1472 = _v1025.termRef(1);
        
        {ESLVal v0 = $1473;
        
        {ESLVal v1 = $1472;
        
        return flatten.apply(map(new ESLVal(new Function(new ESLVal("fun377"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal f = $args[0];
        return dynamicVarsJExp(fieldJExp(f));
          }
        }),v0)).add(reject(new ESLVal(new Function(new ESLVal("fun378"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,map(fieldName,v0));
          }
        }),dynamicVarsJCommand(v1)));
      }
      }
      }
    case "JLetRec": {ESLVal $1471 = _v1025.termRef(0);
        ESLVal $1470 = _v1025.termRef(1);
        
        {ESLVal v0 = $1471;
        
        {ESLVal v1 = $1470;
        
        return reject(new ESLVal(new Function(new ESLVal("fun379"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,map(fieldName,v0));
          }
        }),flatten.apply(map(new ESLVal(new Function(new ESLVal("fun380"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal f = $args[0];
        return dynamicVarsJExp(fieldJExp(f));
          }
        }),v0)).add(dynamicVarsJCommand(v1)));
      }
      }
      }
    case "JUpdate": {ESLVal $1469 = _v1025.termRef(0);
        ESLVal $1468 = _v1025.termRef(1);
        
        {ESLVal v0 = $1469;
        
        {ESLVal v1 = $1468;
        
        return ESLVal.list(v0).add(dynamicVarsJExp(v1));
      }
      }
      }
    case "JStatement": {ESLVal $1467 = _v1025.termRef(0);
        
        {ESLVal v0 = $1467;
        
        return dynamicVarsJExp(v0);
      }
      }
    case "JFor": {ESLVal $1466 = _v1025.termRef(0);
        ESLVal $1465 = _v1025.termRef(1);
        ESLVal $1464 = _v1025.termRef(2);
        ESLVal $1463 = _v1025.termRef(3);
        
        {ESLVal listName = $1466;
        
        {ESLVal v0 = $1465;
        
        {ESLVal v1 = $1464;
        
        {ESLVal v2 = $1463;
        
        return ESLVal.list(listName).add(dynamicVarsJExp(v1).add(dynamicVarsJCommand(v2)));
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(5088,7259)").add(ESLVal.list(_v1025)));
    }
    }
  }
  public static ESLVal dynamicVarsJCommand = new ESLVal(new Function(new ESLVal("dynamicVarsJCommand"),null) { public ESLVal apply(ESLVal... args) { return dynamicVarsJCommand(args[0]); }});
public static void main(String[] args) {
  }
}