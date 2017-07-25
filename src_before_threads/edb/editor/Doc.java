package edb.editor;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public abstract class Doc extends DefaultStyledDocument {

  int          start         = -1;
  int          end           = -1;
  StyleContext styleContext  = new StyleContext();
  Style        selectedStyle = styleContext.addStyle("ConstantWidth", null);

  public Doc() {
    StyleConstants.setBold(selectedStyle, true);
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getEnd() {
    return end;
  }

  public void setEnd(int end) {
    this.end = end;
  }

  protected void refreshDocument() throws BadLocationException {
    if (getStart() > -1 && getEnd() > -1) {
      setCharacterAttributes(getStart(), getEnd() - getStart(), selectedStyle, false);
    }
  }

}
