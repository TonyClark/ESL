package ast.types;

import java.util.Arrays;
import java.util.HashSet;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "terms" })
public class Union extends Type {

	public Term[] terms;

	public Union() {
	}

	public Union(int lineStart, int lineEnd, Term[] terms) {
		super(lineStart, lineEnd);
		this.terms = terms;
	}

	public String toString() {
		return "union{" + separateWith(terms, ",") + "}";
	}

	public Type substType(Type type, String name) {
		return new Union(getLineStart(), getLineEnd(), substTypeTerms(type, name));
	}

	private Term[] substTypeTerms(Type type, String name) {
		Term[] ts = new Term[terms.length];
		for (int i = 0; i < ts.length; i++) {
			ts[i] = (Term) terms[i].substType(type, name);
		}
		return ts;
	}

	public Term[] getTerms() {
		return terms;
	}

	public void setTerms(Term[] terms) {
		this.terms = terms;
	}

	public boolean includesAll(Union u, Env<String, Type> env) {
		for (int i = 0; i < u.getTerms().length; i++) {
			if (!includes(u.getTerms()[i], env))
				return false;
		}
		return true;
	}

	private boolean includes(Term term, Env<String, Type> env) {
		for (int i = 0; i < terms.length; i++)
			if (Type.equals(terms[i], term, env))
				return true;
		return false;
	}

	public boolean hasCnstr(String name) {
		for (Term term : terms)
			if (term.getName().equals(name))
				return true;
		return false;
	}

	public Cnstr getCnstr(String name) {
		for (Term term : terms)
			if (term.getName().equals(name)) {
				return new Cnstr(getLineStart(), getLineEnd(), term, this);
			}
		return null;
	}

	public void check(Env<String, Type> env) {
		for (Term term : terms)
			term.check(env);
	}

	public void FV(HashSet<String> vars) {
		for (Term term : terms)
			term.FV(vars);
	}

	public boolean contains(Term term1, Env<String, Type> env) {
		for (Term term2 : terms) {
			if (Type.equals(term1, term2, env))
				return true;
		}
		return false;
	}

	public Term getTerm(String name, int arity) {
		for (Term term : terms)
			if (term.getName().equals(name) && term.getArity() == arity)
				return term;
		return null;
	}

}
