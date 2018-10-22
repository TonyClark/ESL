package edb.editor.file;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.QuadCurve2D;

import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class BindingPainter implements Highlighter.HighlightPainter {

  private static final Color COLOUR    = Color.red;
  public static final int    FORWARDS  = 0;
  public static final int    BACKWARDS = 1;

  String                     name;
  int                        direction = FORWARDS;

  public int getDirection() {
    return direction;
  }

  public void setDirection(int direction) {
    this.direction = direction;
  }

  public static int getForwards() {
    return FORWARDS;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
    try {
      Rectangle r0 = c.modelToView(direction == FORWARDS ? p0 : p1);
      Rectangle r1 = c.modelToView(direction == FORWARDS ? p1 : p0);
      FontMetrics fm = g.getFontMetrics();
      int height = fm.getHeight();
      int width1 = fm.stringWidth(name);
      int width2 = width1;
      int x0 = r0.x;
      int y0 = r0.y;
      int x1 = r1.x;
      int y1 = r1.y;
      if (y0 < y1) {
        y0 = y0 + height;
        width1 = width1 / 2;
        width2 = width2 / 2;
      } else;
      if (y1 < y0) {
        y1 = y1 + height;
        width1 = width1 / 2;
        width2 = width2 / 2;
      } else if (y0 == y1) {
        y1 = y1 + height;
        y0 = y0 + height;
        width2 = 0;
      }
      drawBindingLink((Graphics2D) g, x0 + width1, y0, x1 + width2, y1);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }

  protected void drawBindingLink(Graphics2D g, int x1, int y1, int x2, int y2) {
    g = (Graphics2D) g.create();
    g.setColor(COLOUR);
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    if (y1 == y2)
      drawCurvedLine(g, x1, x2, y1, 5, 5);
    else drawArrowLine(g, x1, y1, x2, y2, 5, 5);
    g.dispose();
  }

  private void drawCurvedLine(Graphics2D g, int x1, int x2, int y, int d, int h) {
    int x = (x1 < x2) ? x1 : x2;
    int half = Math.abs(x1 - x2) / 2;
    QuadCurve2D.Double curve = new QuadCurve2D.Double(x, y, x + half, y + 50, x + half + half, y);
    g.draw(curve);
  }

  private void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {

    int dx = x2 - x1, dy = y2 - y1;
    double D = Math.sqrt((dx * dx) + (dy * dy));
    double xm = D - d, xn = xm, ym = h, yn = -h, x;
    double sin = dy / D, cos = dx / D;

    x = xm * cos - ym * sin + x1;
    ym = xm * sin + ym * cos + y1;
    xm = x;

    x = xn * cos - yn * sin + x1;
    yn = xn * sin + yn * cos + y1;
    xn = x;

    g.drawLine(x1, y1, x2, y2);
    g.drawLine(x2, y2, (int) xm, (int) ym);
    g.drawLine(x2, y2, (int) xn, (int) yn);
  }
}
