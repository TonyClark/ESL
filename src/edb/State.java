package edb;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import actors.Message;
import edb.variables.Variables;

public class State extends JPanel {

  static Font font     = new Font("Courier", Font.PLAIN, 10);

  Time        time     = new Time(font);
  Messages    messages = new Messages();
  Variables   locals   = new Variables(this);
  Variables   dynamics = new Variables(this);
  EDB         edb;

  public State(EDB edb) {
    super();
    this.edb = edb;
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    addTime();
    addMessages();
    addLocals();
    addDynamics();
  }

  private void addLocals() {
    TitledBorder border = BorderFactory.createTitledBorder("Locals");
    border.setTitleFont(font);
    locals.setBorder(border);
    locals.setPreferredSize(new Dimension(-1, 100));
    add(locals);
  }

  private void addDynamics() {
    TitledBorder border = BorderFactory.createTitledBorder("Dynamics");
    border.setTitleFont(font);
    dynamics.setBorder(border);
    add(dynamics);
  }

  private void addTime() {
    TitledBorder border = BorderFactory.createTitledBorder("Time");
    border.setTitleFont(font);
    time.setBorder(border);
    add(time);
  }

  private void addMessages() {
    TitledBorder border = BorderFactory.createTitledBorder("Messages");
    border.setTitleFont(font);
    messages.setBorder(border);
    add(messages);
  }

  public void setTime(int t) {
    time.setTime(t);
  }

  public void addMessage(Message message) {
    messages.addMessage(message);
  }

  public void deleteMessage(Message message) {
    messages.deleteMessage(message);
  }

  public void clearVariables() {
    locals.clear();
    dynamics.clear();
  }

  public void showLocal(String name, Object value) {
    locals.showVariable(name, value);
  }

  public void showDynamic(String name, Object value) {
    dynamics.showVariable(name, value);
  }

  public void showProperties(Object value) {
    edb.showProperties(value);
  }

}
