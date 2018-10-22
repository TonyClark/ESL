package edb.display;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class HBox extends DisplayContainer {

  public HBox(Display... displays) {
    super(displays);
  }

  public HBox(boolean pack, Display... displays) {
    super(displays);
    setPacked(pack);
  }

  public void draw(int x, int y, int width, int height, Graphics g) {
    
    // (x,y) is the top-left origin.
    // (width,height) is the size of the surrounding box.

    int minWidth = minWidth(g);
    int pads = getPads();
    int padding = (pads == 0) ? 0 : width - minWidth;
    int displays = getDisplays();
    int cellWidth = (displays == 0) ? 0 : (width - padding) / displays;
    int x0 = x;
    int y0 = y;

    for (Display d : getElements()) {
      if (d.isPadding()) {
        d.draw(x, y, padding / pads, height, g);
        x += padding / pads;
      } else {
        if (isPacked()) {
          int dminWidth = d.minWidth(g);
          d.draw(x, y, dminWidth, height, g);
          x += dminWidth;
        } else {
          d.draw(x, y, cellWidth, height, g);
          x += cellWidth;
        }
      }
    }
    drawBorder(g,x0,y0,width,height);
  }

  public int minWidth(Graphics g) {
    int minWidth = 0;
    if (isPacked()) {
      for (Display d : getElements())
        minWidth += d.minWidth(g);
      return minWidth;
    } else {
      for (Display d : getElements()) {
        minWidth = Math.max(minWidth, d.minWidth(g));
      }
      return minWidth * getDisplays();
    }
  }

  public int minHeight(Graphics g) {
    int minHeight = 0;
    for (Display d : getElements()) {
      minHeight = Math.max(minHeight, d.minHeight(g));
    }
    return minHeight;
  }

  public String toString() {
    return "HBox(" + getElements() + ")";
  }

}
