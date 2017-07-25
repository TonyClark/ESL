package ast.query.body;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.query.instrs.Instr;
import ast.query.value.Var;
import ast.types.Type;
import env.Env;
import values.Located;

public abstract class BodyElement implements Located {

  private int lineStart = -1;
  private int lineEnd   = -1;

  public BodyElement() {
  }

  public BodyElement(int lineStart, int lineEnd) {
    super();
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
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

  public abstract BodyElement subst(Type type, String typeName);

  public abstract void getContainedDecs(Hashtable<String, DeclaringLocation> decs);

  public abstract void compile(Vector<Instr> code, int length, Vector<String> vars, boolean isLast);

  public abstract void vars(HashSet<String> vars);
  
  public static void vars(BodyElement[] elements,HashSet<String> vars) {
    for(BodyElement element : elements)
      element.vars(vars);
  }

}
