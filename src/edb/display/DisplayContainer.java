package edb.display;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.Vector;

public abstract class DisplayContainer extends Display {

  Vector<Display> elements     = new Vector<Display>();
  int             borderWidth  = 0;
  Color           borderColour = Color.BLACK;
  boolean         fill         = false;
  Color           fillColour   = Color.BLACK;
  boolean         packed       = false;

  public DisplayContainer(Display... displays) {
    super();
    for (Display d : displays)
      add(d);
  }

  public void add(Display d) {
    elements.add(d);
  }

  public int getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(int borderWidth) {
    this.borderWidth = borderWidth;
  }

  public Color getBorderColour() {
    return borderColour;
  }

  public void setBorderColour(Color borderColour) {
    this.borderColour = borderColour;
  }

  public boolean isFill() {
    return fill;
  }

  public void setFill(boolean fill) {
    this.fill = fill;
  }

  public Color getFillColour() {
    return fillColour;
  }

  public void setFillColour(Color fillColour) {
    this.fillColour = fillColour;
  }

  public Vector<Display> getElements() {
    return elements;
  }

  public int getPads() {
    int pads = 0;
    for (Display d : getElements())
      if (d.isPadding()) pads++;
    return pads;
  }

  public int getDisplays() {
    int displays = 0;
    for (Display d : getElements())
      if (!d.isPadding()) displays++;
    return displays;
  }

  public boolean isPacked() {
    return packed;
  }

  public void setPacked(boolean packed) {
    this.packed = packed;
  }

  protected void drawBorder(Graphics g, int x, int y, int width, int height) {
    if (borderWidth > 0) {
      Color c = g.getColor();
      Graphics2D g2 = (Graphics2D) g;
      Stroke s = g2.getStroke();
      g2.setStroke(new BasicStroke(borderWidth));
      g.drawRect(x, y, width, height);
      g2.setColor(c);
      g2.setStroke(s);
    }
  }

}
