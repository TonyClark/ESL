package ast.query.rules;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.query.body.BodyElement;
import ast.query.body.Cut;
import ast.query.instrs.Instr;
import ast.query.instrs.call.Return;
import ast.query.instrs.locals.Local;
import ast.query.value.Value;
import ast.query.value.Var;
import ast.types.Type;
import env.Empty;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;
import values.Located;
import values.LocationContainer;

@BoaConstructor(fields = { "name", "generics", "args", "body" })
public class Rule implements Located, LocationContainer, DeclaringLocation, DecContainer {

  public Key           name;
  public String[]      generics;
  public Value[]       args;
  public BodyElement[] body;

  private int          lineStart = -1;
  private int          lineEnd   = -1;
  private boolean      spied     = false;

  public Rule() {
  }

  public Rule(int lineStart, int lineEnd, boolean spied, Key name, String[] generics, Value[] args, BodyElement[] body) {
    super();
    this.name = name;
    this.generics = generics;
    this.args = args;
    this.body = body;
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
    this.spied = spied;
  }

  public Rule(Key name, Value[] args, BodyElement[] body) {
    super();
    this.name = name;
    this.args = args;
    this.body = body;
  }

  public Value[] getArgs() {
    return args;
  }

  public int getArity() {
    return args.length;
  }

  public BodyElement[] getBody() {
    return body;
  }

  public Key getKey() {
    return name;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public Located getLocated(int charIndex) {
    return AST.getLocated(this, charIndex);
  }

  public String getName() {
    return name.getString();
  }

  public boolean isSpied() {
    return spied;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public void setSpied(boolean spied) {
    this.spied = spied;
  }

  public String toString() {
    return name.getString() + Arrays.toString(args) + " <- " + Arrays.toString(body);
  }

  public Rule subst(Type type, String typeName) {
    BodyElement[] newBody = new BodyElement[body.length];
    for (int i = 0; i < newBody.length; i++) {
      newBody[i] = body[i].subst(type, typeName);
    }
    return new Rule(lineStart, lineEnd, spied, name, generics, args, newBody);
  }

  public DeclaringLocation[] getContainedDecs() {
    Hashtable<String, DeclaringLocation> decs = new Hashtable<String, DeclaringLocation>();
    for (Value arg : args)
      arg.getContainedDecs(decs);
    for (BodyElement element : body)
      element.getContainedDecs(decs);
    return decs.values().toArray(new DeclaringLocation[] {});
  }

  public void compile(ClauseTable table, boolean isSpied, boolean isLast) {
    Clauses clauses = table.getClauses(name);
    Vector<Clause> clauseList = clauses.getClauses(args.length);
    clauseList.add(getClause(isSpied, isLast));
  }

  public Clause getClause(boolean isSpied, boolean isLast) {
    Vector<Instr> code = new Vector<Instr>();
    Vector<String> vars = new Vector<String>();
    for (int i = 0; i < args.length; i++) {
      code.add(new Local(i));
      args[i].compileHead(code, args.length, vars);
    }
    for (int i = 0; i < body.length; i++) {
      isLast = isLast || body[i] instanceof Cut;
      body[i].compile(code, args.length, vars, isLast && i == body.length - 1);
    }
    code.add(new Return());
    return new Clause(name.getString(), args.length, vars.size(), code, isSpied);
  }
}
