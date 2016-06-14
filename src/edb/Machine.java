package edb;

import java.util.Collections;
import java.util.Vector;

import actors.Actor;
import actors.ActorState;

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

  public Machine(EDB edb, Actor start) {
    this.edb = edb;
    this.start = start;
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
      stepNextActor();
    }
  }

  public void display(Actor a) {
    if (!a.complete()) {
      int line = a.getLine();
      int codePtr = a.getCodePtr();
      edb.openActor(a, line, codePtr);
    }
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

  public void step() {
    if (!Actor.isStop()) {
      if (start != null)
        stepMain();
      else stepNextActor();
    }
  }

  public void stepMain() {
    // This is the start actor that must be run before
    // all the actors start to time-slice...
    start.run(1);
    if (start.complete()) {
      start = null;
      initAll();
    } else display(start);
  }

  private void stepNextActor() {
    while (nothingScheduled()) {
      instrs = Actor.INSTRS_PER_TIME_UNIT;
      resetStepper();
      for (Actor a : actors)
        a.scheduleMessage();
    }
    if (actorIndex >= actors.size()) {
      resetStepper();
      step();
    } else if (runSteps == Actor.MAX_INSTRS) {
      actorIndex++;
      runSteps = 0;
      step();
    } else {
      Actor a = actors.get(actorIndex);
      if (runSteps == 0) {
        if (a.complete()) {
          a.scheduleMessage();
        }
      }
      a.run(1);
      runSteps++;
      display(a);
    }
  }

  public void stop() {
    
    // This should be called when the underlying VM stops (causing Actor.isStop() to be true)
    // or when this machine wants to temporarily stop.
    
    stop = true;
  }

}
