package actors;

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

  static final int     STACK_SIZE           = 1000;

  // The machine time slices computation between actors. For each slice
  // an actor can perform the following maximum number of instructions...

  static final int     MAX_INSTRS           = 100;

  // Time is built-in to the machine. We need a measure of time per machine
  // instruction in order to know when to advance time...

  static final int     INSTRS_PER_TIME_UNIT = 1000;

  // All the actors..

  static Vector<Actor> ACTORS               = new Vector<Actor>();

  // Stack frame offsets...

  static final int     PREV_FRAME           = 0;
  static final int     PREV_OPEN_FRAME      = 1;
  static final int     TOS                  = 2;
  static final int     CODE                 = 3;
  static final int     CODE_PTR             = 4;
  static final int     DYNAMICS             = 5;
  static final int     LOCAL0               = 6;

  // The code that will be used to handle messages...

  public static List<DynamicVar> builtinDynamics() {
    // Those dynamics that will be available at run-time by default...
    DynamicVar print = new DynamicVar("print", 0);
    List<DynamicVar> env = new Nil<DynamicVar>();
    // Order is not important...
    env = env.cons(print);
    return env;
  }

  // The stack...

  public static List<Dynamic> builtinEnv() {
    // The run-time equivalent of builtinDynamics...
    Dynamic print = new Dynamic(new Builtin("print", Actor::print));
    List<Dynamic> env = new Nil<Dynamic>();
    // Order is important - must match indices used in builtinDynamics...
    env = env.cons(print);
    return env;
  }

  // The top of stack...

  public static void print(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null);
      Object value = actor.getFrameVar(0);
      System.out.println(value);
      actor.returnValue(value);
    } else throw new Error("function expects " + 1 + " arg but supplied with " + arity);
  }

  // The current frame...

  public static void runESL(int time0, int timeLimit) {

    // This is the entry point for running the ESL system. The idea is that
    // all actors are in the vector ACTORS in an arbitrary order. Each actor
    // is either complete or is active. A complete actor may be able to
    // process a message if there is an eligible message pending on its input
    // queue. The system ensures that all actors are given a fair amount of
    // processing and that all eligible messages are eventually delivered.

    int time = time0;
    int instrs = 0;
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
      }
    }

  }

  // The current open frame...

  Behaviour            behaviour;

  // The pending messages of the actor...

  Object[]             stack                = new Object[STACK_SIZE];

  int                  tos                  = 0;

  int                  frame                = -1;

  int                  openFrame            = -1;

  Vector<Message>      messages             = new Vector<Message>();

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
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics());
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

  public Object popStack() {
    return stack[--tos];
  }

  public void pushStack(Object o) {
    stack[tos++] = o;
  }

  public void returnValue(Object value) {
    tos = (int) stack[frame + TOS];
    openFrame = (int) stack[frame + PREV_OPEN_FRAME];
    frame = (int) stack[frame + PREV_FRAME];
    pushStack(value);
  }

  public void run(int instrs) {
    while (!complete() && instrs > 0) {
      Vector<Instr> code = getCode().getCode();
      int i = getCodePtr();
      incCodePtr();
      Instr next = getCode().getInstr(i);
      //System.out.println(next);
      next.perform(this);
      instrs--;
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
      System.out.println("Schedule message " + behaviour);
      closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics());
      setFrameVar(0, message.getValue());
    }
  }

  public void send(Object message) {
    messages.add(new Message(message));
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
    return "Actor(" + behaviour.getName() + ")";
  }

}
