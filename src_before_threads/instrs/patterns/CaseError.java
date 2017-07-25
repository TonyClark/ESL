package instrs.patterns;

import ast.tests.Case;
import instrs.Instr;
import runtime.actors.Actor;

public class CaseError extends Instr {

	Case	caseExp;
	int		varIndex;

	public CaseError(int line, Case caseExp, int varIndex) {
		super(line);
		this.caseExp = caseExp;
		this.varIndex = varIndex;
	}

	public void perform(Actor actor) {
		System.out.println("Error: ran out of case arms in " + caseExp);
		System.out.println("pattern values: ");
		for (int i = 0; i < caseExp.exps.length; i++)
			System.out.println("[" + i + "] " + actor.getFrameVar(i + varIndex));
		throw new Error("case error");
	}

	public String toString() {
		return pprint("CASEERROR");
	}

}
