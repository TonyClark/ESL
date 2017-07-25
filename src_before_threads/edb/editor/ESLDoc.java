package edb.editor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class ESLDoc extends Doc {

  private static final long serialVersionUID = 1L;

  Style                     defaultStyle     = styleContext.getStyle(StyleContext.DEFAULT_STYLE);
  Style                     cwStyle          = styleContext.addStyle("ConstantWidth", null);
  Style                     typeStyle        = styleContext.addStyle("ConstantWidth", null);
  Style                     commentStyle     = styleContext.addStyle("ConstantWidth", null);
  Style                     stringStyle      = styleContext.addStyle("ConstantWidth", null);
  Style                     boolStyle        = styleContext.addStyle("ConstantWidth", null);

  public ESLDoc() {
    super();
    StyleConstants.setForeground(cwStyle, Color.BLUE);
    StyleConstants.setForeground(boolStyle, Color.MAGENTA);
    StyleConstants.setForeground(typeStyle, new Color(120, 0, 0));
    StyleConstants.setForeground(commentStyle, new Color(51, 102, 0));
    StyleConstants.setForeground(stringStyle, Color.BLUE);
    StyleConstants.setBold(cwStyle, true);
    StyleConstants.setBold(typeStyle, true);
    StyleConstants.setBold(commentStyle, true);
  }

  public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
    super.insertString(offset, str, a);
    refreshDocument();
  }

  public void remove(int offs, int len) throws BadLocationException {
    super.remove(offs, len);
    refreshDocument();
  }

  protected synchronized void refreshDocument() throws BadLocationException {
    String text = getText(0, getLength());
    final List<HiliteWord> list = processWords(text);
    setCharacterAttributes(0, text.length(), defaultStyle, true);
    for (HiliteWord word : list) {
      int p0 = word._position;
      if (word.keyType() == KeywordType.VALUE)
        setCharacterAttributes(p0, word._word.length(), cwStyle, true);
      else if (word.keyType() == KeywordType.BOOL)
        setCharacterAttributes(p0, word._word.length(), boolStyle, true);
      else if (word.keyType() == KeywordType.TYPE)
        setCharacterAttributes(p0, word._word.length(), typeStyle, true);
      else if (word.keyType() == KeywordType.COMMENT)
        setCharacterAttributes(p0, word._word.length(), commentStyle, true);
      else if (word.keyType() == KeywordType.STRING) setCharacterAttributes(p0, word._word.length(), stringStyle, true);
    }
    super.refreshDocument();
  }

  private static List<HiliteWord> processWords(String content) {
    content += " ";
    List<HiliteWord> hiliteWords = new ArrayList<HiliteWord>();
    int lastWhitespacePosition = 0;
    String word = "";
    char[] data = content.toCharArray();

    for (int index = 0; index < data.length; index++) {
      int stringIndex = isString(data, index);
      if (stringIndex != -1) {
        hiliteWords.add(new HiliteWord(content.substring(index, stringIndex + 1), index, KeywordType.STRING));
        index += (stringIndex - index) + 1;
      } else if (isComment(data, index)) {
        lastWhitespacePosition = index;
        String comment = getComment(data, index);
        index += comment.length();
        hiliteWords.add(new HiliteWord("//" + comment, (lastWhitespacePosition - word.length()), KeywordType.COMMENT));
        word = "";
      } else {
        char ch = data[index];
        if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == '_')) {
          lastWhitespacePosition = index;
          if (word.length() > 0) {
            if (isReservedWord(word)) {
              hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.VALUE));
            } else if (isTypeWord(word)) {
              hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.TYPE));
            } else if (isBoolWord(word)) {
              hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.BOOL));
            }
            word = "";
          }
        } else {
          word += ch;
        }
      }
    }
    return hiliteWords;
  }

  private static int isString(char[] data, int index) {
    if (index < data.length - 2) {
      if (data[index] == '\'') {
        for (int i = index + 1; i < data.length; i++) {
          if (data[i] == '\n') return -1;
          if (data[i] == '\'') return i;
        }
      }
    }
    return -1;
  }

  private static boolean isComment(char[] data, int index) {
    if (index < data.length - 2)
      return data[index] == '/' && data[index + 1] == '/';
    else return false;
  }

  private static String getComment(char[] data, int index) {
    String comment = "";
    while (index < data.length && data[index] != '\n') {
      comment += data[index++];
    }
    return comment;
  }

  private static final boolean isReservedWord(String word) {
    String trimmed = word.trim();
    return (trimmed.equals("then") || trimmed.equals("grab") || trimmed.equals("act") || trimmed.equals("import") || trimmed.equals("for") || trimmed.equals("find") || trimmed.equals("do") || trimmed.equals("not") || trimmed.equals("fun") || trimmed.equals("letrec") || trimmed.equals("let") || trimmed.equals("in") || trimmed.equals("new")
        || trimmed.equals("case") || trimmed.equals("become") || trimmed.equals("self") || trimmed.equals("probably") || trimmed.equals("now") || trimmed.equals("null") || trimmed.equals("if") || trimmed.equals("else") || trimmed.equals("when") || trimmed.equals("and") || trimmed.equals("or") || trimmed.equals("try") || trimmed.equals("catch")
        || trimmed.equals("throw") || trimmed.equals("bag") || trimmed.equals("set") || trimmed.equals("export") || trimmed.equals("union") || trimmed.equals("where") || trimmed.equals("rules") || trimmed.equals("show") || trimmed.equals("from") || trimmed.equals("timeout") || trimmed.equals("kb") || trimmed.equals("parameters")
        || trimmed.equals("configuration"));
  }

  private static final boolean isBoolWord(String word) {
    String trimmed = word.trim();
    return trimmed.equals("true") || trimmed.equals("false");
  }

  private static final boolean isTypeWord(String word) {
    String trimmed = word.trim();
    return (trimmed.equals("data") || trimmed.equals("cnstr") || trimmed.equals("type") || trimmed.equals("unfold") || trimmed.equals("fold") || trimmed.equals("Void") || trimmed.equals("Fun") || trimmed.equals("rec") || trimmed.equals("Float") || trimmed.equals("Str") || trimmed.equals("Bool") || trimmed.equals("Int") || trimmed.equals("Act")
        || trimmed.equals("Set") || trimmed.equals("Bag") || trimmed.equals("Rules") || trimmed.equals("KB"));
  }
}