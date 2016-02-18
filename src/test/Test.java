package test;

import java.util.Vector;

import actors.Actor;
import actors.Behaviour;
import actors.CodeBox;
import ast.AST;
import compiler.FrameVar;
import instrs.Instr;
import instrs.Return;
import list.Nil;
import values.JavaObject;
import xpl.Interpreter;

public class Test {

  public static void main(String[] args) {

    // Read in a file of mutually recursive bindings. Compile them into a single
    // code box. Create an instance of the behaviour called 'main' and supply the
    // Java command line arguments.

    JavaObject o = (JavaObject) Interpreter.readFile("esl/esl.xpl", "esl", "esl/time.esl");
    AST ast = (AST) o.getTarget();
    Vector<Instr> code = new Vector<Instr>();
    ast.compile(new Nil<FrameVar>(), Actor.builtinDynamics(), code);
    code.add(new Return());
    CodeBox codebox = new CodeBox(ast.maxLocals(), code);
    Actor actor = new Actor(new Behaviour("", Actor.builtinEnv(), 0, codebox));
    actor.initSystem();
    actor.kill();
    // Running the initial file should produce the root system actor...
    Actor root = (Actor) actor.run(Integer.MAX_VALUE);
    Actor.runESL(0);
    System.out.println("done.");
  }

}
