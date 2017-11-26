package ast.actors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.RefContainer;
import ast.binding.declarations.ReferencingLocation;
import ast.control.Block;
import ast.data.Fun;
import ast.data.Str;
import ast.general.AST;
import ast.patterns.PTerm;
import ast.patterns.PVar;
import ast.patterns.Pattern;
import ast.spec.Spec;
import ast.tests.BArm;
import ast.tests.Case;
import ast.tests.If;
import ast.types.HandlerType;
import ast.types.MessageType;
import ast.types.Type;
import ast.types.TypeError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.apply.PopFrame;
import instrs.apply.Return;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetDynamic;
import list.List;
import list.Nil;
import runtime.data.Key;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "name", "args", "exports", "spec", "bindings", "init", "arms" })

public class Act extends AST implements DecContainer, RefContainer {

  // A behaviour that includes local definitions and pattern matching arms.
  // Actors have a behaviour that defines how they process messages from their queue.
  // Each time an actor is created, the definitions are evaluated.
  // The definitions may be exported and accessed via the actor using '.'.

  static int        actCount = 0;
  static Stack<Act> parents  = new Stack<Act>();

  public static int getSelfIndex(String name) {

    // Return the self-contour of the behaviour that binds
    // the name. This is used by the history mechanism...

    int index = 0;
    for (int i = parents.size() - 1; i >= 0; i--) {
      if (parents.get(i).stateNames().contains(name))
        return index;
      else index++;
    }
    return -1;

  }

  public static String newName() {
    return "act" + (actCount++);
  }

  String                 path;
  public AST             name;
  public Dec[]           args;
  public Export          exports;
  public Spec            spec;
  public Binding[]       bindings;
  public AST             init;
  public BArm[]          arms;

  Hashtable<String, Fun> funHandlers = new Hashtable<String, Fun>();

  public Act() {
  }

  public Act(int line, String path, AST name, Dec[] args, Export exports, Spec spec, Binding[] bindings, AST init, BArm[] arms) {
    setLineStart(line);
    this.path = path;
    this.name = name;
    this.exports = exports;
    this.spec = spec;
    this.bindings = bindings;
    this.init = init;
    this.arms = arms;
    this.args = args;
  }

  private boolean allSameArgNames(Vector<PTerm> terms) {
    int arity = terms.get(0).getPatterns().length;
    for (int i = 0; i < arity; i++) {
      String name = null;
      for (PTerm term : terms) {
        if (term.getPatterns()[i] instanceof PVar) {
          PVar var = (PVar) term.getPatterns()[i];
          if (name == null || var.getName().equals(name))
            name = var.getName();
          else return false;
        } else return false;
      }
    }
    return true;
  }

  private boolean allSameArity(Vector<PTerm> terms) {
    int arity = terms.get(0).getPatterns().length;
    for (int i = 0; i < terms.size(); i++) {
      if (terms.get(i).getPatterns().length != arity) return false;
    }
    return true;
  }

  private Fun armsToFun(String name, Vector<BArm> namedArms) {

    // Assume that all the variables bound in the namedArms are the same.
    // This should be relaxed by renaming variables appropriately...

    BArm lastArm = namedArms.lastElement();
    int start = lastArm.patterns[0].getLineStart();
    int end = lastArm.patterns[0].getLineEnd();
    PTerm term = (PTerm) lastArm.patterns[0];
    int arity = term.getPatterns().length;
    AST body = new ast.control.Error(start, end, new Str(start, end, "no handler for message."));
    for (int i = namedArms.size() - 1; i >= 0; i--) {
      BArm arm = namedArms.get(i);
      body = new If(start, end, arm.guard, arm.exp, body);
    }
    Dec[] args = new Dec[arity];
    for (int i = 0; i < arity; i++) {
      PVar var = (PVar) term.getPatterns()[i];
      args[i] = new Dec(start, end, path, var.getName(), var.getDeclaredType());
    }
    Str nameExp = new Str(start, end, name);
    return new Fun(start, end, path, nameExp, args, ast.types.Void.VOID, body, false);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // An act definition returns a behaviour. The bindings in the behaviour must
    // be constructed as recursive bindings *and* be dynamic variables so that
    // '.' can find them. Therefore, compile a behaviour as though it were
    // constructed in the context of a letrec, but force the bindings to be
    // dynamic...

    parents.push(this);
    setFunHandlers();

    bindings = Binding.mergeBindings(bindings);

    for (Binding b : Binding.valueBindings(bindings)) {
      code.add(new Null(getLineStart()), locals, dynamics);
      code.add(new NewDynamic(getLineStart()), locals, dynamics);
      dynamics = dynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(b.name, 0));
    }
    for (Binding b : Binding.valueBindings(bindings)) {
      b.getValue().compile(locals, dynamics, code, false);
      code.add(new SetDynamic(b.getValue().getLineStart(), lookup(b.name, dynamics).getIndex()), locals, dynamics);
      code.add(new Pop(b.getValue().getLineStart()), locals, dynamics);
    }
    orderExports(dynamics);
    name.compile(locals, dynamics, code, false);
    compileFunHandlers(locals, dynamics, code);
    compileBehaviour(locals, dynamics, code);

    // Remove the dynamics...
    for (Binding b : Binding.valueBindings(bindings)) {
      code.add(new PopDynamic(getLineStart()), locals, dynamics);
      dynamics = dynamics.getTail();
    }

    parents.pop();
  }

  public void compileBehaviour(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {

    // Compilation of a behaviour produces a closure-like value that captures
    // the current dynamics and waits to be transformed into an actor via 'new'.

    CodeBox bodyCode = new CodeBox(path, maxLocals() + 1);
    // Message will be local 0 in the stack frame...
    locals = new Nil<FrameVar>().cons(new FrameVar("$0", 0));
    bodyCode.add(new instrs.vars.FrameVar(getLineStart(), 0), locals, dynamics);
    Case handlers = new Case(getFirstHandlerLine(), getLineEnd(), new Dec[] {}, new AST[] {}, arms);
    handlers.compileArms(0, locals, dynamics, bodyCode, true);
    bodyCode.add(new Return(getLineStart()), locals, dynamics);
    int initIndex = bodyCode.getCode().size();
    int funHandlersLength = funHandlers.keySet().size();
    init.compile(locals, dynamics, bodyCode, false);
    bodyCode.add(new PopFrame(getLineStart()), locals, dynamics);
    // Set the locals + 1 since the message is the first local...
    code.add(new instrs.data.Behaviour(getLineStart(), toKeys(exports.getStrings()), initIndex, bodyCode, handlesTime(), funHandlersLength), locals, dynamics);
  }

  private void compileFunHandlers(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code) {
    // Fun handlers are functions that can be called to handle messages...
    for (String name : funHandlers.keySet()) {
      funHandlers.get(name).compile(locals, dynamics, code, false);
    }

  }

  public void DV(HashSet<String> vars) {
    // Which free vars will need to be dynamic?
    FV(vars);
    for (Binding b : Binding.valueBindings(bindings))
      vars.add(b.getName());
  }

  private Vector<String> findFunctionHandlerNames() {

    // Return those names for handlers that can process messages using
    // functions. Assume all patterns are singletons...

    Vector<String> names = getMessageNames();
    Vector<String> funHandlerNames = new Vector<String>();
    for (String name : names) {
      Vector<PTerm> terms = getHandlersNamed(name);
      if (allSameArity(terms) && allSameArgNames(terms)) {
        funHandlerNames.add(name);
      }
    }
    return funHandlerNames;
  }

  public void FV(HashSet<String> vars) {
    HashSet<String> bound = new HashSet<String>();
    for (Binding b : Binding.valueBindings(bindings)) {
      bound.add(b.getName());
    }
    for (Binding b : Binding.valueBindings(bindings)) {
      HashSet<String> free = new HashSet<String>();
      b.FV(free);
      free.removeAll(bound);
      vars.addAll(free);
    }
    HashSet<String> free = new HashSet<String>();
    for (BArm arm : arms)
      arm.FV(vars);
    init.FV(vars);
    name.FV(vars);
    free.removeAll(bound);
    vars.addAll(free);
  }

  public BArm[] getArms() {
    return arms;
  }

  private Vector<BArm> getArmsNamed(String name) {
    Vector<BArm> namedArms = new Vector<BArm>();
    for (BArm arm : arms) {
      Pattern p = arm.patterns[0];
      if (p instanceof PTerm) {
        PTerm term = (PTerm) p;
        if (term.getName().equals(name)) namedArms.add(arm);
      }
    }
    return namedArms;
  }

  public Binding[] getBindings() {
    return bindings;
  }

  public DeclaringLocation[] getContainedDecs() {
    return bindings;
  }

  public ReferencingLocation[] getContainedRefs() {
    ReferencingLocation[] refs = new ReferencingLocation[exports.getNames().length];
    for (int i = 0; i < exports.getNames().length; i++) {
      for (Binding b : bindings) {
        if (b.getName().equals(exports.getNames()[i].getName())) {
          if (b.isTypeBinding())
            refs[i] = new ast.types.Var(getLineStart(), getLineEnd(), b.getName(), null);
          else refs[i] = new ast.binding.Var(getLineStart(), getLineEnd(), b.getName(), b.getDeclaredType(), null);
        }
      }
      if (refs[i] == null) throw new TypeError(getLineStart(), getLineEnd(), "cannot find a local behaviour definition for " + exports.getNames()[i].getName());
    }
    return refs;
  }

  private Dec[] getExportedTypes(Env<String, Type> env) {
    Dec[] decs = new Dec[exports.getNames().length];
    int decIndex = 0;
    for (Binding b : Binding.valueBindings(bindings)) {
      Env<String, Type> bEnv = env;
      Type bType = b.getDeclaredType();
      if (exports.contains(b.getName())) {
        if (b.getLineStart() == 0 && b.getLineEnd() == 0) {
          System.err.println(b + " has (0,0)");
        }
        decs[decIndex++] = new Dec(b.getLineStart(), b.getLineEnd(), b.getPath(), b.getName(), bType);
      }
    }
    return decs;
  }

  private int getFirstHandlerLine() {
    if (arms.length == 0)
      return -1;
    else return arms[0].patterns[0].getLineStart();
  }

  private Vector<PTerm> getHandlersNamed(String name) {
    Vector<PTerm> terms = new Vector<PTerm>();
    for (BArm arm : arms) {
      Pattern p = arm.patterns[0];
      if (p instanceof PTerm) {
        PTerm term = (PTerm) p;
        if (term.getName().equals(name)) terms.add(term);
      }
    }
    return terms;
  }

  public String getLabel() {
    return "act " + name + " :: " + getType();
  }

  private Vector<String> getMessageNames() {
    Vector<String> names = new Vector<String>();
    for (BArm arm : arms) {
      if (isSingletonTerm(arm)) names.add(termName(arm));
    }
    return names;
  }

  public AST getName() {
    return name;
  }

  public Spec getSpec() {
    return spec;
  }

  public boolean handlesTime() {
    for (BArm arm : arms) {
      if (arm.patterns.length == 1) {
        Pattern p = arm.patterns[0];
        if (p instanceof PTerm) {
          PTerm term = (PTerm) p;
          if (term.getName().equals("Time") && !isEmptyBlock(arm.exp)) return true;
        }
      }
    }
    return false;
  }

  private boolean isEmptyBlock(AST exp) {
    if (exp instanceof Block) {
      Block block = (Block) exp;
      return block.exps.length == 0;
    } else return false;
  }

  private boolean isSingletonTerm(BArm arm) {
    Pattern p = arm.patterns[0];
    return p instanceof PTerm;
  }

  public int maxLocals() {

    // This does not remove those bindings that will be implemented as
    // dynamic variables, however it is fail safe...

    int maxLocals = name.maxLocals() + init.maxLocals() + Binding.valueBindings(bindings).length;
    for (BArm arm : arms)
      maxLocals += arm.maxLocals();
    int valueLocals = 0;
    for (Binding b : Binding.valueBindings(bindings))
      valueLocals = Math.max(valueLocals, b.getValue().maxLocals());
    return maxLocals + valueLocals;
  }

  private void orderExports(List<DynamicVar> dynamics) {
    ExportedName[] newExports = new ExportedName[dynamics.length()];
    for (ExportedName export : exports.getNames()) {
      if (export != null) {
        DynamicVar dynamic = lookup(export.getName(), dynamics);
        if (dynamic == null)
          throw new java.lang.Error("cannot find dyanamic " + export);
        else newExports[dynamic.getIndex()] = export;
      }
    }
    exports = new Export(exports.getLineStart(), exports.getLineEnd(), newExports);
  }

  private Type selfType(Env<String, Type> env) {

    // The self type is the interface of messages. Create an act
    // type where the handlers all return Void...

    MessageType[] handlers = new MessageType[arms.length];
    int[] index = new int[] { 0 };
    for (int i = 0; i < arms.length; i++) {
      index[0] = i;
      Pattern.types(arms[i].patterns, env, (newEnv, types) ->
      {
        handlers[index[0]] = new MessageType(getLineStart(), getLineEnd(), types);
      });
    }
    return new ast.types.Act(getLineStart(), getLineEnd(), getExportedTypes(env), handlers);
  }

  private void setFunHandlers() {

    // Find those handlers that can be translated to private functions
    // that can be directly called by 'send'. When a message is delivered
    // that would match such a handler, the function is called instead.
    // This removes the need to cons a message in those cases where the
    // target is idle and there is a function handler for the message.

    Vector<String> names = findFunctionHandlerNames();
    for (String name : names) {
      Vector<BArm> namedArms = getArmsNamed(name);
      funHandlers.put(name, armsToFun(name, namedArms));
    }
  }

  public void setPath(String path) {
    this.path = path;
    for (Binding b : bindings)
      b.setPath(path);
    init.setPath(path);
    name.setPath(path);
    for (BArm b : arms)
      b.setPath(path);
  }

  private Vector<String> stateNames() {
    // Returns the names that are used as part of the actor state...
    Vector<String> names = new Vector<String>();
    for (Dec dec : args) {
      names.add(dec.getName());
    }
    for (Binding b : bindings) {
      names.add(b.getName());
    }
    return names;
  }

  public AST subst(AST ast, String name) {
    return new Act(getLineStart(), path, this.name.subst(ast, name), args, exports, spec, substBindings(ast, name), init.subst(ast, name), substArms(ast, name));
  }

  private BArm[] substArms(AST ast, String name) {
    BArm[] as = new BArm[arms.length];
    for (int i = 0; i < as.length; i++) {
      as[i] = arms[i].subst(ast, name);
    }
    return as;
  }

  private Binding[] substBindings(AST ast, String name) {
    Binding[] bs = new Binding[bindings.length];
    for (int i = 0; i < bindings.length; i++)
      bs[i] = bindings[i].subst(ast, name);
    return bs;
  }

  private String termName(BArm arm) {
    PTerm term = (PTerm) arm.patterns[0];
    return term.getName();
  }

  private Key[] toKeys(String[] exports) {
    Key[] keys = new Key[exports.length];
    for (int i = 0; i < exports.length; i++)
      if (exports[i] != null) keys[i] = Key.getKey(exports[i]);
    return keys;
  }

  public String toString() {
    return "Act(" + getLineStart() + "," + name + "," + exports + "," + init + "," + Arrays.toString(bindings) + "," + Arrays.toString(arms) + ")";
  }

  public Type type(Env<String, Type> env) {

    // Check the bindings as through they were established in a letrec...

    env = env.bind("self", selfType(env));
    env = Binding.typeBindingsRec(bindings, env);
    init.type(env);
    name.type(env);
    MessageType[] handlers = new MessageType[arms.length];
    for (int i = 0; i < arms.length; i++) {
      HandlerType handlerType = arms[i].type(env);
      handlers[i] = new MessageType(handlerType.getLineStart(), handlerType.getLineEnd(), handlerType.getTypes());
    }
    Dec[] exportedTypes = getExportedTypes(env);
    setType(new ast.types.Act(getLineStart(), getLineEnd(), exportedTypes, handlers));
    return getType();
  }

  public boolean isExported(String n) {
    for (ExportedName en : exports.getNames()) {
      if (en.getName().equals(n)) return true;
    }
    return false;
  }

}
