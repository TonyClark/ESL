package ast.java;

import java.io.PrintWriter;

public class Behaviour {

  String        name;
  Dec[]         exports;
  ast.types.Act type;

  public Behaviour(String name, Dec[] exports, ast.types.Act type) {
    this.name = name;
    this.exports = exports;
    this.type = type;
  }

  public void write(PrintWriter out) {
    out.print(" public abstract class " + name + " extends Behaviour { ");
    for (Dec dec : exports) {
      out.print(" public abstract " + dec.getType().toString() + " get" + dec.getName() + "();");
    }
    out.println("}");
  }

  public String getName() {
    return name;
  }

  public Dec[] getExports() {
    return exports;
  }

  public ast.types.Act getType() {
    return type;
  }

}
