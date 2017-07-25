package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import ast.AST;
import ast.binding.Dec;
import ast.patterns.PCons;
import ast.patterns.PNil;
import ast.patterns.Pattern;
import ast.types.HandlerType;
import ast.types.Term;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypeMatchError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.data.Null;
import instrs.data.Pop;
import instrs.jumps.Goto;
import instrs.jumps.Skip;
import instrs.jumps.SwitchTable;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import instrs.vars.SetFrame;
import list.List;
import runtime.functions.CodeBox;

@BoaConstructor(fields = { "decs", "exps", "arms" })

public class Case extends AST {

  public Dec[]  decs;
  public AST[]  exps;
  public BArm[] arms;

  public Case() {
  }

  public Case(int start, int end, Dec[] decs, AST[] exps, BArm[] arms) {
    super(start, end);
    this.decs = decs;
    this.exps = exps;
    this.arms = arms;
  }

  public String toString() {
    return "Case(" + Arrays.toString(exps) + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // The expressions matched by the case arms are set in the stack frame as
    // locals...

    int base = locals.length();
    int index = 0;
    for (AST exp : exps) {
      exp.compile(locals, dynamics, code, false);
      locals = locals.cons(new FrameVar("$case-" + (index++), locals.length()));
      code.add(new SetFrame(getLineStart(), locals.length() - 1), locals, dynamics);
      code.add(new Pop(getLineStart()), locals, dynamics);
    }
    compileArms(base, locals, dynamics, code, isLast);
  }

  public void compileArms(int varIndex, List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    boolean useSwitchTable = false; //isDisjointArms() && arms.length > 3;
    SwitchTable switchTableInstr = new SwitchTable(getLineStart(), varIndex);
    if (useSwitchTable) code.add(switchTableInstr, locals, dynamics);

    // Define the dynamic vars up front ... then remove them at the end...

    // Compile each arm independently...

    Vector<CodeBox> armCode = new Vector<CodeBox>();
    Vector<HashSet<String>> armBV = new Vector<HashSet<String>>();
    Vector<HashSet<String>> armDV = new Vector<HashSet<String>>();

    for (BArm arm : arms) {

      // Work out which variables bound by patterns should be local and which
      // should be dynamic...

      HashSet<String> DV = new HashSet<String>();
      HashSet<String> BV = new HashSet<String>();

      for (Pattern p : arm.patterns)
        p.vars(BV);
      arm.exp.DV(DV);
      arm.guard.DV(DV);

      armBV.add(BV);
      armDV.add(DV);
    }

    for (int i = 0; i < arms.length; i++) {

      BArm arm = arms[i];
      HashSet<String> BV = armBV.get(i);
      HashSet<String> DV = armDV.get(i);

      List<FrameVar> armLocals = locals;
      List<DynamicVar> armDynamics = dynamics;

      CodeBox instrs = new CodeBox("", 0);

      // We have just failed to here so remove the dynamic variables from the
      // previous arm...

      if (i > 0) {
        for (String v : armBV.get(i - 1)) {
          if (armDV.get(i - 1).contains(v)) {
            instrs.add(new PopDynamic(getLineStart()), locals, dynamics);
            dynamics = dynamics.getTail();
          }
        }
      }
      for (String v : BV) {
        if (DV.contains(v)) {
          armDynamics = armDynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(v, 0));
          instrs.add(new Null(getLineStart()), locals, dynamics);
          instrs.add(new NewDynamic(getLineStart()), locals, dynamics);
        } else armLocals = armLocals.cons(new FrameVar(v, armLocals.length()));
      }
      arm.compile(varIndex, armLocals, armDynamics, instrs, isLast && i == arms.length - 1);
      for (String v : BV) {
        if (DV.contains(v)) {
          instrs.add(new PopDynamic(getLineStart()), locals, dynamics);
          dynamics = dynamics.getTail();
        }
      }
      armCode.add(instrs);
    }

    // Now insert the TRY...SKIP instructions between the arms...

    for (int i = 0; i < armCode.size(); i++) {
      int length = code.getCode().size();
      instrs.patterns.Try tryArm = new instrs.patterns.Try(getLineStart(), 0, i == 0);
      code.add(tryArm, locals, dynamics);
      int base = code.getCode().size();
      CodeBox armCodeBox = armCode.get(i);
      if (useSwitchTable) switchTableInstr.processArm(arms[i], code.getCode().size());
      for (Instr instr : armCodeBox.getCode()) {
        if (instr instanceof Goto) {
          Goto g = (Goto) instr;
          g.setAddress(g.getAddress() + base);
        }
        code.add(instr, armCodeBox.getLocalsAt(armCodeBox.indexOf(instr)), armCodeBox.getDynamicsAt(armCodeBox.indexOf(instr)));
      }
      // Jump over the rest of the case arms and the end error message...
      int distance = distance(armCode, i + 1) + 2;
      Skip jmp = new Skip(getLineStart(), distance);
      code.add(jmp, locals, dynamics);
      int offset = code.getCode().size() - length;
      tryArm.setOffset(offset - 1);
      if (useSwitchTable) switchTableInstr.processError(arms[i], offset - 1);
    }

    // Add in the error at the end of the case...

    code.add(new instrs.patterns.CaseError(getLineStart(), this, varIndex), locals, dynamics);
  }

  private boolean isDisjointArms() {
    // Returns true when the arms of the case are all headed by unique term patterns...
    Set<String> terms = new HashSet<String>();
    for (BArm arm : arms) {
      Pattern[] patterns = arm.patterns;
      Pattern pattern = patterns[0];
      if (pattern instanceof PNil) {
        if (terms.contains("[]"))
          return false;
        else terms.add("[]");
      } else if (pattern instanceof PCons) {
        if (terms.contains(":"))
          return false;
        else terms.add(":");
      } else if (pattern instanceof ast.patterns.PTerm) {
        ast.patterns.PTerm term = (ast.patterns.PTerm) pattern;
        String functor = term.getName();
        if (terms.contains(functor))
          return false;
        else terms.add(functor);
      } else return false;
    }
    return true;
  }

  private int distance(Vector<CodeBox> armCode, int start) {
    // Calculates the length of the code between i and the end. Careful to
    // add in the TRY and SKIP instructions...
    int distance = 0;
    for (int i = start; i < armCode.size(); i++)
      distance = distance + armCode.get(i).getCode().size() + 2;
    return distance;
  }

  public void FV(HashSet<String> vars) {
    for (AST exp : exps)
      exp.FV(vars);
    for (BArm arm : arms)
      arm.FV(vars);
  }

  public void DV(HashSet<String> vars) {
    for (AST exp : exps)
      exp.DV(vars);
    for (BArm arm : arms)
      arm.DV(vars);
  }

  public int maxLocals() {
    // Be sure to add in local slots for each of the expression values...
    int maxLocals = 0;
    for (AST exp : exps)
      maxLocals = Math.max(maxLocals, exp.maxLocals());
    for (BArm arm : arms)
      maxLocals = Math.max(maxLocals, arm.maxLocals());
    return maxLocals + exps.length;
  }

  public AST subst(AST ast, String name) {
    return new Case(getLineStart(), getLineEnd(), decs, subst(exps, ast, name), subst(arms, ast, name));
  }

  private BArm[] subst(BArm[] arms, AST ast, String name) {
    BArm[] as = new BArm[arms.length];
    for (int i = 0; i < arms.length; i++)
      as[i] = arms[i].subst(ast, name);
    return as;
  }

  public void setPath(String path) {
    for (AST exp : exps)
      exp.setPath(path);
    for (BArm arm : arms)
      arm.setPath(path);
  }

  public Type type(Env<String, Type> env) {

    // The case expression may include declarations that
    // type the bound variables in patterns. The pattern
    // variables are updated...

    processDeclarations(env);

    // Get the types of the supplied values...

    Type[] suppliedTypes = new Type[exps.length];
    Type[] expectedTypes = new Type[exps.length];

    for (int i = 0; i < exps.length; i++) {
      suppliedTypes[i] = exps[i].type(env);
      expectedTypes[i] = ast.types.Void.VOID;
    }

    // The return type. Any void return types are ignored...

    Type resultType = null;

    for (BArm arm : arms) {
      int lineStart = arm.patterns[0].getLineStart();
      int lineEnd = arm.patterns[0].getLineEnd();
      if (arm.patterns.length == exps.length) {
        HandlerType handlerType = arm.type(env);
        for (int i = 0; i < exps.length; i++) {
          if (!Term.equals(handlerType.getTypes()[i], suppliedTypes[i], env)) { throw new TypeMatchError(lineStart, lineEnd, suppliedTypes[i], handlerType.getTypes()[i]); }
        }
        if (resultType == null)
          resultType = handlerType.getResult();
        else if (!Type.equals(resultType, handlerType.getResult(), env)) throw new TypeError(lineStart, lineEnd, "incompatible case arm return types " + resultType + " and " + handlerType.getResult());
      } else throw new TypeError(lineStart, lineEnd, "incorrect number of arm patterns.");
    }

    return resultType;

  }

  private void processDeclarations(Env<String, Type> env) {
    // The declarations type the pattern variables...
    for (Dec dec : decs)
      env = env.bind(dec.getName(), dec.getDeclaredType());
    for (BArm arm : arms) {
      arm.processDeclarations(env);
    }
  }

  public String getLabel() {
    return "case :: " + getType();
  }

}
