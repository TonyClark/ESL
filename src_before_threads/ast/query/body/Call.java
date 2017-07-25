package ast.query.body;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.query.instrs.Instr;
import ast.query.instrs.call.Enter;
import ast.query.instrs.call.EnterDB;
import ast.query.instrs.call.EnterLast;
import ast.query.instrs.call.Fact;
import ast.query.instrs.call.StartCall;
import ast.query.instrs.data.IsVar;
import ast.query.instrs.data.LoadDB;
import ast.query.instrs.ops.Println;
import ast.query.instrs.temporal.SystemTime;
import ast.query.value.Value;
import ast.types.Apply;
import ast.types.Forall;
import ast.types.Term;
import ast.types.Type;
import ast.types.TypeFun;
import ast.types.Union;
import exp.BoaConstructor;
import runtime.data.Key;

@BoaConstructor(fields = { "name", "generics", "args" })
public class Call extends BodyElement implements ReferencingLocation {

  static DBName[] DBNames = new DBName[] {};

  public static Type apply(String typeName, TypeFun fun, Type type) {
    // This is required because the type system does not expand applications
    // on substitution...
    if (type instanceof ast.types.Int) return type;
    if (type instanceof ast.types.Str) return type;
    if (type instanceof ast.types.Union) {
      ast.types.Union union = (ast.types.Union) type;
      ast.types.Term[] terms = union.getTerms();
      ast.types.Term[] newTerms = new ast.types.Term[terms.length];
      for (int i = 0; i < terms.length; i++) {
        newTerms[i] = (Term) apply(typeName, fun, terms[i]);
      }
      return new Union(union.getLineStart(), union.getLineEnd(), newTerms);
    }
    if (type instanceof Term) {
      Term term = (Term) type;
      Type[] types = term.getTypes();
      Type[] newTypes = new Type[types.length];
      for (int i = 0; i < types.length; i++) {
        newTypes[i] = apply(typeName, fun, types[i]);
      }
      return new Term(term.getLineStart(), term.getLineEnd(), term.getName(), newTypes);
    }
    if (type instanceof Apply) {
      Apply apply = (Apply) type;
      Type[] types = apply.getTypes();
      Type[] newTypes = new Type[types.length];
      for (int i = 0; i < types.length; i++) {
        newTypes[i] = apply(typeName, fun, types[i]);
      }
      if (apply.getName().equals(typeName)) {
        return fun.apply(newTypes);
      } else return new Apply(apply.getLineStart(), apply.getLineEnd(), apply.getName(), newTypes);
    }
    if (type instanceof Forall) {
      Forall forall = (Forall) type;
      return new Forall(forall.getLineStart(), forall.getLineEnd(), forall.getNames(), apply(typeName, fun, forall.getType()));
    }
    return type;
  }

  public static void setDBNames(DBName[] DBNames) {
    Call.DBNames = DBNames;
  }

  public Key        name;
  public Type[]     generics;
  public Value[]    args;

  DeclaringLocation loc;

  public Call() {
  }

  public Call(int lineStart, int lineEnd, Key name, Type[] generics, Value[] args) {
    super(lineStart, lineEnd);
    this.name = name;
    this.generics = generics;
    this.args = args;
  }

  public void compile(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    if (name.getString().equals("isVar"))
      compileIsVar(code, arity, vars);
    else if (name.getString().equals("println"))
      compilePrintln(code, arity, vars);
    else if (name.getString().equals("systemTime"))
      compileSystemTime(code, arity, vars);
    else if (name.getString().equals("loadDB"))
      compileLoadDB(code, arity, vars);
    else if (name.getString().equals("fact") && args.length == 1)
      compileFact(code, arity, vars);
    else if (isDBName())
      compileDBEntry(code, arity, vars, isLast);
    else {
      code.add(new StartCall());
      for (Value arg : args)
        arg.compile(code, arity, vars);
      if (isLast)
        code.add(new EnterLast(name, args.length));
      else code.addElement(new Enter(name, args.length));
    }
  }

  private void compileDBEntry(Vector<Instr> code, int arity, Vector<String> vars, boolean isLast) {
    code.add(new StartCall());
    for (Value arg : args)
      arg.compile(code, arity, vars);
    code.add(new EnterDB(name, args.length));
  }

  private void compileFact(Vector<Instr> code, int arity, Vector<String> vars) {
    args[0].compile(code, arity, vars);
    code.add(new Fact());
  }

  private void compileIsVar(Vector<Instr> code, int arity, Vector<String> vars) {
    args[0].compileExp(code, arity, vars);
    code.add(new IsVar());
  }

  private void compileLoadDB(Vector<Instr> code, int arity, Vector<String> vars) {
    args[0].compile(code, arity, vars);
    code.add(new LoadDB());
  }

  private void compilePrintln(Vector<Instr> code, int arity, Vector<String> vars) {
    if (args[0].isExp()) {
      args[0].compileExp(code, arity, vars);
    } else args[0].compile(code, arity, vars);
    code.add(new Println());
  }

  private void compileSystemTime(Vector<Instr> code, int arity, Vector<String> vars) {
    args[0].compile(code, arity, vars);
    code.add(new SystemTime());
  }

  public Value[] getArgs() {
    return args;
  }

  public int getArity() {
    return args.length;
  }

  public Key getCalledName() {
    return name;
  }

  public void getContainedDecs(Hashtable<String, DeclaringLocation> decs) {
    for (Value arg : args)
      arg.getContainedDecs(decs);
  }

  public DeclaringLocation getDeclaringLocation() {
    return loc;
  }

  public Type[] getGenerics() {
    return generics;
  }

  public String getName() {
    return name.getString();
  }

  private boolean isDBName() {
    for (DBName n : DBNames)
      if (n.getName() == name && n.getArity() == args.length) return true;
    return false;
  }

  public void setDeclaringLocation(DeclaringLocation loc) {
    this.loc = loc;
  }

  public BodyElement subst(Type type, String typeName) {
    Type[] newTypes = new Type[generics.length];
    for (int i = 0; i < generics.length; i++) {
      newTypes[i] = generics[i].substType(type, typeName);
      if (type instanceof TypeFun) {
        TypeFun fun = (TypeFun) type;
        newTypes[i] = apply(typeName, fun, newTypes[i]);
      }
    }
    return new Call(getLineStart(), getLineEnd(), name, newTypes, args);
  }

  public String toString() {
    return name.getString() + Arrays.toString(generics) + Arrays.toString(args);
  }

  public void vars(HashSet<String> vars) {
    for (Value arg : args) {
      arg.vars(vars);
    }
  }

}
