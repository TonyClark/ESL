package test;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edb.editor.TabbedActor;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Term;
import runtime.kb.Fact;
import runtime.kb.KB;

public class Miners extends JPanel implements JavaActor, TabbedActor, MouseWheelListener, Runnable {

  abstract class Command {
    abstract void perform();
  }

  class Draw extends Command {
    KB kb;

    public Draw(KB kb) {
      this.kb = kb;
    }

    private void addMiner(Term term) {
      int id = (int) term.getValues()[0];
      int x = (int) term.getValues()[1];
      int y = (int) term.getValues()[2];
      int load = (int) term.getValues()[3];
      miners.put(id, new Miner(x, y, load));
    }

    private void addOre(Term term) {
      int x = (int) term.getValues()[0];
      int y = (int) term.getValues()[1];
      int load = (int) term.getValues()[2];
      ore.add(new Ore(x, y, load));

    }

    private boolean isOre(Term term) {
      return term.getName() == ORE;
    }

    private boolean isPos(Term term) {
      return term.getName() == POS;
    }

    void perform() {
      for (Fact fact : kb.getFacts()) {
        if (isPos(fact.getTerm())) addMiner(fact.getTerm());
        if (isOre(fact.getTerm())) addOre(fact.getTerm());
      }
      display.repaint();
    }
  }

  class Miner {

    int x;
    int y;
    int load;

    public Miner(int x, int y, int load) {
      super();
      this.x = x;
      this.y = y;
      this.load = load;
    }

    public int getLoad() {
      return load;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void paint(Graphics g) {
      if (load == 0) {
        Color c = g.getColor();
        g.setColor(SeekingColor);
        g.fillOval(x, y, oreRadius, oreRadius);
        g.setColor(c);
      } else {
        Color c = g.getColor();
        g.setColor(CarryColor);
        g.fillOval(x, y, oreRadius, oreRadius);
        g.setColor(c);
      }
    }

    public void setLoad(int load) {
      this.load = load;
    }

    public void setX(int x) {
      this.x = x;
    }

    public void setY(int y) {
      this.y = y;
    }

    public String toString() {
      return "Miner(" + x + "," + y + "," + load + ")";
    }
  }

  class Move extends Command {
    int id;
    int newX;
    int newY;

    public Move(int id, int newX, int newY) {
      super();
      this.id = id;
      this.newX = newX;
      this.newY = newY;
    }

    void perform() {
      Miner m = miners.get(id);
      if (m == null) {
        System.err.println("cannot find miner " + id + " in " + miners);
      } else {
        while (m.getX() != newX && m.getY() != newY) {
          if (newX > m.getX())
            m.setX(m.getX() + 1);
          else if (newX < m.getX()) m.setX(m.getX() - 1);
          if (newY > m.getY())
            m.setY(m.getY() + 1);
          else if (newY < m.getY()) m.setY(m.getY() - 1);
          display.repaint();
        }
      }
    }
  }

  class Ore {

    int x;
    int y;
    int amount;

    public Ore(int x, int y, int amount) {
      super();
      this.x = x;
      this.y = y;
      this.amount = amount;
    }

    public int getAmount() {
      return amount;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void paint(Graphics g) {
      if (amount == 0) {
        g.drawOval(x, y, oreRadius, oreRadius);
      } else {
        Color c = g.getColor();
        g.setColor(OreColor);
        g.fillOval(x, y, oreRadius, oreRadius);
        g.setColor(c);
      }
    }

    public void setAmount(int amount) {
      this.amount = amount;
    }

    public void setX(int x) {
      this.x = x;
    }

    public void setY(int y) {
      this.y = y;
    }

    public String toString() {
      return "Ore(" + x + "," + y + "," + amount + ")";
    }
  }

  class Pickup extends Command {
    int id;
    int amount;

    public Pickup(int id, int amount) {
      super();
      this.id = id;
      this.amount = amount;
    }

    void perform() {
      Miner m = miners.get(id);
      m.setLoad(amount);
      for (Ore o : ore) {
        if (o.getX() == m.getX() && o.getY() == m.getY()) {
          o.setAmount(o.getAmount() - amount);
        }
      }
    }
  }

  static final Color    CarryColor   = Color.RED;
  static final Color    SeekingColor = Color.BLACK;
  static final Color    OreColor     = Color.GREEN;

  static Key            BASE         = Key.getKey("Base");
  static Key            POS          = Key.getKey("Pos");
  static Key            ORE          = Key.getKey("Ore");
  static Key            SETGUI       = Key.getKey("SetGUI");
  static Key            DRAW         = Key.getKey("Draw");

  final static Object[] NOARGS       = new Object[0];

  private static boolean isInt(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException er) {
      return false;
    }
  }

  int                       ballSize   = 5;
  Actor                     simulator;
  boolean                   selected   = false;
  int                       offsetx    = 400;
  int                       offsety    = 400;
  double                    scale      = 1;
  int                       baseRadius = 2;
  int                       oreRadius  = 1;
  int                       noOfMiners = 10;
  boolean                   active     = true;

  Hashtable<Integer, Miner> miners     = new Hashtable<Integer, Miner>();
  Vector<Ore>               ore        = new Vector<Ore>();
  Vector<Command>           commands   = new Vector<Command>();

  Canvas                    display    = new Canvas() {
                                         public void paint(Graphics g) {
                                           Miners.this.repaint(g);
                                         }
                                       };

  public Miners(Actor simulator) {
    this.simulator = simulator;
    createGUI();
  }

  public void close() {
    simulator.send(this, "Close", new Object[] {});
  }

  private void createGUI() {
    simulator.send(this, "SetGUI", new Object[] { this });
    JPanel panel = this;
    JPanel controls = new JPanel();
    setLayout(new BorderLayout());
    controls.setLayout(new BoxLayout(controls, BoxLayout.PAGE_AXIS));
    JButton start = new JButton("start");
    JButton stop = new JButton("stop");
    display.addMouseWheelListener(this);
    JPanel minerInput = new JPanel();
    minerInput.setLayout(new BoxLayout(minerInput, BoxLayout.X_AXIS));
    minerInput.add(new JLabel("miners: "));
    JTextField minerField = new JTextField(noOfMiners + "");
    minerField.getDocument().addDocumentListener(new DocumentListener() {
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
        if (minerField.getText().equals("")) {
        } else if (isInt(minerField.getText())) {
          if (Integer.parseInt(minerField.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
          } else noOfMiners = Integer.parseInt(minerField.getText());
        } else JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
      }
    });
    minerField.setMaximumSize(new Dimension(Integer.MAX_VALUE, minerField.getPreferredSize().height));
    minerInput.add(minerField);
    controls.add(minerInput);

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
    size.setMaximumSize(new Dimension(Integer.MAX_VALUE, minerField.getPreferredSize().height));
    agentSize.add(size);
    controls.add(agentSize);
    start.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Runnable r = new Runnable() {
          public void run() {
            active = true;
            new Thread(Miners.this).start();
            simulator.send(Miners.this, "Start", new Object[] { noOfMiners });
          }
        };
        new Thread(r).start();
      }
    });
    stop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        active = false;
        miners.clear();
        ore.clear();
        simulator.send(Miners.this, "Stop", NOARGS);
      }
    });
    controls.add(start);
    controls.add(stop);
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, controls, display);
    splitPane.setDividerSize(10);
    panel.add(splitPane);
  }

  public void deselect() {
    selected = false;
  }

  public Key[] getExports() {
    return new Key[] {};
  }

  private Command getNextCommand() {
    synchronized (commands) {
      if (commands.isEmpty()) {
        try {
          commands.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        return getNextCommand();
      } else {
        Command command = commands.firstElement();
        commands.remove(command);
        return command;
      }
    }
  }

  public boolean hasExport(Key name) {
    return false;
  }

  public void mouseWheelMoved(MouseWheelEvent e) {
    double delta = 0.5f * e.getPreciseWheelRotation();
    scale += delta;
    display.repaint();
  }

  public Object ref(Key name) {
    throw new Error("no export named " + name);
  }

  protected void repaint(Graphics g) {

    Graphics2D g2d = (Graphics2D) g.create();
    AffineTransform at = new AffineTransform();
    at.translate(offsetx, offsety);
    at.scale(scale, scale);
    g2d.setTransform(at);
    for (Miner m : miners.values()) {
      m.paint(g2d);
    }
    for (Ore o : ore) {
      o.paint(g2d);
    }
    g2d.drawOval(offsetx, offsety, baseRadius, baseRadius);

    g2d.dispose();
  }

  public void run() {
    while (active) {
      Command command = getNextCommand();
      command.perform();
    }
  }

  public void select() {
    selected = true;
  }

  public void send(Actor actor, String message, int arity) {
    if (active && message.equals("Draw")) {
      KB kb = (KB) actor.popStack();
      Command command = new Draw(kb);
      command.perform();
    }
    if (active && message.equals("Move")) {
      int newy = (int) actor.popStack();
      int newx = (int) actor.popStack();
      int id = (int) actor.popStack();
      Command command = new Move(id, newx, newy);
      synchronized (commands) {
        commands.add(command);
        commands.notifyAll();
      }
    }
    if (active && message.equals("PickUp")) {
      int id = (int) actor.popStack();
      int amount = (int) actor.popStack();
      Command command = new Pickup(id, amount);
      synchronized (commands) {
        commands.add(command);
        commands.notifyAll();
      }
    }
    if (active && message.equals("Drop")) {
      int id = (int) actor.popStack();
      int amount = (int) actor.popStack();
      Miner m = miners.get(id);
      m.setLoad(m.getLoad() - amount);
    }
  }

  public void send(Object message, int time) {
    System.err.println("SEND2 " + message);
  }

  public String toString() {
    return "GUI(" + simulator + ")";
  }

}
