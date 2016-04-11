package actors;

import java.util.Vector;

import instrs.Instr;
import instrs.apply.PopFrame;

public class CodeBox {

  // The maximum locals (including any arguments and state variables) relating to this code...

  int           locals;

  // The instructions that are to be performed...

  Vector<Instr> code;

  public CodeBox(int locals, Vector<Instr> code) {
    super();
    this.locals = locals;
    this.code = code;
  }

  public int getLocals() {
    return locals;
  }

  public Vector<Instr> getCode() {
    return code;
  }

  public String toString() {
    return "CodeBox(" + locals + "," + code + ")";
  }

  public Instr getInstr(int i) {
    return code.get(i);
  }

  CodeBox timeHandlingCode = null;

  public CodeBox getTimeHandlingCode() {
    if (timeHandlingCode == null) {
      Vector<Instr> noReturn = (Vector<Instr>) code.clone();
      for (int i = 0; i < noReturn.size(); i++) {
        if (noReturn.elementAt(i) instanceof instrs.apply.Return) {
          noReturn.setElementAt(new PopFrame(), i);
        }
      }
      timeHandlingCode = new CodeBox(locals, noReturn);
    }
    return timeHandlingCode;
  }

}
