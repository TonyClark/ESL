package edb.editor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JToolTip;
import javax.swing.LookAndFeel;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;

public class ScrollableToolTip extends JToolTip implements MouseWheelListener {
  private static final long serialVersionUID = 1L;
  private JTextPane         textPane;

  /** Creates a tool tip. */
    public ScrollableToolTip(final int width, final int height) {
        setPreferredSize(new Dimension(width, height));
        setLayout(new BorderLayout());
        textPane = new JTextPane();
        textPane.setEditable(true);
        textPane.setContentType("text/html");
         
        LookAndFeel.installColorsAndFont(textPane, 
                "ToolTip.background",
                "ToolTip.foreground",
                "ToolTip.font");
            
        JScrollPane scrollpane = new JScrollPane(textPane);
        scrollpane.setBorder(null);
        scrollpane.getViewport().setOpaque(false);
        add(scrollpane);
    }

  @Override
  public void addNotify() {
    super.addNotify();
    JComponent comp = getComponent();
    if (comp != null) {
      comp.addMouseWheelListener(this);
    }
  }

  @Override
  public void removeNotify() {
    JComponent comp = getComponent();
    if (comp != null) {
      comp.removeMouseWheelListener(this);
    }
    super.removeNotify();
  }

  public void mouseWheelMoved(final MouseWheelEvent e) {
    JComponent comp = getComponent();
    if (comp != null) {
      textPane.dispatchEvent(new MouseWheelEvent(textPane, e.getID(), e.getWhen(), e.getModifiers(), 0, 0, e.getClickCount(), e.isPopupTrigger(), e.getScrollType(), e.getScrollAmount(), e.getWheelRotation()));
    }
  }

  @Override
  public void setTipText(final String tipText) {
    String oldValue = this.textPane.getText();
    textPane.setText(tipText);
    textPane.setCaretPosition(0);
    firePropertyChange("tiptext", oldValue, tipText);
  }

  @Override
  public String getTipText() {
    return textPane == null ? "" : textPane.getText();
  }

  @Override
  protected String paramString() {
    String tipTextString = (textPane.getText() != null ? textPane.getText() : "");

    return super.paramString() + ",tipText=" + tipTextString;
  }
}