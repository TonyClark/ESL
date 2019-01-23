package edb.editor.eslold;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Matcher;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

import ast.actors.Act;
import ast.binding.Binding;
import ast.binding.FunBind;
import ast.binding.Update;
import ast.binding.Var;
import ast.general.AST;
import ast.modules.Configuration;
import ast.modules.Module;
import ast.modules.Parameters;
import ast.patterns.PTerm;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.types.TypeError;
import ast.types.TypePatternError;
import context.ParseError;
import context.StringSource;
import edb.editor.file.Doc;
import edb.editor.file.FileEditor;
import edb.timer.ESLEditorTimer;
import edb.tool.EDB;
import edb.tool.SVG;
import exp.Exp;
import grammar.Grammar;
import runtime.ESL;
import runtime.actors.Builtins;
import runtime.data.Key;
import runtime.data.Term;
import values.JavaObject;
import values.Located;
import values.LocationContainer;
import xpl.Interpreter;

public class ESLEditor extends FileEditor {

  private static final java.util.regex.Pattern IMPORT_PATTERN      = java.util.regex.Pattern.compile("(.*)import(.*)'(.*)'(.*)");
  private static final Color                   TYPE_ERROR_COLOR    = new Color(255, 0, 0);
  private static final Color                   PATTERN_ERROR_COLOR = new Color(0, 255, 0);
  private static final Key                     SHOW                = Key.getKey("Show");
  private static final Color                   TRACED_COLOUR       = new Color(0, 0, 200, 100);

  int                                          flashAt             = -1;
  ESLEditorTimer                               timer               = new ESLEditorTimer(this, EDB.getParseDelay());
  Vector<Stack<String>>                        tracedPaths         = new Vector<Stack<String>>();
  Vector<FunBind>                              tracedFuns          = new Vector<FunBind>();
  Vector<BArm>                                 tracedArms          = new Vector<BArm>();
  Vector<Act>                                  tracedActs          = new Vector<Act>();

  public ESLEditor(String path, EDB gui) {
    super(path, gui, new ESLDoc());
  }

  public void addBreakpoint() {
    if (lines.getSelectedLine() != -1) {

      // Careful since lines are 0-indexed, but displayed and referenced
      // via instructions as 1-indexed...

      lines.setBreakpoint(lines.getCurrentLine() + 1);
    }
  }

  public void concurrentlyTypeCheckText() {
    new Thread(new Runnable() {
      public void run() {
        typeCheckText();
      }
    }).start();
  }

  public ESLEditor copyEditor() {
    ESLEditor editor = new ESLEditor(getPath(), getEDB());
    editor.setDocument(getDocument());
    return editor;
  }

  private void display(String name, Term value) {
    if (SVG.isDisplayable(value)) {
      String html = "<HTML>" + SVG.html(value) + "</HTML>";
      edb.getFileEditors().showHTML("Machine(" + name + ")", html, edb);
    }
  }

  private void doImport(String path) {
    edb.openFile(path);
  }

  private String getImport(Point point) {
    int index = viewToModel(point);
    String line = getLineContaining(index).trim();
    Matcher m = IMPORT_PATTERN.matcher(line);
    if (m.matches())
      return m.group(3);
    else return null;
  }

  private Module getModule() {
    if (ESL.useXPL) {

      Grammar grammar = Interpreter.getGrammar("esl/esl.xpl", "esl");
      Object o = Interpreter.parseCharSource(path, grammar, "file", new StringSource(getText()), new Exp[] { new exp.Str(path) }, false);
      JavaObject jo = (JavaObject) o;
      return (Module) jo.getTarget();
    } else {
      return Module.parseModule("file", getText());
    }
  }

  public Stack<String> getPath(String name, int pos) {

    // Returns the path to the named element at the supplied position.
    // Careful since several AST elements might start at the same position...

    Stack<String> s = new Stack<String>();
    Object[] path = new Object[] { null };
    AST.walk((o) ->
    {
      if (o instanceof Located) {
        Located l = (Located) o;
        if (l.getLineStart() == pos && isNamed(o, name)) {
          s.push(name);
          if (path[0] == null) path[0] = s.clone();
          s.pop();
        }
      }
      if (o instanceof Binding) {
        Binding binding = (Binding) o;
        s.push(binding.getName());
      }
      if (o instanceof Act) {
        Act act = (Act) o;
        s.push(act.getName().toString());
      }
    }, (o) ->
    {
      if (o instanceof Binding || o instanceof Act) s.pop();
    }, container);
    return (Stack<String>) path[0];
  }

  public Vector<Act> getTracedActs() {
    return tracedActs;
  }

  public Vector<BArm> getTracedArms() {
    return tracedArms;
  }

  public Vector<FunBind> getTracedFuns() {
    return tracedFuns;
  }

  public boolean hasBreakpoint() {
    return lines.hasBreakpoint(lines.getCurrentLine());
  }

  public boolean isBreakpoint(int line) {
    return lines.hasBreakpoint(line);
  }

  private boolean isNamed(Object o, String name) {
    if (o instanceof Binding) {
      Binding b = (Binding) o;
      return b.getName().equals(name);
    } else if (o instanceof BArm) {
      BArm arm = (BArm) o;
      if (arm.getPatterns().length == 1 && arm.getPatterns()[0] instanceof PTerm) {
        PTerm pterm = (PTerm) arm.getPatterns()[0];
        return pterm.getName().equals(name);
      } else return false;
    } else if (o instanceof Act) {
      Act act = (Act) o;
      return act.getName().toString().equals(name);
    } else return false;
  }

  private boolean isTracedPath(Stack<String> path) {
    for (Stack<String> p : tracedPaths) {
      if (p.equals(path)) return true;
    }
    return false;
  }

  public void keyReleased(KeyEvent e) {
    super.keyReleased(e);
  }

  public void loadAction() {
    if (isDirty())
      System.out.println("Save " + path + " before loading.");
    else edb.load(path, "", tracedFuns, tracedArms, tracedActs);
  }

  private void loadMenuItem(JPopupMenu popup) {
    Module module = (Module) parseText();
    if (module == null) {
      // Something went wrong, so no load action.
    } else {
      // Check for parameter configurations...
      Parameters params = null;
      Configuration[] configs = params.getConfigs();
      if (configs.length == 0) {
        JMenuItem load = new JMenuItem("Load");
        load.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                load();
              }
            });
          }
        });
        popup.add(load);
      } else {
        JMenu load = new JMenu("Load");
        for (Configuration c : configs) {
          JMenuItem item = new JMenuItem("Configuration[" + c.getName() + "]");
          load.add(item);
          item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              if (isDirty())
                System.out.println("Save " + path + " before loading.");
              else edb.load(path, c.getName(), tracedFuns, tracedArms, tracedActs);
            }

          });
        }
        popup.add(load);
      }
    }
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      String importedPath = getImport(e.getPoint());
      if (importedPath != null)
        doImport(importedPath);
      else toggleBreakpoint();
    }
  }

  public synchronized void paintComponent(Graphics g) {
    super.paintComponent(g);
    paintTracedBindings(g);
    paintTracedArms(g);
    paintTracedActs(g);
  }

  public void paintError(Graphics g) {
    if (errorX == -1) {
      // Careful with this. There is an issue with modelToView(pos) that returns
      // null when a text pane is not fully formed. This causes a problem when files
      // are first loaded since the position of any errors cannot be determined.
      // If that occurs, errorX should be set to -1 and can be caught here. However,
      // calling typeCheckText() calls repaint(). Since repaint() is a request, not
      // a command, it does not appear to cause a loop.
      typeCheckText();
    }
    super.paintError(g);
  }

  private void paintTracedActs(Graphics g) {
    FontMetrics f = g.getFontMetrics();
    Color c = g.getColor();
    for (Act act : tracedActs) {
      try {
        String name = act.getName().toString();
        int actSpace = 4;
        name = (name.startsWith("'") && name.endsWith("'")) ? name.replaceAll("'", "") : name;
        g.setColor(TRACED_COLOUR);
        Rectangle r = modelToView(act.getLineStart() + actSpace);
        int height = f.getHeight();
        int width = f.stringWidth(name);
        g.fillRect(r.x, r.y, width, height);
        g.setColor(Color.black);
        g.drawRect(r.x, r.y, width, height);
      } catch (BadLocationException e) {
        e.printStackTrace();
      }
    }
    g.setColor(c);
  }

  private void paintTracedArms(Graphics g) {
    FontMetrics f = g.getFontMetrics();
    Color c = g.getColor();
    for (BArm arm : tracedArms) {
      try {
        g.setColor(TRACED_COLOUR);
        Rectangle r = modelToView(arm.getLineStart());
        int height = f.getHeight();
        int width = f.stringWidth(arm.getPatterns()[0].pprint());
        g.fillRect(r.x, r.y, width, height);
        g.setColor(Color.black);
        g.drawRect(r.x, r.y, width, height);
      } catch (BadLocationException e) {
        e.printStackTrace();
      }
    }
    g.setColor(c);
  }

  private void paintTracedBinding(Binding b, Graphics g) {
    FontMetrics f = g.getFontMetrics();
    Color c = g.getColor();
    try {
      g.setColor(TRACED_COLOUR);
      Rectangle r = modelToView(b.getLineStart());
      int height = f.getHeight();
      int width = f.stringWidth(b.getName());
      g.fillRect(r.x, r.y, width, height);
      g.setColor(Color.black);
      g.drawRect(r.x, r.y, width, height);
      g.setColor(c);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }

  private void paintTracedBindings(Graphics g) {
    for (Binding b : tracedFuns) {
      paintTracedBinding(b, g);
    }
  }

  public LocationContainer parseText() {
    try {
      error = null;
      container = null;
      Module module = getModule();
      walk(module);
      ((Doc) getStyledDocument()).refreshDocument();
      container = module;
      container = Module.processModule(path, (Module) container);
      return container;
    } catch (ParseError error) {
      setError(error.getPosition(), 0, error.getMessage(), PARSE_ERROR_COLOR);
    } catch (FileNotFoundException e) {
      setError(0, 0, e.getMessage(), PARSE_ERROR_COLOR);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
    return null;
  }

  protected void populate(JPopupMenu popup) {
    JMenu diagrams = new JMenu("Diagrams");
    JMenuItem typeDiagram = new JMenuItem("Type Diagram");
    diagrams.add(typeDiagram);
    typeDiagram.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        showTypeDiagram();
      }
    });
    JMenuItem deleteHistories = new JMenuItem("Delete Histories");
    deleteHistories.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        edb.deleteHistories(path);
      }
    });
    loadMenuItem(popup);
    popup.add(deleteHistories);
    popup.add(diagrams);
    populateTrace(popup);
    populateScrollToDef(popup);
    super.populate(popup);
  }

  private void populateScrollToDef(JPopupMenu popup) {
    if (over != null && over instanceof Var) {
      Var var = (Var) over;
      JMenuItem scroll = new JMenuItem("Scroll To Def");
      scroll.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (var.getDeclaringLocation() != null) {
            setCaretPosition(var.getDeclaringLocation().getLineStart());
          }
        }
      });
      popup.add(scroll);
    }
  }

  private void populateTrace(JPopupMenu popup) {

    // If we are over something that can be traced then
    // add a trace menu item...

    populateTraceFun(popup);
    populateTraceMessage(popup);
    populateTraceAct(popup);
  }

  private void populateTraceAct(JPopupMenu popup) {
    if (over != null && over instanceof Act) {
      Act act = (Act) over;
      String name = act.getName().toString();
      Stack<String> path = getPath(name, act.getLineStart());
      if (isTracedPath(path)) {
        JMenuItem untrace = new JMenuItem("Untrace");
        untrace.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            untracePath(path);
            if (edb.isCheckSyntax()) parseText();
          }
        });
        popup.add(untrace);
      } else {
        JMenuItem trace = new JMenuItem("Trace");
        trace.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent e) {
            tracePath(getPath(name, act.getLineStart()));
            if (edb.isCheckSyntax()) parseText();
          }

        });
        popup.add(trace);
      }
    }
  }

  private void populateTraceFun(JPopupMenu popup) {
    if (over != null && over instanceof FunBind) {
      FunBind funBind = (FunBind) over;
      Stack<String> path = getPath(funBind.getName(), funBind.getLineStart());
      if (isTracedPath(path)) {
        JMenuItem untrace = new JMenuItem("Untrace");
        untrace.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            untracePath(path);
            if (edb.isCheckSyntax()) parseText();
          }
        });
        popup.add(untrace);
      } else {
        JMenuItem trace = new JMenuItem("Trace");
        trace.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent e) {
            tracePath(path);
            if (edb.isCheckSyntax()) parseText();
          }

        });
        popup.add(trace);
      }
    }
  }

  private void populateTraceMessage(JPopupMenu popup) {
    if (over != null && over instanceof BArm) {
      BArm arm = (BArm) over;
      if (arm.getPatterns().length == 1 && arm.getPatterns()[0] instanceof PTerm) {
        PTerm pterm = (PTerm) arm.getPatterns()[0];
        Stack<String> path = getPath(pterm.getName(), arm.getLineStart());
        if (isTracedPath(path)) {
          JMenuItem untrace = new JMenuItem("Untrace");
          untrace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              untracePath(path);
              if (edb.isCheckSyntax()) parseText();
            }
          });
          popup.add(untrace);
        } else {
          JMenuItem trace = new JMenuItem("Trace");
          trace.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              tracePath(path);
              if (edb.isCheckSyntax()) parseText();
            }

          });
          popup.add(trace);
        }
      }
    }
  }

  public void removeBreakpoint() {
    if (lines.getSelectedLine() != -1) {
      lines.removeBreakpoint(lines.getCurrentLine());
    }
  }

  public void run() {
    load();
  }

  private void showTypeDiagram() {
    Module m = (Module) parseText();
    if (m != null) {
      edb.send(new Term(SHOW, "Types(" + m.getPath() + ")", m.getTypeDiagram()), 0);
    }
  }

  public void textChanged() {

    // Called when an ESL file has been changed. Type checking might take a while so
    // do it concurrently. In addition, type checking will require the file to be
    // parsed, so we do not need to do that separately.

    ((ESLDoc) getStyledDocument()).reset();
    if (ESL.useXPL)
      timer.reset();
    else textChangedNow();
  }

  private void textChangedNow() {
    setMessage(null);
    if (getEDB().isCheckSyntax() && getEDB().isCheckTypes()) {
      typeCheckText();
    } else if (getEDB().isCheckSyntax()) {
      parseText();
    } else resetEditor();
  }

  private void toggleBreakpoint() {
    if (hasBreakpoint())
      removeBreakpoint();
    else addBreakpoint();
  }

  private void tracePath(Stack<String> path) {
    tracedPaths.add(path);
  }

  public void typeCheck() {
    if (edb.isCheckTypes()) concurrentlyTypeCheckText();
  }

  public Module typeCheckText() {
    try {
      Module module = (Module) parseText();
      if (module != null) {
        error = null;
        module.type(Builtins.builtinTypes());
        warnings = module.check();
        edb.displayTree(module);
        return module;
      }
    } catch (TypeError e) {
      e.printStackTrace(System.err);
      setError(e.getLineStart(), e.getLineEnd(), e.getMessage(), TYPE_ERROR_COLOR);
    } catch (TypePatternError e) {
      e.printStackTrace(System.err);
      Pattern p = e.getPattern();
      setError(p.getLineStart(), p.getLineEnd(), e.getMessage(), PATTERN_ERROR_COLOR);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
    return null;
  }

  private void untracePath(Stack<String> path) {
    Stack<String> traced = null;
    for (Stack<String> p : tracedPaths) {
      if (p.equals(path)) traced = p;
    }
    if (traced != null) tracedPaths.remove(traced);
  }

  private void walk(Object o) {
    // Walk the AST and inform the ESL doc about particular mark-up.
    Stack<String> path = new Stack<String>();
    tracedFuns.clear();
    tracedArms.clear();
    tracedActs.clear();
    AST.walk((node) ->
    {
      if (node instanceof Update) {
        Update update = (Update) node;

      } else if (node instanceof Act) {
        Act act = (Act) node;
        path.push(act.getName().toString());
        if (isTracedPath(path)) {
          walkTracedAct(act);
        }
      } else if (node instanceof BArm) {
        BArm arm = (BArm) node;
        if (arm.getPatterns().length == 1 && arm.getPatterns()[0] instanceof PTerm) {
          PTerm pterm = (PTerm) arm.getPatterns()[0];
          path.push(pterm.getName());
          if (isTracedPath(path)) {
            tracedArms.add(arm);
          }
        } else path.push("$unknown_arm");
      } else if (node instanceof Binding) {
        Binding binding = (Binding) node;
        path.push(binding.getName());
        if (isTracedPath(path)) {
          if (node instanceof FunBind) walkTracedFun(binding);
        }
      } else if (node instanceof ast.data.Term) {
        walkTerm((ast.data.Term) node);
      } else if (node instanceof PTerm) {
        walkPTerm((PTerm) node);
      }
    }, (node) ->
    {
      if (node instanceof Binding || node instanceof BArm || node instanceof Act) path.pop();
    }, o);
  }

  private void walkPTerm(PTerm term) {
    ESLDoc doc = (ESLDoc) getStyledDocument();
    doc.registerPTerm(term);
  }

  private void walkTerm(ast.data.Term term) {
    ESLDoc doc = (ESLDoc) getStyledDocument();
    doc.registerTerm(term);
  }

  private void walkTracedAct(Act act) {
    tracedActs.add(act);
  }

  private void walkTracedFun(Binding binding) {
    if (binding instanceof FunBind) {
      FunBind funBind = (FunBind) binding;
      tracedFuns.add(funBind);
    }
  }

}
