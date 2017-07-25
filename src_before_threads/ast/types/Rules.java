package ast.types;

import java.util.Arrays;

import ast.AST;
import ast.query.TypeDec;
import ast.query.rules.RuleBase;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "imports", "types" })
public class Rules extends Type {

  public static RuleBase setImports(RuleBase rules, AST[] imported) {
    rules.setImports(imported);
    return rules;
  }

  public Type[]    imports;
  public TypeDec[] types;

  public Rules() {
  }

  public Rules(int lineStart, int lineEnd, Type[] imports, TypeDec[] types) {
    super(lineStart, lineEnd);
    this.imports = imports;
    this.types = types;
  }

  public TypeDec[] getTypes() {
    return types;
  }

  public String toString() {
    return "Rules" + Arrays.toString(types);
  }

  public Type substType(Type t, String name) {
    TypeDec[] newDecs = new TypeDec[types.length];
    for (int i = 0; i < newDecs.length; i++)
      newDecs[i] = types[i].subst(t, name);
    return new Rules(getLineStart(), getLineEnd(), imports, newDecs);
  }

  public void check(Env<String, Type> env) {
    for (int i = 0; i < types.length; i++)
      types[i].check(env);
  }

  public boolean containsAllTypes(Rules rules, Env<String, Type> env) {
    for (TypeDec dec : rules.getTypes()) {
      if (!containsType(dec, env)) return false;
    }
    return true;
  }

  private boolean containsType(TypeDec dec1, Env<String, Type> env) {
    for (TypeDec dec2 : types) {
      if (dec1.getName().equals(dec2.getName()) && dec1.getArity() == dec2.getArity()) {
        if (!Type.equals(dec1.getType(), dec2.getType(), env)) return false;
      }
    }
    return true;
  }

  public Type getType(String name, int arity) {
    for (TypeDec dec : types) {
      if (dec.getName().equals(name) && dec.getArity() == arity) return dec.getType();
    }
    return null;
  }

}
