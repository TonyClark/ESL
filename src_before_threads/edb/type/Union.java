package edb.type;

import ast.types.Term;
import list.List;
import list.Nil;
import runtime.data.Key;

public class Union {

  private static final Key TYPE = Key.getKey("Type");
  private static final Key BOX  = Key.getKey("Box");

  String                   name;
  Term[]                   terms;

  public Union(String name, Term[] terms) {
    super();
    this.name = name;
    this.terms = terms;
  }

  public runtime.data.Term asTerm() {
    List<runtime.data.Term> boxes = new Nil<runtime.data.Term>();
    runtime.data.Term nameBox = new runtime.data.Term(BOX, TypeDiagram.slist(name, "<<union>>"));
    List<String> termStrings = new Nil<String>();
    for (Term term : terms)
      termStrings = termStrings.cons(term.toString());
    runtime.data.Term termBox = new runtime.data.Term(BOX, termStrings);
    boxes = boxes.cons(termBox);
    boxes = boxes.cons(nameBox);
    return new runtime.data.Term(TYPE, name, boxes);
  }

}
