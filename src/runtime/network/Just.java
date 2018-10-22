package runtime.network;

import runtime.data.Term;

public class Just extends Tree {

  Term term;

  public Just(Term term) {
    super();
    this.term = term;
  }

  public String toString() {
    return "Just(" + term + ")";
  }

  public boolean equals(Object other) {
    if (other instanceof Just) {
      Just just = (Just) other;
      return term.equals(just.term);
    } else return super.equals(other);
  }

  public Term getTerm() {
    return term;
  }

}
