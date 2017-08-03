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

  static int                  ALL_ACTORS = 0;
  static Vector<Actor>        ACTORS     = new Vector<Actor>();       // All the actors ever created...
  public static boolean       debug      = false;
  static long                 time0      = System.currentTimeMillis();
  static boolean              stop       = false;
  static PrintStream          debugOut   = System.err;
  private static final Object monitor    = new Object();              // Used by reactive Java-based applications.
  static JavaActor            EDB        = null;                      // We might not be running under EDB.

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

  public static PrintStream getDebugOut() {
    return debugOut;
  }

  public static JavaActor getEDB() {
    return EDB;
  }

  public static Object getMonitor() {
    return monitor;
  }

  public static long getTime() {
    return System.currentTimeMillis() - time0;
  }

  public static boolean isDebug() {
    return debug;
  }

  public static boolean isStop() {
    return stop;
  }

  public static void kill(Actor actor) {
    synchronized (ACTORS) {
      ACTORS.remove(actor);
    }
  }

  public static void main(String[] args) {

    // This is the entry point for ESL. The string args[0] should be
    // a class path that names a class that implements ESClient. The rest
    // of the arguments args[1] ... are supplied as initialisation arguments
    // to the constructor.

    if (args.length < 1) {
      throw new Error("usage: ESL <ESLClient Path> <Client Arg1> ...");
    } else {
      try {
        String classPath = args[0];
        Class<?> c = Class.forName(classPath);
        if (ESLClient.class.isAssignableFrom(c)) {
          String[] cnstrArgs = new String[args.length - 1];
          for (int i = 0; i < cnstrArgs.length; i++) {
            cnstrArgs[i] = args[i + 1];
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

  public static void registerActor(Actor actor) {
    synchronized (monitor) {
      ACTORS.add(actor);
      ALL_ACTORS++;
    }
    ;
  }

  public static void reset() {
    ACTORS.clear();
    ALL_ACTORS = 0;
  }

  public static void resetESL() {
    time0 = System.currentTimeMillis();
    stop = false;
    ESL.reset();
  }

  public static void setACTORS(Vector<Actor> aCTORS) {
    ACTORS = aCTORS;
  }

  public static void setEDB(JavaActor eDB) {
    EDB = eDB;
  }

  public static void setStop(boolean stop) {
    ESL.stop = stop;
  }

  public static void setTime(long time) {
    ESL.time0 = time;
    timeListener.timeChanged((int) time);
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

  public static void stopOthers(Actor actor) {
    synchronized (ACTORS) {
      for (Actor a : ACTORS) {
        if (a != actor) {
          a.setState(ActorState.DEAD);
        }
      }
      ACTORS.removeAllElements();
      ACTORS.addElement(actor);
    }
  }
}
