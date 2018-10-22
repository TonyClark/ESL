package runtime.network;

import java.util.Stack;
import java.util.Vector;

import ast.monitors.code.Code;
import ast.monitors.code.Eql;
import runtime.data.Term;

public class Alpha extends ToBeta {

  static Stack<Object> stack         = new Stack<Object>();

  Vector<Code>         code;
  Vector<Eql>          varEqualities = new Vector<Eql>();

  public Alpha(Vector<Code> code, Vector<Eql> varEqualities) {
    this.code = code;
    this.varEqualities = varEqualities;
  }

  public String toString() {
    return "Alpha(" + code + "," + output + ")";
  }

  public void add(Term term, Network network) {

    // The term is added. The code in the alpha-node will check the term
    // in two ways: (1) the structure is correct; (2) the repeated vars
    // are consistent. The first check operates with respect to a stack.
    // The second is supplied with the term...

    synchronized (stack) {
      stack.clear();
      stack.push(term);
      if (runCode() && eqlChecks(term)) {
        for (BetaConnection beta : output) {
          beta.add(new Just(term), network);
        }
      }
    }
  }

  private boolean eqlChecks(Term term) {
    for (Eql eql : varEqualities) {
      if (!eql.check(term)) return false;
    }
    return true;
  }

  private boolean runCode() {
    boolean ok = true;
    for (int i = 0; ok && i < code.size(); i++) {
      Code instr = code.get(i);
      // System.err.println(instr + " " + stack);
      ok = instr.run(stack);
    }
    return ok;
  }

  public void remove(Term term, Network network) {
    synchronized (stack) {
      stack.clear();
      stack.push(term);
      if (runCode() && eqlChecks(term)) {
        for (BetaConnection beta : output) {
          beta.remove(new Just(term), network);
        }
      }
    }
  }

  public int memoryElementSize() {
    int elements = 0;
    for(BetaConnection b : output) {
      elements += b.memoryElementSize();
    }
    return elements;
  }

}
