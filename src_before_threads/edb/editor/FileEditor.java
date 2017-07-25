package edb.editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.JToolTip;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Highlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.undo.UndoManager;

import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.binding.declarations.ReferencingLocation;
import ast.types.Type;
import ast.types.Typed;
import edb.actions.FindReplaceAction;
import edb.actions.FontAction;
import edb.actions.JoinAction;
import edb.actions.RedoAction;
import edb.actions.ResizeFont;
import edb.actions.SaveAction;
import edb.actions.ScrollToErrorAction;
import edb.actions.SplitAction;
import edb.actions.UndoAction;
import edb.tool.EDB;
import values.Located;
import values.LocationContainer;

public abstract class FileEditor extends JTextPane implements MouseListener, KeyListener, MouseMotionListener, ResizeFont, FocusListener {

  // A generic file editor. To be specialized for specific types of file content.

  private static final int     ERROR_CHAR_MARGIN          = 5;
  private static final int     ERROR_LENGTH               = 50;
  protected static final Color PARSE_ERROR_COLOR          = new Color(0, 0, 255);
  private static final Color   FAINT_GREY                 = new Color(230, 230, 230);
  private static final int     TOOLTIP_INITIAL_DELAY      = 0;
  private static final int     TOOLTIP_DISMISS_DELAY      = 20000;
  private static final int     SCOLLABLE_TOOL_TIP_WIDTH   = 400;
  private static final int     SCROLLABLE_TOOL_TIP_HEIGHT = 200;

  Font                         font                       = new Font("Consolas", Font.PLAIN, 11);
  Font                         messageFont                = new Font("Ariel", Font.ITALIC, 10);
  Color                        messageColor               = new Color(100, 0, 0);
  String                       path;
  EDB                          edb;
  Located                      over;
  DeclaringLocation            declaration;

  UndoManager                  undoManager                = new UndoManager();
  Action                       undoAction                 = new UndoAction(undoManager);
  Action                       redoAction                 = new RedoAction(undoManager);
  Action                       saveAction                 = new SaveAction(this);
  Action                       fontUpAction               = new FontAction(this, 2);
  Action                       fontDownAction             = new FontAction(this, -2);
  Action                       scrollToErrorAction        = new ScrollToErrorAction(this);
  Action                       findReplaceAction          = new FindReplaceAction(this);
  Action                       splitAction                = new SplitAction(this);
  Action                       joinAction                 = new JoinAction(this);

  boolean                      dirty                      = false;
  TextLineNumber               lines                      = new TextLineNumber(this, font, 1);
  TextError                    error                      = null;
  int                          errorX                     = 0;
  int                          errorY                     = 0;
  int                          flashAt                    = -1;

  DefaultHighlightPainter      painter                    = new DefaultHighlighter.DefaultHighlightPainter(FAINT_GREY);
  BindingPainter               showBinder                 = new BindingPainter();
  OverPainter                  overPainter                = new OverPainter();
  Object                       overTag                    = null;
  Object                       binderTag                  = null;
  LocationContainer            container                  = null;
  String                       message                    = null;

  public FileEditor(String path, EDB gui) {
    super();
    this.path = path;
    this.edb = gui;
    setFont(font);
    setStyle();
    setText(readFile(path));
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
    addFocusListener(this);
    ToolTipManager.sharedInstance().registerComponent(this);
    ToolTipManager.sharedInstance().setDismissDelay(TOOLTIP_DISMISS_DELAY);
    ToolTipManager.sharedInstance().setInitialDelay(TOOLTIP_INITIAL_DELAY);
    getDocument().addUndoableEditListener(undoManager);
    setCaretPosition(0);
    ActionListener copyAction = getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
    ActionListener pasteAction = getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
    registerKeyboardAction(copyAction, KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(pasteAction, KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(undoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(undoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(redoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(redoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(saveAction, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(saveAction, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(splitAction, KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(splitAction, KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(joinAction, KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(joinAction, KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(scrollToErrorAction, KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(scrollToErrorAction, KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(findReplaceAction, KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(findReplaceAction, KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
  }

  public int backupSyntax(int textPos) {
    int errorStart = textPos - ERROR_CHAR_MARGIN;
    while (errorStart >= 0 && errorStart < getText().length() && Character.isWhitespace(getText().charAt(errorStart)))
      errorStart--;
    return errorStart;
  }

  public abstract FileEditor copyEditor();

  public JToolTip createToolTip() {
    // If we need a scrollable tooltip then return one, otherwise use the default...
    if (declaration != null) {
      String text = getText();
      int newlines = 0;
      for (int i = declaration.getLineStart(); i < declaration.getLineEnd(); i++) {
        if (text.charAt(i) == '\n') newlines++;
      }
      if (newlines > 10) {
        ScrollableToolTip tip = new ScrollableToolTip(SCOLLABLE_TOOL_TIP_WIDTH, SCROLLABLE_TOOL_TIP_HEIGHT);
        tip.setComponent(this);
        return tip;
      } else return super.createToolTip();
    } else return super.createToolTip();
  }

  synchronized private void flashOpen(char open, char close) {

    // Work backwards to the corresponding open character. Assume that these
    // things can nest.
    // If the corresponding open character is found then indicate via a brief
    // flash...

    int caret = getCaretPosition();
    int indent = 1;
    int openPosition = 0;
    for (int index = caret - 1; index >= 0 && indent > 0; index--) {
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

  private int getcurrentIndent(int index) {

    // Return the indent of the line preceding the text position supplied as
    // index...

    String text = getText();
    int startPrevLine = -1;
    for (int i = index; i >= 0 && startPrevLine == -1; i--) {
      if (text.charAt(i) == '\n') startPrevLine = i + 1;
    }
    int indent = 0;
    startPrevLine = Math.max(startPrevLine, 0);
    for (int i = startPrevLine; i < index + 1; i++)
      if (Character.isWhitespace(text.charAt(i)))
        indent++;
      else break;
    return indent;
  }

  public EDB getEDB() {
    return edb;
  }

  private int getLine(int textPos) {
    String text = getText();
    int line = 1;
    for (int i = 0; i < textPos; i++) {
      if (text.charAt(i) == '\n') line++;
    }
    return line;
  }

  protected String getLineContaining(int index) {
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

  public String getMessage() {
    return message;
  }

  public String getPath() {
    return path;
  }

  public String getToolTipText(MouseEvent e) {
    if (error != null)
      return tooltipError(e);
    else if (over != null)
      return tooltipSyntax(e);

    else return super.getToolTipText(e);
  }

  private synchronized void handleMouseMoved(MouseEvent e) {

    // If the mouse has moved then it may hover over a syntax element.
    // This code converts the mouse position to a text position and then
    // asks the module for the located element at that text position.
    // It tries to do as little work as possible: if the mouse is not
    // over text (viewToModel will get the nearest text position) then
    // the variable over is not set...

    over = null;
    declaration = null;
    Doc doc = (Doc) getStyledDocument();
    doc.setStart(-1);
    doc.setEnd(-1);
    if (container != null) {
      int charIndex = viewToModel(e.getPoint());
      try {
        Rectangle r = modelToView(charIndex);
        int dx = (int) Math.abs(r.getX() - e.getX());
        int dy = (int) Math.abs(r.getY() - e.getY());
        if (dx < 10 && dy < r.getHeight()) {
          SimpleAttributeSet sas = new SimpleAttributeSet();
          StyleConstants.setBold(sas, false);
          over = container.getLocated(charIndex);
        }
      } catch (BadLocationException e1) {
        e1.printStackTrace();
      }
    }
    highlightSyntax();
  }

  private boolean hiddenLocation(Located location) {
    try {
      Rectangle visible = getVisibleRect();
      Rectangle startLocation = modelToView(location.getLineStart());
      return !visible.contains(startLocation.getX(), startLocation.getY());
    } catch (BadLocationException e) {
      return false;
    }
  }

  public synchronized void highlightSyntax() {
    try {
      Highlighter highlighter = getHighlighter();
      Doc doc = (Doc) getStyledDocument();
      if (overTag != null) highlighter.removeHighlight(overTag);
      if (binderTag != null) highlighter.removeHighlight(binderTag);
      if (over != null) {
        overTag = highlighter.addHighlight(over.getLineStart(), over.getLineEnd(), overPainter);
        doc.setStart(over.getLineStart());
        doc.setEnd(over.getLineEnd());
        doc.refreshDocument();
        if (over instanceof ReferencingLocation) {
          ReferencingLocation location = (ReferencingLocation) over;
          declaration = location.getDeclaringLocation();
          if (declaration != null) {
            String name = declaration.getName();
            showBinder.setName(name);
            if (declaration != null) {
              int p0 = location.getLineStart();
              int p1 = declaration.getLineStart();
              if (p0 < p1) {
                showBinder.setDirection(BindingPainter.FORWARDS);
                binderTag = highlighter.addHighlight(p0, p1, showBinder);
              } else {
                showBinder.setDirection(BindingPainter.BACKWARDS);
                binderTag = highlighter.addHighlight(p1, p0, showBinder);
              }
            }
          }
        }
      }
      doc.refreshDocument();
    } catch (BadLocationException e) {
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
      textChanged();
    }
  }

  public void keyTyped(KeyEvent e) {
    if (!dirty) {
      dirty = true;
      edb.dirtyFile(path);
    }
  }

  public void load() {
    if (isDirty())
      System.out.println("Save " + path + " before loading.");
    else loadAction();
  }

  public abstract void loadAction();

  public void mouseClicked(MouseEvent e) {
  }

  public void mouseDragged(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {
    handleMouseMoved(e);
  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger())
      popup(e.getX(), e.getY());
    else {
      if (over != null) {
        if (over instanceof DeclaringLocation) {
          edb.editorSelectedDeclaration(path, (DeclaringLocation) over);
        }
      }
    }
  }

  public void mouseReleased(MouseEvent e) {
    if (EDB.getOsflag().startsWith("Win")) if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    paintError(g);
    paintMessage(g);
    flashParenthesis(g);
  }

  public void paintError(Graphics g) {
    if (error != null) {
      edb.fileHasError(path, true);
      Graphics2D g2 = (Graphics2D) g;
      g2 = (Graphics2D) g2.create();
      // int height = g2.getFontMetrics().getHeight();
      // int descent = g2.getFontMetrics().getDescent();
      int length = error.getLineEnd() - error.getLineStart();
      int width = g2.getFontMetrics().charWidth(' ') * (length <= 0 ? 10 : length);
      // Color c = g.getColor();
      g2.setColor(error.getColor());
      // g.fillRect(errorX, errorY - (height - descent), width, height);
      // g.setColor(c);
      for (int x = 0; x < width; x = x + 5) {
        QuadCurve2D.Double e = new QuadCurve2D.Double(errorX + x, errorY, errorX + x + 2.5, errorY + 2.5, errorX + x + 5, errorY);
        g2.draw(e);
      }
      g2.dispose();
    } else {
      edb.fileHasError(path, false);
    }
  }

  private void paintMessage(Graphics g) {
    if (message != null) {
      Font f = g.getFont();
      Color c = g.getColor();
      g.setFont(messageFont);
      g.setColor(messageColor);
      Rectangle r = getVisibleRect();
      int x = (int) (r.getX() + r.getWidth());
      int y = (int) (r.getY() + r.getHeight());
      int width = g.getFontMetrics().stringWidth(message);
      g.drawString(message, x - width, y);
      g.setFont(f);
      g.setColor(c);
    }
  }

  public abstract LocationContainer parseText();

  protected void populate(JPopupMenu popup) {
    JMenuItem save = new JMenuItem("Save");
    save.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        save(path);
      }
    });
    JMenuItem undo = new JMenuItem("Undo");
    undo.addActionListener(undoAction);
    JMenuItem redo = new JMenuItem("Redo");
    redo.addActionListener(redoAction);
    JMenuItem split = new JMenuItem("Split");
    split.addActionListener(splitAction);
    JMenuItem join = new JMenuItem("Join");
    join.addActionListener(joinAction);
    popup.add(save);
    popup.add(redo);
    popup.add(undo);
    popup.add(split);
    popup.add(join);
  }

  public void popup(int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    populate(popup);
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

  public void resetEditor() {
    error = null;
    errorX = 0;
    errorY = 0;
    container = null;
    over = null;
  }

  public void resizeFont(int amount) {
    Font font = getFont();
    int size = Math.max(font.getSize() + amount, 2);
    Font newFont = font.deriveFont(font.getStyle(), size);
    setFont(newFont);
    lines.setFont(newFont);
    repaint();
  }

  public abstract void run();

  public void save() {
    textChanged();
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

  protected void setError(int start, int end, String message, Color color) {
    error = new TextError(start, end, message, color);
    Font font = getFont();
    FontMetrics metrics = getFontMetrics(font);
    try {
      Rectangle r = modelToView(start);
      if (r != null) {
        errorX = r.x;
        errorY = r.y + metrics.getHeight();
      } else {
        errorX = -1;
        errorY = -1;
      }
    } catch (BadLocationException e) {
      errorX = 0;
      errorY = 0;
    }
  }

  public void setMessage(String message) {
    this.message = message;
  }

  protected void setStyle() {
  }

  public void showTextAt(int index) {
    try {
      Rectangle r = modelToView(index);
      setCaretPosition(index);
      scrollRectToVisible(r);
    } catch (BadLocationException e) {
    }

  }

  public void split() {
    edb.getFileEditors().split(this);
  }

  public void join() {
    edb.getFileEditors().join(this);
  }

  public abstract void textChanged();

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
      if (declaration != null && hiddenLocation(declaration)) {
        String text = getText();
        text = text.substring(declaration.getLineStart());
        text = text.substring(0, declaration.getLineEnd() - declaration.getLineStart());
        String font = "<font color='red' size='2' face='Consolas'>";
        return "<html>" + font + text.replace("\n", "<br>").replaceAll(" ", "&nbsp;") + "</font></html>";
      } else if (over instanceof Var) {
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

  public abstract void typeCheck();

}