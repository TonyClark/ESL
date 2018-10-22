package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Map extends Exp {
  
  Exp list;
  Exp body;
  Type sourceType;
  Type targetType;


  public Map(Exp list,Exp body, Type sourceType,Type targetType) {
    this.body = body;
    this.list = list;
    this.sourceType = sourceType;
    this.targetType = targetType;
  }

  public void writeExp(PrintWriter out) {
    out.print("esl.Library.map(new Fun1<" + targetType.toArgString() + "," + sourceType.toArgString() + ">() { public " + targetType.toArgString() + " apply(" + sourceType.toArgString() + " mapElement) {");
    body.writeCommand(out,true,true);
    out.print("}},");
    list.writeExp(out);
    out.print(")");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }
  
  public String toString() {
    return "Map(" + list + "," + body + "," + sourceType + "," + targetType + ")";
  }


}
