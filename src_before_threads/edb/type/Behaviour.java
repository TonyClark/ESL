package edb.type;

import java.util.Arrays;
import java.util.Vector;

import ast.query.body.BodyElement;
import ast.query.value.Value;
import ast.spec.Action;
import ast.spec.BRule;
import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class Behaviour {

  private static final Key GRAPH       = Key.getKey("Graph");
  static int               counter     = 0;

  State                    start;
  Vector<State>            states      = new Vector<State>();
  Vector<Transition>       transitions = new Vector<Transition>();

  public State getStart() {
    return start;
  }

  public Vector<State> getStates() {
    return states;
  }

  public Vector<Transition> getTransitions() {
    return transitions;
  }

  public void addRule(BRule rule) {
    State source = ensureState(rule.getSourceName(), rule.getSourceArity());
    State target = ensureState(rule.getTargetName(), rule.getTargetArity());
    String message = rule.getMessageName();
    Value[] messageArgs = rule.getMessageArgs();
    BodyElement[] condition = rule.getCondition();
    Action[] actions = rule.getActions();
    transitions.add(new Transition(source, message, Arrays.toString(condition), Arrays.toString(actions), target));
  }

  private State ensureState(String name, int arity) {
    State state = getState(name, arity);
    if (state == null) {
      state = new State(name, arity);
      states.add(state);
    }
    return state;
  }

  public State getState(String name, int arity) {
    for (State s : states)
      if (s.getName().equals(name) && s.getArity() == arity) return s;
    return null;
  }

  public List<Term> getNodes() {
    List<Term> nodes = new Nil<Term>();
    for (State state : states) {
      nodes = nodes.cons(state.asTerm(states.indexOf(state)));
    }
    return nodes;
  }

  public List<Term> getEdges() {
    List<Term> edges = new Nil<Term>();
    for (Transition t : transitions) {
      edges = edges.cons(t.asTerm(states));
    }
    return edges;
  }

  public boolean isEmpty() {
    return states.isEmpty();
  }

  public Term asNode() {
    List<Object> props = new Nil<Object>();
    return new Term(GRAPH, props, counter++, getNodes(), getEdges());
  }

}
