package history;

import java.awt.Component;
import java.awt.Font;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class HistoryCellManager implements TableCellRenderer {

  static Font   font   = new Font("Consolas", Font.BOLD, 7);
  Vector<Event> events = null;

  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    String toolTip = "<html>";
    events = (Vector<Event>) table.getValueAt(row, column);
    Box box = new Box(BoxLayout.Y_AXIS);
    for (Event event : events) {
      JLabel label = new JLabel(event.pprint());
      toolTip = toolTip + event.pprint() + "<br>";
      label.setFont(font);
      box.add(label);
    }
    toolTip = toolTip + "</html>";
    box.setToolTipText(toolTip);
    return box;
  }

}
