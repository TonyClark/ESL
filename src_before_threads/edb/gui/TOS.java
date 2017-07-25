package edb.gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TOS extends JPanel {

  JLabel value = new JLabel();

  public TOS() {
    JLabel label = new JLabel("TOS");
    setLayout(new BorderLayout());
    add(label, BorderLayout.WEST);
    add(value, BorderLayout.EAST);
  }

  public void showValue(Object v) {
    value.setText(v+"");
    repaint();
  }

}
