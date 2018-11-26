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
  {ESLVal _v137 = props;
        
        return $ndCase.apply(_v137,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $157 = $args[0];
        ESLVal $158 = $args[1];
        ESLVal $159 = $args[2];
        ESLVal $156 = $args[3];
        switch($158.termName) {
              case "Prop": {ESLVal $161 = $158.termRef(0);
                ESLVal $160 = $158.termRef(1);
                
                {ESLVal ps1 = $157;
                
                {ESLVal m = $161;
                
                {ESLVal v = $160;
                
                {ESLVal ps2 = $159;
                
                if(m.eql(n).boolVal)
                return v;
                else
                  return $156.apply();
              }
              }
              }
              }
              }
              default: return $156.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(2206,2261)").add(ESLVal.list(_v137)));
          }
        }));
      }
    }
  });
  public static ESLVal hasProp = new ESLVal(new Function(new ESLVal("hasProp"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal props = $args[0];
  ESLVal n = $args[1];
  {ESLVal _v136 = props;
        
        return $ndCase.apply(_v136,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $151 = $args[0];
        ESLVal $152 = $args[1];
        ESLVal $153 = $args[2];
        ESLVal $150 = $args[3];
        switch($152.termName) {
              case "Prop": {ESLVal $155 = $152.termRef(0);
                ESLVal $154 = $152.termRef(1);
                
                {ESLVal ps1 = $151;
                
                {ESLVal m = $155;
                
                {ESLVal v = $154;
                
                {ESLVal ps2 = $153;
                
                if(m.eql(n).boolVal)
                return $true;
                else
                  return $150.apply();
              }
              }
              }
              }
              }
              default: return $150.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            {ESLVal _v138 = _v136;
              
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
  {ESLVal _v135 = props;
        
        return $ndCase.apply(_v135,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $145 = $args[0];
        ESLVal $146 = $args[1];
        ESLVal $147 = $args[2];
        ESLVal $144 = $args[3];
        switch($146.termName) {
              case "Prop": {ESLVal $149 = $146.termRef(0);
                ESLVal $148 = $146.termRef(1);
                
                {ESLVal ps1 = $145;
                
                {ESLVal m = $149;
                
                {ESLVal v0 = $148;
                
                {ESLVal ps2 = $147;
                
                if(m.eql(n).boolVal)
                return ps1.add(ESLVal.list(new ESLVal("Prop",n,v)).add(ps2));
                else
                  return $144.apply();
              }
              }
              }
              }
              }
              default: return $144.apply();
            }
          }
        }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            return error(new ESLVal("case error at Pos(2419,2497)").add(ESLVal.list(_v135)));
          }
        }));
      }
    }
  });
  public static ESLVal edgeSource = new ESLVal(new Function(new ESLVal("edgeSource"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v134 = e;
        
        switch(_v134.termName) {
        case "Edge": {ESLVal $143 = _v134.termRef(0);
          ESLVal $142 = _v134.termRef(1);
          ESLVal $141 = _v134.termRef(2);
          ESLVal $140 = _v134.termRef(3);
          
          {ESLVal props = $143;
          
          {ESLVal source = $142;
          
          {ESLVal target = $141;
          
          {ESLVal display = $140;
          
          return source;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3349,3404)").add(ESLVal.list(_v134)));
      }
      }
    }
  });
  public static ESLVal edgeTarget = new ESLVal(new Function(new ESLVal("edgeTarget"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v133 = e;
        
        switch(_v133.termName) {
        case "Edge": {ESLVal $139 = _v133.termRef(0);
          ESLVal $138 = _v133.termRef(1);
          ESLVal $137 = _v133.termRef(2);
          ESLVal $136 = _v133.termRef(3);
          
          {ESLVal props = $139;
          
          {ESLVal source = $138;
          
          {ESLVal target = $137;
          
          {ESLVal display = $136;
          
          return target;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3448,3503)").add(ESLVal.list(_v133)));
      }
      }
    }
  });
  public static ESLVal nodeId = new ESLVal(new Function(new ESLVal("nodeId"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  {ESLVal _v132 = n;
        
        switch(_v132.termName) {
        case "Node": {ESLVal $135 = _v132.termRef(0);
          ESLVal $134 = _v132.termRef(1);
          ESLVal $133 = _v132.termRef(2);
          
          {ESLVal props = $135;
          
          {ESLVal id = $134;
          
          {ESLVal display = $133;
          
          return id;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3547,3587)").add(ESLVal.list(_v132)));
      }
      }
    }
  });
  public static ESLVal nodeProps = new ESLVal(new Function(new ESLVal("nodeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  {ESLVal _v131 = n;
        
        switch(_v131.termName) {
        case "Node": {ESLVal $132 = _v131.termRef(0);
          ESLVal $131 = _v131.termRef(1);
          ESLVal $130 = _v131.termRef(2);
          
          {ESLVal props = $132;
          
          {ESLVal id = $131;
          
          {ESLVal display = $130;
          
          return props;
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3631,3674)").add(ESLVal.list(_v131)));
      }
      }
    }
  });
  public static ESLVal setNodeProps = new ESLVal(new Function(new ESLVal("setNodeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal n = $args[0];
  ESLVal props = $args[1];
  {ESLVal _v130 = n;
        
        switch(_v130.termName) {
        case "Node": {ESLVal $129 = _v130.termRef(0);
          ESLVal $128 = _v130.termRef(1);
          ESLVal $127 = _v130.termRef(2);
          
          {ESLVal props0 = $129;
          
          {ESLVal id = $128;
          
          {ESLVal display = $127;
          
          return new ESLVal("Node",props,id,display);
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3718,3779)").add(ESLVal.list(_v130)));
      }
      }
    }
  });
  public static ESLVal edgeProps = new ESLVal(new Function(new ESLVal("edgeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  {ESLVal _v129 = e;
        
        switch(_v129.termName) {
        case "Edge": {ESLVal $126 = _v129.termRef(0);
          ESLVal $125 = _v129.termRef(1);
          ESLVal $124 = _v129.termRef(2);
          ESLVal $123 = _v129.termRef(3);
          
          {ESLVal props = $126;
          
          {ESLVal source = $125;
          
          {ESLVal target = $124;
          
          {ESLVal display = $123;
          
          return props;
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3823,3877)").add(ESLVal.list(_v129)));
      }
      }
    }
  });
  public static ESLVal setEdgeProps = new ESLVal(new Function(new ESLVal("setEdgeProps"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal e = $args[0];
  ESLVal props = $args[1];
  {ESLVal _v128 = e;
        
        switch(_v128.termName) {
        case "Edge": {ESLVal $122 = _v128.termRef(0);
          ESLVal $121 = _v128.termRef(1);
          ESLVal $120 = _v128.termRef(2);
          ESLVal $119 = _v128.termRef(3);
          
          {ESLVal props0 = $122;
          
          {ESLVal source = $121;
          
          {ESLVal target = $120;
          
          {ESLVal display = $119;
          
          return new ESLVal("Edge",props,source,target,display);
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(3921,4004)").add(ESLVal.list(_v128)));
      }
      }
    }
  });
public static void main(String[] args) {
  }
}