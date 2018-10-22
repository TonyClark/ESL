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

@BoaConstructor(fields = { "array", "index", "value" })
public class ArrayUpdate extends AST {

	public AST	array;
	public AST	index;
	public AST	value;

	public ArrayUpdate() {
	}

	public ArrayUpdate(AST array, AST index, AST value) {
		this.array = array;
		this.index = index;
		this.value = value;
	}

	public String toString() {
		return array + "[" + index + "] := " + value;
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		throw new Error("ESL VM does not support arrays " + this);
	}

	public void FV(HashSet<String> vars) {
		array.FV(vars);
		index.FV(vars);
		value.FV(vars);
	}

	public void DV(HashSet<String> vars) {
		array.DV(vars);
		index.DV(vars);
		value.DV(vars);
	}

	public int maxLocals() {
		return Math.max(array.maxLocals(), Math.max(index.maxLocals(), value.maxLocals()));
	}

	public AST subst(AST ast, String name) {
		return new ArrayUpdate(array.subst(ast, name), index.subst(ast, name), value.subst(ast, name));
	}

	public void setPath(String path) {
	}

	public Type type(Env<String, Type> env) {
		Type type = array.type(env);
		if (type instanceof Array) {
			Array arrayType = (Array) type;
			type = index.type(env);
			if (Type.equals(ast.types.Int.INT, type, env)) {
				Type vType = value.type(env);
				if (Type.equals(vType, arrayType.type, env)) {
					return arrayType;
				} else
					throw new TypeError(getLineStart(), getLineEnd(), "array storage does not match value type");
			} else
				throw new TypeError(getLineStart(), getLineEnd(), "arrays have integer indices: " + index);
		} else
			throw new TypeError(getLineStart(), getLineEnd(), "expecting an array: " + this);
	}

	public String getLabel() {
		return toString();
	}

}
