package ast.query.machine;

import runtime.data.Key;

public interface DB {

  boolean hasFact(Key name, int arity, int time, int index, Machine machine);

  Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine);

  boolean isEnd(int time);

  int endOfTime();

}
