package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Array;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "type", "length" })
public class NewArray extends AST {

	public Type	type;
	public AST	length;

	public NewArray() {
	}

	public NewArray(Type type, AST length) {
		super();
		this.type = type;
		this.length = length;
	}

	public String toString() {
		return "new Array[" + type + "](" + length + ")";
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		throw new Error("ESL VM does not support arrays");
	}

	public void FV(HashSet<String> vars) {
		length.FV(vars);
	}

	public void DV(HashSet<String> vars) {
		length.DV(vars);
	}

	public int maxLocals() {
		return length.maxLocals();
	}

	public AST subst(AST ast, String name) {
		return new NewArray(type, length.subst(ast, name));
	}

	public void setPath(String path) {
	}

	public Type type(Env<String, Type> env) {
		Type intType = length.type(env);
		if (Type.equals(intType, ast.types.Int.INT, env))
			return new Array(getLineStart(), getLineEnd(), type);
		else
			throw new TypeError(getLineStart(), getLineEnd(), "expecting an integer: " + intType);
	}

	public String getLabel() {
		return toString();
	}

}
