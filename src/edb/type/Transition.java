package edb.type;

import java.util.Vector;

import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class Transition {

  private static final Key EDGE = Key.getKey("Edge");

  private static final Key HTML = Key.getKey("HTML");
  State                    source;

  String                   message;
  String                   condition;
  String                   action;
  State                    target;

  public Transition(State source, String message, String condition, String action, State target) {
    super();
    this.source = source;
    this.message = message;
    this.condition = condition;
    this.action = action;
    this.target = target;
  }

  public Term asTerm(Vector<State> states) {
    List<Term> props = new Nil<Term>();
    int sourceId = states.indexOf(source);
    int targetId = states.indexOf(target);
    return new Term(EDGE, props, sourceId, targetId, new Term(HTML, message + "[" + condition + "]/" + action));
  }

}
