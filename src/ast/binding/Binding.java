package ast.binding;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.data.Bool;
import ast.data.Fun;
import ast.data.Str;
import ast.modules.Module;
import ast.patterns.PWild;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.tests.If;
import ast.tests.Case;
import exp.BoaConstructor;

@BoaConstructor(fields = { "name", "value" })

public class Binding {

  private static int checkSameArity(String name, Vector<FunBind> fs) {
    int arity = -1;
    for (FunBind f : fs) {
      if (arity == -1)
        arity = f.args.length;
      else if (f.args.length != arity) throw new java.lang.Error("multiple function definitions of the same name must be the same arity: " + name);
    }
    return arity;
  }

  private static Binding[] desugar(Binding[] bindings) {
    // Any funbindings should be desugared to simple value bindings...
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = bindings[i].desugar();
    return bs;
  }

  private static String getDuplicateName(Binding[] bindings) {
    for (int i = 0; i < bindings.length; i++)
      for (int j = i + 1; j < bindings.length; j++)
        if (bindings[i].getName().equals(bindings[j].getName())) return bindings[i].getName();
    return null;
  }

  private static int getNameOccurrences(Binding[] bindings, String name) {
    int occurrences = 0;
    for (int i = 0; i < bindings.length; i++)
      if (bindings[i].getName().equals(name)) occurrences++;
    return occurrences;
  }

  private static AST merge0ArityFunctions(String name, Vector<FunBind> fs) {

    // The pattern of merge is different for 0-arity functions. All but the
    // last must have guards and they use nested if-expressions...

    return new Fun(name, new String[] {}, merge0ArityFunctions(name, fs, 0));
  }

  private static AST merge0ArityFunctions(String name, Vector<FunBind> fs, int i) {
    if (i == fs.size())
      return new ast.control.Error(new Str("no match for " + name));
    else return new If(fs.get(i).guard, fs.get(i).value, merge0ArityFunctions(name, fs, i + 1));
  }

  private static Binding mergeBinding(Binding[] bindings, String name) {
    Vector<FunBind> fs = new Vector<FunBind>();
    for (Binding b : bindings)
      if (b.getName().equals(name)) if (b instanceof FunBind)
        fs.add((FunBind) b);
      else throw new java.lang.Error("duplicate bindings must be functions: " + name);
    return new Binding(name, mergeFunctions(name, fs));
  }

  public static Binding[] mergeBindings(Binding[] bindings) {

    // Function bindings with the same name are merged to produce
    // a single function definition that uses pattern matching and
    // tests to determine which of the original functions to call.

    String name = getDuplicateName(bindings);
    if (name == null)
      return desugar(bindings);
    else {
      int occurrences = getNameOccurrences(bindings, name);
      Binding[] bs = new Binding[(bindings.length - occurrences) + 1];
      Binding b = mergeBinding(bindings, name);
      int j = 0;
      for (int i = 0; i < bindings.length; i++) {
        if (!bindings[i].getName().equals(name)) bs[j++] = bindings[i];
      }
      bs[bs.length - 1] = b;
      return mergeBindings(bs);
    }
  }

  private static AST mergeFunctions(String name, Vector<FunBind> fs) {

    // Bindings:
    // f(p1,p2,...,pn) = e1 when g1
    // f(q1,q2,...,qn) = e2 when g2
    // become
    // f($1,...,$n) = case $1,...,$n { p1,...,pn ? g1 -> e1; ... _,...,_ -> error('...') }

    int arity = checkSameArity(name, fs);
    if (arity == 0)
      return merge0ArityFunctions(name, fs);
    else {
      String[] args = new String[arity];
      Pattern[] dummies = new Pattern[arity];
      AST[] vars = new AST[arity];
      for (int i = 0; i < arity; i++) {
        args[i] = "$" + i;
        dummies[i] = new PWild();
        vars[i] = new Var("$" + i);
      }
      BArm[] arms = new BArm[fs.size() + 1];
      for (int definition = 0; definition < fs.size(); definition++) {
        Pattern[] patterns = new Pattern[arity];
        for (int arg = 0; arg < arity; arg++)
          patterns[arg] = fs.get(definition).args[arg];
        arms[definition] = new BArm(patterns, fs.get(definition).guard, fs.get(definition).value);
      }
      arms[fs.size()] = new BArm(dummies, Bool.TRUE, new ast.control.Error(new Str("ran out of options for " + name)));
      return new Fun(name, args, new Case(vars, arms));
    }
  }

  public String name;

  public AST    value;

  public Binding() {
  }

  public Binding(String name, AST value) {
    super();
    this.name = name;
    this.value = value;
  }

  public Binding desugar() {
    return this;
  }

  public void DV(HashSet<String> vars) {
    value.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    value.FV(vars);
  }

  public String getName() {
    return name;
  }

  public AST getValue() {
    return value;
  }

  public Binding subst(AST ast, String name) {
    return new Binding(this.name, value.subst(ast, name));
  }

  public Binding substExportedValues(Collection<Module> values) {
    return new Binding(name, value.substExportedValues(values));
  }

  public String toString() {
    return "Binding(" + name + "," + value + ")";
  }

}
