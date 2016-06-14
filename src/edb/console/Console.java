package edb.console;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;

import edb.EDB;
import edb.actions.FontAction;
import edb.actions.ResizeFont;

public class Console extends JTextPane implements MouseListener, ResizeFont, FocusListener {

  static Font font           = new Font("Courier", Font.PLAIN, 10);

  Action      fontUpAction   = new FontAction(this, 2);
  Action      fontDownAction = new FontAction(this, -2);
  EDB         edb;

  public Console(EDB edb) {
    this.edb = edb;
    setFont(font);
    addMouseListener(this);
    addFocusListener(this);
    registerKeyboardAction(fontUpAction, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(fontDownAction, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
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
    JMenuItem menuItem = new JMenuItem("Clear");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        clear();
      }
    });
    popup.add(menuItem);
    popup.show(this, x, y);
  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {

  }

  public void write(char c) {
    try {
      getDocument().insertString(getDocument().getLength(), "" + (char) c, null);
      setCaretPosition(getText().length());
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

}
