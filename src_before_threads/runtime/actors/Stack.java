package runtime.actors;

public class Stack {

  public static final int STACK_SIZE      = 1000; // The initial size of the actor stack...

  public static final int GROW_STACK      = 750;  // Amount to grow an actor stack on overflow.
  public static final int GROW_FAIL_STACK = 100;  // Amount to grow the fail stack on overflow.

  // The stack frame offsets for an actor...

  public static final int PREV_FRAME      = 0;    // Function calls push and pop stack frames via this link.
  public static final int PREV_OPEN_FRAME = 1;    // Creating a frame might involve a single function call.
  public static final int TOS             = 2;    // Reset the top of stack when return (should not be needed).
  public static final int CODE            = 3;    // The code-box for the frame.
  public static final int CODE_PTR        = 4;    // The index into the code-box.
  public static final int DYNAMICS        = 5;    // A list of dynamic variables for the frame.
  public static final int CATCHER         = 6;    // Set if the current frame has a try-catch.
  public static final int TOFS            = 7;    // The saved TOFS to be restored when this frame returns.
  public static final int FAIL            = 8;    // The saved currentFail frame to be restored on return.
  public static final int SELF            = 9;    // The value of self.
  public static final int LOCAL0          = 10;   // The start of the locals. The number of locals is in CODE.

  public static final int FAIL_STACK_SIZE = 200;  // The maximum fail stack size...

  // The fail frame offsets for an actor...

  public final static int FAIL_PREV       = 0;
  public final static int FAIL_TYPE       = 1;
  public final static int FAIL_CODE       = 2;
  public final static int FAIL_TOS        = 3;
  public final static int FAIL_COLLECTION = 4;
  public final static int FAIL_ID         = 5;
  public final static int FAIL_INDEX      = 6;

}
