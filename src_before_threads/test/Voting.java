package test;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import edb.editor.TabbedActor;
import list.List;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Term;

public class Voting extends JPanel implements JavaActor, TabbedActor {

  public final static int SIZE   = 2;

  static Key              Draw   = Key.getKey("Draw");
  static Key              Init   = Key.getKey("Init");
  static Key              Vote   = Key.getKey("vote");

  boolean[][]             voters = null;
  int                     width;
  int                     height;

  public Voting(int width, int height) {
    voters = new boolean[width][height];
    this.width = width;
    this.height = height;
  }

  public void close() {
  }

  public void deselect() {
  }

  public Key[] getExports() {
    return new Key[] {};
  }

  public boolean hasExport(Key name) {
    return false;
  }

  private boolean isDraw(Object message) {
    if (message instanceof Term) {
      Term t = (Term) message;
      return t.getName() == Draw && t.getValues().length == 3;
    }
    return false;
  }

  private boolean isInit(Object message) {
    if (message instanceof Term) {
      Term t = (Term) message;
      return t.getName() == Init && t.getValues().length == 1;
    }
    return false;
  }

  public Object ref(Key name) {
    throw new Error("no export named " + name);
  }

  public void paint(Graphics g) {
    super.paint(g);
    for (int w = 0; w < width; w++)
      for (int h = 0; h < height; h++)
        draw(g, w, h);
  }

  public void draw(Graphics g, int x, int y) {
    boolean on = voters[x][y];
    if (on)
      g.setColor(Color.black);
    else g.setColor(getBackground());
    g.fillRect(x * SIZE, y * SIZE, SIZE, SIZE);
  }

  public void select() {
  }

  public void send(Actor actor, String message, int arity) {
    if (message.equals("Init") && arity == 1) {
      List<List<Object>> voters = (List<List<Object>>) actor.popStack();
      init(voters);
    } else {
      if (message.equals("Draw")) {
        int y = (int) actor.popStack();
        int x = (int) actor.popStack();
        boolean on = 1 == (int) actor.popStack();
        draw(on, x, y);
      } else throw new Error("unknown message " + message);
    }
  }

  private void draw(boolean on, int x, int y) {
    voters[x][y] = on;
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          repaint();
        }
      });
    } catch (InvocationTargetException | InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void send(Object message, int time) {
    if (isDraw(message)) draw(drawOn(message) == 1, drawX(message), drawY(message));
    if (isInit(message)) init(initVoters(message));
  }

  private void init(List<List<Object>> voterList) {
    int x = 0;
    int y = 0;
    while (!voterList.isNil()) {
      List<Object> col = voterList.getHead();
      voterList = voterList.getTail();
      while (!col.isNil()) {
        Actor voter = (Actor) col.getHead();
        col = col.getTail();
        voters[x][y] = 1 == (int) voter.ref(Vote);
        y++;
      }
      x++;
      y = 0;
    }

    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          repaint();
        }
      });
    } catch (InvocationTargetException | InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private int drawOn(Object message) {
    Term term = (Term) message;
    return (int) term.getValues()[0];
  }

  private int drawX(Object message) {
    Term term = (Term) message;
    return (int) term.getValues()[1];
  }

  private int drawY(Object message) {
    Term term = (Term) message;
    return (int) term.getValues()[2];
  }

  private List<List<Object>> initVoters(Object message) {
    Term term = (Term) message;
    return (List<List<Object>>) term.getValues()[0];
  }

  public String toString() {
    return "Voting()";
  }

}
