package instrs.query;

import java.io.PrintStream;

import ast.query.rules.Clause;
import instrs.Instr;
import runtime.actors.Actor;

public class QShow extends Instr {

  Clause clause;
  int    altAddress;
  int    timeoutAddress;

  {
    code = SHOW;
  }

  public QShow(int line, Clause clause, int timeoutAddress, int altAddress) {
    super(line);
    this.clause = clause;
    this.timeoutAddress = timeoutAddress;
    this.altAddress = altAddress;
  }

  public void perform(Actor actor) {
    throw new Error("This instruction can only be performed in-line.");
  }

  public int getAltAddress() {
    return altAddress;
  }

  public void setAltAddress(int altAddress) {
    this.altAddress = altAddress;
  }

  public int getTimeoutAddress() {
    return timeoutAddress;
  }

  public void setTimeoutAddress(int timeoutAddress) {
    this.timeoutAddress = timeoutAddress;
  }

  public Clause getClause() {
    return clause;
  }

  public void pprint(int address, PrintStream out) {
    out.printf("%5d %s%n", address, this);
    for (int i = 0; i < clause.getCode().size(); i++) {
      ast.query.instrs.Instr qi = clause.getCode().get(i);
      out.printf("%10d %s%n", i, qi);
    }
  }

  public String toString() {
    return "Show(" + timeoutAddress + "," + altAddress + "," + clause + ")";
  }

}
