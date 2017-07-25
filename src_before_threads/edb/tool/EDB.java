package edb.tool;

import static runtime.listeners.Listeners.setBehaviourListener;
import static runtime.listeners.Listeners.setInstrListener;
import static runtime.listeners.Listeners.setMessageListener;
import static runtime.listeners.Listeners.setNewActorListener;
import static runtime.listeners.Listeners.setScheduleListener;
import static runtime.listeners.Listeners.setStopListener;
import static runtime.listeners.Listeners.setTimeListener;
import static runtime.listeners.Listeners.setUpdateListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import com.apple.eawt.Application;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import ast.AST;
import ast.actors.New;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Ref;
import ast.modules.Module;
import ast.query.body.Call;
import ast.query.machine.Machine;
import ast.query.rules.Query;
import ast.query.rules.RuleBase;
import ast.query.value.Var;
import ast.types.TypeError;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import edb.console.Console;
import edb.console.ConsoleOutputStream;
import edb.editor.FileEditor;
import edb.editor.FileEditors;
import edb.files.FileTree;
import env.Empty;
import env.Env;
import history.History;
import history.Snapshot;
import instrs.Instr;
import instrs.apply.Return;
import list.Cons;
import list.List;
import list.Nil;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.actors.Builtins;
import runtime.actors.JavaActor;
import runtime.clients.ESLClient;
import runtime.data.Dynamic;
import runtime.data.Field;
import runtime.data.Key;
import runtime.data.Record;
import runtime.data.Term;
import runtime.functions.Builtin;
import runtime.functions.Closure;
import runtime.functions.CodeBox;
import runtime.messages.Message;
import xpl.Interpreter;

public class EDB extends JFrame implements ESLClient, JavaActor {

  static final String     osFlag          = System.getProperty("os.name").replaceAll("\\s", "");;
  static final String     WEB             = "http://tonyclark.github.io/ESL/";
  static final int        WIDTH           = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width * 0.9);
  static final int        HEIGHT          = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
  static final int        X               = 10;
  static final int        Y               = 0;
  static final int        BUTTON_SIZE     = 25;
  static final String     NAME            = "EDB";
  static final Key        SAVE_HISTORY    = Key.getKey("saveHistory");
  static final Key        SAVE_STATE      = Key.getKey("saveState");
  static final Key        SHOW            = Key.getKey("Show");
  static final Key        FILMSTRIP       = Key.getKey("Filmstrip");
  static final Key        ADDBL           = Key.getKey("AddBrowserListener");
  static final Key        MATH            = Key.getKey("math");
  static History          history         = new History();
  static String           historyFiles    = null;
  static Builtin          saveState       = new Builtin("saveState", EDB::saveState);
  static Builtin          saveHistory     = new Builtin("saveHistory", EDB::saveHistory);
  static Builtin          nullSaveState   = new Builtin("nullSaveState", EDB::nullSaveState);
  static Builtin          nullSaveHistory = new Builtin("nullSaveHistory", EDB::nullSaveHistory);
  static Record           math            = getMath();
  static SimpleDateFormat timeFormat      = new SimpleDateFormat("mm:ss:SS");
  static long             time0           = 0;
  static boolean          savesHistory    = false;
  static boolean          checkSyntax     = true;
  static boolean          checkTypes      = true;
  static Machine          queryMachine    = null;

  public static void circlePos(Actor actor, int arity) {
    if (arity == 4) {
      actor.closeFrame(0, null, null, null);
      int x = (int) actor.getFrameVar(0);
      int y = (int) actor.getFrameVar(1);
      int radius = (int) actor.getFrameVar(2);
      int angle = (int) actor.getFrameVar(3);
      int posX = (int) (x + radius * Math.cos(Math.toRadians(angle)));
      int posY = (int) (y + radius * Math.sin(Math.toRadians(angle)));
      actor.returnValue(new Term(Key.getKey("Point"), posX, posY));
    } else throw new Error("circlePos expect 4 args, but supplied with " + arity);
  }

  public static void error(String message, String title) {
    int dialogButton = JOptionPane.ERROR_MESSAGE;
    JOptionPane.showMessageDialog(null, message, title, dialogButton);
  }

  public static String getHistoryFiles() {
    return historyFiles;
  }

  private static Record getMath() {
    Field circlePos = new Field(Key.getKey("circlePos"), new Builtin("circlePos", EDB::circlePos));
    Field[] fields = new Field[] { circlePos };
    return new Record(fields);
  }

  public static String getOsflag() {
    return osFlag;
  }

  public static String getPathName(String path) {
    int i = path.lastIndexOf('/');
    path = i == -1 ? path : path.substring(i + 1);
    i = path.indexOf('.');
    path = i == -1 ? path : path.substring(0, i);
    return path;
  }

  public static void main(String[] args) {
    String EDBfiles = args[0];
    String historyFiles = args[1];
    new EDB(EDBfiles, historyFiles);
  }

  public static void nullSaveHistory(Actor actor, int arity) {
  }

  public static void nullSaveState(Actor actor, int arity) {
  }

  private static void saveActorState(Actor a, String name, Object value, int time) {
    history.state(a, name, value, time);
  }

  private static void saveActorState(Actor a, int time) {
    String[] names = a.getBehaviour().getCode().getDynamicNames(0);
    int i = 0;
    List<Dynamic> dynamics = a.getBehaviour().getDynamics();
    while (!dynamics.isNil()) {
      if (!Builtins.builtinNames.contains(names[i])) {
        String name = names[i];
        // May be shadowed
        if (Arrays.asList(names).indexOf(name) == i)
          history.state(a, names[i++], dynamics.getHead().getValue(), time);
        else i++;
      } else i++;
      dynamics = dynamics.getTail();
    }
  }

  private static void saveActorStates(int time) {

    // Each time click the state of actors is recorded on the history.

    if (savesHistory) {
      for (Actor a : ESL.getACTORS()) {
        saveActorState(a, time);
      }
    }
  }

  public static void saveHistory(Actor actor, int arity) {
    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      Object label = actor.getFrameVar(0);
      history.setStartOfTime(0);
      history.setEndOfTime(ESL.getTime());
      File dir = new File(historyFiles + "/" + actor.getPathName());
      if (!dir.exists()) if (!dir.mkdirs()) error("Save History", "cannot create " + dir);
      history.serialize(dir.getAbsolutePath() + "/" + label + ".hst");
      for (Snapshot snapshot : history.getSnapshots())
        snapshot.save(dir.getAbsolutePath(), history);
      actor.returnValue(label);
    } else throw new Error("saveHistory expects " + 1 + " arg but supplied with " + arity);
  }

  public static void saveState(Actor actor, int arity) {

    // Saves a snapshot ...

    if (arity == 1) {
      actor.closeFrame(0, null, null, null);
      String label = actor.getFrameVar(0).toString();
      history.recordSnapshot(label, ESL.getTime());
      saveActorStates(ESL.getTime());
      actor.returnValue(label);
    } else throw new Error("saveState expects " + 1 + " arg but supplied with " + arity);
  }

  public static void setHistoryFiles(String historyFiles) {
    EDB.historyFiles = historyFiles;
  }

  FileTree      fileTree         = null;
  FileEditors   fileEditors      = new FileEditors(this);
  Console       console          = new Console(this);
  Actor         actor            = null;
  EDBState      toolState        = EDBState.IDLE;
  Component     focus            = null;
  Thread        VM               = null;
  Vector<Actor> browserListeners = new Vector<Actor>();

  public EDB(String EDBfiles, String historyFiles) {
    EDB.historyFiles = historyFiles;
    redirectIO();
    setLookAndFeel();
    initGUI(EDBfiles);
    addToolBar();
    setNewActorListener(this);
    setStopListener(this);
    setTimeListener(this);
    setMessageListener(this);
    setInstrListener(this);
    setScheduleListener(this);
    setBehaviourListener(this);
    setUpdateListener(this);
    showTitle(EDBState.IDLE);
    Application.getApplication().setDockIconImage(getIcon());
    splash();
    pack();
    setSize(WIDTH, HEIGHT);
    setLocation(X, Y);
    setVisible(true);
    readESL();
    console.startInterpreter();
  }

  private Image getIcon() {
    File file = new File("images/EDB.png");
    return new ImageIcon(file.getAbsolutePath()).getImage();
  }

  public void action_init() {
    if (toolState == EDBState.LOADED) {
      // Start a thread...
      toolState = EDBState.INITIALISING;
      showTitle(toolState, actor.getBehaviour().getPath());
      VM = new Thread() {
        public void run() {
          actor.run(Integer.MAX_VALUE);
        }
      };
      VM.start();
    }
  }

  public void action_run() {
    if (toolState == EDBState.INITIALISED) {

      // Run to completion...

      toolState = EDBState.RUNNING;
      VM = new Thread() {
        public void run() {
          time0 = System.currentTimeMillis();
          showTitle(toolState, actor.getBehaviour().getPath());
          ESL.runESL(0);
        }
      };
      VM.start();
    }
  }

  private void action_step() {
    error("STEP not implemented.", "STEP");
  }

  public void addToolBar() {
    JToolBar toolBar = new JToolBar("EDB Commands");
    JButton stop = new JButton(getImage("icons/stop.png", BUTTON_SIZE, BUTTON_SIZE));
    stop.setToolTipText("stop");
    stop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        stop();
      }
    });
    /*
     * JButton step = new JButton(getImage("icons/step.png", BUTTON_SIZE, BUTTON_SIZE)); step.setToolTipText("step"); step.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { action_step(); } });
     */
    JButton run = new JButton(getImage("icons/run.png", BUTTON_SIZE, BUTTON_SIZE));
    run.setToolTipText("run");
    run.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        action_run();
      }
    });
    JButton init = new JButton(getImage("icons/init.png", BUTTON_SIZE, BUTTON_SIZE));
    init.setToolTipText("init");
    init.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        action_init();
      }
    });
    JButton zoom_in = new JButton(getImage("icons/zoom_in.png", BUTTON_SIZE, BUTTON_SIZE));
    zoom_in.setToolTipText("zoom in");
    zoom_in.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            zoom_in();
          }
        }).start();
      }
    });
    JButton zoom_out = new JButton(getImage("icons/zoom_out.png", BUTTON_SIZE, BUTTON_SIZE));
    zoom_out.setToolTipText("zoom out");
    zoom_out.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            zoom_out();
          }
        }).start();
      }
    });
    JButton graph = new JButton(getImage("icons/history.png", BUTTON_SIZE, BUTTON_SIZE));
    if (savesHistory)
      graph.setBackground(stop.getBackground());
    else graph.setBackground(Color.red);
    graph.setToolTipText("graph");
    graph.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            // Toggle whether we save history or not...
            savesHistory = !savesHistory;
            if (savesHistory)
              graph.setBackground(stop.getBackground());
            else graph.setBackground(Color.red);
          }
        }).start();
      }
    });
    JButton check_syntax = new JButton(getImage("icons/syntax_check.png", BUTTON_SIZE, BUTTON_SIZE));
    if (checkSyntax)
      check_syntax.setBackground(stop.getBackground());
    else check_syntax.setBackground(Color.red);
    check_syntax.setToolTipText("check syntax");
    check_syntax.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            // Toggle whether we check syntax or not.
            checkSyntax = checkTypes && !checkSyntax;
            if (checkSyntax)
              check_syntax.setBackground(stop.getBackground());
            else check_syntax.setBackground(Color.red);
            if (focus instanceof FileEditor) {
              FileEditor editor = (FileEditor) focus;
              editor.textChanged();
            }
          }
        }).start();
      }
    });
    JButton check_types = new JButton(getImage("icons/type_check.png", BUTTON_SIZE, BUTTON_SIZE));
    if (checkTypes)
      check_types.setBackground(stop.getBackground());
    else check_types.setBackground(Color.red);
    check_types.setToolTipText("check types");
    check_types.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            // Toggle whether we check types or not...
            checkTypes = !checkTypes;
            if (checkTypes)
              check_types.setBackground(stop.getBackground());
            else check_types.setBackground(Color.red);
            checkSyntax = checkTypes;
            check_syntax.setBackground(check_types.getBackground());
            if (focus instanceof FileEditor) {
              FileEditor editor = (FileEditor) focus;
              editor.textChanged();
            }
          }
        }).start();
      }
    });
    JButton about = new JButton(getImage("icons/about.png", BUTTON_SIZE, BUTTON_SIZE));
    about.setToolTipText("about");
    about.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
          public void run() {
            splash();
          }
        }).start();
      }

    });
    toolBar.add(stop);
    // toolBar.add(step);
    toolBar.add(run);
    toolBar.add(init);
    toolBar.add(zoom_in);
    toolBar.add(zoom_out);
    toolBar.add(graph);
    toolBar.add(check_syntax);
    toolBar.add(check_types);
    toolBar.add(about);
    setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.PAGE_START);
  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour) {
    // svg.behaviourChanged(actor, oldBehaviour, newBehaviour, Actor.getTime());
    if (savesHistory) history.behaviourChanged(actor, oldBehaviour, newBehaviour, ESL.getTime());
  }

  public void browserEvent(String message) {
    for (Actor listener : browserListeners) {
      listener.queueMessage("BrowserEvent", new Object[] { message });
    }
  }

  public void cleanFile(String path) {
    fileEditors.clean(path);
  }

  public JPanel consolePanel() {
    JScrollPane scrollPane = new JScrollPane(console);
    JPanel consolePanel = new JPanel();
    consolePanel.setLayout(new BorderLayout());
    consolePanel.add(scrollPane);
    consolePanel.setBorder(BorderFactory.createTitledBorder("Console"));
    return consolePanel;
  }

  public void consume(Actor actor, Message message) {
    if (savesHistory) history.consume(actor, message);
  }

  public void deleteHistories(String path) {
    path = historyFiles + "/" + getPathName(path);
    File dir = new File(path);
    System.out.println(dir);
    if (dir.isDirectory()) {
      for (File file : dir.listFiles()) {
        file.delete();
      }
    }
  }

  public void deschedule(Actor actor) {

    // An actor has stopped running. This might be because its time-slice
    // is up, or because it has completed...

    if (actor == this.actor) {

      // If this is the main actor then we have completed initialisation...

      try {
        toolState = EDBState.INITIALISED;
        showTitle(toolState, actor.getBehaviour().getPath());

        // This will be called by the VM thread. That must now wait
        // until the user starts the main execution...

        synchronized (VM) {
          VM.wait();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void dirtyFile(String path) {
    fileEditors.dirty(path);
  }

  public void displayTree(Module module) {

    // Called after the module has been successfully type checked.

    fileTree.displayTree(module);
  }

  public void displayTree(String path, Query query) {

    // Called after the module has been successfully type checked.

    fileTree.displayTree(path, query);
  }

  public void editorSelectedDeclaration(String path, DeclaringLocation dec) {
    fileTree.selectDeclaration(path, dec);
  }

  public void fileDeleted(String path) {
    fileEditors.fileDeleted(path);
  }

  public void fileHasError(String path, boolean isError) {
    fileEditors.hasError(path, isError);
  }

  public JPanel fileTree(String root) {
    fileTree = new FileTree(root);
    fileTree.setGui(this);
    JScrollPane scrollPane = new JScrollPane(fileTree);
    JPanel consolePanel = new JPanel();
    consolePanel.setLayout(new BorderLayout());
    consolePanel.add(scrollPane);
    consolePanel.setBorder(BorderFactory.createTitledBorder("Files"));
    return consolePanel;
  }

  public Actor getActor() {
    return actor;
  }

  public Key[] getExports() {
    return new Key[] { SAVE_HISTORY, SAVE_STATE, MATH };
  }

  public FileEditors getFileEditors() {
    return fileEditors;
  }

  public ImageIcon getImage(String file, int width, int height) {
    Image img = new ImageIcon(file).getImage();
    Image newImg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    return new ImageIcon(newImg);
  }

  public boolean hasExport(Key name) {
    return name == SAVE_HISTORY || name == SAVE_STATE || name == MATH;
  }

  /*
   * 
   * private String getHTMLActorGraph() { return svg.getString(Actor.getACTORS()); }
   */

  public void initGUI(String root) {
    JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fileEditors, consolePanel());
    JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, fileTree(root), splitPane1);
    // JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fileTree(root), actorsPanel());
    // JSplitPane splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane2, splitPane1);
    // JSplitPane splitPane5 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, assemblerPanel(), statePanel());
    // JSplitPane splitPane7 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, propertiesPanel(), stackPanel());
    // JSplitPane splitPane6 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane5, splitPane7);
    // JSplitPane splitPane4 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane3, splitPane6);
    splitPane1.setBorder(null);
    splitPane2.setBorder(null);
    // splitPane3.setBorder(null);
    // splitPane5.setBorder(null);
    // splitPane6.setBorder(null);
    // splitPane7.setBorder(null);
    splitPane1.setOneTouchExpandable(true);
    splitPane2.setOneTouchExpandable(true);
    // splitPane3.setOneTouchExpandable(true);
    // splitPane4.setOneTouchExpandable(true);
    // splitPane5.setOneTouchExpandable(true);
    splitPane1.setDividerLocation(HEIGHT - 200);
    splitPane2.setDividerLocation(200);
    // splitPane3.setDividerLocation(200);
    // splitPane4.setDividerLocation(WIDTH);
    // splitPane5.setDividerLocation(200);
    // splitPane6.setDividerLocation(HEIGHT - 300);
    // splitPane7.setDividerLocation(200);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    add(splitPane2);
  }

  /*
   * 
   * private void graph(int x, int y) { JPopupMenu popup = new JPopupMenu(); JMenu history = new JMenu("History"); JMenuItem actors = new JMenuItem("Actors"); actors.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { if (actor != null) { String html =
   * getHTMLActorGraph(); fileEditors.showHTML("Actors(" + actor.getBehaviour().getPath() + ")", html, EDB.this); } } }); JMenuItem partial = new JMenuItem("History (Partial)"); partial.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { if (actor != null) {
   * HistoryDialog dialog = new HistoryDialog(EDB.this.svg, x, y); String svg = EDB.this.svg.getString(dialog.getActorStart(), dialog.getActorEnd(), dialog.getMessageStart(), dialog.getMessageEnd()); String html = "<HTML>" + svg + "</HTML>"; fileEditors.showHTML("History(" +
   * actor.getBehaviour().getPath() + ")", html, EDB.this); } } }); JMenuItem all = new JMenuItem("History (All)"); all.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { if (actor != null) { String svg = EDB.this.svg.getString(0, Actor.getTime(), 0,
   * Actor.getTime()); String html = "<HTML>" + svg + "</HTML>"; fileEditors.showHTML("History(" + actor.getBehaviour().getPath() + ")", html, EDB.this); } } }); history.add(partial); history.add(all); popup.add(actors); popup.add(history); popup.show(this, x, y); }
   */

  public void interactiveQuery(Call[] calls) {
    if (queryMachine == null) {
      System.out.println("No query machine is set.");
    } else {
      try {
        HashSet<String> vars = new HashSet<String>();
        for (Call call : calls) {
          for (int i = 0; i < call.getArgs().length; i++) {
            call.getArgs()[i].vars(vars);
          }
        }
        Env<String, Var> venv = new Empty<String, Var>();
        for (String var : vars)
          venv = venv.bind(var, new Var());
        Object[][] argValues = new Object[calls.length][];
        for (int i = 0; i < calls.length; i++) {
          argValues[i] = new Object[calls[i].getArgs().length];
          for (int arg = 0; arg < calls[i].getArgs().length; arg++) {
            argValues[i][arg] = calls[i].getArgs()[arg].recons(venv);
          }
        }
        for (int i = 0; i < calls.length; i++) {
          Call call = calls[i];
          if (call.getName().equals("display") && call.getArgs().length == 2) {
            Object label = queryMachine.recons(argValues[i][0]);
            Object display = queryMachine.recons(argValues[i][1]);
            send(new Term(SHOW, label, display), 0);
          } else if (call.getName().equals("filmstrip") && call.getArgs().length == 2) {
            Object label = queryMachine.recons(argValues[i][0]);
            Object display = queryMachine.recons(argValues[i][1]);
            send(new Term(FILMSTRIP, label, display), 0);
          } else {
            long t0 = System.currentTimeMillis();
            queryMachine.init(Key.getKey(call.getName()), (Object[]) argValues[i]);
            System.out.println("Query performed in " + (System.currentTimeMillis() - t0) + "ms");
          }
        }
        for (String var : vars) {
          System.out.println(var + " = " + queryMachine.recons(venv.lookup(var)));
        }
      } catch (Exception e) {
        e.printStackTrace(System.out);
      } catch (Error e) {
        e.printStackTrace(System.out);
      }
    }
  }

  private boolean isBreakpoint(Actor actor, Instr instr) {
    return fileEditors.isBreakpoint(actor, instr.getLineStart());
  }

  public boolean isCheckSyntax() {
    return checkSyntax;
  }

  public boolean isCheckTypes() {
    return checkTypes;
  }

  public boolean isDirty(String path) {
    return fileEditors.isDirty(path);
  }

  public boolean isOnLine() {

    // Returns true when the system has an internet connection...

    try {
      return !"127.0.0.1".equals(InetAddress.getLocalHost().getHostAddress().toString());
    } catch (UnknownHostException e) {
      return false;
    }
  }

  public void load(String path, String configName) {
    history.reset();
    Module.reset();
    showTitle(EDBState.LOADING, path);
    new Thread(new Runnable() {
      public void run() {
        ESL.resetESL();
        try {
          Module module = Module.importModule(path);
          module.resolve();
          typeCheck(module);
          module.configure(configName);
          AST desugared = module.desugar();
          AST record = new New(0, 0, "", new Ref(0, 0, desugared, Key.getKey("main")));
          CodeBox codebox = new CodeBox(path, record.maxLocals());
          ESL.setEDB(EDB.this);
          record.compile(new Nil<FrameVar>(), Builtins.builtinDynamics(), codebox, true);
          codebox.add(new Return(-1), new Nil<FrameVar>(), new Nil<DynamicVar>());
          String name = path.substring(path.lastIndexOf('/') + 1);
          name = name.substring(0, name.indexOf('.'));
          System.out.println("[ write asm/" + name + ".asm ]");
          codebox.write("asm/" + name + ".asm");
          actor = new Actor(new Behaviour("init", new Key[0], new Nil<Dynamic>(), 0, codebox, true, new Hashtable<String, Closure>(), null));
          actor.initSystem(codebox);
          actor.kill();
          // Running the initial file should produce the root system actor...
          openActor(actor);
          toolState = EDBState.LOADED;
          showTitle(EDBState.LOADED, path);
        } catch (FileNotFoundException fnf) {
          error(fnf.getMessage(), "Import Problem");
        } catch (Exception error) {
          error.printStackTrace(System.err);
          error(error.getMessage(), "Error");
        } catch (Error error) {
          error.printStackTrace(System.err);
          error(error.getMessage(), "Error");
        }
      }
    }).start();
  }

  public void newActor(Actor actor) {
    if (savesHistory) {
      history.newActor(actor, ESL.getTime());
      saveActorState(actor, ESL.getTime());
    }
  }

  public void newActor(JavaActor actor) {
    if (actor instanceof JPanel) fileEditors.openPanel((JPanel) actor);
  }

  public void openActor(Actor actor) {
    // openFile(actor.getBehaviour().getPath());
    // setActor(actor);
    // properties.resetHistory();
    // properties.showProperties(actor);
    // stack.showStack(actor);
  }

  public void openActor(Actor actor, int textPos, int codePtr) {
    /*
     * CodeBox code = actor.getCode(); openFile(code.getPath()); openAsm(actor); setActor(actor); stack.showStack(actor); if (textPos != -1) fileEditors.selectLine(textPos); assembler.selectLine(codePtr); state.clearVariables(); if (!actor.complete()) { int i = 0; for (String name :
     * code.getLocalNames(codePtr)) state.showLocal(name, actor.getFrameVar(i++)); i = 0; for (String name : code.getDynamicNames(codePtr)) state.showDynamic(name, actor.getDynamic(i++)); }
     */
  }

  public void openFile(String path) {
    fileEditors.openFile(path, this);
  }

  public void perform(Actor actor) {
    /*
     * Instr instr = actor.nextInstr(); if (instr != null && isBreakpoint(actor, instr)) { stop(); openActor(actor, instr.getLineStart(), actor.getCodePtr()); }
     */
  }

  private void readESL() {
    // Causes the definition of ESL to be read and cached...
    Interpreter.readLanguage("xpl/esl.xpl", "esl");
  }

  private void redirectIO() {
    System.setOut(new PrintStream(new ConsoleOutputStream(console)));
  }

  public Object ref(Key name) {
    if (name == SAVE_HISTORY)
      if (savesHistory)
        return saveHistory;
      else return nullSaveHistory;
    else if (name == SAVE_STATE)
      if (savesHistory)
        return saveState;
      else return nullSaveState;
    else if (name == MATH)
      return math;
    else return null;
  }

  public void schedule(Actor actor) {
  }

  public void send(Actor source, Actor target, Message message) {
    if (savesHistory) history.send(source, target, message, ESL.getTime());
  }

  public void send(Actor actor, String message, int arity) {
    Object[] values = new Object[arity];
    for (int i = arity - 1; i >= 0; i--)
      values[i] = actor.popStack();
    runtime.data.Term term = new runtime.data.Term(Key.getKey(message));
    term.setValues(values);
    send(term, 0);
  }

  public void send(int time, Actor source, Actor target, String name, int arity) {
    // arguments are on the stack of the source actor...
    if (savesHistory) {
      Term term = new Term(Key.getKey(name));
      Object[] values = new Object[arity];
      for (int i = 0; i < arity; i++) {
        values[i] = source.peek(arity - i);
      }
      term.setValues(values);
      Message message = new Message(term, time);
      history.send(source, target, message, time);
    }
  }

  public void send(int time, int source, int target, String name, Object[] values) {
    if (savesHistory) {
      Term term = new Term(Key.getKey(name));
      term.setValues(values);
      Message message = new Message(term, time);
      history.send(source, target, message, time);
    }
  }

  public void send(JavaActor source, Actor target, Message message) {
    // if (getActor() == actor) state.addMessage(message);
    // history.addMessage(source, target, message, Actor.getTime());
  }

  public void send(Object message, int time) {
    if (message instanceof Term) {
      Term term = (Term) message;
      if (term.getName() == SHOW && term.getValues().length == 2) {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            String label = term.getValues()[0].toString();
            String html = SVG.html((Term) RuleBase.asTerm(term.getValues()[1]));
            fileEditors.showHTML(label, html, EDB.this);
          }
        });
      }
      if (term.getName() == ADDBL && term.getValues().length == 1) {
        Actor listener = (Actor) term.getValues()[0];
        browserListeners.add(listener);
      }
      if (term.getName() == FILMSTRIP && term.getValues().length == 2) {
        String label = term.getValues()[0].toString();
        List<?> value = (List<?>) term.getValues()[1];
        Vector<String> strings = new Vector<String>();
        while (!(value instanceof Nil<?>)) {
          Cons<?> pair = (Cons<?>) value;
          String html = SVG.html((Term) RuleBase.asTerm(pair.getHead()));
          strings.add(html);
          value = pair.getTail();
        }
        getFileEditors().showHTML(label, strings, this);
      }
    }
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

  public void setCheckSyntax(boolean checkSyntax) {
    this.checkSyntax = checkSyntax;
  }

  public void setCheckTypes(boolean checkTypes) {
    this.checkTypes = checkTypes;
  }

  public void setFocus(Component component) {
    focus = component;
  }

  public void setLookAndFeel() {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (UnsupportedLookAndFeelException e) {
      e.printStackTrace();
    }
  }

  public void setQueryMachine(Machine machine) {
    queryMachine = machine;
  }

  public void showDeclaration(String path, DeclaringLocation dec) {
    fileEditors.showDeclaration(path, dec);
  }

  public void showProperties(Object value) {
    // properties.resetHistory();
    // properties.showProperties(value);
  }

  public void showTitle(EDBState state, Object... args) {
    Date lDate = new Date(System.currentTimeMillis() - time0);
    switch (state) {
      case IDLE:
        setTitle(NAME + " time = " + ESL.getTime() + " (" + timeFormat.format(lDate) + " ms)");
        break;
      case LOADING:
        setTitle(NAME + " [ Loading " + args[0] + " ]");
        break;
      case LOADED:
        setTitle(NAME + " [ Loaded " + args[0] + ", ready to initialise. ]");
        break;
      case INITIALISING:
        setTitle(NAME + " [ Initialising " + args[0] + " ]");
        break;
      case INITIALISED:
        setTitle(NAME + " [ Initialised " + args[0] + ", ready to run. ]");
        break;
      case STEPPING:
        setTitle(NAME + " [ Stepping " + args[0] + " ]");
        break;
      case RUNNING:
        setTitle(NAME + " [ Running " + args[0] + " ] time = " + ESL.getTime() + " (" + timeFormat.format(lDate) + " ms)");
        break;
      default:
        setTitle(NAME);
    }
  }

  private void splash() {
    if (isOnLine()) {
      openFile(WEB);
    } else {
      String intro = "esl/intro/help.html";
      File file = new File(intro);
      if (file.exists()) openFile(intro);
    }
  }

  public void stop() {
    if (!ESL.isStop()) ESL.stop();
    showTitle(EDBState.IDLE);
  }

  public void timeChanged(int time) {
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          showTitle(toolState, actor.getBehaviour().getPath());
          // state.setTime(time);
        }
      });
    } catch (InvocationTargetException | InterruptedException e) {
      e.printStackTrace();
    }

    // For large simulations this creates too much data. The state
    // in a history should be able to cope if it is updated just when
    // a dynamic is changed...

    // saveActorStates(time);
  }

  public void typeCheck(Module module) {
    try {
      module.type(Builtins.builtinTypes());
    } catch (TypeError e) {
      e.printStackTrace(System.err);
    } catch (TypePatternError e) {
      e.printStackTrace(System.err);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void update(Actor actor, String name, Object value, int time) {
    if (savesHistory) saveActorState(actor, name, value, time);
  }

  public void zoom_in() {
    if (console == focus) console.resizeFont(2);
    if (focus instanceof FileEditor) {
      FileEditor editor = (FileEditor) focus;
      editor.resizeFont(2);
    }
    if (focus instanceof FileTree) {
      FileTree tree = (FileTree) focus;
      tree.resizeFont(2);
    }
    if (focus instanceof BrowserView) {
      BrowserView view = (BrowserView) focus;
      view.getBrowser().zoomIn();
    }
  }

  public void zoom_out() {
    if (console == focus) console.resizeFont(-2);
    if (focus instanceof FileEditor) {
      FileEditor editor = (FileEditor) focus;
      editor.resizeFont(-2);
    }
    if (focus instanceof FileTree) {
      FileTree tree = (FileTree) focus;
      tree.resizeFont(-2);
    }
    if (focus instanceof BrowserView) {
      BrowserView view = (BrowserView) focus;
      view.getBrowser().zoomOut();
    }
  }

}
