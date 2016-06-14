package edb.editor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;

public class KeywordStyledDocument extends DefaultStyledDocument {

  private static final long serialVersionUID = 1L;
  private Style             _defaultStyle;
  private Style             _cwStyle;

  public KeywordStyledDocument(Style defaultStyle, Style cwStyle) {
    _defaultStyle = defaultStyle;
    _cwStyle = cwStyle;
  }

  public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
    super.insertString(offset, str, a);
    refreshDocument();
  }

  public void remove(int offs, int len) throws BadLocationException {
    super.remove(offs, len);
    refreshDocument();
  }

  private synchronized void refreshDocument() throws BadLocationException {
    String text = getText(0, getLength());
    final List<HiliteWord> list = processWords(text);

    setCharacterAttributes(0, text.length(), _defaultStyle, true);
    for (HiliteWord word : list) {
      int p0 = word._position;
      setCharacterAttributes(p0, word._word.length(), _cwStyle, true);
    }
  }

  private static List<HiliteWord> processWords(String content) {
    content += " ";
    List<HiliteWord> hiliteWords = new ArrayList<HiliteWord>();
    int lastWhitespacePosition = 0;
    String word = "";
    char[] data = content.toCharArray();

    for (int index = 0; index < data.length; index++) {
      char ch = data[index];
      if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == '_')) {
        lastWhitespacePosition = index;
        if (word.length() > 0) {
          if (isReservedWord(word)) {
            hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length())));
          }
          word = "";
        }
      } else {
        word += ch;
      }
    }
    return hiliteWords;
  }

  private static final boolean isReservedWord(String word) {
    return (word.toUpperCase().trim().equals("THEN") || word.toUpperCase().trim().equals("ACT") || word.toUpperCase().trim().equals("IMPORT") || word.toUpperCase().trim().equals("FOR") || word.toUpperCase().trim().equals("FIND") || word.toUpperCase().trim().equals("DO") || word.toUpperCase().trim().equals("NOT")
        || word.toUpperCase().trim().equals("FUN") || word.toUpperCase().trim().equals("LETREC") || word.toUpperCase().trim().equals("LET") || word.toUpperCase().trim().equals("IN") || word.toUpperCase().trim().equals("NEW") || word.toUpperCase().trim().equals("TRUE") || word.toUpperCase().trim().equals("FALSE")
        || word.toUpperCase().trim().equals("CASE") || word.toUpperCase().trim().equals("BECOME") || word.toUpperCase().trim().equals("SELF") || word.toUpperCase().trim().equals("PROBABLY") || word.toUpperCase().trim().equals("NOW") || word.toUpperCase().trim().equals("NULL") || word.toUpperCase().trim().equals("IF")
        || word.toUpperCase().trim().equals("ELSE") || word.toUpperCase().trim().equals("WHEN") || word.toUpperCase().trim().equals("TRY") || word.toUpperCase().trim().equals("CATCH") || word.toUpperCase().trim().equals("THROW") || word.toUpperCase().trim().equals("BAG") || word.toUpperCase().trim().equals("SET")|| word.toUpperCase().trim().equals("EXPORT")
        || word.toUpperCase().trim().equals("UNION") || word.toUpperCase().trim().equals("UNIQUE") || word.toUpperCase().trim().equals("WHERE"));
  }
}