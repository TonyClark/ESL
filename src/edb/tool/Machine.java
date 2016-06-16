package edb.tool;

import java.util.Collections;
import java.util.Vector;

import actors.Actor;
import actors.ActorState;
import instrs.Instr;

public class Machine {

  // This class defines the execution machine for the actors that is used by EDB.
  // The execution mechanism should be equivalent to that used in Actor to control
  // the VM, however EDB must allow the execution to be performed in steps that can
  // be controlled via the user interface.

  EDB           edb;                             // A link back to the GUI.
  Actor         start;                           // This is the starting actor.
  Vector<Actor> actors     = new Vector<Actor>();// Local copy of actors for a single cycle.
  int           actorIndex = 0;                  // Index to current actor in actors.
  int           instrs     = 0;                  // The number of instructions performed in current time tick.
  int           runSteps   = 0;                  // The number of instructions for current actor.
  boolean       stop       = false;              // Stops the machine. Can restart providing !Actor.isStop().
  String        path;                            // The path to the most recently loaded module.

  public Machine(EDB edb, Actor start) {
    this.edb = edb;
    this.start = start;
    path = start.getBehaviour().getPath();
    // For testing...
    Actor.MAX_INSTRS = 10;
    Actor.INSTRS_PER_TIME_UNIT = 10;
  }

  private void advanceTime() {

    // The global time is advanced causing actors to receive Time(t+1)
    // messages next time they process scheduleMessage() ...

    Actor.setTime(Actor.getTime() + 1);
  }

  private boolean allComplete() {
    for (Actor a : actors)
      if (!a.complete()) return false;
    return true;
  }

  private boolean allQueuesEmpty() {
    for (Actor a : actors)
      if (a.messageScheduled()) return false;
    return true;
  }

  public void complete() {
    stop = false;
    if (!Actor.isStop()) {
      if (start != null) {
        start.run(Integer.MAX_VALUE);
        start = null;
        completeAll();
      } else if (runSteps > 0) {

        // We must have performed some stepping. Reset the actors
        // before running to conclusion...

        for (Actor actor : actors) {
          if (actor.getState() != ActorState.DEAD) Actor.getACTORS().add(actor);
        }
        completeAll();
      } else completeAll();
    }
  }

  private void completeAll() {
    while (!stop) {
      stepOverNextActor();
    }
  }

  public void display(Actor a) {
    if (!a.complete()) {
      Instr instr = a.nextInstr();
      edb.openActor(a, instr.getLine(), a.getCodePtr());
    }
  }

  private int getCurrentLine(Actor a) {
    // Get the line number of the actor...
    Instr instr = a.nextInstr();
    if (instr == null)
      return -1;
    else return instr.getLine();
  }

  private int getCurrentStackFrame(Actor a) {
    // Get the stack frame for the actor...
    return a.getFrame();
  }

  public String getPath() {
    return path;
  }

  public Actor getStart() {
    return start;
  }

  public void init() {
    if (!Actor.isStop()) {
      if (start != null) {
        start.run(Integer.MAX_VALUE);
        display(start);
      }
    }
  }

  private void initAll() {
    instrs = 0;
    runSteps = 0;
    resetActors();
    if (!actors.isEmpty()) display(actors.get(0));
  }

  private boolean nothingScheduled() {
    // Tests whether this time period can possibly perform
    // any computation...
    if (!allComplete()) return false;
    if (!allQueuesEmpty()) return false;
    return true;
  }

  private void resetActors() {
    actors.clear();
    Vector<Actor> tmp = Actor.getACTORS();
    Actor.setACTORS(actors);
    actors = tmp;
    actorIndex = 0;
  }

  private void resetStepper() {
    instrs += Actor.MAX_INSTRS;
    Collections.shuffle(actors);
    for (Actor actor : actors) {
      if (actor.getState() != ActorState.DEAD) Actor.getACTORS().add(actor);
    }
    if (!Actor.isStop() && (instrs >= Actor.INSTRS_PER_TIME_UNIT)) {
      advanceTime();
      instrs = 0;
    }
    resetActors();
  }

  public void stepOver() {
    // Step over the current line...
    if (!Actor.isStop()) {
      if (start != null) {
        stepOverMain();
      } else stepOverNextActor();
    }
  }

  public void stepOverMain() {

    // This is the start actor that must be run before
    // all the actors start to time-slice. Get the current
    // line and the current stack frame and continually step
    // until the line is increased with respect to the
    // stack frame or when the starting actor completes...

    stepOver(start);
    if (start.complete()) {
      start = null;
      initAll();
    } else display(start);
  }

  public int stepOver(Actor a) {

    // Keep moving until we hit the next line...

    int line = getCurrentLine(a);
    int stackFrame = getCurrentStackFrame(a);
    int instrs = 0;
    while (!a.complete() && (getCurrentStackFrame(a) > stackFrame || getCurrentLine(a) <= line)) {
      a.run(1);
      instrs++;
    }
    return instrs;
  }

  private void stepOverNextActor() {
    while (nothingScheduled()) {
      instrs = Actor.INSTRS_PER_TIME_UNIT;
      resetStepper();
      for (Actor a : actors)
        a.scheduleMessage();
    }
    if (actorIndex >= actors.size()) {
      resetStepper();
      stepOver();
    } else if (runSteps >= Actor.MAX_INSTRS) {
      actorIndex++;
      runSteps = 0;
      stepOver();
    } else {
      Actor a = actors.get(actorIndex);
      if (runSteps == 0) {
        if (a.complete()) {
          a.scheduleMessage();
        }
      }
      runSteps += stepOver(a);
      display(a);
    }
  }

  public void stop() {

    // This should be called when the underlying VM stops (causing Actor.isStop() to be true)
    // or when this machine wants to temporarily stop.

    stop = true;
  }

}
