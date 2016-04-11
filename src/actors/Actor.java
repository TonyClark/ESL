package actors;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

import compiler.DynamicVar;
import instrs.Instr;
import list.List;
import list.Nil;

public class Actor {

  // An actor is an independent execution machine that processes messages.
  // Execution is performed in terms of machine instructions that consume
  // arguments from a stack and push values on to the stack. The stack is
  // divided into frames that contain local variables and housekeeping
  // information needed to return from the current function call. Also
  // each stack frame contains a linked list of dynamic variables that
  // are captured by closure-like data structures such as functions.
  // Each actor-machine may perform a fixed number of instructions before
  // control is handed over to another actor. Computation is thereby time
  // sliced between all current actors.

  static final int                  STACK_SIZE           = 100000;

  // The machine time slices computation between actors. For each slice
  // an actor can perform the following maximum number of instructions...

  static final int                  MAX_INSTRS           = 10000;

  // Time is built-in to the machine. We need a measure of time per machine
  // instruction in order to know when to advance time...

  static final int                  INSTRS_PER_TIME_UNIT = 100000;

  // The maximum number of values in a case expression...

  static final int                  MAX_PATTERN_VALUES   = 100;

  // The maximum number of fail frames on the fail stack...

  static final int                  FAIL_STACK_SIZE      = 10000;

  // All the actors ever created...

  public static int                 ALL_ACTORS           = 0;

  // All the currently active actors..

  static Vector<Actor>              ACTORS               = new Vector<Actor>();

  static Hashtable<Object, History> HISTORIES            = new Hashtable<Object, History>();

  // Stack frame offsets...

  static final int                  PREV_FRAME           = 0;                               // Function calls push and pop stack frames via this link.
  static final int                  PREV_OPEN_FRAME      = 1;                               // Creating a frame might involve a single function call.
  static final int                  TOS                  = 2;                               // Reset the top of stack when return (should not be needed).
  static final int                  CODE                 = 3;                               // The code-box for the frame.
  static final int                  CODE_PTR             = 4;                               // The index into the code-box.
  static final int                  DYNAMICS             = 5;                               // A list of dynamic variables for the frame.
  static final int                  CATCHER              = 6;                               // Set if the current frame has a try-catch.
  static final int                  TOFS                 = 7;                               // The saved TOFS to be restored when this frame returns.
  static final int                  FAIL                 = 8;                               // The saved currentFail frame to be restored on return.
  static final int                  LOCAL0               = 9;                               // The start of the locals. The number of locals is in CODE.

  public static boolean             debug                = false;

  // Time is global and is maintained by the execution executive. It is measured
  // in multiple of machine instructions...

  static int                        time                 = 0;

  // Set this to true when the simulation is to be stopped...

  static boolean                    stop                 = false;

  static int                        idCounter            = 0;

  // Offsets that relate to fail stack frames...

  final static int                  FAIL_PREV            = 0;
  final static int                  FAIL_TYPE            = 1;
  final static int                  FAIL_CODE            = 2;
  final static int                  FAIL_TOS             = 3;
  final static int                  FAIL_COLLECTION      = 4;
  final static int                  FAIL_ID              = 5;
  final static int                  FAIL_INDEX           = 6;

  public static List<DynamicVar> builtinDynamics() {

    // Those dynamics that will be available at run-time by default...

    DynamicVar print = new DynamicVar("print", 0);
    DynamicVar probably = new DynamicVar("probably", 1);
    DynamicVar record = new DynamicVar("record", 2);
    DynamicVar getResults = new DynamicVar("getResults", 3);
    DynamicVar random = new DynamicVar("random", 4);
    DynamicVar stopAll = new DynamicVar("stopAll", 5);
    DynamicVar shuffle = new DynamicVar("shuffle", 6);
    DynamicVar kill = new DynamicVar("kill", 7);
    DynamicVar resetTime = new DynamicVar("resetTime", 8);
    List<DynamicVar> env = new Nil<DynamicVar>();

    // Order is not important...

    env = env.cons(print);
    env = env.cons(probably);
    env = env.cons(record);
    env = env.cons(getResults);
    env = env.cons(random);
    env = env.cons(stopAll);
    env = env.cons(shuffle);
    env = env.cons(kill);
    env = env.cons(resetTime);
    return env;
  }

  public static List<Dynamic> builtinEnv() {

    // The run-time equivalent of builtinDynamics...

    Dynamic print = new Dynamic(new Builtin("print", Actor::print));
    Dynamic probably = new Dynamic(new Builtin("probably", Actor::probably));
    Dynamic record = new Dynamic(new Builtin("record", Actor::record));
    Dynamic getResults = new Dynamic(new Builtin("getResults", Actor::getResults));
    Dynamic random = new Dynamic(new Builtin("random", Actor::random));
    Dynamic stopAll = new Dynamic(new Builtin("stopAll", Actor::stopAll));
    Dynamic shuffle = new Dynamic(new Builtin("shuffle", Actor::shuffle));
    Dynamic kill = new Dynamic(new Builtin("kill", Actor::kill));
    Dynamic resetTime = new Dynamic(new Builtin("resetTime", Actor::resetTime));
    List<Dynamic> env = new Nil<Dynamic>();
    // Order is important - must match indices used in builtinDynamics...
    env = env.cons(resetTime);
    env = env.cons(kill);
    env = env.cons(shuffle);
    env = env.cons(stopAll);
    env = env.cons(random);
    env = env.cons(getResults);
    env = env.cons(record);
    env = env.cons(probably);
    env = env.cons(print);
    return env;
  }

  public static Hashtable<Object, History> getHistories() {
    return HISTORIES;
  }

  public static Term getResults() {
    List<Term> results = new Nil<Term>();
    for (Object key : HISTORIES.keySet()) {
      History history = HISTORIES.get(key);
      results = results.cons(new Term("Results", key, history.asTerm()));
    }
    return new Term("Results", results);
  }

  public static void getResults(Actor actor, int arity) {
    if (arity == 0) {
      actor.closeFrame(0, null, null, null);
      actor.returnValue(getResults());
    } else throw new Error("getResults expects 0 args but supplied with " + arity);
  }

  public static int getTime() {
    return time;
  }

  public static void kill(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Actor a = (Actor) actor.getFrameVar(0);
      a.die();
      actor.returnValue(a);
    } else throw new Error("shuffle expects 1 arg but supplied with " + arity);
  }

  public static void print(Actor actor, int arity) {

    // A method that implements the builtin for printing values.
    // The function returns its argument...

    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Object value = actor.getFrameVar(0);
      System.out.println(value);
      actor.returnValue(value);
    } else throw new Error("print expects " + 1 + " arg but supplied with " + arity);
  }

  public static void probably(Actor actor, int arity) {

    // A method that implements the builtin for stochastic behaviour. It is
    // supplied with a %-age and two values. It will return the first value
    // with a frequency defined by the %-age and the second value the rest
    // of the time...

    if (arity == 3) {
      actor.closeFrame(0, null, null, null);
      Object v2 = actor.popStack();
      Object v1 = actor.popStack();
      int percent = (int) actor.popStack();
      if (Math.random() * 100 < percent)
        actor.returnValue(v1);
      else actor.returnValue(v2);
    } else throw new Error("probably expects " + 3 + " args but supplied with " + arity);
  }

  public static void random(Actor actor, int arity) {

    // get a random number from 0 to n-1...

    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int n = (int) actor.getFrameVar(0);
      actor.returnValue((int) (Math.random() * n));
    } else throw new Error("random expects " + 1 + " arg but supplied with " + arity);
  }

  public static void record(Actor actor, int arity) {

    // Called to record a snapshot of the state of an actor.
    // The time is inserted implicitly in the snapshot. Return
    // the value...

    if (arity == 2) {
      actor.closeFrame(0, null, null, null);
      Object value = actor.popStack();
      Object key = actor.popStack();
      if (!HISTORIES.containsKey(key)) HISTORIES.put(key, new History());
      HISTORIES.get(key).add(time, value);
      actor.returnValue(value);
    } else throw new Error("record expects " + 2 + " args but supplied with " + arity);
  }

  public static void resetESL() {
    time = 0;
    stop = false;
    ACTORS.clear();
    HISTORIES.clear();
  }

  public static void resetTime(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int t = (int) actor.getFrameVar(0);
      resetTime(t);
      actor.localTime = t;
      actor.returnValue(t);
    } else throw new Error("shuffle expects 1 arg but supplied with " + arity);
  }

  private static void resetTime(int t) {
    time = t;
  }

  public static void runESL(int time0) {

    // This is the entry point for running the ESL system. The idea is that
    // all actors are in the vector ACTORS in an arbitrary order. Each actor
    // is either complete or is active. A complete actor may be able to
    // process a message if there is an eligible message pending on its input
    // queue. The system ensures that all actors are given a fair amount of
    // processing and that all eligible messages are eventually delivered.

    time = time0;
    int instrs = 0;
    HISTORIES.clear();

    while (!stop) {

      // System.out.println(time);

      // All new actors will be added to ACTORS which we protect from
      // side effect. All new actors will be ready for computation on
      // the next computation run...

      Vector<Actor> actors = ACTORS;
      ACTORS = new Vector<Actor>();

      for (Actor actor : actors) {

        if (actor.complete()) {

          // Current thread has completed so see if there is a message to
          // schedule at the actor...

          actor.scheduleMessage();
        }

        if (!stop && actor.getState() != ActorState.DEAD) {

          // If the actor is still alive then run it for a time slice...

          actor.run(MAX_INSTRS);
        }
      }

      instrs += MAX_INSTRS;

      // Merge the new actors from the previous round with the existing
      // actors...

      Collections.shuffle(actors);
      for (Actor actor : actors) {

        // At this point an actor may have died. If we do not add it to
        // the collection of current actors (ACTORS) then it will
        // take no further part in execution...

        if (actor.getState() != ActorState.DEAD) ACTORS.add(actor);
      }

      if (!stop && instrs >= INSTRS_PER_TIME_UNIT) {
        time++;
        instrs = 0;
      }
    }

  }

  // Each actor has a unique id...

  public static void setTime(int time) {
    Actor.time = time;
  }

  // The behaviour of this actor. The behaviour is essentially a code-box where the code
  // expects a message to have been supplied. The code will then perform case-analysis on
  // the message...

  public static void shuffle(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      List<Object> l = (List) actor.getFrameVar(0);
      actor.returnValue(l.shuffle());
    } else throw new Error("shuffle expects 1 arg but supplied with " + arity);
  }

  // The stack contains stack-frames that correspond to function calls. Each stack frame
  // is linked to the previous frame and is popped when the current function call returns.
  // The type of elements on the stack is Object to allow for a variety of Java values
  // to co-exist on the stack: casts will be required in many cases...

  public static void stopAll(Actor actor, int arity) {
    if (arity == 0) {
      actor.closeFrame(0, null, null, null);
      stop = true;
      actor.returnValue(getResults());
    } else throw new Error("getResults expects 0 args but supplied with " + arity);
  }

  // The index to the next available stack location...

  public static int totalInstructions() {
    int instructions = 0;
    for (Actor a : ACTORS)
      instructions = instructions + a.getInstructions();
    return instructions;
  }

  // The current call-frame on the stack. The actor has completed a thread of control
  // when the frame becomes -1. The current frame contains information amount how to
  // return from the current call, the code to execute, the index into the code, and
  // the variables that are available to the code. There are two types of variable:
  // local and dynamic. A local variable has a life-time that is limited to the current
  // frame. A dynamic variable has a life-time that may outlive the current frame
  // because it is captured by a closure-like data value (such as a function). Both
  // locals and dynamics can be modified by side-effect. It is important that when a
  // dynamic variable is modified, all captured occurrences are also modified...

  int             id            = idCounter++;

  // A function may call another function. To do so builds a new stack frame that will
  // eventually be entered. The current open frame records the frame that is currently
  // being built. Because function calls nest, the open frame must be recorded in a
  // stack frame so that the value of openFrame can be restored on function return...

  Behaviour       behaviour;

  // Messages are queued when they are sent to an actor...

  Object[]        stack         = new Object[STACK_SIZE];

  // Record the most recently handled message. This is used to ensure that Time(t)
  // messages do not starve the actor of non-time related messages...

  int             tos           = 0;

  // The number of instructions that has been handled by the actor in the current time
  // frame. This is used to determine whether the actor must wait until the next time
  // unit before continuing...

  int             frame         = -1;

  // The actor maintains a local time that is set when it handles a Time(t) message.
  // When a thread completes, the current global time and the current local time are
  // compared. If they are out of sync and the most recent message is not a time message
  // then the local time is adjusted and a Time(t) message is sent to the actor...

  int             openFrame     = -1;

  // An actor may be in one of a collection of states...

  Vector<Message> messages      = new Vector<Message>();

  // The value that is being processed during pattern matching.

  Object          recentMessage = null;

  // The fail stack contains fail frames used by the pattern matcher...

  int             instructions  = 0;

  // The current fail frame...

  int             localTime     = 0;

  // The top of the fail stack...

  ActorState      state         = ActorState.ALIVE;

  Object[]        patternValues = new Object[MAX_PATTERN_VALUES];

  Object[]        failStack     = new Object[FAIL_STACK_SIZE];

  int             currentFail   = -1;

  int             tofs          = 0;

  public Actor() {
    // Should only be called when the actor is to be constructed specially
    // for example the initialization actor.
  }

  public Actor(Behaviour behaviour) {
    this.behaviour = behaviour;
    ACTORS.add(this);
    ALL_ACTORS++;
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
    setCodePtr(behaviour.getInitIndex());
  }

  public void addDynamic(Object value) {
    setDynamics(getDynamics().cons(new Dynamic(value)));
  }

  public Object bagElement(int id) {
    // Find the fail frame with type BAG and with BAG_ID id...
    int f = currentFail;
    while (f != -1) {
      if (failType() == FailType.BAG) {
        if (failId() == id) {
          int index = failIndex();
          Bag bag = failBag();
          currentFail = f;
          return bag.elements.get(index);
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find bag with id " + id);
  }

  public Object bagRest(int id) {
    // Find the fail frame with type BAG and with BAG_ID id...
    int f = currentFail;
    while (f != -1) {
      if (failType() == FailType.BAG) {
        if (failId() == id) {
          int index = failIndex();
          Bag bag = failBag();
          currentFail = f;
          return bag.remove(bag.elements.get(index));
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find bag with id " + id);
  }

  public void closeFrame(int locals, CodeBox code, List<Dynamic> dynamics, Closure catcher) {
    frame = openFrame;
    setCode(code);
    setCodePtr(0);
    setDynamics(dynamics);
    setCatcher(catcher);
    setTOFS(tofs);
    setFail(currentFail);
    tos = tos + locals;
    openFrame = -1;
  }

  private boolean complete() {
    return frame == -1;
  }

  public void deliverMessage() {

    // The actor should be at rest. Select a message that is requested to be handled
    // at or before the current time. If one exists then initialize the actor-machine
    // so that the message is handled...

    if (!messages.isEmpty()) {
      // Ignore time for now....
      Message message = findMessage(messages, time);
      if (message != null) {
        messages.remove(message);
        recentMessage = message.getValue();
        processMessage(message.getValue());
      }
    }
  }

  private void die() {
    state = ActorState.DEAD;
  }

  public void fail() {
    // Called to perform backtracking...
    if (failType() == FailType.CHOICE)
      failChoice();
    else if (failType() == FailType.BAG)
      failSelectBag();
    else if (failType() == FailType.SET)
      failSelectSet();
    else if (failType() == FailType.ADD_LIST)
      failAddList();
    else if (failType() == FailType.ADD_BAG)
      failAddBag();
    else if (failType() == FailType.ADD_SET)
      failAddSet();
    else throw new Error("unknown type of fail frame: " + failType());
  }

  private void failAddBag() {
    Bag bag = failBag();
    int index = failIndex();
    if (index == bag.size()) {
      currentFail = failPrev();
      fail();
    } else {
      setFailIndex(index + 1);
      setCodePtr(failCode());
    }
  }

  private void failAddList() {
    List<Object> list = failList();
    int index = failIndex();
    if (index == list.length()) {
      currentFail = failPrev();
      fail();
    } else {
      setFailIndex(index + 1);
      setCodePtr(failCode());
    }
  }

  private void failAddSet() {
    Set set = failSet();
    int index = failIndex();
    if (index == set.size()) {
      currentFail = failPrev();
      fail();
    } else {
      setFailIndex(index + 1);
      setCodePtr(failCode());
    }
  }

  public Bag failBag() {
    // If the fail frame is a bag frame then ...
    return (Bag) failStack[currentFail + FAIL_COLLECTION];
  }

  public void failChoice() {
    setCodePtr(failCode());
    tofs = failTOS();
    currentFail = failPrev();
  }

  public int failCode() {
    // The third element of a fail frame is a code pointer...
    return (int) failStack[currentFail + FAIL_CODE];
  }

  public int failId() {
    // If the fail frame is a frame then ...
    return (int) failStack[currentFail + FAIL_ID];
  }

  public int failIndex() {
    // If the fail frame is a bag frame then ...
    return (int) failStack[currentFail + FAIL_INDEX];
  }

  public List<Object> failList() {
    // If the fail frame is a bag frame then ...
    return (List<Object>) failStack[currentFail + FAIL_COLLECTION];
  }

  // The number of instructions that have been executed since the actor was created...

  public int failPrev() {
    // The first element of a fail frame is always a previous frame index...
    return (int) failStack[currentFail + FAIL_PREV];
  }

  public void failReset() {
    // Called before each pattern match. They cannot overlap...
    currentFail = getFail();
    tofs = getTOFS();
  }

  private void failSelectBag() {
    Bag bag = failBag();
    int index = failIndex();
    if (index + 1 == bag.size()) {
      currentFail = failPrev();
      fail();
    } else {
      setFailIndex(index + 1);
      setCodePtr(failCode());
    }
  }

  private void failSelectSet() {
    Set set = failSet();
    int index = failIndex();
    if (index + 1 == set.size()) {
      currentFail = failPrev();
      fail();
    } else {
      setFailIndex(index + 1);
      setCodePtr(failCode());
    }
  }

  public Set failSet() {
    // If the fail frame is a set frame then ...
    return (Set) failStack[currentFail + FAIL_COLLECTION];
  }

  public int failTOS() {
    // The fourth element of a fail frame is the current TOS...
    return (int) failStack[currentFail + FAIL_TOS];
  }

  public FailType failType() {
    // The second element of a fail frame is always a fail type...
    return (FailType) failStack[currentFail + FAIL_TYPE];
  }

  private Message findMessage(Vector<Message> messages, int time) {
    // Find the message at the earliest time at or before the supplied
    // time. If no explicitly timed message exists then return the
    // oldest message with time '0'...
    int earliest = time;
    Message message = null;
    for (Message m : messages) {
      if (m.getTime() > 0 && m.getTime() <= earliest) message = m;
    }
    if (message != null)
      return message;
    else {
      for (Message m : messages) {
        if (m.getTime() == 0) return m;
      }
    }
    return null;
  }

  public Behaviour getBehaviour() {
    return behaviour;
  }

  public Closure getCatcher() {
    return (Closure) stack[frame + CATCHER];
  }

  public CodeBox getCode() {
    return (CodeBox) stack[frame + CODE];
  }

  public int getCodePtr() {
    return (int) stack[frame + CODE_PTR];
  }

  public Object getDynamic(int index) {
    List<Dynamic> dynamics = getDynamics();
    for (int i = 0; i < index; i++)
      dynamics = dynamics.getTail();
    return dynamics.getHead().getValue();
  }

  public List<Dynamic> getDynamics() {
    return (List<Dynamic>) stack[frame + DYNAMICS];
  }

  public String[] getExports() {
    return behaviour.getExports();
  }

  public int getFail() {
    return (int) stack[frame + FAIL];
  }

  public Object getFrameVar(int index) {
    return stack[frame + LOCAL0 + index];
  }

  public int getInstructions() {
    return instructions;
  }

  public Object[] getPatternValues() {
    return patternValues;
  }

  public ActorState getState() {
    return state;
  }

  public int getTOFS() {
    return (int) stack[frame + TOFS];
  }

  public boolean hasExport(String name) {
    return behaviour.hasExport(name);
  }

  public void incCodePtr() {
    setCodePtr(getCodePtr() + 1);
  }

  public void incCodePtr(int count) {
    setCodePtr(getCodePtr() + count);
  }

  public void initSystem(CodeBox code) {
    // This is called once on the first actor in the system...
    frame = -1;
    openFrame = -1;
    openFrame(code, new Nil<Dynamic>());
    closeFrame(code.getLocals(), code, builtinEnv(), null);
  }

  public void kill() {
    ACTORS.remove(this);
  }

  public Object left(int id) {

    // Find the list with id in the fail stack. The index in the fail stack
    // defines the point at which to split the list. Return the left sub-list...

    int f = currentFail;
    while (currentFail != -1) {
      if (failType() == FailType.ADD_LIST) {
        if (failId() == id) {
          int index = failIndex();
          List<Object> list = failList();
          currentFail = f;
          return list.take(index);
        }
      } else {
        if (failType() == FailType.ADD_BAG) {
          if (failId() == id) {
            int index = failIndex();
            Bag bag = failBag();
            currentFail = f;
            return bag.take(index);
          }
        } else {
          if (failType() == FailType.ADD_SET) {
            if (failId() == id) {
              int index = failIndex();
              Set set = failSet();
              currentFail = f;
              return set.take(index);
            }
          }
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find collection with id " + id);
  }

  public void openFrame(CodeBox code, List<Dynamic> dynamics) {
    // Link the previous frame when this becomes current...
    pushStack(frame);
    pushStack(openFrame);
    pushStack(tos - 2);
    pushStack(code);
    pushStack(0);
    pushStack(dynamics);
    pushStack(null);
    pushStack(tofs);
    pushStack(currentFail);
    openFrame = tos - LOCAL0;
  }

  public void popFrame() {
    tos = (int) stack[frame + TOS];
    openFrame = (int) stack[frame + PREV_OPEN_FRAME];
    tofs = getTOFS();
    currentFail = getFail();
    frame = (int) stack[frame + PREV_FRAME];
  }

  public Object popStack() {
    return stack[--tos];
  }

  public void printFrame(int f) {
    System.out.println(hashCode() + "------------------------------------");
    for (int i = ((CodeBox) stack[f + CODE]).getLocals() - 1; i >= 0; i--)
      System.out.format("[%08d] LOC%-8d     %s %n", f + LOCAL0 + i, i, stack[f + LOCAL0 + i]);
    CodeBox c = (CodeBox) stack[f + CODE];
    Vector<Instr> instrs = c.getCode();
    int codePtr = (int) stack[f + CODE_PTR];
    java.util.List<Instr> rest = instrs.subList(codePtr, instrs.size());
    System.out.format("[%08d] DYNAMICS        %s %n", f + DYNAMICS, stack[f + DYNAMICS]);
    System.out.format("[%08d] CODE_PTR        %08d %n", f + CODE_PTR, stack[f + CODE_PTR]);
    System.out.format("[%08d] CODE            %s %n", f + CODE, rest);
    System.out.format("[%08d] TOS             %08d %n", f + TOS, stack[f + TOS]);
    System.out.format("[%08d] PREV OPEN FRAME %08d %n", f + PREV_OPEN_FRAME, stack[f + PREV_OPEN_FRAME]);
    System.out.format("[%08d] PREV FRAME      %08d %n", f + PREV_FRAME, stack[f + PREV_FRAME]);
    System.out.println(hashCode() + "------------------------------------");
  }

  public void printStack() {
    if (openFrame > -1) {
      System.out.println("OPEN FRAME ----> ");
      System.out.format("[%08d] DYNAMICS        %s %n", openFrame + DYNAMICS, stack[openFrame + DYNAMICS]);
      System.out.format("[%08d] CODE_PTR        %08d %n", openFrame + CODE_PTR, stack[openFrame + CODE_PTR]);
      System.out.format("[%08d] CODE            %s %n", openFrame + CODE, stack[openFrame + CODE]);
      System.out.format("[%08d] TOS             %08d %n", openFrame + TOS, stack[openFrame + TOS]);
      System.out.format("[%08d] PREV OPEN FRAME %08d %n", openFrame + PREV_OPEN_FRAME, stack[openFrame + PREV_OPEN_FRAME]);
      System.out.format("[%08d] PREV FRAME      %08d %n", openFrame + PREV_FRAME, stack[openFrame + PREV_FRAME]);
      System.out.println("<------ OPEN FRAME");
    }
    if (tos > 0) System.out.format("TOS[%08d] = %s%n", tos - 1, tos());
    System.out.println("OPEN FRAME = " + openFrame);
    int f = frame;
    while (f != -1) {
      printFrame(f);
      f = (int) stack[f + PREV_FRAME];
    }
    System.out.println("\n\n");
  }

  public void processMessage(Object message) {
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
    setFrameVar(0, message);
    openFrame(null, getDynamics());
  }

  public void pushFailStack(Object o) {
    failStack[tofs++] = o;
  }

  public void pushStack(Object o) {
    stack[tos++] = o;
  }

  private boolean recentlyHandledTime() {
    if (recentMessage instanceof Term) {
      Term term = (Term) recentMessage;
      return term.getName().equals("Time") && term.getValues().length == 1;
    } else return false;
  }

  public Object ref(String name) {
    return behaviour.ref(name);
  }

  public void reset() {
    frame = -1;
    openFrame = -1;
    tos = 0;
  }

  public void returnValue(Object value) {
    popFrame();
    pushStack(value);
  }

  public Object right(int id) {

    // Find the list with id in the fail stack. The index in the fail stack
    // defines the point at which to split the list. Return the right sub-list...

    int f = currentFail;
    while (currentFail != -1) {
      if (failType() == FailType.ADD_LIST) {
        if (failId() == id) {
          int index = failIndex();
          List<Object> list = failList();
          currentFail = f;
          return list.drop(index);
        }
      } else {
        if (failType() == FailType.ADD_BAG) {
          if (failId() == id) {
            int index = failIndex();
            Bag bag = failBag();
            currentFail = f;
            return bag.drop(index);
          }
        } else {
          if (failType() == FailType.ADD_SET) {
            if (failId() == id) {
              int index = failIndex();
              Set set = failSet();
              currentFail = f;
              return set.drop(index);
            }
          }
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find collection with id " + id);

  }

  public Object run(int instrs) {

    // Run for the supplied number of instructions. If if the actor
    // calls stop, then continue until it returns because this is
    // the last actor that is active in the system...

    try {
      while (!complete() && instrs > 0) {
        Vector<Instr> code = getCode().getCode();
        int i = getCodePtr();
        incCodePtr();
        Instr next = getCode().getInstr(i);
        instructions++;
        if (debug) System.out.println("NEXT = " + next);
        // if (debug) printStack();
        next.perform(this);
        if (stop) instrs = Integer.MAX_VALUE;
        instrs--;
      }
      if (complete()) {
        Object result = tos > 0 ? popStack() : null;
        reset();
        return result;
      } else return null;
    } catch (Exception e) {
      e.printStackTrace();
      printStack();
      throw e;
    }
  }

  public void scheduleMessage() {

    // The actor is not active. If the global time is in advance of the local time
    // then providing we have not just processed a Time(t) message then deliver a
    // message Time(time) and adjust the local time. Otherwise, if there is a message
    // pending on the queue then deliver it...

    if (time > localTime) {
      localTime = time;
      if (recentlyHandledTime() && !messages.isEmpty())
        deliverMessage();
      else {
        Term term = new Term("Time", time);
        recentMessage = term;
        processMessage(term);
      }
    } else deliverMessage();
  }

  public void send(Object message, int time) {
    messages.add(new Message(message, time));
  }

  public void setBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
  }

  private void setCatcher(Closure catcher) {
    stack[frame + CATCHER] = catcher;
  }

  private void setCode(CodeBox code) {
    stack[frame + CODE] = code;
  }

  public void setCodePtr(int i) {
    stack[frame + CODE_PTR] = i;
  }

  public void setDynamic(int index, Object value) {
    List<Dynamic> dynamics = getDynamics();
    for (int i = 0; i < index; i++)
      dynamics = dynamics.getTail();
    dynamics.getHead().setValue(value);
  }

  public void setDynamics(List<Dynamic> dynamics) {
    stack[frame + DYNAMICS] = dynamics;
  }

  public Object setElement(int id) {
    // Find the fail frame with type SET and with SET_ID id...
    int f = currentFail;
    while (f != -1) {
      if (failType() == FailType.SET) {
        if (failId() == id) {
          int index = failIndex();
          Set set = failSet();
          currentFail = f;
          return set.elements.get(index);
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find set with id " + id);
  }

  public void setFail(int sp) {
    stack[frame + FAIL] = sp;
  }

  public void setFailIndex(int i) {
    failStack[currentFail + FAIL_INDEX] = i;
  }

  public void setFrameVar(int index, Object value) {
    stack[frame + LOCAL0 + index] = value;
  }

  public void setPatternValue(Object patternValue, int index) {
    patternValues[index] = patternValue;
  }

  public Object setRest(int id) {
    
    // Find the fail frame with type SET and with SET_ID id...

    int f = currentFail;
    while (f != -1) {
      if (failType() == FailType.SET) {
        if (failId() == id) {
          int index = failIndex();
          Set set = failSet();
          currentFail = f;
          return set.remove(set.elements.get(index));
        }
      }
      currentFail = failPrev();
    }
    throw new Error("cannot find bag with id " + id);
  }

  public void setState(ActorState state) {
    this.state = state;
  }

  public void setTOFS(int sp) {
    stack[frame + TOFS] = sp;
  }

  public void throwValue(Object value) {
    while (getCatcher() == null && frame != -1)
      popFrame();
    if (frame == -1)
      throw new java.lang.Error("no try for corresponding throw: " + value);
    else {
      Closure c = getCatcher();
      popFrame();
      openFrame(null, null);
      pushStack(value);
      c.apply(this, 1);
    }
  }

  public Object tos() {
    return stack[tos - 1];
  }

  public String toString() {
    return "Actor(" + String.format("%04d", id) + "," + behaviour.getName() + ")";
  }

  public void tryAddBags(Bag bag, int id) {

    // Create a try frame on the fail stack that can be used to manage backtracking.
    // An index is used to determine how to split the bag...

    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.ADD_BAG);
    pushFailStack(getCodePtr());
    pushFailStack(tos);
    pushFailStack(bag);
    pushFailStack(id);
    pushFailStack(0);
    currentFail = tos;
  }

  public void tryAddLists(List<Object> list, int id) {

    // Create a try frame on the fail stack that can be used to manage backtracking.
    // An index is used to determine how to split the list...

    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.ADD_LIST);
    pushFailStack(getCodePtr());
    pushFailStack(tos);
    pushFailStack(list);
    pushFailStack(id);
    pushFailStack(0);
    currentFail = tos;
  }

  public void tryAddSets(Set set, int id) {

    // Create a try frame on the fail stack that can be used to manage backtracking.
    // An index is used to determine how to split the set...

    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.ADD_SET);
    pushFailStack(getCodePtr());
    pushFailStack(tos);
    pushFailStack(set);
    pushFailStack(id);
    pushFailStack(0);
    currentFail = tos;
  }

  public void tryBag(Bag bag, int id) {

    // Create a try frame on the fail stack that can be used to manage backtracking
    // through the elements of the bag...

    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.BAG);
    pushFailStack(getCodePtr());
    pushFailStack(tos);
    pushFailStack(bag);
    pushFailStack(id);
    pushFailStack(0);
    currentFail = tos;
  }

  public void tryOption(int offset) {
    // Create a new fail frame...
    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.CHOICE);
    pushFailStack(getCodePtr() + offset);
    pushFailStack(tos);
    currentFail = tos;
  }

  public void trySet(Set set, int id) {

    // Create a try frame on the fail stack that can be used to manage backtracking
    // through the elements of the set...

    int tos = tofs;
    pushFailStack(currentFail);
    pushFailStack(FailType.SET);
    pushFailStack(getCodePtr());
    pushFailStack(tos);
    pushFailStack(set);
    pushFailStack(id);
    pushFailStack(0);
    currentFail = tos;
  }

}
