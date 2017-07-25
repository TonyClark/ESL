package edb.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.table.TableModel;

import edb.gui.variables.Variable;
import edb.tool.EDB;
import runtime.actors.Actor;

public class ActorStack extends JPanel implements TableModel, MouseListener {

  static Font      font        = new Font("Courier", Font.PLAIN, 10);
  static int       BUTTON_SIZE = 10;

  JTable           table       = new JTable(this);
  TOS              tos         = new TOS();
  Vector<Variable> variables   = new Vector<Variable>();
  Stack<Integer>   frameStack  = new Stack<Integer>();
  Actor            actor       = null;
  int              frame       = -1;
  EDB              edb;

  public ActorStack(EDB edb) {
    super();
    this.edb = edb;
    table.setFont(font);
    table.getTableHeader().setFont(font);
    table.setBackground(Color.WHITE);
    table.setGridColor(Color.BLACK);
    table.setShowGrid(true);
    table.addMouseListener(this);
    table.setRowSelectionAllowed(false);
    setLayout(new BorderLayout());
    addToolBar();
    add(new JScrollPane(table), BorderLayout.CENTER);
    add(tos, BorderLayout.SOUTH);
  }

  public void addTableModelListener(TableModelListener l) {
  }

  public void addToolBar() {
    JToolBar toolBar = new JToolBar("Property Commands");
    JButton up = new JButton(getImage("icons/up.png", BUTTON_SIZE, BUTTON_SIZE));
    up.setToolTipText("up");
    up.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        up();
      }
    });
    JButton down = new JButton(getImage("icons/down.png", BUTTON_SIZE, BUTTON_SIZE));
    down.setToolTipText("down");
    down.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        down();
      }
    });
    toolBar.add(down);
    toolBar.add(up);
    setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.PAGE_START);
  }

  public void up() {
    if (!frameStack.isEmpty()) {
      frame = frameStack.pop();
      showFrame();
    }
  }

  public void down() {
    if (frame != -1 && actor.getPrevFrame(frame) != -1) {
      frameStack.push(frame);
      frame = actor.getPrevFrame(frame);
      showFrame();
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
        return "name";
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
        edb.showProperties(v.getValue());
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

  public void showStack(Actor actor) {
    this.actor = actor;
    frame = actor.getFrame();
    frameStack.clear();
    showFrame();
    if (!actor.stackEmpty()) tos.showValue(actor.tos());
  }

  private void showFrame() {
    variables.clear();
    if (frame != -1) {
      Vector<Object> f = actor.getFrame(frame);
      Vector<String> n = actor.getFrameNames(frame);
      for (int i = 0; i < f.size(); i++) {
        variables.add(new Variable(n.get(i), f.get(i)));
      }
    }
    table.revalidate();
    table.repaint();
  }

}
