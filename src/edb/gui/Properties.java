package edb.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import actors.Actor;
import actors.ActorState;
import actors.Behaviour;
import actors.Builtin;
import actors.Closure;
import actors.CodeBox;
import actors.Dynamic;
import actors.Field;
import actors.Key;
import actors.Record;
import edb.gui.variables.Variable;
import edb.tool.EDB;
import list.List;

public class Properties extends JPanel implements TableModel, MouseListener {

  static Font      font        = new Font("Courier", Font.PLAIN, 10);
  static int       BUTTON_SIZE = 10;

  JTable           table       = new JTable(this);
  Vector<Variable> variables   = new Vector<Variable>();
  Stack<Object>    back        = new Stack<Object>();
  Stack<Object>    forward     = new Stack<Object>();
  Object           current;
  EDB              edb;

  public Properties(EDB edb) {
    super();
    this.edb = edb;
    table.setFont(font);
    table.getTableHeader().setFont(font);
    table.setBackground(Color.WHITE);
    table.setGridColor(Color.BLACK);
    table.setShowGrid(true);
    table.addMouseListener(this);
    setLayout(new BorderLayout());
    addToolBar();
    add(new JScrollPane(table), BorderLayout.CENTER);
  }

  public void addTableModelListener(TableModelListener l) {
  }

  public void addToolBar() {
    JToolBar toolBar = new JToolBar("Property Commands");
    JButton forward = new JButton(getImage("icons/forward.png", BUTTON_SIZE, BUTTON_SIZE));
    forward.setToolTipText("forward");
    forward.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        forward();
      }
    });
    JButton back = new JButton(getImage("icons/back.png", BUTTON_SIZE, BUTTON_SIZE));
    back.setToolTipText("forwabackrd");
    back.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        back();
      }
    });
    toolBar.add(back);
    toolBar.add(forward);
    setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.PAGE_START);
  }

  public void back() {
    if (!back.isEmpty()) {
      if (current != null) forward.push(current);
      showProperties(back.pop());
    }
  }

  public void forward() {
    if (!forward.isEmpty()) {
      if (current != null) back.push(current);
      showProperties(forward.pop());
    }
  }

  public Class<?> getColumnClass(int columnIndex) {
    switch (columnIndex) {
      case 0:
        return String.class;
      case 1:
        return Object.class;
      default:
        return Object.class;
    }
  }

  public int getColumnCount() {
    return 2;
  }

  public String getColumnName(int columnIndex) {
    switch (columnIndex) {
      case 0:
        return "property";
      case 1:
        return "value";
      default:
        return "?";
    }
  }

  public ImageIcon getImage(String file, int width, int height) {
    Image img = new ImageIcon(file).getImage();
    Image newImg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    return new ImageIcon(newImg);
  }

  public int getRowCount() {
    return variables.size();
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    if (rowIndex >= variables.size()) return null;
    switch (columnIndex) {
      case 0:
        return variables.get(rowIndex).getName();
      case 1:
        return variables.get(rowIndex).getValue();
      default:
        return "?";
    }
  }

  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      int row = table.rowAtPoint(e.getPoint());
      int col = table.columnAtPoint(e.getPoint());
      if (col == 1) {
        Variable v = variables.get(row);
        forward.clear();
        saveCurrent();
        showProperties(v.getValue());
      }
    }
  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mouseExited(MouseEvent e) {

  }

  public void mousePressed(MouseEvent e) {

  }

  public void mouseReleased(MouseEvent e) {

  }

  public void removeTableModelListener(TableModelListener l) {
  }

  public void resetHistory() {
    back.clear();
    forward.clear();
    current = null;
  }

  private void saveCurrent() {
    if (current != null) {
      back.push(current);
    }
  }

  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    if (rowIndex < variables.size()) {
      switch (columnIndex) {
        case 0:
          variables.get(rowIndex).setName(aValue.toString());
        case 1:
          variables.get(rowIndex).setValue(aValue);
        default:
      }
    }
  }

  private void showActor(Actor actor) {
    Behaviour b = actor.getBehaviour();
    int codePtr = actor.complete() ? -1 : actor.getCodePtr();
    ActorState state = actor.getState();
    variables.add(new Variable("type", "Actor"));
    variables.add(new Variable("behaviour", b));
    variables.add(new Variable("codePtr", codePtr));
    variables.add(new Variable("state", state));

  }

  private void showArray(Object[] a) {
    for (int i = 0; i < a.length; i++)
      variables.add(new Variable(i + "", a[i]));
  }

  private void showBehaviour(Behaviour b) {
    String name = b.getName();
    Key[] exports = b.getExports();
    List<Dynamic> dynamics = b.getDynamics();
    int initIndex = b.getInitIndex();
    CodeBox code = b.getCode();
    variables.add(new Variable("type", "Behaviour"));
    variables.add(new Variable("name", name));
    variables.add(new Variable("exports", exports));
    variables.add(new Variable("dynamics", dynamics));
    variables.add(new Variable("initIndex", initIndex));
    variables.add(new Variable("code", code));
  }

  private void showBuiltin(Builtin builtin) {
    String name = builtin.getName();
    variables.add(new Variable("type", "Builtin"));
    variables.add(new Variable("name", name));
  }

  private void showClosure(Closure closure) {
    String name = closure.getName();
    int arity = closure.getArity();
    List<Dynamic> dynamics = closure.getDynamics();
    CodeBox code = closure.getCode();
    variables.add(new Variable("type", "Closure"));
    variables.add(new Variable("name", name));
    variables.add(new Variable("arity", arity));
    variables.add(new Variable("dynamics", dynamics));
    variables.add(new Variable("code", code));
  }

  private void showCodeBox(CodeBox code) {
    String path = code.getPath();
    int locals = code.getLocals();
    variables.add(new Variable("type", "CodeBox"));
    variables.add(new Variable("path", path));
    variables.add(new Variable("locals", locals));
    edb.openFile(path);
  }

  private void showDynamic(Dynamic dynamic) {
    showProperties(dynamic.getValue());
  }

  private void showList(List<?> list) {
    if (list.isRealList()) {
      variables.add(new Variable("type", "List"));
      while (!list.isNil()) {
        variables.add(new Variable("", list.getHead()));
        list = list.getTail();
      }
    } else {
      variables.add(new Variable("type", "Cons"));
      variables.add(new Variable("head", list.getHead()));
      variables.add(new Variable("type", list.getTail()));
    }
  }

  public void showProperties(Object value) {
    current = value;
    variables.clear();
    if (value instanceof Builtin) {
      showBuiltin((Builtin) value);
    }
    if (value instanceof Actor) {
      showActor((Actor) value);
    }
    if (value instanceof Behaviour) {
      showBehaviour((Behaviour) value);
    }
    if (value instanceof CodeBox) {
      showCodeBox((CodeBox) value);
    }
    if (value.getClass().isArray()) {
      showArray((Object[]) value);
    }
    if (value instanceof Closure) {
      showClosure((Closure) value);
    }
    if (value instanceof List<?>) {
      showList((List<?>) value);
    }
    if (value instanceof Record) {
      showRecord((Record) value);
    }
    if (value instanceof Dynamic) {
      showDynamic((Dynamic) value);
    }
    if (value instanceof String) showString((String) value);
    if (value instanceof Integer) showInt((int) value);
    if (value instanceof Boolean) showBool((boolean) value);
    table.revalidate();
    repaint();
  }

  private void showString(String s) {
    variables.add(new Variable("String", s));
  }

  private void showInt(int i) {
    variables.add(new Variable("int", i));
  }

  private void showBool(boolean b) {
    variables.add(new Variable("boolean", b));
  }

  private void showRecord(Record record) {
    Field[] fields = record.getFields();
    variables.add(new Variable("type", "Record"));
    for (Field field : fields)
      variables.add(new Variable(field.getName().getString(), field.getValue()));
  }

}
