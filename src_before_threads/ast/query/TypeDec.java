package ast.query;

import java.util.Arrays;

import ast.binding.declarations.DeclaringLocation;
import ast.query.body.Call;
import ast.types.Forall;
import ast.types.Tuple;
import ast.types.Type;
import ast.types.TypeFun;
import env.Env;
import exp.BoaConstructor;
import runtime.data.Key;
import values.Located;

@BoaConstructor(fields = { "name", "args", "types" })
public class TypeDec implements Located, DeclaringLocation {

  public Key      name;
  public String[] args;
  public Type[]   types;
  private int     lineStart = -1;
  private int     lineEnd   = -1;

  public TypeDec() {
  }

  public TypeDec(int lineStart, int lineEnd, Key name, String[] args, Type[] types) {
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
    this.name = name;
    this.args = args;
    this.types = types;
  }

  public Key getDeclaredName() {
    return name;
  }

  public String[] getArgs() {
    return args;
  }

  public Type[] getTypes() {
    return types;
  }

  public Type getType() {
    if (args.length == 0)
      return new Tuple(lineStart, lineEnd, types);
    else return new Forall(lineStart, lineEnd, args, new Tuple(lineStart, lineEnd, types));
  }

  public int getLineEnd() {
    return lineEnd;
  }

  public int getLineStart() {
    return lineStart;
  }

  public void setLineEnd(int lineEnd) {
    this.lineEnd = lineEnd;
  }

  public void setLineStart(int lineStart) {
    this.lineStart = lineStart;
  }

  public int getArity() {
    return types.length;
  }

  public TypeDec subst(Type type, String typeName) {
    Type[] newTypes = new Type[types.length];
    for (int i = 0; i < types.length; i++) {
      newTypes[i] = types[i].substType(type, typeName);
      if (type instanceof TypeFun) {
        TypeFun fun = (TypeFun) type;
        newTypes[i] = Call.apply(typeName, fun, newTypes[i]);
      }
    }
    return new TypeDec(getLineStart(), getLineEnd(), name, args, newTypes);
  }

  public String toString() {
    return name.getString() + Arrays.toString(args) + " = " + Arrays.toString(types);
  }

  public String getName() {
    return name.getString();
  }

  public void check(Env<String, Type> env) {
    // Ensure that all type names are defined...
    for(String arg : args) env = env.bind(arg, ast.types.Void.VOID);
    for (Type type : types)
      type.check(env);
  }

}
