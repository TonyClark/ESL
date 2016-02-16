package actors;

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

  static final int                  STACK_SIZE           = 1000;

  // The machine time slices computation between actors. For each slice
  // an actor can perform the following maximum number of instructions...

  static final int                  MAX_INSTRS           = 100;

  // Time is built-in to the machine. We need a measure of time per machine
  // instruction in order to know when to advance time...

  static final int                  INSTRS_PER_TIME_UNIT = 1000;

  // All the actors..

  static Vector<Actor>              ACTORS               = new Vector<Actor>();

  static Hashtable<Object, History> HISTORIES            = new Hashtable<Object, History>();

  // Stack frame offsets...

  static final int                  PREV_FRAME           = 0;
  static final int                  PREV_OPEN_FRAME      = 1;
  static final int                  TOS                  = 2;
  static final int                  CODE                 = 3;
  static final int                  CODE_PTR             = 4;
  static final int                  DYNAMICS             = 5;
  static final int                  LOCAL0               = 6;

  // Time is global and is maintained by the execution executive. It is measured
  // in multiple of machine instructions...

  static int                        time                 = 0;

  public static int getTime() {
    return time;
  }

  public static void setTime(int time) {
    Actor.time = time;
  }

  public static Hashtable<Object, History> getHistories() {
    return HISTORIES;
  }

  public static List<DynamicVar> builtinDynamics() {
    // Those dynamics that will be available at run-time by default...
    DynamicVar print = new DynamicVar("print", 0);
    DynamicVar probably = new DynamicVar("probably", 1);
    DynamicVar record = new DynamicVar("record", 2);
    List<DynamicVar> env = new Nil<DynamicVar>();
    // Order is not important...
    env = env.cons(print);
    env = env.cons(probably);
    env = env.cons(record);
    return env;
  }

  public static List<Dynamic> builtinEnv() {

    // The run-time equivalent of builtinDynamics...

    Dynamic print = new Dynamic(new Builtin("print", Actor::print));
    Dynamic probably = new Dynamic(new Builtin("probably", Actor::probably));
    Dynamic record = new Dynamic(new Builtin("record", Actor::record));
    List<Dynamic> env = new Nil<Dynamic>();
    // Order is important - must match indices used in builtinDynamics...
    env = env.cons(record);
    env = env.cons(probably);
    env = env.cons(print);
    return env;
  }

  public static void print(Actor actor, int arity) {

    // A method that implements the builtin for printing values.
    // The function returns its argument...

    if (arity == 1) {
      actor.closeFrame(0, null, null);
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
      actor.closeFrame(0, null, null);
      Object v2 = actor.popStack();
      Object v1 = actor.popStack();
      int percent = (int) actor.popStack();
      if (Math.random() * 100 < percent)
        actor.returnValue(v1);
      else actor.returnValue(v2);
    } else throw new Error("probably expects " + 3 + " args but supplied with " + arity);
  }

  public static void record(Actor actor, int arity) {

    // Called to record a snapshot of the state of an actor.
    // The time is inserted implicitly in the snapshot. Return
    // the value...

    if (arity == 2) {
      actor.closeFrame(0, null, null);
      Object value = actor.popStack();
      Object key = actor.popStack();
      if (!HISTORIES.containsKey(key)) HISTORIES.put(key, new History());
      HISTORIES.get(key).add(time, value);
      actor.returnValue(value);
    } else throw new Error("record expects " + 2 + " args but supplied with " + arity);
  }

  public static void runESL(int time0, int timeLimit) {

    // This is the entry point for running the ESL system. The idea is that
    // all actors are in the vector ACTORS in an arbitrary order. Each actor
    // is either complete or is active. A complete actor may be able to
    // process a message if there is an eligible message pending on its input
    // queue. The system ensures that all actors are given a fair amount of
    // processing and that all eligible messages are eventually delivered.

    time = time0;
    int instrs = 0;
    HISTORIES.clear();
    while (time < timeLimit) {
      // All new actors will be added to ACTORS which we protect from
      // side effect. All new actors will be ready for computation on
      // the next computation run...
      Vector<Actor> actors = ACTORS;
      ACTORS = new Vector<Actor>();
      for (Actor actor : actors) {
        if (actor.complete()) actor.scheduleMessage(time);
        actor.run(MAX_INSTRS);
      }
      instrs += MAX_INSTRS;
      // Merge the new actors from the previous round with the existing
      // actors...
      for (Actor actor : actors)
        ACTORS.add(actor);
      if (instrs >= INSTRS_PER_TIME_UNIT) {
        time++;
        instrs = 0;
        // When the time advances one unit, inform all the actors by
        // sending a special message that interrupts all other computation...
        for (Actor a : ACTORS) {
          Behaviour b = a.getBehaviour();
          // Modify the code so that it does not return a value. If it did return
          // a value then the value would interfere with the arbitrary code that is
          // currently executing on the machine...
          CodeBox code = b.getTimeHandlingCode();
          // Remember: the code in the body of an actor needs to run in a stack frame
          // and will close a stack frame that it thinks is currently open...
          a.openFrame(code, new Nil<Dynamic>());
          a.closeFrame(b.getCode().getLocals(), code, b.getDynamics());
          a.setFrameVar(0, new Term("Time", time));
          a.openFrame(null, a.getDynamics());
        }
      }
    }

  }
  
  // It is useful to have a unique id that can be used to differentiate two different actors
  // when they are printed out...

  static int      idCounter = 0;

  int             id        = idCounter++;

  // The behaviour of this actor. The behaviour is essentially a code-box where the code
  // expects a message to have been supplied. The code will then perform case-analysis on
  // the message. The behaviour-code is re-entrant in the sense that messages may cause
  // an interrupt in which case a recursive call with the interrupting message is performed
  // before returning to the current execution point...

  Behaviour       behaviour;

  // The stack contains stack-frames that correspond to function calls. Each stack frame
  // is linked to the previous frame and is popped when the current function call returns.
  // The type of elements on the stack is Object to allow for a variety of Java values
  // to co-exist on the stack: casts will be required in many cases...

  Object[]        stack     = new Object[STACK_SIZE];

  // The index to the next available stack location...

  int             tos       = 0;

  // The current call-frame on the stack. The actor has completed a thread of control
  // when the frame becomes -1. The current frame contains information amount how to
  // return from the current call, the code to execute, the index into the code, and
  // the variables that are available to the code. There are two types of variable:
  // local and dynamic. A local variable has a life-time that is limited to the current
  // frame. A dynamic variable has a life-time that may outlive the current frame
  // because it is captured by a closure-like data value (such as a function). Both
  // locals and dynamics can be modified by side-effect. It is important that when a
  // dynamic variable is modified, all captured occurrences are also modified...

  int             frame     = -1;

  // A function may call another function. To do so builds a new stack frame that will
  // eventually be entered. The current open frame records the frame that is currently
  // being built. Because function calls nest, the open frame must be recorded in a
  // stack frame so that the value of openFrame can be restored on function return...

  int             openFrame = -1;

  // The messages that have been sent to this actor.

  Vector<Message> messages  = new Vector<Message>();

  public Actor(Behaviour behaviour) {
    this.behaviour = behaviour;
    ACTORS.add(this);
  }

  public void addDynamic(Object value) {
    setDynamics(getDynamics().cons(new Dynamic(value)));
  }

  public void closeFrame(int locals, CodeBox code, List<Dynamic> dynamics) {
    frame = openFrame;
    setCode(code);
    setCodePtr(0);
    setDynamics(dynamics);
    tos = tos + locals;
  }

  private boolean complete() {
    return frame == -1;
  }

  public Behaviour getBehaviour() {
    return behaviour;
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

  public Object getFrameVar(int index) {
    return stack[frame + LOCAL0 + index];
  }

  public void incCodePtr() {
    setCodePtr(getCodePtr() + 1);
  }

  public void incCodePtr(int count) {
    setCodePtr(getCodePtr() + count);
  }

  public void initSystem() {
    // This is called once on the first actor in the system...
    frame = -1;
    openFrame = -1;
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics());
  }

  public void kill() {
    ACTORS.remove(this);
  }

  public void openFrame(CodeBox code, List<Dynamic> dynamics) {
    // Link the previous frame when this becomes current...
    pushStack(frame);
    pushStack(openFrame);
    pushStack(tos - 2);
    pushStack(code);
    pushStack(0);
    pushStack(dynamics);
    openFrame = tos - 6;
  }

  public void popFrame() {
    tos = (int) stack[frame + TOS];
    openFrame = (int) stack[frame + PREV_OPEN_FRAME];
    frame = (int) stack[frame + PREV_FRAME];
  }

  public Object popStack() {
    return stack[--tos];
  }

  public void printFrame(int f) {
    System.out.println(hashCode() + "------------------------------------");
    for (int i = ((CodeBox) stack[f + CODE]).getLocals() - 1; i >= 0; i--)
      System.out.format("[%08d] %s LOC%d%n", f + LOCAL0 + i, stack[f + LOCAL0 + i], i);
    CodeBox c = (CodeBox) stack[f + CODE];
    Vector<Instr> instrs = c.getCode();
    int codePtr = (int) stack[f + CODE_PTR];
    java.util.List<Instr> rest = instrs.subList(codePtr, instrs.size());
    System.out.format("[%08d] %s DYNAMICS%n", f + DYNAMICS, stack[f + DYNAMICS]);
    System.out.format("[%08d] %08d CODE_PTR%n", f + CODE_PTR, stack[f + CODE_PTR]);
    System.out.format("[%08d] %s CODE%n", f + CODE, rest);
    System.out.format("[%08d] %08d TOS%n", f + TOS, stack[f + TOS]);
    System.out.format("[%08d] %08d PREV OPEN FRAME%n", f + PREV_OPEN_FRAME, stack[f + PREV_OPEN_FRAME]);
    System.out.format("[%08d] %08d PREV FRAME%n", f + PREV_FRAME, stack[f + PREV_FRAME]);
  }

  public void printStack() {
    if (tos >= 0) System.out.format("TOS[%08d] = %s%n", tos - 1, tos());
    System.out.println("OPEN FRAME = " + openFrame);
    int f = frame;
    while (f != -1) {
      printFrame(f);
      f = (int) stack[f + PREV_FRAME];
    }
  }

  public void pushStack(Object o) {
    stack[tos++] = o;
  }

  public void returnValue(Object value) {
    popFrame();
    pushStack(value);
  }

  public void run(int instrs) {
    while (!complete() && instrs > 0) {
      Vector<Instr> code = getCode().getCode();
      int i = getCodePtr();
      incCodePtr();
      Instr next = getCode().getInstr(i);
      // System.out.println("NEXT = " + next);
      // printStack();
      next.perform(this);
      instrs--;
    }
    if (complete()) {
      frame = -1;
      openFrame = -1;
      tos = 0;
    }
  }

  public void scheduleMessage(int currentTime) {
    // The actor should be at rest. Select a message that is requested to be handled
    // at or before the current time. If one exists then initialize the actor-machine
    // so that the message is handled...
    if (!messages.isEmpty()) {
      // Ignore time for now....
      Message message = messages.firstElement();
      messages.remove(message);
      openFrame(behaviour.getCode(), new Nil<Dynamic>());
      closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics());
      setFrameVar(0, message.getValue());
      openFrame(null, getDynamics());
    }
  }

  public void send(Object message) {
    messages.add(new Message(message));
  }

  public void setBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
  }

  private void setCode(CodeBox code) {
    stack[frame + CODE] = code;
  }

  private void setCodePtr(int i) {
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

  public void setFrameVar(int index, Object value) {
    stack[frame + LOCAL0 + index] = value;
  }

  public Object tos() {
    return stack[tos - 1];
  }

  public String toString() {
    return "Actor(" + String.format("%04d",id) + "," + behaviour.getName() + ")";
  }

}
