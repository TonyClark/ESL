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
  {ESLVal _v63 = d;
        
        switch(_v63.termName) {
        case "Binding": {ESLVal $508 = _v63.termRef(0);
          ESLVal $507 = _v63.termRef(1);
          ESLVal $506 = _v63.termRef(2);
          ESLVal $505 = _v63.termRef(3);
          ESLVal $504 = _v63.termRef(4);
          
          {ESLVal l = $508;
          
          {ESLVal n = $507;
          
          {ESLVal t = $506;
          
          {ESLVal st = $505;
          
          {ESLVal e = $504;
          
          return new ESLVal("JField",n,$null,expToJExp.apply(e));
        }
        }
        }
        }
        }
        }
      case "FunBind": {ESLVal $501 = _v63.termRef(0);
          ESLVal $500 = _v63.termRef(1);
          ESLVal $499 = _v63.termRef(2);
          ESLVal $498 = _v63.termRef(3);
          ESLVal $497 = _v63.termRef(4);
          ESLVal $496 = _v63.termRef(5);
          ESLVal $495 = _v63.termRef(6);
          
          switch($495.termName) {
          case "BoolExp": {ESLVal $503 = $495.termRef(0);
            ESLVal $502 = $495.termRef(1);
            
            switch($502.boolVal ? 1 : 0) {
            case 1: {ESLVal l = $501;
              
              {ESLVal n = $500;
              
              {ESLVal args = $499;
              
              {ESLVal t = $498;
              
              {ESLVal st = $497;
              
              {ESLVal e = $496;
              
              {ESLVal bl = $503;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v64 = $qualArg;
                      
                      switch(_v64.termName) {
                      case "PVar": {ESLVal $511 = _v64.termRef(0);
                        ESLVal $510 = _v64.termRef(1);
                        ESLVal $509 = _v64.termRef(2);
                        
                        {ESLVal _v144 = $511;
                        
                        {ESLVal _v145 = $510;
                        
                        {ESLVal _v146 = $509;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v144,_v145,_v146,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v64;
                        
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
            default: {ESLVal l = $501;
              
              {ESLVal n = $500;
              
              {ESLVal args = $499;
              
              {ESLVal t = $498;
              
              {ESLVal st = $497;
              
              {ESLVal e = $496;
              
              {ESLVal g = $495;
              
              {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v65 = $qualArg;
                      
                      switch(_v65.termName) {
                      case "PVar": {ESLVal $514 = _v65.termRef(0);
                        ESLVal $513 = _v65.termRef(1);
                        ESLVal $512 = _v65.termRef(2);
                        
                        {ESLVal _v147 = $514;
                        
                        {ESLVal _v148 = $513;
                        
                        {ESLVal _v149 = $512;
                        
                        return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v147,_v148,_v149,st)));
                      }
                      }
                      }
                      }
                      default: {ESLVal _0 = _v65;
                        
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
          default: {ESLVal l = $501;
            
            {ESLVal n = $500;
            
            {ESLVal args = $499;
            
            {ESLVal t = $498;
            
            {ESLVal st = $497;
            
            {ESLVal e = $496;
            
            {ESLVal g = $495;
            
            {ESLVal formals = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v66 = $qualArg;
                    
                    switch(_v66.termName) {
                    case "PVar": {ESLVal $517 = _v66.termRef(0);
                      ESLVal $516 = _v66.termRef(1);
                      ESLVal $515 = _v66.termRef(2);
                      
                      {ESLVal _v150 = $517;
                      
                      {ESLVal _v151 = $516;
                      
                      {ESLVal _v152 = $515;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("Dec",_v150,_v151,_v152,st)));
                    }
                    }
                    }
                    }
                    default: {ESLVal _0 = _v66;
                      
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
        default: return error(new ESLVal("case error at Pos(172,825)").add(ESLVal.list(_v63)));
      }
      }
    }
  });
  private static ESLVal decToJDec = new ESLVal(new Function(new ESLVal("decToJDec"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v62 = d;
        
        switch(_v62.termName) {
        case "Dec": {ESLVal $494 = _v62.termRef(0);
          ESLVal $493 = _v62.termRef(1);
          ESLVal $492 = _v62.termRef(2);
          ESLVal $491 = _v62.termRef(3);
          
          {ESLVal l = $494;
          
          {ESLVal n = $493;
          
          {ESLVal t = $492;
          
          {ESLVal st = $491;
          
          return new ESLVal("JDec",n,$null);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(869,945)").add(ESLVal.list(_v62)));
      }
      }
    }
  });
  private static ESLVal expsToJCommands = new ESLVal(new Function(new ESLVal("expsToJCommands"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cs = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v61 = cs;
        
        if(_v61.isCons())
        {ESLVal $487 = _v61.head();
          ESLVal $488 = _v61.tail();
          
          if($488.isCons())
          {ESLVal $489 = $488.head();
            ESLVal $490 = $488.tail();
            
            {ESLVal c = $487;
            
            {ESLVal _v142 = $488;
            
            return expsToJCommands.apply(_v142,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
          }
        else if($488.isNil())
          {ESLVal c = $487;
            
            return ESLVal.list(expToJCommand.apply(c,isLast));
          }
        else {ESLVal c = $487;
            
            {ESLVal _v143 = $488;
            
            return expsToJCommands.apply(_v143,isLast).cons(expToJCommand.apply(c,$false));
          }
          }
        }
      else if(_v61.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(1004,1164)").add(ESLVal.list(_v61)));
      }
    }
  });
  private static ESLVal expToJCommand = new ESLVal(new Function(new ESLVal("expToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v55 = c;
        
        switch(_v55.termName) {
        case "Block": {ESLVal $482 = _v55.termRef(0);
          ESLVal $481 = _v55.termRef(1);
          
          if($481.isCons())
          {ESLVal $483 = $481.head();
            ESLVal $484 = $481.tail();
            
            if($484.isCons())
            {ESLVal $485 = $484.head();
              ESLVal $486 = $484.tail();
              
              {ESLVal l = $482;
              
              {ESLVal es = $481;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v58 = $qualArg;
                    
                    {ESLVal e = _v58;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
            }
          else if($484.isNil())
            {ESLVal l = $482;
              
              {ESLVal e = $483;
              
              return expToJCommand.apply(e,isLast);
            }
            }
          else {ESLVal l = $482;
              
              {ESLVal es = $481;
              
              return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v59 = $qualArg;
                    
                    {ESLVal e = _v59;
                    
                    return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                  }
                  }
                }
              }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
            }
            }
          }
        else if($481.isNil())
          {ESLVal l = $482;
            
            if(isLast.boolVal)
            return new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}));
            else
              {ESLVal _v140 = $482;
                
                return new ESLVal("JBlock",$nil);
              }
          }
        else {ESLVal l = $482;
            
            {ESLVal es = $481;
            
            return new ESLVal("JBlock",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v60 = $qualArg;
                  
                  {ESLVal e = _v60;
                  
                  return ESLVal.list(ESLVal.list(expToJCommand.apply(e,$false)));
                }
                }
              }
            }).map(butlast.apply(es)).flatten().flatten().add(ESLVal.list(expToJCommand.apply(last.apply(es),isLast))));
          }
          }
        }
      case "Update": {ESLVal $480 = _v55.termRef(0);
          ESLVal $479 = _v55.termRef(1);
          ESLVal $478 = _v55.termRef(2);
          
          {ESLVal l = $480;
          
          {ESLVal n = $479;
          
          {ESLVal e = $478;
          
          if(isLast.boolVal)
          return new ESLVal("JBlock",ESLVal.list(new ESLVal("JUpdate",n,expToJExp.apply(e)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
          else
            {ESLVal _v137 = $480;
              
              {ESLVal _v138 = $479;
              
              {ESLVal _v139 = $478;
              
              return new ESLVal("JUpdate",_v138,expToJExp.apply(_v139));
            }
            }
            }
        }
        }
        }
        }
      case "If": {ESLVal $477 = _v55.termRef(0);
          ESLVal $476 = _v55.termRef(1);
          ESLVal $475 = _v55.termRef(2);
          ESLVal $474 = _v55.termRef(3);
          
          {ESLVal l = $477;
          
          {ESLVal e1 = $476;
          
          {ESLVal e2 = $475;
          
          {ESLVal e3 = $474;
          
          return new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,isLast),expToJCommand.apply(e3,isLast));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $473 = _v55.termRef(0);
          ESLVal $472 = _v55.termRef(1);
          ESLVal $471 = _v55.termRef(2);
          ESLVal $470 = _v55.termRef(3);
          ESLVal $469 = _v55.termRef(4);
          
          {ESLVal l = $473;
          
          {ESLVal e = $472;
          
          {ESLVal cons = $471;
          
          {ESLVal nil = $470;
          
          {ESLVal alt = $469;
          
          return new ESLVal("JCaseList",expToJExp.apply(e),expToJCommand.apply(cons,isLast),expToJCommand.apply(nil,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $468 = _v55.termRef(0);
          ESLVal $467 = _v55.termRef(1);
          ESLVal $466 = _v55.termRef(2);
          ESLVal $465 = _v55.termRef(3);
          
          {ESLVal l = $468;
          
          {ESLVal e = $467;
          
          {ESLVal arms = $466;
          
          {ESLVal alt = $465;
          
          return new ESLVal("JCaseTerm",expToJExp.apply(e),termArmsToJTermArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseInt": {ESLVal $464 = _v55.termRef(0);
          ESLVal $463 = _v55.termRef(1);
          ESLVal $462 = _v55.termRef(2);
          ESLVal $461 = _v55.termRef(3);
          
          {ESLVal l = $464;
          
          {ESLVal e = $463;
          
          {ESLVal arms = $462;
          
          {ESLVal alt = $461;
          
          return new ESLVal("JCaseInt",expToJExp.apply(e),intArmsToJIntArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $460 = _v55.termRef(0);
          ESLVal $459 = _v55.termRef(1);
          ESLVal $458 = _v55.termRef(2);
          ESLVal $457 = _v55.termRef(3);
          
          {ESLVal l = $460;
          
          {ESLVal e = $459;
          
          {ESLVal arms = $458;
          
          {ESLVal alt = $457;
          
          return new ESLVal("JCaseStr",expToJExp.apply(e),strArmsToJStrArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $456 = _v55.termRef(0);
          ESLVal $455 = _v55.termRef(1);
          ESLVal $454 = _v55.termRef(2);
          ESLVal $453 = _v55.termRef(3);
          
          {ESLVal l = $456;
          
          {ESLVal e = $455;
          
          {ESLVal arms = $454;
          
          {ESLVal alt = $453;
          
          return new ESLVal("JCaseBool",expToJExp.apply(e),boolArmsToJBoolArms.apply(arms,isLast),expToJCommand.apply(alt,isLast));
        }
        }
        }
        }
        }
      case "Let": {ESLVal $452 = _v55.termRef(0);
          ESLVal $451 = _v55.termRef(1);
          ESLVal $450 = _v55.termRef(2);
          
          {ESLVal l = $452;
          
          {ESLVal bs = $451;
          
          {ESLVal e = $450;
          
          return new ESLVal("JLet",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v57 = $qualArg;
                
                {ESLVal b = _v57;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,isLast));
        }
        }
        }
        }
      case "Letrec": {ESLVal $449 = _v55.termRef(0);
          ESLVal $448 = _v55.termRef(1);
          ESLVal $447 = _v55.termRef(2);
          
          {ESLVal l = $449;
          
          {ESLVal bs = $448;
          
          {ESLVal e = $447;
          
          return new ESLVal("JLetRec",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v56 = $qualArg;
                
                {ESLVal b = _v56;
                
                return ESLVal.list(ESLVal.list(defToField.apply(b)));
              }
              }
            }
          }).map(bs).flatten().flatten(),expToJCommand.apply(e,$true));
        }
        }
        }
        }
      case "For": {ESLVal $443 = _v55.termRef(0);
          ESLVal $442 = _v55.termRef(1);
          ESLVal $441 = _v55.termRef(2);
          ESLVal $440 = _v55.termRef(3);
          
          switch($442.termName) {
          case "PVar": {ESLVal $446 = $442.termRef(0);
            ESLVal $445 = $442.termRef(1);
            ESLVal $444 = $442.termRef(2);
            
            {ESLVal l1 = $443;
            
            {ESLVal l2 = $446;
            
            {ESLVal n = $445;
            
            {ESLVal t = $444;
            
            {ESLVal e = $441;
            
            {ESLVal b = $440;
            
            if(isLast.boolVal)
            return new ESLVal("JBlock",ESLVal.list(new ESLVal("JFor",newName.apply(),n,expToJExp.apply(e),expToJCommand.apply(b,$false)),new ESLVal("JReturn",new ESLVal("JNull",new ESLVal[]{}))));
            else
              {ESLVal _v131 = $443;
                
                {ESLVal _v132 = $446;
                
                {ESLVal _v133 = $445;
                
                {ESLVal _v134 = $444;
                
                {ESLVal _v135 = $441;
                
                {ESLVal _v136 = $440;
                
                return new ESLVal("JFor",newName.apply(),_v133,expToJExp.apply(_v135),expToJCommand.apply(_v136,$false));
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
          default: {ESLVal l = $443;
            
            {ESLVal p = $442;
            
            {ESLVal e = $441;
            
            {ESLVal b = $440;
            
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
        default: {ESLVal e = _v55;
          
          if(isLast.boolVal)
          return new ESLVal("JReturn",expToJExp.apply(e));
          else
            {ESLVal _v141 = _v55;
              
              return new ESLVal("JStatement",expToJExp.apply(_v141));
            }
        }
      }
      }
    }
  });
  private static ESLVal expsToJExps = new ESLVal(new Function(new ESLVal("expsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal es = $args[0];
  return map.apply(new ESLVal(new Function(new ESLVal("fun698"),getSelf()) {
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
  {ESLVal _v54 = arms;
        
        if(_v54.isCons())
        {ESLVal $436 = _v54.head();
          ESLVal $437 = _v54.tail();
          
          switch($436.termName) {
          case "TArm": {ESLVal $439 = $436.termRef(0);
            ESLVal $438 = $436.termRef(1);
            
            {ESLVal n = $439;
            
            {ESLVal e = $438;
            
            {ESLVal _v130 = $437;
            
            return termArmsToJTermArms.apply(_v130,isLast).cons(new ESLVal("JTArm",n,$zero,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4226,4395)").add(ESLVal.list(_v54)));
        }
        }
      else if(_v54.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4226,4395)").add(ESLVal.list(_v54)));
      }
    }
  });
  private static ESLVal intArmsToJIntArms = new ESLVal(new Function(new ESLVal("intArmsToJIntArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v53 = arms;
        
        if(_v53.isCons())
        {ESLVal $432 = _v53.head();
          ESLVal $433 = _v53.tail();
          
          switch($432.termName) {
          case "IArm": {ESLVal $435 = $432.termRef(0);
            ESLVal $434 = $432.termRef(1);
            
            {ESLVal n = $435;
            
            {ESLVal e = $434;
            
            {ESLVal _v129 = $433;
            
            return intArmsToJIntArms.apply(_v129,isLast).cons(new ESLVal("JIArm",n,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4464,4628)").add(ESLVal.list(_v53)));
        }
        }
      else if(_v53.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4464,4628)").add(ESLVal.list(_v53)));
      }
    }
  });
  private static ESLVal strArmsToJStrArms = new ESLVal(new Function(new ESLVal("strArmsToJStrArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v52 = arms;
        
        if(_v52.isCons())
        {ESLVal $428 = _v52.head();
          ESLVal $429 = _v52.tail();
          
          switch($428.termName) {
          case "SArm": {ESLVal $431 = $428.termRef(0);
            ESLVal $430 = $428.termRef(1);
            
            {ESLVal s = $431;
            
            {ESLVal e = $430;
            
            {ESLVal _v128 = $429;
            
            return strArmsToJStrArms.apply(_v128,isLast).cons(new ESLVal("JSArm",s,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4697,4861)").add(ESLVal.list(_v52)));
        }
        }
      else if(_v52.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4697,4861)").add(ESLVal.list(_v52)));
      }
    }
  });
  private static ESLVal boolArmsToJBoolArms = new ESLVal(new Function(new ESLVal("boolArmsToJBoolArms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  ESLVal isLast = $args[1];
  {ESLVal _v51 = arms;
        
        if(_v51.isCons())
        {ESLVal $424 = _v51.head();
          ESLVal $425 = _v51.tail();
          
          switch($424.termName) {
          case "BoolArm": {ESLVal $427 = $424.termRef(0);
            ESLVal $426 = $424.termRef(1);
            
            {ESLVal b = $427;
            
            {ESLVal e = $426;
            
            {ESLVal _v127 = $425;
            
            return boolArmsToJBoolArms.apply(_v127,isLast).cons(new ESLVal("JBArm",b,expToJCommand.apply(e,isLast)));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(4936,5109)").add(ESLVal.list(_v51)));
        }
        }
      else if(_v51.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(4936,5109)").add(ESLVal.list(_v51)));
      }
    }
  });
  private static ESLVal opToJOp = new ESLVal(new Function(new ESLVal("opToJOp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal op = $args[0];
  {ESLVal _v50 = op;
        
        switch(_v50.strVal) {
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
        default: return error(new ESLVal("case error at Pos(5137,5489)").add(ESLVal.list(_v50)));
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
          {ESLVal _v47 = $qualArg;
                
                {ESLVal e = _v47;
                
                return ESLVal.list(ESLVal.list(new ESLVal("Binding",l,newName.apply(),$null,$null,e)));
              }
              }
            }
          }).map(es).flatten().flatten();
        
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v48 = $qualArg;
                
                switch(_v48.termName) {
                case "Binding": {ESLVal $423 = _v48.termRef(0);
                  ESLVal $422 = _v48.termRef(1);
                  ESLVal $421 = _v48.termRef(2);
                  ESLVal $420 = _v48.termRef(3);
                  ESLVal $419 = _v48.termRef(4);
                  
                  {ESLVal _v126 = $423;
                  
                  {ESLVal n = $422;
                  
                  {ESLVal dt = $421;
                  
                  {ESLVal t = $420;
                  
                  {ESLVal e = $419;
                  
                  return ESLVal.list(ESLVal.list(n));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v48;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(bindings).flatten().flatten();
        
        return expToJExp.apply(new ESLVal("Let",l,bindings,translateCases.apply(new ESLVal("Case",l,ESLVal.list(),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v49 = $qualArg;
              
              {ESLVal n = _v49;
              
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
  {ESLVal _v44 = e;
        
        switch(_v44.termName) {
        case "ArrayUpdate": {ESLVal $413 = _v44.termRef(0);
          ESLVal $412 = _v44.termRef(1);
          ESLVal $411 = _v44.termRef(2);
          ESLVal $410 = _v44.termRef(3);
          
          {ESLVal l = $413;
          
          {ESLVal a = $412;
          
          {ESLVal i = $411;
          
          {ESLVal v = $410;
          
          return new ESLVal("JArrayUpdate",expToJExp.apply(a),expToJExp.apply(i),expToJExp.apply(v));
        }
        }
        }
        }
        }
      case "ArrayRef": {ESLVal $409 = _v44.termRef(0);
          ESLVal $408 = _v44.termRef(1);
          ESLVal $407 = _v44.termRef(2);
          
          {ESLVal l = $409;
          
          {ESLVal a = $408;
          
          {ESLVal i = $407;
          
          return new ESLVal("JArrayRef",expToJExp.apply(a),expToJExp.apply(i));
        }
        }
        }
        }
      case "IntExp": {ESLVal $406 = _v44.termRef(0);
          ESLVal $405 = _v44.termRef(1);
          
          {ESLVal l = $406;
          
          {ESLVal n = $405;
          
          return new ESLVal("JConstExp",new ESLVal("JConstInt",n));
        }
        }
        }
      case "StrExp": {ESLVal $404 = _v44.termRef(0);
          ESLVal $403 = _v44.termRef(1);
          
          {ESLVal l = $404;
          
          {ESLVal s = $403;
          
          return new ESLVal("JConstExp",new ESLVal("JConstStr",s));
        }
        }
        }
      case "BoolExp": {ESLVal $402 = _v44.termRef(0);
          ESLVal $401 = _v44.termRef(1);
          
          {ESLVal l = $402;
          
          {ESLVal b = $401;
          
          return new ESLVal("JConstExp",new ESLVal("JConstBool",b));
        }
        }
        }
      case "FloatExp": {ESLVal $400 = _v44.termRef(0);
          ESLVal $399 = _v44.termRef(1);
          
          {ESLVal l = $400;
          
          {ESLVal f = $399;
          
          return new ESLVal("JConstExp",new ESLVal("JConstDouble",f));
        }
        }
        }
      case "ApplyTypeExp": {ESLVal $385 = _v44.termRef(0);
          ESLVal $384 = _v44.termRef(1);
          ESLVal $383 = _v44.termRef(2);
          
          switch($384.termName) {
          case "List": {ESLVal $392 = $384.termRef(0);
            ESLVal $391 = $384.termRef(1);
            
            if($391.isCons())
            {ESLVal $393 = $391.head();
              ESLVal $394 = $391.tail();
              
              {ESLVal l = $385;
              
              {ESLVal _v119 = $384;
              
              {ESLVal ts = $383;
              
              return expToJExp.apply(_v119);
            }
            }
            }
            }
          else if($391.isNil())
            if($383.isCons())
              {ESLVal $395 = $383.head();
                ESLVal $396 = $383.tail();
                
                if($396.isCons())
                {ESLVal $397 = $396.head();
                  ESLVal $398 = $396.tail();
                  
                  {ESLVal l = $385;
                  
                  {ESLVal _v120 = $384;
                  
                  {ESLVal ts = $383;
                  
                  return expToJExp.apply(_v120);
                }
                }
                }
                }
              else if($396.isNil())
                {ESLVal l1 = $385;
                  
                  {ESLVal l2 = $392;
                  
                  {ESLVal t = $395;
                  
                  return new ESLVal("JNil",$null);
                }
                }
                }
              else {ESLVal l = $385;
                  
                  {ESLVal _v121 = $384;
                  
                  {ESLVal ts = $383;
                  
                  return expToJExp.apply(_v121);
                }
                }
                }
              }
            else if($383.isNil())
              {ESLVal l = $385;
                
                {ESLVal _v122 = $384;
                
                {ESLVal ts = $383;
                
                return expToJExp.apply(_v122);
              }
              }
              }
            else {ESLVal l = $385;
                
                {ESLVal _v123 = $384;
                
                {ESLVal ts = $383;
                
                return expToJExp.apply(_v123);
              }
              }
              }
          else {ESLVal l = $385;
              
              {ESLVal _v124 = $384;
              
              {ESLVal ts = $383;
              
              return expToJExp.apply(_v124);
            }
            }
            }
          }
        case "NullExp": {ESLVal $386 = $384.termRef(0);
            
            if($383.isCons())
            {ESLVal $387 = $383.head();
              ESLVal $388 = $383.tail();
              
              if($388.isCons())
              {ESLVal $389 = $388.head();
                ESLVal $390 = $388.tail();
                
                {ESLVal l = $385;
                
                {ESLVal _v115 = $384;
                
                {ESLVal ts = $383;
                
                return expToJExp.apply(_v115);
              }
              }
              }
              }
            else if($388.isNil())
              {ESLVal l1 = $385;
                
                {ESLVal l2 = $386;
                
                {ESLVal t = $387;
                
                return new ESLVal("JNull",new ESLVal[]{});
              }
              }
              }
            else {ESLVal l = $385;
                
                {ESLVal _v116 = $384;
                
                {ESLVal ts = $383;
                
                return expToJExp.apply(_v116);
              }
              }
              }
            }
          else if($383.isNil())
            {ESLVal l = $385;
              
              {ESLVal _v117 = $384;
              
              {ESLVal ts = $383;
              
              return expToJExp.apply(_v117);
            }
            }
            }
          else {ESLVal l = $385;
              
              {ESLVal _v118 = $384;
              
              {ESLVal ts = $383;
              
              return expToJExp.apply(_v118);
            }
            }
            }
          }
          default: {ESLVal l = $385;
            
            {ESLVal _v125 = $384;
            
            {ESLVal ts = $383;
            
            return expToJExp.apply(_v125);
          }
          }
          }
        }
        }
      case "List": {ESLVal $382 = _v44.termRef(0);
          ESLVal $381 = _v44.termRef(1);
          
          {ESLVal l = $382;
          
          {ESLVal es = $381;
          
          return new ESLVal("JList",$null,expsToJExps.apply(es));
        }
        }
        }
      case "SetExp": {ESLVal $380 = _v44.termRef(0);
          ESLVal $379 = _v44.termRef(1);
          
          {ESLVal l = $380;
          
          {ESLVal es = $379;
          
          return new ESLVal("JSet",$null,expsToJExps.apply(es));
        }
        }
        }
      case "BagExp": {ESLVal $378 = _v44.termRef(0);
          ESLVal $377 = _v44.termRef(1);
          
          {ESLVal l = $378;
          
          {ESLVal es = $377;
          
          return new ESLVal("JBag",$null,expsToJExps.apply(es));
        }
        }
        }
      case "Term": {ESLVal $376 = _v44.termRef(0);
          ESLVal $375 = _v44.termRef(1);
          ESLVal $374 = _v44.termRef(2);
          ESLVal $373 = _v44.termRef(3);
          
          {ESLVal l = $376;
          
          {ESLVal n = $375;
          
          {ESLVal ts = $374;
          
          {ESLVal es = $373;
          
          return new ESLVal("JTerm",n,expsToJExps.apply(es));
        }
        }
        }
        }
        }
      case "Case": {ESLVal $372 = _v44.termRef(0);
          ESLVal $371 = _v44.termRef(1);
          ESLVal $370 = _v44.termRef(2);
          ESLVal $369 = _v44.termRef(3);
          
          {ESLVal l = $372;
          
          {ESLVal ds = $371;
          
          {ESLVal es = $370;
          
          {ESLVal arms = $369;
          
          return caseToJExp.apply(l,es,arms);
        }
        }
        }
        }
        }
      case "CaseAdd": {ESLVal $368 = _v44.termRef(0);
          ESLVal $367 = _v44.termRef(1);
          ESLVal $366 = _v44.termRef(2);
          ESLVal $365 = _v44.termRef(3);
          
          {ESLVal l = $368;
          
          {ESLVal s = $367;
          
          {ESLVal handler = $366;
          
          {ESLVal fail = $365;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "CaseList": {ESLVal $364 = _v44.termRef(0);
          ESLVal $363 = _v44.termRef(1);
          ESLVal $362 = _v44.termRef(2);
          ESLVal $361 = _v44.termRef(3);
          ESLVal $360 = _v44.termRef(4);
          
          {ESLVal l = $364;
          
          {ESLVal list = $363;
          
          {ESLVal cons = $362;
          
          {ESLVal nil = $361;
          
          {ESLVal alt = $360;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
        }
      case "CaseTerm": {ESLVal $359 = _v44.termRef(0);
          ESLVal $358 = _v44.termRef(1);
          ESLVal $357 = _v44.termRef(2);
          ESLVal $356 = _v44.termRef(3);
          
          {ESLVal l = $359;
          
          {ESLVal list = $358;
          
          {ESLVal arms = $357;
          
          {ESLVal alt = $356;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseStr": {ESLVal $355 = _v44.termRef(0);
          ESLVal $354 = _v44.termRef(1);
          ESLVal $353 = _v44.termRef(2);
          ESLVal $352 = _v44.termRef(3);
          
          {ESLVal l = $355;
          
          {ESLVal s = $354;
          
          {ESLVal arms = $353;
          
          {ESLVal alt = $352;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseBool": {ESLVal $351 = _v44.termRef(0);
          ESLVal $350 = _v44.termRef(1);
          ESLVal $349 = _v44.termRef(2);
          ESLVal $348 = _v44.termRef(3);
          
          {ESLVal l = $351;
          
          {ESLVal s = $350;
          
          {ESLVal arms = $349;
          
          {ESLVal alt = $348;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "CaseSet": {ESLVal $347 = _v44.termRef(0);
          ESLVal $346 = _v44.termRef(1);
          ESLVal $345 = _v44.termRef(2);
          ESLVal $344 = _v44.termRef(3);
          
          {ESLVal l = $347;
          
          {ESLVal s = $346;
          
          {ESLVal handler = $345;
          
          {ESLVal fail = $344;
          
          return expToJExp.apply(new ESLVal("Apply",l,new ESLVal("Var",l,new ESLVal("$ndCase")),ESLVal.list(s,handler,fail)));
        }
        }
        }
        }
        }
      case "Head": {ESLVal $343 = _v44.termRef(0);
          
          {ESLVal _v114 = $343;
          
          return new ESLVal("JHead",expToJExp.apply(_v114));
        }
        }
      case "Tail": {ESLVal $342 = _v44.termRef(0);
          
          {ESLVal _v113 = $342;
          
          return new ESLVal("JTail",expToJExp.apply(_v113));
        }
        }
      case "CaseError": {ESLVal $341 = _v44.termRef(0);
          ESLVal $340 = _v44.termRef(1);
          
          {ESLVal l = $341;
          
          {ESLVal _v112 = $340;
          
          return new ESLVal("JError",new ESLVal("JBinExp",new ESLVal("JConstExp",new ESLVal("JConstStr",new ESLVal("case error at ").add(l))),new ESLVal("add"),expToJExp.apply(_v112)));
        }
        }
        }
      case "NullExp": {ESLVal $339 = _v44.termRef(0);
          
          {ESLVal l = $339;
          
          return new ESLVal("JNull",new ESLVal[]{});
        }
        }
      case "Var": {ESLVal $338 = _v44.termRef(0);
          ESLVal $337 = _v44.termRef(1);
          
          {ESLVal l = $338;
          
          {ESLVal n = $337;
          
          return new ESLVal("JVar",n,$null);
        }
        }
        }
      case "Let": {ESLVal $336 = _v44.termRef(0);
          ESLVal $335 = _v44.termRef(1);
          ESLVal $334 = _v44.termRef(2);
          
          {ESLVal l = $336;
          
          {ESLVal bs = $335;
          
          {ESLVal body = $334;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Letrec": {ESLVal $333 = _v44.termRef(0);
          ESLVal $332 = _v44.termRef(1);
          ESLVal $331 = _v44.termRef(2);
          
          {ESLVal l = $333;
          
          {ESLVal bs = $332;
          
          {ESLVal body = $331;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Throw": {ESLVal $330 = _v44.termRef(0);
          ESLVal $329 = _v44.termRef(1);
          ESLVal $328 = _v44.termRef(2);
          
          {ESLVal l = $330;
          
          {ESLVal t = $329;
          
          {ESLVal _v111 = $328;
          
          return new ESLVal("JError",expToJExp.apply(_v111));
        }
        }
        }
        }
      case "Apply": {ESLVal $327 = _v44.termRef(0);
          ESLVal $326 = _v44.termRef(1);
          ESLVal $325 = _v44.termRef(2);
          
          {ESLVal l = $327;
          
          {ESLVal op = $326;
          
          {ESLVal args = $325;
          
          return new ESLVal("JApply",expToJExp.apply(op),expsToJExps.apply(args));
        }
        }
        }
        }
      case "BinExp": {ESLVal $324 = _v44.termRef(0);
          ESLVal $323 = _v44.termRef(1);
          ESLVal $322 = _v44.termRef(2);
          ESLVal $321 = _v44.termRef(3);
          
          {ESLVal l = $324;
          
          {ESLVal e1 = $323;
          
          {ESLVal op = $322;
          
          {ESLVal e2 = $321;
          
          return new ESLVal("JBinExp",expToJExp.apply(e1),opToJOp.apply(op),expToJExp.apply(e2));
        }
        }
        }
        }
        }
      case "Become": {ESLVal $317 = _v44.termRef(0);
          ESLVal $316 = _v44.termRef(1);
          
          switch($316.termName) {
          case "Apply": {ESLVal $320 = $316.termRef(0);
            ESLVal $319 = $316.termRef(1);
            ESLVal $318 = $316.termRef(2);
            
            {ESLVal l = $317;
            
            {ESLVal al = $320;
            
            {ESLVal b = $319;
            
            {ESLVal args = $318;
            
            return new ESLVal("JBecome",expToJExp.apply(b),expsToJExps.apply(args));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5847,14312)").add(ESLVal.list(_v44)));
        }
        }
      case "Block": {ESLVal $311 = _v44.termRef(0);
          ESLVal $310 = _v44.termRef(1);
          
          if($310.isCons())
          {ESLVal $312 = $310.head();
            ESLVal $313 = $310.tail();
            
            if($313.isCons())
            {ESLVal $314 = $313.head();
              ESLVal $315 = $313.tail();
              
              {ESLVal l = $311;
              
              {ESLVal es = $310;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
            }
          else if($313.isNil())
            {ESLVal l = $311;
              
              {ESLVal _v110 = $312;
              
              return expToJExp.apply(_v110);
            }
            }
          else {ESLVal l = $311;
              
              {ESLVal es = $310;
              
              return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
            }
            }
          }
        else if($310.isNil())
          {ESLVal l = $311;
            
            return new ESLVal("JNull",new ESLVal[]{});
          }
        else {ESLVal l = $311;
            
            {ESLVal es = $310;
            
            return new ESLVal("JCommandExp",new ESLVal("JBlock",expsToJCommands.apply(es,$true)),$null);
          }
          }
        }
      case "If": {ESLVal $309 = _v44.termRef(0);
          ESLVal $308 = _v44.termRef(1);
          ESLVal $307 = _v44.termRef(2);
          ESLVal $306 = _v44.termRef(3);
          
          {ESLVal l = $309;
          
          {ESLVal e1 = $308;
          
          {ESLVal e2 = $307;
          
          {ESLVal e3 = $306;
          
          return new ESLVal("JCommandExp",new ESLVal("JIfCommand",expToJExp.apply(e1),expToJCommand.apply(e2,$true),expToJCommand.apply(e3,$true)),$null);
        }
        }
        }
        }
        }
      case "FunExp": {ESLVal $305 = _v44.termRef(0);
          ESLVal $304 = _v44.termRef(1);
          ESLVal $303 = _v44.termRef(2);
          ESLVal $302 = _v44.termRef(3);
          ESLVal $301 = _v44.termRef(4);
          
          {ESLVal l = $305;
          
          {ESLVal n = $304;
          
          {ESLVal args = $303;
          
          {ESLVal t = $302;
          
          {ESLVal body = $301;
          
          return new ESLVal("JFun",expToJExp.apply(n),map.apply(new ESLVal(new Function(new ESLVal("fun699"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal d = $args[0];
          return decToJDec.apply(d);
            }
          }),args),new ESLVal("JFunType",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v46 = $qualArg;
                
                {ESLVal a = _v46;
                
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
      case "TermRef": {ESLVal $300 = _v44.termRef(0);
          ESLVal $299 = _v44.termRef(1);
          
          {ESLVal _v109 = $300;
          
          {ESLVal i = $299;
          
          return new ESLVal("JTermRef",expToJExp.apply(_v109),i);
        }
        }
        }
      case "Cmp": {ESLVal $298 = _v44.termRef(0);
          ESLVal $297 = _v44.termRef(1);
          ESLVal $296 = _v44.termRef(2);
          
          {ESLVal l = $298;
          
          {ESLVal _v108 = $297;
          
          {ESLVal qs = $296;
          
          return cmpToJExp.apply(_v108,qs);
        }
        }
        }
        }
      case "Not": {ESLVal $295 = _v44.termRef(0);
          ESLVal $294 = _v44.termRef(1);
          
          {ESLVal l = $295;
          
          {ESLVal _v107 = $294;
          
          return new ESLVal("JNot",expToJExp.apply(_v107));
        }
        }
        }
      case "New": {ESLVal $293 = _v44.termRef(0);
          ESLVal $292 = _v44.termRef(1);
          ESLVal $291 = _v44.termRef(2);
          
          {ESLVal l = $293;
          
          {ESLVal b = $292;
          
          {ESLVal args = $291;
          
          return new ESLVal("JNew",expToJExp.apply(b),expsToJExps.apply(args));
        }
        }
        }
        }
      case "NewArray": {ESLVal $290 = _v44.termRef(0);
          ESLVal $289 = _v44.termRef(1);
          ESLVal $288 = _v44.termRef(2);
          
          {ESLVal l = $290;
          
          {ESLVal t = $289;
          
          {ESLVal i = $288;
          
          return new ESLVal("JNewArray",expToJExp.apply(i));
        }
        }
        }
        }
      case "NewJava": {ESLVal $287 = _v44.termRef(0);
          ESLVal $286 = _v44.termRef(1);
          ESLVal $285 = _v44.termRef(2);
          ESLVal $284 = _v44.termRef(3);
          
          {ESLVal l = $287;
          
          {ESLVal n = $286;
          
          {ESLVal t = $285;
          
          {ESLVal args = $284;
          
          return new ESLVal("JNewJava",n,expsToJExps.apply(args));
        }
        }
        }
        }
        }
      case "NewTable": {ESLVal $283 = _v44.termRef(0);
          ESLVal $282 = _v44.termRef(1);
          ESLVal $281 = _v44.termRef(2);
          
          {ESLVal l = $283;
          
          {ESLVal key = $282;
          
          {ESLVal value = $281;
          
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
        }
        }
        }
      case "Record": {ESLVal $280 = _v44.termRef(0);
          ESLVal $279 = _v44.termRef(1);
          
          {ESLVal l = $280;
          
          {ESLVal fs = $279;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v45 = $qualArg;
                
                switch(_v45.termName) {
                case "Binding": {ESLVal $418 = _v45.termRef(0);
                  ESLVal $417 = _v45.termRef(1);
                  ESLVal $416 = _v45.termRef(2);
                  ESLVal $415 = _v45.termRef(3);
                  ESLVal $414 = _v45.termRef(4);
                  
                  {ESLVal bl = $418;
                  
                  {ESLVal n = $417;
                  
                  {ESLVal t = $416;
                  
                  {ESLVal dt = $415;
                  
                  {ESLVal _v106 = $414;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,$null,expToJExp.apply(_v106))));
                }
                }
                }
                }
                }
                }
                default: {ESLVal _0 = _v45;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
        }
      case "Send": {ESLVal $274 = _v44.termRef(0);
          ESLVal $273 = _v44.termRef(1);
          ESLVal $272 = _v44.termRef(2);
          
          switch($272.termName) {
          case "Term": {ESLVal $278 = $272.termRef(0);
            ESLVal $277 = $272.termRef(1);
            ESLVal $276 = $272.termRef(2);
            ESLVal $275 = $272.termRef(3);
            
            {ESLVal l = $274;
            
            {ESLVal a = $273;
            
            {ESLVal lt = $278;
            
            {ESLVal n = $277;
            
            {ESLVal ts = $276;
            
            {ESLVal es = $275;
            
            return new ESLVal("JSend",expToJExp.apply(a),n,expsToJExps.apply(es));
          }
          }
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(5847,14312)").add(ESLVal.list(_v44)));
        }
        }
      case "SendTimeSuper": {ESLVal $271 = _v44.termRef(0);
          
          {ESLVal l = $271;
          
          return new ESLVal("JSendTimeSuper",new ESLVal[]{});
        }
        }
      case "SendSuper": {ESLVal $270 = _v44.termRef(0);
          ESLVal $269 = _v44.termRef(1);
          
          {ESLVal l = $270;
          
          {ESLVal _v105 = $269;
          
          return new ESLVal("JSendSuper",expToJExp.apply(_v105));
        }
        }
        }
      case "Self": {ESLVal $268 = _v44.termRef(0);
          
          {ESLVal l = $268;
          
          return new ESLVal("JSelf",new ESLVal[]{});
        }
        }
      case "Fold": {ESLVal $267 = _v44.termRef(0);
          ESLVal $266 = _v44.termRef(1);
          ESLVal $265 = _v44.termRef(2);
          
          {ESLVal l = $267;
          
          {ESLVal t = $266;
          
          {ESLVal _v104 = $265;
          
          return expToJExp.apply(_v104);
        }
        }
        }
        }
      case "Now": {ESLVal $264 = _v44.termRef(0);
          
          {ESLVal l = $264;
          
          return new ESLVal("JNow",new ESLVal[]{});
        }
        }
      case "Ref": {ESLVal $263 = _v44.termRef(0);
          ESLVal $262 = _v44.termRef(1);
          ESLVal $261 = _v44.termRef(2);
          
          {ESLVal l = $263;
          
          {ESLVal _v103 = $262;
          
          {ESLVal n = $261;
          
          return new ESLVal("JRef",expToJExp.apply(_v103),n);
        }
        }
        }
        }
      case "RefSuper": {ESLVal $260 = _v44.termRef(0);
          ESLVal $259 = _v44.termRef(1);
          
          {ESLVal l = $260;
          
          {ESLVal n = $259;
          
          return new ESLVal("JRefSuper",n);
        }
        }
        }
      case "For": {ESLVal $258 = _v44.termRef(0);
          ESLVal $257 = _v44.termRef(1);
          ESLVal $256 = _v44.termRef(2);
          ESLVal $255 = _v44.termRef(3);
          
          {ESLVal l1 = $258;
          
          {ESLVal p = $257;
          
          {ESLVal l2 = $256;
          
          {ESLVal c = $255;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
        }
      case "Grab": {ESLVal $254 = _v44.termRef(0);
          ESLVal $253 = _v44.termRef(1);
          ESLVal $252 = _v44.termRef(2);
          
          {ESLVal l = $254;
          
          {ESLVal refs = $253;
          
          {ESLVal _v102 = $252;
          
          return new ESLVal("JGrab",refsToJExps.apply(refs),expToJExp.apply(_v102));
        }
        }
        }
        }
      case "Update": {ESLVal $251 = _v44.termRef(0);
          ESLVal $250 = _v44.termRef(1);
          ESLVal $249 = _v44.termRef(2);
          
          {ESLVal l = $251;
          
          {ESLVal n = $250;
          
          {ESLVal v = $249;
          
          return new ESLVal("JCommandExp",expToJCommand.apply(e,$true),$null);
        }
        }
        }
        }
      case "Probably": {ESLVal $248 = _v44.termRef(0);
          ESLVal $247 = _v44.termRef(1);
          ESLVal $246 = _v44.termRef(2);
          ESLVal $245 = _v44.termRef(3);
          ESLVal $244 = _v44.termRef(4);
          
          {ESLVal l = $248;
          
          {ESLVal _v101 = $247;
          
          {ESLVal t = $246;
          
          {ESLVal e1 = $245;
          
          {ESLVal e2 = $244;
          
          return new ESLVal("JProbably",expToJExp.apply(_v101),expToJExp.apply(e1),expToJExp.apply(e2));
        }
        }
        }
        }
        }
        }
      case "Try": {ESLVal $243 = _v44.termRef(0);
          ESLVal $242 = _v44.termRef(1);
          ESLVal $241 = _v44.termRef(2);
          
          {ESLVal l = $243;
          
          {ESLVal _v100 = $242;
          
          {ESLVal arms = $241;
          
          return new ESLVal("JTry",expToJExp.apply(_v100),new ESLVal("$x"),expToJCommand.apply(new ESLVal("Case",l,$nil,ESLVal.list(new ESLVal("Var",l,new ESLVal("$x"))),arms),$true));
        }
        }
        }
        }
      case "ActExp": {ESLVal $240 = _v44.termRef(0);
          ESLVal $239 = _v44.termRef(1);
          ESLVal $238 = _v44.termRef(2);
          ESLVal $237 = _v44.termRef(3);
          ESLVal $236 = _v44.termRef(4);
          ESLVal $235 = _v44.termRef(5);
          ESLVal $234 = _v44.termRef(6);
          ESLVal $233 = _v44.termRef(7);
          
          {ESLVal l = $240;
          
          {ESLVal name = $239;
          
          {ESLVal decs = $238;
          
          {ESLVal exports = $237;
          
          {ESLVal parent = $236;
          
          {ESLVal defs = $235;
          
          {ESLVal init = $234;
          
          {ESLVal arms = $233;
          
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
        default: return error(new ESLVal("case error at Pos(5847,14312)").add(ESLVal.list(_v44)));
      }
      }
    }
  });
  private static ESLVal refsToJExps = new ESLVal(new Function(new ESLVal("refsToJExps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal refs = $args[0];
  {ESLVal _v43 = refs;
        
        if(_v43.isCons())
        {ESLVal $224 = _v43.head();
          ESLVal $225 = _v43.tail();
          
          switch($224.termName) {
          case "VarDynamicRef": {ESLVal $230 = $224.termRef(0);
            ESLVal $229 = $224.termRef(1);
            
            switch($229.termName) {
            case "Var": {ESLVal $232 = $229.termRef(0);
              ESLVal $231 = $229.termRef(1);
              
              {ESLVal l = $230;
              
              {ESLVal vl = $232;
              
              {ESLVal n = $231;
              
              {ESLVal _v99 = $225;
              
              return refsToJExps.apply(_v99).cons(new ESLVal("JVar",n,$null));
            }
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(14355,14596)").add(ESLVal.list(_v43)));
          }
          }
        case "ActorDynamicRef": {ESLVal $228 = $224.termRef(0);
            ESLVal $227 = $224.termRef(1);
            ESLVal $226 = $224.termRef(2);
            
            {ESLVal l = $228;
            
            {ESLVal e = $227;
            
            {ESLVal n = $226;
            
            {ESLVal _v98 = $225;
            
            return refsToJExps.apply(_v98).cons(new ESLVal("JRef",expToJExp.apply(e),n));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(14355,14596)").add(ESLVal.list(_v43)));
        }
        }
      else if(_v43.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(14355,14596)").add(ESLVal.list(_v43)));
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
        {ESLVal _v42 = $qualArg;
              
              {ESLVal b = _v42;
              
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
        {ESLVal _v41 = $qualArg;
              
              {ESLVal b = _v41;
              
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
  {ESLVal _v40 = a;
        
        switch(_v40.termName) {
        case "BArm": {ESLVal $215 = _v40.termRef(0);
          ESLVal $214 = _v40.termRef(1);
          ESLVal $213 = _v40.termRef(2);
          ESLVal $212 = _v40.termRef(3);
          
          if($214.isCons())
          {ESLVal $216 = $214.head();
            ESLVal $217 = $214.tail();
            
            switch($216.termName) {
            case "PTerm": {ESLVal $221 = $216.termRef(0);
              ESLVal $220 = $216.termRef(1);
              ESLVal $219 = $216.termRef(2);
              ESLVal $218 = $216.termRef(3);
              
              switch($220.strVal) {
              case "Time": if($217.isCons())
                {ESLVal $222 = $217.head();
                  ESLVal $223 = $217.tail();
                  
                  {ESLVal _v91 = _v40;
                  
                  return $false;
                }
                }
              else if($217.isNil())
                {ESLVal l = $215;
                  
                  {ESLVal pl = $221;
                  
                  {ESLVal ts = $219;
                  
                  {ESLVal ps = $218;
                  
                  {ESLVal g = $213;
                  
                  {ESLVal e = $212;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v92 = _v40;
                  
                  return $false;
                }
              default: {ESLVal _v93 = _v40;
                
                return $false;
              }
            }
            }
            default: {ESLVal _v94 = _v40;
              
              return $false;
            }
          }
          }
        else if($214.isNil())
          {ESLVal _v95 = _v40;
            
            return $false;
          }
        else {ESLVal _v96 = _v40;
            
            return $false;
          }
        }
        default: {ESLVal _v97 = _v40;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal timeArmsToJCommand = new ESLVal(new Function(new ESLVal("timeArmsToJCommand"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal arms = $args[0];
  {ESLVal _v39 = arms;
        
        if(_v39.isCons())
        {ESLVal $181 = _v39.head();
          ESLVal $182 = _v39.tail();
          
          switch($181.termName) {
          case "BArm": {ESLVal $186 = $181.termRef(0);
            ESLVal $185 = $181.termRef(1);
            ESLVal $184 = $181.termRef(2);
            ESLVal $183 = $181.termRef(3);
            
            if($185.isCons())
            {ESLVal $187 = $185.head();
              ESLVal $188 = $185.tail();
              
              switch($187.termName) {
              case "PTerm": {ESLVal $192 = $187.termRef(0);
                ESLVal $191 = $187.termRef(1);
                ESLVal $190 = $187.termRef(2);
                ESLVal $189 = $187.termRef(3);
                
                switch($191.strVal) {
                case "Time": if($190.isCons())
                  {ESLVal $193 = $190.head();
                    ESLVal $194 = $190.tail();
                    
                    return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                  }
                else if($190.isNil())
                  if($189.isCons())
                    {ESLVal $195 = $189.head();
                      ESLVal $196 = $189.tail();
                      
                      switch($195.termName) {
                      case "PVar": {ESLVal $207 = $195.termRef(0);
                        ESLVal $206 = $195.termRef(1);
                        ESLVal $205 = $195.termRef(2);
                        
                        if($196.isCons())
                        {ESLVal $208 = $196.head();
                          ESLVal $209 = $196.tail();
                          
                          return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                        }
                      else if($196.isNil())
                        if($188.isCons())
                          {ESLVal $210 = $188.head();
                            ESLVal $211 = $188.tail();
                            
                            return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                          }
                        else if($188.isNil())
                          {ESLVal l = $186;
                            
                            {ESLVal tl = $192;
                            
                            {ESLVal vl = $207;
                            
                            {ESLVal n = $206;
                            
                            {ESLVal t = $205;
                            
                            {ESLVal g = $184;
                            
                            {ESLVal e = $183;
                            
                            {ESLVal _v90 = $182;
                            
                            return new ESLVal("JLet",ESLVal.list(new ESLVal("JField",n,$null,new ESLVal("JVar",new ESLVal("$t"),$null))),new ESLVal("JIfCommand",expToJExp.apply(g),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v90)));
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                          }
                        else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                      else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                      }
                    case "PInt": {ESLVal $198 = $195.termRef(0);
                        ESLVal $197 = $195.termRef(1);
                        
                        if($196.isCons())
                        {ESLVal $199 = $196.head();
                          ESLVal $200 = $196.tail();
                          
                          return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                        }
                      else if($196.isNil())
                        if($188.isCons())
                          {ESLVal $201 = $188.head();
                            ESLVal $202 = $188.tail();
                            
                            return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                          }
                        else if($188.isNil())
                          switch($184.termName) {
                            case "BoolExp": {ESLVal $204 = $184.termRef(0);
                              ESLVal $203 = $184.termRef(1);
                              
                              switch($203.boolVal ? 1 : 0) {
                              case 1: {ESLVal l = $186;
                                
                                {ESLVal tl = $192;
                                
                                {ESLVal vl = $198;
                                
                                {ESLVal n = $197;
                                
                                {ESLVal bl = $204;
                                
                                {ESLVal e = $183;
                                
                                {ESLVal _v89 = $182;
                                
                                return new ESLVal("JIfCommand",new ESLVal("JBinExp",new ESLVal("JVar",new ESLVal("$t"),$null),new ESLVal("eq"),new ESLVal("JConstExp",new ESLVal("JConstInt",n))),expToJCommand.apply(e,$false),timeArmsToJCommand.apply(_v89));
                              }
                              }
                              }
                              }
                              }
                              }
                              }
                              default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                          }
                        else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                      else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                      }
                      default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                    }
                    }
                  else if($189.isNil())
                    return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                  else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
                default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
              }
              }
              default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
            }
            }
          else if($185.isNil())
            return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
          else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
          }
          default: return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
        }
        }
      else if(_v39.isNil())
        return new ESLVal("JBlock",ESLVal.list());
      else return error(new ESLVal("case error at Pos(16697,17227)").add(ESLVal.list(_v39)));
      }
    }
  });
  private static ESLVal cmpToJExp = new ESLVal(new Function(new ESLVal("cmpToJExp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal qs = $args[1];
  {ESLVal _v38 = qs;
        
        if(_v38.isCons())
        {ESLVal $174 = _v38.head();
          ESLVal $175 = _v38.tail();
          
          switch($174.termName) {
          case "BQual": {ESLVal $180 = $174.termRef(0);
            ESLVal $179 = $174.termRef(1);
            ESLVal $178 = $174.termRef(2);
            
            {ESLVal l = $180;
            
            {ESLVal p = $179;
            
            {ESLVal v = $178;
            
            {ESLVal _v88 = $175;
            
            {ESLVal f = new ESLVal("FunExp",new ESLVal("Pos",$zero,$zero),new ESLVal("StrExp",new ESLVal("Pos",$zero,$zero),new ESLVal("qual")),ESLVal.list(new ESLVal("Dec",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"),$null,$null)),$null,new ESLVal("Case",new ESLVal("Pos",$zero,$zero),ESLVal.list(),ESLVal.list(new ESLVal("Var",new ESLVal("Pos",$zero,$zero),new ESLVal("$qualArg"))),ESLVal.list(new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(p),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("Cmp",new ESLVal("Pos",$zero,$zero),e,_v88)))),new ESLVal("BArm",new ESLVal("Pos",$zero,$zero),ESLVal.list(new ESLVal("PVar",new ESLVal("Pos",$zero,$zero),new ESLVal("_0"),$null)),new ESLVal("BoolExp",new ESLVal("Pos",$zero,$zero),$true),new ESLVal("List",new ESLVal("Pos",$zero,$zero),$nil)))));
            
            return new ESLVal("JFlatten",new ESLVal("JFlatten",new ESLVal("JMapFun",expToJExp.apply(f),expToJExp.apply(v))));
          }
          }
          }
          }
          }
          }
        case "PQual": {ESLVal $177 = $174.termRef(0);
            ESLVal $176 = $174.termRef(1);
            
            {ESLVal l = $177;
            
            {ESLVal p = $176;
            
            {ESLVal _v87 = $175;
            
            return new ESLVal("JIfExp",expToJExp.apply(p),cmpToJExp.apply(e,_v87),new ESLVal("JNil",$null));
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(17274,17942)").add(ESLVal.list(_v38)));
        }
        }
      else if(_v38.isNil())
        return new ESLVal("JList",$null,ESLVal.list(expToJExp.apply(e)));
      else return error(new ESLVal("case error at Pos(17274,17942)").add(ESLVal.list(_v38)));
      }
    }
  });
  public static ESLVal moduleToJava = new ESLVal(new Function(new ESLVal("moduleToJava"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal module = $args[0];
  {ESLVal _v36 = module;
        
        switch(_v36.termName) {
        case "Module": {ESLVal $173 = _v36.termRef(0);
          ESLVal $172 = _v36.termRef(1);
          ESLVal $171 = _v36.termRef(2);
          ESLVal $170 = _v36.termRef(3);
          ESLVal $169 = _v36.termRef(4);
          ESLVal $168 = _v36.termRef(5);
          ESLVal $167 = _v36.termRef(6);
          
          {ESLVal path = $173;
          
          {ESLVal name = $172;
          
          {ESLVal exports = $171;
          
          {ESLVal imports = $170;
          
          {ESLVal x = $169;
          
          {ESLVal y = $168;
          
          {ESLVal defs = $167;
          
          return renameJVarsModule.apply(new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v37 = $qualArg;
                
                {ESLVal d = _v37;
                
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
        default: return error(new ESLVal("case error at Pos(17980,18223)").add(ESLVal.list(_v36)));
      }
      }
    }
  });
  private static ESLVal renameJVarsModule = new ESLVal(new Function(new ESLVal("renameJVarsModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v33 = m;
        
        switch(_v33.termName) {
        case "JModule": {ESLVal $160 = _v33.termRef(0);
          ESLVal $159 = _v33.termRef(1);
          ESLVal $158 = _v33.termRef(2);
          ESLVal $157 = _v33.termRef(3);
          
          {ESLVal name = $160;
          
          {ESLVal exports = $159;
          
          {ESLVal imports = $158;
          
          {ESLVal fs = $157;
          
          {ESLVal fieldNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v34 = $qualArg;
                  
                  switch(_v34.termName) {
                  case "JField": {ESLVal $163 = _v34.termRef(0);
                    ESLVal $162 = _v34.termRef(1);
                    ESLVal $161 = _v34.termRef(2);
                    
                    {ESLVal n = $163;
                    
                    {ESLVal t = $162;
                    
                    {ESLVal e = $161;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  }
                  default: {ESLVal _0 = _v34;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(fs).flatten().flatten();
          
          return new ESLVal("JModule",name,exports,imports,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v35 = $qualArg;
                
                switch(_v35.termName) {
                case "JField": {ESLVal $166 = _v35.termRef(0);
                  ESLVal $165 = _v35.termRef(1);
                  ESLVal $164 = _v35.termRef(2);
                  
                  {ESLVal n = $166;
                  
                  {ESLVal t = $165;
                  
                  {ESLVal e = $164;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(e,fieldNames,emptyTable))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v35;
                  
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
        default: return error(new ESLVal("case error at Pos(18263,18570)").add(ESLVal.list(_v33)));
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
        case "JFun": {ESLVal $145 = _v16.termRef(0);
          ESLVal $144 = _v16.termRef(1);
          ESLVal $143 = _v16.termRef(2);
          ESLVal $142 = _v16.termRef(3);
          
          {ESLVal v0 = $145;
          
          {ESLVal v1 = $144;
          
          {ESLVal v2 = $143;
          
          {ESLVal v3 = $142;
          
          {ESLVal boundNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v30 = $qualArg;
                  
                  switch(_v30.termName) {
                  case "JDec": {ESLVal $156 = _v30.termRef(0);
                    ESLVal $155 = _v30.termRef(1);
                    
                    {ESLVal n = $156;
                    
                    {ESLVal t = $155;
                    
                    return ESLVal.list(ESLVal.list(n));
                  }
                  }
                  }
                  default: {ESLVal _0 = _v30;
                    
                    return ESLVal.list();
                  }
                }
                }
              }
            }).map(v1).flatten().flatten();
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun700"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal n = $args[0];
        return member.apply(n,boundNames);
          }
        }),vars).boolVal)
          {ESLVal newNames = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal $qualArg = $args[0];
              {ESLVal _v31 = $qualArg;
                    
                    {ESLVal n = _v31;
                    
                    return ESLVal.list(ESLVal.list(newName.apply()));
                  }
                  }
                }
              }).map(boundNames).flatten().flatten();
            
            {ESLVal env1 = addEntries.apply(boundNames,newNames,env);
            
            return new ESLVal("JFun",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v32 = $qualArg;
                  
                  {ESLVal n = _v32;
                  
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
      case "JApply": {ESLVal $141 = _v16.termRef(0);
          ESLVal $140 = _v16.termRef(1);
          
          {ESLVal v0 = $141;
          
          {ESLVal v1 = $140;
          
          return new ESLVal("JApply",renameJVarsExp.apply(v0,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v29 = $qualArg;
                
                {ESLVal v = _v29;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JArrayRef": {ESLVal $139 = _v16.termRef(0);
          ESLVal $138 = _v16.termRef(1);
          
          {ESLVal a = $139;
          
          {ESLVal i = $138;
          
          return new ESLVal("JArrayRef",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env));
        }
        }
        }
      case "JArrayUpdate": {ESLVal $137 = _v16.termRef(0);
          ESLVal $136 = _v16.termRef(1);
          ESLVal $135 = _v16.termRef(2);
          
          {ESLVal a = $137;
          
          {ESLVal i = $136;
          
          {ESLVal v = $135;
          
          return new ESLVal("JArrayUpdate",renameJVarsExp.apply(a,vars,env),renameJVarsExp.apply(i,vars,env),renameJVarsExp.apply(v,vars,env));
        }
        }
        }
        }
      case "JBecome": {ESLVal $134 = _v16.termRef(0);
          ESLVal $133 = _v16.termRef(1);
          
          {ESLVal _v86 = $134;
          
          {ESLVal es = $133;
          
          return new ESLVal("JBecome",renameJVarsExp.apply(_v86,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v28 = $qualArg;
                
                {ESLVal v = _v28;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
      case "JBinExp": {ESLVal $132 = _v16.termRef(0);
          ESLVal $131 = _v16.termRef(1);
          ESLVal $130 = _v16.termRef(2);
          
          {ESLVal v0 = $132;
          
          {ESLVal v1 = $131;
          
          {ESLVal v2 = $130;
          
          return new ESLVal("JBinExp",renameJVarsExp.apply(v0,vars,env),v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCommandExp": {ESLVal $129 = _v16.termRef(0);
          ESLVal $128 = _v16.termRef(1);
          
          {ESLVal v0 = $129;
          
          {ESLVal v1 = $128;
          
          return new ESLVal("JCommandExp",renameJVarsCommand.apply(v0,vars,env),v1);
        }
        }
        }
      case "JIfExp": {ESLVal $127 = _v16.termRef(0);
          ESLVal $126 = _v16.termRef(1);
          ESLVal $125 = _v16.termRef(2);
          
          {ESLVal v0 = $127;
          
          {ESLVal v1 = $126;
          
          {ESLVal v2 = $125;
          
          return new ESLVal("JIfExp",renameJVarsExp.apply(v0,vars,env),renameJVarsExp.apply(v1,vars,env),renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JConstExp": {ESLVal $124 = _v16.termRef(0);
          
          {ESLVal v0 = $124;
          
          return e;
        }
        }
      case "JTerm": {ESLVal $123 = _v16.termRef(0);
          ESLVal $122 = _v16.termRef(1);
          
          {ESLVal v0 = $123;
          
          {ESLVal v1 = $122;
          
          return new ESLVal("JTerm",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                {ESLVal v = _v27;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JTermRef": {ESLVal $121 = _v16.termRef(0);
          ESLVal $120 = _v16.termRef(1);
          
          {ESLVal v0 = $121;
          
          {ESLVal v1 = $120;
          
          return new ESLVal("JTermRef",renameJVarsExp.apply(v0,vars,env),v1);
        }
        }
        }
      case "JList": {ESLVal $119 = _v16.termRef(0);
          ESLVal $118 = _v16.termRef(1);
          
          {ESLVal v0 = $119;
          
          {ESLVal v1 = $118;
          
          return new ESLVal("JList",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
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
      case "JSet": {ESLVal $117 = _v16.termRef(0);
          ESLVal $116 = _v16.termRef(1);
          
          {ESLVal v0 = $117;
          
          {ESLVal v1 = $116;
          
          return new ESLVal("JSet",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v25 = $qualArg;
                
                {ESLVal v = _v25;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(v,vars,env)));
              }
              }
            }
          }).map(v1).flatten().flatten());
        }
        }
        }
      case "JBag": {ESLVal $115 = _v16.termRef(0);
          ESLVal $114 = _v16.termRef(1);
          
          {ESLVal v0 = $115;
          
          {ESLVal v1 = $114;
          
          return new ESLVal("JBag",v0,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
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
      case "JNil": {ESLVal $113 = _v16.termRef(0);
          
          {ESLVal v0 = $113;
          
          return e;
        }
        }
      case "JNow": {
          return e;
        }
      case "JVar": {ESLVal $112 = _v16.termRef(0);
          ESLVal $111 = _v16.termRef(1);
          
          {ESLVal v0 = $112;
          
          {ESLVal v1 = $111;
          
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
      case "JError": {ESLVal $110 = _v16.termRef(0);
          
          {ESLVal v0 = $110;
          
          return new ESLVal("JError",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JHead": {ESLVal $109 = _v16.termRef(0);
          
          {ESLVal v0 = $109;
          
          return new ESLVal("JHead",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JTail": {ESLVal $108 = _v16.termRef(0);
          
          {ESLVal v0 = $108;
          
          return new ESLVal("JTail",renameJVarsExp.apply(v0,vars,env));
        }
        }
      case "JCastp": {ESLVal $107 = _v16.termRef(0);
          ESLVal $106 = _v16.termRef(1);
          ESLVal $105 = _v16.termRef(2);
          
          {ESLVal v0 = $107;
          
          {ESLVal v1 = $106;
          
          {ESLVal v2 = $105;
          
          return new ESLVal("JCastp",v0,v1,renameJVarsExp.apply(v2,vars,env));
        }
        }
        }
        }
      case "JCast": {ESLVal $104 = _v16.termRef(0);
          ESLVal $103 = _v16.termRef(1);
          
          {ESLVal v0 = $104;
          
          {ESLVal v1 = $103;
          
          return new ESLVal("JCast",v0,renameJVarsExp.apply(v1,vars,env));
        }
        }
        }
      case "JNot": {ESLVal $102 = _v16.termRef(0);
          
          {ESLVal _v85 = $102;
          
          return new ESLVal("JNot",renameJVarsExp.apply(_v85,vars,env));
        }
        }
      case "JNew": {ESLVal $101 = _v16.termRef(0);
          ESLVal $100 = _v16.termRef(1);
          
          {ESLVal b = $101;
          
          {ESLVal args = $100;
          
          return new ESLVal("JNew",renameJVarsExp.apply(b,vars,env),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v23 = $qualArg;
                
                {ESLVal a = _v23;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(a,vars,env)));
              }
              }
            }
          }).map(args).flatten().flatten());
        }
        }
        }
      case "JNewArray": {ESLVal $99 = _v16.termRef(0);
          
          {ESLVal b = $99;
          
          return new ESLVal("JNewArray",renameJVarsExp.apply(b,vars,env));
        }
        }
      case "JNewJava": {ESLVal $98 = _v16.termRef(0);
          ESLVal $97 = _v16.termRef(1);
          
          {ESLVal n = $98;
          
          {ESLVal args = $97;
          
          return new ESLVal("JNewJava",n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
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
      case "JNewTable": {
          return new ESLVal("JNewTable",new ESLVal[]{});
        }
      case "JMapFun": {ESLVal $96 = _v16.termRef(0);
          ESLVal $95 = _v16.termRef(1);
          
          {ESLVal f = $96;
          
          {ESLVal l = $95;
          
          return new ESLVal("JMapFun",renameJVarsExp.apply(f,vars,env),renameJVarsExp.apply(l,vars,env));
        }
        }
        }
      case "JRecord": {ESLVal $94 = _v16.termRef(0);
          
          {ESLVal fs = $94;
          
          return new ESLVal("JRecord",new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v21 = $qualArg;
                
                switch(_v21.termName) {
                case "JField": {ESLVal $154 = _v21.termRef(0);
                  ESLVal $153 = _v21.termRef(1);
                  ESLVal $152 = _v21.termRef(2);
                  
                  {ESLVal n = $154;
                  
                  {ESLVal t = $153;
                  
                  {ESLVal _v84 = $152;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v84,vars,env))));
                }
                }
                }
                }
                default: {ESLVal _0 = _v21;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(fs).flatten().flatten());
        }
        }
      case "JFlatten": {ESLVal $93 = _v16.termRef(0);
          
          {ESLVal _v83 = $93;
          
          return new ESLVal("JFlatten",renameJVarsExp.apply(_v83,vars,env));
        }
        }
      case "JSend": {ESLVal $92 = _v16.termRef(0);
          ESLVal $91 = _v16.termRef(1);
          ESLVal $90 = _v16.termRef(2);
          
          {ESLVal _v81 = $92;
          
          {ESLVal n = $91;
          
          {ESLVal es = $90;
          
          return new ESLVal("JSend",renameJVarsExp.apply(_v81,vars,env),n,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v20 = $qualArg;
                
                {ESLVal _v82 = _v20;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v82,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten());
        }
        }
        }
        }
      case "JSendSuper": {ESLVal $89 = _v16.termRef(0);
          
          {ESLVal _v80 = $89;
          
          return new ESLVal("JSendSuper",renameJVarsExp.apply(_v80,vars,env));
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
          
          {ESLVal _v79 = $88;
          
          {ESLVal n = $87;
          
          return new ESLVal("JRef",renameJVarsExp.apply(_v79,vars,env),n);
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
                case "JField": {ESLVal $151 = _v19.termRef(0);
                  ESLVal $150 = _v19.termRef(1);
                  ESLVal $149 = _v19.termRef(2);
                  
                  {ESLVal n = $151;
                  
                  {ESLVal t = $150;
                  
                  {ESLVal _v78 = $149;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v78,vars,env))));
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
                case "JField": {ESLVal $148 = _v18.termRef(0);
                  ESLVal $147 = _v18.termRef(1);
                  ESLVal $146 = _v18.termRef(2);
                  
                  {ESLVal n = $148;
                  
                  {ESLVal t = $147;
                  
                  {ESLVal _v77 = $146;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JField",n,t,renameJVarsExp.apply(_v77,vars,env))));
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
          
          {ESLVal _v76 = $74;
          
          {ESLVal n = $73;
          
          {ESLVal c = $72;
          
          return new ESLVal("JTry",renameJVarsExp.apply(_v76,vars,env),n,renameJVarsCommand.apply(c,vars,env));
        }
        }
        }
        }
      case "JProbably": {ESLVal $71 = _v16.termRef(0);
          ESLVal $70 = _v16.termRef(1);
          ESLVal $69 = _v16.termRef(2);
          
          {ESLVal _v75 = $71;
          
          {ESLVal e1 = $70;
          
          {ESLVal e2 = $69;
          
          return new ESLVal("JProbably",renameJVarsExp.apply(_v75,vars,env),renameJVarsExp.apply(e1,vars,env),renameJVarsExp.apply(e2,vars,env));
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
                
                {ESLVal _v74 = _v17;
                
                return ESLVal.list(ESLVal.list(renameJVarsExp.apply(_v74,vars,env)));
              }
              }
            }
          }).map(es).flatten().flatten(),renameJVarsExp.apply(c,vars,env));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(18640,23225)").add(ESLVal.list(_v16)));
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
                
                {ESLVal _v73 = _v15;
                
                return ESLVal.list(ESLVal.list(renameJVarsCommand.apply(_v73,vars,env)));
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
                  
                  {ESLVal _v72 = $65;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JIArm",n,renameJVarsCommand.apply(_v72,vars,env))));
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
                  
                  {ESLVal _v71 = $63;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JSArm",s,renameJVarsCommand.apply(_v71,vars,env))));
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
                  
                  {ESLVal _v70 = $61;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JBArm",b,renameJVarsCommand.apply(_v70,vars,env))));
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
                  
                  {ESLVal _v69 = $58;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("JTArm",n,i,renameJVarsCommand.apply(_v69,vars,env))));
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
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun701"),getSelf()) {
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
          
          if(exists.apply(new ESLVal(new Function(new ESLVal("fun702"),getSelf()) {
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
            
            {ESLVal _v68 = addEntries.apply(boundNames,newNames,env);
            
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
                    
                    return ESLVal.list(ESLVal.list(new ESLVal("JField",lookup.apply(n,_v68),t,renameJVarsExp.apply(e,vars,_v68))));
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
            }).map(v0).flatten().flatten(),renameJVarsCommand.apply(v1,boundNames.add(vars),_v68));
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
          
          {ESLVal _v67 = $1;
          
          return new ESLVal("JFor",l,n,renameJVarsExp.apply(e,vars,env),renameJVarsCommand.apply(_v67,vars,env));
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(23466,27128)").add(ESLVal.list(_v2)));
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