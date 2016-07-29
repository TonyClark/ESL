package actors;

import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import list.List;

public class VarTable {

  // Build up a list of the variables in scope for each instruction. Note
  // that this is inefficient since there is currently an entry for each
  // instruction in the parent code box. Better to consolidate the information
  // so that runs of instruction indices share the same local and dynamic
  // names...

  Vector<List<FrameVar>>   locals   = new Vector<List<FrameVar>>();
  Vector<List<DynamicVar>> dynamics = new Vector<List<DynamicVar>>();

  public void add(List<FrameVar> l, List<DynamicVar> d) {
    locals.add(l);
    dynamics.add(d);
  }

  public String[] getLocalNames(int codePtr) {
    List<FrameVar> vars = locals.get(codePtr);
    String[] names = new String[vars.length()];
    while (!vars.isNil()) {
      names[vars.getHead().getIndex()] = vars.getHead().getName();
      vars = vars.getTail();
    }
    return names;
  }

  public String[] getDynamicNames(int codePtr) {
    List<DynamicVar> vars = dynamics.get(codePtr);
    String[] names = new String[vars.length()];
    // For some reason we are missing some dynamics. Find the smallest index...
    int minIndex = Integer.MAX_VALUE;
    List<DynamicVar> vs = vars;
    while (!vs.isNil()) {
      if (vs.getHead().getIndex() < minIndex) minIndex = vs.getHead().getIndex();
      vs = vs.getTail();
    }
    while (!vars.isNil()) {
      names[vars.getHead().getIndex() - minIndex] = vars.getHead().getName();
      vars = vars.getTail();
    }
    return names;
  }

  public List<FrameVar> getLocalsAt(int index) {
    return locals.get(index);
  }

  public List<DynamicVar> getDynamicsAt(int index) {
    return dynamics.get(index);
  }

}
