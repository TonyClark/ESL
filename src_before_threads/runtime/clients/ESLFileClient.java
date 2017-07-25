package runtime.clients;

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
import instrs.apply.Return;
import list.Nil;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.actors.Builtins;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.functions.Builtin;
import runtime.functions.CodeBox;
import runtime.messages.Message;
import values.JavaObject;
import xpl.Interpreter;

public class ESLFileClient implements ESLClient, JavaActor {

  static final Key SAVE_HISTORY = Key.getKey("saveHistory");
  static final Key SAVE_STATE   = Key.getKey("saveState");
  static Builtin   saveState    = new Builtin("saveState", ESLFileClient::saveState);
  static Builtin   saveHistory  = new Builtin("saveHistory", ESLFileClient::saveHistory);

  public ESLFileClient() {
  }

  public ESLFileClient(String[] args) {
    EDB.setHistoryFiles(args[0]);
    for (int i = 1; i < args.length; i++) {
      run(args[i]);
    }
  }

  public void run(String name) {
    try {
      ESL.resetESL();
      ESL.setEDB(this);
      Module module = Module.importModule("esl/" + name + ".esl");
      module.resolve();
      AST record = new New(0, 0, "", new Ref(0, 0, module.desugar(), Key.getKey("main")));
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
  }

  public static void saveState(Actor actor, int arity) {
  }

  public void send(Actor actor, String message, int arity) {
  }

  public void newActor(Actor actor) {

  }

  public void newActor(JavaActor actor) {

  }

  public void stop() {

  }

  public void timeChanged(int time) {

  }

  public void send(Actor source, Actor target, Message message) {

  }

  public void send(JavaActor source, Actor target, Message message) {

  }

  public void consume(Actor actor, Message message) {

  }

  public void send(int time, int source, int target, String name, Object[] values) {

  }

  public void send(int time, Actor actor, Actor target, String name, int arity) {

  }

  public void perform(Actor actor) {

  }

  public void schedule(Actor actor) {

  }

  public void deschedule(Actor actor) {

  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour) {

  }

  public void update(Actor actor, String name, Object value, int time) {

  }

}
