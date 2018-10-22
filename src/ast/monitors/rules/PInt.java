package ast.monitors.rules;

import java.util.HashSet;
import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.Pop;
import ast.monitors.code.VarTable;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "value" })
public class PInt extends Pattern {

  public int value;

  public PInt() {
  }

  public PInt(int value) {
    super();
    this.value = value;
  }

  public void compile(Vector<Code> code) {
    code.add(new ast.monitors.code.Int(value));
    code.addElement(new Pop());
  }

  public void addVarPaths(VarTable table) {
  }

  public Type type(Env<String, Type> env) {
    return type();
  }

  public Type type() {
    return ast.types.Int.INT;
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$Int",null,new AST[] {new ast.data.Int(value)});
  }

  public void addDecs(Vector<Dec> decs) {
    
  }
  
  public String toString() {
    return "PInt(" + value + ")";
  }
}
