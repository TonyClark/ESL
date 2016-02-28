package test;

import java.util.Vector;

import actors.Actor;
import actors.Behaviour;
import actors.CodeBox;
import ast.AST;
import ast.actors.New;
import ast.data.Apply;
import ast.data.Ref;
import ast.modules.Module;
import compiler.FrameVar;
import instrs.Instr;
import instrs.Return;
import list.Nil;

public class Test {

  public static void main(String[] args) {

    // run("balbir");
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
    // run("big");
    // run("splash");
    // run("dot");
    // run("customer");
    // run("overload");
    // run("try");
    run("bag");
  }

  public static void run(String name) {
    Actor.resetESL();
    Module module = Module.importModule("esl/" + name);
    module.resolve();
    AST record = new New(new Apply(new Ref(module.desugar(), "main")));
    Vector<Instr> code = new Vector<Instr>();
    record.compile(new Nil<FrameVar>(), Actor.builtinDynamics(), code);
    code.add(new Return());
    CodeBox codebox = new CodeBox(record.maxLocals(), code);
    // Actor.debug = true;
    // System.out.println(codebox);
    Actor actor = new Actor();
    long time0 = System.currentTimeMillis();
    actor.initSystem(codebox);
    actor.kill();
    // Running the initial file should produce the root system actor...
    actor.run(Integer.MAX_VALUE);
    Actor.runESL(0);
    long time = System.currentTimeMillis() - time0;
    System.out.format("[ Completed %d instructions in %d ms ]", Actor.totalInstructions(), time);
  }

}
