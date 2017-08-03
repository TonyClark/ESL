package ast.query.machine;

import ast.query.rules.ClauseTable;
import runtime.actors.Actor;

public class ActorQueryMachine extends Machine {

  Actor actor;
  int   timeout        = -1;
  int   timeoutCounter = 0;

  public ActorQueryMachine(ClauseTable clauseTable, DB db, Actor actor, int timeout) {
    super(clauseTable, db);
    this.actor = actor;
    this.timeout = timeout;
  }

  public ActorQueryMachine() {
  }

  public void resetMachine() {
    super.resetMachine();
    timeout = -1;
    timeoutCounter = 0;
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
    child.timeout = timeout;
    child.timeoutCounter = timeoutCounter;
    return child;
  }

  protected boolean runTerminated() {
    return super.runTerminated() || (timeout == timeoutCounter);
  }

  public void run() {
    while (!runTerminated()) {
      ast.query.instrs.Instr i = getClauseCode().get(programCounter++);
      if (isTraceInstrs()) System.err.println("Instruction = " + i);
      i.perform(this);
      timeoutCounter++;
    }
  }

}
