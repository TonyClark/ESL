package runtime.kb;

import runtime.data.Term;

public class Fact {

  Term term;
  int  time;

  public Fact(Term term, int time) {
    super();
    this.term = term;
    this.time = time;
  }

  public Term getTerm() {
    return term;
  }

  public int getTime() {
    return time;
  }

  public String toString() {
    return "Fact(" + term + "," + time + ")";
  }

}
