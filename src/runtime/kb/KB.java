package runtime.kb;

import java.util.Hashtable;
import java.util.Vector;

import ast.query.machine.DB;
import ast.query.machine.Machine;
import list.Nil;
import runtime.actors.Actor;
import runtime.data.Grabbable;
import runtime.data.Key;
import runtime.data.Term;
import runtime.network.Network;

public class KB extends Grabbable implements DB {

  Vector<Fact>              facts    = new Vector<Fact>();
  Hashtable<Key, FactCache> cache    = new Hashtable<Key, FactCache>();

  public KB(Vector<Fact> facts) {
    super();
    this.facts = facts;
  }

  public KB(Vector<Term> terms, int time) {
    for (Term term : terms) {
      facts.add(new Fact(term, time));
    }
  }

  public Vector<Fact> getFacts() {
    return facts;
  }

  public synchronized void add(Actor actor, Term term, int time) {
    if (!hasFact(term, time)) {
      facts.add(new Fact(term, time));
      Network.getNetwork().add(term);
    }
  }

  public synchronized void addListener(Network network) {
  }

  public synchronized list.List<Object> asList() {
    list.List<Object> list = new Nil<Object>();
    for (Fact fact : facts) {
      list = list.cons(fact.getTerm());
    }
    return list;
  }

  private void cache(Key name) {
    if (!cache.containsKey(name)) {
      FactCache cached = new FactCache();
      cache.put(name, cached);
      for (Fact fact : facts) {
        if (fact.getTerm().getName() == name) cached.cache(fact);
      }
    }
  }

  public synchronized void delete(Actor actor, Term term, int time) {
    if (hasFact(term, time)) {
      facts.remove(getFact(term, time));
      Network.getNetwork().remove(term);
    }
  }

  public int endOfTime() {
    int end = 0;
    for (Fact fact : facts)
      end = Math.max(end, fact.getTime());
    return end;
  }

  public Term getFact(Key name, int arity, int time, int index, Machine machine) {
    cache(name);
    if (cache.get(name).containsKey(time)) {
      for (Term term : cache.get(name).get(time)) {
        if (term.getArity() == arity) {
          if (index == 0)
            return term;
          else index--;
        }
      }
    }
    return null;
  }

  private Fact getFact(Term term, int time) {
    for (Fact fact : facts)
      if (fact.getTerm().equals(term) && fact.getTime() == time) return fact;
    return null;
  }

  public Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine) {
    return getFact(name, arity, time, index, machine).getValues()[argNumber];
  }

  public boolean hasFact(Key name, int arity, int time, int index, Machine machine) {
    return getFact(name, arity, time, index, machine) != null;
  }

  private boolean hasFact(Term term, int time) {
    return getFact(term, time) != null;
  }

  public boolean isEnd(int time) {
    return time == endOfTime();
  }

  public String toString() {
    return "kb(" + facts.size() + ")";
  }

}
