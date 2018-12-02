package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.Tables.*;
import static esl.Displays.*;
import java.util.function.Supplier;
public class TypeCheck {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal ppPattern = new ESLVal(new Function(new ESLVal("ppPattern"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal p = $args[0];
  {ESLVal _v811 = p;
        
        switch(_v811.termName) {
        case "PAdd": {ESLVal $1420 = _v811.termRef(0);
          ESLVal $1419 = _v811.termRef(1);
          ESLVal $1418 = _v811.termRef(2);
          
          {ESLVal l = $1420;
          
          {ESLVal p1 = $1419;
          
          {ESLVal p2 = $1418;
          
          return ppPattern.apply(p1).add(new ESLVal(" + ").add(ppPattern.apply(p2)));
        }
        }
        }
        }
      case "PVar": {ESLVal $1417 = _v811.termRef(0);
          ESLVal $1416 = _v811.termRef(1);
          ESLVal $1415 = _v811.termRef(2);
          
          {ESLVal l = $1417;
          
          {ESLVal n = $1416;
          
          {ESLVal t = $1415;
          
          return n;
        }
        }
        }
        }
      case "PTerm": {ESLVal $1412 = _v811.termRef(0);
          ESLVal $1411 = _v811.termRef(1);
          ESLVal $1410 = _v811.termRef(2);
          ESLVal $1409 = _v811.termRef(3);
          
          if($1410.isCons())
          {ESLVal $1413 = $1410.head();
            ESLVal $1414 = $1410.tail();
            
            {ESLVal l = $1412;
            
            {ESLVal n = $1411;
            
            {ESLVal ts = $1410;
            
            {ESLVal ps = $1409;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
          }
        else if($1410.isNil())
          {ESLVal l = $1412;
            
            {ESLVal n = $1411;
            
            {ESLVal ps = $1409;
            
            return n.add(ppPatterns.apply(ps));
          }
          }
          }
        else {ESLVal l = $1412;
            
            {ESLVal n = $1411;
            
            {ESLVal ts = $1410;
            
            {ESLVal ps = $1409;
            
            return n.add(ppTypes.apply(ts,ESLVal.list()).add(new ESLVal("").add(ppPatterns.apply(ps))));
          }
          }
          }
          }
        }
      case "PApplyType": {ESLVal $1408 = _v811.termRef(0);
          ESLVal $1407 = _v811.termRef(1);
          ESLVal $1406 = _v811.termRef(2);
          
          {ESLVal l = $1408;
          
          {ESLVal _v1879 = $1407;
          
          {ESLVal ts = $1406;
          
          return ppPattern.apply(_v1879).add(ppTypes.apply(ts,ESLVal.list()));
        }
        }
        }
        }
      case "PNil": {ESLVal $1405 = _v811.termRef(0);
          
          {ESLVal l = $1405;
          
          return new ESLVal("[]");
        }
        }
      case "PEmptySet": {ESLVal $1404 = _v811.termRef(0);
          
          {ESLVal l = $1404;
          
          return new ESLVal("Set{}");
        }
        }
      case "PEmptyBag": {ESLVal $1403 = _v811.termRef(0);
          
          {ESLVal l = $1403;
          
          return new ESLVal("Bag{}");
        }
        }
      case "PInt": {ESLVal $1402 = _v811.termRef(0);
          ESLVal $1401 = _v811.termRef(1);
          
          {ESLVal l = $1402;
          
          {ESLVal n = $1401;
          
          return new ESLVal("").add(n);
        }
        }
        }
      case "PBool": {ESLVal $1400 = _v811.termRef(0);
          ESLVal $1399 = _v811.termRef(1);
          
          {ESLVal l = $1400;
          
          {ESLVal b = $1399;
          
          return new ESLVal("").add(b);
        }
        }
        }
      case "PStr": {ESLVal $1398 = _v811.termRef(0);
          ESLVal $1397 = _v811.termRef(1);
          
          {ESLVal l = $1398;
          
          {ESLVal s = $1397;
          
          return s;
        }
        }
        }
      case "PCons": {ESLVal $1396 = _v811.termRef(0);
          ESLVal $1395 = _v811.termRef(1);
          ESLVal $1394 = _v811.termRef(2);
          
          {ESLVal l = $1396;
          
          {ESLVal h = $1395;
          
          {ESLVal t = $1394;
          
          return ppPattern.apply(h).add(new ESLVal(":").add(ppPattern.apply(t)));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $1393 = _v811.termRef(0);
          ESLVal $1392 = _v811.termRef(1);
          ESLVal $1391 = _v811.termRef(2);
          
          {ESLVal l = $1393;
          
          {ESLVal p1 = $1392;
          
          {ESLVal p2 = $1391;
          
          return new ESLVal("Set{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $1390 = _v811.termRef(0);
          ESLVal $1389 = _v811.termRef(1);
          ESLVal $1388 = _v811.termRef(2);
          
          {ESLVal l = $1390;
          
          {ESLVal p1 = $1389;
          
          {ESLVal p2 = $1388;
          
          return new ESLVal("Bag{").add(ppPattern.apply(p1).add(new ESLVal(" | ").add(ppPattern.apply(p2).add(new ESLVal("}")))));
        }
        }
        }
        }
        default: {ESLVal _v1880 = _v811;
          
          return new ESLVal("<unknown: ").add(_v1880.add(new ESLVal(">")));
        }
      }
      }
    }
  });
  private static ESLVal ppPatterns = new ESLVal(new Function(new ESLVal("ppPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ps = $args[0];
  return map.apply(ppPattern,ps);
    }
  });
  private static ESLVal p0 = new ESLVal("Pos",$zero,$zero);
  private static ESLVal actType0 = new ESLVal("ActType",p0,ESLVal.list(),ESLVal.list());
  private static ESLVal contentType = new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("RawText"),ESLVal.list(new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("ESLSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0))),new ESLVal("TermType",p0,new ESLVal("JavaSource"),ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0)))));
  private static ESLVal editMessage = new ESLVal("MessageType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Edit"),ESLVal.list(contentType))));
  private static ESLVal env0 = ESLVal.list(new ESLVal("Map",new ESLVal("edb"),new ESLVal("ActType",p0,ESLVal.list(new ESLVal("Dec",p0,new ESLVal("button"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("VoidType",p0)),$null),new ESLVal("Dec",p0,new ESLVal("display"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VarType",p0,new ESLVal("T")))),$null)),ESLVal.list(editMessage))),new ESLVal("Map",new ESLVal("kill"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("print"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("VarType",p0,new ESLVal("T"))),new ESLVal("VoidType",p0)))),new ESLVal("Map",new ESLVal("parse"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))),new ESLVal("Map",new ESLVal("random"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("IntType",p0))),new ESLVal("Map",new ESLVal("wait"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("stopAll"),new ESLVal("FunType",p0,ESLVal.list(),new ESLVal("VoidType",p0))),new ESLVal("Map",new ESLVal("isqrt"),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("IntType",p0)),new ESLVal("FloatType",p0))),new ESLVal("Map",new ESLVal("builtin"),new ESLVal("ForallType",p0,ESLVal.list(new ESLVal("T")),new ESLVal("FunType",p0,ESLVal.list(new ESLVal("StrType",p0),new ESLVal("StrType",p0),new ESLVal("IntType",p0)),new ESLVal("VarType",p0,new ESLVal("T"))))));
  private static ESLVal cnstrEnv0 = ESLVal.list(new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))));
  private static ESLVal tenv0 = ESLVal.list(new ESLVal("Map",new ESLVal("EditType"),contentType),new ESLVal("Map",new ESLVal("Time"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Time"),ESLVal.list(new ESLVal("IntType",p0)))))),new ESLVal("Map",new ESLVal("Point"),new ESLVal("UnionType",p0,ESLVal.list(new ESLVal("TermType",p0,new ESLVal("Point"),ESLVal.list(new ESLVal("IntType",p0),new ESLVal("IntType",p0)))))));
  private static ESLVal ppTypeEnv = new ESLVal(new Function(new ESLVal("ppTypeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  {ESLVal[] s = new ESLVal[]{new ESLVal("[")};
        
        {{
        ESLVal _v814 = env;
        while(_v814.isCons()) {
          ESLVal _v813 = _v814.headVal;
          {ESLVal _v812 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v815 = _v813;
                    
                    switch(_v815.termName) {
                    case "Map": {ESLVal $1422 = _v815.termRef(0);
                      ESLVal $1421 = _v815.termRef(1);
                      
                      {ESLVal n = $1422;
                      
                      {ESLVal t = $1421;
                      
                      {s[0] = s[0].add(n.add(new ESLVal("->").add(ppType.apply(t,env).add(new ESLVal(",")))));
                    return $null;}
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v815;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v812.apply();
          }
          _v814 = _v814.tailVal;}
      }
      return s[0].add(new ESLVal("]"));}
      }
    }
  });
  private static ESLVal ppTypes = new ESLVal(new Function(new ESLVal("ppTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  ESLVal env = $args[1];
  return map.apply(ppType0.apply(env),ts);
    }
  });
  private static ESLVal getTypeName = new ESLVal(new Function(new ESLVal("getTypeName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t0 = $args[0];
  ESLVal env = $args[1];
  {ESLVal[] name = new ESLVal[]{$null};
        
        {{
        ESLVal _v818 = env;
        while(_v818.isCons()) {
          ESLVal _v817 = _v818.headVal;
          {ESLVal _v816 = new ESLVal(new Function(new ESLVal("forp"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  {ESLVal _v819 = _v817;
                    
                    switch(_v819.termName) {
                    case "Map": {ESLVal $1424 = _v819.termRef(0);
                      ESLVal $1423 = _v819.termRef(1);
                      
                      {ESLVal n = $1424;
                      
                      {ESLVal t = $1423;
                      
                      if(typeEqual.apply(t0,t).boolVal)
                      {name[0] = n;
                      return $null;}
                      else
                        return $null;
                    }
                    }
                    }
                    default: {ESLVal $$$ = _v819;
                      
                      return $null;
                    }
                  }
                  }
                }
              });
            
            _v816.apply();
          }
          _v818 = _v818.tailVal;}
      }
      return name[0];}
      }
    }
  });
  private static ESLVal ppType0 = new ESLVal(new Function(new ESLVal("ppType0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  return new ESLVal(new Function(new ESLVal("fun503"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal t = $args[0];
        return ppType.apply(t,env);
          }
        });
    }
  });
  private static ESLVal ppHandlers = new ESLVal(new Function(new ESLVal("ppHandlers"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal handlers = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v820 = handlers;
        
        if(_v820.isCons())
        {ESLVal $1425 = _v820.head();
          ESLVal $1426 = _v820.tail();
          
          switch($1425.termName) {
          case "MessageType": {ESLVal $1428 = $1425.termRef(0);
            ESLVal $1427 = $1425.termRef(1);
            
            if($1427.isCons())
            {ESLVal $1429 = $1427.head();
              ESLVal $1430 = $1427.tail();
              
              {ESLVal l = $1428;
              
              {ESLVal t = $1429;
              
              {ESLVal ts = $1430;
              
              {ESLVal hs = $1426;
              
              return ppType.apply(t,env).add(new ESLVal("; ").add(ppHandlers.apply(hs,env)));
            }
            }
            }
            }
            }
          else if($1427.isNil())
            return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v820)));
          else return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v820)));
          }
          default: return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v820)));
        }
        }
      else if(_v820.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(5370,5504)").add(ESLVal.list(_v820)));
      }
    }
  });
  private static ESLVal ppDecs = new ESLVal(new Function(new ESLVal("ppDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal decs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v821 = decs;
        
        if(_v821.isCons())
        {ESLVal $1431 = _v821.head();
          ESLVal $1432 = _v821.tail();
          
          switch($1431.termName) {
          case "Dec": {ESLVal $1436 = $1431.termRef(0);
            ESLVal $1435 = $1431.termRef(1);
            ESLVal $1434 = $1431.termRef(2);
            ESLVal $1433 = $1431.termRef(3);
            
            {ESLVal l = $1436;
            
            {ESLVal n = $1435;
            
            {ESLVal t = $1434;
            
            {ESLVal d = $1433;
            
            {ESLVal _v1878 = $1432;
            
            return n.add(new ESLVal("::").add(ppType.apply(t,env).add(new ESLVal("; ").add(ppDecs.apply(_v1878,env)))));
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5545,5659)").add(ESLVal.list(_v821)));
        }
        }
      else if(_v821.isNil())
        return new ESLVal("");
      else return error(new ESLVal("case error at Pos(5545,5659)").add(ESLVal.list(_v821)));
      }
    }
  });
  private static ESLVal ppType = new ESLVal(new Function(new ESLVal("ppType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal env = $args[1];
  if(getTypeName.apply(t,env).neql($null).boolVal)
        return getTypeName.apply(t,env);
        else
          {ESLVal _v822 = t;
            
            switch(_v822.termName) {
            case "ActType": {ESLVal $1500 = _v822.termRef(0);
              ESLVal $1499 = _v822.termRef(1);
              ESLVal $1498 = _v822.termRef(2);
              
              {ESLVal l = $1500;
              
              {ESLVal decs = $1499;
              
              {ESLVal handlers = $1498;
              
              return new ESLVal("Act { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")));
            }
            }
            }
            }
          case "ApplyType": {ESLVal $1497 = _v822.termRef(0);
              ESLVal $1496 = _v822.termRef(1);
              ESLVal $1495 = _v822.termRef(2);
              
              {ESLVal l = $1497;
              
              {ESLVal n = $1496;
              
              {ESLVal args = $1495;
              
              return n.add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ApplyTypeFun": {ESLVal $1494 = _v822.termRef(0);
              ESLVal $1493 = _v822.termRef(1);
              ESLVal $1492 = _v822.termRef(2);
              
              {ESLVal l = $1494;
              
              {ESLVal op = $1493;
              
              {ESLVal args = $1492;
              
              return ppType.apply(op,env).add(map.apply(ppType0.apply(env),args));
            }
            }
            }
            }
          case "ArrayType": {ESLVal $1491 = _v822.termRef(0);
              ESLVal $1490 = _v822.termRef(1);
              
              {ESLVal l = $1491;
              
              {ESLVal _v1877 = $1490;
              
              return new ESLVal("Array[").add(ppType.apply(_v1877,env).add(new ESLVal("]")));
            }
            }
            }
          case "BagType": {ESLVal $1489 = _v822.termRef(0);
              ESLVal $1488 = _v822.termRef(1);
              
              {ESLVal l = $1489;
              
              {ESLVal _v1876 = $1488;
              
              return new ESLVal("Set{").add(ppType.apply(_v1876,env).add(new ESLVal("}")));
            }
            }
            }
          case "BoolType": {ESLVal $1487 = _v822.termRef(0);
              
              {ESLVal l = $1487;
              
              return new ESLVal("Bool");
            }
            }
          case "ExtendedAct": {ESLVal $1486 = _v822.termRef(0);
              ESLVal $1485 = _v822.termRef(1);
              ESLVal $1484 = _v822.termRef(2);
              ESLVal $1483 = _v822.termRef(3);
              
              {ESLVal l = $1486;
              
              {ESLVal parent = $1485;
              
              {ESLVal decs = $1484;
              
              {ESLVal handlers = $1483;
              
              return new ESLVal("Act extends ").add(ppType.apply(parent,env).add(new ESLVal(" { ").add(ppHandlers.apply(handlers,env).add(new ESLVal(" }")))));
            }
            }
            }
            }
            }
          case "FloatType": {ESLVal $1482 = _v822.termRef(0);
              
              {ESLVal l = $1482;
              
              return new ESLVal("Float");
            }
            }
          case "FieldType": {ESLVal $1481 = _v822.termRef(0);
              ESLVal $1480 = _v822.termRef(1);
              ESLVal $1479 = _v822.termRef(2);
              
              {ESLVal l = $1481;
              
              {ESLVal n = $1480;
              
              {ESLVal _v1875 = $1479;
              
              return n.add(new ESLVal("::").add(ppType.apply(_v1875,env)));
            }
            }
            }
            }
          case "ForallType": {ESLVal $1478 = _v822.termRef(0);
              ESLVal $1477 = _v822.termRef(1);
              ESLVal $1476 = _v822.termRef(2);
              
              {ESLVal l = $1478;
              
              {ESLVal ns = $1477;
              
              {ESLVal _v1874 = $1476;
              
              return new ESLVal("Forall").add(ns.add(new ESLVal(".").add(ppType.apply(_v1874,env))));
            }
            }
            }
            }
          case "FunType": {ESLVal $1475 = _v822.termRef(0);
              ESLVal $1474 = _v822.termRef(1);
              ESLVal $1473 = _v822.termRef(2);
              
              {ESLVal l = $1475;
              
              {ESLVal d = $1474;
              
              {ESLVal r = $1473;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
          case "TaggedFunType": {ESLVal $1472 = _v822.termRef(0);
              ESLVal $1471 = _v822.termRef(1);
              ESLVal $1470 = _v822.termRef(2);
              ESLVal $1469 = _v822.termRef(3);
              
              {ESLVal l = $1472;
              
              {ESLVal d = $1471;
              
              {ESLVal p = $1470;
              
              {ESLVal r = $1469;
              
              return map.apply(ppType0.apply(env),d).add(new ESLVal("->").add(ppType.apply(r,env)));
            }
            }
            }
            }
            }
          case "IntType": {ESLVal $1468 = _v822.termRef(0);
              
              {ESLVal l = $1468;
              
              return new ESLVal("Int");
            }
            }
          case "ListType": {ESLVal $1467 = _v822.termRef(0);
              ESLVal $1466 = _v822.termRef(1);
              
              {ESLVal l = $1467;
              
              {ESLVal _v1873 = $1466;
              
              return new ESLVal("[").add(ppType.apply(_v1873,env).add(new ESLVal("]")));
            }
            }
            }
          case "NullType": {ESLVal $1465 = _v822.termRef(0);
              
              {ESLVal l = $1465;
              
              return new ESLVal("Null");
            }
            }
          case "RecType": {ESLVal $1464 = _v822.termRef(0);
              ESLVal $1463 = _v822.termRef(1);
              ESLVal $1462 = _v822.termRef(2);
              
              {ESLVal l = $1464;
              
              {ESLVal n = $1463;
              
              {ESLVal _v1872 = $1462;
              
              return new ESLVal("rec ").add(n.add(new ESLVal(".").add(ppType.apply(_v1872,env))));
            }
            }
            }
            }
          case "RecordType": {ESLVal $1461 = _v822.termRef(0);
              ESLVal $1460 = _v822.termRef(1);
              
              {ESLVal l = $1461;
              
              {ESLVal fs = $1460;
              
              return new ESLVal("{").add(ppDecs.apply(fs,env).add(new ESLVal("}")));
            }
            }
            }
          case "SetType": {ESLVal $1459 = _v822.termRef(0);
              ESLVal $1458 = _v822.termRef(1);
              
              {ESLVal l = $1459;
              
              {ESLVal _v1871 = $1458;
              
              return new ESLVal("Set{").add(ppType.apply(_v1871,env).add(new ESLVal("}")));
            }
            }
            }
          case "StrType": {ESLVal $1457 = _v822.termRef(0);
              
              {ESLVal l = $1457;
              
              return new ESLVal("Str");
            }
            }
          case "TableType": {ESLVal $1456 = _v822.termRef(0);
              ESLVal $1455 = _v822.termRef(1);
              ESLVal $1454 = _v822.termRef(2);
              
              {ESLVal l = $1456;
              
              {ESLVal k = $1455;
              
              {ESLVal v = $1454;
              
              return new ESLVal("Hash[").add(ppType.apply(k,env).add(new ESLVal(",").add(ppType.apply(v,env).add(new ESLVal("]")))));
            }
            }
            }
            }
          case "TermType": {ESLVal $1453 = _v822.termRef(0);
              ESLVal $1452 = _v822.termRef(1);
              ESLVal $1451 = _v822.termRef(2);
              
              {ESLVal l = $1453;
              
              {ESLVal n = $1452;
              
              {ESLVal ts = $1451;
              
              return n.add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
            }
          case "TypeFun": {ESLVal $1450 = _v822.termRef(0);
              ESLVal $1449 = _v822.termRef(1);
              ESLVal $1448 = _v822.termRef(2);
              
              {ESLVal l = $1450;
              
              {ESLVal ns = $1449;
              
              {ESLVal _v1870 = $1448;
              
              return new ESLVal("Fun").add(ns.add(new ESLVal(".").add(ppType.apply(_v1870,env))));
            }
            }
            }
            }
          case "UnfoldType": {ESLVal $1447 = _v822.termRef(0);
              ESLVal $1446 = _v822.termRef(1);
              
              {ESLVal l = $1447;
              
              {ESLVal _v1869 = $1446;
              
              return new ESLVal("unfold ").add(ppType.apply(_v1869,env));
            }
            }
            }
          case "UnionType": {ESLVal $1445 = _v822.termRef(0);
              ESLVal $1444 = _v822.termRef(1);
              
              {ESLVal l = $1445;
              
              {ESLVal ts = $1444;
              
              return new ESLVal("union ").add(map.apply(ppType0.apply(env),ts));
            }
            }
            }
          case "VarType": {ESLVal $1443 = _v822.termRef(0);
              ESLVal $1442 = _v822.termRef(1);
              
              {ESLVal l = $1443;
              
              {ESLVal n = $1442;
              
              return n;
            }
            }
            }
          case "VoidType": {ESLVal $1441 = _v822.termRef(0);
              
              {ESLVal l = $1441;
              
              return new ESLVal("Void");
            }
            }
          case "UnionRef": {ESLVal $1440 = _v822.termRef(0);
              ESLVal $1439 = _v822.termRef(1);
              ESLVal $1438 = _v822.termRef(2);
              
              {ESLVal l = $1440;
              
              {ESLVal _v1868 = $1439;
              
              {ESLVal n = $1438;
              
              return ppType.apply(_v1868,env).add(new ESLVal(".").add(n));
            }
            }
            }
            }
          case "TypeClosure": {ESLVal $1437 = _v822.termRef(0);
              
              {ESLVal f = $1437;
              
              return f.add(new ESLVal(""));
            }
            }
            default: {ESLVal x = _v822;
              
              return new ESLVal("<unknown ").add(x.add(new ESLVal(">")));
            }
          }
          }
    }
  });
  private static ESLVal typeEnv = new ESLVal(new Function(new ESLVal("typeEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v823 = defs;
        
        if(_v823.isCons())
        {ESLVal $1501 = _v823.head();
          ESLVal $1502 = _v823.tail();
          
          switch($1501.termName) {
          case "TypeBind": {ESLVal $1510 = $1501.termRef(0);
            ESLVal $1509 = $1501.termRef(1);
            ESLVal $1508 = $1501.termRef(2);
            ESLVal $1507 = $1501.termRef(3);
            
            {ESLVal l = $1510;
            
            {ESLVal n = $1509;
            
            {ESLVal t = $1508;
            
            {ESLVal e = $1507;
            
            {ESLVal ds = $1502;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $1506 = $1501.termRef(0);
            ESLVal $1505 = $1501.termRef(1);
            ESLVal $1504 = $1501.termRef(2);
            ESLVal $1503 = $1501.termRef(3);
            
            {ESLVal l = $1506;
            
            {ESLVal n = $1505;
            
            {ESLVal t = $1504;
            
            {ESLVal e = $1503;
            
            {ESLVal ds = $1502;
            
            return typeEnv.apply(ds).cons(new ESLVal("Map",n,t));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $1501;
            
            {ESLVal ds = $1502;
            
            return typeEnv.apply(ds);
          }
          }
        }
        }
      else if(_v823.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(7732,7975)").add(ESLVal.list(_v823)));
      }
    }
  });
  private static ESLVal cnstrEnv = new ESLVal(new Function(new ESLVal("cnstrEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v824 = defs;
        
        if(_v824.isCons())
        {ESLVal $1511 = _v824.head();
          ESLVal $1512 = _v824.tail();
          
          switch($1511.termName) {
          case "TypeBind": {ESLVal $1520 = $1511.termRef(0);
            ESLVal $1519 = $1511.termRef(1);
            ESLVal $1518 = $1511.termRef(2);
            ESLVal $1517 = $1511.termRef(3);
            
            switch($1518.termName) {
            case "RecType": {ESLVal $1525 = $1518.termRef(0);
              ESLVal $1524 = $1518.termRef(1);
              ESLVal $1523 = $1518.termRef(2);
              
              switch($1523.termName) {
              case "UnionType": {ESLVal $1527 = $1523.termRef(0);
                ESLVal $1526 = $1523.termRef(1);
                
                {ESLVal l = $1520;
                
                {ESLVal n = $1519;
                
                {ESLVal ll = $1525;
                
                {ESLVal m = $1524;
                
                {ESLVal lll = $1527;
                
                {ESLVal ts = $1526;
                
                {ESLVal e = $1517;
                
                {ESLVal ds = $1512;
                
                return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: {ESLVal l = $1520;
                
                {ESLVal n = $1519;
                
                {ESLVal t = $1518;
                
                {ESLVal e = $1517;
                
                {ESLVal ds = $1512;
                
                return cnstrEnv.apply(ds,env);
              }
              }
              }
              }
              }
            }
            }
          case "UnionType": {ESLVal $1522 = $1518.termRef(0);
              ESLVal $1521 = $1518.termRef(1);
              
              {ESLVal l = $1520;
              
              {ESLVal n = $1519;
              
              {ESLVal lll = $1522;
              
              {ESLVal ts = $1521;
              
              {ESLVal e = $1517;
              
              {ESLVal ds = $1512;
              
              return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $1520;
              
              {ESLVal n = $1519;
              
              {ESLVal t = $1518;
              
              {ESLVal e = $1517;
              
              {ESLVal ds = $1512;
              
              return cnstrEnv.apply(ds,env);
            }
            }
            }
            }
            }
          }
          }
        case "DataBind": {ESLVal $1516 = $1511.termRef(0);
            ESLVal $1515 = $1511.termRef(1);
            ESLVal $1514 = $1511.termRef(2);
            ESLVal $1513 = $1511.termRef(3);
            
            {ESLVal l = $1516;
            
            {ESLVal n = $1515;
            
            {ESLVal t = $1514;
            
            {ESLVal e = $1513;
            
            {ESLVal ds = $1512;
            
            return getConstructors.apply(l,lookupType.apply(n,env),lookupType.apply(n,env)).add(cnstrEnv.apply(ds,env));
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $1511;
            
            {ESLVal ds = $1512;
            
            return cnstrEnv.apply(ds,env);
          }
          }
        }
        }
      else if(_v824.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(8107,8740)").add(ESLVal.list(_v824)));
      }
    }
  });
  private static ESLVal getConstructors = new ESLVal(new Function(new ESLVal("getConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal dataType = $args[1];
  ESLVal t = $args[2];
  {ESLVal _v825 = t;
        
        switch(_v825.termName) {
        case "RecType": {ESLVal $1535 = _v825.termRef(0);
          ESLVal $1534 = _v825.termRef(1);
          ESLVal $1533 = _v825.termRef(2);
          
          {ESLVal _v1865 = $1535;
          
          {ESLVal n = $1534;
          
          {ESLVal _v1866 = $1533;
          
          return getConstructors.apply(_v1865,dataType,_v1866);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $1532 = _v825.termRef(0);
          ESLVal $1531 = _v825.termRef(1);
          ESLVal $1530 = _v825.termRef(2);
          
          {ESLVal _v1863 = $1532;
          
          {ESLVal ns = $1531;
          
          {ESLVal _v1864 = $1530;
          
          return getConstructors.apply(_v1863,dataType,_v1864);
        }
        }
        }
        }
      case "UnionType": {ESLVal $1529 = _v825.termRef(0);
          ESLVal $1528 = _v825.termRef(1);
          
          {ESLVal _v1860 = $1529;
          
          {ESLVal ts = $1528;
          
          return map.apply(new ESLVal(new Function(new ESLVal("fun504"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1861 = $args[0];
          {ESLVal _v826 = _v1861;
                
                switch(_v826.termName) {
                case "TermType": {ESLVal $1538 = _v826.termRef(0);
                  ESLVal $1537 = _v826.termRef(1);
                  ESLVal $1536 = _v826.termRef(2);
                  
                  {ESLVal _v1862 = $1538;
                  
                  {ESLVal n = $1537;
                  
                  {ESLVal tts = $1536;
                  
                  return new ESLVal("Map",n,dataType);
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(9259,9325)").add(ESLVal.list(_v826)));
              }
              }
            }
          }),ts);
        }
        }
        }
        default: {ESLVal _v1867 = _v825;
          
          return error(new ESLVal("TypeError",l,new ESLVal("cannot extract constructors from ").add(ppType.apply(_v1867,ESLVal.list()))));
        }
      }
      }
    }
  });
  private static ESLVal checkFreeTypes = new ESLVal(new Function(new ESLVal("checkFreeTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal dom = typeEnvDom.apply(e);
        ESLVal ran = typeEnvRan.apply(e);
        
        {ESLVal freeNames = removeAll.apply(dom,flatten.apply(map.apply(typeFV,ran)));
        
        if(freeNames.eql($nil).boolVal)
        return $null;
        else
          return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Unbound Types: ").add(freeNames)));
      }
      }
    }
  });
  private static ESLVal checkSingletonTypes = new ESLVal(new Function(new ESLVal("checkSingletonTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v827 = e;
        
        if(_v827.isCons())
        {ESLVal $1539 = _v827.head();
          ESLVal $1540 = _v827.tail();
          
          switch($1539.termName) {
          case "Map": {ESLVal $1542 = $1539.termRef(0);
            ESLVal $1541 = $1539.termRef(1);
            
            {ESLVal n = $1542;
            
            {ESLVal t = $1541;
            
            {ESLVal _v1859 = $1540;
            
            if(member.apply(n,typeEnvDom.apply(_v1859)).boolVal)
            return error(new ESLVal("TypeError",new ESLVal("Pos",$zero,$zero),new ESLVal("Duplicate type name: ").add(n)));
            else
              return checkSingletonTypes.apply(_v1859);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10029,10250)").add(ESLVal.list(_v827)));
        }
        }
      else if(_v827.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10029,10250)").add(ESLVal.list(_v827)));
      }
    }
  });
  private static ESLVal checkSingletonConstructors = new ESLVal(new Function(new ESLVal("checkSingletonConstructors"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1851 = $args[0];
  {ESLVal _v828 = _v1851;
        
        if(_v828.isCons())
        {ESLVal $1543 = _v828.head();
          ESLVal $1544 = _v828.tail();
          
          switch($1543.termName) {
          case "Map": {ESLVal $1546 = $1543.termRef(0);
            ESLVal $1545 = $1543.termRef(1);
            
            {ESLVal n = $1546;
            
            {ESLVal t = $1545;
            
            {ESLVal _v1852 = $1544;
            
            if(member.apply(n,typeEnvDom.apply(_v1852)).boolVal)
            { LetRec letrec = new LetRec() {
              ESLVal throwError = new ESLVal(new Function(new ESLVal("throwError"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1853 = $args[0];
                {ESLVal _v829 = _v1853;
                      
                      switch(_v829.termName) {
                      case "UnionType": {ESLVal $1557 = _v829.termRef(0);
                        ESLVal $1556 = _v829.termRef(1);
                        
                        {ESLVal l = $1557;
                        
                        {ESLVal ts = $1556;
                        
                        return error(new ESLVal("TypeError",l,new ESLVal("Duplicate constructor name: ").add(n)));
                      }
                      }
                      }
                    case "ForallType": {ESLVal $1555 = _v829.termRef(0);
                        ESLVal $1554 = _v829.termRef(1);
                        ESLVal $1553 = _v829.termRef(2);
                        
                        {ESLVal l = $1555;
                        
                        {ESLVal ns = $1554;
                        
                        {ESLVal _v1857 = $1553;
                        
                        return throwError.apply(_v1857);
                      }
                      }
                      }
                      }
                    case "RecType": {ESLVal $1552 = _v829.termRef(0);
                        ESLVal $1551 = _v829.termRef(1);
                        ESLVal $1550 = _v829.termRef(2);
                        
                        {ESLVal l = $1552;
                        
                        {ESLVal _v1855 = $1551;
                        
                        {ESLVal _v1856 = $1550;
                        
                        return throwError.apply(_v1856);
                      }
                      }
                      }
                      }
                    case "TypeFun": {ESLVal $1549 = _v829.termRef(0);
                        ESLVal $1548 = _v829.termRef(1);
                        ESLVal $1547 = _v829.termRef(2);
                        
                        {ESLVal l = $1549;
                        
                        {ESLVal ns = $1548;
                        
                        {ESLVal _v1854 = $1547;
                        
                        return throwError.apply(_v1854);
                      }
                      }
                      }
                      }
                      default: {ESLVal _v1858 = _v829;
                        
                        return error(new ESLVal("Duplicate constructor name: ").add(n.add(new ESLVal(" ").add(_v1858))));
                      }
                    }
                    }
                  }
                });
              
              public ESLVal get(String name) {
                switch(name) {
                  case "throwError": return throwError;
                  
                  default: throw new Error("cannot find letrec binding");
                }
                }
              };
            ESLVal throwError = letrec.get("throwError");
            
              return throwError.apply(t);}
            
            else
              return checkSingletonConstructors.apply(_v1852);
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(10363,11018)").add(ESLVal.list(_v828)));
        }
        }
      else if(_v828.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(10363,11018)").add(ESLVal.list(_v828)));
      }
    }
  });
  private static ESLVal valueDefs = new ESLVal(new Function(new ESLVal("valueDefs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal defs = $args[0];
  {ESLVal _v830 = defs;
        
        if(_v830.isCons())
        {ESLVal $1558 = _v830.head();
          ESLVal $1559 = _v830.tail();
          
          switch($1558.termName) {
          case "TypeBind": {ESLVal $1571 = $1558.termRef(0);
            ESLVal $1570 = $1558.termRef(1);
            ESLVal $1569 = $1558.termRef(2);
            ESLVal $1568 = $1558.termRef(3);
            
            {ESLVal l = $1571;
            
            {ESLVal n = $1570;
            
            {ESLVal t = $1569;
            
            {ESLVal e = $1568;
            
            {ESLVal ds = $1559;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "DataBind": {ESLVal $1567 = $1558.termRef(0);
            ESLVal $1566 = $1558.termRef(1);
            ESLVal $1565 = $1558.termRef(2);
            ESLVal $1564 = $1558.termRef(3);
            
            {ESLVal l1 = $1567;
            
            {ESLVal n = $1566;
            
            {ESLVal t = $1565;
            
            {ESLVal e = $1564;
            
            {ESLVal ds = $1559;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
        case "CnstrBind": {ESLVal $1563 = $1558.termRef(0);
            ESLVal $1562 = $1558.termRef(1);
            ESLVal $1561 = $1558.termRef(2);
            ESLVal $1560 = $1558.termRef(3);
            
            {ESLVal l1 = $1563;
            
            {ESLVal n = $1562;
            
            {ESLVal t = $1561;
            
            {ESLVal e = $1560;
            
            {ESLVal ds = $1559;
            
            return valueDefs.apply(ds);
          }
          }
          }
          }
          }
          }
          default: {ESLVal b = $1558;
            
            {ESLVal ds = $1559;
            
            return valueDefs.apply(ds).cons(b);
          }
          }
        }
        }
      else if(_v830.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11059,11369)").add(ESLVal.list(_v830)));
      }
    }
  });
  private static ESLVal valueDefsToTEnv = new ESLVal(new Function(new ESLVal("valueDefsToTEnv"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1846 = $args[0];
  ESLVal _v1847 = $args[1];
  ESLVal _v1848 = $args[2];
  ESLVal _v1849 = $args[3];
  ESLVal _v1850 = $args[4];
  {ESLVal _v831 = _v1846;
        
        if(_v831.isCons())
        {ESLVal $1572 = _v831.head();
          ESLVal $1573 = _v831.tail();
          
          switch($1572.termName) {
          case "FunBinds": {ESLVal $1587 = $1572.termRef(0);
            ESLVal $1586 = $1572.termRef(1);
            
            if($1586.isCons())
            {ESLVal $1588 = $1586.head();
              ESLVal $1589 = $1586.tail();
              
              switch($1588.termName) {
              case "FunCase": {ESLVal $1594 = $1588.termRef(0);
                ESLVal $1593 = $1588.termRef(1);
                ESLVal $1592 = $1588.termRef(2);
                ESLVal $1591 = $1588.termRef(3);
                ESLVal $1590 = $1588.termRef(4);
                
                {ESLVal n = $1587;
                
                {ESLVal l = $1594;
                
                {ESLVal args = $1593;
                
                {ESLVal t = $1592;
                
                {ESLVal g = $1591;
                
                {ESLVal e = $1590;
                
                {ESLVal cases = $1589;
                
                {ESLVal ds = $1573;
                
                return valueDefsToTEnv.apply(ds,_v1847,_v1848,_v1849,_v1850).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1850,t)));
              }
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v831)));
            }
            }
          else if($1586.isNil())
            return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v831)));
          else return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v831)));
          }
        case "FunBind": {ESLVal $1585 = $1572.termRef(0);
            ESLVal $1584 = $1572.termRef(1);
            ESLVal $1583 = $1572.termRef(2);
            ESLVal $1582 = $1572.termRef(3);
            ESLVal $1581 = $1572.termRef(4);
            ESLVal $1580 = $1572.termRef(5);
            ESLVal $1579 = $1572.termRef(6);
            
            {ESLVal l = $1585;
            
            {ESLVal n = $1584;
            
            {ESLVal ps = $1583;
            
            {ESLVal t = $1582;
            
            {ESLVal st = $1581;
            
            {ESLVal b = $1580;
            
            {ESLVal g = $1579;
            
            {ESLVal ds = $1573;
            
            return valueDefsToTEnv.apply(ds,_v1847,_v1848,_v1849,_v1850).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1850,t)));
          }
          }
          }
          }
          }
          }
          }
          }
          }
        case "Binding": {ESLVal $1578 = $1572.termRef(0);
            ESLVal $1577 = $1572.termRef(1);
            ESLVal $1576 = $1572.termRef(2);
            ESLVal $1575 = $1572.termRef(3);
            ESLVal $1574 = $1572.termRef(4);
            
            {ESLVal l = $1578;
            
            {ESLVal n = $1577;
            
            {ESLVal t = $1576;
            
            {ESLVal st = $1575;
            
            {ESLVal e = $1574;
            
            {ESLVal ds = $1573;
            
            return valueDefsToTEnv.apply(ds,_v1847,_v1848,_v1849,_v1850).cons(new ESLVal("Map",n,substTypeEnv.apply(_v1850,t)));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v831)));
        }
        }
      else if(_v831.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(11476,12009)").add(ESLVal.list(_v831)));
      }
    }
  });
  private static ESLVal getCache = new ESLVal(new Function(new ESLVal("getCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {ESLVal cache = edb.ref("getProperty").apply(new ESLVal("typeCheckCache"));
        
        if(cache.eql($null).boolVal)
        return emptyTable;
        else
          return cache;
      }
    }
  });
  private static ESLVal setCache = new ESLVal(new Function(new ESLVal("setCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cache = $args[0];
  return edb.ref("setProperty").apply(new ESLVal("typeCheckCache"),cache);
    }
  });
  private static ESLVal updateCache = new ESLVal(new Function(new ESLVal("updateCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  ESLVal record = $args[1];
  ESLVal cache = $args[2];
  {ESLVal _v1845 = addEntry.apply(path,record,cache);
        
        {setCache.apply(_v1845);
      return _v1845;}
      }
    }
  });
  public static ESLVal typeCheckModule = new ESLVal(new Function(new ESLVal("typeCheckModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  {print.apply(new ESLVal("[ type check ").add(path.add(new ESLVal("]"))));
      return typeCheckModuleInternal.apply(path,getCache.apply(),new ESLVal(new Function(new ESLVal("fun505"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1841 = $args[0];
        ESLVal _v1842 = $args[1];
        ESLVal _v1843 = $args[2];
        ESLVal _v1844 = $args[3];
        return $null;
          }
        }));}
    }
  });
  private static ESLVal typeCheckModuleInternal = new ESLVal(new Function(new ESLVal("typeCheckModuleInternal"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal path = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  if(hasEntry.apply(path,cache).boolVal)
        {ESLVal _v832 = lookup.apply(path,cache);
          
          switch(_v832.termName) {
          case "Typed": {ESLVal $1598 = _v832.termRef(0);
            ESLVal $1597 = _v832.termRef(1);
            ESLVal $1596 = _v832.termRef(2);
            ESLVal $1595 = _v832.termRef(3);
            
            {ESLVal m = $1598;
            
            {ESLVal vEnv = $1597;
            
            {ESLVal cEnv = $1596;
            
            {ESLVal tEnv = $1595;
            
            return handler.apply(cache,vEnv,cEnv,tEnv);
          }
          }
          }
          }
          }
        case "Undefined": {
            return error(new ESLVal("recursive reference to ").add(path));
          }
          default: return error(new ESLVal("case error at Pos(13000,13234)").add(ESLVal.list(_v832)));
        }
        }
        else
          {ESLVal m = parse.apply(path);
            
            return typeCheckModuleCache.apply(m,updateCache.apply(path,new ESLVal("Undefined",new ESLVal[]{}),cache),new ESLVal(new Function(new ESLVal("fun506"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1837 = $args[0];
            ESLVal _v1838 = $args[1];
            ESLVal _v1839 = $args[2];
            ESLVal _v1840 = $args[3];
            return handler.apply(updateCache.apply(path,new ESLVal("Typed",m,_v1838,_v1839,_v1840),_v1837),_v1838,_v1839,_v1840);
              }
            }));
          }
    }
  });
  public static ESLVal typeCheckEntryPoint = new ESLVal(new Function(new ESLVal("typeCheckEntryPoint"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  return typeCheckModuleCache.apply(module,getCache.apply(),new ESLVal(new Function(new ESLVal("fun507"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1833 = $args[0];
        ESLVal _v1834 = $args[1];
        ESLVal _v1835 = $args[2];
        ESLVal _v1836 = $args[3];
        return $null;
          }
        }));
    }
  });
  private static ESLVal typeCheckModuleCache = new ESLVal(new Function(new ESLVal("typeCheckModuleCache"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  return typeCheckModule0.apply(module,cache,new ESLVal(new Function(new ESLVal("fun508"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1829 = $args[0];
        ESLVal _v1830 = $args[1];
        ESLVal _v1831 = $args[2];
        ESLVal _v1832 = $args[3];
        {ESLVal _v833 = module;
              
              switch(_v833.termName) {
              case "Module": {ESLVal $1605 = _v833.termRef(0);
                ESLVal $1604 = _v833.termRef(1);
                ESLVal $1603 = _v833.termRef(2);
                ESLVal $1602 = _v833.termRef(3);
                ESLVal $1601 = _v833.termRef(4);
                ESLVal $1600 = _v833.termRef(5);
                ESLVal $1599 = _v833.termRef(6);
                
                {ESLVal path = $1605;
                
                {ESLVal name = $1604;
                
                {ESLVal exports = $1603;
                
                {ESLVal imports = $1602;
                
                {ESLVal x = $1601;
                
                {ESLVal y = $1600;
                
                {ESLVal defs = $1599;
                
                return handler.apply(_v1829,restrictTypeEnv.apply(_v1830,exports),restrictTypeEnv.apply(_v1831,exports),restrictTypeEnv.apply(_v1832,exports));
              }
              }
              }
              }
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(13946,14204)").add(ESLVal.list(_v833)));
            }
            }
          }
        }));
    }
  });
  private static ESLVal typeCheckModule0 = new ESLVal(new Function(new ESLVal("typeCheckModule0"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  ESLVal cache = $args[1];
  ESLVal handler = $args[2];
  { LetRec letrec = new LetRec() {
        ESLVal _v1806 = new ESLVal(new Function(new ESLVal("processImports"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1816 = $args[0];
          ESLVal _v1817 = $args[1];
          ESLVal _v1818 = $args[2];
          {ESLVal _v834 = _v1816;
                
                if(_v834.isCons())
                {ESLVal $1606 = _v834.head();
                  ESLVal $1607 = _v834.tail();
                  
                  {ESLVal path = $1606;
                  
                  {ESLVal _v1819 = $1607;
                  
                  {ESLVal _v1820 = _v1819;
                  
                  return typeCheckModuleInternal.apply(path,_v1817,new ESLVal(new Function(new ESLVal("fun509"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1821 = $args[0];
                  ESLVal _v1822 = $args[1];
                  ESLVal _v1823 = $args[2];
                  ESLVal _v1824 = $args[3];
                  return _v1806.apply(_v1820,_v1821,new ESLVal(new Function(new ESLVal("fun510"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal _v1825 = $args[0];
                        ESLVal _v1826 = $args[1];
                        ESLVal _v1827 = $args[2];
                        ESLVal _v1828 = $args[3];
                        return _v1818.apply(_v1825,_v1826.add(_v1822),_v1827.add(_v1823),_v1828.add(_v1824));
                          }
                        }));
                    }
                  }));
                }
                }
                }
                }
              else if(_v834.isNil())
                return _v1818.apply(_v1817,$nil,$nil,$nil);
              else return error(new ESLVal("case error at Pos(14584,15141)").add(ESLVal.list(_v834)));
              }
            }
          });
        ESLVal _v1807 = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              {ESLVal _v835 = module;
                
                switch(_v835.termName) {
                case "Module": {ESLVal $1614 = _v835.termRef(0);
                  ESLVal $1613 = _v835.termRef(1);
                  ESLVal $1612 = _v835.termRef(2);
                  ESLVal $1611 = _v835.termRef(3);
                  ESLVal $1610 = _v835.termRef(4);
                  ESLVal $1609 = _v835.termRef(5);
                  ESLVal $1608 = _v835.termRef(6);
                  
                  {ESLVal path = $1614;
                  
                  {ESLVal name = $1613;
                  
                  {ESLVal exports = $1612;
                  
                  {ESLVal imports = $1611;
                  
                  {ESLVal x = $1610;
                  
                  {ESLVal y = $1609;
                  
                  {ESLVal defs = $1608;
                  
                  return _v1806.apply(imports,cache,new ESLVal(new Function(new ESLVal("fun511"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1808 = $args[0];
                  ESLVal _v1809 = $args[1];
                  ESLVal _v1810 = $args[2];
                  ESLVal _v1811 = $args[3];
                  {ESLVal _v1812 = typeEnv.apply(defs);
                        ESLVal _v1813 = mergeFunDefs.apply(defs);
                        
                        {checkDupBindings.apply(_v1813);
                      checkFreeTypes.apply(_v1812.add(_v1811.add(tenv0)));
                      checkSingletonTypes.apply(_v1812);
                      {ESLVal _v1814 = recTypes.apply(_v1812.add(_v1811.add(tenv0)));
                        
                        {ESLVal _v1815 = cnstrEnv.apply(_v1813,_v1814).add(_v1810.add(cnstrEnv0));
                        
                        {checkSingletonConstructors.apply(_v1815);
                      {ESLVal valueEnv = typeCheckValues.apply(valueDefs.apply(_v1813),new ESLVal("NullType",p0),_v1809,_v1814,_v1815);
                        
                        return handler.apply(_v1808,valueEnv,_v1815,_v1814);
                      }}
                      }
                      }}
                      }
                    }
                  }));
                }
                }
                }
                }
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(15170,16712)").add(ESLVal.list(_v835)));
              }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "_v1806": return _v1806;
            
            case "_v1807": return _v1807;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal _v1806 = letrec.get("_v1806");
      
      ESLVal _v1807 = letrec.get("_v1807");
      
        return _v1807.apply();}
      
    }
  });
  private static ESLVal typeCheckValues = new ESLVal(new Function(new ESLVal("typeCheckValues"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1801 = $args[0];
  ESLVal _v1802 = $args[1];
  ESLVal _v1803 = $args[2];
  ESLVal _v1804 = $args[3];
  ESLVal _v1805 = $args[4];
  {ESLVal valueEnv = valueDefsToTEnv.apply(_v1801,_v1802,$nil,_v1805,_v1804).add(_v1803.add(env0));
        
        {{
        ESLVal _v836 = _v1801;
        while(_v836.isCons()) {
          ESLVal def = _v836.headVal;
          typeCheckDef.apply(def,_v1802,valueEnv,valueEnv,_v1805,_v1804);
          _v836 = _v836.tailVal;}
      }
      return valueEnv;}
      }
    }
  });
  private static ESLVal genericize = new ESLVal(new Function(new ESLVal("genericize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal t = $args[1];
  if(length.apply(typeFV.apply(t)).eql($zero).boolVal)
        return t;
        else
          return new ESLVal("ForallType",l,typeFV.apply(t),t);
    }
  });
  private static ESLVal checkPatterns = new ESLVal(new Function(new ESLVal("checkPatterns"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal ps = $args[1];
  {ESLVal names = new java.util.function.Function<ESLVal,ESLVal>() {
            public ESLVal apply(ESLVal $l0) {
              ESLVal $a = $nil;
              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
              while(!$l0.isNil()) { 
                ESLVal p = $l0.head();
                $l0 = $l0.tail();
                ESLVal $l1 = patternNames.apply(p);
          while(!$l1.isNil()) {
            ESLVal n = $l1.head();
            $l1 = $l1.tail();
            $v.add(n);
          }
              }
              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
              return $a;
            }}.apply(ps);
        
        if(removeDups.apply(names).neql(names).boolVal)
        return error(new ESLVal("TypeError",l,new ESLVal("duplicate pattern variables")));
        else
          return $null;
      }
    }
  });
  private static ESLVal typeCheckDef = new ESLVal(new Function(new ESLVal("typeCheckDef"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1777 = $args[0];
  ESLVal _v1778 = $args[1];
  ESLVal _v1779 = $args[2];
  ESLVal _v1780 = $args[3];
  ESLVal _v1781 = $args[4];
  ESLVal _v1782 = $args[5];
  {ESLVal _v837 = _v1777;
        
        switch(_v837.termName) {
        case "FunBinds": {ESLVal $1628 = _v837.termRef(0);
          ESLVal $1627 = _v837.termRef(1);
          
          {ESLVal n = $1628;
          
          {ESLVal cases = $1627;
          
          { LetRec letrec = new LetRec() {
          ESLVal checkArities = new ESLVal(new Function(new ESLVal("checkArities"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1798 = $args[0];
            ESLVal _v1799 = $args[1];
            {ESLVal _v841 = _v1798;
                  
                  if(_v841.isCons())
                  {ESLVal $1638 = _v841.head();
                    ESLVal $1639 = _v841.tail();
                    
                    switch($1638.termName) {
                    case "FunCase": {ESLVal $1644 = $1638.termRef(0);
                      ESLVal $1643 = $1638.termRef(1);
                      ESLVal $1642 = $1638.termRef(2);
                      ESLVal $1641 = $1638.termRef(3);
                      ESLVal $1640 = $1638.termRef(4);
                      
                      {ESLVal l = $1644;
                      
                      {ESLVal args = $1643;
                      
                      {ESLVal t = $1642;
                      
                      {ESLVal g = $1641;
                      
                      {ESLVal e = $1640;
                      
                      {ESLVal _v1800 = $1639;
                      
                      if(_v1799.eql(new ESLVal(-1)).or(length.apply(args).eql(_v1799)).boolVal)
                      return checkArities.apply(_v1800,length.apply(args));
                      else
                        return error(new ESLVal("TypeError",l,new ESLVal("inconsistent overloaded arity")));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(17919,18208)").add(ESLVal.list(_v841)));
                  }
                  }
                else if(_v841.isNil())
                  return $null;
                else return error(new ESLVal("case error at Pos(17919,18208)").add(ESLVal.list(_v841)));
                }
              }
            });
          ESLVal checkLoneVars = new ESLVal(new Function(new ESLVal("checkLoneVars"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1796 = $args[0];
            {ESLVal _v842 = _v1796;
                  
                  if(_v842.isCons())
                  {ESLVal $1645 = _v842.head();
                    ESLVal $1646 = _v842.tail();
                    
                    switch($1645.termName) {
                    case "FunCase": {ESLVal $1651 = $1645.termRef(0);
                      ESLVal $1650 = $1645.termRef(1);
                      ESLVal $1649 = $1645.termRef(2);
                      ESLVal $1648 = $1645.termRef(3);
                      ESLVal $1647 = $1645.termRef(4);
                      
                      {ESLVal l = $1651;
                      
                      {ESLVal args = $1650;
                      
                      {ESLVal t = $1649;
                      
                      {ESLVal g = $1648;
                      
                      {ESLVal e = $1647;
                      
                      {ESLVal _v1797 = $1646;
                      
                      {{
                      ESLVal _v843 = args;
                      while(_v843.isCons()) {
                        ESLVal arg = _v843.headVal;
                        checkLoneVar.apply(arg);
                        _v843 = _v843.tailVal;}
                    }
                    return checkLoneVars.apply(_v1797);}
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    default: return error(new ESLVal("case error at Pos(18267,18502)").add(ESLVal.list(_v842)));
                  }
                  }
                else if(_v842.isNil())
                  return $null;
                else return error(new ESLVal("case error at Pos(18267,18502)").add(ESLVal.list(_v842)));
                }
              }
            });
          ESLVal checkLoneVar = new ESLVal(new Function(new ESLVal("checkLoneVar"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v844 = p;
                  
                  switch(_v844.termName) {
                  case "PVar": {ESLVal $1654 = _v844.termRef(0);
                    ESLVal $1653 = _v844.termRef(1);
                    ESLVal $1652 = _v844.termRef(2);
                    
                    switch($1652.termName) {
                    case "VoidType": {ESLVal $1655 = $1652.termRef(0);
                      
                      {ESLVal l = $1654;
                      
                      {ESLVal _v1793 = $1653;
                      
                      {ESLVal tl = $1655;
                      
                      return error(new ESLVal("TypeError",l,new ESLVal("top level variables should be typed.")));
                    }
                    }
                    }
                    }
                    default: {ESLVal _v1794 = _v844;
                      
                      return $null;
                    }
                  }
                  }
                  default: {ESLVal _v1795 = _v844;
                    
                    return $null;
                  }
                }
                }
              }
            });
          
          public ESLVal get(String name) {
            switch(name) {
              case "checkArities": return checkArities;
              
              case "checkLoneVars": return checkLoneVars;
              
              case "checkLoneVar": return checkLoneVar;
              
              default: throw new Error("cannot find letrec binding");
            }
            }
          };
        ESLVal checkArities = letrec.get("checkArities");
        
        ESLVal checkLoneVars = letrec.get("checkLoneVars");
        
        ESLVal checkLoneVar = letrec.get("checkLoneVar");
        
          {checkArities.apply(cases,new ESLVal(-1));
        return checkLoneVars.apply(cases);}}
        
        }
        }
        }
      case "FunBind": {ESLVal $1626 = _v837.termRef(0);
          ESLVal $1625 = _v837.termRef(1);
          ESLVal $1624 = _v837.termRef(2);
          ESLVal $1623 = _v837.termRef(3);
          ESLVal $1622 = _v837.termRef(4);
          ESLVal $1621 = _v837.termRef(5);
          ESLVal $1620 = _v837.termRef(6);
          
          {ESLVal l = $1626;
          
          {ESLVal n = $1625;
          
          {ESLVal ps = $1624;
          
          {ESLVal t = $1623;
          
          {ESLVal st = $1622;
          
          {ESLVal b = $1621;
          
          {ESLVal g = $1620;
          
          {checkPatterns.apply(l,ps);
        {ESLVal argTypes = map.apply(new ESLVal(new Function(new ESLVal("fun512"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v838 = p;
                  
                  switch(_v838.termName) {
                  case "PVar": {ESLVal $1631 = _v838.termRef(0);
                    ESLVal $1630 = _v838.termRef(1);
                    ESLVal $1629 = _v838.termRef(2);
                    
                    {ESLVal _v1787 = $1631;
                    
                    {ESLVal _v1788 = $1630;
                    
                    {ESLVal _v1789 = $1629;
                    
                    return substTypeEnv.apply(_v1782,_v1789);
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(19134,19200)").add(ESLVal.list(_v838)));
                }
                }
              }
            }),ps);
          ESLVal argNames = map.apply(new ESLVal(new Function(new ESLVal("fun513"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal p = $args[0];
            {ESLVal _v839 = p;
                  
                  switch(_v839.termName) {
                  case "PVar": {ESLVal $1634 = _v839.termRef(0);
                    ESLVal $1633 = _v839.termRef(1);
                    ESLVal $1632 = _v839.termRef(2);
                    
                    {ESLVal _v1784 = $1634;
                    
                    {ESLVal _v1785 = $1633;
                    
                    {ESLVal _v1786 = $1632;
                    
                    return _v1785;
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(19272,19316)").add(ESLVal.list(_v839)));
                }
                }
              }
            }),ps);
          
          {ESLVal bodyType = guardedExpType.apply(l,g,b,_v1778,zipTypeEnv.apply(argNames,argTypes).add(_v1779),_v1781,_v1782);
          
          {ESLVal fType = ((Supplier<ESLVal>)() -> { 
              {ESLVal _v840 = t;
                
                switch(_v840.termName) {
                case "ForallType": {ESLVal $1637 = _v840.termRef(0);
                  ESLVal $1636 = _v840.termRef(1);
                  ESLVal $1635 = _v840.termRef(2);
                  
                  {ESLVal _v1790 = $1637;
                  
                  {ESLVal ns = $1636;
                  
                  {ESLVal _v1791 = $1635;
                  
                  return genericize.apply(_v1790,new ESLVal("FunType",_v1790,argTypes,bodyType));
                }
                }
                }
                }
                default: {ESLVal _v1792 = _v840;
                  
                  return new ESLVal("FunType",l,argTypes,bodyType);
                }
              }
              }
            }).get();
          ESLVal dType = substTypeEnv.apply(_v1782,t);
          
          if(subType.apply(fType,dType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal("::").add(ppType.apply(fType,_v1782).add(new ESLVal(" does not match declaration ").add(ppType.apply(dType,_v1782))))))));
        }
        }
        }}
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $1619 = _v837.termRef(0);
          ESLVal $1618 = _v837.termRef(1);
          ESLVal $1617 = _v837.termRef(2);
          ESLVal $1616 = _v837.termRef(3);
          ESLVal $1615 = _v837.termRef(4);
          
          {ESLVal l = $1619;
          
          {ESLVal n = $1618;
          
          {ESLVal dt = $1617;
          
          {ESLVal st = $1616;
          
          {ESLVal e = $1615;
          
          {ESLVal valueType = expType.apply(e,_v1778,_v1779,_v1781,_v1782);
          
          {ESLVal valueFV = typeFV.apply(valueType);
          ESLVal declaredType = lookupType.apply(n,_v1780);
          
          {ESLVal _v1783 = ((Supplier<ESLVal>)() -> { 
              if(valueFV.eql($nil).boolVal)
                return valueType;
                else
                  return new ESLVal("ForallType",l,valueFV,valueType);
            }).get();
          
          if(subType.apply(_v1783,declaredType).boolVal)
          return $null;
          else
            return error(new ESLVal("TypeError",l,new ESLVal("type of ").add(n.add(new ESLVal(" ").add(ppType.apply(_v1783,_v1782).add(new ESLVal(" does not match declared type = ").add(ppType.apply(declaredType,_v1782))))))));
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17800,20723)").add(ESLVal.list(_v837)));
      }
      }
    }
  });
  private static ESLVal guardedExpType = new ESLVal(new Function(new ESLVal("guardedExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1770 = $args[0];
  ESLVal _v1771 = $args[1];
  ESLVal _v1772 = $args[2];
  ESLVal _v1773 = $args[3];
  ESLVal _v1774 = $args[4];
  ESLVal _v1775 = $args[5];
  ESLVal _v1776 = $args[6];
  {ESLVal bt = expType.apply(_v1771,_v1773,_v1774,_v1775,_v1776);
        
        if(isBoolType.apply(bt).boolVal)
        return expType.apply(_v1772,_v1773,_v1774,_v1775,_v1776);
        else
          return error(new ESLVal("TypeError",_v1770,new ESLVal("guarded expression requires a boolean value: ").add(ppType.apply(bt,_v1776))));
      }
    }
  });
  private static ESLVal expType = new ESLVal(new Function(new ESLVal("expType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1748 = $args[0];
  ESLVal _v1749 = $args[1];
  ESLVal _v1750 = $args[2];
  ESLVal _v1751 = $args[3];
  ESLVal _v1752 = $args[4];
  {ESLVal _v845 = _v1748;
        
        switch(_v845.termName) {
        case "ActExp": {ESLVal $1791 = _v845.termRef(0);
          ESLVal $1790 = _v845.termRef(1);
          ESLVal $1789 = _v845.termRef(2);
          ESLVal $1788 = _v845.termRef(3);
          ESLVal $1787 = _v845.termRef(4);
          ESLVal $1786 = _v845.termRef(5);
          ESLVal $1785 = _v845.termRef(6);
          ESLVal $1784 = _v845.termRef(7);
          
          {ESLVal l = $1791;
          
          {ESLVal n = $1790;
          
          {ESLVal args = $1789;
          
          {ESLVal exports = $1788;
          
          {ESLVal parent = $1787;
          
          {ESLVal bindings = $1786;
          
          {ESLVal init = $1785;
          
          {ESLVal arms = $1784;
          
          return actType.apply(l,n,args,parent,exports,bindings,init,arms,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
        }
        }
        }
        }
      case "Apply": {ESLVal $1783 = _v845.termRef(0);
          ESLVal $1782 = _v845.termRef(1);
          ESLVal $1781 = _v845.termRef(2);
          
          {ESLVal l = $1783;
          
          {ESLVal op = $1782;
          
          {ESLVal args = $1781;
          
          return applyType.apply(l,op,args,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $1780 = _v845.termRef(0);
          ESLVal $1779 = _v845.termRef(1);
          ESLVal $1778 = _v845.termRef(2);
          
          {ESLVal l = $1780;
          
          {ESLVal _v1769 = $1779;
          
          {ESLVal ts = $1778;
          
          return applyTypeExp.apply(l,_v1769,ts,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "ArrayUpdate": {ESLVal $1777 = _v845.termRef(0);
          ESLVal $1776 = _v845.termRef(1);
          ESLVal $1775 = _v845.termRef(2);
          ESLVal $1774 = _v845.termRef(3);
          
          {ESLVal l = $1777;
          
          {ESLVal a = $1776;
          
          {ESLVal i = $1775;
          
          {ESLVal v = $1774;
          
          return arrayUpdateType.apply(l,a,i,v,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $1773 = _v845.termRef(0);
          ESLVal $1772 = _v845.termRef(1);
          ESLVal $1771 = _v845.termRef(2);
          
          {ESLVal l = $1773;
          
          {ESLVal a = $1772;
          
          {ESLVal i = $1771;
          
          return arrayRefType.apply(l,a,i,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "BagExp": {ESLVal $1770 = _v845.termRef(0);
          ESLVal $1769 = _v845.termRef(1);
          
          {ESLVal l = $1770;
          
          {ESLVal es = $1769;
          
          return bagType.apply(l,es,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "Become": {ESLVal $1768 = _v845.termRef(0);
          ESLVal $1767 = _v845.termRef(1);
          
          {ESLVal l = $1768;
          
          {ESLVal _v1768 = $1767;
          
          return becomeType.apply(l,_v1768,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "BinExp": {ESLVal $1766 = _v845.termRef(0);
          ESLVal $1765 = _v845.termRef(1);
          ESLVal $1764 = _v845.termRef(2);
          ESLVal $1763 = _v845.termRef(3);
          
          {ESLVal l = $1766;
          
          {ESLVal e1 = $1765;
          
          {ESLVal op = $1764;
          
          {ESLVal e2 = $1763;
          
          return binExpType.apply(l,e1,op,e2,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "Block": {ESLVal $1762 = _v845.termRef(0);
          ESLVal $1761 = _v845.termRef(1);
          
          {ESLVal l = $1762;
          
          {ESLVal es = $1761;
          
          return blockType.apply(l,es,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "BoolExp": {ESLVal $1760 = _v845.termRef(0);
          ESLVal $1759 = _v845.termRef(1);
          
          {ESLVal l = $1760;
          
          {ESLVal b = $1759;
          
          return new ESLVal("BoolType",l);
        }
        }
        }
      case "Case": {ESLVal $1758 = _v845.termRef(0);
          ESLVal $1757 = _v845.termRef(1);
          ESLVal $1756 = _v845.termRef(2);
          ESLVal $1755 = _v845.termRef(3);
          
          {ESLVal l = $1758;
          
          {ESLVal decs = $1757;
          
          {ESLVal es = $1756;
          
          {ESLVal arms = $1755;
          
          return caseType.apply(l,es,arms,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "Cmp": {ESLVal $1754 = _v845.termRef(0);
          ESLVal $1753 = _v845.termRef(1);
          ESLVal $1752 = _v845.termRef(2);
          
          {ESLVal l = $1754;
          
          {ESLVal _v1767 = $1753;
          
          {ESLVal qs = $1752;
          
          return cmpType.apply(l,_v1767,qs,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Grab": {ESLVal $1751 = _v845.termRef(0);
          ESLVal $1750 = _v845.termRef(1);
          ESLVal $1749 = _v845.termRef(2);
          
          {ESLVal l = $1751;
          
          {ESLVal refs = $1750;
          
          {ESLVal _v1766 = $1749;
          
          return expType.apply(_v1766,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "FloatExp": {ESLVal $1748 = _v845.termRef(0);
          ESLVal $1747 = _v845.termRef(1);
          
          {ESLVal l = $1748;
          
          {ESLVal f = $1747;
          
          return new ESLVal("FloatType",l);
        }
        }
        }
      case "Fold": {ESLVal $1746 = _v845.termRef(0);
          ESLVal $1745 = _v845.termRef(1);
          ESLVal $1744 = _v845.termRef(2);
          
          {ESLVal l = $1746;
          
          {ESLVal t = $1745;
          
          {ESLVal _v1765 = $1744;
          
          return foldType.apply(l,t,_v1765,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "For": {ESLVal $1743 = _v845.termRef(0);
          ESLVal $1742 = _v845.termRef(1);
          ESLVal $1741 = _v845.termRef(2);
          ESLVal $1740 = _v845.termRef(3);
          
          {ESLVal l = $1743;
          
          {ESLVal p = $1742;
          
          {ESLVal list = $1741;
          
          {ESLVal _v1764 = $1740;
          
          return forType.apply(l,p,list,_v1764,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $1739 = _v845.termRef(0);
          ESLVal $1738 = _v845.termRef(1);
          ESLVal $1737 = _v845.termRef(2);
          ESLVal $1736 = _v845.termRef(3);
          ESLVal $1735 = _v845.termRef(4);
          
          {ESLVal l = $1739;
          
          {ESLVal n = $1738;
          
          {ESLVal args = $1737;
          
          {ESLVal t = $1736;
          
          {ESLVal _v1763 = $1735;
          
          return funType.apply(l,n,args,t,_v1763,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
        }
      case "If": {ESLVal $1734 = _v845.termRef(0);
          ESLVal $1733 = _v845.termRef(1);
          ESLVal $1732 = _v845.termRef(2);
          ESLVal $1731 = _v845.termRef(3);
          
          {ESLVal l = $1734;
          
          {ESLVal e1 = $1733;
          
          {ESLVal e2 = $1732;
          
          {ESLVal e3 = $1731;
          
          return ifType.apply(l,e1,e2,e3,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "IntExp": {ESLVal $1730 = _v845.termRef(0);
          ESLVal $1729 = _v845.termRef(1);
          
          {ESLVal l = $1730;
          
          {ESLVal n = $1729;
          
          return new ESLVal("IntType",l);
        }
        }
        }
      case "Let": {ESLVal $1728 = _v845.termRef(0);
          ESLVal $1727 = _v845.termRef(1);
          ESLVal $1726 = _v845.termRef(2);
          
          {ESLVal l = $1728;
          
          {ESLVal bs = $1727;
          
          {ESLVal _v1762 = $1726;
          
          return letType.apply(l,bs,_v1762,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Letrec": {ESLVal $1725 = _v845.termRef(0);
          ESLVal $1724 = _v845.termRef(1);
          ESLVal $1723 = _v845.termRef(2);
          
          {ESLVal l = $1725;
          
          {ESLVal bs = $1724;
          
          {ESLVal _v1761 = $1723;
          
          return letrecType.apply(l,bs,_v1761,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "List": {ESLVal $1722 = _v845.termRef(0);
          ESLVal $1721 = _v845.termRef(1);
          
          {ESLVal l = $1722;
          
          {ESLVal es = $1721;
          
          return listType.apply(l,es,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "Now": {ESLVal $1720 = _v845.termRef(0);
          
          {ESLVal l = $1720;
          
          return new ESLVal("IntType",l);
        }
        }
      case "Probably": {ESLVal $1719 = _v845.termRef(0);
          ESLVal $1718 = _v845.termRef(1);
          ESLVal $1717 = _v845.termRef(2);
          ESLVal $1716 = _v845.termRef(3);
          ESLVal $1715 = _v845.termRef(4);
          
          {ESLVal l = $1719;
          
          {ESLVal p = $1718;
          
          {ESLVal t = $1717;
          
          {ESLVal e1 = $1716;
          
          {ESLVal e2 = $1715;
          
          return probablyType.apply(l,p,t,e1,e2,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
        }
      case "PLet": {ESLVal $1714 = _v845.termRef(0);
          ESLVal $1713 = _v845.termRef(1);
          ESLVal $1712 = _v845.termRef(2);
          
          {ESLVal l = $1714;
          
          {ESLVal bs = $1713;
          
          {ESLVal _v1760 = $1712;
          
          return letType.apply(l,bs,_v1760,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Record": {ESLVal $1711 = _v845.termRef(0);
          ESLVal $1710 = _v845.termRef(1);
          
          {ESLVal l = $1711;
          
          {ESLVal fields = $1710;
          
          return recordType.apply(l,fields,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "Ref": {ESLVal $1709 = _v845.termRef(0);
          ESLVal $1708 = _v845.termRef(1);
          ESLVal $1707 = _v845.termRef(2);
          
          {ESLVal l = $1709;
          
          {ESLVal _v1759 = $1708;
          
          {ESLVal n = $1707;
          
          return refType.apply(l,_v1759,n,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $1706 = _v845.termRef(0);
          ESLVal $1705 = _v845.termRef(1);
          
          {ESLVal l = $1706;
          
          {ESLVal n = $1705;
          
          return refType.apply(l,new ESLVal("Var",l,new ESLVal("$super")),n,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "Self": {ESLVal $1704 = _v845.termRef(0);
          
          {ESLVal l = $1704;
          
          return _v1749;
        }
        }
      case "Send": {ESLVal $1699 = _v845.termRef(0);
          ESLVal $1698 = _v845.termRef(1);
          ESLVal $1697 = _v845.termRef(2);
          
          switch($1697.termName) {
          case "Term": {ESLVal $1703 = $1697.termRef(0);
            ESLVal $1702 = $1697.termRef(1);
            ESLVal $1701 = $1697.termRef(2);
            ESLVal $1700 = $1697.termRef(3);
            
            {ESLVal l = $1699;
            
            {ESLVal target = $1698;
            
            {ESLVal tl = $1703;
            
            {ESLVal n = $1702;
            
            {ESLVal ts = $1701;
            
            {ESLVal args = $1700;
            
            return sendType.apply(l,target,n,args,_v1749,_v1750,_v1751,_v1752);
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(21201,25254)").add(ESLVal.list(_v845)));
        }
        }
      case "SendTimeSuper": {ESLVal $1696 = _v845.termRef(0);
          
          {ESLVal l = $1696;
          
          return new ESLVal("VoidType",l);
        }
        }
      case "SendSuper": {ESLVal $1695 = _v845.termRef(0);
          ESLVal $1694 = _v845.termRef(1);
          
          {ESLVal l = $1695;
          
          {ESLVal _v1758 = $1694;
          
          return new ESLVal("VoidType",l);
        }
        }
        }
      case "SetExp": {ESLVal $1693 = _v845.termRef(0);
          ESLVal $1692 = _v845.termRef(1);
          
          {ESLVal l = $1693;
          
          {ESLVal es = $1692;
          
          return setType.apply(l,es,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "StrExp": {ESLVal $1691 = _v845.termRef(0);
          ESLVal $1690 = _v845.termRef(1);
          
          {ESLVal l = $1691;
          
          {ESLVal s = $1690;
          
          return new ESLVal("StrType",l);
        }
        }
        }
      case "Term": {ESLVal $1689 = _v845.termRef(0);
          ESLVal $1688 = _v845.termRef(1);
          ESLVal $1687 = _v845.termRef(2);
          ESLVal $1686 = _v845.termRef(3);
          
          {ESLVal l = $1689;
          
          {ESLVal n = $1688;
          
          {ESLVal ts = $1687;
          
          {ESLVal es = $1686;
          
          return termType.apply(l,n,ts,es,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
        }
      case "Throw": {ESLVal $1685 = _v845.termRef(0);
          ESLVal $1684 = _v845.termRef(1);
          ESLVal $1683 = _v845.termRef(2);
          
          {ESLVal l = $1685;
          
          {ESLVal t = $1684;
          
          {ESLVal _v1757 = $1683;
          
          return throwType.apply(l,t,_v1757,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Try": {ESLVal $1682 = _v845.termRef(0);
          ESLVal $1681 = _v845.termRef(1);
          ESLVal $1680 = _v845.termRef(2);
          
          {ESLVal l = $1682;
          
          {ESLVal _v1756 = $1681;
          
          {ESLVal arms = $1680;
          
          return tryType.apply(l,_v1756,arms,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "New": {ESLVal $1679 = _v845.termRef(0);
          ESLVal $1678 = _v845.termRef(1);
          ESLVal $1677 = _v845.termRef(2);
          
          {ESLVal l = $1679;
          
          {ESLVal b = $1678;
          
          {ESLVal args = $1677;
          
          return newType.apply(l,b,args,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "NewArray": {ESLVal $1676 = _v845.termRef(0);
          ESLVal $1675 = _v845.termRef(1);
          ESLVal $1674 = _v845.termRef(2);
          
          {ESLVal l = $1676;
          
          {ESLVal t = $1675;
          
          {ESLVal i = $1674;
          
          return newArrayType.apply(l,t,i,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "NewTable": {ESLVal $1673 = _v845.termRef(0);
          ESLVal $1672 = _v845.termRef(1);
          ESLVal $1671 = _v845.termRef(2);
          
          {ESLVal l = $1673;
          
          {ESLVal key = $1672;
          
          {ESLVal value = $1671;
          
          return new ESLVal("TableType",l,substTypeEnv.apply(_v1752,key),substTypeEnv.apply(_v1752,value));
        }
        }
        }
        }
      case "NewJava": {ESLVal $1670 = _v845.termRef(0);
          ESLVal $1669 = _v845.termRef(1);
          ESLVal $1668 = _v845.termRef(2);
          ESLVal $1667 = _v845.termRef(3);
          
          {ESLVal l = $1670;
          
          {ESLVal path = $1669;
          
          {ESLVal t = $1668;
          
          {ESLVal args = $1667;
          
          {{
          ESLVal _v846 = args;
          while(_v846.isCons()) {
            ESLVal a = _v846.headVal;
            expType.apply(a,_v1749,_v1750,_v1751,_v1752);
            _v846 = _v846.tailVal;}
        }
        return substTypeEnv.apply(_v1752,t);}
        }
        }
        }
        }
        }
      case "Not": {ESLVal $1666 = _v845.termRef(0);
          ESLVal $1665 = _v845.termRef(1);
          
          {ESLVal l = $1666;
          
          {ESLVal _v1755 = $1665;
          
          return notType.apply(l,_v1755,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
      case "NullExp": {ESLVal $1664 = _v845.termRef(0);
          
          {ESLVal l = $1664;
          
          return new ESLVal("ForallType",l,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",l,new ESLVal("T")));
        }
        }
      case "Unfold": {ESLVal $1663 = _v845.termRef(0);
          ESLVal $1662 = _v845.termRef(1);
          ESLVal $1661 = _v845.termRef(2);
          
          {ESLVal l = $1663;
          
          {ESLVal t = $1662;
          
          {ESLVal _v1754 = $1661;
          
          return unfoldTypeExp.apply(l,t,_v1754,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Update": {ESLVal $1660 = _v845.termRef(0);
          ESLVal $1659 = _v845.termRef(1);
          ESLVal $1658 = _v845.termRef(2);
          
          {ESLVal l = $1660;
          
          {ESLVal n = $1659;
          
          {ESLVal _v1753 = $1658;
          
          return updateType.apply(l,n,_v1753,_v1749,_v1750,_v1751,_v1752);
        }
        }
        }
        }
      case "Var": {ESLVal $1657 = _v845.termRef(0);
          ESLVal $1656 = _v845.termRef(1);
          
          {ESLVal l = $1657;
          
          {ESLVal n = $1656;
          
          return varType.apply(l,n,_v1750);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(21201,25254)").add(ESLVal.list(_v845)));
      }
      }
    }
  });
  private static ESLVal throwType = new ESLVal(new Function(new ESLVal("throwType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1741 = $args[0];
  ESLVal _v1742 = $args[1];
  ESLVal _v1743 = $args[2];
  ESLVal _v1744 = $args[3];
  ESLVal _v1745 = $args[4];
  ESLVal _v1746 = $args[5];
  ESLVal _v1747 = $args[6];
  {ESLVal valType = expType.apply(_v1743,_v1744,_v1745,_v1746,_v1747);
        
        return substTypeEnv.apply(_v1747,_v1742);
      }
    }
  });
  private static ESLVal foldType = new ESLVal(new Function(new ESLVal("foldType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1734 = $args[0];
  ESLVal _v1735 = $args[1];
  ESLVal _v1736 = $args[2];
  ESLVal _v1737 = $args[3];
  ESLVal _v1738 = $args[4];
  ESLVal _v1739 = $args[5];
  ESLVal _v1740 = $args[6];
  {ESLVal eType = expType.apply(_v1736,_v1737,_v1738,_v1739,_v1740);
        
        if(typeEqual.apply(substTypeEnv.apply(_v1740,_v1735),eType).boolVal)
        return eType;
        else
          return error(new ESLVal("TypeError",_v1734,new ESLVal("fold type ").add(ppType.apply(_v1735,_v1740).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v1740))))));
      }
    }
  });
  private static ESLVal unfoldTypeExp = new ESLVal(new Function(new ESLVal("unfoldTypeExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1725 = $args[0];
  ESLVal _v1726 = $args[1];
  ESLVal _v1727 = $args[2];
  ESLVal _v1728 = $args[3];
  ESLVal _v1729 = $args[4];
  ESLVal _v1730 = $args[5];
  ESLVal _v1731 = $args[6];
  {ESLVal eType = expType.apply(_v1727,_v1728,_v1729,_v1730,_v1731);
        ESLVal recType = substTypeEnv.apply(_v1731,_v1726);
        
        {ESLVal _v847 = recType;
        
        switch(_v847.termName) {
        case "RecType": {ESLVal $1794 = _v847.termRef(0);
          ESLVal $1793 = _v847.termRef(1);
          ESLVal $1792 = _v847.termRef(2);
          
          {ESLVal rl = $1794;
          
          {ESLVal n = $1793;
          
          {ESLVal _v1732 = $1792;
          
          if(typeEqual.apply(substType.apply(eType,n,_v1732),eType).boolVal)
          return eType;
          else
            return error(new ESLVal("TypeError",_v1725,new ESLVal("unfold type ").add(ppType.apply(substType.apply(eType,n,_v1732),_v1731).add(new ESLVal(" does not equal ").add(ppType.apply(eType,_v1731))))));
        }
        }
        }
        }
        default: {ESLVal _v1733 = _v847;
          
          return error(new ESLVal("TypeError",_v1725,new ESLVal("unfold type expects a rec type").add(ppType.apply(recType,_v1731))));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayUpdateType = new ESLVal(new Function(new ESLVal("arrayUpdateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1717 = $args[0];
  ESLVal _v1718 = $args[1];
  ESLVal _v1719 = $args[2];
  ESLVal _v1720 = $args[3];
  ESLVal _v1721 = $args[4];
  ESLVal _v1722 = $args[5];
  ESLVal _v1723 = $args[6];
  ESLVal _v1724 = $args[7];
  {ESLVal aType = expType.apply(_v1718,_v1721,_v1722,_v1723,_v1724);
        ESLVal iType = expType.apply(_v1719,_v1721,_v1722,_v1723,_v1724);
        ESLVal vType = expType.apply(_v1720,_v1721,_v1722,_v1723,_v1724);
        
        {ESLVal _v848 = aType;
        
        switch(_v848.termName) {
        case "ArrayType": {ESLVal $1796 = _v848.termRef(0);
          ESLVal $1795 = _v848.termRef(1);
          
          {ESLVal al = $1796;
          
          {ESLVal t = $1795;
          
          if(isIntType.apply(iType).boolVal)
          if(typeEqual.apply(vType,t).boolVal)
            return aType;
            else
              return error(new ESLVal("TypeError",_v1717,new ESLVal("value type ").add(vType.add(new ESLVal(" does not match array type ").add(t)))));
          else
            return error(new ESLVal("TypeError",_v1717,new ESLVal("array index should be an integer ").add(_v1719)));
        }
        }
        }
        default: {ESLVal t = _v848;
          
          return error(new ESLVal("TypeError",_v1717,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal arrayRefType = new ESLVal(new Function(new ESLVal("arrayRefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1710 = $args[0];
  ESLVal _v1711 = $args[1];
  ESLVal _v1712 = $args[2];
  ESLVal _v1713 = $args[3];
  ESLVal _v1714 = $args[4];
  ESLVal _v1715 = $args[5];
  ESLVal _v1716 = $args[6];
  {ESLVal aType = expType.apply(_v1711,_v1713,_v1714,_v1715,_v1716);
        ESLVal iType = expType.apply(_v1712,_v1713,_v1714,_v1715,_v1716);
        
        {ESLVal _v849 = aType;
        
        switch(_v849.termName) {
        case "ArrayType": {ESLVal $1798 = _v849.termRef(0);
          ESLVal $1797 = _v849.termRef(1);
          
          {ESLVal al = $1798;
          
          {ESLVal t = $1797;
          
          if(isIntType.apply(iType).boolVal)
          return t;
          else
            return error(new ESLVal("TypeError",_v1710,new ESLVal("array index should be an integer ").add(_v1712)));
        }
        }
        }
        default: {ESLVal t = _v849;
          
          return error(new ESLVal("TypeError",_v1710,new ESLVal("expecting an array ").add(aType)));
        }
      }
      }
      }
    }
  });
  private static ESLVal newArrayType = new ESLVal(new Function(new ESLVal("newArrayType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1703 = $args[0];
  ESLVal _v1704 = $args[1];
  ESLVal _v1705 = $args[2];
  ESLVal _v1706 = $args[3];
  ESLVal _v1707 = $args[4];
  ESLVal _v1708 = $args[5];
  ESLVal _v1709 = $args[6];
  {ESLVal i = expType.apply(_v1705,_v1706,_v1707,_v1708,_v1709);
        
        if(isIntType.apply(i).boolVal)
        return new ESLVal("ArrayType",_v1703,substTypeEnv.apply(_v1709,_v1704));
        else
          return error(new ESLVal("TypeError",_v1703,new ESLVal("expecting an integer type: ").add(i)));
      }
    }
  });
  private static ESLVal becomeType = new ESLVal(new Function(new ESLVal("becomeType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1697 = $args[0];
  ESLVal _v1698 = $args[1];
  ESLVal _v1699 = $args[2];
  ESLVal _v1700 = $args[3];
  ESLVal _v1701 = $args[4];
  ESLVal _v1702 = $args[5];
  {ESLVal bType = expType.apply(_v1698,_v1699,_v1700,_v1701,_v1702);
        
        if(typeEqual.apply(bType,_v1699).boolVal)
        return bType;
        else
          return error(new ESLVal("TypeError",_v1697,new ESLVal("expecting become to match self type: ").add(ppType.apply(bType,_v1702).add(new ESLVal(" ").add(ppType.apply(_v1699,_v1702))))));
      }
    }
  });
  private static ESLVal probablyType = new ESLVal(new Function(new ESLVal("probablyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1685 = $args[0];
  ESLVal _v1686 = $args[1];
  ESLVal _v1687 = $args[2];
  ESLVal _v1688 = $args[3];
  ESLVal _v1689 = $args[4];
  ESLVal _v1690 = $args[5];
  ESLVal _v1691 = $args[6];
  ESLVal _v1692 = $args[7];
  ESLVal _v1693 = $args[8];
  {ESLVal pt = expType.apply(_v1686,_v1690,_v1691,_v1692,_v1693);
        
        if(isIntType.apply(pt).boolVal)
        {ESLVal _v1694 = substTypeEnv.apply(_v1693,_v1687);
          ESLVal _v1695 = expType.apply(_v1688,_v1690,_v1691,_v1692,_v1693);
          ESLVal _v1696 = expType.apply(_v1689,_v1690,_v1691,_v1692,_v1693);
          
          if(typeEqual.apply(_v1694,_v1695).and(typeEqual.apply(_v1694,_v1696)).boolVal)
          return _v1694;
          else
            return error(new ESLVal("TypeError",_v1685,new ESLVal("expecting probably arm types to agree: ").add(ppType.apply(_v1695,_v1693).add(new ESLVal(" ").add(ppType.apply(_v1694,_v1693).add(new ESLVal(" ").add(ppType.apply(_v1696,_v1693))))))));
        }
        else
          return error(new ESLVal("TypeError",_v1685,new ESLVal("expecting an integer: ").add(ppType.apply(pt,_v1693))));
      }
    }
  });
  private static ESLVal newType = new ESLVal(new Function(new ESLVal("newType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1678 = $args[0];
  ESLVal _v1679 = $args[1];
  ESLVal _v1680 = $args[2];
  ESLVal _v1681 = $args[3];
  ESLVal _v1682 = $args[4];
  ESLVal _v1683 = $args[5];
  ESLVal _v1684 = $args[6];
  return expType.apply(new ESLVal("Apply",_v1678,_v1679,_v1680),_v1681,_v1682,_v1683,_v1684);
    }
  });
  private static ESLVal sendType = new ESLVal(new Function(new ESLVal("sendType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1660 = $args[0];
  ESLVal _v1661 = $args[1];
  ESLVal _v1662 = $args[2];
  ESLVal _v1663 = $args[3];
  ESLVal _v1664 = $args[4];
  ESLVal _v1665 = $args[5];
  ESLVal _v1666 = $args[6];
  ESLVal _v1667 = $args[7];
  {ESLVal _v850 = typeNF.apply(derefType.apply(expType.apply(_v1661,_v1664,_v1665,_v1666,_v1667)),_v1667);
        
        switch(_v850.termName) {
        case "ActType": {ESLVal $1801 = _v850.termRef(0);
          ESLVal $1800 = _v850.termRef(1);
          ESLVal $1799 = _v850.termRef(2);
          
          {ESLVal al = $1801;
          
          {ESLVal exports = $1800;
          
          {ESLVal handlers = $1799;
          
          { LetRec letrec = new LetRec() {
          ESLVal findHandler = new ESLVal(new Function(new ESLVal("findHandler"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1668 = $args[0];
            {ESLVal _v851 = _v1668;
                  
                  if(_v851.isCons())
                  {ESLVal $1802 = _v851.head();
                    ESLVal $1803 = _v851.tail();
                    
                    switch($1802.termName) {
                    case "MessageType": {ESLVal $1805 = $1802.termRef(0);
                      ESLVal $1804 = $1802.termRef(1);
                      
                      if($1804.isCons())
                      {ESLVal $1806 = $1804.head();
                        ESLVal $1807 = $1804.tail();
                        
                        switch($1806.termName) {
                        case "TermType": {ESLVal $1810 = $1806.termRef(0);
                          ESLVal $1809 = $1806.termRef(1);
                          ESLVal $1808 = $1806.termRef(2);
                          
                          if($1807.isCons())
                          {ESLVal $1811 = $1807.head();
                            ESLVal $1812 = $1807.tail();
                            
                            {ESLVal m = $1802;
                            
                            {ESLVal _v1669 = $1803;
                            
                            return findHandler.apply(_v1669);
                          }
                          }
                          }
                        else if($1807.isNil())
                          {ESLVal ml = $1805;
                            
                            {ESLVal tl = $1810;
                            
                            {ESLVal m = $1809;
                            
                            {ESLVal ts = $1808;
                            
                            {ESLVal rest = $1803;
                            
                            if(m.eql(_v1662).boolVal)
                            return head.apply(_v1668);
                            else
                              {ESLVal _v1670 = $1802;
                                
                                {ESLVal _v1671 = $1803;
                                
                                return findHandler.apply(_v1671);
                              }
                              }
                          }
                          }
                          }
                          }
                          }
                        else {ESLVal m = $1802;
                            
                            {ESLVal _v1672 = $1803;
                            
                            return findHandler.apply(_v1672);
                          }
                          }
                        }
                        default: {ESLVal m = $1802;
                          
                          {ESLVal _v1673 = $1803;
                          
                          return findHandler.apply(_v1673);
                        }
                        }
                      }
                      }
                    else if($1804.isNil())
                      {ESLVal m = $1802;
                        
                        {ESLVal _v1674 = $1803;
                        
                        return findHandler.apply(_v1674);
                      }
                      }
                    else {ESLVal m = $1802;
                        
                        {ESLVal _v1675 = $1803;
                        
                        return findHandler.apply(_v1675);
                      }
                      }
                    }
                    default: {ESLVal m = $1802;
                      
                      {ESLVal _v1676 = $1803;
                      
                      return findHandler.apply(_v1676);
                    }
                    }
                  }
                  }
                else if(_v851.isNil())
                  return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662)));
                else return error(new ESLVal("case error at Pos(29449,29756)").add(ESLVal.list(_v851)));
                }
              }
            });
          
          public ESLVal get(String name) {
            switch(name) {
              case "findHandler": return findHandler;
              
              default: throw new Error("cannot find letrec binding");
            }
            }
          };
        ESLVal findHandler = letrec.get("findHandler");
        
          {ESLVal _v852 = findHandler.apply(handlers);
          
          switch(_v852.termName) {
          case "MessageType": {ESLVal $1814 = _v852.termRef(0);
            ESLVal $1813 = _v852.termRef(1);
            
            if($1813.isCons())
            {ESLVal $1815 = $1813.head();
              ESLVal $1816 = $1813.tail();
              
              switch($1815.termName) {
              case "TermType": {ESLVal $1819 = $1815.termRef(0);
                ESLVal $1818 = $1815.termRef(1);
                ESLVal $1817 = $1815.termRef(2);
                
                if($1816.isCons())
                {ESLVal $1820 = $1816.head();
                  ESLVal $1821 = $1816.tail();
                  
                  {ESLVal m = _v852;
                  
                  return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
                }
                }
              else if($1816.isNil())
                {ESLVal ml = $1814;
                  
                  {ESLVal tl = $1819;
                  
                  {ESLVal _v1677 = $1818;
                  
                  {ESLVal ts1 = $1817;
                  
                  {ESLVal ts2 = expTypes.apply(_v1663,_v1664,_v1665,_v1666,_v1667);
                  
                  if(length.apply(ts1).eql(length.apply(ts2)).boolVal)
                  if(subTypes.apply(ts2,ts1).boolVal)
                    {expType.apply(_v1661,_v1664,_v1665,_v1666,_v1667);
                    return new ESLVal("VoidType",_v1660);}
                    else
                      return error(new ESLVal("TypeError",_v1660,new ESLVal("message argument types ").add(ppTypes.apply(ts2,_v1667).add(new ESLVal(" do not match expected types ").add(ppTypes.apply(ts1,_v1667))))));
                  else
                    return error(new ESLVal("TypeError",_v1660,new ESLVal("expecting ").add(length.apply(ts1).add(new ESLVal(" args, but received ").add(length.apply(ts2))))));
                }
                }
                }
                }
                }
              else {ESLVal m = _v852;
                  
                  return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
                }
              }
              default: {ESLVal m = _v852;
                
                return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
              }
            }
            }
          else if($1813.isNil())
            {ESLVal m = _v852;
              
              return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
            }
          else {ESLVal m = _v852;
              
              return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
            }
          }
          default: {ESLVal m = _v852;
            
            return error(new ESLVal("TypeError",_v1660,new ESLVal("cannot find message handler named ").add(_v1662.add(new ESLVal(" in ").add(handlers)))));
          }
        }
        }}
        
        }
        }
        }
        }
        default: {ESLVal t = _v850;
          
          return error(new ESLVal("TypeError",_v1660,new ESLVal("expecting a behaviour type: ").add(typeNF.apply(derefType.apply(expType.apply(_v1661,_v1664,_v1665,_v1666,_v1667)),_v1667))));
        }
      }
      }
    }
  });
  private static ESLVal actType = new ESLVal(new Function(new ESLVal("actType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1606 = $args[0];
  ESLVal _v1607 = $args[1];
  ESLVal _v1608 = $args[2];
  ESLVal _v1609 = $args[3];
  ESLVal _v1610 = $args[4];
  ESLVal _v1611 = $args[5];
  ESLVal _v1612 = $args[6];
  ESLVal _v1613 = $args[7];
  ESLVal _v1614 = $args[8];
  ESLVal _v1615 = $args[9];
  ESLVal _v1616 = $args[10];
  ESLVal _v1617 = $args[11];
  { LetRec letrec = new LetRec() {
        ESLVal findLoc = new ESLVal(new Function(new ESLVal("findLoc"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1649 = $args[0];
          ESLVal _v1650 = $args[1];
          {ESLVal _v853 = _v1650;
                
                if(_v853.isCons())
                {ESLVal $1822 = _v853.head();
                  ESLVal $1823 = _v853.tail();
                  
                  switch($1822.termName) {
                  case "Binding": {ESLVal $1835 = $1822.termRef(0);
                    ESLVal $1834 = $1822.termRef(1);
                    ESLVal $1833 = $1822.termRef(2);
                    ESLVal $1832 = $1822.termRef(3);
                    ESLVal $1831 = $1822.termRef(4);
                    
                    {ESLVal _v1654 = $1835;
                    
                    {ESLVal m = $1834;
                    
                    {ESLVal t = $1833;
                    
                    {ESLVal st = $1832;
                    
                    {ESLVal e = $1831;
                    
                    {ESLVal _v1655 = $1823;
                    
                    if(m.eql(_v1649).boolVal)
                    return _v1654;
                    else
                      {ESLVal b = $1822;
                        
                        {ESLVal _v1656 = $1823;
                        
                        return findLoc.apply(_v1649,_v1656);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $1830 = $1822.termRef(0);
                    ESLVal $1829 = $1822.termRef(1);
                    ESLVal $1828 = $1822.termRef(2);
                    ESLVal $1827 = $1822.termRef(3);
                    ESLVal $1826 = $1822.termRef(4);
                    ESLVal $1825 = $1822.termRef(5);
                    ESLVal $1824 = $1822.termRef(6);
                    
                    {ESLVal _v1651 = $1830;
                    
                    {ESLVal m = $1829;
                    
                    {ESLVal ps = $1828;
                    
                    {ESLVal t = $1827;
                    
                    {ESLVal st = $1826;
                    
                    {ESLVal g = $1825;
                    
                    {ESLVal e = $1824;
                    
                    {ESLVal _v1652 = $1823;
                    
                    if(m.eql(_v1649).boolVal)
                    return _v1651;
                    else
                      {ESLVal b = $1822;
                        
                        {ESLVal _v1653 = $1823;
                        
                        return findLoc.apply(_v1649,_v1653);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal b = $1822;
                    
                    {ESLVal _v1657 = $1823;
                    
                    return findLoc.apply(_v1649,_v1657);
                  }
                  }
                }
                }
              else if(_v853.isNil())
                return p0;
              else return error(new ESLVal("case error at Pos(31239,31543)").add(ESLVal.list(_v853)));
              }
            }
          });
        ESLVal findType = new ESLVal(new Function(new ESLVal("findType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1640 = $args[0];
          ESLVal _v1641 = $args[1];
          {ESLVal _v854 = _v1641;
                
                if(_v854.isCons())
                {ESLVal $1836 = _v854.head();
                  ESLVal $1837 = _v854.tail();
                  
                  switch($1836.termName) {
                  case "Binding": {ESLVal $1849 = $1836.termRef(0);
                    ESLVal $1848 = $1836.termRef(1);
                    ESLVal $1847 = $1836.termRef(2);
                    ESLVal $1846 = $1836.termRef(3);
                    ESLVal $1845 = $1836.termRef(4);
                    
                    {ESLVal _v1645 = $1849;
                    
                    {ESLVal m = $1848;
                    
                    {ESLVal t = $1847;
                    
                    {ESLVal st = $1846;
                    
                    {ESLVal e = $1845;
                    
                    {ESLVal _v1646 = $1837;
                    
                    if(m.eql(_v1640).boolVal)
                    return substTypeEnv.apply(_v1617,t);
                    else
                      {ESLVal b = $1836;
                        
                        {ESLVal _v1647 = $1837;
                        
                        return findType.apply(_v1640,_v1647);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                case "FunBind": {ESLVal $1844 = $1836.termRef(0);
                    ESLVal $1843 = $1836.termRef(1);
                    ESLVal $1842 = $1836.termRef(2);
                    ESLVal $1841 = $1836.termRef(3);
                    ESLVal $1840 = $1836.termRef(4);
                    ESLVal $1839 = $1836.termRef(5);
                    ESLVal $1838 = $1836.termRef(6);
                    
                    {ESLVal _v1642 = $1844;
                    
                    {ESLVal m = $1843;
                    
                    {ESLVal ps = $1842;
                    
                    {ESLVal t = $1841;
                    
                    {ESLVal st = $1840;
                    
                    {ESLVal g = $1839;
                    
                    {ESLVal e = $1838;
                    
                    {ESLVal _v1643 = $1837;
                    
                    if(m.eql(_v1640).boolVal)
                    return substTypeEnv.apply(_v1617,t);
                    else
                      {ESLVal b = $1836;
                        
                        {ESLVal _v1644 = $1837;
                        
                        return findType.apply(_v1640,_v1644);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal b = $1836;
                    
                    {ESLVal _v1648 = $1837;
                    
                    return findType.apply(_v1640,_v1648);
                  }
                  }
                }
                }
              else if(_v854.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(31597,31954)").add(ESLVal.list(_v854)));
              }
            }
          });
        ESLVal decs = new ESLVal(new Function(new ESLVal("decs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1636 = $args[0];
          {ESLVal _v855 = _v1636;
                
                if(_v855.isCons())
                {ESLVal $1850 = _v855.head();
                  ESLVal $1851 = _v855.tail();
                  
                  {ESLVal m = $1850;
                  
                  {ESLVal _v1637 = $1851;
                  
                  {ESLVal _v1638 = findType.apply(m,_v1611);
                  ESLVal _v1639 = findLoc.apply(m,_v1611);
                  
                  if(_v1638.eql($null).boolVal)
                  return error(new ESLVal("TypeError",_v1639,new ESLVal("cannot find exported name ").add(m)));
                  else
                    return decs.apply(_v1637).cons(new ESLVal("Dec",_v1639,m,_v1638,_v1638));
                }
                }
                }
                }
              else if(_v855.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(31996,32327)").add(ESLVal.list(_v855)));
              }
            }
          });
        ESLVal getMessageTypes = new ESLVal(new Function(new ESLVal("getMessageTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1633 = $args[0];
          {ESLVal _v856 = _v1633;
                
                if(_v856.isCons())
                {ESLVal $1852 = _v856.head();
                  ESLVal $1853 = _v856.tail();
                  
                  switch($1852.termName) {
                  case "BArm": {ESLVal $1857 = $1852.termRef(0);
                    ESLVal $1856 = $1852.termRef(1);
                    ESLVal $1855 = $1852.termRef(2);
                    ESLVal $1854 = $1852.termRef(3);
                    
                    {ESLVal _v1634 = $1857;
                    
                    {ESLVal ps = $1856;
                    
                    {ESLVal g = $1855;
                    
                    {ESLVal e = $1854;
                    
                    {ESLVal _v1635 = $1853;
                    
                    return getMessageTypes.apply(_v1635).cons(getMessageType.apply(ps));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(32378,32533)").add(ESLVal.list(_v856)));
                }
                }
              else if(_v856.isNil())
                return $nil;
              else return error(new ESLVal("case error at Pos(32378,32533)").add(ESLVal.list(_v856)));
              }
            }
          });
        ESLVal getMessageType = new ESLVal(new Function(new ESLVal("getMessageType"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal ps = $args[0];
          {ESLVal _v857 = ps;
                
                if(_v857.isCons())
                {ESLVal $1858 = _v857.head();
                  ESLVal $1859 = _v857.tail();
                  
                  switch($1858.termName) {
                  case "PTerm": {ESLVal $1863 = $1858.termRef(0);
                    ESLVal $1862 = $1858.termRef(1);
                    ESLVal $1861 = $1858.termRef(2);
                    ESLVal $1860 = $1858.termRef(3);
                    
                    if($1859.isCons())
                    {ESLVal $1864 = $1859.head();
                      ESLVal $1865 = $1859.tail();
                      
                      return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v857)));
                    }
                  else if($1859.isNil())
                    {ESLVal pl = $1863;
                      
                      {ESLVal termName = $1862;
                      
                      {ESLVal targs = $1861;
                      
                      {ESLVal _v1632 = $1860;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun514"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v1606,p,_v1614,_v1615,_v1616,_v1617);
                          }
                        }),_v1632);
                      
                      return new ESLVal("MessageType",pl,ESLVal.list(new ESLVal("TermType",pl,termName,ts)));
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v857)));
                  }
                  default: return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v857)));
                }
                }
              else if(_v857.isNil())
                return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v857)));
              else return error(new ESLVal("case error at Pos(32583,32854)").add(ESLVal.list(_v857)));
              }
            }
          });
        ESLVal typeCheckArms = new ESLVal(new Function(new ESLVal("typeCheckArms"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1627 = $args[0];
          ESLVal _v1628 = $args[1];
          ESLVal _v1629 = $args[2];
          {ESLVal _v858 = _v1627;
                
                if(_v858.isCons())
                {ESLVal $1866 = _v858.head();
                  ESLVal $1867 = _v858.tail();
                  
                  switch($1866.termName) {
                  case "BArm": {ESLVal $1871 = $1866.termRef(0);
                    ESLVal $1870 = $1866.termRef(1);
                    ESLVal $1869 = $1866.termRef(2);
                    ESLVal $1868 = $1866.termRef(3);
                    
                    {ESLVal _v1630 = $1871;
                    
                    {ESLVal ps = $1870;
                    
                    {ESLVal g = $1869;
                    
                    {ESLVal e = $1868;
                    
                    {ESLVal _v1631 = $1867;
                    
                    {typeCheckArm.apply(_v1630,ps,g,e,_v1628,_v1629);
                  return typeCheckArms.apply(_v1631,_v1628,_v1629);}
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(32930,33157)").add(ESLVal.list(_v858)));
                }
                }
              else if(_v858.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(32930,33157)").add(ESLVal.list(_v858)));
              }
            }
          });
        ESLVal typeCheckArm = new ESLVal(new Function(new ESLVal("typeCheckArm"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1618 = $args[0];
          ESLVal _v1619 = $args[1];
          ESLVal _v1620 = $args[2];
          ESLVal _v1621 = $args[3];
          ESLVal _v1622 = $args[4];
          ESLVal _v1623 = $args[5];
          {ESLVal _v859 = _v1619;
                
                if(_v859.isCons())
                {ESLVal $1872 = _v859.head();
                  ESLVal $1873 = _v859.tail();
                  
                  switch($1872.termName) {
                  case "PTerm": {ESLVal $1877 = $1872.termRef(0);
                    ESLVal $1876 = $1872.termRef(1);
                    ESLVal $1875 = $1872.termRef(2);
                    ESLVal $1874 = $1872.termRef(3);
                    
                    if($1873.isCons())
                    {ESLVal $1878 = $1873.head();
                      ESLVal $1879 = $1873.tail();
                      
                      return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v859)));
                    }
                  else if($1873.isNil())
                    {ESLVal pl = $1877;
                      
                      {ESLVal termName = $1876;
                      
                      {ESLVal targs = $1875;
                      
                      {ESLVal _v1624 = $1874;
                      
                      {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun515"),getSelf()) {
                          public ESLVal apply(ESLVal... $args) {
                            ESLVal p = $args[0];
                        return getPatternType.apply(_v1618,p,_v1622,_v1623,_v1616,_v1617);
                          }
                        }),_v1624);
                      
                      {patternTypes.apply(_v1618,_v1624,ts,_v1622,_v1623,_v1616,_v1617,new ESLVal(new Function(new ESLVal("fun516"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal _v1625 = $args[0];
                    ESLVal _v1626 = $args[1];
                    return expType.apply(_v1621,_v1622,_v1626,_v1616,_v1617);
                      }
                    }));
                    return $null;}
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v859)));
                  }
                  default: return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v859)));
                }
                }
              else if(_v859.isNil())
                return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v859)));
              else return error(new ESLVal("case error at Pos(33256,33705)").add(ESLVal.list(_v859)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "findLoc": return findLoc;
            
            case "findType": return findType;
            
            case "decs": return decs;
            
            case "getMessageTypes": return getMessageTypes;
            
            case "getMessageType": return getMessageType;
            
            case "typeCheckArms": return typeCheckArms;
            
            case "typeCheckArm": return typeCheckArm;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal findLoc = letrec.get("findLoc");
      
      ESLVal findType = letrec.get("findType");
      
      ESLVal decs = letrec.get("decs");
      
      ESLVal getMessageTypes = letrec.get("getMessageTypes");
      
      ESLVal getMessageType = letrec.get("getMessageType");
      
      ESLVal typeCheckArms = letrec.get("typeCheckArms");
      
      ESLVal typeCheckArm = letrec.get("typeCheckArm");
      
        {ESLVal parentType = ((Supplier<ESLVal>)() -> { 
            if(_v1609.eql($null).boolVal)
              return actType0;
              else
                return expType.apply(_v1609,_v1614,_v1615,_v1616,_v1617);
          }).get();
        ESLVal localEnv = parBind.apply(_v1611,_v1614,_v1615,_v1616,_v1617);
        
        {ESLVal exportedDecs = decs.apply(_v1610);
        
        {ESLVal messageTypes = getMessageTypes.apply(_v1613);
        
        {ESLVal _v1658 = new ESLVal("ExtendedAct",_v1606,parentType,exportedDecs,messageTypes);
        ESLVal _v1659 = ESLVal.list(new ESLVal("Map",new ESLVal("$super"),parentType));
        
        {typeCheckExports.apply(_v1606,exportedDecs,_v1611,_v1658,localEnv.add(_v1615),_v1617,_v1616);
      typeCheckValues.apply(valueDefs.apply(_v1611),_v1658,_v1659.add(localEnv.add(_v1615)),_v1617,_v1616);
      expType.apply(_v1612,_v1658,_v1659.add(localEnv.add(_v1615)),_v1616,_v1617);
      typeCheckArms.apply(_v1613,_v1658,_v1659.add(localEnv.add(_v1615)));
      return _v1658;}
      }
      }
      }
      }}
      
    }
  });
  private static ESLVal typeCheckExports = new ESLVal(new Function(new ESLVal("typeCheckExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1599 = $args[0];
  ESLVal _v1600 = $args[1];
  ESLVal _v1601 = $args[2];
  ESLVal _v1602 = $args[3];
  ESLVal _v1603 = $args[4];
  ESLVal _v1604 = $args[5];
  ESLVal _v1605 = $args[6];
  {{
        ESLVal _v860 = _v1600;
        while(_v860.isCons()) {
          ESLVal e = _v860.headVal;
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun517"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal b = $args[0];
          return bindingName.apply(b).eql(decName.apply(e)).and(typeEqual.apply(lookupType.apply(decName.apply(e),_v1603),decType.apply(e)));
            }
          }),_v1601).boolVal)
            {}
            else
              error(new ESLVal("TypeError",_v1599,new ESLVal(" cannot find export for ").add(decName.apply(e))));
          _v860 = _v860.tailVal;}
      }
      return $null;}
    }
  });
  private static ESLVal bTypeExports = new ESLVal(new Function(new ESLVal("bTypeExports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v861 = t;
        
        switch(_v861.termName) {
        case "ExtendedAct": {ESLVal $1890 = _v861.termRef(0);
          ESLVal $1889 = _v861.termRef(1);
          ESLVal $1888 = _v861.termRef(2);
          ESLVal $1887 = _v861.termRef(3);
          
          {ESLVal l = $1890;
          
          {ESLVal parent = $1889;
          
          {ESLVal exports = $1888;
          
          {ESLVal message = $1887;
          
          return bTypeExports.apply(parent).add(exports);
        }
        }
        }
        }
        }
      case "ActType": {ESLVal $1886 = _v861.termRef(0);
          ESLVal $1885 = _v861.termRef(1);
          ESLVal $1884 = _v861.termRef(2);
          
          {ESLVal l = $1886;
          
          {ESLVal exports = $1885;
          
          {ESLVal message = $1884;
          
          return exports;
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $1883 = _v861.termRef(0);
          
          {ESLVal f = $1883;
          
          return bTypeExports.apply(f.apply());
        }
        }
      case "RecType": {ESLVal $1882 = _v861.termRef(0);
          ESLVal $1881 = _v861.termRef(1);
          ESLVal $1880 = _v861.termRef(2);
          
          {ESLVal l = $1882;
          
          {ESLVal n = $1881;
          
          {ESLVal _v1598 = $1880;
          
          return bTypeExports.apply(substType.apply(new ESLVal("RecType",l,n,_v1598),n,_v1598));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(35101,35511)").add(ESLVal.list(_v861)));
      }
      }
    }
  });
  private static ESLVal cmpType = new ESLVal(new Function(new ESLVal("cmpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1584 = $args[0];
  ESLVal _v1585 = $args[1];
  ESLVal _v1586 = $args[2];
  ESLVal _v1587 = $args[3];
  ESLVal _v1588 = $args[4];
  ESLVal _v1589 = $args[5];
  ESLVal _v1590 = $args[6];
  {ESLVal _v862 = _v1586;
        
        if(_v862.isCons())
        {ESLVal $1891 = _v862.head();
          ESLVal $1892 = _v862.tail();
          
          switch($1891.termName) {
          case "BQual": {ESLVal $1897 = $1891.termRef(0);
            ESLVal $1896 = $1891.termRef(1);
            ESLVal $1895 = $1891.termRef(2);
            
            {ESLVal _v1593 = $1897;
            
            {ESLVal p = $1896;
            
            {ESLVal list = $1895;
            
            {ESLVal _v1594 = $1892;
            
            {ESLVal lType = expType.apply(list,_v1587,_v1588,_v1589,_v1590);
            
            {ESLVal _v863 = lType;
            
            switch(_v863.termName) {
            case "ListType": {ESLVal $1899 = _v863.termRef(0);
              ESLVal $1898 = _v863.termRef(1);
              
              {ESLVal ll = $1899;
              
              {ESLVal t = $1898;
              
              {ESLVal _v1595 = _v1594;
              
              return patternType.apply(_v1593,p,substTypeEnv.apply(_v1590,t),_v1587,_v1588,_v1589,_v1590,new ESLVal(new Function(new ESLVal("fun518"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1596 = $args[0];
              ESLVal _v1597 = $args[1];
              return cmpType.apply(_v1593,_v1585,_v1595,_v1587,_v1597,_v1589,_v1590);
                }
              }));
            }
            }
            }
            }
            default: {ESLVal t = _v863;
              
              return error(new ESLVal("TypeError",_v1593,new ESLVal("qualifier binding expects a list: ").add(ppType.apply(t,_v1590))));
            }
          }
          }
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $1894 = $1891.termRef(0);
            ESLVal $1893 = $1891.termRef(1);
            
            {ESLVal _v1591 = $1894;
            
            {ESLVal b = $1893;
            
            {ESLVal _v1592 = $1892;
            
            {ESLVal bType = expType.apply(b,_v1587,_v1588,_v1589,_v1590);
            
            if(isBoolType.apply(bType).boolVal)
            return cmpType.apply(_v1591,_v1585,_v1592,_v1587,_v1588,_v1589,_v1590);
            else
              return error(new ESLVal("TypeError",_v1591,new ESLVal("qualifier expects a boolean type: ").add(ppType.apply(bType,_v1590))));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(35622,36608)").add(ESLVal.list(_v862)));
        }
        }
      else if(_v862.isNil())
        {ESLVal t = expType.apply(_v1585,_v1587,_v1588,_v1589,_v1590);
          
          return new ESLVal("ListType",_v1584,t);
        }
      else return error(new ESLVal("case error at Pos(35622,36608)").add(ESLVal.list(_v862)));
      }
    }
  });
  private static ESLVal updateType = new ESLVal(new Function(new ESLVal("updateType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1577 = $args[0];
  ESLVal _v1578 = $args[1];
  ESLVal _v1579 = $args[2];
  ESLVal _v1580 = $args[3];
  ESLVal _v1581 = $args[4];
  ESLVal _v1582 = $args[5];
  ESLVal _v1583 = $args[6];
  {ESLVal t = lookupType.apply(_v1578,_v1581);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v1577,new ESLVal("unbound variable ").add(_v1578)));
        else
          {ESLVal valueType = expType.apply(_v1579,_v1580,_v1581,_v1582,_v1583);
            
            if(subType.apply(valueType,t).boolVal)
            return valueType;
            else
              return error(new ESLVal("TypeError",_v1577,new ESLVal("type of variable ").add(_v1578.add(new ESLVal("::").add(ppType.apply(t,_v1583).add(new ESLVal(" does not agree with value type ").add(ppType.apply(valueType,_v1583))))))));
          }
      }
    }
  });
  private static ESLVal letType = new ESLVal(new Function(new ESLVal("letType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1570 = $args[0];
  ESLVal _v1571 = $args[1];
  ESLVal _v1572 = $args[2];
  ESLVal _v1573 = $args[3];
  ESLVal _v1574 = $args[4];
  ESLVal _v1575 = $args[5];
  ESLVal _v1576 = $args[6];
  {ESLVal env = parBind.apply(_v1571,_v1573,_v1574,_v1575,_v1576);
        
        {{
        ESLVal _v864 = _v1571;
        while(_v864.isCons()) {
          ESLVal b = _v864.headVal;
          typeCheckDef.apply(b,_v1573,_v1574,env.add(_v1574),_v1575,_v1576);
          _v864 = _v864.tailVal;}
      }
      return expType.apply(_v1572,_v1573,env.add(_v1574),_v1575,_v1576);}
      }
    }
  });
  private static ESLVal letrecType = new ESLVal(new Function(new ESLVal("letrecType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1563 = $args[0];
  ESLVal _v1564 = $args[1];
  ESLVal _v1565 = $args[2];
  ESLVal _v1566 = $args[3];
  ESLVal _v1567 = $args[4];
  ESLVal _v1568 = $args[5];
  ESLVal _v1569 = $args[6];
  {ESLVal env = recBind.apply(_v1564,_v1566,_v1567,_v1568,_v1569);
        
        {{
        ESLVal _v865 = _v1564;
        while(_v865.isCons()) {
          ESLVal b = _v865.headVal;
          typeCheckDef.apply(b,_v1566,env.add(_v1567),env.add(_v1567),_v1568,_v1569);
          _v865 = _v865.tailVal;}
      }
      return expType.apply(_v1565,_v1566,env.add(_v1567),_v1568,_v1569);}
      }
    }
  });
  private static ESLVal checkDupBindings = new ESLVal(new Function(new ESLVal("checkDupBindings"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal bs = $args[0];
  {ESLVal _v866 = bs;
        
        if(_v866.isCons())
        {ESLVal $1900 = _v866.head();
          ESLVal $1901 = _v866.tail();
          
          {ESLVal b = $1900;
          
          {ESLVal _v1562 = $1901;
          
          if(member.apply(bindingName.apply(b),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal b = $l0.head();
              $l0 = $l0.tail();
              $v.add(bindingName.apply(b));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v1562)).boolVal)
          return error(new ESLVal("TypeError",bindingLoc.apply(b),new ESLVal("duplicate definitions for ").add(bindingName.apply(b))));
          else
            return checkDupBindings.apply(_v1562);
        }
        }
        }
      else if(_v866.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(37854,38119)").add(ESLVal.list(_v866)));
      }
    }
  });
  private static ESLVal parBind = new ESLVal(new Function(new ESLVal("parBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1557 = $args[0];
  ESLVal _v1558 = $args[1];
  ESLVal _v1559 = $args[2];
  ESLVal _v1560 = $args[3];
  ESLVal _v1561 = $args[4];
  {checkDupBindings.apply(_v1557);
      return valueDefsToTEnv.apply(valueDefs.apply(_v1557),_v1558,_v1559,_v1560,_v1561);}
    }
  });
  private static ESLVal recBind = new ESLVal(new Function(new ESLVal("recBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1552 = $args[0];
  ESLVal _v1553 = $args[1];
  ESLVal _v1554 = $args[2];
  ESLVal _v1555 = $args[3];
  ESLVal _v1556 = $args[4];
  return valueDefsToTEnv.apply(valueDefs.apply(_v1552),_v1553,_v1554,_v1555,_v1556);
    }
  });
  private static ESLVal caseType = new ESLVal(new Function(new ESLVal("caseType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1545 = $args[0];
  ESLVal _v1546 = $args[1];
  ESLVal _v1547 = $args[2];
  ESLVal _v1548 = $args[3];
  ESLVal _v1549 = $args[4];
  ESLVal _v1550 = $args[5];
  ESLVal _v1551 = $args[6];
  {ESLVal ts1 = expTypes.apply(_v1546,_v1548,_v1549,_v1550,_v1551);
        
        {ESLVal ts2 = armTypes.apply(_v1547,ts1,_v1548,_v1549,_v1550,_v1551);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v1545,new ESLVal("case arm types do not agree: ").add(ppTypes.apply(ts1,_v1551).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v1551))))));
      }
      }
    }
  });
  private static ESLVal tryType = new ESLVal(new Function(new ESLVal("tryType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1538 = $args[0];
  ESLVal _v1539 = $args[1];
  ESLVal _v1540 = $args[2];
  ESLVal _v1541 = $args[3];
  ESLVal _v1542 = $args[4];
  ESLVal _v1543 = $args[5];
  ESLVal _v1544 = $args[6];
  {ESLVal ts1 = expTypes.apply(ESLVal.list(_v1539),_v1541,_v1542,_v1543,_v1544);
        
        {ESLVal ts2 = armTypes.apply(_v1540,ts1,_v1541,_v1542,_v1543,_v1544);
        
        if(allEqualTypes.apply(head.apply(ts2),tail.apply(ts2)).boolVal)
        return head.apply(ts2);
        else
          return error(new ESLVal("TypeError",_v1538,new ESLVal("try arm types do not agree: ").add(ppTypes.apply(ts1,_v1544).add(new ESLVal(" ").add(ppTypes.apply(ts2,_v1544))))));
      }
      }
    }
  });
  private static ESLVal armTypes = new ESLVal(new Function(new ESLVal("armTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1531 = $args[0];
  ESLVal _v1532 = $args[1];
  ESLVal _v1533 = $args[2];
  ESLVal _v1534 = $args[3];
  ESLVal _v1535 = $args[4];
  ESLVal _v1536 = $args[5];
  {ESLVal _v867 = _v1531;
        
        if(_v867.isCons())
        {ESLVal $1902 = _v867.head();
          ESLVal $1903 = _v867.tail();
          
          {ESLVal a = $1902;
          
          {ESLVal _v1537 = $1903;
          
          return armTypes.apply(_v1537,_v1532,_v1533,_v1534,_v1535,_v1536).cons(armType.apply(a,_v1532,_v1533,_v1534,_v1535,_v1536));
        }
        }
        }
      else if(_v867.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(39484,39653)").add(ESLVal.list(_v867)));
      }
    }
  });
  private static ESLVal armType = new ESLVal(new Function(new ESLVal("armType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1523 = $args[0];
  ESLVal _v1524 = $args[1];
  ESLVal _v1525 = $args[2];
  ESLVal _v1526 = $args[3];
  ESLVal _v1527 = $args[4];
  ESLVal _v1528 = $args[5];
  {ESLVal _v868 = _v1523;
        
        switch(_v868.termName) {
        case "BArm": {ESLVal $1907 = _v868.termRef(0);
          ESLVal $1906 = _v868.termRef(1);
          ESLVal $1905 = _v868.termRef(2);
          ESLVal $1904 = _v868.termRef(3);
          
          {ESLVal l = $1907;
          
          {ESLVal ps = $1906;
          
          {ESLVal guard = $1905;
          
          {ESLVal exp = $1904;
          
          {checkPatterns.apply(l,ps);
        if(length.apply(ps).eql(length.apply(_v1524)).boolVal)
          return patternTypes.apply(l,ps,_v1524,_v1525,_v1526,_v1527,_v1528,new ESLVal(new Function(new ESLVal("fun519"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1529 = $args[0];
            ESLVal _v1530 = $args[1];
            return guardedExpType.apply(l,guard,exp,_v1525,_v1530,_v1527,_v1528);
              }
            }));
          else
            return error(new ESLVal("TypeError",l,new ESLVal("number of patterns ").add(length.apply(ps).add(new ESLVal(" does not match supplied values: ").add(length.apply(_v1524))))));}
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(39755,40216)").add(ESLVal.list(_v868)));
      }
      }
    }
  });
  private static ESLVal refType = new ESLVal(new Function(new ESLVal("refType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1484 = $args[0];
  ESLVal _v1485 = $args[1];
  ESLVal _v1486 = $args[2];
  ESLVal _v1487 = $args[3];
  ESLVal _v1488 = $args[4];
  ESLVal _v1489 = $args[5];
  ESLVal _v1490 = $args[6];
  { LetRec letrec = new LetRec() {
        ESLVal t = derefType.apply(expType.apply(_v1485,_v1487,_v1488,_v1489,_v1490));
        ESLVal findExport = new ESLVal(new Function(new ESLVal("findExport"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal decs = $args[0];
          {ESLVal _v869 = decs;
                
                if(_v869.isCons())
                {ESLVal $1908 = _v869.head();
                  ESLVal $1909 = _v869.tail();
                  
                  switch($1908.termName) {
                  case "Dec": {ESLVal $1913 = $1908.termRef(0);
                    ESLVal $1912 = $1908.termRef(1);
                    ESLVal $1911 = $1908.termRef(2);
                    ESLVal $1910 = $1908.termRef(3);
                    
                    {ESLVal _v1496 = $1913;
                    
                    {ESLVal m = $1912;
                    
                    {ESLVal t = $1911;
                    
                    {ESLVal st = $1910;
                    
                    {ESLVal _v1497 = $1909;
                    
                    if(m.eql(_v1486).boolVal)
                    return t;
                    else
                      {ESLVal d = $1908;
                        
                        {ESLVal _v1498 = $1909;
                        
                        return findExport.apply(_v1498);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal d = $1908;
                    
                    {ESLVal _v1499 = $1909;
                    
                    return findExport.apply(_v1499);
                  }
                  }
                }
                }
              else if(_v869.isNil())
                return $null;
              else return error(new ESLVal("case error at Pos(40444,40617)").add(ESLVal.list(_v869)));
              }
            }
          });
        ESLVal findField = new ESLVal(new Function(new ESLVal("findField"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal fs = $args[0];
          {ESLVal _v870 = fs;
                
                if(_v870.isCons())
                {ESLVal $1914 = _v870.head();
                  ESLVal $1915 = _v870.tail();
                  
                  switch($1914.termName) {
                  case "Dec": {ESLVal $1919 = $1914.termRef(0);
                    ESLVal $1918 = $1914.termRef(1);
                    ESLVal $1917 = $1914.termRef(2);
                    ESLVal $1916 = $1914.termRef(3);
                    
                    {ESLVal _v1491 = $1919;
                    
                    {ESLVal m = $1918;
                    
                    {ESLVal t = $1917;
                    
                    {ESLVal ds = $1916;
                    
                    {ESLVal _v1492 = $1915;
                    
                    if(m.eql(_v1486).boolVal)
                    return t;
                    else
                      {ESLVal _v1493 = $1914;
                        
                        {ESLVal _v1494 = $1915;
                        
                        return findField.apply(_v1494);
                      }
                      }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal t = $1914;
                    
                    {ESLVal _v1495 = $1915;
                    
                    return findField.apply(_v1495);
                  }
                  }
                }
                }
              else if(_v870.isNil())
                return error(new ESLVal("TypeError",_v1484,new ESLVal("cannot find field name ").add(_v1486)));
              else return error(new ESLVal("case error at Pos(40658,40866)").add(ESLVal.list(_v870)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "t": return t;
            
            case "findExport": return findExport;
            
            case "findField": return findField;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal t = letrec.get("t");
      
      ESLVal findExport = letrec.get("findExport");
      
      ESLVal findField = letrec.get("findField");
      
        {ESLVal _v871 = typeNF.apply(t,_v1490);
        
        switch(_v871.termName) {
        case "StrType": {ESLVal $1930 = _v871.termRef(0);
          
          {ESLVal sl = $1930;
          
          if(_v1486.eql(new ESLVal("explode")).boolVal)
          return new ESLVal("ListType",sl,new ESLVal("IntType",sl));
          else
            {ESLVal _v1520 = $1930;
              
              if(_v1486.eql(new ESLVal("writeDate")).boolVal)
              return new ESLVal("FloatType",_v1520);
              else
                {ESLVal _v1521 = _v871;
                  
                  return error(new ESLVal("TypeError",_v1484,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v1521,_v1490))));
                }
            }
        }
        }
      case "TableType": {ESLVal $1929 = _v871.termRef(0);
          ESLVal $1928 = _v871.termRef(1);
          ESLVal $1927 = _v871.termRef(2);
          
          {ESLVal _v1503 = $1929;
          
          {ESLVal k = $1928;
          
          {ESLVal v = $1927;
          
          if(_v1486.eql(new ESLVal("get")).boolVal)
          return new ESLVal("FunType",_v1503,ESLVal.list(k),v);
          else
            {ESLVal _v1504 = $1929;
              
              {ESLVal _v1505 = $1928;
              
              {ESLVal _v1506 = $1927;
              
              if(_v1486.eql(new ESLVal("put")).boolVal)
              return new ESLVal("FunType",_v1504,ESLVal.list(_v1505,_v1506),t);
              else
                {ESLVal _v1507 = $1929;
                  
                  {ESLVal _v1508 = $1928;
                  
                  {ESLVal _v1509 = $1927;
                  
                  if(_v1486.eql(new ESLVal("keys")).boolVal)
                  return new ESLVal("ListType",_v1507,_v1508);
                  else
                    {ESLVal _v1510 = $1929;
                      
                      {ESLVal _v1511 = $1928;
                      
                      {ESLVal _v1512 = $1927;
                      
                      if(_v1486.eql(new ESLVal("vals")).boolVal)
                      return new ESLVal("ListType",_v1510,_v1512);
                      else
                        {ESLVal _v1513 = $1929;
                          
                          {ESLVal _v1514 = $1928;
                          
                          {ESLVal _v1515 = $1927;
                          
                          if(_v1486.eql(new ESLVal("hasKey")).boolVal)
                          return new ESLVal("FunType",_v1513,ESLVal.list(_v1514),new ESLVal("BoolType",_v1513));
                          else
                            {ESLVal _v1516 = $1929;
                              
                              {ESLVal _v1517 = $1928;
                              
                              {ESLVal _v1518 = $1927;
                              
                              if(_v1486.eql(new ESLVal("clear")).boolVal)
                              return new ESLVal("FunType",_v1516,ESLVal.list(),new ESLVal("VoidType",_v1516));
                              else
                                {ESLVal _v1519 = _v871;
                                  
                                  return error(new ESLVal("TypeError",_v1516,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v1519,_v1490))));
                                }
                            }
                            }
                            }
                        }
                        }
                        }
                    }
                    }
                    }
                }
                }
                }
            }
            }
            }
        }
        }
        }
        }
      case "ListType": {ESLVal $1926 = _v871.termRef(0);
          ESLVal $1925 = _v871.termRef(1);
          
          {ESLVal ll = $1926;
          
          {ESLVal _v1501 = $1925;
          
          if(_v1486.eql(new ESLVal("implode")).boolVal)
          return new ESLVal("StrType",ll);
          else
            {ESLVal _v1502 = _v871;
              
              return error(new ESLVal("TypeError",_v1484,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v1502,_v1490))));
            }
        }
        }
        }
      case "RecordType": {ESLVal $1924 = _v871.termRef(0);
          ESLVal $1923 = _v871.termRef(1);
          
          {ESLVal rl = $1924;
          
          {ESLVal fs = $1923;
          
          return findField.apply(fs);
        }
        }
        }
      case "ActType": {ESLVal $1922 = _v871.termRef(0);
          ESLVal $1921 = _v871.termRef(1);
          ESLVal $1920 = _v871.termRef(2);
          
          {ESLVal al = $1922;
          
          {ESLVal exports = $1921;
          
          {ESLVal handlers = $1920;
          
          {ESLVal _v1500 = findExport.apply(exports);
          
          if(_v1500.eql($null).boolVal)
          return error(new ESLVal("TypeError",_v1484,new ESLVal("behaviour type does not export ").add(_v1486)));
          else
            return substTypeEnv.apply(_v1490,_v1500);
        }
        }
        }
        }
        }
        default: {ESLVal _v1522 = _v871;
          
          return error(new ESLVal("TypeError",_v1484,new ESLVal("expecting a record type, but received ").add(ppType.apply(_v1522,_v1490))));
        }
      }
      }}
      
    }
  });
  private static ESLVal derefType = new ESLVal(new Function(new ESLVal("derefType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v872 = t;
        
        switch(_v872.termName) {
        case "TypeClosure": {ESLVal $1931 = _v872.termRef(0);
          
          {ESLVal f = $1931;
          
          return derefType.apply(f.apply());
        }
        }
        default: {ESLVal _v1483 = _v872;
          
          return _v1483;
        }
      }
      }
    }
  });
  private static ESLVal recordType = new ESLVal(new Function(new ESLVal("recordType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1471 = $args[0];
  ESLVal _v1472 = $args[1];
  ESLVal _v1473 = $args[2];
  ESLVal _v1474 = $args[3];
  ESLVal _v1475 = $args[4];
  ESLVal _v1476 = $args[5];
  { LetRec letrec = new LetRec() {
        ESLVal fieldTypes = new ESLVal(new Function(new ESLVal("fieldTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1477 = $args[0];
          {ESLVal _v873 = _v1477;
                
                if(_v873.isCons())
                {ESLVal $1932 = _v873.head();
                  ESLVal $1933 = _v873.tail();
                  
                  switch($1932.termName) {
                  case "Binding": {ESLVal $1938 = $1932.termRef(0);
                    ESLVal $1937 = $1932.termRef(1);
                    ESLVal $1936 = $1932.termRef(2);
                    ESLVal $1935 = $1932.termRef(3);
                    ESLVal $1934 = $1932.termRef(4);
                    
                    {ESLVal _v1478 = $1938;
                    
                    {ESLVal n = $1937;
                    
                    {ESLVal t = $1936;
                    
                    {ESLVal st = $1935;
                    
                    {ESLVal e = $1934;
                    
                    {ESLVal _v1479 = $1933;
                    
                    {ESLVal _v1480 = expType.apply(e,_v1473,_v1474,_v1475,_v1476);
                    
                    return fieldTypes.apply(_v1479).cons(new ESLVal("Dec",_v1478,n,_v1480,_v1480));
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  }
                  default: {ESLVal _v1481 = _v873;
                    
                    return error(new ESLVal("TypeError",_v1471,new ESLVal("unknown field representation: ").add(_v1481)));
                  }
                }
                }
              else if(_v873.isNil())
                return $nil;
              else {ESLVal _v1482 = _v873;
                  
                  return error(new ESLVal("TypeError",_v1471,new ESLVal("unknown field representation: ").add(_v1482)));
                }
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "fieldTypes": return fieldTypes;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal fieldTypes = letrec.get("fieldTypes");
      
        return new ESLVal("RecordType",_v1471,fieldTypes.apply(_v1472));}
      
    }
  });
  private static ESLVal forType = new ESLVal(new Function(new ESLVal("forType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1459 = $args[0];
  ESLVal _v1460 = $args[1];
  ESLVal _v1461 = $args[2];
  ESLVal _v1462 = $args[3];
  ESLVal _v1463 = $args[4];
  ESLVal _v1464 = $args[5];
  ESLVal _v1465 = $args[6];
  ESLVal _v1466 = $args[7];
  {ESLVal _v1467 = expType.apply(_v1461,_v1463,_v1464,_v1465,_v1466);
        
        {ESLVal _v874 = _v1467;
        
        switch(_v874.termName) {
        case "ListType": {ESLVal $1940 = _v874.termRef(0);
          ESLVal $1939 = _v874.termRef(1);
          
          {ESLVal _v1468 = $1940;
          
          {ESLVal t = $1939;
          
          return patternType.apply(_v1468,_v1460,t,_v1463,_v1464,_v1465,_v1466,new ESLVal(new Function(new ESLVal("fun520"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1469 = $args[0];
          ESLVal _v1470 = $args[1];
          return expType.apply(_v1462,_v1463,_v1470,_v1465,_v1466);
            }
          }));
        }
        }
        }
        default: {ESLVal t = _v874;
          
          return error(new ESLVal("TypeError",_v1459,new ESLVal("for type expects a list: ").add(_v1461)));
        }
      }
      }
      }
    }
  });
  private static ESLVal patternTypes = new ESLVal(new Function(new ESLVal("patternTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1433 = $args[0];
  ESLVal _v1434 = $args[1];
  ESLVal _v1435 = $args[2];
  ESLVal _v1436 = $args[3];
  ESLVal _v1437 = $args[4];
  ESLVal _v1438 = $args[5];
  ESLVal _v1439 = $args[6];
  ESLVal _v1440 = $args[7];
  {ESLVal _v875 = _v1434;
        ESLVal _v876 = _v1435;
        
        if(_v875.isCons())
        {ESLVal $1941 = _v875.head();
          ESLVal $1942 = _v875.tail();
          
          if(_v876.isCons())
          {ESLVal $1943 = _v876.head();
            ESLVal $1944 = _v876.tail();
            
            {ESLVal p = $1941;
            
            {ESLVal _v1441 = $1942;
            
            {ESLVal t = $1943;
            
            {ESLVal _v1442 = $1944;
            
            {ESLVal _v1443 = _v1441;
            ESLVal _v1444 = _v1442;
            
            return patternType.apply(_v1433,p,t,_v1436,_v1437,_v1438,_v1439,new ESLVal(new Function(new ESLVal("fun521"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal _v1445 = $args[0];
            ESLVal _v1446 = $args[1];
            return patternTypes.apply(_v1433,_v1443,_v1444,_v1436,_v1446,_v1438,_v1439,new ESLVal(new Function(new ESLVal("fun522"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1447 = $args[0];
                  ESLVal _v1448 = $args[1];
                  return _v1440.apply(_v1447.cons(_v1445),_v1448);
                    }
                  }));
              }
            }));
          }
          }
          }
          }
          }
          }
        else if(_v876.isNil())
          {ESLVal _v1449 = _v875;
            
            {ESLVal _v1450 = _v876;
            
            return error(new ESLVal("TypeError",_v1433,new ESLVal("somthing wrong with ").add(_v1449.add(new ESLVal(" ").add(_v1450)))));
          }
          }
        else {ESLVal _v1451 = _v875;
            
            {ESLVal _v1452 = _v876;
            
            return error(new ESLVal("TypeError",_v1433,new ESLVal("somthing wrong with ").add(_v1451.add(new ESLVal(" ").add(_v1452)))));
          }
          }
        }
      else if(_v875.isNil())
        if(_v876.isCons())
          {ESLVal $1945 = _v876.head();
            ESLVal $1946 = _v876.tail();
            
            {ESLVal _v1453 = _v875;
            
            {ESLVal _v1454 = _v876;
            
            return error(new ESLVal("TypeError",_v1433,new ESLVal("somthing wrong with ").add(_v1453.add(new ESLVal(" ").add(_v1454)))));
          }
          }
          }
        else if(_v876.isNil())
          return _v1440.apply($nil,_v1437);
        else {ESLVal _v1455 = _v875;
            
            {ESLVal _v1456 = _v876;
            
            return error(new ESLVal("TypeError",_v1433,new ESLVal("somthing wrong with ").add(_v1455.add(new ESLVal(" ").add(_v1456)))));
          }
          }
      else {ESLVal _v1457 = _v875;
          
          {ESLVal _v1458 = _v876;
          
          return error(new ESLVal("TypeError",_v1433,new ESLVal("somthing wrong with ").add(_v1457.add(new ESLVal(" ").add(_v1458)))));
        }
        }
      }
    }
  });
  private static ESLVal getPatternType = new ESLVal(new Function(new ESLVal("getPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1412 = $args[0];
  ESLVal _v1413 = $args[1];
  ESLVal _v1414 = $args[2];
  ESLVal _v1415 = $args[3];
  ESLVal _v1416 = $args[4];
  ESLVal _v1417 = $args[5];
  {ESLVal _v877 = _v1413;
        
        switch(_v877.termName) {
        case "PApplyType": {ESLVal $1975 = _v877.termRef(0);
          ESLVal $1974 = _v877.termRef(1);
          ESLVal $1973 = _v877.termRef(2);
          
          {ESLVal _v1430 = $1975;
          
          {ESLVal _v1431 = $1974;
          
          {ESLVal args = $1973;
          
          return error(new ESLVal("should this happen?"));
        }
        }
        }
        }
      case "PBool": {ESLVal $1972 = _v877.termRef(0);
          ESLVal $1971 = _v877.termRef(1);
          
          {ESLVal _v1429 = $1972;
          
          {ESLVal b = $1971;
          
          return new ESLVal("BoolType",_v1429);
        }
        }
        }
      case "PCons": {ESLVal $1970 = _v877.termRef(0);
          ESLVal $1969 = _v877.termRef(1);
          ESLVal $1968 = _v877.termRef(2);
          
          {ESLVal _v1428 = $1970;
          
          {ESLVal hd = $1969;
          
          {ESLVal tl = $1968;
          
          return getPatternType.apply(_v1428,tl,_v1414,_v1415,_v1416,_v1417);
        }
        }
        }
        }
      case "PBagCons": {ESLVal $1967 = _v877.termRef(0);
          ESLVal $1966 = _v877.termRef(1);
          ESLVal $1965 = _v877.termRef(2);
          
          {ESLVal _v1427 = $1967;
          
          {ESLVal hd = $1966;
          
          {ESLVal tl = $1965;
          
          return getPatternType.apply(_v1427,tl,_v1414,_v1415,_v1416,_v1417);
        }
        }
        }
        }
      case "PSetCons": {ESLVal $1964 = _v877.termRef(0);
          ESLVal $1963 = _v877.termRef(1);
          ESLVal $1962 = _v877.termRef(2);
          
          {ESLVal _v1426 = $1964;
          
          {ESLVal hd = $1963;
          
          {ESLVal tl = $1962;
          
          return getPatternType.apply(_v1426,tl,_v1414,_v1415,_v1416,_v1417);
        }
        }
        }
        }
      case "PNil": {ESLVal $1961 = _v877.termRef(0);
          
          {ESLVal _v1425 = $1961;
          
          return new ESLVal("ForallType",_v1425,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v1425,new ESLVal("VarType",_v1425,new ESLVal("T"))));
        }
        }
      case "PNull": {ESLVal $1960 = _v877.termRef(0);
          
          {ESLVal _v1424 = $1960;
          
          return new ESLVal("ForallType",_v1424,ESLVal.list(new ESLVal("T")),new ESLVal("VarType",_v1424,new ESLVal("T")));
        }
        }
      case "PEmptyBag": {ESLVal $1959 = _v877.termRef(0);
          
          {ESLVal _v1423 = $1959;
          
          return new ESLVal("ForallType",_v1423,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v1423,new ESLVal("VarType",_v1423,new ESLVal("T"))));
        }
        }
      case "PEmptySet": {ESLVal $1958 = _v877.termRef(0);
          
          {ESLVal _v1422 = $1958;
          
          return new ESLVal("ForallType",_v1422,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v1422,new ESLVal("VarType",_v1422,new ESLVal("T"))));
        }
        }
      case "PInt": {ESLVal $1957 = _v877.termRef(0);
          ESLVal $1956 = _v877.termRef(1);
          
          {ESLVal _v1421 = $1957;
          
          {ESLVal n = $1956;
          
          return new ESLVal("IntType",_v1421);
        }
        }
        }
      case "PVar": {ESLVal $1955 = _v877.termRef(0);
          ESLVal $1954 = _v877.termRef(1);
          ESLVal $1953 = _v877.termRef(2);
          
          {ESLVal _v1420 = $1955;
          
          {ESLVal n = $1954;
          
          {ESLVal pt = $1953;
          
          return substTypeEnv.apply(_v1417,pt);
        }
        }
        }
        }
      case "PStr": {ESLVal $1952 = _v877.termRef(0);
          ESLVal $1951 = _v877.termRef(1);
          
          {ESLVal _v1419 = $1952;
          
          {ESLVal s = $1951;
          
          return new ESLVal("StrType",_v1419);
        }
        }
        }
      case "PTerm": {ESLVal $1950 = _v877.termRef(0);
          ESLVal $1949 = _v877.termRef(1);
          ESLVal $1948 = _v877.termRef(2);
          ESLVal $1947 = _v877.termRef(3);
          
          {ESLVal _v1418 = $1950;
          
          {ESLVal n = $1949;
          
          {ESLVal ts = $1948;
          
          {ESLVal ps = $1947;
          
          return lookupType.apply(n,_v1416);
        }
        }
        }
        }
        }
        default: {ESLVal _v1432 = _v877;
          
          return error(new ESLVal("TypeError",_v1412,new ESLVal("unknown type of pattern: ").add(_v1432)));
        }
      }
      }
    }
  });
  private static ESLVal patternType = new ESLVal(new Function(new ESLVal("patternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1382 = $args[0];
  ESLVal _v1383 = $args[1];
  ESLVal _v1384 = $args[2];
  ESLVal _v1385 = $args[3];
  ESLVal _v1386 = $args[4];
  ESLVal _v1387 = $args[5];
  ESLVal _v1388 = $args[6];
  ESLVal _v1389 = $args[7];
  {ESLVal _v878 = _v1383;
        
        switch(_v878.termName) {
        case "PAdd": {ESLVal $2007 = _v878.termRef(0);
          ESLVal $2006 = _v878.termRef(1);
          ESLVal $2005 = _v878.termRef(2);
          
          {ESLVal _v1410 = $2007;
          
          {ESLVal p1 = $2006;
          
          {ESLVal p2 = $2005;
          
          return addPatternType.apply(_v1410,p1,p2,_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
        }
        }
      case "PApplyType": {ESLVal $2004 = _v878.termRef(0);
          ESLVal $2003 = _v878.termRef(1);
          ESLVal $2002 = _v878.termRef(2);
          
          {ESLVal _v1408 = $2004;
          
          {ESLVal _v1409 = $2003;
          
          {ESLVal args = $2002;
          
          return applyTypePatternType.apply(_v1408,_v1409,substTypesEnv.apply(_v1388,args),_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
        }
        }
      case "PBool": {ESLVal $2001 = _v878.termRef(0);
          ESLVal $2000 = _v878.termRef(1);
          
          {ESLVal _v1407 = $2001;
          
          {ESLVal b = $2000;
          
          if(isBoolType.apply(_v1384).boolVal)
          return _v1389.apply(new ESLVal("BoolType",_v1407),_v1386);
          else
            return error(new ESLVal("TypeError",_v1407,new ESLVal("type mismatch: Bool and ").add(ppType.apply(_v1384,_v1388))));
        }
        }
        }
      case "PBagCons": {ESLVal $1999 = _v878.termRef(0);
          ESLVal $1998 = _v878.termRef(1);
          ESLVal $1997 = _v878.termRef(2);
          
          {ESLVal _v1404 = $1999;
          
          {ESLVal hd = $1998;
          
          {ESLVal tl = $1997;
          
          return bagConsPatternType.apply(_v1404,hd,tl,_v1384,_v1385,_v1386,_v1387,_v1388,new ESLVal(new Function(new ESLVal("fun523"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1405 = $args[0];
          ESLVal _v1406 = $args[1];
          return _v1389.apply(new ESLVal("ListType",_v1404,_v1405),_v1406);
            }
          }));
        }
        }
        }
        }
      case "PSetCons": {ESLVal $1996 = _v878.termRef(0);
          ESLVal $1995 = _v878.termRef(1);
          ESLVal $1994 = _v878.termRef(2);
          
          {ESLVal _v1401 = $1996;
          
          {ESLVal hd = $1995;
          
          {ESLVal tl = $1994;
          
          return setConsPatternType.apply(_v1401,hd,tl,_v1384,_v1385,_v1386,_v1387,_v1388,new ESLVal(new Function(new ESLVal("fun524"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1402 = $args[0];
          ESLVal _v1403 = $args[1];
          return _v1389.apply(new ESLVal("ListType",_v1401,_v1402),_v1403);
            }
          }));
        }
        }
        }
        }
      case "PCons": {ESLVal $1993 = _v878.termRef(0);
          ESLVal $1992 = _v878.termRef(1);
          ESLVal $1991 = _v878.termRef(2);
          
          {ESLVal _v1398 = $1993;
          
          {ESLVal hd = $1992;
          
          {ESLVal tl = $1991;
          
          return consPatternType.apply(_v1398,hd,tl,_v1384,_v1385,_v1386,_v1387,_v1388,new ESLVal(new Function(new ESLVal("fun525"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1399 = $args[0];
          ESLVal _v1400 = $args[1];
          return _v1389.apply(new ESLVal("ListType",_v1398,_v1399),_v1400);
            }
          }));
        }
        }
        }
        }
      case "PNil": {ESLVal $1990 = _v878.termRef(0);
          
          {ESLVal _v1397 = $1990;
          
          return nilType.apply(_v1397,_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
      case "PNull": {ESLVal $1989 = _v878.termRef(0);
          
          {ESLVal _v1396 = $1989;
          
          return _v1389.apply(_v1384,_v1386);
        }
        }
      case "PEmptyBag": {ESLVal $1988 = _v878.termRef(0);
          
          {ESLVal _v1395 = $1988;
          
          return emptyBagType.apply(_v1395,_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
      case "PEmptySet": {ESLVal $1987 = _v878.termRef(0);
          
          {ESLVal _v1394 = $1987;
          
          return emptySetType.apply(_v1394,_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
      case "PInt": {ESLVal $1986 = _v878.termRef(0);
          ESLVal $1985 = _v878.termRef(1);
          
          {ESLVal _v1393 = $1986;
          
          {ESLVal n = $1985;
          
          if(isIntType.apply(_v1384).boolVal)
          return _v1389.apply(new ESLVal("IntType",_v1393),_v1386);
          else
            return error(new ESLVal("TypeError",_v1393,new ESLVal("type mismatch: Int and ").add(ppType.apply(_v1384,_v1388))));
        }
        }
        }
      case "PVar": {ESLVal $1984 = _v878.termRef(0);
          ESLVal $1983 = _v878.termRef(1);
          ESLVal $1982 = _v878.termRef(2);
          
          {ESLVal _v1392 = $1984;
          
          {ESLVal n = $1983;
          
          {ESLVal pt = $1982;
          
          return _v1389.apply(_v1384,ESLVal.list(new ESLVal("Map",n,_v1384)).add(_v1386));
        }
        }
        }
        }
      case "PStr": {ESLVal $1981 = _v878.termRef(0);
          ESLVal $1980 = _v878.termRef(1);
          
          {ESLVal _v1391 = $1981;
          
          {ESLVal s = $1980;
          
          if(isStrType.apply(_v1384).boolVal)
          return _v1389.apply(new ESLVal("StrType",_v1391),_v1386);
          else
            return error(new ESLVal("TypeError",_v1391,new ESLVal("type mismatch: Str and ").add(ppType.apply(_v1384,_v1388))));
        }
        }
        }
      case "PTerm": {ESLVal $1979 = _v878.termRef(0);
          ESLVal $1978 = _v878.termRef(1);
          ESLVal $1977 = _v878.termRef(2);
          ESLVal $1976 = _v878.termRef(3);
          
          {ESLVal _v1390 = $1979;
          
          {ESLVal n = $1978;
          
          {ESLVal ts = $1977;
          
          {ESLVal ps = $1976;
          
          return termPatternType.apply(_v1390,n,substTypesEnv.apply(_v1388,ts),ps,_v1384,_v1385,_v1386,_v1387,_v1388,_v1389);
        }
        }
        }
        }
        }
        default: {ESLVal _v1411 = _v878;
          
          return error(new ESLVal("TypeError",_v1382,new ESLVal("unknown type of pattern: ").add(_v1411)));
        }
      }
      }
    }
  });
  private static ESLVal addPatternType = new ESLVal(new Function(new ESLVal("addPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1344 = $args[0];
  ESLVal _v1345 = $args[1];
  ESLVal _v1346 = $args[2];
  ESLVal _v1347 = $args[3];
  ESLVal _v1348 = $args[4];
  ESLVal _v1349 = $args[5];
  ESLVal _v1350 = $args[6];
  ESLVal _v1351 = $args[7];
  ESLVal _v1352 = $args[8];
  return patternType.apply(_v1344,_v1345,_v1347,_v1348,_v1349,_v1350,_v1351,new ESLVal(new Function(new ESLVal("fun526"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1353 = $args[0];
        ESLVal _v1354 = $args[1];
        return patternType.apply(_v1344,_v1346,_v1347,_v1348,_v1354,_v1350,_v1351,new ESLVal(new Function(new ESLVal("fun527"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1355 = $args[0];
              ESLVal _v1356 = $args[1];
              {ESLVal _v879 = _v1347;
                    
                    switch(_v879.termName) {
                    case "ListType": {ESLVal $2010 = _v879.termRef(0);
                      ESLVal $2009 = _v879.termRef(1);
                      
                      {ESLVal tl = $2010;
                      
                      {ESLVal t = $2009;
                      
                      {ESLVal _v880 = _v1345;
                      ESLVal _v881 = _v1346;
                      
                      switch(_v880.termName) {
                      case "PCons": {ESLVal $2043 = _v880.termRef(0);
                        ESLVal $2042 = _v880.termRef(1);
                        ESLVal $2041 = _v880.termRef(2);
                        
                        switch($2041.termName) {
                        case "PNil": {ESLVal $2044 = $2041.termRef(0);
                          
                          switch(_v881.termName) {
                          case "PVar": {ESLVal $2047 = _v881.termRef(0);
                            ESLVal $2046 = _v881.termRef(1);
                            ESLVal $2045 = _v881.termRef(2);
                            
                            {ESLVal l1 = $2043;
                            
                            {ESLVal p = $2042;
                            
                            {ESLVal l3 = $2044;
                            
                            {ESLVal l4 = $2047;
                            
                            {ESLVal n2 = $2046;
                            
                            {ESLVal t2 = $2045;
                            
                            return _v1352.apply(_v1347,_v1356);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v1376 = _v880;
                            
                            {ESLVal _v1377 = _v881;
                            
                            return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v1378 = _v880;
                          
                          {ESLVal _v1379 = _v881;
                          
                          return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PVar": {ESLVal $2026 = _v880.termRef(0);
                        ESLVal $2025 = _v880.termRef(1);
                        ESLVal $2024 = _v880.termRef(2);
                        
                        switch(_v881.termName) {
                        case "PCons": {ESLVal $2039 = _v881.termRef(0);
                          ESLVal $2038 = _v881.termRef(1);
                          ESLVal $2037 = _v881.termRef(2);
                          
                          switch($2037.termName) {
                          case "PNil": {ESLVal $2040 = $2037.termRef(0);
                            
                            {ESLVal l1 = $2026;
                            
                            {ESLVal n = $2025;
                            
                            {ESLVal _v1371 = $2024;
                            
                            {ESLVal l2 = $2039;
                            
                            {ESLVal p = $2038;
                            
                            {ESLVal l3 = $2040;
                            
                            return _v1352.apply(_v1347,_v1356);
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          default: {ESLVal _v1372 = _v880;
                            
                            {ESLVal _v1373 = _v881;
                            
                            return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                      case "PAdd": {ESLVal $2029 = _v881.termRef(0);
                          ESLVal $2028 = _v881.termRef(1);
                          ESLVal $2027 = _v881.termRef(2);
                          
                          switch($2028.termName) {
                          case "PCons": {ESLVal $2032 = $2028.termRef(0);
                            ESLVal $2031 = $2028.termRef(1);
                            ESLVal $2030 = $2028.termRef(2);
                            
                            switch($2030.termName) {
                            case "PNil": {ESLVal $2033 = $2030.termRef(0);
                              
                              switch($2027.termName) {
                              case "PVar": {ESLVal $2036 = $2027.termRef(0);
                                ESLVal $2035 = $2027.termRef(1);
                                ESLVal $2034 = $2027.termRef(2);
                                
                                {ESLVal l1 = $2026;
                                
                                {ESLVal n1 = $2025;
                                
                                {ESLVal t1 = $2024;
                                
                                {ESLVal l2 = $2029;
                                
                                {ESLVal l3 = $2032;
                                
                                {ESLVal p = $2031;
                                
                                {ESLVal l5 = $2033;
                                
                                {ESLVal l6 = $2036;
                                
                                {ESLVal n3 = $2035;
                                
                                {ESLVal t3 = $2034;
                                
                                return _v1352.apply(_v1347,_v1356);
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: {ESLVal _v1365 = _v880;
                                
                                {ESLVal _v1366 = _v881;
                                
                                return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v1367 = _v880;
                              
                              {ESLVal _v1368 = _v881;
                              
                              return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v1369 = _v880;
                            
                            {ESLVal _v1370 = _v881;
                            
                            return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v1374 = _v880;
                          
                          {ESLVal _v1375 = _v881;
                          
                          return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                    case "PAdd": {ESLVal $2013 = _v880.termRef(0);
                        ESLVal $2012 = _v880.termRef(1);
                        ESLVal $2011 = _v880.termRef(2);
                        
                        switch($2012.termName) {
                        case "PVar": {ESLVal $2016 = $2012.termRef(0);
                          ESLVal $2015 = $2012.termRef(1);
                          ESLVal $2014 = $2012.termRef(2);
                          
                          switch($2011.termName) {
                          case "PCons": {ESLVal $2019 = $2011.termRef(0);
                            ESLVal $2018 = $2011.termRef(1);
                            ESLVal $2017 = $2011.termRef(2);
                            
                            switch($2017.termName) {
                            case "PNil": {ESLVal $2020 = $2017.termRef(0);
                              
                              switch(_v881.termName) {
                              case "PVar": {ESLVal $2023 = _v881.termRef(0);
                                ESLVal $2022 = _v881.termRef(1);
                                ESLVal $2021 = _v881.termRef(2);
                                
                                {ESLVal l1 = $2013;
                                
                                {ESLVal l2 = $2016;
                                
                                {ESLVal n1 = $2015;
                                
                                {ESLVal t1 = $2014;
                                
                                {ESLVal l3 = $2019;
                                
                                {ESLVal p = $2018;
                                
                                {ESLVal l5 = $2020;
                                
                                {ESLVal l6 = $2023;
                                
                                {ESLVal n3 = $2022;
                                
                                {ESLVal t3 = $2021;
                                
                                return _v1352.apply(_v1347,_v1356);
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: {ESLVal _v1357 = _v880;
                                
                                {ESLVal _v1358 = _v881;
                                
                                return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                              }
                              }
                            }
                            }
                            default: {ESLVal _v1359 = _v880;
                              
                              {ESLVal _v1360 = _v881;
                              
                              return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                            }
                            }
                          }
                          }
                          default: {ESLVal _v1361 = _v880;
                            
                            {ESLVal _v1362 = _v881;
                            
                            return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                          }
                          }
                        }
                        }
                        default: {ESLVal _v1363 = _v880;
                          
                          {ESLVal _v1364 = _v881;
                          
                          return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                        }
                        }
                      }
                      }
                      default: {ESLVal _v1380 = _v880;
                        
                        {ESLVal _v1381 = _v881;
                        
                        return error(new ESLVal("TypeError",_v1344,new ESLVal("patterns must be [p] + p, p + [p] + p, or p + [p]")));
                      }
                      }
                    }
                    }
                    }
                    }
                    }
                  case "TypeClosure": {ESLVal $2008 = _v879.termRef(0);
                      
                      {ESLVal g = $2008;
                      
                      return addPatternType.apply(_v1344,_v1345,_v1346,g.apply(),_v1348,_v1356,_v1350,_v1351,_v1352);
                    }
                    }
                    default: {ESLVal t = _v879;
                      
                      return error(new ESLVal("TypeError",_v1344,new ESLVal("+ expects lists: ").add(ppType.apply(_v1347,_v1351))));
                    }
                  }
                  }
                }
              }));
          }
        }));
    }
  });
  private static ESLVal applyTypePatternType = new ESLVal(new Function(new ESLVal("applyTypePatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1331 = $args[0];
  ESLVal _v1332 = $args[1];
  ESLVal _v1333 = $args[2];
  ESLVal _v1334 = $args[3];
  ESLVal _v1335 = $args[4];
  ESLVal _v1336 = $args[5];
  ESLVal _v1337 = $args[6];
  ESLVal _v1338 = $args[7];
  ESLVal _v1339 = $args[8];
  return patternType.apply(_v1331,_v1332,_v1334,_v1335,_v1336,_v1337,_v1338,new ESLVal(new Function(new ESLVal("fun528"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v1340 = $args[0];
        ESLVal _v1341 = $args[1];
        {ESLVal _v882 = typeNF.apply(_v1340,_v1338);
              
              switch(_v882.termName) {
              case "TypeFun": {ESLVal $2053 = _v882.termRef(0);
                ESLVal $2052 = _v882.termRef(1);
                ESLVal $2051 = _v882.termRef(2);
                
                {ESLVal fl = $2053;
                
                {ESLVal ns = $2052;
                
                {ESLVal t = $2051;
                
                if(length.apply(_v1333).eql(length.apply(ns)).boolVal)
                {ESLVal _v1343 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v1333).add(_v1338),t);
                  
                  if(typeEqual.apply(_v1343,_v1334).boolVal)
                  return _v1339.apply(_v1343,_v1341);
                  else
                    return error(new ESLVal("TypeError",_v1331,new ESLVal("value type ").add(ppType.apply(_v1334,_v1338).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v1343,_v1338).add(new ESLVal(" ").add(ppTypeEnv.apply(_v1338))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v1331,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v1333))))));
              }
              }
              }
              }
            case "ForallType": {ESLVal $2050 = _v882.termRef(0);
                ESLVal $2049 = _v882.termRef(1);
                ESLVal $2048 = _v882.termRef(2);
                
                {ESLVal fl = $2050;
                
                {ESLVal ns = $2049;
                
                {ESLVal t = $2048;
                
                if(length.apply(_v1333).eql(length.apply(ns)).boolVal)
                {ESLVal _v1342 = substTypeEnv.apply(zipTypeEnv.apply(ns,_v1333).add(_v1338),t);
                  
                  if(typeEqual.apply(_v1342,_v1334).boolVal)
                  return _v1339.apply(_v1342,_v1341);
                  else
                    return error(new ESLVal("TypeError",_v1331,new ESLVal("value type ").add(ppType.apply(_v1334,_v1338).add(new ESLVal(" does not match pattern type ").add(ppType.apply(_v1342,_v1338).add(new ESLVal(" ").add(ppTypeEnv.apply(_v1338))))))));
                }
                else
                  return error(new ESLVal("TypeError",_v1331,new ESLVal("expecting ").add(length.apply(ns).add(new ESLVal(" args, but suplied with ").add(length.apply(_v1333))))));
              }
              }
              }
              }
              default: {ESLVal t = _v882;
                
                return _v1339.apply(t,_v1341);
              }
            }
            }
          }
        }));
    }
  });
  private static ESLVal termPatternType = new ESLVal(new Function(new ESLVal("termPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1314 = $args[0];
  ESLVal _v1315 = $args[1];
  ESLVal _v1316 = $args[2];
  ESLVal _v1317 = $args[3];
  ESLVal _v1318 = $args[4];
  ESLVal _v1319 = $args[5];
  ESLVal _v1320 = $args[6];
  ESLVal _v1321 = $args[7];
  ESLVal _v1322 = $args[8];
  ESLVal _v1323 = $args[9];
  {ESLVal _v1324 = getTermPatternType.apply(_v1314,_v1315,_v1316,_v1319,_v1320,_v1321,_v1322);
        
        if(typeEqual.apply(_v1324,_v1318).boolVal)
        {ESLVal _v883 = typeNF.apply(_v1318,_v1322);
          
          switch(_v883.termName) {
          case "UnionType": {ESLVal $2055 = _v883.termRef(0);
            ESLVal $2054 = _v883.termRef(1);
            
            {ESLVal ul = $2055;
            
            {ESLVal cs = $2054;
            
            { LetRec letrec = new LetRec() {
            ESLVal getCnstrArgs = new ESLVal(new Function(new ESLVal("getCnstrArgs"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1325 = $args[0];
              {ESLVal _v884 = _v1325;
                    
                    if(_v884.isCons())
                    {ESLVal $2056 = _v884.head();
                      ESLVal $2057 = _v884.tail();
                      
                      switch($2056.termName) {
                      case "TermType": {ESLVal $2060 = $2056.termRef(0);
                        ESLVal $2059 = $2056.termRef(1);
                        ESLVal $2058 = $2056.termRef(2);
                        
                        {ESLVal tl = $2060;
                        
                        {ESLVal m = $2059;
                        
                        {ESLVal args = $2058;
                        
                        {ESLVal _v1326 = $2057;
                        
                        if(m.eql(_v1315).boolVal)
                        return args;
                        else
                          {ESLVal t = $2056;
                            
                            {ESLVal _v1327 = $2057;
                            
                            return getCnstrArgs.apply(_v1327);
                          }
                          }
                      }
                      }
                      }
                      }
                      }
                      default: {ESLVal t = $2056;
                        
                        {ESLVal _v1328 = $2057;
                        
                        return getCnstrArgs.apply(_v1328);
                      }
                      }
                    }
                    }
                  else if(_v884.isNil())
                    return error(new ESLVal("TypeError",_v1314,new ESLVal("cannot find constructor for ").add(_v1315)));
                  else return error(new ESLVal("case error at Pos(50159,50418)").add(ESLVal.list(_v884)));
                  }
                }
              });
            
            public ESLVal get(String name) {
              switch(name) {
                case "getCnstrArgs": return getCnstrArgs;
                
                default: throw new Error("cannot find letrec binding");
              }
              }
            };
          ESLVal getCnstrArgs = letrec.get("getCnstrArgs");
          
            {ESLVal argTypes = getCnstrArgs.apply(cs);
            
            if(length.apply(_v1317).eql(length.apply(argTypes)).boolVal)
            return patternTypes.apply(_v1314,_v1317,argTypes,_v1319,_v1320,_v1321,_v1322,new ESLVal(new Function(new ESLVal("fun529"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal _v1329 = $args[0];
              ESLVal _v1330 = $args[1];
              return _v1323.apply(typeNF.apply(_v1318,_v1322),_v1330);
                }
              }));
            else
              return error(new ESLVal("TypeError",_v1314,new ESLVal("arity mismatch.")));
          }}
          
          }
          }
          }
          default: {ESLVal t = _v883;
            
            return error(new ESLVal("TypeError",_v1314,new ESLVal("expecting a data type: ").add(_v1318)));
          }
        }
        }
        else
          return error(new ESLVal("TypeError",_v1314,new ESLVal("term pattern type ").add(ppType.apply(_v1324,_v1322).add(new ESLVal(" does not match supplied value type ").add(ppType.apply(_v1318,_v1322))))));
      }
    }
  });
  private static ESLVal typeNF = new ESLVal(new Function(new ESLVal("typeNF"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1307 = $args[0];
  ESLVal _v1308 = $args[1];
  {ESLVal _v885 = substTypeEnv.apply(_v1308,_v1307);
        
        switch(_v885.termName) {
        case "ApplyTypeFun": {ESLVal $2071 = _v885.termRef(0);
          ESLVal $2070 = _v885.termRef(1);
          ESLVal $2069 = _v885.termRef(2);
          
          {ESLVal l = $2071;
          
          {ESLVal op = $2070;
          
          {ESLVal args = $2069;
          
          {ESLVal _v887 = typeNF.apply(op,_v1308);
          
          switch(_v887.termName) {
          case "TypeFun": {ESLVal $2077 = _v887.termRef(0);
            ESLVal $2076 = _v887.termRef(1);
            ESLVal $2075 = _v887.termRef(2);
            
            {ESLVal _v1310 = $2077;
            
            {ESLVal ns = $2076;
            
            {ESLVal _v1311 = $2075;
            
            if(length.apply(args).eql(length.apply(ns)).boolVal)
            return typeNF.apply(substTypeEnv.apply(zipTypeEnv.apply(ns,args),_v1311),_v1308);
            else
              return error(new ESLVal("TypeError",_v1310,new ESLVal("function arity error")));
          }
          }
          }
          }
          default: {ESLVal _v1312 = _v887;
            
            return error(new ESLVal("TypeError",l,new ESLVal("expecting a type function: ").add(ppType.apply(typeNF.apply(op,_v1308),_v1308))));
          }
        }
        }
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $2068 = _v885.termRef(0);
          
          {ESLVal f = $2068;
          
          return typeNF.apply(f.apply(),_v1308);
        }
        }
      case "RecType": {ESLVal $2067 = _v885.termRef(0);
          ESLVal $2066 = _v885.termRef(1);
          ESLVal $2065 = _v885.termRef(2);
          
          {ESLVal l = $2067;
          
          {ESLVal n = $2066;
          
          {ESLVal _v1309 = $2065;
          
          return typeNF.apply(substType.apply(new ESLVal("RecType",l,n,_v1309),n,_v1309),_v1308);
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $2064 = _v885.termRef(0);
          ESLVal $2063 = _v885.termRef(1);
          ESLVal $2062 = _v885.termRef(2);
          ESLVal $2061 = _v885.termRef(3);
          
          {ESLVal l1 = $2064;
          
          {ESLVal parent = $2063;
          
          {ESLVal decs1 = $2062;
          
          {ESLVal ms1 = $2061;
          
          {ESLVal _v886 = typeNF.apply(parent,_v1308);
          
          switch(_v886.termName) {
          case "ActType": {ESLVal $2074 = _v886.termRef(0);
            ESLVal $2073 = _v886.termRef(1);
            ESLVal $2072 = _v886.termRef(2);
            
            {ESLVal l2 = $2074;
            
            {ESLVal decs2 = $2073;
            
            {ESLVal ms2 = $2072;
            
            return new ESLVal("ActType",l1,decs2.add(decs1),ms2.add(ms1));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(51735,51870)").add(ESLVal.list(_v886)));
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v1313 = _v885;
          
          return _v1313;
        }
      }
      }
    }
  });
  private static ESLVal getTermPatternType = new ESLVal(new Function(new ESLVal("getTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1300 = $args[0];
  ESLVal _v1301 = $args[1];
  ESLVal _v1302 = $args[2];
  ESLVal _v1303 = $args[3];
  ESLVal _v1304 = $args[4];
  ESLVal _v1305 = $args[5];
  ESLVal _v1306 = $args[6];
  {ESLVal t = lookupType.apply(_v1301,_v1305);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v1300,new ESLVal("unknown constructor ").add(_v1301)));
        else
          if(length.apply(_v1302).gre($zero).boolVal)
            return getGenericTermPatternType.apply(_v1300,t,_v1302,_v1303,_v1304,_v1305,_v1306);
            else
              return t;
      }
    }
  });
  private static ESLVal getGenericTermPatternType = new ESLVal(new Function(new ESLVal("getGenericTermPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1291 = $args[0];
  ESLVal _v1292 = $args[1];
  ESLVal _v1293 = $args[2];
  ESLVal _v1294 = $args[3];
  ESLVal _v1295 = $args[4];
  ESLVal _v1296 = $args[5];
  ESLVal _v1297 = $args[6];
  {ESLVal _v888 = _v1292;
        
        switch(_v888.termName) {
        case "RecType": {ESLVal $2083 = _v888.termRef(0);
          ESLVal $2082 = _v888.termRef(1);
          ESLVal $2081 = _v888.termRef(2);
          
          {ESLVal rl = $2083;
          
          {ESLVal rn = $2082;
          
          {ESLVal rt = $2081;
          
          return getGenericTermPatternType.apply(_v1291,substType.apply(new ESLVal("RecType",rl,rn,rt),rn,rt),_v1293,_v1294,_v1295,_v1296,_v1297);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $2080 = _v888.termRef(0);
          ESLVal $2079 = _v888.termRef(1);
          ESLVal $2078 = _v888.termRef(2);
          
          {ESLVal al = $2080;
          
          {ESLVal ns = $2079;
          
          {ESLVal _v1298 = $2078;
          
          if(length.apply(ns).eql(length.apply(_v1293)).boolVal)
          {ESLVal e = zipTypeEnv.apply(ns,_v1293);
            
            return substTypeEnv.apply(e.add(_v1297),_v1298);
          }
          else
            return error(new ESLVal("TypeError",_v1291,new ESLVal("generic constructor mismatch")));
        }
        }
        }
        }
        default: {ESLVal _v1299 = _v888;
          
          return error(new ESLVal("TypeError",_v1291,new ESLVal("expecting a generic type: ").add(ppType.apply(_v1299,_v1297))));
        }
      }
      }
    }
  });
  private static ESLVal nilType = new ESLVal(new Function(new ESLVal("nilType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1283 = $args[0];
  ESLVal _v1284 = $args[1];
  ESLVal _v1285 = $args[2];
  ESLVal _v1286 = $args[3];
  ESLVal _v1287 = $args[4];
  ESLVal _v1288 = $args[5];
  ESLVal _v1289 = $args[6];
  {ESLVal _v889 = typeNF.apply(_v1284,_v1288);
        
        switch(_v889.termName) {
        case "ListType": {ESLVal $2086 = _v889.termRef(0);
          ESLVal $2085 = _v889.termRef(1);
          
          {ESLVal ltl = $2086;
          
          {ESLVal et = $2085;
          
          return _v1289.apply(new ESLVal("ForallType",_v1283,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v1283,new ESLVal("VarType",_v1283,new ESLVal("T")))),_v1286);
        }
        }
        }
      case "TypeClosure": {ESLVal $2084 = _v889.termRef(0);
          
          {ESLVal g = $2084;
          
          return nilType.apply(_v1283,g.apply(),_v1285,_v1286,_v1287,_v1288,_v1289);
        }
        }
        default: {ESLVal _v1290 = _v889;
          
          return error(new ESLVal("TypeError",_v1283,new ESLVal("expecting a list type: ").add(ppType.apply(_v1290,_v1288))));
        }
      }
      }
    }
  });
  private static ESLVal emptyBagType = new ESLVal(new Function(new ESLVal("emptyBagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1275 = $args[0];
  ESLVal _v1276 = $args[1];
  ESLVal _v1277 = $args[2];
  ESLVal _v1278 = $args[3];
  ESLVal _v1279 = $args[4];
  ESLVal _v1280 = $args[5];
  ESLVal _v1281 = $args[6];
  {ESLVal _v890 = _v1276;
        
        switch(_v890.termName) {
        case "BagType": {ESLVal $2088 = _v890.termRef(0);
          ESLVal $2087 = _v890.termRef(1);
          
          {ESLVal ltl = $2088;
          
          {ESLVal et = $2087;
          
          return _v1281.apply(new ESLVal("ForallType",_v1275,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v1275,new ESLVal("VarType",_v1275,new ESLVal("T")))),_v1278);
        }
        }
        }
        default: {ESLVal _v1282 = _v890;
          
          return error(new ESLVal("TypeError",_v1275,new ESLVal("expecting a bag type: ").add(ppType.apply(_v1282,_v1280))));
        }
      }
      }
    }
  });
  private static ESLVal emptySetType = new ESLVal(new Function(new ESLVal("emptySetType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1267 = $args[0];
  ESLVal _v1268 = $args[1];
  ESLVal _v1269 = $args[2];
  ESLVal _v1270 = $args[3];
  ESLVal _v1271 = $args[4];
  ESLVal _v1272 = $args[5];
  ESLVal _v1273 = $args[6];
  {ESLVal _v891 = _v1268;
        
        switch(_v891.termName) {
        case "SetType": {ESLVal $2090 = _v891.termRef(0);
          ESLVal $2089 = _v891.termRef(1);
          
          {ESLVal ltl = $2090;
          
          {ESLVal et = $2089;
          
          return _v1273.apply(new ESLVal("ForallType",_v1267,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v1267,new ESLVal("VarType",_v1267,new ESLVal("T")))),_v1270);
        }
        }
        }
        default: {ESLVal _v1274 = _v891;
          
          return error(new ESLVal("TypeError",_v1267,new ESLVal("expecting a set type: ").add(ppType.apply(_v1274,_v1272))));
        }
      }
      }
    }
  });
  private static ESLVal consPatternType = new ESLVal(new Function(new ESLVal("consPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1253 = $args[0];
  ESLVal _v1254 = $args[1];
  ESLVal _v1255 = $args[2];
  ESLVal _v1256 = $args[3];
  ESLVal _v1257 = $args[4];
  ESLVal _v1258 = $args[5];
  ESLVal _v1259 = $args[6];
  ESLVal _v1260 = $args[7];
  ESLVal _v1261 = $args[8];
  {ESLVal _v892 = typeNF.apply(_v1256,_v1260);
        
        switch(_v892.termName) {
        case "ListType": {ESLVal $2093 = _v892.termRef(0);
          ESLVal $2092 = _v892.termRef(1);
          
          {ESLVal ltl = $2093;
          
          {ESLVal et = $2092;
          
          return patternType.apply(_v1253,_v1254,substTypeEnv.apply(_v1260,et),_v1257,_v1258,_v1259,_v1260,new ESLVal(new Function(new ESLVal("fun530"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1262 = $args[0];
          ESLVal _v1263 = $args[1];
          return patternType.apply(_v1253,_v1255,_v1256,_v1257,_v1263,_v1259,_v1260,new ESLVal(new Function(new ESLVal("fun531"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1264 = $args[0];
                ESLVal _v1265 = $args[1];
                return _v1261.apply(_v1262,_v1265);
                  }
                }));
            }
          }));
        }
        }
        }
      case "TypeClosure": {ESLVal $2091 = _v892.termRef(0);
          
          {ESLVal g = $2091;
          
          return consPatternType.apply(_v1253,_v1254,_v1255,g.apply(),_v1257,_v1258,_v1259,_v1260,_v1261);
        }
        }
        default: {ESLVal _v1266 = _v892;
          
          return error(new ESLVal("TypeError",_v1253,new ESLVal("expecting a list type: ").add(ppType.apply(_v1266,_v1260))));
        }
      }
      }
    }
  });
  private static ESLVal bagConsPatternType = new ESLVal(new Function(new ESLVal("bagConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1239 = $args[0];
  ESLVal _v1240 = $args[1];
  ESLVal _v1241 = $args[2];
  ESLVal _v1242 = $args[3];
  ESLVal _v1243 = $args[4];
  ESLVal _v1244 = $args[5];
  ESLVal _v1245 = $args[6];
  ESLVal _v1246 = $args[7];
  ESLVal _v1247 = $args[8];
  {ESLVal _v893 = _v1242;
        
        switch(_v893.termName) {
        case "BagType": {ESLVal $2095 = _v893.termRef(0);
          ESLVal $2094 = _v893.termRef(1);
          
          {ESLVal ltl = $2095;
          
          {ESLVal et = $2094;
          
          return patternType.apply(_v1239,_v1240,substTypeEnv.apply(_v1246,et),_v1243,_v1244,_v1245,_v1246,new ESLVal(new Function(new ESLVal("fun532"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1248 = $args[0];
          ESLVal _v1249 = $args[1];
          return patternType.apply(_v1239,_v1241,_v1242,_v1243,_v1249,_v1245,_v1246,new ESLVal(new Function(new ESLVal("fun533"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1250 = $args[0];
                ESLVal _v1251 = $args[1];
                return _v1247.apply(_v1248,_v1251);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v1252 = _v893;
          
          return error(new ESLVal("TypeError",_v1239,new ESLVal("expecting a bag type: ").add(ppType.apply(_v1252,_v1246))));
        }
      }
      }
    }
  });
  private static ESLVal setConsPatternType = new ESLVal(new Function(new ESLVal("setConsPatternType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1225 = $args[0];
  ESLVal _v1226 = $args[1];
  ESLVal _v1227 = $args[2];
  ESLVal _v1228 = $args[3];
  ESLVal _v1229 = $args[4];
  ESLVal _v1230 = $args[5];
  ESLVal _v1231 = $args[6];
  ESLVal _v1232 = $args[7];
  ESLVal _v1233 = $args[8];
  {ESLVal _v894 = _v1228;
        
        switch(_v894.termName) {
        case "SetType": {ESLVal $2097 = _v894.termRef(0);
          ESLVal $2096 = _v894.termRef(1);
          
          {ESLVal ltl = $2097;
          
          {ESLVal et = $2096;
          
          return patternType.apply(_v1225,_v1226,substTypeEnv.apply(_v1232,et),_v1229,_v1230,_v1231,_v1232,new ESLVal(new Function(new ESLVal("fun534"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1234 = $args[0];
          ESLVal _v1235 = $args[1];
          return patternType.apply(_v1225,_v1227,_v1228,_v1229,_v1235,_v1231,_v1232,new ESLVal(new Function(new ESLVal("fun535"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1236 = $args[0];
                ESLVal _v1237 = $args[1];
                return _v1233.apply(_v1234,_v1237);
                  }
                }));
            }
          }));
        }
        }
        }
        default: {ESLVal _v1238 = _v894;
          
          return error(new ESLVal("TypeError",_v1225,new ESLVal("expecting a set type: ").add(ppType.apply(_v1238,_v1232))));
        }
      }
      }
    }
  });
  private static ESLVal binExpType = new ESLVal(new Function(new ESLVal("binExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1216 = $args[0];
  ESLVal _v1217 = $args[1];
  ESLVal _v1218 = $args[2];
  ESLVal _v1219 = $args[3];
  ESLVal _v1220 = $args[4];
  ESLVal _v1221 = $args[5];
  ESLVal _v1222 = $args[6];
  ESLVal _v1223 = $args[7];
  {ESLVal _v895 = _v1218;
        
        switch(_v895.strVal) {
        case "+": return plusExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "-": return subExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "*": return mulExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "/": return divExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case ":": return consExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "=": return eqlExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "<>": return neqlExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "and": return andExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "andalso": return andExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "or": return orExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "orelse": return orExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case ">": return compareExpType.apply(_v1216,_v1217,new ESLVal(">"),_v1219,_v1220,_v1221,_v1222,_v1223);
      case ">=": return compareExpType.apply(_v1216,_v1217,new ESLVal(">="),_v1219,_v1220,_v1221,_v1222,_v1223);
      case "<": return compareExpType.apply(_v1216,_v1217,new ESLVal("<"),_v1219,_v1220,_v1221,_v1222,_v1223);
      case "<=": return compareExpType.apply(_v1216,_v1217,new ESLVal("<="),_v1219,_v1220,_v1221,_v1222,_v1223);
      case "..": return dotDotExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "%": return percentExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
      case "@": return atExpType.apply(_v1216,_v1217,_v1219,_v1220,_v1221,_v1222,_v1223);
        default: {ESLVal _v1224 = _v895;
          
          return error(new ESLVal("TypeError",_v1216,new ESLVal("unknown operator: ").add(_v1224)));
        }
      }
      }
    }
  });
  private static ESLVal andExpType = new ESLVal(new Function(new ESLVal("andExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1209 = $args[0];
  ESLVal _v1210 = $args[1];
  ESLVal _v1211 = $args[2];
  ESLVal _v1212 = $args[3];
  ESLVal _v1213 = $args[4];
  ESLVal _v1214 = $args[5];
  ESLVal _v1215 = $args[6];
  {ESLVal t1 = expType.apply(_v1210,_v1212,_v1213,_v1214,_v1215);
        ESLVal t2 = expType.apply(_v1211,_v1212,_v1213,_v1214,_v1215);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v1209,new ESLVal("and expects boolean arguments: ").add(ppType.apply(t1,_v1215).add(new ESLVal(" ").add(ppType.apply(t2,_v1215))))));
      }
    }
  });
  private static ESLVal atExpType = new ESLVal(new Function(new ESLVal("atExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1202 = $args[0];
  ESLVal _v1203 = $args[1];
  ESLVal _v1204 = $args[2];
  ESLVal _v1205 = $args[3];
  ESLVal _v1206 = $args[4];
  ESLVal _v1207 = $args[5];
  ESLVal _v1208 = $args[6];
  {ESLVal t1 = expType.apply(_v1203,_v1205,_v1206,_v1207,_v1208);
        ESLVal t2 = expType.apply(_v1204,_v1205,_v1206,_v1207,_v1208);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v1202,new ESLVal("@ expects arguments to be same type: ").add(ppType.apply(t1,_v1208).add(new ESLVal(" ").add(ppType.apply(t2,_v1208))))));
      }
    }
  });
  private static ESLVal dotDotExpType = new ESLVal(new Function(new ESLVal("dotDotExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1195 = $args[0];
  ESLVal _v1196 = $args[1];
  ESLVal _v1197 = $args[2];
  ESLVal _v1198 = $args[3];
  ESLVal _v1199 = $args[4];
  ESLVal _v1200 = $args[5];
  ESLVal _v1201 = $args[6];
  {ESLVal t1 = expType.apply(_v1196,_v1198,_v1199,_v1200,_v1201);
        ESLVal t2 = expType.apply(_v1197,_v1198,_v1199,_v1200,_v1201);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("ListType",_v1195,new ESLVal("IntType",_v1195));
        else
          return error(new ESLVal("TypeError",_v1195,new ESLVal(".. expects integer arguments: ").add(ppType.apply(t1,_v1201).add(new ESLVal(" ").add(ppType.apply(t2,_v1201))))));
      }
    }
  });
  private static ESLVal percentExpType = new ESLVal(new Function(new ESLVal("percentExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1188 = $args[0];
  ESLVal _v1189 = $args[1];
  ESLVal _v1190 = $args[2];
  ESLVal _v1191 = $args[3];
  ESLVal _v1192 = $args[4];
  ESLVal _v1193 = $args[5];
  ESLVal _v1194 = $args[6];
  {ESLVal t1 = expType.apply(_v1189,_v1191,_v1192,_v1193,_v1194);
        ESLVal t2 = expType.apply(_v1190,_v1191,_v1192,_v1193,_v1194);
        
        if(isIntType.apply(t1).and(isIntType.apply(t2)).boolVal)
        return new ESLVal("IntType",_v1188);
        else
          return error(new ESLVal("TypeError",_v1188,new ESLVal("% expects integer arguments: ").add(ppType.apply(t1,_v1194).add(new ESLVal(" ").add(ppType.apply(t2,_v1194))))));
      }
    }
  });
  private static ESLVal compareExpType = new ESLVal(new Function(new ESLVal("compareExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1180 = $args[0];
  ESLVal _v1181 = $args[1];
  ESLVal _v1182 = $args[2];
  ESLVal _v1183 = $args[3];
  ESLVal _v1184 = $args[4];
  ESLVal _v1185 = $args[5];
  ESLVal _v1186 = $args[6];
  ESLVal _v1187 = $args[7];
  {ESLVal t1 = expType.apply(_v1181,_v1184,_v1185,_v1186,_v1187);
        ESLVal t2 = expType.apply(_v1183,_v1184,_v1185,_v1186,_v1187);
        
        if(isNumType.apply(t1).and(isNumType.apply(t2)).boolVal)
        return new ESLVal("BoolType",_v1180);
        else
          return error(new ESLVal("TypeError",_v1180,_v1182.add(new ESLVal(" expects numeric arguments: ").add(ppType.apply(t1,_v1187).add(new ESLVal(" ").add(ppType.apply(t2,_v1187)))))));
      }
    }
  });
  private static ESLVal orExpType = new ESLVal(new Function(new ESLVal("orExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1173 = $args[0];
  ESLVal _v1174 = $args[1];
  ESLVal _v1175 = $args[2];
  ESLVal _v1176 = $args[3];
  ESLVal _v1177 = $args[4];
  ESLVal _v1178 = $args[5];
  ESLVal _v1179 = $args[6];
  {ESLVal t1 = expType.apply(_v1174,_v1176,_v1177,_v1178,_v1179);
        ESLVal t2 = expType.apply(_v1175,_v1176,_v1177,_v1178,_v1179);
        
        if(isBoolType.apply(t1).and(isBoolType.apply(t2)).boolVal)
        return t1;
        else
          return error(new ESLVal("TypeError",_v1173,new ESLVal("or expects boolean arguments: ").add(ppType.apply(t1,_v1179).add(new ESLVal(" ").add(ppType.apply(t2,_v1179))))));
      }
    }
  });
  private static ESLVal eqlExpType = new ESLVal(new Function(new ESLVal("eqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1166 = $args[0];
  ESLVal _v1167 = $args[1];
  ESLVal _v1168 = $args[2];
  ESLVal _v1169 = $args[3];
  ESLVal _v1170 = $args[4];
  ESLVal _v1171 = $args[5];
  ESLVal _v1172 = $args[6];
  {ESLVal t1 = expType.apply(_v1167,_v1169,_v1170,_v1171,_v1172);
        ESLVal t2 = expType.apply(_v1168,_v1169,_v1170,_v1171,_v1172);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v1166);
        else
          return error(new ESLVal("TypeError",_v1166,new ESLVal("= expects types to agree: ").add(ppType.apply(t1,_v1172).add(new ESLVal(" <> ").add(ppType.apply(t2,_v1172))))));
      }
    }
  });
  private static ESLVal neqlExpType = new ESLVal(new Function(new ESLVal("neqlExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1159 = $args[0];
  ESLVal _v1160 = $args[1];
  ESLVal _v1161 = $args[2];
  ESLVal _v1162 = $args[3];
  ESLVal _v1163 = $args[4];
  ESLVal _v1164 = $args[5];
  ESLVal _v1165 = $args[6];
  {ESLVal t1 = expType.apply(_v1160,_v1162,_v1163,_v1164,_v1165);
        ESLVal t2 = expType.apply(_v1161,_v1162,_v1163,_v1164,_v1165);
        
        if(typeEqual.apply(t1,t2).boolVal)
        return new ESLVal("BoolType",_v1159);
        else
          return error(new ESLVal("TypeError",_v1159,new ESLVal("<> expects types to agree: ").add(ppType.apply(t1,_v1165).add(new ESLVal(" <> ").add(ppType.apply(t2,_v1165))))));
      }
    }
  });
  private static ESLVal consExpType = new ESLVal(new Function(new ESLVal("consExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1151 = $args[0];
  ESLVal _v1152 = $args[1];
  ESLVal _v1153 = $args[2];
  ESLVal _v1154 = $args[3];
  ESLVal _v1155 = $args[4];
  ESLVal _v1156 = $args[5];
  ESLVal _v1157 = $args[6];
  {ESLVal t1 = typeNF.apply(expType.apply(_v1152,_v1154,_v1155,_v1156,_v1157),_v1157);
        ESLVal t2 = typeNF.apply(expType.apply(_v1153,_v1154,_v1155,_v1156,_v1157),_v1157);
        
        {ESLVal _v896 = t2;
        ESLVal _v897 = t1;
        
        switch(_v896.termName) {
        case "ListType": {ESLVal $2099 = _v896.termRef(0);
          ESLVal $2098 = _v896.termRef(1);
          
          {ESLVal _v1158 = $2099;
          
          {ESLVal elementType = $2098;
          
          {ESLVal headType = _v897;
          
          if(subType.apply(headType,elementType).boolVal)
          return t2;
          else
            return error(new ESLVal("TypeError",_v1158,new ESLVal(": expects head type ").add(ppType.apply(headType,_v1157).add(new ESLVal(" and element type ").add(ppType.apply(elementType,_v1157).add(new ESLVal(" to agree")))))));
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(60925,61206)").add(ESLVal.list(_v896,_v897)));
      }
      }
      }
    }
  });
  private static ESLVal divExpType = new ESLVal(new Function(new ESLVal("divExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1138 = $args[0];
  ESLVal _v1139 = $args[1];
  ESLVal _v1140 = $args[2];
  ESLVal _v1141 = $args[3];
  ESLVal _v1142 = $args[4];
  ESLVal _v1143 = $args[5];
  ESLVal _v1144 = $args[6];
  {ESLVal t1 = expType.apply(_v1139,_v1141,_v1142,_v1143,_v1144);
        ESLVal t2 = expType.apply(_v1140,_v1141,_v1142,_v1143,_v1144);
        
        {ESLVal _v898 = t1;
        ESLVal _v899 = t2;
        
        switch(_v898.termName) {
        case "IntType": {ESLVal $2102 = _v898.termRef(0);
          
          switch(_v899.termName) {
          case "IntType": {ESLVal $2103 = _v899.termRef(0);
            
            {ESLVal l1 = $2102;
            
            {ESLVal l2 = $2103;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v1147 = _v898;
            
            {ESLVal _v1148 = _v899;
            
            return error(new ESLVal("TypeError",_v1138,new ESLVal("incomptible types for /: ").add(ppType.apply(_v1147,_v1144).add(new ESLVal(" and ").add(ppType.apply(_v1148,_v1144))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $2100 = _v898.termRef(0);
          
          switch(_v899.termName) {
          case "FloatType": {ESLVal $2101 = _v899.termRef(0);
            
            {ESLVal l1 = $2100;
            
            {ESLVal l2 = $2101;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v1145 = _v898;
            
            {ESLVal _v1146 = _v899;
            
            return error(new ESLVal("TypeError",_v1138,new ESLVal("incomptible types for /: ").add(ppType.apply(_v1145,_v1144).add(new ESLVal(" and ").add(ppType.apply(_v1146,_v1144))))));
          }
          }
        }
        }
        default: {ESLVal _v1149 = _v898;
          
          {ESLVal _v1150 = _v899;
          
          return error(new ESLVal("TypeError",_v1138,new ESLVal("incomptible types for /: ").add(ppType.apply(_v1149,_v1144).add(new ESLVal(" and ").add(ppType.apply(_v1150,_v1144))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal mulExpType = new ESLVal(new Function(new ESLVal("mulExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1125 = $args[0];
  ESLVal _v1126 = $args[1];
  ESLVal _v1127 = $args[2];
  ESLVal _v1128 = $args[3];
  ESLVal _v1129 = $args[4];
  ESLVal _v1130 = $args[5];
  ESLVal _v1131 = $args[6];
  {ESLVal t1 = expType.apply(_v1126,_v1128,_v1129,_v1130,_v1131);
        ESLVal t2 = expType.apply(_v1127,_v1128,_v1129,_v1130,_v1131);
        
        {ESLVal _v900 = t1;
        ESLVal _v901 = t2;
        
        switch(_v900.termName) {
        case "IntType": {ESLVal $2107 = _v900.termRef(0);
          
          switch(_v901.termName) {
          case "IntType": {ESLVal $2109 = _v901.termRef(0);
            
            {ESLVal l1 = $2107;
            
            {ESLVal l2 = $2109;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $2108 = _v901.termRef(0);
            
            {ESLVal l1 = $2107;
            
            {ESLVal l2 = $2108;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v1134 = _v900;
            
            {ESLVal _v1135 = _v901;
            
            return error(new ESLVal("TypeError",_v1125,new ESLVal("incomptible types for *: ").add(ppType.apply(_v1134,_v1131).add(new ESLVal(" and ").add(ppType.apply(_v1135,_v1131))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $2104 = _v900.termRef(0);
          
          switch(_v901.termName) {
          case "FloatType": {ESLVal $2106 = _v901.termRef(0);
            
            {ESLVal l1 = $2104;
            
            {ESLVal l2 = $2106;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $2105 = _v901.termRef(0);
            
            {ESLVal l1 = $2104;
            
            {ESLVal l2 = $2105;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v1132 = _v900;
            
            {ESLVal _v1133 = _v901;
            
            return error(new ESLVal("TypeError",_v1125,new ESLVal("incomptible types for *: ").add(ppType.apply(_v1132,_v1131).add(new ESLVal(" and ").add(ppType.apply(_v1133,_v1131))))));
          }
          }
        }
        }
        default: {ESLVal _v1136 = _v900;
          
          {ESLVal _v1137 = _v901;
          
          return error(new ESLVal("TypeError",_v1125,new ESLVal("incomptible types for *: ").add(ppType.apply(_v1136,_v1131).add(new ESLVal(" and ").add(ppType.apply(_v1137,_v1131))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal subExpType = new ESLVal(new Function(new ESLVal("subExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1112 = $args[0];
  ESLVal _v1113 = $args[1];
  ESLVal _v1114 = $args[2];
  ESLVal _v1115 = $args[3];
  ESLVal _v1116 = $args[4];
  ESLVal _v1117 = $args[5];
  ESLVal _v1118 = $args[6];
  {ESLVal t1 = expType.apply(_v1113,_v1115,_v1116,_v1117,_v1118);
        ESLVal t2 = expType.apply(_v1114,_v1115,_v1116,_v1117,_v1118);
        
        {ESLVal _v902 = t1;
        ESLVal _v903 = t2;
        
        switch(_v902.termName) {
        case "IntType": {ESLVal $2113 = _v902.termRef(0);
          
          switch(_v903.termName) {
          case "IntType": {ESLVal $2115 = _v903.termRef(0);
            
            {ESLVal l1 = $2113;
            
            {ESLVal l2 = $2115;
            
            return t1;
          }
          }
          }
        case "FloatType": {ESLVal $2114 = _v903.termRef(0);
            
            {ESLVal l1 = $2113;
            
            {ESLVal l2 = $2114;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v1121 = _v902;
            
            {ESLVal _v1122 = _v903;
            
            return error(new ESLVal("TypeError",_v1112,new ESLVal("incomptible types for -: ").add(ppType.apply(_v1121,_v1118).add(new ESLVal(" and ").add(ppType.apply(_v1122,_v1118))))));
          }
          }
        }
        }
      case "FloatType": {ESLVal $2110 = _v902.termRef(0);
          
          switch(_v903.termName) {
          case "FloatType": {ESLVal $2112 = _v903.termRef(0);
            
            {ESLVal l1 = $2110;
            
            {ESLVal l2 = $2112;
            
            return t1;
          }
          }
          }
        case "IntType": {ESLVal $2111 = _v903.termRef(0);
            
            {ESLVal l1 = $2110;
            
            {ESLVal l2 = $2111;
            
            return t1;
          }
          }
          }
          default: {ESLVal _v1119 = _v902;
            
            {ESLVal _v1120 = _v903;
            
            return error(new ESLVal("TypeError",_v1112,new ESLVal("incomptible types for -: ").add(ppType.apply(_v1119,_v1118).add(new ESLVal(" and ").add(ppType.apply(_v1120,_v1118))))));
          }
          }
        }
        }
        default: {ESLVal _v1123 = _v902;
          
          {ESLVal _v1124 = _v903;
          
          return error(new ESLVal("TypeError",_v1112,new ESLVal("incomptible types for -: ").add(ppType.apply(_v1123,_v1118).add(new ESLVal(" and ").add(ppType.apply(_v1124,_v1118))))));
        }
        }
      }
      }
      }
    }
  });
  private static ESLVal plusExpType = new ESLVal(new Function(new ESLVal("plusExpType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1071 = $args[0];
  ESLVal _v1072 = $args[1];
  ESLVal _v1073 = $args[2];
  ESLVal _v1074 = $args[3];
  ESLVal _v1075 = $args[4];
  ESLVal _v1076 = $args[5];
  ESLVal _v1077 = $args[6];
  {ESLVal t1 = expType.apply(_v1072,_v1074,_v1075,_v1076,_v1077);
        ESLVal t2 = expType.apply(_v1073,_v1074,_v1075,_v1076,_v1077);
        
        {ESLVal _v904 = t1;
        ESLVal _v905 = t2;
        
        switch(_v904.termName) {
        case "StrType": {ESLVal $2129 = _v904.termRef(0);
          
          {ESLVal _v1106 = $2129;
          
          {ESLVal _v1107 = _v905;
          
          return t1;
        }
        }
        }
      case "IntType": {ESLVal $2127 = _v904.termRef(0);
          
          switch(_v905.termName) {
          case "IntType": {ESLVal $2128 = _v905.termRef(0);
            
            {ESLVal l1 = $2127;
            
            {ESLVal l2 = $2128;
            
            return t1;
          }
          }
          }
          default: switch(_v905.termName) {
            case "StrType": {ESLVal $2116 = _v905.termRef(0);
              
              {ESLVal _v1102 = _v904;
              
              {ESLVal _v1103 = $2116;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v1104 = _v904;
              
              {ESLVal _v1105 = _v905;
              
              return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1104,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1105,_v1077))))));
            }
            }
          }
        }
        }
      case "FloatType": {ESLVal $2125 = _v904.termRef(0);
          
          switch(_v905.termName) {
          case "FloatType": {ESLVal $2126 = _v905.termRef(0);
            
            {ESLVal l1 = $2125;
            
            {ESLVal l2 = $2126;
            
            return t1;
          }
          }
          }
          default: switch(_v905.termName) {
            case "StrType": {ESLVal $2116 = _v905.termRef(0);
              
              {ESLVal _v1098 = _v904;
              
              {ESLVal _v1099 = $2116;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v1100 = _v904;
              
              {ESLVal _v1101 = _v905;
              
              return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1100,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1101,_v1077))))));
            }
            }
          }
        }
        }
      case "ListType": {ESLVal $2122 = _v904.termRef(0);
          ESLVal $2121 = _v904.termRef(1);
          
          switch(_v905.termName) {
          case "ListType": {ESLVal $2124 = _v905.termRef(0);
            ESLVal $2123 = _v905.termRef(1);
            
            {ESLVal l1 = $2122;
            
            {ESLVal _v1088 = $2121;
            
            {ESLVal l2 = $2124;
            
            {ESLVal _v1089 = $2123;
            
            if(typeEqual.apply(_v1088,_v1089).boolVal)
            return new ESLVal("ListType",l1,_v1088);
            else
              switch(_v905.termName) {
                case "StrType": {ESLVal $2116 = _v905.termRef(0);
                  
                  {ESLVal _v1090 = _v904;
                  
                  {ESLVal _v1091 = $2116;
                  
                  return _v1089;
                }
                }
                }
                default: {ESLVal _v1092 = _v904;
                  
                  {ESLVal _v1093 = _v905;
                  
                  return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1092,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1093,_v1077))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v905.termName) {
            case "StrType": {ESLVal $2116 = _v905.termRef(0);
              
              {ESLVal _v1094 = _v904;
              
              {ESLVal _v1095 = $2116;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v1096 = _v904;
              
              {ESLVal _v1097 = _v905;
              
              return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1096,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1097,_v1077))))));
            }
            }
          }
        }
        }
      case "SetType": {ESLVal $2118 = _v904.termRef(0);
          ESLVal $2117 = _v904.termRef(1);
          
          switch(_v905.termName) {
          case "SetType": {ESLVal $2120 = _v905.termRef(0);
            ESLVal $2119 = _v905.termRef(1);
            
            {ESLVal l1 = $2118;
            
            {ESLVal _v1078 = $2117;
            
            {ESLVal l2 = $2120;
            
            {ESLVal _v1079 = $2119;
            
            if(typeEqual.apply(_v1078,_v1079).boolVal)
            return new ESLVal("SetType",l1,_v1078);
            else
              switch(_v905.termName) {
                case "StrType": {ESLVal $2116 = _v905.termRef(0);
                  
                  {ESLVal _v1080 = _v904;
                  
                  {ESLVal _v1081 = $2116;
                  
                  return _v1079;
                }
                }
                }
                default: {ESLVal _v1082 = _v904;
                  
                  {ESLVal _v1083 = _v905;
                  
                  return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1082,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1083,_v1077))))));
                }
                }
              }
          }
          }
          }
          }
          }
          default: switch(_v905.termName) {
            case "StrType": {ESLVal $2116 = _v905.termRef(0);
              
              {ESLVal _v1084 = _v904;
              
              {ESLVal _v1085 = $2116;
              
              return t2;
            }
            }
            }
            default: {ESLVal _v1086 = _v904;
              
              {ESLVal _v1087 = _v905;
              
              return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1086,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1087,_v1077))))));
            }
            }
          }
        }
        }
        default: switch(_v905.termName) {
          case "StrType": {ESLVal $2116 = _v905.termRef(0);
            
            {ESLVal _v1108 = _v904;
            
            {ESLVal _v1109 = $2116;
            
            return t2;
          }
          }
          }
          default: {ESLVal _v1110 = _v904;
            
            {ESLVal _v1111 = _v905;
            
            return error(new ESLVal("TypeError",_v1071,new ESLVal("incomptible types for +: ").add(ppType.apply(_v1110,_v1077).add(new ESLVal(" and ").add(ppType.apply(_v1111,_v1077))))));
          }
          }
        }
      }
      }
      }
    }
  });
  private static ESLVal applyTypeExp = new ESLVal(new Function(new ESLVal("applyTypeExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1060 = $args[0];
  ESLVal _v1061 = $args[1];
  ESLVal _v1062 = $args[2];
  ESLVal _v1063 = $args[3];
  ESLVal _v1064 = $args[4];
  ESLVal _v1065 = $args[5];
  ESLVal _v1066 = $args[6];
  {ESLVal _v1067 = substTypesEnv.apply(_v1066,_v1062);
        ESLVal _v1068 = expType.apply(_v1061,_v1063,_v1064,_v1065,_v1066);
        
        {ESLVal _v906 = _v1068;
        
        switch(_v906.termName) {
        case "ForallType": {ESLVal $2132 = _v906.termRef(0);
          ESLVal $2131 = _v906.termRef(1);
          ESLVal $2130 = _v906.termRef(2);
          
          {ESLVal l1 = $2132;
          
          {ESLVal ns = $2131;
          
          {ESLVal _v1069 = $2130;
          
          if(length.apply(ns).eql(length.apply(_v1067)).boolVal)
          {ESLVal env = zipTypeEnv.apply(ns,_v1067);
            
            return substTypeEnv.apply(env.add(_v1064),_v1069);
          }
          else
            return error(new ESLVal("TypeError",_v1060,new ESLVal("universal type expects ").add(length.apply(ns).add(new ESLVal(" types, but supplied with ").add(length.apply(_v1067))))));
        }
        }
        }
        }
        default: {ESLVal _v1070 = _v906;
          
          return error(new ESLVal("TypeError",_v1060,new ESLVal("expecting a universal type: ").add(_v1070)));
        }
      }
      }
      }
    }
  });
  private static ESLVal expTypes = new ESLVal(new Function(new ESLVal("expTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1055 = $args[0];
  ESLVal _v1056 = $args[1];
  ESLVal _v1057 = $args[2];
  ESLVal _v1058 = $args[3];
  ESLVal _v1059 = $args[4];
  return map.apply(new ESLVal(new Function(new ESLVal("fun536"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expType.apply(e,_v1056,_v1057,_v1058,_v1059);
          }
        }),_v1055);
    }
  });
  private static ESLVal applyType = new ESLVal(new Function(new ESLVal("applyType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1048 = $args[0];
  ESLVal _v1049 = $args[1];
  ESLVal _v1050 = $args[2];
  ESLVal _v1051 = $args[3];
  ESLVal _v1052 = $args[4];
  ESLVal _v1053 = $args[5];
  ESLVal _v1054 = $args[6];
  {ESLVal _v907 = typeNF.apply(expType.apply(_v1049,_v1051,_v1052,_v1053,_v1054),_v1054);
        
        switch(_v907.termName) {
        case "FunType": {ESLVal $2135 = _v907.termRef(0);
          ESLVal $2134 = _v907.termRef(1);
          ESLVal $2133 = _v907.termRef(2);
          
          {ESLVal l1 = $2135;
          
          {ESLVal domain = $2134;
          
          {ESLVal range = $2133;
          
          {ESLVal supplied = expTypes.apply(_v1050,_v1051,_v1052,_v1053,_v1054);
          
          if(length.apply(domain).eql(length.apply(supplied)).boolVal)
          if(subTypes.apply(supplied,domain).boolVal)
            return range;
            else
              return error(new ESLVal("TypeError",_v1048,new ESLVal("supplied argument types ").add(ppTypes.apply(supplied,_v1054).add(new ESLVal(" do not match function domain ").add(ppTypes.apply(domain,_v1054))))));
          else
            return error(new ESLVal("TypeError",_v1048,new ESLVal("expecting ").add(length.apply(domain).add(new ESLVal(" args, but supplied with ").add(length.apply(supplied))))));
        }
        }
        }
        }
        }
        default: {ESLVal t = _v907;
          
          return error(new ESLVal("TypeError",_v1048,new ESLVal("unknown type for apply: ").add(ppType.apply(t,_v1054))));
        }
      }
      }
    }
  });
  private static ESLVal ifType = new ESLVal(new Function(new ESLVal("ifType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1040 = $args[0];
  ESLVal _v1041 = $args[1];
  ESLVal _v1042 = $args[2];
  ESLVal _v1043 = $args[3];
  ESLVal _v1044 = $args[4];
  ESLVal _v1045 = $args[5];
  ESLVal _v1046 = $args[6];
  ESLVal _v1047 = $args[7];
  {ESLVal testType = expType.apply(_v1041,_v1044,_v1045,_v1046,_v1047);
        
        if(isBoolType.apply(testType).boolVal)
        {ESLVal conseqType = expType.apply(_v1042,_v1044,_v1045,_v1046,_v1047);
          ESLVal altType = expType.apply(_v1043,_v1044,_v1045,_v1046,_v1047);
          
          if(typeEqual.apply(conseqType,altType).boolVal)
          return conseqType;
          else
            return error(new ESLVal("TypeError",_v1040,new ESLVal("conseq and alt types do not agree: ").add(ppType.apply(conseqType,_v1047).add(new ESLVal(" ").add(ppType.apply(altType,_v1047))))));
        }
        else
          return error(new ESLVal("if expects a bool ").add(ppType.apply(testType,_v1047)));
      }
    }
  });
  private static ESLVal checkDecs = new ESLVal(new Function(new ESLVal("checkDecs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ds = $args[0];
  {ESLVal _v908 = ds;
        
        if(_v908.isCons())
        {ESLVal $2136 = _v908.head();
          ESLVal $2137 = _v908.tail();
          
          {ESLVal d = $2136;
          
          {ESLVal _v1039 = $2137;
          
          if(member.apply(decName.apply(d),new java.util.function.Function<ESLVal,ESLVal>() {
          public ESLVal apply(ESLVal $l0) {
            ESLVal $a = $nil;
            java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
            while(!$l0.isNil()) { 
              ESLVal d = $l0.head();
              $l0 = $l0.tail();
              $v.add(decName.apply(d));
            }
            for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
            return $a;
          }}.apply(_v1039)).boolVal)
          return error(new ESLVal("TypeError",decLoc.apply(d),new ESLVal(" duplicate argument ").add(decName.apply(d))));
          else
            return checkDecs.apply(_v1039);
        }
        }
        }
      else if(_v908.isNil())
        return $null;
      else return error(new ESLVal("case error at Pos(66072,66305)").add(ESLVal.list(_v908)));
      }
    }
  });
  private static ESLVal funType = new ESLVal(new Function(new ESLVal("funType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1028 = $args[0];
  ESLVal _v1029 = $args[1];
  ESLVal _v1030 = $args[2];
  ESLVal _v1031 = $args[3];
  ESLVal _v1032 = $args[4];
  ESLVal _v1033 = $args[5];
  ESLVal _v1034 = $args[6];
  ESLVal _v1035 = $args[7];
  ESLVal _v1036 = $args[8];
  {checkDecs.apply(_v1030);
      {ESLVal nType = expType.apply(_v1029,_v1033,_v1034,_v1035,_v1036);
        
        if(isStrType.apply(nType).boolVal)
        {ESLVal declaredType = substTypeEnv.apply(_v1036,_v1031);
          
          return decTypes.apply(_v1030,_v1034,_v1036,new ESLVal(new Function(new ESLVal("fun537"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1037 = $args[0];
          ESLVal _v1038 = $args[1];
          {ESLVal actualRange = expType.apply(_v1032,_v1033,_v1038,_v1035,_v1036);
                
                if(subType.apply(new ESLVal("FunType",_v1028,_v1037,actualRange),declaredType).boolVal)
                return new ESLVal("FunType",_v1028,_v1037,actualRange);
                else
                  return error(new ESLVal("TypeError",_v1028,new ESLVal("function declared type ").add(ppType.apply(declaredType,_v1036).add(new ESLVal(" but is ").add(ppType.apply(new ESLVal("FunType",_v1028,_v1037,actualRange),_v1036))))));
              }
            }
          }));
        }
        else
          return error(new ESLVal("TypeError",_v1028,new ESLVal("expecting a string for a function name: ").add(_v1029)));
      }}
    }
  });
  private static ESLVal decTypes = new ESLVal(new Function(new ESLVal("decTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1021 = $args[0];
  ESLVal _v1022 = $args[1];
  ESLVal _v1023 = $args[2];
  ESLVal _v1024 = $args[3];
  { LetRec letrec = new LetRec() {
        ESLVal processDecs = new ESLVal(new Function(new ESLVal("processDecs"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v1025 = $args[0];
          ESLVal _v1026 = $args[1];
          {ESLVal _v909 = _v1025;
                
                if(_v909.isCons())
                {ESLVal $2138 = _v909.head();
                  ESLVal $2139 = _v909.tail();
                  
                  switch($2138.termName) {
                  case "Dec": {ESLVal $2143 = $2138.termRef(0);
                    ESLVal $2142 = $2138.termRef(1);
                    ESLVal $2141 = $2138.termRef(2);
                    ESLVal $2140 = $2138.termRef(3);
                    
                    {ESLVal l = $2143;
                    
                    {ESLVal n = $2142;
                    
                    {ESLVal t = $2141;
                    
                    {ESLVal st = $2140;
                    
                    {ESLVal _v1027 = $2139;
                    
                    return processDecs.apply(_v1027,_v1026.cons(new ESLVal("Map",n,substTypeEnv.apply(_v1023,t))));
                  }
                  }
                  }
                  }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(67498,67723)").add(ESLVal.list(_v909)));
                }
                }
              else if(_v909.isNil())
                return _v1024.apply(reverse.apply(typeEnvRan.apply(_v1026)),_v1026.add(_v1022));
              else return error(new ESLVal("case error at Pos(67498,67723)").add(ESLVal.list(_v909)));
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "processDecs": return processDecs;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal processDecs = letrec.get("processDecs");
      
        return processDecs.apply(_v1021,$nil);}
      
    }
  });
  private static ESLVal termType = new ESLVal(new Function(new ESLVal("termType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1013 = $args[0];
  ESLVal _v1014 = $args[1];
  ESLVal _v1015 = $args[2];
  ESLVal _v1016 = $args[3];
  ESLVal _v1017 = $args[4];
  ESLVal _v1018 = $args[5];
  ESLVal _v1019 = $args[6];
  ESLVal _v1020 = $args[7];
  {ESLVal t0 = lookupType.apply(_v1014,_v1019);
        
        if(t0.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v1013,new ESLVal("cannot find cnstr ").add(_v1014)));
        else
          {ESLVal t = unfoldIf.apply(t0);
            
            return termTypeCheckUnion.apply(t,_v1013,_v1014,_v1015,_v1016,_v1017,_v1018,_v1019,_v1020);
          }
      }
    }
  });
  private static ESLVal termTypeCheckUnion = new ESLVal(new Function(new ESLVal("termTypeCheckUnion"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v1002 = $args[0];
  ESLVal _v1003 = $args[1];
  ESLVal _v1004 = $args[2];
  ESLVal _v1005 = $args[3];
  ESLVal _v1006 = $args[4];
  ESLVal _v1007 = $args[5];
  ESLVal _v1008 = $args[6];
  ESLVal _v1009 = $args[7];
  ESLVal _v1010 = $args[8];
  if(_v1002.eql($null).boolVal)
        return error(new ESLVal("TypeError",_v1003,new ESLVal("cannot find constructor ").add(_v1004)));
        else
          {ESLVal _v910 = _v1002;
            
            switch(_v910.termName) {
            case "TypeFun": {ESLVal $2148 = _v910.termRef(0);
              ESLVal $2147 = _v910.termRef(1);
              ESLVal $2146 = _v910.termRef(2);
              
              {ESLVal lf = $2148;
              
              {ESLVal ns = $2147;
              
              {ESLVal body = $2146;
              
              if(length.apply(ns).eql(length.apply(_v1005)).boolVal)
              {ESLVal args = map.apply(new ESLVal(new Function(new ESLVal("fun538"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal _v1011 = $args[0];
                  return substTypeEnv.apply(_v1010,_v1011);
                    }
                  }),_v1005);
                
                {ESLVal _v911 = substTypeEnv.apply(zipTypeEnv.apply(ns,args),body);
                
                switch(_v911.termName) {
                case "UnionType": {ESLVal $2150 = _v911.termRef(0);
                  ESLVal $2149 = _v911.termRef(1);
                  
                  {ESLVal l1 = $2150;
                  
                  {ESLVal terms = $2149;
                  
                  {ESLVal ts2 = findTermArgTypes.apply(_v1004,terms);
                  
                  if(length.apply(_v1006).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v1003,_v1006,ts2,_v1007,_v1008,_v1009,_v1010);
                  return new ESLVal("UnionType",l1,terms);}
                  else
                    return error(new ESLVal("TypeError",_v1003,_v1004.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v1006)))))));
                }
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(68596,69158)").add(ESLVal.list(_v911)));
              }
              }
              }
              else
                return error(new ESLVal("TypeError",_v1003,new ESLVal("generic constructor ").add(_v1004.add(new ESLVal(" expects ").add(length.apply(ns).add(new ESLVal(" type arguments, but received ").add(length.apply(_v1005))))))));
            }
            }
            }
            }
          case "UnionType": {ESLVal $2145 = _v910.termRef(0);
              ESLVal $2144 = _v910.termRef(1);
              
              {ESLVal l1 = $2145;
              
              {ESLVal terms = $2144;
              
              {ESLVal ts2 = findTermArgTypes.apply(_v1004,terms);
              
              if(length.apply(_v1005).neql($zero).boolVal)
              return error(new ESLVal("TypeError",_v1003,new ESLVal("generic application of non-generic constructior: ").add(_v1004)));
              else
                if(length.apply(_v1006).eql(length.apply(ts2)).boolVal)
                  {checkTermArgTypes.apply(_v1003,_v1006,ts2,_v1007,_v1008,_v1009,_v1010);
                  return _v1002;}
                  else
                    return error(new ESLVal("TypeError",_v1003,_v1004.add(new ESLVal(" expects ").add(length.apply(ts2).add(new ESLVal(" args, but you supplied ").add(length.apply(_v1006)))))));
            }
            }
            }
            }
            default: {ESLVal _v1012 = _v910;
              
              return error(new ESLVal("TypeError",_v1003,new ESLVal("expecting a union type for ").add(_v1004.add(new ESLVal(" but got ").add(ppType.apply(_v1012,_v1010))))));
            }
          }
          }
    }
  });
  private static ESLVal unfoldIf = new ESLVal(new Function(new ESLVal("unfoldIf"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v912 = t;
        
        switch(_v912.termName) {
        case "RecType": {ESLVal $2153 = _v912.termRef(0);
          ESLVal $2152 = _v912.termRef(1);
          ESLVal $2151 = _v912.termRef(2);
          
          {ESLVal l = $2153;
          
          {ESLVal n = $2152;
          
          {ESLVal _v1000 = $2151;
          
          return unfoldIf.apply(unfoldType.apply(l,n,_v1000));
        }
        }
        }
        }
        default: {ESLVal _v1001 = _v912;
          
          return _v1001;
        }
      }
      }
    }
  });
  private static ESLVal findTermArgTypes = new ESLVal(new Function(new ESLVal("findTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal terms = $args[1];
  {ESLVal _v913 = terms;
        
        if(_v913.isCons())
        {ESLVal $2154 = _v913.head();
          ESLVal $2155 = _v913.tail();
          
          switch($2154.termName) {
          case "TermType": {ESLVal $2158 = $2154.termRef(0);
            ESLVal $2157 = $2154.termRef(1);
            ESLVal $2156 = $2154.termRef(2);
            
            {ESLVal l = $2158;
            
            {ESLVal nn = $2157;
            
            {ESLVal ts = $2156;
            
            {ESLVal _v998 = $2155;
            
            if(nn.eql(n).boolVal)
            return ts;
            else
              {ESLVal t = $2154;
                
                {ESLVal _v999 = $2155;
                
                return findTermArgTypes.apply(n,_v999);
              }
              }
          }
          }
          }
          }
          }
          default: {ESLVal t = $2154;
            
            {ESLVal ts = $2155;
            
            return findTermArgTypes.apply(n,ts);
          }
          }
        }
        }
      else if(_v913.isNil())
        return error(new ESLVal("cannot find constructor ").add(n));
      else return error(new ESLVal("case error at Pos(70166,70366)").add(ESLVal.list(_v913)));
      }
    }
  });
  private static ESLVal checkTermArgTypes = new ESLVal(new Function(new ESLVal("checkTermArgTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v989 = $args[0];
  ESLVal _v990 = $args[1];
  ESLVal _v991 = $args[2];
  ESLVal _v992 = $args[3];
  ESLVal _v993 = $args[4];
  ESLVal _v994 = $args[5];
  ESLVal _v995 = $args[6];
  {ESLVal _v914 = _v990;
        ESLVal _v915 = _v991;
        
        if(_v914.isCons())
        {ESLVal $2159 = _v914.head();
          ESLVal $2160 = _v914.tail();
          
          if(_v915.isCons())
          {ESLVal $2161 = _v915.head();
            ESLVal $2162 = _v915.tail();
            
            {ESLVal e = $2159;
            
            {ESLVal _v996 = $2160;
            
            {ESLVal t = $2161;
            
            {ESLVal _v997 = $2162;
            
            {ESLVal tt = expType.apply(e,_v992,_v993,_v994,_v995);
            
            if(typeEqual.apply(t,tt).boolVal)
            return checkTermArgTypes.apply(_v989,_v996,_v997,_v992,_v993,_v994,_v995);
            else
              return error(new ESLVal("TypeError",_v989,new ESLVal("expected constructor arg type ").add(ppType.apply(t,_v995).add(new ESLVal(" but supplied ").add(ppType.apply(tt,_v995))))));
          }
          }
          }
          }
          }
          }
        else if(_v915.isNil())
          return error(new ESLVal("case error at Pos(70484,70906)").add(ESLVal.list(_v914,_v915)));
        else return error(new ESLVal("case error at Pos(70484,70906)").add(ESLVal.list(_v914,_v915)));
        }
      else if(_v914.isNil())
        if(_v915.isCons())
          {ESLVal $2163 = _v915.head();
            ESLVal $2164 = _v915.tail();
            
            return error(new ESLVal("case error at Pos(70484,70906)").add(ESLVal.list(_v914,_v915)));
          }
        else if(_v915.isNil())
          return $null;
        else return error(new ESLVal("case error at Pos(70484,70906)").add(ESLVal.list(_v914,_v915)));
      else return error(new ESLVal("case error at Pos(70484,70906)").add(ESLVal.list(_v914,_v915)));
      }
    }
  });
  private static ESLVal notType = new ESLVal(new Function(new ESLVal("notType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v982 = $args[0];
  ESLVal _v983 = $args[1];
  ESLVal _v984 = $args[2];
  ESLVal _v985 = $args[3];
  ESLVal _v986 = $args[4];
  ESLVal _v987 = $args[5];
  {ESLVal _v916 = expType.apply(_v983,_v984,_v985,_v986,_v987);
        
        switch(_v916.termName) {
        case "BoolType": {ESLVal $2165 = _v916.termRef(0);
          
          {ESLVal _v988 = $2165;
          
          return new ESLVal("BoolType",_v988);
        }
        }
        default: {ESLVal t = _v916;
          
          return error(new ESLVal("TypeError",_v982,new ESLVal("expecting a boolean: ").add(ppType.apply(t,_v987))));
        }
      }
      }
    }
  });
  private static ESLVal varType = new ESLVal(new Function(new ESLVal("varType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal n = $args[1];
  ESLVal valueEnv = $args[2];
  {ESLVal t = lookupType.apply(n,valueEnv);
        
        if(t.eql($null).boolVal)
        return error(new ESLVal("TypeError",l,new ESLVal("unbound variable ").add(n)));
        else
          {ESLVal _v917 = t;
            
            switch(_v917.termName) {
            case "TypeClosure": {ESLVal $2166 = _v917.termRef(0);
              
              {ESLVal f = $2166;
              
              return f.apply();
            }
            }
            default: {ESLVal _v981 = _v917;
              
              return _v981;
            }
          }
          }
      }
    }
  });
  private static ESLVal blockType = new ESLVal(new Function(new ESLVal("blockType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v975 = $args[0];
  ESLVal _v976 = $args[1];
  ESLVal _v977 = $args[2];
  ESLVal _v978 = $args[3];
  ESLVal _v979 = $args[4];
  ESLVal _v980 = $args[5];
  {ESLVal[] t = new ESLVal[]{new ESLVal("VoidType",_v975)};
        
        {{
        ESLVal _v918 = _v976;
        while(_v918.isCons()) {
          ESLVal e = _v918.headVal;
          t[0] = expType.apply(e,_v977,_v978,_v979,_v980);
          _v918 = _v918.tailVal;}
      }
      return t[0];}
      }
    }
  });
  private static ESLVal listType = new ESLVal(new Function(new ESLVal("listType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v969 = $args[0];
  ESLVal _v970 = $args[1];
  ESLVal _v971 = $args[2];
  ESLVal _v972 = $args[3];
  ESLVal _v973 = $args[4];
  ESLVal _v974 = $args[5];
  if(_v970.eql($nil).boolVal)
        return new ESLVal("ForallType",_v969,ESLVal.list(new ESLVal("T")),new ESLVal("ListType",_v969,new ESLVal("VarType",_v969,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun539"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v971,_v972,_v973,_v974);
                }
              }),_v970);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("ListType",_v969,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v969,new ESLVal("lists should have elements of the same type: ").add(_v970)));
          }
    }
  });
  private static ESLVal setType = new ESLVal(new Function(new ESLVal("setType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v963 = $args[0];
  ESLVal _v964 = $args[1];
  ESLVal _v965 = $args[2];
  ESLVal _v966 = $args[3];
  ESLVal _v967 = $args[4];
  ESLVal _v968 = $args[5];
  if(_v964.eql($nil).boolVal)
        return new ESLVal("ForallType",_v963,ESLVal.list(new ESLVal("T")),new ESLVal("SetType",_v963,new ESLVal("VarType",_v963,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun540"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v965,_v966,_v967,_v968);
                }
              }),_v964);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("SetType",_v963,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v963,new ESLVal("sets should have elements of the same type: ").add(_v964)));
          }
    }
  });
  private static ESLVal bagType = new ESLVal(new Function(new ESLVal("bagType"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v957 = $args[0];
  ESLVal _v958 = $args[1];
  ESLVal _v959 = $args[2];
  ESLVal _v960 = $args[3];
  ESLVal _v961 = $args[4];
  ESLVal _v962 = $args[5];
  if(_v958.eql($nil).boolVal)
        return new ESLVal("ForallType",_v957,ESLVal.list(new ESLVal("T")),new ESLVal("BagType",_v957,new ESLVal("VarType",_v957,new ESLVal("T"))));
        else
          {ESLVal ts = map.apply(new ESLVal(new Function(new ESLVal("fun541"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal e = $args[0];
              return expType.apply(e,_v959,_v960,_v961,_v962);
                }
              }),_v958);
            
            if(allEqualTypes.apply(head.apply(ts),tail.apply(ts)).boolVal)
            return new ESLVal("BagType",_v957,head.apply(ts));
            else
              return error(new ESLVal("TypeError",_v957,new ESLVal("bags should have elements of the same type: ").add(_v958)));
          }
    }
  });
  private static ESLVal recTypes = new ESLVal(new Function(new ESLVal("recTypes"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal env = $args[0];
  { LetRec letrec = new LetRec() {
        ESLVal fixEnv = new ESLVal(new Function(new ESLVal("fixEnv"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v956 = $args[0];
          {ESLVal[] e = new ESLVal[]{$null};
                
                {ESLVal fenv = new java.util.function.Function<ESLVal,ESLVal>() {
                    public ESLVal apply(ESLVal $l0) {
                      ESLVal $a = $nil;
                      java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                      while(!$l0.isNil()) { 
                        ESLVal t = $l0.head();
                        $l0 = $l0.tail();
                        ESLVal $l1 = typeFV.apply(t);
                  while(!$l1.isNil()) {
                    ESLVal n = $l1.head();
                    $l1 = $l1.tail();
                    $v.add(new ESLVal("Map",n,new ESLVal("TypeClosure",new ESLVal(new Function(new ESLVal("lookup: ").add(n),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        return lookupType.apply(n,e[0]);
                      }
                    }))));
                  }
                      }
                      for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                      return $a;
                    }}.apply(typeEnvRan.apply(_v956));
                
                {ESLVal env1 = substOnce.apply(_v956,fenv);
                
                {e[0] = env1;
              return env1;}
              }
              }
              }
            }
          });
        ESLVal introduceRecTypes = new ESLVal(new Function(new ESLVal("introduceRecTypes"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v955 = $args[0];
          {ESLVal _v919 = _v955;
                
                if(_v919.isCons())
                {ESLVal $2167 = _v919.head();
                  ESLVal $2168 = _v919.tail();
                  
                  switch($2167.termName) {
                  case "Map": {ESLVal $2170 = $2167.termRef(0);
                    ESLVal $2169 = $2167.termRef(1);
                    
                    switch($2169.termName) {
                    case "RecordType": {ESLVal $2172 = $2169.termRef(0);
                      ESLVal $2171 = $2169.termRef(1);
                      
                      {ESLVal n = $2170;
                      
                      {ESLVal l = $2172;
                      
                      {ESLVal fs = $2171;
                      
                      {ESLVal e = $2168;
                      
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecordType",l,fs)));
                    }
                    }
                    }
                    }
                    }
                    default: {ESLVal n = $2170;
                      
                      {ESLVal t = $2169;
                      
                      {ESLVal e = $2168;
                      
                      if(member.apply(n,typeFV.apply(t)).boolVal)
                      return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,new ESLVal("RecType",p0,n,t)));
                      else
                        return introduceRecTypes.apply(e).cons(new ESLVal("Map",n,t));
                    }
                    }
                    }
                  }
                  }
                  default: return error(new ESLVal("case error at Pos(73455,73769)").add(ESLVal.list(_v919)));
                }
                }
              else if(_v919.isNil())
                return _v955;
              else return error(new ESLVal("case error at Pos(73455,73769)").add(ESLVal.list(_v919)));
              }
            }
          });
        ESLVal substOnce = new ESLVal(new Function(new ESLVal("substOnce"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v953 = $args[0];
          ESLVal _v954 = $args[1];
          {ESLVal map1 = new ESLVal(new Function(new ESLVal("map1"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal m = $args[0];
                  {ESLVal _v920 = m;
                        
                        switch(_v920.termName) {
                        case "Map": {ESLVal $2174 = _v920.termRef(0);
                          ESLVal $2173 = _v920.termRef(1);
                          
                          {ESLVal n = $2174;
                          
                          {ESLVal t = $2173;
                          
                          return new ESLVal("Map",n,substTypeEnv.apply(new java.util.function.Function<ESLVal,ESLVal>() {
                            public ESLVal apply(ESLVal $l0) {
                              ESLVal $a = $nil;
                              java.util.Vector<ESLVal> $v = new java.util.Vector<ESLVal>();
                              while(!$l0.isNil()) { 
                                ESLVal n = $l0.head();
                                $l0 = $l0.tail();
                                $v.add(new ESLVal("Map",n,lookupType.apply(n,_v954)));
                              }
                              for(int i = $v.size()-1; i >= 0; i--) $a = new ESLVal($v.get(i),$a);
                              return $a;
                            }}.apply(typeFV.apply(t)),t));
                        }
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(73879,74010)").add(ESLVal.list(_v920)));
                      }
                      }
                    }
                  });
                
                return map.apply(map1,_v953);
              }
            }
          });
        
        public ESLVal get(String name) {
          switch(name) {
            case "fixEnv": return fixEnv;
            
            case "introduceRecTypes": return introduceRecTypes;
            
            case "substOnce": return substOnce;
            
            default: throw new Error("cannot find letrec binding");
          }
          }
        };
      ESLVal fixEnv = letrec.get("fixEnv");
      
      ESLVal introduceRecTypes = letrec.get("introduceRecTypes");
      
      ESLVal substOnce = letrec.get("substOnce");
      
        return fixEnv.apply(introduceRecTypes.apply(env));}
      
    }
  });
  private static ESLVal typeFV = new ESLVal(new Function(new ESLVal("typeFV"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  return removeDups.apply(varTypeNames.apply(typeFV1.apply(t,$nil)));
    }
  });
  private static ESLVal varTypeNames = new ESLVal(new Function(new ESLVal("varTypeNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal vs = $args[0];
  return map.apply(varTypeName,vs);
    }
  });
  private static ESLVal varTypeName = new ESLVal(new Function(new ESLVal("varTypeName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  {ESLVal _v921 = t;
        
        switch(_v921.termName) {
        case "VarType": {ESLVal $2176 = _v921.termRef(0);
          ESLVal $2175 = _v921.termRef(1);
          
          {ESLVal l = $2176;
          
          {ESLVal n = $2175;
          
          return n;
        }
        }
        }
        default: {ESLVal x = _v921;
          
          return new ESLVal("<var>");
        }
      }
      }
    }
  });
  private static ESLVal tdecsFV1 = new ESLVal(new Function(new ESLVal("tdecsFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal decs = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v922 = decs;
        
        if(_v922.isCons())
        {ESLVal $2177 = _v922.head();
          ESLVal $2178 = _v922.tail();
          
          {ESLVal d = $2177;
          
          {ESLVal ds = $2178;
          
          return tdecFV1.apply(d,tdecsFV1.apply(ds,fv));
        }
        }
        }
      else if(_v922.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(74396,74485)").add(ESLVal.list(_v922)));
      }
    }
  });
  private static ESLVal tdecFV1 = new ESLVal(new Function(new ESLVal("tdecFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v923 = d;
        
        switch(_v923.termName) {
        case "Dec": {ESLVal $2182 = _v923.termRef(0);
          ESLVal $2181 = _v923.termRef(1);
          ESLVal $2180 = _v923.termRef(2);
          ESLVal $2179 = _v923.termRef(3);
          
          {ESLVal l = $2182;
          
          {ESLVal n = $2181;
          
          {ESLVal t = $2180;
          
          {ESLVal st = $2179;
          
          return typeFV1.apply(t,fv);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(74529,74608)").add(ESLVal.list(_v923)));
      }
      }
    }
  });
  private static ESLVal handlersFV1 = new ESLVal(new Function(new ESLVal("handlersFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal handlers = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v924 = handlers;
        
        if(_v924.isCons())
        {ESLVal $2183 = _v924.head();
          ESLVal $2184 = _v924.tail();
          
          {ESLVal m = $2183;
          
          {ESLVal hs = $2184;
          
          return handlerFV1.apply(m,handlersFV1.apply(hs,fv));
        }
        }
        }
      else if(_v924.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(74666,74768)").add(ESLVal.list(_v924)));
      }
    }
  });
  private static ESLVal handlerFV1 = new ESLVal(new Function(new ESLVal("handlerFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v925 = m;
        
        switch(_v925.termName) {
        case "MessageType": {ESLVal $2186 = _v925.termRef(0);
          ESLVal $2185 = _v925.termRef(1);
          
          {ESLVal l = $2186;
          
          {ESLVal ts = $2185;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(74816,74892)").add(ESLVal.list(_v925)));
      }
      }
    }
  });
  private static ESLVal typesFV1 = new ESLVal(new Function(new ESLVal("typesFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v926 = ts;
        
        if(_v926.isCons())
        {ESLVal $2187 = _v926.head();
          ESLVal $2188 = _v926.tail();
          
          {ESLVal t = $2187;
          
          {ESLVal _v952 = $2188;
          
          return typeFV1.apply(t,typesFV1.apply(_v952,fv));
        }
        }
        }
      else if(_v926.isNil())
        return fv;
      else return error(new ESLVal("case error at Pos(74941,75028)").add(ESLVal.list(_v926)));
      }
    }
  });
  private static ESLVal typeFV1 = new ESLVal(new Function(new ESLVal("typeFV1"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal fv = $args[1];
  {ESLVal _v927 = t;
        
        switch(_v927.termName) {
        case "ArrayType": {ESLVal $2248 = _v927.termRef(0);
          ESLVal $2247 = _v927.termRef(1);
          
          {ESLVal l = $2248;
          
          {ESLVal _v951 = $2247;
          
          return typeFV1.apply(_v951,fv);
        }
        }
        }
      case "ActType": {ESLVal $2246 = _v927.termRef(0);
          ESLVal $2245 = _v927.termRef(1);
          ESLVal $2244 = _v927.termRef(2);
          
          {ESLVal l = $2246;
          
          {ESLVal decs = $2245;
          
          {ESLVal handlers = $2244;
          
          return tdecsFV1.apply(decs,handlersFV1.apply(handlers,fv));
        }
        }
        }
        }
      case "ExtendedAct": {ESLVal $2243 = _v927.termRef(0);
          ESLVal $2242 = _v927.termRef(1);
          ESLVal $2241 = _v927.termRef(2);
          ESLVal $2240 = _v927.termRef(3);
          
          {ESLVal l = $2243;
          
          {ESLVal parent = $2242;
          
          {ESLVal decs = $2241;
          
          {ESLVal handlers = $2240;
          
          return tdecsFV1.apply(decs,handlersFV1.apply(handlers,typeFV1.apply(parent,fv)));
        }
        }
        }
        }
        }
      case "ApplyType": {ESLVal $2239 = _v927.termRef(0);
          ESLVal $2238 = _v927.termRef(1);
          ESLVal $2237 = _v927.termRef(2);
          
          {ESLVal l = $2239;
          
          {ESLVal n = $2238;
          
          {ESLVal types = $2237;
          
          return typesFV1.apply(types,fv.cons(new ESLVal("VarType",l,n)));
        }
        }
        }
        }
      case "ApplyTypeFun": {ESLVal $2236 = _v927.termRef(0);
          ESLVal $2235 = _v927.termRef(1);
          ESLVal $2234 = _v927.termRef(2);
          
          {ESLVal l = $2236;
          
          {ESLVal op = $2235;
          
          {ESLVal args = $2234;
          
          return typesFV1.apply(args,typeFV1.apply(op,fv));
        }
        }
        }
        }
      case "BoolType": {ESLVal $2233 = _v927.termRef(0);
          
          {ESLVal l = $2233;
          
          return fv;
        }
        }
      case "FieldType": {ESLVal $2232 = _v927.termRef(0);
          ESLVal $2231 = _v927.termRef(1);
          ESLVal $2230 = _v927.termRef(2);
          
          {ESLVal l = $2232;
          
          {ESLVal n = $2231;
          
          {ESLVal _v950 = $2230;
          
          return typeFV1.apply(_v950,fv);
        }
        }
        }
        }
      case "FloatType": {ESLVal $2229 = _v927.termRef(0);
          
          {ESLVal l = $2229;
          
          return fv;
        }
        }
      case "ForallType": {ESLVal $2228 = _v927.termRef(0);
          ESLVal $2227 = _v927.termRef(1);
          ESLVal $2226 = _v927.termRef(2);
          
          {ESLVal l = $2228;
          
          {ESLVal ns = $2227;
          
          {ESLVal _v947 = $2226;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun542"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v948 = $args[0];
          {ESLVal _v931 = _v948;
                
                switch(_v931.termName) {
                case "VarType": {ESLVal $2258 = _v931.termRef(0);
                  ESLVal $2257 = _v931.termRef(1);
                  
                  {ESLVal _v949 = $2258;
                  
                  {ESLVal n = $2257;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(75867,75927)").add(ESLVal.list(_v931)));
              }
              }
            }
          }),typeFV1.apply(_v947,$nil)).add(fv);
        }
        }
        }
        }
      case "FunType": {ESLVal $2225 = _v927.termRef(0);
          ESLVal $2224 = _v927.termRef(1);
          ESLVal $2223 = _v927.termRef(2);
          
          {ESLVal l = $2225;
          
          {ESLVal d = $2224;
          
          {ESLVal r = $2223;
          
          return typesFV1.apply(d,typeFV1.apply(r,fv));
        }
        }
        }
        }
      case "IntType": {ESLVal $2222 = _v927.termRef(0);
          
          {ESLVal l = $2222;
          
          return fv;
        }
        }
      case "ListType": {ESLVal $2221 = _v927.termRef(0);
          ESLVal $2220 = _v927.termRef(1);
          
          {ESLVal l = $2221;
          
          {ESLVal _v946 = $2220;
          
          return typeFV1.apply(_v946,fv);
        }
        }
        }
      case "BagType": {ESLVal $2219 = _v927.termRef(0);
          ESLVal $2218 = _v927.termRef(1);
          
          {ESLVal l = $2219;
          
          {ESLVal _v945 = $2218;
          
          return typeFV1.apply(_v945,fv);
        }
        }
        }
      case "SetType": {ESLVal $2217 = _v927.termRef(0);
          ESLVal $2216 = _v927.termRef(1);
          
          {ESLVal l = $2217;
          
          {ESLVal _v944 = $2216;
          
          return typeFV1.apply(_v944,fv);
        }
        }
        }
      case "NullType": {ESLVal $2215 = _v927.termRef(0);
          
          {ESLVal l = $2215;
          
          return fv;
        }
        }
      case "RecordType": {ESLVal $2214 = _v927.termRef(0);
          ESLVal $2213 = _v927.termRef(1);
          
          {ESLVal l = $2214;
          
          {ESLVal fs = $2213;
          
          return typesFV1.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v930 = $qualArg;
                
                switch(_v930.termName) {
                case "Dec": {ESLVal $2256 = _v930.termRef(0);
                  ESLVal $2255 = _v930.termRef(1);
                  ESLVal $2254 = _v930.termRef(2);
                  ESLVal $2253 = _v930.termRef(3);
                  
                  {ESLVal _v942 = $2256;
                  
                  {ESLVal n = $2255;
                  
                  {ESLVal _v943 = $2254;
                  
                  {ESLVal dt = $2253;
                  
                  return ESLVal.list(ESLVal.list(_v943));
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v930;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),fv);
        }
        }
        }
      case "RecType": {ESLVal $2212 = _v927.termRef(0);
          ESLVal $2211 = _v927.termRef(1);
          ESLVal $2210 = _v927.termRef(2);
          
          {ESLVal l = $2212;
          
          {ESLVal a = $2211;
          
          {ESLVal _v939 = $2210;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun543"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v940 = $args[0];
          {ESLVal _v929 = _v940;
                
                switch(_v929.termName) {
                case "VarType": {ESLVal $2252 = _v929.termRef(0);
                  ESLVal $2251 = _v929.termRef(1);
                  
                  {ESLVal _v941 = $2252;
                  
                  {ESLVal n = $2251;
                  
                  return n.eql(a).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(76368,76416)").add(ESLVal.list(_v929)));
              }
              }
            }
          }),typeFV1.apply(_v939,$nil)).add(fv);
        }
        }
        }
        }
      case "StrType": {ESLVal $2209 = _v927.termRef(0);
          
          {ESLVal l = $2209;
          
          return fv;
        }
        }
      case "TableType": {ESLVal $2208 = _v927.termRef(0);
          ESLVal $2207 = _v927.termRef(1);
          ESLVal $2206 = _v927.termRef(2);
          
          {ESLVal l = $2208;
          
          {ESLVal k = $2207;
          
          {ESLVal v = $2206;
          
          return typeFV1.apply(k,typeFV1.apply(v,fv));
        }
        }
        }
        }
      case "TypeClosure": {ESLVal $2205 = _v927.termRef(0);
          
          {ESLVal f = $2205;
          
          return $nil;
        }
        }
      case "TermType": {ESLVal $2204 = _v927.termRef(0);
          ESLVal $2203 = _v927.termRef(1);
          ESLVal $2202 = _v927.termRef(2);
          
          {ESLVal l = $2204;
          
          {ESLVal n = $2203;
          
          {ESLVal ts = $2202;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
        }
      case "TypeFun": {ESLVal $2201 = _v927.termRef(0);
          ESLVal $2200 = _v927.termRef(1);
          ESLVal $2199 = _v927.termRef(2);
          
          {ESLVal l = $2201;
          
          {ESLVal ns = $2200;
          
          {ESLVal _v936 = $2199;
          
          return filter.apply(new ESLVal(new Function(new ESLVal("fun544"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal _v937 = $args[0];
          {ESLVal _v928 = _v937;
                
                switch(_v928.termName) {
                case "VarType": {ESLVal $2250 = _v928.termRef(0);
                  ESLVal $2249 = _v928.termRef(1);
                  
                  {ESLVal _v938 = $2250;
                  
                  {ESLVal n = $2249;
                  
                  return member.apply(n,ns).not();
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(76712,76772)").add(ESLVal.list(_v928)));
              }
              }
            }
          }),typeFV1.apply(_v936,$nil)).add(fv);
        }
        }
        }
        }
      case "UnfoldType": {ESLVal $2198 = _v927.termRef(0);
          ESLVal $2197 = _v927.termRef(1);
          
          {ESLVal l = $2198;
          
          {ESLVal _v935 = $2197;
          
          return typeFV1.apply(_v935,fv);
        }
        }
        }
      case "UnionType": {ESLVal $2196 = _v927.termRef(0);
          ESLVal $2195 = _v927.termRef(1);
          
          {ESLVal l = $2196;
          
          {ESLVal ts = $2195;
          
          return typesFV1.apply(ts,fv);
        }
        }
        }
      case "VarType": {ESLVal $2194 = _v927.termRef(0);
          ESLVal $2193 = _v927.termRef(1);
          
          {ESLVal l = $2194;
          
          {ESLVal n = $2193;
          
          return fv.cons(t);
        }
        }
        }
      case "VoidType": {ESLVal $2192 = _v927.termRef(0);
          
          {ESLVal l = $2192;
          
          return fv;
        }
        }
      case "UnionRef": {ESLVal $2191 = _v927.termRef(0);
          ESLVal $2190 = _v927.termRef(1);
          ESLVal $2189 = _v927.termRef(2);
          
          {ESLVal l = $2191;
          
          {ESLVal _v934 = $2190;
          
          {ESLVal n = $2189;
          
          return typeFV1.apply(_v934,fv);
        }
        }
        }
        }
        default: {ESLVal x = _v927;
          
          return error(x);
        }
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(false,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v933 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v933)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {}
        }
        public ESLVal init() {
            return ((Supplier<ESLVal>)() -> { 
                {new Function(new ESLVal("try"),getSelf()) {
                  public ESLVal apply(ESLVal... args) { 
                    try { 
                      return typeCheckModule.apply(new ESLVal("esl/compiler/test1.esl"));
                    } catch(ESLError $exception) {
                      ESLVal $x = $exception.value;
                      {ESLVal _v932 = $x;
                  
                  {ESLVal message = _v932;
                  
                  return print.apply(new ESLVal("Type Error: ").add(message));
                }
                }
                    }
                  }
                }.apply();
                print.apply(new ESLVal("DONE"));
                return stopAll.apply();}
              }).get();
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}