package test;

import java.io.FileNotFoundException;

import actors.Actor;
import actors.CodeBox;
import actors.Key;
import ast.AST;
import ast.actors.New;
import ast.data.Apply;
import ast.data.Ref;
import ast.modules.Module;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.apply.Return;
import list.Nil;

public class Test {

  public static void main(String[] args) {

    // run("balbir");
    // run("patterns");
    // run("monitor");
    // run("cmp_test");
    // run("init_test");
    // run("jobs");
    // run("module1");
    // run("painters");
    // run("shared_var");
    // run("simple_tests");
    // run("stochastic_test");
    // run("time");
    // run("message_at");
    // run("feedback");
    // run("TRDDC");
    run("big");
    // run("splash");
    // run("dot");
    // run("customer");
    // run("overload");
    // run("try");
    // run("bag");
    // run("newcase");
    // run("become");
    // run("tail_call");
    // run("collisions");
    // run("philosophers");
  }

  public static void run(String name) {
    try {
      Actor.resetESL();
      Module module = Module.importModule("esl/" + name + ".esl");
      module.resolve();
      AST record = new New(new Apply(new Ref(module.desugar(), Key.getKey("main"))));
      CodeBox codebox = new CodeBox(name, record.maxLocals());
      record.compile(new Nil<FrameVar>(), Actor.builtinDynamics(), codebox, true);
      codebox.add(new Return(-1), new Nil<FrameVar>(), new Nil<DynamicVar>());
      codebox.write("asm/" + name + ".asm");
      // Actor.debug = true;
      Actor actor = new Actor();
      long time0 = System.currentTimeMillis();
      actor.initSystem(codebox);
      actor.kill();
      // Running the initial file should produce the root system actor...
      actor.run(Integer.MAX_VALUE);
      Actor.runESL(0);
      long time = System.currentTimeMillis() - time0;
      System.out.format("[ Completed %d instructions over %d actors in %d ms (%d,%d) ]", Actor.totalInstructions(), Actor.ALL_ACTORS, time, Actor.MAX_INSTRS, Actor.INSTRS_PER_TIME_UNIT);
    } catch (FileNotFoundException fnf) {
      fnf.printStackTrace();
    }
  }

}
