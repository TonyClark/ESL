package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import compiler.DynamicVar;
import compiler.FrameVar;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.NewDynamic;
import list.List;
import list.Nil;

@BoaConstructor(fields = { "name", "args", "arms" })

public class Act extends AST {

  public String   name;
  public String[] args;
  public BArm[]   arms;

  public Act() {
  }

  public String toString() {
    return "Act(" + name + "," + Arrays.toString(args) + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code) {

    // Compilation of a behaviour produces a closure-like value that captures the current
    // dynamics and waits to be transformed into an actor via 'new'. When invoked, the behaviour
    // will expect the state-args to be the first locals in the stack frame (equivalent to function args).
    // These will have to be moved to become dynamics if necessary on entry to the pattern matching...

    Vector<Instr> bodyCode = new Vector<Instr>();
    locals = new Nil<FrameVar>();
    for (String arg : args) {
      locals = locals.cons(new FrameVar(arg, locals.length()));
    }
    HashSet<String> dv = new HashSet<String>();
    for (BArm a : arms)
      a.DV(dv);
    for (String a : args)
      if (dv.contains(a)) {
        lookup(a, locals).compile(bodyCode);
        dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(a, 0));
        bodyCode.add(new NewDynamic());
      }
    // Message will be on the stack...
    for (BArm a : arms) {
      // code.add(new Dup());
      a.compile(locals, dynamics, bodyCode);
    }
    code.add(new instrs.Behaviour(args.length, new CodeBox(maxLocals(), bodyCode)));

  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    for (BArm b : arms)
      b.FV(free);
    for (String arg : args)
      free.remove(arg);
    vars.addAll(free);
  }

  public int maxLocals() {
    return 0;
  }

  public void DV(HashSet<String> vars) {
    // Which free vars will need to be dynamic?
    FV(vars);
  }

}
