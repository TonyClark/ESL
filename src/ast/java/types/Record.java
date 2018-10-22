package ast.java.types;

import java.io.PrintWriter;
import java.util.Vector;

public class Record extends Type {

  private static int count  = 0;

  ast.types.Record   record;
  Vector<Field>      fields = new Vector<Field>();
  String             name   = "Record" + (count++);

  public Record(ast.types.Record record) {
    this.record = record;
  }

  public ast.types.Record getRecord() {
    return record;
  }

  public void addField(String name, Type type) {
    fields.add(new Field(name, type));
  }

  public void writeDef(PrintWriter out) {
    out.print("public class " + name + "{");
    for(Field field : fields) {
      field.writeDef(out);
    }
    out.print("}");
  }

  public String toString() {
    return name;
  }

  public String toArgString() {
    return name;
  }
}
