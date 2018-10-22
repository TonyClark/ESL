package ast.java;

import java.io.PrintWriter;

public abstract class CaseArm {

  public abstract void write(PrintWriter out);

  public abstract void toMessageHandler();

}
