package edb.editor;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.PageMargins;
import com.teamdev.jxbrowser.chromium.PrintHandler;
import com.teamdev.jxbrowser.chromium.PrintJob;
import com.teamdev.jxbrowser.chromium.PrintSettings;
import com.teamdev.jxbrowser.chromium.PrintStatus;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import actors.Actor;
import ast.modules.Module;
import edb.tool.EDB;

public class FileEditors extends EditorTabbedPane {

  static JFileChooser fileChooser = new JFileChooser();

  public static String pathToLabel(String path) {
    if (path.endsWith(".esl")) return path.substring(path.lastIndexOf('/') + 1);
    if (path.endsWith(".html")) return path.substring(path.lastIndexOf('/') + 1);
    return path;
  }

  EDB edb;

  public FileEditors(EDB edb) {
    this.edb = edb;
  }

  private void createPanel(String label, JPanel panel) {
    ClosablePanel parent = new ClosablePanel(panel) {
      public void close() {
        if (panel instanceof TabbedActor) {
          TabbedActor closable = (TabbedActor) panel;
          closable.close();
        }
      }

      public void deselect() {
        if (panel instanceof TabbedActor) {
          TabbedActor closable = (TabbedActor) panel;
          closable.deselect();
        }
      }

      public void select() {
        if (panel instanceof TabbedActor) {
          TabbedActor closable = (TabbedActor) panel;
          closable.select();
        }
      }
    };
    parent.setLayout(new BorderLayout());
    parent.add(panel);
    addTab(label, parent);
  }

  public void fileDeleted(String path) {
    int i = indexOfTab(path);
    if (i != -1) this.remove(i);
  }

  private FileEditor getSelectedFileEditor() {
    Component component = getSelectedComponent();
    if (component != null && component instanceof JScrollPane) {
      JScrollPane scroller = (JScrollPane) component;
      return (FileEditor) scroller.getViewport().getView();
    } else return null;
  }

  public void hasError(String path, boolean isError) {
    int i = indexOfTab(path);
    if (i != -1) {
      CloseButtonTab tab = (CloseButtonTab) getTabComponentAt(i);
      tab.hasError(isError);
    }
  }

  public boolean isBreakpoint(Actor actor, int line) {
    int i = indexOfTab(actor.getCode().getPath());
    if (i != -1) {
      Component component = getComponentAt(i);
      if (component != null && component instanceof JScrollPane) {
        JScrollPane scroller = (JScrollPane) component;
        FileEditor editor = (FileEditor) scroller.getViewport().getView();

        return editor.isBreakpoint(line);
      } else return false;
    } else return false;
  }

  public boolean isDirty(String path) {
    int i = indexOfTab(path);
    if (i == -1) {
      FileEditor editor = (FileEditor) getComponentAt(i);
      return editor.isDirty();
    }
    return false;
  }

  private void loadESLFile(String path, EDB gui) {
    FileEditor editor = new FileEditor(path, gui);
    JScrollPane scroller = new JScrollPane(editor);
    scroller.setRowHeaderView(editor.getLines());
    addTab(path, scroller);
    Module module = editor.typeCheckText();
    if (module != null) gui.displayTree(module);
  }

  private void loadFile(String path, EDB gui) {
    if (path.startsWith("http"))
      loadURL(path, gui);
    else if (path.endsWith(".esl"))
      loadESLFile(path, gui);
    else if (path.endsWith(".html"))
      loadHTMLFile(path, gui);
    else System.out.println("FileEditors.loadFile: unknown type of file: " + path);
  }

  private void loadHTMLFile(final String path, EDB gui) {
    new Thread(new Runnable() {
      public void run() {
        try {
          String url = new File(path).toURI().toURL().toString();
          HTMLViewer viewer = new HTMLViewer(url, gui);
          JScrollPane scroller = new JScrollPane(viewer);
          addTab(path, scroller);
          setSelectedIndex(indexOfTab(path));
        } catch (IOException ioe) {
          ioe.printStackTrace(System.out);
        }
      }
    }).start();
  }

  private void loadURL(String path, EDB gui) {
    new Thread(new Runnable() {
      public void run() {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        JScrollPane scroller = new JScrollPane(view);
        browser.loadURL(path);
        addTab(path, scroller);
        setSelectedIndex(indexOfTab(path));
      }
    }).start();
  }

  public void openFile(String path, EDB gui) {
    int i = indexOfTab(path);
    if (i == -1) loadFile(path, gui);
    i = indexOfTab(path);
    setSelectedIndex(i);
  }

  public void openPanel(JPanel panel) {
    String label = "Panel(" + panel.hashCode() + ")";
    int i = indexOfTab(label);
    if (i == -1) createPanel(label, panel);
    i = indexOfTab(label);
    setSelectedIndex(i);
  }

  public void resizeFont(int amount) {
    int i = getSelectedIndex();
    if (i != -1) getSelectedFileEditor().resizeFont(amount);
  }

  public void selectLine(int line) {
    FileEditor editor = getSelectedFileEditor();
    if (editor != null) editor.selectLine(line);
  }

  public void showHTML(String label, String html, EDB gui) {
    Browser browser = new Browser();
    BrowserView view = new BrowserView(browser);
    view.setInheritsPopupMenu(true);
    view.setFocusable(true);
    Action printAction = new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        browser.print();
      }
    };
    view.registerKeyboardAction(printAction, KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
    browser.setPrintHandler(new PrintHandler() {
      public PrintStatus onPrint(PrintJob printJob) {
        PrintSettings settings = printJob.getPrintSettings();
        settings.setPrintToPDF(true);
        settings.setPageMargins(new PageMargins(0, 0, 0, 0, 0, 0));
        settings.setLandscape(true);
        if (fileChooser.showSaveDialog(view) == JFileChooser.APPROVE_OPTION) {
          File file = fileChooser.getSelectedFile();
          settings.setPDFFilePath(file.getAbsolutePath());
          return PrintStatus.CONTINUE;
        } else return PrintStatus.CANCEL;
      }
    });
    view.addMouseListener(new MouseListener() {

      public void mouseClicked(MouseEvent e) {
        edb.setFocus(view);
      }

      public void mousePressed(MouseEvent e) {
        edb.setFocus(view);
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

      }

      @Override
      public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

      }

      @Override
      public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

      }
    });
    view.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        edb.setFocus(view);
      }

      public void focusLost(FocusEvent e) {
      }
    });
    JScrollPane scroller = new JScrollPane(view);
    scroller.setComponentPopupMenu(popup(browser));
    browser.loadHTML(html);
    addTab(label, scroller);
    setSelectedIndex(indexOfTab(label));
  }

  private JPopupMenu popup(Browser browser) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem print = new JMenuItem("Print");
    print.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        browser.print();
      }
    });
    popup.add(print);
    return popup;
  }

}
