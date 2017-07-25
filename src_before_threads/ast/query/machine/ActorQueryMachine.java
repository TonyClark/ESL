package ast.query.machine;

import ast.query.rules.ClauseTable;
import runtime.actors.Actor;

public class ActorQueryMachine extends Machine {

  Actor actor;
  int   instrs;
  int   timeout        = -1;
  int   timeoutCounter = 0;

  public ActorQueryMachine(ClauseTable clauseTable, DB db, Actor actor, int instrs, int timeout) {
    super(clauseTable, db);
    this.actor = actor;
    this.instrs = instrs;
    this.timeout = timeout;
    // setTraceInstrs(true);
  }

  public ActorQueryMachine() {
  }

  public void resetMachine() {
    super.resetMachine();
    instrs = 0;
    timeout = -1;
    timeoutCounter = 0;
  }

  public int getInstrs() {
    return instrs;
  }

  public void setInstrs(int instrs) {
    if (getChildren().size() == 0)
      this.instrs = instrs;
    else {
      for (Machine child : getChildren()) {
        ((ActorQueryMachine) child).setInstrs(instrs);
      }
    }
  }

  public int getTimeout() {
    return timeout;
  }

  public void setTimeout(int timeout) {
    if (getChildren().size() == 0)
      this.timeout = timeout;
    else {
      for (Machine child : getChildren()) {
        ((ActorQueryMachine) child).setTimeout(timeout);
      }
    }
  }

  public int getTimeoutCounter() {
    return timeoutCounter;
  }

  public void setTimeoutCounter(int timeoutCounter) {
    if (getChildren().size() == 0)
      this.timeoutCounter = timeoutCounter;
    else {
      for (Machine child : getChildren()) {
        ((ActorQueryMachine) child).setTimeoutCounter(timeoutCounter);
      }
    }
  }

  public boolean timedOut() {
    return timeout == timeoutCounter;
  }

  protected Machine newMachine() {
    return new ActorQueryMachine();
  }

  protected Machine newChild() {
    ActorQueryMachine child = (ActorQueryMachine) super.newChild();
    child.instrs = instrs;
    child.timeout = timeout;
    child.timeoutCounter = timeoutCounter;
    return child;
  }

  protected boolean runTerminated() {
    return super.runTerminated() || (instrs == 0) || (timeout == timeoutCounter);
  }

  protected void run1() {
    if (getChildren().size() > 0) {
      for (Machine child : getChildren()) {
        if (child.isValidChild()) child.run1();
        timeoutCounter++;
        instrs--;
      }
    } else {
      ast.query.instrs.Instr i = getClauseCode().get(programCounter++);
      if (isTraceInstrs()) {
        System.err.println("Machine(" + path() + ")");
        System.err.println("Instruction = " + i);
        printCallFrame(getCallFrame());
        System.err.println("--------------------------\n");
      }
      i.perform(this);
      timeoutCounter++;
      instrs--;
    }
  }

}
