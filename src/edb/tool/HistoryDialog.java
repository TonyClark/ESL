package edb.tool;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class HistoryDialog extends JDialog implements ChangeListener, ActionListener {

  JLabel  messageStartVal = new JLabel("");
  JLabel  messageEndVal   = new JLabel("");
  JSlider messageStart    = null;
  JSlider messageEnd      = null;

  JLabel  actorStartVal   = new JLabel("");
  JLabel  actorEndVal     = new JLabel("");
  JSlider actorStart      = null;
  JSlider actorEnd        = null;

  public HistoryDialog(SVG history, int x, int y) {
    super();
    setTitle("Set the start and end times for the history");
    setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    int maxTime = Math.max(history.maxTime(), 50);
    messageStart = new JSlider(JSlider.HORIZONTAL, 0, maxTime, 0);
    messageEnd = new JSlider(JSlider.HORIZONTAL, 0, maxTime, 0);
    actorStart = new JSlider(JSlider.HORIZONTAL, 0, maxTime, 0);
    actorEnd = new JSlider(JSlider.HORIZONTAL, 0, maxTime, 0);

    messageStart.setMajorTickSpacing(maxTime/10);
    messageEnd.setMajorTickSpacing(maxTime/10);
    messageStart.setPaintTicks(true);
    messageEnd.setPaintTicks(true);
    messageStart.setPaintLabels(true);
    messageEnd.setPaintLabels(true);
    messageStart.addChangeListener(this);
    messageEnd.addChangeListener(this);

    actorStart.setMajorTickSpacing(maxTime/10);
    actorEnd.setMajorTickSpacing(maxTime/10);
    actorStart.setPaintTicks(true);
    actorEnd.setPaintTicks(true);
    actorStart.setPaintLabels(true);
    actorEnd.setPaintLabels(true);
    actorStart.addChangeListener(this);
    actorEnd.addChangeListener(this);

    messageStart.setValue(0);
    messageEnd.setValue(maxTime);
    actorStart.setValue(0);
    actorEnd.setValue(maxTime);
    messageStartVal.setText("Message Start = " + 0);
    messageEndVal.setText("Message End = " + maxTime);
    actorStartVal.setText("Actor Start = " + 0);
    actorEndVal.setText("Actor End = " + maxTime);

    Box box = Box.createVerticalBox();
    box.setBorder(new BevelBorder(100));

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2));
    box.add(panel);
    add(box);

    panel.add(messageStartVal);
    panel.add(messageStart);

    panel.add(messageEndVal);
    panel.add(messageEnd);

    panel.add(actorStartVal);
    panel.add(actorStart);

    panel.add(actorEndVal);
    panel.add(actorEnd);

    JButton generate = new JButton("Generate");
    generate.addActionListener(this);
    box.add(generate);

    setLocation(x, y);
    pack();
    setMinimumSize(new Dimension(600, 400));
    setVisible(true);
  }

  public int getMessageStart() {
    return messageStart.getValue();
  }

  public int getMessageEnd() {
    return messageEnd.getValue();
  }

  public int getActorStart() {
    return actorStart.getValue();
  }

  public int getActorEnd() {
    return actorEnd.getValue();
  }

  public void stateChanged(ChangeEvent e) {
    if (e.getSource() == messageStart) {
      messageStartVal.setText("Message Start = " + messageStart.getValue());
      if (messageStart.getValue() > messageEnd.getValue()) {
        messageEnd.setValue(messageStart.getValue());
        messageEndVal.setText("Message End = " + messageEnd.getValue());
      }
    }
    if (e.getSource() == messageEnd) {
      messageEndVal.setText("Message End = " + messageEnd.getValue());
      if (messageEnd.getValue() < messageStart.getValue()) {
        messageStart.setValue(messageEnd.getValue());
        messageStartVal.setText("Message Start = " + messageStart.getValue());
      }
    }
    if (e.getSource() == actorStart) {
      actorStartVal.setText("Actor Start = " + actorStart.getValue());
      if (actorStart.getValue() > actorEnd.getValue()) {
        actorEnd.setValue(actorStart.getValue());
        actorEndVal.setText("Actor End = " + actorEnd.getValue());
      }
    }
    if (e.getSource() == actorEnd) {
      actorEndVal.setText("Actor End = " + actorEnd.getValue());
      if (actorEnd.getValue() < actorStart.getValue()) {
        actorStart.setValue(actorEnd.getValue());
        actorStartVal.setText("Actor Start = " + actorStart.getValue());
      }
    }
  }

  public void actionPerformed(ActionEvent e) {
    dispose();
  }

}
