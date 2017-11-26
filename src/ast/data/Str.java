package ast.data;

import java.util.HashSet;

import ast.general.AST;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "value" })
public class Str extends AST {

	public static Str strAt0(String value) {
		return new Str(Integer.MIN_VALUE, Integer.MIN_VALUE, value);
	}

	public String value;

	public Str() {
	}

	public Str(String value) {
		this.value = value;
	}

	public Str(int start, int end, String value) {
		super(start, end);
		this.value = value;
	}

	public String toString() {
		return "'" + value + "'";
	}

	public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
		code.add(new instrs.data.Str(getLineStart(), value), locals, dynamics);
	}

	public void FV(HashSet<String> vars) {
	}

	public void DV(HashSet<String> vars) {
	}

	public int maxLocals() {
		return 0;
	}

	public String getValue() {
    return value;
  }

  public AST subst(AST ast, String name) {
		return this;
	}

	public void setPath(String path) {
	}

	public Type type(Env<String, Type> env) {
		setType(ast.types.Str.STR);
		return getType();
	}

	public String getLabel() {
		return value + "";
	}

}
