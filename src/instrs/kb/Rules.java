package instrs.kb;

import java.io.PrintStream;

import ast.query.rules.Clause;
import ast.query.rules.ClauseTable;
import ast.query.rules.Clauses;
import instrs.Instr;
import runtime.actors.Actor;
import runtime.data.Key;

public class Rules extends Instr {

  ClauseTable clauseTable;

  public Rules(int line, ClauseTable clauseTable) {
    super(line);
    this.clauseTable = clauseTable;
  }

  public void perform(Actor actor) {
    actor.pushStack(clauseTable);
  }

  public void pprint(int address, PrintStream out) {
    out.printf("%5d %s%n", address, this);
    for (Key key : clauseTable.keySet()) {
      Clauses clauses = clauseTable.get(key);
      for (int arity : clauses.keySet()) {
        for (Clause clause : clauses.get(arity)) {
          out.printf("%7s/%d%n", key.getString(), arity);
          for (int i = 0; i < clause.getCode().size(); i++) {
            ast.query.instrs.Instr qi = clause.getCode().get(i);
            out.printf("%10d %s%n", i, qi);
          }
        }
      }
    }
  }

  public String toString() {
    return "Rules()";
  }

}
