package runtime;

import static runtime.listeners.Listeners.stopListener;
import static runtime.listeners.Listeners.timeListener;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import runtime.actors.Actor;
import runtime.actors.ActorState;
import runtime.actors.JavaActor;
import runtime.clients.ESLClient;

public class ESL {

  // All actors should be registered with the ESL manager. It is used for pan-system
  // activities such as scheduling time and stopping the system.

  static int                  ALL_ACTORS                   = 0;
  static Vector<Actor>        ACTORS                       = new Vector<Actor>();// All the actors ever created...
  static Vector<Actor>        BLOCKED                      = new Vector<Actor>();
  public static int           DEFAULT_MAX_INSTRS           = 200;
  public static int           DEFAULT_INSTRS_PER_TIME_UNIT = 500;
  public static int           INSTRS_PER_TIME_UNIT         = 500;
  public static int           MAX_INSTRS                   = 200;
  public static boolean       debug                        = false;
  static int                  time                         = 0;
  static boolean              stop                         = false;
  static PrintStream          debugOut                     = System.err;
  public static boolean       waiting                      = true;               // True when all actors are waiting simultaneously.
  private static final Object monitor                      = new Object();       // Used by reactive Java-based applications.
  static JavaActor            EDB                          = null;               // We might not be running under EDB.

  private static boolean allStrings(Constructor<?> cnstr) {
    for (Class<?> c : cnstr.getParameterTypes())
      if (c != String.class) return false;
    return true;
  }

  public static Vector<Actor> getACTORS() {
    return ACTORS;
  }

  public static int getALL_ACTORS() {
    return ALL_ACTORS;
  }

  public static Vector<Actor> getBlocked() {
    return BLOCKED;
  }

  public static PrintStream getDebugOut() {
    return debugOut;
  }

  public static JavaActor getEDB() {
    return EDB;
  }

  public static int getINSTRS_PER_TIME_UNIT() {
    return INSTRS_PER_TIME_UNIT;
  }

  public static int getMAX_INSTRS() {
    return MAX_INSTRS;
  }

  public static Object getMonitor() {
    return monitor;
  }

  public static int getTime() {
    return time;
  }

  public static boolean isDebug() {
    return debug;
  }

  public static boolean isStop() {
    return stop;
  }

  public static boolean isWaiting() {
    return waiting;
  }

  public static void kill(Actor actor) {
    ACTORS.remove(actor);
  }

  public static void main(String[] args) {

    // This is the entry point for ESL. The string args[0] should be
    // a class path that names a class that implements ESClient. The rest
    // of the arguments args[1] ... are supplied as initialisation arguments
    // to the constructor.

    if (args.length < 2) {
      throw new Error("usage: ESL <ESLClient Path> <Time Unit> <Client Arg1> ...");
    } else {
      try {
        String classPath = args[0];
        int timing = Integer.parseInt(args[1]);
        Class<?> c = Class.forName(classPath);
        if (ESLClient.class.isAssignableFrom(c)) {
          String[] cnstrArgs = new String[args.length - 2];
          for (int i = 0; i < cnstrArgs.length; i++) {
            cnstrArgs[i] = args[i + 2];
          }
          Constructor<?> cnstr = null;
          for (Constructor<?> cc : c.getConstructors()) {
            if (cc.getParameterCount() == cnstrArgs.length && allStrings(cc)) cnstr = cc;
            if (cc.getParameterCount() == 1 && cc.getParameterTypes()[0] == String[].class) cnstr = cc;
          }
          if (cnstr == null) throw new Error("cannot find a constructor for:" + Arrays.toString(cnstrArgs));
          if (cnstr.getParameterCount() == 1 && cnstr.getParameterTypes()[0] == String[].class)
            cnstr.newInstance(new Object[] { cnstrArgs });
          else cnstr.newInstance(cnstrArgs);
        } else throw new Error("expecting a class that implement ESLClient: " + c);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (NumberFormatException e) {
        throw new Error("usage: ESL <ESLClient Path> <Time Unit> <Client Arg1> ...");
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }

    }
  }

  public static void notifyAllActors() {

    // Some resources have been freed up. We should be more efficient, but if
    // all blocked actors are unblocked, then they will try to grab the
    // resources they need and re-block if necessary...

    for (Actor a : BLOCKED) {
      a.setState(ActorState.ALIVE);
    }
    BLOCKED.clear();
  }

  public static void registerActor(Actor actor) {
    ACTORS.add(actor);
    ALL_ACTORS++;
  }

  public static void reset() {
    ACTORS.clear();
    ALL_ACTORS = 0;
  }

  public static void resetESL() {
    time = 0;
    stop = false;
    ESL.reset();
    INSTRS_PER_TIME_UNIT = DEFAULT_INSTRS_PER_TIME_UNIT;
    MAX_INSTRS = DEFAULT_MAX_INSTRS;
  }

  public static void runESL(int time0) {

    // This is the entry point for running the ESL system. The idea is that
    // all actors are in the vector ACTORS in an arbitrary order. Each actor
    // is either complete or is active. A complete actor may be able to
    // process a message if there is an eligible message pending on its input
    // queue. The system ensures that all actors are given a fair amount of
    // processing and that all eligible messages are eventually delivered.

    setTime(time0);
    int instrs = 0;
    Vector<Actor> actors = new Vector<Actor>();

    while (!stop) {

      // All new actors will be added to ACTORS which we protect from
      // side effect. All new actors will be ready for computation on
      // the next computation run...

      actors.clear();
      Vector<Actor> tmp = ACTORS;
      ACTORS = actors;
      actors = tmp;
      waiting = true; // Set to false if any processing is required.

      for (Actor actor : actors) {
        if (actor.complete()) {
          // Current thread has completed so see if there is a message to schedule at the actor...
          actor.scheduleMessage();
        }
        if (!stop && actor.getState() != ActorState.DEAD && actor.getState() != ActorState.BLOCKED) {
          // If the actor is still alive then run it for a time slice...
          actor.run(MAX_INSTRS);
        }
        if (actor.getState() != ActorState.DEAD) ACTORS.add(actor);
        if (!actor.complete() || !actor.getMessageQueue().isEmpty() || actor.getBehaviour().handlesTime()) waiting = false;
      }

      instrs += MAX_INSTRS;
      // Merge the new actors from the previous round with the existing actors...

      Collections.shuffle(ACTORS);
      if (waiting) synchronized (monitor) {
        try {
          // Nothing is happening. Shut down and expect a message from an external Java actor
          // to restart processing...
          monitor.wait();
        } catch (InterruptedException e) {
          e.printStackTrace(debugOut);
          debugOut.close();
        }
      }
      if (!stop && (instrs >= INSTRS_PER_TIME_UNIT)) {
        setTime(getTime() + 1);
        instrs = 0;
      }
    }
  }

  public static void setACTORS(Vector<Actor> aCTORS) {
    ACTORS = aCTORS;
  }

  public static void setEDB(JavaActor eDB) {
    EDB = eDB;
  }

  public static void setINSTRS_PER_TIME_UNIT(int iNSTRS_PER_TIME_UNIT) {
    INSTRS_PER_TIME_UNIT = iNSTRS_PER_TIME_UNIT;
  }

  public static void setMAX_INSTRS(int mAX_INSTRS) {
    MAX_INSTRS = mAX_INSTRS;
  }

  public static void setStop(boolean stop) {
    ESL.stop = stop;
  }

  public static void setTime(int time) {
    ESL.time = time;
    timeListener.timeChanged(time);
  }

  public static void setWaiting(boolean waiting) {
    ESL.waiting = waiting;
  }

  public static void stop() {
    stop = true;
    stopListener.stop();
  }

  public static int totalInstructions() {
    int instructions = 0;
    for (Actor a : ACTORS)
      instructions = instructions + a.getInstructions();
    return instructions;
  }
}
