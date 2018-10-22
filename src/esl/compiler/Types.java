package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Types {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal decName = new ESLVal(new Function(new ESLVal("decName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v1304 = d;
        
        switch(_v1304.termName) {
        case "Dec": {ESLVal $1095 = _v1304.termRef(0);
          ESLVal $1094 = _v1304.termRef(1);
          ESLVal $1093 = _v1304.termRef(2);
          ESLVal $1092 = _v1304.termRef(3);
          
          {ESLVal l = $1095;
          
          {ESLVal n = $1094;
          
          {ESLVal t = $1093;
          
          {ESLVal dt = $1092;
          
          return n;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2100,2158)"));
      }
      }
    }
  });
  public static ESLVal decLoc = new ESLVal(new Function(new ESLVal("decLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v1303 = d;
        
        switch(_v1303.termName) {
        case "Dec": {ESLVal $1091 = _v1303.termRef(0);
          ESLVal $1090 = _v1303.termRef(1);
          ESLVal $1089 = _v1303.termRef(2);
          ESLVal $1088 = _v1303.termRef(3);
          
          {ESLVal l = $1091;
          
          {ESLVal n = $1090;
          
          {ESLVal t = $1089;
          
          {ESLVal dt = $1088;
          
          return l;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2185,2243)"));
      }
      }
    }
  });
  public static ESLVal patternNames = new ESLVal(new Function(new ESLVal("patternNames"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal x = $args[0];
  {ESLVal _v1300 = x;
        
        switch(_v1300.termName) {
        case "PVar": {ESLVal $1087 = _v1300.termRef(0);
          ESLVal $1086 = _v1300.termRef(1);
          ESLVal $1085 = _v1300.termRef(2);
          
          {ESLVal v0 = $1087;
          
          {ESLVal v1 = $1086;
          
          {ESLVal v2 = $1085;
          
          return ESLVal.list(v1);
        }
        }
        }
        }
      case "PTerm": {ESLVal $1084 = _v1300.termRef(0);
          ESLVal $1083 = _v1300.termRef(1);
          ESLVal $1082 = _v1300.termRef(2);
          ESLVal $1081 = _v1300.termRef(3);
          
          {ESLVal v0 = $1084;
          
          {ESLVal v1 = $1083;
          
          {ESLVal v2 = $1082;
          
          {ESLVal v3 = $1081;
          
          return new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v1301 = $qualArg;
                
                {ESLVal p = _v1301;
                
                return ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v1307 = $args[0];
                {ESLVal _v1302 = _v1307;
                      
                      {ESLVal n = _v1302;
                      
                      return ESLVal.list(ESLVal.list(n));
                    }
                    }
                  }
                }).map(patternNames.apply(p)).flatten().flatten());
              }
              }
            }
          }).map(v3).flatten().flatten();
        }
        }
        }
        }
        }
      case "PApplyType": {ESLVal $1080 = _v1300.termRef(0);
          ESLVal $1079 = _v1300.termRef(1);
          ESLVal $1078 = _v1300.termRef(2);
          
          {ESLVal v0 = $1080;
          
          {ESLVal v1 = $1079;
          
          {ESLVal v2 = $1078;
          
          return patternNames.apply(v1);
        }
        }
        }
        }
      case "PNil": {ESLVal $1077 = _v1300.termRef(0);
          
          {ESLVal v0 = $1077;
          
          return ESLVal.list();
        }
        }
      case "PNull": {ESLVal $1076 = _v1300.termRef(0);
          
          {ESLVal v0 = $1076;
          
          return ESLVal.list();
        }
        }
      case "PInt": {ESLVal $1075 = _v1300.termRef(0);
          ESLVal $1074 = _v1300.termRef(1);
          
          {ESLVal v0 = $1075;
          
          {ESLVal v1 = $1074;
          
          return ESLVal.list();
        }
        }
        }
      case "PStr": {ESLVal $1073 = _v1300.termRef(0);
          ESLVal $1072 = _v1300.termRef(1);
          
          {ESLVal v0 = $1073;
          
          {ESLVal v1 = $1072;
          
          return ESLVal.list();
        }
        }
        }
      case "PBool": {ESLVal $1071 = _v1300.termRef(0);
          ESLVal $1070 = _v1300.termRef(1);
          
          {ESLVal v0 = $1071;
          
          {ESLVal v1 = $1070;
          
          return ESLVal.list();
        }
        }
        }
      case "PCons": {ESLVal $1069 = _v1300.termRef(0);
          ESLVal $1068 = _v1300.termRef(1);
          ESLVal $1067 = _v1300.termRef(2);
          
          {ESLVal v0 = $1069;
          
          {ESLVal v1 = $1068;
          
          {ESLVal v2 = $1067;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PBagCons": {ESLVal $1066 = _v1300.termRef(0);
          ESLVal $1065 = _v1300.termRef(1);
          ESLVal $1064 = _v1300.termRef(2);
          
          {ESLVal v0 = $1066;
          
          {ESLVal v1 = $1065;
          
          {ESLVal v2 = $1064;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptyBag": {ESLVal $1063 = _v1300.termRef(0);
          
          {ESLVal v0 = $1063;
          
          return ESLVal.list();
        }
        }
      case "PSetCons": {ESLVal $1062 = _v1300.termRef(0);
          ESLVal $1061 = _v1300.termRef(1);
          ESLVal $1060 = _v1300.termRef(2);
          
          {ESLVal v0 = $1062;
          
          {ESLVal v1 = $1061;
          
          {ESLVal v2 = $1060;
          
          return patternNames.apply(v1).add(patternNames.apply(v2));
        }
        }
        }
        }
      case "PEmptySet": {ESLVal $1059 = _v1300.termRef(0);
          
          {ESLVal v0 = $1059;
          
          return ESLVal.list();
        }
        }
        default: return error(new ESLVal("case error at Pos(3443,4142)"));
      }
      }
    }
  });
  public static ESLVal isBinding = new ESLVal(new Function(new ESLVal("isBinding"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1299 = b;
        
        switch(_v1299.termName) {
        case "Binding": {ESLVal $1058 = _v1299.termRef(0);
          ESLVal $1057 = _v1299.termRef(1);
          ESLVal $1056 = _v1299.termRef(2);
          ESLVal $1055 = _v1299.termRef(3);
          ESLVal $1054 = _v1299.termRef(4);
          
          {ESLVal l = $1058;
          
          {ESLVal n = $1057;
          
          {ESLVal t = $1056;
          
          {ESLVal st = $1055;
          
          {ESLVal e = $1054;
          
          return $true;
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v1306 = _v1299;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal isFunBind = new ESLVal(new Function(new ESLVal("isFunBind"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1298 = b;
        
        switch(_v1298.termName) {
        case "FunBind": {ESLVal $1053 = _v1298.termRef(0);
          ESLVal $1052 = _v1298.termRef(1);
          ESLVal $1051 = _v1298.termRef(2);
          ESLVal $1050 = _v1298.termRef(3);
          ESLVal $1049 = _v1298.termRef(4);
          ESLVal $1048 = _v1298.termRef(5);
          ESLVal $1047 = _v1298.termRef(6);
          
          {ESLVal l = $1053;
          
          {ESLVal n = $1052;
          
          {ESLVal args = $1051;
          
          {ESLVal t = $1050;
          
          {ESLVal st = $1049;
          
          {ESLVal g = $1048;
          
          {ESLVal e = $1047;
          
          return $true;
        }
        }
        }
        }
        }
        }
        }
        }
        default: {ESLVal _v1305 = _v1298;
          
          return $false;
        }
      }
      }
    }
  });
  public static ESLVal bindingName = new ESLVal(new Function(new ESLVal("bindingName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1297 = b;
        
        switch(_v1297.termName) {
        case "TypeBind": {ESLVal $1046 = _v1297.termRef(0);
          ESLVal $1045 = _v1297.termRef(1);
          ESLVal $1044 = _v1297.termRef(2);
          ESLVal $1043 = _v1297.termRef(3);
          
          {ESLVal v0 = $1046;
          
          {ESLVal v1 = $1045;
          
          {ESLVal v2 = $1044;
          
          {ESLVal v3 = $1043;
          
          return v1;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $1042 = _v1297.termRef(0);
          ESLVal $1041 = _v1297.termRef(1);
          ESLVal $1040 = _v1297.termRef(2);
          ESLVal $1039 = _v1297.termRef(3);
          
          {ESLVal v0 = $1042;
          
          {ESLVal v1 = $1041;
          
          {ESLVal v2 = $1040;
          
          {ESLVal v3 = $1039;
          
          return v1;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $1038 = _v1297.termRef(0);
          ESLVal $1037 = _v1297.termRef(1);
          ESLVal $1036 = _v1297.termRef(2);
          ESLVal $1035 = _v1297.termRef(3);
          ESLVal $1034 = _v1297.termRef(4);
          ESLVal $1033 = _v1297.termRef(5);
          ESLVal $1032 = _v1297.termRef(6);
          
          {ESLVal v0 = $1038;
          
          {ESLVal v1 = $1037;
          
          {ESLVal v2 = $1036;
          
          {ESLVal v3 = $1035;
          
          {ESLVal v4 = $1034;
          
          {ESLVal v5 = $1033;
          
          {ESLVal v6 = $1032;
          
          return v1;
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $1031 = _v1297.termRef(0);
          ESLVal $1030 = _v1297.termRef(1);
          ESLVal $1029 = _v1297.termRef(2);
          ESLVal $1028 = _v1297.termRef(3);
          ESLVal $1027 = _v1297.termRef(4);
          
          {ESLVal v0 = $1031;
          
          {ESLVal v1 = $1030;
          
          {ESLVal v2 = $1029;
          
          {ESLVal v3 = $1028;
          
          {ESLVal v4 = $1027;
          
          return v1;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $1026 = _v1297.termRef(0);
          ESLVal $1025 = _v1297.termRef(1);
          ESLVal $1024 = _v1297.termRef(2);
          ESLVal $1023 = _v1297.termRef(3);
          
          {ESLVal v0 = $1026;
          
          {ESLVal v1 = $1025;
          
          {ESLVal v2 = $1024;
          
          {ESLVal v3 = $1023;
          
          return v1;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4645,4966)"));
      }
      }
    }
  });
  public static ESLVal bindingLoc = new ESLVal(new Function(new ESLVal("bindingLoc"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal b = $args[0];
  {ESLVal _v1296 = b;
        
        switch(_v1296.termName) {
        case "TypeBind": {ESLVal $1022 = _v1296.termRef(0);
          ESLVal $1021 = _v1296.termRef(1);
          ESLVal $1020 = _v1296.termRef(2);
          ESLVal $1019 = _v1296.termRef(3);
          
          {ESLVal v0 = $1022;
          
          {ESLVal v1 = $1021;
          
          {ESLVal v2 = $1020;
          
          {ESLVal v3 = $1019;
          
          return v0;
        }
        }
        }
        }
        }
      case "CnstrBind": {ESLVal $1018 = _v1296.termRef(0);
          ESLVal $1017 = _v1296.termRef(1);
          ESLVal $1016 = _v1296.termRef(2);
          ESLVal $1015 = _v1296.termRef(3);
          
          {ESLVal v0 = $1018;
          
          {ESLVal v1 = $1017;
          
          {ESLVal v2 = $1016;
          
          {ESLVal v3 = $1015;
          
          return v0;
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $1014 = _v1296.termRef(0);
          ESLVal $1013 = _v1296.termRef(1);
          ESLVal $1012 = _v1296.termRef(2);
          ESLVal $1011 = _v1296.termRef(3);
          ESLVal $1010 = _v1296.termRef(4);
          ESLVal $1009 = _v1296.termRef(5);
          ESLVal $1008 = _v1296.termRef(6);
          
          {ESLVal v0 = $1014;
          
          {ESLVal v1 = $1013;
          
          {ESLVal v2 = $1012;
          
          {ESLVal v3 = $1011;
          
          {ESLVal v4 = $1010;
          
          {ESLVal v5 = $1009;
          
          {ESLVal v6 = $1008;
          
          return v0;
        }
        }
        }
        }
        }
        }
        }
        }
      case "Binding": {ESLVal $1007 = _v1296.termRef(0);
          ESLVal $1006 = _v1296.termRef(1);
          ESLVal $1005 = _v1296.termRef(2);
          ESLVal $1004 = _v1296.termRef(3);
          ESLVal $1003 = _v1296.termRef(4);
          
          {ESLVal v0 = $1007;
          
          {ESLVal v1 = $1006;
          
          {ESLVal v2 = $1005;
          
          {ESLVal v3 = $1004;
          
          {ESLVal v4 = $1003;
          
          return v0;
        }
        }
        }
        }
        }
        }
      case "DataBind": {ESLVal $1002 = _v1296.termRef(0);
          ESLVal $1001 = _v1296.termRef(1);
          ESLVal $1000 = _v1296.termRef(2);
          ESLVal $999 = _v1296.termRef(3);
          
          {ESLVal v0 = $1002;
          
          {ESLVal v1 = $1001;
          
          {ESLVal v2 = $1000;
          
          {ESLVal v3 = $999;
          
          return v0;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4998,5319)"));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}