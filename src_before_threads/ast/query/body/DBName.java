package ast.query.body;

import runtime.data.Key;

public class DBName {
  
  Key name;
  int arity;

  public DBName(Key name, int arity) {
    super();
    this.name = name;
    this.arity = arity;
  }

  public Key getName() {
    return name;
  }

  public int getArity() {
    return arity;
  }

}
