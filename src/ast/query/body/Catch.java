package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;

import ast.binding.declarations.DeclaringLocation;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "value", "body" })
public class Catch implements Located {

	public Value					value;
	public BodyElement[]	body;
	int										lineStart	= -1;
	int										lineEnd		= -1;

	public Catch() {
	}

	public Catch(int lineStart, int lineEnd, Value value, BodyElement[] body) {
		this.lineStart = lineStart;
		this.lineEnd = lineEnd;
		this.value = value;
		this.body = body;
	}

	public Value getValue() {
		return value;
	}

	public BodyElement[] getBody() {
		return body;
	}

	public Catch subst(Type type, String typeName) {
		BodyElement[] newElements = new BodyElement[body.length];
		for (int i = 0; i < body.length; i++) {
			newElements[i] = body[i].subst(type, typeName);
		}
		return new Catch(getLineStart(), getLineEnd(), value, newElements);
	}

	public int getLineStart() {
		return lineStart;
	}

	public void setLineStart(int lineStart) {
		this.lineStart = lineStart;
	}

	public int getLineEnd() {
		return lineEnd;
	}

	public void setLineEnd(int lineEnd) {
		this.lineEnd = lineEnd;
	}

	public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
		value.getContainedDecs(decs);
		for(BodyElement element : body)
			element.getContainedDecs(decs);
	}

  public void vars(HashSet<String> vars) {
    BodyElement.vars(body, vars);
    value.vars(vars);
  }

}
