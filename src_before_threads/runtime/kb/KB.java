package runtime.kb;

import java.util.Vector;

import ast.query.machine.DB;
import ast.query.machine.Machine;
import runtime.actors.Actor;
import runtime.data.Grabbable;
import runtime.data.Key;
import runtime.data.Term;

public class KB extends Grabbable implements DB {

  Vector<Fact> facts = new Vector<Fact>();

  public KB(Vector<Term> terms, int time) {
    for (Term term : terms) {
      facts.add(new Fact(term, time));
    }
  }

  public KB(Vector<Fact> facts) {
    super();
    this.facts = facts;
  }

  public String toString() {
    String s = "kb{";
    for (Fact o : facts) {
      s = s + o;
      if (facts.lastElement() != o) s = s + ",";
    }
    return s + "}";
  }

  public void add(Actor actor, Term o, int time) {
    if (!facts.contains(o)) facts.add(new Fact(o, time));
  }

  public void delete(Actor actor, Term o, int time) {
    facts.remove(o);
  }

  public Term getFact(Key name, int arity, int time, int index, Machine machine) {
    for (Fact fact : facts) {
      if (fact.getTerm().getName() == name && fact.getTerm().getArity() == arity && fact.getTime() == time) {
        if (index == 0)
          return fact.getTerm();
        else index--;
      }
    }
    return null;
  }

  public boolean hasFact(Key name, int arity, int time, int index, Machine machine) {
    return getFact(name, arity, time, index, machine) != null;
  }

  public Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine) {
    return getFact(name, arity, time, index, machine).getValues()[argNumber];
  }

  public boolean isEnd(int time) {
    return time == endOfTime();
  }

  public int endOfTime() {
    int end = 0;
    for (Fact fact : facts)
      end = Math.max(end, fact.getTime());
    return end;
  }

}
