package ast.cmp;

import java.util.HashSet;

import ast.general.AST;
import ast.lists.Map;
import ast.patterns.PVar;
import ast.patterns.Pattern;
import ast.types.Rec;
import ast.types.Type;
import ast.types.TypeError;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "pattern", "exp" })

public class BQual extends Qualifier {

	public Pattern	pattern;
	public AST			exp;

	public BQual() {
	}

	public BQual(int lineStart, int lineEnd) {
		super(lineStart, lineEnd);
	}

	public BQual(int lineStart, int lineEnd, Pattern pattern, AST exp) {
		super(lineStart, lineEnd);
		this.pattern = pattern;
		this.exp = exp;
	}

	public Env<String, Type> bind(Env<String, Type> env) {
		Type type = exp.type(env);
		if (type instanceof Rec) {
			Rec rec = (Rec) type;
			type = rec.unfold();
		}
		if (type instanceof ast.types.List) {
			ast.types.List list = (ast.types.List) type;
			env = pattern.bind(env, Type.eval(list.getType(), env));
			if (env == null)
				throw new TypeError(exp.getLineStart(), exp.getLineEnd(),
				    "pattern does not match expected type " + pattern + " " + list);
			else
				return env;
		} else
			throw new TypeError(exp.getLineStart(), exp.getLineEnd(), "expecting a list type " + exp + "::" + type);
	}

	public AST desugar(AST value) {
		return new Map(getLineStart(), getLineEnd(), "", pattern, exp, value);
	}

	public void FV(HashSet<String> vars) {
		exp.FV(vars);
	}

	public AST getExp() {
		return exp;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPath(String path) {
		exp.setPath(path);
	}

	public String toString() {
		return "BQual(" + pattern + "," + exp + ")";
	}

	public void vars(HashSet<String> vars) {
		pattern.vars(vars);
	}

	public Qualifier subst(AST ast, String name) {
		return new BQual(getLineStart(), getLineEnd(), pattern, exp.subst(ast, name));
	}

	public boolean isSimple() {
		return pattern instanceof PVar;
	}

}
