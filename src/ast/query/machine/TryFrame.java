package ast.query.machine;

public class TryFrame {
  int local;
  int offset;
  
  public TryFrame(int local, int offset) {
    super();
    this.local = local;
    this.offset = offset;
  }

  public int getLocal() {
    return local;
  }

  public int getOffset() {
    return offset;
  }

}
