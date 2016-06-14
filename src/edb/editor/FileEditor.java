package edb.editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
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
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.undo.UndoManager;

import context.ParseError;
import context.StringSource;
import edb.EDB;
import edb.actions.FontAction;
import edb.actions.RedoAction;
import edb.actions.ResizeFont;
import edb.actions.SaveAction;
import edb.actions.UndoAction;
import exp.Exp;
import grammar.Grammar;
import xpl.Interpreter;

public class FileEditor extends JTextPane implements MouseListener, KeyListener, MouseMotionListener, ResizeFont, FocusListener {

  private static final int ERROR_CHAR_MARGIN = 5;

  private static final int ERROR_LENGTH      = 50;

  static StyleContext      styleContext      = new StyleContext();
  static Style             defaultStyle      = styleContext.getStyle(StyleContext.DEFAULT_STYLE);
  static Style             cwStyle           = styleContext.addStyle("ConstantWidth", null);
  static Font              font              = new Font("Consolas", Font.PLAIN, 10);

  String                   path;
  EDB                      gui;
  UndoManager              undoManager       = new UndoManager();
  Action                   undoAction        = new UndoAction(undoManager);
  Action                   redoAction        = new RedoAction(undoManager);
  Action                   saveAction        = new SaveAction(this);
  Action                   fontUpAction      = new FontAction(this, 2);
  Action                   fontDownAction    = new FontAction(this, -2);
  boolean                  dirty             = false;
  TextLineNumber           lines             = new TextLineNumber(this, font);
  ParseError               error             = null;
  int                      errorX            = 0;
  int                      errorY            = 0;

  public FileEditor(String path, EDB gui) {
    super(new KeywordStyledDocument(defaultStyle, cwStyle));
    this.path = path;
    this.gui = gui;
    StyleConstants.setForeground(cwStyle, Color.BLUE);
    StyleConstants.setBold(cwStyle, true);
    setFont(font);
    setText(readFile(path));
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
    addFocusListener(this);
    ToolTipManager.sharedInstance().registerComponent(this);
    getDocument().addUndoableEditListener(undoManager);
    registerKeyboardAction(undoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(redoAction, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(saveAction, KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
  }

  public void addBreakpoint() {
    if (lines.getSelectedLine() != -1) {
      // Careful since lines are 0-indexed, but displayed and referenced
      // via instructions as 1-indexed...
      lines.setBreakpoint(lines.getCurrentLine() + 1);
    }
  }

  public int errorStart() {
    int errorStart = error.getPosition() - ERROR_CHAR_MARGIN;
    while (errorStart >= 0 && errorStart < getText().length() && Character.isWhitespace(getText().charAt(errorStart)))
      errorStart--;
    return errorStart;
  }

  public void focusGained(FocusEvent e) {
    gui.setFocus(this);
  }

  public void focusLost(FocusEvent e) {
    // EDB maintains the last interesting thing with focus for buttons
    // to perform actions on. Assume that this 'interesting' component
    // prevails until the next 'interesting' component registers itself.
  }

  public TextLineNumber getLines() {
    return lines;
  }

  public String getToolTipText(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    if (error != null && x >= errorX && x <= errorX + ERROR_LENGTH && Math.abs(errorY - y) < getFontMetrics(getFont()).getHeight())
      return "<html>" + error.getSyntaxError().replace("\n", "<br>") + "</html>";
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

  }

  public void keyReleased(KeyEvent e) {
    if (!Character.isWhitespace(e.getKeyChar()) || e.getKeyChar() == '\b') {
      new Thread(new Runnable() {
        public void run() {
          parseText();
        }
      }).start();
    }
  }

  public void keyTyped(KeyEvent e) {
    if (!dirty) {
      dirty = true;
      gui.dirtyFile(path);
    }
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      toggleBreakpoint();
    }
  }

  public void mouseDragged(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {

  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (error != null) {
      Color c = g.getColor();
      g.setColor(Color.RED);
      g.drawLine(errorX, errorY, errorX + ERROR_LENGTH, errorY);
      g.setColor(c);
    }
  }

  public void parseText() {
    try {
      Grammar grammar = Interpreter.getGrammar("esl/esl.xpl", "esl");
      Interpreter.parseCharSource(path, grammar, "file", new StringSource(getText()), new Exp[] { new exp.Str(path) }, false);
      if (error != null) {
        error = null;
        repaint();
      }
    } catch (ParseError error) {
      this.error = error;
      Font font = getFont();
      FontMetrics metrics = getFontMetrics(font);
      String text = error.getText();
      errorX = 0;
      errorY = metrics.getHeight();
      for (int i = 0; i < errorStart(); i++) {
        char c = text.charAt(i);
        if (c == '\n') {
          errorX = 0;
          errorY += metrics.getHeight();
        } else errorX += metrics.charWidth(c);
      }
      repaint();
    }
  }

  private void popup(int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem load = new JMenuItem("Load");
    load.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (isDirty())
          System.out.println("Save " + path + " before loading.");
        else gui.load(path);
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
      gui.cleanFile(path);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void selectLine(int line) {
    lines.setSelectedLine(line);
    lines.repaint();
  }

  public void setDirty(boolean dirty) {
    this.dirty = dirty;
  }

  private void toggleBreakpoint() {
    if (hasBreakpoint())
      removeBreakpoint();
    else addBreakpoint();
  }

}
