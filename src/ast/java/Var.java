package ast.java;

import java.io.PrintWriter;

public class Var extends Exp {

  String name;
  Dec    dec;

  public Var(String name, Dec dec) {
    super();
    this.name = name;
    this.dec = dec;
  }

  public void writeExp(PrintWriter out) {
    if (dec instanceof GenericDec)
      writeGenericFunRef(out);
    else writeRef(out);
  }

  private void writeGenericFunRef(PrintWriter out) {
    // wrap a function around the generic value...
    GenericDec d = (GenericDec) dec;
    String[] names = d.names;
    ast.java.types.Fun fun = (ast.java.types.Fun) d.type;
    out.print(name + ".asFun" + fun.getDomain().length + "()");
  }

  public void writeRef(PrintWriter out) {
    out.print(name);
    if (dec == null) System.err.println("Cannot find declaration for " + name);
    if (dec != null && dec.isModified()) out.print(".getValue()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

  public String toString() {
    if (dec != null)
      return "Var(" + name + "," + dec.getType() + ")";
    else return "Var(" + name + ")";
  }

}
