package ast.java;

import java.io.PrintWriter;

public class Actor extends Exp {

  String      name;
  Dec[]       decs;
  Exp         init;
  Exp         handler;
  TimeHandler timeHandler;

  public Actor(String name, Dec[] decs, Exp init, Exp handler, TimeHandler timeHandler) {
    this.name = name;
    this.decs = decs;
    this.init = init;
    this.handler = handler;
    this.timeHandler = timeHandler;
  }

  public void writeExp(PrintWriter out) {
    out.print("new Actor(new BehaviourAdapter(" + (timeHandler != null) + ") {");
    out.print("Actor self; public void setSelf(Actor self) { this.self = self; }");
    for (Dec dec : decs) {
      // Var var = new Var(dec.getName(), dec);
      dec.write(out);
      // out.println("public " + dec.type.toArgString() + " get" + dec.getName() + "(){ return ");
      // var.writeExp(out);
      // out.print("; }");
    }
    out.print("public Object get(String name) {");
    for (Dec dec : decs) {
      out.print("if(name.equals(\"" + dec.getName() + "\")) return ");
      if (dec.modified)
        out.print(dec.name + ".getValue();");
      else out.print(dec.name + ";");
    }
    out.println("throw new Error(\"no field named \" + name);");
    out.print("}");
    out.print("public Object init() {");
    init.writeCommand(out, true, true);
    out.print("}");
    if(timeHandler != null) {
      timeHandler.write(out);
    } else out.print("public void processTime(Actor self, int n) {}");
    out.print("public void processMessage(Actor self,Term message) {");
    handler.writeExp(out);
    out.print(";}}).start()");
  }

  public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
    if (isLast && returnValue) out.print("return ");
    writeExp(out);
    out.print(";");
  }

}
