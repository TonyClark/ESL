package ast.java;

import java.io.PrintWriter;

public abstract class Exp {

  public abstract void writeExp(PrintWriter out);

  public abstract void writeCommand(PrintWriter out, boolean isLast, boolean returnValue);

}
