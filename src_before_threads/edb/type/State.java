package edb.type;

import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class State {
  
  private static final Key NODE = Key.getKey("Node");
  private static final Key HTML = Key.getKey("HTML");

  String                   name;
  int                      arity;

  public State(String name, int arity) {
    super();
    this.name = name;
    this.arity = arity;
  }

  public String getName() {
    return name;
  }

  public int getArity() {
    return arity;
  }

  public Term asTerm(int id) {
    List<Term> props = new Nil<Term>();
    return new Term(NODE, props, id, new Term(HTML, name));
  }

}
