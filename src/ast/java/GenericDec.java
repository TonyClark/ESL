package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class GenericDec extends Dec {

  String[] names;
  boolean  isExported = false;

  public GenericDec(String[] names, Type type, String name, Exp exp) {
    super(type, name, exp);
    this.names = names;
  }

  public void write(PrintWriter out) {
    // A generic declaration can only be handled by a Java generic method...
    if (exp instanceof Nil)
      super.write(out);
    else if (exp instanceof Fun)
      writeFun(out,false);
    else throw new Error("cannot handle generic declaration: " + this);
  }

  public void writeTopLevel(PrintWriter out, boolean isExported) {
    this.isExported = isExported;
    if (exp instanceof Nil)
      super.write(out);
    else if (exp instanceof Fun)
      writeFun(out,true);
    else throw new Error("cannot handle generic declaration: " + this);
  }

  private void writeFun(PrintWriter out,boolean isTopLevel) {
    // class NAME {
    // public <GENERIC ARGS> TYPE apply(ARGS) { BODY }
    // public <GENERIC ARGS> FunN<GENERIC ARGS> asFunN() {
    // return new FunN<GENERIC ARGS>() { public RETURN apply(ARGS) { return NAME.this.<GENERIC ARGS>apply(ARGS); } };
    // }
    // }
    // NAME n = new NAME();
    Fun fun = (Fun) exp;
    ast.java.types.Fun funType = (ast.java.types.Fun) type;
    if(isTopLevel) {
      if(isExported)
        out.print("public static ");
      else out.print("private static ");
    }
    out.print("class " + name + "_ { public <");
    for (int i = 0; i < names.length; i++) {
      out.print(names[i]);
      if (i + 1 < names.length) out.print(",");
    }
    out.print("> " + funType.getRange().toString() + " apply(");
    for (int i = 0; i < fun.args.length; i++) {
      out.println(fun.args[i].getType().toString() + " " + fun.args[i].getName());
      if (i + 1 < fun.args.length) out.print(",");
    }
    out.print(") {");
    fun.body.writeCommand(out, true, true);
    out.print("}");

    out.print("public <");
    for (int i = 0; i < names.length; i++) {
      out.print(names[i]);
      if (i + 1 < names.length) out.print(",");
    }
    out.print("> Fun" + fun.args.length + "<" + funType.getRange().toArgString());
    for (int i = 0; i < fun.args.length; i++) {
      out.print(",");
      out.print(fun.args[i].getType().toArgString());
    }
    out.print("> asFun" + fun.args.length + "() { return new Fun" + fun.args.length + "<" + funType.getRange().toArgString());
    for (int i = 0; i < fun.args.length; i++) {
      out.print(",");
      out.print(fun.args[i].getType().toArgString());
    }
    out.print(">() { public " + funType.getRange().toArgString() + " apply(");
    for (int i = 0; i < fun.args.length; i++) {
      out.print(fun.args[i].getType().toArgString());
      out.print(" var" + i);
      if (i + 1 < fun.args.length) out.print(",");
    }
    out.print(") { return " + name + "_.this.apply(");
    for (int i = 0; i < fun.args.length; i++) {
      out.print(" var" + i);
      if (i + 1 < fun.args.length) out.print(",");
    }
    out.print("); }};");
    out.print("}");
    out.print("}");
    if(isTopLevel) {
      if(isExported)
        out.print("public static ");
      else out.print("private static ");
    }
    out.print(name + "_ " + name + " = new " + name + "_();");
  }

}
