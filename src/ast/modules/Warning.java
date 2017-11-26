package ast.modules;

import values.Located;

public class Warning implements Located {

  int    start;
  int    end;
  String warning;

  public Warning(int start, int end, String warning) {
    super();
    this.start = start;
    this.end = end;
    this.warning = warning;
  }

  public String getWarning() {
    return warning;
  }

  public int getLineStart() {
    return start;
  }

  public int getLineEnd() {
    return end;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

}
