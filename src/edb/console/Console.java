package edb.console;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import context.TopLevel;
import edb.actions.FontAction;
import edb.actions.ResizeFont;
import edb.tool.EDB;
import env.Empty;
import env.Env;
import grammar.Call;
import grammar.Grammar;
import machine.Machine;
import values.Value;
import xpl.Interpreter;

public class Console extends JTextPane implements MouseListener, ResizeFont, FocusListener, KeyListener, Runnable {

  private static final int MAX_OUTPUT_STRING = 300;

  static Font              font              = new Font("Courier", Font.PLAIN, 10);
  static Color             NORMAL_BACKGROUND = Color.white;
  static Color             PAUSED_BACKGROUND = Color.gray;
  static Color             OUTPUT_COLOUR     = Color.blue;
  static Color             INPUT_COLOUR      = Color.green;

  Action                   fontUpAction      = new FontAction(this, 2);
  Action                   fontDownAction    = new FontAction(this, -2);
  SimpleAttributeSet       outputStyle       = new SimpleAttributeSet();
  SimpleAttributeSet       inputStyle        = new SimpleAttributeSet();
  ConsoleInputStream       in                = new ConsoleInputStream();
  boolean                  paused            = false;
  StringBuffer             chars             = new StringBuffer();
  EDB                      edb;

  public Console(EDB edb) {
    this.edb = edb;
    setFont(font);
    addMouseListener(this);
    addFocusListener(this);
    setBackground(NORMAL_BACKGROUND);
    StyleConstants.setForeground(outputStyle, OUTPUT_COLOUR);
    StyleConstants.setForeground(inputStyle, INPUT_COLOUR);
    setCharacterAttributes(inputStyle, false);
    addKeyListener(this);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
  }

  public void startInterpreter() {
    new Thread(this).start();
  }

  public void clear() {
    setText("");
  }

  public void mouseClicked(MouseEvent e) {

  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  private void popup(int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem clear = new JMenuItem("Clear");
    clear.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        clear();
      }
    });
    popup.add(clear);
    JMenuItem pause = new JMenuItem("Pause");
    pause.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        pause();
      }
    });
    popup.add(pause);
    JMenuItem restart = new JMenuItem("Restart");
    restart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        restart();
      }
    });
    popup.add(restart);
    popup.show(this, x, y);
  }

  protected void restart() {
    paused = false;
    setBackground(NORMAL_BACKGROUND);
    flush();
  }

  protected void pause() {
    paused = true;
    setBackground(PAUSED_BACKGROUND);
  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {

  }

  public void write(String s) {
    for (int i = 0; i < s.length(); i++) {
      write(s.charAt(i));
    }
  }

  public void write(char c) {
    chars.append(c);
    if (c == '\n' && !paused) {
      // SwingUtilities.invokeLater(new Runnable() {
      // public void run() {
      flush();
      // }
      // });
    }
  }

  protected void flush() {
    try {
      String s = chars.toString();
      chars.delete(0, chars.length());
      if (s.length() > MAX_OUTPUT_STRING) s = s.substring(0, MAX_OUTPUT_STRING) + "...\n";
      AttributeSet attributes = getCharacterAttributes();
      getDocument().insertString(getDocument().getLength(), s, outputStyle);
      setCharacterAttributes(attributes, false);
      setCaretPosition(getDocument().getLength());
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }

  public void resizeFont(int amount) {
    Font font = getFont();
    int size = Math.max(font.getSize() + amount, 2);
    Font newFont = font.deriveFont(font.getStyle(), size);
    setFont(newFont);
    repaint();
  }

  public void focusGained(FocusEvent e) {
    edb.setFocus(this);
  }

  public void focusLost(FocusEvent e) {
    // EDB maintains the last interesting thing with focus for buttons
    // to perform actions on. Assume that this 'interesting' component
    // prevails until the next 'interesting' component registers itself.
  }

  public void keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    int i = (int) c;
    if (c == '\n' || (i >= 32 && i <= 197)) {
      in.addChar(c);
    }
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) in.delete();
  }

  public void keyReleased(KeyEvent e) {
  }

  public void run() {
    Env<String, Value> env = new Empty<String, Value>();
    Grammar grammar = Interpreter.getGrammar("xpl/query.xpl", "query");
    while (true) {
      write("> ");
      flush();
      Machine machine = new Machine(grammar, env, new Stack<Integer>(), new TopLevel(in), 0, null, 0);
      machine.pushInstr(new Call("topLevelCommands"));
      Value value = machine.run();
      if (!machine.isOk())
        write(machine.getError().toString());
      else {
        ast.query.body.Call[] calls = (ast.query.body.Call[]) values.Value.toJava(value, ast.query.body.Call[].class);
        edb.interactiveQuery(calls);
      }
    }
  }

}
