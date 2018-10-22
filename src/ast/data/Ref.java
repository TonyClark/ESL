package ast.data;

import java.util.HashSet;

import ast.binding.Var;
import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "namespace", "name" })
public class Ref extends AST {

	public AST	namespace;
	public Key	name;

	public Ref() {
	}

	public Ref(int lineStart, int lineEnd, AST namespace, Key name) {
		super(lineStart, lineEnd);
		this.namespace = namespace;
		this.name = name;
	}

	public AST getNamespace() {
		return namespace;
	}

	public Key getName() {
		return name;
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		if (isDynamicRef(dynamics))
			compileDynamicRef(locals, dynamics, code, isLast);
		else if (isLocalRef(locals))
			compileLocalRef(locals, dynamics, code, isLast);
		else {
			namespace.compile(locals, dynamics, code, false);
			code.add(new instrs.ops.Ref(getLineStart(), new Key[] { name }), locals, dynamics);
		}
	}

	private void compileDynamicRef(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		AST reffed = reffedElement();
		Var var = (Var) reffed;
		DynamicVar dynamic = lookup(var.getName(), dynamics);
		Key[] keys = getRefKeys();
		code.add(new instrs.ops.DynamicRef(getLineStart(), dynamic.getIndex(), keys), locals, dynamics);
	}

	private void compileLocalRef(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		AST reffed = reffedElement();
		Var var = (Var) reffed;
		FrameVar local = lookup(var.getName(), locals);
		Key[] keys = getRefKeys();
		code.add(new instrs.ops.LocalRef(getLineStart(), local.getIndex(), keys), locals, dynamics);
	}

	private Key[] getRefKeys() {
		int length = pathLength();
		AST ast = this;
		Key[] keys = new Key[length];
		while (ast instanceof Ref) {
			Ref ref = (Ref) ast;
			keys[--length] = ref.name;
			ast = ref.namespace;
		}
		return keys;
	}

	private int pathLength() {
		if (namespace instanceof Ref) {
			Ref ref = (Ref) namespace;
			return ref.pathLength() + 1;
		} else
			return 1;
	}

	private boolean isDynamicRef(List<DynamicVar> dynamics) {
		AST reffed = reffedElement();
		if (reffed instanceof Var) {
			Var var = (Var) reffed;
			return lookup(var.getName(), dynamics) != null;
		} else
			return false;
	}

	private boolean isLocalRef(List<FrameVar> locals) {
		AST reffed = reffedElement();
		if (reffed instanceof Var) {
			Var var = (Var) reffed;
			return lookup(var.getName(), locals) != null;
		} else
			return false;
	}

	public AST reffedElement() {
		if (namespace instanceof Ref) {
			Ref ref = (Ref) namespace;
			return ref.reffedElement();
		} else
			return namespace;
	}

	public void FV(HashSet<String> vars) {
		namespace.FV(vars);
	}

	public void DV(HashSet<String> vars) {
		namespace.DV(vars);
	}

	public int maxLocals() {
		return namespace.maxLocals();
	}

	public AST subst(AST ast, String name) {
		return new Ref(getLineStart(), getLineEnd(), namespace.subst(ast, name), this.name);
	}

	public String toString() {
		return "Ref(" + namespace + "," + name + ")";
	}

	public void setPath(String path) {
		namespace.setPath(path);
	}

	public Type type(Env<String, Type> env) {
		Type type = namespace.type(env).deref(env);
		if (type instanceof ast.types.List) {
			ast.types.List listType = (ast.types.List) type;
			if (listType.getType() instanceof ast.types.Int) {
				if (name.getString().equals("implode"))
					return ast.types.Str.STR;
				else
					throw new TypeError(getLineStart(), getLineEnd(), "unknown field of list: " + name);
			} else
				throw new TypeError(getLineStart(), getLineEnd(), "unknown field of list: " + name);
		}
		if (type instanceof ast.types.Record) {
			ast.types.Record rt = (ast.types.Record) type;
			if (rt.hasField(name.getString())) {
				setType(rt.getField(name.getString()).getType());
				return getType();
			} else
				throw new TypeError(getLineStart(), getLineEnd(), "does not have a field named " + name.getString());
		}
		if (type instanceof ast.types.Act) {
			ast.types.Act act = (ast.types.Act) type;
			if (act.hasField(name.getString())) {
				setType(act.getType(name.getString()));
				return getType();
			} else
				throw new TypeError(getLineStart(), getLineEnd(), "does not have a field named " + name.getString());
		}
		if (type instanceof ast.types.KB) {
			ast.types.KB kb = (ast.types.KB) type;
			setType(kb.getType(name));
			return getType();
		}
		if (type instanceof ast.types.Monitor) {
			ast.types.Monitor mon = (ast.types.Monitor) type;
			setType(mon.getType(name));
			return getType();
		}
		if (type instanceof ast.types.Str) {
			if (name.getString().equals("explode"))
				return new ast.types.List(-1, -1, ast.types.Int.INT);
			else if (name.getString().equals("writeDate"))
				return ast.types.Float.FLOAT;
			else
				throw new TypeError(getLineStart(), getLineEnd(), "does not have a field named " + name.getString());
		}
		throw new TypeError(getLineStart(), getLineEnd(), "expecting a behaviour type or a record: " + namespace + ":" + type);
	}

	public String getLabel() {
		return "ref " + name.getString() + " :: " + getType();
	}

}
