package ast.monitors.rules;

import java.util.Vector;

import ast.binding.Dec;
import ast.general.AST;
import ast.monitors.code.Code;
import ast.monitors.code.Pop;
import ast.monitors.code.VarTable;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name" })

public class PStr extends Pattern {

  public String name;

  public PStr() {
  }

  public PStr(String name) {
    super();
    this.name = name;
  }

  public void compile(Vector<Code> code) {
    code.add(new ast.monitors.code.Str(name));
    code.addElement(new Pop());
  }

  public void addVarPaths(VarTable table) {

  }

  public Type type() {
    return ast.types.Str.STR;
  }

  public Type type(Env<String, Type> env) {
    return type();
  }

  public AST asTerm() {
    return new ast.data.Term(0,0,"$Str",null,new AST[] {new ast.data.Str(name)});
  }

  public void addDecs(Vector<Dec> decs) {
    
  }
  
  public String toString() {
    return "PStr(" + name + ")";
  }

}
