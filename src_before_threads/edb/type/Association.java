package edb.type;

import runtime.data.Key;
import runtime.data.Term;

public class Association {

  private static final Key LINK = Key.getKey("Link");

  String                   source;
  String                   target;
  String                   name;

  public Association(String source, String target, String name) {
    super();
    this.source = source;
    this.target = target;
    this.name = name;
  }

  public Term asTerm() {
    return new Term(LINK, source, target, name);
  }

}
