package ast.general;

import ast.actors.Act;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.Let;
import ast.binding.Letrec;
import ast.binding.Var;
import ast.data.Fun;
import ast.modules.Module;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.types.Type;
import env.Env;

public class WalkBindings extends Walker {

  public static void walkAct(Act act, Env<String, Type> env, Walker walker) {
    Binding[] bindings = act.bindings;
    for (Binding b : bindings) {
      env = env.bind(b.getName(), b.getType());
    }
    for (Binding b : bindings) {
      walker.walk(b.getValue(), env);
    }
    walker.walk(act.init, env);
    walker.walk(act.arms, env);
  }

  public static void walkLet(Let let, Env<String, Type> env, Walker walker) {
    Binding[] bindings = let.bindings;
    Env<String, Type> bodyEnv = env;
    for (Binding b : bindings) {
      bodyEnv = bodyEnv.bind(b.getName(), b.getType());
      walker.walk(b.getValue(), env);
    }
    walker.walk(let.exp, bodyEnv);
  }

  public static void walkLetrec(Letrec letrec, Env<String, Type> env, Walker walker) {
    Binding[] bindings = letrec.bindings;
    for (Binding b : bindings) {
      env = env.bind(b.getName(), b.getType());
    }
    for (Binding b : bindings) {
      walker.walk(b.getValue(), env);
    }
    walker.walk(letrec.exp, env);
  }

  public static void walkModule(Module module, Env<String, Type> env, Walker walker) {
    for (String path : module.getImported().keySet()) {
      Module imported = module.getImported().get(path);
      for (Binding b : imported.getDefs()) {
        env = env.bind(b.getName(), b.getType());
      }
    }
    Binding[] bindings = module.getDefs();
    for (Binding b : bindings) {
      env = env.bind(b.getName(), b.getType());
    }
    for (Binding b : bindings) {
      walker.walk(b.getValue(), env);
    }
  }

  public static void walkVar(Var var, Env<String, Type> env, Walker walker) {
    if (env.binds(var.getName())) {
      System.err.println("Walk " + var.getName() + " :: " + env.lookup(var.getName()) + " at " + var.getDeclaringLocation());
    } else System.err.println("Unbound var " + var.getName());
  }

  public static void walkBArm(BArm arm, Env<String, Type> env, Walker walker) {
    Pattern.types(arm.getPatterns(), env, (env0, type) ->
    {
      walker.walk(arm.exp, env0);
    });
  }

  public static void walkFun(Fun fun, Env<String, Type> env, Walker walker) {
    for (Dec arg : fun.getArgs()) {
      env = env.bind(arg.getName(), arg.getType());
    }
    walker.walk(fun.getBody(), env);
  }

  public WalkBindings() {
    super();
    register(Act.class, WalkBindings::walkAct);
    register(BArm.class, WalkBindings::walkBArm);
    register(Fun.class, WalkBindings::walkFun);
    register(Let.class, WalkBindings::walkLet);
    register(Letrec.class, WalkBindings::walkLetrec);
    register(Module.class, WalkBindings::walkModule);
    register(Var.class, WalkBindings::walkVar);
  }

}
