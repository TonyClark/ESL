package ast.binding;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import ast.AST;
import ast.data.Fun;
import ast.data.Str;
import ast.modules.Module;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "args", "value", "guard" })

public class FunBind extends Binding {

  public Pattern[] args;
  public AST       guard;

  public FunBind() {
  }

  public FunBind(String name, Pattern[] args, AST value, AST guard) {
    super(name, value);
    this.args = args;
    this.guard = guard;
  }

  public String toString() {
    return "FunBind(" + getName() + "," + Arrays.toString(args) + "," + getValue() + "," + guard + ")";
  }

  public Binding desugar() {
    if (isSimple())
      return desugarSimple();
    else return desugarPattern();
  }

  private Binding desugarPattern() {
    String[] s = new String[args.length];
    AST[] vs = new AST[args.length];
    Pattern[] ws = new Pattern[args.length];
    for (int i = 0; i < args.length; i++) {
      s[i] = "$" + i;
      vs[i] = new Var("$" + i);
      ws[i] = new PWild();
    }
    BArm a1 = new BArm(args, value);
    BArm a2 = new BArm(ws, new ast.control.Error(new Str("ran out of case arms in " + name)));
    return new Binding(name, new Fun(name, s, new Case(vs, new BArm[] { a1, a2 })));
  }

  private Binding desugarSimple() {
    return new Binding(name, new Fun(name, simpleArgs(), value));
  }

  private String[] simpleArgs() {
    String[] s = new String[args.length];
    for (int i = 0; i < args.length; i++)
      s[i] = ((PVar) args[i]).name;
    return s;
  }

  private boolean isSimple() {
    for (Pattern p : args)
      if (!(p instanceof PVar)) return false;
    return true;
  }

  public Binding subst(AST ast, String name) {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : args)
      p.vars(bound);
    if (bound.contains(name))
      return this;
    else return new FunBind(this.name, args, value.subst(ast, name), guard.subst(ast, name));
  }

  public Binding substExportedValues(Collection<Module> values) {
    return new FunBind(name, args, value.substExportedValues(values), guard.substExportedValues(values));
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for(Pattern p : args)
      p.vars(bound);
    value.FV(vars);
    guard.FV(vars);
    vars.removeAll(bound);
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

}
