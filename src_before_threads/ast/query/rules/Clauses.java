package ast.query.rules;

import java.util.Hashtable;
import java.util.Vector;

public class Clauses extends Hashtable<Integer, Vector<Clause>> {

  public Vector<Clause> getClauses(int arity) {
    if (containsKey(arity))
      return get(arity);
    else {
      Vector<Clause> clauses = new Vector<Clause>();
      put(arity, clauses);
      return clauses;
    }
  }

}
