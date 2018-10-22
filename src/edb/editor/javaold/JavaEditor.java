package edb.editor.javaold;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import com.google.googlejavaformat.FormatterDiagnostic;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import edb.actions.JavaFormatAction;
import edb.editor.file.Doc;
import edb.editor.file.FileEditor;
import edb.tool.EDB;
import values.LocationContainer;

public class JavaEditor extends FileEditor {

  Action  formatAction = new JavaFormatAction(this);
  boolean check        = true;

  public JavaEditor(String path, EDB gui) {
    super(path, gui, getJavaDoc());
    registerKeyboardAction(formatAction, KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK | InputEvent.SHIFT_DOWN_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(formatAction, KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.META_MASK | InputEvent.SHIFT_DOWN_MASK), JComponent.WHEN_FOCUSED);
  }

  private static Doc getJavaDoc() {
    JavaDoc doc = new JavaDoc();
    Color comment = new Color(63, 197, 95);
    Color javadoc = new Color(63, 95, 191);
    Color annotation = new Color(100, 100, 100);
    Map<String, Color> keywords = new HashMap<String, Color>();
    doc.setCommentColor(comment);
    doc.setJavadocColor(javadoc);
    doc.setAnnotationColor(annotation);

    Color defColor = new Color(127, 0, 85);
    keywords.put("abstract", defColor);
    keywords.put("boolean", defColor);
    keywords.put("break", defColor);
    keywords.put("byte", defColor);
    keywords.put("case", defColor);
    keywords.put("catch", defColor);
    keywords.put("char", defColor);
    keywords.put("class", defColor);
    keywords.put("continue", defColor);
    keywords.put("default", defColor);
    keywords.put("do", defColor);
    keywords.put("double", defColor);
    keywords.put("enum", defColor);
    keywords.put("extends", defColor);
    keywords.put("else", defColor);
    keywords.put("false", defColor);
    keywords.put("final", defColor);
    keywords.put("finally", defColor);
    keywords.put("float", defColor);
    keywords.put("for", defColor);
    keywords.put("if", defColor);
    keywords.put("implements", defColor);
    keywords.put("import", defColor);
    keywords.put("instanceof", defColor);
    keywords.put("int", defColor);
    keywords.put("interface", defColor);
    keywords.put("long", defColor);
    keywords.put("native", defColor);
    keywords.put("new", defColor);
    keywords.put("null", defColor);
    keywords.put("package", defColor);
    keywords.put("private", defColor);
    keywords.put("protected", defColor);
    keywords.put("public", defColor);
    keywords.put("return", defColor);
    keywords.put("short", defColor);
    keywords.put("static", defColor);
    keywords.put("super", defColor);
    keywords.put("switch", defColor);
    keywords.put("synchronized", defColor);
    keywords.put("this", defColor);
    keywords.put("throw", defColor);
    keywords.put("throws", defColor);
    keywords.put("transient", defColor);
    keywords.put("true", defColor);
    keywords.put("try", defColor);
    keywords.put("void", defColor);
    keywords.put("volatile", defColor);
    keywords.put("while", defColor);
    doc.setKeywords(keywords);
    return doc;

  }

  public FileEditor copyEditor() {
    throw new Error("not implemented.");
  }

  public void loadAction() {

  }

  public LocationContainer parseText() {
    return null;
  }

  public void run() {
    throw new Error("not implemented.");
  }

  public void textChanged() {
    if (check) {
      resetEditor();
      checkErrors();
    }
  }

  public void checkErrors() {
    Formatter formatter = new Formatter();
    String text = getText();
    try {
      formatter.formatSource(text);
    } catch (FormatterException formatException) {
      for (FormatterDiagnostic d : formatException.diagnostics()) {
        int line = d.line() - 1;
        int column = d.column() - 1;
        int charStart = 0;
        while (line > 0) {
          if (text.charAt(charStart) == '\n') line--;
          charStart++;
        }
        edb.error(path, charStart + column, d.message());
      }
    }
  }

  public void typeCheck() {
  }

  public void format() {
    Formatter formatter = new Formatter();
    String text = getText();
    try {
      text = formatter.formatSource(text);
      if (text.length() > 0 && !text.equals(getText())) {
        check = false;
        setText(text);
        check = true;
      }
    } catch (FormatterException formatException) {
      for (FormatterDiagnostic d : formatException.diagnostics()) {
        int line = d.line() - 1;
        int column = d.column() - 1;
        int charStart = 0;
        while (line > 0) {
          if (text.charAt(charStart) == '\n') line--;
          charStart++;
        }
        edb.error(path, charStart + column, d.message());
      }
    }
  }

}
