package ast.query.rules;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import ast.binding.TypeBind;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.query.TypeDec;
import ast.query.body.BodyElement;
import ast.query.body.Call;
import ast.query.value.Int;
import ast.query.value.Nil;
import ast.query.value.Pair;
import ast.query.value.Str;
import ast.query.value.Term;
import ast.query.value.Value;
import ast.types.Rules;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Empty;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;
import values.Located;
import values.LocationContainer;

@BoaConstructor(fields = { "rules", "typeDecs", "typeDefs" })
public class RuleBase extends AST implements LocationContainer, DecContainer, Located {

  public static final Key     print     = Key.getKey("print");
  public static final Key     println   = Key.getKey("println");
  public static final Key     implode   = Key.getKey("implode");
  public static final Key     isInt     = Key.getKey("isInt");
  public static final Key     isStr     = Key.getKey("isStr");
  public static final Key     isVar     = Key.getKey("isVar");
  public static final Key     getString = Key.getKey("getString");
  public static final Key     getInt    = Key.getKey("getInt");
  public static final Key     getBool   = Key.getKey("getBool");
  public static int           indent    = 0;
  private static HashSet<Key> spied     = new HashSet<Key>();

  public static Object asTerm(Object o) {

    // Transform any value that uses BOAConstructors to a value...

    int start = -1;
    int end = -1;
    boolean isLocated = o instanceof Located;
    int locatedOffset = isLocated ? 2 : 0;
    if (isLocated) {
      Located located = (Located) o;
      start = located.getLineStart();
      end = located.getLineEnd();
    }

    if (o == null) return runtime.data.Term.NULL;
    if (o instanceof Key) return ((Key) o).getString();
    if (o instanceof String) return o;
    if (o instanceof Integer) return o;
    // if (o instanceof ast.query.value.Str) return ((ast.query.value.Str) o).getValue();
    if (o instanceof ast.data.Int) return ((ast.data.Int) o).value;
    if (o instanceof ast.data.Str) return ((ast.data.Str) o).value;
    if (o instanceof list.Nil<?>) return o;
    if (o instanceof list.Cons<?>) {
      list.Cons<Object> cons = (list.Cons<Object>) o;
      return new list.Cons<Object>(asTerm(cons.getHead()), (list.List<Object>) asTerm(cons.getTail()));
    }
    if (o instanceof runtime.data.Term) {
      runtime.data.Term term = (runtime.data.Term) o;
      Object[] values = new Object[term.getValues().length];
      for (int i = 0; i < values.length; i++)
        values[i] = asTerm(term.getValues()[i]);
      return new runtime.data.Term(term.getName(), values);
    }
    if (o.getClass().isArray()) {
      list.List<Object> list = new list.Nil<Object>();
      Object[] a = (Object[]) o;
      for (int i = a.length - 1; i >= 0; i--)
        list = new list.Cons<Object>(asTerm(a[i]), list);
      return list;
    } else {
      if (o.getClass().isAnnotationPresent(BoaConstructor.class)) {
        BoaConstructor c = o.getClass().getAnnotation(BoaConstructor.class);
        String[] fields = c.fields();
        Object[] values = new Object[fields.length + locatedOffset];
        if (isLocated) {
          values[0] = start;
          values[1] = end;
        }
        for (int i = 0; i < fields.length; i++) {
          String field = fields[i];
          try {
            Field f = o.getClass().getField(field);
            Object fieldValue = f.get(o);
            values[i + locatedOffset] = asTerm(fieldValue);
          } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace(System.err);
          }
        }
        return new runtime.data.Term(Key.getKey(o.getClass().getSimpleName()), values);
      }
    }
    return runtime.data.Term.NULL;
  }

  public static Value asValue(Object o) {

    // Transform any value that uses BOAConstructors to a value...

    int start = -1;
    int end = -1;
    boolean isLocated = o instanceof Located;
    int locatedOffset = isLocated ? 2 : 0;
    if (isLocated) {
      Located located = (Located) o;
      start = located.getLineStart();
      end = located.getLineEnd();
    }

    if (o == null) return Term.NULL;
    if (o instanceof Key) return new Str(((Key) o).getString());
    if (o instanceof String) return new Str((String) o);
    if (o instanceof Integer) return new Int((Integer) o);
    if (o instanceof Int) {
      Int i = (Int) o;
      return new Term(Key.getKey("Int"), new Int(start), new Int(end), i);
    }
    if (o instanceof Str) {
      Str i = (Str) o;
      return new Term(Key.getKey("Str"), new Int(start), new Int(end), i);
    }
    if (o instanceof ast.query.value.Str) return (ast.query.value.Str) o;
    if (o instanceof ast.data.Int) return new Int(((ast.data.Int) o).value);
    if (o instanceof ast.data.Str) return new Str(((ast.data.Str) o).value);
    if (o instanceof list.Nil<?>) return ast.query.value.Nil.NIL;
    if (o instanceof list.Cons<?>) {
      list.Cons<Object> cons = (list.Cons<Object>) o;
      return new ast.query.value.Pair(asValue(cons.getHead()), asValue(cons.getTail()));
    }
    if (o instanceof runtime.data.Term) {
      runtime.data.Term term = (runtime.data.Term) o;
      Value[] values = new Value[term.getValues().length];
      for (int i = 0; i < values.length; i++)
        values[i] = asValue(term.getValues()[i]);
      return new ast.query.value.Term(term.getName(), values);
    }
    if (o.getClass().isArray()) {
      Value list = Nil.NIL;
      Object[] a = (Object[]) o;
      for (int i = a.length - 1; i >= 0; i--)
        list = new Pair(asValue(a[i]), list);
      return list;
    } else {
      if (o.getClass().isAnnotationPresent(BoaConstructor.class)) {
        BoaConstructor c = o.getClass().getAnnotation(BoaConstructor.class);
        String[] fields = c.fields();
        Value[] values = new Value[fields.length + locatedOffset];
        if (isLocated) {
          values[0] = new Int(start);
          values[1] = new Int(end);
        }
        for (int i = 0; i < fields.length; i++) {
          String field = fields[i];
          try {
            Field f = o.getClass().getField(field);
            Object fieldValue = f.get(o);
            values[i + locatedOffset] = asValue(fieldValue);
          } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace(System.err);
          }
        }
        return new Term(Key.getKey(o.getClass().getSimpleName()), values);
      }
    }
    return Term.NULL;
  }

  public static boolean spied(String name) {
    return spied.contains(Key.getKey(name));
  }

  private AST[]                        imports     = new AST[0];
  public Rule[]                        rules;
  public TypeDec[]                     typeDecs;
  public TypeBind[]                    typeDefs;
  private Hashtable<Key, Vector<Rule>> cache       = null;
  private int                          lineStart   = -1;
  private int                          lineEnd     = -1;
  private ClauseTable                  clauseTable = null;

  public RuleBase() {
  }

  public RuleBase(int lineStart, int lineEnd, Rule[] rules, TypeDec[] typeDecs, TypeBind[] typeDefs) {
    super();
    this.rules = rules;
    this.typeDecs = typeDecs;
    this.typeDefs = typeDefs;
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
  }

  private Value[] asArray(Value list) {
    Value[] a = new Value[length(list)];
    for (int i = 0; i < length(list); i++) {
      Pair p = (Pair) list;
      a[i] = p.getHead();
      list = p.getTail();
    }
    return a;
  }

  private void cache(Rule rule) {
    if (!cache.containsKey(rule.getKey())) cache.put(rule.getKey(), new Vector<Rule>());
    Vector<Rule> rules = cache.get(rule.getKey());
    rules.add(rule);
  }

  public void check() {
    checkAllTypesDefined();
  }

  private void checkAllTypesDefined() {
    for (Rule rule : rules) {
      int decs = 0;
      for (TypeDec dec : typeDecs) {
        if (dec.getDeclaredName() == rule.getKey() && dec.getTypes().length == rule.getArity()) decs++;
      }
      if (decs == 0)
        throw new TypeError(rule.getLineStart(), rule.getLineEnd(), "cannot find type declaration for " + rule.getKey().getString() + "/" + rule.getArity());
      else if (decs > 1) throw new TypeError(rule.getLineStart(), rule.getLineEnd(), "expecting one declaration for " + rule.getKey().getString() + "/" + rule.getArity() + " but found " + decs);
      for (BodyElement element : rule.getBody()) {
        if (element instanceof Call) {
          Call call = (Call) element;
          Key key = call.getCalledName();
          boolean builtin = key == print || key == println || key == isStr || key == isInt || key == isVar;
          if (!builtin) {
            decs = 0;
            for (TypeDec dec : typeDecs) {
              if (dec.getDeclaredName() == key && dec.getTypes().length == call.getArgs().length) decs++;
            }
            if (decs == 0)
              throw new TypeError(call.getLineStart(), call.getLineEnd(), "cannot find type declaration for " + key.getString() + "/" + call.getArgs().length);
            else if (decs > 1) throw new TypeError(call.getLineStart(), call.getLineEnd(), "expecting one declaration for " + key.getString() + "/" + call.getArgs().length + " but found " + decs);
          }
        }
      }
    }
  }

  public ClauseTable compile() {
    if (clauseTable == null) {
      clauseTable = new ClauseTable();
      for (int i = 0; i < rules.length; i++) {
        Rule rule = rules[i];
        boolean isLast = true;
        for (int j = i + 1; j < rules.length; j++) {
          if (rules[j].getName().equals(rule.getName()) && rules[j].getArity() == rule.getArity()) isLast = false;
        }
        boolean isSpied = spied.contains(Key.getKey(rule.getName()));
        rule.compile(clauseTable, isSpied, isLast & !isSpied);
      }
    }
    return clauseTable;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    code.add(new instrs.kb.Rules(getLineStart(), compile()), locals, dynamics);
  }

  private void createCache() {
    cache = new Hashtable<Key, Vector<Rule>>();
    for (Rule rule : rules)
      cache(rule);
  }

  public void DV(HashSet<String> vars) {
  }

  public void FV(HashSet<String> vars) {
  }

  public ClauseTable getClauseTable() {
    return clauseTable;
  }

  public DeclaringLocation[] getContainedDecs() {
    return typeDecs;
  }

  public AST[] getImports() {
    return imports;
  }

  public String getLabel() {
    return toString();
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

  public Rule getRule(String name) {
    for (Rule rule : rules)
      if (rule.getName().equals(name)) return rule;
    return null;
  }

  public Rule[] getRules() {
    return rules;
  }

  public HashSet<Key> getSpied() {
    return spied;
  }

  public TypeDec[] getTypeDecs() {
    return typeDecs;
  }

  public TypeBind[] getTypeDefs() {
    return typeDefs;
  }

  private int length(Value list) {
    if (list instanceof Nil)
      return 0;
    else {
      Pair pair = (Pair) list;
      return 1 + length(pair.getTail());
    }
  }

  public int maxLocals() {
    return 0;
  }

  public RuleBase resolveTypes() {

    // A rule base may have type definitions. Scoping is defined to allow later definitions
    // reference earlier definitions only. This method returns a new rule base containing no
    // type definitions and in which type reference in the receiver have been replaced.

    Rule[] newRules = rules.clone();
    TypeDec[] newDecs = typeDecs.clone();
    for (int i = typeDefs.length - 1; i >= 0; i--) {
      String name = typeDefs[i].getName();
      Type type = typeDefs[i].getDeclaredType();
      for (int j = 0; j < rules.length; j++) {
        newRules[j] = newRules[j].subst(type, name);
      }
      for (int j = 0; j < typeDecs.length; j++) {
        newDecs[j] = newDecs[j].subst(type, name);
      }
    }
    for (TypeDec dec : newDecs) {
      // All types should be replaced...
      dec.check(new Empty<String, Type>());
    }
    return new RuleBase(getLineStart(), getLineEnd(), newRules, newDecs, new TypeBind[] {});
  }

  public void setDefs() {

    // Set value and type variables to point to their establishing
    // definitions...

    Env<String, DeclaringLocation> env = new Empty<String, DeclaringLocation>();
    AST.setDefs(this, env);
  }

  public void setImports(AST[] imports) {
    this.imports = imports;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public void setPath(String path) {
  }

  public void setSpied(HashSet<Key> spied) {
    RuleBase.spied = spied;
  }

  public void spy(Key name) {
    spied.add(name);
  }

  public void spyAll() {
    for (Rule rule : rules)
      spy(Key.getKey(rule.getName()));
  }

  public AST subst(AST ast, String name) {
    return this;
  }

  public String toString() {
    return Arrays.toString(rules);
  }

  public Type type(Env<String, Type> env) {
    RuleBase rules = this;
    for (String name : env.dom()) {
      rules = rules.substType(name, env.lookup(name));
    }
    Query.typeCheck(rules);
    // Now create the type...
    Type[] types = new Type[imports.length];
    for (int i = 0; i < imports.length; i++) {
      AST imported = imports[i];
      imported.type(env);
      if (!(imported.getType() instanceof Rules)) {
        throw new TypeError(getLineStart(), getLineEnd(), "an import should be a rule set: " + imported.getType());
      } else types[i] = imported.getType();
    }
    return new ast.types.Rules(getLineStart(), getLineEnd(), types, typeDecs);
  }

  private RuleBase substType(String name, Type type) {
    return new RuleBase(getLineStart(), getLineEnd(), substTypeRules(name, type), substTypeDecs(name, type), substTypeDefs(name, type));
  }

  private Rule[] substTypeRules(String name, Type type) {
    Rule[] newRules = new Rule[rules.length];
    for (int i = 0; i < rules.length; i++)
      newRules[i] = rules[i].subst(type, name);
    return newRules;
  }

  private TypeBind[] substTypeDefs(String name, Type type) {
    TypeBind[] newDefs = new TypeBind[typeDefs.length];
    for (int i = 0; i < typeDefs.length; i++)
      newDefs[i] = typeDefs[i].substBind(type, name);
    return newDefs;
  }

  private TypeDec[] substTypeDecs(String name, Type type) {
    TypeDec[] newDecs = new TypeDec[typeDecs.length];
    for (int i = 0; i < typeDecs.length; i++)
      newDecs[i] = typeDecs[i].subst(type, name);
    return newDecs;
  }

  public void unspy(Key name) {
    spied.remove(name);
  }

  public void unspyAll() {
    for (Rule rule : rules)
      unspy(Key.getKey(rule.getName()));
  }

}
