package runtime.actors;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

import ast.binding.Dec;
import ast.types.Forall;
import ast.types.MessageType;
import ast.types.Type;
import ast.types.Union;
import compiler.DynamicVar;
import env.Empty;
import env.Env;
import list.List;
import list.Nil;
import runtime.ESL;
import runtime.data.Dynamic;
import runtime.functions.Builtin;

public class Builtins {

  // Contains all the built-in functions that are used by actors.

  final static public java.util.Set<String> builtinNames = new HashSet<String>();

  static {
    builtinNames.add("print");
    builtinNames.add("probably");
    builtinNames.add("record");
    builtinNames.add("getResults");
    builtinNames.add("random");
    builtinNames.add("stopAll");
    builtinNames.add("shuffle");
    builtinNames.add("kill");
    builtinNames.add("resetTime");
    builtinNames.add("setMaxInstructons");
    builtinNames.add("setInstructionsPerTimeUnit");
    builtinNames.add("edb");
    builtinNames.add("builtin");
  }

  public static void applyBuiltin(Method method, int methodArity, Actor actor, Integer suppliedArity) {
    if (methodArity == suppliedArity) {
      actor.closeFrame(0, null, null, null);
      Object[] args = new Object[methodArity];
      for (int i = 0; i < methodArity; i++)
        args[i] = actor.getFrameVar(i);
      try {
        actor.returnValue(method.invoke(actor, args));
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        e.printStackTrace();
        throw new Error("problems invoking " + method);
      }
    } else throw new Error(method + " expects " + methodArity + " args, but was supplied with " + suppliedArity);
  }

  public static void builtin(Actor actor, int arity) {
    if (arity == 3) {
      actor.closeFrame(0, null, null, null);
      String classPath = actor.getFrameVar(0).toString();
      String methodName = actor.getFrameVar(1).toString();
      int methodArity = (int) actor.getFrameVar(2);
      Class<?> c;
      try {
        c = Class.forName(classPath);
      } catch (ClassNotFoundException e) {
        throw new Error("builtin: cannot find a class named " + classPath);
      }
      Method method = null;
      for (Method m : c.getMethods()) {
        if (m.getName().equals(methodName) && m.getParameterTypes().length == methodArity) method = m;
      }
      if (method != null) {
        Method suppliedMethod = method;
        Builtin builtin = new Builtin(methodName, (suppliedActor, suppliedArity) -> applyBuiltin(suppliedMethod, methodArity, suppliedActor, suppliedArity));
        actor.returnValue(builtin);
      } else throw new Error("builtin: cannot find method named " + methodName + " with arity " + methodArity);
    } else throw new Error("builtin expects 3 args but supplied with " + arity);
  }

  public static List<DynamicVar> builtinDynamics() {

    // Those dynamics that will be available at run-time by default...

    DynamicVar print = new DynamicVar("print", 0);
    DynamicVar probably = new DynamicVar("probably", 1);
    DynamicVar random = new DynamicVar("random", 2);
    DynamicVar stopAll = new DynamicVar("stopAll", 3);
    DynamicVar shuffle = new DynamicVar("shuffle", 4);
    DynamicVar kill = new DynamicVar("kill", 5);
    DynamicVar resetTime = new DynamicVar("resetTime", 6);
    DynamicVar setMaxInstructions = new DynamicVar("setMaxInstructions", 7);
    DynamicVar setInstructionsPerTimeUnit = new DynamicVar("setInstructionsPerTimeUnit", 8);
    DynamicVar edb = new DynamicVar("edb", 9);
    DynamicVar builtin = new DynamicVar("builtin", 10);
    List<DynamicVar> env = new Nil<DynamicVar>();

    // Order is not important...

    env = env.cons(print);
    env = env.cons(probably);
    env = env.cons(random);
    env = env.cons(stopAll);
    env = env.cons(shuffle);
    env = env.cons(kill);
    env = env.cons(resetTime);
    env = env.cons(setMaxInstructions);
    env = env.cons(setInstructionsPerTimeUnit);
    env = env.cons(edb);
    env = env.cons(builtin);
    return env;
  }

  public static List<Dynamic> builtinEnv() {

    // The run-time equivalent of builtinDynamics...

    Dynamic print = new Dynamic(new Builtin("print", Builtins::print));
    Dynamic probably = new Dynamic(new Builtin("probably", Builtins::probably));
    Dynamic random = new Dynamic(new Builtin("random", Builtins::random));
    Dynamic stopAll = new Dynamic(new Builtin("stopAll", Builtins::stopAll));
    Dynamic shuffle = new Dynamic(new Builtin("shuffle", Builtins::shuffle));
    Dynamic kill = new Dynamic(new Builtin("kill", Builtins::kill));
    Dynamic resetTime = new Dynamic(new Builtin("resetTime", Builtins::resetTime));
    Dynamic setMaxInstructions = new Dynamic(new Builtin("setMaxInstructions", Builtins::setMaxInstructions));
    Dynamic setInstructionsPerTimeUnit = new Dynamic(new Builtin("setInstructionsPerTimeUnit", Builtins::setInstructionsPerTimeUnit));
    Dynamic edb = new Dynamic(ESL.getEDB());
    Dynamic builtin = new Dynamic(new Builtin("builtin", Builtins::builtin));
    List<Dynamic> env = new Nil<Dynamic>();

    // Order is important - must match indices used in builtinDynamics...

    env = env.cons(builtin);
    env = env.cons(edb);
    env = env.cons(setInstructionsPerTimeUnit);
    env = env.cons(setMaxInstructions);
    env = env.cons(resetTime);
    env = env.cons(kill);
    env = env.cons(shuffle);
    env = env.cons(stopAll);
    env = env.cons(random);
    env = env.cons(probably);
    env = env.cons(print);
    return env;
  }

  public static Env<String, Type> builtinTypes() {
    Type Void = ast.types.Void.VOID;
    Type Int = ast.types.Int.INT;
    Type T = new ast.types.Var(-1, -1, "T", null);
    Type List_T = new ast.types.List(-1, -1, T);
    Type[] none = new Type[] {};
    Type fun0_to_T = new ast.types.Fun(-1, -1, none, T);
    Type Str = ast.types.Str.STR;
    Type Point = new ast.types.Term(-1, -1, "Point", new ast.types.Type[] { Int, Int });
    ast.types.Term HTML = new ast.types.Term(-1, -1, "HTML", new ast.types.Type[] { Str });
    Type Props = new ast.types.List(-1, -1, new ast.types.Term(-1, -1, "Prop", new Type[] { Str, Str }));
    Type Slice = new ast.types.Term(-1, -1, "Slice", new ast.types.Type[] { Props, Str, Int });
    Type Slices = new ast.types.List(-1, -1, Slice);
    ast.types.Term Rectangle = new ast.types.Term(-1, -1, "Rectangle", new ast.types.Type[] { Int, Int, Int, Int, Str });
    ast.types.Term Circle = new ast.types.Term(-1, -1, "Circle", new ast.types.Type[] { Int, Int, Int, Str });
    ast.types.Term Line = new ast.types.Term(-1, -1, "Line", new ast.types.Type[] { Int, Int, Int, Int, Str });
    ast.types.Term Text = new ast.types.Term(-1, -1, "Text", new ast.types.Type[] { Int, Int, Str, Str });
    ast.types.Term Image = new ast.types.Term(-1, -1, "Image", new ast.types.Type[] { Int, Int, Int, Int, Str });
    ast.types.Term SeqAct = new ast.types.Term(-1, -1, "Actor", new ast.types.Type[] { Int, Int, Int, Str });
    ast.types.Term SeqMessage = new ast.types.Term(-1, -1, "Message", new ast.types.Type[] { Int, Int, Int, Str });
    Type PictElement = new Union(-1, -1, new ast.types.Term[] { Rectangle, Circle, Line, Image, Text });
    Type PictElements = new ast.types.List(-1, -1, PictElement);
    ast.types.Term Picture = new ast.types.Term(-1, -1, "Picture", new ast.types.Type[] { Int, Int, PictElements });
    ast.types.Term Sequence = new ast.types.Term(-1, -1, "Sequence", new ast.types.Type[] { new ast.types.List(-1, -1, SeqAct), new ast.types.List(-1, -1, SeqMessage) });
    ast.types.Term Pie = new ast.types.Term(-1, -1, "Pie", new ast.types.Type[] { Props, Str, Int, Int, Slices });
    ast.types.Term Node = new ast.types.Term(-1, -1, "Node", new ast.types.Type[] { Props, Int, T });
    ast.types.Term Edge = new ast.types.Term(-1, -1, "Edge", new ast.types.Type[] { Props, Int, Int, T });
    Type Nodes = new ast.types.List(-1, -1, Node);
    Type Edges = new ast.types.List(-1, -1, Edge);
    ast.types.Term Graph = new ast.types.Term(-1, -1, "Graph", new ast.types.Type[] { Props, Nodes, Edges });
    Type Data = new ast.types.Term(-1, -1, "Data", new ast.types.Type[] { Props, T });
    Type Row = new ast.types.Term(-1, -1, "Row", new ast.types.Type[] { Props, new ast.types.List(-1, -1, Data) });
    ast.types.Term Table = new ast.types.Term(-1, -1, "Table", new ast.types.Type[] { Props, new ast.types.List(-1, -1, Row) });
    Type Display = new ast.types.Rec(-1, -1, "T", new Union(-1, -1, new ast.types.Term[] { Table, HTML, Pie, Picture, Sequence, Graph }));
    Type Displays = new ast.types.List(-1, -1, Display);
    Dec saveHistory = new Dec(-1, -1, "", "saveHistory", new ast.types.Fun(-1, -1, new Type[] { Str }, Void));
    Dec saveState = new Dec(-1, -1, "", "saveState", new ast.types.Fun(-1, -1, new Type[] { Str }, Void));
    Type circlePos = new ast.types.Fun(-1, -1, new Type[] { Int, Int, Int, Int }, Point);
    MessageType BrowserEvent = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "BrowserEvent", new Type[] { Str }) });
    Type BrowserListener = new ast.types.Act(-1, -1, new Dec[] {}, new MessageType[] { BrowserEvent });
    MessageType Show = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "Show", new Type[] { Str, Display }) });
    MessageType Filmstrip = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "Filmstrip", new Type[] { Str, Displays }) });
    MessageType AddBL = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "AddBrowserListener", new Type[] { BrowserListener }) });
    Dec math = new Dec(-1, -1, "", "math", new ast.types.Record(-1, -1, new ast.types.Field[] { new ast.types.Field(-1, -1, "circlePos", circlePos) }));
    Type edb = new ast.types.Act(-1, -1, new Dec[] { saveHistory, saveState, math }, new MessageType[] { Show, Filmstrip, AddBL });
    Env<String, Type> env = new Empty<String, Type>();
    env = env.bind("print", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T }, Void)));
    env = env.bind("stopAll", new ast.types.Fun(-1, -1, new Type[0], Void));
    env = env.bind("probably", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Int, fun0_to_T, fun0_to_T }, fun0_to_T)));
    env = env.bind("kill", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T }, Void)));
    env = env.bind("random", new ast.types.Fun(-1, -1, new Type[] { Int }, Int));
    env = env.bind("setMaxInstructions", new ast.types.Fun(-1, -1, new Type[] { Int }, Void));
    env = env.bind("setInstructionsPerTimeUnit", new ast.types.Fun(-1, -1, new Type[] { Int }, Void));
    env = env.bind("shuffle", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { List_T }, List_T)));
    env = env.bind("resetTime", new ast.types.Fun(-1, -1, new Type[] { Int }, Void));
    env = env.bind("builtin", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Str, Str, Int }, T)));
    env = env.bind("edb", edb);
    return env;
  }

  public static void kill(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Actor a = (Actor) actor.getFrameVar(0);
      a.die();
      actor.returnValue(a);
    } else throw new Error("kill expects 1 arg but supplied with " + arity);
  }

  public static int length(List<?> list) {
    return list.length();
  }

  public static boolean member(Object x, List<?> l) {
    if (l.isNil())
      return false;
    else if (l.getHead().equals(x))
      return true;
    else return member(x, l.getTail());
  }

  public static Object nth(List<?> list, int n) {
    return list.nth(n);
  }

  public static Object pp(Object x) {
    // This is an example static that is used by a builtin created from ESL.
    System.out.println(x);
    return x;
  }

  public static void print(Actor actor, int arity) {

    // A method that implements the builtin for printing values.
    // The function returns its argument...

    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Object value = actor.getFrameVar(0);
      System.out.println(value);
      actor.returnValue(value);
    } else throw new Error("print expects " + 1 + " arg but supplied with " + arity);
  }

  public static void probably(Actor actor, int arity) {

    // A method that implements the builtin for stochastic behaviour. It is
    // supplied with a %-age and two values. It will return the first value
    // with a frequency defined by the %-age and the second value the rest
    // of the time...

    if (arity == 3) {
      actor.closeFrame(0, null, null, null);
      Object v2 = actor.popStack();
      Object v1 = actor.popStack();
      int percent = (int) actor.popStack();
      if ((Math.random() * 100) < percent)
        actor.returnValue(v1);
      else actor.returnValue(v2);
    } else throw new Error("probably expects " + 3 + " args but supplied with " + arity);
  }

  public static void random(Actor actor, int arity) {

    // get a random number from 0 to n-1...

    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int n = (int) actor.getFrameVar(0);
      actor.returnValue((int) (Math.random() * n));
    } else throw new Error("random expects " + 1 + " arg but supplied with " + arity);
  }

  // The index to the next available stack location...

  public static List<?> remove(Object x, List<Object> l) {
    return l.remove(x);
  }

  public static void resetTime(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int t = (int) actor.getFrameVar(0);
      ESL.setTime(t);
      actor.localTime = t;
      actor.returnValue(t);
    } else throw new Error("resetTime expects 1 arg but supplied with " + arity);
  }

  public static void setInstructionsPerTimeUnit(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int instructionsPerTimeUnit = (int) actor.getFrameVar(0);
      ESL.setINSTRS_PER_TIME_UNIT(instructionsPerTimeUnit);
      actor.returnValue(instructionsPerTimeUnit);
    } else throw new Error("setInstructionsPerTimeUnit expects 1 arg but supplied with " + arity);
  }

  public static void setMaxInstructions(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      int maxInstructions = (int) actor.getFrameVar(0);
      ESL.setMAX_INSTRS(maxInstructions);
      actor.returnValue(maxInstructions);
    } else throw new Error("setMaxInstructions expects 1 arg but supplied with " + arity);
  }

  public static void shuffle(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      List<Object> l = (List) actor.getFrameVar(0);
      actor.returnValue(l.shuffle());
    } else throw new Error("shuffle expects 1 arg but supplied with " + arity);
  }

  public static void stopAll(Actor actor, int arity) {
    if (arity == 0) {
      actor.closeFrame(0, null, null, null);
      ESL.stop();
      actor.returnValue(actor);
    } else throw new Error("getResults expects 0 args but supplied with " + arity);
  }

  public static double sysTime() {
    return System.currentTimeMillis();
  }

}
