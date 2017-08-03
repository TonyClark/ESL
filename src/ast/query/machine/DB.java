package ast.query.machine;

import runtime.data.Key;
import runtime.data.Term;

public interface DB {

  int endOfTime();

  Term getFact(Key name, int arity, int time, int index, Machine machine);

  Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine);

  boolean hasFact(Key name, int arity, int time, int index, Machine machine);

  boolean isEnd(int time);

}
