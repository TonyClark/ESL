package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.temporal.ResetTime;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "elements" })
public class Past extends BodyElement {

	public BodyElement[] elements;

	public Past() {
	}

	public Past(int lineStart, int lineEnd, BodyElement[] elements) {
		super(lineStart, lineEnd);
		this.elements = elements;
	}

	public BodyElement subst(Type type, String typeName) {
		BodyElement[] newElements = new BodyElement[elements.length];
		for (int i = 0; i < elements.length; i++) {
			newElements[i] = elements[i].subst(type, typeName);
		}
		return new Past(getLineStart(), getLineEnd(), newElements);
	}

	public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
		for(BodyElement e : elements) 
			e.getContainedDecs(decs);
	}

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    
    // Saves a time counter and the current code pointer in a special type of
    // fail frame. Uses a local to save the current time so that it is reset when
    // the eventually body succeeds...

    String time = "time" + Math.random();
    vars.add(time);
    code.add(new ast.query.instrs.temporal.Past(vars.indexOf(time) + arity));
    for (BodyElement e : elements)
      e.compile(code, arity, vars, false);
    code.add(new ResetTime(vars.indexOf(time) + arity));
  }

  public void vars(HashSet<String> vars) {
    vars(elements, vars);
  }

}
