package test;

import java.util.Vector;

import actors.Actor;
import actors.Behaviour;
import actors.CodeBox;
import actors.Dynamic;
import ast.Apply;
import ast.Binding;
import ast.Letrec;
import ast.Var;
import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import instrs.Return;
import list.Nil;
import values.List;
import xpl.Interpreter;

public class Test {

  public static void main(String[] args) {

    // Read in a file of mutually recursive bindings. Compile them into a single
    // code box. Create an instance of the behaviour called 'main' and supply the
    // Java command line arguments.

    List list = (List) Interpreter.readFile("esl/esl.xpl", "esl", "esl/test.esl");
    Binding[] bindings = new Binding[list.values.length];
    for (int i = 0; i < list.values.length; i++)
      bindings[i] = (Binding) list.values[i].getTarget();
    Letrec program = new Letrec(bindings, new Apply(new Var("main")));
    Vector<Instr> code = new Vector<Instr>();
    program.compile(new Nil<FrameVar>(), new Nil<DynamicVar>(), code);
    code.add(new Return());
    CodeBox codebox = new CodeBox(program.maxLocals(), code);
    Actor actor = new Actor(new Object[] {}, new Behaviour(0, new Nil<Dynamic>(), codebox));
    actor.initSystem();
    actor.run();
    System.out.println(actor.popStack());
  }

}
