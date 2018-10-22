package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Cnstr {

  String name;
  Type[] types;

  public Cnstr(String name, Type[] types) {
    super();
    this.name = name;
    this.types = types;
  }

  public void writeVisit(PrintWriter out) {
    out.print("public R visit" + name + "(");
    for (int i = 0; i < types.length; i++) {
      out.print(types[i] + " v" + i);
      if (i + 1 < types.length) out.print(",");
    }
    out.println(");");
  }

  public void writeClass(PrintWriter out, String data) {
    out.print("class " + name + " implements " + data + "{");
    for(int i = 0; i < types.length; i ++) {
      out.print(types[i] + " val" + i + ";");
    }
    out.print("public " + name + "(");
    for(int i = 0; i < types.length; i ++) {
      out.print(types[i] + " val" + i);
      if(i + 1 < types.length) out.print(",");
    }
    out.print(") {");
    for(int i = 0; i < types.length; i ++) {
      out.print("this.val" + i + " = val" + i + ";");
    }
    out.print("}");
    out.print("public <R> R accept(Visitor<R> visitor) {");
    out.print("  return visitor.visit" + name + "(");
    for(int i = 0; i < types.length; i ++) {
      out.print(" val" + i);
      if(i + 1 < types.length) out.print(",");
    }
    out.print(");");
    out.print("}}");
  }

}
