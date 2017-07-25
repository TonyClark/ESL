package runtime.actors;

import java.io.File;
import java.util.Hashtable;

import list.List;
import runtime.data.Dynamic;
import runtime.data.Key;
import runtime.functions.Closure;
import runtime.functions.CodeBox;

public class Behaviour {

  String                     name;        // Behaviour may be anonymous in which case this is the empty string...
  Key[]                      exports;     // Behaviours export names that are available via the dynamics...
  List<Dynamic>              dynamics;    // A behaviour acts link a closure. It closes in the dynamic chain...
  int                        initIndex;   // The index to jump to when an actor is created...
  CodeBox                    code;        // A behaviour handles messages via a code box...
  boolean                    handlesTime; // Whether an actor with this behaviour should be supplied with Time(n) events.
  Hashtable<String, Closure> handlers;
  Actor                      self;

  public Behaviour(String name, Key[] exports, List<Dynamic> dynamics, int initIndex, CodeBox codebox, boolean handlesTime, Hashtable<String, Closure> handlers, Actor self) {
    this.name = name;
    this.exports = exports;
    this.dynamics = dynamics;
    this.initIndex = initIndex;
    this.code = codebox;
    this.handlesTime = handlesTime;
    this.handlers = handlers;
    this.self = self;
  }

  public Dynamic dynamicRef(Key key) {
    return refDynamic(exportIndex(key));
  }

  public int exportIndex(Key name) {
    for (int i = 0; i < exports.length; i++)
      if (name == exports[i]) return i;
    return -1;
  }

  public CodeBox getCode() {
    return code;
  }

  private Object getDynamic(int i) {
    return dynamics.nth(i).getValue();
  }

  public List<Dynamic> getDynamics() {
    return dynamics;
  }

  public Key[] getExports() {
    return exports;
  }

  public Closure getFunHandler(String name, int arity) {
    return handlers.get(name);
  }

  public Hashtable<String, Closure> getHandlers() {
    return handlers;
  }

  public String getHTMLLabel(int id) {
    String s = "<TABLE BORDER=\"0\" CELLBORDER=\"0\" CELLSPACING=\"0\" COLOR=\"RED\">";
    String label = name + "(" + id + ")";
    s = s + "<TR><TD COLSPAN=\"2\"><FONT FACE=\"ITALIC\" POINT-SIZE=\"12\">" + label + "</FONT></TD></TR>";
    List<Dynamic> dynamics = getDynamics();
    String[] names = getCode().getDynamicNames(0);
    int index = 0;
    while (!dynamics.isNil()) {
      String name = names[index++];
      Dynamic d = dynamics.getHead();
      dynamics = dynamics.getTail();
      Object o = d.getValue();
      if (o instanceof Integer || o instanceof String || o instanceof Boolean) s = s + "<TR><TD BORDER=\"1\"><FONT POINT-SIZE=\"10\">" + name + "</FONT></TD><TD BORDER=\"1\"><FONT POINT-SIZE=\"10\">" + o + "</FONT></TD></TR>";
    }
    return s + "</TABLE>";
  }

  public int getInitIndex() {
    return initIndex;
  }

  public String getName() {
    return name;
  }

  public String getPath() {
    return code.getPath();
  }

  public String getPathName() {
    String path = getPath();
    File file = new File(path);
    String name = file.getName();
    int dot = name.indexOf('.');
    if (dot == -1)
      return name;
    else return name.substring(0, dot);
  }

  public Actor getSelf() {
    return self;
  }

  public boolean handlesTime() {
    return handlesTime;
  }

  public boolean hasExport(Key name) {
    for (Key n : exports)
      if (n != null && n == name) return true;
    return false;
  }

  public boolean hasFunHandler(String name, int arity) {
    if (handlers.containsKey(name)) {
      Closure handler = handlers.get(name);
      return handler.getArity() == arity;
    } else return false;
  }

  public Object ref(Key name) {
    return getDynamic(exportIndex(name));
  }

  private Dynamic refDynamic(int i) {
    return dynamics.nth(i);
  }

  public void setSelf(Actor self) {
    this.self = self;
  }

  public String toString() {
    return "Behaviour(" + name + ")";
  }

}
