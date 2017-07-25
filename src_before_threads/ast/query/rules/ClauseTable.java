package ast.query.rules;

import java.util.Hashtable;

import runtime.data.Key;

public class ClauseTable extends Hashtable<Key, Clauses> {

  public Clauses getClauses(Key name) {
    if (containsKey(name)) {
      return get(name);
    } else {
      Clauses clauses = new Clauses();
      put(name, clauses);
      return clauses;
    }
  }

}
