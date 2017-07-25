package test;

import static runtime.listeners.Listeners.setBehaviourListener;
import static runtime.listeners.Listeners.setInstrListener;
import static runtime.listeners.Listeners.setMessageListener;
import static runtime.listeners.Listeners.setNewActorListener;
import static runtime.listeners.Listeners.setScheduleListener;
import static runtime.listeners.Listeners.setStopListener;
import static runtime.listeners.Listeners.setTimeListener;
import static runtime.listeners.Listeners.setUpdateListener;

import java.io.File;
import java.io.FileNotFoundException;

import ast.AST;
import ast.actors.New;
import ast.data.Ref;
import ast.modules.Module;
import ast.query.rules.Query;
import compiler.DynamicVar;
import compiler.FrameVar;
import edb.tool.EDB;
import history.History;
import history.Snapshot;
import instrs.apply.Return;
import list.Nil;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.actors.Builtins;
import runtime.actors.JavaActor;
import runtime.clients.ESLClient;
import runtime.data.Key;
import runtime.data.Term;
import runtime.functions.Builtin;
import runtime.functions.CodeBox;
import runtime.messages.Message;
import values.JavaObject;
import xpl.Interpreter;

public class Test implements JavaActor, ESLClient {

  static final Key SAVE_HISTORY = Key.getKey("saveHistory");
  static final Key SAVE_STATE   = Key.getKey("saveState");
  static Builtin   saveState    = new Builtin("saveState", Test::saveState);
  static Builtin   saveHistory  = new Builtin("saveHistory", Test::saveHistory);
  static History   history      = new History();

  public static void main(String[] args) {

    EDB.setHistoryFiles(args[0]);

    // run("fact");
    run("big");
    // run("customer");
    // run("bag");
    // run("collisions");
    // run("philosophers");

    // runConfig("dev/params", "c1");
    // runConfig("dev/params", "c2");

    // for (int i = 0; i < 14; i++) {
    // for (int j = 0; j < 4; j++) {
    // run("dev/parashop", 4 + (2 * i), (j == 0) ? "a" : (j == 1) ? "b" : (j == 2) ? "c" : "d");
    // }
    // }
    // testQuery("esl/query/happy.q");
  }

  public static void run(String name, Object... args) {
    runConfig(name, "", args);
  }

  public static void runConfig(String name, String configName, Object... args) {
    try {
      Test test = new Test();
      history = new History();
      ESL.resetESL();
      ESL.setEDB(test);
      setNewActorListener(test);
      setStopListener(test);
      setTimeListener(test);
      setMessageListener(test);
      setInstrListener(test);
      setScheduleListener(test);
      setBehaviourListener(test);
      setUpdateListener(test);
      Module module = Module.importModule("esl/" + name + ".esl");
      module.configure(configName);
      module.resolve();
      AST record = new New(0, 0, "", new Ref(0, 0, module.desugar(), Key.getKey("main")), objectsToAST(args));
      CodeBox codebox = new CodeBox(name, record.maxLocals());
      record.compile(new Nil<FrameVar>(), Builtins.builtinDynamics(), codebox, true);
      codebox.add(new Return(-1), new Nil<FrameVar>(), new Nil<DynamicVar>());
      // codebox.write("asm/" + name + ".asm");
      // Actor.debug = true;
      Actor actor = new Actor();
      long time0 = System.currentTimeMillis();
      actor.initSystem(codebox);
      actor.kill();
      // Running the initial file should produce the root system actor...
      actor.run(Integer.MAX_VALUE);
      ESL.runESL(0);
      long time = System.currentTimeMillis() - time0;
      System.out.format("[ Completed %d instructions over %d actors in %d ms (%d,%d) ]", ESL.totalInstructions(), ESL.getALL_ACTORS(), time, ESL.getMAX_INSTRS(), ESL.getINSTRS_PER_TIME_UNIT());
    } catch (FileNotFoundException fnf) {
      fnf.printStackTrace();
    }
  }

  private static AST[] objectsToAST(Object[] args) {
    AST[] ast = new AST[args.length];
    for (int i = 0; i < ast.length; i++) {
      ast[i] = objectToAST(args[i]);
    }
    return ast;
  }

  private static AST objectToAST(Object object) {
    if (object instanceof Integer) return new ast.data.Int((int) object);
    if (object instanceof String) return new ast.data.Str((String) object);
    if (object instanceof Boolean) return new ast.data.Bool((boolean) object);
    throw new Error("cannot translate to AST: " + object);
  }

  public static void testQuery(String path) {
    JavaObject o = (JavaObject) Interpreter.readFile("xpl/query.xpl", "query", path, "file", new exp.Str(path));
    History history = History.inflate("histories/shop2.hst");
    Query query = (Query) o.getTarget();
    System.out.println(query.satisfy(history));
  }

  public boolean hasExport(Key name) {
    return name == SAVE_HISTORY || name == SAVE_STATE;
  }

  public Object ref(Key name) {
    if (name == SAVE_HISTORY)
      return saveHistory;
    else if (name == SAVE_STATE)
      return saveState;
    else return null;
  }

  public Key[] getExports() {
    return new Key[] {};
  }

  public void send(Object message, int time) {

  }

  public static void saveHistory(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Object label = actor.getFrameVar(0);
      history.setStartOfTime(0);
      history.setEndOfTime(ESL.getTime());
      File dir = new File(EDB.getHistoryFiles() + "/" + actor.getPathName());
      if (!dir.exists()) if (!dir.mkdirs()) throw new Error("cannot create " + dir);
      history.serialize(dir.getAbsolutePath() + "/" + label + ".hst");
      for (Snapshot snapshot : history.getSnapshots())
        snapshot.save(dir.getAbsolutePath(), history);
      actor.returnValue(label);
    } else throw new Error("saveHistory expects " + 1 + " arg but supplied with " + arity);
  }

  public static void saveState(Actor actor, int arity) {
  }

  public void send(Actor actor, String message, int arity) {
  }

  public void newActor(Actor actor) {
    history.newActor(actor, ESL.getTime());
  }

  public void newActor(JavaActor actor) {
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub

  }

  public void timeChanged(int time) {

  }

  public void send(Actor source, Actor target, Message message) {
    history.send(source, target, message, ESL.getTime());
  }

  @Override
  public void send(JavaActor source, Actor target, Message message) {
    // TODO Auto-generated method stub

  }

  public void consume(Actor actor, Message message) {
    history.consume(actor, message);
  }

  public void send(int time, int source, int target, String name, Object[] values) {
    Term term = new Term(Key.getKey(name));
    term.setValues(values);
    Message message = new Message(term, time);
    history.send(source, target, message, time);
  }

  public void send(int time, Actor source, Actor target, String name, int arity) {
    Term term = new Term(Key.getKey(name));
    Object[] values = new Object[arity];
    for (int i = 0; i < arity; i++) {
      values[i] = source.peek(arity - i);
    }
    term.setValues(values);
    Message message = new Message(term, time);
    history.send(source, target, message, time);
  }

  @Override
  public void perform(Actor actor) {
    // TODO Auto-generated method stub

  }

  @Override
  public void schedule(Actor actor) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deschedule(Actor actor) {
    // TODO Auto-generated method stub

  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour) {
    history.behaviourChanged(actor, oldBehaviour, newBehaviour, ESL.getTime());
  }

  @Override
  public void update(Actor actor, String name, Object value, int time) {
    history.state(actor, name, value, time);
  }

}
