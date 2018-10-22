package esl;

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
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edb.editor.TabbedActor;
import esl.Library.Actor;
import esl.Library.Behaviour;
import runtime.data.Term;

public class CollisionFrame extends JPanel implements TabbedActor, Behaviour, ActionListener {

  static String sizeString     = "size";
  static String widthString    = "width";
  static String heightString   = "height";
  static String ballSizeString = "ballSize";
  static String SetGUI         = "SetGUI";
  static String Draw           = "Draw";

  static boolean isInt(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException er) {
      return false;
    }
  }

  int     ballSize      = 5;
  Actor   simulator;
  int     numberOfBalls = 75;
  boolean selected      = false;

  Canvas  display       = new Canvas() {
                          public void paint(Graphics g) {
                            super.paint(g);
                            CollisionFrame.this.repaint(g);
                          }
                        };

  Point[] points        = new Point[0];
  Timer   timer         = new Timer(1, this);

  public CollisionFrame(Actor simulator) {
    try {
      this.simulator = simulator;
      simulator.send(new Term("SetGUI", new Actor(this)));
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

      timer.setInitialDelay(100);
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
          simulator.send(new Term("Start"));
          timer.start();
        }
      });
      stop.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          timer.stop();
          simulator.send(new Term("Stop"));
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
    simulator.send(new Term("Close"));
  }

  public void deselect() {
    selected = false;
  }

  private void draw(int id, int x, int y) {
    points[id].x = x;
    points[id].y = y;
  }

  public String[] getExports() {
    return new String[] { sizeString, widthString, heightString, ballSizeString };
  }

  public boolean hasExport(String name) {
    return name == sizeString || name == widthString || name == heightString || name == ballSizeString;
  }

  protected void repaint(Graphics g) {
    Color c = g.getColor();
    g.setColor(Color.BLACK);
    for (Point p : points) {
      g.fillOval(p.x, p.y, ballSize, ballSize);
    }
    g.setColor(c);
    g.drawRect(1, 1, display.getWidth(), display.getHeight());
  }

  public void select() {
    selected = true;
  }

  int c = 0;

  public Actor send(Actor self,Term term) {
    String message = term.getName().getString();
    if (message.equals("Draw")) {
      int y = (int) term.getValues()[2];
      int x = (int) term.getValues()[1];
      int id = (int) term.getValues()[0];
      draw(id, x, y);
    } else throw new Error("unknown message " + message);
    return self;
  }

  public String toString() {
    return "GUI(" + simulator + ")";
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub

  }

  public Object get0(String name) {
    if (name.equals(sizeString)) return numberOfBalls;
    if (name.equals(widthString)) return display.getWidth();
    if (name.equals(heightString)) return display.getHeight();
    if (name.equals(ballSizeString)) return ballSize;
    throw new Error("no export named " + name);
  }

  public Object get(String name) {
    if (name==sizeString) return numberOfBalls;
    if (name==widthString) return display.getWidth();
    if (name==heightString) return display.getHeight();
    if (name==ballSizeString) return ballSize;
    throw new Error("no export named " + name);
  }

  public void actionPerformed(ActionEvent e) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        display.repaint();
      }
    });
  }

  @Override
  public void tick(Actor self) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Actor start(Actor self) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setSelf(Actor self) {
    // TODO Auto-generated method stub
    
  }

}
