package edb.tool;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import actors.Actor;
import actors.Behaviour;
import actors.CodeBox;
import actors.Dynamic;
import actors.JavaActor;
import actors.Key;
import actors.Message;
import ast.AST;
import ast.actors.New;
import ast.data.Apply;
import ast.data.Ref;
import ast.modules.Module;
import compiler.DynamicVar;
import compiler.FrameVar;
import edb.console.Console;
import edb.console.ConsoleOutputStream;
import edb.editor.FileEditor;
import edb.editor.FileEditors;
import edb.files.FileTree;
import edb.gui.ActorStack;
import edb.gui.Actors;
import edb.gui.Assembler;
import edb.gui.Properties;
import edb.gui.State;
import instrs.Instr;
import instrs.apply.Return;
import list.Nil;
import listeners.InstrListener;
import listeners.MessageListener;
import listeners.NewActorListener;
import listeners.ScheduleListener;
import listeners.StopListener;
import listeners.TimeListener;
import xpl.Interpreter;

public class EDB extends JFrame implements NewActorListener, StopListener, TimeListener, MessageListener, InstrListener, ScheduleListener {

  static int    WIDTH       = 1500;
  static int    HEIGHT      = 800;
  static int    X           = 10;
  static int    Y           = 10;
  static int    BUTTON_SIZE = 30;
  static String NAME        = "EDB";

  public static void main(String[] args) {
    EDB gui = new EDB(args[0]);
    gui.pack();
    gui.setSize(WIDTH, HEIGHT);
    gui.setLocation(X, Y);
    gui.setVisible(true);
    gui.readESL();
  }

  FileTree    fileTree    = null;
  FileEditors fileEditors = new FileEditors();
  Assembler   assembler   = new Assembler();
  State       state       = new State(this);
  Actors      actors      = new Actors(this);
  Console     console     = new Console(this);
  Properties  properties  = new Properties(this);
  ActorStack  stack       = new ActorStack(this);
  Actor       actor       = null;
  EDBState    toolState   = EDBState.IDLE;
  Component   focus       = null;
  Thread      VM          = null;

  public EDB(String root) {
    redirectIO();
    setLookAndFeel();
    initGUI(root);
    addToolBar();
    Actor.setNewActorListener(this);
    Actor.setStopListener(this);
    Actor.setTimeListener(this);
    Actor.setMessageListener(this);
    Actor.setInstrListener(this);
    Actor.setScheduleListener(this);
    showTitle(EDBState.IDLE);
    splash();
  }

  private void action_init() {
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

  private void action_run() {
    if (toolState == EDBState.INITIALISED) {

      // Run to completion...

      toolState = EDBState.RUNNING;
      showTitle(toolState, actor.getBehaviour().getPath());
      VM = new Thread() {
        public void run() {
          Actor.runESL(0);
        }
      };
      VM.start();
    }
  }

  private void action_step() {
    System.out.println("STEP not implemented.");
  }

  public JPanel actorsPanel() {
    JScrollPane scrollPane = new JScrollPane(actors);
    JPanel consolePanel = new JPanel();
    consolePanel.setLayout(new BorderLayout());
    consolePanel.add(scrollPane);
    consolePanel.setBorder(BorderFactory.createTitledBorder("Actors"));
    return consolePanel;
  }

  public void addMessage(Actor actor, Message message) {
    if (getActor() == actor) state.addMessage(message);
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
    JButton step = new JButton(getImage("icons/step.png", BUTTON_SIZE, BUTTON_SIZE));
    step.setToolTipText("step");
    step.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        action_step();
      }
    });
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
    toolBar.add(step);
    toolBar.add(run);
    toolBar.add(init);
    toolBar.add(zoom_in);
    toolBar.add(zoom_out);
    toolBar.add(about);
    setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.PAGE_START);
  }

  public JPanel assemblerPanel() {
    JScrollPane scrollPane = new JScrollPane(assembler);
    JPanel consolePanel = new JPanel();
    scrollPane.setRowHeaderView(assembler.getLines());
    consolePanel.setLayout(new BorderLayout());
    consolePanel.add(scrollPane);
    consolePanel.setBorder(BorderFactory.createTitledBorder("Assembler"));
    return consolePanel;
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

  public void deleteMessage(Actor actor, Message message) {
    if (getActor() == actor) state.deleteMessage(message);
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

  public void error(String message, String title) {
    int dialogButton = JOptionPane.ERROR_MESSAGE;
    JOptionPane.showMessageDialog(null, message, title, dialogButton);
  }

  public void fileDeleted(String path) {
    fileEditors.fileDeleted(path);
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

  public ImageIcon getImage(String file, int width, int height) {
    Image img = new ImageIcon(file).getImage();
    Image newImg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    return new ImageIcon(newImg);
  }

  public void initGUI(String root) {
    JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fileEditors, consolePanel());
    JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fileTree(root), actorsPanel());
    JSplitPane splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane2, splitPane1);
    JSplitPane splitPane5 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, assemblerPanel(), statePanel());
    JSplitPane splitPane7 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, propertiesPanel(), stackPanel());
    JSplitPane splitPane6 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane5, splitPane7);
    JSplitPane splitPane4 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane3, splitPane6);
    splitPane1.setBorder(null);
    splitPane2.setBorder(null);
    splitPane3.setBorder(null);
    splitPane5.setBorder(null);
    splitPane6.setBorder(null);
    splitPane7.setBorder(null);
    splitPane1.setOneTouchExpandable(true);
    splitPane2.setOneTouchExpandable(true);
    splitPane3.setOneTouchExpandable(true);
    splitPane4.setOneTouchExpandable(true);
    splitPane5.setOneTouchExpandable(true);
    splitPane1.setDividerLocation(500);
    splitPane2.setDividerLocation(HEIGHT - 200);
    splitPane3.setDividerLocation(200);
    splitPane4.setDividerLocation(1000);
    splitPane5.setDividerLocation(200);
    splitPane6.setDividerLocation(HEIGHT - 300);
    splitPane7.setDividerLocation(200);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    add(splitPane4);
  }

  private boolean isBreakpoint(Actor actor, Instr instr) {
    return fileEditors.isBreakpoint(actor, instr.getLineStart());
  }

  public boolean isDirty(String path) {
    return fileEditors.isDirty(path);
  }

  public void load(String path) {
    actors.reset();
    showTitle(EDBState.LOADING, path);
    new Thread(new Runnable() {
      public void run() {
        Actor.resetESL();
        try {
          Module module = Module.importModule(path);
          module.resolve();
          AST record = new New(0, 0, new Apply(0, 0, new Ref(0, 0, module.desugar(), Key.getKey("main"))));
          // AST.printTree(record, System.out, 0);
          CodeBox codebox = new CodeBox(path, record.maxLocals());
          record.compile(new Nil<FrameVar>(), Actor.builtinDynamics(), codebox, true);
          codebox.add(new Return(-1), new Nil<FrameVar>(), new Nil<DynamicVar>());
          actor = new Actor(new Behaviour("init", new Key[0], new Nil<Dynamic>(), 0, codebox));
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
    actors.add(actor);
  }

  public void newActor(JavaActor actor) {
    if (actor instanceof JPanel) fileEditors.openPanel((JPanel) actor);
  }

  public void openActor(Actor actor) {
    openFile(actor.getBehaviour().getPath());
    setActor(actor);
    properties.resetHistory();
    properties.showProperties(actor);
    stack.showStack(actor);
  }

  public void openActor(Actor actor, int textPos, int codePtr) {
    CodeBox code = actor.getCode();
    openFile(code.getPath());
    openAsm(actor);
    setActor(actor);
    stack.showStack(actor);
    if (textPos != -1) fileEditors.selectLine(textPos);
    assembler.selectLine(codePtr);
    state.clearVariables();
    if (!actor.complete()) {
      int i = 0;
      for (String name : code.getLocalNames(codePtr))
        state.showLocal(name, actor.getFrameVar(i++));
      i = 0;
      for (String name : code.getDynamicNames(codePtr))
        state.showDynamic(name, actor.getDynamic(i++));
    }
  }

  private void openAsm(Actor actor) {
    CodeBox code = actor.getCode();
    if (code != null) assembler.openAsm(code);
  }

  public void openFile(String path) {
    fileEditors.openFile(path, this);
  }

  public void perform(Actor actor) {
    Instr instr = actor.nextInstr();
    if (instr != null && isBreakpoint(actor, instr)) {
      stop();
      openActor(actor, instr.getLineStart(), actor.getCodePtr());
    }
  }

  public JPanel propertiesPanel() {
    JPanel propertiesPanel = new JPanel();
    propertiesPanel.setLayout(new BorderLayout());
    propertiesPanel.add(properties);
    propertiesPanel.setBorder(BorderFactory.createTitledBorder("Properties"));
    return propertiesPanel;
  }

  private void readESL() {
    // Causes the definition of ESL to be read and cached...
    Interpreter.readLanguage("esl/esl.xpl", "esl");
  }

  private void redirectIO() {
    System.setOut(new PrintStream(new ConsoleOutputStream(console)));
  }

  public void schedule(Actor actor) {
  }

  public void setActor(Actor actor) {
    this.actor = actor;
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

  public void showProperties(Object value) {
    properties.resetHistory();
    properties.showProperties(value);
  }

  public void showTitle(EDBState state, Object... args) {
    switch (state) {
      case IDLE:
        setTitle(NAME);
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
        setTitle(NAME + " [ Running " + args[0] + " ]");
        break;
      default:
        setTitle(NAME);
    }
  }

  private void splash() {
    String intro = "esl/intro/help.html";
    File file = new File(intro);
    if (file.exists()) openFile(intro);
  }

  public JPanel stackPanel() {
    JPanel stackPanel = new JPanel();
    stackPanel.setLayout(new BorderLayout());
    stackPanel.add(stack);
    stackPanel.setBorder(BorderFactory.createTitledBorder("Stack"));
    return stackPanel;
  }

  public JPanel statePanel() {
    JPanel statePanel = new JPanel();
    statePanel.setLayout(new BorderLayout());
    statePanel.add(state);
    statePanel.setBorder(BorderFactory.createTitledBorder("State"));
    return statePanel;
  }

  public void stop() {
    showTitle(EDBState.IDLE);
  }

  public void timeChanged(int time) {
    state.setTime(time);
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
  }

  public void fileHasError(String path, boolean isError) {
    fileEditors.hasError(path, isError);
  }

}
