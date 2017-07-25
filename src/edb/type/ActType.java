package edb.type;

import java.util.Vector;

import ast.spec.BRule;
import ast.types.Type;
import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class ActType {

  private static final Key TYPE     = Key.getKey("Type");
  private static final Key ACT      = Key.getKey("Act");
  private static final Key BOX      = Key.getKey("Box");
  private static final Key TEXT     = Key.getKey("Text");
  private static final Key LINK     = Key.getKey("Link");

  String                   name;
  Vector<FieldType>        fields   = new Vector<FieldType>();
  Vector<HandlerType>      handlers = new Vector<HandlerType>();

  public ActType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addFieldType(String name, Type type) {
    fields.add(new FieldType(name, type));
  }

  public void addHandlerType(Type type) {
    handlers.add(new HandlerType(type));
  }

  public Term asTerm() {
    List<Term> boxes = new Nil<Term>();
    Term nameBox = new Term(BOX, TypeDiagram.slist(name, "<<type>>"));
    List<String> fieldStrings = new Nil<String>();
    for (FieldType field : fields)
      fieldStrings = fieldStrings.cons(field.toString());
    Term fieldsBox = new Term(BOX, fieldStrings);
    List<String> handlerStrings = new Nil<String>();
    for (HandlerType handler : handlers)
      handlerStrings = handlerStrings.cons(handler.toString());
    Term handlerBox = new Term(BOX, handlerStrings);
    boxes = boxes.cons(handlerBox);
    boxes = boxes.cons(fieldsBox);
    boxes = boxes.cons(nameBox);
    return new Term(TYPE, name, boxes);
  }

}
