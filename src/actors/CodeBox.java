package actors;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Hashtable;
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

  public void pprint(String name, PrintStream out) {
    out.printf("CodeBox(%s,%s)%n", name, locals);
    for (int i = 0; i < code.size(); i++) {
      code.get(i).pprint(i, out);
    }
  }

  public void collect(String name, Hashtable<String, CodeBox> boxes) {
    if (boxes.containsKey(name))
      throw new Error("code box table already contains an element for " + name);
    else {
      boxes.put(name, this);
      for (Instr i : code)
        i.collect(boxes);
    }
  }

  public void write(String file) {
    Hashtable<String, CodeBox> boxes = new Hashtable<String, CodeBox>();
    collect(file, boxes);
    try {
      PrintStream fout = new PrintStream(file);
      for (String n : boxes.keySet())
        boxes.get(n).pprint(n, fout);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
