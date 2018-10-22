package edb.tool;

import java.util.function.Supplier;

public class DelayedString {

  Supplier<String> supplier;
  String           cache = null;
  
  public DelayedString(Supplier<String> supplier) {
    super();
    this.supplier = supplier;
  }
  
  public String getString() {
    if(cache == null)
      cache = supplier.get();
    return cache;
  }

}
