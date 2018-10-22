package ast.monitors.rules;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.binding.Dec;
import ast.data.Fun;
import ast.general.AST;
import ast.lists.List;
import ast.monitors.code.VarTable;
import ast.types.Term;
import ast.types.Type;
import env.Env;
import exp.BoaConstructor;
import runtime.network.Action;
import runtime.network.Alpha;
import runtime.network.Beta;
import runtime.network.Epsilon;
import runtime.network.NegBeta;
import runtime.network.Network;

@BoaConstructor(fields = { "name", "priority", "patterns", "condition", "exp" })
public class Rule {

  public String                    name;
  public PTerm[]                   patterns;
  public Condition                 condition;
  public int                       priority = 0;
  public AST                       exp;
  public String[]                  argNames;
  public runtime.functions.Closure action;

  public Rule() {
  }

  public Rule(String name, int priority, Condition condition, PTerm... patterns) {
    super();
    this.name = name;
    this.priority = priority;
    this.patterns = patterns;
    this.condition = condition;
  }

  public Rule(String name, int priority, PTerm[] patterns, Condition condition, String[] argNames, runtime.functions.Closure action) {
    super();
    this.name = name;
    this.priority = priority;
    this.patterns = patterns;
    this.condition = condition;
    this.argNames = argNames;
    this.action = action;
  }

  public String toString() {
    return "Rule(" + name + "," + priority + "," + Arrays.toString(patterns) + "," + condition + "," + action + ")";
  }

  public void addToNetwork() {

    // Turn each of the patterns into alpha nodes.
    Vector<Alpha> alpha = new Vector<Alpha>();
    for (int i = 0; i < patterns.length; i++) {
      PTerm term = patterns[i];
      alpha.add(term.getAlpha(i));
    }
    // Fold the alpha-nodes and combine with beta-nodes
    Beta finalBeta = processAlpha(alpha);
    finalBeta.add(new Action(name, argNames, action));
    for (Alpha a : alpha) {
      Network.getNetwork().add(a);
    }
  }

  private Beta processAlpha(Vector<Alpha> alpha) {
    if (alpha.size() == 1)
      return processSingleAlpha(alpha.get(0));
    else {
      if (isNot(patterns[1])) {
        PTerm negated = notTerm(patterns[1]);
        Beta beta = new NegBeta();
        Alpha left = alpha.get(0);
        Alpha right = alpha.get(1);
        VarTable table1 = patterns[0].getVarPaths().unwrap();
        VarTable table2 = negated.getVarPaths().unwrap();
        beta.addVarChecks(table1, table2);
        left.setLeft(beta);
        right.setRight(beta);
        return processAlpha(alpha, 2, beta, table1);
      } else {
        Beta beta = new Beta();
        Alpha left = alpha.get(0);
        Alpha right = alpha.get(1);
        VarTable table1 = patterns[0].getVarPaths().unwrap();
        VarTable table2 = patterns[1].getVarPaths().unwrap();
        beta.addVarChecks(table1, table2);
        left.setLeft(beta);
        right.setRight(beta);
        return processAlpha(alpha, 2, beta, table1.fork(table2));
      }
    }
  }

  private PTerm notTerm(PTerm term) {
    return (PTerm) term.getPatterns()[0];
  }

  private boolean isNot(PTerm term) {
    return term.getName().equals("$NOT");
  }

  private Beta processSingleAlpha(Alpha alpha) {
    Beta beta = new Epsilon();
    beta.setCondition(condition);
    beta.setVars(patterns[0].getVarPaths().unwrap());
    alpha.setLeft(beta);
    return beta;
  }

  private Beta processAlpha(Vector<Alpha> alpha, int i, Beta beta, VarTable leftTable) {
    if (i == alpha.size()) {
      beta.setCondition(condition);
      beta.setVars(leftTable);
      return beta;
    } else {
      VarTable rightTable = patterns[i].getVarPaths().unwrap();
      Beta newBeta = new Beta();
      alpha.get(i).setRight(newBeta);
      newBeta.addVarChecks(leftTable, rightTable);
      beta.setLeft(newBeta);
      return processAlpha(alpha, i + 1, newBeta, leftTable.fork(rightTable));
    }
  }

  public void type(Vector<Term> terms, Env<String, Type> env) {
    for (PTerm term : patterns) {
      terms.add((Term) term.type(env));
    }
    for (Dec dec : actionArgs()) {
      env = env.bind(dec.getName(), dec.getDeclaredType());
    }
    exp.type(env);
  }

  public AST asTerm() {
    AST[] args = new AST[patterns.length];
    for (int i = 0; i < patterns.length; i++)
      args[i] = patterns[i].asTerm();
    AST boolExp = condition.asTerm();
    AST actionFun = actionFun();
    AST actionArgNames = actionArgNames();
    return new ast.data.Term(0, 0, "$Rule", null, new AST[] { new ast.data.Str(name), new ast.data.Int(priority), new List(0, 0, args), boolExp, actionArgNames, actionFun });
  }

  private AST actionArgNames() {
    Dec[] actionArgs = actionArgs();
    AST[] actionArgNames = new AST[actionArgs.length];
    for (int i = 0; i < actionArgs.length; i++) {
      actionArgNames[i] = new ast.data.Str(actionArgs[i].name);
    }
    return new List(0, 0, actionArgNames);
  }

  public AST actionFun() {
    // Create a function where the arguments are the variables bound by the terms...
    return new Fun(0, 0, "", new ast.data.Str(name), actionArgs(), ast.types.Void.VOID, exp, false);
  }

  private Dec[] actionArgs() {
    Vector<Dec> decs = new Vector<Dec>();
    for (Pattern p : patterns)
      p.addDecs(decs);
    return decs.toArray(new Dec[decs.size()]);
  }

  public void type(Env<String, Type> env) {
    for (Dec dec : actionArgs()) {
      env = env.bind(dec.getName(), dec.getDeclaredType());
    }
    exp.type(env);
  }

  public void DV(HashSet<String> vars) {
    FV(vars);
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> free = new HashSet<String>();
    HashSet<String> bound = new HashSet<String>();
    exp.FV(free);
    for (Dec d : actionArgs()) {
      bound.add(d.name);
    }
    free.removeAll(bound);
    vars.addAll(free);
  }
}