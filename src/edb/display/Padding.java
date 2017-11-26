package edb.display;

import java.awt.Graphics;

public class Padding extends Display {

  boolean fill      = false;
  int     padWidth  = -1;
  int     padHeight = -1;

  public Padding() {
  }

  public Padding(boolean fill, int padWidth, int padHeight) {
    this.fill = fill;
    this.padWidth = padWidth;
    this.padHeight = padHeight;
  }

  public void draw(int x, int y, int width, int height, Graphics g) {
    if (fill) {
      if (padWidth != -1) {
        if (padWidth < width) {
          x = x + (width - padWidth) / 2;
          width = padWidth;
        }
      }
      if (padHeight != -1) {
        if (padHeight < height) {
          y = y + ((height - padHeight) / 2);
          height = padHeight;
        }
      }
      g.drawRect(x, y, width, height);
    }
  }

  public int minWidth(Graphics g) {
    if (fill && padWidth != -1)
      return padWidth * 2;
    else return 0;
  }

  public int minHeight(Graphics g) {
    if (fill && padHeight != -1)
      return padHeight * 2;
    else return 0;
  }

  public boolean isPadding() {
    return true;
  }

}
