package ast.query.machine;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

import ast.query.body.Call;
import ast.query.body.DBName;
import ast.query.rules.Clause;
import ast.query.rules.ClauseTable;
import ast.query.rules.RuleBase;
import ast.query.value.Var;
import ast.query.value.Wild;
import context.StringSource;
import exp.Exp;
import grammar.Grammar;
import history.History;
import list.Cons;
import list.List;
import list.Maybe;
import runtime.ESL;
import runtime.data.Key;
import runtime.data.Term;
import values.JavaObject;
import xpl.Interpreter;

public class Machine {

  private static final int K                       = 1024;
  private static final int CALL_STACK_SIZE         = 10 * K;
  private static final int FAIL_STACK_SIZE         = 10 * K;

  private static final int CALL_PREV               = 0;
  private static final int CALL_CUT                = 1;
  private static final int CALL_CLAUSE             = 2;
  private static final int CALL_CODEPTR            = 3;
  private static final int CALL_TRY                = 4;
  private static final int CALL_TIME               = 5;
  private static final int CALL_INDENT             = 6;
  private static final int CALL_CHOICE_MODE        = 7;
  private static final int CALL_LOCAL0             = 8;

  private static final int FAIL_PREV               = 0;
  private static final int FAIL_TYPE               = 1;
  private static final int FAIL_CLAUSES            = 2;
  private static final int FAIL_FORALL_OFFSET      = 2;
  private static final int FAIL_IF_OFFSET          = 2;
  private static final int FAIL_DB_ARITY           = 2;
  private static final int FAIL_EVENTUALLY_CODEPTR = 2;
  private static final int FAIL_PAST_CODEPTR       = 2;
  private static final int FAIL_PARENT             = 2;
  private static final int FAIL_CLAUSEPTR          = 3;
  private static final int FAIL_EVENTUALLY_TIME    = 3;
  private static final int FAIL_PAST_TIME          = 3;
  private static final int FAIL_CALLFRAME          = 4;
  private static final int FAIL_TRAIL              = 5;
  private static final int FAIL_FRAME_SIZE         = 6;

  private static final int FAIL_TYPE_NORMAL        = 0;
  private static final int FAIL_TYPE_FORALL        = 1;
  private static final int FAIL_TYPE_IF            = 2;
  private static final int FAIL_TYPE_DB            = 3;
  private static final int FAIL_TYPE_EVENTUALLY    = 4;
  private static final int FAIL_TYPE_PAST          = 5;
  private static final int FAIL_TYPE_PAR           = 6;

  private static final int CHOICE_SEQ              = 1;
  private static final int CHOICE_PAR              = 2;

  private static int       counter                 = 0;

  public static void main(String[] args) {
    try {
      String path = "esl/query/test.q";
      String historyPath = "/Users/acestc4/Dropbox/SHU_Files/Research/ESL/histories";
      FileInputStream in = new FileInputStream(path);
      String text = "";
      int c = in.read();
      while (c != -1) {
        text = text + (char) c;
        c = in.read();
      }
      Call.setDBNames(new DBName[] { new DBName(Key.getKey("actor"), 3), new DBName(Key.getKey("send"), 4), new DBName(Key.getKey("state"), 4) });
      Grammar grammar = Interpreter.getGrammar("xpl/query.xpl", "query");
      Object o = null;
      JavaObject jo = (JavaObject) Interpreter.parseCharSource(path, grammar, "ruleBase", new StringSource(text), new Exp[] {}, false);
      RuleBase rules = (RuleBase) jo.getTarget();
      System.out.println(rules);
      History history = History.inflate(historyPath + "/shop/end.hst");
      long t0 = System.currentTimeMillis();
      DB db = new DB() {

        public int endOfTime() {
          return 1;
        }

        public Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine) {
          if (argNumber == 0)
            return index;
          else return index + 1;
        }

        public boolean hasFact(Key name, int arity, int time, int index, Machine machine) {
          return name.getString().equals("x") && arity == 2 && index < 1000;
        }

        public boolean isEnd(int time) {
          return time == 1;
        }
      };
      Machine machine = new Machine(rules.compile(), history);
      machine.init(Key.getKey("main"));
      System.out.println(System.currentTimeMillis() - t0);
    } catch (IOException ioe) {
      ioe.printStackTrace(System.err);
    }
  }

  private ClauseTable     clauseTable;

  private DB              db;

  private Object[]        callStack      = new Object[CALL_STACK_SIZE];
  private Object[]        failStack      = new Object[FAIL_STACK_SIZE];

  private Vector<Machine> children       = new Vector<Machine>();
  private Machine         parent         = null;

  private Stack<Var>      trail          = new Stack<Var>();
  private int             tos            = 0;
  private int             tofs           = 0;
  private int             callFrame      = -1;
  private int             failFrame      = -1;
  protected int           programCounter = 0;
  private int             time           = 0;
  private int             indent         = 0;
  private int             choiceMode     = CHOICE_SEQ;
  private boolean         traceInstrs    = false;
  private boolean         traceCalls     = false;
  private boolean         failed         = false;
  private int             id             = counter++;

  public Machine() {
  }

  public Machine(ClauseTable clauseTable, DB db) {
    this.clauseTable = clauseTable;
    this.db = db;
  }

  public void backtrack(int trailPtr) {
    // Undo all the variable bindings back to the saved trail pointer...
    while (trail.size() > trailPtr) {
      Var var = trail.pop();
      var.setValue(this, null);
    }
  }

  public void cond(int offset) {

    // Creates a fail frame corresponding to an IF body element.
    // The frame ensures that the correct instructions are executed
    // depending on whether the test is satisfied or not...

    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_IF);
    pushFailStack(offset);
    pushFailStack(0);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public void cut() {
    // Throw away fail frames...
    while (failFrame != getCut()) {
      popFailFrame();
    }
  }

  public Object deref(Object v) {

    // Variable bindings can chain. This is used to dereference a variable
    // to the value (or last variable in the chain). For this reason we assume
    // there are no cycles (but don't check)...

    if (v instanceof Var) {
      Var var = (Var) v;
      Object value = var.getValue(this);
      if (value != null)
        return deref(value);
      else return var;
    } else return v;
  }

  public int enter(Clause clause, int arity, int vars) {

    // Called when a clause is to be tried. The arguments are on the
    // stack and the clause requires the supplied number of local variables.
    // The current state of the call frame is saved so that it can be
    // restored on return...

    callFrame = tos - (arity + CALL_LOCAL0);
    if (traceCalls && clause != null) trace(clause);
    for (int i = 0; i < vars; i++)
      pushCallStack(new Var());
    setCallFrameClause(clause);
    setCodePtr(programCounter);
    setTime(time);
    setIndent(indent);
    setChoiceMode(choiceMode);
    spy(clause);
    programCounter = 0;
    return callFrame;
  }

  public void enter(Key name, int arity) {

    // The named rule is being called with the arguments on the stack. If there is
    // more than 1 clause for the rule then this method creates a new fail frame.
    // The fail frame saves the index into the list of clauses so that the next
    // clause is tried when the fail is used for backtracking...

    Vector<Clause> clauses = getClauses(name, arity);
    if (clauses.size() == 0) throw new Error("no definition for " + name.getString() + "/" + arity);
    if (clauses.size() == 1) {
      Clause clause = clauses.get(0);
      enter(clause, clause.getArity(), clause.getVars());
    } else if (choiceMode == CHOICE_SEQ) {
      Clause clause = clauses.get(0);
      int newFrame = enter(clause, clause.getArity(), clause.getVars());
      pushFail(1, clauses, newFrame);
    } else if (choiceMode == CHOICE_PAR) {
      for (Clause clause : clauses) {
        Machine child = newChild();
        child.enter(clause, clause.getArity(), clause.getVars());
      }
    } else throw new Error("unknown choice mode: " + choiceMode);
  }

  public void enterDB(Key name, int arity) {

    // The machine-database may contain a number of facts that match the
    // supplied name and arity, and at the current time...

    if (db != null) {
      if (db.hasFact(name, arity, time, 0, this)) {
        pushCallStack(name);
        // Push a fail frame and unify the elements in the database.
        int newFrame = enter(null, arity + 1, 0);
        if (db.hasFact(name, arity, time, 1, this)) pushDBFail(1, arity, newFrame);
        boolean ok = true;
        for (int i = 0; i < arity && ok; i++) {
          Object value = getLocal(i);
          Object dbValue = db.getFactArg(name, arity, time, 0, i, this);
          if (!unify(value, dbValue)) ok = false;
        }
        if (!ok)
          fail();
        else returnFrame();
      } else fail();
    } else fail();
  }

  public int enterLast(Clause clause) {

    // Called when this is the last body element in the last clause of a rule
    // definition. The motivation is that the current call frame can be reused
    // because it should not be needed again...

    int currentFrameSize = getCallClause().getArity() + getCallClause().getVars();
    int requiredFrameSize = clause.getArity() + clause.getVars();
    if (requiredFrameSize <= currentFrameSize) {
      // Move the open frame down on to the current frame...
      for (int i = 0; i < clause.getArity(); i++) {
        setLocal(i, callStack[(tos - clause.getArity()) + i]);
      }
      for (int i = clause.getArity(); i < clause.getArity() + clause.getVars(); i++) {
        setLocal(i, new Var());
      }
      setCallFrameClause(clause);
      setTime(time);
      spy(clause);
      programCounter = 0;
    } else enter(clause, clause.getArity(), clause.getVars());
    return callFrame;
  }

  public void eventually(int offset) {
    setLocal(offset, time);
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_EVENTUALLY);
    pushFailStack(programCounter);
    pushFailStack(time);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public void fact(Object value) {
    value = deref(value);
    if (value instanceof Term) {
      Term term = (Term) value;
      Key name = term.getName();
      int arity = term.getArity();
      startCall();
      for (Object arg : term.getValues())
        pushCallStack(arg);
      enterDB(name, arity);
    } else fail();
  }

  public void fail() {

    // Called when we need to backtrack. There are several types of fail stack frame.
    // Switch on the type of frame and perform the appropriate stack manipulation...

    if (failFrame != -1) {

      switch (getFailType()) {

        case FAIL_TYPE_NORMAL:

          Vector<Clause> clauses = getFailClauses();
          int i = getFailClausePtr();
          if (clauses.size() == i) {
            popFailFrame();
            fail();
          } else {

            // rewind to the appropriate call frame.

            backtrack(getFailTrailPtr());
            callFrame = getFailCallFrame();
            Clause clause = clauses.get(i);
            int arity = clause.getArity();
            int vars = clause.getVars();
            indent = getIndent() + 2;
            tos = callFrame + CALL_LOCAL0 + arity;
            for (int j = 0; j < vars; j++)
              pushCallStack(new Var());
            setCallFrameClause(clause);
            if (i + 1 == clauses.size())
              popFailFrame();
            else incFailClausePtr();
            programCounter = 0;
            time = getTime();
            choiceMode = getChoiceMode();
            retry(clause);
          }
          break;

        case FAIL_TYPE_FORALL:

          // rewind to the appropriate call frame.

          backtrack(getFailTrailPtr());
          callFrame = getFailCallFrame();
          Clause clause = getCallClause();
          int arity = clause.getArity();
          int vars = clause.getVars();
          programCounter = getForallOffset();
          time = getTime();
          choiceMode = getChoiceMode();
          popFailFrame();
          break;

        case FAIL_TYPE_IF:

          // rewind to the appropriate call frame.

          backtrack(getFailTrailPtr());
          callFrame = getFailCallFrame();
          clause = getCallClause();
          arity = clause.getArity();
          vars = clause.getVars();
          programCounter = getIfOffset();
          time = getTime();
          choiceMode = getChoiceMode();
          popFailFrame();
          break;

        case FAIL_TYPE_DB:

          // rewind to the database interrogation.

          backtrack(getFailTrailPtr());
          callFrame = getFailCallFrame();
          int dbIndex = getFailClausePtr();
          arity = getFailDBArity();
          Key name = (Key) getLocal(arity);
          if (db.hasFact(name, arity, getTime(), dbIndex, this)) {
            incFailClausePtr();
            boolean ok = true;
            for (int arg = 0; arg < arity && ok; arg++) {
              Object value = getLocal(arg);
              Object dbValue = db.getFactArg(name, arity, time, dbIndex, arg, this);
              if (!unify(value, dbValue)) ok = false;
            }
            if (!ok)
              fail();
            else returnFrame();
          } else {
            popFailFrame();
            fail();
          }
          break;

        case FAIL_TYPE_EVENTUALLY:

          // Unless we are at the end of time, backtrack, increment time
          // and try the code again from the same program counter...

          backtrack(getFailTrailPtr());
          callFrame = getFailCallFrame();
          int currentTime = getEventuallyTime();
          if (currentTime > db.endOfTime()) {
            popFailFrame();
            fail();
          } else {
            setEventuallyTime(currentTime + 1);
            programCounter = getEventuallyCodePtr();
            time = currentTime + 1;
            choiceMode = getChoiceMode();
          }
          break;

        case FAIL_TYPE_PAST:

          // Unless we are at the start of time, backtrack, increment time
          // and try the code again from the same program counter...

          backtrack(getFailTrailPtr());
          callFrame = getFailCallFrame();
          int currentpTime = getPastTime();
          if (currentpTime == 0) {
            popFailFrame();
            fail();
          } else {
            setEventuallyTime(currentpTime - 1);
            programCounter = getPastCodePtr();
            time = currentpTime - 1;
            choiceMode = getChoiceMode();
          }
          break;

        case FAIL_TYPE_PAR:

          // This machine is killed off. If we are the last child of the
          // parent saved in the fail frame then there are no options left
          // and the fail is popped and the previous frame is used...

          setParent(null); // Causes this machine to become invalid.
          setFailed(true);
          Machine parent = getFailParent();
          if (!parent.hasValidChild()) {
            parent.setFailed(true);
            popFailFrame();
            fail();
          }
          break;

        default:
          throw new Error("unknown type of fail frame: " + getFailType());
      }
    } else setFailed(true);

  }

  public void forall(int offset) {
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_FORALL);
    pushFailStack(offset);
    pushFailStack(0);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public Clause getCallClause() {
    return (Clause) callStack[callFrame + CALL_CLAUSE];
  }

  public int getCallFrame() {
    return callFrame;
  }

  public Vector<Machine> getChildren() {
    return children;
  }

  private int getChoiceMode() {
    return (int) callStack[callFrame + CALL_CHOICE_MODE];
  }

  protected Vector<ast.query.instrs.Instr> getClauseCode() {
    return getCallClause().getCode();
  }

  public Vector<Clause> getClauses(Key name, int i) {
    return clauseTable.getClauses(name).getClauses(i);
  }

  public ClauseTable getClauseTable() {
    return clauseTable;
  }

  private int getCodePtr() {
    return (int) callStack[callFrame + CALL_CODEPTR];
  }

  private int getCut() {
    return (int) callStack[callFrame + CALL_CUT];
  }

  public DB getDB() {
    return db;
  }

  private int getEventuallyCodePtr() {
    return (int) failStack[failFrame + FAIL_EVENTUALLY_CODEPTR];
  }

  private int getEventuallyTime() {
    return (int) failStack[failFrame + FAIL_EVENTUALLY_TIME];
  }

  public int getFailCallFrame() {
    return (int) failStack[failFrame + FAIL_CALLFRAME];
  }

  private int getFailClausePtr() {
    return (int) failStack[failFrame + FAIL_CLAUSEPTR];
  }

  private Vector<Clause> getFailClauses() {
    return (Vector<Clause>) failStack[failFrame + FAIL_CLAUSES];
  }

  private int getFailDBArity() {
    return (int) failStack[failFrame + FAIL_DB_ARITY];
  }

  public int getFailFrame() {
    return failFrame;
  }

  private Machine getFailParent() {
    return (Machine) failStack[failFrame + FAIL_PARENT];
  }

  private int getFailPrev() {
    return (int) failStack[failFrame + FAIL_PREV];
  }

  private int getFailTrailPtr() {
    return (int) failStack[failFrame + FAIL_TRAIL];
  }

  private int getFailType() {
    return (int) failStack[failFrame + FAIL_TYPE];
  }

  private int getForallOffset() {
    return (int) failStack[failFrame + FAIL_FORALL_OFFSET];
  }

  private int getIfOffset() {
    return (int) failStack[failFrame + FAIL_IF_OFFSET];
  }

  public int getIndent() {
    return (int) callStack[callFrame + CALL_INDENT];
  }

  public Object getLocal(int n) {
    return callStack[callFrame + CALL_LOCAL0 + n];
  }

  public Machine getParent() {
    return parent;
  }

  private int getPastCodePtr() {
    return (int) failStack[failFrame + FAIL_PAST_CODEPTR];
  }

  private int getPastTime() {
    return (int) failStack[failFrame + FAIL_PAST_TIME];
  }

  public int getProgramCounter() {
    return programCounter;
  }

  private int getTime() {
    return (int) callStack[callFrame + CALL_TIME];
  }

  public int getTrailPtr() {
    return trail.size();
  }

  public TryFrame getTry() {
    return (TryFrame) callStack[callFrame + CALL_TRY];
  }

  public void go(int offset) {
    programCounter = offset;
  }

  private void growCallStack() {
    Object[] newCallStack = new Object[callStack.length + (10 * K)];
    for (int i = 0; i < callStack.length; i++)
      newCallStack[i] = callStack[i];
    callStack = newCallStack;
  }

  private boolean hasChild(Machine m) {
    for (Machine child : getChildren()) {
      if (child == m || child.hasChild(m)) return true;
    }
    return false;
  }

  private boolean hasValidChild() {
    for (Machine child : getChildren()) {
      if (child.isValidChild() || child.hasValidChild()) return true;
    }
    return false;
  }

  private void incFailClausePtr() {
    setFailClausePtr(getFailClausePtr() + 1);
  }

  protected void incProgramCounter() {
    programCounter++;
  }

  public void init(Key name, Object... args) {

    // Called to start the machine...

    resetMachine();
    startCall();
    for (Object arg : args)
      pushCallStack(arg);
    enter(name, args.length);
    run();
  }

  public boolean isEnd() {
    if (db == null)
      return false;
    else return db.isEnd(time);
  }

  public boolean isFailed() {
    if (children.isEmpty())
      return failed;
    else {
      for (Machine child : children) {
        if (!child.isFailed()) return false;
      }
      return true;
    }
  }

  public boolean isTraceCalls() {
    return traceCalls;
  }

  public boolean isTraceInstrs() {
    return traceInstrs;
  }

  public boolean isValidChild() {
    return getParent() != null;
  }

  private void killSiblings(Machine machine) {
    for (Machine child : getChildren()) {
      if (!(child == machine || child.hasChild(machine))) {
        child.setParent(null);
      }
      child.killSiblings(machine);
    }
  }

  public void loadDB(String path) {
    db = History.inflate(path);
  }

  protected Machine newChild() {
    Machine machine = newMachine();
    machine.clauseTable = clauseTable;
    machine.db = db;
    machine.callStack = callStack.clone();
    machine.failStack = failStack.clone();
    machine.parent = this;
    machine.trail = (Stack<Var>) trail.clone();
    machine.tos = tos;
    machine.tofs = tofs;
    machine.callFrame = callFrame;
    machine.failFrame = failFrame;
    machine.programCounter = programCounter;
    machine.time = time;
    machine.indent = indent;
    machine.choiceMode = choiceMode;
    machine.traceInstrs = traceInstrs;
    machine.traceCalls = traceCalls;
    machine.failed = failed;
    children.add(machine);
    return machine;
  }

  protected Machine newMachine() {
    return new Machine();
  }

  public void next() {
    if (time == db.endOfTime())
      fail();
    else time++;
  }

  public void parCompete() {

    // The choice mode reverts back to CHOICE_SEQ until either all of the currently
    // executing machines fail (in which case the containing par construct has
    // failed) or until one of the currently executing machines succeeds (in which
    // case all the sibling machines are killed and all intervening choice points
    // are cut)...

    choiceMode = CHOICE_SEQ;

  }

  private void parellelEnter(Vector<Clause> clauses) {

    // The machine splits over the clauses creating a new child for each clause.
    // Each child is a copy of the parent but which enters a different clause...

    for (Clause clause : clauses) {
      Machine child = newChild();
      getChildren().add(child);
      child.enter(clause, clause.getArity(), clause.getVars());
    }
    Collections.shuffle(getChildren());
  }

  public void parStart() {

    // Between PARSTART and PARCOMPETE any choice points will split the machine
    // so that the choices are performed in parallel...

    choiceMode = CHOICE_PAR;
    pushParFail(callFrame);

  }

  public void parWin() {

    // The first machine to perform this operation will kill off all its siblings
    // and throw away all choice points back to the corresponding fail frame...

    while (getFailType() != FAIL_TYPE_PAR) {
      popFailFrame();
    }
    Machine parent = getFailParent();
    parent.killSiblings(this);
    popFailFrame();
  }

  public void past(int offset) {
    setLocal(offset, time);
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_PAST);
    pushFailStack(programCounter);
    pushFailStack(time);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public String path() {
    if (parent == null) {
      return "" + id;
    } else return parent.path() + "::" + id;
  }

  public Object peek(int index) {
    return callStack[tos - (index + 1)];
  }

  public Object popCallStack() {
    return callStack[--tos];
  }

  private void popFailFrame() {
    failFrame = getFailPrev();
    tofs = failFrame + FAIL_FRAME_SIZE;
  }

  public void popTry() {
    int p = programCounter;
    returnFrame();
    programCounter = p;
  }

  public String ppCall() {
    Clause clause = getCallClause();
    int arity = clause.getArity();
    int vars = clause.getVars();
    String args = "(";
    for (int i = 0; i < arity; i++) {
      args = args + recons(getLocal(i));
      if (i + 1 < arity) args = args + ",";
    }
    args = args + ")[";
    for (int i = 0; i < vars; i++) {
      args = args + recons(getLocal(arity + i));
      if (i + 1 < vars) args = args + ",";
    }
    return clause.getName() + args + "]";
  }

  public void prev() {
    if (time == 0)
      fail();
    else time--;
  }

  public void printCallFrame(int callFrame) {
    if (callFrame >= 0) {
      System.err.println("FRAME    = " + callFrame);
      System.err.println("PREV    = " + callStack[callFrame + CALL_PREV]);
      System.err.println("CUT     = " + callStack[callFrame + CALL_CUT]);
      System.err.println("CLAUSE  = " + callStack[callFrame + CALL_CLAUSE]);
      System.err.println("CODEPTR = " + callStack[callFrame + CALL_CODEPTR]);
      System.err.println("TRY     = " + callStack[callFrame + CALL_TRY]);
      Clause clause = (Clause) callStack[callFrame + CALL_CLAUSE];
      for (int i = 0; i < clause.getArity(); i++) {
        System.err.println("LOCAL" + i + "  = " + callStack[callFrame + CALL_LOCAL0 + i]);
      }
      for (int i = 0; i < clause.getVars(); i++) {
        System.err.println("LOCAL" + (i + clause.getArity()) + "  = " + callStack[callFrame + CALL_LOCAL0 + i + clause.getArity()]);
      }
    }
  }

  public void pushCallStack(Object value) {
    if (tos + 1 < callStack.length)
      callStack[tos++] = value;
    else {
      growCallStack();
      pushCallStack(value);
    }
  }

  public void pushDBFail(int index, int arity, int callFrame) {
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_DB);
    pushFailStack(arity);
    pushFailStack(index);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public void pushFail(int index, Vector<Clause> clauses, int callFrame) {
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_NORMAL);
    pushFailStack(clauses);
    pushFailStack(index);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  private void pushFailStack(Object value) {
    failStack[tofs++] = value;
  }

  public void pushParFail(int callFrame) {
    int frame = tofs;
    pushFailStack(failFrame);
    pushFailStack(FAIL_TYPE_PAR);
    pushFailStack(this);
    pushFailStack(0);
    pushFailStack(callFrame);
    pushFailStack(getTrailPtr());
    failFrame = frame;
  }

  public void pushTry(int local, int handlerOffset, int endOfTryOffset) {

    // Duplicate the current call frame and set a try frame...

    int p = programCounter;
    Clause clause = getCallClause();
    startCall();
    for (int i = 0; i < clause.getArity(); i++) {
      pushCallStack(getLocal(i));
    }
    for (int i = 0; i < clause.getVars(); i++) {
      pushCallStack(getLocal(i + clause.getArity()));
    }
    callFrame = tos - (clause.getArity() + clause.getVars() + CALL_LOCAL0);
    setCallFrameClause(clause);
    setCodePtr(endOfTryOffset);
    setTime(time);
    setTry(new TryFrame(local, handlerOffset));
    programCounter = p;
  }

  public Object recons(Object value) {
    if (value == null) return value;
    if (value.getClass().isArray()) {
      Object[] values = (Object[]) value;
      Object[] newValues = new Object[values.length];
      for (int i = 0; i < values.length; i++)
        newValues[i] = recons(values[i]);
      return newValues;
    }
    if (value instanceof Cons<?>) {
      Cons<Object> cons = (Cons<Object>) value;
      Object head = recons(cons.getHead());
      Object tail = recons(cons.getTailMaybe());
      if (tail instanceof List<?>) return new Cons<Object>(head, (List<Object>) tail);
      return new Cons<Object>(head, new Maybe<Object>(tail));
    }
    if (value instanceof Maybe<?>) {
      Maybe<Object> m = (Maybe<Object>) value;
      return recons(m.getValue());
    }
    if (value instanceof Term) {
      Term term = (Term) value;
      Term newTerm = new Term(term.getName());
      newTerm.setValues((Object[]) recons(term.getValues()));
      return newTerm;
    }
    if (value instanceof Var) {
      Var var = (Var) value;
      return recons(var.getValue(this));
    }
    if (value instanceof Integer) return value;
    if (value instanceof Long) return value;
    if (value instanceof String) return value;
    if (value instanceof Boolean) return value;
    if (value instanceof list.Nil<?>) return value;
    if (value instanceof Key) return ((Key) value).getString();
    throw new Error("unknown type of value for recons: " + value + " :: " + value.getClass());
  }

  public Object[] recons(Object[] values) {
    Object[] newValues = new Object[values.length];
    for (int i = 0; i < values.length; i++)
      newValues[i] = recons(values[i]);
    return newValues;
  }

  public void resetMachine() {
    Arrays.fill(callStack, null);
    Arrays.fill(failStack, null);
    children.clear();
    parent = null;
    trail.clear();
    tos = 0;
    tofs = 0;
    callFrame = -1;
    failFrame = -1;
    programCounter = 0;
    time = 0;
    indent = 0;
    choiceMode = CHOICE_SEQ;
    traceInstrs = false;
    traceCalls = false;
    failed = false;
  }

  public void resetTime(int time) {
    this.time = time;
  }

  public void resetTrail() {
    trail.clear();
  }

  private void retry(Clause clause) {
    if (clause.isSpied()) {
      spaces(getIndent());
      System.out.println("RETRY " + ppCall());
    }
  }

  public void returnFrame() {

    // Called to return from a call frame. The program counter and time
    // was saved in the current frame when it was created so restore before
    // the current frame is popped...

    programCounter = getCodePtr();
    time = getTime();
    choiceMode = getChoiceMode();
    indent = getIndent();
    callFrame = (int) callStack[callFrame + CALL_PREV];
    if (failFrame != -1) {
      if (getFailCallFrame() < callFrame) {
        Clause clause = getCallClause();
        tos = callFrame + CALL_LOCAL0 + clause.getArity() + clause.getVars();
      }
    }
  }

  public void run() {
    if (getChildren().size() > 0) {
      for (Machine child : getChildren())
        if (child.isValidChild()) child.run();
    } else {
      while (!runTerminated()) {
        run1();
      }
    }
  }

  protected void run1() {
    if (getChildren().size() > 0) {
      for (Machine child : getChildren())
        if (child.isValidChild()) child.run1();
    } else {
      ast.query.instrs.Instr i = getClauseCode().get(programCounter++);
      if (traceInstrs) {
        System.err.println("Machine(" + path() + ")");
        System.err.println("Instruction = " + i);
        printCallFrame(callFrame);
        System.err.println("--------------------------\n");
      }
      i.perform(this);
    }
  }

  protected boolean runTerminated() {
    return terminated() || isFailed() || ESL.isStop();
  }

  private void setCallFrameClause(Clause clause) {
    callStack[callFrame + CALL_CLAUSE] = clause;
  }

  private void setCallFrameClause(int frame, Clause clause) {
    callStack[frame + CALL_CLAUSE] = clause;
  }

  public void setChildren(Vector<Machine> children) {
    this.children = children;
  }

  private void setChoiceMode(int mode) {
    callStack[callFrame + CALL_CHOICE_MODE] = mode;
  }

  public void setClauseTable(ClauseTable clauseTable) {
    this.clauseTable = clauseTable;
  }

  private void setCodePtr(int i) {
    callStack[callFrame + CALL_CODEPTR] = i;
  }

  public void setDB(DB db) {
    this.db = db;
  }

  private void setEventuallyTime(int time) {
    failStack[failFrame + FAIL_EVENTUALLY_TIME] = time;
  }

  private void setFailClausePtr(int i) {
    failStack[failFrame + FAIL_CLAUSEPTR] = i;
  }

  public void setFailed(boolean failed) {
    this.failed = failed;
  }

  private void setIndent(int i) {
    callStack[callFrame + CALL_INDENT] = i;
  }

  public void setLocal(int n, Object value) {
    callStack[callFrame + CALL_LOCAL0 + n] = value;
  }

  private void setParent(Machine parent) {
    this.parent = parent;
  }

  private void setTime(int i) {
    callStack[callFrame + CALL_TIME] = i;
  }

  public void setTraceCalls(boolean traceCalls) {
    this.traceCalls = traceCalls;
  }

  public void setTraceInstrs(boolean traceInstrs) {
    this.traceInstrs = traceInstrs;
  }

  public void setTry(TryFrame frame) {
    callStack[callFrame + CALL_TRY] = frame;
  }

  public void setValue(Var var, Object value) {
    var.setValue(this, value);
    trail.push(var);
  }

  public void spaces(int indent) {
    for (int i = 0; i < indent; i++)
      System.out.print(' ');
  }

  private void spy(Clause clause) {
    if (clause != null) {
      if (clause.isSpied()) {
        spaces(indent);
        System.out.println("ENTER " + ppCall());
        indent = indent + 2;
      }
    }
  }

  public int startCall() {

    // Called prior to pushing the arguments for a call. The machine should then
    // perform an appropriate ENTER instruction...

    int newFrame = tos;
    pushCallStack(callFrame);
    pushCallStack(failFrame);
    pushCallStack(null);
    pushCallStack(0);
    pushCallStack(null);
    pushCallStack(0);
    pushCallStack(0);
    pushCallStack(choiceMode);
    return newFrame;
  }

  public boolean terminated() {

    // A machine is terminated when it has run out of code to execute...

    if (children.size() == 0)
      return callFrame == -1;
    else {
      for (Machine child : children) {
        if (child.isValidChild() && !child.terminated()) return false;
      }
      return true;
    }
  }

  public void throwValue(Object value) {
    while (callFrame != -1 && getTry() == null) {
      returnFrame();
    }
    if (callFrame == -1)
      throw new Error("cannot find try frame for value " + value);
    else {
      int local = getTry().getLocal();
      int offset = getTry().getOffset();
      returnFrame();
      programCounter = offset;
      setLocal(local, value);
    }
  }

  public String toString() {
    return "Machine(" + path() + ", failed=" + failed + ", terminated=" + terminated() + ", PC=" + programCounter + ", instr=" + (programCounter < getClauseCode().size() ? getClauseCode().get(programCounter) : "???") + ", " + children + ")";
  }

  public void trace(Clause clause) {
    System.err.print(clause.getName());
    String args = "(";
    for (int i = 0; i < clause.getArity(); i++) {
      args = args + recons(getLocal(i));
      if (i + 1 < clause.getArity()) args = args + ",";
    }
    System.err.println(args + ")");
  }

  public boolean unify(Object v1, Object v2) {

    v1 = deref(v1);
    v2 = deref(v2);

    // System.out.println("UNIFY " + recons(v1) + " " + recons(v2));

    if (v1 == v2) return true;
    if (v1 == null || v2 == null) return false;
    if (v1.equals(v2)) return true;
    if (v1 instanceof Var) {
      Var var = (Var) v1;
      trail.push(var);
      var.setValue(this, v2);
      return true;
    }
    if (v2 instanceof Var) {
      Var var = (Var) v2;
      trail.push(var);
      var.setValue(this, v1);
      return true;
    }
    if (v1 instanceof Wild) return true;
    if (v2 instanceof Wild) return true;
    if (v1 instanceof Term && v2 instanceof Term) return unifyTerms((Term) v1, (Term) v2);
    if (v1 instanceof Cons<?> && v2 instanceof Cons<?>) return unifyPairs((Cons<Object>) v1, (Cons<Object>) v2);

    return false;
  }

  public boolean unify(Object[] vs1, Object[] vs2) {
    if (vs1.length == vs2.length) {
      boolean unified = true;
      for (int i = 0; i < vs1.length && unified; i++) {
        unified = unify(vs1[i], vs2[i]);
      }
      return unified;
    } else return false;
  }

  private boolean unifyPairs(Cons<Object> v1, Cons<Object> v2) {
    return unify(v1.getHead(), v2.getHead()) && unify(v1.getTailMaybe(), v2.getTailMaybe());
  }

  private boolean unifyTerms(Term t1, Term t2) {
    if (t1.getName() == t2.getName() && t1.getArity() == t2.getArity()) {
      boolean unified = true;
      for (int i = 0; i < t1.getArity() && unified; i++)
        unified = unify(t1.getValues()[i], t2.getValues()[i]);
      return unified;
    } else return false;
  }

}
