package runtime.kb;

import java.util.Hashtable;
import java.util.Vector;

import runtime.data.Term;

public class FactCache extends Hashtable<Integer, Vector<Term>> {

  public void cache(Fact fact) {
    Vector<Term> terms = null;
    if (!containsKey(fact.getTime())) {
      terms = new Vector<Term>();
      put(fact.getTime(), terms);
    } else terms = get(fact.getTime());
    terms.add(fact.getTerm());
  }
  
}
