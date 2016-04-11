package ast;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

import ast.binding.Var;
import ast.data.Apply;
import ast.data.Ref;
import ast.modules.Module;
import ast.tests.BArm;
import compiler.DynamicVar;
import compiler.FrameVar;
import compiler.Local;
import instrs.Instr;
import list.List;

public abstract class AST {

  public abstract void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast);

  // Populate the supplied set with the names of the free variables...

  public abstract void FV(HashSet<String> vars);

  // Populate the supplied set with the names of the dynamic variables. A dynamic
  // variable is a free variable of a closure-like construct...

  public abstract void DV(HashSet<String> vars);

  public static void DV(AST[] asts, HashSet<String> vars) {
    for (AST ast : asts)
      ast.DV(vars);
  }

  // Return the maximum number of locals needed by the receiver...

  public abstract int maxLocals();

  public static int maxLocals(AST[] asts) {
    int maxLocals = 0;
    for (AST ast : asts)
      maxLocals = Math.max(maxLocals, ast.maxLocals());
    return maxLocals;
  }

  public static int maxLocals(BArm[] arms) {
    int maxLocals = 0;
    for (BArm arm : arms)
      maxLocals = Math.max(maxLocals, arm.maxLocals());
    return maxLocals;
  }

  public static <T extends Local> T lookup(String name, List<T> locals) {
    if (locals.isNil())
      return null;
    else if (locals.getHead().getName().equals(name))
      return locals.getHead();
    else return lookup(name, locals.getTail());
  }

  public AST substExportedValues(Collection<Module> modules) {
    AST ast = this;
    for (Module module : modules) {
      for (String exported : module.getExports()) {
        ast = ast.subst(new Ref(new Var(module.getName()), exported), exported);
      }
    }
    return ast;
  }

  public abstract AST subst(AST ast, String name);

  public AST[] subst(AST[] a, AST ast, String name) {
    AST[] b = new AST[a.length];
    for (int i = 0; i < a.length; i++)
      b[i] = a[i].subst(ast, name);
    return b;
  }

  public AST printExp(AST value) {
    return new Apply(new Var("print"), value);
  }

}
