package ast.binding;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Int;
import ast.data.Null;
import ast.data.Str;
import ast.modules.Module;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.If;
import ast.types.Forall;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name", "declaredType", "value" })

public class Binding extends Dec {

	private static int checkSameArity(String name, Vector<FunBind> fs) {
		int arity = -1;
		for (FunBind f : fs) {
			if (arity == -1)
				arity = f.args.length;
			else if (f.args.length != arity) throw new java.lang.Error("multiple function definitions of the same name must be the same arity: " + name);
		}
		return arity;
	}

	private static Binding[] desugar(Binding[] bindings) {
		// Any funbindings should be desugared to simple value bindings...
		Binding[] bs = new Binding[bindings.length];
		for (int i = 0; i < bindings.length; i++)
			bs[i] = bindings[i].desugar();
		return bs;
	}

	private static String getDuplicateName(Binding[] bindings) {
		for (int i = 0; i < bindings.length; i++)
			for (int j = i + 1; j < bindings.length; j++)
				if (bindings[i].getName().equals(bindings[j].getName())) return bindings[i].getName();
		return null;
	}

	private static int getNameOccurrences(Binding[] bindings, String name) {
		int occurrences = 0;
		for (int i = 0; i < bindings.length; i++)
			if (bindings[i].getName().equals(name)) occurrences++;
		return occurrences;
	}

	private static AST merge0ArityFunctions(String name, Vector<FunBind> fs) {

		// The pattern of merge is different for 0-arity functions. All but the
		// last must have guards and they use nested if-expressions...

		return new Fun(fs.get(0).getLineStart(), fs.get(0).getLineEnd(), fs.get(0).getPath(), new Str(name), new Dec[] {}, fs.get(0).getType(),
				merge0ArityFunctions(name, fs, 0));
	}

	private static AST merge0ArityFunctions(String name, Vector<FunBind> fs, int i) {
		if (i == fs.size())
			return new ast.control.Error(fs.get(0).getLineStart(), fs.get(0).getLineEnd(), new Str("no match for " + name));
		else return new If(fs.get(i).getLineStart(), fs.get(i).getLineEnd(), fs.get(i).guard, fs.get(i).body, merge0ArityFunctions(name, fs, i + 1));
	}

	private static Binding mergeBinding(Binding[] bindings, String name) {
		Vector<FunBind> fs = new Vector<FunBind>();
		String path = "";
		Type type = new ast.types.Void();
		int lineStart = 0;
		int lineEnd = 0;
		for (Binding b : bindings) {
			path = b.path;
			type = b.getDeclaredType();
			lineStart = b.getLineStart();
			lineEnd = b.getLineEnd();
			if (b.getName().equals(name)) if (b instanceof FunBind)
				fs.add((FunBind) b);
			else throw new java.lang.Error("duplicate bindings must be functions: " + name);
		}
		return new Binding(lineStart, lineEnd, path, name, type, mergeFunctions(name, fs));
	}

	public static Binding[] mergeBindings(Binding[] bindings) {

		// Function bindings with the same name are merged to produce
		// a single function definition that uses pattern matching and
		// tests to determine which of the original functions to call.

		String name = getDuplicateName(bindings);
		if (name == null)
			return desugar(bindings);
		else {
			int occurrences = getNameOccurrences(bindings, name);
			Binding[] bs = new Binding[(bindings.length - occurrences) + 1];
			Binding b = mergeBinding(bindings, name);
			int j = 0;
			for (int i = 0; i < bindings.length; i++) {
				if (!bindings[i].getName().equals(name)) bs[j++] = bindings[i];
			}
			bs[bs.length - 1] = b;
			return mergeBindings(bs);
		}
	}

	private static AST mergeFunctions(String name, Vector<FunBind> fs) {

		// Bindings:
		// f(p1,p2,...,pn) = e1 when g1
		// f(q1,q2,...,qn) = e2 when g2
		// become
		// f($1,...,$n) = case $1,...,$n { p1,...,pn ? g1 -> e1; ... _,...,_ ->
		// error('...') }

		int arity = checkSameArity(name, fs);
		if (arity == 0)
			return merge0ArityFunctions(name, fs);
		else {
			Dec[] args = new Dec[arity];
			Pattern[] dummies = new Pattern[arity];
			AST[] vars = new AST[arity];
			for (int i = 0; i < arity; i++) {
				args[i] = new Dec(fs.get(i).getLineStart(), fs.get(i).getLineEnd(), fs.get(i).getPath(), "$" + i, ast.types.Void.VOID);
				dummies[i] = new PWild();
				vars[i] = new Var(fs.get(i).getLineStart(), fs.get(i).getLineEnd(), "$" + i, null);
			}
			BArm[] arms = new BArm[fs.size() + 1];
			for (int definition = 0; definition < fs.size(); definition++) {
				Pattern[] patterns = new Pattern[arity];
				for (int arg = 0; arg < arity; arg++)
					patterns[arg] = fs.get(definition).args[arg];
				arms[definition] = new BArm(patterns, fs.get(definition).getGuard(), fs.get(definition).getBody());
			}
			arms[fs.size()] = new BArm(dummies, Bool.TRUE,
					new ast.control.Error(fs.get(0).getLineStart(), fs.get(0).getLineEnd(), new Str("ran out of options for " + name)));
			return new Fun(fs.get(0).getLineStart(), fs.get(0).getLineEnd(), fs.get(0).getPath(), new Str(name), args, fs.get(0).getType(),
					new Case(fs.get(0).getLineStart(), fs.get(0).getLineEnd(), new Dec[] {}, vars, arms));
		}
	}

	public static TypeBind[] typeBindings(Binding[] bindings) {
		// Just return those bindings that define types...
		int tb = 0;
		for (Binding b : bindings)
			if (b.isTypeBinding()) tb++;
		TypeBind[] typeBindings = new TypeBind[tb];
		int i = 0;
		for (Binding b : bindings)
			if (b.isTypeBinding()) typeBindings[i++] = (TypeBind) b;
		return typeBindings;
	}

	public static Env<String, Type> typeBindingsPar(Binding[] bindings, Env<String, Type> env) {

		// Process the bindings in parallel...

		TypeBind[] typeBindings = typeBindings(bindings);
		Binding[] valueBindings = valueBindings(bindings);
		Env<String, Type> env0 = env;

		// Process the type bindings.

		for (TypeBind typeBinding : typeBindings) {
			typeBinding.check(env);
			env = typeBinding.bind(env);
		}

		// Type the values...

		env0 = env;
		for (Binding valueBinding : valueBindings) {
			String name = valueBinding.getName();
			Type dType = valueBinding.getDeclaredType();
			Type vType = valueBinding.type(env0);
			//dType.check(env);
			if (Type.equals(dType, vType, env0))
				env = env.bind(valueBinding.getName(), dType);
			else throw new TypeError(valueBinding.getLineStart(), valueBinding.getLineEnd(),
					"declared type for " + name + " does not match the type of the value: " + vType);
		}

		return env;
	}

	public static Env<String, Type> typeBindingsRec(Binding[] bindings, Env<String, Type> env) {

		// Process the bindings recursively...

		TypeBind[] typeBindings = typeBindings(bindings);
		Binding[] valueBindings = valueBindings(bindings);

		// Process the type bindings.

		for (TypeBind typeBinding : typeBindings) {
			env = typeBinding.bind(env);
		}

		for (TypeBind typeBinding : typeBindings) {
			typeBinding.check(env);
		}

		// Add in the declared types to support mutual recursion...

		for (Binding valueBinding : valueBindings) {
			String name = valueBinding.getName();
			Type dType = valueBinding.getDeclaredType();
			env = env.bind(name, dType);
		}

		for (Binding valueBinding : valueBindings) {
			String name = valueBinding.getName();
			Type dType = valueBinding.getDeclaredType();
			//dType.check(env);
			Type vType = valueBinding.type(env);
			if (!Type.equals(dType, vType, env)) throw new TypeError(valueBinding.getLineStart(), valueBinding.getLineEnd(),
					"declared type for " + name + " does not match the type of the value: " + vType);
		}

		// Type the values...

		for (Binding valueBinding : valueBindings) {
			valueBinding.type(env);
		}

		return env;
	}

	public static Binding[] valueBindings(Binding[] bindings) {
		// Just return those bindings that define values (e.g. not types)...
		int vb = 0;
		for (Binding b : bindings)
			if (b.isValueBinding()) vb++;
		Binding[] valueBindings = new Binding[vb];
		int i = 0;
		for (Binding b : bindings)
			if (b.isValueBinding()) valueBindings[i++] = b;
		return valueBindings;
	}

	public AST value;

	public Binding() {
	}

	public Binding(int lineStart, int lineEnd, String path, String name, Type declaredType, AST value) {
		super(lineStart, lineEnd, path, name, declaredType);
		this.value = value;
	}

	public Binding desugar() {
		return this;
	}

	public void DV(HashSet<String> vars) {
		value.DV(vars);
	}

	public void FV(HashSet<String> vars) {
		value.FV(vars);
	}

	public String getLabel() {
		if (isType())
			return "type " + name + " = " + value;
		else if (isSimpleValue())
			return "value " + name + " :: " + getType() + " = " + value;
		else return super.getLabel();
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}

	public AST getValue() {
		return value;
	}

	private boolean isSimpleValue() {
		return value instanceof Int || value instanceof Bool || value instanceof Str || value instanceof ast.data.Float || value instanceof Null;
	}

	private boolean isType() {
		return value instanceof Type;
	}

	public boolean isTypeBinding() {
		return value instanceof Type;
	}

	public boolean isValueBinding() {
		return !(value instanceof Type);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPath(String path) {
		this.path = path;
		value.setPath(path);
	}

	public void setValue(AST value) {
		this.value = value;
	}

	public Binding subst(AST ast, String name) {
		return new Binding(getLineStart(), getLineEnd(), path, this.name, getDeclaredType(), value.subst(ast, name));
	}

	public Binding substExportedValues(Collection<Module> values) {
		return new Binding(getLineStart(), getLineEnd(), path, name, getDeclaredType(), value.substExportedValues(values));
	}

	public String toString() {
		return "Binding(" + name + "," + value + ")";
	}

	public Type type(Env<String, Type> env) {
		Type declaredType = getDeclaredType();
		Type actualType = getValue().type(env);
		if (Type.equals(declaredType, actualType, env)) {
			setType(declaredType);
			return getType();
		}
		else throw new TypeError(declaredType.getLineStart(), declaredType.getLineEnd(),
				name + " is declared to be of type " + declaredType + " but its value is of type " + actualType);
	}

}
