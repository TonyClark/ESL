package ast.monitors.rules;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.general.AST;
import ast.types.Monitor;
import ast.types.Term;
import ast.types.Type;
import ast.types.Union;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.functions.CodeBox;
import runtime.network.Network;
import values.Located;
import values.LocationContainer;

@BoaConstructor(fields = { "type", "rules" })

public class Rules extends AST implements LocationContainer, Located {

  public Type    type;
  public Rule[]  rules;

  public Rules() {
  }

  public Rules(Type type, Rule[] rules) {
    this.type = type;
    this.rules = rules;
  }

  public String getLabel() {
    return toString();
  }

  public String toString() {
    return "Rules(" + type + "," + Arrays.toString(rules) + ")";
  }

  public Located getLocated(int charIndex) {
    return AST.getLocated(this, charIndex);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // A collection of monitoring rules are transformed into a term:
    // $Monitor([$Rule(name,priority,[term,...],condition,$action([name,...],fun(name,...) exp)),...])
    // The compilation process identifies the bound-variables that are explicitly listed in the
    // action and the function arguments. At run-time the MONITOR instruction transforms the term
    // back into a collection of rules and compiles it into a network.

    asTerm().compile(locals, dynamics, code, isLast);
    code.add(new instrs.data.Monitor(getLineStart()), locals, dynamics);
  }

  private AST asTerm() {
    AST[] ruleTerms = new AST[rules.length];
    for (int i = 0; i < rules.length; i++) {
      ruleTerms[i] = rules[i].asTerm();
    }
    return new ast.data.Term(0, 0, "$Monitor", null, ruleTerms);
  }

  public void addToNetwork() {
    for (Rule rule : rules) {
      rule.addToNetwork();
    }
  }

  public void DV(HashSet<String> vars) {
    for (Rule rule : rules)
      rule.DV(vars);
  }

  public void FV(HashSet<String> vars) {
    for (Rule rule : rules)
      rule.FV(vars);
  }

  public int maxLocals() {
    return 0;
  }

  public void setPath(String path) {

  }

  public AST subst(AST ast, String name) {
    // System.out.println("Rules.subst " + name + " " + ast);
    return this;
  }

  public Type type(Env<String, Type> env) {
    setType(new ast.types.Monitor(getLineStart(), getLineEnd(), type));
    for (Rule rule : rules) {
      rule.type(env);
    }
    return getType();
  }

  public static Rules inflate(runtime.data.Term term) {
    Object[] values = term.getValues();
    Rule[] rules = new Rule[values.length];
    for (int i = 0; i < values.length; i++) {
      runtime.data.Term rule = (runtime.data.Term) values[i];
      rules[i] = inflateRule(rule);
    }
    return new Rules(null, rules);
  }

  private static Rule inflateRule(runtime.data.Term rule) {
    Object[] values = rule.getValues();
    String name = (String) values[0];
    int priority = (int) values[1];
    List patternTerms = (List) values[2];
    PTerm[] patterns = new PTerm[patternTerms.length()];
    int i = 0;
    while (!patternTerms.isNil()) {
      patterns[i++] = (PTerm) inflatePattern((runtime.data.Term) patternTerms.getHead());
      patternTerms = patternTerms.getTail();
    }
    runtime.data.Term conditionTerm = (runtime.data.Term) values[3];
    Condition condition = inflateCondition(conditionTerm);
    List argNames = (List) values[4];
    String[] names = Arrays.copyOf(argNames.asArray(), argNames.length(), String[].class);
    runtime.functions.Closure action = (runtime.functions.Closure) values[5];
    return new Rule(name, priority, patterns, condition, names, action);
  }

  private static Condition inflateCondition(runtime.data.Term term) {
    String name = term.getName().getString();
    if (name.equals("$And")) return new And(inflateCondition((runtime.data.Term) term.getValues()[0]), inflateCondition((runtime.data.Term) term.getValues()[1]));
    if (name.equals("$BinRel")) return new BinRel((String) (term.getValues()[0]), inflateExp((runtime.data.Term) term.getValues()[1]), inflateExp((runtime.data.Term) term.getValues()[2]));
    if (name.equals("$True")) return new True();
    throw new Error("unknown type of condition term: " + term);
  }

  private static Exp inflateExp(runtime.data.Term term) {
    String name = term.getName().getString();
    if (name.equals("$Var")) return new EVar((String) term.getValues()[0]);
    if (name.equals("$Int")) return new Int((int) term.getValues()[0]);
    throw new Error("unknown type of exp term: " + term);
  }

  private static Pattern inflatePattern(runtime.data.Term term) {
    String name = term.getName().getString();
    if (name.equals("$Int")) return new PInt((int) term.getValues()[0]);
    if (name.equals("$Str")) return new PStr((String) term.getValues()[0]);
    if (name.equals("$Var")) return new PVar((String) term.getValues()[0]);
    if (name.equals("$Const")) return new PConst(term.getValues()[0]);
    if (name.equals("$Term")) {
      String functor = (String) term.getValues()[0];
      List args = (List) term.getValues()[1];
      Pattern[] ps = new Pattern[args.length()];
      int i = 0;
      while (!args.isNil()) {
        ps[i++] = inflatePattern((runtime.data.Term) args.getHead());
        args = args.getTail();
      }
      return new PTerm(functor, ps);
    }
    throw new Error("unknown type of patterm term: " + term);
  }

}
