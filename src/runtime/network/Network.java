package runtime.network;

import java.util.Vector;

import ast.monitors.code.VarTable;
import instrs.Instr;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.ActorState;
import runtime.data.Term;
import runtime.functions.Closure;

public class Network extends Actor implements Runnable {

  static final Network network = new Network();

  public static Network getNetwork() {
    return network;
  }
  Vector<Alpha>        alpha   = new Vector<Alpha>();
  Vector<Firing>       pending = new Vector<Firing>();

  private Network() {

    // A network monitors the pending firing records and waits for this to be
    // non-empty. It then runs each pending firing until it is exhausted and
    // then halts until more are supplied...

    new Thread(this).start();
  }

  public synchronized void add(Action action, Tree tree, VarTable vars) {
    //System.err.println("+ " + action + " " + tree);
    pending.add(new Firing(action, tree, vars));
    notifyAll();
  }

  public synchronized void add(Alpha a) {
    alpha.add(a);
  }

  public synchronized void add(Term term) {
    for (Alpha a : alpha) {
      a.add(term, this);
    }
  }

  private synchronized Firing findPending(Action action, Tree tree) {
    for (Firing f : pending) {
      if (action == f.getAction() && tree.equals(f.getTree())) return f;
    }
    return null;
  }

  public void fire(Firing firing) {
    Action action = firing.getAction();
    VarTable vars = firing.getVars();
    Tree tree = firing.getTree();
    Closure closure = action.getClosure();
    reset();
    initSystem(closure.getCode());
    setDynamics(closure.getDynamics());
    for (int i = 0; i < action.getArgNames().length; i++) {
      Object value = vars.get(action.getArgNames()[i]).get(0).eval(tree);
      setFrameVar(i, value);
    }
    runAll();
  }

  private synchronized Firing getNextFiring() {
    if (pending.isEmpty()) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return getNextFiring();
    } else {
      Firing f = pending.firstElement();
      pending.remove(f);
      return f;
    }
  }

  public int memoryElementSize() {
    int elements = 0;
    for (Alpha a : alpha) {
      elements += a.memoryElementSize();
    }
    return elements;
  }

  public synchronized void remove(Action action, Tree tree) {
    Firing f = findPending(action, tree);
    if (f != null) pending.remove(f);
  }

  public synchronized void remove(Term term) {
    for (Alpha a : alpha) {
      a.remove(term, this);
    }
  }

  public void run() {
    while (!ESL.isStop()) {
      Firing f = getNextFiring();
      fire(f);
    }
  }

  public void runAll() {
    while (!complete() && !ESL.isStop() && getState() == ActorState.ALIVE) {
      int i = (int) getCodePtr();
      this.setCodePtr(i + 1);
      Instr next = getCode().code.get(i);
      next.perform(this);
    }
  }

  public String toString() {
    return "Network(" + getId() + ")";
  }

  public void clear() {
    alpha.clear();
    pending.clear();
  }

}
