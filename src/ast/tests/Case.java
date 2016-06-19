package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import actors.CodeBox;
import ast.AST;
import ast.patterns.Pattern;
import ast.types.HandlerType;
import ast.types.Type;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import instrs.Instr;
import instrs.data.Null;
import instrs.jumps.Goto;
import instrs.jumps.Skip;
import instrs.vars.NewDynamic;
import instrs.vars.PopDynamic;
import list.List;

@BoaConstructor(fields = { "exps", "arms" })

public class Case extends AST {

  public AST[]  exps;
  public BArm[] arms;

  public Case() {
  }

  public Case(AST[] exps, BArm[] arms) {
    super();
    this.exps = exps;
    this.arms = arms;
  }

  public String toString() {
    return "Case(" + Arrays.toString(exps) + "," + Arrays.toString(arms) + ")";
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // The exps are evaluated to produce the pattern values that are maintained in registers...

    for (AST exp : exps)
      exp.compile(locals, dynamics, code, false);
    code.add(new instrs.patterns.SetPatternValues(getLine(), exps.length), locals, dynamics);

    compileArms(locals, dynamics, code, isLast);
  }

  public void compileArms(List<FrameVar> locals, List<DynamicVar> dynamics, CodeBox code, boolean isLast) {

    // DEFINE THE dynamic vars up front ... then remove them at the end...

    // Compile each arm independently...

    Vector<CodeBox> armCode = new Vector<CodeBox>();
    Vector<HashSet<String>> armBV = new Vector<HashSet<String>>();
    Vector<HashSet<String>> armDV = new Vector<HashSet<String>>();

    for (BArm arm : arms) {

      // Work out which variables bound by patterns should be local and which should be dyanamic...

      HashSet<String> DV = new HashSet<String>();
      HashSet<String> BV = new HashSet<String>();

      for (Pattern p : arm.patterns)
        p.vars(BV);
      arm.exp.DV(DV);

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
            instrs.add(new PopDynamic(getLine()), locals, dynamics);
            dynamics = dynamics.getTail();
          }
        }
      }
      for (String v : BV) {
        if (DV.contains(v)) {
          armDynamics = armDynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(v, 0));
          instrs.add(new Null(getLine()), locals, dynamics);
          instrs.add(new NewDynamic(getLine()), locals, dynamics);
        } else armLocals = armLocals.cons(new FrameVar(v, armLocals.length()));
      }
      arm.compile(armLocals, armDynamics, instrs, isLast && i == arms.length - 1);
      for (String v : BV) {
        if (DV.contains(v)) {
          instrs.add(new PopDynamic(getLine()), locals, dynamics);
          dynamics = dynamics.getTail();
        }
      }
      armCode.add(instrs);
    }

    // Now insert the TRY...SKIP instructions between the arms...

    for (int i = 0; i < armCode.size(); i++) {
      int length = code.getCode().size();
      instrs.patterns.Try tryArm = new instrs.patterns.Try(getLine(), 0, i == 0);
      code.add(tryArm, locals, dynamics);
      int base = code.getCode().size();
      CodeBox armCodeBox = armCode.get(i);
      for (Instr instr : armCodeBox.getCode()) {
        if (instr instanceof Goto) {
          Goto g = (Goto) instr;
          g.setAddress(g.getAddress() + base);
        }
        code.add(instr, armCodeBox.getLocalsAt(armCodeBox.indexOf(instr)), armCodeBox.getDynamicsAt(armCodeBox.indexOf(instr)));
      }
      // Jump over the rest of the case arms and the end error message...
      int distance = distance(armCode, i + 1) + 2;
      Skip jmp = new Skip(getLine(), distance);
      code.add(jmp, locals, dynamics);
      int offset = code.getCode().size() - length;
      tryArm.setOffset(offset - 1);
    }

    // Add in the error at the end of the case...

    code.add(new instrs.patterns.CaseError(getLine(), this), locals, dynamics);
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
    int maxLocals = 0;
    for (AST exp : exps)
      maxLocals = Math.max(maxLocals, exp.maxLocals());
    for (BArm arm : arms)
      maxLocals = Math.max(maxLocals, arm.maxLocals());
    return maxLocals;
  }

  public AST subst(AST ast, String name) {
    return new Case(subst(exps, ast, name), subst(arms, ast, name));
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
    // Need to check that the arms are all consistent.
    // Can also check that the type of the exps match at least one handler type...
    Type[] types = new Type[exps.length];
    for (int i = 0; i < types.length; i++) {
      types[i] = exps[i].type(env);
    }
    Type t = ast.types.Void.VOID;
    for (BArm arm : arms) {
      HandlerType h = arm.type(env);
      t = h.getResult();
    }
    return t;
  }

}
