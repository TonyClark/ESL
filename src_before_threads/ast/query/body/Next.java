package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "elements" })
public class Next extends BodyElement {

  public BodyElement[] elements;

  public Next() {
  }

  public Next(int lineStart, int lineEnd, BodyElement[] elements) {
    super(lineStart, lineEnd);
    this.elements = elements;
  }

  public BodyElement subst(Type type, String typeName) {
    BodyElement[] newElements = new BodyElement[elements.length];
    for (int i = 0; i < elements.length; i++) {
      newElements[i] = elements[i].subst(type, typeName);
    }
    return new Next(getLineStart(), getLineEnd(), newElements);
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (BodyElement e : elements)
      e.getContainedDecs(decs);
  }

  public void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast) {
    
    // We would like to be able to compile the body of next so that it can perform last calls.
    // Perhaps we should do NEXT via a stack-frame call so that the advanced time is local
    // to the frame and works properly with backtracking. Needs some thought. In any case, the 
    // following is correct, but less efficient...
    
    code.add(new ast.query.instrs.temporal.Next());
    for (int i = 0; i < elements.length; i++) {
      BodyElement e = elements[i];
      e.compile(code, length, vars, false);
    }
    code.add(new ast.query.instrs.temporal.Prev());
  }

  public void vars(HashSet<String> vars) {
    vars(elements, vars);
  }

}
