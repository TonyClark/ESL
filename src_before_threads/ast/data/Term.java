package ast.data;

import java.util.Arrays;
import java.util.HashSet;

import ast.AST;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.types.Cnstr;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeFun;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "name", "types", "values" })

public class Term extends AST implements ReferencingLocation {

  public String     name;
  public Type[]     types;
  public AST[]      values;
  DeclaringLocation declaringLocation;

  public Term() {
  }

  public Term(int lineStart, int lineEnd, String name, Type[] types, AST[] values) {
    super(lineStart, lineEnd);
    this.name = name;
    this.types = types;
    this.values = values;
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {
    for (AST value : values)
      value.compile(locals, dynamics, code, false);
    code.add(new instrs.data.Term(getLineStart(), Key.getKey(name), values.length), locals, dynamics);
  }

  public void DV(HashSet<String> vars) {
    DV(values, vars);
  }

  public void FV(HashSet<String> vars) {
    for (AST v : values)
      v.FV(vars);
  }

  public DeclaringLocation getDeclaringLocation() {
    return declaringLocation;
  }

  public String getLabel() {
    return "term " + name + " :: " + getType();
  }

  public boolean isGeneric() {
    return types.length > 0;
  }

  public int maxLocals() {
    return maxLocals(values);
  }

  public void setDeclaringLocation(DeclaringLocation declaringLocation) {
    this.declaringLocation = declaringLocation;
  }

  public void setPath(String path) {
    for (AST value : values)
      value.setPath(path);
  }

  public AST subst(AST ast, String name) {
    return new Term(getLineStart(), getLineEnd(), this.name, types, subst(values, ast, name));
  }

  public String toString() {
    return "Term(" + name + "," + Arrays.toString(values) + ")";
  }

  public Type type(Env<String, Type> env) {
    if (env.binds(name)) {
      // It is a constructor...
      Type type = env.lookup(name);
      if (isGeneric()) {
        // It is a generic constructor...
        if (type instanceof TypeFun) {
          // That worked out OK...
          TypeFun fun = (TypeFun) type;
          if (fun.getNames().length == types.length) {
            // arity OK...
            type = Type.eval(fun.apply(types), env);
            if (type instanceof Cnstr) {
              // Got the constructor...
              Cnstr cnstr = (Cnstr) type;
              Type[] valueTypes = new Type[values.length];
              for (int i = 0; i < valueTypes.length; i++)
                valueTypes[i] = values[i].type(env);
              ast.types.Term expectedType = cnstr.getType();
              ast.types.Term suppliedType = new ast.types.Term(getLineStart(), getLineEnd(), name, valueTypes);
              if (Type.equals(suppliedType, expectedType, env)) {
                // Good to go...
                setType(cnstr.getUnion());
              } else throw new TypeMatchError(getLineStart(), getLineEnd(), suppliedType, expectedType);
            } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a constructor " + name);
          } else throw new TypeError(getLineStart(), getLineEnd(), "arity mismatch " + name);
        } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a generic type: " + name);
      } else {
        // It is a non-generic constructor...
        type = Type.eval(type, env);
        if (type instanceof Cnstr) {
          // We are OK...
          Type[] valueTypes = new Type[values.length];
          for (int i = 0; i < valueTypes.length; i++)
            valueTypes[i] = values[i].type(env);
          Cnstr cnstr = (Cnstr) type;
          ast.types.Term term1 = cnstr.getType();
          ast.types.Term term2 = new ast.types.Term(getLineStart(), getLineEnd(), name, valueTypes);
          if (Type.equals(term1, term2, env)) {
            // Good to go...
            setType(cnstr.getUnion());
          } else {
            // Terms don't match. Try to be specific...
            if (term1.getArity() != term2.getArity())
              throw new TypeError(getLineStart(), getLineEnd(), "term types of different arity: " + term1 + " " + term2);
            else if (!term1.getName().equals(term2.getName()))
              throw new TypeError(getLineStart(), getLineEnd(), "term functors do not match: " + term1 + " " + term2);
            else {
              // Check individual element types...
              for (int i = 0; i < term1.getArity(); i++) {
                if (!Type.equals(term1.getTypes()[i], term2.getTypes()[i], env)) throw new TypeError(getLineStart(), getLineEnd(), "term element " + i + " does not match: " + term1.getTypes()[i] + " " + term2.getTypes()[i]);
              }
              throw new TypeError(getLineStart(), getLineEnd(), "types do not match: " + term1 + " " + term2);
            }

          }
        } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a constructor: " + name);
      }
    } else {
      // Just a term...
      Type[] types = new Type[values.length];
      for (int i = 0; i < values.length; i++)
        types[i] = values[i].type(env);
      setType(new ast.types.Term(getLineStart(), getLineEnd(), name, types));
    }
    return getType();
  }

  public String getName() {
    return name;
  }

}
