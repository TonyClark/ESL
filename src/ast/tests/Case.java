package ast.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

import ast.AST;
import ast.patterns.Pattern;
import compiler.DynamicVar;
import compiler.FrameVar;
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

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {

    // The exps are evaluated to produce the pattern values that are maintained in registers...

    for (AST exp : exps)
      exp.compile(locals, dynamics, code, false);
    code.add(new instrs.patterns.SetPatternValues(exps.length));

    compileArms(locals, dynamics, code, isLast);
  }

  public void compileArms(List<FrameVar> locals, List<DynamicVar> dynamics, Vector<Instr> code, boolean isLast) {

    // DEFINE THE dynamic vars up front ... then remove them at the end...

    // Compile each arm independently...

    Vector<Vector<Instr>> armCode = new Vector<Vector<Instr>>();
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

      Vector<Instr> instrs = new Vector<Instr>();

      // We have just failed to here so remove the dynamic variables from the
      // previous arm...

      if (i > 0) {
        for (String v : armBV.get(i - 1)) {
          if (armDV.get(i - 1).contains(v)) {
            instrs.add(new PopDynamic());
          }
        }
      }
      for (String v : BV) {
        if (DV.contains(v)) {
          armDynamics = armDynamics.map(DynamicVar::incDynamic).cons(new DynamicVar(v, 0));
          instrs.add(new Null());
          instrs.add(new NewDynamic());
        } else armLocals = armLocals.cons(new FrameVar(v, armLocals.length()));
      }
      arm.compile(armLocals, armDynamics, instrs, isLast && i == arms.length - 1);
      for (String v : BV) {
        if (DV.contains(v)) {
          instrs.add(new PopDynamic());
        }
      }
      armCode.add(instrs);
    }

    // Now insert the TRY...SKIP instructions between the arms...

    for (int i = 0; i < armCode.size(); i++) {
      int length = code.size();
      instrs.patterns.Try tryArm = new instrs.patterns.Try(0, i == 0);
      code.add(tryArm);
      int base = code.size();
      for (Instr instr : armCode.get(i)) {
        if (instr instanceof Goto) {
          Goto g = (Goto) instr;
          g.setAddress(g.getAddress() + base);
        }
        code.add(instr);
      }
      // Jump over the rest of the case arms and the end error message...
      int distance = distance(armCode, i + 1) + 2;
      Skip jmp = new Skip(distance);
      code.add(jmp);
      int offset = code.size() - length;
      tryArm.setOffset(offset - 1);
    }

    // Add in the error at the end of the case...

    code.add(new instrs.patterns.CaseError(this));
  }

  private int distance(Vector<Vector<Instr>> armCode, int start) {
    // Calculates the length of the code between i and the end. Careful to
    // add in the TRY and SKIP instructions...
    int distance = 0;
    for (int i = start; i < armCode.size(); i++)
      distance = distance + armCode.get(i).size() + 2;
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

}
