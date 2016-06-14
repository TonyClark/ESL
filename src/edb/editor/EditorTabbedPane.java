package edb.editor;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 * @author 6dc
 *
 *         A class which creates a JTabbedPane and auto sets a close button when you add a tab
 */
public class EditorTabbedPane extends JTabbedPane {

  public EditorTabbedPane() {
    super(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
  }

  /* Override Addtab in order to add the close Button everytime */
  public void addTab(String title, Icon icon, Component component, String tip) {
    super.addTab(title, icon, component, tip);
    int count = this.getTabCount() - 1;
    setTabComponentAt(count, new CloseButtonTab(component, title, icon));
  }

  public void addTab(String title, Icon icon, Component component) {
    addTab(title, icon, component, null);
  }

  public void addTab(String title, Component component) {
    addTab(title, null, component);
  }

  public void addTabNoExit(String title, Icon icon, Component component, String tip) {
    super.addTab(title, icon, component, tip);
  }

  public void addTabNoExit(String title, Icon icon, Component component) {
    addTabNoExit(title, icon, component, null);
  }

  public void addTabNoExit(String title, Component component) {
    addTabNoExit(title, null, component);
  }

  public void clean(String title) {
    int i = indexOfTab(title);
    if (i != -1) {
      CloseButtonTab tab = (CloseButtonTab) getTabComponentAt(i);
      tab.clean();
    }
  }

  public void dirty(String title) {
    int i = indexOfTab(title);
    if (i != -1) {
      CloseButtonTab tab = (CloseButtonTab) getTabComponentAt(i);
      tab.dirty();
    }
  }

  public class CloseButtonTab extends JPanel {

    Component tab;
    JLabel    jLabel;

    public CloseButtonTab(final Component tab, String title, Icon icon) {
      this.tab = tab;
      setOpaque(false);
      FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
      setLayout(flowLayout);
      Font font = new Font("Courier", Font.PLAIN, 10);
      jLabel = new JLabel(title);
      jLabel.setFont(font);
      jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
      jLabel.setIcon(icon);
      add(jLabel);
      // JButton button = new JButton(MetalIconFactory.getInternalFrameCloseIcon(14));
      JButton button = new JButton("x");
      button.setFont(font);
      button.setForeground(Color.RED);
      button.setBorder(BorderFactory.createEmptyBorder());
      button.setBorderPainted(false);
      button.setContentAreaFilled(false);
      button.addMouseListener(new CloseListener(tab));
      button.setRolloverEnabled(true);
      add(button);
    }

    public void clean() {
      String label = jLabel.getText();
      String newLabel = label.substring(1, label.length());
      jLabel.setText(newLabel);
    }

    public void dirty() {
      jLabel.setText("*" + jLabel.getText());
    }
  }

  public class CloseListener implements MouseListener {

    private Component tab;

    public CloseListener(Component tab) {
      this.tab = tab;
    }

    public void mouseClicked(MouseEvent e) {
      if (e.getSource() instanceof JButton) {
        JButton clickedButton = (JButton) e.getSource();
        JTabbedPane tabbedPane = (JTabbedPane) clickedButton.getParent().getParent().getParent();
        int index = tabbedPane.getSelectedIndex();
        Component component = getComponentAt(index);
        if (component instanceof FileEditor) {
          FileEditor editor = (FileEditor) component;
          if (!editor.isDirty()) tabbedPane.remove(tab);
        } else tabbedPane.remove(tab);
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
}