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
  {ESLVal _v1 = ts;
        
        if(_v1.isCons())
        {ESLVal $1 = _v1.head();
          ESLVal $2 = _v1.tail();
          
          {ESLVal t = $1;
          
          {ESLVal _v78 = $2;
          
          return new ESLVal("UCons",t,encodeUTerms.apply(_v78));
        }
        }
        }
      else if(_v1.isNil())
        return new ESLVal("UNil",new ESLVal[]{});
      else return error(new ESLVal("case error at Pos(493,561)").add(ESLVal.list(_v1)));
      }
    }
  });
  public static ESLVal deref = new ESLVal(new Function(new ESLVal("deref"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t = $args[0];
  ESLVal env = $args[1];
  {ESLVal _v2 = t;
        
        switch(_v2.termName) {
        case "UVar": {ESLVal $3 = _v2.termRef(0);
          
          {ESLVal n = $3;
          
          if(hasEntry.apply(n,env).boolVal)
          return deref.apply(lookup.apply(n,env),env);
          else
            return t;
        }
        }
        default: {ESLVal _v77 = _v2;
          
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
  {ESLVal _v3 = ts1;
        ESLVal _v4 = ts2;
        
        if(_v3.isCons())
        {ESLVal $6 = _v3.head();
          ESLVal $7 = _v3.tail();
          
          if(_v4.isCons())
          {ESLVal $8 = _v4.head();
            ESLVal $9 = _v4.tail();
            
            {ESLVal t1 = $6;
            
            {ESLVal _v69 = $7;
            
            {ESLVal t2 = $8;
            
            {ESLVal _v70 = $9;
            
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
        else if(_v4.isNil())
          if(_v4.isCons())
            {ESLVal $4 = _v4.head();
              ESLVal $5 = _v4.tail();
              
              return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
            }
          else if(_v4.isNil())
            {ESLVal _v72 = _v3;
              
              return $null;
            }
          else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
        else if(_v4.isCons())
            {ESLVal $4 = _v4.head();
              ESLVal $5 = _v4.tail();
              
              return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
            }
          else if(_v4.isNil())
            {ESLVal _v73 = _v3;
              
              return $null;
            }
          else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
        }
      else if(_v3.isNil())
        if(_v4.isCons())
          {ESLVal $10 = _v4.head();
            ESLVal $11 = _v4.tail();
            
            {ESLVal _v74 = _v4;
            
            return $null;
          }
          }
        else if(_v4.isNil())
          return env;
        else {ESLVal _v75 = _v4;
            
            return $null;
          }
      else if(_v4.isCons())
          {ESLVal $4 = _v4.head();
            ESLVal $5 = _v4.tail();
            
            return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
          }
        else if(_v4.isNil())
          {ESLVal _v76 = _v3;
            
            return $null;
          }
        else return error(new ESLVal("case error at Pos(803,1040)").add(ESLVal.list(_v3,_v4)));
      }
    }
  });
  public static ESLVal unify = new ESLVal(new Function(new ESLVal("unify"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  ESLVal env = $args[2];
  {ESLVal _v7 = deref.apply(t1,env);
        ESLVal _v8 = deref.apply(t2,env);
        
        if(_v7.eql(_v8).boolVal)
        return env;
        else
          {ESLVal _v5 = _v7;
            ESLVal _v6 = _v8;
            
            switch(_v5.termName) {
            case "UVar": {ESLVal $31 = _v5.termRef(0);
              
              {ESLVal n = $31;
              
              {ESLVal t = _v6;
              
              return addEntry.apply(n,t,env);
            }
            }
            }
          case "UInt": {ESLVal $29 = _v5.termRef(0);
              
              switch(_v6.termName) {
              case "UInt": {ESLVal $30 = _v6.termRef(0);
                
                {ESLVal n1 = $29;
                
                {ESLVal n2 = $30;
                
                if(n1.eql(n2).boolVal)
                return env;
                else
                  switch(_v6.termName) {
                    case "UVar": {ESLVal $14 = _v6.termRef(0);
                      
                      {ESLVal t = _v5;
                      
                      {ESLVal n = $14;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v56 = _v5;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $13 = _v6.termRef(0);
                      ESLVal $12 = _v6.termRef(1);
                      
                      {ESLVal _v54 = _v5;
                      
                      {ESLVal h2 = $13;
                      
                      {ESLVal _v55 = $12;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v57 = _v5;
                      
                      {ESLVal _v58 = _v6;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v57.add(new ESLVal(" and ").add(_v58))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v6.termName) {
                case "UVar": {ESLVal $14 = _v6.termRef(0);
                  
                  {ESLVal t = _v5;
                  
                  {ESLVal n = $14;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v61 = _v5;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $13 = _v6.termRef(0);
                  ESLVal $12 = _v6.termRef(1);
                  
                  {ESLVal _v59 = _v5;
                  
                  {ESLVal h2 = $13;
                  
                  {ESLVal _v60 = $12;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v62 = _v5;
                  
                  {ESLVal _v63 = _v6;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v62.add(new ESLVal(" and ").add(_v63))));
                }
                }
              }
            }
            }
          case "UStr": {ESLVal $27 = _v5.termRef(0);
              
              switch(_v6.termName) {
              case "UStr": {ESLVal $28 = _v6.termRef(0);
                
                {ESLVal s1 = $27;
                
                {ESLVal s2 = $28;
                
                if(s1.eql(s2).boolVal)
                return env;
                else
                  switch(_v6.termName) {
                    case "UVar": {ESLVal $14 = _v6.termRef(0);
                      
                      {ESLVal t = _v5;
                      
                      {ESLVal n = $14;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v46 = _v5;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $13 = _v6.termRef(0);
                      ESLVal $12 = _v6.termRef(1);
                      
                      {ESLVal _v44 = _v5;
                      
                      {ESLVal h2 = $13;
                      
                      {ESLVal _v45 = $12;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v47 = _v5;
                      
                      {ESLVal _v48 = _v6;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v47.add(new ESLVal(" and ").add(_v48))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v6.termName) {
                case "UVar": {ESLVal $14 = _v6.termRef(0);
                  
                  {ESLVal t = _v5;
                  
                  {ESLVal n = $14;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v51 = _v5;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $13 = _v6.termRef(0);
                  ESLVal $12 = _v6.termRef(1);
                  
                  {ESLVal _v49 = _v5;
                  
                  {ESLVal h2 = $13;
                  
                  {ESLVal _v50 = $12;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v52 = _v5;
                  
                  {ESLVal _v53 = _v6;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v52.add(new ESLVal(" and ").add(_v53))));
                }
                }
              }
            }
            }
          case "UBool": {ESLVal $25 = _v5.termRef(0);
              
              switch(_v6.termName) {
              case "UBool": {ESLVal $26 = _v6.termRef(0);
                
                {ESLVal b1 = $25;
                
                {ESLVal b2 = $26;
                
                if(b1.eql(b2).boolVal)
                return env;
                else
                  switch(_v6.termName) {
                    case "UVar": {ESLVal $14 = _v6.termRef(0);
                      
                      {ESLVal t = _v5;
                      
                      {ESLVal n = $14;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v36 = _v5;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $13 = _v6.termRef(0);
                      ESLVal $12 = _v6.termRef(1);
                      
                      {ESLVal _v34 = _v5;
                      
                      {ESLVal h2 = $13;
                      
                      {ESLVal _v35 = $12;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v37 = _v5;
                      
                      {ESLVal _v38 = _v6;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v37.add(new ESLVal(" and ").add(_v38))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v6.termName) {
                case "UVar": {ESLVal $14 = _v6.termRef(0);
                  
                  {ESLVal t = _v5;
                  
                  {ESLVal n = $14;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v41 = _v5;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $13 = _v6.termRef(0);
                  ESLVal $12 = _v6.termRef(1);
                  
                  {ESLVal _v39 = _v5;
                  
                  {ESLVal h2 = $13;
                  
                  {ESLVal _v40 = $12;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v42 = _v5;
                  
                  {ESLVal _v43 = _v6;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v42.add(new ESLVal(" and ").add(_v43))));
                }
                }
              }
            }
            }
          case "UFloat": {ESLVal $23 = _v5.termRef(0);
              
              switch(_v6.termName) {
              case "UFloat": {ESLVal $24 = _v6.termRef(0);
                
                {ESLVal f1 = $23;
                
                {ESLVal f2 = $24;
                
                if(f1.eql(f2).boolVal)
                return env;
                else
                  switch(_v6.termName) {
                    case "UVar": {ESLVal $14 = _v6.termRef(0);
                      
                      {ESLVal t = _v5;
                      
                      {ESLVal n = $14;
                      
                      return addEntry.apply(n,t,env);
                    }
                    }
                    }
                  case "UNil": {
                      {ESLVal _v26 = _v5;
                      
                      return $null;
                    }
                    }
                  case "UCons": {ESLVal $13 = _v6.termRef(0);
                      ESLVal $12 = _v6.termRef(1);
                      
                      {ESLVal _v24 = _v5;
                      
                      {ESLVal h2 = $13;
                      
                      {ESLVal _v25 = $12;
                      
                      return $null;
                    }
                    }
                    }
                    }
                    default: {ESLVal _v27 = _v5;
                      
                      {ESLVal _v28 = _v6;
                      
                      return error(new ESLVal("unknown type of elements for unification: ").add(_v27.add(new ESLVal(" and ").add(_v28))));
                    }
                    }
                  }
              }
              }
              }
              default: switch(_v6.termName) {
                case "UVar": {ESLVal $14 = _v6.termRef(0);
                  
                  {ESLVal t = _v5;
                  
                  {ESLVal n = $14;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v31 = _v5;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $13 = _v6.termRef(0);
                  ESLVal $12 = _v6.termRef(1);
                  
                  {ESLVal _v29 = _v5;
                  
                  {ESLVal h2 = $13;
                  
                  {ESLVal _v30 = $12;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v32 = _v5;
                  
                  {ESLVal _v33 = _v6;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v32.add(new ESLVal(" and ").add(_v33))));
                }
                }
              }
            }
            }
          case "UTerm": {ESLVal $20 = _v5.termRef(0);
              ESLVal $19 = _v5.termRef(1);
              
              switch(_v6.termName) {
              case "UTerm": {ESLVal $22 = _v6.termRef(0);
                ESLVal $21 = _v6.termRef(1);
                
                {ESLVal n1 = $20;
                
                {ESLVal ts1 = $19;
                
                {ESLVal n2 = $22;
                
                {ESLVal ts2 = $21;
                
                if(n1.eql(n2).and(length.apply(ts1).eql(length.apply(ts2))).boolVal)
                return unifyTerms.apply(ts1,ts2,env);
                else
                  {ESLVal _v15 = $20;
                    
                    {ESLVal _v16 = $19;
                    
                    {ESLVal _v17 = $22;
                    
                    {ESLVal _v18 = $21;
                    
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
              default: switch(_v6.termName) {
                case "UVar": {ESLVal $14 = _v6.termRef(0);
                  
                  {ESLVal t = _v5;
                  
                  {ESLVal n = $14;
                  
                  return addEntry.apply(n,t,env);
                }
                }
                }
              case "UNil": {
                  {ESLVal _v21 = _v5;
                  
                  return $null;
                }
                }
              case "UCons": {ESLVal $13 = _v6.termRef(0);
                  ESLVal $12 = _v6.termRef(1);
                  
                  {ESLVal _v19 = _v5;
                  
                  {ESLVal h2 = $13;
                  
                  {ESLVal _v20 = $12;
                  
                  return $null;
                }
                }
                }
                }
                default: {ESLVal _v22 = _v5;
                  
                  {ESLVal _v23 = _v6;
                  
                  return error(new ESLVal("unknown type of elements for unification: ").add(_v22.add(new ESLVal(" and ").add(_v23))));
                }
                }
              }
            }
            }
          case "UNil": {
              {ESLVal _v14 = _v6;
              
              return $null;
            }
            }
          case "UCons": {ESLVal $16 = _v5.termRef(0);
              ESLVal $15 = _v5.termRef(1);
              
              switch(_v6.termName) {
              case "UCons": {ESLVal $18 = _v6.termRef(0);
                ESLVal $17 = _v6.termRef(1);
                
                {ESLVal h1 = $16;
                
                {ESLVal _v9 = $15;
                
                {ESLVal h2 = $18;
                
                {ESLVal _v10 = $17;
                
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
              default: {ESLVal h1 = $16;
                
                {ESLVal _v12 = $15;
                
                {ESLVal _v13 = _v6;
                
                return $null;
              }
              }
              }
            }
            }
            default: switch(_v6.termName) {
              case "UVar": {ESLVal $14 = _v6.termRef(0);
                
                {ESLVal t = _v5;
                
                {ESLVal n = $14;
                
                return addEntry.apply(n,t,env);
              }
              }
              }
            case "UNil": {
                {ESLVal _v66 = _v5;
                
                return $null;
              }
              }
            case "UCons": {ESLVal $13 = _v6.termRef(0);
                ESLVal $12 = _v6.termRef(1);
                
                {ESLVal _v64 = _v5;
                
                {ESLVal h2 = $13;
                
                {ESLVal _v65 = $12;
                
                return $null;
              }
              }
              }
              }
              default: {ESLVal _v67 = _v5;
                
                {ESLVal _v68 = _v6;
                
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