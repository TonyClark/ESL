package test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import edb.editor.TabbedActor;
import edb.tool.EDB;
import history.History;
import list.List;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.actors.JavaActor;
import runtime.clients.ESLClient;
import runtime.clients.ESLFileClient;
import runtime.data.Key;
import runtime.data.Term;
import runtime.functions.Builtin;
import runtime.messages.Message;

public class DemoUI extends ESLFileClient implements ESLClient, JavaActor, TabbedActor {

  static final int        WIDTH        = 1200;
  static final int        HEIGHT       = 600;
  static final int        X            = 10;
  static final int        Y            = 10;
  static final int        BUTTON_SIZE  = 25;
  static final Key        SAVE_HISTORY = Key.getKey("saveHistory");
  static final Key        SAVE_STATE   = Key.getKey("saveState");
  static final Key        HTML         = Key.getKey("Show");
  static History          history      = new History();
  static String           historyFiles = null;
  static Builtin          saveState    = new Builtin("saveState", DemoUI::saveState);
  static Builtin          saveHistory  = new Builtin("saveHistory", DemoUI::saveHistory);

  static JPanel           panel        = new JPanel();
  static JFrame           frame        = new JFrame("Simulation Result");
  static JTabbedPane      pane         = new JTabbedPane();
  static SimpleDateFormat timeFormat   = new SimpleDateFormat("mm:ss:SS");
  static long             time0        = 0;
  static Thread           VM           = null;

  private static String   fileName     = "demonetisationWithFloat";
  private static String   label        = "Standard";

  public static int[] getIntegerArray(Object obj) {
    if (obj instanceof list.Cons) {
      List cons = (List) obj;
      int[] a = new int[cons.length()];
      int cnt = 0;
      while (!cons.isNil()) {

        int intVal = ((Integer) cons.getHead()).intValue();
        a[cnt++] = intVal;
        cons = cons.getTail();
      }
      return a;
    }
    return new int[0];
  }

  public static void saveHistory(Actor actor, int arity) {
    System.out.println(" I am in SaveHistory");
  }

  public static void saveState(Actor actor, int arity) {
    System.out.println(" I am in SaveState");
  }

  JPanel              dashboardPanel;
  Map<String, JPanel> tabs            = new HashMap<String, JPanel>();
  Map<String, JPanel> dashboardPanels = new HashMap<String, JPanel>();

  public DemoUI(String[] args) {
    super();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(new BorderLayout());
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    frame.setContentPane(panel);
    frame.setResizable(true);
    frame.pack();
    frame.setVisible(true);
    panel.add(pane, BorderLayout.CENTER);
    dashboardPanel = new JPanel();
    dashboardPanel.setLayout(new GridLayout(0, 3));
    pane.addTab("Simulation Dashboard", dashboardPanel);
    EDB.setHistoryFiles(args[0]);
    for (int i = 1; i < args.length; i++) {
      run(args[i]);
    }
  }

  private void addChart(String name, Term term, JPanel panel) {

    ChartStructure structure = new ChartStructure();
    Component cp = structure.createChart(term);

    if (cp != null) {
      // cp.setMouseWheelEnabled(true);

      panel.setLayout(new java.awt.BorderLayout());
      panel.add(cp, BorderLayout.CENTER);
      panel.validate();
      dashboardPanel.add(panel);
      // pane.addTab(name, panel);
      // overviewPanel.add(panel);

    } else {
      System.out.println(" Not able to draw chart for " + structure.toString());
    }

    // add(pane, BorderLayout.CENTER);

  }

  private void addTab(String name, Term term) {

    JPanel panel;

    if (tabs.containsKey(name)) {
      panel = tabs.get(name);
      panel.removeAll();
    } else {
      panel = new JPanel();
      panel.setLayout(new java.awt.BorderLayout());
      panel.add(new JLabel(name));

      tabs.put(name, panel);
    }

    ChartStructure structure = new ChartStructure();
    Component cp = structure.createChart(term);

    if (cp != null) {
      // cp.setMouseWheelEnabled(true);

      panel.setLayout(new java.awt.BorderLayout());
      panel.add(cp, BorderLayout.CENTER);
      panel.validate();

      pane.addTab(name, panel);

      // overviewPanel.add(panel);

    } else {
      System.out.println(" Not able to draw chart for " + structure.toString());
    }

    // add(pane, BorderLayout.CENTER);

  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour) {
    // svg.behaviourChanged(actor, oldBehaviour, newBehaviour, Actor.getTime());
    // history.behaviourChanged(actor, oldBehaviour, newBehaviour, Actor.getTime());
  }

  public void consume(Actor actor, Message message) {
  }

  public Key[] getExports() {
    return null;
  }

  public boolean hasExport(Key name) {
    return false;
  }

  private void processMessage(Object message, int time) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (message instanceof Term) {
          Term term = (Term) message;
          if (term.getValues().length > 0) {
            String tabName = (String) term.getValues()[0];
            if (tabName.equals("Dashboard")) {
              String panelName = (String) term.getValues()[1];
              if (dashboardPanels.containsKey(panelName)) {
                addChart(panelName, (Term) term.getValues()[2], dashboardPanels.get(panelName));
              } else {
                JPanel tPanel = new JPanel();
                dashboardPanels.put(panelName, tPanel);
                addChart(panelName, (Term) term.getValues()[2], tPanel);
              }
            } else {
              if (term.getValues()[1] instanceof Term) addTab(tabName, (Term) term.getValues()[1]);
            }
          } else System.out.println("Insufficient Parameter for  " + term.getValues()[0].toString());

        }
      }
    });
  }

  public Object ref(Key name) {
    if (name == SAVE_HISTORY)
      return saveHistory;
    else if (name == SAVE_STATE)
      return saveState;
    else return null;
  }

  public void schedule(Actor actor) {
    System.out.println(" I am in Schedule");
  }

  public void send(Actor source, Actor target, Message message) {
    System.out.println(" I am in send 1.....");
    // svg.addMessage(source, target, message, Actor.getTime());
    // history.send(source, target, message, Actor.getTime());
    // }
  }

  public void send(Actor actor, String message, int arity) {
    System.err.println("SEND");
    if (arity == 3) {
      Term term = (Term) actor.popStack();
      String panelName = (String) actor.popStack();
      String tabName = (String) actor.popStack();
      if (dashboardPanels.containsKey(panelName)) {
        addChart(panelName, term, dashboardPanels.get(panelName));
      } else {
        JPanel tPanel = new JPanel();
        dashboardPanels.put(panelName, tPanel);
        addChart(panelName, term, tPanel);
      }
    } else {
      Term term = (Term) actor.popStack();
      String tabName = (String) actor.popStack();
      addTab(tabName, term);
    }
  }

  public void send(JavaActor source, Actor target, Message message) {

  }

  public void send(Object message, int time) { 
    processMessage(message, time);
  }

  public void setActor(Actor actor) {
    System.out.println(" I am in SetActor");
  }

  public void setFocus(Component component) {
    System.out.println(" I am in Set Focus");
  }

  public void showProperties(Object value) {
    System.out.println(" I am in showProperties");
  }

  public JPanel stackPanel() {
    JPanel stackPanel = new JPanel();
    stackPanel.setLayout(new BorderLayout());
    // stackPanel.add(stack);
    stackPanel.setBorder(BorderFactory.createTitledBorder("Stack"));
    return stackPanel;
  }

  public void timeChanged(int time) {
    System.out.println(" I am in timeChanged");

  }

  public void send(int time, int source, int target, String name, Object[] values) {

  }

  public void send(int time, Actor actor, Actor target, String name, int arity) {

  }

  public void close() {

  }

  public void select() {

  }

  public void deselect() {

  }

  public void newActor(Actor actor) {

  }

  public void newActor(JavaActor actor) {

  }

  public void stop() {

  }

  public void perform(Actor actor) {

  }

  public void deschedule(Actor actor) {

  }

}
