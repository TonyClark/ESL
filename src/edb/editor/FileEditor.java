package edb.editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Highlighter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.undo.UndoManager;

import actors.Actor;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.modules.Module;
import ast.patterns.Pattern;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypePatternError;
import ast.types.Typed;
import context.ParseError;
import context.StringSource;
import edb.actions.FontAction;
import edb.actions.RedoAction;
import edb.actions.ResizeFont;
import edb.actions.SaveAction;
import edb.actions.ScrollToErrorAction;
import edb.actions.UndoAction;
import edb.tool.EDB;
import exp.Exp;
import grammar.Grammar;
import values.JavaObject;
import values.Located;
import xpl.Interpreter;

public class FileEditor extends JTextPane implements MouseListener, KeyListener, MouseMotionListener, ResizeFont, FocusListener {

  private static final int                     ERROR_CHAR_MARGIN   = 5;

  private static final int                     ERROR_LENGTH        = 50;

  private static final java.util.regex.Pattern IMPORT_PATTERN      = java.util.regex.Pattern.compile("(.*)import(.*)'(.*)'(.*)");

  private static final Color                   TYPE_ERROR_COLOR    = new Color(255, 0, 0, 50);

  private static final Color                   PATTERN_ERROR_COLOR = new Color(0, 255, 0, 50);

  private static final Color                   PARSE_ERROR_COLOR   = new Color(0, 0, 255, 50);

  private static final Color                   FAINT_GREY          = new Color(230, 230, 230, 250);

  StyleContext                                 styleContext        = new StyleContext();
  Style                                        defaultStyle        = styleContext.getStyle(StyleContext.DEFAULT_STYLE);
  Style                                        cwStyle             = styleContext.addStyle("ConstantWidth", null);
  Style                                        typeStyle           = styleContext.addStyle("ConstantWidth", null);
  Style                                        commentStyle        = styleContext.addStyle("ConstantWidth", null);
  Style                                        stringStyle         = styleContext.addStyle("ConstantWidth", null);
  Font                                         font                = new Font("Consolas", Font.PLAIN, 10);

  String                                       path;
  EDB                                          edb;
  Module                                       module              = null;
  Located                                      over;
  UndoManager                                  undoManager         = new UndoManager();
  Action                                       undoAction          = new UndoAction(undoManager);
  Action                                       redoAction          = new RedoAction(undoManager);
  Action                                       saveAction          = new SaveAction(this);
  Action                                       fontUpAction        = new FontAction(this, 2);
  Action                                       fontDownAction      = new FontAction(this, -2);
  Action                                       scrollToErrorAction = new ScrollToErrorAction(this);

  boolean                                      dirty               = false;
  TextLineNumber                               lines               = new TextLineNumber(this, font, 1);
  TextError                                    error               = null;
  int                                          errorX              = 0;
  int                                          errorY              = 0;
  int                                          flashAt             = -1;

  DefaultHighlightPainter                      painter             = new DefaultHighlighter.DefaultHighlightPainter(FAINT_GREY);
  BindingPainter                               showBinder          = new BindingPainter();

  public FileEditor(String path, EDB gui) {
    super();
    this.setStyledDocument(new KeywordStyledDocument(defaultStyle, cwStyle, typeStyle, commentStyle, stringStyle));
    this.path = path;
    this.edb = gui;
    StyleConstants.setForeground(cwStyle, Color.BLUE);
    StyleConstants.setForeground(typeStyle, new Color(120, 0, 0));
    StyleConstants.setForeground(commentStyle, new Color(51, 102, 0));
    StyleConstants.setForeground(stringStyle, Color.BLUE);
    StyleConstants.setBold(cwStyle, true);
    StyleConstants.setBold(typeStyle, true);
    StyleConstants.setBold(commentStyle, true);
    setFont(font);
    setText(readFile(path));
    typeCheckText();
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
    addFocusListener(this);
    ToolTipManager.sharedInstance().registerComponent(this);
    getDocument().addUndoableEditListener(undoManager);
    setCaretPosition(0);
    registerKeyboardAction(undoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(redoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(saveAction, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(scrollToErrorAction, KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
  }

  public void addBreakpoint() {
    if (lines.getSelectedLine() != -1) {
      // Careful since lines are 0-indexed, but displayed and referenced
      // via instructions as 1-indexed...
      lines.setBreakpoint(lines.getCurrentLine() + 1);
    }
  }

  public int backupSyntax(int textPos) {
    int errorStart = textPos - ERROR_CHAR_MARGIN;
    while (errorStart >= 0 && errorStart < getText().length() && Character.isWhitespace(getText().charAt(errorStart)))
      errorStart--;
    return errorStart;
  }

  private void concurrentlyTypeCheckText() {
    new Thread(new Runnable() {
      public void run() {
        typeCheckText();
      }
    }).start();
  }

  private void doImport(String path) {
    edb.openFile(path);
  }

  synchronized private void flashOpen(char open, char close) {

    // Work backwards to the corresponding open character. Assume that these things can nest.
    // If the corresponding open character is found then indicate via a brief flash...

    int caret = getCaretPosition();
    int indent = 1;
    int openPosition = 0;
    for (int index = caret; index >= 0 && indent > 0; index--) {
      openPosition = index;
      char c = getText().charAt(index);
      if (c == close) indent++;
      if (c == open) indent--;
    }
    if (indent == 0) {
      flashAt = openPosition;
    }

  }

  private void flashParenthesis(Graphics g) {
    if (flashAt != -1) {
      try {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = modelToView(flashAt);
        Rectangle2D t = g2.getFontMetrics().getStringBounds("(", g);
        g.fillRect(r.x, r.y, (int) t.getWidth(), (int) t.getHeight());
        flashAt = -1;
      } catch (BadLocationException e) {
        e.printStackTrace();
      }
    }
  }

  public void focusGained(FocusEvent e) {

    // EDB maintains the last interesting thing with focus for buttons
    // to perform actions on. Assume that this 'interesting' component
    // prevails until the next 'interesting' component registers itself.

    edb.setFocus(this);
  }

  public void focusLost(FocusEvent e) {
  }

  private String getImport(Point point) {
    int index = viewToModel(point);
    String line = getLineContaining(index).trim();
    Matcher m = IMPORT_PATTERN.matcher(line);
    if (m.matches())
      return m.group(3);
    else return null;
  }

  private int getLine(int textPos) {
    String text = getText();
    int line = 1;
    for (int i = 0; i < textPos; i++) {
      if (text.charAt(i) == '\n') line++;
    }
    return line;
  }

  private String getLineContaining(int index) {
    String text = getText();
    int start = index;
    int end = index;
    while (start >= 0 && text.charAt(start) != '\n')
      start--;
    while (end < text.length() && text.charAt(end) != '\n')
      end++;
    if (start == end)
      return "";
    else return text.substring(start + 1, end);
  }

  public TextLineNumber getLines() {
    return lines;
  }

  public String getToolTipText(MouseEvent e) {
    if (error != null)
      return tooltipError(e);
    else if (over != null)
      return tooltipSyntax(e);

    else return super.getToolTipText(e);
  }

  public boolean hasBreakpoint() {
    return lines.hasBreakpoint(lines.getCurrentLine());
  }

  public boolean isBreakpoint(int line) {
    return lines.hasBreakpoint(line);
  }

  public boolean isDirty() {
    return dirty;
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyChar() == ')') flashOpen('(', ')');
    if (e.getKeyChar() == '}') flashOpen('{', '}');
    if (e.getKeyChar() == ']') flashOpen('[', ']');
  }

  public void keyReleased(KeyEvent e) {
    if (e.getKeyChar() == '\n') {
      insertNewline();
      e.consume();
    }
    if (!Character.isWhitespace(e.getKeyChar()) || e.getKeyChar() == '\b') {
      concurrentlyTypeCheckText();
    }

  }

  private void insertNewline() {

    // Indent based on current line...

    try {
      int indent = getcurrentIndent(getCaretPosition() - 2);
      String spaces = (indent == 0) ? "" : String.format("%" + indent + "s", "");
      getDocument().insertString(getCaretPosition(), spaces, getCharacterAttributes());
    } catch (BadLocationException e1) {
      e1.printStackTrace();
    }
  }

  public void keyTyped(KeyEvent e) {
    if (!dirty) {
      dirty = true;
      edb.dirtyFile(path);
    }
  }

  private int getcurrentIndent(int index) {

    // Return the indent of the line preceding the text position supplied as index...

    String text = getText();
    int startPrevLine = -1;
    for (int i = index; i >= 0 && startPrevLine == -1; i--) {
      if (text.charAt(i) == '\n') startPrevLine = i + 1;
    }
    int indent = 0;
    for (int i = startPrevLine; i < index + 1; i++)
      if (Character.isWhitespace(text.charAt(i)))
        indent++;
      else break;
    return indent;
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      String importedPath = getImport(e.getPoint());
      if (importedPath != null)
        doImport(importedPath);
      else toggleBreakpoint();
    }
  }

  public void mouseDragged(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {

    // If the mouse has moved then it may hover over a syntax element.
    // This code converts the mouse position to a text position and then
    // asks the module for the located element at that text position.
    // It tries to do as little work as possible: if the mouse is not
    // over text (viewToModel will get the nearest text position) then
    // the variable over is not set...

    over = null;
    if (module != null) {
      int charIndex = viewToModel(e.getPoint());
      try {
        Rectangle r = modelToView(charIndex);
        int dx = (int) Math.abs(r.getX() - e.getX());
        int dy = (int) Math.abs(r.getY() - e.getY());
        if (dx < 10 && dy < r.getHeight()) {
          over = module.getLocated(charIndex);
        }
      } catch (BadLocationException e1) {
        e1.printStackTrace();
      }
    }
  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    paintError(g);
    flashParenthesis(g);
    paintSyntax(g);
  }

  private void paintError(Graphics g) {
    if (error != null) {
      edb.fileHasError(path, true);
      Graphics2D g2 = (Graphics2D) g;
      int height = g2.getFontMetrics().getHeight();
      int descent = g2.getFontMetrics().getDescent();
      int length = error.getLineEnd() - error.getLineStart();
      int width = g2.getFontMetrics().charWidth(' ') * (length <= 0 ? 10 : length);
      Color c = g.getColor();
      g.setColor(error.getColor());
      g.fillRect(errorX, errorY - (height - descent), width, height);
      g.setColor(c);
    } else {
      edb.fileHasError(path, false);
    }
  }

  private void paintSyntax(Graphics g1) {
    Highlighter highlighter = getHighlighter();
    highlighter.removeAllHighlights();
    if (over != null) {
      try {
        highlighter.addHighlight(over.getLineStart(), over.getLineEnd(), painter);
        if (over instanceof ReferencingLocation) {
          ReferencingLocation location = (ReferencingLocation) over;
          DeclaringLocation dec = location.getDeclaringLocation();
          if (dec != null) {
            String name = dec.getName();
            showBinder.setName(name);
            if (dec != null) {
              int p0 = location.getLineStart();
              int p1 = dec.getLineStart();
              if (p0 < p1)
                highlighter.addHighlight(p0, p1, showBinder);
              else highlighter.addHighlight(p1, p0, showBinder);
            }
          }
        }
      } catch (BadLocationException e) {
      }
    }
  }

  public Module parseText() {
    try {
      error = null;
      module = null;
      Grammar grammar = Interpreter.getGrammar("esl/esl.xpl", "esl");
      Object o = Interpreter.parseCharSource(path, grammar, "file", new StringSource(getText()), new Exp[] { new exp.Str(path) }, false);
      repaint();
      JavaObject jo = (JavaObject) o;
      module = (Module) jo.getTarget();
      module = Module.processModule(path, module);
      return module;
    } catch (ParseError error) {
      setError(backupSyntax(error.getPosition()), 0, error.getMessage(), PARSE_ERROR_COLOR);
      repaint();
    } catch (FileNotFoundException e) {
      setError(0, 0, e.getMessage(), PARSE_ERROR_COLOR);
      repaint();
    }
    return null;
  }

  private void popup(int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem load = new JMenuItem("Load");
    load.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (isDirty())
          System.out.println("Save " + path + " before loading.");
        else edb.load(path);
      }
    });
    JMenuItem save = new JMenuItem("Save");
    save.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        save(path);
      }
    });
    JMenuItem addBreakpoint = new JMenuItem("Add Breakpoint");
    addBreakpoint.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        addBreakpoint();
      }
    });
    JMenuItem removeBreakpoint = new JMenuItem("Remove Breakpoint");
    removeBreakpoint.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        removeBreakpoint();
      }
    });
    JMenuItem undo = new JMenuItem("Undo");
    undo.addActionListener(undoAction);
    JMenuItem redo = new JMenuItem("Redo");
    redo.addActionListener(redoAction);
    popup.add(load);
    popup.add(save);
    popup.add(redo);
    popup.add(undo);
    popup.add(addBreakpoint);
    popup.add(removeBreakpoint);
    popup.show(this, x, y);
  }

  private String readFile(String path) {
    try {
      FileInputStream in = new FileInputStream(path);
      StringBuffer buf = new StringBuffer();
      int c = in.read();
      while (c != -1) {
        buf.append((char) c);
        c = in.read();
      }
      in.close();
      return buf.toString();
    } catch (FileNotFoundException e) {
      return e.toString();
    } catch (IOException e) {
      return e.toString();
    }
  }

  public void removeBreakpoint() {
    if (lines.getSelectedLine() != -1) {
      lines.removeBreakpoint(lines.getCurrentLine());
    }
  }

  public void resizeFont(int amount) {
    Font font = getFont();
    int size = Math.max(font.getSize() + amount, 2);
    Font newFont = font.deriveFont(font.getStyle(), size);
    setFont(newFont);
    lines.setFont(newFont);
    repaint();
  }

  public void save() {
    save(path);
  }

  public void save(String path) {
    try {
      PrintWriter fos = new PrintWriter(new FileOutputStream(path));
      fos.println(getText());
      fos.close();
      dirty = false;
      edb.cleanFile(path);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void scrollToError() {
    if (error != null) {
      Rectangle r = new Rectangle(errorX, errorY, 10, 10);
      scrollRectToVisible(r);
    }
  }

  public void selectLine(int textPos) {
    lines.setSelectedLine(getLine(textPos));
    lines.repaint();
  }

  public void setDirty(boolean dirty) {
    this.dirty = dirty;
  }

  private void setError(int start, int end, String message, Color color) {
    error = new TextError(start, end, message, color);
    Font font = getFont();
    FontMetrics metrics = getFontMetrics(font);
    try {
      Rectangle r = modelToView(start);
      if (r != null) {
        errorX = r.x;
        errorY = r.y + metrics.getHeight();
      }
    } catch (BadLocationException e) {
      errorX = 0;
      errorY = 0;
    }
  }

  private void toggleBreakpoint() {
    if (hasBreakpoint())
      removeBreakpoint();
    else addBreakpoint();
  }

  private String tooltipError(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    if (error != null && x >= errorX && x <= errorX + ERROR_LENGTH && Math.abs(errorY - y) < getFontMetrics(getFont()).getHeight()) {
      String font = "<font color='red' size='2' face='Consolas'>";
      return "<html>" + font + error.getMessage().replace("\n", "<br>") + "</font></html>";
    } else return "";
  }

  private String tooltipSyntax(MouseEvent e) {
    if (over != null) {
      if (over instanceof Var) {
        Var var = (Var) over;
        Type type = var.getType();
        String font = "<font color='blue' size='2' face='Consolas'>";
        return "<html>" + font + var.getName() + "::" + type + "</font></html>";
      } else if (over instanceof Typed) {
        Typed typed = (Typed) over;
        Type type = typed.getType();
        if (type != null) {
          String font = "<font color='blue' size='2' face='Consolas'>";
          return "<html>" + font + ":: " + type + "</font></html>";
        } else return null;
      } else return null;
    } else return null;
  }

  protected void typeCheckText() {
    Module module = parseText();
    if (module != null) typeCheckText(module);
  }

  public void typeCheckText(Module module) {
    try {
      error = null;
      module.type(Actor.builtinTypes());
      edb.displayTree(module);
      repaint();
    } catch (TypeError e) {
      e.printStackTrace(System.err);
      setError(e.getLineStart(), e.getLineEnd(), e.getMessage(), TYPE_ERROR_COLOR);
      repaint();
    } catch (TypePatternError e) {
      e.printStackTrace(System.err);
      Pattern p = e.getPattern();
      setError(p.getLineStart(), p.getLineEnd(), e.getMessage(), PATTERN_ERROR_COLOR);
      repaint();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
