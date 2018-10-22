package ast.monitors.rules;

import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.Pop;
import ast.monitors.code.VarTable;
import ast.monitors.code.paths.Id;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name","type" })

public class PVar extends Pattern {

  public String name;
  public Type type;

  public PVar() {
  }

  public PVar(String name) {
    super();
    this.name = name;
  }

  public void compile(Vector<Code> code) {
    code.addElement(new Pop());
  }

  public void addVarPaths(VarTable table) {
    table.put(name, new Id());
  }

  public Type type() {
    return type;
  }

  public Type type(Env<String, Type> env) {
    return type.deref(env);
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$Var",null,new AST[] {new ast.data.Str(name)});
  }

  public void addDecs(Vector<Dec> decs) {
    if(!hasDec(name,decs))
      decs.addElement(new Dec(0,0,"",name,type,type));
  }
  
  public String toString() {
    return "PVar(" + name + ")";
  }

}
