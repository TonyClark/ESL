package edb.editor;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EditorTabbedPane extends JTabbedPane implements ChangeListener {

  static final Color NO_ERROR_COLOUR = Color.BLACK;
  static final Color ERROR_COLOUR    = Color.RED;

  public EditorTabbedPane() {
    super(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
    addChangeListener(this);
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
      setBackground(NO_ERROR_COLOUR);
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

    public void hasError(boolean error) {
      if (error)
        jLabel.setForeground(ERROR_COLOUR);
      else jLabel.setForeground(NO_ERROR_COLOUR);
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
        if (component instanceof TabbedActor) {
          TabbedActor closable = (TabbedActor) component;
          tabbedPane.remove(tab);
          closable.close();
        } else if (component instanceof FileEditor) {
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

  public void stateChanged(ChangeEvent changeEvent) {
    JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
    int index = sourceTabbedPane.getSelectedIndex();
    for (int i = 0; i < getTabCount(); i++) {
      if (i != index) {
        Component component = getComponentAt(i);
        if (component instanceof TabbedActor) {
          TabbedActor tabbedActor = (TabbedActor) component;
          tabbedActor.deselect();
        }
      }
    }
    if (getSelectedComponent() instanceof TabbedActor) {
      TabbedActor tabbedActor = (TabbedActor) getSelectedComponent();
      tabbedActor.select();
    }
  }
}