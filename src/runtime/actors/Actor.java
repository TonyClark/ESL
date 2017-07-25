package runtime.actors;

import static instrs.Instr.APPLY;
import static instrs.Instr.APPLYDYNAMICVAR;
import static instrs.Instr.APPLYFRAMEVAR;
import static instrs.Instr.APPLYFUN;
import static instrs.Instr.DYNAMIC;
import static instrs.Instr.FALSE;
import static instrs.Instr.FRAMEVAR;
import static instrs.Instr.GOTO;
import static instrs.Instr.HEAD;
import static instrs.Instr.INT;
import static instrs.Instr.ISNIL;
import static instrs.Instr.NEQL;
import static instrs.Instr.NULL;
import static instrs.Instr.POP;
import static instrs.Instr.POPFRAME;
import static instrs.Instr.RETURN;
import static instrs.Instr.SETFRAME;
import static instrs.Instr.SHOW;
import static instrs.Instr.SKIP;
import static instrs.Instr.SKIPFALSE;
import static instrs.Instr.SKIPTRUE;
import static instrs.Instr.STARTCALL;
import static instrs.Instr.TAIL;
import static instrs.Instr.TERM;
import static instrs.Instr.TRUE;
import static runtime.actors.Stack.CATCHER;
import static runtime.actors.Stack.CODE;
import static runtime.actors.Stack.CODE_PTR;
import static runtime.actors.Stack.DYNAMICS;
import static runtime.actors.Stack.FAIL;
import static runtime.actors.Stack.FAIL_CODE;
import static runtime.actors.Stack.FAIL_COLLECTION;
import static runtime.actors.Stack.FAIL_ID;
import static runtime.actors.Stack.FAIL_INDEX;
import static runtime.actors.Stack.FAIL_PREV;
import static runtime.actors.Stack.FAIL_STACK_SIZE;
import static runtime.actors.Stack.FAIL_TOS;
import static runtime.actors.Stack.FAIL_TYPE;
import static runtime.actors.Stack.GROW_FAIL_STACK;
import static runtime.actors.Stack.GROW_STACK;
import static runtime.actors.Stack.LOCAL0;
import static runtime.actors.Stack.PREV_FRAME;
import static runtime.actors.Stack.PREV_OPEN_FRAME;
import static runtime.actors.Stack.STACK_SIZE;
import static runtime.actors.Stack.TOFS;
import static runtime.actors.Stack.TOS;
import static runtime.listeners.Listeners.behaviourListener;
import static runtime.listeners.Listeners.newActorListener;

import java.util.Hashtable;
import java.util.Vector;

import ast.query.machine.ActorQueryMachine;
import ast.query.machine.DB;
import ast.query.machine.Machine;
import ast.query.rules.Clause;
import ast.query.rules.ClauseTable;
import instrs.Instr;
import instrs.apply.Apply;
import instrs.apply.ApplyDynamicVar;
import instrs.apply.ApplyFrameVar;
import instrs.apply.ApplyFun;
import instrs.jumps.Goto;
import instrs.query.QShow;
import instrs.vars.FrameVar;
import instrs.vars.SetFrame;
import list.Cons;
import list.List;
import list.Nil;
import runtime.ESL;
import runtime.data.Bag;
import runtime.data.Dynamic;
import runtime.data.Grabbable;
import runtime.data.Key;
import runtime.data.Set;
import runtime.data.Term;
import runtime.functions.Closure;
import runtime.functions.CodeBox;
import runtime.messages.Message;
import runtime.messages.MessageQueue;
import runtime.messages.MessageRecord;

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

  private static int        idCounter    = 0;                           // Each actor has a unique id allocated from this counter.
  private final static Key  Time         = Key.getKey("Time");          // Functor for terms of type Time(Int).
  private int               id           = idCounter++;                 // The unique id for this actor.
  private Behaviour         behaviour    = null;                        // The message handlers.
  private Object[]          stack        = new Object[STACK_SIZE];      // The run-time stack containing call frames.
  private int               tos          = 0;                           // Top of call-stack.
  private int               frame        = -1;                          // Current call-frame.
  private int               openFrame    = -1;                          // Current call-frame under construction.
  private int               instructions = 0;                           // Count the number of instructions performed.
  private long              localTime    = System.currentTimeMillis();  // The starting time for this actor.
  private MessageQueue      messageQueue = new MessageQueue();          // Incoming messages are queued.
  private ActorState        state        = ActorState.ALIVE;            // Current operational state.
  private Object[]          failStack    = new Object[FAIL_STACK_SIZE]; // Fail stack is used for pattern-matching.
  private int               currentFail  = -1;                          // Current frame-frame.
  private int               tofs         = 0;                           // Top-of fail-stack.
  private ActorQueryMachine machine      = null;                        // Each actor has a query machine.
  private int               line;                                       // Current source-position.

  public Actor() {
  }

  public Actor(Behaviour behaviour) {
    initBehaviour(behaviour);
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
    
    // A call-frame is closed when all the arguments are pushed and the call
    // is ready to start. The supplied code-box contains the instructions.
    // The supplied catcher is used to handle any exceptions that may be raised 
    // during the call...
    
    frame = openFrame;
    setCode(code);
    setCodePtr(0);
    setDynamics(dynamics);
    setCatcher(catcher);
    setTOFS(tofs);
    setFail(currentFail);
    setSelf(this);
    tos = tos + locals;
    openFrame = -1;
  }

  public boolean complete() {

    // True when the actor is not currently executing code. When complete, an
    // actor is ready for the next message.

    return frame == -1;
  }

  public void decCodePtr() {
    setCodePtr(getCodePtr() - 1);
  }

  public void dequeueMessage() {

    // Called when the receiver is idle in order to process a message if one is
    // pending. It is important to free the message up so that it can be reused...

    synchronized (messageQueue) {
      synchronized (MessageQueue.monitor) {
        if (!messageQueue.isEmpty()) {
          MessageRecord r = messageQueue.removeRecord();
          String name = r.getName();
          int arity = r.getArity();
          // The values in the message record are not guaranteed after it has been freed...
          messageQueue.freeMessage(r);
          if (hasFunHandler(name, arity)) {
            Closure closure = getFunHandler(name, arity);
            openFrame(null, null);
            for (int i = 0; i < arity; i++) {
              pushStack(r.getValues()[i]);
            }
            closure.apply(this, this, arity);
          } else {
            Term message = r.getTerm();
            openFrame(behaviour.getCode(), new Nil<Dynamic>());
            closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
            setFrameVar(0, message);
            openFrame(null, getDynamics());
          }
        }
      }
    }
  }

  public void deQueueTime(long time) {
    if (hasFunHandler("Time", 1)) {
      Closure closure = getFunHandler("Time", 1);
      openFrame(null, null);
      pushStack(time);
      closure.apply(this, this, 1);
    } else {
      Term message = new Term(Time, time);
      openFrame(behaviour.getCode(), new Nil<Dynamic>());
      closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
      setFrameVar(0, message);
      openFrame(null, getDynamics());
    }
  }

  void die() {
    state = ActorState.DEAD;
  }

  public Dynamic dynamicRef(Key name) {

    // Not as efficient as we might like...

    if (getBehaviour().hasExport(name))
      return getBehaviour().dynamicRef(name);
    else throw new Error("cannot find exported name " + name);
  }

  public synchronized void execute() {
    while (!ESL.isStop() && state == ActorState.ALIVE) {
      while (!complete() && !ESL.isStop()) {
        int i = (int) stack[frame + CODE_PTR];
        stack[frame + CODE_PTR] = (i + 1);
        Instr next = ((CodeBox) stack[frame + CODE]).code.get(i);
        instructions++;
        line = next.getLineStart();
        // ESL.getDebugOut().println(this + ": " + next);
        // printStack();
        switch (next.code) {
          // The following is the start of in-lining the instruction handlers...
          case RETURN:
            // In the case that there is a chain of returns to perform (we need tail-calls!)
            // loop through the stacked call-frames and pop them...
            do {
              returnValue(stack[--tos]);
            } while (!complete() && getCode().getInstr(getCodePtr()).code == Instr.RETURN);
            break;
          case APPLY:
            Apply apply = (Apply) next;
            runtime.functions.Fun fun = (runtime.functions.Fun) stack[--tos];
            fun.apply(this, apply.arity);
            break;
          case APPLYDYNAMICVAR:
            ApplyDynamicVar applyDynamicVar = (ApplyDynamicVar) next;
            fun = (runtime.functions.Fun) getDynamic(applyDynamicVar.index);
            fun.apply(this, applyDynamicVar.arity);
            break;
          case APPLYFRAMEVAR:
            ApplyFrameVar applyFrameVar = (ApplyFrameVar) next;
            fun = (runtime.functions.Fun) getFrameVar(applyFrameVar.index);
            fun.apply(this, applyFrameVar.arity);
            break;
          case APPLYFUN:
            ApplyFun applyFun = (ApplyFun) next;
            closeFrame(applyFun.codeBox.getLocals() - applyFun.arity, applyFun.codeBox, getDynamics(), null);
            break;
          case DYNAMIC:
            instrs.vars.Dynamic dynamic = (instrs.vars.Dynamic) next;
            pushStack(getDynamic(dynamic.index));
            break;
          case FALSE:
            pushStack(false);
            break;
          case FRAMEVAR:
            FrameVar frameVar = (FrameVar) next;
            pushStack(stack[frame + LOCAL0 + frameVar.index]);
            break;
          case GOTO:
            Goto _goto = (Goto) next;
            stack[frame + CODE_PTR] = _goto.address;
            break;
          case HEAD:
            Cons<Object> c = (Cons) popStack();
            pushStack(c.getHead());
            break;
          case ISNIL:
            if (stack[--tos] instanceof list.Nil)
              pushStack(true);
            else pushStack(false);
            break;
          case INT:
            instrs.data.Int intInstr = (instrs.data.Int) next;
            pushStack(intInstr.value);
            break;
          case NEQL:
            Object v1 = stack[--tos];
            Object v2 = stack[--tos];
            if (v1 == null)
              pushStack(v2 != null);
            else if (v2 == null)
              pushStack(v1 != null);
            else if (v1.equals(v2))
              pushStack(false);
            else pushStack(true);
            break;
          case NULL:
            pushStack(null);
            break;
          case POP:
            --tos;
            break;
          case POPFRAME:
            returnValue(this);
            --tos;
            break;
          case Instr.SELF:
            pushStack(this);
            break;
          case SETFRAME:
            SetFrame setFrame = (SetFrame) next;
            stack[frame + LOCAL0 + setFrame.index] = stack[tos - 1];
            break;
          case SKIP:
            instrs.jumps.Skip _skip = (instrs.jumps.Skip) next;
            stack[frame + CODE_PTR] = (((int) stack[frame + CODE_PTR]) + (_skip.count - 1));
            break;
          case SKIPFALSE:
            instrs.jumps.SkipFalse _skipFalse = (instrs.jumps.SkipFalse) next;
            if (!((boolean) popStack())) stack[frame + CODE_PTR] = (((int) stack[frame + CODE_PTR]) + (_skipFalse.count - 1));
            break;
          case SKIPTRUE:
            instrs.jumps.SkipTrue _skipTrue = (instrs.jumps.SkipTrue) next;
            if ((boolean) popStack()) stack[frame + CODE_PTR] = (((int) stack[frame + CODE_PTR]) + (_skipTrue.count - 1));
            break;
          case SHOW:
            QShow showInstr = (QShow) next;
            qShow(showInstr.getClause(), showInstr.getTimeoutAddress(), showInstr.getAltAddress());
            break;
          case STARTCALL:
            openFrame(null, null);
            break;
          case TAIL:
            Cons<Object> c2 = (Cons) popStack();
            pushStack(c2.getTail());
            break;
          case TERM:
            instrs.data.Term term = (instrs.data.Term) next;
            if (term.arity == 0)
              pushStack(new runtime.data.Term(term.name, runtime.data.Term.noValues));
            else {
              Object[] values = new Object[term.arity];
              for (int arg = term.arity - 1; arg >= 0; arg--)
                values[arg] = stack[--tos];
              pushStack(new runtime.data.Term(term.name, values));
            }
            break;
          case TRUE:
            pushStack(true);
            break;
          default: {
            // ESL.getDebugOut().println(next);
            next.perform(this);
          }
        }
      }
      reset();
      synchronized (messageQueue) {
        if (messageQueue.isEmpty())
          if (behaviour.handlesTime()) {
            deQueueTime(System.currentTimeMillis() - localTime);
          } else try {
            messageQueue.wait();
            dequeueMessage();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        else dequeueMessage();
      }
    }
  }

  public long getLocalTime() {
    return localTime;
  }

  public void setLocalTime(long localTime) {
    this.localTime = localTime;
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

  // The number of instructions that have been executed since the actor was
  // created...

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

  public Instr advanceCode() {
    int i = (int) stack[frame + CODE_PTR];
    stack[frame + CODE_PTR] = (i + 1);
    return ((CodeBox) stack[frame + CODE]).code.get(i);
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

  public Key[] getExports() {
    return behaviour.getExports();
  }

  public int getFail() {
    return (int) stack[frame + FAIL];
  }

  public int getFrame() {
    return frame;
  }

  public Vector<Object> getFrame(int framePtr) {
    Vector<Object> frame = new Vector<Object>();
    frame.add(stack[framePtr + PREV_FRAME]);
    frame.add(stack[framePtr + PREV_OPEN_FRAME]);
    frame.add(stack[framePtr + TOS]);
    frame.add(stack[framePtr + CODE]);
    frame.add(stack[framePtr + CODE_PTR]);
    frame.add(stack[framePtr + DYNAMICS]);
    frame.add(stack[framePtr + CATCHER]);
    frame.add(stack[framePtr + TOFS]);
    frame.add(stack[framePtr + FAIL]);
    CodeBox codeBox = (CodeBox) stack[framePtr + CODE];
    int locals = codeBox.getLocals();
    for (int i = 0; i < locals; i++)
      frame.add(stack[framePtr + LOCAL0 + i]);
    return frame;
  }

  public Vector<String> getFrameNames(int framePtr) {
    Vector<String> names = new Vector<String>();
    names.add("PREV_FRAME");
    names.add("PREV_OPEN_FRAME");
    names.add("TOS");
    names.add("CODE");
    names.add("CODE_PTR");
    names.add("DYNAMICS");
    names.add("CATCHER");
    names.add("TOFS");
    names.add("FAIL");
    CodeBox codeBox = (CodeBox) stack[framePtr + CODE];
    int locals = codeBox.getLocals();
    for (int i = 0; i < locals; i++)
      names.add("LOCAL" + i);
    return names;
  }

  public Object getFrameVar(int index) {
    return stack[frame + LOCAL0 + index];
  }

  public Closure getFunHandler(String name, int arity) {
    return behaviour.getFunHandler(name, arity);
  }

  public int getId() {
    return id;
  }

  public int getInstructions() {
    return instructions;
  }

  public int getLine() {
    return line;
  }

  public MessageQueue getMessageQueue() {
    return messageQueue;
  }

  public String getPath() {
    return getBehaviour().getPath();
  }

  public String getPathName() {
    return getBehaviour().getPathName();
  }

  public int getPrevFrame(int frame) {
    return (int) stack[frame + PREV_FRAME];
  }

  public Actor getSelf() {
    return getSelf(frame);
  }

  public Actor getSelf(int frame) {
    return (Actor) stack[frame + runtime.actors.Stack.SELF];
  }

  public ActorState getState() {
    return state;
  }

  public int getTOFS() {
    return (int) stack[frame + TOFS];
  }

  private void growFailStack() {
    Object[] newStack = new Object[failStack.length + GROW_FAIL_STACK];
    for (int i = 0; i < failStack.length; i++)
      newStack[i] = failStack[i];
    failStack = newStack;
  }

  private void growStack() {
    Object[] newStack = new Object[stack.length + GROW_STACK];
    for (int i = 0; i < stack.length; i++)
      newStack[i] = stack[i];
    stack = newStack;
  }

  public boolean hasExport(Key name) {
    return behaviour.hasExport(name);
  }

  public boolean hasFunHandler(String name, int arity) {
    return behaviour.hasFunHandler(name, arity);
  }

  public void incCodePtr() {
    setCodePtr(getCodePtr() + 1);
  }

  public void incCodePtr(int count) {
    setCodePtr(getCodePtr() + count);
  }

  public void initBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
    ESL.registerActor(this);
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
    setCodePtr(behaviour.getInitIndex());
    newActorListener.newActor(this);
  }

  public void initSystem(CodeBox code) {
    // This is called once on the first actor in the system...
    frame = -1;
    openFrame = -1;
    openFrame(code, new Nil<Dynamic>());
    closeFrame(code.getLocals(), code, Builtins.builtinEnv(), null);
    behaviour = new Behaviour("$system", new Key[0], Builtins.builtinEnv(), 0, code, false, new Hashtable<String, Closure>(), this);
  }

  public void kill() {
    ESL.kill(this);
    state = ActorState.DEAD;
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

  public Instr nextInstr() {
    if (complete())
      return null;
    else {
      CodeBox code = getCode();
      int codePtr = getCodePtr();
      return code.getInstr(codePtr);
    }
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
    pushStack(this);
    openFrame = tos - LOCAL0;
  }

  public Object peek() {
    return peek(0);
  }

  public Object peek(int i) {
    return stack[tos - (i + 1)];
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
    CodeBox c = (CodeBox) stack[f + CODE];
    Vector<Instr> instrs = c.getCode();
    int codePtr = (int) stack[f + CODE_PTR];
    ESL.getDebugOut().println(hashCode() + "------------------------------------");
    for (int i = ((CodeBox) stack[f + CODE]).getLocals() - 1; i >= 0; i--)
      ESL.getDebugOut().format("[%08d] LOC%-8d     %s %n", f + LOCAL0 + i, i, stack[f + LOCAL0 + i]);
    java.util.List<Instr> rest = instrs.subList(codePtr, instrs.size());
    ESL.getDebugOut().format("[%08d] FAIL            %08d %n", f + FAIL, stack[f + FAIL]);
    ESL.getDebugOut().format("[%08d] TOFS            %08d %n", f + TOFS, stack[f + TOFS]);
    ESL.getDebugOut().format("[%08d] CATCHER            %08d %n", f + CATCHER, stack[f + CATCHER]);
    ESL.getDebugOut().format("[%08d] DYNAMICS        %s %n", f + DYNAMICS, stack[f + DYNAMICS]);
    ESL.getDebugOut().format("[%08d] CODE_PTR        %08d %n", f + CODE_PTR, stack[f + CODE_PTR]);
    ESL.getDebugOut().format("[%08d] CODE            %s %n", f + CODE, rest);
    ESL.getDebugOut().format("[%08d] TOS             %08d %n", f + TOS, stack[f + TOS]);
    ESL.getDebugOut().format("[%08d] PREV OPEN FRAME %08d %n", f + PREV_OPEN_FRAME, stack[f + PREV_OPEN_FRAME]);
    ESL.getDebugOut().format("[%08d] PREV FRAME      %08d %n", f + PREV_FRAME, stack[f + PREV_FRAME]);
    ESL.getDebugOut().println(hashCode() + "------------------------------------");
  }

  public void printStack() {
    if (openFrame > -1) {
      ESL.getDebugOut().println("OPEN FRAME ----> ");
      ESL.getDebugOut().format("[%08d] DYNAMICS        %s %n", openFrame + DYNAMICS, stack[openFrame + DYNAMICS]);
      ESL.getDebugOut().format("[%08d] CODE_PTR        %08d %n", openFrame + CODE_PTR, stack[openFrame + CODE_PTR]);
      ESL.getDebugOut().format("[%08d] CODE            %s %n", openFrame + CODE, stack[openFrame + CODE]);
      ESL.getDebugOut().format("[%08d] TOS             %08d %n", openFrame + TOS, stack[openFrame + TOS]);
      ESL.getDebugOut().format("[%08d] PREV OPEN FRAME %08d %n", openFrame + PREV_OPEN_FRAME, stack[openFrame + PREV_OPEN_FRAME]);
      ESL.getDebugOut().format("[%08d] PREV FRAME      %08d %n", openFrame + PREV_FRAME, stack[openFrame + PREV_FRAME]);
      ESL.getDebugOut().println("<------ OPEN FRAME");
    }
    if (tos > 0) ESL.getDebugOut().format("TOS[%08d] = %s%n", tos - 1, tos());
    ESL.getDebugOut().println("OPEN FRAME = " + openFrame);
    int f = frame;
    while (f != -1) {
      printFrame(f);
      f = (int) stack[f + PREV_FRAME];
    }
    ESL.getDebugOut().println("\n\n");
  }

  public void processMessage(Object message) {
    openFrame(behaviour.getCode(), new Nil<Dynamic>());
    closeFrame(behaviour.getCode().getLocals(), behaviour.getCode(), behaviour.getDynamics(), null);
    setFrameVar(0, message);
    openFrame(null, getDynamics());
  }

  public void pushDynamic(int index) {

    // Push the dynamic variable (not its value) onto the stack...

    Dynamic dynamic = getDynamics().nth(index);
    pushStack(dynamic);
  }

  public void pushFailStack(Object o) {
    if (tofs >= failStack.length) growFailStack();
    failStack[tofs++] = o;
  }

  public void pushStack(Object o) {
    if (tos >= stack.length) growStack();
    stack[tos++] = o;
  }

  public void qRecons() {

    // The machine may have spawned children in which case the recons should be
    // performed with respect to the leaf child. If there is more than one child
    // that is valid then something went wrong since the PARWIN instructions
    // should have killed off the siblings...

    Machine leaf = machine;
    while (!leaf.getChildren().isEmpty()) {
      for (Machine child : leaf.getChildren()) {
        if (child.isValidChild()) leaf = child;
      }
    }
    pushStack(leaf.recons(popStack()));
  }

  public void qShow(Clause clause, int timeoutAddress, int altAddress) {

    // Initialize the actor's query machine with the supplied knowledge base and
    // the rules. The variables required by the clause are currently on the call
    // stack. The fail address is the absolute code index to jump to if the clause
    // fails on the query machine.
    //
    // This method may be called in modes:
    // (1) The first time the actor tries to perform SHOW.
    // (2) When the previous SHOW terminated (success or fail).

    if (machine == null) {
      // Case (1)...
      int timeout = (int) popStack();
      DB knowledge = (DB) popStack();
      ClauseTable rules = (ClauseTable) popStack();
      machine = new ActorQueryMachine(rules, knowledge, this, timeout);
    } else {
      // Case (2) ...
      int timeout = (int) popStack();
      DB knowledge = (DB) popStack();
      ClauseTable rules = (ClauseTable) popStack();
      machine.resetMachine();
      machine.setClauseTable(rules);
      machine.setDB(knowledge);
      machine.setTimeout(timeout);
    }

    machine.resetMachine();
    machine.startCall();
    for (int i = 0; i < clause.getArity(); i++)
      machine.pushCallStack(popStack());
    machine.enter(clause, clause.getArity(), clause.getVars());
    System.gc();
    // machine.setTraceInstrs(true);
    machine.run();
    if (machine.timedOut()) {
      setCodePtr(timeoutAddress);
      machine = null;
    } else {
      if (machine.isFailed()) {
        setCodePtr(altAddress);
      }
    }
  }

  public void queueMessage(String name, int arity, Actor source) {

    // Called when the receiver is the target of a message from the source actor.
    // The arguments to the message are on the stack...

    synchronized (messageQueue) {
      synchronized (MessageQueue.monitor) {
        MessageRecord message = messageQueue.addNewRecord(name, arity);
        for (int i = arity - 1; i >= 0; i--)
          message.getValues()[i] = source.popStack();
        // messageListener.send(ESL.getTime(), source.getId(), getId(), name, message.getValues());
        messageQueue.notifyAll();
      }
    }
  }

  public void queueMessage(String name, Object[] values) {

    // This is not efficient and should be replaced with a record-based allocation
    // by the caller...

    synchronized (messageQueue) {
      synchronized (MessageQueue.monitor) {
        MessageRecord r = new MessageRecord(name, values);
        messageQueue.addRecord(r);
        messageQueue.notifyAll();
      }
    }
  }

  public void queueTime(int time) {
    if (complete()) {
      synchronized (messageQueue) {
        synchronized (MessageQueue.monitor) {
          MessageRecord message = messageQueue.addNewRecord("Time", 1);
          message.getValues()[0] = time;
          messageQueue.notifyAll();
        }
      }
    }
  }

  public Object ref(Key name) {
    return behaviour.ref(name);
  }

  public void reset() {
    frame = -1;
    openFrame = -1;
    tos = 0;
    currentFail = -1;
    tofs = 0;
  }

  public void returnValue(Object value) {
    popFrame();
    pushStack(value);
  }

  public Object right(int id) {

    // Find the list with id in the fail stack. The index in the fail stack
    // defines the point at which to split the list. Return the right
    // sub-list...

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

  public void run() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        execute();
      }
    });
    t.start();
  }

  public void send(Actor source, String name, Object[] values) {
    queueMessage(name, values);
  }

  public void send(JavaActor source, String name, Object[] values) {
    queueMessage(name, values);
  }

  public void setBehaviour(Behaviour newBehaviour) {
    Behaviour oldBehaviour = behaviour;
    behaviour = newBehaviour;
    behaviourListener.behaviourChanged(this, oldBehaviour, newBehaviour);
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

  public void setSelf(Actor self) {
    setSelf(frame, self);
  }

  public void setSelf(int frame, Actor self) {
    stack[frame + runtime.actors.Stack.SELF] = self;
  }

  public void setState(ActorState state) {
    this.state = state;
  }

  public void setTOFS(int sp) {
    stack[frame + TOFS] = sp;
  }

  public boolean stackEmpty() {
    return tos == 0;
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
    return behaviour.getName() + "(" + id + ")";
  }

  public void tryAddBags(Bag bag, int id) {

    // Create a try frame on the fail stack that can be used to manage
    // backtracking.
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

    // Create a try frame on the fail stack that can be used to manage
    // backtracking.
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

    // Create a try frame on the fail stack that can be used to manage
    // backtracking.
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

    // Create a try frame on the fail stack that can be used to manage
    // backtracking
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

    // Create a try frame on the fail stack that can be used to manage
    // backtracking
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
