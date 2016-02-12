package actors;

import java.util.Arrays;
import java.util.Vector;

import instrs.Instr;
import list.List;
import list.Nil;

public class Actor {

  static final int     STACK_SIZE      = 1000;

  // All the actors..

  static Vector<Actor> ACTORS          = new Vector<Actor>();

  // Stack frame offsets...

  static final int     PREV_FRAME      = 0;
  static final int     PREV_OPEN_FRAME = 1;
  static final int     TOS             = 2;
  static final int     CODE            = 3;
  static final int     CODE_PTR        = 4;
  static final int     DYNAMICS        = 5;
  static final int     LOCAL0          = 6;

  // The values supplied when the actor was created...

  Object[]             state;

  // The code that will be used to handle messages...

  Behaviour            behaviour;

  // The stack...

  Object[]             stack           = new Object[STACK_SIZE];

  // The top of stack...

  int                  tos;

  // The current frame...

  int                  frame;

  // The current open frame...

  int                  openFrame;

  public Actor(Object[] state, Behaviour behaviour) {
    this.state = state;
    this.behaviour = behaviour;
    ACTORS.add(this);
  }

  public void addDynamic(Object value) {
    setDynamics(getDynamics().cons(new Dynamic(value)));
  }

  public void closeFrame(int locals, CodeBox code, List<Dynamic> dynamics) {
    frame = openFrame;
    setCode(code);
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
    for (Object o : state)
      pushStack(o);
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

  public void run() {
    while (!complete()) {
      Vector<Instr> code = getCode().getCode();
      int i = getCodePtr();
      incCodePtr();
      Instr next = getCode().getInstr(i);
      //System.out.println(next);
      next.perform(this);
    }
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

  public Object getFrameVar(int index) {
    return stack[frame + LOCAL0 + index];
  }

  public void setFrameVar(int index, Object value) {
    stack[frame + LOCAL0 + index] = value;
  }

  public Object tos() {
    return stack[tos - 1];
  }

  public String toString() {
    return "Actor(" + Arrays.toString(state) + "," + behaviour + ")";
  }

  public void returnValue(Object value) {
    tos = (int) stack[frame + TOS];
    openFrame = (int) stack[frame + PREV_OPEN_FRAME];
    frame = (int) stack[frame + PREV_FRAME];
    pushStack(value);
  }

}
