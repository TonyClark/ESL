package actors;

import java.util.Vector;

import instrs.Instr;
import instrs.PopFrame;

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

  public CodeBox getTimeHandlingCode() {
    Vector<Instr> noReturn = (Vector<Instr>) code.clone();
    noReturn.remove(noReturn.lastElement());
    noReturn.add(noReturn.size(), new PopFrame());
    return new CodeBox(locals, noReturn);
  }

}
