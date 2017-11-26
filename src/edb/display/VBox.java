package edb.display;

import java.awt.Graphics;

public class VBox extends DisplayContainer {

  public VBox(Display... displays) {
    super(displays);
  }

  public VBox(boolean pack, Display... displays) {
    super(displays);
    setPacked(pack);
  }

  public void draw(int x, int y, int width, int height, Graphics g) {

    // (x,y) is the top-left origin.
    // (width,height) is the size of the surrounding box.

    int minHeight = minHeight(g);
    int pads = getPads();
    int padding = (pads == 0) ? 0 : height - minHeight;
    int displays = getDisplays();
    int cellHeight = (displays == 0) ? 0 : (height - padding) / displays;
    int x0 = x;
    int y0 = y;

    for (Display d : getElements()) {
      if (d.isPadding()) {
        d.draw(x, y, width, padding / pads, g);
        y += padding / pads;
      } else {
        if (isPacked()) {
          d.draw(x, y, width, d.minHeight(g), g);
          y += d.minHeight(g);
        } else {
          d.draw(x, y, width, cellHeight, g);
          y += cellHeight;
        }
      }
    }
    drawBorder(g, x0, y0, width, height);
  }

  public int minHeight(Graphics g) {
    int minHeight = 0;
    if (isPacked()) {
      for (Display d : getElements())
        minHeight += d.minHeight(g);
      return minHeight;
    } else {
      for (Display d : getElements()) {
        minHeight = Math.max(minHeight, d.minHeight(g));
      }
      return minHeight * getDisplays();
    }
  }

  public int minWidth(Graphics g) {
    int minWidth = 0;
    for (Display d : getElements()) {
      minWidth = Math.max(minWidth, d.minWidth(g));
    }
    return minWidth;
  }

  public String toString() {
    return "VBox(" + getElements() + ")";
  }

}
