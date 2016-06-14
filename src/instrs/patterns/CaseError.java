package instrs.patterns;

import actors.Actor;
import ast.tests.Case;
import instrs.Instr;

public class CaseError extends Instr {

  Case caseExp;

  public CaseError(int line, Case caseExp) {
    super(line);
    this.caseExp = caseExp;
  }

  public void perform(Actor actor) {
    System.out.println("Error: ran out of case arms in " + caseExp);
    System.out.println("pattern values: ");
    for (int i = 0; i < caseExp.exps.length; i++)
      System.out.println("[" + i + "] " + actor.getPatternValues()[i]);
    throw new Error("case error");
  }

  public String toString() {
    return pprint("CASEERROR");
  }

}
