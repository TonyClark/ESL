package edb.gui;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JList;

import edb.tool.EDB;
import runtime.actors.Actor;

public class Actors extends JList<Actor> implements MouseListener {

  static Font font = new Font("Courier", Font.PLAIN, 10);

  Vector<Actor> actors = new Vector<Actor>();
  EDB           gui;

  public Actors(EDB gui) {
    super(new Actor[0]);
    this.gui = gui;
    setFont(font);
    addMouseListener(this);
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() > 1) {
      gui.openActor(getSelectedValue());
    }
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void add(Actor actor) {
    actors.add(actor);
    setListData(actors);
    repaint();
  }

  public void reset() {
    actors.clear();
    setListData(actors);
    repaint();
  }

}
