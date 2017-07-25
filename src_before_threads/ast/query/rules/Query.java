package ast.query.rules;

import java.util.Arrays;

import ast.AST;
import ast.query.QueryError;
import ast.query.body.BodyElement;
import ast.query.body.Call;
import ast.query.body.DBName;
import ast.query.machine.Machine;
import ast.query.value.Int;
import ast.query.value.Term;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.TypeError;
import exp.BoaConstructor;
import history.History;
import runtime.data.Key;
import values.JavaObject;
import values.Located;
import values.LocationContainer;
import xpl.Interpreter;

@BoaConstructor(fields = { "rules", "elements", "value" })

public class Query implements Located, LocationContainer {

  static Machine typeCheckingMachine = null;

  static Machine getTypeCheckingMachine() {
    if (typeCheckingMachine == null) {
      JavaObject o = (JavaObject) Interpreter.readFile("xpl/query.xpl", "query", "esl/query/typeCheck.q", "file", new exp.Str("esl/query/typeCheck.q"));
      RuleBase typeCheckRules = ((Query) o.getTarget()).getRules();
      typeCheckingMachine = new Machine(typeCheckRules.compile(), null);
    }
    return typeCheckingMachine;
  }

  public RuleBase      rules;
  public BodyElement[] elements;
  public Value         value;

  private int          lineStart = -1;
  private int          lineEnd   = -1;

  public Query() {
    super();
  }

  public RuleBase getRules() {
    return rules;
  }

  public BodyElement[] getElements() {
    return elements;
  }

  public Value getValue() {
    return value;
  }

  public static void print(Object[] elements) {
    System.out.println("ARRAY " + Arrays.toString(elements));
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public Object satisfy(History history) {
    Call.setDBNames(new DBName[] { new DBName(Key.getKey("actor"), 3), new DBName(Key.getKey("send"), 4), new DBName(Key.getKey("state"), 4) });
    ClauseTable table = rules.compile();
    Machine machine = new Machine(rules.compile(), history);
    Var var = new Var();
    machine.init(Key.getKey("main"), var);
    return machine.recons(machine.deref(var));
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public Located getLocated(int charIndex) {
    return AST.getLocated(this, charIndex);
  }

  public void check() {
    rules.check();
  }

  public void spy(String name) {
    rules.spy(Key.getKey(name));
  }

  public void spyAll() {
    rules.spyAll();
  }

  public void unspyAll() {
    rules.unspyAll();
  }

  public void unspy(String name) {
    rules.unspy(Key.getKey(name));
  }

  public boolean spied(String name) {
    return RuleBase.spied(name);
  }

  public void typeCheck() {
    typeCheck(getRules());
  }

  public static synchronized void typeCheck(RuleBase rules) {
    try {
      rules = rules.resolveTypes();
      Machine machine = getTypeCheckingMachine();
      Key typeCheck = Key.getKey("typeCheck");
      Var var = new Var();
      machine.init(typeCheck, RuleBase.asTerm(rules), var);
      runtime.data.Term term = (runtime.data.Term) machine.recons(var);
      if (term != null) {
        Object[] values = term.getValues();
        int start = (Integer) values[0];
        int end = (Integer) values[1];
        String message = values[2].toString();
        throw new TypeError(start, end, message);
      }
    } catch (QueryError e) {
      Term term = (Term) e.getValue();
      Value[] values = term.getValues();
      int start = ((Int) values[0]).getValue();
      int end = ((Int) values[1]).getValue();
      String message = values[2].toString();
      throw new TypeError(start, end, message);
    } catch (TypeError te) {
      throw te;
    }
  }

  public void setDefs() {
    rules.setDefs();
  }

}
