package edb.gui.variables;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import edb.gui.State;

public class Variables extends JPanel implements TableModel, MouseListener {

  static Font      font      = new Font("Courier", Font.PLAIN, 10);
  static int       MIN_ROWS  = 30;

  JTable           table     = new JTable(this);
  Vector<Variable> variables = new Vector<Variable>();
  State            state;

  public Variables(State state) {
    super();
    this.state = state;
    table.setFont(font);
    table.getTableHeader().setFont(font);
    table.setBackground(Color.WHITE);
    table.setGridColor(Color.BLACK);
    table.setShowGrid(true);
    table.addMouseListener(this);
    setLayout(new BorderLayout());
    add(new JScrollPane(table), BorderLayout.CENTER);
  }

  public void showVariable(String name, Object value) {
    variables.add(new Variable(name, value));
    table.revalidate();
  }

  public int getRowCount() {
    return Math.max(MIN_ROWS, variables.size());
  }

  public int getColumnCount() {
    return 2;
  }

  public String getColumnName(int columnIndex) {
    switch (columnIndex) {
      case 0:
        return "name";
      case 1:
        return "value:";
      default:
        return "?";
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

  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
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

  public void addTableModelListener(TableModelListener l) {

  }

  public void removeTableModelListener(TableModelListener l) {

  }

  public void clear() {
    variables.clear();
    repaint();
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      int row = table.rowAtPoint(e.getPoint());
      int col = table.columnAtPoint(e.getPoint());
      if (col == 1) {
        Variable v = variables.get(row);
        state.showProperties(v.getValue());
      }
    }
  }

  public void mousePressed(MouseEvent e) {

  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mouseExited(MouseEvent e) {

  }

}
