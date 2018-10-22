package ast.java;

import java.io.PrintWriter;

public class VarLock extends Lock {
  
  String name;

  public VarLock(String name) {
   this.name = name;
  }

  public void write(PrintWriter out) {
    out.print(name);
  }

}
