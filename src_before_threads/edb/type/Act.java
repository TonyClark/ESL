package edb.type;

import java.util.Vector;

import ast.spec.BRule;
import ast.spec.StateDef;
import ast.types.Type;
import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class Act {

  private static final Key ACT        = Key.getKey("Act");
  private static final Key BOX        = Key.getKey("Box");

  ActType                  type;
  String                   name;
  Vector<Field>            fields     = new Vector<Field>();
  Vector<Operation>        operations = new Vector<Operation>();
  Vector<StateDef>         states     = new Vector<StateDef>();
  Behaviour                behaviour  = new Behaviour();

  public Act(String name) {
    this.name = name;
  }

  public void addField(String name, Type type, String value) {
    fields.add(new Field(name, type, value));
  }

  public void addOperation(String name, Type type) {
    operations.add(new Operation(name, type));
  }

  public void addState(StateDef def) {
    states.add(def);
  }

  public Term asTerm() {
    List<Term> boxes = new Nil<Term>();
    Term nameBox = new Term(BOX, TypeDiagram.slist(name));
    List<String> fieldStrings = new Nil<String>();
    for (Field field : fields)
      fieldStrings = fieldStrings.cons(field.toString());
    Term fieldsBox = new Term(BOX, fieldStrings);
    List<String> opStrings = new Nil<String>();
    for (Operation o : operations)
      opStrings = opStrings.cons(o.toString());
    Term opBox = new Term(BOX, opStrings);
    List<String> stateStrings = new Nil<String>();
    for (StateDef def : states)
      stateStrings = stateStrings.cons(def.pprint());
    Term handlerBox = new Term(BOX, stateStrings);
    boxes = boxes.cons(handlerBox);
    boxes = boxes.cons(opBox);
    boxes = boxes.cons(fieldsBox);
    boxes = boxes.cons(nameBox);
    return new Term(ACT, name, boxes);
  }

  public Vector<Field> getFields() {
    return fields;
  }

  public String getName() {
    return name;
  }

  public Vector<Operation> getOperations() {
    return operations;
  }

  public ActType getType() {
    return type;
  }

  public void setFields(Vector<Field> fields) {
    this.fields = fields;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOperations(Vector<Operation> operations) {
    this.operations = operations;
  }

  public void setType(ActType type) {
    this.type = type;
  }

  public void addRule(BRule rule) {
    behaviour.addRule(rule);
  }

  public boolean hasBehaviour() {
    return !behaviour.isEmpty();
  }

  public Term behaviourNode() {
    return behaviour.asNode();
  }

}
