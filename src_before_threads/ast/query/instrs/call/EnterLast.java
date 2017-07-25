package ast.query.instrs.call;

import java.util.Vector;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import ast.query.rules.Clause;
import runtime.data.Key;

public class EnterLast extends Instr {

  Key name;
  int arity;

  public EnterLast(Key name, int arity) {
    this.name = name;
    this.arity = arity;
  }

  public void tailCall(Machine machine) {
    Vector<Clause> clauses = machine.getClauses(name, arity);
    if (clauses.size() == 1) {
      machine.enterLast(clauses.get(0));
    } else {
      int newFrame = machine.enterLast(clauses.get(0));
      machine.pushFail(1, clauses, newFrame);
    }
  }

  public void perform(Machine machine) {
    int currentCall = machine.getCallFrame();
    int currentFail = machine.getFailFrame();
    if (currentFail > -1) {
      int failCall = machine.getFailCallFrame();
      if (currentCall <= failCall) {
        machine.enter(name, arity);
      } else tailCall(machine);
    } else tailCall(machine);
  }

  public String toString() {
    return "EnterLast(" + name + "," + arity + ")";
  }

}
