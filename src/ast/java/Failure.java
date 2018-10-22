package ast.java;

import java.io.PrintWriter;

public class Failure extends Exp {

  Exp exp;

  public Failure(Exp exp) {
    this.exp = exp;
  }

  @Override
  public void writeExp(PrintWriter out) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    // TODO Auto-generated method stub
    
  }

}
