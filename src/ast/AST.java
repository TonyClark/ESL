package ast;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import actors.CodeBox;
import actors.Key;
import ast.binding.Var;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.RefContainer;
import ast.binding.declarations.ReferencingLocation;
import ast.data.Apply;
import ast.data.Ref;
import ast.modules.Module;
import ast.tests.BArm;
import ast.types.Type;
import ast.types.Typed;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import env.Env;
import exp.BoaConstructor;
import list.List;
import values.Located;

public abstract class AST implements Located, Typed, TreeNode {

  public static String separateWith(Object[] values, String separator) {
    String s = "";
    for (int i = 0; i < values.length; i++) {
      s = s + values[i];
      if (i + 1 < values.length) s = s + separator;
    }
    return s;
  }

  public static void DV(AST[] asts, HashSet<String> vars) {
    for (AST ast : asts)
      ast.DV(vars);
  }

  public static <T extends Local> T lookup(String name, List<T> locals) {
    if (locals.isNil())
      return null;
    else if (locals.getHead().getName().equals(name))
      return locals.getHead();
    else return lookup(name, locals.getTail());
  }

  // Populate the supplied set with the names of the free variables...

  public static int maxLocals(AST[] asts) {
    int maxLocals = 0;
    for (AST ast : asts)
      maxLocals = Math.max(maxLocals, ast.maxLocals());
    return maxLocals;
  }

  // Populate the supplied set with the names of the dynamic variables. A dynamic
  // variable is a free variable of a closure-like construct...

  public static int maxLocals(BArm[] arms) {
    int maxLocals = 0;
    for (BArm arm : arms)
      maxLocals = Math.max(maxLocals, arm.maxLocals());
    return maxLocals;
  }

  public static void printTree(Object value, PrintStream out, int indent) {
    if (value.getClass().isArray()) {
      Object[] a = (Object[]) value;
      for (Object x : a) {
        printTree(x, out, indent);
      }
    } else if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
      BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
      String[] fields = c.fields();
      for (int i = 0; i < indent; i++)
        out.print(" ");
      out.println("<" + value.getClass().getSimpleName() + ">");
      for (String field : fields) {
        for (int i = 0; i < indent + 2; i++)
          out.print(" ");
        out.println("<" + field + ">");
        try {
          Field f = value.getClass().getField(field);
          printTree(f.get(value), out, indent + 4);
        } catch (NoSuchFieldException e) {
          e.printStackTrace(out);
        } catch (SecurityException e) {
          e.printStackTrace(out);
        } catch (IllegalArgumentException e) {
          e.printStackTrace(out);
        } catch (IllegalAccessException e) {
          e.printStackTrace(out);
        }
        for (int i = 0; i < indent + 2; i++)
          out.print(" ");
        out.println("</" + field + ">");
      }
      for (int i = 0; i < indent; i++)
        out.print(" ");
      out.println("</" + value.getClass().getSimpleName() + ">");
    } else {
      for (int i = 0; i < indent; i++)
        out.print(" ");
      out.println(value);
    }
  }

  private int  lineStart = -1;
  private int  lineEnd   = -1;
  private Type type;

  // Return the maximum number of locals needed by the receiver...

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast);

  public abstract void DV(HashSet<String> vars);

  public abstract void FV(HashSet<String> vars);

  public int getLineStart() {
    return lineStart;
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public abstract int maxLocals();

  public AST printExp(AST value) {
    return new Apply(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), "print", null), value);
  }

  public void setLineStart(int l) {
    lineStart = l;
  }

  public void setLineEnd(int l) {
    lineEnd = l;
  }

  public abstract void setPath(String path);

  public abstract AST subst(AST ast, String name);

  public AST[] subst(AST[] a, AST ast, String name) {
    AST[] b = new AST[a.length];
    for (int i = 0; i < a.length; i++)
      b[i] = a[i].subst(ast, name);
    return b;
  }

  public AST substExportedValues(Collection<Module> modules) {
    AST ast = this;
    for (Module module : modules) {
      for (Key exported : toKeys(module.getExports().getStrings())) {
        ast = ast.subst(new Ref(getLineStart(), getLineEnd(), new Var(getLineStart(), getLineEnd(), module.getName(), null), exported), exported.getString());
      }
    }
    return ast;
  }

  private Key[] toKeys(String[] strings) {
    Key[] keys = new Key[strings.length];
    for (int i = 0; i < strings.length; i++)
      keys[i] = Key.getKey(strings[i]);
    return keys;
  }

  public abstract Type type(Env<String, Type> env);

  public AST() {
  }

  public AST(int lineStart, int lineEnd) {
    setLineStart(lineStart);
    setLineEnd(lineEnd);
  }

  public static Located getLocated(Object value, int charIndex) {
    if (value == null) return null;
    if (value.getClass().isArray()) {
      Object[] a = (Object[]) value;
      for (Object x : a) {
        Located located = getLocated(x, charIndex);
        if (located != null) return located;
      }
    } else {
      if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
        BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
        String[] fields = c.fields();
        for (String field : fields) {
          try {
            Field f = value.getClass().getField(field);
            Object fieldValue = f.get(value);
            Located located = getLocated(fieldValue, charIndex);
            if (located != null) return located;
          } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace(System.err);
          }
        }
      }
    }
    if (value instanceof Located) {
      Located located = (Located) value;
      if (located.getLineStart() == 0 && located.getLineEnd() == 0) System.err.println("Warning: " + located + " at (0,0)");
      if (charIndex >= located.getLineStart() && charIndex <= located.getLineEnd())
        return located;
      else return null;
    } else return null;
  }

  public static <T> T[] concatenate(T[] a, T[] b) {
    int aLen = a.length;
    int bLen = b.length;

    @SuppressWarnings("unchecked")
    T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
    System.arraycopy(a, 0, c, 0, aLen);
    System.arraycopy(b, 0, c, aLen, bLen);

    return c;
  }

  public static void setDefs(Object value, Env<String, DeclaringLocation> env) {
    if (value.getClass().isArray()) {
      Object[] a = (Object[]) value;
      for (Object x : a) {
        setDefs(x, env);
      }
    } else {
      if (value instanceof DecContainer) {
        env = addDecs((DecContainer) value, env);
      }
      if (value instanceof RefContainer) {
        env = addRefs((RefContainer) value, env);
      }
      if (value instanceof ReferencingLocation) {
        ReferencingLocation ref = (ReferencingLocation) value;
        String name = ref.getName();
        if (env.binds(name)) ref.setDeclaringLocation(env.lookup(name));
      }
      if (value.getClass().isAnnotationPresent(BoaConstructor.class)) {
        BoaConstructor c = value.getClass().getAnnotation(BoaConstructor.class);
        String[] fields = c.fields();
        for (String field : fields) {
          try {
            Field f = value.getClass().getField(field);
            Object fieldValue = f.get(value);
            setDefs(fieldValue, env);
          } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace(System.err);
          }
        }
      }
    }
  }

  private static Env<String, DeclaringLocation> addRefs(RefContainer container, Env<String, DeclaringLocation> env) {
    ReferencingLocation[] refs = container.getContainedRefs();
    for (ReferencingLocation ref : refs) {
      String name = ref.getName();
      if (env.binds(name)) ref.setDeclaringLocation(env.lookup(name));
    }
    return env;
  }

  public static Env<String, DeclaringLocation> addDecs(DecContainer container, Env<String, DeclaringLocation> env) {
    for (DeclaringLocation l : container.getContainedDecs()) {
      env = env.bind(l.getName(), l);
    }
    return env;
  }

}
