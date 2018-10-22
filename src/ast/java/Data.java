package ast.java;

import java.io.PrintWriter;

import ast.types.Type;
import ast.types.Union;
import env.Env;

public class Data {

  String   name;
  String[] generics;
  Cnstr[]  constructors;
  Union    union;

  public Data(String name, String[] generics, Cnstr[] constructors, Union union) {
    super();
    this.name = name;
    this.generics = generics;
    this.constructors = constructors;
    this.union = union;
  }

  public void write(PrintWriter out) {
    writeInterface(out);
    for (Cnstr c : constructors) {
      c.writeClass(out, name);
    }
  }

  public String getName() {
    return name;
  }

  public String[] getGenerics() {
    return generics;
  }

  public Cnstr[] getConstructors() {
    return constructors;
  }

  private void writeInterface(PrintWriter out) {
    out.print("interface " + name);
    // ignore generics for now...
    out.print("{ public <R> R accept(Visitor<R> visitor);");
    out.println(" public static interface Visitor<R> {");
    for (Cnstr c : constructors) {
      c.writeVisit(out);
    }
    out.print("}");
    out.print("}");
  }

  public boolean isFor(Union type, Env<String, Type> typeEnv) {
    return Type.equals(union, type, typeEnv);
  }

}
