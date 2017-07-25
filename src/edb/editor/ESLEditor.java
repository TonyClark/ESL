package edb.editor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import ast.modules.Configuration;
import ast.modules.Module;
import ast.modules.Parameters;
import ast.patterns.Pattern;
import ast.types.TypeError;
import ast.types.TypePatternError;
import context.ParseError;
import context.StringSource;
import edb.timer.ESLEditorTimer;
import edb.tool.EDB;
import edb.tool.SVG;
import exp.Exp;
import grammar.Grammar;
import runtime.actors.Builtins;
import runtime.data.Key;
import runtime.data.Term;
import values.JavaObject;
import values.LocationContainer;
import xpl.Interpreter;

public class ESLEditor extends FileEditor {

  private static final java.util.regex.Pattern IMPORT_PATTERN      = java.util.regex.Pattern.compile("(.*)import(.*)'(.*)'(.*)");
  private static final Color                   TYPE_ERROR_COLOR    = new Color(255, 0, 0);
  private static final Color                   PATTERN_ERROR_COLOR = new Color(0, 255, 0);
  private static final Key                     SHOW                = Key.getKey("Show");

  int                                          flashAt             = -1;
  ESLEditorTimer                               timer               = new ESLEditorTimer(this, 2000);

  public ESLEditor(String path, EDB gui) {
    super(path, gui);
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

  public boolean hasBreakpoint() {
    return lines.hasBreakpoint(lines.getCurrentLine());
  }

  public boolean isBreakpoint(int line) {
    return lines.hasBreakpoint(line);
  }

  public void keyReleased(KeyEvent e) {
    super.keyReleased(e);
  }

  public void loadAction() {
    if (isDirty())
      System.out.println("Save " + path + " before loading.");
    else edb.load(path, "");
  }

  private void loadMenuItem(JPopupMenu popup) {
    Module module = (Module) parseText();
    if (module == null) {
      // Something went wrong, so no load action.
    } else {
      // Check for parameter configurations...
      Parameters params = module.getParams();
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
              else edb.load(path, c.getName());
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

  public LocationContainer parseText() {
    try {
      error = null;
      container = null;
      Grammar grammar = Interpreter.getGrammar("esl/esl.xpl", "esl");
      Object o = Interpreter.parseCharSource(path, grammar, "file", new StringSource(getText()), new Exp[] { new exp.Str(path) }, false);
      repaint();
      JavaObject jo = (JavaObject) o;
      container = (Module) jo.getTarget();
      container = Module.processModule(path, (Module) container);
      return container;
    } catch (ParseError error) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          setError(backupSyntax(error.getPosition()), 0, error.getMessage(), PARSE_ERROR_COLOR);
          repaint();
        }
      });
    } catch (FileNotFoundException e) {
      SwingUtilities.invokeLater(new Runnable() {

        public void run() {
          setError(0, 0, e.getMessage(), PARSE_ERROR_COLOR);
          repaint();
        }

      });
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
    super.populate(popup);
  }

  public void removeBreakpoint() {
    if (lines.getSelectedLine() != -1) {
      lines.removeBreakpoint(lines.getCurrentLine());
    }
  }

  public void run() {
    edb.load(path, "");
    edb.action_init();
    edb.action_run();
  }

  protected void setStyle() {
    setStyledDocument(new ESLDoc());
  }

  private void showTypeDiagram() {
    Module m = (Module) parseText();
    if (m != null) {
      edb.send(new Term(SHOW, "Types(" + m.getPath() + ")", m.getTypeDiagram()), 0);
    }
  }

  public synchronized void textChanged() {

    // Called when an ESL file has been changed. Type checking might take a while so
    // do it concurrently. In addition, type checking will require the file to be
    // parsed, so we do not need to do that separately.

    timer.reset();
  }

  private void toggleBreakpoint() {
    if (hasBreakpoint())
      removeBreakpoint();
    else addBreakpoint();
  }

  public void typeCheck() {
    if (edb.isCheckTypes()) concurrentlyTypeCheckText();
  }

  protected synchronized Module typeCheckText() {
    try {
      Module module = (Module) parseText();
      if (module != null) {
        error = null;
        module.type(Builtins.builtinTypes());
        edb.displayTree(module);
        repaint();
        return module;
      }
    } catch (TypeError e) {
      e.printStackTrace(System.err);
      setError(e.getLineStart(), e.getLineEnd(), e.getMessage(), TYPE_ERROR_COLOR);
      repaint();
    } catch (TypePatternError e) {
      e.printStackTrace(System.err);
      Pattern p = e.getPattern();
      setError(p.getLineStart(), p.getLineEnd(), e.getMessage(), PATTERN_ERROR_COLOR);
      repaint();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }

}
