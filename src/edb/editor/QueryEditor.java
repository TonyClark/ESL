package edb.editor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import ast.general.AST;
import ast.query.body.Call;
import ast.query.body.DBName;
import ast.query.machine.DB;
import ast.query.machine.Machine;
import ast.query.rules.ClauseTable;
import ast.query.rules.Query;
import ast.query.rules.Rule;
import ast.query.rules.RuleBase;
import ast.types.TypeError;
import context.ParseError;
import context.StringSource;
import edb.actions.LoadAction;
import edb.actions.RunAction;
import edb.actions.TypeCheckAction;
import edb.tool.EDB;
import edb.tool.EDBState;
import edb.tool.SVG;
import exp.Exp;
import grammar.Grammar;
import history.History;
import list.Cons;
import runtime.data.Key;
import runtime.data.Term;
import values.JavaObject;
import values.LocationContainer;
import xpl.Interpreter;

public class QueryEditor extends FileEditor {

  private static final Color TYPE_ERROR_COLOR = new Color(255, 0, 0);
  private static final int   flashAt          = -1;

  Action                     runAction        = new RunAction(this);
  Action                     loadAction       = new LoadAction(this);
  Action                     typeCheckAction  = new TypeCheckAction(this);
  JFileChooser               chooser          = new JFileChooser(EDB.getHistoryFiles());

  public QueryEditor(String path, EDB gui) {
    super(path, gui, new QueryDoc());
    registerKeyboardAction(runAction, KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(runAction, KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(loadAction, KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(loadAction, KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(typeCheckAction, KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    registerKeyboardAction(typeCheckAction, KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_MASK), JComponent.WHEN_FOCUSED);
  }

  public void applyToHistory(String path, File historyFile) {
    JavaObject o = (JavaObject) Interpreter.readFile("xpl/query.xpl", "query", path, "file", new exp.Str(path));
    History history = History.inflate(historyFile.getAbsolutePath());
    Query query = (Query) o.getTarget();
    long time0 = System.currentTimeMillis();
    Object value = query.satisfy(history);
    System.out.print("after " + (System.currentTimeMillis() - time0) + " ms: ");
    System.out.println(value);
    display(historyFile.getName(), value);
  }

  private void concurrentlyParseText() {
    new Thread(new Runnable() {
      public void run() {
        parseText();
      }
    }).start();
  }

  private void concurrentlyTypeCheckText() {
    new Thread(new Runnable() {
      public void run() {
        typeCheckText();
      }
    }).start();
  }

  private void concurrentlyTypeCheckText(LocationContainer container) {
    new Thread(new Runnable() {
      public void run() {
        Query query = (Query) container;
        typeCheckText(query);
      }
    }).start();
  }

  private void display(String tag, Object value) {
    if (value instanceof Cons) {
      Cons pair = (Cons) value;
      if (pair.isRealList()) {
        Vector<String> strings = new Vector<String>();
        while (value instanceof Cons) {
          pair = (Cons) value;
          strings.add(getHTML(pair.getHead()));
          value = pair.getTail();
        }
        edb.getFileEditors().showHTML(tag, strings, edb);
      }
    } else if (SVG.isDisplayable(value)) {
      String html = "<HTML>" + SVG.html((Term) value) + "</HTML>";
      edb.getFileEditors().showHTML(tag, html, edb);
    }
  }

  private History getHistory(File file) {
    if (file == null)
      return null;
    else return History.inflate(file.getAbsolutePath());
  }

  private File getHistoryFile() {
    FileNameExtensionFilter filter = new FileNameExtensionFilter("History Files", "hst");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION)
      return chooser.getSelectedFile();
    else return null;
  }

  private String getHTML(Object value) {
    if (SVG.isDisplayable(value)) {
      return "<HTML>" + SVG.html((Term) value) + "</HTML>";
    } else return "<HTML></HTML>";
  }

  private void highlightQuery(Object o, QueryDoc doc) {
    if (o instanceof ast.query.value.Name) {
      ast.query.value.Name name = (ast.query.value.Name) o;
      doc.highlightName(name.getLineStart(), name.getLineEnd());
    }
    if (o instanceof ast.query.value.Term) {
      ast.query.value.Term term = (ast.query.value.Term) o;
      doc.highlightFunctor(term.getLineStart(), term.getLineStart() + term.getName().getString().length());
    }
    if (o instanceof ast.query.TypeDec) {
      ast.query.TypeDec dec = (ast.query.TypeDec) o;
      doc.highlightTypeDec(dec);
    }
    if (o instanceof ast.query.body.Call) {
      ast.query.body.Call call = (ast.query.body.Call) o;
      doc.highlightCall(call);
    }
    if (o instanceof Rule) {
      Rule rule = (Rule) o;
      if (spied(rule.getName())) doc.highlightSpied(rule);
    }
  }

  public void highlightSyntax() {
    super.highlightSyntax();
    QueryDoc doc = (QueryDoc) getStyledDocument();
    if (container != null) AST.walk((o) -> highlightQuery(o, doc), (o) -> {}, container);
  }

  private boolean isGraph(Object value) {
    if (value instanceof Term) {
      Term term = (Term) value;
      return term.getName().getString().equals("Graph");
    } else return false;
  }

  public void loadAction() {
    // Load the definitions so that they are available via the console...
    Query query = typeCheckText();
    RuleBase rules = query.getRules();
    Call.setDBNames(new DBName[] { new DBName(Key.getKey("actor"), 3), new DBName(Key.getKey("send"), 4), new DBName(Key.getKey("state"), 4) });
    ClauseTable table = rules.compile();
    DB db = getHistory(getHistoryFile());
    Machine machine = new Machine(table, db);
    edb.setQueryMachine(machine);
  }

  public synchronized LocationContainer parseText() {
    try {
      error = null;
      container = null;
      Grammar grammar = Interpreter.getGrammar("xpl/query.xpl", "query");
      Object o = null;
      if (path.endsWith("q"))
        o = Interpreter.parseCharSource(path, grammar, "file", new StringSource(getText()), new Exp[] { new exp.Str(path) }, false);
      else if (path.endsWith("r")) o = Interpreter.parseCharSource(path, grammar, "ruleBase", new StringSource(getText()), new Exp[] {}, false);
      repaint();
      JavaObject jo = (JavaObject) o;
      container = (LocationContainer) jo.getTarget();
      if (container instanceof Query) {
        Query query = (Query) container;
        query.setDefs();
      }
      return container;
    } catch (ParseError error) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          setError(backupSyntax(error.getPosition()), 0, error.getMessage(), PARSE_ERROR_COLOR);
          repaint();
        }
      });
    }
    return null;
  }

  protected void populate(JPopupMenu popup) {
    if (path.endsWith(".q")) {
      JMenuItem run = new JMenuItem("Run");
      run.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          run();
        }
      });
      popup.add(run);
      JMenuItem load = new JMenuItem("Load");
      load.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          load();
        }
      });
      popup.add(load);
      JMenuItem spyAll = new JMenuItem("SpyAll");
      spyAll.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          spyAll();
        }
      });
      popup.add(spyAll);
      JMenuItem unspyAll = new JMenuItem("UnspyAll");
      unspyAll.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          unspyAll();
        }
      });
      popup.add(unspyAll);
      if (over != null && over instanceof Rule) {
        Query query = (Query) container;
        Rule rule = (Rule) over;
        if (query.spied(rule.getName())) {
          JMenuItem unspy = new JMenuItem("Unspy");
          unspy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              unspy(rule);
            }
          });
          popup.add(unspy);
        } else {
          JMenuItem spy = new JMenuItem("Spy");
          spy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              spy(rule);
            }
          });
          popup.add(spy);
        }
      }
    }
    super.populate(popup);
  }

  public void run() {
    if (isDirty())
      System.out.println("Save " + path + " before loading.");
    else {
      File history = getHistoryFile();
      if (history != null) {
        edb.showTitle(EDBState.RUNNING, path + " on " + history.getName());
        new Thread(new Runnable() {
          public void run() {
            applyToHistory(path, history);
            edb.showTitle(EDBState.IDLE);
          }
        }).start();
      }
    }
  }

  private boolean spied(String name) {
    if (container != null && container instanceof Query) {
      Query query = (Query) container;
      return query.spied(name);
    } else return false;
  }

  protected void spy(Rule rule) {
    Query query = (Query) container;
    query.spy(rule.getName());
  }

  protected void spyAll() {
    Query query = (Query) container;
    query.spyAll();
  }

  public void textChanged() {

    // Called when a query file has been changed. Type checking might take a while so
    // do it concurrently. In addition, type checking will require the file to be
    // parsed, so we do not need to do that separately.

    if (edb.isCheckSyntax() && edb.isCheckTypes())
      concurrentlyTypeCheckText();
    else if (edb.isCheckSyntax())
      parseText();
    else resetEditor();
  }

  public void typeCheck() {
    if (container != null) concurrentlyTypeCheckText(container);
  }

  protected synchronized Query typeCheckText() {
    Query query = (Query) parseText();
    if (query != null) typeCheckText(query);
    return query;
  }

  public void typeCheckText(Query query) {
    try {
      error = null;
      query.check();
      query.typeCheck();
      edb.displayTree(path, query);
      highlightSyntax();
      repaint();
    } catch (TypeError e) {
      e.printStackTrace(System.err);
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          setError(e.getLineStart(), e.getLineEnd(), e.getMessage(), TYPE_ERROR_COLOR);
          repaint();
        }
      });
    }
  }

  protected void unspy(Rule rule) {
    Query query = (Query) container;
    query.unspy(rule.getName());
  }

  protected void unspyAll() {
    Query query = (Query) container;
    query.unspyAll();
  }

  public QueryEditor copyEditor() {
    QueryEditor editor = new QueryEditor(getPath(), getEDB());
    editor.setDocument(getDocument());
    return editor;
  }

}
