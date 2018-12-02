package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

import java.util.function.Supplier;
public class Displays {
  public static ESLVal getSelf() { return $null; }
  // static ESLVal edb = null;
  public static ESLVal propValue = new ESLVal(new Function(new ESLVal("propValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal props = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v87 = props;
        
        return $ndCase.apply(_v87,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $85 = $args[0];
        ESLVal $86 = $args[1];
        ESLVal $87 = $args[2];
        ESLVal $84 = $args[3];
        switch($86.termName) {
              case "Prop": {ESLVal $89 = $86.termRef(0);
                ESLVal $88 = $86.termRef(1);
                
                {ESLVal ps1 = $85;
                
                {ESLVal m = $89;
                
                {ESLVal v = $88;
                
                {ESLVal ps2 = $87;
                
                if(m.eql(n).boolVal)
                return v;
                else
                  return $84.apply();
              }
              }
              }
              }
              }
              default: return $84.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(2206,2261)").add(ESLVal.list(_v87)));
          }
        }));
      }
    }
  });
  public static ESLVal hasProp = new ESLVal(new Function(new ESLVal("hasProp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal props = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v88 = props;
        
        return $ndCase.apply(_v88,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $91 = $args[0];
        ESLVal $92 = $args[1];
        ESLVal $93 = $args[2];
        ESLVal $90 = $args[3];
        switch($92.termName) {
              case "Prop": {ESLVal $95 = $92.termRef(0);
                ESLVal $94 = $92.termRef(1);
                
                {ESLVal ps1 = $91;
                
                {ESLVal m = $95;
                
                {ESLVal v = $94;
                
                {ESLVal ps2 = $93;
                
                if(m.eql(n).boolVal)
                return $true;
                else
                  return $90.apply();
              }
              }
              }
              }
              }
              default: return $90.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v97 = _v88;
              
              return $false;
            }
          }
        }));
      }
    }
  });
  public static ESLVal setProp = new ESLVal(new Function(new ESLVal("setProp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal props = $args[0];
  ESLVal n = $args[1];
  ESLVal v = $args[2];
  {ESLVal _v89 = props;
        
        return $ndCase.apply(_v89,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $97 = $args[0];
        ESLVal $98 = $args[1];
        ESLVal $99 = $args[2];
        ESLVal $96 = $args[3];
        switch($98.termName) {
              case "Prop": {ESLVal $101 = $98.termRef(0);
                ESLVal $100 = $98.termRef(1);
                
                {ESLVal ps1 = $97;
                
                {ESLVal m = $101;
                
                {ESLVal v0 = $100;
                
                {ESLVal ps2 = $99;
                
                if(m.eql(n).boolVal)
                return ps1.add(ESLVal.list(new ESLVal("Prop",n,v)).add(ps2));
                else
                  return $96.apply();
              }
              }
              }
              }
              }
              default: return $96.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(2419,2497)").add(ESLVal.list(_v89)));
          }
        }));
      }
    }
  });
  public static ESLVal edgeSource = new ESLVal(new Function(new ESLVal("edgeSource"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v90 = e;
        
        switch(_v90.termName) {
        case "Edge": {ESLVal $105 = _v90.termRef(0);
          ESLVal $104 = _v90.termRef(1);
          ESLVal $103 = _v90.termRef(2);
          ESLVal $102 = _v90.termRef(3);
          
          {ESLVal props = $105;
          
          {ESLVal source = $104;
          
          {ESLVal target = $103;
          
          {ESLVal display = $102;
          
          return source;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3349,3404)").add(ESLVal.list(_v90)));
      }
      }
    }
  });
  public static ESLVal edgeTarget = new ESLVal(new Function(new ESLVal("edgeTarget"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v91 = e;
        
        switch(_v91.termName) {
        case "Edge": {ESLVal $109 = _v91.termRef(0);
          ESLVal $108 = _v91.termRef(1);
          ESLVal $107 = _v91.termRef(2);
          ESLVal $106 = _v91.termRef(3);
          
          {ESLVal props = $109;
          
          {ESLVal source = $108;
          
          {ESLVal target = $107;
          
          {ESLVal display = $106;
          
          return target;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3448,3503)").add(ESLVal.list(_v91)));
      }
      }
    }
  });
  public static ESLVal nodeId = new ESLVal(new Function(new ESLVal("nodeId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  {ESLVal _v92 = n;
        
        switch(_v92.termName) {
        case "Node": {ESLVal $112 = _v92.termRef(0);
          ESLVal $111 = _v92.termRef(1);
          ESLVal $110 = _v92.termRef(2);
          
          {ESLVal props = $112;
          
          {ESLVal id = $111;
          
          {ESLVal display = $110;
          
          return id;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3547,3587)").add(ESLVal.list(_v92)));
      }
      }
    }
  });
  public static ESLVal nodeProps = new ESLVal(new Function(new ESLVal("nodeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  {ESLVal _v93 = n;
        
        switch(_v93.termName) {
        case "Node": {ESLVal $115 = _v93.termRef(0);
          ESLVal $114 = _v93.termRef(1);
          ESLVal $113 = _v93.termRef(2);
          
          {ESLVal props = $115;
          
          {ESLVal id = $114;
          
          {ESLVal display = $113;
          
          return props;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3631,3674)").add(ESLVal.list(_v93)));
      }
      }
    }
  });
  public static ESLVal setNodeProps = new ESLVal(new Function(new ESLVal("setNodeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal props = $args[1];
  {ESLVal _v94 = n;
        
        switch(_v94.termName) {
        case "Node": {ESLVal $118 = _v94.termRef(0);
          ESLVal $117 = _v94.termRef(1);
          ESLVal $116 = _v94.termRef(2);
          
          {ESLVal props0 = $118;
          
          {ESLVal id = $117;
          
          {ESLVal display = $116;
          
          return new ESLVal("Node",props,id,display);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3718,3779)").add(ESLVal.list(_v94)));
      }
      }
    }
  });
  public static ESLVal edgeProps = new ESLVal(new Function(new ESLVal("edgeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v95 = e;
        
        switch(_v95.termName) {
        case "Edge": {ESLVal $122 = _v95.termRef(0);
          ESLVal $121 = _v95.termRef(1);
          ESLVal $120 = _v95.termRef(2);
          ESLVal $119 = _v95.termRef(3);
          
          {ESLVal props = $122;
          
          {ESLVal source = $121;
          
          {ESLVal target = $120;
          
          {ESLVal display = $119;
          
          return props;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3823,3877)").add(ESLVal.list(_v95)));
      }
      }
    }
  });
  public static ESLVal setEdgeProps = new ESLVal(new Function(new ESLVal("setEdgeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal props = $args[1];
  {ESLVal _v96 = e;
        
        switch(_v96.termName) {
        case "Edge": {ESLVal $126 = _v96.termRef(0);
          ESLVal $125 = _v96.termRef(1);
          ESLVal $124 = _v96.termRef(2);
          ESLVal $123 = _v96.termRef(3);
          
          {ESLVal props0 = $126;
          
          {ESLVal source = $125;
          
          {ESLVal target = $124;
          
          {ESLVal display = $123;
          
          return new ESLVal("Edge",props,source,target,display);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3921,4004)").add(ESLVal.list(_v96)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}