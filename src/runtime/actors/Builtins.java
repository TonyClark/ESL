package runtime.actors;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

import com.google.googlejavaformat.FormatterDiagnostic;
import com.google.googlejavaformat.java.FormatterException;

import ast.binding.Dec;
import ast.general.AST;
import ast.modules.Module;
import ast.types.Forall;
import ast.types.MessageType;
import ast.types.Term;
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
		builtinNames.add("wait");
		builtinNames.add("sleep");
		builtinNames.add("wake");
		builtinNames.add("stopOthers");
		builtinNames.add("parse");
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
		} else
			throw new Error(method + " expects " + methodArity + " args, but was supplied with " + suppliedArity);
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
			} else
				throw new Error("builtin: cannot find method named " + methodName + " with arity " + methodArity);
		} else
			throw new Error("builtin expects 3 args but supplied with " + arity);
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
		DynamicVar edb = new DynamicVar("edb", 7);
		DynamicVar builtin = new DynamicVar("builtin", 8);
		DynamicVar wait = new DynamicVar("wait", 9);
		DynamicVar sleep = new DynamicVar("sleep", 10);
		DynamicVar wake = new DynamicVar("wake", 11);
		DynamicVar stopOthers = new DynamicVar("stopOthers", 12);
		DynamicVar parse = new DynamicVar("parse", 13);
		List<DynamicVar> env = new Nil<DynamicVar>();

		// Order is not important...

		env = env.cons(print);
		env = env.cons(probably);
		env = env.cons(random);
		env = env.cons(stopAll);
		env = env.cons(shuffle);
		env = env.cons(kill);
		env = env.cons(resetTime);
		env = env.cons(edb);
		env = env.cons(builtin);
		env = env.cons(wait);
		env = env.cons(sleep);
		env = env.cons(wake);
		env = env.cons(stopOthers);
		env = env.cons(parse);
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
		Dynamic edb = new Dynamic(ESL.getEDB());
		Dynamic builtin = new Dynamic(new Builtin("builtin", Builtins::builtin));
		Dynamic wait = new Dynamic(new Builtin("wait", Builtins::wait));
		Dynamic sleep = new Dynamic(new Builtin("sleep", Builtins::sleep));
		Dynamic wake = new Dynamic(new Builtin("wake", Builtins::wake));
		Dynamic stopOthers = new Dynamic(new Builtin("stopOthers", Builtins::stopOthers));
		Dynamic parse = new Dynamic(new Builtin("parse", Builtins::parse));
		List<Dynamic> env = new Nil<Dynamic>();

		// Order is important - must match indices used in builtinDynamics...

		env = env.cons(parse);
		env = env.cons(stopOthers);
		env = env.cons(wake);
		env = env.cons(sleep);
		env = env.cons(wait);
		env = env.cons(builtin);
		env = env.cons(edb);
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
		Type TreeElement = new ast.types.Var(-1, -1, "TreeElement", null);
		Type List_T = new ast.types.List(-1, -1, T);
		Type[] none = new Type[] {};
		Type fun0_to_T = new ast.types.Fun(-1, -1, none, T);
		Type Str = ast.types.Str.STR;
		ast.types.Term HTML = new ast.types.Term(-1, -1, "HTML", new ast.types.Type[] { Str });
		Type Props = new ast.types.List(-1, -1, new ast.types.Term(-1, -1, "Prop", new Type[] { Str, Str }));
		Type LinePoint = new Union(-1, -1, new Term[] { new ast.types.Term(-1, -1, "LPoint", new ast.types.Type[] { Props, Int, Int }) });
		Type EditTypes = new Union(-1, -1, new Term[] { new ast.types.Term(-1, -1, "ESLSource", new ast.types.Type[] { Str, Str }),
		    new ast.types.Term(-1, -1, "JavaSource", new ast.types.Type[] { Str, Str, Str }), new ast.types.Term(-1, -1, "RawText", new ast.types.Type[] { Str }) });
		Type Point = new ast.types.Term(-1, -1, "Point", new ast.types.Type[] { Int, Int });
		Type LinePoints = new ast.types.List(-1, -1, LinePoint);
		Type Slice = new ast.types.Term(-1, -1, "Slice", new ast.types.Type[] { Props, Str, Int });
		Type GLine = new ast.types.Term(-1, -1, "GLine", new ast.types.Type[] { Props, Str, LinePoints });
		Type Slices = new ast.types.List(-1, -1, Slice);
		Type Lines = new ast.types.List(-1, -1, GLine);
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
		ast.types.Term LineGraph = new ast.types.Term(-1, -1, "LineGraph", new ast.types.Type[] { Props, Str, Str, Str, Int, Int, Lines });
		ast.types.Term Node = new ast.types.Term(-1, -1, "Node", new ast.types.Type[] { Props, Int, T });
		ast.types.Term Edge = new ast.types.Term(-1, -1, "Edge", new ast.types.Type[] { Props, Int, Int, T });
		Type Nodes = new ast.types.List(-1, -1, Node);
		Type Edges = new ast.types.List(-1, -1, Edge);
		ast.types.Term TreeNode = new ast.types.Term(-1, -1, "TreeNode", new ast.types.Type[] { PictElement });
		ast.types.Term VBox = new ast.types.Term(-1, -1, "VBox", new ast.types.Type[] { Props, new ast.types.List(-1, -1, TreeElement) });
		ast.types.Term HBox = new ast.types.Term(-1, -1, "HBox", new ast.types.Type[] { Props, new ast.types.List(-1, -1, TreeElement) });
		ast.types.Term Padding = new ast.types.Term(-1, -1, "Padding", new ast.types.Type[] { Props });
		ast.types.Term LabelledTree = new ast.types.Term(-1, -1, "LabelledTree", new ast.types.Type[] { Str, TreeElement });
		ast.types.Term Graph = new ast.types.Term(-1, -1, "Graph", new ast.types.Type[] { Props, Nodes, Edges });
		Type Data = new ast.types.Term(-1, -1, "Data", new ast.types.Type[] { Props, T });
		Type Row = new ast.types.Term(-1, -1, "Row", new ast.types.Type[] { Props, new ast.types.List(-1, -1, Data) });
		ast.types.Term Table = new ast.types.Term(-1, -1, "Table", new ast.types.Type[] { Props, new ast.types.List(-1, -1, Row) });
		Type TreeEl = new ast.types.Rec(-1, -1, "TreeElement", new Union(-1, -1, new ast.types.Term[] { TreeNode, VBox, HBox, Padding, LabelledTree }));
		Term Tree = new ast.types.Term(-1, -1, "Tree", new ast.types.Type[] { Int, Int, TreeEl });
		Type Display = new ast.types.Rec(-1, -1, "T", new Union(-1, -1, new ast.types.Term[] { Table, HTML, Pie, LineGraph, Picture, Sequence, Graph, Tree }));
		Type Displays = new ast.types.List(-1, -1, Display);
		Dec serialize = new Dec(-1, -1, "", "serialize", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T, Str }, T)));
		Dec message = new Dec(-1, -1, "", "message", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T }, T)));
		Dec saveHistory = new Dec(-1, -1, "", "saveHistory", new ast.types.Fun(-1, -1, new Type[] { Str }, Void));
		Dec saveState = new Dec(-1, -1, "", "saveState", new ast.types.Fun(-1, -1, new Type[] { Str }, Void));
		Type circlePos = new ast.types.Fun(-1, -1, new Type[] { Int, Int, Int, Int }, Point);
		MessageType BrowserEvent = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "BrowserEvent", new Type[] { Str }) });
		Type BrowserListener = new ast.types.Act(-1, -1, new Dec[] {}, new MessageType[] { BrowserEvent });
		MessageType Show = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "Show", new Type[] { Str, Display }) });
		MessageType Filmstrip = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "Filmstrip", new Type[] { Str, Displays }) });
		MessageType AddBL = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "AddBrowserListener", new Type[] { BrowserListener }) });
		MessageType Edit = new MessageType(-1, -1, new Type[] { new ast.types.Term(-1, -1, "Edit", new Type[] { EditTypes }) });
		Dec math = new Dec(-1, -1, "", "math", new ast.types.Record(-1, -1, new ast.types.Field[] { new ast.types.Field(-1, -1, "circlePos", circlePos) }));
		Dec display = new Dec(-1, -1, "", "display", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Str, T }, Void)));
		Dec button = new Dec(-1, -1, "", "button", new ast.types.Fun(-1, -1, new Type[] { Str, Str, Str, Str, new ast.types.Fun(-1, -1, new Type[] {}, Void) }, Void));
		Type edb = new ast.types.Act(-1, -1, new Dec[] { saveHistory, saveState, math, serialize, message, display, button }, new MessageType[] { Show, Filmstrip, AddBL, Edit });
		Env<String, Type> env = new Empty<String, Type>();
		env = env.bind("print", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T }, Void)));
		env = env.bind("stopAll", new ast.types.Fun(-1, -1, new Type[0], Void));
		env = env.bind("probably", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Int, fun0_to_T, fun0_to_T }, fun0_to_T)));
		env = env.bind("kill", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { T }, Void)));
		env = env.bind("random", new ast.types.Fun(-1, -1, new Type[] { Int }, Int));
		env = env.bind("shuffle", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { List_T }, List_T)));
		env = env.bind("resetTime", new ast.types.Fun(-1, -1, new Type[] {}, Void));
		env = env.bind("builtin", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Str, Str, Int }, T)));
		env = env.bind("wait", new ast.types.Fun(-1, -1, new Type[] { Int }, Void));
		env = env.bind("sleep", new ast.types.Fun(-1, -1, new Type[] {}, Void));
		env = env.bind("wake", new ast.types.Fun(-1, -1, new Type[] {}, Void));
		env = env.bind("stopOthers", new ast.types.Fun(-1, -1, new Type[] {}, Void));
		env = env.bind("parse", new Forall(-1, -1, new String[] { "T" }, new ast.types.Fun(-1, -1, new Type[] { Str }, new ast.types.Var(-1, -1, "T", null))));
		env = env.bind("edb", edb);
		return env;
	}

	public static void stopOthers(Actor actor, int arity) {
		if (arity == 0) {
			actor.closeFrame(0, null, null, null);
			ESL.stopOthers(actor);
			actor.returnValue(null);
		} else
			throw new Error("stopOthers expects 0 args but supplied with " + arity);
	}

	public static void parse(Actor actor, int arity) {
		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			String path = (String) actor.getFrameVar(0);
			Module module = Module.parseModule(path, parser.ESL.readFile(path));
			runtime.data.Term term = (runtime.data.Term) AST.asESLValue(module);
			actor.returnValue(term);
		} else
			throw new Error("parse expects 1 args but supplied with " + arity);
	}

	public static void wait(Actor actor, int arity) {
		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			int time = (int) actor.getFrameVar(0);
			synchronized (actor) {
				try {
					actor.wait(time);
				} catch (Exception x) {
				}
			}
			actor.returnValue(null);
		} else
			throw new Error("wait expects 1 arg but supplied with " + arity);
	}

	public static void sleep(Actor actor, int arity) {
		if (arity == 0) {
			actor.closeFrame(0, null, null, null);
			synchronized (actor) {
				try {
					actor.wait();
				} catch (Exception x) {
				}
			}
			actor.returnValue(null);
		} else
			throw new Error("sleep expects 0 args but supplied with " + arity);
	}

	public static void wake(Actor actor, int arity) {
		if (arity == 0) {
			actor.closeFrame(0, null, null, null);
			synchronized (actor) {
				try {
					actor.notifyAll();
				} catch (Exception x) {
				}
			}
			actor.returnValue(null);
		} else
			throw new Error("wake expects 0 args but supplied with " + arity);
	}

	public static void kill(Actor actor, int arity) {
		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			Actor a = (Actor) actor.getFrameVar(0);
			a.die();
			actor.returnValue(a);
		} else
			throw new Error("kill expects 1 arg but supplied with " + arity);
	}

	public static int length(List<?> list) {
		return list.length();
	}

	public static <T> T last(List<T> list) {
		return list.last();
	}

	public static <T> List<T> butlast(List<T> list) {
		return list.butlast();
	}

	public static boolean member(Object x, List<?> l) {
		if (l.isNil())
			return false;
		else if (l.getHead().equals(x))
			return true;
		else
			return member(x, l.getTail());
	}

	public static Object nth(List<?> list, int n) {
		return list.nth(n);
	}

	public static <T> List<T> replaceNth(List<T> list, int n, T x) {
		return list.update(n, x);
	}

	public static <T> List<T> flatten(List<List<T>> list) {
		return List.flatten(list);
	}

	public static Object pp(Object x) {
		// This is an example static that is used by a builtin created from ESL.
		System.out.println(x);
		return x;
	}

	public static Object intToFloat(Object x) {
		if (x instanceof Integer)
			return (double) ((int) x);
		else
			throw new Error("expecting an integer: " + x);
	}

	public static Object round(Object x) {
		if (x instanceof Double)
			return (int) Math.ceil(((double) x));
		else
			throw new Error("expecting a float: " + x);
	}

	public static Object downcase(Object x) {
		if (x instanceof String)
			return ((String) x).toLowerCase();
		else
			throw new Error("expecting a string: " + x);
	}

	public static Object hasSuffix(Object o1, Object o2) {
		String string = (String) o1;
		String suffix = (String) o2;
		return string.endsWith(suffix);
	}

	public static Object trim(Object o) {
		String string = (String) o;
		return string.trim();
	}

	public static void print(Actor actor, int arity) {

		// A method that implements the builtin for printing values.
		// The function returns its argument...

		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			Object value = actor.getFrameVar(0);
			System.out.println(value);
			actor.returnValue(value);
		} else
			throw new Error("print expects " + 1 + " arg but supplied with " + arity);
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
			else
				actor.returnValue(v2);
		} else
			throw new Error("probably expects " + 3 + " args but supplied with " + arity);
	}

	public static void random(Actor actor, int arity) {

		// get a random number from 0 to n-1...

		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			Object o = actor.getFrameVar(0);
			if (o instanceof Integer)
				actor.returnValue((int) (Math.random() * ((int) o)));
			else if (o instanceof Long)
				actor.returnValue((int) (Math.random() * ((Long) o).intValue()));
			else
				throw new Error("unknown type of argument to random: " + o);
		} else
			throw new Error("random expects " + 1 + " arg but supplied with " + arity);
	}

	// The index to the next available stack location...

	public static List<?> remove(Object x, List<Object> l) {
		return l.remove(x);
	}

	public static void resetTime(Actor actor, int arity) {
		if (arity == 0) {
			actor.closeFrame(0, null, null, null);
			ESL.setTime(System.currentTimeMillis());
			actor.setLocalTime(System.currentTimeMillis());
			actor.returnValue(System.currentTimeMillis());
		} else
			throw new Error("resetTime expects 0 arg but supplied with " + arity);
	}

	public static void shuffle(Actor actor, int arity) {
		if (arity == 1) {
			actor.closeFrame(0, null, null, null);
			List<Object> l = (List) actor.getFrameVar(0);
			actor.returnValue(l.shuffle());
		} else
			throw new Error("shuffle expects 1 arg but supplied with " + arity);
	}

	public static void stopAll(Actor actor, int arity) {
		if (arity == 0) {
			actor.closeFrame(0, null, null, null);
			ESL.stop();
			actor.returnValue(actor);
		} else
			throw new Error("getResults expects 0 args but supplied with " + arity);
	}

	public static double sysTime() {
		return System.currentTimeMillis();
	}

	public static int intDist(int x1, int y1, int x2, int y2) {
		int dx = x1 - x2;
		int dy = y1 - y2;
		return (int) Math.sqrt((dx * dx) + (dy * dy));
	}

}
