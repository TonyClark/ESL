package ast.general;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

import ast.TreeNode;
import ast.actors.Export;
import ast.actors.ExportedName;
import ast.actors.Import;
import ast.actors.Imports;
import ast.binding.Var;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.RefContainer;
import ast.binding.declarations.ReferencingLocation;
import ast.data.Apply;
import ast.data.ApplyType;
import ast.data.Float;
import ast.data.Ref;
import ast.modules.Module;
import ast.spec.Spec;
import ast.tests.BArm;
import ast.types.Type;
import ast.types.Typed;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.data.Term;
import runtime.functions.CodeBox;
import values.Located;

public abstract class AST implements Located, Typed, TreeNode {

	// An Abstract Syntax Tree (AST) element is used in ESL to represent program
	// syntax.
	// It has a range of general properties and operations that are supported by the
	// BoaConstructor Java annotation which just provides meta-access to the fields
	// of
	// AS objects.

	public static Env<String, DeclaringLocation> addDecs(DecContainer container, Env<String, DeclaringLocation> env) {
		for (DeclaringLocation l : container.getContainedDecs()) {
			env = env.bind(l.getName(), l);
		}
		return env;
	}

	private static Env<String, DeclaringLocation> addRefs(RefContainer container, Env<String, DeclaringLocation> env) {
		ReferencingLocation[] refs = container.getContainedRefs();
		for (ReferencingLocation ref : refs) {
			String name = ref.getName();
			if (env.binds(name)) ref.setDeclaringLocation(env.lookup(name));
		}
		return env;
	}

	public static <T> T[] concatenate(T[] a, T[] b) {
		int aLen = a.length;
		int bLen = b.length;

		@SuppressWarnings("unchecked")
		T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);

		return c;
	}

	public static void DV(AST[] asts, HashSet<String> vars) {
		for (AST ast : asts)
			ast.DV(vars);
	}

	public static AST find(Predicate<AST> pred, Object value) {

		// Walk the AST and apply the supplied predicate to each node top-down.
		// If the predicate is satisfied then the AST is returned.

		if (value == null) return null;
		if (value.getClass().isArray()) {
			Object[] a = (Object[]) value;
			for (Object x : a) {
				AST ast = find(pred, x);
				if (ast != null) return ast;
			}
		} else {
			if (value instanceof AST) {
				AST ast = (AST) value;
				if (pred.test(ast)) return ast;
			}
			if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
				BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
				String[] fields = c.fields();
				for (String field : fields) {
					try {
						Field f = value.getClass().getField(field);
						Object fieldValue = f.get(value);
						AST ast = find(pred, fieldValue);
						if (ast != null) { return ast; }
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace(System.err);
					}
				}
			}
		}
		return null;
	}

	public static Located getLocated(Object value, int charIndex) {

		// Given a char index into some source code, this operation will walk
		// an AST and return the most specific node whose start and end text
		// position includes the charIndex.

		if (value == null) return null;
		if (value.getClass().isArray()) {
			Object[] a = (Object[]) value;
			for (Object x : a) {
				Located located = getLocated(x, charIndex);
				if (located != null) return located;
			}
		} else {
			if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
				BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
				String[] fields = c.fields();
				for (String field : fields) {
					try {
						Field f = value.getClass().getField(field);
						Object fieldValue = f.get(value);
						Located located = getLocated(fieldValue, charIndex);
						if (located != null) { return located; }
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace(System.err);
					}
				}
			}
		}
		if (value instanceof Located) {
			Located located = (Located) value;
			if (located.getLineStart() == 0 && located.getLineEnd() == 0) System.err.println("Warning: " + located + " at (0,0)");
			if (charIndex >= located.getLineStart() && charIndex <= located.getLineEnd())
				return located;
			else
				return null;
		} else
			return null;
	}

	public static <T extends Local> T lookup(String name, List<T> locals) {
		if (locals.isNil())
			return null;
		else if (locals.getHead().getName().equals(name))
			return locals.getHead();
		else
			return lookup(name, locals.getTail());
	}

	public static int maxLocals(AST[] asts) {
		int maxLocals = 0;
		for (AST ast : asts)
			maxLocals = Math.max(maxLocals, ast.maxLocals());
		return maxLocals;
	}

	public static int maxLocals(BArm[] arms) {
		int maxLocals = 0;
		for (BArm arm : arms)
			maxLocals = Math.max(maxLocals, arm.maxLocals());
		return maxLocals;
	}

	public static void printTree(Object value, PrintStream out, int indent) {
		if (value == null) {
			for (int i = 0; i < indent; i++)
				out.print(" ");
			out.println("<Null>");
		} else if (value.getClass().isArray()) {
			Object[] a = (Object[]) value;
			for (Object x : a) {
				printTree(x, out, indent);
			}
		} else if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
			BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
			String[] fields = c.fields();
			for (int i = 0; i < indent; i++)
				out.print(" ");
			int charStart = -1;
			int charEnd = -1;
			String charPos = "";
			if (value instanceof Located) {
				Located l = (Located) value;
				charStart = l.getLineStart();
				charEnd = l.getLineEnd();
				charPos = " charStart = " + charStart + " charEnd = " + charEnd;
			}
			out.println("<" + value.getClass().getSimpleName() + charPos + ">");
			for (String field : fields) {
				for (int i = 0; i < indent + 2; i++)
					out.print(" ");
				out.println("<" + field + ">");
				try {
					Field f = value.getClass().getField(field);
					printTree(f.get(value), out, indent + 4);
				} catch (NoSuchFieldException e) {
					e.printStackTrace(out);
				} catch (SecurityException e) {
					e.printStackTrace(out);
				} catch (IllegalArgumentException e) {
					e.printStackTrace(out);
				} catch (IllegalAccessException e) {
					e.printStackTrace(out);
				}
				for (int i = 0; i < indent + 2; i++)
					out.print(" ");
				out.println("</" + field + ">");
			}
			for (int i = 0; i < indent; i++)
				out.print(" ");
			out.println("</" + value.getClass().getSimpleName() + ">");
		} else {
			for (int i = 0; i < indent; i++)
				out.print(" ");
			out.println(value);
		}
	}

	// Return the maximum number of locals needed by the receiver...

	public static String separateWith(Object[] values, String separator) {
		String s = "";
		for (int i = 0; i < values.length; i++) {
			s = s + values[i];
			if (i + 1 < values.length) s = s + separator;
		}
		return s;
	}

	public static void setDefs(Object value, Env<String, DeclaringLocation> env) {

		// This operation is used to decorate an AST with links between referencing
		// locations
		// and the corresponding defining locations. It walks the tree building up an
		// env
		// of defining locations. Each time a referencing location is found the
		// corresponding
		// defining location is looked-up in the env and used to decorate the tree.

		if (value.getClass().isArray()) {
			Object[] a = (Object[]) value;
			for (Object x : a) {
				setDefs(x, env);
			}
		} else {
			if (value instanceof DecContainer) {
				env = addDecs((DecContainer) value, env);
			}
			if (value instanceof RefContainer) {
				env = addRefs((RefContainer) value, env);
			}
			if (value instanceof ReferencingLocation) {
				ReferencingLocation ref = (ReferencingLocation) value;
				String name = ref.getName();
				if (env.binds(name)) ref.setDeclaringLocation(env.lookup(name));
			}
			if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
				BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
				String[] fields = c.fields();
				for (String field : fields) {
					try {
						Field f = value.getClass().getField(field);
						Object fieldValue = f.get(value);
						if (fieldValue != null) setDefs(fieldValue, env);
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace(System.err);
					}
				}
			}
		}
	}

	public static void walk(Consumer<Object> pre, Consumer<Object> post, Object value) {
		if (value != null) {
			if (value.getClass().isArray()) {
				Object[] a = (Object[]) value;
				for (Object x : a) {
					walk(pre, post, x);
				}
			} else {
				pre.accept(value);
				if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
					BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
					String[] fields = c.fields();
					for (String field : fields) {
						try {
							Field f = value.getClass().getField(field);
							Object fieldValue = f.get(value);
							walk(pre, post, fieldValue);
						} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
							System.err.println("Walk error: " + value + " " + value.getClass() + " " + Arrays.toString(fields));
							e.printStackTrace(System.err);
						}
					}
				}
				post.accept(value);
			}
		}
	}

	public static Object asESLValue(Object value) {
		if (value != null) {
			if (value.getClass().isArray()) {
				Object[] a = (Object[]) value;
				Object[] aa = new Object[a.length];
				for (int i = 0; i < a.length; i++) {
					aa[i] = asESLValue(a[i]);
				}
				return List.asList(aa);
			} else {
				String name = value.getClass().getSimpleName();
				if (value instanceof ast.types.Array) name = "ArrayType";
				if (value instanceof ast.types.Record) name = "RecordType";
				if (value instanceof ast.types.Field) name = "FieldType";
				if (value instanceof ast.types.Apply) name = "ApplyType";
				if (value instanceof ast.types.Act) name = "ActType";
				if (value instanceof ast.types.ExtendedAct) name = "ExtendedAct";
				if (value instanceof ast.types.Int) name = "IntType";
				if (value instanceof ast.types.Float) name = "FloatType";
				if (value instanceof ast.types.Str) name = "StrType";
				if (value instanceof ast.types.Bool) name = "BoolType";
				if (value instanceof ast.types.Union) name = "UnionType";
				if (value instanceof ast.types.Term) name = "TermType";
				if (value instanceof ast.types.Table) name = "TableType";
				if (value instanceof ast.types.Observer) name = "ObserverType";
				if (value instanceof ast.types.Observed) name = "ObservedType";
				if (value instanceof ast.types.Var) name = "VarType";
				if (value instanceof ast.types.Rec) name = "RecType";
				if (value instanceof ast.types.List) name = "ListType";
				if (value instanceof ast.types.Set) name = "SetType";
				if (value instanceof ast.types.Bag) name = "BagType";
				if (value instanceof ast.types.Unfold) name = "UnfoldType";
				if (value instanceof ast.types.Null) name = "NullType";
				if (value instanceof ast.types.Void) name = "VoidType";
				if (value instanceof ast.types.Fun) name = "FunType";
				if (value instanceof ast.types.TaggedFun) name = "TaggedFunType";
				if (value instanceof ast.types.Forall) name = "ForallType";
				if (value instanceof ast.data.Null) name = "NullExp";
				if (value instanceof ApplyType) name = "ApplyTypeExp";
				if (value instanceof ast.data.Fun) name = "FunExp";
				if (value instanceof ast.data.Int) name = "IntExp";
				if (value instanceof ast.data.Float) { return floatValue((ast.data.Float) value); }
				if (value instanceof ast.data.Str) name = "StrExp";
				if (value instanceof ast.lists.Set) name = "SetExp";
				if (value instanceof ast.lists.Bag) name = "BagExp";
				if (value instanceof ast.data.Bool) name = "BoolExp";
				if (value instanceof ast.actors.Act) name = "ActExp";
				if (value instanceof ast.types.Field) {
					ast.types.Field field = (ast.types.Field) value;
					return asESLValue(field.asDec());
				} else if (value instanceof Key) {
					Key k = (Key) value;
					return k.getString();
				} else if (value instanceof Spec) {
					return "SPEC";
				} else if (value instanceof Import) {
					Import i = (Import) value;
					return i.name;
				} else if (value instanceof Imports) {
					Imports i = (Imports) value;
					return asESLValue(i.getImports());
				} else if (value instanceof ExportedName) {
					ExportedName exportedName = (ExportedName) value;
					return exportedName.name;
				} else if (value instanceof Export) {
					Export export = (Export) value;
					return asESLValue(export.names);
				} else {
					if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
						BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
						String[] fields = c.fields();
						boolean located = value instanceof Located;
						int length = fields.length + (located ? 1 : 0);
						Object[] elements = new Object[length];
						int start = 0;
						int end = 0;
						if (located) {
							Located l = (Located) value;
							start = l.getLineStart();
							end = l.getLineEnd();
							elements[0] = new Term(Key.getKey("Pos"), start, end);
						}
						for (int i = 0; i < fields.length; i++) {
							String field = fields[i];
							try {
								Field f = value.getClass().getField(field);
								Object fieldValue = f.get(value);
								elements[i + (located ? 1 : 0)] = asESLValue(fieldValue);
							} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
								System.err.println("Walk error: " + value + " " + value.getClass() + " " + Arrays.toString(fields));
								e.printStackTrace(System.err);
							}
						}
						return new Term(Key.getKey(name), elements);
					} else
						return value;
				}
			}
		} else
			return null;
	}

	private static Object floatValue(Float f) {
		int pre = f.n;
		int post = f.m;
		double d = Double.parseDouble(pre + "." + post);
		Term loc = new Term(Key.getKey("Pos"), f.getLineStart(), f.getLineEnd());
		return new Term("FloatExp", loc, d);
	}

	public static AST makeInvisible(AST l) {
		l.setLineStart(Integer.MAX_VALUE);
		l.setLineEnd(Integer.MAX_VALUE);
		return l;
	}

	private int		lineStart	= -1;

	private int		lineEnd		= -1;

	private Type	type;

	public AST() {
	}

	public AST(int lineStart, int lineEnd) {
		setLineStart(lineStart);
		setLineEnd(lineEnd);
	}

	public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast);

	public abstract void DV(HashSet<String> vars);

	public abstract void FV(HashSet<String> vars);

	public int getLineEnd() {
		return lineEnd;
	}

	public int getLineStart() {
		return lineStart;
	}

	public Type getType() {
		return type;
	}

	public abstract int maxLocals();

	public AST printExp(AST value) {
		return new Apply(getLineStart(), getLineEnd(), "", new Var(getLineStart(), getLineEnd(), "print", null, null), value);
	}

	public void setLineEnd(int l) {
		lineEnd = l;
	}

	public void setLineStart(int l) {
		lineStart = l;
	}

	public abstract void setPath(String path);

	public void setType(Type type) {
		this.type = type;
	}

	public abstract AST subst(AST ast, String name);

	public AST[] subst(AST[] a, AST ast, String name) {
		AST[] b = new AST[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i].subst(ast, name);
		return b;
	}

	public AST substExportedValues(Collection<Module> modules) {
		AST ast = this;
		for (Module module : modules) {
			for (Key exported : toKeys(module.getExports().getStrings())) {
				ast = ast.subst(new Ref(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), module.getName(), null, null), exported), exported.getString());
			}
		}
		return ast;
	}

	private Key[] toKeys(String[] strings) {
		Key[] keys = new Key[strings.length];
		for (int i = 0; i < strings.length; i++)
			keys[i] = Key.getKey(strings[i]);
		return keys;
	}

	public abstract Type type(Env<String, Type> env);

	private static String maxLength(String string, int i) {
		return string.substring(0, Math.min(string.length() - 1, i));
	}

}
