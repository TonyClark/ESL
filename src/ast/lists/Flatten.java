package ast.lists;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import list.List;
import runtime.functions.CodeBox;

public class Flatten extends AST {

	AST value;

	public Flatten(AST value) {
		this.value = value;
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		value.compile(locals, dynamics, code, false);
		code.add(new instrs.ops.Flatten(getLineStart()), locals, dynamics);
	}

	public void FV(HashSet<String> vars) {
		value.FV(vars);
	}

	public void DV(HashSet<String> vars) {
		value.DV(vars);
	}

	public int maxLocals() {
		return value.maxLocals();
	}

	public AST subst(AST ast, String name) {
		return new Flatten(value.subst(ast, name));
	}

	public String toString() {
		return "Flatten(" + value + ")";
	}

	public void setPath(String path) {
		value.setPath(path);
	}

	public Type type(Env<String, Type> env) {
		Type type = value.type(env);
		if (type instanceof ast.types.List) {
			ast.types.List list = (ast.types.List) type;
			if (list.getType() instanceof ast.types.List) {
				list = (ast.types.List) list.getType();
				setType(list);
				return getType();
			} else
				throw new TypeError(getLineStart(), getLineEnd(), "expecting a list type " + list.getType());
		} else
			throw new TypeError(getLineStart(), getLineEnd(), "expecting a list type " + type);
	}

	public String getLabel() {
		return "flatten :: " + getType();
	}

}
