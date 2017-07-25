package edb.gui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Time extends JPanel {

  JLabel time = new JLabel("0");

  public Time(Font font) {
    super();
    time.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    time.setFont(font);
    add(time);
  }

  public void setTime(int t) {
    time.setText(t+"");
  }

}
