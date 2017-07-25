package edb.editor;

import javax.swing.JPanel;

public abstract class ClosablePanel extends JPanel implements TabbedActor {

  JPanel contents;

  public ClosablePanel(JPanel contents) {
    super();
    this.contents = contents;
  }

  public JPanel getContents() {
    return contents;
  }

  public void setContents(JPanel contents) {
    this.contents = contents;
  }

}
