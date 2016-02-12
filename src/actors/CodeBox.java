package actors;

import java.util.Vector;

import instrs.Instr;

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

}
