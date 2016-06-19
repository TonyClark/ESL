package ast.binding;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import ast.AST;
import ast.data.BinExp;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.lists.List;
import ast.modules.Module;
import ast.patterns.PVar;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.If;
import ast.types.Type;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "args", "type", "value", "guard" })

public class FunBind extends Binding {

  public Pattern[] args;
  public AST       guard;
  public Type      type;

  public FunBind() {
  }

  public FunBind(String path, String name, Pattern[] args, Type type, AST value, AST guard) {
    super(path, name, new ast.types.Void(), value);
    this.args = args;
    this.type = type;
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
    Dec[] s = new Dec[args.length];
    AST[] vs = new AST[args.length];
    Pattern[] ws = new Pattern[args.length];
    for (int i = 0; i < args.length; i++) {
      s[i] = new Dec(path, "$" + i, new ast.types.Void());
      vs[i] = new Var("$" + i);
      ws[i] = new PWild();
    }
    BArm a1 = new BArm(args, guard, value);
    BArm a2 = new BArm(ws, Bool.TRUE, new ast.control.Error(new BinExp(new Str("ran out of case arms in " + name), "+", new List(vs))));
    return new Binding(path, name, new ast.types.Void(), new Fun(path, name, s, type, new Case(vs, new BArm[] { a1, a2 })));
  }

  private Binding desugarSimple() {
    return new Binding(path, name, new ast.types.Void(), new Fun(path, name, simpleArgs(), type, new If(guard, value, new ast.control.Error(new Str("guard failed for " + name)))));
  }

  private Dec[] simpleArgs() {
    Dec[] s = new Dec[args.length];
    for (int i = 0; i < args.length; i++)
      s[i] = new Dec(path, ((PVar) args[i]).name, new ast.types.Void());
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
    else return new FunBind(path, this.name, args, type, value.subst(ast, name), guard.subst(ast, name));
  }

  public Binding substExportedValues(Collection<Module> values) {
    return new FunBind(path, name, args, type, value.substExportedValues(values), guard.substExportedValues(values));
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Pattern p : args)
      p.vars(bound);
    value.FV(vars);
    guard.FV(vars);
    vars.removeAll(bound);
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

}
