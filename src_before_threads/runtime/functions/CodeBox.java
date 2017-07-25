package runtime.functions;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;

import compiler.DynamicVar;
import compiler.FrameVar;
import instrs.Instr;
import list.List;
import runtime.data.VarTable;

public class CodeBox {

  // Source code lives in this file...

  String        path;

  // The maximum locals (including any arguments and state variables) relating to this code...

  int           locals;

  // The instructions that are to be performed...

  Vector<Instr> code = new Vector<Instr>();

  // The names of variables in scope are maintained in a table...

  VarTable      vars = new VarTable();

  public CodeBox(String path, int locals) {
    super();
    this.path = path;
    this.locals = locals;
  }

  public void add(Instr instr, List<FrameVar> locals, List<DynamicVar> dynamics) {
    code.add(instr);
    vars.add(locals, dynamics);
  }

  public int getLocals() {
    return locals;
  }

  public Vector<Instr> getCode() {
    return code;
  }

  public String toString() {
    return "CodeBox(" + locals + ")";
  }

  public Instr getInstr(int i) {
    return code.get(i);
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

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String[] getLocalNames(int codePtr) {
    return vars.getLocalNames(codePtr);
  }

  public int indexOf(Instr instr) {
    return code.indexOf(instr);
  }

  public List<FrameVar> getLocalsAt(int index) {
    return vars.getLocalsAt(index);
  }

  public List<DynamicVar> getDynamicsAt(int index) {
    return vars.getDynamicsAt(index);
  }

  public String[] getDynamicNames(int codePtr) {
    return vars.getDynamicNames(codePtr);
  }

}
