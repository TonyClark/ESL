package esl;
import esl.lib.*;
import static esl.lib.Lib.*;

public class Displays {
  public static ESLVal getSelf() { return $null; }
  // static ESLVal edb = null;
public static ESLVal propValue(ESLVal props,ESLVal n) {
    
    {ESLVal _v1649 = props;
      
      return $ndCase.apply(_v1649,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal $2569 = $args[0];
      ESLVal $2570 = $args[1];
      ESLVal $2571 = $args[2];
      ESLVal $2568 = $args[3];
      switch($2570.termName) {
            case "Prop": {ESLVal $2573 = $2570.termRef(0);
              ESLVal $2572 = $2570.termRef(1);
              
              {ESLVal ps1 = $2569;
              
              {ESLVal m = $2573;
              
              {ESLVal v = $2572;
              
              {ESLVal ps2 = $2571;
              
              if(m.eql(n).boolVal)
              return v;
              else
                return $2568.apply();
            }
            }
            }
            }
            }
            default: return $2568.apply();
          }
        }
      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          return error(new ESLVal("case error at Pos(2272,2327)").add(ESLVal.list(_v1649)));
        }
      }));
    }
  }
  public static ESLVal propValue = new ESLVal(new Function(new ESLVal("propValue"),null) { public ESLVal apply(ESLVal... args) { return propValue(args[0],args[1]); }});
  public static ESLVal hasProp(ESLVal props,ESLVal n) {
    
    {ESLVal _v1650 = props;
      
      return $ndCase.apply(_v1650,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal $2575 = $args[0];
      ESLVal $2576 = $args[1];
      ESLVal $2577 = $args[2];
      ESLVal $2574 = $args[3];
      switch($2576.termName) {
            case "Prop": {ESLVal $2579 = $2576.termRef(0);
              ESLVal $2578 = $2576.termRef(1);
              
              {ESLVal ps1 = $2575;
              
              {ESLVal m = $2579;
              
              {ESLVal v = $2578;
              
              {ESLVal ps2 = $2577;
              
              if(m.eql(n).boolVal)
              return $true;
              else
                return $2574.apply();
            }
            }
            }
            }
            }
            default: return $2574.apply();
          }
        }
      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          {ESLVal _v1659 = _v1650;
            
            return $false;
          }
        }
      }));
    }
  }
  public static ESLVal hasProp = new ESLVal(new Function(new ESLVal("hasProp"),null) { public ESLVal apply(ESLVal... args) { return hasProp(args[0],args[1]); }});
  public static ESLVal setProp(ESLVal props,ESLVal n,ESLVal v) {
    
    {ESLVal _v1651 = props;
      
      return $ndCase.apply(_v1651,ESLVal.list(new ESLVal("$selectMid",new ESLVal(new Function(new ESLVal("add"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          ESLVal $2581 = $args[0];
      ESLVal $2582 = $args[1];
      ESLVal $2583 = $args[2];
      ESLVal $2580 = $args[3];
      switch($2582.termName) {
            case "Prop": {ESLVal $2585 = $2582.termRef(0);
              ESLVal $2584 = $2582.termRef(1);
              
              {ESLVal ps1 = $2581;
              
              {ESLVal m = $2585;
              
              {ESLVal v0 = $2584;
              
              {ESLVal ps2 = $2583;
              
              if(m.eql(n).boolVal)
              return ps1.add(ESLVal.list(new ESLVal("Prop",n,v)).add(ps2));
              else
                return $2580.apply();
            }
            }
            }
            }
            }
            default: return $2580.apply();
          }
        }
      }))),new ESLVal(new Function(new ESLVal("listFail"),getSelf()) {
        public ESLVal apply(ESLVal... $args) {
          return error(new ESLVal("case error at Pos(2485,2563)").add(ESLVal.list(_v1651)));
        }
      }));
    }
  }
  public static ESLVal setProp = new ESLVal(new Function(new ESLVal("setProp"),null) { public ESLVal apply(ESLVal... args) { return setProp(args[0],args[1],args[2]); }});
  public static ESLVal edgeSource(ESLVal e) {
    
    {ESLVal _v1652 = e;
      
      switch(_v1652.termName) {
      case "Edge": {ESLVal $2589 = _v1652.termRef(0);
        ESLVal $2588 = _v1652.termRef(1);
        ESLVal $2587 = _v1652.termRef(2);
        ESLVal $2586 = _v1652.termRef(3);
        
        {ESLVal props = $2589;
        
        {ESLVal source = $2588;
        
        {ESLVal target = $2587;
        
        {ESLVal display = $2586;
        
        return source;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3415,3470)").add(ESLVal.list(_v1652)));
    }
    }
  }
  public static ESLVal edgeSource = new ESLVal(new Function(new ESLVal("edgeSource"),null) { public ESLVal apply(ESLVal... args) { return edgeSource(args[0]); }});
  public static ESLVal edgeTarget(ESLVal e) {
    
    {ESLVal _v1653 = e;
      
      switch(_v1653.termName) {
      case "Edge": {ESLVal $2593 = _v1653.termRef(0);
        ESLVal $2592 = _v1653.termRef(1);
        ESLVal $2591 = _v1653.termRef(2);
        ESLVal $2590 = _v1653.termRef(3);
        
        {ESLVal props = $2593;
        
        {ESLVal source = $2592;
        
        {ESLVal target = $2591;
        
        {ESLVal display = $2590;
        
        return target;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3514,3569)").add(ESLVal.list(_v1653)));
    }
    }
  }
  public static ESLVal edgeTarget = new ESLVal(new Function(new ESLVal("edgeTarget"),null) { public ESLVal apply(ESLVal... args) { return edgeTarget(args[0]); }});
  public static ESLVal nodeId(ESLVal n) {
    
    {ESLVal _v1654 = n;
      
      switch(_v1654.termName) {
      case "Node": {ESLVal $2596 = _v1654.termRef(0);
        ESLVal $2595 = _v1654.termRef(1);
        ESLVal $2594 = _v1654.termRef(2);
        
        {ESLVal props = $2596;
        
        {ESLVal id = $2595;
        
        {ESLVal display = $2594;
        
        return id;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3613,3653)").add(ESLVal.list(_v1654)));
    }
    }
  }
  public static ESLVal nodeId = new ESLVal(new Function(new ESLVal("nodeId"),null) { public ESLVal apply(ESLVal... args) { return nodeId(args[0]); }});
  public static ESLVal nodeProps(ESLVal n) {
    
    {ESLVal _v1655 = n;
      
      switch(_v1655.termName) {
      case "Node": {ESLVal $2599 = _v1655.termRef(0);
        ESLVal $2598 = _v1655.termRef(1);
        ESLVal $2597 = _v1655.termRef(2);
        
        {ESLVal props = $2599;
        
        {ESLVal id = $2598;
        
        {ESLVal display = $2597;
        
        return props;
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3697,3740)").add(ESLVal.list(_v1655)));
    }
    }
  }
  public static ESLVal nodeProps = new ESLVal(new Function(new ESLVal("nodeProps"),null) { public ESLVal apply(ESLVal... args) { return nodeProps(args[0]); }});
  public static ESLVal setNodeProps(ESLVal n,ESLVal props) {
    
    {ESLVal _v1656 = n;
      
      switch(_v1656.termName) {
      case "Node": {ESLVal $2602 = _v1656.termRef(0);
        ESLVal $2601 = _v1656.termRef(1);
        ESLVal $2600 = _v1656.termRef(2);
        
        {ESLVal props0 = $2602;
        
        {ESLVal id = $2601;
        
        {ESLVal display = $2600;
        
        return new ESLVal("Node",props,id,display);
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3784,3845)").add(ESLVal.list(_v1656)));
    }
    }
  }
  public static ESLVal setNodeProps = new ESLVal(new Function(new ESLVal("setNodeProps"),null) { public ESLVal apply(ESLVal... args) { return setNodeProps(args[0],args[1]); }});
  public static ESLVal edgeProps(ESLVal e) {
    
    {ESLVal _v1657 = e;
      
      switch(_v1657.termName) {
      case "Edge": {ESLVal $2606 = _v1657.termRef(0);
        ESLVal $2605 = _v1657.termRef(1);
        ESLVal $2604 = _v1657.termRef(2);
        ESLVal $2603 = _v1657.termRef(3);
        
        {ESLVal props = $2606;
        
        {ESLVal source = $2605;
        
        {ESLVal target = $2604;
        
        {ESLVal display = $2603;
        
        return props;
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3889,3943)").add(ESLVal.list(_v1657)));
    }
    }
  }
  public static ESLVal edgeProps = new ESLVal(new Function(new ESLVal("edgeProps"),null) { public ESLVal apply(ESLVal... args) { return edgeProps(args[0]); }});
  public static ESLVal setEdgeProps(ESLVal e,ESLVal props) {
    
    {ESLVal _v1658 = e;
      
      switch(_v1658.termName) {
      case "Edge": {ESLVal $2610 = _v1658.termRef(0);
        ESLVal $2609 = _v1658.termRef(1);
        ESLVal $2608 = _v1658.termRef(2);
        ESLVal $2607 = _v1658.termRef(3);
        
        {ESLVal props0 = $2610;
        
        {ESLVal source = $2609;
        
        {ESLVal target = $2608;
        
        {ESLVal display = $2607;
        
        return new ESLVal("Edge",props,source,target,display);
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(3987,4070)").add(ESLVal.list(_v1658)));
    }
    }
  }
  public static ESLVal setEdgeProps = new ESLVal(new Function(new ESLVal("setEdgeProps"),null) { public ESLVal apply(ESLVal... args) { return setEdgeProps(args[0],args[1]); }});
public static void main(String[] args) {
  }
}