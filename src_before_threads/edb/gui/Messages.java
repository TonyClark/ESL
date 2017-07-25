package edb.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import runtime.messages.Message;

public class Messages extends JPanel implements MouseListener {

  static Font font = new Font("Courier", Font.PLAIN, 10);

  Vector<Message> messages = new Vector<Message>();
  JList<Message> list = new JList<Message>(new Message[] {});

  public Messages() {
    super();
    addMouseListener(this);
    list.setFont(font);
    setLayout(new BorderLayout());
    add(new JScrollPane(list));
  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public synchronized void addMessage(Message message) {
    messages.add(message);
    list.setListData(messages);
    repaint();
  }

  public synchronized void deleteMessage(Message message) {
    messages.remove(message);
    list.setListData(messages);
    repaint();
  }

}
