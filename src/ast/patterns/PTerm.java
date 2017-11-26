package ast.patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import ast.binding.declarations.DeclaringLocation;
import ast.general.AST;
import ast.refs.Ref;
import ast.types.Cnstr;
import ast.types.Term;
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

@BoaConstructor(fields = { "name", "types", "patterns" })

public class PTerm extends Pattern {

  public String    name;
  public Type[]    types;
  public Pattern[] patterns;

  public PTerm() {
  }

  public String getName() {
    return name;
  }

  public Pattern[] getPatterns() {
    return patterns;
  }

  public String toString() {
    return "PTerm(" + name + "," + Arrays.toString(patterns) + ")";
  }

  public void vars(HashSet<String> vars) {
    for (Pattern p : patterns)
      p.vars(vars);
  }

  public void bound(Vector<String> vars) {
    for (Pattern p : patterns)
      p.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    code.add(new instrs.patterns.isTerm(getLineStart(), ref, Key.getKey(name), patterns.length), locals, dynamics);
    for (int i = 0; i < patterns.length; i++)
      patterns[i].compile(locals, dynamics, new ast.refs.TermRef(ref, i), code);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    if (type instanceof ast.types.Term) {
      ast.types.Term term = (ast.types.Term) type;
      if (term.getName().equals(name) && term.getTypes().length == patterns.length) {
        for (int i = 0; i < patterns.length; i++) {
          env = patterns[i].bind(env, term.getTypes()[i]);
        }
        return env;
      } else return null;
    } else return null;
  }

  public boolean isGeneric() {
    return types.length > 0;
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    Pattern.types(patterns, env, (env1, pTypes) ->
    {
      if (env.binds(name)) {
        // It is a constructor...
        Type type = env.lookup(name);
        if (isGeneric()) {
          // It is a generic constructor...
          if (type instanceof TypeFun) {
            TypeFun fun = (TypeFun) type;
            if (fun.getNames().length == types.length) {
              // arity OK...
              type = Type.eval(fun.apply(types), env);
              if (type instanceof Cnstr) {
                // Got the constructor...
                Cnstr cnstr = (Cnstr) type;
                Term expectedType = cnstr.getType();
                Term suppliedType = new Term(getLineStart(), getLineEnd(), name, pTypes);
                if (Type.equals(suppliedType, expectedType, env)) {
                  // Good to go...
                  setType(cnstr.getUnion());
                } else throw new TypeMatchError(getLineStart(), getLineEnd(), suppliedType, expectedType);
              } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a constructor " + name);
            } else throw new TypeError(getLineStart(), getLineEnd(), "arity mismatch " + name);
          } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a type function " + name);
        } else {
          // It is a non-generic constructor...
          type = Type.eval(type, env);
          if (type instanceof Cnstr) {
            // We are OK...
            Cnstr cnstr = (Cnstr) type;
            Term expectedType = cnstr.getType();
            Term suppliedType = new Term(getLineStart(), getLineEnd(), name, pTypes);
            if (Type.equals(suppliedType, expectedType, env)) {
              // Good to go...
              setType(cnstr.getUnion());
            } else throw new TypeMatchError(getLineStart(), getLineEnd(), suppliedType, expectedType);
          } else throw new TypeError(getLineStart(), getLineEnd(), "expecting a constructor: " + name + ":" + type);
        }
      } else if (isGeneric()) {
        throw new TypeError(getLineStart(), getLineEnd(), "only generic constructors are allowed: " + name);
      } else {
        // It is a non-generic term...
        setType(new ast.types.Term(getLineStart(), getLineEnd(), name, pTypes));
      }
      cont.accept(env1, getType());
    });
  }

  public Type getDeclaredType() {
    Type[] types = new Type[patterns.length];
    for (int i = 0; i < patterns.length; i++)
      types[i] = patterns[i].getDeclaredType();
    return new ast.types.Term(getLineStart(), getLineEnd(), name, types);
  }

  public void processDeclarations(Env<String, Type> env) {
    for (Pattern p : patterns)
      p.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] locs = new DeclaringLocation[] {};
    for (Pattern p : patterns)
      locs = AST.concatenate(locs, p.getContainedDecs());
    return locs;
  }

  public String pprint() {
    String s = name;
    if (patterns.length == 0)
      return s;
    else {
      s = s + "(";
      for (int i = 0; i < patterns.length; i++) {
        s = s + patterns[i].pprint();
        if (i + 1 < patterns.length) s = s + ",";
      }
    }
    return s + ")";
  }

}
