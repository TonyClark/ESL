package ast.binding;

import ast.types.Term;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeFun;
import ast.types.Union;
import ast.types.UnionRef;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "declaredType", "value" })

public class DataBind extends TypeBind {

	public DataBind() {
	}

	public String toString() {
		return "DataBind(" + getName() + "," + value + ")";
	}

	public boolean isGeneric() {
		return getDeclaredType() instanceof TypeFun;
	}

	public Env<String, Type> bind(Env<String, Type> env) {
		if (isSimple())
			return bindSimple(env);
		else if(isGeneric())
			return bindGeneric(env);
		else throw new TypeError(getLineStart(), getLineEnd(), "data only implemented for simple definitions.");
	}

	private Env<String, Type> bindGeneric(Env<String, Type> env) {
		TypeFun fun = (TypeFun)getDeclaredType();
		String[] args = fun.names;
		Union union = (Union)fun.getType();
		env = env.bind(getName(), fun);
		for (Term t : union.getTerms())
			env = env.bind(t.getName(), new TypeFun(getLineStart(),getLineEnd(),args,new UnionRef(getLineStart(), getLineEnd(), union, t.getName())));
		return env;
	}

	private Env<String, Type> bindSimple(Env<String, Type> env) {
		Union union = (Union) getDeclaredType();
		env = env.bind(getName(), union);
		for (Term t : union.getTerms())
			env = env.bind(t.getName(), new UnionRef(getLineStart(), getLineEnd(), union, t.getName()));
		return env;
	}

	private boolean isSimple() {
		return !isGeneric() && getDeclaredType() instanceof Union;
	}

}
