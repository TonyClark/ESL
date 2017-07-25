package edb.type;

import java.util.Vector;

import ast.spec.BRule;
import ast.spec.StateDef;
import ast.types.Type;
import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.data.Term;

public class TypeDiagram {

  private static final Key TYPE         = Key.getKey("Type");
  private static final Key TYPES        = Key.getKey("Types");
  private static final Key ACT          = Key.getKey("Act");
  private static final Key BOX          = Key.getKey("Box");
  private static final Key TEXT         = Key.getKey("Text");
  private static final Key LINK         = Key.getKey("Link");

  Vector<ActType>          types        = new Vector<ActType>();
  Vector<Act>              behaviours   = new Vector<Act>();
  Vector<Inherits>         inherits     = new Vector<Inherits>();
  Vector<Association>      associations = new Vector<Association>();
  Vector<Union>            unions       = new Vector<Union>();

  public void addAct(String name) {
    if (hasAct(name)) throw new Error("there is already a baheviour called " + name);
    Act act = new Act(name);
    behaviours.add(act);
  }

  private boolean hasAct(String name) {
    return getAct(name) != null;
  }

  private Act getAct(String name) {
    for (Act act : behaviours)
      if (act.getName().equals(name)) return act;
    return null;
  }

  private ActType getType(String name) {
    for (ActType type : types)
      if (type.getName().equals(name)) return type;
    return null;
  }

  public void addField(String actName, String fieldName, Type type, String value) {
    getAct(actName).addField(fieldName, type, value);
  }

  public void addOperation(String actName, String opName, Type type) {
    getAct(actName).addOperation(opName, type);
  }

  public void addType(String sourceName, String targetName) {
    getAct(sourceName).setType(getType(targetName));
  }

  public void addType(String name) {
    types.add(new ActType(name));
  }

  public void addDeclaredField(String typeName, String fieldName, Type type) {
    getType(typeName).addFieldType(fieldName, type);
  }

  public void addDeclaredHandler(String typeName, Type type) {
    getType(typeName).addHandlerType(type);
  }

  public Term asTerm() {
    List<Term> nodes = new Nil<Term>();
    List<Term> links = new Nil<Term>();
    for (ActType type : types) {
      nodes = nodes.cons(type.asTerm());
    }
    for (Act act : behaviours) {
      nodes = nodes.cons(act.asTerm());
      if (act.getType() != null) {
        links = links.cons(new Term(LINK, act.getName(), act.getType().getName(), "<<type>>"));
        if (act.hasBehaviour()) {
          nodes = nodes.cons(act.behaviourNode());
        }
      }
    }
    for (Union union : unions) {
      nodes = nodes.cons(union.asTerm());
    }
    for (Association a : associations) {
      links = links.cons(a.asTerm());
    }
    return new Term(TYPES, nodes, links);
  }

  public static Object slist(String... strings) {
    List<String> ss = new Nil<String>();
    for (int i = strings.length - 1; i >= 0; i--) {
      ss = ss.cons(strings[i]);
    }
    return ss;
  }

  public void addAssociation(String source, String target, String label) {
    associations.add(new Association(source, target, label));
  }

  public void addUnion(String name, ast.types.Term[] terms) {
    unions.add(new Union(name, terms));
  }

  public boolean isTypeName(String name) {
    for (ActType t : types) {
      if (t.getName().equals(name)) return true;
    }
    return false;
  }

  public void addState(String name, StateDef def) {
    getAct(name).addState(def);
  }

  public void addRule(String name, BRule rule) {
    getAct(name).addRule(rule);
  }

}
