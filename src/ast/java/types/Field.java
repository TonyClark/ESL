package ast.java.types;

import java.io.PrintWriter;

public class Field {

  String name;
  Type   type;

  public Field(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public void writeDef(PrintWriter out) {
    out.print("public " + type.toArgString() + " " + name + ";");
  }

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

}
