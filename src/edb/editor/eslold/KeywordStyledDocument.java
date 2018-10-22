package edb.editor.eslold;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import edb.editor.file.*;

public class KeywordStyledDocument extends DefaultStyledDocument {

  private static final long serialVersionUID = 1L;
  private Style             _defaultStyle;
  private Style             _cwStyle;
  private Style             _typeStyle;
  private Style             _commentStyle;
  private Style             _stringStyle;

  public KeywordStyledDocument(Style defaultStyle, Style cwStyle, Style typeStyle, Style commentStyle, Style stringStyle) {
    _defaultStyle = defaultStyle;
    _cwStyle = cwStyle;
    _typeStyle = typeStyle;
    _commentStyle = commentStyle;
    _stringStyle = stringStyle;
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
      if (word.keyType() == KeywordType.VALUE)
        setCharacterAttributes(p0, word._word.length(), _cwStyle, true);
      else if (word.keyType() == KeywordType.TYPE)
        setCharacterAttributes(p0, word._word.length(), _typeStyle, true);
      else if (word.keyType() == KeywordType.COMMENT)
        setCharacterAttributes(p0, word._word.length(), _commentStyle, true);
      else if (word.keyType() == KeywordType.STRING) setCharacterAttributes(p0, word._word.length(), _stringStyle, true);
    }
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
            }
            if (isTypeWord(word)) {
              hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.TYPE));
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
    return (word.trim().equals("then") || word.trim().equals("grab") || word.trim().equals("act") || word.trim().equals("import") || word.trim().equals("for") || word.trim().equals("find") || word.trim().equals("do") || word.trim().equals("not") || word.trim().equals("fun") || word.trim().equals("letrec") || word.trim().equals("let")
        || word.trim().equals("in") || word.trim().equals("new") || word.trim().equals("true") || word.trim().equals("false") || word.trim().equals("case") || word.trim().equals("become") || word.trim().equals("self") || word.trim().equals("probably") || word.trim().equals("now") || word.trim().equals("null") || word.trim().equals("if")
        || word.trim().equals("else") || word.trim().equals("when") || word.trim().equals("and") || word.trim().equals("or") || word.trim().equals("try") || word.trim().equals("catch") || word.trim().equals("throw") || word.trim().equals("bag") || word.trim().equals("set") || word.trim().equals("export") || word.trim().equals("union")
        || word.trim().equals("where") || word.trim().equals("rules") || word.trim().equals("kb"));
  }

  private static final boolean isTypeWord(String word) {
    return (word.trim().equals("type") || word.trim().equals("unfold") || word.trim().equals("fold") || word.trim().equals("Void") || word.trim().equals("Fun") || word.trim().equals("rec") || word.trim().equals("Float") || word.trim().equals("Str") || word.trim().equals("Bool") || word.trim().equals("Int") || word.trim().equals("Act")
        || word.trim().equals("Set") || word.trim().equals("Bag"));
  }
}