package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Tables.*;
// import static esl.Lists.*;
import static esl.compiler.Cases.*;
import static esl.compiler.Types.*;
import java.util.function.Supplier;
public class ToJava {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal defToField = new ESLVal(new Function(new ESLVal("defToField"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v59 = d;
        
        switch(_v59.termName) {
        case "Binding": {ESLVal $481 = _v59.termRef(0);
          ESLVal $480 = _v59.termRef(1);
          ESLVal $479 = _v59.termRef(2);
          ESLVal $478 = _v59.termRef(3);
          ESLVal $477 = _v59.termRef(4);
          
          {ESLVal l = $481;
          
          {ESLVal n = $480;
          
          {ESLVal t = $479;
          
          {ESLVal st = $478;
          
          {ESLVal e = $477;
          
          return new ESLVal("JField",n,$null,expToJExp.apply(e));
        }
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $474 = _v59.termRef(0);
          ESLVal $473 = _v59.termRef(1);
          ESLVal $472 = _v59.termRef(2);
          ESLVal $471 = _v59.termRef(3);
          ESLVal $470 = _v59.termRef(4);
          ESLVal $469 = _v59.termRef(5);
          ESLVal $468 = _v59.termRef(6);
          
          switch($468.termName) {
          case "BoolExp": {ESLVal $476 = $468.termRef(0);
            ESLVal $475 = $468.termRef(1);
            
            switch($475.boolVal ? 1 : 0) {
            case 1: {ESLVal l = $474;
              
              {ESLVal n = $473;
              
              {ESLVal args = $472;
              
              {ESLVal t = $471;
              
              {ESLVal st = $470;
              
              {ESLVal e = $469;
              
              {ESLVal bl = $476;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v60 = $qualArg;
                      
                      switch(_v60.termName) {
                      case "PVar": {ESLVal $484 = _v60.termRef(0);
                        ESLVal $483 = _v60.termRef(1);
                        ESLVal $482 = _v60.termRef(2);
                        
                        {ESLVal _v138 = $484;
                        
                        {ESLVal _v139 = $483;
                        
                        {ESLVal _v140 = $482;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v138,_v139,_v140,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v60;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(args).flatten().flatten();
              
              return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,e)));
            }
            }
            }
            }
            }
            }
            }
            }
            default: {ESLVal l = $474;
              
              {ESLVal n = $473;
              
              {ESLVal args = $472;
              
              {ESLVal t = $471;
              
              {ESLVal st = $470;
              
              {ESLVal e = $469;
              
              {ESLVal g = $468;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v61 = $qualArg;
                      
                      switch(_v61.termName) {
                      case "PVar": {ESLVal $487 = _v61.termRef(0);
                        ESLVal $486 = _v61.termRef(1);
                        ESLVal $485 = _v61.termRef(2);
                        
                        {ESLVal _v141 = $487;
                        
                        {ESLVal _v142 = $486;
                        
                        {ESLVal _v143 = $485;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v141,_v142,_v143,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v61;
                        
                        return ESLVal.list();
                      }
                    }
                    }
                  }
                }).map(args).flatten().flatten();
              
              return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
          default: {ESLVal l = $474;
            
            {ESLVal n = $473;
            
            {ESLVal args = $472;
            
            {ESLVal t = $471;
            
            {ESLVal st = $470;
            
            {ESLVal e = $469;
            
            {ESLVal g = $468;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v62 = $qualArg;
                    
                    switch(_v62.termName) {
                    case "PVar": {ESLVal $490 = _v62.termRef(0);
                      ESLVal $489 = _v62.termRef(1);
                      ESLVal $488 = _v62.termRef(2);
                      
                      {ESLVal _v144 = $490;
                      
                      {ESLVal _v145 = $489;
                      
                      {ESLVal _v146 = $488;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v144,_v145,_v146,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v62;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(args).flatten().flatten();
            
            return new ESLVal("JField",n,$null,expToJExp.apply(new ESLVal("FunExp",l,new ESLVal("StrExp",l,n),formals,t,new ESLVal("If",l,g,e,new ESLVal("Throw",l,t,new ESLVal("StrExp",l,new ESLVal("guard failed for ").add(n)))))));
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
        default: return error(new ESLVal("case error at Pos(172,825)").add(ESLVal.list(_v59)));
      }
      }
    }
  });
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v58 = d;
        
        switch(_v58.termName) {
        case "Dec": {ESLVal $467 = _v58.termRef(0);
          ESLVal $466 = _v58.termRef(1);
          ESLVal $465 = _v58.termRef(2);
          ESLVal $464 = _v58.termRef(3);
          
          {ESLVal l = $467;
          
          {ESLVal n = $466;
          
          {ESLVal t = $465;
          
          {ESLVal st = $464;
          
          return new ESLVal("JDec",n,$null);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(869,945)").add(ESLVal.list(_v58)));
      }
      }
    }
  });
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cs = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v57 = cs;
        
        if(_v57.isCons())
        {ESLVal $460 = _v57.head();
          ESLVal $461 = _v57.tail();
          
          if($461.isCons())
          {ESLVal $462 = $461.head();
            ESLVal $463 = $461.tail();
            
            {ESLVal c = $460;
            
            {ESLVal _v136 = $461;
            
            return expsToJCommands.apply(_v136,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
          }
        else if($461.isNil())
          {ESLVal c = $460;
            
            return ESLVal.list(expToJCommand.apply(c,isLast));
          }
        else {ESLVal c = $460;
            
            {ESLVal _v137 = $461;
            
            return expsToJCommands.apply(_v137,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
        }
      else if(_v57.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1004,1164)").add(ESLVal.list(_v57)));
      }
    }
  });
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v51 = c;
        
        switch(_v51.termName) {
        case "Block": {ESLVal $455 = _v51.termRef(0);
          ESLVal $454 = _v51.termRef(1);
          
          if($454.isCons())
          {ESLVal $456 = $454.head();
            ESLVal $457 = $454.tail();
            
            if($457.isCons())
            {ESLVal $458 = $457.head();
              ESLVal $459 = $457.tail();
              
              {ESLVal l = $455;
              
              {ESLVal es = $454;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v54 = $qualArg;
                    
                    {ESLVal e = _v54;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
            }
          else if($457.isNil())
            {ESLVal l = $455;
              
              {ESLVal e = $456;
              
              return expToJCommand.apply(e,isLast);
            }
            }
          else {ESLVal l = $455;
              
              {ESLVal es = $454;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v55 = $qualArg;
                    
                    {ESLVal e = _v55;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
          }
        else if($454.isNil())
          {ESLVal l = $455;
            
            if(isLast.boolVal)
            return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
            else
              {ESLVal _v134 = $455;
                
                return new ESLVal("JBlock",$nil);
              }
          }
        else {ESLVal l = $455;
            
            {ESLVal es = $454;
            
            return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v56 = $qualArg;
                  
                  {ESLVal e = _v56;
                  
                  return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                }
                }
              }
            }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
          }
          }
        }
      case "Update": {ESLVal $453 = _v51.termRef(0);
          ESLVal $452 = _v51.termRef(1);
          ESLVal $451 = _v51.termRef(2);
          
          {ESLVal l = $453;
          
          {ESLVal n = $452;
          
          {ESLVal e = $451;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp.apply(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v131 = $453;
              
              {ESLVal _v132 = $452;
              
              {ESLVal _v133 = $451;
              
              return new ESLVal("JUpdate",_v132,expToJExp.apply(_v133));
            }
            }
            }
        }
        }
        }
        }
      case "If": {ESLVal $450 = _v51.termRef(0);
          ESLVal $449 = _v51.termRef(1);
          ESLVal $448 = _v51.termRef(2);
          ESLVal $447 = _v51.termRef(3);
          
          {ESLVal l = $450;
          
          {ESLVal e1 = $449;
          
          {ESLVal e2 = $448;
          
          {ESLVal e3 = $447;
          
          return new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,isLast),expToJCommand.apply(e3,isLast));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $446 = _v51.termRef(0);
          ESLVal $445 = _v51.termRef(1);
          ESLVal $444 = _v51.termRef(2);
          ESLVal $443 = _v51.termRef(3);
          ESLVal $442 = _v51.termRef(4);
          
          {ESLVal l = $446;
          
          {ESLVal e = $445;
          
          {ESLVal cons = $444;
          
          {ESLVal nil = $443;
          
          {ESLVal alt = $442;
          
          return new ESLVal("JCaseList",expToJExp.apply(e),expToJCommand.apply(cons,isLast),expToJCommand.apply(nil,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $441 = _v51.termRef(0);
          ESLVal $440 = _v51.termRef(1);
          ESLVal $439 = _v51.termRef(2);
          ESLVal $438 = _v51.termRef(3);
          
          {ESLVal l = $441;
          
          {ESLVal e = $440;
          
          {ESLVal arms = $439;
          
          {ESLVal alt = $438;
          
          return new ESLVal("JCaseTerm",expToJExp.apply(e),termArmsToJTermArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $437 = _v51.termRef(0);
          ESLVal $436 = _v51.termRef(1);
          ESLVal $435 = _v51.termRef(2);
          ESLVal $434 = _v51.termRef(3);
          
          {ESLVal l = $437;
          
          {ESLVal e = $436;
          
          {ESLVal arms = $435;
          
          {ESLVal alt = $434;
          
          return new ESLVal("JCaseInt",expToJExp.apply(e),intArmsToJIntArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $433 = _v51.termRef(0);
          ESLVal $432 = _v51.termRef(1);
          ESLVal $431 = _v51.termRef(2);
          ESLVal $430 = _v51.termRef(3);
          
          {ESLVal l = $433;
          
          {ESLVal e = $432;
          
          {ESLVal arms = $431;
          
          {ESLVal alt = $430;
          
          return new ESLVal("JCaseStr",expToJExp.apply(e),strArmsToJStrArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $429 = _v51.termRef(0);
          ESLVal $428 = _v51.termRef(1);
          ESLVal $427 = _v51.termRef(2);
          ESLVal $426 = _v51.termRef(3);
          
          {ESLVal l = $429;
          
          {ESLVal e = $428;
          
          {ESLVal arms = $427;
          
          {ESLVal alt = $426;
          
          return new ESLVal("JCaseBool",expToJExp.apply(e),boolArmsToJBoolArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $425 = _v51.termRef(0);
          ESLVal $424 = _v51.termRef(1);
          ESLVal $423 = _v51.termRef(2);
          
          {ESLVal l = $425;
          
          {ESLVal bs = $424;
          
          {ESLVal e = $423;
          
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v53 = $qualArg;
                
                {ESLVal b = _v53;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
      case "Letrec": {ESLVal $422 = _v51.termRef(0);
          ESLVal $421 = _v51.termRef(1);
          ESLVal $420 = _v51.termRef(2);
          
          {ESLVal l = $422;
          
          {ESLVal bs = $421;
          
          {ESLVal e = $420;
          
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v52 = $qualArg;
                
                {ESLVal b = _v52;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,$true));
        }
        }
        }
        }
      case "For": {ESLVal $416 = _v51.termRef(0);
          ESLVal $415 = _v51.termRef(1);
          ESLVal $414 = _v51.termRef(2);
          ESLVal $413 = _v51.termRef(3);
          
          switch($415.termName) {
          case "PVar": {ESLVal $419 = $415.termRef(0);
            ESLVal $418 = $415.termRef(1);
            ESLVal $417 = $415.termRef(2);
            
            {ESLVal l1 = $416;
            
            {ESLVal l2 = $419;
            
            {ESLVal n = $418;
            
            {ESLVal t = $417;
            
            {ESLVal e = $414;
            
            {ESLVal b = $413;
            
            if(isLast.boolVal)
            return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName.apply(),n,expToJExp.apply(e),expToJCommand.apply(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
            else
              {ESLVal _v125 = $416;
                
                {ESLVal _v126 = $419;
                
                {ESLVal _v127 = $418;
                
                {ESLVal _v128 = $417;
                
                {ESLVal _v129 = $414;
                
                {ESLVal _v130 = $413;
                
                return new ESLVal("JFor",newName.apply(),_v127,expToJExp.apply(_v129),expToJCommand.apply(_v130,$false));
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
          default: {ESLVal l = $416;
            
            {ESLVal p = $415;
            
            {ESLVal e = $414;
            
            {ESLVal b = $413;
            
            {ESLVal opName = newName.apply();
            ESLVal varName = newName.apply();
            
            return expToJCommand.apply(new ESLVal("For",l,new ESLVal("PVar",l,varName,$null),e,new ESLVal("Let",l,ESLVal.list(new ESLVal("Binding",l,opName,$null,$null,new ESLVal("FunExp",l,new ESLVal("StrExp",l,new ESLVal("forp")),ESLVal.list(),$null,new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,varName)),ESLVal.list(new ESLVal("BArm",l,ESLVal.list(p),new ESLVal("BoolExp",l,$true),b),new ESLVal("BArm",l,ESLVal.list(new ESLVal("PVar",l,new ESLVal("$$$"),$null)),new ESLVal("BoolExp",l,$true),new ESLVal("Block",l,ESLVal.list()))))))),new ESLVal("Apply",l,new ESLVal("Var",l,opName),ESLVal.list()))),isLast);
          }
          }
          }
          }
          }
        }
        }
        default: {ESLVal e = _v51;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",expToJExp.apply(e));
          else
            {ESLVal _v135 = _v51;
              
              return new ESLVal("JStatement",expToJExp.apply(_v135));
            }
        }
      }
      }
    }
  });
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal es = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun1911"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal e = $args[0];
        return expToJExp.apply(e);
          }
        }),es);
    }
  });
  private static ESLVal termArmsToJTermArms = new ESLVal(new Function(new ESLVal("termArmsToJTermArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v50 = arms;
        
        if(_v50.isCons())
        {ESLVal $409 = _v50.head();
          ESLVal $410 = _v50.tail();
          
          switch($409.termName) {
          case "TArm": {ESLVal $412 = $409.termRef(0);
            ESLVal $411 = $409.termRef(1);
            
            {ESLVal n = $412;
            
            {ESLVal e = $411;
            
            {ESLVal _v124 = $410;
            
            return termArmsToJTermArms.apply(_v124,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4226,4395)").add(ESLVal.list(_v50)));
        }
        }
      else if(_v50.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4226,4395)").add(ESLVal.list(_v50)));
      }
    }
  });
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v49 = arms;
        
        if(_v49.isCons())
        {ESLVal $405 = _v49.head();
          ESLVal $406 = _v49.tail();
          
          switch($405.termName) {
          case "IArm": {ESLVal $408 = $405.termRef(0);
            ESLVal $407 = $405.termRef(1);
            
            {ESLVal n = $408;
            
            {ESLVal e = $407;
            
            {ESLVal _v123 = $406;
            
            return intArmsToJIntArms.apply(_v123,isLast).cons(new ESLVal("JIArm",n,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4464,4628)").add(ESLVal.list(_v49)));
        }
        }
      else if(_v49.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4464,4628)").add(ESLVal.list(_v49)));
      }
    }
  });
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v48 = arms;
        
        if(_v48.isCons())
        {ESLVal $401 = _v48.head();
          ESLVal $402 = _v48.tail();
          
          switch($401.termName) {
          case "SArm": {ESLVal $404 = $401.termRef(0);
            ESLVal $403 = $401.termRef(1);
            
            {ESLVal s = $404;
            
            {ESLVal e = $403;
            
            {ESLVal _v122 = $402;
            
            return strArmsToJStrArms.apply(_v122,isLast).cons(new ESLVal("JSArm",s,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4697,4861)").add(ESLVal.list(_v48)));
        }
        }
      else if(_v48.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4697,4861)").add(ESLVal.list(_v48)));
      }
    }
  });
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v47 = arms;
        
        if(_v47.isCons())
        {ESLVal $397 = _v47.head();
          ESLVal $398 = _v47.tail();
          
          switch($397.termName) {
          case "BoolArm": {ESLVal $400 = $397.termRef(0);
            ESLVal $399 = $397.termRef(1);
            
            {ESLVal b = $400;
            
            {ESLVal e = $399;
            
            {ESLVal _v121 = $398;
            
            return boolArmsToJBoolArms.apply(_v121,isLast).cons(new ESLVal("JBArm",b,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4936,5109)").add(ESLVal.list(_v47)));
        }
        }
      else if(_v47.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4936,5109)").add(ESLVal.list(_v47)));
      }
    }
  });
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal op = $args[0];
  {ESLVal _v46 = op;
        
        switch(_v46.strVal) {
        case "+": return new ESLVal("add");
      case "-": return new ESLVal("sub");
      case "*": return new ESLVal("mul");
      case "/": return new ESLVal("div");
      case "%": return new ESLVal("mod");
      case ">": return new ESLVal("gre");
      case ">=": return new ESLVal("greql");
      case "<": return new ESLVal("less");
      case "<=": return new ESLVal("lesseql");
      case "=": return new ESLVal("eql");
      case "<>": return new ESLVal("neql");
      case ":": return new ESLVal("cons");
      case "..": return new ESLVal("to");
      case "or": return new ESLVal("or");
      case "and": return new ESLVal("and");
      case "andalso": return new ESLVal("andalso");
      case "orelse": return new ESLVal("orelse");
        default: return error(new ESLVal("case error at Pos(5137,5489)").add(ESLVal.list(_v46)));
      }
      }
    }
  });
  private static ESLVal caseToJExp = new ESLVal(new Function(new ESLVal("caseToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal l = $args[0];
  ESLVal es = $args[1];
  ESLVal arms = $args[2];
  {ESLVal bindings = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v43 = $qualArg;
                
                {ESLVal e = _v43;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Binding",l,newName.apply(),$null,$null,e)));
              }
              }
            }
          }).map(es).flatten().flatten();
        
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v44 = $qualArg;
                
                switch(_v44.termName) {
                case "Binding": {ESLVal $396 = _v44.termRef(0);
                  ESLVal $395 = _v44.termRef(1);
                  ESLVal $394 = _v44.termRef(2);
                  ESLVal $393 = _v44.termRef(3);
                  ESLVal $392 = _v44.termRef(4);
                  
                  {ESLVal _v120 = $396;
                  
                  {ESLVal n = $395;
                  
                  {ESLVal dt = $394;
                  
                  {ESLVal t = $393;
                  
                  {ESLVal e = $392;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v44;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bindings).flatten().flatten();
        
        return expToJExp.apply(new ESLVal("Let",l,bindings,translateCases.apply(new ESLVal("Case",l,ESLVal.list(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v45 = $qualArg;
              
              {ESLVal n = _v45;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Var",l,n)));
            }
            }
          }
        }).map(names).flatten().flatten(),arms))));
      }
      }
    }
  });
  private static ESLVal expToJExp = new ESLVal(new Function(new ESLVal("expToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v41 = e;
        
        switch(_v41.termName) {
        case "ArrayUpdate": {ESLVal $391 = _v41.termRef(0);
          ESLVal $390 = _v41.termRef(1);
          ESLVal $389 = _v41.termRef(2);
          ESLVal $388 = _v41.termRef(3);
          
          {ESLVal l = $391;
          
          {ESLVal a = $390;
          
          {ESLVal i = $389;
          
          {ESLVal v = $388;
          
          return new ESLVal("JArrayUpdate",expToJExp.apply(a),expToJExp.apply(i),expToJExp.apply(v));
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $387 = _v41.termRef(0);
          ESLVal $386 = _v41.termRef(1);
          ESLVal $385 = _v41.termRef(2);
          
          {ESLVal l = $387;
          
          {ESLVal a = $386;
          
          {ESLVal i = $385;
          
          return new ESLVal("JArrayRef",expToJExp.apply(a),expToJExp.apply(i));
        }
        }
        }
        }
      case "IntExp": {ESLVal $384 = _v41.termRef(0);
          ESLVal $383 = _v41.termRef(1);
          
          {ESLVal l = $384;
          
          {ESLVal n = $383;
          
          return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
        }
        }
        }
      case "StrExp": {ESLVal $382 = _v41.termRef(0);
          ESLVal $381 = _v41.termRef(1);
          
          {ESLVal l = $382;
          
          {ESLVal s = $381;
          
          return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
        }
        }
        }
      case "BoolExp": {ESLVal $380 = _v41.termRef(0);
          ESLVal $379 = _v41.termRef(1);
          
          {ESLVal l = $380;
          
          {ESLVal b = $379;
          
          return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
        }
        }
        }
      case "FloatExp": {ESLVal $378 = _v41.termRef(0);
          ESLVal $377 = _v41.termRef(1);
          
          {ESLVal l = $378;
          
          {ESLVal f = $377;
          
          return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $363 = _v41.termRef(0);
          ESLVal $362 = _v41.termRef(1);
          ESLVal $361 = _v41.termRef(2);
          
          switch($362.termName) {
          case "List": {ESLVal $370 = $362.termRef(0);
            ESLVal $369 = $362.termRef(1);
            
            if($369.isCons())
            {ESLVal $371 = $369.head();
              ESLVal $372 = $369.tail();
              
              {ESLVal l = $363;
              
              {ESLVal _v113 = $362;
              
              {ESLVal ts = $361;
              
              return expToJExp.apply(_v113);
            }
            }
            }
            }
          else if($369.isNil())
            if($361.isCons())
              {ESLVal $373 = $361.head();
                ESLVal $374 = $361.tail();
                
                if($374.isCons())
                {ESLVal $375 = $374.head();
                  ESLVal $376 = $374.tail();
                  
                  {ESLVal l = $363;
                  
                  {ESLVal _v114 = $362;
                  
                  {ESLVal ts = $361;
                  
                  return expToJExp.apply(_v114);
                }
                }
                }
                }
              else if($374.isNil())
                {ESLVal l1 = $363;
                  
                  {ESLVal l2 = $370;
                  
                  {ESLVal t = $373;
                  
                  return new ESLVal("JNil",$null);
                }
                }
                }
              else {ESLVal l = $363;
                  
                  {ESLVal _v115 = $362;
                  
                  {ESLVal ts = $361;
                  
                  return expToJExp.apply(_v115);
                }
                }
                }
              }
            else if($361.isNil())
              {ESLVal l = $363;
                
                {ESLVal _v116 = $362;
                
                {ESLVal ts = $361;
                
                return expToJExp.apply(_v116);
              }
              }
              }
            else {ESLVal l = $363;
                
                {ESLVal _v117 = $362;
                
                {ESLVal ts = $361;
                
                return expToJExp.apply(_v117);
              }
              }
              }
          else {ESLVal l = $363;
              
              {ESLVal _v118 = $362;
              
              {ESLVal ts = $361;
              
              return expToJExp.apply(_v118);
            }
            }
            }
          }
        case "NullExp": {ESLVal $364 = $362.termRef(0);
            
            if($361.isCons())
            {ESLVal $365 = $361.head();
              ESLVal $366 = $361.tail();
              
              if($366.isCons())
              {ESLVal $367 = $366.head();
                ESLVal $368 = $366.tail();
                
                {ESLVal l = $363;
                
                {ESLVal _v109 = $362;
                
                {ESLVal ts = $361;
                
                return expToJExp.apply(_v109);
              }
              }
              }
              }
            else if($366.isNil())
              {ESLVal l1 = $363;
                
                {ESLVal l2 = $364;
                
                {ESLVal t = $365;
                
                return new ESLVal("JNull",new ESLVal[]{});
              }
              }
              }
            else {ESLVal l = $363;
                
                {ESLVal _v110 = $362;
                
                {ESLVal ts = $361;
                
                return expToJExp.apply(_v110);
              }
              }
              }
            }
          else if($361.isNil())
            {ESLVal l = $363;
              
              {ESLVal _v111 = $362;
              
              {ESLVal ts = $361;
              
              return expToJExp.apply(_v111);
            }
            }
            }
          else {ESLVal l = $363;
              
              {ESLVal _v112 = $362;
              
              {ESLVal ts = $361;
              
              return expToJExp.apply(_v112);
            }
            }
            }
          }
          default: {ESLVal l = $363;
            
            {ESLVal _v119 = $362;
            
            {ESLVal ts = $361;
            
            return expToJExp.apply(_v119);
          }
          }
          }
        }
        }
      case "List": {ESLVal $360 = _v41.termRef(0);
          ESLVal $359 = _v41.termRef(1);
          
          {ESLVal l = $360;
          
          {ESLVal es = $359;
          
          return new ESLVal("JList",$null,expsToJExps.apply(es));
        }
        }
        }
      case "Term": {ESLVal $358 = _v41.termRef(0);
          ESLVal $357 = _v41.termRef(1);
          ESLVal $356 = _v41.termRef(2);
          ESLVal $355 = _v41.termRef(3);
          
          {ESLVal l = $358;
          
          {ESLVal n = $357;
          
          {ESLVal ts = $356;
          
          {ESLVal es = $355;
          
          return new ESLVal("JTerm",n,expsToJExps.apply(es));
        }
        }
        }
        }
        }
      case "Case": {ESLVal $354 = _v41.termRef(0);
          ESLVal $353 = _v41.termRef(1);
          ESLVal $352 = _v41.termRef(2);
          ESLVal $351 = _v41.termRef(3);
          
          {ESLVal l = $354;
          
          {ESLVal ds = $353;
          
          {ESLVal es = $352;
          
          {ESLVal arms = $351;
          
          return caseToJExp.apply(l,es,arms);
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $350 = _v41.termRef(0);
          ESLVal $349 = _v41.termRef(1);
          ESLVal $348 = _v41.termRef(2);
          ESLVal $347 = _v41.termRef(3);
          ESLVal $346 = _v41.termRef(4);
          
          {ESLVal l = $350;
          
          {ESLVal list = $349;
          
          {ESLVal cons = $348;
          
          {ESLVal nil = $347;
          
          {ESLVal alt = $346;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $345 = _v41.termRef(0);
          ESLVal $344 = _v41.termRef(1);
          ESLVal $343 = _v41.termRef(2);
          ESLVal $342 = _v41.termRef(3);
          
          {ESLVal l = $345;
          
          {ESLVal list = $344;
          
          {ESLVal arms = $343;
          
          {ESLVal alt = $342;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $341 = _v41.termRef(0);
          ESLVal $340 = _v41.termRef(1);
          ESLVal $339 = _v41.termRef(2);
          ESLVal $338 = _v41.termRef(3);
          
          {ESLVal l = $341;
          
          {ESLVal s = $340;
          
          {ESLVal arms = $339;
          
          {ESLVal alt = $338;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $337 = _v41.termRef(0);
          ESLVal $336 = _v41.termRef(1);
          ESLVal $335 = _v41.termRef(2);
          ESLVal $334 = _v41.termRef(3);
          
          {ESLVal l = $337;
          
          {ESLVal s = $336;
          
          {ESLVal arms = $335;
          
          {ESLVal alt = $334;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Head": {ESLVal $333 = _v41.termRef(0);
          
          {ESLVal _v108 = $333;
          
          return new ESLVal("JHead",expToJExp.apply(_v108));
        }
        }
      case "Tail": {ESLVal $332 = _v41.termRef(0);
          
          {ESLVal _v107 = $332;
          
          return new ESLVal("JTail",expToJExp.apply(_v107));
        }
        }
      case "CaseError": {ESLVal $331 = _v41.termRef(0);
          ESLVal $330 = _v41.termRef(1);
          
          {ESLVal l = $331;
          
          {ESLVal _v106 = $330;
          
          return new ESLVal("JError",new ESLVal("JBinExp",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))),new ESLVal("add"),expToJExp.apply(_v106)));
        }
        }
        }
      case "NullExp": {ESLVal $329 = _v41.termRef(0);
          
          {ESLVal l = $329;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
        }
      case "Var": {ESLVal $328 = _v41.termRef(0);
          ESLVal $327 = _v41.termRef(1);
          
          {ESLVal l = $328;
          
          {ESLVal n = $327;
          
          return new ESLVal("JVar",n,$null);
        }
        }
        }
      case "Let": {ESLVal $326 = _v41.termRef(0);
          ESLVal $325 = _v41.termRef(1);
          ESLVal $324 = _v41.termRef(2);
          
          {ESLVal l = $326;
          
          {ESLVal bs = $325;
          
          {ESLVal body = $324;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Letrec": {ESLVal $323 = _v41.termRef(0);
          ESLVal $322 = _v41.termRef(1);
          ESLVal $321 = _v41.termRef(2);
          
          {ESLVal l = $323;
          
          {ESLVal bs = $322;
          
          {ESLVal body = $321;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Throw": {ESLVal $320 = _v41.termRef(0);
          ESLVal $319 = _v41.termRef(1);
          ESLVal $318 = _v41.termRef(2);
          
          {ESLVal l = $320;
          
          {ESLVal t = $319;
          
          {ESLVal _v105 = $318;
          
          return new ESLVal("JError",expToJExp.apply(_v105));
        }
        }
        }
        }
      case "Apply": {ESLVal $317 = _v41.termRef(0);
          ESLVal $316 = _v41.termRef(1);
          ESLVal $315 = _v41.termRef(2);
          
          {ESLVal l = $317;
          
          {ESLVal op = $316;
          
          {ESLVal args = $315;
          
          return new ESLVal("JApply",expToJExp.apply(op),expsToJExps.apply(args));
        }
        }
        }
        }
      case "BinExp": {ESLVal $314 = _v41.termRef(0);
          ESLVal $313 = _v41.termRef(1);
          ESLVal $312 = _v41.termRef(2);
          ESLVal $311 = _v41.termRef(3);
          
          {ESLVal l = $314;
          
          {ESLVal e1 = $313;
          
          {ESLVal op = $312;
          
          {ESLVal e2 = $311;
          
          return new ESLVal("JBinExp",expToJExp.apply(e1),opToJOp.apply(op),expToJExp.apply(e2));
        }
        }
        }
        }
        }
      case "Become": {ESLVal $307 = _v41.termRef(0);
          ESLVal $306 = _v41.termRef(1);
          
          switch($306.termName) {
          case "Apply": {ESLVal $310 = $306.termRef(0);
            ESLVal $309 = $306.termRef(1);
            ESLVal $308 = $306.termRef(2);
            
            {ESLVal l = $307;
            
            {ESLVal al = $310;
            
            {ESLVal b = $309;
            
            {ESLVal args = $308;
            
            return new ESLVal("JBecome",expToJExp.apply(b),expsToJExps.apply(args));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5847,13487)").add(ESLVal.list(_v41)));
        }
        }
      case "Block": {ESLVal $301 = _v41.termRef(0);
          ESLVal $300 = _v41.termRef(1);
          
          if($300.isCons())
          {ESLVal $302 = $300.head();
            ESLVal $303 = $300.tail();
            
            if($303.isCons())
            {ESLVal $304 = $303.head();
              ESLVal $305 = $303.tail();
              
              {ESLVal l = $301;
              
              {ESLVal es = $300;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
            }
          else if($303.isNil())
            {ESLVal l = $301;
              
              {ESLVal _v104 = $302;
              
              return expToJExp.apply(_v104);
            }
            }
          else {ESLVal l = $301;
              
              {ESLVal es = $300;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
          }
        else if($300.isNil())
          {ESLVal l = $301;
            
            return new ESLVal("JNull",new ESLVal[]{});
          }
        else {ESLVal l = $301;
            
            {ESLVal es = $300;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
          }
          }
        }
      case "If": {ESLVal $299 = _v41.termRef(0);
          ESLVal $298 = _v41.termRef(1);
          ESLVal $297 = _v41.termRef(2);
          ESLVal $296 = _v41.termRef(3);
          
          {ESLVal l = $299;
          
          {ESLVal e1 = $298;
          
          {ESLVal e2 = $297;
          
          {ESLVal e3 = $296;
          
          return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,$true),expToJCommand.apply(e3,$true)),$null);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $295 = _v41.termRef(0);
          ESLVal $294 = _v41.termRef(1);
          ESLVal $293 = _v41.termRef(2);
          ESLVal $292 = _v41.termRef(3);
          ESLVal $291 = _v41.termRef(4);
          
          {ESLVal l = $295;
          
          {ESLVal n = $294;
          
          {ESLVal args = $293;
          
          {ESLVal t = $292;
          
          {ESLVal body = $291;
          
          return new ESLVal("JFun",expToJExp.apply(n),map.apply(new ESLVal(new Function(new ESLVal("fun1912"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return decToJDec.apply(d);
            }
          }),args),new ESLVal("JFunType",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v42 = $qualArg;
                
                {ESLVal a = _v42;
                
                return ESLVal.list(ESLVal.list($null));
              }
              }
            }
          }).map(args).flatten().flatten(),$null),expToJCommand.apply(body,$true));
        }
        }
        }
        }
        }
        }
      case "TermRef": {ESLVal $290 = _v41.termRef(0);
          ESLVal $289 = _v41.termRef(1);
          
          {ESLVal _v103 = $290;
          
          {ESLVal i = $289;
          
          return new ESLVal("JTermRef",expToJExp.apply(_v103),i);
        }
        }
        }
      case "Cmp": {ESLVal $288 = _v41.termRef(0);
          ESLVal $287 = _v41.termRef(1);
          ESLVal $286 = _v41.termRef(2);
          
          {ESLVal l = $288;
          
          {ESLVal _v102 = $287;
          
          {ESLVal qs = $286;
          
          return cmpToJExp.apply(_v102,qs);
        }
        }
        }
        }
      case "Not": {ESLVal $285 = _v41.termRef(0);
          ESLVal $284 = _v41.termRef(1);
          
          {ESLVal l = $285;
          
          {ESLVal _v101 = $284;
          
          return new ESLVal("JNot",expToJExp.apply(_v101));
        }
        }
        }
      case "New": {ESLVal $283 = _v41.termRef(0);
          ESLVal $282 = _v41.termRef(1);
          ESLVal $281 = _v41.termRef(2);
          
          {ESLVal l = $283;
          
          {ESLVal b = $282;
          
          {ESLVal args = $281;
          
          return new ESLVal("JNew",expToJExp.apply(b),expsToJExps.apply(args));
        }
        }
        }
        }
      case "NewArray": {ESLVal $280 = _v41.termRef(0);
          ESLVal $279 = _v41.termRef(1);
          ESLVal $278 = _v41.termRef(2);
          
          {ESLVal l = $280;
          
          {ESLVal t = $279;
          
          {ESLVal i = $278;
          
          return new ESLVal("JNewArray",expToJExp.apply(i));
        }
        }
        }
        }
      case "NewJava": {ESLVal $277 = _v41.termRef(0);
          ESLVal $276 = _v41.termRef(1);
          ESLVal $275 = _v41.termRef(2);
          ESLVal $274 = _v41.termRef(3);
          
          {ESLVal l = $277;
          
          {ESLVal n = $276;
          
          {ESLVal t = $275;
          
          {ESLVal args = $274;
          
          return new ESLVal("JNewJava",n,expsToJExps.apply(args));
        }
        }
        }
        }
        }
      case "NewTable": {ESLVal $273 = _v41.termRef(0);
          ESLVal $272 = _v41.termRef(1);
          ESLVal $271 = _v41.termRef(2);
          
          {ESLVal l = $273;
          
          {ESLVal key = $272;
          
          {ESLVal value = $271;
          
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
        }
        }
        }
      case "Send": {ESLVal $266 = _v41.termRef(0);
          ESLVal $265 = _v41.termRef(1);
          ESLVal $264 = _v41.termRef(2);
          
          switch($264.termName) {
          case "Term": {ESLVal $270 = $264.termRef(0);
            ESLVal $269 = $264.termRef(1);
            ESLVal $268 = $264.termRef(2);
            ESLVal $267 = $264.termRef(3);
            
            {ESLVal l = $266;
            
            {ESLVal a = $265;
            
            {ESLVal lt = $270;
            
            {ESLVal n = $269;
            
            {ESLVal ts = $268;
            
            {ESLVal es = $267;
            
            return new ESLVal("JSend",expToJExp.apply(a),n,expsToJExps.apply(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5847,13487)").add(ESLVal.list(_v41)));
        }
        }
      case "SendTimeSuper": {ESLVal $263 = _v41.termRef(0);
          
          {ESLVal l = $263;
          
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
        }
      case "SendSuper": {ESLVal $262 = _v41.termRef(0);
          ESLVal $261 = _v41.termRef(1);
          
          {ESLVal l = $262;
          
          {ESLVal _v100 = $261;
          
          return new ESLVal("JSendSuper",expToJExp.apply(_v100));
        }
        }
        }
      case "Self": {ESLVal $260 = _v41.termRef(0);
          
          {ESLVal l = $260;
          
          return new ESLVal("JSelf",new ESLVal[]{});
        }
        }
      case "Fold": {ESLVal $259 = _v41.termRef(0);
          ESLVal $258 = _v41.termRef(1);
          ESLVal $257 = _v41.termRef(2);
          
          {ESLVal l = $259;
          
          {ESLVal t = $258;
          
          {ESLVal _v99 = $257;
          
          return expToJExp.apply(_v99);
        }
        }
        }
        }
      case "Now": {ESLVal $256 = _v41.termRef(0);
          
          {ESLVal l = $256;
          
          return new ESLVal("JNow",new ESLVal[]{});
        }
        }
      case "Ref": {ESLVal $255 = _v41.termRef(0);
          ESLVal $254 = _v41.termRef(1);
          ESLVal $253 = _v41.termRef(2);
          
          {ESLVal l = $255;
          
          {ESLVal _v98 = $254;
          
          {ESLVal n = $253;
          
          return new ESLVal("JRef",expToJExp.apply(_v98),n);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $252 = _v41.termRef(0);
          ESLVal $251 = _v41.termRef(1);
          
          {ESLVal l = $252;
          
          {ESLVal n = $251;
          
          return new ESLVal("JRefSuper",n);
        }
        }
        }
      case "For": {ESLVal $250 = _v41.termRef(0);
          ESLVal $249 = _v41.termRef(1);
          ESLVal $248 = _v41.termRef(2);
          ESLVal $247 = _v41.termRef(3);
          
          {ESLVal l1 = $250;
          
          {ESLVal p = $249;
          
          {ESLVal l2 = $248;
          
          {ESLVal c = $247;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $246 = _v41.termRef(0);
          ESLVal $245 = _v41.termRef(1);
          ESLVal $244 = _v41.termRef(2);
          
          {ESLVal l = $246;
          
          {ESLVal refs = $245;
          
          {ESLVal _v97 = $244;
          
          return new ESLVal("JGrab",refsToJExps.apply(refs),expToJExp.apply(_v97));
        }
        }
        }
        }
      case "Update": {ESLVal $243 = _v41.termRef(0);
          ESLVal $242 = _v41.termRef(1);
          ESLVal $241 = _v41.termRef(2);
          
          {ESLVal l = $243;
          
          {ESLVal n = $242;
          
          {ESLVal v = $241;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Probably": {ESLVal $240 = _v41.termRef(0);
          ESLVal $239 = _v41.termRef(1);
          ESLVal $238 = _v41.termRef(2);
          ESLVal $237 = _v41.termRef(3);
          ESLVal $236 = _v41.termRef(4);
          
          {ESLVal l = $240;
          
          {ESLVal _v96 = $239;
          
          {ESLVal t = $238;
          
          {ESLVal e1 = $237;
          
          {ESLVal e2 = $236;
          
          return new ESLVal("JProbably",expToJExp.apply(_v96),expToJExp.apply(e1),expToJExp.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Try": {ESLVal $235 = _v41.termRef(0);
          ESLVal $234 = _v41.termRef(1);
          ESLVal $233 = _v41.termRef(2);
          
          {ESLVal l = $235;
          
          {ESLVal _v95 = $234;
          
          {ESLVal arms = $233;
          
          return new ESLVal("JTry",expToJExp.apply(_v95),new ESLVal("$x"),expToJCommand.apply(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
        }
        }
        }
        }
      case "ActExp": {ESLVal $232 = _v41.termRef(0);
          ESLVal $231 = _v41.termRef(1);
          ESLVal $230 = _v41.termRef(2);
          ESLVal $229 = _v41.termRef(3);
          ESLVal $228 = _v41.termRef(4);
          ESLVal $227 = _v41.termRef(5);
          ESLVal $226 = _v41.termRef(6);
          ESLVal $225 = _v41.termRef(7);
          
          {ESLVal l = $232;
          
          {ESLVal name = $231;
          
          {ESLVal decs = $230;
          
          {ESLVal exports = $229;
          
          {ESLVal parent = $228;
          
          {ESLVal defs = $227;
          
          {ESLVal init = $226;
          
          {ESLVal arms = $225;
          
          return actToJava.apply(name,decs,exports,parent,defs,init,arms);
        }
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(5847,13487)").add(ESLVal.list(_v41)));
      }
      }
    }
  });
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal refs = $args[0];
  {ESLVal _v40 = refs;
        
        if(_v40.isCons())
        {ESLVal $216 = _v40.head();
          ESLVal $217 = _v40.tail();
          
          switch($216.termName) {
          case "VarDynamicRef": {ESLVal $222 = $216.termRef(0);
            ESLVal $221 = $216.termRef(1);
            
            switch($221.termName) {
            case "Var": {ESLVal $224 = $221.termRef(0);
              ESLVal $223 = $221.termRef(1);
              
              {ESLVal l = $222;
              
              {ESLVal vl = $224;
              
              {ESLVal n = $223;
              
              {ESLVal _v94 = $217;
              
              return refsToJExps.apply(_v94).cons(new ESLVal("JVar",n,$null));
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(13530,13771)").add(ESLVal.list(_v40)));
          }
          }
        case "ActorDynamicRef": {ESLVal $220 = $216.termRef(0);
            ESLVal $219 = $216.termRef(1);
            ESLVal $218 = $216.termRef(2);
            
            {ESLVal l = $220;
            
            {ESLVal e = $219;
            
            {ESLVal n = $218;
            
            {ESLVal _v93 = $217;
            
            return refsToJExps.apply(_v93).cons(new ESLVal("JRef",expToJExp.apply(e),n));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(13530,13771)").add(ESLVal.list(_v40)));
        }
        }
      else if(_v40.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(13530,13771)").add(ESLVal.list(_v40)));
      }
    }
  });
  private static ESLVal actToJava = new ESLVal(new Function(new ESLVal("actToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal parent = $args[3];
  ESLVal defs = $args[4];
  ESLVal init = $args[5];
  ESLVal arms = $args[6];
  if(parent.eql($null).boolVal)
        return simpleActToJava.apply(name,decs,exports,defs,init,arms);
        else
          return extendedActToJava.apply(name,decs,exports,parent,defs,init,arms);
    }
  });
  private static ESLVal simpleActToJava = new ESLVal(new Function(new ESLVal("simpleActToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal defs = $args[3];
  ESLVal init = $args[4];
  ESLVal arms = $args[5];
  {ESLVal timeArms = select.apply(isTimeArm,arms);
        
        {ESLVal nonTimeArms = reject.apply(isTimeArm,arms);
        
        {ESLVal timeCommand = ((Supplier<ESLVal>)() -> { 
            if(timeArms.eql(ESLVal.list()).boolVal)
              return new ESLVal("JBlock",ESLVal.list());
              else
                return timeArmsToJCommand.apply(timeArms);
          }).get();
        
        {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms));
        
        return new ESLVal("JBehaviour",exports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v39 = $qualArg;
              
              {ESLVal b = _v39;
              
              return ESLVal.list(ESLVal.list(defToField.apply(b)));
            }
            }
          }
        }).map(defs).flatten().flatten(),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
      }
      }
      }
      }
    }
  });
  private static ESLVal extendedActToJava = new ESLVal(new Function(new ESLVal("extendedActToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal decs = $args[1];
  ESLVal exports = $args[2];
  ESLVal parent = $args[3];
  ESLVal defs = $args[4];
  ESLVal init = $args[5];
  ESLVal arms = $args[6];
  {ESLVal p0 = new ESLVal("Pos",$zero,$zero);
        
        {ESLVal timeSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PTerm",p0,new ESLVal("Time"),ESLVal.list(),ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$"),$null)))),new ESLVal("BoolExp",p0,$true),new ESLVal("SendTimeSuper",p0));
        
        {ESLVal timeArms = select.apply(isTimeArm,arms).add(ESLVal.list(timeSuper));
        
        {ESLVal messageSuper = new ESLVal("BArm",p0,ESLVal.list(new ESLVal("PVar",p0,new ESLVal("$m"),$null)),new ESLVal("BoolExp",p0,$true),new ESLVal("Block",p0,ESLVal.list(new ESLVal("SendSuper",p0,new ESLVal("Var",p0,new ESLVal("$m"))),new ESLVal("NullExp",p0))));
        
        {ESLVal nonTimeArms = reject.apply(isTimeArm,arms).add(ESLVal.list(messageSuper));
        
        {ESLVal timeCommand = ((Supplier<ESLVal>)() -> { 
            if(timeArms.eql(ESLVal.list()).boolVal)
              return new ESLVal("JBlock",ESLVal.list());
              else
                return timeArmsToJCommand.apply(timeArms);
          }).get();
        
        {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),name,ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"),$null,$null)),new ESLVal("VoidType",new ESLVal("Pos",$zero,$zero)),new ESLVal("Case",new ESLVal("Pos",$zero,$zero),$nil,ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$m"))),nonTimeArms));
        
        return new ESLVal("JExtendedBehaviour",exports,expToJExp.apply(parent),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v38 = $qualArg;
              
              {ESLVal b = _v38;
              
              return ESLVal.list(ESLVal.list(defToField.apply(b)));
            }
            }
          }
        }).map(defs).flatten().flatten(),expToJExp.apply(init),expToJExp.apply(f),timeCommand);
      }
      }
      }
      }
      }
      }
      }
    }
  });
  private static ESLVal isTimeArm = new ESLVal(new Function(new ESLVal("isTimeArm"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal a = $args[0];
  {ESLVal _v37 = a;
        
        switch(_v37.termName) {
        case "BArm": {ESLVal $207 = _v37.termRef(0);
          ESLVal $206 = _v37.termRef(1);
          ESLVal $205 = _v37.termRef(2);
          ESLVal $204 = _v37.termRef(3);
          
          if($206.isCons())
          {ESLVal $208 = $206.head();
            ESLVal $209 = $206.tail();
            
            switch($208.termName) {
            case "PTerm": {ESLVal $213 = $208.termRef(0);
              ESLVal $212 = $208.termRef(1);
              ESLVal $211 = $208.termRef(2);
              ESLVal $210 = $208.termRef(3);
              
              switch($212.strVal) {
              case "Time": if($209.isCons())
                {ESLVal $214 = $209.head();
                  ESLVal $215 = $209.tail();
                  
                  {ESLVal _v86 = _v37;
                  
                  return $false;
                }
                }
              else if($209.isNil())
                {ESLVal l = $207;
                  
                  {ESLVal pl = $213;
                  
                  {ESLVal ts = $211;
                  
                  {ESLVal ps = $210;
                  
                  {ESLVal g = $205;
                  
                  {ESLVal e = $204;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v87 = _v37;
                  
                  return $false;
                }
              default: {ESLVal _v88 = _v37;
                
                return $false;
              }
            }
            }
            default: {ESLVal _v89 = _v37;
              
              return $false;
            }
          }
          }
        else if($206.isNil())
          {ESLVal _v90 = _v37;
            
            return $false;
          }
        else {ESLVal _v91 = _v37;
            
            return $false;
          }
        }
        default: {ESLVal _v92 = _v37;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal _v36 = arms;
        
        if(_v36.isCons())
        {ESLVal $173 = _v36.head();
          ESLVal $174 = _v36.tail();
          
          switch($173.termName) {
          case "BArm": {ESLVal $178 = $173.termRef(0);
            ESLVal $177 = $173.termRef(1);
            ESLVal $176 = $173.termRef(2);
            ESLVal $175 = $173.termRef(3);
            
            if($177.isCons())
            {ESLVal $179 = $177.head();
              ESLVal $180 = $177.tail();
              
              switch($179.termName) {
              case "PTerm": {ESLVal $184 = $179.termRef(0);
                ESLVal $183 = $179.termRef(1);
                ESLVal $182 = $179.termRef(2);
                ESLVal $181 = $179.termRef(3);
                
                switch($183.strVal) {
                case "Time": if($182.isCons())
                  {ESLVal $185 = $182.head();
                    ESLVal $186 = $182.tail();
                    
                    return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                  }
                else if($182.isNil())
                  if($181.isCons())
                    {ESLVal $187 = $181.head();
                      ESLVal $188 = $181.tail();
                      
                      switch($187.termName) {
                      case "PVar": {ESLVal $199 = $187.termRef(0);
                        ESLVal $198 = $187.termRef(1);
                        ESLVal $197 = $187.termRef(2);
                        
                        if($188.isCons())
                        {ESLVal $200 = $188.head();
                          ESLVal $201 = $188.tail();
                          
                          return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                        }
                      else if($188.isNil())
                        if($180.isCons())
                          {ESLVal $202 = $180.head();
                            ESLVal $203 = $180.tail();
                            
                            return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                          }
                        else if($180.isNil())
                          {ESLVal l = $178;
                            
                            {ESLVal tl = $184;
                            
                            {ESLVal vl = $199;
                            
                            {ESLVal n = $198;
                            
                            {ESLVal t = $197;
                            
                            {ESLVal g = $176;
                            
                            {ESLVal e = $175;
                            
                            {ESLVal _v85 = $174;
                            
                            return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp.apply(g),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v85)));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                      else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                      }
                    case "PInt": {ESLVal $190 = $187.termRef(0);
                        ESLVal $189 = $187.termRef(1);
                        
                        if($188.isCons())
                        {ESLVal $191 = $188.head();
                          ESLVal $192 = $188.tail();
                          
                          return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                        }
                      else if($188.isNil())
                        if($180.isCons())
                          {ESLVal $193 = $180.head();
                            ESLVal $194 = $180.tail();
                            
                            return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                          }
                        else if($180.isNil())
                          switch($176.termName) {
                            case "BoolExp": {ESLVal $196 = $176.termRef(0);
                              ESLVal $195 = $176.termRef(1);
                              
                              switch($195.boolVal ? 1 : 0) {
                              case 1: {ESLVal l = $178;
                                
                                {ESLVal tl = $184;
                                
                                {ESLVal vl = $190;
                                
                                {ESLVal n = $189;
                                
                                {ESLVal bl = $196;
                                
                                {ESLVal e = $175;
                                
                                {ESLVal _v84 = $174;
                                
                                return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v84));
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                          }
                        else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                      else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                      }
                      default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                    }
                    }
                  else if($181.isNil())
                    return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                  else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
                default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
              }
              }
              default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
            }
            }
          else if($177.isNil())
            return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
          else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
          }
          default: return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
        }
        }
      else if(_v36.isNil())
        return new ESLVal("JBlock",ESLVal.list());
      else return error(new ESLVal("case error at Pos(15872,16402)").add(ESLVal.list(_v36)));
      }
    }
  });
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  {ESLVal _v35 = qs;
        
        if(_v35.isCons())
        {ESLVal $166 = _v35.head();
          ESLVal $167 = _v35.tail();
          
          switch($166.termName) {
          case "BQual": {ESLVal $172 = $166.termRef(0);
            ESLVal $171 = $166.termRef(1);
            ESLVal $170 = $166.termRef(2);
            
            {ESLVal l = $172;
            
            {ESLVal p = $171;
            
            {ESLVal v = $170;
            
            {ESLVal _v83 = $167;
            
            {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),ESLVal.list(),ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v83)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
            
            return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp.apply(f),expToJExp.apply(v))));
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $169 = $166.termRef(0);
            ESLVal $168 = $166.termRef(1);
            
            {ESLVal l = $169;
            
            {ESLVal p = $168;
            
            {ESLVal _v82 = $167;
            
            return new ESLVal("JIfExp",expToJExp.apply(p),cmpToJExp.apply(e,_v82),new ESLVal("JNil",$null));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(16449,17117)").add(ESLVal.list(_v35)));
        }
        }
      else if(_v35.isNil())
        return new ESLVal("JList",$null,ESLVal.list(expToJExp.apply(e)));
      else return error(new ESLVal("case error at Pos(16449,17117)").add(ESLVal.list(_v35)));
      }
    }
  });
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  {ESLVal _v33 = module;
        
        switch(_v33.termName) {
        case "Module": {ESLVal $165 = _v33.termRef(0);
          ESLVal $164 = _v33.termRef(1);
          ESLVal $163 = _v33.termRef(2);
          ESLVal $162 = _v33.termRef(3);
          ESLVal $161 = _v33.termRef(4);
          ESLVal $160 = _v33.termRef(5);
          ESLVal $159 = _v33.termRef(6);
          
          {ESLVal path = $165;
          
          {ESLVal name = $164;
          
          {ESLVal exports = $163;
          
          {ESLVal imports = $162;
          
          {ESLVal x = $161;
          
          {ESLVal y = $160;
          
          {ESLVal defs = $159;
          
          return renameJVarsModule.apply(new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v34 = $qualArg;
                
                {ESLVal d = _v34;
                
                return ESLVal.list((isBinding.apply(d).or(isFunBind.apply(d)).boolVal) ? (ESLVal.list(defToField.apply(d))) : ($nil));
              }
              }
            }
          }).map(defs).flatten().flatten()));
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17155,17398)").add(ESLVal.list(_v33)));
      }
      }
    }
  });
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v30 = m;
        
        switch(_v30.termName) {
        case "JModule": {ESLVal $152 = _v30.termRef(0);
          ESLVal $151 = _v30.termRef(1);
          ESLVal $150 = _v30.termRef(2);
          ESLVal $149 = _v30.termRef(3);
          
          {ESLVal name = $152;
          
          {ESLVal exports = $151;
          
          {ESLVal imports = $150;
          
          {ESLVal fs = $149;
          
          {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v31 = $qualArg;
                  
                  switch(_v31.termName) {
                  case "JField": {ESLVal $155 = _v31.termRef(0);
                    ESLVal $154 = _v31.termRef(1);
                    ESLVal $153 = _v31.termRef(2);
                    
                    {ESLVal n = $155;
                    
                    {ESLVal t = $154;
                    
                    {ESLVal e = $153;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v31;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(fs).flatten().flatten();
          
          return new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v32 = $qualArg;
                
                switch(_v32.termName) {
                case "JField": {ESLVal $158 = _v32.termRef(0);
                  ESLVal $157 = _v32.termRef(1);
                  ESLVal $156 = _v32.termRef(2);
                  
                  {ESLVal n = $158;
                  
                  {ESLVal t = $157;
                  
                  {ESLVal e = $156;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v32;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17438,17745)").add(ESLVal.list(_v30)));
      }
      }
    }
  });
  private static ESLVal renameJVarsExp = new ESLVal(new Function(new ESLVal("renameJVarsExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v16 = e;
        
        switch(_v16.termName) {
        case "JFun": {ESLVal $140 = _v16.termRef(0);
          ESLVal $139 = _v16.termRef(1);
          ESLVal $138 = _v16.termRef(2);
          ESLVal $137 = _v16.termRef(3);
          
          {ESLVal v0 = $140;
          
          {ESLVal v1 = $139;
          
          {ESLVal v2 = $138;
          
          {ESLVal v3 = $137;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v27 = $qualArg;
                  
                  switch(_v27.termName) {
                  case "JDec": {ESLVal $148 = _v27.termRef(0);
                    ESLVal $147 = _v27.termRef(1);
                    
                    {ESLVal n = $148;
                    
                    {ESLVal t = $147;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  default: {ESLVal _0 = _v27;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v1).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun1913"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,boundNames);
          }
        }),vars).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v28 = $qualArg;
                    
                    {ESLVal n = _v28;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JFun",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v29 = $qualArg;
                  
                  {ESLVal n = _v29;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JDec",n,$null)));
                }
                }
              }
            }).map(newNames).flatten().flatten(),v2,renameJVarsCommand.apply(v3,boundNames.add(vars),env1));
          }
          }
          else
            return new ESLVal("JFun",v0,v1,v2,renameJVarsCommand.apply(v3,boundNames.add(vars),env));
        }
        }
        }
        }
        }
        }
      case "JApply": {ESLVal $136 = _v16.termRef(0);
          ESLVal $135 = _v16.termRef(1);
          
          {ESLVal v0 = $136;
          
          {ESLVal v1 = $135;
          
          return new ESLVal("JApply",renameJVarsExp.apply(v0,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v26 = $qualArg;
                
                {ESLVal v = _v26;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JArrayRef": {ESLVal $134 = _v16.termRef(0);
          ESLVal $133 = _v16.termRef(1);
          
          {ESLVal a = $134;
          
          {ESLVal i = $133;
          
          return new ESLVal("JArrayRef",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $132 = _v16.termRef(0);
          ESLVal $131 = _v16.termRef(1);
          ESLVal $130 = _v16.termRef(2);
          
          {ESLVal a = $132;
          
          {ESLVal i = $131;
          
          {ESLVal v = $130;
          
          return new ESLVal("JArrayUpdate",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env),renameJVarsExp.apply(v,vars,env));
        }
        }
        }
        }
      case "JBecome": {ESLVal $129 = _v16.termRef(0);
          ESLVal $128 = _v16.termRef(1);
          
          {ESLVal _v81 = $129;
          
          {ESLVal es = $128;
          
          return new ESLVal("JBecome",renameJVarsExp.apply(_v81,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v25 = $qualArg;
                
                {ESLVal v = _v25;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "JBinExp": {ESLVal $127 = _v16.termRef(0);
          ESLVal $126 = _v16.termRef(1);
          ESLVal $125 = _v16.termRef(2);
          
          {ESLVal v0 = $127;
          
          {ESLVal v1 = $126;
          
          {ESLVal v2 = $125;
          
          return new ESLVal("JBinExp",renameJVarsExp.apply(v0,vars,env),v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $124 = _v16.termRef(0);
          ESLVal $123 = _v16.termRef(1);
          
          {ESLVal v0 = $124;
          
          {ESLVal v1 = $123;
          
          return new ESLVal("JCommandExp",renameJVarsCommand.apply(v0,vars,env),v1);
        }
        }
        }
      case "JIfExp": {ESLVal $122 = _v16.termRef(0);
          ESLVal $121 = _v16.termRef(1);
          ESLVal $120 = _v16.termRef(2);
          
          {ESLVal v0 = $122;
          
          {ESLVal v1 = $121;
          
          {ESLVal v2 = $120;
          
          return new ESLVal("JIfExp",renameJVarsExp.apply(v0,vars,env),renameJVarsExp.apply(v1,vars,env),renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $119 = _v16.termRef(0);
          
          {ESLVal v0 = $119;
          
          return e;
        }
        }
      case "JTerm": {ESLVal $118 = _v16.termRef(0);
          ESLVal $117 = _v16.termRef(1);
          
          {ESLVal v0 = $118;
          
          {ESLVal v1 = $117;
          
          return new ESLVal("JTerm",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v24 = $qualArg;
                
                {ESLVal v = _v24;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JTermRef": {ESLVal $116 = _v16.termRef(0);
          ESLVal $115 = _v16.termRef(1);
          
          {ESLVal v0 = $116;
          
          {ESLVal v1 = $115;
          
          return new ESLVal("JTermRef",renameJVarsExp.apply(v0,vars,env),v1);
        }
        }
        }
      case "JList": {ESLVal $114 = _v16.termRef(0);
          ESLVal $113 = _v16.termRef(1);
          
          {ESLVal v0 = $114;
          
          {ESLVal v1 = $113;
          
          return new ESLVal("JList",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v23 = $qualArg;
                
                {ESLVal v = _v23;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JNil": {ESLVal $112 = _v16.termRef(0);
          
          {ESLVal v0 = $112;
          
          return e;
        }
        }
      case "JNow": {
          return e;
        }
      case "JVar": {ESLVal $111 = _v16.termRef(0);
          ESLVal $110 = _v16.termRef(1);
          
          {ESLVal v0 = $111;
          
          {ESLVal v1 = $110;
          
          if(hasEntry.apply(v0,env).boolVal)
          return new ESLVal("JVar",lookup.apply(v0,env),v1);
          else
            return e;
        }
        }
        }
      case "JNull": {
          return e;
        }
      case "JError": {ESLVal $109 = _v16.termRef(0);
          
          {ESLVal v0 = $109;
          
          return new ESLVal("JError",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JHead": {ESLVal $108 = _v16.termRef(0);
          
          {ESLVal v0 = $108;
          
          return new ESLVal("JHead",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JTail": {ESLVal $107 = _v16.termRef(0);
          
          {ESLVal v0 = $107;
          
          return new ESLVal("JTail",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JCastp": {ESLVal $106 = _v16.termRef(0);
          ESLVal $105 = _v16.termRef(1);
          ESLVal $104 = _v16.termRef(2);
          
          {ESLVal v0 = $106;
          
          {ESLVal v1 = $105;
          
          {ESLVal v2 = $104;
          
          return new ESLVal("JCastp",v0,v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCast": {ESLVal $103 = _v16.termRef(0);
          ESLVal $102 = _v16.termRef(1);
          
          {ESLVal v0 = $103;
          
          {ESLVal v1 = $102;
          
          return new ESLVal("JCast",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JNot": {ESLVal $101 = _v16.termRef(0);
          
          {ESLVal _v80 = $101;
          
          return new ESLVal("JNot",renameJVarsExp.apply(_v80,vars,env));
        }
        }
      case "JNew": {ESLVal $100 = _v16.termRef(0);
          ESLVal $99 = _v16.termRef(1);
          
          {ESLVal b = $100;
          
          {ESLVal args = $99;
          
          return new ESLVal("JNew",renameJVarsExp.apply(b,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v22 = $qualArg;
                
                {ESLVal a = _v22;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewArray": {ESLVal $98 = _v16.termRef(0);
          
          {ESLVal b = $98;
          
          return new ESLVal("JNewArray",renameJVarsExp.apply(b,vars,env));
        }
        }
      case "JNewJava": {ESLVal $97 = _v16.termRef(0);
          ESLVal $96 = _v16.termRef(1);
          
          {ESLVal n = $97;
          
          {ESLVal args = $96;
          
          return new ESLVal("JNewJava",n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v21 = $qualArg;
                
                {ESLVal a = _v21;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewTable": {
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
      case "JMapFun": {ESLVal $95 = _v16.termRef(0);
          ESLVal $94 = _v16.termRef(1);
          
          {ESLVal f = $95;
          
          {ESLVal l = $94;
          
          return new ESLVal("JMapFun",renameJVarsExp.apply(f,vars,env),renameJVarsExp.apply(l,vars,env));
        }
        }
        }
      case "JFlatten": {ESLVal $93 = _v16.termRef(0);
          
          {ESLVal _v79 = $93;
          
          return new ESLVal("JFlatten",renameJVarsExp.apply(_v79,vars,env));
        }
        }
      case "JSend": {ESLVal $92 = _v16.termRef(0);
          ESLVal $91 = _v16.termRef(1);
          ESLVal $90 = _v16.termRef(2);
          
          {ESLVal _v77 = $92;
          
          {ESLVal n = $91;
          
          {ESLVal es = $90;
          
          return new ESLVal("JSend",renameJVarsExp.apply(_v77,vars,env),n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v20 = $qualArg;
                
                {ESLVal _v78 = _v20;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v78,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $89 = _v16.termRef(0);
          
          {ESLVal _v76 = $89;
          
          return new ESLVal("JSendSuper",renameJVarsExp.apply(_v76,vars,env));
        }
        }
      case "JSendTimeSuper": {
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
      case "JSelf": {
          return new ESLVal("JSelf",new ESLVal[]{});
        }
      case "JRef": {ESLVal $88 = _v16.termRef(0);
          ESLVal $87 = _v16.termRef(1);
          
          {ESLVal _v75 = $88;
          
          {ESLVal n = $87;
          
          return new ESLVal("JRef",renameJVarsExp.apply(_v75,vars,env),n);
        }
        }
        }
      case "JRefSuper": {ESLVal $86 = _v16.termRef(0);
          
          {ESLVal n = $86;
          
          return new ESLVal("JRefSuper",n);
        }
        }
      case "JBehaviour": {ESLVal $85 = _v16.termRef(0);
          ESLVal $84 = _v16.termRef(1);
          ESLVal $83 = _v16.termRef(2);
          ESLVal $82 = _v16.termRef(3);
          ESLVal $81 = _v16.termRef(4);
          
          {ESLVal es = $85;
          
          {ESLVal fs = $84;
          
          {ESLVal init = $83;
          
          {ESLVal handler = $82;
          
          {ESLVal time = $81;
          
          return new ESLVal("JBehaviour",es,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v19 = $qualArg;
                
                switch(_v19.termName) {
                case "JField": {ESLVal $146 = _v19.termRef(0);
                  ESLVal $145 = _v19.termRef(1);
                  ESLVal $144 = _v19.termRef(2);
                  
                  {ESLVal n = $146;
                  
                  {ESLVal t = $145;
                  
                  {ESLVal _v74 = $144;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v74,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v19;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),renameJVarsExp.apply(init,vars,env),renameJVarsExp.apply(handler,vars,env),renameJVarsCommand.apply(time,vars,env));
        }
        }
        }
        }
        }
        }
      case "JExtendedBehaviour": {ESLVal $80 = _v16.termRef(0);
          ESLVal $79 = _v16.termRef(1);
          ESLVal $78 = _v16.termRef(2);
          ESLVal $77 = _v16.termRef(3);
          ESLVal $76 = _v16.termRef(4);
          ESLVal $75 = _v16.termRef(5);
          
          {ESLVal es = $80;
          
          {ESLVal parent = $79;
          
          {ESLVal fs = $78;
          
          {ESLVal init = $77;
          
          {ESLVal handler = $76;
          
          {ESLVal time = $75;
          
          return new ESLVal("JExtendedBehaviour",es,renameJVarsExp.apply(parent,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v18 = $qualArg;
                
                switch(_v18.termName) {
                case "JField": {ESLVal $143 = _v18.termRef(0);
                  ESLVal $142 = _v18.termRef(1);
                  ESLVal $141 = _v18.termRef(2);
                  
                  {ESLVal n = $143;
                  
                  {ESLVal t = $142;
                  
                  {ESLVal _v73 = $141;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v73,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v18;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten(),renameJVarsExp.apply(init,vars,env),renameJVarsExp.apply(handler,vars,env),renameJVarsCommand.apply(time,vars,env));
        }
        }
        }
        }
        }
        }
        }
      case "JTry": {ESLVal $74 = _v16.termRef(0);
          ESLVal $73 = _v16.termRef(1);
          ESLVal $72 = _v16.termRef(2);
          
          {ESLVal _v72 = $74;
          
          {ESLVal n = $73;
          
          {ESLVal c = $72;
          
          return new ESLVal("JTry",renameJVarsExp.apply(_v72,vars,env),n,renameJVarsCommand.apply(c,vars,env));
        }
        }
        }
        }
      case "JProbably": {ESLVal $71 = _v16.termRef(0);
          ESLVal $70 = _v16.termRef(1);
          ESLVal $69 = _v16.termRef(2);
          
          {ESLVal _v71 = $71;
          
          {ESLVal e1 = $70;
          
          {ESLVal e2 = $69;
          
          return new ESLVal("JProbably",renameJVarsExp.apply(_v71,vars,env),renameJVarsExp.apply(e1,vars,env),renameJVarsExp.apply(e2,vars,env));
        }
        }
        }
        }
      case "JGrab": {ESLVal $68 = _v16.termRef(0);
          ESLVal $67 = _v16.termRef(1);
          
          {ESLVal es = $68;
          
          {ESLVal c = $67;
          
          return new ESLVal("JGrab",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v17 = $qualArg;
                
                {ESLVal _v70 = _v17;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v70,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten(),renameJVarsExp.apply(c,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17815,22083)").add(ESLVal.list(_v16)));
      }
      }
    }
  });
  private static ESLVal nameCount = $zero;
  private static ESLVal newName = new ESLVal(new Function(new ESLVal("newName"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {nameCount = nameCount.add($one);
      return new ESLVal("_v").add(nameCount);}
    }
  });
  private static ESLVal renameJVarsCommand = new ESLVal(new Function(new ESLVal("renameJVarsCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal vars = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v2 = c;
        
        switch(_v2.termName) {
        case "JBlock": {ESLVal $39 = _v2.termRef(0);
          
          {ESLVal v0 = $39;
          
          return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v15 = $qualArg;
                
                {ESLVal _v69 = _v15;
                
                return ESLVal.list(ESLVal.list(renameJVarsCommand.apply(_v69,vars,env)));
              }
              }
            }
          }).map(v0).flatten().flatten());
        }
        }
      case "JReturn": {ESLVal $38 = _v2.termRef(0);
          
          {ESLVal v0 = $38;
          
          return new ESLVal("JReturn",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JSwitch": {ESLVal $37 = _v2.termRef(0);
          ESLVal $36 = _v2.termRef(1);
          ESLVal $35 = _v2.termRef(2);
          
          {ESLVal v0 = $37;
          
          {ESLVal v1 = $36;
          
          {ESLVal v2 = $35;
          
          return error(new ESLVal("jswitch should not occur"));
        }
        }
        }
        }
      case "JSwitchList": {ESLVal $34 = _v2.termRef(0);
          ESLVal $33 = _v2.termRef(1);
          ESLVal $32 = _v2.termRef(2);
          ESLVal $31 = _v2.termRef(3);
          
          {ESLVal v0 = $34;
          
          {ESLVal v1 = $33;
          
          {ESLVal v2 = $32;
          
          {ESLVal v3 = $31;
          
          return new ESLVal("JSwitchList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JIfCommand": {ESLVal $30 = _v2.termRef(0);
          ESLVal $29 = _v2.termRef(1);
          ESLVal $28 = _v2.termRef(2);
          
          {ESLVal v0 = $30;
          
          {ESLVal v1 = $29;
          
          {ESLVal v2 = $28;
          
          return new ESLVal("JIfCommand",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCaseList": {ESLVal $27 = _v2.termRef(0);
          ESLVal $26 = _v2.termRef(1);
          ESLVal $25 = _v2.termRef(2);
          ESLVal $24 = _v2.termRef(3);
          
          {ESLVal v0 = $27;
          
          {ESLVal v1 = $26;
          
          {ESLVal v2 = $25;
          
          {ESLVal v3 = $24;
          
          return new ESLVal("JCaseList",renameJVarsExp.apply(v0,vars,env),renameJVarsCommand.apply(v1,vars,env),renameJVarsCommand.apply(v2,vars,env),renameJVarsCommand.apply(v3,vars,env));
        }
        }
        }
        }
        }
      case "JCaseInt": {ESLVal $23 = _v2.termRef(0);
          ESLVal $22 = _v2.termRef(1);
          ESLVal $21 = _v2.termRef(2);
          
          {ESLVal e = $23;
          
          {ESLVal arms = $22;
          
          {ESLVal alt = $21;
          
          return new ESLVal("JCaseInt",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v14 = $qualArg;
                
                switch(_v14.termName) {
                case "JIArm": {ESLVal $66 = _v14.termRef(0);
                  ESLVal $65 = _v14.termRef(1);
                  
                  {ESLVal n = $66;
                  
                  {ESLVal _v68 = $65;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand.apply(_v68,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v14;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseStr": {ESLVal $20 = _v2.termRef(0);
          ESLVal $19 = _v2.termRef(1);
          ESLVal $18 = _v2.termRef(2);
          
          {ESLVal e = $20;
          
          {ESLVal arms = $19;
          
          {ESLVal alt = $18;
          
          return new ESLVal("JCaseStr",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v13 = $qualArg;
                
                switch(_v13.termName) {
                case "JSArm": {ESLVal $64 = _v13.termRef(0);
                  ESLVal $63 = _v13.termRef(1);
                  
                  {ESLVal s = $64;
                  
                  {ESLVal _v67 = $63;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand.apply(_v67,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v13;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseBool": {ESLVal $17 = _v2.termRef(0);
          ESLVal $16 = _v2.termRef(1);
          ESLVal $15 = _v2.termRef(2);
          
          {ESLVal e = $17;
          
          {ESLVal arms = $16;
          
          {ESLVal alt = $15;
          
          return new ESLVal("JCaseBool",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v12 = $qualArg;
                
                switch(_v12.termName) {
                case "JBArm": {ESLVal $62 = _v12.termRef(0);
                  ESLVal $61 = _v12.termRef(1);
                  
                  {ESLVal b = $62;
                  
                  {ESLVal _v66 = $61;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand.apply(_v66,vars,env))));
                }
                }
                }
                default: {ESLVal _0 = _v12;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JCaseTerm": {ESLVal $14 = _v2.termRef(0);
          ESLVal $13 = _v2.termRef(1);
          ESLVal $12 = _v2.termRef(2);
          
          {ESLVal e = $14;
          
          {ESLVal arms = $13;
          
          {ESLVal alt = $12;
          
          return new ESLVal("JCaseTerm",renameJVarsExp.apply(e,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v11 = $qualArg;
                
                switch(_v11.termName) {
                case "JTArm": {ESLVal $60 = _v11.termRef(0);
                  ESLVal $59 = _v11.termRef(1);
                  ESLVal $58 = _v11.termRef(2);
                  
                  {ESLVal n = $60;
                  
                  {ESLVal i = $59;
                  
                  {ESLVal _v65 = $58;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand.apply(_v65,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v11;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(arms).flatten().flatten(),renameJVarsCommand.apply(alt,vars,env));
        }
        }
        }
        }
      case "JLet": {ESLVal $11 = _v2.termRef(0);
          ESLVal $10 = _v2.termRef(1);
          
          {ESLVal v0 = $11;
          
          {ESLVal v1 = $10;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v7 = $qualArg;
                  
                  switch(_v7.termName) {
                  case "JField": {ESLVal $51 = _v7.termRef(0);
                    ESLVal $50 = _v7.termRef(1);
                    ESLVal $49 = _v7.termRef(2);
                    
                    {ESLVal n = $51;
                    
                    {ESLVal t = $50;
                    
                    {ESLVal e = $49;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v7;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun1914"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v8 = $qualArg;
                    
                    {ESLVal n = _v8;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v9 = $qualArg;
                  
                  switch(_v9.termName) {
                  case "JField": {ESLVal $54 = _v9.termRef(0);
                    ESLVal $53 = _v9.termRef(1);
                    ESLVal $52 = _v9.termRef(2);
                    
                    {ESLVal n = $54;
                    
                    {ESLVal t = $53;
                    
                    {ESLVal e = $52;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,env1),t,renameJVarsExp.apply(e,vars,env))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v9;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env1));
          }
          }
          else
            return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v10 = $qualArg;
                    
                    switch(_v10.termName) {
                    case "JField": {ESLVal $57 = _v10.termRef(0);
                      ESLVal $56 = _v10.termRef(1);
                      ESLVal $55 = _v10.termRef(2);
                      
                      {ESLVal n = $57;
                      
                      {ESLVal t = $56;
                      
                      {ESLVal e = $55;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v10;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env));
        }
        }
        }
        }
      case "JLetRec": {ESLVal $9 = _v2.termRef(0);
          ESLVal $8 = _v2.termRef(1);
          
          {ESLVal v0 = $9;
          
          {ESLVal v1 = $8;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v3 = $qualArg;
                  
                  switch(_v3.termName) {
                  case "JField": {ESLVal $42 = _v3.termRef(0);
                    ESLVal $41 = _v3.termRef(1);
                    ESLVal $40 = _v3.termRef(2);
                    
                    {ESLVal n = $42;
                    
                    {ESLVal t = $41;
                    
                    {ESLVal e = $40;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v3;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun1915"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,vars);
          }
        }),boundNames).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v4 = $qualArg;
                    
                    {ESLVal n = _v4;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal _v64 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v5 = $qualArg;
                  
                  switch(_v5.termName) {
                  case "JField": {ESLVal $45 = _v5.termRef(0);
                    ESLVal $44 = _v5.termRef(1);
                    ESLVal $43 = _v5.termRef(2);
                    
                    {ESLVal n = $45;
                    
                    {ESLVal t = $44;
                    
                    {ESLVal e = $43;
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,_v64),t,renameJVarsExp.apply(e,vars,_v64))));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v5;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),_v64));
          }
          }
          else
            return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v6 = $qualArg;
                    
                    switch(_v6.termName) {
                    case "JField": {ESLVal $48 = _v6.termRef(0);
                      ESLVal $47 = _v6.termRef(1);
                      ESLVal $46 = _v6.termRef(2);
                      
                      {ESLVal n = $48;
                      
                      {ESLVal t = $47;
                      
                      {ESLVal e = $46;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,vars,env))));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v6;
                      
                      return ESLVal.list();
                    }
                  }
                  }
                }
              }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),env));
        }
        }
        }
        }
      case "JStatement": {ESLVal $7 = _v2.termRef(0);
          
          {ESLVal e = $7;
          
          return new ESLVal("JStatement",renameJVarsExp.apply(e,vars,env));
        }
        }
      case "JUpdate": {ESLVal $6 = _v2.termRef(0);
          ESLVal $5 = _v2.termRef(1);
          
          {ESLVal name = $6;
          
          {ESLVal value = $5;
          
          if(hasEntry.apply(name,env).boolVal)
          return new ESLVal("JUpdate",lookup.apply(name,env),renameJVarsExp.apply(value,vars,env));
          else
            {ESLVal v0 = $6;
              
              {ESLVal v1 = $5;
              
              return new ESLVal("JUpdate",v0,renameJVarsExp.apply(v1,vars,env));
            }
            }
        }
        }
        }
      case "JFor": {ESLVal $4 = _v2.termRef(0);
          ESLVal $3 = _v2.termRef(1);
          ESLVal $2 = _v2.termRef(2);
          ESLVal $1 = _v2.termRef(3);
          
          {ESLVal l = $4;
          
          {ESLVal n = $3;
          
          {ESLVal e = $2;
          
          {ESLVal _v63 = $1;
          
          return new ESLVal("JFor",l,n,renameJVarsExp.apply(e,vars,env),renameJVarsCommand.apply(_v63,vars,env));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(22324,25986)").add(ESLVal.list(_v2)));
      }
      }
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v1 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v1)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            {print.apply(new ESLVal("").add(emptyTable));
            stopAll.apply();}
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}