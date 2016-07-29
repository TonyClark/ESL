package test;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import actors.Actor;
import actors.JavaActor;
import actors.Key;
import actors.Term;
import edb.editor.TabbedActor;

public class CollisionFrame extends JPanel implements JavaActor, TabbedActor {

  static Key sizeKey       = Key.getKey("size");
  static Key widthKey      = Key.getKey("width");
  static Key heightKey     = Key.getKey("height");
  static Key ballSizeKey   = Key.getKey("ballSize");
  static Key SetGUI        = Key.getKey("SetGUI");
  static Key Draw          = Key.getKey("Draw");

  static int REPAINT_DELAY = 100;

  static boolean isInt(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException er) {
      return false;
    }
  }

  int     ballSize       = 5;
  Actor   simulator;
  int     numberOfBalls  = 75;
  boolean selected       = false;

  Canvas  display        = new Canvas() {
                           public void paint(Graphics g) {
                             super.paint(g);
                             CollisionFrame.this.repaint(g);
                           }
                         };

  Point[] points         = new Point[0];

  int     repaintCounter = REPAINT_DELAY;

  public CollisionFrame(Actor simulator) {
    try {
      this.simulator = simulator;
      simulator.send(new Term(SetGUI, this), Actor.getTime());
      JPanel panel = this;
      JPanel controls = new JPanel();
      setLayout(new BorderLayout());
      controls.setLayout(new BoxLayout(controls, BoxLayout.PAGE_AXIS));
      JButton start = new JButton("start");
      JButton stop = new JButton("stop");

      JPanel agentInput = new JPanel();
      agentInput.setLayout(new BoxLayout(agentInput, BoxLayout.X_AXIS));
      agentInput.add(new JLabel("agents: "));
      JTextField agents = new JTextField(numberOfBalls + "");
      agents.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
          warn();
        }

        public void insertUpdate(DocumentEvent e) {
          warn();
        }

        public void removeUpdate(DocumentEvent e) {
          warn();
        }

        public void warn() {
          if (agents.getText().equals("")) {
          } else if (isInt(agents.getText())) {
            if (Integer.parseInt(agents.getText()) <= 0) {
              JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
            } else numberOfBalls = Integer.parseInt(agents.getText());
          } else JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
      });
      agents.setMaximumSize(new Dimension(Integer.MAX_VALUE, agents.getPreferredSize().height));
      agentInput.add(agents);
      controls.add(agentInput);

      JPanel agentSize = new JPanel();
      agentSize.setLayout(new BoxLayout(agentSize, BoxLayout.X_AXIS));
      agentSize.add(new JLabel("size: "));
      JTextField size = new JTextField(ballSize + "");
      size.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
          warn();
        }

        public void insertUpdate(DocumentEvent e) {
          warn();
        }

        public void removeUpdate(DocumentEvent e) {
          warn();
        }

        public void warn() {
          if (size.getText().equals("")) {
          } else if (isInt(size.getText())) {
            if (Integer.parseInt(size.getText()) <= 0) {
              JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
            } else ballSize = Integer.parseInt(size.getText());
          } else JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
        }
      });
      size.setMaximumSize(new Dimension(Integer.MAX_VALUE, agents.getPreferredSize().height));
      agentSize.add(size);
      controls.add(agentSize);

      start.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          points = new Point[numberOfBalls];
          for (int i = 0; i < numberOfBalls; i++)
            points[i] = new Point(0, 0);
          simulator.send(new Term(Key.getKey("Start")), simulator.getTime());
        }
      });
      stop.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          simulator.send(new Term(Key.getKey("Stop")), simulator.getTime());
        }
      });
      controls.add(start);
      controls.add(stop);
      JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, controls, display);
      splitPane.setDividerSize(10);
      panel.add(splitPane);
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }

  public void close() {
    simulator.send(new Term(Key.getKey("Close")), simulator.getTime());
  }

  private void draw(int id, int x, int y) {
    points[id].x = x;
    points[id].y = y;
    repaintCounter--;
    if (repaintCounter <= 0 && selected) {
      repaintCounter = REPAINT_DELAY;
      display.repaint();
    }
  }

  private int drawId(Object message) {
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

  public Key[] getExports() {
    return new Key[] { sizeKey, widthKey, heightKey, ballSizeKey };
  }

  public boolean hasExport(Key name) {
    return name == sizeKey || name == widthKey || name == heightKey || name == ballSizeKey;
  }

  private boolean isDraw(Object message) {
    if (message instanceof Term) {
      Term t = (Term) message;
      return t.getName() == Draw && t.getValues().length == 3;
    }
    return false;
  }

  public Object ref(Key name) {
    if (name == sizeKey) return numberOfBalls;
    if (name == widthKey) return display.getWidth();
    if (name == heightKey) return display.getHeight();
    if (name == ballSizeKey) return ballSize;
    throw new Error("no export named " + name);
  }

  protected void repaint(Graphics g) {
    for (Point p : points) {
      Color c = g.getColor();
      g.setColor(Color.BLACK);
      g.fillOval(p.x, p.y, ballSize, ballSize);
      g.setColor(c);
    }
    g.drawRect(1, 1, display.getWidth(), display.getHeight());
  }

  public void send(Object message, int time) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (isDraw(message))
          draw(drawId(message), drawX(message), drawY(message));
        else throw new Error("unknown message " + message);
      }
    });
  }

  public String toString() {
    return "GUI(" + simulator + ")";
  }

  public void select() {
    selected = true;
  }

  public void deselect() {
    selected = false;
  }

}
