package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Tables.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Unifier {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal emptyUEnv = emptyTable;
  public static ESLVal varCount = $zero;
  public static ESLVal newVar = new ESLVal(new Function(new ESLVal("newVar"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      {varCount = varCount.add($one);
      return varCount.sub($one);}
    }
  });
  public static ESLVal encodeUTerms = new ESLVal(new Function(new ESLVal("encodeUTerms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts = $args[0];
  {ESLVal _v6 = ts;
        
        if(_v6.isCons())
        {ESLVal $30 = _v6.head();
          ESLVal $31 = _v6.tail();
          
          {ESLVal t = $30;
          
          {ESLVal _v78 = $31;
          
          return new ESLVal("UCons",t,encodeUTerms.apply(_v78));
        }
        }
        }
      else if(_v6.isNil())
        return new ESLVal("UNil",new ESLVal[]{});
      else return error(new ESLVal("case error at Pos(493,561)").add(ESLVal.list(_v6)));
      }
    }
  });
  public static ESLVal deref = new ESLVal(new Function(new ESLVal("deref"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v5 = t;
        
        switch(_v5.termName) {
        case "UVar": {ESLVal $29 = _v5.termRef(0);
          
          {ESLVal n = $29;
          
          if(hasEntry.apply(n,env).boolVal)
          return deref.apply(lookup.apply(n,env),env);
          else
            return t;
        }
        }
        default: {ESLVal _v77 = _v5;
          
          return _v77;
        }
      }
      }
    }
  });
  public static ESLVal unifyTerms = new ESLVal(new Function(new ESLVal("unifyTerms"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal ts1 = $args[0];
  ESLVal ts2 = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v4 = ts1;
        ESLVal _v3 = ts2;
        
        if(_v4.isCons())
        {ESLVal $23 = _v4.head();
          ESLVal $24 = _v4.tail();
          
          if(_v3.isCons())
          {ESLVal $25 = _v3.head();
            ESLVal $26 = _v3.tail();
            
            {ESLVal t1 = $23;
            
            {ESLVal _v69 = $24;
            
            {ESLVal t2 = $25;
            
            {ESLVal _v70 = $26;
            
            {ESLVal _v71 = unify.apply(t1,t2,env);
            
            if(_v71.eql($null).boolVal)
            return _v71;
            else
              return unifyTerms.apply(_v69,_v70,_v71);
          }
          }
          }
          }
          }
          }
        else if(_v3.isNil())
          if(_v3.isCons())
            {ESLVal $21 = _v3.head();
              ESLVal $22 = _v3.tail();
              
              return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
            }
          else if(_v3.isNil())
            {ESLVal _v72 = _v4;
              
              return $null;
            }
          else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
        else if(_v3.isCons())
            {ESLVal $21 = _v3.head();
              ESLVal $22 = _v3.tail();
              
              return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
            }
          else if(_v3.isNil())
            {ESLVal _v73 = _v4;
              
              return $null;
            }
          else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
        }
      else if(_v4.isNil())
        if(_v3.isCons())
          {ESLVal $27 = _v3.head();
            ESLVal $28 = _v3.tail();
            
            {ESLVal _v74 = _v3;
            
            return $null;
          }
          }
        else if(_v3.isNil())
          return env;
        else {ESLVal _v75 = _v3;
            
            return $null;
          }
      else if(_v3.isCons())
          {ESLVal $21 = _v3.head();
            ESLVal $22 = _v3.tail();
            
            return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
          }
        else if(_v3.isNil())
          {ESLVal _v76 = _v4;
            
            return $null;
          }
        else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v4,_v3)));
      }
    }
  });
  public static ESLVal unify = new ESLVal(new Function(new ESLVal("unify"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v8 = deref.apply(t1,env);
        ESLVal _v7 = deref.apply(t2,env);
        
        if(_v8.eql(_v7).boolVal)
        return env;
        else
          {ESLVal _v2 = _v8;
            ESLVal _v1 = _v7;
            
            switch(_v2.termName) {
            case "UVar": {ESLVal $20 = _v2.termRef(0);
              
              {ESLVal n = $20;
              
              {ESLVal t = _v1;
              
              return addEntry.apply(n,t,env);
            }
            }
            }
          case "UInt": {ESLVal $18 = _v2.termRef(0);
              
              switch(_v1.termName) {
              case "UInt": {ESLVal $19 = _v1.termRef(0);
                
                {ESLVal n1 = $18;
                
                {ESLVal n2 = $19;
                
                if(n1.eql(n2).boolVal)
                return env;
                else
                  switch(_v1.termName) {
                    case "UVar": {ESLVal $3 = _v1.termRef(0);
                      
                      {ESLVal t = _v2;
                      
                      {ESLVal n = $3;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v56 = _v2;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $2 = _v1.termRef(0);
                      ESLVal $1 = _v1.termRef(1);
                      
                      {ESLVal _v54 = _v2;
                      
                      {ESLVal h2 = $2;
                      
                      {ESLVal _v55 = $1;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v57 = _v2;
                      
                      {ESLVal _v58 = _v1;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v57.add(new ESLVal(" and ").add(_v58))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v1.termName) {
                case "UVar": {ESLVal $3 = _v1.termRef(0);
                  
                  {ESLVal t = _v2;
                  
                  {ESLVal n = $3;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v61 = _v2;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $2 = _v1.termRef(0);
                  ESLVal $1 = _v1.termRef(1);
                  
                  {ESLVal _v59 = _v2;
                  
                  {ESLVal h2 = $2;
                  
                  {ESLVal _v60 = $1;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v62 = _v2;
                  
                  {ESLVal _v63 = _v1;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v62.add(new ESLVal(" and ").add(_v63))));
                }
                }
              }
            }
            }
          case "UStr": {ESLVal $16 = _v2.termRef(0);
              
              switch(_v1.termName) {
              case "UStr": {ESLVal $17 = _v1.termRef(0);
                
                {ESLVal s1 = $16;
                
                {ESLVal s2 = $17;
                
                if(s1.eql(s2).boolVal)
                return env;
                else
                  switch(_v1.termName) {
                    case "UVar": {ESLVal $3 = _v1.termRef(0);
                      
                      {ESLVal t = _v2;
                      
                      {ESLVal n = $3;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v46 = _v2;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $2 = _v1.termRef(0);
                      ESLVal $1 = _v1.termRef(1);
                      
                      {ESLVal _v44 = _v2;
                      
                      {ESLVal h2 = $2;
                      
                      {ESLVal _v45 = $1;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v47 = _v2;
                      
                      {ESLVal _v48 = _v1;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v47.add(new ESLVal(" and ").add(_v48))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v1.termName) {
                case "UVar": {ESLVal $3 = _v1.termRef(0);
                  
                  {ESLVal t = _v2;
                  
                  {ESLVal n = $3;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v51 = _v2;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $2 = _v1.termRef(0);
                  ESLVal $1 = _v1.termRef(1);
                  
                  {ESLVal _v49 = _v2;
                  
                  {ESLVal h2 = $2;
                  
                  {ESLVal _v50 = $1;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v52 = _v2;
                  
                  {ESLVal _v53 = _v1;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v52.add(new ESLVal(" and ").add(_v53))));
                }
                }
              }
            }
            }
          case "UBool": {ESLVal $14 = _v2.termRef(0);
              
              switch(_v1.termName) {
              case "UBool": {ESLVal $15 = _v1.termRef(0);
                
                {ESLVal b1 = $14;
                
                {ESLVal b2 = $15;
                
                if(b1.eql(b2).boolVal)
                return env;
                else
                  switch(_v1.termName) {
                    case "UVar": {ESLVal $3 = _v1.termRef(0);
                      
                      {ESLVal t = _v2;
                      
                      {ESLVal n = $3;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v36 = _v2;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $2 = _v1.termRef(0);
                      ESLVal $1 = _v1.termRef(1);
                      
                      {ESLVal _v34 = _v2;
                      
                      {ESLVal h2 = $2;
                      
                      {ESLVal _v35 = $1;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v37 = _v2;
                      
                      {ESLVal _v38 = _v1;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v37.add(new ESLVal(" and ").add(_v38))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v1.termName) {
                case "UVar": {ESLVal $3 = _v1.termRef(0);
                  
                  {ESLVal t = _v2;
                  
                  {ESLVal n = $3;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v41 = _v2;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $2 = _v1.termRef(0);
                  ESLVal $1 = _v1.termRef(1);
                  
                  {ESLVal _v39 = _v2;
                  
                  {ESLVal h2 = $2;
                  
                  {ESLVal _v40 = $1;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v42 = _v2;
                  
                  {ESLVal _v43 = _v1;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v42.add(new ESLVal(" and ").add(_v43))));
                }
                }
              }
            }
            }
          case "UFloat": {ESLVal $12 = _v2.termRef(0);
              
              switch(_v1.termName) {
              case "UFloat": {ESLVal $13 = _v1.termRef(0);
                
                {ESLVal f1 = $12;
                
                {ESLVal f2 = $13;
                
                if(f1.eql(f2).boolVal)
                return env;
                else
                  switch(_v1.termName) {
                    case "UVar": {ESLVal $3 = _v1.termRef(0);
                      
                      {ESLVal t = _v2;
                      
                      {ESLVal n = $3;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v26 = _v2;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $2 = _v1.termRef(0);
                      ESLVal $1 = _v1.termRef(1);
                      
                      {ESLVal _v24 = _v2;
                      
                      {ESLVal h2 = $2;
                      
                      {ESLVal _v25 = $1;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v27 = _v2;
                      
                      {ESLVal _v28 = _v1;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v27.add(new ESLVal(" and ").add(_v28))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v1.termName) {
                case "UVar": {ESLVal $3 = _v1.termRef(0);
                  
                  {ESLVal t = _v2;
                  
                  {ESLVal n = $3;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v31 = _v2;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $2 = _v1.termRef(0);
                  ESLVal $1 = _v1.termRef(1);
                  
                  {ESLVal _v29 = _v2;
                  
                  {ESLVal h2 = $2;
                  
                  {ESLVal _v30 = $1;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v32 = _v2;
                  
                  {ESLVal _v33 = _v1;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v32.add(new ESLVal(" and ").add(_v33))));
                }
                }
              }
            }
            }
          case "UTerm": {ESLVal $9 = _v2.termRef(0);
              ESLVal $8 = _v2.termRef(1);
              
              switch(_v1.termName) {
              case "UTerm": {ESLVal $11 = _v1.termRef(0);
                ESLVal $10 = _v1.termRef(1);
                
                {ESLVal n1 = $9;
                
                {ESLVal ts1 = $8;
                
                {ESLVal n2 = $11;
                
                {ESLVal ts2 = $10;
                
                if(n1.eql(n2).and(length.apply(ts1).eql(length.apply(ts2))).boolVal)
                return unifyTerms.apply(ts1,ts2,env);
                else
                  {ESLVal _v15 = $9;
                    
                    {ESLVal _v16 = $8;
                    
                    {ESLVal _v17 = $11;
                    
                    {ESLVal _v18 = $10;
                    
                    return $null;
                  }
                  }
                  }
                  }
              }
              }
              }
              }
              }
              default: switch(_v1.termName) {
                case "UVar": {ESLVal $3 = _v1.termRef(0);
                  
                  {ESLVal t = _v2;
                  
                  {ESLVal n = $3;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v21 = _v2;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $2 = _v1.termRef(0);
                  ESLVal $1 = _v1.termRef(1);
                  
                  {ESLVal _v19 = _v2;
                  
                  {ESLVal h2 = $2;
                  
                  {ESLVal _v20 = $1;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v22 = _v2;
                  
                  {ESLVal _v23 = _v1;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v22.add(new ESLVal(" and ").add(_v23))));
                }
                }
              }
            }
            }
          case "UNil": {
              {ESLVal _v14 = _v1;
              
              return $null;
            }
            }
          case "UCons": {ESLVal $5 = _v2.termRef(0);
              ESLVal $4 = _v2.termRef(1);
              
              switch(_v1.termName) {
              case "UCons": {ESLVal $7 = _v1.termRef(0);
                ESLVal $6 = _v1.termRef(1);
                
                {ESLVal h1 = $5;
                
                {ESLVal _v9 = $4;
                
                {ESLVal h2 = $7;
                
                {ESLVal _v10 = $6;
                
                {ESLVal _v11 = unify.apply(h1,h2,env);
                
                if(_v11.eql($null).boolVal)
                return _v11;
                else
                  return unify.apply(_v9,_v10,_v11);
              }
              }
              }
              }
              }
              }
              default: {ESLVal h1 = $5;
                
                {ESLVal _v12 = $4;
                
                {ESLVal _v13 = _v1;
                
                return $null;
              }
              }
              }
            }
            }
            default: switch(_v1.termName) {
              case "UVar": {ESLVal $3 = _v1.termRef(0);
                
                {ESLVal t = _v2;
                
                {ESLVal n = $3;
                
                return addEntry.apply(n,t,env);
              }
              }
              }
            case "UNil": {
                {ESLVal _v66 = _v2;
                
                return $null;
              }
              }
            case "UCons": {ESLVal $2 = _v1.termRef(0);
                ESLVal $1 = _v1.termRef(1);
                
                {ESLVal _v64 = _v2;
                
                {ESLVal h2 = $2;
                
                {ESLVal _v65 = $1;
                
                return $null;
              }
              }
              }
              }
              default: {ESLVal _v67 = _v2;
                
                {ESLVal _v68 = _v1;
                
                return error(new ESLVal("unknown type of elements for unification: ").add(_v67.add(new ESLVal(" and ").add(_v68))));
              }
              }
            }
          }
          }
      }
    }
  });
public static void main(String[] args) {
  }
}